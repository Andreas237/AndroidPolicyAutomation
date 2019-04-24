// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import android.util.Log;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//			AppInviteDialog

class AppInviteDialog$NativeHandler$1
	implements com.facebook.internal.r
{

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
		return AppInviteDialog.access$300(val$content);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AppInviteContent val$content>
	//    2    4:invokestatic    #48  <Method Bundle AppInviteDialog.access$300(AppInviteContent)>
	//    3    7:areturn         
	}

	final AppInviteDialog.NativeHandler this$1;
	final AppInviteContent val$content;

	AppInviteDialog$NativeHandler$1()
	{
		this$1 = final_nativehandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AppInviteDialog$NativeHandler this$1>
		val$content = AppInviteContent.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AppInviteContent val$content>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
