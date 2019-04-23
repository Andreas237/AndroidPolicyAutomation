// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.d;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			dq, dv, dw, bt, 
//			ct, a, m, h, 
//			ew, ae, ag, s, 
//			u, fe, ah, cd, 
//			cr, ax, cv, o, 
//			b, q, eo, as, 
//			eu

public final class du extends dq
{

	du(ax ax)
	{
		super(ax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void dq(ax)>
		d = ((fe) (new dv(this, ((bv) (r)))));
	//    3    5:aload_0         
	//    4    6:new             #18  <Class dv>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field ax r>
	//    9   15:invokespecial   #25  <Method void dv(du, bv)>
	//   10   18:putfield        #27  <Field fe d>
		e = ((fe) (new dw(this, ((bv) (r)))));
	//   11   21:aload_0         
	//   12   22:new             #29  <Class dw>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #22  <Field ax r>
	//   17   31:invokespecial   #30  <Method void dw(du, bv)>
	//   18   34:putfield        #32  <Field fe e>
		b = ((bt)this).m().b();
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #38  <Method e bt.m()>
	//   22   42:invokeinterface #43  <Method long e.b()>
	//   23   47:putfield        #45  <Field long b>
		c = b;
	//   24   50:aload_0         
	//   25   51:aload_0         
	//   26   52:getfield        #45  <Field long b>
	//   27   55:putfield        #47  <Field long c>
	//   28   58:return          
	}

	private final void A()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		a(false, false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #55  <Method boolean a(boolean, boolean)>
	//    6   10:pop             
		((ct)this).e().a(((bt)this).m().b());
	//    7   11:aload_0         
	//    8   12:invokevirtual   #60  <Method a com.google.android.gms.measurement.internal.ct.e()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #38  <Method e bt.m()>
	//   11   19:invokeinterface #43  <Method long e.b()>
	//   12   24:invokevirtual   #65  <Method void a.a(long)>
	//   13   27:return          
	}

	static void a(du du1)
	{
		du1.A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void A()>
	//    2    4:return          
	}

	static void a(du du1, long l1)
	{
		du1.b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #71  <Method void b(long)>
	//    3    5:return          
	}

	private final void b(long l1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		z();
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void z()>
		if(((bt)this).t().d(((ct)this).g().x(), h.am))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #78  <Method ew bt.t()>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #82  <Method m ct.g()>
	//*   8   16:invokevirtual   #88  <Method String m.x()>
	//*   9   19:getstatic       #94  <Field i h.am>
	//*  10   22:invokevirtual   #99  <Method boolean com.google.android.gms.measurement.internal.ew.d(String, i)>
	//*  11   25:ifeq            39
			((bt)this).s().q.a(false);
	//   12   28:aload_0         
	//   13   29:invokevirtual   #103 <Method ae bt.s()>
	//   14   32:getfield        #109 <Field ag ae.q>
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #114 <Method void ag.a(boolean)>
		((bt)this).r().x().a("Activity resumed, time", ((Object) (Long.valueOf(l1))));
	//   17   39:aload_0         
	//   18   40:invokevirtual   #117 <Method s bt.r()>
	//   19   43:invokevirtual   #122 <Method u s.x()>
	//   20   46:ldc1            #124 <String "Activity resumed, time">
	//   21   48:lload_1         
	//   22   49:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   23   52:invokevirtual   #135 <Method void u.a(String, Object)>
		b = l1;
	//   24   55:aload_0         
	//   25   56:lload_1         
	//   26   57:putfield        #45  <Field long b>
		c = b;
	//   27   60:aload_0         
	//   28   61:aload_0         
	//   29   62:getfield        #45  <Field long b>
	//   30   65:putfield        #47  <Field long c>
		if(((bt)this).t().r(((ct)this).g().x()))
	//*  31   68:aload_0         
	//*  32   69:invokevirtual   #78  <Method ew bt.t()>
	//*  33   72:aload_0         
	//*  34   73:invokevirtual   #82  <Method m ct.g()>
	//*  35   76:invokevirtual   #88  <Method String m.x()>
	//*  36   79:invokevirtual   #138 <Method boolean ew.r(String)>
	//*  37   82:ifeq            99
		{
			a(((bt)this).m().a());
	//   38   85:aload_0         
	//   39   86:aload_0         
	//   40   87:invokevirtual   #38  <Method e bt.m()>
	//   41   90:invokeinterface #140 <Method long e.a()>
	//   42   95:invokevirtual   #141 <Method void a(long)>
			return;
	//   43   98:return          
		}
		d.c();
	//   44   99:aload_0         
	//   45  100:getfield        #27  <Field fe d>
	//   46  103:invokevirtual   #145 <Method void fe.c()>
		e.c();
	//   47  106:aload_0         
	//   48  107:getfield        #32  <Field fe e>
	//   49  110:invokevirtual   #145 <Method void fe.c()>
		if(((bt)this).s().a(((bt)this).m().a()))
	//*  50  113:aload_0         
	//*  51  114:invokevirtual   #103 <Method ae bt.s()>
	//*  52  117:aload_0         
	//*  53  118:invokevirtual   #38  <Method e bt.m()>
	//*  54  121:invokeinterface #140 <Method long e.a()>
	//*  55  126:invokevirtual   #148 <Method boolean ae.a(long)>
	//*  56  129:ifeq            154
		{
			((bt)this).s().m.a(true);
	//   57  132:aload_0         
	//   58  133:invokevirtual   #103 <Method ae bt.s()>
	//   59  136:getfield        #150 <Field ag ae.m>
	//   60  139:iconst_1        
	//   61  140:invokevirtual   #114 <Method void ag.a(boolean)>
			((bt)this).s().o.a(0L);
	//   62  143:aload_0         
	//   63  144:invokevirtual   #103 <Method ae bt.s()>
	//   64  147:getfield        #154 <Field ah ae.o>
	//   65  150:lconst_0        
	//   66  151:invokevirtual   #157 <Method void ah.a(long)>
		}
		if(((bt)this).s().m.a())
	//*  67  154:aload_0         
	//*  68  155:invokevirtual   #103 <Method ae bt.s()>
	//*  69  158:getfield        #150 <Field ag ae.m>
	//*  70  161:invokevirtual   #160 <Method boolean ag.a()>
	//*  71  164:ifeq            200
		{
			d.a(Math.max(0L, ((bt)this).s().k.a() - ((bt)this).s().o.a()));
	//   72  167:aload_0         
	//   73  168:getfield        #27  <Field fe d>
	//   74  171:lconst_0        
	//   75  172:aload_0         
	//   76  173:invokevirtual   #103 <Method ae bt.s()>
	//   77  176:getfield        #163 <Field ah ae.k>
	//   78  179:invokevirtual   #164 <Method long ah.a()>
	//   79  182:aload_0         
	//   80  183:invokevirtual   #103 <Method ae bt.s()>
	//   81  186:getfield        #154 <Field ah ae.o>
	//   82  189:invokevirtual   #164 <Method long ah.a()>
	//   83  192:lsub            
	//   84  193:invokestatic    #170 <Method long Math.max(long, long)>
	//   85  196:invokevirtual   #171 <Method void fe.a(long)>
			return;
	//   86  199:return          
		} else
		{
			e.a(Math.max(0L, 0x36ee80L - ((bt)this).s().o.a()));
	//   87  200:aload_0         
	//   88  201:getfield        #32  <Field fe e>
	//   89  204:lconst_0        
	//   90  205:ldc2w           #172 <Long 0x36ee80L>
	//   91  208:aload_0         
	//   92  209:invokevirtual   #103 <Method ae bt.s()>
	//   93  212:getfield        #154 <Field ah ae.o>
	//   94  215:invokevirtual   #164 <Method long ah.a()>
	//   95  218:lsub            
	//   96  219:invokestatic    #170 <Method long Math.max(long, long)>
	//   97  222:invokevirtual   #171 <Method void fe.a(long)>
			return;
	//   98  225:return          
		}
	}

	static void b(du du1, long l1)
	{
		du1.c(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #175 <Method void c(long)>
	//    3    5:return          
	}

	private final void c(long l1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		z();
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void z()>
		if(((bt)this).t().d(((ct)this).g().x(), h.am))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #78  <Method ew bt.t()>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #82  <Method m ct.g()>
	//*   8   16:invokevirtual   #88  <Method String m.x()>
	//*   9   19:getstatic       #94  <Field i h.am>
	//*  10   22:invokevirtual   #99  <Method boolean com.google.android.gms.measurement.internal.ew.d(String, i)>
	//*  11   25:ifeq            39
			((bt)this).s().q.a(true);
	//   12   28:aload_0         
	//   13   29:invokevirtual   #103 <Method ae bt.s()>
	//   14   32:getfield        #109 <Field ag ae.q>
	//   15   35:iconst_1        
	//   16   36:invokevirtual   #114 <Method void ag.a(boolean)>
		d.c();
	//   17   39:aload_0         
	//   18   40:getfield        #27  <Field fe d>
	//   19   43:invokevirtual   #145 <Method void fe.c()>
		e.c();
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field fe e>
	//   22   50:invokevirtual   #145 <Method void fe.c()>
		((bt)this).r().x().a("Activity paused, time", ((Object) (Long.valueOf(l1))));
	//   23   53:aload_0         
	//   24   54:invokevirtual   #117 <Method s bt.r()>
	//   25   57:invokevirtual   #122 <Method u s.x()>
	//   26   60:ldc1            #177 <String "Activity paused, time">
	//   27   62:lload_1         
	//   28   63:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   29   66:invokevirtual   #135 <Method void u.a(String, Object)>
		if(b != 0L)
	//*  30   69:aload_0         
	//*  31   70:getfield        #45  <Field long b>
	//*  32   73:lconst_0        
	//*  33   74:lcmp            
	//*  34   75:ifeq            105
			((bt)this).s().o.a(((bt)this).s().o.a() + (l1 - b));
	//   35   78:aload_0         
	//   36   79:invokevirtual   #103 <Method ae bt.s()>
	//   37   82:getfield        #154 <Field ah ae.o>
	//   38   85:aload_0         
	//   39   86:invokevirtual   #103 <Method ae bt.s()>
	//   40   89:getfield        #154 <Field ah ae.o>
	//   41   92:invokevirtual   #164 <Method long ah.a()>
	//   42   95:lload_1         
	//   43   96:aload_0         
	//   44   97:getfield        #45  <Field long b>
	//   45  100:lsub            
	//   46  101:ladd            
	//   47  102:invokevirtual   #157 <Method void ah.a(long)>
	//   48  105:return          
	}

	private final void d(long l1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		long l2 = ((bt)this).m().b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #38  <Method e bt.m()>
	//    4    8:invokeinterface #43  <Method long e.b()>
	//    5   13:lstore_3        
		((bt)this).r().x().a("Session started, time", ((Object) (Long.valueOf(l2))));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #117 <Method s bt.r()>
	//    8   18:invokevirtual   #122 <Method u s.x()>
	//    9   21:ldc1            #179 <String "Session started, time">
	//   10   23:lload_3         
	//   11   24:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   12   27:invokevirtual   #135 <Method void u.a(String, Object)>
		boolean flag = ((bt)this).t().p(((ct)this).g().x());
	//   13   30:aload_0         
	//   14   31:invokevirtual   #78  <Method ew bt.t()>
	//   15   34:aload_0         
	//   16   35:invokevirtual   #82  <Method m ct.g()>
	//   17   38:invokevirtual   #88  <Method String m.x()>
	//   18   41:invokevirtual   #182 <Method boolean ew.p(String)>
	//   19   44:istore          5
		Object obj = null;
	//   20   46:aconst_null     
	//   21   47:astore          7
		Long long1;
		if(flag)
	//*  22   49:iload           5
	//*  23   51:ifeq            67
			long1 = Long.valueOf(l1 / 1000L);
	//   24   54:lload_1         
	//   25   55:ldc2w           #183 <Long 1000L>
	//   26   58:ldiv            
	//   27   59:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   28   62:astore          6
		else
	//*  29   64:goto            70
			long1 = null;
	//   30   67:aconst_null     
	//   31   68:astore          6
		if(((bt)this).t().q(((ct)this).g().x()))
	//*  32   70:aload_0         
	//*  33   71:invokevirtual   #78  <Method ew bt.t()>
	//*  34   74:aload_0         
	//*  35   75:invokevirtual   #82  <Method m ct.g()>
	//*  36   78:invokevirtual   #88  <Method String m.x()>
	//*  37   81:invokevirtual   #186 <Method boolean ew.q(String)>
	//*  38   84:ifeq            95
			obj = ((Object) (Long.valueOf(-1L)));
	//   39   87:ldc2w           #187 <Long -1L>
	//   40   90:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   41   93:astore          7
		((ct)this).f().a("auto", "_sid", ((Object) (long1)), l1);
	//   42   95:aload_0         
	//   43   96:invokevirtual   #192 <Method cd ct.f()>
	//   44   99:ldc1            #194 <String "auto">
	//   45  101:ldc1            #196 <String "_sid">
	//   46  103:aload           6
	//   47  105:lload_1         
	//   48  106:invokevirtual   #201 <Method void cd.a(String, String, Object, long)>
		((ct)this).f().a("auto", "_sno", obj, l1);
	//   49  109:aload_0         
	//   50  110:invokevirtual   #192 <Method cd ct.f()>
	//   51  113:ldc1            #194 <String "auto">
	//   52  115:ldc1            #203 <String "_sno">
	//   53  117:aload           7
	//   54  119:lload_1         
	//   55  120:invokevirtual   #201 <Method void cd.a(String, String, Object, long)>
		((bt)this).s().m.a(false);
	//   56  123:aload_0         
	//   57  124:invokevirtual   #103 <Method ae bt.s()>
	//   58  127:getfield        #150 <Field ag ae.m>
	//   59  130:iconst_0        
	//   60  131:invokevirtual   #114 <Method void ag.a(boolean)>
		obj = ((Object) (new Bundle()));
	//   61  134:new             #205 <Class Bundle>
	//   62  137:dup             
	//   63  138:invokespecial   #207 <Method void Bundle()>
	//   64  141:astore          7
		if(((bt)this).t().p(((ct)this).g().x()))
	//*  65  143:aload_0         
	//*  66  144:invokevirtual   #78  <Method ew bt.t()>
	//*  67  147:aload_0         
	//*  68  148:invokevirtual   #82  <Method m ct.g()>
	//*  69  151:invokevirtual   #88  <Method String m.x()>
	//*  70  154:invokevirtual   #182 <Method boolean ew.p(String)>
	//*  71  157:ifeq            172
			((Bundle) (obj)).putLong("_sid", long1.longValue());
	//   72  160:aload           7
	//   73  162:ldc1            #196 <String "_sid">
	//   74  164:aload           6
	//   75  166:invokevirtual   #210 <Method long Long.longValue()>
	//   76  169:invokevirtual   #214 <Method void Bundle.putLong(String, long)>
		((ct)this).f().a("auto", "_s", l1, ((Bundle) (obj)));
	//   77  172:aload_0         
	//   78  173:invokevirtual   #192 <Method cd ct.f()>
	//   79  176:ldc1            #194 <String "auto">
	//   80  178:ldc1            #216 <String "_s">
	//   81  180:lload_1         
	//   82  181:aload           7
	//   83  183:invokevirtual   #219 <Method void cd.a(String, String, long, Bundle)>
		((bt)this).s().n.a(l1);
	//   84  186:aload_0         
	//   85  187:invokevirtual   #103 <Method ae bt.s()>
	//   86  190:getfield        #222 <Field ah ae.n>
	//   87  193:lload_1         
	//   88  194:invokevirtual   #157 <Method void ah.a(long)>
	//   89  197:return          
	}

	private final void z()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #224 <Field Handler a>
	//*   4    6:ifnonnull       23
			a = ((Handler) (new d(Looper.getMainLooper())));
	//    5    9:aload_0         
	//    6   10:new             #226 <Class d>
	//    7   13:dup             
	//    8   14:invokestatic    #232 <Method Looper Looper.getMainLooper()>
	//    9   17:invokespecial   #235 <Method void d(Looper)>
	//   10   20:putfield        #224 <Field Handler a>
		this;
	//   11   23:aload_0         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_1        
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw exception;
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public final volatile void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #237 <Method void dq.a()>
	//    2    4:return          
	}

	final void a(long l1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		z();
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void z()>
		a(l1, false);
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #240 <Method void a(long, boolean)>
	//    8   14:return          
	}

	final void a(long l1, boolean flag)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		z();
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void z()>
		d.c();
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field fe d>
	//    6   12:invokevirtual   #145 <Method void fe.c()>
		e.c();
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field fe e>
	//    9   19:invokevirtual   #145 <Method void fe.c()>
		if(((bt)this).s().a(l1))
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #103 <Method ae bt.s()>
	//*  12   26:lload_1         
	//*  13   27:invokevirtual   #148 <Method boolean ae.a(long)>
	//*  14   30:ifeq            55
		{
			((bt)this).s().m.a(true);
	//   15   33:aload_0         
	//   16   34:invokevirtual   #103 <Method ae bt.s()>
	//   17   37:getfield        #150 <Field ag ae.m>
	//   18   40:iconst_1        
	//   19   41:invokevirtual   #114 <Method void ag.a(boolean)>
			((bt)this).s().o.a(0L);
	//   20   44:aload_0         
	//   21   45:invokevirtual   #103 <Method ae bt.s()>
	//   22   48:getfield        #154 <Field ah ae.o>
	//   23   51:lconst_0        
	//   24   52:invokevirtual   #157 <Method void ah.a(long)>
		}
		if(flag && ((bt)this).t().s(((ct)this).g().x()))
	//*  25   55:iload_3         
	//*  26   56:ifeq            87
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #78  <Method ew bt.t()>
	//*  29   63:aload_0         
	//*  30   64:invokevirtual   #82  <Method m ct.g()>
	//*  31   67:invokevirtual   #88  <Method String m.x()>
	//*  32   70:invokevirtual   #242 <Method boolean ew.s(String)>
	//*  33   73:ifeq            87
			((bt)this).s().n.a(l1);
	//   34   76:aload_0         
	//   35   77:invokevirtual   #103 <Method ae bt.s()>
	//   36   80:getfield        #222 <Field ah ae.n>
	//   37   83:lload_1         
	//   38   84:invokevirtual   #157 <Method void ah.a(long)>
		if(((bt)this).s().m.a())
	//*  39   87:aload_0         
	//*  40   88:invokevirtual   #103 <Method ae bt.s()>
	//*  41   91:getfield        #150 <Field ag ae.m>
	//*  42   94:invokevirtual   #160 <Method boolean ag.a()>
	//*  43   97:ifeq            106
		{
			d(l1);
	//   44  100:aload_0         
	//   45  101:lload_1         
	//   46  102:invokespecial   #244 <Method void d(long)>
			return;
	//   47  105:return          
		} else
		{
			e.a(Math.max(0L, 0x36ee80L - ((bt)this).s().o.a()));
	//   48  106:aload_0         
	//   49  107:getfield        #32  <Field fe e>
	//   50  110:lconst_0        
	//   51  111:ldc2w           #172 <Long 0x36ee80L>
	//   52  114:aload_0         
	//   53  115:invokevirtual   #103 <Method ae bt.s()>
	//   54  118:getfield        #154 <Field ah ae.o>
	//   55  121:invokevirtual   #164 <Method long ah.a()>
	//   56  124:lsub            
	//   57  125:invokestatic    #170 <Method long Math.max(long, long)>
	//   58  128:invokevirtual   #171 <Method void fe.a(long)>
			return;
	//   59  131:return          
		}
	}

	public final boolean a(boolean flag, boolean flag1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		((dq)this).E();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #247 <Method void dq.E()>
		long l1 = ((bt)this).m().b();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #38  <Method e bt.m()>
	//    6   12:invokeinterface #43  <Method long e.b()>
	//    7   17:lstore_3        
		((bt)this).s().n.a(((bt)this).m().a());
	//    8   18:aload_0         
	//    9   19:invokevirtual   #103 <Method ae bt.s()>
	//   10   22:getfield        #222 <Field ah ae.n>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #38  <Method e bt.m()>
	//   13   29:invokeinterface #140 <Method long e.a()>
	//   14   34:invokevirtual   #157 <Method void ah.a(long)>
		long l2 = l1 - b;
	//   15   37:lload_3         
	//   16   38:aload_0         
	//   17   39:getfield        #45  <Field long b>
	//   18   42:lsub            
	//   19   43:lstore          5
		if(!flag && l2 < 1000L)
	//*  20   45:iload_1         
	//*  21   46:ifne            77
	//*  22   49:lload           5
	//*  23   51:ldc2w           #183 <Long 1000L>
	//*  24   54:lcmp            
	//*  25   55:ifge            77
		{
			((bt)this).r().x().a("Screen exposed for less than 1000 ms. Event not sent. time", ((Object) (Long.valueOf(l2))));
	//   26   58:aload_0         
	//   27   59:invokevirtual   #117 <Method s bt.r()>
	//   28   62:invokevirtual   #122 <Method u s.x()>
	//   29   65:ldc1            #249 <String "Screen exposed for less than 1000 ms. Event not sent. time">
	//   30   67:lload           5
	//   31   69:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   32   72:invokevirtual   #135 <Method void u.a(String, Object)>
			return false;
	//   33   75:iconst_0        
	//   34   76:ireturn         
		}
		((bt)this).s().o.a(l2);
	//   35   77:aload_0         
	//   36   78:invokevirtual   #103 <Method ae bt.s()>
	//   37   81:getfield        #154 <Field ah ae.o>
	//   38   84:lload           5
	//   39   86:invokevirtual   #157 <Method void ah.a(long)>
		((bt)this).r().x().a("Recording user engagement, ms", ((Object) (Long.valueOf(l2))));
	//   40   89:aload_0         
	//   41   90:invokevirtual   #117 <Method s bt.r()>
	//   42   93:invokevirtual   #122 <Method u s.x()>
	//   43   96:ldc1            #251 <String "Recording user engagement, ms">
	//   44   98:lload           5
	//   45  100:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   46  103:invokevirtual   #135 <Method void u.a(String, Object)>
		Bundle bundle = new Bundle();
	//   47  106:new             #205 <Class Bundle>
	//   48  109:dup             
	//   49  110:invokespecial   #207 <Method void Bundle()>
	//   50  113:astore          7
		bundle.putLong("_et", l2);
	//   51  115:aload           7
	//   52  117:ldc1            #253 <String "_et">
	//   53  119:lload           5
	//   54  121:invokevirtual   #214 <Method void Bundle.putLong(String, long)>
		cr.a(((ct)this).i().x(), bundle, true);
	//   55  124:aload_0         
	//   56  125:invokevirtual   #257 <Method cr ct.i()>
	//   57  128:invokevirtual   #262 <Method cq cr.x()>
	//   58  131:aload           7
	//   59  133:iconst_1        
	//   60  134:invokestatic    #265 <Method void cr.a(cq, Bundle, boolean)>
		if(((bt)this).t().t(((ct)this).g().x()))
	//*  61  137:aload_0         
	//*  62  138:invokevirtual   #78  <Method ew bt.t()>
	//*  63  141:aload_0         
	//*  64  142:invokevirtual   #82  <Method m ct.g()>
	//*  65  145:invokevirtual   #88  <Method String m.x()>
	//*  66  148:invokevirtual   #267 <Method boolean ew.t(String)>
	//*  67  151:ifeq            207
			if(((bt)this).t().d(((ct)this).g().x(), h.ap))
	//*  68  154:aload_0         
	//*  69  155:invokevirtual   #78  <Method ew bt.t()>
	//*  70  158:aload_0         
	//*  71  159:invokevirtual   #82  <Method m ct.g()>
	//*  72  162:invokevirtual   #88  <Method String m.x()>
	//*  73  165:getstatic       #270 <Field i h.ap>
	//*  74  168:invokevirtual   #99  <Method boolean com.google.android.gms.measurement.internal.ew.d(String, i)>
	//*  75  171:ifeq            186
			{
				if(!flag1)
	//*  76  174:iload_2         
	//*  77  175:ifne            207
					y();
	//   78  178:aload_0         
	//   79  179:invokevirtual   #273 <Method long y()>
	//   80  182:pop2            
			} else
	//*  81  183:goto            207
			if(flag1)
	//*  82  186:iload_2         
	//*  83  187:ifeq            202
				bundle.putLong("_fr", 1L);
	//   84  190:aload           7
	//   85  192:ldc2            #275 <String "_fr">
	//   86  195:lconst_1        
	//   87  196:invokevirtual   #214 <Method void Bundle.putLong(String, long)>
			else
	//*  88  199:goto            207
				y();
	//   89  202:aload_0         
	//   90  203:invokevirtual   #273 <Method long y()>
	//   91  206:pop2            
		if(!((bt)this).t().d(((ct)this).g().x(), h.ap) || !flag1)
	//*  92  207:aload_0         
	//*  93  208:invokevirtual   #78  <Method ew bt.t()>
	//*  94  211:aload_0         
	//*  95  212:invokevirtual   #82  <Method m ct.g()>
	//*  96  215:invokevirtual   #88  <Method String m.x()>
	//*  97  218:getstatic       #270 <Field i h.ap>
	//*  98  221:invokevirtual   #99  <Method boolean com.google.android.gms.measurement.internal.ew.d(String, i)>
	//*  99  224:ifeq            231
	//* 100  227:iload_2         
	//* 101  228:ifne            245
			((ct)this).f().a("auto", "_e", bundle);
	//  102  231:aload_0         
	//  103  232:invokevirtual   #192 <Method cd ct.f()>
	//  104  235:ldc1            #194 <String "auto">
	//  105  237:ldc2            #277 <String "_e">
	//  106  240:aload           7
	//  107  242:invokevirtual   #280 <Method void cd.a(String, String, Bundle)>
		b = l1;
	//  108  245:aload_0         
	//  109  246:lload_3         
	//  110  247:putfield        #45  <Field long b>
		e.c();
	//  111  250:aload_0         
	//  112  251:getfield        #32  <Field fe e>
	//  113  254:invokevirtual   #145 <Method void fe.c()>
		e.a(Math.max(0L, 0x36ee80L - ((bt)this).s().o.a()));
	//  114  257:aload_0         
	//  115  258:getfield        #32  <Field fe e>
	//  116  261:lconst_0        
	//  117  262:ldc2w           #172 <Long 0x36ee80L>
	//  118  265:aload_0         
	//  119  266:invokevirtual   #103 <Method ae bt.s()>
	//  120  269:getfield        #154 <Field ah ae.o>
	//  121  272:invokevirtual   #164 <Method long ah.a()>
	//  122  275:lsub            
	//  123  276:invokestatic    #170 <Method long Math.max(long, long)>
	//  124  279:invokevirtual   #171 <Method void fe.a(long)>
		return true;
	//  125  282:iconst_1        
	//  126  283:ireturn         
	}

	public final volatile void b()
	{
		super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void dq.b()>
	//    2    4:return          
	}

	public final volatile void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method void dq.c()>
	//    2    4:return          
	}

	public final volatile void d()
	{
		super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #284 <Method void com.google.android.gms.measurement.internal.dq.d()>
	//    2    4:return          
	}

	public final volatile a e()
	{
		return super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #285 <Method a com.google.android.gms.measurement.internal.dq.e()>
	//    2    4:areturn         
	}

	public final volatile cd f()
	{
		return super.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #286 <Method cd dq.f()>
	//    2    4:areturn         
	}

	public final volatile m g()
	{
		return super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method m dq.g()>
	//    2    4:areturn         
	}

	public final volatile cv h()
	{
		return super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method cv dq.h()>
	//    2    4:areturn         
	}

	public final volatile cr i()
	{
		return super.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method cr dq.i()>
	//    2    4:areturn         
	}

	public final volatile o j()
	{
		return super.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #296 <Method o dq.j()>
	//    2    4:areturn         
	}

	public final volatile du k()
	{
		return super.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #299 <Method du dq.k()>
	//    2    4:areturn         
	}

	public final volatile b l()
	{
		return super.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method b dq.l()>
	//    2    4:areturn         
	}

	public final volatile e m()
	{
		return super.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method e dq.m()>
	//    2    4:areturn         
	}

	public final volatile Context n()
	{
		return super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method Context dq.n()>
	//    2    4:areturn         
	}

	public final volatile q o()
	{
		return super.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #310 <Method q dq.o()>
	//    2    4:areturn         
	}

	public final volatile eo p()
	{
		return super.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method eo dq.p()>
	//    2    4:areturn         
	}

	public final volatile as q()
	{
		return super.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #316 <Method as dq.q()>
	//    2    4:areturn         
	}

	public final volatile s r()
	{
		return super.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method s dq.r()>
	//    2    4:areturn         
	}

	public final volatile ae s()
	{
		return super.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #318 <Method ae dq.s()>
	//    2    4:areturn         
	}

	public final volatile ew t()
	{
		return super.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method ew dq.t()>
	//    2    4:areturn         
	}

	public final volatile eu u()
	{
		return super.u();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method eu dq.u()>
	//    2    4:areturn         
	}

	protected final boolean v()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final void x()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void com.google.android.gms.measurement.internal.bt.d()>
		d(((bt)this).m().a());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #38  <Method e bt.m()>
	//    5    9:invokeinterface #140 <Method long e.a()>
	//    6   14:invokespecial   #244 <Method void d(long)>
	//    7   17:return          
	}

	final long y()
	{
		long l1 = ((bt)this).m().b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method e bt.m()>
	//    2    4:invokeinterface #43  <Method long e.b()>
	//    3    9:lstore_1        
		long l2 = c;
	//    4   10:aload_0         
	//    5   11:getfield        #47  <Field long c>
	//    6   14:lstore_3        
		c = l1;
	//    7   15:aload_0         
	//    8   16:lload_1         
	//    9   17:putfield        #47  <Field long c>
		return l1 - l2;
	//   10   20:lload_1         
	//   11   21:lload_3         
	//   12   22:lsub            
	//   13   23:lreturn         
	}

	private Handler a;
	private long b;
	private long c;
	private final fe d;
	private final fe e;
}
