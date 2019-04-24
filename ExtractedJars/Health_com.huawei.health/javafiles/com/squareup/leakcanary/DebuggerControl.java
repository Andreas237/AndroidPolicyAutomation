// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


public interface DebuggerControl
{

	public abstract boolean isDebuggerAttached();

	public static final DebuggerControl NONE = new _cls1();

	/* static  */
	/* { */
	//    0    0:new             #10  <Class DebuggerControl$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DebuggerControl$1()>
	//    3    7:putstatic       #15  <Field DebuggerControl NONE>
	//*   4   10:return          
	/* } */

	/* member class not found */
	class _cls1 {}

}
