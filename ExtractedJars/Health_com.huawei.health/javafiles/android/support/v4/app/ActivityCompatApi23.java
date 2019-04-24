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

class ActivityCompatApi23
{
	public static interface OnSharedElementsReadyListenerBridge
	{

		public abstract void onSharedElementsReady();
	}

	public static interface RequestPermissionsRequestCodeValidator
	{

		public abstract void validateRequestPermissionsRequestCode(int i);
	}

	public static abstract class SharedElementCallback23 extends ActivityCompatApi21.SharedElementCallback21
	{

		public abstract void onSharedElementsArrived(List list, List list1, OnSharedElementsReadyListenerBridge onsharedelementsreadylistenerbridge);

		public SharedElementCallback23()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ActivityCompatApi21$SharedElementCallback21()>
		//    2    4:return          
		}
	}

	static class SharedElementCallbackImpl extends SharedElementCallback
	{

		public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
		{
			return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #25  <Method Parcelable ActivityCompatApi23$SharedElementCallback23.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
		//    6   10:areturn         
		}

		public View onCreateSnapshotView(Context context, Parcelable parcelable)
		{
			return mCallback.onCreateSnapshotView(context, parcelable);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #29  <Method View ActivityCompatApi23$SharedElementCallback23.onCreateSnapshotView(Context, Parcelable)>
		//    5    9:areturn         
		}

		public void onMapSharedElements(List list, Map map)
		{
			mCallback.onMapSharedElements(list, map);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #33  <Method void ActivityCompatApi23$SharedElementCallback23.onMapSharedElements(List, Map)>
		//    5    9:return          
		}

		public void onRejectSharedElements(List list)
		{
			mCallback.onRejectSharedElements(list);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method void ActivityCompatApi23$SharedElementCallback23.onRejectSharedElements(List)>
		//    4    8:return          
		}

		public void onSharedElementEnd(List list, List list1, List list2)
		{
			mCallback.onSharedElementEnd(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #44  <Method void ActivityCompatApi23$SharedElementCallback23.onSharedElementEnd(List, List, List)>
		//    6   10:return          
		}

		public void onSharedElementStart(List list, List list1, List list2)
		{
			mCallback.onSharedElementStart(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #48  <Method void ActivityCompatApi23$SharedElementCallback23.onSharedElementStart(List, List, List)>
		//    6   10:return          
		}

		public void onSharedElementsArrived(List list, List list1, android.app.SharedElementCallback.OnSharedElementsReadyListener onsharedelementsreadylistener)
		{
			mCallback.onSharedElementsArrived(list, list1, ((_cls1) (onsharedelementsreadylistener)). new OnSharedElementsReadyListenerBridge() {

				public void onSharedElementsReady()
				{
					listener.onSharedElementsReady();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
				//    2    4:invokeinterface #33  <Method void android.app.SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
				//    3    9:return          
				}

				final SharedElementCallbackImpl this$0;
				final android.app.SharedElementCallback.OnSharedElementsReadyListener val$listener;

			
			{
				this$0 = final_sharedelementcallbackimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompatApi23$SharedElementCallbackImpl this$0>
				listener = android.app.SharedElementCallback.OnSharedElementsReadyListener.this;
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
		//    1    1:getfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:new             #9   <Class ActivityCompatApi23$SharedElementCallbackImpl$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:invokespecial   #53  <Method void ActivityCompatApi23$SharedElementCallbackImpl$1(ActivityCompatApi23$SharedElementCallbackImpl, android.app.SharedElementCallback$OnSharedElementsReadyListener)>
		//    9   15:invokevirtual   #56  <Method void ActivityCompatApi23$SharedElementCallback23.onSharedElementsArrived(List, List, ActivityCompatApi23$OnSharedElementsReadyListenerBridge)>
		//   10   18:return          
		}

		private SharedElementCallback23 mCallback;

		public SharedElementCallbackImpl(SharedElementCallback23 sharedelementcallback23)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void SharedElementCallback()>
			mCallback = sharedelementcallback23;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ActivityCompatApi23$SharedElementCallback23 mCallback>
		//    5    9:return          
		}
	}


	ActivityCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static SharedElementCallback createCallback(SharedElementCallback23 sharedelementcallback23)
	{
		SharedElementCallbackImpl sharedelementcallbackimpl = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(sharedelementcallback23 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          15
			sharedelementcallbackimpl = new SharedElementCallbackImpl(sharedelementcallback23);
	//    4    6:new             #15  <Class ActivityCompatApi23$SharedElementCallbackImpl>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #31  <Method void ActivityCompatApi23$SharedElementCallbackImpl(ActivityCompatApi23$SharedElementCallback23)>
	//    8   14:astore_1        
		return ((SharedElementCallback) (sharedelementcallbackimpl));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public static void requestPermissions(Activity activity, String as[], int i)
	{
		if(activity instanceof RequestPermissionsRequestCodeValidator)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #9   <Class ActivityCompatApi23$RequestPermissionsRequestCodeValidator>
	//*   2    4:ifeq            17
			((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(i);
	//    3    7:aload_0         
	//    4    8:checkcast       #9   <Class ActivityCompatApi23$RequestPermissionsRequestCodeValidator>
	//    5   11:iload_2         
	//    6   12:invokeinterface #37  <Method void ActivityCompatApi23$RequestPermissionsRequestCodeValidator.validateRequestPermissionsRequestCode(int)>
		activity.requestPermissions(as, i);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:iload_2         
	//   10   20:invokevirtual   #42  <Method void Activity.requestPermissions(String[], int)>
	//   11   23:return          
	}

	public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback23 sharedelementcallback23)
	{
		activity.setEnterSharedElementCallback(createCallback(sharedelementcallback23));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method SharedElementCallback createCallback(ActivityCompatApi23$SharedElementCallback23)>
	//    3    5:invokevirtual   #49  <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
	//    4    8:return          
	}

	public static void setExitSharedElementCallback(Activity activity, SharedElementCallback23 sharedelementcallback23)
	{
		activity.setExitSharedElementCallback(createCallback(sharedelementcallback23));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method SharedElementCallback createCallback(ActivityCompatApi23$SharedElementCallback23)>
	//    3    5:invokevirtual   #52  <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
	//    4    8:return          
	}

	public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
	{
		return activity.shouldShowRequestPermissionRationale(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #57  <Method boolean Activity.shouldShowRequestPermissionRationale(String)>
	//    3    5:ireturn         
	}
}
