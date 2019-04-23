// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.*;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.a;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			ed, bt, eb, ee, 
//			s, u, an, eo, 
//			h, i, fe, el, 
//			et, ez, b, q, 
//			as, ae, ew, eu

public final class ea extends ed
{

	protected ea(ee ee1)
	{
		super(ee1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void ed(ee)>
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #20  <Method Context bt.n()>
	//    6   10:ldc1            #22  <String "alarm">
	//    7   12:invokevirtual   #28  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #30  <Class AlarmManager>
	//    9   18:putfield        #32  <Field AlarmManager b>
		c = ((fe) (new eb(this, ((bv) (ee1.p())), ee1)));
	//   10   21:aload_0         
	//   11   22:new             #34  <Class eb>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #40  <Method ax ee.p()>
	//   16   31:aload_1         
	//   17   32:invokespecial   #43  <Method void eb(ea, bv, ee)>
	//   18   35:putfield        #45  <Field fe c>
	//   19   38:return          
	}

	private final void w()
	{
		JobScheduler jobscheduler = (JobScheduler)((bt)this).n().getSystemService("jobscheduler");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Context bt.n()>
	//    2    4:ldc1            #53  <String "jobscheduler">
	//    3    6:invokevirtual   #28  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #55  <Class JobScheduler>
	//    5   12:astore_2        
		int j = x();
	//    6   13:aload_0         
	//    7   14:invokespecial   #59  <Method int x()>
	//    8   17:istore_1        
		((bt)this).r().x().a("Cancelling job. JobID", ((Object) (Integer.valueOf(j))));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #63  <Method s bt.r()>
	//   11   22:invokevirtual   #68  <Method u s.x()>
	//   12   25:ldc1            #70  <String "Cancelling job. JobID">
	//   13   27:iload_1         
	//   14   28:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   15   31:invokevirtual   #82  <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
		jobscheduler.cancel(j);
	//   16   34:aload_2         
	//   17   35:iload_1         
	//   18   36:invokevirtual   #86  <Method void JobScheduler.cancel(int)>
	//   19   39:return          
	}

	private final int x()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Integer d>
	//*   2    4:ifnonnull       56
		{
			String s1 = String.valueOf(((Object) (((bt)this).n().getPackageName())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #20  <Method Context bt.n()>
	//    5   11:invokevirtual   #93  <Method String Context.getPackageName()>
	//    6   14:invokestatic    #98  <Method String String.valueOf(Object)>
	//    7   17:astore_1        
			if(s1.length() != 0)
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #101 <Method int String.length()>
	//*  10   22:ifeq            35
				s1 = "measurement".concat(s1);
	//   11   25:ldc1            #103 <String "measurement">
	//   12   27:aload_1         
	//   13   28:invokevirtual   #107 <Method String String.concat(String)>
	//   14   31:astore_1        
			else
	//*  15   32:goto            45
				s1 = new String("measurement");
	//   16   35:new             #95  <Class String>
	//   17   38:dup             
	//   18   39:ldc1            #103 <String "measurement">
	//   19   41:invokespecial   #110 <Method void String(String)>
	//   20   44:astore_1        
			d = Integer.valueOf(s1.hashCode());
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #113 <Method int String.hashCode()>
	//   24   50:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   25   53:putfield        #89  <Field Integer d>
		}
		return d.intValue();
	//   26   56:aload_0         
	//   27   57:getfield        #89  <Field Integer d>
	//   28   60:invokevirtual   #116 <Method int Integer.intValue()>
	//   29   63:ireturn         
	}

	private final PendingIntent y()
	{
		Context context = ((bt)this).n();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Context bt.n()>
	//    2    4:astore_1        
		return PendingIntent.getBroadcast(context, 0, (new Intent()).setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:new             #120 <Class Intent>
	//    6   10:dup             
	//    7   11:invokespecial   #122 <Method void Intent()>
	//    8   14:aload_1         
	//    9   15:ldc1            #124 <String "com.google.android.gms.measurement.AppMeasurementReceiver">
	//   10   17:invokevirtual   #128 <Method Intent Intent.setClassName(Context, String)>
	//   11   20:ldc1            #130 <String "com.google.android.gms.measurement.UPLOAD">
	//   12   22:invokevirtual   #134 <Method Intent Intent.setAction(String)>
	//   13   25:iconst_0        
	//   14   26:invokestatic    #140 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   15   29:areturn         
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void com.google.android.gms.measurement.internal.ed.a()>
	//    2    4:return          
	}

	public final void a(long l1)
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method void ed.k()>
		((bt)this).u();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #150 <Method eu bt.u()>
	//    4    8:pop             
		Context context = ((bt)this).n();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #20  <Method Context bt.n()>
	//    7   13:astore          6
		if(!com.google.android.gms.measurement.internal.an.a(context))
	//*   8   15:aload           6
	//*   9   17:invokestatic    #155 <Method boolean com.google.android.gms.measurement.internal.an.a(Context)>
	//*  10   20:ifne            35
			((bt)this).r().w().a("Receiver not registered/enabled");
	//   11   23:aload_0         
	//   12   24:invokevirtual   #63  <Method s bt.r()>
	//   13   27:invokevirtual   #157 <Method u s.w()>
	//   14   30:ldc1            #159 <String "Receiver not registered/enabled">
	//   15   32:invokevirtual   #161 <Method void com.google.android.gms.measurement.internal.u.a(String)>
		if(!com.google.android.gms.measurement.internal.eo.a(context, false))
	//*  16   35:aload           6
	//*  17   37:iconst_0        
	//*  18   38:invokestatic    #166 <Method boolean com.google.android.gms.measurement.internal.eo.a(Context, boolean)>
	//*  19   41:ifne            56
			((bt)this).r().w().a("Service not registered/enabled");
	//   20   44:aload_0         
	//   21   45:invokevirtual   #63  <Method s bt.r()>
	//   22   48:invokevirtual   #157 <Method u s.w()>
	//   23   51:ldc1            #168 <String "Service not registered/enabled">
	//   24   53:invokevirtual   #161 <Method void com.google.android.gms.measurement.internal.u.a(String)>
		f();
	//   25   56:aload_0         
	//   26   57:invokevirtual   #171 <Method void f()>
		long l2 = ((bt)this).m().b();
	//   27   60:aload_0         
	//   28   61:invokevirtual   #175 <Method e bt.m()>
	//   29   64:invokeinterface #180 <Method long e.b()>
	//   30   69:lstore          4
		if(l1 < Math.max(0L, ((Long)h.F.b()).longValue()) && !c.b())
	//*  31   71:lload_1         
	//*  32   72:lconst_0        
	//*  33   73:getstatic       #186 <Field i h.F>
	//*  34   76:invokevirtual   #191 <Method Object i.b()>
	//*  35   79:checkcast       #193 <Class Long>
	//*  36   82:invokevirtual   #196 <Method long Long.longValue()>
	//*  37   85:invokestatic    #202 <Method long Math.max(long, long)>
	//*  38   88:lcmp            
	//*  39   89:ifge            122
	//*  40   92:aload_0         
	//*  41   93:getfield        #45  <Field fe c>
	//*  42   96:invokevirtual   #207 <Method boolean fe.b()>
	//*  43   99:ifne            122
		{
			((bt)this).r().x().a("Scheduling upload with DelayedRunnable");
	//   44  102:aload_0         
	//   45  103:invokevirtual   #63  <Method s bt.r()>
	//   46  106:invokevirtual   #68  <Method u s.x()>
	//   47  109:ldc1            #209 <String "Scheduling upload with DelayedRunnable">
	//   48  111:invokevirtual   #161 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			c.a(l1);
	//   49  114:aload_0         
	//   50  115:getfield        #45  <Field fe c>
	//   51  118:lload_1         
	//   52  119:invokevirtual   #211 <Method void com.google.android.gms.measurement.internal.fe.a(long)>
		}
		((bt)this).u();
	//   53  122:aload_0         
	//   54  123:invokevirtual   #150 <Method eu bt.u()>
	//   55  126:pop             
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  56  127:getstatic       #217 <Field int android.os.Build$VERSION.SDK_INT>
	//*  57  130:bipush          24
	//*  58  132:icmplt          251
		{
			((bt)this).r().x().a("Scheduling upload with JobScheduler");
	//   59  135:aload_0         
	//   60  136:invokevirtual   #63  <Method s bt.r()>
	//   61  139:invokevirtual   #68  <Method u s.x()>
	//   62  142:ldc1            #219 <String "Scheduling upload with JobScheduler">
	//   63  144:invokevirtual   #161 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			Context context1 = ((bt)this).n();
	//   64  147:aload_0         
	//   65  148:invokevirtual   #20  <Method Context bt.n()>
	//   66  151:astore          6
			Object obj = ((Object) (new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService")));
	//   67  153:new             #221 <Class ComponentName>
	//   68  156:dup             
	//   69  157:aload           6
	//   70  159:ldc1            #223 <String "com.google.android.gms.measurement.AppMeasurementJobService">
	//   71  161:invokespecial   #226 <Method void ComponentName(Context, String)>
	//   72  164:astore          7
			int j = x();
	//   73  166:aload_0         
	//   74  167:invokespecial   #59  <Method int x()>
	//   75  170:istore_3        
			PersistableBundle persistablebundle = new PersistableBundle();
	//   76  171:new             #228 <Class PersistableBundle>
	//   77  174:dup             
	//   78  175:invokespecial   #229 <Method void PersistableBundle()>
	//   79  178:astore          8
			persistablebundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
	//   80  180:aload           8
	//   81  182:ldc1            #231 <String "action">
	//   82  184:ldc1            #130 <String "com.google.android.gms.measurement.UPLOAD">
	//   83  186:invokevirtual   #235 <Method void PersistableBundle.putString(String, String)>
			obj = ((Object) ((new android.app.job.JobInfo.Builder(j, ((ComponentName) (obj)))).setMinimumLatency(l1).setOverrideDeadline(l1 << 1).setExtras(persistablebundle).build()));
	//   84  189:new             #237 <Class android.app.job.JobInfo$Builder>
	//   85  192:dup             
	//   86  193:iload_3         
	//   87  194:aload           7
	//   88  196:invokespecial   #240 <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//   89  199:lload_1         
	//   90  200:invokevirtual   #244 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setMinimumLatency(long)>
	//   91  203:lload_1         
	//   92  204:iconst_1        
	//   93  205:lshl            
	//   94  206:invokevirtual   #247 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setOverrideDeadline(long)>
	//   95  209:aload           8
	//   96  211:invokevirtual   #251 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setExtras(PersistableBundle)>
	//   97  214:invokevirtual   #255 <Method android.app.job.JobInfo android.app.job.JobInfo$Builder.build()>
	//   98  217:astore          7
			((bt)this).r().x().a("Scheduling job. JobID", ((Object) (Integer.valueOf(j))));
	//   99  219:aload_0         
	//  100  220:invokevirtual   #63  <Method s bt.r()>
	//  101  223:invokevirtual   #68  <Method u s.x()>
	//  102  226:ldc2            #257 <String "Scheduling job. JobID">
	//  103  229:iload_3         
	//  104  230:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//  105  233:invokevirtual   #82  <Method void com.google.android.gms.measurement.internal.u.a(String, Object)>
			com.google.android.gms.internal.measurement.a.a(context1, ((android.app.job.JobInfo) (obj)), "com.google.android.gms", "UploadAlarm");
	//  106  236:aload           6
	//  107  238:aload           7
	//  108  240:ldc2            #259 <String "com.google.android.gms">
	//  109  243:ldc2            #261 <String "UploadAlarm">
	//  110  246:invokestatic    #266 <Method int a.a(Context, android.app.job.JobInfo, String, String)>
	//  111  249:pop             
			return;
	//  112  250:return          
		} else
		{
			((bt)this).r().x().a("Scheduling upload with AlarmManager");
	//  113  251:aload_0         
	//  114  252:invokevirtual   #63  <Method s bt.r()>
	//  115  255:invokevirtual   #68  <Method u s.x()>
	//  116  258:ldc2            #268 <String "Scheduling upload with AlarmManager">
	//  117  261:invokevirtual   #161 <Method void com.google.android.gms.measurement.internal.u.a(String)>
			b.setInexactRepeating(2, l2 + l1, Math.max(((Long)h.A.b()).longValue(), l1), y());
	//  118  264:aload_0         
	//  119  265:getfield        #32  <Field AlarmManager b>
	//  120  268:iconst_2        
	//  121  269:lload           4
	//  122  271:lload_1         
	//  123  272:ladd            
	//  124  273:getstatic       #271 <Field i h.A>
	//  125  276:invokevirtual   #191 <Method Object i.b()>
	//  126  279:checkcast       #193 <Class Long>
	//  127  282:invokevirtual   #196 <Method long Long.longValue()>
	//  128  285:lload_1         
	//  129  286:invokestatic    #202 <Method long Math.max(long, long)>
	//  130  289:aload_0         
	//  131  290:invokespecial   #273 <Method PendingIntent y()>
	//  132  293:invokevirtual   #277 <Method void AlarmManager.setInexactRepeating(int, long, long, PendingIntent)>
			return;
	//  133  296:return          
		}
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #279 <Method void ed.b()>
	//    2    4:return          
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method void ed.c()>
	//    2    4:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method void ed.d()>
	//    2    4:return          
	}

	protected final boolean e()
	{
		b.cancel(y());
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlarmManager b>
	//    2    4:aload_0         
	//    3    5:invokespecial   #273 <Method PendingIntent y()>
	//    4    8:invokevirtual   #287 <Method void AlarmManager.cancel(PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   5   11:getstatic       #217 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   14:bipush          24
	//*   7   16:icmplt          23
			w();
	//    8   19:aload_0         
	//    9   20:invokespecial   #289 <Method void w()>
		return false;
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public final void f()
	{
		((ed)this).k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method void ed.k()>
		b.cancel(y());
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field AlarmManager b>
	//    4    8:aload_0         
	//    5    9:invokespecial   #273 <Method PendingIntent y()>
	//    6   12:invokevirtual   #287 <Method void AlarmManager.cancel(PendingIntent)>
		c.c();
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field fe c>
	//    9   19:invokevirtual   #290 <Method void fe.c()>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  10   22:getstatic       #217 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   25:bipush          24
	//*  12   27:icmplt          34
			w();
	//   13   30:aload_0         
	//   14   31:invokespecial   #289 <Method void w()>
	//   15   34:return          
	}

	public final volatile el g()
	{
		return super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #294 <Method el ed.g()>
	//    2    4:areturn         
	}

	public final volatile et h()
	{
		return super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #298 <Method et ed.h()>
	//    2    4:areturn         
	}

	public final volatile ez i()
	{
		return super.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method ez ed.i()>
	//    2    4:areturn         
	}

	public final volatile b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method b ed.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method e ed.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #308 <Method Context ed.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #312 <Method q ed.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #315 <Method eo ed.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method as ed.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #320 <Method s ed.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #324 <Method ae ed.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method ew ed.t()>
	//    2    4:areturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method eu ed.u()>
	//    2    4:areturn         
	}

	private final AlarmManager b = (AlarmManager)((bt)this).n().getSystemService("alarm");
	private final fe c;
	private Integer d;
}
