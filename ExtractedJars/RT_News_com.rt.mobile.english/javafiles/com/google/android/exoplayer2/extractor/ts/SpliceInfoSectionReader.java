// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			SectionPayloadReader

public final class SpliceInfoSectionReader
	implements SectionPayloadReader
{

	public SpliceInfoSectionReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(!formatDeclared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean formatDeclared>
	//*   2    4:ifne            49
		{
			if(timestampAdjuster.getTimestampOffsetUs() == 0x1L)
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field TimestampAdjuster timestampAdjuster>
	//*   5   11:invokevirtual   #29  <Method long TimestampAdjuster.getTimestampOffsetUs()>
	//*   6   14:ldc2w           #30  <Long 0x1L>
	//*   7   17:lcmp            
	//*   8   18:ifne            22
				return;
	//    9   21:return          
			output.format(Format.createSampleFormat(((String) (null)), "application/x-scte35", timestampAdjuster.getTimestampOffsetUs()));
	//   10   22:aload_0         
	//   11   23:getfield        #33  <Field TrackOutput output>
	//   12   26:aconst_null     
	//   13   27:ldc1            #35  <String "application/x-scte35">
	//   14   29:aload_0         
	//   15   30:getfield        #23  <Field TimestampAdjuster timestampAdjuster>
	//   16   33:invokevirtual   #29  <Method long TimestampAdjuster.getTimestampOffsetUs()>
	//   17   36:invokestatic    #41  <Method Format Format.createSampleFormat(String, String, long)>
	//   18   39:invokeinterface #47  <Method void TrackOutput.format(Format)>
			formatDeclared = true;
	//   19   44:aload_0         
	//   20   45:iconst_1        
	//   21   46:putfield        #21  <Field boolean formatDeclared>
		}
		int i = parsablebytearray.bytesLeft();
	//   22   49:aload_1         
	//   23   50:invokevirtual   #53  <Method int ParsableByteArray.bytesLeft()>
	//   24   53:istore_2        
		output.sampleData(parsablebytearray, i);
	//   25   54:aload_0         
	//   26   55:getfield        #33  <Field TrackOutput output>
	//   27   58:aload_1         
	//   28   59:iload_2         
	//   29   60:invokeinterface #57  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		output.sampleMetadata(timestampAdjuster.getLastAdjustedTimestampUs(), 1, i, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   30   65:aload_0         
	//   31   66:getfield        #33  <Field TrackOutput output>
	//   32   69:aload_0         
	//   33   70:getfield        #23  <Field TimestampAdjuster timestampAdjuster>
	//   34   73:invokevirtual   #60  <Method long TimestampAdjuster.getLastAdjustedTimestampUs()>
	//   35   76:iconst_1        
	//   36   77:iload_2         
	//   37   78:iconst_0        
	//   38   79:aconst_null     
	//   39   80:invokeinterface #64  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//   40   85:return          
	}

	public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		timestampAdjuster = timestampadjuster;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field TimestampAdjuster timestampAdjuster>
		trackidgenerator.generateNewId();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #71  <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 4);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #74  <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//    9   15:iconst_4        
	//   10   16:invokeinterface #80  <Method TrackOutput ExtractorOutput.track(int, int)>
	//   11   21:putfield        #33  <Field TrackOutput output>
		output.format(Format.createSampleFormat(trackidgenerator.getFormatId(), "application/x-scte35", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field TrackOutput output>
	//   14   28:aload_3         
	//   15   29:invokevirtual   #84  <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//   16   32:ldc1            #35  <String "application/x-scte35">
	//   17   34:aconst_null     
	//   18   35:iconst_m1       
	//   19   36:aconst_null     
	//   20   37:invokestatic    #87  <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   21   40:invokeinterface #47  <Method void TrackOutput.format(Format)>
	//   22   45:return          
	}

	private boolean formatDeclared;
	private TrackOutput output;
	private TimestampAdjuster timestampAdjuster;
}
