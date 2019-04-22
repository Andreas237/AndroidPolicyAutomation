// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.stable.zzk;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.util:
//			CollectionUtils

public final class DbUtils
{

	private DbUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void clearDatabase(SQLiteDatabase sqlitedatabase)
	{
		zza(sqlitedatabase, "table", new String[] {
			"sqlite_sequence", "android_metadata"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "table">
	//    2    3:iconst_2        
	//    3    4:anewarray       String[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #18  <String "sqlite_sequence">
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #20  <String "android_metadata">
	//   11   16:aastore         
	//   12   17:invokestatic    #24  <Method void zza(SQLiteDatabase, String, String[])>
		zza(sqlitedatabase, "trigger", new String[0]);
	//   13   20:aload_0         
	//   14   21:ldc1            #26  <String "trigger">
	//   15   23:iconst_0        
	//   16   24:anewarray       String[]
	//   17   27:invokestatic    #24  <Method void zza(SQLiteDatabase, String, String[])>
		zza(sqlitedatabase, "view", new String[0]);
	//   18   30:aload_0         
	//   19   31:ldc1            #28  <String "view">
	//   20   33:iconst_0        
	//   21   34:anewarray       String[]
	//   22   37:invokestatic    #24  <Method void zza(SQLiteDatabase, String, String[])>
	//   23   40:return          
	}

	public static long countCurrentRowBytes(Cursor cursor)
	{
		return countCurrentRowBytes(cursor, Charset.forName("UTF-8"));
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "UTF-8">
	//    2    3:invokestatic    #38  <Method Charset Charset.forName(String)>
	//    3    6:invokestatic    #41  <Method long countCurrentRowBytes(Cursor, Charset)>
	//    4    9:lreturn         
	}

	public static long countCurrentRowBytes(Cursor cursor, Charset charset)
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
label0:
		do
		{
label1:
			{
				long l1;
label2:
				{
label3:
					{
						if(i >= cursor.getColumnCount())
							break label0;
	//    4    5:iload_2         
	//    5    6:aload_0         
	//    6    7:invokeinterface #47  <Method int Cursor.getColumnCount()>
	//    7   12:icmpge          110
						int j;
						switch(cursor.getType(i))
	//*   8   15:aload_0         
	//*   9   16:iload_2         
	//*  10   17:invokeinterface #51  <Method int Cursor.getType(int)>
						{
	//*  11   22:tableswitch     0 4: default 56
	//	               0 91
	//	               1 91
	//	               2 91
	//	               3 71
	//	               4 59
						default:
							break label1;
	//   12   56:goto            103

						case 0: // '\0'
						case 1: // '\001'
						case 2: // '\002'
							break label3;

						case 4: // '\004'
							j = cursor.getBlob(i).length;
	//   13   59:aload_0         
	//   14   60:iload_2         
	//   15   61:invokeinterface #55  <Method byte[] Cursor.getBlob(int)>
	//   16   66:arraylength     
	//   17   67:istore_3        
							break;
	//   18   68:goto            84

						case 3: // '\003'
							j = cursor.getString(i).getBytes(charset).length;
	//   19   71:aload_0         
	//   20   72:iload_2         
	//   21   73:invokeinterface #59  <Method String Cursor.getString(int)>
	//   22   78:aload_1         
	//   23   79:invokevirtual   #63  <Method byte[] String.getBytes(Charset)>
	//   24   82:arraylength     
	//   25   83:istore_3        
							break;
						}
						l1 = j;
	//   26   84:iload_3         
	//   27   85:i2l             
	//   28   86:lstore          6
						break label2;
	//   29   88:goto            96
					}
					l1 = 4L;
	//   30   91:ldc2w           #64  <Long 4L>
	//   31   94:lstore          6
				}
				l += l1;
	//   32   96:lload           4
	//   33   98:lload           6
	//   34  100:ladd            
	//   35  101:lstore          4
			}
			i++;
	//   36  103:iload_2         
	//   37  104:iconst_1        
	//   38  105:iadd            
	//   39  106:istore_2        
		} while(true);
	//   40  107:goto            5
		return l;
	//   41  110:lload           4
	//   42  112:lreturn         
	}

	public static long getDatabaseSize(Context context, String s)
	{
		context = ((Context) (context.getDatabasePath(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method File Context.getDatabasePath(String)>
	//    3    5:astore_0        
		if(context == null) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:ifnull          56
_L1:
		long l = ((File) (context)).length();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #81  <Method long File.length()>
	//    8   14:lstore_2        
		return l;
	//    9   15:lload_2         
	//   10   16:lreturn         
_L4:
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   11   17:aload_1         
	//   12   18:invokestatic    #85  <Method String String.valueOf(Object)>
	//   13   21:astore_0        
		if(((String) (context)).length() != 0)
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #87  <Method int String.length()>
	//*  16   26:ifeq            39
			context = ((Context) ("Failed to get db size for ".concat(((String) (context)))));
	//   17   29:ldc1            #89  <String "Failed to get db size for ">
	//   18   31:aload_0         
	//   19   32:invokevirtual   #93  <Method String String.concat(String)>
	//   20   35:astore_0        
		else
	//*  21   36:goto            49
			context = ((Context) (new String("Failed to get db size for ")));
	//   22   39:new             #16  <Class String>
	//   23   42:dup             
	//   24   43:ldc1            #89  <String "Failed to get db size for ">
	//   25   45:invokespecial   #96  <Method void String(String)>
	//   26   48:astore_0        
		Log.w("DbUtils", ((String) (context)));
	//   27   49:ldc1            #98  <String "DbUtils">
	//   28   51:aload_0         
	//   29   52:invokestatic    #104 <Method int Log.w(String, String)>
	//   30   55:pop             
_L2:
		return 0L;
	//   31   56:lconst_0        
	//   32   57:lreturn         
		context;
	//   33   58:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  34   59:goto            17
	}

	public static Integer getIntegerFromCursor(Cursor cursor, int i)
	{
		return getIntegerFromCursor(cursor, i, ((Integer) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #110 <Method Integer getIntegerFromCursor(Cursor, int, Integer)>
	//    4    6:areturn         
	}

	public static Integer getIntegerFromCursor(Cursor cursor, int i, Integer integer)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            27
		{
			if(cursor.isNull(i))
	//*   2    4:aload_0         
	//*   3    5:iload_1         
	//*   4    6:invokeinterface #115 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return integer;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return Integer.valueOf(cursor.getInt(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #118 <Method int Cursor.getInt(int)>
	//   11   23:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   12   26:areturn         
		} else
		{
			return integer;
	//   13   27:aload_2         
	//   14   28:areturn         
		}
	}

	public static Long getLongFromCursor(Cursor cursor, int i)
	{
		return getLongFromCursor(cursor, i, ((Long) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #129 <Method Long getLongFromCursor(Cursor, int, Long)>
	//    4    6:areturn         
	}

	public static Long getLongFromCursor(Cursor cursor, int i, Long long1)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            27
		{
			if(cursor.isNull(i))
	//*   2    4:aload_0         
	//*   3    5:iload_1         
	//*   4    6:invokeinterface #115 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return long1;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return Long.valueOf(cursor.getLong(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #133 <Method long Cursor.getLong(int)>
	//   11   23:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   12   26:areturn         
		} else
		{
			return long1;
	//   13   27:aload_2         
	//   14   28:areturn         
		}
	}

	public static String getStringFromCursor(Cursor cursor, int i)
	{
		return getStringFromCursor(cursor, i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #143 <Method String getStringFromCursor(Cursor, int, String)>
	//    4    6:areturn         
	}

	public static String getStringFromCursor(Cursor cursor, int i, String s)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            24
		{
			if(cursor.isNull(i))
	//*   2    4:aload_0         
	//*   3    5:iload_1         
	//*   4    6:invokeinterface #115 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return s;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return cursor.getString(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #59  <Method String Cursor.getString(int)>
	//   11   23:areturn         
		} else
		{
			return s;
	//   12   24:aload_2         
	//   13   25:areturn         
		}
	}

	public static void putIntegerIntoContentValues(ContentValues contentvalues, String s, Integer integer)
	{
		if(integer != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
		{
			contentvalues.put(s, integer);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #151 <Method void ContentValues.put(String, Integer)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #154 <Method void ContentValues.putNull(String)>
			return;
	//   10   16:return          
		}
	}

	public static void putLongIntoContentValues(ContentValues contentvalues, String s, Long long1)
	{
		if(long1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
		{
			contentvalues.put(s, long1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #159 <Method void ContentValues.put(String, Long)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #154 <Method void ContentValues.putNull(String)>
			return;
	//   10   16:return          
		}
	}

	public static void putStringIntoContentValues(ContentValues contentvalues, String s, String s1)
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
		{
			contentvalues.put(s, s1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #164 <Method void ContentValues.put(String, String)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #154 <Method void ContentValues.putNull(String)>
			return;
	//   10   16:return          
		}
	}

	private static transient void zza(SQLiteDatabase sqlitedatabase, String s, String as[])
	{
		Object obj;
		SQLiteDatabase sqlitedatabase1;
		Object obj1;
		boolean flag;
		if(!"table".equals(((Object) (s))) && !"view".equals(((Object) (s))) && !"trigger".equals(((Object) (s))))
	//*   0    0:ldc1            #14  <String "table">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #170 <Method boolean String.equals(Object)>
	//*   3    6:ifne            35
	//*   4    9:ldc1            #28  <String "view">
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #170 <Method boolean String.equals(Object)>
	//*   7   15:ifne            35
	//*   8   18:ldc1            #26  <String "trigger">
	//*   9   20:aload_1         
	//*  10   21:invokevirtual   #170 <Method boolean String.equals(Object)>
	//*  11   24:ifeq            30
	//*  12   27:goto            35
			flag = false;
	//   13   30:iconst_0        
	//   14   31:istore_3        
		else
	//*  15   32:goto            37
			flag = true;
	//   16   35:iconst_1        
	//   17   36:istore_3        
		Preconditions.checkArgument(flag);
	//   18   37:iload_3         
	//   19   38:invokestatic    #176 <Method void Preconditions.checkArgument(boolean)>
		obj = ((Object) (new String[1]));
	//   20   41:iconst_1        
	//   21   42:anewarray       String[]
	//   22   45:astore          4
		obj[0] = "name";
	//   23   47:aload           4
	//   24   49:iconst_0        
	//   25   50:ldc1            #178 <String "name">
	//   26   52:aastore         
		String as1[] = new String[1];
	//   27   53:iconst_1        
	//   28   54:anewarray       String[]
	//   29   57:astore          5
		as1[0] = s;
	//   30   59:aload           5
	//   31   61:iconst_0        
	//   32   62:aload_1         
	//   33   63:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  34   64:aload_0         
	//*  35   65:instanceof      #180 <Class SQLiteDatabase>
	//*  36   68:ifne            91
			obj = ((Object) (sqlitedatabase.query("SQLITE_MASTER", ((String []) (obj)), "type == ?", as1, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   37   71:aload_0         
	//   38   72:ldc1            #182 <String "SQLITE_MASTER">
	//   39   74:aload           4
	//   40   76:ldc1            #184 <String "type == ?">
	//   41   78:aload           5
	//   42   80:aconst_null     
	//   43   81:aconst_null     
	//   44   82:aconst_null     
	//   45   83:invokevirtual   #188 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   46   86:astore          4
		else
	//*  47   88:goto            111
			obj = ((Object) (SQLiteInstrumentation.query((SQLiteDatabase)sqlitedatabase, "SQLITE_MASTER", ((String []) (obj)), "type == ?", as1, ((String) (null)), ((String) (null)), ((String) (null)))));
	//   48   91:aload_0         
	//   49   92:checkcast       #180 <Class SQLiteDatabase>
	//   50   95:ldc1            #182 <String "SQLITE_MASTER">
	//   51   97:aload           4
	//   52   99:ldc1            #184 <String "type == ?">
	//   53  101:aload           5
	//   54  103:aconst_null     
	//   55  104:aconst_null     
	//   56  105:aconst_null     
	//   57  106:invokestatic    #193 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, String, String[], String, String[], String, String, String)>
	//   58  109:astore          4
		obj1 = null;
	//   59  111:aconst_null     
	//   60  112:astore          6
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   61  114:aload           6
	//   62  116:astore          5
		as = ((String []) (CollectionUtils.setOf(((Object []) (as)))));
	//   63  118:aload_2         
	//   64  119:invokestatic    #199 <Method Set CollectionUtils.setOf(Object[])>
	//   65  122:astore_2        
_L2:
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   66  123:aload           6
	//   67  125:astore          5
		if(!((Cursor) (obj)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   68  127:aload           4
	//   69  129:invokeinterface #203 <Method boolean Cursor.moveToNext()>
	//   70  134:ifeq            308
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   71  137:aload           6
	//   72  139:astore          5
		String s1 = ((Cursor) (obj)).getString(0);
	//   73  141:aload           4
	//   74  143:iconst_0        
	//   75  144:invokeinterface #59  <Method String Cursor.getString(int)>
	//   76  149:astore          7
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   77  151:aload           6
	//   78  153:astore          5
		if(((Set) (as)).contains(((Object) (s1))))
			continue; /* Loop/switch isn't completed */
	//   79  155:aload_2         
	//   80  156:aload           7
	//   81  158:invokeinterface #208 <Method boolean Set.contains(Object)>
	//   82  163:ifne            123
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   83  166:aload           6
	//   84  168:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 8 + String.valueOf(((Object) (s1))).length());
	//   85  170:new             #210 <Class StringBuilder>
	//   86  173:dup             
	//   87  174:aload_1         
	//   88  175:invokestatic    #85  <Method String String.valueOf(Object)>
	//   89  178:invokevirtual   #87  <Method int String.length()>
	//   90  181:bipush          8
	//   91  183:iadd            
	//   92  184:aload           7
	//   93  186:invokestatic    #85  <Method String String.valueOf(Object)>
	//   94  189:invokevirtual   #87  <Method int String.length()>
	//   95  192:iadd            
	//   96  193:invokespecial   #213 <Method void StringBuilder(int)>
	//   97  196:astore          8
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//   98  198:aload           6
	//   99  200:astore          5
		stringbuilder.append("DROP ");
	//  100  202:aload           8
	//  101  204:ldc1            #215 <String "DROP ">
	//  102  206:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  103  209:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  104  210:aload           6
	//  105  212:astore          5
		stringbuilder.append(s);
	//  106  214:aload           8
	//  107  216:aload_1         
	//  108  217:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  109  220:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  110  221:aload           6
	//  111  223:astore          5
		stringbuilder.append(" '");
	//  112  225:aload           8
	//  113  227:ldc1            #221 <String " '">
	//  114  229:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  115  232:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  116  233:aload           6
	//  117  235:astore          5
		stringbuilder.append(s1);
	//  118  237:aload           8
	//  119  239:aload           7
	//  120  241:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  121  244:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  122  245:aload           6
	//  123  247:astore          5
		stringbuilder.append("'");
	//  124  249:aload           8
	//  125  251:ldc1            #223 <String "'">
	//  126  253:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  127  256:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  128  257:aload           6
	//  129  259:astore          5
		s1 = stringbuilder.toString();
	//  130  261:aload           8
	//  131  263:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  132  266:astore          7
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  133  268:aload           6
	//  134  270:astore          5
		if(sqlitedatabase instanceof SQLiteDatabase)
			break MISSING_BLOCK_LABEL_292;
	//  135  272:aload_0         
	//  136  273:instanceof      #180 <Class SQLiteDatabase>
	//  137  276:ifne            292
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
	//  138  279:aload           6
	//  139  281:astore          5
		try
		{
			sqlitedatabase.execSQL(s1);
	//  140  283:aload_0         
	//  141  284:aload           7
	//  142  286:invokevirtual   #230 <Method void SQLiteDatabase.execSQL(String)>
			continue; /* Loop/switch isn't completed */
	//  143  289:goto            123
		}
	//* 144  292:aload           6
	//* 145  294:astore          5
	//* 146  296:aload_0         
	//* 147  297:checkcast       #180 <Class SQLiteDatabase>
	//* 148  300:aload           7
	//* 149  302:invokestatic    #233 <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
	//* 150  305:goto            123
	//* 151  308:aload           4
	//* 152  310:ifnull          320
	//* 153  313:aload           4
	//* 154  315:invokeinterface #236 <Method void Cursor.close()>
	//* 155  320:return          
	//* 156  321:astore_0        
	//* 157  322:goto            331
		// Misplaced declaration of an exception variable
		catch(SQLiteDatabase sqlitedatabase)
	//* 158  325:astore_0        
		{
			sqlitedatabase1 = sqlitedatabase;
	//  159  326:aload_0         
	//  160  327:astore          5
		}
		break MISSING_BLOCK_LABEL_329;
		sqlitedatabase1 = ((SQLiteDatabase) (obj1));
		SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, s1);
		if(true) goto _L2; else goto _L1
_L1:
		if(obj != null)
			((Cursor) (obj)).close();
		return;
		sqlitedatabase;
		break MISSING_BLOCK_LABEL_331;
		throw sqlitedatabase;
	//  161  329:aload_0         
	//  162  330:athrow          
		if(obj != null)
	//* 163  331:aload           4
	//* 164  333:ifnull          368
			if(sqlitedatabase1 != null)
	//* 165  336:aload           5
	//* 166  338:ifnull          361
				try
				{
					((Cursor) (obj)).close();
	//  167  341:aload           4
	//  168  343:invokeinterface #236 <Method void Cursor.close()>
				}
	//* 169  348:goto            368
				// Misplaced declaration of an exception variable
				catch(String s)
	//* 170  351:astore_1        
				{
					zzk.zza(((Throwable) (sqlitedatabase1)), ((Throwable) (s)));
	//  171  352:aload           5
	//  172  354:aload_1         
	//  173  355:invokestatic    #241 <Method void zzk.zza(Throwable, Throwable)>
				}
			else
	//* 174  358:goto            368
				((Cursor) (obj)).close();
	//  175  361:aload           4
	//  176  363:invokeinterface #236 <Method void Cursor.close()>
		throw sqlitedatabase;
	//  177  368:aload_0         
	//  178  369:athrow          
	}
}
