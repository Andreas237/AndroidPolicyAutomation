// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.*;
import com.appboy.models.AppboyGeofence;
import com.appboy.receivers.AppboyActionReceiver;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			dx

public final class ee
{

	public ee()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static PendingIntent a(Context context)
	{
		return PendingIntent.getBroadcast(context, 0, (new Intent("com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE")).setClass(context, com/appboy/receivers/AppboyActionReceiver), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:new             #24  <Class Intent>
	//    3    5:dup             
	//    4    6:ldc1            #26  <String "com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE">
	//    5    8:invokespecial   #29  <Method void Intent(String)>
	//    6   11:aload_0         
	//    7   12:ldc1            #31  <Class AppboyActionReceiver>
	//    8   14:invokevirtual   #35  <Method Intent Intent.setClass(Context, Class)>
	//    9   17:ldc1            #36  <Int 0x8000000>
	//   10   19:invokestatic    #42  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   11   22:areturn         
	}

	public static List a(SharedPreferences sharedpreferences)
	{
		ArrayList arraylist;
		Object obj;
		arraylist = new ArrayList();
	//    0    0:new             #49  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void ArrayList()>
	//    3    7:astore_1        
		obj = ((Object) (sharedpreferences.getAll()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #56  <Method Map SharedPreferences.getAll()>
	//    6   14:astore_2        
		if(obj == null || ((Map) (obj)).size() == 0)
	//*   7   15:aload_2         
	//*   8   16:ifnull          278
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #62  <Method int Map.size()>
	//*  11   25:ifne            31
			break MISSING_BLOCK_LABEL_278;
	//   12   28:goto            278
		obj = ((Object) (((Map) (obj)).keySet()));
	//   13   31:aload_2         
	//   14   32:invokeinterface #66  <Method Set Map.keySet()>
	//   15   37:astore_2        
		if(obj == null || ((Set) (obj)).size() == 0)
	//*  16   38:aload_2         
	//*  17   39:ifnull          267
	//*  18   42:aload_2         
	//*  19   43:invokeinterface #69  <Method int Set.size()>
	//*  20   48:ifne            54
			break MISSING_BLOCK_LABEL_267;
	//   21   51:goto            267
		obj = ((Object) (((Set) (obj)).iterator()));
	//   22   54:aload_2         
	//   23   55:invokeinterface #73  <Method Iterator Set.iterator()>
	//   24   60:astore_2        
_L2:
		String s;
		String s1;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   25   61:aload_2         
	//   26   62:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   27   67:ifeq            265
		s1 = (String)((Iterator) (obj)).next();
	//   28   70:aload_2         
	//   29   71:invokeinterface #83  <Method Object Iterator.next()>
	//   30   76:checkcast       #85  <Class String>
	//   31   79:astore          4
		s = sharedpreferences.getString(s1, ((String) (null)));
	//   32   81:aload_0         
	//   33   82:aload           4
	//   34   84:aconst_null     
	//   35   85:invokeinterface #89  <Method String SharedPreferences.getString(String, String)>
	//   36   90:astore_3        
		if(StringUtils.isNullOrBlank(s))
	//*  37   91:aload_3         
	//*  38   92:invokestatic    #95  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  39   95:ifeq            150
		{
			String s2 = a;
	//   40   98:getstatic       #17  <Field String a>
	//   41  101:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   42  103:new             #97  <Class StringBuilder>
	//   43  106:dup             
	//   44  107:invokespecial   #98  <Method void StringBuilder()>
	//   45  110:astore          6
			stringbuilder.append("Received null or blank serialized  geofence string for geofence id ");
	//   46  112:aload           6
	//   47  114:ldc1            #100 <String "Received null or blank serialized  geofence string for geofence id ">
	//   48  116:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   49  119:pop             
			stringbuilder.append(s1);
	//   50  120:aload           6
	//   51  122:aload           4
	//   52  124:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   53  127:pop             
			stringbuilder.append(" from shared preferences. Not parsing.");
	//   54  128:aload           6
	//   55  130:ldc1            #106 <String " from shared preferences. Not parsing.">
	//   56  132:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   57  135:pop             
			AppboyLogger.w(s2, stringbuilder.toString());
	//   58  136:aload           5
	//   59  138:aload           6
	//   60  140:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   61  143:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//   62  146:pop             
			continue; /* Loop/switch isn't completed */
	//   63  147:goto            61
		}
		try
		{
			((List) (arraylist)).add(((Object) (new AppboyGeofence(JSONObjectInstrumentation.init(s)))));
	//   64  150:aload_1         
	//   65  151:new             #116 <Class AppboyGeofence>
	//   66  154:dup             
	//   67  155:aload_3         
	//   68  156:invokestatic    #122 <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//   69  159:invokespecial   #125 <Method void AppboyGeofence(org.json.JSONObject)>
	//   70  162:invokeinterface #131 <Method boolean List.add(Object)>
	//   71  167:pop             
		}
	//*  72  168:goto            61
	//*  73  171:astore          4
	//*  74  173:getstatic       #17  <Field String a>
	//*  75  176:astore          5
	//*  76  178:new             #97  <Class StringBuilder>
	//*  77  181:dup             
	//*  78  182:invokespecial   #98  <Method void StringBuilder()>
	//*  79  185:astore          6
	//*  80  187:aload           6
	//*  81  189:ldc1            #133 <String "Encountered unexpected exception while parsing stored geofence: ">
	//*  82  191:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  83  194:pop             
	//*  84  195:aload           6
	//*  85  197:aload_3         
	//*  86  198:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  87  201:pop             
	//*  88  202:aload           5
	//*  89  204:aload           6
	//*  90  206:invokevirtual   #110 <Method String StringBuilder.toString()>
	//*  91  209:aload           4
	//*  92  211:invokestatic    #137 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  93  214:pop             
	//*  94  215:goto            61
		catch(JSONException jsonexception)
	//*  95  218:astore          4
		{
			String s4 = a;
	//   96  220:getstatic       #17  <Field String a>
	//   97  223:astore          5
			StringBuilder stringbuilder2 = new StringBuilder();
	//   98  225:new             #97  <Class StringBuilder>
	//   99  228:dup             
	//  100  229:invokespecial   #98  <Method void StringBuilder()>
	//  101  232:astore          6
			stringbuilder2.append("Encountered Json exception while parsing stored geofence: ");
	//  102  234:aload           6
	//  103  236:ldc1            #139 <String "Encountered Json exception while parsing stored geofence: ">
	//  104  238:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  105  241:pop             
			stringbuilder2.append(s);
	//  106  242:aload           6
	//  107  244:aload_3         
	//  108  245:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  109  248:pop             
			AppboyLogger.e(s4, stringbuilder2.toString(), ((Throwable) (jsonexception)));
	//  110  249:aload           5
	//  111  251:aload           6
	//  112  253:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  113  256:aload           4
	//  114  258:invokestatic    #137 <Method int AppboyLogger.e(String, String, Throwable)>
	//  115  261:pop             
		}
		catch(Exception exception)
		{
			String s3 = a;
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Encountered unexpected exception while parsing stored geofence: ");
			stringbuilder1.append(s);
			AppboyLogger.e(s3, stringbuilder1.toString(), ((Throwable) (exception)));
		}
		if(true) goto _L2; else goto _L1
	//  116  262:goto            61
_L1:
		return ((List) (arraylist));
	//  117  265:aload_1         
	//  118  266:areturn         
		AppboyLogger.w(a, "Failed to find stored geofence keys.");
	//  119  267:getstatic       #17  <Field String a>
	//  120  270:ldc1            #141 <String "Failed to find stored geofence keys.">
	//  121  272:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//  122  275:pop             
		return ((List) (arraylist));
	//  123  276:aload_1         
	//  124  277:areturn         
		AppboyLogger.d(a, "Did not find stored geofences.");
	//  125  278:getstatic       #17  <Field String a>
	//  126  281:ldc1            #143 <String "Did not find stored geofences.">
	//  127  283:invokestatic    #146 <Method int AppboyLogger.d(String, String)>
	//  128  286:pop             
		return ((List) (arraylist));
	//  129  287:aload_1         
	//  130  288:areturn         
	}

	public static boolean a(dx dx1)
	{
		if(dx1.a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #153 <Method boolean dx.a()>
	//*   2    4:ifeq            36
		{
			if(dx1.b())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #156 <Method boolean dx.b()>
	//*   5   11:ifeq            25
			{
				AppboyLogger.i(a, "Geofences enabled in server configuration.");
	//    6   14:getstatic       #17  <Field String a>
	//    7   17:ldc1            #158 <String "Geofences enabled in server configuration.">
	//    8   19:invokestatic    #161 <Method int AppboyLogger.i(String, String)>
	//    9   22:pop             
				return true;
	//   10   23:iconst_1        
	//   11   24:ireturn         
			} else
			{
				AppboyLogger.i(a, "Geofences explicitly disabled via server configuration.");
	//   12   25:getstatic       #17  <Field String a>
	//   13   28:ldc1            #163 <String "Geofences explicitly disabled via server configuration.">
	//   14   30:invokestatic    #161 <Method int AppboyLogger.i(String, String)>
	//   15   33:pop             
				return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
			}
		} else
		{
			AppboyLogger.i(a, "Geofences implicitly disabled via server configuration.");
	//   18   36:getstatic       #17  <Field String a>
	//   19   39:ldc1            #165 <String "Geofences implicitly disabled via server configuration.">
	//   20   41:invokestatic    #161 <Method int AppboyLogger.i(String, String)>
	//   21   44:pop             
			return false;
	//   22   45:iconst_0        
	//   23   46:ireturn         
		}
	}

	public static int b(dx dx1)
	{
		if(dx1.e() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int dx.e()>
	//*   2    4:ifle            12
			return dx1.e();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #168 <Method int dx.e()>
	//    5   11:ireturn         
		else
			return 20;
	//    6   12:bipush          20
	//    7   14:ireturn         
	}

	public static PendingIntent b(Context context)
	{
		return PendingIntent.getBroadcast(context, 0, (new Intent("com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE")).setClass(context, com/appboy/receivers/AppboyActionReceiver), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:new             #24  <Class Intent>
	//    3    5:dup             
	//    4    6:ldc1            #170 <String "com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE">
	//    5    8:invokespecial   #29  <Method void Intent(String)>
	//    6   11:aload_0         
	//    7   12:ldc1            #31  <Class AppboyActionReceiver>
	//    8   14:invokevirtual   #35  <Method Intent Intent.setClass(Context, Class)>
	//    9   17:ldc1            #36  <Int 0x8000000>
	//   10   19:invokestatic    #42  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   11   22:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ee);

	static 
	{
	//    0    0:ldc1            #2   <Class ee>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String a>
	//*   3    8:return          
	}
}
