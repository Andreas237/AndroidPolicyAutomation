// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xb, wr, bwk, wl, 
//			bql, qf, zzbbi, xg, 
//			bow, p, m, wx, 
//			s, wk, wt, abe, 
//			aaq, qj, aaj, aah, 
//			wj, xe, aas, tk, 
//			xa

public final class wi
{

	public wi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void Object()>
	//    6   12:putfield        #40  <Field Object a>
	//    7   15:aload_0         
	//    8   16:new             #42  <Class xb>
	//    9   19:dup             
	//   10   20:invokespecial   #43  <Method void xb()>
	//   11   23:putfield        #45  <Field xb c>
		d = new wr(bwk.f(), ((xa) (c)));
	//   12   26:aload_0         
	//   13   27:new             #47  <Class wr>
	//   14   30:dup             
	//   15   31:invokestatic    #52  <Method String bwk.f()>
	//   16   34:aload_0         
	//   17   35:getfield        #45  <Field xb c>
	//   18   38:invokespecial   #55  <Method void wr(String, xa)>
	//   19   41:putfield        #57  <Field wr d>
		e = false;
	//   20   44:aload_0         
	//   21   45:iconst_0        
	//   22   46:putfield        #59  <Field boolean e>
		h = null;
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:putfield        #61  <Field s h>
		i = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #63  <Field Boolean i>
	//   29   59:aload_0         
	//   30   60:new             #65  <Class AtomicInteger>
	//   31   63:dup             
	//   32   64:iconst_0        
	//   33   65:invokespecial   #68  <Method void AtomicInteger(int)>
	//   34   68:putfield        #70  <Field AtomicInteger k>
	//   35   71:aload_0         
	//   36   72:new             #72  <Class wl>
	//   37   75:dup             
	//   38   76:aconst_null     
	//   39   77:invokespecial   #75  <Method void wl(wk)>
	//   40   80:putfield        #77  <Field wl l>
	//   41   83:aload_0         
	//   42   84:new             #4   <Class Object>
	//   43   87:dup             
	//   44   88:invokespecial   #38  <Method void Object()>
	//   45   91:putfield        #79  <Field Object m>
	//   46   94:return          
	}

	static Context a(wi wi1)
	{
		return wi1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context f>
	//    2    4:areturn         
	}

	private static ArrayList a(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #91  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void ArrayList()>
	//    3    7:astore_2        
		try
		{
			context = ((Context) (com.google.android.gms.common.b.c.a(context).b(context.getApplicationInfo().packageName, 4096)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #97  <Method b c.a(Context)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #103 <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   16:getfield        #108 <Field String ApplicationInfo.packageName>
	//    9   19:sipush          4096
	//   10   22:invokevirtual   #113 <Method PackageInfo b.b(String, int)>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:getfield        #119 <Field String[] PackageInfo.requestedPermissions>
	//*  14   30:ifnull          84
	//*  15   33:aload_0         
	//*  16   34:getfield        #123 <Field int[] PackageInfo.requestedPermissionsFlags>
	//*  17   37:ifnonnull       42
	//*  18   40:aload_2         
	//*  19   41:areturn         
	//*  20   42:iconst_0        
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:aload_0         
	//*  24   46:getfield        #119 <Field String[] PackageInfo.requestedPermissions>
	//*  25   49:arraylength     
	//*  26   50:icmpge          82
	//*  27   53:aload_0         
	//*  28   54:getfield        #123 <Field int[] PackageInfo.requestedPermissionsFlags>
	//*  29   57:iload_1         
	//*  30   58:iaload          
	//*  31   59:iconst_2        
	//*  32   60:iand            
	//*  33   61:ifeq            75
	//*  34   64:aload_2         
	//*  35   65:aload_0         
	//*  36   66:getfield        #119 <Field String[] PackageInfo.requestedPermissions>
	//*  37   69:iload_1         
	//*  38   70:aaload          
	//*  39   71:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
	//*  40   74:pop             
	//*  41   75:iload_1         
	//*  42   76:iconst_1        
	//*  43   77:iadd            
	//*  44   78:istore_1        
	//*  45   79:goto            44
	//*  46   82:aload_2         
	//*  47   83:areturn         
	//*  48   84:aload_2         
	//*  49   85:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50   86:astore_0        
		{
			return arraylist;
	//   51   87:aload_2         
	//   52   88:areturn         
		}
		if(((PackageInfo) (context)).requestedPermissions != null)
		{
			if(((PackageInfo) (context)).requestedPermissionsFlags == null)
				return arraylist;
			for(int i1 = 0; i1 < ((PackageInfo) (context)).requestedPermissions.length; i1++)
				if((((PackageInfo) (context)).requestedPermissionsFlags[i1] & 2) != 0)
					arraylist.add(((Object) (((PackageInfo) (context)).requestedPermissions[i1])));

			return arraylist;
		} else
		{
			return arraylist;
		}
	}

	static zzbbi b(wi wi1)
	{
		return wi1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field zzbbi g>
	//    2    4:areturn         
	}

	static Object c(wi wi1)
	{
		return wi1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object a>
	//    2    4:areturn         
	}

	static s d(wi wi1)
	{
		return wi1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field s h>
	//    2    4:areturn         
	}

	public final s a()
	{
		s s1;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s1 = h;
	//    5    7:aload_0         
	//    6    8:getfield        #61  <Field s h>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return s1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final void a(Context context, zzbbi zzbbi1)
	{
		Object obj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object a>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		xb xb1;
		Context context1;
		if(e)
			break MISSING_BLOCK_LABEL_191;
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field boolean e>
	//    7   13:ifne            191
		f = context.getApplicationContext();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #141 <Method Context Context.getApplicationContext()>
	//   11   21:putfield        #83  <Field Context f>
		g = zzbbi1;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #131 <Field zzbbi g>
		aw.h().a(((bqo) (d)));
	//   15   29:invokestatic    #146 <Method bql aw.h()>
	//   16   32:aload_0         
	//   17   33:getfield        #57  <Field wr d>
	//   18   36:invokevirtual   #151 <Method void bql.a(bqo)>
		xb1 = c;
	//   19   39:aload_0         
	//   20   40:getfield        #45  <Field xb c>
	//   21   43:astore          5
		context1 = f;
	//   22   45:aload_0         
	//   23   46:getfield        #83  <Field Context f>
	//   24   49:astore          6
		Object obj = null;
	//   25   51:aconst_null     
	//   26   52:astore_3        
		xb1.a(context1, ((String) (null)), true);
	//   27   53:aload           5
	//   28   55:aload           6
	//   29   57:aconst_null     
	//   30   58:iconst_1        
	//   31   59:invokevirtual   #154 <Method void xb.a(Context, String, boolean)>
		qf.a(f, g);
	//   32   62:aload_0         
	//   33   63:getfield        #83  <Field Context f>
	//   34   66:aload_0         
	//   35   67:getfield        #131 <Field zzbbi g>
	//   36   70:invokestatic    #159 <Method qj qf.a(Context, zzbbi)>
	//   37   73:pop             
		j = aw.e().b(context, zzbbi1.a);
	//   38   74:aload_0         
	//   39   75:invokestatic    #162 <Method xg aw.e()>
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:getfield        #166 <Field String zzbbi.a>
	//   43   83:invokevirtual   #171 <Method String com.google.android.gms.internal.ads.xg.b(Context, String)>
	//   44   86:putfield        #173 <Field String j>
		b = new bow(context.getApplicationContext(), g);
	//   45   89:aload_0         
	//   46   90:new             #175 <Class bow>
	//   47   93:dup             
	//   48   94:aload_1         
	//   49   95:invokevirtual   #141 <Method Context Context.getApplicationContext()>
	//   50   98:aload_0         
	//   51   99:getfield        #131 <Field zzbbi g>
	//   52  102:invokespecial   #177 <Method void bow(Context, zzbbi)>
	//   53  105:putfield        #179 <Field bow b>
		aw.n();
	//   54  108:invokestatic    #182 <Method u aw.n()>
	//   55  111:pop             
		context = ((Context) (p.K));
	//   56  112:getstatic       #188 <Field e p.K>
	//   57  115:astore_1        
		if(((Boolean)bwk.e().a(((e) (context)))).booleanValue())
			break MISSING_BLOCK_LABEL_142;
	//   58  116:invokestatic    #191 <Method m bwk.e()>
	//   59  119:aload_1         
	//   60  120:invokevirtual   #196 <Method Object m.a(e)>
	//   61  123:checkcast       #198 <Class Boolean>
	//   62  126:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//   63  129:ifne            142
		wx.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
	//   64  132:ldc1            #204 <String "CsiReporterFactory: CSI is not enabled. No CSI reporter created.">
	//   65  134:invokestatic    #209 <Method void wx.a(String)>
		context = ((Context) (obj));
	//   66  137:aload_3         
	//   67  138:astore_1        
		break MISSING_BLOCK_LABEL_150;
	//   68  139:goto            150
		context = ((Context) (new s()));
	//   69  142:new             #211 <Class s>
	//   70  145:dup             
	//   71  146:invokespecial   #212 <Method void s()>
	//   72  149:astore_1        
		h = ((s) (context));
	//   73  150:aload_0         
	//   74  151:aload_1         
	//   75  152:putfield        #61  <Field s h>
		if(h != null)
	//*  76  155:aload_0         
	//*  77  156:getfield        #61  <Field s h>
	//*  78  159:ifnull          181
			aaq.a((abe)((wt) (new wk(this))).c(), "AppState.registerCsiReporter");
	//   79  162:new             #214 <Class wk>
	//   80  165:dup             
	//   81  166:aload_0         
	//   82  167:invokespecial   #217 <Method void wk(wi)>
	//   83  170:invokevirtual   #222 <Method Object com.google.android.gms.internal.ads.wt.c()>
	//   84  173:checkcast       #224 <Class abe>
	//   85  176:ldc1            #226 <String "AppState.registerCsiReporter">
	//   86  178:invokestatic    #231 <Method void aaq.a(abe, String)>
		e = true;
	//   87  181:aload_0         
	//   88  182:iconst_1        
	//   89  183:putfield        #59  <Field boolean e>
		m();
	//   90  186:aload_0         
	//   91  187:invokevirtual   #234 <Method abe m()>
	//   92  190:pop             
		obj1;
	//   93  191:aload           4
		JVM INSTR monitorexit ;
	//   94  193:monitorexit     
		return;
	//   95  194:return          
		context;
	//   96  195:astore_1        
		obj1;
	//   97  196:aload           4
		JVM INSTR monitorexit ;
	//   98  198:monitorexit     
		throw context;
	//   99  199:aload_1         
	//  100  200:athrow          
	}

	public final void a(Boolean boolean1)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = boolean1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #63  <Field Boolean i>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		boolean1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw boolean1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void a(Throwable throwable, String s1)
	{
		qf.a(f, g).a(throwable, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context f>
	//    2    4:aload_0         
	//    3    5:getfield        #131 <Field zzbbi g>
	//    4    8:invokestatic    #159 <Method qj qf.a(Context, zzbbi)>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #240 <Method void qj.a(Throwable, String)>
	//    8   18:return          
	}

	public final void a(boolean flag)
	{
		l.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field wl l>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #243 <Method void wl.a(boolean)>
	//    4    8:return          
	}

	public final Boolean b()
	{
		Boolean boolean1;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			boolean1 = i;
	//    5    7:aload_0         
	//    6    8:getfield        #63  <Field Boolean i>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return boolean1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final void b(Throwable throwable, String s1)
	{
		qj qj1 = qf.a(f, g);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context f>
	//    2    4:aload_0         
	//    3    5:getfield        #131 <Field zzbbi g>
	//    4    8:invokestatic    #159 <Method qj qf.a(Context, zzbbi)>
	//    5   11:astore_3        
		e e1 = p.g;
	//    6   12:getstatic       #246 <Field e p.g>
	//    7   15:astore          4
		qj1.a(throwable, s1, ((Float)bwk.e().a(e1)).floatValue());
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokestatic    #191 <Method m bwk.e()>
	//   12   23:aload           4
	//   13   25:invokevirtual   #196 <Method Object m.a(e)>
	//   14   28:checkcast       #248 <Class Float>
	//   15   31:invokevirtual   #252 <Method float Float.floatValue()>
	//   16   34:invokeinterface #255 <Method void qj.a(Throwable, String, float)>
	//   17   39:return          
	}

	public final boolean c()
	{
		return l.a();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field wl l>
	//    2    4:invokevirtual   #257 <Method boolean wl.a()>
	//    3    7:ireturn         
	}

	public final boolean d()
	{
		return l.b();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field wl l>
	//    2    4:invokevirtual   #259 <Method boolean com.google.android.gms.internal.ads.wl.b()>
	//    3    7:ireturn         
	}

	public final void e()
	{
		l.c();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field wl l>
	//    2    4:invokevirtual   #261 <Method void com.google.android.gms.internal.ads.wl.c()>
	//    3    7:return          
	}

	public final bow f()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field bow b>
	//    2    4:areturn         
	}

	public final Resources g()
	{
		if(g.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field zzbbi g>
	//*   2    4:getfield        #267 <Field boolean zzbbi.d>
	//*   3    7:ifeq            18
			return f.getResources();
	//    4   10:aload_0         
	//    5   11:getfield        #83  <Field Context f>
	//    6   14:invokevirtual   #270 <Method Resources Context.getResources()>
	//    7   17:areturn         
		try
		{
			aah.a(f).getResources();
	//    8   18:aload_0         
	//    9   19:getfield        #83  <Field Context f>
	//   10   22:invokestatic    #275 <Method Context aah.a(Context)>
	//   11   25:invokevirtual   #270 <Method Resources Context.getResources()>
	//   12   28:pop             
		}
	//*  13   29:aconst_null     
	//*  14   30:areturn         
		catch(aaj aaj1)
	//*  15   31:astore_1        
		{
			com.google.android.gms.internal.ads.wx.c("Cannot load resource from dynamite apk or local jar", ((Throwable) (aaj1)));
	//   16   32:ldc2            #277 <String "Cannot load resource from dynamite apk or local jar">
	//   17   35:aload_1         
	//   18   36:invokestatic    #280 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		}
		return null;
	}

	public final void h()
	{
		k.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AtomicInteger k>
	//    2    4:invokevirtual   #284 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
	//    4    8:return          
	}

	public final void i()
	{
		k.decrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AtomicInteger k>
	//    2    4:invokevirtual   #287 <Method int AtomicInteger.decrementAndGet()>
	//    3    7:pop             
	//    4    8:return          
	}

	public final int j()
	{
		return k.get();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AtomicInteger k>
	//    2    4:invokevirtual   #290 <Method int AtomicInteger.get()>
	//    3    7:ireturn         
	}

	public final xa k()
	{
		xb xb1;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			xb1 = c;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field xb c>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return ((xa) (xb1));
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final Context l()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context f>
	//    2    4:areturn         
	}

	public final abe m()
	{
label0:
		{
			if(!com.google.android.gms.common.util.o.c() || f == null)
				break MISSING_BLOCK_LABEL_85;
	//    0    0:invokestatic    #296 <Method boolean o.c()>
	//    1    3:ifeq            85
	//    2    6:aload_0         
	//    3    7:getfield        #83  <Field Context f>
	//    4   10:ifnull          85
			e e1 = p.bj;
	//    5   13:getstatic       #299 <Field e p.bj>
	//    6   16:astore_1        
			if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   7   17:invokestatic    #191 <Method m bwk.e()>
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #196 <Method Object m.a(e)>
	//*  10   24:checkcast       #198 <Class Boolean>
	//*  11   27:invokevirtual   #202 <Method boolean Boolean.booleanValue()>
	//*  12   30:ifeq            36
				break MISSING_BLOCK_LABEL_85;
	//   13   33:goto            85
			abe abe1;
			synchronized(m)
	//*  14   36:aload_0         
	//*  15   37:getfield        #79  <Field Object m>
	//*  16   40:astore_1        
	//*  17   41:aload_1         
	//*  18   42:monitorenter    
			{
				if(n == null)
					break label0;
	//   19   43:aload_0         
	//   20   44:getfield        #301 <Field abe n>
	//   21   47:ifnull          59
				abe1 = n;
	//   22   50:aload_0         
	//   23   51:getfield        #301 <Field abe n>
	//   24   54:astore_2        
			}
	//   25   55:aload_1         
	//   26   56:monitorexit     
			return abe1;
	//   27   57:aload_2         
	//   28   58:areturn         
		}
		abe abe2;
		abe2 = xe.a(((java.util.concurrent.Callable) (new wj(this))));
	//   29   59:new             #303 <Class wj>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #304 <Method void wj(wi)>
	//   33   67:invokestatic    #309 <Method abe xe.a(java.util.concurrent.Callable)>
	//   34   70:astore_2        
		n = abe2;
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:putfield        #301 <Field abe n>
		obj;
	//   38   76:aload_1         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		return abe2;
	//   40   78:aload_2         
	//   41   79:areturn         
		exception;
	//   42   80:astore_2        
		obj;
	//   43   81:aload_1         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw exception;
	//   45   83:aload_2         
	//   46   84:athrow          
		return ((abe) (aas.a(((Object) (new ArrayList())))));
	//   47   85:new             #91  <Class ArrayList>
	//   48   88:dup             
	//   49   89:invokespecial   #92  <Method void ArrayList()>
	//   50   92:invokestatic    #314 <Method abd aas.a(Object)>
	//   51   95:areturn         
	}

	public final wr n()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field wr d>
	//    2    4:areturn         
	}

	final ArrayList o()
	{
		return a(tk.a(f));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context f>
	//    2    4:invokestatic    #320 <Method Context tk.a(Context)>
	//    3    7:invokestatic    #322 <Method ArrayList a(Context)>
	//    4   10:areturn         
	}

	private final Object a = new Object();
	private bow b;
	private final xb c = new xb();
	private final wr d;
	private boolean e;
	private Context f;
	private zzbbi g;
	private s h;
	private Boolean i;
	private String j;
	private final AtomicInteger k = new AtomicInteger(0);
	private final wl l = new wl(((wk) (null)));
	private final Object m = new Object();
	private abe n;
}
