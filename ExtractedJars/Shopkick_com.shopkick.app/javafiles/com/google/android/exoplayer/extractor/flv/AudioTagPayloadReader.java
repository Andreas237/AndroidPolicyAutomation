// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.CodecSpecificDataUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.flv:
//			TagPayloadReader

final class AudioTagPayloadReader extends TagPayloadReader
{

	public AudioTagPayloadReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void TagPayloadReader(TrackOutput)>
	//    3    5:return          
	}

	protected boolean parseHeader(ParsableByteArray parsablebytearray)
		throws TagPayloadReader.UnsupportedFormatException
	{
		if(!hasParsedAudioDataHeader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean hasParsedAudioDataHeader>
	//*   2    4:ifne            116
		{
			int j = parsablebytearray.readUnsignedByte();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #38  <Method int ParsableByteArray.readUnsignedByte()>
	//    5   11:istore_3        
			int i = j >> 4 & 0xf;
	//    6   12:iload_3         
	//    7   13:iconst_4        
	//    8   14:ishr            
	//    9   15:bipush          15
	//   10   17:iand            
	//   11   18:istore_2        
			j = j >> 2 & 3;
	//   12   19:iload_3         
	//   13   20:iconst_2        
	//   14   21:ishr            
	//   15   22:iconst_3        
	//   16   23:iand            
	//   17   24:istore_3        
			if(j >= 0 && j < AUDIO_SAMPLING_RATE_TABLE.length)
	//*  18   25:iload_3         
	//*  19   26:iflt            83
	//*  20   29:iload_3         
	//*  21   30:getstatic       #21  <Field int[] AUDIO_SAMPLING_RATE_TABLE>
	//*  22   33:arraylength     
	//*  23   34:icmpge          83
			{
				if(i == 10)
	//*  24   37:iload_2         
	//*  25   38:bipush          10
	//*  26   40:icmpne          50
				{
					hasParsedAudioDataHeader = true;
	//   27   43:aload_0         
	//   28   44:iconst_1        
	//   29   45:putfield        #32  <Field boolean hasParsedAudioDataHeader>
					return true;
	//   30   48:iconst_1        
	//   31   49:ireturn         
				} else
				{
					parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   32   50:new             #40  <Class StringBuilder>
	//   33   53:dup             
	//   34   54:invokespecial   #42  <Method void StringBuilder()>
	//   35   57:astore_1        
					((StringBuilder) (parsablebytearray)).append("Audio format not supported: ");
	//   36   58:aload_1         
	//   37   59:ldc1            #44  <String "Audio format not supported: ">
	//   38   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   39   64:pop             
					((StringBuilder) (parsablebytearray)).append(i);
	//   40   65:aload_1         
	//   41   66:iload_2         
	//   42   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   43   70:pop             
					throw new TagPayloadReader.UnsupportedFormatException(((StringBuilder) (parsablebytearray)).toString());
	//   44   71:new             #30  <Class TagPayloadReader$UnsupportedFormatException>
	//   45   74:dup             
	//   46   75:aload_1         
	//   47   76:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   48   79:invokespecial   #58  <Method void TagPayloadReader$UnsupportedFormatException(String)>
	//   49   82:athrow          
				}
			} else
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   50   83:new             #40  <Class StringBuilder>
	//   51   86:dup             
	//   52   87:invokespecial   #42  <Method void StringBuilder()>
	//   53   90:astore_1        
				((StringBuilder) (parsablebytearray)).append("Invalid sample rate index: ");
	//   54   91:aload_1         
	//   55   92:ldc1            #60  <String "Invalid sample rate index: ">
	//   56   94:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   57   97:pop             
				((StringBuilder) (parsablebytearray)).append(j);
	//   58   98:aload_1         
	//   59   99:iload_3         
	//   60  100:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   61  103:pop             
				throw new TagPayloadReader.UnsupportedFormatException(((StringBuilder) (parsablebytearray)).toString());
	//   62  104:new             #30  <Class TagPayloadReader$UnsupportedFormatException>
	//   63  107:dup             
	//   64  108:aload_1         
	//   65  109:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   66  112:invokespecial   #58  <Method void TagPayloadReader$UnsupportedFormatException(String)>
	//   67  115:athrow          
			}
		} else
		{
			parsablebytearray.skipBytes(1);
	//   68  116:aload_1         
	//   69  117:iconst_1        
	//   70  118:invokevirtual   #64  <Method void ParsableByteArray.skipBytes(int)>
			return true;
	//   71  121:iconst_1        
	//   72  122:ireturn         
		}
	}

	protected void parsePayload(ParsableByteArray parsablebytearray, long l)
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore          4
		if(i == 0 && !hasOutputFormat)
	//*   3    6:iload           4
	//*   4    8:ifne            97
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field boolean hasOutputFormat>
	//*   7   15:ifne            97
		{
			byte abyte0[] = new byte[parsablebytearray.bytesLeft()];
	//    8   18:aload_1         
	//    9   19:invokevirtual   #72  <Method int ParsableByteArray.bytesLeft()>
	//   10   22:newarray        byte[]
	//   11   24:astore          5
			parsablebytearray.readBytes(abyte0, 0, abyte0.length);
	//   12   26:aload_1         
	//   13   27:aload           5
	//   14   29:iconst_0        
	//   15   30:aload           5
	//   16   32:arraylength     
	//   17   33:invokevirtual   #76  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			parsablebytearray = ((ParsableByteArray) (CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte0)));
	//   18   36:aload           5
	//   19   38:invokestatic    #82  <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//   20   41:astore_1        
			parsablebytearray = ((ParsableByteArray) (MediaFormat.createAudioFormat(((String) (null)), "audio/mp4a-latm", -1, -1, getDurationUs(), ((Integer)((Pair) (parsablebytearray)).second).intValue(), ((Integer)((Pair) (parsablebytearray)).first).intValue(), Collections.singletonList(((Object) (abyte0))), ((String) (null)))));
	//   21   42:aconst_null     
	//   22   43:ldc1            #84  <String "audio/mp4a-latm">
	//   23   45:iconst_m1       
	//   24   46:iconst_m1       
	//   25   47:aload_0         
	//   26   48:invokevirtual   #88  <Method long getDurationUs()>
	//   27   51:aload_1         
	//   28   52:getfield        #94  <Field Object Pair.second>
	//   29   55:checkcast       #96  <Class Integer>
	//   30   58:invokevirtual   #99  <Method int Integer.intValue()>
	//   31   61:aload_1         
	//   32   62:getfield        #102 <Field Object Pair.first>
	//   33   65:checkcast       #96  <Class Integer>
	//   34   68:invokevirtual   #99  <Method int Integer.intValue()>
	//   35   71:aload           5
	//   36   73:invokestatic    #108 <Method java.util.List Collections.singletonList(Object)>
	//   37   76:aconst_null     
	//   38   77:invokestatic    #114 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   39   80:astore_1        
			output.format(((MediaFormat) (parsablebytearray)));
	//   40   81:aload_0         
	//   41   82:getfield        #118 <Field TrackOutput output>
	//   42   85:aload_1         
	//   43   86:invokeinterface #124 <Method void TrackOutput.format(MediaFormat)>
			hasOutputFormat = true;
	//   44   91:aload_0         
	//   45   92:iconst_1        
	//   46   93:putfield        #69  <Field boolean hasOutputFormat>
			return;
	//   47   96:return          
		}
		if(i == 1)
	//*  48   97:iload           4
	//*  49   99:iconst_1        
	//*  50  100:icmpne          136
		{
			int j = parsablebytearray.bytesLeft();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #72  <Method int ParsableByteArray.bytesLeft()>
	//   53  107:istore          4
			output.sampleData(parsablebytearray, j);
	//   54  109:aload_0         
	//   55  110:getfield        #118 <Field TrackOutput output>
	//   56  113:aload_1         
	//   57  114:iload           4
	//   58  116:invokeinterface #128 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			output.sampleMetadata(l, 1, j, 0, ((byte []) (null)));
	//   59  121:aload_0         
	//   60  122:getfield        #118 <Field TrackOutput output>
	//   61  125:lload_2         
	//   62  126:iconst_1        
	//   63  127:iload           4
	//   64  129:iconst_0        
	//   65  130:aconst_null     
	//   66  131:invokeinterface #132 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		}
	//   67  136:return          
	}

	public void seek()
	{
	//    0    0:return          
	}

	private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
	private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
	private static final int AUDIO_FORMAT_AAC = 10;
	private static final int AUDIO_SAMPLING_RATE_TABLE[] = {
		5500, 11000, 22000, 44000
	};
	private boolean hasOutputFormat;
	private boolean hasParsedAudioDataHeader;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          5500
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:sipush          11000
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:sipush          22000
	//   13   20:iastore         
	//   14   21:dup             
	//   15   22:iconst_3        
	//   16   23:ldc1            #19  <Int 44000>
	//   17   25:iastore         
	//   18   26:putstatic       #21  <Field int[] AUDIO_SAMPLING_RATE_TABLE>
	//*  19   29:return          
	}
}
