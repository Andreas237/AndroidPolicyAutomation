// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteOpenHelper, SupportSQLiteDatabase

public static abstract class SupportSQLiteOpenHelper$Callback
{

	private void deleteDatabaseFile(String s)
	{
		if(s.equalsIgnoreCase(":memory:"))
			break MISSING_BLOCK_LABEL_140;
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <String ":memory:">
	//    2    3:invokevirtual   #29  <Method boolean String.equalsIgnoreCase(String)>
	//    3    6:ifne            140
		if(s.trim().length() == 0)
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #33  <Method String String.trim()>
	//*   6   13:invokevirtual   #37  <Method int String.length()>
	//*   7   16:ifne            20
			return;
	//    8   19:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    9   20:new             #39  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #40  <Method void StringBuilder()>
	//   12   27:astore_2        
		stringbuilder.append("deleting the database file: ");
	//   13   28:aload_2         
	//   14   29:ldc1            #42  <String "deleting the database file: ">
	//   15   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(s);
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		Log.w("SupportSQLite", stringbuilder.toString());
	//   21   41:ldc1            #48  <String "SupportSQLite">
	//   22   43:aload_2         
	//   23   44:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #57  <Method int Log.w(String, String)>
	//   25   50:pop             
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  26   51:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   54:bipush          16
	//*  28   56:icmplt          72
		{
			SQLiteDatabase.deleteDatabase(new File(s));
	//   29   59:new             #64  <Class File>
	//   30   62:dup             
	//   31   63:aload_1         
	//   32   64:invokespecial   #66  <Method void File(String)>
	//   33   67:invokestatic    #72  <Method boolean SQLiteDatabase.deleteDatabase(File)>
	//   34   70:pop             
			return;
	//   35   71:return          
		}
		try
		{
			if(!(new File(s)).delete())
	//*  36   72:new             #64  <Class File>
	//*  37   75:dup             
	//*  38   76:aload_1         
	//*  39   77:invokespecial   #66  <Method void File(String)>
	//*  40   80:invokevirtual   #76  <Method boolean File.delete()>
	//*  41   83:ifne            139
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   42   86:new             #39  <Class StringBuilder>
	//   43   89:dup             
	//   44   90:invokespecial   #40  <Method void StringBuilder()>
	//   45   93:astore_2        
				stringbuilder1.append("Could not delete the database file ");
	//   46   94:aload_2         
	//   47   95:ldc1            #78  <String "Could not delete the database file ">
	//   48   97:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
				stringbuilder1.append(s);
	//   50  101:aload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
				Log.e("SupportSQLite", stringbuilder1.toString());
	//   54  107:ldc1            #48  <String "SupportSQLite">
	//   55  109:aload_2         
	//   56  110:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   57  113:invokestatic    #81  <Method int Log.e(String, String)>
	//   58  116:pop             
				return;
	//   59  117:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  60  118:astore_1        
		{
			try
			{
				Log.e("SupportSQLite", "error while deleting corrupted database file", ((Throwable) (s)));
	//   61  119:ldc1            #48  <String "SupportSQLite">
	//   62  121:ldc1            #83  <String "error while deleting corrupted database file">
	//   63  123:aload_1         
	//   64  124:invokestatic    #86  <Method int Log.e(String, String, Throwable)>
	//   65  127:pop             
				return;
	//   66  128:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  67  129:astore_1        
			{
				Log.w("SupportSQLite", "delete failed: ", ((Throwable) (s)));
	//   68  130:ldc1            #48  <String "SupportSQLite">
	//   69  132:ldc1            #88  <String "delete failed: ">
	//   70  134:aload_1         
	//   71  135:invokestatic    #90  <Method int Log.w(String, String, Throwable)>
	//   72  138:pop             
			}
		}
		return;
	//   73  139:return          
	//   74  140:return          
	}

	public void onConfigure(SupportSQLiteDatabase supportsqlitedatabase)
	{
	//    0    0:return          
	}

	public void onCorruption(SupportSQLiteDatabase supportsqlitedatabase)
	{
		Object obj;
		Object obj1;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("Corruption reported by sqlite on database: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #99  <String "Corruption reported by sqlite on database: ">
	//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(supportsqlitedatabase.getPath());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokeinterface #104 <Method String SupportSQLiteDatabase.getPath()>
	//   11   22:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		Log.e("SupportSQLite", ((StringBuilder) (obj)).toString());
	//   13   26:ldc1            #48  <String "SupportSQLite">
	//   14   28:aload_2         
	//   15   29:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   16   32:invokestatic    #81  <Method int Log.e(String, String)>
	//   17   35:pop             
		if(!supportsqlitedatabase.isOpen())
	//*  18   36:aload_1         
	//*  19   37:invokeinterface #107 <Method boolean SupportSQLiteDatabase.isOpen()>
	//*  20   42:ifne            56
		{
			deleteDatabaseFile(supportsqlitedatabase.getPath());
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokeinterface #104 <Method String SupportSQLiteDatabase.getPath()>
	//   24   52:invokespecial   #109 <Method void deleteDatabaseFile(String)>
			return;
	//   25   55:return          
		}
		obj = null;
	//   26   56:aconst_null     
	//   27   57:astore_2        
		obj1 = null;
	//   28   58:aconst_null     
	//   29   59:astore_3        
		List list = supportsqlitedatabase.getAttachedDbs();
	//   30   60:aload_1         
	//   31   61:invokeinterface #113 <Method List SupportSQLiteDatabase.getAttachedDbs()>
	//   32   66:astore          4
		obj = ((Object) (list));
	//   33   68:aload           4
	//   34   70:astore_2        
		  goto _L1
	//*  35   71:goto            78
		obj;
	//   36   74:astore_2        
		  goto _L2
	//*  37   75:goto            89
_L1:
		obj1 = obj;
	//   38   78:aload_2         
	//   39   79:astore_3        
		break MISSING_BLOCK_LABEL_80;
	//*  40   80:aload_1         
	//*  41   81:invokeinterface #116 <Method void SupportSQLiteDatabase.close()>
	//*  42   86:goto            143
_L2:
		if(obj1 != null)
	//*  43   89:aload_3         
	//*  44   90:ifnull          131
			for(supportsqlitedatabase = ((SupportSQLiteDatabase) (((List) (obj1)).iterator())); ((Iterator) (supportsqlitedatabase)).hasNext(); deleteDatabaseFile((String)((Pair)((Iterator) (supportsqlitedatabase)).next()).second));
	//   45   93:aload_3         
	//   46   94:invokeinterface #122 <Method Iterator List.iterator()>
	//   47   99:astore_1        
	//   48  100:aload_1         
	//   49  101:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   50  106:ifeq            141
	//   51  109:aload_0         
	//   52  110:aload_1         
	//   53  111:invokeinterface #131 <Method Object Iterator.next()>
	//   54  116:checkcast       #133 <Class Pair>
	//   55  119:getfield        #137 <Field Object Pair.second>
	//   56  122:checkcast       #25  <Class String>
	//   57  125:invokespecial   #109 <Method void deleteDatabaseFile(String)>
		else
	//*  58  128:goto            100
			deleteDatabaseFile(supportsqlitedatabase.getPath());
	//   59  131:aload_0         
	//   60  132:aload_1         
	//   61  133:invokeinterface #104 <Method String SupportSQLiteDatabase.getPath()>
	//   62  138:invokespecial   #109 <Method void deleteDatabaseFile(String)>
		throw obj;
	//   63  141:aload_2         
	//   64  142:athrow          
		SQLiteException sqliteexception;
		try
		{
			supportsqlitedatabase.close();
		}
	//*  65  143:aload_2         
	//*  66  144:ifnull          185
	//*  67  147:aload_2         
	//*  68  148:invokeinterface #122 <Method Iterator List.iterator()>
	//*  69  153:astore_1        
	//*  70  154:aload_1         
	//*  71  155:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  72  160:ifeq            195
	//*  73  163:aload_0         
	//*  74  164:aload_1         
	//*  75  165:invokeinterface #131 <Method Object Iterator.next()>
	//*  76  170:checkcast       #133 <Class Pair>
	//*  77  173:getfield        #137 <Field Object Pair.second>
	//*  78  176:checkcast       #25  <Class String>
	//*  79  179:invokespecial   #109 <Method void deleteDatabaseFile(String)>
	//*  80  182:goto            154
	//*  81  185:aload_0         
	//*  82  186:aload_1         
	//*  83  187:invokeinterface #104 <Method String SupportSQLiteDatabase.getPath()>
	//*  84  192:invokespecial   #109 <Method void deleteDatabaseFile(String)>
	//*  85  195:return          
	//*  86  196:astore_3        
	//*  87  197:goto            78
		catch(IOException ioexception) { }
	//   88  200:astore_3        
		if(obj != null)
			for(supportsqlitedatabase = ((SupportSQLiteDatabase) (((List) (obj)).iterator())); ((Iterator) (supportsqlitedatabase)).hasNext(); deleteDatabaseFile((String)((Pair)((Iterator) (supportsqlitedatabase)).next()).second));
		else
			deleteDatabaseFile(supportsqlitedatabase.getPath());
		return;
		sqliteexception;
		if(true) goto _L1; else goto _L3
_L3:
	//*  89  201:goto            143
	}

	public abstract void onCreate(SupportSQLiteDatabase supportsqlitedatabase);

	public void onDowngrade(SupportSQLiteDatabase supportsqlitedatabase, int i, int j)
	{
		supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (supportsqlitedatabase)).append("Can't downgrade database from version ");
	//    4    8:aload_1         
	//    5    9:ldc1            #142 <String "Can't downgrade database from version ">
	//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (supportsqlitedatabase)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #145 <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (supportsqlitedatabase)).append(" to ");
	//   12   21:aload_1         
	//   13   22:ldc1            #147 <String " to ">
	//   14   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (supportsqlitedatabase)).append(j);
	//   16   28:aload_1         
	//   17   29:iload_3         
	//   18   30:invokevirtual   #145 <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
		throw new SQLiteException(((StringBuilder) (supportsqlitedatabase)).toString());
	//   20   34:new             #95  <Class SQLiteException>
	//   21   37:dup             
	//   22   38:aload_1         
	//   23   39:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #148 <Method void SQLiteException(String)>
	//   25   45:athrow          
	}

	public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
	{
	//    0    0:return          
	}

	public abstract void onUpgrade(SupportSQLiteDatabase supportsqlitedatabase, int i, int j);

	public final int version;

	public SupportSQLiteOpenHelper$Callback(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		version = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int version>
	//    5    9:return          
	}
}
