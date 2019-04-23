// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.util:
//			ManifestFetcher

class ManifestFetcher$3
	implements Runnable
{

	public void run()
	{
		ManifestFetcher.access$000(ManifestFetcher.this).onManifestError(val$e);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ManifestFetcher this$0>
	//    2    4:invokestatic    #30  <Method ManifestFetcher$EventListener ManifestFetcher.access$000(ManifestFetcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field IOException val$e>
	//    5   11:invokeinterface #35  <Method void ManifestFetcher$EventListener.onManifestError(IOException)>
	//    6   16:return          
	}

	final ManifestFetcher this$0;
	final IOException val$e;

	ManifestFetcher$3()
	{
		this$0 = final_manifestfetcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ManifestFetcher this$0>
		val$e = IOException.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field IOException val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
