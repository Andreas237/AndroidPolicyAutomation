// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bsm, bcn, aag, bsp

public final class bsq
{

	private bsq(bsm bsm1, byte abyte0[])
	{
		d = bsm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field bsm d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		a = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field byte[] a>
	//    8   14:return          
	}

	bsq(bsm bsm1, byte abyte0[], bsp bsp)
	{
		this(bsm1, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void bsq(bsm, byte[])>
	//    4    6:return          
	}

	public final bsq a(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(d.b)
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field bsm d>
	//*   4    6:getfield        #34  <Field boolean bsm.b>
	//*   5    9:ifeq            85
		{
			d.a.a(a);
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field bsm d>
	//    8   16:getfield        #37  <Field bcn bsm.a>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field byte[] a>
	//   11   23:invokeinterface #42  <Method void bcn.a(byte[])>
			d.a.a(b);
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field bsm d>
	//   14   32:getfield        #37  <Field bcn bsm.a>
	//   15   35:aload_0         
	//   16   36:getfield        #27  <Field int b>
	//   17   39:invokeinterface #45  <Method void bcn.a(int)>
			d.a.b(c);
	//   18   44:aload_0         
	//   19   45:getfield        #15  <Field bsm d>
	//   20   48:getfield        #37  <Field bcn bsm.a>
	//   21   51:aload_0         
	//   22   52:getfield        #47  <Field int c>
	//   23   55:invokeinterface #49  <Method void bcn.b(int)>
			d.a.a(((int []) (null)));
	//   24   60:aload_0         
	//   25   61:getfield        #15  <Field bsm d>
	//   26   64:getfield        #37  <Field bcn bsm.a>
	//   27   67:aconst_null     
	//   28   68:invokeinterface #52  <Method void bcn.a(int[])>
			d.a.a();
	//   29   73:aload_0         
	//   30   74:getfield        #15  <Field bsm d>
	//   31   77:getfield        #37  <Field bcn bsm.a>
	//   32   80:invokeinterface #54  <Method void bcn.a()>
		}
		this;
	//   33   85:aload_0         
		JVM INSTR monitorexit ;
	//   34   86:monitorexit     
		return;
	//   35   87:return          
		Object obj;
		obj;
	//   36   88:astore_1        
		break MISSING_BLOCK_LABEL_103;
	//   37   89:goto            102
		obj;
	//   38   92:astore_1        
		aag.a("Clearcut log failed", ((Throwable) (obj)));
	//   39   93:ldc1            #56  <String "Clearcut log failed">
	//   40   95:aload_1         
	//   41   96:invokestatic    #61  <Method void aag.a(String, Throwable)>
		this;
	//   42   99:aload_0         
		JVM INSTR monitorexit ;
	//   43  100:monitorexit     
		return;
	//   44  101:return          
	//*  45  102:aload_0         
		throw obj;
	//   46  103:monitorexit     
	//   47  104:aload_1         
	//   48  105:athrow          
	}

	public final bsq b(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final byte a[];
	private int b;
	private int c;
	private final bsm d;
}
