// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjw, zzjk, zzeb, 
//			zzjl, zzjt

public final class zzdi extends zzjn
{

	public zzdi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzjn()>
		zzoe = zzjw.zzzb;
	//    2    4:aload_0         
	//    3    5:getstatic       #16  <Field int[] zzjw.zzzb>
	//    4    8:putfield        #18  <Field int[] zzoe>
		zzadp = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #22  <Field int zzadp>
	//    8   16:return          
	}

	private final zzdi zzb(zzjk zzjk1)
		throws IOException
	{
_L5:
		int l = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int zzjk.zzdq()>
	//    2    4:istore          4
		if(l == 0) goto _L2; else goto _L1
	//    3    6:iload           4
	//    4    8:ifeq            357
_L1:
		if(l == 8) goto _L4; else goto _L3
	//    5   11:iload           4
	//    6   13:bipush          8
	//    7   15:icmpeq          193
_L3:
label0:
		{
			if(l == 10)
				break label0;
	//    8   18:iload           4
	//    9   20:bipush          10
	//   10   22:icmpeq          37
			if(!super.zza(zzjk1, l))
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:iload           4
	//*  14   29:invokespecial   #39  <Method boolean zzjn.zza(zzjk, int)>
	//*  15   32:ifne            0
				return this;
	//   16   35:aload_0         
	//   17   36:areturn         
		}
		  goto _L5
		int i;
		int j;
		l = zzjk1.zzan(zzjk1.zzdt());
	//   18   37:aload_1         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #42  <Method int zzjk.zzdt()>
	//   21   42:invokevirtual   #46  <Method int zzjk.zzan(int)>
	//   22   45:istore          4
		i = zzjk1.getPosition();
	//   23   47:aload_1         
	//   24   48:invokevirtual   #49  <Method int zzjk.getPosition()>
	//   25   51:istore_2        
		j = 0;
	//   26   52:iconst_0        
	//   27   53:istore_3        
_L6:
		if(zzjk1.zzhq() <= 0)
			break MISSING_BLOCK_LABEL_76;
	//   28   54:aload_1         
	//   29   55:invokevirtual   #52  <Method int zzjk.zzhq()>
	//   30   58:ifle            76
		zzeb.zzx(zzjk1.zzdt());
	//   31   61:aload_1         
	//   32   62:invokevirtual   #42  <Method int zzjk.zzdt()>
	//   33   65:invokestatic    #57  <Method int zzeb.zzx(int)>
	//   34   68:pop             
		j++;
	//   35   69:iload_3         
	//   36   70:iconst_1        
	//   37   71:iadd            
	//   38   72:istore_3        
		  goto _L6
	//*  39   73:goto            54
		if(j == 0) goto _L8; else goto _L7
	//   40   76:iload_3         
	//   41   77:ifeq            184
_L7:
		int ai[];
		zzjk1.zzbt(i);
	//   42   80:aload_1         
	//   43   81:iload_2         
	//   44   82:invokevirtual   #61  <Method void zzjk.zzbt(int)>
		ai = zzoe;
	//   45   85:aload_0         
	//   46   86:getfield        #18  <Field int[] zzoe>
	//   47   89:astore          7
		if(ai == null)
	//*  48   91:aload           7
	//*  49   93:ifnonnull       101
			i = 0;
	//   50   96:iconst_0        
	//   51   97:istore_2        
		else
	//*  52   98:goto            105
			i = ai.length;
	//   53  101:aload           7
	//   54  103:arraylength     
	//   55  104:istore_2        
		ai = new int[j + i];
	//   56  105:iload_3         
	//   57  106:iload_2         
	//   58  107:iadd            
	//   59  108:newarray        int[]
	//   60  110:astore          7
		j = i;
	//   61  112:iload_2         
	//   62  113:istore_3        
		if(i != 0)
	//*  63  114:iload_2         
	//*  64  115:ifeq            132
		{
			System.arraycopy(((Object) (zzoe)), 0, ((Object) (ai)), 0, i);
	//   65  118:aload_0         
	//   66  119:getfield        #18  <Field int[] zzoe>
	//   67  122:iconst_0        
	//   68  123:aload           7
	//   69  125:iconst_0        
	//   70  126:iload_2         
	//   71  127:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
			j = i;
	//   72  130:iload_2         
	//   73  131:istore_3        
		}
_L10:
		if(zzjk1.zzhq() <= 0)
			break; /* Loop/switch isn't completed */
	//   74  132:aload_1         
	//   75  133:invokevirtual   #52  <Method int zzjk.zzhq()>
	//   76  136:ifle            178
		i = zzjk1.getPosition();
	//   77  139:aload_1         
	//   78  140:invokevirtual   #49  <Method int zzjk.getPosition()>
	//   79  143:istore_2        
		ai[j] = zzeb.zzx(zzjk1.zzdt());
	//   80  144:aload           7
	//   81  146:iload_3         
	//   82  147:aload_1         
	//   83  148:invokevirtual   #42  <Method int zzjk.zzdt()>
	//   84  151:invokestatic    #57  <Method int zzeb.zzx(int)>
	//   85  154:iastore         
		j++;
	//   86  155:iload_3         
	//   87  156:iconst_1        
	//   88  157:iadd            
	//   89  158:istore_3        
		continue; /* Loop/switch isn't completed */
	//   90  159:goto            132
_L14:
		zzjk1.zzbt(i);
	//   91  162:aload_1         
	//   92  163:iload_2         
	//   93  164:invokevirtual   #61  <Method void zzjk.zzbt(int)>
		((zzjn)this).zza(zzjk1, 8);
	//   94  167:aload_0         
	//   95  168:aload_1         
	//   96  169:bipush          8
	//   97  171:invokevirtual   #39  <Method boolean zzjn.zza(zzjk, int)>
	//   98  174:pop             
		if(true) goto _L10; else goto _L9
	//   99  175:goto            132
_L9:
		zzoe = ai;
	//  100  178:aload_0         
	//  101  179:aload           7
	//  102  181:putfield        #18  <Field int[] zzoe>
_L8:
		zzjk1.zzao(l);
	//  103  184:aload_1         
	//  104  185:iload           4
	//  105  187:invokevirtual   #70  <Method void zzjk.zzao(int)>
		  goto _L5
	//* 106  190:goto            0
_L4:
		int i1;
		i1 = zzjw.zzb(zzjk1, 8);
	//  107  193:aload_1         
	//  108  194:bipush          8
	//  109  196:invokestatic    #73  <Method int zzjw.zzb(zzjk, int)>
	//  110  199:istore          5
		ai = new int[i1];
	//  111  201:iload           5
	//  112  203:newarray        int[]
	//  113  205:astore          7
		j = 0;
	//  114  207:iconst_0        
	//  115  208:istore_3        
		i = j;
	//  116  209:iload_3         
	//  117  210:istore_2        
_L13:
		if(j >= i1) goto _L12; else goto _L11
	//  118  211:iload_3         
	//  119  212:iload           5
	//  120  214:icmpge          271
_L11:
		int j1;
		if(j != 0)
	//* 121  217:iload_3         
	//* 122  218:ifeq            226
			zzjk1.zzdq();
	//  123  221:aload_1         
	//  124  222:invokevirtual   #35  <Method int zzjk.zzdq()>
	//  125  225:pop             
		j1 = zzjk1.getPosition();
	//  126  226:aload_1         
	//  127  227:invokevirtual   #49  <Method int zzjk.getPosition()>
	//  128  230:istore          6
		ai[i] = zzeb.zzx(zzjk1.zzdt());
	//  129  232:aload           7
	//  130  234:iload_2         
	//  131  235:aload_1         
	//  132  236:invokevirtual   #42  <Method int zzjk.zzdt()>
	//  133  239:invokestatic    #57  <Method int zzeb.zzx(int)>
	//  134  242:iastore         
		i++;
	//  135  243:iload_2         
	//  136  244:iconst_1        
	//  137  245:iadd            
	//  138  246:istore_2        
		continue; /* Loop/switch isn't completed */
	//  139  247:goto            264
_L15:
		zzjk1.zzbt(j1);
	//  140  250:aload_1         
	//  141  251:iload           6
	//  142  253:invokevirtual   #61  <Method void zzjk.zzbt(int)>
		((zzjn)this).zza(zzjk1, l);
	//  143  256:aload_0         
	//  144  257:aload_1         
	//  145  258:iload           4
	//  146  260:invokevirtual   #39  <Method boolean zzjn.zza(zzjk, int)>
	//  147  263:pop             
		j++;
	//  148  264:iload_3         
	//  149  265:iconst_1        
	//  150  266:iadd            
	//  151  267:istore_3        
		  goto _L13
	//* 152  268:goto            211
_L12:
		if(i != 0)
	//* 153  271:iload_2         
	//* 154  272:ifeq            0
		{
			int ai1[] = zzoe;
	//  155  275:aload_0         
	//  156  276:getfield        #18  <Field int[] zzoe>
	//  157  279:astore          8
			int k;
			if(ai1 == null)
	//* 158  281:aload           8
	//* 159  283:ifnonnull       291
				k = 0;
	//  160  286:iconst_0        
	//  161  287:istore_3        
			else
	//* 162  288:goto            295
				k = ai1.length;
	//  163  291:aload           8
	//  164  293:arraylength     
	//  165  294:istore_3        
			if(k == 0 && i == ai.length)
	//* 166  295:iload_3         
	//* 167  296:ifne            315
	//* 168  299:iload_2         
	//* 169  300:aload           7
	//* 170  302:arraylength     
	//* 171  303:icmpne          315
			{
				zzoe = ai;
	//  172  306:aload_0         
	//  173  307:aload           7
	//  174  309:putfield        #18  <Field int[] zzoe>
			} else
	//* 175  312:goto            0
			{
				int ai2[] = new int[k + i];
	//  176  315:iload_3         
	//  177  316:iload_2         
	//  178  317:iadd            
	//  179  318:newarray        int[]
	//  180  320:astore          8
				if(k != 0)
	//* 181  322:iload_3         
	//* 182  323:ifeq            338
					System.arraycopy(((Object) (zzoe)), 0, ((Object) (ai2)), 0, k);
	//  183  326:aload_0         
	//  184  327:getfield        #18  <Field int[] zzoe>
	//  185  330:iconst_0        
	//  186  331:aload           8
	//  187  333:iconst_0        
	//  188  334:iload_3         
	//  189  335:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (ai)), 0, ((Object) (ai2)), k, i);
	//  190  338:aload           7
	//  191  340:iconst_0        
	//  192  341:aload           8
	//  193  343:iload_3         
	//  194  344:iload_2         
	//  195  345:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
				zzoe = ai2;
	//  196  348:aload_0         
	//  197  349:aload           8
	//  198  351:putfield        #18  <Field int[] zzoe>
			}
		}
		  goto _L5
	//* 199  354:goto            0
_L2:
		return this;
	//  200  357:aload_0         
	//  201  358:areturn         
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//  202  359:astore          7
		  goto _L6
	//* 203  361:goto            54
		IllegalArgumentException illegalargumentexception1;
		illegalargumentexception1;
	//  204  364:astore          8
		  goto _L14
	//* 205  366:goto            162
		illegalargumentexception1;
	//  206  369:astore          8
		  goto _L15
	//* 207  371:goto            250
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		return ((zzjt) (zzb(zzjk1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method zzdi zzb(zzjk)>
	//    3    5:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		int ai[] = zzoe;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int[] zzoe>
	//    2    4:astore_3        
		if(ai != null && ai.length > 0)
	//*   3    5:aload_3         
	//*   4    6:ifnull          42
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:ifle            42
		{
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			do
			{
				int ai1[] = zzoe;
	//   10   16:aload_0         
	//   11   17:getfield        #18  <Field int[] zzoe>
	//   12   20:astore_3        
				if(i >= ai1.length)
					break;
	//   13   21:iload_2         
	//   14   22:aload_3         
	//   15   23:arraylength     
	//   16   24:icmpge          42
				zzjl1.zze(1, ai1[i]);
	//   17   27:aload_1         
	//   18   28:iconst_1        
	//   19   29:aload_3         
	//   20   30:iload_2         
	//   21   31:iaload          
	//   22   32:invokevirtual   #84  <Method void zzjl.zze(int, int)>
				i++;
	//   23   35:iload_2         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore_2        
			} while(true);
	//   27   39:goto            16
		}
		super.zza(zzjl1);
	//   28   42:aload_0         
	//   29   43:aload_1         
	//   30   44:invokespecial   #86  <Method void zzjn.zza(zzjl)>
	//   31   47:return          
	}

	protected final int zzt()
	{
		int k = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzjn.zzt()>
	//    2    4:istore_3        
		int ai[] = zzoe;
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field int[] zzoe>
	//    5    9:astore          4
		int i = k;
	//    6   11:iload_3         
	//    7   12:istore_1        
		if(ai != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          70
		{
			i = k;
	//   10   18:iload_3         
	//   11   19:istore_1        
			if(ai.length > 0)
	//*  12   20:aload           4
	//*  13   22:arraylength     
	//*  14   23:ifle            70
			{
				i = 0;
	//   15   26:iconst_0        
	//   16   27:istore_1        
				int j = 0;
	//   17   28:iconst_0        
	//   18   29:istore_2        
				int ai1[];
				do
				{
					ai1 = zzoe;
	//   19   30:aload_0         
	//   20   31:getfield        #18  <Field int[] zzoe>
	//   21   34:astore          4
					if(i >= ai1.length)
						break;
	//   22   36:iload_1         
	//   23   37:aload           4
	//   24   39:arraylength     
	//   25   40:icmpge          60
					j += zzjl.zzaw(ai1[i]);
	//   26   43:iload_2         
	//   27   44:aload           4
	//   28   46:iload_1         
	//   29   47:iaload          
	//   30   48:invokestatic    #92  <Method int zzjl.zzaw(int)>
	//   31   51:iadd            
	//   32   52:istore_2        
					i++;
	//   33   53:iload_1         
	//   34   54:iconst_1        
	//   35   55:iadd            
	//   36   56:istore_1        
				} while(true);
	//   37   57:goto            30
				i = k + j + ai1.length * 1;
	//   38   60:iload_3         
	//   39   61:iload_2         
	//   40   62:iadd            
	//   41   63:aload           4
	//   42   65:arraylength     
	//   43   66:iconst_1        
	//   44   67:imul            
	//   45   68:iadd            
	//   46   69:istore_1        
			}
		}
		return i;
	//   47   70:iload_1         
	//   48   71:ireturn         
	}

	private int zzoe[];
}
