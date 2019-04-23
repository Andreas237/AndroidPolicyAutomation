// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.app.Activity;
import android.app.Application;
import android.content.*;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import bolts.AppLinks;
import com.facebook.*;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents:
//			AccessTokenAppIdPair, AnalyticsUserIDStore, UserDataStore, FacebookSDKJSInterface, 
//			FlushReason, AppEventQueue, AppEvent, FacebookTimeSpentData

public class AppEventsLogger
{
	public static final class FlushBehavior extends Enum
	{

		public static FlushBehavior valueOf(String s)
		{
			return (FlushBehavior)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushBehavior, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$FlushBehavior>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$FlushBehavior>
		//    4    9:areturn         
		}

		public static FlushBehavior[] values()
		{
			return (FlushBehavior[])((FlushBehavior []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushBehavior_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppEventsLogger$FlushBehavior[]>
		//    3    9:areturn         
		}

		private static final FlushBehavior $VALUES[];
		public static final FlushBehavior AUTO;
		public static final FlushBehavior EXPLICIT_ONLY;

		static 
		{
			AUTO = new FlushBehavior("AUTO", 0);
		//    0    0:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "AUTO">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//    5   10:putstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
			EXPLICIT_ONLY = new FlushBehavior("EXPLICIT_ONLY", 1);
		//    6   13:new             #2   <Class AppEventsLogger$FlushBehavior>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "EXPLICIT_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
		//   11   23:putstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
			$VALUES = (new FlushBehavior[] {
				AUTO, EXPLICIT_ONLY
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FlushBehavior[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
		//*  23   45:return          
		}

		private FlushBehavior(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static class PersistedAppSessionInfo
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
				AppEventsLogger.backgroundExecutor.schedule(appSessionInfoFlushRunnable, 30L, TimeUnit.SECONDS);
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
			String s = AppEventsLogger.TAG;
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
			s = AppEventsLogger.TAG;
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
				PersistedAppSessionInfo.saveAppSessionInformation(FacebookSdk.getApplicationContext());
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

		PersistedAppSessionInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class ProductAvailability extends Enum
	{

		public static ProductAvailability valueOf(String s)
		{
			return (ProductAvailability)Enum.valueOf(com/facebook/appevents/AppEventsLogger$ProductAvailability, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$ProductAvailability>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$ProductAvailability>
		//    4    9:areturn         
		}

		public static ProductAvailability[] values()
		{
			return (ProductAvailability[])((ProductAvailability []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field AppEventsLogger$ProductAvailability[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$ProductAvailability_3B_.clone()>
		//    2    6:checkcast       #50  <Class AppEventsLogger$ProductAvailability[]>
		//    3    9:areturn         
		}

		private static final ProductAvailability $VALUES[];
		public static final ProductAvailability AVALIABLE_FOR_ORDER;
		public static final ProductAvailability DISCONTINUED;
		public static final ProductAvailability IN_STOCK;
		public static final ProductAvailability OUT_OF_STOCK;
		public static final ProductAvailability PREORDER;

		static 
		{
			IN_STOCK = new ProductAvailability("IN_STOCK", 0);
		//    0    0:new             #2   <Class AppEventsLogger$ProductAvailability>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "IN_STOCK">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
		//    5   10:putstatic       #25  <Field AppEventsLogger$ProductAvailability IN_STOCK>
			OUT_OF_STOCK = new ProductAvailability("OUT_OF_STOCK", 1);
		//    6   13:new             #2   <Class AppEventsLogger$ProductAvailability>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "OUT_OF_STOCK">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
		//   11   23:putstatic       #28  <Field AppEventsLogger$ProductAvailability OUT_OF_STOCK>
			PREORDER = new ProductAvailability("PREORDER", 2);
		//   12   26:new             #2   <Class AppEventsLogger$ProductAvailability>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "PREORDER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
		//   17   36:putstatic       #31  <Field AppEventsLogger$ProductAvailability PREORDER>
			AVALIABLE_FOR_ORDER = new ProductAvailability("AVALIABLE_FOR_ORDER", 3);
		//   18   39:new             #2   <Class AppEventsLogger$ProductAvailability>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "AVALIABLE_FOR_ORDER">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
		//   23   49:putstatic       #34  <Field AppEventsLogger$ProductAvailability AVALIABLE_FOR_ORDER>
			DISCONTINUED = new ProductAvailability("DISCONTINUED", 4);
		//   24   52:new             #2   <Class AppEventsLogger$ProductAvailability>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "DISCONTINUED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
		//   29   62:putstatic       #37  <Field AppEventsLogger$ProductAvailability DISCONTINUED>
			$VALUES = (new ProductAvailability[] {
				IN_STOCK, OUT_OF_STOCK, PREORDER, AVALIABLE_FOR_ORDER, DISCONTINUED
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       ProductAvailability[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field AppEventsLogger$ProductAvailability IN_STOCK>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field AppEventsLogger$ProductAvailability OUT_OF_STOCK>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field AppEventsLogger$ProductAvailability PREORDER>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field AppEventsLogger$ProductAvailability AVALIABLE_FOR_ORDER>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field AppEventsLogger$ProductAvailability DISCONTINUED>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field AppEventsLogger$ProductAvailability[] $VALUES>
		//*  53  102:return          
		}

		private ProductAvailability(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class ProductCondition extends Enum
	{

		public static ProductCondition valueOf(String s)
		{
			return (ProductCondition)Enum.valueOf(com/facebook/appevents/AppEventsLogger$ProductCondition, s);
		//    0    0:ldc1            #2   <Class AppEventsLogger$ProductCondition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLogger$ProductCondition>
		//    4    9:areturn         
		}

		public static ProductCondition[] values()
		{
			return (ProductCondition[])((ProductCondition []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field AppEventsLogger$ProductCondition[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$ProductCondition_3B_.clone()>
		//    2    6:checkcast       #42  <Class AppEventsLogger$ProductCondition[]>
		//    3    9:areturn         
		}

		private static final ProductCondition $VALUES[];
		public static final ProductCondition NEW;
		public static final ProductCondition REFURBISHED;
		public static final ProductCondition USED;

		static 
		{
			NEW = new ProductCondition("NEW", 0);
		//    0    0:new             #2   <Class AppEventsLogger$ProductCondition>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "NEW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
		//    5   10:putstatic       #23  <Field AppEventsLogger$ProductCondition NEW>
			REFURBISHED = new ProductCondition("REFURBISHED", 1);
		//    6   13:new             #2   <Class AppEventsLogger$ProductCondition>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "REFURBISHED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
		//   11   23:putstatic       #26  <Field AppEventsLogger$ProductCondition REFURBISHED>
			USED = new ProductCondition("USED", 2);
		//   12   26:new             #2   <Class AppEventsLogger$ProductCondition>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "USED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
		//   17   36:putstatic       #29  <Field AppEventsLogger$ProductCondition USED>
			$VALUES = (new ProductCondition[] {
				NEW, REFURBISHED, USED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ProductCondition[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field AppEventsLogger$ProductCondition NEW>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field AppEventsLogger$ProductCondition REFURBISHED>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field AppEventsLogger$ProductCondition USED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field AppEventsLogger$ProductCondition[] $VALUES>
		//*  33   64:return          
		}

		private ProductCondition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private AppEventsLogger(Context context, String s, AccessToken accesstoken)
	{
		this(Utility.getActivityName(context), s, accesstoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #108 <Method String Utility.getActivityName(Context)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #111 <Method void AppEventsLogger(String, String, AccessToken)>
	//    6   10:return          
	}

	protected AppEventsLogger(String s, String s1, AccessToken accesstoken)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		Validate.sdkInitialized();
	//    2    4:invokestatic    #116 <Method void Validate.sdkInitialized()>
		contextName = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #118 <Field String contextName>
		s = ((String) (accesstoken));
	//    6   12:aload_3         
	//    7   13:astore_1        
		if(accesstoken == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       22
			s = ((String) (AccessToken.getCurrentAccessToken()));
	//   10   18:invokestatic    #124 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   11   21:astore_1        
		if(AccessToken.isCurrentAccessTokenActive() && (s1 == null || s1.equals(((Object) (((AccessToken) (s)).getApplicationId())))))
	//*  12   22:invokestatic    #128 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*  13   25:ifeq            58
	//*  14   28:aload_2         
	//*  15   29:ifnull          43
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #131 <Method String AccessToken.getApplicationId()>
	//*  19   37:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  20   40:ifeq            58
		{
			accessTokenAppId = new AccessTokenAppIdPair(((AccessToken) (s)));
	//   21   43:aload_0         
	//   22   44:new             #139 <Class AccessTokenAppIdPair>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #142 <Method void AccessTokenAppIdPair(AccessToken)>
	//   26   52:putfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
		} else
	//*  27   55:goto            84
		{
			s = s1;
	//   28   58:aload_2         
	//   29   59:astore_1        
			if(s1 == null)
	//*  30   60:aload_2         
	//*  31   61:ifnonnull       71
				s = Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext());
	//   32   64:invokestatic    #150 <Method Context FacebookSdk.getApplicationContext()>
	//   33   67:invokestatic    #153 <Method String Utility.getMetadataApplicationId(Context)>
	//   34   70:astore_1        
			accessTokenAppId = new AccessTokenAppIdPair(((String) (null)), s);
	//   35   71:aload_0         
	//   36   72:new             #139 <Class AccessTokenAppIdPair>
	//   37   75:dup             
	//   38   76:aconst_null     
	//   39   77:aload_1         
	//   40   78:invokespecial   #156 <Method void AccessTokenAppIdPair(String, String)>
	//   41   81:putfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
		}
		initializeTimersIfNeeded();
	//   42   84:invokestatic    #159 <Method void initializeTimersIfNeeded()>
	//   43   87:return          
	}

	public static void activateApp(Application application)
	{
		activateApp(application, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #181 <Method void activateApp(Application, String)>
	//    3    5:return          
	}

	public static void activateApp(Application application, String s)
	{
		if(FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #184 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifeq            33
		{
			AnalyticsUserIDStore.initStore();
	//    2    6:invokestatic    #189 <Method void AnalyticsUserIDStore.initStore()>
			UserDataStore.initStore();
	//    3    9:invokestatic    #192 <Method void UserDataStore.initStore()>
			String s1 = s;
	//    4   12:aload_1         
	//    5   13:astore_2        
			if(s == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       22
				s1 = FacebookSdk.getApplicationId();
	//    8   18:invokestatic    #193 <Method String FacebookSdk.getApplicationId()>
	//    9   21:astore_2        
			FacebookSdk.publishInstallAsync(((Context) (application)), s1);
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:invokestatic    #197 <Method void FacebookSdk.publishInstallAsync(Context, String)>
			ActivityLifecycleTracker.startTracking(application, s1);
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokestatic    #202 <Method void ActivityLifecycleTracker.startTracking(Application, String)>
			return;
	//   16   32:return          
		} else
		{
			throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
	//   17   33:new             #204 <Class FacebookException>
	//   18   36:dup             
	//   19   37:ldc1            #206 <String "The Facebook sdk must be initialized before calling activateApp">
	//   20   39:invokespecial   #209 <Method void FacebookException(String)>
	//   21   42:athrow          
		}
	}

	public static void activateApp(Context context)
	{
		if(ActivityLifecycleTracker.isTracking())
	//*   0    0:invokestatic    #214 <Method boolean ActivityLifecycleTracker.isTracking()>
	//*   1    3:ifeq            16
		{
			Log.w(TAG, "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc1            #216 <String "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.">
	//    4   11:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   14:pop             
			return;
	//    6   15:return          
		} else
		{
			FacebookSdk.sdkInitialize(context);
	//    7   16:aload_0         
	//    8   17:invokestatic    #225 <Method void FacebookSdk.sdkInitialize(Context)>
			activateApp(context, Utility.getMetadataApplicationId(context));
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:invokestatic    #153 <Method String Utility.getMetadataApplicationId(Context)>
	//   12   25:invokestatic    #227 <Method void activateApp(Context, String)>
			return;
	//   13   28:return          
		}
	}

	public static void activateApp(Context context, String s)
	{
		if(ActivityLifecycleTracker.isTracking())
	//*   0    0:invokestatic    #214 <Method boolean ActivityLifecycleTracker.isTracking()>
	//*   1    3:ifeq            16
		{
			Log.w(TAG, "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc1            #216 <String "activateApp events are being logged automatically. There's no need to call activateApp explicitly, this is safe to remove.">
	//    4   11:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   14:pop             
			return;
	//    6   15:return          
		}
		if(context != null && s != null)
	//*   7   16:aload_0         
	//*   8   17:ifnull          101
	//*   9   20:aload_1         
	//*  10   21:ifnull          101
		{
			AnalyticsUserIDStore.initStore();
	//   11   24:invokestatic    #189 <Method void AnalyticsUserIDStore.initStore()>
			UserDataStore.initStore();
	//   12   27:invokestatic    #192 <Method void UserDataStore.initStore()>
			if(context instanceof Activity)
	//*  13   30:aload_0         
	//*  14   31:instanceof      #230 <Class Activity>
	//*  15   34:ifeq            47
			{
				setSourceApplication((Activity)context);
	//   16   37:aload_0         
	//   17   38:checkcast       #230 <Class Activity>
	//   18   41:invokestatic    #234 <Method void setSourceApplication(Activity)>
			} else
	//*  19   44:goto            60
			{
				resetSourceApplication();
	//   20   47:invokestatic    #237 <Method void resetSourceApplication()>
				Utility.logd(((Class) (com/facebook/appevents/AppEventsLogger)).getName(), "To set source application the context of activateApp must be an instance of Activity");
	//   21   50:ldc1            #2   <Class AppEventsLogger>
	//   22   52:invokevirtual   #240 <Method String Class.getName()>
	//   23   55:ldc1            #242 <String "To set source application the context of activateApp must be an instance of Activity">
	//   24   57:invokestatic    #245 <Method void Utility.logd(String, String)>
			}
			FacebookSdk.publishInstallAsync(context, s);
	//   25   60:aload_0         
	//   26   61:aload_1         
	//   27   62:invokestatic    #197 <Method void FacebookSdk.publishInstallAsync(Context, String)>
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//   28   65:new             #2   <Class AppEventsLogger>
	//   29   68:dup             
	//   30   69:aload_0         
	//   31   70:aload_1         
	//   32   71:aconst_null     
	//   33   72:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//   34   75:astore_0        
			long l = System.currentTimeMillis();
	//   35   76:invokestatic    #253 <Method long System.currentTimeMillis()>
	//   36   79:lstore_2        
			s = getSourceApplication();
	//   37   80:invokestatic    #256 <Method String getSourceApplication()>
	//   38   83:astore_1        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context)), l, s) {

				public void run()
				{
					logger.logAppSessionResumeEvent(eventTime, sourceApplicationInfo);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field AppEventsLogger val$logger>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field long val$eventTime>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field String val$sourceApplicationInfo>
				//    6   12:invokestatic    #33  <Method void AppEventsLogger.access$000(AppEventsLogger, long, String)>
				//    7   15:return          
				}

				final long val$eventTime;
				final AppEventsLogger val$logger;
				final String val$sourceApplicationInfo;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppEventsLogger val$logger>
				eventTime = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #23  <Field long val$eventTime>
				sourceApplicationInfo = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field String val$sourceApplicationInfo>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #28  <Method void Object()>
			//   11   20:return          
			}
			}
);
	//   39   84:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   40   87:new             #6   <Class AppEventsLogger$1>
	//   41   90:dup             
	//   42   91:aload_0         
	//   43   92:lload_2         
	//   44   93:aload_1         
	//   45   94:invokespecial   #258 <Method void AppEventsLogger$1(AppEventsLogger, long, String)>
	//   46   97:invokevirtual   #264 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   47  100:return          
		} else
		{
			throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   48  101:new             #266 <Class IllegalArgumentException>
	//   49  104:dup             
	//   50  105:ldc2            #268 <String "Both context and applicationId must be non-null">
	//   51  108:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//   52  111:athrow          
		}
	}

	public static void augmentWebView(WebView webview, Context context)
	{
		String as[] = android.os.Build.VERSION.RELEASE.split("\\.");
	//    0    0:getstatic       #276 <Field String android.os.Build$VERSION.RELEASE>
	//    1    3:ldc2            #278 <String "\\.">
	//    2    6:invokevirtual   #282 <Method String[] String.split(String)>
	//    3    9:astore          4
		int i = as.length;
	//    4   11:aload           4
	//    5   13:arraylength     
	//    6   14:istore_2        
		int j = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		if(i > 0)
	//*   9   17:iload_2         
	//*  10   18:ifle            32
			i = Integer.parseInt(as[0]);
	//   11   21:aload           4
	//   12   23:iconst_0        
	//   13   24:aaload          
	//   14   25:invokestatic    #288 <Method int Integer.parseInt(String)>
	//   15   28:istore_2        
		else
	//*  16   29:goto            34
			i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		if(as.length > 1)
	//*  19   34:aload           4
	//*  20   36:arraylength     
	//*  21   37:iconst_1        
	//*  22   38:icmple          49
			j = Integer.parseInt(as[1]);
	//   23   41:aload           4
	//   24   43:iconst_1        
	//   25   44:aaload          
	//   26   45:invokestatic    #288 <Method int Integer.parseInt(String)>
	//   27   48:istore_3        
		if(android.os.Build.VERSION.SDK_INT >= 17 && i >= 4 && (i != 4 || j > 1))
	//*  28   49:getstatic       #291 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   52:bipush          17
	//*  30   54:icmplt          122
	//*  31   57:iload_2         
	//*  32   58:iconst_4        
	//*  33   59:icmplt          122
	//*  34   62:iload_2         
	//*  35   63:iconst_4        
	//*  36   64:icmpne          75
	//*  37   67:iload_3         
	//*  38   68:iconst_1        
	//*  39   69:icmpgt          75
	//*  40   72:goto            122
		{
			context = ((Context) (new FacebookSDKJSInterface(context)));
	//   41   75:new             #293 <Class FacebookSDKJSInterface>
	//   42   78:dup             
	//   43   79:aload_1         
	//   44   80:invokespecial   #295 <Method void FacebookSDKJSInterface(Context)>
	//   45   83:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   46   84:new             #297 <Class StringBuilder>
	//   47   87:dup             
	//   48   88:invokespecial   #298 <Method void StringBuilder()>
	//   49   91:astore          4
			stringbuilder.append("fbmq_");
	//   50   93:aload           4
	//   51   95:ldc2            #300 <String "fbmq_">
	//   52   98:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   53  101:pop             
			stringbuilder.append(FacebookSdk.getApplicationId());
	//   54  102:aload           4
	//   55  104:invokestatic    #193 <Method String FacebookSdk.getApplicationId()>
	//   56  107:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
			webview.addJavascriptInterface(((Object) (context)), stringbuilder.toString());
	//   58  111:aload_0         
	//   59  112:aload_1         
	//   60  113:aload           4
	//   61  115:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   62  118:invokevirtual   #313 <Method void WebView.addJavascriptInterface(Object, String)>
			return;
	//   63  121:return          
		} else
		{
			Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
	//   64  122:getstatic       #319 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   65  125:getstatic       #90  <Field String TAG>
	//   66  128:ldc2            #321 <String "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2">
	//   67  131:invokestatic    #327 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//   68  134:return          
		}
	}

	public static void clearUserData()
	{
		UserDataStore.setUserDataAndHash(((Bundle) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #332 <Method void UserDataStore.setUserDataAndHash(Bundle)>
	//    2    4:return          
	}

	public static void clearUserID()
	{
		AnalyticsUserIDStore.setUserID(((String) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #336 <Method void AnalyticsUserIDStore.setUserID(String)>
	//    2    4:return          
	}

	public static void deactivateApp(Context context)
	{
		if(ActivityLifecycleTracker.isTracking())
	//*   0    0:invokestatic    #214 <Method boolean ActivityLifecycleTracker.isTracking()>
	//*   1    3:ifeq            17
		{
			Log.w(TAG, "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc2            #339 <String "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.">
	//    4   12:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   15:pop             
			return;
	//    6   16:return          
		} else
		{
			deactivateApp(context, Utility.getMetadataApplicationId(context));
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:invokestatic    #153 <Method String Utility.getMetadataApplicationId(Context)>
	//   10   22:invokestatic    #341 <Method void deactivateApp(Context, String)>
			return;
	//   11   25:return          
		}
	}

	public static void deactivateApp(Context context, String s)
	{
		if(ActivityLifecycleTracker.isTracking())
	//*   0    0:invokestatic    #214 <Method boolean ActivityLifecycleTracker.isTracking()>
	//*   1    3:ifeq            17
		{
			Log.w(TAG, "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc2            #339 <String "deactivateApp events are being logged automatically. There's no need to call deactivateApp, this is safe to remove.">
	//    4   12:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   15:pop             
			return;
	//    6   16:return          
		}
		if(context != null && s != null)
	//*   7   17:aload_0         
	//*   8   18:ifnull          59
	//*   9   21:aload_1         
	//*  10   22:ifnull          59
		{
			resetSourceApplication();
	//   11   25:invokestatic    #237 <Method void resetSourceApplication()>
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//   12   28:new             #2   <Class AppEventsLogger>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:aconst_null     
	//   17   35:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//   18   38:astore_0        
			long l = System.currentTimeMillis();
	//   19   39:invokestatic    #253 <Method long System.currentTimeMillis()>
	//   20   42:lstore_2        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context)), l) {

				public void run()
				{
					logger.logAppSessionSuspendEvent(eventTime);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AppEventsLogger val$logger>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field long val$eventTime>
				//    4    8:invokestatic    #29  <Method void AppEventsLogger.access$100(AppEventsLogger, long)>
				//    5   11:return          
				}

				final long val$eventTime;
				final AppEventsLogger val$logger;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppEventsLogger val$logger>
				eventTime = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #21  <Field long val$eventTime>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   21   43:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   22   46:new             #8   <Class AppEventsLogger$2>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:lload_2         
	//   26   52:invokespecial   #343 <Method void AppEventsLogger$2(AppEventsLogger, long)>
	//   27   55:invokevirtual   #264 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   28   58:return          
		} else
		{
			throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   29   59:new             #266 <Class IllegalArgumentException>
	//   30   62:dup             
	//   31   63:ldc2            #268 <String "Both context and applicationId must be non-null">
	//   32   66:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//   33   69:athrow          
		}
	}

	static void eagerFlush()
	{
		if(getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
	//*   0    0:invokestatic    #348 <Method AppEventsLogger$FlushBehavior getFlushBehavior()>
	//*   1    3:getstatic       #351 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   2    6:if_acmpeq       15
			AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
	//    3    9:getstatic       #357 <Field FlushReason FlushReason.EAGER_FLUSHING_EVENT>
	//    4   12:invokestatic    #363 <Method void AppEventQueue.flush(FlushReason)>
	//    5   15:return          
	}

	static Executor getAnalyticsExecutor()
	{
		if(backgroundExecutor == null)
	//*   0    0:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//*   1    3:ifnonnull       9
			initializeTimersIfNeeded();
	//    2    6:invokestatic    #159 <Method void initializeTimersIfNeeded()>
		return ((Executor) (backgroundExecutor));
	//    3    9:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    4   12:areturn         
	}

	public static String getAnonymousAppDeviceGUID(Context context)
	{
		if(anonymousAppDeviceGUID == null)
	//*   0    0:getstatic       #368 <Field String anonymousAppDeviceGUID>
	//*   1    3:ifnonnull       115
			synchronized(staticLock)
	//*   2    6:getstatic       #100 <Field Object staticLock>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:monitorenter    
			{
				if(anonymousAppDeviceGUID == null)
	//*   6   12:getstatic       #368 <Field String anonymousAppDeviceGUID>
	//*   7   15:ifnonnull       105
				{
					anonymousAppDeviceGUID = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", ((String) (null)));
	//    8   18:aload_0         
	//    9   19:ldc1            #44  <String "com.facebook.sdk.appEventPreferences">
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #374 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   25:ldc2            #375 <String "anonymousAppDeviceGUID">
	//   13   28:aconst_null     
	//   14   29:invokeinterface #381 <Method String SharedPreferences.getString(String, String)>
	//   15   34:putstatic       #368 <Field String anonymousAppDeviceGUID>
					if(anonymousAppDeviceGUID == null)
	//*  16   37:getstatic       #368 <Field String anonymousAppDeviceGUID>
	//*  17   40:ifnonnull       105
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   18   43:new             #297 <Class StringBuilder>
	//   19   46:dup             
	//   20   47:invokespecial   #298 <Method void StringBuilder()>
	//   21   50:astore_2        
						stringbuilder.append("XZ");
	//   22   51:aload_2         
	//   23   52:ldc2            #383 <String "XZ">
	//   24   55:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:pop             
						stringbuilder.append(UUID.randomUUID().toString());
	//   26   59:aload_2         
	//   27   60:invokestatic    #389 <Method UUID UUID.randomUUID()>
	//   28   63:invokevirtual   #390 <Method String UUID.toString()>
	//   29   66:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   30   69:pop             
						anonymousAppDeviceGUID = stringbuilder.toString();
	//   31   70:aload_2         
	//   32   71:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   33   74:putstatic       #368 <Field String anonymousAppDeviceGUID>
						context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", anonymousAppDeviceGUID).apply();
	//   34   77:aload_0         
	//   35   78:ldc1            #44  <String "com.facebook.sdk.appEventPreferences">
	//   36   80:iconst_0        
	//   37   81:invokevirtual   #374 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   38   84:invokeinterface #394 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   39   89:ldc2            #375 <String "anonymousAppDeviceGUID">
	//   40   92:getstatic       #368 <Field String anonymousAppDeviceGUID>
	//   41   95:invokeinterface #400 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   42  100:invokeinterface #403 <Method void android.content.SharedPreferences$Editor.apply()>
					}
				}
			}
	//   43  105:aload_1         
	//   44  106:monitorexit     
		break MISSING_BLOCK_LABEL_115;
	//   45  107:goto            115
		context;
	//   46  110:astore_0        
		obj;
	//   47  111:aload_1         
		JVM INSTR monitorexit ;
	//   48  112:monitorexit     
		throw context;
	//   49  113:aload_0         
	//   50  114:athrow          
		return anonymousAppDeviceGUID;
	//   51  115:getstatic       #368 <Field String anonymousAppDeviceGUID>
	//   52  118:areturn         
	}

	public static FlushBehavior getFlushBehavior()
	{
		FlushBehavior flushbehavior;
		synchronized(staticLock)
	//*   0    0:getstatic       #100 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			flushbehavior = flushBehavior;
	//    4    6:getstatic       #95  <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return flushbehavior;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static String getPushNotificationsRegistrationId()
	{
		String s;
		synchronized(staticLock)
	//*   0    0:getstatic       #100 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			s = pushNotificationsRegistrationId;
	//    4    6:getstatic       #406 <Field String pushNotificationsRegistrationId>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return s;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static String getSourceApplication()
	{
		String s = "Unclassified";
	//    0    0:ldc2            #408 <String "Unclassified">
	//    1    3:astore_0        
		if(isOpenedByAppLink)
	//*   2    4:getstatic       #410 <Field boolean isOpenedByAppLink>
	//*   3    7:ifeq            14
			s = "Applink";
	//    4   10:ldc2            #412 <String "Applink">
	//    5   13:astore_0        
		if(sourceApplication != null)
	//*   6   14:getstatic       #414 <Field String sourceApplication>
	//*   7   17:ifnull          63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   20:new             #297 <Class StringBuilder>
	//    9   23:dup             
	//   10   24:invokespecial   #298 <Method void StringBuilder()>
	//   11   27:astore_1        
			stringbuilder.append(s);
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append("(");
	//   16   34:aload_1         
	//   17   35:ldc2            #416 <String "(">
	//   18   38:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(sourceApplication);
	//   20   42:aload_1         
	//   21   43:getstatic       #414 <Field String sourceApplication>
	//   22   46:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(")");
	//   24   50:aload_1         
	//   25   51:ldc2            #418 <String ")">
	//   26   54:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			return stringbuilder.toString();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   30   62:areturn         
		} else
		{
			return s;
	//   31   63:aload_0         
	//   32   64:areturn         
		}
	}

	public static String getUserData()
	{
		return UserDataStore.getHashedUserData();
	//    0    0:invokestatic    #422 <Method String UserDataStore.getHashedUserData()>
	//    1    3:areturn         
	}

	public static String getUserID()
	{
		return AnalyticsUserIDStore.getUserID();
	//    0    0:invokestatic    #425 <Method String AnalyticsUserIDStore.getUserID()>
	//    1    3:areturn         
	}

	public static void initializeLib(Context context, String s)
	{
		if(!FacebookSdk.getAutoLogAppEventsEnabled())
	//*   0    0:invokestatic    #429 <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			context = ((Context) (new AppEventsLogger(context, s, ((AccessToken) (null)))));
	//    3    7:new             #2   <Class AppEventsLogger>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    9   17:astore_0        
			backgroundExecutor.execute(new Runnable(((AppEventsLogger) (context))) {

				public void run()
				{
					Bundle bundle = new Bundle();
				//    0    0:new             #26  <Class Bundle>
				//    1    3:dup             
				//    2    4:invokespecial   #27  <Method void Bundle()>
				//    3    7:astore_1        
					try
					{
						Class.forName("com.facebook.core.Core");
				//    4    8:ldc1            #29  <String "com.facebook.core.Core">
				//    5   10:invokestatic    #35  <Method Class Class.forName(String)>
				//    6   13:pop             
						bundle.putInt("core_lib_included", 1);
				//    7   14:aload_1         
				//    8   15:ldc1            #37  <String "core_lib_included">
				//    9   17:iconst_1        
				//   10   18:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
					}
				//*  11   21:ldc1            #43  <String "com.facebook.login.Login">
				//*  12   23:invokestatic    #35  <Method Class Class.forName(String)>
				//*  13   26:pop             
				//*  14   27:aload_1         
				//*  15   28:ldc1            #45  <String "login_lib_included">
				//*  16   30:iconst_1        
				//*  17   31:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  18   34:ldc1            #47  <String "com.facebook.share.Share">
				//*  19   36:invokestatic    #35  <Method Class Class.forName(String)>
				//*  20   39:pop             
				//*  21   40:aload_1         
				//*  22   41:ldc1            #49  <String "share_lib_included">
				//*  23   43:iconst_1        
				//*  24   44:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  25   47:ldc1            #51  <String "com.facebook.places.Places">
				//*  26   49:invokestatic    #35  <Method Class Class.forName(String)>
				//*  27   52:pop             
				//*  28   53:aload_1         
				//*  29   54:ldc1            #53  <String "places_lib_included">
				//*  30   56:iconst_1        
				//*  31   57:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  32   60:ldc1            #55  <String "com.facebook.messenger.Messenger">
				//*  33   62:invokestatic    #35  <Method Class Class.forName(String)>
				//*  34   65:pop             
				//*  35   66:aload_1         
				//*  36   67:ldc1            #57  <String "messenger_lib_included">
				//*  37   69:iconst_1        
				//*  38   70:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  39   73:ldc1            #59  <String "com.facebook.applinks.AppLinks">
				//*  40   75:invokestatic    #35  <Method Class Class.forName(String)>
				//*  41   78:pop             
				//*  42   79:aload_1         
				//*  43   80:ldc1            #61  <String "applinks_lib_included">
				//*  44   82:iconst_1        
				//*  45   83:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  46   86:ldc1            #63  <String "com.facebook.marketing.Marketing">
				//*  47   88:invokestatic    #35  <Method Class Class.forName(String)>
				//*  48   91:pop             
				//*  49   92:aload_1         
				//*  50   93:ldc1            #65  <String "marketing_lib_included">
				//*  51   95:iconst_1        
				//*  52   96:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  53   99:ldc1            #67  <String "com.facebook.all.All">
				//*  54  101:invokestatic    #35  <Method Class Class.forName(String)>
				//*  55  104:pop             
				//*  56  105:aload_1         
				//*  57  106:ldc1            #69  <String "all_lib_included">
				//*  58  108:iconst_1        
				//*  59  109:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  60  112:ldc1            #71  <String "com.android.billingclient.api.BillingClient">
				//*  61  114:invokestatic    #35  <Method Class Class.forName(String)>
				//*  62  117:pop             
				//*  63  118:aload_1         
				//*  64  119:ldc1            #73  <String "billing_client_lib_included">
				//*  65  121:iconst_1        
				//*  66  122:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  67  125:ldc1            #75  <String "com.android.vending.billing.IInAppBillingService">
				//*  68  127:invokestatic    #35  <Method Class Class.forName(String)>
				//*  69  130:pop             
				//*  70  131:aload_1         
				//*  71  132:ldc1            #77  <String "billing_service_lib_included">
				//*  72  134:iconst_1        
				//*  73  135:invokevirtual   #41  <Method void Bundle.putInt(String, int)>
				//*  74  138:aload_0         
				//*  75  139:getfield        #17  <Field AppEventsLogger val$logger>
				//*  76  142:ldc1            #79  <String "fb_sdk_initialize">
				//*  77  144:aconst_null     
				//*  78  145:aload_1         
				//*  79  146:invokevirtual   #83  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
				//*  80  149:return          
					catch(ClassNotFoundException classnotfoundexception) { }
				//   81  150:astore_2        
					try
					{
						Class.forName("com.facebook.login.Login");
						bundle.putInt("login_lib_included", 1);
					}
				//*  82  151:goto            21
					catch(ClassNotFoundException classnotfoundexception1) { }
				//   83  154:astore_2        
					try
					{
						Class.forName("com.facebook.share.Share");
						bundle.putInt("share_lib_included", 1);
					}
				//*  84  155:goto            34
					catch(ClassNotFoundException classnotfoundexception2) { }
				//   85  158:astore_2        
					try
					{
						Class.forName("com.facebook.places.Places");
						bundle.putInt("places_lib_included", 1);
					}
				//*  86  159:goto            47
					catch(ClassNotFoundException classnotfoundexception3) { }
				//   87  162:astore_2        
					try
					{
						Class.forName("com.facebook.messenger.Messenger");
						bundle.putInt("messenger_lib_included", 1);
					}
				//*  88  163:goto            60
					catch(ClassNotFoundException classnotfoundexception4) { }
				//   89  166:astore_2        
					try
					{
						Class.forName("com.facebook.applinks.AppLinks");
						bundle.putInt("applinks_lib_included", 1);
					}
				//*  90  167:goto            73
					catch(ClassNotFoundException classnotfoundexception5) { }
				//   91  170:astore_2        
					try
					{
						Class.forName("com.facebook.marketing.Marketing");
						bundle.putInt("marketing_lib_included", 1);
					}
				//*  92  171:goto            86
					catch(ClassNotFoundException classnotfoundexception6) { }
				//   93  174:astore_2        
					try
					{
						Class.forName("com.facebook.all.All");
						bundle.putInt("all_lib_included", 1);
					}
				//*  94  175:goto            99
					catch(ClassNotFoundException classnotfoundexception7) { }
				//   95  178:astore_2        
					try
					{
						Class.forName("com.android.billingclient.api.BillingClient");
						bundle.putInt("billing_client_lib_included", 1);
					}
				//*  96  179:goto            112
					catch(ClassNotFoundException classnotfoundexception8) { }
				//   97  182:astore_2        
					try
					{
						Class.forName("com.android.vending.billing.IInAppBillingService");
						bundle.putInt("billing_service_lib_included", 1);
					}
				//*  98  183:goto            125
					catch(ClassNotFoundException classnotfoundexception9) { }
				//   99  186:astore_2        
					logger.logSdkEvent("fb_sdk_initialize", ((Double) (null)), bundle);
				//* 100  187:goto            138
				}

				final AppEventsLogger val$logger;

			
			{
				logger = appeventslogger;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppEventsLogger val$logger>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   10   18:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   11   21:new             #10  <Class AppEventsLogger$3>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #432 <Method void AppEventsLogger$3(AppEventsLogger)>
	//   15   29:invokevirtual   #264 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
			return;
	//   16   32:return          
		}
	}

	private static void initializeTimersIfNeeded()
	{
label0:
		{
			synchronized(staticLock)
	//*   0    0:getstatic       #100 <Field Object staticLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
			{
				if(backgroundExecutor == null)
					break label0;
	//    4    6:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    5    9:ifnull          15
			}
	//    6   12:aload_0         
	//    7   13:monitorexit     
			return;
	//    8   14:return          
		}
		backgroundExecutor = new ScheduledThreadPoolExecutor(1);
	//    9   15:new             #260 <Class ScheduledThreadPoolExecutor>
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:invokespecial   #435 <Method void ScheduledThreadPoolExecutor(int)>
	//   13   23:putstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
		obj;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		obj = ((Object) (new Runnable() {

			public void run()
			{
				Object obj1 = ((Object) (new HashSet()));
			//    0    0:new             #18  <Class HashSet>
			//    1    3:dup             
			//    2    4:invokespecial   #19  <Method void HashSet()>
			//    3    7:astore_1        
				for(Iterator iterator = AppEventQueue.getKeySet().iterator(); iterator.hasNext(); ((Set) (obj1)).add(((Object) (((AccessTokenAppIdPair)iterator.next()).getApplicationId()))));
			//    4    8:invokestatic    #25  <Method Set AppEventQueue.getKeySet()>
			//    5   11:invokeinterface #31  <Method Iterator Set.iterator()>
			//    6   16:astore_2        
			//    7   17:aload_2         
			//    8   18:invokeinterface #37  <Method boolean Iterator.hasNext()>
			//    9   23:ifeq            48
			//   10   26:aload_1         
			//   11   27:aload_2         
			//   12   28:invokeinterface #41  <Method Object Iterator.next()>
			//   13   33:checkcast       #43  <Class AccessTokenAppIdPair>
			//   14   36:invokevirtual   #47  <Method String AccessTokenAppIdPair.getApplicationId()>
			//   15   39:invokeinterface #51  <Method boolean Set.add(Object)>
			//   16   44:pop             
			//*  17   45:goto            17
				for(obj1 = ((Object) (((Set) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); FetchedAppSettingsManager.queryAppSettings((String)((Iterator) (obj1)).next(), true));
			//   18   48:aload_1         
			//   19   49:invokeinterface #31  <Method Iterator Set.iterator()>
			//   20   54:astore_1        
			//   21   55:aload_1         
			//   22   56:invokeinterface #37  <Method boolean Iterator.hasNext()>
			//   23   61:ifeq            81
			//   24   64:aload_1         
			//   25   65:invokeinterface #41  <Method Object Iterator.next()>
			//   26   70:checkcast       #53  <Class String>
			//   27   73:iconst_1        
			//   28   74:invokestatic    #59  <Method com.facebook.internal.FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
			//   29   77:pop             
			//*  30   78:goto            55
			//   31   81:return          
			}

		}
));
	//   16   28:new             #14  <Class AppEventsLogger$5>
	//   17   31:dup             
	//   18   32:invokespecial   #436 <Method void AppEventsLogger$5()>
	//   19   35:astore_0        
		backgroundExecutor.scheduleAtFixedRate(((Runnable) (obj)), 0L, 0x15180L, TimeUnit.SECONDS);
	//   20   36:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   21   39:aload_0         
	//   22   40:lconst_0        
	//   23   41:ldc2w           #437 <Long 0x15180L>
	//   24   44:getstatic       #444 <Field TimeUnit TimeUnit.SECONDS>
	//   25   47:invokevirtual   #448 <Method java.util.concurrent.ScheduledFuture ScheduledThreadPoolExecutor.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   26   50:pop             
		return;
	//   27   51:return          
		exception;
	//   28   52:astore_1        
		obj;
	//   29   53:aload_0         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
		throw exception;
	//   31   55:aload_1         
	//   32   56:athrow          
	}

	private void logAppSessionResumeEvent(long l, String s)
	{
		PersistedAppSessionInfo.onResume(FacebookSdk.getApplicationContext(), accessTokenAppId, this, l, s);
	//    0    0:invokestatic    #150 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:aload_0         
	//    2    4:getfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:aload_3         
	//    6   10:invokestatic    #452 <Method void AppEventsLogger$PersistedAppSessionInfo.onResume(Context, AccessTokenAppIdPair, AppEventsLogger, long, String)>
	//    7   13:return          
	}

	private void logAppSessionSuspendEvent(long l)
	{
		PersistedAppSessionInfo.onSuspend(FacebookSdk.getApplicationContext(), accessTokenAppId, this, l);
	//    0    0:invokestatic    #150 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:aload_0         
	//    2    4:getfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:invokestatic    #456 <Method void AppEventsLogger$PersistedAppSessionInfo.onSuspend(Context, AccessTokenAppIdPair, AppEventsLogger, long)>
	//    6   12:return          
	}

	private static void logEvent(AppEvent appevent, AccessTokenAppIdPair accesstokenappidpair)
	{
		AppEventQueue.add(accesstokenappidpair, appevent);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #462 <Method void AppEventQueue.add(AccessTokenAppIdPair, AppEvent)>
		if(!appevent.getIsImplicit() && !isActivateAppEventRequested)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #467 <Method boolean AppEvent.getIsImplicit()>
	//*   5    9:ifne            48
	//*   6   12:getstatic       #469 <Field boolean isActivateAppEventRequested>
	//*   7   15:ifne            48
		{
			if(appevent.getName().equals("fb_mobile_activate_app"))
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #470 <Method String AppEvent.getName()>
	//*  10   22:ldc2            #472 <String "fb_mobile_activate_app">
	//*  11   25:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  12   28:ifeq            36
			{
				isActivateAppEventRequested = true;
	//   13   31:iconst_1        
	//   14   32:putstatic       #469 <Field boolean isActivateAppEventRequested>
				return;
	//   15   35:return          
			}
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
	//   16   36:getstatic       #475 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   17   39:ldc2            #477 <String "AppEvents">
	//   18   42:ldc2            #479 <String "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.">
	//   19   45:invokestatic    #327 <Method void Logger.log(LoggingBehavior, String, String)>
		}
	//   20   48:return          
	}

	private void logEvent(String s, Double double1, Bundle bundle, boolean flag, UUID uuid)
	{
		try
		{
			logEvent(new AppEvent(contextName, s, double1, bundle, flag, uuid), accessTokenAppId);
	//    0    0:new             #464 <Class AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field String contextName>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:aload           5
	//    9   15:invokespecial   #486 <Method void AppEvent(String, String, Double, Bundle, boolean, UUID)>
	//   10   18:aload_0         
	//   11   19:getfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
	//   12   22:invokestatic    #488 <Method void logEvent(AppEvent, AccessTokenAppIdPair)>
			return;
	//   13   25:return          
		}
	//*  14   26:astore_1        
	//*  15   27:getstatic       #475 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//*  16   30:ldc2            #477 <String "AppEvents">
	//*  17   33:ldc2            #490 <String "Invalid app event: %s">
	//*  18   36:iconst_1        
	//*  19   37:anewarray       Object[]
	//*  20   40:dup             
	//*  21   41:iconst_0        
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #491 <Method String FacebookException.toString()>
	//*  24   46:aastore         
	//*  25   47:invokestatic    #494 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
	//*  26   50:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   51:astore_1        
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
				((JSONException) (s)).toString()
			});
	//   28   52:getstatic       #475 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   29   55:ldc2            #477 <String "AppEvents">
	//   30   58:ldc2            #496 <String "JSON encoding for app event failed: '%s'">
	//   31   61:iconst_1        
	//   32   62:anewarray       Object[]
	//   33   65:dup             
	//   34   66:iconst_0        
	//   35   67:aload_1         
	//   36   68:invokevirtual   #497 <Method String JSONException.toString()>
	//   37   71:aastore         
	//   38   72:invokestatic    #494 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", new Object[] {
				((FacebookException) (s)).toString()
			});
			return;
		}
	//   39   75:return          
	}

	private void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle, boolean flag)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			notifyDeveloperError("purchaseAmount cannot be null");
	//    2    4:ldc2            #502 <String "purchaseAmount cannot be null">
	//    3    7:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//    4   10:return          
		}
		if(currency == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       22
		{
			notifyDeveloperError("currency cannot be null");
	//    7   15:ldc2            #507 <String "currency cannot be null">
	//    8   18:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//    9   21:return          
		}
		if(bundle == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       37
			bundle = new Bundle();
	//   12   26:new             #509 <Class Bundle>
	//   13   29:dup             
	//   14   30:invokespecial   #510 <Method void Bundle()>
	//   15   33:astore_3        
	//*  16   34:goto            37
		bundle.putString("fb_currency", currency.getCurrencyCode());
	//   17   37:aload_3         
	//   18   38:ldc2            #512 <String "fb_currency">
	//   19   41:aload_2         
	//   20   42:invokevirtual   #517 <Method String Currency.getCurrencyCode()>
	//   21   45:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		logEvent("fb_mobile_purchase", Double.valueOf(bigdecimal.doubleValue()), bundle, flag, ActivityLifecycleTracker.getCurrentSessionGuid());
	//   22   48:aload_0         
	//   23   49:ldc2            #521 <String "fb_mobile_purchase">
	//   24   52:aload_1         
	//   25   53:invokevirtual   #527 <Method double BigDecimal.doubleValue()>
	//   26   56:invokestatic    #533 <Method Double Double.valueOf(double)>
	//   27   59:aload_3         
	//   28   60:iload           4
	//   29   62:invokestatic    #536 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//   30   65:invokespecial   #538 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
		eagerFlush();
	//   31   68:invokestatic    #540 <Method void eagerFlush()>
	//   32   71:return          
	}

	public static AppEventsLogger newLogger(Context context)
	{
		return new AppEventsLogger(context, ((String) (null)), ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, AccessToken accesstoken)
	{
		return new AppEventsLogger(context, ((String) (null)), accesstoken);
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, String s)
	{
		return new AppEventsLogger(context, s, ((AccessToken) (null)));
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	public static AppEventsLogger newLogger(Context context, String s, AccessToken accesstoken)
	{
		return new AppEventsLogger(context, s, accesstoken);
	//    0    0:new             #2   <Class AppEventsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #247 <Method void AppEventsLogger(Context, String, AccessToken)>
	//    6   10:areturn         
	}

	private static void notifyDeveloperError(String s)
	{
		Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", s);
	//    0    0:getstatic       #319 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//    1    3:ldc2            #477 <String "AppEvents">
	//    2    6:aload_0         
	//    3    7:invokestatic    #327 <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   10:return          
	}

	public static void onContextStop()
	{
		AppEventQueue.persistToDisk();
	//    0    0:invokestatic    #549 <Method void AppEventQueue.persistToDisk()>
	//    1    3:return          
	}

	static void resetSourceApplication()
	{
		sourceApplication = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #414 <Field String sourceApplication>
		isOpenedByAppLink = false;
	//    2    4:iconst_0        
	//    3    5:putstatic       #410 <Field boolean isOpenedByAppLink>
	//    4    8:return          
	}

	public static void setFlushBehavior(FlushBehavior flushbehavior)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #100 <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			flushBehavior = flushbehavior;
	//    4    6:aload_0         
	//    5    7:putstatic       #95  <Field AppEventsLogger$FlushBehavior flushBehavior>
		}
	//    6   10:aload_1         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		flushbehavior;
	//    9   13:astore_0        
		obj;
	//   10   14:aload_1         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw flushbehavior;
	//   12   16:aload_0         
	//   13   17:athrow          
	}

	public static void setPushNotificationsRegistrationId(String s)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #100 <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(!Utility.stringsEqualOrEmpty(pushNotificationsRegistrationId, s))
	//*   4    6:getstatic       #406 <Field String pushNotificationsRegistrationId>
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #556 <Method boolean Utility.stringsEqualOrEmpty(String, String)>
	//*   7   13:ifne            47
			{
				pushNotificationsRegistrationId = s;
	//    8   16:aload_0         
	//    9   17:putstatic       #406 <Field String pushNotificationsRegistrationId>
				s = ((String) (newLogger(FacebookSdk.getApplicationContext())));
	//   10   20:invokestatic    #150 <Method Context FacebookSdk.getApplicationContext()>
	//   11   23:invokestatic    #558 <Method AppEventsLogger newLogger(Context)>
	//   12   26:astore_0        
				((AppEventsLogger) (s)).logEvent("fb_mobile_obtain_push_token");
	//   13   27:aload_0         
	//   14   28:ldc2            #560 <String "fb_mobile_obtain_push_token">
	//   15   31:invokevirtual   #562 <Method void logEvent(String)>
				if(getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
	//*  16   34:invokestatic    #348 <Method AppEventsLogger$FlushBehavior getFlushBehavior()>
	//*  17   37:getstatic       #351 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*  18   40:if_acmpeq       47
					((AppEventsLogger) (s)).flush();
	//   19   43:aload_0         
	//   20   44:invokevirtual   #564 <Method void flush()>
			}
		}
	//   21   47:aload_1         
	//   22   48:monitorexit     
		return;
	//   23   49:return          
		s;
	//   24   50:astore_0        
		obj;
	//   25   51:aload_1         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		throw s;
	//   27   53:aload_0         
	//   28   54:athrow          
	}

	private static void setSourceApplication(Activity activity)
	{
		Object obj = ((Object) (activity.getCallingActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #568 <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
		{
			obj = ((Object) (((ComponentName) (obj)).getPackageName()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #573 <Method String ComponentName.getPackageName()>
	//    7   13:astore_1        
			if(((String) (obj)).equals(((Object) (activity.getPackageName()))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #574 <Method String Activity.getPackageName()>
	//*  11   19:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  12   22:ifeq            29
			{
				resetSourceApplication();
	//   13   25:invokestatic    #237 <Method void resetSourceApplication()>
				return;
	//   14   28:return          
			}
			sourceApplication = ((String) (obj));
	//   15   29:aload_1         
	//   16   30:putstatic       #414 <Field String sourceApplication>
		}
		activity = ((Activity) (activity.getIntent()));
	//   17   33:aload_0         
	//   18   34:invokevirtual   #578 <Method Intent Activity.getIntent()>
	//   19   37:astore_0        
		if(activity != null && !((Intent) (activity)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
	//*  20   38:aload_0         
	//*  21   39:ifnull          108
	//*  22   42:aload_0         
	//*  23   43:ldc1            #64  <String "_fbSourceApplicationHasBeenSet">
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #584 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  26   49:ifeq            55
	//*  27   52:goto            108
		{
			Bundle bundle = AppLinks.getAppLinkData(((Intent) (activity)));
	//   28   55:aload_0         
	//   29   56:invokestatic    #590 <Method Bundle AppLinks.getAppLinkData(Intent)>
	//   30   59:astore_1        
			if(bundle == null)
	//*  31   60:aload_1         
	//*  32   61:ifnonnull       68
			{
				resetSourceApplication();
	//   33   64:invokestatic    #237 <Method void resetSourceApplication()>
				return;
	//   34   67:return          
			}
			isOpenedByAppLink = true;
	//   35   68:iconst_1        
	//   36   69:putstatic       #410 <Field boolean isOpenedByAppLink>
			bundle = bundle.getBundle("referer_app_link");
	//   37   72:aload_1         
	//   38   73:ldc2            #592 <String "referer_app_link">
	//   39   76:invokevirtual   #596 <Method Bundle Bundle.getBundle(String)>
	//   40   79:astore_1        
			if(bundle == null)
	//*  41   80:aload_1         
	//*  42   81:ifnonnull       89
			{
				sourceApplication = null;
	//   43   84:aconst_null     
	//   44   85:putstatic       #414 <Field String sourceApplication>
				return;
	//   45   88:return          
			} else
			{
				sourceApplication = bundle.getString("package");
	//   46   89:aload_1         
	//   47   90:ldc2            #598 <String "package">
	//   48   93:invokevirtual   #601 <Method String Bundle.getString(String)>
	//   49   96:putstatic       #414 <Field String sourceApplication>
				((Intent) (activity)).putExtra("_fbSourceApplicationHasBeenSet", true);
	//   50   99:aload_0         
	//   51  100:ldc1            #64  <String "_fbSourceApplicationHasBeenSet">
	//   52  102:iconst_1        
	//   53  103:invokevirtual   #605 <Method Intent Intent.putExtra(String, boolean)>
	//   54  106:pop             
				return;
	//   55  107:return          
			}
		} else
		{
			resetSourceApplication();
	//   56  108:invokestatic    #237 <Method void resetSourceApplication()>
			return;
	//   57  111:return          
		}
	}

	static void setSourceApplication(String s, boolean flag)
	{
		sourceApplication = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #414 <Field String sourceApplication>
		isOpenedByAppLink = flag;
	//    2    4:iload_1         
	//    3    5:putstatic       #410 <Field boolean isOpenedByAppLink>
	//    4    8:return          
	}

	public static void setUserData(Bundle bundle)
	{
		UserDataStore.setUserDataAndHash(bundle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #332 <Method void UserDataStore.setUserDataAndHash(Bundle)>
	//    2    4:return          
	}

	public static void setUserData(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
			String s8, String s9)
	{
		UserDataStore.setUserDataAndHash(s, s1, s2, s3, s4, s5, s6, s7, s8, s9);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:invokestatic    #610 <Method void UserDataStore.setUserDataAndHash(String, String, String, String, String, String, String, String, String, String)>
	//   11   19:return          
	}

	public static void setUserID(String s)
	{
		AnalyticsUserIDStore.setUserID(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #336 <Method void AnalyticsUserIDStore.setUserID(String)>
	//    2    4:return          
	}

	public static void updateUserProperties(Bundle bundle, com.facebook.GraphRequest.Callback callback)
	{
		updateUserProperties(bundle, FacebookSdk.getApplicationId(), callback);
	//    0    0:aload_0         
	//    1    1:invokestatic    #193 <Method String FacebookSdk.getApplicationId()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #615 <Method void updateUserProperties(Bundle, String, com.facebook.GraphRequest$Callback)>
	//    4    8:return          
	}

	public static void updateUserProperties(Bundle bundle, String s, com.facebook.GraphRequest.Callback callback)
	{
		getAnalyticsExecutor().execute(new Runnable(bundle, s, callback) {

			public void run()
			{
				Object obj1 = ((Object) (AppEventsLogger.getUserID()));
			//    0    0:invokestatic    #35  <Method String AppEventsLogger.getUserID()>
			//    1    3:astore_2        
				if(obj1 != null && !((String) (obj1)).isEmpty())
			//*   2    4:aload_2         
			//*   3    5:ifnull          169
			//*   4    8:aload_2         
			//*   5    9:invokevirtual   #41  <Method boolean String.isEmpty()>
			//*   6   12:ifeq            18
			//*   7   15:goto            169
				{
					Object obj = ((Object) (new Bundle()));
			//    8   18:new             #43  <Class Bundle>
			//    9   21:dup             
			//   10   22:invokespecial   #44  <Method void Bundle()>
			//   11   25:astore_1        
					((Bundle) (obj)).putString("user_unique_id", ((String) (obj1)));
			//   12   26:aload_1         
			//   13   27:ldc1            #46  <String "user_unique_id">
			//   14   29:aload_2         
			//   15   30:invokevirtual   #50  <Method void Bundle.putString(String, String)>
					((Bundle) (obj)).putBundle("custom_data", parameters);
			//   16   33:aload_1         
			//   17   34:ldc1            #52  <String "custom_data">
			//   18   36:aload_0         
			//   19   37:getfield        #20  <Field Bundle val$parameters>
			//   20   40:invokevirtual   #56  <Method void Bundle.putBundle(String, Bundle)>
					obj1 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
			//   21   43:invokestatic    #62  <Method Context FacebookSdk.getApplicationContext()>
			//   22   46:invokestatic    #68  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
			//   23   49:astore_2        
					if(obj1 != null && ((AttributionIdentifiers) (obj1)).getAndroidAdvertiserId() != null)
			//*  24   50:aload_2         
			//*  25   51:ifnull          71
			//*  26   54:aload_2         
			//*  27   55:invokevirtual   #71  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
			//*  28   58:ifnull          71
						((Bundle) (obj)).putString("advertiser_id", ((AttributionIdentifiers) (obj1)).getAndroidAdvertiserId());
			//   29   61:aload_1         
			//   30   62:ldc1            #73  <String "advertiser_id">
			//   31   64:aload_2         
			//   32   65:invokevirtual   #71  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
			//   33   68:invokevirtual   #50  <Method void Bundle.putString(String, String)>
					obj1 = ((Object) (new Bundle()));
			//   34   71:new             #43  <Class Bundle>
			//   35   74:dup             
			//   36   75:invokespecial   #44  <Method void Bundle()>
			//   37   78:astore_2        
					try
					{
						obj = ((Object) (BundleJSONConverter.convertToJSON(((Bundle) (obj)))));
			//   38   79:aload_1         
			//   39   80:invokestatic    #79  <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
			//   40   83:astore_1        
						JSONArray jsonarray = new JSONArray();
			//   41   84:new             #81  <Class JSONArray>
			//   42   87:dup             
			//   43   88:invokespecial   #82  <Method void JSONArray()>
			//   44   91:astore_3        
						jsonarray.put(obj);
			//   45   92:aload_3         
			//   46   93:aload_1         
			//   47   94:invokevirtual   #86  <Method JSONArray JSONArray.put(Object)>
			//   48   97:pop             
						((Bundle) (obj1)).putString("data", jsonarray.toString());
			//   49   98:aload_2         
			//   50   99:ldc1            #88  <String "data">
			//   51  101:aload_3         
			//   52  102:invokevirtual   #91  <Method String JSONArray.toString()>
			//   53  105:invokevirtual   #50  <Method void Bundle.putString(String, String)>
					}
			//*  54  108:new             #93  <Class GraphRequest>
			//*  55  111:dup             
			//*  56  112:invokestatic    #99  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//*  57  115:getstatic       #105 <Field Locale Locale.US>
			//*  58  118:ldc1            #107 <String "%s/user_properties">
			//*  59  120:iconst_1        
			//*  60  121:anewarray       Object[]
			//*  61  124:dup             
			//*  62  125:iconst_0        
			//*  63  126:aload_0         
			//*  64  127:getfield        #22  <Field String val$applicationID>
			//*  65  130:aastore         
			//*  66  131:invokestatic    #111 <Method String String.format(Locale, String, Object[])>
			//*  67  134:aload_2         
			//*  68  135:getstatic       #117 <Field HttpMethod HttpMethod.POST>
			//*  69  138:aload_0         
			//*  70  139:getfield        #24  <Field com.facebook.GraphRequest$Callback val$callback>
			//*  71  142:invokespecial   #120 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
			//*  72  145:astore_1        
			//*  73  146:aload_1         
			//*  74  147:iconst_1        
			//*  75  148:invokevirtual   #124 <Method void GraphRequest.setSkipClientToken(boolean)>
			//*  76  151:aload_1         
			//*  77  152:invokevirtual   #128 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
			//*  78  155:pop             
			//*  79  156:return          
					catch(JSONException jsonexception)
			//*  80  157:astore_1        
					{
						throw new FacebookException("Failed to construct request", ((Throwable) (jsonexception)));
			//   81  158:new             #130 <Class FacebookException>
			//   82  161:dup             
			//   83  162:ldc1            #132 <String "Failed to construct request">
			//   84  164:aload_1         
			//   85  165:invokespecial   #135 <Method void FacebookException(String, Throwable)>
			//   86  168:athrow          
					}
					obj = ((Object) (new GraphRequest(AccessToken.getCurrentAccessToken(), String.format(Locale.US, "%s/user_properties", new Object[] {
						applicationID
					}), ((Bundle) (obj1)), HttpMethod.POST, callback)));
					((GraphRequest) (obj)).setSkipClientToken(true);
					((GraphRequest) (obj)).executeAsync();
					return;
				} else
				{
					Logger.log(LoggingBehavior.APP_EVENTS, AppEventsLogger.TAG, "AppEventsLogger userID cannot be null or empty");
			//   87  169:getstatic       #141 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
			//   88  172:invokestatic    #144 <Method String AppEventsLogger.access$200()>
			//   89  175:ldc1            #146 <String "AppEventsLogger userID cannot be null or empty">
			//   90  177:invokestatic    #152 <Method void Logger.log(LoggingBehavior, String, String)>
					return;
			//   91  180:return          
				}
			}

			final String val$applicationID;
			final com.facebook.GraphRequest.Callback val$callback;
			final Bundle val$parameters;

			
			{
				parameters = bundle;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Bundle val$parameters>
				applicationID = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$applicationID>
				callback = callback1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field com.facebook.GraphRequest$Callback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:invokestatic    #617 <Method Executor getAnalyticsExecutor()>
	//    1    3:new             #12  <Class AppEventsLogger$4>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #619 <Method void AppEventsLogger$4(Bundle, String, com.facebook.GraphRequest$Callback)>
	//    7   13:invokeinterface #622 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	public void flush()
	{
		AppEventQueue.flush(FlushReason.EXPLICIT);
	//    0    0:getstatic       #625 <Field FlushReason FlushReason.EXPLICIT>
	//    1    3:invokestatic    #363 <Method void AppEventQueue.flush(FlushReason)>
	//    2    6:return          
	}

	public String getApplicationId()
	{
		return accessTokenAppId.getApplicationId();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
	//    2    4:invokevirtual   #626 <Method String AccessTokenAppIdPair.getApplicationId()>
	//    3    7:areturn         
	}

	public boolean isValidForAccessToken(AccessToken accesstoken)
	{
		accesstoken = ((AccessToken) (new AccessTokenAppIdPair(accesstoken)));
	//    0    0:new             #139 <Class AccessTokenAppIdPair>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #142 <Method void AccessTokenAppIdPair(AccessToken)>
	//    4    8:astore_1        
		return accessTokenAppId.equals(((Object) (accesstoken)));
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field AccessTokenAppIdPair accessTokenAppId>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #629 <Method boolean AccessTokenAppIdPair.equals(Object)>
	//    9   17:ireturn         
	}

	public void logEvent(String s)
	{
		logEvent(s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #632 <Method void logEvent(String, Bundle)>
	//    4    6:return          
	}

	public void logEvent(String s, double d)
	{
		logEvent(s, d, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #636 <Method void logEvent(String, double, Bundle)>
	//    5    7:return          
	}

	public void logEvent(String s, double d, Bundle bundle)
	{
		logEvent(s, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #533 <Method Double Double.valueOf(double)>
	//    4    6:aload           4
	//    5    8:iconst_0        
	//    6    9:invokestatic    #536 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    7   12:invokespecial   #538 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    8   15:return          
	}

	public void logEvent(String s, Bundle bundle)
	{
		logEvent(s, ((Double) (null)), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #536 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    6    8:invokespecial   #538 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    7   11:return          
	}

	protected void logEventImplicitly(String s, BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		logEvent(s, Double.valueOf(bigdecimal.doubleValue()), bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #527 <Method double BigDecimal.doubleValue()>
	//    4    6:invokestatic    #533 <Method Double Double.valueOf(double)>
	//    5    9:aload           4
	//    6   11:iconst_1        
	//    7   12:invokestatic    #536 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    8   15:invokespecial   #538 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    9   18:return          
	}

	public void logProductItem(String s, ProductAvailability productavailability, ProductCondition productcondition, String s1, String s2, String s3, String s4, 
			BigDecimal bigdecimal, Currency currency, String s5, String s6, String s7, Bundle bundle)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			notifyDeveloperError("itemID cannot be null");
	//    2    4:ldc2            #642 <String "itemID cannot be null">
	//    3    7:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//    4   10:return          
		}
		if(productavailability == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       22
		{
			notifyDeveloperError("availability cannot be null");
	//    7   15:ldc2            #644 <String "availability cannot be null">
	//    8   18:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//    9   21:return          
		}
		if(productcondition == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       33
		{
			notifyDeveloperError("condition cannot be null");
	//   12   26:ldc2            #646 <String "condition cannot be null">
	//   13   29:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   14   32:return          
		}
		if(s1 == null)
	//*  15   33:aload           4
	//*  16   35:ifnonnull       45
		{
			notifyDeveloperError("description cannot be null");
	//   17   38:ldc2            #648 <String "description cannot be null">
	//   18   41:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   19   44:return          
		}
		if(s2 == null)
	//*  20   45:aload           5
	//*  21   47:ifnonnull       57
		{
			notifyDeveloperError("imageLink cannot be null");
	//   22   50:ldc2            #650 <String "imageLink cannot be null">
	//   23   53:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   24   56:return          
		}
		if(s3 == null)
	//*  25   57:aload           6
	//*  26   59:ifnonnull       69
		{
			notifyDeveloperError("link cannot be null");
	//   27   62:ldc2            #652 <String "link cannot be null">
	//   28   65:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   29   68:return          
		}
		if(s4 == null)
	//*  30   69:aload           7
	//*  31   71:ifnonnull       81
		{
			notifyDeveloperError("title cannot be null");
	//   32   74:ldc2            #654 <String "title cannot be null">
	//   33   77:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   34   80:return          
		}
		if(bigdecimal == null)
	//*  35   81:aload           8
	//*  36   83:ifnonnull       93
		{
			notifyDeveloperError("priceAmount cannot be null");
	//   37   86:ldc2            #656 <String "priceAmount cannot be null">
	//   38   89:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   39   92:return          
		}
		if(currency == null)
	//*  40   93:aload           9
	//*  41   95:ifnonnull       105
		{
			notifyDeveloperError("currency cannot be null");
	//   42   98:ldc2            #507 <String "currency cannot be null">
	//   43  101:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   44  104:return          
		}
		if(s5 == null && s6 == null && s7 == null)
	//*  45  105:aload           10
	//*  46  107:ifnonnull       127
	//*  47  110:aload           11
	//*  48  112:ifnonnull       127
	//*  49  115:aload           12
	//*  50  117:ifnonnull       127
		{
			notifyDeveloperError("Either gtin, mpn or brand is required");
	//   51  120:ldc2            #658 <String "Either gtin, mpn or brand is required">
	//   52  123:invokestatic    #505 <Method void notifyDeveloperError(String)>
			return;
	//   53  126:return          
		}
		Bundle bundle1 = bundle;
	//   54  127:aload           13
	//   55  129:astore          14
		if(bundle == null)
	//*  56  131:aload           13
	//*  57  133:ifnonnull       145
			bundle1 = new Bundle();
	//   58  136:new             #509 <Class Bundle>
	//   59  139:dup             
	//   60  140:invokespecial   #510 <Method void Bundle()>
	//   61  143:astore          14
		bundle1.putString("fb_product_item_id", s);
	//   62  145:aload           14
	//   63  147:ldc2            #660 <String "fb_product_item_id">
	//   64  150:aload_1         
	//   65  151:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_availability", productavailability.name());
	//   66  154:aload           14
	//   67  156:ldc2            #662 <String "fb_product_availability">
	//   68  159:aload_2         
	//   69  160:invokevirtual   #665 <Method String AppEventsLogger$ProductAvailability.name()>
	//   70  163:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_condition", productcondition.name());
	//   71  166:aload           14
	//   72  168:ldc2            #667 <String "fb_product_condition">
	//   73  171:aload_3         
	//   74  172:invokevirtual   #668 <Method String AppEventsLogger$ProductCondition.name()>
	//   75  175:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_description", s1);
	//   76  178:aload           14
	//   77  180:ldc2            #670 <String "fb_product_description">
	//   78  183:aload           4
	//   79  185:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_image_link", s2);
	//   80  188:aload           14
	//   81  190:ldc2            #672 <String "fb_product_image_link">
	//   82  193:aload           5
	//   83  195:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_link", s3);
	//   84  198:aload           14
	//   85  200:ldc2            #674 <String "fb_product_link">
	//   86  203:aload           6
	//   87  205:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_title", s4);
	//   88  208:aload           14
	//   89  210:ldc2            #676 <String "fb_product_title">
	//   90  213:aload           7
	//   91  215:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_price_amount", bigdecimal.setScale(3, 4).toString());
	//   92  218:aload           14
	//   93  220:ldc2            #678 <String "fb_product_price_amount">
	//   94  223:aload           8
	//   95  225:iconst_3        
	//   96  226:iconst_4        
	//   97  227:invokevirtual   #682 <Method BigDecimal BigDecimal.setScale(int, int)>
	//   98  230:invokevirtual   #683 <Method String BigDecimal.toString()>
	//   99  233:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		bundle1.putString("fb_product_price_currency", currency.getCurrencyCode());
	//  100  236:aload           14
	//  101  238:ldc2            #685 <String "fb_product_price_currency">
	//  102  241:aload           9
	//  103  243:invokevirtual   #517 <Method String Currency.getCurrencyCode()>
	//  104  246:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		if(s5 != null)
	//* 105  249:aload           10
	//* 106  251:ifnull          264
			bundle1.putString("fb_product_gtin", s5);
	//  107  254:aload           14
	//  108  256:ldc2            #687 <String "fb_product_gtin">
	//  109  259:aload           10
	//  110  261:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		if(s6 != null)
	//* 111  264:aload           11
	//* 112  266:ifnull          279
			bundle1.putString("fb_product_mpn", s6);
	//  113  269:aload           14
	//  114  271:ldc2            #689 <String "fb_product_mpn">
	//  115  274:aload           11
	//  116  276:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		if(s7 != null)
	//* 117  279:aload           12
	//* 118  281:ifnull          294
			bundle1.putString("fb_product_brand", s7);
	//  119  284:aload           14
	//  120  286:ldc2            #691 <String "fb_product_brand">
	//  121  289:aload           12
	//  122  291:invokevirtual   #519 <Method void Bundle.putString(String, String)>
		logEvent("fb_mobile_catalog_update", bundle1);
	//  123  294:aload_0         
	//  124  295:ldc2            #693 <String "fb_mobile_catalog_update">
	//  125  298:aload           14
	//  126  300:invokevirtual   #632 <Method void logEvent(String, Bundle)>
		eagerFlush();
	//  127  303:invokestatic    #540 <Method void eagerFlush()>
	//  128  306:return          
	}

	public void logPurchase(BigDecimal bigdecimal, Currency currency)
	{
		if(AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled())
	//*   0    0:invokestatic    #699 <Method boolean AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()>
	//*   1    3:ifeq            16
			Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc2            #701 <String "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events">
	//    4   12:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   15:pop             
		logPurchase(bigdecimal, currency, ((Bundle) (null)), false);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:aconst_null     
	//   10   20:iconst_0        
	//   11   21:invokespecial   #703 <Method void logPurchase(BigDecimal, Currency, Bundle, boolean)>
	//   12   24:return          
	}

	public void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		if(AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled())
	//*   0    0:invokestatic    #699 <Method boolean AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()>
	//*   1    3:ifeq            16
			Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
	//    2    6:getstatic       #90  <Field String TAG>
	//    3    9:ldc2            #701 <String "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events">
	//    4   12:invokestatic    #222 <Method int Log.w(String, String)>
	//    5   15:pop             
		logPurchase(bigdecimal, currency, bundle, false);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:aload_3         
	//   10   20:iconst_0        
	//   11   21:invokespecial   #703 <Method void logPurchase(BigDecimal, Currency, Bundle, boolean)>
	//   12   24:return          
	}

	public void logPurchaseImplicitly(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		if(AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled())
	//*   0    0:invokestatic    #699 <Method boolean AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()>
	//*   1    3:ifeq            38
		{
			bigdecimal = ((BigDecimal) (new StringBuilder()));
	//    2    6:new             #297 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #298 <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (bigdecimal)).append("Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ");
	//    6   14:aload_1         
	//    7   15:ldc2            #707 <String "Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ">
	//    8   18:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			((StringBuilder) (bigdecimal)).append("Auto-logging of in-app purchase has been enabled in the SDK, so you don't have to manually log purchases");
	//   10   22:aload_1         
	//   11   23:ldc2            #709 <String "Auto-logging of in-app purchase has been enabled in the SDK, so you don't have to manually log purchases">
	//   12   26:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			bigdecimal = ((BigDecimal) (((StringBuilder) (bigdecimal)).toString()));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   16   34:astore_1        
		} else
	//*  17   35:goto            67
		{
			bigdecimal = ((BigDecimal) (new StringBuilder()));
	//   18   38:new             #297 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #298 <Method void StringBuilder()>
	//   21   45:astore_1        
			((StringBuilder) (bigdecimal)).append("Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ");
	//   22   46:aload_1         
	//   23   47:ldc2            #707 <String "Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ">
	//   24   50:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
			((StringBuilder) (bigdecimal)).append("Please use logPurchase() function instead.");
	//   26   54:aload_1         
	//   27   55:ldc2            #711 <String "Please use logPurchase() function instead.">
	//   28   58:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			bigdecimal = ((BigDecimal) (((StringBuilder) (bigdecimal)).toString()));
	//   30   62:aload_1         
	//   31   63:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   32   66:astore_1        
		}
		Log.e(TAG, ((String) (bigdecimal)));
	//   33   67:getstatic       #90  <Field String TAG>
	//   34   70:aload_1         
	//   35   71:invokestatic    #714 <Method int Log.e(String, String)>
	//   36   74:pop             
	//   37   75:return          
	}

	protected void logPurchaseImplicitlyInternal(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		logPurchase(bigdecimal, currency, bundle, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #703 <Method void logPurchase(BigDecimal, Currency, Bundle, boolean)>
	//    6    8:return          
	}

	public void logPushNotificationOpen(Bundle bundle)
	{
		logPushNotificationOpen(bundle, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #719 <Method void logPushNotificationOpen(Bundle, String)>
	//    4    6:return          
	}

	public void logPushNotificationOpen(Bundle bundle, String s)
	{
		bundle = ((Bundle) (bundle.getString("fb_push_payload")));
	//    0    0:aload_1         
	//    1    1:ldc1            #61  <String "fb_push_payload">
	//    2    3:invokevirtual   #601 <Method String Bundle.getString(String)>
	//    3    6:astore_1        
		if(Utility.isNullOrEmpty(((String) (bundle))))
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #723 <Method boolean Utility.isNullOrEmpty(String)>
	//*   6   11:ifeq            15
			return;
	//    7   14:return          
		try
		{
			bundle = ((Bundle) ((new JSONObject(((String) (bundle)))).getString("campaign")));
	//    8   15:new             #725 <Class JSONObject>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokespecial   #726 <Method void JSONObject(String)>
	//   12   23:ldc1            #58  <String "campaign">
	//   13   25:invokevirtual   #727 <Method String JSONObject.getString(String)>
	//   14   28:astore_1        
		}
	//*  15   29:goto            34
	//*  16   32:aconst_null     
	//*  17   33:astore_1        
	//*  18   34:aload_1         
	//*  19   35:ifnonnull       51
	//*  20   38:getstatic       #319 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//*  21   41:getstatic       #90  <Field String TAG>
	//*  22   44:ldc2            #729 <String "Malformed payload specified for logging a push notification open.">
	//*  23   47:invokestatic    #327 <Method void Logger.log(LoggingBehavior, String, String)>
	//*  24   50:return          
	//*  25   51:new             #509 <Class Bundle>
	//*  26   54:dup             
	//*  27   55:invokespecial   #510 <Method void Bundle()>
	//*  28   58:astore_3        
	//*  29   59:aload_3         
	//*  30   60:ldc1            #50  <String "fb_push_campaign">
	//*  31   62:aload_1         
	//*  32   63:invokevirtual   #519 <Method void Bundle.putString(String, String)>
	//*  33   66:aload_2         
	//*  34   67:ifnull          77
	//*  35   70:aload_3         
	//*  36   71:ldc1            #47  <String "fb_push_action">
	//*  37   73:aload_2         
	//*  38   74:invokevirtual   #519 <Method void Bundle.putString(String, String)>
	//*  39   77:aload_0         
	//*  40   78:ldc1            #41  <String "fb_mobile_push_opened">
	//*  41   80:aload_3         
	//*  42   81:invokevirtual   #632 <Method void logEvent(String, Bundle)>
	//*  43   84:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			bundle = null;
		}
		if(bundle == null)
		{
			Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
			return;
		}
		Bundle bundle1 = new Bundle();
		bundle1.putString("fb_push_campaign", ((String) (bundle)));
		if(s != null)
			bundle1.putString("fb_push_action", s);
		logEvent("fb_mobile_push_opened", bundle1);
		return;
	//*  44   85:astore_1        
	//*  45   86:goto            32
	}

	public void logSdkEvent(String s, Double double1, Bundle bundle)
	{
		logEvent(s, double1, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokestatic    #536 <Method UUID ActivityLifecycleTracker.getCurrentSessionGuid()>
	//    6    8:invokespecial   #538 <Method void logEvent(String, Double, Bundle, boolean, UUID)>
	//    7   11:return          
	}

	public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
	public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
	public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
	private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
	public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
	private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
	private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
	private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 0x15180;
	private static final int FLUSH_APP_SESSION_INFO_IN_SECONDS = 30;
	private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
	private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
	private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
	private static final String TAG = ((Class) (com/facebook/appevents/AppEventsLogger)).getCanonicalName();
	private static String anonymousAppDeviceGUID;
	private static ScheduledThreadPoolExecutor backgroundExecutor;
	private static FlushBehavior flushBehavior;
	private static boolean isActivateAppEventRequested;
	private static boolean isOpenedByAppLink;
	private static String pushNotificationsRegistrationId;
	private static String sourceApplication;
	private static Object staticLock = new Object();
	private final AccessTokenAppIdPair accessTokenAppId;
	private final String contextName;

	static 
	{
	//    0    0:ldc1            #2   <Class AppEventsLogger>
	//    1    2:invokevirtual   #88  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #90  <Field String TAG>
		flushBehavior = FlushBehavior.AUTO;
	//    3    8:getstatic       #93  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.AUTO>
	//    4   11:putstatic       #95  <Field AppEventsLogger$FlushBehavior flushBehavior>
	//    5   14:new             #4   <Class Object>
	//    6   17:dup             
	//    7   18:invokespecial   #98  <Method void Object()>
	//    8   21:putstatic       #100 <Field Object staticLock>
	//*   9   24:return          
	}


/*
	static void access$000(AppEventsLogger appeventslogger, long l, String s)
	{
		appeventslogger.logAppSessionResumeEvent(l, s);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #165 <Method void logAppSessionResumeEvent(long, String)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$100(AppEventsLogger appeventslogger, long l)
	{
		appeventslogger.logAppSessionSuspendEvent(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #171 <Method void logAppSessionSuspendEvent(long)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$200()
	{
		return TAG;
	//    0    0:getstatic       #90  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static ScheduledThreadPoolExecutor access$300()
	{
		return backgroundExecutor;
	//    0    0:getstatic       #176 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//    1    3:areturn         
	}

*/
}
