package de.die.dudes.quoteinator.database;

import android.database.Cursor;

import java.util.ArrayList;

import de.die.dudes.quoteinator.model.Docent;
import de.die.dudes.quoteinator.model.Module;
import de.die.dudes.quoteinator.model.Quotation;

public interface IDatabase {

    //public ArrayList<Docent> getDocents();

    public Cursor getDocentsCursor();

    public Docent getDocent(int id);

    public boolean addDocent(Docent docent);

    public boolean removeDocent(int id);

    public boolean updateDocent(int id, Docent docent);

   // public ArrayList<Module> getModules();

    public Cursor getModulesCursor();

    public Module getModule(int id);

    public boolean addModule(Module module);

    public boolean removeModule(int id);

    public boolean updateModule(int id, Module module);

    //public ArrayList<Quotation> getQuotations();

    public Cursor getQuotationsCursor();

    public Quotation getQuotation(int id);

    public boolean addQuotation(Quotation quote);

    public boolean removeQuotation(int id);

    public boolean updateQuotation(int id, Quotation quote);

   // public ArrayList<Quotation> getQuotationsByModule(int id);

    public Cursor getQuotationsCursorByModule(int id);

   // public ArrayList<Quotation> getQuotationsByDocent(int id);

    public Cursor getQuotationsCursorByDocent(int id);

}