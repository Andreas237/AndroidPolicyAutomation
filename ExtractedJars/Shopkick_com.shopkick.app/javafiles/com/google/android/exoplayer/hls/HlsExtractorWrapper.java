// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.MimeTypes;
import java.io.IOException;

public final class HlsExtractorWrapper
	implements ExtractorOutput
{

	public HlsExtractorWrapper(int i, Format format1, long l, Extractor extractor1, boolean flag, int j, 
			int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		trigger = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int trigger>
		format = format1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field Format format>
		startTimeUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #39  <Field long startTimeUs>
		extractor = extractor1;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #41  <Field Extractor extractor>
		shouldSpliceIn = flag;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #43  <Field boolean shouldSpliceIn>
		adaptiveMaxWidth = j;
	//   17   31:aload_0         
	//   18   32:iload           7
	//   19   34:putfield        #45  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = k;
	//   20   37:aload_0         
	//   21   38:iload           8
	//   22   40:putfield        #47  <Field int adaptiveMaxHeight>
	//   23   43:aload_0         
	//   24   44:new             #49  <Class SparseArray>
	//   25   47:dup             
	//   26   48:invokespecial   #50  <Method void SparseArray()>
	//   27   51:putfield        #52  <Field SparseArray sampleQueues>
	//   28   54:return          
	}

	public void clear()
	{
		for(int i = 0; i < sampleQueues.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #52  <Field SparseArray sampleQueues>
	//*   5    7:invokevirtual   #58  <Method int SparseArray.size()>
	//*   6   10:icmpge          34
			((DefaultTrackOutput)sampleQueues.valueAt(i)).clear();
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field SparseArray sampleQueues>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #64  <Class DefaultTrackOutput>
	//   12   24:invokevirtual   #66  <Method void DefaultTrackOutput.clear()>

	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_1        
	//*  17   31:goto            2
	//   18   34:return          
	}

	public final void configureSpliceTo(HlsExtractorWrapper hlsextractorwrapper)
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		if(!spliceConfigured && hlsextractorwrapper.shouldSpliceIn)
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field boolean spliceConfigured>
	//*   5   11:ifne            88
	//*   6   14:aload_1         
	//*   7   15:getfield        #43  <Field boolean shouldSpliceIn>
	//*   8   18:ifeq            88
		{
			if(!hlsextractorwrapper.isPrepared())
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #72  <Method boolean isPrepared()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			int j = getTrackCount();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #83  <Method int getTrackCount()>
	//   15   33:istore_3        
			int i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_2        
			boolean flag = true;
	//   18   36:iconst_1        
	//   19   37:istore          4
			for(; i < j; i++)
	//*  20   39:iload_2         
	//*  21   40:iload_3         
	//*  22   41:icmpge          81
				flag &= ((DefaultTrackOutput)sampleQueues.valueAt(i)).configureSpliceTo((DefaultTrackOutput)hlsextractorwrapper.sampleQueues.valueAt(i));
	//   23   44:iload           4
	//   24   46:aload_0         
	//   25   47:getfield        #52  <Field SparseArray sampleQueues>
	//   26   50:iload_2         
	//   27   51:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   28   54:checkcast       #64  <Class DefaultTrackOutput>
	//   29   57:aload_1         
	//   30   58:getfield        #52  <Field SparseArray sampleQueues>
	//   31   61:iload_2         
	//   32   62:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   33   65:checkcast       #64  <Class DefaultTrackOutput>
	//   34   68:invokevirtual   #86  <Method boolean DefaultTrackOutput.configureSpliceTo(DefaultTrackOutput)>
	//   35   71:iand            
	//   36   72:istore          4

	//   37   74:iload_2         
	//   38   75:iconst_1        
	//   39   76:iadd            
	//   40   77:istore_2        
	//*  41   78:goto            39
			spliceConfigured = flag;
	//   42   81:aload_0         
	//   43   82:iload           4
	//   44   84:putfield        #80  <Field boolean spliceConfigured>
			return;
	//   45   87:return          
		} else
		{
			return;
	//   46   88:return          
		}
	}

	public void discardUntil(int i, long l)
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		((DefaultTrackOutput)sampleQueues.valueAt(i)).discardUntil(l);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field SparseArray sampleQueues>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//    7   15:checkcast       #64  <Class DefaultTrackOutput>
	//    8   18:lload_2         
	//    9   19:invokevirtual   #91  <Method void DefaultTrackOutput.discardUntil(long)>
	//   10   22:return          
	}

	public void drmInitData(DrmInitData drminitdata)
	{
	//    0    0:return          
	}

	public void endTracks()
	{
		tracksBuilt = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #96  <Field boolean tracksBuilt>
	//    3    5:return          
	}

	public long getAdjustedEndTimeUs()
	{
		long l = 0x0L;
	//    0    0:ldc2w           #99  <Long 0x0L>
	//    1    3:lstore_2        
		for(int i = 0; i < sampleQueues.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #52  <Field SparseArray sampleQueues>
	//*   7   11:invokevirtual   #58  <Method int SparseArray.size()>
	//*   8   14:icmpge          43
			l = Math.max(l, ((DefaultTrackOutput)sampleQueues.valueAt(i)).getLargestParsedTimestampUs());
	//    9   17:lload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field SparseArray sampleQueues>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   14   26:checkcast       #64  <Class DefaultTrackOutput>
	//   15   29:invokevirtual   #103 <Method long DefaultTrackOutput.getLargestParsedTimestampUs()>
	//   16   32:invokestatic    #109 <Method long Math.max(long, long)>
	//   17   35:lstore_2        

	//   18   36:iload_1         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_1        
	//*  22   40:goto            6
		return l;
	//   23   43:lload_2         
	//   24   44:lreturn         
	}

	public long getLargestParsedTimestampUs()
	{
		long l = 0x0L;
	//    0    0:ldc2w           #99  <Long 0x0L>
	//    1    3:lstore_2        
		for(int i = 0; i < sampleQueues.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #52  <Field SparseArray sampleQueues>
	//*   7   11:invokevirtual   #58  <Method int SparseArray.size()>
	//*   8   14:icmpge          43
			l = Math.max(l, ((DefaultTrackOutput)sampleQueues.valueAt(i)).getLargestParsedTimestampUs());
	//    9   17:lload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field SparseArray sampleQueues>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   14   26:checkcast       #64  <Class DefaultTrackOutput>
	//   15   29:invokevirtual   #103 <Method long DefaultTrackOutput.getLargestParsedTimestampUs()>
	//   16   32:invokestatic    #109 <Method long Math.max(long, long)>
	//   17   35:lstore_2        

	//   18   36:iload_1         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_1        
	//*  22   40:goto            6
		return l;
	//   23   43:lload_2         
	//   24   44:lreturn         
	}

	public MediaFormat getMediaFormat(int i)
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		return sampleQueueFormats[i];
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field MediaFormat[] sampleQueueFormats>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:areturn         
	}

	public boolean getSample(int i, SampleHolder sampleholder)
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		return ((DefaultTrackOutput)sampleQueues.valueAt(i)).getSample(sampleholder);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field SparseArray sampleQueues>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//    7   15:checkcast       #64  <Class DefaultTrackOutput>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #118 <Method boolean DefaultTrackOutput.getSample(SampleHolder)>
	//   10   22:ireturn         
	}

	public int getTrackCount()
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		return sampleQueues.size();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field SparseArray sampleQueues>
	//    5   11:invokevirtual   #58  <Method int SparseArray.size()>
	//    6   14:ireturn         
	}

	public boolean hasSamples(int i)
	{
		Assertions.checkState(isPrepared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isPrepared()>
	//    2    4:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		return ((DefaultTrackOutput)sampleQueues.valueAt(i)).isEmpty() ^ true;
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field SparseArray sampleQueues>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//    7   15:checkcast       #64  <Class DefaultTrackOutput>
	//    8   18:invokevirtual   #123 <Method boolean DefaultTrackOutput.isEmpty()>
	//    9   21:iconst_1        
	//   10   22:ixor            
	//   11   23:ireturn         
	}

	public void init(Allocator allocator1)
	{
		allocator = allocator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field Allocator allocator>
		extractor.init(((ExtractorOutput) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field Extractor extractor>
	//    5    9:aload_0         
	//    6   10:invokeinterface #132 <Method void Extractor.init(ExtractorOutput)>
	//    7   15:return          
	}

	public boolean isPrepared()
	{
label0:
		{
			if(prepared || !tracksBuilt)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field boolean prepared>
	//    2    4:ifne            162
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field boolean tracksBuilt>
	//    5   11:ifeq            162
			boolean flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
			for(int i = 0; i < sampleQueues.size(); i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #52  <Field SparseArray sampleQueues>
	//*  13   23:invokevirtual   #58  <Method int SparseArray.size()>
	//*  14   26:icmpge          55
				if(!((DefaultTrackOutput)sampleQueues.valueAt(i)).hasFormat())
	//*  15   29:aload_0         
	//*  16   30:getfield        #52  <Field SparseArray sampleQueues>
	//*  17   33:iload_1         
	//*  18   34:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//*  19   37:checkcast       #64  <Class DefaultTrackOutput>
	//*  20   40:invokevirtual   #137 <Method boolean DefaultTrackOutput.hasFormat()>
	//*  21   43:ifne            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         

	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
	//*  28   52:goto            18
			prepared = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #134 <Field boolean prepared>
			sampleQueueFormats = new MediaFormat[sampleQueues.size()];
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #52  <Field SparseArray sampleQueues>
	//   35   65:invokevirtual   #58  <Method int SparseArray.size()>
	//   36   68:anewarray       MediaFormat[]
	//   37   71:putfield        #113 <Field MediaFormat[] sampleQueueFormats>
			for(int j = ((int) (flag)); j < sampleQueueFormats.length; j++)
	//*  38   74:iload_2         
	//*  39   75:istore_1        
	//*  40   76:iload_1         
	//*  41   77:aload_0         
	//*  42   78:getfield        #113 <Field MediaFormat[] sampleQueueFormats>
	//*  43   81:arraylength     
	//*  44   82:icmpge          162
			{
				MediaFormat mediaformat;
label1:
				{
					MediaFormat mediaformat1 = ((DefaultTrackOutput)sampleQueues.valueAt(j)).getFormat();
	//   45   85:aload_0         
	//   46   86:getfield        #52  <Field SparseArray sampleQueues>
	//   47   89:iload_1         
	//   48   90:invokevirtual   #62  <Method Object SparseArray.valueAt(int)>
	//   49   93:checkcast       #64  <Class DefaultTrackOutput>
	//   50   96:invokevirtual   #143 <Method MediaFormat DefaultTrackOutput.getFormat()>
	//   51   99:astore          4
					mediaformat = mediaformat1;
	//   52  101:aload           4
	//   53  103:astore_3        
					if(!MimeTypes.isVideo(mediaformat1.mimeType))
						break label1;
	//   54  104:aload           4
	//   55  106:getfield        #147 <Field String MediaFormat.mimeType>
	//   56  109:invokestatic    #153 <Method boolean MimeTypes.isVideo(String)>
	//   57  112:ifeq            148
					if(adaptiveMaxWidth == -1)
	//*  58  115:aload_0         
	//*  59  116:getfield        #45  <Field int adaptiveMaxWidth>
	//*  60  119:iconst_m1       
	//*  61  120:icmpne          134
					{
						mediaformat = mediaformat1;
	//   62  123:aload           4
	//   63  125:astore_3        
						if(adaptiveMaxHeight == -1)
							break label1;
	//   64  126:aload_0         
	//   65  127:getfield        #47  <Field int adaptiveMaxHeight>
	//   66  130:iconst_m1       
	//   67  131:icmpeq          148
					}
					mediaformat = mediaformat1.copyWithMaxVideoDimensions(adaptiveMaxWidth, adaptiveMaxHeight);
	//   68  134:aload           4
	//   69  136:aload_0         
	//   70  137:getfield        #45  <Field int adaptiveMaxWidth>
	//   71  140:aload_0         
	//   72  141:getfield        #47  <Field int adaptiveMaxHeight>
	//   73  144:invokevirtual   #157 <Method MediaFormat MediaFormat.copyWithMaxVideoDimensions(int, int)>
	//   74  147:astore_3        
				}
				sampleQueueFormats[j] = mediaformat;
	//   75  148:aload_0         
	//   76  149:getfield        #113 <Field MediaFormat[] sampleQueueFormats>
	//   77  152:iload_1         
	//   78  153:aload_3         
	//   79  154:aastore         
			}

	//   80  155:iload_1         
	//   81  156:iconst_1        
	//   82  157:iadd            
	//   83  158:istore_1        
		}
	//*  84  159:goto            76
		return prepared;
	//   85  162:aload_0         
	//   86  163:getfield        #134 <Field boolean prepared>
	//   87  166:ireturn         
	}

	public int read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = extractor.read(extractorinput, ((com.google.android.exoplayer.extractor.PositionHolder) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Extractor extractor>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokeinterface #166 <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer.extractor.PositionHolder)>
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
	//   15   25:invokestatic    #78  <Method void Assertions.checkState(boolean)>
		return i;
	//   16   28:iload_2         
	//   17   29:ireturn         
	}

	public void seekMap(SeekMap seekmap)
	{
	//    0    0:return          
	}

	public TrackOutput track(int i)
	{
		DefaultTrackOutput defaulttrackoutput = (DefaultTrackOutput)sampleQueues.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SparseArray sampleQueues>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #174 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #64  <Class DefaultTrackOutput>
	//    5   11:astore_2        
		if(defaulttrackoutput != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
		{
			return ((TrackOutput) (defaulttrackoutput));
	//    8   16:aload_2         
	//    9   17:areturn         
		} else
		{
			DefaultTrackOutput defaulttrackoutput1 = new DefaultTrackOutput(allocator);
	//   10   18:new             #64  <Class DefaultTrackOutput>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #127 <Field Allocator allocator>
	//   14   26:invokespecial   #176 <Method void DefaultTrackOutput(Allocator)>
	//   15   29:astore_2        
			sampleQueues.put(i, ((Object) (defaulttrackoutput1)));
	//   16   30:aload_0         
	//   17   31:getfield        #52  <Field SparseArray sampleQueues>
	//   18   34:iload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #180 <Method void SparseArray.put(int, Object)>
			return ((TrackOutput) (defaulttrackoutput1));
	//   21   39:aload_2         
	//   22   40:areturn         
		}
	}

	private final int adaptiveMaxHeight;
	private final int adaptiveMaxWidth;
	private Allocator allocator;
	private final Extractor extractor;
	public final Format format;
	private boolean prepared;
	private MediaFormat sampleQueueFormats[];
	private final SparseArray sampleQueues = new SparseArray();
	private final boolean shouldSpliceIn;
	private boolean spliceConfigured;
	public final long startTimeUs;
	private volatile boolean tracksBuilt;
	public final int trigger;
}
