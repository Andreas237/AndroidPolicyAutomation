// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			RequestProgress

class RequestProgress$1
	implements Runnable
{

	public void run()
	{
		val$callbackCopy.onProgress(val$currentCopy, val$maxProgressCopy);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field GraphRequest$OnProgressCallback val$callbackCopy>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field long val$currentCopy>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field long val$maxProgressCopy>
	//    6   12:invokeinterface #38  <Method void GraphRequest$OnProgressCallback.onProgress(long, long)>
	//    7   17:return          
	}

	final RequestProgress this$0;
	final gressCallback val$callbackCopy;
	final long val$currentCopy;
	final long val$maxProgressCopy;

	RequestProgress$1()
	{
		this$0 = final_requestprogress;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RequestProgress this$0>
		val$callbackCopy = gresscallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field GraphRequest$OnProgressCallback val$callbackCopy>
		val$currentCopy = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #26  <Field long val$currentCopy>
		val$maxProgressCopy = J.this;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #28  <Field long val$maxProgressCopy>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
