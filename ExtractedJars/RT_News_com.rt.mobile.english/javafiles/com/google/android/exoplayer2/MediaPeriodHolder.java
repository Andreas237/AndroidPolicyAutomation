// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.util.Log;
import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2:
//			MediaPeriodInfo, RendererCapabilities, ExoPlaybackException

final class MediaPeriodHolder
{

	public MediaPeriodHolder(RendererCapabilities arenderercapabilities[], long l, TrackSelector trackselector, Allocator allocator, MediaSource mediasource, Object obj, 
			MediaPeriodInfo mediaperiodinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		rendererCapabilities = arenderercapabilities;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field RendererCapabilities[] rendererCapabilities>
		rendererPositionOffsetUs = l - mediaperiodinfo.startPositionUs;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:aload           8
	//    8   13:getfield        #48  <Field long MediaPeriodInfo.startPositionUs>
	//    9   16:lsub            
	//   10   17:putfield        #50  <Field long rendererPositionOffsetUs>
		trackSelector = trackselector;
	//   11   20:aload_0         
	//   12   21:aload           4
	//   13   23:putfield        #52  <Field TrackSelector trackSelector>
		mediaSource = mediasource;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #54  <Field MediaSource mediaSource>
		uid = Assertions.checkNotNull(obj);
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:invokestatic    #60  <Method Object Assertions.checkNotNull(Object)>
	//   20   38:putfield        #62  <Field Object uid>
		info = mediaperiodinfo;
	//   21   41:aload_0         
	//   22   42:aload           8
	//   23   44:putfield        #64  <Field MediaPeriodInfo info>
		sampleStreams = new SampleStream[arenderercapabilities.length];
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:arraylength     
	//   27   50:anewarray       SampleStream[]
	//   28   53:putfield        #68  <Field SampleStream[] sampleStreams>
		mayRetainStreamFlags = new boolean[arenderercapabilities.length];
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:arraylength     
	//   32   59:newarray        boolean[]
	//   33   61:putfield        #70  <Field boolean[] mayRetainStreamFlags>
		arenderercapabilities = ((RendererCapabilities []) (mediasource.createPeriod(mediaperiodinfo.id, allocator)));
	//   34   64:aload           6
	//   35   66:aload           8
	//   36   68:getfield        #74  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   37   71:aload           5
	//   38   73:invokeinterface #80  <Method MediaPeriod MediaSource.createPeriod(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, Allocator)>
	//   39   78:astore_1        
		if(mediaperiodinfo.endPositionUs != 0x0L)
	//*  40   79:aload           8
	//*  41   81:getfield        #83  <Field long MediaPeriodInfo.endPositionUs>
	//*  42   84:ldc2w           #84  <Long 0x0L>
	//*  43   87:lcmp            
	//*  44   88:ifeq            110
			arenderercapabilities = ((RendererCapabilities []) (new ClippingMediaPeriod(((MediaPeriod) (arenderercapabilities)), true, 0L, mediaperiodinfo.endPositionUs)));
	//   45   91:new             #87  <Class ClippingMediaPeriod>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:iconst_1        
	//   49   97:lconst_0        
	//   50   98:aload           8
	//   51  100:getfield        #83  <Field long MediaPeriodInfo.endPositionUs>
	//   52  103:invokespecial   #90  <Method void ClippingMediaPeriod(MediaPeriod, boolean, long, long)>
	//   53  106:astore_1        
	//*  54  107:goto            110
		mediaPeriod = ((MediaPeriod) (arenderercapabilities));
	//   55  110:aload_0         
	//   56  111:aload_1         
	//   57  112:putfield        #92  <Field MediaPeriod mediaPeriod>
	//   58  115:return          
	}

	private void associateNoSampleRenderersWithEmptySampleStream(SampleStream asamplestream[])
	{
		for(int i = 0; i < rendererCapabilities.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//*   5    7:arraylength     
	//*   6    8:icmpge          54
			if(rendererCapabilities[i].getTrackType() == 5 && trackSelectorResult.isRendererEnabled(i))
	//*   7   11:aload_0         
	//*   8   12:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//*   9   15:iload_2         
	//*  10   16:aaload          
	//*  11   17:invokeinterface #101 <Method int RendererCapabilities.getTrackType()>
	//*  12   22:iconst_5        
	//*  13   23:icmpne          47
	//*  14   26:aload_0         
	//*  15   27:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//*  16   30:iload_2         
	//*  17   31:invokevirtual   #109 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//*  18   34:ifeq            47
				asamplestream[i] = ((SampleStream) (new EmptySampleStream()));
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:new             #111 <Class EmptySampleStream>
	//   22   42:dup             
	//   23   43:invokespecial   #112 <Method void EmptySampleStream()>
	//   24   46:aastore         

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:istore_2        
	//*  29   51:goto            2
	//   30   54:return          
	}

	private void disableTrackSelectionsInResult(TrackSelectorResult trackselectorresult)
	{
		for(int i = 0; i < trackselectorresult.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:getfield        #118 <Field int TrackSelectorResult.length>
	//*   5    7:icmpge          49
		{
			boolean flag = trackselectorresult.isRendererEnabled(i);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #109 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//    9   15:istore_3        
			TrackSelection trackselection = trackselectorresult.selections.get(i);
	//   10   16:aload_1         
	//   11   17:getfield        #122 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #128 <Method TrackSelection TrackSelectionArray.get(int)>
	//   14   24:astore          4
			if(flag && trackselection != null)
	//*  15   26:iload_3         
	//*  16   27:ifeq            42
	//*  17   30:aload           4
	//*  18   32:ifnull          42
				trackselection.disable();
	//   19   35:aload           4
	//   20   37:invokeinterface #133 <Method void TrackSelection.disable()>
		}

	//   21   42:iload_2         
	//   22   43:iconst_1        
	//   23   44:iadd            
	//   24   45:istore_2        
	//*  25   46:goto            2
	//   26   49:return          
	}

	private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream asamplestream[])
	{
		for(int i = 0; i < rendererCapabilities.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//*   5    7:arraylength     
	//*   6    8:icmpge          37
			if(rendererCapabilities[i].getTrackType() == 5)
	//*   7   11:aload_0         
	//*   8   12:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//*   9   15:iload_2         
	//*  10   16:aaload          
	//*  11   17:invokeinterface #101 <Method int RendererCapabilities.getTrackType()>
	//*  12   22:iconst_5        
	//*  13   23:icmpne          30
				asamplestream[i] = null;
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:aconst_null     
	//   17   29:aastore         

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
	//*  22   34:goto            2
	//   23   37:return          
	}

	private void enableTrackSelectionsInResult(TrackSelectorResult trackselectorresult)
	{
		for(int i = 0; i < trackselectorresult.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:getfield        #118 <Field int TrackSelectorResult.length>
	//*   5    7:icmpge          49
		{
			boolean flag = trackselectorresult.isRendererEnabled(i);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #109 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//    9   15:istore_3        
			TrackSelection trackselection = trackselectorresult.selections.get(i);
	//   10   16:aload_1         
	//   11   17:getfield        #122 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #128 <Method TrackSelection TrackSelectionArray.get(int)>
	//   14   24:astore          4
			if(flag && trackselection != null)
	//*  15   26:iload_3         
	//*  16   27:ifeq            42
	//*  17   30:aload           4
	//*  18   32:ifnull          42
				trackselection.enable();
	//   19   35:aload           4
	//   20   37:invokeinterface #138 <Method void TrackSelection.enable()>
		}

	//   21   42:iload_2         
	//   22   43:iconst_1        
	//   23   44:iadd            
	//   24   45:istore_2        
	//*  25   46:goto            2
	//   26   49:return          
	}

	private void updatePeriodTrackSelectorResult(TrackSelectorResult trackselectorresult)
	{
		if(periodTrackSelectorResult != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//*   2    4:ifnull          15
			disableTrackSelectionsInResult(periodTrackSelectorResult);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//    6   12:invokespecial   #143 <Method void disableTrackSelectionsInResult(TrackSelectorResult)>
		periodTrackSelectorResult = trackselectorresult;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
		if(periodTrackSelectorResult != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//*  12   24:ifnull          35
			enableTrackSelectionsInResult(periodTrackSelectorResult);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//   16   32:invokespecial   #145 <Method void enableTrackSelectionsInResult(TrackSelectorResult)>
	//   17   35:return          
	}

	public long applyTrackSelection(long l, boolean flag)
	{
		return applyTrackSelection(l, flag, new boolean[rendererCapabilities.length]);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//    5    7:arraylength     
	//    6    8:newarray        boolean[]
	//    7   10:invokevirtual   #150 <Method long applyTrackSelection(long, boolean, boolean[])>
	//    8   13:lreturn         
	}

	public long applyTrackSelection(long l, boolean flag, boolean aflag[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		do
		{
			int k = trackSelectorResult.length;
	//    2    3:aload_0         
	//    3    4:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//    4    7:getfield        #118 <Field int TrackSelectorResult.length>
	//    5   10:istore          6
			boolean flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          7
			if(i >= k)
				break;
	//    8   15:iload           5
	//    9   17:iload           6
	//   10   19:icmpge          70
			boolean aflag1[] = mayRetainStreamFlags;
	//   11   22:aload_0         
	//   12   23:getfield        #70  <Field boolean[] mayRetainStreamFlags>
	//   13   26:astore          8
			if(flag || !trackSelectorResult.isEquivalent(periodTrackSelectorResult, i))
	//*  14   28:iload_3         
	//*  15   29:ifne            51
	//*  16   32:aload_0         
	//*  17   33:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//*  18   36:aload_0         
	//*  19   37:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//*  20   40:iload           5
	//*  21   42:invokevirtual   #154 <Method boolean TrackSelectorResult.isEquivalent(TrackSelectorResult, int)>
	//*  22   45:ifeq            51
	//*  23   48:goto            54
				flag1 = false;
	//   24   51:iconst_0        
	//   25   52:istore          7
			aflag1[i] = flag1;
	//   26   54:aload           8
	//   27   56:iload           5
	//   28   58:iload           7
	//   29   60:bastore         
			i++;
	//   30   61:iload           5
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore          5
		} while(true);
	//   34   67:goto            3
		disassociateNoSampleRenderersWithEmptySampleStream(sampleStreams);
	//   35   70:aload_0         
	//   36   71:aload_0         
	//   37   72:getfield        #68  <Field SampleStream[] sampleStreams>
	//   38   75:invokespecial   #156 <Method void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[])>
		updatePeriodTrackSelectorResult(trackSelectorResult);
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//   42   83:invokespecial   #158 <Method void updatePeriodTrackSelectorResult(TrackSelectorResult)>
		TrackSelectionArray trackselectionarray = trackSelectorResult.selections;
	//   43   86:aload_0         
	//   44   87:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//   45   90:getfield        #122 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   46   93:astore          8
		l = mediaPeriod.selectTracks(trackselectionarray.getAll(), mayRetainStreamFlags, sampleStreams, aflag, l);
	//   47   95:aload_0         
	//   48   96:getfield        #92  <Field MediaPeriod mediaPeriod>
	//   49   99:aload           8
	//   50  101:invokevirtual   #162 <Method TrackSelection[] TrackSelectionArray.getAll()>
	//   51  104:aload_0         
	//   52  105:getfield        #70  <Field boolean[] mayRetainStreamFlags>
	//   53  108:aload_0         
	//   54  109:getfield        #68  <Field SampleStream[] sampleStreams>
	//   55  112:aload           4
	//   56  114:lload_1         
	//   57  115:invokeinterface #168 <Method long MediaPeriod.selectTracks(TrackSelection[], boolean[], SampleStream[], boolean[], long)>
	//   58  120:lstore_1        
		associateNoSampleRenderersWithEmptySampleStream(sampleStreams);
	//   59  121:aload_0         
	//   60  122:aload_0         
	//   61  123:getfield        #68  <Field SampleStream[] sampleStreams>
	//   62  126:invokespecial   #170 <Method void associateNoSampleRenderersWithEmptySampleStream(SampleStream[])>
		hasEnabledTracks = false;
	//   63  129:aload_0         
	//   64  130:iconst_0        
	//   65  131:putfield        #172 <Field boolean hasEnabledTracks>
		for(int j = 0; j < sampleStreams.length; j++)
	//*  66  134:iconst_0        
	//*  67  135:istore          5
	//*  68  137:iload           5
	//*  69  139:aload_0         
	//*  70  140:getfield        #68  <Field SampleStream[] sampleStreams>
	//*  71  143:arraylength     
	//*  72  144:icmpge          223
		{
			if(sampleStreams[j] != null)
	//*  73  147:aload_0         
	//*  74  148:getfield        #68  <Field SampleStream[] sampleStreams>
	//*  75  151:iload           5
	//*  76  153:aaload          
	//*  77  154:ifnull          193
			{
				Assertions.checkState(trackSelectorResult.isRendererEnabled(j));
	//   78  157:aload_0         
	//   79  158:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//   80  161:iload           5
	//   81  163:invokevirtual   #109 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//   82  166:invokestatic    #176 <Method void Assertions.checkState(boolean)>
				if(rendererCapabilities[j].getTrackType() != 5)
	//*  83  169:aload_0         
	//*  84  170:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//*  85  173:iload           5
	//*  86  175:aaload          
	//*  87  176:invokeinterface #101 <Method int RendererCapabilities.getTrackType()>
	//*  88  181:iconst_5        
	//*  89  182:icmpeq          214
					hasEnabledTracks = true;
	//   90  185:aload_0         
	//   91  186:iconst_1        
	//   92  187:putfield        #172 <Field boolean hasEnabledTracks>
				continue;
	//   93  190:goto            214
			}
			if(trackselectionarray.get(j) == null)
	//*  94  193:aload           8
	//*  95  195:iload           5
	//*  96  197:invokevirtual   #128 <Method TrackSelection TrackSelectionArray.get(int)>
	//*  97  200:ifnonnull       208
				flag = true;
	//   98  203:iconst_1        
	//   99  204:istore_3        
			else
	//* 100  205:goto            210
				flag = false;
	//  101  208:iconst_0        
	//  102  209:istore_3        
			Assertions.checkState(flag);
	//  103  210:iload_3         
	//  104  211:invokestatic    #176 <Method void Assertions.checkState(boolean)>
		}

	//  105  214:iload           5
	//  106  216:iconst_1        
	//  107  217:iadd            
	//  108  218:istore          5
	//* 109  220:goto            137
		return l;
	//  110  223:lload_1         
	//  111  224:lreturn         
	}

	public void continueLoading(long l)
	{
		l = toPeriodTime(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #182 <Method long toPeriodTime(long)>
	//    3    5:lstore_1        
		mediaPeriod.continueLoading(l);
	//    4    6:aload_0         
	//    5    7:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    6   10:lload_1         
	//    7   11:invokeinterface #185 <Method boolean MediaPeriod.continueLoading(long)>
	//    8   16:pop             
	//    9   17:return          
	}

	public long getBufferedPositionUs(boolean flag)
	{
		if(!prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field boolean prepared>
	//*   2    4:ifne            15
			return info.startPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field MediaPeriodInfo info>
	//    5   11:getfield        #48  <Field long MediaPeriodInfo.startPositionUs>
	//    6   14:lreturn         
		long l1 = mediaPeriod.getBufferedPositionUs();
	//    7   15:aload_0         
	//    8   16:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    9   19:invokeinterface #192 <Method long MediaPeriod.getBufferedPositionUs()>
	//   10   24:lstore          4
		long l = l1;
	//   11   26:lload           4
	//   12   28:lstore_2        
		if(l1 == 0x0L)
	//*  13   29:lload           4
	//*  14   31:ldc2w           #84  <Long 0x0L>
	//*  15   34:lcmp            
	//*  16   35:ifne            53
		{
			l = l1;
	//   17   38:lload           4
	//   18   40:lstore_2        
			if(flag)
	//*  19   41:iload_1         
	//*  20   42:ifeq            53
				l = info.durationUs;
	//   21   45:aload_0         
	//   22   46:getfield        #64  <Field MediaPeriodInfo info>
	//   23   49:getfield        #195 <Field long MediaPeriodInfo.durationUs>
	//   24   52:lstore_2        
		}
		return l;
	//   25   53:lload_2         
	//   26   54:lreturn         
	}

	public long getDurationUs()
	{
		return info.durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MediaPeriodInfo info>
	//    2    4:getfield        #195 <Field long MediaPeriodInfo.durationUs>
	//    3    7:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		if(!prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field boolean prepared>
	//*   2    4:ifne            9
			return 0L;
	//    3    7:lconst_0        
	//    4    8:lreturn         
		else
			return mediaPeriod.getNextLoadPositionUs();
	//    5    9:aload_0         
	//    6   10:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    7   13:invokeinterface #199 <Method long MediaPeriod.getNextLoadPositionUs()>
	//    8   18:lreturn         
	}

	public long getRendererOffset()
	{
		return rendererPositionOffsetUs;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long rendererPositionOffsetUs>
	//    2    4:lreturn         
	}

	public void handlePrepared(float f)
		throws ExoPlaybackException
	{
		prepared = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #189 <Field boolean prepared>
		trackGroups = mediaPeriod.getTrackGroups();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    6   10:invokeinterface #208 <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//    7   15:putfield        #210 <Field TrackGroupArray trackGroups>
		selectTracks(f);
	//    8   18:aload_0         
	//    9   19:fload_1         
	//   10   20:invokevirtual   #213 <Method boolean selectTracks(float)>
	//   11   23:pop             
		long l = applyTrackSelection(info.startPositionUs, false);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #64  <Field MediaPeriodInfo info>
	//   15   29:getfield        #48  <Field long MediaPeriodInfo.startPositionUs>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #215 <Method long applyTrackSelection(long, boolean)>
	//   18   36:lstore_2        
		rendererPositionOffsetUs = rendererPositionOffsetUs + (info.startPositionUs - l);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #50  <Field long rendererPositionOffsetUs>
	//   22   42:aload_0         
	//   23   43:getfield        #64  <Field MediaPeriodInfo info>
	//   24   46:getfield        #48  <Field long MediaPeriodInfo.startPositionUs>
	//   25   49:lload_2         
	//   26   50:lsub            
	//   27   51:ladd            
	//   28   52:putfield        #50  <Field long rendererPositionOffsetUs>
		info = info.copyWithStartPositionUs(l);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #64  <Field MediaPeriodInfo info>
	//   32   60:lload_2         
	//   33   61:invokevirtual   #219 <Method MediaPeriodInfo MediaPeriodInfo.copyWithStartPositionUs(long)>
	//   34   64:putfield        #64  <Field MediaPeriodInfo info>
	//   35   67:return          
	}

	public boolean isFullyBuffered()
	{
		return prepared && (!hasEnabledTracks || mediaPeriod.getBufferedPositionUs() == 0x0L);
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field boolean prepared>
	//    2    4:ifeq            32
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field boolean hasEnabledTracks>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    8   18:invokeinterface #192 <Method long MediaPeriod.getBufferedPositionUs()>
	//    9   23:ldc2w           #84  <Long 0x0L>
	//   10   26:lcmp            
	//   11   27:ifne            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public void reevaluateBuffer(long l)
	{
		if(prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field boolean prepared>
	//*   2    4:ifeq            21
			mediaPeriod.reevaluateBuffer(toPeriodTime(l));
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field MediaPeriod mediaPeriod>
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:invokevirtual   #182 <Method long toPeriodTime(long)>
	//    8   16:invokeinterface #225 <Method void MediaPeriod.reevaluateBuffer(long)>
	//    9   21:return          
	}

	public void release()
	{
		updatePeriodTrackSelectorResult(((TrackSelectorResult) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #158 <Method void updatePeriodTrackSelectorResult(TrackSelectorResult)>
		if(info.endPositionUs != 0x0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #64  <Field MediaPeriodInfo info>
	//*   5    9:getfield        #83  <Field long MediaPeriodInfo.endPositionUs>
	//*   6   12:ldc2w           #84  <Long 0x0L>
	//*   7   15:lcmp            
	//*   8   16:ifeq            39
		{
			mediaSource.releasePeriod(((ClippingMediaPeriod)mediaPeriod).mediaPeriod);
	//    9   19:aload_0         
	//   10   20:getfield        #54  <Field MediaSource mediaSource>
	//   11   23:aload_0         
	//   12   24:getfield        #92  <Field MediaPeriod mediaPeriod>
	//   13   27:checkcast       #87  <Class ClippingMediaPeriod>
	//   14   30:getfield        #229 <Field MediaPeriod ClippingMediaPeriod.mediaPeriod>
	//   15   33:invokeinterface #233 <Method void MediaSource.releasePeriod(MediaPeriod)>
			return;
	//   16   38:return          
		}
		try
		{
			mediaSource.releasePeriod(mediaPeriod);
	//   17   39:aload_0         
	//   18   40:getfield        #54  <Field MediaSource mediaSource>
	//   19   43:aload_0         
	//   20   44:getfield        #92  <Field MediaPeriod mediaPeriod>
	//   21   47:invokeinterface #233 <Method void MediaSource.releasePeriod(MediaPeriod)>
			return;
	//   22   52:return          
		}
		catch(RuntimeException runtimeexception)
	//*  23   53:astore_1        
		{
			Log.e("MediaPeriodHolder", "Period release failed.", ((Throwable) (runtimeexception)));
	//   24   54:ldc1            #8   <String "MediaPeriodHolder">
	//   25   56:ldc1            #235 <String "Period release failed.">
	//   26   58:aload_1         
	//   27   59:invokestatic    #241 <Method int Log.e(String, String, Throwable)>
	//   28   62:pop             
		}
		return;
	//   29   63:return          
	}

	public boolean selectTracks(float f)
		throws ExoPlaybackException
	{
		TrackSelectorResult trackselectorresult = trackSelector.selectTracks(rendererCapabilities, trackGroups);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field TrackSelector trackSelector>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field RendererCapabilities[] rendererCapabilities>
	//    4    8:aload_0         
	//    5    9:getfield        #210 <Field TrackGroupArray trackGroups>
	//    6   12:invokevirtual   #246 <Method TrackSelectorResult TrackSelector.selectTracks(RendererCapabilities[], TrackGroupArray)>
	//    7   15:astore          5
		boolean flag = trackselectorresult.isEquivalent(periodTrackSelectorResult);
	//    8   17:aload           5
	//    9   19:aload_0         
	//   10   20:getfield        #141 <Field TrackSelectorResult periodTrackSelectorResult>
	//   11   23:invokevirtual   #249 <Method boolean TrackSelectorResult.isEquivalent(TrackSelectorResult)>
	//   12   26:istore          4
		int i = 0;
	//   13   28:iconst_0        
	//   14   29:istore_2        
		if(flag)
	//*  15   30:iload           4
	//*  16   32:ifeq            37
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		trackSelectorResult = trackselectorresult;
	//   19   37:aload_0         
	//   20   38:aload           5
	//   21   40:putfield        #103 <Field TrackSelectorResult trackSelectorResult>
		TrackSelection atrackselection[] = trackSelectorResult.selections.getAll();
	//   22   43:aload_0         
	//   23   44:getfield        #103 <Field TrackSelectorResult trackSelectorResult>
	//   24   47:getfield        #122 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   25   50:invokevirtual   #162 <Method TrackSelection[] TrackSelectionArray.getAll()>
	//   26   53:astore          5
		for(int j = atrackselection.length; i < j; i++)
	//*  27   55:aload           5
	//*  28   57:arraylength     
	//*  29   58:istore_3        
	//*  30   59:iload_2         
	//*  31   60:iload_3         
	//*  32   61:icmpge          90
		{
			TrackSelection trackselection = atrackselection[i];
	//   33   64:aload           5
	//   34   66:iload_2         
	//   35   67:aaload          
	//   36   68:astore          6
			if(trackselection != null)
	//*  37   70:aload           6
	//*  38   72:ifnull          83
				trackselection.onPlaybackSpeed(f);
	//   39   75:aload           6
	//   40   77:fload_1         
	//   41   78:invokeinterface #252 <Method void TrackSelection.onPlaybackSpeed(float)>
		}

	//   42   83:iload_2         
	//   43   84:iconst_1        
	//   44   85:iadd            
	//   45   86:istore_2        
	//*  46   87:goto            59
		return true;
	//   47   90:iconst_1        
	//   48   91:ireturn         
	}

	public long toPeriodTime(long l)
	{
		return l - getRendererOffset();
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method long getRendererOffset()>
	//    3    5:lsub            
	//    4    6:lreturn         
	}

	public long toRendererTime(long l)
	{
		return l + getRendererOffset();
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #254 <Method long getRendererOffset()>
	//    3    5:ladd            
	//    4    6:lreturn         
	}

	private static final String TAG = "MediaPeriodHolder";
	public boolean hasEnabledTracks;
	public MediaPeriodInfo info;
	public final boolean mayRetainStreamFlags[];
	public final MediaPeriod mediaPeriod;
	private final MediaSource mediaSource;
	public MediaPeriodHolder next;
	private TrackSelectorResult periodTrackSelectorResult;
	public boolean prepared;
	private final RendererCapabilities rendererCapabilities[];
	public long rendererPositionOffsetUs;
	public final SampleStream sampleStreams[];
	public TrackGroupArray trackGroups;
	private final TrackSelector trackSelector;
	public TrackSelectorResult trackSelectorResult;
	public final Object uid;
}
