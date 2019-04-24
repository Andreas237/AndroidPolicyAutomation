// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//			AppInviteDialog

private class AppInviteDialog$NativeHandler extends com.facebook.internal.
{

	public boolean canShow(AppInviteContent appinvitecontent)
	{
		return AppInviteDialog.access$200();
	//    0    0:invokestatic    #29  <Method boolean AppInviteDialog.access$200()>
	//    1    3:ireturn         
	}

	public volatile boolean canShow(Object obj)
	{
		return canShow((AppInviteContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class AppInviteContent>
	//    3    5:invokevirtual   #34  <Method boolean canShow(AppInviteContent)>
	//    4    8:ireturn         
	}

	public AppCall createAppCall(final AppInviteContent content)
	{
		AppCall appcall = createBaseAppCall();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AppInviteDialog this$0>
	//    2    4:invokevirtual   #40  <Method AppCall AppInviteDialog.createBaseAppCall()>
	//    3    7:astore_2        
		DialogPresenter.setupAppCallForNativeDialog(appcall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

			public Bundle getLegacyParameters()
			{
				Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
			//    0    0:ldc1            #32  <String "AppInviteDialog">
			//    1    2:ldc1            #34  <String "Attempting to present the AppInviteDialog with an outdated Facebook app on the device">
			//    2    4:invokestatic    #40  <Method int Log.e(String, String)>
			//    3    7:pop             
				return new Bundle();
			//    4    8:new             #42  <Class Bundle>
			//    5   11:dup             
			//    6   12:invokespecial   #43  <Method void Bundle()>
			//    7   15:areturn         
			}

			public Bundle getParameters()
			{
				return AppInviteDialog.access$300(content);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field AppInviteContent val$content>
			//    2    4:invokestatic    #48  <Method Bundle AppInviteDialog.access$300(AppInviteContent)>
			//    3    7:areturn         
			}

			final AppInviteDialog.NativeHandler this$1;
			final AppInviteContent val$content;

			
			{
				this$1 = AppInviteDialog.NativeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppInviteDialog$NativeHandler this$1>
				content = appinvitecontent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AppInviteContent val$content>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
, AppInviteDialog.access$400());
	//    4    8:aload_2         
	//    5    9:new             #10  <Class AppInviteDialog$NativeHandler$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #43  <Method void AppInviteDialog$NativeHandler$1(AppInviteDialog$NativeHandler, AppInviteContent)>
	//   10   18:invokestatic    #47  <Method com.facebook.internal.DialogFeature AppInviteDialog.access$400()>
	//   11   21:invokestatic    #53  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appcall;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((AppInviteContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class AppInviteContent>
	//    3    5:invokevirtual   #56  <Method AppCall createAppCall(AppInviteContent)>
	//    4    8:areturn         
	}

	final AppInviteDialog this$0;

	private AppInviteDialog$NativeHandler()
	{
		this$0 = AppInviteDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppInviteDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (AppInviteDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	AppInviteDialog$NativeHandler(AppInviteDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void AppInviteDialog$NativeHandler(AppInviteDialog)>
	//    3    5:return          
	}
}
