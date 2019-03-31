/*
package com.example.favorites;

import android.content.Context;
import android.view.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AnimalsFileHelper {

    public static final String animals_file_name = "listinfo.dat";

    public static void writeData(ArrayList<String>animalsList, View.OnClickListener context) {

        try{

            //FileOutputStream fos = context.openFileOutput(animals_file_name, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animalsList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static ArrayList<String>readData(Context context){
        ArrayList<String>itemsList = null;
        try{
            FileInputStream fis = context.openFileInput(animals_file_name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            itemsList = new ArrayList<>();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemsList;
    }
}
*/
