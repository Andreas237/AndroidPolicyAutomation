// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.*;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareStoryContent;

// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

private class ShareDialog$ShareStoryHandler extends com.facebook.internal.
{

	public boolean canShow(ShareContent sharecontent, boolean flag)
	{
		return (sharecontent instanceof ShareStoryContent) && ShareDialog.access$500(((Object) (sharecontent)).getClass());
	//    0    0:aload_1         
	//    1    1:instanceof      #27  <Class ShareStoryContent>
	//    2    4:ifeq            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
	//    5   11:invokestatic    #37  <Method boolean ShareDialog.access$500(Class)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((ShareContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class ShareContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #42  <Method boolean canShow(ShareContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(final ShareContent content)
	{
		ShareContentValidation.validateForStoryShare(content);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method void ShareContentValidation.validateForStoryShare(ShareContent)>
		final AppCall appCall = createBaseAppCall();
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ShareDialog this$0>
	//    4    8:invokevirtual   #54  <Method AppCall ShareDialog.createBaseAppCall()>
	//    5   11:astore_2        
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

			final ShareDialog.ShareStoryHandler this$1;
			final AppCall val$appCall;
			final ShareContent val$content;
			final boolean val$shouldFailOnDataError;

			
			{
				this$1 = ShareDialog.ShareStoryHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ShareDialog$ShareStoryHandler this$1>
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
	//    6   12:aload_2         
	//    7   13:new             #10  <Class ShareDialog$ShareStoryHandler$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #16  <Field ShareDialog this$0>
	//   14   24:invokevirtual   #58  <Method boolean ShareDialog.getShouldFailOnDataError()>
	//   15   27:invokespecial   #61  <Method void ShareDialog$ShareStoryHandler$1(ShareDialog$ShareStoryHandler, AppCall, ShareContent, boolean)>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #33  <Method Class Object.getClass()>
	//   18   34:invokestatic    #65  <Method com.facebook.internal.DialogFeature ShareDialog.access$800(Class)>
	//   19   37:invokestatic    #71  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appCall;
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((ShareContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class ShareContent>
	//    3    5:invokevirtual   #74  <Method AppCall createAppCall(ShareContent)>
	//    4    8:areturn         
	}

	public Object getMode()
	{
		return ((Object) (ShareDialog.Mode.NATIVE));
	//    0    0:getstatic       #82  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//    1    3:areturn         
	}

	final ShareDialog this$0;

	private ShareDialog$ShareStoryHandler()
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

	ShareDialog$ShareStoryHandler(ShareDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ShareDialog$ShareStoryHandler(ShareDialog)>
	//    3    5:return          
	}
}
