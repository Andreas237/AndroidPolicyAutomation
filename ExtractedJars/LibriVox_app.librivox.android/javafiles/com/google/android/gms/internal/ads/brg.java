// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brf, brh, bqv, bra, 
//			bqz, bqw, wx

public final class brg
{

	public brg(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		b = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int b>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean e>
		if(j <= 64 && j >= 0)
	//*   8   14:iload_2         
	//*   9   15:bipush          64
	//*  10   17:icmpgt          35
	//*  11   20:iload_2         
	//*  12   21:ifge            27
	//*  13   24:goto            35
			f = j;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #27  <Field int f>
		else
	//*  17   32:goto            41
			f = 64;
	//   18   35:aload_0         
	//   19   36:bipush          64
	//   20   38:putfield        #27  <Field int f>
		if(k <= 0)
	//*  21   41:iload_3         
	//*  22   42:ifgt            53
			g = 1;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #29  <Field int g>
		else
	//*  26   50:goto            58
			g = k;
	//   27   53:aload_0         
	//   28   54:iload_3         
	//   29   55:putfield        #29  <Field int g>
		a = ((bqw) (new brf(f)));
	//   30   58:aload_0         
	//   31   59:new             #31  <Class brf>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:getfield        #27  <Field int f>
	//   35   67:invokespecial   #34  <Method void brf(int)>
	//   36   70:putfield        #36  <Field bqw a>
	//   37   73:return          
	}

	public final String a(ArrayList arraylist, ArrayList arraylist1)
	{
		Collections.sort(((java.util.List) (arraylist1)), ((java.util.Comparator) (new brh(this))));
	//    0    0:aload_2         
	//    1    1:new             #42  <Class brh>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #45  <Method void brh(brg)>
	//    5    9:invokestatic    #51  <Method void Collections.sort(java.util.List, java.util.Comparator)>
		HashSet hashset = new HashSet();
	//    6   12:new             #53  <Class HashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #54  <Method void HashSet()>
	//    9   19:astore          12
		int j = 0;
	//   10   21:iconst_0        
	//   11   22:istore          4
		do
		{
			if(j >= arraylist1.size())
				break;
	//   12   24:iload           4
	//   13   26:aload_2         
	//   14   27:invokevirtual   #60  <Method int ArrayList.size()>
	//   15   30:icmpge          521
			String as[] = Normalizer.normalize((CharSequence)arraylist.get(((bqv)arraylist1.get(j)).e()), java.text.Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:iload           4
	//   19   37:invokevirtual   #64  <Method Object ArrayList.get(int)>
	//   20   40:checkcast       #66  <Class bqv>
	//   21   43:invokevirtual   #68  <Method int bqv.e()>
	//   22   46:invokevirtual   #64  <Method Object ArrayList.get(int)>
	//   23   49:checkcast       #70  <Class CharSequence>
	//   24   52:getstatic       #76  <Field java.text.Normalizer$Form java.text.Normalizer$Form.NFKC>
	//   25   55:invokestatic    #82  <Method String Normalizer.normalize(CharSequence, java.text.Normalizer$Form)>
	//   26   58:getstatic       #88  <Field Locale Locale.US>
	//   27   61:invokevirtual   #94  <Method String String.toLowerCase(Locale)>
	//   28   64:ldc1            #96  <String "\n">
	//   29   66:invokevirtual   #100 <Method String[] String.split(String)>
	//   30   69:astore          13
			int k = as.length;
	//   31   71:aload           13
	//   32   73:arraylength     
	//   33   74:istore          5
			boolean flag = true;
	//   34   76:iconst_1        
	//   35   77:istore          8
			int i = ((int) (flag));
	//   36   79:iload           8
	//   37   81:istore_3        
			if(k != 0)
	//*  38   82:iload           5
	//*  39   84:ifeq            508
			{
				int l = 0;
	//   40   87:iconst_0        
	//   41   88:istore          5
label0:
				do
				{
					Object obj;
label1:
					{
						String s2;
label2:
						{
							i = ((int) (flag));
	//   42   90:iload           8
	//   43   92:istore_3        
							if(l >= as.length)
								break label0;
	//   44   93:iload           5
	//   45   95:aload           13
	//   46   97:arraylength     
	//   47   98:icmpge          508
							s2 = as[l];
	//   48  101:aload           13
	//   49  103:iload           5
	//   50  105:aaload          
	//   51  106:astore          11
							if(s2.indexOf("'") == -1)
								break label2;
	//   52  108:aload           11
	//   53  110:ldc1            #102 <String "'">
	//   54  112:invokevirtual   #106 <Method int String.indexOf(String)>
	//   55  115:iconst_m1       
	//   56  116:icmpeq          297
							obj = ((Object) (new StringBuilder(s2)));
	//   57  119:new             #108 <Class StringBuilder>
	//   58  122:dup             
	//   59  123:aload           11
	//   60  125:invokespecial   #111 <Method void StringBuilder(String)>
	//   61  128:astore          10
							i = 1;
	//   62  130:iconst_1        
	//   63  131:istore_3        
							int i1 = 0;
	//   64  132:iconst_0        
	//   65  133:istore          6
label3:
							do
							{
								int k1;
label4:
								{
label5:
									{
										int i2 = i + 2;
	//   66  135:iload_3         
	//   67  136:iconst_2        
	//   68  137:iadd            
	//   69  138:istore          9
										if(i2 > ((StringBuilder) (obj)).length())
											break label3;
	//   70  140:iload           9
	//   71  142:aload           10
	//   72  144:invokevirtual   #114 <Method int StringBuilder.length()>
	//   73  147:icmpgt          265
										k1 = i;
	//   74  150:iload_3         
	//   75  151:istore          7
										if(((StringBuilder) (obj)).charAt(i) != '\'')
											break label4;
	//   76  153:aload           10
	//   77  155:iload_3         
	//   78  156:invokevirtual   #118 <Method char StringBuilder.charAt(int)>
	//   79  159:bipush          39
	//   80  161:icmpne          257
										if(((StringBuilder) (obj)).charAt(i - 1) != ' ')
	//*  81  164:aload           10
	//*  82  166:iload_3         
	//*  83  167:iconst_1        
	//*  84  168:isub            
	//*  85  169:invokevirtual   #118 <Method char StringBuilder.charAt(int)>
	//*  86  172:bipush          32
	//*  87  174:icmpeq          243
										{
											i1 = i + 1;
	//   88  177:iload_3         
	//   89  178:iconst_1        
	//   90  179:iadd            
	//   91  180:istore          6
											if((((StringBuilder) (obj)).charAt(i1) == 's' || ((StringBuilder) (obj)).charAt(i1) == 'S') && (i2 == ((StringBuilder) (obj)).length() || ((StringBuilder) (obj)).charAt(i2) == ' '))
	//*  92  182:aload           10
	//*  93  184:iload           6
	//*  94  186:invokevirtual   #118 <Method char StringBuilder.charAt(int)>
	//*  95  189:bipush          115
	//*  96  191:icmpeq          206
	//*  97  194:aload           10
	//*  98  196:iload           6
	//*  99  198:invokevirtual   #118 <Method char StringBuilder.charAt(int)>
	//* 100  201:bipush          83
	//* 101  203:icmpne          243
	//* 102  206:iload           9
	//* 103  208:aload           10
	//* 104  210:invokevirtual   #114 <Method int StringBuilder.length()>
	//* 105  213:icmpeq          228
	//* 106  216:aload           10
	//* 107  218:iload           9
	//* 108  220:invokevirtual   #118 <Method char StringBuilder.charAt(int)>
	//* 109  223:bipush          32
	//* 110  225:icmpne          243
											{
												((StringBuilder) (obj)).insert(i, ' ');
	//  111  228:aload           10
	//  112  230:iload_3         
	//  113  231:bipush          32
	//  114  233:invokevirtual   #122 <Method StringBuilder StringBuilder.insert(int, char)>
	//  115  236:pop             
												i = i2;
	//  116  237:iload           9
	//  117  239:istore_3        
												break label5;
	//  118  240:goto            251
											}
										}
										((StringBuilder) (obj)).setCharAt(i, ' ');
	//  119  243:aload           10
	//  120  245:iload_3         
	//  121  246:bipush          32
	//  122  248:invokevirtual   #126 <Method void StringBuilder.setCharAt(int, char)>
									}
									i1 = 1;
	//  123  251:iconst_1        
	//  124  252:istore          6
									k1 = i;
	//  125  254:iload_3         
	//  126  255:istore          7
								}
								i = k1 + 1;
	//  127  257:iload           7
	//  128  259:iconst_1        
	//  129  260:iadd            
	//  130  261:istore_3        
							} while(true);
	//  131  262:goto            135
							if(i1 != 0)
	//* 132  265:iload           6
	//* 133  267:ifeq            280
								obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  134  270:aload           10
	//  135  272:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  136  275:astore          10
							else
	//* 137  277:goto            283
								obj = null;
	//  138  280:aconst_null     
	//  139  281:astore          10
							if(obj != null)
	//* 140  283:aload           10
	//* 141  285:ifnull          297
							{
								d = ((String) (obj));
	//  142  288:aload_0         
	//  143  289:aload           10
	//  144  291:putfield        #132 <Field String d>
								break label1;
	//  145  294:goto            301
							}
						}
						obj = ((Object) (s2));
	//  146  297:aload           11
	//  147  299:astore          10
					}
label6:
					{
						String as1[] = bra.a(((String) (obj)), true);
	//  148  301:aload           10
	//  149  303:iconst_1        
	//  150  304:invokestatic    #137 <Method String[] bra.a(String, boolean)>
	//  151  307:astore          14
						if(as1.length < g)
							break label6;
	//  152  309:aload           14
	//  153  311:arraylength     
	//  154  312:aload_0         
	//  155  313:getfield        #29  <Field int g>
	//  156  316:icmplt          499
						i = 0;
	//  157  319:iconst_0        
	//  158  320:istore_3        
label7:
						do
						{
							int j1;
							String s;
label8:
							{
								if(i >= as1.length)
									break label7;
	//  159  321:iload_3         
	//  160  322:aload           14
	//  161  324:arraylength     
	//  162  325:icmpge          482
								s = "";
	//  163  328:ldc1            #139 <String "">
	//  164  330:astore          10
								for(j1 = 0; j1 < g; j1++)
	//* 165  332:iconst_0        
	//* 166  333:istore          6
	//* 167  335:iload           6
	//* 168  337:aload_0         
	//* 169  338:getfield        #29  <Field int g>
	//* 170  341:icmpge          442
								{
									int l1 = i + j1;
	//  171  344:iload_3         
	//  172  345:iload           6
	//  173  347:iadd            
	//  174  348:istore          7
									if(l1 >= as1.length)
	//* 175  350:iload           7
	//* 176  352:aload           14
	//* 177  354:arraylength     
	//* 178  355:icmplt          364
									{
										j1 = 0;
	//  179  358:iconst_0        
	//  180  359:istore          6
										break label8;
	//  181  361:goto            445
									}
									String s3 = s;
	//  182  364:aload           10
	//  183  366:astore          11
									if(j1 > 0)
	//* 184  368:iload           6
	//* 185  370:ifle            385
										s3 = String.valueOf(((Object) (s))).concat(" ");
	//  186  373:aload           10
	//  187  375:invokestatic    #143 <Method String String.valueOf(Object)>
	//  188  378:ldc1            #145 <String " ">
	//  189  380:invokevirtual   #149 <Method String String.concat(String)>
	//  190  383:astore          11
									s = String.valueOf(((Object) (s3)));
	//  191  385:aload           11
	//  192  387:invokestatic    #143 <Method String String.valueOf(Object)>
	//  193  390:astore          10
									s3 = String.valueOf(((Object) (as1[l1])));
	//  194  392:aload           14
	//  195  394:iload           7
	//  196  396:aaload          
	//  197  397:invokestatic    #143 <Method String String.valueOf(Object)>
	//  198  400:astore          11
									if(s3.length() != 0)
	//* 199  402:aload           11
	//* 200  404:invokevirtual   #150 <Method int String.length()>
	//* 201  407:ifeq            422
										s = s.concat(s3);
	//  202  410:aload           10
	//  203  412:aload           11
	//  204  414:invokevirtual   #149 <Method String String.concat(String)>
	//  205  417:astore          10
									else
	//* 206  419:goto            433
										s = new String(s);
	//  207  422:new             #90  <Class String>
	//  208  425:dup             
	//  209  426:aload           10
	//  210  428:invokespecial   #151 <Method void String(String)>
	//  211  431:astore          10
								}

	//  212  433:iload           6
	//  213  435:iconst_1        
	//  214  436:iadd            
	//  215  437:istore          6
	//* 216  439:goto            335
								j1 = 1;
	//  217  442:iconst_1        
	//  218  443:istore          6
							}
							if(j1 == 0)
								break;
	//  219  445:iload           6
	//  220  447:ifeq            482
							hashset.add(((Object) (s)));
	//  221  450:aload           12
	//  222  452:aload           10
	//  223  454:invokevirtual   #155 <Method boolean HashSet.add(Object)>
	//  224  457:pop             
							if(hashset.size() >= b)
	//* 225  458:aload           12
	//* 226  460:invokevirtual   #156 <Method int HashSet.size()>
	//* 227  463:aload_0         
	//* 228  464:getfield        #23  <Field int b>
	//* 229  467:icmplt          475
							{
								i = 0;
	//  230  470:iconst_0        
	//  231  471:istore_3        
								break label0;
	//  232  472:goto            508
							}
							i++;
	//  233  475:iload_3         
	//  234  476:iconst_1        
	//  235  477:iadd            
	//  236  478:istore_3        
						} while(true);
	//  237  479:goto            321
						if(hashset.size() >= b)
	//* 238  482:aload           12
	//* 239  484:invokevirtual   #156 <Method int HashSet.size()>
	//* 240  487:aload_0         
	//* 241  488:getfield        #23  <Field int b>
	//* 242  491:icmplt          499
						{
							i = 0;
	//  243  494:iconst_0        
	//  244  495:istore_3        
							break label0;
	//  245  496:goto            508
						}
					}
					l++;
	//  246  499:iload           5
	//  247  501:iconst_1        
	//  248  502:iadd            
	//  249  503:istore          5
				} while(true);
	//  250  505:goto            90
			}
			if(i == 0)
				break;
	//  251  508:iload_3         
	//  252  509:ifeq            521
			j++;
	//  253  512:iload           4
	//  254  514:iconst_1        
	//  255  515:iadd            
	//  256  516:istore          4
		} while(true);
	//  257  518:goto            24
		arraylist = ((ArrayList) (new bqz()));
	//  258  521:new             #158 <Class bqz>
	//  259  524:dup             
	//  260  525:invokespecial   #159 <Method void bqz()>
	//  261  528:astore_1        
		c = "";
	//  262  529:aload_0         
	//  263  530:ldc1            #139 <String "">
	//  264  532:putfield        #161 <Field String c>
		arraylist1 = ((ArrayList) (hashset.iterator()));
	//  265  535:aload           12
	//  266  537:invokevirtual   #165 <Method Iterator HashSet.iterator()>
	//  267  540:astore_2        
_L2:
		String s1;
		if(!((Iterator) (arraylist1)).hasNext())
			break; /* Loop/switch isn't completed */
	//  268  541:aload_2         
	//  269  542:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//  270  547:ifeq            584
		s1 = (String)((Iterator) (arraylist1)).next();
	//  271  550:aload_2         
	//  272  551:invokeinterface #175 <Method Object Iterator.next()>
	//  273  556:checkcast       #90  <Class String>
	//  274  559:astore          10
		((bqz) (arraylist)).a(a.a(s1));
	//  275  561:aload_1         
	//  276  562:aload_0         
	//  277  563:getfield        #36  <Field bqw a>
	//  278  566:aload           10
	//  279  568:invokevirtual   #180 <Method byte[] bqw.a(String)>
	//  280  571:invokevirtual   #183 <Method void bqz.a(byte[])>
		if(true) goto _L2; else goto _L1
	//  281  574:goto            541
		arraylist1;
	//  282  577:astore_2        
		wx.b("Error while writing hash to byteStream", ((Throwable) (arraylist1)));
	//  283  578:ldc1            #185 <String "Error while writing hash to byteStream">
	//  284  580:aload_2         
	//  285  581:invokestatic    #190 <Method void wx.b(String, Throwable)>
_L1:
		return ((bqz) (arraylist)).toString();
	//  286  584:aload_1         
	//  287  585:invokevirtual   #191 <Method String bqz.toString()>
	//  288  588:areturn         
	}

	private final bqw a;
	private final int b;
	private String c;
	private String d;
	private final boolean e = false;
	private final int f;
	private final int g;
}
