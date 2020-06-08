package com.touch.notes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance = null;
    private static List<Note> mNotes = new ArrayList<>();

    /**
     * a singleton class
     */
    public static DataManager getInstance(){
        if(instance == null){
            instance = new DataManager();
            initializeAllNotes();
        }
        return instance;
    }

    private DataManager(){

    }

    private static void initializeAllNotes() {
        //populate the ids array
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            ids.add(i + 1);
        }
        // populate the text array
        String[] texts = new String[ids.size()];
        texts[0] = "I love my life";
        texts[1] = "I love my life";
        texts[2] = "I love my life";
        texts[3] = "I love my life";
        texts[4] = "I love my life";
        texts[5] = "I love my life";
        texts[6] = "I love my life";
        texts[7] = "I love my life";
        texts[8] = "I love my life";
        texts[9] = "I love my life";
        texts[10] = "I love my life";
        texts[11] = "I love my life";
        texts[12] = "I love my life";
        texts[13] = "I love my life";
        texts[14] = "I love my life";
        texts[15] = "I love my life";
        texts[16] = "I love my life";
        texts[17] = "I love my life";
        texts[18] = "I love my life";
        texts[19] = "I love my life";

        //populate the category array
        List<Note.Category> categories = new ArrayList<>();
        categories.add(Note.Category.PERSONAL);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.STUDY);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.UNCATEGORIZED);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.WORK);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);
        categories.add(Note.Category.FAMILY_AFFAIR);

        //populate the timestamp array
        TimeStamp[] timeStamps = new TimeStamp[ids.size()];
        for(int i = 0; i < ids.size(); i++){
            int hour = 9;
            int minute = 0;
            timeStamps[i] = new TimeStamp(Integer.toString(hour) + ":"
                    + Integer.toString(minute + i), "06/06/30");
        }

        //form the notes
        for(int i = 0; i < ids.size(); i++){
            mNotes.add(new Note(Integer.toString(ids.get(i)), texts[i],
                    categories.get(i), timeStamps[i]));
        }

    }

    /**
     * create a new note
     * @return
     */

    public int createNewNote(int id){
        Note note = new Note(Integer.toString(id), null, null, null);
        mNotes.add(note);
        return mNotes.size() - 1; // the index of this newly added note
    }

    public Note findNote(int id){
        for (Note item : mNotes){
            if(id == Integer.parseInt(item.getID())){
                return item;
            }
        }
        return null;
    }

    public void remoteNote(int id){
        for(Note item : mNotes){
            if(id == Integer.parseInt(item.getID())){
                mNotes.remove(id - 1);
            }
        }
    }

    public void removeAllNotes(){
        mNotes.clear();
    }

    public Note getNote(int id){
       for(Note item : mNotes){
           if(id == Integer.parseInt(item.getID())){
               return item;
           }
       }
       return null;
    }

    public List<Note> getAllNotes(){
        return mNotes;
    }

}
