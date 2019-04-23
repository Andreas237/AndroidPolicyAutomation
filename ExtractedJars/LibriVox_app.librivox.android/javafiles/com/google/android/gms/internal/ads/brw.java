// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.aw;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brp, brx, bry, bsc, 
//			zh, zzty

public final class brw
{

	brw(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object d>
		c = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field Context c>
	//   10   20:return          
	}

	private final void a()
	{
label0:
		{
			synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(a != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field brp a>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		a.g();
	//   11   17:aload_0         
	//   12   18:getfield        #28  <Field brp a>
	//   13   21:invokevirtual   #33  <Method void brp.g()>
		a = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #28  <Field brp a>
		Binder.flushPendingCommands();
	//   17   29:invokestatic    #38  <Method void Binder.flushPendingCommands()>
		obj;
	//   18   32:aload_1         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
		exception;
	//   21   35:astore_2        
		obj;
	//   22   36:aload_1         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		throw exception;
	//   24   38:aload_2         
	//   25   39:athrow          
	}

	static void a(brw brw1)
	{
		brw1.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void a()>
	//    2    4:return          
	}

	static boolean a(brw brw1, boolean flag)
	{
		brw1.b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #44  <Field boolean b>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static Object b(brw brw1)
	{
		return brw1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object d>
	//    2    4:areturn         
	}

	static boolean c(brw brw1)
	{
		return brw1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean b>
	//    2    4:ireturn         
	}

	static brp d(brw brw1)
	{
		return brw1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field brp a>
	//    2    4:areturn         
	}

	final Future a(zzty zzty)
	{
		brx brx1 = new brx(this);
	//    0    0:new             #50  <Class brx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method void brx(brw)>
	//    4    8:astore_2        
		bry bry1 = new bry(this, zzty, ((abo) (brx1)));
	//    5    9:new             #54  <Class bry>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #57  <Method void bry(brw, zzty, abo)>
	//   11   19:astore_3        
		bsc bsc1 = new bsc(this, ((abo) (brx1)));
	//   12   20:new             #59  <Class bsc>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #62  <Method void bsc(brw, abo)>
	//   17   29:astore          4
		synchronized(d)
	//*  18   31:aload_0         
	//*  19   32:getfield        #23  <Field Object d>
	//*  20   35:astore_1        
	//*  21   36:aload_1         
	//*  22   37:monitorenter    
		{
			a = new brp(c, aw.u().a(), ((com.google.android.gms.common.internal.d) (bry1)), ((com.google.android.gms.common.internal.e) (bsc1)));
	//   23   38:aload_0         
	//   24   39:new             #30  <Class brp>
	//   25   42:dup             
	//   26   43:aload_0         
	//   27   44:getfield        #25  <Field Context c>
	//   28   47:invokestatic    #68  <Method zh aw.u()>
	//   29   50:invokevirtual   #73  <Method android.os.Looper zh.a()>
	//   30   53:aload_3         
	//   31   54:aload           4
	//   32   56:invokespecial   #76  <Method void brp(Context, android.os.Looper, com.google.android.gms.common.internal.d, com.google.android.gms.common.internal.e)>
	//   33   59:putfield        #28  <Field brp a>
			a.q();
	//   34   62:aload_0         
	//   35   63:getfield        #28  <Field brp a>
	//   36   66:invokevirtual   #79  <Method void brp.q()>
		}
	//   37   69:aload_1         
	//   38   70:monitorexit     
		return ((Future) (brx1));
	//   39   71:aload_2         
	//   40   72:areturn         
		exception;
	//   41   73:astore_2        
		zzty;
	//   42   74:aload_1         
		JVM INSTR monitorexit ;
	//   43   75:monitorexit     
		throw exception;
	//   44   76:aload_2         
	//   45   77:athrow          
	}

	private brp a;
	private boolean b;
	private final Context c;
	private final Object d = new Object();
}
