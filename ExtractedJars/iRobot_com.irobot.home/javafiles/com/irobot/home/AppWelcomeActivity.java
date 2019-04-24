// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.*;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomTextView;
import java.util.Locale;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, CountryPickerActivity_, LanguagePickerActivity_, LegalTermsActivity_, 
//			IRobotApplication

public class AppWelcomeActivity extends BaseFragmentActivity
{

	public AppWelcomeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BaseFragmentActivity()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean b>
	//    5    9:return          
	}

	private void i()
	{
		if(!n.equals("country_not_set"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field String n>
	//*   2    4:ldc1            #39  <String "country_not_set">
	//*   3    6:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   4    9:ifne            90
		{
			j.setEnabled(true);
	//    5   12:aload_0         
	//    6   13:getfield        #47  <Field Button j>
	//    7   16:iconst_1        
	//    8   17:invokevirtual   #53  <Method void Button.setEnabled(boolean)>
			if(b)
	//*   9   20:aload_0         
	//*  10   21:getfield        #34  <Field boolean b>
	//*  11   24:ifeq            63
			{
				d.setText(0x7f0f04ca);
	//   12   27:aload_0         
	//   13   28:getfield        #55  <Field CustomTextView d>
	//   14   31:ldc1            #56  <Int 0x7f0f04ca>
	//   15   33:invokevirtual   #62  <Method void CustomTextView.setText(int)>
				e.setVisibility(8);
	//   16   36:aload_0         
	//   17   37:getfield        #64  <Field CustomTextView e>
	//   18   40:bipush          8
	//   19   42:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
				f.setVisibility(0);
	//   20   45:aload_0         
	//   21   46:getfield        #69  <Field CustomTextView f>
	//   22   49:iconst_0        
	//   23   50:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
				f.setText(0x7f0f04c9);
	//   24   53:aload_0         
	//   25   54:getfield        #69  <Field CustomTextView f>
	//   26   57:ldc1            #70  <Int 0x7f0f04c9>
	//   27   59:invokevirtual   #62  <Method void CustomTextView.setText(int)>
				return;
	//   28   62:return          
			}
			d.setText(0x7f0f0965);
	//   29   63:aload_0         
	//   30   64:getfield        #55  <Field CustomTextView d>
	//   31   67:ldc1            #71  <Int 0x7f0f0965>
	//   32   69:invokevirtual   #62  <Method void CustomTextView.setText(int)>
			e.setText(0x7f0f07f0);
	//   33   72:aload_0         
	//   34   73:getfield        #64  <Field CustomTextView e>
	//   35   76:ldc1            #72  <Int 0x7f0f07f0>
	//   36   78:invokevirtual   #62  <Method void CustomTextView.setText(int)>
			f.setVisibility(8);
	//   37   81:aload_0         
	//   38   82:getfield        #69  <Field CustomTextView f>
	//   39   85:bipush          8
	//   40   87:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
		}
	//   41   90:return          
	}

	void a(int i1, Intent intent)
	{
		if(i1 == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          70
		{
			intent = ((Intent) (new Locale(Locale.getDefault().getLanguage(), intent.getData().toString())));
	//    3    5:new             #75  <Class Locale>
	//    4    8:dup             
	//    5    9:invokestatic    #79  <Method Locale Locale.getDefault()>
	//    6   12:invokevirtual   #83  <Method String Locale.getLanguage()>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #89  <Method Uri Intent.getData()>
	//    9   19:invokevirtual   #94  <Method String Uri.toString()>
	//   10   22:invokespecial   #97  <Method void Locale(String, String)>
	//   11   25:astore_2        
			l = com.irobot.home.util.j.c(h, ((Locale) (intent)).getDisplayCountry());
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #99  <Field RelativeLayout h>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #102 <Method String Locale.getDisplayCountry()>
	//   17   35:invokestatic    #107 <Method TextView j.c(RelativeLayout, String)>
	//   18   38:putfield        #109 <Field TextView l>
			l.setTextColor(getResources().getColor(0x7f060078));
	//   19   41:aload_0         
	//   20   42:getfield        #109 <Field TextView l>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #113 <Method Resources getResources()>
	//   23   49:ldc1            #114 <Int 0x7f060078>
	//   24   51:invokevirtual   #120 <Method int Resources.getColor(int)>
	//   25   54:invokevirtual   #125 <Method void TextView.setTextColor(int)>
			n = com.irobot.home.util.j.a(((android.content.Context) (this)), false);
	//   26   57:aload_0         
	//   27   58:aload_0         
	//   28   59:iconst_0        
	//   29   60:invokestatic    #128 <Method String j.a(android.content.Context, boolean)>
	//   30   63:putfield        #37  <Field String n>
			i();
	//   31   66:aload_0         
	//   32   67:invokespecial   #130 <Method void i()>
		}
	//   33   70:return          
	}

	void b(int i1, Intent intent)
	{
		if(i1 == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          9
			recreate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #133 <Method void recreate()>
	//    5    9:return          
	}

	void e()
	{
		com.irobot.home.util.j.a(h, 0x7f0f0239);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field RelativeLayout h>
	//    2    4:ldc1            #134 <Int 0x7f0f0239>
	//    3    6:invokestatic    #137 <Method TextView j.a(RelativeLayout, int)>
	//    4    9:pop             
		l = com.irobot.home.util.j.c(h, getString(0x7f0f0755));
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #99  <Field RelativeLayout h>
	//    8   15:aload_0         
	//    9   16:ldc1            #138 <Int 0x7f0f0755>
	//   10   18:invokevirtual   #142 <Method String getString(int)>
	//   11   21:invokestatic    #107 <Method TextView j.c(RelativeLayout, String)>
	//   12   24:putfield        #109 <Field TextView l>
		if(b)
	//*  13   27:aload_0         
	//*  14   28:getfield        #34  <Field boolean b>
	//*  15   31:ifeq            72
		{
			d.setText(0x7f0f04ca);
	//   16   34:aload_0         
	//   17   35:getfield        #55  <Field CustomTextView d>
	//   18   38:ldc1            #56  <Int 0x7f0f04ca>
	//   19   40:invokevirtual   #62  <Method void CustomTextView.setText(int)>
			e.setVisibility(8);
	//   20   43:aload_0         
	//   21   44:getfield        #64  <Field CustomTextView e>
	//   22   47:bipush          8
	//   23   49:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
			f.setVisibility(0);
	//   24   52:aload_0         
	//   25   53:getfield        #69  <Field CustomTextView f>
	//   26   56:iconst_0        
	//   27   57:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
			f.setText(0x7f0f04c9);
	//   28   60:aload_0         
	//   29   61:getfield        #69  <Field CustomTextView f>
	//   30   64:ldc1            #70  <Int 0x7f0f04c9>
	//   31   66:invokevirtual   #62  <Method void CustomTextView.setText(int)>
		} else
	//*  32   69:goto            99
		{
			d.setText(0x7f0f0965);
	//   33   72:aload_0         
	//   34   73:getfield        #55  <Field CustomTextView d>
	//   35   76:ldc1            #71  <Int 0x7f0f0965>
	//   36   78:invokevirtual   #62  <Method void CustomTextView.setText(int)>
			e.setText(0x7f0f07f0);
	//   37   81:aload_0         
	//   38   82:getfield        #64  <Field CustomTextView e>
	//   39   85:ldc1            #72  <Int 0x7f0f07f0>
	//   40   87:invokevirtual   #62  <Method void CustomTextView.setText(int)>
			f.setVisibility(8);
	//   41   90:aload_0         
	//   42   91:getfield        #69  <Field CustomTextView f>
	//   43   94:bipush          8
	//   44   96:invokevirtual   #67  <Method void CustomTextView.setVisibility(int)>
		}
		n = com.irobot.home.util.j.a(((android.content.Context) (this)), false);
	//   45   99:aload_0         
	//   46  100:aload_0         
	//   47  101:iconst_0        
	//   48  102:invokestatic    #128 <Method String j.a(android.content.Context, boolean)>
	//   49  105:putfield        #37  <Field String n>
		if(n.equals("country_not_set"))
	//*  50  108:aload_0         
	//*  51  109:getfield        #37  <Field String n>
	//*  52  112:ldc1            #39  <String "country_not_set">
	//*  53  114:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  54  117:ifeq            153
		{
			l.setTextColor(getResources().getColor(0x7f060079));
	//   55  120:aload_0         
	//   56  121:getfield        #109 <Field TextView l>
	//   57  124:aload_0         
	//   58  125:invokevirtual   #113 <Method Resources getResources()>
	//   59  128:ldc1            #143 <Int 0x7f060079>
	//   60  130:invokevirtual   #120 <Method int Resources.getColor(int)>
	//   61  133:invokevirtual   #125 <Method void TextView.setTextColor(int)>
			com.irobot.home.util.j.c(h, getString(0x7f0f0755));
	//   62  136:aload_0         
	//   63  137:getfield        #99  <Field RelativeLayout h>
	//   64  140:aload_0         
	//   65  141:ldc1            #138 <Int 0x7f0f0755>
	//   66  143:invokevirtual   #142 <Method String getString(int)>
	//   67  146:invokestatic    #107 <Method TextView j.c(RelativeLayout, String)>
	//   68  149:pop             
		} else
	//*  69  150:goto            199
		{
			l.setTextColor(getResources().getColor(0x7f060078));
	//   70  153:aload_0         
	//   71  154:getfield        #109 <Field TextView l>
	//   72  157:aload_0         
	//   73  158:invokevirtual   #113 <Method Resources getResources()>
	//   74  161:ldc1            #114 <Int 0x7f060078>
	//   75  163:invokevirtual   #120 <Method int Resources.getColor(int)>
	//   76  166:invokevirtual   #125 <Method void TextView.setTextColor(int)>
			Locale locale = new Locale(Locale.getDefault().getLanguage(), n);
	//   77  169:new             #75  <Class Locale>
	//   78  172:dup             
	//   79  173:invokestatic    #79  <Method Locale Locale.getDefault()>
	//   80  176:invokevirtual   #83  <Method String Locale.getLanguage()>
	//   81  179:aload_0         
	//   82  180:getfield        #37  <Field String n>
	//   83  183:invokespecial   #97  <Method void Locale(String, String)>
	//   84  186:astore_1        
			com.irobot.home.util.j.c(h, locale.getDisplayCountry());
	//   85  187:aload_0         
	//   86  188:getfield        #99  <Field RelativeLayout h>
	//   87  191:aload_1         
	//   88  192:invokevirtual   #102 <Method String Locale.getDisplayCountry()>
	//   89  195:invokestatic    #107 <Method TextView j.c(RelativeLayout, String)>
	//   90  198:pop             
		}
		com.irobot.home.util.j.a(i, 0x7f0f0092);
	//   91  199:aload_0         
	//   92  200:getfield        #145 <Field RelativeLayout i>
	//   93  203:ldc1            #146 <Int 0x7f0f0092>
	//   94  205:invokestatic    #137 <Method TextView j.a(RelativeLayout, int)>
	//   95  208:pop             
		m = com.irobot.home.util.j.c(i, com.irobot.home.util.j.d(((android.content.Context) (this))));
	//   96  209:aload_0         
	//   97  210:aload_0         
	//   98  211:getfield        #145 <Field RelativeLayout i>
	//   99  214:aload_0         
	//  100  215:invokestatic    #149 <Method String j.d(android.content.Context)>
	//  101  218:invokestatic    #107 <Method TextView j.c(RelativeLayout, String)>
	//  102  221:putfield        #151 <Field TextView m>
		AnalyticsSubsystem.getInstance().trackOnboardingBegan(b ^ true);
	//  103  224:invokestatic    #157 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  104  227:aload_0         
	//  105  228:getfield        #34  <Field boolean b>
	//  106  231:iconst_1        
	//  107  232:ixor            
	//  108  233:invokevirtual   #160 <Method void AnalyticsSubsystem.trackOnboardingBegan(boolean)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.Welcome);
	//  109  236:invokestatic    #157 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  110  239:getstatic       #166 <Field ViewId ViewId.Welcome>
	//  111  242:invokevirtual   #170 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//  112  245:return          
	}

	public void f()
	{
		CountryPickerActivity_.a(((android.content.Context) (this))).a(1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #175 <Method CountryPickerActivity_$a CountryPickerActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #180 <Method org.androidannotations.api.a.e CountryPickerActivity_$a.a(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void g()
	{
		LanguagePickerActivity_.a(((android.content.Context) (this))).a(3);
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method LanguagePickerActivity_$a LanguagePickerActivity_.a(android.content.Context)>
	//    2    4:iconst_3        
	//    3    5:invokevirtual   #188 <Method org.androidannotations.api.a.e LanguagePickerActivity_$a.a(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void h()
	{
		j.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Button j>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #53  <Method void Button.setEnabled(boolean)>
		String s = com.irobot.home.util.j.h(((android.content.Context) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #190 <Method String j.h(android.content.Context)>
	//    6   12:astore_1        
		AnalyticsSubsystem.getInstance().trackCountryPickerSelection(s);
	//    7   13:invokestatic    #157 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #194 <Method void AnalyticsSubsystem.trackCountryPickerSelection(String)>
		LegalTermsActivity_.a(((android.content.Context) (this))).a();
	//   10   20:aload_0         
	//   11   21:invokestatic    #199 <Method LegalTermsActivity_$a LegalTermsActivity_.a(android.content.Context)>
	//   12   24:invokevirtual   #204 <Method org.androidannotations.api.a.e LegalTermsActivity_$a.a()>
	//   13   27:pop             
	//   14   28:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void BaseFragmentActivity.onResume()>
		j.setEnabled(n.equals("country_not_set") ^ true);
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field Button j>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field String n>
	//    6   12:ldc1            #39  <String "country_not_set">
	//    7   14:invokevirtual   #45  <Method boolean String.equals(Object)>
	//    8   17:iconst_1        
	//    9   18:ixor            
	//   10   19:invokevirtual   #53  <Method void Button.setEnabled(boolean)>
	//   11   22:return          
	}

	IRobotApplication a;
	boolean b;
	k c;
	CustomTextView d;
	CustomTextView e;
	CustomTextView f;
	ScrollView g;
	RelativeLayout h;
	RelativeLayout i;
	Button j;
	LinearLayout k;
	private TextView l;
	private TextView m;
	private String n;
}
