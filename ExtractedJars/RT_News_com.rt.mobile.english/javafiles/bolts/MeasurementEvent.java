// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bolts:
//			AppLinks

public class MeasurementEvent
{

	private MeasurementEvent(Context context, String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		appContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #38  <Field Context appContext>
		name = s;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #40  <Field String name>
		args = bundle;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #42  <Field Bundle args>
	//   12   22:return          
	}

	private static Bundle getApplinkLogData(Context context, String s, Bundle bundle, Intent intent)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #47  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void Bundle()>
	//    3    7:astore          4
		context = ((Context) (intent.resolveActivity(context.getPackageManager())));
	//    4    9:aload_3         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #52  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//    7   14:invokevirtual   #58  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//    8   17:astore_0        
		if(context != null)
	//*   9   18:aload_0         
	//*  10   19:ifnull          33
			bundle1.putString("class", ((ComponentName) (context)).getShortClassName());
	//   11   22:aload           4
	//   12   24:ldc1            #60  <String "class">
	//   13   26:aload_0         
	//   14   27:invokevirtual   #66  <Method String ComponentName.getShortClassName()>
	//   15   30:invokevirtual   #70  <Method void Bundle.putString(String, String)>
		if("al_nav_out".equals(((Object) (s))))
	//*  16   33:ldc1            #11  <String "al_nav_out">
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  19   39:ifeq            99
		{
			if(context != null)
	//*  20   42:aload_0         
	//*  21   43:ifnull          57
				bundle1.putString("package", ((ComponentName) (context)).getPackageName());
	//   22   46:aload           4
	//   23   48:ldc1            #78  <String "package">
	//   24   50:aload_0         
	//   25   51:invokevirtual   #81  <Method String ComponentName.getPackageName()>
	//   26   54:invokevirtual   #70  <Method void Bundle.putString(String, String)>
			if(intent.getData() != null)
	//*  27   57:aload_3         
	//*  28   58:invokevirtual   #85  <Method Uri Intent.getData()>
	//*  29   61:ifnull          78
				bundle1.putString("outputURL", intent.getData().toString());
	//   30   64:aload           4
	//   31   66:ldc1            #87  <String "outputURL">
	//   32   68:aload_3         
	//   33   69:invokevirtual   #85  <Method Uri Intent.getData()>
	//   34   72:invokevirtual   #92  <Method String Uri.toString()>
	//   35   75:invokevirtual   #70  <Method void Bundle.putString(String, String)>
			if(intent.getScheme() != null)
	//*  36   78:aload_3         
	//*  37   79:invokevirtual   #95  <Method String Intent.getScheme()>
	//*  38   82:ifnull          147
				bundle1.putString("outputURLScheme", intent.getScheme());
	//   39   85:aload           4
	//   40   87:ldc1            #97  <String "outputURLScheme">
	//   41   89:aload_3         
	//   42   90:invokevirtual   #95  <Method String Intent.getScheme()>
	//   43   93:invokevirtual   #70  <Method void Bundle.putString(String, String)>
		} else
	//*  44   96:goto            147
		if("al_nav_in".equals(((Object) (s))))
	//*  45   99:ldc1            #8   <String "al_nav_in">
	//*  46  101:aload_1         
	//*  47  102:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  48  105:ifeq            147
		{
			if(intent.getData() != null)
	//*  49  108:aload_3         
	//*  50  109:invokevirtual   #85  <Method Uri Intent.getData()>
	//*  51  112:ifnull          129
				bundle1.putString("inputURL", intent.getData().toString());
	//   52  115:aload           4
	//   53  117:ldc1            #99  <String "inputURL">
	//   54  119:aload_3         
	//   55  120:invokevirtual   #85  <Method Uri Intent.getData()>
	//   56  123:invokevirtual   #92  <Method String Uri.toString()>
	//   57  126:invokevirtual   #70  <Method void Bundle.putString(String, String)>
			if(intent.getScheme() != null)
	//*  58  129:aload_3         
	//*  59  130:invokevirtual   #95  <Method String Intent.getScheme()>
	//*  60  133:ifnull          147
				bundle1.putString("inputURLScheme", intent.getScheme());
	//   61  136:aload           4
	//   62  138:ldc1            #101 <String "inputURLScheme">
	//   63  140:aload_3         
	//   64  141:invokevirtual   #95  <Method String Intent.getScheme()>
	//   65  144:invokevirtual   #70  <Method void Bundle.putString(String, String)>
		}
		context = ((Context) (bundle.keySet().iterator()));
	//   66  147:aload_2         
	//   67  148:invokevirtual   #105 <Method Set Bundle.keySet()>
	//   68  151:invokeinterface #111 <Method Iterator Set.iterator()>
	//   69  156:astore_0        
label0:
		do
		{
			if(!((Iterator) (context)).hasNext())
				break;
	//   70  157:aload_0         
	//   71  158:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   72  163:ifeq            414
			s = (String)((Iterator) (context)).next();
	//   73  166:aload_0         
	//   74  167:invokeinterface #121 <Method Object Iterator.next()>
	//   75  172:checkcast       #72  <Class String>
	//   76  175:astore_1        
			intent = ((Intent) (bundle.get(s)));
	//   77  176:aload_2         
	//   78  177:aload_1         
	//   79  178:invokevirtual   #125 <Method Object Bundle.get(String)>
	//   80  181:astore_3        
			if(intent instanceof Bundle)
	//*  81  182:aload_3         
	//*  82  183:instanceof      #47  <Class Bundle>
	//*  83  186:ifeq            360
			{
				intent = ((Intent) ((Bundle)intent));
	//   84  189:aload_3         
	//   85  190:checkcast       #47  <Class Bundle>
	//   86  193:astore_3        
				Iterator iterator = ((Bundle) (intent)).keySet().iterator();
	//   87  194:aload_3         
	//   88  195:invokevirtual   #105 <Method Set Bundle.keySet()>
	//   89  198:invokeinterface #111 <Method Iterator Set.iterator()>
	//   90  203:astore          5
				do
				{
					if(!iterator.hasNext())
						continue label0;
	//   91  205:aload           5
	//   92  207:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   93  212:ifeq            157
					String s1 = (String)iterator.next();
	//   94  215:aload           5
	//   95  217:invokeinterface #121 <Method Object Iterator.next()>
	//   96  222:checkcast       #72  <Class String>
	//   97  225:astore          6
					String s2 = objectToJSONString(((Bundle) (intent)).get(s1));
	//   98  227:aload_3         
	//   99  228:aload           6
	//  100  230:invokevirtual   #125 <Method Object Bundle.get(String)>
	//  101  233:invokestatic    #129 <Method String objectToJSONString(Object)>
	//  102  236:astore          7
					if(s.equals("referer_app_link"))
	//* 103  238:aload_1         
	//* 104  239:ldc1            #131 <String "referer_app_link">
	//* 105  241:invokevirtual   #76  <Method boolean String.equals(Object)>
	//* 106  244:ifeq            313
					{
						if(s1.equalsIgnoreCase("url"))
	//* 107  247:aload           6
	//* 108  249:ldc1            #133 <String "url">
	//* 109  251:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 110  254:ifeq            269
						{
							bundle1.putString("refererURL", s2);
	//  111  257:aload           4
	//  112  259:ldc1            #139 <String "refererURL">
	//  113  261:aload           7
	//  114  263:invokevirtual   #70  <Method void Bundle.putString(String, String)>
							continue;
	//  115  266:goto            205
						}
						if(s1.equalsIgnoreCase("app_name"))
	//* 116  269:aload           6
	//* 117  271:ldc1            #141 <String "app_name">
	//* 118  273:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 119  276:ifeq            291
						{
							bundle1.putString("refererAppName", s2);
	//  120  279:aload           4
	//  121  281:ldc1            #143 <String "refererAppName">
	//  122  283:aload           7
	//  123  285:invokevirtual   #70  <Method void Bundle.putString(String, String)>
							continue;
	//  124  288:goto            205
						}
						if(s1.equalsIgnoreCase("package"))
	//* 125  291:aload           6
	//* 126  293:ldc1            #78  <String "package">
	//* 127  295:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 128  298:ifeq            313
						{
							bundle1.putString("sourceApplication", s2);
	//  129  301:aload           4
	//  130  303:ldc1            #145 <String "sourceApplication">
	//  131  305:aload           7
	//  132  307:invokevirtual   #70  <Method void Bundle.putString(String, String)>
							continue;
	//  133  310:goto            205
						}
					}
					StringBuilder stringbuilder = new StringBuilder();
	//  134  313:new             #147 <Class StringBuilder>
	//  135  316:dup             
	//  136  317:invokespecial   #148 <Method void StringBuilder()>
	//  137  320:astore          8
					stringbuilder.append(s);
	//  138  322:aload           8
	//  139  324:aload_1         
	//  140  325:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  141  328:pop             
					stringbuilder.append("/");
	//  142  329:aload           8
	//  143  331:ldc1            #154 <String "/">
	//  144  333:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  145  336:pop             
					stringbuilder.append(s1);
	//  146  337:aload           8
	//  147  339:aload           6
	//  148  341:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  149  344:pop             
					bundle1.putString(stringbuilder.toString(), s2);
	//  150  345:aload           4
	//  151  347:aload           8
	//  152  349:invokevirtual   #155 <Method String StringBuilder.toString()>
	//  153  352:aload           7
	//  154  354:invokevirtual   #70  <Method void Bundle.putString(String, String)>
				} while(true);
	//  155  357:goto            205
			}
			intent = ((Intent) (objectToJSONString(((Object) (intent)))));
	//  156  360:aload_3         
	//  157  361:invokestatic    #129 <Method String objectToJSONString(Object)>
	//  158  364:astore_3        
			if(s.equals("target_url"))
	//* 159  365:aload_1         
	//* 160  366:ldc1            #157 <String "target_url">
	//* 161  368:invokevirtual   #76  <Method boolean String.equals(Object)>
	//* 162  371:ifeq            404
			{
				s = ((String) (Uri.parse(((String) (intent)))));
	//  163  374:aload_3         
	//  164  375:invokestatic    #161 <Method Uri Uri.parse(String)>
	//  165  378:astore_1        
				bundle1.putString("targetURL", ((Uri) (s)).toString());
	//  166  379:aload           4
	//  167  381:ldc1            #163 <String "targetURL">
	//  168  383:aload_1         
	//  169  384:invokevirtual   #92  <Method String Uri.toString()>
	//  170  387:invokevirtual   #70  <Method void Bundle.putString(String, String)>
				bundle1.putString("targetURLHost", ((Uri) (s)).getHost());
	//  171  390:aload           4
	//  172  392:ldc1            #165 <String "targetURLHost">
	//  173  394:aload_1         
	//  174  395:invokevirtual   #168 <Method String Uri.getHost()>
	//  175  398:invokevirtual   #70  <Method void Bundle.putString(String, String)>
			} else
	//* 176  401:goto            157
			{
				bundle1.putString(s, ((String) (intent)));
	//  177  404:aload           4
	//  178  406:aload_1         
	//  179  407:aload_3         
	//  180  408:invokevirtual   #70  <Method void Bundle.putString(String, String)>
			}
		} while(true);
	//  181  411:goto            157
		return bundle1;
	//  182  414:aload           4
	//  183  416:areturn         
	}

	private static String objectToJSONString(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(!(obj instanceof JSONArray) && !(obj instanceof JSONObject))
	//*   4    6:aload_0         
	//*   5    7:instanceof      #172 <Class JSONArray>
	//*   6   10:ifne            74
	//*   7   13:aload_0         
	//*   8   14:instanceof      #174 <Class JSONObject>
	//*   9   17:ifeq            23
	//*  10   20:goto            74
		{
			try
			{
				if(obj instanceof Collection)
	//*  11   23:aload_0         
	//*  12   24:instanceof      #176 <Class Collection>
	//*  13   27:ifeq            45
					return (new JSONArray((Collection)obj)).toString();
	//   14   30:new             #172 <Class JSONArray>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:checkcast       #176 <Class Collection>
	//   18   38:invokespecial   #179 <Method void JSONArray(Collection)>
	//   19   41:invokevirtual   #180 <Method String JSONArray.toString()>
	//   20   44:areturn         
				if(obj instanceof Map)
	//*  21   45:aload_0         
	//*  22   46:instanceof      #182 <Class Map>
	//*  23   49:ifeq            67
					return (new JSONObject((Map)obj)).toString();
	//   24   52:new             #174 <Class JSONObject>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:checkcast       #182 <Class Map>
	//   28   60:invokespecial   #185 <Method void JSONObject(Map)>
	//   29   63:invokevirtual   #186 <Method String JSONObject.toString()>
	//   30   66:areturn         
				obj = ((Object) (obj.toString()));
	//   31   67:aload_0         
	//   32   68:invokevirtual   #187 <Method String Object.toString()>
	//   33   71:astore_0        
			}
	//*  34   72:aload_0         
	//*  35   73:areturn         
	//*  36   74:aload_0         
	//*  37   75:invokevirtual   #187 <Method String Object.toString()>
	//*  38   78:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  39   79:astore_0        
			{
				return null;
	//   40   80:aconst_null     
	//   41   81:areturn         
			}
			return ((String) (obj));
		} else
		{
			return obj.toString();
		}
	}

	private void sendBroadcast()
	{
		Exception exception;
		if(name == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field String name>
	//*   2    4:ifnonnull       20
			Log.d(((Object)this).getClass().getName(), "Event name is required");
	//    3    7:aload_0         
	//    4    8:invokevirtual   #192 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #197 <Method String Class.getName()>
	//    6   14:ldc1            #199 <String "Event name is required">
	//    7   16:invokestatic    #205 <Method int Log.d(String, String)>
	//    8   19:pop             
		try
		{
			Object obj = ((Object) (Class.forName("android.support.v4.content.LocalBroadcastManager")));
	//    9   20:ldc1            #207 <String "android.support.v4.content.LocalBroadcastManager">
	//   10   22:invokestatic    #211 <Method Class Class.forName(String)>
	//   11   25:astore_1        
			Object obj1 = ((Object) (((Class) (obj)).getMethod("getInstance", new Class[] {
				android/content/Context
			})));
	//   12   26:aload_1         
	//   13   27:ldc1            #213 <String "getInstance">
	//   14   29:iconst_1        
	//   15   30:anewarray       Class[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:ldc1            #32  <Class Context>
	//   19   37:aastore         
	//   20   38:invokevirtual   #217 <Method Method Class.getMethod(String, Class[])>
	//   21   41:astore_2        
			obj = ((Object) (((Class) (obj)).getMethod("sendBroadcast", new Class[] {
				android/content/Intent
			})));
	//   22   42:aload_1         
	//   23   43:ldc1            #218 <String "sendBroadcast">
	//   24   45:iconst_1        
	//   25   46:anewarray       Class[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:ldc1            #54  <Class Intent>
	//   29   53:aastore         
	//   30   54:invokevirtual   #217 <Method Method Class.getMethod(String, Class[])>
	//   31   57:astore_1        
			obj1 = ((Method) (obj1)).invoke(((Object) (null)), new Object[] {
				appContext
			});
	//   32   58:aload_2         
	//   33   59:aconst_null     
	//   34   60:iconst_1        
	//   35   61:anewarray       Object[]
	//   36   64:dup             
	//   37   65:iconst_0        
	//   38   66:aload_0         
	//   39   67:getfield        #38  <Field Context appContext>
	//   40   70:aastore         
	//   41   71:invokevirtual   #224 <Method Object Method.invoke(Object, Object[])>
	//   42   74:astore_2        
			Intent intent = new Intent("com.parse.bolts.measurement_event");
	//   43   75:new             #54  <Class Intent>
	//   44   78:dup             
	//   45   79:ldc1            #20  <String "com.parse.bolts.measurement_event">
	//   46   81:invokespecial   #227 <Method void Intent(String)>
	//   47   84:astore_3        
			intent.putExtra("event_name", name);
	//   48   85:aload_3         
	//   49   86:ldc1            #17  <String "event_name">
	//   50   88:aload_0         
	//   51   89:getfield        #40  <Field String name>
	//   52   92:invokevirtual   #231 <Method Intent Intent.putExtra(String, String)>
	//   53   95:pop             
			intent.putExtra("event_args", args);
	//   54   96:aload_3         
	//   55   97:ldc1            #14  <String "event_args">
	//   56   99:aload_0         
	//   57  100:getfield        #42  <Field Bundle args>
	//   58  103:invokevirtual   #234 <Method Intent Intent.putExtra(String, Bundle)>
	//   59  106:pop             
			((Method) (obj)).invoke(obj1, new Object[] {
				intent
			});
	//   60  107:aload_1         
	//   61  108:aload_2         
	//   62  109:iconst_1        
	//   63  110:anewarray       Object[]
	//   64  113:dup             
	//   65  114:iconst_0        
	//   66  115:aload_3         
	//   67  116:aastore         
	//   68  117:invokevirtual   #224 <Method Object Method.invoke(Object, Object[])>
	//   69  120:pop             
			return;
	//   70  121:return          
		}
	//*  71  122:aload_0         
	//*  72  123:invokevirtual   #192 <Method Class Object.getClass()>
	//*  73  126:invokevirtual   #197 <Method String Class.getName()>
	//*  74  129:ldc1            #236 <String "LocalBroadcastManager in android support library is required to raise bolts event.">
	//*  75  131:invokestatic    #205 <Method int Log.d(String, String)>
	//*  76  134:pop             
	//*  77  135:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			Log.d(((Object)this).getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
		}
	//*  78  136:astore_1        
	//*  79  137:goto            122
	}

	static void sendBroadcastEvent(Context context, String s, Intent intent, Map map)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #47  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void Bundle()>
	//    3    7:astore          5
		Object obj = ((Object) (bundle));
	//    4    9:aload           5
	//    5   11:astore          4
		if(intent != null)
	//*   6   13:aload_2         
	//*   7   14:ifnull          133
		{
			obj = ((Object) (AppLinks.getAppLinkData(intent)));
	//    8   17:aload_2         
	//    9   18:invokestatic    #244 <Method Bundle AppLinks.getAppLinkData(Intent)>
	//   10   21:astore          4
			if(obj != null)
	//*  11   23:aload           4
	//*  12   25:ifnull          41
			{
				obj = ((Object) (getApplinkLogData(context, s, ((Bundle) (obj)), intent)));
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:aload           4
	//   16   32:aload_2         
	//   17   33:invokestatic    #246 <Method Bundle getApplinkLogData(Context, String, Bundle, Intent)>
	//   18   36:astore          4
			} else
	//*  19   38:goto            133
			{
				obj = ((Object) (intent.getData()));
	//   20   41:aload_2         
	//   21   42:invokevirtual   #85  <Method Uri Intent.getData()>
	//   22   45:astore          4
				if(obj != null)
	//*  23   47:aload           4
	//*  24   49:ifnull          64
					bundle.putString("intentData", ((Uri) (obj)).toString());
	//   25   52:aload           5
	//   26   54:ldc1            #248 <String "intentData">
	//   27   56:aload           4
	//   28   58:invokevirtual   #92  <Method String Uri.toString()>
	//   29   61:invokevirtual   #70  <Method void Bundle.putString(String, String)>
				intent = ((Intent) (intent.getExtras()));
	//   30   64:aload_2         
	//   31   65:invokevirtual   #252 <Method Bundle Intent.getExtras()>
	//   32   68:astore_2        
				obj = ((Object) (bundle));
	//   33   69:aload           5
	//   34   71:astore          4
				if(intent != null)
	//*  35   73:aload_2         
	//*  36   74:ifnull          133
				{
					Iterator iterator = ((Bundle) (intent)).keySet().iterator();
	//   37   77:aload_2         
	//   38   78:invokevirtual   #105 <Method Set Bundle.keySet()>
	//   39   81:invokeinterface #111 <Method Iterator Set.iterator()>
	//   40   86:astore          6
					do
					{
						obj = ((Object) (bundle));
	//   41   88:aload           5
	//   42   90:astore          4
						if(!iterator.hasNext())
							break;
	//   43   92:aload           6
	//   44   94:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   45   99:ifeq            133
						obj = ((Object) ((String)iterator.next()));
	//   46  102:aload           6
	//   47  104:invokeinterface #121 <Method Object Iterator.next()>
	//   48  109:checkcast       #72  <Class String>
	//   49  112:astore          4
						bundle.putString(((String) (obj)), objectToJSONString(((Bundle) (intent)).get(((String) (obj)))));
	//   50  114:aload           5
	//   51  116:aload           4
	//   52  118:aload_2         
	//   53  119:aload           4
	//   54  121:invokevirtual   #125 <Method Object Bundle.get(String)>
	//   55  124:invokestatic    #129 <Method String objectToJSONString(Object)>
	//   56  127:invokevirtual   #70  <Method void Bundle.putString(String, String)>
					} while(true);
	//   57  130:goto            88
				}
			}
		}
		if(map != null)
	//*  58  133:aload_3         
	//*  59  134:ifnull          190
		{
			String s1;
			for(intent = ((Intent) (map.keySet().iterator())); ((Iterator) (intent)).hasNext(); ((Bundle) (obj)).putString(s1, (String)map.get(((Object) (s1)))))
	//*  60  137:aload_3         
	//*  61  138:invokeinterface #253 <Method Set Map.keySet()>
	//*  62  143:invokeinterface #111 <Method Iterator Set.iterator()>
	//*  63  148:astore_2        
	//*  64  149:aload_2         
	//*  65  150:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//*  66  155:ifeq            190
				s1 = (String)((Iterator) (intent)).next();
	//   67  158:aload_2         
	//   68  159:invokeinterface #121 <Method Object Iterator.next()>
	//   69  164:checkcast       #72  <Class String>
	//   70  167:astore          5

	//   71  169:aload           4
	//   72  171:aload           5
	//   73  173:aload_3         
	//   74  174:aload           5
	//   75  176:invokeinterface #256 <Method Object Map.get(Object)>
	//   76  181:checkcast       #72  <Class String>
	//   77  184:invokevirtual   #70  <Method void Bundle.putString(String, String)>
		}
	//*  78  187:goto            149
		(new MeasurementEvent(context, s, ((Bundle) (obj)))).sendBroadcast();
	//   79  190:new             #2   <Class MeasurementEvent>
	//   80  193:dup             
	//   81  194:aload_0         
	//   82  195:aload_1         
	//   83  196:aload           4
	//   84  198:invokespecial   #258 <Method void MeasurementEvent(Context, String, Bundle)>
	//   85  201:invokespecial   #260 <Method void sendBroadcast()>
	//   86  204:return          
	}

	public static final String APP_LINK_NAVIGATE_IN_EVENT_NAME = "al_nav_in";
	public static final String APP_LINK_NAVIGATE_OUT_EVENT_NAME = "al_nav_out";
	public static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
	public static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
	public static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
	private Context appContext;
	private Bundle args;
	private String name;
}
