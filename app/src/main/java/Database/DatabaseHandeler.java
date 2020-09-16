package Database;



import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.ours.thecanteen.user_information;
import com.ours.thecanteen.food_info;
import com.ours.thecanteen.user_information;

public class DatabaseHandeler extends SQLiteOpenHelper{



    public DatabaseHandeler(Context context) {
        super(context,"user_info",null,1);
        // TODO Auto-generated constructor stub
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        //Log.v("db created", "yes");


        String sql= "CREATE TABLE IF NOT EXISTS user_info (name TEXT PRIMARY KEY," +
                "semester TEXT"+
                ", year TEXT"+
                ", mobile TEXT"+
                ", password TEXT)";
        db.execSQL(sql);


        db.execSQL(sql);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void addContact(user_information user_information)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO user_info(name,semester,year,mobile,password)" +
                "VALUES('"+user_information.getName()+"','"+user_information.getSemester()+"','"+user_information.getYear()+"','"+user_information.getMobile_number()+"','"+user_information.getPassword()+"')";


        db.execSQL(query);



        db.close();

    }


    public user_information getSingleContact(String name)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] Gname = new String[]{ name };

        String query = "SELECT name,semester,year,mobile,password FROM user_info WHERE name = ?" ;
        Cursor cursor = db.rawQuery(query, Gname);
        user_information myinfo = null;
        if(cursor.moveToFirst())
        {

            myinfo=new user_information(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4));
        }

        return myinfo;
    }



}
