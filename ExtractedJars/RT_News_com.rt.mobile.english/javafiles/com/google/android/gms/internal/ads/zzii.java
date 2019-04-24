// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfl, zzbez, zzib, 
//			zzim, zzih, zzig, zzit, 
//			zzia, zzbfa, zzbfi

public final class zzii extends zzbfc
{

	public zzii()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zzbfc()>
		zzang = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field Integer zzang>
		zzanh = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field String zzanh>
		zzani = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field Integer zzani>
		zzanj = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #35  <Field Integer zzanj>
		zzank = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #37  <Field zzit zzank>
		zzanl = zzbfl.zzebz;
	//   17   29:aload_0         
	//   18   30:getstatic       #42  <Field long[] zzbfl.zzebz>
	//   19   33:putfield        #44  <Field long[] zzanl>
		zzanm = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #46  <Field zzig zzanm>
		zzann = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #48  <Field zzih zzann>
		zzano = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #50  <Field zzim zzano>
		zzanp = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #52  <Field zzib zzanp>
		zzebk = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #56  <Field zzbfe zzebk>
		zzebt = -1;
	//   35   61:aload_0         
	//   36   62:iconst_m1       
	//   37   63:putfield        #60  <Field int zzebt>
	//   38   66:return          
	}

	private final zzii zzk(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
label0:
		do
		{
label1:
			{
label2:
				{
label3:
					{
						int i;
label4:
						{
							i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
							Object obj;
							switch(i)
	//*   3    5:iload_2         
							{
	//*   4    6:lookupswitch    12: default 112
	//	               0: 561
	//	               72: 547
	//	               82: 536
	//	               88: 522
	//	               96: 485
	//	               106: 452
	//	               112: 354
	//	               114: 231
	//	               122: 204
	//	               130: 177
	//	               138: 150
	//	               146: 123
							default:
								if(!super.zza(zzbez1, i))
	//*   5  112:aload_0         
	//*   6  113:aload_1         
	//*   7  114:iload_2         
	//*   8  115:invokespecial   #77  <Method boolean zzbfc.zza(zzbez, int)>
	//*   9  118:ifne            0
									return this;
	//   10  121:aload_0         
	//   11  122:areturn         
								continue;

							case 0: // '\0'
								break label0;

							case 72: // 'H'
								break label1;

							case 82: // 'R'
								break label2;

							case 88: // 'X'
								break label3;

							case 96: // '`'
								break label4;

							case 146: 
								if(zzanp == null)
	//*  12  123:aload_0         
	//*  13  124:getfield        #52  <Field zzib zzanp>
	//*  14  127:ifnonnull       141
									zzanp = new zzib();
	//   15  130:aload_0         
	//   16  131:new             #79  <Class zzib>
	//   17  134:dup             
	//   18  135:invokespecial   #80  <Method void zzib()>
	//   19  138:putfield        #52  <Field zzib zzanp>
								obj = ((Object) (zzanp));
	//   20  141:aload_0         
	//   21  142:getfield        #52  <Field zzib zzanp>
	//   22  145:astore          5
								break;
	//   23  147:goto            476

							case 138: 
								if(zzano == null)
	//*  24  150:aload_0         
	//*  25  151:getfield        #50  <Field zzim zzano>
	//*  26  154:ifnonnull       168
									zzano = new zzim();
	//   27  157:aload_0         
	//   28  158:new             #82  <Class zzim>
	//   29  161:dup             
	//   30  162:invokespecial   #83  <Method void zzim()>
	//   31  165:putfield        #50  <Field zzim zzano>
								obj = ((Object) (zzano));
	//   32  168:aload_0         
	//   33  169:getfield        #50  <Field zzim zzano>
	//   34  172:astore          5
								break;
	//   35  174:goto            476

							case 130: 
								if(zzann == null)
	//*  36  177:aload_0         
	//*  37  178:getfield        #48  <Field zzih zzann>
	//*  38  181:ifnonnull       195
									zzann = new zzih();
	//   39  184:aload_0         
	//   40  185:new             #85  <Class zzih>
	//   41  188:dup             
	//   42  189:invokespecial   #86  <Method void zzih()>
	//   43  192:putfield        #48  <Field zzih zzann>
								obj = ((Object) (zzann));
	//   44  195:aload_0         
	//   45  196:getfield        #48  <Field zzih zzann>
	//   46  199:astore          5
								break;
	//   47  201:goto            476

							case 122: // 'z'
								if(zzanm == null)
	//*  48  204:aload_0         
	//*  49  205:getfield        #46  <Field zzig zzanm>
	//*  50  208:ifnonnull       222
									zzanm = new zzig();
	//   51  211:aload_0         
	//   52  212:new             #88  <Class zzig>
	//   53  215:dup             
	//   54  216:invokespecial   #89  <Method void zzig()>
	//   55  219:putfield        #46  <Field zzig zzanm>
								obj = ((Object) (zzanm));
	//   56  222:aload_0         
	//   57  223:getfield        #46  <Field zzig zzanm>
	//   58  226:astore          5
								break;
	//   59  228:goto            476

							case 114: // 'r'
								int i1 = zzbez1.zzbr(zzbez1.zzacc());
	//   60  231:aload_1         
	//   61  232:aload_1         
	//   62  233:invokevirtual   #92  <Method int zzbez.zzacc()>
	//   63  236:invokevirtual   #96  <Method int zzbez.zzbr(int)>
	//   64  239:istore          4
								i = zzbez1.getPosition();
	//   65  241:aload_1         
	//   66  242:invokevirtual   #99  <Method int zzbez.getPosition()>
	//   67  245:istore_2        
								int j;
								for(j = 0; zzbez1.zzagn() > 0; j++)
	//*  68  246:iconst_0        
	//*  69  247:istore_3        
	//*  70  248:aload_1         
	//*  71  249:invokevirtual   #102 <Method int zzbez.zzagn()>
	//*  72  252:ifle            267
									zzbez1.zzacd();
	//   73  255:aload_1         
	//   74  256:invokevirtual   #106 <Method long zzbez.zzacd()>
	//   75  259:pop2            

	//   76  260:iload_3         
	//   77  261:iconst_1        
	//   78  262:iadd            
	//   79  263:istore_3        
	//*  80  264:goto            248
								zzbez1.zzdc(i);
	//   81  267:aload_1         
	//   82  268:iload_2         
	//   83  269:invokevirtual   #110 <Method void zzbez.zzdc(int)>
								if(zzanl == null)
	//*  84  272:aload_0         
	//*  85  273:getfield        #44  <Field long[] zzanl>
	//*  86  276:ifnonnull       284
									i = 0;
	//   87  279:iconst_0        
	//   88  280:istore_2        
								else
	//*  89  281:goto            290
									i = zzanl.length;
	//   90  284:aload_0         
	//   91  285:getfield        #44  <Field long[] zzanl>
	//   92  288:arraylength     
	//   93  289:istore_2        
								obj = ((Object) (new long[j + i]));
	//   94  290:iload_3         
	//   95  291:iload_2         
	//   96  292:iadd            
	//   97  293:newarray        long[]
	//   98  295:astore          5
								j = i;
	//   99  297:iload_2         
	//  100  298:istore_3        
								if(i != 0)
	//* 101  299:iload_2         
	//* 102  300:ifeq            317
								{
									System.arraycopy(((Object) (zzanl)), 0, obj, 0, i);
	//  103  303:aload_0         
	//  104  304:getfield        #44  <Field long[] zzanl>
	//  105  307:iconst_0        
	//  106  308:aload           5
	//  107  310:iconst_0        
	//  108  311:iload_2         
	//  109  312:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
									j = i;
	//  110  315:iload_2         
	//  111  316:istore_3        
								}
								for(; j < obj.length; j++)
	//* 112  317:iload_3         
	//* 113  318:aload           5
	//* 114  320:arraylength     
	//* 115  321:icmpge          339
									obj[j] = zzbez1.zzacd();
	//  116  324:aload           5
	//  117  326:iload_3         
	//  118  327:aload_1         
	//  119  328:invokevirtual   #106 <Method long zzbez.zzacd()>
	//  120  331:lastore         

	//  121  332:iload_3         
	//  122  333:iconst_1        
	//  123  334:iadd            
	//  124  335:istore_3        
	//* 125  336:goto            317
								zzanl = ((long []) (obj));
	//  126  339:aload_0         
	//  127  340:aload           5
	//  128  342:putfield        #44  <Field long[] zzanl>
								zzbez1.zzbs(i1);
	//  129  345:aload_1         
	//  130  346:iload           4
	//  131  348:invokevirtual   #119 <Method void zzbez.zzbs(int)>
								continue;
	//  132  351:goto            0

							case 112: // 'p'
								int k = zzbfl.zzb(zzbez1, 112);
	//  133  354:aload_1         
	//  134  355:bipush          112
	//  135  357:invokestatic    #123 <Method int zzbfl.zzb(zzbez, int)>
	//  136  360:istore_3        
								if(zzanl == null)
	//* 137  361:aload_0         
	//* 138  362:getfield        #44  <Field long[] zzanl>
	//* 139  365:ifnonnull       373
									i = 0;
	//  140  368:iconst_0        
	//  141  369:istore_2        
								else
	//* 142  370:goto            379
									i = zzanl.length;
	//  143  373:aload_0         
	//  144  374:getfield        #44  <Field long[] zzanl>
	//  145  377:arraylength     
	//  146  378:istore_2        
								obj = ((Object) (new long[k + i]));
	//  147  379:iload_3         
	//  148  380:iload_2         
	//  149  381:iadd            
	//  150  382:newarray        long[]
	//  151  384:astore          5
								k = i;
	//  152  386:iload_2         
	//  153  387:istore_3        
								if(i != 0)
	//* 154  388:iload_2         
	//* 155  389:ifeq            406
								{
									System.arraycopy(((Object) (zzanl)), 0, obj, 0, i);
	//  156  392:aload_0         
	//  157  393:getfield        #44  <Field long[] zzanl>
	//  158  396:iconst_0        
	//  159  397:aload           5
	//  160  399:iconst_0        
	//  161  400:iload_2         
	//  162  401:invokestatic    #116 <Method void System.arraycopy(Object, int, Object, int, int)>
									k = i;
	//  163  404:iload_2         
	//  164  405:istore_3        
								}
								for(; k < obj.length - 1; k++)
	//* 165  406:iload_3         
	//* 166  407:aload           5
	//* 167  409:arraylength     
	//* 168  410:iconst_1        
	//* 169  411:isub            
	//* 170  412:icmpge          435
								{
									obj[k] = zzbez1.zzacd();
	//  171  415:aload           5
	//  172  417:iload_3         
	//  173  418:aload_1         
	//  174  419:invokevirtual   #106 <Method long zzbez.zzacd()>
	//  175  422:lastore         
									zzbez1.zzabk();
	//  176  423:aload_1         
	//  177  424:invokevirtual   #73  <Method int zzbez.zzabk()>
	//  178  427:pop             
								}

	//  179  428:iload_3         
	//  180  429:iconst_1        
	//  181  430:iadd            
	//  182  431:istore_3        
	//* 183  432:goto            406
								obj[k] = zzbez1.zzacd();
	//  184  435:aload           5
	//  185  437:iload_3         
	//  186  438:aload_1         
	//  187  439:invokevirtual   #106 <Method long zzbez.zzacd()>
	//  188  442:lastore         
								zzanl = ((long []) (obj));
	//  189  443:aload_0         
	//  190  444:aload           5
	//  191  446:putfield        #44  <Field long[] zzanl>
								continue;
	//  192  449:goto            0

							case 106: // 'j'
								if(zzank == null)
	//* 193  452:aload_0         
	//* 194  453:getfield        #37  <Field zzit zzank>
	//* 195  456:ifnonnull       470
									zzank = new zzit();
	//  196  459:aload_0         
	//  197  460:new             #125 <Class zzit>
	//  198  463:dup             
	//  199  464:invokespecial   #126 <Method void zzit()>
	//  200  467:putfield        #37  <Field zzit zzank>
								obj = ((Object) (zzank));
	//  201  470:aload_0         
	//  202  471:getfield        #37  <Field zzit zzank>
	//  203  474:astore          5
								break;
							}
							zzbez1.zza(((zzbfi) (obj)));
	//  204  476:aload_1         
	//  205  477:aload           5
	//  206  479:invokevirtual   #129 <Method void zzbez.zza(zzbfi)>
							continue;
	//  207  482:goto            0
						}
						int l = zzbez1.getPosition();
	//  208  485:aload_1         
	//  209  486:invokevirtual   #99  <Method int zzbez.getPosition()>
	//  210  489:istore_3        
						try
						{
							zzanj = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//  211  490:aload_0         
	//  212  491:aload_1         
	//  213  492:invokevirtual   #92  <Method int zzbez.zzacc()>
	//  214  495:invokestatic    #134 <Method int zzia.zzd(int)>
	//  215  498:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//  216  501:putfield        #35  <Field Integer zzanj>
						}
	//* 217  504:goto            0
	//* 218  507:aload_1         
	//* 219  508:iload_3         
	//* 220  509:invokevirtual   #110 <Method void zzbez.zzdc(int)>
	//* 221  512:aload_0         
	//* 222  513:aload_1         
	//* 223  514:iload_2         
	//* 224  515:invokevirtual   #77  <Method boolean zzbfc.zza(zzbez, int)>
	//* 225  518:pop             
	//* 226  519:goto            0
	//* 227  522:aload_0         
	//* 228  523:aload_1         
	//* 229  524:invokevirtual   #92  <Method int zzbez.zzacc()>
	//* 230  527:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//* 231  530:putfield        #33  <Field Integer zzani>
	//* 232  533:goto            0
	//* 233  536:aload_0         
	//* 234  537:aload_1         
	//* 235  538:invokevirtual   #144 <Method String zzbez.readString()>
	//* 236  541:putfield        #31  <Field String zzanh>
	//* 237  544:goto            0
	//* 238  547:aload_0         
	//* 239  548:aload_1         
	//* 240  549:invokevirtual   #92  <Method int zzbez.zzacc()>
	//* 241  552:invokestatic    #140 <Method Integer Integer.valueOf(int)>
	//* 242  555:putfield        #29  <Field Integer zzang>
	//* 243  558:goto            0
	//* 244  561:aload_0         
	//* 245  562:areturn         
						// Misplaced declaration of an exception variable
						catch(IllegalArgumentException illegalargumentexception)
						{
							zzbez1.zzdc(l);
							((zzbfc)this).zza(zzbez1, i);
						}
						continue;
					}
					zzani = Integer.valueOf(zzbez1.zzacc());
					continue;
				}
				zzanh = zzbez1.readString();
				continue;
			}
			zzang = Integer.valueOf(zzbez1.zzacc());
		} while(true);
		return this;
	//* 246  563:astore          5
	//* 247  565:goto            507
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzk(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method zzii zzk(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzang != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Integer zzang>
	//*   2    4:ifnull          20
			zzbfa1.zzm(9, zzang.intValue());
	//    3    7:aload_1         
	//    4    8:bipush          9
	//    5   10:aload_0         
	//    6   11:getfield        #29  <Field Integer zzang>
	//    7   14:invokevirtual   #152 <Method int Integer.intValue()>
	//    8   17:invokevirtual   #158 <Method void zzbfa.zzm(int, int)>
		if(zzanh != null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #31  <Field String zzanh>
	//*  11   24:ifnull          37
			zzbfa1.zzf(10, zzanh);
	//   12   27:aload_1         
	//   13   28:bipush          10
	//   14   30:aload_0         
	//   15   31:getfield        #31  <Field String zzanh>
	//   16   34:invokevirtual   #162 <Method void zzbfa.zzf(int, String)>
		Integer integer = zzani;
	//   17   37:aload_0         
	//   18   38:getfield        #33  <Field Integer zzani>
	//   19   41:astore          4
		int i = 0;
	//   20   43:iconst_0        
	//   21   44:istore_2        
		if(integer != null)
	//*  22   45:aload           4
	//*  23   47:ifnull          70
		{
			int j = zzani.intValue();
	//   24   50:aload_0         
	//   25   51:getfield        #33  <Field Integer zzani>
	//   26   54:invokevirtual   #152 <Method int Integer.intValue()>
	//   27   57:istore_3        
			zzbfa1.zzl(11, 0);
	//   28   58:aload_1         
	//   29   59:bipush          11
	//   30   61:iconst_0        
	//   31   62:invokevirtual   #165 <Method void zzbfa.zzl(int, int)>
			zzbfa1.zzde(j);
	//   32   65:aload_1         
	//   33   66:iload_3         
	//   34   67:invokevirtual   #168 <Method void zzbfa.zzde(int)>
		}
		if(zzanj != null)
	//*  35   70:aload_0         
	//*  36   71:getfield        #35  <Field Integer zzanj>
	//*  37   74:ifnull          90
			zzbfa1.zzm(12, zzanj.intValue());
	//   38   77:aload_1         
	//   39   78:bipush          12
	//   40   80:aload_0         
	//   41   81:getfield        #35  <Field Integer zzanj>
	//   42   84:invokevirtual   #152 <Method int Integer.intValue()>
	//   43   87:invokevirtual   #158 <Method void zzbfa.zzm(int, int)>
		if(zzank != null)
	//*  44   90:aload_0         
	//*  45   91:getfield        #37  <Field zzit zzank>
	//*  46   94:ifnull          107
			zzbfa1.zza(13, ((zzbfi) (zzank)));
	//   47   97:aload_1         
	//   48   98:bipush          13
	//   49  100:aload_0         
	//   50  101:getfield        #37  <Field zzit zzank>
	//   51  104:invokevirtual   #171 <Method void zzbfa.zza(int, zzbfi)>
		if(zzanl != null && zzanl.length > 0)
	//*  52  107:aload_0         
	//*  53  108:getfield        #44  <Field long[] zzanl>
	//*  54  111:ifnull          150
	//*  55  114:aload_0         
	//*  56  115:getfield        #44  <Field long[] zzanl>
	//*  57  118:arraylength     
	//*  58  119:ifle            150
			for(; i < zzanl.length; i++)
	//*  59  122:iload_2         
	//*  60  123:aload_0         
	//*  61  124:getfield        #44  <Field long[] zzanl>
	//*  62  127:arraylength     
	//*  63  128:icmpge          150
				zzbfa1.zza(14, zzanl[i]);
	//   64  131:aload_1         
	//   65  132:bipush          14
	//   66  134:aload_0         
	//   67  135:getfield        #44  <Field long[] zzanl>
	//   68  138:iload_2         
	//   69  139:laload          
	//   70  140:invokevirtual   #174 <Method void zzbfa.zza(int, long)>

	//   71  143:iload_2         
	//   72  144:iconst_1        
	//   73  145:iadd            
	//   74  146:istore_2        
	//*  75  147:goto            122
		if(zzanm != null)
	//*  76  150:aload_0         
	//*  77  151:getfield        #46  <Field zzig zzanm>
	//*  78  154:ifnull          167
			zzbfa1.zza(15, ((zzbfi) (zzanm)));
	//   79  157:aload_1         
	//   80  158:bipush          15
	//   81  160:aload_0         
	//   82  161:getfield        #46  <Field zzig zzanm>
	//   83  164:invokevirtual   #171 <Method void zzbfa.zza(int, zzbfi)>
		if(zzann != null)
	//*  84  167:aload_0         
	//*  85  168:getfield        #48  <Field zzih zzann>
	//*  86  171:ifnull          184
			zzbfa1.zza(16, ((zzbfi) (zzann)));
	//   87  174:aload_1         
	//   88  175:bipush          16
	//   89  177:aload_0         
	//   90  178:getfield        #48  <Field zzih zzann>
	//   91  181:invokevirtual   #171 <Method void zzbfa.zza(int, zzbfi)>
		if(zzano != null)
	//*  92  184:aload_0         
	//*  93  185:getfield        #50  <Field zzim zzano>
	//*  94  188:ifnull          201
			zzbfa1.zza(17, ((zzbfi) (zzano)));
	//   95  191:aload_1         
	//   96  192:bipush          17
	//   97  194:aload_0         
	//   98  195:getfield        #50  <Field zzim zzano>
	//   99  198:invokevirtual   #171 <Method void zzbfa.zza(int, zzbfi)>
		if(zzanp != null)
	//* 100  201:aload_0         
	//* 101  202:getfield        #52  <Field zzib zzanp>
	//* 102  205:ifnull          218
			zzbfa1.zza(18, ((zzbfi) (zzanp)));
	//  103  208:aload_1         
	//  104  209:bipush          18
	//  105  211:aload_0         
	//  106  212:getfield        #52  <Field zzib zzanp>
	//  107  215:invokevirtual   #171 <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//  108  218:aload_0         
	//  109  219:aload_1         
	//  110  220:invokespecial   #176 <Method void zzbfc.zza(zzbfa)>
	//  111  223:return          
	}

	protected final int zzr()
	{
		int i = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #179 <Method int zzbfc.zzr()>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(zzang != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #29  <Field Integer zzang>
	//*   7   11:ifnull          29
			j = i + zzbfa.zzq(9, zzang.intValue());
	//    8   14:iload_1         
	//    9   15:bipush          9
	//   10   17:aload_0         
	//   11   18:getfield        #29  <Field Integer zzang>
	//   12   21:invokevirtual   #152 <Method int Integer.intValue()>
	//   13   24:invokestatic    #183 <Method int zzbfa.zzq(int, int)>
	//   14   27:iadd            
	//   15   28:istore_2        
		i = j;
	//   16   29:iload_2         
	//   17   30:istore_1        
		if(zzanh != null)
	//*  18   31:aload_0         
	//*  19   32:getfield        #31  <Field String zzanh>
	//*  20   35:ifnull          50
			i = j + zzbfa.zzg(10, zzanh);
	//   21   38:iload_2         
	//   22   39:bipush          10
	//   23   41:aload_0         
	//   24   42:getfield        #31  <Field String zzanh>
	//   25   45:invokestatic    #187 <Method int zzbfa.zzg(int, String)>
	//   26   48:iadd            
	//   27   49:istore_1        
		j = i;
	//   28   50:iload_1         
	//   29   51:istore_2        
		if(zzani != null)
	//*  30   52:aload_0         
	//*  31   53:getfield        #33  <Field Integer zzani>
	//*  32   56:ifnull          80
		{
			j = zzani.intValue();
	//   33   59:aload_0         
	//   34   60:getfield        #33  <Field Integer zzani>
	//   35   63:invokevirtual   #152 <Method int Integer.intValue()>
	//   36   66:istore_2        
			j = i + (zzbfa.zzcd(11) + zzbfa.zzcl(j));
	//   37   67:iload_1         
	//   38   68:bipush          11
	//   39   70:invokestatic    #190 <Method int zzbfa.zzcd(int)>
	//   40   73:iload_2         
	//   41   74:invokestatic    #193 <Method int zzbfa.zzcl(int)>
	//   42   77:iadd            
	//   43   78:iadd            
	//   44   79:istore_2        
		}
		int k = j;
	//   45   80:iload_2         
	//   46   81:istore_3        
		if(zzanj != null)
	//*  47   82:aload_0         
	//*  48   83:getfield        #35  <Field Integer zzanj>
	//*  49   86:ifnull          104
			k = j + zzbfa.zzq(12, zzanj.intValue());
	//   50   89:iload_2         
	//   51   90:bipush          12
	//   52   92:aload_0         
	//   53   93:getfield        #35  <Field Integer zzanj>
	//   54   96:invokevirtual   #152 <Method int Integer.intValue()>
	//   55   99:invokestatic    #183 <Method int zzbfa.zzq(int, int)>
	//   56  102:iadd            
	//   57  103:istore_3        
		i = k;
	//   58  104:iload_3         
	//   59  105:istore_1        
		if(zzank != null)
	//*  60  106:aload_0         
	//*  61  107:getfield        #37  <Field zzit zzank>
	//*  62  110:ifnull          125
			i = k + zzbfa.zzb(13, ((zzbfi) (zzank)));
	//   63  113:iload_3         
	//   64  114:bipush          13
	//   65  116:aload_0         
	//   66  117:getfield        #37  <Field zzit zzank>
	//   67  120:invokestatic    #196 <Method int zzbfa.zzb(int, zzbfi)>
	//   68  123:iadd            
	//   69  124:istore_1        
		j = i;
	//   70  125:iload_1         
	//   71  126:istore_2        
		if(zzanl != null)
	//*  72  127:aload_0         
	//*  73  128:getfield        #44  <Field long[] zzanl>
	//*  74  131:ifnull          188
		{
			j = i;
	//   75  134:iload_1         
	//   76  135:istore_2        
			if(zzanl.length > 0)
	//*  77  136:aload_0         
	//*  78  137:getfield        #44  <Field long[] zzanl>
	//*  79  140:arraylength     
	//*  80  141:ifle            188
			{
				j = 0;
	//   81  144:iconst_0        
	//   82  145:istore_2        
				int l = 0;
	//   83  146:iconst_0        
	//   84  147:istore_3        
				for(; j < zzanl.length; j++)
	//*  85  148:iload_2         
	//*  86  149:aload_0         
	//*  87  150:getfield        #44  <Field long[] zzanl>
	//*  88  153:arraylength     
	//*  89  154:icmpge          176
					l += zzbfa.zzy(zzanl[j]);
	//   90  157:iload_3         
	//   91  158:aload_0         
	//   92  159:getfield        #44  <Field long[] zzanl>
	//   93  162:iload_2         
	//   94  163:laload          
	//   95  164:invokestatic    #200 <Method int zzbfa.zzy(long)>
	//   96  167:iadd            
	//   97  168:istore_3        

	//   98  169:iload_2         
	//   99  170:iconst_1        
	//  100  171:iadd            
	//  101  172:istore_2        
	//* 102  173:goto            148
				j = i + l + 1 * zzanl.length;
	//  103  176:iload_1         
	//  104  177:iload_3         
	//  105  178:iadd            
	//  106  179:iconst_1        
	//  107  180:aload_0         
	//  108  181:getfield        #44  <Field long[] zzanl>
	//  109  184:arraylength     
	//  110  185:imul            
	//  111  186:iadd            
	//  112  187:istore_2        
			}
		}
		i = j;
	//  113  188:iload_2         
	//  114  189:istore_1        
		if(zzanm != null)
	//* 115  190:aload_0         
	//* 116  191:getfield        #46  <Field zzig zzanm>
	//* 117  194:ifnull          209
			i = j + zzbfa.zzb(15, ((zzbfi) (zzanm)));
	//  118  197:iload_2         
	//  119  198:bipush          15
	//  120  200:aload_0         
	//  121  201:getfield        #46  <Field zzig zzanm>
	//  122  204:invokestatic    #196 <Method int zzbfa.zzb(int, zzbfi)>
	//  123  207:iadd            
	//  124  208:istore_1        
		j = i;
	//  125  209:iload_1         
	//  126  210:istore_2        
		if(zzann != null)
	//* 127  211:aload_0         
	//* 128  212:getfield        #48  <Field zzih zzann>
	//* 129  215:ifnull          230
			j = i + zzbfa.zzb(16, ((zzbfi) (zzann)));
	//  130  218:iload_1         
	//  131  219:bipush          16
	//  132  221:aload_0         
	//  133  222:getfield        #48  <Field zzih zzann>
	//  134  225:invokestatic    #196 <Method int zzbfa.zzb(int, zzbfi)>
	//  135  228:iadd            
	//  136  229:istore_2        
		i = j;
	//  137  230:iload_2         
	//  138  231:istore_1        
		if(zzano != null)
	//* 139  232:aload_0         
	//* 140  233:getfield        #50  <Field zzim zzano>
	//* 141  236:ifnull          251
			i = j + zzbfa.zzb(17, ((zzbfi) (zzano)));
	//  142  239:iload_2         
	//  143  240:bipush          17
	//  144  242:aload_0         
	//  145  243:getfield        #50  <Field zzim zzano>
	//  146  246:invokestatic    #196 <Method int zzbfa.zzb(int, zzbfi)>
	//  147  249:iadd            
	//  148  250:istore_1        
		j = i;
	//  149  251:iload_1         
	//  150  252:istore_2        
		if(zzanp != null)
	//* 151  253:aload_0         
	//* 152  254:getfield        #52  <Field zzib zzanp>
	//* 153  257:ifnull          272
			j = i + zzbfa.zzb(18, ((zzbfi) (zzanp)));
	//  154  260:iload_1         
	//  155  261:bipush          18
	//  156  263:aload_0         
	//  157  264:getfield        #52  <Field zzib zzanp>
	//  158  267:invokestatic    #196 <Method int zzbfa.zzb(int, zzbfi)>
	//  159  270:iadd            
	//  160  271:istore_2        
		return j;
	//  161  272:iload_2         
	//  162  273:ireturn         
	}

	private Integer zzang;
	public String zzanh;
	private Integer zzani;
	private Integer zzanj;
	private zzit zzank;
	public long zzanl[];
	public zzig zzanm;
	private zzih zzann;
	private zzim zzano;
	public zzib zzanp;
}
