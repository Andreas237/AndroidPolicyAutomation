// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import com.irobot.home.util.AssetSoftwareUpdateUtils_;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity, IRobotApplication_

public final class DeveloperActivity_ extends DeveloperActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/DeveloperActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class DeveloperActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public DeveloperActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void DeveloperActivity()>
	//    2    4:aload_0         
	//    3    5:new             #79  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #80  <Method void c()>
	//    6   12:putfield        #82  <Field c K>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #70  <Class DeveloperActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #87  <Method void DeveloperActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		H = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #90  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #91  <Method void k(Context)>
	//    5    9:putfield        #95  <Field k H>
		c.a(((b) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #98  <Method void c.a(b)>
		G = IRobotApplication_.r();
	//    8   16:aload_0         
	//    9   17:invokestatic    #104 <Method IRobotApplication IRobotApplication_.r()>
	//   10   20:putfield        #108 <Field IRobotApplication G>
		I = ((com.irobot.home.util.AssetSoftwareUpdateUtils) (AssetSoftwareUpdateUtils_.a(((Context) (this)))));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokestatic    #113 <Method AssetSoftwareUpdateUtils_ AssetSoftwareUpdateUtils_.a(Context)>
	//   14   28:putfield        #117 <Field com.irobot.home.util.AssetSoftwareUpdateUtils I>
	//   15   31:return          
	}

	static void a(DeveloperActivity_ developeractivity_, boolean flag)
	{
		((DeveloperActivity) (developeractivity_)).com.irobot.home.DeveloperActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #121 <Method void com.irobot.home.DeveloperActivity.a(boolean)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #125 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (SwitchCompat)a1.a(0x7f09014a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #129 <Int 0x7f09014a>
	//    3    4:invokeinterface #131 <Method View a.a(int)>
	//    4    9:checkcast       #133 <Class SwitchCompat>
	//    5   12:putfield        #136 <Field SwitchCompat a>
		b = (SwitchCompat)a1.a(0x7f090234);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #137 <Int 0x7f090234>
	//    9   19:invokeinterface #131 <Method View a.a(int)>
	//   10   24:checkcast       #133 <Class SwitchCompat>
	//   11   27:putfield        #140 <Field SwitchCompat b>
		c = (SwitchCompat)a1.a(0x7f090167);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #141 <Int 0x7f090167>
	//   15   34:invokeinterface #131 <Method View a.a(int)>
	//   16   39:checkcast       #133 <Class SwitchCompat>
	//   17   42:putfield        #144 <Field SwitchCompat c>
		d = (SwitchCompat)a1.a(0x7f09033f);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #145 <Int 0x7f09033f>
	//   21   49:invokeinterface #131 <Method View a.a(int)>
	//   22   54:checkcast       #133 <Class SwitchCompat>
	//   23   57:putfield        #148 <Field SwitchCompat d>
		e = (SwitchCompat)a1.a(0x7f090182);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #149 <Int 0x7f090182>
	//   27   64:invokeinterface #131 <Method View a.a(int)>
	//   28   69:checkcast       #133 <Class SwitchCompat>
	//   29   72:putfield        #152 <Field SwitchCompat e>
		f = (SwitchCompat)a1.a(0x7f09013c);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #153 <Int 0x7f09013c>
	//   33   79:invokeinterface #131 <Method View a.a(int)>
	//   34   84:checkcast       #133 <Class SwitchCompat>
	//   35   87:putfield        #156 <Field SwitchCompat f>
		g = (SwitchCompat)a1.a(0x7f09016e);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #157 <Int 0x7f09016e>
	//   39   94:invokeinterface #131 <Method View a.a(int)>
	//   40   99:checkcast       #133 <Class SwitchCompat>
	//   41  102:putfield        #160 <Field SwitchCompat g>
		h = (SwitchCompat)a1.a(0x7f09016a);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #161 <Int 0x7f09016a>
	//   45  109:invokeinterface #131 <Method View a.a(int)>
	//   46  114:checkcast       #133 <Class SwitchCompat>
	//   47  117:putfield        #164 <Field SwitchCompat h>
		i = (SwitchCompat)a1.a(0x7f090168);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #165 <Int 0x7f090168>
	//   51  124:invokeinterface #131 <Method View a.a(int)>
	//   52  129:checkcast       #133 <Class SwitchCompat>
	//   53  132:putfield        #168 <Field SwitchCompat i>
		j = (SwitchCompat)a1.a(0x7f09016c);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #169 <Int 0x7f09016c>
	//   57  139:invokeinterface #131 <Method View a.a(int)>
	//   58  144:checkcast       #133 <Class SwitchCompat>
	//   59  147:putfield        #172 <Field SwitchCompat j>
		k = (SwitchCompat)a1.a(0x7f0903dc);
	//   60  150:aload_0         
	//   61  151:aload_1         
	//   62  152:ldc1            #173 <Int 0x7f0903dc>
	//   63  154:invokeinterface #131 <Method View a.a(int)>
	//   64  159:checkcast       #133 <Class SwitchCompat>
	//   65  162:putfield        #176 <Field SwitchCompat k>
		l = (CustomTextView)a1.a(0x7f0901fa);
	//   66  165:aload_0         
	//   67  166:aload_1         
	//   68  167:ldc1            #177 <Int 0x7f0901fa>
	//   69  169:invokeinterface #131 <Method View a.a(int)>
	//   70  174:checkcast       #179 <Class CustomTextView>
	//   71  177:putfield        #183 <Field CustomTextView l>
		m = (CustomTextView)a1.a(0x7f0901f7);
	//   72  180:aload_0         
	//   73  181:aload_1         
	//   74  182:ldc1            #184 <Int 0x7f0901f7>
	//   75  184:invokeinterface #131 <Method View a.a(int)>
	//   76  189:checkcast       #179 <Class CustomTextView>
	//   77  192:putfield        #187 <Field CustomTextView m>
		n = (CustomTextView)a1.a(0x7f090087);
	//   78  195:aload_0         
	//   79  196:aload_1         
	//   80  197:ldc1            #188 <Int 0x7f090087>
	//   81  199:invokeinterface #131 <Method View a.a(int)>
	//   82  204:checkcast       #179 <Class CustomTextView>
	//   83  207:putfield        #191 <Field CustomTextView n>
		o = (EditText)a1.a(0x7f09025e);
	//   84  210:aload_0         
	//   85  211:aload_1         
	//   86  212:ldc1            #192 <Int 0x7f09025e>
	//   87  214:invokeinterface #131 <Method View a.a(int)>
	//   88  219:checkcast       #194 <Class EditText>
	//   89  222:putfield        #198 <Field EditText o>
		t = (CustomButton)a1.a(0x7f0901cb);
	//   90  225:aload_0         
	//   91  226:aload_1         
	//   92  227:ldc1            #199 <Int 0x7f0901cb>
	//   93  229:invokeinterface #131 <Method View a.a(int)>
	//   94  234:checkcast       #201 <Class CustomButton>
	//   95  237:putfield        #205 <Field CustomButton t>
		u = (CustomButton)a1.a(0x7f0901ca);
	//   96  240:aload_0         
	//   97  241:aload_1         
	//   98  242:ldc1            #206 <Int 0x7f0901ca>
	//   99  244:invokeinterface #131 <Method View a.a(int)>
	//  100  249:checkcast       #201 <Class CustomButton>
	//  101  252:putfield        #209 <Field CustomButton u>
		v = (CustomButton)a1.a(0x7f090274);
	//  102  255:aload_0         
	//  103  256:aload_1         
	//  104  257:ldc1            #210 <Int 0x7f090274>
	//  105  259:invokeinterface #131 <Method View a.a(int)>
	//  106  264:checkcast       #201 <Class CustomButton>
	//  107  267:putfield        #213 <Field CustomButton v>
		w = (CustomButton)a1.a(0x7f090090);
	//  108  270:aload_0         
	//  109  271:aload_1         
	//  110  272:ldc1            #214 <Int 0x7f090090>
	//  111  274:invokeinterface #131 <Method View a.a(int)>
	//  112  279:checkcast       #201 <Class CustomButton>
	//  113  282:putfield        #217 <Field CustomButton w>
		x = (CustomButton)a1.a(0x7f0902f4);
	//  114  285:aload_0         
	//  115  286:aload_1         
	//  116  287:ldc1            #218 <Int 0x7f0902f4>
	//  117  289:invokeinterface #131 <Method View a.a(int)>
	//  118  294:checkcast       #201 <Class CustomButton>
	//  119  297:putfield        #221 <Field CustomButton x>
		y = (CustomButton)a1.a(0x7f0903c5);
	//  120  300:aload_0         
	//  121  301:aload_1         
	//  122  302:ldc1            #222 <Int 0x7f0903c5>
	//  123  304:invokeinterface #131 <Method View a.a(int)>
	//  124  309:checkcast       #201 <Class CustomButton>
	//  125  312:putfield        #225 <Field CustomButton y>
		z = (CustomButton)a1.a(0x7f090183);
	//  126  315:aload_0         
	//  127  316:aload_1         
	//  128  317:ldc1            #226 <Int 0x7f090183>
	//  129  319:invokeinterface #131 <Method View a.a(int)>
	//  130  324:checkcast       #201 <Class CustomButton>
	//  131  327:putfield        #229 <Field CustomButton z>
		A = (CustomButton)a1.a(0x7f09033c);
	//  132  330:aload_0         
	//  133  331:aload_1         
	//  134  332:ldc1            #230 <Int 0x7f09033c>
	//  135  334:invokeinterface #131 <Method View a.a(int)>
	//  136  339:checkcast       #201 <Class CustomButton>
	//  137  342:putfield        #233 <Field CustomButton A>
		B = (CustomButton)a1.a(0x7f09022a);
	//  138  345:aload_0         
	//  139  346:aload_1         
	//  140  347:ldc1            #234 <Int 0x7f09022a>
	//  141  349:invokeinterface #131 <Method View a.a(int)>
	//  142  354:checkcast       #201 <Class CustomButton>
	//  143  357:putfield        #237 <Field CustomButton B>
		C = (CustomButton)a1.a(0x7f090281);
	//  144  360:aload_0         
	//  145  361:aload_1         
	//  146  362:ldc1            #238 <Int 0x7f090281>
	//  147  364:invokeinterface #131 <Method View a.a(int)>
	//  148  369:checkcast       #201 <Class CustomButton>
	//  149  372:putfield        #241 <Field CustomButton C>
		D = (CustomButton)a1.a(0x7f09015a);
	//  150  375:aload_0         
	//  151  376:aload_1         
	//  152  377:ldc1            #242 <Int 0x7f09015a>
	//  153  379:invokeinterface #131 <Method View a.a(int)>
	//  154  384:checkcast       #201 <Class CustomButton>
	//  155  387:putfield        #245 <Field CustomButton D>
		E = (Spinner)a1.a(0x7f09005c);
	//  156  390:aload_0         
	//  157  391:aload_1         
	//  158  392:ldc1            #246 <Int 0x7f09005c>
	//  159  394:invokeinterface #131 <Method View a.a(int)>
	//  160  399:checkcast       #248 <Class Spinner>
	//  161  402:putfield        #252 <Field Spinner E>
		F = (Spinner)a1.a(0x7f0903e0);
	//  162  405:aload_0         
	//  163  406:aload_1         
	//  164  407:ldc1            #253 <Int 0x7f0903e0>
	//  165  409:invokeinterface #131 <Method View a.a(int)>
	//  166  414:checkcast       #248 <Class Spinner>
	//  167  417:putfield        #256 <Field Spinner F>
		View view = a1.a(0x7f0901a8);
	//  168  420:aload_1         
	//  169  421:ldc2            #257 <Int 0x7f0901a8>
	//  170  424:invokeinterface #131 <Method View a.a(int)>
	//  171  429:astore_2        
		View view1 = a1.a(0x7f0900ee);
	//  172  430:aload_1         
	//  173  431:ldc2            #258 <Int 0x7f0900ee>
	//  174  434:invokeinterface #131 <Method View a.a(int)>
	//  175  439:astore_3        
		View view2 = a1.a(0x7f09027d);
	//  176  440:aload_1         
	//  177  441:ldc2            #259 <Int 0x7f09027d>
	//  178  444:invokeinterface #131 <Method View a.a(int)>
	//  179  449:astore          4
		View view3 = a1.a(0x7f09013e);
	//  180  451:aload_1         
	//  181  452:ldc2            #260 <Int 0x7f09013e>
	//  182  455:invokeinterface #131 <Method View a.a(int)>
	//  183  460:astore          5
		View view4 = a1.a(0x7f090137);
	//  184  462:aload_1         
	//  185  463:ldc2            #261 <Int 0x7f090137>
	//  186  466:invokeinterface #131 <Method View a.a(int)>
	//  187  471:astore          6
		View view5 = a1.a(0x7f09019e);
	//  188  473:aload_1         
	//  189  474:ldc2            #262 <Int 0x7f09019e>
	//  190  477:invokeinterface #131 <Method View a.a(int)>
	//  191  482:astore          7
		a1 = ((org.androidannotations.api.c.a) ((CompoundButton)a1.a(0x7f090482)));
	//  192  484:aload_1         
	//  193  485:ldc2            #263 <Int 0x7f090482>
	//  194  488:invokeinterface #131 <Method View a.a(int)>
	//  195  493:checkcast       #265 <Class CompoundButton>
	//  196  496:astore_1        
		if(t != null)
	//* 197  497:aload_0         
	//* 198  498:getfield        #205 <Field CustomButton t>
	//* 199  501:ifnull          519
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.p();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.p()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  200  504:aload_0         
	//  201  505:getfield        #205 <Field CustomButton t>
	//  202  508:new             #10  <Class DeveloperActivity_$1>
	//  203  511:dup             
	//  204  512:aload_0         
	//  205  513:invokespecial   #268 <Method void DeveloperActivity_$1(DeveloperActivity_)>
	//  206  516:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(u != null)
	//* 207  519:aload_0         
	//* 208  520:getfield        #209 <Field CustomButton u>
	//* 209  523:ifnull          541
			u.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.q();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.q()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  210  526:aload_0         
	//  211  527:getfield        #209 <Field CustomButton u>
	//  212  530:new             #16  <Class DeveloperActivity_$12>
	//  213  533:dup             
	//  214  534:aload_0         
	//  215  535:invokespecial   #273 <Method void DeveloperActivity_$12(DeveloperActivity_)>
	//  216  538:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view != null)
	//* 217  541:aload_2         
	//* 218  542:ifnull          557
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.r();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.r()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  219  545:aload_2         
	//  220  546:new             #40  <Class DeveloperActivity_$23>
	//  221  549:dup             
	//  222  550:aload_0         
	//  223  551:invokespecial   #274 <Method void DeveloperActivity_$23(DeveloperActivity_)>
	//  224  554:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(x != null)
	//* 225  557:aload_0         
	//* 226  558:getfield        #221 <Field CustomButton x>
	//* 227  561:ifnull          579
			x.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.s();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.s()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  228  564:aload_0         
	//  229  565:getfield        #221 <Field CustomButton x>
	//  230  568:new             #44  <Class DeveloperActivity_$25>
	//  231  571:dup             
	//  232  572:aload_0         
	//  233  573:invokespecial   #278 <Method void DeveloperActivity_$25(DeveloperActivity_)>
	//  234  576:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(v != null)
	//* 235  579:aload_0         
	//* 236  580:getfield        #213 <Field CustomButton v>
	//* 237  583:ifnull          601
			v.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.t();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.t()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  238  586:aload_0         
	//  239  587:getfield        #213 <Field CustomButton v>
	//  240  590:new             #46  <Class DeveloperActivity_$26>
	//  241  593:dup             
	//  242  594:aload_0         
	//  243  595:invokespecial   #279 <Method void DeveloperActivity_$26(DeveloperActivity_)>
	//  244  598:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view1 != null)
	//* 245  601:aload_3         
	//* 246  602:ifnull          617
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.x();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.x()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  247  605:aload_3         
	//  248  606:new             #48  <Class DeveloperActivity_$27>
	//  249  609:dup             
	//  250  610:aload_0         
	//  251  611:invokespecial   #280 <Method void DeveloperActivity_$27(DeveloperActivity_)>
	//  252  614:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(w != null)
	//* 253  617:aload_0         
	//* 254  618:getfield        #217 <Field CustomButton w>
	//* 255  621:ifnull          639
			w.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.y();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.y()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  256  624:aload_0         
	//  257  625:getfield        #217 <Field CustomButton w>
	//  258  628:new             #50  <Class DeveloperActivity_$28>
	//  259  631:dup             
	//  260  632:aload_0         
	//  261  633:invokespecial   #281 <Method void DeveloperActivity_$28(DeveloperActivity_)>
	//  262  636:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(z != null)
	//* 263  639:aload_0         
	//* 264  640:getfield        #229 <Field CustomButton z>
	//* 265  643:ifnull          661
			z.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.z();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.z()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  266  646:aload_0         
	//  267  647:getfield        #229 <Field CustomButton z>
	//  268  650:new             #52  <Class DeveloperActivity_$29>
	//  269  653:dup             
	//  270  654:aload_0         
	//  271  655:invokespecial   #282 <Method void DeveloperActivity_$29(DeveloperActivity_)>
	//  272  658:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(C != null)
	//* 273  661:aload_0         
	//* 274  662:getfield        #241 <Field CustomButton C>
	//* 275  665:ifnull          683
			C.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.A();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.A()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  276  668:aload_0         
	//  277  669:getfield        #241 <Field CustomButton C>
	//  278  672:new             #56  <Class DeveloperActivity_$30>
	//  279  675:dup             
	//  280  676:aload_0         
	//  281  677:invokespecial   #283 <Method void DeveloperActivity_$30(DeveloperActivity_)>
	//  282  680:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view2 != null)
	//* 283  683:aload           4
	//* 284  685:ifnull          701
			view2.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.B();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.B()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  285  688:aload           4
	//  286  690:new             #32  <Class DeveloperActivity_$2>
	//  287  693:dup             
	//  288  694:aload_0         
	//  289  695:invokespecial   #284 <Method void DeveloperActivity_$2(DeveloperActivity_)>
	//  290  698:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(A != null)
	//* 291  701:aload_0         
	//* 292  702:getfield        #233 <Field CustomButton A>
	//* 293  705:ifnull          723
			A.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.C();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.C()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  294  708:aload_0         
	//  295  709:getfield        #233 <Field CustomButton A>
	//  296  712:new             #54  <Class DeveloperActivity_$3>
	//  297  715:dup             
	//  298  716:aload_0         
	//  299  717:invokespecial   #285 <Method void DeveloperActivity_$3(DeveloperActivity_)>
	//  300  720:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view3 != null)
	//* 301  723:aload           5
	//* 302  725:ifnull          741
			view3.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.D();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.D()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  303  728:aload           5
	//  304  730:new             #58  <Class DeveloperActivity_$4>
	//  305  733:dup             
	//  306  734:aload_0         
	//  307  735:invokespecial   #286 <Method void DeveloperActivity_$4(DeveloperActivity_)>
	//  308  738:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(view4 != null)
	//* 309  741:aload           6
	//* 310  743:ifnull          759
			view4.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.F();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.F()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  311  746:aload           6
	//  312  748:new             #60  <Class DeveloperActivity_$5>
	//  313  751:dup             
	//  314  752:aload_0         
	//  315  753:invokespecial   #287 <Method void DeveloperActivity_$5(DeveloperActivity_)>
	//  316  756:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(y != null)
	//* 317  759:aload_0         
	//* 318  760:getfield        #225 <Field CustomButton y>
	//* 319  763:ifnull          781
			y.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.G();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.G()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  320  766:aload_0         
	//  321  767:getfield        #225 <Field CustomButton y>
	//  322  770:new             #62  <Class DeveloperActivity_$6>
	//  323  773:dup             
	//  324  774:aload_0         
	//  325  775:invokespecial   #288 <Method void DeveloperActivity_$6(DeveloperActivity_)>
	//  326  778:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(B != null)
	//* 327  781:aload_0         
	//* 328  782:getfield        #237 <Field CustomButton B>
	//* 329  785:ifnull          803
			B.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.H();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.H()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  330  788:aload_0         
	//  331  789:getfield        #237 <Field CustomButton B>
	//  332  792:new             #64  <Class DeveloperActivity_$7>
	//  333  795:dup             
	//  334  796:aload_0         
	//  335  797:invokespecial   #289 <Method void DeveloperActivity_$7(DeveloperActivity_)>
	//  336  800:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view5 != null)
	//* 337  803:aload           7
	//* 338  805:ifnull          821
			view5.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.I();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.I()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  339  808:aload           7
	//  340  810:new             #66  <Class DeveloperActivity_$8>
	//  341  813:dup             
	//  342  814:aload_0         
	//  343  815:invokespecial   #290 <Method void DeveloperActivity_$8(DeveloperActivity_)>
	//  344  818:invokevirtual   #277 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(D != null)
	//* 345  821:aload_0         
	//* 346  822:getfield        #245 <Field CustomButton D>
	//* 347  825:ifnull          843
			D.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view6)
				{
					a.J();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.J()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  348  828:aload_0         
	//  349  829:getfield        #245 <Field CustomButton D>
	//  350  832:new             #68  <Class DeveloperActivity_$9>
	//  351  835:dup             
	//  352  836:aload_0         
	//  353  837:invokespecial   #291 <Method void DeveloperActivity_$9(DeveloperActivity_)>
	//  354  840:invokevirtual   #272 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(a != null)
	//* 355  843:aload_0         
	//* 356  844:getfield        #136 <Field SwitchCompat a>
	//* 357  847:ifnull          865
			((CompoundButton) (a)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.h()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  358  850:aload_0         
	//  359  851:getfield        #136 <Field SwitchCompat a>
	//  360  854:new             #12  <Class DeveloperActivity_$10>
	//  361  857:dup             
	//  362  858:aload_0         
	//  363  859:invokespecial   #292 <Method void DeveloperActivity_$10(DeveloperActivity_)>
	//  364  862:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(a1 != null)
	//* 365  865:aload_1         
	//* 366  866:ifnull          881
			((CompoundButton) (a1)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.h()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  367  869:aload_1         
	//  368  870:new             #14  <Class DeveloperActivity_$11>
	//  369  873:dup             
	//  370  874:aload_0         
	//  371  875:invokespecial   #297 <Method void DeveloperActivity_$11(DeveloperActivity_)>
	//  372  878:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(b != null)
	//* 373  881:aload_0         
	//* 374  882:getfield        #140 <Field SwitchCompat b>
	//* 375  885:ifnull          903
			((CompoundButton) (b)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.h()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  376  888:aload_0         
	//  377  889:getfield        #140 <Field SwitchCompat b>
	//  378  892:new             #18  <Class DeveloperActivity_$13>
	//  379  895:dup             
	//  380  896:aload_0         
	//  381  897:invokespecial   #298 <Method void DeveloperActivity_$13(DeveloperActivity_)>
	//  382  900:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(c != null)
	//* 383  903:aload_0         
	//* 384  904:getfield        #144 <Field SwitchCompat c>
	//* 385  907:ifnull          925
			((CompoundButton) (c)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.h()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  386  910:aload_0         
	//  387  911:getfield        #144 <Field SwitchCompat c>
	//  388  914:new             #20  <Class DeveloperActivity_$14>
	//  389  917:dup             
	//  390  918:aload_0         
	//  391  919:invokespecial   #299 <Method void DeveloperActivity_$14(DeveloperActivity_)>
	//  392  922:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(d != null)
	//* 393  925:aload_0         
	//* 394  926:getfield        #148 <Field SwitchCompat d>
	//* 395  929:ifnull          947
			((CompoundButton) (d)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.h()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  396  932:aload_0         
	//  397  933:getfield        #148 <Field SwitchCompat d>
	//  398  936:new             #22  <Class DeveloperActivity_$15>
	//  399  939:dup             
	//  400  940:aload_0         
	//  401  941:invokespecial   #300 <Method void DeveloperActivity_$15(DeveloperActivity_)>
	//  402  944:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(e != null)
	//* 403  947:aload_0         
	//* 404  948:getfield        #152 <Field SwitchCompat e>
	//* 405  951:ifnull          969
			((CompoundButton) (e)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.i()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  406  954:aload_0         
	//  407  955:getfield        #152 <Field SwitchCompat e>
	//  408  958:new             #24  <Class DeveloperActivity_$16>
	//  409  961:dup             
	//  410  962:aload_0         
	//  411  963:invokespecial   #301 <Method void DeveloperActivity_$16(DeveloperActivity_)>
	//  412  966:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(f != null)
	//* 413  969:aload_0         
	//* 414  970:getfield        #156 <Field SwitchCompat f>
	//* 415  973:ifnull          991
			((CompoundButton) (f)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.j()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  416  976:aload_0         
	//  417  977:getfield        #156 <Field SwitchCompat f>
	//  418  980:new             #26  <Class DeveloperActivity_$17>
	//  419  983:dup             
	//  420  984:aload_0         
	//  421  985:invokespecial   #302 <Method void DeveloperActivity_$17(DeveloperActivity_)>
	//  422  988:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(i != null)
	//* 423  991:aload_0         
	//* 424  992:getfield        #168 <Field SwitchCompat i>
	//* 425  995:ifnull          1013
			((CompoundButton) (i)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.DeveloperActivity_.k()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  426  998:aload_0         
	//  427  999:getfield        #168 <Field SwitchCompat i>
	//  428 1002:new             #28  <Class DeveloperActivity_$18>
	//  429 1005:dup             
	//  430 1006:aload_0         
	//  431 1007:invokespecial   #303 <Method void DeveloperActivity_$18(DeveloperActivity_)>
	//  432 1010:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(g != null)
	//* 433 1013:aload_0         
	//* 434 1014:getfield        #160 <Field SwitchCompat g>
	//* 435 1017:ifnull          1035
			((CompoundButton) (g)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.l()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  436 1020:aload_0         
	//  437 1021:getfield        #160 <Field SwitchCompat g>
	//  438 1024:new             #30  <Class DeveloperActivity_$19>
	//  439 1027:dup             
	//  440 1028:aload_0         
	//  441 1029:invokespecial   #304 <Method void DeveloperActivity_$19(DeveloperActivity_)>
	//  442 1032:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(h != null)
	//* 443 1035:aload_0         
	//* 444 1036:getfield        #164 <Field SwitchCompat h>
	//* 445 1039:ifnull          1057
			((CompoundButton) (h)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.m()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  446 1042:aload_0         
	//  447 1043:getfield        #164 <Field SwitchCompat h>
	//  448 1046:new             #34  <Class DeveloperActivity_$20>
	//  449 1049:dup             
	//  450 1050:aload_0         
	//  451 1051:invokespecial   #305 <Method void DeveloperActivity_$20(DeveloperActivity_)>
	//  452 1054:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(j != null)
	//* 453 1057:aload_0         
	//* 454 1058:getfield        #172 <Field SwitchCompat j>
	//* 455 1061:ifnull          1079
			((CompoundButton) (j)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.n()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  456 1064:aload_0         
	//  457 1065:getfield        #172 <Field SwitchCompat j>
	//  458 1068:new             #36  <Class DeveloperActivity_$21>
	//  459 1071:dup             
	//  460 1072:aload_0         
	//  461 1073:invokespecial   #306 <Method void DeveloperActivity_$21(DeveloperActivity_)>
	//  462 1076:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(k != null)
	//* 463 1079:aload_0         
	//* 464 1080:getfield        #176 <Field SwitchCompat k>
	//* 465 1083:ifnull          1101
			((CompoundButton) (k)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

				public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field DeveloperActivity_ a>
				//    2    4:invokevirtual   #25  <Method void DeveloperActivity_.o()>
				//    3    7:return          
				}

				final DeveloperActivity_ a;

			
			{
				a = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DeveloperActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  466 1086:aload_0         
	//  467 1087:getfield        #176 <Field SwitchCompat k>
	//  468 1090:new             #38  <Class DeveloperActivity_$22>
	//  469 1093:dup             
	//  470 1094:aload_0         
	//  471 1095:invokespecial   #307 <Method void DeveloperActivity_$22(DeveloperActivity_)>
	//  472 1098:invokevirtual   #296 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		e();
	//  473 1101:aload_0         
	//  474 1102:invokevirtual   #309 <Method void e()>
	//  475 1105:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.DeveloperActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field DeveloperActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.DeveloperActivity_.a(DeveloperActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final DeveloperActivity_ b;

			
			{
				b = DeveloperActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DeveloperActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc2            #311 <String "">
	//    1    3:new             #42  <Class DeveloperActivity_$24>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #313 <Method void DeveloperActivity_$24(DeveloperActivity_, boolean)>
	//    6   12:lconst_0        
	//    7   13:invokestatic    #318 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(K);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field c K>
	//    2    4:invokestatic    #322 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #324 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #326 <Method void DeveloperActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #322 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b003d);
	//   13   23:aload_0         
	//   14   24:ldc2            #327 <Int 0x7f0b003d>
	//   15   27:invokevirtual   #331 <Method void setContentView(int)>
	//   16   30:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #332 <Method void DeveloperActivity.setContentView(int)>
		K.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field c K>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #334 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #337 <Method void DeveloperActivity.setContentView(View)>
		K.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field c K>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #334 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #340 <Method void DeveloperActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		K.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #82  <Field c K>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #334 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c K = new c();
}
