// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;


// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

private final class DashMediaSource$DefaultPlayerEmsgCallback
	implements PlayerEmsgHandler.PlayerEmsgCallback
{

	public void onDashLiveMediaPresentationEndSignalEncountered()
	{
		DashMediaSource.this.onDashLiveMediaPresentationEndSignalEncountered();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DashMediaSource this$0>
	//    2    4:invokevirtual   #25  <Method void DashMediaSource.onDashLiveMediaPresentationEndSignalEncountered()>
	//    3    7:return          
	}

	public void onDashManifestPublishTimeExpired(long l)
	{
		DashMediaSource.this.onDashManifestPublishTimeExpired(l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DashMediaSource this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #29  <Method void DashMediaSource.onDashManifestPublishTimeExpired(long)>
	//    4    8:return          
	}

	public void onDashManifestRefreshRequested()
	{
		DashMediaSource.this.onDashManifestRefreshRequested();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DashMediaSource this$0>
	//    2    4:invokevirtual   #32  <Method void DashMediaSource.onDashManifestRefreshRequested()>
	//    3    7:return          
	}

	final DashMediaSource this$0;

	private DashMediaSource$DefaultPlayerEmsgCallback()
	{
		this$0 = DashMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DashMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	DashMediaSource$DefaultPlayerEmsgCallback(DashMediaSource._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DashMediaSource$DefaultPlayerEmsgCallback(DashMediaSource)>
	//    3    5:return          
	}
}
