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
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayt, zzayu, zzayw, zzayk, 
//			zzayy, zzays

public final class zzayr
{

	public zzayr(ECPublicKey ecpublickey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzdnj = ecpublickey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ECPublicKey zzdnj>
	//    5    9:return          
	}

	public final zzays zza(String s, byte abyte0[], byte abyte1[], int i, zzayw zzayw1)
		throws GeneralSecurityException
	{
		Object obj = ((Object) (zzayt.zza(zzdnj.getParams())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ECPublicKey zzdnj>
	//    2    4:invokeinterface #24  <Method ECParameterSpec ECPublicKey.getParams()>
	//    3    9:invokestatic    #29  <Method KeyPair zzayt.zza(ECParameterSpec)>
	//    4   12:astore          9
		Object obj1 = ((Object) ((ECPublicKey)((KeyPair) (obj)).getPublic()));
	//    5   14:aload           9
	//    6   16:invokevirtual   #35  <Method java.security.PublicKey KeyPair.getPublic()>
	//    7   19:checkcast       #20  <Class ECPublicKey>
	//    8   22:astore          10
		obj = ((Object) ((ECPrivateKey)((KeyPair) (obj)).getPrivate()));
	//    9   24:aload           9
	//   10   26:invokevirtual   #39  <Method java.security.PrivateKey KeyPair.getPrivate()>
	//   11   29:checkcast       #41  <Class ECPrivateKey>
	//   12   32:astore          9
		Object obj2 = ((Object) (zzdnj));
	//   13   34:aload_0         
	//   14   35:getfield        #13  <Field ECPublicKey zzdnj>
	//   15   38:astore          11
		ECParameterSpec ecparameterspec = ((ECPublicKey) (obj2)).getParams();
	//   16   40:aload           11
	//   17   42:invokeinterface #24  <Method ECParameterSpec ECPublicKey.getParams()>
	//   18   47:astore          12
		ECParameterSpec ecparameterspec1 = ((ECPrivateKey) (obj)).getParams();
	//   19   49:aload           9
	//   20   51:invokeinterface #42  <Method ECParameterSpec ECPrivateKey.getParams()>
	//   21   56:astore          13
		if(ecparameterspec.getCurve().equals(((Object) (ecparameterspec1.getCurve()))) && ecparameterspec.getGenerator().equals(((Object) (ecparameterspec1.getGenerator()))) && ecparameterspec.getOrder().equals(((Object) (ecparameterspec1.getOrder()))) && ecparameterspec.getCofactor() == ecparameterspec1.getCofactor())
	//*  22   58:aload           12
	//*  23   60:invokevirtual   #48  <Method EllipticCurve ECParameterSpec.getCurve()>
	//*  24   63:aload           13
	//*  25   65:invokevirtual   #48  <Method EllipticCurve ECParameterSpec.getCurve()>
	//*  26   68:invokevirtual   #54  <Method boolean EllipticCurve.equals(Object)>
	//*  27   71:ifeq            632
	//*  28   74:aload           12
	//*  29   76:invokevirtual   #58  <Method ECPoint ECParameterSpec.getGenerator()>
	//*  30   79:aload           13
	//*  31   81:invokevirtual   #58  <Method ECPoint ECParameterSpec.getGenerator()>
	//*  32   84:invokevirtual   #61  <Method boolean ECPoint.equals(Object)>
	//*  33   87:ifeq            632
	//*  34   90:aload           12
	//*  35   92:invokevirtual   #65  <Method BigInteger ECParameterSpec.getOrder()>
	//*  36   95:aload           13
	//*  37   97:invokevirtual   #65  <Method BigInteger ECParameterSpec.getOrder()>
	//*  38  100:invokevirtual   #68  <Method boolean BigInteger.equals(Object)>
	//*  39  103:ifeq            632
	//*  40  106:aload           12
	//*  41  108:invokevirtual   #72  <Method int ECParameterSpec.getCofactor()>
	//*  42  111:aload           13
	//*  43  113:invokevirtual   #72  <Method int ECParameterSpec.getCofactor()>
	//*  44  116:icmpeq          122
	//*  45  119:goto            632
		{
			byte abyte2[] = zzayt.zza(((ECPrivateKey) (obj)), ((ECPublicKey) (obj2)).getW());
	//   46  122:aload           9
	//   47  124:aload           11
	//   48  126:invokeinterface #75  <Method ECPoint ECPublicKey.getW()>
	//   49  131:invokestatic    #78  <Method byte[] zzayt.zza(ECPrivateKey, ECPoint)>
	//   50  134:astore          9
			obj2 = ((Object) (((ECPublicKey) (obj1)).getParams().getCurve()));
	//   51  136:aload           10
	//   52  138:invokeinterface #24  <Method ECParameterSpec ECPublicKey.getParams()>
	//   53  143:invokevirtual   #48  <Method EllipticCurve ECParameterSpec.getCurve()>
	//   54  146:astore          11
			obj1 = ((Object) (((ECPublicKey) (obj1)).getW()));
	//   55  148:aload           10
	//   56  150:invokeinterface #75  <Method ECPoint ECPublicKey.getW()>
	//   57  155:astore          10
			zzayt.zza(((ECPoint) (obj1)), ((EllipticCurve) (obj2)));
	//   58  157:aload           10
	//   59  159:aload           11
	//   60  161:invokestatic    #81  <Method void zzayt.zza(ECPoint, EllipticCurve)>
			int j = zzayt.zzb(((EllipticCurve) (obj2)));
	//   61  164:aload           11
	//   62  166:invokestatic    #85  <Method int zzayt.zzb(EllipticCurve)>
	//   63  169:istore          6
			int k = zzayu.zzdnm[zzayw1.ordinal()];
	//   64  171:getstatic       #91  <Field int[] zzayu.zzdnm>
	//   65  174:aload           5
	//   66  176:invokevirtual   #96  <Method int zzayw.ordinal()>
	//   67  179:iaload          
	//   68  180:istore          7
			boolean flag = true;
	//   69  182:iconst_1        
	//   70  183:istore          8
			switch(k)
	//*  71  185:iload           7
			{
	//*  72  187:tableswitch     1 2: default 208
	//	               1 327
	//	               2 257
			default:
				s = String.valueOf(((Object) (zzayw1)));
	//   73  208:aload           5
	//   74  210:invokestatic    #102 <Method String String.valueOf(Object)>
	//   75  213:astore_1        
				abyte0 = ((byte []) (new StringBuilder(15 + String.valueOf(((Object) (s))).length())));
	//   76  214:new             #104 <Class StringBuilder>
	//   77  217:dup             
	//   78  218:bipush          15
	//   79  220:aload_1         
	//   80  221:invokestatic    #102 <Method String String.valueOf(Object)>
	//   81  224:invokevirtual   #107 <Method int String.length()>
	//   82  227:iadd            
	//   83  228:invokespecial   #110 <Method void StringBuilder(int)>
	//   84  231:astore_2        
				((StringBuilder) (abyte0)).append("invalid format:");
	//   85  232:aload_2         
	//   86  233:ldc1            #112 <String "invalid format:">
	//   87  235:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   88  238:pop             
				((StringBuilder) (abyte0)).append(s);
	//   89  239:aload_2         
	//   90  240:aload_1         
	//   91  241:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   92  244:pop             
				throw new GeneralSecurityException(((StringBuilder) (abyte0)).toString());
	//   93  245:new             #18  <Class GeneralSecurityException>
	//   94  248:dup             
	//   95  249:aload_2         
	//   96  250:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   97  253:invokespecial   #123 <Method void GeneralSecurityException(String)>
	//   98  256:athrow          

			case 2: // '\002'
				j++;
	//   99  257:iload           6
	//  100  259:iconst_1        
	//  101  260:iadd            
	//  102  261:istore          6
				zzayw1 = ((zzayw) (new byte[j]));
	//  103  263:iload           6
	//  104  265:newarray        byte[]
	//  105  267:astore          5
				byte abyte5[] = ((ECPoint) (obj1)).getAffineX().toByteArray();
	//  106  269:aload           10
	//  107  271:invokevirtual   #126 <Method BigInteger ECPoint.getAffineX()>
	//  108  274:invokevirtual   #130 <Method byte[] BigInteger.toByteArray()>
	//  109  277:astore          11
				System.arraycopy(((Object) (abyte5)), 0, ((Object) (zzayw1)), j - abyte5.length, abyte5.length);
	//  110  279:aload           11
	//  111  281:iconst_0        
	//  112  282:aload           5
	//  113  284:iload           6
	//  114  286:aload           11
	//  115  288:arraylength     
	//  116  289:isub            
	//  117  290:aload           11
	//  118  292:arraylength     
	//  119  293:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
				if(((ECPoint) (obj1)).getAffineY().testBit(0))
	//* 120  296:aload           10
	//* 121  298:invokevirtual   #139 <Method BigInteger ECPoint.getAffineY()>
	//* 122  301:iconst_0        
	//* 123  302:invokevirtual   #143 <Method boolean BigInteger.testBit(int)>
	//* 124  305:ifeq            314
					j = 3;
	//  125  308:iconst_3        
	//  126  309:istore          6
				else
	//* 127  311:goto            317
					j = 2;
	//  128  314:iconst_2        
	//  129  315:istore          6
				zzayw1[0] = (byte)j;
	//  130  317:aload           5
	//  131  319:iconst_0        
	//  132  320:iload           6
	//  133  322:int2byte        
	//  134  323:bastore         
				break;

	//* 135  324:goto            402
			case 1: // '\001'
				k = 2 * j + 1;
	//  136  327:iconst_2        
	//  137  328:iload           6
	//  138  330:imul            
	//  139  331:iconst_1        
	//  140  332:iadd            
	//  141  333:istore          7
				zzayw1 = ((zzayw) (new byte[k]));
	//  142  335:iload           7
	//  143  337:newarray        byte[]
	//  144  339:astore          5
				byte abyte6[] = ((ECPoint) (obj1)).getAffineX().toByteArray();
	//  145  341:aload           10
	//  146  343:invokevirtual   #126 <Method BigInteger ECPoint.getAffineX()>
	//  147  346:invokevirtual   #130 <Method byte[] BigInteger.toByteArray()>
	//  148  349:astore          11
				byte abyte3[] = ((ECPoint) (obj1)).getAffineY().toByteArray();
	//  149  351:aload           10
	//  150  353:invokevirtual   #139 <Method BigInteger ECPoint.getAffineY()>
	//  151  356:invokevirtual   #130 <Method byte[] BigInteger.toByteArray()>
	//  152  359:astore          10
				System.arraycopy(((Object) (abyte3)), 0, ((Object) (zzayw1)), k - abyte3.length, abyte3.length);
	//  153  361:aload           10
	//  154  363:iconst_0        
	//  155  364:aload           5
	//  156  366:iload           7
	//  157  368:aload           10
	//  158  370:arraylength     
	//  159  371:isub            
	//  160  372:aload           10
	//  161  374:arraylength     
	//  162  375:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (abyte6)), 0, ((Object) (zzayw1)), (j + 1) - abyte6.length, abyte6.length);
	//  163  378:aload           11
	//  164  380:iconst_0        
	//  165  381:aload           5
	//  166  383:iload           6
	//  167  385:iconst_1        
	//  168  386:iadd            
	//  169  387:aload           11
	//  170  389:arraylength     
	//  171  390:isub            
	//  172  391:aload           11
	//  173  393:arraylength     
	//  174  394:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
				zzayw1[0] = 4;
	//  175  397:aload           5
	//  176  399:iconst_0        
	//  177  400:iconst_4        
	//  178  401:bastore         
				break;
			}
			byte abyte4[] = zzayk.zza(new byte[][] {
				zzayw1, abyte2
			});
	//  179  402:iconst_2        
	//  180  403:anewarray       byte[][]
	//  181  406:dup             
	//  182  407:iconst_0        
	//  183  408:aload           5
	//  184  410:aastore         
	//  185  411:dup             
	//  186  412:iconst_1        
	//  187  413:aload           9
	//  188  415:aastore         
	//  189  416:invokestatic    #150 <Method byte[] zzayk.zza(byte[][])>
	//  190  419:astore          10
			abyte2 = ((byte []) ((Mac)zzayy.zzdoa.zzek(s)));
	//  191  421:getstatic       #156 <Field zzayy zzayy.zzdoa>
	//  192  424:aload_1         
	//  193  425:invokevirtual   #160 <Method Object zzayy.zzek(String)>
	//  194  428:checkcast       #162 <Class Mac>
	//  195  431:astore          9
			if(i > 255 * ((Mac) (abyte2)).getMacLength())
	//* 196  433:iload           4
	//* 197  435:sipush          255
	//* 198  438:aload           9
	//* 199  440:invokevirtual   #165 <Method int Mac.getMacLength()>
	//* 200  443:imul            
	//* 201  444:icmple          457
				throw new GeneralSecurityException("size too large");
	//  202  447:new             #18  <Class GeneralSecurityException>
	//  203  450:dup             
	//  204  451:ldc1            #167 <String "size too large">
	//  205  453:invokespecial   #123 <Method void GeneralSecurityException(String)>
	//  206  456:athrow          
			if(abyte0 != null && abyte0.length != 0)
	//* 207  457:aload_2         
	//* 208  458:ifnull          486
	//* 209  461:aload_2         
	//* 210  462:arraylength     
	//* 211  463:ifne            469
	//* 212  466:goto            486
				((Mac) (abyte2)).init(((java.security.Key) (new SecretKeySpec(abyte0, s))));
	//  213  469:aload           9
	//  214  471:new             #169 <Class SecretKeySpec>
	//  215  474:dup             
	//  216  475:aload_2         
	//  217  476:aload_1         
	//  218  477:invokespecial   #172 <Method void SecretKeySpec(byte[], String)>
	//  219  480:invokevirtual   #176 <Method void Mac.init(java.security.Key)>
			else
	//* 220  483:goto            506
				((Mac) (abyte2)).init(((java.security.Key) (new SecretKeySpec(new byte[((Mac) (abyte2)).getMacLength()], s))));
	//  221  486:aload           9
	//  222  488:new             #169 <Class SecretKeySpec>
	//  223  491:dup             
	//  224  492:aload           9
	//  225  494:invokevirtual   #165 <Method int Mac.getMacLength()>
	//  226  497:newarray        byte[]
	//  227  499:aload_1         
	//  228  500:invokespecial   #172 <Method void SecretKeySpec(byte[], String)>
	//  229  503:invokevirtual   #176 <Method void Mac.init(java.security.Key)>
			abyte4 = ((Mac) (abyte2)).doFinal(abyte4);
	//  230  506:aload           9
	//  231  508:aload           10
	//  232  510:invokevirtual   #180 <Method byte[] Mac.doFinal(byte[])>
	//  233  513:astore          10
			abyte0 = new byte[i];
	//  234  515:iload           4
	//  235  517:newarray        byte[]
	//  236  519:astore_2        
			((Mac) (abyte2)).init(((java.security.Key) (new SecretKeySpec(abyte4, s))));
	//  237  520:aload           9
	//  238  522:new             #169 <Class SecretKeySpec>
	//  239  525:dup             
	//  240  526:aload           10
	//  241  528:aload_1         
	//  242  529:invokespecial   #172 <Method void SecretKeySpec(byte[], String)>
	//  243  532:invokevirtual   #176 <Method void Mac.init(java.security.Key)>
			s = ((String) (new byte[0]));
	//  244  535:iconst_0        
	//  245  536:newarray        byte[]
	//  246  538:astore_1        
			k = 0;
	//  247  539:iconst_0        
	//  248  540:istore          7
			j = ((int) (flag));
	//  249  542:iload           8
	//  250  544:istore          6
			do
			{
				((Mac) (abyte2)).update(((byte []) (s)));
	//  251  546:aload           9
	//  252  548:aload_1         
	//  253  549:invokevirtual   #184 <Method void Mac.update(byte[])>
				((Mac) (abyte2)).update(abyte1);
	//  254  552:aload           9
	//  255  554:aload_3         
	//  256  555:invokevirtual   #184 <Method void Mac.update(byte[])>
				((Mac) (abyte2)).update((byte)j);
	//  257  558:aload           9
	//  258  560:iload           6
	//  259  562:int2byte        
	//  260  563:invokevirtual   #187 <Method void Mac.update(byte)>
				s = ((String) (((Mac) (abyte2)).doFinal()));
	//  261  566:aload           9
	//  262  568:invokevirtual   #189 <Method byte[] Mac.doFinal()>
	//  263  571:astore_1        
				if(s.length + k < i)
	//* 264  572:aload_1         
	//* 265  573:arraylength     
	//* 266  574:iload           7
	//* 267  576:iadd            
	//* 268  577:iload           4
	//* 269  579:icmpge          608
				{
					System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), k, s.length);
	//  270  582:aload_1         
	//  271  583:iconst_0        
	//  272  584:aload_2         
	//  273  585:iload           7
	//  274  587:aload_1         
	//  275  588:arraylength     
	//  276  589:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
					k += s.length;
	//  277  592:iload           7
	//  278  594:aload_1         
	//  279  595:arraylength     
	//  280  596:iadd            
	//  281  597:istore          7
					j++;
	//  282  599:iload           6
	//  283  601:iconst_1        
	//  284  602:iadd            
	//  285  603:istore          6
				} else
	//* 286  605:goto            546
				{
					System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), k, i - k);
	//  287  608:aload_1         
	//  288  609:iconst_0        
	//  289  610:aload_2         
	//  290  611:iload           7
	//  291  613:iload           4
	//  292  615:iload           7
	//  293  617:isub            
	//  294  618:invokestatic    #136 <Method void System.arraycopy(Object, int, Object, int, int)>
					return new zzays(((byte []) (zzayw1)), abyte0);
	//  295  621:new             #191 <Class zzays>
	//  296  624:dup             
	//  297  625:aload           5
	//  298  627:aload_2         
	//  299  628:invokespecial   #194 <Method void zzays(byte[], byte[])>
	//  300  631:areturn         
				}
			} while(true);
		} else
		{
			throw new GeneralSecurityException("invalid public key spec");
	//  301  632:new             #18  <Class GeneralSecurityException>
	//  302  635:dup             
	//  303  636:ldc1            #196 <String "invalid public key spec">
	//  304  638:invokespecial   #123 <Method void GeneralSecurityException(String)>
	//  305  641:athrow          
		}
	}

	private ECPublicKey zzdnj;
}
