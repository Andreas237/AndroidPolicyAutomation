// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

class ActivityCompatApi21
{
	public static abstract class SharedElementCallback21
	{

		public abstract Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf);

		public abstract View onCreateSnapshotView(Context context, Parcelable parcelable);

		public abstract void onMapSharedElements(List list, Map map);

		public abstract void onRejectSharedElements(List list);

		public abstract void onSharedElementEnd(List list, List list1, List list2);

		public abstract void onSharedElementStart(List list, List list1, List list2);

		public SharedElementCallback21()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class SharedElementCallbackImpl extends SharedElementCallback
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

		private SharedElementCallback21 mCallback;

		public SharedElementCallbackImpl(SharedElementCallback21 sharedelementcallback21)
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


	ActivityCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private static SharedElementCallback createCallback(SharedElementCallback21 sharedelementcallback21)
	{
		SharedElementCallbackImpl sharedelementcallbackimpl = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(sharedelementcallback21 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          15
			sharedelementcallbackimpl = new SharedElementCallbackImpl(sharedelementcallback21);
	//    4    6:new             #9   <Class ActivityCompatApi21$SharedElementCallbackImpl>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void ActivityCompatApi21$SharedElementCallbackImpl(ActivityCompatApi21$SharedElementCallback21)>
	//    8   14:astore_1        
		return ((SharedElementCallback) (sharedelementcallbackimpl));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public static void finishAfterTransition(Activity activity)
	{
		activity.finishAfterTransition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method void Activity.finishAfterTransition()>
	//    2    4:return          
	}

	public static void postponeEnterTransition(Activity activity)
	{
		activity.postponeEnterTransition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method void Activity.postponeEnterTransition()>
	//    2    4:return          
	}

	public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback21 sharedelementcallback21)
	{
		activity.setEnterSharedElementCallback(createCallback(sharedelementcallback21));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #36  <Method SharedElementCallback createCallback(ActivityCompatApi21$SharedElementCallback21)>
	//    3    5:invokevirtual   #39  <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
	//    4    8:return          
	}

	public static void setExitSharedElementCallback(Activity activity, SharedElementCallback21 sharedelementcallback21)
	{
		activity.setExitSharedElementCallback(createCallback(sharedelementcallback21));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #36  <Method SharedElementCallback createCallback(ActivityCompatApi21$SharedElementCallback21)>
	//    3    5:invokevirtual   #42  <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
	//    4    8:return          
	}

	public static void startPostponedEnterTransition(Activity activity)
	{
		activity.startPostponedEnterTransition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method void Activity.startPostponedEnterTransition()>
	//    2    4:return          
	}
}
