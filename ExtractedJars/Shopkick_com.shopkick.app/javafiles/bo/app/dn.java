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
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dh

public final class dn
{

	public dn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static PendingIntent a(Context context)
	{
		return PendingIntent.getBroadcast(context, 0, (new Intent("com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE")).setClass(context, com/appboy/receivers/AppboyActionReceiver), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:new             #23  <Class Intent>
	//    3    5:dup             
	//    4    6:ldc1            #25  <String "com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE">
	//    5    8:invokespecial   #28  <Method void Intent(String)>
	//    6   11:aload_0         
	//    7   12:ldc1            #30  <Class AppboyActionReceiver>
	//    8   14:invokevirtual   #34  <Method Intent Intent.setClass(Context, Class)>
	//    9   17:ldc1            #35  <Int 0x8000000>
	//   10   19:invokestatic    #41  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   11   22:areturn         
	}

	public static List a(SharedPreferences sharedpreferences)
	{
		ArrayList arraylist;
		Object obj;
		arraylist = new ArrayList();
	//    0    0:new             #48  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void ArrayList()>
	//    3    7:astore_1        
		obj = ((Object) (sharedpreferences.getAll()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #55  <Method Map SharedPreferences.getAll()>
	//    6   14:astore_2        
		if(obj == null || ((Map) (obj)).size() == 0)
	//*   7   15:aload_2         
	//*   8   16:ifnull          282
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #61  <Method int Map.size()>
	//*  11   25:ifne            31
			break MISSING_BLOCK_LABEL_282;
	//   12   28:goto            282
		obj = ((Object) (((Map) (obj)).keySet()));
	//   13   31:aload_2         
	//   14   32:invokeinterface #65  <Method Set Map.keySet()>
	//   15   37:astore_2        
		if(obj == null || ((Set) (obj)).size() == 0)
	//*  16   38:aload_2         
	//*  17   39:ifnull          271
	//*  18   42:aload_2         
	//*  19   43:invokeinterface #68  <Method int Set.size()>
	//*  20   48:ifne            54
			break MISSING_BLOCK_LABEL_271;
	//   21   51:goto            271
		obj = ((Object) (((Set) (obj)).iterator()));
	//   22   54:aload_2         
	//   23   55:invokeinterface #72  <Method Iterator Set.iterator()>
	//   24   60:astore_2        
_L2:
		String s;
		String s1;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   25   61:aload_2         
	//   26   62:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   27   67:ifeq            269
		s1 = (String)((Iterator) (obj)).next();
	//   28   70:aload_2         
	//   29   71:invokeinterface #82  <Method Object Iterator.next()>
	//   30   76:checkcast       #84  <Class String>
	//   31   79:astore          4
		s = sharedpreferences.getString(s1, ((String) (null)));
	//   32   81:aload_0         
	//   33   82:aload           4
	//   34   84:aconst_null     
	//   35   85:invokeinterface #88  <Method String SharedPreferences.getString(String, String)>
	//   36   90:astore_3        
		if(StringUtils.isNullOrBlank(s))
	//*  37   91:aload_3         
	//*  38   92:invokestatic    #94  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  39   95:ifeq            150
		{
			String s2 = a;
	//   40   98:getstatic       #16  <Field String a>
	//   41  101:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   42  103:new             #96  <Class StringBuilder>
	//   43  106:dup             
	//   44  107:invokespecial   #97  <Method void StringBuilder()>
	//   45  110:astore          6
			stringbuilder.append("Received null or blank serialized  geofence string for geofence id ");
	//   46  112:aload           6
	//   47  114:ldc1            #99  <String "Received null or blank serialized  geofence string for geofence id ">
	//   48  116:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   49  119:pop             
			stringbuilder.append(s1);
	//   50  120:aload           6
	//   51  122:aload           4
	//   52  124:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   53  127:pop             
			stringbuilder.append(" from shared preferences. Not parsing.");
	//   54  128:aload           6
	//   55  130:ldc1            #105 <String " from shared preferences. Not parsing.">
	//   56  132:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   57  135:pop             
			AppboyLogger.w(s2, stringbuilder.toString());
	//   58  136:aload           5
	//   59  138:aload           6
	//   60  140:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   61  143:invokestatic    #113 <Method int AppboyLogger.w(String, String)>
	//   62  146:pop             
			continue; /* Loop/switch isn't completed */
	//   63  147:goto            61
		}
		try
		{
			((List) (arraylist)).add(((Object) (new AppboyGeofence(new JSONObject(s)))));
	//   64  150:aload_1         
	//   65  151:new             #115 <Class AppboyGeofence>
	//   66  154:dup             
	//   67  155:new             #117 <Class JSONObject>
	//   68  158:dup             
	//   69  159:aload_3         
	//   70  160:invokespecial   #118 <Method void JSONObject(String)>
	//   71  163:invokespecial   #121 <Method void AppboyGeofence(JSONObject)>
	//   72  166:invokeinterface #127 <Method boolean List.add(Object)>
	//   73  171:pop             
		}
	//*  74  172:goto            61
	//*  75  175:astore          4
	//*  76  177:getstatic       #16  <Field String a>
	//*  77  180:astore          5
	//*  78  182:new             #96  <Class StringBuilder>
	//*  79  185:dup             
	//*  80  186:invokespecial   #97  <Method void StringBuilder()>
	//*  81  189:astore          6
	//*  82  191:aload           6
	//*  83  193:ldc1            #129 <String "Encountered unexpected exception while parsing stored geofence: ">
	//*  84  195:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  85  198:pop             
	//*  86  199:aload           6
	//*  87  201:aload_3         
	//*  88  202:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  89  205:pop             
	//*  90  206:aload           5
	//*  91  208:aload           6
	//*  92  210:invokevirtual   #109 <Method String StringBuilder.toString()>
	//*  93  213:aload           4
	//*  94  215:invokestatic    #133 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  95  218:pop             
	//*  96  219:goto            61
		catch(JSONException jsonexception)
	//*  97  222:astore          4
		{
			String s4 = a;
	//   98  224:getstatic       #16  <Field String a>
	//   99  227:astore          5
			StringBuilder stringbuilder2 = new StringBuilder();
	//  100  229:new             #96  <Class StringBuilder>
	//  101  232:dup             
	//  102  233:invokespecial   #97  <Method void StringBuilder()>
	//  103  236:astore          6
			stringbuilder2.append("Encountered Json exception while parsing stored geofence: ");
	//  104  238:aload           6
	//  105  240:ldc1            #135 <String "Encountered Json exception while parsing stored geofence: ">
	//  106  242:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  107  245:pop             
			stringbuilder2.append(s);
	//  108  246:aload           6
	//  109  248:aload_3         
	//  110  249:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  111  252:pop             
			AppboyLogger.e(s4, stringbuilder2.toString(), ((Throwable) (jsonexception)));
	//  112  253:aload           5
	//  113  255:aload           6
	//  114  257:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  115  260:aload           4
	//  116  262:invokestatic    #133 <Method int AppboyLogger.e(String, String, Throwable)>
	//  117  265:pop             
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
	//  118  266:goto            61
_L1:
		return ((List) (arraylist));
	//  119  269:aload_1         
	//  120  270:areturn         
		AppboyLogger.w(a, "Failed to find stored geofence keys.");
	//  121  271:getstatic       #16  <Field String a>
	//  122  274:ldc1            #137 <String "Failed to find stored geofence keys.">
	//  123  276:invokestatic    #113 <Method int AppboyLogger.w(String, String)>
	//  124  279:pop             
		return ((List) (arraylist));
	//  125  280:aload_1         
	//  126  281:areturn         
		AppboyLogger.d(a, "Did not find stored geofences.");
	//  127  282:getstatic       #16  <Field String a>
	//  128  285:ldc1            #139 <String "Did not find stored geofences.">
	//  129  287:invokestatic    #142 <Method int AppboyLogger.d(String, String)>
	//  130  290:pop             
		return ((List) (arraylist));
	//  131  291:aload_1         
	//  132  292:areturn         
	}

	public static boolean a(dh dh1)
	{
		if(dh1.a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #149 <Method boolean dh.a()>
	//*   2    4:ifeq            36
		{
			if(dh1.b())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #152 <Method boolean dh.b()>
	//*   5   11:ifeq            25
			{
				AppboyLogger.i(a, "Geofences enabled in server configuration.");
	//    6   14:getstatic       #16  <Field String a>
	//    7   17:ldc1            #154 <String "Geofences enabled in server configuration.">
	//    8   19:invokestatic    #157 <Method int AppboyLogger.i(String, String)>
	//    9   22:pop             
				return true;
	//   10   23:iconst_1        
	//   11   24:ireturn         
			} else
			{
				AppboyLogger.i(a, "Geofences explicitly disabled via server configuration.");
	//   12   25:getstatic       #16  <Field String a>
	//   13   28:ldc1            #159 <String "Geofences explicitly disabled via server configuration.">
	//   14   30:invokestatic    #157 <Method int AppboyLogger.i(String, String)>
	//   15   33:pop             
				return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
			}
		} else
		{
			AppboyLogger.i(a, "Geofences implicitly disabled via server configuration.");
	//   18   36:getstatic       #16  <Field String a>
	//   19   39:ldc1            #161 <String "Geofences implicitly disabled via server configuration.">
	//   20   41:invokestatic    #157 <Method int AppboyLogger.i(String, String)>
	//   21   44:pop             
			return false;
	//   22   45:iconst_0        
	//   23   46:ireturn         
		}
	}

	public static int b(dh dh1)
	{
		if(dh1.g() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #165 <Method int dh.g()>
	//*   2    4:ifle            12
			return dh1.g();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #165 <Method int dh.g()>
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
	//    2    2:new             #23  <Class Intent>
	//    3    5:dup             
	//    4    6:ldc1            #167 <String "com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE">
	//    5    8:invokespecial   #28  <Method void Intent(String)>
	//    6   11:aload_0         
	//    7   12:ldc1            #30  <Class AppboyActionReceiver>
	//    8   14:invokevirtual   #34  <Method Intent Intent.setClass(Context, Class)>
	//    9   17:ldc1            #35  <Int 0x8000000>
	//   10   19:invokestatic    #41  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   11   22:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dn);

	static 
	{
	//    0    0:ldc1            #2   <Class dn>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
