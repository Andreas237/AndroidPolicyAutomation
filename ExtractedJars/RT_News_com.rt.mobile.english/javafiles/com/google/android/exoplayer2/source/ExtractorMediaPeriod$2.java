// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			ExtractorMediaPeriod

class ExtractorMediaPeriod$2
	implements Runnable
{

	public void run()
	{
		if(!ExtractorMediaPeriod.access$100(ExtractorMediaPeriod.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ExtractorMediaPeriod this$0>
	//*   2    4:invokestatic    #25  <Method boolean ExtractorMediaPeriod.access$100(ExtractorMediaPeriod)>
	//*   3    7:ifne            26
			ExtractorMediaPeriod.access$200(ExtractorMediaPeriod.this).onContinueLoadingRequested(((SequenceableLoader) (ExtractorMediaPeriod.this)));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ExtractorMediaPeriod this$0>
	//    6   14:invokestatic    #29  <Method MediaPeriod$Callback ExtractorMediaPeriod.access$200(ExtractorMediaPeriod)>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field ExtractorMediaPeriod this$0>
	//    9   21:invokeinterface #35  <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//   10   26:return          
	}

	final ExtractorMediaPeriod this$0;

	ExtractorMediaPeriod$2()
	{
		this$0 = ExtractorMediaPeriod.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ExtractorMediaPeriod this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
