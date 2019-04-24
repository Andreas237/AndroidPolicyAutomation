// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			TimestampAdjusterProvider, HlsSampleStreamWrapper, HlsChunkSource, HlsDataSourceFactory, 
//			HlsExtractorFactory

public final class HlsMediaPeriod
	implements MediaPeriod, HlsSampleStreamWrapper.Callback, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
{

	public HlsMediaPeriod(HlsExtractorFactory hlsextractorfactory, HlsPlaylistTracker hlsplaylisttracker, HlsDataSourceFactory hlsdatasourcefactory, int i, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher, Allocator allocator1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		extractorFactory = hlsextractorfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field HlsExtractorFactory extractorFactory>
		playlistTracker = hlsplaylisttracker;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field HlsPlaylistTracker playlistTracker>
		dataSourceFactory = hlsdatasourcefactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field HlsDataSourceFactory dataSourceFactory>
		minLoadableRetryCount = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #56  <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #58  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		allocator = allocator1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #60  <Field Allocator allocator>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #62  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		allowChunklessPreparation = flag;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #64  <Field boolean allowChunklessPreparation>
		compositeSequenceableLoader = compositesequenceableloaderfactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
	//   26   49:aload_0         
	//   27   50:aload           7
	//   28   52:iconst_0        
	//   29   53:anewarray       SequenceableLoader[]
	//   30   56:invokeinterface #72  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   31   61:putfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
	//   32   64:aload_0         
	//   33   65:new             #76  <Class IdentityHashMap>
	//   34   68:dup             
	//   35   69:invokespecial   #77  <Method void IdentityHashMap()>
	//   36   72:putfield        #79  <Field IdentityHashMap streamWrapperIndices>
	//   37   75:aload_0         
	//   38   76:new             #81  <Class TimestampAdjusterProvider>
	//   39   79:dup             
	//   40   80:invokespecial   #82  <Method void TimestampAdjusterProvider()>
	//   41   83:putfield        #84  <Field TimestampAdjusterProvider timestampAdjusterProvider>
		sampleStreamWrappers = new HlsSampleStreamWrapper[0];
	//   42   86:aload_0         
	//   43   87:iconst_0        
	//   44   88:anewarray       HlsSampleStreamWrapper[]
	//   45   91:putfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
		enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
	//   46   94:aload_0         
	//   47   95:iconst_0        
	//   48   96:anewarray       HlsSampleStreamWrapper[]
	//   49   99:putfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
		eventdispatcher.mediaPeriodCreated();
	//   50  102:aload           5
	//   51  104:invokevirtual   #95  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//   52  107:return          
	}

	private void buildAndPrepareMainSampleStreamWrapper(HlsMasterPlaylist hlsmasterplaylist, long l)
	{
		Object obj;
label0:
		{
			Object obj1;
label1:
			{
				Format aformat[] = ((Format []) (new ArrayList(((java.util.Collection) (hlsmasterplaylist.variants)))));
	//    0    0:new             #100 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #106 <Field List HlsMasterPlaylist.variants>
	//    4    8:invokespecial   #109 <Method void ArrayList(java.util.Collection)>
	//    5   11:astore          6
				obj = ((Object) (new ArrayList()));
	//    6   13:new             #100 <Class ArrayList>
	//    7   16:dup             
	//    8   17:invokespecial   #110 <Method void ArrayList()>
	//    9   20:astore          7
				ArrayList arraylist = new ArrayList();
	//   10   22:new             #100 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #110 <Method void ArrayList()>
	//   13   29:astore          8
				for(int i = 0; i < ((List) (aformat)).size(); i++)
	//*  14   31:iconst_0        
	//*  15   32:istore          4
	//*  16   34:iload           4
	//*  17   36:aload           6
	//*  18   38:invokeinterface #116 <Method int List.size()>
	//*  19   43:icmpge          130
				{
					com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl = (com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl)((List) (aformat)).get(i);
	//   20   46:aload           6
	//   21   48:iload           4
	//   22   50:invokeinterface #120 <Method Object List.get(int)>
	//   23   55:checkcast       #122 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl>
	//   24   58:astore          9
					Format format = hlsurl.format;
	//   25   60:aload           9
	//   26   62:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   27   65:astore          10
					if(format.height <= 0 && Util.getCodecsOfType(format.codecs, 2) == null)
	//*  28   67:aload           10
	//*  29   69:getfield        #131 <Field int Format.height>
	//*  30   72:ifgt            113
	//*  31   75:aload           10
	//*  32   77:getfield        #135 <Field String Format.codecs>
	//*  33   80:iconst_2        
	//*  34   81:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//*  35   84:ifnull          90
	//*  36   87:goto            113
					{
						if(Util.getCodecsOfType(format.codecs, 1) != null)
	//*  37   90:aload           10
	//*  38   92:getfield        #135 <Field String Format.codecs>
	//*  39   95:iconst_1        
	//*  40   96:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//*  41   99:ifnull          121
							arraylist.add(((Object) (hlsurl)));
	//   42  102:aload           8
	//   43  104:aload           9
	//   44  106:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   45  109:pop             
					} else
	//*  46  110:goto            121
					{
						((ArrayList) (obj)).add(((Object) (hlsurl)));
	//   47  113:aload           7
	//   48  115:aload           9
	//   49  117:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   50  120:pop             
					}
				}

	//   51  121:iload           4
	//   52  123:iconst_1        
	//   53  124:iadd            
	//   54  125:istore          4
	//*  55  127:goto            34
				if(!((ArrayList) (obj)).isEmpty())
	//*  56  130:aload           7
	//*  57  132:invokevirtual   #149 <Method boolean ArrayList.isEmpty()>
	//*  58  135:ifne            145
					aformat = ((Format []) (obj));
	//   59  138:aload           7
	//   60  140:astore          6
				else
	//*  61  142:goto            170
				if(arraylist.size() < ((List) (aformat)).size())
	//*  62  145:aload           8
	//*  63  147:invokevirtual   #150 <Method int ArrayList.size()>
	//*  64  150:aload           6
	//*  65  152:invokeinterface #116 <Method int List.size()>
	//*  66  157:icmpge          170
					((List) (aformat)).removeAll(((java.util.Collection) (arraylist)));
	//   67  160:aload           6
	//   68  162:aload           8
	//   69  164:invokeinterface #154 <Method boolean List.removeAll(java.util.Collection)>
	//   70  169:pop             
				Assertions.checkArgument(((List) (aformat)).isEmpty() ^ true);
	//   71  170:aload           6
	//   72  172:invokeinterface #155 <Method boolean List.isEmpty()>
	//   73  177:iconst_1        
	//   74  178:ixor            
	//   75  179:invokestatic    #161 <Method void Assertions.checkArgument(boolean)>
				com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl ahlsurl[] = (com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[])((List) (aformat)).toArray(((Object []) (new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[0])));
	//   76  182:aload           6
	//   77  184:iconst_0        
	//   78  185:anewarray       com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[]
	//   79  188:invokeinterface #165 <Method Object[] List.toArray(Object[])>
	//   80  193:checkcast       #167 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[]>
	//   81  196:astore          9
				obj1 = ((Object) (ahlsurl[0].format.codecs));
	//   82  198:aload           9
	//   83  200:iconst_0        
	//   84  201:aaload          
	//   85  202:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   86  205:getfield        #135 <Field String Format.codecs>
	//   87  208:astore          10
				obj = ((Object) (buildSampleStreamWrapper(0, ahlsurl, hlsmasterplaylist.muxedAudioFormat, hlsmasterplaylist.muxedCaptionFormats, l)));
	//   88  210:aload_0         
	//   89  211:iconst_0        
	//   90  212:aload           9
	//   91  214:aload_1         
	//   92  215:getfield        #170 <Field Format HlsMasterPlaylist.muxedAudioFormat>
	//   93  218:aload_1         
	//   94  219:getfield        #173 <Field List HlsMasterPlaylist.muxedCaptionFormats>
	//   95  222:lload_2         
	//   96  223:invokespecial   #177 <Method HlsSampleStreamWrapper buildSampleStreamWrapper(int, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[], Format, List, long)>
	//   97  226:astore          7
				sampleStreamWrappers[0] = ((HlsSampleStreamWrapper) (obj));
	//   98  228:aload_0         
	//   99  229:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//  100  232:iconst_0        
	//  101  233:aload           7
	//  102  235:aastore         
				if(!allowChunklessPreparation || obj1 == null)
					break label0;
	//  103  236:aload_0         
	//  104  237:getfield        #64  <Field boolean allowChunklessPreparation>
	//  105  240:ifeq            683
	//  106  243:aload           10
	//  107  245:ifnull          683
				boolean flag;
				if(Util.getCodecsOfType(((String) (obj1)), 2) != null)
	//* 108  248:aload           10
	//* 109  250:iconst_2        
	//* 110  251:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//* 111  254:ifnull          263
					flag = true;
	//  112  257:iconst_1        
	//  113  258:istore          5
				else
	//* 114  260:goto            266
					flag = false;
	//  115  263:iconst_0        
	//  116  264:istore          5
				int j;
				if(Util.getCodecsOfType(((String) (obj1)), 1) != null)
	//* 117  266:aload           10
	//* 118  268:iconst_1        
	//* 119  269:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//* 120  272:ifnull          281
					j = 1;
	//  121  275:iconst_1        
	//  122  276:istore          4
				else
	//* 123  278:goto            284
					j = 0;
	//  124  281:iconst_0        
	//  125  282:istore          4
				arraylist = new ArrayList();
	//  126  284:new             #100 <Class ArrayList>
	//  127  287:dup             
	//  128  288:invokespecial   #110 <Method void ArrayList()>
	//  129  291:astore          8
				if(flag)
	//* 130  293:iload           5
	//* 131  295:ifeq            489
				{
					aformat = new Format[((List) (aformat)).size()];
	//  132  298:aload           6
	//  133  300:invokeinterface #116 <Method int List.size()>
	//  134  305:anewarray       Format[]
	//  135  308:astore          6
					for(int i1 = 0; i1 < aformat.length; i1++)
	//* 136  310:iconst_0        
	//* 137  311:istore          5
	//* 138  313:iload           5
	//* 139  315:aload           6
	//* 140  317:arraylength     
	//* 141  318:icmpge          346
						aformat[i1] = ((/*<invalid signature>*/java.lang.Object) (deriveVideoFormat(ahlsurl[i1].format)));
	//  142  321:aload           6
	//  143  323:iload           5
	//  144  325:aload           9
	//  145  327:iload           5
	//  146  329:aaload          
	//  147  330:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//  148  333:invokestatic    #181 <Method Format deriveVideoFormat(Format)>
	//  149  336:aastore         

	//  150  337:iload           5
	//  151  339:iconst_1        
	//  152  340:iadd            
	//  153  341:istore          5
	//* 154  343:goto            313
					((List) (arraylist)).add(((Object) (new TrackGroup(aformat))));
	//  155  346:aload           8
	//  156  348:new             #183 <Class TrackGroup>
	//  157  351:dup             
	//  158  352:aload           6
	//  159  354:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  160  357:invokeinterface #187 <Method boolean List.add(Object)>
	//  161  362:pop             
					if(j != 0 && (hlsmasterplaylist.muxedAudioFormat != null || hlsmasterplaylist.audios.isEmpty()))
	//* 162  363:iload           4
	//* 163  365:ifeq            424
	//* 164  368:aload_1         
	//* 165  369:getfield        #170 <Field Format HlsMasterPlaylist.muxedAudioFormat>
	//* 166  372:ifnonnull       387
	//* 167  375:aload_1         
	//* 168  376:getfield        #190 <Field List HlsMasterPlaylist.audios>
	//* 169  379:invokeinterface #155 <Method boolean List.isEmpty()>
	//* 170  384:ifeq            424
						((List) (arraylist)).add(((Object) (new TrackGroup(new Format[] {
							deriveMuxedAudioFormat(ahlsurl[0].format, hlsmasterplaylist.muxedAudioFormat, -1)
						}))));
	//  171  387:aload           8
	//  172  389:new             #183 <Class TrackGroup>
	//  173  392:dup             
	//  174  393:iconst_1        
	//  175  394:anewarray       Format[]
	//  176  397:dup             
	//  177  398:iconst_0        
	//  178  399:aload           9
	//  179  401:iconst_0        
	//  180  402:aaload          
	//  181  403:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//  182  406:aload_1         
	//  183  407:getfield        #170 <Field Format HlsMasterPlaylist.muxedAudioFormat>
	//  184  410:iconst_m1       
	//  185  411:invokestatic    #194 <Method Format deriveMuxedAudioFormat(Format, Format, int)>
	//  186  414:aastore         
	//  187  415:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  188  418:invokeinterface #187 <Method boolean List.add(Object)>
	//  189  423:pop             
					hlsmasterplaylist = ((HlsMasterPlaylist) (hlsmasterplaylist.muxedCaptionFormats));
	//  190  424:aload_1         
	//  191  425:getfield        #173 <Field List HlsMasterPlaylist.muxedCaptionFormats>
	//  192  428:astore_1        
					if(hlsmasterplaylist != null)
	//* 193  429:aload_1         
	//* 194  430:ifnull          572
						for(j = 0; j < ((List) (hlsmasterplaylist)).size(); j++)
	//* 195  433:iconst_0        
	//* 196  434:istore          4
	//* 197  436:iload           4
	//* 198  438:aload_1         
	//* 199  439:invokeinterface #116 <Method int List.size()>
	//* 200  444:icmpge          572
							((List) (arraylist)).add(((Object) (new TrackGroup(new Format[] {
								(Format)((List) (hlsmasterplaylist)).get(j)
							}))));
	//  201  447:aload           8
	//  202  449:new             #183 <Class TrackGroup>
	//  203  452:dup             
	//  204  453:iconst_1        
	//  205  454:anewarray       Format[]
	//  206  457:dup             
	//  207  458:iconst_0        
	//  208  459:aload_1         
	//  209  460:iload           4
	//  210  462:invokeinterface #120 <Method Object List.get(int)>
	//  211  467:checkcast       #128 <Class Format>
	//  212  470:aastore         
	//  213  471:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  214  474:invokeinterface #187 <Method boolean List.add(Object)>
	//  215  479:pop             

	//  216  480:iload           4
	//  217  482:iconst_1        
	//  218  483:iadd            
	//  219  484:istore          4
				} else
	//* 220  486:goto            436
				{
					if(j == 0)
						break label1;
	//  221  489:iload           4
	//  222  491:ifeq            649
					aformat = new Format[((List) (aformat)).size()];
	//  223  494:aload           6
	//  224  496:invokeinterface #116 <Method int List.size()>
	//  225  501:anewarray       Format[]
	//  226  504:astore          6
					for(int k = 0; k < aformat.length; k++)
	//* 227  506:iconst_0        
	//* 228  507:istore          4
	//* 229  509:iload           4
	//* 230  511:aload           6
	//* 231  513:arraylength     
	//* 232  514:icmpge          555
					{
						obj1 = ((Object) (ahlsurl[k].format));
	//  233  517:aload           9
	//  234  519:iload           4
	//  235  521:aaload          
	//  236  522:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//  237  525:astore          10
						aformat[k] = deriveMuxedAudioFormat(((Format) (obj1)), hlsmasterplaylist.muxedAudioFormat, ((Format) (obj1)).bitrate);
	//  238  527:aload           6
	//  239  529:iload           4
	//  240  531:aload           10
	//  241  533:aload_1         
	//  242  534:getfield        #170 <Field Format HlsMasterPlaylist.muxedAudioFormat>
	//  243  537:aload           10
	//  244  539:getfield        #197 <Field int Format.bitrate>
	//  245  542:invokestatic    #194 <Method Format deriveMuxedAudioFormat(Format, Format, int)>
	//  246  545:aastore         
					}

	//  247  546:iload           4
	//  248  548:iconst_1        
	//  249  549:iadd            
	//  250  550:istore          4
	//* 251  552:goto            509
					((List) (arraylist)).add(((Object) (new TrackGroup(aformat))));
	//  252  555:aload           8
	//  253  557:new             #183 <Class TrackGroup>
	//  254  560:dup             
	//  255  561:aload           6
	//  256  563:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  257  566:invokeinterface #187 <Method boolean List.add(Object)>
	//  258  571:pop             
				}
				hlsmasterplaylist = ((HlsMasterPlaylist) (new TrackGroup(new Format[] {
					Format.createSampleFormat("ID3", "application/id3", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null)))
				})));
	//  259  572:new             #183 <Class TrackGroup>
	//  260  575:dup             
	//  261  576:iconst_1        
	//  262  577:anewarray       Format[]
	//  263  580:dup             
	//  264  581:iconst_0        
	//  265  582:ldc1            #199 <String "ID3">
	//  266  584:ldc1            #201 <String "application/id3">
	//  267  586:aconst_null     
	//  268  587:iconst_m1       
	//  269  588:aconst_null     
	//  270  589:invokestatic    #205 <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//  271  592:aastore         
	//  272  593:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  273  596:astore_1        
				((List) (arraylist)).add(((Object) (hlsmasterplaylist)));
	//  274  597:aload           8
	//  275  599:aload_1         
	//  276  600:invokeinterface #187 <Method boolean List.add(Object)>
	//  277  605:pop             
				((HlsSampleStreamWrapper) (obj)).prepareWithMasterPlaylistInfo(new TrackGroupArray((TrackGroup[])((List) (arraylist)).toArray(((Object []) (new TrackGroup[0])))), 0, new TrackGroupArray(new TrackGroup[] {
					hlsmasterplaylist
				}));
	//  278  606:aload           7
	//  279  608:new             #207 <Class TrackGroupArray>
	//  280  611:dup             
	//  281  612:aload           8
	//  282  614:iconst_0        
	//  283  615:anewarray       TrackGroup[]
	//  284  618:invokeinterface #165 <Method Object[] List.toArray(Object[])>
	//  285  623:checkcast       #209 <Class TrackGroup[]>
	//  286  626:invokespecial   #212 <Method void TrackGroupArray(TrackGroup[])>
	//  287  629:iconst_0        
	//  288  630:new             #207 <Class TrackGroupArray>
	//  289  633:dup             
	//  290  634:iconst_1        
	//  291  635:anewarray       TrackGroup[]
	//  292  638:dup             
	//  293  639:iconst_0        
	//  294  640:aload_1         
	//  295  641:aastore         
	//  296  642:invokespecial   #212 <Method void TrackGroupArray(TrackGroup[])>
	//  297  645:invokevirtual   #216 <Method void HlsSampleStreamWrapper.prepareWithMasterPlaylistInfo(TrackGroupArray, int, TrackGroupArray)>
				return;
	//  298  648:return          
			}
			hlsmasterplaylist = ((HlsMasterPlaylist) (new StringBuilder()));
	//  299  649:new             #218 <Class StringBuilder>
	//  300  652:dup             
	//  301  653:invokespecial   #219 <Method void StringBuilder()>
	//  302  656:astore_1        
			((StringBuilder) (hlsmasterplaylist)).append("Unexpected codecs attribute: ");
	//  303  657:aload_1         
	//  304  658:ldc1            #221 <String "Unexpected codecs attribute: ">
	//  305  660:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  306  663:pop             
			((StringBuilder) (hlsmasterplaylist)).append(((String) (obj1)));
	//  307  664:aload_1         
	//  308  665:aload           10
	//  309  667:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  310  670:pop             
			throw new IllegalArgumentException(((StringBuilder) (hlsmasterplaylist)).toString());
	//  311  671:new             #227 <Class IllegalArgumentException>
	//  312  674:dup             
	//  313  675:aload_1         
	//  314  676:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  315  679:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//  316  682:athrow          
		}
		((HlsSampleStreamWrapper) (obj)).setIsTimestampMaster(true);
	//  317  683:aload           7
	//  318  685:iconst_1        
	//  319  686:invokevirtual   #237 <Method void HlsSampleStreamWrapper.setIsTimestampMaster(boolean)>
		((HlsSampleStreamWrapper) (obj)).continuePreparing();
	//  320  689:aload           7
	//  321  691:invokevirtual   #240 <Method void HlsSampleStreamWrapper.continuePreparing()>
	//  322  694:return          
	}

	private void buildAndPrepareSampleStreamWrappers(long l)
	{
		HlsMasterPlaylist hlsmasterplaylist = playlistTracker.getMasterPlaylist();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HlsPlaylistTracker playlistTracker>
	//    2    4:invokeinterface #248 <Method HlsMasterPlaylist HlsPlaylistTracker.getMasterPlaylist()>
	//    3    9:astore          7
		List list1 = hlsmasterplaylist.audios;
	//    4   11:aload           7
	//    5   13:getfield        #190 <Field List HlsMasterPlaylist.audios>
	//    6   16:astore          6
		List list = hlsmasterplaylist.subtitles;
	//    7   18:aload           7
	//    8   20:getfield        #251 <Field List HlsMasterPlaylist.subtitles>
	//    9   23:astore          5
		int i = list1.size() + 1 + list.size();
	//   10   25:aload           6
	//   11   27:invokeinterface #116 <Method int List.size()>
	//   12   32:iconst_1        
	//   13   33:iadd            
	//   14   34:aload           5
	//   15   36:invokeinterface #116 <Method int List.size()>
	//   16   41:iadd            
	//   17   42:istore_3        
		sampleStreamWrappers = new HlsSampleStreamWrapper[i];
	//   18   43:aload_0         
	//   19   44:iload_3         
	//   20   45:anewarray       HlsSampleStreamWrapper[]
	//   21   48:putfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
		pendingPrepareCount = i;
	//   22   51:aload_0         
	//   23   52:iload_3         
	//   24   53:putfield        #253 <Field int pendingPrepareCount>
		buildAndPrepareMainSampleStreamWrapper(hlsmasterplaylist, l);
	//   25   56:aload_0         
	//   26   57:aload           7
	//   27   59:lload_1         
	//   28   60:invokespecial   #255 <Method void buildAndPrepareMainSampleStreamWrapper(HlsMasterPlaylist, long)>
		i = 1;
	//   29   63:iconst_1        
	//   30   64:istore_3        
		for(int j = 0; j < list1.size();)
	//*  31   65:iconst_0        
	//*  32   66:istore          4
	//*  33   68:iload           4
	//*  34   70:aload           6
	//*  35   72:invokeinterface #116 <Method int List.size()>
	//*  36   77:icmpge          212
		{
			com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl)list1.get(j);
	//   37   80:aload           6
	//   38   82:iload           4
	//   39   84:invokeinterface #120 <Method Object List.get(int)>
	//   40   89:checkcast       #122 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl>
	//   41   92:astore          7
			Object obj1 = ((Object) (Collections.emptyList()));
	//   42   94:invokestatic    #261 <Method List Collections.emptyList()>
	//   43   97:astore          8
			obj1 = ((Object) (buildSampleStreamWrapper(1, new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[] {
				hlsurl1
			}, ((Format) (null)), ((List) (obj1)), l)));
	//   44   99:aload_0         
	//   45  100:iconst_1        
	//   46  101:iconst_1        
	//   47  102:anewarray       com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[]
	//   48  105:dup             
	//   49  106:iconst_0        
	//   50  107:aload           7
	//   51  109:aastore         
	//   52  110:aconst_null     
	//   53  111:aload           8
	//   54  113:lload_1         
	//   55  114:invokespecial   #177 <Method HlsSampleStreamWrapper buildSampleStreamWrapper(int, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[], Format, List, long)>
	//   56  117:astore          8
			sampleStreamWrappers[i] = ((HlsSampleStreamWrapper) (obj1));
	//   57  119:aload_0         
	//   58  120:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//   59  123:iload_3         
	//   60  124:aload           8
	//   61  126:aastore         
			Format format = hlsurl1.format;
	//   62  127:aload           7
	//   63  129:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   64  132:astore          9
			if(allowChunklessPreparation && format.codecs != null)
	//*  65  134:aload_0         
	//*  66  135:getfield        #64  <Field boolean allowChunklessPreparation>
	//*  67  138:ifeq            194
	//*  68  141:aload           9
	//*  69  143:getfield        #135 <Field String Format.codecs>
	//*  70  146:ifnull          194
				((HlsSampleStreamWrapper) (obj1)).prepareWithMasterPlaylistInfo(new TrackGroupArray(new TrackGroup[] {
					new TrackGroup(new Format[] {
						hlsurl1.format
					})
				}), 0, TrackGroupArray.EMPTY);
	//   71  149:aload           8
	//   72  151:new             #207 <Class TrackGroupArray>
	//   73  154:dup             
	//   74  155:iconst_1        
	//   75  156:anewarray       TrackGroup[]
	//   76  159:dup             
	//   77  160:iconst_0        
	//   78  161:new             #183 <Class TrackGroup>
	//   79  164:dup             
	//   80  165:iconst_1        
	//   81  166:anewarray       Format[]
	//   82  169:dup             
	//   83  170:iconst_0        
	//   84  171:aload           7
	//   85  173:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   86  176:aastore         
	//   87  177:invokespecial   #186 <Method void TrackGroup(Format[])>
	//   88  180:aastore         
	//   89  181:invokespecial   #212 <Method void TrackGroupArray(TrackGroup[])>
	//   90  184:iconst_0        
	//   91  185:getstatic       #264 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//   92  188:invokevirtual   #216 <Method void HlsSampleStreamWrapper.prepareWithMasterPlaylistInfo(TrackGroupArray, int, TrackGroupArray)>
			else
	//*  93  191:goto            199
				((HlsSampleStreamWrapper) (obj1)).continuePreparing();
	//   94  194:aload           8
	//   95  196:invokevirtual   #240 <Method void HlsSampleStreamWrapper.continuePreparing()>
			j++;
	//   96  199:iload           4
	//   97  201:iconst_1        
	//   98  202:iadd            
	//   99  203:istore          4
			i++;
	//  100  205:iload_3         
	//  101  206:iconst_1        
	//  102  207:iadd            
	//  103  208:istore_3        
		}

	//* 104  209:goto            68
		for(int k = 0; k < list.size();)
	//* 105  212:iconst_0        
	//* 106  213:istore          4
	//* 107  215:iload           4
	//* 108  217:aload           5
	//* 109  219:invokeinterface #116 <Method int List.size()>
	//* 110  224:icmpge          329
		{
			com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl = (com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl)list.get(k);
	//  111  227:aload           5
	//  112  229:iload           4
	//  113  231:invokeinterface #120 <Method Object List.get(int)>
	//  114  236:checkcast       #122 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl>
	//  115  239:astore          6
			Object obj = ((Object) (Collections.emptyList()));
	//  116  241:invokestatic    #261 <Method List Collections.emptyList()>
	//  117  244:astore          7
			obj = ((Object) (buildSampleStreamWrapper(3, new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[] {
				hlsurl
			}, ((Format) (null)), ((List) (obj)), l)));
	//  118  246:aload_0         
	//  119  247:iconst_3        
	//  120  248:iconst_1        
	//  121  249:anewarray       com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl[]
	//  122  252:dup             
	//  123  253:iconst_0        
	//  124  254:aload           6
	//  125  256:aastore         
	//  126  257:aconst_null     
	//  127  258:aload           7
	//  128  260:lload_1         
	//  129  261:invokespecial   #177 <Method HlsSampleStreamWrapper buildSampleStreamWrapper(int, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[], Format, List, long)>
	//  130  264:astore          7
			sampleStreamWrappers[i] = ((HlsSampleStreamWrapper) (obj));
	//  131  266:aload_0         
	//  132  267:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//  133  270:iload_3         
	//  134  271:aload           7
	//  135  273:aastore         
			((HlsSampleStreamWrapper) (obj)).prepareWithMasterPlaylistInfo(new TrackGroupArray(new TrackGroup[] {
				new TrackGroup(new Format[] {
					hlsurl.format
				})
			}), 0, TrackGroupArray.EMPTY);
	//  136  274:aload           7
	//  137  276:new             #207 <Class TrackGroupArray>
	//  138  279:dup             
	//  139  280:iconst_1        
	//  140  281:anewarray       TrackGroup[]
	//  141  284:dup             
	//  142  285:iconst_0        
	//  143  286:new             #183 <Class TrackGroup>
	//  144  289:dup             
	//  145  290:iconst_1        
	//  146  291:anewarray       Format[]
	//  147  294:dup             
	//  148  295:iconst_0        
	//  149  296:aload           6
	//  150  298:getfield        #126 <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//  151  301:aastore         
	//  152  302:invokespecial   #186 <Method void TrackGroup(Format[])>
	//  153  305:aastore         
	//  154  306:invokespecial   #212 <Method void TrackGroupArray(TrackGroup[])>
	//  155  309:iconst_0        
	//  156  310:getstatic       #264 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//  157  313:invokevirtual   #216 <Method void HlsSampleStreamWrapper.prepareWithMasterPlaylistInfo(TrackGroupArray, int, TrackGroupArray)>
			k++;
	//  158  316:iload           4
	//  159  318:iconst_1        
	//  160  319:iadd            
	//  161  320:istore          4
			i++;
	//  162  322:iload_3         
	//  163  323:iconst_1        
	//  164  324:iadd            
	//  165  325:istore_3        
		}

	//* 166  326:goto            215
		enabledSampleStreamWrappers = sampleStreamWrappers;
	//  167  329:aload_0         
	//  168  330:aload_0         
	//  169  331:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//  170  334:putfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//  171  337:return          
	}

	private HlsSampleStreamWrapper buildSampleStreamWrapper(int i, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl ahlsurl[], Format format, List list, long l)
	{
		return new HlsSampleStreamWrapper(i, ((HlsSampleStreamWrapper.Callback) (this)), new HlsChunkSource(extractorFactory, playlistTracker, ahlsurl, dataSourceFactory, timestampAdjusterProvider, list), allocator, l, format, minLoadableRetryCount, eventDispatcher);
	//    0    0:new             #86  <Class HlsSampleStreamWrapper>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:new             #266 <Class HlsChunkSource>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:getfield        #50  <Field HlsExtractorFactory extractorFactory>
	//    8   14:aload_0         
	//    9   15:getfield        #52  <Field HlsPlaylistTracker playlistTracker>
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field HlsDataSourceFactory dataSourceFactory>
	//   13   23:aload_0         
	//   14   24:getfield        #84  <Field TimestampAdjusterProvider timestampAdjusterProvider>
	//   15   27:aload           4
	//   16   29:invokespecial   #269 <Method void HlsChunkSource(HlsExtractorFactory, HlsPlaylistTracker, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[], HlsDataSourceFactory, TimestampAdjusterProvider, List)>
	//   17   32:aload_0         
	//   18   33:getfield        #60  <Field Allocator allocator>
	//   19   36:lload           5
	//   20   38:aload_3         
	//   21   39:aload_0         
	//   22   40:getfield        #56  <Field int minLoadableRetryCount>
	//   23   43:aload_0         
	//   24   44:getfield        #58  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   25   47:invokespecial   #272 <Method void HlsSampleStreamWrapper(int, HlsSampleStreamWrapper$Callback, HlsChunkSource, Allocator, long, Format, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher)>
	//   26   50:areturn         
	}

	private static Format deriveMuxedAudioFormat(Format format, Format format1, int i)
	{
		int j;
		int k;
		String s;
		if(format1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			s = format1.codecs;
	//    2    4:aload_1         
	//    3    5:getfield        #135 <Field String Format.codecs>
	//    4    8:astore          5
			j = format1.channelCount;
	//    5   10:aload_1         
	//    6   11:getfield        #277 <Field int Format.channelCount>
	//    7   14:istore_3        
			k = format1.selectionFlags;
	//    8   15:aload_1         
	//    9   16:getfield        #280 <Field int Format.selectionFlags>
	//   10   19:istore          4
			format1 = ((Format) (format1.language));
	//   11   21:aload_1         
	//   12   22:getfield        #283 <Field String Format.language>
	//   13   25:astore_1        
		} else
	//*  14   26:goto            49
		{
			s = Util.getCodecsOfType(format.codecs, 1);
	//   15   29:aload_0         
	//   16   30:getfield        #135 <Field String Format.codecs>
	//   17   33:iconst_1        
	//   18   34:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//   19   37:astore          5
			j = -1;
	//   20   39:iconst_m1       
	//   21   40:istore_3        
			k = 0;
	//   22   41:iconst_0        
	//   23   42:istore          4
			format1 = null;
	//   24   44:aconst_null     
	//   25   45:astore_1        
		}
	//*  26   46:goto            26
		String s1 = MimeTypes.getMediaMimeType(s);
	//   27   49:aload           5
	//   28   51:invokestatic    #289 <Method String MimeTypes.getMediaMimeType(String)>
	//   29   54:astore          6
		return Format.createAudioSampleFormat(format.id, s1, s, i, -1, j, -1, ((List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), k, ((String) (format1)));
	//   30   56:aload_0         
	//   31   57:getfield        #292 <Field String Format.id>
	//   32   60:aload           6
	//   33   62:aload           5
	//   34   64:iload_2         
	//   35   65:iconst_m1       
	//   36   66:iload_3         
	//   37   67:iconst_m1       
	//   38   68:aconst_null     
	//   39   69:aconst_null     
	//   40   70:iload           4
	//   41   72:aload_1         
	//   42   73:invokestatic    #296 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   43   76:areturn         
	}

	private static Format deriveVideoFormat(Format format)
	{
		String s = Util.getCodecsOfType(format.codecs, 2);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String Format.codecs>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #141 <Method String Util.getCodecsOfType(String, int)>
	//    4    8:astore_1        
		String s1 = MimeTypes.getMediaMimeType(s);
	//    5    9:aload_1         
	//    6   10:invokestatic    #289 <Method String MimeTypes.getMediaMimeType(String)>
	//    7   13:astore_2        
		return Format.createVideoSampleFormat(format.id, s1, s, format.bitrate, -1, format.width, format.height, format.frameRate, ((List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #292 <Field String Format.id>
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #197 <Field int Format.bitrate>
	//   14   24:iconst_m1       
	//   15   25:aload_0         
	//   16   26:getfield        #299 <Field int Format.width>
	//   17   29:aload_0         
	//   18   30:getfield        #131 <Field int Format.height>
	//   19   33:aload_0         
	//   20   34:getfield        #303 <Field float Format.frameRate>
	//   21   37:aconst_null     
	//   22   38:aconst_null     
	//   23   39:invokestatic    #307 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, List, com.google.android.exoplayer2.drm.DrmInitData)>
	//   24   42:areturn         
	}

	public boolean continueLoading(long l)
	{
		if(trackGroups == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #311 <Field TrackGroupArray trackGroups>
	//*   2    4:ifnonnull       42
		{
			HlsSampleStreamWrapper ahlssamplestreamwrapper[] = sampleStreamWrappers;
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//    5   11:astore          5
			int j = ahlssamplestreamwrapper.length;
	//    6   13:aload           5
	//    7   15:arraylength     
	//    8   16:istore          4
			for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          40
				ahlssamplestreamwrapper[i].continuePreparing();
	//   14   26:aload           5
	//   15   28:iload_3         
	//   16   29:aaload          
	//   17   30:invokevirtual   #240 <Method void HlsSampleStreamWrapper.continuePreparing()>

	//   18   33:iload_3         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:istore_3        
	//*  22   37:goto            20
			return false;
	//   23   40:iconst_0        
	//   24   41:ireturn         
		} else
		{
			return compositeSequenceableLoader.continueLoading(l);
	//   25   42:aload_0         
	//   26   43:getfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
	//   27   46:lload_1         
	//   28   47:invokeinterface #313 <Method boolean SequenceableLoader.continueLoading(long)>
	//   29   52:ireturn         
		}
	}

	public void discardBuffer(long l, boolean flag)
	{
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = enabledSampleStreamWrappers;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = ahlssamplestreamwrapper.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          40
			ahlssamplestreamwrapper[i].discardBuffer(l, flag);
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:lload_1         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #317 <Method void HlsSampleStreamWrapper.discardBuffer(long, boolean)>

	//   17   31:iload           4
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore          4
	//*  21   37:goto            14
	//   22   40:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return compositeSequenceableLoader.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #323 <Method long SequenceableLoader.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return compositeSequenceableLoader.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #326 <Method long SequenceableLoader.getNextLoadPositionUs()>
	//    3    9:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field TrackGroupArray trackGroups>
	//    2    4:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = sampleStreamWrappers;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int j = ahlssamplestreamwrapper.length; i < j; i++)
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:istore_2        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			ahlssamplestreamwrapper[i].maybeThrowPrepareError();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokevirtual   #333 <Method void HlsSampleStreamWrapper.maybeThrowPrepareError()>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
	//   20   28:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((HlsSampleStreamWrapper)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #86  <Class HlsSampleStreamWrapper>
	//    3    5:invokevirtual   #339 <Method void onContinueLoadingRequested(HlsSampleStreamWrapper)>
	//    4    8:return          
	}

	public void onContinueLoadingRequested(HlsSampleStreamWrapper hlssamplestreamwrapper)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #345 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public void onPlaylistChanged()
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #345 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public boolean onPlaylistError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl, boolean flag)
	{
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = sampleStreamWrappers;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//    2    4:astore          6
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		for(int j = ahlssamplestreamwrapper.length; i < j; i++)
	//*   7   11:aload           6
	//*   8   13:arraylength     
	//*   9   14:istore          4
	//*  10   16:iload_3         
	//*  11   17:iload           4
	//*  12   19:icmpge          43
			flag1 &= ahlssamplestreamwrapper[i].onPlaylistError(hlsurl, flag);
	//   13   22:iload           5
	//   14   24:aload           6
	//   15   26:iload_3         
	//   16   27:aaload          
	//   17   28:aload_1         
	//   18   29:iload_2         
	//   19   30:invokevirtual   #350 <Method boolean HlsSampleStreamWrapper.onPlaylistError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl, boolean)>
	//   20   33:iand            
	//   21   34:istore          5

	//   22   36:iload_3         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_3        
	//*  26   40:goto            16
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   27   43:aload_0         
	//   28   44:getfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//   29   47:aload_0         
	//   30   48:invokeinterface #345 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
		return flag1;
	//   31   53:iload           5
	//   32   55:ireturn         
	}

	public void onPlaylistRefreshRequired(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl)
	{
		playlistTracker.refreshPlaylist(hlsurl);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HlsPlaylistTracker playlistTracker>
	//    2    4:aload_1         
	//    3    5:invokeinterface #355 <Method void HlsPlaylistTracker.refreshPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
	//    4   10:return          
	}

	public void onPrepared()
	{
		int i = pendingPrepareCount - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field int pendingPrepareCount>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		pendingPrepareCount = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #253 <Field int pendingPrepareCount>
		if(i > 0)
	//*   8   12:iload_1         
	//*   9   13:ifle            17
			return;
	//   10   16:return          
		Object aobj[] = ((Object []) (sampleStreamWrappers));
	//   11   17:aload_0         
	//   12   18:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//   13   21:astore          6
		int k = aobj.length;
	//   14   23:aload           6
	//   15   25:arraylength     
	//   16   26:istore_3        
		i = 0;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		int j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		for(; i < k; i++)
	//*  21   31:iload_1         
	//*  22   32:iload_3         
	//*  23   33:icmpge          56
			j += aobj[i].getTrackGroups().length;
	//   24   36:iload_2         
	//   25   37:aload           6
	//   26   39:iload_1         
	//   27   40:aaload          
	//   28   41:invokevirtual   #358 <Method TrackGroupArray HlsSampleStreamWrapper.getTrackGroups()>
	//   29   44:getfield        #361 <Field int TrackGroupArray.length>
	//   30   47:iadd            
	//   31   48:istore_2        

	//   32   49:iload_1         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_1        
	//*  36   53:goto            31
		aobj = ((Object []) (new TrackGroup[j]));
	//   37   56:iload_2         
	//   38   57:anewarray       TrackGroup[]
	//   39   60:astore          6
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = sampleStreamWrappers;
	//   40   62:aload_0         
	//   41   63:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//   42   66:astore          7
		int i1 = ahlssamplestreamwrapper.length;
	//   43   68:aload           7
	//   44   70:arraylength     
	//   45   71:istore          4
		j = 0;
	//   46   73:iconst_0        
	//   47   74:istore_2        
		i = j;
	//   48   75:iload_2         
	//   49   76:istore_1        
		for(; j < i1; j++)
	//*  50   77:iload_2         
	//*  51   78:iload           4
	//*  52   80:icmpge          138
		{
			HlsSampleStreamWrapper hlssamplestreamwrapper = ahlssamplestreamwrapper[j];
	//   53   83:aload           7
	//   54   85:iload_2         
	//   55   86:aaload          
	//   56   87:astore          8
			int j1 = hlssamplestreamwrapper.getTrackGroups().length;
	//   57   89:aload           8
	//   58   91:invokevirtual   #358 <Method TrackGroupArray HlsSampleStreamWrapper.getTrackGroups()>
	//   59   94:getfield        #361 <Field int TrackGroupArray.length>
	//   60   97:istore          5
			for(int l = 0; l < j1;)
	//*  61   99:iconst_0        
	//*  62  100:istore_3        
	//*  63  101:iload_3         
	//*  64  102:iload           5
	//*  65  104:icmpge          131
			{
				aobj[i] = hlssamplestreamwrapper.getTrackGroups().get(l);
	//   66  107:aload           6
	//   67  109:iload_1         
	//   68  110:aload           8
	//   69  112:invokevirtual   #358 <Method TrackGroupArray HlsSampleStreamWrapper.getTrackGroups()>
	//   70  115:iload_3         
	//   71  116:invokevirtual   #364 <Method TrackGroup TrackGroupArray.get(int)>
	//   72  119:aastore         
				l++;
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:istore_3        
				i++;
	//   77  124:iload_1         
	//   78  125:iconst_1        
	//   79  126:iadd            
	//   80  127:istore_1        
			}

		}

	//   81  128:goto            101
	//   82  131:iload_2         
	//   83  132:iconst_1        
	//   84  133:iadd            
	//   85  134:istore_2        
	//*  86  135:goto            77
		trackGroups = new TrackGroupArray(((TrackGroup []) (aobj)));
	//   87  138:aload_0         
	//   88  139:new             #207 <Class TrackGroupArray>
	//   89  142:dup             
	//   90  143:aload           6
	//   91  145:invokespecial   #212 <Method void TrackGroupArray(TrackGroup[])>
	//   92  148:putfield        #311 <Field TrackGroupArray trackGroups>
		callback.onPrepared(((MediaPeriod) (this)));
	//   93  151:aload_0         
	//   94  152:getfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//   95  155:aload_0         
	//   96  156:invokeinterface #367 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//   97  161:return          
	}

	public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		playlistTracker.addListener(((com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field HlsPlaylistTracker playlistTracker>
	//    5    9:aload_0         
	//    6   10:invokeinterface #373 <Method void HlsPlaylistTracker.addListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener)>
		buildAndPrepareSampleStreamWrappers(l);
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:invokespecial   #375 <Method void buildAndPrepareSampleStreamWrappers(long)>
	//   10   20:return          
	}

	public long readDiscontinuity()
	{
		if(!notifiedReadingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #378 <Field boolean notifiedReadingStarted>
	//*   2    4:ifne            19
		{
			eventDispatcher.readingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #381 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.readingStarted()>
			notifiedReadingStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #378 <Field boolean notifiedReadingStarted>
		}
		return 0x1L;
	//    9   19:ldc2w           #382 <Long 0x1L>
	//   10   22:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		compositeSequenceableLoader.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #386 <Method void SequenceableLoader.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public void release()
	{
		playlistTracker.removeListener(((com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HlsPlaylistTracker playlistTracker>
	//    2    4:aload_0         
	//    3    5:invokeinterface #390 <Method void HlsPlaylistTracker.removeListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener)>
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = sampleStreamWrappers;
	//    4   10:aload_0         
	//    5   11:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//    6   14:astore_3        
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		for(int j = ahlssamplestreamwrapper.length; i < j; i++)
	//*   9   17:aload_3         
	//*  10   18:arraylength     
	//*  11   19:istore_2        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          38
			ahlssamplestreamwrapper[i].release();
	//   15   25:aload_3         
	//   16   26:iload_1         
	//   17   27:aaload          
	//   18   28:invokevirtual   #392 <Method void HlsSampleStreamWrapper.release()>

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            20
		callback = null;
	//   24   38:aload_0         
	//   25   39:aconst_null     
	//   26   40:putfield        #341 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		eventDispatcher.mediaPeriodReleased();
	//   27   43:aload_0         
	//   28   44:getfield        #58  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   29   47:invokevirtual   #395 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//   30   50:return          
	}

	public long seekToUs(long l)
	{
		if(enabledSampleStreamWrappers.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//*   2    4:arraylength     
	//*   3    5:ifle            64
		{
			boolean flag = enabledSampleStreamWrappers[0].seekToUs(l, false);
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//    6   12:iconst_0        
	//    7   13:aaload          
	//    8   14:lload_1         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #400 <Method boolean HlsSampleStreamWrapper.seekToUs(long, boolean)>
	//   11   19:istore          4
			for(int i = 1; i < enabledSampleStreamWrappers.length; i++)
	//*  12   21:iconst_1        
	//*  13   22:istore_3        
	//*  14   23:iload_3         
	//*  15   24:aload_0         
	//*  16   25:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//*  17   28:arraylength     
	//*  18   29:icmpge          52
				enabledSampleStreamWrappers[i].seekToUs(l, flag);
	//   19   32:aload_0         
	//   20   33:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//   21   36:iload_3         
	//   22   37:aaload          
	//   23   38:lload_1         
	//   24   39:iload           4
	//   25   41:invokevirtual   #400 <Method boolean HlsSampleStreamWrapper.seekToUs(long, boolean)>
	//   26   44:pop             

	//   27   45:iload_3         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_3        
	//*  31   49:goto            23
			if(flag)
	//*  32   52:iload           4
	//*  33   54:ifeq            64
				timestampAdjusterProvider.reset();
	//   34   57:aload_0         
	//   35   58:getfield        #84  <Field TimestampAdjusterProvider timestampAdjusterProvider>
	//   36   61:invokevirtual   #403 <Method void TimestampAdjusterProvider.reset()>
		}
		return l;
	//   37   64:lload_1         
	//   38   65:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		Object aobj[] = ((Object []) (asamplestream));
	//    0    0:aload_3         
	//    1    1:astore          15
		int ai[] = new int[atrackselection.length];
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:newarray        int[]
	//    5    7:astore          19
		int ai1[] = new int[atrackselection.length];
	//    6    9:aload_1         
	//    7   10:arraylength     
	//    8   11:newarray        int[]
	//    9   13:astore          20
label0:
		for(int i = 0; i < atrackselection.length; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore          7
	//*  12   18:iload           7
	//*  13   20:aload_1         
	//*  14   21:arraylength     
	//*  15   22:icmpge          150
		{
			int k;
			if(aobj[i] == null)
	//*  16   25:aload           15
	//*  17   27:iload           7
	//*  18   29:aaload          
	//*  19   30:ifnonnull       39
				k = -1;
	//   20   33:iconst_m1       
	//   21   34:istore          8
			else
	//*  22   36:goto            59
				k = ((Integer)streamWrapperIndices.get(((Object) (aobj[i])))).intValue();
	//   23   39:aload_0         
	//   24   40:getfield        #79  <Field IdentityHashMap streamWrapperIndices>
	//   25   43:aload           15
	//   26   45:iload           7
	//   27   47:aaload          
	//   28   48:invokevirtual   #408 <Method Object IdentityHashMap.get(Object)>
	//   29   51:checkcast       #410 <Class Integer>
	//   30   54:invokevirtual   #413 <Method int Integer.intValue()>
	//   31   57:istore          8
			ai[i] = k;
	//   32   59:aload           19
	//   33   61:iload           7
	//   34   63:iload           8
	//   35   65:iastore         
			ai1[i] = -1;
	//   36   66:aload           20
	//   37   68:iload           7
	//   38   70:iconst_m1       
	//   39   71:iastore         
			if(atrackselection[i] == null)
				continue;
	//   40   72:aload_1         
	//   41   73:iload           7
	//   42   75:aaload          
	//   43   76:ifnull          141
			TrackGroup trackgroup = atrackselection[i].getTrackGroup();
	//   44   79:aload_1         
	//   45   80:iload           7
	//   46   82:aaload          
	//   47   83:invokeinterface #419 <Method TrackGroup TrackSelection.getTrackGroup()>
	//   48   88:astore          16
			k = 0;
	//   49   90:iconst_0        
	//   50   91:istore          8
			do
			{
				if(k >= sampleStreamWrappers.length)
					continue label0;
	//   51   93:iload           8
	//   52   95:aload_0         
	//   53   96:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//   54   99:arraylength     
	//   55  100:icmpge          141
				if(sampleStreamWrappers[k].getTrackGroups().indexOf(trackgroup) != -1)
	//*  56  103:aload_0         
	//*  57  104:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//*  58  107:iload           8
	//*  59  109:aaload          
	//*  60  110:invokevirtual   #358 <Method TrackGroupArray HlsSampleStreamWrapper.getTrackGroups()>
	//*  61  113:aload           16
	//*  62  115:invokevirtual   #423 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//*  63  118:iconst_m1       
	//*  64  119:icmpeq          132
				{
					ai1[i] = k;
	//   65  122:aload           20
	//   66  124:iload           7
	//   67  126:iload           8
	//   68  128:iastore         
					continue label0;
	//   69  129:goto            141
				}
				k++;
	//   70  132:iload           8
	//   71  134:iconst_1        
	//   72  135:iadd            
	//   73  136:istore          8
			} while(true);
	//   74  138:goto            93
		}

	//   75  141:iload           7
	//   76  143:iconst_1        
	//   77  144:iadd            
	//   78  145:istore          7
	//*  79  147:goto            18
		streamWrapperIndices.clear();
	//   80  150:aload_0         
	//   81  151:getfield        #79  <Field IdentityHashMap streamWrapperIndices>
	//   82  154:invokevirtual   #426 <Method void IdentityHashMap.clear()>
		SampleStream asamplestream1[] = new SampleStream[atrackselection.length];
	//   83  157:aload_1         
	//   84  158:arraylength     
	//   85  159:anewarray       SampleStream[]
	//   86  162:astore          21
		SampleStream asamplestream2[] = new SampleStream[atrackselection.length];
	//   87  164:aload_1         
	//   88  165:arraylength     
	//   89  166:anewarray       SampleStream[]
	//   90  169:astore          22
		aobj = ((Object []) (new TrackSelection[atrackselection.length]));
	//   91  171:aload_1         
	//   92  172:arraylength     
	//   93  173:anewarray       TrackSelection[]
	//   94  176:astore          15
		HlsSampleStreamWrapper ahlssamplestreamwrapper[] = new HlsSampleStreamWrapper[sampleStreamWrappers.length];
	//   95  178:aload_0         
	//   96  179:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//   97  182:arraylength     
	//   98  183:anewarray       HlsSampleStreamWrapper[]
	//   99  186:astore          16
		int j = 0;
	//  100  188:iconst_0        
	//  101  189:istore          7
		int i1 = 0;
	//  102  191:iconst_0        
	//  103  192:istore          8
		boolean flag2 = false;
	//  104  194:iconst_0        
	//  105  195:istore          12
		for(; i1 < sampleStreamWrappers.length; i1++)
	//* 106  197:iload           8
	//* 107  199:aload_0         
	//* 108  200:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//* 109  203:arraylength     
	//* 110  204:icmpge          547
		{
			for(int j1 = 0; j1 < atrackselection.length; j1++)
	//* 111  207:iconst_0        
	//* 112  208:istore          9
	//* 113  210:iload           9
	//* 114  212:aload_1         
	//* 115  213:arraylength     
	//* 116  214:icmpge          289
			{
				int l1 = ai[j1];
	//  117  217:aload           19
	//  118  219:iload           9
	//  119  221:iaload          
	//  120  222:istore          10
				Object obj1 = null;
	//  121  224:aconst_null     
	//  122  225:astore          18
				Object obj;
				if(l1 == i1)
	//* 123  227:iload           10
	//* 124  229:iload           8
	//* 125  231:icmpne          243
					obj = ((Object) (asamplestream[j1]));
	//  126  234:aload_3         
	//  127  235:iload           9
	//  128  237:aaload          
	//  129  238:astore          17
				else
	//* 130  240:goto            246
					obj = null;
	//  131  243:aconst_null     
	//  132  244:astore          17
				asamplestream2[j1] = ((SampleStream) (obj));
	//  133  246:aload           22
	//  134  248:iload           9
	//  135  250:aload           17
	//  136  252:aastore         
				obj = ((Object) (obj1));
	//  137  253:aload           18
	//  138  255:astore          17
				if(ai1[j1] == i1)
	//* 139  257:aload           20
	//* 140  259:iload           9
	//* 141  261:iaload          
	//* 142  262:iload           8
	//* 143  264:icmpne          273
					obj = ((Object) (atrackselection[j1]));
	//  144  267:aload_1         
	//  145  268:iload           9
	//  146  270:aaload          
	//  147  271:astore          17
				aobj[j1] = ((TrackSelection) (obj));
	//  148  273:aload           15
	//  149  275:iload           9
	//  150  277:aload           17
	//  151  279:aastore         
			}

	//  152  280:iload           9
	//  153  282:iconst_1        
	//  154  283:iadd            
	//  155  284:istore          9
	//* 156  286:goto            210
			HlsSampleStreamWrapper hlssamplestreamwrapper = sampleStreamWrappers[i1];
	//  157  289:aload_0         
	//  158  290:getfield        #88  <Field HlsSampleStreamWrapper[] sampleStreamWrappers>
	//  159  293:iload           8
	//  160  295:aaload          
	//  161  296:astore          17
			boolean flag4 = hlssamplestreamwrapper.selectTracks(((TrackSelection []) (aobj)), aflag, asamplestream2, aflag1, l, flag2);
	//  162  298:aload           17
	//  163  300:aload           15
	//  164  302:aload_2         
	//  165  303:aload           22
	//  166  305:aload           4
	//  167  307:lload           5
	//  168  309:iload           12
	//  169  311:invokevirtual   #431 <Method boolean HlsSampleStreamWrapper.selectTracks(TrackSelection[], boolean[], SampleStream[], boolean[], long, boolean)>
	//  170  314:istore          14
			int k1 = 0;
	//  171  316:iconst_0        
	//  172  317:istore          9
			boolean flag = false;
	//  173  319:iconst_0        
	//  174  320:istore          10
			do
			{
				boolean flag3 = true;
	//  175  322:iconst_1        
	//  176  323:istore          13
				if(k1 >= atrackselection.length)
					break;
	//  177  325:iload           9
	//  178  327:aload_1         
	//  179  328:arraylength     
	//  180  329:icmpge          448
				boolean flag1;
				if(ai1[k1] == i1)
	//* 181  332:aload           20
	//* 182  334:iload           9
	//* 183  336:iaload          
	//* 184  337:iload           8
	//* 185  339:icmpne          398
				{
					if(asamplestream2[k1] != null)
	//* 186  342:aload           22
	//* 187  344:iload           9
	//* 188  346:aaload          
	//* 189  347:ifnull          356
						flag3 = true;
	//  190  350:iconst_1        
	//  191  351:istore          13
					else
	//* 192  353:goto            359
						flag3 = false;
	//  193  356:iconst_0        
	//  194  357:istore          13
					Assertions.checkState(flag3);
	//  195  359:iload           13
	//  196  361:invokestatic    #434 <Method void Assertions.checkState(boolean)>
					asamplestream1[k1] = asamplestream2[k1];
	//  197  364:aload           21
	//  198  366:iload           9
	//  199  368:aload           22
	//  200  370:iload           9
	//  201  372:aaload          
	//  202  373:aastore         
					streamWrapperIndices.put(((Object) (asamplestream2[k1])), ((Object) (Integer.valueOf(i1))));
	//  203  374:aload_0         
	//  204  375:getfield        #79  <Field IdentityHashMap streamWrapperIndices>
	//  205  378:aload           22
	//  206  380:iload           9
	//  207  382:aaload          
	//  208  383:iload           8
	//  209  385:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  210  388:invokevirtual   #442 <Method Object IdentityHashMap.put(Object, Object)>
	//  211  391:pop             
					flag1 = true;
	//  212  392:iconst_1        
	//  213  393:istore          11
				} else
	//* 214  395:goto            435
				{
					flag1 = flag;
	//  215  398:iload           10
	//  216  400:istore          11
					if(ai[k1] == i1)
	//* 217  402:aload           19
	//* 218  404:iload           9
	//* 219  406:iaload          
	//* 220  407:iload           8
	//* 221  409:icmpne          435
					{
						if(asamplestream2[k1] != null)
	//* 222  412:aload           22
	//* 223  414:iload           9
	//* 224  416:aaload          
	//* 225  417:ifnonnull       423
	//* 226  420:goto            426
							flag3 = false;
	//  227  423:iconst_0        
	//  228  424:istore          13
						Assertions.checkState(flag3);
	//  229  426:iload           13
	//  230  428:invokestatic    #434 <Method void Assertions.checkState(boolean)>
						flag1 = flag;
	//  231  431:iload           10
	//  232  433:istore          11
					}
				}
				k1++;
	//  233  435:iload           9
	//  234  437:iconst_1        
	//  235  438:iadd            
	//  236  439:istore          9
				flag = flag1;
	//  237  441:iload           11
	//  238  443:istore          10
			} while(true);
	//  239  445:goto            322
			if(!flag)
				continue;
	//  240  448:iload           10
	//  241  450:ifeq            538
			ahlssamplestreamwrapper[j] = hlssamplestreamwrapper;
	//  242  453:aload           16
	//  243  455:iload           7
	//  244  457:aload           17
	//  245  459:aastore         
			k1 = j + 1;
	//  246  460:iload           7
	//  247  462:iconst_1        
	//  248  463:iadd            
	//  249  464:istore          9
			if(j == 0)
	//* 250  466:iload           7
	//* 251  468:ifne            525
			{
				hlssamplestreamwrapper.setIsTimestampMaster(true);
	//  252  471:aload           17
	//  253  473:iconst_1        
	//  254  474:invokevirtual   #237 <Method void HlsSampleStreamWrapper.setIsTimestampMaster(boolean)>
				if(!flag4 && enabledSampleStreamWrappers.length != 0)
	//* 255  477:iload           14
	//* 256  479:ifne            508
	//* 257  482:aload_0         
	//* 258  483:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//* 259  486:arraylength     
	//* 260  487:ifeq            508
				{
					j = k1;
	//  261  490:iload           9
	//  262  492:istore          7
					if(hlssamplestreamwrapper == enabledSampleStreamWrappers[0])
	//* 263  494:aload           17
	//* 264  496:aload_0         
	//* 265  497:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//* 266  500:iconst_0        
	//* 267  501:aaload          
	//* 268  502:if_acmpeq       538
						continue;
	//  269  505:goto            508
				}
				timestampAdjusterProvider.reset();
	//  270  508:aload_0         
	//  271  509:getfield        #84  <Field TimestampAdjusterProvider timestampAdjusterProvider>
	//  272  512:invokevirtual   #403 <Method void TimestampAdjusterProvider.reset()>
				flag2 = true;
	//  273  515:iconst_1        
	//  274  516:istore          12
				j = k1;
	//  275  518:iload           9
	//  276  520:istore          7
			} else
	//* 277  522:goto            538
			{
				hlssamplestreamwrapper.setIsTimestampMaster(false);
	//  278  525:aload           17
	//  279  527:iconst_0        
	//  280  528:invokevirtual   #237 <Method void HlsSampleStreamWrapper.setIsTimestampMaster(boolean)>
				j = k1;
	//  281  531:iload           9
	//  282  533:istore          7
			}
		}

	//  283  535:goto            538
	//  284  538:iload           8
	//  285  540:iconst_1        
	//  286  541:iadd            
	//  287  542:istore          8
	//* 288  544:goto            197
		System.arraycopy(((Object) (asamplestream1)), 0, ((Object) (asamplestream)), 0, asamplestream1.length);
	//  289  547:aload           21
	//  290  549:iconst_0        
	//  291  550:aload_3         
	//  292  551:iconst_0        
	//  293  552:aload           21
	//  294  554:arraylength     
	//  295  555:invokestatic    #448 <Method void System.arraycopy(Object, int, Object, int, int)>
		enabledSampleStreamWrappers = (HlsSampleStreamWrapper[])Arrays.copyOf(((Object []) (ahlssamplestreamwrapper)), j);
	//  296  558:aload_0         
	//  297  559:aload           16
	//  298  561:iload           7
	//  299  563:invokestatic    #454 <Method Object[] Arrays.copyOf(Object[], int)>
	//  300  566:checkcast       #455 <Class HlsSampleStreamWrapper[]>
	//  301  569:putfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
		compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(((SequenceableLoader []) (enabledSampleStreamWrappers)));
	//  302  572:aload_0         
	//  303  573:aload_0         
	//  304  574:getfield        #62  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//  305  577:aload_0         
	//  306  578:getfield        #90  <Field HlsSampleStreamWrapper[] enabledSampleStreamWrappers>
	//  307  581:invokeinterface #72  <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//  308  586:putfield        #74  <Field SequenceableLoader compositeSequenceableLoader>
		return l;
	//  309  589:lload           5
	//  310  591:lreturn         
	}

	private final Allocator allocator;
	private final boolean allowChunklessPreparation;
	private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
	private SequenceableLoader compositeSequenceableLoader;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final HlsDataSourceFactory dataSourceFactory;
	private HlsSampleStreamWrapper enabledSampleStreamWrappers[];
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private final HlsExtractorFactory extractorFactory;
	private final int minLoadableRetryCount;
	private boolean notifiedReadingStarted;
	private int pendingPrepareCount;
	private final HlsPlaylistTracker playlistTracker;
	private HlsSampleStreamWrapper sampleStreamWrappers[];
	private final IdentityHashMap streamWrapperIndices = new IdentityHashMap();
	private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
	private TrackGroupArray trackGroups;
}
