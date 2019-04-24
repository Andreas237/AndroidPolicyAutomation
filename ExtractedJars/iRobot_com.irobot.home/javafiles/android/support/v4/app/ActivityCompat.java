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
import android.support.v4.content.a;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			SharedElementCallback

public class ActivityCompat extends a
{
	public static interface OnRequestPermissionsResultCallback
	{

		public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
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
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
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
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #27  <Method View SharedElementCallback.onCreateSnapshotView(Context, Parcelable)>
		//    5    9:areturn         
		}

		public void onMapSharedElements(List list, Map map)
		{
			mCallback.onMapSharedElements(list, map);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method void SharedElementCallback.onMapSharedElements(List, Map)>
		//    5    9:return          
		}

		public void onRejectSharedElements(List list)
		{
			mCallback.onRejectSharedElements(list);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method void SharedElementCallback.onRejectSharedElements(List)>
		//    4    8:return          
		}

		public void onSharedElementEnd(List list, List list1, List list2)
		{
			mCallback.onSharedElementEnd(list, list1, list2);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
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
		//    1    1:getfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #46  <Method void SharedElementCallback.onSharedElementStart(List, List, List)>
		//    6   10:return          
		}

		protected android.support.v4.app.SharedElementCallback mCallback;

		public SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void SharedElementCallback()>
			mCallback = sharedelementcallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field android.support.v4.app.SharedElementCallback mCallback>
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
		//    1    1:getfield        #20  <Field android.support.v4.app.SharedElementCallback mCallback>
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

		public SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback sharedelementcallback)
		{
			super(sharedelementcallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
		//    3    5:return          
		}
	}


	protected ActivityCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void a()>
	//    2    4:return          
	}

	public static void finishAffinity(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			activity.finishAffinity();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #37  <Method void Activity.finishAffinity()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #40  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static void finishAfterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			activity.finishAfterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #43  <Method void Activity.finishAfterTransition()>
			return;
	//    5   12:return          
		} else
		{
			activity.finish();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #40  <Method void Activity.finish()>
			return;
	//    8   17:return          
		}
	}

	public static Uri getReferrer(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          13
			return activity.getReferrer();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #48  <Method Uri Activity.getReferrer()>
	//    5   12:areturn         
		activity = ((Activity) (activity.getIntent()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #52  <Method Intent Activity.getIntent()>
	//    8   17:astore_0        
		Uri uri = (Uri)((Intent) (activity)).getParcelableExtra("android.intent.extra.REFERRER");
	//    9   18:aload_0         
	//   10   19:ldc1            #54  <String "android.intent.extra.REFERRER">
	//   11   21:invokevirtual   #60  <Method Parcelable Intent.getParcelableExtra(String)>
	//   12   24:checkcast       #62  <Class Uri>
	//   13   27:astore_1        
		if(uri != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          34
			return uri;
	//   16   32:aload_1         
	//   17   33:areturn         
		activity = ((Activity) (((Intent) (activity)).getStringExtra("android.intent.extra.REFERRER_NAME")));
	//   18   34:aload_0         
	//   19   35:ldc1            #64  <String "android.intent.extra.REFERRER_NAME">
	//   20   37:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//   21   40:astore_0        
		if(activity != null)
	//*  22   41:aload_0         
	//*  23   42:ifnull          50
			return Uri.parse(((String) (activity)));
	//   24   45:aload_0         
	//   25   46:invokestatic    #72  <Method Uri Uri.parse(String)>
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
	//    1    1:invokevirtual   #76  <Method void Activity.invalidateOptionsMenu()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public static void postponeEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.postponeEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #79  <Method void Activity.postponeEnterTransition()>
	//    5   12:return          
	}

	public static void requestPermissions(Activity activity, String as[], int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          32
		{
			if(activity instanceof RequestPermissionsRequestCodeValidator)
	//*   3    8:aload_0         
	//*   4    9:instanceof      #11  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//*   5   12:ifeq            25
				((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(i);
	//    6   15:aload_0         
	//    7   16:checkcast       #11  <Class ActivityCompat$RequestPermissionsRequestCodeValidator>
	//    8   19:iload_2         
	//    9   20:invokeinterface #85  <Method void ActivityCompat$RequestPermissionsRequestCodeValidator.validateRequestPermissionsRequestCode(int)>
			activity.requestPermissions(as, i);
	//   10   25:aload_0         
	//   11   26:aload_1         
	//   12   27:iload_2         
	//   13   28:invokevirtual   #88  <Method void Activity.requestPermissions(String[], int)>
			return;
	//   14   31:return          
		}
		if(activity instanceof OnRequestPermissionsResultCallback)
	//*  15   32:aload_0         
	//*  16   33:instanceof      #8   <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//*  17   36:ifeq            63
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
	//   18   39:new             #90  <Class Handler>
	//   19   42:dup             
	//   20   43:invokestatic    #96  <Method Looper Looper.getMainLooper()>
	//   21   46:invokespecial   #99  <Method void Handler(Looper)>
	//   22   49:new             #6   <Class ActivityCompat$1>
	//   23   52:dup             
	//   24   53:aload_1         
	//   25   54:aload_0         
	//   26   55:iload_2         
	//   27   56:invokespecial   #102 <Method void ActivityCompat$1(String[], Activity, int)>
	//   28   59:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   29   62:pop             
	//   30   63:return          
	}

	public static void setEnterSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		int i;
		Object obj;
		i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		if(i < 23) goto _L2; else goto _L1
	//    4    6:iload_2         
	//    5    7:bipush          23
	//    6    9:icmplt          31
_L1:
		if(sharedelementcallback != null)
	//*   7   12:aload_1         
	//*   8   13:ifnull          25
			obj = ((Object) (new SharedElementCallback23Impl(sharedelementcallback)));
	//    9   16:new             #17  <Class ActivityCompat$SharedElementCallback23Impl>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:invokespecial   #111 <Method void ActivityCompat$SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback)>
	//   13   24:astore_3        
_L4:
		activity.setEnterSharedElementCallback(((SharedElementCallback) (obj)));
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #114 <Method void Activity.setEnterSharedElementCallback(SharedElementCallback)>
		return;
	//   17   30:return          
_L2:
		if(android.os.Build.VERSION.SDK_INT < 21)
			break; /* Loop/switch isn't completed */
	//   18   31:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//   19   34:bipush          21
	//   20   36:icmplt          55
		if(sharedelementcallback != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          25
			obj = ((Object) (new SharedElementCallback21Impl(sharedelementcallback)));
	//   23   43:new             #14  <Class ActivityCompat$SharedElementCallback21Impl>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #115 <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//   27   51:astore_3        
		if(true) goto _L4; else goto _L3
	//   28   52:goto            25
_L3:
	//   29   55:return          
	}

	public static void setExitSharedElementCallback(Activity activity, android.support.v4.app.SharedElementCallback sharedelementcallback)
	{
		int i;
		Object obj;
		i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		if(i < 23) goto _L2; else goto _L1
	//    4    6:iload_2         
	//    5    7:bipush          23
	//    6    9:icmplt          31
_L1:
		if(sharedelementcallback != null)
	//*   7   12:aload_1         
	//*   8   13:ifnull          25
			obj = ((Object) (new SharedElementCallback23Impl(sharedelementcallback)));
	//    9   16:new             #17  <Class ActivityCompat$SharedElementCallback23Impl>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:invokespecial   #111 <Method void ActivityCompat$SharedElementCallback23Impl(android.support.v4.app.SharedElementCallback)>
	//   13   24:astore_3        
_L4:
		activity.setExitSharedElementCallback(((SharedElementCallback) (obj)));
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #118 <Method void Activity.setExitSharedElementCallback(SharedElementCallback)>
		return;
	//   17   30:return          
_L2:
		if(android.os.Build.VERSION.SDK_INT < 21)
			break; /* Loop/switch isn't completed */
	//   18   31:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//   19   34:bipush          21
	//   20   36:icmplt          55
		if(sharedelementcallback != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          25
			obj = ((Object) (new SharedElementCallback21Impl(sharedelementcallback)));
	//   23   43:new             #14  <Class ActivityCompat$SharedElementCallback21Impl>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #115 <Method void ActivityCompat$SharedElementCallback21Impl(android.support.v4.app.SharedElementCallback)>
	//   27   51:astore_3        
		if(true) goto _L4; else goto _L3
	//   28   52:goto            25
_L3:
	//   29   55:return          
	}

	public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return activity.shouldShowRequestPermissionRationale(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #123 <Method boolean Activity.shouldShowRequestPermissionRationale(String)>
	//    6   13:ireturn         
		else
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
		{
			activity.startActivityForResult(intent, i, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #128 <Method void Activity.startActivityForResult(Intent, int, Bundle)>
			return;
	//    8   15:return          
		} else
		{
			activity.startActivityForResult(intent, i);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #131 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//   13   22:return          
		}
	}

	public static void startIntentSenderForResult(Activity activity, IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
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
	//   11   20:invokevirtual   #136 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
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
	//   20   34:invokevirtual   #139 <Method void Activity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
			return;
	//   21   37:return          
		}
	}

	public static void startPostponedEnterTransition(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
			activity.startPostponedEnterTransition();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #142 <Method void Activity.startPostponedEnterTransition()>
	//    5   12:return          
	}
}
