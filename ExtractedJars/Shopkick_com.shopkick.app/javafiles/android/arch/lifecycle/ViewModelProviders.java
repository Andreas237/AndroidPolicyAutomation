// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package android.arch.lifecycle:
//			ViewModelProvider, ViewModelStores

public class ViewModelProviders
{
	public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory
	{

		public DefaultFactory(Application application)
		{
			super(application);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void ViewModelProvider$AndroidViewModelFactory(Application)>
		//    3    5:return          
		}
	}


	public ViewModelProviders()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static Activity checkActivity(Fragment fragment)
	{
		fragment = ((Fragment) (fragment.getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method FragmentActivity Fragment.getActivity()>
	//    2    4:astore_0        
		if(fragment != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          11
			return ((Activity) (fragment));
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
	//    7   11:new             #24  <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc1            #26  <String "Can't create ViewModelProvider for detached fragment">
	//   10   17:invokespecial   #29  <Method void IllegalStateException(String)>
	//   11   20:athrow          
	}

	private static Application checkApplication(Activity activity)
	{
		activity = ((Activity) (activity.getApplication()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Application Activity.getApplication()>
	//    2    4:astore_0        
		if(activity != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          11
			return ((Application) (activity));
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
	//    7   11:new             #24  <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc1            #39  <String "Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.">
	//   10   17:invokespecial   #29  <Method void IllegalStateException(String)>
	//   11   20:athrow          
	}

	public static ViewModelProvider of(Fragment fragment)
	{
		return of(fragment, ((ViewModelProvider.Factory) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #46  <Method ViewModelProvider of(Fragment, ViewModelProvider$Factory)>
	//    3    5:areturn         
	}

	public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory)
	{
		Application application = checkApplication(checkActivity(fragment));
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method Activity checkActivity(Fragment)>
	//    2    4:invokestatic    #53  <Method Application checkApplication(Activity)>
	//    3    7:astore_3        
		Object obj = ((Object) (factory));
	//    4    8:aload_1         
	//    5    9:astore_2        
		if(factory == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			obj = ((Object) (ViewModelProvider.AndroidViewModelFactory.getInstance(application)));
	//    8   14:aload_3         
	//    9   15:invokestatic    #59  <Method ViewModelProvider$AndroidViewModelFactory ViewModelProvider$AndroidViewModelFactory.getInstance(Application)>
	//   10   18:astore_2        
		return new ViewModelProvider(ViewModelStores.of(fragment), ((ViewModelProvider.Factory) (obj)));
	//   11   19:new             #61  <Class ViewModelProvider>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokestatic    #66  <Method ViewModelStore ViewModelStores.of(Fragment)>
	//   15   27:aload_2         
	//   16   28:invokespecial   #69  <Method void ViewModelProvider(ViewModelStore, ViewModelProvider$Factory)>
	//   17   31:areturn         
	}

	public static ViewModelProvider of(FragmentActivity fragmentactivity)
	{
		return of(fragmentactivity, ((ViewModelProvider.Factory) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #73  <Method ViewModelProvider of(FragmentActivity, ViewModelProvider$Factory)>
	//    3    5:areturn         
	}

	public static ViewModelProvider of(FragmentActivity fragmentactivity, ViewModelProvider.Factory factory)
	{
		Application application = checkApplication(((Activity) (fragmentactivity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method Application checkApplication(Activity)>
	//    2    4:astore_3        
		Object obj = ((Object) (factory));
	//    3    5:aload_1         
	//    4    6:astore_2        
		if(factory == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
			obj = ((Object) (ViewModelProvider.AndroidViewModelFactory.getInstance(application)));
	//    7   11:aload_3         
	//    8   12:invokestatic    #59  <Method ViewModelProvider$AndroidViewModelFactory ViewModelProvider$AndroidViewModelFactory.getInstance(Application)>
	//    9   15:astore_2        
		return new ViewModelProvider(ViewModelStores.of(fragmentactivity), ((ViewModelProvider.Factory) (obj)));
	//   10   16:new             #61  <Class ViewModelProvider>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:invokestatic    #76  <Method ViewModelStore ViewModelStores.of(FragmentActivity)>
	//   14   24:aload_2         
	//   15   25:invokespecial   #69  <Method void ViewModelProvider(ViewModelStore, ViewModelProvider$Factory)>
	//   16   28:areturn         
	}
}
