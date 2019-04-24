// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbaq, zzbbu, zzbbq, zzbem, 
//			zzbah, zzbar

final class zzbas extends zzbaq
{

	private zzbas(byte abyte0[], int i, int j, boolean flag)
	{
		super(((zzbar) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void zzbaq(zzbar)>
		zzdqh = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #21  <Int 0x7fffffff>
	//    5    8:putfield        #23  <Field int zzdqh>
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
		zzdqf = pos;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #29  <Field int pos>
	//   20   33:putfield        #31  <Field int zzdqf>
		zzdqd = flag;
	//   21   36:aload_0         
	//   22   37:iload           4
	//   23   39:putfield        #33  <Field boolean zzdqd>
	//   24   42:return          
	}

	zzbas(byte abyte0[], int i, int j, boolean flag, zzbar zzbar)
	{
		this(abyte0, i, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void zzbas(byte[], int, int, boolean)>
	//    6    9:return          
	}

	private final int zzacc()
		throws IOException
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
	//   88  126:ldc1            #42  <Int 0xffe03f80>
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
	//  105  151:ldc1            #43  <Int 0xfe03f80>
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
		return (int)((zzbaq)this).zzabz();
	//  177  263:aload_0         
	//  178  264:invokevirtual   #47  <Method long zzbaq.zzabz()>
	//  179  267:l2i             
	//  180  268:ireturn         
	}

	private final long zzacd()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit == i) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int limit>
	//    5    9:iload_1         
	//    6   10:icmpeq          340
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
	//   31   48:icmplt          340
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
	//*  53   78:goto            332
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
	//*  75  109:goto            78
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
	//   91  131:ldc1            #42  <Int 0xffe03f80>
	//   92  133:ixor            
	//   93  134:istore_2        
		if(true) goto _L10; else goto _L9
	//   94  135:goto            74
_L9:
		long l1;
		l = j;
	//   95  138:iload_2         
	//   96  139:i2l             
	//   97  140:lstore          4
		j = i + 1;
	//   98  142:iload_1         
	//   99  143:iconst_1        
	//  100  144:iadd            
	//  101  145:istore_2        
		l1 = l ^ (long)abyte0[i] << 28;
	//  102  146:lload           4
	//  103  148:aload           8
	//  104  150:iload_1         
	//  105  151:baload          
	//  106  152:i2l             
	//  107  153:bipush          28
	//  108  155:lshl            
	//  109  156:lxor            
	//  110  157:lstore          6
		if(l1 < 0L) goto _L12; else goto _L11
	//  111  159:lload           6
	//  112  161:lconst_0        
	//  113  162:lcmp            
	//  114  163:iflt            183
_L11:
		l = 0xfe03f80L;
	//  115  166:ldc2w           #50  <Long 0xfe03f80L>
	//  116  169:lstore          4
		i = j;
	//  117  171:iload_2         
	//  118  172:istore_1        
_L20:
		l = l1 ^ l;
	//  119  173:lload           6
	//  120  175:lload           4
	//  121  177:lxor            
	//  122  178:lstore          4
		  goto _L6
	//* 123  180:goto            332
_L12:
		i = j + 1;
	//  124  183:iload_2         
	//  125  184:iconst_1        
	//  126  185:iadd            
	//  127  186:istore_1        
		l1 ^= (long)abyte0[j] << 35;
	//  128  187:lload           6
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
	//  141  207:ldc2w           #52  <Long 0xfe03f80L>
	//  142  210:lstore          4
_L16:
		l = l1 ^ l;
	//  143  212:lload           6
	//  144  214:lload           4
	//  145  216:lxor            
	//  146  217:lstore          4
		  goto _L6
	//* 147  219:goto            332
_L14:
		j = i + 1;
	//  148  222:iload_1         
	//  149  223:iconst_1        
	//  150  224:iadd            
	//  151  225:istore_2        
		l1 ^= (long)abyte0[i] << 42;
	//  152  226:lload           6
	//  153  228:aload           8
	//  154  230:iload_1         
	//  155  231:baload          
	//  156  232:i2l             
	//  157  233:bipush          42
	//  158  235:lshl            
	//  159  236:lxor            
	//  160  237:lstore          6
		if(l1 >= 0L)
	//* 161  239:lload           6
	//* 162  241:lconst_0        
	//* 163  242:lcmp            
	//* 164  243:iflt            256
		{
			l = 0xfe03f80L;
	//  165  246:ldc2w           #54  <Long 0xfe03f80L>
	//  166  249:lstore          4
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
		l1 ^= (long)abyte0[j] << 49;
	//  174  260:lload           6
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
	//  187  280:ldc2w           #56  <Long 0xfe03f80L>
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
	//  202  303:ldc2w           #58  <Long 0xfe03f80L>
	//  203  306:lxor            
	//  204  307:lstore          4
		i = j;
	//  205  309:iload_2         
	//  206  310:istore_1        
		if(l >= 0L) goto _L6; else goto _L17
	//  207  311:lload           4
	//  208  313:lconst_0        
	//  209  314:lcmp            
	//  210  315:ifge            332
_L17:
		if((long)abyte0[j] < 0L) goto _L2; else goto _L18
	//  211  318:aload           8
	//  212  320:iload_2         
	//  213  321:baload          
	//  214  322:i2l             
	//  215  323:lconst_0        
	//  216  324:lcmp            
	//  217  325:iflt            340
_L18:
		i = j + 1;
	//  218  328:iload_2         
	//  219  329:iconst_1        
	//  220  330:iadd            
	//  221  331:istore_1        
_L6:
		pos = i;
	//  222  332:aload_0         
	//  223  333:iload_1         
	//  224  334:putfield        #29  <Field int pos>
		return l;
	//  225  337:lload           4
	//  226  339:lreturn         
_L2:
		return ((zzbaq)this).zzabz();
	//  227  340:aload_0         
	//  228  341:invokevirtual   #47  <Method long zzbaq.zzabz()>
	//  229  344:lreturn         
		if(true) goto _L20; else goto _L19
_L19:
	}

	private final int zzace()
		throws IOException
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
			throw zzbbu.zzadl();
	//    9   15:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
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

	private final long zzacf()
		throws IOException
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
			throw zzbbu.zzadl();
	//    9   16:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   10   19:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//   11   20:aload_0         
	//   12   21:getfield        #25  <Field byte[] buffer>
	//   13   24:astore_2        
			pos = i + 8;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:bipush          8
	//   17   29:iadd            
	//   18   30:putfield        #29  <Field int pos>
			return (long)abyte0[i] & 255L | ((long)abyte0[i + 1] & 255L) << 8 | ((long)abyte0[i + 2] & 255L) << 16 | ((long)abyte0[i + 3] & 255L) << 24 | ((long)abyte0[i + 4] & 255L) << 32 | ((long)abyte0[i + 5] & 255L) << 40 | ((long)abyte0[i + 6] & 255L) << 48 | ((long)abyte0[i + 7] & 255L) << 56;
	//   19   33:aload_2         
	//   20   34:iload_1         
	//   21   35:baload          
	//   22   36:i2l             
	//   23   37:ldc2w           #68  <Long 255L>
	//   24   40:land            
	//   25   41:aload_2         
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:ldc2w           #68  <Long 255L>
	//   32   50:land            
	//   33   51:bipush          8
	//   34   53:lshl            
	//   35   54:lor             
	//   36   55:aload_2         
	//   37   56:iload_1         
	//   38   57:iconst_2        
	//   39   58:iadd            
	//   40   59:baload          
	//   41   60:i2l             
	//   42   61:ldc2w           #68  <Long 255L>
	//   43   64:land            
	//   44   65:bipush          16
	//   45   67:lshl            
	//   46   68:lor             
	//   47   69:aload_2         
	//   48   70:iload_1         
	//   49   71:iconst_3        
	//   50   72:iadd            
	//   51   73:baload          
	//   52   74:i2l             
	//   53   75:ldc2w           #68  <Long 255L>
	//   54   78:land            
	//   55   79:bipush          24
	//   56   81:lshl            
	//   57   82:lor             
	//   58   83:aload_2         
	//   59   84:iload_1         
	//   60   85:iconst_4        
	//   61   86:iadd            
	//   62   87:baload          
	//   63   88:i2l             
	//   64   89:ldc2w           #68  <Long 255L>
	//   65   92:land            
	//   66   93:bipush          32
	//   67   95:lshl            
	//   68   96:lor             
	//   69   97:aload_2         
	//   70   98:iload_1         
	//   71   99:iconst_5        
	//   72  100:iadd            
	//   73  101:baload          
	//   74  102:i2l             
	//   75  103:ldc2w           #68  <Long 255L>
	//   76  106:land            
	//   77  107:bipush          40
	//   78  109:lshl            
	//   79  110:lor             
	//   80  111:aload_2         
	//   81  112:iload_1         
	//   82  113:bipush          6
	//   83  115:iadd            
	//   84  116:baload          
	//   85  117:i2l             
	//   86  118:ldc2w           #68  <Long 255L>
	//   87  121:land            
	//   88  122:bipush          48
	//   89  124:lshl            
	//   90  125:lor             
	//   91  126:aload_2         
	//   92  127:iload_1         
	//   93  128:bipush          7
	//   94  130:iadd            
	//   95  131:baload          
	//   96  132:i2l             
	//   97  133:ldc2w           #68  <Long 255L>
	//   98  136:land            
	//   99  137:bipush          56
	//  100  139:lshl            
	//  101  140:lor             
	//  102  141:lreturn         
		}
	}

	private final void zzacg()
	{
		limit = limit + zzdqe;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int limit>
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field int zzdqe>
	//    5    9:iadd            
	//    6   10:putfield        #27  <Field int limit>
		int i = limit - zzdqf;
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int limit>
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field int zzdqf>
	//   11   21:isub            
	//   12   22:istore_1        
		if(i > zzdqh)
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #23  <Field int zzdqh>
	//*  16   28:icmple          55
		{
			zzdqe = i - zzdqh;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field int zzdqh>
	//   21   37:isub            
	//   22   38:putfield        #73  <Field int zzdqe>
			limit = limit - zzdqe;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #27  <Field int limit>
	//   26   46:aload_0         
	//   27   47:getfield        #73  <Field int zzdqe>
	//   28   50:isub            
	//   29   51:putfield        #27  <Field int limit>
			return;
	//   30   54:return          
		} else
		{
			zzdqe = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #73  <Field int zzdqe>
			return;
	//   34   60:return          
		}
	}

	private final byte zzach()
		throws IOException
	{
		if(pos == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field int limit>
	//*   4    8:icmpne          15
		{
			throw zzbbu.zzadl();
	//    5   11:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
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
		throws IOException
	{
		return Double.longBitsToDouble(zzacf());
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzacf()>
	//    2    4:invokestatic    #85  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public final float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(zzace());
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzace()>
	//    2    4:invokestatic    #95  <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public final String readString()
		throws IOException
	{
		int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
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
			String s = new String(buffer, pos, i, zzbbq.UTF_8);
	//   12   22:new             #101 <Class String>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field byte[] buffer>
	//   16   30:aload_0         
	//   17   31:getfield        #29  <Field int pos>
	//   18   34:iload_1         
	//   19   35:getstatic       #107 <Field java.nio.charset.Charset zzbbq.UTF_8>
	//   20   38:invokespecial   #110 <Method void String(byte[], int, int, java.nio.charset.Charset)>
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
	//   32   58:ldc1            #112 <String "">
	//   33   60:areturn         
		if(i < 0)
	//*  34   61:iload_1         
	//*  35   62:ifge            69
			throw zzbbu.zzadm();
	//   36   65:invokestatic    #115 <Method zzbbu zzbbu.zzadm()>
	//   37   68:athrow          
		else
			throw zzbbu.zzadl();
	//   38   69:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   39   72:athrow          
	}

	public final int zzabk()
		throws IOException
	{
		if(((zzbaq)this).zzaca())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #120 <Method boolean zzbaq.zzaca()>
	//*   2    4:ifeq            14
		{
			zzdqg = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #122 <Field int zzdqg>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		zzdqg = zzacc();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #99  <Method int zzacc()>
	//   11   19:putfield        #122 <Field int zzdqg>
		if(zzdqg >>> 3 == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #122 <Field int zzdqg>
	//*  14   26:iconst_3        
	//*  15   27:iushr           
	//*  16   28:ifne            35
			throw zzbbu.zzado();
	//   17   31:invokestatic    #125 <Method zzbbu zzbbu.zzado()>
	//   18   34:athrow          
		else
			return zzdqg;
	//   19   35:aload_0         
	//   20   36:getfield        #122 <Field int zzdqg>
	//   21   39:ireturn         
	}

	public final long zzabl()
		throws IOException
	{
		return zzacd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method long zzacd()>
	//    2    4:lreturn         
	}

	public final long zzabm()
		throws IOException
	{
		return zzacd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method long zzacd()>
	//    2    4:lreturn         
	}

	public final int zzabn()
		throws IOException
	{
		return zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
	//    2    4:ireturn         
	}

	public final long zzabo()
		throws IOException
	{
		return zzacf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzacf()>
	//    2    4:lreturn         
	}

	public final int zzabp()
		throws IOException
	{
		return zzace();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzace()>
	//    2    4:ireturn         
	}

	public final boolean zzabq()
		throws IOException
	{
		return zzacd() != 0L;
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method long zzacd()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final String zzabr()
		throws IOException
	{
		int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            78
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #27  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #29  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          78
			if(!zzbem.zzf(buffer, pos, pos + i))
	//*  12   22:aload_0         
	//*  13   23:getfield        #25  <Field byte[] buffer>
	//*  14   26:aload_0         
	//*  15   27:getfield        #29  <Field int pos>
	//*  16   30:aload_0         
	//*  17   31:getfield        #29  <Field int pos>
	//*  18   34:iload_1         
	//*  19   35:iadd            
	//*  20   36:invokestatic    #140 <Method boolean zzbem.zzf(byte[], int, int)>
	//*  21   39:ifne            46
			{
				throw zzbbu.zzads();
	//   22   42:invokestatic    #143 <Method zzbbu zzbbu.zzads()>
	//   23   45:athrow          
			} else
			{
				int j = pos;
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field int pos>
	//   26   50:istore_2        
				pos = pos + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #29  <Field int pos>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #29  <Field int pos>
				return new String(buffer, j, i, zzbbq.UTF_8);
	//   33   61:new             #101 <Class String>
	//   34   64:dup             
	//   35   65:aload_0         
	//   36   66:getfield        #25  <Field byte[] buffer>
	//   37   69:iload_2         
	//   38   70:iload_1         
	//   39   71:getstatic       #107 <Field java.nio.charset.Charset zzbbq.UTF_8>
	//   40   74:invokespecial   #110 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   41   77:areturn         
			}
		if(i == 0)
	//*  42   78:iload_1         
	//*  43   79:ifne            85
			return "";
	//   44   82:ldc1            #112 <String "">
	//   45   84:areturn         
		if(i <= 0)
	//*  46   85:iload_1         
	//*  47   86:ifgt            93
			throw zzbbu.zzadm();
	//   48   89:invokestatic    #115 <Method zzbbu zzbbu.zzadm()>
	//   49   92:athrow          
		else
			throw zzbbu.zzadl();
	//   50   93:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   51   96:athrow          
	}

	public final zzbah zzabs()
		throws IOException
	{
label0:
		{
label1:
			{
				int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
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
					zzbah zzbah1 = zzbah.zzc(buffer, pos, i);
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field byte[] buffer>
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field int pos>
	//   16   30:iload_1         
	//   17   31:invokestatic    #151 <Method zzbah zzbah.zzc(byte[], int, int)>
	//   18   34:astore_3        
					pos = pos + i;
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #29  <Field int pos>
	//   22   40:iload_1         
	//   23   41:iadd            
	//   24   42:putfield        #29  <Field int pos>
					return zzbah1;
	//   25   45:aload_3         
	//   26   46:areturn         
				}
				if(i == 0)
	//*  27   47:iload_1         
	//*  28   48:ifne            55
					return zzbah.zzdpq;
	//   29   51:getstatic       #155 <Field zzbah zzbah.zzdpq>
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
	//   54   96:invokestatic    #161 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
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
					abyte0 = zzbbq.zzduq;
	//   61  111:getstatic       #164 <Field byte[] zzbbq.zzduq>
	//   62  114:astore_3        
				}
				return zzbah.zzp(abyte0);
	//   63  115:aload_3         
	//   64  116:invokestatic    #168 <Method zzbah zzbah.zzp(byte[])>
	//   65  119:areturn         
			}
			throw zzbbu.zzadm();
	//   66  120:invokestatic    #115 <Method zzbbu zzbbu.zzadm()>
	//   67  123:athrow          
		}
		throw zzbbu.zzadl();
	//   68  124:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   69  127:athrow          
	}

	public final int zzabt()
		throws IOException
	{
		return zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
	//    2    4:ireturn         
	}

	public final int zzabu()
		throws IOException
	{
		return zzacc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
	//    2    4:ireturn         
	}

	public final int zzabv()
		throws IOException
	{
		return zzace();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzace()>
	//    2    4:ireturn         
	}

	public final long zzabw()
		throws IOException
	{
		return zzacf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzacf()>
	//    2    4:lreturn         
	}

	public final int zzabx()
		throws IOException
	{
		return zzbu(zzacc());
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzacc()>
	//    2    4:invokestatic    #177 <Method int zzbu(int)>
	//    3    7:ireturn         
	}

	public final long zzaby()
		throws IOException
	{
		return zzl(zzacd());
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method long zzacd()>
	//    2    4:invokestatic    #182 <Method long zzl(long)>
	//    3    7:lreturn         
	}

	final long zzabz()
		throws IOException
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
			byte byte0 = zzach();
	//    7   10:aload_0         
	//    8   11:invokespecial   #184 <Method byte zzach()>
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
		throw zzbbu.zzadn();
	//   30   43:invokestatic    #187 <Method zzbbu zzbbu.zzadn()>
	//   31   46:athrow          
	}

	public final boolean zzaca()
		throws IOException
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

	public final int zzacb()
	{
		return pos - zzdqf;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int zzdqf>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void zzbp(int i)
		throws zzbbu
	{
		if(zzdqg != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field int zzdqg>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw zzbbu.zzadp();
	//    4    8:invokestatic    #193 <Method zzbbu zzbbu.zzadp()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public final boolean zzbq(int i)
		throws IOException
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
					throw zzbbu.zzadq();
	//    8   48:invokestatic    #199 <Method zzbbv zzbbu.zzadq()>
	//    9   51:athrow          

				case 5: // '\005'
					((zzbaq)this).zzbt(4);
	//   10   52:aload_0         
	//   11   53:iconst_4        
	//   12   54:invokevirtual   #202 <Method void zzbaq.zzbt(int)>
					return true;
	//   13   57:iconst_1        
	//   14   58:ireturn         

				case 4: // '\004'
					return false;
	//   15   59:iconst_0        
	//   16   60:ireturn         

				case 3: // '\003'
					do
						j = ((zzbaq)this).zzabk();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #204 <Method int zzbaq.zzabk()>
	//   19   65:istore_2        
					while(j != 0 && ((zzbaq)this).zzbq(j));
	//   20   66:iload_2         
	//   21   67:ifeq            78
	//   22   70:aload_0         
	//   23   71:iload_2         
	//   24   72:invokevirtual   #206 <Method boolean zzbaq.zzbq(int)>
	//   25   75:ifne            61
					((zzbaq)this).zzbp((i >>> 3) << 3 | 4);
	//   26   78:aload_0         
	//   27   79:iload_1         
	//   28   80:iconst_3        
	//   29   81:iushr           
	//   30   82:iconst_3        
	//   31   83:ishl            
	//   32   84:iconst_4        
	//   33   85:ior             
	//   34   86:invokevirtual   #208 <Method void zzbaq.zzbp(int)>
					return true;
	//   35   89:iconst_1        
	//   36   90:ireturn         

				case 2: // '\002'
					((zzbaq)this).zzbt(zzacc());
	//   37   91:aload_0         
	//   38   92:aload_0         
	//   39   93:invokespecial   #99  <Method int zzacc()>
	//   40   96:invokevirtual   #202 <Method void zzbaq.zzbt(int)>
					return true;
	//   41   99:iconst_1        
	//   42  100:ireturn         

				case 1: // '\001'
					((zzbaq)this).zzbt(8);
	//   43  101:aload_0         
	//   44  102:bipush          8
	//   45  104:invokevirtual   #202 <Method void zzbaq.zzbt(int)>
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
					throw zzbbu.zzadn();
	//   82  165:invokestatic    #187 <Method zzbbu zzbbu.zzadn()>
	//   83  168:athrow          
				}
				do
				{
					if(i >= 10)
						break label0;
	//   84  169:iload_1         
	//   85  170:bipush          10
	//   86  172:icmpge          191
					if(zzach() >= 0)
						break;
	//   87  175:aload_0         
	//   88  176:invokespecial   #184 <Method byte zzach()>
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
		throw zzbbu.zzadn();
	//   97  191:invokestatic    #187 <Method zzbbu zzbbu.zzadn()>
	//   98  194:athrow          
	}

	public final int zzbr(int i)
		throws zzbbu
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbbu.zzadm();
	//    2    4:invokestatic    #115 <Method zzbbu zzbbu.zzadm()>
	//    3    7:athrow          
		i += ((zzbaq)this).zzacb();
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method int zzbaq.zzacb()>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzdqh;
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field int zzdqh>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw zzbbu.zzadl();
	//   15   25:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   16   28:athrow          
		} else
		{
			zzdqh = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #23  <Field int zzdqh>
			zzacg();
	//   20   34:aload_0         
	//   21   35:invokespecial   #213 <Method void zzacg()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public final void zzbs(int i)
	{
		zzdqh = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int zzdqh>
		zzacg();
	//    3    5:aload_0         
	//    4    6:invokespecial   #213 <Method void zzacg()>
	//    5    9:return          
	}

	public final void zzbt(int i)
		throws IOException
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
			throw zzbbu.zzadm();
	//   18   32:invokestatic    #115 <Method zzbbu zzbbu.zzadm()>
	//   19   35:athrow          
		else
			throw zzbbu.zzadl();
	//   20   36:invokestatic    #66  <Method zzbbu zzbbu.zzadl()>
	//   21   39:athrow          
	}

	private final byte buffer[];
	private int limit;
	private int pos;
	private final boolean zzdqd;
	private int zzdqe;
	private int zzdqf;
	private int zzdqg;
	private int zzdqh;
}
