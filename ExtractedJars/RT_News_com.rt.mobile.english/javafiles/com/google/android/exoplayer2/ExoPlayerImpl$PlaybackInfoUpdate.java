// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImpl, PlaybackInfo

private static final class ExoPlayerImpl$PlaybackInfoUpdate
{

	public void notifyListeners()
	{
		if(timelineOrManifestChanged || timelineChangeReason == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean timelineOrManifestChanged>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field int timelineChangeReason>
	//*   5   11:ifne            68
		{
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Player.EventListener)iterator.next()).onTimelineChanged(playbackInfo.timeline, playbackInfo.manifest, timelineChangeReason));
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field Set listeners>
	//    8   18:invokeinterface #84  <Method Iterator Set.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            68
	//   13   33:aload_1         
	//   14   34:invokeinterface #94  <Method Object Iterator.next()>
	//   15   39:checkcast       #96  <Class Player$EventListener>
	//   16   42:aload_0         
	//   17   43:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   18   46:getfield        #57  <Field Timeline PlaybackInfo.timeline>
	//   19   49:aload_0         
	//   20   50:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   21   53:getfield        #61  <Field Object PlaybackInfo.manifest>
	//   22   56:aload_0         
	//   23   57:getfield        #42  <Field int timelineChangeReason>
	//   24   60:invokeinterface #100 <Method void Player$EventListener.onTimelineChanged(Timeline, Object, int)>
		}
	//*  25   65:goto            24
		if(positionDiscontinuity)
	//*  26   68:aload_0         
	//*  27   69:getfield        #38  <Field boolean positionDiscontinuity>
	//*  28   72:ifeq            115
		{
			for(Iterator iterator1 = listeners.iterator(); iterator1.hasNext(); ((Player.EventListener)iterator1.next()).onPositionDiscontinuity(positionDiscontinuityReason));
	//   29   75:aload_0         
	//   30   76:getfield        #34  <Field Set listeners>
	//   31   79:invokeinterface #84  <Method Iterator Set.iterator()>
	//   32   84:astore_1        
	//   33   85:aload_1         
	//   34   86:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   35   91:ifeq            115
	//   36   94:aload_1         
	//   37   95:invokeinterface #94  <Method Object Iterator.next()>
	//   38  100:checkcast       #96  <Class Player$EventListener>
	//   39  103:aload_0         
	//   40  104:getfield        #40  <Field int positionDiscontinuityReason>
	//   41  107:invokeinterface #104 <Method void Player$EventListener.onPositionDiscontinuity(int)>
		}
	//*  42  112:goto            85
		if(trackSelectorResultChanged)
	//*  43  115:aload_0         
	//*  44  116:getfield        #74  <Field boolean trackSelectorResultChanged>
	//*  45  119:ifeq            192
		{
			trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
	//   46  122:aload_0         
	//   47  123:getfield        #36  <Field TrackSelector trackSelector>
	//   48  126:aload_0         
	//   49  127:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   50  130:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//   51  133:getfield        #109 <Field Object TrackSelectorResult.info>
	//   52  136:invokevirtual   #115 <Method void TrackSelector.onSelectionActivated(Object)>
			for(Iterator iterator2 = listeners.iterator(); iterator2.hasNext(); ((Player.EventListener)iterator2.next()).onTracksChanged(playbackInfo.trackGroups, playbackInfo.trackSelectorResult.selections));
	//   53  139:aload_0         
	//   54  140:getfield        #34  <Field Set listeners>
	//   55  143:invokeinterface #84  <Method Iterator Set.iterator()>
	//   56  148:astore_1        
	//   57  149:aload_1         
	//   58  150:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   59  155:ifeq            192
	//   60  158:aload_1         
	//   61  159:invokeinterface #94  <Method Object Iterator.next()>
	//   62  164:checkcast       #96  <Class Player$EventListener>
	//   63  167:aload_0         
	//   64  168:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   65  171:getfield        #119 <Field com.google.android.exoplayer2.source.TrackGroupArray PlaybackInfo.trackGroups>
	//   66  174:aload_0         
	//   67  175:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   68  178:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//   69  181:getfield        #123 <Field com.google.android.exoplayer2.trackselection.TrackSelectionArray TrackSelectorResult.selections>
	//   70  184:invokeinterface #127 <Method void Player$EventListener.onTracksChanged(com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectionArray)>
		}
	//*  71  189:goto            149
		if(isLoadingChanged)
	//*  72  192:aload_0         
	//*  73  193:getfield        #68  <Field boolean isLoadingChanged>
	//*  74  196:ifeq            242
		{
			for(Iterator iterator3 = listeners.iterator(); iterator3.hasNext(); ((Player.EventListener)iterator3.next()).onLoadingChanged(playbackInfo.isLoading));
	//   75  199:aload_0         
	//   76  200:getfield        #34  <Field Set listeners>
	//   77  203:invokeinterface #84  <Method Iterator Set.iterator()>
	//   78  208:astore_1        
	//   79  209:aload_1         
	//   80  210:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   81  215:ifeq            242
	//   82  218:aload_1         
	//   83  219:invokeinterface #94  <Method Object Iterator.next()>
	//   84  224:checkcast       #96  <Class Player$EventListener>
	//   85  227:aload_0         
	//   86  228:getfield        #32  <Field PlaybackInfo playbackInfo>
	//   87  231:getfield        #66  <Field boolean PlaybackInfo.isLoading>
	//   88  234:invokeinterface #131 <Method void Player$EventListener.onLoadingChanged(boolean)>
		}
	//*  89  239:goto            209
		if(playbackStateOrPlayWhenReadyChanged)
	//*  90  242:aload_0         
	//*  91  243:getfield        #53  <Field boolean playbackStateOrPlayWhenReadyChanged>
	//*  92  246:ifeq            296
		{
			for(Iterator iterator4 = listeners.iterator(); iterator4.hasNext(); ((Player.EventListener)iterator4.next()).onPlayerStateChanged(playWhenReady, playbackInfo.playbackState));
	//   93  249:aload_0         
	//   94  250:getfield        #34  <Field Set listeners>
	//   95  253:invokeinterface #84  <Method Iterator Set.iterator()>
	//   96  258:astore_1        
	//   97  259:aload_1         
	//   98  260:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   99  265:ifeq            296
	//  100  268:aload_1         
	//  101  269:invokeinterface #94  <Method Object Iterator.next()>
	//  102  274:checkcast       #96  <Class Player$EventListener>
	//  103  277:aload_0         
	//  104  278:getfield        #46  <Field boolean playWhenReady>
	//  105  281:aload_0         
	//  106  282:getfield        #32  <Field PlaybackInfo playbackInfo>
	//  107  285:getfield        #51  <Field int PlaybackInfo.playbackState>
	//  108  288:invokeinterface #135 <Method void Player$EventListener.onPlayerStateChanged(boolean, int)>
		}
	//* 109  293:goto            259
		if(seekProcessed)
	//* 110  296:aload_0         
	//* 111  297:getfield        #44  <Field boolean seekProcessed>
	//* 112  300:ifeq            339
		{
			for(Iterator iterator5 = listeners.iterator(); iterator5.hasNext(); ((Player.EventListener)iterator5.next()).onSeekProcessed());
	//  113  303:aload_0         
	//  114  304:getfield        #34  <Field Set listeners>
	//  115  307:invokeinterface #84  <Method Iterator Set.iterator()>
	//  116  312:astore_1        
	//  117  313:aload_1         
	//  118  314:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//  119  319:ifeq            339
	//  120  322:aload_1         
	//  121  323:invokeinterface #94  <Method Object Iterator.next()>
	//  122  328:checkcast       #96  <Class Player$EventListener>
	//  123  331:invokeinterface #138 <Method void Player$EventListener.onSeekProcessed()>
		}
	//* 124  336:goto            313
	//  125  339:return          
	}

	private final boolean isLoadingChanged;
	private final Set listeners;
	private final boolean playWhenReady;
	private final PlaybackInfo playbackInfo;
	private final boolean playbackStateOrPlayWhenReadyChanged;
	private final boolean positionDiscontinuity;
	private final int positionDiscontinuityReason;
	private final boolean seekProcessed;
	private final int timelineChangeReason;
	private final boolean timelineOrManifestChanged;
	private final TrackSelector trackSelector;
	private final boolean trackSelectorResultChanged;

	public ExoPlayerImpl$PlaybackInfoUpdate(PlaybackInfo playbackinfo, PlaybackInfo playbackinfo1, Set set, TrackSelector trackselector, boolean flag, int i, int j, 
			boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		playbackInfo = playbackinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field PlaybackInfo playbackInfo>
		listeners = set;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #34  <Field Set listeners>
		trackSelector = trackselector;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #36  <Field TrackSelector trackSelector>
		positionDiscontinuity = flag;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #38  <Field boolean positionDiscontinuity>
		positionDiscontinuityReason = i;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #40  <Field int positionDiscontinuityReason>
		timelineChangeReason = j;
	//   17   32:aload_0         
	//   18   33:iload           7
	//   19   35:putfield        #42  <Field int timelineChangeReason>
		seekProcessed = flag1;
	//   20   38:aload_0         
	//   21   39:iload           8
	//   22   41:putfield        #44  <Field boolean seekProcessed>
		playWhenReady = flag2;
	//   23   44:aload_0         
	//   24   45:iload           9
	//   25   47:putfield        #46  <Field boolean playWhenReady>
		flag1 = true;
	//   26   50:iconst_1        
	//   27   51:istore          8
		if(!flag3 && playbackinfo1.playbackState == playbackinfo.playbackState)
	//*  28   53:iload           10
	//*  29   55:ifne            78
	//*  30   58:aload_2         
	//*  31   59:getfield        #51  <Field int PlaybackInfo.playbackState>
	//*  32   62:aload_1         
	//*  33   63:getfield        #51  <Field int PlaybackInfo.playbackState>
	//*  34   66:icmpeq          72
	//*  35   69:goto            78
			flag = false;
	//   36   72:iconst_0        
	//   37   73:istore          5
		else
	//*  38   75:goto            81
			flag = true;
	//   39   78:iconst_1        
	//   40   79:istore          5
		playbackStateOrPlayWhenReadyChanged = flag;
	//   41   81:aload_0         
	//   42   82:iload           5
	//   43   84:putfield        #53  <Field boolean playbackStateOrPlayWhenReadyChanged>
		if(playbackinfo1.timeline == playbackinfo.timeline && playbackinfo1.manifest == playbackinfo.manifest)
	//*  44   87:aload_2         
	//*  45   88:getfield        #57  <Field Timeline PlaybackInfo.timeline>
	//*  46   91:aload_1         
	//*  47   92:getfield        #57  <Field Timeline PlaybackInfo.timeline>
	//*  48   95:if_acmpne       118
	//*  49   98:aload_2         
	//*  50   99:getfield        #61  <Field Object PlaybackInfo.manifest>
	//*  51  102:aload_1         
	//*  52  103:getfield        #61  <Field Object PlaybackInfo.manifest>
	//*  53  106:if_acmpeq       112
	//*  54  109:goto            118
			flag = false;
	//   55  112:iconst_0        
	//   56  113:istore          5
		else
	//*  57  115:goto            121
			flag = true;
	//   58  118:iconst_1        
	//   59  119:istore          5
		timelineOrManifestChanged = flag;
	//   60  121:aload_0         
	//   61  122:iload           5
	//   62  124:putfield        #63  <Field boolean timelineOrManifestChanged>
		if(playbackinfo1.isLoading != playbackinfo.isLoading)
	//*  63  127:aload_2         
	//*  64  128:getfield        #66  <Field boolean PlaybackInfo.isLoading>
	//*  65  131:aload_1         
	//*  66  132:getfield        #66  <Field boolean PlaybackInfo.isLoading>
	//*  67  135:icmpeq          144
			flag = true;
	//   68  138:iconst_1        
	//   69  139:istore          5
		else
	//*  70  141:goto            147
			flag = false;
	//   71  144:iconst_0        
	//   72  145:istore          5
		isLoadingChanged = flag;
	//   73  147:aload_0         
	//   74  148:iload           5
	//   75  150:putfield        #68  <Field boolean isLoadingChanged>
		if(playbackinfo1.trackSelectorResult != playbackinfo.trackSelectorResult)
	//*  76  153:aload_2         
	//*  77  154:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//*  78  157:aload_1         
	//*  79  158:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//*  80  161:if_acmpeq       171
			flag = flag1;
	//   81  164:iload           8
	//   82  166:istore          5
		else
	//*  83  168:goto            174
			flag = false;
	//   84  171:iconst_0        
	//   85  172:istore          5
		trackSelectorResultChanged = flag;
	//   86  174:aload_0         
	//   87  175:iload           5
	//   88  177:putfield        #74  <Field boolean trackSelectorResultChanged>
	//   89  180:return          
	}
}
