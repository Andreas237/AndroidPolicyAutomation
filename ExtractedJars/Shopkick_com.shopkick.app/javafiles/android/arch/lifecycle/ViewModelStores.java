// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package android.arch.lifecycle:
//			ViewModelStoreOwner, HolderFragment, ViewModelStore

public class ViewModelStores
{

	private ViewModelStores()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ViewModelStore of(Fragment fragment)
	{
		if(fragment instanceof ViewModelStoreOwner)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #15  <Class ViewModelStoreOwner>
	//*   2    4:ifeq            17
			return ((ViewModelStoreOwner)fragment).getViewModelStore();
	//    3    7:aload_0         
	//    4    8:checkcast       #15  <Class ViewModelStoreOwner>
	//    5   11:invokeinterface #19  <Method ViewModelStore ViewModelStoreOwner.getViewModelStore()>
	//    6   16:areturn         
		else
			return HolderFragment.holderFragmentFor(fragment).getViewModelStore();
	//    7   17:aload_0         
	//    8   18:invokestatic    #25  <Method HolderFragment HolderFragment.holderFragmentFor(Fragment)>
	//    9   21:invokevirtual   #26  <Method ViewModelStore HolderFragment.getViewModelStore()>
	//   10   24:areturn         
	}

	public static ViewModelStore of(FragmentActivity fragmentactivity)
	{
		if(fragmentactivity instanceof ViewModelStoreOwner)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #15  <Class ViewModelStoreOwner>
	//*   2    4:ifeq            17
			return ((ViewModelStoreOwner)fragmentactivity).getViewModelStore();
	//    3    7:aload_0         
	//    4    8:checkcast       #15  <Class ViewModelStoreOwner>
	//    5   11:invokeinterface #19  <Method ViewModelStore ViewModelStoreOwner.getViewModelStore()>
	//    6   16:areturn         
		else
			return HolderFragment.holderFragmentFor(fragmentactivity).getViewModelStore();
	//    7   17:aload_0         
	//    8   18:invokestatic    #32  <Method HolderFragment HolderFragment.holderFragmentFor(FragmentActivity)>
	//    9   21:invokevirtual   #26  <Method ViewModelStore HolderFragment.getViewModelStore()>
	//   10   24:areturn         
	}
}
