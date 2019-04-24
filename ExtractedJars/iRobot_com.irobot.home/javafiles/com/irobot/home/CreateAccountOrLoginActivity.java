// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.content.Intent;
import android.view.ViewTreeObserver;
import android.widget.*;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.g.d;
import com.irobot.home.g.e;
import com.irobot.home.model.rest.TermsInfo;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import java.util.Locale;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, AccountLoginActivity_, LegalTermsActivity_

public class CreateAccountOrLoginActivity extends BaseFragmentActivity
	implements e
{

	public CreateAccountOrLoginActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BaseFragmentActivity()>
		m = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #45  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener m>
	//    5    9:return          
	}

	static android.view.ViewTreeObserver.OnGlobalLayoutListener a(CreateAccountOrLoginActivity createaccountorloginactivity)
	{
		return createaccountorloginactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener m>
	//    2    4:areturn         
	}

	void e()
	{
		AnalyticsSubsystem.getInstance().trackView(ViewId.AccountOptions);
	//    0    0:invokestatic    #52  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:getstatic       #58  <Field ViewId ViewId.AccountOptions>
	//    2    6:invokevirtual   #62  <Method void AnalyticsSubsystem.trackView(ViewId)>
		m = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				boolean flag;
				if(a.c.getHeight() < a.d.getHeight() + a.c.getPaddingTop() + a.c.getPaddingBottom())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//*   2    4:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
			//*   3    7:invokevirtual   #31  <Method int ScrollView.getHeight()>
			//*   4   10:aload_0         
			//*   5   11:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//*   6   14:getfield        #35  <Field RelativeLayout com.irobot.home.CreateAccountOrLoginActivity.d>
			//*   7   17:invokevirtual   #38  <Method int RelativeLayout.getHeight()>
			//*   8   20:aload_0         
			//*   9   21:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//*  10   24:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
			//*  11   27:invokevirtual   #41  <Method int ScrollView.getPaddingTop()>
			//*  12   30:iadd            
			//*  13   31:aload_0         
			//*  14   32:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//*  15   35:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
			//*  16   38:invokevirtual   #44  <Method int ScrollView.getPaddingBottom()>
			//*  17   41:iadd            
			//*  18   42:icmpge          50
					flag = true;
			//   19   45:iconst_1        
			//   20   46:istore_1        
				else
			//*  21   47:goto            52
					flag = false;
			//   22   50:iconst_0        
			//   23   51:istore_1        
				android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a.e.getLayoutParams();
			//   24   52:aload_0         
			//   25   53:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//   26   56:getfield        #47  <Field LinearLayout com.irobot.home.CreateAccountOrLoginActivity.e>
			//   27   59:invokevirtual   #53  <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
			//   28   62:checkcast       #55  <Class android.widget.RelativeLayout$LayoutParams>
			//   29   65:astore_2        
				if(flag)
			//*  30   66:iload_1         
			//*  31   67:ifeq            86
				{
					layoutparams.removeRule(12);
			//   32   70:aload_2         
			//   33   71:bipush          12
			//   34   73:invokevirtual   #59  <Method void android.widget.RelativeLayout$LayoutParams.removeRule(int)>
					layoutparams.addRule(3, 0x7f090124);
			//   35   76:aload_2         
			//   36   77:iconst_3        
			//   37   78:ldc1            #60  <Int 0x7f090124>
			//   38   80:invokevirtual   #64  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
				} else
			//*  39   83:goto            97
				{
					layoutparams.removeRule(3);
			//   40   86:aload_2         
			//   41   87:iconst_3        
			//   42   88:invokevirtual   #59  <Method void android.widget.RelativeLayout$LayoutParams.removeRule(int)>
					layoutparams.addRule(12);
			//   43   91:aload_2         
			//   44   92:bipush          12
			//   45   94:invokevirtual   #66  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
				}
				a.e.getViewTreeObserver().removeOnGlobalLayoutListener(CreateAccountOrLoginActivity.a(a));
			//   46   97:aload_0         
			//   47   98:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//   48  101:getfield        #47  <Field LinearLayout com.irobot.home.CreateAccountOrLoginActivity.e>
			//   49  104:invokevirtual   #70  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
			//   50  107:aload_0         
			//   51  108:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//   52  111:invokestatic    #73  <Method android.view.ViewTreeObserver$OnGlobalLayoutListener CreateAccountOrLoginActivity.a(CreateAccountOrLoginActivity)>
			//   53  114:invokevirtual   #79  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				a.e.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
			//   54  117:aload_0         
			//   55  118:getfield        #17  <Field CreateAccountOrLoginActivity a>
			//   56  121:getfield        #47  <Field LinearLayout com.irobot.home.CreateAccountOrLoginActivity.e>
			//   57  124:aload_2         
			//   58  125:invokevirtual   #83  <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   59  128:return          
			}

			final CreateAccountOrLoginActivity a;

			
			{
				a = CreateAccountOrLoginActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CreateAccountOrLoginActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    3    9:aload_0         
	//    4   10:new             #8   <Class CreateAccountOrLoginActivity$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #65  <Method void CreateAccountOrLoginActivity$1(CreateAccountOrLoginActivity)>
	//    8   18:putfield        #45  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener m>
		e.getViewTreeObserver().addOnGlobalLayoutListener(m);
	//    9   21:aload_0         
	//   10   22:getfield        #67  <Field LinearLayout e>
	//   11   25:invokevirtual   #73  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   12   28:aload_0         
	//   13   29:getfield        #45  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener m>
	//   14   32:invokevirtual   #79  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		l = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:invokestatic    #84  <Method CustomerCareRestClient j.i(android.content.Context)>
	//   18   40:putfield        #86  <Field CustomerCareRestClient l>
		f();
	//   19   43:aload_0         
	//   20   44:invokevirtual   #88  <Method void f()>
	//   21   47:return          
	}

	public void f()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #96  <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			k = l.getTermsInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), "R980020");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field CustomerCareRestClient l>
	//    5    9:aload_1         
	//    6   10:invokestatic    #99  <Method String j.a(Locale)>
	//    7   13:aload_0         
	//    8   14:invokestatic    #102 <Method String j.h(android.content.Context)>
	//    9   17:ldc1            #104 <String "R980020">
	//   10   19:invokeinterface #110 <Method TermsInfo CustomerCareRestClient.getTermsInfo(String, String, String)>
	//   11   24:putfield        #112 <Field TermsInfo k>
			if(k != null && com.irobot.home.util.j.i(k.version) && !k.version.equals(((Object) (f.e()))))
	//*  12   27:aload_0         
	//*  13   28:getfield        #112 <Field TermsInfo k>
	//*  14   31:ifnull          117
	//*  15   34:aload_0         
	//*  16   35:getfield        #112 <Field TermsInfo k>
	//*  17   38:getfield        #117 <Field String TermsInfo.version>
	//*  18   41:invokestatic    #120 <Method boolean j.i(String)>
	//*  19   44:ifeq            117
	//*  20   47:aload_0         
	//*  21   48:getfield        #112 <Field TermsInfo k>
	//*  22   51:getfield        #117 <Field String TermsInfo.version>
	//*  23   54:aload_0         
	//*  24   55:getfield        #122 <Field IRobotApplication f>
	//*  25   58:invokevirtual   #127 <Method String com.irobot.home.IRobotApplication.e()>
	//*  26   61:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  27   64:ifne            117
			{
				f.a(false);
	//   28   67:aload_0         
	//   29   68:getfield        #122 <Field IRobotApplication f>
	//   30   71:iconst_0        
	//   31   72:invokevirtual   #136 <Method void IRobotApplication.a(boolean)>
				g();
	//   32   75:aload_0         
	//   33   76:invokevirtual   #138 <Method void g()>
				return;
	//   34   79:return          
			}
		}
		catch(Exception exception)
	//*  35   80:astore_1        
		{
			String s = j;
	//   36   81:getstatic       #140 <Field String j>
	//   37   84:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   38   85:new             #142 <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #143 <Method void StringBuilder()>
	//   41   92:astore_3        
			stringbuilder.append("Cannot retrieve TermsInfo: ");
	//   42   93:aload_3         
	//   43   94:ldc1            #145 <String "Cannot retrieve TermsInfo: ">
	//   44   96:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   45   99:pop             
			stringbuilder.append(exception.getMessage());
	//   46  100:aload_3         
	//   47  101:aload_1         
	//   48  102:invokevirtual   #152 <Method String Exception.getMessage()>
	//   49  105:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:pop             
			o.e(s, stringbuilder.toString());
	//   51  109:aload_2         
	//   52  110:aload_3         
	//   53  111:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   54  114:invokestatic    #160 <Method void o.e(String, String)>
		}
	//   55  117:return          
	}

	public void g()
	{
		android.app.FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method FragmentManager getFragmentManager()>
	//    2    4:invokevirtual   #170 <Method android.app.FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_1        
		n = com.irobot.home.g.d.a(((e) (this)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #175 <Method d d.a(e)>
	//    7   13:putfield        #177 <Field d n>
		n.setCancelable(false);
	//    8   16:aload_0         
	//    9   17:getfield        #177 <Field d n>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #180 <Method void d.setCancelable(boolean)>
		n.show(fragmenttransaction, "legalTermsDialog");
	//   12   24:aload_0         
	//   13   25:getfield        #177 <Field d n>
	//   14   28:aload_1         
	//   15   29:ldc1            #182 <String "legalTermsDialog">
	//   16   31:invokevirtual   #186 <Method int d.show(android.app.FragmentTransaction, String)>
	//   17   34:pop             
	//   18   35:return          
	}

	public void h()
	{
		AccountLoginActivity_.a(((android.content.Context) (this))).a(false).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #191 <Method AccountLoginActivity_$a AccountLoginActivity_.a(android.content.Context)>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #196 <Method AccountLoginActivity_$a AccountLoginActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #199 <Method org.androidannotations.api.a.e AccountLoginActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	public void i()
	{
		AccountLoginActivity_.a(((android.content.Context) (this))).a(true).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #191 <Method AccountLoginActivity_$a AccountLoginActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #196 <Method AccountLoginActivity_$a AccountLoginActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #199 <Method org.androidannotations.api.a.e AccountLoginActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		if(i1 == 2 && n != null && n.isVisible() && j1 == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          34
	//*   3    5:aload_0         
	//*   4    6:getfield        #177 <Field d n>
	//*   5    9:ifnull          34
	//*   6   12:aload_0         
	//*   7   13:getfield        #177 <Field d n>
	//*   8   16:invokevirtual   #205 <Method boolean d.isVisible()>
	//*   9   19:ifeq            34
	//*  10   22:iload_2         
	//*  11   23:iconst_m1       
	//*  12   24:icmpne          34
			n.dismiss();
	//   13   27:aload_0         
	//   14   28:getfield        #177 <Field d n>
	//   15   31:invokevirtual   #208 <Method void d.dismiss()>
		super.onActivityResult(i1, j1, intent);
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:iload_2         
	//   19   37:aload_3         
	//   20   38:invokespecial   #210 <Method void BaseFragmentActivity.onActivityResult(int, int, Intent)>
	//   21   41:return          
	}

	public void r()
	{
		LegalTermsActivity_.a(((android.content.Context) (this))).a(true).a(2);
	//    0    0:aload_0         
	//    1    1:invokestatic    #216 <Method LegalTermsActivity_$a LegalTermsActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #221 <Method LegalTermsActivity_$a LegalTermsActivity_$a.a(boolean)>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #224 <Method org.androidannotations.api.a.e LegalTermsActivity_$a.a(int)>
	//    6   12:pop             
	//    7   13:return          
	}

	private static final String j = "CreateAccountOrLoginActivity";
	k a;
	CustomTextView b;
	ScrollView c;
	RelativeLayout d;
	LinearLayout e;
	IRobotApplication f;
	boolean g;
	CustomButton h;
	CustomButton i;
	private TermsInfo k;
	private CustomerCareRestClient l;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener m;
	private d n;

	static 
	{
	//    0    0:return          
	}
}
