// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, r, wi, zzbbi, 
//			u, wx

final class wk extends wt
{

	wk(wi wi1)
	{
		a = wi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field wi a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void wt()>
	//    5    9:return          
	}

	public final void a()
	{
		r r1 = new r(wi.a(a), wi.b(a).a);
	//    0    0:new             #18  <Class r>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field wi a>
	//    4    8:invokestatic    #23  <Method android.content.Context wi.a(wi)>
	//    5   11:aload_0         
	//    6   12:getfield        #10  <Field wi a>
	//    7   15:invokestatic    #27  <Method zzbbi wi.b(wi)>
	//    8   18:getfield        #32  <Field String zzbbi.a>
	//    9   21:invokespecial   #35  <Method void r(android.content.Context, String)>
	//   10   24:astore_2        
		Object obj = wi.c(a);
	//   11   25:aload_0         
	//   12   26:getfield        #10  <Field wi a>
	//   13   29:invokestatic    #39  <Method Object wi.c(wi)>
	//   14   32:astore_1        
		obj;
	//   15   33:aload_1         
		JVM INSTR monitorenter ;
	//   16   34:monitorenter    
		Object obj1;
		try
		{
			aw.n();
	//   17   35:invokestatic    #45  <Method u aw.n()>
	//   18   38:pop             
			u.a(wi.d(a), r1);
	//   19   39:aload_0         
	//   20   40:getfield        #10  <Field wi a>
	//   21   43:invokestatic    #49  <Method s wi.d(wi)>
	//   22   46:aload_2         
	//   23   47:invokestatic    #54  <Method void u.a(s, r)>
			break MISSING_BLOCK_LABEL_64;
	//   24   50:goto            64
		}
	//*  25   53:astore_2        
	//*  26   54:goto            67
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//   27   57:astore_2        
		break MISSING_BLOCK_LABEL_58;
		obj1;
		break MISSING_BLOCK_LABEL_67;
		wx.c("Cannot config CSI reporter.", ((Throwable) (obj1)));
	//   28   58:ldc1            #56  <String "Cannot config CSI reporter.">
	//   29   60:aload_2         
	//   30   61:invokestatic    #61  <Method void wx.c(String, Throwable)>
		obj;
	//   31   64:aload_1         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return;
	//   33   66:return          
		obj;
	//   34   67:aload_1         
		JVM INSTR monitorexit ;
	//   35   68:monitorexit     
		throw obj1;
	//   36   69:aload_2         
	//   37   70:athrow          
	}

	public final void b_()
	{
	//    0    0:return          
	}

	private final wi a;
}
