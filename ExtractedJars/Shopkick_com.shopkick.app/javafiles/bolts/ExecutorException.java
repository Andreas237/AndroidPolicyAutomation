// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


public class ExecutorException extends RuntimeException
{

	public ExecutorException(Exception exception)
	{
		super("An exception was thrown by an Executor", ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "An exception was thrown by an Executor">
	//    2    3:aload_1         
	//    3    4:invokespecial   #11  <Method void RuntimeException(String, Throwable)>
	//    4    7:return          
	}
}
