// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//			eu, cj, ca, ab

public final class ek extends eu
{

	public ek(ca ca, ab ab, String s, String s1)
	{
		super(cj.j, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field cj cj.j>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #17  <Method void eu(cj, ca, ab, String)>
		a = s1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #19  <Field String a>
	//    9   16:return          
	}

	public final String b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String a>
	//    2    4:areturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #29  <Method org.json.JSONObject m()>
	//    3    5:invokevirtual   #32  <Method void b(org.json.JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		return "mockDeleteCreditCardResponse";
	//    0    0:ldc1            #35  <String "mockDeleteCreditCardResponse">
	//    1    2:areturn         
	}

	private String a;
}
