// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			if

public static class if$a
{

	static String a(if$a if$a1)
	{
		return if$a1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String a>
	//    2    4:areturn         
	}

	static String b(if$a if$a1)
	{
		return if$a1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String b>
	//    2    4:areturn         
	}

	static String c(if$a if$a1)
	{
		return if$a1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String c>
	//    2    4:areturn         
	}

	static String d(if$a if$a1)
	{
		return if$a1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String d>
	//    2    4:areturn         
	}

	static String e(if$a if$a1)
	{
		return if$a1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String e>
	//    2    4:areturn         
	}

	static String f(if$a if$a1)
	{
		return if$a1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String f>
	//    2    4:areturn         
	}

	public if$a a(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public if a()
	{
		return new if(this);
	//    0    0:new             #6   <Class if>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void if(if$a)>
	//    4    8:areturn         
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;

	public if$a(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		f = "copy";
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <String "copy">
	//    4    7:putfield        #22  <Field String f>
		a = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #24  <Field String a>
		b = s1;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #26  <Field String b>
		c = s2;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #28  <Field String c>
		d = s3;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #30  <Field String d>
		e = s4;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #32  <Field String e>
	//   20   37:return          
	}
}
