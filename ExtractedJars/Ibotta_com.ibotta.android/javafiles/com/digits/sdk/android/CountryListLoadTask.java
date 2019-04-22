// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import io.fabric.sdk.android.services.concurrency.AsyncTask;
import java.util.*;

// Referenced classes of package com.digits.sdk.android:
//			CountryInfo

class CountryListLoadTask extends AsyncTask
{
	public static interface Listener
	{

		public abstract void onLoadComplete(List list);
	}


	public CountryListLoadTask(Listener listener1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AsyncTask()>
		listener = listener1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field CountryListLoadTask$Listener listener>
	//    5    9:return          
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Void[]>
	//    3    5:invokevirtual   #25  <Method List doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient List doInBackground(Void avoid[])
	{
		avoid = ((Void []) (new ArrayList(291)));
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:sipush          291
	//    3    7:invokespecial   #30  <Method void ArrayList(int)>
	//    4   10:astore_1        
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AF")).getDisplayCountry(), 93))));
	//    5   11:aload_1         
	//    6   12:new             #32  <Class CountryInfo>
	//    7   15:dup             
	//    8   16:new             #34  <Class Locale>
	//    9   19:dup             
	//   10   20:ldc1            #36  <String "">
	//   11   22:ldc1            #38  <String "AF">
	//   12   24:invokespecial   #41  <Method void Locale(String, String)>
	//   13   27:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   14   30:bipush          93
	//   15   32:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   16   35:invokeinterface #54  <Method boolean List.add(Object)>
	//   17   40:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AX")).getDisplayCountry(), 358))));
	//   18   41:aload_1         
	//   19   42:new             #32  <Class CountryInfo>
	//   20   45:dup             
	//   21   46:new             #34  <Class Locale>
	//   22   49:dup             
	//   23   50:ldc1            #36  <String "">
	//   24   52:ldc1            #56  <String "AX">
	//   25   54:invokespecial   #41  <Method void Locale(String, String)>
	//   26   57:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   27   60:sipush          358
	//   28   63:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   29   66:invokeinterface #54  <Method boolean List.add(Object)>
	//   30   71:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AL")).getDisplayCountry(), 355))));
	//   31   72:aload_1         
	//   32   73:new             #32  <Class CountryInfo>
	//   33   76:dup             
	//   34   77:new             #34  <Class Locale>
	//   35   80:dup             
	//   36   81:ldc1            #36  <String "">
	//   37   83:ldc1            #58  <String "AL">
	//   38   85:invokespecial   #41  <Method void Locale(String, String)>
	//   39   88:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   40   91:sipush          355
	//   41   94:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   42   97:invokeinterface #54  <Method boolean List.add(Object)>
	//   43  102:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DZ")).getDisplayCountry(), 213))));
	//   44  103:aload_1         
	//   45  104:new             #32  <Class CountryInfo>
	//   46  107:dup             
	//   47  108:new             #34  <Class Locale>
	//   48  111:dup             
	//   49  112:ldc1            #36  <String "">
	//   50  114:ldc1            #60  <String "DZ">
	//   51  116:invokespecial   #41  <Method void Locale(String, String)>
	//   52  119:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   53  122:sipush          213
	//   54  125:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   55  128:invokeinterface #54  <Method boolean List.add(Object)>
	//   56  133:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AS")).getDisplayCountry(), 1))));
	//   57  134:aload_1         
	//   58  135:new             #32  <Class CountryInfo>
	//   59  138:dup             
	//   60  139:new             #34  <Class Locale>
	//   61  142:dup             
	//   62  143:ldc1            #36  <String "">
	//   63  145:ldc1            #62  <String "AS">
	//   64  147:invokespecial   #41  <Method void Locale(String, String)>
	//   65  150:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   66  153:iconst_1        
	//   67  154:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   68  157:invokeinterface #54  <Method boolean List.add(Object)>
	//   69  162:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AD")).getDisplayCountry(), 376))));
	//   70  163:aload_1         
	//   71  164:new             #32  <Class CountryInfo>
	//   72  167:dup             
	//   73  168:new             #34  <Class Locale>
	//   74  171:dup             
	//   75  172:ldc1            #36  <String "">
	//   76  174:ldc1            #64  <String "AD">
	//   77  176:invokespecial   #41  <Method void Locale(String, String)>
	//   78  179:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   79  182:sipush          376
	//   80  185:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   81  188:invokeinterface #54  <Method boolean List.add(Object)>
	//   82  193:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AO")).getDisplayCountry(), 244))));
	//   83  194:aload_1         
	//   84  195:new             #32  <Class CountryInfo>
	//   85  198:dup             
	//   86  199:new             #34  <Class Locale>
	//   87  202:dup             
	//   88  203:ldc1            #36  <String "">
	//   89  205:ldc1            #66  <String "AO">
	//   90  207:invokespecial   #41  <Method void Locale(String, String)>
	//   91  210:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//   92  213:sipush          244
	//   93  216:invokespecial   #48  <Method void CountryInfo(String, int)>
	//   94  219:invokeinterface #54  <Method boolean List.add(Object)>
	//   95  224:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AI")).getDisplayCountry(), 1))));
	//   96  225:aload_1         
	//   97  226:new             #32  <Class CountryInfo>
	//   98  229:dup             
	//   99  230:new             #34  <Class Locale>
	//  100  233:dup             
	//  101  234:ldc1            #36  <String "">
	//  102  236:ldc1            #68  <String "AI">
	//  103  238:invokespecial   #41  <Method void Locale(String, String)>
	//  104  241:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  105  244:iconst_1        
	//  106  245:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  107  248:invokeinterface #54  <Method boolean List.add(Object)>
	//  108  253:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AG")).getDisplayCountry(), 1))));
	//  109  254:aload_1         
	//  110  255:new             #32  <Class CountryInfo>
	//  111  258:dup             
	//  112  259:new             #34  <Class Locale>
	//  113  262:dup             
	//  114  263:ldc1            #36  <String "">
	//  115  265:ldc1            #70  <String "AG">
	//  116  267:invokespecial   #41  <Method void Locale(String, String)>
	//  117  270:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  118  273:iconst_1        
	//  119  274:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  120  277:invokeinterface #54  <Method boolean List.add(Object)>
	//  121  282:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AR")).getDisplayCountry(), 54))));
	//  122  283:aload_1         
	//  123  284:new             #32  <Class CountryInfo>
	//  124  287:dup             
	//  125  288:new             #34  <Class Locale>
	//  126  291:dup             
	//  127  292:ldc1            #36  <String "">
	//  128  294:ldc1            #72  <String "AR">
	//  129  296:invokespecial   #41  <Method void Locale(String, String)>
	//  130  299:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  131  302:bipush          54
	//  132  304:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  133  307:invokeinterface #54  <Method boolean List.add(Object)>
	//  134  312:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AM")).getDisplayCountry(), 374))));
	//  135  313:aload_1         
	//  136  314:new             #32  <Class CountryInfo>
	//  137  317:dup             
	//  138  318:new             #34  <Class Locale>
	//  139  321:dup             
	//  140  322:ldc1            #36  <String "">
	//  141  324:ldc1            #74  <String "AM">
	//  142  326:invokespecial   #41  <Method void Locale(String, String)>
	//  143  329:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  144  332:sipush          374
	//  145  335:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  146  338:invokeinterface #54  <Method boolean List.add(Object)>
	//  147  343:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AW")).getDisplayCountry(), 297))));
	//  148  344:aload_1         
	//  149  345:new             #32  <Class CountryInfo>
	//  150  348:dup             
	//  151  349:new             #34  <Class Locale>
	//  152  352:dup             
	//  153  353:ldc1            #36  <String "">
	//  154  355:ldc1            #76  <String "AW">
	//  155  357:invokespecial   #41  <Method void Locale(String, String)>
	//  156  360:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  157  363:sipush          297
	//  158  366:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  159  369:invokeinterface #54  <Method boolean List.add(Object)>
	//  160  374:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AC")).getDisplayCountry(), 247))));
	//  161  375:aload_1         
	//  162  376:new             #32  <Class CountryInfo>
	//  163  379:dup             
	//  164  380:new             #34  <Class Locale>
	//  165  383:dup             
	//  166  384:ldc1            #36  <String "">
	//  167  386:ldc1            #78  <String "AC">
	//  168  388:invokespecial   #41  <Method void Locale(String, String)>
	//  169  391:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  170  394:sipush          247
	//  171  397:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  172  400:invokeinterface #54  <Method boolean List.add(Object)>
	//  173  405:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AU")).getDisplayCountry(), 61))));
	//  174  406:aload_1         
	//  175  407:new             #32  <Class CountryInfo>
	//  176  410:dup             
	//  177  411:new             #34  <Class Locale>
	//  178  414:dup             
	//  179  415:ldc1            #36  <String "">
	//  180  417:ldc1            #80  <String "AU">
	//  181  419:invokespecial   #41  <Method void Locale(String, String)>
	//  182  422:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  183  425:bipush          61
	//  184  427:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  185  430:invokeinterface #54  <Method boolean List.add(Object)>
	//  186  435:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AT")).getDisplayCountry(), 43))));
	//  187  436:aload_1         
	//  188  437:new             #32  <Class CountryInfo>
	//  189  440:dup             
	//  190  441:new             #34  <Class Locale>
	//  191  444:dup             
	//  192  445:ldc1            #36  <String "">
	//  193  447:ldc1            #82  <String "AT">
	//  194  449:invokespecial   #41  <Method void Locale(String, String)>
	//  195  452:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  196  455:bipush          43
	//  197  457:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  198  460:invokeinterface #54  <Method boolean List.add(Object)>
	//  199  465:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AZ")).getDisplayCountry(), 994))));
	//  200  466:aload_1         
	//  201  467:new             #32  <Class CountryInfo>
	//  202  470:dup             
	//  203  471:new             #34  <Class Locale>
	//  204  474:dup             
	//  205  475:ldc1            #36  <String "">
	//  206  477:ldc1            #84  <String "AZ">
	//  207  479:invokespecial   #41  <Method void Locale(String, String)>
	//  208  482:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  209  485:sipush          994
	//  210  488:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  211  491:invokeinterface #54  <Method boolean List.add(Object)>
	//  212  496:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BS")).getDisplayCountry(), 1))));
	//  213  497:aload_1         
	//  214  498:new             #32  <Class CountryInfo>
	//  215  501:dup             
	//  216  502:new             #34  <Class Locale>
	//  217  505:dup             
	//  218  506:ldc1            #36  <String "">
	//  219  508:ldc1            #86  <String "BS">
	//  220  510:invokespecial   #41  <Method void Locale(String, String)>
	//  221  513:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  222  516:iconst_1        
	//  223  517:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  224  520:invokeinterface #54  <Method boolean List.add(Object)>
	//  225  525:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BH")).getDisplayCountry(), 973))));
	//  226  526:aload_1         
	//  227  527:new             #32  <Class CountryInfo>
	//  228  530:dup             
	//  229  531:new             #34  <Class Locale>
	//  230  534:dup             
	//  231  535:ldc1            #36  <String "">
	//  232  537:ldc1            #88  <String "BH">
	//  233  539:invokespecial   #41  <Method void Locale(String, String)>
	//  234  542:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  235  545:sipush          973
	//  236  548:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  237  551:invokeinterface #54  <Method boolean List.add(Object)>
	//  238  556:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BD")).getDisplayCountry(), 880))));
	//  239  557:aload_1         
	//  240  558:new             #32  <Class CountryInfo>
	//  241  561:dup             
	//  242  562:new             #34  <Class Locale>
	//  243  565:dup             
	//  244  566:ldc1            #36  <String "">
	//  245  568:ldc1            #90  <String "BD">
	//  246  570:invokespecial   #41  <Method void Locale(String, String)>
	//  247  573:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  248  576:sipush          880
	//  249  579:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  250  582:invokeinterface #54  <Method boolean List.add(Object)>
	//  251  587:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BB")).getDisplayCountry(), 1))));
	//  252  588:aload_1         
	//  253  589:new             #32  <Class CountryInfo>
	//  254  592:dup             
	//  255  593:new             #34  <Class Locale>
	//  256  596:dup             
	//  257  597:ldc1            #36  <String "">
	//  258  599:ldc1            #92  <String "BB">
	//  259  601:invokespecial   #41  <Method void Locale(String, String)>
	//  260  604:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  261  607:iconst_1        
	//  262  608:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  263  611:invokeinterface #54  <Method boolean List.add(Object)>
	//  264  616:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BY")).getDisplayCountry(), 375))));
	//  265  617:aload_1         
	//  266  618:new             #32  <Class CountryInfo>
	//  267  621:dup             
	//  268  622:new             #34  <Class Locale>
	//  269  625:dup             
	//  270  626:ldc1            #36  <String "">
	//  271  628:ldc1            #94  <String "BY">
	//  272  630:invokespecial   #41  <Method void Locale(String, String)>
	//  273  633:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  274  636:sipush          375
	//  275  639:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  276  642:invokeinterface #54  <Method boolean List.add(Object)>
	//  277  647:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BE")).getDisplayCountry(), 32))));
	//  278  648:aload_1         
	//  279  649:new             #32  <Class CountryInfo>
	//  280  652:dup             
	//  281  653:new             #34  <Class Locale>
	//  282  656:dup             
	//  283  657:ldc1            #36  <String "">
	//  284  659:ldc1            #96  <String "BE">
	//  285  661:invokespecial   #41  <Method void Locale(String, String)>
	//  286  664:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  287  667:bipush          32
	//  288  669:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  289  672:invokeinterface #54  <Method boolean List.add(Object)>
	//  290  677:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BZ")).getDisplayCountry(), 501))));
	//  291  678:aload_1         
	//  292  679:new             #32  <Class CountryInfo>
	//  293  682:dup             
	//  294  683:new             #34  <Class Locale>
	//  295  686:dup             
	//  296  687:ldc1            #36  <String "">
	//  297  689:ldc1            #98  <String "BZ">
	//  298  691:invokespecial   #41  <Method void Locale(String, String)>
	//  299  694:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  300  697:sipush          501
	//  301  700:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  302  703:invokeinterface #54  <Method boolean List.add(Object)>
	//  303  708:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BJ")).getDisplayCountry(), 229))));
	//  304  709:aload_1         
	//  305  710:new             #32  <Class CountryInfo>
	//  306  713:dup             
	//  307  714:new             #34  <Class Locale>
	//  308  717:dup             
	//  309  718:ldc1            #36  <String "">
	//  310  720:ldc1            #100 <String "BJ">
	//  311  722:invokespecial   #41  <Method void Locale(String, String)>
	//  312  725:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  313  728:sipush          229
	//  314  731:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  315  734:invokeinterface #54  <Method boolean List.add(Object)>
	//  316  739:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BM")).getDisplayCountry(), 1))));
	//  317  740:aload_1         
	//  318  741:new             #32  <Class CountryInfo>
	//  319  744:dup             
	//  320  745:new             #34  <Class Locale>
	//  321  748:dup             
	//  322  749:ldc1            #36  <String "">
	//  323  751:ldc1            #102 <String "BM">
	//  324  753:invokespecial   #41  <Method void Locale(String, String)>
	//  325  756:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  326  759:iconst_1        
	//  327  760:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  328  763:invokeinterface #54  <Method boolean List.add(Object)>
	//  329  768:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BT")).getDisplayCountry(), 975))));
	//  330  769:aload_1         
	//  331  770:new             #32  <Class CountryInfo>
	//  332  773:dup             
	//  333  774:new             #34  <Class Locale>
	//  334  777:dup             
	//  335  778:ldc1            #36  <String "">
	//  336  780:ldc1            #104 <String "BT">
	//  337  782:invokespecial   #41  <Method void Locale(String, String)>
	//  338  785:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  339  788:sipush          975
	//  340  791:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  341  794:invokeinterface #54  <Method boolean List.add(Object)>
	//  342  799:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BO")).getDisplayCountry(), 591))));
	//  343  800:aload_1         
	//  344  801:new             #32  <Class CountryInfo>
	//  345  804:dup             
	//  346  805:new             #34  <Class Locale>
	//  347  808:dup             
	//  348  809:ldc1            #36  <String "">
	//  349  811:ldc1            #106 <String "BO">
	//  350  813:invokespecial   #41  <Method void Locale(String, String)>
	//  351  816:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  352  819:sipush          591
	//  353  822:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  354  825:invokeinterface #54  <Method boolean List.add(Object)>
	//  355  830:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BA")).getDisplayCountry(), 387))));
	//  356  831:aload_1         
	//  357  832:new             #32  <Class CountryInfo>
	//  358  835:dup             
	//  359  836:new             #34  <Class Locale>
	//  360  839:dup             
	//  361  840:ldc1            #36  <String "">
	//  362  842:ldc1            #108 <String "BA">
	//  363  844:invokespecial   #41  <Method void Locale(String, String)>
	//  364  847:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  365  850:sipush          387
	//  366  853:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  367  856:invokeinterface #54  <Method boolean List.add(Object)>
	//  368  861:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BW")).getDisplayCountry(), 267))));
	//  369  862:aload_1         
	//  370  863:new             #32  <Class CountryInfo>
	//  371  866:dup             
	//  372  867:new             #34  <Class Locale>
	//  373  870:dup             
	//  374  871:ldc1            #36  <String "">
	//  375  873:ldc1            #110 <String "BW">
	//  376  875:invokespecial   #41  <Method void Locale(String, String)>
	//  377  878:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  378  881:sipush          267
	//  379  884:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  380  887:invokeinterface #54  <Method boolean List.add(Object)>
	//  381  892:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BR")).getDisplayCountry(), 55))));
	//  382  893:aload_1         
	//  383  894:new             #32  <Class CountryInfo>
	//  384  897:dup             
	//  385  898:new             #34  <Class Locale>
	//  386  901:dup             
	//  387  902:ldc1            #36  <String "">
	//  388  904:ldc1            #112 <String "BR">
	//  389  906:invokespecial   #41  <Method void Locale(String, String)>
	//  390  909:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  391  912:bipush          55
	//  392  914:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  393  917:invokeinterface #54  <Method boolean List.add(Object)>
	//  394  922:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IO")).getDisplayCountry(), 246))));
	//  395  923:aload_1         
	//  396  924:new             #32  <Class CountryInfo>
	//  397  927:dup             
	//  398  928:new             #34  <Class Locale>
	//  399  931:dup             
	//  400  932:ldc1            #36  <String "">
	//  401  934:ldc1            #114 <String "IO">
	//  402  936:invokespecial   #41  <Method void Locale(String, String)>
	//  403  939:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  404  942:sipush          246
	//  405  945:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  406  948:invokeinterface #54  <Method boolean List.add(Object)>
	//  407  953:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VG")).getDisplayCountry(), 1))));
	//  408  954:aload_1         
	//  409  955:new             #32  <Class CountryInfo>
	//  410  958:dup             
	//  411  959:new             #34  <Class Locale>
	//  412  962:dup             
	//  413  963:ldc1            #36  <String "">
	//  414  965:ldc1            #116 <String "VG">
	//  415  967:invokespecial   #41  <Method void Locale(String, String)>
	//  416  970:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  417  973:iconst_1        
	//  418  974:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  419  977:invokeinterface #54  <Method boolean List.add(Object)>
	//  420  982:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BN")).getDisplayCountry(), 673))));
	//  421  983:aload_1         
	//  422  984:new             #32  <Class CountryInfo>
	//  423  987:dup             
	//  424  988:new             #34  <Class Locale>
	//  425  991:dup             
	//  426  992:ldc1            #36  <String "">
	//  427  994:ldc1            #118 <String "BN">
	//  428  996:invokespecial   #41  <Method void Locale(String, String)>
	//  429  999:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  430 1002:sipush          673
	//  431 1005:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  432 1008:invokeinterface #54  <Method boolean List.add(Object)>
	//  433 1013:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BG")).getDisplayCountry(), 359))));
	//  434 1014:aload_1         
	//  435 1015:new             #32  <Class CountryInfo>
	//  436 1018:dup             
	//  437 1019:new             #34  <Class Locale>
	//  438 1022:dup             
	//  439 1023:ldc1            #36  <String "">
	//  440 1025:ldc1            #120 <String "BG">
	//  441 1027:invokespecial   #41  <Method void Locale(String, String)>
	//  442 1030:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  443 1033:sipush          359
	//  444 1036:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  445 1039:invokeinterface #54  <Method boolean List.add(Object)>
	//  446 1044:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BF")).getDisplayCountry(), 226))));
	//  447 1045:aload_1         
	//  448 1046:new             #32  <Class CountryInfo>
	//  449 1049:dup             
	//  450 1050:new             #34  <Class Locale>
	//  451 1053:dup             
	//  452 1054:ldc1            #36  <String "">
	//  453 1056:ldc1            #122 <String "BF">
	//  454 1058:invokespecial   #41  <Method void Locale(String, String)>
	//  455 1061:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  456 1064:sipush          226
	//  457 1067:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  458 1070:invokeinterface #54  <Method boolean List.add(Object)>
	//  459 1075:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BI")).getDisplayCountry(), 257))));
	//  460 1076:aload_1         
	//  461 1077:new             #32  <Class CountryInfo>
	//  462 1080:dup             
	//  463 1081:new             #34  <Class Locale>
	//  464 1084:dup             
	//  465 1085:ldc1            #36  <String "">
	//  466 1087:ldc1            #124 <String "BI">
	//  467 1089:invokespecial   #41  <Method void Locale(String, String)>
	//  468 1092:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  469 1095:sipush          257
	//  470 1098:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  471 1101:invokeinterface #54  <Method boolean List.add(Object)>
	//  472 1106:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KH")).getDisplayCountry(), 855))));
	//  473 1107:aload_1         
	//  474 1108:new             #32  <Class CountryInfo>
	//  475 1111:dup             
	//  476 1112:new             #34  <Class Locale>
	//  477 1115:dup             
	//  478 1116:ldc1            #36  <String "">
	//  479 1118:ldc1            #126 <String "KH">
	//  480 1120:invokespecial   #41  <Method void Locale(String, String)>
	//  481 1123:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  482 1126:sipush          855
	//  483 1129:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  484 1132:invokeinterface #54  <Method boolean List.add(Object)>
	//  485 1137:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CM")).getDisplayCountry(), 237))));
	//  486 1138:aload_1         
	//  487 1139:new             #32  <Class CountryInfo>
	//  488 1142:dup             
	//  489 1143:new             #34  <Class Locale>
	//  490 1146:dup             
	//  491 1147:ldc1            #36  <String "">
	//  492 1149:ldc1            #128 <String "CM">
	//  493 1151:invokespecial   #41  <Method void Locale(String, String)>
	//  494 1154:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  495 1157:sipush          237
	//  496 1160:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  497 1163:invokeinterface #54  <Method boolean List.add(Object)>
	//  498 1168:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CA")).getDisplayCountry(), 1))));
	//  499 1169:aload_1         
	//  500 1170:new             #32  <Class CountryInfo>
	//  501 1173:dup             
	//  502 1174:new             #34  <Class Locale>
	//  503 1177:dup             
	//  504 1178:ldc1            #36  <String "">
	//  505 1180:ldc1            #130 <String "CA">
	//  506 1182:invokespecial   #41  <Method void Locale(String, String)>
	//  507 1185:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  508 1188:iconst_1        
	//  509 1189:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  510 1192:invokeinterface #54  <Method boolean List.add(Object)>
	//  511 1197:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CV")).getDisplayCountry(), 238))));
	//  512 1198:aload_1         
	//  513 1199:new             #32  <Class CountryInfo>
	//  514 1202:dup             
	//  515 1203:new             #34  <Class Locale>
	//  516 1206:dup             
	//  517 1207:ldc1            #36  <String "">
	//  518 1209:ldc1            #132 <String "CV">
	//  519 1211:invokespecial   #41  <Method void Locale(String, String)>
	//  520 1214:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  521 1217:sipush          238
	//  522 1220:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  523 1223:invokeinterface #54  <Method boolean List.add(Object)>
	//  524 1228:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BQ")).getDisplayCountry(), 599))));
	//  525 1229:aload_1         
	//  526 1230:new             #32  <Class CountryInfo>
	//  527 1233:dup             
	//  528 1234:new             #34  <Class Locale>
	//  529 1237:dup             
	//  530 1238:ldc1            #36  <String "">
	//  531 1240:ldc1            #134 <String "BQ">
	//  532 1242:invokespecial   #41  <Method void Locale(String, String)>
	//  533 1245:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  534 1248:sipush          599
	//  535 1251:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  536 1254:invokeinterface #54  <Method boolean List.add(Object)>
	//  537 1259:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KY")).getDisplayCountry(), 1))));
	//  538 1260:aload_1         
	//  539 1261:new             #32  <Class CountryInfo>
	//  540 1264:dup             
	//  541 1265:new             #34  <Class Locale>
	//  542 1268:dup             
	//  543 1269:ldc1            #36  <String "">
	//  544 1271:ldc1            #136 <String "KY">
	//  545 1273:invokespecial   #41  <Method void Locale(String, String)>
	//  546 1276:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  547 1279:iconst_1        
	//  548 1280:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  549 1283:invokeinterface #54  <Method boolean List.add(Object)>
	//  550 1288:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CF")).getDisplayCountry(), 236))));
	//  551 1289:aload_1         
	//  552 1290:new             #32  <Class CountryInfo>
	//  553 1293:dup             
	//  554 1294:new             #34  <Class Locale>
	//  555 1297:dup             
	//  556 1298:ldc1            #36  <String "">
	//  557 1300:ldc1            #138 <String "CF">
	//  558 1302:invokespecial   #41  <Method void Locale(String, String)>
	//  559 1305:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  560 1308:sipush          236
	//  561 1311:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  562 1314:invokeinterface #54  <Method boolean List.add(Object)>
	//  563 1319:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TD")).getDisplayCountry(), 235))));
	//  564 1320:aload_1         
	//  565 1321:new             #32  <Class CountryInfo>
	//  566 1324:dup             
	//  567 1325:new             #34  <Class Locale>
	//  568 1328:dup             
	//  569 1329:ldc1            #36  <String "">
	//  570 1331:ldc1            #140 <String "TD">
	//  571 1333:invokespecial   #41  <Method void Locale(String, String)>
	//  572 1336:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  573 1339:sipush          235
	//  574 1342:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  575 1345:invokeinterface #54  <Method boolean List.add(Object)>
	//  576 1350:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CL")).getDisplayCountry(), 56))));
	//  577 1351:aload_1         
	//  578 1352:new             #32  <Class CountryInfo>
	//  579 1355:dup             
	//  580 1356:new             #34  <Class Locale>
	//  581 1359:dup             
	//  582 1360:ldc1            #36  <String "">
	//  583 1362:ldc1            #142 <String "CL">
	//  584 1364:invokespecial   #41  <Method void Locale(String, String)>
	//  585 1367:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  586 1370:bipush          56
	//  587 1372:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  588 1375:invokeinterface #54  <Method boolean List.add(Object)>
	//  589 1380:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CN")).getDisplayCountry(), 86))));
	//  590 1381:aload_1         
	//  591 1382:new             #32  <Class CountryInfo>
	//  592 1385:dup             
	//  593 1386:new             #34  <Class Locale>
	//  594 1389:dup             
	//  595 1390:ldc1            #36  <String "">
	//  596 1392:ldc1            #144 <String "CN">
	//  597 1394:invokespecial   #41  <Method void Locale(String, String)>
	//  598 1397:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  599 1400:bipush          86
	//  600 1402:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  601 1405:invokeinterface #54  <Method boolean List.add(Object)>
	//  602 1410:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CX")).getDisplayCountry(), 61))));
	//  603 1411:aload_1         
	//  604 1412:new             #32  <Class CountryInfo>
	//  605 1415:dup             
	//  606 1416:new             #34  <Class Locale>
	//  607 1419:dup             
	//  608 1420:ldc1            #36  <String "">
	//  609 1422:ldc1            #146 <String "CX">
	//  610 1424:invokespecial   #41  <Method void Locale(String, String)>
	//  611 1427:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  612 1430:bipush          61
	//  613 1432:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  614 1435:invokeinterface #54  <Method boolean List.add(Object)>
	//  615 1440:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CC")).getDisplayCountry(), 61))));
	//  616 1441:aload_1         
	//  617 1442:new             #32  <Class CountryInfo>
	//  618 1445:dup             
	//  619 1446:new             #34  <Class Locale>
	//  620 1449:dup             
	//  621 1450:ldc1            #36  <String "">
	//  622 1452:ldc1            #148 <String "CC">
	//  623 1454:invokespecial   #41  <Method void Locale(String, String)>
	//  624 1457:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  625 1460:bipush          61
	//  626 1462:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  627 1465:invokeinterface #54  <Method boolean List.add(Object)>
	//  628 1470:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CO")).getDisplayCountry(), 57))));
	//  629 1471:aload_1         
	//  630 1472:new             #32  <Class CountryInfo>
	//  631 1475:dup             
	//  632 1476:new             #34  <Class Locale>
	//  633 1479:dup             
	//  634 1480:ldc1            #36  <String "">
	//  635 1482:ldc1            #150 <String "CO">
	//  636 1484:invokespecial   #41  <Method void Locale(String, String)>
	//  637 1487:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  638 1490:bipush          57
	//  639 1492:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  640 1495:invokeinterface #54  <Method boolean List.add(Object)>
	//  641 1500:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KM")).getDisplayCountry(), 269))));
	//  642 1501:aload_1         
	//  643 1502:new             #32  <Class CountryInfo>
	//  644 1505:dup             
	//  645 1506:new             #34  <Class Locale>
	//  646 1509:dup             
	//  647 1510:ldc1            #36  <String "">
	//  648 1512:ldc1            #152 <String "KM">
	//  649 1514:invokespecial   #41  <Method void Locale(String, String)>
	//  650 1517:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  651 1520:sipush          269
	//  652 1523:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  653 1526:invokeinterface #54  <Method boolean List.add(Object)>
	//  654 1531:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CD")).getDisplayCountry(), 243))));
	//  655 1532:aload_1         
	//  656 1533:new             #32  <Class CountryInfo>
	//  657 1536:dup             
	//  658 1537:new             #34  <Class Locale>
	//  659 1540:dup             
	//  660 1541:ldc1            #36  <String "">
	//  661 1543:ldc1            #154 <String "CD">
	//  662 1545:invokespecial   #41  <Method void Locale(String, String)>
	//  663 1548:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  664 1551:sipush          243
	//  665 1554:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  666 1557:invokeinterface #54  <Method boolean List.add(Object)>
	//  667 1562:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CG")).getDisplayCountry(), 242))));
	//  668 1563:aload_1         
	//  669 1564:new             #32  <Class CountryInfo>
	//  670 1567:dup             
	//  671 1568:new             #34  <Class Locale>
	//  672 1571:dup             
	//  673 1572:ldc1            #36  <String "">
	//  674 1574:ldc1            #156 <String "CG">
	//  675 1576:invokespecial   #41  <Method void Locale(String, String)>
	//  676 1579:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  677 1582:sipush          242
	//  678 1585:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  679 1588:invokeinterface #54  <Method boolean List.add(Object)>
	//  680 1593:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CK")).getDisplayCountry(), 682))));
	//  681 1594:aload_1         
	//  682 1595:new             #32  <Class CountryInfo>
	//  683 1598:dup             
	//  684 1599:new             #34  <Class Locale>
	//  685 1602:dup             
	//  686 1603:ldc1            #36  <String "">
	//  687 1605:ldc1            #158 <String "CK">
	//  688 1607:invokespecial   #41  <Method void Locale(String, String)>
	//  689 1610:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  690 1613:sipush          682
	//  691 1616:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  692 1619:invokeinterface #54  <Method boolean List.add(Object)>
	//  693 1624:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CR")).getDisplayCountry(), 506))));
	//  694 1625:aload_1         
	//  695 1626:new             #32  <Class CountryInfo>
	//  696 1629:dup             
	//  697 1630:new             #34  <Class Locale>
	//  698 1633:dup             
	//  699 1634:ldc1            #36  <String "">
	//  700 1636:ldc1            #160 <String "CR">
	//  701 1638:invokespecial   #41  <Method void Locale(String, String)>
	//  702 1641:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  703 1644:sipush          506
	//  704 1647:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  705 1650:invokeinterface #54  <Method boolean List.add(Object)>
	//  706 1655:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CI")).getDisplayCountry(), 225))));
	//  707 1656:aload_1         
	//  708 1657:new             #32  <Class CountryInfo>
	//  709 1660:dup             
	//  710 1661:new             #34  <Class Locale>
	//  711 1664:dup             
	//  712 1665:ldc1            #36  <String "">
	//  713 1667:ldc1            #162 <String "CI">
	//  714 1669:invokespecial   #41  <Method void Locale(String, String)>
	//  715 1672:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  716 1675:sipush          225
	//  717 1678:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  718 1681:invokeinterface #54  <Method boolean List.add(Object)>
	//  719 1686:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HR")).getDisplayCountry(), 385))));
	//  720 1687:aload_1         
	//  721 1688:new             #32  <Class CountryInfo>
	//  722 1691:dup             
	//  723 1692:new             #34  <Class Locale>
	//  724 1695:dup             
	//  725 1696:ldc1            #36  <String "">
	//  726 1698:ldc1            #164 <String "HR">
	//  727 1700:invokespecial   #41  <Method void Locale(String, String)>
	//  728 1703:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  729 1706:sipush          385
	//  730 1709:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  731 1712:invokeinterface #54  <Method boolean List.add(Object)>
	//  732 1717:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CU")).getDisplayCountry(), 53))));
	//  733 1718:aload_1         
	//  734 1719:new             #32  <Class CountryInfo>
	//  735 1722:dup             
	//  736 1723:new             #34  <Class Locale>
	//  737 1726:dup             
	//  738 1727:ldc1            #36  <String "">
	//  739 1729:ldc1            #166 <String "CU">
	//  740 1731:invokespecial   #41  <Method void Locale(String, String)>
	//  741 1734:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  742 1737:bipush          53
	//  743 1739:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  744 1742:invokeinterface #54  <Method boolean List.add(Object)>
	//  745 1747:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CW")).getDisplayCountry(), 599))));
	//  746 1748:aload_1         
	//  747 1749:new             #32  <Class CountryInfo>
	//  748 1752:dup             
	//  749 1753:new             #34  <Class Locale>
	//  750 1756:dup             
	//  751 1757:ldc1            #36  <String "">
	//  752 1759:ldc1            #168 <String "CW">
	//  753 1761:invokespecial   #41  <Method void Locale(String, String)>
	//  754 1764:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  755 1767:sipush          599
	//  756 1770:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  757 1773:invokeinterface #54  <Method boolean List.add(Object)>
	//  758 1778:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CY")).getDisplayCountry(), 357))));
	//  759 1779:aload_1         
	//  760 1780:new             #32  <Class CountryInfo>
	//  761 1783:dup             
	//  762 1784:new             #34  <Class Locale>
	//  763 1787:dup             
	//  764 1788:ldc1            #36  <String "">
	//  765 1790:ldc1            #170 <String "CY">
	//  766 1792:invokespecial   #41  <Method void Locale(String, String)>
	//  767 1795:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  768 1798:sipush          357
	//  769 1801:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  770 1804:invokeinterface #54  <Method boolean List.add(Object)>
	//  771 1809:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CZ")).getDisplayCountry(), 420))));
	//  772 1810:aload_1         
	//  773 1811:new             #32  <Class CountryInfo>
	//  774 1814:dup             
	//  775 1815:new             #34  <Class Locale>
	//  776 1818:dup             
	//  777 1819:ldc1            #36  <String "">
	//  778 1821:ldc1            #172 <String "CZ">
	//  779 1823:invokespecial   #41  <Method void Locale(String, String)>
	//  780 1826:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  781 1829:sipush          420
	//  782 1832:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  783 1835:invokeinterface #54  <Method boolean List.add(Object)>
	//  784 1840:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DK")).getDisplayCountry(), 45))));
	//  785 1841:aload_1         
	//  786 1842:new             #32  <Class CountryInfo>
	//  787 1845:dup             
	//  788 1846:new             #34  <Class Locale>
	//  789 1849:dup             
	//  790 1850:ldc1            #36  <String "">
	//  791 1852:ldc1            #174 <String "DK">
	//  792 1854:invokespecial   #41  <Method void Locale(String, String)>
	//  793 1857:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  794 1860:bipush          45
	//  795 1862:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  796 1865:invokeinterface #54  <Method boolean List.add(Object)>
	//  797 1870:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DJ")).getDisplayCountry(), 253))));
	//  798 1871:aload_1         
	//  799 1872:new             #32  <Class CountryInfo>
	//  800 1875:dup             
	//  801 1876:new             #34  <Class Locale>
	//  802 1879:dup             
	//  803 1880:ldc1            #36  <String "">
	//  804 1882:ldc1            #176 <String "DJ">
	//  805 1884:invokespecial   #41  <Method void Locale(String, String)>
	//  806 1887:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  807 1890:sipush          253
	//  808 1893:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  809 1896:invokeinterface #54  <Method boolean List.add(Object)>
	//  810 1901:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DM")).getDisplayCountry(), 1))));
	//  811 1902:aload_1         
	//  812 1903:new             #32  <Class CountryInfo>
	//  813 1906:dup             
	//  814 1907:new             #34  <Class Locale>
	//  815 1910:dup             
	//  816 1911:ldc1            #36  <String "">
	//  817 1913:ldc1            #178 <String "DM">
	//  818 1915:invokespecial   #41  <Method void Locale(String, String)>
	//  819 1918:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  820 1921:iconst_1        
	//  821 1922:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  822 1925:invokeinterface #54  <Method boolean List.add(Object)>
	//  823 1930:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DO")).getDisplayCountry(), 1))));
	//  824 1931:aload_1         
	//  825 1932:new             #32  <Class CountryInfo>
	//  826 1935:dup             
	//  827 1936:new             #34  <Class Locale>
	//  828 1939:dup             
	//  829 1940:ldc1            #36  <String "">
	//  830 1942:ldc1            #180 <String "DO">
	//  831 1944:invokespecial   #41  <Method void Locale(String, String)>
	//  832 1947:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  833 1950:iconst_1        
	//  834 1951:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  835 1954:invokeinterface #54  <Method boolean List.add(Object)>
	//  836 1959:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TL")).getDisplayCountry(), 670))));
	//  837 1960:aload_1         
	//  838 1961:new             #32  <Class CountryInfo>
	//  839 1964:dup             
	//  840 1965:new             #34  <Class Locale>
	//  841 1968:dup             
	//  842 1969:ldc1            #36  <String "">
	//  843 1971:ldc1            #182 <String "TL">
	//  844 1973:invokespecial   #41  <Method void Locale(String, String)>
	//  845 1976:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  846 1979:sipush          670
	//  847 1982:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  848 1985:invokeinterface #54  <Method boolean List.add(Object)>
	//  849 1990:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "EC")).getDisplayCountry(), 593))));
	//  850 1991:aload_1         
	//  851 1992:new             #32  <Class CountryInfo>
	//  852 1995:dup             
	//  853 1996:new             #34  <Class Locale>
	//  854 1999:dup             
	//  855 2000:ldc1            #36  <String "">
	//  856 2002:ldc1            #184 <String "EC">
	//  857 2004:invokespecial   #41  <Method void Locale(String, String)>
	//  858 2007:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  859 2010:sipush          593
	//  860 2013:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  861 2016:invokeinterface #54  <Method boolean List.add(Object)>
	//  862 2021:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "EG")).getDisplayCountry(), 20))));
	//  863 2022:aload_1         
	//  864 2023:new             #32  <Class CountryInfo>
	//  865 2026:dup             
	//  866 2027:new             #34  <Class Locale>
	//  867 2030:dup             
	//  868 2031:ldc1            #36  <String "">
	//  869 2033:ldc1            #186 <String "EG">
	//  870 2035:invokespecial   #41  <Method void Locale(String, String)>
	//  871 2038:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  872 2041:bipush          20
	//  873 2043:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  874 2046:invokeinterface #54  <Method boolean List.add(Object)>
	//  875 2051:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SV")).getDisplayCountry(), 503))));
	//  876 2052:aload_1         
	//  877 2053:new             #32  <Class CountryInfo>
	//  878 2056:dup             
	//  879 2057:new             #34  <Class Locale>
	//  880 2060:dup             
	//  881 2061:ldc1            #36  <String "">
	//  882 2063:ldc1            #188 <String "SV">
	//  883 2065:invokespecial   #41  <Method void Locale(String, String)>
	//  884 2068:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  885 2071:sipush          503
	//  886 2074:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  887 2077:invokeinterface #54  <Method boolean List.add(Object)>
	//  888 2082:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GQ")).getDisplayCountry(), 240))));
	//  889 2083:aload_1         
	//  890 2084:new             #32  <Class CountryInfo>
	//  891 2087:dup             
	//  892 2088:new             #34  <Class Locale>
	//  893 2091:dup             
	//  894 2092:ldc1            #36  <String "">
	//  895 2094:ldc1            #190 <String "GQ">
	//  896 2096:invokespecial   #41  <Method void Locale(String, String)>
	//  897 2099:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  898 2102:sipush          240
	//  899 2105:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  900 2108:invokeinterface #54  <Method boolean List.add(Object)>
	//  901 2113:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ER")).getDisplayCountry(), 291))));
	//  902 2114:aload_1         
	//  903 2115:new             #32  <Class CountryInfo>
	//  904 2118:dup             
	//  905 2119:new             #34  <Class Locale>
	//  906 2122:dup             
	//  907 2123:ldc1            #36  <String "">
	//  908 2125:ldc1            #192 <String "ER">
	//  909 2127:invokespecial   #41  <Method void Locale(String, String)>
	//  910 2130:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  911 2133:sipush          291
	//  912 2136:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  913 2139:invokeinterface #54  <Method boolean List.add(Object)>
	//  914 2144:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "EE")).getDisplayCountry(), 372))));
	//  915 2145:aload_1         
	//  916 2146:new             #32  <Class CountryInfo>
	//  917 2149:dup             
	//  918 2150:new             #34  <Class Locale>
	//  919 2153:dup             
	//  920 2154:ldc1            #36  <String "">
	//  921 2156:ldc1            #194 <String "EE">
	//  922 2158:invokespecial   #41  <Method void Locale(String, String)>
	//  923 2161:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  924 2164:sipush          372
	//  925 2167:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  926 2170:invokeinterface #54  <Method boolean List.add(Object)>
	//  927 2175:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ET")).getDisplayCountry(), 251))));
	//  928 2176:aload_1         
	//  929 2177:new             #32  <Class CountryInfo>
	//  930 2180:dup             
	//  931 2181:new             #34  <Class Locale>
	//  932 2184:dup             
	//  933 2185:ldc1            #36  <String "">
	//  934 2187:ldc1            #196 <String "ET">
	//  935 2189:invokespecial   #41  <Method void Locale(String, String)>
	//  936 2192:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  937 2195:sipush          251
	//  938 2198:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  939 2201:invokeinterface #54  <Method boolean List.add(Object)>
	//  940 2206:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FK")).getDisplayCountry(), 500))));
	//  941 2207:aload_1         
	//  942 2208:new             #32  <Class CountryInfo>
	//  943 2211:dup             
	//  944 2212:new             #34  <Class Locale>
	//  945 2215:dup             
	//  946 2216:ldc1            #36  <String "">
	//  947 2218:ldc1            #198 <String "FK">
	//  948 2220:invokespecial   #41  <Method void Locale(String, String)>
	//  949 2223:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  950 2226:sipush          500
	//  951 2229:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  952 2232:invokeinterface #54  <Method boolean List.add(Object)>
	//  953 2237:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FO")).getDisplayCountry(), 298))));
	//  954 2238:aload_1         
	//  955 2239:new             #32  <Class CountryInfo>
	//  956 2242:dup             
	//  957 2243:new             #34  <Class Locale>
	//  958 2246:dup             
	//  959 2247:ldc1            #36  <String "">
	//  960 2249:ldc1            #200 <String "FO">
	//  961 2251:invokespecial   #41  <Method void Locale(String, String)>
	//  962 2254:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  963 2257:sipush          298
	//  964 2260:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  965 2263:invokeinterface #54  <Method boolean List.add(Object)>
	//  966 2268:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FJ")).getDisplayCountry(), 679))));
	//  967 2269:aload_1         
	//  968 2270:new             #32  <Class CountryInfo>
	//  969 2273:dup             
	//  970 2274:new             #34  <Class Locale>
	//  971 2277:dup             
	//  972 2278:ldc1            #36  <String "">
	//  973 2280:ldc1            #202 <String "FJ">
	//  974 2282:invokespecial   #41  <Method void Locale(String, String)>
	//  975 2285:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  976 2288:sipush          679
	//  977 2291:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  978 2294:invokeinterface #54  <Method boolean List.add(Object)>
	//  979 2299:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FI")).getDisplayCountry(), 358))));
	//  980 2300:aload_1         
	//  981 2301:new             #32  <Class CountryInfo>
	//  982 2304:dup             
	//  983 2305:new             #34  <Class Locale>
	//  984 2308:dup             
	//  985 2309:ldc1            #36  <String "">
	//  986 2311:ldc1            #204 <String "FI">
	//  987 2313:invokespecial   #41  <Method void Locale(String, String)>
	//  988 2316:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	//  989 2319:sipush          358
	//  990 2322:invokespecial   #48  <Method void CountryInfo(String, int)>
	//  991 2325:invokeinterface #54  <Method boolean List.add(Object)>
	//  992 2330:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FR")).getDisplayCountry(), 33))));
	//  993 2331:aload_1         
	//  994 2332:new             #32  <Class CountryInfo>
	//  995 2335:dup             
	//  996 2336:new             #34  <Class Locale>
	//  997 2339:dup             
	//  998 2340:ldc1            #36  <String "">
	//  999 2342:ldc1            #206 <String "FR">
	// 1000 2344:invokespecial   #41  <Method void Locale(String, String)>
	// 1001 2347:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1002 2350:bipush          33
	// 1003 2352:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1004 2355:invokeinterface #54  <Method boolean List.add(Object)>
	// 1005 2360:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GF")).getDisplayCountry(), 594))));
	// 1006 2361:aload_1         
	// 1007 2362:new             #32  <Class CountryInfo>
	// 1008 2365:dup             
	// 1009 2366:new             #34  <Class Locale>
	// 1010 2369:dup             
	// 1011 2370:ldc1            #36  <String "">
	// 1012 2372:ldc1            #208 <String "GF">
	// 1013 2374:invokespecial   #41  <Method void Locale(String, String)>
	// 1014 2377:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1015 2380:sipush          594
	// 1016 2383:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1017 2386:invokeinterface #54  <Method boolean List.add(Object)>
	// 1018 2391:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PF")).getDisplayCountry(), 689))));
	// 1019 2392:aload_1         
	// 1020 2393:new             #32  <Class CountryInfo>
	// 1021 2396:dup             
	// 1022 2397:new             #34  <Class Locale>
	// 1023 2400:dup             
	// 1024 2401:ldc1            #36  <String "">
	// 1025 2403:ldc1            #210 <String "PF">
	// 1026 2405:invokespecial   #41  <Method void Locale(String, String)>
	// 1027 2408:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1028 2411:sipush          689
	// 1029 2414:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1030 2417:invokeinterface #54  <Method boolean List.add(Object)>
	// 1031 2422:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GA")).getDisplayCountry(), 241))));
	// 1032 2423:aload_1         
	// 1033 2424:new             #32  <Class CountryInfo>
	// 1034 2427:dup             
	// 1035 2428:new             #34  <Class Locale>
	// 1036 2431:dup             
	// 1037 2432:ldc1            #36  <String "">
	// 1038 2434:ldc1            #212 <String "GA">
	// 1039 2436:invokespecial   #41  <Method void Locale(String, String)>
	// 1040 2439:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1041 2442:sipush          241
	// 1042 2445:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1043 2448:invokeinterface #54  <Method boolean List.add(Object)>
	// 1044 2453:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GM")).getDisplayCountry(), 220))));
	// 1045 2454:aload_1         
	// 1046 2455:new             #32  <Class CountryInfo>
	// 1047 2458:dup             
	// 1048 2459:new             #34  <Class Locale>
	// 1049 2462:dup             
	// 1050 2463:ldc1            #36  <String "">
	// 1051 2465:ldc1            #214 <String "GM">
	// 1052 2467:invokespecial   #41  <Method void Locale(String, String)>
	// 1053 2470:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1054 2473:sipush          220
	// 1055 2476:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1056 2479:invokeinterface #54  <Method boolean List.add(Object)>
	// 1057 2484:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GE")).getDisplayCountry(), 995))));
	// 1058 2485:aload_1         
	// 1059 2486:new             #32  <Class CountryInfo>
	// 1060 2489:dup             
	// 1061 2490:new             #34  <Class Locale>
	// 1062 2493:dup             
	// 1063 2494:ldc1            #36  <String "">
	// 1064 2496:ldc1            #216 <String "GE">
	// 1065 2498:invokespecial   #41  <Method void Locale(String, String)>
	// 1066 2501:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1067 2504:sipush          995
	// 1068 2507:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1069 2510:invokeinterface #54  <Method boolean List.add(Object)>
	// 1070 2515:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "DE")).getDisplayCountry(), 49))));
	// 1071 2516:aload_1         
	// 1072 2517:new             #32  <Class CountryInfo>
	// 1073 2520:dup             
	// 1074 2521:new             #34  <Class Locale>
	// 1075 2524:dup             
	// 1076 2525:ldc1            #36  <String "">
	// 1077 2527:ldc1            #218 <String "DE">
	// 1078 2529:invokespecial   #41  <Method void Locale(String, String)>
	// 1079 2532:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1080 2535:bipush          49
	// 1081 2537:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1082 2540:invokeinterface #54  <Method boolean List.add(Object)>
	// 1083 2545:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GH")).getDisplayCountry(), 233))));
	// 1084 2546:aload_1         
	// 1085 2547:new             #32  <Class CountryInfo>
	// 1086 2550:dup             
	// 1087 2551:new             #34  <Class Locale>
	// 1088 2554:dup             
	// 1089 2555:ldc1            #36  <String "">
	// 1090 2557:ldc1            #220 <String "GH">
	// 1091 2559:invokespecial   #41  <Method void Locale(String, String)>
	// 1092 2562:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1093 2565:sipush          233
	// 1094 2568:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1095 2571:invokeinterface #54  <Method boolean List.add(Object)>
	// 1096 2576:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GI")).getDisplayCountry(), 350))));
	// 1097 2577:aload_1         
	// 1098 2578:new             #32  <Class CountryInfo>
	// 1099 2581:dup             
	// 1100 2582:new             #34  <Class Locale>
	// 1101 2585:dup             
	// 1102 2586:ldc1            #36  <String "">
	// 1103 2588:ldc1            #222 <String "GI">
	// 1104 2590:invokespecial   #41  <Method void Locale(String, String)>
	// 1105 2593:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1106 2596:sipush          350
	// 1107 2599:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1108 2602:invokeinterface #54  <Method boolean List.add(Object)>
	// 1109 2607:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GR")).getDisplayCountry(), 30))));
	// 1110 2608:aload_1         
	// 1111 2609:new             #32  <Class CountryInfo>
	// 1112 2612:dup             
	// 1113 2613:new             #34  <Class Locale>
	// 1114 2616:dup             
	// 1115 2617:ldc1            #36  <String "">
	// 1116 2619:ldc1            #224 <String "GR">
	// 1117 2621:invokespecial   #41  <Method void Locale(String, String)>
	// 1118 2624:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1119 2627:bipush          30
	// 1120 2629:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1121 2632:invokeinterface #54  <Method boolean List.add(Object)>
	// 1122 2637:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GL")).getDisplayCountry(), 299))));
	// 1123 2638:aload_1         
	// 1124 2639:new             #32  <Class CountryInfo>
	// 1125 2642:dup             
	// 1126 2643:new             #34  <Class Locale>
	// 1127 2646:dup             
	// 1128 2647:ldc1            #36  <String "">
	// 1129 2649:ldc1            #226 <String "GL">
	// 1130 2651:invokespecial   #41  <Method void Locale(String, String)>
	// 1131 2654:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1132 2657:sipush          299
	// 1133 2660:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1134 2663:invokeinterface #54  <Method boolean List.add(Object)>
	// 1135 2668:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GD")).getDisplayCountry(), 1))));
	// 1136 2669:aload_1         
	// 1137 2670:new             #32  <Class CountryInfo>
	// 1138 2673:dup             
	// 1139 2674:new             #34  <Class Locale>
	// 1140 2677:dup             
	// 1141 2678:ldc1            #36  <String "">
	// 1142 2680:ldc1            #228 <String "GD">
	// 1143 2682:invokespecial   #41  <Method void Locale(String, String)>
	// 1144 2685:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1145 2688:iconst_1        
	// 1146 2689:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1147 2692:invokeinterface #54  <Method boolean List.add(Object)>
	// 1148 2697:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GP")).getDisplayCountry(), 590))));
	// 1149 2698:aload_1         
	// 1150 2699:new             #32  <Class CountryInfo>
	// 1151 2702:dup             
	// 1152 2703:new             #34  <Class Locale>
	// 1153 2706:dup             
	// 1154 2707:ldc1            #36  <String "">
	// 1155 2709:ldc1            #230 <String "GP">
	// 1156 2711:invokespecial   #41  <Method void Locale(String, String)>
	// 1157 2714:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1158 2717:sipush          590
	// 1159 2720:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1160 2723:invokeinterface #54  <Method boolean List.add(Object)>
	// 1161 2728:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GU")).getDisplayCountry(), 1))));
	// 1162 2729:aload_1         
	// 1163 2730:new             #32  <Class CountryInfo>
	// 1164 2733:dup             
	// 1165 2734:new             #34  <Class Locale>
	// 1166 2737:dup             
	// 1167 2738:ldc1            #36  <String "">
	// 1168 2740:ldc1            #232 <String "GU">
	// 1169 2742:invokespecial   #41  <Method void Locale(String, String)>
	// 1170 2745:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1171 2748:iconst_1        
	// 1172 2749:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1173 2752:invokeinterface #54  <Method boolean List.add(Object)>
	// 1174 2757:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GT")).getDisplayCountry(), 502))));
	// 1175 2758:aload_1         
	// 1176 2759:new             #32  <Class CountryInfo>
	// 1177 2762:dup             
	// 1178 2763:new             #34  <Class Locale>
	// 1179 2766:dup             
	// 1180 2767:ldc1            #36  <String "">
	// 1181 2769:ldc1            #234 <String "GT">
	// 1182 2771:invokespecial   #41  <Method void Locale(String, String)>
	// 1183 2774:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1184 2777:sipush          502
	// 1185 2780:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1186 2783:invokeinterface #54  <Method boolean List.add(Object)>
	// 1187 2788:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GG")).getDisplayCountry(), 44))));
	// 1188 2789:aload_1         
	// 1189 2790:new             #32  <Class CountryInfo>
	// 1190 2793:dup             
	// 1191 2794:new             #34  <Class Locale>
	// 1192 2797:dup             
	// 1193 2798:ldc1            #36  <String "">
	// 1194 2800:ldc1            #236 <String "GG">
	// 1195 2802:invokespecial   #41  <Method void Locale(String, String)>
	// 1196 2805:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1197 2808:bipush          44
	// 1198 2810:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1199 2813:invokeinterface #54  <Method boolean List.add(Object)>
	// 1200 2818:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GN")).getDisplayCountry(), 224))));
	// 1201 2819:aload_1         
	// 1202 2820:new             #32  <Class CountryInfo>
	// 1203 2823:dup             
	// 1204 2824:new             #34  <Class Locale>
	// 1205 2827:dup             
	// 1206 2828:ldc1            #36  <String "">
	// 1207 2830:ldc1            #238 <String "GN">
	// 1208 2832:invokespecial   #41  <Method void Locale(String, String)>
	// 1209 2835:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1210 2838:sipush          224
	// 1211 2841:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1212 2844:invokeinterface #54  <Method boolean List.add(Object)>
	// 1213 2849:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GW")).getDisplayCountry(), 245))));
	// 1214 2850:aload_1         
	// 1215 2851:new             #32  <Class CountryInfo>
	// 1216 2854:dup             
	// 1217 2855:new             #34  <Class Locale>
	// 1218 2858:dup             
	// 1219 2859:ldc1            #36  <String "">
	// 1220 2861:ldc1            #240 <String "GW">
	// 1221 2863:invokespecial   #41  <Method void Locale(String, String)>
	// 1222 2866:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1223 2869:sipush          245
	// 1224 2872:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1225 2875:invokeinterface #54  <Method boolean List.add(Object)>
	// 1226 2880:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GY")).getDisplayCountry(), 592))));
	// 1227 2881:aload_1         
	// 1228 2882:new             #32  <Class CountryInfo>
	// 1229 2885:dup             
	// 1230 2886:new             #34  <Class Locale>
	// 1231 2889:dup             
	// 1232 2890:ldc1            #36  <String "">
	// 1233 2892:ldc1            #242 <String "GY">
	// 1234 2894:invokespecial   #41  <Method void Locale(String, String)>
	// 1235 2897:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1236 2900:sipush          592
	// 1237 2903:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1238 2906:invokeinterface #54  <Method boolean List.add(Object)>
	// 1239 2911:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HT")).getDisplayCountry(), 509))));
	// 1240 2912:aload_1         
	// 1241 2913:new             #32  <Class CountryInfo>
	// 1242 2916:dup             
	// 1243 2917:new             #34  <Class Locale>
	// 1244 2920:dup             
	// 1245 2921:ldc1            #36  <String "">
	// 1246 2923:ldc1            #244 <String "HT">
	// 1247 2925:invokespecial   #41  <Method void Locale(String, String)>
	// 1248 2928:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1249 2931:sipush          509
	// 1250 2934:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1251 2937:invokeinterface #54  <Method boolean List.add(Object)>
	// 1252 2942:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HM")).getDisplayCountry(), 672))));
	// 1253 2943:aload_1         
	// 1254 2944:new             #32  <Class CountryInfo>
	// 1255 2947:dup             
	// 1256 2948:new             #34  <Class Locale>
	// 1257 2951:dup             
	// 1258 2952:ldc1            #36  <String "">
	// 1259 2954:ldc1            #246 <String "HM">
	// 1260 2956:invokespecial   #41  <Method void Locale(String, String)>
	// 1261 2959:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1262 2962:sipush          672
	// 1263 2965:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1264 2968:invokeinterface #54  <Method boolean List.add(Object)>
	// 1265 2973:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HN")).getDisplayCountry(), 504))));
	// 1266 2974:aload_1         
	// 1267 2975:new             #32  <Class CountryInfo>
	// 1268 2978:dup             
	// 1269 2979:new             #34  <Class Locale>
	// 1270 2982:dup             
	// 1271 2983:ldc1            #36  <String "">
	// 1272 2985:ldc1            #248 <String "HN">
	// 1273 2987:invokespecial   #41  <Method void Locale(String, String)>
	// 1274 2990:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1275 2993:sipush          504
	// 1276 2996:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1277 2999:invokeinterface #54  <Method boolean List.add(Object)>
	// 1278 3004:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HK")).getDisplayCountry(), 852))));
	// 1279 3005:aload_1         
	// 1280 3006:new             #32  <Class CountryInfo>
	// 1281 3009:dup             
	// 1282 3010:new             #34  <Class Locale>
	// 1283 3013:dup             
	// 1284 3014:ldc1            #36  <String "">
	// 1285 3016:ldc1            #250 <String "HK">
	// 1286 3018:invokespecial   #41  <Method void Locale(String, String)>
	// 1287 3021:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1288 3024:sipush          852
	// 1289 3027:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1290 3030:invokeinterface #54  <Method boolean List.add(Object)>
	// 1291 3035:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "HU")).getDisplayCountry(), 36))));
	// 1292 3036:aload_1         
	// 1293 3037:new             #32  <Class CountryInfo>
	// 1294 3040:dup             
	// 1295 3041:new             #34  <Class Locale>
	// 1296 3044:dup             
	// 1297 3045:ldc1            #36  <String "">
	// 1298 3047:ldc1            #252 <String "HU">
	// 1299 3049:invokespecial   #41  <Method void Locale(String, String)>
	// 1300 3052:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1301 3055:bipush          36
	// 1302 3057:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1303 3060:invokeinterface #54  <Method boolean List.add(Object)>
	// 1304 3065:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IS")).getDisplayCountry(), 354))));
	// 1305 3066:aload_1         
	// 1306 3067:new             #32  <Class CountryInfo>
	// 1307 3070:dup             
	// 1308 3071:new             #34  <Class Locale>
	// 1309 3074:dup             
	// 1310 3075:ldc1            #36  <String "">
	// 1311 3077:ldc1            #254 <String "IS">
	// 1312 3079:invokespecial   #41  <Method void Locale(String, String)>
	// 1313 3082:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1314 3085:sipush          354
	// 1315 3088:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1316 3091:invokeinterface #54  <Method boolean List.add(Object)>
	// 1317 3096:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IN")).getDisplayCountry(), 91))));
	// 1318 3097:aload_1         
	// 1319 3098:new             #32  <Class CountryInfo>
	// 1320 3101:dup             
	// 1321 3102:new             #34  <Class Locale>
	// 1322 3105:dup             
	// 1323 3106:ldc1            #36  <String "">
	// 1324 3108:ldc2            #256 <String "IN">
	// 1325 3111:invokespecial   #41  <Method void Locale(String, String)>
	// 1326 3114:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1327 3117:bipush          91
	// 1328 3119:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1329 3122:invokeinterface #54  <Method boolean List.add(Object)>
	// 1330 3127:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ID")).getDisplayCountry(), 62))));
	// 1331 3128:aload_1         
	// 1332 3129:new             #32  <Class CountryInfo>
	// 1333 3132:dup             
	// 1334 3133:new             #34  <Class Locale>
	// 1335 3136:dup             
	// 1336 3137:ldc1            #36  <String "">
	// 1337 3139:ldc2            #258 <String "ID">
	// 1338 3142:invokespecial   #41  <Method void Locale(String, String)>
	// 1339 3145:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1340 3148:bipush          62
	// 1341 3150:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1342 3153:invokeinterface #54  <Method boolean List.add(Object)>
	// 1343 3158:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IR")).getDisplayCountry(), 98))));
	// 1344 3159:aload_1         
	// 1345 3160:new             #32  <Class CountryInfo>
	// 1346 3163:dup             
	// 1347 3164:new             #34  <Class Locale>
	// 1348 3167:dup             
	// 1349 3168:ldc1            #36  <String "">
	// 1350 3170:ldc2            #260 <String "IR">
	// 1351 3173:invokespecial   #41  <Method void Locale(String, String)>
	// 1352 3176:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1353 3179:bipush          98
	// 1354 3181:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1355 3184:invokeinterface #54  <Method boolean List.add(Object)>
	// 1356 3189:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IQ")).getDisplayCountry(), 964))));
	// 1357 3190:aload_1         
	// 1358 3191:new             #32  <Class CountryInfo>
	// 1359 3194:dup             
	// 1360 3195:new             #34  <Class Locale>
	// 1361 3198:dup             
	// 1362 3199:ldc1            #36  <String "">
	// 1363 3201:ldc2            #262 <String "IQ">
	// 1364 3204:invokespecial   #41  <Method void Locale(String, String)>
	// 1365 3207:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1366 3210:sipush          964
	// 1367 3213:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1368 3216:invokeinterface #54  <Method boolean List.add(Object)>
	// 1369 3221:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IE")).getDisplayCountry(), 353))));
	// 1370 3222:aload_1         
	// 1371 3223:new             #32  <Class CountryInfo>
	// 1372 3226:dup             
	// 1373 3227:new             #34  <Class Locale>
	// 1374 3230:dup             
	// 1375 3231:ldc1            #36  <String "">
	// 1376 3233:ldc2            #264 <String "IE">
	// 1377 3236:invokespecial   #41  <Method void Locale(String, String)>
	// 1378 3239:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1379 3242:sipush          353
	// 1380 3245:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1381 3248:invokeinterface #54  <Method boolean List.add(Object)>
	// 1382 3253:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IM")).getDisplayCountry(), 44))));
	// 1383 3254:aload_1         
	// 1384 3255:new             #32  <Class CountryInfo>
	// 1385 3258:dup             
	// 1386 3259:new             #34  <Class Locale>
	// 1387 3262:dup             
	// 1388 3263:ldc1            #36  <String "">
	// 1389 3265:ldc2            #266 <String "IM">
	// 1390 3268:invokespecial   #41  <Method void Locale(String, String)>
	// 1391 3271:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1392 3274:bipush          44
	// 1393 3276:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1394 3279:invokeinterface #54  <Method boolean List.add(Object)>
	// 1395 3284:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IL")).getDisplayCountry(), 972))));
	// 1396 3285:aload_1         
	// 1397 3286:new             #32  <Class CountryInfo>
	// 1398 3289:dup             
	// 1399 3290:new             #34  <Class Locale>
	// 1400 3293:dup             
	// 1401 3294:ldc1            #36  <String "">
	// 1402 3296:ldc2            #268 <String "IL">
	// 1403 3299:invokespecial   #41  <Method void Locale(String, String)>
	// 1404 3302:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1405 3305:sipush          972
	// 1406 3308:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1407 3311:invokeinterface #54  <Method boolean List.add(Object)>
	// 1408 3316:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "IT")).getDisplayCountry(), 39))));
	// 1409 3317:aload_1         
	// 1410 3318:new             #32  <Class CountryInfo>
	// 1411 3321:dup             
	// 1412 3322:new             #34  <Class Locale>
	// 1413 3325:dup             
	// 1414 3326:ldc1            #36  <String "">
	// 1415 3328:ldc2            #270 <String "IT">
	// 1416 3331:invokespecial   #41  <Method void Locale(String, String)>
	// 1417 3334:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1418 3337:bipush          39
	// 1419 3339:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1420 3342:invokeinterface #54  <Method boolean List.add(Object)>
	// 1421 3347:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "JM")).getDisplayCountry(), 1))));
	// 1422 3348:aload_1         
	// 1423 3349:new             #32  <Class CountryInfo>
	// 1424 3352:dup             
	// 1425 3353:new             #34  <Class Locale>
	// 1426 3356:dup             
	// 1427 3357:ldc1            #36  <String "">
	// 1428 3359:ldc2            #272 <String "JM">
	// 1429 3362:invokespecial   #41  <Method void Locale(String, String)>
	// 1430 3365:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1431 3368:iconst_1        
	// 1432 3369:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1433 3372:invokeinterface #54  <Method boolean List.add(Object)>
	// 1434 3377:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "JP")).getDisplayCountry(), 81))));
	// 1435 3378:aload_1         
	// 1436 3379:new             #32  <Class CountryInfo>
	// 1437 3382:dup             
	// 1438 3383:new             #34  <Class Locale>
	// 1439 3386:dup             
	// 1440 3387:ldc1            #36  <String "">
	// 1441 3389:ldc2            #274 <String "JP">
	// 1442 3392:invokespecial   #41  <Method void Locale(String, String)>
	// 1443 3395:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1444 3398:bipush          81
	// 1445 3400:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1446 3403:invokeinterface #54  <Method boolean List.add(Object)>
	// 1447 3408:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "JE")).getDisplayCountry(), 44))));
	// 1448 3409:aload_1         
	// 1449 3410:new             #32  <Class CountryInfo>
	// 1450 3413:dup             
	// 1451 3414:new             #34  <Class Locale>
	// 1452 3417:dup             
	// 1453 3418:ldc1            #36  <String "">
	// 1454 3420:ldc2            #276 <String "JE">
	// 1455 3423:invokespecial   #41  <Method void Locale(String, String)>
	// 1456 3426:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1457 3429:bipush          44
	// 1458 3431:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1459 3434:invokeinterface #54  <Method boolean List.add(Object)>
	// 1460 3439:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "JO")).getDisplayCountry(), 962))));
	// 1461 3440:aload_1         
	// 1462 3441:new             #32  <Class CountryInfo>
	// 1463 3444:dup             
	// 1464 3445:new             #34  <Class Locale>
	// 1465 3448:dup             
	// 1466 3449:ldc1            #36  <String "">
	// 1467 3451:ldc2            #278 <String "JO">
	// 1468 3454:invokespecial   #41  <Method void Locale(String, String)>
	// 1469 3457:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1470 3460:sipush          962
	// 1471 3463:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1472 3466:invokeinterface #54  <Method boolean List.add(Object)>
	// 1473 3471:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KZ")).getDisplayCountry(), 7))));
	// 1474 3472:aload_1         
	// 1475 3473:new             #32  <Class CountryInfo>
	// 1476 3476:dup             
	// 1477 3477:new             #34  <Class Locale>
	// 1478 3480:dup             
	// 1479 3481:ldc1            #36  <String "">
	// 1480 3483:ldc2            #280 <String "KZ">
	// 1481 3486:invokespecial   #41  <Method void Locale(String, String)>
	// 1482 3489:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1483 3492:bipush          7
	// 1484 3494:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1485 3497:invokeinterface #54  <Method boolean List.add(Object)>
	// 1486 3502:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KE")).getDisplayCountry(), 254))));
	// 1487 3503:aload_1         
	// 1488 3504:new             #32  <Class CountryInfo>
	// 1489 3507:dup             
	// 1490 3508:new             #34  <Class Locale>
	// 1491 3511:dup             
	// 1492 3512:ldc1            #36  <String "">
	// 1493 3514:ldc2            #282 <String "KE">
	// 1494 3517:invokespecial   #41  <Method void Locale(String, String)>
	// 1495 3520:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1496 3523:sipush          254
	// 1497 3526:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1498 3529:invokeinterface #54  <Method boolean List.add(Object)>
	// 1499 3534:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KI")).getDisplayCountry(), 686))));
	// 1500 3535:aload_1         
	// 1501 3536:new             #32  <Class CountryInfo>
	// 1502 3539:dup             
	// 1503 3540:new             #34  <Class Locale>
	// 1504 3543:dup             
	// 1505 3544:ldc1            #36  <String "">
	// 1506 3546:ldc2            #284 <String "KI">
	// 1507 3549:invokespecial   #41  <Method void Locale(String, String)>
	// 1508 3552:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1509 3555:sipush          686
	// 1510 3558:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1511 3561:invokeinterface #54  <Method boolean List.add(Object)>
	// 1512 3566:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "XK")).getDisplayCountry(), 381))));
	// 1513 3567:aload_1         
	// 1514 3568:new             #32  <Class CountryInfo>
	// 1515 3571:dup             
	// 1516 3572:new             #34  <Class Locale>
	// 1517 3575:dup             
	// 1518 3576:ldc1            #36  <String "">
	// 1519 3578:ldc2            #286 <String "XK">
	// 1520 3581:invokespecial   #41  <Method void Locale(String, String)>
	// 1521 3584:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1522 3587:sipush          381
	// 1523 3590:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1524 3593:invokeinterface #54  <Method boolean List.add(Object)>
	// 1525 3598:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KW")).getDisplayCountry(), 965))));
	// 1526 3599:aload_1         
	// 1527 3600:new             #32  <Class CountryInfo>
	// 1528 3603:dup             
	// 1529 3604:new             #34  <Class Locale>
	// 1530 3607:dup             
	// 1531 3608:ldc1            #36  <String "">
	// 1532 3610:ldc2            #288 <String "KW">
	// 1533 3613:invokespecial   #41  <Method void Locale(String, String)>
	// 1534 3616:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1535 3619:sipush          965
	// 1536 3622:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1537 3625:invokeinterface #54  <Method boolean List.add(Object)>
	// 1538 3630:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KG")).getDisplayCountry(), 996))));
	// 1539 3631:aload_1         
	// 1540 3632:new             #32  <Class CountryInfo>
	// 1541 3635:dup             
	// 1542 3636:new             #34  <Class Locale>
	// 1543 3639:dup             
	// 1544 3640:ldc1            #36  <String "">
	// 1545 3642:ldc2            #290 <String "KG">
	// 1546 3645:invokespecial   #41  <Method void Locale(String, String)>
	// 1547 3648:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1548 3651:sipush          996
	// 1549 3654:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1550 3657:invokeinterface #54  <Method boolean List.add(Object)>
	// 1551 3662:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LA")).getDisplayCountry(), 856))));
	// 1552 3663:aload_1         
	// 1553 3664:new             #32  <Class CountryInfo>
	// 1554 3667:dup             
	// 1555 3668:new             #34  <Class Locale>
	// 1556 3671:dup             
	// 1557 3672:ldc1            #36  <String "">
	// 1558 3674:ldc2            #292 <String "LA">
	// 1559 3677:invokespecial   #41  <Method void Locale(String, String)>
	// 1560 3680:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1561 3683:sipush          856
	// 1562 3686:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1563 3689:invokeinterface #54  <Method boolean List.add(Object)>
	// 1564 3694:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LV")).getDisplayCountry(), 371))));
	// 1565 3695:aload_1         
	// 1566 3696:new             #32  <Class CountryInfo>
	// 1567 3699:dup             
	// 1568 3700:new             #34  <Class Locale>
	// 1569 3703:dup             
	// 1570 3704:ldc1            #36  <String "">
	// 1571 3706:ldc2            #294 <String "LV">
	// 1572 3709:invokespecial   #41  <Method void Locale(String, String)>
	// 1573 3712:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1574 3715:sipush          371
	// 1575 3718:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1576 3721:invokeinterface #54  <Method boolean List.add(Object)>
	// 1577 3726:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LB")).getDisplayCountry(), 961))));
	// 1578 3727:aload_1         
	// 1579 3728:new             #32  <Class CountryInfo>
	// 1580 3731:dup             
	// 1581 3732:new             #34  <Class Locale>
	// 1582 3735:dup             
	// 1583 3736:ldc1            #36  <String "">
	// 1584 3738:ldc2            #296 <String "LB">
	// 1585 3741:invokespecial   #41  <Method void Locale(String, String)>
	// 1586 3744:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1587 3747:sipush          961
	// 1588 3750:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1589 3753:invokeinterface #54  <Method boolean List.add(Object)>
	// 1590 3758:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LS")).getDisplayCountry(), 266))));
	// 1591 3759:aload_1         
	// 1592 3760:new             #32  <Class CountryInfo>
	// 1593 3763:dup             
	// 1594 3764:new             #34  <Class Locale>
	// 1595 3767:dup             
	// 1596 3768:ldc1            #36  <String "">
	// 1597 3770:ldc2            #298 <String "LS">
	// 1598 3773:invokespecial   #41  <Method void Locale(String, String)>
	// 1599 3776:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1600 3779:sipush          266
	// 1601 3782:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1602 3785:invokeinterface #54  <Method boolean List.add(Object)>
	// 1603 3790:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LR")).getDisplayCountry(), 231))));
	// 1604 3791:aload_1         
	// 1605 3792:new             #32  <Class CountryInfo>
	// 1606 3795:dup             
	// 1607 3796:new             #34  <Class Locale>
	// 1608 3799:dup             
	// 1609 3800:ldc1            #36  <String "">
	// 1610 3802:ldc2            #300 <String "LR">
	// 1611 3805:invokespecial   #41  <Method void Locale(String, String)>
	// 1612 3808:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1613 3811:sipush          231
	// 1614 3814:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1615 3817:invokeinterface #54  <Method boolean List.add(Object)>
	// 1616 3822:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LY")).getDisplayCountry(), 218))));
	// 1617 3823:aload_1         
	// 1618 3824:new             #32  <Class CountryInfo>
	// 1619 3827:dup             
	// 1620 3828:new             #34  <Class Locale>
	// 1621 3831:dup             
	// 1622 3832:ldc1            #36  <String "">
	// 1623 3834:ldc2            #302 <String "LY">
	// 1624 3837:invokespecial   #41  <Method void Locale(String, String)>
	// 1625 3840:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1626 3843:sipush          218
	// 1627 3846:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1628 3849:invokeinterface #54  <Method boolean List.add(Object)>
	// 1629 3854:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LI")).getDisplayCountry(), 423))));
	// 1630 3855:aload_1         
	// 1631 3856:new             #32  <Class CountryInfo>
	// 1632 3859:dup             
	// 1633 3860:new             #34  <Class Locale>
	// 1634 3863:dup             
	// 1635 3864:ldc1            #36  <String "">
	// 1636 3866:ldc2            #304 <String "LI">
	// 1637 3869:invokespecial   #41  <Method void Locale(String, String)>
	// 1638 3872:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1639 3875:sipush          423
	// 1640 3878:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1641 3881:invokeinterface #54  <Method boolean List.add(Object)>
	// 1642 3886:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LT")).getDisplayCountry(), 370))));
	// 1643 3887:aload_1         
	// 1644 3888:new             #32  <Class CountryInfo>
	// 1645 3891:dup             
	// 1646 3892:new             #34  <Class Locale>
	// 1647 3895:dup             
	// 1648 3896:ldc1            #36  <String "">
	// 1649 3898:ldc2            #306 <String "LT">
	// 1650 3901:invokespecial   #41  <Method void Locale(String, String)>
	// 1651 3904:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1652 3907:sipush          370
	// 1653 3910:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1654 3913:invokeinterface #54  <Method boolean List.add(Object)>
	// 1655 3918:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LU")).getDisplayCountry(), 352))));
	// 1656 3919:aload_1         
	// 1657 3920:new             #32  <Class CountryInfo>
	// 1658 3923:dup             
	// 1659 3924:new             #34  <Class Locale>
	// 1660 3927:dup             
	// 1661 3928:ldc1            #36  <String "">
	// 1662 3930:ldc2            #308 <String "LU">
	// 1663 3933:invokespecial   #41  <Method void Locale(String, String)>
	// 1664 3936:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1665 3939:sipush          352
	// 1666 3942:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1667 3945:invokeinterface #54  <Method boolean List.add(Object)>
	// 1668 3950:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MO")).getDisplayCountry(), 853))));
	// 1669 3951:aload_1         
	// 1670 3952:new             #32  <Class CountryInfo>
	// 1671 3955:dup             
	// 1672 3956:new             #34  <Class Locale>
	// 1673 3959:dup             
	// 1674 3960:ldc1            #36  <String "">
	// 1675 3962:ldc2            #310 <String "MO">
	// 1676 3965:invokespecial   #41  <Method void Locale(String, String)>
	// 1677 3968:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1678 3971:sipush          853
	// 1679 3974:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1680 3977:invokeinterface #54  <Method boolean List.add(Object)>
	// 1681 3982:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MK")).getDisplayCountry(), 389))));
	// 1682 3983:aload_1         
	// 1683 3984:new             #32  <Class CountryInfo>
	// 1684 3987:dup             
	// 1685 3988:new             #34  <Class Locale>
	// 1686 3991:dup             
	// 1687 3992:ldc1            #36  <String "">
	// 1688 3994:ldc2            #312 <String "MK">
	// 1689 3997:invokespecial   #41  <Method void Locale(String, String)>
	// 1690 4000:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1691 4003:sipush          389
	// 1692 4006:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1693 4009:invokeinterface #54  <Method boolean List.add(Object)>
	// 1694 4014:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MG")).getDisplayCountry(), 261))));
	// 1695 4015:aload_1         
	// 1696 4016:new             #32  <Class CountryInfo>
	// 1697 4019:dup             
	// 1698 4020:new             #34  <Class Locale>
	// 1699 4023:dup             
	// 1700 4024:ldc1            #36  <String "">
	// 1701 4026:ldc2            #314 <String "MG">
	// 1702 4029:invokespecial   #41  <Method void Locale(String, String)>
	// 1703 4032:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1704 4035:sipush          261
	// 1705 4038:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1706 4041:invokeinterface #54  <Method boolean List.add(Object)>
	// 1707 4046:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MW")).getDisplayCountry(), 265))));
	// 1708 4047:aload_1         
	// 1709 4048:new             #32  <Class CountryInfo>
	// 1710 4051:dup             
	// 1711 4052:new             #34  <Class Locale>
	// 1712 4055:dup             
	// 1713 4056:ldc1            #36  <String "">
	// 1714 4058:ldc2            #316 <String "MW">
	// 1715 4061:invokespecial   #41  <Method void Locale(String, String)>
	// 1716 4064:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1717 4067:sipush          265
	// 1718 4070:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1719 4073:invokeinterface #54  <Method boolean List.add(Object)>
	// 1720 4078:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MY")).getDisplayCountry(), 60))));
	// 1721 4079:aload_1         
	// 1722 4080:new             #32  <Class CountryInfo>
	// 1723 4083:dup             
	// 1724 4084:new             #34  <Class Locale>
	// 1725 4087:dup             
	// 1726 4088:ldc1            #36  <String "">
	// 1727 4090:ldc2            #318 <String "MY">
	// 1728 4093:invokespecial   #41  <Method void Locale(String, String)>
	// 1729 4096:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1730 4099:bipush          60
	// 1731 4101:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1732 4104:invokeinterface #54  <Method boolean List.add(Object)>
	// 1733 4109:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MV")).getDisplayCountry(), 960))));
	// 1734 4110:aload_1         
	// 1735 4111:new             #32  <Class CountryInfo>
	// 1736 4114:dup             
	// 1737 4115:new             #34  <Class Locale>
	// 1738 4118:dup             
	// 1739 4119:ldc1            #36  <String "">
	// 1740 4121:ldc2            #320 <String "MV">
	// 1741 4124:invokespecial   #41  <Method void Locale(String, String)>
	// 1742 4127:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1743 4130:sipush          960
	// 1744 4133:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1745 4136:invokeinterface #54  <Method boolean List.add(Object)>
	// 1746 4141:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ML")).getDisplayCountry(), 223))));
	// 1747 4142:aload_1         
	// 1748 4143:new             #32  <Class CountryInfo>
	// 1749 4146:dup             
	// 1750 4147:new             #34  <Class Locale>
	// 1751 4150:dup             
	// 1752 4151:ldc1            #36  <String "">
	// 1753 4153:ldc2            #322 <String "ML">
	// 1754 4156:invokespecial   #41  <Method void Locale(String, String)>
	// 1755 4159:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1756 4162:sipush          223
	// 1757 4165:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1758 4168:invokeinterface #54  <Method boolean List.add(Object)>
	// 1759 4173:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MT")).getDisplayCountry(), 356))));
	// 1760 4174:aload_1         
	// 1761 4175:new             #32  <Class CountryInfo>
	// 1762 4178:dup             
	// 1763 4179:new             #34  <Class Locale>
	// 1764 4182:dup             
	// 1765 4183:ldc1            #36  <String "">
	// 1766 4185:ldc2            #324 <String "MT">
	// 1767 4188:invokespecial   #41  <Method void Locale(String, String)>
	// 1768 4191:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1769 4194:sipush          356
	// 1770 4197:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1771 4200:invokeinterface #54  <Method boolean List.add(Object)>
	// 1772 4205:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MH")).getDisplayCountry(), 692))));
	// 1773 4206:aload_1         
	// 1774 4207:new             #32  <Class CountryInfo>
	// 1775 4210:dup             
	// 1776 4211:new             #34  <Class Locale>
	// 1777 4214:dup             
	// 1778 4215:ldc1            #36  <String "">
	// 1779 4217:ldc2            #326 <String "MH">
	// 1780 4220:invokespecial   #41  <Method void Locale(String, String)>
	// 1781 4223:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1782 4226:sipush          692
	// 1783 4229:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1784 4232:invokeinterface #54  <Method boolean List.add(Object)>
	// 1785 4237:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MQ")).getDisplayCountry(), 596))));
	// 1786 4238:aload_1         
	// 1787 4239:new             #32  <Class CountryInfo>
	// 1788 4242:dup             
	// 1789 4243:new             #34  <Class Locale>
	// 1790 4246:dup             
	// 1791 4247:ldc1            #36  <String "">
	// 1792 4249:ldc2            #328 <String "MQ">
	// 1793 4252:invokespecial   #41  <Method void Locale(String, String)>
	// 1794 4255:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1795 4258:sipush          596
	// 1796 4261:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1797 4264:invokeinterface #54  <Method boolean List.add(Object)>
	// 1798 4269:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MR")).getDisplayCountry(), 222))));
	// 1799 4270:aload_1         
	// 1800 4271:new             #32  <Class CountryInfo>
	// 1801 4274:dup             
	// 1802 4275:new             #34  <Class Locale>
	// 1803 4278:dup             
	// 1804 4279:ldc1            #36  <String "">
	// 1805 4281:ldc2            #330 <String "MR">
	// 1806 4284:invokespecial   #41  <Method void Locale(String, String)>
	// 1807 4287:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1808 4290:sipush          222
	// 1809 4293:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1810 4296:invokeinterface #54  <Method boolean List.add(Object)>
	// 1811 4301:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MU")).getDisplayCountry(), 230))));
	// 1812 4302:aload_1         
	// 1813 4303:new             #32  <Class CountryInfo>
	// 1814 4306:dup             
	// 1815 4307:new             #34  <Class Locale>
	// 1816 4310:dup             
	// 1817 4311:ldc1            #36  <String "">
	// 1818 4313:ldc2            #332 <String "MU">
	// 1819 4316:invokespecial   #41  <Method void Locale(String, String)>
	// 1820 4319:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1821 4322:sipush          230
	// 1822 4325:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1823 4328:invokeinterface #54  <Method boolean List.add(Object)>
	// 1824 4333:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "YT")).getDisplayCountry(), 262))));
	// 1825 4334:aload_1         
	// 1826 4335:new             #32  <Class CountryInfo>
	// 1827 4338:dup             
	// 1828 4339:new             #34  <Class Locale>
	// 1829 4342:dup             
	// 1830 4343:ldc1            #36  <String "">
	// 1831 4345:ldc2            #334 <String "YT">
	// 1832 4348:invokespecial   #41  <Method void Locale(String, String)>
	// 1833 4351:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1834 4354:sipush          262
	// 1835 4357:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1836 4360:invokeinterface #54  <Method boolean List.add(Object)>
	// 1837 4365:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MX")).getDisplayCountry(), 52))));
	// 1838 4366:aload_1         
	// 1839 4367:new             #32  <Class CountryInfo>
	// 1840 4370:dup             
	// 1841 4371:new             #34  <Class Locale>
	// 1842 4374:dup             
	// 1843 4375:ldc1            #36  <String "">
	// 1844 4377:ldc2            #336 <String "MX">
	// 1845 4380:invokespecial   #41  <Method void Locale(String, String)>
	// 1846 4383:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1847 4386:bipush          52
	// 1848 4388:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1849 4391:invokeinterface #54  <Method boolean List.add(Object)>
	// 1850 4396:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "FM")).getDisplayCountry(), 691))));
	// 1851 4397:aload_1         
	// 1852 4398:new             #32  <Class CountryInfo>
	// 1853 4401:dup             
	// 1854 4402:new             #34  <Class Locale>
	// 1855 4405:dup             
	// 1856 4406:ldc1            #36  <String "">
	// 1857 4408:ldc2            #338 <String "FM">
	// 1858 4411:invokespecial   #41  <Method void Locale(String, String)>
	// 1859 4414:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1860 4417:sipush          691
	// 1861 4420:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1862 4423:invokeinterface #54  <Method boolean List.add(Object)>
	// 1863 4428:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MD")).getDisplayCountry(), 373))));
	// 1864 4429:aload_1         
	// 1865 4430:new             #32  <Class CountryInfo>
	// 1866 4433:dup             
	// 1867 4434:new             #34  <Class Locale>
	// 1868 4437:dup             
	// 1869 4438:ldc1            #36  <String "">
	// 1870 4440:ldc2            #340 <String "MD">
	// 1871 4443:invokespecial   #41  <Method void Locale(String, String)>
	// 1872 4446:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1873 4449:sipush          373
	// 1874 4452:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1875 4455:invokeinterface #54  <Method boolean List.add(Object)>
	// 1876 4460:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MC")).getDisplayCountry(), 377))));
	// 1877 4461:aload_1         
	// 1878 4462:new             #32  <Class CountryInfo>
	// 1879 4465:dup             
	// 1880 4466:new             #34  <Class Locale>
	// 1881 4469:dup             
	// 1882 4470:ldc1            #36  <String "">
	// 1883 4472:ldc2            #342 <String "MC">
	// 1884 4475:invokespecial   #41  <Method void Locale(String, String)>
	// 1885 4478:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1886 4481:sipush          377
	// 1887 4484:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1888 4487:invokeinterface #54  <Method boolean List.add(Object)>
	// 1889 4492:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MN")).getDisplayCountry(), 976))));
	// 1890 4493:aload_1         
	// 1891 4494:new             #32  <Class CountryInfo>
	// 1892 4497:dup             
	// 1893 4498:new             #34  <Class Locale>
	// 1894 4501:dup             
	// 1895 4502:ldc1            #36  <String "">
	// 1896 4504:ldc2            #344 <String "MN">
	// 1897 4507:invokespecial   #41  <Method void Locale(String, String)>
	// 1898 4510:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1899 4513:sipush          976
	// 1900 4516:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1901 4519:invokeinterface #54  <Method boolean List.add(Object)>
	// 1902 4524:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ME")).getDisplayCountry(), 382))));
	// 1903 4525:aload_1         
	// 1904 4526:new             #32  <Class CountryInfo>
	// 1905 4529:dup             
	// 1906 4530:new             #34  <Class Locale>
	// 1907 4533:dup             
	// 1908 4534:ldc1            #36  <String "">
	// 1909 4536:ldc2            #346 <String "ME">
	// 1910 4539:invokespecial   #41  <Method void Locale(String, String)>
	// 1911 4542:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1912 4545:sipush          382
	// 1913 4548:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1914 4551:invokeinterface #54  <Method boolean List.add(Object)>
	// 1915 4556:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MS")).getDisplayCountry(), 1))));
	// 1916 4557:aload_1         
	// 1917 4558:new             #32  <Class CountryInfo>
	// 1918 4561:dup             
	// 1919 4562:new             #34  <Class Locale>
	// 1920 4565:dup             
	// 1921 4566:ldc1            #36  <String "">
	// 1922 4568:ldc2            #348 <String "MS">
	// 1923 4571:invokespecial   #41  <Method void Locale(String, String)>
	// 1924 4574:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1925 4577:iconst_1        
	// 1926 4578:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1927 4581:invokeinterface #54  <Method boolean List.add(Object)>
	// 1928 4586:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MA")).getDisplayCountry(), 212))));
	// 1929 4587:aload_1         
	// 1930 4588:new             #32  <Class CountryInfo>
	// 1931 4591:dup             
	// 1932 4592:new             #34  <Class Locale>
	// 1933 4595:dup             
	// 1934 4596:ldc1            #36  <String "">
	// 1935 4598:ldc2            #350 <String "MA">
	// 1936 4601:invokespecial   #41  <Method void Locale(String, String)>
	// 1937 4604:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1938 4607:sipush          212
	// 1939 4610:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1940 4613:invokeinterface #54  <Method boolean List.add(Object)>
	// 1941 4618:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MZ")).getDisplayCountry(), 258))));
	// 1942 4619:aload_1         
	// 1943 4620:new             #32  <Class CountryInfo>
	// 1944 4623:dup             
	// 1945 4624:new             #34  <Class Locale>
	// 1946 4627:dup             
	// 1947 4628:ldc1            #36  <String "">
	// 1948 4630:ldc2            #352 <String "MZ">
	// 1949 4633:invokespecial   #41  <Method void Locale(String, String)>
	// 1950 4636:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1951 4639:sipush          258
	// 1952 4642:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1953 4645:invokeinterface #54  <Method boolean List.add(Object)>
	// 1954 4650:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MM")).getDisplayCountry(), 95))));
	// 1955 4651:aload_1         
	// 1956 4652:new             #32  <Class CountryInfo>
	// 1957 4655:dup             
	// 1958 4656:new             #34  <Class Locale>
	// 1959 4659:dup             
	// 1960 4660:ldc1            #36  <String "">
	// 1961 4662:ldc2            #354 <String "MM">
	// 1962 4665:invokespecial   #41  <Method void Locale(String, String)>
	// 1963 4668:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1964 4671:bipush          95
	// 1965 4673:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1966 4676:invokeinterface #54  <Method boolean List.add(Object)>
	// 1967 4681:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NA")).getDisplayCountry(), 264))));
	// 1968 4682:aload_1         
	// 1969 4683:new             #32  <Class CountryInfo>
	// 1970 4686:dup             
	// 1971 4687:new             #34  <Class Locale>
	// 1972 4690:dup             
	// 1973 4691:ldc1            #36  <String "">
	// 1974 4693:ldc2            #356 <String "NA">
	// 1975 4696:invokespecial   #41  <Method void Locale(String, String)>
	// 1976 4699:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1977 4702:sipush          264
	// 1978 4705:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1979 4708:invokeinterface #54  <Method boolean List.add(Object)>
	// 1980 4713:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NR")).getDisplayCountry(), 674))));
	// 1981 4714:aload_1         
	// 1982 4715:new             #32  <Class CountryInfo>
	// 1983 4718:dup             
	// 1984 4719:new             #34  <Class Locale>
	// 1985 4722:dup             
	// 1986 4723:ldc1            #36  <String "">
	// 1987 4725:ldc2            #358 <String "NR">
	// 1988 4728:invokespecial   #41  <Method void Locale(String, String)>
	// 1989 4731:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 1990 4734:sipush          674
	// 1991 4737:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 1992 4740:invokeinterface #54  <Method boolean List.add(Object)>
	// 1993 4745:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NP")).getDisplayCountry(), 977))));
	// 1994 4746:aload_1         
	// 1995 4747:new             #32  <Class CountryInfo>
	// 1996 4750:dup             
	// 1997 4751:new             #34  <Class Locale>
	// 1998 4754:dup             
	// 1999 4755:ldc1            #36  <String "">
	// 2000 4757:ldc2            #360 <String "NP">
	// 2001 4760:invokespecial   #41  <Method void Locale(String, String)>
	// 2002 4763:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2003 4766:sipush          977
	// 2004 4769:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2005 4772:invokeinterface #54  <Method boolean List.add(Object)>
	// 2006 4777:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NL")).getDisplayCountry(), 31))));
	// 2007 4778:aload_1         
	// 2008 4779:new             #32  <Class CountryInfo>
	// 2009 4782:dup             
	// 2010 4783:new             #34  <Class Locale>
	// 2011 4786:dup             
	// 2012 4787:ldc1            #36  <String "">
	// 2013 4789:ldc2            #362 <String "NL">
	// 2014 4792:invokespecial   #41  <Method void Locale(String, String)>
	// 2015 4795:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2016 4798:bipush          31
	// 2017 4800:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2018 4803:invokeinterface #54  <Method boolean List.add(Object)>
	// 2019 4808:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NC")).getDisplayCountry(), 687))));
	// 2020 4809:aload_1         
	// 2021 4810:new             #32  <Class CountryInfo>
	// 2022 4813:dup             
	// 2023 4814:new             #34  <Class Locale>
	// 2024 4817:dup             
	// 2025 4818:ldc1            #36  <String "">
	// 2026 4820:ldc2            #364 <String "NC">
	// 2027 4823:invokespecial   #41  <Method void Locale(String, String)>
	// 2028 4826:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2029 4829:sipush          687
	// 2030 4832:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2031 4835:invokeinterface #54  <Method boolean List.add(Object)>
	// 2032 4840:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NZ")).getDisplayCountry(), 64))));
	// 2033 4841:aload_1         
	// 2034 4842:new             #32  <Class CountryInfo>
	// 2035 4845:dup             
	// 2036 4846:new             #34  <Class Locale>
	// 2037 4849:dup             
	// 2038 4850:ldc1            #36  <String "">
	// 2039 4852:ldc2            #366 <String "NZ">
	// 2040 4855:invokespecial   #41  <Method void Locale(String, String)>
	// 2041 4858:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2042 4861:bipush          64
	// 2043 4863:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2044 4866:invokeinterface #54  <Method boolean List.add(Object)>
	// 2045 4871:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NI")).getDisplayCountry(), 505))));
	// 2046 4872:aload_1         
	// 2047 4873:new             #32  <Class CountryInfo>
	// 2048 4876:dup             
	// 2049 4877:new             #34  <Class Locale>
	// 2050 4880:dup             
	// 2051 4881:ldc1            #36  <String "">
	// 2052 4883:ldc2            #368 <String "NI">
	// 2053 4886:invokespecial   #41  <Method void Locale(String, String)>
	// 2054 4889:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2055 4892:sipush          505
	// 2056 4895:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2057 4898:invokeinterface #54  <Method boolean List.add(Object)>
	// 2058 4903:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NE")).getDisplayCountry(), 227))));
	// 2059 4904:aload_1         
	// 2060 4905:new             #32  <Class CountryInfo>
	// 2061 4908:dup             
	// 2062 4909:new             #34  <Class Locale>
	// 2063 4912:dup             
	// 2064 4913:ldc1            #36  <String "">
	// 2065 4915:ldc2            #370 <String "NE">
	// 2066 4918:invokespecial   #41  <Method void Locale(String, String)>
	// 2067 4921:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2068 4924:sipush          227
	// 2069 4927:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2070 4930:invokeinterface #54  <Method boolean List.add(Object)>
	// 2071 4935:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NG")).getDisplayCountry(), 234))));
	// 2072 4936:aload_1         
	// 2073 4937:new             #32  <Class CountryInfo>
	// 2074 4940:dup             
	// 2075 4941:new             #34  <Class Locale>
	// 2076 4944:dup             
	// 2077 4945:ldc1            #36  <String "">
	// 2078 4947:ldc2            #372 <String "NG">
	// 2079 4950:invokespecial   #41  <Method void Locale(String, String)>
	// 2080 4953:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2081 4956:sipush          234
	// 2082 4959:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2083 4962:invokeinterface #54  <Method boolean List.add(Object)>
	// 2084 4967:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NU")).getDisplayCountry(), 683))));
	// 2085 4968:aload_1         
	// 2086 4969:new             #32  <Class CountryInfo>
	// 2087 4972:dup             
	// 2088 4973:new             #34  <Class Locale>
	// 2089 4976:dup             
	// 2090 4977:ldc1            #36  <String "">
	// 2091 4979:ldc2            #374 <String "NU">
	// 2092 4982:invokespecial   #41  <Method void Locale(String, String)>
	// 2093 4985:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2094 4988:sipush          683
	// 2095 4991:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2096 4994:invokeinterface #54  <Method boolean List.add(Object)>
	// 2097 4999:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NF")).getDisplayCountry(), 672))));
	// 2098 5000:aload_1         
	// 2099 5001:new             #32  <Class CountryInfo>
	// 2100 5004:dup             
	// 2101 5005:new             #34  <Class Locale>
	// 2102 5008:dup             
	// 2103 5009:ldc1            #36  <String "">
	// 2104 5011:ldc2            #376 <String "NF">
	// 2105 5014:invokespecial   #41  <Method void Locale(String, String)>
	// 2106 5017:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2107 5020:sipush          672
	// 2108 5023:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2109 5026:invokeinterface #54  <Method boolean List.add(Object)>
	// 2110 5031:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KP")).getDisplayCountry(), 850))));
	// 2111 5032:aload_1         
	// 2112 5033:new             #32  <Class CountryInfo>
	// 2113 5036:dup             
	// 2114 5037:new             #34  <Class Locale>
	// 2115 5040:dup             
	// 2116 5041:ldc1            #36  <String "">
	// 2117 5043:ldc2            #378 <String "KP">
	// 2118 5046:invokespecial   #41  <Method void Locale(String, String)>
	// 2119 5049:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2120 5052:sipush          850
	// 2121 5055:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2122 5058:invokeinterface #54  <Method boolean List.add(Object)>
	// 2123 5063:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MP")).getDisplayCountry(), 1))));
	// 2124 5064:aload_1         
	// 2125 5065:new             #32  <Class CountryInfo>
	// 2126 5068:dup             
	// 2127 5069:new             #34  <Class Locale>
	// 2128 5072:dup             
	// 2129 5073:ldc1            #36  <String "">
	// 2130 5075:ldc2            #380 <String "MP">
	// 2131 5078:invokespecial   #41  <Method void Locale(String, String)>
	// 2132 5081:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2133 5084:iconst_1        
	// 2134 5085:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2135 5088:invokeinterface #54  <Method boolean List.add(Object)>
	// 2136 5093:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "NO")).getDisplayCountry(), 47))));
	// 2137 5094:aload_1         
	// 2138 5095:new             #32  <Class CountryInfo>
	// 2139 5098:dup             
	// 2140 5099:new             #34  <Class Locale>
	// 2141 5102:dup             
	// 2142 5103:ldc1            #36  <String "">
	// 2143 5105:ldc2            #382 <String "NO">
	// 2144 5108:invokespecial   #41  <Method void Locale(String, String)>
	// 2145 5111:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2146 5114:bipush          47
	// 2147 5116:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2148 5119:invokeinterface #54  <Method boolean List.add(Object)>
	// 2149 5124:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "OM")).getDisplayCountry(), 968))));
	// 2150 5125:aload_1         
	// 2151 5126:new             #32  <Class CountryInfo>
	// 2152 5129:dup             
	// 2153 5130:new             #34  <Class Locale>
	// 2154 5133:dup             
	// 2155 5134:ldc1            #36  <String "">
	// 2156 5136:ldc2            #384 <String "OM">
	// 2157 5139:invokespecial   #41  <Method void Locale(String, String)>
	// 2158 5142:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2159 5145:sipush          968
	// 2160 5148:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2161 5151:invokeinterface #54  <Method boolean List.add(Object)>
	// 2162 5156:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PK")).getDisplayCountry(), 92))));
	// 2163 5157:aload_1         
	// 2164 5158:new             #32  <Class CountryInfo>
	// 2165 5161:dup             
	// 2166 5162:new             #34  <Class Locale>
	// 2167 5165:dup             
	// 2168 5166:ldc1            #36  <String "">
	// 2169 5168:ldc2            #386 <String "PK">
	// 2170 5171:invokespecial   #41  <Method void Locale(String, String)>
	// 2171 5174:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2172 5177:bipush          92
	// 2173 5179:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2174 5182:invokeinterface #54  <Method boolean List.add(Object)>
	// 2175 5187:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PW")).getDisplayCountry(), 680))));
	// 2176 5188:aload_1         
	// 2177 5189:new             #32  <Class CountryInfo>
	// 2178 5192:dup             
	// 2179 5193:new             #34  <Class Locale>
	// 2180 5196:dup             
	// 2181 5197:ldc1            #36  <String "">
	// 2182 5199:ldc2            #388 <String "PW">
	// 2183 5202:invokespecial   #41  <Method void Locale(String, String)>
	// 2184 5205:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2185 5208:sipush          680
	// 2186 5211:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2187 5214:invokeinterface #54  <Method boolean List.add(Object)>
	// 2188 5219:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PS")).getDisplayCountry(), 970))));
	// 2189 5220:aload_1         
	// 2190 5221:new             #32  <Class CountryInfo>
	// 2191 5224:dup             
	// 2192 5225:new             #34  <Class Locale>
	// 2193 5228:dup             
	// 2194 5229:ldc1            #36  <String "">
	// 2195 5231:ldc2            #390 <String "PS">
	// 2196 5234:invokespecial   #41  <Method void Locale(String, String)>
	// 2197 5237:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2198 5240:sipush          970
	// 2199 5243:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2200 5246:invokeinterface #54  <Method boolean List.add(Object)>
	// 2201 5251:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PA")).getDisplayCountry(), 507))));
	// 2202 5252:aload_1         
	// 2203 5253:new             #32  <Class CountryInfo>
	// 2204 5256:dup             
	// 2205 5257:new             #34  <Class Locale>
	// 2206 5260:dup             
	// 2207 5261:ldc1            #36  <String "">
	// 2208 5263:ldc2            #392 <String "PA">
	// 2209 5266:invokespecial   #41  <Method void Locale(String, String)>
	// 2210 5269:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2211 5272:sipush          507
	// 2212 5275:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2213 5278:invokeinterface #54  <Method boolean List.add(Object)>
	// 2214 5283:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PG")).getDisplayCountry(), 675))));
	// 2215 5284:aload_1         
	// 2216 5285:new             #32  <Class CountryInfo>
	// 2217 5288:dup             
	// 2218 5289:new             #34  <Class Locale>
	// 2219 5292:dup             
	// 2220 5293:ldc1            #36  <String "">
	// 2221 5295:ldc2            #394 <String "PG">
	// 2222 5298:invokespecial   #41  <Method void Locale(String, String)>
	// 2223 5301:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2224 5304:sipush          675
	// 2225 5307:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2226 5310:invokeinterface #54  <Method boolean List.add(Object)>
	// 2227 5315:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PY")).getDisplayCountry(), 595))));
	// 2228 5316:aload_1         
	// 2229 5317:new             #32  <Class CountryInfo>
	// 2230 5320:dup             
	// 2231 5321:new             #34  <Class Locale>
	// 2232 5324:dup             
	// 2233 5325:ldc1            #36  <String "">
	// 2234 5327:ldc2            #396 <String "PY">
	// 2235 5330:invokespecial   #41  <Method void Locale(String, String)>
	// 2236 5333:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2237 5336:sipush          595
	// 2238 5339:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2239 5342:invokeinterface #54  <Method boolean List.add(Object)>
	// 2240 5347:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PE")).getDisplayCountry(), 51))));
	// 2241 5348:aload_1         
	// 2242 5349:new             #32  <Class CountryInfo>
	// 2243 5352:dup             
	// 2244 5353:new             #34  <Class Locale>
	// 2245 5356:dup             
	// 2246 5357:ldc1            #36  <String "">
	// 2247 5359:ldc2            #398 <String "PE">
	// 2248 5362:invokespecial   #41  <Method void Locale(String, String)>
	// 2249 5365:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2250 5368:bipush          51
	// 2251 5370:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2252 5373:invokeinterface #54  <Method boolean List.add(Object)>
	// 2253 5378:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PH")).getDisplayCountry(), 63))));
	// 2254 5379:aload_1         
	// 2255 5380:new             #32  <Class CountryInfo>
	// 2256 5383:dup             
	// 2257 5384:new             #34  <Class Locale>
	// 2258 5387:dup             
	// 2259 5388:ldc1            #36  <String "">
	// 2260 5390:ldc2            #400 <String "PH">
	// 2261 5393:invokespecial   #41  <Method void Locale(String, String)>
	// 2262 5396:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2263 5399:bipush          63
	// 2264 5401:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2265 5404:invokeinterface #54  <Method boolean List.add(Object)>
	// 2266 5409:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PL")).getDisplayCountry(), 48))));
	// 2267 5410:aload_1         
	// 2268 5411:new             #32  <Class CountryInfo>
	// 2269 5414:dup             
	// 2270 5415:new             #34  <Class Locale>
	// 2271 5418:dup             
	// 2272 5419:ldc1            #36  <String "">
	// 2273 5421:ldc2            #402 <String "PL">
	// 2274 5424:invokespecial   #41  <Method void Locale(String, String)>
	// 2275 5427:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2276 5430:bipush          48
	// 2277 5432:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2278 5435:invokeinterface #54  <Method boolean List.add(Object)>
	// 2279 5440:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PT")).getDisplayCountry(), 351))));
	// 2280 5441:aload_1         
	// 2281 5442:new             #32  <Class CountryInfo>
	// 2282 5445:dup             
	// 2283 5446:new             #34  <Class Locale>
	// 2284 5449:dup             
	// 2285 5450:ldc1            #36  <String "">
	// 2286 5452:ldc2            #404 <String "PT">
	// 2287 5455:invokespecial   #41  <Method void Locale(String, String)>
	// 2288 5458:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2289 5461:sipush          351
	// 2290 5464:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2291 5467:invokeinterface #54  <Method boolean List.add(Object)>
	// 2292 5472:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PR")).getDisplayCountry(), 1))));
	// 2293 5473:aload_1         
	// 2294 5474:new             #32  <Class CountryInfo>
	// 2295 5477:dup             
	// 2296 5478:new             #34  <Class Locale>
	// 2297 5481:dup             
	// 2298 5482:ldc1            #36  <String "">
	// 2299 5484:ldc2            #406 <String "PR">
	// 2300 5487:invokespecial   #41  <Method void Locale(String, String)>
	// 2301 5490:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2302 5493:iconst_1        
	// 2303 5494:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2304 5497:invokeinterface #54  <Method boolean List.add(Object)>
	// 2305 5502:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "QA")).getDisplayCountry(), 974))));
	// 2306 5503:aload_1         
	// 2307 5504:new             #32  <Class CountryInfo>
	// 2308 5507:dup             
	// 2309 5508:new             #34  <Class Locale>
	// 2310 5511:dup             
	// 2311 5512:ldc1            #36  <String "">
	// 2312 5514:ldc2            #408 <String "QA">
	// 2313 5517:invokespecial   #41  <Method void Locale(String, String)>
	// 2314 5520:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2315 5523:sipush          974
	// 2316 5526:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2317 5529:invokeinterface #54  <Method boolean List.add(Object)>
	// 2318 5534:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "RE")).getDisplayCountry(), 262))));
	// 2319 5535:aload_1         
	// 2320 5536:new             #32  <Class CountryInfo>
	// 2321 5539:dup             
	// 2322 5540:new             #34  <Class Locale>
	// 2323 5543:dup             
	// 2324 5544:ldc1            #36  <String "">
	// 2325 5546:ldc2            #410 <String "RE">
	// 2326 5549:invokespecial   #41  <Method void Locale(String, String)>
	// 2327 5552:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2328 5555:sipush          262
	// 2329 5558:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2330 5561:invokeinterface #54  <Method boolean List.add(Object)>
	// 2331 5566:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "RO")).getDisplayCountry(), 40))));
	// 2332 5567:aload_1         
	// 2333 5568:new             #32  <Class CountryInfo>
	// 2334 5571:dup             
	// 2335 5572:new             #34  <Class Locale>
	// 2336 5575:dup             
	// 2337 5576:ldc1            #36  <String "">
	// 2338 5578:ldc2            #412 <String "RO">
	// 2339 5581:invokespecial   #41  <Method void Locale(String, String)>
	// 2340 5584:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2341 5587:bipush          40
	// 2342 5589:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2343 5592:invokeinterface #54  <Method boolean List.add(Object)>
	// 2344 5597:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "RU")).getDisplayCountry(), 7))));
	// 2345 5598:aload_1         
	// 2346 5599:new             #32  <Class CountryInfo>
	// 2347 5602:dup             
	// 2348 5603:new             #34  <Class Locale>
	// 2349 5606:dup             
	// 2350 5607:ldc1            #36  <String "">
	// 2351 5609:ldc2            #414 <String "RU">
	// 2352 5612:invokespecial   #41  <Method void Locale(String, String)>
	// 2353 5615:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2354 5618:bipush          7
	// 2355 5620:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2356 5623:invokeinterface #54  <Method boolean List.add(Object)>
	// 2357 5628:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "RW")).getDisplayCountry(), 250))));
	// 2358 5629:aload_1         
	// 2359 5630:new             #32  <Class CountryInfo>
	// 2360 5633:dup             
	// 2361 5634:new             #34  <Class Locale>
	// 2362 5637:dup             
	// 2363 5638:ldc1            #36  <String "">
	// 2364 5640:ldc2            #416 <String "RW">
	// 2365 5643:invokespecial   #41  <Method void Locale(String, String)>
	// 2366 5646:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2367 5649:sipush          250
	// 2368 5652:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2369 5655:invokeinterface #54  <Method boolean List.add(Object)>
	// 2370 5660:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "BL")).getDisplayCountry(), 590))));
	// 2371 5661:aload_1         
	// 2372 5662:new             #32  <Class CountryInfo>
	// 2373 5665:dup             
	// 2374 5666:new             #34  <Class Locale>
	// 2375 5669:dup             
	// 2376 5670:ldc1            #36  <String "">
	// 2377 5672:ldc2            #418 <String "BL">
	// 2378 5675:invokespecial   #41  <Method void Locale(String, String)>
	// 2379 5678:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2380 5681:sipush          590
	// 2381 5684:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2382 5687:invokeinterface #54  <Method boolean List.add(Object)>
	// 2383 5692:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SH")).getDisplayCountry(), 290))));
	// 2384 5693:aload_1         
	// 2385 5694:new             #32  <Class CountryInfo>
	// 2386 5697:dup             
	// 2387 5698:new             #34  <Class Locale>
	// 2388 5701:dup             
	// 2389 5702:ldc1            #36  <String "">
	// 2390 5704:ldc2            #420 <String "SH">
	// 2391 5707:invokespecial   #41  <Method void Locale(String, String)>
	// 2392 5710:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2393 5713:sipush          290
	// 2394 5716:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2395 5719:invokeinterface #54  <Method boolean List.add(Object)>
	// 2396 5724:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KN")).getDisplayCountry(), 1))));
	// 2397 5725:aload_1         
	// 2398 5726:new             #32  <Class CountryInfo>
	// 2399 5729:dup             
	// 2400 5730:new             #34  <Class Locale>
	// 2401 5733:dup             
	// 2402 5734:ldc1            #36  <String "">
	// 2403 5736:ldc2            #422 <String "KN">
	// 2404 5739:invokespecial   #41  <Method void Locale(String, String)>
	// 2405 5742:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2406 5745:iconst_1        
	// 2407 5746:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2408 5749:invokeinterface #54  <Method boolean List.add(Object)>
	// 2409 5754:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LC")).getDisplayCountry(), 1))));
	// 2410 5755:aload_1         
	// 2411 5756:new             #32  <Class CountryInfo>
	// 2412 5759:dup             
	// 2413 5760:new             #34  <Class Locale>
	// 2414 5763:dup             
	// 2415 5764:ldc1            #36  <String "">
	// 2416 5766:ldc2            #424 <String "LC">
	// 2417 5769:invokespecial   #41  <Method void Locale(String, String)>
	// 2418 5772:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2419 5775:iconst_1        
	// 2420 5776:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2421 5779:invokeinterface #54  <Method boolean List.add(Object)>
	// 2422 5784:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "MF")).getDisplayCountry(), 590))));
	// 2423 5785:aload_1         
	// 2424 5786:new             #32  <Class CountryInfo>
	// 2425 5789:dup             
	// 2426 5790:new             #34  <Class Locale>
	// 2427 5793:dup             
	// 2428 5794:ldc1            #36  <String "">
	// 2429 5796:ldc2            #426 <String "MF">
	// 2430 5799:invokespecial   #41  <Method void Locale(String, String)>
	// 2431 5802:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2432 5805:sipush          590
	// 2433 5808:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2434 5811:invokeinterface #54  <Method boolean List.add(Object)>
	// 2435 5816:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "PM")).getDisplayCountry(), 508))));
	// 2436 5817:aload_1         
	// 2437 5818:new             #32  <Class CountryInfo>
	// 2438 5821:dup             
	// 2439 5822:new             #34  <Class Locale>
	// 2440 5825:dup             
	// 2441 5826:ldc1            #36  <String "">
	// 2442 5828:ldc2            #428 <String "PM">
	// 2443 5831:invokespecial   #41  <Method void Locale(String, String)>
	// 2444 5834:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2445 5837:sipush          508
	// 2446 5840:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2447 5843:invokeinterface #54  <Method boolean List.add(Object)>
	// 2448 5848:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VC")).getDisplayCountry(), 1))));
	// 2449 5849:aload_1         
	// 2450 5850:new             #32  <Class CountryInfo>
	// 2451 5853:dup             
	// 2452 5854:new             #34  <Class Locale>
	// 2453 5857:dup             
	// 2454 5858:ldc1            #36  <String "">
	// 2455 5860:ldc2            #430 <String "VC">
	// 2456 5863:invokespecial   #41  <Method void Locale(String, String)>
	// 2457 5866:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2458 5869:iconst_1        
	// 2459 5870:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2460 5873:invokeinterface #54  <Method boolean List.add(Object)>
	// 2461 5878:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "WS")).getDisplayCountry(), 685))));
	// 2462 5879:aload_1         
	// 2463 5880:new             #32  <Class CountryInfo>
	// 2464 5883:dup             
	// 2465 5884:new             #34  <Class Locale>
	// 2466 5887:dup             
	// 2467 5888:ldc1            #36  <String "">
	// 2468 5890:ldc2            #432 <String "WS">
	// 2469 5893:invokespecial   #41  <Method void Locale(String, String)>
	// 2470 5896:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2471 5899:sipush          685
	// 2472 5902:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2473 5905:invokeinterface #54  <Method boolean List.add(Object)>
	// 2474 5910:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SM")).getDisplayCountry(), 378))));
	// 2475 5911:aload_1         
	// 2476 5912:new             #32  <Class CountryInfo>
	// 2477 5915:dup             
	// 2478 5916:new             #34  <Class Locale>
	// 2479 5919:dup             
	// 2480 5920:ldc1            #36  <String "">
	// 2481 5922:ldc2            #434 <String "SM">
	// 2482 5925:invokespecial   #41  <Method void Locale(String, String)>
	// 2483 5928:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2484 5931:sipush          378
	// 2485 5934:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2486 5937:invokeinterface #54  <Method boolean List.add(Object)>
	// 2487 5942:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ST")).getDisplayCountry(), 239))));
	// 2488 5943:aload_1         
	// 2489 5944:new             #32  <Class CountryInfo>
	// 2490 5947:dup             
	// 2491 5948:new             #34  <Class Locale>
	// 2492 5951:dup             
	// 2493 5952:ldc1            #36  <String "">
	// 2494 5954:ldc2            #436 <String "ST">
	// 2495 5957:invokespecial   #41  <Method void Locale(String, String)>
	// 2496 5960:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2497 5963:sipush          239
	// 2498 5966:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2499 5969:invokeinterface #54  <Method boolean List.add(Object)>
	// 2500 5974:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SA")).getDisplayCountry(), 966))));
	// 2501 5975:aload_1         
	// 2502 5976:new             #32  <Class CountryInfo>
	// 2503 5979:dup             
	// 2504 5980:new             #34  <Class Locale>
	// 2505 5983:dup             
	// 2506 5984:ldc1            #36  <String "">
	// 2507 5986:ldc2            #438 <String "SA">
	// 2508 5989:invokespecial   #41  <Method void Locale(String, String)>
	// 2509 5992:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2510 5995:sipush          966
	// 2511 5998:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2512 6001:invokeinterface #54  <Method boolean List.add(Object)>
	// 2513 6006:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SN")).getDisplayCountry(), 221))));
	// 2514 6007:aload_1         
	// 2515 6008:new             #32  <Class CountryInfo>
	// 2516 6011:dup             
	// 2517 6012:new             #34  <Class Locale>
	// 2518 6015:dup             
	// 2519 6016:ldc1            #36  <String "">
	// 2520 6018:ldc2            #440 <String "SN">
	// 2521 6021:invokespecial   #41  <Method void Locale(String, String)>
	// 2522 6024:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2523 6027:sipush          221
	// 2524 6030:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2525 6033:invokeinterface #54  <Method boolean List.add(Object)>
	// 2526 6038:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "RS")).getDisplayCountry(), 381))));
	// 2527 6039:aload_1         
	// 2528 6040:new             #32  <Class CountryInfo>
	// 2529 6043:dup             
	// 2530 6044:new             #34  <Class Locale>
	// 2531 6047:dup             
	// 2532 6048:ldc1            #36  <String "">
	// 2533 6050:ldc2            #442 <String "RS">
	// 2534 6053:invokespecial   #41  <Method void Locale(String, String)>
	// 2535 6056:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2536 6059:sipush          381
	// 2537 6062:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2538 6065:invokeinterface #54  <Method boolean List.add(Object)>
	// 2539 6070:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SC")).getDisplayCountry(), 248))));
	// 2540 6071:aload_1         
	// 2541 6072:new             #32  <Class CountryInfo>
	// 2542 6075:dup             
	// 2543 6076:new             #34  <Class Locale>
	// 2544 6079:dup             
	// 2545 6080:ldc1            #36  <String "">
	// 2546 6082:ldc2            #444 <String "SC">
	// 2547 6085:invokespecial   #41  <Method void Locale(String, String)>
	// 2548 6088:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2549 6091:sipush          248
	// 2550 6094:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2551 6097:invokeinterface #54  <Method boolean List.add(Object)>
	// 2552 6102:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SL")).getDisplayCountry(), 232))));
	// 2553 6103:aload_1         
	// 2554 6104:new             #32  <Class CountryInfo>
	// 2555 6107:dup             
	// 2556 6108:new             #34  <Class Locale>
	// 2557 6111:dup             
	// 2558 6112:ldc1            #36  <String "">
	// 2559 6114:ldc2            #446 <String "SL">
	// 2560 6117:invokespecial   #41  <Method void Locale(String, String)>
	// 2561 6120:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2562 6123:sipush          232
	// 2563 6126:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2564 6129:invokeinterface #54  <Method boolean List.add(Object)>
	// 2565 6134:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SG")).getDisplayCountry(), 65))));
	// 2566 6135:aload_1         
	// 2567 6136:new             #32  <Class CountryInfo>
	// 2568 6139:dup             
	// 2569 6140:new             #34  <Class Locale>
	// 2570 6143:dup             
	// 2571 6144:ldc1            #36  <String "">
	// 2572 6146:ldc2            #448 <String "SG">
	// 2573 6149:invokespecial   #41  <Method void Locale(String, String)>
	// 2574 6152:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2575 6155:bipush          65
	// 2576 6157:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2577 6160:invokeinterface #54  <Method boolean List.add(Object)>
	// 2578 6165:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SX")).getDisplayCountry(), 1))));
	// 2579 6166:aload_1         
	// 2580 6167:new             #32  <Class CountryInfo>
	// 2581 6170:dup             
	// 2582 6171:new             #34  <Class Locale>
	// 2583 6174:dup             
	// 2584 6175:ldc1            #36  <String "">
	// 2585 6177:ldc2            #450 <String "SX">
	// 2586 6180:invokespecial   #41  <Method void Locale(String, String)>
	// 2587 6183:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2588 6186:iconst_1        
	// 2589 6187:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2590 6190:invokeinterface #54  <Method boolean List.add(Object)>
	// 2591 6195:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SK")).getDisplayCountry(), 421))));
	// 2592 6196:aload_1         
	// 2593 6197:new             #32  <Class CountryInfo>
	// 2594 6200:dup             
	// 2595 6201:new             #34  <Class Locale>
	// 2596 6204:dup             
	// 2597 6205:ldc1            #36  <String "">
	// 2598 6207:ldc2            #452 <String "SK">
	// 2599 6210:invokespecial   #41  <Method void Locale(String, String)>
	// 2600 6213:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2601 6216:sipush          421
	// 2602 6219:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2603 6222:invokeinterface #54  <Method boolean List.add(Object)>
	// 2604 6227:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SI")).getDisplayCountry(), 386))));
	// 2605 6228:aload_1         
	// 2606 6229:new             #32  <Class CountryInfo>
	// 2607 6232:dup             
	// 2608 6233:new             #34  <Class Locale>
	// 2609 6236:dup             
	// 2610 6237:ldc1            #36  <String "">
	// 2611 6239:ldc2            #454 <String "SI">
	// 2612 6242:invokespecial   #41  <Method void Locale(String, String)>
	// 2613 6245:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2614 6248:sipush          386
	// 2615 6251:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2616 6254:invokeinterface #54  <Method boolean List.add(Object)>
	// 2617 6259:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SB")).getDisplayCountry(), 677))));
	// 2618 6260:aload_1         
	// 2619 6261:new             #32  <Class CountryInfo>
	// 2620 6264:dup             
	// 2621 6265:new             #34  <Class Locale>
	// 2622 6268:dup             
	// 2623 6269:ldc1            #36  <String "">
	// 2624 6271:ldc2            #456 <String "SB">
	// 2625 6274:invokespecial   #41  <Method void Locale(String, String)>
	// 2626 6277:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2627 6280:sipush          677
	// 2628 6283:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2629 6286:invokeinterface #54  <Method boolean List.add(Object)>
	// 2630 6291:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SO")).getDisplayCountry(), 252))));
	// 2631 6292:aload_1         
	// 2632 6293:new             #32  <Class CountryInfo>
	// 2633 6296:dup             
	// 2634 6297:new             #34  <Class Locale>
	// 2635 6300:dup             
	// 2636 6301:ldc1            #36  <String "">
	// 2637 6303:ldc2            #458 <String "SO">
	// 2638 6306:invokespecial   #41  <Method void Locale(String, String)>
	// 2639 6309:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2640 6312:sipush          252
	// 2641 6315:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2642 6318:invokeinterface #54  <Method boolean List.add(Object)>
	// 2643 6323:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ZA")).getDisplayCountry(), 27))));
	// 2644 6324:aload_1         
	// 2645 6325:new             #32  <Class CountryInfo>
	// 2646 6328:dup             
	// 2647 6329:new             #34  <Class Locale>
	// 2648 6332:dup             
	// 2649 6333:ldc1            #36  <String "">
	// 2650 6335:ldc2            #460 <String "ZA">
	// 2651 6338:invokespecial   #41  <Method void Locale(String, String)>
	// 2652 6341:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2653 6344:bipush          27
	// 2654 6346:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2655 6349:invokeinterface #54  <Method boolean List.add(Object)>
	// 2656 6354:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GS")).getDisplayCountry(), 500))));
	// 2657 6355:aload_1         
	// 2658 6356:new             #32  <Class CountryInfo>
	// 2659 6359:dup             
	// 2660 6360:new             #34  <Class Locale>
	// 2661 6363:dup             
	// 2662 6364:ldc1            #36  <String "">
	// 2663 6366:ldc2            #462 <String "GS">
	// 2664 6369:invokespecial   #41  <Method void Locale(String, String)>
	// 2665 6372:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2666 6375:sipush          500
	// 2667 6378:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2668 6381:invokeinterface #54  <Method boolean List.add(Object)>
	// 2669 6386:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "KR")).getDisplayCountry(), 82))));
	// 2670 6387:aload_1         
	// 2671 6388:new             #32  <Class CountryInfo>
	// 2672 6391:dup             
	// 2673 6392:new             #34  <Class Locale>
	// 2674 6395:dup             
	// 2675 6396:ldc1            #36  <String "">
	// 2676 6398:ldc2            #464 <String "KR">
	// 2677 6401:invokespecial   #41  <Method void Locale(String, String)>
	// 2678 6404:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2679 6407:bipush          82
	// 2680 6409:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2681 6412:invokeinterface #54  <Method boolean List.add(Object)>
	// 2682 6417:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SS")).getDisplayCountry(), 211))));
	// 2683 6418:aload_1         
	// 2684 6419:new             #32  <Class CountryInfo>
	// 2685 6422:dup             
	// 2686 6423:new             #34  <Class Locale>
	// 2687 6426:dup             
	// 2688 6427:ldc1            #36  <String "">
	// 2689 6429:ldc2            #466 <String "SS">
	// 2690 6432:invokespecial   #41  <Method void Locale(String, String)>
	// 2691 6435:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2692 6438:sipush          211
	// 2693 6441:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2694 6444:invokeinterface #54  <Method boolean List.add(Object)>
	// 2695 6449:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ES")).getDisplayCountry(), 34))));
	// 2696 6450:aload_1         
	// 2697 6451:new             #32  <Class CountryInfo>
	// 2698 6454:dup             
	// 2699 6455:new             #34  <Class Locale>
	// 2700 6458:dup             
	// 2701 6459:ldc1            #36  <String "">
	// 2702 6461:ldc2            #468 <String "ES">
	// 2703 6464:invokespecial   #41  <Method void Locale(String, String)>
	// 2704 6467:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2705 6470:bipush          34
	// 2706 6472:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2707 6475:invokeinterface #54  <Method boolean List.add(Object)>
	// 2708 6480:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "LK")).getDisplayCountry(), 94))));
	// 2709 6481:aload_1         
	// 2710 6482:new             #32  <Class CountryInfo>
	// 2711 6485:dup             
	// 2712 6486:new             #34  <Class Locale>
	// 2713 6489:dup             
	// 2714 6490:ldc1            #36  <String "">
	// 2715 6492:ldc2            #470 <String "LK">
	// 2716 6495:invokespecial   #41  <Method void Locale(String, String)>
	// 2717 6498:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2718 6501:bipush          94
	// 2719 6503:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2720 6506:invokeinterface #54  <Method boolean List.add(Object)>
	// 2721 6511:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SD")).getDisplayCountry(), 249))));
	// 2722 6512:aload_1         
	// 2723 6513:new             #32  <Class CountryInfo>
	// 2724 6516:dup             
	// 2725 6517:new             #34  <Class Locale>
	// 2726 6520:dup             
	// 2727 6521:ldc1            #36  <String "">
	// 2728 6523:ldc2            #472 <String "SD">
	// 2729 6526:invokespecial   #41  <Method void Locale(String, String)>
	// 2730 6529:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2731 6532:sipush          249
	// 2732 6535:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2733 6538:invokeinterface #54  <Method boolean List.add(Object)>
	// 2734 6543:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SR")).getDisplayCountry(), 597))));
	// 2735 6544:aload_1         
	// 2736 6545:new             #32  <Class CountryInfo>
	// 2737 6548:dup             
	// 2738 6549:new             #34  <Class Locale>
	// 2739 6552:dup             
	// 2740 6553:ldc1            #36  <String "">
	// 2741 6555:ldc2            #474 <String "SR">
	// 2742 6558:invokespecial   #41  <Method void Locale(String, String)>
	// 2743 6561:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2744 6564:sipush          597
	// 2745 6567:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2746 6570:invokeinterface #54  <Method boolean List.add(Object)>
	// 2747 6575:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SJ")).getDisplayCountry(), 47))));
	// 2748 6576:aload_1         
	// 2749 6577:new             #32  <Class CountryInfo>
	// 2750 6580:dup             
	// 2751 6581:new             #34  <Class Locale>
	// 2752 6584:dup             
	// 2753 6585:ldc1            #36  <String "">
	// 2754 6587:ldc2            #476 <String "SJ">
	// 2755 6590:invokespecial   #41  <Method void Locale(String, String)>
	// 2756 6593:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2757 6596:bipush          47
	// 2758 6598:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2759 6601:invokeinterface #54  <Method boolean List.add(Object)>
	// 2760 6606:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SZ")).getDisplayCountry(), 268))));
	// 2761 6607:aload_1         
	// 2762 6608:new             #32  <Class CountryInfo>
	// 2763 6611:dup             
	// 2764 6612:new             #34  <Class Locale>
	// 2765 6615:dup             
	// 2766 6616:ldc1            #36  <String "">
	// 2767 6618:ldc2            #478 <String "SZ">
	// 2768 6621:invokespecial   #41  <Method void Locale(String, String)>
	// 2769 6624:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2770 6627:sipush          268
	// 2771 6630:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2772 6633:invokeinterface #54  <Method boolean List.add(Object)>
	// 2773 6638:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SE")).getDisplayCountry(), 46))));
	// 2774 6639:aload_1         
	// 2775 6640:new             #32  <Class CountryInfo>
	// 2776 6643:dup             
	// 2777 6644:new             #34  <Class Locale>
	// 2778 6647:dup             
	// 2779 6648:ldc1            #36  <String "">
	// 2780 6650:ldc2            #480 <String "SE">
	// 2781 6653:invokespecial   #41  <Method void Locale(String, String)>
	// 2782 6656:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2783 6659:bipush          46
	// 2784 6661:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2785 6664:invokeinterface #54  <Method boolean List.add(Object)>
	// 2786 6669:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "CH")).getDisplayCountry(), 41))));
	// 2787 6670:aload_1         
	// 2788 6671:new             #32  <Class CountryInfo>
	// 2789 6674:dup             
	// 2790 6675:new             #34  <Class Locale>
	// 2791 6678:dup             
	// 2792 6679:ldc1            #36  <String "">
	// 2793 6681:ldc2            #482 <String "CH">
	// 2794 6684:invokespecial   #41  <Method void Locale(String, String)>
	// 2795 6687:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2796 6690:bipush          41
	// 2797 6692:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2798 6695:invokeinterface #54  <Method boolean List.add(Object)>
	// 2799 6700:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "SY")).getDisplayCountry(), 963))));
	// 2800 6701:aload_1         
	// 2801 6702:new             #32  <Class CountryInfo>
	// 2802 6705:dup             
	// 2803 6706:new             #34  <Class Locale>
	// 2804 6709:dup             
	// 2805 6710:ldc1            #36  <String "">
	// 2806 6712:ldc2            #484 <String "SY">
	// 2807 6715:invokespecial   #41  <Method void Locale(String, String)>
	// 2808 6718:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2809 6721:sipush          963
	// 2810 6724:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2811 6727:invokeinterface #54  <Method boolean List.add(Object)>
	// 2812 6732:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TW")).getDisplayCountry(), 886))));
	// 2813 6733:aload_1         
	// 2814 6734:new             #32  <Class CountryInfo>
	// 2815 6737:dup             
	// 2816 6738:new             #34  <Class Locale>
	// 2817 6741:dup             
	// 2818 6742:ldc1            #36  <String "">
	// 2819 6744:ldc2            #486 <String "TW">
	// 2820 6747:invokespecial   #41  <Method void Locale(String, String)>
	// 2821 6750:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2822 6753:sipush          886
	// 2823 6756:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2824 6759:invokeinterface #54  <Method boolean List.add(Object)>
	// 2825 6764:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TJ")).getDisplayCountry(), 992))));
	// 2826 6765:aload_1         
	// 2827 6766:new             #32  <Class CountryInfo>
	// 2828 6769:dup             
	// 2829 6770:new             #34  <Class Locale>
	// 2830 6773:dup             
	// 2831 6774:ldc1            #36  <String "">
	// 2832 6776:ldc2            #488 <String "TJ">
	// 2833 6779:invokespecial   #41  <Method void Locale(String, String)>
	// 2834 6782:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2835 6785:sipush          992
	// 2836 6788:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2837 6791:invokeinterface #54  <Method boolean List.add(Object)>
	// 2838 6796:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TZ")).getDisplayCountry(), 255))));
	// 2839 6797:aload_1         
	// 2840 6798:new             #32  <Class CountryInfo>
	// 2841 6801:dup             
	// 2842 6802:new             #34  <Class Locale>
	// 2843 6805:dup             
	// 2844 6806:ldc1            #36  <String "">
	// 2845 6808:ldc2            #490 <String "TZ">
	// 2846 6811:invokespecial   #41  <Method void Locale(String, String)>
	// 2847 6814:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2848 6817:sipush          255
	// 2849 6820:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2850 6823:invokeinterface #54  <Method boolean List.add(Object)>
	// 2851 6828:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TH")).getDisplayCountry(), 66))));
	// 2852 6829:aload_1         
	// 2853 6830:new             #32  <Class CountryInfo>
	// 2854 6833:dup             
	// 2855 6834:new             #34  <Class Locale>
	// 2856 6837:dup             
	// 2857 6838:ldc1            #36  <String "">
	// 2858 6840:ldc2            #492 <String "TH">
	// 2859 6843:invokespecial   #41  <Method void Locale(String, String)>
	// 2860 6846:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2861 6849:bipush          66
	// 2862 6851:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2863 6854:invokeinterface #54  <Method boolean List.add(Object)>
	// 2864 6859:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TG")).getDisplayCountry(), 228))));
	// 2865 6860:aload_1         
	// 2866 6861:new             #32  <Class CountryInfo>
	// 2867 6864:dup             
	// 2868 6865:new             #34  <Class Locale>
	// 2869 6868:dup             
	// 2870 6869:ldc1            #36  <String "">
	// 2871 6871:ldc2            #494 <String "TG">
	// 2872 6874:invokespecial   #41  <Method void Locale(String, String)>
	// 2873 6877:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2874 6880:sipush          228
	// 2875 6883:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2876 6886:invokeinterface #54  <Method boolean List.add(Object)>
	// 2877 6891:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TK")).getDisplayCountry(), 690))));
	// 2878 6892:aload_1         
	// 2879 6893:new             #32  <Class CountryInfo>
	// 2880 6896:dup             
	// 2881 6897:new             #34  <Class Locale>
	// 2882 6900:dup             
	// 2883 6901:ldc1            #36  <String "">
	// 2884 6903:ldc2            #496 <String "TK">
	// 2885 6906:invokespecial   #41  <Method void Locale(String, String)>
	// 2886 6909:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2887 6912:sipush          690
	// 2888 6915:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2889 6918:invokeinterface #54  <Method boolean List.add(Object)>
	// 2890 6923:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TO")).getDisplayCountry(), 676))));
	// 2891 6924:aload_1         
	// 2892 6925:new             #32  <Class CountryInfo>
	// 2893 6928:dup             
	// 2894 6929:new             #34  <Class Locale>
	// 2895 6932:dup             
	// 2896 6933:ldc1            #36  <String "">
	// 2897 6935:ldc2            #498 <String "TO">
	// 2898 6938:invokespecial   #41  <Method void Locale(String, String)>
	// 2899 6941:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2900 6944:sipush          676
	// 2901 6947:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2902 6950:invokeinterface #54  <Method boolean List.add(Object)>
	// 2903 6955:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TT")).getDisplayCountry(), 1))));
	// 2904 6956:aload_1         
	// 2905 6957:new             #32  <Class CountryInfo>
	// 2906 6960:dup             
	// 2907 6961:new             #34  <Class Locale>
	// 2908 6964:dup             
	// 2909 6965:ldc1            #36  <String "">
	// 2910 6967:ldc2            #500 <String "TT">
	// 2911 6970:invokespecial   #41  <Method void Locale(String, String)>
	// 2912 6973:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2913 6976:iconst_1        
	// 2914 6977:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2915 6980:invokeinterface #54  <Method boolean List.add(Object)>
	// 2916 6985:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TN")).getDisplayCountry(), 216))));
	// 2917 6986:aload_1         
	// 2918 6987:new             #32  <Class CountryInfo>
	// 2919 6990:dup             
	// 2920 6991:new             #34  <Class Locale>
	// 2921 6994:dup             
	// 2922 6995:ldc1            #36  <String "">
	// 2923 6997:ldc2            #502 <String "TN">
	// 2924 7000:invokespecial   #41  <Method void Locale(String, String)>
	// 2925 7003:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2926 7006:sipush          216
	// 2927 7009:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2928 7012:invokeinterface #54  <Method boolean List.add(Object)>
	// 2929 7017:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TR")).getDisplayCountry(), 90))));
	// 2930 7018:aload_1         
	// 2931 7019:new             #32  <Class CountryInfo>
	// 2932 7022:dup             
	// 2933 7023:new             #34  <Class Locale>
	// 2934 7026:dup             
	// 2935 7027:ldc1            #36  <String "">
	// 2936 7029:ldc2            #504 <String "TR">
	// 2937 7032:invokespecial   #41  <Method void Locale(String, String)>
	// 2938 7035:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2939 7038:bipush          90
	// 2940 7040:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2941 7043:invokeinterface #54  <Method boolean List.add(Object)>
	// 2942 7048:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TM")).getDisplayCountry(), 993))));
	// 2943 7049:aload_1         
	// 2944 7050:new             #32  <Class CountryInfo>
	// 2945 7053:dup             
	// 2946 7054:new             #34  <Class Locale>
	// 2947 7057:dup             
	// 2948 7058:ldc1            #36  <String "">
	// 2949 7060:ldc2            #506 <String "TM">
	// 2950 7063:invokespecial   #41  <Method void Locale(String, String)>
	// 2951 7066:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2952 7069:sipush          993
	// 2953 7072:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2954 7075:invokeinterface #54  <Method boolean List.add(Object)>
	// 2955 7080:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TC")).getDisplayCountry(), 1))));
	// 2956 7081:aload_1         
	// 2957 7082:new             #32  <Class CountryInfo>
	// 2958 7085:dup             
	// 2959 7086:new             #34  <Class Locale>
	// 2960 7089:dup             
	// 2961 7090:ldc1            #36  <String "">
	// 2962 7092:ldc2            #508 <String "TC">
	// 2963 7095:invokespecial   #41  <Method void Locale(String, String)>
	// 2964 7098:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2965 7101:iconst_1        
	// 2966 7102:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2967 7105:invokeinterface #54  <Method boolean List.add(Object)>
	// 2968 7110:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "TV")).getDisplayCountry(), 688))));
	// 2969 7111:aload_1         
	// 2970 7112:new             #32  <Class CountryInfo>
	// 2971 7115:dup             
	// 2972 7116:new             #34  <Class Locale>
	// 2973 7119:dup             
	// 2974 7120:ldc1            #36  <String "">
	// 2975 7122:ldc2            #510 <String "TV">
	// 2976 7125:invokespecial   #41  <Method void Locale(String, String)>
	// 2977 7128:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2978 7131:sipush          688
	// 2979 7134:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2980 7137:invokeinterface #54  <Method boolean List.add(Object)>
	// 2981 7142:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VI")).getDisplayCountry(), 1))));
	// 2982 7143:aload_1         
	// 2983 7144:new             #32  <Class CountryInfo>
	// 2984 7147:dup             
	// 2985 7148:new             #34  <Class Locale>
	// 2986 7151:dup             
	// 2987 7152:ldc1            #36  <String "">
	// 2988 7154:ldc2            #512 <String "VI">
	// 2989 7157:invokespecial   #41  <Method void Locale(String, String)>
	// 2990 7160:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 2991 7163:iconst_1        
	// 2992 7164:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 2993 7167:invokeinterface #54  <Method boolean List.add(Object)>
	// 2994 7172:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "UG")).getDisplayCountry(), 256))));
	// 2995 7173:aload_1         
	// 2996 7174:new             #32  <Class CountryInfo>
	// 2997 7177:dup             
	// 2998 7178:new             #34  <Class Locale>
	// 2999 7181:dup             
	// 3000 7182:ldc1            #36  <String "">
	// 3001 7184:ldc2            #514 <String "UG">
	// 3002 7187:invokespecial   #41  <Method void Locale(String, String)>
	// 3003 7190:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3004 7193:sipush          256
	// 3005 7196:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3006 7199:invokeinterface #54  <Method boolean List.add(Object)>
	// 3007 7204:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "UA")).getDisplayCountry(), 380))));
	// 3008 7205:aload_1         
	// 3009 7206:new             #32  <Class CountryInfo>
	// 3010 7209:dup             
	// 3011 7210:new             #34  <Class Locale>
	// 3012 7213:dup             
	// 3013 7214:ldc1            #36  <String "">
	// 3014 7216:ldc2            #516 <String "UA">
	// 3015 7219:invokespecial   #41  <Method void Locale(String, String)>
	// 3016 7222:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3017 7225:sipush          380
	// 3018 7228:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3019 7231:invokeinterface #54  <Method boolean List.add(Object)>
	// 3020 7236:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "AE")).getDisplayCountry(), 971))));
	// 3021 7237:aload_1         
	// 3022 7238:new             #32  <Class CountryInfo>
	// 3023 7241:dup             
	// 3024 7242:new             #34  <Class Locale>
	// 3025 7245:dup             
	// 3026 7246:ldc1            #36  <String "">
	// 3027 7248:ldc2            #518 <String "AE">
	// 3028 7251:invokespecial   #41  <Method void Locale(String, String)>
	// 3029 7254:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3030 7257:sipush          971
	// 3031 7260:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3032 7263:invokeinterface #54  <Method boolean List.add(Object)>
	// 3033 7268:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "GB")).getDisplayCountry(), 44))));
	// 3034 7269:aload_1         
	// 3035 7270:new             #32  <Class CountryInfo>
	// 3036 7273:dup             
	// 3037 7274:new             #34  <Class Locale>
	// 3038 7277:dup             
	// 3039 7278:ldc1            #36  <String "">
	// 3040 7280:ldc2            #520 <String "GB">
	// 3041 7283:invokespecial   #41  <Method void Locale(String, String)>
	// 3042 7286:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3043 7289:bipush          44
	// 3044 7291:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3045 7294:invokeinterface #54  <Method boolean List.add(Object)>
	// 3046 7299:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "US")).getDisplayCountry(), 1))));
	// 3047 7300:aload_1         
	// 3048 7301:new             #32  <Class CountryInfo>
	// 3049 7304:dup             
	// 3050 7305:new             #34  <Class Locale>
	// 3051 7308:dup             
	// 3052 7309:ldc1            #36  <String "">
	// 3053 7311:ldc2            #522 <String "US">
	// 3054 7314:invokespecial   #41  <Method void Locale(String, String)>
	// 3055 7317:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3056 7320:iconst_1        
	// 3057 7321:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3058 7324:invokeinterface #54  <Method boolean List.add(Object)>
	// 3059 7329:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "UY")).getDisplayCountry(), 598))));
	// 3060 7330:aload_1         
	// 3061 7331:new             #32  <Class CountryInfo>
	// 3062 7334:dup             
	// 3063 7335:new             #34  <Class Locale>
	// 3064 7338:dup             
	// 3065 7339:ldc1            #36  <String "">
	// 3066 7341:ldc2            #524 <String "UY">
	// 3067 7344:invokespecial   #41  <Method void Locale(String, String)>
	// 3068 7347:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3069 7350:sipush          598
	// 3070 7353:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3071 7356:invokeinterface #54  <Method boolean List.add(Object)>
	// 3072 7361:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "UZ")).getDisplayCountry(), 998))));
	// 3073 7362:aload_1         
	// 3074 7363:new             #32  <Class CountryInfo>
	// 3075 7366:dup             
	// 3076 7367:new             #34  <Class Locale>
	// 3077 7370:dup             
	// 3078 7371:ldc1            #36  <String "">
	// 3079 7373:ldc2            #526 <String "UZ">
	// 3080 7376:invokespecial   #41  <Method void Locale(String, String)>
	// 3081 7379:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3082 7382:sipush          998
	// 3083 7385:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3084 7388:invokeinterface #54  <Method boolean List.add(Object)>
	// 3085 7393:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VU")).getDisplayCountry(), 678))));
	// 3086 7394:aload_1         
	// 3087 7395:new             #32  <Class CountryInfo>
	// 3088 7398:dup             
	// 3089 7399:new             #34  <Class Locale>
	// 3090 7402:dup             
	// 3091 7403:ldc1            #36  <String "">
	// 3092 7405:ldc2            #528 <String "VU">
	// 3093 7408:invokespecial   #41  <Method void Locale(String, String)>
	// 3094 7411:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3095 7414:sipush          678
	// 3096 7417:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3097 7420:invokeinterface #54  <Method boolean List.add(Object)>
	// 3098 7425:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VA")).getDisplayCountry(), 379))));
	// 3099 7426:aload_1         
	// 3100 7427:new             #32  <Class CountryInfo>
	// 3101 7430:dup             
	// 3102 7431:new             #34  <Class Locale>
	// 3103 7434:dup             
	// 3104 7435:ldc1            #36  <String "">
	// 3105 7437:ldc2            #530 <String "VA">
	// 3106 7440:invokespecial   #41  <Method void Locale(String, String)>
	// 3107 7443:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3108 7446:sipush          379
	// 3109 7449:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3110 7452:invokeinterface #54  <Method boolean List.add(Object)>
	// 3111 7457:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VE")).getDisplayCountry(), 58))));
	// 3112 7458:aload_1         
	// 3113 7459:new             #32  <Class CountryInfo>
	// 3114 7462:dup             
	// 3115 7463:new             #34  <Class Locale>
	// 3116 7466:dup             
	// 3117 7467:ldc1            #36  <String "">
	// 3118 7469:ldc2            #532 <String "VE">
	// 3119 7472:invokespecial   #41  <Method void Locale(String, String)>
	// 3120 7475:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3121 7478:bipush          58
	// 3122 7480:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3123 7483:invokeinterface #54  <Method boolean List.add(Object)>
	// 3124 7488:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "VN")).getDisplayCountry(), 84))));
	// 3125 7489:aload_1         
	// 3126 7490:new             #32  <Class CountryInfo>
	// 3127 7493:dup             
	// 3128 7494:new             #34  <Class Locale>
	// 3129 7497:dup             
	// 3130 7498:ldc1            #36  <String "">
	// 3131 7500:ldc2            #534 <String "VN">
	// 3132 7503:invokespecial   #41  <Method void Locale(String, String)>
	// 3133 7506:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3134 7509:bipush          84
	// 3135 7511:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3136 7514:invokeinterface #54  <Method boolean List.add(Object)>
	// 3137 7519:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "WF")).getDisplayCountry(), 681))));
	// 3138 7520:aload_1         
	// 3139 7521:new             #32  <Class CountryInfo>
	// 3140 7524:dup             
	// 3141 7525:new             #34  <Class Locale>
	// 3142 7528:dup             
	// 3143 7529:ldc1            #36  <String "">
	// 3144 7531:ldc2            #536 <String "WF">
	// 3145 7534:invokespecial   #41  <Method void Locale(String, String)>
	// 3146 7537:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3147 7540:sipush          681
	// 3148 7543:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3149 7546:invokeinterface #54  <Method boolean List.add(Object)>
	// 3150 7551:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "EH")).getDisplayCountry(), 212))));
	// 3151 7552:aload_1         
	// 3152 7553:new             #32  <Class CountryInfo>
	// 3153 7556:dup             
	// 3154 7557:new             #34  <Class Locale>
	// 3155 7560:dup             
	// 3156 7561:ldc1            #36  <String "">
	// 3157 7563:ldc2            #538 <String "EH">
	// 3158 7566:invokespecial   #41  <Method void Locale(String, String)>
	// 3159 7569:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3160 7572:sipush          212
	// 3161 7575:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3162 7578:invokeinterface #54  <Method boolean List.add(Object)>
	// 3163 7583:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "YE")).getDisplayCountry(), 967))));
	// 3164 7584:aload_1         
	// 3165 7585:new             #32  <Class CountryInfo>
	// 3166 7588:dup             
	// 3167 7589:new             #34  <Class Locale>
	// 3168 7592:dup             
	// 3169 7593:ldc1            #36  <String "">
	// 3170 7595:ldc2            #540 <String "YE">
	// 3171 7598:invokespecial   #41  <Method void Locale(String, String)>
	// 3172 7601:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3173 7604:sipush          967
	// 3174 7607:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3175 7610:invokeinterface #54  <Method boolean List.add(Object)>
	// 3176 7615:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ZM")).getDisplayCountry(), 260))));
	// 3177 7616:aload_1         
	// 3178 7617:new             #32  <Class CountryInfo>
	// 3179 7620:dup             
	// 3180 7621:new             #34  <Class Locale>
	// 3181 7624:dup             
	// 3182 7625:ldc1            #36  <String "">
	// 3183 7627:ldc2            #542 <String "ZM">
	// 3184 7630:invokespecial   #41  <Method void Locale(String, String)>
	// 3185 7633:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3186 7636:sipush          260
	// 3187 7639:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3188 7642:invokeinterface #54  <Method boolean List.add(Object)>
	// 3189 7647:pop             
		((List) (avoid)).add(((Object) (new CountryInfo((new Locale("", "ZW")).getDisplayCountry(), 263))));
	// 3190 7648:aload_1         
	// 3191 7649:new             #32  <Class CountryInfo>
	// 3192 7652:dup             
	// 3193 7653:new             #34  <Class Locale>
	// 3194 7656:dup             
	// 3195 7657:ldc1            #36  <String "">
	// 3196 7659:ldc2            #544 <String "ZW">
	// 3197 7662:invokespecial   #41  <Method void Locale(String, String)>
	// 3198 7665:invokevirtual   #45  <Method String Locale.getDisplayCountry()>
	// 3199 7668:sipush          263
	// 3200 7671:invokespecial   #48  <Method void CountryInfo(String, int)>
	// 3201 7674:invokeinterface #54  <Method boolean List.add(Object)>
	// 3202 7679:pop             
		Collections.sort(((List) (avoid)));
	// 3203 7680:aload_1         
	// 3204 7681:invokestatic    #550 <Method void Collections.sort(List)>
		return ((List) (avoid));
	// 3205 7684:aload_1         
	// 3206 7685:areturn         
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #50  <Class List>
	//    3    5:invokevirtual   #556 <Method void onPostExecute(List)>
	//    4    8:return          
	}

	protected void onPostExecute(List list)
	{
		Listener listener1 = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CountryListLoadTask$Listener listener>
	//    2    4:astore_2        
		if(listener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			listener1.onLoadComplete(list);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #559 <Method void CountryListLoadTask$Listener.onLoadComplete(List)>
	//    8   16:return          
	}

	private final Listener listener;
}
