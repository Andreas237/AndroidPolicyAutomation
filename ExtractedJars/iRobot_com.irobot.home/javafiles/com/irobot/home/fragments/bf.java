// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.home.util.k;
import com.irobot.home.view.BatteryGaugeView;
import com.irobot.home.view.CircleButton;
import com.irobot.home.view.CircleRippleButton;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomSquaredImageButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.HideableView;
import com.irobot.home.view.PercentageRingView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			be

public final class bf extends be
	implements a, b
{

	public bf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void be()>
	//    2    4:aload_0         
	//    3    5:new             #58  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #59  <Method void c()>
	//    6   12:putfield        #61  <Field c aL>
		aN = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #63  <Field boolean aN>
	//   10   20:return          
	}

	private void a(Bundle bundle)
	{
		g = new k(((android.content.Context) (getActivity())));
	//    0    0:aload_0         
	//    1    1:new             #68  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #72  <Method android.app.Activity getActivity()>
	//    5    9:invokespecial   #75  <Method void k(android.content.Context)>
	//    6   12:putfield        #79  <Field k g>
		org.androidannotations.api.c.c.a(((b) (this)));
	//    7   15:aload_0         
	//    8   16:invokestatic    #82  <Method void c.a(b)>
	//    9   19:return          
	}

	static void a(bf bf1)
	{
		((be) (bf1)).com.irobot.home.fragments.be.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void com.irobot.home.fragments.be.c()>
	//    2    4:return          
	}

	static void a(bf bf1, String s)
	{
		((be) (bf1)).be.e(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method void be.e(String)>
	//    3    5:return          
	}

	public View a(int i)
	{
		if(aM == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field View aM>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return aM.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #94  <Field View aM>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #99  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(a a1)
	{
		h = (LinearLayout)a1.a(0x7f0901d3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #103 <Int 0x7f0901d3>
	//    3    4:invokeinterface #105 <Method View a.a(int)>
	//    4    9:checkcast       #107 <Class LinearLayout>
	//    5   12:putfield        #111 <Field LinearLayout h>
		i = (LinearLayout)a1.a(0x7f090450);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #112 <Int 0x7f090450>
	//    9   19:invokeinterface #105 <Method View a.a(int)>
	//   10   24:checkcast       #107 <Class LinearLayout>
	//   11   27:putfield        #115 <Field LinearLayout i>
		j = (TextView)a1.a(0x7f090351);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #116 <Int 0x7f090351>
	//   15   34:invokeinterface #105 <Method View a.a(int)>
	//   16   39:checkcast       #118 <Class TextView>
	//   17   42:putfield        #122 <Field TextView j>
		k = (TextView)a1.a(0x7f09017d);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #123 <Int 0x7f09017d>
	//   21   49:invokeinterface #105 <Method View a.a(int)>
	//   22   54:checkcast       #118 <Class TextView>
	//   23   57:putfield        #126 <Field TextView k>
		l = (CustomSquaredImageButton)a1.a(0x7f0900d3);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #127 <Int 0x7f0900d3>
	//   27   64:invokeinterface #105 <Method View a.a(int)>
	//   28   69:checkcast       #129 <Class CustomSquaredImageButton>
	//   29   72:putfield        #133 <Field CustomSquaredImageButton l>
		n = (CircleRippleButton)a1.a(0x7f0900d6);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #134 <Int 0x7f0900d6>
	//   33   79:invokeinterface #105 <Method View a.a(int)>
	//   34   84:checkcast       #136 <Class CircleRippleButton>
	//   35   87:putfield        #140 <Field CircleRippleButton n>
		o = (TextView)a1.a(0x7f090111);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #141 <Int 0x7f090111>
	//   39   94:invokeinterface #105 <Method View a.a(int)>
	//   40   99:checkcast       #118 <Class TextView>
	//   41  102:putfield        #144 <Field TextView o>
		p = (TextView)a1.a(0x7f0903f0);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #145 <Int 0x7f0903f0>
	//   45  109:invokeinterface #105 <Method View a.a(int)>
	//   46  114:checkcast       #118 <Class TextView>
	//   47  117:putfield        #148 <Field TextView p>
		q = (ImageView)a1.a(0x7f09004a);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #149 <Int 0x7f09004a>
	//   51  124:invokeinterface #105 <Method View a.a(int)>
	//   52  129:checkcast       #151 <Class ImageView>
	//   53  132:putfield        #155 <Field ImageView q>
		r = (ImageView)a1.a(0x7f09034f);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #156 <Int 0x7f09034f>
	//   57  139:invokeinterface #105 <Method View a.a(int)>
	//   58  144:checkcast       #151 <Class ImageView>
	//   59  147:putfield        #159 <Field ImageView r>
		s = (TextView)a1.a(0x7f0901c3);
	//   60  150:aload_0         
	//   61  151:aload_1         
	//   62  152:ldc1            #160 <Int 0x7f0901c3>
	//   63  154:invokeinterface #105 <Method View a.a(int)>
	//   64  159:checkcast       #118 <Class TextView>
	//   65  162:putfield        #163 <Field TextView s>
		t = (TextView)a1.a(0x7f09026e);
	//   66  165:aload_0         
	//   67  166:aload_1         
	//   68  167:ldc1            #164 <Int 0x7f09026e>
	//   69  169:invokeinterface #105 <Method View a.a(int)>
	//   70  174:checkcast       #118 <Class TextView>
	//   71  177:putfield        #167 <Field TextView t>
		u = (TextView)a1.a(0x7f090380);
	//   72  180:aload_0         
	//   73  181:aload_1         
	//   74  182:ldc1            #168 <Int 0x7f090380>
	//   75  184:invokeinterface #105 <Method View a.a(int)>
	//   76  189:checkcast       #118 <Class TextView>
	//   77  192:putfield        #171 <Field TextView u>
		v = (TextView)a1.a(0x7f0900de);
	//   78  195:aload_0         
	//   79  196:aload_1         
	//   80  197:ldc1            #172 <Int 0x7f0900de>
	//   81  199:invokeinterface #105 <Method View a.a(int)>
	//   82  204:checkcast       #118 <Class TextView>
	//   83  207:putfield        #175 <Field TextView v>
		w = (TextView)a1.a(0x7f090248);
	//   84  210:aload_0         
	//   85  211:aload_1         
	//   86  212:ldc1            #176 <Int 0x7f090248>
	//   87  214:invokeinterface #105 <Method View a.a(int)>
	//   88  219:checkcast       #118 <Class TextView>
	//   89  222:putfield        #179 <Field TextView w>
		x = (TextView)a1.a(0x7f0900b2);
	//   90  225:aload_0         
	//   91  226:aload_1         
	//   92  227:ldc1            #180 <Int 0x7f0900b2>
	//   93  229:invokeinterface #105 <Method View a.a(int)>
	//   94  234:checkcast       #118 <Class TextView>
	//   95  237:putfield        #183 <Field TextView x>
		y = (RelativeLayout)a1.a(0x7f0900d4);
	//   96  240:aload_0         
	//   97  241:aload_1         
	//   98  242:ldc1            #184 <Int 0x7f0900d4>
	//   99  244:invokeinterface #105 <Method View a.a(int)>
	//  100  249:checkcast       #186 <Class RelativeLayout>
	//  101  252:putfield        #190 <Field RelativeLayout y>
		z = (CustomButton)a1.a(0x7f090233);
	//  102  255:aload_0         
	//  103  256:aload_1         
	//  104  257:ldc1            #191 <Int 0x7f090233>
	//  105  259:invokeinterface #105 <Method View a.a(int)>
	//  106  264:checkcast       #193 <Class CustomButton>
	//  107  267:putfield        #197 <Field CustomButton z>
		A = (RelativeLayout)a1.a(0x7f090350);
	//  108  270:aload_0         
	//  109  271:aload_1         
	//  110  272:ldc1            #198 <Int 0x7f090350>
	//  111  274:invokeinterface #105 <Method View a.a(int)>
	//  112  279:checkcast       #186 <Class RelativeLayout>
	//  113  282:putfield        #201 <Field RelativeLayout A>
		B = (LinearLayout)a1.a(0x7f090352);
	//  114  285:aload_0         
	//  115  286:aload_1         
	//  116  287:ldc1            #202 <Int 0x7f090352>
	//  117  289:invokeinterface #105 <Method View a.a(int)>
	//  118  294:checkcast       #107 <Class LinearLayout>
	//  119  297:putfield        #205 <Field LinearLayout B>
		F = (LinearLayout)a1.a(0x7f090135);
	//  120  300:aload_0         
	//  121  301:aload_1         
	//  122  302:ldc1            #206 <Int 0x7f090135>
	//  123  304:invokeinterface #105 <Method View a.a(int)>
	//  124  309:checkcast       #107 <Class LinearLayout>
	//  125  312:putfield        #209 <Field LinearLayout F>
		G = a1.a(0x7f090225);
	//  126  315:aload_0         
	//  127  316:aload_1         
	//  128  317:ldc1            #210 <Int 0x7f090225>
	//  129  319:invokeinterface #105 <Method View a.a(int)>
	//  130  324:putfield        #213 <Field View G>
		H = a1.a(0x7f09032e);
	//  131  327:aload_0         
	//  132  328:aload_1         
	//  133  329:ldc1            #214 <Int 0x7f09032e>
	//  134  331:invokeinterface #105 <Method View a.a(int)>
	//  135  336:putfield        #217 <Field View H>
		I = (CustomTextView)a1.a(0x7f090132);
	//  136  339:aload_0         
	//  137  340:aload_1         
	//  138  341:ldc1            #218 <Int 0x7f090132>
	//  139  343:invokeinterface #105 <Method View a.a(int)>
	//  140  348:checkcast       #220 <Class CustomTextView>
	//  141  351:putfield        #224 <Field CustomTextView I>
		J = (CustomTextView)a1.a(0x7f090134);
	//  142  354:aload_0         
	//  143  355:aload_1         
	//  144  356:ldc1            #225 <Int 0x7f090134>
	//  145  358:invokeinterface #105 <Method View a.a(int)>
	//  146  363:checkcast       #220 <Class CustomTextView>
	//  147  366:putfield        #228 <Field CustomTextView J>
		K = (CustomTextView)a1.a(0x7f090131);
	//  148  369:aload_0         
	//  149  370:aload_1         
	//  150  371:ldc1            #229 <Int 0x7f090131>
	//  151  373:invokeinterface #105 <Method View a.a(int)>
	//  152  378:checkcast       #220 <Class CustomTextView>
	//  153  381:putfield        #232 <Field CustomTextView K>
		L = (CustomTextView)a1.a(0x7f090141);
	//  154  384:aload_0         
	//  155  385:aload_1         
	//  156  386:ldc1            #233 <Int 0x7f090141>
	//  157  388:invokeinterface #105 <Method View a.a(int)>
	//  158  393:checkcast       #220 <Class CustomTextView>
	//  159  396:putfield        #236 <Field CustomTextView L>
		M = (LinearLayout)a1.a(0x7f0900c8);
	//  160  399:aload_0         
	//  161  400:aload_1         
	//  162  401:ldc1            #237 <Int 0x7f0900c8>
	//  163  403:invokeinterface #105 <Method View a.a(int)>
	//  164  408:checkcast       #107 <Class LinearLayout>
	//  165  411:putfield        #240 <Field LinearLayout M>
		N = (CustomTextView)a1.a(0x7f0900cc);
	//  166  414:aload_0         
	//  167  415:aload_1         
	//  168  416:ldc1            #241 <Int 0x7f0900cc>
	//  169  418:invokeinterface #105 <Method View a.a(int)>
	//  170  423:checkcast       #220 <Class CustomTextView>
	//  171  426:putfield        #244 <Field CustomTextView N>
		O = (CircleButton)a1.a(0x7f0900c6);
	//  172  429:aload_0         
	//  173  430:aload_1         
	//  174  431:ldc1            #245 <Int 0x7f0900c6>
	//  175  433:invokeinterface #105 <Method View a.a(int)>
	//  176  438:checkcast       #247 <Class CircleButton>
	//  177  441:putfield        #251 <Field CircleButton O>
		P = (LinearLayout)a1.a(0x7f0900d0);
	//  178  444:aload_0         
	//  179  445:aload_1         
	//  180  446:ldc1            #252 <Int 0x7f0900d0>
	//  181  448:invokeinterface #105 <Method View a.a(int)>
	//  182  453:checkcast       #107 <Class LinearLayout>
	//  183  456:putfield        #255 <Field LinearLayout P>
		Q = (CircleButton)a1.a(0x7f0900cf);
	//  184  459:aload_0         
	//  185  460:aload_1         
	//  186  461:ldc2            #256 <Int 0x7f0900cf>
	//  187  464:invokeinterface #105 <Method View a.a(int)>
	//  188  469:checkcast       #247 <Class CircleButton>
	//  189  472:putfield        #259 <Field CircleButton Q>
		R = (CustomTextView)a1.a(0x7f0900d1);
	//  190  475:aload_0         
	//  191  476:aload_1         
	//  192  477:ldc2            #260 <Int 0x7f0900d1>
	//  193  480:invokeinterface #105 <Method View a.a(int)>
	//  194  485:checkcast       #220 <Class CustomTextView>
	//  195  488:putfield        #263 <Field CustomTextView R>
		S = (CircleButton)a1.a(0x7f0900af);
	//  196  491:aload_0         
	//  197  492:aload_1         
	//  198  493:ldc2            #264 <Int 0x7f0900af>
	//  199  496:invokeinterface #105 <Method View a.a(int)>
	//  200  501:checkcast       #247 <Class CircleButton>
	//  201  504:putfield        #267 <Field CircleButton S>
		T = (PercentageRingView)a1.a(0x7f09020e);
	//  202  507:aload_0         
	//  203  508:aload_1         
	//  204  509:ldc2            #268 <Int 0x7f09020e>
	//  205  512:invokeinterface #105 <Method View a.a(int)>
	//  206  517:checkcast       #270 <Class PercentageRingView>
	//  207  520:putfield        #274 <Field PercentageRingView T>
		U = (CustomTextView)a1.a(0x7f09020d);
	//  208  523:aload_0         
	//  209  524:aload_1         
	//  210  525:ldc2            #275 <Int 0x7f09020d>
	//  211  528:invokeinterface #105 <Method View a.a(int)>
	//  212  533:checkcast       #220 <Class CustomTextView>
	//  213  536:putfield        #278 <Field CustomTextView U>
		V = (LinearLayout)a1.a(0x7f09020c);
	//  214  539:aload_0         
	//  215  540:aload_1         
	//  216  541:ldc2            #279 <Int 0x7f09020c>
	//  217  544:invokeinterface #105 <Method View a.a(int)>
	//  218  549:checkcast       #107 <Class LinearLayout>
	//  219  552:putfield        #282 <Field LinearLayout V>
		W = (HideableView)a1.a(0x7f09020b);
	//  220  555:aload_0         
	//  221  556:aload_1         
	//  222  557:ldc2            #283 <Int 0x7f09020b>
	//  223  560:invokeinterface #105 <Method View a.a(int)>
	//  224  565:checkcast       #285 <Class HideableView>
	//  225  568:putfield        #289 <Field HideableView W>
		X = (HideableView)a1.a(0x7f0900c7);
	//  226  571:aload_0         
	//  227  572:aload_1         
	//  228  573:ldc2            #290 <Int 0x7f0900c7>
	//  229  576:invokeinterface #105 <Method View a.a(int)>
	//  230  581:checkcast       #285 <Class HideableView>
	//  231  584:putfield        #293 <Field HideableView X>
		Y = (RelativeLayout)a1.a(0x7f0900ca);
	//  232  587:aload_0         
	//  233  588:aload_1         
	//  234  589:ldc2            #294 <Int 0x7f0900ca>
	//  235  592:invokeinterface #105 <Method View a.a(int)>
	//  236  597:checkcast       #186 <Class RelativeLayout>
	//  237  600:putfield        #297 <Field RelativeLayout Y>
		Z = (HideableView)a1.a(0x7f0900cb);
	//  238  603:aload_0         
	//  239  604:aload_1         
	//  240  605:ldc2            #298 <Int 0x7f0900cb>
	//  241  608:invokeinterface #105 <Method View a.a(int)>
	//  242  613:checkcast       #285 <Class HideableView>
	//  243  616:putfield        #300 <Field HideableView Z>
		aa = (ImageView)a1.a(0x7f0900c9);
	//  244  619:aload_0         
	//  245  620:aload_1         
	//  246  621:ldc2            #301 <Int 0x7f0900c9>
	//  247  624:invokeinterface #105 <Method View a.a(int)>
	//  248  629:checkcast       #151 <Class ImageView>
	//  249  632:putfield        #304 <Field ImageView aa>
		ab = (ProgressBar)a1.a(0x7f0900ff);
	//  250  635:aload_0         
	//  251  636:aload_1         
	//  252  637:ldc2            #305 <Int 0x7f0900ff>
	//  253  640:invokeinterface #105 <Method View a.a(int)>
	//  254  645:checkcast       #307 <Class ProgressBar>
	//  255  648:putfield        #311 <Field ProgressBar ab>
		ac = (ImageView)a1.a(0x7f090100);
	//  256  651:aload_0         
	//  257  652:aload_1         
	//  258  653:ldc2            #312 <Int 0x7f090100>
	//  259  656:invokeinterface #105 <Method View a.a(int)>
	//  260  661:checkcast       #151 <Class ImageView>
	//  261  664:putfield        #315 <Field ImageView ac>
		ad = (BatteryGaugeView)a1.a(0x7f090062);
	//  262  667:aload_0         
	//  263  668:aload_1         
	//  264  669:ldc2            #316 <Int 0x7f090062>
	//  265  672:invokeinterface #105 <Method View a.a(int)>
	//  266  677:checkcast       #318 <Class BatteryGaugeView>
	//  267  680:putfield        #322 <Field BatteryGaugeView ad>
		if(s != null)
	//* 268  683:aload_0         
	//* 269  684:getfield        #163 <Field TextView s>
	//* 270  687:ifnull          705
			s.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.d();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.d()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  271  690:aload_0         
	//  272  691:getfield        #163 <Field TextView s>
	//  273  694:new             #10  <Class bf$1>
	//  274  697:dup             
	//  275  698:aload_0         
	//  276  699:invokespecial   #324 <Method void bf$1(bf)>
	//  277  702:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(v != null)
	//* 278  705:aload_0         
	//* 279  706:getfield        #175 <Field TextView v>
	//* 280  709:ifnull          727
			v.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.e()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  281  712:aload_0         
	//  282  713:getfield        #175 <Field TextView v>
	//  283  716:new             #16  <Class bf$12>
	//  284  719:dup             
	//  285  720:aload_0         
	//  286  721:invokespecial   #329 <Method void bf$12(bf)>
	//  287  724:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(u != null)
	//* 288  727:aload_0         
	//* 289  728:getfield        #171 <Field TextView u>
	//* 290  731:ifnull          749
			u.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.f()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  291  734:aload_0         
	//  292  735:getfield        #171 <Field TextView u>
	//  293  738:new             #18  <Class bf$13>
	//  294  741:dup             
	//  295  742:aload_0         
	//  296  743:invokespecial   #330 <Method void bf$13(bf)>
	//  297  746:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(x != null)
	//* 298  749:aload_0         
	//* 299  750:getfield        #183 <Field TextView x>
	//* 300  753:ifnull          771
			x.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.g()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  301  756:aload_0         
	//  302  757:getfield        #183 <Field TextView x>
	//  303  760:new             #20  <Class bf$14>
	//  304  763:dup             
	//  305  764:aload_0         
	//  306  765:invokespecial   #331 <Method void bf$14(bf)>
	//  307  768:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(w != null)
	//* 308  771:aload_0         
	//* 309  772:getfield        #179 <Field TextView w>
	//* 310  775:ifnull          793
			w.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.h()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  311  778:aload_0         
	//  312  779:getfield        #179 <Field TextView w>
	//  313  782:new             #22  <Class bf$15>
	//  314  785:dup             
	//  315  786:aload_0         
	//  316  787:invokespecial   #332 <Method void bf$15(bf)>
	//  317  790:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(t != null)
	//* 318  793:aload_0         
	//* 319  794:getfield        #167 <Field TextView t>
	//* 320  797:ifnull          815
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.i()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  321  800:aload_0         
	//  322  801:getfield        #167 <Field TextView t>
	//  323  804:new             #24  <Class bf$16>
	//  324  807:dup             
	//  325  808:aload_0         
	//  326  809:invokespecial   #333 <Method void bf$16(bf)>
	//  327  812:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(l != null)
	//* 328  815:aload_0         
	//* 329  816:getfield        #133 <Field CustomSquaredImageButton l>
	//* 330  819:ifnull          837
			l.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.j()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  331  822:aload_0         
	//  332  823:getfield        #133 <Field CustomSquaredImageButton l>
	//  333  826:new             #26  <Class bf$17>
	//  334  829:dup             
	//  335  830:aload_0         
	//  336  831:invokespecial   #334 <Method void bf$17(bf)>
	//  337  834:invokevirtual   #335 <Method void CustomSquaredImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(Q != null)
	//* 338  837:aload_0         
	//* 339  838:getfield        #259 <Field CircleButton Q>
	//* 340  841:ifnull          859
			Q.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.bf.k()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  341  844:aload_0         
	//  342  845:getfield        #259 <Field CircleButton Q>
	//  343  848:new             #28  <Class bf$18>
	//  344  851:dup             
	//  345  852:aload_0         
	//  346  853:invokespecial   #336 <Method void bf$18(bf)>
	//  347  856:invokevirtual   #337 <Method void CircleButton.setOnClickListener(android.view.View$OnClickListener)>
		if(O != null)
	//* 348  859:aload_0         
	//* 349  860:getfield        #251 <Field CircleButton O>
	//* 350  863:ifnull          881
			O.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.l()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  351  866:aload_0         
	//  352  867:getfield        #251 <Field CircleButton O>
	//  353  870:new             #30  <Class bf$19>
	//  354  873:dup             
	//  355  874:aload_0         
	//  356  875:invokespecial   #338 <Method void bf$19(bf)>
	//  357  878:invokevirtual   #337 <Method void CircleButton.setOnClickListener(android.view.View$OnClickListener)>
		if(T != null)
	//* 358  881:aload_0         
	//* 359  882:getfield        #274 <Field PercentageRingView T>
	//* 360  885:ifnull          903
			T.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.m()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  361  888:aload_0         
	//  362  889:getfield        #274 <Field PercentageRingView T>
	//  363  892:new             #32  <Class bf$2>
	//  364  895:dup             
	//  365  896:aload_0         
	//  366  897:invokespecial   #339 <Method void bf$2(bf)>
	//  367  900:invokevirtual   #340 <Method void PercentageRingView.setOnClickListener(android.view.View$OnClickListener)>
		if(S != null)
	//* 368  903:aload_0         
	//* 369  904:getfield        #267 <Field CircleButton S>
	//* 370  907:ifnull          925
			S.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.n()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  371  910:aload_0         
	//  372  911:getfield        #267 <Field CircleButton S>
	//  373  914:new             #34  <Class bf$3>
	//  374  917:dup             
	//  375  918:aload_0         
	//  376  919:invokespecial   #341 <Method void bf$3(bf)>
	//  377  922:invokevirtual   #337 <Method void CircleButton.setOnClickListener(android.view.View$OnClickListener)>
		if(n != null)
	//* 378  925:aload_0         
	//* 379  926:getfield        #140 <Field CircleRippleButton n>
	//* 380  929:ifnull          947
			n.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.o()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  381  932:aload_0         
	//  382  933:getfield        #140 <Field CircleRippleButton n>
	//  383  936:new             #36  <Class bf$4>
	//  384  939:dup             
	//  385  940:aload_0         
	//  386  941:invokespecial   #342 <Method void bf$4(bf)>
	//  387  944:invokevirtual   #343 <Method void CircleRippleButton.setOnClickListener(android.view.View$OnClickListener)>
		if(r != null)
	//* 388  947:aload_0         
	//* 389  948:getfield        #159 <Field ImageView r>
	//* 390  951:ifnull          969
			r.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.p();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.p()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  391  954:aload_0         
	//  392  955:getfield        #159 <Field ImageView r>
	//  393  958:new             #38  <Class bf$5>
	//  394  961:dup             
	//  395  962:aload_0         
	//  396  963:invokespecial   #344 <Method void bf$5(bf)>
	//  397  966:invokevirtual   #345 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(p != null)
	//* 398  969:aload_0         
	//* 399  970:getfield        #148 <Field TextView p>
	//* 400  973:ifnull          991
			p.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.q();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.q()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  401  976:aload_0         
	//  402  977:getfield        #148 <Field TextView p>
	//  403  980:new             #40  <Class bf$6>
	//  404  983:dup             
	//  405  984:aload_0         
	//  406  985:invokespecial   #346 <Method void bf$6(bf)>
	//  407  988:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(q != null)
	//* 408  991:aload_0         
	//* 409  992:getfield        #155 <Field ImageView q>
	//* 410  995:ifnull          1013
			q.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.r();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.r()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  411  998:aload_0         
	//  412  999:getfield        #155 <Field ImageView q>
	//  413 1002:new             #42  <Class bf$7>
	//  414 1005:dup             
	//  415 1006:aload_0         
	//  416 1007:invokespecial   #347 <Method void bf$7(bf)>
	//  417 1010:invokevirtual   #345 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//* 418 1013:aload_0         
	//* 419 1014:getfield        #144 <Field TextView o>
	//* 420 1017:ifnull          1035
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.v();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.v()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  421 1020:aload_0         
	//  422 1021:getfield        #144 <Field TextView o>
	//  423 1024:new             #44  <Class bf$8>
	//  424 1027:dup             
	//  425 1028:aload_0         
	//  426 1029:invokespecial   #348 <Method void bf$8(bf)>
	//  427 1032:invokevirtual   #328 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(ac != null)
	//* 428 1035:aload_0         
	//* 429 1036:getfield        #315 <Field ImageView ac>
	//* 430 1039:ifnull          1057
			ac.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.G();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.G()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  431 1042:aload_0         
	//  432 1043:getfield        #315 <Field ImageView ac>
	//  433 1046:new             #46  <Class bf$9>
	//  434 1049:dup             
	//  435 1050:aload_0         
	//  436 1051:invokespecial   #349 <Method void bf$9(bf)>
	//  437 1054:invokevirtual   #345 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		if(z != null)
	//* 438 1057:aload_0         
	//* 439 1058:getfield        #197 <Field CustomButton z>
	//* 440 1061:ifnull          1079
			z.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.J();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bf a>
				//    2    4:invokevirtual   #25  <Method void bf.J()>
				//    3    7:return          
				}

				final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bf a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  441 1064:aload_0         
	//  442 1065:getfield        #197 <Field CustomButton z>
	//  443 1068:new             #12  <Class bf$10>
	//  444 1071:dup             
	//  445 1072:aload_0         
	//  446 1073:invokespecial   #350 <Method void bf$10(bf)>
	//  447 1076:invokevirtual   #351 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		y();
	//  448 1079:aload_0         
	//  449 1080:invokevirtual   #353 <Method void y()>
	//  450 1083:return          
	}

	public void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.bf.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field bf a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.bf.a(bf)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final bf a;

			
			{
				a = bf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field bf a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #14  <Class bf$11>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #355 <String "">
	//    4    8:lconst_0        
	//    5    9:ldc2            #355 <String "">
	//    6   12:invokespecial   #358 <Method void bf$11(bf, String, long, String)>
	//    7   15:invokestatic    #363 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   18:return          
	}

	protected void e(String s)
	{
		if(!aN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean aN>
	//*   2    4:ifne            12
			a(this, s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #365 <Method void a(bf, String)>
	//    6   12:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(aL);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field c aL>
	//    2    4:invokestatic    #369 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #371 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #373 <Method void be.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #369 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		aM = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #377 <Method View be.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #94  <Field View aM>
		if(aM == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #94  <Field View aM>
	//*   9   15:ifnonnull       31
			aM = layoutinflater.inflate(0x7f0b00ca, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc2            #378 <Int 0x7f0b00ca>
	//   13   23:aload_2         
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #384 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   28:putfield        #94  <Field View aM>
		aN = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #63  <Field boolean aN>
		return aM;
	//   20   36:aload_0         
	//   21   37:getfield        #94  <Field View aM>
	//   22   40:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #387 <Method void be.onDestroyView()>
		aM = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #94  <Field View aM>
		h = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #111 <Field LinearLayout h>
		i = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #115 <Field LinearLayout i>
		j = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #122 <Field TextView j>
		k = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #126 <Field TextView k>
		l = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #133 <Field CustomSquaredImageButton l>
		n = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #140 <Field CircleRippleButton n>
		o = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #144 <Field TextView o>
		p = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #148 <Field TextView p>
		q = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #155 <Field ImageView q>
		r = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #159 <Field ImageView r>
		s = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #163 <Field TextView s>
		t = null;
	//   38   64:aload_0         
	//   39   65:aconst_null     
	//   40   66:putfield        #167 <Field TextView t>
		u = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #171 <Field TextView u>
		v = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #175 <Field TextView v>
		w = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #179 <Field TextView w>
		x = null;
	//   50   84:aload_0         
	//   51   85:aconst_null     
	//   52   86:putfield        #183 <Field TextView x>
		y = null;
	//   53   89:aload_0         
	//   54   90:aconst_null     
	//   55   91:putfield        #190 <Field RelativeLayout y>
		z = null;
	//   56   94:aload_0         
	//   57   95:aconst_null     
	//   58   96:putfield        #197 <Field CustomButton z>
		A = null;
	//   59   99:aload_0         
	//   60  100:aconst_null     
	//   61  101:putfield        #201 <Field RelativeLayout A>
		B = null;
	//   62  104:aload_0         
	//   63  105:aconst_null     
	//   64  106:putfield        #205 <Field LinearLayout B>
		F = null;
	//   65  109:aload_0         
	//   66  110:aconst_null     
	//   67  111:putfield        #209 <Field LinearLayout F>
		G = null;
	//   68  114:aload_0         
	//   69  115:aconst_null     
	//   70  116:putfield        #213 <Field View G>
		H = null;
	//   71  119:aload_0         
	//   72  120:aconst_null     
	//   73  121:putfield        #217 <Field View H>
		I = null;
	//   74  124:aload_0         
	//   75  125:aconst_null     
	//   76  126:putfield        #224 <Field CustomTextView I>
		J = null;
	//   77  129:aload_0         
	//   78  130:aconst_null     
	//   79  131:putfield        #228 <Field CustomTextView J>
		K = null;
	//   80  134:aload_0         
	//   81  135:aconst_null     
	//   82  136:putfield        #232 <Field CustomTextView K>
		L = null;
	//   83  139:aload_0         
	//   84  140:aconst_null     
	//   85  141:putfield        #236 <Field CustomTextView L>
		M = null;
	//   86  144:aload_0         
	//   87  145:aconst_null     
	//   88  146:putfield        #240 <Field LinearLayout M>
		N = null;
	//   89  149:aload_0         
	//   90  150:aconst_null     
	//   91  151:putfield        #244 <Field CustomTextView N>
		O = null;
	//   92  154:aload_0         
	//   93  155:aconst_null     
	//   94  156:putfield        #251 <Field CircleButton O>
		P = null;
	//   95  159:aload_0         
	//   96  160:aconst_null     
	//   97  161:putfield        #255 <Field LinearLayout P>
		Q = null;
	//   98  164:aload_0         
	//   99  165:aconst_null     
	//  100  166:putfield        #259 <Field CircleButton Q>
		R = null;
	//  101  169:aload_0         
	//  102  170:aconst_null     
	//  103  171:putfield        #263 <Field CustomTextView R>
		S = null;
	//  104  174:aload_0         
	//  105  175:aconst_null     
	//  106  176:putfield        #267 <Field CircleButton S>
		T = null;
	//  107  179:aload_0         
	//  108  180:aconst_null     
	//  109  181:putfield        #274 <Field PercentageRingView T>
		U = null;
	//  110  184:aload_0         
	//  111  185:aconst_null     
	//  112  186:putfield        #278 <Field CustomTextView U>
		V = null;
	//  113  189:aload_0         
	//  114  190:aconst_null     
	//  115  191:putfield        #282 <Field LinearLayout V>
		W = null;
	//  116  194:aload_0         
	//  117  195:aconst_null     
	//  118  196:putfield        #289 <Field HideableView W>
		X = null;
	//  119  199:aload_0         
	//  120  200:aconst_null     
	//  121  201:putfield        #293 <Field HideableView X>
		Y = null;
	//  122  204:aload_0         
	//  123  205:aconst_null     
	//  124  206:putfield        #297 <Field RelativeLayout Y>
		Z = null;
	//  125  209:aload_0         
	//  126  210:aconst_null     
	//  127  211:putfield        #300 <Field HideableView Z>
		aa = null;
	//  128  214:aload_0         
	//  129  215:aconst_null     
	//  130  216:putfield        #304 <Field ImageView aa>
		ab = null;
	//  131  219:aload_0         
	//  132  220:aconst_null     
	//  133  221:putfield        #311 <Field ProgressBar ab>
		ac = null;
	//  134  224:aload_0         
	//  135  225:aconst_null     
	//  136  226:putfield        #315 <Field ImageView ac>
		ad = null;
	//  137  229:aload_0         
	//  138  230:aconst_null     
	//  139  231:putfield        #322 <Field BatteryGaugeView ad>
		aN = true;
	//  140  234:aload_0         
	//  141  235:iconst_1        
	//  142  236:putfield        #63  <Field boolean aN>
	//  143  239:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #391 <Method void be.onViewCreated(View, Bundle)>
		aL.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #61  <Field c aL>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #393 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c aL = new c();
	private View aM;
	private volatile boolean aN;
}
