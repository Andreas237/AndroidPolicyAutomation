// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class Id3Reader
	implements ElementaryStreamReader
{

	public Id3Reader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #32  <Method void ParsableByteArray(int)>
	//    7   14:putfield        #34  <Field ParsableByteArray id3Header>
	//    8   17:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(!writingSample)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean writingSample>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i = parsablebytearray.bytesLeft();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #43  <Method int ParsableByteArray.bytesLeft()>
	//    6   12:istore_2        
		if(sampleBytesRead < 10)
	//*   7   13:aload_0         
	//*   8   14:getfield        #45  <Field int sampleBytesRead>
	//*   9   17:bipush          10
	//*  10   19:icmpge          154
		{
			int j = Math.min(i, 10 - sampleBytesRead);
	//   11   22:iload_2         
	//   12   23:bipush          10
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field int sampleBytesRead>
	//   15   29:isub            
	//   16   30:invokestatic    #51  <Method int Math.min(int, int)>
	//   17   33:istore_3        
			System.arraycopy(((Object) (parsablebytearray.data)), parsablebytearray.getPosition(), ((Object) (id3Header.data)), sampleBytesRead, j);
	//   18   34:aload_1         
	//   19   35:getfield        #55  <Field byte[] ParsableByteArray.data>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #58  <Method int ParsableByteArray.getPosition()>
	//   22   42:aload_0         
	//   23   43:getfield        #34  <Field ParsableByteArray id3Header>
	//   24   46:getfield        #55  <Field byte[] ParsableByteArray.data>
	//   25   49:aload_0         
	//   26   50:getfield        #45  <Field int sampleBytesRead>
	//   27   53:iload_3         
	//   28   54:invokestatic    #64  <Method void System.arraycopy(Object, int, Object, int, int)>
			if(sampleBytesRead + j == 10)
	//*  29   57:aload_0         
	//*  30   58:getfield        #45  <Field int sampleBytesRead>
	//*  31   61:iload_3         
	//*  32   62:iadd            
	//*  33   63:bipush          10
	//*  34   65:icmpne          154
			{
				id3Header.setPosition(0);
	//   35   68:aload_0         
	//   36   69:getfield        #34  <Field ParsableByteArray id3Header>
	//   37   72:iconst_0        
	//   38   73:invokevirtual   #67  <Method void ParsableByteArray.setPosition(int)>
				if(73 == id3Header.readUnsignedByte() && 68 == id3Header.readUnsignedByte() && 51 == id3Header.readUnsignedByte())
	//*  39   76:bipush          73
	//*  40   78:aload_0         
	//*  41   79:getfield        #34  <Field ParsableByteArray id3Header>
	//*  42   82:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//*  43   85:icmpne          140
	//*  44   88:bipush          68
	//*  45   90:aload_0         
	//*  46   91:getfield        #34  <Field ParsableByteArray id3Header>
	//*  47   94:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//*  48   97:icmpne          140
	//*  49  100:bipush          51
	//*  50  102:aload_0         
	//*  51  103:getfield        #34  <Field ParsableByteArray id3Header>
	//*  52  106:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//*  53  109:icmpeq          115
	//*  54  112:goto            140
				{
					id3Header.skipBytes(3);
	//   55  115:aload_0         
	//   56  116:getfield        #34  <Field ParsableByteArray id3Header>
	//   57  119:iconst_3        
	//   58  120:invokevirtual   #73  <Method void ParsableByteArray.skipBytes(int)>
					sampleSize = 10 + id3Header.readSynchSafeInt();
	//   59  123:aload_0         
	//   60  124:bipush          10
	//   61  126:aload_0         
	//   62  127:getfield        #34  <Field ParsableByteArray id3Header>
	//   63  130:invokevirtual   #76  <Method int ParsableByteArray.readSynchSafeInt()>
	//   64  133:iadd            
	//   65  134:putfield        #78  <Field int sampleSize>
				} else
	//*  66  137:goto            154
				{
					Log.w("Id3Reader", "Discarding invalid ID3 tag");
	//   67  140:ldc1            #13  <String "Id3Reader">
	//   68  142:ldc1            #80  <String "Discarding invalid ID3 tag">
	//   69  144:invokestatic    #86  <Method int Log.w(String, String)>
	//   70  147:pop             
					writingSample = false;
	//   71  148:aload_0         
	//   72  149:iconst_0        
	//   73  150:putfield        #39  <Field boolean writingSample>
					return;
	//   74  153:return          
				}
			}
		}
		i = Math.min(i, sampleSize - sampleBytesRead);
	//   75  154:iload_2         
	//   76  155:aload_0         
	//   77  156:getfield        #78  <Field int sampleSize>
	//   78  159:aload_0         
	//   79  160:getfield        #45  <Field int sampleBytesRead>
	//   80  163:isub            
	//   81  164:invokestatic    #51  <Method int Math.min(int, int)>
	//   82  167:istore_2        
		output.sampleData(parsablebytearray, i);
	//   83  168:aload_0         
	//   84  169:getfield        #88  <Field TrackOutput output>
	//   85  172:aload_1         
	//   86  173:iload_2         
	//   87  174:invokeinterface #94  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		sampleBytesRead = sampleBytesRead + i;
	//   88  179:aload_0         
	//   89  180:aload_0         
	//   90  181:getfield        #45  <Field int sampleBytesRead>
	//   91  184:iload_2         
	//   92  185:iadd            
	//   93  186:putfield        #45  <Field int sampleBytesRead>
	//   94  189:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #101 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 4);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #104 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//    6   10:iconst_4        
	//    7   11:invokeinterface #110 <Method TrackOutput ExtractorOutput.track(int, int)>
	//    8   16:putfield        #88  <Field TrackOutput output>
		output.format(Format.createSampleFormat(trackidgenerator.getFormatId(), "application/id3", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//    9   19:aload_0         
	//   10   20:getfield        #88  <Field TrackOutput output>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #114 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   13   27:ldc1            #116 <String "application/id3">
	//   14   29:aconst_null     
	//   15   30:iconst_m1       
	//   16   31:aconst_null     
	//   17   32:invokestatic    #122 <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   18   35:invokeinterface #126 <Method void TrackOutput.format(Format)>
	//   19   40:return          
	}

	public void packetFinished()
	{
		if(writingSample && sampleSize != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean writingSample>
	//*   2    4:ifeq            52
	//*   3    7:aload_0         
	//*   4    8:getfield        #78  <Field int sampleSize>
	//*   5   11:ifeq            52
		{
			if(sampleBytesRead != sampleSize)
	//*   6   14:aload_0         
	//*   7   15:getfield        #45  <Field int sampleBytesRead>
	//*   8   18:aload_0         
	//*   9   19:getfield        #78  <Field int sampleSize>
	//*  10   22:icmpeq          26
			{
				return;
	//   11   25:return          
			} else
			{
				output.sampleMetadata(sampleTimeUs, 1, sampleSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #88  <Field TrackOutput output>
	//   14   30:aload_0         
	//   15   31:getfield        #129 <Field long sampleTimeUs>
	//   16   34:iconst_1        
	//   17   35:aload_0         
	//   18   36:getfield        #78  <Field int sampleSize>
	//   19   39:iconst_0        
	//   20   40:aconst_null     
	//   21   41:invokeinterface #133 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
				writingSample = false;
	//   22   46:aload_0         
	//   23   47:iconst_0        
	//   24   48:putfield        #39  <Field boolean writingSample>
				return;
	//   25   51:return          
			}
		} else
		{
			return;
	//   26   52:return          
		}
	}

	public void packetStarted(long l, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_3         
	//*   1    1:ifne            5
		{
			return;
	//    2    4:return          
		} else
		{
			writingSample = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #39  <Field boolean writingSample>
			sampleTimeUs = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #129 <Field long sampleTimeUs>
			sampleSize = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #78  <Field int sampleSize>
			sampleBytesRead = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #45  <Field int sampleBytesRead>
			return;
	//   15   25:return          
		}
	}

	public void seek()
	{
		writingSample = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #39  <Field boolean writingSample>
	//    3    5:return          
	}

	private static final int ID3_HEADER_SIZE = 10;
	private static final String TAG = "Id3Reader";
	private final ParsableByteArray id3Header = new ParsableByteArray(10);
	private TrackOutput output;
	private int sampleBytesRead;
	private int sampleSize;
	private long sampleTimeUs;
	private boolean writingSample;
}
