// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.irobot.home.b.ah;
import com.irobot.home.fragments.cc;
import com.irobot.home.fragments.cd;
import com.irobot.home.util.j;
import com.irobot.home.util.m;
import com.irobot.home.view.PageIndicatorButton;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, BraavaSetupConnectActivity_

public class BraavaSetupWelcomeActivity extends BaseFragmentActivity
{

	public BraavaSetupWelcomeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void BaseFragmentActivity()>
		e = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #48  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void ArrayList()>
	//    6   12:putfield        #51  <Field List e>
		f = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #48  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #49  <Method void ArrayList()>
	//   11   23:putfield        #53  <Field List f>
	//   12   26:return          
	}

	private void a(int k)
	{
		h = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int h>
		a.setCurrentItem(h);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field ViewPager a>
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field int h>
	//    7   13:invokevirtual   #63  <Method void ViewPager.setCurrentItem(int)>
		int l = m.a(e.size(), h);
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field List e>
	//   10   20:invokeinterface #69  <Method int List.size()>
	//   11   25:aload_0         
	//   12   26:getfield        #56  <Field int h>
	//   13   29:invokestatic    #74  <Method int m.a(int, int)>
	//   14   32:istore_2        
		for(k = 0; k < f.size(); k++)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:aload_0         
	//*  19   37:getfield        #53  <Field List f>
	//*  20   40:invokeinterface #69  <Method int List.size()>
	//*  21   45:icmpge          99
			if(k == l)
	//*  22   48:iload_1         
	//*  23   49:iload_2         
	//*  24   50:icmpne          76
				((PageIndicatorButton)f.get(k)).a(i);
	//   25   53:aload_0         
	//   26   54:getfield        #53  <Field List f>
	//   27   57:iload_1         
	//   28   58:invokeinterface #78  <Method Object List.get(int)>
	//   29   63:checkcast       #80  <Class PageIndicatorButton>
	//   30   66:aload_0         
	//   31   67:getfield        #82  <Field com.irobot.home.view.PageIndicatorButton$a i>
	//   32   70:invokevirtual   #85  <Method void PageIndicatorButton.a(com.irobot.home.view.PageIndicatorButton$a)>
			else
	//*  33   73:goto            92
				((PageIndicatorButton)f.get(k)).a();
	//   34   76:aload_0         
	//   35   77:getfield        #53  <Field List f>
	//   36   80:iload_1         
	//   37   81:invokeinterface #78  <Method Object List.get(int)>
	//   38   86:checkcast       #80  <Class PageIndicatorButton>
	//   39   89:invokevirtual   #87  <Method void PageIndicatorButton.a()>

	//   40   92:iload_1         
	//   41   93:iconst_1        
	//   42   94:iadd            
	//   43   95:istore_1        
	//*  44   96:goto            35
	//   45   99:return          
	}

	static void a(BraavaSetupWelcomeActivity braavasetupwelcomeactivity, int k)
	{
		braavasetupwelcomeactivity.a(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #90  <Method void a(int)>
	//    3    5:return          
	}

	static void b(BraavaSetupWelcomeActivity braavasetupwelcomeactivity, int k)
	{
		braavasetupwelcomeactivity.f(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #92  <Method void f(int)>
	//    3    5:return          
	}

	private void f(int k)
	{
		((cc)e.get(k)).d();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List e>
	//    2    4:iload_1         
	//    3    5:invokeinterface #78  <Method Object List.get(int)>
	//    4   10:checkcast       #94  <Class cc>
	//    5   13:invokevirtual   #96  <Method void cc.d()>
	//    6   16:return          
	}

	void e()
	{
		e.add(((Object) (cd.e().a(0x7f0e0008).b(0x7f0f0152).c(0x7f0f0153).d(-1).e(0x7f060061).a())));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List e>
	//    2    4:invokestatic    #101 <Method com.irobot.home.fragments.cd$a cd.e()>
	//    3    7:ldc1            #102 <Int 0x7f0e0008>
	//    4    9:invokevirtual   #107 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.a(int)>
	//    5   12:ldc1            #108 <Int 0x7f0f0152>
	//    6   14:invokevirtual   #110 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.b(int)>
	//    7   17:ldc1            #111 <Int 0x7f0f0153>
	//    8   19:invokevirtual   #113 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.c(int)>
	//    9   22:iconst_m1       
	//   10   23:invokevirtual   #115 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.d(int)>
	//   11   26:ldc1            #116 <Int 0x7f060061>
	//   12   28:invokevirtual   #118 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.e(int)>
	//   13   31:invokevirtual   #121 <Method cc com.irobot.home.fragments.cd$a.a()>
	//   14   34:invokeinterface #125 <Method boolean List.add(Object)>
	//   15   39:pop             
		e.add(((Object) (cd.e().a(0x7f0e0009).b(0x7f0f014e).c(0x7f0f014f).d(-1).e(0x7f060061).a())));
	//   16   40:aload_0         
	//   17   41:getfield        #51  <Field List e>
	//   18   44:invokestatic    #101 <Method com.irobot.home.fragments.cd$a cd.e()>
	//   19   47:ldc1            #126 <Int 0x7f0e0009>
	//   20   49:invokevirtual   #107 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.a(int)>
	//   21   52:ldc1            #127 <Int 0x7f0f014e>
	//   22   54:invokevirtual   #110 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.b(int)>
	//   23   57:ldc1            #128 <Int 0x7f0f014f>
	//   24   59:invokevirtual   #113 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.c(int)>
	//   25   62:iconst_m1       
	//   26   63:invokevirtual   #115 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.d(int)>
	//   27   66:ldc1            #116 <Int 0x7f060061>
	//   28   68:invokevirtual   #118 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.e(int)>
	//   29   71:invokevirtual   #121 <Method cc com.irobot.home.fragments.cd$a.a()>
	//   30   74:invokeinterface #125 <Method boolean List.add(Object)>
	//   31   79:pop             
		e.add(((Object) (cd.e().a(0x7f0e000a).b(0x7f0f0149).c(0x7f0f0148).d(-1).e(0x7f060061).a())));
	//   32   80:aload_0         
	//   33   81:getfield        #51  <Field List e>
	//   34   84:invokestatic    #101 <Method com.irobot.home.fragments.cd$a cd.e()>
	//   35   87:ldc1            #129 <Int 0x7f0e000a>
	//   36   89:invokevirtual   #107 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.a(int)>
	//   37   92:ldc1            #130 <Int 0x7f0f0149>
	//   38   94:invokevirtual   #110 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.b(int)>
	//   39   97:ldc1            #131 <Int 0x7f0f0148>
	//   40   99:invokevirtual   #113 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.c(int)>
	//   41  102:iconst_m1       
	//   42  103:invokevirtual   #115 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.d(int)>
	//   43  106:ldc1            #116 <Int 0x7f060061>
	//   44  108:invokevirtual   #118 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.e(int)>
	//   45  111:invokevirtual   #121 <Method cc com.irobot.home.fragments.cd$a.a()>
	//   46  114:invokeinterface #125 <Method boolean List.add(Object)>
	//   47  119:pop             
		e.add(((Object) (cd.e().a(0x7f0e000b).b(0x7f0f0147).c(0x7f0f0146).d(-1).e(0x7f060061).a())));
	//   48  120:aload_0         
	//   49  121:getfield        #51  <Field List e>
	//   50  124:invokestatic    #101 <Method com.irobot.home.fragments.cd$a cd.e()>
	//   51  127:ldc1            #132 <Int 0x7f0e000b>
	//   52  129:invokevirtual   #107 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.a(int)>
	//   53  132:ldc1            #133 <Int 0x7f0f0147>
	//   54  134:invokevirtual   #110 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.b(int)>
	//   55  137:ldc1            #134 <Int 0x7f0f0146>
	//   56  139:invokevirtual   #113 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.c(int)>
	//   57  142:iconst_m1       
	//   58  143:invokevirtual   #115 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.d(int)>
	//   59  146:ldc1            #116 <Int 0x7f060061>
	//   60  148:invokevirtual   #118 <Method com.irobot.home.fragments.cd$a com.irobot.home.fragments.cd$a.e(int)>
	//   61  151:invokevirtual   #121 <Method cc com.irobot.home.fragments.cd$a.a()>
	//   62  154:invokeinterface #125 <Method boolean List.add(Object)>
	//   63  159:pop             
		i = com.irobot.home.view.PageIndicatorButton.a.Blue;
	//   64  160:aload_0         
	//   65  161:getstatic       #139 <Field com.irobot.home.view.PageIndicatorButton$a com.irobot.home.view.PageIndicatorButton$a.Blue>
	//   66  164:putfield        #82  <Field com.irobot.home.view.PageIndicatorButton$a i>
		c.setBackground(getResources().getDrawable(0x7f0800c7));
	//   67  167:aload_0         
	//   68  168:getfield        #141 <Field Button c>
	//   69  171:aload_0         
	//   70  172:invokevirtual   #145 <Method Resources getResources()>
	//   71  175:ldc1            #146 <Int 0x7f0800c7>
	//   72  177:invokevirtual   #152 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   73  180:invokevirtual   #158 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
		d.setTextColor(getResources().getColor(0x7f06006c));
	//   74  183:aload_0         
	//   75  184:getfield        #160 <Field Button d>
	//   76  187:aload_0         
	//   77  188:invokevirtual   #145 <Method Resources getResources()>
	//   78  191:ldc1            #161 <Int 0x7f06006c>
	//   79  193:invokevirtual   #165 <Method int Resources.getColor(int)>
	//   80  196:invokevirtual   #168 <Method void Button.setTextColor(int)>
		b(0x7f0f07f4);
	//   81  199:aload_0         
	//   82  200:ldc1            #169 <Int 0x7f0f07f4>
	//   83  202:invokevirtual   #171 <Method void b(int)>
		ah ah1 = new ah(getFragmentManager(), e);
	//   84  205:new             #173 <Class ah>
	//   85  208:dup             
	//   86  209:aload_0         
	//   87  210:invokevirtual   #177 <Method android.app.FragmentManager getFragmentManager()>
	//   88  213:aload_0         
	//   89  214:getfield        #51  <Field List e>
	//   90  217:invokespecial   #180 <Method void ah(android.app.FragmentManager, List)>
	//   91  220:astore_2        
		a.setAdapter(((android.support.v4.view.p) (ah1)));
	//   92  221:aload_0         
	//   93  222:getfield        #58  <Field ViewPager a>
	//   94  225:aload_2         
	//   95  226:invokevirtual   #184 <Method void ViewPager.setAdapter(android.support.v4.view.p)>
		a.a(((android.support.v4.view.ViewPager.e) (new android.support.v4.view.ViewPager.h() {

			public void b(int l)
			{
				BraavaSetupWelcomeActivity.a(a, l);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaSetupWelcomeActivity a>
			//    2    4:iload_1         
			//    3    5:invokestatic    #23  <Method void BraavaSetupWelcomeActivity.a(BraavaSetupWelcomeActivity, int)>
				BraavaSetupWelcomeActivity.b(a, l);
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field BraavaSetupWelcomeActivity a>
			//    6   12:iload_1         
			//    7   13:invokestatic    #25  <Method void BraavaSetupWelcomeActivity.b(BraavaSetupWelcomeActivity, int)>
			//    8   16:return          
			}

			final BraavaSetupWelcomeActivity a;

			
			{
				a = BraavaSetupWelcomeActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaSetupWelcomeActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.support.v4.view.ViewPager$h()>
			//    5    9:return          
			}
		}
)));
	//   96  229:aload_0         
	//   97  230:getfield        #58  <Field ViewPager a>
	//   98  233:new             #6   <Class BraavaSetupWelcomeActivity$1>
	//   99  236:dup             
	//  100  237:aload_0         
	//  101  238:invokespecial   #187 <Method void BraavaSetupWelcomeActivity$1(BraavaSetupWelcomeActivity)>
	//  102  241:invokevirtual   #190 <Method void ViewPager.a(android.support.v4.view.ViewPager$e)>
		for(int k = 0; k < e.size(); k++)
	//* 103  244:iconst_0        
	//* 104  245:istore_1        
	//* 105  246:iload_1         
	//* 106  247:aload_0         
	//* 107  248:getfield        #51  <Field List e>
	//* 108  251:invokeinterface #69  <Method int List.size()>
	//* 109  256:icmpge          311
		{
			PageIndicatorButton pageindicatorbutton = new PageIndicatorButton(((android.content.Context) (this)));
	//  110  259:new             #80  <Class PageIndicatorButton>
	//  111  262:dup             
	//  112  263:aload_0         
	//  113  264:invokespecial   #193 <Method void PageIndicatorButton(android.content.Context)>
	//  114  267:astore_2        
			pageindicatorbutton.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					int l = ((ViewGroup)view.getParent()).indexOfChild(view);
				//    0    0:aload_1         
				//    1    1:invokevirtual   #28  <Method android.view.ViewParent View.getParent()>
				//    2    4:checkcast       #30  <Class ViewGroup>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #34  <Method int ViewGroup.indexOfChild(View)>
				//    5   11:istore_2        
					BraavaSetupWelcomeActivity.a(a, m.a(a.e.size(), l));
				//    6   12:aload_0         
				//    7   13:getfield        #17  <Field BraavaSetupWelcomeActivity a>
				//    8   16:aload_0         
				//    9   17:getfield        #17  <Field BraavaSetupWelcomeActivity a>
				//   10   20:getfield        #37  <Field List BraavaSetupWelcomeActivity.e>
				//   11   23:invokeinterface #43  <Method int List.size()>
				//   12   28:iload_2         
				//   13   29:invokestatic    #48  <Method int m.a(int, int)>
				//   14   32:invokestatic    #51  <Method void BraavaSetupWelcomeActivity.a(BraavaSetupWelcomeActivity, int)>
				//   15   35:return          
				}

				final BraavaSetupWelcomeActivity a;

			
			{
				a = BraavaSetupWelcomeActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaSetupWelcomeActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  115  268:aload_2         
	//  116  269:new             #8   <Class BraavaSetupWelcomeActivity$2>
	//  117  272:dup             
	//  118  273:aload_0         
	//  119  274:invokespecial   #194 <Method void BraavaSetupWelcomeActivity$2(BraavaSetupWelcomeActivity)>
	//  120  277:invokevirtual   #198 <Method void PageIndicatorButton.setOnClickListener(android.view.View$OnClickListener)>
			f.add(((Object) (pageindicatorbutton)));
	//  121  280:aload_0         
	//  122  281:getfield        #53  <Field List f>
	//  123  284:aload_2         
	//  124  285:invokeinterface #125 <Method boolean List.add(Object)>
	//  125  290:pop             
			b.addView(((View) (pageindicatorbutton)));
	//  126  291:aload_0         
	//  127  292:getfield        #200 <Field LinearLayout b>
	//  128  295:aload_2         
	//  129  296:invokevirtual   #206 <Method void LinearLayout.addView(View)>
			pageindicatorbutton.setImportantForAccessibility(4);
	//  130  299:aload_2         
	//  131  300:iconst_4        
	//  132  301:invokevirtual   #209 <Method void PageIndicatorButton.setImportantForAccessibility(int)>
		}

	//  133  304:iload_1         
	//  134  305:iconst_1        
	//  135  306:iadd            
	//  136  307:istore_1        
	//* 137  308:goto            246
		a(m.a(e.size(), 0));
	//  138  311:aload_0         
	//  139  312:aload_0         
	//  140  313:getfield        #51  <Field List e>
	//  141  316:invokeinterface #69  <Method int List.size()>
	//  142  321:iconst_0        
	//  143  322:invokestatic    #74  <Method int m.a(int, int)>
	//  144  325:invokespecial   #90  <Method void a(int)>
	//  145  328:return          
	}

	protected void f()
	{
		int k = m.a(e.size(), h);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List e>
	//    2    4:invokeinterface #69  <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #56  <Field int h>
	//    5   13:invokestatic    #74  <Method int m.a(int, int)>
	//    6   16:istore_1        
		if(k < e.size() - 1)
	//*   7   17:iload_1         
	//*   8   18:aload_0         
	//*   9   19:getfield        #51  <Field List e>
	//*  10   22:invokeinterface #69  <Method int List.size()>
	//*  11   27:iconst_1        
	//*  12   28:isub            
	//*  13   29:icmpge          52
		{
			a(m.a(e.size(), k + 1));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #51  <Field List e>
	//   17   37:invokeinterface #69  <Method int List.size()>
	//   18   42:iload_1         
	//   19   43:iconst_1        
	//   20   44:iadd            
	//   21   45:invokestatic    #74  <Method int m.a(int, int)>
	//   22   48:invokespecial   #90  <Method void a(int)>
			return;
	//   23   51:return          
		} else
		{
			h();
	//   24   52:aload_0         
	//   25   53:invokevirtual   #211 <Method void h()>
			return;
	//   26   56:return          
		}
	}

	protected void g()
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #211 <Method void h()>
	//    2    4:return          
	}

	protected void h()
	{
		BraavaSetupConnectActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #216 <Method BraavaSetupConnectActivity_$a BraavaSetupConnectActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #221 <Method org.androidannotations.api.a.e BraavaSetupConnectActivity_$a.a()>
	//    3    7:pop             
		finish();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #224 <Method void finish()>
	//    6   12:return          
	}

	private static final String g = j.r(((Class) (com/irobot/home/BraavaSetupWelcomeActivity)).getSimpleName());
	ViewPager a;
	LinearLayout b;
	Button c;
	Button d;
	List e;
	List f;
	private int h;
	private com.irobot.home.view.PageIndicatorButton.a i;

	static 
	{
	//    0    0:ldc1            #2   <Class BraavaSetupWelcomeActivity>
	//    1    2:invokevirtual   #34  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #40  <Method String j.r(String)>
	//    3    8:putstatic       #42  <Field String g>
	//*   4   11:return          
	}
}
