// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


final class Preconditions
{

	private Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError();
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:invokespecial   #11  <Method void AssertionError()>
	//    5   11:athrow          
	}

	static Object checkNotNull(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       31
			throw new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString());
	//    2    4:new             #16  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:new             #18  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #19  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #25  <String " must not be null">
	//   10   21:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #32  <Method void NullPointerException(String)>
	//   13   30:athrow          
		else
			return obj;
	//   14   31:aload_0         
	//   15   32:areturn         
	}
}
