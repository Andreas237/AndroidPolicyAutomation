// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			sb, im

final class sg
	implements Runnable
{

	sg(sb sb1)
	{
		a = sb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field sb a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(sb.b(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field sb a>
	//*   2    4:invokestatic    #23  <Method im sb.b(sb)>
	//*   3    7:ifnull          29
		{
			sb.b(a).a();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field sb a>
	//    6   14:invokestatic    #23  <Method im sb.b(sb)>
	//    7   17:invokevirtual   #27  <Method void im.a()>
			sb.a(a, ((im) (null)));
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field sb a>
	//   10   24:aconst_null     
	//   11   25:invokestatic    #30  <Method im sb.a(sb, im)>
	//   12   28:pop             
		}
	//   13   29:return          
	}

	private final sb a;
}
