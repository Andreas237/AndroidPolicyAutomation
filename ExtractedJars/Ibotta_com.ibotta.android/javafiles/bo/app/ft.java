// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			fy, fr

public class ft extends fy
	implements fr
{

	public ft(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void fy()>
		a = a(s);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #17  <Method String a(String)>
	//    6   10:putfield        #19  <Field String a>
	//    7   13:return          
	}

	public ft(String s, String s1)
	{
		this(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ft(String)>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String b>
	//    6   10:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return "iam_click";
	//    0    0:ldc1            #28  <String "iam_click">
	//    1    2:areturn         
	}

	public String f()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String b>
	//    2    4:areturn         
	}

	private String a;
	private String b;
}
