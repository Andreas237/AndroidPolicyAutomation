// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


public class UnmetDependencyException extends RuntimeException
{

	public UnmetDependencyException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void RuntimeException()>
	//    2    4:return          
	}

	public UnmetDependencyException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void RuntimeException(String)>
	//    3    5:return          
	}

	public UnmetDependencyException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void RuntimeException(String, Throwable)>
	//    4    6:return          
	}

	public UnmetDependencyException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}
}
