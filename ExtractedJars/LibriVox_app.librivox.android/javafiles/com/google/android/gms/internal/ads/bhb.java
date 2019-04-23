// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bno, zzkq, bgj, 
//			zzkk, zzkm, zzkp

final class bhb
{

	public static zzki.zza a(bno bno1)
	{
		int i1;
		int j1;
		int i2;
		byte abyte0[];
		zzkm zzkm1;
		Object obj1;
		i2 = bno1.d() + bno1.l();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method int bno.d()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #468 <Method int bno.l()>
	//    4    8:iadd            
	//    5    9:istore          5
		i1 = bno1.l();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #468 <Method int bno.l()>
	//    8   15:istore_1        
		j1 = i1 >>> 24;
	//    9   16:iload_1         
	//   10   17:bipush          24
	//   11   19:iushr           
	//   12   20:istore_2        
		obj1 = null;
	//   13   21:aconst_null     
	//   14   22:astore          10
		zzkm1 = null;
	//   15   24:aconst_null     
	//   16   25:astore          9
		abyte0 = null;
	//   17   27:aconst_null     
	//   18   28:astore          8
		if(j1 != 169 && j1 != 65533) goto _L2; else goto _L1
	//   19   30:iload_2         
	//   20   31:sipush          169
	//   21   34:icmpeq          858
	//   22   37:iload_2         
	//   23   38:ldc2            #469 <Int 65533>
	//   24   41:icmpne          47
	//*  25   44:goto            858
_L2:
		if(i1 != m) goto _L4; else goto _L3
	//   26   47:iload_1         
	//   27   48:getstatic       #95  <Field int m>
	//   28   51:icmpne          128
_L3:
		i1 = b(bno1);
	//   29   54:aload_0         
	//   30   55:invokestatic    #472 <Method int b(bno)>
	//   31   58:istore_1        
		if(i1 <= 0) goto _L6; else goto _L5
	//   32   59:iload_1         
	//   33   60:ifle            1309
_L5:
		if(i1 > D.length) goto _L6; else goto _L7
	//   34   63:iload_1         
	//   35   64:getstatic       #459 <Field String[] D>
	//   36   67:arraylength     
	//   37   68:icmpgt          1309
_L7:
		Object obj = ((Object) (D[i1 - 1]));
	//   38   71:getstatic       #459 <Field String[] D>
	//   39   74:iload_1         
	//   40   75:iconst_1        
	//   41   76:isub            
	//   42   77:aaload          
	//   43   78:astore          7
	//*  44   80:goto            83
_L18:
		if(obj == null)
			break MISSING_BLOCK_LABEL_106;
	//   45   83:aload           7
	//   46   85:ifnull          106
		obj = ((Object) (new zzkq("TCON", ((String) (null)), ((String) (obj)))));
	//   47   88:new             #474 <Class zzkq>
	//   48   91:dup             
	//   49   92:ldc2            #476 <String "TCON">
	//   50   95:aconst_null     
	//   51   96:aload           7
	//   52   98:invokespecial   #480 <Method void zzkq(String, String, String)>
	//   53  101:astore          7
		break MISSING_BLOCK_LABEL_119;
	//   54  103:goto            119
		Log.w("MetadataUtil", "Failed to parse standard genre code");
	//   55  106:ldc2            #482 <String "MetadataUtil">
	//   56  109:ldc2            #484 <String "Failed to parse standard genre code">
	//   57  112:invokestatic    #489 <Method int Log.w(String, String)>
	//   58  115:pop             
		obj = null;
	//   59  116:aconst_null     
	//   60  117:astore          7
		bno1.c(i2);
	//   61  119:aload_0         
	//   62  120:iload           5
	//   63  122:invokevirtual   #492 <Method void bno.c(int)>
		return ((zzki.zza) (obj));
	//   64  125:aload           7
	//   65  127:areturn         
_L4:
		if(i1 != o)
			break MISSING_BLOCK_LABEL_154;
	//   66  128:iload_1         
	//   67  129:getstatic       #103 <Field int o>
	//   68  132:icmpne          154
		obj = ((Object) (b(i1, "TPOS", bno1)));
	//   69  135:iload_1         
	//   70  136:ldc2            #494 <String "TPOS">
	//   71  139:aload_0         
	//   72  140:invokestatic    #497 <Method zzkq b(int, String, bno)>
	//   73  143:astore          7
		bno1.c(i2);
	//   74  145:aload_0         
	//   75  146:iload           5
	//   76  148:invokevirtual   #492 <Method void bno.c(int)>
		return ((zzki.zza) (obj));
	//   77  151:aload           7
	//   78  153:areturn         
		if(i1 != p)
			break MISSING_BLOCK_LABEL_180;
	//   79  154:iload_1         
	//   80  155:getstatic       #107 <Field int p>
	//   81  158:icmpne          180
		obj = ((Object) (b(i1, "TRCK", bno1)));
	//   82  161:iload_1         
	//   83  162:ldc2            #499 <String "TRCK">
	//   84  165:aload_0         
	//   85  166:invokestatic    #497 <Method zzkq b(int, String, bno)>
	//   86  169:astore          7
		bno1.c(i2);
	//   87  171:aload_0         
	//   88  172:iload           5
	//   89  174:invokevirtual   #492 <Method void bno.c(int)>
		return ((zzki.zza) (obj));
	//   90  177:aload           7
	//   91  179:areturn         
		if(i1 != q)
			break MISSING_BLOCK_LABEL_208;
	//   92  180:iload_1         
	//   93  181:getstatic       #111 <Field int q>
	//   94  184:icmpne          208
		obj = ((Object) (a(i1, "TBPM", bno1, true, false)));
	//   95  187:iload_1         
	//   96  188:ldc2            #501 <String "TBPM">
	//   97  191:aload_0         
	//   98  192:iconst_1        
	//   99  193:iconst_0        
	//  100  194:invokestatic    #504 <Method zzkp a(int, String, bno, boolean, boolean)>
	//  101  197:astore          7
		bno1.c(i2);
	//  102  199:aload_0         
	//  103  200:iload           5
	//  104  202:invokevirtual   #492 <Method void bno.c(int)>
		return ((zzki.zza) (obj));
	//  105  205:aload           7
	//  106  207:areturn         
		if(i1 != r)
			break MISSING_BLOCK_LABEL_236;
	//  107  208:iload_1         
	//  108  209:getstatic       #115 <Field int r>
	//  109  212:icmpne          236
		obj = ((Object) (a(i1, "TCMP", bno1, true, true)));
	//  110  215:iload_1         
	//  111  216:ldc2            #506 <String "TCMP">
	//  112  219:aload_0         
	//  113  220:iconst_1        
	//  114  221:iconst_1        
	//  115  222:invokestatic    #504 <Method zzkp a(int, String, bno, boolean, boolean)>
	//  116  225:astore          7
		bno1.c(i2);
	//  117  227:aload_0         
	//  118  228:iload           5
	//  119  230:invokevirtual   #492 <Method void bno.c(int)>
		return ((zzki.zza) (obj));
	//  120  233:aload           7
	//  121  235:areturn         
		if(i1 != l)
			break MISSING_BLOCK_LABEL_395;
	//  122  236:iload_1         
	//  123  237:getstatic       #91  <Field int l>
	//  124  240:icmpne          395
		i1 = bno1.l();
	//  125  243:aload_0         
	//  126  244:invokevirtual   #468 <Method int bno.l()>
	//  127  247:istore_1        
		if(bno1.l() != bgj.aE)
			break MISSING_BLOCK_LABEL_372;
	//  128  248:aload_0         
	//  129  249:invokevirtual   #468 <Method int bno.l()>
	//  130  252:getstatic       #511 <Field int bgj.aE>
	//  131  255:icmpne          372
		j1 = bgj.b(bno1.l());
	//  132  258:aload_0         
	//  133  259:invokevirtual   #468 <Method int bno.l()>
	//  134  262:invokestatic    #514 <Method int bgj.b(int)>
	//  135  265:istore_2        
		int k1;
		int l1;
		int j2;
		String s1;
		if(j1 == 13)
	//* 136  266:iload_2         
	//* 137  267:bipush          13
	//* 138  269:icmpne          1315
			obj = "image/jpeg";
	//  139  272:ldc2            #516 <String "image/jpeg">
	//  140  275:astore          7
		else
	//* 141  277:goto            280
	//* 142  280:aload           7
	//* 143  282:ifnonnull       331
	//* 144  285:new             #518 <Class StringBuilder>
	//* 145  288:dup             
	//* 146  289:bipush          41
	//* 147  291:invokespecial   #520 <Method void StringBuilder(int)>
	//* 148  294:astore          7
	//* 149  296:aload           7
	//* 150  298:ldc2            #522 <String "Unrecognized cover art flags: ">
	//* 151  301:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
	//* 152  304:pop             
	//* 153  305:aload           7
	//* 154  307:iload_2         
	//* 155  308:invokevirtual   #529 <Method StringBuilder StringBuilder.append(int)>
	//* 156  311:pop             
	//* 157  312:ldc2            #482 <String "MetadataUtil">
	//* 158  315:aload           7
	//* 159  317:invokevirtual   #533 <Method String StringBuilder.toString()>
	//* 160  320:invokestatic    #489 <Method int Log.w(String, String)>
	//* 161  323:pop             
	//* 162  324:aload           8
	//* 163  326:astore          7
	//* 164  328:goto            386
	//* 165  331:aload_0         
	//* 166  332:iconst_4        
	//* 167  333:invokevirtual   #535 <Method void bno.d(int)>
	//* 168  336:iload_1         
	//* 169  337:bipush          16
	//* 170  339:isub            
	//* 171  340:newarray        byte[]
	//* 172  342:astore          8
	//* 173  344:aload_0         
	//* 174  345:aload           8
	//* 175  347:iconst_0        
	//* 176  348:aload           8
	//* 177  350:arraylength     
	//* 178  351:invokevirtual   #538 <Method void bno.a(byte[], int, int)>
	//* 179  354:new             #540 <Class zzkk>
	//* 180  357:dup             
	//* 181  358:aload           7
	//* 182  360:aconst_null     
	//* 183  361:iconst_3        
	//* 184  362:aload           8
	//* 185  364:invokespecial   #543 <Method void zzkk(String, String, int, byte[])>
	//* 186  367:astore          7
	//* 187  369:goto            386
	//* 188  372:ldc2            #482 <String "MetadataUtil">
	//* 189  375:ldc2            #545 <String "Failed to parse cover art attribute">
	//* 190  378:invokestatic    #489 <Method int Log.w(String, String)>
	//* 191  381:pop             
	//* 192  382:aload           8
	//* 193  384:astore          7
	//* 194  386:aload_0         
	//* 195  387:iload           5
	//* 196  389:invokevirtual   #492 <Method void bno.c(int)>
	//* 197  392:aload           7
	//* 198  394:areturn         
	//* 199  395:iload_1         
	//* 200  396:getstatic       #119 <Field int s>
	//* 201  399:icmpne          421
	//* 202  402:iload_1         
	//* 203  403:ldc2            #547 <String "TPE2">
	//* 204  406:aload_0         
	//* 205  407:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 206  410:astore          7
	//* 207  412:aload_0         
	//* 208  413:iload           5
	//* 209  415:invokevirtual   #492 <Method void bno.c(int)>
	//* 210  418:aload           7
	//* 211  420:areturn         
	//* 212  421:iload_1         
	//* 213  422:getstatic       #123 <Field int t>
	//* 214  425:icmpne          447
	//* 215  428:iload_1         
	//* 216  429:ldc2            #551 <String "TSOT">
	//* 217  432:aload_0         
	//* 218  433:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 219  436:astore          7
	//* 220  438:aload_0         
	//* 221  439:iload           5
	//* 222  441:invokevirtual   #492 <Method void bno.c(int)>
	//* 223  444:aload           7
	//* 224  446:areturn         
	//* 225  447:iload_1         
	//* 226  448:getstatic       #127 <Field int u>
	//* 227  451:icmpne          473
	//* 228  454:iload_1         
	//* 229  455:ldc2            #553 <String "TSO2">
	//* 230  458:aload_0         
	//* 231  459:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 232  462:astore          7
	//* 233  464:aload_0         
	//* 234  465:iload           5
	//* 235  467:invokevirtual   #492 <Method void bno.c(int)>
	//* 236  470:aload           7
	//* 237  472:areturn         
	//* 238  473:iload_1         
	//* 239  474:getstatic       #131 <Field int v>
	//* 240  477:icmpne          499
	//* 241  480:iload_1         
	//* 242  481:ldc2            #555 <String "TSOA">
	//* 243  484:aload_0         
	//* 244  485:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 245  488:astore          7
	//* 246  490:aload_0         
	//* 247  491:iload           5
	//* 248  493:invokevirtual   #492 <Method void bno.c(int)>
	//* 249  496:aload           7
	//* 250  498:areturn         
	//* 251  499:iload_1         
	//* 252  500:getstatic       #135 <Field int w>
	//* 253  503:icmpne          525
	//* 254  506:iload_1         
	//* 255  507:ldc2            #557 <String "TSOP">
	//* 256  510:aload_0         
	//* 257  511:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 258  514:astore          7
	//* 259  516:aload_0         
	//* 260  517:iload           5
	//* 261  519:invokevirtual   #492 <Method void bno.c(int)>
	//* 262  522:aload           7
	//* 263  524:areturn         
	//* 264  525:iload_1         
	//* 265  526:getstatic       #139 <Field int x>
	//* 266  529:icmpne          551
	//* 267  532:iload_1         
	//* 268  533:ldc2            #559 <String "TSOC">
	//* 269  536:aload_0         
	//* 270  537:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 271  540:astore          7
	//* 272  542:aload_0         
	//* 273  543:iload           5
	//* 274  545:invokevirtual   #492 <Method void bno.c(int)>
	//* 275  548:aload           7
	//* 276  550:areturn         
	//* 277  551:iload_1         
	//* 278  552:getstatic       #143 <Field int y>
	//* 279  555:icmpne          579
	//* 280  558:iload_1         
	//* 281  559:ldc2            #561 <String "ITUNESADVISORY">
	//* 282  562:aload_0         
	//* 283  563:iconst_0        
	//* 284  564:iconst_0        
	//* 285  565:invokestatic    #504 <Method zzkp a(int, String, bno, boolean, boolean)>
	//* 286  568:astore          7
	//* 287  570:aload_0         
	//* 288  571:iload           5
	//* 289  573:invokevirtual   #492 <Method void bno.c(int)>
	//* 290  576:aload           7
	//* 291  578:areturn         
	//* 292  579:iload_1         
	//* 293  580:getstatic       #147 <Field int z>
	//* 294  583:icmpne          607
	//* 295  586:iload_1         
	//* 296  587:ldc2            #563 <String "ITUNESGAPLESS">
	//* 297  590:aload_0         
	//* 298  591:iconst_0        
	//* 299  592:iconst_1        
	//* 300  593:invokestatic    #504 <Method zzkp a(int, String, bno, boolean, boolean)>
	//* 301  596:astore          7
	//* 302  598:aload_0         
	//* 303  599:iload           5
	//* 304  601:invokevirtual   #492 <Method void bno.c(int)>
	//* 305  604:aload           7
	//* 306  606:areturn         
	//* 307  607:iload_1         
	//* 308  608:getstatic       #151 <Field int A>
	//* 309  611:icmpne          633
	//* 310  614:iload_1         
	//* 311  615:ldc2            #565 <String "TVSHOWSORT">
	//* 312  618:aload_0         
	//* 313  619:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 314  622:astore          7
	//* 315  624:aload_0         
	//* 316  625:iload           5
	//* 317  627:invokevirtual   #492 <Method void bno.c(int)>
	//* 318  630:aload           7
	//* 319  632:areturn         
	//* 320  633:iload_1         
	//* 321  634:getstatic       #155 <Field int B>
	//* 322  637:icmpne          659
	//* 323  640:iload_1         
	//* 324  641:ldc2            #567 <String "TVSHOW">
	//* 325  644:aload_0         
	//* 326  645:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 327  648:astore          7
	//* 328  650:aload_0         
	//* 329  651:iload           5
	//* 330  653:invokevirtual   #492 <Method void bno.c(int)>
	//* 331  656:aload           7
	//* 332  658:areturn         
	//* 333  659:iload_1         
	//* 334  660:getstatic       #159 <Field int C>
	//* 335  663:icmpne          1201
	//* 336  666:aconst_null     
	//* 337  667:astore          8
	//* 338  669:aload           8
	//* 339  671:astore          7
	//* 340  673:iconst_m1       
	//* 341  674:istore_2        
	//* 342  675:iconst_m1       
	//* 343  676:istore_1        
	//* 344  677:aload_0         
	//* 345  678:invokevirtual   #466 <Method int bno.d()>
	//* 346  681:iload           5
	//* 347  683:icmpge          774
	//* 348  686:aload_0         
	//* 349  687:invokevirtual   #466 <Method int bno.d()>
	//* 350  690:istore          4
	//* 351  692:aload_0         
	//* 352  693:invokevirtual   #468 <Method int bno.l()>
	//* 353  696:istore_3        
	//* 354  697:aload_0         
	//* 355  698:invokevirtual   #468 <Method int bno.l()>
	//* 356  701:istore          6
	//* 357  703:aload_0         
	//* 358  704:iconst_4        
	//* 359  705:invokevirtual   #535 <Method void bno.d(int)>
	//* 360  708:iload           6
	//* 361  710:getstatic       #570 <Field int bgj.aC>
	//* 362  713:icmpne          729
	//* 363  716:aload_0         
	//* 364  717:iload_3         
	//* 365  718:bipush          12
	//* 366  720:isub            
	//* 367  721:invokevirtual   #573 <Method String bno.e(int)>
	//* 368  724:astore          8
	//* 369  726:goto            677
	//* 370  729:iload           6
	//* 371  731:getstatic       #576 <Field int bgj.aD>
	//* 372  734:icmpne          750
	//* 373  737:aload_0         
	//* 374  738:iload_3         
	//* 375  739:bipush          12
	//* 376  741:isub            
	//* 377  742:invokevirtual   #573 <Method String bno.e(int)>
	//* 378  745:astore          7
	//* 379  747:goto            677
	//* 380  750:iload           6
	//* 381  752:getstatic       #511 <Field int bgj.aE>
	//* 382  755:icmpne          763
	//* 383  758:iload           4
	//* 384  760:istore_2        
	//* 385  761:iload_3         
	//* 386  762:istore_1        
	//* 387  763:aload_0         
	//* 388  764:iload_3         
	//* 389  765:bipush          12
	//* 390  767:isub            
	//* 391  768:invokevirtual   #535 <Method void bno.d(int)>
	//* 392  771:goto            677
	//* 393  774:aload           10
	//* 394  776:astore          9
	//* 395  778:ldc2            #578 <String "com.apple.iTunes">
	//* 396  781:aload           8
	//* 397  783:invokevirtual   #582 <Method boolean String.equals(Object)>
	//* 398  786:ifeq            849
	//* 399  789:aload           10
	//* 400  791:astore          9
	//* 401  793:ldc2            #584 <String "iTunSMPB">
	//* 402  796:aload           7
	//* 403  798:invokevirtual   #582 <Method boolean String.equals(Object)>
	//* 404  801:ifeq            849
	//* 405  804:iload_2         
	//* 406  805:iconst_m1       
	//* 407  806:icmpne          816
	//* 408  809:aload           10
	//* 409  811:astore          9
	//* 410  813:goto            849
	//* 411  816:aload_0         
	//* 412  817:iload_2         
	//* 413  818:invokevirtual   #492 <Method void bno.c(int)>
	//* 414  821:aload_0         
	//* 415  822:bipush          16
	//* 416  824:invokevirtual   #535 <Method void bno.d(int)>
	//* 417  827:new             #586 <Class zzkm>
	//* 418  830:dup             
	//* 419  831:ldc2            #588 <String "und">
	//* 420  834:aload           7
	//* 421  836:aload_0         
	//* 422  837:iload_1         
	//* 423  838:bipush          16
	//* 424  840:isub            
	//* 425  841:invokevirtual   #573 <Method String bno.e(int)>
	//* 426  844:invokespecial   #589 <Method void zzkm(String, String, String)>
	//* 427  847:astore          9
	//* 428  849:aload_0         
	//* 429  850:iload           5
	//* 430  852:invokevirtual   #492 <Method void bno.c(int)>
	//* 431  855:aload           9
	//* 432  857:areturn         
	//* 433  858:ldc2            #590 <Int 0xffffff>
	//* 434  861:iload_1         
	//* 435  862:iand            
	//* 436  863:istore_2        
	//* 437  864:iload_2         
	//* 438  865:getstatic       #55  <Field int c>
	//* 439  868:icmpne          985
	//* 440  871:aload_0         
	//* 441  872:invokevirtual   #468 <Method int bno.l()>
	//* 442  875:istore_2        
	//* 443  876:aload_0         
	//* 444  877:invokevirtual   #468 <Method int bno.l()>
	//* 445  880:getstatic       #511 <Field int bgj.aE>
	//* 446  883:icmpne          921
	//* 447  886:aload_0         
	//* 448  887:bipush          8
	//* 449  889:invokevirtual   #535 <Method void bno.d(int)>
	//* 450  892:aload_0         
	//* 451  893:iload_2         
	//* 452  894:bipush          16
	//* 453  896:isub            
	//* 454  897:invokevirtual   #573 <Method String bno.e(int)>
	//* 455  900:astore          7
	//* 456  902:new             #586 <Class zzkm>
	//* 457  905:dup             
	//* 458  906:ldc2            #588 <String "und">
	//* 459  909:aload           7
	//* 460  911:aload           7
	//* 461  913:invokespecial   #589 <Method void zzkm(String, String, String)>
	//* 462  916:astore          7
	//* 463  918:goto            976
	//* 464  921:iload_1         
	//* 465  922:invokestatic    #592 <Method String bgj.c(int)>
	//* 466  925:invokestatic    #596 <Method String String.valueOf(Object)>
	//* 467  928:astore          7
	//* 468  930:aload           7
	//* 469  932:invokevirtual   #599 <Method int String.length()>
	//* 470  935:ifeq            951
	//* 471  938:ldc2            #601 <String "Failed to parse comment attribute: ">
	//* 472  941:aload           7
	//* 473  943:invokevirtual   #605 <Method String String.concat(String)>
	//* 474  946:astore          7
	//* 475  948:goto            963
	//* 476  951:new             #161 <Class String>
	//* 477  954:dup             
	//* 478  955:ldc2            #601 <String "Failed to parse comment attribute: ">
	//* 479  958:invokespecial   #608 <Method void String(String)>
	//* 480  961:astore          7
	//* 481  963:ldc2            #482 <String "MetadataUtil">
	//* 482  966:aload           7
	//* 483  968:invokestatic    #489 <Method int Log.w(String, String)>
	//* 484  971:pop             
	//* 485  972:aload           9
	//* 486  974:astore          7
	//* 487  976:aload_0         
	//* 488  977:iload           5
	//* 489  979:invokevirtual   #492 <Method void bno.c(int)>
	//* 490  982:aload           7
	//* 491  984:areturn         
	//* 492  985:iload_2         
	//* 493  986:getstatic       #47  <Field int a>
	//* 494  989:icmpeq          1279
	//* 495  992:iload_2         
	//* 496  993:getstatic       #51  <Field int b>
	//* 497  996:icmpne          1002
	//* 498  999:goto            1279
	//* 499 1002:iload_2         
	//* 500 1003:getstatic       #75  <Field int h>
	//* 501 1006:icmpeq          1260
	//* 502 1009:iload_2         
	//* 503 1010:getstatic       #79  <Field int i>
	//* 504 1013:icmpne          1019
	//* 505 1016:goto            1260
	//* 506 1019:iload_2         
	//* 507 1020:getstatic       #59  <Field int d>
	//* 508 1023:icmpne          1045
	//* 509 1026:iload_1         
	//* 510 1027:ldc2            #610 <String "TDRC">
	//* 511 1030:aload_0         
	//* 512 1031:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 513 1034:astore          7
	//* 514 1036:aload_0         
	//* 515 1037:iload           5
	//* 516 1039:invokevirtual   #492 <Method void bno.c(int)>
	//* 517 1042:aload           7
	//* 518 1044:areturn         
	//* 519 1045:iload_2         
	//* 520 1046:getstatic       #63  <Field int e>
	//* 521 1049:icmpne          1071
	//* 522 1052:iload_1         
	//* 523 1053:ldc2            #612 <String "TPE1">
	//* 524 1056:aload_0         
	//* 525 1057:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 526 1060:astore          7
	//* 527 1062:aload_0         
	//* 528 1063:iload           5
	//* 529 1065:invokevirtual   #492 <Method void bno.c(int)>
	//* 530 1068:aload           7
	//* 531 1070:areturn         
	//* 532 1071:iload_2         
	//* 533 1072:getstatic       #67  <Field int f>
	//* 534 1075:icmpne          1097
	//* 535 1078:iload_1         
	//* 536 1079:ldc2            #614 <String "TSSE">
	//* 537 1082:aload_0         
	//* 538 1083:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 539 1086:astore          7
	//* 540 1088:aload_0         
	//* 541 1089:iload           5
	//* 542 1091:invokevirtual   #492 <Method void bno.c(int)>
	//* 543 1094:aload           7
	//* 544 1096:areturn         
	//* 545 1097:iload_2         
	//* 546 1098:getstatic       #71  <Field int g>
	//* 547 1101:icmpne          1123
	//* 548 1104:iload_1         
	//* 549 1105:ldc2            #616 <String "TALB">
	//* 550 1108:aload_0         
	//* 551 1109:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 552 1112:astore          7
	//* 553 1114:aload_0         
	//* 554 1115:iload           5
	//* 555 1117:invokevirtual   #492 <Method void bno.c(int)>
	//* 556 1120:aload           7
	//* 557 1122:areturn         
	//* 558 1123:iload_2         
	//* 559 1124:getstatic       #83  <Field int j>
	//* 560 1127:icmpne          1149
	//* 561 1130:iload_1         
	//* 562 1131:ldc2            #618 <String "USLT">
	//* 563 1134:aload_0         
	//* 564 1135:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 565 1138:astore          7
	//* 566 1140:aload_0         
	//* 567 1141:iload           5
	//* 568 1143:invokevirtual   #492 <Method void bno.c(int)>
	//* 569 1146:aload           7
	//* 570 1148:areturn         
	//* 571 1149:iload_2         
	//* 572 1150:getstatic       #87  <Field int k>
	//* 573 1153:icmpne          1175
	//* 574 1156:iload_1         
	//* 575 1157:ldc2            #476 <String "TCON">
	//* 576 1160:aload_0         
	//* 577 1161:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 578 1164:astore          7
	//* 579 1166:aload_0         
	//* 580 1167:iload           5
	//* 581 1169:invokevirtual   #492 <Method void bno.c(int)>
	//* 582 1172:aload           7
	//* 583 1174:areturn         
	//* 584 1175:iload_2         
	//* 585 1176:getstatic       #99  <Field int n>
	//* 586 1179:icmpne          1201
	//* 587 1182:iload_1         
	//* 588 1183:ldc2            #620 <String "TIT1">
	//* 589 1186:aload_0         
	//* 590 1187:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 591 1190:astore          7
	//* 592 1192:aload_0         
	//* 593 1193:iload           5
	//* 594 1195:invokevirtual   #492 <Method void bno.c(int)>
	//* 595 1198:aload           7
	//* 596 1200:areturn         
	//* 597 1201:iload_1         
	//* 598 1202:invokestatic    #592 <Method String bgj.c(int)>
	//* 599 1205:invokestatic    #596 <Method String String.valueOf(Object)>
	//* 600 1208:astore          7
	//* 601 1210:aload           7
	//* 602 1212:invokevirtual   #599 <Method int String.length()>
	//* 603 1215:ifeq            1231
	//* 604 1218:ldc2            #622 <String "Skipped unknown metadata entry: ">
	//* 605 1221:aload           7
	//* 606 1223:invokevirtual   #605 <Method String String.concat(String)>
	//* 607 1226:astore          7
	//* 608 1228:goto            1243
	//* 609 1231:new             #161 <Class String>
	//* 610 1234:dup             
	//* 611 1235:ldc2            #622 <String "Skipped unknown metadata entry: ">
	//* 612 1238:invokespecial   #608 <Method void String(String)>
	//* 613 1241:astore          7
	//* 614 1243:ldc2            #482 <String "MetadataUtil">
	//* 615 1246:aload           7
	//* 616 1248:invokestatic    #624 <Method int Log.d(String, String)>
	//* 617 1251:pop             
	//* 618 1252:aload_0         
	//* 619 1253:iload           5
	//* 620 1255:invokevirtual   #492 <Method void bno.c(int)>
	//* 621 1258:aconst_null     
	//* 622 1259:areturn         
	//* 623 1260:iload_1         
	//* 624 1261:ldc2            #626 <String "TCOM">
	//* 625 1264:aload_0         
	//* 626 1265:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 627 1268:astore          7
	//* 628 1270:aload_0         
	//* 629 1271:iload           5
	//* 630 1273:invokevirtual   #492 <Method void bno.c(int)>
	//* 631 1276:aload           7
	//* 632 1278:areturn         
	//* 633 1279:iload_1         
	//* 634 1280:ldc2            #628 <String "TIT2">
	//* 635 1283:aload_0         
	//* 636 1284:invokestatic    #549 <Method zzkq a(int, String, bno)>
	//* 637 1287:astore          7
	//* 638 1289:aload_0         
	//* 639 1290:iload           5
	//* 640 1292:invokevirtual   #492 <Method void bno.c(int)>
	//* 641 1295:aload           7
	//* 642 1297:areturn         
	//* 643 1298:astore          7
	//* 644 1300:aload_0         
	//* 645 1301:iload           5
	//* 646 1303:invokevirtual   #492 <Method void bno.c(int)>
	//* 647 1306:aload           7
	//* 648 1308:athrow          
	//* 649 1309:aconst_null     
	//* 650 1310:astore          7
	//* 651 1312:goto            83
		if(j1 == 14)
	//* 652 1315:iload_2         
	//* 653 1316:bipush          14
	//* 654 1318:icmpne          1329
			obj = "image/png";
	//  655 1321:ldc2            #630 <String "image/png">
	//  656 1324:astore          7
		else
	//* 657 1326:goto            280
			obj = null;
	//  658 1329:aconst_null     
	//  659 1330:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_331;
		obj = ((Object) (new StringBuilder(41)));
		((StringBuilder) (obj)).append("Unrecognized cover art flags: ");
		((StringBuilder) (obj)).append(j1);
		Log.w("MetadataUtil", ((StringBuilder) (obj)).toString());
		obj = ((Object) (abyte0));
		break MISSING_BLOCK_LABEL_386;
		bno1.d(4);
		abyte0 = new byte[i1 - 16];
		bno1.a(abyte0, 0, abyte0.length);
		obj = ((Object) (new zzkk(((String) (obj)), ((String) (null)), 3, abyte0)));
		break MISSING_BLOCK_LABEL_386;
		Log.w("MetadataUtil", "Failed to parse cover art attribute");
		obj = ((Object) (abyte0));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != s)
			break MISSING_BLOCK_LABEL_421;
		obj = ((Object) (a(i1, "TPE2", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != t)
			break MISSING_BLOCK_LABEL_447;
		obj = ((Object) (a(i1, "TSOT", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != u)
			break MISSING_BLOCK_LABEL_473;
		obj = ((Object) (a(i1, "TSO2", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != v)
			break MISSING_BLOCK_LABEL_499;
		obj = ((Object) (a(i1, "TSOA", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != w)
			break MISSING_BLOCK_LABEL_525;
		obj = ((Object) (a(i1, "TSOP", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != x)
			break MISSING_BLOCK_LABEL_551;
		obj = ((Object) (a(i1, "TSOC", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != y)
			break MISSING_BLOCK_LABEL_579;
		obj = ((Object) (a(i1, "ITUNESADVISORY", bno1, false, false)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != z)
			break MISSING_BLOCK_LABEL_607;
		obj = ((Object) (a(i1, "ITUNESGAPLESS", bno1, false, true)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != A)
			break MISSING_BLOCK_LABEL_633;
		obj = ((Object) (a(i1, "TVSHOWSORT", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != B)
			break MISSING_BLOCK_LABEL_659;
		obj = ((Object) (a(i1, "TVSHOW", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(i1 != C) goto _L9; else goto _L8
_L8:
		s1 = null;
		obj = ((Object) (s1));
		j1 = -1;
		i1 = -1;
_L11:
		if(bno1.d() >= i2)
			break; /* Loop/switch isn't completed */
		l1 = bno1.d();
		k1 = bno1.l();
		j2 = bno1.l();
		bno1.d(4);
		if(j2 == bgj.aC)
		{
			s1 = bno1.e(k1 - 12);
			continue; /* Loop/switch isn't completed */
		}
		if(j2 == bgj.aD)
		{
			obj = ((Object) (bno1.e(k1 - 12)));
			continue; /* Loop/switch isn't completed */
		}
		if(j2 == bgj.aE)
		{
			j1 = l1;
			i1 = k1;
		}
		bno1.d(k1 - 12);
		if(true) goto _L11; else goto _L10
_L10:
		zzkm1 = ((zzkm) (obj1));
		if(!"com.apple.iTunes".equals(((Object) (s1))))
			break MISSING_BLOCK_LABEL_849;
		zzkm1 = ((zzkm) (obj1));
		if(!"iTunSMPB".equals(obj))
			break MISSING_BLOCK_LABEL_849;
		if(j1 == -1)
		{
			zzkm1 = ((zzkm) (obj1));
			break MISSING_BLOCK_LABEL_849;
		}
		bno1.c(j1);
		bno1.d(16);
		zzkm1 = new zzkm("und", ((String) (obj)), bno1.e(i1 - 16));
		bno1.c(i2);
		return ((zzki.zza) (zzkm1));
_L1:
		j1 = 0xffffff & i1;
		if(j1 != c)
			break MISSING_BLOCK_LABEL_985;
		j1 = bno1.l();
		if(bno1.l() == bgj.aE)
		{
			bno1.d(8);
			obj = ((Object) (bno1.e(j1 - 16)));
			obj = ((Object) (new zzkm("und", ((String) (obj)), ((String) (obj)))));
			break MISSING_BLOCK_LABEL_976;
		}
		obj = ((Object) (String.valueOf(((Object) (bgj.c(i1))))));
		if(((String) (obj)).length() != 0)
		{
			obj = ((Object) ("Failed to parse comment attribute: ".concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_963;
		}
		obj = ((Object) (new String("Failed to parse comment attribute: ")));
		Log.w("MetadataUtil", ((String) (obj)));
		obj = ((Object) (zzkm1));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != a && j1 != b) goto _L13; else goto _L12
_L13:
		if(j1 != h && j1 != i) goto _L15; else goto _L14
_L15:
		if(j1 != d)
			break MISSING_BLOCK_LABEL_1045;
		obj = ((Object) (a(i1, "TDRC", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != e)
			break MISSING_BLOCK_LABEL_1071;
		obj = ((Object) (a(i1, "TPE1", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != f)
			break MISSING_BLOCK_LABEL_1097;
		obj = ((Object) (a(i1, "TSSE", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != g)
			break MISSING_BLOCK_LABEL_1123;
		obj = ((Object) (a(i1, "TALB", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != j)
			break MISSING_BLOCK_LABEL_1149;
		obj = ((Object) (a(i1, "USLT", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != k)
			break MISSING_BLOCK_LABEL_1175;
		obj = ((Object) (a(i1, "TCON", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		if(j1 != n) goto _L9; else goto _L16
_L16:
		obj = ((Object) (a(i1, "TIT1", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
_L9:
		obj = ((Object) (String.valueOf(((Object) (bgj.c(i1))))));
		if(((String) (obj)).length() != 0)
		{
			obj = ((Object) ("Skipped unknown metadata entry: ".concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_1243;
		}
		obj = ((Object) (new String("Skipped unknown metadata entry: ")));
		Log.d("MetadataUtil", ((String) (obj)));
		bno1.c(i2);
		return null;
_L14:
		obj = ((Object) (a(i1, "TCOM", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
_L12:
		obj = ((Object) (a(i1, "TIT2", bno1)));
		bno1.c(i2);
		return ((zzki.zza) (obj));
		obj;
		bno1.c(i2);
		throw obj;
_L6:
		obj = null;
		if(true) goto _L18; else goto _L17
_L17:
	//* 660 1332:goto            280
	}

	private static zzkp a(int i1, String s1, bno bno1, boolean flag, boolean flag1)
	{
		int k1 = b(bno1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #472 <Method int b(bno)>
	//    2    4:istore          6
		int j1 = k1;
	//    3    6:iload           6
	//    4    8:istore          5
		if(flag1)
	//*   5   10:iload           4
	//*   6   12:ifeq            23
			j1 = Math.min(1, k1);
	//    7   15:iconst_1        
	//    8   16:iload           6
	//    9   18:invokestatic    #636 <Method int Math.min(int, int)>
	//   10   21:istore          5
		if(j1 >= 0)
	//*  11   23:iload           5
	//*  12   25:iflt            64
			if(flag)
	//*  13   28:iload_3         
	//*  14   29:ifeq            47
				return ((zzkp) (new zzkq(s1, ((String) (null)), Integer.toString(j1))));
	//   15   32:new             #474 <Class zzkq>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:aconst_null     
	//   19   38:iload           5
	//   20   40:invokestatic    #640 <Method String Integer.toString(int)>
	//   21   43:invokespecial   #480 <Method void zzkq(String, String, String)>
	//   22   46:areturn         
			else
				return ((zzkp) (new zzkm("und", s1, Integer.toString(j1))));
	//   23   47:new             #586 <Class zzkm>
	//   24   50:dup             
	//   25   51:ldc2            #588 <String "und">
	//   26   54:aload_1         
	//   27   55:iload           5
	//   28   57:invokestatic    #640 <Method String Integer.toString(int)>
	//   29   60:invokespecial   #589 <Method void zzkm(String, String, String)>
	//   30   63:areturn         
		s1 = String.valueOf(((Object) (bgj.c(i1))));
	//   31   64:iload_0         
	//   32   65:invokestatic    #592 <Method String bgj.c(int)>
	//   33   68:invokestatic    #596 <Method String String.valueOf(Object)>
	//   34   71:astore_1        
		if(s1.length() != 0)
	//*  35   72:aload_1         
	//*  36   73:invokevirtual   #599 <Method int String.length()>
	//*  37   76:ifeq            90
			s1 = "Failed to parse uint8 attribute: ".concat(s1);
	//   38   79:ldc2            #642 <String "Failed to parse uint8 attribute: ">
	//   39   82:aload_1         
	//   40   83:invokevirtual   #605 <Method String String.concat(String)>
	//   41   86:astore_1        
		else
	//*  42   87:goto            101
			s1 = new String("Failed to parse uint8 attribute: ");
	//   43   90:new             #161 <Class String>
	//   44   93:dup             
	//   45   94:ldc2            #642 <String "Failed to parse uint8 attribute: ">
	//   46   97:invokespecial   #608 <Method void String(String)>
	//   47  100:astore_1        
		Log.w("MetadataUtil", s1);
	//   48  101:ldc2            #482 <String "MetadataUtil">
	//   49  104:aload_1         
	//   50  105:invokestatic    #489 <Method int Log.w(String, String)>
	//   51  108:pop             
		return null;
	//   52  109:aconst_null     
	//   53  110:areturn         
	}

	private static zzkq a(int i1, String s1, bno bno1)
	{
		int j1 = bno1.l();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #468 <Method int bno.l()>
	//    2    4:istore_3        
		if(bno1.l() == bgj.aE)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #468 <Method int bno.l()>
	//*   5    9:getstatic       #511 <Field int bgj.aE>
	//*   6   12:icmpne          39
		{
			bno1.d(8);
	//    7   15:aload_2         
	//    8   16:bipush          8
	//    9   18:invokevirtual   #535 <Method void bno.d(int)>
			return new zzkq(s1, ((String) (null)), bno1.e(j1 - 16));
	//   10   21:new             #474 <Class zzkq>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:aconst_null     
	//   14   27:aload_2         
	//   15   28:iload_3         
	//   16   29:bipush          16
	//   17   31:isub            
	//   18   32:invokevirtual   #573 <Method String bno.e(int)>
	//   19   35:invokespecial   #480 <Method void zzkq(String, String, String)>
	//   20   38:areturn         
		}
		s1 = String.valueOf(((Object) (bgj.c(i1))));
	//   21   39:iload_0         
	//   22   40:invokestatic    #592 <Method String bgj.c(int)>
	//   23   43:invokestatic    #596 <Method String String.valueOf(Object)>
	//   24   46:astore_1        
		if(s1.length() != 0)
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #599 <Method int String.length()>
	//*  27   51:ifeq            65
			s1 = "Failed to parse text attribute: ".concat(s1);
	//   28   54:ldc2            #644 <String "Failed to parse text attribute: ">
	//   29   57:aload_1         
	//   30   58:invokevirtual   #605 <Method String String.concat(String)>
	//   31   61:astore_1        
		else
	//*  32   62:goto            76
			s1 = new String("Failed to parse text attribute: ");
	//   33   65:new             #161 <Class String>
	//   34   68:dup             
	//   35   69:ldc2            #644 <String "Failed to parse text attribute: ">
	//   36   72:invokespecial   #608 <Method void String(String)>
	//   37   75:astore_1        
		Log.w("MetadataUtil", s1);
	//   38   76:ldc2            #482 <String "MetadataUtil">
	//   39   79:aload_1         
	//   40   80:invokestatic    #489 <Method int Log.w(String, String)>
	//   41   83:pop             
		return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
	}

	private static int b(bno bno1)
	{
		bno1.d(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #535 <Method void bno.d(int)>
		if(bno1.l() == bgj.aE)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #468 <Method int bno.l()>
	//*   5    9:getstatic       #511 <Field int bgj.aE>
	//*   6   12:icmpne          26
		{
			bno1.d(8);
	//    7   15:aload_0         
	//    8   16:bipush          8
	//    9   18:invokevirtual   #535 <Method void bno.d(int)>
			return bno1.f();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #646 <Method int bno.f()>
	//   12   25:ireturn         
		} else
		{
			Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
	//   13   26:ldc2            #482 <String "MetadataUtil">
	//   14   29:ldc2            #648 <String "Failed to parse uint8 attribute value">
	//   15   32:invokestatic    #489 <Method int Log.w(String, String)>
	//   16   35:pop             
			return -1;
	//   17   36:iconst_m1       
	//   18   37:ireturn         
		}
	}

	private static zzkq b(int i1, String s1, bno bno1)
	{
		int j1 = bno1.l();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #468 <Method int bno.l()>
	//    2    4:istore_3        
		if(bno1.l() == bgj.aE && j1 >= 22)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #468 <Method int bno.l()>
	//*   5    9:getstatic       #511 <Field int bgj.aE>
	//*   6   12:icmpne          138
	//*   7   15:iload_3         
	//*   8   16:bipush          22
	//*   9   18:icmplt          138
		{
			bno1.d(10);
	//   10   21:aload_2         
	//   11   22:bipush          10
	//   12   24:invokevirtual   #535 <Method void bno.d(int)>
			int k1 = bno1.g();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #650 <Method int bno.g()>
	//   15   31:istore_3        
			if(k1 > 0)
	//*  16   32:iload_3         
	//*  17   33:ifle            138
			{
				Object obj = ((Object) (new StringBuilder(11)));
	//   18   36:new             #518 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:bipush          11
	//   21   42:invokespecial   #520 <Method void StringBuilder(int)>
	//   22   45:astore          4
				((StringBuilder) (obj)).append(k1);
	//   23   47:aload           4
	//   24   49:iload_3         
	//   25   50:invokevirtual   #529 <Method StringBuilder StringBuilder.append(int)>
	//   26   53:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   27   54:aload           4
	//   28   56:invokevirtual   #533 <Method String StringBuilder.toString()>
	//   29   59:astore          4
				i1 = bno1.g();
	//   30   61:aload_2         
	//   31   62:invokevirtual   #650 <Method int bno.g()>
	//   32   65:istore_0        
				bno1 = ((bno) (obj));
	//   33   66:aload           4
	//   34   68:astore_2        
				if(i1 > 0)
	//*  35   69:iload_0         
	//*  36   70:ifle            127
				{
					bno1 = ((bno) (String.valueOf(obj)));
	//   37   73:aload           4
	//   38   75:invokestatic    #596 <Method String String.valueOf(Object)>
	//   39   78:astore_2        
					obj = ((Object) (new StringBuilder(String.valueOf(((Object) (bno1))).length() + 12)));
	//   40   79:new             #518 <Class StringBuilder>
	//   41   82:dup             
	//   42   83:aload_2         
	//   43   84:invokestatic    #596 <Method String String.valueOf(Object)>
	//   44   87:invokevirtual   #599 <Method int String.length()>
	//   45   90:bipush          12
	//   46   92:iadd            
	//   47   93:invokespecial   #520 <Method void StringBuilder(int)>
	//   48   96:astore          4
					((StringBuilder) (obj)).append(((String) (bno1)));
	//   49   98:aload           4
	//   50  100:aload_2         
	//   51  101:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
	//   52  104:pop             
					((StringBuilder) (obj)).append("/");
	//   53  105:aload           4
	//   54  107:ldc2            #652 <String "/">
	//   55  110:invokevirtual   #526 <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
					((StringBuilder) (obj)).append(i1);
	//   57  114:aload           4
	//   58  116:iload_0         
	//   59  117:invokevirtual   #529 <Method StringBuilder StringBuilder.append(int)>
	//   60  120:pop             
					bno1 = ((bno) (((StringBuilder) (obj)).toString()));
	//   61  121:aload           4
	//   62  123:invokevirtual   #533 <Method String StringBuilder.toString()>
	//   63  126:astore_2        
				}
				return new zzkq(s1, ((String) (null)), ((String) (bno1)));
	//   64  127:new             #474 <Class zzkq>
	//   65  130:dup             
	//   66  131:aload_1         
	//   67  132:aconst_null     
	//   68  133:aload_2         
	//   69  134:invokespecial   #480 <Method void zzkq(String, String, String)>
	//   70  137:areturn         
			}
		}
		s1 = String.valueOf(((Object) (bgj.c(i1))));
	//   71  138:iload_0         
	//   72  139:invokestatic    #592 <Method String bgj.c(int)>
	//   73  142:invokestatic    #596 <Method String String.valueOf(Object)>
	//   74  145:astore_1        
		if(s1.length() != 0)
	//*  75  146:aload_1         
	//*  76  147:invokevirtual   #599 <Method int String.length()>
	//*  77  150:ifeq            164
			s1 = "Failed to parse index/count attribute: ".concat(s1);
	//   78  153:ldc2            #654 <String "Failed to parse index/count attribute: ">
	//   79  156:aload_1         
	//   80  157:invokevirtual   #605 <Method String String.concat(String)>
	//   81  160:astore_1        
		else
	//*  82  161:goto            175
			s1 = new String("Failed to parse index/count attribute: ");
	//   83  164:new             #161 <Class String>
	//   84  167:dup             
	//   85  168:ldc2            #654 <String "Failed to parse index/count attribute: ">
	//   86  171:invokespecial   #608 <Method void String(String)>
	//   87  174:astore_1        
		Log.w("MetadataUtil", s1);
	//   88  175:ldc2            #482 <String "MetadataUtil">
	//   89  178:aload_1         
	//   90  179:invokestatic    #489 <Method int Log.w(String, String)>
	//   91  182:pop             
		return null;
	//   92  183:aconst_null     
	//   93  184:areturn         
	}

	private static final int A = bnw.f("sosn");
	private static final int B = bnw.f("tvsh");
	private static final int C = bnw.f("----");
	private static final String D[] = {
		"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", 
		"New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", 
		"Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", 
		"Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", 
		"AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", 
		"Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", 
		"Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", 
		"Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", 
		"Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", 
		"Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", 
		"Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", 
		"Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", 
		"Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", 
		"Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", 
		"Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"
	};
	private static final int a = bnw.f("nam");
	private static final int b = bnw.f("trk");
	private static final int c = bnw.f("cmt");
	private static final int d = bnw.f("day");
	private static final int e = bnw.f("ART");
	private static final int f = bnw.f("too");
	private static final int g = bnw.f("alb");
	private static final int h = bnw.f("com");
	private static final int i = bnw.f("wrt");
	private static final int j = bnw.f("lyr");
	private static final int k = bnw.f("gen");
	private static final int l = bnw.f("covr");
	private static final int m = bnw.f("gnre");
	private static final int n = bnw.f("grp");
	private static final int o = bnw.f("disk");
	private static final int p = bnw.f("trkn");
	private static final int q = bnw.f("tmpo");
	private static final int r = bnw.f("cpil");
	private static final int s = bnw.f("aART");
	private static final int t = bnw.f("sonm");
	private static final int u = bnw.f("soal");
	private static final int v = bnw.f("soar");
	private static final int w = bnw.f("soaa");
	private static final int x = bnw.f("soco");
	private static final int y = bnw.f("rtng");
	private static final int z = bnw.f("pgap");

	static 
	{
	//    0    0:ldc1            #40  <String "nam">
	//    1    2:invokestatic    #45  <Method int bnw.f(String)>
	//    2    5:putstatic       #47  <Field int a>
	//    3    8:ldc1            #49  <String "trk">
	//    4   10:invokestatic    #45  <Method int bnw.f(String)>
	//    5   13:putstatic       #51  <Field int b>
	//    6   16:ldc1            #53  <String "cmt">
	//    7   18:invokestatic    #45  <Method int bnw.f(String)>
	//    8   21:putstatic       #55  <Field int c>
	//    9   24:ldc1            #57  <String "day">
	//   10   26:invokestatic    #45  <Method int bnw.f(String)>
	//   11   29:putstatic       #59  <Field int d>
	//   12   32:ldc1            #61  <String "ART">
	//   13   34:invokestatic    #45  <Method int bnw.f(String)>
	//   14   37:putstatic       #63  <Field int e>
	//   15   40:ldc1            #65  <String "too">
	//   16   42:invokestatic    #45  <Method int bnw.f(String)>
	//   17   45:putstatic       #67  <Field int f>
	//   18   48:ldc1            #69  <String "alb">
	//   19   50:invokestatic    #45  <Method int bnw.f(String)>
	//   20   53:putstatic       #71  <Field int g>
	//   21   56:ldc1            #73  <String "com">
	//   22   58:invokestatic    #45  <Method int bnw.f(String)>
	//   23   61:putstatic       #75  <Field int h>
	//   24   64:ldc1            #77  <String "wrt">
	//   25   66:invokestatic    #45  <Method int bnw.f(String)>
	//   26   69:putstatic       #79  <Field int i>
	//   27   72:ldc1            #81  <String "lyr">
	//   28   74:invokestatic    #45  <Method int bnw.f(String)>
	//   29   77:putstatic       #83  <Field int j>
	//   30   80:ldc1            #85  <String "gen">
	//   31   82:invokestatic    #45  <Method int bnw.f(String)>
	//   32   85:putstatic       #87  <Field int k>
	//   33   88:ldc1            #89  <String "covr">
	//   34   90:invokestatic    #45  <Method int bnw.f(String)>
	//   35   93:putstatic       #91  <Field int l>
	//   36   96:ldc1            #93  <String "gnre">
	//   37   98:invokestatic    #45  <Method int bnw.f(String)>
	//   38  101:putstatic       #95  <Field int m>
	//   39  104:ldc1            #97  <String "grp">
	//   40  106:invokestatic    #45  <Method int bnw.f(String)>
	//   41  109:putstatic       #99  <Field int n>
	//   42  112:ldc1            #101 <String "disk">
	//   43  114:invokestatic    #45  <Method int bnw.f(String)>
	//   44  117:putstatic       #103 <Field int o>
	//   45  120:ldc1            #105 <String "trkn">
	//   46  122:invokestatic    #45  <Method int bnw.f(String)>
	//   47  125:putstatic       #107 <Field int p>
	//   48  128:ldc1            #109 <String "tmpo">
	//   49  130:invokestatic    #45  <Method int bnw.f(String)>
	//   50  133:putstatic       #111 <Field int q>
	//   51  136:ldc1            #113 <String "cpil">
	//   52  138:invokestatic    #45  <Method int bnw.f(String)>
	//   53  141:putstatic       #115 <Field int r>
	//   54  144:ldc1            #117 <String "aART">
	//   55  146:invokestatic    #45  <Method int bnw.f(String)>
	//   56  149:putstatic       #119 <Field int s>
	//   57  152:ldc1            #121 <String "sonm">
	//   58  154:invokestatic    #45  <Method int bnw.f(String)>
	//   59  157:putstatic       #123 <Field int t>
	//   60  160:ldc1            #125 <String "soal">
	//   61  162:invokestatic    #45  <Method int bnw.f(String)>
	//   62  165:putstatic       #127 <Field int u>
	//   63  168:ldc1            #129 <String "soar">
	//   64  170:invokestatic    #45  <Method int bnw.f(String)>
	//   65  173:putstatic       #131 <Field int v>
	//   66  176:ldc1            #133 <String "soaa">
	//   67  178:invokestatic    #45  <Method int bnw.f(String)>
	//   68  181:putstatic       #135 <Field int w>
	//   69  184:ldc1            #137 <String "soco">
	//   70  186:invokestatic    #45  <Method int bnw.f(String)>
	//   71  189:putstatic       #139 <Field int x>
	//   72  192:ldc1            #141 <String "rtng">
	//   73  194:invokestatic    #45  <Method int bnw.f(String)>
	//   74  197:putstatic       #143 <Field int y>
	//   75  200:ldc1            #145 <String "pgap">
	//   76  202:invokestatic    #45  <Method int bnw.f(String)>
	//   77  205:putstatic       #147 <Field int z>
	//   78  208:ldc1            #149 <String "sosn">
	//   79  210:invokestatic    #45  <Method int bnw.f(String)>
	//   80  213:putstatic       #151 <Field int A>
	//   81  216:ldc1            #153 <String "tvsh">
	//   82  218:invokestatic    #45  <Method int bnw.f(String)>
	//   83  221:putstatic       #155 <Field int B>
	//   84  224:ldc1            #157 <String "----">
	//   85  226:invokestatic    #45  <Method int bnw.f(String)>
	//   86  229:putstatic       #159 <Field int C>
	//   87  232:sipush          148
	//   88  235:anewarray       String[]
	//   89  238:dup             
	//   90  239:iconst_0        
	//   91  240:ldc1            #163 <String "Blues">
	//   92  242:aastore         
	//   93  243:dup             
	//   94  244:iconst_1        
	//   95  245:ldc1            #165 <String "Classic Rock">
	//   96  247:aastore         
	//   97  248:dup             
	//   98  249:iconst_2        
	//   99  250:ldc1            #167 <String "Country">
	//  100  252:aastore         
	//  101  253:dup             
	//  102  254:iconst_3        
	//  103  255:ldc1            #169 <String "Dance">
	//  104  257:aastore         
	//  105  258:dup             
	//  106  259:iconst_4        
	//  107  260:ldc1            #171 <String "Disco">
	//  108  262:aastore         
	//  109  263:dup             
	//  110  264:iconst_5        
	//  111  265:ldc1            #173 <String "Funk">
	//  112  267:aastore         
	//  113  268:dup             
	//  114  269:bipush          6
	//  115  271:ldc1            #175 <String "Grunge">
	//  116  273:aastore         
	//  117  274:dup             
	//  118  275:bipush          7
	//  119  277:ldc1            #177 <String "Hip-Hop">
	//  120  279:aastore         
	//  121  280:dup             
	//  122  281:bipush          8
	//  123  283:ldc1            #179 <String "Jazz">
	//  124  285:aastore         
	//  125  286:dup             
	//  126  287:bipush          9
	//  127  289:ldc1            #181 <String "Metal">
	//  128  291:aastore         
	//  129  292:dup             
	//  130  293:bipush          10
	//  131  295:ldc1            #183 <String "New Age">
	//  132  297:aastore         
	//  133  298:dup             
	//  134  299:bipush          11
	//  135  301:ldc1            #185 <String "Oldies">
	//  136  303:aastore         
	//  137  304:dup             
	//  138  305:bipush          12
	//  139  307:ldc1            #187 <String "Other">
	//  140  309:aastore         
	//  141  310:dup             
	//  142  311:bipush          13
	//  143  313:ldc1            #189 <String "Pop">
	//  144  315:aastore         
	//  145  316:dup             
	//  146  317:bipush          14
	//  147  319:ldc1            #191 <String "R&B">
	//  148  321:aastore         
	//  149  322:dup             
	//  150  323:bipush          15
	//  151  325:ldc1            #193 <String "Rap">
	//  152  327:aastore         
	//  153  328:dup             
	//  154  329:bipush          16
	//  155  331:ldc1            #195 <String "Reggae">
	//  156  333:aastore         
	//  157  334:dup             
	//  158  335:bipush          17
	//  159  337:ldc1            #197 <String "Rock">
	//  160  339:aastore         
	//  161  340:dup             
	//  162  341:bipush          18
	//  163  343:ldc1            #199 <String "Techno">
	//  164  345:aastore         
	//  165  346:dup             
	//  166  347:bipush          19
	//  167  349:ldc1            #201 <String "Industrial">
	//  168  351:aastore         
	//  169  352:dup             
	//  170  353:bipush          20
	//  171  355:ldc1            #203 <String "Alternative">
	//  172  357:aastore         
	//  173  358:dup             
	//  174  359:bipush          21
	//  175  361:ldc1            #205 <String "Ska">
	//  176  363:aastore         
	//  177  364:dup             
	//  178  365:bipush          22
	//  179  367:ldc1            #207 <String "Death Metal">
	//  180  369:aastore         
	//  181  370:dup             
	//  182  371:bipush          23
	//  183  373:ldc1            #209 <String "Pranks">
	//  184  375:aastore         
	//  185  376:dup             
	//  186  377:bipush          24
	//  187  379:ldc1            #211 <String "Soundtrack">
	//  188  381:aastore         
	//  189  382:dup             
	//  190  383:bipush          25
	//  191  385:ldc1            #213 <String "Euro-Techno">
	//  192  387:aastore         
	//  193  388:dup             
	//  194  389:bipush          26
	//  195  391:ldc1            #215 <String "Ambient">
	//  196  393:aastore         
	//  197  394:dup             
	//  198  395:bipush          27
	//  199  397:ldc1            #217 <String "Trip-Hop">
	//  200  399:aastore         
	//  201  400:dup             
	//  202  401:bipush          28
	//  203  403:ldc1            #219 <String "Vocal">
	//  204  405:aastore         
	//  205  406:dup             
	//  206  407:bipush          29
	//  207  409:ldc1            #221 <String "Jazz+Funk">
	//  208  411:aastore         
	//  209  412:dup             
	//  210  413:bipush          30
	//  211  415:ldc1            #223 <String "Fusion">
	//  212  417:aastore         
	//  213  418:dup             
	//  214  419:bipush          31
	//  215  421:ldc1            #225 <String "Trance">
	//  216  423:aastore         
	//  217  424:dup             
	//  218  425:bipush          32
	//  219  427:ldc1            #227 <String "Classical">
	//  220  429:aastore         
	//  221  430:dup             
	//  222  431:bipush          33
	//  223  433:ldc1            #229 <String "Instrumental">
	//  224  435:aastore         
	//  225  436:dup             
	//  226  437:bipush          34
	//  227  439:ldc1            #231 <String "Acid">
	//  228  441:aastore         
	//  229  442:dup             
	//  230  443:bipush          35
	//  231  445:ldc1            #233 <String "House">
	//  232  447:aastore         
	//  233  448:dup             
	//  234  449:bipush          36
	//  235  451:ldc1            #235 <String "Game">
	//  236  453:aastore         
	//  237  454:dup             
	//  238  455:bipush          37
	//  239  457:ldc1            #237 <String "Sound Clip">
	//  240  459:aastore         
	//  241  460:dup             
	//  242  461:bipush          38
	//  243  463:ldc1            #239 <String "Gospel">
	//  244  465:aastore         
	//  245  466:dup             
	//  246  467:bipush          39
	//  247  469:ldc1            #241 <String "Noise">
	//  248  471:aastore         
	//  249  472:dup             
	//  250  473:bipush          40
	//  251  475:ldc1            #243 <String "AlternRock">
	//  252  477:aastore         
	//  253  478:dup             
	//  254  479:bipush          41
	//  255  481:ldc1            #245 <String "Bass">
	//  256  483:aastore         
	//  257  484:dup             
	//  258  485:bipush          42
	//  259  487:ldc1            #247 <String "Soul">
	//  260  489:aastore         
	//  261  490:dup             
	//  262  491:bipush          43
	//  263  493:ldc1            #249 <String "Punk">
	//  264  495:aastore         
	//  265  496:dup             
	//  266  497:bipush          44
	//  267  499:ldc1            #251 <String "Space">
	//  268  501:aastore         
	//  269  502:dup             
	//  270  503:bipush          45
	//  271  505:ldc1            #253 <String "Meditative">
	//  272  507:aastore         
	//  273  508:dup             
	//  274  509:bipush          46
	//  275  511:ldc1            #255 <String "Instrumental Pop">
	//  276  513:aastore         
	//  277  514:dup             
	//  278  515:bipush          47
	//  279  517:ldc2            #257 <String "Instrumental Rock">
	//  280  520:aastore         
	//  281  521:dup             
	//  282  522:bipush          48
	//  283  524:ldc2            #259 <String "Ethnic">
	//  284  527:aastore         
	//  285  528:dup             
	//  286  529:bipush          49
	//  287  531:ldc2            #261 <String "Gothic">
	//  288  534:aastore         
	//  289  535:dup             
	//  290  536:bipush          50
	//  291  538:ldc2            #263 <String "Darkwave">
	//  292  541:aastore         
	//  293  542:dup             
	//  294  543:bipush          51
	//  295  545:ldc2            #265 <String "Techno-Industrial">
	//  296  548:aastore         
	//  297  549:dup             
	//  298  550:bipush          52
	//  299  552:ldc2            #267 <String "Electronic">
	//  300  555:aastore         
	//  301  556:dup             
	//  302  557:bipush          53
	//  303  559:ldc2            #269 <String "Pop-Folk">
	//  304  562:aastore         
	//  305  563:dup             
	//  306  564:bipush          54
	//  307  566:ldc2            #271 <String "Eurodance">
	//  308  569:aastore         
	//  309  570:dup             
	//  310  571:bipush          55
	//  311  573:ldc2            #273 <String "Dream">
	//  312  576:aastore         
	//  313  577:dup             
	//  314  578:bipush          56
	//  315  580:ldc2            #275 <String "Southern Rock">
	//  316  583:aastore         
	//  317  584:dup             
	//  318  585:bipush          57
	//  319  587:ldc2            #277 <String "Comedy">
	//  320  590:aastore         
	//  321  591:dup             
	//  322  592:bipush          58
	//  323  594:ldc2            #279 <String "Cult">
	//  324  597:aastore         
	//  325  598:dup             
	//  326  599:bipush          59
	//  327  601:ldc2            #281 <String "Gangsta">
	//  328  604:aastore         
	//  329  605:dup             
	//  330  606:bipush          60
	//  331  608:ldc2            #283 <String "Top 40">
	//  332  611:aastore         
	//  333  612:dup             
	//  334  613:bipush          61
	//  335  615:ldc2            #285 <String "Christian Rap">
	//  336  618:aastore         
	//  337  619:dup             
	//  338  620:bipush          62
	//  339  622:ldc2            #287 <String "Pop/Funk">
	//  340  625:aastore         
	//  341  626:dup             
	//  342  627:bipush          63
	//  343  629:ldc2            #289 <String "Jungle">
	//  344  632:aastore         
	//  345  633:dup             
	//  346  634:bipush          64
	//  347  636:ldc2            #291 <String "Native American">
	//  348  639:aastore         
	//  349  640:dup             
	//  350  641:bipush          65
	//  351  643:ldc2            #293 <String "Cabaret">
	//  352  646:aastore         
	//  353  647:dup             
	//  354  648:bipush          66
	//  355  650:ldc2            #295 <String "New Wave">
	//  356  653:aastore         
	//  357  654:dup             
	//  358  655:bipush          67
	//  359  657:ldc2            #297 <String "Psychadelic">
	//  360  660:aastore         
	//  361  661:dup             
	//  362  662:bipush          68
	//  363  664:ldc2            #299 <String "Rave">
	//  364  667:aastore         
	//  365  668:dup             
	//  366  669:bipush          69
	//  367  671:ldc2            #301 <String "Showtunes">
	//  368  674:aastore         
	//  369  675:dup             
	//  370  676:bipush          70
	//  371  678:ldc2            #303 <String "Trailer">
	//  372  681:aastore         
	//  373  682:dup             
	//  374  683:bipush          71
	//  375  685:ldc2            #305 <String "Lo-Fi">
	//  376  688:aastore         
	//  377  689:dup             
	//  378  690:bipush          72
	//  379  692:ldc2            #307 <String "Tribal">
	//  380  695:aastore         
	//  381  696:dup             
	//  382  697:bipush          73
	//  383  699:ldc2            #309 <String "Acid Punk">
	//  384  702:aastore         
	//  385  703:dup             
	//  386  704:bipush          74
	//  387  706:ldc2            #311 <String "Acid Jazz">
	//  388  709:aastore         
	//  389  710:dup             
	//  390  711:bipush          75
	//  391  713:ldc2            #313 <String "Polka">
	//  392  716:aastore         
	//  393  717:dup             
	//  394  718:bipush          76
	//  395  720:ldc2            #315 <String "Retro">
	//  396  723:aastore         
	//  397  724:dup             
	//  398  725:bipush          77
	//  399  727:ldc2            #317 <String "Musical">
	//  400  730:aastore         
	//  401  731:dup             
	//  402  732:bipush          78
	//  403  734:ldc2            #319 <String "Rock & Roll">
	//  404  737:aastore         
	//  405  738:dup             
	//  406  739:bipush          79
	//  407  741:ldc2            #321 <String "Hard Rock">
	//  408  744:aastore         
	//  409  745:dup             
	//  410  746:bipush          80
	//  411  748:ldc2            #323 <String "Folk">
	//  412  751:aastore         
	//  413  752:dup             
	//  414  753:bipush          81
	//  415  755:ldc2            #325 <String "Folk-Rock">
	//  416  758:aastore         
	//  417  759:dup             
	//  418  760:bipush          82
	//  419  762:ldc2            #327 <String "National Folk">
	//  420  765:aastore         
	//  421  766:dup             
	//  422  767:bipush          83
	//  423  769:ldc2            #329 <String "Swing">
	//  424  772:aastore         
	//  425  773:dup             
	//  426  774:bipush          84
	//  427  776:ldc2            #331 <String "Fast Fusion">
	//  428  779:aastore         
	//  429  780:dup             
	//  430  781:bipush          85
	//  431  783:ldc2            #333 <String "Bebob">
	//  432  786:aastore         
	//  433  787:dup             
	//  434  788:bipush          86
	//  435  790:ldc2            #335 <String "Latin">
	//  436  793:aastore         
	//  437  794:dup             
	//  438  795:bipush          87
	//  439  797:ldc2            #337 <String "Revival">
	//  440  800:aastore         
	//  441  801:dup             
	//  442  802:bipush          88
	//  443  804:ldc2            #339 <String "Celtic">
	//  444  807:aastore         
	//  445  808:dup             
	//  446  809:bipush          89
	//  447  811:ldc2            #341 <String "Bluegrass">
	//  448  814:aastore         
	//  449  815:dup             
	//  450  816:bipush          90
	//  451  818:ldc2            #343 <String "Avantgarde">
	//  452  821:aastore         
	//  453  822:dup             
	//  454  823:bipush          91
	//  455  825:ldc2            #345 <String "Gothic Rock">
	//  456  828:aastore         
	//  457  829:dup             
	//  458  830:bipush          92
	//  459  832:ldc2            #347 <String "Progressive Rock">
	//  460  835:aastore         
	//  461  836:dup             
	//  462  837:bipush          93
	//  463  839:ldc2            #349 <String "Psychedelic Rock">
	//  464  842:aastore         
	//  465  843:dup             
	//  466  844:bipush          94
	//  467  846:ldc2            #351 <String "Symphonic Rock">
	//  468  849:aastore         
	//  469  850:dup             
	//  470  851:bipush          95
	//  471  853:ldc2            #353 <String "Slow Rock">
	//  472  856:aastore         
	//  473  857:dup             
	//  474  858:bipush          96
	//  475  860:ldc2            #355 <String "Big Band">
	//  476  863:aastore         
	//  477  864:dup             
	//  478  865:bipush          97
	//  479  867:ldc2            #357 <String "Chorus">
	//  480  870:aastore         
	//  481  871:dup             
	//  482  872:bipush          98
	//  483  874:ldc2            #359 <String "Easy Listening">
	//  484  877:aastore         
	//  485  878:dup             
	//  486  879:bipush          99
	//  487  881:ldc2            #361 <String "Acoustic">
	//  488  884:aastore         
	//  489  885:dup             
	//  490  886:bipush          100
	//  491  888:ldc2            #363 <String "Humour">
	//  492  891:aastore         
	//  493  892:dup             
	//  494  893:bipush          101
	//  495  895:ldc2            #365 <String "Speech">
	//  496  898:aastore         
	//  497  899:dup             
	//  498  900:bipush          102
	//  499  902:ldc2            #367 <String "Chanson">
	//  500  905:aastore         
	//  501  906:dup             
	//  502  907:bipush          103
	//  503  909:ldc2            #369 <String "Opera">
	//  504  912:aastore         
	//  505  913:dup             
	//  506  914:bipush          104
	//  507  916:ldc2            #371 <String "Chamber Music">
	//  508  919:aastore         
	//  509  920:dup             
	//  510  921:bipush          105
	//  511  923:ldc2            #373 <String "Sonata">
	//  512  926:aastore         
	//  513  927:dup             
	//  514  928:bipush          106
	//  515  930:ldc2            #375 <String "Symphony">
	//  516  933:aastore         
	//  517  934:dup             
	//  518  935:bipush          107
	//  519  937:ldc2            #377 <String "Booty Bass">
	//  520  940:aastore         
	//  521  941:dup             
	//  522  942:bipush          108
	//  523  944:ldc2            #379 <String "Primus">
	//  524  947:aastore         
	//  525  948:dup             
	//  526  949:bipush          109
	//  527  951:ldc2            #381 <String "Porn Groove">
	//  528  954:aastore         
	//  529  955:dup             
	//  530  956:bipush          110
	//  531  958:ldc2            #383 <String "Satire">
	//  532  961:aastore         
	//  533  962:dup             
	//  534  963:bipush          111
	//  535  965:ldc2            #385 <String "Slow Jam">
	//  536  968:aastore         
	//  537  969:dup             
	//  538  970:bipush          112
	//  539  972:ldc2            #387 <String "Club">
	//  540  975:aastore         
	//  541  976:dup             
	//  542  977:bipush          113
	//  543  979:ldc2            #389 <String "Tango">
	//  544  982:aastore         
	//  545  983:dup             
	//  546  984:bipush          114
	//  547  986:ldc2            #391 <String "Samba">
	//  548  989:aastore         
	//  549  990:dup             
	//  550  991:bipush          115
	//  551  993:ldc2            #393 <String "Folklore">
	//  552  996:aastore         
	//  553  997:dup             
	//  554  998:bipush          116
	//  555 1000:ldc2            #395 <String "Ballad">
	//  556 1003:aastore         
	//  557 1004:dup             
	//  558 1005:bipush          117
	//  559 1007:ldc2            #397 <String "Power Ballad">
	//  560 1010:aastore         
	//  561 1011:dup             
	//  562 1012:bipush          118
	//  563 1014:ldc2            #399 <String "Rhythmic Soul">
	//  564 1017:aastore         
	//  565 1018:dup             
	//  566 1019:bipush          119
	//  567 1021:ldc2            #401 <String "Freestyle">
	//  568 1024:aastore         
	//  569 1025:dup             
	//  570 1026:bipush          120
	//  571 1028:ldc2            #403 <String "Duet">
	//  572 1031:aastore         
	//  573 1032:dup             
	//  574 1033:bipush          121
	//  575 1035:ldc2            #405 <String "Punk Rock">
	//  576 1038:aastore         
	//  577 1039:dup             
	//  578 1040:bipush          122
	//  579 1042:ldc2            #407 <String "Drum Solo">
	//  580 1045:aastore         
	//  581 1046:dup             
	//  582 1047:bipush          123
	//  583 1049:ldc2            #409 <String "A capella">
	//  584 1052:aastore         
	//  585 1053:dup             
	//  586 1054:bipush          124
	//  587 1056:ldc2            #411 <String "Euro-House">
	//  588 1059:aastore         
	//  589 1060:dup             
	//  590 1061:bipush          125
	//  591 1063:ldc2            #413 <String "Dance Hall">
	//  592 1066:aastore         
	//  593 1067:dup             
	//  594 1068:bipush          126
	//  595 1070:ldc2            #415 <String "Goa">
	//  596 1073:aastore         
	//  597 1074:dup             
	//  598 1075:bipush          127
	//  599 1077:ldc2            #417 <String "Drum & Bass">
	//  600 1080:aastore         
	//  601 1081:dup             
	//  602 1082:sipush          128
	//  603 1085:ldc2            #419 <String "Club-House">
	//  604 1088:aastore         
	//  605 1089:dup             
	//  606 1090:sipush          129
	//  607 1093:ldc2            #421 <String "Hardcore">
	//  608 1096:aastore         
	//  609 1097:dup             
	//  610 1098:sipush          130
	//  611 1101:ldc2            #423 <String "Terror">
	//  612 1104:aastore         
	//  613 1105:dup             
	//  614 1106:sipush          131
	//  615 1109:ldc2            #425 <String "Indie">
	//  616 1112:aastore         
	//  617 1113:dup             
	//  618 1114:sipush          132
	//  619 1117:ldc2            #427 <String "BritPop">
	//  620 1120:aastore         
	//  621 1121:dup             
	//  622 1122:sipush          133
	//  623 1125:ldc2            #429 <String "Negerpunk">
	//  624 1128:aastore         
	//  625 1129:dup             
	//  626 1130:sipush          134
	//  627 1133:ldc2            #431 <String "Polsk Punk">
	//  628 1136:aastore         
	//  629 1137:dup             
	//  630 1138:sipush          135
	//  631 1141:ldc2            #433 <String "Beat">
	//  632 1144:aastore         
	//  633 1145:dup             
	//  634 1146:sipush          136
	//  635 1149:ldc2            #435 <String "Christian Gangsta Rap">
	//  636 1152:aastore         
	//  637 1153:dup             
	//  638 1154:sipush          137
	//  639 1157:ldc2            #437 <String "Heavy Metal">
	//  640 1160:aastore         
	//  641 1161:dup             
	//  642 1162:sipush          138
	//  643 1165:ldc2            #439 <String "Black Metal">
	//  644 1168:aastore         
	//  645 1169:dup             
	//  646 1170:sipush          139
	//  647 1173:ldc2            #441 <String "Crossover">
	//  648 1176:aastore         
	//  649 1177:dup             
	//  650 1178:sipush          140
	//  651 1181:ldc2            #443 <String "Contemporary Christian">
	//  652 1184:aastore         
	//  653 1185:dup             
	//  654 1186:sipush          141
	//  655 1189:ldc2            #445 <String "Christian Rock">
	//  656 1192:aastore         
	//  657 1193:dup             
	//  658 1194:sipush          142
	//  659 1197:ldc2            #447 <String "Merengue">
	//  660 1200:aastore         
	//  661 1201:dup             
	//  662 1202:sipush          143
	//  663 1205:ldc2            #449 <String "Salsa">
	//  664 1208:aastore         
	//  665 1209:dup             
	//  666 1210:sipush          144
	//  667 1213:ldc2            #451 <String "Thrash Metal">
	//  668 1216:aastore         
	//  669 1217:dup             
	//  670 1218:sipush          145
	//  671 1221:ldc2            #453 <String "Anime">
	//  672 1224:aastore         
	//  673 1225:dup             
	//  674 1226:sipush          146
	//  675 1229:ldc2            #455 <String "Jpop">
	//  676 1232:aastore         
	//  677 1233:dup             
	//  678 1234:sipush          147
	//  679 1237:ldc2            #457 <String "Synthpop">
	//  680 1240:aastore         
	//  681 1241:putstatic       #459 <Field String[] D>
	//* 682 1244:return          
	}
}
