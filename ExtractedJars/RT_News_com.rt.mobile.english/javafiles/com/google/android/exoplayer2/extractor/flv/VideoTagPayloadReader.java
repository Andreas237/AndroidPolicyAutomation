// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;

// Referenced classes of package com.google.android.exoplayer2.extractor.flv:
//			TagPayloadReader

final class VideoTagPayloadReader extends TagPayloadReader
{

	public VideoTagPayloadReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void TagPayloadReader(TrackOutput)>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//    3    5:aload_0         
	//    4    6:new             #27  <Class ParsableByteArray>
	//    5    9:dup             
	//    6   10:getstatic       #33  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//    7   13:invokespecial   #36  <Method void ParsableByteArray(byte[])>
	//    8   16:putfield        #38  <Field ParsableByteArray nalStartCode>
	//    9   19:aload_0         
	//   10   20:new             #27  <Class ParsableByteArray>
	//   11   23:dup             
	//   12   24:iconst_4        
	//   13   25:invokespecial   #41  <Method void ParsableByteArray(int)>
	//   14   28:putfield        #43  <Field ParsableByteArray nalLength>
	//   15   31:return          
	}

	protected boolean parseHeader(ParsableByteArray parsablebytearray)
		throws TagPayloadReader.UnsupportedFormatException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedByte()>
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
		if(j != 7)
	//*  13   17:iload_3         
	//*  14   18:bipush          7
	//*  15   20:icmpeq          56
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   16   23:new             #54  <Class StringBuilder>
	//   17   26:dup             
	//   18   27:invokespecial   #57  <Method void StringBuilder()>
	//   19   30:astore_1        
			((StringBuilder) (parsablebytearray)).append("Video format not supported: ");
	//   20   31:aload_1         
	//   21   32:ldc1            #59  <String "Video format not supported: ">
	//   22   34:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   23   37:pop             
			((StringBuilder) (parsablebytearray)).append(j);
	//   24   38:aload_1         
	//   25   39:iload_3         
	//   26   40:invokevirtual   #66  <Method StringBuilder StringBuilder.append(int)>
	//   27   43:pop             
			throw new TagPayloadReader.UnsupportedFormatException(((StringBuilder) (parsablebytearray)).toString());
	//   28   44:new             #48  <Class TagPayloadReader$UnsupportedFormatException>
	//   29   47:dup             
	//   30   48:aload_1         
	//   31   49:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   32   52:invokespecial   #73  <Method void TagPayloadReader$UnsupportedFormatException(String)>
	//   33   55:athrow          
		}
		frameType = i;
	//   34   56:aload_0         
	//   35   57:iload_2         
	//   36   58:putfield        #75  <Field int frameType>
		return i != 5;
	//   37   61:iload_2         
	//   38   62:iconst_5        
	//   39   63:icmpeq          68
	//   40   66:iconst_1        
	//   41   67:ireturn         
	//   42   68:iconst_0        
	//   43   69:ireturn         
	}

	protected void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore          4
		long l1 = parsablebytearray.readInt24();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #83  <Method int ParsableByteArray.readInt24()>
	//    5   10:i2l             
	//    6   11:lstore          7
		if(i == 0 && !hasOutputFormat)
	//*   7   13:iload           4
	//*   8   15:ifne            114
	//*   9   18:aload_0         
	//*  10   19:getfield        #85  <Field boolean hasOutputFormat>
	//*  11   22:ifne            114
		{
			ParsableByteArray parsablebytearray1 = new ParsableByteArray(new byte[parsablebytearray.bytesLeft()]);
	//   12   25:new             #27  <Class ParsableByteArray>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokevirtual   #88  <Method int ParsableByteArray.bytesLeft()>
	//   16   33:newarray        byte[]
	//   17   35:invokespecial   #36  <Method void ParsableByteArray(byte[])>
	//   18   38:astore          9
			parsablebytearray.readBytes(parsablebytearray1.data, 0, parsablebytearray.bytesLeft());
	//   19   40:aload_1         
	//   20   41:aload           9
	//   21   43:getfield        #91  <Field byte[] ParsableByteArray.data>
	//   22   46:iconst_0        
	//   23   47:aload_1         
	//   24   48:invokevirtual   #88  <Method int ParsableByteArray.bytesLeft()>
	//   25   51:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			parsablebytearray = ((ParsableByteArray) (AvcConfig.parse(parsablebytearray1)));
	//   26   54:aload           9
	//   27   56:invokestatic    #101 <Method AvcConfig AvcConfig.parse(ParsableByteArray)>
	//   28   59:astore_1        
			nalUnitLengthFieldLength = ((AvcConfig) (parsablebytearray)).nalUnitLengthFieldLength;
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:getfield        #103 <Field int AvcConfig.nalUnitLengthFieldLength>
	//   32   65:putfield        #104 <Field int nalUnitLengthFieldLength>
			parsablebytearray = ((ParsableByteArray) (Format.createVideoSampleFormat(((String) (null)), "video/avc", ((String) (null)), -1, -1, ((AvcConfig) (parsablebytearray)).width, ((AvcConfig) (parsablebytearray)).height, -1F, ((AvcConfig) (parsablebytearray)).initializationData, -1, ((AvcConfig) (parsablebytearray)).pixelWidthAspectRatio, ((com.google.android.exoplayer2.drm.DrmInitData) (null)))));
	//   33   68:aconst_null     
	//   34   69:ldc1            #106 <String "video/avc">
	//   35   71:aconst_null     
	//   36   72:iconst_m1       
	//   37   73:iconst_m1       
	//   38   74:aload_1         
	//   39   75:getfield        #109 <Field int AvcConfig.width>
	//   40   78:aload_1         
	//   41   79:getfield        #112 <Field int AvcConfig.height>
	//   42   82:ldc1            #113 <Float -1F>
	//   43   84:aload_1         
	//   44   85:getfield        #117 <Field java.util.List AvcConfig.initializationData>
	//   45   88:iconst_m1       
	//   46   89:aload_1         
	//   47   90:getfield        #121 <Field float AvcConfig.pixelWidthAspectRatio>
	//   48   93:aconst_null     
	//   49   94:invokestatic    #127 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, java.util.List, int, float, com.google.android.exoplayer2.drm.DrmInitData)>
	//   50   97:astore_1        
			output.format(((Format) (parsablebytearray)));
	//   51   98:aload_0         
	//   52   99:getfield        #131 <Field TrackOutput output>
	//   53  102:aload_1         
	//   54  103:invokeinterface #137 <Method void TrackOutput.format(Format)>
			hasOutputFormat = true;
	//   55  108:aload_0         
	//   56  109:iconst_1        
	//   57  110:putfield        #85  <Field boolean hasOutputFormat>
			return;
	//   58  113:return          
		}
		if(i == 1 && hasOutputFormat)
	//*  59  114:iload           4
	//*  60  116:iconst_1        
	//*  61  117:icmpne          291
	//*  62  120:aload_0         
	//*  63  121:getfield        #85  <Field boolean hasOutputFormat>
	//*  64  124:ifeq            291
		{
			byte abyte0[] = nalLength.data;
	//   65  127:aload_0         
	//   66  128:getfield        #43  <Field ParsableByteArray nalLength>
	//   67  131:getfield        #91  <Field byte[] ParsableByteArray.data>
	//   68  134:astore          9
			abyte0[0] = 0;
	//   69  136:aload           9
	//   70  138:iconst_0        
	//   71  139:iconst_0        
	//   72  140:bastore         
			abyte0[1] = 0;
	//   73  141:aload           9
	//   74  143:iconst_1        
	//   75  144:iconst_0        
	//   76  145:bastore         
			abyte0[2] = 0;
	//   77  146:aload           9
	//   78  148:iconst_2        
	//   79  149:iconst_0        
	//   80  150:bastore         
			int k = nalUnitLengthFieldLength;
	//   81  151:aload_0         
	//   82  152:getfield        #104 <Field int nalUnitLengthFieldLength>
	//   83  155:istore          5
			int j;
			int i1;
			for(j = 0; parsablebytearray.bytesLeft() > 0; j = j + 4 + i1)
	//*  84  157:iconst_0        
	//*  85  158:istore          4
	//*  86  160:aload_1         
	//*  87  161:invokevirtual   #88  <Method int ParsableByteArray.bytesLeft()>
	//*  88  164:ifle            249
			{
				parsablebytearray.readBytes(nalLength.data, 4 - k, nalUnitLengthFieldLength);
	//   89  167:aload_1         
	//   90  168:aload_0         
	//   91  169:getfield        #43  <Field ParsableByteArray nalLength>
	//   92  172:getfield        #91  <Field byte[] ParsableByteArray.data>
	//   93  175:iconst_4        
	//   94  176:iload           5
	//   95  178:isub            
	//   96  179:aload_0         
	//   97  180:getfield        #104 <Field int nalUnitLengthFieldLength>
	//   98  183:invokevirtual   #95  <Method void ParsableByteArray.readBytes(byte[], int, int)>
				nalLength.setPosition(0);
	//   99  186:aload_0         
	//  100  187:getfield        #43  <Field ParsableByteArray nalLength>
	//  101  190:iconst_0        
	//  102  191:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
				i1 = nalLength.readUnsignedIntToInt();
	//  103  194:aload_0         
	//  104  195:getfield        #43  <Field ParsableByteArray nalLength>
	//  105  198:invokevirtual   #143 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  106  201:istore          6
				nalStartCode.setPosition(0);
	//  107  203:aload_0         
	//  108  204:getfield        #38  <Field ParsableByteArray nalStartCode>
	//  109  207:iconst_0        
	//  110  208:invokevirtual   #140 <Method void ParsableByteArray.setPosition(int)>
				output.sampleData(nalStartCode, 4);
	//  111  211:aload_0         
	//  112  212:getfield        #131 <Field TrackOutput output>
	//  113  215:aload_0         
	//  114  216:getfield        #38  <Field ParsableByteArray nalStartCode>
	//  115  219:iconst_4        
	//  116  220:invokeinterface #147 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				output.sampleData(parsablebytearray, i1);
	//  117  225:aload_0         
	//  118  226:getfield        #131 <Field TrackOutput output>
	//  119  229:aload_1         
	//  120  230:iload           6
	//  121  232:invokeinterface #147 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			}

	//  122  237:iload           4
	//  123  239:iconst_4        
	//  124  240:iadd            
	//  125  241:iload           6
	//  126  243:iadd            
	//  127  244:istore          4
	//* 128  246:goto            160
			parsablebytearray = ((ParsableByteArray) (output));
	//  129  249:aload_0         
	//  130  250:getfield        #131 <Field TrackOutput output>
	//  131  253:astore_1        
			if(frameType == 1)
	//* 132  254:aload_0         
	//* 133  255:getfield        #75  <Field int frameType>
	//* 134  258:iconst_1        
	//* 135  259:icmpne          268
				k = 1;
	//  136  262:iconst_1        
	//  137  263:istore          5
			else
	//* 138  265:goto            271
				k = 0;
	//  139  268:iconst_0        
	//  140  269:istore          5
			((TrackOutput) (parsablebytearray)).sampleMetadata(l + l1 * 1000L, k, j, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//  141  271:aload_1         
	//  142  272:lload_2         
	//  143  273:lload           7
	//  144  275:ldc2w           #148 <Long 1000L>
	//  145  278:lmul            
	//  146  279:ladd            
	//  147  280:iload           5
	//  148  282:iload           4
	//  149  284:iconst_0        
	//  150  285:aconst_null     
	//  151  286:invokeinterface #153 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		}
	//  152  291:return          
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
