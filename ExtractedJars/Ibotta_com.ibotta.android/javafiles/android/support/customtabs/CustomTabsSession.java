// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.*;
import java.util.List;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback, ICustomTabsService

public final class CustomTabsSession
{

	CustomTabsSession(ICustomTabsService icustomtabsservice, ICustomTabsCallback icustomtabscallback, ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Object()>
	//    6   12:putfield        #19  <Field Object mLock>
		mService = icustomtabsservice;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #21  <Field ICustomTabsService mService>
		mCallback = icustomtabscallback;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #23  <Field ICustomTabsCallback mCallback>
		mComponentName = componentname;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #25  <Field ComponentName mComponentName>
	//   16   30:return          
	}

	IBinder getBinder()
	{
		return mCallback.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ICustomTabsCallback mCallback>
	//    2    4:invokeinterface #33  <Method IBinder ICustomTabsCallback.asBinder()>
	//    3    9:areturn         
	}

	ComponentName getComponentName()
	{
		return mComponentName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ComponentName mComponentName>
	//    2    4:areturn         
	}

	public boolean mayLaunchUrl(Uri uri, Bundle bundle, List list)
	{
		boolean flag;
		try
		{
			flag = mService.mayLaunchUrl(mCallback, uri, bundle, list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ICustomTabsService mService>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field ICustomTabsCallback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #44  <Method boolean ICustomTabsService.mayLaunchUrl(ICustomTabsCallback, Uri, Bundle, List)>
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

	private final ICustomTabsCallback mCallback;
	private final ComponentName mComponentName;
	private final Object mLock = new Object();
	private final ICustomTabsService mService;
}
