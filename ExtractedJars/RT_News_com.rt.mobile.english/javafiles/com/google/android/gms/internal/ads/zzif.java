// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzis, zzbez, zzbfl, 
//			zzbfa, zzbfi

public final class zzif extends zzbfc
{

	public zzif()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbfc()>
		zzamo = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Integer zzamo>
		zzamp = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field zzis zzamp>
		zzamq = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field zzis zzamq>
		zzamr = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field zzis zzamr>
		zzams = zzis.zzht();
	//   14   24:aload_0         
	//   15   25:invokestatic    #32  <Method zzis[] zzis.zzht()>
	//   16   28:putfield        #34  <Field zzis[] zzams>
		zzamt = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #36  <Field Integer zzamt>
		zzebk = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #40  <Field zzbfe zzebk>
		zzebt = -1;
	//   23   41:aload_0         
	//   24   42:iconst_m1       
	//   25   43:putfield        #44  <Field int zzebt>
	//   26   46:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #55  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            292
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          278
			{
				zzis zzis1;
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          245
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          218
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          191
						{
							if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          70
							{
								if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzbez1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #58  <Method boolean zzbfc.zza(zzbez, int)>
	//*  27   51:ifne            0
										return ((zzbfi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									zzamt = Integer.valueOf(zzbez1.zzacc());
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #61  <Method int zzbez.zzacc()>
	//   33   61:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   34   64:putfield        #36  <Field Integer zzamt>
								}
							} else
	//*  35   67:goto            0
							{
								int k = zzbfl.zzb(zzbez1, 42);
	//   36   70:aload_1         
	//   37   71:bipush          42
	//   38   73:invokestatic    #73  <Method int zzbfl.zzb(zzbez, int)>
	//   39   76:istore_3        
								int j;
								if(zzams == null)
	//*  40   77:aload_0         
	//*  41   78:getfield        #34  <Field zzis[] zzams>
	//*  42   81:ifnonnull       89
									j = 0;
	//   43   84:iconst_0        
	//   44   85:istore_2        
								else
	//*  45   86:goto            95
									j = zzams.length;
	//   46   89:aload_0         
	//   47   90:getfield        #34  <Field zzis[] zzams>
	//   48   93:arraylength     
	//   49   94:istore_2        
								zzis azzis[] = new zzis[k + j];
	//   50   95:iload_3         
	//   51   96:iload_2         
	//   52   97:iadd            
	//   53   98:anewarray       zzis[]
	//   54  101:astore          4
								k = j;
	//   55  103:iload_2         
	//   56  104:istore_3        
								if(j != 0)
	//*  57  105:iload_2         
	//*  58  106:ifeq            123
								{
									System.arraycopy(((Object) (zzams)), 0, ((Object) (azzis)), 0, j);
	//   59  109:aload_0         
	//   60  110:getfield        #34  <Field zzis[] zzams>
	//   61  113:iconst_0        
	//   62  114:aload           4
	//   63  116:iconst_0        
	//   64  117:iload_2         
	//   65  118:invokestatic    #79  <Method void System.arraycopy(Object, int, Object, int, int)>
									k = j;
	//   66  121:iload_2         
	//   67  122:istore_3        
								}
								for(; k < azzis.length - 1; k++)
	//*  68  123:iload_3         
	//*  69  124:aload           4
	//*  70  126:arraylength     
	//*  71  127:iconst_1        
	//*  72  128:isub            
	//*  73  129:icmpge          163
								{
									azzis[k] = new zzis();
	//   74  132:aload           4
	//   75  134:iload_3         
	//   76  135:new             #28  <Class zzis>
	//   77  138:dup             
	//   78  139:invokespecial   #80  <Method void zzis()>
	//   79  142:aastore         
									zzbez1.zza(((zzbfi) (azzis[k])));
	//   80  143:aload_1         
	//   81  144:aload           4
	//   82  146:iload_3         
	//   83  147:aaload          
	//   84  148:invokevirtual   #83  <Method void zzbez.zza(zzbfi)>
									zzbez1.zzabk();
	//   85  151:aload_1         
	//   86  152:invokevirtual   #55  <Method int zzbez.zzabk()>
	//   87  155:pop             
								}

	//   88  156:iload_3         
	//   89  157:iconst_1        
	//   90  158:iadd            
	//   91  159:istore_3        
	//*  92  160:goto            123
								azzis[k] = new zzis();
	//   93  163:aload           4
	//   94  165:iload_3         
	//   95  166:new             #28  <Class zzis>
	//   96  169:dup             
	//   97  170:invokespecial   #80  <Method void zzis()>
	//   98  173:aastore         
								zzbez1.zza(((zzbfi) (azzis[k])));
	//   99  174:aload_1         
	//  100  175:aload           4
	//  101  177:iload_3         
	//  102  178:aaload          
	//  103  179:invokevirtual   #83  <Method void zzbez.zza(zzbfi)>
								zzams = azzis;
	//  104  182:aload_0         
	//  105  183:aload           4
	//  106  185:putfield        #34  <Field zzis[] zzams>
							}
							continue;
	//  107  188:goto            0
						}
						if(zzamr == null)
	//* 108  191:aload_0         
	//* 109  192:getfield        #26  <Field zzis zzamr>
	//* 110  195:ifnonnull       209
							zzamr = new zzis();
	//  111  198:aload_0         
	//  112  199:new             #28  <Class zzis>
	//  113  202:dup             
	//  114  203:invokespecial   #80  <Method void zzis()>
	//  115  206:putfield        #26  <Field zzis zzamr>
						zzis1 = zzamr;
	//  116  209:aload_0         
	//  117  210:getfield        #26  <Field zzis zzamr>
	//  118  213:astore          4
					} else
	//* 119  215:goto            269
					{
						if(zzamq == null)
	//* 120  218:aload_0         
	//* 121  219:getfield        #24  <Field zzis zzamq>
	//* 122  222:ifnonnull       236
							zzamq = new zzis();
	//  123  225:aload_0         
	//  124  226:new             #28  <Class zzis>
	//  125  229:dup             
	//  126  230:invokespecial   #80  <Method void zzis()>
	//  127  233:putfield        #24  <Field zzis zzamq>
						zzis1 = zzamq;
	//  128  236:aload_0         
	//  129  237:getfield        #24  <Field zzis zzamq>
	//  130  240:astore          4
					}
				} else
	//* 131  242:goto            269
				{
					if(zzamp == null)
	//* 132  245:aload_0         
	//* 133  246:getfield        #22  <Field zzis zzamp>
	//* 134  249:ifnonnull       263
						zzamp = new zzis();
	//  135  252:aload_0         
	//  136  253:new             #28  <Class zzis>
	//  137  256:dup             
	//  138  257:invokespecial   #80  <Method void zzis()>
	//  139  260:putfield        #22  <Field zzis zzamp>
					zzis1 = zzamp;
	//  140  263:aload_0         
	//  141  264:getfield        #22  <Field zzis zzamp>
	//  142  267:astore          4
				}
				zzbez1.zza(((zzbfi) (zzis1)));
	//  143  269:aload_1         
	//  144  270:aload           4
	//  145  272:invokevirtual   #83  <Method void zzbez.zza(zzbfi)>
			} else
	//* 146  275:goto            0
			{
				zzamo = Integer.valueOf(zzbez1.zzacc());
	//  147  278:aload_0         
	//  148  279:aload_1         
	//  149  280:invokevirtual   #61  <Method int zzbez.zzacc()>
	//  150  283:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//  151  286:putfield        #20  <Field Integer zzamo>
			}
		} while(true);
	//  152  289:goto            0
		return ((zzbfi) (this));
	//  153  292:aload_0         
	//  154  293:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Integer zzamo>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzamo.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field Integer zzamo>
	//    7   13:invokevirtual   #88  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #94  <Method void zzbfa.zzm(int, int)>
		if(zzamp != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field zzis zzamp>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzamp)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field zzis zzamp>
	//   16   32:invokevirtual   #97  <Method void zzbfa.zza(int, zzbfi)>
		if(zzamq != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #24  <Field zzis zzamq>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, ((zzbfi) (zzamq)));
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field zzis zzamq>
	//   24   48:invokevirtual   #97  <Method void zzbfa.zza(int, zzbfi)>
		if(zzamr != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #26  <Field zzis zzamr>
	//*  27   55:ifnull          67
			zzbfa1.zza(4, ((zzbfi) (zzamr)));
	//   28   58:aload_1         
	//   29   59:iconst_4        
	//   30   60:aload_0         
	//   31   61:getfield        #26  <Field zzis zzamr>
	//   32   64:invokevirtual   #97  <Method void zzbfa.zza(int, zzbfi)>
		if(zzams != null && zzams.length > 0)
	//*  33   67:aload_0         
	//*  34   68:getfield        #34  <Field zzis[] zzams>
	//*  35   71:ifnull          117
	//*  36   74:aload_0         
	//*  37   75:getfield        #34  <Field zzis[] zzams>
	//*  38   78:arraylength     
	//*  39   79:ifle            117
		{
			for(int i = 0; i < zzams.length; i++)
	//*  40   82:iconst_0        
	//*  41   83:istore_2        
	//*  42   84:iload_2         
	//*  43   85:aload_0         
	//*  44   86:getfield        #34  <Field zzis[] zzams>
	//*  45   89:arraylength     
	//*  46   90:icmpge          117
			{
				zzis zzis1 = zzams[i];
	//   47   93:aload_0         
	//   48   94:getfield        #34  <Field zzis[] zzams>
	//   49   97:iload_2         
	//   50   98:aaload          
	//   51   99:astore_3        
				if(zzis1 != null)
	//*  52  100:aload_3         
	//*  53  101:ifnull          110
					zzbfa1.zza(5, ((zzbfi) (zzis1)));
	//   54  104:aload_1         
	//   55  105:iconst_5        
	//   56  106:aload_3         
	//   57  107:invokevirtual   #97  <Method void zzbfa.zza(int, zzbfi)>
			}

	//   58  110:iload_2         
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore_2        
		}
	//*  62  114:goto            84
		if(zzamt != null)
	//*  63  117:aload_0         
	//*  64  118:getfield        #36  <Field Integer zzamt>
	//*  65  121:ifnull          137
			zzbfa1.zzm(6, zzamt.intValue());
	//   66  124:aload_1         
	//   67  125:bipush          6
	//   68  127:aload_0         
	//   69  128:getfield        #36  <Field Integer zzamt>
	//   70  131:invokevirtual   #88  <Method int Integer.intValue()>
	//   71  134:invokevirtual   #94  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   72  137:aload_0         
	//   73  138:aload_1         
	//   74  139:invokespecial   #99  <Method void zzbfc.zza(zzbfa)>
	//   75  142:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzamo != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field Integer zzamo>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzamo.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field Integer zzamo>
	//   12   20:invokevirtual   #88  <Method int Integer.intValue()>
	//   13   23:invokestatic    #106 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzamp != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #22  <Field zzis zzamp>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzamp)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #22  <Field zzis zzamp>
	//   25   43:invokestatic    #109 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		int k = j;
	//   28   48:iload_2         
	//   29   49:istore_3        
		if(zzamq != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #24  <Field zzis zzamq>
	//*  32   54:ifnull          68
			k = j + zzbfa.zzb(3, ((zzbfi) (zzamq)));
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #24  <Field zzis zzamq>
	//   37   63:invokestatic    #109 <Method int zzbfa.zzb(int, zzbfi)>
	//   38   66:iadd            
	//   39   67:istore_3        
		i = k;
	//   40   68:iload_3         
	//   41   69:istore_1        
		if(zzamr != null)
	//*  42   70:aload_0         
	//*  43   71:getfield        #26  <Field zzis zzamr>
	//*  44   74:ifnull          88
			i = k + zzbfa.zzb(4, ((zzbfi) (zzamr)));
	//   45   77:iload_3         
	//   46   78:iconst_4        
	//   47   79:aload_0         
	//   48   80:getfield        #26  <Field zzis zzamr>
	//   49   83:invokestatic    #109 <Method int zzbfa.zzb(int, zzbfi)>
	//   50   86:iadd            
	//   51   87:istore_1        
		j = i;
	//   52   88:iload_1         
	//   53   89:istore_2        
		if(zzams != null)
	//*  54   90:aload_0         
	//*  55   91:getfield        #34  <Field zzis[] zzams>
	//*  56   94:ifnull          153
		{
			j = i;
	//   57   97:iload_1         
	//   58   98:istore_2        
			if(zzams.length > 0)
	//*  59   99:aload_0         
	//*  60  100:getfield        #34  <Field zzis[] zzams>
	//*  61  103:arraylength     
	//*  62  104:ifle            153
			{
				int l = 0;
	//   63  107:iconst_0        
	//   64  108:istore_3        
				do
				{
					j = i;
	//   65  109:iload_1         
	//   66  110:istore_2        
					if(l >= zzams.length)
						break;
	//   67  111:iload_3         
	//   68  112:aload_0         
	//   69  113:getfield        #34  <Field zzis[] zzams>
	//   70  116:arraylength     
	//   71  117:icmpge          153
					zzis zzis1 = zzams[l];
	//   72  120:aload_0         
	//   73  121:getfield        #34  <Field zzis[] zzams>
	//   74  124:iload_3         
	//   75  125:aaload          
	//   76  126:astore          4
					j = i;
	//   77  128:iload_1         
	//   78  129:istore_2        
					if(zzis1 != null)
	//*  79  130:aload           4
	//*  80  132:ifnull          144
						j = i + zzbfa.zzb(5, ((zzbfi) (zzis1)));
	//   81  135:iload_1         
	//   82  136:iconst_5        
	//   83  137:aload           4
	//   84  139:invokestatic    #109 <Method int zzbfa.zzb(int, zzbfi)>
	//   85  142:iadd            
	//   86  143:istore_2        
					l++;
	//   87  144:iload_3         
	//   88  145:iconst_1        
	//   89  146:iadd            
	//   90  147:istore_3        
					i = j;
	//   91  148:iload_2         
	//   92  149:istore_1        
				} while(true);
	//   93  150:goto            109
			}
		}
		i = j;
	//   94  153:iload_2         
	//   95  154:istore_1        
		if(zzamt != null)
	//*  96  155:aload_0         
	//*  97  156:getfield        #36  <Field Integer zzamt>
	//*  98  159:ifnull          177
			i = j + zzbfa.zzq(6, zzamt.intValue());
	//   99  162:iload_2         
	//  100  163:bipush          6
	//  101  165:aload_0         
	//  102  166:getfield        #36  <Field Integer zzamt>
	//  103  169:invokevirtual   #88  <Method int Integer.intValue()>
	//  104  172:invokestatic    #106 <Method int zzbfa.zzq(int, int)>
	//  105  175:iadd            
	//  106  176:istore_1        
		return i;
	//  107  177:iload_1         
	//  108  178:ireturn         
	}

	private Integer zzamo;
	private zzis zzamp;
	private zzis zzamq;
	private zzis zzamr;
	private zzis zzams[];
	private Integer zzamt;
}
