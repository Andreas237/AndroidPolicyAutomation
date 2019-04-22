// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			SharedElementCallback

public class ActivityCompat extends ContextCompat
{
	public static interface OnRequestPermissionsResultCallback
	{

		public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
	}

	public static interface PermissionCompatDelegate
	{

		public abstract boolean onActivityResult(Activity activity, int i, int j, Intent intent);

		public abstract boolean requestPermissions(Activity activity, String as[], int i);
	}

	public static interface RequestPermissionsRequestCodeValidator
	{

		public abstract void validateRequestPermissionsRequestCode(int i);
	}

	private static class SharedElementCallback21Impl extends SharedElementCallback
	{

		public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
		{
			return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #28  <Method Parcelable SharedElementCallback.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
		//    6   10:areturn         
		}

		public View onCreateSnapshotView(Context context, Parcelable parcelable)
		{
			return mCallback.onCreateSnapshotView(context, parcelable);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method View SharedElementCallback.onCreateSnapshotView(Context, Parcelable)>
		//    5    9:areturn         
		}

		public void onMapSharedElements(List list, Map map)
		{
			mCallback.onMapSharedElements(list, map);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #36  <Method void SharedElementCallback.onMapSharedElements(List, Map)>
		//    5    9:return          
		}

		public void onRejectSharedElements(List list)
		{
			mCallback.onRejectSharedElements(list);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method void SharedElementCallback.onRejectSharedElements(List)>
		//    4    8:return          
		}

		public void onSharedElementEnd(List list, List list1, List list2)
		{
			mCallback.onSharedElementEnd(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #47  <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
		//    6   10:return          
		}

		public void onSharedElementStart(List list, List list1, List list2)
		{
			mCallback.onSharedElementStart(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #51  <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
		//    6   10:return          
		}

		public void onSharedElementsArrived(List list, List list1, android.app.SharedElementCallback.OnSharedElementsReadyListener onsharedelementsreadylistener)
		{
			mCallback.onSharedElementsArrived(list, list1, ((_cls1) (onsharedelementsreadylistener)). new SharedElementCallback.OnSharedElementsReadyListener() {

				public void onSharedElementsReady()
				{
					listener.onSharedElementsReady();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field android.app.SharedElementCallback$OnSharedElementsReadyListener val$listener>
				//    2    4:invokeinterface #33  <Method void android.app.SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady()>
				//    3    9:return          
				}

				final SharedElementCallback21Impl this$0;
				final android.app.SharedElementCallback.OnSharedElementsReadyListener val$listener;

			
			{
				this$0 = final_sharedelementcallback21impl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback21Impl this$0>
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
		//    1    1:getfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:new             #9   <Class ActivityCompat$SharedElementCallback21Impl$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:invokespecial   #57  <Method void ActivityCompat$SharedElementCallback21Impl$1(ActivityCompat$SharedElementCallback21Impl, android.app.SharedElementCallback$OnSharedElementsReadyListener)>
		//    9   15:invokevirtual   #60  <Method void SharedElementCallback.onSharedElementsArrived(List, List, SharedElementCallback$OnSharedElementsReadyListener)>
		//   10   18:return          
		}

		private final android.support.v4.app.SharedElementCallback mCallback;

		SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void SharedElementCallback()>
			mCallback = sharedelementcallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    5    9:return          
		}
	}


	public static void finishAffinity(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			activity.finishAffinity();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #36  <Method void Activity.finishAffinity()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #39  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static void finishAfterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			activity.finishAfterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #44  <Method void Activity.finishAfterTransition()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #39  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static PermissionCompatDelegate getPermissionCompatDelegate()
	{
		return sDelegate;
	//    0    0:getstatic       #52  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//    1    3:areturn         
	}

	public static void postponeEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.postponeEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #56  <Method void Activity.postponeEnterTransition()>
	//    5   12:return          
	}

	public static void requestPermissions(Activity activity, String as[], int i)
	{
		PermissionCompatDelegate permissioncompatdelegate = sDelegate;
	//    0    0:getstatic       #52  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//    1    3:astore_3        
		if(permissioncompatdelegate != null && permissioncompatdelegate.requestPermissions(activity, as, i))
	//*   2    4:aload_3         
	//*   3    5:ifnull          21
	//*   4    8:aload_3         
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:invokeinterface #65  <Method boolean ActivityCompat$PermissionCompatDelegate.requestPermissions(Activity, String[], int)>
	//*   9   17:ifeq            21
			return;
	//   10   20:return          
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  11   21:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   24:bipush          23
	//*  13   26:icmplt          53
		{
			if(activity instanceof RequestPermissionsRequestCodeValidator)
	//*  14   29:aload_0         
	//*  15   30:instanceof      #14  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//*  16   33:ifeq            46
				((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(i);
	//   17   36:aload_0         
	//   18   37:checkcast       #14  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//   19   40:iload_2         
	//   20   41:invokeinterface #69  <Method void ActivityCompat$RequestPermissionsRequestCodeValidator.validateRequestPermissionsRequestCode(int)>
			activity.requestPermissions(as, i);
	//   21   46:aload_0         
	//   22   47:aload_1         
	//   23   48:iload_2         
	//   24   49:invokevirtual   #72  <Method void Activity.requestPermissions(String[], int)>
			return;
	//   25   52:return          
		}
		if(activity instanceof OnRequestPermissionsResultCallback)
	//*  26   53:aload_0         
	//*  27   54:instanceof      #8   <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//*  28   57:ifeq            84
			(new Handler(Looper.getMainLooper())).post(new Runnable(as, activity, i) {

				public void run()
				{
					int ai[] = new int[permissions.length];
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field String[] val$permissions>
				//    2    4:arraylength     
				//    3    5:newarray        int[]
				//    4    7:astore_3        
					PackageManager packagemanager = activity.getPackageManager();
				//    5    8:aload_0         
				//    6    9:getfield        #23  <Field Activity val$activity>
				//    7   12:invokevirtual   #36  <Method PackageManager Activity.getPackageManager()>
				//    8   15:astore          4
					String s = activity.getPackageName();
				//    9   17:aload_0         
				//   10   18:getfield        #23  <Field Activity val$activity>
				//   11   21:invokevirtual   #40  <Method String Activity.getPackageName()>
				//   12   24:astore          5
					int k = permissions.length;
				//   13   26:aload_0         
				//   14   27:getfield        #21  <Field String[] val$permissions>
				//   15   30:arraylength     
				//   16   31:istore_2        
					for(int j = 0; j < k; j++)
				//*  17   32:iconst_0        
				//*  18   33:istore_1        
				//*  19   34:iload_1         
				//*  20   35:iload_2         
				//*  21   36:icmpge          62
						ai[j] = packagemanager.checkPermission(permissions[j], s);
				//   22   39:aload_3         
				//   23   40:iload_1         
				//   24   41:aload           4
				//   25   43:aload_0         
				//   26   44:getfield        #21  <Field String[] val$permissions>
				//   27   47:iload_1         
				//   28   48:aaload          
				//   29   49:aload           5
				//   30   51:invokevirtual   #46  <Method int PackageManager.checkPermission(String, String)>
				//   31   54:iastore         

				//   32   55:iload_1         
				//   33   56:iconst_1        
				//   34   57:iadd            
				//   35   58:istore_1        
				//*  36   59:goto            34
					((OnRequestPermissionsResultCallback)activity).onRequestPermissionsResult(requestCode, permissions, ai);
				//   37   62:aload_0         
				//   38   63:getfield        #23  <Field Activity val$activity>
				//   39   66:checkcast       #48  <Class ActivityCompat$OnRequestPermissionsResultCallback>
				//   40   69:aload_0         
				//   41   70:getfield        #25  <Field int val$requestCode>
				//   42   73:aload_0         
				//   43   74:getfield        #21  <Field String[] val$permissions>
				//   44   77:aload_3         
				//   45   78:invokeinterface #52  <Method void ActivityCompat$OnRequestPermissionsResultCallback.onRequestPermissionsResult(int, String[], int[])>
				//   46   83:return          
				}

				final Activity val$activity;
				final String val$permissions[];
				final int val$requestCode;

			
			{
				permissions = as;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field String[] val$permissions>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Activity val$activity>
				requestCode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$requestCode>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   29   60:new             #74  <Class Handler>
	//   30   63:dup             
	//   31   64:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//   32   67:invokespecial   #84  <Method void Handler(Looper)>
	//   33   70:new             #6   <Class ActivityCompat$1>
	//   34   73:dup             
	//   35   74:aload_1         
	//   36   75:aload_0         
	//   37   76:iload_2         
	//   38   77:invokespecial   #87  <Method void ActivityCompat$1(String[], Activity, int)>
	//   39   80:invokevirtual   #91  <Method boolean Handler.post(Runnable)>
	//   40   83:pop             
	//   41   84:return          
	}

	public static void setEnterSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          31
		{
			if(sharedelementcallback != null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          24
				sharedelementcallback = ((android.support.v4.app.SharedElementCallback) (new SharedElementCallback21Impl(sharedelementcallback)));
	//    5   12:new             #17  <Class ActivityCompat$SharedElementCallback21Impl>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokespecial   #97  <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//    9   20:astore_1        
			else
	//*  10   21:goto            26
				sharedelementcallback = null;
	//   11   24:aconst_null     
	//   12   25:astore_1        
			activity.setEnterSharedElementCallback(((SharedElementCallback) (sharedelementcallback)));
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #100 <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
		}
	//   16   31:return          
	}

	public static void setExitSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          31
		{
			if(sharedelementcallback != null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          24
				sharedelementcallback = ((android.support.v4.app.SharedElementCallback) (new SharedElementCallback21Impl(sharedelementcallback)));
	//    5   12:new             #17  <Class ActivityCompat$SharedElementCallback21Impl>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokespecial   #97  <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//    9   20:astore_1        
			else
	//*  10   21:goto            26
				sharedelementcallback = null;
	//   11   24:aconst_null     
	//   12   25:astore_1        
			activity.setExitSharedElementCallback(((SharedElementCallback) (sharedelementcallback)));
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #103 <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
		}
	//   16   31:return          
	}

	public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return activity.shouldShowRequestPermissionRationale(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #108 <Method boolean Activity.shouldShowRequestPermissionRationale(String)>
	//    6   13:ireturn         
		else
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
		{
			activity.startActivityForResult(intent, i, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #113 <Method void Activity.startActivityForResult(Intent, int, Bundle)>
			return;
	//    8   15:return          
		} else
		{
			activity.startActivityForResult(intent, i);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #116 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//   13   22:return          
		}
	}

	public static void startIntentSenderForResult(Activity activity, IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          24
		{
			activity.startIntentSenderForResult(intentsender, i, intent, j, k, l, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:iload           4
	//    8   14:iload           5
	//    9   16:iload           6
	//   10   18:aload           7
	//   11   20:invokevirtual   #123 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   12   23:return          
		} else
		{
			activity.startIntentSenderForResult(intentsender, i, intent, j, k, l);
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:iload_2         
	//   16   27:aload_3         
	//   17   28:iload           4
	//   18   30:iload           5
	//   19   32:iload           6
	//   20   34:invokevirtual   #126 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
			return;
	//   21   37:return          
		}
	}

	public static void startPostponedEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.startPostponedEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #130 <Method void Activity.startPostponedEnterTransition()>
	//    5   12:return          
	}

	private static PermissionCompatDelegate sDelegate;
}
