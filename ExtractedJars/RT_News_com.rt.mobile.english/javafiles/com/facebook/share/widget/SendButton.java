// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.FacebookDialogBase;

// Referenced classes of package com.facebook.share.widget:
//			ShareButtonBase, MessageDialog

public final class SendButton extends ShareButtonBase
{

	public SendButton(Context context)
	{
		super(context, ((AttributeSet) (null)), 0, "fb_send_button_create", "fb_send_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:ldc1            #8   <String "fb_send_button_create">
	//    5    6:ldc1            #10  <String "fb_send_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	public SendButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0, "fb_send_button_create", "fb_send_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:ldc1            #8   <String "fb_send_button_create">
	//    5    6:ldc1            #10  <String "fb_send_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	public SendButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, "fb_send_button_create", "fb_send_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #8   <String "fb_send_button_create">
	//    5    6:ldc1            #10  <String "fb_send_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	protected int getDefaultRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
	//    0    0:getstatic       #24  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Message>
	//    1    3:invokevirtual   #27  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.R.style.com_facebook_button_send;
	//    0    0:getstatic       #34  <Field int com.facebook.R$style.com_facebook_button_send>
	//    1    3:ireturn         
	}

	protected FacebookDialogBase getDialog()
	{
		if(getFragment() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #40  <Method android.support.v4.app.Fragment getFragment()>
	//*   2    4:ifnull          23
			return ((FacebookDialogBase) (new MessageDialog(getFragment(), getRequestCode())));
	//    3    7:new             #42  <Class MessageDialog>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #40  <Method android.support.v4.app.Fragment getFragment()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #45  <Method int getRequestCode()>
	//    9   19:invokespecial   #48  <Method void MessageDialog(android.support.v4.app.Fragment, int)>
	//   10   22:areturn         
		else
			return ((FacebookDialogBase) (new MessageDialog(getActivity(), getRequestCode())));
	//   11   23:new             #42  <Class MessageDialog>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokevirtual   #52  <Method android.app.Activity getActivity()>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #45  <Method int getRequestCode()>
	//   17   35:invokespecial   #55  <Method void MessageDialog(android.app.Activity, int)>
	//   18   38:areturn         
	}
}
