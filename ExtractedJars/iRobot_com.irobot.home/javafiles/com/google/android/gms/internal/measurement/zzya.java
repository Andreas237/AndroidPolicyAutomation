// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyi, zzyb, zztv, zzvv

public final class zzya
{

	private zzya(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbut = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ByteBuffer zzbut>
		zzbut.order(ByteOrder.LITTLE_ENDIAN);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field ByteBuffer zzbut>
	//    7   13:getstatic       #23  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    8   16:invokevirtual   #29  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    9   19:pop             
	//   10   20:return          
	}

	private zzya(byte abyte0[], int i, int j)
	{
		this(ByteBuffer.wrap(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #35  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    5    7:invokespecial   #37  <Method void zzya(ByteBuffer)>
	//    6   10:return          
	}

	private static int zza(CharSequence charsequence)
	{
		int k;
		int i1;
label0:
		{
			i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #45  <Method int CharSequence.length()>
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
	//   12   21:invokeinterface #49  <Method char CharSequence.charAt(int)>
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
	//   26   47:icmpge          229
				k = ((int) (charsequence.charAt(j)));
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:invokeinterface #49  <Method char CharSequence.charAt(int)>
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
	//   48   83:invokeinterface #45  <Method int CharSequence.length()>
	//   49   88:istore          7
			k = ((int) (flag));
	//   50   90:iload           4
	//   51   92:istore_3        
			int l;
			for(; j < k1; j = l + 1)
	//*  52   93:iload_2         
	//*  53   94:iload           7
	//*  54   96:icmpge          225
			{
				char c = charsequence.charAt(j);
	//   55   99:aload_0         
	//   56  100:iload_2         
	//   57  101:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//   58  106:istore          8
				if(c < '\u0800')
	//*  59  108:iload           8
	//*  60  110:sipush          2048
	//*  61  113:icmpge          133
				{
					k += 127 - c >>> 31;
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
	//   72  130:goto            217
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
				if('\uD800' > c)
					continue;
	//   81  144:ldc1            #50  <Int 55296>
	//   82  146:iload           8
	//   83  148:icmpgt          217
				k = j1;
	//   84  151:iload           6
	//   85  153:istore_3        
				l = j;
	//   86  154:iload_2         
	//   87  155:istore          4
				if(c > '\uDFFF')
					continue;
	//   88  157:iload           8
	//   89  159:ldc1            #51  <Int 57343>
	//   90  161:icmpgt          217
				if(Character.codePointAt(charsequence, j) < 0x10000)
	//*  91  164:aload_0         
	//*  92  165:iload_2         
	//*  93  166:invokestatic    #57  <Method int Character.codePointAt(CharSequence, int)>
	//*  94  169:ldc1            #58  <Int 0x10000>
	//*  95  171:icmpge          209
				{
					charsequence = ((CharSequence) (new StringBuilder(39)));
	//   96  174:new             #60  <Class StringBuilder>
	//   97  177:dup             
	//   98  178:bipush          39
	//   99  180:invokespecial   #63  <Method void StringBuilder(int)>
	//  100  183:astore_0        
					((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
	//  101  184:aload_0         
	//  102  185:ldc1            #65  <String "Unpaired surrogate at index ">
	//  103  187:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  104  190:pop             
					((StringBuilder) (charsequence)).append(j);
	//  105  191:aload_0         
	//  106  192:iload_2         
	//  107  193:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//  108  196:pop             
					throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  109  197:new             #74  <Class IllegalArgumentException>
	//  110  200:dup             
	//  111  201:aload_0         
	//  112  202:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  113  205:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//  114  208:athrow          
				}
				l = j + 1;
	//  115  209:iload_2         
	//  116  210:iconst_1        
	//  117  211:iadd            
	//  118  212:istore          4
				k = j1;
	//  119  214:iload           6
	//  120  216:istore_3        
			}

	//  121  217:iload           4
	//  122  219:iconst_1        
	//  123  220:iadd            
	//  124  221:istore_2        
	//* 125  222:goto            93
			k = i + k;
	//  126  225:iload_1         
	//  127  226:iload_3         
	//  128  227:iadd            
	//  129  228:istore_3        
		}
		if(k < i1)
	//* 130  229:iload_3         
	//* 131  230:iload           5
	//* 132  232:icmpge          279
		{
			long l1 = k;
	//  133  235:iload_3         
	//  134  236:i2l             
	//  135  237:lstore          9
			charsequence = ((CharSequence) (new StringBuilder(54)));
	//  136  239:new             #60  <Class StringBuilder>
	//  137  242:dup             
	//  138  243:bipush          54
	//  139  245:invokespecial   #63  <Method void StringBuilder(int)>
	//  140  248:astore_0        
			((StringBuilder) (charsequence)).append("UTF-8 length does not fit in int: ");
	//  141  249:aload_0         
	//  142  250:ldc1            #83  <String "UTF-8 length does not fit in int: ">
	//  143  252:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  144  255:pop             
			((StringBuilder) (charsequence)).append(l1 + 0x0L);
	//  145  256:aload_0         
	//  146  257:lload           9
	//  147  259:ldc2w           #84  <Long 0x0L>
	//  148  262:ladd            
	//  149  263:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
	//  150  266:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  151  267:new             #74  <Class IllegalArgumentException>
	//  152  270:dup             
	//  153  271:aload_0         
	//  154  272:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  155  275:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//  156  278:athrow          
		} else
		{
			return k;
	//  157  279:iload_3         
	//  158  280:ireturn         
		}
	}

	public static int zzb(int i, zzyi zzyi1)
	{
		i = zzbd(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #94  <Method int zzbd(int)>
	//    2    4:istore_0        
		int j = zzyi1.zzvx();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #99  <Method int zzyi.zzvx()>
	//    5    9:istore_2        
		return i + (zzbl(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #102 <Method int zzbl(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzbd(int i)
	{
		return zzbl(i << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #102 <Method int zzbl(int)>
	//    4    6:ireturn         
	}

	public static int zzbe(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzbl(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #102 <Method int zzbl(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	private final void zzbf(long l)
	{
		do
		{
			if((-128L & l) == 0L)
	//*   0    0:ldc2w           #106 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            17
			{
				zzcc((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokespecial   #110 <Method void zzcc(int)>
				return;
	//   10   16:return          
			}
			zzcc((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokespecial   #110 <Method void zzcc(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public static int zzbg(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #106 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if((-16384L & l) == 0L)
	//*   8   12:ldc2w           #113 <Long -16384L>
	//*   9   15:lload_0         
	//*  10   16:land            
	//*  11   17:lconst_0        
	//*  12   18:lcmp            
	//*  13   19:ifne            24
			return 2;
	//   14   22:iconst_2        
	//   15   23:ireturn         
		if((0xffe00000L & l) == 0L)
	//*  16   24:ldc2w           #115 <Long 0xffe00000L>
	//*  17   27:lload_0         
	//*  18   28:land            
	//*  19   29:lconst_0        
	//*  20   30:lcmp            
	//*  21   31:ifne            36
			return 3;
	//   22   34:iconst_3        
	//   23   35:ireturn         
		if((0xf0000000L & l) == 0L)
	//*  24   36:ldc2w           #117 <Long 0xf0000000L>
	//*  25   39:lload_0         
	//*  26   40:land            
	//*  27   41:lconst_0        
	//*  28   42:lcmp            
	//*  29   43:ifne            48
			return 4;
	//   30   46:iconst_4        
	//   31   47:ireturn         
		if((0x0L & l) == 0L)
	//*  32   48:ldc2w           #119 <Long 0x0L>
	//*  33   51:lload_0         
	//*  34   52:land            
	//*  35   53:lconst_0        
	//*  36   54:lcmp            
	//*  37   55:ifne            60
			return 5;
	//   38   58:iconst_5        
	//   39   59:ireturn         
		if((0x0L & l) == 0L)
	//*  40   60:ldc2w           #121 <Long 0x0L>
	//*  41   63:lload_0         
	//*  42   64:land            
	//*  43   65:lconst_0        
	//*  44   66:lcmp            
	//*  45   67:ifne            73
			return 6;
	//   46   70:bipush          6
	//   47   72:ireturn         
		if((0x0L & l) == 0L)
	//*  48   73:ldc2w           #123 <Long 0x0L>
	//*  49   76:lload_0         
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifne            86
			return 7;
	//   54   83:bipush          7
	//   55   85:ireturn         
		if((0x0L & l) == 0L)
	//*  56   86:ldc2w           #125 <Long 0x0L>
	//*  57   89:lload_0         
	//*  58   90:land            
	//*  59   91:lconst_0        
	//*  60   92:lcmp            
	//*  61   93:ifne            99
			return 8;
	//   62   96:bipush          8
	//   63   98:ireturn         
		return (l & 0x0L) != 0L ? 10 : 9;
	//   64   99:lload_0         
	//   65  100:ldc2w           #127 <Long 0x0L>
	//   66  103:land            
	//   67  104:lconst_0        
	//   68  105:lcmp            
	//   69  106:ifne            112
	//   70  109:bipush          9
	//   71  111:ireturn         
	//   72  112:bipush          10
	//   73  114:ireturn         
	}

	public static int zzbl(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #129 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #130 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzc(int i, String s)
	{
		return zzbd(i) + zzgc(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #94  <Method int zzbd(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #136 <Method int zzgc(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	private final void zzcc(int i)
	{
		byte byte0 = (byte)i;
	//    0    0:iload_1         
	//    1    1:int2byte        
	//    2    2:istore_2        
		if(!zzbut.hasRemaining())
	//*   3    3:aload_0         
	//*   4    4:getfield        #17  <Field ByteBuffer zzbut>
	//*   5    7:invokevirtual   #140 <Method boolean ByteBuffer.hasRemaining()>
	//*   6   10:ifne            35
		{
			throw new zzyb(zzbut.position(), zzbut.limit());
	//    7   13:new             #142 <Class zzyb>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field ByteBuffer zzbut>
	//   11   21:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field ByteBuffer zzbut>
	//   14   28:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   15   31:invokespecial   #151 <Method void zzyb(int, int)>
	//   16   34:athrow          
		} else
		{
			zzbut.put(byte0);
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field ByteBuffer zzbut>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//   21   43:pop             
			return;
	//   22   44:return          
		}
	}

	public static int zzd(int i, long l)
	{
		return zzbd(i) + zzbg(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #94  <Method int zzbd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #159 <Method int zzbg(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	private static void zzd(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int i;
		int j;
		boolean flag;
		if(bytebuffer.isReadOnly())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #165 <Method boolean ByteBuffer.isReadOnly()>
	//*   2    4:ifeq            15
			throw new ReadOnlyBufferException();
	//    3    7:new             #167 <Class ReadOnlyBufferException>
	//    4   10:dup             
	//    5   11:invokespecial   #168 <Method void ReadOnlyBufferException()>
	//    6   14:athrow          
		flag = bytebuffer.hasArray();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #171 <Method boolean ByteBuffer.hasArray()>
	//    9   19:istore          10
		j = 0;
	//   10   21:iconst_0        
	//   11   22:istore          5
		i = 0;
	//   12   24:iconst_0        
	//   13   25:istore          4
		if(!flag) goto _L2; else goto _L1
	//   14   27:iload           10
	//   15   29:ifeq            451
_L1:
		char c;
		int k;
		int j1;
		int k1;
		byte abyte0[];
		char c1;
		int l1;
		try
		{
			abyte0 = bytebuffer.array();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #175 <Method byte[] ByteBuffer.array()>
	//   18   36:astore          11
			j = bytebuffer.arrayOffset() + bytebuffer.position();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #178 <Method int ByteBuffer.arrayOffset()>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   23   46:iadd            
	//   24   47:istore          5
			k = bytebuffer.remaining();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//   27   53:istore          6
			j1 = charsequence.length();
	//   28   55:aload_0         
	//   29   56:invokeinterface #45  <Method int CharSequence.length()>
	//   30   61:istore          7
		}
	//*  31   63:iload           6
	//*  32   65:iload           5
	//*  33   67:iadd            
	//*  34   68:istore          8
	//*  35   70:iload           4
	//*  36   72:iload           7
	//*  37   74:icmpge          752
	//*  38   77:iload           4
	//*  39   79:iload           5
	//*  40   81:iadd            
	//*  41   82:istore          6
	//*  42   84:iload           6
	//*  43   86:iload           8
	//*  44   88:icmpge          752
	//*  45   91:aload_0         
	//*  46   92:iload           4
	//*  47   94:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//*  48   99:istore          9
	//*  49  101:iload           9
	//*  50  103:sipush          128
	//*  51  106:icmpge          752
	//*  52  109:aload           11
	//*  53  111:iload           6
	//*  54  113:iload           9
	//*  55  115:int2byte        
	//*  56  116:bastore         
	//*  57  117:iload           4
	//*  58  119:iconst_1        
	//*  59  120:iadd            
	//*  60  121:istore          4
	//*  61  123:goto            70
	//*  62  126:iload           5
	//*  63  128:istore          6
	//*  64  130:iload           4
	//*  65  132:iload           7
	//*  66  134:icmpge          421
	//*  67  137:aload_0         
	//*  68  138:iload           4
	//*  69  140:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//*  70  145:istore_2        
	//*  71  146:iload_2         
	//*  72  147:sipush          128
	//*  73  150:icmpge          782
	//*  74  153:iload           5
	//*  75  155:iload           8
	//*  76  157:icmpge          782
	//*  77  160:iload           5
	//*  78  162:iconst_1        
	//*  79  163:iadd            
	//*  80  164:istore          6
	//*  81  166:aload           11
	//*  82  168:iload           5
	//*  83  170:iload_2         
	//*  84  171:int2byte        
	//*  85  172:bastore         
	//*  86  173:iload           6
	//*  87  175:istore          5
	//*  88  177:goto            779
	//*  89  180:iload           5
	//*  90  182:iload           8
	//*  91  184:iconst_4        
	//*  92  185:isub            
	//*  93  186:icmpgt          372
	//*  94  189:iload           4
	//*  95  191:iconst_1        
	//*  96  192:iadd            
	//*  97  193:istore          6
	//*  98  195:iload           6
	//*  99  197:aload_0         
	//* 100  198:invokeinterface #45  <Method int CharSequence.length()>
	//* 101  203:icmpeq          334
	//* 102  206:aload_0         
	//* 103  207:iload           6
	//* 104  209:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//* 105  214:istore_3        
	//* 106  215:iload_2         
	//* 107  216:iload_3         
	//* 108  217:invokestatic    #185 <Method boolean Character.isSurrogatePair(char, char)>
	//* 109  220:ifne            230
	//* 110  223:iload           6
	//* 111  225:istore          4
	//* 112  227:goto            334
	//* 113  230:iload_2         
	//* 114  231:iload_3         
	//* 115  232:invokestatic    #189 <Method int Character.toCodePoint(char, char)>
	//* 116  235:istore          4
	//* 117  237:iload           5
	//* 118  239:iconst_1        
	//* 119  240:iadd            
	//* 120  241:istore          9
	//* 121  243:aload           11
	//* 122  245:iload           5
	//* 123  247:iload           4
	//* 124  249:bipush          18
	//* 125  251:iushr           
	//* 126  252:sipush          240
	//* 127  255:ior             
	//* 128  256:int2byte        
	//* 129  257:bastore         
	//* 130  258:iload           9
	//* 131  260:iconst_1        
	//* 132  261:iadd            
	//* 133  262:istore          5
	//* 134  264:aload           11
	//* 135  266:iload           9
	//* 136  268:iload           4
	//* 137  270:bipush          12
	//* 138  272:iushr           
	//* 139  273:bipush          63
	//* 140  275:iand            
	//* 141  276:sipush          128
	//* 142  279:ior             
	//* 143  280:int2byte        
	//* 144  281:bastore         
	//* 145  282:iload           5
	//* 146  284:iconst_1        
	//* 147  285:iadd            
	//* 148  286:istore          9
	//* 149  288:aload           11
	//* 150  290:iload           5
	//* 151  292:iload           4
	//* 152  294:bipush          6
	//* 153  296:iushr           
	//* 154  297:bipush          63
	//* 155  299:iand            
	//* 156  300:sipush          128
	//* 157  303:ior             
	//* 158  304:int2byte        
	//* 159  305:bastore         
	//* 160  306:iload           9
	//* 161  308:iconst_1        
	//* 162  309:iadd            
	//* 163  310:istore          5
	//* 164  312:aload           11
	//* 165  314:iload           9
	//* 166  316:iload           4
	//* 167  318:bipush          63
	//* 168  320:iand            
	//* 169  321:sipush          128
	//* 170  324:ior             
	//* 171  325:int2byte        
	//* 172  326:bastore         
	//* 173  327:iload           6
	//* 174  329:istore          4
	//* 175  331:goto            928
	//* 176  334:new             #60  <Class StringBuilder>
	//* 177  337:dup             
	//* 178  338:bipush          39
	//* 179  340:invokespecial   #63  <Method void StringBuilder(int)>
	//* 180  343:astore_0        
	//* 181  344:aload_0         
	//* 182  345:ldc1            #65  <String "Unpaired surrogate at index ">
	//* 183  347:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 184  350:pop             
	//* 185  351:aload_0         
	//* 186  352:iload           4
	//* 187  354:iconst_1        
	//* 188  355:isub            
	//* 189  356:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//* 190  359:pop             
	//* 191  360:new             #74  <Class IllegalArgumentException>
	//* 192  363:dup             
	//* 193  364:aload_0         
	//* 194  365:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 195  368:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//* 196  371:athrow          
	//* 197  372:new             #60  <Class StringBuilder>
	//* 198  375:dup             
	//* 199  376:bipush          37
	//* 200  378:invokespecial   #63  <Method void StringBuilder(int)>
	//* 201  381:astore_0        
	//* 202  382:aload_0         
	//* 203  383:ldc1            #191 <String "Failed writing ">
	//* 204  385:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 205  388:pop             
	//* 206  389:aload_0         
	//* 207  390:iload_2         
	//* 208  391:invokevirtual   #194 <Method StringBuilder StringBuilder.append(char)>
	//* 209  394:pop             
	//* 210  395:aload_0         
	//* 211  396:ldc1            #196 <String " at index ">
	//* 212  398:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 213  401:pop             
	//* 214  402:aload_0         
	//* 215  403:iload           5
	//* 216  405:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//* 217  408:pop             
	//* 218  409:new             #162 <Class ArrayIndexOutOfBoundsException>
	//* 219  412:dup             
	//* 220  413:aload_0         
	//* 221  414:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 222  417:invokespecial   #197 <Method void ArrayIndexOutOfBoundsException(String)>
	//* 223  420:athrow          
	//* 224  421:aload_1         
	//* 225  422:iload           6
	//* 226  424:aload_1         
	//* 227  425:invokevirtual   #178 <Method int ByteBuffer.arrayOffset()>
	//* 228  428:isub            
	//* 229  429:invokevirtual   #200 <Method java.nio.Buffer ByteBuffer.position(int)>
	//* 230  432:pop             
	//* 231  433:return          
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//* 232  434:astore_0        
		{
			bytebuffer = ((ByteBuffer) (new BufferOverflowException()));
	//  233  435:new             #202 <Class BufferOverflowException>
	//  234  438:dup             
	//  235  439:invokespecial   #203 <Method void BufferOverflowException()>
	//  236  442:astore_1        
			((BufferOverflowException) (bytebuffer)).initCause(((Throwable) (charsequence)));
	//  237  443:aload_1         
	//  238  444:aload_0         
	//  239  445:invokevirtual   #207 <Method Throwable BufferOverflowException.initCause(Throwable)>
	//  240  448:pop             
			throw bytebuffer;
	//  241  449:aload_1         
	//  242  450:athrow          
		}
		k1 = k + j;
		if(i >= j1)
			break; /* Loop/switch isn't completed */
		k = i + j;
		if(k >= k1)
			break; /* Loop/switch isn't completed */
		l1 = ((int) (charsequence.charAt(i)));
		if(l1 >= '\200')
			break; /* Loop/switch isn't completed */
		abyte0[k] = (byte)l1;
		i++;
		if(true) goto _L4; else goto _L3
_L4:
		break MISSING_BLOCK_LABEL_70;
_L19:
		k = j;
		if(i >= j1) goto _L6; else goto _L5
_L5:
		c = charsequence.charAt(i);
		if(c < '\200' && j < k1)
		{
			k = j + 1;
			abyte0[j] = (byte)c;
			j = k;
		} else
	//* 243  451:aload_0         
	//* 244  452:invokeinterface #45  <Method int CharSequence.length()>
	//* 245  457:istore          6
	//* 246  459:iload           5
	//* 247  461:istore          4
	//* 248  463:iload           4
	//* 249  465:iload           6
	//* 250  467:icmpge          751
	//* 251  470:aload_0         
	//* 252  471:iload           4
	//* 253  473:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//* 254  478:istore_2        
	//* 255  479:iload_2         
	//* 256  480:sipush          128
	//* 257  483:icmpge          500
	//* 258  486:iload_2         
	//* 259  487:istore          5
	//* 260  489:aload_1         
	//* 261  490:iload           5
	//* 262  492:int2byte        
	//* 263  493:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 264  496:pop             
	//* 265  497:goto            742
	//* 266  500:iload_2         
	//* 267  501:sipush          2048
	//* 268  504:icmpge          538
	//* 269  507:iload_2         
	//* 270  508:bipush          6
	//* 271  510:iushr           
	//* 272  511:sipush          960
	//* 273  514:ior             
	//* 274  515:istore          5
	//* 275  517:aload_1         
	//* 276  518:iload           5
	//* 277  520:int2byte        
	//* 278  521:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 279  524:pop             
	//* 280  525:iload_2         
	//* 281  526:bipush          63
	//* 282  528:iand            
	//* 283  529:sipush          128
	//* 284  532:ior             
	//* 285  533:istore          5
	//* 286  535:goto            489
	//* 287  538:iload_2         
	//* 288  539:ldc1            #50  <Int 55296>
	//* 289  541:icmplt          712
	//* 290  544:ldc1            #51  <Int 57343>
	//* 291  546:iload_2         
	//* 292  547:icmpge          553
	//* 293  550:goto            712
	//* 294  553:iload           4
	//* 295  555:iconst_1        
	//* 296  556:iadd            
	//* 297  557:istore          5
	//* 298  559:iload           5
	//* 299  561:aload_0         
	//* 300  562:invokeinterface #45  <Method int CharSequence.length()>
	//* 301  567:icmpeq          674
	//* 302  570:aload_0         
	//* 303  571:iload           5
	//* 304  573:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//* 305  578:istore_3        
	//* 306  579:iload_2         
	//* 307  580:iload_3         
	//* 308  581:invokestatic    #185 <Method boolean Character.isSurrogatePair(char, char)>
	//* 309  584:ifne            594
	//* 310  587:iload           5
	//* 311  589:istore          4
	//* 312  591:goto            674
	//* 313  594:iload_2         
	//* 314  595:iload_3         
	//* 315  596:invokestatic    #189 <Method int Character.toCodePoint(char, char)>
	//* 316  599:istore          4
	//* 317  601:aload_1         
	//* 318  602:iload           4
	//* 319  604:bipush          18
	//* 320  606:iushr           
	//* 321  607:sipush          240
	//* 322  610:ior             
	//* 323  611:int2byte        
	//* 324  612:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 325  615:pop             
	//* 326  616:aload_1         
	//* 327  617:iload           4
	//* 328  619:bipush          12
	//* 329  621:iushr           
	//* 330  622:bipush          63
	//* 331  624:iand            
	//* 332  625:sipush          128
	//* 333  628:ior             
	//* 334  629:int2byte        
	//* 335  630:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 336  633:pop             
	//* 337  634:aload_1         
	//* 338  635:iload           4
	//* 339  637:bipush          6
	//* 340  639:iushr           
	//* 341  640:bipush          63
	//* 342  642:iand            
	//* 343  643:sipush          128
	//* 344  646:ior             
	//* 345  647:int2byte        
	//* 346  648:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 347  651:pop             
	//* 348  652:aload_1         
	//* 349  653:iload           4
	//* 350  655:bipush          63
	//* 351  657:iand            
	//* 352  658:sipush          128
	//* 353  661:ior             
	//* 354  662:int2byte        
	//* 355  663:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 356  666:pop             
	//* 357  667:iload           5
	//* 358  669:istore          4
	//* 359  671:goto            742
	//* 360  674:new             #60  <Class StringBuilder>
	//* 361  677:dup             
	//* 362  678:bipush          39
	//* 363  680:invokespecial   #63  <Method void StringBuilder(int)>
	//* 364  683:astore_0        
	//* 365  684:aload_0         
	//* 366  685:ldc1            #65  <String "Unpaired surrogate at index ">
	//* 367  687:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 368  690:pop             
	//* 369  691:aload_0         
	//* 370  692:iload           4
	//* 371  694:iconst_1        
	//* 372  695:isub            
	//* 373  696:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//* 374  699:pop             
	//* 375  700:new             #74  <Class IllegalArgumentException>
	//* 376  703:dup             
	//* 377  704:aload_0         
	//* 378  705:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 379  708:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//* 380  711:athrow          
	//* 381  712:aload_1         
	//* 382  713:iload_2         
	//* 383  714:bipush          12
	//* 384  716:iushr           
	//* 385  717:sipush          480
	//* 386  720:ior             
	//* 387  721:int2byte        
	//* 388  722:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//* 389  725:pop             
	//* 390  726:iload_2         
	//* 391  727:bipush          6
	//* 392  729:iushr           
	//* 393  730:bipush          63
	//* 394  732:iand            
	//* 395  733:sipush          128
	//* 396  736:ior             
	//* 397  737:istore          5
	//* 398  739:goto            517
	//* 399  742:iload           4
	//* 400  744:iconst_1        
	//* 401  745:iadd            
	//* 402  746:istore          4
	//* 403  748:goto            463
	//* 404  751:return          
	//* 405  752:iload           4
	//* 406  754:iload           7
	//* 407  756:icmpne          769
	//* 408  759:iload           5
	//* 409  761:iload           7
	//* 410  763:iadd            
	//* 411  764:istore          6
	//* 412  766:goto            421
	//* 413  769:iload           5
	//* 414  771:iload           4
	//* 415  773:iadd            
	//* 416  774:istore          5
	//* 417  776:goto            126
	//* 418  779:goto            928
		{
			if(c < '\u0800' && j <= k1 - 2)
	//* 419  782:iload_2         
	//* 420  783:sipush          2048
	//* 421  786:icmpge          841
	//* 422  789:iload           5
	//* 423  791:iload           8
	//* 424  793:iconst_2        
	//* 425  794:isub            
	//* 426  795:icmpgt          841
			{
				int l = j + 1;
	//  427  798:iload           5
	//  428  800:iconst_1        
	//  429  801:iadd            
	//  430  802:istore          6
				abyte0[j] = (byte)(c >>> 6 | 0x3c0);
	//  431  804:aload           11
	//  432  806:iload           5
	//  433  808:iload_2         
	//  434  809:bipush          6
	//  435  811:iushr           
	//  436  812:sipush          960
	//  437  815:ior             
	//  438  816:int2byte        
	//  439  817:bastore         
				j = l + 1;
	//  440  818:iload           6
	//  441  820:iconst_1        
	//  442  821:iadd            
	//  443  822:istore          5
				abyte0[l] = (byte)(c & 0x3f | 0x80);
	//  444  824:aload           11
	//  445  826:iload           6
	//  446  828:iload_2         
	//  447  829:bipush          63
	//  448  831:iand            
	//  449  832:sipush          128
	//  450  835:ior             
	//  451  836:int2byte        
	//  452  837:bastore         
				break; /* Loop/switch isn't completed */
	//  453  838:goto            928
			}
			if(c >= '\uD800' && '\uDFFF' >= c || j > k1 - 3)
				continue; /* Loop/switch isn't completed */
	//  454  841:iload_2         
	//  455  842:ldc1            #50  <Int 55296>
	//  456  844:icmplt          853
	//  457  847:ldc1            #51  <Int 57343>
	//  458  849:iload_2         
	//  459  850:icmpge          180
	//  460  853:iload           5
	//  461  855:iload           8
	//  462  857:iconst_3        
	//  463  858:isub            
	//  464  859:icmpgt          180
			int i1 = j + 1;
	//  465  862:iload           5
	//  466  864:iconst_1        
	//  467  865:iadd            
	//  468  866:istore          6
			abyte0[j] = (byte)(c >>> 12 | 0x1e0);
	//  469  868:aload           11
	//  470  870:iload           5
	//  471  872:iload_2         
	//  472  873:bipush          12
	//  473  875:iushr           
	//  474  876:sipush          480
	//  475  879:ior             
	//  476  880:int2byte        
	//  477  881:bastore         
			int i2 = i1 + 1;
	//  478  882:iload           6
	//  479  884:iconst_1        
	//  480  885:iadd            
	//  481  886:istore          9
			abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  482  888:aload           11
	//  483  890:iload           6
	//  484  892:iload_2         
	//  485  893:bipush          6
	//  486  895:iushr           
	//  487  896:bipush          63
	//  488  898:iand            
	//  489  899:sipush          128
	//  490  902:ior             
	//  491  903:int2byte        
	//  492  904:bastore         
			j = i2 + 1;
	//  493  905:iload           9
	//  494  907:iconst_1        
	//  495  908:iadd            
	//  496  909:istore          5
			abyte0[i2] = (byte)(c & 0x3f | 0x80);
	//  497  911:aload           11
	//  498  913:iload           9
	//  499  915:iload_2         
	//  500  916:bipush          63
	//  501  918:iand            
	//  502  919:sipush          128
	//  503  922:ior             
	//  504  923:int2byte        
	//  505  924:bastore         
		}
		  goto _L7
_L17:
		if(j > k1 - 4)
			break MISSING_BLOCK_LABEL_372;
		k = i + 1;
		if(k == charsequence.length())
			break MISSING_BLOCK_LABEL_334;
		c1 = charsequence.charAt(k);
		if(!Character.isSurrogatePair(c, c1))
		{
			i = k;
			break MISSING_BLOCK_LABEL_334;
		}
		i = Character.toCodePoint(c, c1);
		l1 = j + 1;
		abyte0[j] = (byte)(i >>> 18 | 0xf0);
		j = l1 + 1;
		abyte0[l1] = (byte)(i >>> 12 & 0x3f | 0x80);
		l1 = j + 1;
		abyte0[j] = (byte)(i >>> 6 & 0x3f | 0x80);
		j = l1 + 1;
		abyte0[l1] = (byte)(i & 0x3f | 0x80);
		i = k;
		break; /* Loop/switch isn't completed */
		charsequence = ((CharSequence) (new StringBuilder(39)));
		((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
		((StringBuilder) (charsequence)).append(i - 1);
		throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
		charsequence = ((CharSequence) (new StringBuilder(37)));
		((StringBuilder) (charsequence)).append("Failed writing ");
		((StringBuilder) (charsequence)).append(c);
		((StringBuilder) (charsequence)).append(" at index ");
		((StringBuilder) (charsequence)).append(j);
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
_L6:
		bytebuffer.position(k - bytebuffer.arrayOffset());
		return;
_L2:
		k = charsequence.length();
		i = j;
_L16:
		if(i >= k) goto _L9; else goto _L8
_L8:
		c = charsequence.charAt(i);
		if(c >= '\200') goto _L11; else goto _L10
_L10:
		j = ((int) (c));
_L13:
		bytebuffer.put((byte)j);
		continue; /* Loop/switch isn't completed */
_L11:
		if(c >= '\u0800')
			break; /* Loop/switch isn't completed */
		j = c >>> 6 | 0x3c0;
_L14:
		bytebuffer.put((byte)j);
		j = c & 0x3f | 0x80;
		if(true) goto _L13; else goto _L12
_L12:
		if(c >= '\uD800' && '\uDFFF' >= c)
		{
			j = i + 1;
			if(j != charsequence.length())
			{
				char c2 = charsequence.charAt(j);
				if(!Character.isSurrogatePair(c, c2))
				{
					i = j;
				} else
				{
					i = Character.toCodePoint(c, c2);
					bytebuffer.put((byte)(i >>> 18 | 0xf0));
					bytebuffer.put((byte)(i >>> 12 & 0x3f | 0x80));
					bytebuffer.put((byte)(i >>> 6 & 0x3f | 0x80));
					bytebuffer.put((byte)(i & 0x3f | 0x80));
					i = j;
					continue; /* Loop/switch isn't completed */
				}
			}
			charsequence = ((CharSequence) (new StringBuilder(39)));
			((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
			((StringBuilder) (charsequence)).append(i - 1);
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
		}
		bytebuffer.put((byte)(c >>> 12 | 0x1e0));
		j = c >>> 6 & 0x3f | 0x80;
		  goto _L14
		if(true) goto _L13; else goto _L15
_L15:
		i++;
		  goto _L16
_L9:
		return;
_L3:
		if(i == j1)
		{
			k = j + j1;
		} else
		{
			j += i;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L6
		if(true) goto _L17; else goto _L7
	//* 506  925:goto            779
_L7:
		i++;
	//  507  928:iload           4
	//  508  930:iconst_1        
	//  509  931:iadd            
	//  510  932:istore          4
		if(true) goto _L19; else goto _L18
	//  511  934:goto            126
_L18:
	}

	public static int zzgc(String s)
	{
		int i = zza(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #209 <Method int zza(CharSequence)>
	//    2    4:istore_1        
		return zzbl(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #102 <Method int zzbl(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int zzh(int i, int j)
	{
		return zzbd(i) + zzbe(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #94  <Method int zzbd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #213 <Method int zzbe(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzya zzk(byte abyte0[], int i, int j)
	{
		return new zzya(abyte0, 0, j);
	//    0    0:new             #2   <Class zzya>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #217 <Method void zzya(byte[], int, int)>
	//    6   10:areturn         
	}

	public static zzya zzo(byte abyte0[])
	{
		return zzk(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #221 <Method zzya zzk(byte[], int, int)>
	//    5    7:areturn         
	}

	private final zztv zzyz()
	{
		if(zzcet != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field zztv zzcet>
	//    2    4:ifnonnull       32
_L1:
		zzcet = zztv.zza(zzbut);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ByteBuffer zzbut>
	//    6   12:invokestatic    #230 <Method zztv zztv.zza(ByteBuffer)>
	//    7   15:putfield        #225 <Field zztv zzcet>
_L4:
		zzceu = zzbut.position();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field ByteBuffer zzbut>
	//   11   23:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   12   26:putfield        #232 <Field int zzceu>
		break; /* Loop/switch isn't completed */
	//   13   29:goto            79
_L2:
		if(zzceu == zzbut.position())
			break; /* Loop/switch isn't completed */
	//   14   32:aload_0         
	//   15   33:getfield        #232 <Field int zzceu>
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field ByteBuffer zzbut>
	//   18   40:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   19   43:icmpeq          79
		zzcet.write(zzbut.array(), zzceu, zzbut.position() - zzceu);
	//   20   46:aload_0         
	//   21   47:getfield        #225 <Field zztv zzcet>
	//   22   50:aload_0         
	//   23   51:getfield        #17  <Field ByteBuffer zzbut>
	//   24   54:invokevirtual   #175 <Method byte[] ByteBuffer.array()>
	//   25   57:aload_0         
	//   26   58:getfield        #232 <Field int zzceu>
	//   27   61:aload_0         
	//   28   62:getfield        #17  <Field ByteBuffer zzbut>
	//   29   65:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   30   68:aload_0         
	//   31   69:getfield        #232 <Field int zzceu>
	//   32   72:isub            
	//   33   73:invokevirtual   #235 <Method void zztv.write(byte[], int, int)>
		if(true) goto _L4; else goto _L3
	//   34   76:goto            18
_L3:
		return zzcet;
	//   35   79:aload_0         
	//   36   80:getfield        #225 <Field zztv zzcet>
	//   37   83:areturn         
	}

	public final void zza(int i, double d)
	{
		zzc(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		long l = Double.doubleToLongBits(d);
	//    4    6:dload_2         
	//    5    7:invokestatic    #244 <Method long Double.doubleToLongBits(double)>
	//    6   10:lstore          4
		if(zzbut.remaining() < 8)
	//*   7   12:aload_0         
	//*   8   13:getfield        #17  <Field ByteBuffer zzbut>
	//*   9   16:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//*  10   19:bipush          8
	//*  11   21:icmpge          46
		{
			throw new zzyb(zzbut.position(), zzbut.limit());
	//   12   24:new             #142 <Class zzyb>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field ByteBuffer zzbut>
	//   16   32:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field ByteBuffer zzbut>
	//   19   39:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   20   42:invokespecial   #151 <Method void zzyb(int, int)>
	//   21   45:athrow          
		} else
		{
			zzbut.putLong(l);
	//   22   46:aload_0         
	//   23   47:getfield        #17  <Field ByteBuffer zzbut>
	//   24   50:lload           4
	//   25   52:invokevirtual   #248 <Method ByteBuffer ByteBuffer.putLong(long)>
	//   26   55:pop             
			return;
	//   27   56:return          
		}
	}

	public final void zza(int i, float f)
	{
		zzc(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		i = Float.floatToIntBits(f);
	//    4    6:fload_2         
	//    5    7:invokestatic    #255 <Method int Float.floatToIntBits(float)>
	//    6   10:istore_1        
		if(zzbut.remaining() < 4)
	//*   7   11:aload_0         
	//*   8   12:getfield        #17  <Field ByteBuffer zzbut>
	//*   9   15:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//*  10   18:iconst_4        
	//*  11   19:icmpge          44
		{
			throw new zzyb(zzbut.position(), zzbut.limit());
	//   12   22:new             #142 <Class zzyb>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #17  <Field ByteBuffer zzbut>
	//   16   30:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   17   33:aload_0         
	//   18   34:getfield        #17  <Field ByteBuffer zzbut>
	//   19   37:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   20   40:invokespecial   #151 <Method void zzyb(int, int)>
	//   21   43:athrow          
		} else
		{
			zzbut.putInt(i);
	//   22   44:aload_0         
	//   23   45:getfield        #17  <Field ByteBuffer zzbut>
	//   24   48:iload_1         
	//   25   49:invokevirtual   #259 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   26   52:pop             
			return;
	//   27   53:return          
		}
	}

	public final void zza(int i, long l)
	{
		zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		zzbf(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokespecial   #262 <Method void zzbf(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzyi zzyi1)
	{
		zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		zzb(zzyi1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #266 <Method void zzb(zzyi)>
	//    7   11:return          
	}

	public final void zzb(int i, String s)
	{
		zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		try
		{
			i = zzbl(s.length());
	//    4    6:aload_2         
	//    5    7:invokevirtual   #270 <Method int String.length()>
	//    6   10:invokestatic    #102 <Method int zzbl(int)>
	//    7   13:istore_1        
			if(i == zzbl(s.length() * 3))
	//*   8   14:iload_1         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #270 <Method int String.length()>
	//*  11   19:iconst_3        
	//*  12   20:imul            
	//*  13   21:invokestatic    #102 <Method int zzbl(int)>
	//*  14   24:icmpne          122
			{
				int j = zzbut.position();
	//   15   27:aload_0         
	//   16   28:getfield        #17  <Field ByteBuffer zzbut>
	//   17   31:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   18   34:istore_3        
				if(zzbut.remaining() < i)
	//*  19   35:aload_0         
	//*  20   36:getfield        #17  <Field ByteBuffer zzbut>
	//*  21   39:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//*  22   42:iload_1         
	//*  23   43:icmpge          64
				{
					throw new zzyb(j + i, zzbut.limit());
	//   24   46:new             #142 <Class zzyb>
	//   25   49:dup             
	//   26   50:iload_3         
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:getfield        #17  <Field ByteBuffer zzbut>
	//   31   57:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   32   60:invokespecial   #151 <Method void zzyb(int, int)>
	//   33   63:athrow          
				} else
				{
					zzbut.position(j + i);
	//   34   64:aload_0         
	//   35   65:getfield        #17  <Field ByteBuffer zzbut>
	//   36   68:iload_3         
	//   37   69:iload_1         
	//   38   70:iadd            
	//   39   71:invokevirtual   #200 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   40   74:pop             
					zzd(((CharSequence) (s)), zzbut);
	//   41   75:aload_2         
	//   42   76:aload_0         
	//   43   77:getfield        #17  <Field ByteBuffer zzbut>
	//   44   80:invokestatic    #272 <Method void zzd(CharSequence, ByteBuffer)>
					int k = zzbut.position();
	//   45   83:aload_0         
	//   46   84:getfield        #17  <Field ByteBuffer zzbut>
	//   47   87:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   48   90:istore          4
					zzbut.position(j);
	//   49   92:aload_0         
	//   50   93:getfield        #17  <Field ByteBuffer zzbut>
	//   51   96:iload_3         
	//   52   97:invokevirtual   #200 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   53  100:pop             
					zzcd(k - j - i);
	//   54  101:aload_0         
	//   55  102:iload           4
	//   56  104:iload_3         
	//   57  105:isub            
	//   58  106:iload_1         
	//   59  107:isub            
	//   60  108:invokevirtual   #275 <Method void zzcd(int)>
					zzbut.position(k);
	//   61  111:aload_0         
	//   62  112:getfield        #17  <Field ByteBuffer zzbut>
	//   63  115:iload           4
	//   64  117:invokevirtual   #200 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   65  120:pop             
					return;
	//   66  121:return          
				}
			}
		}
	//*  67  122:aload_0         
	//*  68  123:aload_2         
	//*  69  124:invokestatic    #209 <Method int zza(CharSequence)>
	//*  70  127:invokevirtual   #275 <Method void zzcd(int)>
	//*  71  130:aload_2         
	//*  72  131:aload_0         
	//*  73  132:getfield        #17  <Field ByteBuffer zzbut>
	//*  74  135:invokestatic    #272 <Method void zzd(CharSequence, ByteBuffer)>
	//*  75  138:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  76  139:astore_2        
		{
			zzyb zzyb1 = new zzyb(zzbut.position(), zzbut.limit());
	//   77  140:new             #142 <Class zzyb>
	//   78  143:dup             
	//   79  144:aload_0         
	//   80  145:getfield        #17  <Field ByteBuffer zzbut>
	//   81  148:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   82  151:aload_0         
	//   83  152:getfield        #17  <Field ByteBuffer zzbut>
	//   84  155:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   85  158:invokespecial   #151 <Method void zzyb(int, int)>
	//   86  161:astore          5
			zzyb1.initCause(((Throwable) (s)));
	//   87  163:aload           5
	//   88  165:aload_2         
	//   89  166:invokevirtual   #276 <Method Throwable zzyb.initCause(Throwable)>
	//   90  169:pop             
			throw zzyb1;
	//   91  170:aload           5
	//   92  172:athrow          
		}
		zzcd(zza(((CharSequence) (s))));
		zzd(((CharSequence) (s)), zzbut);
		return;
	}

	public final void zzb(int i, boolean flag)
	{
		zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		byte byte0 = (byte)flag;
	//    4    6:iload_2         
	//    5    7:int2byte        
	//    6    8:istore_3        
		if(!zzbut.hasRemaining())
	//*   7    9:aload_0         
	//*   8   10:getfield        #17  <Field ByteBuffer zzbut>
	//*   9   13:invokevirtual   #140 <Method boolean ByteBuffer.hasRemaining()>
	//*  10   16:ifne            41
		{
			throw new zzyb(zzbut.position(), zzbut.limit());
	//   11   19:new             #142 <Class zzyb>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field ByteBuffer zzbut>
	//   15   27:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field ByteBuffer zzbut>
	//   18   34:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   19   37:invokespecial   #151 <Method void zzyb(int, int)>
	//   20   40:athrow          
		} else
		{
			zzbut.put(byte0);
	//   21   41:aload_0         
	//   22   42:getfield        #17  <Field ByteBuffer zzbut>
	//   23   45:iload_3         
	//   24   46:invokevirtual   #155 <Method ByteBuffer ByteBuffer.put(byte)>
	//   25   49:pop             
			return;
	//   26   50:return          
		}
	}

	public final void zzb(zzyi zzyi1)
	{
		zzcd(zzyi1.zzzh());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #280 <Method int zzyi.zzzh()>
	//    3    5:invokevirtual   #275 <Method void zzcd(int)>
		zzyi1.zza(this);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #283 <Method void zzyi.zza(zzya)>
	//    7   13:return          
	}

	public final void zzc(int i, int j)
	{
		zzcd(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #275 <Method void zzcd(int)>
	//    7    9:return          
	}

	public final void zzcd(int i)
	{
		do
		{
			if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            13
			{
				zzcc(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #110 <Method void zzcc(int)>
				return;
	//    7   12:return          
			}
			zzcc(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokespecial   #110 <Method void zzcc(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public final void zzd(int i, int j)
	{
		zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		if(j >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
		{
			zzcd(j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #275 <Method void zzcd(int)>
			return;
	//    9   15:return          
		} else
		{
			zzbf(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:i2l             
	//   13   19:invokespecial   #262 <Method void zzbf(long)>
			return;
	//   14   22:return          
		}
	}

	public final void zze(int i, zzvv zzvv)
	{
		zztv zztv1 = zzyz();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method zztv zzyz()>
	//    2    4:astore_3        
		zztv1.zza(i, zzvv);
	//    3    5:aload_3         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #289 <Method void zztv.zza(int, zzvv)>
		zztv1.flush();
	//    7   11:aload_3         
	//    8   12:invokevirtual   #292 <Method void zztv.flush()>
		zzceu = zzbut.position();
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field ByteBuffer zzbut>
	//   12   20:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   13   23:putfield        #232 <Field int zzceu>
	//   14   26:return          
	}

	public final void zzi(int i, long l)
	{
		zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #238 <Method void zzc(int, int)>
		zzbf(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokespecial   #262 <Method void zzbf(long)>
	//    7   11:return          
	}

	public final void zzp(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		if(zzbut.remaining() >= i)
	//*   3    3:aload_0         
	//*   4    4:getfield        #17  <Field ByteBuffer zzbut>
	//*   5    7:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//*   6   10:iload_2         
	//*   7   11:icmplt          26
		{
			zzbut.put(abyte0, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field ByteBuffer zzbut>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:iload_2         
	//   13   21:invokevirtual   #297 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   14   24:pop             
			return;
	//   15   25:return          
		} else
		{
			throw new zzyb(zzbut.position(), zzbut.limit());
	//   16   26:new             #142 <Class zzyb>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #17  <Field ByteBuffer zzbut>
	//   20   34:invokevirtual   #145 <Method int ByteBuffer.position()>
	//   21   37:aload_0         
	//   22   38:getfield        #17  <Field ByteBuffer zzbut>
	//   23   41:invokevirtual   #148 <Method int ByteBuffer.limit()>
	//   24   44:invokespecial   #151 <Method void zzyb(int, int)>
	//   25   47:athrow          
		}
	}

	public final void zzza()
	{
		if(zzbut.remaining() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ByteBuffer zzbut>
	//*   2    4:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//*   3    7:ifeq            41
			throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] {
				Integer.valueOf(zzbut.remaining())
			}));
	//    4   10:new             #300 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #302 <String "Did not write as much data as expected, %s bytes remaining.">
	//    7   17:iconst_1        
	//    8   18:anewarray       Object[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field ByteBuffer zzbut>
	//   13   27:invokevirtual   #181 <Method int ByteBuffer.remaining()>
	//   14   30:invokestatic    #308 <Method Integer Integer.valueOf(int)>
	//   15   33:aastore         
	//   16   34:invokestatic    #312 <Method String String.format(String, Object[])>
	//   17   37:invokespecial   #313 <Method void IllegalStateException(String)>
	//   18   40:athrow          
		else
			return;
	//   19   41:return          
	}

	private final ByteBuffer zzbut;
	private zztv zzcet;
	private int zzceu;
}
