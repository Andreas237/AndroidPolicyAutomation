// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.util.Log;
import java.util.Map;

// Referenced classes of package android.arch.lifecycle:
//			EmptyActivityLifecycleCallbacks, HolderFragment

class HolderFragment$HolderFragmentManager$1 extends EmptyActivityLifecycleCallbacks
{

	public void onActivityDestroyed(Activity activity)
	{
		if((HolderFragment)HolderFragment.HolderFragmentManager.access$000(HolderFragment.HolderFragmentManager.this).remove(((Object) (activity))) != null)
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

	HolderFragment$HolderFragmentManager$1()
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
