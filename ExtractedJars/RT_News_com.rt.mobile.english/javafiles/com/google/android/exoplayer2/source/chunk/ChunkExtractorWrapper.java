// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

public final class ChunkExtractorWrapper
	implements ExtractorOutput
{
	private static final class BindingTrackOutput
		implements TrackOutput
	{

		public void bind(TrackOutputProvider trackoutputprovider)
		{
			if(trackoutputprovider == null)
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
			trackOutput = trackoutputprovider.track(id, type);
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

		public BindingTrackOutput(int i, int j, Format format1)
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

	public static interface TrackOutputProvider
	{

		public abstract TrackOutput track(int i, int j);
	}


	public ChunkExtractorWrapper(Extractor extractor1, int i, Format format)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		extractor = extractor1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Extractor extractor>
		primaryTrackType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #38  <Field int primaryTrackType>
		primaryTrackManifestFormat = format;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Format primaryTrackManifestFormat>
	//   11   19:aload_0         
	//   12   20:new             #42  <Class SparseArray>
	//   13   23:dup             
	//   14   24:invokespecial   #43  <Method void SparseArray()>
	//   15   27:putfield        #45  <Field SparseArray bindingTrackOutputs>
	//   16   30:return          
	}

	public void endTracks()
	{
		Format aformat[] = new Format[bindingTrackOutputs.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//    2    4:invokevirtual   #51  <Method int SparseArray.size()>
	//    3    7:anewarray       Format[]
	//    4   10:astore_2        
		for(int i = 0; i < bindingTrackOutputs.size(); i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//*  10   18:invokevirtual   #51  <Method int SparseArray.size()>
	//*  11   21:icmpge          48
			aformat[i] = ((BindingTrackOutput)bindingTrackOutputs.valueAt(i)).sampleFormat;
	//   12   24:aload_2         
	//   13   25:iload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #57  <Method Object SparseArray.valueAt(int)>
	//   18   34:checkcast       #8   <Class ChunkExtractorWrapper$BindingTrackOutput>
	//   19   37:getfield        #60  <Field Format ChunkExtractorWrapper$BindingTrackOutput.sampleFormat>
	//   20   40:aastore         

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
	//*  25   45:goto            13
		sampleFormats = aformat;
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:putfield        #62  <Field Format[] sampleFormats>
	//   29   53:return          
	}

	public Format[] getSampleFormats()
	{
		return sampleFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Format[] sampleFormats>
	//    2    4:areturn         
	}

	public SeekMap getSeekMap()
	{
		return seekMap;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field SeekMap seekMap>
	//    2    4:areturn         
	}

	public void init(TrackOutputProvider trackoutputprovider, long l)
	{
		trackOutputProvider = trackoutputprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field ChunkExtractorWrapper$TrackOutputProvider trackOutputProvider>
		if(!extractorInitialized)
	//*   3    5:aload_0         
	//*   4    6:getfield        #74  <Field boolean extractorInitialized>
	//*   5    9:ifne            47
		{
			extractor.init(((ExtractorOutput) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field Extractor extractor>
	//    8   16:aload_0         
	//    9   17:invokeinterface #79  <Method void Extractor.init(ExtractorOutput)>
			if(l != 0x1L)
	//*  10   22:lload_2         
	//*  11   23:ldc2w           #80  <Long 0x1L>
	//*  12   26:lcmp            
	//*  13   27:ifeq            41
				extractor.seek(0L, l);
	//   14   30:aload_0         
	//   15   31:getfield        #36  <Field Extractor extractor>
	//   16   34:lconst_0        
	//   17   35:lload_2         
	//   18   36:invokeinterface #85  <Method void Extractor.seek(long, long)>
			extractorInitialized = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #74  <Field boolean extractorInitialized>
			return;
	//   22   46:return          
		}
		Extractor extractor1 = extractor;
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field Extractor extractor>
	//   25   51:astore          7
		long l1 = l;
	//   26   53:lload_2         
	//   27   54:lstore          5
		if(l == 0x1L)
	//*  28   56:lload_2         
	//*  29   57:ldc2w           #80  <Long 0x1L>
	//*  30   60:lcmp            
	//*  31   61:ifne            67
			l1 = 0L;
	//   32   64:lconst_0        
	//   33   65:lstore          5
		extractor1.seek(0L, l1);
	//   34   67:aload           7
	//   35   69:lconst_0        
	//   36   70:lload           5
	//   37   72:invokeinterface #85  <Method void Extractor.seek(long, long)>
		for(int i = 0; i < bindingTrackOutputs.size(); i++)
	//*  38   77:iconst_0        
	//*  39   78:istore          4
	//*  40   80:iload           4
	//*  41   82:aload_0         
	//*  42   83:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//*  43   86:invokevirtual   #51  <Method int SparseArray.size()>
	//*  44   89:icmpge          117
			((BindingTrackOutput)bindingTrackOutputs.valueAt(i)).bind(trackoutputprovider);
	//   45   92:aload_0         
	//   46   93:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//   47   96:iload           4
	//   48   98:invokevirtual   #57  <Method Object SparseArray.valueAt(int)>
	//   49  101:checkcast       #8   <Class ChunkExtractorWrapper$BindingTrackOutput>
	//   50  104:aload_1         
	//   51  105:invokevirtual   #89  <Method void ChunkExtractorWrapper$BindingTrackOutput.bind(ChunkExtractorWrapper$TrackOutputProvider)>

	//   52  108:iload           4
	//   53  110:iconst_1        
	//   54  111:iadd            
	//   55  112:istore          4
	//*  56  114:goto            80
	//   57  117:return          
	}

	public void seekMap(SeekMap seekmap)
	{
		seekMap = seekmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field SeekMap seekMap>
	//    3    5:return          
	}

	public TrackOutput track(int i, int j)
	{
		BindingTrackOutput bindingtrackoutput = (BindingTrackOutput)bindingTrackOutputs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #8   <Class ChunkExtractorWrapper$BindingTrackOutput>
	//    5   11:astore          5
		Object obj = ((Object) (bindingtrackoutput));
	//    6   13:aload           5
	//    7   15:astore          4
		if(bindingtrackoutput == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       92
		{
			boolean flag;
			if(sampleFormats == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #62  <Field Format[] sampleFormats>
	//*  12   26:ifnonnull       34
				flag = true;
	//   13   29:iconst_1        
	//   14   30:istore_3        
			else
	//*  15   31:goto            36
				flag = false;
	//   16   34:iconst_0        
	//   17   35:istore_3        
			Assertions.checkState(flag);
	//   18   36:iload_3         
	//   19   37:invokestatic    #101 <Method void Assertions.checkState(boolean)>
			if(j == primaryTrackType)
	//*  20   40:iload_2         
	//*  21   41:aload_0         
	//*  22   42:getfield        #38  <Field int primaryTrackType>
	//*  23   45:icmpne          57
				obj = ((Object) (primaryTrackManifestFormat));
	//   24   48:aload_0         
	//   25   49:getfield        #40  <Field Format primaryTrackManifestFormat>
	//   26   52:astore          4
			else
	//*  27   54:goto            60
				obj = null;
	//   28   57:aconst_null     
	//   29   58:astore          4
			obj = ((Object) (new BindingTrackOutput(i, j, ((Format) (obj)))));
	//   30   60:new             #8   <Class ChunkExtractorWrapper$BindingTrackOutput>
	//   31   63:dup             
	//   32   64:iload_1         
	//   33   65:iload_2         
	//   34   66:aload           4
	//   35   68:invokespecial   #104 <Method void ChunkExtractorWrapper$BindingTrackOutput(int, int, Format)>
	//   36   71:astore          4
			((BindingTrackOutput) (obj)).bind(trackOutputProvider);
	//   37   73:aload           4
	//   38   75:aload_0         
	//   39   76:getfield        #72  <Field ChunkExtractorWrapper$TrackOutputProvider trackOutputProvider>
	//   40   79:invokevirtual   #89  <Method void ChunkExtractorWrapper$BindingTrackOutput.bind(ChunkExtractorWrapper$TrackOutputProvider)>
			bindingTrackOutputs.put(i, obj);
	//   41   82:aload_0         
	//   42   83:getfield        #45  <Field SparseArray bindingTrackOutputs>
	//   43   86:iload_1         
	//   44   87:aload           4
	//   45   89:invokevirtual   #108 <Method void SparseArray.put(int, Object)>
		}
		return ((TrackOutput) (obj));
	//   46   92:aload           4
	//   47   94:areturn         
	}

	private final SparseArray bindingTrackOutputs = new SparseArray();
	public final Extractor extractor;
	private boolean extractorInitialized;
	private final Format primaryTrackManifestFormat;
	private final int primaryTrackType;
	private Format sampleFormats[];
	private SeekMap seekMap;
	private TrackOutputProvider trackOutputProvider;
}
