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
//			ShareDialog

private class ShareDialog$NativeHandler extends com.facebook.internal.dler
{

	public boolean canShow(ShareContent sharecontent)
	{
		return sharecontent != null && ShareDialog.access$300(((Object) (sharecontent)).getClass());
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Class Object.getClass()>
	//    4    8:invokestatic    #35  <Method boolean ShareDialog.access$300(Class)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public volatile boolean canShow(Object obj)
	{
		return canShow((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class ShareContent>
	//    3    5:invokevirtual   #40  <Method boolean canShow(ShareContent)>
	//    4    8:ireturn         
	}

	public AppCall createAppCall(final ShareContent content)
	{
		ShareDialog.access$500(ShareDialog.this, ((android.content.Context) (ShareDialog.access$400(ShareDialog.this))), content, ShareDialog.Mode.NATIVE);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ShareDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ShareDialog this$0>
	//    4    8:invokestatic    #46  <Method android.app.Activity ShareDialog.access$400(ShareDialog)>
	//    5   11:aload_1         
	//    6   12:getstatic       #52  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//    7   15:invokestatic    #56  <Method void ShareDialog.access$500(ShareDialog, android.content.Context, ShareContent, ShareDialog$Mode)>
		ShareContentValidation.validateForNativeShare(content);
	//    8   18:aload_1         
	//    9   19:invokestatic    #62  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
		final AppCall appCall = createBaseAppCall();
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field ShareDialog this$0>
	//   12   26:invokevirtual   #66  <Method AppCall ShareDialog.createBaseAppCall()>
	//   13   29:astore_2        
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
, ShareDialog.access$600(((Object) (content)).getClass()));
	//   14   30:aload_2         
	//   15   31:new             #10  <Class ShareDialog$NativeHandler$1>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #16  <Field ShareDialog this$0>
	//   22   42:invokevirtual   #70  <Method boolean ShareDialog.getShouldFailOnDataError()>
	//   23   45:invokespecial   #73  <Method void ShareDialog$NativeHandler$1(ShareDialog$NativeHandler, AppCall, ShareContent, boolean)>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #31  <Method Class Object.getClass()>
	//   26   52:invokestatic    #77  <Method com.facebook.internal.DialogFeature ShareDialog.access$600(Class)>
	//   27   55:invokestatic    #83  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appCall;
	//   28   58:aload_2         
	//   29   59:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class ShareContent>
	//    3    5:invokevirtual   #86  <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.NATIVE));
	//    0    0:getstatic       #52  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
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
