// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk:
//			ga, fc

public final class gq
	implements ga
{

	public gq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a.put(((Object) (fc.a)), "Godta og betal");
	//    2    4:getstatic       #19  <Field Map a>
	//    3    7:getstatic       #30  <Field fc fc.a>
	//    4   10:ldc1            #32  <String "Godta og betal">
	//    5   12:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    6   17:pop             
		a.put(((Object) (fc.b)), "og andre");
	//    7   18:getstatic       #19  <Field Map a>
	//    8   21:getstatic       #40  <Field fc fc.b>
	//    9   24:ldc1            #42  <String "og andre">
	//   10   26:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   11   31:pop             
		a.put(((Object) (fc.c)), "Godkjenner");
	//   12   32:getstatic       #19  <Field Map a>
	//   13   35:getstatic       #44  <Field fc fc.c>
	//   14   38:ldc1            #46  <String "Godkjenner">
	//   15   40:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   16   45:pop             
		a.put(((Object) (fc.d)), "Tilbake");
	//   17   46:getstatic       #19  <Field Map a>
	//   18   49:getstatic       #49  <Field fc fc.d>
	//   19   52:ldc1            #51  <String "Tilbake">
	//   20   54:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   21   59:pop             
		a.put(((Object) (fc.e)), "Reserve");
	//   22   60:getstatic       #19  <Field Map a>
	//   23   63:getstatic       #54  <Field fc fc.e>
	//   24   66:ldc1            #56  <String "Reserve">
	//   25   68:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//   26   73:pop             
		a.put(((Object) (fc.f)), "Avbryt");
	//   27   74:getstatic       #19  <Field Map a>
	//   28   77:getstatic       #59  <Field fc fc.f>
	//   29   80:ldc1            #61  <String "Avbryt">
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
		a.put(((Object) (fc.w)), "Endre betalingsmetode");
	//  112  312:getstatic       #19  <Field Map a>
	//  113  315:getstatic       #144 <Field fc fc.w>
	//  114  318:ldc1            #146 <String "Endre betalingsmetode">
	//  115  320:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  116  325:pop             
		a.put(((Object) (fc.x)), "Brukskonto");
	//  117  326:getstatic       #19  <Field Map a>
	//  118  329:getstatic       #149 <Field fc fc.x>
	//  119  332:ldc1            #151 <String "Brukskonto">
	//  120  334:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  121  339:pop             
		a.put(((Object) (fc.y)), "Kontrollerer denne enheten \u2026");
	//  122  340:getstatic       #19  <Field Map a>
	//  123  343:getstatic       #154 <Field fc fc.y>
	//  124  346:ldc1            #156 <String "Kontrollerer denne enheten \u2026">
	//  125  348:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  126  353:pop             
		a.put(((Object) (fc.z)), "Fjern kortopplysningene");
	//  127  354:getstatic       #19  <Field Map a>
	//  128  357:getstatic       #159 <Field fc fc.z>
	//  129  360:ldc1            #161 <String "Fjern kortopplysningene">
	//  130  362:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  131  367:pop             
		a.put(((Object) (fc.A)), "Bekreft");
	//  132  368:getstatic       #19  <Field Map a>
	//  133  371:getstatic       #164 <Field fc fc.A>
	//  134  374:ldc1            #166 <String "Bekreft">
	//  135  376:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  136  381:pop             
		a.put(((Object) (fc.B)), "Er du sikker p\345 at du vil fjerne kortopplysningene dine?");
	//  137  382:getstatic       #19  <Field Map a>
	//  138  385:getstatic       #169 <Field fc fc.B>
	//  139  388:ldc1            #171 <String "Er du sikker p\345 at du vil fjerne kortopplysningene dine?">
	//  140  390:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  141  395:pop             
		a.put(((Object) (fc.C)), "Belast kortet");
	//  142  396:getstatic       #19  <Field Map a>
	//  143  399:getstatic       #174 <Field fc fc.C>
	//  144  402:ldc1            #176 <String "Belast kortet">
	//  145  404:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  146  409:pop             
		a.put(((Object) (fc.D)), "Er du sikker p\345 at du vil logge av PayPal?");
	//  147  410:getstatic       #19  <Field Map a>
	//  148  413:getstatic       #179 <Field fc fc.D>
	//  149  416:ldc1            #181 <String "Er du sikker p\345 at du vil logge av PayPal?">
	//  150  418:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  151  423:pop             
		a.put(((Object) (fc.E)), "Betal");
	//  152  424:getstatic       #19  <Field Map a>
	//  153  427:getstatic       #184 <Field fc fc.E>
	//  154  430:ldc1            #186 <String "Betal">
	//  155  432:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  156  437:pop             
		a.put(((Object) (fc.F)), "Godta");
	//  157  438:getstatic       #19  <Field Map a>
	//  158  441:getstatic       #189 <Field fc fc.F>
	//  159  444:ldc1            #191 <String "Godta">
	//  160  446:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  161  451:pop             
		a.put(((Object) (fc.G)), "Opprettelsesdato for kontoen");
	//  162  452:getstatic       #19  <Field Map a>
	//  163  455:getstatic       #194 <Field fc fc.G>
	//  164  458:ldc1            #196 <String "Opprettelsesdato for kontoen">
	//  165  460:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  166  465:pop             
		a.put(((Object) (fc.H)), "Kontostatus");
	//  167  466:getstatic       #19  <Field Map a>
	//  168  469:getstatic       #199 <Field fc fc.H>
	//  169  472:ldc1            #201 <String "Kontostatus">
	//  170  474:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  171  479:pop             
		a.put(((Object) (fc.I)), "Kontotype");
	//  172  480:getstatic       #19  <Field Map a>
	//  173  483:getstatic       #204 <Field fc fc.I>
	//  174  486:ldc1            #206 <String "Kontotype">
	//  175  488:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  176  493:pop             
		a.put(((Object) (fc.J)), "Adresse");
	//  177  494:getstatic       #19  <Field Map a>
	//  178  497:getstatic       #209 <Field fc fc.J>
	//  179  500:ldc1            #211 <String "Adresse">
	//  180  502:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  181  507:pop             
		a.put(((Object) (fc.K)), "Aldersgruppe");
	//  182  508:getstatic       #19  <Field Map a>
	//  183  511:getstatic       #214 <Field fc fc.K>
	//  184  514:ldc1            #216 <String "Aldersgruppe">
	//  185  516:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  186  521:pop             
		a.put(((Object) (fc.L)), "F\370dselsdato");
	//  187  522:getstatic       #19  <Field Map a>
	//  188  525:getstatic       #219 <Field fc fc.L>
	//  189  528:ldc1            #221 <String "F\370dselsdato">
	//  190  530:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  191  535:pop             
		a.put(((Object) (fc.M)), "E-postadresse");
	//  192  536:getstatic       #19  <Field Map a>
	//  193  539:getstatic       #224 <Field fc fc.M>
	//  194  542:ldc1            #226 <String "E-postadresse">
	//  195  544:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  196  549:pop             
		a.put(((Object) (fc.N)), "Fullt navn");
	//  197  550:getstatic       #19  <Field Map a>
	//  198  553:getstatic       #229 <Field fc fc.N>
	//  199  556:ldc1            #231 <String "Fullt navn">
	//  200  558:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  201  563:pop             
		a.put(((Object) (fc.O)), "Kj\370nn");
	//  202  564:getstatic       #19  <Field Map a>
	//  203  567:getstatic       #234 <Field fc fc.O>
	//  204  570:ldc1            #236 <String "Kj\370nn">
	//  205  572:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  206  577:pop             
		a.put(((Object) (fc.P)), "Spr\345k");
	//  207  578:getstatic       #19  <Field Map a>
	//  208  581:getstatic       #239 <Field fc fc.P>
	//  209  584:ldc1            #241 <String "Spr\345k">
	//  210  586:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  211  591:pop             
		a.put(((Object) (fc.Q)), "Norsk, Norge");
	//  212  592:getstatic       #19  <Field Map a>
	//  213  595:getstatic       #244 <Field fc fc.Q>
	//  214  598:ldc1            #246 <String "Norsk, Norge">
	//  215  600:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  216  605:pop             
		a.put(((Object) (fc.R)), "Telefon");
	//  217  606:getstatic       #19  <Field Map a>
	//  218  609:getstatic       #249 <Field fc fc.R>
	//  219  612:ldc1            #251 <String "Telefon">
	//  220  614:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  221  619:pop             
		a.put(((Object) (fc.S)), "Tidssone");
	//  222  620:getstatic       #19  <Field Map a>
	//  223  623:getstatic       #254 <Field fc fc.S>
	//  224  626:ldc2            #256 <String "Tidssone">
	//  225  629:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  226  634:pop             
		a.put(((Object) (fc.T)), "Del f\370lgende: %s.");
	//  227  635:getstatic       #19  <Field Map a>
	//  228  638:getstatic       #259 <Field fc fc.T>
	//  229  641:ldc2            #261 <String "Del f\370lgende: %s.">
	//  230  644:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  231  649:pop             
		a.put(((Object) (fc.U)), "Bruk s\370ml\370s betaling.");
	//  232  650:getstatic       #19  <Field Map a>
	//  233  653:getstatic       #264 <Field fc fc.U>
	//  234  656:ldc2            #266 <String "Bruk s\370ml\370s betaling.">
	//  235  659:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  236  664:pop             
		a.put(((Object) (fc.V)), "%s ber om at du:");
	//  237  665:getstatic       #19  <Field Map a>
	//  238  668:getstatic       #269 <Field fc fc.V>
	//  239  671:ldc2            #271 <String "%s ber om at du:">
	//  240  674:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  241  679:pop             
		a.put(((Object) (fc.W)), "Del <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.");
	//  242  680:getstatic       #19  <Field Map a>
	//  243  683:getstatic       #274 <Field fc fc.W>
	//  244  686:ldc2            #276 <String "Del <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.">
	//  245  689:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  246  694:pop             
		a.put(((Object) (fc.X)), "Aktiver visning av finansieringskilder slik at du kan velge en.");
	//  247  695:getstatic       #19  <Field Map a>
	//  248  698:getstatic       #279 <Field fc fc.X>
	//  249  701:ldc2            #281 <String "Aktiver visning av finansieringskilder slik at du kan velge en.">
	//  250  704:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  251  709:pop             
		a.put(((Object) (fc.Y)), "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.");
	//  252  710:getstatic       #19  <Field Map a>
	//  253  713:getstatic       #284 <Field fc fc.Y>
	//  254  716:ldc2            #286 <String "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.">
	//  255  719:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  256  724:pop             
		a.put(((Object) (fc.Z)), "Tillater at de legger til og administrerer et fordelskort i PayPal-lommeboken din.");
	//  257  725:getstatic       #19  <Field Map a>
	//  258  728:getstatic       #289 <Field fc fc.Z>
	//  259  731:ldc2            #291 <String "Tillater at de legger til og administrerer et fordelskort i PayPal-lommeboken din.">
	//  260  734:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  261  739:pop             
		a.put(((Object) (fc.aa)), "Godtar %1$s sine <a href='%2$s'>retningslinjer for personvern</a> og <a href='%3$s'>brukeravtale</a>.");
	//  262  740:getstatic       #19  <Field Map a>
	//  263  743:getstatic       #294 <Field fc fc.aa>
	//  264  746:ldc2            #296 <String "Godtar %1$s sine <a href='%2$s'>retningslinjer for personvern</a> og <a href='%3$s'>brukeravtale</a>.">
	//  265  749:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  266  754:pop             
		a.put(((Object) (fc.ab)), "Gi vedkommende tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  267  755:getstatic       #19  <Field Map a>
	//  268  758:getstatic       #299 <Field fc fc.ab>
	//  269  761:ldc2            #301 <String "Gi vedkommende tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  270  764:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  271  769:pop             
		a.put(((Object) (fc.ac)), "Gi vedkommende tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  272  770:getstatic       #19  <Field Map a>
	//  273  773:getstatic       #304 <Field fc fc.ac>
	//  274  776:ldc2            #306 <String "Gi vedkommende tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  275  779:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  276  784:pop             
		a.put(((Object) (fc.ad)), "Godta");
	//  277  785:getstatic       #19  <Field Map a>
	//  278  788:getstatic       #309 <Field fc fc.ad>
	//  279  791:ldc1            #191 <String "Godta">
	//  280  793:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  281  798:pop             
		a.put(((Object) (fc.ae)), "E-postadresse");
	//  282  799:getstatic       #19  <Field Map a>
	//  283  802:getstatic       #312 <Field fc fc.ae>
	//  284  805:ldc1            #226 <String "E-postadresse">
	//  285  807:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  286  812:pop             
		a.put(((Object) (fc.af)), "Eksempeldata");
	//  287  813:getstatic       #19  <Field Map a>
	//  288  816:getstatic       #315 <Field fc fc.af>
	//  289  819:ldc2            #317 <String "Eksempeldata">
	//  290  822:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  291  827:pop             
		a.put(((Object) (fc.ag)), "Sandbox");
	//  292  828:getstatic       #19  <Field Map a>
	//  293  831:getstatic       #320 <Field fc fc.ag>
	//  294  834:ldc2            #322 <String "Sandbox">
	//  295  837:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  296  842:pop             
		a.put(((Object) (fc.ah)), "Utl\370per");
	//  297  843:getstatic       #19  <Field Map a>
	//  298  846:getstatic       #325 <Field fc fc.ah>
	//  299  849:ldc2            #327 <String "Utl\370per">
	//  300  852:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  301  857:pop             
		a.put(((Object) (fc.ai)), "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av betalingsmetodene dine som er tilgjengelige for bruk.</p>");
	//  302  858:getstatic       #19  <Field Map a>
	//  303  861:getstatic       #330 <Field fc fc.ai>
	//  304  864:ldc2            #332 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av betalingsmetodene dine som er tilgjengelige for bruk.</p>">
	//  305  867:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  306  872:pop             
		a.put(((Object) (fc.aj)), "Har du glemt passordet?");
	//  307  873:getstatic       #19  <Field Map a>
	//  308  876:getstatic       #335 <Field fc fc.aj>
	//  309  879:ldc2            #337 <String "Har du glemt passordet?">
	//  310  882:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  311  887:pop             
		a.put(((Object) (fc.ak)), "Fra");
	//  312  888:getstatic       #19  <Field Map a>
	//  313  891:getstatic       #340 <Field fc fc.ak>
	//  314  894:ldc2            #342 <String "Fra">
	//  315  897:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  316  902:pop             
		a.put(((Object) (fc.al)), "Hvordan vil du finansiere fremtidige betalinger til %1$s er?");
	//  317  903:getstatic       #19  <Field Map a>
	//  318  906:getstatic       #345 <Field fc fc.al>
	//  319  909:ldc2            #347 <String "Hvordan vil du finansiere fremtidige betalinger til %1$s er?">
	//  320  912:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  321  917:pop             
		a.put(((Object) (fc.am)), "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Den standard finansieringskilden din brukes til \345 utf\370re fremtidige PayPal-betalinger for denne forhandleren.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Regelmessig betaling-delen av <a href='%s'>PayPals brukeravtale</a> er gjeldende.</p><p>For \345 kontrollere at betalinger fungerer med PayPal-kontoen din, kan denne appen simulere en liten pr\370vetransaksjonen, men ingen penger overf\370res.</p>");
	//  322  918:getstatic       #19  <Field Map a>
	//  323  921:getstatic       #350 <Field fc fc.am>
	//  324  924:ldc2            #352 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Den standard finansieringskilden din brukes til \345 utf\370re fremtidige PayPal-betalinger for denne forhandleren.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Regelmessig betaling-delen av <a href='%s'>PayPals brukeravtale</a> er gjeldende.</p><p>For \345 kontrollere at betalinger fungerer med PayPal-kontoen din, kan denne appen simulere en liten pr\370vetransaksjonen, men ingen penger overf\370res.</p>">
	//  325  927:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  326  932:pop             
		a.put(((Object) (fc.an)), "Intern feil");
	//  327  933:getstatic       #19  <Field Map a>
	//  328  936:getstatic       #355 <Field fc fc.an>
	//  329  939:ldc2            #357 <String "Intern feil">
	//  330  942:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  331  947:pop             
		a.put(((Object) (fc.ao)), "<p>Ved \345 klikke p\345 knappen nedenfor, godtar jeg vilk\345rene i <a href='%1$s'>PayPals brukeravtale</a> og jeg erkl\346rer samtidig at jeg overholder japanske lover og forskrifter, herunder sanksjonsbestemmelser om betalinger til Nord-Korea og Iran, i tr\345d med japansk <a href='%2$s'>lovgivning om handel med utenlandske produkter og valuta</a>, for \345 fullf\370re transaksjonen.</p>");
	//  332  948:getstatic       #19  <Field Map a>
	//  333  951:getstatic       #360 <Field fc fc.ao>
	//  334  954:ldc2            #362 <String "<p>Ved \345 klikke p\345 knappen nedenfor, godtar jeg vilk\345rene i <a href='%1$s'>PayPals brukeravtale</a> og jeg erkl\346rer samtidig at jeg overholder japanske lover og forskrifter, herunder sanksjonsbestemmelser om betalinger til Nord-Korea og Iran, i tr\345d med japansk <a href='%2$s'>lovgivning om handel med utenlandske produkter og valuta</a>, for \345 fullf\370re transaksjonen.</p>">
	//  335  957:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  336  962:pop             
		a.put(((Object) (fc.ap)), "Logg p\345");
	//  337  963:getstatic       #19  <Field Map a>
	//  338  966:getstatic       #365 <Field fc fc.ap>
	//  339  969:ldc2            #367 <String "Logg p\345">
	//  340  972:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  341  977:pop             
		a.put(((Object) (fc.aq)), "Logg p\345 med PayPal");
	//  342  978:getstatic       #19  <Field Map a>
	//  343  981:getstatic       #370 <Field fc fc.aq>
	//  344  984:ldc2            #372 <String "Logg p\345 med PayPal">
	//  345  987:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  346  992:pop             
		a.put(((Object) (fc.ar)), "Logg ut");
	//  347  993:getstatic       #19  <Field Map a>
	//  348  996:getstatic       #375 <Field fc fc.ar>
	//  349  999:ldc2            #377 <String "Logg ut">
	//  350 1002:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  351 1007:pop             
		a.put(((Object) (fc.as)), "Logg ut");
	//  352 1008:getstatic       #19  <Field Map a>
	//  353 1011:getstatic       #380 <Field fc fc.as>
	//  354 1014:ldc2            #377 <String "Logg ut">
	//  355 1017:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  356 1022:pop             
		a.put(((Object) (fc.at)), "OK");
	//  357 1023:getstatic       #19  <Field Map a>
	//  358 1026:getstatic       #383 <Field fc fc.at>
	//  359 1029:ldc2            #385 <String "OK">
	//  360 1032:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  361 1037:pop             
		a.put(((Object) (fc.au)), "Passord");
	//  362 1038:getstatic       #19  <Field Map a>
	//  363 1041:getstatic       #388 <Field fc fc.au>
	//  364 1044:ldc2            #390 <String "Passord">
	//  365 1047:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  366 1052:pop             
		a.put(((Object) (fc.av)), "Betal etter levering");
	//  367 1053:getstatic       #19  <Field Map a>
	//  368 1056:getstatic       #393 <Field fc fc.av>
	//  369 1059:ldc2            #395 <String "Betal etter levering">
	//  370 1062:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  371 1067:pop             
		a.put(((Object) (fc.aw)), "Betal med");
	//  372 1068:getstatic       #19  <Field Map a>
	//  373 1071:getstatic       #398 <Field fc fc.aw>
	//  374 1074:ldc2            #400 <String "Betal med">
	//  375 1077:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  376 1082:pop             
		a.put(((Object) (fc.ax)), "Betal med kort");
	//  377 1083:getstatic       #19  <Field Map a>
	//  378 1086:getstatic       #403 <Field fc fc.ax>
	//  379 1089:ldc2            #405 <String "Betal med kort">
	//  380 1092:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  381 1097:pop             
		a.put(((Object) (fc.ay)), "PayPal-saldo");
	//  382 1098:getstatic       #19  <Field Map a>
	//  383 1101:getstatic       #408 <Field fc fc.ay>
	//  384 1104:ldc2            #410 <String "PayPal-saldo">
	//  385 1107:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  386 1112:pop             
		a.put(((Object) (fc.az)), "PayPal Credit");
	//  387 1113:getstatic       #19  <Field Map a>
	//  388 1116:getstatic       #413 <Field fc fc.az>
	//  389 1119:ldc2            #415 <String "PayPal Credit">
	//  390 1122:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  391 1127:pop             
		a.put(((Object) (fc.aA)), "Telefonnummer");
	//  392 1128:getstatic       #19  <Field Map a>
	//  393 1131:getstatic       #418 <Field fc fc.aA>
	//  394 1134:ldc2            #420 <String "Telefonnummer">
	//  395 1137:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  396 1142:pop             
		a.put(((Object) (fc.aB)), "PIN-kode");
	//  397 1143:getstatic       #19  <Field Map a>
	//  398 1146:getstatic       #423 <Field fc fc.aB>
	//  399 1149:ldc2            #425 <String "PIN-kode">
	//  400 1152:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  401 1157:pop             
		a.put(((Object) (fc.aC)), "Foretrukket betalingsmetode");
	//  402 1158:getstatic       #19  <Field Map a>
	//  403 1161:getstatic       #428 <Field fc fc.aC>
	//  404 1164:ldc2            #430 <String "Foretrukket betalingsmetode">
	//  405 1167:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  406 1172:pop             
		a.put(((Object) (fc.aD)), "PayPal beskytter <a href='%s'>personvern</a>-opplysningene dine og den \370konomiske informasjonen din.");
	//  407 1173:getstatic       #19  <Field Map a>
	//  408 1176:getstatic       #433 <Field fc fc.aD>
	//  409 1179:ldc2            #435 <String "PayPal beskytter <a href='%s'>personvern</a>-opplysningene dine og den \370konomiske informasjonen din.">
	//  410 1182:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  411 1187:pop             
		a.put(((Object) (fc.aE)), "Behandler");
	//  412 1188:getstatic       #19  <Field Map a>
	//  413 1191:getstatic       #438 <Field fc fc.aE>
	//  414 1194:ldc2            #440 <String "Behandler">
	//  415 1197:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  416 1202:pop             
		a.put(((Object) (fc.aF)), "Husk kortet");
	//  417 1203:getstatic       #19  <Field Map a>
	//  418 1206:getstatic       #443 <Field fc fc.aF>
	//  419 1209:ldc2            #445 <String "Husk kortet">
	//  420 1212:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  421 1217:pop             
		a.put(((Object) (fc.aG)), "Pengeforesp\370rsel");
	//  422 1218:getstatic       #19  <Field Map a>
	//  423 1221:getstatic       #448 <Field fc fc.aG>
	//  424 1224:ldc2            #450 <String "Pengeforesp\370rsel">
	//  425 1227:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  426 1232:pop             
		a.put(((Object) (fc.aH)), "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	//  427 1233:getstatic       #19  <Field Map a>
	//  428 1236:getstatic       #453 <Field fc fc.aH>
	//  429 1239:ldc2            #455 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	//  430 1242:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  431 1247:pop             
		a.put(((Object) (fc.aI)), "Sparekonto");
	//  432 1248:getstatic       #19  <Field Map a>
	//  433 1251:getstatic       #458 <Field fc fc.aI>
	//  434 1254:ldc2            #460 <String "Sparekonto">
	//  435 1257:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  436 1262:pop             
		a.put(((Object) (fc.aJ)), "Betal/overf\370r");
	//  437 1263:getstatic       #19  <Field Map a>
	//  438 1266:getstatic       #463 <Field fc fc.aJ>
	//  439 1269:ldc2            #465 <String "Betal/overf\370r">
	//  440 1272:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  441 1277:pop             
		a.put(((Object) (fc.aK)), "Det var et kommunikasjonsproblem med PayPal-serverne. Pr\370v p\345 nytt.");
	//  442 1278:getstatic       #19  <Field Map a>
	//  443 1281:getstatic       #468 <Field fc fc.aK>
	//  444 1284:ldc2            #470 <String "Det var et kommunikasjonsproblem med PayPal-serverne. Pr\370v p\345 nytt.">
	//  445 1287:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  446 1292:pop             
		a.put(((Object) (fc.aL)), "Logg deg p\345 PayPal p\345 nytt.");
	//  447 1293:getstatic       #19  <Field Map a>
	//  448 1296:getstatic       #473 <Field fc fc.aL>
	//  449 1299:ldc2            #475 <String "Logg deg p\345 PayPal p\345 nytt.">
	//  450 1302:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  451 1307:pop             
		a.put(((Object) (fc.aM)), "\330kten er utl\370pt");
	//  452 1308:getstatic       #19  <Field Map a>
	//  453 1311:getstatic       #478 <Field fc fc.aM>
	//  454 1314:ldc2            #480 <String "\330kten er utl\370pt">
	//  455 1317:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  456 1322:pop             
		a.put(((Object) (fc.aN)), "Leveringsadresse");
	//  457 1323:getstatic       #19  <Field Map a>
	//  458 1326:getstatic       #483 <Field fc fc.aN>
	//  459 1329:ldc2            #485 <String "Leveringsadresse">
	//  460 1332:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  461 1337:pop             
		a.put(((Object) (fc.aO)), "Ny p\345 PayPal? Opprett konto");
	//  462 1338:getstatic       #19  <Field Map a>
	//  463 1341:getstatic       #488 <Field fc fc.aO>
	//  464 1344:ldc2            #490 <String "Ny p\345 PayPal? Opprett konto">
	//  465 1347:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  466 1352:pop             
		a.put(((Object) (fc.aP)), "Forbli p\345logget");
	//  467 1353:getstatic       #19  <Field Map a>
	//  468 1356:getstatic       #493 <Field fc fc.aP>
	//  469 1359:ldc2            #495 <String "Forbli p\345logget">
	//  470 1362:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  471 1367:pop             
		a.put(((Object) (fc.aQ)), "Systemfeil (%s). Pr\370v p\345 nytt senere.");
	//  472 1368:getstatic       #19  <Field Map a>
	//  473 1371:getstatic       #498 <Field fc fc.aQ>
	//  474 1374:ldc2            #500 <String "Systemfeil (%s). Pr\370v p\345 nytt senere.">
	//  475 1377:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  476 1382:pop             
		a.put(((Object) (fc.aR)), "Pr\370v p\345 nytt");
	//  477 1383:getstatic       #19  <Field Map a>
	//  478 1386:getstatic       #503 <Field fc fc.aR>
	//  479 1389:ldc2            #505 <String "Pr\370v p\345 nytt">
	//  480 1392:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  481 1397:pop             
		a.put(((Object) (fc.aS)), "Kan ikke logge p\345, fordi p\345loggingen til kontoen din har godkjenning med to faktorer.");
	//  482 1398:getstatic       #19  <Field Map a>
	//  483 1401:getstatic       #508 <Field fc fc.aS>
	//  484 1404:ldc2            #510 <String "Kan ikke logge p\345, fordi p\345loggingen til kontoen din har godkjenning med to faktorer.">
	//  485 1407:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  486 1412:pop             
		a.put(((Object) (fc.aT)), "Sikkerhetskode");
	//  487 1413:getstatic       #19  <Field Map a>
	//  488 1416:getstatic       #513 <Field fc fc.aT>
	//  489 1419:ldc2            #515 <String "Sikkerhetskode">
	//  490 1422:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  491 1427:pop             
		a.put(((Object) (fc.aU)), "Send en tekstmelding til telefonen din. Den 6-sifrede koden du mottar, er gyldig i 5 minutter.");
	//  492 1428:getstatic       #19  <Field Map a>
	//  493 1431:getstatic       #518 <Field fc fc.aU>
	//  494 1434:ldc2            #520 <String "Send en tekstmelding til telefonen din. Den 6-sifrede koden du mottar, er gyldig i 5 minutter.">
	//  495 1437:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  496 1442:pop             
		a.put(((Object) (fc.aV)), "Sender meldingen");
	//  497 1443:getstatic       #19  <Field Map a>
	//  498 1446:getstatic       #523 <Field fc fc.aV>
	//  499 1449:ldc2            #525 <String "Sender meldingen">
	//  500 1452:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  501 1457:pop             
		a.put(((Object) (fc.aW)), "Oppgi den 6-sifrede sikkerhetskoden");
	//  502 1458:getstatic       #19  <Field Map a>
	//  503 1461:getstatic       #528 <Field fc fc.aW>
	//  504 1464:ldc2            #530 <String "Oppgi den 6-sifrede sikkerhetskoden">
	//  505 1467:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  506 1472:pop             
		a.put(((Object) (fc.aX)), "Ditt mobilnummer");
	//  507 1473:getstatic       #19  <Field Map a>
	//  508 1476:getstatic       #533 <Field fc fc.aX>
	//  509 1479:ldc2            #535 <String "Ditt mobilnummer">
	//  510 1482:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  511 1487:pop             
		a.put(((Object) (fc.aY)), "Send melding");
	//  512 1488:getstatic       #19  <Field Map a>
	//  513 1491:getstatic       #538 <Field fc fc.aY>
	//  514 1494:ldc2            #540 <String "Send melding">
	//  515 1497:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  516 1502:pop             
		a.put(((Object) (fc.aZ)), "Send meldingen p\345 nytt");
	//  517 1503:getstatic       #19  <Field Map a>
	//  518 1506:getstatic       #543 <Field fc fc.aZ>
	//  519 1509:ldc2            #545 <String "Send meldingen p\345 nytt">
	//  520 1512:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  521 1517:pop             
		a.put(((Object) (fc.ba)), "Kan ikke logge p\345, fordi p\345loggingen til kontoen din har godkjenning med to faktorer. G\345 til PayPals nettsted for \345 aktivere sikkerhetsn\370kkelen din.");
	//  522 1518:getstatic       #19  <Field Map a>
	//  523 1521:getstatic       #548 <Field fc fc.ba>
	//  524 1524:ldc2            #550 <String "Kan ikke logge p\345, fordi p\345loggingen til kontoen din har godkjenning med to faktorer. G\345 til PayPals nettsted for \345 aktivere sikkerhetsn\370kkelen din.">
	//  525 1527:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  526 1532:pop             
		a.put(((Object) (fc.bb)), "Betaling fra denne enheten er ikke tillatt.");
	//  527 1533:getstatic       #19  <Field Map a>
	//  528 1536:getstatic       #553 <Field fc fc.bb>
	//  529 1539:ldc2            #555 <String "Betaling fra denne enheten er ikke tillatt.">
	//  530 1542:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  531 1547:pop             
		a.put(((Object) (fc.bc)), "Uautorisert enhet");
	//  532 1548:getstatic       #19  <Field Map a>
	//  533 1551:getstatic       #558 <Field fc fc.bc>
	//  534 1554:ldc2            #560 <String "Uautorisert enhet">
	//  535 1557:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  536 1562:pop             
		a.put(((Object) (fc.bd)), "Betalinger til denne forhandleren er ikke tillatt (ugyldig bruker-id).");
	//  537 1563:getstatic       #19  <Field Map a>
	//  538 1566:getstatic       #563 <Field fc fc.bd>
	//  539 1569:ldc2            #565 <String "Betalinger til denne forhandleren er ikke tillatt (ugyldig bruker-id).">
	//  540 1572:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  541 1577:pop             
		a.put(((Object) (fc.be)), "Ugyldig forhandler");
	//  542 1578:getstatic       #19  <Field Map a>
	//  543 1581:getstatic       #568 <Field fc fc.be>
	//  544 1584:ldc2            #570 <String "Ugyldig forhandler">
	//  545 1587:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  546 1592:pop             
		a.put(((Object) (fc.bf)), "Det oppsto et problem ved behandlingen av betalingen. Pr\370v p\345 nytt.");
	//  547 1593:getstatic       #19  <Field Map a>
	//  548 1596:getstatic       #573 <Field fc fc.bf>
	//  549 1599:ldc2            #575 <String "Det oppsto et problem ved behandlingen av betalingen. Pr\370v p\345 nytt.">
	//  550 1602:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  551 1607:pop             
		a.put(((Object) (fc.bg)), "Ukjent betalingsmetode");
	//  552 1608:getstatic       #19  <Field Map a>
	//  553 1611:getstatic       #578 <Field fc fc.bg>
	//  554 1614:ldc2            #580 <String "Ukjent betalingsmetode">
	//  555 1617:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  556 1622:pop             
		a.put(((Object) (fc.bh)), "Vi beklager");
	//  557 1623:getstatic       #19  <Field Map a>
	//  558 1626:getstatic       #583 <Field fc fc.bh>
	//  559 1629:ldc2            #585 <String "Vi beklager">
	//  560 1632:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  561 1637:pop             
		a.put(((Object) (fc.bi)), "Din bestilling");
	//  562 1638:getstatic       #19  <Field Map a>
	//  563 1641:getstatic       #588 <Field fc fc.bi>
	//  564 1644:ldc2            #590 <String "Din bestilling">
	//  565 1647:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  566 1652:pop             
		a.put(((Object) (fc.bj)), "Denne enheten kan ikke kommunisere med PayPal fordi androidversjonen er for gammel. Oppgrader til en nyere androidversjon, eller fors\370k med en nyere enhet.");
	//  567 1653:getstatic       #19  <Field Map a>
	//  568 1656:getstatic       #593 <Field fc fc.bj>
	//  569 1659:ldc2            #595 <String "Denne enheten kan ikke kommunisere med PayPal fordi androidversjonen er for gammel. Oppgrader til en nyere androidversjon, eller fors\370k med en nyere enhet.">
	//  570 1662:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  571 1667:pop             
		a.put(((Object) (fc.bk)), "Vil du fjerne kortet?");
	//  572 1668:getstatic       #19  <Field Map a>
	//  573 1671:getstatic       #598 <Field fc fc.bk>
	//  574 1674:ldc2            #600 <String "Vil du fjerne kortet?">
	//  575 1677:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  576 1682:pop             
		a.put(((Object) (fc.bl)), "Godkjenningen mislyktes");
	//  577 1683:getstatic       #19  <Field Map a>
	//  578 1686:getstatic       #603 <Field fc fc.bl>
	//  579 1689:ldc2            #605 <String "Godkjenningen mislyktes">
	//  580 1692:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  581 1697:pop             
		a.put(((Object) (fc.bm)), "Tilkobling mislykket");
	//  582 1698:getstatic       #19  <Field Map a>
	//  583 1701:getstatic       #608 <Field fc fc.bm>
	//  584 1704:ldc2            #610 <String "Tilkobling mislykket">
	//  585 1707:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  586 1712:pop             
		a.put(((Object) (fc.bn)), "P\345logging mislyktes");
	//  587 1713:getstatic       #19  <Field Map a>
	//  588 1716:getstatic       #613 <Field fc fc.bn>
	//  589 1719:ldc2            #615 <String "P\345logging mislyktes">
	//  590 1722:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  591 1727:pop             
		a.put(((Object) (fc.bo)), "Logg p\345 med passord");
	//  592 1728:getstatic       #19  <Field Map a>
	//  593 1731:getstatic       #618 <Field fc fc.bo>
	//  594 1734:ldc2            #620 <String "Logg p\345 med passord">
	//  595 1737:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  596 1742:pop             
		a.put(((Object) (fc.bp)), "Logg p\345 med PIN");
	//  597 1743:getstatic       #19  <Field Map a>
	//  598 1746:getstatic       #623 <Field fc fc.bp>
	//  599 1749:ldc2            #625 <String "Logg p\345 med PIN">
	//  600 1752:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  601 1757:pop             
		a.put(((Object) (fc.bq)), "Et \370yeblikk \u2026");
	//  602 1758:getstatic       #19  <Field Map a>
	//  603 1761:getstatic       #628 <Field fc fc.bq>
	//  604 1764:ldc2            #630 <String "Et \370yeblikk \u2026">
	//  605 1767:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  606 1772:pop             
		a.put(((Object) (fc.br)), "Betaling mislyktes");
	//  607 1773:getstatic       #19  <Field Map a>
	//  608 1776:getstatic       #633 <Field fc fc.br>
	//  609 1779:ldc2            #635 <String "Betaling mislyktes">
	//  610 1782:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  611 1787:pop             
		a.put(((Object) (fc.bs)), "Skann");
	//  612 1788:getstatic       #19  <Field Map a>
	//  613 1791:getstatic       #638 <Field fc fc.bs>
	//  614 1794:ldc2            #640 <String "Skann">
	//  615 1797:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  616 1802:pop             
		a.put(((Object) (fc.bt)), "Feil sikkerhetskode. Pr\370v p\345 nytt.");
	//  617 1803:getstatic       #19  <Field Map a>
	//  618 1806:getstatic       #643 <Field fc fc.bt>
	//  619 1809:ldc2            #645 <String "Feil sikkerhetskode. Pr\370v p\345 nytt.">
	//  620 1812:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  621 1817:pop             
		a.put(((Object) (fc.bu)), "via");
	//  622 1818:getstatic       #19  <Field Map a>
	//  623 1821:getstatic       #648 <Field fc fc.bu>
	//  624 1824:ldc2            #650 <String "via">
	//  625 1827:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  626 1832:pop             
		a.put(((Object) (fc.bv)), "Systemfeil. Pr\370v p\345 nytt senere.");
	//  627 1833:getstatic       #19  <Field Map a>
	//  628 1836:getstatic       #653 <Field fc fc.bv>
	//  629 1839:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	//  630 1842:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  631 1847:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|AT", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  632 1848:getstatic       #21  <Field Map b>
	//  633 1851:ldc2            #657 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|AT">
	//  634 1854:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  635 1857:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  636 1862:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BE", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  637 1863:getstatic       #21  <Field Map b>
	//  638 1866:ldc2            #661 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BE">
	//  639 1869:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  640 1872:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  641 1877:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BG", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  642 1878:getstatic       #21  <Field Map b>
	//  643 1881:ldc2            #663 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|BG">
	//  644 1884:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  645 1887:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  646 1892:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CH", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  647 1893:getstatic       #21  <Field Map b>
	//  648 1896:ldc2            #667 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CH">
	//  649 1899:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  650 1902:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  651 1907:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CY", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  652 1908:getstatic       #21  <Field Map b>
	//  653 1911:ldc2            #669 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CY">
	//  654 1914:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  655 1917:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  656 1922:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CZ", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  657 1923:getstatic       #21  <Field Map b>
	//  658 1926:ldc2            #671 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|CZ">
	//  659 1929:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  660 1932:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  661 1937:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DE", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  662 1938:getstatic       #21  <Field Map b>
	//  663 1941:ldc2            #673 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DE">
	//  664 1944:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  665 1947:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  666 1952:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DK", "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.");
	//  667 1953:getstatic       #21  <Field Map b>
	//  668 1956:ldc2            #675 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|DK">
	//  669 1959:ldc2            #677 <String "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.">
	//  670 1962:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  671 1967:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|EE", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  672 1968:getstatic       #21  <Field Map b>
	//  673 1971:ldc2            #679 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|EE">
	//  674 1974:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  675 1977:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  676 1982:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|ES", "Del informasjon med dem om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  677 1983:getstatic       #21  <Field Map b>
	//  678 1986:ldc2            #681 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|ES">
	//  679 1989:ldc2            #683 <String "Del informasjon med dem om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  680 1992:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  681 1997:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|FI", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  682 1998:getstatic       #21  <Field Map b>
	//  683 2001:ldc2            #685 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|FI">
	//  684 2004:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  685 2007:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  686 2012:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GB", "Del <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  687 2013:getstatic       #21  <Field Map b>
	//  688 2016:ldc2            #687 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GB">
	//  689 2019:ldc2            #689 <String "Del <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  690 2022:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  691 2027:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GR", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  692 2028:getstatic       #21  <Field Map b>
	//  693 2031:ldc2            #691 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|GR">
	//  694 2034:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  695 2037:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  696 2042:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|HU", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  697 2043:getstatic       #21  <Field Map b>
	//  698 2046:ldc2            #693 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|HU">
	//  699 2049:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  700 2052:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  701 2057:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IE", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  702 2058:getstatic       #21  <Field Map b>
	//  703 2061:ldc2            #695 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IE">
	//  704 2064:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  705 2067:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  706 2072:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IT", "Del <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  707 2073:getstatic       #21  <Field Map b>
	//  708 2076:ldc2            #697 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|IT">
	//  709 2079:ldc2            #689 <String "Del <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  710 2082:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  711 2087:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LI", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  712 2088:getstatic       #21  <Field Map b>
	//  713 2091:ldc2            #699 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LI">
	//  714 2094:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  715 2097:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  716 2102:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LT", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  717 2103:getstatic       #21  <Field Map b>
	//  718 2106:ldc2            #701 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LT">
	//  719 2109:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  720 2112:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  721 2117:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LU", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  722 2118:getstatic       #21  <Field Map b>
	//  723 2121:ldc2            #703 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LU">
	//  724 2124:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  725 2127:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  726 2132:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LV", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  727 2133:getstatic       #21  <Field Map b>
	//  728 2136:ldc2            #705 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|LV">
	//  729 2139:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  730 2142:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  731 2147:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|MT", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  732 2148:getstatic       #21  <Field Map b>
	//  733 2151:ldc2            #707 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|MT">
	//  734 2154:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  735 2157:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  736 2162:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NL", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  737 2163:getstatic       #21  <Field Map b>
	//  738 2166:ldc2            #709 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NL">
	//  739 2169:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  740 2172:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  741 2177:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NO", "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.");
	//  742 2178:getstatic       #21  <Field Map b>
	//  743 2181:ldc2            #711 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|NO">
	//  744 2184:ldc2            #677 <String "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.">
	//  745 2187:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  746 2192:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PL", "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.");
	//  747 2193:getstatic       #21  <Field Map b>
	//  748 2196:ldc2            #713 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PL">
	//  749 2199:ldc2            #659 <String "Del informasjon om <a href='%1$s'>finansieringskildene</a> som er tilknyttet PayPal-kontoen din.">
	//  750 2202:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  751 2207:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PT", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  752 2208:getstatic       #21  <Field Map b>
	//  753 2211:ldc2            #715 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|PT">
	//  754 2214:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  755 2217:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  756 2222:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SE", "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.");
	//  757 2223:getstatic       #21  <Field Map b>
	//  758 2226:ldc2            #717 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SE">
	//  759 2229:ldc2            #677 <String "Del informasjon om <a href='%1$s'>betalingsmetodene</a> som er tilknyttet PayPal-kontoen din.">
	//  760 2232:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  761 2237:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SI", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  762 2238:getstatic       #21  <Field Map b>
	//  763 2241:ldc2            #719 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SI">
	//  764 2244:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  765 2247:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  766 2252:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SK", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  767 2253:getstatic       #21  <Field Map b>
	//  768 2256:ldc2            #721 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SK">
	//  769 2259:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  770 2262:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  771 2267:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SM", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  772 2268:getstatic       #21  <Field Map b>
	//  773 2271:ldc2            #723 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|SM">
	//  774 2274:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  775 2277:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  776 2282:pop             
		b.put("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|VA", "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.");
	//  777 2283:getstatic       #21  <Field Map b>
	//  778 2286:ldc2            #725 <String "CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS|VA">
	//  779 2289:ldc2            #665 <String "Del <a href='%1$s'>finansieringskildene</a> p\345 vegne av deg inntil du trekker tilbake tillatelsen.">
	//  780 2292:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  781 2297:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|AU", "<p><a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.</p><p>Du finner mer informasjon i <a href='https://www.paypal.com/webapps/mpp/ua/recurringpymts-full'>PayPals avtale om regelmessige betalinger og fakturering</a>.</p>");
	//  782 2298:getstatic       #21  <Field Map b>
	//  783 2301:ldc2            #727 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|AU">
	//  784 2304:ldc2            #729 <String "<p><a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.</p><p>Du finner mer informasjon i <a href='https://www.paypal.com/webapps/mpp/ua/recurringpymts-full'>PayPals avtale om regelmessige betalinger og fakturering</a>.</p>">
	//  785 2307:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  786 2312:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|CN", "<p><a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.</p><p>Du finner mer informasjon i <a href='https://cms.paypal.com/c2/cgi-bin/?cmd=_render-content&content_ID=ua/UserAgreement_full'>PayPals avtale om regelmessige betalinger og fakturering</a>.</p>");
	//  787 2313:getstatic       #21  <Field Map b>
	//  788 2316:ldc2            #731 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|CN">
	//  789 2319:ldc2            #733 <String "<p><a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p hos %2$s via PayPal. Du ber PayPal om \345 betale alle summer som %3$s ber om.</p><p>Du finner mer informasjon i <a href='https://cms.paypal.com/c2/cgi-bin/?cmd=_render-content&content_ID=ua/UserAgreement_full'>PayPals avtale om regelmessige betalinger og fakturering</a>.</p>">
	//  790 2322:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  791 2327:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|MY", "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.");
	//  792 2328:getstatic       #21  <Field Map b>
	//  793 2331:ldc2            #735 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|MY">
	//  794 2334:ldc2            #737 <String "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.">
	//  795 2337:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  796 2342:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|NZ", "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.");
	//  797 2343:getstatic       #21  <Field Map b>
	//  798 2346:ldc2            #739 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|NZ">
	//  799 2349:ldc2            #737 <String "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.">
	//  800 2352:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  801 2357:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|SG", "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.");
	//  802 2358:getstatic       #21  <Field Map b>
	//  803 2361:ldc2            #741 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|SG">
	//  804 2364:ldc2            #737 <String "<a href='%1$s'>Godkjenn betalinger</a> for fremtidige kj\370p via PayPal. Du gir PayPal din godkjenning, og ber oss om \345 betale alle bel\370p.">
	//  805 2367:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  806 2372:pop             
		b.put("CONSENT_AGREEMENT_FUTURE_PAYMENTS|US", "Forh\345ndsgodkjenn fremtidige betalinger fra PayPal-kontoen din uten \345 logge p\345 PayPal hver gang. <a href='%1$s'>Se ytterligere vilk\345r</a>, inkludert betalingsmetoder og hvordan du kan avbryte fremtidige betalinger.");
	//  807 2373:getstatic       #21  <Field Map b>
	//  808 2376:ldc2            #743 <String "CONSENT_AGREEMENT_FUTURE_PAYMENTS|US">
	//  809 2379:ldc2            #745 <String "Forh\345ndsgodkjenn fremtidige betalinger fra PayPal-kontoen din uten \345 logge p\345 PayPal hver gang. <a href='%1$s'>Se ytterligere vilk\345r</a>, inkludert betalingsmetoder og hvordan du kan avbryte fremtidige betalinger.">
	//  810 2382:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  811 2387:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|AT", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  812 2388:getstatic       #21  <Field Map b>
	//  813 2391:ldc2            #747 <String "CONSENT_AGREEMENT_REQUEST_MONEY|AT">
	//  814 2394:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  815 2397:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  816 2402:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|BE", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  817 2403:getstatic       #21  <Field Map b>
	//  818 2406:ldc2            #751 <String "CONSENT_AGREEMENT_REQUEST_MONEY|BE">
	//  819 2409:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  820 2412:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  821 2417:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|CH", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  822 2418:getstatic       #21  <Field Map b>
	//  823 2421:ldc2            #753 <String "CONSENT_AGREEMENT_REQUEST_MONEY|CH">
	//  824 2424:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  825 2427:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  826 2432:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|DE", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  827 2433:getstatic       #21  <Field Map b>
	//  828 2436:ldc2            #755 <String "CONSENT_AGREEMENT_REQUEST_MONEY|DE">
	//  829 2439:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  830 2442:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  831 2447:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|GB", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  832 2448:getstatic       #21  <Field Map b>
	//  833 2451:ldc2            #757 <String "CONSENT_AGREEMENT_REQUEST_MONEY|GB">
	//  834 2454:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  835 2457:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  836 2462:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|NL", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  837 2463:getstatic       #21  <Field Map b>
	//  838 2466:ldc2            #759 <String "CONSENT_AGREEMENT_REQUEST_MONEY|NL">
	//  839 2469:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  840 2472:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  841 2477:pop             
		b.put("CONSENT_AGREEMENT_REQUEST_MONEY|PL", "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  842 2478:getstatic       #21  <Field Map b>
	//  843 2481:ldc2            #761 <String "CONSENT_AGREEMENT_REQUEST_MONEY|PL">
	//  844 2484:ldc2            #749 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>be om penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  845 2487:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  846 2492:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|AT", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  847 2493:getstatic       #21  <Field Map b>
	//  848 2496:ldc2            #763 <String "CONSENT_AGREEMENT_SEND_MONEY|AT">
	//  849 2499:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  850 2502:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  851 2507:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|BE", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  852 2508:getstatic       #21  <Field Map b>
	//  853 2511:ldc2            #767 <String "CONSENT_AGREEMENT_SEND_MONEY|BE">
	//  854 2514:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  855 2517:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  856 2522:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|CH", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  857 2523:getstatic       #21  <Field Map b>
	//  858 2526:ldc2            #769 <String "CONSENT_AGREEMENT_SEND_MONEY|CH">
	//  859 2529:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  860 2532:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  861 2537:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|DE", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  862 2538:getstatic       #21  <Field Map b>
	//  863 2541:ldc2            #771 <String "CONSENT_AGREEMENT_SEND_MONEY|DE">
	//  864 2544:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  865 2547:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  866 2552:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|GB", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  867 2553:getstatic       #21  <Field Map b>
	//  868 2556:ldc2            #773 <String "CONSENT_AGREEMENT_SEND_MONEY|GB">
	//  869 2559:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  870 2562:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  871 2567:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|NL", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  872 2568:getstatic       #21  <Field Map b>
	//  873 2571:ldc2            #775 <String "CONSENT_AGREEMENT_SEND_MONEY|NL">
	//  874 2574:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  875 2577:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  876 2582:pop             
		b.put("CONSENT_AGREEMENT_SEND_MONEY|PL", "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.");
	//  877 2583:getstatic       #21  <Field Map b>
	//  878 2586:ldc2            #777 <String "CONSENT_AGREEMENT_SEND_MONEY|PL">
	//  879 2589:ldc2            #765 <String "Gi %2$s tillatelse til \345 <a href='%1$s'>overf\370re penger</a> p\345 dine vegne inntil du trekker tilbake tillatelsen.">
	//  880 2592:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  881 2597:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|AT", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  882 2598:getstatic       #21  <Field Map b>
	//  883 2601:ldc2            #779 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|AT">
	//  884 2604:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  885 2607:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  886 2612:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BE", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  887 2613:getstatic       #21  <Field Map b>
	//  888 2616:ldc2            #783 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BE">
	//  889 2619:ldc2            #785 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  890 2622:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  891 2627:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BG", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  892 2628:getstatic       #21  <Field Map b>
	//  893 2631:ldc2            #787 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|BG">
	//  894 2634:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  895 2637:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  896 2642:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CH", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  897 2643:getstatic       #21  <Field Map b>
	//  898 2646:ldc2            #789 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CH">
	//  899 2649:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  900 2652:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  901 2657:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CY", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  902 2658:getstatic       #21  <Field Map b>
	//  903 2661:ldc2            #791 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CY">
	//  904 2664:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  905 2667:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  906 2672:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CZ", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  907 2673:getstatic       #21  <Field Map b>
	//  908 2676:ldc2            #793 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|CZ">
	//  909 2679:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  910 2682:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  911 2687:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|DE", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  912 2688:getstatic       #21  <Field Map b>
	//  913 2691:ldc2            #795 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|DE">
	//  914 2694:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  915 2697:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  916 2702:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|EE", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  917 2703:getstatic       #21  <Field Map b>
	//  918 2706:ldc2            #797 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|EE">
	//  919 2709:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  920 2712:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  921 2717:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|ES", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  922 2718:getstatic       #21  <Field Map b>
	//  923 2721:ldc2            #799 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|ES">
	//  924 2724:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  925 2727:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  926 2732:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|FI", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  927 2733:getstatic       #21  <Field Map b>
	//  928 2736:ldc2            #801 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|FI">
	//  929 2739:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  930 2742:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  931 2747:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|GR", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  932 2748:getstatic       #21  <Field Map b>
	//  933 2751:ldc2            #803 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|GR">
	//  934 2754:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  935 2757:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  936 2762:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|HU", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  937 2763:getstatic       #21  <Field Map b>
	//  938 2766:ldc2            #805 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|HU">
	//  939 2769:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  940 2772:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  941 2777:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IE", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  942 2778:getstatic       #21  <Field Map b>
	//  943 2781:ldc2            #807 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IE">
	//  944 2784:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  945 2787:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  946 2792:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IT", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  947 2793:getstatic       #21  <Field Map b>
	//  948 2796:ldc2            #809 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|IT">
	//  949 2799:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  950 2802:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  951 2807:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LI", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  952 2808:getstatic       #21  <Field Map b>
	//  953 2811:ldc2            #811 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LI">
	//  954 2814:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  955 2817:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  956 2822:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LT", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  957 2823:getstatic       #21  <Field Map b>
	//  958 2826:ldc2            #813 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LT">
	//  959 2829:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  960 2832:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  961 2837:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LU", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  962 2838:getstatic       #21  <Field Map b>
	//  963 2841:ldc2            #815 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LU">
	//  964 2844:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  965 2847:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  966 2852:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LV", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  967 2853:getstatic       #21  <Field Map b>
	//  968 2856:ldc2            #817 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|LV">
	//  969 2859:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  970 2862:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  971 2867:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|MT", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  972 2868:getstatic       #21  <Field Map b>
	//  973 2871:ldc2            #819 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|MT">
	//  974 2874:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  975 2877:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  976 2882:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|NL", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  977 2883:getstatic       #21  <Field Map b>
	//  978 2886:ldc2            #821 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|NL">
	//  979 2889:ldc2            #785 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  980 2892:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  981 2897:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PL", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  982 2898:getstatic       #21  <Field Map b>
	//  983 2901:ldc2            #823 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PL">
	//  984 2904:ldc2            #785 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun informasjon om hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  985 2907:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  986 2912:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PT", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  987 2913:getstatic       #21  <Field Map b>
	//  988 2916:ldc2            #825 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|PT">
	//  989 2919:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  990 2922:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  991 2927:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SI", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  992 2928:getstatic       #21  <Field Map b>
	//  993 2931:ldc2            #827 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SI">
	//  994 2934:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	//  995 2937:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//  996 2942:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SK", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	//  997 2943:getstatic       #21  <Field Map b>
	//  998 2946:ldc2            #829 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SK">
	//  999 2949:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	// 1000 2952:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1001 2957:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SM", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	// 1002 2958:getstatic       #21  <Field Map b>
	// 1003 2961:ldc2            #831 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|SM">
	// 1004 2964:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	// 1005 2967:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1006 2972:pop             
		b.put("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|VA", "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>");
	// 1007 2973:getstatic       #21  <Field Map b>
	// 1008 2976:ldc2            #833 <String "FINANCIAL_INSTRUMENTS_LEGAL_DETAILS|VA">
	// 1009 2979:ldc2            #781 <String "<h1><strong>Betalingsmetoder</strong></h1><p>PayPal deler kun hvilke av finansieringskildene dine som er tilgjengelige for bruk.</p>">
	// 1010 2982:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1011 2987:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|AU", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Din standard betalingsmetode (PayPal-saldo, tilknyttet bankkonto eller betalingskort, i denne rekkef\370lgen) brukes til \345 betale for PayPal-kj\370p. V\346r oppmerksom p\345 at hvis den standard betalingsmetoden din ikke har nok penger til \345 dekke kj\370pet, kan banken eller kortleverand\370ren belaste deg et gebyr.</p><p>For \345 avbryte denne avtalen m\345 du logge p\345 PayPal-kontoen din og g\345 til <strong>Profil</strong>, s\345 klikker du p\345 <strong>Mine innstillinger</strong> og <strong>Endre</strong> ved siden av \u2018Logg p\345 med PayPal\u2019.</p>");
	// 1012 2988:getstatic       #21  <Field Map b>
	// 1013 2991:ldc2            #835 <String "FUTURE_PAYMENT_LEGAL_DETAILS|AU">
	// 1014 2994:ldc2            #837 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Din standard betalingsmetode (PayPal-saldo, tilknyttet bankkonto eller betalingskort, i denne rekkef\370lgen) brukes til \345 betale for PayPal-kj\370p. V\346r oppmerksom p\345 at hvis den standard betalingsmetoden din ikke har nok penger til \345 dekke kj\370pet, kan banken eller kortleverand\370ren belaste deg et gebyr.</p><p>For \345 avbryte denne avtalen m\345 du logge p\345 PayPal-kontoen din og g\345 til <strong>Profil</strong>, s\345 klikker du p\345 <strong>Mine innstillinger</strong> og <strong>Endre</strong> ved siden av \u2018Logg p\345 med PayPal\u2019.</p>">
	// 1015 2997:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1016 3002:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|BR", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>PayPal-saldoen din eller det prim\346re betalingskortet ditt brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>");
	// 1017 3003:getstatic       #21  <Field Map b>
	// 1018 3006:ldc2            #839 <String "FUTURE_PAYMENT_LEGAL_DETAILS|BR">
	// 1019 3009:ldc2            #841 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>PayPal-saldoen din eller det prim\346re betalingskortet ditt brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>">
	// 1020 3012:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1021 3017:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|CN", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>");
	// 1022 3018:getstatic       #21  <Field Map b>
	// 1023 3021:ldc2            #843 <String "FUTURE_PAYMENT_LEGAL_DETAILS|CN">
	// 1024 3024:ldc2            #845 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>">
	// 1025 3027:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1026 3032:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|GB", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Den standard finansieringskilden din brukes til \345 utf\370re fremtidige PayPal-betalinger hos denne forhandleren.</p><p>Hvis du vil avslutte denne avtalen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Regelmessig betaling-delen av <a href='%s'>PayPals brukeravtale</a> er gjeldende.</p><p>For \345 kontrollere at betalinger fungerer med PayPal-kontoen din, kan denne appen simulere en liten pr\370vetransaksjonen, men ingen penger overf\370res.</p>");
	// 1027 3033:getstatic       #21  <Field Map b>
	// 1028 3036:ldc2            #847 <String "FUTURE_PAYMENT_LEGAL_DETAILS|GB">
	// 1029 3039:ldc2            #849 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Den standard finansieringskilden din brukes til \345 utf\370re fremtidige PayPal-betalinger hos denne forhandleren.</p><p>Hvis du vil avslutte denne avtalen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Regelmessig betaling-delen av <a href='%s'>PayPals brukeravtale</a> er gjeldende.</p><p>For \345 kontrollere at betalinger fungerer med PayPal-kontoen din, kan denne appen simulere en liten pr\370vetransaksjonen, men ingen penger overf\370res.</p>">
	// 1030 3042:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1031 3047:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|HK", "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>");
	// 1032 3048:getstatic       #21  <Field Map b>
	// 1033 3051:ldc2            #851 <String "FUTURE_PAYMENT_LEGAL_DETAILS|HK">
	// 1034 3054:ldc2            #853 <String "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>">
	// 1035 3057:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1036 3062:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|JP", "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \253Forh\345ndsgodkjente betalinger\273-delen i <a href='%s'>PayPals brukeravtale</a> for \345 f\345 mer informasjon.</p>");
	// 1037 3063:getstatic       #21  <Field Map b>
	// 1038 3066:ldc2            #855 <String "FUTURE_PAYMENT_LEGAL_DETAILS|JP">
	// 1039 3069:ldc2            #857 <String "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \253Forh\345ndsgodkjente betalinger\273-delen i <a href='%s'>PayPals brukeravtale</a> for \345 f\345 mer informasjon.</p>">
	// 1040 3072:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1041 3077:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|MX", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>PayPal-saldoen din eller det prim\346re betalingskortet ditt brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>");
	// 1042 3078:getstatic       #21  <Field Map b>
	// 1043 3081:ldc2            #859 <String "FUTURE_PAYMENT_LEGAL_DETAILS|MX">
	// 1044 3084:ldc2            #841 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>PayPal-saldoen din eller det prim\346re betalingskortet ditt brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne avtalen, logger du p\345 PayPal-kontoen, g\345r til <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p>">
	// 1045 3087:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1046 3092:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|MY", "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>");
	// 1047 3093:getstatic       #21  <Field Map b>
	// 1048 3096:ldc2            #861 <String "FUTURE_PAYMENT_LEGAL_DETAILS|MY">
	// 1049 3099:ldc2            #853 <String "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>">
	// 1050 3102:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1051 3107:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|NZ", "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>");
	// 1052 3108:getstatic       #21  <Field Map b>
	// 1053 3111:ldc2            #863 <String "FUTURE_PAYMENT_LEGAL_DETAILS|NZ">
	// 1054 3114:ldc2            #853 <String "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>">
	// 1055 3117:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1056 3122:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|SG", "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>");
	// 1057 3123:getstatic       #21  <Field Map b>
	// 1058 3126:ldc2            #865 <String "FUTURE_PAYMENT_LEGAL_DETAILS|SG">
	// 1059 3129:ldc2            #853 <String "<h1><strong>Godkjenning av fremtidige betalinger</strong></h1><p>For \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden, kan denne appen simulere en liten pr\370vetransaksjon, men ingen penger overf\370res.</p><p>Betalingsmetoden du angir som standard brukes til \345 betale for PayPal-kj\370p.</p><p>Hvis du vil avbryte denne godkjenningen, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong> &gt; <strong>Mine kontoinnstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Se \u2018Forh\345ndsgodkjente betalinger\u2019-delen i <a href='%s'>PayPals brukeravtale</a> for mer informasjon.</p>">
	// 1060 3132:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1061 3137:pop             
		b.put("FUTURE_PAYMENT_LEGAL_DETAILS|US", "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Vi fors\370ker f\370rst \345 betale med PayPal-saldoen din. Hvis det ikke er nok penger p\345 den, fors\370ker vi \345 bruke bankkontoen din, PayPal Credit, betalingskort og/eller eCheck, i den viste rekkef\370lgen.</p><p>Hvis du vil avbryte denne avtalen, g\345r du til www.paypal.com <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Det kan v\346re n\370dvendig med en liten betalingsgodkjenning for \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden. Godkjenningen blir avbrutt, og du belastes ikke.</p>");
	// 1062 3138:getstatic       #21  <Field Map b>
	// 1063 3141:ldc2            #867 <String "FUTURE_PAYMENT_LEGAL_DETAILS|US">
	// 1064 3144:ldc2            #869 <String "<h1><strong>Fremtidig betalingsavtale</strong></h1><p>Vi fors\370ker f\370rst \345 betale med PayPal-saldoen din. Hvis det ikke er nok penger p\345 den, fors\370ker vi \345 bruke bankkontoen din, PayPal Credit, betalingskort og/eller eCheck, i den viste rekkef\370lgen.</p><p>Hvis du vil avbryte denne avtalen, g\345r du til www.paypal.com <strong>Profil</strong> &gt; <strong>Mine innstillinger</strong> &gt; <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren fra listen.</p><p>Det kan v\346re n\370dvendig med en liten betalingsgodkjenning for \345 kontrollere at PayPal-kontoen din kan belastes i fremtiden. Godkjenningen blir avbrutt, og du belastes ikke.</p>">
	// 1065 3147:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1066 3152:pop             
		b.put("LOG_IN_TO_PAYPAL|AU", "Logg p\345 med PayPal");
	// 1067 3153:getstatic       #21  <Field Map b>
	// 1068 3156:ldc2            #871 <String "LOG_IN_TO_PAYPAL|AU">
	// 1069 3159:ldc2            #372 <String "Logg p\345 med PayPal">
	// 1070 3162:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1071 3167:pop             
		b.put("LOG_IN_TO_PAYPAL|GB", "Logg p\345 med PayPal");
	// 1072 3168:getstatic       #21  <Field Map b>
	// 1073 3171:ldc2            #873 <String "LOG_IN_TO_PAYPAL|GB">
	// 1074 3174:ldc2            #372 <String "Logg p\345 med PayPal">
	// 1075 3177:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1076 3182:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AD", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1077 3183:getstatic       #21  <Field Map b>
	// 1078 3186:ldc2            #875 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AD">
	// 1079 3189:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1080 3192:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1081 3197:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AL", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1082 3198:getstatic       #21  <Field Map b>
	// 1083 3201:ldc2            #879 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AL">
	// 1084 3204:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1085 3207:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1086 3212:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AT", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1087 3213:getstatic       #21  <Field Map b>
	// 1088 3216:ldc2            #881 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AT">
	// 1089 3219:ldc2            #883 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1090 3222:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1091 3227:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AU", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1092 3228:getstatic       #21  <Field Map b>
	// 1093 3231:ldc2            #885 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|AU">
	// 1094 3234:ldc2            #455 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1095 3237:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1096 3242:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BA", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1097 3243:getstatic       #21  <Field Map b>
	// 1098 3246:ldc2            #887 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BA">
	// 1099 3249:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1100 3252:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1101 3257:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BE", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1102 3258:getstatic       #21  <Field Map b>
	// 1103 3261:ldc2            #889 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BE">
	// 1104 3264:ldc2            #891 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1105 3267:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1106 3272:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BG", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1107 3273:getstatic       #21  <Field Map b>
	// 1108 3276:ldc2            #893 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|BG">
	// 1109 3279:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1110 3282:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1111 3287:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CH", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1112 3288:getstatic       #21  <Field Map b>
	// 1113 3291:ldc2            #895 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CH">
	// 1114 3294:ldc2            #883 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1115 3297:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1116 3302:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CY", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1117 3303:getstatic       #21  <Field Map b>
	// 1118 3306:ldc2            #897 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CY">
	// 1119 3309:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1120 3312:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1121 3317:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CZ", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1122 3318:getstatic       #21  <Field Map b>
	// 1123 3321:ldc2            #899 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|CZ">
	// 1124 3324:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1125 3327:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1126 3332:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DE", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1127 3333:getstatic       #21  <Field Map b>
	// 1128 3336:ldc2            #901 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DE">
	// 1129 3339:ldc2            #883 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din og klikker p\345 tannhjulikonet. G\345 til <strong>Sikkerhet</strong>, velg <strong>Logg p\345 med PayPal</strong> og fjern denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1130 3342:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1131 3347:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DK", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1132 3348:getstatic       #21  <Field Map b>
	// 1133 3351:ldc2            #903 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|DK">
	// 1134 3354:ldc2            #905 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1135 3357:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1136 3362:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|EE", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1137 3363:getstatic       #21  <Field Map b>
	// 1138 3366:ldc2            #907 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|EE">
	// 1139 3369:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1140 3372:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1141 3377:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ES", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>, <strong>Logg p\345 med PayPal</strong> og fjerner forhandleren. Hvis du fortsatt bruker den tidligere versjonen av nettstedet, g\345r du til <strong>Min profil</strong>, velger <strong>Mine kontoinnstillinger</strong>, <strong>Logg p\345 med PayPal</strong> og fjerner forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1142 3378:getstatic       #21  <Field Map b>
	// 1143 3381:ldc2            #909 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ES">
	// 1144 3384:ldc2            #911 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>, <strong>Logg p\345 med PayPal</strong> og fjerner forhandleren. Hvis du fortsatt bruker den tidligere versjonen av nettstedet, g\345r du til <strong>Min profil</strong>, velger <strong>Mine kontoinnstillinger</strong>, <strong>Logg p\345 med PayPal</strong> og fjerner forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1145 3387:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1146 3392:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|FI", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1147 3393:getstatic       #21  <Field Map b>
	// 1148 3396:ldc2            #913 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|FI">
	// 1149 3399:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1150 3402:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1151 3407:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GB", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong>-innstillingene, <strong>Logg p\345 med PayPal</strong> og fjerner denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1152 3408:getstatic       #21  <Field Map b>
	// 1153 3411:ldc2            #915 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GB">
	// 1154 3414:ldc2            #917 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Profil</strong>-innstillingene, <strong>Logg p\345 med PayPal</strong> og fjerner denne partneren.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1155 3417:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1156 3422:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GR", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1157 3423:getstatic       #21  <Field Map b>
	// 1158 3426:ldc2            #919 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|GR">
	// 1159 3429:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1160 3432:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1161 3437:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HR", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1162 3438:getstatic       #21  <Field Map b>
	// 1163 3441:ldc2            #921 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HR">
	// 1164 3444:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1165 3447:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1166 3452:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HU", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1167 3453:getstatic       #21  <Field Map b>
	// 1168 3456:ldc2            #923 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|HU">
	// 1169 3459:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1170 3462:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1171 3467:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IE", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1172 3468:getstatic       #21  <Field Map b>
	// 1173 3471:ldc2            #925 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IE">
	// 1174 3474:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1175 3477:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1176 3482:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IS", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1177 3483:getstatic       #21  <Field Map b>
	// 1178 3486:ldc2            #927 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IS">
	// 1179 3489:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1180 3492:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1181 3497:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IT", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.it, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1182 3498:getstatic       #21  <Field Map b>
	// 1183 3501:ldc2            #929 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|IT">
	// 1184 3504:ldc2            #931 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.it, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1185 3507:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1186 3512:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LI", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1187 3513:getstatic       #21  <Field Map b>
	// 1188 3516:ldc2            #933 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LI">
	// 1189 3519:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1190 3522:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1191 3527:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LT", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1192 3528:getstatic       #21  <Field Map b>
	// 1193 3531:ldc2            #935 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LT">
	// 1194 3534:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1195 3537:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1196 3542:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LU", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1197 3543:getstatic       #21  <Field Map b>
	// 1198 3546:ldc2            #937 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LU">
	// 1199 3549:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1200 3552:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1201 3557:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LV", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1202 3558:getstatic       #21  <Field Map b>
	// 1203 3561:ldc2            #939 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|LV">
	// 1204 3564:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1205 3567:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1206 3572:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|MT", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1207 3573:getstatic       #21  <Field Map b>
	// 1208 3576:ldc2            #941 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|MT">
	// 1209 3579:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1210 3582:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1211 3587:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NL", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1212 3588:getstatic       #21  <Field Map b>
	// 1213 3591:ldc2            #943 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NL">
	// 1214 3594:ldc2            #891 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1215 3597:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1216 3602:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NO", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1217 3603:getstatic       #21  <Field Map b>
	// 1218 3606:ldc2            #945 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|NO">
	// 1219 3609:ldc2            #905 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1220 3612:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1221 3617:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PL", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1222 3618:getstatic       #21  <Field Map b>
	// 1223 3621:ldc2            #947 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PL">
	// 1224 3624:ldc2            #891 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene, og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1225 3627:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1226 3632:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PT", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1227 3633:getstatic       #21  <Field Map b>
	// 1228 3636:ldc2            #949 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|PT">
	// 1229 3639:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1230 3642:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1231 3647:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RO", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1232 3648:getstatic       #21  <Field Map b>
	// 1233 3651:ldc2            #951 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RO">
	// 1234 3654:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1235 3657:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1236 3662:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RU", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.ru, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>-fanen og fjerner denne partneren under alternativet <strong>Logg p\345 med PayPal</strong>.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>");
	// 1237 3663:getstatic       #21  <Field Map b>
	// 1238 3666:ldc2            #953 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|RU">
	// 1239 3669:ldc2            #955 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med partneren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.ru, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>-fanen og fjerner denne partneren under alternativet <strong>Logg p\345 med PayPal</strong>.</p><p>PayPal er ikke ansvarlig for partnerens handlinger eller feil.</p>">
	// 1240 3672:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1241 3677:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SE", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1242 3678:getstatic       #21  <Field Map b>
	// 1243 3681:ldc2            #957 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SE">
	// 1244 3684:ldc2            #905 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 PayPal-kontoen din, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1245 3687:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1246 3692:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SI", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1247 3693:getstatic       #21  <Field Map b>
	// 1248 3696:ldc2            #959 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SI">
	// 1249 3699:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1250 3702:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1251 3707:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SK", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1252 3708:getstatic       #21  <Field Map b>
	// 1253 3711:ldc2            #961 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SK">
	// 1254 3714:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1255 3717:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1256 3722:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SM", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1257 3723:getstatic       #21  <Field Map b>
	// 1258 3726:ldc2            #963 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|SM">
	// 1259 3729:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1260 3732:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1261 3737:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|TR", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.tr, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>-fanen og fjerner denne partneren under alternativet <strong>Logg p\345 med PayPal</strong>.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1262 3738:getstatic       #21  <Field Map b>
	// 1263 3741:ldc2            #965 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|TR">
	// 1264 3744:ldc2            #967 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.tr, klikker p\345 tannhjulikonet \370verst til h\370yre, velger <strong>Sikkerhet</strong>-fanen og fjerner denne partneren under alternativet <strong>Logg p\345 med PayPal</strong>.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1265 3747:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1266 3752:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|UA", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1267 3753:getstatic       #21  <Field Map b>
	// 1268 3756:ldc2            #969 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|UA">
	// 1269 3759:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1270 3762:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1271 3767:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|US", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p>");
	// 1272 3768:getstatic       #21  <Field Map b>
	// 1273 3771:ldc2            #971 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|US">
	// 1274 3774:ldc2            #973 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Logg p\345 med PayPal</strong>-alternativene under <strong>Profil</strong>-innstillingene og fjerner denne forhandleren.</p>">
	// 1275 3777:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1276 3782:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|VA", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1277 3783:getstatic       #21  <Field Map b>
	// 1278 3786:ldc2            #975 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|VA">
	// 1279 3789:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1280 3792:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1281 3797:pop             
		b.put("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ZA", "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>");
	// 1282 3798:getstatic       #21  <Field Map b>
	// 1283 3801:ldc2            #977 <String "REQUEST_OR_SEND_MONEY_LEGAL_DETAILS|ZA">
	// 1284 3804:ldc2            #877 <String "<h1><strong>%s</strong></h1><p>Alle relevante transaksjonsdetaljer deles med forhandleren.</p><p>Hvis du vil trekke tilbake tillatelsen din, logger du p\345 paypal.com, g\345r til <strong>Profil</strong>, <strong>Sikkerhet</strong>, finner <strong>Logg p\345 med PayPal</strong> og fjerner denne forhandleren.</p><p>PayPal er ikke ansvarlig for forhandlerens handlinger eller feil.</p>">
	// 1285 3807:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1286 3812:pop             
		c.put("AMOUNT_MISMATCH", "Totalbel\370pet for varene i handlekurven samsvarer ikke med kj\370pesummen.");
	// 1287 3813:getstatic       #23  <Field Map c>
	// 1288 3816:ldc2            #979 <String "AMOUNT_MISMATCH">
	// 1289 3819:ldc2            #981 <String "Totalbel\370pet for varene i handlekurven samsvarer ikke med kj\370pesummen.">
	// 1290 3822:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1291 3827:pop             
		c.put("AUTHORIZATION_ALREADY_COMPLETED", "Denne godkjenningen er allerede fullf\370rt.");
	// 1292 3828:getstatic       #23  <Field Map c>
	// 1293 3831:ldc2            #983 <String "AUTHORIZATION_ALREADY_COMPLETED">
	// 1294 3834:ldc2            #985 <String "Denne godkjenningen er allerede fullf\370rt.">
	// 1295 3837:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1296 3842:pop             
		c.put("AUTHORIZATION_CANNOT_BE_VOIDED", "Godkjenningen er i et stadium som ikke kan bli annullert.");
	// 1297 3843:getstatic       #23  <Field Map c>
	// 1298 3846:ldc2            #987 <String "AUTHORIZATION_CANNOT_BE_VOIDED">
	// 1299 3849:ldc2            #989 <String "Godkjenningen er i et stadium som ikke kan bli annullert.">
	// 1300 3852:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1301 3857:pop             
		c.put("AUTHORIZATION_EXPIRED", "Godkjenning utl\370pt.");
	// 1302 3858:getstatic       #23  <Field Map c>
	// 1303 3861:ldc2            #991 <String "AUTHORIZATION_EXPIRED">
	// 1304 3864:ldc2            #993 <String "Godkjenning utl\370pt.">
	// 1305 3867:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1306 3872:pop             
		c.put("AUTHORIZATION_ID_DOES_NOT_EXIST", "Den forespurte godkjennings-IDen finnes ikke.");
	// 1307 3873:getstatic       #23  <Field Map c>
	// 1308 3876:ldc2            #995 <String "AUTHORIZATION_ID_DOES_NOT_EXIST">
	// 1309 3879:ldc2            #997 <String "Den forespurte godkjennings-IDen finnes ikke.">
	// 1310 3882:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1311 3887:pop             
		c.put("AUTHORIZATION_VOIDED", "Godkjenningen din er annullert.");
	// 1312 3888:getstatic       #23  <Field Map c>
	// 1313 3891:ldc2            #999 <String "AUTHORIZATION_VOIDED">
	// 1314 3894:ldc2            #1001 <String "Godkjenningen din er annullert.">
	// 1315 3897:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1316 3902:pop             
		c.put("CANNOT_REAUTH_CHILD_AUTHORIZATION", "Kan bare godkjenne den opprinnelige godkjenningen, ikke en ny godkjenning.");
	// 1317 3903:getstatic       #23  <Field Map c>
	// 1318 3906:ldc2            #1003 <String "CANNOT_REAUTH_CHILD_AUTHORIZATION">
	// 1319 3909:ldc2            #1005 <String "Kan bare godkjenne den opprinnelige godkjenningen, ikke en ny godkjenning.">
	// 1320 3912:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1321 3917:pop             
		c.put("CANNOT_REAUTH_INSIDE_HONOR_PERIOD", "Ny godkjenning er ikke tillatt innenfor pr\370veperioden.");
	// 1322 3918:getstatic       #23  <Field Map c>
	// 1323 3921:ldc2            #1007 <String "CANNOT_REAUTH_INSIDE_HONOR_PERIOD">
	// 1324 3924:ldc2            #1009 <String "Ny godkjenning er ikke tillatt innenfor pr\370veperioden.">
	// 1325 3927:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1326 3932:pop             
		c.put("CAPTURE_AMOUNT_LIMIT_EXCEEDED", "Bel\370pet overskrider den tillatte grensen.");
	// 1327 3933:getstatic       #23  <Field Map c>
	// 1328 3936:ldc2            #1011 <String "CAPTURE_AMOUNT_LIMIT_EXCEEDED">
	// 1329 3939:ldc2            #1013 <String "Bel\370pet overskrider den tillatte grensen.">
	// 1330 3942:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1331 3947:pop             
		c.put("CARD_TOKEN_PAYER_MISMATCH", "F\345r ikke tilgang til lagret kortinformasjonen.");
	// 1332 3948:getstatic       #23  <Field Map c>
	// 1333 3951:ldc2            #1015 <String "CARD_TOKEN_PAYER_MISMATCH">
	// 1334 3954:ldc2            #1017 <String "F\345r ikke tilgang til lagret kortinformasjonen.">
	// 1335 3957:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1336 3962:pop             
		c.put("CREDIT_CARD_CVV_CHECK_FAILED", "Kortopplysningene er ugyldige. Vi ber deg korrigere og sende inn p\345 nytt.");
	// 1337 3963:getstatic       #23  <Field Map c>
	// 1338 3966:ldc2            #1019 <String "CREDIT_CARD_CVV_CHECK_FAILED">
	// 1339 3969:ldc2            #1021 <String "Kortopplysningene er ugyldige. Vi ber deg korrigere og sende inn p\345 nytt.">
	// 1340 3972:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1341 3977:pop             
		c.put("CREDIT_CARD_REFUSED", "Kortet ble avvist.");
	// 1342 3978:getstatic       #23  <Field Map c>
	// 1343 3981:ldc2            #1023 <String "CREDIT_CARD_REFUSED">
	// 1344 3984:ldc2            #1025 <String "Kortet ble avvist.">
	// 1345 3987:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1346 3992:pop             
		c.put("CURRENCY_MISMATCH", "Valuta for innhentingen m\345 v\346re lik valutaen for godkjenning.");
	// 1347 3993:getstatic       #23  <Field Map c>
	// 1348 3996:ldc2            #1027 <String "CURRENCY_MISMATCH">
	// 1349 3999:ldc2            #1029 <String "Valuta for innhentingen m\345 v\346re lik valutaen for godkjenning.">
	// 1350 4002:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1351 4007:pop             
		c.put("CURRENCY_NOT_ALLOWED", "Denne valutaen st\370ttes for \370yeblikket ikke av PayPal.");
	// 1352 4008:getstatic       #23  <Field Map c>
	// 1353 4011:ldc2            #1031 <String "CURRENCY_NOT_ALLOWED">
	// 1354 4014:ldc2            #1033 <String "Denne valutaen st\370ttes for \370yeblikket ikke av PayPal.">
	// 1355 4017:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1356 4022:pop             
		c.put("DATA_RETRIEVAL", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1357 4023:getstatic       #23  <Field Map c>
	// 1358 4026:ldc2            #1035 <String "DATA_RETRIEVAL">
	// 1359 4029:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1360 4032:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1361 4037:pop             
		c.put("DUPLICATE_REQUEST_ID", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1362 4038:getstatic       #23  <Field Map c>
	// 1363 4041:ldc2            #1037 <String "DUPLICATE_REQUEST_ID">
	// 1364 4044:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1365 4047:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1366 4052:pop             
		c.put("EXPIRED_CREDIT_CARD", "Kortet er utl\370pt");
	// 1367 4053:getstatic       #23  <Field Map c>
	// 1368 4056:ldc2            #1039 <String "EXPIRED_CREDIT_CARD">
	// 1369 4059:ldc2            #1041 <String "Kortet er utl\370pt">
	// 1370 4062:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1371 4067:pop             
		c.put("EXPIRED_CREDIT_CARD_TOKEN", "Informasjonen for dette kortet er ikke lenger registrert.\nVennligst send p\345 nytt.");
	// 1372 4068:getstatic       #23  <Field Map c>
	// 1373 4071:ldc2            #1043 <String "EXPIRED_CREDIT_CARD_TOKEN">
	// 1374 4074:ldc2            #1045 <String "Informasjonen for dette kortet er ikke lenger registrert.\nVennligst send p\345 nytt.">
	// 1375 4077:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1376 4082:pop             
		c.put("FEATURE_UNSUPPORTED_FOR_PAYEE", "Funksjonen st\370ttes ikke for denne forhandleren.");
	// 1377 4083:getstatic       #23  <Field Map c>
	// 1378 4086:ldc2            #1047 <String "FEATURE_UNSUPPORTED_FOR_PAYEE">
	// 1379 4089:ldc2            #1049 <String "Funksjonen st\370ttes ikke for denne forhandleren.">
	// 1380 4092:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1381 4097:pop             
		c.put("FULL_REFUND_NOT_ALLOWED_AFTER_PARTIAL_REFUND", "Denne transaksjonen er allerede delvis refundert.");
	// 1382 4098:getstatic       #23  <Field Map c>
	// 1383 4101:ldc2            #1051 <String "FULL_REFUND_NOT_ALLOWED_AFTER_PARTIAL_REFUND">
	// 1384 4104:ldc2            #1053 <String "Denne transaksjonen er allerede delvis refundert.">
	// 1385 4107:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1386 4112:pop             
		c.put("IMMEDIATE_PAY_NOT_SUPPORTED", "\330yeblikkelig betaling st\370ttes ikke for den forespurte tjenesten.");
	// 1387 4113:getstatic       #23  <Field Map c>
	// 1388 4116:ldc2            #1055 <String "IMMEDIATE_PAY_NOT_SUPPORTED">
	// 1389 4119:ldc2            #1057 <String "\330yeblikkelig betaling st\370ttes ikke for den forespurte tjenesten.">
	// 1390 4122:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1391 4127:pop             
		c.put("INSTRUMENT_DECLINED", "Den betalingsmetoden du valgte ble ikke godtatt. Velg en annen betalingsmetode.");
	// 1392 4128:getstatic       #23  <Field Map c>
	// 1393 4131:ldc2            #1059 <String "INSTRUMENT_DECLINED">
	// 1394 4134:ldc2            #1061 <String "Den betalingsmetoden du valgte ble ikke godtatt. Velg en annen betalingsmetode.">
	// 1395 4137:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1396 4142:pop             
		c.put("INSUFFICIENT_FUNDS", "Kj\370peren kan ikke betale \u2013 ikke nok penger.");
	// 1397 4143:getstatic       #23  <Field Map c>
	// 1398 4146:ldc2            #1063 <String "INSUFFICIENT_FUNDS">
	// 1399 4149:ldc2            #1065 <String "Kj\370peren kan ikke betale \u2013 ikke nok penger.">
	// 1400 4152:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1401 4157:pop             
		c.put("INTERNAL_SERVICE_ERROR", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1402 4158:getstatic       #23  <Field Map c>
	// 1403 4161:ldc2            #1067 <String "INTERNAL_SERVICE_ERROR">
	// 1404 4164:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1405 4167:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1406 4172:pop             
		c.put("INVALID_ACCOUNT_NUMBER", "Det kontonummeret finnes ikke.");
	// 1407 4173:getstatic       #23  <Field Map c>
	// 1408 4176:ldc2            #1069 <String "INVALID_ACCOUNT_NUMBER">
	// 1409 4179:ldc2            #1071 <String "Det kontonummeret finnes ikke.">
	// 1410 4182:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1411 4187:pop             
		c.put("INVALID_ARGUMENT", "Transaksjon avvist p\345 grunn av et ugyldig parameter");
	// 1412 4188:getstatic       #23  <Field Map c>
	// 1413 4191:ldc2            #1073 <String "INVALID_ARGUMENT">
	// 1414 4194:ldc2            #1075 <String "Transaksjon avvist p\345 grunn av et ugyldig parameter">
	// 1415 4197:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1416 4202:pop             
		c.put("INVALID_CITY_STATE_ZIP", "Ugyldig kombinasjon for poststed/land/postnummerkombinasjon.");
	// 1417 4203:getstatic       #23  <Field Map c>
	// 1418 4206:ldc2            #1077 <String "INVALID_CITY_STATE_ZIP">
	// 1419 4209:ldc2            #1079 <String "Ugyldig kombinasjon for poststed/land/postnummerkombinasjon.">
	// 1420 4212:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1421 4217:pop             
		c.put("INVALID_FACILITATOR_CONFIGURATION", "Denne transaksjonen kan ikke behandles p\345 grunn av en ugyldig systeminnretningskonfigurasjon.");
	// 1422 4218:getstatic       #23  <Field Map c>
	// 1423 4221:ldc2            #1081 <String "INVALID_FACILITATOR_CONFIGURATION">
	// 1424 4224:ldc2            #1083 <String "Denne transaksjonen kan ikke behandles p\345 grunn av en ugyldig systeminnretningskonfigurasjon.">
	// 1425 4227:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1426 4232:pop             
		c.put("INVALID_PAYER_ID", "Systemfeil (ugyldig betaler-id). Pr\370v p\345 nytt senere.");
	// 1427 4233:getstatic       #23  <Field Map c>
	// 1428 4236:ldc2            #1085 <String "INVALID_PAYER_ID">
	// 1429 4239:ldc2            #1087 <String "Systemfeil (ugyldig betaler-id). Pr\370v p\345 nytt senere.">
	// 1430 4242:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1431 4247:pop             
		c.put("INVALID_RESOURCE_ID", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1432 4248:getstatic       #23  <Field Map c>
	// 1433 4251:ldc2            #1089 <String "INVALID_RESOURCE_ID">
	// 1434 4254:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1435 4257:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1436 4262:pop             
		c.put("PAYEE_ACCOUNT_INVALID", "Kontoen til betalingsmottakeren din har ikke en bekreftet e-post.");
	// 1437 4263:getstatic       #23  <Field Map c>
	// 1438 4266:ldc2            #1091 <String "PAYEE_ACCOUNT_INVALID">
	// 1439 4269:ldc2            #1093 <String "Kontoen til betalingsmottakeren din har ikke en bekreftet e-post.">
	// 1440 4272:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1441 4277:pop             
		c.put("PAYEE_ACCOUNT_LOCKED_OR_CLOSED", "Selgeren kan for \370yeblikket ikke motta betalinger.");
	// 1442 4278:getstatic       #23  <Field Map c>
	// 1443 4281:ldc2            #1095 <String "PAYEE_ACCOUNT_LOCKED_OR_CLOSED">
	// 1444 4284:ldc2            #1097 <String "Selgeren kan for \370yeblikket ikke motta betalinger.">
	// 1445 4287:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1446 4292:pop             
		c.put("PAYEE_ACCOUNT_NO_CONFIRMED_EMAIL", "Kontoen til betalingsmottakeren din har ikke en bekreftet e-post.");
	// 1447 4293:getstatic       #23  <Field Map c>
	// 1448 4296:ldc2            #1099 <String "PAYEE_ACCOUNT_NO_CONFIRMED_EMAIL">
	// 1449 4299:ldc2            #1093 <String "Kontoen til betalingsmottakeren din har ikke en bekreftet e-post.">
	// 1450 4302:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1451 4307:pop             
		c.put("PAYEE_ACCOUNT_RESTRICTED", "Selgeren kan for \370yeblikket ikke motta betalinger.");
	// 1452 4308:getstatic       #23  <Field Map c>
	// 1453 4311:ldc2            #1101 <String "PAYEE_ACCOUNT_RESTRICTED">
	// 1454 4314:ldc2            #1097 <String "Selgeren kan for \370yeblikket ikke motta betalinger.">
	// 1455 4317:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1456 4322:pop             
		c.put("PAYER_ACCOUNT_LOCKED_OR_CLOSED", "Kontoen din er l\345st eller avsluttet.");
	// 1457 4323:getstatic       #23  <Field Map c>
	// 1458 4326:ldc2            #1103 <String "PAYER_ACCOUNT_LOCKED_OR_CLOSED">
	// 1459 4329:ldc2            #1105 <String "Kontoen din er l\345st eller avsluttet.">
	// 1460 4332:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1461 4337:pop             
		c.put("PAYER_ACCOUNT_RESTRICTED", "Kontoen din er begrenset.");
	// 1462 4338:getstatic       #23  <Field Map c>
	// 1463 4341:ldc2            #1107 <String "PAYER_ACCOUNT_RESTRICTED">
	// 1464 4344:ldc2            #1109 <String "Kontoen din er begrenset.">
	// 1465 4347:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1466 4352:pop             
		c.put("PAYER_CANNOT_PAY", "Du kan ikke betale for denne transaksjonen med PayPal.");
	// 1467 4353:getstatic       #23  <Field Map c>
	// 1468 4356:ldc2            #1111 <String "PAYER_CANNOT_PAY">
	// 1469 4359:ldc2            #1113 <String "Du kan ikke betale for denne transaksjonen med PayPal.">
	// 1470 4362:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1471 4367:pop             
		c.put("PAYER_EMPTY_BILLING_ADDRESS", "Det er n\370dvendig med en faktureringsadresse ved betalingskorttransaksjoner utenfor PayPal.");
	// 1472 4368:getstatic       #23  <Field Map c>
	// 1473 4371:ldc2            #1115 <String "PAYER_EMPTY_BILLING_ADDRESS">
	// 1474 4374:ldc2            #1117 <String "Det er n\370dvendig med en faktureringsadresse ved betalingskorttransaksjoner utenfor PayPal.">
	// 1475 4377:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1476 4382:pop             
		c.put("PAYER_ID_MISSING_FOR_CARD_TOKEN", "F\345r ikke tilgang til lagret kortinformasjonen.");
	// 1477 4383:getstatic       #23  <Field Map c>
	// 1478 4386:ldc2            #1119 <String "PAYER_ID_MISSING_FOR_CARD_TOKEN">
	// 1479 4389:ldc2            #1017 <String "F\345r ikke tilgang til lagret kortinformasjonen.">
	// 1480 4392:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1481 4397:pop             
		c.put("PAYMENT_APPROVAL_EXPIRED", "Betalingsgodkjenningen er utl\370pt.");
	// 1482 4398:getstatic       #23  <Field Map c>
	// 1483 4401:ldc2            #1121 <String "PAYMENT_APPROVAL_EXPIRED">
	// 1484 4404:ldc2            #1123 <String "Betalingsgodkjenningen er utl\370pt.">
	// 1485 4407:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1486 4412:pop             
		c.put("PAYMENT_EXPIRED", "Betalingen er utl\370pt.");
	// 1487 4413:getstatic       #23  <Field Map c>
	// 1488 4416:ldc2            #1125 <String "PAYMENT_EXPIRED">
	// 1489 4419:ldc2            #1127 <String "Betalingen er utl\370pt.">
	// 1490 4422:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1491 4427:pop             
		c.put("PAYMENT_NOT_APPROVED_FOR_EXECUTION", "Betaleren har ikke godtatt betalingen.");
	// 1492 4428:getstatic       #23  <Field Map c>
	// 1493 4431:ldc2            #1129 <String "PAYMENT_NOT_APPROVED_FOR_EXECUTION">
	// 1494 4434:ldc2            #1131 <String "Betaleren har ikke godtatt betalingen.">
	// 1495 4437:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1496 4442:pop             
		c.put("PAYMENT_REQUEST_ID_INVALID", "PayPal-foresp\370rselen er ugyldig. Pr\370v p\345 nytt senere.");
	// 1497 4443:getstatic       #23  <Field Map c>
	// 1498 4446:ldc2            #1133 <String "PAYMENT_REQUEST_ID_INVALID">
	// 1499 4449:ldc2            #1135 <String "PayPal-foresp\370rselen er ugyldig. Pr\370v p\345 nytt senere.">
	// 1500 4452:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1501 4457:pop             
		c.put("PAYMENT_STATE_INVALID", "Denne foresp\370rselen er ugyldig p\345 grunn av gjeldende status for betalingen.");
	// 1502 4458:getstatic       #23  <Field Map c>
	// 1503 4461:ldc2            #1137 <String "PAYMENT_STATE_INVALID">
	// 1504 4464:ldc2            #1139 <String "Denne foresp\370rselen er ugyldig p\345 grunn av gjeldende status for betalingen.">
	// 1505 4467:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1506 4472:pop             
		c.put("PERMISSION_DENIED", "Ingen tillatelse til den forespurte operasjonen.");
	// 1507 4473:getstatic       #23  <Field Map c>
	// 1508 4476:ldc2            #1141 <String "PERMISSION_DENIED">
	// 1509 4479:ldc2            #1143 <String "Ingen tillatelse til den forespurte operasjonen.">
	// 1510 4482:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1511 4487:pop             
		c.put("REFUND_EXCEEDED_TRANSACTION_AMOUNT", "Den forespurte refusjonen overskrider bel\370pet for den opprinnelige transaksjonen.");
	// 1512 4488:getstatic       #23  <Field Map c>
	// 1513 4491:ldc2            #1145 <String "REFUND_EXCEEDED_TRANSACTION_AMOUNT">
	// 1514 4494:ldc2            #1147 <String "Den forespurte refusjonen overskrider bel\370pet for den opprinnelige transaksjonen.">
	// 1515 4497:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1516 4502:pop             
		c.put("REFUND_TIME_LIMIT_EXCEEDED", "Denne transaksjonen er for gammel til at den kan refunderes.");
	// 1517 4503:getstatic       #23  <Field Map c>
	// 1518 4506:ldc2            #1149 <String "REFUND_TIME_LIMIT_EXCEEDED">
	// 1519 4509:ldc2            #1151 <String "Denne transaksjonen er for gammel til at den kan refunderes.">
	// 1520 4512:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1521 4517:pop             
		c.put("REQUIRED_SCOPE_MISSING", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1522 4518:getstatic       #23  <Field Map c>
	// 1523 4521:ldc2            #1153 <String "REQUIRED_SCOPE_MISSING">
	// 1524 4524:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1525 4527:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1526 4532:pop             
		c.put("TOO_MANY_REAUTHORIZATIONS", "Ingen flere nye godkjenninger er tillatt for denne godkjenningen.");
	// 1527 4533:getstatic       #23  <Field Map c>
	// 1528 4536:ldc2            #1155 <String "TOO_MANY_REAUTHORIZATIONS">
	// 1529 4539:ldc2            #1157 <String "Ingen flere nye godkjenninger er tillatt for denne godkjenningen.">
	// 1530 4542:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1531 4547:pop             
		c.put("TRANSACTION_ALREADY_REFUNDED", "Denne transaksjonen er allerede refundert.");
	// 1532 4548:getstatic       #23  <Field Map c>
	// 1533 4551:ldc2            #1159 <String "TRANSACTION_ALREADY_REFUNDED">
	// 1534 4554:ldc2            #1161 <String "Denne transaksjonen er allerede refundert.">
	// 1535 4557:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1536 4562:pop             
		c.put("TRANSACTION_LIMIT_EXCEEDED", "Bel\370pet overskrider den tillatte grensen.");
	// 1537 4563:getstatic       #23  <Field Map c>
	// 1538 4566:ldc2            #1163 <String "TRANSACTION_LIMIT_EXCEEDED">
	// 1539 4569:ldc2            #1013 <String "Bel\370pet overskrider den tillatte grensen.">
	// 1540 4572:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1541 4577:pop             
		c.put("TRANSACTION_REFUSED", "Transaksjonen ble avvist.");
	// 1542 4578:getstatic       #23  <Field Map c>
	// 1543 4581:ldc2            #1165 <String "TRANSACTION_REFUSED">
	// 1544 4584:ldc2            #1167 <String "Transaksjonen ble avvist.">
	// 1545 4587:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1546 4592:pop             
		c.put("TRANSACTION_REFUSED_BY_PAYPAL_RISK", "Transaksjonen ble avvist.");
	// 1547 4593:getstatic       #23  <Field Map c>
	// 1548 4596:ldc2            #1169 <String "TRANSACTION_REFUSED_BY_PAYPAL_RISK">
	// 1549 4599:ldc2            #1167 <String "Transaksjonen ble avvist.">
	// 1550 4602:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1551 4607:pop             
		c.put("TRANSACTION_REFUSED_PAYEE_PREFERENCE", "Forhandlerprofilen er innstilt til \345 automatisk tilbakevise visse transaksjoner.");
	// 1552 4608:getstatic       #23  <Field Map c>
	// 1553 4611:ldc2            #1171 <String "TRANSACTION_REFUSED_PAYEE_PREFERENCE">
	// 1554 4614:ldc2            #1173 <String "Forhandlerprofilen er innstilt til \345 automatisk tilbakevise visse transaksjoner.">
	// 1555 4617:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1556 4622:pop             
		c.put("UNKNOWN_ERROR", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1557 4623:getstatic       #23  <Field Map c>
	// 1558 4626:ldc2            #1175 <String "UNKNOWN_ERROR">
	// 1559 4629:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1560 4632:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1561 4637:pop             
		c.put("UNSUPPORTED_PAYEE_COUNTRY", "Landet st\370ttes ikke.");
	// 1562 4638:getstatic       #23  <Field Map c>
	// 1563 4641:ldc2            #1177 <String "UNSUPPORTED_PAYEE_COUNTRY">
	// 1564 4644:ldc2            #1179 <String "Landet st\370ttes ikke.">
	// 1565 4647:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1566 4652:pop             
		c.put("VALIDATION_ERROR", "Betalingsinformasjonen er ugyldig. Vi ber deg korrigere og sende inn p\345 nytt.");
	// 1567 4653:getstatic       #23  <Field Map c>
	// 1568 4656:ldc2            #1181 <String "VALIDATION_ERROR">
	// 1569 4659:ldc2            #1183 <String "Betalingsinformasjonen er ugyldig. Vi ber deg korrigere og sende inn p\345 nytt.">
	// 1570 4662:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1571 4667:pop             
		c.put("ORDER_ALREADY_COMPLETED", "Bestillingen er allerede annullert, utl\370pt eller fullf\370rt.");
	// 1572 4668:getstatic       #23  <Field Map c>
	// 1573 4671:ldc2            #1185 <String "ORDER_ALREADY_COMPLETED">
	// 1574 4674:ldc2            #1187 <String "Bestillingen er allerede annullert, utl\370pt eller fullf\370rt.">
	// 1575 4677:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1576 4682:pop             
		c.put("MAXIMUM_ALLOWED_AUTHORIZATION_REACHED_FOR_ORDER", "Maksimalt antall tillatte godkjenninger for bestillingen er n\345dd.");
	// 1577 4683:getstatic       #23  <Field Map c>
	// 1578 4686:ldc2            #1189 <String "MAXIMUM_ALLOWED_AUTHORIZATION_REACHED_FOR_ORDER">
	// 1579 4689:ldc2            #1191 <String "Maksimalt antall tillatte godkjenninger for bestillingen er n\345dd.">
	// 1580 4692:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1581 4697:pop             
		c.put("ORDER_VOIDED", "Bestillingen er blitt annullert.");
	// 1582 4698:getstatic       #23  <Field Map c>
	// 1583 4701:ldc2            #1193 <String "ORDER_VOIDED">
	// 1584 4704:ldc2            #1195 <String "Bestillingen er blitt annullert.">
	// 1585 4707:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1586 4712:pop             
		c.put("ORDER_CANNOT_BE_VOIDED", "Det er ikke mulig \345 annullere bestillingen i denne delen av prosessen.");
	// 1587 4713:getstatic       #23  <Field Map c>
	// 1588 4716:ldc2            #1197 <String "ORDER_CANNOT_BE_VOIDED">
	// 1589 4719:ldc2            #1199 <String "Det er ikke mulig \345 annullere bestillingen i denne delen av prosessen.">
	// 1590 4722:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1591 4727:pop             
		c.put("INVALID_EXPERIENCE_PROFILE_ID", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1592 4728:getstatic       #23  <Field Map c>
	// 1593 4731:ldc2            #1201 <String "INVALID_EXPERIENCE_PROFILE_ID">
	// 1594 4734:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1595 4737:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1596 4742:pop             
		c.put("UNAUTHORIZED_PAYMENT", "Forhandleren godtar ikke betalinger av denne typen.");
	// 1597 4743:getstatic       #23  <Field Map c>
	// 1598 4746:ldc2            #1203 <String "UNAUTHORIZED_PAYMENT">
	// 1599 4749:ldc2            #1205 <String "Forhandleren godtar ikke betalinger av denne typen.">
	// 1600 4752:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1601 4757:pop             
		c.put("DCC_UNSUPPORTED_CURRENCY_CC_TYPE", "Valuta ikke st\370ttet for korttypen.");
	// 1602 4758:getstatic       #23  <Field Map c>
	// 1603 4761:ldc2            #1207 <String "DCC_UNSUPPORTED_CURRENCY_CC_TYPE">
	// 1604 4764:ldc2            #1209 <String "Valuta ikke st\370ttet for korttypen.">
	// 1605 4767:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1606 4772:pop             
		c.put("DCC_CC_TYPE_NOT_SUPPORTED", "Korttypen st\370ttes ikke.");
	// 1607 4773:getstatic       #23  <Field Map c>
	// 1608 4776:ldc2            #1211 <String "DCC_CC_TYPE_NOT_SUPPORTED">
	// 1609 4779:ldc2            #1213 <String "Korttypen st\370ttes ikke.">
	// 1610 4782:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1611 4787:pop             
		c.put("ADDRESS_ADDITION_ERROR", "Det oppstod et problem i l\370pet av prosessen med \345 legge til en forsendelsesadresse i PayPal-kontoen.");
	// 1612 4788:getstatic       #23  <Field Map c>
	// 1613 4791:ldc2            #1215 <String "ADDRESS_ADDITION_ERROR">
	// 1614 4794:ldc2            #1217 <String "Det oppstod et problem i l\370pet av prosessen med \345 legge til en forsendelsesadresse i PayPal-kontoen.">
	// 1615 4797:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1616 4802:pop             
		c.put("DUPLICATE_TRANSACTION", "Duplikattransaksjon.");
	// 1617 4803:getstatic       #23  <Field Map c>
	// 1618 4806:ldc2            #1219 <String "DUPLICATE_TRANSACTION">
	// 1619 4809:ldc2            #1221 <String "Duplikattransaksjon.">
	// 1620 4812:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1621 4817:pop             
		c.put("INVALID_SHIPPING_ADDRESS", "Den oppgitte leveringsadressen er ikke gyldig.");
	// 1622 4818:getstatic       #23  <Field Map c>
	// 1623 4821:ldc2            #1223 <String "INVALID_SHIPPING_ADDRESS">
	// 1624 4824:ldc2            #1225 <String "Den oppgitte leveringsadressen er ikke gyldig.">
	// 1625 4827:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1626 4832:pop             
		c.put("PAYMENT_CREATION_ERROR", "Det oppsto et problem med opprettelsen av denne betalingen. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1627 4833:getstatic       #23  <Field Map c>
	// 1628 4836:ldc2            #1227 <String "PAYMENT_CREATION_ERROR">
	// 1629 4839:ldc2            #1229 <String "Det oppsto et problem med opprettelsen av denne betalingen. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1630 4842:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1631 4847:pop             
		c.put("PAYMENT_CREATION_ERROR_EXPIRED_PAYMENT_CARD", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kortet ditt er utl\370pt. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1632 4848:getstatic       #23  <Field Map c>
	// 1633 4851:ldc2            #1231 <String "PAYMENT_CREATION_ERROR_EXPIRED_PAYMENT_CARD">
	// 1634 4854:ldc2            #1233 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kortet ditt er utl\370pt. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1635 4857:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1636 4862:pop             
		c.put("PAYMENT_CREATION_ERROR_INSTANT_PAYMENT_REQUIRED", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 direktebetaling kreves, f.eks. med et kredittkort. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1637 4863:getstatic       #23  <Field Map c>
	// 1638 4866:ldc2            #1235 <String "PAYMENT_CREATION_ERROR_INSTANT_PAYMENT_REQUIRED">
	// 1639 4869:ldc2            #1237 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 direktebetaling kreves, f.eks. med et kredittkort. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1640 4872:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1641 4877:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_CONFIRMED_CARD", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kortet m\345 bekreftes. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1642 4878:getstatic       #23  <Field Map c>
	// 1643 4881:ldc2            #1239 <String "PAYMENT_CREATION_ERROR_NEED_CONFIRMED_CARD">
	// 1644 4884:ldc2            #1241 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kortet m\345 bekreftes. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1645 4887:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1646 4892:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_PHONE_NUMBER", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 denne appen krever at kontoen din inneholder et telefonnummer. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1647 4893:getstatic       #23  <Field Map c>
	// 1648 4896:ldc2            #1243 <String "PAYMENT_CREATION_ERROR_NEED_PHONE_NUMBER">
	// 1649 4899:ldc2            #1245 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 denne appen krever at kontoen din inneholder et telefonnummer. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1650 4902:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1651 4907:pop             
		c.put("PAYMENT_CREATION_ERROR_NEED_VALID_FUNDING_INSTRUMENT", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kontoen m\345 ha en gyldig finansieringskilde, f.eks. en bankkonto eller et betalingskort. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1652 4908:getstatic       #23  <Field Map c>
	// 1653 4911:ldc2            #1247 <String "PAYMENT_CREATION_ERROR_NEED_VALID_FUNDING_INSTRUMENT">
	// 1654 4914:ldc2            #1249 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 kontoen m\345 ha en gyldig finansieringskilde, f.eks. en bankkonto eller et betalingskort. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1655 4917:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1656 4922:pop             
		c.put("PAYMENT_CREATION_ERROR_NEGATIVE_BALANCE", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 saldoen din er i minus. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1657 4923:getstatic       #23  <Field Map c>
	// 1658 4926:ldc2            #1251 <String "PAYMENT_CREATION_ERROR_NEGATIVE_BALANCE">
	// 1659 4929:ldc2            #1253 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 saldoen din er i minus. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1660 4932:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1661 4937:pop             
		c.put("PAYMENT_CREATION_ERROR_SENDING_LIMIT_REACHED", "Det oppsto et problem med opprettelsen av denne betalingen \u2013 sendegrensen din er n\345dd. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.");
	// 1662 4938:getstatic       #23  <Field Map c>
	// 1663 4941:ldc2            #1255 <String "PAYMENT_CREATION_ERROR_SENDING_LIMIT_REACHED">
	// 1664 4944:ldc2            #1257 <String "Det oppsto et problem med opprettelsen av denne betalingen \u2013 sendegrensen din er n\345dd. G\345 til PayPal-nettstedet for \345 kontrollere kontoen din.">
	// 1665 4947:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1666 4952:pop             
		c.put("AUTH_RC_RISK_FAILURE", "Avvist grunnet risiko.");
	// 1667 4953:getstatic       #23  <Field Map c>
	// 1668 4956:ldc2            #1259 <String "AUTH_RC_RISK_FAILURE">
	// 1669 4959:ldc2            #1261 <String "Avvist grunnet risiko.">
	// 1670 4962:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1671 4967:pop             
		c.put("AUTH_RC_OFAC_BLOCKED_IP", "Klienten er ikke godkjent.");
	// 1672 4968:getstatic       #23  <Field Map c>
	// 1673 4971:ldc2            #1263 <String "AUTH_RC_OFAC_BLOCKED_IP">
	// 1674 4974:ldc2            #1265 <String "Klienten er ikke godkjent.">
	// 1675 4977:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1676 4982:pop             
		c.put("AUTH_RC_IP_COMPLIANCE_FAILURE", "Klienten er ikke godkjent.");
	// 1677 4983:getstatic       #23  <Field Map c>
	// 1678 4986:ldc2            #1267 <String "AUTH_RC_IP_COMPLIANCE_FAILURE">
	// 1679 4989:ldc2            #1265 <String "Klienten er ikke godkjent.">
	// 1680 4992:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1681 4997:pop             
		c.put("invalid_user", "Feil brukernavn/passord. Pr\370v p\345 nytt.");
	// 1682 4998:getstatic       #23  <Field Map c>
	// 1683 5001:ldc2            #1269 <String "invalid_user">
	// 1684 5004:ldc2            #1271 <String "Feil brukernavn/passord. Pr\370v p\345 nytt.">
	// 1685 5007:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1686 5012:pop             
		c.put("locked_user", "PayPal-kontoen din er midlertidig sperret. Pr\370v p\345 nytt senere, eller g\345 til www.paypal.com for \345 l\345se opp PayPal-kontoen din med en gang.");
	// 1687 5013:getstatic       #23  <Field Map c>
	// 1688 5016:ldc2            #1273 <String "locked_user">
	// 1689 5019:ldc2            #1275 <String "PayPal-kontoen din er midlertidig sperret. Pr\370v p\345 nytt senere, eller g\345 til www.paypal.com for \345 l\345se opp PayPal-kontoen din med en gang.">
	// 1690 5022:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1691 5027:pop             
		c.put("max_attempts_exceeded", "For mange mislykkede p\345loggingsfors\370k. Pr\370v p\345 nytt senere.");
	// 1692 5028:getstatic       #23  <Field Map c>
	// 1693 5031:ldc2            #1277 <String "max_attempts_exceeded">
	// 1694 5034:ldc2            #1279 <String "For mange mislykkede p\345loggingsfors\370k. Pr\370v p\345 nytt senere.">
	// 1695 5037:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1696 5042:pop             
		c.put("invalid_request", "Det har oppst\345tt en feil.");
	// 1697 5043:getstatic       #23  <Field Map c>
	// 1698 5046:ldc2            #1281 <String "invalid_request">
	// 1699 5049:ldc2            #1283 <String "Det har oppst\345tt en feil.">
	// 1700 5052:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1701 5057:pop             
		c.put("unauthorized_client", "Ikke godkjent foresp\370rsel.");
	// 1702 5058:getstatic       #23  <Field Map c>
	// 1703 5061:ldc2            #1285 <String "unauthorized_client">
	// 1704 5064:ldc2            #1287 <String "Ikke godkjent foresp\370rsel.">
	// 1705 5067:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1706 5072:pop             
		c.put("access_denied", "Ikke godkjent foresp\370rsel.");
	// 1707 5073:getstatic       #23  <Field Map c>
	// 1708 5076:ldc2            #1289 <String "access_denied">
	// 1709 5079:ldc2            #1287 <String "Ikke godkjent foresp\370rsel.">
	// 1710 5082:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1711 5087:pop             
		c.put("unsupported_response_type", "Det har oppst\345tt en feil.");
	// 1712 5088:getstatic       #23  <Field Map c>
	// 1713 5091:ldc2            #1291 <String "unsupported_response_type">
	// 1714 5094:ldc2            #1283 <String "Det har oppst\345tt en feil.">
	// 1715 5097:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1716 5102:pop             
		c.put("invalid_scope", "Ikke godkjent foresp\370rsel.");
	// 1717 5103:getstatic       #23  <Field Map c>
	// 1718 5106:ldc2            #1293 <String "invalid_scope">
	// 1719 5109:ldc2            #1287 <String "Ikke godkjent foresp\370rsel.">
	// 1720 5112:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1721 5117:pop             
		c.put("server_error", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1722 5118:getstatic       #23  <Field Map c>
	// 1723 5121:ldc2            #1295 <String "server_error">
	// 1724 5124:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1725 5127:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1726 5132:pop             
		c.put("temporarily_unavailable", "Systemfeil. Pr\370v p\345 nytt senere.");
	// 1727 5133:getstatic       #23  <Field Map c>
	// 1728 5136:ldc2            #1297 <String "temporarily_unavailable">
	// 1729 5139:ldc2            #655 <String "Systemfeil. Pr\370v p\345 nytt senere.">
	// 1730 5142:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1731 5147:pop             
		c.put("stepup_required", "Det er ikke mulig \345 logge p\345 akkurat n\345. Pr\370v p\345 nytt senere, eller g\345 til www.paypal.com for \345 l\370se eventuelle sikkerhetsproblemer med kontoen din.");
	// 1732 5148:getstatic       #23  <Field Map c>
	// 1733 5151:ldc2            #1299 <String "stepup_required">
	// 1734 5154:ldc2            #1301 <String "Det er ikke mulig \345 logge p\345 akkurat n\345. Pr\370v p\345 nytt senere, eller g\345 til www.paypal.com for \345 l\370se eventuelle sikkerhetsproblemer med kontoen din.">
	// 1735 5157:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1736 5162:pop             
		c.put("account_locked_generate_challenge_limit_exceeded", "For mange p\345loggingsfors\370k. Pr\370v p\345 nytt senere, eller ta kontakt med PayPal for \345 f\345 hjelp.");
	// 1737 5163:getstatic       #23  <Field Map c>
	// 1738 5166:ldc2            #1303 <String "account_locked_generate_challenge_limit_exceeded">
	// 1739 5169:ldc2            #1305 <String "For mange p\345loggingsfors\370k. Pr\370v p\345 nytt senere, eller ta kontakt med PayPal for \345 f\345 hjelp.">
	// 1740 5172:invokeinterface #38  <Method Object Map.put(Object, Object)>
	// 1741 5177:pop             
	// 1742 5178:return          
	}

	public final String a()
	{
		return "nb";
	//    0    0:ldc2            #1308 <String "nb">
	//    1    3:areturn         
	}

	public final String a(Enum enum, String s)
	{
		enum = ((Enum) ((fc)enum));
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class fc>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #1311 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #1312 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(((fc) (enum)).toString());
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #1315 <Method String fc.toString()>
	//   10   18:invokevirtual   #1319 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append("|");
	//   12   22:aload_3         
	//   13   23:ldc2            #1321 <String "|">
	//   14   26:invokevirtual   #1319 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #1319 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		s = stringbuilder.toString();
	//   20   36:aload_3         
	//   21   37:invokevirtual   #1322 <Method String StringBuilder.toString()>
	//   22   40:astore_2        
		if(b.containsKey(((Object) (s))))
	//*  23   41:getstatic       #21  <Field Map b>
	//*  24   44:aload_2         
	//*  25   45:invokeinterface #1326 <Method boolean Map.containsKey(Object)>
	//*  26   50:ifeq            68
			enum = ((Enum) (b.get(((Object) (s)))));
	//   27   53:getstatic       #21  <Field Map b>
	//   28   56:aload_2         
	//   29   57:invokeinterface #1330 <Method Object Map.get(Object)>
	//   30   62:astore_1        
		else
	//*  31   63:aload_1         
	//*  32   64:checkcast       #1332 <Class String>
	//*  33   67:areturn         
			enum = ((Enum) (a.get(((Object) (enum)))));
	//   34   68:getstatic       #19  <Field Map a>
	//   35   71:aload_1         
	//   36   72:invokeinterface #1330 <Method Object Map.get(Object)>
	//   37   77:astore_1        
		return (String)enum;
	//*  38   78:goto            63
	}

	public final String a(String s)
	{
		return (String)c.get(((Object) (s)));
	//    0    0:getstatic       #23  <Field Map c>
	//    1    3:aload_1         
	//    2    4:invokeinterface #1330 <Method Object Map.get(Object)>
	//    3    9:checkcast       #1332 <Class String>
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
