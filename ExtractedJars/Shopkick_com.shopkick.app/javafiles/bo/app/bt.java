// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.Set;

// Referenced classes of package bo.app:
//			bw

public class bt
	implements bw
{

	public bt(Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Set a>
	//    5    9:return          
	}

	public Set a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Set a>
	//    2    4:areturn         
	}

	public boolean b()
	{
		Set set = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Set a>
	//    2    4:astore_1        
		return set != null && set.isEmpty();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #28  <Method boolean Set.isEmpty()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private final Set a;
}
