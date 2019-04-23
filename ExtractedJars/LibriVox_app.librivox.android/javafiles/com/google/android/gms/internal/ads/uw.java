// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			uq, kp, up

public final class uw
{

	public uw(kp kp, up up)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = kp;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field kp a>
		b = new uq(up);
	//    5    9:aload_0         
	//    6   10:new             #18  <Class uq>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #21  <Method void uq(up)>
	//   10   18:putfield        #23  <Field uq b>
	//   11   21:return          
	}

	public final kp a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field kp a>
	//    2    4:areturn         
	}

	public final uq b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field uq b>
	//    2    4:areturn         
	}

	private final kp a;
	private final uq b;
}
