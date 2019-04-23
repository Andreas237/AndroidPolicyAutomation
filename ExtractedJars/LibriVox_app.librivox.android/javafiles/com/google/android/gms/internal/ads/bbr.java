// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awo, bav, awp, akh

public final class bbr
	implements Callable
{

	public bbr(bav bav1, akh akh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = bav1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field bav a>
		b = akh;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field akh b>
	//    8   14:return          
	}

	private final Void a()
	{
		akh akh1;
		if(a.l() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field bav a>
	//*   2    4:invokevirtual   #29  <Method Future bav.l()>
	//*   3    7:ifnull          23
			a.l().get();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field bav a>
	//    6   14:invokevirtual   #29  <Method Future bav.l()>
	//    7   17:invokeinterface #35  <Method Object Future.get()>
	//    8   22:pop             
		akh1 = a.k();
	//    9   23:aload_0         
	//   10   24:getfield        #17  <Field bav a>
	//   11   27:invokevirtual   #39  <Method akh bav.k()>
	//   12   30:astore_2        
		if(akh1 == null)
			break MISSING_BLOCK_LABEL_64;
	//   13   31:aload_2         
	//   14   32:ifnull          64
		synchronized(b)
	//*  15   35:aload_0         
	//*  16   36:getfield        #19  <Field akh b>
	//*  17   39:astore_1        
	//*  18   40:aload_1         
	//*  19   41:monitorenter    
		{
			awp.a(((awp) (b)), awp.a(((awp) (akh1))));
	//   20   42:aload_0         
	//   21   43:getfield        #19  <Field akh b>
	//   22   46:aload_2         
	//   23   47:invokestatic    #44  <Method byte[] awp.a(awp)>
	//   24   50:invokestatic    #47  <Method awp awp.a(awp, byte[])>
	//   25   53:pop             
		}
	//   26   54:aload_1         
	//   27   55:monitorexit     
		break MISSING_BLOCK_LABEL_64;
	//   28   56:goto            64
		exception;
	//   29   59:astore_2        
		akh;
	//   30   60:aload_1         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		try
		{
			throw exception;
	//   32   62:aload_2         
	//   33   63:athrow          
		}
	//*  34   64:aconst_null     
	//*  35   65:areturn         
		catch(awo awo1) { }
	//   36   66:astore_1        
		return null;
	//*  37   67:goto            64
	}

	public final Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method Void a()>
	//    2    4:areturn         
	}

	private final bav a;
	private final akh b;
}
