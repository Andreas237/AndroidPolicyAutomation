// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.*;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.*;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsChunkSource

public class DefaultSsChunkSource
	implements SsChunkSource
{
	public static final class Factory
		implements SsChunkSource.Factory
	{

		public SsChunkSource createChunkSource(LoaderErrorThrower loadererrorthrower, SsManifest ssmanifest, int i, TrackSelection trackselection, TrackEncryptionBox atrackencryptionbox[])
		{
			return ((SsChunkSource) (new DefaultSsChunkSource(loadererrorthrower, ssmanifest, i, trackselection, dataSourceFactory.createDataSource(), atrackencryptionbox)));
		//    0    0:new             #8   <Class DefaultSsChunkSource>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:aload           4
		//    6    9:aload_0         
		//    7   10:getfield        #18  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		//    8   13:invokeinterface #27  <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
		//    9   18:aload           5
		//   10   20:invokespecial   #30  <Method void DefaultSsChunkSource(LoaderErrorThrower, SsManifest, int, TrackSelection, DataSource, TrackEncryptionBox[])>
		//   11   23:areturn         
		}

		private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			dataSourceFactory = factory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		//    5    9:return          
		}
	}


	public DefaultSsChunkSource(LoaderErrorThrower loadererrorthrower, SsManifest ssmanifest, int i, TrackSelection trackselection, DataSource datasource, TrackEncryptionBox atrackencryptionbox[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		manifestLoaderErrorThrower = loadererrorthrower;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field LoaderErrorThrower manifestLoaderErrorThrower>
		manifest = ssmanifest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field SsManifest manifest>
		streamElementIndex = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #35  <Field int streamElementIndex>
		trackSelection = trackselection;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field TrackSelection trackSelection>
		dataSource = datasource;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #39  <Field DataSource dataSource>
		loadererrorthrower = ((LoaderErrorThrower) (ssmanifest.streamElements[i]));
	//   17   31:aload_2         
	//   18   32:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//   19   35:iload_3         
	//   20   36:aaload          
	//   21   37:astore_1        
		extractorWrappers = new ChunkExtractorWrapper[trackselection.length()];
	//   22   38:aload_0         
	//   23   39:aload           4
	//   24   41:invokeinterface #51  <Method int TrackSelection.length()>
	//   25   46:anewarray       ChunkExtractorWrapper[]
	//   26   49:putfield        #55  <Field ChunkExtractorWrapper[] extractorWrappers>
		for(i = 0; i < extractorWrappers.length; i++)
	//*  27   52:iconst_0        
	//*  28   53:istore_3        
	//*  29   54:iload_3         
	//*  30   55:aload_0         
	//*  31   56:getfield        #55  <Field ChunkExtractorWrapper[] extractorWrappers>
	//*  32   59:arraylength     
	//*  33   60:icmpge          172
		{
			int j = trackselection.getIndexInTrackGroup(i);
	//   34   63:aload           4
	//   35   65:iload_3         
	//   36   66:invokeinterface #59  <Method int TrackSelection.getIndexInTrackGroup(int)>
	//   37   71:istore          8
			datasource = ((DataSource) (((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (loadererrorthrower)).formats[j]));
	//   38   73:aload_1         
	//   39   74:getfield        #65  <Field Format[] com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.formats>
	//   40   77:iload           8
	//   41   79:aaload          
	//   42   80:astore          5
			byte byte0;
			if(((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (loadererrorthrower)).type == 2)
	//*  43   82:aload_1         
	//*  44   83:getfield        #68  <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.type>
	//*  45   86:iconst_2        
	//*  46   87:icmpne          96
				byte0 = 4;
	//   47   90:iconst_4        
	//   48   91:istore          7
			else
	//*  49   93:goto            99
				byte0 = 0;
	//   50   96:iconst_0        
	//   51   97:istore          7
			FragmentedMp4Extractor fragmentedmp4extractor = new FragmentedMp4Extractor(3, ((com.google.android.exoplayer2.util.TimestampAdjuster) (null)), new Track(j, ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (loadererrorthrower)).type, ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (loadererrorthrower)).timescale, 0x1L, ssmanifest.durationUs, ((Format) (datasource)), 0, atrackencryptionbox, ((int) (byte0)), ((long []) (null)), ((long []) (null))), ((com.google.android.exoplayer2.drm.DrmInitData) (null)));
	//   52   99:new             #70  <Class FragmentedMp4Extractor>
	//   53  102:dup             
	//   54  103:iconst_3        
	//   55  104:aconst_null     
	//   56  105:new             #72  <Class Track>
	//   57  108:dup             
	//   58  109:iload           8
	//   59  111:aload_1         
	//   60  112:getfield        #68  <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.type>
	//   61  115:aload_1         
	//   62  116:getfield        #76  <Field long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.timescale>
	//   63  119:ldc2w           #77  <Long 0x1L>
	//   64  122:aload_2         
	//   65  123:getfield        #81  <Field long SsManifest.durationUs>
	//   66  126:aload           5
	//   67  128:iconst_0        
	//   68  129:aload           6
	//   69  131:iload           7
	//   70  133:aconst_null     
	//   71  134:aconst_null     
	//   72  135:invokespecial   #84  <Method void Track(int, int, long, long, long, Format, int, TrackEncryptionBox[], int, long[], long[])>
	//   73  138:aconst_null     
	//   74  139:invokespecial   #87  <Method void FragmentedMp4Extractor(int, com.google.android.exoplayer2.util.TimestampAdjuster, Track, com.google.android.exoplayer2.drm.DrmInitData)>
	//   75  142:astore          9
			extractorWrappers[i] = new ChunkExtractorWrapper(((com.google.android.exoplayer2.extractor.Extractor) (fragmentedmp4extractor)), ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (loadererrorthrower)).type, ((Format) (datasource)));
	//   76  144:aload_0         
	//   77  145:getfield        #55  <Field ChunkExtractorWrapper[] extractorWrappers>
	//   78  148:iload_3         
	//   79  149:new             #53  <Class ChunkExtractorWrapper>
	//   80  152:dup             
	//   81  153:aload           9
	//   82  155:aload_1         
	//   83  156:getfield        #68  <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.type>
	//   84  159:aload           5
	//   85  161:invokespecial   #90  <Method void ChunkExtractorWrapper(com.google.android.exoplayer2.extractor.Extractor, int, Format)>
	//   86  164:aastore         
		}

	//   87  165:iload_3         
	//   88  166:iconst_1        
	//   89  167:iadd            
	//   90  168:istore_3        
	//*  91  169:goto            54
	//   92  172:return          
	}

	private static MediaChunk newMediaChunk(Format format, DataSource datasource, Uri uri, String s, int i, long l, long l1, long l2, int j, Object obj, ChunkExtractorWrapper chunkextractorwrapper)
	{
		return ((MediaChunk) (new ContainerMediaChunk(datasource, new DataSpec(uri, 0L, -1L, s), format, j, obj, l, l1, l2, i, 1, l, chunkextractorwrapper)));
	//    0    0:new             #95  <Class ContainerMediaChunk>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #97  <Class DataSpec>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:lconst_0        
	//    7   11:ldc2w           #98  <Long -1L>
	//    8   14:aload_3         
	//    9   15:invokespecial   #102 <Method void DataSpec(Uri, long, long, String)>
	//   10   18:aload_0         
	//   11   19:iload           11
	//   12   21:aload           12
	//   13   23:lload           5
	//   14   25:lload           7
	//   15   27:lload           9
	//   16   29:iload           4
	//   17   31:i2l             
	//   18   32:iconst_1        
	//   19   33:lload           5
	//   20   35:aload           13
	//   21   37:invokespecial   #105 <Method void ContainerMediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long, long, int, long, ChunkExtractorWrapper)>
	//   22   40:areturn         
	}

	private long resolveTimeToLiveEdgeUs(long l)
	{
		if(!manifest.isLive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field SsManifest manifest>
	//*   2    4:getfield        #111 <Field boolean SsManifest.isLive>
	//*   3    7:ifne            14
		{
			return 0x1L;
	//    4   10:ldc2w           #77  <Long 0x1L>
	//    5   13:lreturn         
		} else
		{
			com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement = manifest.streamElements[streamElementIndex];
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field SsManifest manifest>
	//    8   18:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field int streamElementIndex>
	//   11   25:aaload          
	//   12   26:astore          4
			int i = streamelement.chunkCount - 1;
	//   13   28:aload           4
	//   14   30:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:istore_3        
			return (streamelement.getStartTimeUs(i) + streamelement.getChunkDurationUs(i)) - l;
	//   18   36:aload           4
	//   19   38:iload_3         
	//   20   39:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   21   42:aload           4
	//   22   44:iload_3         
	//   23   45:invokevirtual   #121 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkDurationUs(int)>
	//   24   48:ladd            
	//   25   49:lload_1         
	//   26   50:lsub            
	//   27   51:lreturn         
		}
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement = manifest.streamElements[streamElementIndex];
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SsManifest manifest>
	//    2    4:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int streamElementIndex>
	//    5   11:aaload          
	//    6   12:astore          9
		int i = streamelement.getChunkIndex(l);
	//    7   14:aload           9
	//    8   16:lload_1         
	//    9   17:invokevirtual   #127 <Method int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkIndex(long)>
	//   10   20:istore          4
		long l2 = streamelement.getStartTimeUs(i);
	//   11   22:aload           9
	//   12   24:iload           4
	//   13   26:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   14   29:lstore          7
		long l1;
		if(l2 < l && i < streamelement.chunkCount - 1)
	//*  15   31:lload           7
	//*  16   33:lload_1         
	//*  17   34:lcmp            
	//*  18   35:ifge            64
	//*  19   38:iload           4
	//*  20   40:aload           9
	//*  21   42:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  22   45:iconst_1        
	//*  23   46:isub            
	//*  24   47:icmpge          64
			l1 = streamelement.getStartTimeUs(i + 1);
	//   25   50:aload           9
	//   26   52:iload           4
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   30   59:lstore          5
		else
	//*  31   61:goto            68
			l1 = l2;
	//   32   64:lload           7
	//   33   66:lstore          5
		return Util.resolveSeekPositionUs(l, seekparameters, l2, l1);
	//   34   68:lload_1         
	//   35   69:aload_3         
	//   36   70:lload           7
	//   37   72:lload           5
	//   38   74:invokestatic    #133 <Method long Util.resolveSeekPositionUs(long, SeekParameters, long, long)>
	//   39   77:lreturn         
	}

	public final void getNextChunk(MediaChunk mediachunk, long l, long l1, ChunkHolder chunkholder)
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field IOException fatalError>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		Object obj = ((Object) (manifest.streamElements[streamElementIndex]));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field SsManifest manifest>
	//    6   12:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field int streamElementIndex>
	//    9   19:aaload          
	//   10   20:astore          12
		if(((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).chunkCount == 0)
	//*  11   22:aload           12
	//*  12   24:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  13   27:ifne            45
		{
			chunkholder.endOfStream = manifest.isLive ^ true;
	//   14   30:aload           6
	//   15   32:aload_0         
	//   16   33:getfield        #33  <Field SsManifest manifest>
	//   17   36:getfield        #111 <Field boolean SsManifest.isLive>
	//   18   39:iconst_1        
	//   19   40:ixor            
	//   20   41:putfield        #142 <Field boolean ChunkHolder.endOfStream>
			return;
	//   21   44:return          
		}
		int i;
		if(mediachunk == null)
	//*  22   45:aload_1         
	//*  23   46:ifnonnull       61
		{
			i = ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).getChunkIndex(l1);
	//   24   49:aload           12
	//   25   51:lload           4
	//   26   53:invokevirtual   #127 <Method int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkIndex(long)>
	//   27   56:istore          7
		} else
	//*  28   58:goto            95
		{
			int j = (int)(mediachunk.getNextChunkIndex() - (long)currentManifestChunkOffset);
	//   29   61:aload_1         
	//   30   62:invokevirtual   #148 <Method long MediaChunk.getNextChunkIndex()>
	//   31   65:aload_0         
	//   32   66:getfield        #150 <Field int currentManifestChunkOffset>
	//   33   69:i2l             
	//   34   70:lsub            
	//   35   71:l2i             
	//   36   72:istore          8
			i = j;
	//   37   74:iload           8
	//   38   76:istore          7
			if(j < 0)
	//*  39   78:iload           8
	//*  40   80:ifge            58
			{
				fatalError = ((IOException) (new BehindLiveWindowException()));
	//   41   83:aload_0         
	//   42   84:new             #152 <Class BehindLiveWindowException>
	//   43   87:dup             
	//   44   88:invokespecial   #153 <Method void BehindLiveWindowException()>
	//   45   91:putfield        #137 <Field IOException fatalError>
				return;
	//   46   94:return          
			}
		}
		if(i >= ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).chunkCount)
	//*  47   95:iload           7
	//*  48   97:aload           12
	//*  49   99:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  50  102:icmplt          120
		{
			chunkholder.endOfStream = manifest.isLive ^ true;
	//   51  105:aload           6
	//   52  107:aload_0         
	//   53  108:getfield        #33  <Field SsManifest manifest>
	//   54  111:getfield        #111 <Field boolean SsManifest.isLive>
	//   55  114:iconst_1        
	//   56  115:ixor            
	//   57  116:putfield        #142 <Field boolean ChunkHolder.endOfStream>
			return;
	//   58  119:return          
		}
		long l2 = resolveTimeToLiveEdgeUs(l);
	//   59  120:aload_0         
	//   60  121:lload_2         
	//   61  122:invokespecial   #155 <Method long resolveTimeToLiveEdgeUs(long)>
	//   62  125:lstore          10
		trackSelection.updateSelectedTrack(l, l1 - l, l2);
	//   63  127:aload_0         
	//   64  128:getfield        #37  <Field TrackSelection trackSelection>
	//   65  131:lload_2         
	//   66  132:lload           4
	//   67  134:lload_2         
	//   68  135:lsub            
	//   69  136:lload           10
	//   70  138:invokeinterface #159 <Method void TrackSelection.updateSelectedTrack(long, long, long)>
		l = ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).getStartTimeUs(i);
	//   71  143:aload           12
	//   72  145:iload           7
	//   73  147:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   74  150:lstore_2        
		l2 = ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).getChunkDurationUs(i);
	//   75  151:aload           12
	//   76  153:iload           7
	//   77  155:invokevirtual   #121 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkDurationUs(int)>
	//   78  158:lstore          10
		if(mediachunk != null)
	//*  79  160:aload_1         
	//*  80  161:ifnonnull       167
	//*  81  164:goto            172
			l1 = 0x1L;
	//   82  167:ldc2w           #77  <Long 0x1L>
	//   83  170:lstore          4
		int k = currentManifestChunkOffset;
	//   84  172:aload_0         
	//   85  173:getfield        #150 <Field int currentManifestChunkOffset>
	//   86  176:istore          8
		int i1 = trackSelection.getSelectedIndex();
	//   87  178:aload_0         
	//   88  179:getfield        #37  <Field TrackSelection trackSelection>
	//   89  182:invokeinterface #162 <Method int TrackSelection.getSelectedIndex()>
	//   90  187:istore          9
		mediachunk = ((MediaChunk) (extractorWrappers[i1]));
	//   91  189:aload_0         
	//   92  190:getfield        #55  <Field ChunkExtractorWrapper[] extractorWrappers>
	//   93  193:iload           9
	//   94  195:aaload          
	//   95  196:astore_1        
		obj = ((Object) (((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (obj)).buildRequestUri(trackSelection.getIndexInTrackGroup(i1), i)));
	//   96  197:aload           12
	//   97  199:aload_0         
	//   98  200:getfield        #37  <Field TrackSelection trackSelection>
	//   99  203:iload           9
	//  100  205:invokeinterface #59  <Method int TrackSelection.getIndexInTrackGroup(int)>
	//  101  210:iload           7
	//  102  212:invokevirtual   #166 <Method Uri com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.buildRequestUri(int, int)>
	//  103  215:astore          12
		chunkholder.chunk = ((Chunk) (newMediaChunk(trackSelection.getSelectedFormat(), dataSource, ((Uri) (obj)), ((String) (null)), i + k, l, l + l2, l1, trackSelection.getSelectionReason(), trackSelection.getSelectionData(), ((ChunkExtractorWrapper) (mediachunk)))));
	//  104  217:aload           6
	//  105  219:aload_0         
	//  106  220:getfield        #37  <Field TrackSelection trackSelection>
	//  107  223:invokeinterface #170 <Method Format TrackSelection.getSelectedFormat()>
	//  108  228:aload_0         
	//  109  229:getfield        #39  <Field DataSource dataSource>
	//  110  232:aload           12
	//  111  234:aconst_null     
	//  112  235:iload           7
	//  113  237:iload           8
	//  114  239:iadd            
	//  115  240:lload_2         
	//  116  241:lload_2         
	//  117  242:lload           10
	//  118  244:ladd            
	//  119  245:lload           4
	//  120  247:aload_0         
	//  121  248:getfield        #37  <Field TrackSelection trackSelection>
	//  122  251:invokeinterface #173 <Method int TrackSelection.getSelectionReason()>
	//  123  256:aload_0         
	//  124  257:getfield        #37  <Field TrackSelection trackSelection>
	//  125  260:invokeinterface #177 <Method Object TrackSelection.getSelectionData()>
	//  126  265:aload_1         
	//  127  266:invokestatic    #179 <Method MediaChunk newMediaChunk(Format, DataSource, Uri, String, int, long, long, long, int, Object, ChunkExtractorWrapper)>
	//  128  269:putfield        #183 <Field Chunk ChunkHolder.chunk>
	//  129  272:return          
	}

	public int getPreferredQueueSize(long l, List list)
	{
		if(fatalError == null && trackSelection.length() >= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field IOException fatalError>
	//*   2    4:ifnonnull       35
	//*   3    7:aload_0         
	//*   4    8:getfield        #37  <Field TrackSelection trackSelection>
	//*   5   11:invokeinterface #51  <Method int TrackSelection.length()>
	//*   6   16:iconst_2        
	//*   7   17:icmpge          23
	//*   8   20:goto            35
			return trackSelection.evaluateQueueSize(l, list);
	//    9   23:aload_0         
	//   10   24:getfield        #37  <Field TrackSelection trackSelection>
	//   11   27:lload_1         
	//   12   28:aload_3         
	//   13   29:invokeinterface #188 <Method int TrackSelection.evaluateQueueSize(long, List)>
	//   14   34:ireturn         
		else
			return list.size();
	//   15   35:aload_3         
	//   16   36:invokeinterface #193 <Method int List.size()>
	//   17   41:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field IOException fatalError>
	//*   2    4:ifnull          12
		{
			throw fatalError;
	//    3    7:aload_0         
	//    4    8:getfield        #137 <Field IOException fatalError>
	//    5   11:athrow          
		} else
		{
			manifestLoaderErrorThrower.maybeThrowError();
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//    8   16:invokeinterface #202 <Method void LoaderErrorThrower.maybeThrowError()>
			return;
	//    9   21:return          
		}
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
	//    0    0:return          
	}

	public boolean onChunkLoadError(Chunk chunk, boolean flag, Exception exception)
	{
		return flag && ChunkedTrackBlacklistUtil.maybeBlacklistTrack(trackSelection, trackSelection.indexOf(chunk.trackFormat), exception);
	//    0    0:iload_2         
	//    1    1:ifeq            30
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field TrackSelection trackSelection>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field TrackSelection trackSelection>
	//    6   12:aload_1         
	//    7   13:getfield        #213 <Field Format Chunk.trackFormat>
	//    8   16:invokeinterface #217 <Method int TrackSelection.indexOf(Format)>
	//    9   21:aload_3         
	//   10   22:invokestatic    #223 <Method boolean ChunkedTrackBlacklistUtil.maybeBlacklistTrack(TrackSelection, int, Exception)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public void updateManifest(SsManifest ssmanifest)
	{
		com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement = manifest.streamElements[streamElementIndex];
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SsManifest manifest>
	//    2    4:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int streamElementIndex>
	//    5   11:aaload          
	//    6   12:astore          10
		int i = streamelement.chunkCount;
	//    7   14:aload           10
	//    8   16:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//    9   19:istore_2        
		com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement1 = ssmanifest.streamElements[streamElementIndex];
	//   10   20:aload_1         
	//   11   21:getfield        #45  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//   12   24:aload_0         
	//   13   25:getfield        #35  <Field int streamElementIndex>
	//   14   28:aaload          
	//   15   29:astore          11
		if(i != 0 && streamelement1.chunkCount != 0)
	//*  16   31:iload_2         
	//*  17   32:ifeq            117
	//*  18   35:aload           11
	//*  19   37:getfield        #114 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  20   40:ifne            46
	//*  21   43:goto            117
		{
			int j = i - 1;
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:isub            
	//   25   49:istore_3        
			long l = streamelement.getStartTimeUs(j);
	//   26   50:aload           10
	//   27   52:iload_3         
	//   28   53:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   29   56:lstore          4
			long l1 = streamelement.getChunkDurationUs(j);
	//   30   58:aload           10
	//   31   60:iload_3         
	//   32   61:invokevirtual   #121 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkDurationUs(int)>
	//   33   64:lstore          6
			long l2 = streamelement1.getStartTimeUs(0);
	//   34   66:aload           11
	//   35   68:iconst_0        
	//   36   69:invokevirtual   #118 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   37   72:lstore          8
			if(l + l1 <= l2)
	//*  38   74:lload           4
	//*  39   76:lload           6
	//*  40   78:ladd            
	//*  41   79:lload           8
	//*  42   81:lcmp            
	//*  43   82:ifgt            98
				currentManifestChunkOffset = currentManifestChunkOffset + i;
	//   44   85:aload_0         
	//   45   86:aload_0         
	//   46   87:getfield        #150 <Field int currentManifestChunkOffset>
	//   47   90:iload_2         
	//   48   91:iadd            
	//   49   92:putfield        #150 <Field int currentManifestChunkOffset>
			else
	//*  50   95:goto            127
				currentManifestChunkOffset = currentManifestChunkOffset + streamelement.getChunkIndex(l2);
	//   51   98:aload_0         
	//   52   99:aload_0         
	//   53  100:getfield        #150 <Field int currentManifestChunkOffset>
	//   54  103:aload           10
	//   55  105:lload           8
	//   56  107:invokevirtual   #127 <Method int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkIndex(long)>
	//   57  110:iadd            
	//   58  111:putfield        #150 <Field int currentManifestChunkOffset>
		} else
	//*  59  114:goto            127
		{
			currentManifestChunkOffset = currentManifestChunkOffset + i;
	//   60  117:aload_0         
	//   61  118:aload_0         
	//   62  119:getfield        #150 <Field int currentManifestChunkOffset>
	//   63  122:iload_2         
	//   64  123:iadd            
	//   65  124:putfield        #150 <Field int currentManifestChunkOffset>
		}
		manifest = ssmanifest;
	//   66  127:aload_0         
	//   67  128:aload_1         
	//   68  129:putfield        #33  <Field SsManifest manifest>
	//   69  132:return          
	}

	private int currentManifestChunkOffset;
	private final DataSource dataSource;
	private final ChunkExtractorWrapper extractorWrappers[];
	private IOException fatalError;
	private SsManifest manifest;
	private final LoaderErrorThrower manifestLoaderErrorThrower;
	private final int streamElementIndex;
	private final TrackSelection trackSelection;
}
