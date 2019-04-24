// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			ActivityCompatApi21

static class ActivityCompatApi21$SharedElementCallbackImpl extends SharedElementCallback
{

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #23  <Method Parcelable ActivityCompatApi21$SharedElementCallback21.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
	//    6   10:areturn         
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		return mCallback.onCreateSnapshotView(context, parcelable);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #27  <Method View ActivityCompatApi21$SharedElementCallback21.onCreateSnapshotView(Context, Parcelable)>
	//    5    9:areturn         
	}

	public void onMapSharedElements(List list, Map map)
	{
		mCallback.onMapSharedElements(list, map);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method void ActivityCompatApi21$SharedElementCallback21.onMapSharedElements(List, Map)>
	//    5    9:return          
	}

	public void onRejectSharedElements(List list)
	{
		mCallback.onRejectSharedElements(list);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method void ActivityCompatApi21$SharedElementCallback21.onRejectSharedElements(List)>
	//    4    8:return          
	}

	public void onSharedElementEnd(List list, List list1, List list2)
	{
		mCallback.onSharedElementEnd(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #42  <Method void ActivityCompatApi21$SharedElementCallback21.onSharedElementEnd(List, List, List)>
	//    6   10:return          
	}

	public void onSharedElementStart(List list, List list1, List list2)
	{
		mCallback.onSharedElementStart(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #46  <Method void ActivityCompatApi21$SharedElementCallback21.onSharedElementStart(List, List, List)>
	//    6   10:return          
	}

	private ActivityCompatApi21.SharedElementCallback21 mCallback;

	public ActivityCompatApi21$SharedElementCallbackImpl(ActivityCompatApi21.SharedElementCallback21 sharedelementcallback21)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void SharedElementCallback()>
		mCallback = sharedelementcallback21;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ActivityCompatApi21$SharedElementCallback21 mCallback>
	//    5    9:return          
	}
}
