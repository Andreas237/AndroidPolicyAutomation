// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

public final class HevcConfig
{

	private HevcConfig(List list, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		initializationData = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List initializationData>
		nalUnitLengthFieldLength = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int nalUnitLengthFieldLength>
	//    8   14:return          
	}

	public static HevcConfig parse(ParsableByteArray parsablebytearray)
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
			parsablebytearray.skipBytes(21);
	//    0    0:aload_0         
	//    1    1:bipush          21
	//    2    3:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
			i1 = parsablebytearray.readUnsignedByte();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #37  <Method int ParsableByteArray.readUnsignedByte()>
	//    5   10:istore          5
			j1 = parsablebytearray.readUnsignedByte();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #37  <Method int ParsableByteArray.readUnsignedByte()>
	//    8   16:istore          6
			l = parsablebytearray.getPosition();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #40  <Method int ParsableByteArray.getPosition()>
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
	//*  21   36:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
	//*  22   39:aload_0         
	//*  23   40:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedShort()>
	//*  24   43:istore          7
	//*  25   45:iconst_0        
	//*  26   46:istore_3        
	//*  27   47:iload_3         
	//*  28   48:iload           7
	//*  29   50:icmpge          219
	//*  30   53:aload_0         
	//*  31   54:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedShort()>
	//*  32   57:istore          8
	//*  33   59:iload_1         
	//*  34   60:iconst_4        
	//*  35   61:iload           8
	//*  36   63:iadd            
	//*  37   64:iadd            
	//*  38   65:istore_1        
	//*  39   66:aload_0         
	//*  40   67:iload           8
	//*  41   69:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
	//*  42   72:iload_3         
	//*  43   73:iconst_1        
	//*  44   74:iadd            
	//*  45   75:istore_3        
	//*  46   76:goto            47
	//*  47   79:aload_0         
	//*  48   80:iload           4
	//*  49   82:invokevirtual   #46  <Method void ParsableByteArray.setPosition(int)>
	//*  50   85:iload_1         
	//*  51   86:newarray        byte[]
	//*  52   88:astore          9
	//*  53   90:iconst_0        
	//*  54   91:istore_3        
	//*  55   92:iload_3         
	//*  56   93:istore_2        
	//*  57   94:iload_3         
	//*  58   95:iload           6
	//*  59   97:icmpge          233
	//*  60  100:aload_0         
	//*  61  101:iconst_1        
	//*  62  102:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
	//*  63  105:aload_0         
	//*  64  106:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedShort()>
	//*  65  109:istore          7
	//*  66  111:iconst_0        
	//*  67  112:istore          4
	//*  68  114:iload           4
	//*  69  116:iload           7
	//*  70  118:icmpge          226
	//*  71  121:aload_0         
	//*  72  122:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedShort()>
	//*  73  125:istore          8
	//*  74  127:getstatic       #52  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  75  130:iconst_0        
	//*  76  131:aload           9
	//*  77  133:iload_2         
	//*  78  134:getstatic       #52  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  79  137:arraylength     
	//*  80  138:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  81  141:iload_2         
	//*  82  142:getstatic       #52  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//*  83  145:arraylength     
	//*  84  146:iadd            
	//*  85  147:istore_2        
	//*  86  148:aload_0         
	//*  87  149:getfield        #61  <Field byte[] ParsableByteArray.data>
	//*  88  152:aload_0         
	//*  89  153:invokevirtual   #40  <Method int ParsableByteArray.getPosition()>
	//*  90  156:aload           9
	//*  91  158:iload_2         
	//*  92  159:iload           8
	//*  93  161:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  94  164:iload_2         
	//*  95  165:iload           8
	//*  96  167:iadd            
	//*  97  168:istore_2        
	//*  98  169:aload_0         
	//*  99  170:iload           8
	//* 100  172:invokevirtual   #33  <Method void ParsableByteArray.skipBytes(int)>
	//* 101  175:iload           4
	//* 102  177:iconst_1        
	//* 103  178:iadd            
	//* 104  179:istore          4
	//* 105  181:goto            114
	//* 106  184:aload           9
	//* 107  186:invokestatic    #67  <Method List Collections.singletonList(Object)>
	//* 108  189:astore_0        
	//* 109  190:new             #2   <Class HevcConfig>
	//* 110  193:dup             
	//* 111  194:aload_0         
	//* 112  195:iload           5
	//* 113  197:iconst_3        
	//* 114  198:iand            
	//* 115  199:iconst_1        
	//* 116  200:iadd            
	//* 117  201:invokespecial   #69  <Method void HevcConfig(List, int)>
	//* 118  204:astore_0        
	//* 119  205:aload_0         
	//* 120  206:areturn         
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
	//* 121  207:astore_0        
		{
			throw new ParserException("Error parsing HEVC config", ((Throwable) (parsablebytearray)));
	//  122  208:new             #25  <Class ParserException>
	//  123  211:dup             
	//  124  212:ldc1            #71  <String "Error parsing HEVC config">
	//  125  214:aload_0         
	//  126  215:invokespecial   #74  <Method void ParserException(String, Throwable)>
	//  127  218:athrow          
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
		i += 4 + l1;
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
		parsablebytearray = ((ParsableByteArray) (new HevcConfig(((List) (parsablebytearray)), (i1 & 3) + 1)));
		return ((HevcConfig) (parsablebytearray));
_L3:
		j++;
	//  128  219:iload_2         
	//  129  220:iconst_1        
	//  130  221:iadd            
	//  131  222:istore_2        
		  goto _L9
	//* 132  223:goto            28
		k++;
	//  133  226:iload_3         
	//  134  227:iconst_1        
	//  135  228:iadd            
	//  136  229:istore_3        
		  goto _L10
	//* 137  230:goto            94
_L6:
		if(i != 0) goto _L12; else goto _L11
	//  138  233:iload_1         
	//  139  234:ifne            184
_L11:
		parsablebytearray = null;
	//  140  237:aconst_null     
	//  141  238:astore_0        
		  goto _L13
	//* 142  239:goto            190
	}

	public final List initializationData;
	public final int nalUnitLengthFieldLength;
}
