// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.FacebookDialogBase;

// Referenced classes of package com.facebook.share.widget:
//			ShareButtonBase, ShareDialog

public final class ShareButton extends ShareButtonBase
{

	public ShareButton(Context context)
	{
		super(context, ((AttributeSet) (null)), 0, "fb_share_button_create", "fb_share_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:ldc1            #8   <String "fb_share_button_create">
	//    5    6:ldc1            #10  <String "fb_share_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	public ShareButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0, "fb_share_button_create", "fb_share_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:ldc1            #8   <String "fb_share_button_create">
	//    5    6:ldc1            #10  <String "fb_share_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	public ShareButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, "fb_share_button_create", "fb_share_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #8   <String "fb_share_button_create">
	//    5    6:ldc1            #10  <String "fb_share_button_did_tap">
	//    6    8:invokespecial   #13  <Method void ShareButtonBase(Context, AttributeSet, int, String, String)>
	//    7   11:return          
	}

	protected int getDefaultRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
	//    0    0:getstatic       #24  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Share>
	//    1    3:invokevirtual   #27  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.share.R.style.com_facebook_button_share;
	//    0    0:getstatic       #34  <Field int com.facebook.share.R$style.com_facebook_button_share>
	//    1    3:ireturn         
	}

	protected FacebookDialogBase getDialog()
	{
		if(getFragment() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #40  <Method android.support.v4.app.Fragment getFragment()>
	//*   2    4:ifnull          23
			return ((FacebookDialogBase) (new ShareDialog(getFragment(), getRequestCode())));
	//    3    7:new             #42  <Class ShareDialog>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #40  <Method android.support.v4.app.Fragment getFragment()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #45  <Method int getRequestCode()>
	//    9   19:invokespecial   #48  <Method void ShareDialog(android.support.v4.app.Fragment, int)>
	//   10   22:areturn         
		if(getNativeFragment() != null)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #52  <Method android.app.Fragment getNativeFragment()>
	//*  13   27:ifnull          46
			return ((FacebookDialogBase) (new ShareDialog(getNativeFragment(), getRequestCode())));
	//   14   30:new             #42  <Class ShareDialog>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokevirtual   #52  <Method android.app.Fragment getNativeFragment()>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #45  <Method int getRequestCode()>
	//   20   42:invokespecial   #55  <Method void ShareDialog(android.app.Fragment, int)>
	//   21   45:areturn         
		else
			return ((FacebookDialogBase) (new ShareDialog(getActivity(), getRequestCode())));
	//   22   46:new             #42  <Class ShareDialog>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokevirtual   #59  <Method android.app.Activity getActivity()>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #45  <Method int getRequestCode()>
	//   28   58:invokespecial   #62  <Method void ShareDialog(android.app.Activity, int)>
	//   29   61:areturn         
	}
}
