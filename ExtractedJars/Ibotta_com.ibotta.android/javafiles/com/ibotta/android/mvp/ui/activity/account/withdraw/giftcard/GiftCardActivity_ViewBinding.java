// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.Window;
import android.widget.*;
import butterknife.Unbinder;
import butterknife.internal.Utils;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardActivity

public class GiftCardActivity_ViewBinding
	implements Unbinder
{

	public GiftCardActivity_ViewBinding(GiftCardActivity giftcardactivity)
	{
		this(giftcardactivity, giftcardactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window GiftCardActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void GiftCardActivity_ViewBinding(GiftCardActivity, View)>
	//    6   12:return          
	}

	public GiftCardActivity_ViewBinding(GiftCardActivity giftcardactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = giftcardactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field GiftCardActivity target>
		giftcardactivity.ivGiftCard = (ImageView)Utils.findRequiredViewAsType(view, 0x7f0902aa, "field 'ivGiftCard'", android/widget/ImageView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f0902aa>
	//    8   13:ldc1            #36  <String "field 'ivGiftCard'">
	//    9   15:ldc1            #38  <Class ImageView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class ImageView>
	//   12   23:putfield        #48  <Field ImageView GiftCardActivity.ivGiftCard>
		giftcardactivity.tvBalanceAvailable = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904fa, "field 'tvBalanceAvailable'", android/widget/TextView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0904fa>
	//   16   30:ldc1            #51  <String "field 'tvBalanceAvailable'">
	//   17   32:ldc1            #53  <Class TextView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #53  <Class TextView>
	//   20   40:putfield        #57  <Field TextView GiftCardActivity.tvBalanceAvailable>
		giftcardactivity.llFixedAmounts = (LinearLayout)Utils.findRequiredViewAsType(view, 0x7f09030b, "field 'llFixedAmounts'", android/widget/LinearLayout);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #58  <Int 0x7f09030b>
	//   24   47:ldc1            #60  <String "field 'llFixedAmounts'">
	//   25   49:ldc1            #62  <Class LinearLayout>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #62  <Class LinearLayout>
	//   28   57:putfield        #66  <Field LinearLayout GiftCardActivity.llFixedAmounts>
		giftcardactivity.tilRange = (TextInputLayout)Utils.findRequiredViewAsType(view, 0x7f090474, "field 'tilRange'", android/support/design/widget/TextInputLayout);
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:ldc1            #67  <Int 0x7f090474>
	//   32   64:ldc1            #69  <String "field 'tilRange'">
	//   33   66:ldc1            #71  <Class TextInputLayout>
	//   34   68:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   35   71:checkcast       #71  <Class TextInputLayout>
	//   36   74:putfield        #75  <Field TextInputLayout GiftCardActivity.tilRange>
		giftcardactivity.etAmount = (EditText)Utils.findRequiredViewAsType(view, 0x7f0901bc, "field 'etAmount'", android/widget/EditText);
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:ldc1            #76  <Int 0x7f0901bc>
	//   40   81:ldc1            #78  <String "field 'etAmount'">
	//   41   83:ldc1            #80  <Class EditText>
	//   42   85:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   43   88:checkcast       #80  <Class EditText>
	//   44   91:putfield        #84  <Field EditText GiftCardActivity.etAmount>
		giftcardactivity.tvRange = (TextView)Utils.findRequiredViewAsType(view, 0x7f090563, "field 'tvRange'", android/widget/TextView);
	//   45   94:aload_1         
	//   46   95:aload_2         
	//   47   96:ldc1            #85  <Int 0x7f090563>
	//   48   98:ldc1            #87  <String "field 'tvRange'">
	//   49  100:ldc1            #53  <Class TextView>
	//   50  102:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   51  105:checkcast       #53  <Class TextView>
	//   52  108:putfield        #90  <Field TextView GiftCardActivity.tvRange>
		giftcardactivity.bPurchase = (Button)Utils.findRequiredViewAsType(view, 0x7f090099, "field 'bPurchase'", android/widget/Button);
	//   53  111:aload_1         
	//   54  112:aload_2         
	//   55  113:ldc1            #91  <Int 0x7f090099>
	//   56  115:ldc1            #93  <String "field 'bPurchase'">
	//   57  117:ldc1            #95  <Class Button>
	//   58  119:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   59  122:checkcast       #95  <Class Button>
	//   60  125:putfield        #99  <Field Button GiftCardActivity.bPurchase>
		giftcardactivity.tvBalanceRemaining = (TextView)Utils.findRequiredViewAsType(view, 0x7f0904fb, "field 'tvBalanceRemaining'", android/widget/TextView);
	//   61  128:aload_1         
	//   62  129:aload_2         
	//   63  130:ldc1            #100 <Int 0x7f0904fb>
	//   64  132:ldc1            #102 <String "field 'tvBalanceRemaining'">
	//   65  134:ldc1            #53  <Class TextView>
	//   66  136:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   67  139:checkcast       #53  <Class TextView>
	//   68  142:putfield        #105 <Field TextView GiftCardActivity.tvBalanceRemaining>
		giftcardactivity.tvLegalText = (TextView)Utils.findRequiredViewAsType(view, 0x7f09053d, "field 'tvLegalText'", android/widget/TextView);
	//   69  145:aload_1         
	//   70  146:aload_2         
	//   71  147:ldc1            #106 <Int 0x7f09053d>
	//   72  149:ldc1            #108 <String "field 'tvLegalText'">
	//   73  151:ldc1            #53  <Class TextView>
	//   74  153:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   75  156:checkcast       #53  <Class TextView>
	//   76  159:putfield        #111 <Field TextView GiftCardActivity.tvLegalText>
	//   77  162:return          
	}

	public void unbind()
	{
		GiftCardActivity giftcardactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GiftCardActivity target>
	//    2    4:astore_1        
		if(giftcardactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          60
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field GiftCardActivity target>
			giftcardactivity.ivGiftCard = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field ImageView GiftCardActivity.ivGiftCard>
			giftcardactivity.tvBalanceAvailable = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #57  <Field TextView GiftCardActivity.tvBalanceAvailable>
			giftcardactivity.llFixedAmounts = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #66  <Field LinearLayout GiftCardActivity.llFixedAmounts>
			giftcardactivity.tilRange = null;
	//   17   29:aload_1         
	//   18   30:aconst_null     
	//   19   31:putfield        #75  <Field TextInputLayout GiftCardActivity.tilRange>
			giftcardactivity.etAmount = null;
	//   20   34:aload_1         
	//   21   35:aconst_null     
	//   22   36:putfield        #84  <Field EditText GiftCardActivity.etAmount>
			giftcardactivity.tvRange = null;
	//   23   39:aload_1         
	//   24   40:aconst_null     
	//   25   41:putfield        #90  <Field TextView GiftCardActivity.tvRange>
			giftcardactivity.bPurchase = null;
	//   26   44:aload_1         
	//   27   45:aconst_null     
	//   28   46:putfield        #99  <Field Button GiftCardActivity.bPurchase>
			giftcardactivity.tvBalanceRemaining = null;
	//   29   49:aload_1         
	//   30   50:aconst_null     
	//   31   51:putfield        #105 <Field TextView GiftCardActivity.tvBalanceRemaining>
			giftcardactivity.tvLegalText = null;
	//   32   54:aload_1         
	//   33   55:aconst_null     
	//   34   56:putfield        #111 <Field TextView GiftCardActivity.tvLegalText>
			return;
	//   35   59:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   36   60:new             #115 <Class IllegalStateException>
	//   37   63:dup             
	//   38   64:ldc1            #117 <String "Bindings already cleared.">
	//   39   66:invokespecial   #120 <Method void IllegalStateException(String)>
	//   40   69:athrow          
		}
	}

	private GiftCardActivity target;
}
