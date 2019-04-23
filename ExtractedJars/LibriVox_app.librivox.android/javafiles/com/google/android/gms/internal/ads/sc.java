// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			sb, qn, im, we

final class sc
	implements Runnable
{

	sc(sb sb1, we we)
	{
		b = sb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field sb b>
		a = we;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field we a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		sb.a(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field sb b>
	//    2    4:invokestatic    #26  <Method qn sb.a(sb)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field we a>
	//    5   11:invokeinterface #31  <Method void qn.a(we)>
		if(sb.b(b) != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #14  <Field sb b>
	//*   8   20:invokestatic    #34  <Method im sb.b(sb)>
	//*   9   23:ifnull          45
		{
			sb.b(b).a();
	//   10   26:aload_0         
	//   11   27:getfield        #14  <Field sb b>
	//   12   30:invokestatic    #34  <Method im sb.b(sb)>
	//   13   33:invokevirtual   #38  <Method void im.a()>
			sb.a(b, ((im) (null)));
	//   14   36:aload_0         
	//   15   37:getfield        #14  <Field sb b>
	//   16   40:aconst_null     
	//   17   41:invokestatic    #41  <Method im sb.a(sb, im)>
	//   18   44:pop             
		}
	//   19   45:return          
	}

	private final we a;
	private final sb b;
}
