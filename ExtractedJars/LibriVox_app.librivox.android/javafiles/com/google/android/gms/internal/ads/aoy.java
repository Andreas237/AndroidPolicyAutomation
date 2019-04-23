// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.*;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			apa, apb, apd, aoq, 
//			apf, aoz

public final class aoy
{

	public aoy(ECPublicKey ecpublickey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = ecpublickey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ECPublicKey a>
	//    5    9:return          
	}

	public final aoz a(String s, byte abyte0[], byte abyte1[], int i, apd apd1)
	{
		Object obj;
		Object obj1;
		Object obj2;
		obj1 = ((Object) (apa.a(a.getParams())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ECPublicKey a>
	//    2    4:invokeinterface #25  <Method ECParameterSpec ECPublicKey.getParams()>
	//    3    9:invokestatic    #30  <Method KeyPair apa.a(ECParameterSpec)>
	//    4   12:astore          10
		obj = ((Object) ((ECPublicKey)((KeyPair) (obj1)).getPublic()));
	//    5   14:aload           10
	//    6   16:invokevirtual   #36  <Method java.security.PublicKey KeyPair.getPublic()>
	//    7   19:checkcast       #21  <Class ECPublicKey>
	//    8   22:astore          9
		obj1 = ((Object) ((ECPrivateKey)((KeyPair) (obj1)).getPrivate()));
	//    9   24:aload           10
	//   10   26:invokevirtual   #40  <Method java.security.PrivateKey KeyPair.getPrivate()>
	//   11   29:checkcast       #42  <Class ECPrivateKey>
	//   12   32:astore          10
		obj2 = ((Object) (a));
	//   13   34:aload_0         
	//   14   35:getfield        #13  <Field ECPublicKey a>
	//   15   38:astore          11
		int j;
		int i1;
		ECParameterSpec ecparameterspec = ((ECPublicKey) (obj2)).getParams();
	//   16   40:aload           11
	//   17   42:invokeinterface #25  <Method ECParameterSpec ECPublicKey.getParams()>
	//   18   47:astore          12
		ECParameterSpec ecparameterspec1 = ((ECPrivateKey) (obj1)).getParams();
	//   19   49:aload           10
	//   20   51:invokeinterface #43  <Method ECParameterSpec ECPrivateKey.getParams()>
	//   21   56:astore          13
		if(!ecparameterspec.getCurve().equals(((Object) (ecparameterspec1.getCurve()))) || !ecparameterspec.getGenerator().equals(((Object) (ecparameterspec1.getGenerator()))) || !ecparameterspec.getOrder().equals(((Object) (ecparameterspec1.getOrder()))))
			break MISSING_BLOCK_LABEL_773;
	//   22   58:aload           12
	//   23   60:invokevirtual   #49  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   24   63:aload           13
	//   25   65:invokevirtual   #49  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   26   68:invokevirtual   #55  <Method boolean EllipticCurve.equals(Object)>
	//   27   71:ifeq            773
	//   28   74:aload           12
	//   29   76:invokevirtual   #59  <Method ECPoint ECParameterSpec.getGenerator()>
	//   30   79:aload           13
	//   31   81:invokevirtual   #59  <Method ECPoint ECParameterSpec.getGenerator()>
	//   32   84:invokevirtual   #62  <Method boolean ECPoint.equals(Object)>
	//   33   87:ifeq            773
	//   34   90:aload           12
	//   35   92:invokevirtual   #66  <Method BigInteger ECParameterSpec.getOrder()>
	//   36   95:aload           13
	//   37   97:invokevirtual   #66  <Method BigInteger ECParameterSpec.getOrder()>
	//   38  100:invokevirtual   #69  <Method boolean BigInteger.equals(Object)>
	//   39  103:ifeq            773
		j = ecparameterspec.getCofactor();
	//   40  106:aload           12
	//   41  108:invokevirtual   #73  <Method int ECParameterSpec.getCofactor()>
	//   42  111:istore          6
		i1 = ecparameterspec1.getCofactor();
	//   43  113:aload           13
	//   44  115:invokevirtual   #73  <Method int ECParameterSpec.getCofactor()>
	//   45  118:istore          7
		if(j == i1)
	//*  46  120:iload           6
	//*  47  122:iload           7
	//*  48  124:icmpne          773
		{
			byte abyte8[] = apa.a(((ECPrivateKey) (obj1)), ((ECPublicKey) (obj2)).getW());
	//   49  127:aload           10
	//   50  129:aload           11
	//   51  131:invokeinterface #76  <Method ECPoint ECPublicKey.getW()>
	//   52  136:invokestatic    #79  <Method byte[] apa.a(ECPrivateKey, ECPoint)>
	//   53  139:astore          12
			obj1 = ((Object) (((ECPublicKey) (obj)).getParams().getCurve()));
	//   54  141:aload           9
	//   55  143:invokeinterface #25  <Method ECParameterSpec ECPublicKey.getParams()>
	//   56  148:invokevirtual   #49  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   57  151:astore          10
			obj2 = ((Object) (((ECPublicKey) (obj)).getW()));
	//   58  153:aload           9
	//   59  155:invokeinterface #76  <Method ECPoint ECPublicKey.getW()>
	//   60  160:astore          11
			apa.a(((ECPoint) (obj2)), ((EllipticCurve) (obj1)));
	//   61  162:aload           11
	//   62  164:aload           10
	//   63  166:invokestatic    #82  <Method void apa.a(ECPoint, EllipticCurve)>
			int k = apa.a(((EllipticCurve) (obj1)));
	//   64  169:aload           10
	//   65  171:invokestatic    #85  <Method int apa.a(EllipticCurve)>
	//   66  174:istore          6
			int j1 = apb.a[apd1.ordinal()];
	//   67  176:getstatic       #90  <Field int[] apb.a>
	//   68  179:aload           5
	//   69  181:invokevirtual   #95  <Method int apd.ordinal()>
	//   70  184:iaload          
	//   71  185:istore          7
			boolean flag = true;
	//   72  187:iconst_1        
	//   73  188:istore          8
			switch(j1)
	//*  74  190:iload           7
			{
	//*  75  192:tableswitch     1 3: default 220
	//	               1 468
	//	               2 339
	//	               3 269
			default:
				s = String.valueOf(((Object) (apd1)));
	//   76  220:aload           5
	//   77  222:invokestatic    #101 <Method String String.valueOf(Object)>
	//   78  225:astore_1        
				abyte0 = ((byte []) (new StringBuilder(String.valueOf(((Object) (s))).length() + 15)));
	//   79  226:new             #103 <Class StringBuilder>
	//   80  229:dup             
	//   81  230:aload_1         
	//   82  231:invokestatic    #101 <Method String String.valueOf(Object)>
	//   83  234:invokevirtual   #106 <Method int String.length()>
	//   84  237:bipush          15
	//   85  239:iadd            
	//   86  240:invokespecial   #109 <Method void StringBuilder(int)>
	//   87  243:astore_2        
				((StringBuilder) (abyte0)).append("invalid format:");
	//   88  244:aload_2         
	//   89  245:ldc1            #111 <String "invalid format:">
	//   90  247:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   91  250:pop             
				((StringBuilder) (abyte0)).append(s);
	//   92  251:aload_2         
	//   93  252:aload_1         
	//   94  253:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   95  256:pop             
				throw new GeneralSecurityException(((StringBuilder) (abyte0)).toString());
	//   96  257:new             #117 <Class GeneralSecurityException>
	//   97  260:dup             
	//   98  261:aload_2         
	//   99  262:invokevirtual   #121 <Method String StringBuilder.toString()>
	//  100  265:invokespecial   #124 <Method void GeneralSecurityException(String)>
	//  101  268:athrow          

			case 3: // '\003'
				k++;
	//  102  269:iload           6
	//  103  271:iconst_1        
	//  104  272:iadd            
	//  105  273:istore          6
				apd1 = ((apd) (new byte[k]));
	//  106  275:iload           6
	//  107  277:newarray        byte[]
	//  108  279:astore          5
				byte abyte2[] = ((ECPoint) (obj2)).getAffineX().toByteArray();
	//  109  281:aload           11
	//  110  283:invokevirtual   #127 <Method BigInteger ECPoint.getAffineX()>
	//  111  286:invokevirtual   #131 <Method byte[] BigInteger.toByteArray()>
	//  112  289:astore          9
				System.arraycopy(((Object) (abyte2)), 0, ((Object) (apd1)), k - abyte2.length, abyte2.length);
	//  113  291:aload           9
	//  114  293:iconst_0        
	//  115  294:aload           5
	//  116  296:iload           6
	//  117  298:aload           9
	//  118  300:arraylength     
	//  119  301:isub            
	//  120  302:aload           9
	//  121  304:arraylength     
	//  122  305:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
				if(((ECPoint) (obj2)).getAffineY().testBit(0))
	//* 123  308:aload           11
	//* 124  310:invokevirtual   #140 <Method BigInteger ECPoint.getAffineY()>
	//* 125  313:iconst_0        
	//* 126  314:invokevirtual   #144 <Method boolean BigInteger.testBit(int)>
	//* 127  317:ifeq            326
					k = 3;
	//  128  320:iconst_3        
	//  129  321:istore          6
				else
	//* 130  323:goto            329
					k = 2;
	//  131  326:iconst_2        
	//  132  327:istore          6
				apd1[0] = (byte)k;
	//  133  329:aload           5
	//  134  331:iconst_0        
	//  135  332:iload           6
	//  136  334:int2byte        
	//  137  335:bastore         
				break;
	//  138  336:goto            543

			case 2: // '\002'
				int k1 = k * 2;
	//  139  339:iload           6
	//  140  341:iconst_2        
	//  141  342:imul            
	//  142  343:istore          7
				byte abyte5[] = new byte[k1];
	//  143  345:iload           7
	//  144  347:newarray        byte[]
	//  145  349:astore          10
				byte abyte3[] = ((ECPoint) (obj2)).getAffineX().toByteArray();
	//  146  351:aload           11
	//  147  353:invokevirtual   #127 <Method BigInteger ECPoint.getAffineX()>
	//  148  356:invokevirtual   #131 <Method byte[] BigInteger.toByteArray()>
	//  149  359:astore          9
				apd1 = ((apd) (abyte3));
	//  150  361:aload           9
	//  151  363:astore          5
				if(abyte3.length > k)
	//* 152  365:aload           9
	//* 153  367:arraylength     
	//* 154  368:iload           6
	//* 155  370:icmple          389
					apd1 = ((apd) (Arrays.copyOfRange(abyte3, abyte3.length - k, abyte3.length)));
	//  156  373:aload           9
	//  157  375:aload           9
	//  158  377:arraylength     
	//  159  378:iload           6
	//  160  380:isub            
	//  161  381:aload           9
	//  162  383:arraylength     
	//  163  384:invokestatic    #150 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  164  387:astore          5
				obj2 = ((Object) (((ECPoint) (obj2)).getAffineY().toByteArray()));
	//  165  389:aload           11
	//  166  391:invokevirtual   #140 <Method BigInteger ECPoint.getAffineY()>
	//  167  394:invokevirtual   #131 <Method byte[] BigInteger.toByteArray()>
	//  168  397:astore          11
				abyte3 = ((byte []) (obj2));
	//  169  399:aload           11
	//  170  401:astore          9
				if(obj2.length > k)
	//* 171  403:aload           11
	//* 172  405:arraylength     
	//* 173  406:iload           6
	//* 174  408:icmple          427
					abyte3 = Arrays.copyOfRange(((byte []) (obj2)), obj2.length - k, obj2.length);
	//  175  411:aload           11
	//  176  413:aload           11
	//  177  415:arraylength     
	//  178  416:iload           6
	//  179  418:isub            
	//  180  419:aload           11
	//  181  421:arraylength     
	//  182  422:invokestatic    #150 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  183  425:astore          9
				System.arraycopy(((Object) (abyte3)), 0, ((Object) (abyte5)), k1 - abyte3.length, abyte3.length);
	//  184  427:aload           9
	//  185  429:iconst_0        
	//  186  430:aload           10
	//  187  432:iload           7
	//  188  434:aload           9
	//  189  436:arraylength     
	//  190  437:isub            
	//  191  438:aload           9
	//  192  440:arraylength     
	//  193  441:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (apd1)), 0, ((Object) (abyte5)), k - apd1.length, apd1.length);
	//  194  444:aload           5
	//  195  446:iconst_0        
	//  196  447:aload           10
	//  197  449:iload           6
	//  198  451:aload           5
	//  199  453:arraylength     
	//  200  454:isub            
	//  201  455:aload           5
	//  202  457:arraylength     
	//  203  458:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
				apd1 = ((apd) (abyte5));
	//  204  461:aload           10
	//  205  463:astore          5
				break;

	//* 206  465:goto            543
			case 1: // '\001'
				int l1 = k * 2 + 1;
	//  207  468:iload           6
	//  208  470:iconst_2        
	//  209  471:imul            
	//  210  472:iconst_1        
	//  211  473:iadd            
	//  212  474:istore          7
				apd1 = ((apd) (new byte[l1]));
	//  213  476:iload           7
	//  214  478:newarray        byte[]
	//  215  480:astore          5
				byte abyte4[] = ((ECPoint) (obj2)).getAffineX().toByteArray();
	//  216  482:aload           11
	//  217  484:invokevirtual   #127 <Method BigInteger ECPoint.getAffineX()>
	//  218  487:invokevirtual   #131 <Method byte[] BigInteger.toByteArray()>
	//  219  490:astore          9
				byte abyte6[] = ((ECPoint) (obj2)).getAffineY().toByteArray();
	//  220  492:aload           11
	//  221  494:invokevirtual   #140 <Method BigInteger ECPoint.getAffineY()>
	//  222  497:invokevirtual   #131 <Method byte[] BigInteger.toByteArray()>
	//  223  500:astore          10
				System.arraycopy(((Object) (abyte6)), 0, ((Object) (apd1)), l1 - abyte6.length, abyte6.length);
	//  224  502:aload           10
	//  225  504:iconst_0        
	//  226  505:aload           5
	//  227  507:iload           7
	//  228  509:aload           10
	//  229  511:arraylength     
	//  230  512:isub            
	//  231  513:aload           10
	//  232  515:arraylength     
	//  233  516:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (abyte4)), 0, ((Object) (apd1)), (k + 1) - abyte4.length, abyte4.length);
	//  234  519:aload           9
	//  235  521:iconst_0        
	//  236  522:aload           5
	//  237  524:iload           6
	//  238  526:iconst_1        
	//  239  527:iadd            
	//  240  528:aload           9
	//  241  530:arraylength     
	//  242  531:isub            
	//  243  532:aload           9
	//  244  534:arraylength     
	//  245  535:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
				apd1[0] = 4;
	//  246  538:aload           5
	//  247  540:iconst_0        
	//  248  541:iconst_4        
	//  249  542:bastore         
				break;
			}
			byte abyte7[] = aoq.a(new byte[][] {
				apd1, abyte8
			});
	//  250  543:iconst_2        
	//  251  544:anewarray       byte[][]
	//  252  547:dup             
	//  253  548:iconst_0        
	//  254  549:aload           5
	//  255  551:aastore         
	//  256  552:dup             
	//  257  553:iconst_1        
	//  258  554:aload           12
	//  259  556:aastore         
	//  260  557:invokestatic    #157 <Method byte[] aoq.a(byte[][])>
	//  261  560:astore          10
			abyte4 = ((byte []) ((Mac)apf.b.a(s)));
	//  262  562:getstatic       #163 <Field apf apf.b>
	//  263  565:aload_1         
	//  264  566:invokevirtual   #166 <Method Object apf.a(String)>
	//  265  569:checkcast       #168 <Class Mac>
	//  266  572:astore          9
			if(i <= ((Mac) (abyte4)).getMacLength() * 255)
	//* 267  574:iload           4
	//* 268  576:aload           9
	//* 269  578:invokevirtual   #171 <Method int Mac.getMacLength()>
	//* 270  581:sipush          255
	//* 271  584:imul            
	//* 272  585:icmpgt          763
			{
				if(abyte0 != null && abyte0.length != 0)
	//* 273  588:aload_2         
	//* 274  589:ifnull          617
	//* 275  592:aload_2         
	//* 276  593:arraylength     
	//* 277  594:ifne            600
	//* 278  597:goto            617
					((Mac) (abyte4)).init(((java.security.Key) (new SecretKeySpec(abyte0, s))));
	//  279  600:aload           9
	//  280  602:new             #173 <Class SecretKeySpec>
	//  281  605:dup             
	//  282  606:aload_2         
	//  283  607:aload_1         
	//  284  608:invokespecial   #176 <Method void SecretKeySpec(byte[], String)>
	//  285  611:invokevirtual   #180 <Method void Mac.init(java.security.Key)>
				else
	//* 286  614:goto            637
					((Mac) (abyte4)).init(((java.security.Key) (new SecretKeySpec(new byte[((Mac) (abyte4)).getMacLength()], s))));
	//  287  617:aload           9
	//  288  619:new             #173 <Class SecretKeySpec>
	//  289  622:dup             
	//  290  623:aload           9
	//  291  625:invokevirtual   #171 <Method int Mac.getMacLength()>
	//  292  628:newarray        byte[]
	//  293  630:aload_1         
	//  294  631:invokespecial   #176 <Method void SecretKeySpec(byte[], String)>
	//  295  634:invokevirtual   #180 <Method void Mac.init(java.security.Key)>
				abyte7 = ((Mac) (abyte4)).doFinal(abyte7);
	//  296  637:aload           9
	//  297  639:aload           10
	//  298  641:invokevirtual   #184 <Method byte[] Mac.doFinal(byte[])>
	//  299  644:astore          10
				abyte0 = new byte[i];
	//  300  646:iload           4
	//  301  648:newarray        byte[]
	//  302  650:astore_2        
				((Mac) (abyte4)).init(((java.security.Key) (new SecretKeySpec(abyte7, s))));
	//  303  651:aload           9
	//  304  653:new             #173 <Class SecretKeySpec>
	//  305  656:dup             
	//  306  657:aload           10
	//  307  659:aload_1         
	//  308  660:invokespecial   #176 <Method void SecretKeySpec(byte[], String)>
	//  309  663:invokevirtual   #180 <Method void Mac.init(java.security.Key)>
				s = ((String) (new byte[0]));
	//  310  666:iconst_0        
	//  311  667:newarray        byte[]
	//  312  669:astore_1        
				int i2 = 0;
	//  313  670:iconst_0        
	//  314  671:istore          7
				int l = ((int) (flag));
	//  315  673:iload           8
	//  316  675:istore          6
				do
				{
					((Mac) (abyte4)).update(((byte []) (s)));
	//  317  677:aload           9
	//  318  679:aload_1         
	//  319  680:invokevirtual   #188 <Method void Mac.update(byte[])>
					((Mac) (abyte4)).update(abyte1);
	//  320  683:aload           9
	//  321  685:aload_3         
	//  322  686:invokevirtual   #188 <Method void Mac.update(byte[])>
					((Mac) (abyte4)).update((byte)l);
	//  323  689:aload           9
	//  324  691:iload           6
	//  325  693:int2byte        
	//  326  694:invokevirtual   #191 <Method void Mac.update(byte)>
					s = ((String) (((Mac) (abyte4)).doFinal()));
	//  327  697:aload           9
	//  328  699:invokevirtual   #193 <Method byte[] Mac.doFinal()>
	//  329  702:astore_1        
					if(s.length + i2 < i)
	//* 330  703:aload_1         
	//* 331  704:arraylength     
	//* 332  705:iload           7
	//* 333  707:iadd            
	//* 334  708:iload           4
	//* 335  710:icmpge          739
					{
						System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), i2, s.length);
	//  336  713:aload_1         
	//  337  714:iconst_0        
	//  338  715:aload_2         
	//  339  716:iload           7
	//  340  718:aload_1         
	//  341  719:arraylength     
	//  342  720:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
						i2 += s.length;
	//  343  723:iload           7
	//  344  725:aload_1         
	//  345  726:arraylength     
	//  346  727:iadd            
	//  347  728:istore          7
						l++;
	//  348  730:iload           6
	//  349  732:iconst_1        
	//  350  733:iadd            
	//  351  734:istore          6
					} else
	//* 352  736:goto            677
					{
						System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), i2, i - i2);
	//  353  739:aload_1         
	//  354  740:iconst_0        
	//  355  741:aload_2         
	//  356  742:iload           7
	//  357  744:iload           4
	//  358  746:iload           7
	//  359  748:isub            
	//  360  749:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
						return new aoz(((byte []) (apd1)), abyte0);
	//  361  752:new             #195 <Class aoz>
	//  362  755:dup             
	//  363  756:aload           5
	//  364  758:aload_2         
	//  365  759:invokespecial   #198 <Method void aoz(byte[], byte[])>
	//  366  762:areturn         
					}
				} while(true);
			} else
			{
				throw new GeneralSecurityException("size too large");
	//  367  763:new             #117 <Class GeneralSecurityException>
	//  368  766:dup             
	//  369  767:ldc1            #200 <String "size too large">
	//  370  769:invokespecial   #124 <Method void GeneralSecurityException(String)>
	//  371  772:athrow          
			}
		}
		try
		{
			throw new GeneralSecurityException("invalid public key spec");
	//  372  773:new             #117 <Class GeneralSecurityException>
	//  373  776:dup             
	//  374  777:ldc1            #202 <String "invalid public key spec">
	//  375  779:invokespecial   #124 <Method void GeneralSecurityException(String)>
	//  376  782:athrow          
		}
	//* 377  783:astore_1        
	//* 378  784:goto            788
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  379  787:astore_1        
		// Misplaced declaration of an exception variable
		catch(String s) { }
		throw new GeneralSecurityException(((RuntimeException) (s)).toString());
	//  380  788:new             #117 <Class GeneralSecurityException>
	//  381  791:dup             
	//  382  792:aload_1         
	//  383  793:invokevirtual   #205 <Method String RuntimeException.toString()>
	//  384  796:invokespecial   #124 <Method void GeneralSecurityException(String)>
	//  385  799:athrow          
	}

	private ECPublicKey a;
}
