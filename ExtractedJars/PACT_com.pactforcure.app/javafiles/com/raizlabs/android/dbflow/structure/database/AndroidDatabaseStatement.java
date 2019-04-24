// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseStatement

public class AndroidDatabaseStatement
	implements DatabaseStatement
{

	AndroidDatabaseStatement(SQLiteStatement sqlitestatement, SQLiteDatabase sqlitedatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		statement = sqlitestatement;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field SQLiteStatement statement>
		database = sqlitedatabase;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field SQLiteDatabase database>
	//    8   14:return          
	}

	public static AndroidDatabaseStatement from(SQLiteStatement sqlitestatement, SQLiteDatabase sqlitedatabase)
	{
		return new AndroidDatabaseStatement(sqlitestatement, sqlitedatabase);
	//    0    0:new             #2   <Class AndroidDatabaseStatement>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #24  <Method void AndroidDatabaseStatement(SQLiteStatement, SQLiteDatabase)>
	//    5    9:areturn         
	}

	public void bindBlob(int i, byte abyte0[])
	{
		statement.bindBlob(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #30  <Method void SQLiteStatement.bindBlob(int, byte[])>
	//    5    9:return          
	}

	public void bindDouble(int i, double d)
	{
		statement.bindDouble(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #34  <Method void SQLiteStatement.bindDouble(int, double)>
	//    5    9:return          
	}

	public void bindLong(int i, long l)
	{
		statement.bindLong(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #38  <Method void SQLiteStatement.bindLong(int, long)>
	//    5    9:return          
	}

	public void bindNull(int i)
	{
		statement.bindNull(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #42  <Method void SQLiteStatement.bindNull(int)>
	//    4    8:return          
	}

	public void bindString(int i, String s)
	{
		statement.bindString(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #46  <Method void SQLiteStatement.bindString(int, String)>
	//    5    9:return          
	}

	public void close()
	{
		statement.close();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:invokevirtual   #49  <Method void SQLiteStatement.close()>
	//    3    7:return          
	}

	public void execute()
	{
		statement.execute();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:invokevirtual   #52  <Method void SQLiteStatement.execute()>
	//    3    7:return          
	}

	public long executeInsert()
	{
		return statement.executeInsert();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:invokevirtual   #56  <Method long SQLiteStatement.executeInsert()>
	//    3    7:lreturn         
	}

	public long executeUpdateDelete()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		if(android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
	//    2    2:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    5:bipush          11
	//    4    7:icmplt          21
_L1:
		l1 = statement.executeUpdateDelete();
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field SQLiteStatement statement>
	//    7   14:invokevirtual   #68  <Method int SQLiteStatement.executeUpdateDelete()>
	//    8   17:i2l             
	//    9   18:lstore_3        
_L3:
		return l1;
	//   10   19:lload_3         
	//   11   20:lreturn         
_L2:
		Cursor cursor;
		Object obj;
		statement.execute();
	//   12   21:aload_0         
	//   13   22:getfield        #17  <Field SQLiteStatement statement>
	//   14   25:invokevirtual   #52  <Method void SQLiteStatement.execute()>
		obj = null;
	//   15   28:aconst_null     
	//   16   29:astore          6
		cursor = null;
	//   17   31:aconst_null     
	//   18   32:astore          5
		Cursor cursor1 = database.rawQuery("SELECT changes() AS affected_row_count", ((String []) (null)));
	//   19   34:aload_0         
	//   20   35:getfield        #19  <Field SQLiteDatabase database>
	//   21   38:ldc1            #70  <String "SELECT changes() AS affected_row_count">
	//   22   40:aconst_null     
	//   23   41:invokevirtual   #76  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   24   44:astore          7
		long l;
		l = l1;
	//   25   46:lload_3         
	//   26   47:lstore_1        
		if(cursor1 == null)
			break MISSING_BLOCK_LABEL_118;
	//   27   48:aload           7
	//   28   50:ifnull          118
		l = l1;
	//   29   53:lload_3         
	//   30   54:lstore_1        
		cursor = cursor1;
	//   31   55:aload           7
	//   32   57:astore          5
		obj = ((Object) (cursor1));
	//   33   59:aload           7
	//   34   61:astore          6
		if(cursor1.getCount() <= 0)
			break MISSING_BLOCK_LABEL_118;
	//   35   63:aload           7
	//   36   65:invokeinterface #81  <Method int Cursor.getCount()>
	//   37   70:ifle            118
		l = l1;
	//   38   73:lload_3         
	//   39   74:lstore_1        
		cursor = cursor1;
	//   40   75:aload           7
	//   41   77:astore          5
		obj = ((Object) (cursor1));
	//   42   79:aload           7
	//   43   81:astore          6
		if(!cursor1.moveToFirst())
			break MISSING_BLOCK_LABEL_118;
	//   44   83:aload           7
	//   45   85:invokeinterface #85  <Method boolean Cursor.moveToFirst()>
	//   46   90:ifeq            118
		cursor = cursor1;
	//   47   93:aload           7
	//   48   95:astore          5
		obj = ((Object) (cursor1));
	//   49   97:aload           7
	//   50   99:astore          6
		l = cursor1.getLong(cursor1.getColumnIndex("affected_row_count"));
	//   51  101:aload           7
	//   52  103:aload           7
	//   53  105:ldc1            #87  <String "affected_row_count">
	//   54  107:invokeinterface #91  <Method int Cursor.getColumnIndex(String)>
	//   55  112:invokeinterface #95  <Method long Cursor.getLong(int)>
	//   56  117:lstore_1        
		l1 = l;
	//   57  118:lload_1         
	//   58  119:lstore_3        
		if(cursor1 != null)
	//*  59  120:aload           7
	//*  60  122:ifnull          19
		{
			cursor1.close();
	//   61  125:aload           7
	//   62  127:invokeinterface #96  <Method void Cursor.close()>
			return l;
	//   63  132:lload_1         
	//   64  133:lreturn         
		}
		  goto _L3
		obj;
	//   65  134:astore          6
		if(cursor == null) goto _L3; else goto _L4
	//   66  136:aload           5
	//   67  138:ifnull          19
_L4:
		cursor.close();
	//   68  141:aload           5
	//   69  143:invokeinterface #96  <Method void Cursor.close()>
		return 0L;
	//   70  148:lconst_0        
	//   71  149:lreturn         
		Exception exception;
		exception;
	//   72  150:astore          5
		if(obj != null)
	//*  73  152:aload           6
	//*  74  154:ifnull          164
			((Cursor) (obj)).close();
	//   75  157:aload           6
	//   76  159:invokeinterface #96  <Method void Cursor.close()>
		throw exception;
	//   77  164:aload           5
	//   78  166:athrow          
	}

	public SQLiteStatement getStatement()
	{
		return statement;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:areturn         
	}

	public long simpleQueryForLong()
	{
		return statement.simpleQueryForLong();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:invokevirtual   #101 <Method long SQLiteStatement.simpleQueryForLong()>
	//    3    7:lreturn         
	}

	public String simpleQueryForString()
	{
		return statement.simpleQueryForString();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SQLiteStatement statement>
	//    2    4:invokevirtual   #105 <Method String SQLiteStatement.simpleQueryForString()>
	//    3    7:areturn         
	}

	private final SQLiteDatabase database;
	private final SQLiteStatement statement;
}
