// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//			MessageDialog

class MessageDialog$NativeHandler$1
	implements com.facebook.internal.der
{

	public Bundle getLegacyParameters()
	{
		return LegacyNativeDialogParameters.create(val$appCall.getCallId(), val$content, val$shouldFailOnDataError);
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
		return NativeDialogParameters.create(val$appCall.getCallId(), val$content, val$shouldFailOnDataError);
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

	MessageDialog$NativeHandler$1()
	{
		this$1 = final_nativehandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MessageDialog$NativeHandler this$1>
		val$appCall = appcall;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field AppCall val$appCall>
		val$content = sharecontent;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field ShareContent val$content>
		val$shouldFailOnDataError = Z.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
