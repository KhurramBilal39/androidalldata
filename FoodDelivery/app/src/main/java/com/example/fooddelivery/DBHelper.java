package com.example.fooddelivery;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.fooddelivery.Models.OrderModels;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    final static String DBNAME = "mydatabase.db";
    final static int DBVERSION = 1;
    public DBHelper(@Nullable Context context) {
        super(context,  DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table orders"+
                        "(id integer primary key autoincrement,"+
                        "name text,"+
                        "phone text,"+
                        "price int,"+
                        "image int,"+
                        "quantity int,"+
                        "description text,"+
                        "foodname text)"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("DROP table if exists orders");
    onCreate(sqLiteDatabase);

    }
   public boolean insertOrder(String name,String phone,int image,int price,String foodName,String desc,int quantity)
    {
    SQLiteDatabase database = getReadableDatabase();
        ContentValues values =  new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("image",image);
        values.put("description",desc);
        values.put("quantity",quantity);
        values.put("foodName",foodName);
        long id = database.insert("orders",null,values);
        if (id<=0){
            return false;
        }
        else {
        return true;
        }
    }
    public ArrayList<OrderModels> getOrders(){
        ArrayList<OrderModels> orders = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery("Select * from orders",null);
        if (cursor.moveToFirst()){
            while (cursor.moveToNext()){
                OrderModels models = new OrderModels();

            }
        }
    }


}