// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arc, asu, aug, atv, 
//			aso, avs, aqq, ard, 
//			ars

final class are extends arc
{

	private are(byte abyte0[], int i1, int j1, boolean flag)
	{
		super(((ard) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void arc(ard)>
		k = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #21  <Int 0x7fffffff>
	//    5    8:putfield        #23  <Field int k>
		d = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #25  <Field byte[] d>
		f = j1 + i1;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:iload_2         
	//   12   19:iadd            
	//   13   20:putfield        #27  <Field int f>
		h = i1;
	//   14   23:aload_0         
	//   15   24:iload_2         
	//   16   25:putfield        #29  <Field int h>
		i = h;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #29  <Field int h>
	//   20   33:putfield        #31  <Field int i>
		e = flag;
	//   21   36:aload_0         
	//   22   37:iload           4
	//   23   39:putfield        #33  <Field boolean e>
	//   24   42:return          
	}

	are(byte abyte0[], int i1, int j1, boolean flag, ard ard)
	{
		this(abyte0, i1, j1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void are(byte[], int, int, boolean)>
	//    6    9:return          
	}

	private final byte A()
	{
		int i1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:istore_1        
		if(i1 != f)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #27  <Field int f>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = d;
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field byte[] d>
	//    9   17:astore_2        
			h = i1 + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #29  <Field int h>
			return abyte0[i1];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw asu.a();
	//   19   29:invokestatic    #45  <Method asu asu.a()>
	//   20   32:athrow          
		}
	}

	private final int v()
	{
label0:
		{
			int i1;
			int j1;
label1:
			{
				int k1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:istore_3        
				i1 = f;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int f>
	//    5    9:istore_1        
				if(i1 == k1)
					break label0;
	//    6   10:iload_1         
	//    7   11:iload_3         
	//    8   12:icmpeq          254
				byte abyte0[] = d;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] d>
	//   11   19:astore          6
				j1 = k1 + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
				k1 = ((int) (abyte0[k1]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
				if(k1 >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            41
				{
					h = j1;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #29  <Field int h>
					return k1;
	//   25   39:iload_3         
	//   26   40:ireturn         
				}
				if(i1 - j1 < 9)
					break label0;
	//   27   41:iload_1         
	//   28   42:iload_2         
	//   29   43:isub            
	//   30   44:bipush          9
	//   31   46:icmplt          254
				i1 = j1 + 1;
	//   32   49:iload_2         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_1        
				k1 ^= abyte0[j1] << 7;
	//   36   53:iload_3         
	//   37   54:aload           6
	//   38   56:iload_2         
	//   39   57:baload          
	//   40   58:bipush          7
	//   41   60:ishl            
	//   42   61:ixor            
	//   43   62:istore_3        
				if(k1 < 0)
	//*  44   63:iload_3         
	//*  45   64:ifge            75
				{
					j1 = k1 ^ 0xffffff80;
	//   46   67:iload_3         
	//   47   68:bipush          -128
	//   48   70:ixor            
	//   49   71:istore_2        
					break label1;
	//   50   72:goto            247
				}
				j1 = i1 + 1;
	//   51   75:iload_1         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:istore_2        
				k1 ^= abyte0[i1] << 14;
	//   55   79:iload_3         
	//   56   80:aload           6
	//   57   82:iload_1         
	//   58   83:baload          
	//   59   84:bipush          14
	//   60   86:ishl            
	//   61   87:ixor            
	//   62   88:istore_3        
				if(k1 >= 0)
	//*  63   89:iload_3         
	//*  64   90:iflt            106
				{
					k1 ^= 0x3f80;
	//   65   93:iload_3         
	//   66   94:sipush          16256
	//   67   97:ixor            
	//   68   98:istore_3        
					i1 = j1;
	//   69   99:iload_2         
	//   70  100:istore_1        
					j1 = k1;
	//   71  101:iload_3         
	//   72  102:istore_2        
					break label1;
	//   73  103:goto            247
				}
				i1 = j1 + 1;
	//   74  106:iload_2         
	//   75  107:iconst_1        
	//   76  108:iadd            
	//   77  109:istore_1        
				k1 ^= abyte0[j1] << 21;
	//   78  110:iload_3         
	//   79  111:aload           6
	//   80  113:iload_2         
	//   81  114:baload          
	//   82  115:bipush          21
	//   83  117:ishl            
	//   84  118:ixor            
	//   85  119:istore_3        
				if(k1 < 0)
	//*  86  120:iload_3         
	//*  87  121:ifge            132
				{
					j1 = k1 ^ 0xffe03f80;
	//   88  124:iload_3         
	//   89  125:ldc1            #48  <Int 0xffe03f80>
	//   90  127:ixor            
	//   91  128:istore_2        
					break label1;
	//   92  129:goto            247
				}
				int l1 = i1 + 1;
	//   93  132:iload_1         
	//   94  133:iconst_1        
	//   95  134:iadd            
	//   96  135:istore          4
				j1 = ((int) (abyte0[i1]));
	//   97  137:aload           6
	//   98  139:iload_1         
	//   99  140:baload          
	//  100  141:istore_2        
				k1 = k1 ^ j1 << 28 ^ 0xfe03f80;
	//  101  142:iload_3         
	//  102  143:iload_2         
	//  103  144:bipush          28
	//  104  146:ishl            
	//  105  147:ixor            
	//  106  148:ldc1            #49  <Int 0xfe03f80>
	//  107  150:ixor            
	//  108  151:istore_3        
				i1 = l1;
	//  109  152:iload           4
	//  110  154:istore_1        
				if(j1 < 0)
	//* 111  155:iload_2         
	//* 112  156:ifge            245
				{
					int i2 = l1 + 1;
	//  113  159:iload           4
	//  114  161:iconst_1        
	//  115  162:iadd            
	//  116  163:istore          5
					j1 = k1;
	//  117  165:iload_3         
	//  118  166:istore_2        
					i1 = i2;
	//  119  167:iload           5
	//  120  169:istore_1        
					if(abyte0[l1] >= 0)
						break label1;
	//  121  170:aload           6
	//  122  172:iload           4
	//  123  174:baload          
	//  124  175:ifge            247
					l1 = i2 + 1;
	//  125  178:iload           5
	//  126  180:iconst_1        
	//  127  181:iadd            
	//  128  182:istore          4
					i1 = l1;
	//  129  184:iload           4
	//  130  186:istore_1        
					if(abyte0[i2] < 0)
	//* 131  187:aload           6
	//* 132  189:iload           5
	//* 133  191:baload          
	//* 134  192:ifge            245
					{
						int j2 = l1 + 1;
	//  135  195:iload           4
	//  136  197:iconst_1        
	//  137  198:iadd            
	//  138  199:istore          5
						j1 = k1;
	//  139  201:iload_3         
	//  140  202:istore_2        
						i1 = j2;
	//  141  203:iload           5
	//  142  205:istore_1        
						if(abyte0[l1] >= 0)
							break label1;
	//  143  206:aload           6
	//  144  208:iload           4
	//  145  210:baload          
	//  146  211:ifge            247
						j1 = j2 + 1;
	//  147  214:iload           5
	//  148  216:iconst_1        
	//  149  217:iadd            
	//  150  218:istore_2        
						i1 = j1;
	//  151  219:iload_2         
	//  152  220:istore_1        
						if(abyte0[j2] < 0)
	//* 153  221:aload           6
	//* 154  223:iload           5
	//* 155  225:baload          
	//* 156  226:ifge            245
						{
							i1 = j1 + 1;
	//  157  229:iload_2         
	//  158  230:iconst_1        
	//  159  231:iadd            
	//  160  232:istore_1        
							if(abyte0[j1] < 0)
								break label0;
	//  161  233:aload           6
	//  162  235:iload_2         
	//  163  236:baload          
	//  164  237:iflt            254
							j1 = k1;
	//  165  240:iload_3         
	//  166  241:istore_2        
							break label1;
	//  167  242:goto            247
						}
					}
				}
				j1 = k1;
	//  168  245:iload_3         
	//  169  246:istore_2        
			}
			h = i1;
	//  170  247:aload_0         
	//  171  248:iload_1         
	//  172  249:putfield        #29  <Field int h>
			return j1;
	//  173  252:iload_2         
	//  174  253:ireturn         
		}
		return (int)((arc)this).s();
	//  175  254:aload_0         
	//  176  255:invokevirtual   #53  <Method long arc.s()>
	//  177  258:l2i             
	//  178  259:ireturn         
	}

	private final long w()
	{
label0:
		{
			int j2 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:istore_3        
			int i1 = f;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int f>
	//    5    9:istore_1        
			if(i1 == j2)
				break label0;
	//    6   10:iload_1         
	//    7   11:iload_3         
	//    8   12:icmpeq          340
			byte abyte0[] = d;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] d>
	//   11   19:astore          6
			int j1 = j2 + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
			j2 = ((int) (abyte0[j2]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
			if(j2 >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            42
			{
				h = j1;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #29  <Field int h>
				return (long)j2;
	//   25   39:iload_3         
	//   26   40:i2l             
	//   27   41:lreturn         
			}
			if(i1 - j1 < 9)
				break label0;
	//   28   42:iload_1         
	//   29   43:iload_2         
	//   30   44:isub            
	//   31   45:bipush          9
	//   32   47:icmplt          340
			i1 = j1 + 1;
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:istore_1        
			j2 ^= abyte0[j1] << 7;
	//   37   54:iload_3         
	//   38   55:aload           6
	//   39   57:iload_2         
	//   40   58:baload          
	//   41   59:bipush          7
	//   42   61:ishl            
	//   43   62:ixor            
	//   44   63:istore_3        
			long l2;
			if(j2 < 0)
	//*  45   64:iload_3         
	//*  46   65:ifge            78
			{
				l2 = j2 ^ 0xffffff80;
	//   47   68:iload_3         
	//   48   69:bipush          -128
	//   49   71:ixor            
	//   50   72:i2l             
	//   51   73:lstore          4
			} else
	//*  52   75:goto            332
			{
				int k1 = i1 + 1;
	//   53   78:iload_1         
	//   54   79:iconst_1        
	//   55   80:iadd            
	//   56   81:istore_2        
				j2 ^= abyte0[i1] << 14;
	//   57   82:iload_3         
	//   58   83:aload           6
	//   59   85:iload_1         
	//   60   86:baload          
	//   61   87:bipush          14
	//   62   89:ishl            
	//   63   90:ixor            
	//   64   91:istore_3        
				if(j2 >= 0)
	//*  65   92:iload_3         
	//*  66   93:iflt            109
				{
					l2 = j2 ^ 0x3f80;
	//   67   96:iload_3         
	//   68   97:sipush          16256
	//   69  100:ixor            
	//   70  101:i2l             
	//   71  102:lstore          4
					i1 = k1;
	//   72  104:iload_2         
	//   73  105:istore_1        
				} else
	//*  74  106:goto            332
				{
					i1 = k1 + 1;
	//   75  109:iload_2         
	//   76  110:iconst_1        
	//   77  111:iadd            
	//   78  112:istore_1        
					k1 = j2 ^ abyte0[k1] << 21;
	//   79  113:iload_3         
	//   80  114:aload           6
	//   81  116:iload_2         
	//   82  117:baload          
	//   83  118:bipush          21
	//   84  120:ishl            
	//   85  121:ixor            
	//   86  122:istore_2        
					if(k1 < 0)
	//*  87  123:iload_2         
	//*  88  124:ifge            137
					{
						l2 = k1 ^ 0xffe03f80;
	//   89  127:iload_2         
	//   90  128:ldc1            #48  <Int 0xffe03f80>
	//   91  130:ixor            
	//   92  131:i2l             
	//   93  132:lstore          4
					} else
	//*  94  134:goto            332
					{
						l2 = k1;
	//   95  137:iload_2         
	//   96  138:i2l             
	//   97  139:lstore          4
						k1 = i1 + 1;
	//   98  141:iload_1         
	//   99  142:iconst_1        
	//  100  143:iadd            
	//  101  144:istore_2        
						l2 ^= (long)abyte0[i1] << 28;
	//  102  145:lload           4
	//  103  147:aload           6
	//  104  149:iload_1         
	//  105  150:baload          
	//  106  151:i2l             
	//  107  152:bipush          28
	//  108  154:lshl            
	//  109  155:lxor            
	//  110  156:lstore          4
						if(l2 >= 0L)
	//* 111  158:lload           4
	//* 112  160:lconst_0        
	//* 113  161:lcmp            
	//* 114  162:iflt            178
						{
							l2 = 0xfe03f80L ^ l2;
	//  115  165:ldc2w           #55  <Long 0xfe03f80L>
	//  116  168:lload           4
	//  117  170:lxor            
	//  118  171:lstore          4
							i1 = k1;
	//  119  173:iload_2         
	//  120  174:istore_1        
						} else
	//* 121  175:goto            332
						{
							i1 = k1 + 1;
	//  122  178:iload_2         
	//  123  179:iconst_1        
	//  124  180:iadd            
	//  125  181:istore_1        
							l2 ^= (long)abyte0[k1] << 35;
	//  126  182:lload           4
	//  127  184:aload           6
	//  128  186:iload_2         
	//  129  187:baload          
	//  130  188:i2l             
	//  131  189:bipush          35
	//  132  191:lshl            
	//  133  192:lxor            
	//  134  193:lstore          4
							if(l2 < 0L)
	//* 135  195:lload           4
	//* 136  197:lconst_0        
	//* 137  198:lcmp            
	//* 138  199:ifge            213
							{
								l2 ^= 0xfe03f80L;
	//  139  202:lload           4
	//  140  204:ldc2w           #57  <Long 0xfe03f80L>
	//  141  207:lxor            
	//  142  208:lstore          4
							} else
	//* 143  210:goto            332
							{
								int l1 = i1 + 1;
	//  144  213:iload_1         
	//  145  214:iconst_1        
	//  146  215:iadd            
	//  147  216:istore_2        
								l2 ^= (long)abyte0[i1] << 42;
	//  148  217:lload           4
	//  149  219:aload           6
	//  150  221:iload_1         
	//  151  222:baload          
	//  152  223:i2l             
	//  153  224:bipush          42
	//  154  226:lshl            
	//  155  227:lxor            
	//  156  228:lstore          4
								if(l2 >= 0L)
	//* 157  230:lload           4
	//* 158  232:lconst_0        
	//* 159  233:lcmp            
	//* 160  234:iflt            250
								{
									l2 = 0xfe03f80L ^ l2;
	//  161  237:ldc2w           #59  <Long 0xfe03f80L>
	//  162  240:lload           4
	//  163  242:lxor            
	//  164  243:lstore          4
									i1 = l1;
	//  165  245:iload_2         
	//  166  246:istore_1        
								} else
	//* 167  247:goto            332
								{
									i1 = l1 + 1;
	//  168  250:iload_2         
	//  169  251:iconst_1        
	//  170  252:iadd            
	//  171  253:istore_1        
									l2 ^= (long)abyte0[l1] << 49;
	//  172  254:lload           4
	//  173  256:aload           6
	//  174  258:iload_2         
	//  175  259:baload          
	//  176  260:i2l             
	//  177  261:bipush          49
	//  178  263:lshl            
	//  179  264:lxor            
	//  180  265:lstore          4
									if(l2 < 0L)
	//* 181  267:lload           4
	//* 182  269:lconst_0        
	//* 183  270:lcmp            
	//* 184  271:ifge            285
									{
										l2 ^= 0xfe03f80L;
	//  185  274:lload           4
	//  186  276:ldc2w           #61  <Long 0xfe03f80L>
	//  187  279:lxor            
	//  188  280:lstore          4
									} else
	//* 189  282:goto            332
									{
										int i2 = i1 + 1;
	//  190  285:iload_1         
	//  191  286:iconst_1        
	//  192  287:iadd            
	//  193  288:istore_2        
										l2 = l2 ^ (long)abyte0[i1] << 56 ^ 0xfe03f80L;
	//  194  289:lload           4
	//  195  291:aload           6
	//  196  293:iload_1         
	//  197  294:baload          
	//  198  295:i2l             
	//  199  296:bipush          56
	//  200  298:lshl            
	//  201  299:lxor            
	//  202  300:ldc2w           #63  <Long 0xfe03f80L>
	//  203  303:lxor            
	//  204  304:lstore          4
										if(l2 < 0L)
	//* 205  306:lload           4
	//* 206  308:lconst_0        
	//* 207  309:lcmp            
	//* 208  310:ifge            330
										{
											i1 = i2 + 1;
	//  209  313:iload_2         
	//  210  314:iconst_1        
	//  211  315:iadd            
	//  212  316:istore_1        
											if((long)abyte0[i2] < 0L)
	//* 213  317:aload           6
	//* 214  319:iload_2         
	//* 215  320:baload          
	//* 216  321:i2l             
	//* 217  322:lconst_0        
	//* 218  323:lcmp            
	//* 219  324:iflt            340
												break label0;
	//  220  327:goto            332
										} else
										{
											i1 = i2;
	//  221  330:iload_2         
	//  222  331:istore_1        
										}
									}
								}
							}
						}
					}
				}
			}
			h = i1;
	//  223  332:aload_0         
	//  224  333:iload_1         
	//  225  334:putfield        #29  <Field int h>
			return l2;
	//  226  337:lload           4
	//  227  339:lreturn         
		}
		return ((arc)this).s();
	//  228  340:aload_0         
	//  229  341:invokevirtual   #53  <Method long arc.s()>
	//  230  344:lreturn         
	}

	private final int x()
	{
		int i1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:istore_1        
		if(f - i1 >= 4)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int f>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:iconst_4        
	//*   8   12:icmplt          87
		{
			byte abyte0[] = d;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] d>
	//   11   19:astore          5
			h = i1 + 4;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:iconst_4        
	//   15   24:iadd            
	//   16   25:putfield        #29  <Field int h>
			byte byte0 = abyte0[i1];
	//   17   28:aload           5
	//   18   30:iload_1         
	//   19   31:baload          
	//   20   32:istore_2        
			byte byte1 = abyte0[i1 + 1];
	//   21   33:aload           5
	//   22   35:iload_1         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:baload          
	//   26   39:istore_3        
			byte byte2 = abyte0[i1 + 2];
	//   27   40:aload           5
	//   28   42:iload_1         
	//   29   43:iconst_2        
	//   30   44:iadd            
	//   31   45:baload          
	//   32   46:istore          4
			return (abyte0[i1 + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
	//   33   48:aload           5
	//   34   50:iload_1         
	//   35   51:iconst_3        
	//   36   52:iadd            
	//   37   53:baload          
	//   38   54:sipush          255
	//   39   57:iand            
	//   40   58:bipush          24
	//   41   60:ishl            
	//   42   61:iload_2         
	//   43   62:sipush          255
	//   44   65:iand            
	//   45   66:iload_3         
	//   46   67:sipush          255
	//   47   70:iand            
	//   48   71:bipush          8
	//   49   73:ishl            
	//   50   74:ior             
	//   51   75:iload           4
	//   52   77:sipush          255
	//   53   80:iand            
	//   54   81:bipush          16
	//   55   83:ishl            
	//   56   84:ior             
	//   57   85:ior             
	//   58   86:ireturn         
		} else
		{
			throw asu.a();
	//   59   87:invokestatic    #45  <Method asu asu.a()>
	//   60   90:athrow          
		}
	}

	private final long y()
	{
		int i1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:istore_1        
		if(f - i1 >= 8)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int f>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:bipush          8
	//*   8   13:icmplt          173
		{
			byte abyte0[] = d;
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field byte[] d>
	//   11   20:astore          16
			h = i1 + 8;
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:bipush          8
	//   15   26:iadd            
	//   16   27:putfield        #29  <Field int h>
			long l1 = abyte0[i1];
	//   17   30:aload           16
	//   18   32:iload_1         
	//   19   33:baload          
	//   20   34:i2l             
	//   21   35:lstore_2        
			long l2 = abyte0[i1 + 1];
	//   22   36:aload           16
	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:baload          
	//   27   42:i2l             
	//   28   43:lstore          4
			long l3 = abyte0[i1 + 2];
	//   29   45:aload           16
	//   30   47:iload_1         
	//   31   48:iconst_2        
	//   32   49:iadd            
	//   33   50:baload          
	//   34   51:i2l             
	//   35   52:lstore          6
			long l4 = abyte0[i1 + 3];
	//   36   54:aload           16
	//   37   56:iload_1         
	//   38   57:iconst_3        
	//   39   58:iadd            
	//   40   59:baload          
	//   41   60:i2l             
	//   42   61:lstore          8
			long l5 = abyte0[i1 + 4];
	//   43   63:aload           16
	//   44   65:iload_1         
	//   45   66:iconst_4        
	//   46   67:iadd            
	//   47   68:baload          
	//   48   69:i2l             
	//   49   70:lstore          10
			long l6 = abyte0[i1 + 5];
	//   50   72:aload           16
	//   51   74:iload_1         
	//   52   75:iconst_5        
	//   53   76:iadd            
	//   54   77:baload          
	//   55   78:i2l             
	//   56   79:lstore          12
			long l7 = abyte0[i1 + 6];
	//   57   81:aload           16
	//   58   83:iload_1         
	//   59   84:bipush          6
	//   60   86:iadd            
	//   61   87:baload          
	//   62   88:i2l             
	//   63   89:lstore          14
			return ((long)abyte0[i1 + 7] & 255L) << 56 | (l1 & 255L | (l2 & 255L) << 8 | (l3 & 255L) << 16 | (l4 & 255L) << 24 | (l5 & 255L) << 32 | (l6 & 255L) << 40 | (l7 & 255L) << 48);
	//   64   91:aload           16
	//   65   93:iload_1         
	//   66   94:bipush          7
	//   67   96:iadd            
	//   68   97:baload          
	//   69   98:i2l             
	//   70   99:ldc2w           #67  <Long 255L>
	//   71  102:land            
	//   72  103:bipush          56
	//   73  105:lshl            
	//   74  106:lload_2         
	//   75  107:ldc2w           #67  <Long 255L>
	//   76  110:land            
	//   77  111:lload           4
	//   78  113:ldc2w           #67  <Long 255L>
	//   79  116:land            
	//   80  117:bipush          8
	//   81  119:lshl            
	//   82  120:lor             
	//   83  121:lload           6
	//   84  123:ldc2w           #67  <Long 255L>
	//   85  126:land            
	//   86  127:bipush          16
	//   87  129:lshl            
	//   88  130:lor             
	//   89  131:lload           8
	//   90  133:ldc2w           #67  <Long 255L>
	//   91  136:land            
	//   92  137:bipush          24
	//   93  139:lshl            
	//   94  140:lor             
	//   95  141:lload           10
	//   96  143:ldc2w           #67  <Long 255L>
	//   97  146:land            
	//   98  147:bipush          32
	//   99  149:lshl            
	//  100  150:lor             
	//  101  151:lload           12
	//  102  153:ldc2w           #67  <Long 255L>
	//  103  156:land            
	//  104  157:bipush          40
	//  105  159:lshl            
	//  106  160:lor             
	//  107  161:lload           14
	//  108  163:ldc2w           #67  <Long 255L>
	//  109  166:land            
	//  110  167:bipush          48
	//  111  169:lshl            
	//  112  170:lor             
	//  113  171:lor             
	//  114  172:lreturn         
		} else
		{
			throw asu.a();
	//  115  173:invokestatic    #45  <Method asu asu.a()>
	//  116  176:athrow          
		}
	}

	private final void z()
	{
		f = f + g;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int f>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field int g>
	//    5    9:iadd            
	//    6   10:putfield        #27  <Field int f>
		int i1 = f;
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int f>
	//    9   17:istore_1        
		int j1 = i1 - i;
	//   10   18:iload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field int i>
	//   13   23:isub            
	//   14   24:istore_2        
		int k1 = k;
	//   15   25:aload_0         
	//   16   26:getfield        #23  <Field int k>
	//   17   29:istore_3        
		if(j1 > k1)
	//*  18   30:iload_2         
	//*  19   31:iload_3         
	//*  20   32:icmple          53
		{
			g = j1 - k1;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:iload_3         
	//   24   38:isub            
	//   25   39:putfield        #72  <Field int g>
			f = i1 - g;
	//   26   42:aload_0         
	//   27   43:iload_1         
	//   28   44:aload_0         
	//   29   45:getfield        #72  <Field int g>
	//   30   48:isub            
	//   31   49:putfield        #27  <Field int f>
			return;
	//   32   52:return          
		} else
		{
			g = 0;
	//   33   53:aload_0         
	//   34   54:iconst_0        
	//   35   55:putfield        #72  <Field int g>
			return;
	//   36   58:return          
		}
	}

	public final int a()
	{
		if(((arc)this).t())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #76  <Method boolean arc.t()>
	//*   2    4:ifeq            14
		{
			j = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #78  <Field int j>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		j = v();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #80  <Method int v()>
	//   11   19:putfield        #78  <Field int j>
		int i1 = j;
	//   12   22:aload_0         
	//   13   23:getfield        #78  <Field int j>
	//   14   26:istore_1        
		if(i1 >>> 3 != 0)
	//*  15   27:iload_1         
	//*  16   28:iconst_3        
	//*  17   29:iushr           
	//*  18   30:ifeq            35
			return i1;
	//   19   33:iload_1         
	//   20   34:ireturn         
		else
			throw asu.d();
	//   21   35:invokestatic    #82  <Method asu asu.d()>
	//   22   38:athrow          
	}

	public final atv a(aug aug1, ars ars)
	{
		int i1 = v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:istore_3        
		if(a < b)
	//*   3    5:aload_0         
	//*   4    6:getfield        #85  <Field int a>
	//*   5    9:aload_0         
	//*   6   10:getfield        #88  <Field int b>
	//*   7   13:icmpge          66
		{
			i1 = ((arc)this).d(i1);
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #91  <Method int arc.d(int)>
	//   11   21:istore_3        
			a = a + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #85  <Field int a>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #85  <Field int a>
			aug1 = ((aug) ((atv)aug1.a(((arc) (this)), ars)));
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:invokeinterface #96  <Method Object aug.a(arc, ars)>
	//   22   40:checkcast       #98  <Class atv>
	//   23   43:astore_1        
			((arc)this).a(0);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #101 <Method void arc.a(int)>
			a = a - 1;
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #85  <Field int a>
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:putfield        #85  <Field int a>
			((arc)this).e(i1);
	//   33   59:aload_0         
	//   34   60:iload_3         
	//   35   61:invokevirtual   #103 <Method void arc.e(int)>
			return ((atv) (aug1));
	//   36   64:aload_1         
	//   37   65:areturn         
		} else
		{
			throw asu.g();
	//   38   66:invokestatic    #105 <Method asu asu.g()>
	//   39   69:athrow          
		}
	}

	public final void a(int i1)
	{
		if(j == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field int j>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw asu.e();
	//    5    9:invokestatic    #107 <Method asu asu.e()>
	//    6   12:athrow          
	}

	public final double b()
	{
		return Double.longBitsToDouble(y());
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method long y()>
	//    2    4:invokestatic    #116 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public final boolean b(int i1)
	{
label0:
		{
label1:
			{
				boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
				int j1 = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
				switch(i1 & 7)
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
					throw asu.f();
	//    8   48:invokestatic    #120 <Method asv asu.f()>
	//    9   51:athrow          

				case 5: // '\005'
					((arc)this).f(4);
	//   10   52:aload_0         
	//   11   53:iconst_4        
	//   12   54:invokevirtual   #122 <Method void arc.f(int)>
					return true;
	//   13   57:iconst_1        
	//   14   58:ireturn         

				case 4: // '\004'
					return false;
	//   15   59:iconst_0        
	//   16   60:ireturn         

				case 3: // '\003'
					do
						j1 = ((arc)this).a();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #124 <Method int arc.a()>
	//   19   65:istore_2        
					while(j1 != 0 && ((arc)this).b(j1));
	//   20   66:iload_2         
	//   21   67:ifeq            78
	//   22   70:aload_0         
	//   23   71:iload_2         
	//   24   72:invokevirtual   #126 <Method boolean arc.b(int)>
	//   25   75:ifne            61
					((arc)this).a((i1 >>> 3) << 3 | 4);
	//   26   78:aload_0         
	//   27   79:iload_1         
	//   28   80:iconst_3        
	//   29   81:iushr           
	//   30   82:iconst_3        
	//   31   83:ishl            
	//   32   84:iconst_4        
	//   33   85:ior             
	//   34   86:invokevirtual   #101 <Method void arc.a(int)>
					return true;
	//   35   89:iconst_1        
	//   36   90:ireturn         

				case 2: // '\002'
					((arc)this).f(v());
	//   37   91:aload_0         
	//   38   92:aload_0         
	//   39   93:invokespecial   #80  <Method int v()>
	//   40   96:invokevirtual   #122 <Method void arc.f(int)>
					return true;
	//   41   99:iconst_1        
	//   42  100:ireturn         

				case 1: // '\001'
					((arc)this).f(8);
	//   43  101:aload_0         
	//   44  102:bipush          8
	//   45  104:invokevirtual   #122 <Method void arc.f(int)>
					return true;
	//   46  107:iconst_1        
	//   47  108:ireturn         

				case 0: // '\0'
					i1 = ((int) (flag));
	//   48  109:iload_3         
	//   49  110:istore_1        
					break;
				}
				if(f - h >= 10)
	//*  50  111:aload_0         
	//*  51  112:getfield        #27  <Field int f>
	//*  52  115:aload_0         
	//*  53  116:getfield        #29  <Field int h>
	//*  54  119:isub            
	//*  55  120:bipush          10
	//*  56  122:icmplt          169
				{
					for(i1 = j1; i1 < 10; i1++)
	//*  57  125:iload_2         
	//*  58  126:istore_1        
	//*  59  127:iload_1         
	//*  60  128:bipush          10
	//*  61  130:icmpge          165
					{
						byte abyte0[] = d;
	//   62  133:aload_0         
	//   63  134:getfield        #25  <Field byte[] d>
	//   64  137:astore          4
						int k1 = h;
	//   65  139:aload_0         
	//   66  140:getfield        #29  <Field int h>
	//   67  143:istore_2        
						h = k1 + 1;
	//   68  144:aload_0         
	//   69  145:iload_2         
	//   70  146:iconst_1        
	//   71  147:iadd            
	//   72  148:putfield        #29  <Field int h>
						if(abyte0[k1] >= 0)
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
					throw asu.c();
	//   82  165:invokestatic    #129 <Method asu asu.c()>
	//   83  168:athrow          
				}
				do
				{
					if(i1 >= 10)
						break label0;
	//   84  169:iload_1         
	//   85  170:bipush          10
	//   86  172:icmpge          191
					if(A() >= 0)
						break;
	//   87  175:aload_0         
	//   88  176:invokespecial   #131 <Method byte A()>
	//   89  179:ifge            189
					i1++;
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
		throw asu.c();
	//   97  191:invokestatic    #129 <Method asu asu.c()>
	//   98  194:athrow          
	}

	public final float c()
	{
		return Float.intBitsToFloat(x());
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method int x()>
	//    2    4:invokestatic    #140 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public final int d(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            36
		{
			i1 += ((arc)this).u();
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #143 <Method int arc.u()>
	//    5    9:iadd            
	//    6   10:istore_1        
			int j1 = k;
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field int k>
	//    9   15:istore_2        
			if(i1 <= j1)
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpgt          32
			{
				k = i1;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #23  <Field int k>
				z();
	//   16   26:aload_0         
	//   17   27:invokespecial   #145 <Method void z()>
				return j1;
	//   18   30:iload_2         
	//   19   31:ireturn         
			} else
			{
				throw asu.a();
	//   20   32:invokestatic    #45  <Method asu asu.a()>
	//   21   35:athrow          
			}
		} else
		{
			throw asu.b();
	//   22   36:invokestatic    #147 <Method asu asu.b()>
	//   23   39:athrow          
		}
	}

	public final long d()
	{
		return w();
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method long w()>
	//    2    4:lreturn         
	}

	public final long e()
	{
		return w();
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method long w()>
	//    2    4:lreturn         
	}

	public final void e(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int k>
		z();
	//    3    5:aload_0         
	//    4    6:invokespecial   #145 <Method void z()>
	//    5    9:return          
	}

	public final int f()
	{
		return v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:ireturn         
	}

	public final void f(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            29
		{
			int j1 = f;
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int f>
	//    4    8:istore_2        
			int k1 = h;
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field int h>
	//    7   13:istore_3        
			if(i1 <= j1 - k1)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:isub            
	//*  12   18:icmpgt          29
			{
				h = k1 + i1;
	//   13   21:aload_0         
	//   14   22:iload_3         
	//   15   23:iload_1         
	//   16   24:iadd            
	//   17   25:putfield        #29  <Field int h>
				return;
	//   18   28:return          
			}
		}
		if(i1 < 0)
	//*  19   29:iload_1         
	//*  20   30:ifge            37
			throw asu.b();
	//   21   33:invokestatic    #147 <Method asu asu.b()>
	//   22   36:athrow          
		else
			throw asu.a();
	//   23   37:invokestatic    #45  <Method asu asu.a()>
	//   24   40:athrow          
	}

	public final long g()
	{
		return y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method long y()>
	//    2    4:lreturn         
	}

	public final int h()
	{
		return x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method int x()>
	//    2    4:ireturn         
	}

	public final boolean i()
	{
		return w() != 0L;
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method long w()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final String j()
	{
		int i1 = v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:istore_1        
		if(i1 > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            57
		{
			int j1 = f;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int f>
	//    7   13:istore_2        
			int k1 = h;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int h>
	//   10   18:istore_3        
			if(i1 <= j1 - k1)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          57
			{
				String s1 = new String(d, k1, i1, aso.a);
	//   16   26:new             #152 <Class String>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field byte[] d>
	//   20   34:iload_3         
	//   21   35:iload_1         
	//   22   36:getstatic       #157 <Field java.nio.charset.Charset aso.a>
	//   23   39:invokespecial   #160 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   24   42:astore          4
				h = h + i1;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #29  <Field int h>
	//   28   49:iload_1         
	//   29   50:iadd            
	//   30   51:putfield        #29  <Field int h>
				return s1;
	//   31   54:aload           4
	//   32   56:areturn         
			}
		}
		if(i1 == 0)
	//*  33   57:iload_1         
	//*  34   58:ifne            64
			return "";
	//   35   61:ldc1            #162 <String "">
	//   36   63:areturn         
		if(i1 < 0)
	//*  37   64:iload_1         
	//*  38   65:ifge            72
			throw asu.b();
	//   39   68:invokestatic    #147 <Method asu asu.b()>
	//   40   71:athrow          
		else
			throw asu.a();
	//   41   72:invokestatic    #45  <Method asu asu.a()>
	//   42   75:athrow          
	}

	public final String k()
	{
		int i1 = v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:istore_1        
		if(i1 > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            50
		{
			int j1 = f;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int f>
	//    7   13:istore_2        
			int k1 = h;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int h>
	//   10   18:istore_3        
			if(i1 <= j1 - k1)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          50
			{
				String s1 = avs.b(d, k1, i1);
	//   16   26:aload_0         
	//   17   27:getfield        #25  <Field byte[] d>
	//   18   30:iload_3         
	//   19   31:iload_1         
	//   20   32:invokestatic    #167 <Method String avs.b(byte[], int, int)>
	//   21   35:astore          4
				h = h + i1;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #29  <Field int h>
	//   25   42:iload_1         
	//   26   43:iadd            
	//   27   44:putfield        #29  <Field int h>
				return s1;
	//   28   47:aload           4
	//   29   49:areturn         
			}
		}
		if(i1 == 0)
	//*  30   50:iload_1         
	//*  31   51:ifne            57
			return "";
	//   32   54:ldc1            #162 <String "">
	//   33   56:areturn         
		if(i1 <= 0)
	//*  34   57:iload_1         
	//*  35   58:ifgt            65
			throw asu.b();
	//   36   61:invokestatic    #147 <Method asu asu.b()>
	//   37   64:athrow          
		else
			throw asu.a();
	//   38   65:invokestatic    #45  <Method asu asu.a()>
	//   39   68:athrow          
	}

	public final aqq l()
	{
label0:
		{
label1:
			{
				byte abyte0[];
label2:
				{
					int i1 = v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:istore_1        
					if(i1 > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            50
					{
						int j1 = f;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int f>
	//    7   13:istore_2        
						int l1 = h;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int h>
	//   10   18:istore_3        
						if(i1 <= j1 - l1)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          50
						{
							aqq aqq1 = aqq.a(d, l1, i1);
	//   16   26:aload_0         
	//   17   27:getfield        #25  <Field byte[] d>
	//   18   30:iload_3         
	//   19   31:iload_1         
	//   20   32:invokestatic    #174 <Method aqq aqq.a(byte[], int, int)>
	//   21   35:astore          4
							h = h + i1;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #29  <Field int h>
	//   25   42:iload_1         
	//   26   43:iadd            
	//   27   44:putfield        #29  <Field int h>
							return aqq1;
	//   28   47:aload           4
	//   29   49:areturn         
						}
					}
					if(i1 == 0)
	//*  30   50:iload_1         
	//*  31   51:ifne            58
						return aqq.a;
	//   32   54:getstatic       #177 <Field aqq aqq.a>
	//   33   57:areturn         
					if(i1 > 0)
	//*  34   58:iload_1         
	//*  35   59:ifle            103
					{
						int k1 = f;
	//   36   62:aload_0         
	//   37   63:getfield        #27  <Field int f>
	//   38   66:istore_2        
						int i2 = h;
	//   39   67:aload_0         
	//   40   68:getfield        #29  <Field int h>
	//   41   71:istore_3        
						if(i1 <= k1 - i2)
	//*  42   72:iload_1         
	//*  43   73:iload_2         
	//*  44   74:iload_3         
	//*  45   75:isub            
	//*  46   76:icmpgt          103
						{
							h = i1 + i2;
	//   47   79:aload_0         
	//   48   80:iload_1         
	//   49   81:iload_3         
	//   50   82:iadd            
	//   51   83:putfield        #29  <Field int h>
							abyte0 = Arrays.copyOfRange(d, i2, h);
	//   52   86:aload_0         
	//   53   87:getfield        #25  <Field byte[] d>
	//   54   90:iload_3         
	//   55   91:aload_0         
	//   56   92:getfield        #29  <Field int h>
	//   57   95:invokestatic    #183 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   58   98:astore          4
							break label2;
	//   59  100:goto            116
						}
					}
					if(i1 > 0)
						break label0;
	//   60  103:iload_1         
	//   61  104:ifgt            126
					if(i1 != 0)
						break label1;
	//   62  107:iload_1         
	//   63  108:ifne            122
					abyte0 = aso.b;
	//   64  111:getstatic       #185 <Field byte[] aso.b>
	//   65  114:astore          4
				}
				return aqq.b(abyte0);
	//   66  116:aload           4
	//   67  118:invokestatic    #188 <Method aqq aqq.b(byte[])>
	//   68  121:areturn         
			}
			throw asu.b();
	//   69  122:invokestatic    #147 <Method asu asu.b()>
	//   70  125:athrow          
		}
		throw asu.a();
	//   71  126:invokestatic    #45  <Method asu asu.a()>
	//   72  129:athrow          
	}

	public final int m()
	{
		return v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:ireturn         
	}

	public final int n()
	{
		return v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:ireturn         
	}

	public final int o()
	{
		return x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method int x()>
	//    2    4:ireturn         
	}

	public final long p()
	{
		return y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method long y()>
	//    2    4:lreturn         
	}

	public final int q()
	{
		return g(v());
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method int v()>
	//    2    4:invokestatic    #195 <Method int g(int)>
	//    3    7:ireturn         
	}

	public final long r()
	{
		return a(w());
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method long w()>
	//    2    4:invokestatic    #199 <Method long a(long)>
	//    3    7:lreturn         
	}

	final long s()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		for(int i1 = 0; i1 < 64; i1 += 7)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = A();
	//    7   10:aload_0         
	//    8   11:invokespecial   #131 <Method byte A()>
	//    9   14:istore_2        
			l1 |= (long)(byte0 & 0x7f) << i1;
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
				return l1;
	//   23   33:lload_3         
	//   24   34:lreturn         
		}

	//   25   35:iload_1         
	//   26   36:bipush          7
	//   27   38:iadd            
	//   28   39:istore_1        
	//*  29   40:goto            4
		throw asu.c();
	//   30   43:invokestatic    #129 <Method asu asu.c()>
	//   31   46:athrow          
	}

	public final boolean t()
	{
		return h == f;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int f>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final int u()
	{
		return h - i;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int h>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int i>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private final byte d[];
	private final boolean e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
}
