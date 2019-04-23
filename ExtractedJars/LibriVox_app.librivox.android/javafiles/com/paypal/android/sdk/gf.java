// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk:
//			ga, fc

public final class gf
	implements ga
{

	public gf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a.put(((Object) (fc.a)), "Agree and Pay");
	//    2    4:getstatic       #19  <Field Map a>
	//    3    7:getstatic       #30  <Field fc fc.a>
	//    4   10:ldc1            #32  <String "Agree and Pay">
	//    5   12:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    6   17:pop             
		a.put(((Object) (fc.b)), "& other");
	//    7   18:getstatic       #19  <Field Map a>
	//    8   21:getstatic       #40  <Field fc fc.b>
	//    9   24:ldc1            #42  <String "& other">
	//   10   26:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   11   31:pop             
		a.put(((Object) (fc.c)), "Authenticating");
	//   12   32:getstatic       #19  <Field Map a>
	//   13   35:getstatic       #44  <Field fc fc.c>
	//   14   38:ldc1            #46  <String "Authenticating">
	//   15   40:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   16   45:pop             
		a.put(((Object) (fc.d)), "Back");
	//   17   46:getstatic       #19  <Field Map a>
	//   18   49:getstatic       #49  <Field fc fc.d>
	//   19   52:ldc1            #51  <String "Back">
	//   20   54:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   21   59:pop             
		a.put(((Object) (fc.e)), "Backup");
	//   22   60:getstatic       #19  <Field Map a>
	//   23   63:getstatic       #54  <Field fc fc.e>
	//   24   66:ldc1            #56  <String "Backup">
	//   25   68:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   26   73:pop             
		a.put(((Object) (fc.f)), "Cancel");
	//   27   74:getstatic       #19  <Field Map a>
	//   28   77:getstatic       #59  <Field fc fc.f>
	//   29   80:ldc1            #61  <String "Cancel">
	//   30   82:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   31   87:pop             
		a.put(((Object) (fc.g)), "American Express");
	//   32   88:getstatic       #19  <Field Map a>
	//   33   91:getstatic       #64  <Field fc fc.g>
	//   34   94:ldc1            #66  <String "American Express">
	//   35   96:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   36  101:pop             
		a.put(((Object) (fc.h)), "Carta Aura");
	//   37  102:getstatic       #19  <Field Map a>
	//   38  105:getstatic       #69  <Field fc fc.h>
	//   39  108:ldc1            #71  <String "Carta Aura">
	//   40  110:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   41  115:pop             
		a.put(((Object) (fc.i)), "Carte Aurore");
	//   42  116:getstatic       #19  <Field Map a>
	//   43  119:getstatic       #74  <Field fc fc.i>
	//   44  122:ldc1            #76  <String "Carte Aurore">
	//   45  124:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   46  129:pop             
		a.put(((Object) (fc.j)), "Carta Prepagata PayPal");
	//   47  130:getstatic       #19  <Field Map a>
	//   48  133:getstatic       #79  <Field fc fc.j>
	//   49  136:ldc1            #81  <String "Carta Prepagata PayPal">
	//   50  138:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   51  143:pop             
		a.put(((Object) (fc.k)), "Carte Bancaire");
	//   52  144:getstatic       #19  <Field Map a>
	//   53  147:getstatic       #84  <Field fc fc.k>
	//   54  150:ldc1            #86  <String "Carte Bancaire">
	//   55  152:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   56  157:pop             
		a.put(((Object) (fc.l)), "Cofinoga");
	//   57  158:getstatic       #19  <Field Map a>
	//   58  161:getstatic       #89  <Field fc fc.l>
	//   59  164:ldc1            #91  <String "Cofinoga">
	//   60  166:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   61  171:pop             
		a.put(((Object) (fc.m)), "Delta");
	//   62  172:getstatic       #19  <Field Map a>
	//   63  175:getstatic       #94  <Field fc fc.m>
	//   64  178:ldc1            #96  <String "Delta">
	//   65  180:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   66  185:pop             
		a.put(((Object) (fc.n)), "Discover");
	//   67  186:getstatic       #19  <Field Map a>
	//   68  189:getstatic       #99  <Field fc fc.n>
	//   69  192:ldc1            #101 <String "Discover">
	//   70  194:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   71  199:pop             
		a.put(((Object) (fc.o)), "Electron");
	//   72  200:getstatic       #19  <Field Map a>
	//   73  203:getstatic       #104 <Field fc fc.o>
	//   74  206:ldc1            #106 <String "Electron">
	//   75  208:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   76  213:pop             
		a.put(((Object) (fc.p)), "JCB");
	//   77  214:getstatic       #19  <Field Map a>
	//   78  217:getstatic       #109 <Field fc fc.p>
	//   79  220:ldc1            #111 <String "JCB">
	//   80  222:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   81  227:pop             
		a.put(((Object) (fc.q)), "Maestro");
	//   82  228:getstatic       #19  <Field Map a>
	//   83  231:getstatic       #114 <Field fc fc.q>
	//   84  234:ldc1            #116 <String "Maestro">
	//   85  236:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   86  241:pop             
		a.put(((Object) (fc.r)), "MasterCard");
	//   87  242:getstatic       #19  <Field Map a>
	//   88  245:getstatic       #119 <Field fc fc.r>
	//   89  248:ldc1            #121 <String "MasterCard">
	//   90  250:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   91  255:pop             
		a.put(((Object) (fc.s)), "Postepay");
	//   92  256:getstatic       #19  <Field Map a>
	//   93  259:getstatic       #124 <Field fc fc.s>
	//   94  262:ldc1            #126 <String "Postepay">
	//   95  264:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   96  269:pop             
		a.put(((Object) (fc.t)), "4 \351toiles");
	//   97  270:getstatic       #19  <Field Map a>
	//   98  273:getstatic       #129 <Field fc fc.t>
	//   99  276:ldc1            #131 <String "4 \351toiles">
	//  100  278:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  101  283:pop             
		a.put(((Object) (fc.u)), "Tarjeta Aurora");
	//  102  284:getstatic       #19  <Field Map a>
	//  103  287:getstatic       #134 <Field fc fc.u>
	//  104  290:ldc1            #136 <String "Tarjeta Aurora">
	//  105  292:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  106  297:pop             
		a.put(((Object) (fc.v)), "Visa");
	//  107  298:getstatic       #19  <Field Map a>
	//  108  301:getstatic       #139 <Field fc fc.v>
	//  109  304:ldc1            #141 <String "Visa">
	//  110  306:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  111  311:pop             
		a.put(((Object) (fc.w)), "Change Payment Method");
	//  112  312:getstatic       #19  <Field Map a>
	//  113  315:getstatic       #144 <Field fc fc.w>
	//  114  318:ldc1            #146 <String "Change Payment Method">
	//  115  320:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  116  325:pop             
		a.put(((Object) (fc.x)), "Cheque");
	//  117  326:getstatic       #19  <Field Map a>
	//  118  329:getstatic       #149 <Field fc fc.x>
	//  119  332:ldc1            #151 <String "Cheque">
	//  120  334:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  121  339:pop             
		a.put(((Object) (fc.y)), "Checking this device\u2026");
	//  122  340:getstatic       #19  <Field Map a>
	//  123  343:getstatic       #154 <Field fc fc.y>
	//  124  346:ldc1            #156 <String "Checking this device\u2026">
	//  125  348:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  126  353:pop             
		a.put(((Object) (fc.z)), "Clear card information");
	//  127  354:getstatic       #19  <Field Map a>
	//  128  357:getstatic       #159 <Field fc fc.z>
	//  129  360:ldc1            #161 <String "Clear card information">
	//  130  362:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  131  367:pop             
		a.put(((Object) (fc.A)), "Confirm");
	//  132  368:getstatic       #19  <Field Map a>
	//  133  371:getstatic       #164 <Field fc fc.A>
	//  134  374:ldc1            #166 <String "Confirm">
	//  135  376:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  136  381:pop             
		a.put(((Object) (fc.B)), "Are you sure you want to clear your card information?");
	//  137  382:getstatic       #19  <Field Map a>
	//  138  385:getstatic       #169 <Field fc fc.B>
	//  139  388:ldc1            #171 <String "Are you sure you want to clear your card information?">
	//  140  390:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  141  395:pop             
		a.put(((Object) (fc.C)), "Charge Card");
	//  142  396:getstatic       #19  <Field Map a>
	//  143  399:getstatic       #174 <Field fc fc.C>
	//  144  402:ldc1            #176 <String "Charge Card">
	//  145  404:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  146  409:pop             
		a.put(((Object) (fc.D)), "Are you sure you want to log out of PayPal?");
	//  147  410:getstatic       #19  <Field Map a>
	//  148  413:getstatic       #179 <Field fc fc.D>
	//  149  416:ldc1            #181 <String "Are you sure you want to log out of PayPal?">
	//  150  418:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  151  423:pop             
		a.put(((Object) (fc.E)), "Pay");
	//  152  424:getstatic       #19  <Field Map a>
	//  153  427:getstatic       #184 <Field fc fc.E>
	//  154  430:ldc1            #186 <String "Pay">
	//  155  432:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  156  437:pop             
		a.put(((Object) (fc.F)), "Agree");
	//  157  438:getstatic       #19  <Field Map a>
	//  158  441:getstatic       #189 <Field fc fc.F>
	//  159  444:ldc1            #191 <String "Agree">
	//  160  446:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  161  451:pop             
		a.put(((Object) (fc.G)), "Account Creation Date");
	//  162  452:getstatic       #19  <Field Map a>
	//  163  455:getstatic       #194 <Field fc fc.G>
	//  164  458:ldc1            #196 <String "Account Creation Date">
	//  165  460:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  166  465:pop             
		a.put(((Object) (fc.H)), "Account Status");
	//  167  466:getstatic       #19  <Field Map a>
	//  168  469:getstatic       #199 <Field fc fc.H>
	//  169  472:ldc1            #201 <String "Account Status">
	//  170  474:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  171  479:pop             
		a.put(((Object) (fc.I)), "Account Type");
	//  172  480:getstatic       #19  <Field Map a>
	//  173  483:getstatic       #204 <Field fc fc.I>
	//  174  486:ldc1            #206 <String "Account Type">
	//  175  488:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  176  493:pop             
		a.put(((Object) (fc.J)), "Address");
	//  177  494:getstatic       #19  <Field Map a>
	//  178  497:getstatic       #209 <Field fc fc.J>
	//  179  500:ldc1            #211 <String "Address">
	//  180  502:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  181  507:pop             
		a.put(((Object) (fc.K)), "Age Range");
	//  182  508:getstatic       #19  <Field Map a>
	//  183  511:getstatic       #214 <Field fc fc.K>
	//  184  514:ldc1            #216 <String "Age Range">
	//  185  516:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  186  521:pop             
		a.put(((Object) (fc.L)), "Date of Birth");
	//  187  522:getstatic       #19  <Field Map a>
	//  188  525:getstatic       #219 <Field fc fc.L>
	//  189  528:ldc1            #221 <String "Date of Birth">
	//  190  530:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  191  535:pop             
		a.put(((Object) (fc.M)), "Email address");
	//  192  536:getstatic       #19  <Field Map a>
	//  193  539:getstatic       #224 <Field fc fc.M>
	//  194  542:ldc1            #226 <String "Email address">
	//  195  544:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  196  549:pop             
		a.put(((Object) (fc.N)), "Full Name");
	//  197  550:getstatic       #19  <Field Map a>
	//  198  553:getstatic       #229 <Field fc fc.N>
	//  199  556:ldc1            #231 <String "Full Name">
	//  200  558:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  201  563:pop             
		a.put(((Object) (fc.O)), "Gender");
	//  202  564:getstatic       #19  <Field Map a>
	//  203  567:getstatic       #234 <Field fc fc.O>
	//  204  570:ldc1            #236 <String "Gender">
	//  205  572:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  206  577:pop             
		a.put(((Object) (fc.P)), "Language");
	//  207  578:getstatic       #19  <Field Map a>
	//  208  581:getstatic       #239 <Field fc fc.P>
	//  209  584:ldc1            #241 <String "Language">
	//  210  586:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  211  591:pop             
		a.put(((Object) (fc.Q)), "Locale");
	//  212  592:getstatic       #19  <Field Map a>
	//  213  595:getstatic       #244 <Field fc fc.Q>
	//  214  598:ldc1            #246 <String "Locale">
	//  215  600:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  216  605:pop             
		a.put(((Object) (fc.R)), "Phone Number");
	//  217  606:getstatic       #19  <Field Map a>
	//  218  609:getstatic       #249 <Field fc fc.R>
	//  219  612:ldc1            #251 <String "Phone Number">
	//  220  614:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  221  619:pop             
		a.put(((Object) (fc.S)), "Time Zone");
	//  222  620:getstatic       #19  <Field Map a>
	//  223  623:getstatic       #254 <Field fc fc.S>
	//  224  626:ldc2            #256 <String "Time Zone">
	//  225  629:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  226  634:pop             
		a.put(((Object) (fc.T)), "Share the following: %s.");
	//  227  635:getstatic       #19  <Field Map a>
	//  228  638:getstatic       #259 <Field fc fc.T>
	//  229  641:ldc2            #261 <String "Share the following: %s.">
	//  230  644:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  231  649:pop             
		a.put(((Object) (fc.U)), "Use Seamless Checkout.");
	//  232  650:getstatic       #19  <Field Map a>
	//  233  653:getstatic       #264 <Field fc fc.U>
	//  234  656:ldc2            #266 <String "Use Seamless Checkout.">
	//  235  659:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  236  664:pop             
		a.put(((Object) (fc.V)), "%s asks that you:");
	//  237  665:getstatic       #19  <Field Map a>
	//  238  668:getstatic       #269 <Field fc fc.V>
	//  239  671:ldc2            #271 <String "%s asks that you:">
	//  240  674:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  241  679:pop             
		a.put(((Object) (fc.W)), "Share the <a href='%1$s'>payment methods</a> linked to your PayPal account.");
	//  242  680:getstatic       #19  <Field Map a>
	//  243  683:getstatic       #274 <Field fc fc.W>
	//  244  686:ldc2            #276 <String "Share the <a href='%1$s'>payment methods</a> linked to your PayPal account.">
	//  245  689:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  246  694:pop             
		a.put(((Object) (fc.X)), "Enable the display of your funding options to allow you to make a choice.");
	//  247  695:getstatic       #19  <Field Map a>
	//  248  698:getstatic       #279 <Field fc fc.X>
	//  249  701:ldc2            #281 <String "Enable the display of your funding options to allow you to make a choice.">
	//  250  704:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  251  709:pop             
		a.put(((Object) (fc.Y)), "<a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.");
	//  252  710:getstatic       #19  <Field Map a>
	//  253  713:getstatic       #284 <Field fc fc.Y>
	//  254  716:ldc2            #286 <String "<a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.">
	//  255  719:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  256  724:pop             
		a.put(((Object) (fc.Z)), "Allow them to link and manage their loyalty card in your PayPal wallet.");
	//  257  725:getstatic       #19  <Field Map a>
	//  258  728:getstatic       #289 <Field fc fc.Z>
	//  259  731:ldc2            #291 <String "Allow them to link and manage their loyalty card in your PayPal wallet.">
	//  260  734:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  261  739:pop             
		a.put(((Object) (fc.aa)), "Agree to the %1$s <a href='%2$s'>privacy policy</a> and <a href='%3$s'>user agreement</a>.");
	//  262  740:getstatic       #19  <Field Map a>
	//  263  743:getstatic       #294 <Field fc fc.aa>
	//  264  746:ldc2            #296 <String "Agree to the %1$s <a href='%2$s'>privacy policy</a> and <a href='%3$s'>user agreement</a>.">
	//  265  749:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  266  754:pop             
		a.put(((Object) (fc.ab)), "Permit them to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  267  755:getstatic       #19  <Field Map a>
	//  268  758:getstatic       #299 <Field fc fc.ab>
	//  269  761:ldc2            #301 <String "Permit them to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  270  764:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  271  769:pop             
		a.put(((Object) (fc.ac)), "Permit them to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  272  770:getstatic       #19  <Field Map a>
	//  273  773:getstatic       #304 <Field fc fc.ac>
	//  274  776:ldc2            #306 <String "Permit them to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  275  779:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  276  784:pop             
		a.put(((Object) (fc.ad)), "Consent");
	//  277  785:getstatic       #19  <Field Map a>
	//  278  788:getstatic       #309 <Field fc fc.ad>
	//  279  791:ldc2            #311 <String "Consent">
	//  280  794:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  281  799:pop             
		a.put(((Object) (fc.ae)), "Email");
	//  282  800:getstatic       #19  <Field Map a>
	//  283  803:getstatic       #314 <Field fc fc.ae>
	//  284  806:ldc2            #316 <String "Email">
	//  285  809:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  286  814:pop             
		a.put(((Object) (fc.af)), "Mock Data");
	//  287  815:getstatic       #19  <Field Map a>
	//  288  818:getstatic       #319 <Field fc fc.af>
	//  289  821:ldc2            #321 <String "Mock Data">
	//  290  824:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  291  829:pop             
		a.put(((Object) (fc.ag)), "Sandbox");
	//  292  830:getstatic       #19  <Field Map a>
	//  293  833:getstatic       #324 <Field fc fc.ag>
	//  294  836:ldc2            #326 <String "Sandbox">
	//  295  839:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  296  844:pop             
		a.put(((Object) (fc.ah)), "Expires");
	//  297  845:getstatic       #19  <Field Map a>
	//  298  848:getstatic       #329 <Field fc fc.ah>
	//  299  851:ldc2            #331 <String "Expires">
	//  300  854:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  301  859:pop             
		a.put(((Object) (fc.ai)), "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your payment methods are available for use.</p>");
	//  302  860:getstatic       #19  <Field Map a>
	//  303  863:getstatic       #334 <Field fc fc.ai>
	//  304  866:ldc2            #336 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your payment methods are available for use.</p>">
	//  305  869:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  306  874:pop             
		a.put(((Object) (fc.aj)), "Forgotten your password?");
	//  307  875:getstatic       #19  <Field Map a>
	//  308  878:getstatic       #339 <Field fc fc.aj>
	//  309  881:ldc2            #341 <String "Forgotten your password?">
	//  310  884:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  311  889:pop             
		a.put(((Object) (fc.ak)), "From");
	//  312  890:getstatic       #19  <Field Map a>
	//  313  893:getstatic       #344 <Field fc fc.ak>
	//  314  896:ldc2            #346 <String "From">
	//  315  899:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  316  904:pop             
		a.put(((Object) (fc.al)), "How would you like to fund future payments to %1$s?");
	//  317  905:getstatic       #19  <Field Map a>
	//  318  908:getstatic       #349 <Field fc fc.al>
	//  319  911:ldc2            #351 <String "How would you like to fund future payments to %1$s?">
	//  320  914:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  321  919:pop             
		a.put(((Object) (fc.am)), "<h1><strong>Future Payment Agreement</strong></h1><p>Your default payment method will be used to pay for future PayPal payments from this merchant.</p><p>To cancel this agreement, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>The Recurring Payment section of the <a href='%s'>PayPal User Agreement</a> shall apply.</p><p>To make sure payments work with your PayPal account, this app may simulate a small test transaction, but no money will be transferred for this.</p>");
	//  322  920:getstatic       #19  <Field Map a>
	//  323  923:getstatic       #354 <Field fc fc.am>
	//  324  926:ldc2            #356 <String "<h1><strong>Future Payment Agreement</strong></h1><p>Your default payment method will be used to pay for future PayPal payments from this merchant.</p><p>To cancel this agreement, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>The Recurring Payment section of the <a href='%s'>PayPal User Agreement</a> shall apply.</p><p>To make sure payments work with your PayPal account, this app may simulate a small test transaction, but no money will be transferred for this.</p>">
	//  325  929:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  326  934:pop             
		a.put(((Object) (fc.an)), "Internal Error");
	//  327  935:getstatic       #19  <Field Map a>
	//  328  938:getstatic       #359 <Field fc fc.an>
	//  329  941:ldc2            #361 <String "Internal Error">
	//  330  944:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  331  949:pop             
		a.put(((Object) (fc.ao)), "<p>By clicking the button below, I hereby agree to the terms of the <a href='%1$s'>PayPal User Agreement</a> and declare that I am in compliance with Japanese laws and regulations, including sanctions against payments to North Korea and Iran pursuant to the <a href='%2$s'>Foreign Exchange and Foreign Trade Act</a> to complete the transaction.</p>");
	//  332  950:getstatic       #19  <Field Map a>
	//  333  953:getstatic       #364 <Field fc fc.ao>
	//  334  956:ldc2            #366 <String "<p>By clicking the button below, I hereby agree to the terms of the <a href='%1$s'>PayPal User Agreement</a> and declare that I am in compliance with Japanese laws and regulations, including sanctions against payments to North Korea and Iran pursuant to the <a href='%2$s'>Foreign Exchange and Foreign Trade Act</a> to complete the transaction.</p>">
	//  335  959:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  336  964:pop             
		a.put(((Object) (fc.ap)), "Log In");
	//  337  965:getstatic       #19  <Field Map a>
	//  338  968:getstatic       #369 <Field fc fc.ap>
	//  339  971:ldc2            #371 <String "Log In">
	//  340  974:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  341  979:pop             
		a.put(((Object) (fc.aq)), "Log In with PayPal");
	//  342  980:getstatic       #19  <Field Map a>
	//  343  983:getstatic       #374 <Field fc fc.aq>
	//  344  986:ldc2            #376 <String "Log In with PayPal">
	//  345  989:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  346  994:pop             
		a.put(((Object) (fc.ar)), "Log out");
	//  347  995:getstatic       #19  <Field Map a>
	//  348  998:getstatic       #379 <Field fc fc.ar>
	//  349 1001:ldc2            #381 <String "Log out">
	//  350 1004:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  351 1009:pop             
		a.put(((Object) (fc.as)), "Log out");
	//  352 1010:getstatic       #19  <Field Map a>
	//  353 1013:getstatic       #384 <Field fc fc.as>
	//  354 1016:ldc2            #381 <String "Log out">
	//  355 1019:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  356 1024:pop             
		a.put(((Object) (fc.at)), "OK");
	//  357 1025:getstatic       #19  <Field Map a>
	//  358 1028:getstatic       #387 <Field fc fc.at>
	//  359 1031:ldc2            #389 <String "OK">
	//  360 1034:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  361 1039:pop             
		a.put(((Object) (fc.au)), "Password");
	//  362 1040:getstatic       #19  <Field Map a>
	//  363 1043:getstatic       #392 <Field fc fc.au>
	//  364 1046:ldc2            #394 <String "Password">
	//  365 1049:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  366 1054:pop             
		a.put(((Object) (fc.av)), "Pay After Delivery");
	//  367 1055:getstatic       #19  <Field Map a>
	//  368 1058:getstatic       #397 <Field fc fc.av>
	//  369 1061:ldc2            #399 <String "Pay After Delivery">
	//  370 1064:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  371 1069:pop             
		a.put(((Object) (fc.aw)), "Pay with");
	//  372 1070:getstatic       #19  <Field Map a>
	//  373 1073:getstatic       #402 <Field fc fc.aw>
	//  374 1076:ldc2            #404 <String "Pay with">
	//  375 1079:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  376 1084:pop             
		a.put(((Object) (fc.ax)), "Pay with Card");
	//  377 1085:getstatic       #19  <Field Map a>
	//  378 1088:getstatic       #407 <Field fc fc.ax>
	//  379 1091:ldc2            #409 <String "Pay with Card">
	//  380 1094:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  381 1099:pop             
		a.put(((Object) (fc.ay)), "PayPal Balance");
	//  382 1100:getstatic       #19  <Field Map a>
	//  383 1103:getstatic       #412 <Field fc fc.ay>
	//  384 1106:ldc2            #414 <String "PayPal Balance">
	//  385 1109:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  386 1114:pop             
		a.put(((Object) (fc.az)), "PayPal Credit");
	//  387 1115:getstatic       #19  <Field Map a>
	//  388 1118:getstatic       #417 <Field fc fc.az>
	//  389 1121:ldc2            #419 <String "PayPal Credit">
	//  390 1124:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  391 1129:pop             
		a.put(((Object) (fc.aA)), "Phone");
	//  392 1130:getstatic       #19  <Field Map a>
	//  393 1133:getstatic       #422 <Field fc fc.aA>
	//  394 1136:ldc2            #424 <String "Phone">
	//  395 1139:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  396 1144:pop             
		a.put(((Object) (fc.aB)), "PIN");
	//  397 1145:getstatic       #19  <Field Map a>
	//  398 1148:getstatic       #427 <Field fc fc.aB>
	//  399 1151:ldc2            #429 <String "PIN">
	//  400 1154:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  401 1159:pop             
		a.put(((Object) (fc.aC)), "Preferred Payment Method");
	//  402 1160:getstatic       #19  <Field Map a>
	//  403 1163:getstatic       #432 <Field fc fc.aC>
	//  404 1166:ldc2            #434 <String "Preferred Payment Method">
	//  405 1169:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  406 1174:pop             
		a.put(((Object) (fc.aD)), "PayPal protects your <a href='%s'>privacy</a> and financial information.");
	//  407 1175:getstatic       #19  <Field Map a>
	//  408 1178:getstatic       #437 <Field fc fc.aD>
	//  409 1181:ldc2            #439 <String "PayPal protects your <a href='%s'>privacy</a> and financial information.">
	//  410 1184:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  411 1189:pop             
		a.put(((Object) (fc.aE)), "Processing");
	//  412 1190:getstatic       #19  <Field Map a>
	//  413 1193:getstatic       #442 <Field fc fc.aE>
	//  414 1196:ldc2            #444 <String "Processing">
	//  415 1199:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  416 1204:pop             
		a.put(((Object) (fc.aF)), "Remember card");
	//  417 1205:getstatic       #19  <Field Map a>
	//  418 1208:getstatic       #447 <Field fc fc.aF>
	//  419 1211:ldc2            #449 <String "Remember card">
	//  420 1214:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  421 1219:pop             
		a.put(((Object) (fc.aG)), "Request Money");
	//  422 1220:getstatic       #19  <Field Map a>
	//  423 1223:getstatic       #452 <Field fc fc.aG>
	//  424 1226:ldc2            #454 <String "Request Money">
	//  425 1229:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  426 1234:pop             
		a.put(((Object) (fc.aH)), "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	//  427 1235:getstatic       #19  <Field Map a>
	//  428 1238:getstatic       #457 <Field fc fc.aH>
	//  429 1241:ldc2            #459 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	//  430 1244:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  431 1249:pop             
		a.put(((Object) (fc.aI)), "Savings");
	//  432 1250:getstatic       #19  <Field Map a>
	//  433 1253:getstatic       #462 <Field fc fc.aI>
	//  434 1256:ldc2            #464 <String "Savings">
	//  435 1259:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  436 1264:pop             
		a.put(((Object) (fc.aJ)), "Send Money");
	//  437 1265:getstatic       #19  <Field Map a>
	//  438 1268:getstatic       #467 <Field fc fc.aJ>
	//  439 1271:ldc2            #469 <String "Send Money">
	//  440 1274:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  441 1279:pop             
		a.put(((Object) (fc.aK)), "There was a problem communicating with the PayPal servers. Please try again.");
	//  442 1280:getstatic       #19  <Field Map a>
	//  443 1283:getstatic       #472 <Field fc fc.aK>
	//  444 1286:ldc2            #474 <String "There was a problem communicating with the PayPal servers. Please try again.">
	//  445 1289:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  446 1294:pop             
		a.put(((Object) (fc.aL)), "Please log in to PayPal again.");
	//  447 1295:getstatic       #19  <Field Map a>
	//  448 1298:getstatic       #477 <Field fc fc.aL>
	//  449 1301:ldc2            #479 <String "Please log in to PayPal again.">
	//  450 1304:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  451 1309:pop             
		a.put(((Object) (fc.aM)), "Session expired.");
	//  452 1310:getstatic       #19  <Field Map a>
	//  453 1313:getstatic       #482 <Field fc fc.aM>
	//  454 1316:ldc2            #484 <String "Session expired.">
	//  455 1319:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  456 1324:pop             
		a.put(((Object) (fc.aN)), "Shipping Address");
	//  457 1325:getstatic       #19  <Field Map a>
	//  458 1328:getstatic       #487 <Field fc fc.aN>
	//  459 1331:ldc2            #489 <String "Shipping Address">
	//  460 1334:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  461 1339:pop             
		a.put(((Object) (fc.aO)), "New to PayPal? Sign Up");
	//  462 1340:getstatic       #19  <Field Map a>
	//  463 1343:getstatic       #492 <Field fc fc.aO>
	//  464 1346:ldc2            #494 <String "New to PayPal? Sign Up">
	//  465 1349:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  466 1354:pop             
		a.put(((Object) (fc.aP)), "Stay logged in");
	//  467 1355:getstatic       #19  <Field Map a>
	//  468 1358:getstatic       #497 <Field fc fc.aP>
	//  469 1361:ldc2            #499 <String "Stay logged in">
	//  470 1364:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  471 1369:pop             
		a.put(((Object) (fc.aQ)), "System error (%s). Please try again later.");
	//  472 1370:getstatic       #19  <Field Map a>
	//  473 1373:getstatic       #502 <Field fc fc.aQ>
	//  474 1376:ldc2            #504 <String "System error (%s). Please try again later.">
	//  475 1379:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  476 1384:pop             
		a.put(((Object) (fc.aR)), "Try Again");
	//  477 1385:getstatic       #19  <Field Map a>
	//  478 1388:getstatic       #507 <Field fc fc.aR>
	//  479 1391:ldc2            #509 <String "Try Again">
	//  480 1394:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  481 1399:pop             
		a.put(((Object) (fc.aS)), "Unable to log in because two-factor authentication has been enabled for your account.");
	//  482 1400:getstatic       #19  <Field Map a>
	//  483 1403:getstatic       #512 <Field fc fc.aS>
	//  484 1406:ldc2            #514 <String "Unable to log in because two-factor authentication has been enabled for your account.">
	//  485 1409:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  486 1414:pop             
		a.put(((Object) (fc.aT)), "Security Code");
	//  487 1415:getstatic       #19  <Field Map a>
	//  488 1418:getstatic       #517 <Field fc fc.aT>
	//  489 1421:ldc2            #519 <String "Security Code">
	//  490 1424:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  491 1429:pop             
		a.put(((Object) (fc.aU)), "Send an SMS to your phone. The 6-digit code you receive will be valid for 5 minutes.");
	//  492 1430:getstatic       #19  <Field Map a>
	//  493 1433:getstatic       #522 <Field fc fc.aU>
	//  494 1436:ldc2            #524 <String "Send an SMS to your phone. The 6-digit code you receive will be valid for 5 minutes.">
	//  495 1439:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  496 1444:pop             
		a.put(((Object) (fc.aV)), "Sending SMS");
	//  497 1445:getstatic       #19  <Field Map a>
	//  498 1448:getstatic       #527 <Field fc fc.aV>
	//  499 1451:ldc2            #529 <String "Sending SMS">
	//  500 1454:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  501 1459:pop             
		a.put(((Object) (fc.aW)), "Enter the 6-digit security code");
	//  502 1460:getstatic       #19  <Field Map a>
	//  503 1463:getstatic       #532 <Field fc fc.aW>
	//  504 1466:ldc2            #534 <String "Enter the 6-digit security code">
	//  505 1469:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  506 1474:pop             
		a.put(((Object) (fc.aX)), "Your mobile number");
	//  507 1475:getstatic       #19  <Field Map a>
	//  508 1478:getstatic       #537 <Field fc fc.aX>
	//  509 1481:ldc2            #539 <String "Your mobile number">
	//  510 1484:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  511 1489:pop             
		a.put(((Object) (fc.aY)), "Send SMS");
	//  512 1490:getstatic       #19  <Field Map a>
	//  513 1493:getstatic       #542 <Field fc fc.aY>
	//  514 1496:ldc2            #544 <String "Send SMS">
	//  515 1499:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  516 1504:pop             
		a.put(((Object) (fc.aZ)), "Send SMS Again");
	//  517 1505:getstatic       #19  <Field Map a>
	//  518 1508:getstatic       #547 <Field fc fc.aZ>
	//  519 1511:ldc2            #549 <String "Send SMS Again">
	//  520 1514:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  521 1519:pop             
		a.put(((Object) (fc.ba)), "Unable to log in because two-factor authentication has been enabled for your account. Please visit the PayPal website to activate your security key.");
	//  522 1520:getstatic       #19  <Field Map a>
	//  523 1523:getstatic       #552 <Field fc fc.ba>
	//  524 1526:ldc2            #554 <String "Unable to log in because two-factor authentication has been enabled for your account. Please visit the PayPal website to activate your security key.">
	//  525 1529:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  526 1534:pop             
		a.put(((Object) (fc.bb)), "Payments from this device are not allowed.");
	//  527 1535:getstatic       #19  <Field Map a>
	//  528 1538:getstatic       #557 <Field fc fc.bb>
	//  529 1541:ldc2            #559 <String "Payments from this device are not allowed.">
	//  530 1544:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  531 1549:pop             
		a.put(((Object) (fc.bc)), "Unauthorised Device");
	//  532 1550:getstatic       #19  <Field Map a>
	//  533 1553:getstatic       #562 <Field fc fc.bc>
	//  534 1556:ldc2            #564 <String "Unauthorised Device">
	//  535 1559:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  536 1564:pop             
		a.put(((Object) (fc.bd)), "Payments to this merchant are not allowed (invalid clientId).");
	//  537 1565:getstatic       #19  <Field Map a>
	//  538 1568:getstatic       #567 <Field fc fc.bd>
	//  539 1571:ldc2            #569 <String "Payments to this merchant are not allowed (invalid clientId).">
	//  540 1574:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  541 1579:pop             
		a.put(((Object) (fc.be)), "Invalid merchant");
	//  542 1580:getstatic       #19  <Field Map a>
	//  543 1583:getstatic       #572 <Field fc fc.be>
	//  544 1586:ldc2            #574 <String "Invalid merchant">
	//  545 1589:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  546 1594:pop             
		a.put(((Object) (fc.bf)), "There was a problem processing your payment. Please try again.");
	//  547 1595:getstatic       #19  <Field Map a>
	//  548 1598:getstatic       #577 <Field fc fc.bf>
	//  549 1601:ldc2            #579 <String "There was a problem processing your payment. Please try again.">
	//  550 1604:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  551 1609:pop             
		a.put(((Object) (fc.bg)), "Unrecognised Source");
	//  552 1610:getstatic       #19  <Field Map a>
	//  553 1613:getstatic       #582 <Field fc fc.bg>
	//  554 1616:ldc2            #584 <String "Unrecognised Source">
	//  555 1619:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  556 1624:pop             
		a.put(((Object) (fc.bh)), "We\u2019re Sorry");
	//  557 1625:getstatic       #19  <Field Map a>
	//  558 1628:getstatic       #587 <Field fc fc.bh>
	//  559 1631:ldc2            #589 <String "We\u2019re Sorry">
	//  560 1634:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  561 1639:pop             
		a.put(((Object) (fc.bi)), "Your Order");
	//  562 1640:getstatic       #19  <Field Map a>
	//  563 1643:getstatic       #592 <Field fc fc.bi>
	//  564 1646:ldc2            #594 <String "Your Order">
	//  565 1649:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  566 1654:pop             
		a.put(((Object) (fc.bj)), "This device cannot communicate with PayPal because this version of Android is too old. Please upgrade Android or try a newer device.");
	//  567 1655:getstatic       #19  <Field Map a>
	//  568 1658:getstatic       #597 <Field fc fc.bj>
	//  569 1661:ldc2            #599 <String "This device cannot communicate with PayPal because this version of Android is too old. Please upgrade Android or try a newer device.">
	//  570 1664:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  571 1669:pop             
		a.put(((Object) (fc.bk)), "Clear Card?");
	//  572 1670:getstatic       #19  <Field Map a>
	//  573 1673:getstatic       #602 <Field fc fc.bk>
	//  574 1676:ldc2            #604 <String "Clear Card?">
	//  575 1679:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  576 1684:pop             
		a.put(((Object) (fc.bl)), "Consent Failed");
	//  577 1685:getstatic       #19  <Field Map a>
	//  578 1688:getstatic       #607 <Field fc fc.bl>
	//  579 1691:ldc2            #609 <String "Consent Failed">
	//  580 1694:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  581 1699:pop             
		a.put(((Object) (fc.bm)), "Connection Failed");
	//  582 1700:getstatic       #19  <Field Map a>
	//  583 1703:getstatic       #612 <Field fc fc.bm>
	//  584 1706:ldc2            #614 <String "Connection Failed">
	//  585 1709:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  586 1714:pop             
		a.put(((Object) (fc.bn)), "Login Failed");
	//  587 1715:getstatic       #19  <Field Map a>
	//  588 1718:getstatic       #617 <Field fc fc.bn>
	//  589 1721:ldc2            #619 <String "Login Failed">
	//  590 1724:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  591 1729:pop             
		a.put(((Object) (fc.bo)), "Log in with password");
	//  592 1730:getstatic       #19  <Field Map a>
	//  593 1733:getstatic       #622 <Field fc fc.bo>
	//  594 1736:ldc2            #624 <String "Log in with password">
	//  595 1739:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  596 1744:pop             
		a.put(((Object) (fc.bp)), "Log in with PIN");
	//  597 1745:getstatic       #19  <Field Map a>
	//  598 1748:getstatic       #627 <Field fc fc.bp>
	//  599 1751:ldc2            #629 <String "Log in with PIN">
	//  600 1754:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  601 1759:pop             
		a.put(((Object) (fc.bq)), "One moment\u2026");
	//  602 1760:getstatic       #19  <Field Map a>
	//  603 1763:getstatic       #632 <Field fc fc.bq>
	//  604 1766:ldc2            #634 <String "One moment\u2026">
	//  605 1769:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  606 1774:pop             
		a.put(((Object) (fc.br)), "Payment Failed");
	//  607 1775:getstatic       #19  <Field Map a>
	//  608 1778:getstatic       #637 <Field fc fc.br>
	//  609 1781:ldc2            #639 <String "Payment Failed">
	//  610 1784:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  611 1789:pop             
		a.put(((Object) (fc.bs)), "Scan");
	//  612 1790:getstatic       #19  <Field Map a>
	//  613 1793:getstatic       #642 <Field fc fc.bs>
	//  614 1796:ldc2            #644 <String "Scan">
	//  615 1799:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  616 1804:pop             
		a.put(((Object) (fc.bt)), "Incorrect Security code. Please try again.");
	//  617 1805:getstatic       #19  <Field Map a>
	//  618 1808:getstatic       #647 <Field fc fc.bt>
	//  619 1811:ldc2            #649 <String "Incorrect Security code. Please try again.">
	//  620 1814:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  621 1819:pop             
		a.put(((Object) (fc.bu)), "Via");
	//  622 1820:getstatic       #19  <Field Map a>
	//  623 1823:getstatic       #652 <Field fc fc.bu>
	//  624 1826:ldc2            #654 <String "Via">
	//  625 1829:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  626 1834:pop             
		a.put(((Object) (fc.bv)), "System error. Please try again later.");
	//  627 1835:getstatic       #19  <Field Map a>
	//  628 1838:getstatic       #657 <Field fc fc.bv>
	//  629 1841:ldc2            #659 <String "System error. Please try again later.">
	//  630 1844:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  631 1849:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|AT", "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  632 1850:getstatic       #21  <Field Map b>
	//  633 1853:ldc2            #661 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|AT">
	//  634 1856:ldc2            #663 <String "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  635 1859:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  636 1864:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BE", "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  637 1865:getstatic       #21  <Field Map b>
	//  638 1868:ldc2            #665 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BE">
	//  639 1871:ldc2            #667 <String "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  640 1874:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  641 1879:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BG", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  642 1880:getstatic       #21  <Field Map b>
	//  643 1883:ldc2            #669 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BG">
	//  644 1886:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  645 1889:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  646 1894:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CH", "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  647 1895:getstatic       #21  <Field Map b>
	//  648 1898:ldc2            #673 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CH">
	//  649 1901:ldc2            #663 <String "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  650 1904:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  651 1909:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CY", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  652 1910:getstatic       #21  <Field Map b>
	//  653 1913:ldc2            #675 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CY">
	//  654 1916:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  655 1919:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  656 1924:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CZ", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  657 1925:getstatic       #21  <Field Map b>
	//  658 1928:ldc2            #677 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CZ">
	//  659 1931:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  660 1934:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  661 1939:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DE", "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  662 1940:getstatic       #21  <Field Map b>
	//  663 1943:ldc2            #679 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DE">
	//  664 1946:ldc2            #663 <String "Share information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  665 1949:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  666 1954:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DK", "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.");
	//  667 1955:getstatic       #21  <Field Map b>
	//  668 1958:ldc2            #681 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DK">
	//  669 1961:ldc2            #683 <String "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.">
	//  670 1964:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  671 1969:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|EE", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  672 1970:getstatic       #21  <Field Map b>
	//  673 1973:ldc2            #685 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|EE">
	//  674 1976:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  675 1979:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  676 1984:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|ES", "Share information with them about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  677 1985:getstatic       #21  <Field Map b>
	//  678 1988:ldc2            #687 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|ES">
	//  679 1991:ldc2            #689 <String "Share information with them about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  680 1994:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  681 1999:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|FI", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  682 2000:getstatic       #21  <Field Map b>
	//  683 2003:ldc2            #691 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|FI">
	//  684 2006:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  685 2009:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  686 2014:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GB", "Share the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  687 2015:getstatic       #21  <Field Map b>
	//  688 2018:ldc2            #693 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GB">
	//  689 2021:ldc2            #695 <String "Share the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  690 2024:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  691 2029:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GR", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  692 2030:getstatic       #21  <Field Map b>
	//  693 2033:ldc2            #697 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GR">
	//  694 2036:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  695 2039:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  696 2044:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|HU", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  697 2045:getstatic       #21  <Field Map b>
	//  698 2048:ldc2            #699 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|HU">
	//  699 2051:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  700 2054:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  701 2059:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IE", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  702 2060:getstatic       #21  <Field Map b>
	//  703 2063:ldc2            #701 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IE">
	//  704 2066:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  705 2069:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  706 2074:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IT", "Share the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  707 2075:getstatic       #21  <Field Map b>
	//  708 2078:ldc2            #703 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IT">
	//  709 2081:ldc2            #695 <String "Share the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  710 2084:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  711 2089:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LI", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  712 2090:getstatic       #21  <Field Map b>
	//  713 2093:ldc2            #705 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LI">
	//  714 2096:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  715 2099:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  716 2104:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LT", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  717 2105:getstatic       #21  <Field Map b>
	//  718 2108:ldc2            #707 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LT">
	//  719 2111:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  720 2114:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  721 2119:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LU", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  722 2120:getstatic       #21  <Field Map b>
	//  723 2123:ldc2            #709 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LU">
	//  724 2126:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  725 2129:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  726 2134:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LV", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  727 2135:getstatic       #21  <Field Map b>
	//  728 2138:ldc2            #711 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LV">
	//  729 2141:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  730 2144:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  731 2149:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|MT", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  732 2150:getstatic       #21  <Field Map b>
	//  733 2153:ldc2            #713 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|MT">
	//  734 2156:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  735 2159:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  736 2164:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NL", "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  737 2165:getstatic       #21  <Field Map b>
	//  738 2168:ldc2            #715 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NL">
	//  739 2171:ldc2            #667 <String "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  740 2174:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  741 2179:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NO", "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.");
	//  742 2180:getstatic       #21  <Field Map b>
	//  743 2183:ldc2            #717 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NO">
	//  744 2186:ldc2            #683 <String "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.">
	//  745 2189:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  746 2194:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PL", "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.");
	//  747 2195:getstatic       #21  <Field Map b>
	//  748 2198:ldc2            #719 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PL">
	//  749 2201:ldc2            #667 <String "Share the information about the <a href='%1$s'>funding sources</a> linked to your PayPal account.">
	//  750 2204:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  751 2209:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PT", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  752 2210:getstatic       #21  <Field Map b>
	//  753 2213:ldc2            #721 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PT">
	//  754 2216:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  755 2219:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  756 2224:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SE", "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.");
	//  757 2225:getstatic       #21  <Field Map b>
	//  758 2228:ldc2            #723 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SE">
	//  759 2231:ldc2            #683 <String "Share information about the <a href='%1$s'>payment methods</a> linked to your PayPal account.">
	//  760 2234:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  761 2239:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SI", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  762 2240:getstatic       #21  <Field Map b>
	//  763 2243:ldc2            #725 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SI">
	//  764 2246:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  765 2249:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  766 2254:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SK", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  767 2255:getstatic       #21  <Field Map b>
	//  768 2258:ldc2            #727 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SK">
	//  769 2261:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  770 2264:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  771 2269:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SM", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  772 2270:getstatic       #21  <Field Map b>
	//  773 2273:ldc2            #729 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SM">
	//  774 2276:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  775 2279:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  776 2284:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|VA", "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.");
	//  777 2285:getstatic       #21  <Field Map b>
	//  778 2288:ldc2            #731 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|VA">
	//  779 2291:ldc2            #671 <String "Share the <a href='%1$s'>funding sources</a> on your behalf until you withdraw consent.">
	//  780 2294:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  781 2299:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|AU", "<p><a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.</p><p>Please see the <a href='https://www.paypal.com/webapps/mpp/ua/recurringpymts-full'>PayPal Recurring Payments and Billing Agreement</a> for more information.</p>");
	//  782 2300:getstatic       #21  <Field Map b>
	//  783 2303:ldc2            #733 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|AU">
	//  784 2306:ldc2            #735 <String "<p><a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.</p><p>Please see the <a href='https://www.paypal.com/webapps/mpp/ua/recurringpymts-full'>PayPal Recurring Payments and Billing Agreement</a> for more information.</p>">
	//  785 2309:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  786 2314:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|CN", "<p><a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.</p><p>Please see the <a href='https://cms.paypal.com/c2/cgi-bin/?cmd=_render-content&content_ID=ua/UserAgreement_full'>PayPal Recurring Payments and Billing Agreement</a> for more information.</p>");
	//  787 2315:getstatic       #21  <Field Map b>
	//  788 2318:ldc2            #737 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|CN">
	//  789 2321:ldc2            #739 <String "<p><a href='%1$s'>Authorise charges</a> for future %2$s purchases paid for with PayPal. You instruct PayPal to pay all amounts requested by %3$s.</p><p>Please see the <a href='https://cms.paypal.com/c2/cgi-bin/?cmd=_render-content&content_ID=ua/UserAgreement_full'>PayPal Recurring Payments and Billing Agreement</a> for more information.</p>">
	//  790 2324:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  791 2329:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|MY", "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.");
	//  792 2330:getstatic       #21  <Field Map b>
	//  793 2333:ldc2            #741 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|MY">
	//  794 2336:ldc2            #743 <String "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.">
	//  795 2339:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  796 2344:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|NZ", "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.");
	//  797 2345:getstatic       #21  <Field Map b>
	//  798 2348:ldc2            #745 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|NZ">
	//  799 2351:ldc2            #743 <String "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.">
	//  800 2354:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  801 2359:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|SG", "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.");
	//  802 2360:getstatic       #21  <Field Map b>
	//  803 2363:ldc2            #747 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|SG">
	//  804 2366:ldc2            #743 <String "<a href='%1$s'>Authorise charges</a> for future purchases paid for with PayPal. You authorise and instruct PayPal to pay all amounts.">
	//  805 2369:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  806 2374:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|US", "Pre-approve future payments made from your PayPal account without logging in to PayPal each time. <a href='%1$s'>See additional terms</a>, including payment methods and how to cancel future payments.");
	//  807 2375:getstatic       #21  <Field Map b>
	//  808 2378:ldc2            #749 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|US">
	//  809 2381:ldc2            #751 <String "Pre-approve future payments made from your PayPal account without logging in to PayPal each time. <a href='%1$s'>See additional terms</a>, including payment methods and how to cancel future payments.">
	//  810 2384:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  811 2389:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|AT", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  812 2390:getstatic       #21  <Field Map b>
	//  813 2393:ldc2            #753 <String "CONSENT_AGREEMENT_REQUEST_MONEY|AT">
	//  814 2396:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  815 2399:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  816 2404:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|BE", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  817 2405:getstatic       #21  <Field Map b>
	//  818 2408:ldc2            #757 <String "CONSENT_AGREEMENT_REQUEST_MONEY|BE">
	//  819 2411:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  820 2414:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  821 2419:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|CH", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  822 2420:getstatic       #21  <Field Map b>
	//  823 2423:ldc2            #759 <String "CONSENT_AGREEMENT_REQUEST_MONEY|CH">
	//  824 2426:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  825 2429:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  826 2434:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|DE", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  827 2435:getstatic       #21  <Field Map b>
	//  828 2438:ldc2            #761 <String "CONSENT_AGREEMENT_REQUEST_MONEY|DE">
	//  829 2441:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  830 2444:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  831 2449:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|GB", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  832 2450:getstatic       #21  <Field Map b>
	//  833 2453:ldc2            #763 <String "CONSENT_AGREEMENT_REQUEST_MONEY|GB">
	//  834 2456:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  835 2459:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  836 2464:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|NL", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  837 2465:getstatic       #21  <Field Map b>
	//  838 2468:ldc2            #765 <String "CONSENT_AGREEMENT_REQUEST_MONEY|NL">
	//  839 2471:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  840 2474:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  841 2479:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|PL", "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.");
	//  842 2480:getstatic       #21  <Field Map b>
	//  843 2483:ldc2            #767 <String "CONSENT_AGREEMENT_REQUEST_MONEY|PL">
	//  844 2486:ldc2            #755 <String "Permit %2$s to <a href='%1$s'>request money</a> on your behalf until you withdraw consent.">
	//  845 2489:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  846 2494:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|AT", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  847 2495:getstatic       #21  <Field Map b>
	//  848 2498:ldc2            #769 <String "CONSENT_AGREEMENT_SEND_MONEY|AT">
	//  849 2501:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  850 2504:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  851 2509:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|BE", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  852 2510:getstatic       #21  <Field Map b>
	//  853 2513:ldc2            #773 <String "CONSENT_AGREEMENT_SEND_MONEY|BE">
	//  854 2516:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  855 2519:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  856 2524:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|CH", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  857 2525:getstatic       #21  <Field Map b>
	//  858 2528:ldc2            #775 <String "CONSENT_AGREEMENT_SEND_MONEY|CH">
	//  859 2531:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  860 2534:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  861 2539:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|DE", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  862 2540:getstatic       #21  <Field Map b>
	//  863 2543:ldc2            #777 <String "CONSENT_AGREEMENT_SEND_MONEY|DE">
	//  864 2546:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  865 2549:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  866 2554:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|GB", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  867 2555:getstatic       #21  <Field Map b>
	//  868 2558:ldc2            #779 <String "CONSENT_AGREEMENT_SEND_MONEY|GB">
	//  869 2561:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  870 2564:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  871 2569:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|NL", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  872 2570:getstatic       #21  <Field Map b>
	//  873 2573:ldc2            #781 <String "CONSENT_AGREEMENT_SEND_MONEY|NL">
	//  874 2576:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  875 2579:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  876 2584:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|PL", "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.");
	//  877 2585:getstatic       #21  <Field Map b>
	//  878 2588:ldc2            #783 <String "CONSENT_AGREEMENT_SEND_MONEY|PL">
	//  879 2591:ldc2            #771 <String "Permit %2$s to <a href='%1$s'>send money</a> on your behalf until you withdraw consent.">
	//  880 2594:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  881 2599:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|AT", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  882 2600:getstatic       #21  <Field Map b>
	//  883 2603:ldc2            #785 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|AT">
	//  884 2606:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  885 2609:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  886 2614:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BE", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>");
	//  887 2615:getstatic       #21  <Field Map b>
	//  888 2618:ldc2            #789 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BE">
	//  889 2621:ldc2            #791 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>">
	//  890 2624:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  891 2629:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BG", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  892 2630:getstatic       #21  <Field Map b>
	//  893 2633:ldc2            #793 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BG">
	//  894 2636:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  895 2639:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  896 2644:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CH", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  897 2645:getstatic       #21  <Field Map b>
	//  898 2648:ldc2            #795 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CH">
	//  899 2651:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  900 2654:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  901 2659:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CY", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  902 2660:getstatic       #21  <Field Map b>
	//  903 2663:ldc2            #797 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CY">
	//  904 2666:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  905 2669:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  906 2674:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CZ", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  907 2675:getstatic       #21  <Field Map b>
	//  908 2678:ldc2            #799 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CZ">
	//  909 2681:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  910 2684:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  911 2689:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|DE", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  912 2690:getstatic       #21  <Field Map b>
	//  913 2693:ldc2            #801 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|DE">
	//  914 2696:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  915 2699:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  916 2704:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|EE", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  917 2705:getstatic       #21  <Field Map b>
	//  918 2708:ldc2            #803 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|EE">
	//  919 2711:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  920 2714:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  921 2719:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|ES", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  922 2720:getstatic       #21  <Field Map b>
	//  923 2723:ldc2            #805 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|ES">
	//  924 2726:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  925 2729:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  926 2734:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|FI", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  927 2735:getstatic       #21  <Field Map b>
	//  928 2738:ldc2            #807 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|FI">
	//  929 2741:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  930 2744:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  931 2749:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|GR", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  932 2750:getstatic       #21  <Field Map b>
	//  933 2753:ldc2            #809 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|GR">
	//  934 2756:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  935 2759:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  936 2764:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|HU", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  937 2765:getstatic       #21  <Field Map b>
	//  938 2768:ldc2            #811 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|HU">
	//  939 2771:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  940 2774:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  941 2779:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IE", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  942 2780:getstatic       #21  <Field Map b>
	//  943 2783:ldc2            #813 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IE">
	//  944 2786:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  945 2789:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  946 2794:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IT", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  947 2795:getstatic       #21  <Field Map b>
	//  948 2798:ldc2            #815 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IT">
	//  949 2801:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  950 2804:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  951 2809:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LI", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  952 2810:getstatic       #21  <Field Map b>
	//  953 2813:ldc2            #817 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LI">
	//  954 2816:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  955 2819:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  956 2824:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LT", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  957 2825:getstatic       #21  <Field Map b>
	//  958 2828:ldc2            #819 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LT">
	//  959 2831:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  960 2834:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  961 2839:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LU", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  962 2840:getstatic       #21  <Field Map b>
	//  963 2843:ldc2            #821 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LU">
	//  964 2846:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  965 2849:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  966 2854:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LV", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  967 2855:getstatic       #21  <Field Map b>
	//  968 2858:ldc2            #823 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LV">
	//  969 2861:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  970 2864:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  971 2869:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|MT", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  972 2870:getstatic       #21  <Field Map b>
	//  973 2873:ldc2            #825 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|MT">
	//  974 2876:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  975 2879:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  976 2884:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|NL", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>");
	//  977 2885:getstatic       #21  <Field Map b>
	//  978 2888:ldc2            #827 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|NL">
	//  979 2891:ldc2            #791 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>">
	//  980 2894:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  981 2899:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PL", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>");
	//  982 2900:getstatic       #21  <Field Map b>
	//  983 2903:ldc2            #829 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PL">
	//  984 2906:ldc2            #791 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares the information about which of your funding sources are available for use.</p>">
	//  985 2909:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  986 2914:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PT", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  987 2915:getstatic       #21  <Field Map b>
	//  988 2918:ldc2            #831 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PT">
	//  989 2921:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  990 2924:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  991 2929:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SI", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  992 2930:getstatic       #21  <Field Map b>
	//  993 2933:ldc2            #833 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SI">
	//  994 2936:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	//  995 2939:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  996 2944:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SK", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	//  997 2945:getstatic       #21  <Field Map b>
	//  998 2948:ldc2            #835 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SK">
	//  999 2951:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	// 1000 2954:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1001 2959:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SM", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	// 1002 2960:getstatic       #21  <Field Map b>
	// 1003 2963:ldc2            #837 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SM">
	// 1004 2966:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	// 1005 2969:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1006 2974:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|VA", "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>");
	// 1007 2975:getstatic       #21  <Field Map b>
	// 1008 2978:ldc2            #839 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|VA">
	// 1009 2981:ldc2            #787 <String "<h1><strong>Payment Methods</strong></h1><p>PayPal only shares which of your funding sources are available for use.</p>">
	// 1010 2984:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1011 2989:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|AU", "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your default payment method (your PayPal balance, linked bank account, credit or debit card, in that order) will be used to pay for PayPal purchases. Please note, if your default payment method doesn\u2019t have enough funds to cover the purchase, your bank or card provider may charge you a fee.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> then click <strong>My settings</strong> and <strong>Change</strong> beside \u201CLog in with PayPal.\u201D</p>");
	// 1012 2990:getstatic       #21  <Field Map b>
	// 1013 2993:ldc2            #841 <String "FUTURE_PAYMENT_LEGAL_DETAILS|AU">
	// 1014 2996:ldc2            #843 <String "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your default payment method (your PayPal balance, linked bank account, credit or debit card, in that order) will be used to pay for PayPal purchases. Please note, if your default payment method doesn\u2019t have enough funds to cover the purchase, your bank or card provider may charge you a fee.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> then click <strong>My settings</strong> and <strong>Change</strong> beside \u201CLog in with PayPal.\u201D</p>">
	// 1015 2999:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1016 3004:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|BR", "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your PayPal balance or primary credit or debit card will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>");
	// 1017 3005:getstatic       #21  <Field Map b>
	// 1018 3008:ldc2            #845 <String "FUTURE_PAYMENT_LEGAL_DETAILS|BR">
	// 1019 3011:ldc2            #847 <String "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your PayPal balance or primary credit or debit card will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>">
	// 1020 3014:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1021 3019:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|CN", "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal Account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal Account, go to <strong>Profile</strong> &gt; <strong>Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>");
	// 1022 3020:getstatic       #21  <Field Map b>
	// 1023 3023:ldc2            #849 <String "FUTURE_PAYMENT_LEGAL_DETAILS|CN">
	// 1024 3026:ldc2            #851 <String "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal Account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal Account, go to <strong>Profile</strong> &gt; <strong>Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>">
	// 1025 3029:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1026 3034:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|GB", "<h1><strong>Future Payment Agreement</strong></h1><p>Your default payment method will be used to pay for future PayPal payments from this merchant.</p><p>To cancel this agreement, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log in with PayPal</strong> and remove this merchant from the list.</p><p>The Recurring Payment section of the <a href='%s'>PayPal User Agreement</a> shall apply.</p><p>To make sure payments work with your PayPal account, this app may simulate a small test transaction, but no money will be transferred for this.</p>");
	// 1027 3035:getstatic       #21  <Field Map b>
	// 1028 3038:ldc2            #853 <String "FUTURE_PAYMENT_LEGAL_DETAILS|GB">
	// 1029 3041:ldc2            #855 <String "<h1><strong>Future Payment Agreement</strong></h1><p>Your default payment method will be used to pay for future PayPal payments from this merchant.</p><p>To cancel this agreement, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log in with PayPal</strong> and remove this merchant from the list.</p><p>The Recurring Payment section of the <a href='%s'>PayPal User Agreement</a> shall apply.</p><p>To make sure payments work with your PayPal account, this app may simulate a small test transaction, but no money will be transferred for this.</p>">
	// 1030 3044:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1031 3049:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|HK", "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>");
	// 1032 3050:getstatic       #21  <Field Map b>
	// 1033 3053:ldc2            #857 <String "FUTURE_PAYMENT_LEGAL_DETAILS|HK">
	// 1034 3056:ldc2            #859 <String "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>">
	// 1035 3059:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1036 3064:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|JP", "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>");
	// 1037 3065:getstatic       #21  <Field Map b>
	// 1038 3068:ldc2            #861 <String "FUTURE_PAYMENT_LEGAL_DETAILS|JP">
	// 1039 3071:ldc2            #859 <String "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>">
	// 1040 3074:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1041 3079:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|MX", "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your PayPal balance or primary credit or debit card will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>");
	// 1042 3080:getstatic       #21  <Field Map b>
	// 1043 3083:ldc2            #863 <String "FUTURE_PAYMENT_LEGAL_DETAILS|MX">
	// 1044 3086:ldc2            #847 <String "<h1><strong>Future Payment Agreement</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no money will be transferred.</p><p>Your PayPal balance or primary credit or debit card will be used to pay for PayPal purchases.</p><p>To cancel this agreement, log in to your PayPal account and go to <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p>">
	// 1045 3089:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1046 3094:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|MY", "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>");
	// 1047 3095:getstatic       #21  <Field Map b>
	// 1048 3098:ldc2            #865 <String "FUTURE_PAYMENT_LEGAL_DETAILS|MY">
	// 1049 3101:ldc2            #859 <String "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>">
	// 1050 3104:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1051 3109:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|NZ", "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>");
	// 1052 3110:getstatic       #21  <Field Map b>
	// 1053 3113:ldc2            #867 <String "FUTURE_PAYMENT_LEGAL_DETAILS|NZ">
	// 1054 3116:ldc2            #859 <String "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>">
	// 1055 3119:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1056 3124:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|SG", "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>");
	// 1057 3125:getstatic       #21  <Field Map b>
	// 1058 3128:ldc2            #869 <String "FUTURE_PAYMENT_LEGAL_DETAILS|SG">
	// 1059 3131:ldc2            #859 <String "<h1><strong>Future Payment authorisation</strong></h1><p>To make sure your PayPal account can be charged in the future, this app may simulate a small test transaction but no payment will be transferred.</p><p>Your default payment method will be used to pay for PayPal purchases.</p><p>To cancel this authorisation, log in to your PayPal account, go to <strong>Profile</strong> &gt; <strong>My account settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>Please see the \u201CPre-approved Payments\u201D section of the <a href='%s'>PayPal User Agreement</a> for more information.</p>">
	// 1060 3134:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1061 3139:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|US", "<h1><strong>Future Payment Agreement</strong></h1><p>PayPal will first use your PayPal balance to pay for your purchase. If that doesn\u2019t cover your total, your bank account, PayPal Credit, debit card, credit card, and/or eCheque will be used in that order.</p><p>To cancel this agreement, go to www.paypal.com.au <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>A small payment authorisation may be required to make sure your PayPal account can be charged in the future. The authorisation will be voided and you won\u2019t be charged.</p>");
	// 1062 3140:getstatic       #21  <Field Map b>
	// 1063 3143:ldc2            #871 <String "FUTURE_PAYMENT_LEGAL_DETAILS|US">
	// 1064 3146:ldc2            #873 <String "<h1><strong>Future Payment Agreement</strong></h1><p>PayPal will first use your PayPal balance to pay for your purchase. If that doesn\u2019t cover your total, your bank account, PayPal Credit, debit card, credit card, and/or eCheque will be used in that order.</p><p>To cancel this agreement, go to www.paypal.com.au <strong>Profile</strong> &gt; <strong>My Settings</strong> &gt; <strong>Log In with PayPal</strong> and remove this merchant from the list.</p><p>A small payment authorisation may be required to make sure your PayPal account can be charged in the future. The authorisation will be voided and you won\u2019t be charged.</p>">
	// 1065 3149:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1066 3154:pop             
		b.put("LOG_IN_TO_PAYPAL|AU", "Log In with PayPal");
	// 1067 3155:getstatic       #21  <Field Map b>
	// 1068 3158:ldc2            #875 <String "LOG_IN_TO_PAYPAL|AU">
	// 1069 3161:ldc2            #376 <String "Log In with PayPal">
	// 1070 3164:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1071 3169:pop             
		b.put("LOG_IN_TO_PAYPAL|GB", "Log In with PayPal");
	// 1072 3170:getstatic       #21  <Field Map b>
	// 1073 3173:ldc2            #877 <String "LOG_IN_TO_PAYPAL|GB">
	// 1074 3176:ldc2            #376 <String "Log In with PayPal">
	// 1075 3179:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1076 3184:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AD", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1077 3185:getstatic       #21  <Field Map b>
	// 1078 3188:ldc2            #879 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AD">
	// 1079 3191:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1080 3194:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1081 3199:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AL", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1082 3200:getstatic       #21  <Field Map b>
	// 1083 3203:ldc2            #883 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AL">
	// 1084 3206:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1085 3209:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1086 3214:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AT", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1087 3215:getstatic       #21  <Field Map b>
	// 1088 3218:ldc2            #885 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AT">
	// 1089 3221:ldc2            #887 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1090 3224:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1091 3229:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AU", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log in with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1092 3230:getstatic       #21  <Field Map b>
	// 1093 3233:ldc2            #889 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AU">
	// 1094 3236:ldc2            #891 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log in with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1095 3239:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1096 3244:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BA", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1097 3245:getstatic       #21  <Field Map b>
	// 1098 3248:ldc2            #893 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BA">
	// 1099 3251:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1100 3254:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1101 3259:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BE", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1102 3260:getstatic       #21  <Field Map b>
	// 1103 3263:ldc2            #895 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BE">
	// 1104 3266:ldc2            #897 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1105 3269:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1106 3274:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BG", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1107 3275:getstatic       #21  <Field Map b>
	// 1108 3278:ldc2            #899 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BG">
	// 1109 3281:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1110 3284:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1111 3289:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CH", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1112 3290:getstatic       #21  <Field Map b>
	// 1113 3293:ldc2            #901 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CH">
	// 1114 3296:ldc2            #887 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1115 3299:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1116 3304:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CY", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1117 3305:getstatic       #21  <Field Map b>
	// 1118 3308:ldc2            #903 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CY">
	// 1119 3311:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1120 3314:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1121 3319:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CZ", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1122 3320:getstatic       #21  <Field Map b>
	// 1123 3323:ldc2            #905 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CZ">
	// 1124 3326:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1125 3329:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1126 3334:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DE", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1127 3335:getstatic       #21  <Field Map b>
	// 1128 3338:ldc2            #907 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DE">
	// 1129 3341:ldc2            #887 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account and click on the gear icon. Go to <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1130 3344:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1131 3349:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DK", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1132 3350:getstatic       #21  <Field Map b>
	// 1133 3353:ldc2            #909 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DK">
	// 1134 3356:ldc2            #911 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1135 3359:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1136 3364:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|EE", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1137 3365:getstatic       #21  <Field Map b>
	// 1138 3368:ldc2            #913 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|EE">
	// 1139 3371:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1140 3374:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1141 3379:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ES", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account, click on the gear icon at the top right corner, choose <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove the merchant. If you\u2019re still using the classic website, go to <strong>My Profile</strong>, choose <strong>My Account Settings</strong>, select <strong>Log In with PayPal</strong> and remove the merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1142 3380:getstatic       #21  <Field Map b>
	// 1143 3383:ldc2            #915 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ES">
	// 1144 3386:ldc2            #917 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account, click on the gear icon at the top right corner, choose <strong>Security</strong>, select <strong>Log In with PayPal</strong> and remove the merchant. If you\u2019re still using the classic website, go to <strong>My Profile</strong>, choose <strong>My Account Settings</strong>, select <strong>Log In with PayPal</strong> and remove the merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1145 3389:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1146 3394:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|FI", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1147 3395:getstatic       #21  <Field Map b>
	// 1148 3398:ldc2            #919 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|FI">
	// 1149 3401:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1150 3404:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1151 3409:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GB", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account, then under <strong>Profile</strong> settings go to <strong>Log in with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1152 3410:getstatic       #21  <Field Map b>
	// 1153 3413:ldc2            #921 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GB">
	// 1154 3416:ldc2            #923 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in to your PayPal account, then under <strong>Profile</strong> settings go to <strong>Log in with PayPal</strong> and remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1155 3419:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1156 3424:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GR", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1157 3425:getstatic       #21  <Field Map b>
	// 1158 3428:ldc2            #925 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GR">
	// 1159 3431:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1160 3434:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1161 3439:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HR", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1162 3440:getstatic       #21  <Field Map b>
	// 1163 3443:ldc2            #927 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HR">
	// 1164 3446:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1165 3449:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1166 3454:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HU", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1167 3455:getstatic       #21  <Field Map b>
	// 1168 3458:ldc2            #929 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HU">
	// 1169 3461:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1170 3464:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1171 3469:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IE", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1172 3470:getstatic       #21  <Field Map b>
	// 1173 3473:ldc2            #931 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IE">
	// 1174 3476:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1175 3479:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1176 3484:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IS", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1177 3485:getstatic       #21  <Field Map b>
	// 1178 3488:ldc2            #933 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IS">
	// 1179 3491:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1180 3494:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1181 3499:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IT", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.it then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1182 3500:getstatic       #21  <Field Map b>
	// 1183 3503:ldc2            #935 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IT">
	// 1184 3506:ldc2            #937 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.it then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1185 3509:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1186 3514:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LI", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1187 3515:getstatic       #21  <Field Map b>
	// 1188 3518:ldc2            #939 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LI">
	// 1189 3521:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1190 3524:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1191 3529:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LT", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1192 3530:getstatic       #21  <Field Map b>
	// 1193 3533:ldc2            #941 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LT">
	// 1194 3536:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1195 3539:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1196 3544:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LU", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1197 3545:getstatic       #21  <Field Map b>
	// 1198 3548:ldc2            #943 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LU">
	// 1199 3551:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1200 3554:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1201 3559:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LV", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1202 3560:getstatic       #21  <Field Map b>
	// 1203 3563:ldc2            #945 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LV">
	// 1204 3566:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1205 3569:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1206 3574:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|MT", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1207 3575:getstatic       #21  <Field Map b>
	// 1208 3578:ldc2            #947 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|MT">
	// 1209 3581:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1210 3584:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1211 3589:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NL", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1212 3590:getstatic       #21  <Field Map b>
	// 1213 3593:ldc2            #949 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NL">
	// 1214 3596:ldc2            #897 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1215 3599:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1216 3604:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NO", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1217 3605:getstatic       #21  <Field Map b>
	// 1218 3608:ldc2            #951 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NO">
	// 1219 3611:ldc2            #911 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1220 3614:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1221 3619:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PL", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1222 3620:getstatic       #21  <Field Map b>
	// 1223 3623:ldc2            #953 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PL">
	// 1224 3626:ldc2            #897 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under your <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1225 3629:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1226 3634:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PT", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1227 3635:getstatic       #21  <Field Map b>
	// 1228 3638:ldc2            #955 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PT">
	// 1229 3641:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1230 3644:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1231 3649:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RO", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1232 3650:getstatic       #21  <Field Map b>
	// 1233 3653:ldc2            #957 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RO">
	// 1234 3656:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1235 3659:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1236 3664:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RU", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in at paypal.ru, click on the gear icon at the top right corner, choose <strong>Security</strong> tab and in the <strong>Log In with PayPal</strong> option remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>");
	// 1237 3665:getstatic       #21  <Field Map b>
	// 1238 3668:ldc2            #959 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RU">
	// 1239 3671:ldc2            #961 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the partner.</p><p>To withdraw consent, log in at paypal.ru, click on the gear icon at the top right corner, choose <strong>Security</strong> tab and in the <strong>Log In with PayPal</strong> option remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the partner.</p>">
	// 1240 3674:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1241 3679:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SE", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1242 3680:getstatic       #21  <Field Map b>
	// 1243 3683:ldc2            #963 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SE">
	// 1244 3686:ldc2            #911 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in to your PayPal account then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1245 3689:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1246 3694:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SI", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1247 3695:getstatic       #21  <Field Map b>
	// 1248 3698:ldc2            #965 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SI">
	// 1249 3701:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1250 3704:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1251 3709:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SK", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1252 3710:getstatic       #21  <Field Map b>
	// 1253 3713:ldc2            #967 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SK">
	// 1254 3716:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1255 3719:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1256 3724:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SM", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1257 3725:getstatic       #21  <Field Map b>
	// 1258 3728:ldc2            #969 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SM">
	// 1259 3731:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1260 3734:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1261 3739:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|TR", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com.tr click on the gear icon at the top right corner, choose <strong>Security</strong> tab and in the <strong>Log In with PayPal</strong> option remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1262 3740:getstatic       #21  <Field Map b>
	// 1263 3743:ldc2            #971 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|TR">
	// 1264 3746:ldc2            #973 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com.tr click on the gear icon at the top right corner, choose <strong>Security</strong> tab and in the <strong>Log In with PayPal</strong> option remove this partner.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1265 3749:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1266 3754:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|UA", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1267 3755:getstatic       #21  <Field Map b>
	// 1268 3758:ldc2            #975 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|UA">
	// 1269 3761:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1270 3764:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1271 3769:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|US", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p>");
	// 1272 3770:getstatic       #21  <Field Map b>
	// 1273 3773:ldc2            #977 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|US">
	// 1274 3776:ldc2            #979 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Log In with PayPal</strong> options under <strong>Profile</strong> settings and remove this merchant.</p>">
	// 1275 3779:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1276 3784:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|VA", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1277 3785:getstatic       #21  <Field Map b>
	// 1278 3788:ldc2            #981 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|VA">
	// 1279 3791:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1280 3794:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1281 3799:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ZA", "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>");
	// 1282 3800:getstatic       #21  <Field Map b>
	// 1283 3803:ldc2            #983 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ZA">
	// 1284 3806:ldc2            #881 <String "<h1><strong>%s</strong></h1><p>Any relevant transaction details will be shared with the merchant.</p><p>To withdraw consent, log in at paypal.com then go to <strong>Profile</strong>, <strong>Security</strong>, find the <strong>Log In with PayPal</strong> and remove this merchant.</p><p>PayPal is not responsible for any actions or errors on the part of the merchant.</p>">
	// 1285 3809:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1286 3814:pop             
		c.put("AMOUNT_MISMATCH", "Cart item amount total does not match sale amount.");
	// 1287 3815:getstatic       #23  <Field Map c>
	// 1288 3818:ldc2            #985 <String "AMOUNT_MISMATCH">
	// 1289 3821:ldc2            #987 <String "Cart item amount total does not match sale amount.">
	// 1290 3824:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1291 3829:pop             
		c.put("AUTHORIZATION_ALREADY_COMPLETED", "This authorisation has already been completed.");
	// 1292 3830:getstatic       #23  <Field Map c>
	// 1293 3833:ldc2            #989 <String "AUTHORIZATION_ALREADY_COMPLETED">
	// 1294 3836:ldc2            #991 <String "This authorisation has already been completed.">
	// 1295 3839:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1296 3844:pop             
		c.put("AUTHORIZATION_CANNOT_BE_VOIDED", "Authorisation is in a state that cannot be voided.");
	// 1297 3845:getstatic       #23  <Field Map c>
	// 1298 3848:ldc2            #993 <String "AUTHORIZATION_CANNOT_BE_VOIDED">
	// 1299 3851:ldc2            #995 <String "Authorisation is in a state that cannot be voided.">
	// 1300 3854:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1301 3859:pop             
		c.put("AUTHORIZATION_EXPIRED", "Authorisation has expired.");
	// 1302 3860:getstatic       #23  <Field Map c>
	// 1303 3863:ldc2            #997 <String "AUTHORIZATION_EXPIRED">
	// 1304 3866:ldc2            #999 <String "Authorisation has expired.">
	// 1305 3869:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1306 3874:pop             
		c.put("AUTHORIZATION_ID_DOES_NOT_EXIST", "The requested authorisation ID does not exist.");
	// 1307 3875:getstatic       #23  <Field Map c>
	// 1308 3878:ldc2            #1001 <String "AUTHORIZATION_ID_DOES_NOT_EXIST">
	// 1309 3881:ldc2            #1003 <String "The requested authorisation ID does not exist.">
	// 1310 3884:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1311 3889:pop             
		c.put("AUTHORIZATION_VOIDED", "authorisation has been voided.");
	// 1312 3890:getstatic       #23  <Field Map c>
	// 1313 3893:ldc2            #1005 <String "AUTHORIZATION_VOIDED">
	// 1314 3896:ldc2            #1007 <String "authorisation has been voided.">
	// 1315 3899:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1316 3904:pop             
		c.put("CANNOT_REAUTH_CHILD_AUTHORIZATION", "Can only reauthorise the original authorisation, not a reauthorisation.");
	// 1317 3905:getstatic       #23  <Field Map c>
	// 1318 3908:ldc2            #1009 <String "CANNOT_REAUTH_CHILD_AUTHORIZATION">
	// 1319 3911:ldc2            #1011 <String "Can only reauthorise the original authorisation, not a reauthorisation.">
	// 1320 3914:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1321 3919:pop             
		c.put("CANNOT_REAUTH_INSIDE_HONOR_PERIOD", "Reauthorisation is not allowed within the honour period.");
	// 1322 3920:getstatic       #23  <Field Map c>
	// 1323 3923:ldc2            #1013 <String "CANNOT_REAUTH_INSIDE_HONOR_PERIOD">
	// 1324 3926:ldc2            #1015 <String "Reauthorisation is not allowed within the honour period.">
	// 1325 3929:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1326 3934:pop             
		c.put("CAPTURE_AMOUNT_LIMIT_EXCEEDED", "The amount exceeds the allowable limit.");
	// 1327 3935:getstatic       #23  <Field Map c>
	// 1328 3938:ldc2            #1017 <String "CAPTURE_AMOUNT_LIMIT_EXCEEDED">
	// 1329 3941:ldc2            #1019 <String "The amount exceeds the allowable limit.">
	// 1330 3944:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1331 3949:pop             
		c.put("CARD_TOKEN_PAYER_MISMATCH", "Cannot access saved card information.");
	// 1332 3950:getstatic       #23  <Field Map c>
	// 1333 3953:ldc2            #1021 <String "CARD_TOKEN_PAYER_MISMATCH">
	// 1334 3956:ldc2            #1023 <String "Cannot access saved card information.">
	// 1335 3959:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1336 3964:pop             
		c.put("CREDIT_CARD_CVV_CHECK_FAILED", "The card information is invalid. Please correct and submit again.");
	// 1337 3965:getstatic       #23  <Field Map c>
	// 1338 3968:ldc2            #1025 <String "CREDIT_CARD_CVV_CHECK_FAILED">
	// 1339 3971:ldc2            #1027 <String "The card information is invalid. Please correct and submit again.">
	// 1340 3974:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1341 3979:pop             
		c.put("CREDIT_CARD_REFUSED", "Card declined.");
	// 1342 3980:getstatic       #23  <Field Map c>
	// 1343 3983:ldc2            #1029 <String "CREDIT_CARD_REFUSED">
	// 1344 3986:ldc2            #1031 <String "Card declined.">
	// 1345 3989:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1346 3994:pop             
		c.put("CURRENCY_MISMATCH", "Currency of capture must be the same as currency of authorisation.");
	// 1347 3995:getstatic       #23  <Field Map c>
	// 1348 3998:ldc2            #1033 <String "CURRENCY_MISMATCH">
	// 1349 4001:ldc2            #1035 <String "Currency of capture must be the same as currency of authorisation.">
	// 1350 4004:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1351 4009:pop             
		c.put("CURRENCY_NOT_ALLOWED", "This currency is not currently supported by PayPal.");
	// 1352 4010:getstatic       #23  <Field Map c>
	// 1353 4013:ldc2            #1037 <String "CURRENCY_NOT_ALLOWED">
	// 1354 4016:ldc2            #1039 <String "This currency is not currently supported by PayPal.">
	// 1355 4019:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1356 4024:pop             
		c.put("DATA_RETRIEVAL", "System error. Please try again later.");
	// 1357 4025:getstatic       #23  <Field Map c>
	// 1358 4028:ldc2            #1041 <String "DATA_RETRIEVAL">
	// 1359 4031:ldc2            #659 <String "System error. Please try again later.">
	// 1360 4034:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1361 4039:pop             
		c.put("DUPLICATE_REQUEST_ID", "System error. Please try again later.");
	// 1362 4040:getstatic       #23  <Field Map c>
	// 1363 4043:ldc2            #1043 <String "DUPLICATE_REQUEST_ID">
	// 1364 4046:ldc2            #659 <String "System error. Please try again later.">
	// 1365 4049:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1366 4054:pop             
		c.put("EXPIRED_CREDIT_CARD", "Card has expired");
	// 1367 4055:getstatic       #23  <Field Map c>
	// 1368 4058:ldc2            #1045 <String "EXPIRED_CREDIT_CARD">
	// 1369 4061:ldc2            #1047 <String "Card has expired">
	// 1370 4064:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1371 4069:pop             
		c.put("EXPIRED_CREDIT_CARD_TOKEN", "The information for this card is no longer on file.\nPlease submit again.");
	// 1372 4070:getstatic       #23  <Field Map c>
	// 1373 4073:ldc2            #1049 <String "EXPIRED_CREDIT_CARD_TOKEN">
	// 1374 4076:ldc2            #1051 <String "The information for this card is no longer on file.\nPlease submit again.">
	// 1375 4079:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1376 4084:pop             
		c.put("FEATURE_UNSUPPORTED_FOR_PAYEE", "Feature is unsupported for this vendor.");
	// 1377 4085:getstatic       #23  <Field Map c>
	// 1378 4088:ldc2            #1053 <String "FEATURE_UNSUPPORTED_FOR_PAYEE">
	// 1379 4091:ldc2            #1055 <String "Feature is unsupported for this vendor.">
	// 1380 4094:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1381 4099:pop             
		c.put("FULL_REFUND_NOT_ALLOWED_AFTER_PARTIAL_REFUND", "This transaction has already been partially refunded.");
	// 1382 4100:getstatic       #23  <Field Map c>
	// 1383 4103:ldc2            #1057 <String "FULL_REFUND_NOT_ALLOWED_AFTER_PARTIAL_REFUND">
	// 1384 4106:ldc2            #1059 <String "This transaction has already been partially refunded.">
	// 1385 4109:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1386 4114:pop             
		c.put("IMMEDIATE_PAY_NOT_SUPPORTED", "Immediate pay is not supported for the Intent passed.");
	// 1387 4115:getstatic       #23  <Field Map c>
	// 1388 4118:ldc2            #1061 <String "IMMEDIATE_PAY_NOT_SUPPORTED">
	// 1389 4121:ldc2            #1063 <String "Immediate pay is not supported for the Intent passed.">
	// 1390 4124:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1391 4129:pop             
		c.put("INSTRUMENT_DECLINED", "Your selected payment method was not accepted. Please choose a different method.");
	// 1392 4130:getstatic       #23  <Field Map c>
	// 1393 4133:ldc2            #1065 <String "INSTRUMENT_DECLINED">
	// 1394 4136:ldc2            #1067 <String "Your selected payment method was not accepted. Please choose a different method.">
	// 1395 4139:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1396 4144:pop             
		c.put("INSUFFICIENT_FUNDS", "Buyer cannot pay \u2013 insufficient funds.");
	// 1397 4145:getstatic       #23  <Field Map c>
	// 1398 4148:ldc2            #1069 <String "INSUFFICIENT_FUNDS">
	// 1399 4151:ldc2            #1071 <String "Buyer cannot pay \u2013 insufficient funds.">
	// 1400 4154:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1401 4159:pop             
		c.put("INTERNAL_SERVICE_ERROR", "System error. Please try again later.");
	// 1402 4160:getstatic       #23  <Field Map c>
	// 1403 4163:ldc2            #1073 <String "INTERNAL_SERVICE_ERROR">
	// 1404 4166:ldc2            #659 <String "System error. Please try again later.">
	// 1405 4169:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1406 4174:pop             
		c.put("INVALID_ACCOUNT_NUMBER", "That account number does not exist.");
	// 1407 4175:getstatic       #23  <Field Map c>
	// 1408 4178:ldc2            #1075 <String "INVALID_ACCOUNT_NUMBER">
	// 1409 4181:ldc2            #1077 <String "That account number does not exist.">
	// 1410 4184:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1411 4189:pop             
		c.put("INVALID_ARGUMENT", "Transaction denied because of an invalid argument");
	// 1412 4190:getstatic       #23  <Field Map c>
	// 1413 4193:ldc2            #1079 <String "INVALID_ARGUMENT">
	// 1414 4196:ldc2            #1081 <String "Transaction denied because of an invalid argument">
	// 1415 4199:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1416 4204:pop             
		c.put("INVALID_CITY_STATE_ZIP", "Invalid suburb/state/postcode combination.");
	// 1417 4205:getstatic       #23  <Field Map c>
	// 1418 4208:ldc2            #1083 <String "INVALID_CITY_STATE_ZIP">
	// 1419 4211:ldc2            #1085 <String "Invalid suburb/state/postcode combination.">
	// 1420 4214:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1421 4219:pop             
		c.put("INVALID_FACILITATOR_CONFIGURATION", "This transaction cannot be processed due to an invalid facilitator configuration.");
	// 1422 4220:getstatic       #23  <Field Map c>
	// 1423 4223:ldc2            #1087 <String "INVALID_FACILITATOR_CONFIGURATION">
	// 1424 4226:ldc2            #1089 <String "This transaction cannot be processed due to an invalid facilitator configuration.">
	// 1425 4229:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1426 4234:pop             
		c.put("INVALID_PAYER_ID", "System error (invalid Payer ID). Please try again later.");
	// 1427 4235:getstatic       #23  <Field Map c>
	// 1428 4238:ldc2            #1091 <String "INVALID_PAYER_ID">
	// 1429 4241:ldc2            #1093 <String "System error (invalid Payer ID). Please try again later.">
	// 1430 4244:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1431 4249:pop             
		c.put("INVALID_RESOURCE_ID", "System error. Please try again later.");
	// 1432 4250:getstatic       #23  <Field Map c>
	// 1433 4253:ldc2            #1095 <String "INVALID_RESOURCE_ID">
	// 1434 4256:ldc2            #659 <String "System error. Please try again later.">
	// 1435 4259:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1436 4264:pop             
		c.put("PAYEE_ACCOUNT_INVALID", "Vendor account does not have a confirmed email address.");
	// 1437 4265:getstatic       #23  <Field Map c>
	// 1438 4268:ldc2            #1097 <String "PAYEE_ACCOUNT_INVALID">
	// 1439 4271:ldc2            #1099 <String "Vendor account does not have a confirmed email address.">
	// 1440 4274:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1441 4279:pop             
		c.put("PAYEE_ACCOUNT_LOCKED_OR_CLOSED", "This vendor cannot receive payments at this time.");
	// 1442 4280:getstatic       #23  <Field Map c>
	// 1443 4283:ldc2            #1101 <String "PAYEE_ACCOUNT_LOCKED_OR_CLOSED">
	// 1444 4286:ldc2            #1103 <String "This vendor cannot receive payments at this time.">
	// 1445 4289:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1446 4294:pop             
		c.put("PAYEE_ACCOUNT_NO_CONFIRMED_EMAIL", "Vendor account does not have a confirmed email address.");
	// 1447 4295:getstatic       #23  <Field Map c>
	// 1448 4298:ldc2            #1105 <String "PAYEE_ACCOUNT_NO_CONFIRMED_EMAIL">
	// 1449 4301:ldc2            #1099 <String "Vendor account does not have a confirmed email address.">
	// 1450 4304:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1451 4309:pop             
		c.put("PAYEE_ACCOUNT_RESTRICTED", "This vendor cannot receive payments at this time.");
	// 1452 4310:getstatic       #23  <Field Map c>
	// 1453 4313:ldc2            #1107 <String "PAYEE_ACCOUNT_RESTRICTED">
	// 1454 4316:ldc2            #1103 <String "This vendor cannot receive payments at this time.">
	// 1455 4319:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1456 4324:pop             
		c.put("PAYER_ACCOUNT_LOCKED_OR_CLOSED", "Your account is locked or closed.");
	// 1457 4325:getstatic       #23  <Field Map c>
	// 1458 4328:ldc2            #1109 <String "PAYER_ACCOUNT_LOCKED_OR_CLOSED">
	// 1459 4331:ldc2            #1111 <String "Your account is locked or closed.">
	// 1460 4334:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1461 4339:pop             
		c.put("PAYER_ACCOUNT_RESTRICTED", "Your account has been limited.");
	// 1462 4340:getstatic       #23  <Field Map c>
	// 1463 4343:ldc2            #1113 <String "PAYER_ACCOUNT_RESTRICTED">
	// 1464 4346:ldc2            #1115 <String "Your account has been limited.">
	// 1465 4349:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1466 4354:pop             
		c.put("PAYER_CANNOT_PAY", "You cannot pay for this transaction with PayPal.");
	// 1467 4355:getstatic       #23  <Field Map c>
	// 1468 4358:ldc2            #1117 <String "PAYER_CANNOT_PAY">
	// 1469 4361:ldc2            #1119 <String "You cannot pay for this transaction with PayPal.">
	// 1470 4364:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1471 4369:pop             
		c.put("PAYER_EMPTY_BILLING_ADDRESS", "Billing address is required for non-PayPal credit card transactions.");
	// 1472 4370:getstatic       #23  <Field Map c>
	// 1473 4373:ldc2            #1121 <String "PAYER_EMPTY_BILLING_ADDRESS">
	// 1474 4376:ldc2            #1123 <String "Billing address is required for non-PayPal credit card transactions.">
	// 1475 4379:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1476 4384:pop             
		c.put("PAYER_ID_MISSING_FOR_CARD_TOKEN", "Cannot access saved card information.");
	// 1477 4385:getstatic       #23  <Field Map c>
	// 1478 4388:ldc2            #1125 <String "PAYER_ID_MISSING_FOR_CARD_TOKEN">
	// 1479 4391:ldc2            #1023 <String "Cannot access saved card information.">
	// 1480 4394:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1481 4399:pop             
		c.put("PAYMENT_APPROVAL_EXPIRED", "Payment approval has expired.");
	// 1482 4400:getstatic       #23  <Field Map c>
	// 1483 4403:ldc2            #1127 <String "PAYMENT_APPROVAL_EXPIRED">
	// 1484 4406:ldc2            #1129 <String "Payment approval has expired.">
	// 1485 4409:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1486 4414:pop             
		c.put("PAYMENT_EXPIRED", "The payment has expired.");
	// 1487 4415:getstatic       #23  <Field Map c>
	// 1488 4418:ldc2            #1131 <String "PAYMENT_EXPIRED">
	// 1489 4421:ldc2            #1133 <String "The payment has expired.">
	// 1490 4424:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1491 4429:pop             
		c.put("PAYMENT_NOT_APPROVED_FOR_EXECUTION", "Payer has not approved payment.");
	// 1492 4430:getstatic       #23  <Field Map c>
	// 1493 4433:ldc2            #1135 <String "PAYMENT_NOT_APPROVED_FOR_EXECUTION">
	// 1494 4436:ldc2            #1137 <String "Payer has not approved payment.">
	// 1495 4439:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1496 4444:pop             
		c.put("PAYMENT_REQUEST_ID_INVALID", "PayPal request ID is invalid. Please try again later.");
	// 1497 4445:getstatic       #23  <Field Map c>
	// 1498 4448:ldc2            #1139 <String "PAYMENT_REQUEST_ID_INVALID">
	// 1499 4451:ldc2            #1141 <String "PayPal request ID is invalid. Please try again later.">
	// 1500 4454:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1501 4459:pop             
		c.put("PAYMENT_STATE_INVALID", "This request is invalid due to the current state of the payment.");
	// 1502 4460:getstatic       #23  <Field Map c>
	// 1503 4463:ldc2            #1143 <String "PAYMENT_STATE_INVALID">
	// 1504 4466:ldc2            #1145 <String "This request is invalid due to the current state of the payment.">
	// 1505 4469:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1506 4474:pop             
		c.put("PERMISSION_DENIED", "No permission for the requested operation.");
	// 1507 4475:getstatic       #23  <Field Map c>
	// 1508 4478:ldc2            #1147 <String "PERMISSION_DENIED">
	// 1509 4481:ldc2            #1149 <String "No permission for the requested operation.">
	// 1510 4484:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1511 4489:pop             
		c.put("REFUND_EXCEEDED_TRANSACTION_AMOUNT", "The requested refund exceeds the amount of the original transaction.");
	// 1512 4490:getstatic       #23  <Field Map c>
	// 1513 4493:ldc2            #1151 <String "REFUND_EXCEEDED_TRANSACTION_AMOUNT">
	// 1514 4496:ldc2            #1153 <String "The requested refund exceeds the amount of the original transaction.">
	// 1515 4499:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1516 4504:pop             
		c.put("REFUND_TIME_LIMIT_EXCEEDED", "This transaction is too old to refund.");
	// 1517 4505:getstatic       #23  <Field Map c>
	// 1518 4508:ldc2            #1155 <String "REFUND_TIME_LIMIT_EXCEEDED">
	// 1519 4511:ldc2            #1157 <String "This transaction is too old to refund.">
	// 1520 4514:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1521 4519:pop             
		c.put("REQUIRED_SCOPE_MISSING", "System error. Please try again later.");
	// 1522 4520:getstatic       #23  <Field Map c>
	// 1523 4523:ldc2            #1159 <String "REQUIRED_SCOPE_MISSING">
	// 1524 4526:ldc2            #659 <String "System error. Please try again later.">
	// 1525 4529:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1526 4534:pop             
		c.put("TOO_MANY_REAUTHORIZATIONS", "No more reauthorisations for this authorisation are allowed.");
	// 1527 4535:getstatic       #23  <Field Map c>
	// 1528 4538:ldc2            #1161 <String "TOO_MANY_REAUTHORIZATIONS">
	// 1529 4541:ldc2            #1163 <String "No more reauthorisations for this authorisation are allowed.">
	// 1530 4544:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1531 4549:pop             
		c.put("TRANSACTION_ALREADY_REFUNDED", "This transaction has already been refunded.");
	// 1532 4550:getstatic       #23  <Field Map c>
	// 1533 4553:ldc2            #1165 <String "TRANSACTION_ALREADY_REFUNDED">
	// 1534 4556:ldc2            #1167 <String "This transaction has already been refunded.">
	// 1535 4559:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1536 4564:pop             
		c.put("TRANSACTION_LIMIT_EXCEEDED", "The amount exceeds the allowable limit.");
	// 1537 4565:getstatic       #23  <Field Map c>
	// 1538 4568:ldc2            #1169 <String "TRANSACTION_LIMIT_EXCEEDED">
	// 1539 4571:ldc2            #1019 <String "The amount exceeds the allowable limit.">
	// 1540 4574:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1541 4579:pop             
		c.put("TRANSACTION_REFUSED", "The transaction was denied.");
	// 1542 4580:getstatic       #23  <Field Map c>
	// 1543 4583:ldc2            #1171 <String "TRANSACTION_REFUSED">
	// 1544 4586:ldc2            #1173 <String "The transaction was denied.">
	// 1545 4589:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1546 4594:pop             
		c.put("TRANSACTION_REFUSED_BY_PAYPAL_RISK", "The transaction was denied.");
	// 1547 4595:getstatic       #23  <Field Map c>
	// 1548 4598:ldc2            #1175 <String "TRANSACTION_REFUSED_BY_PAYPAL_RISK">
	// 1549 4601:ldc2            #1173 <String "The transaction was denied.">
	// 1550 4604:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1551 4609:pop             
		c.put("TRANSACTION_REFUSED_PAYEE_PREFERENCE", "Merchant profile preference is set to automatically deny certain transactions.");
	// 1552 4610:getstatic       #23  <Field Map c>
	// 1553 4613:ldc2            #1177 <String "TRANSACTION_REFUSED_PAYEE_PREFERENCE">
	// 1554 4616:ldc2            #1179 <String "Merchant profile preference is set to automatically deny certain transactions.">
	// 1555 4619:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1556 4624:pop             
		c.put("UNKNOWN_ERROR", "System error. Please try again later.");
	// 1557 4625:getstatic       #23  <Field Map c>
	// 1558 4628:ldc2            #1181 <String "UNKNOWN_ERROR">
	// 1559 4631:ldc2            #659 <String "System error. Please try again later.">
	// 1560 4634:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1561 4639:pop             
		c.put("UNSUPPORTED_PAYEE_COUNTRY", "Your country is unsupported.");
	// 1562 4640:getstatic       #23  <Field Map c>
	// 1563 4643:ldc2            #1183 <String "UNSUPPORTED_PAYEE_COUNTRY">
	// 1564 4646:ldc2            #1185 <String "Your country is unsupported.">
	// 1565 4649:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1566 4654:pop             
		c.put("VALIDATION_ERROR", "The payment information is invalid. Please correct and submit again.");
	// 1567 4655:getstatic       #23  <Field Map c>
	// 1568 4658:ldc2            #1187 <String "VALIDATION_ERROR">
	// 1569 4661:ldc2            #1189 <String "The payment information is invalid. Please correct and submit again.">
	// 1570 4664:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1571 4669:pop             
		c.put("ORDER_ALREADY_COMPLETED", "Order has already been voided or completed, or has expired.");
	// 1572 4670:getstatic       #23  <Field Map c>
	// 1573 4673:ldc2            #1191 <String "ORDER_ALREADY_COMPLETED">
	// 1574 4676:ldc2            #1193 <String "Order has already been voided or completed, or has expired.">
	// 1575 4679:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1576 4684:pop             
		c.put("MAXIMUM_ALLOWED_AUTHORIZATION_REACHED_FOR_ORDER", "Maximum number of allowed authorisations for the order has been reached.");
	// 1577 4685:getstatic       #23  <Field Map c>
	// 1578 4688:ldc2            #1195 <String "MAXIMUM_ALLOWED_AUTHORIZATION_REACHED_FOR_ORDER">
	// 1579 4691:ldc2            #1197 <String "Maximum number of allowed authorisations for the order has been reached.">
	// 1580 4694:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1581 4699:pop             
		c.put("ORDER_VOIDED", "Order has been voided.");
	// 1582 4700:getstatic       #23  <Field Map c>
	// 1583 4703:ldc2            #1199 <String "ORDER_VOIDED">
	// 1584 4706:ldc2            #1201 <String "Order has been voided.">
	// 1585 4709:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1586 4714:pop             
		c.put("ORDER_CANNOT_BE_VOIDED", "Order is in a state which prevents voiding.");
	// 1587 4715:getstatic       #23  <Field Map c>
	// 1588 4718:ldc2            #1203 <String "ORDER_CANNOT_BE_VOIDED">
	// 1589 4721:ldc2            #1205 <String "Order is in a state which prevents voiding.">
	// 1590 4724:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1591 4729:pop             
		c.put("INVALID_EXPERIENCE_PROFILE_ID", "System error. Please try again later.");
	// 1592 4730:getstatic       #23  <Field Map c>
	// 1593 4733:ldc2            #1207 <String "INVALID_EXPERIENCE_PROFILE_ID">
	// 1594 4736:ldc2            #659 <String "System error. Please try again later.">
	// 1595 4739:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1596 4744:pop             
		c.put("UNAUTHORIZED_PAYMENT", "The merchant does not accept payments of this type.");
	// 1597 4745:getstatic       #23  <Field Map c>
	// 1598 4748:ldc2            #1209 <String "UNAUTHORIZED_PAYMENT">
	// 1599 4751:ldc2            #1211 <String "The merchant does not accept payments of this type.">
	// 1600 4754:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1601 4759:pop             
		c.put("DCC_UNSUPPORTED_CURRENCY_CC_TYPE", "Currency not supported for card type.");
	// 1602 4760:getstatic       #23  <Field Map c>
	// 1603 4763:ldc2            #1213 <String "DCC_UNSUPPORTED_CURRENCY_CC_TYPE">
	// 1604 4766:ldc2            #1215 <String "Currency not supported for card type.">
	// 1605 4769:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1606 4774:pop             
		c.put("DCC_CC_TYPE_NOT_SUPPORTED", "Card type not supported.");
	// 1607 4775:getstatic       #23  <Field Map c>
	// 1608 4778:ldc2            #1217 <String "DCC_CC_TYPE_NOT_SUPPORTED">
	// 1609 4781:ldc2            #1219 <String "Card type not supported.">
	// 1610 4784:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1611 4789:pop             
		c.put("ADDRESS_ADDITION_ERROR", "Error encountered while adding shipping address to PayPal account.");
	// 1612 4790:getstatic       #23  <Field Map c>
	// 1613 4793:ldc2            #1221 <String "ADDRESS_ADDITION_ERROR">
	// 1614 4796:ldc2            #1223 <String "Error encountered while adding shipping address to PayPal account.">
	// 1615 4799:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1616 4804:pop             
		c.put("DUPLICATE_TRANSACTION", "Duplicate transaction.");
	// 1617 4805:getstatic       #23  <Field Map c>
	// 1618 4808:ldc2            #1225 <String "DUPLICATE_TRANSACTION">
	// 1619 4811:ldc2            #1227 <String "Duplicate transaction.">
	// 1620 4814:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1621 4819:pop             
		c.put("INVALID_SHIPPING_ADDRESS", "The shipping address provided is not valid.");
	// 1622 4820:getstatic       #23  <Field Map c>
	// 1623 4823:ldc2            #1229 <String "INVALID_SHIPPING_ADDRESS">
	// 1624 4826:ldc2            #1231 <String "The shipping address provided is not valid.">
	// 1625 4829:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1626 4834:pop             
		c.put("PAYMENT_CREATION_ERROR", "There was a problem setting up this payment. Please visit the PayPal website to check your account.");
	// 1627 4835:getstatic       #23  <Field Map c>
	// 1628 4838:ldc2            #1233 <String "PAYMENT_CREATION_ERROR">
	// 1629 4841:ldc2            #1235 <String "There was a problem setting up this payment. Please visit the PayPal website to check your account.">
	// 1630 4844:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1631 4849:pop             
		c.put("PAYMENT_CREATION_ERROR_EXPIRED_PAYMENT_CARD", "There was a problem setting up this payment - your card has expired. Please visit the PayPal website to check your account.");
	// 1632 4850:getstatic       #23  <Field Map c>
	// 1633 4853:ldc2            #1237 <String "PAYMENT_CREATION_ERROR_EXPIRED_PAYMENT_CARD">
	// 1634 4856:ldc2            #1239 <String "There was a problem setting up this payment - your card has expired. Please visit the PayPal website to check your account.">
	// 1635 4859:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1636 4864:pop             
		c.put("PAYMENT_CREATION_ERROR_INSTANT_PAYMENT_REQUIRED", "There was a problem setting up this payment - instant payment required, such as a credit card. Please visit the PayPal website to check your account.");
	// 1637 4865:getstatic       #23  <Field Map c>
	// 1638 4868:ldc2            #1241 <String "PAYMENT_CREATION_ERROR_INSTANT_PAYMENT_REQUIRED">
	// 1639 4871:ldc2            #1243 <String "There was a problem setting up this payment - instant payment required, such as a credit card. Please visit the PayPal website to check your account.">
	// 1640 4874:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1641 4879:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_CONFIRMED_CARD", "There was a problem setting up this payment - card must be confirmed. Please visit the PayPal website to check your account.");
	// 1642 4880:getstatic       #23  <Field Map c>
	// 1643 4883:ldc2            #1245 <String "PAYMENT_CREATION_ERROR_NEED_CONFIRMED_CARD">
	// 1644 4886:ldc2            #1247 <String "There was a problem setting up this payment - card must be confirmed. Please visit the PayPal website to check your account.">
	// 1645 4889:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1646 4894:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_PHONE_NUMBER", "There was a problem setting up this payment - this app requires that your account include a phone number. Please visit the PayPal website to check your account.");
	// 1647 4895:getstatic       #23  <Field Map c>
	// 1648 4898:ldc2            #1249 <String "PAYMENT_CREATION_ERROR_NEED_PHONE_NUMBER">
	// 1649 4901:ldc2            #1251 <String "There was a problem setting up this payment - this app requires that your account include a phone number. Please visit the PayPal website to check your account.">
	// 1650 4904:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1651 4909:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_VALID_FUNDING_INSTRUMENT", "There was a problem setting up this payment - account needs a valid payment method, such as a bank account or payment card. Please visit the PayPal website to check your account.");
	// 1652 4910:getstatic       #23  <Field Map c>
	// 1653 4913:ldc2            #1253 <String "PAYMENT_CREATION_ERROR_NEED_VALID_FUNDING_INSTRUMENT">
	// 1654 4916:ldc2            #1255 <String "There was a problem setting up this payment - account needs a valid payment method, such as a bank account or payment card. Please visit the PayPal website to check your account.">
	// 1655 4919:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1656 4924:pop             
		c.put("PAYMENT_CREATION_ERROR_NEGATIVE_BALANCE", "There was a problem setting up this payment - your balance is negative. Please visit the PayPal website to check your account.");
	// 1657 4925:getstatic       #23  <Field Map c>
	// 1658 4928:ldc2            #1257 <String "PAYMENT_CREATION_ERROR_NEGATIVE_BALANCE">
	// 1659 4931:ldc2            #1259 <String "There was a problem setting up this payment - your balance is negative. Please visit the PayPal website to check your account.">
	// 1660 4934:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1661 4939:pop             
		c.put("PAYMENT_CREATION_ERROR_SENDING_LIMIT_REACHED", "There was a problem setting up this payment - your sending limit has been reached. Please visit the PayPal website to check your account.");
	// 1662 4940:getstatic       #23  <Field Map c>
	// 1663 4943:ldc2            #1261 <String "PAYMENT_CREATION_ERROR_SENDING_LIMIT_REACHED">
	// 1664 4946:ldc2            #1263 <String "There was a problem setting up this payment - your sending limit has been reached. Please visit the PayPal website to check your account.">
	// 1665 4949:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1666 4954:pop             
		c.put("AUTH_RC_RISK_FAILURE", "Declined due to risk.");
	// 1667 4955:getstatic       #23  <Field Map c>
	// 1668 4958:ldc2            #1265 <String "AUTH_RC_RISK_FAILURE">
	// 1669 4961:ldc2            #1267 <String "Declined due to risk.">
	// 1670 4964:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1671 4969:pop             
		c.put("AUTH_RC_OFAC_BLOCKED_IP", "Client not authorised.");
	// 1672 4970:getstatic       #23  <Field Map c>
	// 1673 4973:ldc2            #1269 <String "AUTH_RC_OFAC_BLOCKED_IP">
	// 1674 4976:ldc2            #1271 <String "Client not authorised.">
	// 1675 4979:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1676 4984:pop             
		c.put("AUTH_RC_IP_COMPLIANCE_FAILURE", "Client not authorised.");
	// 1677 4985:getstatic       #23  <Field Map c>
	// 1678 4988:ldc2            #1273 <String "AUTH_RC_IP_COMPLIANCE_FAILURE">
	// 1679 4991:ldc2            #1271 <String "Client not authorised.">
	// 1680 4994:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1681 4999:pop             
		c.put("invalid_user", "Incorrect username/password. Please try again.");
	// 1682 5000:getstatic       #23  <Field Map c>
	// 1683 5003:ldc2            #1275 <String "invalid_user">
	// 1684 5006:ldc2            #1277 <String "Incorrect username/password. Please try again.">
	// 1685 5009:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1686 5014:pop             
		c.put("locked_user", "Your PayPal account has been temporarily locked. Please try again later, or go to www.paypal.com to immediately unlock your PayPal account.");
	// 1687 5015:getstatic       #23  <Field Map c>
	// 1688 5018:ldc2            #1279 <String "locked_user">
	// 1689 5021:ldc2            #1281 <String "Your PayPal account has been temporarily locked. Please try again later, or go to www.paypal.com to immediately unlock your PayPal account.">
	// 1690 5024:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1691 5029:pop             
		c.put("max_attempts_exceeded", "Too many failed login attempts. Please try again later.");
	// 1692 5030:getstatic       #23  <Field Map c>
	// 1693 5033:ldc2            #1283 <String "max_attempts_exceeded">
	// 1694 5036:ldc2            #1285 <String "Too many failed login attempts. Please try again later.">
	// 1695 5039:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1696 5044:pop             
		c.put("invalid_request", "An error has occurred.");
	// 1697 5045:getstatic       #23  <Field Map c>
	// 1698 5048:ldc2            #1287 <String "invalid_request">
	// 1699 5051:ldc2            #1289 <String "An error has occurred.">
	// 1700 5054:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1701 5059:pop             
		c.put("unauthorized_client", "Request not authorised.");
	// 1702 5060:getstatic       #23  <Field Map c>
	// 1703 5063:ldc2            #1291 <String "unauthorized_client">
	// 1704 5066:ldc2            #1293 <String "Request not authorised.">
	// 1705 5069:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1706 5074:pop             
		c.put("access_denied", "Request not authorised.");
	// 1707 5075:getstatic       #23  <Field Map c>
	// 1708 5078:ldc2            #1295 <String "access_denied">
	// 1709 5081:ldc2            #1293 <String "Request not authorised.">
	// 1710 5084:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1711 5089:pop             
		c.put("unsupported_response_type", "An error has occurred.");
	// 1712 5090:getstatic       #23  <Field Map c>
	// 1713 5093:ldc2            #1297 <String "unsupported_response_type">
	// 1714 5096:ldc2            #1289 <String "An error has occurred.">
	// 1715 5099:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1716 5104:pop             
		c.put("invalid_scope", "Request not authorised.");
	// 1717 5105:getstatic       #23  <Field Map c>
	// 1718 5108:ldc2            #1299 <String "invalid_scope">
	// 1719 5111:ldc2            #1293 <String "Request not authorised.">
	// 1720 5114:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1721 5119:pop             
		c.put("server_error", "System error. Please try again later.");
	// 1722 5120:getstatic       #23  <Field Map c>
	// 1723 5123:ldc2            #1301 <String "server_error">
	// 1724 5126:ldc2            #659 <String "System error. Please try again later.">
	// 1725 5129:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1726 5134:pop             
		c.put("temporarily_unavailable", "System error. Please try again later.");
	// 1727 5135:getstatic       #23  <Field Map c>
	// 1728 5138:ldc2            #1303 <String "temporarily_unavailable">
	// 1729 5141:ldc2            #659 <String "System error. Please try again later.">
	// 1730 5144:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1731 5149:pop             
		c.put("stepup_required", "Your login cannot be completed at this time. Please try again later, or go to www.paypal.com to address any security concerns with your PayPal account.");
	// 1732 5150:getstatic       #23  <Field Map c>
	// 1733 5153:ldc2            #1305 <String "stepup_required">
	// 1734 5156:ldc2            #1307 <String "Your login cannot be completed at this time. Please try again later, or go to www.paypal.com to address any security concerns with your PayPal account.">
	// 1735 5159:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1736 5164:pop             
		c.put("account_locked_generate_challenge_limit_exceeded", "Too many login attempts. Please try again later or contact PayPal for help.");
	// 1737 5165:getstatic       #23  <Field Map c>
	// 1738 5168:ldc2            #1309 <String "account_locked_generate_challenge_limit_exceeded">
	// 1739 5171:ldc2            #1311 <String "Too many login attempts. Please try again later or contact PayPal for help.">
	// 1740 5174:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1741 5179:pop             
	// 1742 5180:return          
	}

	public final String a()
	{
		return "en_AU";
	//    0    0:ldc2            #1314 <String "en_AU">
	//    1    3:areturn         
	}

	public final String a(Enum enum, String s)
	{
		enum = ((Enum) ((fc)enum));
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class fc>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #1317 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #1318 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(((fc) (enum)).toString());
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1321 <Method String fc.toString()>
	//   10   18:invokevirtual   #1325 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("|");
	//   12   22:aload_3         
	//   13   23:ldc2            #1327 <String "|">
	//   14   26:invokevirtual   #1325 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #1325 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		s = stringbuilder.toString();
	//   20   36:aload_3         
	//   21   37:invokevirtual   #1328 <Method String StringBuilder.toString()>
	//   22   40:astore_2        
		if(b.containsKey(((Object) (s))))
	//*  23   41:getstatic       #21  <Field Map b>
	//*  24   44:aload_2         
	//*  25   45:invokeinterface #1332 <Method boolean Map.containsKey(Object)>
	//*  26   50:ifeq            68
			enum = ((Enum) (b.get(((Object) (s)))));
	//   27   53:getstatic       #21  <Field Map b>
	//   28   56:aload_2         
	//   29   57:invokeinterface #1336 <Method Object Map.get(Object)>
	//   30   62:astore_1        
		else
	//*  31   63:aload_1         
	//*  32   64:checkcast       #1338 <Class String>
	//*  33   67:areturn         
			enum = ((Enum) (a.get(((Object) (enum)))));
	//   34   68:getstatic       #19  <Field Map a>
	//   35   71:aload_1         
	//   36   72:invokeinterface #1336 <Method Object Map.get(Object)>
	//   37   77:astore_1        
		return (String)enum;
	//*  38   78:goto            63
	}

	public final String a(String s)
	{
		return (String)c.get(((Object) (s)));
	//    0    0:getstatic       #23  <Field Map c>
	//    1    3:aload_1         
	//    2    4:invokeinterface #1336 <Method Object Map.get(Object)>
	//    3    9:checkcast       #1338 <Class String>
	//    4   12:areturn         
	}

	private static final Map a = new HashMap();
	private static final Map b = new HashMap();
	private static final Map c = new HashMap();

	static 
	{
	//    0    0:new             #14  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void HashMap()>
	//    3    7:putstatic       #19  <Field Map a>
	//    4   10:new             #14  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #17  <Method void HashMap()>
	//    7   17:putstatic       #21  <Field Map b>
	//    8   20:new             #14  <Class HashMap>
	//    9   23:dup             
	//   10   24:invokespecial   #17  <Method void HashMap()>
	//   11   27:putstatic       #23  <Field Map c>
	//*  12   30:return          
	}
}
