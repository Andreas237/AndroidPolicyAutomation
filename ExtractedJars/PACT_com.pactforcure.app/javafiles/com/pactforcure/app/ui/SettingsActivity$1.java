// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.ProgressDialog;
import com.pactforcure.app.api.SimpleCallback;

// Referenced classes of package com.pactforcure.app.ui:
//			SettingsActivity

class SettingsActivity$1
	implements SimpleCallback
{

	public void onError(String s)
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
		SettingsActivity.access$000(SettingsActivity.this, val$optOut);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field SettingsActivity this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field boolean val$optOut>
	//    7   15:invokestatic    #41  <Method void SettingsActivity.access$000(SettingsActivity, boolean)>
	//    8   18:return          
	}

	public void onSuccess()
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
	//    3    7:return          
	}

	final SettingsActivity this$0;
	final boolean val$optOut;
	final ProgressDialog val$progressDialog;

	SettingsActivity$1()
	{
		this$0 = final_settingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SettingsActivity this$0>
		val$progressDialog = progressdialog;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ProgressDialog val$progressDialog>
		val$optOut = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$optOut>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
