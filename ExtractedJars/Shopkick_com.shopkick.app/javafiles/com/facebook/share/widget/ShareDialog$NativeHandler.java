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
		if(sharecontent != null && !(sharecontent instanceof ShareCameraEffectContent))
	//*   2    3:aload_1         
	//*   3    4:ifnull          108
	//*   4    7:aload_1         
	//*   5    8:instanceof      #27  <Class ShareCameraEffectContent>
	//*   6   11:ifne            108
		{
			if(sharecontent instanceof ShareStoryContent)
	//*   7   14:aload_1         
	//*   8   15:instanceof      #29  <Class ShareStoryContent>
	//*   9   18:ifeq            23
				return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
			if(!flag)
	//*  12   23:iload_2         
	//*  13   24:ifne            82
			{
				boolean flag1;
				if(sharecontent.getShareHashtag() != null)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #35  <Method com.facebook.share.model.ShareHashtag ShareContent.getShareHashtag()>
	//*  16   31:ifnull          44
					flag1 = DialogPresenter.canPresentNativeDialogWithFeature(((com.facebook.internal.DialogFeature) (ShareDialogFeature.HASHTAG)));
	//   17   34:getstatic       #41  <Field ShareDialogFeature ShareDialogFeature.HASHTAG>
	//   18   37:invokestatic    #47  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.internal.DialogFeature)>
	//   19   40:istore_3        
				else
	//*  20   41:goto            46
					flag1 = true;
	//   21   44:iconst_1        
	//   22   45:istore_3        
				flag = flag1;
	//   23   46:iload_3         
	//   24   47:istore_2        
				if(sharecontent instanceof ShareLinkContent)
	//*  25   48:aload_1         
	//*  26   49:instanceof      #49  <Class ShareLinkContent>
	//*  27   52:ifeq            84
				{
					flag = flag1;
	//   28   55:iload_3         
	//   29   56:istore_2        
					if(!Utility.isNullOrEmpty(((ShareLinkContent)sharecontent).getQuote()))
	//*  30   57:aload_1         
	//*  31   58:checkcast       #49  <Class ShareLinkContent>
	//*  32   61:invokevirtual   #53  <Method String ShareLinkContent.getQuote()>
	//*  33   64:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
	//*  34   67:ifne            84
						flag = flag1 & DialogPresenter.canPresentNativeDialogWithFeature(((com.facebook.internal.DialogFeature) (ShareDialogFeature.LINK_SHARE_QUOTES)));
	//   35   70:iload_3         
	//   36   71:getstatic       #62  <Field ShareDialogFeature ShareDialogFeature.LINK_SHARE_QUOTES>
	//   37   74:invokestatic    #47  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.internal.DialogFeature)>
	//   38   77:iand            
	//   39   78:istore_2        
				}
			} else
	//*  40   79:goto            84
			{
				flag = true;
	//   41   82:iconst_1        
	//   42   83:istore_2        
			}
			boolean flag2 = flag3;
	//   43   84:iload           4
	//   44   86:istore_3        
			if(flag)
	//*  45   87:iload_2         
	//*  46   88:ifeq            106
			{
				flag2 = flag3;
	//   47   91:iload           4
	//   48   93:istore_3        
				if(ShareDialog.access$500(((Object) (sharecontent)).getClass()))
	//*  49   94:aload_1         
	//*  50   95:invokevirtual   #68  <Method Class Object.getClass()>
	//*  51   98:invokestatic    #72  <Method boolean ShareDialog.access$500(Class)>
	//*  52  101:ifeq            106
					flag2 = true;
	//   53  104:iconst_1        
	//   54  105:istore_3        
			}
			return flag2;
	//   55  106:iload_3         
	//   56  107:ireturn         
		} else
		{
			return false;
	//   57  108:iconst_0        
	//   58  109:ireturn         
		}
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #75  <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(final ShareContent content)
	{
		final AppCall appCall = ((AppCall) (ShareDialog.this));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ShareDialog this$0>
	//    2    4:astore_2        
		ShareDialog.access$700(((ShareDialog) (appCall)), ((android.content.Context) (ShareDialog.access$600(((ShareDialog) (appCall))))), content, ShareDialog.Mode.NATIVE);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokestatic    #81  <Method android.app.Activity ShareDialog.access$600(ShareDialog)>
	//    6   10:aload_1         
	//    7   11:getstatic       #87  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//    8   14:invokestatic    #91  <Method void ShareDialog.access$700(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		ShareContentValidation.validateForNativeShare(content);
	//    9   17:aload_1         
	//   10   18:invokestatic    #97  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
		appCall = createBaseAppCall();
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field ShareDialog this$0>
	//   13   25:invokevirtual   #101 <Method AppCall ShareDialog.createBaseAppCall()>
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
, ShareDialog.access$800(((Object) (content)).getClass()));
	//   15   29:aload_2         
	//   16   30:new             #10  <Class ShareDialog$NativeHandler$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:getfield        #16  <Field ShareDialog this$0>
	//   23   41:invokevirtual   #105 <Method boolean ShareDialog.getShouldFailOnDataError()>
	//   24   44:invokespecial   #108 <Method void ShareDialog$NativeHandler$1(ShareDialog$NativeHandler, AppCall, ShareContent, boolean)>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #68  <Method Class Object.getClass()>
	//   27   51:invokestatic    #112 <Method com.facebook.internal.DialogFeature ShareDialog.access$800(Class)>
	//   28   54:invokestatic    #116 <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appCall;
	//   29   57:aload_2         
	//   30   58:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class ShareContent>
	//    3    5:invokevirtual   #119 <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.NATIVE));
	//    0    0:getstatic       #87  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
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
