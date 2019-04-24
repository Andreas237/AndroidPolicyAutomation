// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.stats;

import android.content.*;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;

public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver
{

	public GCoreWakefulBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void WakefulBroadcastReceiver()>
	//    2    4:return          
	}

	public static boolean completeWakefulIntent(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(context != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          21
		{
			WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
	//    6   10:invokestatic    #25  <Method WakeLockTracker WakeLockTracker.getInstance()>
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #29  <Method void WakeLockTracker.registerReleaseEvent(Context, Intent)>
		} else
	//*  10   18:goto            67
		{
			String s = TAG;
	//   11   21:getstatic       #31  <Field String TAG>
	//   12   24:astore_2        
			context = ((Context) (String.valueOf(((Object) (intent.toUri(0))))));
	//   13   25:aload_1         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #37  <Method String Intent.toUri(int)>
	//   16   30:invokestatic    #43  <Method String String.valueOf(Object)>
	//   17   33:astore_0        
			if(((String) (context)).length() != 0)
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #47  <Method int String.length()>
	//*  20   38:ifeq            51
				context = ((Context) ("context shouldn't be null. intent: ".concat(((String) (context)))));
	//   21   41:ldc1            #49  <String "context shouldn't be null. intent: ">
	//   22   43:aload_0         
	//   23   44:invokevirtual   #53  <Method String String.concat(String)>
	//   24   47:astore_0        
			else
	//*  25   48:goto            61
				context = ((Context) (new String("context shouldn't be null. intent: ")));
	//   26   51:new             #39  <Class String>
	//   27   54:dup             
	//   28   55:ldc1            #49  <String "context shouldn't be null. intent: ">
	//   29   57:invokespecial   #56  <Method void String(String)>
	//   30   60:astore_0        
			Log.w(s, ((String) (context)));
	//   31   61:aload_2         
	//   32   62:aload_0         
	//   33   63:invokestatic    #62  <Method int Log.w(String, String)>
	//   34   66:pop             
		}
		return WakefulBroadcastReceiver.completeWakefulIntent(intent);
	//   35   67:aload_1         
	//   36   68:invokestatic    #65  <Method boolean WakefulBroadcastReceiver.completeWakefulIntent(Intent)>
	//   37   71:ireturn         
	}

	public static ComponentName startWakefulService(Context context, Intent intent)
	{
		ComponentName componentname = zza(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method ComponentName zza(Context, Intent)>
	//    3    5:astore_3        
		if(componentname == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		WakeLockTracker wakelocktracker = WakeLockTracker.getInstance();
	//    8   12:invokestatic    #25  <Method WakeLockTracker WakeLockTracker.getInstance()>
	//    9   15:astore          4
		String s = String.valueOf(((Object) (componentname.flattenToShortString())));
	//   10   17:aload_3         
	//   11   18:invokevirtual   #77  <Method String ComponentName.flattenToShortString()>
	//   12   21:invokestatic    #43  <Method String String.valueOf(Object)>
	//   13   24:astore_2        
		if(s.length() != 0)
	//*  14   25:aload_2         
	//*  15   26:invokevirtual   #47  <Method int String.length()>
	//*  16   29:ifeq            42
			s = "wake:".concat(s);
	//   17   32:ldc1            #79  <String "wake:">
	//   18   34:aload_2         
	//   19   35:invokevirtual   #53  <Method String String.concat(String)>
	//   20   38:astore_2        
		else
	//*  21   39:goto            52
			s = new String("wake:");
	//   22   42:new             #39  <Class String>
	//   23   45:dup             
	//   24   46:ldc1            #79  <String "wake:">
	//   25   48:invokespecial   #56  <Method void String(String)>
	//   26   51:astore_2        
		wakelocktracker.registerAcquireEvent(context, intent, s, TAG, ((String) (null)), 1, "com.google.android.gms");
	//   27   52:aload           4
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:getstatic       #31  <Field String TAG>
	//   32   60:aconst_null     
	//   33   61:iconst_1        
	//   34   62:ldc1            #81  <String "com.google.android.gms">
	//   35   64:invokevirtual   #85  <Method void WakeLockTracker.registerAcquireEvent(Context, Intent, String, String, String, int, String)>
		return componentname;
	//   36   67:aload_3         
	//   37   68:areturn         
	}

	public static ComponentName startWakefulService(Context context, Intent intent, String s)
	{
		return startWakefulService(context, intent, s, context.getPackageName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #92  <Method String Context.getPackageName()>
	//    5    7:invokestatic    #95  <Method ComponentName startWakefulService(Context, Intent, String, String)>
	//    6   10:areturn         
	}

	public static ComponentName startWakefulService(Context context, Intent intent, String s, String s1)
	{
		ComponentName componentname = zza(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method ComponentName zza(Context, Intent)>
	//    3    5:astore          4
		if(componentname == null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       14
		{
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			WakeLockTracker.getInstance().registerAcquireEvent(context, intent, s, TAG, ((String) (null)), 1, s1);
	//    8   14:invokestatic    #25  <Method WakeLockTracker WakeLockTracker.getInstance()>
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #31  <Field String TAG>
	//   13   23:aconst_null     
	//   14   24:iconst_1        
	//   15   25:aload_3         
	//   16   26:invokevirtual   #85  <Method void WakeLockTracker.registerAcquireEvent(Context, Intent, String, String, String, int, String)>
			return componentname;
	//   17   29:aload           4
	//   18   31:areturn         
		}
	}

	private static ComponentName zza(Context context, Intent intent)
	{
		intent.putExtra("WAKE_LOCK_KEY", StatsUtils.getEventKey(context, intent));
	//    0    0:aload_1         
	//    1    1:ldc1            #98  <String "WAKE_LOCK_KEY">
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokestatic    #104 <Method String StatsUtils.getEventKey(Context, Intent)>
	//    5    8:invokevirtual   #108 <Method Intent Intent.putExtra(String, String)>
	//    6   11:pop             
		return WakefulBroadcastReceiver.startWakefulService(context, intent);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokestatic    #110 <Method ComponentName WakefulBroadcastReceiver.startWakefulService(Context, Intent)>
	//   10   17:areturn         
	}

	private static String TAG = "GCoreWakefulBroadcastReceiver";

	static 
	{
	//    0    0:return          
	}
}
