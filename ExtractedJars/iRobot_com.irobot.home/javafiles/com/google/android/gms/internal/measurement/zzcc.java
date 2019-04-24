// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzat, zzbx, zzcf, 
//			zzcg, zzdi, zzaw

public final class zzcc extends zzau
{

	protected zzcc(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzau(zzaw)>
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #21  <Method Context zzat.getContext()>
	//    6   10:ldc1            #23  <String "alarm">
	//    7   12:invokevirtual   #29  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #31  <Class AlarmManager>
	//    9   18:putfield        #33  <Field AlarmManager zzyt>
	//   10   21:return          
	}

	private final int getJobId()
	{
		if(zzyu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Integer zzyu>
	//*   2    4:ifnonnull       56
		{
			String s = String.valueOf(((Object) (((zzat)this).getContext().getPackageName())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #21  <Method Context zzat.getContext()>
	//    5   11:invokevirtual   #42  <Method String Context.getPackageName()>
	//    6   14:invokestatic    #48  <Method String String.valueOf(Object)>
	//    7   17:astore_1        
			if(s.length() != 0)
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #51  <Method int String.length()>
	//*  10   22:ifeq            35
				s = "analytics".concat(s);
	//   11   25:ldc1            #53  <String "analytics">
	//   12   27:aload_1         
	//   13   28:invokevirtual   #57  <Method String String.concat(String)>
	//   14   31:astore_1        
			else
	//*  15   32:goto            45
				s = new String("analytics");
	//   16   35:new             #44  <Class String>
	//   17   38:dup             
	//   18   39:ldc1            #53  <String "analytics">
	//   19   41:invokespecial   #60  <Method void String(String)>
	//   20   44:astore_1        
			zzyu = Integer.valueOf(s.hashCode());
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #63  <Method int String.hashCode()>
	//   24   50:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   25   53:putfield        #38  <Field Integer zzyu>
		}
		return zzyu.intValue();
	//   26   56:aload_0         
	//   27   57:getfield        #38  <Field Integer zzyu>
	//   28   60:invokevirtual   #71  <Method int Integer.intValue()>
	//   29   63:ireturn         
	}

	private final PendingIntent zzeo()
	{
		Context context = ((zzat)this).getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method Context zzat.getContext()>
	//    2    4:astore_1        
		return PendingIntent.getBroadcast(context, 0, (new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH")).setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0);
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:new             #75  <Class Intent>
	//    6   10:dup             
	//    7   11:ldc1            #77  <String "com.google.android.gms.analytics.ANALYTICS_DISPATCH">
	//    8   13:invokespecial   #78  <Method void Intent(String)>
	//    9   16:new             #80  <Class ComponentName>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:ldc1            #82  <String "com.google.android.gms.analytics.AnalyticsReceiver">
	//   13   23:invokespecial   #85  <Method void ComponentName(Context, String)>
	//   14   26:invokevirtual   #89  <Method Intent Intent.setComponent(ComponentName)>
	//   15   29:iconst_0        
	//   16   30:invokestatic    #95  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   17   33:areturn         
	}

	public final void cancel()
	{
		zzys = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #99  <Field boolean zzys>
		zzyt.cancel(zzeo());
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field AlarmManager zzyt>
	//    5    9:aload_0         
	//    6   10:invokespecial   #101 <Method PendingIntent zzeo()>
	//    7   13:invokevirtual   #104 <Method void AlarmManager.cancel(PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   8   16:getstatic       #110 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          24
	//*  10   21:icmplt          57
		{
			JobScheduler jobscheduler = (JobScheduler)((zzat)this).getContext().getSystemService("jobscheduler");
	//   11   24:aload_0         
	//   12   25:invokevirtual   #21  <Method Context zzat.getContext()>
	//   13   28:ldc1            #112 <String "jobscheduler">
	//   14   30:invokevirtual   #29  <Method Object Context.getSystemService(String)>
	//   15   33:checkcast       #114 <Class JobScheduler>
	//   16   36:astore_2        
			int i = getJobId();
	//   17   37:aload_0         
	//   18   38:invokespecial   #116 <Method int getJobId()>
	//   19   41:istore_1        
			((zzat)this).zza("Cancelling job. JobID", ((Object) (Integer.valueOf(i))));
	//   20   42:aload_0         
	//   21   43:ldc1            #118 <String "Cancelling job. JobID">
	//   22   45:iload_1         
	//   23   46:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   24   49:invokevirtual   #122 <Method void zzat.zza(String, Object)>
			jobscheduler.cancel(i);
	//   25   52:aload_2         
	//   26   53:iload_1         
	//   27   54:invokevirtual   #125 <Method void JobScheduler.cancel(int)>
		}
	//   28   57:return          
	}

	protected final void zzag()
	{
		Object obj;
		try
		{
			cancel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void cancel()>
			if(zzbx.zzea() <= 0L)
				break MISSING_BLOCK_LABEL_58;
	//    2    4:invokestatic    #136 <Method long zzbx.zzea()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifle            58
			obj = ((Object) (((zzat)this).getContext()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #21  <Method Context zzat.getContext()>
	//    8   16:astore_1        
			obj = ((Object) (((Context) (obj)).getPackageManager().getReceiverInfo(new ComponentName(((Context) (obj)), "com.google.android.gms.analytics.AnalyticsReceiver"), 0)));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #140 <Method PackageManager Context.getPackageManager()>
	//   11   21:new             #80  <Class ComponentName>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:ldc1            #82  <String "com.google.android.gms.analytics.AnalyticsReceiver">
	//   15   28:invokespecial   #85  <Method void ComponentName(Context, String)>
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #146 <Method ActivityInfo PackageManager.getReceiverInfo(ComponentName, int)>
	//   18   35:astore_1        
		}
	//*  19   36:aload_1         
	//*  20   37:ifnull          58
	//*  21   40:aload_1         
	//*  22   41:getfield        #151 <Field boolean ActivityInfo.enabled>
	//*  23   44:ifeq            58
	//*  24   47:aload_0         
	//*  25   48:ldc1            #153 <String "Receiver registered for local dispatch.">
	//*  26   50:invokevirtual   #156 <Method void zzat.zzq(String)>
	//*  27   53:aload_0         
	//*  28   54:iconst_1        
	//*  29   55:putfield        #158 <Field boolean zzyr>
	//*  30   58:return          
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  31   59:astore_1        
		{
			return;
	//   32   60:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_58;
		if(((ActivityInfo) (obj)).enabled)
		{
			((zzat)this).zzq("Receiver registered for local dispatch.");
			zzyr = true;
		}
	}

	public final boolean zzej()
	{
		return zzys;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean zzys>
	//    2    4:ireturn         
	}

	public final boolean zzem()
	{
		return zzyr;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field boolean zzyr>
	//    2    4:ireturn         
	}

	public final void zzen()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method void zzau.zzcl()>
		Preconditions.checkState(zzyr, "Receiver not registered");
	//    2    4:aload_0         
	//    3    5:getfield        #158 <Field boolean zzyr>
	//    4    8:ldc1            #167 <String "Receiver not registered">
	//    5   10:invokestatic    #173 <Method void Preconditions.checkState(boolean, Object)>
		long l = zzbx.zzea();
	//    6   13:invokestatic    #136 <Method long zzbx.zzea()>
	//    7   16:lstore_2        
		if(l > 0L)
	//*   8   17:lload_2         
	//*   9   18:lconst_0        
	//*  10   19:lcmp            
	//*  11   20:ifle            188
		{
			cancel();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #130 <Method void cancel()>
			long l1 = ((zzat)this).zzbx().elapsedRealtime();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #177 <Method Clock zzat.zzbx()>
	//   16   31:invokeinterface #182 <Method long Clock.elapsedRealtime()>
	//   17   36:lstore          4
			zzys = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #99  <Field boolean zzys>
			((Boolean)zzcf.zzaam.get()).booleanValue();
	//   21   43:getstatic       #188 <Field zzcg zzcf.zzaam>
	//   22   46:invokevirtual   #194 <Method Object zzcg.get()>
	//   23   49:checkcast       #196 <Class Boolean>
	//   24   52:invokevirtual   #199 <Method boolean Boolean.booleanValue()>
	//   25   55:pop             
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  26   56:getstatic       #110 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   59:bipush          24
	//*  28   61:icmplt          165
			{
				((zzat)this).zzq("Scheduling upload with JobScheduler");
	//   29   64:aload_0         
	//   30   65:ldc1            #201 <String "Scheduling upload with JobScheduler">
	//   31   67:invokevirtual   #156 <Method void zzat.zzq(String)>
				Context context = ((zzat)this).getContext();
	//   32   70:aload_0         
	//   33   71:invokevirtual   #21  <Method Context zzat.getContext()>
	//   34   74:astore          6
				Object obj = ((Object) (new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService")));
	//   35   76:new             #80  <Class ComponentName>
	//   36   79:dup             
	//   37   80:aload           6
	//   38   82:ldc1            #203 <String "com.google.android.gms.analytics.AnalyticsJobService">
	//   39   84:invokespecial   #85  <Method void ComponentName(Context, String)>
	//   40   87:astore          7
				int i = getJobId();
	//   41   89:aload_0         
	//   42   90:invokespecial   #116 <Method int getJobId()>
	//   43   93:istore_1        
				PersistableBundle persistablebundle = new PersistableBundle();
	//   44   94:new             #205 <Class PersistableBundle>
	//   45   97:dup             
	//   46   98:invokespecial   #207 <Method void PersistableBundle()>
	//   47  101:astore          8
				persistablebundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
	//   48  103:aload           8
	//   49  105:ldc1            #209 <String "action">
	//   50  107:ldc1            #77  <String "com.google.android.gms.analytics.ANALYTICS_DISPATCH">
	//   51  109:invokevirtual   #213 <Method void PersistableBundle.putString(String, String)>
				obj = ((Object) ((new android.app.job.JobInfo.Builder(i, ((ComponentName) (obj)))).setMinimumLatency(l).setOverrideDeadline(l << 1).setExtras(persistablebundle).build()));
	//   52  112:new             #215 <Class android.app.job.JobInfo$Builder>
	//   53  115:dup             
	//   54  116:iload_1         
	//   55  117:aload           7
	//   56  119:invokespecial   #218 <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//   57  122:lload_2         
	//   58  123:invokevirtual   #222 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setMinimumLatency(long)>
	//   59  126:lload_2         
	//   60  127:iconst_1        
	//   61  128:lshl            
	//   62  129:invokevirtual   #225 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setOverrideDeadline(long)>
	//   63  132:aload           8
	//   64  134:invokevirtual   #229 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setExtras(PersistableBundle)>
	//   65  137:invokevirtual   #233 <Method android.app.job.JobInfo android.app.job.JobInfo$Builder.build()>
	//   66  140:astore          7
				((zzat)this).zza("Scheduling job. JobID", ((Object) (Integer.valueOf(i))));
	//   67  142:aload_0         
	//   68  143:ldc1            #235 <String "Scheduling job. JobID">
	//   69  145:iload_1         
	//   70  146:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   71  149:invokevirtual   #122 <Method void zzat.zza(String, Object)>
				zzdi.zza(context, ((android.app.job.JobInfo) (obj)), "com.google.android.gms", "DispatchAlarm");
	//   72  152:aload           6
	//   73  154:aload           7
	//   74  156:ldc1            #237 <String "com.google.android.gms">
	//   75  158:ldc1            #239 <String "DispatchAlarm">
	//   76  160:invokestatic    #244 <Method int zzdi.zza(Context, android.app.job.JobInfo, String, String)>
	//   77  163:pop             
				return;
	//   78  164:return          
			}
			((zzat)this).zzq("Scheduling upload with AlarmManager");
	//   79  165:aload_0         
	//   80  166:ldc1            #246 <String "Scheduling upload with AlarmManager">
	//   81  168:invokevirtual   #156 <Method void zzat.zzq(String)>
			zzyt.setInexactRepeating(2, l1 + l, l, zzeo());
	//   82  171:aload_0         
	//   83  172:getfield        #33  <Field AlarmManager zzyt>
	//   84  175:iconst_2        
	//   85  176:lload           4
	//   86  178:lload_2         
	//   87  179:ladd            
	//   88  180:lload_2         
	//   89  181:aload_0         
	//   90  182:invokespecial   #101 <Method PendingIntent zzeo()>
	//   91  185:invokevirtual   #250 <Method void AlarmManager.setInexactRepeating(int, long, long, PendingIntent)>
		}
	//   92  188:return          
	}

	private boolean zzyr;
	private boolean zzys;
	private final AlarmManager zzyt = (AlarmManager)((zzat)this).getContext().getSystemService("alarm");
	private Integer zzyu;
}
