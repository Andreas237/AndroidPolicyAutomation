// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms;

import android.view.View;
import android.view.Window;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms:
//			GiftCardTermsActivity

public class GiftCardTermsActivity_ViewBinding
	implements Unbinder
{

	public GiftCardTermsActivity_ViewBinding(GiftCardTermsActivity giftcardtermsactivity)
	{
		this(giftcardtermsactivity, giftcardtermsactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window GiftCardTermsActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void GiftCardTermsActivity_ViewBinding(GiftCardTermsActivity, View)>
	//    6   12:return          
	}

	public GiftCardTermsActivity_ViewBinding(GiftCardTermsActivity giftcardtermsactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = giftcardtermsactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field GiftCardTermsActivity target>
		giftcardtermsactivity.tvTerms = (TextView)Utils.findRequiredViewAsType(view, 0x7f090584, "field 'tvTerms'", android/widget/TextView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f090584>
	//    8   13:ldc1            #36  <String "field 'tvTerms'">
	//    9   15:ldc1            #38  <Class TextView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class TextView>
	//   12   23:putfield        #48  <Field TextView GiftCardTermsActivity.tvTerms>
	//   13   26:return          
	}

	public void unbind()
	{
		GiftCardTermsActivity giftcardtermsactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GiftCardTermsActivity target>
	//    2    4:astore_1        
		if(giftcardtermsactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field GiftCardTermsActivity target>
			giftcardtermsactivity.tvTerms = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field TextView GiftCardTermsActivity.tvTerms>
			return;
	//   11   19:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   12   20:new             #52  <Class IllegalStateException>
	//   13   23:dup             
	//   14   24:ldc1            #54  <String "Bindings already cleared.">
	//   15   26:invokespecial   #57  <Method void IllegalStateException(String)>
	//   16   29:athrow          
		}
	}

	private GiftCardTermsActivity target;
}
