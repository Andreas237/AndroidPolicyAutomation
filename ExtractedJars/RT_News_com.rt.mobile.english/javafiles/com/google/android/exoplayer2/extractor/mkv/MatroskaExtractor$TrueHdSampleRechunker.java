// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			MatroskaExtractor

private static final class MatroskaExtractor$TrueHdSampleRechunker
{

	public void outputPendingSampleMetadata(MatroskaExtractor.Track track)
	{
		if(foundSyncframe && sampleCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean foundSyncframe>
	//*   2    4:ifeq            45
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field int sampleCount>
	//*   5   11:ifle            45
		{
			track.output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, track.cryptoData);
	//    6   14:aload_1         
	//    7   15:getfield        #36  <Field TrackOutput MatroskaExtractor$Track.output>
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field long timeUs>
	//   10   22:aload_0         
	//   11   23:getfield        #40  <Field int blockFlags>
	//   12   26:aload_0         
	//   13   27:getfield        #42  <Field int chunkSize>
	//   14   30:iconst_0        
	//   15   31:aload_1         
	//   16   32:getfield        #46  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
	//   17   35:invokeinterface #52  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			sampleCount = 0;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #30  <Field int sampleCount>
		}
	//   21   45:return          
	}

	public void reset()
	{
		foundSyncframe = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field boolean foundSyncframe>
	//    3    5:return          
	}

	public void sampleMetadata(MatroskaExtractor.Track track, long l)
	{
		if(!foundSyncframe)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean foundSyncframe>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i = sampleCount;
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field int sampleCount>
	//    6   12:istore          4
		sampleCount = i + 1;
	//    7   14:aload_0         
	//    8   15:iload           4
	//    9   17:iconst_1        
	//   10   18:iadd            
	//   11   19:putfield        #30  <Field int sampleCount>
		if(i == 0)
	//*  12   22:iload           4
	//*  13   24:ifne            32
			timeUs = l;
	//   14   27:aload_0         
	//   15   28:lload_2         
	//   16   29:putfield        #38  <Field long timeUs>
		if(sampleCount < 16)
	//*  17   32:aload_0         
	//*  18   33:getfield        #30  <Field int sampleCount>
	//*  19   36:bipush          16
	//*  20   38:icmpge          42
		{
			return;
	//   21   41:return          
		} else
		{
			track.output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, track.cryptoData);
	//   22   42:aload_1         
	//   23   43:getfield        #36  <Field TrackOutput MatroskaExtractor$Track.output>
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field long timeUs>
	//   26   50:aload_0         
	//   27   51:getfield        #40  <Field int blockFlags>
	//   28   54:aload_0         
	//   29   55:getfield        #42  <Field int chunkSize>
	//   30   58:iconst_0        
	//   31   59:aload_1         
	//   32   60:getfield        #46  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData MatroskaExtractor$Track.cryptoData>
	//   33   63:invokeinterface #52  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			sampleCount = 0;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #30  <Field int sampleCount>
			return;
	//   37   73:return          
		}
	}

	public void startSample(ExtractorInput extractorinput, int i, int j)
		throws IOException, InterruptedException
	{
		if(!foundSyncframe)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean foundSyncframe>
	//*   2    4:ifne            48
		{
			extractorinput.peekFully(syncframePrefix, 0, 10);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field byte[] syncframePrefix>
	//    6   12:iconst_0        
	//    7   13:bipush          10
	//    8   15:invokeinterface #66  <Method void ExtractorInput.peekFully(byte[], int, int)>
			extractorinput.resetPeekPosition();
	//    9   20:aload_1         
	//   10   21:invokeinterface #69  <Method void ExtractorInput.resetPeekPosition()>
			if(Ac3Util.parseTrueHdSyncframeAudioSampleCount(syncframePrefix) == -1)
	//*  11   26:aload_0         
	//*  12   27:getfield        #23  <Field byte[] syncframePrefix>
	//*  13   30:invokestatic    #75  <Method int Ac3Util.parseTrueHdSyncframeAudioSampleCount(byte[])>
	//*  14   33:iconst_m1       
	//*  15   34:icmpne          38
				return;
	//   16   37:return          
			foundSyncframe = true;
	//   17   38:aload_0         
	//   18   39:iconst_1        
	//   19   40:putfield        #28  <Field boolean foundSyncframe>
			sampleCount = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #30  <Field int sampleCount>
		}
		if(sampleCount == 0)
	//*  23   48:aload_0         
	//*  24   49:getfield        #30  <Field int sampleCount>
	//*  25   52:ifne            65
		{
			blockFlags = i;
	//   26   55:aload_0         
	//   27   56:iload_2         
	//   28   57:putfield        #40  <Field int blockFlags>
			chunkSize = 0;
	//   29   60:aload_0         
	//   30   61:iconst_0        
	//   31   62:putfield        #42  <Field int chunkSize>
		}
		chunkSize = chunkSize + j;
	//   32   65:aload_0         
	//   33   66:aload_0         
	//   34   67:getfield        #42  <Field int chunkSize>
	//   35   70:iload_3         
	//   36   71:iadd            
	//   37   72:putfield        #42  <Field int chunkSize>
	//   38   75:return          
	}

	private int blockFlags;
	private int chunkSize;
	private boolean foundSyncframe;
	private int sampleCount;
	private final byte syncframePrefix[] = new byte[10];
	private long timeUs;

	public MatroskaExtractor$TrueHdSampleRechunker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          10
	//    4    7:newarray        byte[]
	//    5    9:putfield        #23  <Field byte[] syncframePrefix>
	//    6   12:return          
	}
}
