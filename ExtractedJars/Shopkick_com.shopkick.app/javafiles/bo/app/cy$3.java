// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.Collection;
import java.util.concurrent.Callable;

// Referenced classes of package bo.app:
//			cy, dd

class cy$3
	implements Callable
{

	public Collection a()
	{
		return cy.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field cy a>
	//    2    4:invokestatic    #24  <Method dd cy.a(cy)>
	//    3    7:invokeinterface #27  <Method Collection dd.a()>
	//    4   12:areturn         
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Collection a()>
	//    2    4:areturn         
	}

	final cy a;

	cy$3(cy cy1)
	{
		a = cy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field cy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
