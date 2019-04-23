// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.*;
import com.facebook.share.DeviceShareDialog;
import com.facebook.share.model.ShareContent;

public final class DeviceShareButton extends FacebookButtonBase
{

	public DeviceShareButton(Context context)
	{
		this(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #19  <Method void DeviceShareButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DeviceShareButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #19  <Method void DeviceShareButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	private DeviceShareButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:ldc1            #23  <String "fb_device_share_button_create">
	//    6    7:ldc1            #25  <String "fb_device_share_button_did_tap">
	//    7    9:invokespecial   #28  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		requestCode = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #30  <Field int requestCode>
		enabledExplicitlySet = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #32  <Field boolean enabledExplicitlySet>
		dialog = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #34  <Field DeviceShareDialog dialog>
		if(isInEditMode())
	//*  17   27:aload_0         
	//*  18   28:invokevirtual   #38  <Method boolean isInEditMode()>
	//*  19   31:ifeq            39
			i = 0;
	//   20   34:iconst_0        
	//   21   35:istore_3        
		else
	//*  22   36:goto            44
			i = getDefaultRequestCode();
	//   23   39:aload_0         
	//   24   40:invokevirtual   #42  <Method int getDefaultRequestCode()>
	//   25   43:istore_3        
		requestCode = i;
	//   26   44:aload_0         
	//   27   45:iload_3         
	//   28   46:putfield        #30  <Field int requestCode>
		internalSetEnabled(false);
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:invokespecial   #46  <Method void internalSetEnabled(boolean)>
	//   32   54:return          
	}

	private boolean canShare()
	{
		return (new DeviceShareDialog(getActivity())).canShow(((Object) (getShareContent())));
	//    0    0:new             #61  <Class DeviceShareDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method android.app.Activity getActivity()>
	//    4    8:invokespecial   #68  <Method void DeviceShareDialog(android.app.Activity)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #72  <Method ShareContent getShareContent()>
	//    7   15:invokevirtual   #76  <Method boolean DeviceShareDialog.canShow(Object)>
	//    8   18:ireturn         
	}

	private DeviceShareDialog getDialog()
	{
		DeviceShareDialog devicesharedialog = dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DeviceShareDialog dialog>
	//    2    4:astore_1        
		if(devicesharedialog != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return devicesharedialog;
	//    5    9:aload_1         
	//    6   10:areturn         
		if(getFragment() != null)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #80  <Method android.support.v4.app.Fragment getFragment()>
	//*   9   15:ifnull          36
			dialog = new DeviceShareDialog(getFragment());
	//   10   18:aload_0         
	//   11   19:new             #61  <Class DeviceShareDialog>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokevirtual   #80  <Method android.support.v4.app.Fragment getFragment()>
	//   15   27:invokespecial   #83  <Method void DeviceShareDialog(android.support.v4.app.Fragment)>
	//   16   30:putfield        #34  <Field DeviceShareDialog dialog>
		else
	//*  17   33:goto            76
		if(getNativeFragment() != null)
	//*  18   36:aload_0         
	//*  19   37:invokevirtual   #87  <Method android.app.Fragment getNativeFragment()>
	//*  20   40:ifnull          61
			dialog = new DeviceShareDialog(getNativeFragment());
	//   21   43:aload_0         
	//   22   44:new             #61  <Class DeviceShareDialog>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokevirtual   #87  <Method android.app.Fragment getNativeFragment()>
	//   26   52:invokespecial   #90  <Method void DeviceShareDialog(android.app.Fragment)>
	//   27   55:putfield        #34  <Field DeviceShareDialog dialog>
		else
	//*  28   58:goto            76
			dialog = new DeviceShareDialog(getActivity());
	//   29   61:aload_0         
	//   30   62:new             #61  <Class DeviceShareDialog>
	//   31   65:dup             
	//   32   66:aload_0         
	//   33   67:invokevirtual   #65  <Method android.app.Activity getActivity()>
	//   34   70:invokespecial   #68  <Method void DeviceShareDialog(android.app.Activity)>
	//   35   73:putfield        #34  <Field DeviceShareDialog dialog>
		return dialog;
	//   36   76:aload_0         
	//   37   77:getfield        #34  <Field DeviceShareDialog dialog>
	//   38   80:areturn         
	}

	private void internalSetEnabled(boolean flag)
	{
		setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #93  <Method void setEnabled(boolean)>
		enabledExplicitlySet = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field boolean enabledExplicitlySet>
	//    6   10:return          
	}

	private void setRequestCode(int i)
	{
		if(!FacebookSdk.isFacebookRequestCode(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #101 <Method boolean FacebookSdk.isFacebookRequestCode(int)>
	//*   2    4:ifne            13
		{
			requestCode = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #30  <Field int requestCode>
			return;
	//    6   12:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #103 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #106 <Method void StringBuilder()>
	//   10   20:astore_2        
			stringbuilder.append("Request code ");
	//   11   21:aload_2         
	//   12   22:ldc1            #108 <String "Request code ">
	//   13   24:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			stringbuilder.append(" cannot be within the range reserved by the Facebook SDK.");
	//   19   34:aload_2         
	//   20   35:ldc1            #117 <String " cannot be within the range reserved by the Facebook SDK.">
	//   21   37:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   41:new             #119 <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   28   52:athrow          
		}
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		super.configureButton(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #130 <Method void FacebookButtonBase.configureButton(Context, AttributeSet, int, int)>
		setInternalOnClickListener(getShareOnClickListener());
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:invokevirtual   #134 <Method android.view.View$OnClickListener getShareOnClickListener()>
	//    9   14:invokevirtual   #138 <Method void setInternalOnClickListener(android.view.View$OnClickListener)>
	//   10   17:return          
	}

	protected int getDefaultRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
	//    0    0:getstatic       #144 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Share>
	//    1    3:invokevirtual   #147 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.share.R.style.com_facebook_button_share;
	//    0    0:getstatic       #153 <Field int com.facebook.share.R$style.com_facebook_button_share>
	//    1    3:ireturn         
	}

	public int getRequestCode()
	{
		return requestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int requestCode>
	//    2    4:ireturn         
	}

	public ShareContent getShareContent()
	{
		return shareContent;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field ShareContent shareContent>
	//    2    4:areturn         
	}

	protected android.view.View.OnClickListener getShareOnClickListener()
	{
		return new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				callExternalOnClickListener(view);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceShareButton this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void DeviceShareButton.access$000(DeviceShareButton, View)>
				getDialog().show(((Object) (getShareContent())));
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field DeviceShareButton this$0>
			//    6   12:invokestatic    #31  <Method DeviceShareDialog DeviceShareButton.access$100(DeviceShareButton)>
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field DeviceShareButton this$0>
			//    9   19:invokevirtual   #35  <Method ShareContent DeviceShareButton.getShareContent()>
			//   10   22:invokevirtual   #41  <Method void DeviceShareDialog.show(Object)>
			//   11   25:return          
			}

			final DeviceShareButton this$0;

			
			{
				this$0 = DeviceShareButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceShareButton this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class DeviceShareButton$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #159 <Method void DeviceShareButton$1(DeviceShareButton)>
	//    4    8:areturn         
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		getDialog().registerCallback(callbackmanager, facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method DeviceShareDialog getDialog()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #163 <Method void DeviceShareDialog.registerCallback(CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
	{
		setRequestCode(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #168 <Method void setRequestCode(int)>
		getDialog().registerCallback(callbackmanager, facebookcallback, i);
	//    3    5:aload_0         
	//    4    6:invokespecial   #58  <Method DeviceShareDialog getDialog()>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #170 <Method void DeviceShareDialog.registerCallback(CallbackManager, FacebookCallback, int)>
	//    9   15:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #172 <Method void FacebookButtonBase.setEnabled(boolean)>
		enabledExplicitlySet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #32  <Field boolean enabledExplicitlySet>
	//    6   10:return          
	}

	public void setShareContent(ShareContent sharecontent)
	{
		shareContent = sharecontent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field ShareContent shareContent>
		if(!enabledExplicitlySet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #32  <Field boolean enabledExplicitlySet>
	//*   5    9:ifne            20
			internalSetEnabled(canShare());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokespecial   #176 <Method boolean canShare()>
	//    9   17:invokespecial   #46  <Method void internalSetEnabled(boolean)>
	//   10   20:return          
	}

	private DeviceShareDialog dialog;
	private boolean enabledExplicitlySet;
	private int requestCode;
	private ShareContent shareContent;


/*
	static void access$000(DeviceShareButton devicesharebutton, View view)
	{
		devicesharebutton.callExternalOnClickListener(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method void callExternalOnClickListener(View)>
		return;
	//    3    5:return          
	}

*/


/*
	static DeviceShareDialog access$100(DeviceShareButton devicesharebutton)
	{
		return devicesharebutton.getDialog();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method DeviceShareDialog getDialog()>
	//    2    4:areturn         
	}

*/
}
