// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			Retryable

public interface WatchExecutor
{

	public abstract void execute(Retryable retryable);

	public static final WatchExecutor NONE = new _cls1();

	/* static  */
	/* { */
	//    0    0:new             #10  <Class WatchExecutor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void WatchExecutor$1()>
	//    3    7:putstatic       #15  <Field WatchExecutor NONE>
	//*   4   10:return          
	/* } */

	/* member class not found */
	class _cls1 {}

}
