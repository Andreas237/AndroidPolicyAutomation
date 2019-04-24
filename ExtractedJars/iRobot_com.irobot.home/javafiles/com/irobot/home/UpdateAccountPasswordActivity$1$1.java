// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			UpdateAccountPasswordActivity

class UpdateAccountPasswordActivity$1$1
	implements android.content.DialogInterface$OnDismissListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		a.a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UpdateAccountPasswordActivity$1 a>
	//    2    4:getfield        #26  <Field UpdateAccountPasswordActivity UpdateAccountPasswordActivity$1.a>
	//    3    7:invokevirtual   #31  <Method void UpdateAccountPasswordActivity.finish()>
	//    4   10:return          
	}

	final UpdateAccountPasswordActivity._cls1 a;

	UpdateAccountPasswordActivity$1$1(UpdateAccountPasswordActivity._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field UpdateAccountPasswordActivity$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/UpdateAccountPasswordActivity$1

/* anonymous class */
	class UpdateAccountPasswordActivity._cls1
		implements com.irobot.home.util.g.a
	{

		public void a(int i)
		{
		//    0    0:return          
		}

		public void b(int i)
		{
			if(!j.a())
		//*   0    0:invokestatic    #29  <Method boolean j.a()>
		//*   1    3:ifne            70
			{
				if(UpdateAccountPasswordActivity.a(a) == null)
		//*   2    6:aload_0         
		//*   3    7:getfield        #19  <Field UpdateAccountPasswordActivity a>
		//*   4   10:invokestatic    #32  <Method AlertDialog UpdateAccountPasswordActivity.a(UpdateAccountPasswordActivity)>
		//*   5   13:ifnonnull       60
					UpdateAccountPasswordActivity.a(a, (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (new UpdateAccountPasswordActivity._cls1._cls1(this)))).create());
		//    6   16:aload_0         
		//    7   17:getfield        #19  <Field UpdateAccountPasswordActivity a>
		//    8   20:new             #34  <Class android.app.AlertDialog$Builder>
		//    9   23:dup             
		//   10   24:aload_0         
		//   11   25:getfield        #19  <Field UpdateAccountPasswordActivity a>
		//   12   28:invokespecial   #37  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//   13   31:ldc1            #38  <Int 0x7f0f04db>
		//   14   33:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
		//   15   36:ldc1            #43  <Int 0x7f0f05bb>
		//   16   38:aconst_null     
		//   17   39:invokevirtual   #47  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   18   42:new             #13  <Class UpdateAccountPasswordActivity$1$1>
		//   19   45:dup             
		//   20   46:aload_0         
		//   21   47:invokespecial   #50  <Method void UpdateAccountPasswordActivity$1$1(UpdateAccountPasswordActivity$1)>
		//   22   50:invokevirtual   #54  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		//   23   53:invokevirtual   #58  <Method AlertDialog android.app.AlertDialog$Builder.create()>
		//   24   56:invokestatic    #61  <Method AlertDialog UpdateAccountPasswordActivity.a(UpdateAccountPasswordActivity, AlertDialog)>
		//   25   59:pop             
				UpdateAccountPasswordActivity.a(a).show();
		//   26   60:aload_0         
		//   27   61:getfield        #19  <Field UpdateAccountPasswordActivity a>
		//   28   64:invokestatic    #32  <Method AlertDialog UpdateAccountPasswordActivity.a(UpdateAccountPasswordActivity)>
		//   29   67:invokevirtual   #66  <Method void AlertDialog.show()>
			}
		//   30   70:return          
		}

		final UpdateAccountPasswordActivity a;

			
			{
				a = updateaccountpasswordactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field UpdateAccountPasswordActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
