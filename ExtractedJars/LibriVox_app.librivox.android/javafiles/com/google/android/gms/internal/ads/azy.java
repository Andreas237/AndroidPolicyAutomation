// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			azx, p, bwk, m, 
//			bsm, bav

final class azy
	implements Runnable
{

	azy(azx azx1)
	{
		a = azx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field azx a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
label0:
		{
			if(a.b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field azx a>
	//*   2    4:getfield        #25  <Field Boolean azx.b>
	//*   3    7:ifnull          11
				return;
	//    4   10:return          
			synchronized(azx.b())
	//*   5   11:invokestatic    #28  <Method ConditionVariable azx.b()>
	//*   6   14:astore_3        
	//*   7   15:aload_3         
	//*   8   16:monitorenter    
			{
				if(a.b == null)
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #12  <Field azx a>
	//   11   21:getfield        #25  <Field Boolean azx.b>
	//   12   24:ifnull          30
			}
	//   13   27:aload_3         
	//   14   28:monitorexit     
			return;
	//   15   29:return          
		}
		boolean flag1;
		e e = p.bd;
	//   16   30:getstatic       #34  <Field e p.bd>
	//   17   33:astore          4
		flag1 = ((Boolean)bwk.e().a(e)).booleanValue();
	//   18   35:invokestatic    #40  <Method m bwk.e()>
	//   19   38:aload           4
	//   20   40:invokevirtual   #45  <Method Object m.a(e)>
	//   21   43:checkcast       #47  <Class Boolean>
	//   22   46:invokevirtual   #51  <Method boolean Boolean.booleanValue()>
	//   23   49:istore_2        
		boolean flag = flag1;
	//   24   50:iload_2         
	//   25   51:istore_1        
		if(!flag1) goto _L2; else goto _L1
	//   26   52:iload_2         
	//   27   53:ifeq            86
_L1:
		azx.a = new bsm(azx.a(a).a, "ADSHIELD", ((String) (null)));
	//   28   56:new             #53  <Class bsm>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:getfield        #12  <Field azx a>
	//   32   64:invokestatic    #56  <Method bav azx.a(azx)>
	//   33   67:getfield        #61  <Field android.content.Context bav.a>
	//   34   70:ldc1            #63  <String "ADSHIELD">
	//   35   72:aconst_null     
	//   36   73:invokespecial   #66  <Method void bsm(android.content.Context, String, String)>
	//   37   76:putstatic       #69  <Field bsm azx.a>
		flag = flag1;
	//   38   79:iload_2         
	//   39   80:istore_1        
		  goto _L2
	//*  40   81:goto            86
_L4:
		flag = false;
	//   41   84:iconst_0        
	//   42   85:istore_1        
_L2:
		a.b = Boolean.valueOf(flag);
	//   43   86:aload_0         
	//   44   87:getfield        #12  <Field azx a>
	//   45   90:iload_1         
	//   46   91:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   47   94:putfield        #25  <Field Boolean azx.b>
		azx.b().open();
	//   48   97:invokestatic    #28  <Method ConditionVariable azx.b()>
	//   49  100:invokevirtual   #78  <Method void ConditionVariable.open()>
		conditionvariable;
	//   50  103:aload_3         
		JVM INSTR monitorexit ;
	//   51  104:monitorexit     
		return;
	//   52  105:return          
		exception;
	//   53  106:astore          4
		conditionvariable;
	//   54  108:aload_3         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		throw exception;
	//   56  110:aload           4
	//   57  112:athrow          
		Throwable throwable;
		throwable;
	//   58  113:astore          4
		if(true) goto _L4; else goto _L3
	//   59  115:goto            84
_L3:
	}

	private final azx a;
}
