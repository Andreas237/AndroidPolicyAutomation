// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.internal;

import android.os.Looper;

public final class Preconditions
{

	private Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #12  <String "No instances.">
	//    5   10:invokespecial   #15  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static void checkArgument(boolean flag, String s)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            13
			throw new IllegalArgumentException(s);
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #23  <Method void IllegalArgumentException(String)>
	//    6   12:athrow          
		else
			return;
	//    7   13:return          
	}

	public static void checkUiThread()
	{
		if(Looper.getMainLooper() != Looper.myLooper())
	//*   0    0:invokestatic    #30  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #33  <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpeq       38
			throw new IllegalStateException((new StringBuilder()).append("Must be called from the main thread. Was: ").append(((Object) (Thread.currentThread()))).toString());
	//    3    9:new             #35  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:new             #37  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #38  <Method void StringBuilder()>
	//    8   20:ldc1            #40  <String "Must be called from the main thread. Was: ">
	//    9   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   25:invokestatic    #50  <Method Thread Thread.currentThread()>
	//   11   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   12   31:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   13   34:invokespecial   #58  <Method void IllegalStateException(String)>
	//   14   37:athrow          
		else
			return;
	//   15   38:return          
	}
}
