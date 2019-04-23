// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			rc, yb, rm, rp, 
//			wx, wi, zzasm, rf, 
//			rg, abq, zzasi

public abstract class re
	implements rc, yb
{

	public re(abq abq1, rc rc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object c>
		a = abq1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #24  <Field abq a>
		b = rc1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #26  <Field rc b>
	//   13   25:return          
	}

	public abstract void a();

	public final void a(zzasm zzasm1)
	{
		synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			b.a(zzasm1);
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field rc b>
	//    7   11:aload_1         
	//    8   12:invokeinterface #30  <Method void rc.a(zzasm)>
			a();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #32  <Method void a()>
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		zzasm1;
	//   14   24:astore_1        
		obj;
	//   15   25:aload_2         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw zzasm1;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	final boolean a(rp rp1, zzasi zzasi)
	{
		try
		{
			rp1.a(zzasi, ((rs) (new rm(((rc) (this))))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:new             #37  <Class rm>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #40  <Method void rm(rc)>
	//    6   10:invokeinterface #45  <Method void rp.a(zzasi, rs)>
		}
	//*   7   15:iconst_1        
	//*   8   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(rp rp1)
	//*   9   17:astore_1        
		{
			wx.c("Could not fetch ad response from ad request service due to an Exception.", ((Throwable) (rp1)));
	//   10   18:ldc1            #47  <String "Could not fetch ad response from ad request service due to an Exception.">
	//   11   20:aload_1         
	//   12   21:invokestatic    #52  <Method void wx.c(String, Throwable)>
			aw.i().a(((Throwable) (rp1)), "AdRequestClientTask.getAdResponseFromService");
	//   13   24:invokestatic    #58  <Method wi aw.i()>
	//   14   27:aload_1         
	//   15   28:ldc1            #60  <String "AdRequestClientTask.getAdResponseFromService">
	//   16   30:invokevirtual   #65  <Method void wi.a(Throwable, String)>
			b.a(new zzasm(0));
	//   17   33:aload_0         
	//   18   34:getfield        #26  <Field rc b>
	//   19   37:new             #67  <Class zzasm>
	//   20   40:dup             
	//   21   41:iconst_0        
	//   22   42:invokespecial   #70  <Method void zzasm(int)>
	//   23   45:invokeinterface #30  <Method void rc.a(zzasm)>
			return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
		}
		return true;
	}

	public final void b()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method void a()>
	//    2    4:return          
	}

	public final Object c()
	{
		rp rp1 = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method rp d()>
	//    2    4:astore_1        
		if(rp1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       32
		{
			b.a(new zzasm(0));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field rc b>
	//    7   13:new             #67  <Class zzasm>
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:invokespecial   #70  <Method void zzasm(int)>
	//   11   21:invokeinterface #30  <Method void rc.a(zzasm)>
			a();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #32  <Method void a()>
			return ((Object) (null));
	//   14   30:aconst_null     
	//   15   31:areturn         
		} else
		{
			a.a(((abt) (new rf(this, rp1))), ((abr) (new rg(this))));
	//   16   32:aload_0         
	//   17   33:getfield        #24  <Field abq a>
	//   18   36:new             #77  <Class rf>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokespecial   #80  <Method void rf(re, rp)>
	//   23   45:new             #82  <Class rg>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #85  <Method void rg(re)>
	//   27   53:invokeinterface #90  <Method void abq.a(abt, abr)>
			return ((Object) (null));
	//   28   58:aconst_null     
	//   29   59:areturn         
		}
	}

	public abstract rp d();

	private final abq a;
	private final rc b;
	private final Object c = new Object();
}
