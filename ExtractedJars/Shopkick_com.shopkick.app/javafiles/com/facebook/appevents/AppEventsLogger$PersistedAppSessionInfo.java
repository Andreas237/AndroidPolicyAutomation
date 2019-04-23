// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger, FacebookTimeSpentData, AccessTokenAppIdPair

static class AppEventsLogger$PersistedAppSessionInfo
{

	private static FacebookTimeSpentData getTimeSpentData(Context context, AccessTokenAppIdPair accesstokenappidpair)
	{
		restoreAppSessionInformation(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method void restoreAppSessionInformation(Context)>
		FacebookTimeSpentData facebooktimespentdata = (FacebookTimeSpentData)appSessionInfoMap.get(((Object) (accesstokenappidpair)));
	//    2    4:getstatic       #46  <Field Map appSessionInfoMap>
	//    3    7:aload_1         
	//    4    8:invokeinterface #52  <Method Object Map.get(Object)>
	//    5   13:checkcast       #54  <Class FacebookTimeSpentData>
	//    6   16:astore_2        
		context = ((Context) (facebooktimespentdata));
	//    7   17:aload_2         
	//    8   18:astore_0        
		if(facebooktimespentdata == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       42
		{
			context = ((Context) (new FacebookTimeSpentData()));
	//   11   23:new             #54  <Class FacebookTimeSpentData>
	//   12   26:dup             
	//   13   27:invokespecial   #55  <Method void FacebookTimeSpentData()>
	//   14   30:astore_0        
			appSessionInfoMap.put(((Object) (accesstokenappidpair)), ((Object) (context)));
	//   15   31:getstatic       #46  <Field Map appSessionInfoMap>
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   19   41:pop             
		}
		return ((FacebookTimeSpentData) (context));
	//   20   42:aload_0         
	//   21   43:areturn         
	}

	static void onResume(Context context, AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l, String s)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #30  <Field Object staticLock>
	//*   1    3:astore          6
	//*   2    5:aload           6
	//*   3    7:monitorenter    
		{
			getTimeSpentData(context, accesstokenappidpair).onResume(appeventslogger, l, s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #63  <Method FacebookTimeSpentData getTimeSpentData(Context, AccessTokenAppIdPair)>
	//    7   13:aload_2         
	//    8   14:lload_3         
	//    9   15:aload           5
	//   10   17:invokevirtual   #66  <Method void FacebookTimeSpentData.onResume(AppEventsLogger, long, String)>
			onTimeSpentDataUpdate();
	//   11   20:invokestatic    #69  <Method void onTimeSpentDataUpdate()>
		}
	//   12   23:aload           6
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		context;
	//   15   27:astore_0        
		obj;
	//   16   28:aload           6
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		throw context;
	//   18   31:aload_0         
	//   19   32:athrow          
	}

	static void onSuspend(Context context, AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #30  <Field Object staticLock>
	//*   1    3:astore          5
	//*   2    5:aload           5
	//*   3    7:monitorenter    
		{
			getTimeSpentData(context, accesstokenappidpair).onSuspend(appeventslogger, l);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #63  <Method FacebookTimeSpentData getTimeSpentData(Context, AccessTokenAppIdPair)>
	//    7   13:aload_2         
	//    8   14:lload_3         
	//    9   15:invokevirtual   #74  <Method void FacebookTimeSpentData.onSuspend(AppEventsLogger, long)>
			onTimeSpentDataUpdate();
	//   10   18:invokestatic    #69  <Method void onTimeSpentDataUpdate()>
		}
	//   11   21:aload           5
	//   12   23:monitorexit     
		return;
	//   13   24:return          
		context;
	//   14   25:astore_0        
		obj;
	//   15   26:aload           5
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw context;
	//   17   29:aload_0         
	//   18   30:athrow          
	}

	private static void onTimeSpentDataUpdate()
	{
		if(!hasChanges)
	//*   0    0:getstatic       #32  <Field boolean hasChanges>
	//*   1    3:ifne            26
		{
			hasChanges = true;
	//    2    6:iconst_1        
	//    3    7:putstatic       #32  <Field boolean hasChanges>
			AppEventsLogger.access$300().schedule(appSessionInfoFlushRunnable, 30L, TimeUnit.SECONDS);
	//    4   10:invokestatic    #78  <Method ScheduledThreadPoolExecutor AppEventsLogger.access$300()>
	//    5   13:getstatic       #37  <Field Runnable appSessionInfoFlushRunnable>
	//    6   16:ldc2w           #79  <Long 30L>
	//    7   19:getstatic       #86  <Field TimeUnit TimeUnit.SECONDS>
	//    8   22:invokevirtual   #92  <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//    9   25:pop             
		}
	//   10   26:return          
	}

	private static void restoreAppSessionInformation(Context context)
	{
		Object obj2 = staticLock;
	//    0    0:getstatic       #30  <Field Object staticLock>
	//    1    3:astore          5
		obj2;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		boolean flag = isLoaded;
	//    4    8:getstatic       #34  <Field boolean isLoaded>
	//    5   11:istore_1        
		if(flag) goto _L2; else goto _L1
	//    6   12:iload_1         
	//    7   13:ifne            266
_L1:
		Object obj1 = ((Object) (new ObjectInputStream(((java.io.InputStream) (context.openFileInput("AppEventsLogger.persistedsessioninfo"))))));
	//    8   16:new             #98  <Class ObjectInputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//   12   23:invokevirtual   #104 <Method java.io.FileInputStream Context.openFileInput(String)>
	//   13   26:invokespecial   #107 <Method void ObjectInputStream(java.io.InputStream)>
	//   14   29:astore_3        
		Object obj = obj1;
	//   15   30:aload_3         
	//   16   31:astore_2        
		appSessionInfoMap = ((Map) ((HashMap)((ObjectInputStream) (obj1)).readObject()));
	//   17   32:aload_3         
	//   18   33:invokevirtual   #111 <Method Object ObjectInputStream.readObject()>
	//   19   36:checkcast       #113 <Class HashMap>
	//   20   39:putstatic       #46  <Field Map appSessionInfoMap>
		obj = obj1;
	//   21   42:aload_3         
	//   22   43:astore_2        
		Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info loaded");
	//   23   44:getstatic       #119 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   24   47:ldc1            #121 <String "AppEvents">
	//   25   49:ldc1            #123 <String "App session info loaded">
	//   26   51:invokestatic    #129 <Method void Logger.log(LoggingBehavior, String, String)>
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   27   54:aload_3         
	//   28   55:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.deleteFile("AppEventsLogger.persistedsessioninfo");
	//   29   58:aload_0         
	//   30   59:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//   31   61:invokevirtual   #139 <Method boolean Context.deleteFile(String)>
	//   32   64:pop             
		if(appSessionInfoMap == null)
	//*  33   65:getstatic       #46  <Field Map appSessionInfoMap>
	//*  34   68:ifnonnull       81
			appSessionInfoMap = ((Map) (new HashMap()));
	//   35   71:new             #113 <Class HashMap>
	//   36   74:dup             
	//   37   75:invokespecial   #140 <Method void HashMap()>
	//   38   78:putstatic       #46  <Field Map appSessionInfoMap>
		isLoaded = true;
	//   39   81:iconst_1        
	//   40   82:putstatic       #34  <Field boolean isLoaded>
_L3:
		hasChanges = false;
	//   41   85:iconst_0        
	//   42   86:putstatic       #32  <Field boolean hasChanges>
		  goto _L2
	//*  43   89:goto            266
		Exception exception;
		exception;
	//   44   92:astore          4
		break MISSING_BLOCK_LABEL_107;
	//   45   94:goto            107
		obj1;
	//   46   97:astore_3        
		obj = null;
	//   47   98:aconst_null     
	//   48   99:astore_2        
		break MISSING_BLOCK_LABEL_195;
	//   49  100:goto            195
		exception;
	//   50  103:astore          4
		obj1 = null;
	//   51  105:aconst_null     
	//   52  106:astore_3        
		obj = obj1;
	//   53  107:aload_3         
	//   54  108:astore_2        
		String s = AppEventsLogger.access$200();
	//   55  109:invokestatic    #144 <Method String AppEventsLogger.access$200()>
	//   56  112:astore          6
		obj = obj1;
	//   57  114:aload_3         
	//   58  115:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   59  116:new             #146 <Class StringBuilder>
	//   60  119:dup             
	//   61  120:invokespecial   #147 <Method void StringBuilder()>
	//   62  123:astore          7
		obj = obj1;
	//   63  125:aload_3         
	//   64  126:astore_2        
		stringbuilder.append("Got unexpected exception restoring app session info: ");
	//   65  127:aload           7
	//   66  129:ldc1            #149 <String "Got unexpected exception restoring app session info: ">
	//   67  131:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   68  134:pop             
		obj = obj1;
	//   69  135:aload_3         
	//   70  136:astore_2        
		stringbuilder.append(exception.toString());
	//   71  137:aload           7
	//   72  139:aload           4
	//   73  141:invokevirtual   #156 <Method String Exception.toString()>
	//   74  144:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   75  147:pop             
		obj = obj1;
	//   76  148:aload_3         
	//   77  149:astore_2        
		Log.w(s, stringbuilder.toString());
	//   78  150:aload           6
	//   79  152:aload           7
	//   80  154:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   81  157:invokestatic    #163 <Method int Log.w(String, String)>
	//   82  160:pop             
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   83  161:aload_3         
	//   84  162:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.deleteFile("AppEventsLogger.persistedsessioninfo");
	//   85  165:aload_0         
	//   86  166:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//   87  168:invokevirtual   #139 <Method boolean Context.deleteFile(String)>
	//   88  171:pop             
		if(appSessionInfoMap == null)
	//*  89  172:getstatic       #46  <Field Map appSessionInfoMap>
	//*  90  175:ifnonnull       188
			appSessionInfoMap = ((Map) (new HashMap()));
	//   91  178:new             #113 <Class HashMap>
	//   92  181:dup             
	//   93  182:invokespecial   #140 <Method void HashMap()>
	//   94  185:putstatic       #46  <Field Map appSessionInfoMap>
		isLoaded = true;
	//   95  188:iconst_1        
	//   96  189:putstatic       #34  <Field boolean isLoaded>
		  goto _L3
	//*  97  192:goto            85
_L5:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   98  195:aload_2         
	//   99  196:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.deleteFile("AppEventsLogger.persistedsessioninfo");
	//  100  199:aload_0         
	//  101  200:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//  102  202:invokevirtual   #139 <Method boolean Context.deleteFile(String)>
	//  103  205:pop             
		if(appSessionInfoMap == null)
	//* 104  206:getstatic       #46  <Field Map appSessionInfoMap>
	//* 105  209:ifnonnull       222
			appSessionInfoMap = ((Map) (new HashMap()));
	//  106  212:new             #113 <Class HashMap>
	//  107  215:dup             
	//  108  216:invokespecial   #140 <Method void HashMap()>
	//  109  219:putstatic       #46  <Field Map appSessionInfoMap>
		isLoaded = true;
	//  110  222:iconst_1        
	//  111  223:putstatic       #34  <Field boolean isLoaded>
		hasChanges = false;
	//  112  226:iconst_0        
	//  113  227:putstatic       #32  <Field boolean hasChanges>
		throw obj1;
	//  114  230:aload_3         
	//  115  231:athrow          
_L4:
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//  116  232:aload_3         
	//  117  233:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.deleteFile("AppEventsLogger.persistedsessioninfo");
	//  118  236:aload_0         
	//  119  237:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//  120  239:invokevirtual   #139 <Method boolean Context.deleteFile(String)>
	//  121  242:pop             
		if(appSessionInfoMap == null)
	//* 122  243:getstatic       #46  <Field Map appSessionInfoMap>
	//* 123  246:ifnonnull       259
			appSessionInfoMap = ((Map) (new HashMap()));
	//  124  249:new             #113 <Class HashMap>
	//  125  252:dup             
	//  126  253:invokespecial   #140 <Method void HashMap()>
	//  127  256:putstatic       #46  <Field Map appSessionInfoMap>
		isLoaded = true;
	//  128  259:iconst_1        
	//  129  260:putstatic       #34  <Field boolean isLoaded>
		  goto _L3
	//* 130  263:goto            85
_L2:
		obj2;
	//  131  266:aload           5
		JVM INSTR monitorexit ;
	//  132  268:monitorexit     
		return;
	//  133  269:return          
		context;
	//  134  270:astore_0        
		obj2;
	//  135  271:aload           5
		JVM INSTR monitorexit ;
	//  136  273:monitorexit     
		throw context;
	//  137  274:aload_0         
	//  138  275:athrow          
		FileNotFoundException filenotfoundexception;
		filenotfoundexception;
	//  139  276:astore_2        
		break MISSING_BLOCK_LABEL_288;
	//  140  277:goto            288
		filenotfoundexception;
	//  141  280:astore_2        
		  goto _L4
	//* 142  281:goto            232
		obj1;
	//  143  284:astore_3        
		  goto _L5
	//* 144  285:goto            195
		obj1 = null;
	//  145  288:aconst_null     
	//  146  289:astore_3        
		  goto _L4
	//* 147  290:goto            232
	}

	static void saveAppSessionInformation(Context context)
	{
		Object obj1 = staticLock;
	//    0    0:getstatic       #30  <Field Object staticLock>
	//    1    3:astore          5
		obj1;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		boolean flag = hasChanges;
	//    4    8:getstatic       #32  <Field boolean hasChanges>
	//    5   11:istore_1        
		Context context1;
		String s;
		if(!flag)
			break MISSING_BLOCK_LABEL_157;
	//    6   12:iload_1         
	//    7   13:ifeq            157
		s = null;
	//    8   16:aconst_null     
	//    9   17:astore          4
		context1 = null;
	//   10   19:aconst_null     
	//   11   20:astore_2        
		context = ((Context) (new ObjectOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)))))))));
	//   12   21:new             #166 <Class ObjectOutputStream>
	//   13   24:dup             
	//   14   25:new             #168 <Class BufferedOutputStream>
	//   15   28:dup             
	//   16   29:aload_0         
	//   17   30:ldc1            #13  <String "AppEventsLogger.persistedsessioninfo">
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #172 <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
	//   20   36:invokespecial   #175 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   21   39:invokespecial   #176 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   22   42:astore_0        
		((ObjectOutputStream) (context)).writeObject(((Object) (appSessionInfoMap)));
	//   23   43:aload_0         
	//   24   44:getstatic       #46  <Field Map appSessionInfoMap>
	//   25   47:invokevirtual   #180 <Method void ObjectOutputStream.writeObject(Object)>
		hasChanges = false;
	//   26   50:iconst_0        
	//   27   51:putstatic       #32  <Field boolean hasChanges>
		Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info saved");
	//   28   54:getstatic       #119 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   29   57:ldc1            #121 <String "AppEvents">
	//   30   59:ldc1            #182 <String "App session info saved">
	//   31   61:invokestatic    #129 <Method void Logger.log(LoggingBehavior, String, String)>
		Utility.closeQuietly(((java.io.Closeable) (context)));
	//   32   64:aload_0         
	//   33   65:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		break MISSING_BLOCK_LABEL_157;
	//   34   68:goto            157
		Object obj;
		obj;
	//   35   71:astore_3        
		context1 = context;
	//   36   72:aload_0         
	//   37   73:astore_2        
		context = ((Context) (obj));
	//   38   74:aload_3         
	//   39   75:astore_0        
		break MISSING_BLOCK_LABEL_151;
	//   40   76:goto            151
		obj;
	//   41   79:astore_3        
		break MISSING_BLOCK_LABEL_91;
	//   42   80:goto            91
		context;
	//   43   83:astore_0        
		break MISSING_BLOCK_LABEL_151;
	//   44   84:goto            151
		obj;
	//   45   87:astore_3        
		context = ((Context) (s));
	//   46   88:aload           4
	//   47   90:astore_0        
		context1 = context;
	//   48   91:aload_0         
	//   49   92:astore_2        
		s = AppEventsLogger.access$200();
	//   50   93:invokestatic    #144 <Method String AppEventsLogger.access$200()>
	//   51   96:astore          4
		context1 = context;
	//   52   98:aload_0         
	//   53   99:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   54  100:new             #146 <Class StringBuilder>
	//   55  103:dup             
	//   56  104:invokespecial   #147 <Method void StringBuilder()>
	//   57  107:astore          6
		context1 = context;
	//   58  109:aload_0         
	//   59  110:astore_2        
		stringbuilder.append("Got unexpected exception while writing app session info: ");
	//   60  111:aload           6
	//   61  113:ldc1            #184 <String "Got unexpected exception while writing app session info: ">
	//   62  115:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   63  118:pop             
		context1 = context;
	//   64  119:aload_0         
	//   65  120:astore_2        
		stringbuilder.append(((Exception) (obj)).toString());
	//   66  121:aload           6
	//   67  123:aload_3         
	//   68  124:invokevirtual   #156 <Method String Exception.toString()>
	//   69  127:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   70  130:pop             
		context1 = context;
	//   71  131:aload_0         
	//   72  132:astore_2        
		Log.w(s, stringbuilder.toString());
	//   73  133:aload           4
	//   74  135:aload           6
	//   75  137:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   76  140:invokestatic    #163 <Method int Log.w(String, String)>
	//   77  143:pop             
		Utility.closeQuietly(((java.io.Closeable) (context)));
	//   78  144:aload_0         
	//   79  145:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		break MISSING_BLOCK_LABEL_157;
	//   80  148:goto            157
		Utility.closeQuietly(((java.io.Closeable) (context1)));
	//   81  151:aload_2         
	//   82  152:invokestatic    #135 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw context;
	//   83  155:aload_0         
	//   84  156:athrow          
		obj1;
	//   85  157:aload           5
		JVM INSTR monitorexit ;
	//   86  159:monitorexit     
		return;
	//   87  160:return          
		context;
	//   88  161:astore_0        
		obj1;
	//   89  162:aload           5
		JVM INSTR monitorexit ;
	//   90  164:monitorexit     
		throw context;
	//   91  165:aload_0         
	//   92  166:athrow          
	}

	private static final String PERSISTED_SESSION_INFO_FILENAME = "AppEventsLogger.persistedsessioninfo";
	private static final Runnable appSessionInfoFlushRunnable = new Runnable() {

		public void run()
		{
			AppEventsLogger.PersistedAppSessionInfo.saveAppSessionInformation(FacebookSdk.getApplicationContext());
		//    0    0:invokestatic    #23  <Method Context FacebookSdk.getApplicationContext()>
		//    1    3:invokestatic    #27  <Method void AppEventsLogger$PersistedAppSessionInfo.saveAppSessionInformation(Context)>
		//    2    6:return          
		}

	}
;
	private static Map appSessionInfoMap;
	private static boolean hasChanges = false;
	private static boolean isLoaded = false;
	private static final Object staticLock = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void Object()>
	//    3    7:putstatic       #30  <Field Object staticLock>
	//    4   10:iconst_0        
	//    5   11:putstatic       #32  <Field boolean hasChanges>
	//    6   14:iconst_0        
	//    7   15:putstatic       #34  <Field boolean isLoaded>
	//    8   18:new             #9   <Class AppEventsLogger$PersistedAppSessionInfo$1>
	//    9   21:dup             
	//   10   22:invokespecial   #35  <Method void AppEventsLogger$PersistedAppSessionInfo$1()>
	//   11   25:putstatic       #37  <Field Runnable appSessionInfoFlushRunnable>
	//*  12   28:return          
	}

	AppEventsLogger$PersistedAppSessionInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}
}
