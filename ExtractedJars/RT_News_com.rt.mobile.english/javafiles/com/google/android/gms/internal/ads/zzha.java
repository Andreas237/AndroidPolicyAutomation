// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgz, zzhb, zzgp, zzgu, 
//			zzgt, zzgq, zzakb

public final class zzha
{

	public zzha(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzaiz = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int zzaiz>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean zzajl>
		if(j <= 64 && j >= 0)
	//*   8   14:iload_2         
	//*   9   15:bipush          64
	//*  10   17:icmpgt          35
	//*  11   20:iload_2         
	//*  12   21:ifge            27
	//*  13   24:goto            35
			zzajm = j;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #27  <Field int zzajm>
		else
	//*  17   32:goto            41
			zzajm = 64;
	//   18   35:aload_0         
	//   19   36:bipush          64
	//   20   38:putfield        #27  <Field int zzajm>
		if(k <= 0)
	//*  21   41:iload_3         
	//*  22   42:ifgt            53
			zzajn = 1;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #29  <Field int zzajn>
		else
	//*  26   50:goto            58
			zzajn = k;
	//   27   53:aload_0         
	//   28   54:iload_3         
	//   29   55:putfield        #29  <Field int zzajn>
		zzajb = ((zzgq) (new zzgz(zzajm)));
	//   30   58:aload_0         
	//   31   59:new             #31  <Class zzgz>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:getfield        #27  <Field int zzajm>
	//   35   67:invokespecial   #34  <Method void zzgz(int)>
	//   36   70:putfield        #36  <Field zzgq zzajb>
	//   37   73:return          
	}

	public final String zza(ArrayList arraylist, ArrayList arraylist1)
	{
		Collections.sort(((java.util.List) (arraylist1)), ((java.util.Comparator) (new zzhb(this))));
	//    0    0:aload_2         
	//    1    1:new             #43  <Class zzhb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #46  <Method void zzhb(zzha)>
	//    5    9:invokestatic    #52  <Method void Collections.sort(java.util.List, java.util.Comparator)>
		HashSet hashset = new HashSet();
	//    6   12:new             #54  <Class HashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #55  <Method void HashSet()>
	//    9   19:astore          10
		int k = 0;
	//   10   21:iconst_0        
	//   11   22:istore          4
label0:
		do
		{
			boolean flag;
label1:
			{
				if(k >= arraylist1.size())
					break label0;
	//   12   24:iload           4
	//   13   26:aload_2         
	//   14   27:invokevirtual   #61  <Method int ArrayList.size()>
	//   15   30:icmpge          504
				String as[] = Normalizer.normalize((CharSequence)arraylist.get(((zzgp)arraylist1.get(k)).zzhf()), java.text.Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:iload           4
	//   19   37:invokevirtual   #65  <Method Object ArrayList.get(int)>
	//   20   40:checkcast       #67  <Class zzgp>
	//   21   43:invokevirtual   #70  <Method int zzgp.zzhf()>
	//   22   46:invokevirtual   #65  <Method Object ArrayList.get(int)>
	//   23   49:checkcast       #72  <Class CharSequence>
	//   24   52:getstatic       #78  <Field java.text.Normalizer$Form java.text.Normalizer$Form.NFKC>
	//   25   55:invokestatic    #84  <Method String Normalizer.normalize(CharSequence, java.text.Normalizer$Form)>
	//   26   58:getstatic       #90  <Field Locale Locale.US>
	//   27   61:invokevirtual   #96  <Method String String.toLowerCase(Locale)>
	//   28   64:ldc1            #98  <String "\n">
	//   29   66:invokevirtual   #102 <Method String[] String.split(String)>
	//   30   69:astore          11
				if(as.length != 0)
	//*  31   71:aload           11
	//*  32   73:arraylength     
	//*  33   74:ifeq            489
				{
					int l = 0;
	//   34   77:iconst_0        
	//   35   78:istore          5
label2:
					do
					{
						Object obj;
label3:
						{
							String s2;
label4:
							{
								if(l >= as.length)
									break label2;
	//   36   80:iload           5
	//   37   82:aload           11
	//   38   84:arraylength     
	//   39   85:icmpge          489
								s2 = as[l];
	//   40   88:aload           11
	//   41   90:iload           5
	//   42   92:aaload          
	//   43   93:astore          9
								if(s2.indexOf("'") == -1)
									break label4;
	//   44   95:aload           9
	//   45   97:ldc1            #104 <String "'">
	//   46   99:invokevirtual   #108 <Method int String.indexOf(String)>
	//   47  102:iconst_m1       
	//   48  103:icmpeq          280
								obj = ((Object) (new StringBuilder(s2)));
	//   49  106:new             #110 <Class StringBuilder>
	//   50  109:dup             
	//   51  110:aload           9
	//   52  112:invokespecial   #113 <Method void StringBuilder(String)>
	//   53  115:astore          8
								int i = 1;
	//   54  117:iconst_1        
	//   55  118:istore_3        
								int i1 = 0;
	//   56  119:iconst_0        
	//   57  120:istore          6
label5:
								do
								{
label6:
									{
label7:
										{
											int k1 = i + 2;
	//   58  122:iload_3         
	//   59  123:iconst_2        
	//   60  124:iadd            
	//   61  125:istore          7
											if(k1 > ((StringBuilder) (obj)).length())
												break label5;
	//   62  127:iload           7
	//   63  129:aload           8
	//   64  131:invokevirtual   #116 <Method int StringBuilder.length()>
	//   65  134:icmpgt          248
											if(((StringBuilder) (obj)).charAt(i) != '\'')
												break label6;
	//   66  137:aload           8
	//   67  139:iload_3         
	//   68  140:invokevirtual   #120 <Method char StringBuilder.charAt(int)>
	//   69  143:bipush          39
	//   70  145:icmpne          241
											if(((StringBuilder) (obj)).charAt(i - 1) != ' ')
	//*  71  148:aload           8
	//*  72  150:iload_3         
	//*  73  151:iconst_1        
	//*  74  152:isub            
	//*  75  153:invokevirtual   #120 <Method char StringBuilder.charAt(int)>
	//*  76  156:bipush          32
	//*  77  158:icmpeq          227
											{
												i1 = i + 1;
	//   78  161:iload_3         
	//   79  162:iconst_1        
	//   80  163:iadd            
	//   81  164:istore          6
												if((((StringBuilder) (obj)).charAt(i1) == 's' || ((StringBuilder) (obj)).charAt(i1) == 'S') && (k1 == ((StringBuilder) (obj)).length() || ((StringBuilder) (obj)).charAt(k1) == ' '))
	//*  82  166:aload           8
	//*  83  168:iload           6
	//*  84  170:invokevirtual   #120 <Method char StringBuilder.charAt(int)>
	//*  85  173:bipush          115
	//*  86  175:icmpeq          190
	//*  87  178:aload           8
	//*  88  180:iload           6
	//*  89  182:invokevirtual   #120 <Method char StringBuilder.charAt(int)>
	//*  90  185:bipush          83
	//*  91  187:icmpne          227
	//*  92  190:iload           7
	//*  93  192:aload           8
	//*  94  194:invokevirtual   #116 <Method int StringBuilder.length()>
	//*  95  197:icmpeq          212
	//*  96  200:aload           8
	//*  97  202:iload           7
	//*  98  204:invokevirtual   #120 <Method char StringBuilder.charAt(int)>
	//*  99  207:bipush          32
	//* 100  209:icmpne          227
												{
													((StringBuilder) (obj)).insert(i, ' ');
	//  101  212:aload           8
	//  102  214:iload_3         
	//  103  215:bipush          32
	//  104  217:invokevirtual   #124 <Method StringBuilder StringBuilder.insert(int, char)>
	//  105  220:pop             
													i = k1;
	//  106  221:iload           7
	//  107  223:istore_3        
													break label7;
	//  108  224:goto            235
												}
											}
											((StringBuilder) (obj)).setCharAt(i, ' ');
	//  109  227:aload           8
	//  110  229:iload_3         
	//  111  230:bipush          32
	//  112  232:invokevirtual   #128 <Method void StringBuilder.setCharAt(int, char)>
										}
										i1 = 1;
	//  113  235:iconst_1        
	//  114  236:istore          6
									}
	//* 115  238:goto            241
									i++;
	//  116  241:iload_3         
	//  117  242:iconst_1        
	//  118  243:iadd            
	//  119  244:istore_3        
								} while(true);
	//  120  245:goto            122
								if(i1 != 0)
	//* 121  248:iload           6
	//* 122  250:ifeq            263
									obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  123  253:aload           8
	//  124  255:invokevirtual   #132 <Method String StringBuilder.toString()>
	//  125  258:astore          8
								else
	//* 126  260:goto            266
									obj = null;
	//  127  263:aconst_null     
	//  128  264:astore          8
								if(obj != null)
	//* 129  266:aload           8
	//* 130  268:ifnull          280
								{
									zzajk = ((String) (obj));
	//  131  271:aload_0         
	//  132  272:aload           8
	//  133  274:putfield        #134 <Field String zzajk>
									break label3;
	//  134  277:goto            284
								}
							}
							obj = ((Object) (s2));
	//  135  280:aload           9
	//  136  282:astore          8
						}
label8:
						{
label9:
							{
								String as1[] = zzgu.zzb(((String) (obj)), true);
	//  137  284:aload           8
	//  138  286:iconst_1        
	//  139  287:invokestatic    #140 <Method String[] zzgu.zzb(String, boolean)>
	//  140  290:astore          12
								if(as1.length < zzajn)
									break label8;
	//  141  292:aload           12
	//  142  294:arraylength     
	//  143  295:aload_0         
	//  144  296:getfield        #29  <Field int zzajn>
	//  145  299:icmplt          480
								int j = 0;
	//  146  302:iconst_0        
	//  147  303:istore_3        
label10:
								do
								{
									int j1;
									String s;
label11:
									{
										if(j >= as1.length)
											break label10;
	//  148  304:iload_3         
	//  149  305:aload           12
	//  150  307:arraylength     
	//  151  308:icmpge          463
										s = "";
	//  152  311:ldc1            #142 <String "">
	//  153  313:astore          8
										for(j1 = 0; j1 < zzajn; j1++)
	//* 154  315:iconst_0        
	//* 155  316:istore          6
	//* 156  318:iload           6
	//* 157  320:aload_0         
	//* 158  321:getfield        #29  <Field int zzajn>
	//* 159  324:icmpge          425
										{
											int l1 = j + j1;
	//  160  327:iload_3         
	//  161  328:iload           6
	//  162  330:iadd            
	//  163  331:istore          7
											if(l1 >= as1.length)
	//* 164  333:iload           7
	//* 165  335:aload           12
	//* 166  337:arraylength     
	//* 167  338:icmplt          347
											{
												j1 = 0;
	//  168  341:iconst_0        
	//  169  342:istore          6
												break label11;
	//  170  344:goto            428
											}
											String s3 = s;
	//  171  347:aload           8
	//  172  349:astore          9
											if(j1 > 0)
	//* 173  351:iload           6
	//* 174  353:ifle            368
												s3 = String.valueOf(((Object) (s))).concat(" ");
	//  175  356:aload           8
	//  176  358:invokestatic    #146 <Method String String.valueOf(Object)>
	//  177  361:ldc1            #148 <String " ">
	//  178  363:invokevirtual   #152 <Method String String.concat(String)>
	//  179  366:astore          9
											s = String.valueOf(((Object) (s3)));
	//  180  368:aload           9
	//  181  370:invokestatic    #146 <Method String String.valueOf(Object)>
	//  182  373:astore          8
											s3 = String.valueOf(((Object) (as1[l1])));
	//  183  375:aload           12
	//  184  377:iload           7
	//  185  379:aaload          
	//  186  380:invokestatic    #146 <Method String String.valueOf(Object)>
	//  187  383:astore          9
											if(s3.length() != 0)
	//* 188  385:aload           9
	//* 189  387:invokevirtual   #153 <Method int String.length()>
	//* 190  390:ifeq            405
												s = s.concat(s3);
	//  191  393:aload           8
	//  192  395:aload           9
	//  193  397:invokevirtual   #152 <Method String String.concat(String)>
	//  194  400:astore          8
											else
	//* 195  402:goto            416
												s = new String(s);
	//  196  405:new             #92  <Class String>
	//  197  408:dup             
	//  198  409:aload           8
	//  199  411:invokespecial   #154 <Method void String(String)>
	//  200  414:astore          8
										}

	//  201  416:iload           6
	//  202  418:iconst_1        
	//  203  419:iadd            
	//  204  420:istore          6
	//* 205  422:goto            318
										j1 = 1;
	//  206  425:iconst_1        
	//  207  426:istore          6
									}
									if(j1 == 0)
										break;
	//  208  428:iload           6
	//  209  430:ifeq            463
									hashset.add(((Object) (s)));
	//  210  433:aload           10
	//  211  435:aload           8
	//  212  437:invokevirtual   #158 <Method boolean HashSet.add(Object)>
	//  213  440:pop             
									if(hashset.size() >= zzaiz)
	//* 214  441:aload           10
	//* 215  443:invokevirtual   #159 <Method int HashSet.size()>
	//* 216  446:aload_0         
	//* 217  447:getfield        #23  <Field int zzaiz>
	//* 218  450:icmplt          456
										break label9;
	//  219  453:goto            475
									j++;
	//  220  456:iload_3         
	//  221  457:iconst_1        
	//  222  458:iadd            
	//  223  459:istore_3        
								} while(true);
	//  224  460:goto            304
								if(hashset.size() < zzaiz)
									break label8;
	//  225  463:aload           10
	//  226  465:invokevirtual   #159 <Method int HashSet.size()>
	//  227  468:aload_0         
	//  228  469:getfield        #23  <Field int zzaiz>
	//  229  472:icmplt          480
							}
							flag = false;
	//  230  475:iconst_0        
	//  231  476:istore_3        
							break label1;
	//  232  477:goto            491
						}
						l++;
	//  233  480:iload           5
	//  234  482:iconst_1        
	//  235  483:iadd            
	//  236  484:istore          5
					} while(true);
	//  237  486:goto            80
				}
				flag = true;
	//  238  489:iconst_1        
	//  239  490:istore_3        
			}
			if(!flag)
				break;
	//  240  491:iload_3         
	//  241  492:ifeq            504
			k++;
	//  242  495:iload           4
	//  243  497:iconst_1        
	//  244  498:iadd            
	//  245  499:istore          4
		} while(true);
	//  246  501:goto            24
		arraylist = ((ArrayList) (new zzgt()));
	//  247  504:new             #161 <Class zzgt>
	//  248  507:dup             
	//  249  508:invokespecial   #162 <Method void zzgt()>
	//  250  511:astore_1        
		zzajj = "";
	//  251  512:aload_0         
	//  252  513:ldc1            #142 <String "">
	//  253  515:putfield        #164 <Field String zzajj>
		arraylist1 = ((ArrayList) (hashset.iterator()));
	//  254  518:aload           10
	//  255  520:invokevirtual   #168 <Method Iterator HashSet.iterator()>
	//  256  523:astore_2        
_L2:
		String s1;
		if(!((Iterator) (arraylist1)).hasNext())
			break; /* Loop/switch isn't completed */
	//  257  524:aload_2         
	//  258  525:invokeinterface #174 <Method boolean Iterator.hasNext()>
	//  259  530:ifeq            567
		s1 = (String)((Iterator) (arraylist1)).next();
	//  260  533:aload_2         
	//  261  534:invokeinterface #178 <Method Object Iterator.next()>
	//  262  539:checkcast       #92  <Class String>
	//  263  542:astore          8
		((zzgt) (arraylist)).write(zzajb.zzx(s1));
	//  264  544:aload_1         
	//  265  545:aload_0         
	//  266  546:getfield        #36  <Field zzgq zzajb>
	//  267  549:aload           8
	//  268  551:invokevirtual   #184 <Method byte[] zzgq.zzx(String)>
	//  269  554:invokevirtual   #188 <Method void zzgt.write(byte[])>
		if(true) goto _L2; else goto _L1
	//  270  557:goto            524
		arraylist1;
	//  271  560:astore_2        
		zzakb.zzb("Error while writing hash to byteStream", ((Throwable) (arraylist1)));
	//  272  561:ldc1            #190 <String "Error while writing hash to byteStream">
	//  273  563:aload_2         
	//  274  564:invokestatic    #195 <Method void zzakb.zzb(String, Throwable)>
_L1:
		return ((zzgt) (arraylist)).toString();
	//  275  567:aload_1         
	//  276  568:invokevirtual   #196 <Method String zzgt.toString()>
	//  277  571:areturn         
	}

	private final int zzaiz;
	private final zzgq zzajb;
	private String zzajj;
	private String zzajk;
	private final boolean zzajl = false;
	private final int zzajm;
	private final int zzajn;
}
