// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.List;

// Referenced classes of package android.support.v4.app:
//			ActivityCompat, SharedElementCallback

private static class ActivityCompat$SharedElementCallback23Impl extends ActivityCompat$SharedElementCallback21Impl
{

	public void onSharedElementsArrived(List list, List list1, final android.app.Listener listener)
	{
		mCallback.onSharedElementsArrived(list, list1, new SharedElementCallback.OnSharedElementsReadyListener() {

			public void onSharedElementsReady()
			{
				listener.onSharedElementsReady();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
			//    2    4:invokeinterface #33  <Method void android.app.SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
			//    3    9:return          
			}

			final ActivityCompat.SharedElementCallback23Impl this$0;
			final android.app.SharedElementCallback.OnSharedElementsReadyListener val$listener;

			
			{
				this$0 = ActivityCompat.SharedElementCallback23Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback23Impl this$0>
				listener = onsharedelementsreadylistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #9   <Class ActivityCompat$SharedElementCallback23Impl$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:invokespecial   #23  <Method void ActivityCompat$SharedElementCallback23Impl$1(ActivityCompat$SharedElementCallback23Impl, android.app.SharedElementCallback$OnSharedElementsReadyListener)>
	//    9   15:invokevirtual   #28  <Method void SharedElementCallback.onSharedElementsArrived(List, List, SharedElementCallback$OnSharedElementsReadyListener)>
	//   10   18:return          
	}

	public ActivityCompat$SharedElementCallback23Impl(SharedElementCallback sharedelementcallback)
	{
		super(sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ActivityCompat$SharedElementCallback21Impl(SharedElementCallback)>
	//    3    5:return          
	}
}
