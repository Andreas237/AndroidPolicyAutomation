// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			ActivityCompat, SharedElementCallback

static class ActivityCompat$SharedElementCallback23Impl extends 
{

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #25  <Method Parcelable SharedElementCallback.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
	//    6   10:areturn         
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		return mCallback.onCreateSnapshotView(context, parcelable);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method View SharedElementCallback.onCreateSnapshotView(Context, Parcelable)>
	//    5    9:areturn         
	}

	public void onMapSharedElements(List list, Map map)
	{
		mCallback.onMapSharedElements(list, map);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #33  <Method void SharedElementCallback.onMapSharedElements(List, Map)>
	//    5    9:return          
	}

	public void onRejectSharedElements(List list)
	{
		mCallback.onRejectSharedElements(list);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void SharedElementCallback.onRejectSharedElements(List)>
	//    4    8:return          
	}

	public void onSharedElementEnd(List list, List list1, List list2)
	{
		mCallback.onSharedElementEnd(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #44  <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
	//    6   10:return          
	}

	public void onSharedElementStart(List list, List list1, List list2)
	{
		mCallback.onSharedElementStart(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #48  <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
	//    6   10:return          
	}

	public void onSharedElementsArrived(List list, List list1, final stenerBridge listener)
	{
		mCallback.onSharedElementsArrived(list, list1, new SharedElementCallback.OnSharedElementsReadyListener() {

			public void onSharedElementsReady()
			{
				listener.onSharedElementsReady();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field ActivityCompatApi23$OnSharedElementsReadyListenerBridge val$listener>
			//    2    4:invokeinterface #33  <Method void ActivityCompatApi23$OnSharedElementsReadyListenerBridge.onSharedElementsReady()>
			//    3    9:return          
			}

			final ActivityCompat.SharedElementCallback23Impl this$0;
			final ActivityCompatApi23.OnSharedElementsReadyListenerBridge val$listener;

			
			{
				this$0 = ActivityCompat.SharedElementCallback23Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback23Impl this$0>
				listener = onsharedelementsreadylistenerbridge;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ActivityCompatApi23$OnSharedElementsReadyListenerBridge val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #9   <Class ActivityCompat$SharedElementCallback23Impl$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:invokespecial   #53  <Method void ActivityCompat$SharedElementCallback23Impl$1(ActivityCompat$SharedElementCallback23Impl, ActivityCompatApi23$OnSharedElementsReadyListenerBridge)>
	//    9   15:invokevirtual   #56  <Method void SharedElementCallback.onSharedElementsArrived(List, List, SharedElementCallback$OnSharedElementsReadyListener)>
	//   10   18:return          
	}

	private SharedElementCallback mCallback;

	public ActivityCompat$SharedElementCallback23Impl(SharedElementCallback sharedelementcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ActivityCompatApi23$SharedElementCallback23()>
		mCallback = sharedelementcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field SharedElementCallback mCallback>
	//    5    9:return          
	}
}
