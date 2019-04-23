// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import java.util.Map;

// Referenced classes of package android.arch.lifecycle:
//			HolderFragment

class HolderFragment$HolderFragmentManager$2 extends android.support.v4.app.cks
{

	public void onFragmentDestroyed(FragmentManager fragmentmanager, Fragment fragment)
	{
		super.onFragmentDestroyed(fragmentmanager, fragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks.onFragmentDestroyed(FragmentManager, Fragment)>
		if((HolderFragment)HolderFragment.HolderFragmentManager.access$100(HolderFragment.HolderFragmentManager.this).remove(((Object) (fragment))) != null)
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

	HolderFragment$HolderFragmentManager$2()
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
