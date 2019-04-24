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
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void clearDatabase(SQLiteDatabase sqlitedatabase)
	{
		zza(sqlitedatabase, "table", new String[] {
			"sqlite_sequence", "android_metadata"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "table">
	//    2    3:iconst_2        
	//    3    4:anewarray       String[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #17  <String "sqlite_sequence">
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #19  <String "android_metadata">
	//   11   16:aastore         
	//   12   17:invokestatic    #23  <Method void zza(SQLiteDatabase, String, String[])>
		zza(sqlitedatabase, "trigger", new String[0]);
	//   13   20:aload_0         
	//   14   21:ldc1            #25  <String "trigger">
	//   15   23:iconst_0        
	//   16   24:anewarray       String[]
	//   17   27:invokestatic    #23  <Method void zza(SQLiteDatabase, String, String[])>
		zza(sqlitedatabase, "view", new String[0]);
	//   18   30:aload_0         
	//   19   31:ldc1            #27  <String "view">
	//   20   33:iconst_0        
	//   21   34:anewarray       String[]
	//   22   37:invokestatic    #23  <Method void zza(SQLiteDatabase, String, String[])>
	//   23   40:return          
	}

	public static long countCurrentRowBytes(Cursor cursor)
	{
		return countCurrentRowBytes(cursor, Charset.forName("UTF-8"));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "UTF-8">
	//    2    3:invokestatic    #37  <Method Charset Charset.forName(String)>
	//    3    6:invokestatic    #40  <Method long countCurrentRowBytes(Cursor, Charset)>
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
	//    6    7:invokeinterface #46  <Method int Cursor.getColumnCount()>
	//    7   12:icmpge          110
						int j;
						switch(cursor.getType(i))
	//*   8   15:aload_0         
	//*   9   16:iload_2         
	//*  10   17:invokeinterface #50  <Method int Cursor.getType(int)>
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
	//   15   61:invokeinterface #54  <Method byte[] Cursor.getBlob(int)>
	//   16   66:arraylength     
	//   17   67:istore_3        
							break;
	//   18   68:goto            84

						case 3: // '\003'
							j = cursor.getString(i).getBytes(charset).length;
	//   19   71:aload_0         
	//   20   72:iload_2         
	//   21   73:invokeinterface #58  <Method String Cursor.getString(int)>
	//   22   78:aload_1         
	//   23   79:invokevirtual   #62  <Method byte[] String.getBytes(Charset)>
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
	//   30   91:ldc2w           #63  <Long 4L>
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
	//    2    2:invokevirtual   #74  <Method File Context.getDatabasePath(String)>
	//    3    5:astore_0        
		if(context == null) goto _L2; else goto _L1
	//    4    6:aload_0         
	//    5    7:ifnull          56
_L1:
		long l = ((File) (context)).length();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #80  <Method long File.length()>
	//    8   14:lstore_2        
		return l;
	//    9   15:lload_2         
	//   10   16:lreturn         
_L4:
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   11   17:aload_1         
	//   12   18:invokestatic    #84  <Method String String.valueOf(Object)>
	//   13   21:astore_0        
		if(((String) (context)).length() != 0)
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #86  <Method int String.length()>
	//*  16   26:ifeq            39
			context = ((Context) ("Failed to get db size for ".concat(((String) (context)))));
	//   17   29:ldc1            #88  <String "Failed to get db size for ">
	//   18   31:aload_0         
	//   19   32:invokevirtual   #92  <Method String String.concat(String)>
	//   20   35:astore_0        
		else
	//*  21   36:goto            49
			context = ((Context) (new String("Failed to get db size for ")));
	//   22   39:new             #15  <Class String>
	//   23   42:dup             
	//   24   43:ldc1            #88  <String "Failed to get db size for ">
	//   25   45:invokespecial   #95  <Method void String(String)>
	//   26   48:astore_0        
		Log.w("DbUtils", ((String) (context)));
	//   27   49:ldc1            #97  <String "DbUtils">
	//   28   51:aload_0         
	//   29   52:invokestatic    #103 <Method int Log.w(String, String)>
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
	//    3    3:invokestatic    #109 <Method Integer getIntegerFromCursor(Cursor, int, Integer)>
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
	//*   4    6:invokeinterface #114 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return integer;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return Integer.valueOf(cursor.getInt(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #117 <Method int Cursor.getInt(int)>
	//   11   23:invokestatic    #122 <Method Integer Integer.valueOf(int)>
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
	//    3    3:invokestatic    #128 <Method Long getLongFromCursor(Cursor, int, Long)>
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
	//*   4    6:invokeinterface #114 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return long1;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return Long.valueOf(cursor.getLong(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #132 <Method long Cursor.getLong(int)>
	//   11   23:invokestatic    #137 <Method Long Long.valueOf(long)>
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
	//    3    3:invokestatic    #142 <Method String getStringFromCursor(Cursor, int, String)>
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
	//*   4    6:invokeinterface #114 <Method boolean Cursor.isNull(int)>
	//*   5   11:ifeq            16
				return s;
	//    6   14:aload_2         
	//    7   15:areturn         
			else
				return cursor.getString(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokeinterface #58  <Method String Cursor.getString(int)>
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
	//    5    7:invokevirtual   #150 <Method void ContentValues.put(String, Integer)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #153 <Method void ContentValues.putNull(String)>
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
	//    5    7:invokevirtual   #158 <Method void ContentValues.put(String, Long)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #153 <Method void ContentValues.putNull(String)>
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
	//    5    7:invokevirtual   #163 <Method void ContentValues.put(String, String)>
			return;
	//    6   10:return          
		} else
		{
			contentvalues.putNull(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #153 <Method void ContentValues.putNull(String)>
			return;
	//   10   16:return          
		}
	}

	private static transient void zza(SQLiteDatabase sqlitedatabase, String s, String as[])
	{
		SQLiteDatabase sqlitedatabase1;
		Object obj;
		Cursor cursor;
		boolean flag;
		if(!"table".equals(((Object) (s))) && !"view".equals(((Object) (s))) && !"trigger".equals(((Object) (s))))
	//*   0    0:ldc1            #13  <String "table">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*   3    6:ifne            35
	//*   4    9:ldc1            #27  <String "view">
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*   7   15:ifne            35
	//*   8   18:ldc1            #25  <String "trigger">
	//*   9   20:aload_1         
	//*  10   21:invokevirtual   #169 <Method boolean String.equals(Object)>
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
	//   19   38:invokestatic    #175 <Method void Preconditions.checkArgument(boolean)>
		cursor = sqlitedatabase.query("SQLITE_MASTER", new String[] {
			"name"
		}, "type == ?", new String[] {
			s
		}, ((String) (null)), ((String) (null)), ((String) (null)));
	//   20   41:aload_0         
	//   21   42:ldc1            #177 <String "SQLITE_MASTER">
	//   22   44:iconst_1        
	//   23   45:anewarray       String[]
	//   24   48:dup             
	//   25   49:iconst_0        
	//   26   50:ldc1            #179 <String "name">
	//   27   52:aastore         
	//   28   53:ldc1            #181 <String "type == ?">
	//   29   55:iconst_1        
	//   30   56:anewarray       String[]
	//   31   59:dup             
	//   32   60:iconst_0        
	//   33   61:aload_1         
	//   34   62:aastore         
	//   35   63:aconst_null     
	//   36   64:aconst_null     
	//   37   65:aconst_null     
	//   38   66:invokevirtual   #187 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   39   69:astore          6
		obj = null;
	//   40   71:aconst_null     
	//   41   72:astore          5
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   42   74:aload           5
	//   43   76:astore          4
		as = ((String []) (CollectionUtils.setOf(((Object []) (as)))));
	//   44   78:aload_2         
	//   45   79:invokestatic    #193 <Method Set CollectionUtils.setOf(Object[])>
	//   46   82:astore_2        
_L2:
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   47   83:aload           5
	//   48   85:astore          4
		if(!cursor.moveToNext())
			break; /* Loop/switch isn't completed */
	//   49   87:aload           6
	//   50   89:invokeinterface #197 <Method boolean Cursor.moveToNext()>
	//   51   94:ifeq            233
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   52   97:aload           5
	//   53   99:astore          4
		String s1 = cursor.getString(0);
	//   54  101:aload           6
	//   55  103:iconst_0        
	//   56  104:invokeinterface #58  <Method String Cursor.getString(int)>
	//   57  109:astore          7
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   58  111:aload           5
	//   59  113:astore          4
		if(((Set) (as)).contains(((Object) (s1))))
			continue; /* Loop/switch isn't completed */
	//   60  115:aload_2         
	//   61  116:aload           7
	//   62  118:invokeinterface #202 <Method boolean Set.contains(Object)>
	//   63  123:ifne            83
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   64  126:aload           5
	//   65  128:astore          4
		StringBuilder stringbuilder = new StringBuilder(8 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   66  130:new             #204 <Class StringBuilder>
	//   67  133:dup             
	//   68  134:bipush          8
	//   69  136:aload_1         
	//   70  137:invokestatic    #84  <Method String String.valueOf(Object)>
	//   71  140:invokevirtual   #86  <Method int String.length()>
	//   72  143:iadd            
	//   73  144:aload           7
	//   74  146:invokestatic    #84  <Method String String.valueOf(Object)>
	//   75  149:invokevirtual   #86  <Method int String.length()>
	//   76  152:iadd            
	//   77  153:invokespecial   #207 <Method void StringBuilder(int)>
	//   78  156:astore          8
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   79  158:aload           5
	//   80  160:astore          4
		stringbuilder.append("DROP ");
	//   81  162:aload           8
	//   82  164:ldc1            #209 <String "DROP ">
	//   83  166:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   84  169:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   85  170:aload           5
	//   86  172:astore          4
		stringbuilder.append(s);
	//   87  174:aload           8
	//   88  176:aload_1         
	//   89  177:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   90  180:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   91  181:aload           5
	//   92  183:astore          4
		stringbuilder.append(" '");
	//   93  185:aload           8
	//   94  187:ldc1            #215 <String " '">
	//   95  189:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   96  192:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//   97  193:aload           5
	//   98  195:astore          4
		stringbuilder.append(s1);
	//   99  197:aload           8
	//  100  199:aload           7
	//  101  201:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  102  204:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//  103  205:aload           5
	//  104  207:astore          4
		stringbuilder.append("'");
	//  105  209:aload           8
	//  106  211:ldc1            #217 <String "'">
	//  107  213:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  108  216:pop             
		sqlitedatabase1 = ((SQLiteDatabase) (obj));
	//  109  217:aload           5
	//  110  219:astore          4
		sqlitedatabase.execSQL(stringbuilder.toString());
	//  111  221:aload_0         
	//  112  222:aload           8
	//  113  224:invokevirtual   #221 <Method String StringBuilder.toString()>
	//  114  227:invokevirtual   #224 <Method void SQLiteDatabase.execSQL(String)>
		if(true) goto _L2; else goto _L1
	//  115  230:goto            83
_L1:
		if(cursor != null)
	//* 116  233:aload           6
	//* 117  235:ifnull          245
			cursor.close();
	//  118  238:aload           6
	//  119  240:invokeinterface #227 <Method void Cursor.close()>
		return;
	//  120  245:return          
		sqlitedatabase;
	//  121  246:astore_0        
		break MISSING_BLOCK_LABEL_256;
	//  122  247:goto            256
		sqlitedatabase;
	//  123  250:astore_0        
		sqlitedatabase1 = sqlitedatabase;
	//  124  251:aload_0         
	//  125  252:astore          4
		throw sqlitedatabase;
	//  126  254:aload_0         
	//  127  255:athrow          
		if(cursor != null)
	//* 128  256:aload           6
	//* 129  258:ifnull          293
			if(sqlitedatabase1 != null)
	//* 130  261:aload           4
	//* 131  263:ifnull          286
				try
				{
					cursor.close();
	//  132  266:aload           6
	//  133  268:invokeinterface #227 <Method void Cursor.close()>
				}
	//* 134  273:goto            293
				// Misplaced declaration of an exception variable
				catch(String s)
	//* 135  276:astore_1        
				{
					zzk.zza(((Throwable) (sqlitedatabase1)), ((Throwable) (s)));
	//  136  277:aload           4
	//  137  279:aload_1         
	//  138  280:invokestatic    #232 <Method void zzk.zza(Throwable, Throwable)>
				}
			else
	//* 139  283:goto            293
				cursor.close();
	//  140  286:aload           6
	//  141  288:invokeinterface #227 <Method void Cursor.close()>
		throw sqlitedatabase;
	//  142  293:aload_0         
	//  143  294:athrow          
	}
}
