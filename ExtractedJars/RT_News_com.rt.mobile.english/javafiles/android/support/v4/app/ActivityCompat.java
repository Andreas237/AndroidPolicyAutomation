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
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v13.view.DragAndDropPermissionsCompat;
import android.support.v4.content.ContextCompat;
import android.view.DragEvent;
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

		SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
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

	private static class SharedElementCallback23Impl extends SharedElementCallback21Impl
	{

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

				final SharedElementCallback23Impl this$0;
				final android.app.SharedElementCallback.OnSharedElementsReadyListener val$listener;

			
			{
				this$0 = final_sharedelementcallback23impl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityCompat$SharedElementCallback23Impl this$0>
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
		//    1    1:getfield        #23  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:new             #9   <Class ActivityCompat$SharedElementCallback23Impl$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:invokespecial   #26  <Method void ActivityCompat$SharedElementCallback23Impl$1(ActivityCompat$SharedElementCallback23Impl, android.app.SharedElementCallback$OnSharedElementsReadyListener)>
		//    9   15:invokevirtual   #31  <Method void SharedElementCallback.onSharedElementsArrived(List, List, SharedElementCallback$OnSharedElementsReadyListener)>
		//   10   18:return          
		}

		SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
		{
			super(sharedelementcallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
		//    3    5:return          
		}
	}


	protected ActivityCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ContextCompat()>
	//    2    4:return          
	}

	public static void finishAffinity(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			activity.finishAffinity();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #43  <Method void Activity.finishAffinity()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #46  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static void finishAfterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			activity.finishAfterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #50  <Method void Activity.finishAfterTransition()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #46  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static PermissionCompatDelegate getPermissionCompatDelegate()
	{
		return sDelegate;
	//    0    0:getstatic       #58  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//    1    3:areturn         
	}

	public static Uri getReferrer(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          13
			return activity.getReferrer();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #65  <Method Uri Activity.getReferrer()>
	//    5   12:areturn         
		activity = ((Activity) (activity.getIntent()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #69  <Method Intent Activity.getIntent()>
	//    8   17:astore_0        
		Uri uri = (Uri)((Intent) (activity)).getParcelableExtra("android.intent.extra.REFERRER");
	//    9   18:aload_0         
	//   10   19:ldc1            #71  <String "android.intent.extra.REFERRER">
	//   11   21:invokevirtual   #77  <Method Parcelable Intent.getParcelableExtra(String)>
	//   12   24:checkcast       #79  <Class Uri>
	//   13   27:astore_1        
		if(uri != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          34
			return uri;
	//   16   32:aload_1         
	//   17   33:areturn         
		activity = ((Activity) (((Intent) (activity)).getStringExtra("android.intent.extra.REFERRER_NAME")));
	//   18   34:aload_0         
	//   19   35:ldc1            #81  <String "android.intent.extra.REFERRER_NAME">
	//   20   37:invokevirtual   #85  <Method String Intent.getStringExtra(String)>
	//   21   40:astore_0        
		if(activity != null)
	//*  22   41:aload_0         
	//*  23   42:ifnull          50
			return Uri.parse(((String) (activity)));
	//   24   45:aload_0         
	//   25   46:invokestatic    #89  <Method Uri Uri.parse(String)>
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
	//    1    1:invokevirtual   #94  <Method void Activity.invalidateOptionsMenu()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public static void postponeEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.postponeEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #98  <Method void Activity.postponeEnterTransition()>
	//    5   12:return          
	}

	public static DragAndDropPermissionsCompat requestDragAndDropPermissions(Activity activity, DragEvent dragevent)
	{
		return DragAndDropPermissionsCompat.request(activity, dragevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #105 <Method DragAndDropPermissionsCompat DragAndDropPermissionsCompat.request(Activity, DragEvent)>
	//    3    5:areturn         
	}

	public static void requestPermissions(Activity activity, String as[], int i)
	{
		if(sDelegate != null && sDelegate.requestPermissions(activity, as, i))
	//*   0    0:getstatic       #58  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//*   1    3:ifnull          21
	//*   2    6:getstatic       #58  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//*   3    9:aload_0         
	//*   4   10:aload_1         
	//*   5   11:iload_2         
	//*   6   12:invokeinterface #114 <Method boolean ActivityCompat$PermissionCompatDelegate.requestPermissions(Activity, String[], int)>
	//*   7   17:ifeq            21
			return;
	//    8   20:return          
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   9   21:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   24:bipush          23
	//*  11   26:icmplt          53
		{
			if(activity instanceof RequestPermissionsRequestCodeValidator)
	//*  12   29:aload_0         
	//*  13   30:instanceof      #14  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//*  14   33:ifeq            46
				((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(i);
	//   15   36:aload_0         
	//   16   37:checkcast       #14  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//   17   40:iload_2         
	//   18   41:invokeinterface #118 <Method void ActivityCompat$RequestPermissionsRequestCodeValidator.validateRequestPermissionsRequestCode(int)>
			activity.requestPermissions(as, i);
	//   19   46:aload_0         
	//   20   47:aload_1         
	//   21   48:iload_2         
	//   22   49:invokevirtual   #121 <Method void Activity.requestPermissions(String[], int)>
			return;
	//   23   52:return          
		}
		if(activity instanceof OnRequestPermissionsResultCallback)
	//*  24   53:aload_0         
	//*  25   54:instanceof      #8   <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//*  26   57:ifeq            84
			(new Handler(Looper.getMainLooper())).post(new Runnable(as, activity, i) {

				public void run()
				{
					Object aobj[] = ((Object []) (permissions));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field String[] val$permissions>
				//    2    4:astore_3        
					int j = 0;
				//    3    5:iconst_0        
				//    4    6:istore_1        
					aobj = ((Object []) (new int[aobj.length]));
				//    5    7:aload_3         
				//    6    8:arraylength     
				//    7    9:newarray        int[]
				//    8   11:astore_3        
					PackageManager packagemanager = activity.getPackageManager();
				//    9   12:aload_0         
				//   10   13:getfield        #23  <Field Activity val$activity>
				//   11   16:invokevirtual   #36  <Method PackageManager Activity.getPackageManager()>
				//   12   19:astore          4
					String s = activity.getPackageName();
				//   13   21:aload_0         
				//   14   22:getfield        #23  <Field Activity val$activity>
				//   15   25:invokevirtual   #40  <Method String Activity.getPackageName()>
				//   16   28:astore          5
					for(int k = permissions.length; j < k; j++)
				//*  17   30:aload_0         
				//*  18   31:getfield        #21  <Field String[] val$permissions>
				//*  19   34:arraylength     
				//*  20   35:istore_2        
				//*  21   36:iload_1         
				//*  22   37:iload_2         
				//*  23   38:icmpge          64
						aobj[j] = packagemanager.checkPermission(permissions[j], s);
				//   24   41:aload_3         
				//   25   42:iload_1         
				//   26   43:aload           4
				//   27   45:aload_0         
				//   28   46:getfield        #21  <Field String[] val$permissions>
				//   29   49:iload_1         
				//   30   50:aaload          
				//   31   51:aload           5
				//   32   53:invokevirtual   #46  <Method int PackageManager.checkPermission(String, String)>
				//   33   56:iastore         

				//   34   57:iload_1         
				//   35   58:iconst_1        
				//   36   59:iadd            
				//   37   60:istore_1        
				//*  38   61:goto            36
					((OnRequestPermissionsResultCallback)activity).onRequestPermissionsResult(requestCode, permissions, ((int []) (aobj)));
				//   39   64:aload_0         
				//   40   65:getfield        #23  <Field Activity val$activity>
				//   41   68:checkcast       #48  <Class ActivityCompat$OnRequestPermissionsResultCallback>
				//   42   71:aload_0         
				//   43   72:getfield        #25  <Field int val$requestCode>
				//   44   75:aload_0         
				//   45   76:getfield        #21  <Field String[] val$permissions>
				//   46   79:aload_3         
				//   47   80:invokeinterface #52  <Method void ActivityCompat$OnRequestPermissionsResultCallback.onRequestPermissionsResult(int, String[], int[])>
				//   48   85:return          
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
	//   27   60:new             #123 <Class Handler>
	//   28   63:dup             
	//   29   64:invokestatic    #129 <Method Looper Looper.getMainLooper()>
	//   30   67:invokespecial   #132 <Method void Handler(Looper)>
	//   31   70:new             #6   <Class ActivityCompat$1>
	//   32   73:dup             
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:iload_2         
	//   36   77:invokespecial   #135 <Method void ActivityCompat$1(String[], Activity, int)>
	//   37   80:invokevirtual   #139 <Method boolean Handler.post(Runnable)>
	//   38   83:pop             
	//   39   84:return          
	}

	public static View requireViewById(Activity activity, int i)
	{
		activity = ((Activity) (activity.findViewById(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #146 <Method View Activity.findViewById(int)>
	//    3    5:astore_0        
		if(activity == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       20
			throw new IllegalArgumentException("ID does not reference a View inside this Activity");
	//    6   10:new             #148 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc1            #150 <String "ID does not reference a View inside this Activity">
	//    9   16:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   10   19:athrow          
		else
			return ((View) (activity));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	public static void setEnterSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		SharedElementCallback23Impl sharedelementcallback23impl = null;
	//    4    7:aconst_null     
	//    5    8:astore_3        
		if(i >= 23)
	//*   6    9:iload_2         
	//*   7   10:bipush          23
	//*   8   12:icmplt          34
		{
			if(sharedelementcallback != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
				sharedelementcallback23impl = new SharedElementCallback23Impl(sharedelementcallback);
	//   11   19:new             #20  <Class ActivityCompat$SharedElementCallback23Impl>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #160 <Method void ActivityCompat$SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback)>
	//   15   27:astore_3        
			activity.setEnterSharedElementCallback(((SharedElementCallback) (sharedelementcallback23impl)));
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #163 <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
			return;
	//   19   33:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  20   34:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   37:bipush          21
	//*  22   39:icmplt          63
		{
			SharedElementCallback21Impl sharedelementcallback21impl = ((SharedElementCallback21Impl) (obj));
	//   23   42:aload           4
	//   24   44:astore_3        
			if(sharedelementcallback != null)
	//*  25   45:aload_1         
	//*  26   46:ifnull          58
				sharedelementcallback21impl = new SharedElementCallback21Impl(sharedelementcallback);
	//   27   49:new             #17  <Class ActivityCompat$SharedElementCallback21Impl>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #164 <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//   31   57:astore_3        
			activity.setEnterSharedElementCallback(((SharedElementCallback) (sharedelementcallback21impl)));
	//   32   58:aload_0         
	//   33   59:aload_3         
	//   34   60:invokevirtual   #163 <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
		}
	//   35   63:return          
	}

	public static void setExitSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		SharedElementCallback23Impl sharedelementcallback23impl = null;
	//    4    7:aconst_null     
	//    5    8:astore_3        
		if(i >= 23)
	//*   6    9:iload_2         
	//*   7   10:bipush          23
	//*   8   12:icmplt          34
		{
			if(sharedelementcallback != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
				sharedelementcallback23impl = new SharedElementCallback23Impl(sharedelementcallback);
	//   11   19:new             #20  <Class ActivityCompat$SharedElementCallback23Impl>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #160 <Method void ActivityCompat$SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback)>
	//   15   27:astore_3        
			activity.setExitSharedElementCallback(((SharedElementCallback) (sharedelementcallback23impl)));
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #167 <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
			return;
	//   19   33:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  20   34:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   37:bipush          21
	//*  22   39:icmplt          63
		{
			SharedElementCallback21Impl sharedelementcallback21impl = ((SharedElementCallback21Impl) (obj));
	//   23   42:aload           4
	//   24   44:astore_3        
			if(sharedelementcallback != null)
	//*  25   45:aload_1         
	//*  26   46:ifnull          58
				sharedelementcallback21impl = new SharedElementCallback21Impl(sharedelementcallback);
	//   27   49:new             #17  <Class ActivityCompat$SharedElementCallback21Impl>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #164 <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//   31   57:astore_3        
			activity.setExitSharedElementCallback(((SharedElementCallback) (sharedelementcallback21impl)));
	//   32   58:aload_0         
	//   33   59:aload_3         
	//   34   60:invokevirtual   #167 <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
		}
	//   35   63:return          
	}

	public static void setPermissionCompatDelegate(PermissionCompatDelegate permissioncompatdelegate)
	{
		sDelegate = permissioncompatdelegate;
	//    0    0:aload_0         
	//    1    1:putstatic       #58  <Field ActivityCompat$PermissionCompatDelegate sDelegate>
	//    2    4:return          
	}

	public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return activity.shouldShowRequestPermissionRationale(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #174 <Method boolean Activity.shouldShowRequestPermissionRationale(String)>
	//    6   13:ireturn         
		else
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
		{
			activity.startActivityForResult(intent, i, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #179 <Method void Activity.startActivityForResult(Intent, int, Bundle)>
			return;
	//    8   15:return          
		} else
		{
			activity.startActivityForResult(intent, i);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #182 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//   13   22:return          
		}
	}

	public static void startIntentSenderForResult(Activity activity, IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
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
	//   11   20:invokevirtual   #189 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
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
	//   20   34:invokevirtual   #192 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
			return;
	//   21   37:return          
		}
	}

	public static void startPostponedEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.startPostponedEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #196 <Method void Activity.startPostponedEnterTransition()>
	//    5   12:return          
	}

	private static PermissionCompatDelegate sDelegate;
}
