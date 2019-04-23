// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

public class ChunkExtractorWrapper
	implements ExtractorOutput, TrackOutput
{
	public static interface SingleTrackOutput
		extends TrackOutput
	{

		public abstract void drmInitData(DrmInitData drminitdata);

		public abstract void seekMap(SeekMap seekmap);
	}


	public ChunkExtractorWrapper(Extractor extractor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		extractor = extractor1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Extractor extractor>
	//    5    9:return          
	}

	public void drmInitData(DrmInitData drminitdata)
	{
		output.drmInitData(drminitdata);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method void ChunkExtractorWrapper$SingleTrackOutput.drmInitData(DrmInitData)>
	//    4   10:return          
	}

	public void endTracks()
	{
		Assertions.checkState(seenTrack);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean seenTrack>
	//    2    4:invokestatic    #43  <Method void Assertions.checkState(boolean)>
	//    3    7:return          
	}

	public void format(MediaFormat mediaformat)
	{
		output.format(mediaformat);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:aload_1         
	//    3    5:invokeinterface #47  <Method void ChunkExtractorWrapper$SingleTrackOutput.format(MediaFormat)>
	//    4   10:return          
	}

	public void init(SingleTrackOutput singletrackoutput)
	{
		output = singletrackoutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
		if(!extractorInitialized)
	//*   3    5:aload_0         
	//*   4    6:getfield        #51  <Field boolean extractorInitialized>
	//*   5    9:ifne            28
		{
			extractor.init(((ExtractorOutput) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Extractor extractor>
	//    8   16:aload_0         
	//    9   17:invokeinterface #56  <Method void Extractor.init(ExtractorOutput)>
			extractorInitialized = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #51  <Field boolean extractorInitialized>
			return;
	//   13   27:return          
		} else
		{
			extractor.seek();
	//   14   28:aload_0         
	//   15   29:getfield        #27  <Field Extractor extractor>
	//   16   32:invokeinterface #59  <Method void Extractor.seek()>
			return;
	//   17   37:return          
		}
	}

	public int read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = extractor.read(extractorinput, ((com.google.android.exoplayer.extractor.PositionHolder) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Extractor extractor>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokeinterface #68  <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer.extractor.PositionHolder)>
	//    5   11:istore_2        
		boolean flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		if(i == 1)
	//*   8   14:iload_2         
	//*   9   15:iconst_1        
	//*  10   16:icmpeq          22
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_3        
		Assertions.checkState(flag);
	//   14   24:iload_3         
	//   15   25:invokestatic    #43  <Method void Assertions.checkState(boolean)>
		return i;
	//   16   28:iload_2         
	//   17   29:ireturn         
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return output.sampleData(extractorinput, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #73  <Method int ChunkExtractorWrapper$SingleTrackOutput.sampleData(ExtractorInput, int, boolean)>
	//    6   12:ireturn         
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		output.sampleData(parsablebytearray, i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #76  <Method void ChunkExtractorWrapper$SingleTrackOutput.sampleData(ParsableByteArray, int)>
	//    5   11:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
		output.sampleMetadata(l, i, j, k, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:aload           6
	//    7   12:invokeinterface #80  <Method void ChunkExtractorWrapper$SingleTrackOutput.sampleMetadata(long, int, int, int, byte[])>
	//    8   17:return          
	}

	public void seekMap(SeekMap seekmap)
	{
		output.seekMap(seekmap);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ChunkExtractorWrapper$SingleTrackOutput output>
	//    2    4:aload_1         
	//    3    5:invokeinterface #84  <Method void ChunkExtractorWrapper$SingleTrackOutput.seekMap(SeekMap)>
	//    4   10:return          
	}

	public TrackOutput track(int i)
	{
		boolean flag;
		if(seenTrack && i != seenTrackId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean seenTrack>
	//*   2    4:ifeq            23
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #88  <Field int seenTrackId>
	//*   6   12:icmpne          18
	//*   7   15:goto            23
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		else
	//*  10   20:goto            25
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		Assertions.checkState(flag);
	//   13   25:iload_2         
	//   14   26:invokestatic    #43  <Method void Assertions.checkState(boolean)>
		seenTrack = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #37  <Field boolean seenTrack>
		seenTrackId = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #88  <Field int seenTrackId>
		return ((TrackOutput) (this));
	//   21   39:aload_0         
	//   22   40:areturn         
	}

	private final Extractor extractor;
	private boolean extractorInitialized;
	private SingleTrackOutput output;
	private boolean seenTrack;
	private int seenTrackId;
}
