// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brj, brp, wx

final class brm
	implements d
{

	brm(brj brj1)
	{
		a = brj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field brj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(int i)
	{
		synchronized(brj.c(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field brj a>
	//*   2    4:invokestatic    #23  <Method Object brj.c(brj)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
		{
			brj.a(a, ((brt) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field brj a>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #26  <Method brt brj.a(brj, brt)>
	//   10   18:pop             
			brj.c(a).notifyAll();
	//   11   19:aload_0         
	//   12   20:getfield        #12  <Field brj a>
	//   13   23:invokestatic    #23  <Method Object brj.c(brj)>
	//   14   26:invokevirtual   #29  <Method void Object.notifyAll()>
		}
	//   15   29:aload_2         
	//   16   30:monitorexit     
		return;
	//   17   31:return          
		exception;
	//   18   32:astore_3        
		obj;
	//   19   33:aload_2         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw exception;
	//   21   35:aload_3         
	//   22   36:athrow          
	}

	public final void a(Bundle bundle)
	{
		bundle = ((Bundle) (brj.c(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field brj a>
	//    2    4:invokestatic    #23  <Method Object brj.c(brj)>
	//    3    7:astore_1        
		bundle;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		Object obj;
		try
		{
			if(com.google.android.gms.internal.ads.brj.d(a) != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #12  <Field brj a>
	//*   8   14:invokestatic    #36  <Method brp com.google.android.gms.internal.ads.brj.d(brj)>
	//*   9   17:ifnull          59
				brj.a(a, com.google.android.gms.internal.ads.brj.d(a).e());
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field brj a>
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field brj a>
	//   14   28:invokestatic    #36  <Method brp com.google.android.gms.internal.ads.brj.d(brj)>
	//   15   31:invokevirtual   #42  <Method brt brp.e()>
	//   16   34:invokestatic    #26  <Method brt brj.a(brj, brt)>
	//   17   37:pop             
			break MISSING_BLOCK_LABEL_59;
	//   18   38:goto            59
		}
	//*  19   41:astore_2        
	//*  20   42:goto            72
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   21   45:astore_2        
		break MISSING_BLOCK_LABEL_46;
		obj;
		break MISSING_BLOCK_LABEL_72;
		wx.b("Unable to obtain a cache service instance.", ((Throwable) (obj)));
	//   22   46:ldc1            #44  <String "Unable to obtain a cache service instance.">
	//   23   48:aload_2         
	//   24   49:invokestatic    #50  <Method void wx.b(String, Throwable)>
		brj.a(a);
	//   25   52:aload_0         
	//   26   53:getfield        #12  <Field brj a>
	//   27   56:invokestatic    #52  <Method void brj.a(brj)>
		brj.c(a).notifyAll();
	//   28   59:aload_0         
	//   29   60:getfield        #12  <Field brj a>
	//   30   63:invokestatic    #23  <Method Object brj.c(brj)>
	//   31   66:invokevirtual   #29  <Method void Object.notifyAll()>
		bundle;
	//   32   69:aload_1         
		JVM INSTR monitorexit ;
	//   33   70:monitorexit     
		return;
	//   34   71:return          
		bundle;
	//   35   72:aload_1         
		JVM INSTR monitorexit ;
	//   36   73:monitorexit     
		throw obj;
	//   37   74:aload_2         
	//   38   75:athrow          
	}

	private final brj a;
}
