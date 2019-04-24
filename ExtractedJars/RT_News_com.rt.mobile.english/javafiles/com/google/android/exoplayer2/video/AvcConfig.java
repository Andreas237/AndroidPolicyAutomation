// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.*;
import java.util.ArrayList;
import java.util.List;

public final class AvcConfig
{

	private AvcConfig(List list, int i, int j, int k, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		initializationData = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field List initializationData>
		nalUnitLengthFieldLength = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int nalUnitLengthFieldLength>
		width = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int width>
		height = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int height>
		pixelWidthAspectRatio = f;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #28  <Field float pixelWidthAspectRatio>
	//   17   31:return          
	}

	private static byte[] buildNalUnitForChild(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.readUnsignedShort();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method int ParsableByteArray.readUnsignedShort()>
	//    2    4:istore_1        
		int j = parsablebytearray.getPosition();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #42  <Method int ParsableByteArray.getPosition()>
	//    5    9:istore_2        
		parsablebytearray.skipBytes(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #46  <Method void ParsableByteArray.skipBytes(int)>
		return CodecSpecificDataUtil.buildNalUnit(parsablebytearray.data, j, i);
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field byte[] ParsableByteArray.data>
	//   11   19:iload_2         
	//   12   20:iload_1         
	//   13   21:invokestatic    #56  <Method byte[] CodecSpecificDataUtil.buildNalUnit(byte[], int, int)>
	//   14   24:areturn         
	}

	public static AvcConfig parse(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		float f;
		int i;
		int j;
		int k;
		int l;
		ArrayList arraylist;
		try
		{
			parsablebytearray.skipBytes(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #46  <Method void ParsableByteArray.skipBytes(int)>
			k = (parsablebytearray.readUnsignedByte() & 3) + 1;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #65  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:iconst_3        
	//    6   10:iand            
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:istore          4
		}
	//*  10   15:iload           4
	//*  11   17:iconst_3        
	//*  12   18:icmpne          29
	//*  13   21:new             #67  <Class IllegalStateException>
	//*  14   24:dup             
	//*  15   25:invokespecial   #68  <Method void IllegalStateException()>
	//*  16   28:athrow          
	//*  17   29:new             #70  <Class ArrayList>
	//*  18   32:dup             
	//*  19   33:invokespecial   #71  <Method void ArrayList()>
	//*  20   36:astore          6
	//*  21   38:aload_0         
	//*  22   39:invokevirtual   #65  <Method int ParsableByteArray.readUnsignedByte()>
	//*  23   42:bipush          31
	//*  24   44:iand            
	//*  25   45:istore_3        
	//*  26   46:iconst_0        
	//*  27   47:istore_2        
	//*  28   48:iload_2         
	//*  29   49:iload_3         
	//*  30   50:icmpge          72
	//*  31   53:aload           6
	//*  32   55:aload_0         
	//*  33   56:invokestatic    #73  <Method byte[] buildNalUnitForChild(ParsableByteArray)>
	//*  34   59:invokeinterface #79  <Method boolean List.add(Object)>
	//*  35   64:pop             
	//*  36   65:iload_2         
	//*  37   66:iconst_1        
	//*  38   67:iadd            
	//*  39   68:istore_2        
	//*  40   69:goto            48
	//*  41   72:aload_0         
	//*  42   73:invokevirtual   #65  <Method int ParsableByteArray.readUnsignedByte()>
	//*  43   76:istore          5
	//*  44   78:iconst_0        
	//*  45   79:istore_2        
	//*  46   80:iload_2         
	//*  47   81:iload           5
	//*  48   83:icmpge          105
	//*  49   86:aload           6
	//*  50   88:aload_0         
	//*  51   89:invokestatic    #73  <Method byte[] buildNalUnitForChild(ParsableByteArray)>
	//*  52   92:invokeinterface #79  <Method boolean List.add(Object)>
	//*  53   97:pop             
	//*  54   98:iload_2         
	//*  55   99:iconst_1        
	//*  56  100:iadd            
	//*  57  101:istore_2        
	//*  58  102:goto            80
	//*  59  105:iload_3         
	//*  60  106:ifle            187
	//*  61  109:aload           6
	//*  62  111:iconst_0        
	//*  63  112:invokeinterface #83  <Method Object List.get(int)>
	//*  64  117:checkcast       #84  <Class byte[]>
	//*  65  120:astore_0        
	//*  66  121:aload           6
	//*  67  123:iconst_0        
	//*  68  124:invokeinterface #83  <Method Object List.get(int)>
	//*  69  129:checkcast       #84  <Class byte[]>
	//*  70  132:iload           4
	//*  71  134:aload_0         
	//*  72  135:arraylength     
	//*  73  136:invokestatic    #90  <Method com.google.android.exoplayer2.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(byte[], int, int)>
	//*  74  139:astore_0        
	//*  75  140:aload_0         
	//*  76  141:getfield        #93  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.width>
	//*  77  144:istore_2        
	//*  78  145:aload_0         
	//*  79  146:getfield        #94  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.height>
	//*  80  149:istore_3        
	//*  81  150:aload_0         
	//*  82  151:getfield        #95  <Field float com.google.android.exoplayer2.util.NalUnitUtil$SpsData.pixelWidthAspectRatio>
	//*  83  154:fstore_1        
	//*  84  155:goto            158
	//*  85  158:new             #2   <Class AvcConfig>
	//*  86  161:dup             
	//*  87  162:aload           6
	//*  88  164:iload           4
	//*  89  166:iload_2         
	//*  90  167:iload_3         
	//*  91  168:fload_1         
	//*  92  169:invokespecial   #97  <Method void AvcConfig(List, int, int, int, float)>
	//*  93  172:astore_0        
	//*  94  173:aload_0         
	//*  95  174:areturn         
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
	//*  96  175:astore_0        
		{
			throw new ParserException("Error parsing AVC config", ((Throwable) (parsablebytearray)));
	//   97  176:new             #60  <Class ParserException>
	//   98  179:dup             
	//   99  180:ldc1            #99  <String "Error parsing AVC config">
	//  100  182:aload_0         
	//  101  183:invokespecial   #102 <Method void ParserException(String, Throwable)>
	//  102  186:athrow          
		}
		if(k != 3)
			break MISSING_BLOCK_LABEL_29;
		throw new IllegalStateException();
		arraylist = new ArrayList();
		j = parsablebytearray.readUnsignedByte() & 0x1f;
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (buildNalUnitForChild(parsablebytearray))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		l = parsablebytearray.readUnsignedByte();
		i = 0;
_L4:
		if(i >= l)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (buildNalUnitForChild(parsablebytearray))));
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		if(j <= 0) goto _L6; else goto _L5
_L5:
		parsablebytearray = ((ParsableByteArray) ((byte[])((List) (arraylist)).get(0)));
		parsablebytearray = ((ParsableByteArray) (NalUnitUtil.parseSpsNalUnit((byte[])((List) (arraylist)).get(0), k, parsablebytearray.length)));
		i = ((com.google.android.exoplayer2.util.NalUnitUtil.SpsData) (parsablebytearray)).width;
		j = ((com.google.android.exoplayer2.util.NalUnitUtil.SpsData) (parsablebytearray)).height;
		f = ((com.google.android.exoplayer2.util.NalUnitUtil.SpsData) (parsablebytearray)).pixelWidthAspectRatio;
_L8:
		parsablebytearray = ((ParsableByteArray) (new AvcConfig(((List) (arraylist)), k, i, j, f)));
		return ((AvcConfig) (parsablebytearray));
_L6:
		f = 1.0F;
	//  103  187:fconst_1        
	//  104  188:fstore_1        
		i = -1;
	//  105  189:iconst_m1       
	//  106  190:istore_2        
		j = i;
	//  107  191:iload_2         
	//  108  192:istore_3        
		if(true) goto _L8; else goto _L7
	//  109  193:goto            158
_L7:
	}

	public final int height;
	public final List initializationData;
	public final int nalUnitLengthFieldLength;
	public final float pixelWidthAspectRatio;
	public final int width;
}
