// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package com.squareup.leakcanary:
//			Preconditions, ExcludedRefs

public final class HeapDump
	implements Serializable
{
	public static interface Listener
	{

		public abstract void analyze(HeapDump heapdump);

		public static final Listener NONE = new _cls1();

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


	public HeapDump(File file, String s, String s1, ExcludedRefs excludedrefs, long l, long l1, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		heapDumpFile = (File)Preconditions.checkNotNull(((Object) (file)), "heapDumpFile");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #26  <String "heapDumpFile">
	//    5    8:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #34  <Class File>
	//    7   14:putfield        #36  <Field File heapDumpFile>
		referenceKey = (String)Preconditions.checkNotNull(((Object) (s)), "referenceKey");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #37  <String "referenceKey">
	//   11   21:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, String)>
	//   12   24:checkcast       #39  <Class String>
	//   13   27:putfield        #41  <Field String referenceKey>
		referenceName = (String)Preconditions.checkNotNull(((Object) (s1)), "referenceName");
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:ldc1            #42  <String "referenceName">
	//   17   34:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, String)>
	//   18   37:checkcast       #39  <Class String>
	//   19   40:putfield        #44  <Field String referenceName>
		excludedRefs = (ExcludedRefs)Preconditions.checkNotNull(((Object) (excludedrefs)), "excludedRefs");
	//   20   43:aload_0         
	//   21   44:aload           4
	//   22   46:ldc1            #45  <String "excludedRefs">
	//   23   48:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, String)>
	//   24   51:checkcast       #47  <Class ExcludedRefs>
	//   25   54:putfield        #49  <Field ExcludedRefs excludedRefs>
		watchDurationMs = l;
	//   26   57:aload_0         
	//   27   58:lload           5
	//   28   60:putfield        #51  <Field long watchDurationMs>
		gcDurationMs = l1;
	//   29   63:aload_0         
	//   30   64:lload           7
	//   31   66:putfield        #53  <Field long gcDurationMs>
		heapDumpDurationMs = l2;
	//   32   69:aload_0         
	//   33   70:lload           9
	//   34   72:putfield        #55  <Field long heapDumpDurationMs>
	//   35   75:return          
	}

	public final ExcludedRefs excludedRefs;
	public final long gcDurationMs;
	public final long heapDumpDurationMs;
	public final File heapDumpFile;
	public final String referenceKey;
	public final String referenceName;
	public final long watchDurationMs;
}
