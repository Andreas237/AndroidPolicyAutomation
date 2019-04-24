// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary.internal;

import android.app.*;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.*;
import android.os.Process;
import com.squareup.leakcanary.CanaryLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.squareup.leakcanary.internal:
//			LeakCanarySingleThreadFactory

public final class LeakCanaryInternals
{

	private LeakCanaryInternals()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		throw new AssertionError();
	//    2    4:new             #39  <Class AssertionError>
	//    3    7:dup             
	//    4    8:invokespecial   #40  <Method void AssertionError()>
	//    5   11:athrow          
	}

	public static String classSimpleName(String s)
	{
		int i = s.lastIndexOf('.');
	//    0    0:aload_0         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #48  <Method int String.lastIndexOf(int)>
	//    3    6:istore_1        
		if(i == -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          14
			return s;
	//    7   12:aload_0         
	//    8   13:areturn         
		else
			return s.substring(i + 1);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:invokevirtual   #52  <Method String String.substring(int)>
	//   14   21:areturn         
	}

	public static void executeOnFileIoThread(Runnable runnable)
	{
		fileIoExecutor.execute(runnable);
	//    0    0:getstatic       #33  <Field Executor fileIoExecutor>
	//    1    3:aload_0         
	//    2    4:invokeinterface #59  <Method void Executor.execute(Runnable)>
	//    3    9:return          
	}

	public static boolean isInServiceProcess(Context context, Class class1)
	{
		Object obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_3        
		Object obj1;
		try
		{
			obj1 = ((Object) (((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 4)));
	//    3    5:aload_3         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #75  <Method String Context.getPackageName()>
	//    6   10:iconst_4        
	//    7   11:invokevirtual   #81  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:astore          4
		}
	//*   9   16:goto            39
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  10   19:astore_1        
		{
			CanaryLog.d(((Throwable) (class1)), "Could not get package info for %s", new Object[] {
				context.getPackageName()
			});
	//   11   20:aload_1         
	//   12   21:ldc1            #83  <String "Could not get package info for %s">
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_0         
	//   18   30:invokevirtual   #75  <Method String Context.getPackageName()>
	//   19   33:aastore         
	//   20   34:invokestatic    #89  <Method void CanaryLog.d(Throwable, String, Object[])>
			return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		}
		obj1 = ((Object) (((PackageInfo) (obj1)).applicationInfo.processName));
	//   23   39:aload           4
	//   24   41:getfield        #95  <Field ApplicationInfo PackageInfo.applicationInfo>
	//   25   44:getfield        #100 <Field String ApplicationInfo.processName>
	//   26   47:astore          4
		ComponentName componentname = new ComponentName(context, class1);
	//   27   49:new             #102 <Class ComponentName>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokespecial   #105 <Method void ComponentName(Context, Class)>
	//   32   58:astore          5
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getServiceInfo(componentname, 0)));
	//   33   60:aload_3         
	//   34   61:aload           5
	//   35   63:iconst_0        
	//   36   64:invokevirtual   #109 <Method ServiceInfo PackageManager.getServiceInfo(ComponentName, int)>
	//   37   67:astore_3        
		}
	//*  38   68:goto            74
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   71:astore_0        
		{
			return false;
	//   40   72:iconst_0        
	//   41   73:ireturn         
		}
		if(((ServiceInfo) (obj)).processName.equals(obj1))
	//*  42   74:aload_3         
	//*  43   75:getfield        #112 <Field String ServiceInfo.processName>
	//*  44   78:aload           4
	//*  45   80:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  46   83:ifeq            106
		{
			CanaryLog.d("Did not expect service %s to run in main process %s", new Object[] {
				class1, obj1
			});
	//   47   86:ldc1            #118 <String "Did not expect service %s to run in main process %s">
	//   48   88:iconst_2        
	//   49   89:anewarray       Object[]
	//   50   92:dup             
	//   51   93:iconst_0        
	//   52   94:aload_1         
	//   53   95:aastore         
	//   54   96:dup             
	//   55   97:iconst_1        
	//   56   98:aload           4
	//   57  100:aastore         
	//   58  101:invokestatic    #121 <Method void CanaryLog.d(String, Object[])>
			return false;
	//   59  104:iconst_0        
	//   60  105:ireturn         
		}
		int i = Process.myPid();
	//   61  106:invokestatic    #127 <Method int Process.myPid()>
	//   62  109:istore_2        
		context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//   63  110:aload_0         
	//   64  111:ldc1            #129 <String "activity">
	//   65  113:invokevirtual   #133 <Method Object Context.getSystemService(String)>
	//   66  116:checkcast       #135 <Class ActivityManager>
	//   67  119:astore_0        
		class1 = null;
	//   68  120:aconst_null     
	//   69  121:astore_1        
		obj1 = ((Object) (((ActivityManager) (context)).getRunningAppProcesses()));
	//   70  122:aload_0         
	//   71  123:invokevirtual   #139 <Method List ActivityManager.getRunningAppProcesses()>
	//   72  126:astore          4
		context = ((Context) (class1));
	//   73  128:aload_1         
	//   74  129:astore_0        
		if(obj1 != null)
	//*  75  130:aload           4
	//*  76  132:ifnull          181
		{
			obj1 = ((Object) (((List) (obj1)).iterator()));
	//   77  135:aload           4
	//   78  137:invokeinterface #145 <Method Iterator List.iterator()>
	//   79  142:astore          4
			do
			{
				context = ((Context) (class1));
	//   80  144:aload_1         
	//   81  145:astore_0        
				if(!((Iterator) (obj1)).hasNext())
					break;
	//   82  146:aload           4
	//   83  148:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//   84  153:ifeq            181
				context = ((Context) ((android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next()));
	//   85  156:aload           4
	//   86  158:invokeinterface #155 <Method Object Iterator.next()>
	//   87  163:checkcast       #157 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   88  166:astore_0        
			} while(((android.app.ActivityManager.RunningAppProcessInfo) (context)).pid != i);
	//   89  167:aload_0         
	//   90  168:getfield        #161 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//   91  171:iload_2         
	//   92  172:icmpne          178
		}
	//*  93  175:goto            181
	//*  94  178:goto            144
		if(context == null)
	//*  95  181:aload_0         
	//*  96  182:ifnonnull       203
		{
			CanaryLog.d("Could not find running process for %d", new Object[] {
				Integer.valueOf(i)
			});
	//   97  185:ldc1            #163 <String "Could not find running process for %d">
	//   98  187:iconst_1        
	//   99  188:anewarray       Object[]
	//  100  191:dup             
	//  101  192:iconst_0        
	//  102  193:iload_2         
	//  103  194:invokestatic    #169 <Method Integer Integer.valueOf(int)>
	//  104  197:aastore         
	//  105  198:invokestatic    #121 <Method void CanaryLog.d(String, Object[])>
			return false;
	//  106  201:iconst_0        
	//  107  202:ireturn         
		} else
		{
			return ((android.app.ActivityManager.RunningAppProcessInfo) (context)).processName.equals(((Object) (((ServiceInfo) (obj)).processName)));
	//  108  203:aload_0         
	//  109  204:getfield        #170 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//  110  207:aload_3         
	//  111  208:getfield        #112 <Field String ServiceInfo.processName>
	//  112  211:invokevirtual   #116 <Method boolean String.equals(Object)>
	//  113  214:ireturn         
		}
	}

	public static Executor newSingleThreadExecutor(String s)
	{
		return ((Executor) (Executors.newSingleThreadExecutor(((java.util.concurrent.ThreadFactory) (new LeakCanarySingleThreadFactory(s))))));
	//    0    0:new             #174 <Class LeakCanarySingleThreadFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #177 <Method void LeakCanarySingleThreadFactory(String)>
	//    4    8:invokestatic    #182 <Method java.util.concurrent.ExecutorService Executors.newSingleThreadExecutor(java.util.concurrent.ThreadFactory)>
	//    5   11:areturn         
	}

	public static void setEnabled(Context context, Class class1, boolean flag)
	{
		executeOnFileIoThread(((Runnable) (new _cls1(context.getApplicationContext(), class1, flag))));
	//    0    0:new             #186 <Class LeakCanaryInternals$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #190 <Method Context Context.getApplicationContext()>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #192 <Method void LeakCanaryInternals$1(Context, Class, boolean)>
	//    7   13:invokestatic    #194 <Method void executeOnFileIoThread(Runnable)>
	//    8   16:return          
	}

	public static void setEnabledBlocking(Context context, Class class1, boolean flag)
	{
		class1 = ((Class) (new ComponentName(context, class1)));
	//    0    0:new             #102 <Class ComponentName>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #105 <Method void ComponentName(Context, Class)>
	//    5    9:astore_1        
		context = ((Context) (context.getPackageManager()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #71  <Method PackageManager Context.getPackageManager()>
	//    8   14:astore_0        
		byte byte0;
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            24
			byte0 = 1;
	//   11   19:iconst_1        
	//   12   20:istore_3        
		else
	//*  13   21:goto            26
			byte0 = 2;
	//   14   24:iconst_2        
	//   15   25:istore_3        
		((PackageManager) (context)).setComponentEnabledSetting(((ComponentName) (class1)), ((int) (byte0)), 1);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:iload_3         
	//   19   29:iconst_1        
	//   20   30:invokevirtual   #200 <Method void PackageManager.setComponentEnabledSetting(ComponentName, int, int)>
	//   21   33:return          
	}

	public static void showNotification(Context context, CharSequence charsequence, CharSequence charsequence1, PendingIntent pendingintent, int i)
	{
		NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
	//    0    0:aload_0         
	//    1    1:ldc1            #204 <String "notification">
	//    2    3:invokevirtual   #133 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #206 <Class NotificationManager>
	//    4    9:astore          5
		context = ((Context) ((new android.app.Notification.Builder(context)).setSmallIcon(com.squareup.leakcanary.R.drawable.leak_canary_notification).setWhen(System.currentTimeMillis()).setContentTitle(charsequence).setContentText(charsequence1).setAutoCancel(true).setContentIntent(pendingintent)));
	//    5   11:new             #208 <Class android.app.Notification$Builder>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #211 <Method void android.app.Notification$Builder(Context)>
	//    9   19:getstatic       #216 <Field int com.squareup.leakcanary.R$drawable.leak_canary_notification>
	//   10   22:invokevirtual   #220 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   11   25:invokestatic    #226 <Method long System.currentTimeMillis()>
	//   12   28:invokevirtual   #230 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   13   31:aload_1         
	//   14   32:invokevirtual   #234 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   15   35:aload_2         
	//   16   36:invokevirtual   #237 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   17   39:iconst_1        
	//   18   40:invokevirtual   #241 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   19   43:aload_3         
	//   20   44:invokevirtual   #245 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   21   47:astore_0        
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*  22   48:getstatic       #250 <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   51:bipush          16
	//*  24   53:icmpge          64
			context = ((Context) (((android.app.Notification.Builder) (context)).getNotification()));
	//   25   56:aload_0         
	//   26   57:invokevirtual   #254 <Method android.app.Notification android.app.Notification$Builder.getNotification()>
	//   27   60:astore_0        
		else
	//*  28   61:goto            69
			context = ((Context) (((android.app.Notification.Builder) (context)).build()));
	//   29   64:aload_0         
	//   30   65:invokevirtual   #257 <Method android.app.Notification android.app.Notification$Builder.build()>
	//   31   68:astore_0        
		notificationmanager.notify(i, ((android.app.Notification) (context)));
	//   32   69:aload           5
	//   33   71:iload           4
	//   34   73:aload_0         
	//   35   74:invokevirtual   #261 <Method void NotificationManager.notify(int, android.app.Notification)>
	//   36   77:return          
	}

	public static final String LENOVO = "LENOVO";
	public static final String LG = "LGE";
	public static final String MEIZU = "Meizu";
	public static final String MOTOROLA = "motorola";
	public static final String NVIDIA = "NVIDIA";
	public static final String SAMSUNG = "samsung";
	private static final Executor fileIoExecutor = newSingleThreadExecutor("File-IO");

	static 
	{
	//    0    0:ldc1            #27  <String "File-IO">
	//    1    2:invokestatic    #31  <Method Executor newSingleThreadExecutor(String)>
	//    2    5:putstatic       #33  <Field Executor fileIoExecutor>
	//*   3    8:return          
	}

	/* member class not found */
	class _cls1 {}

}
