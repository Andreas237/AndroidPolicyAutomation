// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.view.a.b;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.irobot.core.DayOfTheWeek;
import com.irobot.home.IRobotApplication;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.model.rest.TermsInfo;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.Locale;

// Referenced classes of package com.irobot.home.fragments:
//			g, ai, RecyclerView

public class ai extends g
{
	public static interface a extends android.support.v4.view.a
	{

		public void a(View view, b b1)
		{
			super.a(view, b1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void android.support.v4.view.a.a(View, b)>
			if(!a.b() && a.a.getLayoutManager() != null)
		//*   4    6:aload_0         
		//*   5    7:getfield        #15  <Field ai a>
		//*   6   10:invokevirtual   #23  <Method boolean android.support.v7.widget.ai.b()>
		//*   7   13:ifne            44
		//*   8   16:aload_0         
		//*   9   17:getfield        #15  <Field ai a>
		//*  10   20:getfield        #26  <Field RecyclerView ai.a>
		//*  11   23:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
		//*  12   26:ifnull          44
				a.a.getLayoutManager().a(view, b1);
		//   13   29:aload_0         
		//   14   30:getfield        #15  <Field ai a>
		//   15   33:getfield        #26  <Field RecyclerView ai.a>
		//   16   36:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
		//   17   39:aload_1         
		//   18   40:aload_2         
		//   19   41:invokevirtual   #35  <Method void RecyclerView$h.a(View, b)>
		//   20   44:return          
		}

		public boolean a(View view, int i1, Bundle bundle)
		{
			if(super.a(view, i1, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #38  <Method boolean android.support.v4.view.a.a(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			if(!a.b() && a.a.getLayoutManager() != null)
		//*   8   12:aload_0         
		//*   9   13:getfield        #15  <Field ai a>
		//*  10   16:invokevirtual   #23  <Method boolean android.support.v7.widget.ai.b()>
		//*  11   19:ifne            52
		//*  12   22:aload_0         
		//*  13   23:getfield        #15  <Field ai a>
		//*  14   26:getfield        #26  <Field RecyclerView ai.a>
		//*  15   29:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
		//*  16   32:ifnull          52
				return a.a.getLayoutManager().a(view, i1, bundle);
		//   17   35:aload_0         
		//   18   36:getfield        #15  <Field ai a>
		//   19   39:getfield        #26  <Field RecyclerView ai.a>
		//   20   42:invokevirtual   #32  <Method RecyclerView$h RecyclerView.getLayoutManager()>
		//   21   45:aload_1         
		//   22   46:iload_2         
		//   23   47:aload_3         
		//   24   48:invokevirtual   #39  <Method boolean RecyclerView$h.a(View, int, Bundle)>
		//   25   51:ireturn         
			else
				return false;
		//   26   52:iconst_0        
		//   27   53:ireturn         
		}

		final ai a;

		public a(ai ai1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void android.support.v4.view.a()>
			a = ai1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field ai a>
		//    5    9:return          
		}
	}


	public ai()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void g()>
	//    2    4:return          
	}

	private boolean i()
	{
		return Locale.getDefault().getLanguage().equals(((Object) (Locale.ENGLISH.getLanguage())));
	//    0    0:invokestatic    #50  <Method Locale Locale.getDefault()>
	//    1    3:invokevirtual   #54  <Method String Locale.getLanguage()>
	//    2    6:getstatic       #58  <Field Locale Locale.ENGLISH>
	//    3    9:invokevirtual   #54  <Method String Locale.getLanguage()>
	//    4   12:invokevirtual   #64  <Method boolean String.equals(Object)>
	//    5   15:ireturn         
	}

	void a()
	{
		e = (ProgressBar)k.findViewById(0x7f090212);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field FrameLayout k>
	//    3    5:ldc1            #67  <Int 0x7f090212>
	//    4    7:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//    5   10:checkcast       #75  <Class ProgressBar>
	//    6   13:putfield        #77  <Field ProgressBar e>
		f = (ProgressBar)l.findViewById(0x7f090212);
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:getfield        #79  <Field FrameLayout l>
	//   10   21:ldc1            #67  <Int 0x7f090212>
	//   11   23:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   12   26:checkcast       #75  <Class ProgressBar>
	//   13   29:putfield        #81  <Field ProgressBar f>
		g = (ProgressBar)n.findViewById(0x7f090212);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #83  <Field FrameLayout n>
	//   17   37:ldc1            #67  <Int 0x7f090212>
	//   18   39:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   19   42:checkcast       #75  <Class ProgressBar>
	//   20   45:putfield        #85  <Field ProgressBar g>
		h = (ImageView)k.findViewById(0x7f090213);
	//   21   48:aload_0         
	//   22   49:aload_0         
	//   23   50:getfield        #66  <Field FrameLayout k>
	//   24   53:ldc1            #86  <Int 0x7f090213>
	//   25   55:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   26   58:checkcast       #88  <Class ImageView>
	//   27   61:putfield        #90  <Field ImageView h>
		i = (ImageView)l.findViewById(0x7f090213);
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #79  <Field FrameLayout l>
	//   31   69:ldc1            #86  <Int 0x7f090213>
	//   32   71:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   33   74:checkcast       #88  <Class ImageView>
	//   34   77:putfield        #92  <Field ImageView i>
		j = (ImageView)n.findViewById(0x7f090213);
	//   35   80:aload_0         
	//   36   81:aload_0         
	//   37   82:getfield        #83  <Field FrameLayout n>
	//   38   85:ldc1            #86  <Int 0x7f090213>
	//   39   87:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   40   90:checkcast       #88  <Class ImageView>
	//   41   93:putfield        #94  <Field ImageView j>
		o = (CustomTextView)k.findViewById(0x7f090214);
	//   42   96:aload_0         
	//   43   97:aload_0         
	//   44   98:getfield        #66  <Field FrameLayout k>
	//   45  101:ldc1            #95  <Int 0x7f090214>
	//   46  103:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   47  106:checkcast       #97  <Class CustomTextView>
	//   48  109:putfield        #99  <Field CustomTextView o>
		p = (CustomTextView)l.findViewById(0x7f090214);
	//   49  112:aload_0         
	//   50  113:aload_0         
	//   51  114:getfield        #79  <Field FrameLayout l>
	//   52  117:ldc1            #95  <Int 0x7f090214>
	//   53  119:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   54  122:checkcast       #97  <Class CustomTextView>
	//   55  125:putfield        #101 <Field CustomTextView p>
		q = (CustomTextView)n.findViewById(0x7f090214);
	//   56  128:aload_0         
	//   57  129:aload_0         
	//   58  130:getfield        #83  <Field FrameLayout n>
	//   59  133:ldc1            #95  <Int 0x7f090214>
	//   60  135:invokevirtual   #73  <Method View FrameLayout.findViewById(int)>
	//   61  138:checkcast       #97  <Class CustomTextView>
	//   62  141:putfield        #103 <Field CustomTextView q>
		o.setText(0x7f0f08b3);
	//   63  144:aload_0         
	//   64  145:getfield        #99  <Field CustomTextView o>
	//   65  148:ldc1            #104 <Int 0x7f0f08b3>
	//   66  150:invokevirtual   #108 <Method void CustomTextView.setText(int)>
		p.setText(0x7f0f02cd);
	//   67  153:aload_0         
	//   68  154:getfield        #101 <Field CustomTextView p>
	//   69  157:ldc1            #109 <Int 0x7f0f02cd>
	//   70  159:invokevirtual   #108 <Method void CustomTextView.setText(int)>
		q.setText(0x7f0f06ad);
	//   71  162:aload_0         
	//   72  163:getfield        #103 <Field CustomTextView q>
	//   73  166:ldc1            #110 <Int 0x7f0f06ad>
	//   74  168:invokevirtual   #108 <Method void CustomTextView.setText(int)>
		d.setEnabled(false);
	//   75  171:aload_0         
	//   76  172:getfield        #112 <Field Button d>
	//   77  175:iconst_0        
	//   78  176:invokevirtual   #118 <Method void Button.setEnabled(boolean)>
		h.setVisibility(8);
	//   79  179:aload_0         
	//   80  180:getfield        #90  <Field ImageView h>
	//   81  183:bipush          8
	//   82  185:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		i.setVisibility(8);
	//   83  188:aload_0         
	//   84  189:getfield        #92  <Field ImageView i>
	//   85  192:bipush          8
	//   86  194:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		j.setVisibility(8);
	//   87  197:aload_0         
	//   88  198:getfield        #94  <Field ImageView j>
	//   89  201:bipush          8
	//   90  203:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		k.setClickable(false);
	//   91  206:aload_0         
	//   92  207:getfield        #66  <Field FrameLayout k>
	//   93  210:iconst_0        
	//   94  211:invokevirtual   #124 <Method void FrameLayout.setClickable(boolean)>
		e.setVisibility(0);
	//   95  214:aload_0         
	//   96  215:getfield        #77  <Field ProgressBar e>
	//   97  218:iconst_0        
	//   98  219:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		f.setVisibility(0);
	//   99  222:aload_0         
	//  100  223:getfield        #81  <Field ProgressBar f>
	//  101  226:iconst_0        
	//  102  227:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		g.setVisibility(0);
	//  103  230:aload_0         
	//  104  231:getfield        #85  <Field ProgressBar g>
	//  105  234:iconst_0        
	//  106  235:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		c = com.irobot.home.util.j.i(((android.content.Context) (getActivity())));
	//  107  238:aload_0         
	//  108  239:aload_0         
	//  109  240:invokevirtual   #129 <Method Activity getActivity()>
	//  110  243:invokestatic    #134 <Method CustomerCareRestClient j.i(android.content.Context)>
	//  111  246:putfield        #136 <Field CustomerCareRestClient c>
		f();
	//  112  249:aload_0         
	//  113  250:invokevirtual   #138 <Method void f()>
	//  114  253:return          
	}

	public void a(a a1)
	{
		r = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field ai$a r>
	//    3    5:return          
	}

	void a(String s1, boolean flag, int i1)
	{
		WebViewActivity_.a(((android.app.Fragment) (this))).a(s1).a(flag).a(Integer.valueOf(i1)).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #147 <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.app.Fragment)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    4    8:iload_2         
	//    5    9:invokevirtual   #155 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(boolean)>
	//    6   12:iload_3         
	//    7   13:invokestatic    #161 <Method Integer Integer.valueOf(int)>
	//    8   16:invokevirtual   #164 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//    9   19:invokevirtual   #167 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   10   22:pop             
	//   11   23:return          
	}

	public void b()
	{
		r.a(true, s);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field ai$a r>
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #169 <Field TermsInfo s>
	//    5    9:invokeinterface #172 <Method void ai$a.a(boolean, TermsInfo)>
	//    6   14:return          
	}

	public void c()
	{
		boolean flag;
		String s1;
		if(s != null && com.irobot.home.util.j.i(s.getTermsUrl()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field TermsInfo s>
	//*   2    4:ifnull          39
	//*   3    7:aload_0         
	//*   4    8:getfield        #169 <Field TermsInfo s>
	//*   5   11:invokevirtual   #177 <Method String TermsInfo.getTermsUrl()>
	//*   6   14:invokestatic    #180 <Method boolean j.i(String)>
	//*   7   17:ifeq            39
		{
			s1 = s.getTermsUrl();
	//    8   20:aload_0         
	//    9   21:getfield        #169 <Field TermsInfo s>
	//   10   24:invokevirtual   #177 <Method String TermsInfo.getTermsUrl()>
	//   11   27:astore_2        
			flag = false;
	//   12   28:iconst_0        
	//   13   29:istore_1        
		} else
	//*  14   30:aload_0         
	//*  15   31:aload_2         
	//*  16   32:iload_1         
	//*  17   33:ldc1            #104 <Int 0x7f0f08b3>
	//*  18   35:invokevirtual   #182 <Method void a(String, boolean, int)>
	//*  19   38:return          
		if(i())
	//*  20   39:aload_0         
	//*  21   40:invokespecial   #184 <Method boolean i()>
	//*  22   43:ifeq            54
		{
			s1 = "file:///android_asset/term/TermsAndConditions.htm";
	//   23   46:ldc1            #186 <String "file:///android_asset/term/TermsAndConditions.htm">
	//   24   48:astore_2        
			flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		} else
	//*  27   51:goto            30
		{
			h();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #188 <Method void h()>
			return;
	//   30   58:return          
		}
		a(s1, flag, 0x7f0f08b3);
	}

	public void d()
	{
		boolean flag;
		String s1;
		if(s != null && com.irobot.home.util.j.i(s.eulaUrl))
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field TermsInfo s>
	//*   2    4:ifnull          39
	//*   3    7:aload_0         
	//*   4    8:getfield        #169 <Field TermsInfo s>
	//*   5   11:getfield        #192 <Field String TermsInfo.eulaUrl>
	//*   6   14:invokestatic    #180 <Method boolean j.i(String)>
	//*   7   17:ifeq            39
		{
			s1 = s.eulaUrl;
	//    8   20:aload_0         
	//    9   21:getfield        #169 <Field TermsInfo s>
	//   10   24:getfield        #192 <Field String TermsInfo.eulaUrl>
	//   11   27:astore_2        
			flag = false;
	//   12   28:iconst_0        
	//   13   29:istore_1        
		} else
	//*  14   30:aload_0         
	//*  15   31:aload_2         
	//*  16   32:iload_1         
	//*  17   33:ldc1            #109 <Int 0x7f0f02cd>
	//*  18   35:invokevirtual   #182 <Method void a(String, boolean, int)>
	//*  19   38:return          
		if(i())
	//*  20   39:aload_0         
	//*  21   40:invokespecial   #184 <Method boolean i()>
	//*  22   43:ifeq            54
		{
			s1 = "file:///android_asset/eula/EULA-United_States.htm";
	//   23   46:ldc1            #194 <String "file:///android_asset/eula/EULA-United_States.htm">
	//   24   48:astore_2        
			flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		} else
	//*  27   51:goto            30
		{
			h();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #188 <Method void h()>
			return;
	//   30   58:return          
		}
		a(s1, flag, 0x7f0f02cd);
	}

	public void e()
	{
		boolean flag;
		String s1;
		if(s != null && com.irobot.home.util.j.i(s.privacyUrl))
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field TermsInfo s>
	//*   2    4:ifnull          39
	//*   3    7:aload_0         
	//*   4    8:getfield        #169 <Field TermsInfo s>
	//*   5   11:getfield        #197 <Field String TermsInfo.privacyUrl>
	//*   6   14:invokestatic    #180 <Method boolean j.i(String)>
	//*   7   17:ifeq            39
		{
			s1 = s.privacyUrl;
	//    8   20:aload_0         
	//    9   21:getfield        #169 <Field TermsInfo s>
	//   10   24:getfield        #197 <Field String TermsInfo.privacyUrl>
	//   11   27:astore_2        
			flag = false;
	//   12   28:iconst_0        
	//   13   29:istore_1        
		} else
	//*  14   30:aload_0         
	//*  15   31:aload_2         
	//*  16   32:iload_1         
	//*  17   33:ldc1            #110 <Int 0x7f0f06ad>
	//*  18   35:invokevirtual   #182 <Method void a(String, boolean, int)>
	//*  19   38:return          
		if(i())
	//*  20   39:aload_0         
	//*  21   40:invokespecial   #184 <Method boolean i()>
	//*  22   43:ifeq            54
		{
			s1 = "file:///android_asset/privacy/PrivacyPolicy.htm";
	//   23   46:ldc1            #199 <String "file:///android_asset/privacy/PrivacyPolicy.htm">
	//   24   48:astore_2        
			flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		} else
	//*  27   51:goto            30
		{
			h();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #188 <Method void h()>
			return;
	//   30   58:return          
		}
		a(s1, flag, 0x7f0f06ad);
	}

	public void f()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #50  <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			s = c.getTermsInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(getActivity().getBaseContext()), "R980020");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #136 <Field CustomerCareRestClient c>
	//    5    9:aload_1         
	//    6   10:invokestatic    #204 <Method String j.a(Locale)>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #129 <Method Activity getActivity()>
	//    9   17:invokevirtual   #210 <Method android.content.Context Activity.getBaseContext()>
	//   10   20:invokestatic    #213 <Method String j.h(android.content.Context)>
	//   11   23:ldc1            #215 <String "R980020">
	//   12   25:invokeinterface #221 <Method TermsInfo CustomerCareRestClient.getTermsInfo(String, String, String)>
	//   13   30:putfield        #169 <Field TermsInfo s>
		}
	//*  14   33:goto            70
		catch(Exception exception)
	//*  15   36:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   37:new             #223 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #224 <Method void StringBuilder()>
	//   19   44:astore_2        
			stringbuilder.append("Cannot retrieve TermsInfo: ");
	//   20   45:aload_2         
	//   21   46:ldc1            #226 <String "Cannot retrieve TermsInfo: ">
	//   22   48:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
			stringbuilder.append(exception.getMessage());
	//   24   52:aload_2         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #233 <Method String Exception.getMessage()>
	//   27   57:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			com.irobot.home.util.o.e("LegalTermsFragment", stringbuilder.toString());
	//   29   61:ldc1            #235 <String "LegalTermsFragment">
	//   30   63:aload_2         
	//   31   64:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   32   67:invokestatic    #243 <Method void o.e(String, String)>
		}
		g();
	//   33   70:aload_0         
	//   34   71:invokevirtual   #245 <Method void g()>
	//   35   74:return          
	}

	void g()
	{
		d.setEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Button d>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #118 <Method void Button.setEnabled(boolean)>
		e.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #77  <Field ProgressBar e>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		f.setVisibility(8);
	//    8   17:aload_0         
	//    9   18:getfield        #81  <Field ProgressBar f>
	//   10   21:bipush          8
	//   11   23:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		g.setVisibility(8);
	//   12   26:aload_0         
	//   13   27:getfield        #85  <Field ProgressBar g>
	//   14   30:bipush          8
	//   15   32:invokevirtual   #125 <Method void ProgressBar.setVisibility(int)>
		h.setVisibility(0);
	//   16   35:aload_0         
	//   17   36:getfield        #90  <Field ImageView h>
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		i.setVisibility(0);
	//   20   43:aload_0         
	//   21   44:getfield        #92  <Field ImageView i>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		j.setVisibility(0);
	//   24   51:aload_0         
	//   25   52:getfield        #94  <Field ImageView j>
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #121 <Method void ImageView.setVisibility(int)>
		k.setClickable(true);
	//   28   59:aload_0         
	//   29   60:getfield        #66  <Field FrameLayout k>
	//   30   63:iconst_1        
	//   31   64:invokevirtual   #124 <Method void FrameLayout.setClickable(boolean)>
	//   32   67:return          
	}

	protected void h()
	{
		if(t == null && getActivity() != null && !getActivity().isFinishing() && !getActivity().isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field AlertDialog t>
	//*   2    4:ifnonnull       72
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #129 <Method Activity getActivity()>
	//*   5   11:ifnull          72
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #129 <Method Activity getActivity()>
	//*   8   18:invokevirtual   #250 <Method boolean Activity.isFinishing()>
	//*   9   21:ifne            72
	//*  10   24:aload_0         
	//*  11   25:invokevirtual   #129 <Method Activity getActivity()>
	//*  12   28:invokevirtual   #253 <Method boolean Activity.isDestroyed()>
	//*  13   31:ifne            72
			t = (new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (new a(this) {

				public void a(DayOfTheWeek dayoftheweek, boolean flag)
				{
				//    0    0:return          
				}

				public void f(int i1)
				{
				//    0    0:return          
				}

				final ai a;

			
			{
				a = ai1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ai a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
			}
))).create();
	//   14   34:aload_0         
	//   15   35:new             #255 <Class android.app.AlertDialog$Builder>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:invokevirtual   #129 <Method Activity getActivity()>
	//   19   43:invokespecial   #258 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   20   46:ldc2            #259 <Int 0x7f0f0960>
	//   21   49:invokevirtual   #263 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   22   52:ldc2            #264 <Int 0x7f0f05bb>
	//   23   55:new             #6   <Class ai$1>
	//   24   58:dup             
	//   25   59:aload_0         
	//   26   60:invokespecial   #267 <Method void ai$1(ai)>
	//   27   63:invokevirtual   #271 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   28   66:invokevirtual   #275 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   29   69:putfield        #247 <Field AlertDialog t>
		t.show();
	//   30   72:aload_0         
	//   31   73:getfield        #247 <Field AlertDialog t>
	//   32   76:invokevirtual   #280 <Method void AlertDialog.show()>
	//   33   79:return          
	}

	IRobotApplication a;
	k b;
	CustomerCareRestClient c;
	Button d;
	ProgressBar e;
	ProgressBar f;
	ProgressBar g;
	ImageView h;
	ImageView i;
	ImageView j;
	FrameLayout k;
	FrameLayout l;
	FrameLayout n;
	CustomTextView o;
	CustomTextView p;
	CustomTextView q;
	private a r;
	private TermsInfo s;
	private AlertDialog t;
}
