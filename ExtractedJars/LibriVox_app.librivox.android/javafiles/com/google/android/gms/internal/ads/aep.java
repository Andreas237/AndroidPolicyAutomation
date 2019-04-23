// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aen, aeq, add

public final class aep
	implements Iterable
{

	public aep()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field List a>
	//    7   15:return          
	}

	public static boolean a(add add)
	{
		add = ((add) (b(add)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method aen b(add)>
	//    2    4:astore_0        
		if(add != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          18
		{
			((aen) (add)).b.b();
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field aeq aen.b>
	//    7   13:invokevirtual   #33  <Method void aeq.b()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
	}

	static aen b(add add)
	{
		for(Iterator iterator1 = aw.C().iterator(); iterator1.hasNext();)
	//*   0    0:invokestatic    #39  <Method aep aw.C()>
	//*   1    3:invokevirtual   #43  <Method Iterator iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            36
		{
			aen aen1 = (aen)iterator1.next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #53  <Method Object Iterator.next()>
	//    8   22:checkcast       #26  <Class aen>
	//    9   25:astore_2        
			if(aen1.a == add)
	//*  10   26:aload_2         
	//*  11   27:getfield        #56  <Field add aen.a>
	//*  12   30:aload_0         
	//*  13   31:if_acmpne       7
				return aen1;
	//   14   34:aload_2         
	//   15   35:areturn         
		}

		return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
	}

	public final int a()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List a>
	//    2    4:invokeinterface #62  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final void a(aen aen1)
	{
		a.add(((Object) (aen1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #67  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void b(aen aen1)
	{
		a.remove(((Object) (aen1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #70  <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final Iterator iterator()
	{
		return a.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List a>
	//    2    4:invokeinterface #71  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	private final List a = new ArrayList();
}
