// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


public class FacebookException extends RuntimeException
{

	public FacebookException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void RuntimeException()>
	//    2    4:return          
	}

	public FacebookException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void RuntimeException(String)>
	//    3    5:return          
	}

	public FacebookException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void RuntimeException(String, Throwable)>
	//    4    6:return          
	}

	public transient FacebookException(String s, Object aobj[])
	{
		this(String.format(s, aobj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #26  <Method String String.format(String, Object[])>
	//    4    6:invokespecial   #27  <Method void FacebookException(String)>
	//    5    9:return          
	}

	public FacebookException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}

	public String toString()
	{
		return getMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String getMessage()>
	//    2    4:areturn         
	}

	static final long serialVersionUID = 1L;
}
