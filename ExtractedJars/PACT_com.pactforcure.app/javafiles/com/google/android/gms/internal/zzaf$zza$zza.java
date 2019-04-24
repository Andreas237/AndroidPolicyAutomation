// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbur, zzbum, 
//			zzbul, zzbut

public static final class zzaf$zza$zza extends zzbun
{

	public static zzaf$zza$zza[] zzy()
	{
		if(zzcb == null)
	//*   0    0:getstatic       #63  <Field zzaf$zza$zza[] zzcb>
	//*   1    3:ifnonnull       27
			synchronized(zzbur.zzcsf)
	//*   2    6:getstatic       #69  <Field Object zzbur.zzcsf>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzcb == null)
	//*   6   12:getstatic       #63  <Field zzaf$zza$zza[] zzcb>
	//*   7   15:ifnonnull       25
					zzcb = new zzaf$zza$zza[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzaf$zza$zza[]
	//   10   22:putstatic       #63  <Field zzaf$zza$zza[] zzcb>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		return zzcb;
	//   13   27:getstatic       #63  <Field zzaf$zza$zza[] zzcb>
	//   14   30:areturn         
		exception;
	//   15   31:astore_1        
		obj;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		throw exception;
	//   18   34:aload_1         
	//   19   35:athrow          
	}

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzbm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Long zzbm>
	//*   2    4:ifnull          19
			zzbum1.zzb(1, zzbm.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Long zzbm>
	//    7   13:invokevirtual   #78  <Method long Long.longValue()>
	//    8   16:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzbn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #34  <Field Long zzbn>
	//*  11   23:ifnull          38
			zzbum1.zzb(2, zzbn.longValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #34  <Field Long zzbn>
	//   16   32:invokevirtual   #78  <Method long Long.longValue()>
	//   17   35:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzcc != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #36  <Field Long zzcc>
	//*  20   42:ifnull          57
			zzbum1.zzb(3, zzcc.longValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field Long zzcc>
	//   25   51:invokevirtual   #78  <Method long Long.longValue()>
	//   26   54:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzcd != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #38  <Field Long zzcd>
	//*  29   61:ifnull          76
			zzbum1.zzb(4, zzcd.longValue());
	//   30   64:aload_1         
	//   31   65:iconst_4        
	//   32   66:aload_0         
	//   33   67:getfield        #38  <Field Long zzcd>
	//   34   70:invokevirtual   #78  <Method long Long.longValue()>
	//   35   73:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzce != null)
	//*  36   76:aload_0         
	//*  37   77:getfield        #40  <Field Long zzce>
	//*  38   80:ifnull          95
			zzbum1.zzb(5, zzce.longValue());
	//   39   83:aload_1         
	//   40   84:iconst_5        
	//   41   85:aload_0         
	//   42   86:getfield        #40  <Field Long zzce>
	//   43   89:invokevirtual   #78  <Method long Long.longValue()>
	//   44   92:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzcf != null)
	//*  45   95:aload_0         
	//*  46   96:getfield        #42  <Field Long zzcf>
	//*  47   99:ifnull          115
			zzbum1.zzb(6, zzcf.longValue());
	//   48  102:aload_1         
	//   49  103:bipush          6
	//   50  105:aload_0         
	//   51  106:getfield        #42  <Field Long zzcf>
	//   52  109:invokevirtual   #78  <Method long Long.longValue()>
	//   53  112:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzcg != null)
	//*  54  115:aload_0         
	//*  55  116:getfield        #44  <Field Integer zzcg>
	//*  56  119:ifnull          135
			zzbum1.zzF(7, zzcg.intValue());
	//   57  122:aload_1         
	//   58  123:bipush          7
	//   59  125:aload_0         
	//   60  126:getfield        #44  <Field Integer zzcg>
	//   61  129:invokevirtual   #90  <Method int Integer.intValue()>
	//   62  132:invokevirtual   #94  <Method void zzbum.zzF(int, int)>
		if(zzch != null)
	//*  63  135:aload_0         
	//*  64  136:getfield        #46  <Field Long zzch>
	//*  65  139:ifnull          155
			zzbum1.zzb(8, zzch.longValue());
	//   66  142:aload_1         
	//   67  143:bipush          8
	//   68  145:aload_0         
	//   69  146:getfield        #46  <Field Long zzch>
	//   70  149:invokevirtual   #78  <Method long Long.longValue()>
	//   71  152:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzci != null)
	//*  72  155:aload_0         
	//*  73  156:getfield        #48  <Field Long zzci>
	//*  74  159:ifnull          175
			zzbum1.zzb(9, zzci.longValue());
	//   75  162:aload_1         
	//   76  163:bipush          9
	//   77  165:aload_0         
	//   78  166:getfield        #48  <Field Long zzci>
	//   79  169:invokevirtual   #78  <Method long Long.longValue()>
	//   80  172:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzcj != null)
	//*  81  175:aload_0         
	//*  82  176:getfield        #50  <Field Long zzcj>
	//*  83  179:ifnull          195
			zzbum1.zzb(10, zzcj.longValue());
	//   84  182:aload_1         
	//   85  183:bipush          10
	//   86  185:aload_0         
	//   87  186:getfield        #50  <Field Long zzcj>
	//   88  189:invokevirtual   #78  <Method long Long.longValue()>
	//   89  192:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		if(zzck != null)
	//*  90  195:aload_0         
	//*  91  196:getfield        #52  <Field Integer zzck>
	//*  92  199:ifnull          215
			zzbum1.zzF(11, zzck.intValue());
	//   93  202:aload_1         
	//   94  203:bipush          11
	//   95  205:aload_0         
	//   96  206:getfield        #52  <Field Integer zzck>
	//   97  209:invokevirtual   #90  <Method int Integer.intValue()>
	//   98  212:invokevirtual   #94  <Method void zzbum.zzF(int, int)>
		if(zzcl != null)
	//*  99  215:aload_0         
	//* 100  216:getfield        #54  <Field Long zzcl>
	//* 101  219:ifnull          235
			zzbum1.zzb(12, zzcl.longValue());
	//  102  222:aload_1         
	//  103  223:bipush          12
	//  104  225:aload_0         
	//  105  226:getfield        #54  <Field Long zzcl>
	//  106  229:invokevirtual   #78  <Method long Long.longValue()>
	//  107  232:invokevirtual   #84  <Method void zzbum.zzb(int, long)>
		super.zza(zzbum1);
	//  108  235:aload_0         
	//  109  236:aload_1         
	//  110  237:invokespecial   #96  <Method void zzbun.zza(zzbum)>
	//  111  240:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzg(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method zzaf$zza$zza zzg(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zza$zza zzg(zzbul zzbul1)
		throws IOException
	{
_L15:
		int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #107 <Method int zzbul.zzacu()>
	//    2    4:istore_2        
		i;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 13: default 120
	//	               0: 129
	//	               8: 131
	//	               16: 145
	//	               24: 159
	//	               32: 173
	//	               40: 187
	//	               48: 201
	//	               56: 215
	//	               64: 278
	//	               72: 292
	//	               80: 306
	//	               88: 320
	//	               96: 382;
	//    4    6:lookupswitch    13: default 120
	//	               0: 129
	//	               8: 131
	//	               16: 145
	//	               24: 159
	//	               32: 173
	//	               40: 187
	//	               48: 201
	//	               56: 215
	//	               64: 278
	//	               72: 292
	//	               80: 306
	//	               88: 320
	//	               96: 382
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
		if(super.zza(zzbul1, i)) goto _L15; else goto _L2
	//    5  120:aload_0         
	//    6  121:aload_1         
	//    7  122:iload_2         
	//    8  123:invokespecial   #110 <Method boolean zzbun.zza(zzbul, int)>
	//    9  126:ifne            0
_L2:
		return this;
	//   10  129:aload_0         
	//   11  130:areturn         
_L3:
		zzbm = Long.valueOf(zzbul1.zzacx());
	//   12  131:aload_0         
	//   13  132:aload_1         
	//   14  133:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   15  136:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   16  139:putfield        #32  <Field Long zzbm>
		  goto _L15
	//*  17  142:goto            0
_L4:
		zzbn = Long.valueOf(zzbul1.zzacx());
	//   18  145:aload_0         
	//   19  146:aload_1         
	//   20  147:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   21  150:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   22  153:putfield        #34  <Field Long zzbn>
		  goto _L15
	//*  23  156:goto            0
_L5:
		zzcc = Long.valueOf(zzbul1.zzacx());
	//   24  159:aload_0         
	//   25  160:aload_1         
	//   26  161:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   27  164:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   28  167:putfield        #36  <Field Long zzcc>
		  goto _L15
	//*  29  170:goto            0
_L6:
		zzcd = Long.valueOf(zzbul1.zzacx());
	//   30  173:aload_0         
	//   31  174:aload_1         
	//   32  175:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   33  178:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   34  181:putfield        #38  <Field Long zzcd>
		  goto _L15
	//*  35  184:goto            0
_L7:
		zzce = Long.valueOf(zzbul1.zzacx());
	//   36  187:aload_0         
	//   37  188:aload_1         
	//   38  189:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   39  192:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   40  195:putfield        #40  <Field Long zzce>
		  goto _L15
	//*  41  198:goto            0
_L8:
		zzcf = Long.valueOf(zzbul1.zzacx());
	//   42  201:aload_0         
	//   43  202:aload_1         
	//   44  203:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   45  206:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   46  209:putfield        #42  <Field Long zzcf>
		  goto _L15
	//*  47  212:goto            0
_L9:
		int j = zzbul1.zzacy();
	//   48  215:aload_1         
	//   49  216:invokevirtual   #120 <Method int zzbul.zzacy()>
	//   50  219:istore_2        
		switch(j)
	//*  51  220:iload_2         
		{
	//*  52  221:lookupswitch    4: default 264
	//	               0: 267
	//	               1: 267
	//	               2: 267
	//	               1000: 267
	//*  53  264:goto            0
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 1000: 
			zzcg = Integer.valueOf(j);
	//   54  267:aload_0         
	//   55  268:iload_2         
	//   56  269:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   57  272:putfield        #44  <Field Integer zzcg>
			break;
		}
		continue; /* Loop/switch isn't completed */
	//   58  275:goto            0
_L10:
		zzch = Long.valueOf(zzbul1.zzacx());
	//   59  278:aload_0         
	//   60  279:aload_1         
	//   61  280:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   62  283:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   63  286:putfield        #46  <Field Long zzch>
		continue; /* Loop/switch isn't completed */
	//   64  289:goto            0
_L11:
		zzci = Long.valueOf(zzbul1.zzacx());
	//   65  292:aload_0         
	//   66  293:aload_1         
	//   67  294:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   68  297:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   69  300:putfield        #48  <Field Long zzci>
		continue; /* Loop/switch isn't completed */
	//   70  303:goto            0
_L12:
		zzcj = Long.valueOf(zzbul1.zzacx());
	//   71  306:aload_0         
	//   72  307:aload_1         
	//   73  308:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   74  311:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   75  314:putfield        #50  <Field Long zzcj>
		continue; /* Loop/switch isn't completed */
	//   76  317:goto            0
_L13:
		int k = zzbul1.zzacy();
	//   77  320:aload_1         
	//   78  321:invokevirtual   #120 <Method int zzbul.zzacy()>
	//   79  324:istore_2        
		switch(k)
	//*  80  325:iload_2         
		{
	//*  81  326:lookupswitch    4: default 368
	//	               0: 371
	//	               1: 371
	//	               2: 371
	//	               1000: 371
	//*  82  368:goto            0
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 1000: 
			zzck = Integer.valueOf(k);
	//   83  371:aload_0         
	//   84  372:iload_2         
	//   85  373:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   86  376:putfield        #52  <Field Integer zzck>
			break;
		}
		continue; /* Loop/switch isn't completed */
	//   87  379:goto            0
_L14:
		zzcl = Long.valueOf(zzbul1.zzacx());
	//   88  382:aload_0         
	//   89  383:aload_1         
	//   90  384:invokevirtual   #113 <Method long zzbul.zzacx()>
	//   91  387:invokestatic    #117 <Method Long Long.valueOf(long)>
	//   92  390:putfield        #54  <Field Long zzcl>
		if(true) goto _L15; else goto _L16
_L16:
	//*  93  393:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method int zzbun.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzbm != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #32  <Field Long zzbm>
	//*   7   11:ifnull          28
			i = j + zzbum.zzf(1, zzbm.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field Long zzbm>
	//   12   20:invokevirtual   #78  <Method long Long.longValue()>
	//   13   23:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzbn != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #34  <Field Long zzbn>
	//*  20   34:ifnull          51
			j = i + zzbum.zzf(2, zzbn.longValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #34  <Field Long zzbn>
	//   25   43:invokevirtual   #78  <Method long Long.longValue()>
	//   26   46:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   27   49:iadd            
	//   28   50:istore_2        
		i = j;
	//   29   51:iload_2         
	//   30   52:istore_1        
		if(zzcc != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #36  <Field Long zzcc>
	//*  33   57:ifnull          74
			i = j + zzbum.zzf(3, zzcc.longValue());
	//   34   60:iload_2         
	//   35   61:iconst_3        
	//   36   62:aload_0         
	//   37   63:getfield        #36  <Field Long zzcc>
	//   38   66:invokevirtual   #78  <Method long Long.longValue()>
	//   39   69:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   40   72:iadd            
	//   41   73:istore_1        
		j = i;
	//   42   74:iload_1         
	//   43   75:istore_2        
		if(zzcd != null)
	//*  44   76:aload_0         
	//*  45   77:getfield        #38  <Field Long zzcd>
	//*  46   80:ifnull          97
			j = i + zzbum.zzf(4, zzcd.longValue());
	//   47   83:iload_1         
	//   48   84:iconst_4        
	//   49   85:aload_0         
	//   50   86:getfield        #38  <Field Long zzcd>
	//   51   89:invokevirtual   #78  <Method long Long.longValue()>
	//   52   92:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   53   95:iadd            
	//   54   96:istore_2        
		i = j;
	//   55   97:iload_2         
	//   56   98:istore_1        
		if(zzce != null)
	//*  57   99:aload_0         
	//*  58  100:getfield        #40  <Field Long zzce>
	//*  59  103:ifnull          120
			i = j + zzbum.zzf(5, zzce.longValue());
	//   60  106:iload_2         
	//   61  107:iconst_5        
	//   62  108:aload_0         
	//   63  109:getfield        #40  <Field Long zzce>
	//   64  112:invokevirtual   #78  <Method long Long.longValue()>
	//   65  115:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   66  118:iadd            
	//   67  119:istore_1        
		j = i;
	//   68  120:iload_1         
	//   69  121:istore_2        
		if(zzcf != null)
	//*  70  122:aload_0         
	//*  71  123:getfield        #42  <Field Long zzcf>
	//*  72  126:ifnull          144
			j = i + zzbum.zzf(6, zzcf.longValue());
	//   73  129:iload_1         
	//   74  130:bipush          6
	//   75  132:aload_0         
	//   76  133:getfield        #42  <Field Long zzcf>
	//   77  136:invokevirtual   #78  <Method long Long.longValue()>
	//   78  139:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//   79  142:iadd            
	//   80  143:istore_2        
		i = j;
	//   81  144:iload_2         
	//   82  145:istore_1        
		if(zzcg != null)
	//*  83  146:aload_0         
	//*  84  147:getfield        #44  <Field Integer zzcg>
	//*  85  150:ifnull          168
			i = j + zzbum.zzH(7, zzcg.intValue());
	//   86  153:iload_2         
	//   87  154:bipush          7
	//   88  156:aload_0         
	//   89  157:getfield        #44  <Field Integer zzcg>
	//   90  160:invokevirtual   #90  <Method int Integer.intValue()>
	//   91  163:invokestatic    #134 <Method int zzbum.zzH(int, int)>
	//   92  166:iadd            
	//   93  167:istore_1        
		j = i;
	//   94  168:iload_1         
	//   95  169:istore_2        
		if(zzch != null)
	//*  96  170:aload_0         
	//*  97  171:getfield        #46  <Field Long zzch>
	//*  98  174:ifnull          192
			j = i + zzbum.zzf(8, zzch.longValue());
	//   99  177:iload_1         
	//  100  178:bipush          8
	//  101  180:aload_0         
	//  102  181:getfield        #46  <Field Long zzch>
	//  103  184:invokevirtual   #78  <Method long Long.longValue()>
	//  104  187:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//  105  190:iadd            
	//  106  191:istore_2        
		i = j;
	//  107  192:iload_2         
	//  108  193:istore_1        
		if(zzci != null)
	//* 109  194:aload_0         
	//* 110  195:getfield        #48  <Field Long zzci>
	//* 111  198:ifnull          216
			i = j + zzbum.zzf(9, zzci.longValue());
	//  112  201:iload_2         
	//  113  202:bipush          9
	//  114  204:aload_0         
	//  115  205:getfield        #48  <Field Long zzci>
	//  116  208:invokevirtual   #78  <Method long Long.longValue()>
	//  117  211:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//  118  214:iadd            
	//  119  215:istore_1        
		j = i;
	//  120  216:iload_1         
	//  121  217:istore_2        
		if(zzcj != null)
	//* 122  218:aload_0         
	//* 123  219:getfield        #50  <Field Long zzcj>
	//* 124  222:ifnull          240
			j = i + zzbum.zzf(10, zzcj.longValue());
	//  125  225:iload_1         
	//  126  226:bipush          10
	//  127  228:aload_0         
	//  128  229:getfield        #50  <Field Long zzcj>
	//  129  232:invokevirtual   #78  <Method long Long.longValue()>
	//  130  235:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//  131  238:iadd            
	//  132  239:istore_2        
		i = j;
	//  133  240:iload_2         
	//  134  241:istore_1        
		if(zzck != null)
	//* 135  242:aload_0         
	//* 136  243:getfield        #52  <Field Integer zzck>
	//* 137  246:ifnull          264
			i = j + zzbum.zzH(11, zzck.intValue());
	//  138  249:iload_2         
	//  139  250:bipush          11
	//  140  252:aload_0         
	//  141  253:getfield        #52  <Field Integer zzck>
	//  142  256:invokevirtual   #90  <Method int Integer.intValue()>
	//  143  259:invokestatic    #134 <Method int zzbum.zzH(int, int)>
	//  144  262:iadd            
	//  145  263:istore_1        
		j = i;
	//  146  264:iload_1         
	//  147  265:istore_2        
		if(zzcl != null)
	//* 148  266:aload_0         
	//* 149  267:getfield        #54  <Field Long zzcl>
	//* 150  270:ifnull          288
			j = i + zzbum.zzf(12, zzcl.longValue());
	//  151  273:iload_1         
	//  152  274:bipush          12
	//  153  276:aload_0         
	//  154  277:getfield        #54  <Field Long zzcl>
	//  155  280:invokevirtual   #78  <Method long Long.longValue()>
	//  156  283:invokestatic    #130 <Method int zzbum.zzf(int, long)>
	//  157  286:iadd            
	//  158  287:istore_2        
		return j;
	//  159  288:iload_2         
	//  160  289:ireturn         
	}

	private static volatile zzaf$zza$zza zzcb[];
	public Long zzbm;
	public Long zzbn;
	public Long zzcc;
	public Long zzcd;
	public Long zzce;
	public Long zzcf;
	public Integer zzcg;
	public Long zzch;
	public Long zzci;
	public Long zzcj;
	public Integer zzck;
	public Long zzcl;

	public zzaf$zza$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzbun()>
		zzbm = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field Long zzbm>
		zzbn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #34  <Field Long zzbn>
		zzcc = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field Long zzcc>
		zzcd = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #38  <Field Long zzcd>
		zzce = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #40  <Field Long zzce>
		zzcf = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #42  <Field Long zzcf>
		zzcg = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #44  <Field Integer zzcg>
		zzch = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #46  <Field Long zzch>
		zzci = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #48  <Field Long zzci>
		zzcj = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #50  <Field Long zzcj>
		zzck = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #52  <Field Integer zzck>
		zzcl = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #54  <Field Long zzcl>
		zzcsg = -1;
	//   38   64:aload_0         
	//   39   65:iconst_m1       
	//   40   66:putfield        #58  <Field int zzcsg>
	//   41   69:return          
	}
}
