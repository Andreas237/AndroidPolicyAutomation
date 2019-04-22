// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.mvp.ui.view.IBSwipeRefreshLayout;
import com.ibotta.android.mvp.ui.view.nav.NavBarView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountActivity

public class AccountActivity_ViewBinding
	implements Unbinder
{

	public AccountActivity_ViewBinding(AccountActivity accountactivity)
	{
		this(accountactivity, accountactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window AccountActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void AccountActivity_ViewBinding(AccountActivity, View)>
	//    6   12:return          
	}

	public AccountActivity_ViewBinding(AccountActivity accountactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = accountactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field AccountActivity target>
		accountactivity.srlSwipeRefresh = (IBSwipeRefreshLayout)Utils.findRequiredViewAsType(view, 0x7f090426, "field 'srlSwipeRefresh'", com/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f090426>
	//    8   13:ldc1            #36  <String "field 'srlSwipeRefresh'">
	//    9   15:ldc1            #38  <Class IBSwipeRefreshLayout>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class IBSwipeRefreshLayout>
	//   12   23:putfield        #48  <Field IBSwipeRefreshLayout AccountActivity.srlSwipeRefresh>
		accountactivity.rvRecycler = (RecyclerView)Utils.findRequiredViewAsType(view, 0x7f0903db, "field 'rvRecycler'", android/support/v7/widget/RecyclerView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0903db>
	//   16   30:ldc1            #51  <String "field 'rvRecycler'">
	//   17   32:ldc1            #53  <Class RecyclerView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #53  <Class RecyclerView>
	//   20   40:putfield        #57  <Field RecyclerView AccountActivity.rvRecycler>
		accountactivity.nbvNavBar = (NavBarView)Utils.findRequiredViewAsType(view, 0x7f090374, "field 'nbvNavBar'", com/ibotta/android/mvp/ui/view/nav/NavBarView);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #58  <Int 0x7f090374>
	//   24   47:ldc1            #60  <String "field 'nbvNavBar'">
	//   25   49:ldc1            #62  <Class NavBarView>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #62  <Class NavBarView>
	//   28   57:putfield        #66  <Field NavBarView AccountActivity.nbvNavBar>
	//   29   60:return          
	}

	public void unbind()
	{
		AccountActivity accountactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AccountActivity target>
	//    2    4:astore_1        
		if(accountactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field AccountActivity target>
			accountactivity.srlSwipeRefresh = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field IBSwipeRefreshLayout AccountActivity.srlSwipeRefresh>
			accountactivity.rvRecycler = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #57  <Field RecyclerView AccountActivity.rvRecycler>
			accountactivity.nbvNavBar = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #66  <Field NavBarView AccountActivity.nbvNavBar>
			return;
	//   17   29:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   18   30:new             #70  <Class IllegalStateException>
	//   19   33:dup             
	//   20   34:ldc1            #72  <String "Bindings already cleared.">
	//   21   36:invokespecial   #75  <Method void IllegalStateException(String)>
	//   22   39:athrow          
		}
	}

	private AccountActivity target;
}
