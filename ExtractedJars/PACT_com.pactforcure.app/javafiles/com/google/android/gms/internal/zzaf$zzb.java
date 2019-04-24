// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbuw, zzbum, 
//			zzbul, zzbut

public static final class zzaf$zzb extends zzbun
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzcn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Long zzcn>
	//*   2    4:ifnull          19
			zzbum1.zzb(1, zzcn.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Long zzcn>
	//    7   13:invokevirtual   #51  <Method long Long.longValue()>
	//    8   16:invokevirtual   #56  <Method void zzbum.zzb(int, long)>
		if(zzco != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #25  <Field Integer zzco>
	//*  11   23:ifnull          38
			zzbum1.zzF(2, zzco.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field Integer zzco>
	//   16   32:invokevirtual   #62  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #66  <Method void zzbum.zzF(int, int)>
		if(zzcp != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #27  <Field Boolean zzcp>
	//*  20   42:ifnull          57
			zzbum1.zzg(3, zzcp.booleanValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #27  <Field Boolean zzcp>
	//   25   51:invokevirtual   #72  <Method boolean Boolean.booleanValue()>
	//   26   54:invokevirtual   #76  <Method void zzbum.zzg(int, boolean)>
		if(zzcq != null && zzcq.length > 0)
	//*  27   57:aload_0         
	//*  28   58:getfield        #34  <Field int[] zzcq>
	//*  29   61:ifnull          101
	//*  30   64:aload_0         
	//*  31   65:getfield        #34  <Field int[] zzcq>
	//*  32   68:arraylength     
	//*  33   69:ifle            101
		{
			for(int i = 0; i < zzcq.length; i++)
	//*  34   72:iconst_0        
	//*  35   73:istore_2        
	//*  36   74:iload_2         
	//*  37   75:aload_0         
	//*  38   76:getfield        #34  <Field int[] zzcq>
	//*  39   79:arraylength     
	//*  40   80:icmpge          101
				zzbum1.zzF(4, zzcq[i]);
	//   41   83:aload_1         
	//   42   84:iconst_4        
	//   43   85:aload_0         
	//   44   86:getfield        #34  <Field int[] zzcq>
	//   45   89:iload_2         
	//   46   90:iaload          
	//   47   91:invokevirtual   #66  <Method void zzbum.zzF(int, int)>

	//   48   94:iload_2         
	//   49   95:iconst_1        
	//   50   96:iadd            
	//   51   97:istore_2        
		}
	//*  52   98:goto            74
		if(zzcr != null)
	//*  53  101:aload_0         
	//*  54  102:getfield        #36  <Field Long zzcr>
	//*  55  105:ifnull          120
			zzbum1.zza(5, zzcr.longValue());
	//   56  108:aload_1         
	//   57  109:iconst_5        
	//   58  110:aload_0         
	//   59  111:getfield        #36  <Field Long zzcr>
	//   60  114:invokevirtual   #51  <Method long Long.longValue()>
	//   61  117:invokevirtual   #78  <Method void zzbum.zza(int, long)>
		super.zza(zzbum1);
	//   62  120:aload_0         
	//   63  121:aload_1         
	//   64  122:invokespecial   #80  <Method void zzbun.zza(zzbum)>
	//   65  125:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzi(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method zzaf$zzb zzi(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zzb zzi(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    7: default 72
	//	               0: 81
	//	               8: 83
	//	               16: 97
	//	               24: 111
	//	               32: 125
	//	               34: 223
	//	               40: 346
			default:
				if(super.zza(zzbul1, i))
					continue;
	//    5   72:aload_0         
	//    6   73:aload_1         
	//    7   74:iload_2         
	//    8   75:invokespecial   #94  <Method boolean zzbun.zza(zzbul, int)>
	//    9   78:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//   10   81:aload_0         
	//   11   82:areturn         

			case 8: // '\b'
				zzcn = Long.valueOf(zzbul1.zzacx());
	//   12   83:aload_0         
	//   13   84:aload_1         
	//   14   85:invokevirtual   #97  <Method long zzbul.zzacx()>
	//   15   88:invokestatic    #101 <Method Long Long.valueOf(long)>
	//   16   91:putfield        #23  <Field Long zzcn>
				break;

	//*  17   94:goto            0
			case 16: // '\020'
				zzco = Integer.valueOf(zzbul1.zzacy());
	//   18   97:aload_0         
	//   19   98:aload_1         
	//   20   99:invokevirtual   #104 <Method int zzbul.zzacy()>
	//   21  102:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   22  105:putfield        #25  <Field Integer zzco>
				break;

	//*  23  108:goto            0
			case 24: // '\030'
				zzcp = Boolean.valueOf(zzbul1.zzacA());
	//   24  111:aload_0         
	//   25  112:aload_1         
	//   26  113:invokevirtual   #110 <Method boolean zzbul.zzacA()>
	//   27  116:invokestatic    #113 <Method Boolean Boolean.valueOf(boolean)>
	//   28  119:putfield        #27  <Field Boolean zzcp>
				break;

	//*  29  122:goto            0
			case 32: // ' '
				int l = zzbuw.zzc(zzbul1, 32);
	//   30  125:aload_1         
	//   31  126:bipush          32
	//   32  128:invokestatic    #117 <Method int zzbuw.zzc(zzbul, int)>
	//   33  131:istore_3        
				int j;
				int ai[];
				if(zzcq == null)
	//*  34  132:aload_0         
	//*  35  133:getfield        #34  <Field int[] zzcq>
	//*  36  136:ifnonnull       197
					j = 0;
	//   37  139:iconst_0        
	//   38  140:istore_2        
				else
	//*  39  141:iload_3         
	//*  40  142:iload_2         
	//*  41  143:iadd            
	//*  42  144:newarray        int[]
	//*  43  146:astore          5
	//*  44  148:iload_2         
	//*  45  149:istore_3        
	//*  46  150:iload_2         
	//*  47  151:ifeq            168
	//*  48  154:aload_0         
	//*  49  155:getfield        #34  <Field int[] zzcq>
	//*  50  158:iconst_0        
	//*  51  159:aload           5
	//*  52  161:iconst_0        
	//*  53  162:iload_2         
	//*  54  163:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  55  166:iload_2         
	//*  56  167:istore_3        
	//*  57  168:iload_3         
	//*  58  169:aload           5
	//*  59  171:arraylength     
	//*  60  172:iconst_1        
	//*  61  173:isub            
	//*  62  174:icmpge          206
	//*  63  177:aload           5
	//*  64  179:iload_3         
	//*  65  180:aload_1         
	//*  66  181:invokevirtual   #104 <Method int zzbul.zzacy()>
	//*  67  184:iastore         
	//*  68  185:aload_1         
	//*  69  186:invokevirtual   #91  <Method int zzbul.zzacu()>
	//*  70  189:pop             
	//*  71  190:iload_3         
	//*  72  191:iconst_1        
	//*  73  192:iadd            
	//*  74  193:istore_3        
	//*  75  194:goto            168
					j = zzcq.length;
	//   76  197:aload_0         
	//   77  198:getfield        #34  <Field int[] zzcq>
	//   78  201:arraylength     
	//   79  202:istore_2        
				ai = new int[l + j];
				l = j;
				if(j != 0)
				{
					System.arraycopy(((Object) (zzcq)), 0, ((Object) (ai)), 0, j);
					l = j;
				}
				for(; l < ai.length - 1; l++)
				{
					ai[l] = zzbul1.zzacy();
					zzbul1.zzacu();
				}

	//*  80  203:goto            141
				ai[l] = zzbul1.zzacy();
	//   81  206:aload           5
	//   82  208:iload_3         
	//   83  209:aload_1         
	//   84  210:invokevirtual   #104 <Method int zzbul.zzacy()>
	//   85  213:iastore         
				zzcq = ai;
	//   86  214:aload_0         
	//   87  215:aload           5
	//   88  217:putfield        #34  <Field int[] zzcq>
				break;

	//*  89  220:goto            0
			case 34: // '"'
				int j1 = zzbul1.zzqj(zzbul1.zzacD());
	//   90  223:aload_1         
	//   91  224:aload_1         
	//   92  225:invokevirtual   #126 <Method int zzbul.zzacD()>
	//   93  228:invokevirtual   #130 <Method int zzbul.zzqj(int)>
	//   94  231:istore          4
				int k = zzbul1.getPosition();
	//   95  233:aload_1         
	//   96  234:invokevirtual   #133 <Method int zzbul.getPosition()>
	//   97  237:istore_2        
				int i1;
				for(i1 = 0; zzbul1.zzacI() > 0; i1++)
	//*  98  238:iconst_0        
	//*  99  239:istore_3        
	//* 100  240:aload_1         
	//* 101  241:invokevirtual   #136 <Method int zzbul.zzacI()>
	//* 102  244:ifle            259
					zzbul1.zzacy();
	//  103  247:aload_1         
	//  104  248:invokevirtual   #104 <Method int zzbul.zzacy()>
	//  105  251:pop             

	//  106  252:iload_3         
	//  107  253:iconst_1        
	//  108  254:iadd            
	//  109  255:istore_3        
	//* 110  256:goto            240
				zzbul1.zzql(k);
	//  111  259:aload_1         
	//  112  260:iload_2         
	//  113  261:invokevirtual   #140 <Method void zzbul.zzql(int)>
				int ai1[];
				if(zzcq == null)
	//* 114  264:aload_0         
	//* 115  265:getfield        #34  <Field int[] zzcq>
	//* 116  268:ifnonnull       322
					k = 0;
	//  117  271:iconst_0        
	//  118  272:istore_2        
				else
	//* 119  273:iload_3         
	//* 120  274:iload_2         
	//* 121  275:iadd            
	//* 122  276:newarray        int[]
	//* 123  278:astore          5
	//* 124  280:iload_2         
	//* 125  281:istore_3        
	//* 126  282:iload_2         
	//* 127  283:ifeq            300
	//* 128  286:aload_0         
	//* 129  287:getfield        #34  <Field int[] zzcq>
	//* 130  290:iconst_0        
	//* 131  291:aload           5
	//* 132  293:iconst_0        
	//* 133  294:iload_2         
	//* 134  295:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 135  298:iload_2         
	//* 136  299:istore_3        
	//* 137  300:iload_3         
	//* 138  301:aload           5
	//* 139  303:arraylength     
	//* 140  304:icmpge          331
	//* 141  307:aload           5
	//* 142  309:iload_3         
	//* 143  310:aload_1         
	//* 144  311:invokevirtual   #104 <Method int zzbul.zzacy()>
	//* 145  314:iastore         
	//* 146  315:iload_3         
	//* 147  316:iconst_1        
	//* 148  317:iadd            
	//* 149  318:istore_3        
	//* 150  319:goto            300
					k = zzcq.length;
	//  151  322:aload_0         
	//  152  323:getfield        #34  <Field int[] zzcq>
	//  153  326:arraylength     
	//  154  327:istore_2        
				ai1 = new int[i1 + k];
				i1 = k;
				if(k != 0)
				{
					System.arraycopy(((Object) (zzcq)), 0, ((Object) (ai1)), 0, k);
					i1 = k;
				}
				for(; i1 < ai1.length; i1++)
					ai1[i1] = zzbul1.zzacy();

	//* 155  328:goto            273
				zzcq = ai1;
	//  156  331:aload_0         
	//  157  332:aload           5
	//  158  334:putfield        #34  <Field int[] zzcq>
				zzbul1.zzqk(j1);
	//  159  337:aload_1         
	//  160  338:iload           4
	//  161  340:invokevirtual   #143 <Method void zzbul.zzqk(int)>
				break;

	//* 162  343:goto            0
			case 40: // '('
				zzcr = Long.valueOf(zzbul1.zzacw());
	//  163  346:aload_0         
	//  164  347:aload_1         
	//  165  348:invokevirtual   #146 <Method long zzbul.zzacw()>
	//  166  351:invokestatic    #101 <Method Long Long.valueOf(long)>
	//  167  354:putfield        #36  <Field Long zzcr>
				break;
			}
		} while(true);
	//  168  357:goto            0
	}

	protected int zzv()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = super.zzv();
	//    2    3:aload_0         
	//    3    4:invokespecial   #149 <Method int zzbun.zzv()>
	//    4    7:istore_2        
		int i = j;
	//    5    8:iload_2         
	//    6    9:istore_1        
		if(zzcn != null)
	//*   7   10:aload_0         
	//*   8   11:getfield        #23  <Field Long zzcn>
	//*   9   14:ifnull          31
			i = j + zzbum.zzf(1, zzcn.longValue());
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:aload_0         
	//   13   20:getfield        #23  <Field Long zzcn>
	//   14   23:invokevirtual   #51  <Method long Long.longValue()>
	//   15   26:invokestatic    #153 <Method int zzbum.zzf(int, long)>
	//   16   29:iadd            
	//   17   30:istore_1        
		j = i;
	//   18   31:iload_1         
	//   19   32:istore_2        
		if(zzco != null)
	//*  20   33:aload_0         
	//*  21   34:getfield        #25  <Field Integer zzco>
	//*  22   37:ifnull          54
			j = i + zzbum.zzH(2, zzco.intValue());
	//   23   40:iload_1         
	//   24   41:iconst_2        
	//   25   42:aload_0         
	//   26   43:getfield        #25  <Field Integer zzco>
	//   27   46:invokevirtual   #62  <Method int Integer.intValue()>
	//   28   49:invokestatic    #157 <Method int zzbum.zzH(int, int)>
	//   29   52:iadd            
	//   30   53:istore_2        
		i = j;
	//   31   54:iload_2         
	//   32   55:istore_1        
		if(zzcp != null)
	//*  33   56:aload_0         
	//*  34   57:getfield        #27  <Field Boolean zzcp>
	//*  35   60:ifnull          77
			i = j + zzbum.zzh(3, zzcp.booleanValue());
	//   36   63:iload_2         
	//   37   64:iconst_3        
	//   38   65:aload_0         
	//   39   66:getfield        #27  <Field Boolean zzcp>
	//   40   69:invokevirtual   #72  <Method boolean Boolean.booleanValue()>
	//   41   72:invokestatic    #161 <Method int zzbum.zzh(int, boolean)>
	//   42   75:iadd            
	//   43   76:istore_1        
		j = i;
	//   44   77:iload_1         
	//   45   78:istore_2        
		if(zzcq != null)
	//*  46   79:aload_0         
	//*  47   80:getfield        #34  <Field int[] zzcq>
	//*  48   83:ifnull          141
		{
			j = i;
	//   49   86:iload_1         
	//   50   87:istore_2        
			if(zzcq.length > 0)
	//*  51   88:aload_0         
	//*  52   89:getfield        #34  <Field int[] zzcq>
	//*  53   92:arraylength     
	//*  54   93:ifle            141
			{
				int k = 0;
	//   55   96:iconst_0        
	//   56   97:istore_3        
				for(j = ((int) (flag)); j < zzcq.length; j++)
	//*  57   98:iload           4
	//*  58  100:istore_2        
	//*  59  101:iload_2         
	//*  60  102:aload_0         
	//*  61  103:getfield        #34  <Field int[] zzcq>
	//*  62  106:arraylength     
	//*  63  107:icmpge          129
					k += zzbum.zzqp(zzcq[j]);
	//   64  110:iload_3         
	//   65  111:aload_0         
	//   66  112:getfield        #34  <Field int[] zzcq>
	//   67  115:iload_2         
	//   68  116:iaload          
	//   69  117:invokestatic    #164 <Method int zzbum.zzqp(int)>
	//   70  120:iadd            
	//   71  121:istore_3        

	//   72  122:iload_2         
	//   73  123:iconst_1        
	//   74  124:iadd            
	//   75  125:istore_2        
	//*  76  126:goto            101
				j = i + k + zzcq.length * 1;
	//   77  129:iload_1         
	//   78  130:iload_3         
	//   79  131:iadd            
	//   80  132:aload_0         
	//   81  133:getfield        #34  <Field int[] zzcq>
	//   82  136:arraylength     
	//   83  137:iconst_1        
	//   84  138:imul            
	//   85  139:iadd            
	//   86  140:istore_2        
			}
		}
		i = j;
	//   87  141:iload_2         
	//   88  142:istore_1        
		if(zzcr != null)
	//*  89  143:aload_0         
	//*  90  144:getfield        #36  <Field Long zzcr>
	//*  91  147:ifnull          164
			i = j + zzbum.zze(5, zzcr.longValue());
	//   92  150:iload_2         
	//   93  151:iconst_5        
	//   94  152:aload_0         
	//   95  153:getfield        #36  <Field Long zzcr>
	//   96  156:invokevirtual   #51  <Method long Long.longValue()>
	//   97  159:invokestatic    #167 <Method int zzbum.zze(int, long)>
	//   98  162:iadd            
	//   99  163:istore_1        
		return i;
	//  100  164:iload_1         
	//  101  165:ireturn         
	}

	public Long zzcn;
	public Integer zzco;
	public Boolean zzcp;
	public int zzcq[];
	public Long zzcr;

	public zzaf$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzbun()>
		zzcn = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field Long zzcn>
		zzco = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field Integer zzco>
		zzcp = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field Boolean zzcp>
		zzcq = zzbuw.zzcsi;
	//   11   19:aload_0         
	//   12   20:getstatic       #32  <Field int[] zzbuw.zzcsi>
	//   13   23:putfield        #34  <Field int[] zzcq>
		zzcr = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #36  <Field Long zzcr>
		zzcsg = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #40  <Field int zzcsg>
	//   20   36:return          
	}
}
