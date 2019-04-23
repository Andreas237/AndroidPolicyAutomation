// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnm

public final class bnl
{

	public static int a(byte abyte0[], int i)
	{
		Object obj = c;
	//    0    0:getstatic       #39  <Field Object c>
	//    1    3:astore          8
		obj;
	//    2    5:aload           8
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		int j;
		int l;
		j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		l = 0;
	//    6   10:iconst_0        
	//    7   11:istore          4
_L6:
		if(j >= i)
			break MISSING_BLOCK_LABEL_201;
	//    8   13:iload_2         
	//    9   14:iload_1         
	//   10   15:icmpge          201
_L8:
		if(j >= i - 2) goto _L2; else goto _L1
	//   11   18:iload_2         
	//   12   19:iload_1         
	//   13   20:iconst_2        
	//   14   21:isub            
	//   15   22:icmpge          196
_L1:
		if(abyte0[j] != 0 || abyte0[j + 1] != 0 || abyte0[j + 2] != 3) goto _L4; else goto _L3
	//   16   25:aload_0         
	//   17   26:iload_2         
	//   18   27:baload          
	//   19   28:ifne            189
	//   20   31:aload_0         
	//   21   32:iload_2         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:baload          
	//   25   36:ifne            189
	//   26   39:aload_0         
	//   27   40:iload_2         
	//   28   41:iconst_2        
	//   29   42:iadd            
	//   30   43:baload          
	//   31   44:iconst_3        
	//   32   45:icmpne          189
_L3:
		int k = j;
	//   33   48:iload_2         
	//   34   49:istore_3        
	//*  35   50:goto            53
_L9:
		j = k;
	//   36   53:iload_3         
	//   37   54:istore_2        
		if(k >= i) goto _L6; else goto _L5
	//   38   55:iload_3         
	//   39   56:iload_1         
	//   40   57:icmpge          13
_L5:
		if(d.length <= l)
	//*  41   60:getstatic       #41  <Field int[] d>
	//*  42   63:arraylength     
	//*  43   64:iload           4
	//*  44   66:icmpgt          84
			d = Arrays.copyOf(d, d.length << 1);
	//   45   69:getstatic       #41  <Field int[] d>
	//   46   72:getstatic       #41  <Field int[] d>
	//   47   75:arraylength     
	//   48   76:iconst_1        
	//   49   77:ishl            
	//   50   78:invokestatic    #49  <Method int[] Arrays.copyOf(int[], int)>
	//   51   81:putstatic       #41  <Field int[] d>
		d[l] = k;
	//   52   84:getstatic       #41  <Field int[] d>
	//   53   87:iload           4
	//   54   89:iload_3         
	//   55   90:iastore         
		j = k + 3;
	//   56   91:iload_3         
	//   57   92:iconst_3        
	//   58   93:iadd            
	//   59   94:istore_2        
		l++;
	//   60   95:iload           4
	//   61   97:iconst_1        
	//   62   98:iadd            
	//   63   99:istore          4
		  goto _L6
	//*  64  101:goto            13
_L7:
		if(i >= l)
			break MISSING_BLOCK_LABEL_166;
	//   65  104:iload_1         
	//   66  105:iload           4
	//   67  107:icmpge          166
		int j1;
		j1 = d[i] - j;
	//   68  110:getstatic       #41  <Field int[] d>
	//   69  113:iload_1         
	//   70  114:iaload          
	//   71  115:iload_2         
	//   72  116:isub            
	//   73  117:istore          6
		System.arraycopy(((Object) (abyte0)), j, ((Object) (abyte0)), k, j1);
	//   74  119:aload_0         
	//   75  120:iload_2         
	//   76  121:aload_0         
	//   77  122:iload_3         
	//   78  123:iload           6
	//   79  125:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>
		k += j1;
	//   80  128:iload_3         
	//   81  129:iload           6
	//   82  131:iadd            
	//   83  132:istore_3        
		int k1 = k + 1;
	//   84  133:iload_3         
	//   85  134:iconst_1        
	//   86  135:iadd            
	//   87  136:istore          7
		abyte0[k] = 0;
	//   88  138:aload_0         
	//   89  139:iload_3         
	//   90  140:iconst_0        
	//   91  141:bastore         
		k = k1 + 1;
	//   92  142:iload           7
	//   93  144:iconst_1        
	//   94  145:iadd            
	//   95  146:istore_3        
		abyte0[k1] = 0;
	//   96  147:aload_0         
	//   97  148:iload           7
	//   98  150:iconst_0        
	//   99  151:bastore         
		j += j1 + 3;
	//  100  152:iload_2         
	//  101  153:iload           6
	//  102  155:iconst_3        
	//  103  156:iadd            
	//  104  157:iadd            
	//  105  158:istore_2        
		i++;
	//  106  159:iload_1         
	//  107  160:iconst_1        
	//  108  161:iadd            
	//  109  162:istore_1        
		  goto _L7
	//* 110  163:goto            104
		int i1;
		System.arraycopy(((Object) (abyte0)), j, ((Object) (abyte0)), k, i1 - k);
	//  111  166:aload_0         
	//  112  167:iload_2         
	//  113  168:aload_0         
	//  114  169:iload_3         
	//  115  170:iload           5
	//  116  172:iload_3         
	//  117  173:isub            
	//  118  174:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>
		obj;
	//  119  177:aload           8
		JVM INSTR monitorexit ;
	//  120  179:monitorexit     
		return i1;
	//  121  180:iload           5
	//  122  182:ireturn         
		abyte0;
	//  123  183:astore_0        
		obj;
	//  124  184:aload           8
		JVM INSTR monitorexit ;
	//  125  186:monitorexit     
		throw abyte0;
	//  126  187:aload_0         
	//  127  188:athrow          
_L4:
		j++;
	//  128  189:iload_2         
	//  129  190:iconst_1        
	//  130  191:iadd            
	//  131  192:istore_2        
		  goto _L8
	//* 132  193:goto            18
_L2:
		k = i;
	//  133  196:iload_1         
	//  134  197:istore_3        
		  goto _L9
	//* 135  198:goto            53
		i1 = i - l;
	//  136  201:iload_1         
	//  137  202:iload           4
	//  138  204:isub            
	//  139  205:istore          5
		i = 0;
	//  140  207:iconst_0        
	//  141  208:istore_1        
		k = 0;
	//  142  209:iconst_0        
	//  143  210:istore_3        
		j = 0;
	//  144  211:iconst_0        
	//  145  212:istore_2        
		  goto _L7
	//* 146  213:goto            104
	}

	public static bnm a(byte abyte0[], int i, int j)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #58  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #60  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #65  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static void a(ByteBuffer bytebuffer)
	{
		int i1 = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method int ByteBuffer.position()>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		do
		{
			int l = k + 1;
	//    7   10:iload_3         
	//    8   11:iconst_1        
	//    9   12:iadd            
	//   10   13:istore          4
			if(l < i1)
	//*  11   15:iload           4
	//*  12   17:iload           5
	//*  13   19:icmpge          125
			{
				int j1 = bytebuffer.get(k) & 0xff;
	//   14   22:aload_0         
	//   15   23:iload_3         
	//   16   24:invokevirtual   #76  <Method byte ByteBuffer.get(int)>
	//   17   27:sipush          255
	//   18   30:iand            
	//   19   31:istore          6
				int j;
				if(i == 3)
	//*  20   33:iload_1         
	//*  21   34:iconst_3        
	//*  22   35:icmpne          99
				{
					j = i;
	//   23   38:iload_1         
	//   24   39:istore_2        
					if(j1 == 1)
	//*  25   40:iload           6
	//*  26   42:iconst_1        
	//*  27   43:icmpne          110
					{
						j = i;
	//   28   46:iload_1         
	//   29   47:istore_2        
						if((bytebuffer.get(l) & 0x1f) == 7)
	//*  30   48:aload_0         
	//*  31   49:iload           4
	//*  32   51:invokevirtual   #76  <Method byte ByteBuffer.get(int)>
	//*  33   54:bipush          31
	//*  34   56:iand            
	//*  35   57:bipush          7
	//*  36   59:icmpne          110
						{
							ByteBuffer bytebuffer1 = bytebuffer.duplicate();
	//   37   62:aload_0         
	//   38   63:invokevirtual   #80  <Method ByteBuffer ByteBuffer.duplicate()>
	//   39   66:astore          7
							bytebuffer1.position(k - 3);
	//   40   68:aload           7
	//   41   70:iload_3         
	//   42   71:iconst_3        
	//   43   72:isub            
	//   44   73:invokevirtual   #83  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   45   76:pop             
							bytebuffer1.limit(i1);
	//   46   77:aload           7
	//   47   79:iload           5
	//   48   81:invokevirtual   #86  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   49   84:pop             
							bytebuffer.position(0);
	//   50   85:aload_0         
	//   51   86:iconst_0        
	//   52   87:invokevirtual   #83  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   53   90:pop             
							bytebuffer.put(bytebuffer1);
	//   54   91:aload_0         
	//   55   92:aload           7
	//   56   94:invokevirtual   #90  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   57   97:pop             
							return;
	//   58   98:return          
						}
					}
				} else
				{
					j = i;
	//   59   99:iload_1         
	//   60  100:istore_2        
					if(j1 == 0)
	//*  61  101:iload           6
	//*  62  103:ifne            110
						j = i + 1;
	//   63  106:iload_1         
	//   64  107:iconst_1        
	//   65  108:iadd            
	//   66  109:istore_2        
				}
				i = j;
	//   67  110:iload_2         
	//   68  111:istore_1        
				if(j1 != 0)
	//*  69  112:iload           6
	//*  70  114:ifeq            119
					i = 0;
	//   71  117:iconst_0        
	//   72  118:istore_1        
				k = l;
	//   73  119:iload           4
	//   74  121:istore_3        
			} else
	//*  75  122:goto            10
			{
				bytebuffer.clear();
	//   76  125:aload_0         
	//   77  126:invokevirtual   #94  <Method java.nio.Buffer ByteBuffer.clear()>
	//   78  129:pop             
				return;
	//   79  130:return          
			}
		} while(true);
	}

	public static boolean a(String s, byte byte0)
	{
		return "video/avc".equals(((Object) (s))) && (byte0 & 0x1f) == 6 || "video/hevc".equals(((Object) (s))) && (byte0 & 0x7e) >> 1 == 39;
	//    0    0:ldc1            #97  <String "video/avc">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #103 <Method boolean String.equals(Object)>
	//    3    6:ifeq            18
	//    4    9:iload_1         
	//    5   10:bipush          31
	//    6   12:iand            
	//    7   13:bipush          6
	//    8   15:icmpeq          38
	//    9   18:ldc1            #105 <String "video/hevc">
	//   10   20:aload_0         
	//   11   21:invokevirtual   #103 <Method boolean String.equals(Object)>
	//   12   24:ifeq            40
	//   13   27:iload_1         
	//   14   28:bipush          126
	//   15   30:iand            
	//   16   31:iconst_1        
	//   17   32:ishr            
	//   18   33:bipush          39
	//   19   35:icmpne          40
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	public static final byte a[] = {
		0, 0, 0, 1
	};
	private static final float b[] = {
		1.0F, 1.0F, 1.090909F, 0.9090909F, 1.454545F, 1.212121F, 2.181818F, 1.818182F, 2.909091F, 2.424242F, 
		1.636364F, 1.363636F, 1.939394F, 1.616162F, 1.333333F, 1.5F, 2.0F
	};
	private static final Object c = new Object();
	private static int d[] = new int[10];

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #15  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #15  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #15  <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #16  <Int 1>
	//   17   22:bastore         
	//   18   23:putstatic       #18  <Field byte[] a>
	//   19   26:bipush          17
	//   20   28:newarray        float[]
	//   21   30:dup             
	//   22   31:iconst_0        
	//   23   32:fconst_1        
	//   24   33:fastore         
	//   25   34:dup             
	//   26   35:iconst_1        
	//   27   36:fconst_1        
	//   28   37:fastore         
	//   29   38:dup             
	//   30   39:iconst_2        
	//   31   40:ldc1            #19  <Float 1.090909F>
	//   32   42:fastore         
	//   33   43:dup             
	//   34   44:iconst_3        
	//   35   45:ldc1            #20  <Float 0.9090909F>
	//   36   47:fastore         
	//   37   48:dup             
	//   38   49:iconst_4        
	//   39   50:ldc1            #21  <Float 1.454545F>
	//   40   52:fastore         
	//   41   53:dup             
	//   42   54:iconst_5        
	//   43   55:ldc1            #22  <Float 1.212121F>
	//   44   57:fastore         
	//   45   58:dup             
	//   46   59:bipush          6
	//   47   61:ldc1            #23  <Float 2.181818F>
	//   48   63:fastore         
	//   49   64:dup             
	//   50   65:bipush          7
	//   51   67:ldc1            #24  <Float 1.818182F>
	//   52   69:fastore         
	//   53   70:dup             
	//   54   71:bipush          8
	//   55   73:ldc1            #25  <Float 2.909091F>
	//   56   75:fastore         
	//   57   76:dup             
	//   58   77:bipush          9
	//   59   79:ldc1            #26  <Float 2.424242F>
	//   60   81:fastore         
	//   61   82:dup             
	//   62   83:bipush          10
	//   63   85:ldc1            #27  <Float 1.636364F>
	//   64   87:fastore         
	//   65   88:dup             
	//   66   89:bipush          11
	//   67   91:ldc1            #28  <Float 1.363636F>
	//   68   93:fastore         
	//   69   94:dup             
	//   70   95:bipush          12
	//   71   97:ldc1            #29  <Float 1.939394F>
	//   72   99:fastore         
	//   73  100:dup             
	//   74  101:bipush          13
	//   75  103:ldc1            #30  <Float 1.616162F>
	//   76  105:fastore         
	//   77  106:dup             
	//   78  107:bipush          14
	//   79  109:ldc1            #31  <Float 1.333333F>
	//   80  111:fastore         
	//   81  112:dup             
	//   82  113:bipush          15
	//   83  115:ldc1            #32  <Float 1.5F>
	//   84  117:fastore         
	//   85  118:dup             
	//   86  119:bipush          16
	//   87  121:fconst_2        
	//   88  122:fastore         
	//   89  123:putstatic       #34  <Field float[] b>
	//   90  126:new             #4   <Class Object>
	//   91  129:dup             
	//   92  130:invokespecial   #37  <Method void Object()>
	//   93  133:putstatic       #39  <Field Object c>
	//   94  136:bipush          10
	//   95  138:newarray        int[]
	//   96  140:putstatic       #41  <Field int[] d>
	//*  97  143:return          
	}
}
