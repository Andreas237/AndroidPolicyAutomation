// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.File;

public interface HeapDumper
{

	public abstract File dumpHeap();

	public static final HeapDumper NONE = new _cls1();
	public static final File RETRY_LATER = null;

	/* static  */
	/* { */
	//    0    0:new             #12  <Class HeapDumper$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HeapDumper$1()>
	//    3    7:putstatic       #17  <Field HeapDumper NONE>
	//    4   10:aconst_null     
	//    5   11:putstatic       #19  <Field File RETRY_LATER>
	//*   6   14:return          
	/* } */

	/* member class not found */
	class _cls1 {}

}
