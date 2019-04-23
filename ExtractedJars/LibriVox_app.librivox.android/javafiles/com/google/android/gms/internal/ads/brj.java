// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brk, brm, brn, brp, 
//			zh, zztv, brt, wx, 
//			p, bwk, m, xg, 
//			brl, bql, zzty

public final class brj
{

	public brj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class brk>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #27  <Method void brk(brj)>
	//    7   13:putfield        #29  <Field Runnable a>
	//    8   16:aload_0         
	//    9   17:new             #4   <Class Object>
	//   10   20:dup             
	//   11   21:invokespecial   #22  <Method void Object()>
	//   12   24:putfield        #31  <Field Object b>
	//   13   27:return          
	}

	static brp a(brj brj1, brp brp1)
	{
		brj1.c = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #35  <Field brp c>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static brt a(brj brj1, brt brt1)
	{
		brj1.e = brt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field brt e>
		return brt1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(brj brj1)
	{
		brj1.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void c()>
	//    2    4:return          
	}

	private final void b()
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object b>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(d == null || c != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #42  <Field Context d>
	//*   7   11:ifnull          75
	//*   8   14:aload_0         
	//*   9   15:getfield        #35  <Field brp c>
	//*  10   18:ifnull          24
			break MISSING_BLOCK_LABEL_75;
	//   11   21:goto            75
		brm brm1 = new brm(this);
	//   12   24:new             #44  <Class brm>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #45  <Method void brm(brj)>
	//   16   32:astore_2        
		brn brn1 = new brn(this);
	//   17   33:new             #47  <Class brn>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #48  <Method void brn(brj)>
	//   21   41:astore_3        
		c = new brp(d, aw.u().a(), ((com.google.android.gms.common.internal.d) (brm1)), ((com.google.android.gms.common.internal.e) (brn1)));
	//   22   42:aload_0         
	//   23   43:new             #50  <Class brp>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #42  <Field Context d>
	//   27   51:invokestatic    #56  <Method zh aw.u()>
	//   28   54:invokevirtual   #61  <Method android.os.Looper zh.a()>
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokespecial   #64  <Method void brp(Context, android.os.Looper, com.google.android.gms.common.internal.d, com.google.android.gms.common.internal.e)>
	//   32   62:putfield        #35  <Field brp c>
		c.q();
	//   33   65:aload_0         
	//   34   66:getfield        #35  <Field brp c>
	//   35   69:invokevirtual   #67  <Method void brp.q()>
		obj;
	//   36   72:aload_1         
		JVM INSTR monitorexit ;
	//   37   73:monitorexit     
		return;
	//   38   74:return          
		obj;
	//   39   75:aload_1         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		return;
	//   41   77:return          
		Exception exception;
		exception;
	//   42   78:astore_2        
		obj;
	//   43   79:aload_1         
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		throw exception;
	//   45   81:aload_2         
	//   46   82:athrow          
	}

	static void b(brj brj1)
	{
		brj1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void b()>
	//    2    4:return          
	}

	static Object c(brj brj1)
	{
		return brj1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object b>
	//    2    4:areturn         
	}

	private final void c()
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(c != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field brp c>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(c.h() || c.i())
	//*  11   17:aload_0         
	//*  12   18:getfield        #35  <Field brp c>
	//*  13   21:invokevirtual   #74  <Method boolean brp.h()>
	//*  14   24:ifne            37
	//*  15   27:aload_0         
	//*  16   28:getfield        #35  <Field brp c>
	//*  17   31:invokevirtual   #77  <Method boolean brp.i()>
	//*  18   34:ifeq            44
			c.g();
	//   19   37:aload_0         
	//   20   38:getfield        #35  <Field brp c>
	//   21   41:invokevirtual   #80  <Method void brp.g()>
		c = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #35  <Field brp c>
		e = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #38  <Field brt e>
		Binder.flushPendingCommands();
	//   28   54:invokestatic    #85  <Method void Binder.flushPendingCommands()>
		obj;
	//   29   57:aload_1         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		return;
	//   31   59:return          
		exception;
	//   32   60:astore_2        
		obj;
	//   33   61:aload_1         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		throw exception;
	//   35   63:aload_2         
	//   36   64:athrow          
	}

	static brp d(brj brj1)
	{
		return brj1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field brp c>
	//    2    4:areturn         
	}

	public final zztv a(zzty zzty)
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field brt e>
	//    7   11:ifnonnull       26
				zzty = ((zzty) (new zztv()));
	//    8   14:new             #91  <Class zztv>
	//    9   17:dup             
	//   10   18:invokespecial   #92  <Method void zztv()>
	//   11   21:astore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return ((zztv) (zzty));
	//   14   24:aload_1         
	//   15   25:areturn         
		}
		zzty = ((zzty) (e.a(zzty)));
	//   16   26:aload_0         
	//   17   27:getfield        #38  <Field brt e>
	//   18   30:aload_1         
	//   19   31:invokeinterface #96  <Method zztv brt.a(zzty)>
	//   20   36:astore_1        
		obj;
	//   21   37:aload_2         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return ((zztv) (zzty));
	//   23   39:aload_1         
	//   24   40:areturn         
		zzty;
	//   25   41:astore_1        
		wx.b("Unable to call into cache service.", ((Throwable) (zzty)));
	//   26   42:ldc1            #98  <String "Unable to call into cache service.">
	//   27   44:aload_1         
	//   28   45:invokestatic    #103 <Method void wx.b(String, Throwable)>
		zzty = ((zzty) (new zztv()));
	//   29   48:new             #91  <Class zztv>
	//   30   51:dup             
	//   31   52:invokespecial   #92  <Method void zztv()>
	//   32   55:astore_1        
		obj;
	//   33   56:aload_2         
		JVM INSTR monitorexit ;
	//   34   57:monitorexit     
		return ((zztv) (zzty));
	//   35   58:aload_1         
	//   36   59:areturn         
		zzty;
	//   37   60:astore_1        
		obj;
	//   38   61:aload_2         
		JVM INSTR monitorexit ;
	//   39   62:monitorexit     
		throw zzty;
	//   40   63:aload_1         
	//   41   64:athrow          
	}

	public final void a()
	{
		e e1 = p.bX;
	//    0    0:getstatic       #109 <Field e p.bX>
	//    1    3:astore_1        
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #114 <Method m bwk.e()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #119 <Method Object m.a(e)>
	//*   5   11:checkcast       #121 <Class Boolean>
	//*   6   14:invokevirtual   #124 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            91
		{
			synchronized(b)
	//*   8   20:aload_0         
	//*   9   21:getfield        #31  <Field Object b>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:monitorenter    
			{
				b();
	//   13   27:aload_0         
	//   14   28:invokespecial   #69  <Method void b()>
				aw.e();
	//   15   31:invokestatic    #127 <Method xg aw.e()>
	//   16   34:pop             
				xg.a.removeCallbacks(a);
	//   17   35:getstatic       #132 <Field Handler xg.a>
	//   18   38:aload_0         
	//   19   39:getfield        #29  <Field Runnable a>
	//   20   42:invokevirtual   #138 <Method void Handler.removeCallbacks(Runnable)>
				aw.e();
	//   21   45:invokestatic    #127 <Method xg aw.e()>
	//   22   48:pop             
				Handler handler = xg.a;
	//   23   49:getstatic       #132 <Field Handler xg.a>
	//   24   52:astore_2        
				Runnable runnable = a;
	//   25   53:aload_0         
	//   26   54:getfield        #29  <Field Runnable a>
	//   27   57:astore_3        
				e e2 = p.bY;
	//   28   58:getstatic       #141 <Field e p.bY>
	//   29   61:astore          4
				handler.postDelayed(runnable, ((Long)bwk.e().a(e2)).longValue());
	//   30   63:aload_2         
	//   31   64:aload_3         
	//   32   65:invokestatic    #114 <Method m bwk.e()>
	//   33   68:aload           4
	//   34   70:invokevirtual   #119 <Method Object m.a(e)>
	//   35   73:checkcast       #143 <Class Long>
	//   36   76:invokevirtual   #147 <Method long Long.longValue()>
	//   37   79:invokevirtual   #151 <Method boolean Handler.postDelayed(Runnable, long)>
	//   38   82:pop             
			}
	//   39   83:aload_1         
	//   40   84:monitorexit     
			return;
	//   41   85:return          
		} else
	//*  42   86:astore_2        
	//*  43   87:aload_1         
	//*  44   88:monitorexit     
	//*  45   89:aload_2         
	//*  46   90:athrow          
		{
			return;
	//   47   91:return          
		}
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public final void a(Context context)
	{
label0:
		{
			if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
				return;
	//    2    4:return          
			synchronized(b)
	//*   3    5:aload_0         
	//*   4    6:getfield        #31  <Field Object b>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
			{
				if(d == null)
					break label0;
	//    8   12:aload_0         
	//    9   13:getfield        #42  <Field Context d>
	//   10   16:ifnull          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		d = context.getApplicationContext();
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #158 <Method Context Context.getApplicationContext()>
	//   17   27:putfield        #42  <Field Context d>
		context = ((Context) (p.bW));
	//   18   30:getstatic       #161 <Field e p.bW>
	//   19   33:astore_1        
		if(((Boolean)bwk.e().a(((e) (context)))).booleanValue())
	//*  20   34:invokestatic    #114 <Method m bwk.e()>
	//*  21   37:aload_1         
	//*  22   38:invokevirtual   #119 <Method Object m.a(e)>
	//*  23   41:checkcast       #121 <Class Boolean>
	//*  24   44:invokevirtual   #124 <Method boolean Boolean.booleanValue()>
	//*  25   47:ifeq            57
		{
			b();
	//   26   50:aload_0         
	//   27   51:invokespecial   #69  <Method void b()>
			break MISSING_BLOCK_LABEL_93;
	//   28   54:goto            93
		}
		context = ((Context) (p.bV));
	//   29   57:getstatic       #164 <Field e p.bV>
	//   30   60:astore_1        
		if(((Boolean)bwk.e().a(((e) (context)))).booleanValue())
	//*  31   61:invokestatic    #114 <Method m bwk.e()>
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #119 <Method Object m.a(e)>
	//*  34   68:checkcast       #121 <Class Boolean>
	//*  35   71:invokevirtual   #124 <Method boolean Boolean.booleanValue()>
	//*  36   74:ifeq            93
		{
			context = ((Context) (new brl(this)));
	//   37   77:new             #166 <Class brl>
	//   38   80:dup             
	//   39   81:aload_0         
	//   40   82:invokespecial   #167 <Method void brl(brj)>
	//   41   85:astore_1        
			aw.h().a(((bqo) (context)));
	//   42   86:invokestatic    #170 <Method bql aw.h()>
	//   43   89:aload_1         
	//   44   90:invokevirtual   #175 <Method void bql.a(bqo)>
		}
		obj;
	//   45   93:aload_2         
		JVM INSTR monitorexit ;
	//   46   94:monitorexit     
		return;
	//   47   95:return          
		context;
	//   48   96:astore_1        
		obj;
	//   49   97:aload_2         
		JVM INSTR monitorexit ;
	//   50   98:monitorexit     
		throw context;
	//   51   99:aload_1         
	//   52  100:athrow          
	}

	private final Runnable a = new brk(this);
	private final Object b = new Object();
	private brp c;
	private Context d;
	private brt e;
}
