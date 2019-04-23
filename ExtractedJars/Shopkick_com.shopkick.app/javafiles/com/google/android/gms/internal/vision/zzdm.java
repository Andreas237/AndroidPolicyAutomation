// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjw, zzdt, zzjr, 
//			zzjk, zzjl, zzjt

public final class zzdm extends zzjn
{

	public zzdm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zzjn()>
		name = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field String name>
		zzop = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field String zzop>
		zzoq = zzjw.zzady;
	//    8   14:aload_0         
	//    9   15:getstatic       #33  <Field String[] zzjw.zzady>
	//   10   18:putfield        #35  <Field String[] zzoq>
		zzos = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #37  <Field String zzos>
		zzot = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #39  <Field Long zzot>
		zzou = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #41  <Field Long zzou>
		zzov = zzdt.zzcd();
	//   20   36:aload_0         
	//   21   37:invokestatic    #47  <Method zzdt[] zzdt.zzcd()>
	//   22   40:putfield        #49  <Field zzdt[] zzov>
		zzadp = -1;
	//   23   43:aload_0         
	//   24   44:iconst_m1       
	//   25   45:putfield        #53  <Field int zzadp>
	//   26   48:return          
	}

	public static zzdm[] zzcb()
	{
		if(zzoo == null)
	//*   0    0:getstatic       #58  <Field zzdm[] zzoo>
	//*   1    3:ifnonnull       35
			synchronized(zzjr.zzado)
	//*   2    6:getstatic       #64  <Field Object zzjr.zzado>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzoo == null)
	//*   6   12:getstatic       #58  <Field zzdm[] zzoo>
	//*   7   15:ifnonnull       25
					zzoo = new zzdm[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzdm[]
	//   10   22:putstatic       #58  <Field zzdm[] zzoo>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzoo;
	//   19   35:getstatic       #58  <Field zzdm[] zzoo>
	//   20   38:areturn         
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
label0:
		do
			do
			{
				int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #74  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            422
				{
					if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          411
					{
						if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          400
						{
							if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          299
							{
								if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          230
								{
									if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          219
									{
										if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          205
										{
											if(i != 56)
	//*  23   45:iload_2         
	//*  24   46:bipush          56
	//*  25   48:icmpeq          191
											{
												if(i != 66)
	//*  26   51:iload_2         
	//*  27   52:bipush          66
	//*  28   54:icmpeq          68
												{
													if(!super.zza(zzjk1, i))
	//*  29   57:aload_0         
	//*  30   58:aload_1         
	//*  31   59:iload_2         
	//*  32   60:invokespecial   #77  <Method boolean zzjn.zza(zzjk, int)>
	//*  33   63:ifne            0
														return ((zzjt) (this));
	//   34   66:aload_0         
	//   35   67:areturn         
												} else
												{
													int k = zzjw.zzb(zzjk1, 66);
	//   36   68:aload_1         
	//   37   69:bipush          66
	//   38   71:invokestatic    #81  <Method int zzjw.zzb(zzjk, int)>
	//   39   74:istore_3        
													zzdt azzdt[] = zzov;
	//   40   75:aload_0         
	//   41   76:getfield        #49  <Field zzdt[] zzov>
	//   42   79:astore          5
													if(azzdt == null)
	//*  43   81:aload           5
	//*  44   83:ifnonnull       91
														i = 0;
	//   45   86:iconst_0        
	//   46   87:istore_2        
													else
	//*  47   88:goto            95
														i = azzdt.length;
	//   48   91:aload           5
	//   49   93:arraylength     
	//   50   94:istore_2        
													azzdt = new zzdt[k + i];
	//   51   95:iload_3         
	//   52   96:iload_2         
	//   53   97:iadd            
	//   54   98:anewarray       zzdt[]
	//   55  101:astore          5
													k = i;
	//   56  103:iload_2         
	//   57  104:istore_3        
													if(i != 0)
	//*  58  105:iload_2         
	//*  59  106:ifeq            123
													{
														System.arraycopy(((Object) (zzov)), 0, ((Object) (azzdt)), 0, i);
	//   60  109:aload_0         
	//   61  110:getfield        #49  <Field zzdt[] zzov>
	//   62  113:iconst_0        
	//   63  114:aload           5
	//   64  116:iconst_0        
	//   65  117:iload_2         
	//   66  118:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
														k = i;
	//   67  121:iload_2         
	//   68  122:istore_3        
													}
													for(; k < azzdt.length - 1; k++)
	//*  69  123:iload_3         
	//*  70  124:aload           5
	//*  71  126:arraylength     
	//*  72  127:iconst_1        
	//*  73  128:isub            
	//*  74  129:icmpge          163
													{
														azzdt[k] = new zzdt();
	//   75  132:aload           5
	//   76  134:iload_3         
	//   77  135:new             #43  <Class zzdt>
	//   78  138:dup             
	//   79  139:invokespecial   #88  <Method void zzdt()>
	//   80  142:aastore         
														zzjk1.zza(((zzjt) (azzdt[k])));
	//   81  143:aload_1         
	//   82  144:aload           5
	//   83  146:iload_3         
	//   84  147:aaload          
	//   85  148:invokevirtual   #91  <Method void zzjk.zza(zzjt)>
														zzjk1.zzdq();
	//   86  151:aload_1         
	//   87  152:invokevirtual   #74  <Method int zzjk.zzdq()>
	//   88  155:pop             
													}

	//   89  156:iload_3         
	//   90  157:iconst_1        
	//   91  158:iadd            
	//   92  159:istore_3        
	//*  93  160:goto            123
													azzdt[k] = new zzdt();
	//   94  163:aload           5
	//   95  165:iload_3         
	//   96  166:new             #43  <Class zzdt>
	//   97  169:dup             
	//   98  170:invokespecial   #88  <Method void zzdt()>
	//   99  173:aastore         
													zzjk1.zza(((zzjt) (azzdt[k])));
	//  100  174:aload_1         
	//  101  175:aload           5
	//  102  177:iload_3         
	//  103  178:aaload          
	//  104  179:invokevirtual   #91  <Method void zzjk.zza(zzjt)>
													zzov = azzdt;
	//  105  182:aload_0         
	//  106  183:aload           5
	//  107  185:putfield        #49  <Field zzdt[] zzov>
												}
											} else
	//* 108  188:goto            0
											{
												zzou = Long.valueOf(zzjk1.zzdu());
	//  109  191:aload_0         
	//  110  192:aload_1         
	//  111  193:invokevirtual   #95  <Method long zzjk.zzdu()>
	//  112  196:invokestatic    #101 <Method Long Long.valueOf(long)>
	//  113  199:putfield        #41  <Field Long zzou>
											}
										} else
	//* 114  202:goto            0
										{
											zzot = Long.valueOf(zzjk1.zzdu());
	//  115  205:aload_0         
	//  116  206:aload_1         
	//  117  207:invokevirtual   #95  <Method long zzjk.zzdu()>
	//  118  210:invokestatic    #101 <Method Long Long.valueOf(long)>
	//  119  213:putfield        #39  <Field Long zzot>
										}
									} else
	//* 120  216:goto            0
									{
										zzos = zzjk1.readString();
	//  121  219:aload_0         
	//  122  220:aload_1         
	//  123  221:invokevirtual   #105 <Method String zzjk.readString()>
	//  124  224:putfield        #37  <Field String zzos>
									}
								} else
	//* 125  227:goto            0
								{
									int l = zzjk1.getPosition();
	//  126  230:aload_1         
	//  127  231:invokevirtual   #108 <Method int zzjk.getPosition()>
	//  128  234:istore_3        
									int j1 = zzjk1.zzdt();
	//  129  235:aload_1         
	//  130  236:invokevirtual   #111 <Method int zzjk.zzdt()>
	//  131  239:istore          4
									switch(j1)
	//* 132  241:iload           4
									{
	//* 133  243:tableswitch     0 3: default 272
	//	               0 287
	//	               1 287
	//	               2 287
	//	               3 287
									default:
										zzjk1.zzbt(l);
	//  134  272:aload_1         
	//  135  273:iload_3         
	//  136  274:invokevirtual   #115 <Method void zzjk.zzbt(int)>
										((zzjn)this).zza(zzjk1, i);
	//  137  277:aload_0         
	//  138  278:aload_1         
	//  139  279:iload_2         
	//  140  280:invokevirtual   #77  <Method boolean zzjn.zza(zzjk, int)>
	//  141  283:pop             
										break;

	//* 142  284:goto            0
									case 0: // '\0'
									case 1: // '\001'
									case 2: // '\002'
									case 3: // '\003'
										zzor = zzcz.zzd.zzb.zzt(j1);
	//  143  287:aload_0         
	//  144  288:iload           4
	//  145  290:invokestatic    #121 <Method zzcz$zzd$zzb zzcz$zzd$zzb.zzt(int)>
	//  146  293:putfield        #123 <Field zzcz$zzd$zzb zzor>
										break;
									}
									continue label0;
	//  147  296:goto            0
								}
							} else
							{
								int i1 = zzjw.zzb(zzjk1, 26);
	//  148  299:aload_1         
	//  149  300:bipush          26
	//  150  302:invokestatic    #81  <Method int zzjw.zzb(zzjk, int)>
	//  151  305:istore_3        
								String as[] = zzoq;
	//  152  306:aload_0         
	//  153  307:getfield        #35  <Field String[] zzoq>
	//  154  310:astore          5
								int j;
								if(as == null)
	//* 155  312:aload           5
	//* 156  314:ifnonnull       322
									j = 0;
	//  157  317:iconst_0        
	//  158  318:istore_2        
								else
	//* 159  319:goto            326
									j = as.length;
	//  160  322:aload           5
	//  161  324:arraylength     
	//  162  325:istore_2        
								as = new String[i1 + j];
	//  163  326:iload_3         
	//  164  327:iload_2         
	//  165  328:iadd            
	//  166  329:anewarray       String[]
	//  167  332:astore          5
								i1 = j;
	//  168  334:iload_2         
	//  169  335:istore_3        
								if(j != 0)
	//* 170  336:iload_2         
	//* 171  337:ifeq            354
								{
									System.arraycopy(((Object) (zzoq)), 0, ((Object) (as)), 0, j);
	//  172  340:aload_0         
	//  173  341:getfield        #35  <Field String[] zzoq>
	//  174  344:iconst_0        
	//  175  345:aload           5
	//  176  347:iconst_0        
	//  177  348:iload_2         
	//  178  349:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
									i1 = j;
	//  179  352:iload_2         
	//  180  353:istore_3        
								}
								for(; i1 < as.length - 1; i1++)
	//* 181  354:iload_3         
	//* 182  355:aload           5
	//* 183  357:arraylength     
	//* 184  358:iconst_1        
	//* 185  359:isub            
	//* 186  360:icmpge          383
								{
									as[i1] = zzjk1.readString();
	//  187  363:aload           5
	//  188  365:iload_3         
	//  189  366:aload_1         
	//  190  367:invokevirtual   #105 <Method String zzjk.readString()>
	//  191  370:aastore         
									zzjk1.zzdq();
	//  192  371:aload_1         
	//  193  372:invokevirtual   #74  <Method int zzjk.zzdq()>
	//  194  375:pop             
								}

	//  195  376:iload_3         
	//  196  377:iconst_1        
	//  197  378:iadd            
	//  198  379:istore_3        
	//* 199  380:goto            354
								as[i1] = zzjk1.readString();
	//  200  383:aload           5
	//  201  385:iload_3         
	//  202  386:aload_1         
	//  203  387:invokevirtual   #105 <Method String zzjk.readString()>
	//  204  390:aastore         
								zzoq = as;
	//  205  391:aload_0         
	//  206  392:aload           5
	//  207  394:putfield        #35  <Field String[] zzoq>
								continue label0;
	//  208  397:goto            0
							}
						} else
						{
							zzop = zzjk1.readString();
	//  209  400:aload_0         
	//  210  401:aload_1         
	//  211  402:invokevirtual   #105 <Method String zzjk.readString()>
	//  212  405:putfield        #28  <Field String zzop>
							continue label0;
	//  213  408:goto            0
						}
					} else
					{
						name = zzjk1.readString();
	//  214  411:aload_0         
	//  215  412:aload_1         
	//  216  413:invokevirtual   #105 <Method String zzjk.readString()>
	//  217  416:putfield        #26  <Field String name>
						continue label0;
	//  218  419:goto            0
					}
				} else
				{
					return ((zzjt) (this));
	//  219  422:aload_0         
	//  220  423:areturn         
				}
			} while(true);
		while(true);
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String name>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          18
			zzjl1.zza(1, ((String) (obj)));
	//    5   11:aload_1         
	//    6   12:iconst_1        
	//    7   13:aload           4
	//    8   15:invokevirtual   #132 <Method void zzjl.zza(int, String)>
		obj = ((Object) (zzop));
	//    9   18:aload_0         
	//   10   19:getfield        #28  <Field String zzop>
	//   11   22:astore          4
		if(obj != null)
	//*  12   24:aload           4
	//*  13   26:ifnull          36
			zzjl1.zza(2, ((String) (obj)));
	//   14   29:aload_1         
	//   15   30:iconst_2        
	//   16   31:aload           4
	//   17   33:invokevirtual   #132 <Method void zzjl.zza(int, String)>
		Object aobj[] = ((Object []) (zzoq));
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field String[] zzoq>
	//   20   40:astore          4
		boolean flag = false;
	//   21   42:iconst_0        
	//   22   43:istore_3        
		if(aobj != null && aobj.length > 0)
	//*  23   44:aload           4
	//*  24   46:ifnull          95
	//*  25   49:aload           4
	//*  26   51:arraylength     
	//*  27   52:ifle            95
		{
			int i = 0;
	//   28   55:iconst_0        
	//   29   56:istore_2        
			do
			{
				aobj = ((Object []) (zzoq));
	//   30   57:aload_0         
	//   31   58:getfield        #35  <Field String[] zzoq>
	//   32   61:astore          4
				if(i >= aobj.length)
					break;
	//   33   63:iload_2         
	//   34   64:aload           4
	//   35   66:arraylength     
	//   36   67:icmpge          95
				aobj = ((Object []) (aobj[i]));
	//   37   70:aload           4
	//   38   72:iload_2         
	//   39   73:aaload          
	//   40   74:astore          4
				if(aobj != null)
	//*  41   76:aload           4
	//*  42   78:ifnull          88
					zzjl1.zza(3, ((String) (aobj)));
	//   43   81:aload_1         
	//   44   82:iconst_3        
	//   45   83:aload           4
	//   46   85:invokevirtual   #132 <Method void zzjl.zza(int, String)>
				i++;
	//   47   88:iload_2         
	//   48   89:iconst_1        
	//   49   90:iadd            
	//   50   91:istore_2        
			} while(true);
	//   51   92:goto            57
		}
		aobj = ((Object []) (zzor));
	//   52   95:aload_0         
	//   53   96:getfield        #123 <Field zzcz$zzd$zzb zzor>
	//   54   99:astore          4
		if(aobj != null && aobj != null)
	//*  55  101:aload           4
	//*  56  103:ifnull          121
	//*  57  106:aload           4
	//*  58  108:ifnull          121
			zzjl1.zze(4, ((zzcz.zzd.zzb) (aobj)).zzr());
	//   59  111:aload_1         
	//   60  112:iconst_4        
	//   61  113:aload           4
	//   62  115:invokevirtual   #135 <Method int zzcz$zzd$zzb.zzr()>
	//   63  118:invokevirtual   #139 <Method void zzjl.zze(int, int)>
		aobj = ((Object []) (zzos));
	//   64  121:aload_0         
	//   65  122:getfield        #37  <Field String zzos>
	//   66  125:astore          4
		if(aobj != null)
	//*  67  127:aload           4
	//*  68  129:ifnull          139
			zzjl1.zza(5, ((String) (aobj)));
	//   69  132:aload_1         
	//   70  133:iconst_5        
	//   71  134:aload           4
	//   72  136:invokevirtual   #132 <Method void zzjl.zza(int, String)>
		aobj = ((Object []) (zzot));
	//   73  139:aload_0         
	//   74  140:getfield        #39  <Field Long zzot>
	//   75  143:astore          4
		if(aobj != null)
	//*  76  145:aload           4
	//*  77  147:ifnull          161
			zzjl1.zzi(6, ((Long) (aobj)).longValue());
	//   78  150:aload_1         
	//   79  151:bipush          6
	//   80  153:aload           4
	//   81  155:invokevirtual   #142 <Method long Long.longValue()>
	//   82  158:invokevirtual   #146 <Method void zzjl.zzi(int, long)>
		aobj = ((Object []) (zzou));
	//   83  161:aload_0         
	//   84  162:getfield        #41  <Field Long zzou>
	//   85  165:astore          4
		if(aobj != null)
	//*  86  167:aload           4
	//*  87  169:ifnull          183
			zzjl1.zzi(7, ((Long) (aobj)).longValue());
	//   88  172:aload_1         
	//   89  173:bipush          7
	//   90  175:aload           4
	//   91  177:invokevirtual   #142 <Method long Long.longValue()>
	//   92  180:invokevirtual   #146 <Method void zzjl.zzi(int, long)>
		aobj = ((Object []) (zzov));
	//   93  183:aload_0         
	//   94  184:getfield        #49  <Field zzdt[] zzov>
	//   95  187:astore          4
		if(aobj != null && aobj.length > 0)
	//*  96  189:aload           4
	//*  97  191:ifnull          241
	//*  98  194:aload           4
	//*  99  196:arraylength     
	//* 100  197:ifle            241
		{
			int j = ((int) (flag));
	//  101  200:iload_3         
	//  102  201:istore_2        
			do
			{
				zzdt azzdt[] = zzov;
	//  103  202:aload_0         
	//  104  203:getfield        #49  <Field zzdt[] zzov>
	//  105  206:astore          4
				if(j >= azzdt.length)
					break;
	//  106  208:iload_2         
	//  107  209:aload           4
	//  108  211:arraylength     
	//  109  212:icmpge          241
				zzdt zzdt1 = azzdt[j];
	//  110  215:aload           4
	//  111  217:iload_2         
	//  112  218:aaload          
	//  113  219:astore          4
				if(zzdt1 != null)
	//* 114  221:aload           4
	//* 115  223:ifnull          234
					zzjl1.zza(8, ((zzjt) (zzdt1)));
	//  116  226:aload_1         
	//  117  227:bipush          8
	//  118  229:aload           4
	//  119  231:invokevirtual   #149 <Method void zzjl.zza(int, zzjt)>
				j++;
	//  120  234:iload_2         
	//  121  235:iconst_1        
	//  122  236:iadd            
	//  123  237:istore_2        
			} while(true);
	//  124  238:goto            202
		}
		super.zza(zzjl1);
	//  125  241:aload_0         
	//  126  242:aload_1         
	//  127  243:invokespecial   #151 <Method void zzjn.zza(zzjl)>
	//  128  246:return          
	}

	protected final int zzt()
	{
		int i = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method int zzjn.zzt()>
	//    2    4:istore_1        
		Object obj = ((Object) (name));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field String name>
	//    5    9:astore          8
		int j = i;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(obj != null)
	//*   8   13:aload           8
	//*   9   15:ifnull          27
			j = i + zzjl.zzb(1, ((String) (obj)));
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:aload           8
	//   13   22:invokestatic    #156 <Method int zzjl.zzb(int, String)>
	//   14   25:iadd            
	//   15   26:istore_2        
		obj = ((Object) (zzop));
	//   16   27:aload_0         
	//   17   28:getfield        #28  <Field String zzop>
	//   18   31:astore          8
		i = j;
	//   19   33:iload_2         
	//   20   34:istore_1        
		if(obj != null)
	//*  21   35:aload           8
	//*  22   37:ifnull          49
			i = j + zzjl.zzb(2, ((String) (obj)));
	//   23   40:iload_2         
	//   24   41:iconst_2        
	//   25   42:aload           8
	//   26   44:invokestatic    #156 <Method int zzjl.zzb(int, String)>
	//   27   47:iadd            
	//   28   48:istore_1        
		Object aobj[] = ((Object []) (zzoq));
	//   29   49:aload_0         
	//   30   50:getfield        #35  <Field String[] zzoq>
	//   31   53:astore          8
		boolean flag1 = false;
	//   32   55:iconst_0        
	//   33   56:istore          7
		j = i;
	//   34   58:iload_1         
	//   35   59:istore_2        
		if(aobj != null)
	//*  36   60:aload           8
	//*  37   62:ifnull          156
		{
			j = i;
	//   38   65:iload_1         
	//   39   66:istore_2        
			if(aobj.length > 0)
	//*  40   67:aload           8
	//*  41   69:arraylength     
	//*  42   70:ifle            156
			{
				boolean flag = false;
	//   43   73:iconst_0        
	//   44   74:istore          5
				j = ((int) (flag));
	//   45   76:iload           5
	//   46   78:istore_2        
				int j1 = j;
	//   47   79:iload_2         
	//   48   80:istore          4
				int l = j;
	//   49   82:iload_2         
	//   50   83:istore_3        
				j = ((int) (flag));
	//   51   84:iload           5
	//   52   86:istore_2        
				do
				{
					aobj = ((Object []) (zzoq));
	//   53   87:aload_0         
	//   54   88:getfield        #35  <Field String[] zzoq>
	//   55   91:astore          8
					if(j >= aobj.length)
						break;
	//   56   93:iload_2         
	//   57   94:aload           8
	//   58   96:arraylength     
	//   59   97:icmpge          147
					aobj = ((Object []) (aobj[j]));
	//   60  100:aload           8
	//   61  102:iload_2         
	//   62  103:aaload          
	//   63  104:astore          8
					int l1 = l;
	//   64  106:iload_3         
	//   65  107:istore          6
					int k1 = j1;
	//   66  109:iload           4
	//   67  111:istore          5
					if(aobj != null)
	//*  68  113:aload           8
	//*  69  115:ifnull          133
					{
						k1 = j1 + 1;
	//   70  118:iload           4
	//   71  120:iconst_1        
	//   72  121:iadd            
	//   73  122:istore          5
						l1 = l + zzjl.zzn(((String) (aobj)));
	//   74  124:iload_3         
	//   75  125:aload           8
	//   76  127:invokestatic    #160 <Method int zzjl.zzn(String)>
	//   77  130:iadd            
	//   78  131:istore          6
					}
					j++;
	//   79  133:iload_2         
	//   80  134:iconst_1        
	//   81  135:iadd            
	//   82  136:istore_2        
					l = l1;
	//   83  137:iload           6
	//   84  139:istore_3        
					j1 = k1;
	//   85  140:iload           5
	//   86  142:istore          4
				} while(true);
	//   87  144:goto            87
				j = i + l + j1 * 1;
	//   88  147:iload_1         
	//   89  148:iload_3         
	//   90  149:iadd            
	//   91  150:iload           4
	//   92  152:iconst_1        
	//   93  153:imul            
	//   94  154:iadd            
	//   95  155:istore_2        
			}
		}
		aobj = ((Object []) (zzor));
	//   96  156:aload_0         
	//   97  157:getfield        #123 <Field zzcz$zzd$zzb zzor>
	//   98  160:astore          8
		i = j;
	//   99  162:iload_2         
	//  100  163:istore_1        
		if(aobj != null)
	//* 101  164:aload           8
	//* 102  166:ifnull          188
		{
			i = j;
	//  103  169:iload_2         
	//  104  170:istore_1        
			if(aobj != null)
	//* 105  171:aload           8
	//* 106  173:ifnull          188
				i = j + zzjl.zzi(4, ((zzcz.zzd.zzb) (aobj)).zzr());
	//  107  176:iload_2         
	//  108  177:iconst_4        
	//  109  178:aload           8
	//  110  180:invokevirtual   #135 <Method int zzcz$zzd$zzb.zzr()>
	//  111  183:invokestatic    #163 <Method int zzjl.zzi(int, int)>
	//  112  186:iadd            
	//  113  187:istore_1        
		}
		aobj = ((Object []) (zzos));
	//  114  188:aload_0         
	//  115  189:getfield        #37  <Field String zzos>
	//  116  192:astore          8
		j = i;
	//  117  194:iload_1         
	//  118  195:istore_2        
		if(aobj != null)
	//* 119  196:aload           8
	//* 120  198:ifnull          210
			j = i + zzjl.zzb(5, ((String) (aobj)));
	//  121  201:iload_1         
	//  122  202:iconst_5        
	//  123  203:aload           8
	//  124  205:invokestatic    #156 <Method int zzjl.zzb(int, String)>
	//  125  208:iadd            
	//  126  209:istore_2        
		aobj = ((Object []) (zzot));
	//  127  210:aload_0         
	//  128  211:getfield        #39  <Field Long zzot>
	//  129  214:astore          8
		int i1 = j;
	//  130  216:iload_2         
	//  131  217:istore_3        
		if(aobj != null)
	//* 132  218:aload           8
	//* 133  220:ifnull          236
			i1 = j + zzjl.zzd(6, ((Long) (aobj)).longValue());
	//  134  223:iload_2         
	//  135  224:bipush          6
	//  136  226:aload           8
	//  137  228:invokevirtual   #142 <Method long Long.longValue()>
	//  138  231:invokestatic    #167 <Method int zzjl.zzd(int, long)>
	//  139  234:iadd            
	//  140  235:istore_3        
		aobj = ((Object []) (zzou));
	//  141  236:aload_0         
	//  142  237:getfield        #41  <Field Long zzou>
	//  143  240:astore          8
		i = i1;
	//  144  242:iload_3         
	//  145  243:istore_1        
		if(aobj != null)
	//* 146  244:aload           8
	//* 147  246:ifnull          262
			i = i1 + zzjl.zzd(7, ((Long) (aobj)).longValue());
	//  148  249:iload_3         
	//  149  250:bipush          7
	//  150  252:aload           8
	//  151  254:invokevirtual   #142 <Method long Long.longValue()>
	//  152  257:invokestatic    #167 <Method int zzjl.zzd(int, long)>
	//  153  260:iadd            
	//  154  261:istore_1        
		aobj = ((Object []) (zzov));
	//  155  262:aload_0         
	//  156  263:getfield        #49  <Field zzdt[] zzov>
	//  157  266:astore          8
		i1 = i;
	//  158  268:iload_1         
	//  159  269:istore_3        
		if(aobj != null)
	//* 160  270:aload           8
	//* 161  272:ifnull          333
		{
			i1 = i;
	//  162  275:iload_1         
	//  163  276:istore_3        
			if(aobj.length > 0)
	//* 164  277:aload           8
	//* 165  279:arraylength     
	//* 166  280:ifle            333
			{
				int k = ((int) (flag1));
	//  167  283:iload           7
	//  168  285:istore_2        
				do
				{
					zzdt azzdt[] = zzov;
	//  169  286:aload_0         
	//  170  287:getfield        #49  <Field zzdt[] zzov>
	//  171  290:astore          8
					i1 = i;
	//  172  292:iload_1         
	//  173  293:istore_3        
					if(k >= azzdt.length)
						break;
	//  174  294:iload_2         
	//  175  295:aload           8
	//  176  297:arraylength     
	//  177  298:icmpge          333
					zzdt zzdt1 = azzdt[k];
	//  178  301:aload           8
	//  179  303:iload_2         
	//  180  304:aaload          
	//  181  305:astore          8
					i1 = i;
	//  182  307:iload_1         
	//  183  308:istore_3        
					if(zzdt1 != null)
	//* 184  309:aload           8
	//* 185  311:ifnull          324
						i1 = i + zzjl.zzb(8, ((zzjt) (zzdt1)));
	//  186  314:iload_1         
	//  187  315:bipush          8
	//  188  317:aload           8
	//  189  319:invokestatic    #170 <Method int zzjl.zzb(int, zzjt)>
	//  190  322:iadd            
	//  191  323:istore_3        
					k++;
	//  192  324:iload_2         
	//  193  325:iconst_1        
	//  194  326:iadd            
	//  195  327:istore_2        
					i = i1;
	//  196  328:iload_3         
	//  197  329:istore_1        
				} while(true);
	//  198  330:goto            286
			}
		}
		return i1;
	//  199  333:iload_3         
	//  200  334:ireturn         
	}

	private static volatile zzdm zzoo[];
	public String name;
	private String zzop;
	private String zzoq[];
	private zzcz.zzd.zzb zzor;
	public String zzos;
	public Long zzot;
	public Long zzou;
	public zzdt zzov[];
}
