// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.ProgressBar;
import com.pactforcure.app.util.DialogUtils;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.ui:
//			SetPasswordActivity

class SetPasswordActivity$1
	implements Callback
{

	static void lambda$onResponse$38(SetPasswordActivity$1 setpasswordactivity$1, DialogInterface dialoginterface, int i)
	{
		SetPasswordActivity.access$300(setpasswordactivity$1.this$0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
	//    2    4:invokestatic    #24  <Method void SetPasswordActivity.access$300(SetPasswordActivity)>
	//    3    7:return          
	}

	public void onFailure(Call call, Throwable throwable)
	{
		SetPasswordActivity.access$002(SetPasswordActivity.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #30  <Method boolean SetPasswordActivity.access$002(SetPasswordActivity, boolean)>
	//    4    8:pop             
		SetPasswordActivity.access$100(SetPasswordActivity.this).setVisibility(4);
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field SetPasswordActivity this$0>
	//    7   13:invokestatic    #34  <Method ProgressBar SetPasswordActivity.access$100(SetPasswordActivity)>
	//    8   16:iconst_4        
	//    9   17:invokevirtual   #40  <Method void ProgressBar.setVisibility(int)>
		SetPasswordActivity.access$200(SetPasswordActivity.this);
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field SetPasswordActivity this$0>
	//   12   24:invokestatic    #43  <Method void SetPasswordActivity.access$200(SetPasswordActivity)>
	//   13   27:return          
	}

	public void onResponse(Call call, Response response)
	{
		SetPasswordActivity.access$002(SetPasswordActivity.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #30  <Method boolean SetPasswordActivity.access$002(SetPasswordActivity, boolean)>
	//    4    8:pop             
		SetPasswordActivity.access$100(SetPasswordActivity.this).setVisibility(4);
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field SetPasswordActivity this$0>
	//    7   13:invokestatic    #34  <Method ProgressBar SetPasswordActivity.access$100(SetPasswordActivity)>
	//    8   16:iconst_4        
	//    9   17:invokevirtual   #40  <Method void ProgressBar.setVisibility(int)>
		class .Lambda._cls1
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(SetPasswordActivity._cls1 _pcls1)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls1) (_pcls1)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class SetPasswordActivity$1$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SetPasswordActivity$1$$Lambda$1(SetPasswordActivity$1)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				SetPasswordActivity._cls1.lambda$onResponse$38(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity$1 arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void SetPasswordActivity$1.lambda$onResponse$38(SetPasswordActivity$1, DialogInterface, int)>
			//    5    9:return          
			}

			private final SetPasswordActivity._cls1 arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SetPasswordActivity._cls1.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SetPasswordActivity$1 arg$1>
			//    5    9:return          
			}
		}

		call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (SetPasswordActivity.this)))).setTitle(0x7f080026).setMessage(0x7f08004a).setPositiveButton(0x7f080320, .Lambda._cls1.lambdaFactory.(this)).setCancelable(false).create()));
	//   10   20:new             #49  <Class android.support.v7.app.AlertDialog$Builder>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #15  <Field SetPasswordActivity this$0>
	//   14   28:invokespecial   #52  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//   15   31:ldc1            #53  <Int 0x7f080026>
	//   16   33:invokevirtual   #57  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   17   36:ldc1            #58  <Int 0x7f08004a>
	//   18   38:invokevirtual   #61  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   19   41:ldc1            #62  <Int 0x7f080320>
	//   20   43:aload_0         
	//   21   44:invokestatic    #68  <Method android.content.DialogInterface$OnClickListener SetPasswordActivity$1$$Lambda$1.lambdaFactory$(SetPasswordActivity$1)>
	//   22   47:invokevirtual   #72  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   23   50:iconst_0        
	//   24   51:invokevirtual   #76  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   25   54:invokevirtual   #80  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   26   57:astore_1        
		((AlertDialog) (call)).show();
	//   27   58:aload_1         
	//   28   59:invokevirtual   #85  <Method void AlertDialog.show()>
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (call)));
	//   29   62:aload_1         
	//   30   63:invokestatic    #91  <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
	//   31   66:return          
	}

	final SetPasswordActivity this$0;

	SetPasswordActivity$1()
	{
		this$0 = SetPasswordActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SetPasswordActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
