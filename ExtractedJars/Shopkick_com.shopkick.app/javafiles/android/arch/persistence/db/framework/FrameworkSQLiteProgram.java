// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteProgram;
import android.database.sqlite.SQLiteProgram;

class FrameworkSQLiteProgram
	implements SupportSQLiteProgram
{

	FrameworkSQLiteProgram(SQLiteProgram sqliteprogram)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mDelegate = sqliteprogram;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SQLiteProgram mDelegate>
	//    5    9:return          
	}

	public void bindBlob(int i, byte abyte0[])
	{
		mDelegate.bindBlob(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #22  <Method void SQLiteProgram.bindBlob(int, byte[])>
	//    5    9:return          
	}

	public void bindDouble(int i, double d)
	{
		mDelegate.bindDouble(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #26  <Method void SQLiteProgram.bindDouble(int, double)>
	//    5    9:return          
	}

	public void bindLong(int i, long l)
	{
		mDelegate.bindLong(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #30  <Method void SQLiteProgram.bindLong(int, long)>
	//    5    9:return          
	}

	public void bindNull(int i)
	{
		mDelegate.bindNull(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #34  <Method void SQLiteProgram.bindNull(int)>
	//    4    8:return          
	}

	public void bindString(int i, String s)
	{
		mDelegate.bindString(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void SQLiteProgram.bindString(int, String)>
	//    5    9:return          
	}

	public void clearBindings()
	{
		mDelegate.clearBindings();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:invokevirtual   #41  <Method void SQLiteProgram.clearBindings()>
	//    3    7:return          
	}

	public void close()
	{
		mDelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteProgram mDelegate>
	//    2    4:invokevirtual   #44  <Method void SQLiteProgram.close()>
	//    3    7:return          
	}

	private final SQLiteProgram mDelegate;
}
