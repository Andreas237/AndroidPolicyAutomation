// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzjl, zzjt

public final class zzdn extends zzjn
{

	public zzdn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzjn()>
		zzoz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Boolean zzoz>
		zzpa = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field Boolean zzpa>
		zzpb = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field Float zzpb>
		zzadp = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #28  <Field int zzadp>
	//   14   24:return          
	}

	private final zzdn zzd(zzjk zzjk1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            368
		if(i == 8)
			break MISSING_BLOCK_LABEL_279;
	//    5    9:iload_2         
	//    6   10:bipush          8
	//    7   12:icmpeq          279
		if(i == 16)
			break MISSING_BLOCK_LABEL_190;
	//    8   15:iload_2         
	//    9   16:bipush          16
	//   10   18:icmpeq          190
		if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          101
		{
			if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          87
			{
				if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          73
				{
					if(i != 53)
	//*  20   39:iload_2         
	//*  21   40:bipush          53
	//*  22   42:icmpeq          56
					{
						if(!super.zza(zzjk1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #45  <Method boolean zzjn.zza(zzjk, int)>
	//*  27   51:ifne            0
							return this;
	//   28   54:aload_0         
	//   29   55:areturn         
					} else
					{
						zzpb = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #48  <Method int zzjk.zzdv()>
	//   33   61:invokestatic    #54  <Method float Float.intBitsToFloat(int)>
	//   34   64:invokestatic    #58  <Method Float Float.valueOf(float)>
	//   35   67:putfield        #24  <Field Float zzpb>
					}
				} else
	//*  36   70:goto            0
				{
					zzpa = Boolean.valueOf(zzjk1.zzcu());
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #62  <Method boolean zzjk.zzcu()>
	//   40   78:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   41   81:putfield        #22  <Field Boolean zzpa>
				}
			} else
	//*  42   84:goto            0
			{
				zzoz = Boolean.valueOf(zzjk1.zzcu());
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #62  <Method boolean zzjk.zzcu()>
	//   46   92:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   47   95:putfield        #20  <Field Boolean zzoz>
			}
			continue; /* Loop/switch isn't completed */
	//   48   98:goto            0
		}
		j = zzjk1.getPosition();
	//   49  101:aload_1         
	//   50  102:invokevirtual   #70  <Method int zzjk.getPosition()>
	//   51  105:istore_3        
		int k = zzjk1.zzdt();
	//   52  106:aload_1         
	//   53  107:invokevirtual   #73  <Method int zzjk.zzdt()>
	//   54  110:istore          4
		if(k < 0 || k > 2)
			break MISSING_BLOCK_LABEL_135;
	//   55  112:iload           4
	//   56  114:iflt            135
	//   57  117:iload           4
	//   58  119:iconst_2        
	//   59  120:icmpgt          135
		zzoy = Integer.valueOf(k);
	//   60  123:aload_0         
	//   61  124:iload           4
	//   62  126:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   63  129:putfield        #80  <Field Integer zzoy>
		continue; /* Loop/switch isn't completed */
	//   64  132:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(46);
	//   65  135:new             #82  <Class StringBuilder>
	//   66  138:dup             
	//   67  139:bipush          46
	//   68  141:invokespecial   #85  <Method void StringBuilder(int)>
	//   69  144:astore          5
			stringbuilder.append(k);
	//   70  146:aload           5
	//   71  148:iload           4
	//   72  150:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   73  153:pop             
			stringbuilder.append(" is not a valid enum Classification");
	//   74  154:aload           5
	//   75  156:ldc1            #91  <String " is not a valid enum Classification">
	//   76  158:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   77  161:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   78  162:new             #35  <Class IllegalArgumentException>
	//   79  165:dup             
	//   80  166:aload           5
	//   81  168:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   82  171:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   83  174:athrow          
		}
	//*  84  175:aload_1         
	//*  85  176:iload_3         
	//*  86  177:invokevirtual   #104 <Method void zzjk.zzbt(int)>
	//*  87  180:aload_0         
	//*  88  181:aload_1         
	//*  89  182:iload_2         
	//*  90  183:invokevirtual   #45  <Method boolean zzjn.zza(zzjk, int)>
	//*  91  186:pop             
	//*  92  187:goto            0
	//*  93  190:aload_1         
	//*  94  191:invokevirtual   #70  <Method int zzjk.getPosition()>
	//*  95  194:istore_3        
	//*  96  195:aload_1         
	//*  97  196:invokevirtual   #73  <Method int zzjk.zzdt()>
	//*  98  199:istore          4
	//*  99  201:iload           4
	//* 100  203:iflt            224
	//* 101  206:iload           4
	//* 102  208:iconst_3        
	//* 103  209:icmpgt          224
	//* 104  212:aload_0         
	//* 105  213:iload           4
	//* 106  215:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//* 107  218:putfield        #106 <Field Integer zzox>
	//* 108  221:goto            0
	//* 109  224:new             #82  <Class StringBuilder>
	//* 110  227:dup             
	//* 111  228:bipush          40
	//* 112  230:invokespecial   #85  <Method void StringBuilder(int)>
	//* 113  233:astore          5
	//* 114  235:aload           5
	//* 115  237:iload           4
	//* 116  239:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//* 117  242:pop             
	//* 118  243:aload           5
	//* 119  245:ldc1            #108 <String " is not a valid enum Landmark">
	//* 120  247:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//* 121  250:pop             
	//* 122  251:new             #35  <Class IllegalArgumentException>
	//* 123  254:dup             
	//* 124  255:aload           5
	//* 125  257:invokevirtual   #98  <Method String StringBuilder.toString()>
	//* 126  260:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//* 127  263:athrow          
	//* 128  264:aload_1         
	//* 129  265:iload_3         
	//* 130  266:invokevirtual   #104 <Method void zzjk.zzbt(int)>
	//* 131  269:aload_0         
	//* 132  270:aload_1         
	//* 133  271:iload_2         
	//* 134  272:invokevirtual   #45  <Method boolean zzjn.zza(zzjk, int)>
	//* 135  275:pop             
	//* 136  276:goto            0
	//* 137  279:aload_1         
	//* 138  280:invokevirtual   #70  <Method int zzjk.getPosition()>
	//* 139  283:istore_3        
	//* 140  284:aload_1         
	//* 141  285:invokevirtual   #73  <Method int zzjk.zzdt()>
	//* 142  288:istore          4
	//* 143  290:iload           4
	//* 144  292:iflt            313
	//* 145  295:iload           4
	//* 146  297:iconst_3        
	//* 147  298:icmpgt          313
	//* 148  301:aload_0         
	//* 149  302:iload           4
	//* 150  304:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//* 151  307:putfield        #110 <Field Integer zzow>
	//* 152  310:goto            0
	//* 153  313:new             #82  <Class StringBuilder>
	//* 154  316:dup             
	//* 155  317:bipush          36
	//* 156  319:invokespecial   #85  <Method void StringBuilder(int)>
	//* 157  322:astore          5
	//* 158  324:aload           5
	//* 159  326:iload           4
	//* 160  328:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//* 161  331:pop             
	//* 162  332:aload           5
	//* 163  334:ldc1            #112 <String " is not a valid enum Mode">
	//* 164  336:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//* 165  339:pop             
	//* 166  340:new             #35  <Class IllegalArgumentException>
	//* 167  343:dup             
	//* 168  344:aload           5
	//* 169  346:invokevirtual   #98  <Method String StringBuilder.toString()>
	//* 170  349:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//* 171  352:athrow          
	//* 172  353:aload_1         
	//* 173  354:iload_3         
	//* 174  355:invokevirtual   #104 <Method void zzjk.zzbt(int)>
	//* 175  358:aload_0         
	//* 176  359:aload_1         
	//* 177  360:iload_2         
	//* 178  361:invokevirtual   #45  <Method boolean zzjn.zza(zzjk, int)>
	//* 179  364:pop             
	//* 180  365:goto            0
	//* 181  368:aload_0         
	//* 182  369:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzjk1.zzbt(j);
		}
		((zzjn)this).zza(zzjk1, i);
		continue; /* Loop/switch isn't completed */
		j = zzjk1.getPosition();
		k = zzjk1.zzdt();
		if(k < 0 || k > 3)
			break MISSING_BLOCK_LABEL_224;
		zzox = Integer.valueOf(k);
		continue; /* Loop/switch isn't completed */
		try
		{
			StringBuilder stringbuilder1 = new StringBuilder(40);
			stringbuilder1.append(k);
			stringbuilder1.append(" is not a valid enum Landmark");
			throw new IllegalArgumentException(stringbuilder1.toString());
		}
	//* 183  370:astore          5
	//* 184  372:goto            175
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzjk1.zzbt(j);
		}
		((zzjn)this).zza(zzjk1, i);
		continue; /* Loop/switch isn't completed */
		j = zzjk1.getPosition();
		k = zzjk1.zzdt();
		if(k < 0 || k > 3)
			break MISSING_BLOCK_LABEL_313;
		zzow = Integer.valueOf(k);
		continue; /* Loop/switch isn't completed */
		try
		{
			StringBuilder stringbuilder2 = new StringBuilder(36);
			stringbuilder2.append(k);
			stringbuilder2.append(" is not a valid enum Mode");
			throw new IllegalArgumentException(stringbuilder2.toString());
		}
	//* 185  375:astore          5
	//* 186  377:goto            264
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzjk1.zzbt(j);
		}
		((zzjn)this).zza(zzjk1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//* 187  380:astore          5
	//* 188  382:goto            353
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		return ((zzjt) (zzd(zzjk1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method zzdn zzd(zzjk)>
	//    3    5:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzow));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Integer zzow>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzjl1.zze(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #120 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #126 <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzox));
	//   10   18:aload_0         
	//   11   19:getfield        #106 <Field Integer zzox>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			zzjl1.zze(2, ((Integer) (obj)).intValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #120 <Method int Integer.intValue()>
	//   19   33:invokevirtual   #126 <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzoy));
	//   20   36:aload_0         
	//   21   37:getfield        #80  <Field Integer zzoy>
	//   22   40:astore_2        
		if(obj != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          54
			zzjl1.zze(3, ((Integer) (obj)).intValue());
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #120 <Method int Integer.intValue()>
	//   29   51:invokevirtual   #126 <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzoz));
	//   30   54:aload_0         
	//   31   55:getfield        #20  <Field Boolean zzoz>
	//   32   58:astore_2        
		if(obj != null)
	//*  33   59:aload_2         
	//*  34   60:ifnull          72
			zzjl1.zzb(4, ((Boolean) (obj)).booleanValue());
	//   35   63:aload_1         
	//   36   64:iconst_4        
	//   37   65:aload_2         
	//   38   66:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//   39   69:invokevirtual   #133 <Method void zzjl.zzb(int, boolean)>
		obj = ((Object) (zzpa));
	//   40   72:aload_0         
	//   41   73:getfield        #22  <Field Boolean zzpa>
	//   42   76:astore_2        
		if(obj != null)
	//*  43   77:aload_2         
	//*  44   78:ifnull          90
			zzjl1.zzb(5, ((Boolean) (obj)).booleanValue());
	//   45   81:aload_1         
	//   46   82:iconst_5        
	//   47   83:aload_2         
	//   48   84:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//   49   87:invokevirtual   #133 <Method void zzjl.zzb(int, boolean)>
		obj = ((Object) (zzpb));
	//   50   90:aload_0         
	//   51   91:getfield        #24  <Field Float zzpb>
	//   52   94:astore_2        
		if(obj != null)
	//*  53   95:aload_2         
	//*  54   96:ifnull          109
			zzjl1.zza(6, ((Float) (obj)).floatValue());
	//   55   99:aload_1         
	//   56  100:bipush          6
	//   57  102:aload_2         
	//   58  103:invokevirtual   #137 <Method float Float.floatValue()>
	//   59  106:invokevirtual   #140 <Method void zzjl.zza(int, float)>
		super.zza(zzjl1);
	//   60  109:aload_0         
	//   61  110:aload_1         
	//   62  111:invokespecial   #142 <Method void zzjn.zza(zzjl)>
	//   63  114:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzow));
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field Integer zzow>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + zzjl.zzi(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #120 <Method int Integer.intValue()>
	//   14   22:invokestatic    #149 <Method int zzjl.zzi(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (zzox));
	//   17   27:aload_0         
	//   18   28:getfield        #106 <Field Integer zzox>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + zzjl.zzi(2, ((Integer) (obj)).intValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #120 <Method int Integer.intValue()>
	//   28   44:invokestatic    #149 <Method int zzjl.zzi(int, int)>
	//   29   47:iadd            
	//   30   48:istore_2        
		obj = ((Object) (zzoy));
	//   31   49:aload_0         
	//   32   50:getfield        #80  <Field Integer zzoy>
	//   33   53:astore_3        
		i = j;
	//   34   54:iload_2         
	//   35   55:istore_1        
		if(obj != null)
	//*  36   56:aload_3         
	//*  37   57:ifnull          71
			i = j + zzjl.zzi(3, ((Integer) (obj)).intValue());
	//   38   60:iload_2         
	//   39   61:iconst_3        
	//   40   62:aload_3         
	//   41   63:invokevirtual   #120 <Method int Integer.intValue()>
	//   42   66:invokestatic    #149 <Method int zzjl.zzi(int, int)>
	//   43   69:iadd            
	//   44   70:istore_1        
		obj = ((Object) (zzoz));
	//   45   71:aload_0         
	//   46   72:getfield        #20  <Field Boolean zzoz>
	//   47   75:astore_3        
		j = i;
	//   48   76:iload_1         
	//   49   77:istore_2        
		if(obj != null)
	//*  50   78:aload_3         
	//*  51   79:ifnull          96
		{
			((Boolean) (obj)).booleanValue();
	//   52   82:aload_3         
	//   53   83:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//   54   86:pop             
			j = i + (zzjl.zzav(4) + 1);
	//   55   87:iload_1         
	//   56   88:iconst_4        
	//   57   89:invokestatic    #153 <Method int zzjl.zzav(int)>
	//   58   92:iconst_1        
	//   59   93:iadd            
	//   60   94:iadd            
	//   61   95:istore_2        
		}
		obj = ((Object) (zzpa));
	//   62   96:aload_0         
	//   63   97:getfield        #22  <Field Boolean zzpa>
	//   64  100:astore_3        
		i = j;
	//   65  101:iload_2         
	//   66  102:istore_1        
		if(obj != null)
	//*  67  103:aload_3         
	//*  68  104:ifnull          121
		{
			((Boolean) (obj)).booleanValue();
	//   69  107:aload_3         
	//   70  108:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//   71  111:pop             
			i = j + (zzjl.zzav(5) + 1);
	//   72  112:iload_2         
	//   73  113:iconst_5        
	//   74  114:invokestatic    #153 <Method int zzjl.zzav(int)>
	//   75  117:iconst_1        
	//   76  118:iadd            
	//   77  119:iadd            
	//   78  120:istore_1        
		}
		obj = ((Object) (zzpb));
	//   79  121:aload_0         
	//   80  122:getfield        #24  <Field Float zzpb>
	//   81  125:astore_3        
		j = i;
	//   82  126:iload_1         
	//   83  127:istore_2        
		if(obj != null)
	//*  84  128:aload_3         
	//*  85  129:ifnull          147
		{
			((Float) (obj)).floatValue();
	//   86  132:aload_3         
	//   87  133:invokevirtual   #137 <Method float Float.floatValue()>
	//   88  136:pop             
			j = i + (zzjl.zzav(6) + 4);
	//   89  137:iload_1         
	//   90  138:bipush          6
	//   91  140:invokestatic    #153 <Method int zzjl.zzav(int)>
	//   92  143:iconst_4        
	//   93  144:iadd            
	//   94  145:iadd            
	//   95  146:istore_2        
		}
		return j;
	//   96  147:iload_2         
	//   97  148:ireturn         
	}

	public Integer zzow;
	public Integer zzox;
	public Integer zzoy;
	public Boolean zzoz;
	public Boolean zzpa;
	public Float zzpb;
}
