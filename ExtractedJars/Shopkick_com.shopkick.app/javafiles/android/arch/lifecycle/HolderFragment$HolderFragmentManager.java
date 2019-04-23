// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.*;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package android.arch.lifecycle:
//			HolderFragment, EmptyActivityLifecycleCallbacks

static class HolderFragment$HolderFragmentManager
{

	private static HolderFragment createHolderFragment(FragmentManager fragmentmanager)
	{
		HolderFragment holderfragment = new HolderFragment();
	//    0    0:new             #6   <Class HolderFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void HolderFragment()>
	//    3    7:astore_1        
		fragmentmanager.beginTransaction().add(((Fragment) (holderfragment)), "android.arch.lifecycle.state.StateProviderHolderFragment").commitAllowingStateLoss();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #56  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    6   12:aload_1         
	//    7   13:ldc1            #58  <String "android.arch.lifecycle.state.StateProviderHolderFragment">
	//    8   15:invokevirtual   #64  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//    9   18:invokevirtual   #68  <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   10   21:pop             
		return holderfragment;
	//   11   22:aload_1         
	//   12   23:areturn         
	}

	private static HolderFragment findHolderFragment(FragmentManager fragmentmanager)
	{
		if(!fragmentmanager.isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #73  <Method boolean FragmentManager.isDestroyed()>
	//*   2    4:ifne            43
		{
			fragmentmanager = ((FragmentManager) (fragmentmanager.findFragmentByTag("android.arch.lifecycle.state.StateProviderHolderFragment")));
	//    3    7:aload_0         
	//    4    8:ldc1            #58  <String "android.arch.lifecycle.state.StateProviderHolderFragment">
	//    5   10:invokevirtual   #77  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    6   13:astore_0        
			if(fragmentmanager != null && !(fragmentmanager instanceof HolderFragment))
	//*   7   14:aload_0         
	//*   8   15:ifnull          38
	//*   9   18:aload_0         
	//*  10   19:instanceof      #6   <Class HolderFragment>
	//*  11   22:ifeq            28
	//*  12   25:goto            38
				throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
	//   13   28:new             #79  <Class IllegalStateException>
	//   14   31:dup             
	//   15   32:ldc1            #81  <String "Unexpected fragment instance was returned by HOLDER_TAG">
	//   16   34:invokespecial   #84  <Method void IllegalStateException(String)>
	//   17   37:athrow          
			else
				return (HolderFragment)fragmentmanager;
	//   18   38:aload_0         
	//   19   39:checkcast       #6   <Class HolderFragment>
	//   20   42:areturn         
		} else
		{
			throw new IllegalStateException("Can't access ViewModels from onDestroy");
	//   21   43:new             #79  <Class IllegalStateException>
	//   22   46:dup             
	//   23   47:ldc1            #86  <String "Can't access ViewModels from onDestroy">
	//   24   49:invokespecial   #84  <Method void IllegalStateException(String)>
	//   25   52:athrow          
		}
	}

	void holderFragmentCreated(Fragment fragment)
	{
		Fragment fragment1 = fragment.getParentFragment();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #94  <Method Fragment Fragment.getParentFragment()>
	//    2    4:astore_2        
		if(fragment1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          32
		{
			mNotCommittedFragmentHolders.remove(((Object) (fragment1)));
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Map mNotCommittedFragmentHolders>
	//    7   13:aload_2         
	//    8   14:invokeinterface #100 <Method Object Map.remove(Object)>
	//    9   19:pop             
			fragment1.getFragmentManager().unregisterFragmentLifecycleCallbacks(mParentDestroyedCallback);
	//   10   20:aload_2         
	//   11   21:invokevirtual   #104 <Method FragmentManager Fragment.getFragmentManager()>
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks mParentDestroyedCallback>
	//   14   28:invokevirtual   #108 <Method void FragmentManager.unregisterFragmentLifecycleCallbacks(android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks)>
			return;
	//   15   31:return          
		} else
		{
			mNotCommittedActivityHolders.remove(((Object) (fragment.getActivity())));
	//   16   32:aload_0         
	//   17   33:getfield        #31  <Field Map mNotCommittedActivityHolders>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #112 <Method FragmentActivity Fragment.getActivity()>
	//   20   40:invokeinterface #100 <Method Object Map.remove(Object)>
	//   21   45:pop             
			return;
	//   22   46:return          
		}
	}

	HolderFragment holderFragmentFor(Fragment fragment)
	{
		Object obj = ((Object) (fragment.getChildFragmentManager()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method FragmentManager Fragment.getChildFragmentManager()>
	//    2    4:astore_2        
		HolderFragment holderfragment = findHolderFragment(((FragmentManager) (obj)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #119 <Method HolderFragment findHolderFragment(FragmentManager)>
	//    5    9:astore_3        
		if(holderfragment != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          16
			return holderfragment;
	//    8   14:aload_3         
	//    9   15:areturn         
		holderfragment = (HolderFragment)mNotCommittedFragmentHolders.get(((Object) (fragment)));
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field Map mNotCommittedFragmentHolders>
	//   12   20:aload_1         
	//   13   21:invokeinterface #122 <Method Object Map.get(Object)>
	//   14   26:checkcast       #6   <Class HolderFragment>
	//   15   29:astore_3        
		if(holderfragment != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          36
		{
			return holderfragment;
	//   18   34:aload_3         
	//   19   35:areturn         
		} else
		{
			fragment.getFragmentManager().registerFragmentLifecycleCallbacks(mParentDestroyedCallback, false);
	//   20   36:aload_1         
	//   21   37:invokevirtual   #104 <Method FragmentManager Fragment.getFragmentManager()>
	//   22   40:aload_0         
	//   23   41:getfield        #43  <Field android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks mParentDestroyedCallback>
	//   24   44:iconst_0        
	//   25   45:invokevirtual   #126 <Method void FragmentManager.registerFragmentLifecycleCallbacks(android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks, boolean)>
			obj = ((Object) (createHolderFragment(((FragmentManager) (obj)))));
	//   26   48:aload_2         
	//   27   49:invokestatic    #128 <Method HolderFragment createHolderFragment(FragmentManager)>
	//   28   52:astore_2        
			mNotCommittedFragmentHolders.put(((Object) (fragment)), obj);
	//   29   53:aload_0         
	//   30   54:getfield        #33  <Field Map mNotCommittedFragmentHolders>
	//   31   57:aload_1         
	//   32   58:aload_2         
	//   33   59:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   34   64:pop             
			return ((HolderFragment) (obj));
	//   35   65:aload_2         
	//   36   66:areturn         
		}
	}

	HolderFragment holderFragmentFor(FragmentActivity fragmentactivity)
	{
		Object obj = ((Object) (fragmentactivity.getSupportFragmentManager()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #138 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    2    4:astore_2        
		HolderFragment holderfragment = findHolderFragment(((FragmentManager) (obj)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #119 <Method HolderFragment findHolderFragment(FragmentManager)>
	//    5    9:astore_3        
		if(holderfragment != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          16
			return holderfragment;
	//    8   14:aload_3         
	//    9   15:areturn         
		holderfragment = (HolderFragment)mNotCommittedActivityHolders.get(((Object) (fragmentactivity)));
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field Map mNotCommittedActivityHolders>
	//   12   20:aload_1         
	//   13   21:invokeinterface #122 <Method Object Map.get(Object)>
	//   14   26:checkcast       #6   <Class HolderFragment>
	//   15   29:astore_3        
		if(holderfragment != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          36
			return holderfragment;
	//   18   34:aload_3         
	//   19   35:areturn         
		if(!mActivityCallbacksIsAdded)
	//*  20   36:aload_0         
	//*  21   37:getfield        #40  <Field boolean mActivityCallbacksIsAdded>
	//*  22   40:ifne            59
		{
			mActivityCallbacksIsAdded = true;
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:putfield        #40  <Field boolean mActivityCallbacksIsAdded>
			fragmentactivity.getApplication().registerActivityLifecycleCallbacks(mActivityCallbacks);
	//   26   48:aload_1         
	//   27   49:invokevirtual   #142 <Method Application FragmentActivity.getApplication()>
	//   28   52:aload_0         
	//   29   53:getfield        #38  <Field android.app.Application$ActivityLifecycleCallbacks mActivityCallbacks>
	//   30   56:invokevirtual   #148 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		}
		obj = ((Object) (createHolderFragment(((FragmentManager) (obj)))));
	//   31   59:aload_2         
	//   32   60:invokestatic    #128 <Method HolderFragment createHolderFragment(FragmentManager)>
	//   33   63:astore_2        
		mNotCommittedActivityHolders.put(((Object) (fragmentactivity)), obj);
	//   34   64:aload_0         
	//   35   65:getfield        #31  <Field Map mNotCommittedActivityHolders>
	//   36   68:aload_1         
	//   37   69:aload_2         
	//   38   70:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   39   75:pop             
		return ((HolderFragment) (obj));
	//   40   76:aload_2         
	//   41   77:areturn         
	}

	private android.app.s mActivityCallbacks;
	private boolean mActivityCallbacksIsAdded;
	private Map mNotCommittedActivityHolders;
	private Map mNotCommittedFragmentHolders;
	private android.support.v4.app.backs mParentDestroyedCallback;


/*
	static Map access$000(HolderFragment$HolderFragmentManager holderfragment$holderfragmentmanager)
	{
		return holderfragment$holderfragmentmanager.mNotCommittedActivityHolders;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map mNotCommittedActivityHolders>
	//    2    4:areturn         
	}

*/


/*
	static Map access$100(HolderFragment$HolderFragmentManager holderfragment$holderfragmentmanager)
	{
		return holderfragment$holderfragmentmanager.mNotCommittedFragmentHolders;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Map mNotCommittedFragmentHolders>
	//    2    4:areturn         
	}

*/

	HolderFragment$HolderFragmentManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mNotCommittedActivityHolders = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void HashMap()>
	//    6   12:putfield        #31  <Field Map mNotCommittedActivityHolders>
		mNotCommittedFragmentHolders = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #28  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void HashMap()>
	//   11   23:putfield        #33  <Field Map mNotCommittedFragmentHolders>
		mActivityCallbacks = ((android.app.s) (new EmptyActivityLifecycleCallbacks() {

			public void onActivityDestroyed(Activity activity)
			{
				if((HolderFragment)mNotCommittedActivityHolders.remove(((Object) (activity))) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field HolderFragment$HolderFragmentManager this$0>
			//*   2    4:invokestatic    #25  <Method Map HolderFragment$HolderFragmentManager.access$000(HolderFragment$HolderFragmentManager)>
			//*   3    7:aload_1         
			//*   4    8:invokeinterface #31  <Method Object Map.remove(Object)>
			//*   5   13:checkcast       #8   <Class HolderFragment>
			//*   6   16:ifnull          50
				{
					StringBuilder stringbuilder = new StringBuilder();
			//    7   19:new             #33  <Class StringBuilder>
			//    8   22:dup             
			//    9   23:invokespecial   #34  <Method void StringBuilder()>
			//   10   26:astore_2        
					stringbuilder.append("Failed to save a ViewModel for ");
			//   11   27:aload_2         
			//   12   28:ldc1            #36  <String "Failed to save a ViewModel for ">
			//   13   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
			//   14   33:pop             
					stringbuilder.append(((Object) (activity)));
			//   15   34:aload_2         
			//   16   35:aload_1         
			//   17   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(Object)>
			//   18   39:pop             
					Log.e("ViewModelStores", stringbuilder.toString());
			//   19   40:ldc1            #45  <String "ViewModelStores">
			//   20   42:aload_2         
			//   21   43:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   22   46:invokestatic    #55  <Method int Log.e(String, String)>
			//   23   49:pop             
				}
			//   24   50:return          
			}

			final HolderFragment.HolderFragmentManager this$0;

			
			{
				this$0 = HolderFragment.HolderFragmentManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field HolderFragment$HolderFragmentManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void EmptyActivityLifecycleCallbacks()>
			//    5    9:return          
			}
		}
));
	//   12   26:aload_0         
	//   13   27:new             #9   <Class HolderFragment$HolderFragmentManager$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #36  <Method void HolderFragment$HolderFragmentManager$1(HolderFragment$HolderFragmentManager)>
	//   17   35:putfield        #38  <Field android.app.Application$ActivityLifecycleCallbacks mActivityCallbacks>
		mActivityCallbacksIsAdded = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #40  <Field boolean mActivityCallbacksIsAdded>
		mParentDestroyedCallback = ((android.support.v4.app.backs) (new android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks() {

			public void onFragmentDestroyed(FragmentManager fragmentmanager, Fragment fragment)
			{
				super.onFragmentDestroyed(fragmentmanager, fragment);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
				if((HolderFragment)mNotCommittedFragmentHolders.remove(((Object) (fragment))) != null)
			//*   4    6:aload_0         
			//*   5    7:getfield        #15  <Field HolderFragment$HolderFragmentManager this$0>
			//*   6   10:invokestatic    #27  <Method Map HolderFragment$HolderFragmentManager.access$100(HolderFragment$HolderFragmentManager)>
			//*   7   13:aload_2         
			//*   8   14:invokeinterface #33  <Method Object Map.remove(Object)>
			//*   9   19:checkcast       #8   <Class HolderFragment>
			//*  10   22:ifnull          56
				{
					fragmentmanager = ((FragmentManager) (new StringBuilder()));
			//   11   25:new             #35  <Class StringBuilder>
			//   12   28:dup             
			//   13   29:invokespecial   #36  <Method void StringBuilder()>
			//   14   32:astore_1        
					((StringBuilder) (fragmentmanager)).append("Failed to save a ViewModel for ");
			//   15   33:aload_1         
			//   16   34:ldc1            #38  <String "Failed to save a ViewModel for ">
			//   17   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
			//   18   39:pop             
					((StringBuilder) (fragmentmanager)).append(((Object) (fragment)));
			//   19   40:aload_1         
			//   20   41:aload_2         
			//   21   42:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
			//   22   45:pop             
					Log.e("ViewModelStores", ((StringBuilder) (fragmentmanager)).toString());
			//   23   46:ldc1            #47  <String "ViewModelStores">
			//   24   48:aload_1         
			//   25   49:invokevirtual   #51  <Method String StringBuilder.toString()>
			//   26   52:invokestatic    #57  <Method int Log.e(String, String)>
			//   27   55:pop             
				}
			//   28   56:return          
			}

			final HolderFragment.HolderFragmentManager this$0;

			
			{
				this$0 = HolderFragment.HolderFragmentManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field HolderFragment$HolderFragmentManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks()>
			//    5    9:return          
			}
		}
));
	//   21   43:aload_0         
	//   22   44:new             #11  <Class HolderFragment$HolderFragmentManager$2>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokespecial   #41  <Method void HolderFragment$HolderFragmentManager$2(HolderFragment$HolderFragmentManager)>
	//   26   52:putfield        #43  <Field android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks mParentDestroyedCallback>
	//   27   55:return          
	}
}
