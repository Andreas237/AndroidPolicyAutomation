// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			ca

public class by extends Exception
{

	public by(int i, String s)
	{
		this(new ca(i, s));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class ca>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #12  <Method void ca(int, String)>
	//    6   10:invokespecial   #15  <Method void by(ca)>
	//    7   13:return          
	}

	public by(int i, String s, Exception exception)
	{
		this(new ca(i, s), exception);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class ca>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #12  <Method void ca(int, String)>
	//    6   10:aload_3         
	//    7   11:invokespecial   #20  <Method void by(ca, Exception)>
	//    8   14:return          
	}

	public by(ca ca1)
	{
		this(ca1, ((Exception) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void by(ca, Exception)>
	//    4    6:return          
	}

	public by(ca ca1, Exception exception)
	{
		super(ca1.a(), ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method String ca.a()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #26  <Method void Exception(String, Throwable)>
		a = ca1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #28  <Field ca a>
	//    8   14:return          
	}

	public ca a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ca a>
	//    2    4:areturn         
	}

	ca a;
}
