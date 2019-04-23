// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.az;
import com.google.android.gms.ads.internal.bs;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tv, tm, zzwf, tk, 
//			p, bwk, m, wx, 
//			zzbbi, km, bxh, ts, 
//			ua, zzavh

public final class tl extends tv
{

	public tl(Context context, bs bs, km km, zzbbi zzbbi)
	{
		this(context, zzbbi, new tm(context, bs, com.google.android.gms.internal.ads.zzwf.a(), km, zzbbi));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:new             #20  <Class tm>
	//    4    7:dup             
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokestatic    #25  <Method zzwf com.google.android.gms.internal.ads.zzwf.a()>
	//    8   13:aload_3         
	//    9   14:aload           4
	//   10   16:invokespecial   #28  <Method void tm(Context, bs, zzwf, km, zzbbi)>
	//   11   19:invokespecial   #31  <Method void tl(Context, zzbbi, tm)>
	//   12   22:return          
	}

	private tl(Context context, zzbbi zzbbi, tm tm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void tv()>
		b = new Object();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void Object()>
	//    6   12:putfield        #40  <Field Object b>
		a = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #42  <Field Context a>
		c = zzbbi;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #44  <Field zzbbi c>
		d = tm1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #46  <Field tm d>
	//   16   30:return          
	}

	public final void a()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			d.J();
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:invokevirtual   #49  <Method void tm.J()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void a(com.google.android.gms.c.a a1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a instanceof tk)
	//*   2    2:aload_0         
	//*   3    3:getfield        #42  <Field Context a>
	//*   4    6:instanceof      #52  <Class tk>
	//*   5    9:ifeq            29
			((tk)a).a((Activity)com.google.android.gms.c.d.a(a1));
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field Context a>
	//    8   16:checkcast       #52  <Class tk>
	//    9   19:aload_1         
	//   10   20:invokestatic    #57  <Method Object d.a(com.google.android.gms.c.a)>
	//   11   23:checkcast       #59  <Class Activity>
	//   12   26:invokevirtual   #62  <Method void com.google.android.gms.internal.ads.tk.a(Activity)>
		a();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #64  <Method void a()>
		this;
	//   15   33:aload_0         
		JVM INSTR monitorexit ;
	//   16   34:monitorexit     
		return;
	//   17   35:return          
		a1;
	//   18   36:astore_1        
	//*  19   37:aload_0         
		throw a1;
	//   20   38:monitorexit     
	//   21   39:aload_1         
	//   22   40:athrow          
	}

	public final void a(bxh bxh)
	{
		e e1 = p.as;
	//    0    0:getstatic       #71  <Field e p.as>
	//    1    3:astore_2        
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #77  <Method m bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #82  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   5   11:checkcast       #84  <Class Boolean>
	//*   6   14:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            43
		{
			synchronized(b)
	//*   8   20:aload_0         
	//*   9   21:getfield        #40  <Field Object b>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:monitorenter    
			{
				((a) (d)).a(bxh);
	//   13   27:aload_0         
	//   14   28:getfield        #46  <Field tm d>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #92  <Method void a.a(bxh)>
			}
	//   17   35:aload_2         
	//   18   36:monitorexit     
			return;
	//   19   37:return          
		} else
	//*  20   38:astore_1        
	//*  21   39:aload_2         
	//*  22   40:monitorexit     
	//*  23   41:aload_1         
	//*  24   42:athrow          
		{
			return;
	//   25   43:return          
		}
		bxh;
		obj;
		JVM INSTR monitorexit ;
		throw bxh;
	}

	public final void a(ts ts)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((a) (d)).a(ts);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #95  <Method void a.a(ts)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		ts;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw ts;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void a(ua ua)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((a) (d)).a(ua);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #98  <Method void a.a(ua)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		ua;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw ua;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void a(zzavh zzavh)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			d.a(zzavh);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #101 <Method void com.google.android.gms.internal.ads.tm.a(zzavh)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zzavh;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw zzavh;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void a(String s)
	{
		Context context = a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Context a>
	//    2    4:astore_2        
		if(context instanceof tk)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #52  <Class tk>
	//*   5    9:ifeq            43
		{
			try
			{
				((tk)context).a(s);
	//    6   12:aload_2         
	//    7   13:checkcast       #52  <Class tk>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #106 <Method void com.google.android.gms.internal.ads.tk.a(String)>
				return;
	//   10   20:return          
			}
	//*  11   21:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   24:bipush          15
	//*  13   26:icmpgt          30
	//*  14   29:return          
	//*  15   30:new             #114 <Class RemoteException>
	//*  16   33:dup             
	//*  17   34:ldc1            #104 <Class android.content.pm.PackageManager$NameNotFoundException>
	//*  18   36:invokevirtual   #120 <Method String Class.getSimpleName()>
	//*  19   39:invokespecial   #122 <Method void RemoteException(String)>
	//*  20   42:athrow          
	//*  21   43:return          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   22   44:astore_1        
			if(android.os.Build.VERSION.SDK_INT <= 15)
				return;
			else
				throw new RemoteException(((Class) (android/content/pm/PackageManager$NameNotFoundException)).getSimpleName());
		} else
		{
			return;
		}
	//*  23   45:goto            21
	}

	public final void a(boolean flag)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((a) (d)).c(flag);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #125 <Method void a.c(boolean)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		exception;
	//   12   18:astore_3        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw exception;
	//   15   21:aload_3         
	//   16   22:athrow          
	}

	public final Bundle b()
	{
		e e1 = p.as;
	//    0    0:getstatic       #71  <Field e p.as>
	//    1    3:astore_1        
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #77  <Method m bwk.e()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #82  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   5   11:checkcast       #84  <Class Boolean>
	//*   6   14:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            44
		{
			Bundle bundle;
			synchronized(b)
	//*   8   20:aload_0         
	//*   9   21:getfield        #40  <Field Object b>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:monitorenter    
			{
				bundle = ((a) (d)).q();
	//   13   27:aload_0         
	//   14   28:getfield        #46  <Field tm d>
	//   15   31:invokevirtual   #129 <Method Bundle a.q()>
	//   16   34:astore_2        
			}
	//   17   35:aload_1         
	//   18   36:monitorexit     
			return bundle;
	//   19   37:aload_2         
	//   20   38:areturn         
		} else
	//*  21   39:astore_2        
	//*  22   40:aload_1         
	//*  23   41:monitorexit     
	//*  24   42:aload_2         
	//*  25   43:athrow          
		{
			return new Bundle();
	//   26   44:new             #131 <Class Bundle>
	//   27   47:dup             
	//   28   48:invokespecial   #132 <Method void Bundle()>
	//   29   51:areturn         
		}
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public final void b(com.google.android.gms.c.a a1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			((a) (d)).o();
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:invokevirtual   #135 <Method void a.o()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		a1;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void b(String s)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((a) (d)).a(s);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #136 <Method void a.a(String)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		s;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw s;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void c(com.google.android.gms.c.a a1)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object b>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(a1 == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
		{
			a1 = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
			break MISSING_BLOCK_LABEL_24;
	//    9   13:goto            24
		}
		a1 = ((com.google.android.gms.c.a) ((Context)com.google.android.gms.c.d.a(a1)));
	//   10   16:aload_1         
	//   11   17:invokestatic    #57  <Method Object d.a(com.google.android.gms.c.a)>
	//   12   20:checkcast       #140 <Class Context>
	//   13   23:astore_1        
		if(a1 == null)
			break MISSING_BLOCK_LABEL_50;
	//   14   24:aload_1         
	//   15   25:ifnull          50
		try
		{
			d.a(((Context) (a1)));
	//   16   28:aload_0         
	//   17   29:getfield        #46  <Field tm d>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #143 <Method void com.google.android.gms.internal.ads.tm.a(Context)>
			break MISSING_BLOCK_LABEL_50;
	//   20   36:goto            50
		}
	//*  21   39:astore_1        
	//*  22   40:goto            60
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.c.a a1) { }
	//   23   43:astore_1        
		break MISSING_BLOCK_LABEL_44;
		a1;
		break MISSING_BLOCK_LABEL_60;
		wx.c("Unable to extract updated context.", ((Throwable) (a1)));
	//   24   44:ldc1            #145 <String "Unable to extract updated context.">
	//   25   46:aload_1         
	//   26   47:invokestatic    #150 <Method void wx.c(String, Throwable)>
		((a) (d)).p();
	//   27   50:aload_0         
	//   28   51:getfield        #46  <Field tm d>
	//   29   54:invokevirtual   #153 <Method void a.p()>
		obj;
	//   30   57:aload_2         
		JVM INSTR monitorexit ;
	//   31   58:monitorexit     
		return;
	//   32   59:return          
		obj;
	//   33   60:aload_2         
		JVM INSTR monitorexit ;
	//   34   61:monitorexit     
		throw a1;
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	public final void c(String s)
	{
		e e1 = p.at;
	//    0    0:getstatic       #156 <Field e p.at>
	//    1    3:astore_2        
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    4:invokestatic    #77  <Method m bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #82  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   5   11:checkcast       #84  <Class Boolean>
	//*   6   14:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		synchronized(b)
	//*   9   21:aload_0         
	//*  10   22:getfield        #40  <Field Object b>
	//*  11   25:astore_2        
	//*  12   26:aload_2         
	//*  13   27:monitorenter    
		{
			((a) (d)).b(s);
	//   14   28:aload_0         
	//   15   29:getfield        #46  <Field tm d>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #158 <Method void a.b(String)>
		}
	//   18   36:aload_2         
	//   19   37:monitorexit     
		return;
	//   20   38:return          
		s;
	//   21   39:astore_1        
		obj;
	//   22   40:aload_2         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		throw s;
	//   24   42:aload_1         
	//   25   43:athrow          
	}

	public final boolean c()
	{
		boolean flag;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = d.K();
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:invokevirtual   #161 <Method boolean tm.K()>
	//    8   14:istore_1        
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return flag;
	//   11   17:iload_1         
	//   12   18:ireturn         
		exception;
	//   13   19:astore_3        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_3         
	//   17   23:athrow          
	}

	public final void d()
	{
		b(((com.google.android.gms.c.a) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #163 <Method void b(com.google.android.gms.c.a)>
	//    3    5:return          
	}

	public final void d(com.google.android.gms.c.a a1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			((a) (d)).j();
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:invokevirtual   #166 <Method void a.j()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		a1;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void e()
	{
		c(((com.google.android.gms.c.a) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #168 <Method void c(com.google.android.gms.c.a)>
	//    3    5:return          
	}

	public final void f()
	{
		d(((com.google.android.gms.c.a) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #171 <Method void d(com.google.android.gms.c.a)>
	//    3    5:return          
	}

	public final String g()
	{
		String s;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = ((az) (d)).a();
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field tm d>
	//    7   11:invokevirtual   #176 <Method String az.a()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return s;
	//   11   17:aload_2         
	//   12   18:areturn         
		exception;
	//   13   19:astore_2        
		obj;
	//   14   20:aload_1         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	private final Context a;
	private final Object b;
	private final zzbbi c;
	private final tm d;
}
