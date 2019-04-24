// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;

public class dht
{

	public dht()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static boolean a(Context context)
	{
		if("1".equalsIgnoreCase(c(context, "have_cloud_or_not")))
	//*   0    0:ldc1            #51  <String "1">
	//*   1    2:aload_0         
	//*   2    3:ldc1            #53  <String "have_cloud_or_not">
	//*   3    5:invokestatic    #57  <Method String c(Context, String)>
	//*   4    8:invokevirtual   #61  <Method boolean String.equalsIgnoreCase(String)>
	//*   5   11:ifeq            24
		{
			Log.i("LogUtil_DataAccessLayer", "getOverseaFlagFromDB false");
	//    6   14:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//    7   16:ldc1            #65  <String "getOverseaFlagFromDB false">
	//    8   18:invokestatic    #71  <Method int Log.i(String, String)>
	//    9   21:pop             
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		} else
		{
			Log.i("LogUtil_DataAccessLayer", "getOverseaFlagFromDB true");
	//   12   24:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//   13   26:ldc1            #73  <String "getOverseaFlagFromDB true">
	//   14   28:invokestatic    #71  <Method int Log.i(String, String)>
	//   15   31:pop             
			return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		}
	}

	private static Uri b(String s)
	{
		return Uri.parse(a + s);
	//    0    0:new             #76  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuffer()>
	//    3    7:getstatic       #44  <Field String a>
	//    4   10:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//    7   17:invokevirtual   #81  <Method String StringBuffer.toString()>
	//    8   20:invokestatic    #86  <Method Uri Uri.parse(String)>
	//    9   23:areturn         
	}

	private static String c(Context context, String s)
	{
		Object obj;
		String s1;
		Context context1;
		String s2;
		Context context2;
		String s3;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		s3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       20
		{
			Log.i("LogUtil_DataAccessLayer", "getValue, key is null");
	//    6   10:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//    7   12:ldc1            #92  <String "getValue, key is null">
	//    8   14:invokestatic    #71  <Method int Log.i(String, String)>
	//    9   17:pop             
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		context2 = null;
	//   12   20:aconst_null     
	//   13   21:astore          6
		obj = null;
	//   14   23:aconst_null     
	//   15   24:astore_2        
		context1 = null;
	//   16   25:aconst_null     
	//   17   26:astore          4
		s1 = s3;
	//   18   28:aload           7
	//   19   30:astore_3        
		s2 = ((String) (obj1));
	//   20   31:aload           8
	//   21   33:astore          5
		context = ((Context) (context.getContentResolver().query(d, b, "key = ?", new String[] {
			s
		}, ((String) (null)))));
	//   22   35:aload_0         
	//   23   36:invokevirtual   #98  <Method ContentResolver Context.getContentResolver()>
	//   24   39:getstatic       #100 <Field Uri d>
	//   25   42:getstatic       #21  <Field String[] b>
	//   26   45:ldc1            #102 <String "key = ?">
	//   27   47:iconst_1        
	//   28   48:anewarray       String[]
	//   29   51:dup             
	//   30   52:iconst_0        
	//   31   53:aload_1         
	//   32   54:aastore         
	//   33   55:aconst_null     
	//   34   56:invokevirtual   #108 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   35   59:astore_0        
		if(context != null)
			break MISSING_BLOCK_LABEL_121;
	//   36   60:aload_0         
	//   37   61:ifnonnull       121
		s1 = s3;
	//   38   64:aload           7
	//   39   66:astore_3        
		context1 = context;
	//   40   67:aload_0         
	//   41   68:astore          4
		s2 = ((String) (obj1));
	//   42   70:aload           8
	//   43   72:astore          5
		context2 = context;
	//   44   74:aload_0         
	//   45   75:astore          6
		obj = ((Object) (context));
	//   46   77:aload_0         
	//   47   78:astore_2        
		Log.w("LogUtil_DataAccessLayer", (new StringBuilder()).append("getValue, key = ").append(s).append(", cursor==null,return null").toString());
	//   48   79:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//   49   81:new             #27  <Class StringBuilder>
	//   50   84:dup             
	//   51   85:invokespecial   #30  <Method void StringBuilder()>
	//   52   88:ldc1            #110 <String "getValue, key = ">
	//   53   90:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   54   93:aload_1         
	//   55   94:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   56   97:ldc1            #112 <String ", cursor==null,return null">
	//   57   99:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   58  102:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   59  105:invokestatic    #115 <Method int Log.w(String, String)>
	//   60  108:pop             
		if(context != null)
	//*  61  109:aload_0         
	//*  62  110:ifnull          119
			((Cursor) (context)).close();
	//   63  113:aload_0         
	//   64  114:invokeinterface #120 <Method void Cursor.close()>
		return null;
	//   65  119:aconst_null     
	//   66  120:areturn         
		s1 = s3;
	//   67  121:aload           7
	//   68  123:astore_3        
		context1 = context;
	//   69  124:aload_0         
	//   70  125:astore          4
		s2 = ((String) (obj1));
	//   71  127:aload           8
	//   72  129:astore          5
		context2 = context;
	//   73  131:aload_0         
	//   74  132:astore          6
		obj = ((Object) (context));
	//   75  134:aload_0         
	//   76  135:astore_2        
		if(((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_202;
	//   77  136:aload_0         
	//   78  137:invokeinterface #124 <Method boolean Cursor.moveToFirst()>
	//   79  142:ifne            202
		s1 = s3;
	//   80  145:aload           7
	//   81  147:astore_3        
		context1 = context;
	//   82  148:aload_0         
	//   83  149:astore          4
		s2 = ((String) (obj1));
	//   84  151:aload           8
	//   85  153:astore          5
		context2 = context;
	//   86  155:aload_0         
	//   87  156:astore          6
		obj = ((Object) (context));
	//   88  158:aload_0         
	//   89  159:astore_2        
		Log.w("LogUtil_DataAccessLayer", (new StringBuilder()).append("getValue, key = ").append(s).append(", cursor moveToFirst failed,reutrn null").toString());
	//   90  160:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//   91  162:new             #27  <Class StringBuilder>
	//   92  165:dup             
	//   93  166:invokespecial   #30  <Method void StringBuilder()>
	//   94  169:ldc1            #110 <String "getValue, key = ">
	//   95  171:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   96  174:aload_1         
	//   97  175:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   98  178:ldc1            #126 <String ", cursor moveToFirst failed,reutrn null">
	//   99  180:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  100  183:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  101  186:invokestatic    #115 <Method int Log.w(String, String)>
	//  102  189:pop             
		if(context != null)
	//* 103  190:aload_0         
	//* 104  191:ifnull          200
			((Cursor) (context)).close();
	//  105  194:aload_0         
	//  106  195:invokeinterface #120 <Method void Cursor.close()>
		return null;
	//  107  200:aconst_null     
	//  108  201:areturn         
		s1 = s3;
	//  109  202:aload           7
	//  110  204:astore_3        
		context1 = context;
	//  111  205:aload_0         
	//  112  206:astore          4
		s2 = ((String) (obj1));
	//  113  208:aload           8
	//  114  210:astore          5
		context2 = context;
	//  115  212:aload_0         
	//  116  213:astore          6
		obj = ((Object) (context));
	//  117  215:aload_0         
	//  118  216:astore_2        
		s3 = ((Cursor) (context)).getString(1);
	//  119  217:aload_0         
	//  120  218:iconst_1        
	//  121  219:invokeinterface #130 <Method String Cursor.getString(int)>
	//  122  224:astore          7
		s1 = s3;
	//  123  226:aload           7
	//  124  228:astore_3        
		context1 = context;
	//  125  229:aload_0         
	//  126  230:astore          4
		s2 = s3;
	//  127  232:aload           7
	//  128  234:astore          5
		context2 = context;
	//  129  236:aload_0         
	//  130  237:astore          6
		obj = ((Object) (context));
	//  131  239:aload_0         
	//  132  240:astore_2        
		((Cursor) (context)).close();
	//  133  241:aload_0         
	//  134  242:invokeinterface #120 <Method void Cursor.close()>
		obj = ((Object) (s3));
	//  135  247:aload           7
	//  136  249:astore_2        
		if(context != null)
	//* 137  250:aload_0         
	//* 138  251:ifnull          383
		{
			((Cursor) (context)).close();
	//  139  254:aload_0         
	//  140  255:invokeinterface #120 <Method void Cursor.close()>
			obj = ((Object) (s3));
	//  141  260:aload           7
	//  142  262:astore_2        
		}
		break MISSING_BLOCK_LABEL_383;
	//  143  263:goto            383
		context;
	//  144  266:astore_0        
		obj = ((Object) (context1));
	//  145  267:aload           4
	//  146  269:astore_2        
		Log.e("LogUtil_DataAccessLayer", (new StringBuilder()).append("queryStorage error: ").append(((SQLException) (context)).getMessage()).toString());
	//  147  270:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//  148  272:new             #27  <Class StringBuilder>
	//  149  275:dup             
	//  150  276:invokespecial   #30  <Method void StringBuilder()>
	//  151  279:ldc1            #132 <String "queryStorage error: ">
	//  152  281:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  153  284:aload_0         
	//  154  285:invokevirtual   #135 <Method String SQLException.getMessage()>
	//  155  288:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  156  291:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  157  294:invokestatic    #137 <Method int Log.e(String, String)>
	//  158  297:pop             
		obj = ((Object) (s1));
	//  159  298:aload_3         
	//  160  299:astore_2        
		if(context1 != null)
	//* 161  300:aload           4
	//* 162  302:ifnull          383
		{
			((Cursor) (context1)).close();
	//  163  305:aload           4
	//  164  307:invokeinterface #120 <Method void Cursor.close()>
			obj = ((Object) (s1));
	//  165  312:aload_3         
	//  166  313:astore_2        
		}
		break MISSING_BLOCK_LABEL_383;
	//  167  314:goto            383
		context;
	//  168  317:astore_0        
		obj = ((Object) (context2));
	//  169  318:aload           6
	//  170  320:astore_2        
		Log.e("LogUtil_DataAccessLayer", (new StringBuilder()).append("queryStorage Exception error: ").append(((Exception) (context)).getMessage()).toString());
	//  171  321:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//  172  323:new             #27  <Class StringBuilder>
	//  173  326:dup             
	//  174  327:invokespecial   #30  <Method void StringBuilder()>
	//  175  330:ldc1            #139 <String "queryStorage Exception error: ">
	//  176  332:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  177  335:aload_0         
	//  178  336:invokevirtual   #140 <Method String Exception.getMessage()>
	//  179  339:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  180  342:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  181  345:invokestatic    #137 <Method int Log.e(String, String)>
	//  182  348:pop             
		obj = ((Object) (s2));
	//  183  349:aload           5
	//  184  351:astore_2        
		if(context2 != null)
	//* 185  352:aload           6
	//* 186  354:ifnull          383
		{
			((Cursor) (context2)).close();
	//  187  357:aload           6
	//  188  359:invokeinterface #120 <Method void Cursor.close()>
			obj = ((Object) (s2));
	//  189  364:aload           5
	//  190  366:astore_2        
		}
		break MISSING_BLOCK_LABEL_383;
	//  191  367:goto            383
		context;
	//  192  370:astore_0        
		if(obj != null)
	//* 193  371:aload_2         
	//* 194  372:ifnull          381
			((Cursor) (obj)).close();
	//  195  375:aload_2         
	//  196  376:invokeinterface #120 <Method void Cursor.close()>
		throw context;
	//  197  381:aload_0         
	//  198  382:athrow          
		Log.i("LogUtil_DataAccessLayer", (new StringBuilder()).append("getValue, key = ").append(s).append(", value=").append(((String) (obj))).toString());
	//  199  383:ldc1            #63  <String "LogUtil_DataAccessLayer">
	//  200  385:new             #27  <Class StringBuilder>
	//  201  388:dup             
	//  202  389:invokespecial   #30  <Method void StringBuilder()>
	//  203  392:ldc1            #110 <String "getValue, key = ">
	//  204  394:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  205  397:aload_1         
	//  206  398:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  207  401:ldc1            #142 <String ", value=">
	//  208  403:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  209  406:aload_2         
	//  210  407:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  211  410:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  212  413:invokestatic    #71  <Method int Log.i(String, String)>
	//  213  416:pop             
		return ((String) (obj));
	//  214  417:aload_2         
	//  215  418:areturn         
	}

	private static void e()
	{
		d = b("module_200007_keyvaldb");
	//    0    0:ldc1            #144 <String "module_200007_keyvaldb">
	//    1    2:invokestatic    #146 <Method Uri b(String)>
	//    2    5:putstatic       #100 <Field Uri d>
	//    3    8:return          
	}

	private static String a;
	private static final String b[] = {
		"key", "value"
	};
	private static Uri d;
	private static String e;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #17  <String "key">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #19  <String "value">
	//    9   13:aastore         
	//   10   14:putstatic       #21  <Field String[] b>
		e = "com.huawei.health.version.provider";
	//   11   17:ldc1            #23  <String "com.huawei.health.version.provider">
	//   12   19:putstatic       #25  <Field String e>
		a = (new StringBuilder()).append("content://").append(e).append("/").toString();
	//   13   22:new             #27  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #30  <Method void StringBuilder()>
	//   16   29:ldc1            #32  <String "content://">
	//   17   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:getstatic       #25  <Field String e>
	//   19   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:ldc1            #38  <String "/">
	//   21   42:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   23   48:putstatic       #44  <Field String a>
		e();
	//   24   51:invokestatic    #46  <Method void e()>
	//*  25   54:return          
	}
}
