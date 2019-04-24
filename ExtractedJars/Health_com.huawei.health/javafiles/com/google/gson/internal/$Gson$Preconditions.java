// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


public final class $Gson$Preconditions
{

	public static void checkArgument(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #16  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #17  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #21  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #22  <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return obj;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	private $Gson$Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #10  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #11  <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}
}
