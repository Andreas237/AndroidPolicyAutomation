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
//			ActivityCompat, SharedElementCallback

private static class ActivityCompat$SharedElementCallback21Impl extends SharedElementCallback
{

	public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
	{
		return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #26  <Method Parcelable SharedElementCallback.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
	//    6   10:areturn         
	}

	public View onCreateSnapshotView(Context context, Parcelable parcelable)
	{
		return mCallback.onCreateSnapshotView(context, parcelable);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #30  <Method View SharedElementCallback.onCreateSnapshotView(Context, Parcelable)>
	//    5    9:areturn         
	}

	public void onMapSharedElements(List list, Map map)
	{
		mCallback.onMapSharedElements(list, map);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #34  <Method void SharedElementCallback.onMapSharedElements(List, Map)>
	//    5    9:return          
	}

	public void onRejectSharedElements(List list)
	{
		mCallback.onRejectSharedElements(list);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void SharedElementCallback.onRejectSharedElements(List)>
	//    4    8:return          
	}

	public void onSharedElementEnd(List list, List list1, List list2)
	{
		mCallback.onSharedElementEnd(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #45  <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
	//    6   10:return          
	}

	public void onSharedElementStart(List list, List list1, List list2)
	{
		mCallback.onSharedElementStart(list, list1, list2);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #49  <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
	//    6   10:return          
	}

	protected android.support.v4.app.SharedElementCallback mCallback;

	ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void SharedElementCallback()>
		mCallback = sharedelementcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field android.support.v4.app.SharedElementCallback mCallback>
	//    5    9:return          
	}
}
