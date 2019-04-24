// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;


// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

class DashMediaSource$2
	implements Runnable
{

	public void run()
	{
		DashMediaSource.access$400(DashMediaSource.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DashMediaSource this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #25  <Method void DashMediaSource.access$400(DashMediaSource, boolean)>
	//    4    8:return          
	}

	final DashMediaSource this$0;

	DashMediaSource$2()
	{
		this$0 = DashMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DashMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
