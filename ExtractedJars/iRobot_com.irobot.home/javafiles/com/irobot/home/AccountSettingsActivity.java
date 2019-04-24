// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.Button;
import android.widget.ProgressBar;
import com.irobot.core.*;
import com.irobot.home.i.a;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.q.b;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_, UpdateAccountProfileActivity_, UpdateAccountPasswordActivity_, 
//			AccountLoginActivity_

public class AccountSettingsActivity extends BaseFragmentActivity
{

	public AccountSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void BaseFragmentActivity()>
		t = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #63  <Field String t>
		u = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #65  <Field a u>
		v = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #67  <Field boolean v>
	//   11   19:return          
	}

	static void a(AccountSettingsActivity accountsettingsactivity)
	{
		accountsettingsactivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void p()>
	//    2    4:return          
	}

	static void b(AccountSettingsActivity accountsettingsactivity)
	{
		accountsettingsactivity.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void o()>
	//    2    4:return          
	}

	static void c(AccountSettingsActivity accountsettingsactivity)
	{
		accountsettingsactivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void n()>
	//    2    4:return          
	}

	private void k()
	{
		a(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field Toolbar d>
	//    3    5:invokevirtual   #80  <Method void a(Toolbar)>
		ActionBar actionbar = a();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method ActionBar a()>
	//    6   12:astore_1        
		if(actionbar != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          37
		{
			actionbar.a(((CharSequence) (null)));
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #88  <Method void ActionBar.a(CharSequence)>
			b(0x7f0f045c);
	//   12   22:aload_0         
	//   13   23:ldc1            #89  <Int 0x7f0f045c>
	//   14   25:invokevirtual   #92  <Method void b(int)>
			e.setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #94  <Field View e>
	//   17   32:bipush          8
	//   18   34:invokevirtual   #99  <Method void View.setVisibility(int)>
		}
		d.setVisibility(0);
	//   19   37:aload_0         
	//   20   38:getfield        #77  <Field Toolbar d>
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #102 <Method void Toolbar.setVisibility(int)>
	//   23   45:return          
	}

	private void l()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0254).setMessage(0x7f0f0252).setPositiveButton(0x7f0f0253, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				AccountSettingsActivity.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccountSettingsActivity a>
			//    2    4:invokestatic    #25  <Method void AccountSettingsActivity.c(AccountSettingsActivity)>
			//    3    7:return          
			}

			final AccountSettingsActivity a;

			
			{
				a = AccountSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNeutralButton(0x7f0f0958, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				com.irobot.home.AccountSettingsActivity.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccountSettingsActivity a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.AccountSettingsActivity.b(AccountSettingsActivity)>
			//    3    7:return          
			}

			final AccountSettingsActivity a;

			
			{
				a = AccountSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #104 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #108 <Int 0x7f0f0254>
	//    5   10:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   13:ldc1            #113 <Int 0x7f0f0252>
	//    7   15:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   18:ldc1            #117 <Int 0x7f0f0253>
	//    9   20:new             #10  <Class AccountSettingsActivity$3>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokespecial   #119 <Method void AccountSettingsActivity$3(AccountSettingsActivity)>
	//   13   28:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   31:ldc1            #124 <Int 0x7f0f0958>
	//   15   33:new             #8   <Class AccountSettingsActivity$2>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #125 <Method void AccountSettingsActivity$2(AccountSettingsActivity)>
	//   19   41:invokevirtual   #128 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//   20   44:ldc1            #129 <Int 0x7f0f017d>
	//   21   46:aconst_null     
	//   22   47:invokevirtual   #132 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   23   50:invokevirtual   #136 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   24   53:pop             
	//   25   54:return          
	}

	private void m()
	{
		Assembler.getInstance().getAccountService().requestPersonalInformation(((HttpCallback) (new HttpCallback() {

			public void onFailure(int i1, Error error)
			{
				a.a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountSettingsActivity a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void com.irobot.home.AccountSettingsActivity.a(boolean)>
				a.a(0x7f0f0256, 0x7f0f0255);
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field AccountSettingsActivity a>
			//    6   12:ldc1            #24  <Int 0x7f0f0256>
			//    7   14:ldc1            #25  <Int 0x7f0f0255>
			//    8   16:invokevirtual   #28  <Method void com.irobot.home.AccountSettingsActivity.a(int, int)>
			//    9   19:return          
			}

			public void onSuccess(HttpResponse httpresponse)
			{
				a.a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountSettingsActivity a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void com.irobot.home.AccountSettingsActivity.a(boolean)>
				a.a(0x7f0f06b1, 0x7f0f06b0);
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field AccountSettingsActivity a>
			//    6   12:ldc1            #31  <Int 0x7f0f06b1>
			//    7   14:ldc1            #32  <Int 0x7f0f06b0>
			//    8   16:invokevirtual   #28  <Method void com.irobot.home.AccountSettingsActivity.a(int, int)>
			//    9   19:return          
			}

			final AccountSettingsActivity a;

			
			{
				a = AccountSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AccountSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void HttpCallback()>
			//    5    9:return          
			}
		}
)));
	//    0    0:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #146 <Method AccountService Assembler.getAccountService()>
	//    2    6:new             #12  <Class AccountSettingsActivity$4>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #147 <Method void AccountSettingsActivity$4(AccountSettingsActivity)>
	//    6   14:invokevirtual   #153 <Method void AccountService.requestPersonalInformation(HttpCallback)>
		a(true);
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #156 <Method void a(boolean)>
	//   10   22:return          
	}

	private void n()
	{
		Assembler.getInstance().getAccountService().requestAccountDeletion(((HttpCallback) (new HttpCallback() {

			public void onFailure(int i1, Error error)
			{
				a.a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountSettingsActivity a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void com.irobot.home.AccountSettingsActivity.a(boolean)>
				a.a(0x7f0f0256, 0x7f0f0255);
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field AccountSettingsActivity a>
			//    6   12:ldc1            #24  <Int 0x7f0f0256>
			//    7   14:ldc1            #25  <Int 0x7f0f0255>
			//    8   16:invokevirtual   #28  <Method void com.irobot.home.AccountSettingsActivity.a(int, int)>
			//    9   19:return          
			}

			public void onSuccess(HttpResponse httpresponse)
			{
				a.a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountSettingsActivity a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void com.irobot.home.AccountSettingsActivity.a(boolean)>
				a.j();
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field AccountSettingsActivity a>
			//    6   12:invokevirtual   #33  <Method void com.irobot.home.AccountSettingsActivity.j()>
			//    7   15:return          
			}

			final AccountSettingsActivity a;

			
			{
				a = AccountSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AccountSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void HttpCallback()>
			//    5    9:return          
			}
		}
)));
	//    0    0:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #146 <Method AccountService Assembler.getAccountService()>
	//    2    6:new             #14  <Class AccountSettingsActivity$5>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #157 <Method void AccountSettingsActivity$5(AccountSettingsActivity)>
	//    6   14:invokevirtual   #160 <Method void AccountService.requestAccountDeletion(HttpCallback)>
		a(true);
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #156 <Method void a(boolean)>
	//   10   22:return          
	}

	private void o()
	{
		if(com.irobot.home.util.j.i(t))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field String t>
	//*   2    4:invokestatic    #163 <Method boolean j.i(String)>
	//*   3    7:ifeq            34
		{
			com.irobot.home.WebViewActivity_.a(((android.content.Context) (this))).a(t).a(Integer.valueOf(0x7f0f05d8)).a();
	//    4   10:aload_0         
	//    5   11:invokestatic    #168 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field String t>
	//    8   18:invokevirtual   #173 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    9   21:ldc1            #174 <Int 0x7f0f05d8>
	//   10   23:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   11   26:invokevirtual   #183 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   12   29:invokevirtual   #186 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   13   32:pop             
			return;
	//   14   33:return          
		} else
		{
			a(0x7f0f0256, 0x7f0f0960);
	//   15   34:aload_0         
	//   16   35:ldc1            #187 <Int 0x7f0f0256>
	//   17   37:ldc1            #188 <Int 0x7f0f0960>
	//   18   39:invokevirtual   #191 <Method void a(int, int)>
			return;
	//   19   42:return          
		}
	}

	private void p()
	{
		v = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #67  <Field boolean v>
		a(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #156 <Method void a(boolean)>
		Assembler.getInstance().getAccountService().logout();
	//    6   10:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//    7   13:invokevirtual   #146 <Method AccountService Assembler.getAccountService()>
	//    8   16:invokevirtual   #194 <Method void AccountService.logout()>
	//    9   19:return          
	}

	protected void a(int i1, int j1)
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(i1).setMessage(j1).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #104 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   12:iload_2         
	//    7   13:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   16:ldc1            #195 <Int 0x7f0f05bb>
	//    9   18:aconst_null     
	//   10   19:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   22:invokevirtual   #136 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   25:pop             
	//   13   26:return          
	}

	protected void a(boolean flag)
	{
		Object obj;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            43
		{
			obj = ((Object) (i));
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field ProgressBar i>
	//    4    8:astore_2        
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
			((ProgressBar) (obj)).setVisibility(0);
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #200 <Method void ProgressBar.setVisibility(int)>
			obj = ((Object) (f));
	//   10   16:aload_0         
	//   11   17:getfield        #202 <Field Button f>
	//   12   20:astore_2        
		} else
	//*  13   21:aload_2         
	//*  14   22:iload_1         
	//*  15   23:invokevirtual   #207 <Method void Button.setEnabled(boolean)>
	//*  16   26:aload_0         
	//*  17   27:getfield        #209 <Field Button g>
	//*  18   30:iload_1         
	//*  19   31:invokevirtual   #207 <Method void Button.setEnabled(boolean)>
	//*  20   34:aload_0         
	//*  21   35:getfield        #211 <Field Button h>
	//*  22   38:iload_1         
	//*  23   39:invokevirtual   #207 <Method void Button.setEnabled(boolean)>
	//*  24   42:return          
		{
			i.setVisibility(8);
	//   25   43:aload_0         
	//   26   44:getfield        #197 <Field ProgressBar i>
	//   27   47:bipush          8
	//   28   49:invokevirtual   #200 <Method void ProgressBar.setVisibility(int)>
			obj = ((Object) (f));
	//   29   52:aload_0         
	//   30   53:getfield        #202 <Field Button f>
	//   31   56:astore_2        
			flag = true;
	//   32   57:iconst_1        
	//   33   58:istore_1        
		}
		((Button) (obj)).setEnabled(flag);
		g.setEnabled(flag);
		h.setEnabled(flag);
	//*  34   59:goto            21
	}

	protected void e()
	{
		String s;
		if(Assembler.getInstance().getAccountService().requiresMultiAccountSupport())
	//*   0    0:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//*   1    3:invokevirtual   #146 <Method AccountService Assembler.getAccountService()>
	//*   2    6:invokevirtual   #215 <Method boolean AccountService.requiresMultiAccountSupport()>
	//*   3    9:ifeq            18
			s = "iRobot-MultiAccount-Android-ProfileUpdate";
	//    4   12:ldc1            #217 <String "iRobot-MultiAccount-Android-ProfileUpdate">
	//    5   14:astore_1        
		else
	//*   6   15:goto            21
			s = "iRobot-Android-ProfileUpdate";
	//    7   18:ldc1            #219 <String "iRobot-Android-ProfileUpdate">
	//    8   20:astore_1        
		n = s;
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:putfield        #221 <Field String n>
		o = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:invokestatic    #224 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   15   31:putfield        #226 <Field CustomerCareRestClient o>
		i();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #228 <Method void i()>
		u = (a)Assembler.getInstance().getDomainEventBus();
	//   18   38:aload_0         
	//   19   39:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//   20   42:invokevirtual   #232 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   21   45:checkcast       #234 <Class a>
	//   22   48:putfield        #65  <Field a u>
	//   23   51:return          
	}

	protected void f()
	{
		if(!com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #236 <Method boolean j.a()>
	//*   1    3:ifne            30
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    2    6:new             #104 <Class android.app.AlertDialog$Builder>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #107 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    6   14:ldc1            #237 <Int 0x7f0f04db>
	//    7   16:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   19:ldc1            #195 <Int 0x7f0f05bb>
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   25:invokevirtual   #136 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   28:pop             
			return;
	//   13   29:return          
		} else
		{
			p();
	//   14   30:aload_0         
	//   15   31:invokespecial   #71  <Method void p()>
			return;
	//   16   34:return          
		}
	}

	protected void g()
	{
		com.irobot.home.UpdateAccountProfileActivity_.a(((android.content.Context) (this))).a(n).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #242 <Method UpdateAccountProfileActivity_$a com.irobot.home.UpdateAccountProfileActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #221 <Field String n>
	//    4    8:invokevirtual   #247 <Method UpdateAccountProfileActivity_$a com.irobot.home.UpdateAccountProfileActivity_$a.a(String)>
	//    5   11:invokevirtual   #248 <Method org.androidannotations.api.a.e com.irobot.home.UpdateAccountProfileActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void h()
	{
		com.irobot.home.UpdateAccountPasswordActivity_.a(((android.content.Context) (this))).a(n).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #253 <Method UpdateAccountPasswordActivity_$a com.irobot.home.UpdateAccountPasswordActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #221 <Field String n>
	//    4    8:invokevirtual   #258 <Method UpdateAccountPasswordActivity_$a com.irobot.home.UpdateAccountPasswordActivity_$a.a(String)>
	//    5   11:invokevirtual   #259 <Method org.androidannotations.api.a.e com.irobot.home.UpdateAccountPasswordActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void i()
	{
		Object obj;
		String s;
		obj = ((Object) (com.irobot.home.util.j.a(Locale.getDefault())));
	//    0    0:invokestatic    #267 <Method Locale Locale.getDefault()>
	//    1    3:invokestatic    #270 <Method String j.a(Locale)>
	//    2    6:astore_1        
		s = com.irobot.home.util.j.h(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #273 <Method String j.h(android.content.Context)>
	//    5   11:astore_2        
		obj = ((Object) (o.getRobotErrorHelp(((String) (obj)), s, "R980020")));
	//    6   12:aload_0         
	//    7   13:getfield        #226 <Field CustomerCareRestClient o>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:ldc2            #275 <String "R980020">
	//   11   21:invokeinterface #281 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   12   26:astore_1        
label0:
		{
			if(obj == null)
				break label0;
	//   13   27:aload_1         
	//   14   28:ifnull          127
			try
			{
				if(((RobotErrorHelpContentList) (obj)).otherContent == null)
					break label0;
	//   15   31:aload_1         
	//   16   32:getfield        #287 <Field List RobotErrorHelpContentList.otherContent>
	//   17   35:ifnull          127
				obj = ((Object) (((RobotErrorHelpContentList) (obj)).otherContent.iterator()));
	//   18   38:aload_1         
	//   19   39:getfield        #287 <Field List RobotErrorHelpContentList.otherContent>
	//   20   42:invokeinterface #293 <Method Iterator List.iterator()>
	//   21   47:astore_1        
				RobotErrorHelpContent roboterrorhelpcontent;
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break label0;
	//   22   48:aload_1         
	//   23   49:invokeinterface #298 <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            127
					roboterrorhelpcontent = (RobotErrorHelpContent)((Iterator) (obj)).next();
	//   25   57:aload_1         
	//   26   58:invokeinterface #302 <Method Object Iterator.next()>
	//   27   63:checkcast       #304 <Class RobotErrorHelpContent>
	//   28   66:astore_2        
				} while(!roboterrorhelpcontent.id.equalsIgnoreCase("Account_delete"));
	//   29   67:aload_2         
	//   30   68:getfield        #307 <Field String RobotErrorHelpContent.id>
	//   31   71:ldc2            #309 <String "Account_delete">
	//   32   74:invokevirtual   #314 <Method boolean String.equalsIgnoreCase(String)>
	//   33   77:ifeq            48
				t = roboterrorhelpcontent.content;
	//   34   80:aload_0         
	//   35   81:aload_2         
	//   36   82:getfield        #317 <Field String RobotErrorHelpContent.content>
	//   37   85:putfield        #63  <Field String t>
				return;
	//   38   88:return          
			}
			catch(Exception exception)
	//*  39   89:astore_1        
			{
				String s1 = j;
	//   40   90:getstatic       #57  <Field String j>
	//   41   93:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   42   94:new             #319 <Class StringBuilder>
	//   43   97:dup             
	//   44   98:invokespecial   #320 <Method void StringBuilder()>
	//   45  101:astore_3        
				stringbuilder.append("Unable to get robot error help: ");
	//   46  102:aload_3         
	//   47  103:ldc2            #322 <String "Unable to get robot error help: ">
	//   48  106:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   49  109:pop             
				stringbuilder.append(exception.getMessage());
	//   50  110:aload_3         
	//   51  111:aload_1         
	//   52  112:invokevirtual   #329 <Method String Exception.getMessage()>
	//   53  115:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   54  118:pop             
				com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   55  119:aload_2         
	//   56  120:aload_3         
	//   57  121:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   58  124:invokestatic    #337 <Method void o.b(String, String)>
			}
		}
		return;
	//   59  127:return          
	}

	protected void j()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0752).setMessage(0x7f0f0751).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

			public void onDismiss(DialogInterface dialoginterface)
			{
				com.irobot.home.AccountSettingsActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccountSettingsActivity a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.AccountSettingsActivity.a(AccountSettingsActivity)>
			//    3    7:return          
			}

			final AccountSettingsActivity a;

			
			{
				a = AccountSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:new             #104 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #338 <Int 0x7f0f0752>
	//    5   11:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   14:ldc2            #339 <Int 0x7f0f0751>
	//    7   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   20:ldc1            #195 <Int 0x7f0f05bb>
	//    9   22:aconst_null     
	//   10   23:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   26:new             #6   <Class AccountSettingsActivity$1>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #340 <Method void AccountSettingsActivity$1(AccountSettingsActivity)>
	//   15   34:invokevirtual   #344 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   16   37:invokevirtual   #136 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   17   40:pop             
	//   18   41:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #156 <Method void a(boolean)>
		if(com.irobot.home.util.j.k() != null)
	//*   3    5:invokestatic    #350 <Method AssetId j.k()>
	//*   4    8:ifnull          24
			r.d(com.irobot.home.util.j.k().getId());
	//    5   11:aload_0         
	//    6   12:getfield        #353 <Field b r>
	//    7   15:invokestatic    #350 <Method AssetId j.k()>
	//    8   18:invokevirtual   #358 <Method String AssetId.getId()>
	//    9   21:invokevirtual   #363 <Method void b.d(String)>
		u.b(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   10   24:aload_0         
	//   11   25:getfield        #65  <Field a u>
	//   12   28:aload_0         
	//   13   29:getstatic       #369 <Field EventType EventType.AccountLoggedOutEvent>
	//   14   32:invokevirtual   #372 <Method void a.b(Object, EventType)>
		com.irobot.home.util.j.a(((android.app.Activity) (this)), com.irobot.home.AccountLoginActivity_.a(((android.content.Context) (this))).b());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:invokestatic    #377 <Method AccountLoginActivity_$a com.irobot.home.AccountLoginActivity_.a(android.content.Context)>
	//   18   40:invokevirtual   #382 <Method android.content.Intent com.irobot.home.AccountLoginActivity_$a.b()>
	//   19   43:invokestatic    #385 <Method void j.a(android.app.Activity, android.content.Intent)>
	//   20   46:return          
	}

	public void onBackPressed()
	{
		if(!v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean v>
	//*   2    4:ifne            11
			super.onBackPressed();
	//    3    7:aload_0         
	//    4    8:invokespecial   #389 <Method void BaseFragmentActivity.onBackPressed()>
	//    5   11:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #393 <Method void BaseFragmentActivity.onCreate(Bundle)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.ManageAccount);
	//    3    5:invokestatic    #398 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:getstatic       #404 <Field ViewId ViewId.ManageAccount>
	//    5   11:invokevirtual   #408 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//    6   14:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0c0004, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc2            #415 <Int 0x7f0c0004>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #421 <Method void MenuInflater.inflate(int, Menu)>
		return super.onCreateOptionsMenu(menu);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #423 <Method boolean BaseFragmentActivity.onCreateOptionsMenu(Menu)>
	//    8   16:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		switch(menuitem.getItemId())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #431 <Method int MenuItem.getItemId()>
		{
	//*   2    6:tableswitch     2131297080 2131297081: default 28
	//	               2131297080 47
	//	               2131297081 40
		default:
			com.irobot.home.util.o.e(j, "Undefined menu item clicked.");
	//    3   28:getstatic       #57  <Field String j>
	//    4   31:ldc2            #433 <String "Undefined menu item clicked.">
	//    5   34:invokestatic    #435 <Method void o.e(String, String)>
			break;

	//*   6   37:goto            51
		case 2131297081: 
			m();
	//    7   40:aload_0         
	//    8   41:invokespecial   #437 <Method void m()>
			break;

	//*   9   44:goto            51
		case 2131297080: 
			l();
	//   10   47:aload_0         
	//   11   48:invokespecial   #439 <Method void l()>
			break;
		}
		return true;
	//   12   51:iconst_1        
	//   13   52:ireturn         
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void BaseFragmentActivity.onPause()>
		u.b(((Object) (this)), EventType.AccountLoggedOutEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field a u>
	//    4    8:aload_0         
	//    5    9:getstatic       #369 <Field EventType EventType.AccountLoggedOutEvent>
	//    6   12:invokevirtual   #372 <Method void a.b(Object, EventType)>
	//    7   15:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #445 <Method void BaseFragmentActivity.onPostCreate(Bundle)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #447 <Method void k()>
	//    5    9:return          
	}

	public void onPostCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onPostCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #450 <Method void BaseFragmentActivity.onPostCreate(Bundle, PersistableBundle)>
		k();
	//    4    6:aload_0         
	//    5    7:invokespecial   #447 <Method void k()>
	//    6   10:return          
	}

	protected void onRestoreInstanceState(Bundle bundle)
	{
		super.onRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #453 <Method void BaseFragmentActivity.onRestoreInstanceState(Bundle)>
		k = bundle.getString("user_first_name");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #455 <String "user_first_name">
	//    6   10:invokevirtual   #460 <Method String Bundle.getString(String)>
	//    7   13:putfield        #462 <Field String k>
		l = bundle.getString("user_last_name");
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc2            #464 <String "user_last_name">
	//   11   21:invokevirtual   #460 <Method String Bundle.getString(String)>
	//   12   24:putfield        #466 <Field String l>
		m = bundle.getString("user_email");
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:ldc2            #468 <String "user_email">
	//   16   32:invokevirtual   #460 <Method String Bundle.getString(String)>
	//   17   35:putfield        #470 <Field String m>
	//   18   38:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #473 <Method void BaseFragmentActivity.onResume()>
		Object obj = ((Object) (Assembler.getInstance().getAccountService().getAccountInfo()));
	//    2    4:invokestatic    #142 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #146 <Method AccountService Assembler.getAccountService()>
	//    4   10:invokevirtual   #477 <Method AccountInfo AccountService.getAccountInfo()>
	//    5   13:astore_1        
		if(obj != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          42
		{
			k = ((AccountInfo) (obj)).firstName();
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #482 <Method String AccountInfo.firstName()>
	//   11   23:putfield        #462 <Field String k>
			l = ((AccountInfo) (obj)).lastName();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #485 <Method String AccountInfo.lastName()>
	//   15   31:putfield        #466 <Field String l>
			m = ((AccountInfo) (obj)).email();
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #488 <Method String AccountInfo.email()>
	//   19   39:putfield        #470 <Field String m>
		}
		a.setText(((CharSequence) (k.substring(0, 1))));
	//   20   42:aload_0         
	//   21   43:getfield        #490 <Field CustomTextView a>
	//   22   46:aload_0         
	//   23   47:getfield        #462 <Field String k>
	//   24   50:iconst_0        
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #494 <Method String String.substring(int, int)>
	//   27   55:invokevirtual   #499 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) (b));
	//   28   58:aload_0         
	//   29   59:getfield        #501 <Field CustomTextView b>
	//   30   62:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   31   63:new             #319 <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #320 <Method void StringBuilder()>
	//   34   70:astore_2        
		stringbuilder.append(k);
	//   35   71:aload_2         
	//   36   72:aload_0         
	//   37   73:getfield        #462 <Field String k>
	//   38   76:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
		stringbuilder.append(" ");
	//   40   80:aload_2         
	//   41   81:ldc2            #503 <String " ">
	//   42   84:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		stringbuilder.append(l);
	//   44   88:aload_2         
	//   45   89:aload_0         
	//   46   90:getfield        #466 <Field String l>
	//   47   93:invokevirtual   #326 <Method StringBuilder StringBuilder.append(String)>
	//   48   96:pop             
		((CustomTextView) (obj)).setText(((CharSequence) (stringbuilder.toString())));
	//   49   97:aload_1         
	//   50   98:aload_2         
	//   51   99:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   52  102:invokevirtual   #499 <Method void CustomTextView.setText(CharSequence)>
		c.setText(((CharSequence) (m)));
	//   53  105:aload_0         
	//   54  106:getfield        #505 <Field CustomTextView c>
	//   55  109:aload_0         
	//   56  110:getfield        #470 <Field String m>
	//   57  113:invokevirtual   #499 <Method void CustomTextView.setText(CharSequence)>
		u.a(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   58  116:aload_0         
	//   59  117:getfield        #65  <Field a u>
	//   60  120:aload_0         
	//   61  121:getstatic       #369 <Field EventType EventType.AccountLoggedOutEvent>
	//   62  124:invokevirtual   #507 <Method void a.a(Object, EventType)>
	//   63  127:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putString("user_first_name", k);
	//    0    0:aload_1         
	//    1    1:ldc2            #455 <String "user_first_name">
	//    2    4:aload_0         
	//    3    5:getfield        #462 <Field String k>
	//    4    8:invokevirtual   #511 <Method void Bundle.putString(String, String)>
		bundle.putString("user_last_name", l);
	//    5   11:aload_1         
	//    6   12:ldc2            #464 <String "user_last_name">
	//    7   15:aload_0         
	//    8   16:getfield        #466 <Field String l>
	//    9   19:invokevirtual   #511 <Method void Bundle.putString(String, String)>
		bundle.putString("user_email", m);
	//   10   22:aload_1         
	//   11   23:ldc2            #468 <String "user_email">
	//   12   26:aload_0         
	//   13   27:getfield        #470 <Field String m>
	//   14   30:invokevirtual   #511 <Method void Bundle.putString(String, String)>
		super.onSaveInstanceState(bundle);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #513 <Method void BaseFragmentActivity.onSaveInstanceState(Bundle)>
	//   18   38:return          
	}

	private static final String j = com.irobot.home.util.j.r(((Class) (com/irobot/home/AccountSettingsActivity)).getSimpleName());
	CustomTextView a;
	CustomTextView b;
	CustomTextView c;
	Toolbar d;
	View e;
	Button f;
	Button g;
	Button h;
	ProgressBar i;
	private String k;
	private String l;
	private String m;
	private String n;
	private CustomerCareRestClient o;
	private String t;
	private a u;
	private boolean v;

	static 
	{
	//    0    0:ldc1            #2   <Class AccountSettingsActivity>
	//    1    2:invokevirtual   #49  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #55  <Method String j.r(String)>
	//    3    8:putstatic       #57  <Field String j>
	//*   4   11:return          
	}
}
