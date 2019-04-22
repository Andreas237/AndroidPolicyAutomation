// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import android.view.View;
import android.view.Window;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.mvp.ui.view.IBSwipeRefreshLayout;
import com.ibotta.android.mvp.ui.view.account.withdraw.WithdrawListView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawActivity

public class WithdrawActivity_ViewBinding
	implements Unbinder
{

	public WithdrawActivity_ViewBinding(WithdrawActivity withdrawactivity)
	{
		this(withdrawactivity, withdrawactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window WithdrawActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void WithdrawActivity_ViewBinding(WithdrawActivity, View)>
	//    6   12:return          
	}

	public WithdrawActivity_ViewBinding(WithdrawActivity withdrawactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = withdrawactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field WithdrawActivity target>
		withdrawactivity.tvDollarSign = (TextView)Utils.findRequiredViewAsType(view, 0x7f09051a, "field 'tvDollarSign'", android/widget/TextView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f09051a>
	//    8   13:ldc1            #36  <String "field 'tvDollarSign'">
	//    9   15:ldc1            #38  <Class TextView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class TextView>
	//   12   23:putfield        #48  <Field TextView WithdrawActivity.tvDollarSign>
		withdrawactivity.tvAmount = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904ee, "field 'tvAmount'", android/widget/TextView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0904ee>
	//   16   30:ldc1            #51  <String "field 'tvAmount'">
	//   17   32:ldc1            #38  <Class TextView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #38  <Class TextView>
	//   20   40:putfield        #54  <Field TextView WithdrawActivity.tvAmount>
		withdrawactivity.srlSwipeRefresh = (IBSwipeRefreshLayout)Utils.findRequiredViewAsType(view, 0x7f090426, "field 'srlSwipeRefresh'", com/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #55  <Int 0x7f090426>
	//   24   47:ldc1            #57  <String "field 'srlSwipeRefresh'">
	//   25   49:ldc1            #59  <Class IBSwipeRefreshLayout>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #59  <Class IBSwipeRefreshLayout>
	//   28   57:putfield        #63  <Field IBSwipeRefreshLayout WithdrawActivity.srlSwipeRefresh>
		withdrawactivity.wlvWithdrawOptions = (WithdrawListView)Utils.findRequiredViewAsType(view, 0x7f0905ee, "field 'wlvWithdrawOptions'", com/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView);
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:ldc1            #64  <Int 0x7f0905ee>
	//   32   64:ldc1            #66  <String "field 'wlvWithdrawOptions'">
	//   33   66:ldc1            #68  <Class WithdrawListView>
	//   34   68:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   35   71:checkcast       #68  <Class WithdrawListView>
	//   36   74:putfield        #72  <Field WithdrawListView WithdrawActivity.wlvWithdrawOptions>
	//   37   77:return          
	}

	public void unbind()
	{
		WithdrawActivity withdrawactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field WithdrawActivity target>
	//    2    4:astore_1        
		if(withdrawactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field WithdrawActivity target>
			withdrawactivity.tvDollarSign = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field TextView WithdrawActivity.tvDollarSign>
			withdrawactivity.tvAmount = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #54  <Field TextView WithdrawActivity.tvAmount>
			withdrawactivity.srlSwipeRefresh = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #63  <Field IBSwipeRefreshLayout WithdrawActivity.srlSwipeRefresh>
			withdrawactivity.wlvWithdrawOptions = null;
	//   17   29:aload_1         
	//   18   30:aconst_null     
	//   19   31:putfield        #72  <Field WithdrawListView WithdrawActivity.wlvWithdrawOptions>
			return;
	//   20   34:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   21   35:new             #76  <Class IllegalStateException>
	//   22   38:dup             
	//   23   39:ldc1            #78  <String "Bindings already cleared.">
	//   24   41:invokespecial   #81  <Method void IllegalStateException(String)>
	//   25   44:athrow          
		}
	}

	private WithdrawActivity target;
}
