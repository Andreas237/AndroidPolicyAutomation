// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.irobot.core.*;
import com.irobot.home.fragments.ai;
import com.irobot.home.fragments.aj;
import com.irobot.home.i.a;
import com.irobot.home.model.rest.TermsInfo;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import org.androidannotations.api.b.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, CreateAccountOrLoginActivity_

public class LegalTermsActivity extends BaseFragmentActivity
	implements com.irobot.home.fragments.ai.a
{

	public LegalTermsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseFragmentActivity()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean c>
	//    5    9:return          
	}

	private void a(String s, boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "DEVEL">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #32  <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    7:invokeinterface #38  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   12:astore_3        
		editor.putBoolean(s, flag);
	//    6   13:aload_3         
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:invokeinterface #44  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   10   21:pop             
		if(f != null && j.i(f.version))
	//*  11   22:aload_0         
	//*  12   23:getfield        #46  <Field TermsInfo f>
	//*  13   26:ifnull          59
	//*  14   29:aload_0         
	//*  15   30:getfield        #46  <Field TermsInfo f>
	//*  16   33:getfield        #52  <Field String TermsInfo.version>
	//*  17   36:invokestatic    #58  <Method boolean j.i(String)>
	//*  18   39:ifeq            59
			a.a(f.version);
	//   19   42:aload_0         
	//   20   43:getfield        #60  <Field IRobotApplication a>
	//   21   46:aload_0         
	//   22   47:getfield        #46  <Field TermsInfo f>
	//   23   50:getfield        #52  <Field String TermsInfo.version>
	//   24   53:invokevirtual   #65  <Method void com.irobot.home.IRobotApplication.a(String)>
		else
	//*  25   56:goto            66
			o.e("LegalTermsActivity", "Terms version or info is invalid");
	//   26   59:ldc1            #67  <String "LegalTermsActivity">
	//   27   61:ldc1            #69  <String "Terms version or info is invalid">
	//   28   63:invokestatic    #74  <Method void o.e(String, String)>
		editor.apply();
	//   29   66:aload_3         
	//   30   67:invokeinterface #77  <Method void android.content.SharedPreferences$Editor.apply()>
	//   31   72:return          
	}

	private void h()
	{
		FragmentManager fragmentmanager = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #88  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    5    9:astore_2        
		d = ((ai) (new aj()));
	//    6   10:aload_0         
	//    7   11:new             #90  <Class aj>
	//    8   14:dup             
	//    9   15:invokespecial   #91  <Method void aj()>
	//   10   18:putfield        #93  <Field ai d>
		fragmenttransaction.add(0x7f090215, ((android.app.Fragment) (d)));
	//   11   21:aload_2         
	//   12   22:ldc1            #94  <Int 0x7f090215>
	//   13   24:aload_0         
	//   14   25:getfield        #93  <Field ai d>
	//   15   28:invokevirtual   #100 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   16   31:pop             
		fragmenttransaction.commit();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #104 <Method int FragmentTransaction.commit()>
	//   19   36:pop             
		fragmentmanager.executePendingTransactions();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #108 <Method boolean FragmentManager.executePendingTransactions()>
	//   22   41:pop             
	//   23   42:return          
	}

	public void a(boolean flag, TermsInfo termsinfo)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		byte byte0;
		if(flag)
	//*   2    3:iload_1         
	//*   3    4:ifeq            12
			byte0 = -1;
	//    4    7:iconst_m1       
	//    5    8:istore_3        
		else
	//*   6    9:goto            14
			byte0 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		setResult(((int) (byte0)));
	//    9   14:aload_0         
	//   10   15:iload_3         
	//   11   16:invokevirtual   #113 <Method void setResult(int)>
		if(!flag)
	//*  12   19:iload_1         
	//*  13   20:ifne            24
			return;
	//   14   23:return          
		f = termsinfo;
	//   15   24:aload_0         
	//   16   25:aload_2         
	//   17   26:putfield        #46  <Field TermsInfo f>
		termsinfo = ((TermsInfo) (Assembler.getInstance().getAccountService()));
	//   18   29:invokestatic    #119 <Method Assembler Assembler.getInstance()>
	//   19   32:invokevirtual   #123 <Method AccountService Assembler.getAccountService()>
	//   20   35:astore_2        
		if(c)
	//*  21   36:aload_0         
	//*  22   37:getfield        #24  <Field boolean c>
	//*  23   40:ifeq            67
			if(((AccountService) (termsinfo)).isLoggedIn())
	//*  24   43:aload_2         
	//*  25   44:invokevirtual   #128 <Method boolean AccountService.isLoggedIn()>
	//*  26   47:ifeq            55
			{
				g();
	//   27   50:aload_0         
	//   28   51:invokevirtual   #131 <Method void g()>
				return;
	//   29   54:return          
			} else
			{
				a("eula_accepted_version_1", true);
	//   30   55:aload_0         
	//   31   56:ldc1            #133 <String "eula_accepted_version_1">
	//   32   58:iconst_1        
	//   33   59:invokespecial   #135 <Method void a(String, boolean)>
				finish();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #138 <Method void finish()>
				return;
	//   36   66:return          
			}
		termsinfo = ((TermsInfo) (j.j()));
	//   37   67:invokestatic    #142 <Method com.irobot.home.model.a j.j()>
	//   38   70:astore_2        
		a("eula_accepted_version_1", true);
	//   39   71:aload_0         
	//   40   72:ldc1            #133 <String "eula_accepted_version_1">
	//   41   74:iconst_1        
	//   42   75:invokespecial   #135 <Method void a(String, boolean)>
		CreateAccountOrLoginActivity_.a a1 = com.irobot.home.CreateAccountOrLoginActivity_.a(((android.content.Context) (this)));
	//   43   78:aload_0         
	//   44   79:invokestatic    #147 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_.a(android.content.Context)>
	//   45   82:astore          5
		flag = flag1;
	//   46   84:iload           4
	//   47   86:istore_1        
		if(termsinfo != null)
	//*  48   87:aload_2         
	//*  49   88:ifnull          93
			flag = true;
	//   50   91:iconst_1        
	//   51   92:istore_1        
		a1.a(flag).a();
	//   52   93:aload           5
	//   53   95:iload_1         
	//   54   96:invokevirtual   #152 <Method CreateAccountOrLoginActivity_$a com.irobot.home.CreateAccountOrLoginActivity_$a.a(boolean)>
	//   55   99:invokevirtual   #155 <Method org.androidannotations.api.a.e com.irobot.home.CreateAccountOrLoginActivity_$a.a()>
	//   56  102:pop             
	//   57  103:return          
	}

	void e()
	{
		b(0x7f0f08b2);
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <Int 0x7f0f08b2>
	//    2    3:invokevirtual   #158 <Method void b(int)>
	//    3    6:return          
	}

	protected void f()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0256).setMessage(0x7f0f0255).setNegativeButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #160 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #163 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #164 <Int 0x7f0f0256>
	//    5   10:invokevirtual   #168 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   13:ldc1            #169 <Int 0x7f0f0255>
	//    7   15:invokevirtual   #172 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   18:ldc1            #173 <Int 0x7f0f05bb>
	//    9   20:aconst_null     
	//   10   21:invokevirtual   #177 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   24:invokevirtual   #181 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   27:pop             
	//   13   28:return          
	}

	protected void g()
	{
		Assembler.getInstance().getAccountService().consentLegalTerms();
	//    0    0:invokestatic    #119 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #123 <Method AccountService Assembler.getAccountService()>
	//    2    6:invokevirtual   #184 <Method void AccountService.consentLegalTerms()>
	//    3    9:return          
	}

	public void onAccountConsentDateUpdateFailedEvent(AccountConsentDateUpdateFailedEvent accountconsentdateupdatefailedevent)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #189 <Method void f()>
	//    2    4:return          
	}

	public void onAccountConsentDateUpdatedEvent(AccountConsentDateUpdatedEvent accountconsentdateupdatedevent)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field a e>
	//*   2    4:ifnull          18
			e.b(((Object) (this)), EventType.AccountConsentDateUpdatedEvent);
	//    3    7:aload_0         
	//    4    8:getfield        #194 <Field a e>
	//    5   11:aload_0         
	//    6   12:getstatic       #200 <Field EventType EventType.AccountConsentDateUpdatedEvent>
	//    7   15:invokevirtual   #205 <Method void a.b(Object, EventType)>
		a("eula_accepted_version_1", true);
	//    8   18:aload_0         
	//    9   19:ldc1            #133 <String "eula_accepted_version_1">
	//   10   21:iconst_1        
	//   11   22:invokespecial   #135 <Method void a(String, boolean)>
		finish();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #138 <Method void finish()>
	//   14   29:return          
	}

	public void onBackPressed()
	{
		if(((Boolean)b.j().a()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field k b>
	//*   2    4:invokevirtual   #213 <Method d k.j()>
	//*   3    7:invokevirtual   #218 <Method Object d.a()>
	//*   4   10:checkcast       #220 <Class Boolean>
	//*   5   13:invokevirtual   #223 <Method boolean Boolean.booleanValue()>
	//*   6   16:ifeq            27
		{
			setResult(0);
	//    7   19:aload_0         
	//    8   20:iconst_0        
	//    9   21:invokevirtual   #113 <Method void setResult(int)>
		} else
	//*  10   24:goto            44
		{
			a.a(true);
	//   11   27:aload_0         
	//   12   28:getfield        #60  <Field IRobotApplication a>
	//   13   31:iconst_1        
	//   14   32:invokevirtual   #226 <Method void com.irobot.home.IRobotApplication.a(boolean)>
			a.a("2.0");
	//   15   35:aload_0         
	//   16   36:getfield        #60  <Field IRobotApplication a>
	//   17   39:ldc1            #228 <String "2.0">
	//   18   41:invokevirtual   #65  <Method void com.irobot.home.IRobotApplication.a(String)>
		}
		super.onBackPressed();
	//   19   44:aload_0         
	//   20   45:invokespecial   #230 <Method void BaseFragmentActivity.onBackPressed()>
	//   21   48:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #234 <Method void BaseFragmentActivity.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       16
			h();
	//    5    9:aload_0         
	//    6   10:invokespecial   #236 <Method void h()>
		else
	//*   7   13:goto            32
			d = (ai)getFragmentManager().findFragmentById(0x7f090215);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #82  <Method FragmentManager getFragmentManager()>
	//   11   21:ldc1            #94  <Int 0x7f090215>
	//   12   23:invokevirtual   #240 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   13   26:checkcast       #242 <Class ai>
	//   14   29:putfield        #93  <Field ai d>
		d.a(((com.irobot.home.fragments.ai.a) (this)));
	//   15   32:aload_0         
	//   16   33:getfield        #93  <Field ai d>
	//   17   36:aload_0         
	//   18   37:invokevirtual   #245 <Method void ai.a(com.irobot.home.fragments.ai$a)>
	//   19   40:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void BaseFragmentActivity.onPause()>
		if(e != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #194 <Field a e>
	//*   4    8:ifnull          19
			e.a(((Object) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #194 <Field a e>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #251 <Method void a.a(Object)>
	//    9   19:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method void BaseFragmentActivity.onResume()>
		if(e == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #194 <Field a e>
	//*   4    8:ifnonnull       24
			e = (a)Assembler.getInstance().getDomainEventBus();
	//    5   11:aload_0         
	//    6   12:invokestatic    #119 <Method Assembler Assembler.getInstance()>
	//    7   15:invokevirtual   #258 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    8   18:checkcast       #202 <Class a>
	//    9   21:putfield        #194 <Field a e>
		e.a(((Object) (this)), EventType.AccountConsentDateUpdatedEvent);
	//   10   24:aload_0         
	//   11   25:getfield        #194 <Field a e>
	//   12   28:aload_0         
	//   13   29:getstatic       #200 <Field EventType EventType.AccountConsentDateUpdatedEvent>
	//   14   32:invokevirtual   #260 <Method void a.a(Object, EventType)>
		e.a(((Object) (this)), EventType.AccountConsentDateUpdateFailedEvent);
	//   15   35:aload_0         
	//   16   36:getfield        #194 <Field a e>
	//   17   39:aload_0         
	//   18   40:getstatic       #263 <Field EventType EventType.AccountConsentDateUpdateFailedEvent>
	//   19   43:invokevirtual   #260 <Method void a.a(Object, EventType)>
	//   20   46:return          
	}

	IRobotApplication a;
	k b;
	boolean c;
	private ai d;
	private a e;
	private TermsInfo f;
}
