// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ds, ci, cc, w, 
//			cg, dl

public class dv
	implements ds
{

	public dv(dl dl1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #51  <Field boolean d>
		e = dl1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #53  <Field dl e>
	//    8   14:return          
	}

	private Collection a(Cursor cursor)
	{
		JSONException jsonexception;
		Cursor cursor1 = cursor;
	//    0    0:aload_1         
	//    1    1:astore          10
		ArrayList arraylist = new ArrayList();
	//    2    3:new             #58  <Class ArrayList>
	//    3    6:dup             
	//    4    7:invokespecial   #59  <Method void ArrayList()>
	//    5   10:astore          11
		int j = cursor1.getColumnIndex("session_id");
	//    6   12:aload           10
	//    7   14:ldc1            #32  <String "session_id">
	//    8   16:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//    9   21:istore          5
		int i = cursor1.getColumnIndex("user_id");
	//   10   23:aload           10
	//   11   25:ldc1            #34  <String "user_id">
	//   12   27:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//   13   32:istore          4
		int k = cursor1.getColumnIndex("event_type");
	//   14   34:aload           10
	//   15   36:ldc1            #36  <String "event_type">
	//   16   38:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//   17   43:istore          6
		int l = cursor1.getColumnIndex("event_data");
	//   18   45:aload           10
	//   19   47:ldc1            #38  <String "event_data">
	//   20   49:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//   21   54:istore          7
		int i1 = cursor1.getColumnIndex("event_guid");
	//   22   56:aload           10
	//   23   58:ldc1            #40  <String "event_guid">
	//   24   60:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//   25   65:istore          8
		int j1 = cursor1.getColumnIndex("timestamp");
	//   26   67:aload           10
	//   27   69:ldc1            #42  <String "timestamp">
	//   28   71:invokeinterface #65  <Method int Cursor.getColumnIndex(String)>
	//   29   76:istore          9
		do
		{
			Object obj = ((Object) (cursor));
	//   30   78:aload_1         
	//   31   79:astore          10
			if(cursor.moveToNext())
	//*  32   81:aload_1         
	//*  33   82:invokeinterface #69  <Method boolean Cursor.moveToNext()>
	//*  34   87:ifeq            311
			{
				String s = ((Cursor) (obj)).getString(k);
	//   35   90:aload           10
	//   36   92:iload           6
	//   37   94:invokeinterface #73  <Method String Cursor.getString(int)>
	//   38   99:astore          12
				String s1 = ((Cursor) (obj)).getString(l);
	//   39  101:aload           10
	//   40  103:iload           7
	//   41  105:invokeinterface #73  <Method String Cursor.getString(int)>
	//   42  110:astore          13
				double d1 = ((Cursor) (obj)).getDouble(j1);
	//   43  112:aload           10
	//   44  114:iload           9
	//   45  116:invokeinterface #77  <Method double Cursor.getDouble(int)>
	//   46  121:dstore_2        
				String s2 = ((Cursor) (obj)).getString(i1);
	//   47  122:aload           10
	//   48  124:iload           8
	//   49  126:invokeinterface #73  <Method String Cursor.getString(int)>
	//   50  131:astore          14
				String s3 = ((Cursor) (obj)).getString(i);
	//   51  133:aload           10
	//   52  135:iload           4
	//   53  137:invokeinterface #73  <Method String Cursor.getString(int)>
	//   54  142:astore          15
				obj = ((Object) (((Cursor) (obj)).getString(j)));
	//   55  144:aload           10
	//   56  146:iload           5
	//   57  148:invokeinterface #73  <Method String Cursor.getString(int)>
	//   58  153:astore          10
				String s4;
				StringBuilder stringbuilder;
				try
				{
					((List) (arraylist)).add(((Object) (ci.a(s, s1, d1, s2, s3, ((String) (obj))))));
	//   59  155:aload           11
	//   60  157:aload           12
	//   61  159:aload           13
	//   62  161:dload_2         
	//   63  162:aload           14
	//   64  164:aload           15
	//   65  166:aload           10
	//   66  168:invokestatic    #82  <Method ci ci.a(String, String, double, String, String, String)>
	//   67  171:invokeinterface #88  <Method boolean List.add(Object)>
	//   68  176:pop             
				}
	//*  69  177:goto            308
	//*  70  180:getstatic       #28  <Field String a>
	//*  71  183:astore          16
	//*  72  185:new             #90  <Class StringBuilder>
	//*  73  188:dup             
	//*  74  189:invokespecial   #91  <Method void StringBuilder()>
	//*  75  192:astore          17
	//*  76  194:aload           17
	//*  77  196:ldc1            #93  <String "Could not create AppboyEvent from [type=">
	//*  78  198:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  79  201:pop             
	//*  80  202:aload           17
	//*  81  204:aload           12
	//*  82  206:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  83  209:pop             
	//*  84  210:aload           17
	//*  85  212:ldc1            #99  <String ", data=">
	//*  86  214:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  87  217:pop             
	//*  88  218:aload           17
	//*  89  220:aload           13
	//*  90  222:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  91  225:pop             
	//*  92  226:aload           17
	//*  93  228:ldc1            #101 <String ", timestamp=">
	//*  94  230:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  95  233:pop             
	//*  96  234:aload           17
	//*  97  236:dload_2         
	//*  98  237:invokevirtual   #104 <Method StringBuilder StringBuilder.append(double)>
	//*  99  240:pop             
	//* 100  241:aload           17
	//* 101  243:ldc1            #106 <String ", uniqueId=">
	//* 102  245:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 103  248:pop             
	//* 104  249:aload           17
	//* 105  251:aload           14
	//* 106  253:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 107  256:pop             
	//* 108  257:aload           17
	//* 109  259:ldc1            #108 <String ", userId=">
	//* 110  261:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 111  264:pop             
	//* 112  265:aload           17
	//* 113  267:aload           15
	//* 114  269:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 115  272:pop             
	//* 116  273:aload           17
	//* 117  275:ldc1            #110 <String ", sessionId=">
	//* 118  277:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 119  280:pop             
	//* 120  281:aload           17
	//* 121  283:aload           10
	//* 122  285:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 123  288:pop             
	//* 124  289:aload           17
	//* 125  291:ldc1            #112 <String "] ... Skipping">
	//* 126  293:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 127  296:pop             
	//* 128  297:aload           16
	//* 129  299:aload           17
	//* 130  301:invokevirtual   #116 <Method String StringBuilder.toString()>
	//* 131  304:invokestatic    #119 <Method int AppboyLogger.e(String, String)>
	//* 132  307:pop             
	//* 133  308:goto            78
	//* 134  311:aload           11
	//* 135  313:areturn         
				// Misplaced declaration of an exception variable
				catch(JSONException jsonexception)
				{
					s4 = a;
					stringbuilder = new StringBuilder();
					stringbuilder.append("Could not create AppboyEvent from [type=");
					stringbuilder.append(s);
					stringbuilder.append(", data=");
					stringbuilder.append(s1);
					stringbuilder.append(", timestamp=");
					stringbuilder.append(d1);
					stringbuilder.append(", uniqueId=");
					stringbuilder.append(s2);
					stringbuilder.append(", userId=");
					stringbuilder.append(s3);
					stringbuilder.append(", sessionId=");
					stringbuilder.append(((String) (obj)));
					stringbuilder.append("] ... Skipping");
					AppboyLogger.e(s4, stringbuilder.toString());
				}
			} else
			{
				return ((Collection) (arraylist));
			}
		} while(true);
	//* 136  314:astore          16
	//* 137  316:goto            180
	}

	private ContentValues c(cc cc1)
	{
		ContentValues contentvalues = new ContentValues();
	//    0    0:new             #124 <Class ContentValues>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void ContentValues()>
	//    3    7:astore_3        
		contentvalues.put("event_type", cc1.b().a());
	//    4    8:aload_3         
	//    5    9:ldc1            #36  <String "event_type">
	//    6   11:aload_1         
	//    7   12:invokeinterface #130 <Method w cc.b()>
	//    8   17:invokevirtual   #134 <Method String w.a()>
	//    9   20:invokevirtual   #138 <Method void ContentValues.put(String, String)>
		Object obj = ((Object) (cc1.c()));
	//   10   23:aload_1         
	//   11   24:invokeinterface #141 <Method JSONObject cc.c()>
	//   12   29:astore_2        
		if(!(obj instanceof JSONObject))
	//*  13   30:aload_2         
	//*  14   31:instanceof      #143 <Class JSONObject>
	//*  15   34:ifne            45
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   16   37:aload_2         
	//   17   38:invokevirtual   #144 <Method String JSONObject.toString()>
	//   18   41:astore_2        
		else
	//*  19   42:goto            53
			obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   20   45:aload_2         
	//   21   46:checkcast       #143 <Class JSONObject>
	//   22   49:invokestatic    #149 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   23   52:astore_2        
		contentvalues.put("event_data", ((String) (obj)));
	//   24   53:aload_3         
	//   25   54:ldc1            #38  <String "event_data">
	//   26   56:aload_2         
	//   27   57:invokevirtual   #138 <Method void ContentValues.put(String, String)>
		contentvalues.put("timestamp", Double.valueOf(cc1.a()));
	//   28   60:aload_3         
	//   29   61:ldc1            #42  <String "timestamp">
	//   30   63:aload_1         
	//   31   64:invokeinterface #152 <Method double cc.a()>
	//   32   69:invokestatic    #158 <Method Double Double.valueOf(double)>
	//   33   72:invokevirtual   #161 <Method void ContentValues.put(String, Double)>
		if(cc1.g() != null)
	//*  34   75:aload_1         
	//*  35   76:invokeinterface #165 <Method cg cc.g()>
	//*  36   81:ifnull          99
			contentvalues.put("session_id", cc1.g().toString());
	//   37   84:aload_3         
	//   38   85:ldc1            #32  <String "session_id">
	//   39   87:aload_1         
	//   40   88:invokeinterface #165 <Method cg cc.g()>
	//   41   93:invokevirtual   #168 <Method String cg.toString()>
	//   42   96:invokevirtual   #138 <Method void ContentValues.put(String, String)>
		if(cc1.f() != null)
	//*  43   99:aload_1         
	//*  44  100:invokeinterface #171 <Method String cc.f()>
	//*  45  105:ifnull          120
			contentvalues.put("user_id", cc1.f());
	//   46  108:aload_3         
	//   47  109:ldc1            #34  <String "user_id">
	//   48  111:aload_1         
	//   49  112:invokeinterface #171 <Method String cc.f()>
	//   50  117:invokevirtual   #138 <Method void ContentValues.put(String, String)>
		if(cc1.d() != null)
	//*  51  120:aload_1         
	//*  52  121:invokeinterface #173 <Method String cc.d()>
	//*  53  126:ifnull          141
			contentvalues.put("event_guid", cc1.d());
	//   54  129:aload_3         
	//   55  130:ldc1            #40  <String "event_guid">
	//   56  132:aload_1         
	//   57  133:invokeinterface #173 <Method String cc.d()>
	//   58  138:invokevirtual   #138 <Method void ContentValues.put(String, String)>
		return contentvalues;
	//   59  141:aload_3         
	//   60  142:areturn         
	}

	public Collection a()
	{
		Cursor cursor;
		Cursor cursor1;
		boolean flag = d;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean d>
	//    2    4:istore_1        
		cursor1 = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            22
		{
			AppboyLogger.w(a, "Storage provider is closed. Not getting all events.");
	//    7   11:getstatic       #28  <Field String a>
	//    8   14:ldc1            #177 <String "Storage provider is closed. Not getting all events.">
	//    9   16:invokestatic    #180 <Method int AppboyLogger.w(String, String)>
	//   10   19:pop             
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		}
		cursor = cursor1;
	//   13   22:aload_3         
	//   14   23:astore_2        
		Object obj = ((Object) (c()));
	//   15   24:aload_0         
	//   16   25:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   17   28:astore          4
		cursor = cursor1;
	//   18   30:aload_3         
	//   19   31:astore_2        
		String as[] = b;
	//   20   32:getstatic       #44  <Field String[] b>
	//   21   35:astore          5
		cursor = cursor1;
	//   22   37:aload_3         
	//   23   38:astore_2        
		if(obj instanceof SQLiteDatabase)
			break MISSING_BLOCK_LABEL_69;
	//   24   39:aload           4
	//   25   41:instanceof      #185 <Class SQLiteDatabase>
	//   26   44:ifne            69
		cursor = cursor1;
	//   27   47:aload_3         
	//   28   48:astore_2        
		cursor1 = ((SQLiteDatabase) (obj)).query("ab_events", as, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
	//   29   49:aload           4
	//   30   51:ldc1            #187 <String "ab_events">
	//   31   53:aload           5
	//   32   55:aconst_null     
	//   33   56:aconst_null     
	//   34   57:aconst_null     
	//   35   58:aconst_null     
	//   36   59:aconst_null     
	//   37   60:invokevirtual   #191 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   38   63:astore_3        
		cursor = cursor1;
	//   39   64:aload_3         
	//   40   65:astore_2        
		break MISSING_BLOCK_LABEL_91;
	//   41   66:goto            91
		cursor = cursor1;
	//   42   69:aload_3         
	//   43   70:astore_2        
		cursor1 = SQLiteInstrumentation.query((SQLiteDatabase)obj, "ab_events", as, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
	//   44   71:aload           4
	//   45   73:checkcast       #185 <Class SQLiteDatabase>
	//   46   76:ldc1            #187 <String "ab_events">
	//   47   78:aload           5
	//   48   80:aconst_null     
	//   49   81:aconst_null     
	//   50   82:aconst_null     
	//   51   83:aconst_null     
	//   52   84:aconst_null     
	//   53   85:invokestatic    #196 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, String, String[], String, String[], String, String, String)>
	//   54   88:astore_3        
		cursor = cursor1;
	//   55   89:aload_3         
	//   56   90:astore_2        
		cursor1 = cursor;
	//   57   91:aload_2         
	//   58   92:astore_3        
		cursor = cursor1;
	//   59   93:aload_3         
	//   60   94:astore_2        
		obj = ((Object) (a(cursor1)));
	//   61   95:aload_0         
	//   62   96:aload_3         
	//   63   97:invokespecial   #198 <Method Collection a(Cursor)>
	//   64  100:astore          4
		if(cursor1 != null)
	//*  65  102:aload_3         
	//*  66  103:ifnull          112
			cursor1.close();
	//   67  106:aload_3         
	//   68  107:invokeinterface #201 <Method void Cursor.close()>
		return ((Collection) (obj));
	//   69  112:aload           4
	//   70  114:areturn         
		Exception exception;
		exception;
	//   71  115:astore_3        
		if(cursor != null)
	//*  72  116:aload_2         
	//*  73  117:ifnull          126
			cursor.close();
	//   74  120:aload_2         
	//   75  121:invokeinterface #201 <Method void Cursor.close()>
		throw exception;
	//   76  126:aload_3         
	//   77  127:athrow          
	}

	public void a(cc cc1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean d>
	//*   2    4:ifeq            48
		{
			String s = a;
	//    3    7:getstatic       #28  <Field String a>
	//    4   10:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    5   12:new             #90  <Class StringBuilder>
	//    6   15:dup             
	//    7   16:invokespecial   #91  <Method void StringBuilder()>
	//    8   19:astore          5
			stringbuilder.append("Storage provider is closed. Not adding event: ");
	//    9   21:aload           5
	//   10   23:ldc1            #206 <String "Storage provider is closed. Not adding event: ">
	//   11   25:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   29:aload           5
	//   14   31:aload_1         
	//   15   32:invokevirtual   #209 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   36:aload           4
	//   18   38:aload           5
	//   19   40:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   20   43:invokestatic    #180 <Method int AppboyLogger.w(String, String)>
	//   21   46:pop             
			return;
	//   22   47:return          
		}
		ContentValues contentvalues = c(cc1);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokespecial   #211 <Method ContentValues c(cc)>
	//   26   53:astore          4
		SQLiteDatabase sqlitedatabase = c();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   29   59:astore          5
		long l;
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  30   61:aload           5
	//*  31   63:instanceof      #185 <Class SQLiteDatabase>
	//*  32   66:ifne            83
			l = sqlitedatabase.insert("ab_events", ((String) (null)), contentvalues);
	//   33   69:aload           5
	//   34   71:ldc1            #187 <String "ab_events">
	//   35   73:aconst_null     
	//   36   74:aload           4
	//   37   76:invokevirtual   #215 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//   38   79:lstore_2        
		else
	//*  39   80:goto            97
			l = SQLiteInstrumentation.insert((SQLiteDatabase)sqlitedatabase, "ab_events", ((String) (null)), contentvalues);
	//   40   83:aload           5
	//   41   85:checkcast       #185 <Class SQLiteDatabase>
	//   42   88:ldc1            #187 <String "ab_events">
	//   43   90:aconst_null     
	//   44   91:aload           4
	//   45   93:invokestatic    #218 <Method long SQLiteInstrumentation.insert(SQLiteDatabase, String, String, ContentValues)>
	//   46   96:lstore_2        
		if(l == -1L)
	//*  47   97:lload_2         
	//*  48   98:ldc2w           #219 <Long -1L>
	//*  49  101:lcmp            
	//*  50  102:ifne            156
		{
			String s1 = a;
	//   51  105:getstatic       #28  <Field String a>
	//   52  108:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   53  110:new             #90  <Class StringBuilder>
	//   54  113:dup             
	//   55  114:invokespecial   #91  <Method void StringBuilder()>
	//   56  117:astore          5
			stringbuilder1.append("Failed to add event [");
	//   57  119:aload           5
	//   58  121:ldc1            #222 <String "Failed to add event [">
	//   59  123:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   60  126:pop             
			stringbuilder1.append(((Object) (cc1)).toString());
	//   61  127:aload           5
	//   62  129:aload_1         
	//   63  130:invokevirtual   #223 <Method String Object.toString()>
	//   64  133:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   65  136:pop             
			stringbuilder1.append("] to storage");
	//   66  137:aload           5
	//   67  139:ldc1            #225 <String "] to storage">
	//   68  141:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   69  144:pop             
			AppboyLogger.w(s1, stringbuilder1.toString());
	//   70  145:aload           4
	//   71  147:aload           5
	//   72  149:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   73  152:invokestatic    #180 <Method int AppboyLogger.w(String, String)>
	//   74  155:pop             
		}
	//   75  156:return          
	}

	public void b()
	{
		AppboyLogger.w(a, "Closing SQL database and setting this provider to closed.");
	//    0    0:getstatic       #28  <Field String a>
	//    1    3:ldc1            #227 <String "Closing SQL database and setting this provider to closed.">
	//    2    5:invokestatic    #180 <Method int AppboyLogger.w(String, String)>
	//    3    8:pop             
		d = true;
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:putfield        #51  <Field boolean d>
		c().close();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #183 <Method SQLiteDatabase c()>
	//    9   18:invokevirtual   #228 <Method void SQLiteDatabase.close()>
	//   10   21:return          
	}

	public void b(cc cc1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean d>
	//*   2    4:ifeq            46
		{
			String s = a;
	//    3    7:getstatic       #28  <Field String a>
	//    4   10:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #90  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #91  <Method void StringBuilder()>
	//    8   18:astore          4
			stringbuilder.append("Storage provider is closed. Not deleting event: ");
	//    9   20:aload           4
	//   10   22:ldc1            #230 <String "Storage provider is closed. Not deleting event: ">
	//   11   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			stringbuilder.append(((Object) (cc1)));
	//   13   28:aload           4
	//   14   30:aload_1         
	//   15   31:invokevirtual   #209 <Method StringBuilder StringBuilder.append(Object)>
	//   16   34:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   35:aload_3         
	//   18   36:aload           4
	//   19   38:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #180 <Method int AppboyLogger.w(String, String)>
	//   21   44:pop             
			return;
	//   22   45:return          
		}
		c().beginTransaction();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   25   50:invokevirtual   #233 <Method void SQLiteDatabase.beginTransaction()>
		int i;
		String as[];
		SQLiteDatabase sqlitedatabase;
		as = new String[1];
	//   26   53:iconst_1        
	//   27   54:anewarray       String[]
	//   28   57:astore_3        
		as[0] = cc1.d();
	//   29   58:aload_3         
	//   30   59:iconst_0        
	//   31   60:aload_1         
	//   32   61:invokeinterface #173 <Method String cc.d()>
	//   33   66:aastore         
		sqlitedatabase = c();
	//   34   67:aload_0         
	//   35   68:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   36   71:astore          4
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  37   73:aload           4
	//*  38   75:instanceof      #185 <Class SQLiteDatabase>
	//*  39   78:ifne            95
		{
			i = sqlitedatabase.delete("ab_events", "event_guid = ?", as);
	//   40   81:aload           4
	//   41   83:ldc1            #187 <String "ab_events">
	//   42   85:ldc1            #235 <String "event_guid = ?">
	//   43   87:aload_3         
	//   44   88:invokevirtual   #239 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   45   91:istore_2        
			break MISSING_BLOCK_LABEL_109;
	//   46   92:goto            109
		}
		i = SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "ab_events", "event_guid = ?", as);
	//   47   95:aload           4
	//   48   97:checkcast       #185 <Class SQLiteDatabase>
	//   49  100:ldc1            #187 <String "ab_events">
	//   50  102:ldc1            #235 <String "event_guid = ?">
	//   51  104:aload_3         
	//   52  105:invokestatic    #242 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   53  108:istore_2        
		String s1 = a;
	//   54  109:getstatic       #28  <Field String a>
	//   55  112:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   56  113:new             #90  <Class StringBuilder>
	//   57  116:dup             
	//   58  117:invokespecial   #91  <Method void StringBuilder()>
	//   59  120:astore          4
		stringbuilder1.append("Deleting event with uid ");
	//   60  122:aload           4
	//   61  124:ldc1            #244 <String "Deleting event with uid ">
	//   62  126:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   63  129:pop             
		stringbuilder1.append(cc1.d());
	//   64  130:aload           4
	//   65  132:aload_1         
	//   66  133:invokeinterface #173 <Method String cc.d()>
	//   67  138:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   68  141:pop             
		stringbuilder1.append(" removed ");
	//   69  142:aload           4
	//   70  144:ldc1            #246 <String " removed ">
	//   71  146:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
		stringbuilder1.append(i);
	//   73  150:aload           4
	//   74  152:iload_2         
	//   75  153:invokevirtual   #249 <Method StringBuilder StringBuilder.append(int)>
	//   76  156:pop             
		stringbuilder1.append(" row.");
	//   77  157:aload           4
	//   78  159:ldc1            #251 <String " row.">
	//   79  161:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
		AppboyLogger.d(s1, stringbuilder1.toString(), false);
	//   81  165:aload_3         
	//   82  166:aload           4
	//   83  168:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   84  171:iconst_0        
	//   85  172:invokestatic    #254 <Method int AppboyLogger.d(String, String, boolean)>
	//   86  175:pop             
		c().setTransactionSuccessful();
	//   87  176:aload_0         
	//   88  177:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   89  180:invokevirtual   #257 <Method void SQLiteDatabase.setTransactionSuccessful()>
		c().endTransaction();
	//   90  183:aload_0         
	//   91  184:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   92  187:invokevirtual   #260 <Method void SQLiteDatabase.endTransaction()>
		return;
	//   93  190:return          
		cc1;
	//   94  191:astore_1        
		c().endTransaction();
	//   95  192:aload_0         
	//   96  193:invokevirtual   #183 <Method SQLiteDatabase c()>
	//   97  196:invokevirtual   #260 <Method void SQLiteDatabase.endTransaction()>
		throw cc1;
	//   98  199:aload_1         
	//   99  200:athrow          
	}

	public SQLiteDatabase c()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SQLiteDatabase sqlitedatabase;
		if(c == null || !c.isOpen())
	//*   2    2:aload_0         
	//*   3    3:getfield        #262 <Field SQLiteDatabase c>
	//*   4    6:ifnull          19
	//*   5    9:aload_0         
	//*   6   10:getfield        #262 <Field SQLiteDatabase c>
	//*   7   13:invokevirtual   #265 <Method boolean SQLiteDatabase.isOpen()>
	//*   8   16:ifne            30
			c = e.getWritableDatabase();
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field dl e>
	//   12   24:invokevirtual   #270 <Method SQLiteDatabase dl.getWritableDatabase()>
	//   13   27:putfield        #262 <Field SQLiteDatabase c>
		sqlitedatabase = c;
	//   14   30:aload_0         
	//   15   31:getfield        #262 <Field SQLiteDatabase c>
	//   16   34:astore_1        
		this;
	//   17   35:aload_0         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		return sqlitedatabase;
	//   19   37:aload_1         
	//   20   38:areturn         
		Exception exception;
		exception;
	//   21   39:astore_1        
	//*  22   40:aload_0         
		throw exception;
	//   23   41:monitorexit     
	//   24   42:aload_1         
	//   25   43:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dv);
	private static final String b[] = {
		"session_id", "user_id", "event_type", "event_data", "event_guid", "timestamp"
	};
	private SQLiteDatabase c;
	private boolean d;
	private final dl e;

	static 
	{
	//    0    0:ldc1            #2   <Class dv>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//    3    8:bipush          6
	//    4   10:anewarray       String[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #32  <String "session_id">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #34  <String "user_id">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #36  <String "event_type">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #38  <String "event_data">
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #40  <String "event_guid">
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #42  <String "timestamp">
	//   28   42:aastore         
	//   29   43:putstatic       #44  <Field String[] b>
	//*  30   46:return          
	}
}
