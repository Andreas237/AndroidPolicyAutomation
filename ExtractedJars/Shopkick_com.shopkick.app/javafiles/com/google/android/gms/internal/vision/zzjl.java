// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjt, zzjm, zzfe, zzhf

public final class zzjl
{

	private zzjl(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzsw = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ByteBuffer zzsw>
		zzsw.order(ByteOrder.LITTLE_ENDIAN);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field ByteBuffer zzsw>
	//    7   13:getstatic       #23  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    8   16:invokevirtual   #29  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    9   19:pop             
	//   10   20:return          
	}

	private zzjl(byte abyte0[], int i, int j)
	{
		this(ByteBuffer.wrap(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #35  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    5    7:invokespecial   #37  <Method void zzjl(ByteBuffer)>
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
	//   26   47:icmpge          232
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
	//*  54   96:icmpge          228
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
	//   72  130:goto            220
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
	//   83  148:icmpgt          220
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
	//   90  161:icmpgt          220
				if(Character.codePointAt(charsequence, j) >= 0x10000)
	//*  91  164:aload_0         
	//*  92  165:iload_2         
	//*  93  166:invokestatic    #57  <Method int Character.codePointAt(CharSequence, int)>
	//*  94  169:ldc1            #58  <Int 0x10000>
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
	//* 102  182:goto            220
				{
					charsequence = ((CharSequence) (new StringBuilder(39)));
	//  103  185:new             #60  <Class StringBuilder>
	//  104  188:dup             
	//  105  189:bipush          39
	//  106  191:invokespecial   #63  <Method void StringBuilder(int)>
	//  107  194:astore_0        
					((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
	//  108  195:aload_0         
	//  109  196:ldc1            #65  <String "Unpaired surrogate at index ">
	//  110  198:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  111  201:pop             
					((StringBuilder) (charsequence)).append(j);
	//  112  202:aload_0         
	//  113  203:iload_2         
	//  114  204:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//  115  207:pop             
					throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  116  208:new             #74  <Class IllegalArgumentException>
	//  117  211:dup             
	//  118  212:aload_0         
	//  119  213:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  120  216:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//  121  219:athrow          
				}
			}

	//  122  220:iload           4
	//  123  222:iconst_1        
	//  124  223:iadd            
	//  125  224:istore_2        
	//* 126  225:goto            93
			k = i + k;
	//  127  228:iload_1         
	//  128  229:iload_3         
	//  129  230:iadd            
	//  130  231:istore_3        
		}
		if(k >= i1)
	//* 131  232:iload_3         
	//* 132  233:iload           5
	//* 133  235:icmplt          240
		{
			return k;
	//  134  238:iload_3         
	//  135  239:ireturn         
		} else
		{
			long l1 = k;
	//  136  240:iload_3         
	//  137  241:i2l             
	//  138  242:lstore          9
			charsequence = ((CharSequence) (new StringBuilder(54)));
	//  139  244:new             #60  <Class StringBuilder>
	//  140  247:dup             
	//  141  248:bipush          54
	//  142  250:invokespecial   #63  <Method void StringBuilder(int)>
	//  143  253:astore_0        
			((StringBuilder) (charsequence)).append("UTF-8 length does not fit in int: ");
	//  144  254:aload_0         
	//  145  255:ldc1            #83  <String "UTF-8 length does not fit in int: ">
	//  146  257:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  147  260:pop             
			((StringBuilder) (charsequence)).append(l1 + 0x0L);
	//  148  261:aload_0         
	//  149  262:lload           9
	//  150  264:ldc2w           #84  <Long 0x0L>
	//  151  267:ladd            
	//  152  268:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
	//  153  271:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  154  272:new             #74  <Class IllegalArgumentException>
	//  155  275:dup             
	//  156  276:aload_0         
	//  157  277:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  158  280:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//  159  283:athrow          
		}
	}

	public static int zzav(int i)
	{
		return zzbd(i << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #93  <Method int zzbd(int)>
	//    4    6:ireturn         
	}

	public static int zzaw(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzbd(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #93  <Method int zzbd(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzb(int i, zzjt zzjt1)
	{
		i = zzav(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method int zzav(int)>
	//    2    4:istore_0        
		int j = zzjt1.zzeq();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #103 <Method int zzjt.zzeq()>
	//    5    9:istore_2        
		return i + (zzbd(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #93  <Method int zzbd(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzb(int i, String s)
	{
		return zzav(i) + zzn(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method int zzav(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #108 <Method int zzn(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzbd(int i)
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
	//*  12   19:ldc1            #109 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #110 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	private final void zzbu(int i)
		throws IOException
	{
		byte byte0 = (byte)i;
	//    0    0:iload_1         
	//    1    1:int2byte        
	//    2    2:istore_2        
		if(zzsw.hasRemaining())
	//*   3    3:aload_0         
	//*   4    4:getfield        #17  <Field ByteBuffer zzsw>
	//*   5    7:invokevirtual   #117 <Method boolean ByteBuffer.hasRemaining()>
	//*   6   10:ifeq            23
		{
			zzsw.put(byte0);
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field ByteBuffer zzsw>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			throw new zzjm(zzsw.position(), zzsw.limit());
	//   13   23:new             #123 <Class zzjm>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #17  <Field ByteBuffer zzsw>
	//   17   31:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   18   34:aload_0         
	//   19   35:getfield        #17  <Field ByteBuffer zzsw>
	//   20   38:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   21   41:invokespecial   #132 <Method void zzjm(int, int)>
	//   22   44:athrow          
		}
	}

	public static int zzd(int i, long l)
	{
		int j = zzav(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method int zzav(int)>
	//    2    4:istore_3        
		if((-128L & l) == 0L)
	//*   3    5:ldc2w           #136 <Long -128L>
	//*   4    8:lload_1         
	//*   5    9:land            
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            20
			i = 1;
	//    9   15:iconst_1        
	//   10   16:istore_0        
		else
	//*  11   17:goto            147
		if((-16384L & l) == 0L)
	//*  12   20:ldc2w           #138 <Long -16384L>
	//*  13   23:lload_1         
	//*  14   24:land            
	//*  15   25:lconst_0        
	//*  16   26:lcmp            
	//*  17   27:ifne            35
			i = 2;
	//   18   30:iconst_2        
	//   19   31:istore_0        
		else
	//*  20   32:goto            147
		if((0xffe00000L & l) == 0L)
	//*  21   35:ldc2w           #140 <Long 0xffe00000L>
	//*  22   38:lload_1         
	//*  23   39:land            
	//*  24   40:lconst_0        
	//*  25   41:lcmp            
	//*  26   42:ifne            50
			i = 3;
	//   27   45:iconst_3        
	//   28   46:istore_0        
		else
	//*  29   47:goto            147
		if((0xf0000000L & l) == 0L)
	//*  30   50:ldc2w           #142 <Long 0xf0000000L>
	//*  31   53:lload_1         
	//*  32   54:land            
	//*  33   55:lconst_0        
	//*  34   56:lcmp            
	//*  35   57:ifne            65
			i = 4;
	//   36   60:iconst_4        
	//   37   61:istore_0        
		else
	//*  38   62:goto            147
		if((0x0L & l) == 0L)
	//*  39   65:ldc2w           #144 <Long 0x0L>
	//*  40   68:lload_1         
	//*  41   69:land            
	//*  42   70:lconst_0        
	//*  43   71:lcmp            
	//*  44   72:ifne            80
			i = 5;
	//   45   75:iconst_5        
	//   46   76:istore_0        
		else
	//*  47   77:goto            147
		if((0x0L & l) == 0L)
	//*  48   80:ldc2w           #146 <Long 0x0L>
	//*  49   83:lload_1         
	//*  50   84:land            
	//*  51   85:lconst_0        
	//*  52   86:lcmp            
	//*  53   87:ifne            96
			i = 6;
	//   54   90:bipush          6
	//   55   92:istore_0        
		else
	//*  56   93:goto            147
		if((0x0L & l) == 0L)
	//*  57   96:ldc2w           #148 <Long 0x0L>
	//*  58   99:lload_1         
	//*  59  100:land            
	//*  60  101:lconst_0        
	//*  61  102:lcmp            
	//*  62  103:ifne            112
			i = 7;
	//   63  106:bipush          7
	//   64  108:istore_0        
		else
	//*  65  109:goto            147
		if((0x0L & l) == 0L)
	//*  66  112:ldc2w           #150 <Long 0x0L>
	//*  67  115:lload_1         
	//*  68  116:land            
	//*  69  117:lconst_0        
	//*  70  118:lcmp            
	//*  71  119:ifne            128
			i = 8;
	//   72  122:bipush          8
	//   73  124:istore_0        
		else
	//*  74  125:goto            147
		if((l & 0x0L) == 0L)
	//*  75  128:lload_1         
	//*  76  129:ldc2w           #152 <Long 0x0L>
	//*  77  132:land            
	//*  78  133:lconst_0        
	//*  79  134:lcmp            
	//*  80  135:ifne            144
			i = 9;
	//   81  138:bipush          9
	//   82  140:istore_0        
		else
	//*  83  141:goto            147
			i = 10;
	//   84  144:bipush          10
	//   85  146:istore_0        
		return j + i;
	//   86  147:iload_3         
	//   87  148:iload_0         
	//   88  149:iadd            
	//   89  150:ireturn         
	}

	private final void zzd(int i, int j)
		throws IOException
	{
		zzbv(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #156 <Method void zzbv(int)>
	//    7    9:return          
	}

	private static void zzd(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		if(bytebuffer.isReadOnly()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #162 <Method boolean ByteBuffer.isReadOnly()>
	//    2    4:ifne            737
_L1:
		int i;
		int j;
		boolean flag;
		flag = bytebuffer.hasArray();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #165 <Method boolean ByteBuffer.hasArray()>
	//    5   11:istore          10
		i = 0;
	//    6   13:iconst_0        
	//    7   14:istore          4
		j = 0;
	//    8   16:iconst_0        
	//    9   17:istore          5
		if(!flag) goto _L4; else goto _L3
	//   10   19:iload           10
	//   11   21:ifeq            432
_L3:
		char c;
		int k;
		int l;
		int i1;
		byte abyte0[];
		char c1;
		int j1;
		try
		{
			abyte0 = bytebuffer.array();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #169 <Method byte[] ByteBuffer.array()>
	//   14   28:astore          11
			i = bytebuffer.arrayOffset() + bytebuffer.position();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #172 <Method int ByteBuffer.arrayOffset()>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   19   38:iadd            
	//   20   39:istore          4
			k = bytebuffer.remaining();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//   23   45:istore          6
			l = charsequence.length();
	//   24   47:aload_0         
	//   25   48:invokeinterface #45  <Method int CharSequence.length()>
	//   26   53:istore          7
		}
	//*  27   55:iload           6
	//*  28   57:iload           4
	//*  29   59:iadd            
	//*  30   60:istore          8
	//*  31   62:iload           5
	//*  32   64:iload           7
	//*  33   66:icmpge          745
	//*  34   69:iload           5
	//*  35   71:iload           4
	//*  36   73:iadd            
	//*  37   74:istore          6
	//*  38   76:iload           6
	//*  39   78:iload           8
	//*  40   80:icmpge          745
	//*  41   83:aload_0         
	//*  42   84:iload           5
	//*  43   86:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//*  44   91:istore          9
	//*  45   93:iload           9
	//*  46   95:sipush          128
	//*  47   98:icmpge          745
	//*  48  101:aload           11
	//*  49  103:iload           6
	//*  50  105:iload           9
	//*  51  107:int2byte        
	//*  52  108:bastore         
	//*  53  109:iload           5
	//*  54  111:iconst_1        
	//*  55  112:iadd            
	//*  56  113:istore          5
	//*  57  115:goto            62
	//*  58  118:iload           4
	//*  59  120:istore          6
	//*  60  122:iload           5
	//*  61  124:iload           7
	//*  62  126:icmpge          402
	//*  63  129:aload_0         
	//*  64  130:iload           5
	//*  65  132:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//*  66  137:istore_2        
	//*  67  138:iload_2         
	//*  68  139:sipush          128
	//*  69  142:icmpge          772
	//*  70  145:iload           4
	//*  71  147:iload           8
	//*  72  149:icmpge          772
	//*  73  152:aload           11
	//*  74  154:iload           4
	//*  75  156:iload_2         
	//*  76  157:int2byte        
	//*  77  158:bastore         
	//*  78  159:iload           4
	//*  79  161:iconst_1        
	//*  80  162:iadd            
	//*  81  163:istore          4
	//*  82  165:goto            915
	//*  83  168:iload           4
	//*  84  170:iload           8
	//*  85  172:iconst_4        
	//*  86  173:isub            
	//*  87  174:icmpgt          353
	//*  88  177:iload           5
	//*  89  179:iconst_1        
	//*  90  180:iadd            
	//*  91  181:istore          6
	//*  92  183:iload           6
	//*  93  185:aload_0         
	//*  94  186:invokeinterface #45  <Method int CharSequence.length()>
	//*  95  191:icmpeq          315
	//*  96  194:aload_0         
	//*  97  195:iload           6
	//*  98  197:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//*  99  202:istore_3        
	//* 100  203:iload_2         
	//* 101  204:iload_3         
	//* 102  205:invokestatic    #179 <Method boolean Character.isSurrogatePair(char, char)>
	//* 103  208:ifeq            924
	//* 104  211:iload_2         
	//* 105  212:iload_3         
	//* 106  213:invokestatic    #183 <Method int Character.toCodePoint(char, char)>
	//* 107  216:istore          5
	//* 108  218:iload           4
	//* 109  220:iconst_1        
	//* 110  221:iadd            
	//* 111  222:istore          9
	//* 112  224:aload           11
	//* 113  226:iload           4
	//* 114  228:iload           5
	//* 115  230:bipush          18
	//* 116  232:iushr           
	//* 117  233:sipush          240
	//* 118  236:ior             
	//* 119  237:int2byte        
	//* 120  238:bastore         
	//* 121  239:iload           9
	//* 122  241:iconst_1        
	//* 123  242:iadd            
	//* 124  243:istore          4
	//* 125  245:aload           11
	//* 126  247:iload           9
	//* 127  249:iload           5
	//* 128  251:bipush          12
	//* 129  253:iushr           
	//* 130  254:bipush          63
	//* 131  256:iand            
	//* 132  257:sipush          128
	//* 133  260:ior             
	//* 134  261:int2byte        
	//* 135  262:bastore         
	//* 136  263:iload           4
	//* 137  265:iconst_1        
	//* 138  266:iadd            
	//* 139  267:istore          9
	//* 140  269:aload           11
	//* 141  271:iload           4
	//* 142  273:iload           5
	//* 143  275:bipush          6
	//* 144  277:iushr           
	//* 145  278:bipush          63
	//* 146  280:iand            
	//* 147  281:sipush          128
	//* 148  284:ior             
	//* 149  285:int2byte        
	//* 150  286:bastore         
	//* 151  287:iload           9
	//* 152  289:iconst_1        
	//* 153  290:iadd            
	//* 154  291:istore          4
	//* 155  293:aload           11
	//* 156  295:iload           9
	//* 157  297:iload           5
	//* 158  299:bipush          63
	//* 159  301:iand            
	//* 160  302:sipush          128
	//* 161  305:ior             
	//* 162  306:int2byte        
	//* 163  307:bastore         
	//* 164  308:iload           6
	//* 165  310:istore          5
	//* 166  312:goto            915
	//* 167  315:new             #60  <Class StringBuilder>
	//* 168  318:dup             
	//* 169  319:bipush          39
	//* 170  321:invokespecial   #63  <Method void StringBuilder(int)>
	//* 171  324:astore_0        
	//* 172  325:aload_0         
	//* 173  326:ldc1            #65  <String "Unpaired surrogate at index ">
	//* 174  328:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 175  331:pop             
	//* 176  332:aload_0         
	//* 177  333:iload           5
	//* 178  335:iconst_1        
	//* 179  336:isub            
	//* 180  337:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//* 181  340:pop             
	//* 182  341:new             #74  <Class IllegalArgumentException>
	//* 183  344:dup             
	//* 184  345:aload_0         
	//* 185  346:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 186  349:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//* 187  352:athrow          
	//* 188  353:new             #60  <Class StringBuilder>
	//* 189  356:dup             
	//* 190  357:bipush          37
	//* 191  359:invokespecial   #63  <Method void StringBuilder(int)>
	//* 192  362:astore_0        
	//* 193  363:aload_0         
	//* 194  364:ldc1            #185 <String "Failed writing ">
	//* 195  366:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 196  369:pop             
	//* 197  370:aload_0         
	//* 198  371:iload_2         
	//* 199  372:invokevirtual   #188 <Method StringBuilder StringBuilder.append(char)>
	//* 200  375:pop             
	//* 201  376:aload_0         
	//* 202  377:ldc1            #190 <String " at index ">
	//* 203  379:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//* 204  382:pop             
	//* 205  383:aload_0         
	//* 206  384:iload           4
	//* 207  386:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//* 208  389:pop             
	//* 209  390:new             #159 <Class ArrayIndexOutOfBoundsException>
	//* 210  393:dup             
	//* 211  394:aload_0         
	//* 212  395:invokevirtual   #78  <Method String StringBuilder.toString()>
	//* 213  398:invokespecial   #191 <Method void ArrayIndexOutOfBoundsException(String)>
	//* 214  401:athrow          
	//* 215  402:aload_1         
	//* 216  403:iload           6
	//* 217  405:aload_1         
	//* 218  406:invokevirtual   #172 <Method int ByteBuffer.arrayOffset()>
	//* 219  409:isub            
	//* 220  410:invokevirtual   #194 <Method java.nio.Buffer ByteBuffer.position(int)>
	//* 221  413:pop             
	//* 222  414:return          
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//* 223  415:astore_0        
		{
			bytebuffer = ((ByteBuffer) (new BufferOverflowException()));
	//  224  416:new             #196 <Class BufferOverflowException>
	//  225  419:dup             
	//  226  420:invokespecial   #197 <Method void BufferOverflowException()>
	//  227  423:astore_1        
			((BufferOverflowException) (bytebuffer)).initCause(((Throwable) (charsequence)));
	//  228  424:aload_1         
	//  229  425:aload_0         
	//  230  426:invokevirtual   #201 <Method Throwable BufferOverflowException.initCause(Throwable)>
	//  231  429:pop             
			throw bytebuffer;
	//  232  430:aload_1         
	//  233  431:athrow          
		}
		i1 = k + i;
		if(j >= l)
			break; /* Loop/switch isn't completed */
		k = j + i;
		if(k >= i1)
			break; /* Loop/switch isn't completed */
		j1 = ((int) (charsequence.charAt(j)));
		if(j1 >= '\200')
			break; /* Loop/switch isn't completed */
		abyte0[k] = (byte)j1;
		j++;
		if(true) goto _L6; else goto _L5
_L6:
		break MISSING_BLOCK_LABEL_62;
_L16:
		k = i;
		if(j >= l) goto _L8; else goto _L7
_L7:
		c = charsequence.charAt(j);
		if(c >= '\200' || i >= i1) goto _L10; else goto _L9
_L9:
		abyte0[i] = (byte)c;
		i++;
		  goto _L11
_L20:
		if(i > i1 - 4) goto _L13; else goto _L12
_L12:
		k = j + 1;
		if(k == charsequence.length()) goto _L15; else goto _L14
_L14:
		c1 = charsequence.charAt(k);
		if(!Character.isSurrogatePair(c, c1))
			break MISSING_BLOCK_LABEL_924;
		j = Character.toCodePoint(c, c1);
		j1 = i + 1;
		abyte0[i] = (byte)(j >>> 18 | 0xf0);
		i = j1 + 1;
		abyte0[j1] = (byte)(j >>> 12 & 0x3f | 0x80);
		j1 = i + 1;
		abyte0[i] = (byte)(j >>> 6 & 0x3f | 0x80);
		i = j1 + 1;
		abyte0[j1] = (byte)(j & 0x3f | 0x80);
		j = k;
		  goto _L11
_L15:
		charsequence = ((CharSequence) (new StringBuilder(39)));
		((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
		((StringBuilder) (charsequence)).append(j - 1);
		throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
_L13:
		charsequence = ((CharSequence) (new StringBuilder(37)));
		((StringBuilder) (charsequence)).append("Failed writing ");
		((StringBuilder) (charsequence)).append(c);
		((StringBuilder) (charsequence)).append(" at index ");
		((StringBuilder) (charsequence)).append(i);
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
_L8:
		bytebuffer.position(k - bytebuffer.arrayOffset());
		return;
_L4:
		for(k = charsequence.length(); i < k; i++)
	//* 234  432:aload_0         
	//* 235  433:invokeinterface #45  <Method int CharSequence.length()>
	//* 236  438:istore          6
	//* 237  440:iload           4
	//* 238  442:iload           6
	//* 239  444:icmpge          736
		{
			c = charsequence.charAt(i);
	//  240  447:aload_0         
	//  241  448:iload           4
	//  242  450:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//  243  455:istore_2        
			if(c < '\200')
	//* 244  456:iload_2         
	//* 245  457:sipush          128
	//* 246  460:icmpge          473
			{
				bytebuffer.put((byte)c);
	//  247  463:aload_1         
	//  248  464:iload_2         
	//  249  465:int2byte        
	//  250  466:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  251  469:pop             
				continue;
	//  252  470:goto            727
			}
			if(c < '\u0800')
	//* 253  473:iload_2         
	//* 254  474:sipush          2048
	//* 255  477:icmpge          511
			{
				bytebuffer.put((byte)(c >>> 6 | 0x3c0));
	//  256  480:aload_1         
	//  257  481:iload_2         
	//  258  482:bipush          6
	//  259  484:iushr           
	//  260  485:sipush          960
	//  261  488:ior             
	//  262  489:int2byte        
	//  263  490:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  264  493:pop             
				bytebuffer.put((byte)(c & 0x3f | 0x80));
	//  265  494:aload_1         
	//  266  495:iload_2         
	//  267  496:bipush          63
	//  268  498:iand            
	//  269  499:sipush          128
	//  270  502:ior             
	//  271  503:int2byte        
	//  272  504:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  273  507:pop             
				continue;
	//  274  508:goto            727
			}
			if(c >= '\uD800' && '\uDFFF' >= c)
	//* 275  511:iload_2         
	//* 276  512:ldc1            #50  <Int 55296>
	//* 277  514:icmplt          682
	//* 278  517:ldc1            #51  <Int 57343>
	//* 279  519:iload_2         
	//* 280  520:icmpge          526
	//* 281  523:goto            682
			{
				j = i + 1;
	//  282  526:iload           4
	//  283  528:iconst_1        
	//  284  529:iadd            
	//  285  530:istore          5
				if(j != charsequence.length())
	//* 286  532:iload           5
	//* 287  534:aload_0         
	//* 288  535:invokeinterface #45  <Method int CharSequence.length()>
	//* 289  540:icmpeq          644
				{
					char c2 = charsequence.charAt(j);
	//  290  543:aload_0         
	//  291  544:iload           5
	//  292  546:invokeinterface #49  <Method char CharSequence.charAt(int)>
	//  293  551:istore_3        
					if(Character.isSurrogatePair(c, c2))
	//* 294  552:iload_2         
	//* 295  553:iload_3         
	//* 296  554:invokestatic    #179 <Method boolean Character.isSurrogatePair(char, char)>
	//* 297  557:ifeq            640
					{
						i = Character.toCodePoint(c, c2);
	//  298  560:iload_2         
	//  299  561:iload_3         
	//  300  562:invokestatic    #183 <Method int Character.toCodePoint(char, char)>
	//  301  565:istore          4
						bytebuffer.put((byte)(i >>> 18 | 0xf0));
	//  302  567:aload_1         
	//  303  568:iload           4
	//  304  570:bipush          18
	//  305  572:iushr           
	//  306  573:sipush          240
	//  307  576:ior             
	//  308  577:int2byte        
	//  309  578:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  310  581:pop             
						bytebuffer.put((byte)(i >>> 12 & 0x3f | 0x80));
	//  311  582:aload_1         
	//  312  583:iload           4
	//  313  585:bipush          12
	//  314  587:iushr           
	//  315  588:bipush          63
	//  316  590:iand            
	//  317  591:sipush          128
	//  318  594:ior             
	//  319  595:int2byte        
	//  320  596:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  321  599:pop             
						bytebuffer.put((byte)(i >>> 6 & 0x3f | 0x80));
	//  322  600:aload_1         
	//  323  601:iload           4
	//  324  603:bipush          6
	//  325  605:iushr           
	//  326  606:bipush          63
	//  327  608:iand            
	//  328  609:sipush          128
	//  329  612:ior             
	//  330  613:int2byte        
	//  331  614:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  332  617:pop             
						bytebuffer.put((byte)(i & 0x3f | 0x80));
	//  333  618:aload_1         
	//  334  619:iload           4
	//  335  621:bipush          63
	//  336  623:iand            
	//  337  624:sipush          128
	//  338  627:ior             
	//  339  628:int2byte        
	//  340  629:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  341  632:pop             
						i = j;
	//  342  633:iload           5
	//  343  635:istore          4
						continue;
	//  344  637:goto            727
					}
					i = j;
	//  345  640:iload           5
	//  346  642:istore          4
				}
				charsequence = ((CharSequence) (new StringBuilder(39)));
	//  347  644:new             #60  <Class StringBuilder>
	//  348  647:dup             
	//  349  648:bipush          39
	//  350  650:invokespecial   #63  <Method void StringBuilder(int)>
	//  351  653:astore_0        
				((StringBuilder) (charsequence)).append("Unpaired surrogate at index ");
	//  352  654:aload_0         
	//  353  655:ldc1            #65  <String "Unpaired surrogate at index ">
	//  354  657:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//  355  660:pop             
				((StringBuilder) (charsequence)).append(i - 1);
	//  356  661:aload_0         
	//  357  662:iload           4
	//  358  664:iconst_1        
	//  359  665:isub            
	//  360  666:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//  361  669:pop             
				throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  362  670:new             #74  <Class IllegalArgumentException>
	//  363  673:dup             
	//  364  674:aload_0         
	//  365  675:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  366  678:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//  367  681:athrow          
			}
			bytebuffer.put((byte)(c >>> 12 | 0x1e0));
	//  368  682:aload_1         
	//  369  683:iload_2         
	//  370  684:bipush          12
	//  371  686:iushr           
	//  372  687:sipush          480
	//  373  690:ior             
	//  374  691:int2byte        
	//  375  692:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  376  695:pop             
			bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
	//  377  696:aload_1         
	//  378  697:iload_2         
	//  379  698:bipush          6
	//  380  700:iushr           
	//  381  701:bipush          63
	//  382  703:iand            
	//  383  704:sipush          128
	//  384  707:ior             
	//  385  708:int2byte        
	//  386  709:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  387  712:pop             
			bytebuffer.put((byte)(c & 0x3f | 0x80));
	//  388  713:aload_1         
	//  389  714:iload_2         
	//  390  715:bipush          63
	//  391  717:iand            
	//  392  718:sipush          128
	//  393  721:ior             
	//  394  722:int2byte        
	//  395  723:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//  396  726:pop             
		}

	//  397  727:iload           4
	//  398  729:iconst_1        
	//  399  730:iadd            
	//  400  731:istore          4
	//* 401  733:goto            440
		return;
	//  402  736:return          
_L2:
		throw new ReadOnlyBufferException();
	//  403  737:new             #203 <Class ReadOnlyBufferException>
	//  404  740:dup             
	//  405  741:invokespecial   #204 <Method void ReadOnlyBufferException()>
	//  406  744:athrow          
_L5:
label0:
		{
			if(j != l)
				break label0;
	//  407  745:iload           5
	//  408  747:iload           7
	//  409  749:icmpne          762
			k = i + l;
	//  410  752:iload           4
	//  411  754:iload           7
	//  412  756:iadd            
	//  413  757:istore          6
		}
		  goto _L8
	//* 414  759:goto            402
		i += j;
	//  415  762:iload           4
	//  416  764:iload           5
	//  417  766:iadd            
	//  418  767:istore          4
		  goto _L16
	//* 419  769:goto            118
_L10:
		if(c >= '\u0800' || i > i1 - 2) goto _L18; else goto _L17
	//  420  772:iload_2         
	//  421  773:sipush          2048
	//  422  776:icmpge          831
	//  423  779:iload           4
	//  424  781:iload           8
	//  425  783:iconst_2        
	//  426  784:isub            
	//  427  785:icmpgt          831
_L17:
		k = i + 1;
	//  428  788:iload           4
	//  429  790:iconst_1        
	//  430  791:iadd            
	//  431  792:istore          6
		abyte0[i] = (byte)(c >>> 6 | 0x3c0);
	//  432  794:aload           11
	//  433  796:iload           4
	//  434  798:iload_2         
	//  435  799:bipush          6
	//  436  801:iushr           
	//  437  802:sipush          960
	//  438  805:ior             
	//  439  806:int2byte        
	//  440  807:bastore         
		i = k + 1;
	//  441  808:iload           6
	//  442  810:iconst_1        
	//  443  811:iadd            
	//  444  812:istore          4
		abyte0[k] = (byte)(c & 0x3f | 0x80);
	//  445  814:aload           11
	//  446  816:iload           6
	//  447  818:iload_2         
	//  448  819:bipush          63
	//  449  821:iand            
	//  450  822:sipush          128
	//  451  825:ior             
	//  452  826:int2byte        
	//  453  827:bastore         
		  goto _L11
	//* 454  828:goto            915
_L18:
		if(c >= '\uD800' && '\uDFFF' >= c || i > i1 - 3) goto _L20; else goto _L19
	//  455  831:iload_2         
	//  456  832:ldc1            #50  <Int 55296>
	//  457  834:icmplt          843
	//  458  837:ldc1            #51  <Int 57343>
	//  459  839:iload_2         
	//  460  840:icmpge          168
	//  461  843:iload           4
	//  462  845:iload           8
	//  463  847:iconst_3        
	//  464  848:isub            
	//  465  849:icmpgt          168
_L19:
		k = i + 1;
	//  466  852:iload           4
	//  467  854:iconst_1        
	//  468  855:iadd            
	//  469  856:istore          6
		abyte0[i] = (byte)(c >>> 12 | 0x1e0);
	//  470  858:aload           11
	//  471  860:iload           4
	//  472  862:iload_2         
	//  473  863:bipush          12
	//  474  865:iushr           
	//  475  866:sipush          480
	//  476  869:ior             
	//  477  870:int2byte        
	//  478  871:bastore         
		i = k + 1;
	//  479  872:iload           6
	//  480  874:iconst_1        
	//  481  875:iadd            
	//  482  876:istore          4
		abyte0[k] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  483  878:aload           11
	//  484  880:iload           6
	//  485  882:iload_2         
	//  486  883:bipush          6
	//  487  885:iushr           
	//  488  886:bipush          63
	//  489  888:iand            
	//  490  889:sipush          128
	//  491  892:ior             
	//  492  893:int2byte        
	//  493  894:bastore         
		abyte0[i] = (byte)(c & 0x3f | 0x80);
	//  494  895:aload           11
	//  495  897:iload           4
	//  496  899:iload_2         
	//  497  900:bipush          63
	//  498  902:iand            
	//  499  903:sipush          128
	//  500  906:ior             
	//  501  907:int2byte        
	//  502  908:bastore         
		i++;
	//  503  909:iload           4
	//  504  911:iconst_1        
	//  505  912:iadd            
	//  506  913:istore          4
_L11:
		j++;
	//  507  915:iload           5
	//  508  917:iconst_1        
	//  509  918:iadd            
	//  510  919:istore          5
		  goto _L16
	//* 511  921:goto            118
		j = k;
	//  512  924:iload           6
	//  513  926:istore          5
		  goto _L15
	//* 514  928:goto            315
	}

	public static int zzi(int i, int j)
	{
		return zzav(i) + zzaw(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method int zzav(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #208 <Method int zzaw(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static zzjl zzk(byte abyte0[])
	{
		return zzl(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #214 <Method zzjl zzl(byte[], int, int)>
	//    5    7:areturn         
	}

	public static zzjl zzl(byte abyte0[], int i, int j)
	{
		return new zzjl(abyte0, 0, j);
	//    0    0:new             #2   <Class zzjl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #216 <Method void zzjl(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzn(String s)
	{
		int i = zza(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #218 <Method int zza(CharSequence)>
	//    2    4:istore_1        
		return zzbd(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #93  <Method int zzbd(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	private final void zzq(long l)
		throws IOException
	{
		do
		{
			if((-128L & l) == 0L)
	//*   0    0:ldc2w           #136 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            17
			{
				zzbu((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokespecial   #222 <Method void zzbu(int)>
				return;
	//   10   16:return          
			}
			zzbu((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokespecial   #222 <Method void zzbu(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public final void zza(int i, float f)
		throws IOException
	{
		zzd(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		i = Float.floatToIntBits(f);
	//    4    6:fload_2         
	//    5    7:invokestatic    #231 <Method int Float.floatToIntBits(float)>
	//    6   10:istore_1        
		if(zzsw.remaining() >= 4)
	//*   7   11:aload_0         
	//*   8   12:getfield        #17  <Field ByteBuffer zzsw>
	//*   9   15:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//*  10   18:iconst_4        
	//*  11   19:icmplt          32
		{
			zzsw.putInt(i);
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field ByteBuffer zzsw>
	//   14   26:iload_1         
	//   15   27:invokevirtual   #235 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   16   30:pop             
			return;
	//   17   31:return          
		} else
		{
			throw new zzjm(zzsw.position(), zzsw.limit());
	//   18   32:new             #123 <Class zzjm>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #17  <Field ByteBuffer zzsw>
	//   22   40:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   23   43:aload_0         
	//   24   44:getfield        #17  <Field ByteBuffer zzsw>
	//   25   47:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   26   50:invokespecial   #132 <Method void zzjm(int, int)>
	//   27   53:athrow          
		}
	}

	public final void zza(int i, zzjt zzjt1)
		throws IOException
	{
		zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		if(zzjt1.zzadp < 0)
	//*   4    6:aload_2         
	//*   5    7:getfield        #239 <Field int zzjt.zzadp>
	//*   6   10:ifge            18
			zzjt1.zzeq();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #103 <Method int zzjt.zzeq()>
	//    9   17:pop             
		zzbv(zzjt1.zzadp);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:getfield        #239 <Field int zzjt.zzadp>
	//   13   23:invokevirtual   #156 <Method void zzbv(int)>
		zzjt1.zza(this);
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #242 <Method void zzjt.zza(zzjl)>
	//   17   31:return          
	}

	public final void zza(int i, String s)
		throws IOException
	{
		zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		int j;
		try
		{
			i = zzbd(s.length());
	//    4    6:aload_2         
	//    5    7:invokevirtual   #246 <Method int String.length()>
	//    6   10:invokestatic    #93  <Method int zzbd(int)>
	//    7   13:istore_1        
			if(i != zzbd(s.length() * 3))
				break MISSING_BLOCK_LABEL_122;
	//    8   14:iload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #246 <Method int String.length()>
	//   11   19:iconst_3        
	//   12   20:imul            
	//   13   21:invokestatic    #93  <Method int zzbd(int)>
	//   14   24:icmpne          122
			j = zzsw.position();
	//   15   27:aload_0         
	//   16   28:getfield        #17  <Field ByteBuffer zzsw>
	//   17   31:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   18   34:istore_3        
			if(zzsw.remaining() >= i)
	//*  19   35:aload_0         
	//*  20   36:getfield        #17  <Field ByteBuffer zzsw>
	//*  21   39:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//*  22   42:iload_1         
	//*  23   43:icmplt          104
			{
				zzsw.position(j + i);
	//   24   46:aload_0         
	//   25   47:getfield        #17  <Field ByteBuffer zzsw>
	//   26   50:iload_3         
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:invokevirtual   #194 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   30   56:pop             
				zzd(((CharSequence) (s)), zzsw);
	//   31   57:aload_2         
	//   32   58:aload_0         
	//   33   59:getfield        #17  <Field ByteBuffer zzsw>
	//   34   62:invokestatic    #248 <Method void zzd(CharSequence, ByteBuffer)>
				int k = zzsw.position();
	//   35   65:aload_0         
	//   36   66:getfield        #17  <Field ByteBuffer zzsw>
	//   37   69:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   38   72:istore          4
				zzsw.position(j);
	//   39   74:aload_0         
	//   40   75:getfield        #17  <Field ByteBuffer zzsw>
	//   41   78:iload_3         
	//   42   79:invokevirtual   #194 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   43   82:pop             
				zzbv(k - j - i);
	//   44   83:aload_0         
	//   45   84:iload           4
	//   46   86:iload_3         
	//   47   87:isub            
	//   48   88:iload_1         
	//   49   89:isub            
	//   50   90:invokevirtual   #156 <Method void zzbv(int)>
				zzsw.position(k);
	//   51   93:aload_0         
	//   52   94:getfield        #17  <Field ByteBuffer zzsw>
	//   53   97:iload           4
	//   54   99:invokevirtual   #194 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   55  102:pop             
				return;
	//   56  103:return          
			}
		}
	//*  57  104:new             #123 <Class zzjm>
	//*  58  107:dup             
	//*  59  108:iload_3         
	//*  60  109:iload_1         
	//*  61  110:iadd            
	//*  62  111:aload_0         
	//*  63  112:getfield        #17  <Field ByteBuffer zzsw>
	//*  64  115:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//*  65  118:invokespecial   #132 <Method void zzjm(int, int)>
	//*  66  121:athrow          
	//*  67  122:aload_0         
	//*  68  123:aload_2         
	//*  69  124:invokestatic    #218 <Method int zza(CharSequence)>
	//*  70  127:invokevirtual   #156 <Method void zzbv(int)>
	//*  71  130:aload_2         
	//*  72  131:aload_0         
	//*  73  132:getfield        #17  <Field ByteBuffer zzsw>
	//*  74  135:invokestatic    #248 <Method void zzd(CharSequence, ByteBuffer)>
	//*  75  138:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  76  139:astore_2        
		{
			zzjm zzjm1 = new zzjm(zzsw.position(), zzsw.limit());
	//   77  140:new             #123 <Class zzjm>
	//   78  143:dup             
	//   79  144:aload_0         
	//   80  145:getfield        #17  <Field ByteBuffer zzsw>
	//   81  148:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   82  151:aload_0         
	//   83  152:getfield        #17  <Field ByteBuffer zzsw>
	//   84  155:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   85  158:invokespecial   #132 <Method void zzjm(int, int)>
	//   86  161:astore          5
			zzjm1.initCause(((Throwable) (s)));
	//   87  163:aload           5
	//   88  165:aload_2         
	//   89  166:invokevirtual   #249 <Method Throwable zzjm.initCause(Throwable)>
	//   90  169:pop             
			throw zzjm1;
	//   91  170:aload           5
	//   92  172:athrow          
		}
		throw new zzjm(j + i, zzsw.limit());
		zzbv(zza(((CharSequence) (s))));
		zzd(((CharSequence) (s)), zzsw);
		return;
	}

	public final void zzb(int i, boolean flag)
		throws IOException
	{
		zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		byte byte0 = (byte)flag;
	//    4    6:iload_2         
	//    5    7:int2byte        
	//    6    8:istore_3        
		if(zzsw.hasRemaining())
	//*   7    9:aload_0         
	//*   8   10:getfield        #17  <Field ByteBuffer zzsw>
	//*   9   13:invokevirtual   #117 <Method boolean ByteBuffer.hasRemaining()>
	//*  10   16:ifeq            29
		{
			zzsw.put(byte0);
	//   11   19:aload_0         
	//   12   20:getfield        #17  <Field ByteBuffer zzsw>
	//   13   23:iload_3         
	//   14   24:invokevirtual   #121 <Method ByteBuffer ByteBuffer.put(byte)>
	//   15   27:pop             
			return;
	//   16   28:return          
		} else
		{
			throw new zzjm(zzsw.position(), zzsw.limit());
	//   17   29:new             #123 <Class zzjm>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:getfield        #17  <Field ByteBuffer zzsw>
	//   21   37:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   22   40:aload_0         
	//   23   41:getfield        #17  <Field ByteBuffer zzsw>
	//   24   44:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   25   47:invokespecial   #132 <Method void zzjm(int, int)>
	//   26   50:athrow          
		}
	}

	public final void zzbv(int i)
		throws IOException
	{
		do
		{
			if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            13
			{
				zzbu(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #222 <Method void zzbu(int)>
				return;
	//    7   12:return          
			}
			zzbu(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokespecial   #222 <Method void zzbu(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public final void zze(int i, int j)
		throws IOException
	{
		zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		if(j >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            16
		{
			zzbv(j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #156 <Method void zzbv(int)>
			return;
	//    9   15:return          
		} else
		{
			zzq(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:i2l             
	//   13   19:invokespecial   #253 <Method void zzq(long)>
			return;
	//   14   22:return          
		}
	}

	public final void zze(int i, zzhf zzhf)
		throws IOException
	{
		if(zzade == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field zzfe zzade>
	//*   2    4:ifnonnull       32
		{
			zzade = zzfe.zza(zzsw);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ByteBuffer zzsw>
	//    6   12:invokestatic    #261 <Method zzfe zzfe.zza(ByteBuffer)>
	//    7   15:putfield        #256 <Field zzfe zzade>
			zzadf = zzsw.position();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field ByteBuffer zzsw>
	//   11   23:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   12   26:putfield        #263 <Field int zzadf>
		} else
	//*  13   29:goto            87
		if(zzadf != zzsw.position())
	//*  14   32:aload_0         
	//*  15   33:getfield        #263 <Field int zzadf>
	//*  16   36:aload_0         
	//*  17   37:getfield        #17  <Field ByteBuffer zzsw>
	//*  18   40:invokevirtual   #126 <Method int ByteBuffer.position()>
	//*  19   43:icmpeq          87
		{
			zzade.write(zzsw.array(), zzadf, zzsw.position() - zzadf);
	//   20   46:aload_0         
	//   21   47:getfield        #256 <Field zzfe zzade>
	//   22   50:aload_0         
	//   23   51:getfield        #17  <Field ByteBuffer zzsw>
	//   24   54:invokevirtual   #169 <Method byte[] ByteBuffer.array()>
	//   25   57:aload_0         
	//   26   58:getfield        #263 <Field int zzadf>
	//   27   61:aload_0         
	//   28   62:getfield        #17  <Field ByteBuffer zzsw>
	//   29   65:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   30   68:aload_0         
	//   31   69:getfield        #263 <Field int zzadf>
	//   32   72:isub            
	//   33   73:invokevirtual   #266 <Method void zzfe.write(byte[], int, int)>
			zzadf = zzsw.position();
	//   34   76:aload_0         
	//   35   77:aload_0         
	//   36   78:getfield        #17  <Field ByteBuffer zzsw>
	//   37   81:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   38   84:putfield        #263 <Field int zzadf>
		}
		zzfe zzfe1 = zzade;
	//   39   87:aload_0         
	//   40   88:getfield        #256 <Field zzfe zzade>
	//   41   91:astore_3        
		zzfe1.zza(2, zzhf);
	//   42   92:aload_3         
	//   43   93:iconst_2        
	//   44   94:aload_2         
	//   45   95:invokevirtual   #268 <Method void zzfe.zza(int, zzhf)>
		zzfe1.flush();
	//   46   98:aload_3         
	//   47   99:invokevirtual   #271 <Method void zzfe.flush()>
		zzadf = zzsw.position();
	//   48  102:aload_0         
	//   49  103:aload_0         
	//   50  104:getfield        #17  <Field ByteBuffer zzsw>
	//   51  107:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   52  110:putfield        #263 <Field int zzadf>
	//   53  113:return          
	}

	public final void zzea()
	{
		if(zzsw.remaining() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ByteBuffer zzsw>
	//*   2    4:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		else
			throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] {
				Integer.valueOf(zzsw.remaining())
			}));
	//    5   11:new             #274 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #276 <String "Did not write as much data as expected, %s bytes remaining.">
	//    8   18:iconst_1        
	//    9   19:anewarray       Object[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field ByteBuffer zzsw>
	//   14   28:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//   15   31:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   16   34:aastore         
	//   17   35:invokestatic    #286 <Method String String.format(String, Object[])>
	//   18   38:invokespecial   #287 <Method void IllegalStateException(String)>
	//   19   41:athrow          
	}

	public final void zzi(int i, long l)
		throws IOException
	{
		zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #225 <Method void zzd(int, int)>
		zzq(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokespecial   #253 <Method void zzq(long)>
	//    7   11:return          
	}

	public final void zzl(byte abyte0[])
		throws IOException
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		if(zzsw.remaining() >= i)
	//*   3    3:aload_0         
	//*   4    4:getfield        #17  <Field ByteBuffer zzsw>
	//*   5    7:invokevirtual   #175 <Method int ByteBuffer.remaining()>
	//*   6   10:iload_2         
	//*   7   11:icmplt          26
		{
			zzsw.put(abyte0, 0, i);
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field ByteBuffer zzsw>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:iload_2         
	//   13   21:invokevirtual   #291 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   14   24:pop             
			return;
	//   15   25:return          
		} else
		{
			throw new zzjm(zzsw.position(), zzsw.limit());
	//   16   26:new             #123 <Class zzjm>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #17  <Field ByteBuffer zzsw>
	//   20   34:invokevirtual   #126 <Method int ByteBuffer.position()>
	//   21   37:aload_0         
	//   22   38:getfield        #17  <Field ByteBuffer zzsw>
	//   23   41:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   24   44:invokespecial   #132 <Method void zzjm(int, int)>
	//   25   47:athrow          
		}
	}

	private zzfe zzade;
	private int zzadf;
	private final ByteBuffer zzsw;
}
