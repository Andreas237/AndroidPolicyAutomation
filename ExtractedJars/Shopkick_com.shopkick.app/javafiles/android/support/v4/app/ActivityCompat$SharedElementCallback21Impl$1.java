// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			ActivityCompat

class ActivityCompat$SharedElementCallback21Impl$1
	implements stener
{

	public void onSharedElementsReady()
	{
		val$listener.onSharedElementsReady();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
	//    2    4:invokeinterface #33  <Method void android.app.SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
	//    3    9:return          
	}

	final ActivityCompat.SharedElementCallback21Impl this$0;
	final android.app.stener val$listener;

	ActivityCompat$SharedElementCallback21Impl$1()
	{
		this$0 = final_sharedelementcallback21impl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback21Impl this$0>
		val$listener = android.app.stener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
