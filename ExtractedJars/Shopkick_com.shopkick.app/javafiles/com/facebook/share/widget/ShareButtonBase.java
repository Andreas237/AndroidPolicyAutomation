// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.*;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;

public abstract class ShareButtonBase extends FacebookButtonBase
{

	protected ShareButtonBase(Context context, AttributeSet attributeset, int i, String s, String s1)
	{
		super(context, attributeset, i, 0, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:invokespecial   #17  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		requestCode = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #19  <Field int requestCode>
		enabledExplicitlySet = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #21  <Field boolean enabledExplicitlySet>
		if(isInEditMode())
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #25  <Method boolean isInEditMode()>
	//*  16   26:ifeq            34
			i = 0;
	//   17   29:iconst_0        
	//   18   30:istore_3        
		else
	//*  19   31:goto            39
			i = getDefaultRequestCode();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #29  <Method int getDefaultRequestCode()>
	//   22   38:istore_3        
		requestCode = i;
	//   23   39:aload_0         
	//   24   40:iload_3         
	//   25   41:putfield        #19  <Field int requestCode>
		internalSetEnabled(false);
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:invokespecial   #33  <Method void internalSetEnabled(boolean)>
	//   29   49:return          
	}

	private void internalSetEnabled(boolean flag)
	{
		setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #43  <Method void setEnabled(boolean)>
		enabledExplicitlySet = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #21  <Field boolean enabledExplicitlySet>
	//    6   10:return          
	}

	protected boolean canShare()
	{
		return getDialog().canShow(((Object) (getShareContent())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method FacebookDialogBase getDialog()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #52  <Method ShareContent getShareContent()>
	//    4    8:invokevirtual   #58  <Method boolean FacebookDialogBase.canShow(Object)>
	//    5   11:ireturn         
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		super.configureButton(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #62  <Method void FacebookButtonBase.configureButton(Context, AttributeSet, int, int)>
		setInternalOnClickListener(getShareOnClickListener());
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:invokevirtual   #66  <Method android.view.View$OnClickListener getShareOnClickListener()>
	//    9   14:invokevirtual   #70  <Method void setInternalOnClickListener(android.view.View$OnClickListener)>
	//   10   17:return          
	}

	protected abstract FacebookDialogBase getDialog();

	public int getRequestCode()
	{
		return requestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int requestCode>
	//    2    4:ireturn         
	}

	public ShareContent getShareContent()
	{
		return shareContent;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ShareContent shareContent>
	//    2    4:areturn         
	}

	protected android.view.View.OnClickListener getShareOnClickListener()
	{
		return new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				callExternalOnClickListener(view);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShareButtonBase this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void ShareButtonBase.access$000(ShareButtonBase, View)>
				getDialog().show(((Object) (getShareContent())));
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field ShareButtonBase this$0>
			//    6   12:invokevirtual   #31  <Method FacebookDialogBase ShareButtonBase.getDialog()>
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field ShareButtonBase this$0>
			//    9   19:invokevirtual   #35  <Method ShareContent ShareButtonBase.getShareContent()>
			//   10   22:invokevirtual   #41  <Method void FacebookDialogBase.show(Object)>
			//   11   25:return          
			}

			final ShareButtonBase this$0;

			
			{
				this$0 = ShareButtonBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShareButtonBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class ShareButtonBase$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void ShareButtonBase$1(ShareButtonBase)>
	//    4    8:areturn         
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackmanager, facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method int getRequestCode()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #86  <Method void ShareInternalUtility.registerSharerCallback(int, CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
	{
		setRequestCode(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #93  <Method void setRequestCode(int)>
		registerCallback(callbackmanager, facebookcallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #95  <Method void registerCallback(CallbackManager, FacebookCallback)>
	//    7   11:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #97  <Method void FacebookButtonBase.setEnabled(boolean)>
		enabledExplicitlySet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #21  <Field boolean enabledExplicitlySet>
	//    6   10:return          
	}

	protected void setRequestCode(int i)
	{
		if(!FacebookSdk.isFacebookRequestCode(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #103 <Method boolean FacebookSdk.isFacebookRequestCode(int)>
	//*   2    4:ifne            13
		{
			requestCode = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #19  <Field int requestCode>
			return;
	//    6   12:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #105 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #108 <Method void StringBuilder()>
	//   10   20:astore_2        
			stringbuilder.append("Request code ");
	//   11   21:aload_2         
	//   12   22:ldc1            #110 <String "Request code ">
	//   13   24:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			stringbuilder.append(" cannot be within the range reserved by the Facebook SDK.");
	//   19   34:aload_2         
	//   20   35:ldc1            #119 <String " cannot be within the range reserved by the Facebook SDK.">
	//   21   37:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   41:new             #121 <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #128 <Method void IllegalArgumentException(String)>
	//   28   52:athrow          
		}
	}

	public void setShareContent(ShareContent sharecontent)
	{
		shareContent = sharecontent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field ShareContent shareContent>
		if(!enabledExplicitlySet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field boolean enabledExplicitlySet>
	//*   5    9:ifne            20
			internalSetEnabled(canShare());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #132 <Method boolean canShare()>
	//    9   17:invokespecial   #33  <Method void internalSetEnabled(boolean)>
	//   10   20:return          
	}

	private boolean enabledExplicitlySet;
	private int requestCode;
	private ShareContent shareContent;


/*
	static void access$000(ShareButtonBase sharebuttonbase, View view)
	{
		sharebuttonbase.callExternalOnClickListener(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method void callExternalOnClickListener(View)>
		return;
	//    3    5:return          
	}

*/
}
