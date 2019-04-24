// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			ActivityCompatJB, ActivityCompatApi21, ActivityCompatApi22, ActivityCompatApi23, 
//			SharedElementCallback

public class ActivityCompat extends ContextCompat
{
	public static interface OnRequestPermissionsResultCallback
	{

		public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
	}

	static class SharedElementCallback21Impl extends ActivityCompatApi21.SharedElementCallback21
	{

		public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
		{
			return mCallback.onCaptureSharedElementSnapshot(view, matrix, rectf);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #23  <Method Parcelable SharedElementCallback.onCaptureSharedElementSnapshot(View, Matrix, RectF)>
		//    6   10:areturn         
		}

		public View onCreateSnapshotView(Context context, Parcelable parcelable)
		{
			return mCallback.onCreateSnapshotView(context, parcelable);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #27  <Method View SharedElementCallback.onCreateSnapshotView(Context, Parcelable)>
		//    5    9:areturn         
		}

		public void onMapSharedElements(List list, Map map)
		{
			mCallback.onMapSharedElements(list, map);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method void SharedElementCallback.onMapSharedElements(List, Map)>
		//    5    9:return          
		}

		public void onRejectSharedElements(List list)
		{
			mCallback.onRejectSharedElements(list);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method void SharedElementCallback.onRejectSharedElements(List)>
		//    4    8:return          
		}

		public void onSharedElementEnd(List list, List list1, List list2)
		{
			mCallback.onSharedElementEnd(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #42  <Method void SharedElementCallback.onSharedElementEnd(List, List, List)>
		//    6   10:return          
		}

		public void onSharedElementStart(List list, List list1, List list2)
		{
			mCallback.onSharedElementStart(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #46  <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
		//    6   10:return          
		}

		private SharedElementCallback mCallback;

		public SharedElementCallback21Impl(SharedElementCallback sharedelementcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ActivityCompatApi21$SharedElementCallback21()>
			mCallback = sharedelementcallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field SharedElementCallback mCallback>
		//    5    9:return          
		}
	}

	static class SharedElementCallback23Impl extends ActivityCompatApi23.SharedElementCallback23
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

		public void onSharedElementsArrived(List list, List list1, ActivityCompatApi23.OnSharedElementsReadyListenerBridge onsharedelementsreadylistenerbridge)
		{
			mCallback.onSharedElementsArrived(list, list1, ((_cls1) (onsharedelementsreadylistenerbridge)). new SharedElementCallback.OnSharedElementsReadyListener() {

				public void onSharedElementsReady()
				{
					listener.onSharedElementsReady();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityCompatApi23$OnSharedElementsReadyListenerBridge val$listener>
				//    2    4:invokeinterface #33  <Method void ActivityCompatApi23$OnSharedElementsReadyListenerBridge.onSharedElementsReady()>
				//    3    9:return          
				}

				final SharedElementCallback23Impl this$0;
				final ActivityCompatApi23.OnSharedElementsReadyListenerBridge val$listener;

			
			{
				this$0 = final_sharedelementcallback23impl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback23Impl this$0>
				listener = ActivityCompatApi23.OnSharedElementsReadyListenerBridge.this;
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

		public SharedElementCallback23Impl(SharedElementCallback sharedelementcallback)
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


	protected ActivityCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ContextCompat()>
	//    2    4:return          
	}

	private static ActivityCompatApi21.SharedElementCallback21 createCallback(SharedElementCallback sharedelementcallback)
	{
		SharedElementCallback21Impl sharedelementcallback21impl = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(sharedelementcallback != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          15
			sharedelementcallback21impl = new SharedElementCallback21Impl(sharedelementcallback);
	//    4    6:new             #11  <Class ActivityCompat$SharedElementCallback21Impl>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void ActivityCompat$SharedElementCallback21Impl(SharedElementCallback)>
	//    8   14:astore_1        
		return ((ActivityCompatApi21.SharedElementCallback21) (sharedelementcallback21impl));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static ActivityCompatApi23.SharedElementCallback23 createCallback23(SharedElementCallback sharedelementcallback)
	{
		SharedElementCallback23Impl sharedelementcallback23impl = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(sharedelementcallback != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          15
			sharedelementcallback23impl = new SharedElementCallback23Impl(sharedelementcallback);
	//    4    6:new             #14  <Class ActivityCompat$SharedElementCallback23Impl>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void ActivityCompat$SharedElementCallback23Impl(SharedElementCallback)>
	//    8   14:astore_1        
		return ((ActivityCompatApi23.SharedElementCallback23) (sharedelementcallback23impl));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public static void finishAffinity(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			ActivityCompatJB.finishAffinity(activity);
	//    3    8:aload_0         
	//    4    9:invokestatic    #42  <Method void ActivityCompatJB.finishAffinity(Activity)>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #47  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static void finishAfterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			ActivityCompatApi21.finishAfterTransition(activity);
	//    3    8:aload_0         
	//    4    9:invokestatic    #52  <Method void ActivityCompatApi21.finishAfterTransition(Activity)>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #47  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static Uri getReferrer(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          13
			return ActivityCompatApi22.getReferrer(activity);
	//    3    8:aload_0         
	//    4    9:invokestatic    #59  <Method Uri ActivityCompatApi22.getReferrer(Activity)>
	//    5   12:areturn         
		activity = ((Activity) (activity.getIntent()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #63  <Method Intent Activity.getIntent()>
	//    8   17:astore_0        
		Uri uri = (Uri)((Intent) (activity)).getParcelableExtra("android.intent.extra.REFERRER");
	//    9   18:aload_0         
	//   10   19:ldc1            #65  <String "android.intent.extra.REFERRER">
	//   11   21:invokevirtual   #71  <Method Parcelable Intent.getParcelableExtra(String)>
	//   12   24:checkcast       #73  <Class Uri>
	//   13   27:astore_1        
		if(uri != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          34
			return uri;
	//   16   32:aload_1         
	//   17   33:areturn         
		activity = ((Activity) (((Intent) (activity)).getStringExtra("android.intent.extra.REFERRER_NAME")));
	//   18   34:aload_0         
	//   19   35:ldc1            #75  <String "android.intent.extra.REFERRER_NAME">
	//   20   37:invokevirtual   #79  <Method String Intent.getStringExtra(String)>
	//   21   40:astore_0        
		if(activity != null)
	//*  22   41:aload_0         
	//*  23   42:ifnull          50
			return Uri.parse(((String) (activity)));
	//   24   45:aload_0         
	//   25   46:invokestatic    #83  <Method Uri Uri.parse(String)>
	//   26   49:areturn         
		else
			return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
	}

	public static boolean invalidateOptionsMenu(Activity activity)
	{
		activity.invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method void Activity.invalidateOptionsMenu()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public static void postponeEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			ActivityCompatApi21.postponeEnterTransition(activity);
	//    3    8:aload_0         
	//    4    9:invokestatic    #91  <Method void ActivityCompatApi21.postponeEnterTransition(Activity)>
	//    5   12:return          
	}

	public static void requestPermissions(Activity activity, String as[], int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          15
		{
			ActivityCompatApi23.requestPermissions(activity, as, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokestatic    #102 <Method void ActivityCompatApi23.requestPermissions(Activity, String[], int)>
			return;
	//    7   14:return          
		}
		if(activity instanceof OnRequestPermissionsResultCallback)
	//*   8   15:aload_0         
	//*   9   16:instanceof      #8   <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//*  10   19:ifeq            46
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
	//   11   22:new             #104 <Class Handler>
	//   12   25:dup             
	//   13   26:invokestatic    #110 <Method Looper Looper.getMainLooper()>
	//   14   29:invokespecial   #113 <Method void Handler(Looper)>
	//   15   32:new             #6   <Class ActivityCompat$1>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:iload_2         
	//   20   39:invokespecial   #116 <Method void ActivityCompat$1(String[], Activity, int)>
	//   21   42:invokevirtual   #120 <Method boolean Handler.post(Runnable)>
	//   22   45:pop             
	//   23   46:return          
	}

	public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedelementcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			ActivityCompatApi23.setEnterSharedElementCallback(activity, createCallback23(sharedelementcallback));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #125 <Method ActivityCompatApi23$SharedElementCallback23 createCallback23(SharedElementCallback)>
	//    6   13:invokestatic    #128 <Method void ActivityCompatApi23.setEnterSharedElementCallback(Activity, ActivityCompatApi23$SharedElementCallback23)>
			return;
	//    7   16:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   17:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          21
	//*  10   22:icmplt          33
			ActivityCompatApi21.setEnterSharedElementCallback(activity, createCallback(sharedelementcallback));
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokestatic    #130 <Method ActivityCompatApi21$SharedElementCallback21 createCallback(SharedElementCallback)>
	//   14   30:invokestatic    #133 <Method void ActivityCompatApi21.setEnterSharedElementCallback(Activity, ActivityCompatApi21$SharedElementCallback21)>
	//   15   33:return          
	}

	public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedelementcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
		{
			ActivityCompatApi23.setExitSharedElementCallback(activity, createCallback23(sharedelementcallback));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #125 <Method ActivityCompatApi23$SharedElementCallback23 createCallback23(SharedElementCallback)>
	//    6   13:invokestatic    #136 <Method void ActivityCompatApi23.setExitSharedElementCallback(Activity, ActivityCompatApi23$SharedElementCallback23)>
			return;
	//    7   16:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   17:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          21
	//*  10   22:icmplt          33
			ActivityCompatApi21.setExitSharedElementCallback(activity, createCallback(sharedelementcallback));
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokestatic    #130 <Method ActivityCompatApi21$SharedElementCallback21 createCallback(SharedElementCallback)>
	//   14   30:invokestatic    #138 <Method void ActivityCompatApi21.setExitSharedElementCallback(Activity, ActivityCompatApi21$SharedElementCallback21)>
	//   15   33:return          
	}

	public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #142 <Method boolean ActivityCompatApi23.shouldShowRequestPermissionRationale(Activity, String)>
	//    6   13:ireturn         
		else
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
		{
			ActivityCompatJB.startActivityForResult(activity, intent, i, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:invokestatic    #146 <Method void ActivityCompatJB.startActivityForResult(Activity, Intent, int, Bundle)>
			return;
	//    8   15:return          
		} else
		{
			activity.startActivityForResult(intent, i);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #149 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//   13   22:return          
		}
	}

	public static void startIntentSenderForResult(Activity activity, IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          24
		{
			ActivityCompatJB.startIntentSenderForResult(activity, intentsender, i, intent, j, k, l, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:iload           4
	//    8   14:iload           5
	//    9   16:iload           6
	//   10   18:aload           7
	//   11   20:invokestatic    #155 <Method void ActivityCompatJB.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
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
	//   20   34:invokevirtual   #158 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
			return;
	//   21   37:return          
		}
	}

	public static void startPostponedEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			ActivityCompatApi21.startPostponedEnterTransition(activity);
	//    3    8:aload_0         
	//    4    9:invokestatic    #162 <Method void ActivityCompatApi21.startPostponedEnterTransition(Activity)>
	//    5   12:return          
	}
}
