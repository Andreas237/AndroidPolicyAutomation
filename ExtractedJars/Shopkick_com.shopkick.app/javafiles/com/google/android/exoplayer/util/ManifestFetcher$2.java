// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//			ManifestFetcher

class ManifestFetcher$2
	implements Runnable
{

	public void run()
	{
		ManifestFetcher.access$000(ManifestFetcher.this).onManifestRefreshed();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ManifestFetcher this$0>
	//    2    4:invokestatic    #25  <Method ManifestFetcher$EventListener ManifestFetcher.access$000(ManifestFetcher)>
	//    3    7:invokeinterface #30  <Method void ManifestFetcher$EventListener.onManifestRefreshed()>
	//    4   12:return          
	}

	final ManifestFetcher this$0;

	ManifestFetcher$2()
	{
		this$0 = ManifestFetcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ManifestFetcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
