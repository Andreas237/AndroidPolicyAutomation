// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package o:
//			hk, gq

public final class hh extends SQLiteOpenHelper
{

	public hh(Context context)
	{
		super(context, "msp.db", ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #11  <String "msp.db">
	//    3    4:aconst_null     
	//    4    5:iconst_1        
	//    5    6:invokespecial   #14  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
		a = new WeakReference(((Object) (context)));
	//    6    9:aload_0         
	//    7   10:new             #16  <Class WeakReference>
	//    8   13:dup             
	//    9   14:aload_1         
	//   10   15:invokespecial   #19  <Method void WeakReference(Object)>
	//   11   18:putfield        #21  <Field WeakReference a>
	//   12   21:return          
	}

	private static boolean b(SQLiteDatabase sqlitedatabase, String s, String s1)
	{
		int i;
		boolean flag;
		SQLiteDatabase sqlitedatabase1;
		SQLiteDatabase sqlitedatabase2;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		sqlitedatabase2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          7
		sqlitedatabase1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          6
		s = ((String) (sqlitedatabase.rawQuery("select count(*) from tb_tid where name=?", new String[] {
			e(s, s1)
		})));
	//    8   11:aload_0         
	//    9   12:ldc1            #28  <String "select count(*) from tb_tid where name=?">
	//   10   14:iconst_1        
	//   11   15:anewarray       String[]
	//   12   18:dup             
	//   13   19:iconst_0        
	//   14   20:aload_1         
	//   15   21:aload_2         
	//   16   22:invokestatic    #34  <Method String e(String, String)>
	//   17   25:aastore         
	//   18   26:invokevirtual   #40  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   19   29:astore_1        
		sqlitedatabase = ((SQLiteDatabase) (s));
	//   20   30:aload_1         
	//   21   31:astore_0        
		sqlitedatabase1 = sqlitedatabase;
	//   22   32:aload_0         
	//   23   33:astore          6
		sqlitedatabase2 = sqlitedatabase;
	//   24   35:aload_0         
	//   25   36:astore          7
		if(!((Cursor) (s)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
	//   26   38:aload_1         
	//   27   39:invokeinterface #46  <Method boolean Cursor.moveToFirst()>
	//   28   44:ifeq            61
		sqlitedatabase1 = sqlitedatabase;
	//   29   47:aload_0         
	//   30   48:astore          6
		sqlitedatabase2 = sqlitedatabase;
	//   31   50:aload_0         
	//   32   51:astore          7
		i = ((Cursor) (sqlitedatabase)).getInt(0);
	//   33   53:aload_0         
	//   34   54:iconst_0        
	//   35   55:invokeinterface #50  <Method int Cursor.getInt(int)>
	//   36   60:istore_3        
		int j;
		j = i;
	//   37   61:iload_3         
	//   38   62:istore          4
		if(sqlitedatabase != null)
	//*  39   64:aload_0         
	//*  40   65:ifnull          118
		{
			((Cursor) (sqlitedatabase)).close();
	//   41   68:aload_0         
	//   42   69:invokeinterface #54  <Method void Cursor.close()>
			j = i;
	//   43   74:iload_3         
	//   44   75:istore          4
		}
		  goto _L1
	//*  45   77:goto            118
_L3:
		j = ((int) (flag));
	//   46   80:iload           5
	//   47   82:istore          4
		if(sqlitedatabase2 != null)
	//*  48   84:aload           7
	//*  49   86:ifnull          118
		{
			((Cursor) (sqlitedatabase2)).close();
	//   50   89:aload           7
	//   51   91:invokeinterface #54  <Method void Cursor.close()>
			j = ((int) (flag));
	//   52   96:iload           5
	//   53   98:istore          4
		}
		  goto _L1
	//*  54  100:goto            118
		sqlitedatabase;
	//   55  103:astore_0        
		if(sqlitedatabase1 != null)
	//*  56  104:aload           6
	//*  57  106:ifnull          116
			((Cursor) (sqlitedatabase1)).close();
	//   58  109:aload           6
	//   59  111:invokeinterface #54  <Method void Cursor.close()>
		throw sqlitedatabase;
	//   60  116:aload_0         
	//   61  117:athrow          
_L1:
		return j > 0;
	//   62  118:iload           4
	//   63  120:ifle            125
	//   64  123:iconst_1        
	//   65  124:ireturn         
	//   66  125:iconst_0        
	//   67  126:ireturn         
		sqlitedatabase;
	//   68  127:astore_0        
		if(true) goto _L3; else goto _L2
_L2:
	//*  69  128:goto            80
	}

	static void d(SQLiteDatabase sqlitedatabase, String s)
	{
		try
		{
			sqlitedatabase.delete("tb_tid", "name=?", new String[] {
				s
			});
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "tb_tid">
	//    2    3:ldc1            #60  <String "name=?">
	//    3    5:iconst_1        
	//    4    6:anewarray       String[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:invokevirtual   #64  <Method int SQLiteDatabase.delete(String, String, String[])>
	//   10   16:pop             
			return;
	//   11   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(SQLiteDatabase sqlitedatabase)
	//*  12   18:astore_0        
		{
			return;
	//   13   19:return          
		}
	}

	static String e(String s, String s1)
	{
		return (new StringBuilder()).append(s).append(s1).toString();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:invokevirtual   #76  <Method String StringBuilder.toString()>
	//    8   18:areturn         
	}

	final void a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, String s3)
	{
		sqlitedatabase.execSQL("update tb_tid set tid=?, key_tid=?, dt=datetime('now', 'localtime') where name=?", new Object[] {
			gq.a(1, s2, hk.c((Context)a.get())), s3, e(s, s1)
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #79  <String "update tb_tid set tid=?, key_tid=?, dt=datetime('now', 'localtime') where name=?">
	//    2    3:iconst_3        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iconst_1        
	//    7   10:aload           4
	//    8   12:aload_0         
	//    9   13:getfield        #21  <Field WeakReference a>
	//   10   16:invokevirtual   #85  <Method Object WeakReference.get()>
	//   11   19:checkcast       #87  <Class Context>
	//   12   22:invokestatic    #93  <Method String hk.c(Context)>
	//   13   25:invokestatic    #98  <Method String gq.a(int, String, String)>
	//   14   28:aastore         
	//   15   29:dup             
	//   16   30:iconst_1        
	//   17   31:aload           5
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_2        
	//   21   36:aload_2         
	//   22   37:aload_3         
	//   23   38:invokestatic    #34  <Method String e(String, String)>
	//   24   41:aastore         
	//   25   42:invokevirtual   #102 <Method void SQLiteDatabase.execSQL(String, Object[])>
	//   26   45:return          
	}

	public final void a(String s, String s1, String s2, String s3)
	{
		SQLiteDatabase sqlitedatabase1;
		SQLiteDatabase sqlitedatabase2;
		sqlitedatabase2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		sqlitedatabase1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		SQLiteDatabase sqlitedatabase3 = getWritableDatabase();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #107 <Method SQLiteDatabase getWritableDatabase()>
	//    6   10:astore          11
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = sqlitedatabase3;
	//    7   12:aload           11
	//    8   14:astore          8
		sqlitedatabase1 = sqlitedatabase;
	//    9   16:aload           8
	//   10   18:astore          9
		sqlitedatabase2 = sqlitedatabase;
	//   11   20:aload           8
	//   12   22:astore          10
		if(!b(sqlitedatabase3, s, s1))
			break MISSING_BLOCK_LABEL_56;
	//   13   24:aload           11
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokestatic    #109 <Method boolean b(SQLiteDatabase, String, String)>
	//   17   31:ifeq            56
		sqlitedatabase1 = sqlitedatabase;
	//   18   34:aload           8
	//   19   36:astore          9
		sqlitedatabase2 = sqlitedatabase;
	//   20   38:aload           8
	//   21   40:astore          10
		int i;
		int j;
		int k;
		try
		{
			a(sqlitedatabase, s, s1, s2, s3);
	//   22   42:aload_0         
	//   23   43:aload           8
	//   24   45:aload_1         
	//   25   46:aload_2         
	//   26   47:aload_3         
	//   27   48:aload           4
	//   28   50:invokevirtual   #111 <Method void a(SQLiteDatabase, String, String, String, String)>
			break MISSING_BLOCK_LABEL_346;
	//   29   53:goto            346
		}
	//*  30   56:aload           8
	//*  31   58:astore          9
	//*  32   60:aload           8
	//*  33   62:astore          10
	//*  34   64:iconst_1        
	//*  35   65:aload_3         
	//*  36   66:aload_0         
	//*  37   67:getfield        #21  <Field WeakReference a>
	//*  38   70:invokevirtual   #85  <Method Object WeakReference.get()>
	//*  39   73:checkcast       #87  <Class Context>
	//*  40   76:invokestatic    #93  <Method String hk.c(Context)>
	//*  41   79:invokestatic    #98  <Method String gq.a(int, String, String)>
	//*  42   82:astore_3        
	//*  43   83:aload           8
	//*  44   85:astore          9
	//*  45   87:aload           8
	//*  46   89:astore          10
	//*  47   91:aload           8
	//*  48   93:ldc1            #113 <String "insert into tb_tid (name, tid, key_tid, dt) values (?, ?, ?, datetime('now', 'localtime'))">
	//*  49   95:iconst_3        
	//*  50   96:anewarray       Object[]
	//*  51   99:dup             
	//*  52  100:iconst_0        
	//*  53  101:aload_1         
	//*  54  102:aload_2         
	//*  55  103:invokestatic    #34  <Method String e(String, String)>
	//*  56  106:aastore         
	//*  57  107:dup             
	//*  58  108:iconst_1        
	//*  59  109:aload_3         
	//*  60  110:aastore         
	//*  61  111:dup             
	//*  62  112:iconst_2        
	//*  63  113:aload           4
	//*  64  115:aastore         
	//*  65  116:invokevirtual   #102 <Method void SQLiteDatabase.execSQL(String, Object[])>
	//*  66  119:iconst_0        
	//*  67  120:istore          5
	//*  68  122:aload           8
	//*  69  124:astore          9
	//*  70  126:aload           8
	//*  71  128:astore          10
	//*  72  130:aload           8
	//*  73  132:ldc1            #115 <String "select name from tb_tid where tid!='' order by dt asc">
	//*  74  134:aconst_null     
	//*  75  135:invokevirtual   #40  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//*  76  138:astore_1        
	//*  77  139:aload           8
	//*  78  141:astore          9
	//*  79  143:aload           8
	//*  80  145:astore          10
	//*  81  147:aload_1         
	//*  82  148:invokeinterface #119 <Method int Cursor.getCount()>
	//*  83  153:bipush          14
	//*  84  155:icmpgt          175
	//*  85  158:aload           8
	//*  86  160:astore          9
	//*  87  162:aload           8
	//*  88  164:astore          10
	//*  89  166:aload_1         
	//*  90  167:invokeinterface #54  <Method void Cursor.close()>
	//*  91  172:goto            346
	//*  92  175:aload           8
	//*  93  177:astore          9
	//*  94  179:aload           8
	//*  95  181:astore          10
	//*  96  183:aload_1         
	//*  97  184:invokeinterface #119 <Method int Cursor.getCount()>
	//*  98  189:bipush          14
	//*  99  191:isub            
	//* 100  192:istore          7
	//* 101  194:aload           8
	//* 102  196:astore          9
	//* 103  198:aload           8
	//* 104  200:astore          10
	//* 105  202:iload           7
	//* 106  204:anewarray       String[]
	//* 107  207:astore_2        
	//* 108  208:aload           8
	//* 109  210:astore          9
	//* 110  212:aload           8
	//* 111  214:astore          10
	//* 112  216:aload_1         
	//* 113  217:invokeinterface #46  <Method boolean Cursor.moveToFirst()>
	//* 114  222:ifeq            278
	//* 115  225:aload           8
	//* 116  227:astore          9
	//* 117  229:aload           8
	//* 118  231:astore          10
	//* 119  233:aload_2         
	//* 120  234:iload           5
	//* 121  236:aload_1         
	//* 122  237:iconst_0        
	//* 123  238:invokeinterface #123 <Method String Cursor.getString(int)>
	//* 124  243:aastore         
	//* 125  244:iload           5
	//* 126  246:iconst_1        
	//* 127  247:iadd            
	//* 128  248:istore          6
	//* 129  250:aload           8
	//* 130  252:astore          9
	//* 131  254:aload           8
	//* 132  256:astore          10
	//* 133  258:aload_1         
	//* 134  259:invokeinterface #126 <Method boolean Cursor.moveToNext()>
	//* 135  264:ifeq            278
	//* 136  267:iload           6
	//* 137  269:istore          5
	//* 138  271:iload           7
	//* 139  273:iload           6
	//* 140  275:icmpgt          225
	//* 141  278:aload           8
	//* 142  280:astore          9
	//* 143  282:aload           8
	//* 144  284:astore          10
	//* 145  286:aload_1         
	//* 146  287:invokeinterface #54  <Method void Cursor.close()>
	//* 147  292:iconst_0        
	//* 148  293:istore          5
	//* 149  295:iload           5
	//* 150  297:iload           7
	//* 151  299:icmpge          346
	//* 152  302:aload           8
	//* 153  304:astore          9
	//* 154  306:aload           8
	//* 155  308:astore          10
	//* 156  310:aload_2         
	//* 157  311:iload           5
	//* 158  313:aaload          
	//* 159  314:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 160  317:ifne            337
	//* 161  320:aload           8
	//* 162  322:astore          9
	//* 163  324:aload           8
	//* 164  326:astore          10
	//* 165  328:aload           8
	//* 166  330:aload_2         
	//* 167  331:iload           5
	//* 168  333:aaload          
	//* 169  334:invokestatic    #134 <Method void d(SQLiteDatabase, String)>
	//* 170  337:iload           5
	//* 171  339:iconst_1        
	//* 172  340:iadd            
	//* 173  341:istore          5
	//* 174  343:goto            295
	//* 175  346:aload           8
	//* 176  348:ifnull          405
	//* 177  351:aload           8
	//* 178  353:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//* 179  356:ifeq            405
	//* 180  359:aload           8
	//* 181  361:invokevirtual   #138 <Method void SQLiteDatabase.close()>
	//* 182  364:return          
	//* 183  365:aload           10
	//* 184  367:ifnull          405
	//* 185  370:aload           10
	//* 186  372:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//* 187  375:ifeq            405
	//* 188  378:aload           10
	//* 189  380:invokevirtual   #138 <Method void SQLiteDatabase.close()>
	//* 190  383:return          
	//* 191  384:astore_1        
	//* 192  385:aload           9
	//* 193  387:ifnull          403
	//* 194  390:aload           9
	//* 195  392:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//* 196  395:ifeq            403
	//* 197  398:aload           9
	//* 198  400:invokevirtual   #138 <Method void SQLiteDatabase.close()>
	//* 199  403:aload_1         
	//* 200  404:athrow          
	//* 201  405:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			if(sqlitedatabase2 != null && sqlitedatabase2.isOpen())
			{
				sqlitedatabase2.close();
				return;
			}
		}
		break MISSING_BLOCK_LABEL_405;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		s2 = gq.a(1, s2, hk.c((Context)a.get()));
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		sqlitedatabase.execSQL("insert into tb_tid (name, tid, key_tid, dt) values (?, ?, ?, datetime('now', 'localtime'))", new Object[] {
			e(s, s1), s2, s3
		});
		i = 0;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		s = ((String) (sqlitedatabase.rawQuery("select name from tb_tid where tid!='' order by dt asc", ((String []) (null)))));
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		if(((Cursor) (s)).getCount() > 14)
			break MISSING_BLOCK_LABEL_175;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		((Cursor) (s)).close();
		break MISSING_BLOCK_LABEL_346;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		k = ((Cursor) (s)).getCount() - 14;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		s1 = ((String) (new String[k]));
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		if(!((Cursor) (s)).moveToFirst()) goto _L2; else goto _L1
_L1:
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		s1[i] = ((/*<invalid signature>*/java.lang.Object) (((Cursor) (s)).getString(0)));
		j = i + 1;
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		if(!((Cursor) (s)).moveToNext())
			break; /* Loop/switch isn't completed */
		i = j;
		if(k > j) goto _L1; else goto _L2
_L2:
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		((Cursor) (s)).close();
		i = 0;
_L5:
		if(i >= k) goto _L4; else goto _L3
_L3:
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		if(TextUtils.isEmpty(((CharSequence) (s1[i]))))
			continue; /* Loop/switch isn't completed */
		sqlitedatabase1 = sqlitedatabase;
		sqlitedatabase2 = sqlitedatabase;
		d(sqlitedatabase, ((String) (s1[i])));
		i++;
		  goto _L5
_L4:
		if(sqlitedatabase != null && sqlitedatabase.isOpen())
		{
			sqlitedatabase.close();
			return;
		}
		break MISSING_BLOCK_LABEL_405;
		s;
		if(sqlitedatabase1 != null && sqlitedatabase1.isOpen())
			sqlitedatabase1.close();
		throw s;
	//* 202  406:astore_1        
	//* 203  407:goto            365
	}

	public final String b(String s, String s1)
	{
		SQLiteDatabase sqlitedatabase1;
		String s2;
		SQLiteDatabase sqlitedatabase2;
		String s3;
		Object obj;
		Object obj1;
		Cursor cursor;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		sqlitedatabase2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		sqlitedatabase1 = null;
	//    6    9:aconst_null     
	//    7   10:astore          4
		obj2 = null;
	//    8   12:aconst_null     
	//    9   13:astore          11
		cursor = null;
	//   10   15:aconst_null     
	//   11   16:astore          10
		s2 = ((String) (cursor));
	//   12   18:aload           10
	//   13   20:astore          5
		s3 = ((String) (obj2));
	//   14   22:aload           11
	//   15   24:astore          7
		SQLiteDatabase sqlitedatabase3 = getReadableDatabase();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #141 <Method SQLiteDatabase getReadableDatabase()>
	//   18   30:astore          12
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = sqlitedatabase3;
	//   19   32:aload           12
	//   20   34:astore_3        
		sqlitedatabase1 = sqlitedatabase;
	//   21   35:aload_3         
	//   22   36:astore          4
		s2 = ((String) (cursor));
	//   23   38:aload           10
	//   24   40:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   25   42:aload_3         
	//   26   43:astore          6
		s3 = ((String) (obj2));
	//   27   45:aload           11
	//   28   47:astore          7
		cursor = sqlitedatabase3.rawQuery("select tid from tb_tid where name=?", new String[] {
			e(s, s1)
		});
	//   29   49:aload           12
	//   30   51:ldc1            #143 <String "select tid from tb_tid where name=?">
	//   31   53:iconst_1        
	//   32   54:anewarray       String[]
	//   33   57:dup             
	//   34   58:iconst_0        
	//   35   59:aload_1         
	//   36   60:aload_2         
	//   37   61:invokestatic    #34  <Method String e(String, String)>
	//   38   64:aastore         
	//   39   65:invokevirtual   #40  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   40   68:astore          10
		s = ((String) (cursor));
	//   41   70:aload           10
	//   42   72:astore_1        
		s1 = ((String) (obj1));
	//   43   73:aload           9
	//   44   75:astore_2        
		sqlitedatabase1 = sqlitedatabase;
	//   45   76:aload_3         
	//   46   77:astore          4
		s2 = s;
	//   47   79:aload_1         
	//   48   80:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   49   82:aload_3         
	//   50   83:astore          6
		s3 = s;
	//   51   85:aload_1         
	//   52   86:astore          7
		if(!cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_118;
	//   53   88:aload           10
	//   54   90:invokeinterface #46  <Method boolean Cursor.moveToFirst()>
	//   55   95:ifeq            118
		sqlitedatabase1 = sqlitedatabase;
	//   56   98:aload_3         
	//   57   99:astore          4
		s2 = s;
	//   58  101:aload_1         
	//   59  102:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   60  104:aload_3         
	//   61  105:astore          6
		s3 = s;
	//   62  107:aload_1         
	//   63  108:astore          7
		s1 = ((Cursor) (s)).getString(0);
	//   64  110:aload_1         
	//   65  111:iconst_0        
	//   66  112:invokeinterface #123 <Method String Cursor.getString(int)>
	//   67  117:astore_2        
		if(s != null)
	//*  68  118:aload_1         
	//*  69  119:ifnull          128
			((Cursor) (s)).close();
	//   70  122:aload_1         
	//   71  123:invokeinterface #54  <Method void Cursor.close()>
		s = s1;
	//   72  128:aload_2         
	//   73  129:astore_1        
		if(sqlitedatabase != null)
	//*  74  130:aload_3         
	//*  75  131:ifnull          227
		{
			s = s1;
	//   76  134:aload_2         
	//   77  135:astore_1        
			if(sqlitedatabase.isOpen())
	//*  78  136:aload_3         
	//*  79  137:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//*  80  140:ifeq            227
			{
				sqlitedatabase.close();
	//   81  143:aload_3         
	//   82  144:invokevirtual   #138 <Method void SQLiteDatabase.close()>
				s = s1;
	//   83  147:aload_2         
	//   84  148:astore_1        
			}
		}
		  goto _L1
	//*  85  149:goto            227
_L3:
		if(s3 != null)
	//*  86  152:aload           7
	//*  87  154:ifnull          164
			((Cursor) (s3)).close();
	//   88  157:aload           7
	//   89  159:invokeinterface #54  <Method void Cursor.close()>
		s = ((String) (obj));
	//   90  164:aload           8
	//   91  166:astore_1        
		if(sqlitedatabase2 != null)
	//*  92  167:aload           6
	//*  93  169:ifnull          227
		{
			s = ((String) (obj));
	//   94  172:aload           8
	//   95  174:astore_1        
			if(sqlitedatabase2.isOpen())
	//*  96  175:aload           6
	//*  97  177:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//*  98  180:ifeq            227
			{
				sqlitedatabase2.close();
	//   99  183:aload           6
	//  100  185:invokevirtual   #138 <Method void SQLiteDatabase.close()>
				s = ((String) (obj));
	//  101  188:aload           8
	//  102  190:astore_1        
			}
		}
		  goto _L1
	//* 103  191:goto            227
		s;
	//  104  194:astore_1        
		if(s2 != null)
	//* 105  195:aload           5
	//* 106  197:ifnull          207
			((Cursor) (s2)).close();
	//  107  200:aload           5
	//  108  202:invokeinterface #54  <Method void Cursor.close()>
		if(sqlitedatabase1 != null && sqlitedatabase1.isOpen())
	//* 109  207:aload           4
	//* 110  209:ifnull          225
	//* 111  212:aload           4
	//* 112  214:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//* 113  217:ifeq            225
			sqlitedatabase1.close();
	//  114  220:aload           4
	//  115  222:invokevirtual   #138 <Method void SQLiteDatabase.close()>
		throw s;
	//  116  225:aload_1         
	//  117  226:athrow          
_L1:
		s1 = s;
	//  118  227:aload_1         
	//  119  228:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//* 120  229:aload_1         
	//* 121  230:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 122  233:ifne            255
			s1 = gq.a(2, s, hk.c((Context)a.get()));
	//  123  236:iconst_2        
	//  124  237:aload_1         
	//  125  238:aload_0         
	//  126  239:getfield        #21  <Field WeakReference a>
	//  127  242:invokevirtual   #85  <Method Object WeakReference.get()>
	//  128  245:checkcast       #87  <Class Context>
	//  129  248:invokestatic    #93  <Method String hk.c(Context)>
	//  130  251:invokestatic    #98  <Method String gq.a(int, String, String)>
	//  131  254:astore_2        
		return s1;
	//  132  255:aload_2         
	//  133  256:areturn         
		s;
	//  134  257:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//* 135  258:goto            152
	}

	public final String d(String s, String s1)
	{
		SQLiteDatabase sqlitedatabase1;
		String s2;
		SQLiteDatabase sqlitedatabase2;
		String s3;
		Object obj;
		Object obj1;
		Cursor cursor;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		sqlitedatabase2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		sqlitedatabase1 = null;
	//    6    9:aconst_null     
	//    7   10:astore          4
		obj2 = null;
	//    8   12:aconst_null     
	//    9   13:astore          11
		cursor = null;
	//   10   15:aconst_null     
	//   11   16:astore          10
		s2 = ((String) (cursor));
	//   12   18:aload           10
	//   13   20:astore          5
		s3 = ((String) (obj2));
	//   14   22:aload           11
	//   15   24:astore          7
		SQLiteDatabase sqlitedatabase3 = getReadableDatabase();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #141 <Method SQLiteDatabase getReadableDatabase()>
	//   18   30:astore          12
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = sqlitedatabase3;
	//   19   32:aload           12
	//   20   34:astore_3        
		sqlitedatabase1 = sqlitedatabase;
	//   21   35:aload_3         
	//   22   36:astore          4
		s2 = ((String) (cursor));
	//   23   38:aload           10
	//   24   40:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   25   42:aload_3         
	//   26   43:astore          6
		s3 = ((String) (obj2));
	//   27   45:aload           11
	//   28   47:astore          7
		cursor = sqlitedatabase3.rawQuery("select key_tid from tb_tid where name=?", new String[] {
			e(s, s1)
		});
	//   29   49:aload           12
	//   30   51:ldc1            #145 <String "select key_tid from tb_tid where name=?">
	//   31   53:iconst_1        
	//   32   54:anewarray       String[]
	//   33   57:dup             
	//   34   58:iconst_0        
	//   35   59:aload_1         
	//   36   60:aload_2         
	//   37   61:invokestatic    #34  <Method String e(String, String)>
	//   38   64:aastore         
	//   39   65:invokevirtual   #40  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   40   68:astore          10
		s = ((String) (cursor));
	//   41   70:aload           10
	//   42   72:astore_1        
		s1 = ((String) (obj1));
	//   43   73:aload           9
	//   44   75:astore_2        
		sqlitedatabase1 = sqlitedatabase;
	//   45   76:aload_3         
	//   46   77:astore          4
		s2 = s;
	//   47   79:aload_1         
	//   48   80:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   49   82:aload_3         
	//   50   83:astore          6
		s3 = s;
	//   51   85:aload_1         
	//   52   86:astore          7
		if(!cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_118;
	//   53   88:aload           10
	//   54   90:invokeinterface #46  <Method boolean Cursor.moveToFirst()>
	//   55   95:ifeq            118
		sqlitedatabase1 = sqlitedatabase;
	//   56   98:aload_3         
	//   57   99:astore          4
		s2 = s;
	//   58  101:aload_1         
	//   59  102:astore          5
		sqlitedatabase2 = sqlitedatabase;
	//   60  104:aload_3         
	//   61  105:astore          6
		s3 = s;
	//   62  107:aload_1         
	//   63  108:astore          7
		s1 = ((Cursor) (s)).getString(0);
	//   64  110:aload_1         
	//   65  111:iconst_0        
	//   66  112:invokeinterface #123 <Method String Cursor.getString(int)>
	//   67  117:astore_2        
		if(s != null)
	//*  68  118:aload_1         
	//*  69  119:ifnull          128
			((Cursor) (s)).close();
	//   70  122:aload_1         
	//   71  123:invokeinterface #54  <Method void Cursor.close()>
		s = s1;
	//   72  128:aload_2         
	//   73  129:astore_1        
		if(sqlitedatabase != null)
	//*  74  130:aload_3         
	//*  75  131:ifnull          220
		{
			s = s1;
	//   76  134:aload_2         
	//   77  135:astore_1        
			if(sqlitedatabase.isOpen())
	//*  78  136:aload_3         
	//*  79  137:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//*  80  140:ifeq            220
			{
				sqlitedatabase.close();
	//   81  143:aload_3         
	//   82  144:invokevirtual   #138 <Method void SQLiteDatabase.close()>
				return s1;
	//   83  147:aload_2         
	//   84  148:areturn         
			}
		}
		  goto _L1
_L3:
		if(s3 != null)
	//*  85  149:aload           7
	//*  86  151:ifnull          161
			((Cursor) (s3)).close();
	//   87  154:aload           7
	//   88  156:invokeinterface #54  <Method void Cursor.close()>
		s = ((String) (obj));
	//   89  161:aload           8
	//   90  163:astore_1        
		if(sqlitedatabase2 != null)
	//*  91  164:aload           6
	//*  92  166:ifnull          220
		{
			s = ((String) (obj));
	//   93  169:aload           8
	//   94  171:astore_1        
			if(sqlitedatabase2.isOpen())
	//*  95  172:aload           6
	//*  96  174:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//*  97  177:ifeq            220
			{
				sqlitedatabase2.close();
	//   98  180:aload           6
	//   99  182:invokevirtual   #138 <Method void SQLiteDatabase.close()>
				return null;
	//  100  185:aconst_null     
	//  101  186:areturn         
			}
		}
		  goto _L1
		s;
	//  102  187:astore_1        
		if(s2 != null)
	//* 103  188:aload           5
	//* 104  190:ifnull          200
			((Cursor) (s2)).close();
	//  105  193:aload           5
	//  106  195:invokeinterface #54  <Method void Cursor.close()>
		if(sqlitedatabase1 != null && sqlitedatabase1.isOpen())
	//* 107  200:aload           4
	//* 108  202:ifnull          218
	//* 109  205:aload           4
	//* 110  207:invokevirtual   #137 <Method boolean SQLiteDatabase.isOpen()>
	//* 111  210:ifeq            218
			sqlitedatabase1.close();
	//  112  213:aload           4
	//  113  215:invokevirtual   #138 <Method void SQLiteDatabase.close()>
		throw s;
	//  114  218:aload_1         
	//  115  219:athrow          
_L1:
		return s;
	//  116  220:aload_1         
	//  117  221:areturn         
		s;
	//  118  222:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//* 119  223:goto            149
	}

	public final void onCreate(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase.execSQL("create table if not exists tb_tid (name text primary key, tid text, key_tid text, dt datetime);");
	//    0    0:aload_1         
	//    1    1:ldc1            #149 <String "create table if not exists tb_tid (name text primary key, tid text, key_tid text, dt datetime);">
	//    2    3:invokevirtual   #152 <Method void SQLiteDatabase.execSQL(String)>
	//    3    6:return          
	}

	public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		sqlitedatabase.execSQL("drop table if exists tb_tid");
	//    0    0:aload_1         
	//    1    1:ldc1            #156 <String "drop table if exists tb_tid">
	//    2    3:invokevirtual   #152 <Method void SQLiteDatabase.execSQL(String)>
		onCreate(sqlitedatabase);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #158 <Method void onCreate(SQLiteDatabase)>
	//    6   11:return          
	}

	private WeakReference a;
}
