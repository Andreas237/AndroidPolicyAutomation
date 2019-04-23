// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.support.AppboyLogger;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dd, cc, bu, t, 
//			ca, cx

public class df
	implements dd
{

	public df(cx cx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #49  <Field boolean d>
		e = cx1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #51  <Field cx e>
	//    8   14:return          
	}

	private Collection a(Cursor cursor)
	{
		JSONException jsonexception;
		Cursor cursor1 = cursor;
	//    0    0:aload_1         
	//    1    1:astore          10
		ArrayList arraylist = new ArrayList();
	//    2    3:new             #56  <Class ArrayList>
	//    3    6:dup             
	//    4    7:invokespecial   #57  <Method void ArrayList()>
	//    5   10:astore          11
		int j = cursor1.getColumnIndex("session_id");
	//    6   12:aload           10
	//    7   14:ldc1            #30  <String "session_id">
	//    8   16:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//    9   21:istore          5
		int i = cursor1.getColumnIndex("user_id");
	//   10   23:aload           10
	//   11   25:ldc1            #32  <String "user_id">
	//   12   27:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//   13   32:istore          4
		int k = cursor1.getColumnIndex("event_type");
	//   14   34:aload           10
	//   15   36:ldc1            #34  <String "event_type">
	//   16   38:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//   17   43:istore          6
		int l = cursor1.getColumnIndex("event_data");
	//   18   45:aload           10
	//   19   47:ldc1            #36  <String "event_data">
	//   20   49:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//   21   54:istore          7
		int i1 = cursor1.getColumnIndex("event_guid");
	//   22   56:aload           10
	//   23   58:ldc1            #38  <String "event_guid">
	//   24   60:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//   25   65:istore          8
		int j1 = cursor1.getColumnIndex("timestamp");
	//   26   67:aload           10
	//   27   69:ldc1            #40  <String "timestamp">
	//   28   71:invokeinterface #63  <Method int Cursor.getColumnIndex(String)>
	//   29   76:istore          9
		do
		{
			Object obj = ((Object) (cursor));
	//   30   78:aload_1         
	//   31   79:astore          10
			if(cursor.moveToNext())
	//*  32   81:aload_1         
	//*  33   82:invokeinterface #67  <Method boolean Cursor.moveToNext()>
	//*  34   87:ifeq            311
			{
				String s = ((Cursor) (obj)).getString(k);
	//   35   90:aload           10
	//   36   92:iload           6
	//   37   94:invokeinterface #71  <Method String Cursor.getString(int)>
	//   38   99:astore          12
				String s1 = ((Cursor) (obj)).getString(l);
	//   39  101:aload           10
	//   40  103:iload           7
	//   41  105:invokeinterface #71  <Method String Cursor.getString(int)>
	//   42  110:astore          13
				double d1 = ((Cursor) (obj)).getDouble(j1);
	//   43  112:aload           10
	//   44  114:iload           9
	//   45  116:invokeinterface #75  <Method double Cursor.getDouble(int)>
	//   46  121:dstore_2        
				String s2 = ((Cursor) (obj)).getString(i1);
	//   47  122:aload           10
	//   48  124:iload           8
	//   49  126:invokeinterface #71  <Method String Cursor.getString(int)>
	//   50  131:astore          14
				String s3 = ((Cursor) (obj)).getString(i);
	//   51  133:aload           10
	//   52  135:iload           4
	//   53  137:invokeinterface #71  <Method String Cursor.getString(int)>
	//   54  142:astore          15
				obj = ((Object) (((Cursor) (obj)).getString(j)));
	//   55  144:aload           10
	//   56  146:iload           5
	//   57  148:invokeinterface #71  <Method String Cursor.getString(int)>
	//   58  153:astore          10
				String s4;
				StringBuilder stringbuilder;
				try
				{
					((List) (arraylist)).add(((Object) (cc.a(s, s1, d1, s2, s3, ((String) (obj))))));
	//   59  155:aload           11
	//   60  157:aload           12
	//   61  159:aload           13
	//   62  161:dload_2         
	//   63  162:aload           14
	//   64  164:aload           15
	//   65  166:aload           10
	//   66  168:invokestatic    #80  <Method cc cc.a(String, String, double, String, String, String)>
	//   67  171:invokeinterface #86  <Method boolean List.add(Object)>
	//   68  176:pop             
				}
	//*  69  177:goto            308
	//*  70  180:getstatic       #26  <Field String a>
	//*  71  183:astore          16
	//*  72  185:new             #88  <Class StringBuilder>
	//*  73  188:dup             
	//*  74  189:invokespecial   #89  <Method void StringBuilder()>
	//*  75  192:astore          17
	//*  76  194:aload           17
	//*  77  196:ldc1            #91  <String "Could not create AppboyEvent from [type=">
	//*  78  198:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  79  201:pop             
	//*  80  202:aload           17
	//*  81  204:aload           12
	//*  82  206:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  83  209:pop             
	//*  84  210:aload           17
	//*  85  212:ldc1            #97  <String ", data=">
	//*  86  214:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  87  217:pop             
	//*  88  218:aload           17
	//*  89  220:aload           13
	//*  90  222:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  91  225:pop             
	//*  92  226:aload           17
	//*  93  228:ldc1            #99  <String ", timestamp=">
	//*  94  230:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  95  233:pop             
	//*  96  234:aload           17
	//*  97  236:dload_2         
	//*  98  237:invokevirtual   #102 <Method StringBuilder StringBuilder.append(double)>
	//*  99  240:pop             
	//* 100  241:aload           17
	//* 101  243:ldc1            #104 <String ", uniqueId=">
	//* 102  245:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 103  248:pop             
	//* 104  249:aload           17
	//* 105  251:aload           14
	//* 106  253:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 107  256:pop             
	//* 108  257:aload           17
	//* 109  259:ldc1            #106 <String ", userId=">
	//* 110  261:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 111  264:pop             
	//* 112  265:aload           17
	//* 113  267:aload           15
	//* 114  269:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 115  272:pop             
	//* 116  273:aload           17
	//* 117  275:ldc1            #108 <String ", sessionId=">
	//* 118  277:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 119  280:pop             
	//* 120  281:aload           17
	//* 121  283:aload           10
	//* 122  285:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 123  288:pop             
	//* 124  289:aload           17
	//* 125  291:ldc1            #110 <String "] ... Skipping">
	//* 126  293:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//* 127  296:pop             
	//* 128  297:aload           16
	//* 129  299:aload           17
	//* 130  301:invokevirtual   #114 <Method String StringBuilder.toString()>
	//* 131  304:invokestatic    #117 <Method int AppboyLogger.e(String, String)>
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

	private ContentValues c(bu bu1)
	{
		ContentValues contentvalues = new ContentValues();
	//    0    0:new             #122 <Class ContentValues>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void ContentValues()>
	//    3    7:astore_2        
		contentvalues.put("event_type", bu1.b().a());
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "event_type">
	//    6   11:aload_1         
	//    7   12:invokeinterface #128 <Method t bu.b()>
	//    8   17:invokevirtual   #132 <Method String t.a()>
	//    9   20:invokevirtual   #136 <Method void ContentValues.put(String, String)>
		contentvalues.put("event_data", bu1.c().toString());
	//   10   23:aload_2         
	//   11   24:ldc1            #36  <String "event_data">
	//   12   26:aload_1         
	//   13   27:invokeinterface #139 <Method JSONObject bu.c()>
	//   14   32:invokevirtual   #142 <Method String JSONObject.toString()>
	//   15   35:invokevirtual   #136 <Method void ContentValues.put(String, String)>
		contentvalues.put("timestamp", Double.valueOf(bu1.a()));
	//   16   38:aload_2         
	//   17   39:ldc1            #40  <String "timestamp">
	//   18   41:aload_1         
	//   19   42:invokeinterface #145 <Method double bu.a()>
	//   20   47:invokestatic    #151 <Method Double Double.valueOf(double)>
	//   21   50:invokevirtual   #154 <Method void ContentValues.put(String, Double)>
		if(bu1.f() != null)
	//*  22   53:aload_1         
	//*  23   54:invokeinterface #158 <Method ca bu.f()>
	//*  24   59:ifnull          77
			contentvalues.put("session_id", bu1.f().toString());
	//   25   62:aload_2         
	//   26   63:ldc1            #30  <String "session_id">
	//   27   65:aload_1         
	//   28   66:invokeinterface #158 <Method ca bu.f()>
	//   29   71:invokevirtual   #161 <Method String ca.toString()>
	//   30   74:invokevirtual   #136 <Method void ContentValues.put(String, String)>
		if(bu1.e() != null)
	//*  31   77:aload_1         
	//*  32   78:invokeinterface #163 <Method String bu.e()>
	//*  33   83:ifnull          98
			contentvalues.put("user_id", bu1.e());
	//   34   86:aload_2         
	//   35   87:ldc1            #32  <String "user_id">
	//   36   89:aload_1         
	//   37   90:invokeinterface #163 <Method String bu.e()>
	//   38   95:invokevirtual   #136 <Method void ContentValues.put(String, String)>
		if(bu1.d() != null)
	//*  39   98:aload_1         
	//*  40   99:invokeinterface #165 <Method String bu.d()>
	//*  41  104:ifnull          119
			contentvalues.put("event_guid", bu1.d());
	//   42  107:aload_2         
	//   43  108:ldc1            #38  <String "event_guid">
	//   44  110:aload_1         
	//   45  111:invokeinterface #165 <Method String bu.d()>
	//   46  116:invokevirtual   #136 <Method void ContentValues.put(String, String)>
		return contentvalues;
	//   47  119:aload_2         
	//   48  120:areturn         
	}

	public Collection a()
	{
		Cursor cursor;
		boolean flag = d;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean d>
	//    2    4:istore_1        
		cursor = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            22
		{
			AppboyLogger.w(a, "Storage provider is closed. Not getting all events.");
	//    7   11:getstatic       #26  <Field String a>
	//    8   14:ldc1            #169 <String "Storage provider is closed. Not getting all events.">
	//    9   16:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//   10   19:pop             
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		}
		Cursor cursor1 = c().query("ab_events", b, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
	//   13   22:aload_0         
	//   14   23:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   15   26:ldc1            #177 <String "ab_events">
	//   16   28:getstatic       #42  <Field String[] b>
	//   17   31:aconst_null     
	//   18   32:aconst_null     
	//   19   33:aconst_null     
	//   20   34:aconst_null     
	//   21   35:aconst_null     
	//   22   36:invokevirtual   #183 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   23   39:astore_3        
		cursor = cursor1;
	//   24   40:aload_3         
	//   25   41:astore_2        
		Collection collection = a(cursor1);
	//   26   42:aload_0         
	//   27   43:aload_3         
	//   28   44:invokespecial   #185 <Method Collection a(Cursor)>
	//   29   47:astore          4
		if(cursor1 != null)
	//*  30   49:aload_3         
	//*  31   50:ifnull          59
			cursor1.close();
	//   32   53:aload_3         
	//   33   54:invokeinterface #188 <Method void Cursor.close()>
		return collection;
	//   34   59:aload           4
	//   35   61:areturn         
		Exception exception;
		exception;
	//   36   62:astore_3        
		if(cursor != null)
	//*  37   63:aload_2         
	//*  38   64:ifnull          73
			cursor.close();
	//   39   67:aload_2         
	//   40   68:invokeinterface #188 <Method void Cursor.close()>
		throw exception;
	//   41   73:aload_3         
	//   42   74:athrow          
	}

	public void a(bu bu1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #26  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #88  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #89  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not adding event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #193 <String "Storage provider is closed. Not adding event: ">
	//   11   22:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (bu1)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		}
		ContentValues contentvalues = c(bu1);
	//   23   42:aload_0         
	//   24   43:aload_1         
	//   25   44:invokespecial   #198 <Method ContentValues c(bu)>
	//   26   47:astore_2        
		if(c().insert("ab_events", ((String) (null)), contentvalues) == -1L)
	//*  27   48:aload_0         
	//*  28   49:invokevirtual   #175 <Method SQLiteDatabase c()>
	//*  29   52:ldc1            #177 <String "ab_events">
	//*  30   54:aconst_null     
	//*  31   55:aload_2         
	//*  32   56:invokevirtual   #202 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//*  33   59:ldc2w           #203 <Long -1L>
	//*  34   62:lcmp            
	//*  35   63:ifne            110
		{
			String s1 = a;
	//   36   66:getstatic       #26  <Field String a>
	//   37   69:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   70:new             #88  <Class StringBuilder>
	//   39   73:dup             
	//   40   74:invokespecial   #89  <Method void StringBuilder()>
	//   41   77:astore_3        
			stringbuilder1.append("Failed to add event [");
	//   42   78:aload_3         
	//   43   79:ldc1            #206 <String "Failed to add event [">
	//   44   81:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			stringbuilder1.append(((Object) (bu1)).toString());
	//   46   85:aload_3         
	//   47   86:aload_1         
	//   48   87:invokevirtual   #207 <Method String Object.toString()>
	//   49   90:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   50   93:pop             
			stringbuilder1.append("] to storage");
	//   51   94:aload_3         
	//   52   95:ldc1            #209 <String "] to storage">
	//   53   97:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
			AppboyLogger.w(s1, stringbuilder1.toString());
	//   55  101:aload_2         
	//   56  102:aload_3         
	//   57  103:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   58  106:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//   59  109:pop             
		}
	//   60  110:return          
	}

	public void b()
	{
		AppboyLogger.w(a, "Closing SQL database and setting this provider to closed.");
	//    0    0:getstatic       #26  <Field String a>
	//    1    3:ldc1            #211 <String "Closing SQL database and setting this provider to closed.">
	//    2    5:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//    3    8:pop             
		d = true;
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:putfield        #49  <Field boolean d>
		c().close();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #175 <Method SQLiteDatabase c()>
	//    9   18:invokevirtual   #212 <Method void SQLiteDatabase.close()>
	//   10   21:return          
	}

	public void b(bu bu1)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean d>
	//*   2    4:ifeq            46
		{
			String s = a;
	//    3    7:getstatic       #26  <Field String a>
	//    4   10:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #88  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #89  <Method void StringBuilder()>
	//    8   18:astore          4
			stringbuilder.append("Storage provider is closed. Not deleting event: ");
	//    9   20:aload           4
	//   10   22:ldc1            #214 <String "Storage provider is closed. Not deleting event: ">
	//   11   24:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			stringbuilder.append(((Object) (bu1)));
	//   13   28:aload           4
	//   14   30:aload_1         
	//   15   31:invokevirtual   #196 <Method StringBuilder StringBuilder.append(Object)>
	//   16   34:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   35:aload_3         
	//   18   36:aload           4
	//   19   38:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #172 <Method int AppboyLogger.w(String, String)>
	//   21   44:pop             
			return;
	//   22   45:return          
		}
		c().beginTransaction();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   25   50:invokevirtual   #217 <Method void SQLiteDatabase.beginTransaction()>
		String s1 = bu1.d();
	//   26   53:aload_1         
	//   27   54:invokeinterface #165 <Method String bu.d()>
	//   28   59:astore_3        
		int i = c().delete("ab_events", "event_guid = ?", new String[] {
			s1
		});
	//   29   60:aload_0         
	//   30   61:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   31   64:ldc1            #177 <String "ab_events">
	//   32   66:ldc1            #219 <String "event_guid = ?">
	//   33   68:iconst_1        
	//   34   69:anewarray       String[]
	//   35   72:dup             
	//   36   73:iconst_0        
	//   37   74:aload_3         
	//   38   75:aastore         
	//   39   76:invokevirtual   #223 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   40   79:istore_2        
		s1 = a;
	//   41   80:getstatic       #26  <Field String a>
	//   42   83:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   43   84:new             #88  <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #89  <Method void StringBuilder()>
	//   46   91:astore          4
		stringbuilder1.append("Deleting event with uid ");
	//   47   93:aload           4
	//   48   95:ldc1            #225 <String "Deleting event with uid ">
	//   49   97:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   50  100:pop             
		stringbuilder1.append(bu1.d());
	//   51  101:aload           4
	//   52  103:aload_1         
	//   53  104:invokeinterface #165 <Method String bu.d()>
	//   54  109:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   55  112:pop             
		stringbuilder1.append(" removed ");
	//   56  113:aload           4
	//   57  115:ldc1            #227 <String " removed ">
	//   58  117:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
		stringbuilder1.append(i);
	//   60  121:aload           4
	//   61  123:iload_2         
	//   62  124:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   63  127:pop             
		stringbuilder1.append(" row.");
	//   64  128:aload           4
	//   65  130:ldc1            #232 <String " row.">
	//   66  132:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
		AppboyLogger.d(s1, stringbuilder1.toString(), false);
	//   68  136:aload_3         
	//   69  137:aload           4
	//   70  139:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   71  142:iconst_0        
	//   72  143:invokestatic    #235 <Method int AppboyLogger.d(String, String, boolean)>
	//   73  146:pop             
		c().setTransactionSuccessful();
	//   74  147:aload_0         
	//   75  148:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   76  151:invokevirtual   #238 <Method void SQLiteDatabase.setTransactionSuccessful()>
		c().endTransaction();
	//   77  154:aload_0         
	//   78  155:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   79  158:invokevirtual   #241 <Method void SQLiteDatabase.endTransaction()>
		return;
	//   80  161:return          
		bu1;
	//   81  162:astore_1        
		c().endTransaction();
	//   82  163:aload_0         
	//   83  164:invokevirtual   #175 <Method SQLiteDatabase c()>
	//   84  167:invokevirtual   #241 <Method void SQLiteDatabase.endTransaction()>
		throw bu1;
	//   85  170:aload_1         
	//   86  171:athrow          
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
	//*   3    3:getfield        #243 <Field SQLiteDatabase c>
	//*   4    6:ifnull          19
	//*   5    9:aload_0         
	//*   6   10:getfield        #243 <Field SQLiteDatabase c>
	//*   7   13:invokevirtual   #246 <Method boolean SQLiteDatabase.isOpen()>
	//*   8   16:ifne            30
			c = e.getWritableDatabase();
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #51  <Field cx e>
	//   12   24:invokevirtual   #251 <Method SQLiteDatabase cx.getWritableDatabase()>
	//   13   27:putfield        #243 <Field SQLiteDatabase c>
		sqlitedatabase = c;
	//   14   30:aload_0         
	//   15   31:getfield        #243 <Field SQLiteDatabase c>
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

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/df);
	private static final String b[] = {
		"session_id", "user_id", "event_type", "event_data", "event_guid", "timestamp"
	};
	private SQLiteDatabase c;
	private boolean d;
	private final cx e;

	static 
	{
	//    0    0:ldc1            #2   <Class df>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//    3    8:bipush          6
	//    4   10:anewarray       String[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #30  <String "session_id">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #32  <String "user_id">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #34  <String "event_type">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #36  <String "event_data">
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #38  <String "event_guid">
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #40  <String "timestamp">
	//   28   42:aastore         
	//   29   43:putstatic       #42  <Field String[] b>
	//*  30   46:return          
	}
}
