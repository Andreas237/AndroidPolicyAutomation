// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.ui:
//			ResetPasswordActivity

class ResetPasswordActivity$1
	implements Callback
{

	static void lambda$onResponse$26(ResetPasswordActivity$1 resetpasswordactivity$1, DialogInterface dialoginterface, int i)
	{
		resetpasswordactivity$1.this$0.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
	//    2    4:invokevirtual   #24  <Method void ResetPasswordActivity.finish()>
	//    3    7:return          
	}

	public void onFailure(Call call, Throwable throwable)
	{
		ResetPasswordActivity.access$000(ResetPasswordActivity.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
	//    2    4:invokestatic    #29  <Method void ResetPasswordActivity.access$000(ResetPasswordActivity)>
		call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (ResetPasswordActivity.this)))).setTitle(0x7f080027).setMessage(0x7f080028).setPositiveButton(0x7f080320, ((android.content.istener) (null))).create()));
	//    3    7:new             #31  <Class android.support.v7.app.AlertDialog$Builder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ResetPasswordActivity this$0>
	//    7   15:invokespecial   #34  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    8   18:ldc1            #35  <Int 0x7f080027>
	//    9   20:invokevirtual   #39  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   10   23:ldc1            #40  <Int 0x7f080028>
	//   11   25:invokevirtual   #43  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   12   28:ldc1            #44  <Int 0x7f080320>
	//   13   30:aconst_null     
	//   14   31:invokevirtual   #48  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   34:invokevirtual   #52  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   16   37:astore_1        
		if(!isFinishing())
	//*  17   38:aload_0         
	//*  18   39:getfield        #15  <Field ResetPasswordActivity this$0>
	//*  19   42:invokevirtual   #56  <Method boolean ResetPasswordActivity.isFinishing()>
	//*  20   45:ifne            52
			((AlertDialog) (call)).show();
	//   21   48:aload_1         
	//   22   49:invokevirtual   #61  <Method void AlertDialog.show()>
	//   23   52:return          
	}

	public void onResponse(Call call, Response response)
	{
		ResetPasswordActivity.access$000(ResetPasswordActivity.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
	//    2    4:invokestatic    #29  <Method void ResetPasswordActivity.access$000(ResetPasswordActivity)>
		class .Lambda._cls1
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(ResetPasswordActivity._cls1 _pcls1)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls1) (_pcls1)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class ResetPasswordActivity$1$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResetPasswordActivity$1$$Lambda$1(ResetPasswordActivity$1)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				ResetPasswordActivity._cls1.lambda$onResponse$26(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResetPasswordActivity$1 arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void ResetPasswordActivity$1.lambda$onResponse$26(ResetPasswordActivity$1, DialogInterface, int)>
			//    5    9:return          
			}

			private final ResetPasswordActivity._cls1 arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResetPasswordActivity._cls1.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResetPasswordActivity$1 arg$1>
			//    5    9:return          
			}
		}

		call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (ResetPasswordActivity.this)))).setTitle(0x7f080026).setMessage(0x7f08004a).setPositiveButton(0x7f080320, .Lambda._cls1.lambdaFactory.(this)).create()));
	//    3    7:new             #31  <Class android.support.v7.app.AlertDialog$Builder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field ResetPasswordActivity this$0>
	//    7   15:invokespecial   #34  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    8   18:ldc1            #66  <Int 0x7f080026>
	//    9   20:invokevirtual   #39  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   10   23:ldc1            #67  <Int 0x7f08004a>
	//   11   25:invokevirtual   #43  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   12   28:ldc1            #44  <Int 0x7f080320>
	//   13   30:aload_0         
	//   14   31:invokestatic    #73  <Method android.content.DialogInterface$OnClickListener ResetPasswordActivity$1$$Lambda$1.lambdaFactory$(ResetPasswordActivity$1)>
	//   15   34:invokevirtual   #48  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   37:invokevirtual   #52  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   17   40:astore_1        
		if(!isFinishing())
	//*  18   41:aload_0         
	//*  19   42:getfield        #15  <Field ResetPasswordActivity this$0>
	//*  20   45:invokevirtual   #56  <Method boolean ResetPasswordActivity.isFinishing()>
	//*  21   48:ifne            55
			((AlertDialog) (call)).show();
	//   22   51:aload_1         
	//   23   52:invokevirtual   #61  <Method void AlertDialog.show()>
	//   24   55:return          
	}

	final ResetPasswordActivity this$0;

	ResetPasswordActivity$1()
	{
		this$0 = ResetPasswordActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ResetPasswordActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
