// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyl, zzfs, zzfy, 
//			zzyg, zzye, zzxz, zzya, 
//			zzyi

public final class zzfx extends zzyc
{

	public zzfx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzyc()>
		zzayn = zzyl.zzcfi;
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field long[] zzyl.zzcfi>
	//    4    8:putfield        #23  <Field long[] zzayn>
		zzayo = zzyl.zzcfi;
	//    5   11:aload_0         
	//    6   12:getstatic       #21  <Field long[] zzyl.zzcfi>
	//    7   15:putfield        #25  <Field long[] zzayo>
		zzayp = zzfs.zzmy();
	//    8   18:aload_0         
	//    9   19:invokestatic    #31  <Method zzfs[] zzfs.zzmy()>
	//   10   22:putfield        #33  <Field zzfs[] zzayp>
		zzayq = zzfy.zznc();
	//   11   25:aload_0         
	//   12   26:invokestatic    #39  <Method zzfy[] zzfy.zznc()>
	//   13   29:putfield        #41  <Field zzfy[] zzayq>
		zzcet = null;
	//   14   32:aload_0         
	//   15   33:aconst_null     
	//   16   34:putfield        #45  <Field zzye zzcet>
		zzcfd = -1;
	//   17   37:aload_0         
	//   18   38:iconst_m1       
	//   19   39:putfield        #49  <Field int zzcfd>
	//   20   42:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzfx))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfx>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfx)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfx>
	//   12   20:astore_1        
		if(!zzyg.equals(zzayn, ((zzfx) (obj)).zzayn))
	//*  13   21:aload_0         
	//*  14   22:getfield        #23  <Field long[] zzayn>
	//*  15   25:aload_1         
	//*  16   26:getfield        #23  <Field long[] zzayn>
	//*  17   29:invokestatic    #57  <Method boolean zzyg.equals(long[], long[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(!zzyg.equals(zzayo, ((zzfx) (obj)).zzayo))
	//*  21   37:aload_0         
	//*  22   38:getfield        #25  <Field long[] zzayo>
	//*  23   41:aload_1         
	//*  24   42:getfield        #25  <Field long[] zzayo>
	//*  25   45:invokestatic    #57  <Method boolean zzyg.equals(long[], long[])>
	//*  26   48:ifne            53
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		if(!zzyg.equals(((Object []) (zzayp)), ((Object []) (((zzfx) (obj)).zzayp))))
	//*  29   53:aload_0         
	//*  30   54:getfield        #33  <Field zzfs[] zzayp>
	//*  31   57:aload_1         
	//*  32   58:getfield        #33  <Field zzfs[] zzayp>
	//*  33   61:invokestatic    #60  <Method boolean zzyg.equals(Object[], Object[])>
	//*  34   64:ifne            69
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		if(!zzyg.equals(((Object []) (zzayq)), ((Object []) (((zzfx) (obj)).zzayq))))
	//*  37   69:aload_0         
	//*  38   70:getfield        #41  <Field zzfy[] zzayq>
	//*  39   73:aload_1         
	//*  40   74:getfield        #41  <Field zzfy[] zzayq>
	//*  41   77:invokestatic    #60  <Method boolean zzyg.equals(Object[], Object[])>
	//*  42   80:ifne            85
			return false;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  45   85:aload_0         
	//*  46   86:getfield        #45  <Field zzye zzcet>
	//*  47   89:ifnull          117
	//*  48   92:aload_0         
	//*  49   93:getfield        #45  <Field zzye zzcet>
	//*  50   96:invokevirtual   #66  <Method boolean zzye.isEmpty()>
	//*  51   99:ifeq            105
	//*  52  102:goto            117
			return zzcet.equals(((Object) (((zzfx) (obj)).zzcet)));
	//   53  105:aload_0         
	//   54  106:getfield        #45  <Field zzye zzcet>
	//   55  109:aload_1         
	//   56  110:getfield        #45  <Field zzye zzcet>
	//   57  113:invokevirtual   #68  <Method boolean zzye.equals(Object)>
	//   58  116:ireturn         
		if(((zzfx) (obj)).zzcet != null)
	//*  59  117:aload_1         
	//*  60  118:getfield        #45  <Field zzye zzcet>
	//*  61  121:ifnull          138
			return ((zzfx) (obj)).zzcet.isEmpty();
	//   62  124:aload_1         
	//   63  125:getfield        #45  <Field zzye zzcet>
	//   64  128:invokevirtual   #66  <Method boolean zzye.isEmpty()>
	//   65  131:ifeq            136
	//   66  134:iconst_1        
	//   67  135:ireturn         
	//   68  136:iconst_0        
	//   69  137:ireturn         
		else
			return true;
	//   70  138:iconst_1        
	//   71  139:ireturn         
	}

	public final int hashCode()
	{
		int j = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #82  <Method String Class.getName()>
	//    3    7:invokevirtual   #86  <Method int String.hashCode()>
	//    4   10:istore_2        
		int k = zzyg.hashCode(zzayn);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field long[] zzayn>
	//    7   15:invokestatic    #89  <Method int zzyg.hashCode(long[])>
	//    8   18:istore_3        
		int l = zzyg.hashCode(zzayo);
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field long[] zzayo>
	//   11   23:invokestatic    #89  <Method int zzyg.hashCode(long[])>
	//   12   26:istore          4
		int i1 = zzyg.hashCode(((Object []) (zzayp)));
	//   13   28:aload_0         
	//   14   29:getfield        #33  <Field zzfs[] zzayp>
	//   15   32:invokestatic    #92  <Method int zzyg.hashCode(Object[])>
	//   16   35:istore          5
		int j1 = zzyg.hashCode(((Object []) (zzayq)));
	//   17   37:aload_0         
	//   18   38:getfield        #41  <Field zzfy[] zzayq>
	//   19   41:invokestatic    #92  <Method int zzyg.hashCode(Object[])>
	//   20   44:istore          6
		int i;
		if(zzcet != null && !zzcet.isEmpty())
	//*  21   46:aload_0         
	//*  22   47:getfield        #45  <Field zzye zzcet>
	//*  23   50:ifnull          77
	//*  24   53:aload_0         
	//*  25   54:getfield        #45  <Field zzye zzcet>
	//*  26   57:invokevirtual   #66  <Method boolean zzye.isEmpty()>
	//*  27   60:ifeq            66
	//*  28   63:goto            77
			i = zzcet.hashCode();
	//   29   66:aload_0         
	//   30   67:getfield        #45  <Field zzye zzcet>
	//   31   70:invokevirtual   #93  <Method int zzye.hashCode()>
	//   32   73:istore_1        
		else
	//*  33   74:goto            79
			i = 0;
	//   34   77:iconst_0        
	//   35   78:istore_1        
		return (((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + i;
	//   36   79:iload_2         
	//   37   80:sipush          527
	//   38   83:iadd            
	//   39   84:bipush          31
	//   40   86:imul            
	//   41   87:iload_3         
	//   42   88:iadd            
	//   43   89:bipush          31
	//   44   91:imul            
	//   45   92:iload           4
	//   46   94:iadd            
	//   47   95:bipush          31
	//   48   97:imul            
	//   49   98:iload           5
	//   50  100:iadd            
	//   51  101:bipush          31
	//   52  103:imul            
	//   53  104:iload           6
	//   54  106:iadd            
	//   55  107:bipush          31
	//   56  109:imul            
	//   57  110:iload_1         
	//   58  111:iadd            
	//   59  112:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            752
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          652
			{
				if(i != 10)
	//*   8   15:iload_2         
	//*   9   16:bipush          10
	//*  10   18:icmpeq          527
				{
					if(i != 16)
	//*  11   21:iload_2         
	//*  12   22:bipush          16
	//*  13   24:icmpeq          427
					{
						if(i != 18)
	//*  14   27:iload_2         
	//*  15   28:bipush          18
	//*  16   30:icmpeq          302
						{
							if(i != 26)
	//*  17   33:iload_2         
	//*  18   34:bipush          26
	//*  19   36:icmpeq          179
							{
								if(i != 34)
	//*  20   39:iload_2         
	//*  21   40:bipush          34
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzxz1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #105 <Method boolean zzyc.zza(zzxz, int)>
	//*  27   51:ifne            0
										return ((zzyi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									int l1 = zzyl.zzb(zzxz1, 34);
	//   30   56:aload_1         
	//   31   57:bipush          34
	//   32   59:invokestatic    #109 <Method int zzyl.zzb(zzxz, int)>
	//   33   62:istore_3        
									zzfy azzfy[] = zzayq;
	//   34   63:aload_0         
	//   35   64:getfield        #41  <Field zzfy[] zzayq>
	//   36   67:astore          5
									int j;
									if(azzfy == null)
	//*  37   69:aload           5
	//*  38   71:ifnonnull       79
										j = 0;
	//   39   74:iconst_0        
	//   40   75:istore_2        
									else
	//*  41   76:goto            83
										j = azzfy.length;
	//   42   79:aload           5
	//   43   81:arraylength     
	//   44   82:istore_2        
									azzfy = new zzfy[l1 + j];
	//   45   83:iload_3         
	//   46   84:iload_2         
	//   47   85:iadd            
	//   48   86:anewarray       zzfy[]
	//   49   89:astore          5
									l1 = j;
	//   50   91:iload_2         
	//   51   92:istore_3        
									if(j != 0)
	//*  52   93:iload_2         
	//*  53   94:ifeq            111
									{
										System.arraycopy(((Object) (zzayq)), 0, ((Object) (azzfy)), 0, j);
	//   54   97:aload_0         
	//   55   98:getfield        #41  <Field zzfy[] zzayq>
	//   56  101:iconst_0        
	//   57  102:aload           5
	//   58  104:iconst_0        
	//   59  105:iload_2         
	//   60  106:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
										l1 = j;
	//   61  109:iload_2         
	//   62  110:istore_3        
									}
									for(; l1 < azzfy.length - 1; l1++)
	//*  63  111:iload_3         
	//*  64  112:aload           5
	//*  65  114:arraylength     
	//*  66  115:iconst_1        
	//*  67  116:isub            
	//*  68  117:icmpge          151
									{
										azzfy[l1] = new zzfy();
	//   69  120:aload           5
	//   70  122:iload_3         
	//   71  123:new             #35  <Class zzfy>
	//   72  126:dup             
	//   73  127:invokespecial   #116 <Method void zzfy()>
	//   74  130:aastore         
										zzxz1.zza(((zzyi) (azzfy[l1])));
	//   75  131:aload_1         
	//   76  132:aload           5
	//   77  134:iload_3         
	//   78  135:aaload          
	//   79  136:invokevirtual   #119 <Method void zzxz.zza(zzyi)>
										zzxz1.zzuj();
	//   80  139:aload_1         
	//   81  140:invokevirtual   #102 <Method int zzxz.zzuj()>
	//   82  143:pop             
									}

	//   83  144:iload_3         
	//   84  145:iconst_1        
	//   85  146:iadd            
	//   86  147:istore_3        
	//*  87  148:goto            111
									azzfy[l1] = new zzfy();
	//   88  151:aload           5
	//   89  153:iload_3         
	//   90  154:new             #35  <Class zzfy>
	//   91  157:dup             
	//   92  158:invokespecial   #116 <Method void zzfy()>
	//   93  161:aastore         
									zzxz1.zza(((zzyi) (azzfy[l1])));
	//   94  162:aload_1         
	//   95  163:aload           5
	//   96  165:iload_3         
	//   97  166:aaload          
	//   98  167:invokevirtual   #119 <Method void zzxz.zza(zzyi)>
									zzayq = azzfy;
	//   99  170:aload_0         
	//  100  171:aload           5
	//  101  173:putfield        #41  <Field zzfy[] zzayq>
								}
							} else
	//* 102  176:goto            0
							{
								int i2 = zzyl.zzb(zzxz1, 26);
	//  103  179:aload_1         
	//  104  180:bipush          26
	//  105  182:invokestatic    #109 <Method int zzyl.zzb(zzxz, int)>
	//  106  185:istore_3        
								zzfs azzfs[] = zzayp;
	//  107  186:aload_0         
	//  108  187:getfield        #33  <Field zzfs[] zzayp>
	//  109  190:astore          5
								int k;
								if(azzfs == null)
	//* 110  192:aload           5
	//* 111  194:ifnonnull       202
									k = 0;
	//  112  197:iconst_0        
	//  113  198:istore_2        
								else
	//* 114  199:goto            206
									k = azzfs.length;
	//  115  202:aload           5
	//  116  204:arraylength     
	//  117  205:istore_2        
								azzfs = new zzfs[i2 + k];
	//  118  206:iload_3         
	//  119  207:iload_2         
	//  120  208:iadd            
	//  121  209:anewarray       zzfs[]
	//  122  212:astore          5
								i2 = k;
	//  123  214:iload_2         
	//  124  215:istore_3        
								if(k != 0)
	//* 125  216:iload_2         
	//* 126  217:ifeq            234
								{
									System.arraycopy(((Object) (zzayp)), 0, ((Object) (azzfs)), 0, k);
	//  127  220:aload_0         
	//  128  221:getfield        #33  <Field zzfs[] zzayp>
	//  129  224:iconst_0        
	//  130  225:aload           5
	//  131  227:iconst_0        
	//  132  228:iload_2         
	//  133  229:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
									i2 = k;
	//  134  232:iload_2         
	//  135  233:istore_3        
								}
								for(; i2 < azzfs.length - 1; i2++)
	//* 136  234:iload_3         
	//* 137  235:aload           5
	//* 138  237:arraylength     
	//* 139  238:iconst_1        
	//* 140  239:isub            
	//* 141  240:icmpge          274
								{
									azzfs[i2] = new zzfs();
	//  142  243:aload           5
	//  143  245:iload_3         
	//  144  246:new             #27  <Class zzfs>
	//  145  249:dup             
	//  146  250:invokespecial   #120 <Method void zzfs()>
	//  147  253:aastore         
									zzxz1.zza(((zzyi) (azzfs[i2])));
	//  148  254:aload_1         
	//  149  255:aload           5
	//  150  257:iload_3         
	//  151  258:aaload          
	//  152  259:invokevirtual   #119 <Method void zzxz.zza(zzyi)>
									zzxz1.zzuj();
	//  153  262:aload_1         
	//  154  263:invokevirtual   #102 <Method int zzxz.zzuj()>
	//  155  266:pop             
								}

	//  156  267:iload_3         
	//  157  268:iconst_1        
	//  158  269:iadd            
	//  159  270:istore_3        
	//* 160  271:goto            234
								azzfs[i2] = new zzfs();
	//  161  274:aload           5
	//  162  276:iload_3         
	//  163  277:new             #27  <Class zzfs>
	//  164  280:dup             
	//  165  281:invokespecial   #120 <Method void zzfs()>
	//  166  284:aastore         
								zzxz1.zza(((zzyi) (azzfs[i2])));
	//  167  285:aload_1         
	//  168  286:aload           5
	//  169  288:iload_3         
	//  170  289:aaload          
	//  171  290:invokevirtual   #119 <Method void zzxz.zza(zzyi)>
								zzayp = azzfs;
	//  172  293:aload_0         
	//  173  294:aload           5
	//  174  296:putfield        #33  <Field zzfs[] zzayp>
							}
						} else
	//* 175  299:goto            0
						{
							int j3 = zzxz1.zzas(zzxz1.zzvb());
	//  176  302:aload_1         
	//  177  303:aload_1         
	//  178  304:invokevirtual   #123 <Method int zzxz.zzvb()>
	//  179  307:invokevirtual   #127 <Method int zzxz.zzas(int)>
	//  180  310:istore          4
							int l = zzxz1.getPosition();
	//  181  312:aload_1         
	//  182  313:invokevirtual   #130 <Method int zzxz.getPosition()>
	//  183  316:istore_2        
							int j2;
							for(j2 = 0; zzxz1.zzyy() > 0; j2++)
	//* 184  317:iconst_0        
	//* 185  318:istore_3        
	//* 186  319:aload_1         
	//* 187  320:invokevirtual   #133 <Method int zzxz.zzyy()>
	//* 188  323:ifle            338
								zzxz1.zzvc();
	//  189  326:aload_1         
	//  190  327:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  191  330:pop2            

	//  192  331:iload_3         
	//  193  332:iconst_1        
	//  194  333:iadd            
	//  195  334:istore_3        
	//* 196  335:goto            319
							zzxz1.zzcb(l);
	//  197  338:aload_1         
	//  198  339:iload_2         
	//  199  340:invokevirtual   #141 <Method void zzxz.zzcb(int)>
							long al[] = zzayo;
	//  200  343:aload_0         
	//  201  344:getfield        #25  <Field long[] zzayo>
	//  202  347:astore          5
							if(al == null)
	//* 203  349:aload           5
	//* 204  351:ifnonnull       359
								l = 0;
	//  205  354:iconst_0        
	//  206  355:istore_2        
							else
	//* 207  356:goto            363
								l = al.length;
	//  208  359:aload           5
	//  209  361:arraylength     
	//  210  362:istore_2        
							al = new long[j2 + l];
	//  211  363:iload_3         
	//  212  364:iload_2         
	//  213  365:iadd            
	//  214  366:newarray        long[]
	//  215  368:astore          5
							j2 = l;
	//  216  370:iload_2         
	//  217  371:istore_3        
							if(l != 0)
	//* 218  372:iload_2         
	//* 219  373:ifeq            390
							{
								System.arraycopy(((Object) (zzayo)), 0, ((Object) (al)), 0, l);
	//  220  376:aload_0         
	//  221  377:getfield        #25  <Field long[] zzayo>
	//  222  380:iconst_0        
	//  223  381:aload           5
	//  224  383:iconst_0        
	//  225  384:iload_2         
	//  226  385:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
								j2 = l;
	//  227  388:iload_2         
	//  228  389:istore_3        
							}
							for(; j2 < al.length; j2++)
	//* 229  390:iload_3         
	//* 230  391:aload           5
	//* 231  393:arraylength     
	//* 232  394:icmpge          412
								al[j2] = zzxz1.zzvc();
	//  233  397:aload           5
	//  234  399:iload_3         
	//  235  400:aload_1         
	//  236  401:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  237  404:lastore         

	//  238  405:iload_3         
	//  239  406:iconst_1        
	//  240  407:iadd            
	//  241  408:istore_3        
	//* 242  409:goto            390
							zzayo = al;
	//  243  412:aload_0         
	//  244  413:aload           5
	//  245  415:putfield        #25  <Field long[] zzayo>
							zzxz1.zzat(j3);
	//  246  418:aload_1         
	//  247  419:iload           4
	//  248  421:invokevirtual   #144 <Method void zzxz.zzat(int)>
						}
					} else
	//* 249  424:goto            0
					{
						int k2 = zzyl.zzb(zzxz1, 16);
	//  250  427:aload_1         
	//  251  428:bipush          16
	//  252  430:invokestatic    #109 <Method int zzyl.zzb(zzxz, int)>
	//  253  433:istore_3        
						long al1[] = zzayo;
	//  254  434:aload_0         
	//  255  435:getfield        #25  <Field long[] zzayo>
	//  256  438:astore          5
						int i1;
						if(al1 == null)
	//* 257  440:aload           5
	//* 258  442:ifnonnull       450
							i1 = 0;
	//  259  445:iconst_0        
	//  260  446:istore_2        
						else
	//* 261  447:goto            454
							i1 = al1.length;
	//  262  450:aload           5
	//  263  452:arraylength     
	//  264  453:istore_2        
						al1 = new long[k2 + i1];
	//  265  454:iload_3         
	//  266  455:iload_2         
	//  267  456:iadd            
	//  268  457:newarray        long[]
	//  269  459:astore          5
						k2 = i1;
	//  270  461:iload_2         
	//  271  462:istore_3        
						if(i1 != 0)
	//* 272  463:iload_2         
	//* 273  464:ifeq            481
						{
							System.arraycopy(((Object) (zzayo)), 0, ((Object) (al1)), 0, i1);
	//  274  467:aload_0         
	//  275  468:getfield        #25  <Field long[] zzayo>
	//  276  471:iconst_0        
	//  277  472:aload           5
	//  278  474:iconst_0        
	//  279  475:iload_2         
	//  280  476:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
							k2 = i1;
	//  281  479:iload_2         
	//  282  480:istore_3        
						}
						for(; k2 < al1.length - 1; k2++)
	//* 283  481:iload_3         
	//* 284  482:aload           5
	//* 285  484:arraylength     
	//* 286  485:iconst_1        
	//* 287  486:isub            
	//* 288  487:icmpge          510
						{
							al1[k2] = zzxz1.zzvc();
	//  289  490:aload           5
	//  290  492:iload_3         
	//  291  493:aload_1         
	//  292  494:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  293  497:lastore         
							zzxz1.zzuj();
	//  294  498:aload_1         
	//  295  499:invokevirtual   #102 <Method int zzxz.zzuj()>
	//  296  502:pop             
						}

	//  297  503:iload_3         
	//  298  504:iconst_1        
	//  299  505:iadd            
	//  300  506:istore_3        
	//* 301  507:goto            481
						al1[k2] = zzxz1.zzvc();
	//  302  510:aload           5
	//  303  512:iload_3         
	//  304  513:aload_1         
	//  305  514:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  306  517:lastore         
						zzayo = al1;
	//  307  518:aload_0         
	//  308  519:aload           5
	//  309  521:putfield        #25  <Field long[] zzayo>
					}
				} else
	//* 310  524:goto            0
				{
					int k3 = zzxz1.zzas(zzxz1.zzvb());
	//  311  527:aload_1         
	//  312  528:aload_1         
	//  313  529:invokevirtual   #123 <Method int zzxz.zzvb()>
	//  314  532:invokevirtual   #127 <Method int zzxz.zzas(int)>
	//  315  535:istore          4
					int j1 = zzxz1.getPosition();
	//  316  537:aload_1         
	//  317  538:invokevirtual   #130 <Method int zzxz.getPosition()>
	//  318  541:istore_2        
					int l2;
					for(l2 = 0; zzxz1.zzyy() > 0; l2++)
	//* 319  542:iconst_0        
	//* 320  543:istore_3        
	//* 321  544:aload_1         
	//* 322  545:invokevirtual   #133 <Method int zzxz.zzyy()>
	//* 323  548:ifle            563
						zzxz1.zzvc();
	//  324  551:aload_1         
	//  325  552:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  326  555:pop2            

	//  327  556:iload_3         
	//  328  557:iconst_1        
	//  329  558:iadd            
	//  330  559:istore_3        
	//* 331  560:goto            544
					zzxz1.zzcb(j1);
	//  332  563:aload_1         
	//  333  564:iload_2         
	//  334  565:invokevirtual   #141 <Method void zzxz.zzcb(int)>
					long al2[] = zzayn;
	//  335  568:aload_0         
	//  336  569:getfield        #23  <Field long[] zzayn>
	//  337  572:astore          5
					if(al2 == null)
	//* 338  574:aload           5
	//* 339  576:ifnonnull       584
						j1 = 0;
	//  340  579:iconst_0        
	//  341  580:istore_2        
					else
	//* 342  581:goto            588
						j1 = al2.length;
	//  343  584:aload           5
	//  344  586:arraylength     
	//  345  587:istore_2        
					al2 = new long[l2 + j1];
	//  346  588:iload_3         
	//  347  589:iload_2         
	//  348  590:iadd            
	//  349  591:newarray        long[]
	//  350  593:astore          5
					l2 = j1;
	//  351  595:iload_2         
	//  352  596:istore_3        
					if(j1 != 0)
	//* 353  597:iload_2         
	//* 354  598:ifeq            615
					{
						System.arraycopy(((Object) (zzayn)), 0, ((Object) (al2)), 0, j1);
	//  355  601:aload_0         
	//  356  602:getfield        #23  <Field long[] zzayn>
	//  357  605:iconst_0        
	//  358  606:aload           5
	//  359  608:iconst_0        
	//  360  609:iload_2         
	//  361  610:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
						l2 = j1;
	//  362  613:iload_2         
	//  363  614:istore_3        
					}
					for(; l2 < al2.length; l2++)
	//* 364  615:iload_3         
	//* 365  616:aload           5
	//* 366  618:arraylength     
	//* 367  619:icmpge          637
						al2[l2] = zzxz1.zzvc();
	//  368  622:aload           5
	//  369  624:iload_3         
	//  370  625:aload_1         
	//  371  626:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  372  629:lastore         

	//  373  630:iload_3         
	//  374  631:iconst_1        
	//  375  632:iadd            
	//  376  633:istore_3        
	//* 377  634:goto            615
					zzayn = al2;
	//  378  637:aload_0         
	//  379  638:aload           5
	//  380  640:putfield        #23  <Field long[] zzayn>
					zzxz1.zzat(k3);
	//  381  643:aload_1         
	//  382  644:iload           4
	//  383  646:invokevirtual   #144 <Method void zzxz.zzat(int)>
				}
			} else
	//* 384  649:goto            0
			{
				int i3 = zzyl.zzb(zzxz1, 8);
	//  385  652:aload_1         
	//  386  653:bipush          8
	//  387  655:invokestatic    #109 <Method int zzyl.zzb(zzxz, int)>
	//  388  658:istore_3        
				long al3[] = zzayn;
	//  389  659:aload_0         
	//  390  660:getfield        #23  <Field long[] zzayn>
	//  391  663:astore          5
				int k1;
				if(al3 == null)
	//* 392  665:aload           5
	//* 393  667:ifnonnull       675
					k1 = 0;
	//  394  670:iconst_0        
	//  395  671:istore_2        
				else
	//* 396  672:goto            679
					k1 = al3.length;
	//  397  675:aload           5
	//  398  677:arraylength     
	//  399  678:istore_2        
				al3 = new long[i3 + k1];
	//  400  679:iload_3         
	//  401  680:iload_2         
	//  402  681:iadd            
	//  403  682:newarray        long[]
	//  404  684:astore          5
				i3 = k1;
	//  405  686:iload_2         
	//  406  687:istore_3        
				if(k1 != 0)
	//* 407  688:iload_2         
	//* 408  689:ifeq            706
				{
					System.arraycopy(((Object) (zzayn)), 0, ((Object) (al3)), 0, k1);
	//  409  692:aload_0         
	//  410  693:getfield        #23  <Field long[] zzayn>
	//  411  696:iconst_0        
	//  412  697:aload           5
	//  413  699:iconst_0        
	//  414  700:iload_2         
	//  415  701:invokestatic    #115 <Method void System.arraycopy(Object, int, Object, int, int)>
					i3 = k1;
	//  416  704:iload_2         
	//  417  705:istore_3        
				}
				for(; i3 < al3.length - 1; i3++)
	//* 418  706:iload_3         
	//* 419  707:aload           5
	//* 420  709:arraylength     
	//* 421  710:iconst_1        
	//* 422  711:isub            
	//* 423  712:icmpge          735
				{
					al3[i3] = zzxz1.zzvc();
	//  424  715:aload           5
	//  425  717:iload_3         
	//  426  718:aload_1         
	//  427  719:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  428  722:lastore         
					zzxz1.zzuj();
	//  429  723:aload_1         
	//  430  724:invokevirtual   #102 <Method int zzxz.zzuj()>
	//  431  727:pop             
				}

	//  432  728:iload_3         
	//  433  729:iconst_1        
	//  434  730:iadd            
	//  435  731:istore_3        
	//* 436  732:goto            706
				al3[i3] = zzxz1.zzvc();
	//  437  735:aload           5
	//  438  737:iload_3         
	//  439  738:aload_1         
	//  440  739:invokevirtual   #137 <Method long zzxz.zzvc()>
	//  441  742:lastore         
				zzayn = al3;
	//  442  743:aload_0         
	//  443  744:aload           5
	//  444  746:putfield        #23  <Field long[] zzayn>
			}
		} while(true);
	//  445  749:goto            0
		return ((zzyi) (this));
	//  446  752:aload_0         
	//  447  753:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object aobj[] = ((Object []) (zzayn));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long[] zzayn>
	//    2    4:astore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(aobj != null && aobj.length > 0)
	//*   5    8:aload           4
	//*   6   10:ifnull          50
	//*   7   13:aload           4
	//*   8   15:arraylength     
	//*   9   16:ifle            50
		{
			int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
			do
			{
				aobj = ((Object []) (zzayn));
	//   12   21:aload_0         
	//   13   22:getfield        #23  <Field long[] zzayn>
	//   14   25:astore          4
				if(i >= aobj.length)
					break;
	//   15   27:iload_2         
	//   16   28:aload           4
	//   17   30:arraylength     
	//   18   31:icmpge          50
				zzya1.zza(1, aobj[i]);
	//   19   34:aload_1         
	//   20   35:iconst_1        
	//   21   36:aload           4
	//   22   38:iload_2         
	//   23   39:laload          
	//   24   40:invokevirtual   #151 <Method void zzya.zza(int, long)>
				i++;
	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
			} while(true);
	//   29   47:goto            21
		}
		aobj = ((Object []) (zzayo));
	//   30   50:aload_0         
	//   31   51:getfield        #25  <Field long[] zzayo>
	//   32   54:astore          4
		if(aobj != null && aobj.length > 0)
	//*  33   56:aload           4
	//*  34   58:ifnull          98
	//*  35   61:aload           4
	//*  36   63:arraylength     
	//*  37   64:ifle            98
		{
			int j = 0;
	//   38   67:iconst_0        
	//   39   68:istore_2        
			do
			{
				aobj = ((Object []) (zzayo));
	//   40   69:aload_0         
	//   41   70:getfield        #25  <Field long[] zzayo>
	//   42   73:astore          4
				if(j >= aobj.length)
					break;
	//   43   75:iload_2         
	//   44   76:aload           4
	//   45   78:arraylength     
	//   46   79:icmpge          98
				zzya1.zza(2, aobj[j]);
	//   47   82:aload_1         
	//   48   83:iconst_2        
	//   49   84:aload           4
	//   50   86:iload_2         
	//   51   87:laload          
	//   52   88:invokevirtual   #151 <Method void zzya.zza(int, long)>
				j++;
	//   53   91:iload_2         
	//   54   92:iconst_1        
	//   55   93:iadd            
	//   56   94:istore_2        
			} while(true);
	//   57   95:goto            69
		}
		aobj = ((Object []) (zzayp));
	//   58   98:aload_0         
	//   59   99:getfield        #33  <Field zzfs[] zzayp>
	//   60  102:astore          4
		if(aobj != null && aobj.length > 0)
	//*  61  104:aload           4
	//*  62  106:ifnull          155
	//*  63  109:aload           4
	//*  64  111:arraylength     
	//*  65  112:ifle            155
		{
			int k = 0;
	//   66  115:iconst_0        
	//   67  116:istore_2        
			do
			{
				aobj = ((Object []) (zzayp));
	//   68  117:aload_0         
	//   69  118:getfield        #33  <Field zzfs[] zzayp>
	//   70  121:astore          4
				if(k >= aobj.length)
					break;
	//   71  123:iload_2         
	//   72  124:aload           4
	//   73  126:arraylength     
	//   74  127:icmpge          155
				zzfs zzfs1 = aobj[k];
	//   75  130:aload           4
	//   76  132:iload_2         
	//   77  133:aaload          
	//   78  134:astore          4
				if(zzfs1 != null)
	//*  79  136:aload           4
	//*  80  138:ifnull          148
					zzya1.zza(3, ((zzyi) (zzfs1)));
	//   81  141:aload_1         
	//   82  142:iconst_3        
	//   83  143:aload           4
	//   84  145:invokevirtual   #154 <Method void zzya.zza(int, zzyi)>
				k++;
	//   85  148:iload_2         
	//   86  149:iconst_1        
	//   87  150:iadd            
	//   88  151:istore_2        
			} while(true);
	//   89  152:goto            117
		}
		zzfs1 = ((zzfs) (zzayq));
	//   90  155:aload_0         
	//   91  156:getfield        #41  <Field zzfy[] zzayq>
	//   92  159:astore          4
		if(zzfs1 != null && zzfs1.length > 0)
	//*  93  161:aload           4
	//*  94  163:ifnull          212
	//*  95  166:aload           4
	//*  96  168:arraylength     
	//*  97  169:ifle            212
		{
			int l = ((int) (flag));
	//   98  172:iload_3         
	//   99  173:istore_2        
			do
			{
				zzfy azzfy[] = zzayq;
	//  100  174:aload_0         
	//  101  175:getfield        #41  <Field zzfy[] zzayq>
	//  102  178:astore          4
				if(l >= azzfy.length)
					break;
	//  103  180:iload_2         
	//  104  181:aload           4
	//  105  183:arraylength     
	//  106  184:icmpge          212
				zzfy zzfy1 = azzfy[l];
	//  107  187:aload           4
	//  108  189:iload_2         
	//  109  190:aaload          
	//  110  191:astore          4
				if(zzfy1 != null)
	//* 111  193:aload           4
	//* 112  195:ifnull          205
					zzya1.zza(4, ((zzyi) (zzfy1)));
	//  113  198:aload_1         
	//  114  199:iconst_4        
	//  115  200:aload           4
	//  116  202:invokevirtual   #154 <Method void zzya.zza(int, zzyi)>
				l++;
	//  117  205:iload_2         
	//  118  206:iconst_1        
	//  119  207:iadd            
	//  120  208:istore_2        
			} while(true);
	//  121  209:goto            174
		}
		super.zza(zzya1);
	//  122  212:aload_0         
	//  123  213:aload_1         
	//  124  214:invokespecial   #156 <Method void zzyc.zza(zzya)>
	//  125  217:return          
	}

	protected final int zzf()
	{
		int i1 = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method int zzyc.zzf()>
	//    2    4:istore_3        
		Object aobj[] = ((Object []) (zzayn));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field long[] zzayn>
	//    5    9:astore          5
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
		int i = i1;
	//    8   14:iload_3         
	//    9   15:istore_1        
		if(aobj != null)
	//*  10   16:aload           5
	//*  11   18:ifnull          73
		{
			i = i1;
	//   12   21:iload_3         
	//   13   22:istore_1        
			if(aobj.length > 0)
	//*  14   23:aload           5
	//*  15   25:arraylength     
	//*  16   26:ifle            73
			{
				i = 0;
	//   17   29:iconst_0        
	//   18   30:istore_1        
				int j = i;
	//   19   31:iload_1         
	//   20   32:istore_2        
				do
				{
					aobj = ((Object []) (zzayn));
	//   21   33:aload_0         
	//   22   34:getfield        #23  <Field long[] zzayn>
	//   23   37:astore          5
					if(i >= aobj.length)
						break;
	//   24   39:iload_1         
	//   25   40:aload           5
	//   26   42:arraylength     
	//   27   43:icmpge          63
					j += zzya.zzbg(aobj[i]);
	//   28   46:iload_2         
	//   29   47:aload           5
	//   30   49:iload_1         
	//   31   50:laload          
	//   32   51:invokestatic    #163 <Method int zzya.zzbg(long)>
	//   33   54:iadd            
	//   34   55:istore_2        
					i++;
	//   35   56:iload_1         
	//   36   57:iconst_1        
	//   37   58:iadd            
	//   38   59:istore_1        
				} while(true);
	//   39   60:goto            33
				i = i1 + j + aobj.length * 1;
	//   40   63:iload_3         
	//   41   64:iload_2         
	//   42   65:iadd            
	//   43   66:aload           5
	//   44   68:arraylength     
	//   45   69:iconst_1        
	//   46   70:imul            
	//   47   71:iadd            
	//   48   72:istore_1        
			}
		}
		aobj = ((Object []) (zzayo));
	//   49   73:aload_0         
	//   50   74:getfield        #25  <Field long[] zzayo>
	//   51   77:astore          5
		int k = i;
	//   52   79:iload_1         
	//   53   80:istore_2        
		if(aobj != null)
	//*  54   81:aload           5
	//*  55   83:ifnull          138
		{
			k = i;
	//   56   86:iload_1         
	//   57   87:istore_2        
			if(aobj.length > 0)
	//*  58   88:aload           5
	//*  59   90:arraylength     
	//*  60   91:ifle            138
			{
				k = 0;
	//   61   94:iconst_0        
	//   62   95:istore_2        
				i1 = k;
	//   63   96:iload_2         
	//   64   97:istore_3        
				do
				{
					aobj = ((Object []) (zzayo));
	//   65   98:aload_0         
	//   66   99:getfield        #25  <Field long[] zzayo>
	//   67  102:astore          5
					if(k >= aobj.length)
						break;
	//   68  104:iload_2         
	//   69  105:aload           5
	//   70  107:arraylength     
	//   71  108:icmpge          128
					i1 += zzya.zzbg(aobj[k]);
	//   72  111:iload_3         
	//   73  112:aload           5
	//   74  114:iload_2         
	//   75  115:laload          
	//   76  116:invokestatic    #163 <Method int zzya.zzbg(long)>
	//   77  119:iadd            
	//   78  120:istore_3        
					k++;
	//   79  121:iload_2         
	//   80  122:iconst_1        
	//   81  123:iadd            
	//   82  124:istore_2        
				} while(true);
	//   83  125:goto            98
				k = i + i1 + aobj.length * 1;
	//   84  128:iload_1         
	//   85  129:iload_3         
	//   86  130:iadd            
	//   87  131:aload           5
	//   88  133:arraylength     
	//   89  134:iconst_1        
	//   90  135:imul            
	//   91  136:iadd            
	//   92  137:istore_2        
			}
		}
		aobj = ((Object []) (zzayp));
	//   93  138:aload_0         
	//   94  139:getfield        #33  <Field zzfs[] zzayp>
	//   95  142:astore          5
		i = k;
	//   96  144:iload_2         
	//   97  145:istore_1        
		if(aobj != null)
	//*  98  146:aload           5
	//*  99  148:ifnull          207
		{
			i = k;
	//  100  151:iload_2         
	//  101  152:istore_1        
			if(aobj.length > 0)
	//* 102  153:aload           5
	//* 103  155:arraylength     
	//* 104  156:ifle            207
			{
				i = k;
	//  105  159:iload_2         
	//  106  160:istore_1        
				k = 0;
	//  107  161:iconst_0        
	//  108  162:istore_2        
				do
				{
					aobj = ((Object []) (zzayp));
	//  109  163:aload_0         
	//  110  164:getfield        #33  <Field zzfs[] zzayp>
	//  111  167:astore          5
					if(k >= aobj.length)
						break;
	//  112  169:iload_2         
	//  113  170:aload           5
	//  114  172:arraylength     
	//  115  173:icmpge          207
					zzfs zzfs1 = aobj[k];
	//  116  176:aload           5
	//  117  178:iload_2         
	//  118  179:aaload          
	//  119  180:astore          5
					i1 = i;
	//  120  182:iload_1         
	//  121  183:istore_3        
					if(zzfs1 != null)
	//* 122  184:aload           5
	//* 123  186:ifnull          198
						i1 = i + zzya.zzb(3, ((zzyi) (zzfs1)));
	//  124  189:iload_1         
	//  125  190:iconst_3        
	//  126  191:aload           5
	//  127  193:invokestatic    #166 <Method int zzya.zzb(int, zzyi)>
	//  128  196:iadd            
	//  129  197:istore_3        
					k++;
	//  130  198:iload_2         
	//  131  199:iconst_1        
	//  132  200:iadd            
	//  133  201:istore_2        
					i = i1;
	//  134  202:iload_3         
	//  135  203:istore_1        
				} while(true);
	//  136  204:goto            163
			}
		}
		zzfs1 = ((zzfs) (zzayq));
	//  137  207:aload_0         
	//  138  208:getfield        #41  <Field zzfy[] zzayq>
	//  139  211:astore          5
		i1 = i;
	//  140  213:iload_1         
	//  141  214:istore_3        
		if(zzfs1 != null)
	//* 142  215:aload           5
	//* 143  217:ifnull          277
		{
			i1 = i;
	//  144  220:iload_1         
	//  145  221:istore_3        
			if(zzfs1.length > 0)
	//* 146  222:aload           5
	//* 147  224:arraylength     
	//* 148  225:ifle            277
			{
				int l = ((int) (flag));
	//  149  228:iload           4
	//  150  230:istore_2        
				do
				{
					zzfy azzfy[] = zzayq;
	//  151  231:aload_0         
	//  152  232:getfield        #41  <Field zzfy[] zzayq>
	//  153  235:astore          5
					i1 = i;
	//  154  237:iload_1         
	//  155  238:istore_3        
					if(l >= azzfy.length)
						break;
	//  156  239:iload_2         
	//  157  240:aload           5
	//  158  242:arraylength     
	//  159  243:icmpge          277
					zzfy zzfy1 = azzfy[l];
	//  160  246:aload           5
	//  161  248:iload_2         
	//  162  249:aaload          
	//  163  250:astore          5
					i1 = i;
	//  164  252:iload_1         
	//  165  253:istore_3        
					if(zzfy1 != null)
	//* 166  254:aload           5
	//* 167  256:ifnull          268
						i1 = i + zzya.zzb(4, ((zzyi) (zzfy1)));
	//  168  259:iload_1         
	//  169  260:iconst_4        
	//  170  261:aload           5
	//  171  263:invokestatic    #166 <Method int zzya.zzb(int, zzyi)>
	//  172  266:iadd            
	//  173  267:istore_3        
					l++;
	//  174  268:iload_2         
	//  175  269:iconst_1        
	//  176  270:iadd            
	//  177  271:istore_2        
					i = i1;
	//  178  272:iload_3         
	//  179  273:istore_1        
				} while(true);
	//  180  274:goto            231
			}
		}
		return i1;
	//  181  277:iload_3         
	//  182  278:ireturn         
	}

	public long zzayn[];
	public long zzayo[];
	public zzfs zzayp[];
	public zzfy zzayq[];
}
