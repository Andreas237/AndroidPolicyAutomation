// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;


// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorSampleSource

class ExtractorSampleSource$1
	implements Runnable
{

	public void run()
	{
		ExtractorSampleSource.access$000(ExtractorSampleSource.this).release();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExtractorSampleSource this$0>
	//    2    4:invokestatic    #25  <Method ExtractorSampleSource$ExtractorHolder ExtractorSampleSource.access$000(ExtractorSampleSource)>
	//    3    7:invokevirtual   #28  <Method void ExtractorSampleSource$ExtractorHolder.release()>
	//    4   10:return          
	}

	final ExtractorSampleSource this$0;

	ExtractorSampleSource$1()
	{
		this$0 = ExtractorSampleSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ExtractorSampleSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
