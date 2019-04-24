// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.gcm:
//			GoogleCloudMessaging, Task

public class GcmNetworkManager
{

	private GcmNetworkManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Context mContext>
		mPendingIntent = PendingIntent.getBroadcast(mContext, 0, (new Intent()).setPackage("com.google.example.invalidpackage"), 0);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field Context mContext>
	//    8   14:iconst_0        
	//    9   15:new             #26  <Class Intent>
	//   10   18:dup             
	//   11   19:invokespecial   #27  <Method void Intent()>
	//   12   22:ldc1            #29  <String "com.google.example.invalidpackage">
	//   13   24:invokevirtual   #33  <Method Intent Intent.setPackage(String)>
	//   14   27:iconst_0        
	//   15   28:invokestatic    #39  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   16   31:putfield        #41  <Field PendingIntent mPendingIntent>
	//   17   34:return          
	}

	public static GcmNetworkManager getInstance(Context context)
	{
		com/google/android/gms/gcm/GcmNetworkManager;
	//    0    0:ldc1            #2   <Class GcmNetworkManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzbfL == null)
	//*   2    3:getstatic       #46  <Field GcmNetworkManager zzbfL>
	//*   3    6:ifnonnull       23
			zzbfL = new GcmNetworkManager(context.getApplicationContext());
	//    4    9:new             #2   <Class GcmNetworkManager>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokevirtual   #52  <Method Context Context.getApplicationContext()>
	//    8   17:invokespecial   #54  <Method void GcmNetworkManager(Context)>
	//    9   20:putstatic       #46  <Field GcmNetworkManager zzbfL>
		context = ((Context) (zzbfL));
	//   10   23:getstatic       #46  <Field GcmNetworkManager zzbfL>
	//   11   26:astore_0        
		com/google/android/gms/gcm/GcmNetworkManager;
	//   12   27:ldc1            #2   <Class GcmNetworkManager>
		JVM INSTR monitorexit ;
	//   13   29:monitorexit     
		return ((GcmNetworkManager) (context));
	//   14   30:aload_0         
	//   15   31:areturn         
		context;
	//   16   32:astore_0        
		com/google/android/gms/gcm/GcmNetworkManager;
	//   17   33:ldc1            #2   <Class GcmNetworkManager>
		JVM INSTR monitorexit ;
	//   18   35:monitorexit     
		throw context;
	//   19   36:aload_0         
	//   20   37:athrow          
	}

	private Intent zzGb()
	{
		String s = GoogleCloudMessaging.zzbd(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Context mContext>
	//    2    4:invokestatic    #62  <Method String GoogleCloudMessaging.zzbd(Context)>
	//    3    7:astore_2        
		int i = -1;
	//    4    8:iconst_m1       
	//    5    9:istore_1        
		if(s != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
			i = GoogleCloudMessaging.zzbe(mContext);
	//    8   14:aload_0         
	//    9   15:getfield        #24  <Field Context mContext>
	//   10   18:invokestatic    #66  <Method int GoogleCloudMessaging.zzbe(Context)>
	//   11   21:istore_1        
		if(s == null || i < GoogleCloudMessaging.zzbfW)
	//*  12   22:aload_2         
	//*  13   23:ifnull          33
	//*  14   26:iload_1         
	//*  15   27:getstatic       #69  <Field int GoogleCloudMessaging.zzbfW>
	//*  16   30:icmpge          62
		{
			Log.e("GcmNetworkManager", (new StringBuilder(91)).append("Google Play Services is not available, dropping GcmNetworkManager request. code=").append(i).toString());
	//   17   33:ldc1            #71  <String "GcmNetworkManager">
	//   18   35:new             #73  <Class StringBuilder>
	//   19   38:dup             
	//   20   39:bipush          91
	//   21   41:invokespecial   #76  <Method void StringBuilder(int)>
	//   22   44:ldc1            #78  <String "Google Play Services is not available, dropping GcmNetworkManager request. code=">
	//   23   46:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:iload_1         
	//   25   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   26   53:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   27   56:invokestatic    #95  <Method int Log.e(String, String)>
	//   28   59:pop             
			return null;
	//   29   60:aconst_null     
	//   30   61:areturn         
		} else
		{
			Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
	//   31   62:new             #26  <Class Intent>
	//   32   65:dup             
	//   33   66:ldc1            #97  <String "com.google.android.gms.gcm.ACTION_SCHEDULE">
	//   34   68:invokespecial   #100 <Method void Intent(String)>
	//   35   71:astore_3        
			intent.setPackage(s);
	//   36   72:aload_3         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #33  <Method Intent Intent.setPackage(String)>
	//   39   77:pop             
			intent.putExtra("app", ((android.os.Parcelable) (mPendingIntent)));
	//   40   78:aload_3         
	//   41   79:ldc1            #102 <String "app">
	//   42   81:aload_0         
	//   43   82:getfield        #41  <Field PendingIntent mPendingIntent>
	//   44   85:invokevirtual   #106 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   45   88:pop             
			return intent;
	//   46   89:aload_3         
	//   47   90:areturn         
		}
	}

	private void zza(ComponentName componentname)
	{
		zzeD(componentname.getClassName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method String ComponentName.getClassName()>
	//    3    5:invokespecial   #116 <Method void zzeD(String)>
		Intent intent = zzGb();
	//    4    8:aload_0         
	//    5    9:invokespecial   #118 <Method Intent zzGb()>
	//    6   12:astore_2        
		if(intent == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       18
		{
			return;
	//    9   17:return          
		} else
		{
			intent.putExtra("scheduler_action", "CANCEL_ALL");
	//   10   18:aload_2         
	//   11   19:ldc1            #120 <String "scheduler_action">
	//   12   21:ldc1            #122 <String "CANCEL_ALL">
	//   13   23:invokevirtual   #125 <Method Intent Intent.putExtra(String, String)>
	//   14   26:pop             
			intent.putExtra("component", ((android.os.Parcelable) (componentname)));
	//   15   27:aload_2         
	//   16   28:ldc1            #127 <String "component">
	//   17   30:aload_1         
	//   18   31:invokevirtual   #106 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   19   34:pop             
			mContext.sendBroadcast(intent);
	//   20   35:aload_0         
	//   21   36:getfield        #24  <Field Context mContext>
	//   22   39:aload_2         
	//   23   40:invokevirtual   #131 <Method void Context.sendBroadcast(Intent)>
			return;
	//   24   43:return          
		}
	}

	private void zza(String s, ComponentName componentname)
	{
		zzeC(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #135 <Method void zzeC(String)>
		zzeD(componentname.getClassName());
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #113 <Method String ComponentName.getClassName()>
	//    5    9:invokespecial   #116 <Method void zzeD(String)>
		Intent intent = zzGb();
	//    6   12:aload_0         
	//    7   13:invokespecial   #118 <Method Intent zzGb()>
	//    8   16:astore_3        
		if(intent == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       22
		{
			return;
	//   11   21:return          
		} else
		{
			intent.putExtra("scheduler_action", "CANCEL_TASK");
	//   12   22:aload_3         
	//   13   23:ldc1            #120 <String "scheduler_action">
	//   14   25:ldc1            #137 <String "CANCEL_TASK">
	//   15   27:invokevirtual   #125 <Method Intent Intent.putExtra(String, String)>
	//   16   30:pop             
			intent.putExtra("tag", s);
	//   17   31:aload_3         
	//   18   32:ldc1            #139 <String "tag">
	//   19   34:aload_1         
	//   20   35:invokevirtual   #125 <Method Intent Intent.putExtra(String, String)>
	//   21   38:pop             
			intent.putExtra("component", ((android.os.Parcelable) (componentname)));
	//   22   39:aload_3         
	//   23   40:ldc1            #127 <String "component">
	//   24   42:aload_2         
	//   25   43:invokevirtual   #106 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   26   46:pop             
			mContext.sendBroadcast(intent);
	//   27   47:aload_0         
	//   28   48:getfield        #24  <Field Context mContext>
	//   29   51:aload_3         
	//   30   52:invokevirtual   #131 <Method void Context.sendBroadcast(Intent)>
			return;
	//   31   55:return          
		}
	}

	static void zzeC(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("Must provide a valid tag.");
	//    3    7:new             #147 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #149 <String "Must provide a valid tag.">
	//    6   13:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(100 < s.length())
	//*   8   17:bipush          100
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #156 <Method int String.length()>
	//*  11   23:icmpge          36
			throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
	//   12   26:new             #147 <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #158 <String "Tag is larger than max permissible tag length (100)">
	//   15   32:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//   16   35:athrow          
		else
			return;
	//   17   36:return          
	}

	private void zzeD(String s)
	{
		boolean flag;
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		zzac.zzb(((Object) (s)), "GcmTaskService must not be null.");
	//    2    2:aload_1         
	//    3    3:ldc1            #160 <String "GcmTaskService must not be null.">
	//    4    5:invokestatic    #166 <Method Object zzac.zzb(Object, Object)>
	//    5    8:pop             
		Object obj = ((Object) (new Intent("com.google.android.gms.gcm.ACTION_TASK_READY")));
	//    6    9:new             #26  <Class Intent>
	//    7   12:dup             
	//    8   13:ldc1            #168 <String "com.google.android.gms.gcm.ACTION_TASK_READY">
	//    9   15:invokespecial   #100 <Method void Intent(String)>
	//   10   18:astore          4
		((Intent) (obj)).setPackage(mContext.getPackageName());
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field Context mContext>
	//   14   26:invokevirtual   #171 <Method String Context.getPackageName()>
	//   15   29:invokevirtual   #33  <Method Intent Intent.setPackage(String)>
	//   16   32:pop             
		obj = ((Object) (mContext.getPackageManager().queryIntentServices(((Intent) (obj)), 0)));
	//   17   33:aload_0         
	//   18   34:getfield        #24  <Field Context mContext>
	//   19   37:invokevirtual   #175 <Method PackageManager Context.getPackageManager()>
	//   20   40:aload           4
	//   21   42:iconst_0        
	//   22   43:invokevirtual   #181 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   23   46:astore          4
		if(obj != null && ((List) (obj)).size() != 0)
	//*  24   48:aload           4
	//*  25   50:ifnull          154
	//*  26   53:aload           4
	//*  27   55:invokeinterface #186 <Method int List.size()>
	//*  28   60:ifeq            154
			flag = true;
	//   29   63:iconst_1        
	//   30   64:istore_2        
		else
	//*  31   65:iload_2         
	//*  32   66:ldc1            #188 <String "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?">
	//*  33   68:invokestatic    #191 <Method void zzac.zzb(boolean, Object)>
	//*  34   71:aload           4
	//*  35   73:invokeinterface #195 <Method Iterator List.iterator()>
	//*  36   78:astore          4
	//*  37   80:aload           4
	//*  38   82:invokeinterface #201 <Method boolean Iterator.hasNext()>
	//*  39   87:ifeq            159
	//*  40   90:aload           4
	//*  41   92:invokeinterface #205 <Method Object Iterator.next()>
	//*  42   97:checkcast       #207 <Class ResolveInfo>
	//*  43  100:getfield        #211 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  44  103:getfield        #217 <Field String ServiceInfo.name>
	//*  45  106:aload_1         
	//*  46  107:invokevirtual   #221 <Method boolean String.equals(Object)>
	//*  47  110:ifeq            80
	//*  48  113:iload_3         
	//*  49  114:istore_2        
	//*  50  115:iload_2         
	//*  51  116:new             #73  <Class StringBuilder>
	//*  52  119:dup             
	//*  53  120:aload_1         
	//*  54  121:invokestatic    #225 <Method String String.valueOf(Object)>
	//*  55  124:invokevirtual   #156 <Method int String.length()>
	//*  56  127:bipush          119
	//*  57  129:iadd            
	//*  58  130:invokespecial   #76  <Method void StringBuilder(int)>
	//*  59  133:ldc1            #227 <String "The GcmTaskService class you provided ">
	//*  60  135:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  61  138:aload_1         
	//*  62  139:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  63  142:ldc1            #229 <String " does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.">
	//*  64  144:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  65  147:invokevirtual   #89  <Method String StringBuilder.toString()>
	//*  66  150:invokestatic    #191 <Method void zzac.zzb(boolean, Object)>
	//*  67  153:return          
			flag = false;
	//   68  154:iconst_0        
	//   69  155:istore_2        
		zzac.zzb(flag, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
		obj = ((Object) (((List) (obj)).iterator()));
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
		if(!((ResolveInfo)((Iterator) (obj)).next()).serviceInfo.name.equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_80;
		flag = flag1;
_L4:
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 119)).append("The GcmTaskService class you provided ").append(s).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString())));
		return;
	//*  70  156:goto            65
_L2:
		flag = false;
	//   71  159:iconst_0        
	//   72  160:istore_2        
		if(true) goto _L4; else goto _L3
	//   73  161:goto            115
_L3:
	}

	public void cancelAllTasks(Class class1)
	{
		zzd(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #234 <Method void zzd(Class)>
	//    3    5:return          
	}

	public void cancelTask(String s, Class class1)
	{
		zzb(s, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #240 <Method void zzb(String, Class)>
	//    4    6:return          
	}

	public void schedule(Task task)
	{
		zzeD(task.getServiceName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #248 <Method String Task.getServiceName()>
	//    3    5:invokespecial   #116 <Method void zzeD(String)>
		Intent intent = zzGb();
	//    4    8:aload_0         
	//    5    9:invokespecial   #118 <Method Intent zzGb()>
	//    6   12:astore_2        
		if(intent == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       18
		{
			return;
	//    9   17:return          
		} else
		{
			Bundle bundle = intent.getExtras();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #252 <Method Bundle Intent.getExtras()>
	//   12   22:astore_3        
			bundle.putString("scheduler_action", "SCHEDULE_TASK");
	//   13   23:aload_3         
	//   14   24:ldc1            #120 <String "scheduler_action">
	//   15   26:ldc1            #254 <String "SCHEDULE_TASK">
	//   16   28:invokevirtual   #260 <Method void Bundle.putString(String, String)>
			task.toBundle(bundle);
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #264 <Method void Task.toBundle(Bundle)>
			intent.putExtras(bundle);
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #268 <Method Intent Intent.putExtras(Bundle)>
	//   23   41:pop             
			mContext.sendBroadcast(intent);
	//   24   42:aload_0         
	//   25   43:getfield        #24  <Field Context mContext>
	//   26   46:aload_2         
	//   27   47:invokevirtual   #131 <Method void Context.sendBroadcast(Intent)>
			return;
	//   28   50:return          
		}
	}

	public void zzb(String s, Class class1)
	{
		zza(s, new ComponentName(mContext, class1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #110 <Class ComponentName>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field Context mContext>
	//    6   10:aload_2         
	//    7   11:invokespecial   #271 <Method void ComponentName(Context, Class)>
	//    8   14:invokespecial   #273 <Method void zza(String, ComponentName)>
	//    9   17:return          
	}

	public void zzd(Class class1)
	{
		zza(new ComponentName(mContext, class1));
	//    0    0:aload_0         
	//    1    1:new             #110 <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #271 <Method void ComponentName(Context, Class)>
	//    7   13:invokespecial   #276 <Method void zza(ComponentName)>
	//    8   16:return          
	}

	public static final int RESULT_FAILURE = 2;
	public static final int RESULT_RESCHEDULE = 1;
	public static final int RESULT_SUCCESS = 0;
	private static GcmNetworkManager zzbfL;
	private Context mContext;
	private final PendingIntent mPendingIntent;
}
