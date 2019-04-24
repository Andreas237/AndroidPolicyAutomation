// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j

class j$d$2 extends j.d
{

	public void a(String s)
	{
		throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
	//    0    0:new             #30  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "This MixpanelPeople object has a fixed, constant distinctId">
	//    3    6:invokespecial   #34  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public String e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String b>
	//    2    4:areturn         
	}

	final String b;
	final j.d c;

	j$d$2(j.d d1, String s)
	{
		c = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field j$d c>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String b>
		super(d1.a, ((j._cls1) (null)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #23  <Field j j$d.a>
	//    9   15:aconst_null     
	//   10   16:invokespecial   #26  <Method void j$d(j, j$1)>
	//   11   19:return          
	}
}
