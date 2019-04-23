// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.widget.RemoteViews;
import java.util.List;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback, ICustomTabsService

public final class CustomTabsSession
{

	CustomTabsSession(ICustomTabsService icustomtabsservice, ICustomTabsCallback icustomtabscallback, ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object mLock>
		mService = icustomtabsservice;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field ICustomTabsService mService>
		mCallback = icustomtabscallback;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #27  <Field ICustomTabsCallback mCallback>
		mComponentName = componentname;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #29  <Field ComponentName mComponentName>
	//   16   30:return          
	}

	public static CustomTabsSession createMockSessionForTesting(ComponentName componentname)
	{
		return new CustomTabsSession(((ICustomTabsService) (null)), ((ICustomTabsCallback) (new CustomTabsSessionToken.MockCallback())), componentname);
	//    0    0:new             #2   <Class CustomTabsSession>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #36  <Class CustomTabsSessionToken$MockCallback>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void CustomTabsSessionToken$MockCallback()>
	//    6   12:aload_0         
	//    7   13:invokespecial   #39  <Method void CustomTabsSession(ICustomTabsService, ICustomTabsCallback, ComponentName)>
	//    8   16:areturn         
	}

	IBinder getBinder()
	{
		return mCallback.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ICustomTabsCallback mCallback>
	//    2    4:invokeinterface #48  <Method IBinder ICustomTabsCallback.asBinder()>
	//    3    9:areturn         
	}

	ComponentName getComponentName()
	{
		return mComponentName;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ComponentName mComponentName>
	//    2    4:areturn         
	}

	public boolean mayLaunchUrl(Uri uri, Bundle bundle, List list)
	{
		boolean flag;
		try
		{
			flag = mService.mayLaunchUrl(mCallback, uri, bundle, list);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ICustomTabsService mService>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field ICustomTabsCallback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #59  <Method boolean ICustomTabsService.mayLaunchUrl(ICustomTabsCallback, Uri, Bundle, List)>
	//    8   16:istore          4
		}
	//*   9   18:iload           4
	//*  10   20:ireturn         
	//*  11   21:iconst_0        
	//*  12   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			return false;
		}
		return flag;
	//*  13   23:astore_1        
	//*  14   24:goto            21
	}

	public int postMessage(String s, Bundle bundle)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object mLock>
	//*   2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i;
		synchronized(mLock)
		{
			i = mService.postMessage(mCallback, s, bundle);
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field ICustomTabsService mService>
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field ICustomTabsCallback mCallback>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokeinterface #66  <Method int ICustomTabsService.postMessage(ICustomTabsCallback, String, Bundle)>
	//   12   24:istore_3        
		}
	//   13   25:aload           4
	//   14   27:monitorexit     
		return i;
	//   15   28:iload_3         
	//   16   29:ireturn         
_L1:
		obj;
	//   17   30:aload           4
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		return -2;
	//   19   33:bipush          -2
	//   20   35:ireturn         
_L2:
		obj;
	//   21   36:aload           4
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		throw s;
	//   23   39:aload_1         
	//   24   40:athrow          
		s;
	//   25   41:astore_1        
		  goto _L1
	//*  26   42:goto            30
		s;
	//   27   45:astore_1        
		  goto _L2
	//*  28   46:goto            36
	}

	public boolean requestPostMessageChannel(Uri uri)
	{
		boolean flag;
		try
		{
			flag = mService.requestPostMessageChannel(mCallback, uri);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ICustomTabsService mService>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field ICustomTabsCallback mCallback>
	//    4    8:aload_1         
	//    5    9:invokeinterface #71  <Method boolean ICustomTabsService.requestPostMessageChannel(ICustomTabsCallback, Uri)>
	//    6   14:istore_2        
		}
	//*   7   15:iload_2         
	//*   8   16:ireturn         
	//*   9   17:iconst_0        
	//*  10   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			return false;
		}
		return flag;
	//*  11   19:astore_1        
	//*  12   20:goto            17
	}

	public boolean setActionButton(Bitmap bitmap, String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #75  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Bundle()>
	//    3    7:astore          4
		bundle.putParcelable("android.support.customtabs.customaction.ICON", ((android.os.Parcelable) (bitmap)));
	//    4    9:aload           4
	//    5   11:ldc1            #78  <String "android.support.customtabs.customaction.ICON">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #82  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putString("android.support.customtabs.customaction.DESCRIPTION", s);
	//    8   17:aload           4
	//    9   19:ldc1            #84  <String "android.support.customtabs.customaction.DESCRIPTION">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #88  <Method void Bundle.putString(String, String)>
		bitmap = ((Bitmap) (new Bundle()));
	//   12   25:new             #75  <Class Bundle>
	//   13   28:dup             
	//   14   29:invokespecial   #76  <Method void Bundle()>
	//   15   32:astore_1        
		((Bundle) (bitmap)).putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
	//   16   33:aload_1         
	//   17   34:ldc1            #90  <String "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE">
	//   18   36:aload           4
	//   19   38:invokevirtual   #94  <Method void Bundle.putBundle(String, Bundle)>
		boolean flag;
		try
		{
			flag = mService.updateVisuals(mCallback, ((Bundle) (bitmap)));
	//   20   41:aload_0         
	//   21   42:getfield        #25  <Field ICustomTabsService mService>
	//   22   45:aload_0         
	//   23   46:getfield        #27  <Field ICustomTabsCallback mCallback>
	//   24   49:aload_1         
	//   25   50:invokeinterface #98  <Method boolean ICustomTabsService.updateVisuals(ICustomTabsCallback, Bundle)>
	//   26   55:istore_3        
		}
	//*  27   56:iload_3         
	//*  28   57:ireturn         
	//*  29   58:iconst_0        
	//*  30   59:ireturn         
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap)
		{
			return false;
		}
		return flag;
	//*  31   60:astore_1        
	//*  32   61:goto            58
	}

	public boolean setSecondaryToolbarViews(RemoteViews remoteviews, int ai[], PendingIntent pendingintent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #75  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Bundle()>
	//    3    7:astore          5
		bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", ((android.os.Parcelable) (remoteviews)));
	//    4    9:aload           5
	//    5   11:ldc1            #103 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #82  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", ai);
	//    8   17:aload           5
	//    9   19:ldc1            #105 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #109 <Method void Bundle.putIntArray(String, int[])>
		bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", ((android.os.Parcelable) (pendingintent)));
	//   12   25:aload           5
	//   13   27:ldc1            #111 <String "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT">
	//   14   29:aload_3         
	//   15   30:invokevirtual   #82  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		boolean flag;
		try
		{
			flag = mService.updateVisuals(mCallback, bundle);
	//   16   33:aload_0         
	//   17   34:getfield        #25  <Field ICustomTabsService mService>
	//   18   37:aload_0         
	//   19   38:getfield        #27  <Field ICustomTabsCallback mCallback>
	//   20   41:aload           5
	//   21   43:invokeinterface #98  <Method boolean ICustomTabsService.updateVisuals(ICustomTabsCallback, Bundle)>
	//   22   48:istore          4
		}
	//*  23   50:iload           4
	//*  24   52:ireturn         
	//*  25   53:iconst_0        
	//*  26   54:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteViews remoteviews)
		{
			return false;
		}
		return flag;
	//*  27   55:astore_1        
	//*  28   56:goto            53
	}

	public boolean setToolbarItem(int i, Bitmap bitmap, String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #75  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Bundle()>
	//    3    7:astore          5
		bundle.putInt("android.support.customtabs.customaction.ID", i);
	//    4    9:aload           5
	//    5   11:ldc1            #116 <String "android.support.customtabs.customaction.ID">
	//    6   13:iload_1         
	//    7   14:invokevirtual   #120 <Method void Bundle.putInt(String, int)>
		bundle.putParcelable("android.support.customtabs.customaction.ICON", ((android.os.Parcelable) (bitmap)));
	//    8   17:aload           5
	//    9   19:ldc1            #78  <String "android.support.customtabs.customaction.ICON">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #82  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putString("android.support.customtabs.customaction.DESCRIPTION", s);
	//   12   25:aload           5
	//   13   27:ldc1            #84  <String "android.support.customtabs.customaction.DESCRIPTION">
	//   14   29:aload_3         
	//   15   30:invokevirtual   #88  <Method void Bundle.putString(String, String)>
		bitmap = ((Bitmap) (new Bundle()));
	//   16   33:new             #75  <Class Bundle>
	//   17   36:dup             
	//   18   37:invokespecial   #76  <Method void Bundle()>
	//   19   40:astore_2        
		((Bundle) (bitmap)).putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
	//   20   41:aload_2         
	//   21   42:ldc1            #90  <String "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE">
	//   22   44:aload           5
	//   23   46:invokevirtual   #94  <Method void Bundle.putBundle(String, Bundle)>
		boolean flag;
		try
		{
			flag = mService.updateVisuals(mCallback, ((Bundle) (bitmap)));
	//   24   49:aload_0         
	//   25   50:getfield        #25  <Field ICustomTabsService mService>
	//   26   53:aload_0         
	//   27   54:getfield        #27  <Field ICustomTabsCallback mCallback>
	//   28   57:aload_2         
	//   29   58:invokeinterface #98  <Method boolean ICustomTabsService.updateVisuals(ICustomTabsCallback, Bundle)>
	//   30   63:istore          4
		}
	//*  31   65:iload           4
	//*  32   67:ireturn         
	//*  33   68:iconst_0        
	//*  34   69:ireturn         
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap)
		{
			return false;
		}
		return flag;
	//*  35   70:astore_2        
	//*  36   71:goto            68
	}

	public boolean validateRelationship(int i, Uri uri, Bundle bundle)
	{
		if(i >= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          33
		{
			if(i > 2)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmple          12
				return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
			boolean flag;
			try
			{
				flag = mService.validateRelationship(mCallback, i, uri, bundle);
	//    8   12:aload_0         
	//    9   13:getfield        #25  <Field ICustomTabsService mService>
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field ICustomTabsCallback mCallback>
	//   12   20:iload_1         
	//   13   21:aload_2         
	//   14   22:aload_3         
	//   15   23:invokeinterface #126 <Method boolean ICustomTabsService.validateRelationship(ICustomTabsCallback, int, Uri, Bundle)>
	//   16   28:istore          4
			}
	//*  17   30:iload           4
	//*  18   32:ireturn         
	//*  19   33:iconst_0        
	//*  20   34:ireturn         
			// Misplaced declaration of an exception variable
			catch(Uri uri)
	//*  21   35:astore_2        
			{
				return false;
	//   22   36:iconst_0        
	//   23   37:ireturn         
			}
			return flag;
		} else
		{
			return false;
		}
	}

	private static final String TAG = "CustomTabsSession";
	private final ICustomTabsCallback mCallback;
	private final ComponentName mComponentName;
	private final Object mLock = new Object();
	private final ICustomTabsService mService;
}
