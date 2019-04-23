// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aca, acl

final class aci
	implements Runnable
{

	aci(aca aca1)
	{
		a = aca1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field aca a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(aca.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field aca a>
	//*   2    4:invokestatic    #22  <Method acl aca.a(aca)>
	//*   3    7:ifnull          34
		{
			aca.a(a).d();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field aca a>
	//    6   14:invokestatic    #22  <Method acl aca.a(aca)>
	//    7   17:invokeinterface #27  <Method void acl.d()>
			aca.a(a).f();
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field aca a>
	//   10   26:invokestatic    #22  <Method acl aca.a(aca)>
	//   11   29:invokeinterface #30  <Method void acl.f()>
		}
	//   12   34:return          
	}

	private final aca a;
}
