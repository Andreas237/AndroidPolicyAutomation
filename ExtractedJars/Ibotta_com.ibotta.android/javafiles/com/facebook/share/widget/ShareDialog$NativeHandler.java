// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.*;
import com.facebook.share.internal.*;
import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

private class ShareDialog$NativeHandler extends com.facebook.internal.dler
{

	public boolean canShow(ShareContent sharecontent, boolean flag)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(sharecontent != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          101
		{
			if(sharecontent instanceof ShareCameraEffectContent)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #27  <Class ShareCameraEffectContent>
	//*   6   11:ifeq            16
				return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
			if(!flag)
	//*   9   16:iload_2         
	//*  10   17:ifne            75
			{
				boolean flag1;
				if(sharecontent.getShareHashtag() != null)
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #33  <Method com.facebook.share.model.ShareHashtag ShareContent.getShareHashtag()>
	//*  13   24:ifnull          37
					flag1 = DialogPresenter.canPresentNativeDialogWithFeature(((com.facebook.internal.DialogFeature) (ShareDialogFeature.HASHTAG)));
	//   14   27:getstatic       #39  <Field ShareDialogFeature ShareDialogFeature.HASHTAG>
	//   15   30:invokestatic    #45  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.internal.DialogFeature)>
	//   16   33:istore_3        
				else
	//*  17   34:goto            39
					flag1 = true;
	//   18   37:iconst_1        
	//   19   38:istore_3        
				flag = flag1;
	//   20   39:iload_3         
	//   21   40:istore_2        
				if(sharecontent instanceof ShareLinkContent)
	//*  22   41:aload_1         
	//*  23   42:instanceof      #47  <Class ShareLinkContent>
	//*  24   45:ifeq            77
				{
					flag = flag1;
	//   25   48:iload_3         
	//   26   49:istore_2        
					if(!Utility.isNullOrEmpty(((ShareLinkContent)sharecontent).getQuote()))
	//*  27   50:aload_1         
	//*  28   51:checkcast       #47  <Class ShareLinkContent>
	//*  29   54:invokevirtual   #51  <Method String ShareLinkContent.getQuote()>
	//*  30   57:invokestatic    #57  <Method boolean Utility.isNullOrEmpty(String)>
	//*  31   60:ifne            77
						flag = flag1 & DialogPresenter.canPresentNativeDialogWithFeature(((com.facebook.internal.DialogFeature) (ShareDialogFeature.LINK_SHARE_QUOTES)));
	//   32   63:iload_3         
	//   33   64:getstatic       #60  <Field ShareDialogFeature ShareDialogFeature.LINK_SHARE_QUOTES>
	//   34   67:invokestatic    #45  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.internal.DialogFeature)>
	//   35   70:iand            
	//   36   71:istore_2        
				}
			} else
	//*  37   72:goto            77
			{
				flag = true;
	//   38   75:iconst_1        
	//   39   76:istore_2        
			}
			boolean flag2 = flag3;
	//   40   77:iload           4
	//   41   79:istore_3        
			if(flag)
	//*  42   80:iload_2         
	//*  43   81:ifeq            99
			{
				flag2 = flag3;
	//   44   84:iload           4
	//   45   86:istore_3        
				if(ShareDialog.access$400(((Object) (sharecontent)).getClass()))
	//*  46   87:aload_1         
	//*  47   88:invokevirtual   #66  <Method Class Object.getClass()>
	//*  48   91:invokestatic    #70  <Method boolean ShareDialog.access$400(Class)>
	//*  49   94:ifeq            99
					flag2 = true;
	//   50   97:iconst_1        
	//   51   98:istore_3        
			}
			return flag2;
	//   52   99:iload_3         
	//   53  100:ireturn         
		} else
		{
			return false;
	//   54  101:iconst_0        
	//   55  102:ireturn         
		}
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #73  <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(final ShareContent content)
	{
		final AppCall appCall = ((AppCall) (ShareDialog.this));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ShareDialog this$0>
	//    2    4:astore_2        
		ShareDialog.access$600(((ShareDialog) (appCall)), ((android.content.Context) (ShareDialog.access$500(((ShareDialog) (appCall))))), content, ShareDialog.Mode.NATIVE);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokestatic    #79  <Method android.app.Activity ShareDialog.access$500(ShareDialog)>
	//    6   10:aload_1         
	//    7   11:getstatic       #85  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//    8   14:invokestatic    #89  <Method void ShareDialog.access$600(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		ShareContentValidation.validateForNativeShare(content);
	//    9   17:aload_1         
	//   10   18:invokestatic    #95  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
		appCall = createBaseAppCall();
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field ShareDialog this$0>
	//   13   25:invokevirtual   #99  <Method AppCall ShareDialog.createBaseAppCall()>
	//   14   28:astore_2        
		DialogPresenter.setupAppCallForNativeDialog(appCall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

			public Bundle getLegacyParameters()
			{
				return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field AppCall val$appCall>
			//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
			//    3    7:aload_0         
			//    4    8:getfield        #30  <Field ShareContent val$content>
			//    5   11:aload_0         
			//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
			//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
			//    8   18:areturn         
			}

			public Bundle getParameters()
			{
				return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field AppCall val$appCall>
			//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
			//    3    7:aload_0         
			//    4    8:getfield        #30  <Field ShareContent val$content>
			//    5   11:aload_0         
			//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
			//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
			//    8   18:areturn         
			}

			final ShareDialog.NativeHandler this$1;
			final AppCall val$appCall;
			final ShareContent val$content;
			final boolean val$shouldFailOnDataError;

			
			{
				this$1 = ShareDialog.NativeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ShareDialog$NativeHandler this$1>
				appCall = appcall;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AppCall val$appCall>
				content = sharecontent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field ShareContent val$content>
				shouldFailOnDataError = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
		}
, ShareDialog.access$700(((Object) (content)).getClass()));
	//   15   29:aload_2         
	//   16   30:new             #10  <Class ShareDialog$NativeHandler$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:getfield        #16  <Field ShareDialog this$0>
	//   23   41:invokevirtual   #103 <Method boolean ShareDialog.getShouldFailOnDataError()>
	//   24   44:invokespecial   #106 <Method void ShareDialog$NativeHandler$1(ShareDialog$NativeHandler, AppCall, ShareContent, boolean)>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #66  <Method Class Object.getClass()>
	//   27   51:invokestatic    #110 <Method com.facebook.internal.DialogFeature ShareDialog.access$700(Class)>
	//   28   54:invokestatic    #114 <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appCall;
	//   29   57:aload_2         
	//   30   58:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class ShareContent>
	//    3    5:invokevirtual   #117 <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.NATIVE));
	//    0    0:getstatic       #85  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//    1    3:areturn         
	}

	final ShareDialog this$0;

	private ShareDialog$NativeHandler()
	{
		this$0 = ShareDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ShareDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (ShareDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	ShareDialog$NativeHandler(ShareDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ShareDialog$NativeHandler(ShareDialog)>
	//    3    5:return          
	}
}
