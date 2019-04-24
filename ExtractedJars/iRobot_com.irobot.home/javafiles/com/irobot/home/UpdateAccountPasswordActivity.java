// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.util.g;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class UpdateAccountPasswordActivity extends BaseFragmentActivity
{

	public UpdateAccountPasswordActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BaseFragmentActivity()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field AlertDialog b>
	//    5    9:return          
	}

	static AlertDialog a(UpdateAccountPasswordActivity updateaccountpasswordactivity)
	{
		return updateaccountpasswordactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AlertDialog b>
	//    2    4:areturn         
	}

	static AlertDialog a(UpdateAccountPasswordActivity updateaccountpasswordactivity, AlertDialog alertdialog)
	{
		updateaccountpasswordactivity.b = alertdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AlertDialog b>
		return alertdialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	protected void e()
	{
		b(0x7f0f0942);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Int 0x7f0f0942>
	//    2    3:invokevirtual   #26  <Method void b(int)>
		com.gigya.socialize.android.GSPluginFragment gspluginfragment = g.a(((android.content.Context) (this)), a, "gigya-change-password-screen", new com.irobot.home.util.g.a() {

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
						UpdateAccountPasswordActivity.a(a, (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(this) {

							public void onDismiss(DialogInterface dialoginterface)
							{
								a.a.finish();
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field UpdateAccountPasswordActivity$1 a>
							//    2    4:getfield        #26  <Field UpdateAccountPasswordActivity UpdateAccountPasswordActivity$1.a>
							//    3    7:invokevirtual   #31  <Method void UpdateAccountPasswordActivity.finish()>
							//    4   10:return          
							}

							final _cls1 a;

			
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
						}
).create());
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
				a = UpdateAccountPasswordActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field UpdateAccountPasswordActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #28  <Field String a>
	//    6   11:ldc1            #30  <String "gigya-change-password-screen">
	//    7   13:new             #6   <Class UpdateAccountPasswordActivity$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #33  <Method void UpdateAccountPasswordActivity$1(UpdateAccountPasswordActivity)>
	//   11   21:invokestatic    #38  <Method com.gigya.socialize.android.GSPluginFragment g.a(android.content.Context, String, String, com.irobot.home.util.g$a)>
	//   12   24:astore_1        
		getSupportFragmentManager().beginTransaction().add(0x7f0901a0, ((android.support.v4.app.Fragment) (gspluginfragment))).commit();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #42  <Method FragmentManager getSupportFragmentManager()>
	//   15   29:invokevirtual   #48  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   16   32:ldc1            #49  <Int 0x7f0901a0>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #55  <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   19   38:invokevirtual   #59  <Method int FragmentTransaction.commit()>
	//   20   41:pop             
		getSupportFragmentManager().executePendingTransactions();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #42  <Method FragmentManager getSupportFragmentManager()>
	//   23   46:invokevirtual   #63  <Method boolean FragmentManager.executePendingTransactions()>
	//   24   49:pop             
	//   25   50:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void BaseFragmentActivity.onCreate(Bundle)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.UpdatePassword);
	//    3    5:invokestatic    #73  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:getstatic       #79  <Field ViewId ViewId.UpdatePassword>
	//    5   11:invokevirtual   #83  <Method void AnalyticsSubsystem.trackView(ViewId)>
	//    6   14:return          
	}

	String a;
	private AlertDialog b;
}
