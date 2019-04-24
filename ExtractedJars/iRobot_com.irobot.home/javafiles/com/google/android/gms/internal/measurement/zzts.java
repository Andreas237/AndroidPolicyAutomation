// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztq, zzuv, zzuq, zzwf, 
//			zzvv, zzxl, zzte, zztr, 
//			zzub

final class zzts extends zztq
{

	private zzts(byte abyte0[], int i, int j, boolean flag)
	{
		super(((zztr) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void zztq(zztr)>
		zzbuj = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #21  <Int 0x7fffffff>
	//    5    8:putfield        #23  <Field int zzbuj>
		buffer = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #25  <Field byte[] buffer>
		limit = j + i;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:iload_2         
	//   12   19:iadd            
	//   13   20:putfield        #27  <Field int limit>
		pos = i;
	//   14   23:aload_0         
	//   15   24:iload_2         
	//   16   25:putfield        #29  <Field int pos>
		zzbuh = pos;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #29  <Field int pos>
	//   20   33:putfield        #31  <Field int zzbuh>
		zzbuf = flag;
	//   21   36:aload_0         
	//   22   37:iload           4
	//   23   39:putfield        #33  <Field boolean zzbuf>
	//   24   42:return          
	}

	zzts(byte abyte0[], int i, int j, boolean flag, zztr zztr)
	{
		this(abyte0, i, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void zzts(byte[], int, int, boolean)>
	//    6    9:return          
	}

	private final int zzvb()
	{
label0:
		{
			int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
			if(limit == i)
				break label0;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int limit>
	//    5    9:iload_1         
	//    6   10:icmpeq          263
			byte abyte0[] = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field byte[] buffer>
	//    9   17:astore          6
			int j = i + 1;
	//   10   19:iload_1         
	//   11   20:iconst_1        
	//   12   21:iadd            
	//   13   22:istore_2        
			int k = ((int) (abyte0[i]));
	//   14   23:aload           6
	//   15   25:iload_1         
	//   16   26:baload          
	//   17   27:istore_3        
			if(k >= 0)
	//*  18   28:iload_3         
	//*  19   29:iflt            39
			{
				pos = j;
	//   20   32:aload_0         
	//   21   33:iload_2         
	//   22   34:putfield        #29  <Field int pos>
				return k;
	//   23   37:iload_3         
	//   24   38:ireturn         
			}
			if(limit - j < 9)
				break label0;
	//   25   39:aload_0         
	//   26   40:getfield        #27  <Field int limit>
	//   27   43:iload_2         
	//   28   44:isub            
	//   29   45:bipush          9
	//   30   47:icmplt          263
			i = j + 1;
	//   31   50:iload_2         
	//   32   51:iconst_1        
	//   33   52:iadd            
	//   34   53:istore_1        
			k ^= abyte0[j] << 7;
	//   35   54:iload_3         
	//   36   55:aload           6
	//   37   57:iload_2         
	//   38   58:baload          
	//   39   59:bipush          7
	//   40   61:ishl            
	//   41   62:ixor            
	//   42   63:istore_3        
			if(k < 0)
	//*  43   64:iload_3         
	//*  44   65:ifge            76
			{
				j = k ^ 0xffffff80;
	//   45   68:iload_3         
	//   46   69:bipush          -128
	//   47   71:ixor            
	//   48   72:istore_2        
			} else
	//*  49   73:goto            256
			{
				j = i + 1;
	//   50   76:iload_1         
	//   51   77:iconst_1        
	//   52   78:iadd            
	//   53   79:istore_2        
				k ^= abyte0[i] << 14;
	//   54   80:iload_3         
	//   55   81:aload           6
	//   56   83:iload_1         
	//   57   84:baload          
	//   58   85:bipush          14
	//   59   87:ishl            
	//   60   88:ixor            
	//   61   89:istore_3        
				if(k >= 0)
	//*  62   90:iload_3         
	//*  63   91:iflt            107
				{
					k ^= 0x3f80;
	//   64   94:iload_3         
	//   65   95:sipush          16256
	//   66   98:ixor            
	//   67   99:istore_3        
					i = j;
	//   68  100:iload_2         
	//   69  101:istore_1        
					j = k;
	//   70  102:iload_3         
	//   71  103:istore_2        
				} else
	//*  72  104:goto            256
				{
					i = j + 1;
	//   73  107:iload_2         
	//   74  108:iconst_1        
	//   75  109:iadd            
	//   76  110:istore_1        
					j = k ^ abyte0[j] << 21;
	//   77  111:iload_3         
	//   78  112:aload           6
	//   79  114:iload_2         
	//   80  115:baload          
	//   81  116:bipush          21
	//   82  118:ishl            
	//   83  119:ixor            
	//   84  120:istore_2        
					if(j < 0)
	//*  85  121:iload_2         
	//*  86  122:ifge            133
					{
						j ^= 0xffe03f80;
	//   87  125:iload_2         
	//   88  126:ldc1            #40  <Int 0xffe03f80>
	//   89  128:ixor            
	//   90  129:istore_2        
					} else
	//*  91  130:goto            256
					{
						int i1 = i + 1;
	//   92  133:iload_1         
	//   93  134:iconst_1        
	//   94  135:iadd            
	//   95  136:istore          4
						byte byte0 = abyte0[i];
	//   96  138:aload           6
	//   97  140:iload_1         
	//   98  141:baload          
	//   99  142:istore          5
						int l = j ^ byte0 << 28 ^ 0xfe03f80;
	//  100  144:iload_2         
	//  101  145:iload           5
	//  102  147:bipush          28
	//  103  149:ishl            
	//  104  150:ixor            
	//  105  151:ldc1            #41  <Int 0xfe03f80>
	//  106  153:ixor            
	//  107  154:istore_3        
						j = l;
	//  108  155:iload_3         
	//  109  156:istore_2        
						i = i1;
	//  110  157:iload           4
	//  111  159:istore_1        
						if(byte0 < 0)
	//* 112  160:iload           5
	//* 113  162:ifge            104
						{
							int l1 = i1 + 1;
	//  114  165:iload           4
	//  115  167:iconst_1        
	//  116  168:iadd            
	//  117  169:istore          5
							j = l;
	//  118  171:iload_3         
	//  119  172:istore_2        
							i = l1;
	//  120  173:iload           5
	//  121  175:istore_1        
							if(abyte0[i1] < 0)
	//* 122  176:aload           6
	//* 123  178:iload           4
	//* 124  180:baload          
	//* 125  181:ifge            256
							{
								int j1 = l1 + 1;
	//  126  184:iload           5
	//  127  186:iconst_1        
	//  128  187:iadd            
	//  129  188:istore          4
								j = l;
	//  130  190:iload_3         
	//  131  191:istore_2        
								i = j1;
	//  132  192:iload           4
	//  133  194:istore_1        
								if(abyte0[l1] < 0)
	//* 134  195:aload           6
	//* 135  197:iload           5
	//* 136  199:baload          
	//* 137  200:ifge            104
								{
									int i2 = j1 + 1;
	//  138  203:iload           4
	//  139  205:iconst_1        
	//  140  206:iadd            
	//  141  207:istore          5
									j = l;
	//  142  209:iload_3         
	//  143  210:istore_2        
									i = i2;
	//  144  211:iload           5
	//  145  213:istore_1        
									if(abyte0[j1] < 0)
	//* 146  214:aload           6
	//* 147  216:iload           4
	//* 148  218:baload          
	//* 149  219:ifge            256
									{
										int k1 = i2 + 1;
	//  150  222:iload           5
	//  151  224:iconst_1        
	//  152  225:iadd            
	//  153  226:istore          4
										j = l;
	//  154  228:iload_3         
	//  155  229:istore_2        
										i = k1;
	//  156  230:iload           4
	//  157  232:istore_1        
										if(abyte0[i2] < 0)
	//* 158  233:aload           6
	//* 159  235:iload           5
	//* 160  237:baload          
	//* 161  238:ifge            104
										{
											i = k1 + 1;
	//  162  241:iload           4
	//  163  243:iconst_1        
	//  164  244:iadd            
	//  165  245:istore_1        
											if(abyte0[k1] < 0)
												break label0;
	//  166  246:aload           6
	//  167  248:iload           4
	//  168  250:baload          
	//  169  251:iflt            263
											j = l;
	//  170  254:iload_3         
	//  171  255:istore_2        
										}
									}
								}
							}
						}
					}
				}
			}
			pos = i;
	//  172  256:aload_0         
	//  173  257:iload_1         
	//  174  258:putfield        #29  <Field int pos>
			return j;
	//  175  261:iload_2         
	//  176  262:ireturn         
		}
		return (int)((zztq)this).zzuy();
	//  177  263:aload_0         
	//  178  264:invokevirtual   #45  <Method long zztq.zzuy()>
	//  179  267:l2i             
	//  180  268:ireturn         
	}

	private final long zzvc()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit == i) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int limit>
	//    5    9:iload_1         
	//    6   10:icmpeq          343
_L1:
		int j;
		int k;
		byte abyte0[];
		abyte0 = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field byte[] buffer>
	//    9   17:astore          8
		j = i + 1;
	//   10   19:iload_1         
	//   11   20:iconst_1        
	//   12   21:iadd            
	//   13   22:istore_2        
		k = ((int) (abyte0[i]));
	//   14   23:aload           8
	//   15   25:iload_1         
	//   16   26:baload          
	//   17   27:istore_3        
		if(k >= 0)
	//*  18   28:iload_3         
	//*  19   29:iflt            40
		{
			pos = j;
	//   20   32:aload_0         
	//   21   33:iload_2         
	//   22   34:putfield        #29  <Field int pos>
			return (long)k;
	//   23   37:iload_3         
	//   24   38:i2l             
	//   25   39:lreturn         
		}
		if(limit - j < 9) goto _L2; else goto _L3
	//   26   40:aload_0         
	//   27   41:getfield        #27  <Field int limit>
	//   28   44:iload_2         
	//   29   45:isub            
	//   30   46:bipush          9
	//   31   48:icmplt          343
_L3:
		i = j + 1;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore_1        
		k ^= abyte0[j] << 7;
	//   36   55:iload_3         
	//   37   56:aload           8
	//   38   58:iload_2         
	//   39   59:baload          
	//   40   60:bipush          7
	//   41   62:ishl            
	//   42   63:ixor            
	//   43   64:istore_3        
		if(k >= 0) goto _L5; else goto _L4
	//   44   65:iload_3         
	//   45   66:ifge            81
_L4:
		j = k ^ 0xffffff80;
	//   46   69:iload_3         
	//   47   70:bipush          -128
	//   48   72:ixor            
	//   49   73:istore_2        
_L10:
		long l = j;
	//   50   74:iload_2         
	//   51   75:i2l             
	//   52   76:lstore          4
		  goto _L6
	//*  53   78:goto            335
_L5:
		j = i + 1;
	//   54   81:iload_1         
	//   55   82:iconst_1        
	//   56   83:iadd            
	//   57   84:istore_2        
		k ^= abyte0[i] << 14;
	//   58   85:iload_3         
	//   59   86:aload           8
	//   60   88:iload_1         
	//   61   89:baload          
	//   62   90:bipush          14
	//   63   92:ishl            
	//   64   93:ixor            
	//   65   94:istore_3        
		if(k < 0) goto _L8; else goto _L7
	//   66   95:iload_3         
	//   67   96:iflt            112
_L7:
		l = k ^ 0x3f80;
	//   68   99:iload_3         
	//   69  100:sipush          16256
	//   70  103:ixor            
	//   71  104:i2l             
	//   72  105:lstore          4
		i = j;
	//   73  107:iload_2         
	//   74  108:istore_1        
		  goto _L6
	//*  75  109:goto            335
_L8:
		i = j + 1;
	//   76  112:iload_2         
	//   77  113:iconst_1        
	//   78  114:iadd            
	//   79  115:istore_1        
		j = k ^ abyte0[j] << 21;
	//   80  116:iload_3         
	//   81  117:aload           8
	//   82  119:iload_2         
	//   83  120:baload          
	//   84  121:bipush          21
	//   85  123:ishl            
	//   86  124:ixor            
	//   87  125:istore_2        
		if(j >= 0)
			break; /* Loop/switch isn't completed */
	//   88  126:iload_2         
	//   89  127:ifge            138
		j ^= 0xffe03f80;
	//   90  130:iload_2         
	//   91  131:ldc1            #40  <Int 0xffe03f80>
	//   92  133:ixor            
	//   93  134:istore_2        
		if(true) goto _L10; else goto _L9
	//   94  135:goto            74
_L9:
		l = j;
	//   95  138:iload_2         
	//   96  139:i2l             
	//   97  140:lstore          4
		j = i + 1;
	//   98  142:iload_1         
	//   99  143:iconst_1        
	//  100  144:iadd            
	//  101  145:istore_2        
		l = (long)abyte0[i] << 28 ^ l;
	//  102  146:aload           8
	//  103  148:iload_1         
	//  104  149:baload          
	//  105  150:i2l             
	//  106  151:bipush          28
	//  107  153:lshl            
	//  108  154:lload           4
	//  109  156:lxor            
	//  110  157:lstore          4
		if(l < 0L) goto _L12; else goto _L11
	//  111  159:lload           4
	//  112  161:lconst_0        
	//  113  162:lcmp            
	//  114  163:iflt            183
_L11:
		long l1;
		l1 = 0xfe03f80L;
	//  115  166:ldc2w           #47  <Long 0xfe03f80L>
	//  116  169:lstore          6
		i = j;
	//  117  171:iload_2         
	//  118  172:istore_1        
_L20:
		l ^= l1;
	//  119  173:lload           4
	//  120  175:lload           6
	//  121  177:lxor            
	//  122  178:lstore          4
		  goto _L6
	//* 123  180:goto            335
_L12:
		i = j + 1;
	//  124  183:iload_2         
	//  125  184:iconst_1        
	//  126  185:iadd            
	//  127  186:istore_1        
		l1 = l ^ (long)abyte0[j] << 35;
	//  128  187:lload           4
	//  129  189:aload           8
	//  130  191:iload_2         
	//  131  192:baload          
	//  132  193:i2l             
	//  133  194:bipush          35
	//  134  196:lshl            
	//  135  197:lxor            
	//  136  198:lstore          6
		if(l1 >= 0L) goto _L14; else goto _L13
	//  137  200:lload           6
	//  138  202:lconst_0        
	//  139  203:lcmp            
	//  140  204:ifge            222
_L13:
		l = 0xfe03f80L;
	//  141  207:ldc2w           #49  <Long 0xfe03f80L>
	//  142  210:lstore          4
_L16:
		l ^= l1;
	//  143  212:lload           4
	//  144  214:lload           6
	//  145  216:lxor            
	//  146  217:lstore          4
		  goto _L6
	//* 147  219:goto            335
_L14:
		j = i + 1;
	//  148  222:iload_1         
	//  149  223:iconst_1        
	//  150  224:iadd            
	//  151  225:istore_2        
		l = l1 ^ (long)abyte0[i] << 42;
	//  152  226:lload           6
	//  153  228:aload           8
	//  154  230:iload_1         
	//  155  231:baload          
	//  156  232:i2l             
	//  157  233:bipush          42
	//  158  235:lshl            
	//  159  236:lxor            
	//  160  237:lstore          4
		if(l >= 0L)
	//* 161  239:lload           4
	//* 162  241:lconst_0        
	//* 163  242:lcmp            
	//* 164  243:iflt            256
		{
			l1 = 0xfe03f80L;
	//  165  246:ldc2w           #51  <Long 0xfe03f80L>
	//  166  249:lstore          6
			i = j;
	//  167  251:iload_2         
	//  168  252:istore_1        
			continue; /* Loop/switch isn't completed */
	//  169  253:goto            173
		}
		i = j + 1;
	//  170  256:iload_2         
	//  171  257:iconst_1        
	//  172  258:iadd            
	//  173  259:istore_1        
		l1 = l ^ (long)abyte0[j] << 49;
	//  174  260:lload           4
	//  175  262:aload           8
	//  176  264:iload_2         
	//  177  265:baload          
	//  178  266:i2l             
	//  179  267:bipush          49
	//  180  269:lshl            
	//  181  270:lxor            
	//  182  271:lstore          6
		if(l1 >= 0L)
			break; /* Loop/switch isn't completed */
	//  183  273:lload           6
	//  184  275:lconst_0        
	//  185  276:lcmp            
	//  186  277:ifge            288
		l = 0xfe03f80L;
	//  187  280:ldc2w           #53  <Long 0xfe03f80L>
	//  188  283:lstore          4
		if(true) goto _L16; else goto _L15
	//  189  285:goto            212
_L15:
		j = i + 1;
	//  190  288:iload_1         
	//  191  289:iconst_1        
	//  192  290:iadd            
	//  193  291:istore_2        
		l = l1 ^ (long)abyte0[i] << 56 ^ 0xfe03f80L;
	//  194  292:lload           6
	//  195  294:aload           8
	//  196  296:iload_1         
	//  197  297:baload          
	//  198  298:i2l             
	//  199  299:bipush          56
	//  200  301:lshl            
	//  201  302:lxor            
	//  202  303:ldc2w           #55  <Long 0xfe03f80L>
	//  203  306:lxor            
	//  204  307:lstore          4
		if(l >= 0L) goto _L18; else goto _L17
	//  205  309:lload           4
	//  206  311:lconst_0        
	//  207  312:lcmp            
	//  208  313:ifge            333
_L17:
		i = j + 1;
	//  209  316:iload_2         
	//  210  317:iconst_1        
	//  211  318:iadd            
	//  212  319:istore_1        
		if((long)abyte0[j] < 0L) goto _L2; else goto _L6
	//  213  320:aload           8
	//  214  322:iload_2         
	//  215  323:baload          
	//  216  324:i2l             
	//  217  325:lconst_0        
	//  218  326:lcmp            
	//  219  327:iflt            343
	//* 220  330:goto            219
_L18:
		i = j;
	//  221  333:iload_2         
	//  222  334:istore_1        
_L6:
		pos = i;
	//  223  335:aload_0         
	//  224  336:iload_1         
	//  225  337:putfield        #29  <Field int pos>
		return l;
	//  226  340:lload           4
	//  227  342:lreturn         
_L2:
		return ((zztq)this).zzuy();
	//  228  343:aload_0         
	//  229  344:invokevirtual   #45  <Method long zztq.zzuy()>
	//  230  347:lreturn         
		if(true) goto _L20; else goto _L19
_L19:
	}

	private final int zzvd()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit - i < 4)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:iconst_4        
	//*   8   12:icmpge          19
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//    9   15:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   10   18:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field byte[] buffer>
	//   13   23:astore          5
			pos = i + 4;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iconst_4        
	//   17   28:iadd            
	//   18   29:putfield        #29  <Field int pos>
			byte byte0 = abyte0[i];
	//   19   32:aload           5
	//   20   34:iload_1         
	//   21   35:baload          
	//   22   36:istore_2        
			byte byte1 = abyte0[i + 1];
	//   23   37:aload           5
	//   24   39:iload_1         
	//   25   40:iconst_1        
	//   26   41:iadd            
	//   27   42:baload          
	//   28   43:istore_3        
			byte byte2 = abyte0[i + 2];
	//   29   44:aload           5
	//   30   46:iload_1         
	//   31   47:iconst_2        
	//   32   48:iadd            
	//   33   49:baload          
	//   34   50:istore          4
			return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
	//   35   52:aload           5
	//   36   54:iload_1         
	//   37   55:iconst_3        
	//   38   56:iadd            
	//   39   57:baload          
	//   40   58:sipush          255
	//   41   61:iand            
	//   42   62:bipush          24
	//   43   64:ishl            
	//   44   65:iload_2         
	//   45   66:sipush          255
	//   46   69:iand            
	//   47   70:iload_3         
	//   48   71:sipush          255
	//   49   74:iand            
	//   50   75:bipush          8
	//   51   77:ishl            
	//   52   78:ior             
	//   53   79:iload           4
	//   54   81:sipush          255
	//   55   84:iand            
	//   56   85:bipush          16
	//   57   87:ishl            
	//   58   88:ior             
	//   59   89:ior             
	//   60   90:ireturn         
		}
	}

	private final long zzve()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit - i < 8)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:bipush          8
	//*   8   13:icmpge          20
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//    9   16:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   10   19:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//   11   20:aload_0         
	//   12   21:getfield        #25  <Field byte[] buffer>
	//   13   24:astore          16
			pos = i + 8;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:bipush          8
	//   17   30:iadd            
	//   18   31:putfield        #29  <Field int pos>
			long l = abyte0[i];
	//   19   34:aload           16
	//   20   36:iload_1         
	//   21   37:baload          
	//   22   38:i2l             
	//   23   39:lstore_2        
			long l1 = abyte0[i + 1];
	//   24   40:aload           16
	//   25   42:iload_1         
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:baload          
	//   29   46:i2l             
	//   30   47:lstore          4
			long l2 = abyte0[i + 2];
	//   31   49:aload           16
	//   32   51:iload_1         
	//   33   52:iconst_2        
	//   34   53:iadd            
	//   35   54:baload          
	//   36   55:i2l             
	//   37   56:lstore          6
			long l3 = abyte0[i + 3];
	//   38   58:aload           16
	//   39   60:iload_1         
	//   40   61:iconst_3        
	//   41   62:iadd            
	//   42   63:baload          
	//   43   64:i2l             
	//   44   65:lstore          8
			long l4 = abyte0[i + 4];
	//   45   67:aload           16
	//   46   69:iload_1         
	//   47   70:iconst_4        
	//   48   71:iadd            
	//   49   72:baload          
	//   50   73:i2l             
	//   51   74:lstore          10
			long l5 = abyte0[i + 5];
	//   52   76:aload           16
	//   53   78:iload_1         
	//   54   79:iconst_5        
	//   55   80:iadd            
	//   56   81:baload          
	//   57   82:i2l             
	//   58   83:lstore          12
			long l6 = abyte0[i + 6];
	//   59   85:aload           16
	//   60   87:iload_1         
	//   61   88:bipush          6
	//   62   90:iadd            
	//   63   91:baload          
	//   64   92:i2l             
	//   65   93:lstore          14
			return ((long)abyte0[i + 7] & 255L) << 56 | (l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
	//   66   95:aload           16
	//   67   97:iload_1         
	//   68   98:bipush          7
	//   69  100:iadd            
	//   70  101:baload          
	//   71  102:i2l             
	//   72  103:ldc2w           #65  <Long 255L>
	//   73  106:land            
	//   74  107:bipush          56
	//   75  109:lshl            
	//   76  110:lload_2         
	//   77  111:ldc2w           #65  <Long 255L>
	//   78  114:land            
	//   79  115:lload           4
	//   80  117:ldc2w           #65  <Long 255L>
	//   81  120:land            
	//   82  121:bipush          8
	//   83  123:lshl            
	//   84  124:lor             
	//   85  125:lload           6
	//   86  127:ldc2w           #65  <Long 255L>
	//   87  130:land            
	//   88  131:bipush          16
	//   89  133:lshl            
	//   90  134:lor             
	//   91  135:lload           8
	//   92  137:ldc2w           #65  <Long 255L>
	//   93  140:land            
	//   94  141:bipush          24
	//   95  143:lshl            
	//   96  144:lor             
	//   97  145:lload           10
	//   98  147:ldc2w           #65  <Long 255L>
	//   99  150:land            
	//  100  151:bipush          32
	//  101  153:lshl            
	//  102  154:lor             
	//  103  155:lload           12
	//  104  157:ldc2w           #65  <Long 255L>
	//  105  160:land            
	//  106  161:bipush          40
	//  107  163:lshl            
	//  108  164:lor             
	//  109  165:lload           14
	//  110  167:ldc2w           #65  <Long 255L>
	//  111  170:land            
	//  112  171:bipush          48
	//  113  173:lshl            
	//  114  174:lor             
	//  115  175:lor             
	//  116  176:lreturn         
		}
	}

	private final void zzvf()
	{
		limit = limit + zzbug;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int limit>
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field int zzbug>
	//    5    9:iadd            
	//    6   10:putfield        #27  <Field int limit>
		int i = limit - zzbuh;
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int limit>
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field int zzbuh>
	//   11   21:isub            
	//   12   22:istore_1        
		if(i > zzbuj)
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #23  <Field int zzbuj>
	//*  16   28:icmple          55
		{
			zzbug = i - zzbuj;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field int zzbuj>
	//   21   37:isub            
	//   22   38:putfield        #70  <Field int zzbug>
			limit = limit - zzbug;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #27  <Field int limit>
	//   26   46:aload_0         
	//   27   47:getfield        #70  <Field int zzbug>
	//   28   50:isub            
	//   29   51:putfield        #27  <Field int limit>
			return;
	//   30   54:return          
		} else
		{
			zzbug = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #70  <Field int zzbug>
			return;
	//   34   60:return          
		}
	}

	private final byte zzvg()
	{
		if(pos == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field int limit>
	//*   4    8:icmpne          15
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//    5   11:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = pos;
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field int pos>
	//   12   24:istore_1        
			pos = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #29  <Field int pos>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	public final double readDouble()
	{
		return Double.longBitsToDouble(zzve());
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method long zzve()>
	//    2    4:invokestatic    #82  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public final float readFloat()
	{
		return Float.intBitsToFloat(zzvd());
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method int zzvd()>
	//    2    4:invokestatic    #92  <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public final String readString()
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            54
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          54
		{
			String s = new String(buffer, pos, i, zzuq.UTF_8);
	//   12   22:new             #98  <Class String>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field byte[] buffer>
	//   16   30:aload_0         
	//   17   31:getfield        #29  <Field int pos>
	//   18   34:iload_1         
	//   19   35:getstatic       #104 <Field java.nio.charset.Charset zzuq.UTF_8>
	//   20   38:invokespecial   #107 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   21   41:astore_2        
			pos = pos + i;
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #29  <Field int pos>
	//   25   47:iload_1         
	//   26   48:iadd            
	//   27   49:putfield        #29  <Field int pos>
			return s;
	//   28   52:aload_2         
	//   29   53:areturn         
		}
		if(i == 0)
	//*  30   54:iload_1         
	//*  31   55:ifne            61
			return "";
	//   32   58:ldc1            #109 <String "">
	//   33   60:areturn         
		if(i < 0)
	//*  34   61:iload_1         
	//*  35   62:ifge            69
			throw com.google.android.gms.internal.measurement.zzuv.zzwr();
	//   36   65:invokestatic    #112 <Method zzuv zzuv.zzwr()>
	//   37   68:athrow          
		else
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//   38   69:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   39   72:athrow          
	}

	public final zzvv zza(zzwf zzwf1, zzub zzub)
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:istore_3        
		if(zzbua >= zzbub)
	//*   3    5:aload_0         
	//*   4    6:getfield        #117 <Field int zzbua>
	//*   5    9:aload_0         
	//*   6   10:getfield        #120 <Field int zzbub>
	//*   7   13:icmplt          20
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwv();
	//    8   16:invokestatic    #123 <Method zzuv zzuv.zzwv()>
	//    9   19:athrow          
		} else
		{
			i = ((zztq)this).zzas(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #127 <Method int zztq.zzas(int)>
	//   13   25:istore_3        
			zzbua = zzbua + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #117 <Field int zzbua>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #117 <Field int zzbua>
			zzwf1 = ((zzwf) ((zzvv)zzwf1.zza(((zztq) (this)), zzub)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #132 <Method Object zzwf.zza(zztq, zzub)>
	//   24   44:checkcast       #134 <Class zzvv>
	//   25   47:astore_1        
			((zztq)this).zzap(0);
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #138 <Method void zztq.zzap(int)>
			zzbua = zzbua - 1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #117 <Field int zzbua>
	//   32   58:iconst_1        
	//   33   59:isub            
	//   34   60:putfield        #117 <Field int zzbua>
			((zztq)this).zzat(i);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #141 <Method void zztq.zzat(int)>
			return ((zzvv) (zzwf1));
	//   38   68:aload_1         
	//   39   69:areturn         
		}
	}

	public final void zzap(int i)
	{
		if(zzbui != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field int zzbui>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw com.google.android.gms.internal.measurement.zzuv.zzwt();
	//    4    8:invokestatic    #148 <Method zzuv zzuv.zzwt()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public final boolean zzaq(int i)
	{
label0:
		{
label1:
			{
				boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
				int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
				switch(i & 7)
	//*   4    4:iload_1         
	//*   5    5:bipush          7
	//*   6    7:iand            
				{
	//*   7    8:tableswitch     0 5: default 48
	//	               0 109
	//	               1 101
	//	               2 91
	//	               3 61
	//	               4 59
	//	               5 52
				default:
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//    8   48:invokestatic    #154 <Method zzuw zzuv.zzwu()>
	//    9   51:athrow          

				case 5: // '\005'
					((zztq)this).zzau(4);
	//   10   52:aload_0         
	//   11   53:iconst_4        
	//   12   54:invokevirtual   #157 <Method void zztq.zzau(int)>
					return true;
	//   13   57:iconst_1        
	//   14   58:ireturn         

				case 4: // '\004'
					return false;
	//   15   59:iconst_0        
	//   16   60:ireturn         

				case 3: // '\003'
					do
						j = ((zztq)this).zzuj();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #160 <Method int zztq.zzuj()>
	//   19   65:istore_2        
					while(j != 0 && ((zztq)this).zzaq(j));
	//   20   66:iload_2         
	//   21   67:ifeq            78
	//   22   70:aload_0         
	//   23   71:iload_2         
	//   24   72:invokevirtual   #162 <Method boolean zztq.zzaq(int)>
	//   25   75:ifne            61
					((zztq)this).zzap((i >>> 3) << 3 | 4);
	//   26   78:aload_0         
	//   27   79:iload_1         
	//   28   80:iconst_3        
	//   29   81:iushr           
	//   30   82:iconst_3        
	//   31   83:ishl            
	//   32   84:iconst_4        
	//   33   85:ior             
	//   34   86:invokevirtual   #138 <Method void zztq.zzap(int)>
					return true;
	//   35   89:iconst_1        
	//   36   90:ireturn         

				case 2: // '\002'
					((zztq)this).zzau(zzvb());
	//   37   91:aload_0         
	//   38   92:aload_0         
	//   39   93:invokespecial   #96  <Method int zzvb()>
	//   40   96:invokevirtual   #157 <Method void zztq.zzau(int)>
					return true;
	//   41   99:iconst_1        
	//   42  100:ireturn         

				case 1: // '\001'
					((zztq)this).zzau(8);
	//   43  101:aload_0         
	//   44  102:bipush          8
	//   45  104:invokevirtual   #157 <Method void zztq.zzau(int)>
					return true;
	//   46  107:iconst_1        
	//   47  108:ireturn         

				case 0: // '\0'
					i = ((int) (flag));
	//   48  109:iload_3         
	//   49  110:istore_1        
					break;
				}
				if(limit - pos >= 10)
	//*  50  111:aload_0         
	//*  51  112:getfield        #27  <Field int limit>
	//*  52  115:aload_0         
	//*  53  116:getfield        #29  <Field int pos>
	//*  54  119:isub            
	//*  55  120:bipush          10
	//*  56  122:icmplt          169
				{
					for(i = j; i < 10; i++)
	//*  57  125:iload_2         
	//*  58  126:istore_1        
	//*  59  127:iload_1         
	//*  60  128:bipush          10
	//*  61  130:icmpge          165
					{
						byte abyte0[] = buffer;
	//   62  133:aload_0         
	//   63  134:getfield        #25  <Field byte[] buffer>
	//   64  137:astore          4
						int k = pos;
	//   65  139:aload_0         
	//   66  140:getfield        #29  <Field int pos>
	//   67  143:istore_2        
						pos = k + 1;
	//   68  144:aload_0         
	//   69  145:iload_2         
	//   70  146:iconst_1        
	//   71  147:iadd            
	//   72  148:putfield        #29  <Field int pos>
						if(abyte0[k] >= 0)
							break label1;
	//   73  151:aload           4
	//   74  153:iload_2         
	//   75  154:baload          
	//   76  155:ifge            189
					}

	//   77  158:iload_1         
	//   78  159:iconst_1        
	//   79  160:iadd            
	//   80  161:istore_1        
	//*  81  162:goto            127
					throw com.google.android.gms.internal.measurement.zzuv.zzws();
	//   82  165:invokestatic    #165 <Method zzuv zzuv.zzws()>
	//   83  168:athrow          
				}
				do
				{
					if(i >= 10)
						break label0;
	//   84  169:iload_1         
	//   85  170:bipush          10
	//   86  172:icmpge          191
					if(zzvg() >= 0)
						break;
	//   87  175:aload_0         
	//   88  176:invokespecial   #167 <Method byte zzvg()>
	//   89  179:ifge            189
					i++;
	//   90  182:iload_1         
	//   91  183:iconst_1        
	//   92  184:iadd            
	//   93  185:istore_1        
				} while(true);
	//   94  186:goto            169
			}
			return true;
	//   95  189:iconst_1        
	//   96  190:ireturn         
		}
		throw com.google.android.gms.internal.measurement.zzuv.zzws();
	//   97  191:invokestatic    #165 <Method zzuv zzuv.zzws()>
	//   98  194:athrow          
	}

	public final int zzas(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw com.google.android.gms.internal.measurement.zzuv.zzwr();
	//    2    4:invokestatic    #112 <Method zzuv zzuv.zzwr()>
	//    3    7:athrow          
		i += ((zztq)this).zzva();
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #170 <Method int zztq.zzva()>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzbuj;
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field int zzbuj>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//   15   25:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   16   28:athrow          
		} else
		{
			zzbuj = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #23  <Field int zzbuj>
			zzvf();
	//   20   34:aload_0         
	//   21   35:invokespecial   #172 <Method void zzvf()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public final void zzat(int i)
	{
		zzbuj = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int zzbuj>
		zzvf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #172 <Method void zzvf()>
	//    5    9:return          
	}

	public final void zzau(int i)
	{
		if(i >= 0 && i <= limit - pos)
	//*   0    0:iload_1         
	//*   1    1:iflt            28
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int limit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int pos>
	//*   7   13:isub            
	//*   8   14:icmpgt          28
		{
			pos = pos + i;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field int pos>
	//   12   22:iload_1         
	//   13   23:iadd            
	//   14   24:putfield        #29  <Field int pos>
			return;
	//   15   27:return          
		}
		if(i < 0)
	//*  16   28:iload_1         
	//*  17   29:ifge            36
			throw com.google.android.gms.internal.measurement.zzuv.zzwr();
	//   18   32:invokestatic    #112 <Method zzuv zzuv.zzwr()>
	//   19   35:athrow          
		else
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//   20   36:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   21   39:athrow          
	}

	public final int zzuj()
	{
		if(((zztq)this).zzuz())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #176 <Method boolean zztq.zzuz()>
	//*   2    4:ifeq            14
		{
			zzbui = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #145 <Field int zzbui>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		zzbui = zzvb();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #96  <Method int zzvb()>
	//   11   19:putfield        #145 <Field int zzbui>
		if(zzbui >>> 3 == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #145 <Field int zzbui>
	//*  14   26:iconst_3        
	//*  15   27:iushr           
	//*  16   28:ifne            41
			throw new zzuv("Protocol message contained an invalid tag (zero).");
	//   17   31:new             #59  <Class zzuv>
	//   18   34:dup             
	//   19   35:ldc1            #178 <String "Protocol message contained an invalid tag (zero).">
	//   20   37:invokespecial   #181 <Method void zzuv(String)>
	//   21   40:athrow          
		else
			return zzbui;
	//   22   41:aload_0         
	//   23   42:getfield        #145 <Field int zzbui>
	//   24   45:ireturn         
	}

	public final long zzuk()
	{
		return zzvc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method long zzvc()>
	//    2    4:lreturn         
	}

	public final long zzul()
	{
		return zzvc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method long zzvc()>
	//    2    4:lreturn         
	}

	public final int zzum()
	{
		return zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:ireturn         
	}

	public final long zzun()
	{
		return zzve();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method long zzve()>
	//    2    4:lreturn         
	}

	public final int zzuo()
	{
		return zzvd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method int zzvd()>
	//    2    4:ireturn         
	}

	public final boolean zzup()
	{
		return zzvc() != 0L;
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method long zzvc()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final String zzuq()
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            47
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          47
		{
			String s = zzxl.zzh(buffer, pos, i);
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field byte[] buffer>
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field int pos>
	//   16   30:iload_1         
	//   17   31:invokestatic    #196 <Method String zzxl.zzh(byte[], int, int)>
	//   18   34:astore_2        
			pos = pos + i;
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #29  <Field int pos>
	//   22   40:iload_1         
	//   23   41:iadd            
	//   24   42:putfield        #29  <Field int pos>
			return s;
	//   25   45:aload_2         
	//   26   46:areturn         
		}
		if(i == 0)
	//*  27   47:iload_1         
	//*  28   48:ifne            54
			return "";
	//   29   51:ldc1            #109 <String "">
	//   30   53:areturn         
		if(i <= 0)
	//*  31   54:iload_1         
	//*  32   55:ifgt            62
			throw com.google.android.gms.internal.measurement.zzuv.zzwr();
	//   33   58:invokestatic    #112 <Method zzuv zzuv.zzwr()>
	//   34   61:athrow          
		else
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//   35   62:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   36   65:athrow          
	}

	public final zzte zzur()
	{
label0:
		{
label1:
			{
				int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:istore_1        
				if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            47
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          47
				{
					zzte zzte1 = zzte.zzb(buffer, pos, i);
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field byte[] buffer>
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field int pos>
	//   16   30:iload_1         
	//   17   31:invokestatic    #204 <Method zzte zzte.zzb(byte[], int, int)>
	//   18   34:astore_3        
					pos = pos + i;
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #29  <Field int pos>
	//   22   40:iload_1         
	//   23   41:iadd            
	//   24   42:putfield        #29  <Field int pos>
					return zzte1;
	//   25   45:aload_3         
	//   26   46:areturn         
				}
				if(i == 0)
	//*  27   47:iload_1         
	//*  28   48:ifne            55
					return zzte.zzbts;
	//   29   51:getstatic       #208 <Field zzte zzte.zzbts>
	//   30   54:areturn         
				byte abyte0[];
				if(i > 0 && i <= limit - pos)
	//*  31   55:iload_1         
	//*  32   56:ifle            103
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:getfield        #27  <Field int limit>
	//*  36   64:aload_0         
	//*  37   65:getfield        #29  <Field int pos>
	//*  38   68:isub            
	//*  39   69:icmpgt          103
				{
					int j = pos;
	//   40   72:aload_0         
	//   41   73:getfield        #29  <Field int pos>
	//   42   76:istore_2        
					pos = pos + i;
	//   43   77:aload_0         
	//   44   78:aload_0         
	//   45   79:getfield        #29  <Field int pos>
	//   46   82:iload_1         
	//   47   83:iadd            
	//   48   84:putfield        #29  <Field int pos>
					abyte0 = Arrays.copyOfRange(buffer, j, pos);
	//   49   87:aload_0         
	//   50   88:getfield        #25  <Field byte[] buffer>
	//   51   91:iload_2         
	//   52   92:aload_0         
	//   53   93:getfield        #29  <Field int pos>
	//   54   96:invokestatic    #214 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   55   99:astore_3        
				} else
	//*  56  100:goto            115
				{
					if(i > 0)
						break label0;
	//   57  103:iload_1         
	//   58  104:ifgt            124
					if(i != 0)
						break label1;
	//   59  107:iload_1         
	//   60  108:ifne            120
					abyte0 = zzuq.zzbzc;
	//   61  111:getstatic       #217 <Field byte[] zzuq.zzbzc>
	//   62  114:astore_3        
				}
				return zzte.zzi(abyte0);
	//   63  115:aload_3         
	//   64  116:invokestatic    #221 <Method zzte zzte.zzi(byte[])>
	//   65  119:areturn         
			}
			throw com.google.android.gms.internal.measurement.zzuv.zzwr();
	//   66  120:invokestatic    #112 <Method zzuv zzuv.zzwr()>
	//   67  123:athrow          
		}
		throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//   68  124:invokestatic    #63  <Method zzuv zzuv.zzwq()>
	//   69  127:athrow          
	}

	public final int zzus()
	{
		return zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:ireturn         
	}

	public final int zzut()
	{
		return zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:ireturn         
	}

	public final int zzuu()
	{
		return zzvd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method int zzvd()>
	//    2    4:ireturn         
	}

	public final long zzuv()
	{
		return zzve();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method long zzve()>
	//    2    4:lreturn         
	}

	public final int zzuw()
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method int zzvb()>
	//    2    4:istore_1        
		return -(i & 1) ^ i >>> 1;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:iand            
	//    6    8:ineg            
	//    7    9:iload_1         
	//    8   10:iconst_1        
	//    9   11:iushr           
	//   10   12:ixor            
	//   11   13:ireturn         
	}

	public final long zzux()
	{
		long l = zzvc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method long zzvc()>
	//    2    4:lstore_1        
		return -(l & 1L) ^ l >>> 1;
	//    3    5:lload_1         
	//    4    6:lconst_1        
	//    5    7:land            
	//    6    8:lneg            
	//    7    9:lload_1         
	//    8   10:iconst_1        
	//    9   11:lushr           
	//   10   12:lxor            
	//   11   13:lreturn         
	}

	final long zzuy()
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		for(int i = 0; i < 64; i += 7)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = zzvg();
	//    7   10:aload_0         
	//    8   11:invokespecial   #167 <Method byte zzvg()>
	//    9   14:istore_2        
			l |= (long)(byte0 & 0x7f) << i;
	//   10   15:lload_3         
	//   11   16:iload_2         
	//   12   17:bipush          127
	//   13   19:iand            
	//   14   20:i2l             
	//   15   21:iload_1         
	//   16   22:lshl            
	//   17   23:lor             
	//   18   24:lstore_3        
			if((byte0 & 0x80) == 0)
	//*  19   25:iload_2         
	//*  20   26:sipush          128
	//*  21   29:iand            
	//*  22   30:ifne            35
				return l;
	//   23   33:lload_3         
	//   24   34:lreturn         
		}

	//   25   35:iload_1         
	//   26   36:bipush          7
	//   27   38:iadd            
	//   28   39:istore_1        
	//*  29   40:goto            4
		throw com.google.android.gms.internal.measurement.zzuv.zzws();
	//   30   43:invokestatic    #165 <Method zzuv zzuv.zzws()>
	//   31   46:athrow          
	}

	public final boolean zzuz()
	{
		return pos == limit;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int limit>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final int zzva()
	{
		return pos - zzbuh;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int zzbuh>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private final byte buffer[];
	private int limit;
	private int pos;
	private final boolean zzbuf;
	private int zzbug;
	private int zzbuh;
	private int zzbui;
	private int zzbuj;
}
