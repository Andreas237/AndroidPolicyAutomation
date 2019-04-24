// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package o:
//			dcz

public class dci extends SQLiteOpenHelper
{

	private dci(Context context)
	{
		super(context, "HwCPBackupDatas.db", ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #17  <String "HwCPBackupDatas.db">
	//    3    4:aconst_null     
	//    4    5:iconst_1        
	//    5    6:invokespecial   #20  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    6    9:return          
	}

	public static dci a(Context context)
	{
		byte abyte0[] = c;
	//    0    0:getstatic       #12  <Field byte[] c>
	//    1    3:astore_1        
		abyte0;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(d == null)
	//*   4    6:getstatic       #24  <Field dci d>
	//*   5    9:ifnonnull       23
			d = new dci(context);
	//    6   12:new             #2   <Class dci>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #26  <Method void dci(Context)>
	//   10   20:putstatic       #24  <Field dci d>
		context = ((Context) (d));
	//   11   23:getstatic       #24  <Field dci d>
	//   12   26:astore_0        
		abyte0;
	//   13   27:aload_1         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return ((dci) (context));
	//   15   29:aload_0         
	//   16   30:areturn         
		context;
	//   17   31:astore_0        
	//*  18   32:aload_1         
		throw context;
	//   19   33:monitorexit     
	//   20   34:aload_0         
	//   21   35:athrow          
	}

	public SQLiteDatabase a()
	{
		return getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method SQLiteDatabase getWritableDatabase()>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		byte abyte0[] = c;
	//    0    0:getstatic       #12  <Field byte[] c>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		SQLiteDatabase sqlitedatabase = d.a();
	//    4    6:getstatic       #24  <Field dci d>
	//    5    9:invokevirtual   #33  <Method SQLiteDatabase a()>
	//    6   12:astore_3        
		if(sqlitedatabase == null)
			break MISSING_BLOCK_LABEL_25;
	//    7   13:aload_3         
	//    8   14:ifnull          25
		sqlitedatabase.execSQL(dcz.a(s));
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:invokestatic    #38  <Method String dcz.a(String)>
	//   12   22:invokevirtual   #43  <Method void SQLiteDatabase.execSQL(String)>
		abyte0;
	//   13   25:aload_2         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		s;
	//   16   28:astore_1        
	//*  17   29:aload_2         
		throw s;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
	//    0    0:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
	//    0    0:return          
	}

	private static byte c[] = new byte[1];
	private static dci d;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #12  <Field byte[] c>
	//*   3    6:return          
	}
}
