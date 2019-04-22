// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;


public class ExceptionUtil
{

	public ExceptionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static RuntimeException propagate(Throwable throwable)
	{
		propagateIfInstanceOf(throwable, java/lang/Error);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Error>
	//    2    3:invokestatic    #17  <Method void propagateIfInstanceOf(Throwable, Class)>
		propagateIfInstanceOf(throwable, java/lang/RuntimeException);
	//    3    6:aload_0         
	//    4    7:ldc1            #19  <Class RuntimeException>
	//    5    9:invokestatic    #17  <Method void propagateIfInstanceOf(Throwable, Class)>
		throw new RuntimeException(throwable);
	//    6   12:new             #19  <Class RuntimeException>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #22  <Method void RuntimeException(Throwable)>
	//   10   20:athrow          
	}

	public static void propagateIfInstanceOf(Throwable throwable, Class class1)
		throws Throwable
	{
		if(!class1.isInstance(((Object) (throwable))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #30  <Method boolean Class.isInstance(Object)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		else
			throw throwable;
	//    5    9:aload_0         
	//    6   10:athrow          
	}

	public static void sneakyThrow(Throwable throwable)
		throws Throwable
	{
		throw throwable;
	//    0    0:aload_0         
	//    1    1:athrow          
	}
}
