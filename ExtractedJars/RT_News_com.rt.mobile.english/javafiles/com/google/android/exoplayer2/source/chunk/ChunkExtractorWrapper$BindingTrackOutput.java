// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			ChunkExtractorWrapper

private static final class ChunkExtractorWrapper$BindingTrackOutput
	implements TrackOutput
{

	public void bind( )
	{
		if( == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			trackOutput = ((TrackOutput) (new DummyTrackOutput()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class DummyTrackOutput>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void DummyTrackOutput()>
	//    6   12:putfield        #36  <Field TrackOutput trackOutput>
			return;
	//    7   15:return          
		}
		trackOutput = .track(id, type);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field int id>
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field int type>
	//   14   26:invokeinterface #42  <Method TrackOutput ChunkExtractorWrapper$TrackOutputProvider.track(int, int)>
	//   15   31:putfield        #36  <Field TrackOutput trackOutput>
		if(sampleFormat != null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #44  <Field Format sampleFormat>
	//*  18   38:ifnull          54
			trackOutput.format(sampleFormat);
	//   19   41:aload_0         
	//   20   42:getfield        #36  <Field TrackOutput trackOutput>
	//   21   45:aload_0         
	//   22   46:getfield        #44  <Field Format sampleFormat>
	//   23   49:invokeinterface #48  <Method void TrackOutput.format(Format)>
	//   24   54:return          
	}

	public void format(Format format1)
	{
		Format format2 = format1;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(manifestFormat != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #28  <Field Format manifestFormat>
	//*   4    6:ifnull          18
			format2 = format1.copyWithManifestFormatInfo(manifestFormat);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field Format manifestFormat>
	//    8   14:invokevirtual   #54  <Method Format Format.copyWithManifestFormatInfo(Format)>
	//    9   17:astore_2        
		sampleFormat = format2;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #44  <Field Format sampleFormat>
		trackOutput.format(sampleFormat);
	//   13   23:aload_0         
	//   14   24:getfield        #36  <Field TrackOutput trackOutput>
	//   15   27:aload_0         
	//   16   28:getfield        #44  <Field Format sampleFormat>
	//   17   31:invokeinterface #48  <Method void TrackOutput.format(Format)>
	//   18   36:return          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return trackOutput.sampleData(extractorinput, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TrackOutput trackOutput>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #62  <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//    6   12:ireturn         
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		trackOutput.sampleData(parsablebytearray, i);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TrackOutput trackOutput>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #66  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
	//    5   11:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptodata)
	{
		trackOutput.sampleMetadata(l, i, j, k, cryptodata);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TrackOutput trackOutput>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:aload           6
	//    7   12:invokeinterface #70  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//    8   17:return          
	}

	private final int id;
	private final Format manifestFormat;
	public Format sampleFormat;
	private TrackOutput trackOutput;
	private final int type;

	public ChunkExtractorWrapper$BindingTrackOutput(int i, int j, Format format1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int id>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int type>
		manifestFormat = format1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Format manifestFormat>
	//   11   19:return          
	}
}
