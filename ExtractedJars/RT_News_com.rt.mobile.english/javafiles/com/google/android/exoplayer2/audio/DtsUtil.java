// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class DtsUtil
{

	private DtsUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static int getDtsFrameSize(byte abyte0[])
	{
		int i;
		byte byte0;
		byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		i = ((int) (abyte0[0]));
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:baload          
	//    5    5:istore_1        
		if(i == 31) goto _L2; else goto _L1
	//    6    6:iload_1         
	//    7    7:bipush          31
	//    8    9:icmpeq          158
_L1:
		i;
	//    9   12:iload_1         
		JVM INSTR tableswitch -2 -1: default 36
	//	               -2 118
	//	               -1 76;
	//   10   13:tableswitch     -2 -1: default 36
	//	               -2 118
	//	               -1 76
		   goto _L3 _L4 _L5
_L3:
		i = ((int) (abyte0[5]));
	//   11   36:aload_0         
	//   12   37:iconst_5        
	//   13   38:baload          
	//   14   39:istore_1        
		byte byte1 = abyte0[6];
	//   15   40:aload_0         
	//   16   41:bipush          6
	//   17   43:baload          
	//   18   44:istore_3        
		i = ((abyte0[7] & 0xf0) >> 4 | ((i & 3) << 12 | (byte1 & 0xff) << 4)) + 1;
	//   19   45:aload_0         
	//   20   46:bipush          7
	//   21   48:baload          
	//   22   49:sipush          240
	//   23   52:iand            
	//   24   53:iconst_4        
	//   25   54:ishr            
	//   26   55:iload_1         
	//   27   56:iconst_3        
	//   28   57:iand            
	//   29   58:bipush          12
	//   30   60:ishl            
	//   31   61:iload_3         
	//   32   62:sipush          255
	//   33   65:iand            
	//   34   66:iconst_4        
	//   35   67:ishl            
	//   36   68:ior             
	//   37   69:ior             
	//   38   70:iconst_1        
	//   39   71:iadd            
	//   40   72:istore_1        
		  goto _L6
	//*  41   73:goto            198
_L5:
		i = ((int) (abyte0[7]));
	//   42   76:aload_0         
	//   43   77:bipush          7
	//   44   79:baload          
	//   45   80:istore_1        
		byte0 = abyte0[6];
	//   46   81:aload_0         
	//   47   82:bipush          6
	//   48   84:baload          
	//   49   85:istore_2        
		i = ((abyte0[9] & 0x3c) >> 2 | ((i & 3) << 12 | (byte0 & 0xff) << 4)) + 1;
	//   50   86:aload_0         
	//   51   87:bipush          9
	//   52   89:baload          
	//   53   90:bipush          60
	//   54   92:iand            
	//   55   93:iconst_2        
	//   56   94:ishr            
	//   57   95:iload_1         
	//   58   96:iconst_3        
	//   59   97:iand            
	//   60   98:bipush          12
	//   61  100:ishl            
	//   62  101:iload_2         
	//   63  102:sipush          255
	//   64  105:iand            
	//   65  106:iconst_4        
	//   66  107:ishl            
	//   67  108:ior             
	//   68  109:ior             
	//   69  110:iconst_1        
	//   70  111:iadd            
	//   71  112:istore_1        
_L7:
		byte0 = 1;
	//   72  113:iconst_1        
	//   73  114:istore_2        
		break; /* Loop/switch isn't completed */
	//   74  115:goto            198
_L4:
		i = ((int) (abyte0[4]));
	//   75  118:aload_0         
	//   76  119:iconst_4        
	//   77  120:baload          
	//   78  121:istore_1        
		byte byte2 = abyte0[7];
	//   79  122:aload_0         
	//   80  123:bipush          7
	//   81  125:baload          
	//   82  126:istore_3        
		i = ((abyte0[6] & 0xf0) >> 4 | ((i & 3) << 12 | (byte2 & 0xff) << 4)) + 1;
	//   83  127:aload_0         
	//   84  128:bipush          6
	//   85  130:baload          
	//   86  131:sipush          240
	//   87  134:iand            
	//   88  135:iconst_4        
	//   89  136:ishr            
	//   90  137:iload_1         
	//   91  138:iconst_3        
	//   92  139:iand            
	//   93  140:bipush          12
	//   94  142:ishl            
	//   95  143:iload_3         
	//   96  144:sipush          255
	//   97  147:iand            
	//   98  148:iconst_4        
	//   99  149:ishl            
	//  100  150:ior             
	//  101  151:ior             
	//  102  152:iconst_1        
	//  103  153:iadd            
	//  104  154:istore_1        
		break; /* Loop/switch isn't completed */
	//  105  155:goto            198
_L2:
		i = ((int) (abyte0[6]));
	//  106  158:aload_0         
	//  107  159:bipush          6
	//  108  161:baload          
	//  109  162:istore_1        
		byte0 = abyte0[7];
	//  110  163:aload_0         
	//  111  164:bipush          7
	//  112  166:baload          
	//  113  167:istore_2        
		i = ((abyte0[8] & 0x3c) >> 2 | ((i & 3) << 12 | (byte0 & 0xff) << 4)) + 1;
	//  114  168:aload_0         
	//  115  169:bipush          8
	//  116  171:baload          
	//  117  172:bipush          60
	//  118  174:iand            
	//  119  175:iconst_2        
	//  120  176:ishr            
	//  121  177:iload_1         
	//  122  178:iconst_3        
	//  123  179:iand            
	//  124  180:bipush          12
	//  125  182:ishl            
	//  126  183:iload_2         
	//  127  184:sipush          255
	//  128  187:iand            
	//  129  188:iconst_4        
	//  130  189:ishl            
	//  131  190:ior             
	//  132  191:ior             
	//  133  192:iconst_1        
	//  134  193:iadd            
	//  135  194:istore_1        
		if(true) goto _L7; else goto _L6
	//  136  195:goto            113
_L6:
		int j = i;
	//  137  198:iload_1         
	//  138  199:istore_3        
		if(byte0 != 0)
	//* 139  200:iload_2         
	//* 140  201:ifeq            212
			j = (i * 16) / 14;
	//  141  204:iload_1         
	//  142  205:bipush          16
	//  143  207:imul            
	//  144  208:bipush          14
	//  145  210:idiv            
	//  146  211:istore_3        
		return j;
	//  147  212:iload_3         
	//  148  213:ireturn         
	}

	private static ParsableBitArray getNormalizedFrameHeader(byte abyte0[])
	{
		if(abyte0[0] == 127)
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:baload          
	//*   3    3:bipush          127
	//*   4    5:icmpne          17
			return new ParsableBitArray(abyte0);
	//    5    8:new             #46  <Class ParsableBitArray>
	//    6   11:dup             
	//    7   12:aload_0         
	//    8   13:invokespecial   #49  <Method void ParsableBitArray(byte[])>
	//    9   16:areturn         
		abyte0 = Arrays.copyOf(abyte0, abyte0.length);
	//   10   17:aload_0         
	//   11   18:aload_0         
	//   12   19:arraylength     
	//   13   20:invokestatic    #55  <Method byte[] Arrays.copyOf(byte[], int)>
	//   14   23:astore_0        
		if(isLittleEndianFrameHeader(abyte0))
	//*  15   24:aload_0         
	//*  16   25:invokestatic    #59  <Method boolean isLittleEndianFrameHeader(byte[])>
	//*  17   28:ifeq            66
		{
			for(int i = 0; i < abyte0.length - 1; i += 2)
	//*  18   31:iconst_0        
	//*  19   32:istore_2        
	//*  20   33:iload_2         
	//*  21   34:aload_0         
	//*  22   35:arraylength     
	//*  23   36:iconst_1        
	//*  24   37:isub            
	//*  25   38:icmpge          66
			{
				byte byte0 = abyte0[i];
	//   26   41:aload_0         
	//   27   42:iload_2         
	//   28   43:baload          
	//   29   44:istore_1        
				int j = i + 1;
	//   30   45:iload_2         
	//   31   46:iconst_1        
	//   32   47:iadd            
	//   33   48:istore_3        
				abyte0[i] = abyte0[j];
	//   34   49:aload_0         
	//   35   50:iload_2         
	//   36   51:aload_0         
	//   37   52:iload_3         
	//   38   53:baload          
	//   39   54:bastore         
				abyte0[j] = byte0;
	//   40   55:aload_0         
	//   41   56:iload_3         
	//   42   57:iload_1         
	//   43   58:bastore         
			}

	//   44   59:iload_2         
	//   45   60:iconst_2        
	//   46   61:iadd            
	//   47   62:istore_2        
		}
	//*  48   63:goto            33
		ParsableBitArray parsablebitarray = new ParsableBitArray(abyte0);
	//   49   66:new             #46  <Class ParsableBitArray>
	//   50   69:dup             
	//   51   70:aload_0         
	//   52   71:invokespecial   #49  <Method void ParsableBitArray(byte[])>
	//   53   74:astore          4
		if(abyte0[0] == 31)
	//*  54   76:aload_0         
	//*  55   77:iconst_0        
	//*  56   78:baload          
	//*  57   79:bipush          31
	//*  58   81:icmpne          127
		{
			for(ParsableBitArray parsablebitarray1 = new ParsableBitArray(abyte0); parsablebitarray1.bitsLeft() >= 16; parsablebitarray.putInt(parsablebitarray1.readBits(14), 14))
	//*  59   84:new             #46  <Class ParsableBitArray>
	//*  60   87:dup             
	//*  61   88:aload_0         
	//*  62   89:invokespecial   #49  <Method void ParsableBitArray(byte[])>
	//*  63   92:astore          5
	//*  64   94:aload           5
	//*  65   96:invokevirtual   #63  <Method int ParsableBitArray.bitsLeft()>
	//*  66   99:bipush          16
	//*  67  101:icmplt          127
				parsablebitarray1.skipBits(2);
	//   68  104:aload           5
	//   69  106:iconst_2        
	//   70  107:invokevirtual   #67  <Method void ParsableBitArray.skipBits(int)>

	//   71  110:aload           4
	//   72  112:aload           5
	//   73  114:bipush          14
	//   74  116:invokevirtual   #71  <Method int ParsableBitArray.readBits(int)>
	//   75  119:bipush          14
	//   76  121:invokevirtual   #75  <Method void ParsableBitArray.putInt(int, int)>
		}
	//*  77  124:goto            94
		parsablebitarray.reset(abyte0);
	//   78  127:aload           4
	//   79  129:aload_0         
	//   80  130:invokevirtual   #78  <Method void ParsableBitArray.reset(byte[])>
		return parsablebitarray;
	//   81  133:aload           4
	//   82  135:areturn         
	}

	private static boolean isLittleEndianFrameHeader(byte abyte0[])
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(abyte0[0] == -2 || abyte0[0] == -1)
	//*   2    2:aload_0         
	//*   3    3:iconst_0        
	//*   4    4:baload          
	//*   5    5:bipush          -2
	//*   6    7:icmpeq          17
	//*   7   10:aload_0         
	//*   8   11:iconst_0        
	//*   9   12:baload          
	//*  10   13:iconst_m1       
	//*  11   14:icmpne          19
			flag = true;
	//   12   17:iconst_1        
	//   13   18:istore_1        
		return flag;
	//   14   19:iload_1         
	//   15   20:ireturn         
	}

	public static boolean isSyncWord(int i)
	{
		return i == 0x7ffe8001 || i == 0xfe7f0180 || i == 0x1fffe800 || i == 0xff1f00e8;
	//    0    0:iload_0         
	//    1    1:ldc1            #23  <Int 0x7ffe8001>
	//    2    3:icmpeq          29
	//    3    6:iload_0         
	//    4    7:ldc1            #25  <Int 0xfe7f0180>
	//    5    9:icmpeq          29
	//    6   12:iload_0         
	//    7   13:ldc1            #19  <Int 0x1fffe800>
	//    8   15:icmpeq          29
	//    9   18:iload_0         
	//   10   19:ldc1            #21  <Int 0xff1f00e8>
	//   11   21:icmpne          27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	public static int parseDtsAudioSampleCount(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method int ByteBuffer.position()>
	//    2    4:istore_1        
		byte byte0 = bytebuffer.get(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//    6   10:istore_2        
		if(byte0 != 31)
	//*   7   11:iload_2         
	//*   8   12:bipush          31
	//*   9   14:icmpeq          136
		{
			switch(byte0)
	//*  10   17:iload_2         
			{
	//*  11   18:tableswitch     -2 -1: default 40
	//	               -2 104
	//	               -1 72
			default:
				byte byte1 = bytebuffer.get(i + 4);
	//   12   40:aload_0         
	//   13   41:iload_1         
	//   14   42:iconst_4        
	//   15   43:iadd            
	//   16   44:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   17   47:istore_2        
				i = (bytebuffer.get(i + 5) & 0xfc) >> 2 | (byte1 & 1) << 6;
	//   18   48:aload_0         
	//   19   49:iload_1         
	//   20   50:iconst_5        
	//   21   51:iadd            
	//   22   52:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   23   55:sipush          252
	//   24   58:iand            
	//   25   59:iconst_2        
	//   26   60:ishr            
	//   27   61:iload_2         
	//   28   62:iconst_1        
	//   29   63:iand            
	//   30   64:bipush          6
	//   31   66:ishl            
	//   32   67:ior             
	//   33   68:istore_1        
				break;

	//*  34   69:goto            165
			case -1: 
				byte byte2 = bytebuffer.get(i + 4);
	//   35   72:aload_0         
	//   36   73:iload_1         
	//   37   74:iconst_4        
	//   38   75:iadd            
	//   39   76:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   40   79:istore_2        
				i = (bytebuffer.get(i + 7) & 0x3c) >> 2 | (byte2 & 7) << 4;
	//   41   80:aload_0         
	//   42   81:iload_1         
	//   43   82:bipush          7
	//   44   84:iadd            
	//   45   85:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   46   88:bipush          60
	//   47   90:iand            
	//   48   91:iconst_2        
	//   49   92:ishr            
	//   50   93:iload_2         
	//   51   94:bipush          7
	//   52   96:iand            
	//   53   97:iconst_4        
	//   54   98:ishl            
	//   55   99:ior             
	//   56  100:istore_1        
				break;

	//*  57  101:goto            165
			case -2: 
				byte byte3 = bytebuffer.get(i + 5);
	//   58  104:aload_0         
	//   59  105:iload_1         
	//   60  106:iconst_5        
	//   61  107:iadd            
	//   62  108:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   63  111:istore_2        
				i = (bytebuffer.get(i + 4) & 0xfc) >> 2 | (byte3 & 1) << 6;
	//   64  112:aload_0         
	//   65  113:iload_1         
	//   66  114:iconst_4        
	//   67  115:iadd            
	//   68  116:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   69  119:sipush          252
	//   70  122:iand            
	//   71  123:iconst_2        
	//   72  124:ishr            
	//   73  125:iload_2         
	//   74  126:iconst_1        
	//   75  127:iand            
	//   76  128:bipush          6
	//   77  130:ishl            
	//   78  131:ior             
	//   79  132:istore_1        
				break;
			}
		} else
	//*  80  133:goto            165
		{
			byte byte4 = bytebuffer.get(i + 5);
	//   81  136:aload_0         
	//   82  137:iload_1         
	//   83  138:iconst_5        
	//   84  139:iadd            
	//   85  140:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   86  143:istore_2        
			i = (bytebuffer.get(i + 6) & 0x3c) >> 2 | (byte4 & 7) << 4;
	//   87  144:aload_0         
	//   88  145:iload_1         
	//   89  146:bipush          6
	//   90  148:iadd            
	//   91  149:invokevirtual   #91  <Method byte ByteBuffer.get(int)>
	//   92  152:bipush          60
	//   93  154:iand            
	//   94  155:iconst_2        
	//   95  156:ishr            
	//   96  157:iload_2         
	//   97  158:bipush          7
	//   98  160:iand            
	//   99  161:iconst_4        
	//  100  162:ishl            
	//  101  163:ior             
	//  102  164:istore_1        
		}
		return (i + 1) * 32;
	//  103  165:iload_1         
	//  104  166:iconst_1        
	//  105  167:iadd            
	//  106  168:bipush          32
	//  107  170:imul            
	//  108  171:ireturn         
	}

	public static int parseDtsAudioSampleCount(byte abyte0[])
	{
		int i = ((int) (abyte0[0]));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:istore_1        
		if(i != 31)
	//*   4    4:iload_1         
	//*   5    5:bipush          31
	//*   6    7:icmpeq          104
		{
			switch(i)
	//*   7   10:iload_1         
			{
	//*   8   11:tableswitch     -2 -1: default 32
	//	               -2 80
	//	               -1 56
			default:
				i = ((int) (abyte0[4]));
	//    9   32:aload_0         
	//   10   33:iconst_4        
	//   11   34:baload          
	//   12   35:istore_1        
				i = (abyte0[5] & 0xfc) >> 2 | (i & 1) << 6;
	//   13   36:aload_0         
	//   14   37:iconst_5        
	//   15   38:baload          
	//   16   39:sipush          252
	//   17   42:iand            
	//   18   43:iconst_2        
	//   19   44:ishr            
	//   20   45:iload_1         
	//   21   46:iconst_1        
	//   22   47:iand            
	//   23   48:bipush          6
	//   24   50:ishl            
	//   25   51:ior             
	//   26   52:istore_1        
				break;

	//*  27   53:goto            125
			case -1: 
				i = ((int) (abyte0[4]));
	//   28   56:aload_0         
	//   29   57:iconst_4        
	//   30   58:baload          
	//   31   59:istore_1        
				i = (abyte0[7] & 0x3c) >> 2 | (i & 7) << 4;
	//   32   60:aload_0         
	//   33   61:bipush          7
	//   34   63:baload          
	//   35   64:bipush          60
	//   36   66:iand            
	//   37   67:iconst_2        
	//   38   68:ishr            
	//   39   69:iload_1         
	//   40   70:bipush          7
	//   41   72:iand            
	//   42   73:iconst_4        
	//   43   74:ishl            
	//   44   75:ior             
	//   45   76:istore_1        
				break;

	//*  46   77:goto            125
			case -2: 
				i = ((int) (abyte0[5]));
	//   47   80:aload_0         
	//   48   81:iconst_5        
	//   49   82:baload          
	//   50   83:istore_1        
				i = (abyte0[4] & 0xfc) >> 2 | (i & 1) << 6;
	//   51   84:aload_0         
	//   52   85:iconst_4        
	//   53   86:baload          
	//   54   87:sipush          252
	//   55   90:iand            
	//   56   91:iconst_2        
	//   57   92:ishr            
	//   58   93:iload_1         
	//   59   94:iconst_1        
	//   60   95:iand            
	//   61   96:bipush          6
	//   62   98:ishl            
	//   63   99:ior             
	//   64  100:istore_1        
				break;
			}
		} else
	//*  65  101:goto            125
		{
			i = ((int) (abyte0[5]));
	//   66  104:aload_0         
	//   67  105:iconst_5        
	//   68  106:baload          
	//   69  107:istore_1        
			i = (abyte0[6] & 0x3c) >> 2 | (i & 7) << 4;
	//   70  108:aload_0         
	//   71  109:bipush          6
	//   72  111:baload          
	//   73  112:bipush          60
	//   74  114:iand            
	//   75  115:iconst_2        
	//   76  116:ishr            
	//   77  117:iload_1         
	//   78  118:bipush          7
	//   79  120:iand            
	//   80  121:iconst_4        
	//   81  122:ishl            
	//   82  123:ior             
	//   83  124:istore_1        
		}
		return (i + 1) * 32;
	//   84  125:iload_1         
	//   85  126:iconst_1        
	//   86  127:iadd            
	//   87  128:bipush          32
	//   88  130:imul            
	//   89  131:ireturn         
	}

	public static Format parseDtsFormat(byte abyte0[], String s, String s1, DrmInitData drminitdata)
	{
		abyte0 = ((byte []) (getNormalizedFrameHeader(abyte0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #95  <Method ParsableBitArray getNormalizedFrameHeader(byte[])>
	//    2    4:astore_0        
		((ParsableBitArray) (abyte0)).skipBits(60);
	//    3    5:aload_0         
	//    4    6:bipush          60
	//    5    8:invokevirtual   #67  <Method void ParsableBitArray.skipBits(int)>
		int i = ((ParsableBitArray) (abyte0)).readBits(6);
	//    6   11:aload_0         
	//    7   12:bipush          6
	//    8   14:invokevirtual   #71  <Method int ParsableBitArray.readBits(int)>
	//    9   17:istore          4
		int k = CHANNELS_BY_AMODE[i];
	//   10   19:getstatic       #30  <Field int[] CHANNELS_BY_AMODE>
	//   11   22:iload           4
	//   12   24:iaload          
	//   13   25:istore          6
		i = ((ParsableBitArray) (abyte0)).readBits(4);
	//   14   27:aload_0         
	//   15   28:iconst_4        
	//   16   29:invokevirtual   #71  <Method int ParsableBitArray.readBits(int)>
	//   17   32:istore          4
		int l = SAMPLE_RATE_BY_SFREQ[i];
	//   18   34:getstatic       #34  <Field int[] SAMPLE_RATE_BY_SFREQ>
	//   19   37:iload           4
	//   20   39:iaload          
	//   21   40:istore          7
		i = ((ParsableBitArray) (abyte0)).readBits(5);
	//   22   42:aload_0         
	//   23   43:iconst_5        
	//   24   44:invokevirtual   #71  <Method int ParsableBitArray.readBits(int)>
	//   25   47:istore          4
		if(i >= TWICE_BITRATE_KBPS_BY_RATE.length)
	//*  26   49:iload           4
	//*  27   51:getstatic       #36  <Field int[] TWICE_BITRATE_KBPS_BY_RATE>
	//*  28   54:arraylength     
	//*  29   55:icmplt          64
			i = -1;
	//   30   58:iconst_m1       
	//   31   59:istore          4
		else
	//*  32   61:goto            81
			i = (TWICE_BITRATE_KBPS_BY_RATE[i] * 1000) / 2;
	//   33   64:getstatic       #36  <Field int[] TWICE_BITRATE_KBPS_BY_RATE>
	//   34   67:iload           4
	//   35   69:iaload          
	//   36   70:sipush          1000
	//   37   73:imul            
	//   38   74:iconst_2        
	//   39   75:idiv            
	//   40   76:istore          4
	//*  41   78:goto            61
		((ParsableBitArray) (abyte0)).skipBits(10);
	//   42   81:aload_0         
	//   43   82:bipush          10
	//   44   84:invokevirtual   #67  <Method void ParsableBitArray.skipBits(int)>
		int j;
		if(((ParsableBitArray) (abyte0)).readBits(2) > 0)
	//*  45   87:aload_0         
	//*  46   88:iconst_2        
	//*  47   89:invokevirtual   #71  <Method int ParsableBitArray.readBits(int)>
	//*  48   92:ifle            101
			j = 1;
	//   49   95:iconst_1        
	//   50   96:istore          5
		else
	//*  51   98:goto            104
			j = 0;
	//   52  101:iconst_0        
	//   53  102:istore          5
		return Format.createAudioSampleFormat(s, "audio/vnd.dts", ((String) (null)), i, -1, k + j, l, ((java.util.List) (null)), drminitdata, 0, s1);
	//   54  104:aload_1         
	//   55  105:ldc1            #97  <String "audio/vnd.dts">
	//   56  107:aconst_null     
	//   57  108:iload           4
	//   58  110:iconst_m1       
	//   59  111:iload           6
	//   60  113:iload           5
	//   61  115:iadd            
	//   62  116:iload           7
	//   63  118:aconst_null     
	//   64  119:aload_3         
	//   65  120:iconst_0        
	//   66  121:aload_2         
	//   67  122:invokestatic    #103 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, DrmInitData, int, String)>
	//   68  125:areturn         
	}

	private static final int CHANNELS_BY_AMODE[] = {
		1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 
		6, 6, 6, 7, 8, 8
	};
	private static final byte FIRST_BYTE_14B_BE = 31;
	private static final byte FIRST_BYTE_14B_LE = -1;
	private static final byte FIRST_BYTE_BE = 127;
	private static final byte FIRST_BYTE_LE = -2;
	private static final int SAMPLE_RATE_BY_SFREQ[] = {
		-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, 
		-1, 12000, 24000, 48000, -1, -1
	};
	private static final int SYNC_VALUE_14B_BE = 0x1fffe800;
	private static final int SYNC_VALUE_14B_LE = 0xff1f00e8;
	private static final int SYNC_VALUE_BE = 0x7ffe8001;
	private static final int SYNC_VALUE_LE = 0xfe7f0180;
	private static final int TWICE_BITRATE_KBPS_BY_RATE[] = {
		64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 
		768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 
		2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680
	};

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_2        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_2        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_2        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_2        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_3        
	//   25   27:iastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:iconst_3        
	//   29   32:iastore         
	//   30   33:dup             
	//   31   34:bipush          7
	//   32   36:iconst_4        
	//   33   37:iastore         
	//   34   38:dup             
	//   35   39:bipush          8
	//   36   41:iconst_4        
	//   37   42:iastore         
	//   38   43:dup             
	//   39   44:bipush          9
	//   40   46:iconst_5        
	//   41   47:iastore         
	//   42   48:dup             
	//   43   49:bipush          10
	//   44   51:bipush          6
	//   45   53:iastore         
	//   46   54:dup             
	//   47   55:bipush          11
	//   48   57:bipush          6
	//   49   59:iastore         
	//   50   60:dup             
	//   51   61:bipush          12
	//   52   63:bipush          6
	//   53   65:iastore         
	//   54   66:dup             
	//   55   67:bipush          13
	//   56   69:bipush          7
	//   57   71:iastore         
	//   58   72:dup             
	//   59   73:bipush          14
	//   60   75:bipush          8
	//   61   77:iastore         
	//   62   78:dup             
	//   63   79:bipush          15
	//   64   81:bipush          8
	//   65   83:iastore         
	//   66   84:putstatic       #30  <Field int[] CHANNELS_BY_AMODE>
	//   67   87:bipush          16
	//   68   89:newarray        int[]
	//   69   91:dup             
	//   70   92:iconst_0        
	//   71   93:iconst_m1       
	//   72   94:iastore         
	//   73   95:dup             
	//   74   96:iconst_1        
	//   75   97:sipush          8000
	//   76  100:iastore         
	//   77  101:dup             
	//   78  102:iconst_2        
	//   79  103:sipush          16000
	//   80  106:iastore         
	//   81  107:dup             
	//   82  108:iconst_3        
	//   83  109:sipush          32000
	//   84  112:iastore         
	//   85  113:dup             
	//   86  114:iconst_4        
	//   87  115:iconst_m1       
	//   88  116:iastore         
	//   89  117:dup             
	//   90  118:iconst_5        
	//   91  119:iconst_m1       
	//   92  120:iastore         
	//   93  121:dup             
	//   94  122:bipush          6
	//   95  124:sipush          11025
	//   96  127:iastore         
	//   97  128:dup             
	//   98  129:bipush          7
	//   99  131:sipush          22050
	//  100  134:iastore         
	//  101  135:dup             
	//  102  136:bipush          8
	//  103  138:ldc1            #31  <Int 44100>
	//  104  140:iastore         
	//  105  141:dup             
	//  106  142:bipush          9
	//  107  144:iconst_m1       
	//  108  145:iastore         
	//  109  146:dup             
	//  110  147:bipush          10
	//  111  149:iconst_m1       
	//  112  150:iastore         
	//  113  151:dup             
	//  114  152:bipush          11
	//  115  154:sipush          12000
	//  116  157:iastore         
	//  117  158:dup             
	//  118  159:bipush          12
	//  119  161:sipush          24000
	//  120  164:iastore         
	//  121  165:dup             
	//  122  166:bipush          13
	//  123  168:ldc1            #32  <Int 48000>
	//  124  170:iastore         
	//  125  171:dup             
	//  126  172:bipush          14
	//  127  174:iconst_m1       
	//  128  175:iastore         
	//  129  176:dup             
	//  130  177:bipush          15
	//  131  179:iconst_m1       
	//  132  180:iastore         
	//  133  181:putstatic       #34  <Field int[] SAMPLE_RATE_BY_SFREQ>
	//  134  184:bipush          29
	//  135  186:newarray        int[]
	//  136  188:dup             
	//  137  189:iconst_0        
	//  138  190:bipush          64
	//  139  192:iastore         
	//  140  193:dup             
	//  141  194:iconst_1        
	//  142  195:bipush          112
	//  143  197:iastore         
	//  144  198:dup             
	//  145  199:iconst_2        
	//  146  200:sipush          128
	//  147  203:iastore         
	//  148  204:dup             
	//  149  205:iconst_3        
	//  150  206:sipush          192
	//  151  209:iastore         
	//  152  210:dup             
	//  153  211:iconst_4        
	//  154  212:sipush          224
	//  155  215:iastore         
	//  156  216:dup             
	//  157  217:iconst_5        
	//  158  218:sipush          256
	//  159  221:iastore         
	//  160  222:dup             
	//  161  223:bipush          6
	//  162  225:sipush          384
	//  163  228:iastore         
	//  164  229:dup             
	//  165  230:bipush          7
	//  166  232:sipush          448
	//  167  235:iastore         
	//  168  236:dup             
	//  169  237:bipush          8
	//  170  239:sipush          512
	//  171  242:iastore         
	//  172  243:dup             
	//  173  244:bipush          9
	//  174  246:sipush          640
	//  175  249:iastore         
	//  176  250:dup             
	//  177  251:bipush          10
	//  178  253:sipush          768
	//  179  256:iastore         
	//  180  257:dup             
	//  181  258:bipush          11
	//  182  260:sipush          896
	//  183  263:iastore         
	//  184  264:dup             
	//  185  265:bipush          12
	//  186  267:sipush          1024
	//  187  270:iastore         
	//  188  271:dup             
	//  189  272:bipush          13
	//  190  274:sipush          1152
	//  191  277:iastore         
	//  192  278:dup             
	//  193  279:bipush          14
	//  194  281:sipush          1280
	//  195  284:iastore         
	//  196  285:dup             
	//  197  286:bipush          15
	//  198  288:sipush          1536
	//  199  291:iastore         
	//  200  292:dup             
	//  201  293:bipush          16
	//  202  295:sipush          1920
	//  203  298:iastore         
	//  204  299:dup             
	//  205  300:bipush          17
	//  206  302:sipush          2048
	//  207  305:iastore         
	//  208  306:dup             
	//  209  307:bipush          18
	//  210  309:sipush          2304
	//  211  312:iastore         
	//  212  313:dup             
	//  213  314:bipush          19
	//  214  316:sipush          2560
	//  215  319:iastore         
	//  216  320:dup             
	//  217  321:bipush          20
	//  218  323:sipush          2688
	//  219  326:iastore         
	//  220  327:dup             
	//  221  328:bipush          21
	//  222  330:sipush          2816
	//  223  333:iastore         
	//  224  334:dup             
	//  225  335:bipush          22
	//  226  337:sipush          2823
	//  227  340:iastore         
	//  228  341:dup             
	//  229  342:bipush          23
	//  230  344:sipush          2944
	//  231  347:iastore         
	//  232  348:dup             
	//  233  349:bipush          24
	//  234  351:sipush          3072
	//  235  354:iastore         
	//  236  355:dup             
	//  237  356:bipush          25
	//  238  358:sipush          3840
	//  239  361:iastore         
	//  240  362:dup             
	//  241  363:bipush          26
	//  242  365:sipush          4096
	//  243  368:iastore         
	//  244  369:dup             
	//  245  370:bipush          27
	//  246  372:sipush          6144
	//  247  375:iastore         
	//  248  376:dup             
	//  249  377:bipush          28
	//  250  379:sipush          7680
	//  251  382:iastore         
	//  252  383:putstatic       #36  <Field int[] TWICE_BITRATE_KBPS_BY_RATE>
	//* 253  386:return          
	}
}
