// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.Window;
import android.widget.*;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.views.base.title.TitleBarView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout:
//			CashOutActivity

public class CashOutActivity_ViewBinding
	implements Unbinder
{

	public CashOutActivity_ViewBinding(CashOutActivity cashoutactivity)
	{
		this(cashoutactivity, cashoutactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window CashOutActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void CashOutActivity_ViewBinding(CashOutActivity, View)>
	//    6   12:return          
	}

	public CashOutActivity_ViewBinding(CashOutActivity cashoutactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = cashoutactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field CashOutActivity target>
		cashoutactivity.tbvTransferToHeader = (TitleBarView)Utils.findRequiredViewAsType(view, 0x7f090447, "field 'tbvTransferToHeader'", com/ibotta/android/views/base/title/TitleBarView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f090447>
	//    8   13:ldc1            #36  <String "field 'tbvTransferToHeader'">
	//    9   15:ldc1            #38  <Class TitleBarView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class TitleBarView>
	//   12   23:putfield        #48  <Field TitleBarView CashOutActivity.tbvTransferToHeader>
		cashoutactivity.ivLogo = (ImageView)Utils.findRequiredViewAsType(view, 0x7f0902b4, "field 'ivLogo'", android/widget/ImageView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0902b4>
	//   16   30:ldc1            #51  <String "field 'ivLogo'">
	//   17   32:ldc1            #53  <Class ImageView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #53  <Class ImageView>
	//   20   40:putfield        #57  <Field ImageView CashOutActivity.ivLogo>
		cashoutactivity.tvAccountName = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904e7, "field 'tvAccountName'", android/widget/TextView);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #58  <Int 0x7f0904e7>
	//   24   47:ldc1            #60  <String "field 'tvAccountName'">
	//   25   49:ldc1            #62  <Class TextView>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #62  <Class TextView>
	//   28   57:putfield        #66  <Field TextView CashOutActivity.tvAccountName>
		cashoutactivity.etAmount = (EditText)Utils.findRequiredViewAsType(view, 0x7f0901bc, "field 'etAmount'", android/widget/EditText);
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:ldc1            #67  <Int 0x7f0901bc>
	//   32   64:ldc1            #69  <String "field 'etAmount'">
	//   33   66:ldc1            #71  <Class EditText>
	//   34   68:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   35   71:checkcast       #71  <Class EditText>
	//   36   74:putfield        #75  <Field EditText CashOutActivity.etAmount>
		cashoutactivity.tilAmount = (TextInputLayout)Utils.findRequiredViewAsType(view, 0x7f09046b, "field 'tilAmount'", android/support/design/widget/TextInputLayout);
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:ldc1            #76  <Int 0x7f09046b>
	//   40   81:ldc1            #78  <String "field 'tilAmount'">
	//   41   83:ldc1            #80  <Class TextInputLayout>
	//   42   85:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   43   88:checkcast       #80  <Class TextInputLayout>
	//   44   91:putfield        #84  <Field TextInputLayout CashOutActivity.tilAmount>
		cashoutactivity.tvAmountAvailable = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904ef, "field 'tvAmountAvailable'", android/widget/TextView);
	//   45   94:aload_1         
	//   46   95:aload_2         
	//   47   96:ldc1            #85  <Int 0x7f0904ef>
	//   48   98:ldc1            #87  <String "field 'tvAmountAvailable'">
	//   49  100:ldc1            #62  <Class TextView>
	//   50  102:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   51  105:checkcast       #62  <Class TextView>
	//   52  108:putfield        #90  <Field TextView CashOutActivity.tvAmountAvailable>
		cashoutactivity.bTransferCash = (Button)Utils.findRequiredViewAsType(view, 0x7f0900ae, "field 'bTransferCash'", android/widget/Button);
	//   53  111:aload_1         
	//   54  112:aload_2         
	//   55  113:ldc1            #91  <Int 0x7f0900ae>
	//   56  115:ldc1            #93  <String "field 'bTransferCash'">
	//   57  117:ldc1            #95  <Class Button>
	//   58  119:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   59  122:checkcast       #95  <Class Button>
	//   60  125:putfield        #99  <Field Button CashOutActivity.bTransferCash>
		cashoutactivity.tvAmountRemaining = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904f5, "field 'tvAmountRemaining'", android/widget/TextView);
	//   61  128:aload_1         
	//   62  129:aload_2         
	//   63  130:ldc1            #100 <Int 0x7f0904f5>
	//   64  132:ldc1            #102 <String "field 'tvAmountRemaining'">
	//   65  134:ldc1            #62  <Class TextView>
	//   66  136:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   67  139:checkcast       #62  <Class TextView>
	//   68  142:putfield        #105 <Field TextView CashOutActivity.tvAmountRemaining>
	//   69  145:return          
	}

	public void unbind()
	{
		CashOutActivity cashoutactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field CashOutActivity target>
	//    2    4:astore_1        
		if(cashoutactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          55
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field CashOutActivity target>
			cashoutactivity.tbvTransferToHeader = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field TitleBarView CashOutActivity.tbvTransferToHeader>
			cashoutactivity.ivLogo = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #57  <Field ImageView CashOutActivity.ivLogo>
			cashoutactivity.tvAccountName = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #66  <Field TextView CashOutActivity.tvAccountName>
			cashoutactivity.etAmount = null;
	//   17   29:aload_1         
	//   18   30:aconst_null     
	//   19   31:putfield        #75  <Field EditText CashOutActivity.etAmount>
			cashoutactivity.tilAmount = null;
	//   20   34:aload_1         
	//   21   35:aconst_null     
	//   22   36:putfield        #84  <Field TextInputLayout CashOutActivity.tilAmount>
			cashoutactivity.tvAmountAvailable = null;
	//   23   39:aload_1         
	//   24   40:aconst_null     
	//   25   41:putfield        #90  <Field TextView CashOutActivity.tvAmountAvailable>
			cashoutactivity.bTransferCash = null;
	//   26   44:aload_1         
	//   27   45:aconst_null     
	//   28   46:putfield        #99  <Field Button CashOutActivity.bTransferCash>
			cashoutactivity.tvAmountRemaining = null;
	//   29   49:aload_1         
	//   30   50:aconst_null     
	//   31   51:putfield        #105 <Field TextView CashOutActivity.tvAmountRemaining>
			return;
	//   32   54:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   33   55:new             #109 <Class IllegalStateException>
	//   34   58:dup             
	//   35   59:ldc1            #111 <String "Bindings already cleared.">
	//   36   61:invokespecial   #114 <Method void IllegalStateException(String)>
	//   37   64:athrow          
		}
	}

	private CashOutActivity target;
}
