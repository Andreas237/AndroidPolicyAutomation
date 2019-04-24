// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, AccountSettingsActivity_, AccountLoginActivity_, PrivacySettingsActivity_, 
//			NotificationSettingsActivity_

public class AccountOverviewActivity extends BaseFragmentActivity
{

	public AccountOverviewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void e()
	{
		b(0x7f0f004e);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <Int 0x7f0f004e>
	//    2    3:invokevirtual   #29  <Method void b(int)>
		Object obj = ((Object) (Assembler.getInstance().getAccountService().getAccountInfo()));
	//    3    6:invokestatic    #35  <Method Assembler Assembler.getInstance()>
	//    4    9:invokevirtual   #39  <Method AccountService Assembler.getAccountService()>
	//    5   12:invokevirtual   #45  <Method AccountInfo AccountService.getAccountInfo()>
	//    6   15:astore          4
		String s = ((AccountInfo) (obj)).firstName();
	//    7   17:aload           4
	//    8   19:invokevirtual   #51  <Method String AccountInfo.firstName()>
	//    9   22:astore_2        
		String s1 = ((AccountInfo) (obj)).lastName();
	//   10   23:aload           4
	//   11   25:invokevirtual   #54  <Method String AccountInfo.lastName()>
	//   12   28:astore_3        
		obj = ((Object) (((AccountInfo) (obj)).email()));
	//   13   29:aload           4
	//   14   31:invokevirtual   #57  <Method String AccountInfo.email()>
	//   15   34:astore          4
		boolean flag;
		if(com.irobot.home.util.j.i(s) && com.irobot.home.util.j.i(s1) && com.irobot.home.util.j.i(((String) (obj))))
	//*  16   36:aload_2         
	//*  17   37:invokestatic    #62  <Method boolean j.i(String)>
	//*  18   40:ifeq            63
	//*  19   43:aload_3         
	//*  20   44:invokestatic    #62  <Method boolean j.i(String)>
	//*  21   47:ifeq            63
	//*  22   50:aload           4
	//*  23   52:invokestatic    #62  <Method boolean j.i(String)>
	//*  24   55:ifeq            63
			flag = true;
	//   25   58:iconst_1        
	//   26   59:istore_1        
		else
	//*  27   60:goto            65
			flag = false;
	//   28   63:iconst_0        
	//   29   64:istore_1        
		if(flag)
	//*  30   65:iload_1         
	//*  31   66:ifeq            98
		{
			a.setVisibility(0);
	//   32   69:aload_0         
	//   33   70:getfield        #64  <Field RelativeLayout a>
	//   34   73:iconst_0        
	//   35   74:invokevirtual   #69  <Method void RelativeLayout.setVisibility(int)>
			b.setVisibility(8);
	//   36   77:aload_0         
	//   37   78:getfield        #71  <Field RelativeLayout b>
	//   38   81:bipush          8
	//   39   83:invokevirtual   #69  <Method void RelativeLayout.setVisibility(int)>
		} else
	//*  40   86:aload_0         
	//*  41   87:getfield        #73  <Field CustomButton c>
	//*  42   90:bipush          8
	//*  43   92:invokevirtual   #76  <Method void CustomButton.setVisibility(int)>
	//*  44   95:goto            118
		{
			a.setVisibility(8);
	//   45   98:aload_0         
	//   46   99:getfield        #64  <Field RelativeLayout a>
	//   47  102:bipush          8
	//   48  104:invokevirtual   #69  <Method void RelativeLayout.setVisibility(int)>
			b.setVisibility(0);
	//   49  107:aload_0         
	//   50  108:getfield        #71  <Field RelativeLayout b>
	//   51  111:iconst_0        
	//   52  112:invokevirtual   #69  <Method void RelativeLayout.setVisibility(int)>
		}
		c.setVisibility(8);
	//*  53  115:goto            86
		h.setVisibility(0);
	//   54  118:aload_0         
	//   55  119:getfield        #78  <Field View h>
	//   56  122:iconst_0        
	//   57  123:invokevirtual   #81  <Method void View.setVisibility(int)>
		d.setVisibility(0);
	//   58  126:aload_0         
	//   59  127:getfield        #83  <Field CustomButton d>
	//   60  130:iconst_0        
	//   61  131:invokevirtual   #76  <Method void CustomButton.setVisibility(int)>
	//   62  134:return          
	}

	protected void f()
	{
		AccountSettingsActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method AccountSettingsActivity_$a AccountSettingsActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #93  <Method org.androidannotations.api.a.e AccountSettingsActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void g()
	{
		AccountLoginActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #98  <Method AccountLoginActivity_$a AccountLoginActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #101 <Method org.androidannotations.api.a.e AccountLoginActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void h()
	{
		PrivacySettingsActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #106 <Method PrivacySettingsActivity_$a PrivacySettingsActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #109 <Method org.androidannotations.api.a.e PrivacySettingsActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void i()
	{
		NotificationSettingsActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #114 <Method NotificationSettingsActivity_$a NotificationSettingsActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #117 <Method org.androidannotations.api.a.e NotificationSettingsActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void BaseFragmentActivity.onCreate(Bundle)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.AccountAndPrivacy);
	//    3    5:invokestatic    #126 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:getstatic       #132 <Field ViewId ViewId.AccountAndPrivacy>
	//    5   11:invokevirtual   #136 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//    6   14:return          
	}

	protected void onRestoreInstanceState(Bundle bundle)
	{
		super.onRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method void BaseFragmentActivity.onRestoreInstanceState(Bundle)>
		i = bundle.getString("user_first_name");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #141 <String "user_first_name">
	//    6    9:invokevirtual   #147 <Method String Bundle.getString(String)>
	//    7   12:putfield        #149 <Field String i>
		j = bundle.getString("user_last_name");
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #151 <String "user_last_name">
	//   11   19:invokevirtual   #147 <Method String Bundle.getString(String)>
	//   12   22:putfield        #153 <Field String j>
		k = bundle.getString("user_email");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #155 <String "user_email">
	//   16   29:invokevirtual   #147 <Method String Bundle.getString(String)>
	//   17   32:putfield        #157 <Field String k>
	//   18   35:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void BaseFragmentActivity.onResume()>
		Object obj = ((Object) (Assembler.getInstance().getAccountService().getAccountInfo()));
	//    2    4:invokestatic    #35  <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #39  <Method AccountService Assembler.getAccountService()>
	//    4   10:invokevirtual   #45  <Method AccountInfo AccountService.getAccountInfo()>
	//    5   13:astore_1        
		if(obj != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          42
		{
			i = ((AccountInfo) (obj)).firstName();
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #51  <Method String AccountInfo.firstName()>
	//   11   23:putfield        #149 <Field String i>
			j = ((AccountInfo) (obj)).lastName();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #54  <Method String AccountInfo.lastName()>
	//   15   31:putfield        #153 <Field String j>
			k = ((AccountInfo) (obj)).email();
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #57  <Method String AccountInfo.email()>
	//   19   39:putfield        #157 <Field String k>
		}
		e.setText(((CharSequence) (i.substring(0, 1))));
	//   20   42:aload_0         
	//   21   43:getfield        #162 <Field CustomTextView e>
	//   22   46:aload_0         
	//   23   47:getfield        #149 <Field String i>
	//   24   50:iconst_0        
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #168 <Method String String.substring(int, int)>
	//   27   55:invokevirtual   #174 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) (f));
	//   28   58:aload_0         
	//   29   59:getfield        #176 <Field CustomTextView f>
	//   30   62:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   31   63:new             #178 <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #179 <Method void StringBuilder()>
	//   34   70:astore_2        
		stringbuilder.append(i);
	//   35   71:aload_2         
	//   36   72:aload_0         
	//   37   73:getfield        #149 <Field String i>
	//   38   76:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
		stringbuilder.append(" ");
	//   40   80:aload_2         
	//   41   81:ldc1            #185 <String " ">
	//   42   83:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   43   86:pop             
		stringbuilder.append(j);
	//   44   87:aload_2         
	//   45   88:aload_0         
	//   46   89:getfield        #153 <Field String j>
	//   47   92:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
		((CustomTextView) (obj)).setText(((CharSequence) (stringbuilder.toString())));
	//   49   96:aload_1         
	//   50   97:aload_2         
	//   51   98:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   52  101:invokevirtual   #174 <Method void CustomTextView.setText(CharSequence)>
		g.setText(((CharSequence) (k)));
	//   53  104:aload_0         
	//   54  105:getfield        #190 <Field CustomTextView g>
	//   55  108:aload_0         
	//   56  109:getfield        #157 <Field String k>
	//   57  112:invokevirtual   #174 <Method void CustomTextView.setText(CharSequence)>
	//   58  115:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putString("user_first_name", i);
	//    0    0:aload_1         
	//    1    1:ldc1            #141 <String "user_first_name">
	//    2    3:aload_0         
	//    3    4:getfield        #149 <Field String i>
	//    4    7:invokevirtual   #195 <Method void Bundle.putString(String, String)>
		bundle.putString("user_last_name", j);
	//    5   10:aload_1         
	//    6   11:ldc1            #151 <String "user_last_name">
	//    7   13:aload_0         
	//    8   14:getfield        #153 <Field String j>
	//    9   17:invokevirtual   #195 <Method void Bundle.putString(String, String)>
		bundle.putString("user_email", k);
	//   10   20:aload_1         
	//   11   21:ldc1            #155 <String "user_email">
	//   12   23:aload_0         
	//   13   24:getfield        #157 <Field String k>
	//   14   27:invokevirtual   #195 <Method void Bundle.putString(String, String)>
		super.onSaveInstanceState(bundle);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokespecial   #197 <Method void BaseFragmentActivity.onSaveInstanceState(Bundle)>
	//   18   35:return          
	}

	RelativeLayout a;
	RelativeLayout b;
	CustomButton c;
	CustomButton d;
	CustomTextView e;
	CustomTextView f;
	CustomTextView g;
	View h;
	private String i;
	private String j;
	private String k;
}
