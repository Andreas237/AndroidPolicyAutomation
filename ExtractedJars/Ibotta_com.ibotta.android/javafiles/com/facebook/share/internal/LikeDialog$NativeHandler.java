// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.internal:
//			LikeDialog, LikeContent

private class LikeDialog$NativeHandler extends com.facebook.internal.ndler
{

	public boolean canShow(LikeContent likecontent, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public volatile boolean canShow(Object obj, boolean flag)
	{
		return canShow((LikeContent)obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class LikeContent>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #30  <Method boolean canShow(LikeContent, boolean)>
	//    5    9:ireturn         
	}

	public AppCall createAppCall(final LikeContent content)
	{
		AppCall appcall = createBaseAppCall();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LikeDialog this$0>
	//    2    4:invokevirtual   #36  <Method AppCall LikeDialog.createBaseAppCall()>
	//    3    7:astore_2        
		DialogPresenter.setupAppCallForNativeDialog(appcall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

			public Bundle getLegacyParameters()
			{
				Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
			//    0    0:ldc1            #32  <String "LikeDialog">
			//    1    2:ldc1            #34  <String "Attempting to present the Like Dialog with an outdated Facebook app on the device">
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
				return LikeDialog.access$200(content);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field LikeContent val$content>
			//    2    4:invokestatic    #48  <Method Bundle LikeDialog.access$200(LikeContent)>
			//    3    7:areturn         
			}

			final LikeDialog.NativeHandler this$1;
			final LikeContent val$content;

			
			{
				this$1 = LikeDialog.NativeHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field LikeDialog$NativeHandler this$1>
				content = likecontent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field LikeContent val$content>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
, LikeDialog.access$300());
	//    4    8:aload_2         
	//    5    9:new             #10  <Class LikeDialog$NativeHandler$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #39  <Method void LikeDialog$NativeHandler$1(LikeDialog$NativeHandler, LikeContent)>
	//   10   18:invokestatic    #43  <Method com.facebook.internal.DialogFeature LikeDialog.access$300()>
	//   11   21:invokestatic    #49  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, com.facebook.internal.DialogFeature)>
		return appcall;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile AppCall createAppCall(Object obj)
	{
		return createAppCall((LikeContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class LikeContent>
	//    3    5:invokevirtual   #52  <Method AppCall createAppCall(LikeContent)>
	//    4    8:areturn         
	}

	final LikeDialog this$0;

	private LikeDialog$NativeHandler()
	{
		this$0 = LikeDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LikeDialog this$0>
		super(((com.facebook.internal.FacebookDialogBase) (LikeDialog.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(com.facebook.internal.FacebookDialogBase)>
	//    6   10:return          
	}

	LikeDialog$NativeHandler(LikeDialog._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void LikeDialog$NativeHandler(LikeDialog)>
	//    3    5:return          
	}
}
