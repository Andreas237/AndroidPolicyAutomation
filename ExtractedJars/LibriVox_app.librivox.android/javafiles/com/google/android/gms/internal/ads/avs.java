// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avm, aql, avx, avv, 
//			avw, avu

final class avs
{

	static int a(int i)
	{
		return b(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #33  <Method int b(int)>
	//    2    4:ireturn         
	}

	static int a(int i, int j)
	{
		return b(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #36  <Method int b(int, int)>
	//    3    5:ireturn         
	}

	static int a(int i, int j, int k)
	{
		return b(i, j, k);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #39  <Method int b(int, int, int)>
	//    4    6:ireturn         
	}

	static int a(CharSequence charsequence)
	{
		int k;
		int i1;
label0:
		{
			i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #46  <Method int CharSequence.length()>
	//    2    6:istore          5
			boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore          4
			int j;
			for(j = 0; j < i1 && charsequence.charAt(j) < '\200'; j++);
	//    5   11:iconst_0        
	//    6   12:istore_2        
	//    7   13:iload_2         
	//    8   14:iload           5
	//    9   16:icmpge          39
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokeinterface #50  <Method char CharSequence.charAt(int)>
	//   13   26:sipush          128
	//   14   29:icmpge          39
	//   15   32:iload_2         
	//   16   33:iconst_1        
	//   17   34:iadd            
	//   18   35:istore_2        
	//*  19   36:goto            13
			int i = i1;
	//   20   39:iload           5
	//   21   41:istore_1        
			do
			{
				k = i;
	//   22   42:iload_1         
	//   23   43:istore_3        
				if(j >= i1)
					break label0;
	//   24   44:iload_2         
	//   25   45:iload           5
	//   26   47:icmpge          208
				k = ((int) (charsequence.charAt(j)));
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:invokeinterface #50  <Method char CharSequence.charAt(int)>
	//   30   57:istore_3        
				if(k >= 2048)
					break;
	//   31   58:iload_3         
	//   32   59:sipush          2048
	//   33   62:icmpge          82
				i += 127 - k >>> 31;
	//   34   65:iload_1         
	//   35   66:bipush          127
	//   36   68:iload_3         
	//   37   69:isub            
	//   38   70:bipush          31
	//   39   72:iushr           
	//   40   73:iadd            
	//   41   74:istore_1        
				j++;
	//   42   75:iload_2         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_2        
			} while(true);
	//   46   79:goto            42
			int k1 = charsequence.length();
	//   47   82:aload_0         
	//   48   83:invokeinterface #46  <Method int CharSequence.length()>
	//   49   88:istore          7
			k = ((int) (flag));
	//   50   90:iload           4
	//   51   92:istore_3        
			int l;
			for(; j < k1; j = l + 1)
	//*  52   93:iload_2         
	//*  53   94:iload           7
	//*  54   96:icmpge          204
			{
				char c1 = charsequence.charAt(j);
	//   55   99:aload_0         
	//   56  100:iload_2         
	//   57  101:invokeinterface #50  <Method char CharSequence.charAt(int)>
	//   58  106:istore          8
				if(c1 < '\u0800')
	//*  59  108:iload           8
	//*  60  110:sipush          2048
	//*  61  113:icmpge          133
				{
					k += 127 - c1 >>> 31;
	//   62  116:iload_3         
	//   63  117:bipush          127
	//   64  119:iload           8
	//   65  121:isub            
	//   66  122:bipush          31
	//   67  124:iushr           
	//   68  125:iadd            
	//   69  126:istore_3        
					l = j;
	//   70  127:iload_2         
	//   71  128:istore          4
					continue;
	//   72  130:goto            196
				}
				int j1 = k + 2;
	//   73  133:iload_3         
	//   74  134:iconst_2        
	//   75  135:iadd            
	//   76  136:istore          6
				k = j1;
	//   77  138:iload           6
	//   78  140:istore_3        
				l = j;
	//   79  141:iload_2         
	//   80  142:istore          4
				if('\uD800' > c1)
					continue;
	//   81  144:ldc1            #51  <Int 55296>
	//   82  146:iload           8
	//   83  148:icmpgt          196
				k = j1;
	//   84  151:iload           6
	//   85  153:istore_3        
				l = j;
	//   86  154:iload_2         
	//   87  155:istore          4
				if(c1 > '\uDFFF')
					continue;
	//   88  157:iload           8
	//   89  159:ldc1            #52  <Int 57343>
	//   90  161:icmpgt          196
				if(Character.codePointAt(charsequence, j) >= 0x10000)
	//*  91  164:aload_0         
	//*  92  165:iload_2         
	//*  93  166:invokestatic    #58  <Method int Character.codePointAt(CharSequence, int)>
	//*  94  169:ldc1            #59  <Int 0x10000>
	//*  95  171:icmplt          185
				{
					l = j + 1;
	//   96  174:iload_2         
	//   97  175:iconst_1        
	//   98  176:iadd            
	//   99  177:istore          4
					k = j1;
	//  100  179:iload           6
	//  101  181:istore_3        
				} else
	//* 102  182:goto            196
				{
					throw new avw(j, k1);
	//  103  185:new             #61  <Class avw>
	//  104  188:dup             
	//  105  189:iload_2         
	//  106  190:iload           7
	//  107  192:invokespecial   #64  <Method void avw(int, int)>
	//  108  195:athrow          
				}
			}

	//  109  196:iload           4
	//  110  198:iconst_1        
	//  111  199:iadd            
	//  112  200:istore_2        
	//* 113  201:goto            93
			k = i + k;
	//  114  204:iload_1         
	//  115  205:iload_3         
	//  116  206:iadd            
	//  117  207:istore_3        
		}
		if(k >= i1)
	//* 118  208:iload_3         
	//* 119  209:iload           5
	//* 120  211:icmplt          216
		{
			return k;
	//  121  214:iload_3         
	//  122  215:ireturn         
		} else
		{
			long l1 = k;
	//  123  216:iload_3         
	//  124  217:i2l             
	//  125  218:lstore          9
			charsequence = ((CharSequence) (new StringBuilder(54)));
	//  126  220:new             #66  <Class StringBuilder>
	//  127  223:dup             
	//  128  224:bipush          54
	//  129  226:invokespecial   #69  <Method void StringBuilder(int)>
	//  130  229:astore_0        
			((StringBuilder) (charsequence)).append("UTF-8 length does not fit in int: ");
	//  131  230:aload_0         
	//  132  231:ldc1            #71  <String "UTF-8 length does not fit in int: ">
	//  133  233:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  134  236:pop             
			((StringBuilder) (charsequence)).append(l1 + 0x0L);
	//  135  237:aload_0         
	//  136  238:lload           9
	//  137  240:ldc2w           #76  <Long 0x0L>
	//  138  243:ladd            
	//  139  244:invokevirtual   #80  <Method StringBuilder StringBuilder.append(long)>
	//  140  247:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  141  248:new             #82  <Class IllegalArgumentException>
	//  142  251:dup             
	//  143  252:aload_0         
	//  144  253:invokevirtual   #86  <Method String StringBuilder.toString()>
	//  145  256:invokespecial   #89  <Method void IllegalArgumentException(String)>
	//  146  259:athrow          
		}
	}

	static int a(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		return a.a(charsequence, abyte0, i, j);
	//    0    0:getstatic       #29  <Field avu a>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #94  <Method int avu.a(CharSequence, byte[], int, int)>
	//    6   10:ireturn         
	}

	static void a(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		avu avu1 = a;
	//    0    0:getstatic       #29  <Field avu a>
	//    1    3:astore_3        
		if(bytebuffer.hasArray())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #100 <Method boolean ByteBuffer.hasArray()>
	//*   4    8:ifeq            42
		{
			int i = bytebuffer.arrayOffset();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #103 <Method int ByteBuffer.arrayOffset()>
	//    7   15:istore_2        
			bytebuffer.position(a(charsequence, bytebuffer.array(), bytebuffer.position() + i, bytebuffer.remaining()) - i);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #107 <Method byte[] ByteBuffer.array()>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #110 <Method int ByteBuffer.position()>
	//   14   26:iload_2         
	//   15   27:iadd            
	//   16   28:aload_1         
	//   17   29:invokevirtual   #113 <Method int ByteBuffer.remaining()>
	//   18   32:invokestatic    #114 <Method int a(CharSequence, byte[], int, int)>
	//   19   35:iload_2         
	//   20   36:isub            
	//   21   37:invokevirtual   #117 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   22   40:pop             
			return;
	//   23   41:return          
		}
		if(bytebuffer.isDirect())
	//*  24   42:aload_1         
	//*  25   43:invokevirtual   #120 <Method boolean ByteBuffer.isDirect()>
	//*  26   46:ifeq            56
		{
			avu1.a(charsequence, bytebuffer);
	//   27   49:aload_3         
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #122 <Method void avu.a(CharSequence, ByteBuffer)>
			return;
	//   31   55:return          
		} else
		{
			avu.b(charsequence, bytebuffer);
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:invokestatic    #124 <Method void avu.b(CharSequence, ByteBuffer)>
			return;
	//   35   61:return          
		}
	}

	public static boolean a(byte abyte0[])
	{
		return a.a(abyte0, 0, abyte0.length);
	//    0    0:getstatic       #29  <Field avu a>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:invokevirtual   #128 <Method boolean avu.a(byte[], int, int)>
	//    6   10:ireturn         
	}

	public static boolean a(byte abyte0[], int i, int j)
	{
		return a.a(abyte0, i, j);
	//    0    0:getstatic       #29  <Field avu a>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #128 <Method boolean avu.a(byte[], int, int)>
	//    5    9:ireturn         
	}

	private static int b(int i)
	{
		if(i > -12)
	//*   0    0:iload_0         
	//*   1    1:bipush          -12
	//*   2    3:icmple          8
			return -1;
	//    3    6:iconst_m1       
	//    4    7:ireturn         
		else
			return i;
	//    5    8:iload_0         
	//    6    9:ireturn         
	}

	private static int b(int i, int j)
	{
		if(i <= -12 && j <= -65)
	//*   0    0:iload_0         
	//*   1    1:bipush          -12
	//*   2    3:icmpgt          22
	//*   3    6:iload_1         
	//*   4    7:bipush          -65
	//*   5    9:icmple          15
	//*   6   12:goto            22
			return i ^ j << 8;
	//    7   15:iload_0         
	//    8   16:iload_1         
	//    9   17:bipush          8
	//   10   19:ishl            
	//   11   20:ixor            
	//   12   21:ireturn         
		else
			return -1;
	//   13   22:iconst_m1       
	//   14   23:ireturn         
	}

	private static int b(int i, int j, int k)
	{
		if(i <= -12 && j <= -65 && k <= -65)
	//*   0    0:iload_0         
	//*   1    1:bipush          -12
	//*   2    3:icmpgt          33
	//*   3    6:iload_1         
	//*   4    7:bipush          -65
	//*   5    9:icmpgt          33
	//*   6   12:iload_2         
	//*   7   13:bipush          -65
	//*   8   15:icmple          21
	//*   9   18:goto            33
			return i ^ j << 8 ^ k << 16;
	//   10   21:iload_0         
	//   11   22:iload_1         
	//   12   23:bipush          8
	//   13   25:ishl            
	//   14   26:ixor            
	//   15   27:iload_2         
	//   16   28:bipush          16
	//   17   30:ishl            
	//   18   31:ixor            
	//   19   32:ireturn         
		else
			return -1;
	//   20   33:iconst_m1       
	//   21   34:ireturn         
	}

	static String b(byte abyte0[], int i, int j)
	{
		return a.b(abyte0, i, j);
	//    0    0:getstatic       #29  <Field avu a>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #131 <Method String avu.b(byte[], int, int)>
	//    5    9:areturn         
	}

	static int c(byte abyte0[], int i, int j)
	{
		return d(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #136 <Method int d(byte[], int, int)>
	//    4    6:ireturn         
	}

	private static int d(byte abyte0[], int i, int j)
	{
		byte byte0 = abyte0[i - 1];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:baload          
	//    5    5:istore_3        
		switch(j - i)
	//*   6    6:iload_2         
	//*   7    7:iload_1         
	//*   8    8:isub            
		{
	//*   9    9:tableswitch     0 2: default 36
	//	               0 65
	//	               1 57
	//	               2 44
		default:
			throw new AssertionError();
	//   10   36:new             #138 <Class AssertionError>
	//   11   39:dup             
	//   12   40:invokespecial   #139 <Method void AssertionError()>
	//   13   43:athrow          

		case 2: // '\002'
			return b(((int) (byte0)), ((int) (abyte0[i])), ((int) (abyte0[i + 1])));
	//   14   44:iload_3         
	//   15   45:aload_0         
	//   16   46:iload_1         
	//   17   47:baload          
	//   18   48:aload_0         
	//   19   49:iload_1         
	//   20   50:iconst_1        
	//   21   51:iadd            
	//   22   52:baload          
	//   23   53:invokestatic    #39  <Method int b(int, int, int)>
	//   24   56:ireturn         

		case 1: // '\001'
			return b(((int) (byte0)), ((int) (abyte0[i])));
	//   25   57:iload_3         
	//   26   58:aload_0         
	//   27   59:iload_1         
	//   28   60:baload          
	//   29   61:invokestatic    #36  <Method int b(int, int)>
	//   30   64:ireturn         

		case 0: // '\0'
			return b(((int) (byte0)));
	//   31   65:iload_3         
	//   32   66:invokestatic    #33  <Method int b(int)>
	//   33   69:ireturn         
		}
	}

	private static final avu a;

	static 
	{
		boolean flag;
		if(avm.a() && avm.b())
	//*   0    0:invokestatic    #13  <Method boolean avm.a()>
	//*   1    3:ifeq            17
	//*   2    6:invokestatic    #16  <Method boolean avm.b()>
	//*   3    9:ifeq            17
			flag = true;
	//    4   12:iconst_1        
	//    5   13:istore_0        
		else
	//*   6   14:goto            19
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_0        
		Object obj;
		if(flag && !aql.a())
	//*   9   19:iload_0         
	//*  10   20:ifeq            40
	//*  11   23:invokestatic    #19  <Method boolean aql.a()>
	//*  12   26:ifne            40
			obj = ((Object) (new avx()));
	//   13   29:new             #21  <Class avx>
	//   14   32:dup             
	//   15   33:invokespecial   #24  <Method void avx()>
	//   16   36:astore_1        
		else
	//*  17   37:goto            48
			obj = ((Object) (new avv()));
	//   18   40:new             #26  <Class avv>
	//   19   43:dup             
	//   20   44:invokespecial   #27  <Method void avv()>
	//   21   47:astore_1        
		a = ((avu) (obj));
	//   22   48:aload_1         
	//   23   49:putstatic       #29  <Field avu a>
	//*  24   52:return          
	}
}
