// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import android.util.Base64;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsChunkSource

final class SsMediaPeriod
	implements MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader.Callback
{

	public SsMediaPeriod(SsManifest ssmanifest, SsChunkSource.Factory factory, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher, LoaderErrorThrower loadererrorthrower, Allocator allocator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		chunkSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #46  <Field SsChunkSource$Factory chunkSourceFactory>
		manifestLoaderErrorThrower = loadererrorthrower;
	//    5    9:aload_0         
	//    6   10:aload           6
	//    7   12:putfield        #48  <Field LoaderErrorThrower manifestLoaderErrorThrower>
		minLoadableRetryCount = i;
	//    8   15:aload_0         
	//    9   16:iload           4
	//   10   18:putfield        #50  <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   11   21:aload_0         
	//   12   22:aload           5
	//   13   24:putfield        #52  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		allocator = allocator1;
	//   14   27:aload_0         
	//   15   28:aload           7
	//   16   30:putfield        #54  <Field Allocator allocator>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #56  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		trackGroups = buildTrackGroups(ssmanifest);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokestatic    #60  <Method TrackGroupArray buildTrackGroups(SsManifest)>
	//   23   43:putfield        #62  <Field TrackGroupArray trackGroups>
		factory = ((SsChunkSource.Factory) (ssmanifest.protectionElement));
	//   24   46:aload_1         
	//   25   47:getfield        #68  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$ProtectionElement SsManifest.protectionElement>
	//   26   50:astore_2        
		if(factory != null)
	//*  27   51:aload_2         
	//*  28   52:ifnull          90
			trackEncryptionBoxes = (new TrackEncryptionBox[] {
				new TrackEncryptionBox(true, ((String) (null)), 8, getProtectionElementKeyId(((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.ProtectionElement) (factory)).data), 0, 0, ((byte []) (null)))
			});
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:anewarray       TrackEncryptionBox[]
	//   32   60:dup             
	//   33   61:iconst_0        
	//   34   62:new             #70  <Class TrackEncryptionBox>
	//   35   65:dup             
	//   36   66:iconst_1        
	//   37   67:aconst_null     
	//   38   68:bipush          8
	//   39   70:aload_2         
	//   40   71:getfield        #76  <Field byte[] com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$ProtectionElement.data>
	//   41   74:invokestatic    #80  <Method byte[] getProtectionElementKeyId(byte[])>
	//   42   77:iconst_0        
	//   43   78:iconst_0        
	//   44   79:aconst_null     
	//   45   80:invokespecial   #83  <Method void TrackEncryptionBox(boolean, String, int, byte[], int, int, byte[])>
	//   46   83:aastore         
	//   47   84:putfield        #85  <Field TrackEncryptionBox[] trackEncryptionBoxes>
		else
	//*  48   87:goto            95
			trackEncryptionBoxes = null;
	//   49   90:aload_0         
	//   50   91:aconst_null     
	//   51   92:putfield        #85  <Field TrackEncryptionBox[] trackEncryptionBoxes>
		manifest = ssmanifest;
	//   52   95:aload_0         
	//   53   96:aload_1         
	//   54   97:putfield        #87  <Field SsManifest manifest>
		sampleStreams = newSampleStreamArray(0);
	//   55  100:aload_0         
	//   56  101:iconst_0        
	//   57  102:invokestatic    #91  <Method ChunkSampleStream[] newSampleStreamArray(int)>
	//   58  105:putfield        #93  <Field ChunkSampleStream[] sampleStreams>
		compositeSequenceableLoader = compositesequenceableloaderfactory.createCompositeSequenceableLoader(((SequenceableLoader []) (sampleStreams)));
	//   59  108:aload_0         
	//   60  109:aload_3         
	//   61  110:aload_0         
	//   62  111:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//   63  114:invokeinterface #99  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   64  119:putfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
		eventdispatcher.mediaPeriodCreated();
	//   65  122:aload           5
	//   66  124:invokevirtual   #106 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//   67  127:return          
	}

	private ChunkSampleStream buildSampleStream(TrackSelection trackselection, long l)
	{
		int i = trackGroups.indexOf(trackselection.getTrackGroup());
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field TrackGroupArray trackGroups>
	//    2    4:aload_1         
	//    3    5:invokeinterface #115 <Method TrackGroup TrackSelection.getTrackGroup()>
	//    4   10:invokevirtual   #121 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//    5   13:istore          4
		trackselection = ((TrackSelection) (chunkSourceFactory.createChunkSource(manifestLoaderErrorThrower, manifest, i, trackselection, trackEncryptionBoxes)));
	//    6   15:aload_0         
	//    7   16:getfield        #46  <Field SsChunkSource$Factory chunkSourceFactory>
	//    8   19:aload_0         
	//    9   20:getfield        #48  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//   10   23:aload_0         
	//   11   24:getfield        #87  <Field SsManifest manifest>
	//   12   27:iload           4
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #85  <Field TrackEncryptionBox[] trackEncryptionBoxes>
	//   16   34:invokeinterface #127 <Method SsChunkSource SsChunkSource$Factory.createChunkSource(LoaderErrorThrower, SsManifest, int, TrackSelection, TrackEncryptionBox[])>
	//   17   39:astore_1        
		return new ChunkSampleStream(manifest.streamElements[i].type, ((int []) (null)), ((com.google.android.exoplayer2.Format []) (null)), ((com.google.android.exoplayer2.source.chunk.ChunkSource) (trackselection)), ((com.google.android.exoplayer2.source.SequenceableLoader.Callback) (this)), allocator, l, minLoadableRetryCount, eventDispatcher);
	//   18   40:new             #129 <Class ChunkSampleStream>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:getfield        #87  <Field SsManifest manifest>
	//   22   48:getfield        #133 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//   23   51:iload           4
	//   24   53:aaload          
	//   25   54:getfield        #138 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.type>
	//   26   57:aconst_null     
	//   27   58:aconst_null     
	//   28   59:aload_1         
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:getfield        #54  <Field Allocator allocator>
	//   32   65:lload_2         
	//   33   66:aload_0         
	//   34   67:getfield        #50  <Field int minLoadableRetryCount>
	//   35   70:aload_0         
	//   36   71:getfield        #52  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   37   74:invokespecial   #141 <Method void ChunkSampleStream(int, int[], com.google.android.exoplayer2.Format[], com.google.android.exoplayer2.source.chunk.ChunkSource, com.google.android.exoplayer2.source.SequenceableLoader$Callback, Allocator, long, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher)>
	//   38   77:areturn         
	}

	private static TrackGroupArray buildTrackGroups(SsManifest ssmanifest)
	{
		Object aobj[] = ((Object []) (ssmanifest.streamElements));
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    2    4:astore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		aobj = ((Object []) (new TrackGroup[aobj.length]));
	//    5    7:aload_2         
	//    6    8:arraylength     
	//    7    9:anewarray       TrackGroup[]
	//    8   12:astore_2        
		for(; i < ssmanifest.streamElements.length; i++)
	//*   9   13:iload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #133 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//*  12   18:arraylength     
	//*  13   19:icmpge          48
			aobj[i] = new TrackGroup(ssmanifest.streamElements[i].formats);
	//   14   22:aload_2         
	//   15   23:iload_1         
	//   16   24:new             #145 <Class TrackGroup>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:getfield        #133 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//   20   32:iload_1         
	//   21   33:aaload          
	//   22   34:getfield        #149 <Field com.google.android.exoplayer2.Format[] com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.formats>
	//   23   37:invokespecial   #152 <Method void TrackGroup(com.google.android.exoplayer2.Format[])>
	//   24   40:aastore         

	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_1        
	//*  29   45:goto            13
		return new TrackGroupArray(((TrackGroup []) (aobj)));
	//   30   48:new             #117 <Class TrackGroupArray>
	//   31   51:dup             
	//   32   52:aload_2         
	//   33   53:invokespecial   #155 <Method void TrackGroupArray(TrackGroup[])>
	//   34   56:areturn         
	}

	private static byte[] getProtectionElementKeyId(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #157 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < abyte0.length; i += 2)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          32
			stringbuilder.append((char)abyte0[i]);
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:int2char        
	//   15   21:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
	//   16   24:pop             

	//   17   25:iload_1         
	//   18   26:iconst_2        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            10
		abyte0 = ((byte []) (stringbuilder.toString()));
	//   22   32:aload_2         
	//   23   33:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   24   36:astore_0        
		abyte0 = Base64.decode(((String) (abyte0)).substring(((String) (abyte0)).indexOf("<KID>") + 5, ((String) (abyte0)).indexOf("</KID>")), 0);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:ldc1            #168 <String "<KID>">
	//   28   41:invokevirtual   #173 <Method int String.indexOf(String)>
	//   29   44:iconst_5        
	//   30   45:iadd            
	//   31   46:aload_0         
	//   32   47:ldc1            #175 <String "</KID>">
	//   33   49:invokevirtual   #173 <Method int String.indexOf(String)>
	//   34   52:invokevirtual   #179 <Method String String.substring(int, int)>
	//   35   55:iconst_0        
	//   36   56:invokestatic    #185 <Method byte[] Base64.decode(String, int)>
	//   37   59:astore_0        
		swap(abyte0, 0, 3);
	//   38   60:aload_0         
	//   39   61:iconst_0        
	//   40   62:iconst_3        
	//   41   63:invokestatic    #189 <Method void swap(byte[], int, int)>
		swap(abyte0, 1, 2);
	//   42   66:aload_0         
	//   43   67:iconst_1        
	//   44   68:iconst_2        
	//   45   69:invokestatic    #189 <Method void swap(byte[], int, int)>
		swap(abyte0, 4, 5);
	//   46   72:aload_0         
	//   47   73:iconst_4        
	//   48   74:iconst_5        
	//   49   75:invokestatic    #189 <Method void swap(byte[], int, int)>
		swap(abyte0, 6, 7);
	//   50   78:aload_0         
	//   51   79:bipush          6
	//   52   81:bipush          7
	//   53   83:invokestatic    #189 <Method void swap(byte[], int, int)>
		return abyte0;
	//   54   86:aload_0         
	//   55   87:areturn         
	}

	private static ChunkSampleStream[] newSampleStreamArray(int i)
	{
		return new ChunkSampleStream[i];
	//    0    0:iload_0         
	//    1    1:anewarray       ChunkSampleStream[]
	//    2    4:areturn         
	}

	private static void swap(byte abyte0[], int i, int j)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_3        
		abyte0[i] = abyte0[j];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:aload_0         
	//    7    7:iload_2         
	//    8    8:baload          
	//    9    9:bastore         
		abyte0[j] = byte0;
	//   10   10:aload_0         
	//   11   11:iload_2         
	//   12   12:iload_3         
	//   13   13:bastore         
	//   14   14:return          
	}

	public boolean continueLoading(long l)
	{
		return compositeSequenceableLoader.continueLoading(l);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #196 <Method boolean SequenceableLoader.continueLoading(long)>
	//    4   10:ireturn         
	}

	public void discardBuffer(long l, boolean flag)
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          40
			achunksamplestream[i].discardBuffer(l, flag);
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:lload_1         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #200 <Method void ChunkSampleStream.discardBuffer(long, boolean)>

	//   17   31:iload           4
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore          4
	//*  21   37:goto            14
	//   22   40:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          54
		{
			ChunkSampleStream chunksamplestream = achunksamplestream[i];
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:astore          7
			if(chunksamplestream.primaryTrackType == 2)
	//*  15   28:aload           7
	//*  16   30:getfield        #205 <Field int ChunkSampleStream.primaryTrackType>
	//*  17   33:iconst_2        
	//*  18   34:icmpne          45
				return chunksamplestream.getAdjustedSeekPositionUs(l, seekparameters);
	//   19   37:aload           7
	//   20   39:lload_1         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #207 <Method long ChunkSampleStream.getAdjustedSeekPositionUs(long, SeekParameters)>
	//   23   44:lreturn         
		}

	//   24   45:iload           4
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore          4
	//*  28   51:goto            14
		return l;
	//   29   54:lload_1         
	//   30   55:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return compositeSequenceableLoader.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #211 <Method long SequenceableLoader.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return compositeSequenceableLoader.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #214 <Method long SequenceableLoader.getNextLoadPositionUs()>
	//    3    9:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field TrackGroupArray trackGroups>
	//    2    4:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		manifestLoaderErrorThrower.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//    2    4:invokeinterface #224 <Method void LoaderErrorThrower.maybeThrowError()>
	//    3    9:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((ChunkSampleStream)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #129 <Class ChunkSampleStream>
	//    3    5:invokevirtual   #230 <Method void onContinueLoadingRequested(ChunkSampleStream)>
	//    4    8:return          
	}

	public void onContinueLoadingRequested(ChunkSampleStream chunksamplestream)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #236 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #232 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		callback1.onPrepared(((MediaPeriod) (this)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokeinterface #243 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//    6   12:return          
	}

	public long readDiscontinuity()
	{
		if(!notifiedReadingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field boolean notifiedReadingStarted>
	//*   2    4:ifne            19
		{
			eventDispatcher.readingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #249 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.readingStarted()>
			notifiedReadingStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #246 <Field boolean notifiedReadingStarted>
		}
		return 0x1L;
	//    9   19:ldc2w           #250 <Long 0x1L>
	//   10   22:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		compositeSequenceableLoader.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #255 <Method void SequenceableLoader.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public void release()
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:istore_2        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			achunksamplestream[i].release();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokevirtual   #258 <Method void ChunkSampleStream.release()>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
		callback = null;
	//   20   28:aload_0         
	//   21   29:aconst_null     
	//   22   30:putfield        #232 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		eventDispatcher.mediaPeriodReleased();
	//   23   33:aload_0         
	//   24   34:getfield        #52  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   25   37:invokevirtual   #261 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//   26   40:return          
	}

	public long seekToUs(long l)
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    8:aload           5
	//*   6   10:arraylength     
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          34
			achunksamplestream[i].seekToUs(l);
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:lload_1         
	//   15   24:invokevirtual   #265 <Method void ChunkSampleStream.seekToUs(long)>

	//   16   27:iload_3         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore_3        
	//*  20   31:goto            13
		return l;
	//   21   34:lload_1         
	//   22   35:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #269 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void ArrayList()>
	//    3    7:astore          8
		for(int i = 0; i < atrackselection.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          7
	//*   6   12:iload           7
	//*   7   14:aload_1         
	//*   8   15:arraylength     
	//*   9   16:icmpge          128
		{
			if(asamplestream[i] != null)
	//*  10   19:aload_3         
	//*  11   20:iload           7
	//*  12   22:aaload          
	//*  13   23:ifnull          73
			{
				ChunkSampleStream chunksamplestream = (ChunkSampleStream)asamplestream[i];
	//   14   26:aload_3         
	//   15   27:iload           7
	//   16   29:aaload          
	//   17   30:checkcast       #129 <Class ChunkSampleStream>
	//   18   33:astore          9
				if(atrackselection[i] != null && aflag[i])
	//*  19   35:aload_1         
	//*  20   36:iload           7
	//*  21   38:aaload          
	//*  22   39:ifnull          63
	//*  23   42:aload_2         
	//*  24   43:iload           7
	//*  25   45:baload          
	//*  26   46:ifne            52
	//*  27   49:goto            63
				{
					arraylist.add(((Object) (chunksamplestream)));
	//   28   52:aload           8
	//   29   54:aload           9
	//   30   56:invokevirtual   #274 <Method boolean ArrayList.add(Object)>
	//   31   59:pop             
				} else
	//*  32   60:goto            73
				{
					chunksamplestream.release();
	//   33   63:aload           9
	//   34   65:invokevirtual   #258 <Method void ChunkSampleStream.release()>
					asamplestream[i] = null;
	//   35   68:aload_3         
	//   36   69:iload           7
	//   37   71:aconst_null     
	//   38   72:aastore         
				}
			}
			if(asamplestream[i] == null && atrackselection[i] != null)
	//*  39   73:aload_3         
	//*  40   74:iload           7
	//*  41   76:aaload          
	//*  42   77:ifnonnull       119
	//*  43   80:aload_1         
	//*  44   81:iload           7
	//*  45   83:aaload          
	//*  46   84:ifnull          119
			{
				ChunkSampleStream chunksamplestream1 = buildSampleStream(atrackselection[i], l);
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:iload           7
	//   50   91:aaload          
	//   51   92:lload           5
	//   52   94:invokespecial   #276 <Method ChunkSampleStream buildSampleStream(TrackSelection, long)>
	//   53   97:astore          9
				arraylist.add(((Object) (chunksamplestream1)));
	//   54   99:aload           8
	//   55  101:aload           9
	//   56  103:invokevirtual   #274 <Method boolean ArrayList.add(Object)>
	//   57  106:pop             
				asamplestream[i] = ((SampleStream) (chunksamplestream1));
	//   58  107:aload_3         
	//   59  108:iload           7
	//   60  110:aload           9
	//   61  112:aastore         
				aflag1[i] = true;
	//   62  113:aload           4
	//   63  115:iload           7
	//   64  117:iconst_1        
	//   65  118:bastore         
			}
		}

	//   66  119:iload           7
	//   67  121:iconst_1        
	//   68  122:iadd            
	//   69  123:istore          7
	//*  70  125:goto            12
		sampleStreams = newSampleStreamArray(arraylist.size());
	//   71  128:aload_0         
	//   72  129:aload           8
	//   73  131:invokevirtual   #280 <Method int ArrayList.size()>
	//   74  134:invokestatic    #91  <Method ChunkSampleStream[] newSampleStreamArray(int)>
	//   75  137:putfield        #93  <Field ChunkSampleStream[] sampleStreams>
		arraylist.toArray(((Object []) (sampleStreams)));
	//   76  140:aload           8
	//   77  142:aload_0         
	//   78  143:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//   79  146:invokevirtual   #284 <Method Object[] ArrayList.toArray(Object[])>
	//   80  149:pop             
		compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(((SequenceableLoader []) (sampleStreams)));
	//   81  150:aload_0         
	//   82  151:aload_0         
	//   83  152:getfield        #56  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   84  155:aload_0         
	//   85  156:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//   86  159:invokeinterface #99  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   87  164:putfield        #101 <Field SequenceableLoader compositeSequenceableLoader>
		return l;
	//   88  167:lload           5
	//   89  169:lreturn         
	}

	public void updateManifest(SsManifest ssmanifest)
	{
		manifest = ssmanifest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field SsManifest manifest>
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field ChunkSampleStream[] sampleStreams>
	//    5    9:astore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		for(int j = achunksamplestream.length; i < j; i++)
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          45
			((SsChunkSource)achunksamplestream[i].getChunkSource()).updateManifest(ssmanifest);
	//   14   22:aload           4
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokevirtual   #290 <Method com.google.android.exoplayer2.source.chunk.ChunkSource ChunkSampleStream.getChunkSource()>
	//   18   29:checkcast       #292 <Class SsChunkSource>
	//   19   32:aload_1         
	//   20   33:invokeinterface #294 <Method void SsChunkSource.updateManifest(SsManifest)>

	//   21   38:iload_2         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore_2        
	//*  25   42:goto            17
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   26   45:aload_0         
	//   27   46:getfield        #232 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//   28   49:aload_0         
	//   29   50:invokeinterface #236 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//   30   55:return          
	}

	private static final int INITIALIZATION_VECTOR_SIZE = 8;
	private final Allocator allocator;
	private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
	private final SsChunkSource.Factory chunkSourceFactory;
	private SequenceableLoader compositeSequenceableLoader;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private SsManifest manifest;
	private final LoaderErrorThrower manifestLoaderErrorThrower;
	private final int minLoadableRetryCount;
	private boolean notifiedReadingStarted;
	private ChunkSampleStream sampleStreams[];
	private final TrackEncryptionBox trackEncryptionBoxes[];
	private final TrackGroupArray trackGroups;
}
