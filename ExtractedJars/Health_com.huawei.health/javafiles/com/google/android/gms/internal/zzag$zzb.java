// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxw, zzbxm, 
//			zzbxl, zzbxt

public static final class zzag$zzb extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzco != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Long zzco>
	//*   2    4:ifnull          19
			zzbxm1.zzb(1, zzco.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Long zzco>
	//    7   13:invokevirtual   #51  <Method long Long.longValue()>
	//    8   16:invokevirtual   #56  <Method void zzbxm.zzb(int, long)>
		if(zzcp != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #25  <Field Integer zzcp>
	//*  11   23:ifnull          38
			zzbxm1.zzJ(2, zzcp.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field Integer zzcp>
	//   16   32:invokevirtual   #62  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #66  <Method void zzbxm.zzJ(int, int)>
		if(zzcq != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #27  <Field Boolean zzcq>
	//*  20   42:ifnull          57
			zzbxm1.zzg(3, zzcq.booleanValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #27  <Field Boolean zzcq>
	//   25   51:invokevirtual   #72  <Method boolean Boolean.booleanValue()>
	//   26   54:invokevirtual   #76  <Method void zzbxm.zzg(int, boolean)>
		if(zzcr != null && zzcr.length > 0)
	//*  27   57:aload_0         
	//*  28   58:getfield        #34  <Field int[] zzcr>
	//*  29   61:ifnull          101
	//*  30   64:aload_0         
	//*  31   65:getfield        #34  <Field int[] zzcr>
	//*  32   68:arraylength     
	//*  33   69:ifle            101
		{
			for(int i = 0; i < zzcr.length; i++)
	//*  34   72:iconst_0        
	//*  35   73:istore_2        
	//*  36   74:iload_2         
	//*  37   75:aload_0         
	//*  38   76:getfield        #34  <Field int[] zzcr>
	//*  39   79:arraylength     
	//*  40   80:icmpge          101
				zzbxm1.zzJ(4, zzcr[i]);
	//   41   83:aload_1         
	//   42   84:iconst_4        
	//   43   85:aload_0         
	//   44   86:getfield        #34  <Field int[] zzcr>
	//   45   89:iload_2         
	//   46   90:iaload          
	//   47   91:invokevirtual   #66  <Method void zzbxm.zzJ(int, int)>

	//   48   94:iload_2         
	//   49   95:iconst_1        
	//   50   96:iadd            
	//   51   97:istore_2        
		}
	//*  52   98:goto            74
		if(zzcs != null)
	//*  53  101:aload_0         
	//*  54  102:getfield        #36  <Field Long zzcs>
	//*  55  105:ifnull          120
			zzbxm1.zza(5, zzcs.longValue());
	//   56  108:aload_1         
	//   57  109:iconst_5        
	//   58  110:aload_0         
	//   59  111:getfield        #36  <Field Long zzcs>
	//   60  114:invokevirtual   #51  <Method long Long.longValue()>
	//   61  117:invokevirtual   #78  <Method void zzbxm.zza(int, long)>
		super.zza(zzbxm1);
	//   62  120:aload_0         
	//   63  121:aload_1         
	//   64  122:invokespecial   #80  <Method void zzbxn.zza(zzbxm)>
	//   65  125:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzi(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method zzag$zzb zzi(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zzb zzi(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    7: default 72
	//	               0: 75
	//	               8: 88
	//	               16: 102
	//	               24: 116
	//	               32: 130
	//	               34: 228
	//	               40: 351
	//*   5   72:goto            77
			case 0: // '\0'
				return this;
	//    6   75:aload_0         
	//    7   76:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   77:aload_0         
	//*   9   78:aload_1         
	//*  10   79:iload_2         
	//*  11   80:invokespecial   #94  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   83:ifne            362
					return this;
	//   13   86:aload_0         
	//   14   87:areturn         
				break;

			case 8: // '\b'
				zzco = Long.valueOf(zzbxl1.zzaer());
	//   15   88:aload_0         
	//   16   89:aload_1         
	//   17   90:invokevirtual   #97  <Method long zzbxl.zzaer()>
	//   18   93:invokestatic    #101 <Method Long Long.valueOf(long)>
	//   19   96:putfield        #23  <Field Long zzco>
				break;

	//*  20   99:goto            362
			case 16: // '\020'
				zzcp = Integer.valueOf(zzbxl1.zzaes());
	//   21  102:aload_0         
	//   22  103:aload_1         
	//   23  104:invokevirtual   #104 <Method int zzbxl.zzaes()>
	//   24  107:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   25  110:putfield        #25  <Field Integer zzcp>
				break;

	//*  26  113:goto            362
			case 24: // '\030'
				zzcq = Boolean.valueOf(zzbxl1.zzaeu());
	//   27  116:aload_0         
	//   28  117:aload_1         
	//   29  118:invokevirtual   #110 <Method boolean zzbxl.zzaeu()>
	//   30  121:invokestatic    #113 <Method Boolean Boolean.valueOf(boolean)>
	//   31  124:putfield        #27  <Field Boolean zzcq>
				break;

	//*  32  127:goto            362
			case 32: // ' '
				int l = zzbxw.zzb(zzbxl1, 32);
	//   33  130:aload_1         
	//   34  131:bipush          32
	//   35  133:invokestatic    #116 <Method int zzbxw.zzb(zzbxl, int)>
	//   36  136:istore_3        
				int j;
				if(zzcr == null)
	//*  37  137:aload_0         
	//*  38  138:getfield        #34  <Field int[] zzcr>
	//*  39  141:ifnonnull       149
					j = 0;
	//   40  144:iconst_0        
	//   41  145:istore_2        
				else
	//*  42  146:goto            155
					j = zzcr.length;
	//   43  149:aload_0         
	//   44  150:getfield        #34  <Field int[] zzcr>
	//   45  153:arraylength     
	//   46  154:istore_2        
				int ai[] = new int[j + l];
	//   47  155:iload_2         
	//   48  156:iload_3         
	//   49  157:iadd            
	//   50  158:newarray        int[]
	//   51  160:astore          5
				l = j;
	//   52  162:iload_2         
	//   53  163:istore_3        
				if(j != 0)
	//*  54  164:iload_2         
	//*  55  165:ifeq            182
				{
					System.arraycopy(((Object) (zzcr)), 0, ((Object) (ai)), 0, j);
	//   56  168:aload_0         
	//   57  169:getfield        #34  <Field int[] zzcr>
	//   58  172:iconst_0        
	//   59  173:aload           5
	//   60  175:iconst_0        
	//   61  176:iload_2         
	//   62  177:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
					l = j;
	//   63  180:iload_2         
	//   64  181:istore_3        
				}
				for(; l < ai.length - 1; l++)
	//*  65  182:iload_3         
	//*  66  183:aload           5
	//*  67  185:arraylength     
	//*  68  186:iconst_1        
	//*  69  187:isub            
	//*  70  188:icmpge          211
				{
					ai[l] = zzbxl1.zzaes();
	//   71  191:aload           5
	//   72  193:iload_3         
	//   73  194:aload_1         
	//   74  195:invokevirtual   #104 <Method int zzbxl.zzaes()>
	//   75  198:iastore         
					zzbxl1.zzaeo();
	//   76  199:aload_1         
	//   77  200:invokevirtual   #91  <Method int zzbxl.zzaeo()>
	//   78  203:pop             
				}

	//   79  204:iload_3         
	//   80  205:iconst_1        
	//   81  206:iadd            
	//   82  207:istore_3        
	//*  83  208:goto            182
				ai[l] = zzbxl1.zzaes();
	//   84  211:aload           5
	//   85  213:iload_3         
	//   86  214:aload_1         
	//   87  215:invokevirtual   #104 <Method int zzbxl.zzaes()>
	//   88  218:iastore         
				zzcr = ai;
	//   89  219:aload_0         
	//   90  220:aload           5
	//   91  222:putfield        #34  <Field int[] zzcr>
				break;

	//*  92  225:goto            362
			case 34: // '"'
				int j1 = zzbxl1.zzra(zzbxl1.zzaex());
	//   93  228:aload_1         
	//   94  229:aload_1         
	//   95  230:invokevirtual   #125 <Method int zzbxl.zzaex()>
	//   96  233:invokevirtual   #129 <Method int zzbxl.zzra(int)>
	//   97  236:istore          4
				int i1 = 0;
	//   98  238:iconst_0        
	//   99  239:istore_3        
				int k = zzbxl1.getPosition();
	//  100  240:aload_1         
	//  101  241:invokevirtual   #132 <Method int zzbxl.getPosition()>
	//  102  244:istore_2        
				while(zzbxl1.zzaeC() > 0) 
	//* 103  245:aload_1         
	//* 104  246:invokevirtual   #135 <Method int zzbxl.zzaeC()>
	//* 105  249:ifle            264
				{
					zzbxl1.zzaes();
	//  106  252:aload_1         
	//  107  253:invokevirtual   #104 <Method int zzbxl.zzaes()>
	//  108  256:pop             
					i1++;
	//  109  257:iload_3         
	//  110  258:iconst_1        
	//  111  259:iadd            
	//  112  260:istore_3        
				}
	//* 113  261:goto            245
				zzbxl1.zzrc(k);
	//  114  264:aload_1         
	//  115  265:iload_2         
	//  116  266:invokevirtual   #139 <Method void zzbxl.zzrc(int)>
				if(zzcr == null)
	//* 117  269:aload_0         
	//* 118  270:getfield        #34  <Field int[] zzcr>
	//* 119  273:ifnonnull       281
					k = 0;
	//  120  276:iconst_0        
	//  121  277:istore_2        
				else
	//* 122  278:goto            287
					k = zzcr.length;
	//  123  281:aload_0         
	//  124  282:getfield        #34  <Field int[] zzcr>
	//  125  285:arraylength     
	//  126  286:istore_2        
				int ai1[] = new int[k + i1];
	//  127  287:iload_2         
	//  128  288:iload_3         
	//  129  289:iadd            
	//  130  290:newarray        int[]
	//  131  292:astore          5
				i1 = k;
	//  132  294:iload_2         
	//  133  295:istore_3        
				if(k != 0)
	//* 134  296:iload_2         
	//* 135  297:ifeq            314
				{
					System.arraycopy(((Object) (zzcr)), 0, ((Object) (ai1)), 0, k);
	//  136  300:aload_0         
	//  137  301:getfield        #34  <Field int[] zzcr>
	//  138  304:iconst_0        
	//  139  305:aload           5
	//  140  307:iconst_0        
	//  141  308:iload_2         
	//  142  309:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
					i1 = k;
	//  143  312:iload_2         
	//  144  313:istore_3        
				}
				for(; i1 < ai1.length; i1++)
	//* 145  314:iload_3         
	//* 146  315:aload           5
	//* 147  317:arraylength     
	//* 148  318:icmpge          336
					ai1[i1] = zzbxl1.zzaes();
	//  149  321:aload           5
	//  150  323:iload_3         
	//  151  324:aload_1         
	//  152  325:invokevirtual   #104 <Method int zzbxl.zzaes()>
	//  153  328:iastore         

	//  154  329:iload_3         
	//  155  330:iconst_1        
	//  156  331:iadd            
	//  157  332:istore_3        
	//* 158  333:goto            314
				zzcr = ai1;
	//  159  336:aload_0         
	//  160  337:aload           5
	//  161  339:putfield        #34  <Field int[] zzcr>
				zzbxl1.zzrb(j1);
	//  162  342:aload_1         
	//  163  343:iload           4
	//  164  345:invokevirtual   #142 <Method void zzbxl.zzrb(int)>
				break;

	//* 165  348:goto            362
			case 40: // '('
				zzcs = Long.valueOf(zzbxl1.zzaeq());
	//  166  351:aload_0         
	//  167  352:aload_1         
	//  168  353:invokevirtual   #145 <Method long zzbxl.zzaeq()>
	//  169  356:invokestatic    #101 <Method Long Long.valueOf(long)>
	//  170  359:putfield        #36  <Field Long zzcs>
				break;
			}
		} while(true);
	//  171  362:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzco != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field Long zzco>
	//*   7   11:ifnull          28
			i = j + zzbxm.zzf(1, zzco.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #23  <Field Long zzco>
	//   12   20:invokevirtual   #51  <Method long Long.longValue()>
	//   13   23:invokestatic    #152 <Method int zzbxm.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzcp != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #25  <Field Integer zzcp>
	//*  20   34:ifnull          51
			j = i + zzbxm.zzL(2, zzcp.intValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #25  <Field Integer zzcp>
	//   25   43:invokevirtual   #62  <Method int Integer.intValue()>
	//   26   46:invokestatic    #156 <Method int zzbxm.zzL(int, int)>
	//   27   49:iadd            
	//   28   50:istore_2        
		i = j;
	//   29   51:iload_2         
	//   30   52:istore_1        
		if(zzcq != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #27  <Field Boolean zzcq>
	//*  33   57:ifnull          74
			i = j + zzbxm.zzh(3, zzcq.booleanValue());
	//   34   60:iload_2         
	//   35   61:iconst_3        
	//   36   62:aload_0         
	//   37   63:getfield        #27  <Field Boolean zzcq>
	//   38   66:invokevirtual   #72  <Method boolean Boolean.booleanValue()>
	//   39   69:invokestatic    #160 <Method int zzbxm.zzh(int, boolean)>
	//   40   72:iadd            
	//   41   73:istore_1        
		j = i;
	//   42   74:iload_1         
	//   43   75:istore_2        
		if(zzcr != null)
	//*  44   76:aload_0         
	//*  45   77:getfield        #34  <Field int[] zzcr>
	//*  46   80:ifnull          137
		{
			j = i;
	//   47   83:iload_1         
	//   48   84:istore_2        
			if(zzcr.length > 0)
	//*  49   85:aload_0         
	//*  50   86:getfield        #34  <Field int[] zzcr>
	//*  51   89:arraylength     
	//*  52   90:ifle            137
			{
				int k = 0;
	//   53   93:iconst_0        
	//   54   94:istore_3        
				for(j = 0; j < zzcr.length; j++)
	//*  55   95:iconst_0        
	//*  56   96:istore_2        
	//*  57   97:iload_2         
	//*  58   98:aload_0         
	//*  59   99:getfield        #34  <Field int[] zzcr>
	//*  60  102:arraylength     
	//*  61  103:icmpge          125
					k += zzbxm.zzrg(zzcr[j]);
	//   62  106:iload_3         
	//   63  107:aload_0         
	//   64  108:getfield        #34  <Field int[] zzcr>
	//   65  111:iload_2         
	//   66  112:iaload          
	//   67  113:invokestatic    #163 <Method int zzbxm.zzrg(int)>
	//   68  116:iadd            
	//   69  117:istore_3        

	//   70  118:iload_2         
	//   71  119:iconst_1        
	//   72  120:iadd            
	//   73  121:istore_2        
	//*  74  122:goto            97
				j = i + k + zzcr.length * 1;
	//   75  125:iload_1         
	//   76  126:iload_3         
	//   77  127:iadd            
	//   78  128:aload_0         
	//   79  129:getfield        #34  <Field int[] zzcr>
	//   80  132:arraylength     
	//   81  133:iconst_1        
	//   82  134:imul            
	//   83  135:iadd            
	//   84  136:istore_2        
			}
		}
		i = j;
	//   85  137:iload_2         
	//   86  138:istore_1        
		if(zzcs != null)
	//*  87  139:aload_0         
	//*  88  140:getfield        #36  <Field Long zzcs>
	//*  89  143:ifnull          160
			i = j + zzbxm.zze(5, zzcs.longValue());
	//   90  146:iload_2         
	//   91  147:iconst_5        
	//   92  148:aload_0         
	//   93  149:getfield        #36  <Field Long zzcs>
	//   94  152:invokevirtual   #51  <Method long Long.longValue()>
	//   95  155:invokestatic    #166 <Method int zzbxm.zze(int, long)>
	//   96  158:iadd            
	//   97  159:istore_1        
		return i;
	//   98  160:iload_1         
	//   99  161:ireturn         
	}

	public Long zzco;
	public Integer zzcp;
	public Boolean zzcq;
	public int zzcr[];
	public Long zzcs;

	public zzag$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzbxn()>
		zzco = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field Long zzco>
		zzcp = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field Integer zzcp>
		zzcq = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field Boolean zzcq>
		zzcr = zzbxw.zzcuW;
	//   11   19:aload_0         
	//   12   20:getstatic       #32  <Field int[] zzbxw.zzcuW>
	//   13   23:putfield        #34  <Field int[] zzcr>
		zzcs = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #36  <Field Long zzcs>
		zzcuR = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #40  <Field int zzcuR>
	//   20   36:return          
	}
}
