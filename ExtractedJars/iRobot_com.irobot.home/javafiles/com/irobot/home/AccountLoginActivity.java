// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.ProgressBar;
import com.gigya.socialize.android.GSPluginFragment;
import com.irobot.core.*;
import com.irobot.home.i.a;
import com.irobot.home.util.g;
import com.irobot.home.util.j;
import com.irobot.home.util.k;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class AccountLoginActivity extends BaseFragmentActivity
{

	public AccountLoginActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #33  <Method boolean isFinishing()>
	//*   2    4:ifne            36
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #36  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			ProgressBar progressbar = d;
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field ProgressBar d>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            31
				byte0 = 4;
	//   15   29:iconst_4        
	//   16   30:istore_2        
			progressbar.setVisibility(((int) (byte0)));
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #44  <Method void ProgressBar.setVisibility(int)>
		}
	//   20   36:return          
	}

	protected void e()
	{
		getWindow().setFlags(8192, 8192);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method Window getWindow()>
	//    2    4:sipush          8192
	//    3    7:sipush          8192
	//    4   10:invokevirtual   #54  <Method void Window.setFlags(int, int)>
		b(0x7f0f0057);
	//    5   13:aload_0         
	//    6   14:ldc1            #55  <Int 0x7f0f0057>
	//    7   16:invokevirtual   #57  <Method void b(int)>
		AnalyticsSubsystem analyticssubsystem;
		ViewId viewid;
		if(c)
	//*   8   19:aload_0         
	//*   9   20:getfield        #59  <Field boolean c>
	//*  10   23:ifeq            42
		{
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   11   26:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   29:astore_1        
			viewid = ViewId.CreateAccount;
	//   13   30:getstatic       #71  <Field ViewId ViewId.CreateAccount>
	//   14   33:astore_2        
		} else
	//*  15   34:aload_1         
	//*  16   35:aload_2         
	//*  17   36:invokevirtual   #75  <Method void AnalyticsSubsystem.trackView(ViewId)>
	//*  18   39:goto            53
		{
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   19   42:invokestatic    #65  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   20   45:astore_1        
			viewid = ViewId.Login;
	//   21   46:getstatic       #78  <Field ViewId ViewId.Login>
	//   22   49:astore_2        
		}
		analyticssubsystem.trackView(viewid);
	//*  23   50:goto            34
		if(Assembler.getInstance().getAccountService().isAccountProviderInitialized())
	//*  24   53:invokestatic    #83  <Method Assembler Assembler.getInstance()>
	//*  25   56:invokevirtual   #87  <Method AccountService Assembler.getAccountService()>
	//*  26   59:invokevirtual   #92  <Method boolean AccountService.isAccountProviderInitialized()>
	//*  27   62:ifeq            69
			f();
	//   28   65:aload_0         
	//   29   66:invokevirtual   #94  <Method void f()>
	//   30   69:return          
	}

	protected void f()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field GSPluginFragment f>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		String s1;
		if(c)
	//*   4    8:aload_0         
	//*   5    9:getfield        #59  <Field boolean c>
	//*   6   12:ifeq            21
			s1 = "gigya-register-screen";
	//    7   15:ldc1            #98  <String "gigya-register-screen">
	//    8   17:astore_2        
		else
	//*   9   18:goto            24
			s1 = "gigya-login-screen";
	//   10   21:ldc1            #100 <String "gigya-login-screen">
	//   11   23:astore_2        
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//   12   24:invokestatic    #83  <Method Assembler Assembler.getInstance()>
	//   13   27:invokevirtual   #87  <Method AccountService Assembler.getAccountService()>
	//   14   30:astore_3        
		String s = "iRobot-R-Android-RegistrationLogin-noCountry";
	//   15   31:ldc1            #102 <String "iRobot-R-Android-RegistrationLogin-noCountry">
	//   16   33:astore_1        
		if(accountservice.requiresMultiAccountSupport())
	//*  17   34:aload_3         
	//*  18   35:invokevirtual   #105 <Method boolean AccountService.requiresMultiAccountSupport()>
	//*  19   38:ifeq            60
		{
			if(accountservice.requiresOptInUnchecked())
	//*  20   41:aload_3         
	//*  21   42:invokevirtual   #108 <Method boolean AccountService.requiresOptInUnchecked()>
	//*  22   45:ifeq            54
				s = "iRobot-R-MultiAccount-Android-RegistrationLogin-noCountry-OI";
	//   23   48:ldc1            #110 <String "iRobot-R-MultiAccount-Android-RegistrationLogin-noCountry-OI">
	//   24   50:astore_1        
			else
	//*  25   51:goto            70
				s = "iRobot-R-MultiAccount-Android-RegistrationLogin-noCountry";
	//   26   54:ldc1            #112 <String "iRobot-R-MultiAccount-Android-RegistrationLogin-noCountry">
	//   27   56:astore_1        
		} else
	//*  28   57:goto            51
		if(accountservice.requiresOptInUnchecked())
	//*  29   60:aload_3         
	//*  30   61:invokevirtual   #108 <Method boolean AccountService.requiresOptInUnchecked()>
	//*  31   64:ifeq            70
			s = "iRobot-R-Android-RegistrationLogin-noCountry-OI";
	//   32   67:ldc1            #114 <String "iRobot-R-Android-RegistrationLogin-noCountry-OI">
	//   33   69:astore_1        
		f = com.irobot.home.util.g.a(((android.content.Context) (this)), s, s1, new com.irobot.home.util.g.a() {

			public void a(int i)
			{
			//    0    0:return          
			}

			public void b(int i)
			{
				a.a(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccountLoginActivity a>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #25  <Method void com.irobot.home.AccountLoginActivity.a(boolean)>
			//    4    8:return          
			}

			final AccountLoginActivity a;

			
			{
				a = AccountLoginActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountLoginActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:new             #6   <Class AccountLoginActivity$1>
	//   39   77:dup             
	//   40   78:aload_0         
	//   41   79:invokespecial   #117 <Method void AccountLoginActivity$1(AccountLoginActivity)>
	//   42   82:invokestatic    #122 <Method GSPluginFragment g.a(android.content.Context, String, String, com.irobot.home.util.g$a)>
	//   43   85:putfield        #96  <Field GSPluginFragment f>
		getSupportFragmentManager().beginTransaction().add(0x7f0901a0, ((android.support.v4.app.Fragment) (f))).commit();
	//   44   88:aload_0         
	//   45   89:invokevirtual   #126 <Method FragmentManager getSupportFragmentManager()>
	//   46   92:invokevirtual   #132 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   47   95:ldc1            #133 <Int 0x7f0901a0>
	//   48   97:aload_0         
	//   49   98:getfield        #96  <Field GSPluginFragment f>
	//   50  101:invokevirtual   #139 <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   51  104:invokevirtual   #143 <Method int FragmentTransaction.commit()>
	//   52  107:pop             
		getSupportFragmentManager().executePendingTransactions();
	//   53  108:aload_0         
	//   54  109:invokevirtual   #126 <Method FragmentManager getSupportFragmentManager()>
	//   55  112:invokevirtual   #146 <Method boolean FragmentManager.executePendingTransactions()>
	//   56  115:pop             
	//   57  116:return          
	}

	protected void g()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #33  <Method boolean isFinishing()>
	//*   2    4:ifne            49
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #36  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setCancelable(false).setMessage(0x7f0f0430).setPositiveButton(0x7f0f0761, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field AccountLoginActivity a>
				//    2    4:invokevirtual   #25  <Method void AccountLoginActivity.h()>
				//    3    7:return          
				}

				final AccountLoginActivity a;

			
			{
				a = AccountLoginActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountLoginActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #149 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #152 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #156 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   13   27:ldc1            #157 <Int 0x7f0f0430>
	//   14   29:invokevirtual   #161 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   15   32:ldc1            #162 <Int 0x7f0f0761>
	//   16   34:new             #8   <Class AccountLoginActivity$2>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #163 <Method void AccountLoginActivity$2(AccountLoginActivity)>
	//   20   42:invokevirtual   #167 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   21   45:invokevirtual   #171 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   22   48:pop             
		}
	//   23   49:return          
	}

	protected void h()
	{
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//    0    0:invokestatic    #83  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #87  <Method AccountService Assembler.getAccountService()>
	//    2    6:astore_1        
		if(!accountservice.isAccountProviderInitialized())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #92  <Method boolean AccountService.isAccountProviderInitialized()>
	//*   5   11:ifne            19
			a(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #174 <Method void a(boolean)>
		accountservice.initializeAccountSession();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #177 <Method void AccountService.initializeAccountSession()>
	//   11   23:return          
	}

	public void onAccountErrorEvent(AccountErrorEvent accounterrorevent)
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method void g()>
		a(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #174 <Method void a(boolean)>
	//    5    9:return          
	}

	public void onAccountInfoUpdatedEvent(AccountInfoUpdatedEvent accountinfoupdatedevent)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #174 <Method void a(boolean)>
	//    3    5:return          
	}

	public void onAccountLoggedInEvent(AccountLoggedInEvent accountloggedinevent)
	{
		j.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field k b>
	//    2    4:invokestatic    #194 <Method void j.a(k)>
		j.a(((android.app.Activity) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #197 <Method void j.a(android.app.Activity)>
		a.p();
	//    5   11:aload_0         
	//    6   12:getfield        #199 <Field IRobotApplication a>
	//    7   15:invokevirtual   #204 <Method void IRobotApplication.p()>
		a(false);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #174 <Method void a(boolean)>
	//   11   23:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method void f()>
		a(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #174 <Method void a(boolean)>
	//    5    9:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #209 <Method void BaseFragmentActivity.onPause()>
		a a1 = (a)Assembler.getInstance().getDomainEventBus();
	//    2    4:invokestatic    #83  <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #213 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    4   10:checkcast       #215 <Class a>
	//    5   13:astore_1        
		a1.b(((Object) (this)), EventType.AccountLoggedInEvent);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getstatic       #221 <Field EventType EventType.AccountLoggedInEvent>
	//    9   19:invokevirtual   #224 <Method void a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getstatic       #227 <Field EventType EventType.AccountLoggedOutEvent>
	//   13   27:invokevirtual   #224 <Method void a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.AccountErrorEvent);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getstatic       #230 <Field EventType EventType.AccountErrorEvent>
	//   17   35:invokevirtual   #224 <Method void a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.AccountInfoUpdatedEvent);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getstatic       #233 <Field EventType EventType.AccountInfoUpdatedEvent>
	//   21   43:invokevirtual   #224 <Method void a.b(Object, EventType)>
	//   22   46:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #236 <Method void BaseFragmentActivity.onResume()>
		a a1 = (a)Assembler.getInstance().getDomainEventBus();
	//    2    4:invokestatic    #83  <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #213 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    4   10:checkcast       #215 <Class a>
	//    5   13:astore_1        
		a1.a(((Object) (this)), EventType.AccountLoggedInEvent);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getstatic       #221 <Field EventType EventType.AccountLoggedInEvent>
	//    9   19:invokevirtual   #238 <Method void a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AccountLoggedOutEvent);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getstatic       #227 <Field EventType EventType.AccountLoggedOutEvent>
	//   13   27:invokevirtual   #238 <Method void a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AccountErrorEvent);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getstatic       #230 <Field EventType EventType.AccountErrorEvent>
	//   17   35:invokevirtual   #238 <Method void a.a(Object, EventType)>
		a1.a(((Object) (this)), EventType.AccountInfoUpdatedEvent);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getstatic       #233 <Field EventType EventType.AccountInfoUpdatedEvent>
	//   21   43:invokevirtual   #238 <Method void a.a(Object, EventType)>
		h();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #240 <Method void h()>
	//   24   50:return          
	}

	private static final String e = "AccountLoginActivity";
	IRobotApplication a;
	k b;
	boolean c;
	ProgressBar d;
	private GSPluginFragment f;

	static 
	{
	//    0    0:return          
	}
}
