// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.*;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//			MessageDialog

private class MessageDialog$NativeHandler extends com.facebook.internal.er
{

	public boolean canShow(ShareContent sharecontent, boolean flag)
	{
		return sharecontent != null && MessageDialog.canShow(((Object) (sharecontent)).getClass());
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Class Object.getClass()>
	//    4    8:invokestatic    #34  <Method boolean MessageDialog.canShow(Class)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #39  <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(final ShareContent content)
	{
		ShareContentValidation.validateForMessage(content);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method void ShareContentValidation.validateForMessage(ShareContent)>
		final AppCall appCall = createBaseAppCall();
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MessageDialog this$0>
	//    4    8:invokevirtual   #51  <Method AppCall MessageDialog.createBaseAppCall()>
	//    5   11:astore_3        
		final boolean shouldFailOnDataError = getShouldFailOnDataError();
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field MessageDialog this$0>
	//    8   16:invokevirtual   #55  <Method boolean MessageDialog.getShouldFailOnDataError()>
	//    9   19:istore_2        
		MessageDialog.access$200(((android.content.Context) (MessageDialog.access$100(MessageDialog.this))), content, appCall);
	//   10   20:aload_0         
	//   11   21:getfield        #16  <Field MessageDialog this$0>
	//   12   24:invokestatic    #59  <Method android.app.Activity MessageDialog.access$100(MessageDialog)>
	//   13   27:aload_1         
	//   14   28:aload_3         
	//   15   29:invokestatic    #63  <Method void MessageDialog.access$200(android.content.Context, ShareContent, AppCall)>
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

			final MessageDialog.NativeHandler this$1;
			final AppCall val$appCall;
			final ShareContent val$content;
			final boolean val$shouldFailOnDataError;

			
			{
				this$1 = MessageDialog.NativeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MessageDialog$NativeHandler this$1>
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
, MessageDialog.access$300(((Object) (content)).getClass()));
	//   16   32:aload_3         
	//   17   33:new             #10  <Class MessageDialog$NativeHandler$1>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokespecial   #66  <Method void MessageDialog$NativeHandler$1(MessageDialog$NativeHandler, AppCall, ShareContent, boolean)>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #31  <Method Class Object.getClass()>
	//   26   48:invokestatic    #70  <Method com.facebook.internal.DialogFeature MessageDialog.access$300(Class)>
	//   27   51:invokestatic    #76  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appCall;
	//   28   54:aload_3         
	//   29   55:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class ShareContent>
	//    3    5:invokevirtual   #79  <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	final MessageDialog this$0;

	private MessageDialog$NativeHandler()
	{
		this$0 = MessageDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MessageDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (MessageDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	MessageDialog$NativeHandler(MessageDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void MessageDialog$NativeHandler(MessageDialog)>
	//    3    5:return          
	}
}
