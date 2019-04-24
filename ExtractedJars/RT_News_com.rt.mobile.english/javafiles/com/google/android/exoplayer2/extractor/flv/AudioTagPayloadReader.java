// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.flv:
//			TagPayloadReader

final class AudioTagPayloadReader extends TagPayloadReader
{

	public AudioTagPayloadReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void TagPayloadReader(TrackOutput)>
	//    3    5:return          
	}

	protected boolean parseHeader(ParsableByteArray parsablebytearray)
		throws TagPayloadReader.UnsupportedFormatException
	{
		if(!hasParsedAudioDataHeader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean hasParsedAudioDataHeader>
	//*   2    4:ifne            213
		{
			int i = parsablebytearray.readUnsignedByte();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #45  <Method int ParsableByteArray.readUnsignedByte()>
	//    5   11:istore_2        
			audioFormat = i >> 4 & 0xf;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:iconst_4        
	//    9   15:ishr            
	//   10   16:bipush          15
	//   11   18:iand            
	//   12   19:putfield        #47  <Field int audioFormat>
			if(audioFormat == 2)
	//*  13   22:aload_0         
	//*  14   23:getfield        #47  <Field int audioFormat>
	//*  15   26:iconst_2        
	//*  16   27:icmpne          72
			{
				parsablebytearray = ((ParsableByteArray) (Format.createAudioSampleFormat(((String) (null)), "audio/mpeg", ((String) (null)), -1, -1, 1, AUDIO_SAMPLING_RATE_TABLE[i >> 2 & 3], ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)))));
	//   17   30:aconst_null     
	//   18   31:ldc1            #49  <String "audio/mpeg">
	//   19   33:aconst_null     
	//   20   34:iconst_m1       
	//   21   35:iconst_m1       
	//   22   36:iconst_1        
	//   23   37:getstatic       #28  <Field int[] AUDIO_SAMPLING_RATE_TABLE>
	//   24   40:iload_2         
	//   25   41:iconst_2        
	//   26   42:ishr            
	//   27   43:iconst_3        
	//   28   44:iand            
	//   29   45:iaload          
	//   30   46:aconst_null     
	//   31   47:aconst_null     
	//   32   48:iconst_0        
	//   33   49:aconst_null     
	//   34   50:invokestatic    #55  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   35   53:astore_1        
				output.format(((Format) (parsablebytearray)));
	//   36   54:aload_0         
	//   37   55:getfield        #59  <Field TrackOutput output>
	//   38   58:aload_1         
	//   39   59:invokeinterface #65  <Method void TrackOutput.format(Format)>
				hasOutputFormat = true;
	//   40   64:aload_0         
	//   41   65:iconst_1        
	//   42   66:putfield        #67  <Field boolean hasOutputFormat>
			} else
	//*  43   69:goto            206
			if(audioFormat != 7 && audioFormat != 8)
	//*  44   72:aload_0         
	//*  45   73:getfield        #47  <Field int audioFormat>
	//*  46   76:bipush          7
	//*  47   78:icmpeq          138
	//*  48   81:aload_0         
	//*  49   82:getfield        #47  <Field int audioFormat>
	//*  50   85:bipush          8
	//*  51   87:icmpne          93
	//*  52   90:goto            138
			{
				if(audioFormat != 10)
	//*  53   93:aload_0         
	//*  54   94:getfield        #47  <Field int audioFormat>
	//*  55   97:bipush          10
	//*  56   99:icmpeq          206
				{
					parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   57  102:new             #69  <Class StringBuilder>
	//   58  105:dup             
	//   59  106:invokespecial   #71  <Method void StringBuilder()>
	//   60  109:astore_1        
					((StringBuilder) (parsablebytearray)).append("Audio format not supported: ");
	//   61  110:aload_1         
	//   62  111:ldc1            #73  <String "Audio format not supported: ">
	//   63  113:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   64  116:pop             
					((StringBuilder) (parsablebytearray)).append(audioFormat);
	//   65  117:aload_1         
	//   66  118:aload_0         
	//   67  119:getfield        #47  <Field int audioFormat>
	//   68  122:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   69  125:pop             
					throw new TagPayloadReader.UnsupportedFormatException(((StringBuilder) (parsablebytearray)).toString());
	//   70  126:new             #37  <Class TagPayloadReader$UnsupportedFormatException>
	//   71  129:dup             
	//   72  130:aload_1         
	//   73  131:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   74  134:invokespecial   #87  <Method void TagPayloadReader$UnsupportedFormatException(String)>
	//   75  137:athrow          
				}
			} else
			{
				if(audioFormat == 7)
	//*  76  138:aload_0         
	//*  77  139:getfield        #47  <Field int audioFormat>
	//*  78  142:bipush          7
	//*  79  144:icmpne          153
					parsablebytearray = "audio/g711-alaw";
	//   80  147:ldc1            #89  <String "audio/g711-alaw">
	//   81  149:astore_1        
				else
	//*  82  150:goto            159
					parsablebytearray = "audio/g711-mlaw";
	//   83  153:ldc1            #91  <String "audio/g711-mlaw">
	//   84  155:astore_1        
	//*  85  156:goto            150
				if((i & 1) == 1)
	//*  86  159:iload_2         
	//*  87  160:iconst_1        
	//*  88  161:iand            
	//*  89  162:iconst_1        
	//*  90  163:icmpne          171
					i = 2;
	//   91  166:iconst_2        
	//   92  167:istore_2        
				else
	//*  93  168:goto            173
					i = 3;
	//   94  171:iconst_3        
	//   95  172:istore_2        
				parsablebytearray = ((ParsableByteArray) (Format.createAudioSampleFormat(((String) (null)), ((String) (parsablebytearray)), ((String) (null)), -1, -1, 1, 8000, i, ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)))));
	//   96  173:aconst_null     
	//   97  174:aload_1         
	//   98  175:aconst_null     
	//   99  176:iconst_m1       
	//  100  177:iconst_m1       
	//  101  178:iconst_1        
	//  102  179:sipush          8000
	//  103  182:iload_2         
	//  104  183:aconst_null     
	//  105  184:aconst_null     
	//  106  185:iconst_0        
	//  107  186:aconst_null     
	//  108  187:invokestatic    #94  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//  109  190:astore_1        
				output.format(((Format) (parsablebytearray)));
	//  110  191:aload_0         
	//  111  192:getfield        #59  <Field TrackOutput output>
	//  112  195:aload_1         
	//  113  196:invokeinterface #65  <Method void TrackOutput.format(Format)>
				hasOutputFormat = true;
	//  114  201:aload_0         
	//  115  202:iconst_1        
	//  116  203:putfield        #67  <Field boolean hasOutputFormat>
			}
			hasParsedAudioDataHeader = true;
	//  117  206:aload_0         
	//  118  207:iconst_1        
	//  119  208:putfield        #39  <Field boolean hasParsedAudioDataHeader>
			return true;
	//  120  211:iconst_1        
	//  121  212:ireturn         
		} else
		{
			parsablebytearray.skipBytes(1);
	//  122  213:aload_1         
	//  123  214:iconst_1        
	//  124  215:invokevirtual   #98  <Method void ParsableByteArray.skipBytes(int)>
			return true;
	//  125  218:iconst_1        
	//  126  219:ireturn         
		}
	}

	protected void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		if(audioFormat == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int audioFormat>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          42
		{
			int i = parsablebytearray.bytesLeft();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//    6   12:istore          4
			output.sampleData(parsablebytearray, i);
	//    7   14:aload_0         
	//    8   15:getfield        #59  <Field TrackOutput output>
	//    9   18:aload_1         
	//   10   19:iload           4
	//   11   21:invokeinterface #110 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			output.sampleMetadata(l, 1, i, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #59  <Field TrackOutput output>
	//   14   30:lload_2         
	//   15   31:iconst_1        
	//   16   32:iload           4
	//   17   34:iconst_0        
	//   18   35:aconst_null     
	//   19   36:invokeinterface #114 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			return;
	//   20   41:return          
		}
		int j = parsablebytearray.readUnsignedByte();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #45  <Method int ParsableByteArray.readUnsignedByte()>
	//   23   46:istore          4
		if(j == 0 && !hasOutputFormat)
	//*  24   48:iload           4
	//*  25   50:ifne            138
	//*  26   53:aload_0         
	//*  27   54:getfield        #67  <Field boolean hasOutputFormat>
	//*  28   57:ifne            138
		{
			byte abyte0[] = new byte[parsablebytearray.bytesLeft()];
	//   29   60:aload_1         
	//   30   61:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//   31   64:newarray        byte[]
	//   32   66:astore          5
			parsablebytearray.readBytes(abyte0, 0, abyte0.length);
	//   33   68:aload_1         
	//   34   69:aload           5
	//   35   71:iconst_0        
	//   36   72:aload           5
	//   37   74:arraylength     
	//   38   75:invokevirtual   #118 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			parsablebytearray = ((ParsableByteArray) (CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte0)));
	//   39   78:aload           5
	//   40   80:invokestatic    #124 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//   41   83:astore_1        
			parsablebytearray = ((ParsableByteArray) (Format.createAudioSampleFormat(((String) (null)), "audio/mp4a-latm", ((String) (null)), -1, -1, ((Integer)((Pair) (parsablebytearray)).second).intValue(), ((Integer)((Pair) (parsablebytearray)).first).intValue(), Collections.singletonList(((Object) (abyte0))), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)))));
	//   42   84:aconst_null     
	//   43   85:ldc1            #126 <String "audio/mp4a-latm">
	//   44   87:aconst_null     
	//   45   88:iconst_m1       
	//   46   89:iconst_m1       
	//   47   90:aload_1         
	//   48   91:getfield        #132 <Field Object Pair.second>
	//   49   94:checkcast       #134 <Class Integer>
	//   50   97:invokevirtual   #137 <Method int Integer.intValue()>
	//   51  100:aload_1         
	//   52  101:getfield        #140 <Field Object Pair.first>
	//   53  104:checkcast       #134 <Class Integer>
	//   54  107:invokevirtual   #137 <Method int Integer.intValue()>
	//   55  110:aload           5
	//   56  112:invokestatic    #146 <Method java.util.List Collections.singletonList(Object)>
	//   57  115:aconst_null     
	//   58  116:iconst_0        
	//   59  117:aconst_null     
	//   60  118:invokestatic    #55  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   61  121:astore_1        
			output.format(((Format) (parsablebytearray)));
	//   62  122:aload_0         
	//   63  123:getfield        #59  <Field TrackOutput output>
	//   64  126:aload_1         
	//   65  127:invokeinterface #65  <Method void TrackOutput.format(Format)>
			hasOutputFormat = true;
	//   66  132:aload_0         
	//   67  133:iconst_1        
	//   68  134:putfield        #67  <Field boolean hasOutputFormat>
			return;
	//   69  137:return          
		}
		if(audioFormat != 10 || j == 1)
	//*  70  138:aload_0         
	//*  71  139:getfield        #47  <Field int audioFormat>
	//*  72  142:bipush          10
	//*  73  144:icmpne          153
	//*  74  147:iload           4
	//*  75  149:iconst_1        
	//*  76  150:icmpne          186
		{
			int k = parsablebytearray.bytesLeft();
	//   77  153:aload_1         
	//   78  154:invokevirtual   #106 <Method int ParsableByteArray.bytesLeft()>
	//   79  157:istore          4
			output.sampleData(parsablebytearray, k);
	//   80  159:aload_0         
	//   81  160:getfield        #59  <Field TrackOutput output>
	//   82  163:aload_1         
	//   83  164:iload           4
	//   84  166:invokeinterface #110 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			output.sampleMetadata(l, 1, k, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   85  171:aload_0         
	//   86  172:getfield        #59  <Field TrackOutput output>
	//   87  175:lload_2         
	//   88  176:iconst_1        
	//   89  177:iload           4
	//   90  179:iconst_0        
	//   91  180:aconst_null     
	//   92  181:invokeinterface #114 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		}
	//   93  186:return          
	}

	public void seek()
	{
	//    0    0:return          
	}

	private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
	private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
	private static final int AUDIO_FORMAT_AAC = 10;
	private static final int AUDIO_FORMAT_ALAW = 7;
	private static final int AUDIO_FORMAT_MP3 = 2;
	private static final int AUDIO_FORMAT_ULAW = 8;
	private static final int AUDIO_SAMPLING_RATE_TABLE[] = {
		5512, 11025, 22050, 44100
	};
	private int audioFormat;
	private boolean hasOutputFormat;
	private boolean hasParsedAudioDataHeader;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          5512
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:sipush          11025
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:sipush          22050
	//   13   20:iastore         
	//   14   21:dup             
	//   15   22:iconst_3        
	//   16   23:ldc1            #26  <Int 44100>
	//   17   25:iastore         
	//   18   26:putstatic       #28  <Field int[] AUDIO_SAMPLING_RATE_TABLE>
	//*  19   29:return          
	}
}
