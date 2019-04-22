// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import android.view.View;
import android.view.Window;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.views.browser.IbottaWebView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectActivity

public class PayPalConnectActivity_ViewBinding
	implements Unbinder
{

	public PayPalConnectActivity_ViewBinding(PayPalConnectActivity paypalconnectactivity)
	{
		this(paypalconnectactivity, paypalconnectactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window PayPalConnectActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void PayPalConnectActivity_ViewBinding(PayPalConnectActivity, View)>
	//    6   12:return          
	}

	public PayPalConnectActivity_ViewBinding(PayPalConnectActivity paypalconnectactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = paypalconnectactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field PayPalConnectActivity target>
		paypalconnectactivity.iwvLinkContent = (IbottaWebView)Utils.findRequiredViewAsType(view, 0x7f0902d5, "field 'iwvLinkContent'", com/ibotta/android/views/browser/IbottaWebView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f0902d5>
	//    8   13:ldc1            #36  <String "field 'iwvLinkContent'">
	//    9   15:ldc1            #38  <Class IbottaWebView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class IbottaWebView>
	//   12   23:putfield        #48  <Field IbottaWebView PayPalConnectActivity.iwvLinkContent>
	//   13   26:return          
	}

	public void unbind()
	{
		PayPalConnectActivity paypalconnectactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field PayPalConnectActivity target>
	//    2    4:astore_1        
		if(paypalconnectactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field PayPalConnectActivity target>
			paypalconnectactivity.iwvLinkContent = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field IbottaWebView PayPalConnectActivity.iwvLinkContent>
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

	private PayPalConnectActivity target;
}
