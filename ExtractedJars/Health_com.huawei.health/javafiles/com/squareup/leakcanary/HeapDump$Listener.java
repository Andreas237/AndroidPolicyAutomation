// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			HeapDump

public static interface HeapDump$Listener
{

	public abstract void analyze(HeapDump heapdump);

	public static final HeapDump$Listener NONE = new _cls1();

	/* static  */
	/* { */
	/* block-local class not found */
	class _cls1 {}

	//    0    0:new             #13  <Class HeapDump$Listener$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void HeapDump$Listener$1()>
	//    3    7:putstatic       #18  <Field HeapDump$Listener NONE>
	//*   4   10:return          
	/* } */
}
