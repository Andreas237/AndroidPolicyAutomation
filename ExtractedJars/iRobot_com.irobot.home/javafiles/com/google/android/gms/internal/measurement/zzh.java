// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyl, zzyg, zzye, 
//			zzxz, zzya, zzyi

public final class zzh extends zzyc
{

	public zzh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzyc()>
		zzoe = zzyl.zzcaq;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field int[] zzyl.zzcaq>
	//    4    8:putfield        #26  <Field int[] zzoe>
		zzof = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #28  <Field int zzof>
		name = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #30  <Field int name>
		zzog = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #32  <Field boolean zzog>
		zzoh = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #34  <Field boolean zzoh>
		zzcev = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #38  <Field zzye zzcev>
		zzcff = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #41  <Field int zzcff>
	//   23   41:return          
	}

	public static zzh[] zze()
	{
		if(zzod == null)
	//*   0    0:getstatic       #46  <Field zzh[] zzod>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfe)
	//*   2    6:getstatic       #52  <Field Object zzyg.zzcfe>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzod == null)
	//*   6   12:getstatic       #46  <Field zzh[] zzod>
	//*   7   15:ifnonnull       25
					zzod = new zzh[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzh[]
	//   10   22:putstatic       #46  <Field zzh[] zzod>
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
		return zzod;
	//   19   35:getstatic       #46  <Field zzh[] zzod>
	//   20   38:areturn         
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
		if(!(obj instanceof zzh))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzh>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzh)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzh>
	//   12   20:astore_1        
		if(!zzyg.equals(zzoe, ((zzh) (obj)).zzoe))
	//*  13   21:aload_0         
	//*  14   22:getfield        #26  <Field int[] zzoe>
	//*  15   25:aload_1         
	//*  16   26:getfield        #26  <Field int[] zzoe>
	//*  17   29:invokestatic    #57  <Method boolean zzyg.equals(int[], int[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(zzof != ((zzh) (obj)).zzof)
	//*  21   37:aload_0         
	//*  22   38:getfield        #28  <Field int zzof>
	//*  23   41:aload_1         
	//*  24   42:getfield        #28  <Field int zzof>
	//*  25   45:icmpeq          50
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		if(name != ((zzh) (obj)).name)
	//*  28   50:aload_0         
	//*  29   51:getfield        #30  <Field int name>
	//*  30   54:aload_1         
	//*  31   55:getfield        #30  <Field int name>
	//*  32   58:icmpeq          63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(zzog != ((zzh) (obj)).zzog)
	//*  35   63:aload_0         
	//*  36   64:getfield        #32  <Field boolean zzog>
	//*  37   67:aload_1         
	//*  38   68:getfield        #32  <Field boolean zzog>
	//*  39   71:icmpeq          76
			return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
		if(zzoh != ((zzh) (obj)).zzoh)
	//*  42   76:aload_0         
	//*  43   77:getfield        #34  <Field boolean zzoh>
	//*  44   80:aload_1         
	//*  45   81:getfield        #34  <Field boolean zzoh>
	//*  46   84:icmpeq          89
			return false;
	//   47   87:iconst_0        
	//   48   88:ireturn         
		if(zzcev != null && !zzcev.isEmpty())
	//*  49   89:aload_0         
	//*  50   90:getfield        #38  <Field zzye zzcev>
	//*  51   93:ifnull          121
	//*  52   96:aload_0         
	//*  53   97:getfield        #38  <Field zzye zzcev>
	//*  54  100:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//*  55  103:ifeq            109
	//*  56  106:goto            121
			return zzcev.equals(((Object) (((zzh) (obj)).zzcev)));
	//   57  109:aload_0         
	//   58  110:getfield        #38  <Field zzye zzcev>
	//   59  113:aload_1         
	//   60  114:getfield        #38  <Field zzye zzcev>
	//   61  117:invokevirtual   #65  <Method boolean zzye.equals(Object)>
	//   62  120:ireturn         
		if(((zzh) (obj)).zzcev != null)
	//*  63  121:aload_1         
	//*  64  122:getfield        #38  <Field zzye zzcev>
	//*  65  125:ifnull          142
			return ((zzh) (obj)).zzcev.isEmpty();
	//   66  128:aload_1         
	//   67  129:getfield        #38  <Field zzye zzcev>
	//   68  132:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//   69  135:ifeq            140
	//   70  138:iconst_1        
	//   71  139:ireturn         
	//   72  140:iconst_0        
	//   73  141:ireturn         
		else
			return true;
	//   74  142:iconst_1        
	//   75  143:ireturn         
	}

	public final int hashCode()
	{
		int j = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #79  <Method String Class.getName()>
	//    3    7:invokevirtual   #83  <Method int String.hashCode()>
	//    4   10:istore          4
		int k = zzyg.hashCode(zzoe);
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field int[] zzoe>
	//    7   16:invokestatic    #86  <Method int zzyg.hashCode(int[])>
	//    8   19:istore          5
		int l = zzof;
	//    9   21:aload_0         
	//   10   22:getfield        #28  <Field int zzof>
	//   11   25:istore          6
		int i1 = name;
	//   12   27:aload_0         
	//   13   28:getfield        #30  <Field int name>
	//   14   31:istore          7
		boolean flag = zzog;
	//   15   33:aload_0         
	//   16   34:getfield        #32  <Field boolean zzog>
	//   17   37:istore          8
		char c1 = '\u04D5';
	//   18   39:sipush          1237
	//   19   42:istore_2        
		char c;
		if(flag)
	//*  20   43:iload           8
	//*  21   45:ifeq            55
			c = '\u04CF';
	//   22   48:sipush          1231
	//   23   51:istore_1        
		else
	//*  24   52:goto            59
			c = '\u04D5';
	//   25   55:sipush          1237
	//   26   58:istore_1        
		if(zzoh)
	//*  27   59:aload_0         
	//*  28   60:getfield        #34  <Field boolean zzoh>
	//*  29   63:ifeq            70
			c1 = '\u04CF';
	//   30   66:sipush          1231
	//   31   69:istore_2        
		int i;
		if(zzcev != null && !zzcev.isEmpty())
	//*  32   70:aload_0         
	//*  33   71:getfield        #38  <Field zzye zzcev>
	//*  34   74:ifnull          101
	//*  35   77:aload_0         
	//*  36   78:getfield        #38  <Field zzye zzcev>
	//*  37   81:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//*  38   84:ifeq            90
	//*  39   87:goto            101
			i = zzcev.hashCode();
	//   40   90:aload_0         
	//   41   91:getfield        #38  <Field zzye zzcev>
	//   42   94:invokevirtual   #87  <Method int zzye.hashCode()>
	//   43   97:istore_3        
		else
	//*  44   98:goto            103
			i = 0;
	//   45  101:iconst_0        
	//   46  102:istore_3        
		return ((((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + c) * 31 + c1) * 31 + i;
	//   47  103:iload           4
	//   48  105:sipush          527
	//   49  108:iadd            
	//   50  109:bipush          31
	//   51  111:imul            
	//   52  112:iload           5
	//   53  114:iadd            
	//   54  115:bipush          31
	//   55  117:imul            
	//   56  118:iload           6
	//   57  120:iadd            
	//   58  121:bipush          31
	//   59  123:imul            
	//   60  124:iload           7
	//   61  126:iadd            
	//   62  127:bipush          31
	//   63  129:imul            
	//   64  130:iload_1         
	//   65  131:iadd            
	//   66  132:bipush          31
	//   67  134:imul            
	//   68  135:iload_2         
	//   69  136:iadd            
	//   70  137:bipush          31
	//   71  139:imul            
	//   72  140:iload_3         
	//   73  141:iadd            
	//   74  142:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #94  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            321
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          310
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          299
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          201
					{
						if(i != 26)
	//*  14   27:iload_2         
	//*  15   28:bipush          26
	//*  16   30:icmpeq          78
						{
							if(i != 32)
	//*  17   33:iload_2         
	//*  18   34:bipush          32
	//*  19   36:icmpeq          67
							{
								if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzxz1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #97  <Method boolean zzyc.zza(zzxz, int)>
	//*  27   51:ifne            0
										return ((zzyi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									zzog = zzxz1.zzup();
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #100 <Method boolean zzxz.zzup()>
	//   33   61:putfield        #32  <Field boolean zzog>
								}
							} else
	//*  34   64:goto            0
							{
								name = zzxz1.zzvb();
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #103 <Method int zzxz.zzvb()>
	//   38   72:putfield        #30  <Field int name>
							}
						} else
	//*  39   75:goto            0
						{
							int j1 = zzxz1.zzas(zzxz1.zzvb());
	//   40   78:aload_1         
	//   41   79:aload_1         
	//   42   80:invokevirtual   #103 <Method int zzxz.zzvb()>
	//   43   83:invokevirtual   #107 <Method int zzxz.zzas(int)>
	//   44   86:istore          4
							int j = zzxz1.getPosition();
	//   45   88:aload_1         
	//   46   89:invokevirtual   #110 <Method int zzxz.getPosition()>
	//   47   92:istore_2        
							int l;
							for(l = 0; zzxz1.zzyy() > 0; l++)
	//*  48   93:iconst_0        
	//*  49   94:istore_3        
	//*  50   95:aload_1         
	//*  51   96:invokevirtual   #113 <Method int zzxz.zzyy()>
	//*  52   99:ifle            114
								zzxz1.zzvb();
	//   53  102:aload_1         
	//   54  103:invokevirtual   #103 <Method int zzxz.zzvb()>
	//   55  106:pop             

	//   56  107:iload_3         
	//   57  108:iconst_1        
	//   58  109:iadd            
	//   59  110:istore_3        
	//*  60  111:goto            95
							zzxz1.zzcb(j);
	//   61  114:aload_1         
	//   62  115:iload_2         
	//   63  116:invokevirtual   #117 <Method void zzxz.zzcb(int)>
							if(zzoe == null)
	//*  64  119:aload_0         
	//*  65  120:getfield        #26  <Field int[] zzoe>
	//*  66  123:ifnonnull       131
								j = 0;
	//   67  126:iconst_0        
	//   68  127:istore_2        
							else
	//*  69  128:goto            137
								j = zzoe.length;
	//   70  131:aload_0         
	//   71  132:getfield        #26  <Field int[] zzoe>
	//   72  135:arraylength     
	//   73  136:istore_2        
							int ai[] = new int[l + j];
	//   74  137:iload_3         
	//   75  138:iload_2         
	//   76  139:iadd            
	//   77  140:newarray        int[]
	//   78  142:astore          5
							l = j;
	//   79  144:iload_2         
	//   80  145:istore_3        
							if(j != 0)
	//*  81  146:iload_2         
	//*  82  147:ifeq            164
							{
								System.arraycopy(((Object) (zzoe)), 0, ((Object) (ai)), 0, j);
	//   83  150:aload_0         
	//   84  151:getfield        #26  <Field int[] zzoe>
	//   85  154:iconst_0        
	//   86  155:aload           5
	//   87  157:iconst_0        
	//   88  158:iload_2         
	//   89  159:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
								l = j;
	//   90  162:iload_2         
	//   91  163:istore_3        
							}
							for(; l < ai.length; l++)
	//*  92  164:iload_3         
	//*  93  165:aload           5
	//*  94  167:arraylength     
	//*  95  168:icmpge          186
								ai[l] = zzxz1.zzvb();
	//   96  171:aload           5
	//   97  173:iload_3         
	//   98  174:aload_1         
	//   99  175:invokevirtual   #103 <Method int zzxz.zzvb()>
	//  100  178:iastore         

	//  101  179:iload_3         
	//  102  180:iconst_1        
	//  103  181:iadd            
	//  104  182:istore_3        
	//* 105  183:goto            164
							zzoe = ai;
	//  106  186:aload_0         
	//  107  187:aload           5
	//  108  189:putfield        #26  <Field int[] zzoe>
							zzxz1.zzat(j1);
	//  109  192:aload_1         
	//  110  193:iload           4
	//  111  195:invokevirtual   #126 <Method void zzxz.zzat(int)>
						}
					} else
	//* 112  198:goto            0
					{
						int i1 = zzyl.zzb(zzxz1, 24);
	//  113  201:aload_1         
	//  114  202:bipush          24
	//  115  204:invokestatic    #130 <Method int zzyl.zzb(zzxz, int)>
	//  116  207:istore_3        
						int k;
						if(zzoe == null)
	//* 117  208:aload_0         
	//* 118  209:getfield        #26  <Field int[] zzoe>
	//* 119  212:ifnonnull       220
							k = 0;
	//  120  215:iconst_0        
	//  121  216:istore_2        
						else
	//* 122  217:goto            226
							k = zzoe.length;
	//  123  220:aload_0         
	//  124  221:getfield        #26  <Field int[] zzoe>
	//  125  224:arraylength     
	//  126  225:istore_2        
						int ai1[] = new int[i1 + k];
	//  127  226:iload_3         
	//  128  227:iload_2         
	//  129  228:iadd            
	//  130  229:newarray        int[]
	//  131  231:astore          5
						i1 = k;
	//  132  233:iload_2         
	//  133  234:istore_3        
						if(k != 0)
	//* 134  235:iload_2         
	//* 135  236:ifeq            253
						{
							System.arraycopy(((Object) (zzoe)), 0, ((Object) (ai1)), 0, k);
	//  136  239:aload_0         
	//  137  240:getfield        #26  <Field int[] zzoe>
	//  138  243:iconst_0        
	//  139  244:aload           5
	//  140  246:iconst_0        
	//  141  247:iload_2         
	//  142  248:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
							i1 = k;
	//  143  251:iload_2         
	//  144  252:istore_3        
						}
						for(; i1 < ai1.length - 1; i1++)
	//* 145  253:iload_3         
	//* 146  254:aload           5
	//* 147  256:arraylength     
	//* 148  257:iconst_1        
	//* 149  258:isub            
	//* 150  259:icmpge          282
						{
							ai1[i1] = zzxz1.zzvb();
	//  151  262:aload           5
	//  152  264:iload_3         
	//  153  265:aload_1         
	//  154  266:invokevirtual   #103 <Method int zzxz.zzvb()>
	//  155  269:iastore         
							zzxz1.zzuj();
	//  156  270:aload_1         
	//  157  271:invokevirtual   #94  <Method int zzxz.zzuj()>
	//  158  274:pop             
						}

	//  159  275:iload_3         
	//  160  276:iconst_1        
	//  161  277:iadd            
	//  162  278:istore_3        
	//* 163  279:goto            253
						ai1[i1] = zzxz1.zzvb();
	//  164  282:aload           5
	//  165  284:iload_3         
	//  166  285:aload_1         
	//  167  286:invokevirtual   #103 <Method int zzxz.zzvb()>
	//  168  289:iastore         
						zzoe = ai1;
	//  169  290:aload_0         
	//  170  291:aload           5
	//  171  293:putfield        #26  <Field int[] zzoe>
					}
				} else
	//* 172  296:goto            0
				{
					zzof = zzxz1.zzvb();
	//  173  299:aload_0         
	//  174  300:aload_1         
	//  175  301:invokevirtual   #103 <Method int zzxz.zzvb()>
	//  176  304:putfield        #28  <Field int zzof>
				}
			} else
	//* 177  307:goto            0
			{
				zzoh = zzxz1.zzup();
	//  178  310:aload_0         
	//  179  311:aload_1         
	//  180  312:invokevirtual   #100 <Method boolean zzxz.zzup()>
	//  181  315:putfield        #34  <Field boolean zzoh>
			}
		} while(true);
	//  182  318:goto            0
		return ((zzyi) (this));
	//  183  321:aload_0         
	//  184  322:areturn         
	}

	public final void zza(zzya zzya1)
	{
		if(zzoh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzoh>
	//*   2    4:ifeq            16
			zzya1.zzb(1, zzoh);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field boolean zzoh>
	//    7   13:invokevirtual   #136 <Method void zzya.zzb(int, boolean)>
		zzya1.zzd(2, zzof);
	//    8   16:aload_1         
	//    9   17:iconst_2        
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field int zzof>
	//   12   22:invokevirtual   #140 <Method void zzya.zzd(int, int)>
		if(zzoe != null && zzoe.length > 0)
	//*  13   25:aload_0         
	//*  14   26:getfield        #26  <Field int[] zzoe>
	//*  15   29:ifnull          69
	//*  16   32:aload_0         
	//*  17   33:getfield        #26  <Field int[] zzoe>
	//*  18   36:arraylength     
	//*  19   37:ifle            69
		{
			for(int i = 0; i < zzoe.length; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #26  <Field int[] zzoe>
	//*  25   47:arraylength     
	//*  26   48:icmpge          69
				zzya1.zzd(3, zzoe[i]);
	//   27   51:aload_1         
	//   28   52:iconst_3        
	//   29   53:aload_0         
	//   30   54:getfield        #26  <Field int[] zzoe>
	//   31   57:iload_2         
	//   32   58:iaload          
	//   33   59:invokevirtual   #140 <Method void zzya.zzd(int, int)>

	//   34   62:iload_2         
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:istore_2        
		}
	//*  38   66:goto            42
		if(name != 0)
	//*  39   69:aload_0         
	//*  40   70:getfield        #30  <Field int name>
	//*  41   73:ifeq            85
			zzya1.zzd(4, name);
	//   42   76:aload_1         
	//   43   77:iconst_4        
	//   44   78:aload_0         
	//   45   79:getfield        #30  <Field int name>
	//   46   82:invokevirtual   #140 <Method void zzya.zzd(int, int)>
		if(zzog)
	//*  47   85:aload_0         
	//*  48   86:getfield        #32  <Field boolean zzog>
	//*  49   89:ifeq            102
			zzya1.zzb(6, zzog);
	//   50   92:aload_1         
	//   51   93:bipush          6
	//   52   95:aload_0         
	//   53   96:getfield        #32  <Field boolean zzog>
	//   54   99:invokevirtual   #136 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//   55  102:aload_0         
	//   56  103:aload_1         
	//   57  104:invokespecial   #142 <Method void zzyc.zza(zzya)>
	//   58  107:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzoh)
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field boolean zzoh>
	//*   7   11:ifeq            23
			i = j + (zzya.zzbd(1) + 1);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:invokestatic    #148 <Method int zzya.zzbd(int)>
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:iadd            
	//   14   22:istore_1        
		int k = i + zzya.zzh(2, zzof);
	//   15   23:iload_1         
	//   16   24:iconst_2        
	//   17   25:aload_0         
	//   18   26:getfield        #28  <Field int zzof>
	//   19   29:invokestatic    #152 <Method int zzya.zzh(int, int)>
	//   20   32:iadd            
	//   21   33:istore_3        
		i = k;
	//   22   34:iload_3         
	//   23   35:istore_1        
		if(zzoe != null)
	//*  24   36:aload_0         
	//*  25   37:getfield        #26  <Field int[] zzoe>
	//*  26   40:ifnull          97
		{
			i = k;
	//   27   43:iload_3         
	//   28   44:istore_1        
			if(zzoe.length > 0)
	//*  29   45:aload_0         
	//*  30   46:getfield        #26  <Field int[] zzoe>
	//*  31   49:arraylength     
	//*  32   50:ifle            97
			{
				i = 0;
	//   33   53:iconst_0        
	//   34   54:istore_1        
				j = 0;
	//   35   55:iconst_0        
	//   36   56:istore_2        
				for(; i < zzoe.length; i++)
	//*  37   57:iload_1         
	//*  38   58:aload_0         
	//*  39   59:getfield        #26  <Field int[] zzoe>
	//*  40   62:arraylength     
	//*  41   63:icmpge          85
					j += zzya.zzbe(zzoe[i]);
	//   42   66:iload_2         
	//   43   67:aload_0         
	//   44   68:getfield        #26  <Field int[] zzoe>
	//   45   71:iload_1         
	//   46   72:iaload          
	//   47   73:invokestatic    #155 <Method int zzya.zzbe(int)>
	//   48   76:iadd            
	//   49   77:istore_2        

	//   50   78:iload_1         
	//   51   79:iconst_1        
	//   52   80:iadd            
	//   53   81:istore_1        
	//*  54   82:goto            57
				i = k + j + zzoe.length * 1;
	//   55   85:iload_3         
	//   56   86:iload_2         
	//   57   87:iadd            
	//   58   88:aload_0         
	//   59   89:getfield        #26  <Field int[] zzoe>
	//   60   92:arraylength     
	//   61   93:iconst_1        
	//   62   94:imul            
	//   63   95:iadd            
	//   64   96:istore_1        
			}
		}
		j = i;
	//   65   97:iload_1         
	//   66   98:istore_2        
		if(name != 0)
	//*  67   99:aload_0         
	//*  68  100:getfield        #30  <Field int name>
	//*  69  103:ifeq            117
			j = i + zzya.zzh(4, name);
	//   70  106:iload_1         
	//   71  107:iconst_4        
	//   72  108:aload_0         
	//   73  109:getfield        #30  <Field int name>
	//   74  112:invokestatic    #152 <Method int zzya.zzh(int, int)>
	//   75  115:iadd            
	//   76  116:istore_2        
		i = j;
	//   77  117:iload_2         
	//   78  118:istore_1        
		if(zzog)
	//*  79  119:aload_0         
	//*  80  120:getfield        #32  <Field boolean zzog>
	//*  81  123:ifeq            136
			i = j + (zzya.zzbd(6) + 1);
	//   82  126:iload_2         
	//   83  127:bipush          6
	//   84  129:invokestatic    #148 <Method int zzya.zzbd(int)>
	//   85  132:iconst_1        
	//   86  133:iadd            
	//   87  134:iadd            
	//   88  135:istore_1        
		return i;
	//   89  136:iload_1         
	//   90  137:ireturn         
	}

	private static volatile zzh zzod[];
	private int name;
	public int zzoe[];
	private int zzof;
	private boolean zzog;
	private boolean zzoh;
}
