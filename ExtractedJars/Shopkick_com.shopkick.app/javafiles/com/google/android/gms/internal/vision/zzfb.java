// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzez, zzgf, zzga, zzhq, 
//			zzhf, zziw, zzeo, zzfa, 
//			zzfk

final class zzfb extends zzez
{

	private zzfb(byte abyte0[], int i, int j, boolean flag)
	{
		super(((zzfa) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void zzez(zzfa)>
		zzso = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #21  <Int 0x7fffffff>
	//    5    8:putfield        #23  <Field int zzso>
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
		zzsm = pos;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #29  <Field int pos>
	//   20   33:putfield        #31  <Field int zzsm>
		zzsk = flag;
	//   21   36:aload_0         
	//   22   37:iload           4
	//   23   39:putfield        #33  <Field boolean zzsk>
	//   24   42:return          
	}

	zzfb(byte abyte0[], int i, int j, boolean flag, zzfa zzfa)
	{
		this(abyte0, i, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void zzfb(byte[], int, int, boolean)>
	//    6    9:return          
	}

	private final int zzdt()
		throws IOException
	{
label0:
		{
			int i;
			int j;
label1:
			{
				int k = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_3        
				i = limit;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int limit>
	//    5    9:istore_1        
				if(i == k)
					break label0;
	//    6   10:iload_1         
	//    7   11:iload_3         
	//    8   12:icmpeq          254
				byte abyte0[] = buffer;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] buffer>
	//   11   19:astore          6
				j = k + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
				k = ((int) (abyte0[k]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
				if(k >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            41
				{
					pos = j;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #29  <Field int pos>
					return k;
	//   25   39:iload_3         
	//   26   40:ireturn         
				}
				if(i - j < 9)
					break label0;
	//   27   41:iload_1         
	//   28   42:iload_2         
	//   29   43:isub            
	//   30   44:bipush          9
	//   31   46:icmplt          254
				i = j + 1;
	//   32   49:iload_2         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_1        
				k ^= abyte0[j] << 7;
	//   36   53:iload_3         
	//   37   54:aload           6
	//   38   56:iload_2         
	//   39   57:baload          
	//   40   58:bipush          7
	//   41   60:ishl            
	//   42   61:ixor            
	//   43   62:istore_3        
				if(k < 0)
	//*  44   63:iload_3         
	//*  45   64:ifge            75
				{
					j = k ^ 0xffffff80;
	//   46   67:iload_3         
	//   47   68:bipush          -128
	//   48   70:ixor            
	//   49   71:istore_2        
					break label1;
	//   50   72:goto            247
				}
				j = i + 1;
	//   51   75:iload_1         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:istore_2        
				k ^= abyte0[i] << 14;
	//   55   79:iload_3         
	//   56   80:aload           6
	//   57   82:iload_1         
	//   58   83:baload          
	//   59   84:bipush          14
	//   60   86:ishl            
	//   61   87:ixor            
	//   62   88:istore_3        
				if(k >= 0)
	//*  63   89:iload_3         
	//*  64   90:iflt            106
				{
					k ^= 0x3f80;
	//   65   93:iload_3         
	//   66   94:sipush          16256
	//   67   97:ixor            
	//   68   98:istore_3        
					i = j;
	//   69   99:iload_2         
	//   70  100:istore_1        
					j = k;
	//   71  101:iload_3         
	//   72  102:istore_2        
					break label1;
	//   73  103:goto            247
				}
				i = j + 1;
	//   74  106:iload_2         
	//   75  107:iconst_1        
	//   76  108:iadd            
	//   77  109:istore_1        
				k ^= abyte0[j] << 21;
	//   78  110:iload_3         
	//   79  111:aload           6
	//   80  113:iload_2         
	//   81  114:baload          
	//   82  115:bipush          21
	//   83  117:ishl            
	//   84  118:ixor            
	//   85  119:istore_3        
				if(k < 0)
	//*  86  120:iload_3         
	//*  87  121:ifge            132
				{
					j = k ^ 0xffe03f80;
	//   88  124:iload_3         
	//   89  125:ldc1            #42  <Int 0xffe03f80>
	//   90  127:ixor            
	//   91  128:istore_2        
					break label1;
	//   92  129:goto            247
				}
				int l = i + 1;
	//   93  132:iload_1         
	//   94  133:iconst_1        
	//   95  134:iadd            
	//   96  135:istore          4
				j = ((int) (abyte0[i]));
	//   97  137:aload           6
	//   98  139:iload_1         
	//   99  140:baload          
	//  100  141:istore_2        
				k = k ^ j << 28 ^ 0xfe03f80;
	//  101  142:iload_3         
	//  102  143:iload_2         
	//  103  144:bipush          28
	//  104  146:ishl            
	//  105  147:ixor            
	//  106  148:ldc1            #43  <Int 0xfe03f80>
	//  107  150:ixor            
	//  108  151:istore_3        
				i = l;
	//  109  152:iload           4
	//  110  154:istore_1        
				if(j < 0)
	//* 111  155:iload_2         
	//* 112  156:ifge            245
				{
					int i1 = l + 1;
	//  113  159:iload           4
	//  114  161:iconst_1        
	//  115  162:iadd            
	//  116  163:istore          5
					j = k;
	//  117  165:iload_3         
	//  118  166:istore_2        
					i = i1;
	//  119  167:iload           5
	//  120  169:istore_1        
					if(abyte0[l] >= 0)
						break label1;
	//  121  170:aload           6
	//  122  172:iload           4
	//  123  174:baload          
	//  124  175:ifge            247
					l = i1 + 1;
	//  125  178:iload           5
	//  126  180:iconst_1        
	//  127  181:iadd            
	//  128  182:istore          4
					i = l;
	//  129  184:iload           4
	//  130  186:istore_1        
					if(abyte0[i1] < 0)
	//* 131  187:aload           6
	//* 132  189:iload           5
	//* 133  191:baload          
	//* 134  192:ifge            245
					{
						int j1 = l + 1;
	//  135  195:iload           4
	//  136  197:iconst_1        
	//  137  198:iadd            
	//  138  199:istore          5
						j = k;
	//  139  201:iload_3         
	//  140  202:istore_2        
						i = j1;
	//  141  203:iload           5
	//  142  205:istore_1        
						if(abyte0[l] >= 0)
							break label1;
	//  143  206:aload           6
	//  144  208:iload           4
	//  145  210:baload          
	//  146  211:ifge            247
						j = j1 + 1;
	//  147  214:iload           5
	//  148  216:iconst_1        
	//  149  217:iadd            
	//  150  218:istore_2        
						i = j;
	//  151  219:iload_2         
	//  152  220:istore_1        
						if(abyte0[j1] < 0)
	//* 153  221:aload           6
	//* 154  223:iload           5
	//* 155  225:baload          
	//* 156  226:ifge            245
						{
							i = j + 1;
	//  157  229:iload_2         
	//  158  230:iconst_1        
	//  159  231:iadd            
	//  160  232:istore_1        
							if(abyte0[j] < 0)
								break label0;
	//  161  233:aload           6
	//  162  235:iload_2         
	//  163  236:baload          
	//  164  237:iflt            254
							j = k;
	//  165  240:iload_3         
	//  166  241:istore_2        
							break label1;
	//  167  242:goto            247
						}
					}
				}
				j = k;
	//  168  245:iload_3         
	//  169  246:istore_2        
			}
			pos = i;
	//  170  247:aload_0         
	//  171  248:iload_1         
	//  172  249:putfield        #29  <Field int pos>
			return j;
	//  173  252:iload_2         
	//  174  253:ireturn         
		}
		return (int)((zzez)this).zzdr();
	//  175  254:aload_0         
	//  176  255:invokevirtual   #47  <Method long zzez.zzdr()>
	//  177  258:l2i             
	//  178  259:ireturn         
	}

	private final long zzdu()
		throws IOException
	{
label0:
		{
			int j1 = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_3        
			int i = limit;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int limit>
	//    5    9:istore_1        
			if(i == j1)
				break label0;
	//    6   10:iload_1         
	//    7   11:iload_3         
	//    8   12:icmpeq          340
			byte abyte0[] = buffer;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] buffer>
	//   11   19:astore          6
			int j = j1 + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
			j1 = ((int) (abyte0[j1]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
			if(j1 >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            42
			{
				pos = j;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #29  <Field int pos>
				return (long)j1;
	//   25   39:iload_3         
	//   26   40:i2l             
	//   27   41:lreturn         
			}
			if(i - j < 9)
				break label0;
	//   28   42:iload_1         
	//   29   43:iload_2         
	//   30   44:isub            
	//   31   45:bipush          9
	//   32   47:icmplt          340
			i = j + 1;
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:istore_1        
			j1 ^= abyte0[j] << 7;
	//   37   54:iload_3         
	//   38   55:aload           6
	//   39   57:iload_2         
	//   40   58:baload          
	//   41   59:bipush          7
	//   42   61:ishl            
	//   43   62:ixor            
	//   44   63:istore_3        
			long l1;
			if(j1 < 0)
	//*  45   64:iload_3         
	//*  46   65:ifge            78
			{
				l1 = j1 ^ 0xffffff80;
	//   47   68:iload_3         
	//   48   69:bipush          -128
	//   49   71:ixor            
	//   50   72:i2l             
	//   51   73:lstore          4
			} else
	//*  52   75:goto            332
			{
				int k = i + 1;
	//   53   78:iload_1         
	//   54   79:iconst_1        
	//   55   80:iadd            
	//   56   81:istore_2        
				j1 ^= abyte0[i] << 14;
	//   57   82:iload_3         
	//   58   83:aload           6
	//   59   85:iload_1         
	//   60   86:baload          
	//   61   87:bipush          14
	//   62   89:ishl            
	//   63   90:ixor            
	//   64   91:istore_3        
				if(j1 >= 0)
	//*  65   92:iload_3         
	//*  66   93:iflt            109
				{
					l1 = j1 ^ 0x3f80;
	//   67   96:iload_3         
	//   68   97:sipush          16256
	//   69  100:ixor            
	//   70  101:i2l             
	//   71  102:lstore          4
					i = k;
	//   72  104:iload_2         
	//   73  105:istore_1        
				} else
	//*  74  106:goto            332
				{
					i = k + 1;
	//   75  109:iload_2         
	//   76  110:iconst_1        
	//   77  111:iadd            
	//   78  112:istore_1        
					k = j1 ^ abyte0[k] << 21;
	//   79  113:iload_3         
	//   80  114:aload           6
	//   81  116:iload_2         
	//   82  117:baload          
	//   83  118:bipush          21
	//   84  120:ishl            
	//   85  121:ixor            
	//   86  122:istore_2        
					if(k < 0)
	//*  87  123:iload_2         
	//*  88  124:ifge            137
					{
						l1 = k ^ 0xffe03f80;
	//   89  127:iload_2         
	//   90  128:ldc1            #42  <Int 0xffe03f80>
	//   91  130:ixor            
	//   92  131:i2l             
	//   93  132:lstore          4
					} else
	//*  94  134:goto            332
					{
						l1 = k;
	//   95  137:iload_2         
	//   96  138:i2l             
	//   97  139:lstore          4
						k = i + 1;
	//   98  141:iload_1         
	//   99  142:iconst_1        
	//  100  143:iadd            
	//  101  144:istore_2        
						l1 ^= (long)abyte0[i] << 28;
	//  102  145:lload           4
	//  103  147:aload           6
	//  104  149:iload_1         
	//  105  150:baload          
	//  106  151:i2l             
	//  107  152:bipush          28
	//  108  154:lshl            
	//  109  155:lxor            
	//  110  156:lstore          4
						if(l1 >= 0L)
	//* 111  158:lload           4
	//* 112  160:lconst_0        
	//* 113  161:lcmp            
	//* 114  162:iflt            178
						{
							l1 ^= 0xfe03f80L;
	//  115  165:lload           4
	//  116  167:ldc2w           #50  <Long 0xfe03f80L>
	//  117  170:lxor            
	//  118  171:lstore          4
							i = k;
	//  119  173:iload_2         
	//  120  174:istore_1        
						} else
	//* 121  175:goto            332
						{
							i = k + 1;
	//  122  178:iload_2         
	//  123  179:iconst_1        
	//  124  180:iadd            
	//  125  181:istore_1        
							l1 ^= (long)abyte0[k] << 35;
	//  126  182:lload           4
	//  127  184:aload           6
	//  128  186:iload_2         
	//  129  187:baload          
	//  130  188:i2l             
	//  131  189:bipush          35
	//  132  191:lshl            
	//  133  192:lxor            
	//  134  193:lstore          4
							if(l1 < 0L)
	//* 135  195:lload           4
	//* 136  197:lconst_0        
	//* 137  198:lcmp            
	//* 138  199:ifge            213
							{
								l1 ^= 0xfe03f80L;
	//  139  202:lload           4
	//  140  204:ldc2w           #52  <Long 0xfe03f80L>
	//  141  207:lxor            
	//  142  208:lstore          4
							} else
	//* 143  210:goto            332
							{
								int l = i + 1;
	//  144  213:iload_1         
	//  145  214:iconst_1        
	//  146  215:iadd            
	//  147  216:istore_2        
								l1 ^= (long)abyte0[i] << 42;
	//  148  217:lload           4
	//  149  219:aload           6
	//  150  221:iload_1         
	//  151  222:baload          
	//  152  223:i2l             
	//  153  224:bipush          42
	//  154  226:lshl            
	//  155  227:lxor            
	//  156  228:lstore          4
								if(l1 >= 0L)
	//* 157  230:lload           4
	//* 158  232:lconst_0        
	//* 159  233:lcmp            
	//* 160  234:iflt            250
								{
									l1 ^= 0xfe03f80L;
	//  161  237:lload           4
	//  162  239:ldc2w           #54  <Long 0xfe03f80L>
	//  163  242:lxor            
	//  164  243:lstore          4
									i = l;
	//  165  245:iload_2         
	//  166  246:istore_1        
								} else
	//* 167  247:goto            332
								{
									i = l + 1;
	//  168  250:iload_2         
	//  169  251:iconst_1        
	//  170  252:iadd            
	//  171  253:istore_1        
									l1 ^= (long)abyte0[l] << 49;
	//  172  254:lload           4
	//  173  256:aload           6
	//  174  258:iload_2         
	//  175  259:baload          
	//  176  260:i2l             
	//  177  261:bipush          49
	//  178  263:lshl            
	//  179  264:lxor            
	//  180  265:lstore          4
									if(l1 < 0L)
	//* 181  267:lload           4
	//* 182  269:lconst_0        
	//* 183  270:lcmp            
	//* 184  271:ifge            285
									{
										l1 ^= 0xfe03f80L;
	//  185  274:lload           4
	//  186  276:ldc2w           #56  <Long 0xfe03f80L>
	//  187  279:lxor            
	//  188  280:lstore          4
									} else
	//* 189  282:goto            332
									{
										int i1 = i + 1;
	//  190  285:iload_1         
	//  191  286:iconst_1        
	//  192  287:iadd            
	//  193  288:istore_2        
										l1 = l1 ^ (long)abyte0[i] << 56 ^ 0xfe03f80L;
	//  194  289:lload           4
	//  195  291:aload           6
	//  196  293:iload_1         
	//  197  294:baload          
	//  198  295:i2l             
	//  199  296:bipush          56
	//  200  298:lshl            
	//  201  299:lxor            
	//  202  300:ldc2w           #58  <Long 0xfe03f80L>
	//  203  303:lxor            
	//  204  304:lstore          4
										if(l1 < 0L)
	//* 205  306:lload           4
	//* 206  308:lconst_0        
	//* 207  309:lcmp            
	//* 208  310:ifge            330
										{
											i = i1 + 1;
	//  209  313:iload_2         
	//  210  314:iconst_1        
	//  211  315:iadd            
	//  212  316:istore_1        
											if((long)abyte0[i1] < 0L)
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
											i = i1;
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
			pos = i;
	//  223  332:aload_0         
	//  224  333:iload_1         
	//  225  334:putfield        #29  <Field int pos>
			return l1;
	//  226  337:lload           4
	//  227  339:lreturn         
		}
		return ((zzez)this).zzdr();
	//  228  340:aload_0         
	//  229  341:invokevirtual   #47  <Method long zzez.zzdr()>
	//  230  344:lreturn         
	}

	private final int zzdv()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit - i >= 4)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:iconst_4        
	//*   8   12:icmplt          87
		{
			byte abyte0[] = buffer;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field byte[] buffer>
	//   11   19:astore          5
			pos = i + 4;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:iconst_4        
	//   15   24:iadd            
	//   16   25:putfield        #29  <Field int pos>
			byte byte0 = abyte0[i];
	//   17   28:aload           5
	//   18   30:iload_1         
	//   19   31:baload          
	//   20   32:istore_2        
			byte byte1 = abyte0[i + 1];
	//   21   33:aload           5
	//   22   35:iload_1         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:baload          
	//   26   39:istore_3        
			byte byte2 = abyte0[i + 2];
	//   27   40:aload           5
	//   28   42:iload_1         
	//   29   43:iconst_2        
	//   30   44:iadd            
	//   31   45:baload          
	//   32   46:istore          4
			return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
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
			throw zzgf.zzfh();
	//   59   87:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   60   90:athrow          
		}
	}

	private final long zzdw()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(limit - i >= 8)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:bipush          8
	//*   8   13:icmplt          173
		{
			byte abyte0[] = buffer;
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field byte[] buffer>
	//   11   20:astore          16
			pos = i + 8;
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:bipush          8
	//   15   26:iadd            
	//   16   27:putfield        #29  <Field int pos>
			long l = abyte0[i];
	//   17   30:aload           16
	//   18   32:iload_1         
	//   19   33:baload          
	//   20   34:i2l             
	//   21   35:lstore_2        
			long l1 = abyte0[i + 1];
	//   22   36:aload           16
	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:baload          
	//   27   42:i2l             
	//   28   43:lstore          4
			long l2 = abyte0[i + 2];
	//   29   45:aload           16
	//   30   47:iload_1         
	//   31   48:iconst_2        
	//   32   49:iadd            
	//   33   50:baload          
	//   34   51:i2l             
	//   35   52:lstore          6
			long l3 = abyte0[i + 3];
	//   36   54:aload           16
	//   37   56:iload_1         
	//   38   57:iconst_3        
	//   39   58:iadd            
	//   40   59:baload          
	//   41   60:i2l             
	//   42   61:lstore          8
			long l4 = abyte0[i + 4];
	//   43   63:aload           16
	//   44   65:iload_1         
	//   45   66:iconst_4        
	//   46   67:iadd            
	//   47   68:baload          
	//   48   69:i2l             
	//   49   70:lstore          10
			long l5 = abyte0[i + 5];
	//   50   72:aload           16
	//   51   74:iload_1         
	//   52   75:iconst_5        
	//   53   76:iadd            
	//   54   77:baload          
	//   55   78:i2l             
	//   56   79:lstore          12
			long l6 = abyte0[i + 6];
	//   57   81:aload           16
	//   58   83:iload_1         
	//   59   84:bipush          6
	//   60   86:iadd            
	//   61   87:baload          
	//   62   88:i2l             
	//   63   89:lstore          14
			return ((long)abyte0[i + 7] & 255L) << 56 | (l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
	//   64   91:aload           16
	//   65   93:iload_1         
	//   66   94:bipush          7
	//   67   96:iadd            
	//   68   97:baload          
	//   69   98:i2l             
	//   70   99:ldc2w           #68  <Long 255L>
	//   71  102:land            
	//   72  103:bipush          56
	//   73  105:lshl            
	//   74  106:lload_2         
	//   75  107:ldc2w           #68  <Long 255L>
	//   76  110:land            
	//   77  111:lload           4
	//   78  113:ldc2w           #68  <Long 255L>
	//   79  116:land            
	//   80  117:bipush          8
	//   81  119:lshl            
	//   82  120:lor             
	//   83  121:lload           6
	//   84  123:ldc2w           #68  <Long 255L>
	//   85  126:land            
	//   86  127:bipush          16
	//   87  129:lshl            
	//   88  130:lor             
	//   89  131:lload           8
	//   90  133:ldc2w           #68  <Long 255L>
	//   91  136:land            
	//   92  137:bipush          24
	//   93  139:lshl            
	//   94  140:lor             
	//   95  141:lload           10
	//   96  143:ldc2w           #68  <Long 255L>
	//   97  146:land            
	//   98  147:bipush          32
	//   99  149:lshl            
	//  100  150:lor             
	//  101  151:lload           12
	//  102  153:ldc2w           #68  <Long 255L>
	//  103  156:land            
	//  104  157:bipush          40
	//  105  159:lshl            
	//  106  160:lor             
	//  107  161:lload           14
	//  108  163:ldc2w           #68  <Long 255L>
	//  109  166:land            
	//  110  167:bipush          48
	//  111  169:lshl            
	//  112  170:lor             
	//  113  171:lor             
	//  114  172:lreturn         
		} else
		{
			throw zzgf.zzfh();
	//  115  173:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//  116  176:athrow          
		}
	}

	private final void zzdx()
	{
		limit = limit + zzsl;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int limit>
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field int zzsl>
	//    5    9:iadd            
	//    6   10:putfield        #27  <Field int limit>
		int i = limit;
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int limit>
	//    9   17:istore_1        
		int j = i - zzsm;
	//   10   18:iload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field int zzsm>
	//   13   23:isub            
	//   14   24:istore_2        
		int k = zzso;
	//   15   25:aload_0         
	//   16   26:getfield        #23  <Field int zzso>
	//   17   29:istore_3        
		if(j > k)
	//*  18   30:iload_2         
	//*  19   31:iload_3         
	//*  20   32:icmple          53
		{
			zzsl = j - k;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:iload_3         
	//   24   38:isub            
	//   25   39:putfield        #73  <Field int zzsl>
			limit = i - zzsl;
	//   26   42:aload_0         
	//   27   43:iload_1         
	//   28   44:aload_0         
	//   29   45:getfield        #73  <Field int zzsl>
	//   30   48:isub            
	//   31   49:putfield        #27  <Field int limit>
			return;
	//   32   52:return          
		} else
		{
			zzsl = 0;
	//   33   53:aload_0         
	//   34   54:iconst_0        
	//   35   55:putfield        #73  <Field int zzsl>
			return;
	//   36   58:return          
		}
	}

	private final byte zzdy()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:istore_1        
		if(i != limit)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #27  <Field int limit>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field byte[] buffer>
	//    9   17:astore_2        
			pos = i + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #29  <Field int pos>
			return abyte0[i];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw zzgf.zzfh();
	//   19   29:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   20   32:athrow          
		}
	}

	public final double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(zzdw());
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzdw()>
	//    2    4:invokestatic    #85  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public final float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(zzdv());
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzdv()>
	//    2    4:invokestatic    #95  <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public final String readString()
		throws IOException
	{
		int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            57
		{
			int j = limit;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int limit>
	//    7   13:istore_2        
			int k = pos;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int pos>
	//   10   18:istore_3        
			if(i <= j - k)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          57
			{
				String s = new String(buffer, k, i, zzga.UTF_8);
	//   16   26:new             #101 <Class String>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field byte[] buffer>
	//   20   34:iload_3         
	//   21   35:iload_1         
	//   22   36:getstatic       #107 <Field java.nio.charset.Charset zzga.UTF_8>
	//   23   39:invokespecial   #110 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   24   42:astore          4
				pos = pos + i;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #29  <Field int pos>
	//   28   49:iload_1         
	//   29   50:iadd            
	//   30   51:putfield        #29  <Field int pos>
				return s;
	//   31   54:aload           4
	//   32   56:areturn         
			}
		}
		if(i == 0)
	//*  33   57:iload_1         
	//*  34   58:ifne            64
			return "";
	//   35   61:ldc1            #112 <String "">
	//   36   63:areturn         
		if(i < 0)
	//*  37   64:iload_1         
	//*  38   65:ifge            72
			throw zzgf.zzfi();
	//   39   68:invokestatic    #115 <Method zzgf zzgf.zzfi()>
	//   40   71:athrow          
		else
			throw zzgf.zzfh();
	//   41   72:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   42   75:athrow          
	}

	public final zzhf zza(zzhq zzhq1, zzfk zzfk)
		throws IOException
	{
		int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:istore_3        
		if(zzsf < zzsg)
	//*   3    5:aload_0         
	//*   4    6:getfield        #120 <Field int zzsf>
	//*   5    9:aload_0         
	//*   6   10:getfield        #123 <Field int zzsg>
	//*   7   13:icmpge          66
		{
			i = ((zzez)this).zzan(i);
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #127 <Method int zzez.zzan(int)>
	//   11   21:istore_3        
			zzsf = zzsf + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #120 <Field int zzsf>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #120 <Field int zzsf>
			zzhq1 = ((zzhq) ((zzhf)zzhq1.zza(((zzez) (this)), zzfk)));
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:invokeinterface #132 <Method Object zzhq.zza(zzez, zzfk)>
	//   22   40:checkcast       #134 <Class zzhf>
	//   23   43:astore_1        
			((zzez)this).zzak(0);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #138 <Method void zzez.zzak(int)>
			zzsf = zzsf - 1;
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #120 <Field int zzsf>
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:putfield        #120 <Field int zzsf>
			((zzez)this).zzao(i);
	//   33   59:aload_0         
	//   34   60:iload_3         
	//   35   61:invokevirtual   #141 <Method void zzez.zzao(int)>
			return ((zzhf) (zzhq1));
	//   36   64:aload_1         
	//   37   65:areturn         
		} else
		{
			throw zzgf.zzfn();
	//   38   66:invokestatic    #144 <Method zzgf zzgf.zzfn()>
	//   39   69:athrow          
		}
	}

	public final void zzak(int i)
		throws zzgf
	{
		if(zzsn == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int zzsn>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw zzgf.zzfl();
	//    5    9:invokestatic    #151 <Method zzgf zzgf.zzfl()>
	//    6   12:athrow          
	}

	public final boolean zzal(int i)
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
					throw zzgf.zzfm();
	//    8   48:invokestatic    #157 <Method zzgg zzgf.zzfm()>
	//    9   51:athrow          

				case 5: // '\005'
					((zzez)this).zzap(4);
	//   10   52:aload_0         
	//   11   53:iconst_4        
	//   12   54:invokevirtual   #160 <Method void zzez.zzap(int)>
					return true;
	//   13   57:iconst_1        
	//   14   58:ireturn         

				case 4: // '\004'
					return false;
	//   15   59:iconst_0        
	//   16   60:ireturn         

				case 3: // '\003'
					do
						j = ((zzez)this).zzdq();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #163 <Method int zzez.zzdq()>
	//   19   65:istore_2        
					while(j != 0 && ((zzez)this).zzal(j));
	//   20   66:iload_2         
	//   21   67:ifeq            78
	//   22   70:aload_0         
	//   23   71:iload_2         
	//   24   72:invokevirtual   #165 <Method boolean zzez.zzal(int)>
	//   25   75:ifne            61
					((zzez)this).zzak((i >>> 3) << 3 | 4);
	//   26   78:aload_0         
	//   27   79:iload_1         
	//   28   80:iconst_3        
	//   29   81:iushr           
	//   30   82:iconst_3        
	//   31   83:ishl            
	//   32   84:iconst_4        
	//   33   85:ior             
	//   34   86:invokevirtual   #138 <Method void zzez.zzak(int)>
					return true;
	//   35   89:iconst_1        
	//   36   90:ireturn         

				case 2: // '\002'
					((zzez)this).zzap(zzdt());
	//   37   91:aload_0         
	//   38   92:aload_0         
	//   39   93:invokespecial   #99  <Method int zzdt()>
	//   40   96:invokevirtual   #160 <Method void zzez.zzap(int)>
					return true;
	//   41   99:iconst_1        
	//   42  100:ireturn         

				case 1: // '\001'
					((zzez)this).zzap(8);
	//   43  101:aload_0         
	//   44  102:bipush          8
	//   45  104:invokevirtual   #160 <Method void zzez.zzap(int)>
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
					throw zzgf.zzfj();
	//   82  165:invokestatic    #168 <Method zzgf zzgf.zzfj()>
	//   83  168:athrow          
				}
				do
				{
					if(i >= 10)
						break label0;
	//   84  169:iload_1         
	//   85  170:bipush          10
	//   86  172:icmpge          191
					if(zzdy() >= 0)
						break;
	//   87  175:aload_0         
	//   88  176:invokespecial   #170 <Method byte zzdy()>
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
		throw zzgf.zzfj();
	//   97  191:invokestatic    #168 <Method zzgf zzgf.zzfj()>
	//   98  194:athrow          
	}

	public final int zzan(int i)
		throws zzgf
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            36
		{
			i += ((zzez)this).zzds();
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #173 <Method int zzez.zzds()>
	//    5    9:iadd            
	//    6   10:istore_1        
			int j = zzso;
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field int zzso>
	//    9   15:istore_2        
			if(i <= j)
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpgt          32
			{
				zzso = i;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #23  <Field int zzso>
				zzdx();
	//   16   26:aload_0         
	//   17   27:invokespecial   #175 <Method void zzdx()>
				return j;
	//   18   30:iload_2         
	//   19   31:ireturn         
			} else
			{
				throw zzgf.zzfh();
	//   20   32:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   21   35:athrow          
			}
		} else
		{
			throw zzgf.zzfi();
	//   22   36:invokestatic    #115 <Method zzgf zzgf.zzfi()>
	//   23   39:athrow          
		}
	}

	public final void zzao(int i)
	{
		zzso = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int zzso>
		zzdx();
	//    3    5:aload_0         
	//    4    6:invokespecial   #175 <Method void zzdx()>
	//    5    9:return          
	}

	public final void zzap(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            29
		{
			int j = limit;
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int limit>
	//    4    8:istore_2        
			int k = pos;
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field int pos>
	//    7   13:istore_3        
			if(i <= j - k)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:isub            
	//*  12   18:icmpgt          29
			{
				pos = k + i;
	//   13   21:aload_0         
	//   14   22:iload_3         
	//   15   23:iload_1         
	//   16   24:iadd            
	//   17   25:putfield        #29  <Field int pos>
				return;
	//   18   28:return          
			}
		}
		if(i < 0)
	//*  19   29:iload_1         
	//*  20   30:ifge            37
			throw zzgf.zzfi();
	//   21   33:invokestatic    #115 <Method zzgf zzgf.zzfi()>
	//   22   36:athrow          
		else
			throw zzgf.zzfh();
	//   23   37:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   24   40:athrow          
	}

	public final boolean zzcm()
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

	public final long zzcp()
		throws IOException
	{
		return zzdu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method long zzdu()>
	//    2    4:lreturn         
	}

	public final long zzcq()
		throws IOException
	{
		return zzdu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method long zzdu()>
	//    2    4:lreturn         
	}

	public final int zzcr()
		throws IOException
	{
		return zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:ireturn         
	}

	public final long zzcs()
		throws IOException
	{
		return zzdw();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzdw()>
	//    2    4:lreturn         
	}

	public final int zzct()
		throws IOException
	{
		return zzdv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzdv()>
	//    2    4:ireturn         
	}

	public final boolean zzcu()
		throws IOException
	{
		return zzdu() != 0L;
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method long zzdu()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final String zzcv()
		throws IOException
	{
		int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            50
		{
			int j = limit;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int limit>
	//    7   13:istore_2        
			int k = pos;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int pos>
	//   10   18:istore_3        
			if(i <= j - k)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          50
			{
				String s = zziw.zzi(buffer, k, i);
	//   16   26:aload_0         
	//   17   27:getfield        #25  <Field byte[] buffer>
	//   18   30:iload_3         
	//   19   31:iload_1         
	//   20   32:invokestatic    #192 <Method String zziw.zzi(byte[], int, int)>
	//   21   35:astore          4
				pos = pos + i;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #29  <Field int pos>
	//   25   42:iload_1         
	//   26   43:iadd            
	//   27   44:putfield        #29  <Field int pos>
				return s;
	//   28   47:aload           4
	//   29   49:areturn         
			}
		}
		if(i == 0)
	//*  30   50:iload_1         
	//*  31   51:ifne            57
			return "";
	//   32   54:ldc1            #112 <String "">
	//   33   56:areturn         
		if(i <= 0)
	//*  34   57:iload_1         
	//*  35   58:ifgt            65
			throw zzgf.zzfi();
	//   36   61:invokestatic    #115 <Method zzgf zzgf.zzfi()>
	//   37   64:athrow          
		else
			throw zzgf.zzfh();
	//   38   65:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   39   68:athrow          
	}

	public final zzeo zzcw()
		throws IOException
	{
label0:
		{
label1:
			{
				byte abyte0[];
label2:
				{
					int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:istore_1        
					if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            50
					{
						int j = limit;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int limit>
	//    7   13:istore_2        
						int l = pos;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int pos>
	//   10   18:istore_3        
						if(i <= j - l)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          50
						{
							zzeo zzeo1 = zzeo.zzb(buffer, l, i);
	//   16   26:aload_0         
	//   17   27:getfield        #25  <Field byte[] buffer>
	//   18   30:iload_3         
	//   19   31:iload_1         
	//   20   32:invokestatic    #200 <Method zzeo zzeo.zzb(byte[], int, int)>
	//   21   35:astore          4
							pos = pos + i;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #29  <Field int pos>
	//   25   42:iload_1         
	//   26   43:iadd            
	//   27   44:putfield        #29  <Field int pos>
							return zzeo1;
	//   28   47:aload           4
	//   29   49:areturn         
						}
					}
					if(i == 0)
	//*  30   50:iload_1         
	//*  31   51:ifne            58
						return zzeo.zzrx;
	//   32   54:getstatic       #204 <Field zzeo zzeo.zzrx>
	//   33   57:areturn         
					if(i > 0)
	//*  34   58:iload_1         
	//*  35   59:ifle            103
					{
						int k = limit;
	//   36   62:aload_0         
	//   37   63:getfield        #27  <Field int limit>
	//   38   66:istore_2        
						int i1 = pos;
	//   39   67:aload_0         
	//   40   68:getfield        #29  <Field int pos>
	//   41   71:istore_3        
						if(i <= k - i1)
	//*  42   72:iload_1         
	//*  43   73:iload_2         
	//*  44   74:iload_3         
	//*  45   75:isub            
	//*  46   76:icmpgt          103
						{
							pos = i + i1;
	//   47   79:aload_0         
	//   48   80:iload_1         
	//   49   81:iload_3         
	//   50   82:iadd            
	//   51   83:putfield        #29  <Field int pos>
							abyte0 = Arrays.copyOfRange(buffer, i1, pos);
	//   52   86:aload_0         
	//   53   87:getfield        #25  <Field byte[] buffer>
	//   54   90:iload_3         
	//   55   91:aload_0         
	//   56   92:getfield        #29  <Field int pos>
	//   57   95:invokestatic    #210 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   58   98:astore          4
							break label2;
	//   59  100:goto            116
						}
					}
					if(i > 0)
						break label0;
	//   60  103:iload_1         
	//   61  104:ifgt            126
					if(i != 0)
						break label1;
	//   62  107:iload_1         
	//   63  108:ifne            122
					abyte0 = zzga.zzxn;
	//   64  111:getstatic       #213 <Field byte[] zzga.zzxn>
	//   65  114:astore          4
				}
				return zzeo.zze(abyte0);
	//   66  116:aload           4
	//   67  118:invokestatic    #217 <Method zzeo zzeo.zze(byte[])>
	//   68  121:areturn         
			}
			throw zzgf.zzfi();
	//   69  122:invokestatic    #115 <Method zzgf zzgf.zzfi()>
	//   70  125:athrow          
		}
		throw zzgf.zzfh();
	//   71  126:invokestatic    #66  <Method zzgf zzgf.zzfh()>
	//   72  129:athrow          
	}

	public final int zzcx()
		throws IOException
	{
		return zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:ireturn         
	}

	public final int zzcy()
		throws IOException
	{
		return zzdt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:ireturn         
	}

	public final int zzcz()
		throws IOException
	{
		return zzdv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzdv()>
	//    2    4:ireturn         
	}

	public final long zzda()
		throws IOException
	{
		return zzdw();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method long zzdw()>
	//    2    4:lreturn         
	}

	public final int zzdb()
		throws IOException
	{
		return zzaq(zzdt());
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzdt()>
	//    2    4:invokestatic    #225 <Method int zzaq(int)>
	//    3    7:ireturn         
	}

	public final long zzdc()
		throws IOException
	{
		return zzd(zzdu());
	//    0    0:aload_0         
	//    1    1:invokespecial   #180 <Method long zzdu()>
	//    2    4:invokestatic    #230 <Method long zzd(long)>
	//    3    7:lreturn         
	}

	public final int zzdq()
		throws IOException
	{
		if(((zzez)this).zzcm())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #232 <Method boolean zzez.zzcm()>
	//*   2    4:ifeq            14
		{
			zzsn = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #148 <Field int zzsn>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		zzsn = zzdt();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #99  <Method int zzdt()>
	//   11   19:putfield        #148 <Field int zzsn>
		int i = zzsn;
	//   12   22:aload_0         
	//   13   23:getfield        #148 <Field int zzsn>
	//   14   26:istore_1        
		if(i >>> 3 != 0)
	//*  15   27:iload_1         
	//*  16   28:iconst_3        
	//*  17   29:iushr           
	//*  18   30:ifeq            35
			return i;
	//   19   33:iload_1         
	//   20   34:ireturn         
		else
			throw zzgf.zzfk();
	//   21   35:invokestatic    #235 <Method zzgf zzgf.zzfk()>
	//   22   38:athrow          
	}

	final long zzdr()
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
			byte byte0 = zzdy();
	//    7   10:aload_0         
	//    8   11:invokespecial   #170 <Method byte zzdy()>
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
		throw zzgf.zzfj();
	//   30   43:invokestatic    #168 <Method zzgf zzgf.zzfj()>
	//   31   46:athrow          
	}

	public final int zzds()
	{
		return pos - zzsm;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int zzsm>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private final byte buffer[];
	private int limit;
	private int pos;
	private final boolean zzsk;
	private int zzsl;
	private int zzsm;
	private int zzsn;
	private int zzso;
}
