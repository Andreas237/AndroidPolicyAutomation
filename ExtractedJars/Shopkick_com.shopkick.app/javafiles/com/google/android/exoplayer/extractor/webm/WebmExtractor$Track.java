// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			WebmExtractor

private static final class WebmExtractor$Track
{

	private static Pair parseAvcCodecPrivate(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i;
		boolean flag;
		int j;
		int k;
		ArrayList arraylist;
		try
		{
			parsablebytearray.setPosition(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
			j = (parsablebytearray.readUnsignedByte() & 3) + 1;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:iconst_3        
	//    6   10:iand            
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:istore_3        
		}
	//*  10   14:iload_3         
	//*  11   15:iconst_3        
	//*  12   16:icmpeq          109
	//*  13   19:new             #93  <Class ArrayList>
	//*  14   22:dup             
	//*  15   23:invokespecial   #94  <Method void ArrayList()>
	//*  16   26:astore          5
	//*  17   28:aload_0         
	//*  18   29:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
	//*  19   32:istore          4
	//*  20   34:iconst_0        
	//*  21   35:istore_2        
	//*  22   36:iconst_0        
	//*  23   37:istore_1        
	//*  24   38:iload_1         
	//*  25   39:iload           4
	//*  26   41:bipush          31
	//*  27   43:iand            
	//*  28   44:icmpge          66
	//*  29   47:aload           5
	//*  30   49:aload_0         
	//*  31   50:invokestatic    #100 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//*  32   53:invokeinterface #106 <Method boolean List.add(Object)>
	//*  33   58:pop             
	//*  34   59:iload_1         
	//*  35   60:iconst_1        
	//*  36   61:iadd            
	//*  37   62:istore_1        
	//*  38   63:goto            38
	//*  39   66:aload_0         
	//*  40   67:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
	//*  41   70:istore          4
	//*  42   72:iload_2         
	//*  43   73:istore_1        
	//*  44   74:iload_1         
	//*  45   75:iload           4
	//*  46   77:icmpge          99
	//*  47   80:aload           5
	//*  48   82:aload_0         
	//*  49   83:invokestatic    #100 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//*  50   86:invokeinterface #106 <Method boolean List.add(Object)>
	//*  51   91:pop             
	//*  52   92:iload_1         
	//*  53   93:iconst_1        
	//*  54   94:iadd            
	//*  55   95:istore_1        
	//*  56   96:goto            74
	//*  57   99:aload           5
	//*  58  101:iload_3         
	//*  59  102:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//*  60  105:invokestatic    #118 <Method Pair Pair.create(Object, Object)>
	//*  61  108:areturn         
	//*  62  109:new             #79  <Class ParserException>
	//*  63  112:dup             
	//*  64  113:invokespecial   #119 <Method void ParserException()>
	//*  65  116:athrow          
	//*  66  117:new             #79  <Class ParserException>
	//*  67  120:dup             
	//*  68  121:ldc1            #121 <String "Error parsing AVC codec private">
	//*  69  123:invokespecial   #124 <Method void ParserException(String)>
	//*  70  126:athrow          
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			throw new ParserException("Error parsing AVC codec private");
		}
		if(j == 3)
			break MISSING_BLOCK_LABEL_109;
		arraylist = new ArrayList();
		k = parsablebytearray.readUnsignedByte();
		flag = false;
		i = 0;
_L2:
		if(i >= (k & 0x1f))
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		k = parsablebytearray.readUnsignedByte();
		i = ((int) (flag));
_L4:
		if(i >= k)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		return Pair.create(((Object) (arraylist)), ((Object) (Integer.valueOf(j))));
		throw new ParserException();
	//*  71  127:astore_0        
	//*  72  128:goto            117
	}

	private static List parseFourCcVc1Private(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i;
		long l;
		try
		{
			parsablebytearray.skipBytes(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
			l = parsablebytearray.readLittleEndianUnsignedInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #136 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//    5   10:lstore_2        
		}
	//*   6   11:lload_2         
	//*   7   12:ldc2w           #137 <Long 0x31435657L>
	//*   8   15:lcmp            
	//*   9   16:ifne            94
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
	//*  12   23:bipush          20
	//*  13   25:iadd            
	//*  14   26:istore_1        
	//*  15   27:aload_0         
	//*  16   28:getfield        #144 <Field byte[] ParsableByteArray.data>
	//*  17   31:astore_0        
	//*  18   32:iload_1         
	//*  19   33:aload_0         
	//*  20   34:arraylength     
	//*  21   35:iconst_4        
	//*  22   36:isub            
	//*  23   37:icmpge          84
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:baload          
	//*  27   43:ifne            141
	//*  28   46:aload_0         
	//*  29   47:iload_1         
	//*  30   48:iconst_1        
	//*  31   49:iadd            
	//*  32   50:baload          
	//*  33   51:ifne            141
	//*  34   54:aload_0         
	//*  35   55:iload_1         
	//*  36   56:iconst_2        
	//*  37   57:iadd            
	//*  38   58:baload          
	//*  39   59:iconst_1        
	//*  40   60:icmpne          141
	//*  41   63:aload_0         
	//*  42   64:iload_1         
	//*  43   65:iconst_3        
	//*  44   66:iadd            
	//*  45   67:baload          
	//*  46   68:bipush          15
	//*  47   70:icmpne          141
	//*  48   73:aload_0         
	//*  49   74:iload_1         
	//*  50   75:aload_0         
	//*  51   76:arraylength     
	//*  52   77:invokestatic    #150 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//*  53   80:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//*  54   83:areturn         
	//*  55   84:new             #79  <Class ParserException>
	//*  56   87:dup             
	//*  57   88:ldc1            #158 <String "Failed to find FourCC VC1 initialization data">
	//*  58   90:invokespecial   #124 <Method void ParserException(String)>
	//*  59   93:athrow          
	//*  60   94:new             #160 <Class StringBuilder>
	//*  61   97:dup             
	//*  62   98:invokespecial   #161 <Method void StringBuilder()>
	//*  63  101:astore_0        
	//*  64  102:aload_0         
	//*  65  103:ldc1            #163 <String "Unsupported FourCC compression type: ">
	//*  66  105:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//*  67  108:pop             
	//*  68  109:aload_0         
	//*  69  110:lload_2         
	//*  70  111:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
	//*  71  114:pop             
	//*  72  115:new             #79  <Class ParserException>
	//*  73  118:dup             
	//*  74  119:aload_0         
	//*  75  120:invokevirtual   #174 <Method String StringBuilder.toString()>
	//*  76  123:invokespecial   #124 <Method void ParserException(String)>
	//*  77  126:athrow          
	//*  78  127:new             #79  <Class ParserException>
	//*  79  130:dup             
	//*  80  131:ldc1            #176 <String "Error parsing FourCC VC1 codec private">
	//*  81  133:invokespecial   #124 <Method void ParserException(String)>
	//*  82  136:athrow          
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			throw new ParserException("Error parsing FourCC VC1 codec private");
		}
		if(l != 0x31435657L) goto _L2; else goto _L1
_L1:
		i = parsablebytearray.getPosition() + 20;
		parsablebytearray = ((ParsableByteArray) (parsablebytearray.data));
_L5:
		if(i >= parsablebytearray.length - 4) goto _L4; else goto _L3
_L3:
		if(parsablebytearray[i] != 0 || parsablebytearray[i + 1] != 0 || parsablebytearray[i + 2] != 1 || parsablebytearray[i + 3] != 15)
			break MISSING_BLOCK_LABEL_141;
		return Collections.singletonList(((Object) (Arrays.copyOfRange(((byte []) (parsablebytearray)), i, parsablebytearray.length))));
_L4:
		throw new ParserException("Failed to find FourCC VC1 initialization data");
_L2:
		parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
		((StringBuilder) (parsablebytearray)).append("Unsupported FourCC compression type: ");
		((StringBuilder) (parsablebytearray)).append(l);
		throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//*  83  137:astore_0        
	//*  84  138:goto            127
		i++;
	//   85  141:iload_1         
	//   86  142:iconst_1        
	//   87  143:iadd            
	//   88  144:istore_1        
		  goto _L5
	//*  89  145:goto            32
	}

	private static Pair parseHevcCodecPrivate(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		byte abyte0[];
		try
		{
			parsablebytearray.setPosition(21);
	//    0    0:aload_0         
	//    1    1:bipush          21
	//    2    3:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
			i1 = parsablebytearray.readUnsignedByte();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
	//    5   10:istore          5
			j1 = parsablebytearray.readUnsignedByte();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
	//    8   16:istore          6
			l = parsablebytearray.getPosition();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
	//   11   22:istore          4
		}
	//*  12   24:iconst_0        
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:istore_1        
	//*  16   28:iload_2         
	//*  17   29:iload           6
	//*  18   31:icmpge          79
	//*  19   34:aload_0         
	//*  20   35:iconst_1        
	//*  21   36:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
	//*  22   39:aload_0         
	//*  23   40:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
	//*  24   43:istore          7
	//*  25   45:iconst_0        
	//*  26   46:istore_3        
	//*  27   47:iload_3         
	//*  28   48:iload           7
	//*  29   50:icmpge          220
	//*  30   53:aload_0         
	//*  31   54:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
	//*  32   57:istore          8
	//*  33   59:iload_1         
	//*  34   60:iload           8
	//*  35   62:iconst_4        
	//*  36   63:iadd            
	//*  37   64:iadd            
	//*  38   65:istore_1        
	//*  39   66:aload_0         
	//*  40   67:iload           8
	//*  41   69:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
	//*  42   72:iload_3         
	//*  43   73:iconst_1        
	//*  44   74:iadd            
	//*  45   75:istore_3        
	//*  46   76:goto            47
	//*  47   79:aload_0         
	//*  48   80:iload           4
	//*  49   82:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
	//*  50   85:iload_1         
	//*  51   86:newarray        byte[]
	//*  52   88:astore          9
	//*  53   90:iconst_0        
	//*  54   91:istore_3        
	//*  55   92:iload_3         
	//*  56   93:istore_2        
	//*  57   94:iload_3         
	//*  58   95:iload           6
	//*  59   97:icmpge          234
	//*  60  100:aload_0         
	//*  61  101:iconst_1        
	//*  62  102:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
	//*  63  105:aload_0         
	//*  64  106:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
	//*  65  109:istore          7
	//*  66  111:iconst_0        
	//*  67  112:istore          4
	//*  68  114:iload           4
	//*  69  116:iload           7
	//*  70  118:icmpge          227
	//*  71  121:aload_0         
	//*  72  122:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
	//*  73  125:istore          8
	//*  74  127:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  75  130:iconst_0        
	//*  76  131:aload           9
	//*  77  133:iload_2         
	//*  78  134:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  79  137:arraylength     
	//*  80  138:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  81  141:iload_2         
	//*  82  142:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  83  145:arraylength     
	//*  84  146:iadd            
	//*  85  147:istore_2        
	//*  86  148:aload_0         
	//*  87  149:getfield        #144 <Field byte[] ParsableByteArray.data>
	//*  88  152:aload_0         
	//*  89  153:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
	//*  90  156:aload           9
	//*  91  158:iload_2         
	//*  92  159:iload           8
	//*  93  161:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  94  164:iload_2         
	//*  95  165:iload           8
	//*  96  167:iadd            
	//*  97  168:istore_2        
	//*  98  169:aload_0         
	//*  99  170:iload           8
	//* 100  172:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
	//* 101  175:iload           4
	//* 102  177:iconst_1        
	//* 103  178:iadd            
	//* 104  179:istore          4
	//* 105  181:goto            114
	//* 106  184:aload           9
	//* 107  186:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//* 108  189:astore_0        
	//* 109  190:aload_0         
	//* 110  191:iload           5
	//* 111  193:iconst_3        
	//* 112  194:iand            
	//* 113  195:iconst_1        
	//* 114  196:iadd            
	//* 115  197:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//* 116  200:invokestatic    #118 <Method Pair Pair.create(Object, Object)>
	//* 117  203:astore_0        
	//* 118  204:aload_0         
	//* 119  205:areturn         
	//* 120  206:new             #79  <Class ParserException>
	//* 121  209:dup             
	//* 122  210:ldc1            #192 <String "Error parsing HEVC codec private">
	//* 123  212:invokespecial   #124 <Method void ParserException(String)>
	//* 124  215:athrow          
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			throw new ParserException("Error parsing HEVC codec private");
		}
		j = 0;
		i = j;
_L9:
		if(j >= j1) goto _L2; else goto _L1
_L1:
		parsablebytearray.skipBytes(1);
		k1 = parsablebytearray.readUnsignedShort();
		k = 0;
_L4:
		if(k >= k1)
			break; /* Loop/switch isn't completed */
		l1 = parsablebytearray.readUnsignedShort();
		i += l1 + 4;
		parsablebytearray.skipBytes(l1);
		k++;
		if(true) goto _L4; else goto _L3
_L2:
		parsablebytearray.setPosition(l);
		abyte0 = new byte[i];
		k = 0;
		j = k;
_L10:
		if(k >= j1) goto _L6; else goto _L5
_L5:
		parsablebytearray.skipBytes(1);
		k1 = parsablebytearray.readUnsignedShort();
		l = 0;
_L8:
		if(l >= k1)
			continue; /* Loop/switch isn't completed */
		l1 = parsablebytearray.readUnsignedShort();
		System.arraycopy(((Object) (NalUnitUtil.NAL_START_CODE)), 0, ((Object) (abyte0)), j, NalUnitUtil.NAL_START_CODE.length);
		j += NalUnitUtil.NAL_START_CODE.length;
		System.arraycopy(((Object) (parsablebytearray.data)), parsablebytearray.getPosition(), ((Object) (abyte0)), j, l1);
		j += l1;
		parsablebytearray.skipBytes(l1);
		l++;
		if(true) goto _L8; else goto _L7
_L7:
		continue; /* Loop/switch isn't completed */
_L12:
		parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (abyte0)))));
_L13:
		parsablebytearray = ((ParsableByteArray) (Pair.create(((Object) (parsablebytearray)), ((Object) (Integer.valueOf((i1 & 3) + 1))))));
		return ((Pair) (parsablebytearray));
	//* 125  216:astore_0        
	//* 126  217:goto            206
_L3:
		j++;
	//  127  220:iload_2         
	//  128  221:iconst_1        
	//  129  222:iadd            
	//  130  223:istore_2        
		  goto _L9
	//* 131  224:goto            28
		k++;
	//  132  227:iload_3         
	//  133  228:iconst_1        
	//  134  229:iadd            
	//  135  230:istore_3        
		  goto _L10
	//* 136  231:goto            94
_L6:
		if(i != 0) goto _L12; else goto _L11
	//  137  234:iload_1         
	//  138  235:ifne            184
_L11:
		parsablebytearray = null;
	//  139  238:aconst_null     
	//  140  239:astore_0        
		  goto _L13
	//* 141  240:goto            190
	}

	private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i;
		long l;
		long l1;
		try
		{
			i = parsablebytearray.readLittleEndianUnsignedShort();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          12
	//*   6   10:iconst_1        
	//*   7   11:ireturn         
	//*   8   12:iload_1         
	//*   9   13:ldc1            #198 <Int 65534>
	//*  10   15:icmpne          62
	//*  11   18:aload_0         
	//*  12   19:bipush          24
	//*  13   21:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #201 <Method long ParsableByteArray.readLong()>
	//*  16   28:invokestatic    #205 <Method UUID WebmExtractor.access$300()>
	//*  17   31:invokevirtual   #210 <Method long UUID.getMostSignificantBits()>
	//*  18   34:lcmp            
	//*  19   35:ifne            60
	//*  20   38:aload_0         
	//*  21   39:invokevirtual   #201 <Method long ParsableByteArray.readLong()>
	//*  22   42:lstore_2        
	//*  23   43:invokestatic    #205 <Method UUID WebmExtractor.access$300()>
	//*  24   46:invokevirtual   #213 <Method long UUID.getLeastSignificantBits()>
	//*  25   49:lstore          4
	//*  26   51:lload_2         
	//*  27   52:lload           4
	//*  28   54:lcmp            
	//*  29   55:ifne            60
	//*  30   58:iconst_1        
	//*  31   59:ireturn         
	//*  32   60:iconst_0        
	//*  33   61:ireturn         
	//*  34   62:iconst_0        
	//*  35   63:ireturn         
	//*  36   64:new             #79  <Class ParserException>
	//*  37   67:dup             
	//*  38   68:ldc1            #215 <String "Error parsing MS/ACM codec private">
	//*  39   70:invokespecial   #124 <Method void ParserException(String)>
	//*  40   73:athrow          
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			throw new ParserException("Error parsing MS/ACM codec private");
		}
		if(i == 1)
			return true;
		if(i != 65534)
			break MISSING_BLOCK_LABEL_62;
		parsablebytearray.setPosition(24);
		if(parsablebytearray.readLong() != WebmExtractor.access$300().getMostSignificantBits())
			break MISSING_BLOCK_LABEL_60;
		l = parsablebytearray.readLong();
		l1 = WebmExtractor.access$300().getLeastSignificantBits();
		if(l == l1)
			return true;
		return false;
		return false;
	//*  41   74:astore_0        
	//*  42   75:goto            64
	}

	private static List parseVorbisCodecPrivate(byte abyte0[])
		throws ParserException
	{
		if(abyte0[0] != 2)
			break MISSING_BLOCK_LABEL_149;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:iconst_2        
	//    4    4:icmpne          149
		int j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		int i;
		int k;
		int i1;
		byte abyte1[];
		byte abyte2[];
		for(i = 1; abyte0[i] == -1; i++)
	//*   7    9:iconst_1        
	//*   8   10:istore_1        
	//*   9   11:goto            173
	//*  10   14:iload_2         
	//*  11   15:iconst_1        
	//*  12   16:iadd            
	//*  13   17:istore_3        
	//*  14   18:aload_0         
	//*  15   19:iload_2         
	//*  16   20:baload          
	//*  17   21:istore_2        
	//*  18   22:aload_0         
	//*  19   23:iload_3         
	//*  20   24:baload          
	//*  21   25:iconst_1        
	//*  22   26:icmpne          139
	//*  23   29:iload           4
	//*  24   31:newarray        byte[]
	//*  25   33:astore          5
	//*  26   35:aload_0         
	//*  27   36:iload_3         
	//*  28   37:aload           5
	//*  29   39:iconst_0        
	//*  30   40:iload           4
	//*  31   42:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  32   45:iload_3         
	//*  33   46:iload           4
	//*  34   48:iadd            
	//*  35   49:istore_3        
	//*  36   50:aload_0         
	//*  37   51:iload_3         
	//*  38   52:baload          
	//*  39   53:iconst_3        
	//*  40   54:icmpne          129
	//*  41   57:iload_3         
	//*  42   58:iload_1         
	//*  43   59:iload_2         
	//*  44   60:iadd            
	//*  45   61:iadd            
	//*  46   62:istore_1        
	//*  47   63:aload_0         
	//*  48   64:iload_1         
	//*  49   65:baload          
	//*  50   66:iconst_5        
	//*  51   67:icmpne          119
	//*  52   70:aload_0         
	//*  53   71:arraylength     
	//*  54   72:iload_1         
	//*  55   73:isub            
	//*  56   74:newarray        byte[]
	//*  57   76:astore          6
	//*  58   78:aload_0         
	//*  59   79:iload_1         
	//*  60   80:aload           6
	//*  61   82:iconst_0        
	//*  62   83:aload_0         
	//*  63   84:arraylength     
	//*  64   85:iload_1         
	//*  65   86:isub            
	//*  66   87:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  67   90:new             #93  <Class ArrayList>
	//*  68   93:dup             
	//*  69   94:iconst_2        
	//*  70   95:invokespecial   #219 <Method void ArrayList(int)>
	//*  71   98:astore_0        
	//*  72   99:aload_0         
	//*  73  100:aload           5
	//*  74  102:invokeinterface #106 <Method boolean List.add(Object)>
	//*  75  107:pop             
	//*  76  108:aload_0         
	//*  77  109:aload           6
	//*  78  111:invokeinterface #106 <Method boolean List.add(Object)>
	//*  79  116:pop             
	//*  80  117:aload_0         
	//*  81  118:areturn         
	//*  82  119:new             #79  <Class ParserException>
	//*  83  122:dup             
	//*  84  123:ldc1            #221 <String "Error parsing vorbis codec private">
	//*  85  125:invokespecial   #124 <Method void ParserException(String)>
	//*  86  128:athrow          
	//*  87  129:new             #79  <Class ParserException>
	//*  88  132:dup             
	//*  89  133:ldc1            #221 <String "Error parsing vorbis codec private">
	//*  90  135:invokespecial   #124 <Method void ParserException(String)>
	//*  91  138:athrow          
	//*  92  139:new             #79  <Class ParserException>
	//*  93  142:dup             
	//*  94  143:ldc1            #221 <String "Error parsing vorbis codec private">
	//*  95  145:invokespecial   #124 <Method void ParserException(String)>
	//*  96  148:athrow          
	//*  97  149:new             #79  <Class ParserException>
	//*  98  152:dup             
	//*  99  153:ldc1            #221 <String "Error parsing vorbis codec private">
	//* 100  155:invokespecial   #124 <Method void ParserException(String)>
	//* 101  158:athrow          
	//* 102  159:new             #79  <Class ParserException>
	//* 103  162:dup             
	//* 104  163:ldc1            #221 <String "Error parsing vorbis codec private">
	//* 105  165:invokespecial   #124 <Method void ParserException(String)>
	//* 106  168:athrow          
	//* 107  169:astore_0        
	//* 108  170:goto            159
	//* 109  173:aload_0         
	//* 110  174:iload_1         
	//* 111  175:baload          
	//* 112  176:iconst_m1       
	//* 113  177:icmpne          193
			j += 255;
	//  114  180:iload_2         
	//  115  181:sipush          255
	//  116  184:iadd            
	//  117  185:istore_2        

	//  118  186:iload_1         
	//  119  187:iconst_1        
	//  120  188:iadd            
	//  121  189:istore_1        
	//* 122  190:goto            173
		int l = i + 1;
	//  123  193:iload_1         
	//  124  194:iconst_1        
	//  125  195:iadd            
	//  126  196:istore_3        
		i1 = j + abyte0[i];
	//  127  197:iload_2         
	//  128  198:aload_0         
	//  129  199:iload_1         
	//  130  200:baload          
	//  131  201:iadd            
	//  132  202:istore          4
		i = 0;
	//  133  204:iconst_0        
	//  134  205:istore_1        
		j = l;
	//  135  206:iload_3         
	//  136  207:istore_2        
		while(abyte0[j] == -1) 
	//* 137  208:aload_0         
	//* 138  209:iload_2         
	//* 139  210:baload          
	//* 140  211:iconst_m1       
	//* 141  212:icmpne          14
		{
			i += 255;
	//  142  215:iload_1         
	//  143  216:sipush          255
	//  144  219:iadd            
	//  145  220:istore_1        
			j++;
	//  146  221:iload_2         
	//  147  222:iconst_1        
	//  148  223:iadd            
	//  149  224:istore_2        
		}
		k = j + 1;
		j = ((int) (abyte0[j]));
		if(abyte0[k] != 1)
			break MISSING_BLOCK_LABEL_139;
		try
		{
			abyte1 = new byte[i1];
			System.arraycopy(((Object) (abyte0)), k, ((Object) (abyte1)), 0, i1);
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new ParserException("Error parsing vorbis codec private");
		}
		k += i1;
		if(abyte0[k] != 3)
			break MISSING_BLOCK_LABEL_129;
		i = k + (i + j);
		if(abyte0[i] != 5)
			break MISSING_BLOCK_LABEL_119;
		abyte2 = new byte[abyte0.length - i];
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), 0, abyte0.length - i);
		abyte0 = ((byte []) (new ArrayList(2)));
		((List) (abyte0)).add(((Object) (abyte1)));
		((List) (abyte0)).add(((Object) (abyte2)));
		return ((List) (abyte0));
		throw new ParserException("Error parsing vorbis codec private");
		throw new ParserException("Error parsing vorbis codec private");
		throw new ParserException("Error parsing vorbis codec private");
		throw new ParserException("Error parsing vorbis codec private");
	//* 150  225:goto            208
	}

	public void initializeOutput(ExtractorOutput extractoroutput, int i, long l)
		throws ParserException
	{
		Object obj;
label0:
		{
			Object obj1;
label1:
			{
				float f;
				char c;
label2:
				{
label3:
					{
						String s = codecId;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field String codecId>
	//    2    4:astore          9
						switch(s.hashCode())
	//*   3    6:aload           9
	//*   4    8:invokevirtual   #231 <Method int String.hashCode()>
						{
						default:
							break;

	//*   5   11:lookupswitch    25: default 220
	//	               -2095576542: 640
	//	               -2095575984: 623
	//	               -1985379776: 605
	//	               -1784763192: 587
	//	               -1730367663: 569
	//	               -1482641357: 551
	//	               -1373388978: 533
	//	               -538363189: 516
	//	               -538363109: 498
	//	               -425012669: 480
	//	               -356037306: 462
	//	               62923557: 444
	//	               62923603: 426
	//	               62927045: 408
	//	               82338133: 391
	//	               82338134: 375
	//	               99146302: 358
	//	               542569478: 341
	//	               725957860: 324
	//	               855502857: 307
	//	               1422270023: 290
	//	               1809237540: 274
	//	               1950749482: 257
	//	               1950789798: 240
	//	               1951062397: 223
	//*   6  220:goto            657
						case 1951062397: 
							if(s.equals("A_OPUS"))
	//*   7  223:aload           9
	//*   8  225:ldc1            #233 <String "A_OPUS">
	//*   9  227:invokevirtual   #236 <Method boolean String.equals(Object)>
	//*  10  230:ifeq            657
							{
								c = '\n';
	//   11  233:bipush          10
	//   12  235:istore          6
								break label3;
	//   13  237:goto            660
							}
							break;

						case 1950789798: 
							if(!s.equals("A_FLAC"))
								break;
	//   14  240:aload           9
	//   15  242:ldc1            #238 <String "A_FLAC">
	//   16  244:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   17  247:ifeq            657
							c = '\023';
	//   18  250:bipush          19
	//   19  252:istore          6
							break label3;
	//   20  254:goto            660

						case 1950749482: 
							if(!s.equals("A_EAC3"))
								break;
	//   21  257:aload           9
	//   22  259:ldc1            #240 <String "A_EAC3">
	//   23  261:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   24  264:ifeq            657
							c = '\016';
	//   25  267:bipush          14
	//   26  269:istore          6
							break label3;
	//   27  271:goto            660

						case 1809237540: 
							if(!s.equals("V_MPEG2"))
								break;
	//   28  274:aload           9
	//   29  276:ldc1            #242 <String "V_MPEG2">
	//   30  278:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   31  281:ifeq            657
							c = '\002';
	//   32  284:iconst_2        
	//   33  285:istore          6
							break label3;
	//   34  287:goto            660

						case 1422270023: 
							if(!s.equals("S_TEXT/UTF8"))
								break;
	//   35  290:aload           9
	//   36  292:ldc1            #244 <String "S_TEXT/UTF8">
	//   37  294:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   38  297:ifeq            657
							c = '\026';
	//   39  300:bipush          22
	//   40  302:istore          6
							break label3;
	//   41  304:goto            660

						case 855502857: 
							if(!s.equals("V_MPEGH/ISO/HEVC"))
								break;
	//   42  307:aload           9
	//   43  309:ldc1            #246 <String "V_MPEGH/ISO/HEVC">
	//   44  311:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   45  314:ifeq            657
							c = '\007';
	//   46  317:bipush          7
	//   47  319:istore          6
							break label3;
	//   48  321:goto            660

						case 725957860: 
							if(!s.equals("A_PCM/INT/LIT"))
								break;
	//   49  324:aload           9
	//   50  326:ldc1            #248 <String "A_PCM/INT/LIT">
	//   51  328:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   52  331:ifeq            657
							c = '\025';
	//   53  334:bipush          21
	//   54  336:istore          6
							break label3;
	//   55  338:goto            660

						case 542569478: 
							if(!s.equals("A_DTS/EXPRESS"))
								break;
	//   56  341:aload           9
	//   57  343:ldc1            #250 <String "A_DTS/EXPRESS">
	//   58  345:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   59  348:ifeq            657
							c = '\021';
	//   60  351:bipush          17
	//   61  353:istore          6
							break label3;
	//   62  355:goto            660

						case 99146302: 
							if(!s.equals("S_HDMV/PGS"))
								break;
	//   63  358:aload           9
	//   64  360:ldc1            #252 <String "S_HDMV/PGS">
	//   65  362:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   66  365:ifeq            657
							c = '\030';
	//   67  368:bipush          24
	//   68  370:istore          6
							break label3;
	//   69  372:goto            660

						case 82338134: 
							if(!s.equals("V_VP9"))
								break;
	//   70  375:aload           9
	//   71  377:ldc1            #254 <String "V_VP9">
	//   72  379:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   73  382:ifeq            657
							c = '\001';
	//   74  385:iconst_1        
	//   75  386:istore          6
							break label3;
	//   76  388:goto            660

						case 82338133: 
							if(!s.equals("V_VP8"))
								break;
	//   77  391:aload           9
	//   78  393:ldc2            #256 <String "V_VP8">
	//   79  396:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   80  399:ifeq            657
							c = '\0';
	//   81  402:iconst_0        
	//   82  403:istore          6
							break label3;
	//   83  405:goto            660

						case 62927045: 
							if(!s.equals("A_DTS"))
								break;
	//   84  408:aload           9
	//   85  410:ldc2            #258 <String "A_DTS">
	//   86  413:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   87  416:ifeq            657
							c = '\020';
	//   88  419:bipush          16
	//   89  421:istore          6
							break label3;
	//   90  423:goto            660

						case 62923603: 
							if(!s.equals("A_AC3"))
								break;
	//   91  426:aload           9
	//   92  428:ldc2            #260 <String "A_AC3">
	//   93  431:invokevirtual   #236 <Method boolean String.equals(Object)>
	//   94  434:ifeq            657
							c = '\r';
	//   95  437:bipush          13
	//   96  439:istore          6
							break label3;
	//   97  441:goto            660

						case 62923557: 
							if(!s.equals("A_AAC"))
								break;
	//   98  444:aload           9
	//   99  446:ldc2            #262 <String "A_AAC">
	//  100  449:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  101  452:ifeq            657
							c = '\013';
	//  102  455:bipush          11
	//  103  457:istore          6
							break label3;
	//  104  459:goto            660

						case -356037306: 
							if(!s.equals("A_DTS/LOSSLESS"))
								break;
	//  105  462:aload           9
	//  106  464:ldc2            #264 <String "A_DTS/LOSSLESS">
	//  107  467:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  108  470:ifeq            657
							c = '\022';
	//  109  473:bipush          18
	//  110  475:istore          6
							break label3;
	//  111  477:goto            660

						case -425012669: 
							if(!s.equals("S_VOBSUB"))
								break;
	//  112  480:aload           9
	//  113  482:ldc2            #266 <String "S_VOBSUB">
	//  114  485:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  115  488:ifeq            657
							c = '\027';
	//  116  491:bipush          23
	//  117  493:istore          6
							break label3;
	//  118  495:goto            660

						case -538363109: 
							if(!s.equals("V_MPEG4/ISO/AVC"))
								break;
	//  119  498:aload           9
	//  120  500:ldc2            #268 <String "V_MPEG4/ISO/AVC">
	//  121  503:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  122  506:ifeq            657
							c = '\006';
	//  123  509:bipush          6
	//  124  511:istore          6
							break label3;
	//  125  513:goto            660

						case -538363189: 
							if(!s.equals("V_MPEG4/ISO/ASP"))
								break;
	//  126  516:aload           9
	//  127  518:ldc2            #270 <String "V_MPEG4/ISO/ASP">
	//  128  521:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  129  524:ifeq            657
							c = '\004';
	//  130  527:iconst_4        
	//  131  528:istore          6
							break label3;
	//  132  530:goto            660

						case -1373388978: 
							if(!s.equals("V_MS/VFW/FOURCC"))
								break;
	//  133  533:aload           9
	//  134  535:ldc2            #272 <String "V_MS/VFW/FOURCC">
	//  135  538:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  136  541:ifeq            657
							c = '\b';
	//  137  544:bipush          8
	//  138  546:istore          6
							break label3;
	//  139  548:goto            660

						case -1482641357: 
							if(!s.equals("A_MPEG/L3"))
								break;
	//  140  551:aload           9
	//  141  553:ldc2            #274 <String "A_MPEG/L3">
	//  142  556:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  143  559:ifeq            657
							c = '\f';
	//  144  562:bipush          12
	//  145  564:istore          6
							break label3;
	//  146  566:goto            660

						case -1730367663: 
							if(!s.equals("A_VORBIS"))
								break;
	//  147  569:aload           9
	//  148  571:ldc2            #276 <String "A_VORBIS">
	//  149  574:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  150  577:ifeq            657
							c = '\t';
	//  151  580:bipush          9
	//  152  582:istore          6
							break label3;
	//  153  584:goto            660

						case -1784763192: 
							if(!s.equals("A_TRUEHD"))
								break;
	//  154  587:aload           9
	//  155  589:ldc2            #278 <String "A_TRUEHD">
	//  156  592:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  157  595:ifeq            657
							c = '\017';
	//  158  598:bipush          15
	//  159  600:istore          6
							break label3;
	//  160  602:goto            660

						case -1985379776: 
							if(!s.equals("A_MS/ACM"))
								break;
	//  161  605:aload           9
	//  162  607:ldc2            #280 <String "A_MS/ACM">
	//  163  610:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  164  613:ifeq            657
							c = '\024';
	//  165  616:bipush          20
	//  166  618:istore          6
							break label3;
	//  167  620:goto            660

						case -2095575984: 
							if(!s.equals("V_MPEG4/ISO/SP"))
								break;
	//  168  623:aload           9
	//  169  625:ldc2            #282 <String "V_MPEG4/ISO/SP">
	//  170  628:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  171  631:ifeq            657
							c = '\003';
	//  172  634:iconst_3        
	//  173  635:istore          6
							break label3;
	//  174  637:goto            660

						case -2095576542: 
							if(!s.equals("V_MPEG4/ISO/AP"))
								break;
	//  175  640:aload           9
	//  176  642:ldc2            #284 <String "V_MPEG4/ISO/AP">
	//  177  645:invokevirtual   #236 <Method boolean String.equals(Object)>
	//  178  648:ifeq            657
							c = '\005';
	//  179  651:iconst_5        
	//  180  652:istore          6
							break label3;
	//  181  654:goto            660
						}
						c = '\uFFFF';
	//  182  657:iconst_m1       
	//  183  658:istore          6
					}
					obj1 = null;
	//  184  660:aconst_null     
	//  185  661:astore          10
					obj = null;
	//  186  663:aconst_null     
	//  187  664:astore          9
					int j;
					switch(c)
	//* 188  666:iload           6
					{
	//* 189  668:tableswitch     0 24: default 784
	//	               0 1474
	//	               1 1459
	//	               2 1444
	//	               3 1404
	//	               4 1404
	//	               5 1404
	//	               6 1348
	//	               7 1292
	//	               8 1261
	//	               9 1236
	//	               10 1140
	//	               11 1116
	//	               12 1100
	//	               13 1085
	//	               14 1070
	//	               15 1055
	//	               16 1040
	//	               17 1040
	//	               18 1025
	//	               19 1001
	//	               20 911
	//	               21 849
	//	               22 834
	//	               23 810
	//	               24 795
					default:
						throw new ParserException("Unrecognized codec identifier.");
	//  190  784:new             #79  <Class ParserException>
	//  191  787:dup             
	//  192  788:ldc2            #286 <String "Unrecognized codec identifier.">
	//  193  791:invokespecial   #124 <Method void ParserException(String)>
	//  194  794:athrow          

					case 24: // '\030'
						obj = "application/pgs";
	//  195  795:ldc2            #288 <String "application/pgs">
	//  196  798:astore          9
						c = '\uFFFF';
	//  197  800:iconst_m1       
	//  198  801:istore          6
						j = ((int) (c));
	//  199  803:iload           6
	//  200  805:istore          7
						break;

	//* 201  807:goto            1486
					case 23: // '\027'
						obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
	//  202  810:aload_0         
	//  203  811:getfield        #290 <Field byte[] codecPrivate>
	//  204  814:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//  205  817:astore          10
						obj = "application/vobsub";
	//  206  819:ldc2            #292 <String "application/vobsub">
	//  207  822:astore          9
						c = '\uFFFF';
	//  208  824:iconst_m1       
	//  209  825:istore          6
						j = ((int) (c));
	//  210  827:iload           6
	//  211  829:istore          7
						break;

	//* 212  831:goto            1486
					case 22: // '\026'
						obj = "application/x-subrip";
	//  213  834:ldc2            #294 <String "application/x-subrip">
	//  214  837:astore          9
						c = '\uFFFF';
	//  215  839:iconst_m1       
	//  216  840:istore          6
						j = ((int) (c));
	//  217  842:iload           6
	//  218  844:istore          7
						break;

	//* 219  846:goto            1486
					case 21: // '\025'
						j = Util.getPcmEncoding(audioBitDepth);
	//  220  849:aload_0         
	//  221  850:getfield        #60  <Field int audioBitDepth>
	//  222  853:invokestatic    #300 <Method int Util.getPcmEncoding(int)>
	//  223  856:istore          7
						if(j != 0)
	//* 224  858:iload           7
	//* 225  860:ifeq            874
						{
							obj = "audio/raw";
	//  226  863:ldc2            #302 <String "audio/raw">
	//  227  866:astore          9
							c = '\uFFFF';
	//  228  868:iconst_m1       
	//  229  869:istore          6
						} else
	//* 230  871:goto            1486
						{
							extractoroutput = ((ExtractorOutput) (new StringBuilder()));
	//  231  874:new             #160 <Class StringBuilder>
	//  232  877:dup             
	//  233  878:invokespecial   #161 <Method void StringBuilder()>
	//  234  881:astore_1        
							((StringBuilder) (extractoroutput)).append("Unsupported PCM bit depth: ");
	//  235  882:aload_1         
	//  236  883:ldc2            #304 <String "Unsupported PCM bit depth: ">
	//  237  886:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  238  889:pop             
							((StringBuilder) (extractoroutput)).append(audioBitDepth);
	//  239  890:aload_1         
	//  240  891:aload_0         
	//  241  892:getfield        #60  <Field int audioBitDepth>
	//  242  895:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//  243  898:pop             
							throw new ParserException(((StringBuilder) (extractoroutput)).toString());
	//  244  899:new             #79  <Class ParserException>
	//  245  902:dup             
	//  246  903:aload_1         
	//  247  904:invokevirtual   #174 <Method String StringBuilder.toString()>
	//  248  907:invokespecial   #124 <Method void ParserException(String)>
	//  249  910:athrow          
						}
						break;

					case 20: // '\024'
						if(parseMsAcmCodecPrivate(new ParsableByteArray(codecPrivate)))
	//* 250  911:new             #83  <Class ParsableByteArray>
	//* 251  914:dup             
	//* 252  915:aload_0         
	//* 253  916:getfield        #290 <Field byte[] codecPrivate>
	//* 254  919:invokespecial   #310 <Method void ParsableByteArray(byte[])>
	//* 255  922:invokestatic    #312 <Method boolean parseMsAcmCodecPrivate(ParsableByteArray)>
	//* 256  925:ifeq            990
						{
							j = Util.getPcmEncoding(audioBitDepth);
	//  257  928:aload_0         
	//  258  929:getfield        #60  <Field int audioBitDepth>
	//  259  932:invokestatic    #300 <Method int Util.getPcmEncoding(int)>
	//  260  935:istore          7
							if(j != 0)
	//* 261  937:iload           7
	//* 262  939:ifeq            953
							{
								obj = "audio/raw";
	//  263  942:ldc2            #302 <String "audio/raw">
	//  264  945:astore          9
								c = '\uFFFF';
	//  265  947:iconst_m1       
	//  266  948:istore          6
							} else
	//* 267  950:goto            1486
							{
								extractoroutput = ((ExtractorOutput) (new StringBuilder()));
	//  268  953:new             #160 <Class StringBuilder>
	//  269  956:dup             
	//  270  957:invokespecial   #161 <Method void StringBuilder()>
	//  271  960:astore_1        
								((StringBuilder) (extractoroutput)).append("Unsupported PCM bit depth: ");
	//  272  961:aload_1         
	//  273  962:ldc2            #304 <String "Unsupported PCM bit depth: ">
	//  274  965:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  275  968:pop             
								((StringBuilder) (extractoroutput)).append(audioBitDepth);
	//  276  969:aload_1         
	//  277  970:aload_0         
	//  278  971:getfield        #60  <Field int audioBitDepth>
	//  279  974:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//  280  977:pop             
								throw new ParserException(((StringBuilder) (extractoroutput)).toString());
	//  281  978:new             #79  <Class ParserException>
	//  282  981:dup             
	//  283  982:aload_1         
	//  284  983:invokevirtual   #174 <Method String StringBuilder.toString()>
	//  285  986:invokespecial   #124 <Method void ParserException(String)>
	//  286  989:athrow          
							}
						} else
						{
							throw new ParserException("Non-PCM MS/ACM is unsupported");
	//  287  990:new             #79  <Class ParserException>
	//  288  993:dup             
	//  289  994:ldc2            #314 <String "Non-PCM MS/ACM is unsupported">
	//  290  997:invokespecial   #124 <Method void ParserException(String)>
	//  291 1000:athrow          
						}
						break;

					case 19: // '\023'
						obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
	//  292 1001:aload_0         
	//  293 1002:getfield        #290 <Field byte[] codecPrivate>
	//  294 1005:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//  295 1008:astore          10
						obj = "audio/x-flac";
	//  296 1010:ldc2            #316 <String "audio/x-flac">
	//  297 1013:astore          9
						c = '\uFFFF';
	//  298 1015:iconst_m1       
	//  299 1016:istore          6
						j = ((int) (c));
	//  300 1018:iload           6
	//  301 1020:istore          7
						break;

	//* 302 1022:goto            1486
					case 18: // '\022'
						obj = "audio/vnd.dts.hd";
	//  303 1025:ldc2            #318 <String "audio/vnd.dts.hd">
	//  304 1028:astore          9
						c = '\uFFFF';
	//  305 1030:iconst_m1       
	//  306 1031:istore          6
						j = ((int) (c));
	//  307 1033:iload           6
	//  308 1035:istore          7
						break;

	//* 309 1037:goto            1486
					case 16: // '\020'
					case 17: // '\021'
						obj = "audio/vnd.dts";
	//  310 1040:ldc2            #320 <String "audio/vnd.dts">
	//  311 1043:astore          9
						c = '\uFFFF';
	//  312 1045:iconst_m1       
	//  313 1046:istore          6
						j = ((int) (c));
	//  314 1048:iload           6
	//  315 1050:istore          7
						break;

	//* 316 1052:goto            1486
					case 15: // '\017'
						obj = "audio/true-hd";
	//  317 1055:ldc2            #322 <String "audio/true-hd">
	//  318 1058:astore          9
						c = '\uFFFF';
	//  319 1060:iconst_m1       
	//  320 1061:istore          6
						j = ((int) (c));
	//  321 1063:iload           6
	//  322 1065:istore          7
						break;

	//* 323 1067:goto            1486
					case 14: // '\016'
						obj = "audio/eac3";
	//  324 1070:ldc2            #324 <String "audio/eac3">
	//  325 1073:astore          9
						c = '\uFFFF';
	//  326 1075:iconst_m1       
	//  327 1076:istore          6
						j = ((int) (c));
	//  328 1078:iload           6
	//  329 1080:istore          7
						break;

	//* 330 1082:goto            1486
					case 13: // '\r'
						obj = "audio/ac3";
	//  331 1085:ldc2            #326 <String "audio/ac3">
	//  332 1088:astore          9
						c = '\uFFFF';
	//  333 1090:iconst_m1       
	//  334 1091:istore          6
						j = ((int) (c));
	//  335 1093:iload           6
	//  336 1095:istore          7
						break;

	//* 337 1097:goto            1486
					case 12: // '\f'
						obj = "audio/mpeg";
	//  338 1100:ldc2            #328 <String "audio/mpeg">
	//  339 1103:astore          9
						c = '\u1000';
	//  340 1105:sipush          4096
	//  341 1108:istore          6
						j = -1;
	//  342 1110:iconst_m1       
	//  343 1111:istore          7
						break;

	//* 344 1113:goto            1486
					case 11: // '\013'
						obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
	//  345 1116:aload_0         
	//  346 1117:getfield        #290 <Field byte[] codecPrivate>
	//  347 1120:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//  348 1123:astore          10
						obj = "audio/mp4a-latm";
	//  349 1125:ldc2            #330 <String "audio/mp4a-latm">
	//  350 1128:astore          9
						c = '\uFFFF';
	//  351 1130:iconst_m1       
	//  352 1131:istore          6
						j = ((int) (c));
	//  353 1133:iload           6
	//  354 1135:istore          7
						break;

	//* 355 1137:goto            1486
					case 10: // '\n'
						obj1 = ((Object) (new ArrayList(3)));
	//  356 1140:new             #93  <Class ArrayList>
	//  357 1143:dup             
	//  358 1144:iconst_3        
	//  359 1145:invokespecial   #219 <Method void ArrayList(int)>
	//  360 1148:astore          10
						((List) (obj1)).add(((Object) (codecPrivate)));
	//  361 1150:aload           10
	//  362 1152:aload_0         
	//  363 1153:getfield        #290 <Field byte[] codecPrivate>
	//  364 1156:invokeinterface #106 <Method boolean List.add(Object)>
	//  365 1161:pop             
						((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(codecDelayNs).array())));
	//  366 1162:aload           10
	//  367 1164:bipush          8
	//  368 1166:invokestatic    #336 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  369 1169:invokestatic    #342 <Method ByteOrder ByteOrder.nativeOrder()>
	//  370 1172:invokevirtual   #346 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  371 1175:aload_0         
	//  372 1176:getfield        #64  <Field long codecDelayNs>
	//  373 1179:invokevirtual   #350 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  374 1182:invokevirtual   #354 <Method byte[] ByteBuffer.array()>
	//  375 1185:invokeinterface #106 <Method boolean List.add(Object)>
	//  376 1190:pop             
						((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(seekPreRollNs).array())));
	//  377 1191:aload           10
	//  378 1193:bipush          8
	//  379 1195:invokestatic    #336 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  380 1198:invokestatic    #342 <Method ByteOrder ByteOrder.nativeOrder()>
	//  381 1201:invokevirtual   #346 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  382 1204:aload_0         
	//  383 1205:getfield        #66  <Field long seekPreRollNs>
	//  384 1208:invokevirtual   #350 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  385 1211:invokevirtual   #354 <Method byte[] ByteBuffer.array()>
	//  386 1214:invokeinterface #106 <Method boolean List.add(Object)>
	//  387 1219:pop             
						obj = "audio/opus";
	//  388 1220:ldc2            #356 <String "audio/opus">
	//  389 1223:astore          9
						c = '\u1680';
	//  390 1225:sipush          5760
	//  391 1228:istore          6
						j = -1;
	//  392 1230:iconst_m1       
	//  393 1231:istore          7
						break;

	//* 394 1233:goto            1486
					case 9: // '\t'
						obj1 = ((Object) (parseVorbisCodecPrivate(codecPrivate)));
	//  395 1236:aload_0         
	//  396 1237:getfield        #290 <Field byte[] codecPrivate>
	//  397 1240:invokestatic    #358 <Method List parseVorbisCodecPrivate(byte[])>
	//  398 1243:astore          10
						obj = "audio/vorbis";
	//  399 1245:ldc2            #360 <String "audio/vorbis">
	//  400 1248:astore          9
						c = '\u2000';
	//  401 1250:sipush          8192
	//  402 1253:istore          6
						j = -1;
	//  403 1255:iconst_m1       
	//  404 1256:istore          7
						break;

	//* 405 1258:goto            1486
					case 8: // '\b'
						obj1 = ((Object) (parseFourCcVc1Private(new ParsableByteArray(codecPrivate))));
	//  406 1261:new             #83  <Class ParsableByteArray>
	//  407 1264:dup             
	//  408 1265:aload_0         
	//  409 1266:getfield        #290 <Field byte[] codecPrivate>
	//  410 1269:invokespecial   #310 <Method void ParsableByteArray(byte[])>
	//  411 1272:invokestatic    #362 <Method List parseFourCcVc1Private(ParsableByteArray)>
	//  412 1275:astore          10
						obj = "video/wvc1";
	//  413 1277:ldc2            #364 <String "video/wvc1">
	//  414 1280:astore          9
						c = '\uFFFF';
	//  415 1282:iconst_m1       
	//  416 1283:istore          6
						j = ((int) (c));
	//  417 1285:iload           6
	//  418 1287:istore          7
						break;

	//* 419 1289:goto            1486
					case 7: // '\007'
						obj = ((Object) (parseHevcCodecPrivate(new ParsableByteArray(codecPrivate))));
	//  420 1292:new             #83  <Class ParsableByteArray>
	//  421 1295:dup             
	//  422 1296:aload_0         
	//  423 1297:getfield        #290 <Field byte[] codecPrivate>
	//  424 1300:invokespecial   #310 <Method void ParsableByteArray(byte[])>
	//  425 1303:invokestatic    #366 <Method Pair parseHevcCodecPrivate(ParsableByteArray)>
	//  426 1306:astore          9
						obj1 = ((Object) ((List)((Pair) (obj)).first));
	//  427 1308:aload           9
	//  428 1310:getfield        #370 <Field Object Pair.first>
	//  429 1313:checkcast       #102 <Class List>
	//  430 1316:astore          10
						nalUnitLengthFieldLength = ((Integer)((Pair) (obj)).second).intValue();
	//  431 1318:aload_0         
	//  432 1319:aload           9
	//  433 1321:getfield        #373 <Field Object Pair.second>
	//  434 1324:checkcast       #108 <Class Integer>
	//  435 1327:invokevirtual   #376 <Method int Integer.intValue()>
	//  436 1330:putfield        #378 <Field int nalUnitLengthFieldLength>
						obj = "video/hevc";
	//  437 1333:ldc2            #380 <String "video/hevc">
	//  438 1336:astore          9
						c = '\uFFFF';
	//  439 1338:iconst_m1       
	//  440 1339:istore          6
						j = ((int) (c));
	//  441 1341:iload           6
	//  442 1343:istore          7
						break;

	//* 443 1345:goto            1486
					case 6: // '\006'
						obj = ((Object) (parseAvcCodecPrivate(new ParsableByteArray(codecPrivate))));
	//  444 1348:new             #83  <Class ParsableByteArray>
	//  445 1351:dup             
	//  446 1352:aload_0         
	//  447 1353:getfield        #290 <Field byte[] codecPrivate>
	//  448 1356:invokespecial   #310 <Method void ParsableByteArray(byte[])>
	//  449 1359:invokestatic    #382 <Method Pair parseAvcCodecPrivate(ParsableByteArray)>
	//  450 1362:astore          9
						obj1 = ((Object) ((List)((Pair) (obj)).first));
	//  451 1364:aload           9
	//  452 1366:getfield        #370 <Field Object Pair.first>
	//  453 1369:checkcast       #102 <Class List>
	//  454 1372:astore          10
						nalUnitLengthFieldLength = ((Integer)((Pair) (obj)).second).intValue();
	//  455 1374:aload_0         
	//  456 1375:aload           9
	//  457 1377:getfield        #373 <Field Object Pair.second>
	//  458 1380:checkcast       #108 <Class Integer>
	//  459 1383:invokevirtual   #376 <Method int Integer.intValue()>
	//  460 1386:putfield        #378 <Field int nalUnitLengthFieldLength>
						obj = "video/avc";
	//  461 1389:ldc2            #384 <String "video/avc">
	//  462 1392:astore          9
						c = '\uFFFF';
	//  463 1394:iconst_m1       
	//  464 1395:istore          6
						j = ((int) (c));
	//  465 1397:iload           6
	//  466 1399:istore          7
						break;

	//* 467 1401:goto            1486
					case 3: // '\003'
					case 4: // '\004'
					case 5: // '\005'
						obj1 = ((Object) (codecPrivate));
	//  468 1404:aload_0         
	//  469 1405:getfield        #290 <Field byte[] codecPrivate>
	//  470 1408:astore          10
						if(obj1 == null)
	//* 471 1410:aload           10
	//* 472 1412:ifnonnull       1422
							obj1 = obj;
	//  473 1415:aload           9
	//  474 1417:astore          10
						else
	//* 475 1419:goto            1429
							obj1 = ((Object) (Collections.singletonList(obj1)));
	//  476 1422:aload           10
	//  477 1424:invokestatic    #156 <Method List Collections.singletonList(Object)>
	//  478 1427:astore          10
						obj = "video/mp4v-es";
	//  479 1429:ldc2            #386 <String "video/mp4v-es">
	//  480 1432:astore          9
						c = '\uFFFF';
	//  481 1434:iconst_m1       
	//  482 1435:istore          6
						j = ((int) (c));
	//  483 1437:iload           6
	//  484 1439:istore          7
						break;

	//* 485 1441:goto            1486
					case 2: // '\002'
						obj = "video/mpeg2";
	//  486 1444:ldc2            #388 <String "video/mpeg2">
	//  487 1447:astore          9
						c = '\uFFFF';
	//  488 1449:iconst_m1       
	//  489 1450:istore          6
						j = ((int) (c));
	//  490 1452:iload           6
	//  491 1454:istore          7
						break;

	//* 492 1456:goto            1486
					case 1: // '\001'
						obj = "video/x-vnd.on2.vp9";
	//  493 1459:ldc2            #390 <String "video/x-vnd.on2.vp9">
	//  494 1462:astore          9
						c = '\uFFFF';
	//  495 1464:iconst_m1       
	//  496 1465:istore          6
						j = ((int) (c));
	//  497 1467:iload           6
	//  498 1469:istore          7
						break;

	//* 499 1471:goto            1486
					case 0: // '\0'
						obj = "video/x-vnd.on2.vp8";
	//  500 1474:ldc2            #392 <String "video/x-vnd.on2.vp8">
	//  501 1477:astore          9
						c = '\uFFFF';
	//  502 1479:iconst_m1       
	//  503 1480:istore          6
						j = ((int) (c));
	//  504 1482:iload           6
	//  505 1484:istore          7
						break;
					}
					if(MimeTypes.isAudio(((String) (obj))))
	//* 506 1486:aload           9
	//* 507 1488:invokestatic    #398 <Method boolean MimeTypes.isAudio(String)>
	//* 508 1491:ifeq            1528
					{
						obj = ((Object) (MediaFormat.createAudioFormat(Integer.toString(i), ((String) (obj)), -1, ((int) (c)), l, channelCount, sampleRate, ((List) (obj1)), language, j)));
	//  509 1494:iload_2         
	//  510 1495:invokestatic    #401 <Method String Integer.toString(int)>
	//  511 1498:aload           9
	//  512 1500:iconst_m1       
	//  513 1501:iload           6
	//  514 1503:lload_3         
	//  515 1504:aload_0         
	//  516 1505:getfield        #58  <Field int channelCount>
	//  517 1508:aload_0         
	//  518 1509:getfield        #62  <Field int sampleRate>
	//  519 1512:aload           10
	//  520 1514:aload_0         
	//  521 1515:getfield        #70  <Field String language>
	//  522 1518:iload           7
	//  523 1520:invokestatic    #407 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String, int)>
	//  524 1523:astore          9
						break label0;
	//  525 1525:goto            1775
					}
					if(!MimeTypes.isVideo(((String) (obj))))
						break label1;
	//  526 1528:aload           9
	//  527 1530:invokestatic    #410 <Method boolean MimeTypes.isVideo(String)>
	//  528 1533:ifeq            1689
					if(displayUnit == 0)
	//* 529 1536:aload_0         
	//* 530 1537:getfield        #52  <Field int displayUnit>
	//* 531 1540:ifne            1599
					{
						int k = displayWidth;
	//  532 1543:aload_0         
	//  533 1544:getfield        #48  <Field int displayWidth>
	//  534 1547:istore          8
						j = k;
	//  535 1549:iload           8
	//  536 1551:istore          7
						if(k == -1)
	//* 537 1553:iload           8
	//* 538 1555:iconst_m1       
	//* 539 1556:icmpne          1565
							j = width;
	//  540 1559:aload_0         
	//  541 1560:getfield        #44  <Field int width>
	//  542 1563:istore          7
						displayWidth = j;
	//  543 1565:aload_0         
	//  544 1566:iload           7
	//  545 1568:putfield        #48  <Field int displayWidth>
						k = displayHeight;
	//  546 1571:aload_0         
	//  547 1572:getfield        #50  <Field int displayHeight>
	//  548 1575:istore          8
						j = k;
	//  549 1577:iload           8
	//  550 1579:istore          7
						if(k == -1)
	//* 551 1581:iload           8
	//* 552 1583:iconst_m1       
	//* 553 1584:icmpne          1593
							j = height;
	//  554 1587:aload_0         
	//  555 1588:getfield        #46  <Field int height>
	//  556 1591:istore          7
						displayHeight = j;
	//  557 1593:aload_0         
	//  558 1594:iload           7
	//  559 1596:putfield        #50  <Field int displayHeight>
					}
					j = displayWidth;
	//  560 1599:aload_0         
	//  561 1600:getfield        #48  <Field int displayWidth>
	//  562 1603:istore          7
					if(j != -1)
	//* 563 1605:iload           7
	//* 564 1607:iconst_m1       
	//* 565 1608:icmpeq          1645
					{
						int i1 = displayHeight;
	//  566 1611:aload_0         
	//  567 1612:getfield        #50  <Field int displayHeight>
	//  568 1615:istore          8
						if(i1 != -1)
	//* 569 1617:iload           8
	//* 570 1619:iconst_m1       
	//* 571 1620:icmpeq          1645
						{
							f = (float)(height * j) / (float)(width * i1);
	//  572 1623:aload_0         
	//  573 1624:getfield        #46  <Field int height>
	//  574 1627:iload           7
	//  575 1629:imul            
	//  576 1630:i2f             
	//  577 1631:aload_0         
	//  578 1632:getfield        #44  <Field int width>
	//  579 1635:iload           8
	//  580 1637:imul            
	//  581 1638:i2f             
	//  582 1639:fdiv            
	//  583 1640:fstore          5
							break label2;
	//  584 1642:goto            1650
						}
					}
					f = -1F;
	//  585 1645:ldc2            #411 <Float -1F>
	//  586 1648:fstore          5
				}
				obj = ((Object) (MediaFormat.createVideoFormat(Integer.toString(i), ((String) (obj)), -1, ((int) (c)), l, width, height, ((List) (obj1)), -1, f, projectionData, stereoMode)));
	//  587 1650:iload_2         
	//  588 1651:invokestatic    #401 <Method String Integer.toString(int)>
	//  589 1654:aload           9
	//  590 1656:iconst_m1       
	//  591 1657:iload           6
	//  592 1659:lload_3         
	//  593 1660:aload_0         
	//  594 1661:getfield        #44  <Field int width>
	//  595 1664:aload_0         
	//  596 1665:getfield        #46  <Field int height>
	//  597 1668:aload           10
	//  598 1670:iconst_m1       
	//  599 1671:fload           5
	//  600 1673:aload_0         
	//  601 1674:getfield        #54  <Field byte[] projectionData>
	//  602 1677:aload_0         
	//  603 1678:getfield        #56  <Field int stereoMode>
	//  604 1681:invokestatic    #415 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List, int, float, byte[], int)>
	//  605 1684:astore          9
				break label0;
	//  606 1686:goto            1775
			}
			if("application/x-subrip".equals(obj))
	//* 607 1689:ldc2            #294 <String "application/x-subrip">
	//* 608 1692:aload           9
	//* 609 1694:invokevirtual   #236 <Method boolean String.equals(Object)>
	//* 610 1697:ifeq            1720
			{
				obj = ((Object) (MediaFormat.createTextFormat(Integer.toString(i), ((String) (obj)), -1, l, language)));
	//  611 1700:iload_2         
	//  612 1701:invokestatic    #401 <Method String Integer.toString(int)>
	//  613 1704:aload           9
	//  614 1706:iconst_m1       
	//  615 1707:lload_3         
	//  616 1708:aload_0         
	//  617 1709:getfield        #70  <Field String language>
	//  618 1712:invokestatic    #419 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//  619 1715:astore          9
			} else
	//* 620 1717:goto            1775
			{
				if(!"application/vobsub".equals(obj) && !"application/pgs".equals(obj))
	//* 621 1720:ldc2            #292 <String "application/vobsub">
	//* 622 1723:aload           9
	//* 623 1725:invokevirtual   #236 <Method boolean String.equals(Object)>
	//* 624 1728:ifne            1756
	//* 625 1731:ldc2            #288 <String "application/pgs">
	//* 626 1734:aload           9
	//* 627 1736:invokevirtual   #236 <Method boolean String.equals(Object)>
	//* 628 1739:ifeq            1745
	//* 629 1742:goto            1756
					throw new ParserException("Unexpected MIME type.");
	//  630 1745:new             #79  <Class ParserException>
	//  631 1748:dup             
	//  632 1749:ldc2            #421 <String "Unexpected MIME type.">
	//  633 1752:invokespecial   #124 <Method void ParserException(String)>
	//  634 1755:athrow          
				obj = ((Object) (MediaFormat.createImageFormat(Integer.toString(i), ((String) (obj)), -1, l, ((List) (obj1)), language)));
	//  635 1756:iload_2         
	//  636 1757:invokestatic    #401 <Method String Integer.toString(int)>
	//  637 1760:aload           9
	//  638 1762:iconst_m1       
	//  639 1763:lload_3         
	//  640 1764:aload           10
	//  641 1766:aload_0         
	//  642 1767:getfield        #70  <Field String language>
	//  643 1770:invokestatic    #425 <Method MediaFormat MediaFormat.createImageFormat(String, String, int, long, List, String)>
	//  644 1773:astore          9
			}
		}
		output = extractoroutput.track(number);
	//  645 1775:aload_0         
	//  646 1776:aload_1         
	//  647 1777:aload_0         
	//  648 1778:getfield        #427 <Field int number>
	//  649 1781:invokeinterface #433 <Method TrackOutput ExtractorOutput.track(int)>
	//  650 1786:putfield        #435 <Field TrackOutput output>
		output.format(((MediaFormat) (obj)));
	//  651 1789:aload_0         
	//  652 1790:getfield        #435 <Field TrackOutput output>
	//  653 1793:aload           9
	//  654 1795:invokeinterface #441 <Method void TrackOutput.format(MediaFormat)>
	//  655 1800:return          
	}

	private static final int DISPLAY_UNIT_PIXELS = 0;
	public int audioBitDepth;
	public int channelCount;
	public long codecDelayNs;
	public String codecId;
	public byte codecPrivate[];
	public int defaultSampleDurationNs;
	public int displayHeight;
	public int displayUnit;
	public int displayWidth;
	public byte encryptionKeyId[];
	public boolean hasContentEncryption;
	public int height;
	private String language;
	public int nalUnitLengthFieldLength;
	public int number;
	public TrackOutput output;
	public byte projectionData[];
	public int sampleRate;
	public byte sampleStrippedBytes[];
	public long seekPreRollNs;
	public int stereoMode;
	public int type;
	public int width;


/*
	static String access$202(WebmExtractor$Track webmextractor$track, String s)
	{
		webmextractor$track.language = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String language>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	private WebmExtractor$Track()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		width = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #44  <Field int width>
		height = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #46  <Field int height>
		displayWidth = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #48  <Field int displayWidth>
		displayHeight = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #50  <Field int displayHeight>
		displayUnit = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #52  <Field int displayUnit>
		projectionData = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #54  <Field byte[] projectionData>
		stereoMode = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #56  <Field int stereoMode>
		channelCount = 1;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #58  <Field int channelCount>
		audioBitDepth = -1;
	//   26   44:aload_0         
	//   27   45:iconst_m1       
	//   28   46:putfield        #60  <Field int audioBitDepth>
		sampleRate = 8000;
	//   29   49:aload_0         
	//   30   50:sipush          8000
	//   31   53:putfield        #62  <Field int sampleRate>
		codecDelayNs = 0L;
	//   32   56:aload_0         
	//   33   57:lconst_0        
	//   34   58:putfield        #64  <Field long codecDelayNs>
		seekPreRollNs = 0L;
	//   35   61:aload_0         
	//   36   62:lconst_0        
	//   37   63:putfield        #66  <Field long seekPreRollNs>
		language = "eng";
	//   38   66:aload_0         
	//   39   67:ldc1            #68  <String "eng">
	//   40   69:putfield        #70  <Field String language>
	//   41   72:return          
	}

	WebmExtractor$Track(WebmExtractor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void WebmExtractor$Track()>
	//    2    4:return          
	}
}
