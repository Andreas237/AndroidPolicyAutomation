// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package okhttp3.internal.publicsuffix;

import a.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.c;
import okhttp3.internal.g.j;

public final class PublicSuffixDatabase
{

	public PublicSuffixDatabase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #38  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #41  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #43  <Field AtomicBoolean e>
	//    8   16:aload_0         
	//    9   17:new             #45  <Class CountDownLatch>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:invokespecial   #48  <Method void CountDownLatch(int)>
	//   13   25:putfield        #50  <Field CountDownLatch f>
	//   14   28:return          
	}

	private static String a(byte abyte0[], byte abyte1[][], int k)
	{
		int i1 = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          4
		int j1 = 0;
	//    3    4:iconst_0        
	//    4    5:istore          5
label0:
		do
		{
			if(j1 < i1)
	//*   5    7:iload           5
	//*   6    9:iload           4
	//*   7   11:icmpge          332
			{
				int l;
				for(l = (j1 + i1) / 2; l > -1 && abyte0[l] != 10; l--);
	//    8   14:iload           5
	//    9   16:iload           4
	//   10   18:iadd            
	//   11   19:iconst_2        
	//   12   20:idiv            
	//   13   21:istore_3        
	//   14   22:iload_3         
	//   15   23:iconst_m1       
	//   16   24:icmple          42
	//   17   27:aload_0         
	//   18   28:iload_3         
	//   19   29:baload          
	//   20   30:bipush          10
	//   21   32:icmpeq          42
	//   22   35:iload_3         
	//   23   36:iconst_1        
	//   24   37:isub            
	//   25   38:istore_3        
	//*  26   39:goto            22
				int k2 = l + 1;
	//   27   42:iload_3         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore          11
				l = 1;
	//   31   47:iconst_1        
	//   32   48:istore_3        
				int l2;
				do
				{
					l2 = k2 + l;
	//   33   49:iload           11
	//   34   51:iload_3         
	//   35   52:iadd            
	//   36   53:istore          12
					if(abyte0[l2] == 10)
						break;
	//   37   55:aload_0         
	//   38   56:iload           12
	//   39   58:baload          
	//   40   59:bipush          10
	//   41   61:icmpeq          71
					l++;
	//   42   64:iload_3         
	//   43   65:iconst_1        
	//   44   66:iadd            
	//   45   67:istore_3        
				} while(true);
	//   46   68:goto            49
				int i3 = l2 - k2;
	//   47   71:iload           12
	//   48   73:iload           11
	//   49   75:isub            
	//   50   76:istore          13
				int k1 = k;
	//   51   78:iload_2         
	//   52   79:istore          6
				boolean flag = false;
	//   53   81:iconst_0        
	//   54   82:istore          8
				l = 0;
	//   55   84:iconst_0        
	//   56   85:istore_3        
				int l1 = 0;
	//   57   86:iconst_0        
	//   58   87:istore          7
				do
				{
					int i2;
label1:
					{
						if(flag)
	//*  59   89:iload           8
	//*  60   91:ifeq            104
						{
							flag = false;
	//   61   94:iconst_0        
	//   62   95:istore          8
							i2 = 46;
	//   63   97:bipush          46
	//   64   99:istore          9
						} else
	//*  65  101:goto            116
						{
							i2 = abyte1[k1][l] & 0xff;
	//   66  104:aload_1         
	//   67  105:iload           6
	//   68  107:aaload          
	//   69  108:iload_3         
	//   70  109:iaload          
	//   71  110:sipush          255
	//   72  113:iand            
	//   73  114:istore          9
						}
						int j3 = i2 - (abyte0[k2 + l1] & 0xff);
	//   74  116:iload           9
	//   75  118:aload_0         
	//   76  119:iload           11
	//   77  121:iload           7
	//   78  123:iadd            
	//   79  124:baload          
	//   80  125:sipush          255
	//   81  128:iand            
	//   82  129:isub            
	//   83  130:istore          14
						if(j3 == 0)
	//*  84  132:iload           14
	//*  85  134:ifeq            140
	//*  86  137:goto            201
						{
							i2 = l1 + 1;
	//   87  140:iload           7
	//   88  142:iconst_1        
	//   89  143:iadd            
	//   90  144:istore          9
							int j2 = l + 1;
	//   91  146:iload_3         
	//   92  147:iconst_1        
	//   93  148:iadd            
	//   94  149:istore          10
							if(i2 == i3)
	//*  95  151:iload           9
	//*  96  153:iload           13
	//*  97  155:icmpne          168
							{
								l = j2;
	//   98  158:iload           10
	//   99  160:istore_3        
								l1 = i2;
	//  100  161:iload           9
	//  101  163:istore          7
							} else
	//* 102  165:goto            201
							{
								l = j2;
	//  103  168:iload           10
	//  104  170:istore_3        
								l1 = i2;
	//  105  171:iload           9
	//  106  173:istore          7
								if(abyte1[k1].length != j2)
									continue;
	//  107  175:aload_1         
	//  108  176:iload           6
	//  109  178:aaload          
	//  110  179:arraylength     
	//  111  180:iload           10
	//  112  182:icmpne          89
								if(k1 != abyte1.length - 1)
									break label1;
	//  113  185:iload           6
	//  114  187:aload_1         
	//  115  188:arraylength     
	//  116  189:iconst_1        
	//  117  190:isub            
	//  118  191:icmpne          314
								l1 = i2;
	//  119  194:iload           9
	//  120  196:istore          7
								l = j2;
	//  121  198:iload           10
	//  122  200:istore_3        
							}
						}
						if(j3 < 0)
	//* 123  201:iload           14
	//* 124  203:ifge            215
							i1 = k2 - 1;
	//  125  206:iload           11
	//  126  208:iconst_1        
	//  127  209:isub            
	//  128  210:istore          4
						else
	//* 129  212:goto            7
						if(j3 > 0)
	//* 130  215:iload           14
	//* 131  217:ifle            229
						{
							j1 = l2 + 1;
	//  132  220:iload           12
	//  133  222:iconst_1        
	//  134  223:iadd            
	//  135  224:istore          5
						} else
	//* 136  226:goto            7
						{
							l1 = i3 - l1;
	//  137  229:iload           13
	//  138  231:iload           7
	//  139  233:isub            
	//  140  234:istore          7
							l = abyte1[k1].length - l;
	//  141  236:aload_1         
	//  142  237:iload           6
	//  143  239:aaload          
	//  144  240:arraylength     
	//  145  241:iload_3         
	//  146  242:isub            
	//  147  243:istore_3        
							do
							{
								k1++;
	//  148  244:iload           6
	//  149  246:iconst_1        
	//  150  247:iadd            
	//  151  248:istore          6
								if(k1 >= abyte1.length)
									break;
	//  152  250:iload           6
	//  153  252:aload_1         
	//  154  253:arraylength     
	//  155  254:icmpge          268
								l += abyte1[k1].length;
	//  156  257:iload_3         
	//  157  258:aload_1         
	//  158  259:iload           6
	//  159  261:aaload          
	//  160  262:arraylength     
	//  161  263:iadd            
	//  162  264:istore_3        
							} while(true);
	//  163  265:goto            244
							if(l < l1)
	//* 164  268:iload_3         
	//* 165  269:iload           7
	//* 166  271:icmpge          283
								i1 = k2 - 1;
	//  167  274:iload           11
	//  168  276:iconst_1        
	//  169  277:isub            
	//  170  278:istore          4
							else
	//* 171  280:goto            7
							if(l > l1)
	//* 172  283:iload_3         
	//* 173  284:iload           7
	//* 174  286:icmple          298
								j1 = l2 + 1;
	//  175  289:iload           12
	//  176  291:iconst_1        
	//  177  292:iadd            
	//  178  293:istore          5
							else
	//* 179  295:goto            7
								return new String(abyte0, k2, i3, c.e);
	//  180  298:new             #23  <Class String>
	//  181  301:dup             
	//  182  302:aload_0         
	//  183  303:iload           11
	//  184  305:iload           13
	//  185  307:getstatic       #56  <Field java.nio.charset.Charset c.e>
	//  186  310:invokespecial   #59  <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//  187  313:areturn         
						}
						continue label0;
					}
					k1++;
	//  188  314:iload           6
	//  189  316:iconst_1        
	//  190  317:iadd            
	//  191  318:istore          6
					flag = true;
	//  192  320:iconst_1        
	//  193  321:istore          8
					l = -1;
	//  194  323:iconst_m1       
	//  195  324:istore_3        
					l1 = i2;
	//  196  325:iload           9
	//  197  327:istore          7
				} while(true);
	//  198  329:goto            89
			}
			return null;
	//  199  332:aconst_null     
	//  200  333:areturn         
		} while(true);
	}

	public static PublicSuffixDatabase a()
	{
		return d;
	//    0    0:getstatic       #34  <Field PublicSuffixDatabase d>
	//    1    3:areturn         
	}

	private String[] a(String as[])
	{
		boolean flag1 = e.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AtomicBoolean e>
	//    2    4:invokevirtual   #67  <Method boolean AtomicBoolean.get()>
	//    3    7:istore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		int k;
		String s;
		String as1[];
		byte abyte0[][];
		String s1;
		byte abyte1[][];
		if(!flag1 && e.compareAndSet(false, true))
	//*   6   11:iload           4
	//*   7   13:ifne            35
	//*   8   16:aload_0         
	//*   9   17:getfield        #43  <Field AtomicBoolean e>
	//*  10   20:iconst_0        
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #71  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*  13   25:ifeq            35
			b();
	//   14   28:aload_0         
	//   15   29:invokespecial   #73  <Method void b()>
		else
	//*  16   32:goto            42
			try
			{
				f.await();
	//   17   35:aload_0         
	//   18   36:getfield        #50  <Field CountDownLatch f>
	//   19   39:invokevirtual   #76  <Method void CountDownLatch.await()>
			}
	//*  20   42:aload_0         
	//*  21   43:monitorenter    
	//*  22   44:aload_0         
	//*  23   45:getfield        #78  <Field byte[] g>
	//*  24   48:ifnull          338
	//*  25   51:aload_0         
	//*  26   52:monitorexit     
	//*  27   53:aload_1         
	//*  28   54:arraylength     
	//*  29   55:anewarray       byte[][]
	//*  30   58:astore          7
	//*  31   60:iconst_0        
	//*  32   61:istore_2        
	//*  33   62:iload_2         
	//*  34   63:aload_1         
	//*  35   64:arraylength     
	//*  36   65:icmpge          88
	//*  37   68:aload           7
	//*  38   70:iload_2         
	//*  39   71:aload_1         
	//*  40   72:iload_2         
	//*  41   73:aaload          
	//*  42   74:getstatic       #56  <Field java.nio.charset.Charset c.e>
	//*  43   77:invokevirtual   #83  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//*  44   80:aastore         
	//*  45   81:iload_2         
	//*  46   82:iconst_1        
	//*  47   83:iadd            
	//*  48   84:istore_2        
	//*  49   85:goto            62
	//*  50   88:iconst_0        
	//*  51   89:istore_2        
	//*  52   90:iload_2         
	//*  53   91:aload           7
	//*  54   93:arraylength     
	//*  55   94:icmpge          122
	//*  56   97:aload_0         
	//*  57   98:getfield        #78  <Field byte[] g>
	//*  58  101:aload           7
	//*  59  103:iload_2         
	//*  60  104:invokestatic    #85  <Method String a(byte[], byte[][], int)>
	//*  61  107:astore_1        
	//*  62  108:aload_1         
	//*  63  109:ifnull          115
	//*  64  112:goto            124
	//*  65  115:iload_2         
	//*  66  116:iconst_1        
	//*  67  117:iadd            
	//*  68  118:istore_2        
	//*  69  119:goto            90
	//*  70  122:aconst_null     
	//*  71  123:astore_1        
	//*  72  124:aload           7
	//*  73  126:arraylength     
	//*  74  127:iconst_1        
	//*  75  128:icmple          186
	//*  76  131:aload           7
	//*  77  133:invokevirtual   #91  <Method Object _5B__5B_B.clone()>
	//*  78  136:checkcast       #87  <Class byte[][]>
	//*  79  139:astore          6
	//*  80  141:iconst_0        
	//*  81  142:istore_2        
	//*  82  143:iload_2         
	//*  83  144:aload           6
	//*  84  146:arraylength     
	//*  85  147:iconst_1        
	//*  86  148:isub            
	//*  87  149:icmpge          186
	//*  88  152:aload           6
	//*  89  154:iload_2         
	//*  90  155:getstatic       #21  <Field byte[] a>
	//*  91  158:aastore         
	//*  92  159:aload_0         
	//*  93  160:getfield        #78  <Field byte[] g>
	//*  94  163:aload           6
	//*  95  165:iload_2         
	//*  96  166:invokestatic    #85  <Method String a(byte[], byte[][], int)>
	//*  97  169:astore          5
	//*  98  171:aload           5
	//*  99  173:ifnull          179
	//* 100  176:goto            189
	//* 101  179:iload_2         
	//* 102  180:iconst_1        
	//* 103  181:iadd            
	//* 104  182:istore_2        
	//* 105  183:goto            143
	//* 106  186:aconst_null     
	//* 107  187:astore          5
	//* 108  189:aload           5
	//* 109  191:ifnull          232
	//* 110  194:iload_3         
	//* 111  195:istore_2        
	//* 112  196:iload_2         
	//* 113  197:aload           7
	//* 114  199:arraylength     
	//* 115  200:iconst_1        
	//* 116  201:isub            
	//* 117  202:icmpge          232
	//* 118  205:aload_0         
	//* 119  206:getfield        #93  <Field byte[] h>
	//* 120  209:aload           7
	//* 121  211:iload_2         
	//* 122  212:invokestatic    #85  <Method String a(byte[], byte[][], int)>
	//* 123  215:astore          6
	//* 124  217:aload           6
	//* 125  219:ifnull          225
	//* 126  222:goto            235
	//* 127  225:iload_2         
	//* 128  226:iconst_1        
	//* 129  227:iadd            
	//* 130  228:istore_2        
	//* 131  229:goto            196
	//* 132  232:aconst_null     
	//* 133  233:astore          6
	//* 134  235:aload           6
	//* 135  237:ifnull          272
	//* 136  240:new             #95  <Class StringBuilder>
	//* 137  243:dup             
	//* 138  244:invokespecial   #96  <Method void StringBuilder()>
	//* 139  247:astore_1        
	//* 140  248:aload_1         
	//* 141  249:ldc1            #98  <String "!">
	//* 142  251:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 143  254:pop             
	//* 144  255:aload_1         
	//* 145  256:aload           6
	//* 146  258:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 147  261:pop             
	//* 148  262:aload_1         
	//* 149  263:invokevirtual   #106 <Method String StringBuilder.toString()>
	//* 150  266:ldc1            #108 <String "\\.">
	//* 151  268:invokevirtual   #112 <Method String[] String.split(String)>
	//* 152  271:areturn         
	//* 153  272:aload_1         
	//* 154  273:ifnonnull       285
	//* 155  276:aload           5
	//* 156  278:ifnonnull       285
	//* 157  281:getstatic       #29  <Field String[] c>
	//* 158  284:areturn         
	//* 159  285:aload_1         
	//* 160  286:ifnull          299
	//* 161  289:aload_1         
	//* 162  290:ldc1            #108 <String "\\.">
	//* 163  292:invokevirtual   #112 <Method String[] String.split(String)>
	//* 164  295:astore_1        
	//* 165  296:goto            303
	//* 166  299:getstatic       #25  <Field String[] b>
	//* 167  302:astore_1        
	//* 168  303:aload           5
	//* 169  305:ifnull          320
	//* 170  308:aload           5
	//* 171  310:ldc1            #108 <String "\\.">
	//* 172  312:invokevirtual   #112 <Method String[] String.split(String)>
	//* 173  315:astore          5
	//* 174  317:goto            325
	//* 175  320:getstatic       #25  <Field String[] b>
	//* 176  323:astore          5
	//* 177  325:aload_1         
	//* 178  326:arraylength     
	//* 179  327:aload           5
	//* 180  329:arraylength     
	//* 181  330:icmple          335
	//* 182  333:aload_1         
	//* 183  334:areturn         
	//* 184  335:aload           5
	//* 185  337:areturn         
	//* 186  338:new             #114 <Class IllegalStateException>
	//* 187  341:dup             
	//* 188  342:ldc1            #116 <String "Unable to load publicsuffixes.gz resource from the classpath.">
	//* 189  344:invokespecial   #119 <Method void IllegalStateException(String)>
	//* 190  347:athrow          
	//* 191  348:astore_1        
	//* 192  349:aload_0         
	//* 193  350:monitorexit     
	//* 194  351:aload_1         
	//* 195  352:athrow          
			catch(InterruptedException interruptedexception) { }
	//  196  353:astore          5
		this;
		JVM INSTR monitorenter ;
		if(g == null)
			break MISSING_BLOCK_LABEL_338;
		this;
		JVM INSTR monitorexit ;
label0:
		{
			abyte1 = new byte[as.length][];
			for(k = 0; k < as.length; k++)
				abyte1[k] = as[k].getBytes(c.e);

			for(k = 0; k < abyte1.length; k++)
			{
				as = ((String []) (a(g, abyte1, k)));
				if(as != null)
					break label0;
			}

			as = null;
		}
label1:
		{
			if(abyte1.length > 1)
			{
				abyte0 = (byte[][])((byte [][]) (abyte1)).clone();
				for(k = 0; k < abyte0.length - 1; k++)
				{
					abyte0[k] = a;
					s = a(g, abyte0, k);
					if(s != null)
						break label1;
				}

			}
			s = null;
		}
label2:
		{
			if(s != null)
				for(k = ((int) (flag)); k < abyte1.length - 1; k++)
				{
					s1 = a(h, abyte1, k);
					if(s1 != null)
						break label2;
				}

			s1 = null;
		}
		if(s1 != null)
		{
			as = ((String []) (new StringBuilder()));
			((StringBuilder) (as)).append("!");
			((StringBuilder) (as)).append(s1);
			return ((StringBuilder) (as)).toString().split("\\.");
		}
		if(as == null && s == null)
			return c;
		if(as != null)
			as = ((String) (as)).split("\\.");
		else
			as = b;
		if(s != null)
			as1 = s.split("\\.");
		else
			as1 = b;
		if(as.length > as1.length)
			return as;
		else
			return as1;
		throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
		as;
		this;
		JVM INSTR monitorexit ;
		throw as;
	//* 197  355:goto            42
	}

	private void b()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L1:
		c();
	//    2    2:aload_0         
	//    3    3:invokespecial   #125 <Method void c()>
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            16
			Thread.currentThread().interrupt();
	//    6   10:invokestatic    #131 <Method Thread Thread.currentThread()>
	//    7   13:invokevirtual   #134 <Method void Thread.interrupt()>
		return;
	//    8   16:return          
		Object obj;
		obj;
	//    9   17:astore_2        
		break MISSING_BLOCK_LABEL_43;
	//   10   18:goto            43
		obj;
	//   11   21:astore_2        
		j.c().a(5, "Failed to read public suffix list", ((Throwable) (obj)));
	//   12   22:invokestatic    #139 <Method j j.c()>
	//   13   25:iconst_5        
	//   14   26:ldc1            #141 <String "Failed to read public suffix list">
	//   15   28:aload_2         
	//   16   29:invokevirtual   #144 <Method void j.a(int, String, Throwable)>
		if(flag)
	//*  17   32:iload_1         
	//*  18   33:ifeq            42
			Thread.currentThread().interrupt();
	//   19   36:invokestatic    #131 <Method Thread Thread.currentThread()>
	//   20   39:invokevirtual   #134 <Method void Thread.interrupt()>
		return;
	//   21   42:return          
		if(flag)
	//*  22   43:iload_1         
	//*  23   44:ifeq            53
			Thread.currentThread().interrupt();
	//   24   47:invokestatic    #131 <Method Thread Thread.currentThread()>
	//   25   50:invokevirtual   #134 <Method void Thread.interrupt()>
		throw obj;
	//   26   53:aload_2         
	//   27   54:athrow          
_L2:
		flag = true;
	//   28   55:iconst_1        
	//   29   56:istore_1        
		  goto _L1
	//*  30   57:goto            2
		obj;
	//   31   60:astore_2        
		  goto _L2
	//*  32   61:goto            55
	}

	private void c()
	{
		Object obj;
		obj = ((Object) (((Class) (okhttp3/internal/publicsuffix/PublicSuffixDatabase)).getResourceAsStream("publicsuffixes.gz")));
	//    0    0:ldc1            #2   <Class PublicSuffixDatabase>
	//    1    2:ldc1            #146 <String "publicsuffixes.gz">
	//    2    4:invokevirtual   #152 <Method java.io.InputStream Class.getResourceAsStream(String)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		obj = ((Object) (p.a(((a.ab) (new n(p.a(((java.io.InputStream) (obj)))))))));
	//    7   13:new             #154 <Class n>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokestatic    #159 <Method a.ab p.a(java.io.InputStream)>
	//   11   21:invokespecial   #162 <Method void n(a.ab)>
	//   12   24:invokestatic    #165 <Method i p.a(a.ab)>
	//   13   27:astore_1        
		byte abyte0[];
		byte abyte1[];
		abyte0 = new byte[((i) (obj)).j()];
	//   14   28:aload_1         
	//   15   29:invokeinterface #171 <Method int i.j()>
	//   16   34:newarray        byte[]
	//   17   36:astore_2        
		((i) (obj)).a(abyte0);
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokeinterface #174 <Method void i.a(byte[])>
		abyte1 = new byte[((i) (obj)).j()];
	//   21   44:aload_1         
	//   22   45:invokeinterface #171 <Method int i.j()>
	//   23   50:newarray        byte[]
	//   24   52:astore_3        
		((i) (obj)).a(abyte1);
	//   25   53:aload_1         
	//   26   54:aload_3         
	//   27   55:invokeinterface #174 <Method void i.a(byte[])>
		okhttp3.internal.c.a(((java.io.Closeable) (obj)));
	//   28   60:aload_1         
	//   29   61:invokestatic    #177 <Method void c.a(java.io.Closeable)>
		this;
	//   30   64:aload_0         
		JVM INSTR monitorenter ;
	//   31   65:monitorenter    
		g = abyte0;
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:putfield        #78  <Field byte[] g>
		h = abyte1;
	//   35   71:aload_0         
	//   36   72:aload_3         
	//   37   73:putfield        #93  <Field byte[] h>
		this;
	//   38   76:aload_0         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		f.countDown();
	//   40   78:aload_0         
	//   41   79:getfield        #50  <Field CountDownLatch f>
	//   42   82:invokevirtual   #180 <Method void CountDownLatch.countDown()>
		return;
	//   43   85:return          
		obj;
	//   44   86:astore_1        
		this;
	//   45   87:aload_0         
		JVM INSTR monitorexit ;
	//   46   88:monitorexit     
		throw obj;
	//   47   89:aload_1         
	//   48   90:athrow          
		Exception exception;
		exception;
	//   49   91:astore_2        
		okhttp3.internal.c.a(((java.io.Closeable) (obj)));
	//   50   92:aload_1         
	//   51   93:invokestatic    #177 <Method void c.a(java.io.Closeable)>
		throw exception;
	//   52   96:aload_2         
	//   53   97:athrow          
	}

	public String a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          135
		{
			String as[] = IDN.toUnicode(s).split("\\.");
	//    2    4:aload_1         
	//    3    5:invokestatic    #186 <Method String IDN.toUnicode(String)>
	//    4    8:ldc1            #108 <String "\\.">
	//    5   10:invokevirtual   #112 <Method String[] String.split(String)>
	//    6   13:astore_3        
			String as1[] = a(as);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokespecial   #188 <Method String[] a(String[])>
	//   10   19:astore          4
			if(as.length == as1.length && as1[0].charAt(0) != '!')
	//*  11   21:aload_3         
	//*  12   22:arraylength     
	//*  13   23:aload           4
	//*  14   25:arraylength     
	//*  15   26:icmpne          44
	//*  16   29:aload           4
	//*  17   31:iconst_0        
	//*  18   32:aaload          
	//*  19   33:iconst_0        
	//*  20   34:invokevirtual   #192 <Method char String.charAt(int)>
	//*  21   37:bipush          33
	//*  22   39:icmpeq          44
				return null;
	//   23   42:aconst_null     
	//   24   43:areturn         
			int k;
			if(as1[0].charAt(0) == '!')
	//*  25   44:aload           4
	//*  26   46:iconst_0        
	//*  27   47:aaload          
	//*  28   48:iconst_0        
	//*  29   49:invokevirtual   #192 <Method char String.charAt(int)>
	//*  30   52:bipush          33
	//*  31   54:icmpne          67
				k = as.length - as1.length;
	//   32   57:aload_3         
	//   33   58:arraylength     
	//   34   59:aload           4
	//   35   61:arraylength     
	//   36   62:isub            
	//   37   63:istore_2        
			else
	//*  38   64:goto            76
				k = as.length - (as1.length + 1);
	//   39   67:aload_3         
	//   40   68:arraylength     
	//   41   69:aload           4
	//   42   71:arraylength     
	//   43   72:iconst_1        
	//   44   73:iadd            
	//   45   74:isub            
	//   46   75:istore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   47   76:new             #95  <Class StringBuilder>
	//   48   79:dup             
	//   49   80:invokespecial   #96  <Method void StringBuilder()>
	//   50   83:astore_3        
			for(s = ((String) (s.split("\\."))); k < s.length; k++)
	//*  51   84:aload_1         
	//*  52   85:ldc1            #108 <String "\\.">
	//*  53   87:invokevirtual   #112 <Method String[] String.split(String)>
	//*  54   90:astore_1        
	//*  55   91:iload_2         
	//*  56   92:aload_1         
	//*  57   93:arraylength     
	//*  58   94:icmpge          119
			{
				stringbuilder.append(((String) (s[k])));
	//   59   97:aload_3         
	//   60   98:aload_1         
	//   61   99:iload_2         
	//   62  100:aaload          
	//   63  101:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   64  104:pop             
				stringbuilder.append('.');
	//   65  105:aload_3         
	//   66  106:bipush          46
	//   67  108:invokevirtual   #195 <Method StringBuilder StringBuilder.append(char)>
	//   68  111:pop             
			}

	//   69  112:iload_2         
	//   70  113:iconst_1        
	//   71  114:iadd            
	//   72  115:istore_2        
	//*  73  116:goto            91
			stringbuilder.deleteCharAt(stringbuilder.length() - 1);
	//   74  119:aload_3         
	//   75  120:aload_3         
	//   76  121:invokevirtual   #198 <Method int StringBuilder.length()>
	//   77  124:iconst_1        
	//   78  125:isub            
	//   79  126:invokevirtual   #202 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   80  129:pop             
			return stringbuilder.toString();
	//   81  130:aload_3         
	//   82  131:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   83  134:areturn         
		} else
		{
			throw new NullPointerException("domain == null");
	//   84  135:new             #204 <Class NullPointerException>
	//   85  138:dup             
	//   86  139:ldc1            #206 <String "domain == null">
	//   87  141:invokespecial   #207 <Method void NullPointerException(String)>
	//   88  144:athrow          
		}
	}

	private static final byte a[] = {
		42
	};
	private static final String b[] = new String[0];
	private static final String c[] = {
		"*"
	};
	private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
	private final AtomicBoolean e = new AtomicBoolean(false);
	private final CountDownLatch f = new CountDownLatch(1);
	private byte g[];
	private byte h[];

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:bipush          42
	//    5    7:bastore         
	//    6    8:putstatic       #21  <Field byte[] a>
	//    7   11:iconst_0        
	//    8   12:anewarray       String[]
	//    9   15:putstatic       #25  <Field String[] b>
	//   10   18:iconst_1        
	//   11   19:anewarray       String[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:ldc1            #27  <String "*">
	//   15   26:aastore         
	//   16   27:putstatic       #29  <Field String[] c>
	//   17   30:new             #2   <Class PublicSuffixDatabase>
	//   18   33:dup             
	//   19   34:invokespecial   #32  <Method void PublicSuffixDatabase()>
	//   20   37:putstatic       #34  <Field PublicSuffixDatabase d>
	//*  21   40:return          
	}
}
