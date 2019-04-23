// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.flv:
//			TagPayloadReader

final class VideoTagPayloadReader extends TagPayloadReader
{
	private static final class AvcSequenceHeaderData
	{

		public final int height;
		public final List initializationData;
		public final int nalUnitLengthFieldLength;
		public final float pixelWidthAspectRatio;
		public final int width;

		public AvcSequenceHeaderData(List list, int i, int j, int k, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			initializationData = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field List initializationData>
			nalUnitLengthFieldLength = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int nalUnitLengthFieldLength>
			pixelWidthAspectRatio = f;
		//    8   14:aload_0         
		//    9   15:fload           5
		//   10   17:putfield        #27  <Field float pixelWidthAspectRatio>
			width = j;
		//   11   20:aload_0         
		//   12   21:iload_3         
		//   13   22:putfield        #29  <Field int width>
			height = k;
		//   14   25:aload_0         
		//   15   26:iload           4
		//   16   28:putfield        #31  <Field int height>
		//   17   31:return          
		}
	}


	public VideoTagPayloadReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void TagPayloadReader(TrackOutput)>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//    3    5:aload_0         
	//    4    6:new             #30  <Class ParsableByteArray>
	//    5    9:dup             
	//    6   10:getstatic       #36  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//    7   13:invokespecial   #39  <Method void ParsableByteArray(byte[])>
	//    8   16:putfield        #41  <Field ParsableByteArray nalStartCode>
	//    9   19:aload_0         
	//   10   20:new             #30  <Class ParsableByteArray>
	//   11   23:dup             
	//   12   24:iconst_4        
	//   13   25:invokespecial   #44  <Method void ParsableByteArray(int)>
	//   14   28:putfield        #46  <Field ParsableByteArray nalLength>
	//   15   31:return          
	}

	private AvcSequenceHeaderData parseAvcCodecPrivate(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		parsablebytearray.setPosition(4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #54  <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readUnsignedByte();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:istore_3        
		boolean flag = true;
	//    6   10:iconst_1        
	//    7   11:istore          7
		int k = (i & 3) + 1;
	//    8   13:iload_3         
	//    9   14:iconst_3        
	//   10   15:iand            
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:istore          5
		if(k == 3)
	//*  14   20:iload           5
	//*  15   22:iconst_3        
	//*  16   23:icmpeq          29
	//*  17   26:goto            32
			flag = false;
	//   18   29:iconst_0        
	//   19   30:istore          7
		Assertions.checkState(flag);
	//   20   32:iload           7
	//   21   34:invokestatic    #64  <Method void Assertions.checkState(boolean)>
		ArrayList arraylist = new ArrayList();
	//   22   37:new             #66  <Class ArrayList>
	//   23   40:dup             
	//   24   41:invokespecial   #69  <Method void ArrayList()>
	//   25   44:astore          8
		int j = parsablebytearray.readUnsignedByte() & 0x1f;
	//   26   46:aload_1         
	//   27   47:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedByte()>
	//   28   50:bipush          31
	//   29   52:iand            
	//   30   53:istore          4
		for(i = 0; i < j; i++)
	//*  31   55:iconst_0        
	//*  32   56:istore_3        
	//*  33   57:iload_3         
	//*  34   58:iload           4
	//*  35   60:icmpge          82
			((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
	//   36   63:aload           8
	//   37   65:aload_1         
	//   38   66:invokestatic    #73  <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//   39   69:invokeinterface #79  <Method boolean List.add(Object)>
	//   40   74:pop             

	//   41   75:iload_3         
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore_3        
	//*  45   79:goto            57
		int l = parsablebytearray.readUnsignedByte();
	//   46   82:aload_1         
	//   47   83:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedByte()>
	//   48   86:istore          6
		for(i = 0; i < l; i++)
	//*  49   88:iconst_0        
	//*  50   89:istore_3        
	//*  51   90:iload_3         
	//*  52   91:iload           6
	//*  53   93:icmpge          115
			((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
	//   54   96:aload           8
	//   55   98:aload_1         
	//   56   99:invokestatic    #73  <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//   57  102:invokeinterface #79  <Method boolean List.add(Object)>
	//   58  107:pop             

	//   59  108:iload_3         
	//   60  109:iconst_1        
	//   61  110:iadd            
	//   62  111:istore_3        
	//*  63  112:goto            90
		float f;
		if(j > 0)
	//*  64  115:iload           4
	//*  65  117:ifle            174
		{
			parsablebytearray = ((ParsableByteArray) (new ParsableBitArray((byte[])((List) (arraylist)).get(0))));
	//   66  120:new             #81  <Class ParsableBitArray>
	//   67  123:dup             
	//   68  124:aload           8
	//   69  126:iconst_0        
	//   70  127:invokeinterface #85  <Method Object List.get(int)>
	//   71  132:checkcast       #86  <Class byte[]>
	//   72  135:invokespecial   #87  <Method void ParsableBitArray(byte[])>
	//   73  138:astore_1        
			((ParsableBitArray) (parsablebytearray)).setPosition((k + 1) * 8);
	//   74  139:aload_1         
	//   75  140:iload           5
	//   76  142:iconst_1        
	//   77  143:iadd            
	//   78  144:bipush          8
	//   79  146:imul            
	//   80  147:invokevirtual   #88  <Method void ParsableBitArray.setPosition(int)>
			parsablebytearray = ((ParsableByteArray) (NalUnitUtil.parseSpsNalUnit(((ParsableBitArray) (parsablebytearray)))));
	//   81  150:aload_1         
	//   82  151:invokestatic    #92  <Method com.google.android.exoplayer.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(ParsableBitArray)>
	//   83  154:astore_1        
			i = ((com.google.android.exoplayer.util.NalUnitUtil.SpsData) (parsablebytearray)).width;
	//   84  155:aload_1         
	//   85  156:getfield        #97  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.width>
	//   86  159:istore_3        
			j = ((com.google.android.exoplayer.util.NalUnitUtil.SpsData) (parsablebytearray)).height;
	//   87  160:aload_1         
	//   88  161:getfield        #100 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.height>
	//   89  164:istore          4
			f = ((com.google.android.exoplayer.util.NalUnitUtil.SpsData) (parsablebytearray)).pixelWidthAspectRatio;
	//   90  166:aload_1         
	//   91  167:getfield        #104 <Field float com.google.android.exoplayer.util.NalUnitUtil$SpsData.pixelWidthAspectRatio>
	//   92  170:fstore_2        
		} else
	//*  93  171:goto            181
		{
			f = 1.0F;
	//   94  174:fconst_1        
	//   95  175:fstore_2        
			i = -1;
	//   96  176:iconst_m1       
	//   97  177:istore_3        
			j = i;
	//   98  178:iload_3         
	//   99  179:istore          4
		}
		return new AvcSequenceHeaderData(((List) (arraylist)), k, i, j, f);
	//  100  181:new             #6   <Class VideoTagPayloadReader$AvcSequenceHeaderData>
	//  101  184:dup             
	//  102  185:aload           8
	//  103  187:iload           5
	//  104  189:iload_3         
	//  105  190:iload           4
	//  106  192:fload_2         
	//  107  193:invokespecial   #107 <Method void VideoTagPayloadReader$AvcSequenceHeaderData(List, int, int, int, float)>
	//  108  196:areturn         
	}

	protected boolean parseHeader(ParsableByteArray parsablebytearray)
		throws TagPayloadReader.UnsupportedFormatException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_3        
		int i = j >> 4 & 0xf;
	//    3    5:iload_3         
	//    4    6:iconst_4        
	//    5    7:ishr            
	//    6    8:bipush          15
	//    7   10:iand            
	//    8   11:istore_2        
		j &= 0xf;
	//    9   12:iload_3         
	//   10   13:bipush          15
	//   11   15:iand            
	//   12   16:istore_3        
		if(j == 7)
	//*  13   17:iload_3         
	//*  14   18:bipush          7
	//*  15   20:icmpne          37
		{
			frameType = i;
	//   16   23:aload_0         
	//   17   24:iload_2         
	//   18   25:putfield        #114 <Field int frameType>
			return i != 5;
	//   19   28:iload_2         
	//   20   29:iconst_5        
	//   21   30:icmpeq          35
	//   22   33:iconst_1        
	//   23   34:ireturn         
	//   24   35:iconst_0        
	//   25   36:ireturn         
		} else
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   26   37:new             #116 <Class StringBuilder>
	//   27   40:dup             
	//   28   41:invokespecial   #117 <Method void StringBuilder()>
	//   29   44:astore_1        
			((StringBuilder) (parsablebytearray)).append("Video format not supported: ");
	//   30   45:aload_1         
	//   31   46:ldc1            #119 <String "Video format not supported: ">
	//   32   48:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   33   51:pop             
			((StringBuilder) (parsablebytearray)).append(j);
	//   34   52:aload_1         
	//   35   53:iload_3         
	//   36   54:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   37   57:pop             
			throw new TagPayloadReader.UnsupportedFormatException(((StringBuilder) (parsablebytearray)).toString());
	//   38   58:new             #112 <Class TagPayloadReader$UnsupportedFormatException>
	//   39   61:dup             
	//   40   62:aload_1         
	//   41   63:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   42   66:invokespecial   #133 <Method void TagPayloadReader$UnsupportedFormatException(String)>
	//   43   69:athrow          
		}
	}

	protected void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore          4
		long l1 = parsablebytearray.readUnsignedInt24();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedInt24()>
	//    5   10:i2l             
	//    6   11:lstore          7
		if(i == 0 && !hasOutputFormat)
	//*   7   13:iload           4
	//*   8   15:ifne            115
	//*   9   18:aload_0         
	//*  10   19:getfield        #140 <Field boolean hasOutputFormat>
	//*  11   22:ifne            115
		{
			ParsableByteArray parsablebytearray1 = new ParsableByteArray(new byte[parsablebytearray.bytesLeft()]);
	//   12   25:new             #30  <Class ParsableByteArray>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokevirtual   #143 <Method int ParsableByteArray.bytesLeft()>
	//   16   33:newarray        byte[]
	//   17   35:invokespecial   #39  <Method void ParsableByteArray(byte[])>
	//   18   38:astore          9
			parsablebytearray.readBytes(parsablebytearray1.data, 0, parsablebytearray.bytesLeft());
	//   19   40:aload_1         
	//   20   41:aload           9
	//   21   43:getfield        #146 <Field byte[] ParsableByteArray.data>
	//   22   46:iconst_0        
	//   23   47:aload_1         
	//   24   48:invokevirtual   #143 <Method int ParsableByteArray.bytesLeft()>
	//   25   51:invokevirtual   #150 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			parsablebytearray = ((ParsableByteArray) (parseAvcCodecPrivate(parsablebytearray1)));
	//   26   54:aload_0         
	//   27   55:aload           9
	//   28   57:invokespecial   #152 <Method VideoTagPayloadReader$AvcSequenceHeaderData parseAvcCodecPrivate(ParsableByteArray)>
	//   29   60:astore_1        
			nalUnitLengthFieldLength = ((AvcSequenceHeaderData) (parsablebytearray)).nalUnitLengthFieldLength;
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:getfield        #154 <Field int VideoTagPayloadReader$AvcSequenceHeaderData.nalUnitLengthFieldLength>
	//   33   66:putfield        #155 <Field int nalUnitLengthFieldLength>
			parsablebytearray = ((ParsableByteArray) (MediaFormat.createVideoFormat(((String) (null)), "video/avc", -1, -1, getDurationUs(), ((AvcSequenceHeaderData) (parsablebytearray)).width, ((AvcSequenceHeaderData) (parsablebytearray)).height, ((AvcSequenceHeaderData) (parsablebytearray)).initializationData, -1, ((AvcSequenceHeaderData) (parsablebytearray)).pixelWidthAspectRatio)));
	//   34   69:aconst_null     
	//   35   70:ldc1            #157 <String "video/avc">
	//   36   72:iconst_m1       
	//   37   73:iconst_m1       
	//   38   74:aload_0         
	//   39   75:invokevirtual   #161 <Method long getDurationUs()>
	//   40   78:aload_1         
	//   41   79:getfield        #162 <Field int VideoTagPayloadReader$AvcSequenceHeaderData.width>
	//   42   82:aload_1         
	//   43   83:getfield        #163 <Field int VideoTagPayloadReader$AvcSequenceHeaderData.height>
	//   44   86:aload_1         
	//   45   87:getfield        #167 <Field List VideoTagPayloadReader$AvcSequenceHeaderData.initializationData>
	//   46   90:iconst_m1       
	//   47   91:aload_1         
	//   48   92:getfield        #168 <Field float VideoTagPayloadReader$AvcSequenceHeaderData.pixelWidthAspectRatio>
	//   49   95:invokestatic    #174 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List, int, float)>
	//   50   98:astore_1        
			output.format(((MediaFormat) (parsablebytearray)));
	//   51   99:aload_0         
	//   52  100:getfield        #178 <Field TrackOutput output>
	//   53  103:aload_1         
	//   54  104:invokeinterface #184 <Method void TrackOutput.format(MediaFormat)>
			hasOutputFormat = true;
	//   55  109:aload_0         
	//   56  110:iconst_1        
	//   57  111:putfield        #140 <Field boolean hasOutputFormat>
			return;
	//   58  114:return          
		}
		if(i == 1)
	//*  59  115:iload           4
	//*  60  117:iconst_1        
	//*  61  118:icmpne          285
		{
			byte abyte0[] = nalLength.data;
	//   62  121:aload_0         
	//   63  122:getfield        #46  <Field ParsableByteArray nalLength>
	//   64  125:getfield        #146 <Field byte[] ParsableByteArray.data>
	//   65  128:astore          9
			abyte0[0] = 0;
	//   66  130:aload           9
	//   67  132:iconst_0        
	//   68  133:iconst_0        
	//   69  134:bastore         
			abyte0[1] = 0;
	//   70  135:aload           9
	//   71  137:iconst_1        
	//   72  138:iconst_0        
	//   73  139:bastore         
			abyte0[2] = 0;
	//   74  140:aload           9
	//   75  142:iconst_2        
	//   76  143:iconst_0        
	//   77  144:bastore         
			int k = nalUnitLengthFieldLength;
	//   78  145:aload_0         
	//   79  146:getfield        #155 <Field int nalUnitLengthFieldLength>
	//   80  149:istore          5
			int j;
			int i1;
			for(j = 0; parsablebytearray.bytesLeft() > 0; j = j + 4 + i1)
	//*  81  151:iconst_0        
	//*  82  152:istore          4
	//*  83  154:aload_1         
	//*  84  155:invokevirtual   #143 <Method int ParsableByteArray.bytesLeft()>
	//*  85  158:ifle            243
			{
				parsablebytearray.readBytes(nalLength.data, 4 - k, nalUnitLengthFieldLength);
	//   86  161:aload_1         
	//   87  162:aload_0         
	//   88  163:getfield        #46  <Field ParsableByteArray nalLength>
	//   89  166:getfield        #146 <Field byte[] ParsableByteArray.data>
	//   90  169:iconst_4        
	//   91  170:iload           5
	//   92  172:isub            
	//   93  173:aload_0         
	//   94  174:getfield        #155 <Field int nalUnitLengthFieldLength>
	//   95  177:invokevirtual   #150 <Method void ParsableByteArray.readBytes(byte[], int, int)>
				nalLength.setPosition(0);
	//   96  180:aload_0         
	//   97  181:getfield        #46  <Field ParsableByteArray nalLength>
	//   98  184:iconst_0        
	//   99  185:invokevirtual   #54  <Method void ParsableByteArray.setPosition(int)>
				i1 = nalLength.readUnsignedIntToInt();
	//  100  188:aload_0         
	//  101  189:getfield        #46  <Field ParsableByteArray nalLength>
	//  102  192:invokevirtual   #187 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  103  195:istore          6
				nalStartCode.setPosition(0);
	//  104  197:aload_0         
	//  105  198:getfield        #41  <Field ParsableByteArray nalStartCode>
	//  106  201:iconst_0        
	//  107  202:invokevirtual   #54  <Method void ParsableByteArray.setPosition(int)>
				output.sampleData(nalStartCode, 4);
	//  108  205:aload_0         
	//  109  206:getfield        #178 <Field TrackOutput output>
	//  110  209:aload_0         
	//  111  210:getfield        #41  <Field ParsableByteArray nalStartCode>
	//  112  213:iconst_4        
	//  113  214:invokeinterface #191 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				output.sampleData(parsablebytearray, i1);
	//  114  219:aload_0         
	//  115  220:getfield        #178 <Field TrackOutput output>
	//  116  223:aload_1         
	//  117  224:iload           6
	//  118  226:invokeinterface #191 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			}

	//  119  231:iload           4
	//  120  233:iconst_4        
	//  121  234:iadd            
	//  122  235:iload           6
	//  123  237:iadd            
	//  124  238:istore          4
	//* 125  240:goto            154
			parsablebytearray = ((ParsableByteArray) (output));
	//  126  243:aload_0         
	//  127  244:getfield        #178 <Field TrackOutput output>
	//  128  247:astore_1        
			if(frameType == 1)
	//* 129  248:aload_0         
	//* 130  249:getfield        #114 <Field int frameType>
	//* 131  252:iconst_1        
	//* 132  253:icmpne          262
				k = 1;
	//  133  256:iconst_1        
	//  134  257:istore          5
			else
	//* 135  259:goto            265
				k = 0;
	//  136  262:iconst_0        
	//  137  263:istore          5
			((TrackOutput) (parsablebytearray)).sampleMetadata(l + l1 * 1000L, k, j, 0, ((byte []) (null)));
	//  138  265:aload_1         
	//  139  266:lload_2         
	//  140  267:lload           7
	//  141  269:ldc2w           #192 <Long 1000L>
	//  142  272:lmul            
	//  143  273:ladd            
	//  144  274:iload           5
	//  145  276:iload           4
	//  146  278:iconst_0        
	//  147  279:aconst_null     
	//  148  280:invokeinterface #197 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		}
	//  149  285:return          
	}

	public void seek()
	{
	//    0    0:return          
	}

	private static final int AVC_PACKET_TYPE_AVC_NALU = 1;
	private static final int AVC_PACKET_TYPE_SEQUENCE_HEADER = 0;
	private static final int VIDEO_CODEC_AVC = 7;
	private static final int VIDEO_FRAME_KEYFRAME = 1;
	private static final int VIDEO_FRAME_VIDEO_INFO = 5;
	private int frameType;
	private boolean hasOutputFormat;
	private final ParsableByteArray nalLength = new ParsableByteArray(4);
	private final ParsableByteArray nalStartCode;
	private int nalUnitLengthFieldLength;
}
