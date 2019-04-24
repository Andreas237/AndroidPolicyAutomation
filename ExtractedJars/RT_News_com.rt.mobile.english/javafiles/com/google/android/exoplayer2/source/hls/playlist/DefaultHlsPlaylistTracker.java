// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsPlaylistTracker, HlsMediaPlaylist, HlsMasterPlaylist, HlsPlaylist

public final class DefaultHlsPlaylistTracker
	implements HlsPlaylistTracker, com.google.android.exoplayer2.upstream.Loader.Callback
{
	private final class MediaPlaylistBundle
		implements com.google.android.exoplayer2.upstream.Loader.Callback, Runnable
	{

		private boolean blacklistPlaylist()
		{
			blacklistUntilMs = SystemClock.elapsedRealtime() + 60000L;
		//    0    0:aload_0         
		//    1    1:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
		//    2    4:ldc2w           #114 <Long 60000L>
		//    3    7:ladd            
		//    4    8:putfield        #103 <Field long blacklistUntilMs>
			return primaryHlsUrl == playlistUrl && !maybeSelectNewPrimaryUrl();
		//    5   11:aload_0         
		//    6   12:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//    7   15:invokestatic    #119 <Method HlsMasterPlaylist$HlsUrl DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker)>
		//    8   18:aload_0         
		//    9   19:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   10   22:if_acmpne       37
		//   11   25:aload_0         
		//   12   26:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   13   29:invokestatic    #123 <Method boolean DefaultHlsPlaylistTracker.access$1300(DefaultHlsPlaylistTracker)>
		//   14   32:ifne            37
		//   15   35:iconst_1        
		//   16   36:ireturn         
		//   17   37:iconst_0        
		//   18   38:ireturn         
		}

		private void loadPlaylistImmediately()
		{
			long l = mediaPlaylistLoader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (mediaPlaylistLoadable)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minRetryCount);
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field Loader mediaPlaylistLoader>
		//    2    4:aload_0         
		//    3    5:getfield        #92  <Field ParsingLoadable mediaPlaylistLoadable>
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//    7   13:invokestatic    #128 <Method int DefaultHlsPlaylistTracker.access$900(DefaultHlsPlaylistTracker)>
		//    8   16:invokevirtual   #132 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
		//    9   19:lstore_1        
			eventDispatcher.loadStarted(mediaPlaylistLoadable.dataSpec, mediaPlaylistLoadable.type, l);
		//   10   20:aload_0         
		//   11   21:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   12   24:invokestatic    #136 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker)>
		//   13   27:aload_0         
		//   14   28:getfield        #92  <Field ParsingLoadable mediaPlaylistLoadable>
		//   15   31:getfield        #140 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
		//   16   34:aload_0         
		//   17   35:getfield        #92  <Field ParsingLoadable mediaPlaylistLoadable>
		//   18   38:getfield        #144 <Field int ParsingLoadable.type>
		//   19   41:lload_1         
		//   20   42:invokevirtual   #150 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(com.google.android.exoplayer2.upstream.DataSpec, int, long)>
		//   21   45:return          
		}

		private void processLoadedPlaylist(HlsMediaPlaylist hlsmediaplaylist)
		{
			HlsMediaPlaylist hlsmediaplaylist1 = playlistSnapshot;
		//    0    0:aload_0         
		//    1    1:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//    2    4:astore          6
			long l1 = SystemClock.elapsedRealtime();
		//    3    6:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
		//    4    9:lstore          4
			lastSnapshotLoadMs = l1;
		//    5   11:aload_0         
		//    6   12:lload           4
		//    7   14:putfield        #154 <Field long lastSnapshotLoadMs>
			playlistSnapshot = getLatestPlaylistSnapshot(hlsmediaplaylist1, hlsmediaplaylist);
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   11   22:aload           6
		//   12   24:aload_1         
		//   13   25:invokestatic    #158 <Method HlsMediaPlaylist DefaultHlsPlaylistTracker.access$1000(DefaultHlsPlaylistTracker, HlsMediaPlaylist, HlsMediaPlaylist)>
		//   14   28:putfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
			if(playlistSnapshot != hlsmediaplaylist1)
		//*  15   31:aload_0         
		//*  16   32:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  17   35:aload           6
		//*  18   37:if_acmpeq       69
			{
				playlistError = null;
		//   19   40:aload_0         
		//   20   41:aconst_null     
		//   21   42:putfield        #160 <Field IOException playlistError>
				lastSnapshotChangeMs = l1;
		//   22   45:aload_0         
		//   23   46:lload           4
		//   24   48:putfield        #162 <Field long lastSnapshotChangeMs>
				onPlaylistUpdated(playlistUrl, playlistSnapshot);
		//   25   51:aload_0         
		//   26   52:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   27   55:aload_0         
		//   28   56:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   29   59:aload_0         
		//   30   60:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//   31   63:invokestatic    #166 <Method void DefaultHlsPlaylistTracker.access$1100(DefaultHlsPlaylistTracker, HlsMasterPlaylist$HlsUrl, HlsMediaPlaylist)>
			} else
		//*  32   66:goto            202
			if(!playlistSnapshot.hasEndTag)
		//*  33   69:aload_0         
		//*  34   70:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  35   73:getfield        #171 <Field boolean HlsMediaPlaylist.hasEndTag>
		//*  36   76:ifne            202
				if(hlsmediaplaylist.mediaSequence + (long)hlsmediaplaylist.segments.size() < playlistSnapshot.mediaSequence)
		//*  37   79:aload_1         
		//*  38   80:getfield        #174 <Field long HlsMediaPlaylist.mediaSequence>
		//*  39   83:aload_1         
		//*  40   84:getfield        #178 <Field List HlsMediaPlaylist.segments>
		//*  41   87:invokeinterface #184 <Method int List.size()>
		//*  42   92:i2l             
		//*  43   93:ladd            
		//*  44   94:aload_0         
		//*  45   95:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  46   98:getfield        #174 <Field long HlsMediaPlaylist.mediaSequence>
		//*  47  101:lcmp            
		//*  48  102:ifge            139
				{
					playlistError = ((IOException) (new HlsPlaylistTracker.PlaylistResetException(playlistUrl.url)));
		//   49  105:aload_0         
		//   50  106:new             #186 <Class HlsPlaylistTracker$PlaylistResetException>
		//   51  109:dup             
		//   52  110:aload_0         
		//   53  111:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   54  114:getfield        #77  <Field String HlsMasterPlaylist$HlsUrl.url>
		//   55  117:invokespecial   #187 <Method void HlsPlaylistTracker$PlaylistResetException(String)>
		//   56  120:putfield        #160 <Field IOException playlistError>
					notifyPlaylistError(playlistUrl, false);
		//   57  123:aload_0         
		//   58  124:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   59  127:aload_0         
		//   60  128:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   61  131:iconst_0        
		//   62  132:invokestatic    #191 <Method boolean DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker, HlsMasterPlaylist$HlsUrl, boolean)>
		//   63  135:pop             
				} else
		//*  64  136:goto            202
				if((double)(l1 - lastSnapshotChangeMs) > (double)C.usToMs(playlistSnapshot.targetDurationUs) * 3.5D)
		//*  65  139:lload           4
		//*  66  141:aload_0         
		//*  67  142:getfield        #162 <Field long lastSnapshotChangeMs>
		//*  68  145:lsub            
		//*  69  146:l2d             
		//*  70  147:aload_0         
		//*  71  148:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  72  151:getfield        #194 <Field long HlsMediaPlaylist.targetDurationUs>
		//*  73  154:invokestatic    #200 <Method long C.usToMs(long)>
		//*  74  157:l2d             
		//*  75  158:ldc2w           #201 <Double 3.5D>
		//*  76  161:dmul            
		//*  77  162:dcmpl           
		//*  78  163:ifle            202
				{
					playlistError = ((IOException) (new HlsPlaylistTracker.PlaylistStuckException(playlistUrl.url)));
		//   79  166:aload_0         
		//   80  167:new             #204 <Class HlsPlaylistTracker$PlaylistStuckException>
		//   81  170:dup             
		//   82  171:aload_0         
		//   83  172:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   84  175:getfield        #77  <Field String HlsMasterPlaylist$HlsUrl.url>
		//   85  178:invokespecial   #205 <Method void HlsPlaylistTracker$PlaylistStuckException(String)>
		//   86  181:putfield        #160 <Field IOException playlistError>
					notifyPlaylistError(playlistUrl, true);
		//   87  184:aload_0         
		//   88  185:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   89  188:aload_0         
		//   90  189:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//   91  192:iconst_1        
		//   92  193:invokestatic    #191 <Method boolean DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker, HlsMasterPlaylist$HlsUrl, boolean)>
		//   93  196:pop             
					blacklistPlaylist();
		//   94  197:aload_0         
		//   95  198:invokespecial   #207 <Method boolean blacklistPlaylist()>
		//   96  201:pop             
				}
			long l;
			if(playlistSnapshot != hlsmediaplaylist1)
		//*  97  202:aload_0         
		//*  98  203:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  99  206:aload           6
		//* 100  208:if_acmpeq       222
				l = playlistSnapshot.targetDurationUs;
		//  101  211:aload_0         
		//  102  212:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//  103  215:getfield        #194 <Field long HlsMediaPlaylist.targetDurationUs>
		//  104  218:lstore_2        
			else
		//* 105  219:goto            234
				l = playlistSnapshot.targetDurationUs / 2L;
		//  106  222:aload_0         
		//  107  223:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//  108  226:getfield        #194 <Field long HlsMediaPlaylist.targetDurationUs>
		//  109  229:ldc2w           #208 <Long 2L>
		//  110  232:ldiv            
		//  111  233:lstore_2        
			earliestNextLoadTimeMs = l1 + C.usToMs(l);
		//  112  234:aload_0         
		//  113  235:lload           4
		//  114  237:lload_2         
		//  115  238:invokestatic    #200 <Method long C.usToMs(long)>
		//  116  241:ladd            
		//  117  242:putfield        #211 <Field long earliestNextLoadTimeMs>
			if(playlistUrl == primaryHlsUrl && !playlistSnapshot.hasEndTag)
		//* 118  245:aload_0         
		//* 119  246:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//* 120  249:aload_0         
		//* 121  250:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//* 122  253:invokestatic    #119 <Method HlsMasterPlaylist$HlsUrl DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker)>
		//* 123  256:if_acmpne       273
		//* 124  259:aload_0         
		//* 125  260:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//* 126  263:getfield        #171 <Field boolean HlsMediaPlaylist.hasEndTag>
		//* 127  266:ifne            273
				loadPlaylist();
		//  128  269:aload_0         
		//  129  270:invokevirtual   #214 <Method void loadPlaylist()>
		//  130  273:return          
		}

		public HlsMediaPlaylist getPlaylistSnapshot()
		{
			return playlistSnapshot;
		//    0    0:aload_0         
		//    1    1:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//    2    4:areturn         
		}

		public boolean isSnapshotValid()
		{
			HlsMediaPlaylist hlsmediaplaylist = playlistSnapshot;
		//    0    0:aload_0         
		//    1    1:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//    2    4:astore          6
			boolean flag = false;
		//    3    6:iconst_0        
		//    4    7:istore_1        
			if(hlsmediaplaylist == null)
		//*   5    8:aload           6
		//*   6   10:ifnonnull       15
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
			long l = SystemClock.elapsedRealtime();
		//    9   15:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
		//   10   18:lstore_2        
			long l1 = Math.max(30000L, C.usToMs(playlistSnapshot.durationUs));
		//   11   19:ldc2w           #218 <Long 30000L>
		//   12   22:aload_0         
		//   13   23:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//   14   26:getfield        #222 <Field long HlsMediaPlaylist.durationUs>
		//   15   29:invokestatic    #200 <Method long C.usToMs(long)>
		//   16   32:invokestatic    #228 <Method long Math.max(long, long)>
		//   17   35:lstore          4
			if(playlistSnapshot.hasEndTag || playlistSnapshot.playlistType == 2 || playlistSnapshot.playlistType == 1 || lastSnapshotLoadMs + l1 > l)
		//*  18   37:aload_0         
		//*  19   38:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  20   41:getfield        #171 <Field boolean HlsMediaPlaylist.hasEndTag>
		//*  21   44:ifne            81
		//*  22   47:aload_0         
		//*  23   48:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  24   51:getfield        #231 <Field int HlsMediaPlaylist.playlistType>
		//*  25   54:iconst_2        
		//*  26   55:icmpeq          81
		//*  27   58:aload_0         
		//*  28   59:getfield        #152 <Field HlsMediaPlaylist playlistSnapshot>
		//*  29   62:getfield        #231 <Field int HlsMediaPlaylist.playlistType>
		//*  30   65:iconst_1        
		//*  31   66:icmpeq          81
		//*  32   69:aload_0         
		//*  33   70:getfield        #154 <Field long lastSnapshotLoadMs>
		//*  34   73:lload           4
		//*  35   75:ladd            
		//*  36   76:lload_2         
		//*  37   77:lcmp            
		//*  38   78:ifle            83
				flag = true;
		//   39   81:iconst_1        
		//   40   82:istore_1        
			return flag;
		//   41   83:iload_1         
		//   42   84:ireturn         
		}

		public void loadPlaylist()
		{
			blacklistUntilMs = 0L;
		//    0    0:aload_0         
		//    1    1:lconst_0        
		//    2    2:putfield        #103 <Field long blacklistUntilMs>
			if(!loadPending)
		//*   3    5:aload_0         
		//*   4    6:getfield        #233 <Field boolean loadPending>
		//*   5    9:ifne            65
			{
				if(mediaPlaylistLoader.isLoading())
		//*   6   12:aload_0         
		//*   7   13:getfield        #50  <Field Loader mediaPlaylistLoader>
		//*   8   16:invokevirtual   #236 <Method boolean Loader.isLoading()>
		//*   9   19:ifeq            23
					return;
		//   10   22:return          
				long l = SystemClock.elapsedRealtime();
		//   11   23:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
		//   12   26:lstore_1        
				if(l < earliestNextLoadTimeMs)
		//*  13   27:lload_1         
		//*  14   28:aload_0         
		//*  15   29:getfield        #211 <Field long earliestNextLoadTimeMs>
		//*  16   32:lcmp            
		//*  17   33:ifge            60
				{
					loadPending = true;
		//   18   36:aload_0         
		//   19   37:iconst_1        
		//   20   38:putfield        #233 <Field boolean loadPending>
					playlistRefreshHandler.postDelayed(((Runnable) (this)), earliestNextLoadTimeMs - l);
		//   21   41:aload_0         
		//   22   42:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   23   45:invokestatic    #240 <Method Handler DefaultHlsPlaylistTracker.access$600(DefaultHlsPlaylistTracker)>
		//   24   48:aload_0         
		//   25   49:aload_0         
		//   26   50:getfield        #211 <Field long earliestNextLoadTimeMs>
		//   27   53:lload_1         
		//   28   54:lsub            
		//   29   55:invokevirtual   #246 <Method boolean Handler.postDelayed(Runnable, long)>
		//   30   58:pop             
					return;
		//   31   59:return          
				} else
				{
					loadPlaylistImmediately();
		//   32   60:aload_0         
		//   33   61:invokespecial   #248 <Method void loadPlaylistImmediately()>
					return;
		//   34   64:return          
				}
			} else
			{
				return;
		//   35   65:return          
			}
		}

		public void maybeThrowPlaylistRefreshError()
			throws IOException
		{
			mediaPlaylistLoader.maybeThrowError();
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field Loader mediaPlaylistLoader>
		//    2    4:invokevirtual   #254 <Method void Loader.maybeThrowError()>
			if(playlistError != null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #160 <Field IOException playlistError>
		//*   5   11:ifnull          19
				throw playlistError;
		//    6   14:aload_0         
		//    7   15:getfield        #160 <Field IOException playlistError>
		//    8   18:athrow          
			else
				return;
		//    9   19:return          
		}

		public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
		{
			onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #52  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:iload           6
		//    6   10:invokevirtual   #260 <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
		//    7   13:return          
		}

		public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
		{
			eventDispatcher.loadCanceled(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//    2    4:invokestatic    #136 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker)>
		//    3    7:aload_1         
		//    4    8:getfield        #140 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
		//    5   11:iconst_4        
		//    6   12:lload_2         
		//    7   13:lload           4
		//    8   15:aload_1         
		//    9   16:invokevirtual   #263 <Method long ParsingLoadable.bytesLoaded()>
		//   10   19:invokevirtual   #267 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
		//   11   22:return          
		}

		public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
		{
			onLoadCompleted((ParsingLoadable)loadable, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #52  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #274 <Method void onLoadCompleted(ParsingLoadable, long, long)>
		//    6   11:return          
		}

		public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
		{
			HlsPlaylist hlsplaylist = (HlsPlaylist)parsingloadable.getResult();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #278 <Method Object ParsingLoadable.getResult()>
		//    2    4:checkcast       #280 <Class HlsPlaylist>
		//    3    7:astore          6
			if(hlsplaylist instanceof HlsMediaPlaylist)
		//*   4    9:aload           6
		//*   5   11:instanceof      #168 <Class HlsMediaPlaylist>
		//*   6   14:ifeq            49
			{
				processLoadedPlaylist((HlsMediaPlaylist)hlsplaylist);
		//    7   17:aload_0         
		//    8   18:aload           6
		//    9   20:checkcast       #168 <Class HlsMediaPlaylist>
		//   10   23:invokespecial   #99  <Method void processLoadedPlaylist(HlsMediaPlaylist)>
				eventDispatcher.loadCompleted(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
		//   11   26:aload_0         
		//   12   27:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//   13   30:invokestatic    #136 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker)>
		//   14   33:aload_1         
		//   15   34:getfield        #140 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
		//   16   37:iconst_4        
		//   17   38:lload_2         
		//   18   39:lload           4
		//   19   41:aload_1         
		//   20   42:invokevirtual   #263 <Method long ParsingLoadable.bytesLoaded()>
		//   21   45:invokevirtual   #283 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
				return;
		//   22   48:return          
			} else
			{
				playlistError = ((IOException) (new ParserException("Loaded playlist has unexpected type.")));
		//   23   49:aload_0         
		//   24   50:new             #285 <Class ParserException>
		//   25   53:dup             
		//   26   54:ldc2            #287 <String "Loaded playlist has unexpected type.">
		//   27   57:invokespecial   #288 <Method void ParserException(String)>
		//   28   60:putfield        #160 <Field IOException playlistError>
				return;
		//   29   63:return          
			}
		}

		public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
		{
			return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #52  <Class ParsingLoadable>
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:aload           6
		//    6   10:invokevirtual   #294 <Method int onLoadError(ParsingLoadable, long, long, IOException)>
		//    7   13:ireturn         
		}

		public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
		{
			boolean flag2 = ioexception instanceof ParserException;
		//    0    0:aload           6
		//    1    2:instanceof      #285 <Class ParserException>
		//    2    5:istore          9
			eventDispatcher.loadError(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded(), ioexception, flag2);
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//    5   11:invokestatic    #136 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker)>
		//    6   14:aload_1         
		//    7   15:getfield        #140 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
		//    8   18:iconst_4        
		//    9   19:lload_2         
		//   10   20:lload           4
		//   11   22:aload_1         
		//   12   23:invokevirtual   #263 <Method long ParsingLoadable.bytesLoaded()>
		//   13   26:aload           6
		//   14   28:iload           9
		//   15   30:invokevirtual   #298 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long, IOException, boolean)>
			boolean flag3 = ChunkedTrackBlacklistUtil.shouldBlacklist(((Exception) (ioexception)));
		//   16   33:aload           6
		//   17   35:invokestatic    #304 <Method boolean ChunkedTrackBlacklistUtil.shouldBlacklist(Exception)>
		//   18   38:istore          10
			boolean flag;
			if(!notifyPlaylistError(playlistUrl, flag3) && flag3)
		//*  19   40:aload_0         
		//*  20   41:getfield        #36  <Field DefaultHlsPlaylistTracker this$0>
		//*  21   44:aload_0         
		//*  22   45:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//*  23   48:iload           10
		//*  24   50:invokestatic    #191 <Method boolean DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker, HlsMasterPlaylist$HlsUrl, boolean)>
		//*  25   53:ifne            70
		//*  26   56:iload           10
		//*  27   58:ifne            64
		//*  28   61:goto            70
				flag = false;
		//   29   64:iconst_0        
		//   30   65:istore          7
			else
		//*  31   67:goto            73
				flag = true;
		//   32   70:iconst_1        
		//   33   71:istore          7
			if(flag2)
		//*  34   73:iload           9
		//*  35   75:ifeq            80
				return 3;
		//   36   78:iconst_3        
		//   37   79:ireturn         
			boolean flag1 = flag;
		//   38   80:iload           7
		//   39   82:istore          8
			if(flag3)
		//*  40   84:iload           10
		//*  41   86:ifeq            98
				flag1 = flag | blacklistPlaylist();
		//   42   89:iload           7
		//   43   91:aload_0         
		//   44   92:invokespecial   #207 <Method boolean blacklistPlaylist()>
		//   45   95:ior             
		//   46   96:istore          8
			return !flag1 ? 2 : 0;
		//   47   98:iload           8
		//   48  100:ifeq            105
		//   49  103:iconst_0        
		//   50  104:ireturn         
		//   51  105:iconst_2        
		//   52  106:ireturn         
		}

		public void release()
		{
			mediaPlaylistLoader.release();
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field Loader mediaPlaylistLoader>
		//    2    4:invokevirtual   #308 <Method void Loader.release()>
		//    3    7:return          
		}

		public void run()
		{
			loadPending = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #233 <Field boolean loadPending>
			loadPlaylistImmediately();
		//    3    5:aload_0         
		//    4    6:invokespecial   #248 <Method void loadPlaylistImmediately()>
		//    5    9:return          
		}

		private long blacklistUntilMs;
		private long earliestNextLoadTimeMs;
		private long lastSnapshotChangeMs;
		private long lastSnapshotLoadMs;
		private boolean loadPending;
		private final ParsingLoadable mediaPlaylistLoadable;
		private final Loader mediaPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
		private IOException playlistError;
		private HlsMediaPlaylist playlistSnapshot;
		private final HlsMasterPlaylist.HlsUrl playlistUrl;
		final DefaultHlsPlaylistTracker this$0;


/*
		static void access$000(MediaPlaylistBundle mediaplaylistbundle, HlsMediaPlaylist hlsmediaplaylist)
		{
			mediaplaylistbundle.processLoadedPlaylist(hlsmediaplaylist);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #99  <Method void processLoadedPlaylist(HlsMediaPlaylist)>
			return;
		//    3    5:return          
		}

*/


/*
		static long access$100(MediaPlaylistBundle mediaplaylistbundle)
		{
			return mediaplaylistbundle.blacklistUntilMs;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field long blacklistUntilMs>
		//    2    4:lreturn         
		}

*/


/*
		static HlsMasterPlaylist.HlsUrl access$200(MediaPlaylistBundle mediaplaylistbundle)
		{
			return mediaplaylistbundle.playlistUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//    2    4:areturn         
		}

*/

		public MediaPlaylistBundle(HlsMasterPlaylist.HlsUrl hlsurl)
		{
			this$0 = DefaultHlsPlaylistTracker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field DefaultHlsPlaylistTracker this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #39  <Method void Object()>
			playlistUrl = hlsurl;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
		//    8   14:aload_0         
		//    9   15:new             #43  <Class Loader>
		//   10   18:dup             
		//   11   19:ldc1            #45  <String "DefaultHlsPlaylistTracker:MediaPlaylist">
		//   12   21:invokespecial   #48  <Method void Loader(String)>
		//   13   24:putfield        #50  <Field Loader mediaPlaylistLoader>
			mediaPlaylistLoadable = new ParsingLoadable(dataSourceFactory.createDataSource(4), UriUtil.resolveToUri(masterPlaylist.baseUri, hlsurl.url), 4, playlistParser);
		//   14   27:aload_0         
		//   15   28:new             #52  <Class ParsingLoadable>
		//   16   31:dup             
		//   17   32:aload_1         
		//   18   33:invokestatic    #56  <Method HlsDataSourceFactory DefaultHlsPlaylistTracker.access$300(DefaultHlsPlaylistTracker)>
		//   19   36:iconst_4        
		//   20   37:invokeinterface #62  <Method com.google.android.exoplayer2.upstream.DataSource HlsDataSourceFactory.createDataSource(int)>
		//   21   42:aload_1         
		//   22   43:invokestatic    #66  <Method HlsMasterPlaylist DefaultHlsPlaylistTracker.access$400(DefaultHlsPlaylistTracker)>
		//   23   46:getfield        #72  <Field String HlsMasterPlaylist.baseUri>
		//   24   49:aload_2         
		//   25   50:getfield        #77  <Field String HlsMasterPlaylist$HlsUrl.url>
		//   26   53:invokestatic    #83  <Method Uri UriUtil.resolveToUri(String, String)>
		//   27   56:iconst_4        
		//   28   57:aload_1         
		//   29   58:invokestatic    #87  <Method com.google.android.exoplayer2.upstream.ParsingLoadable$Parser DefaultHlsPlaylistTracker.access$500(DefaultHlsPlaylistTracker)>
		//   30   61:invokespecial   #90  <Method void ParsingLoadable(com.google.android.exoplayer2.upstream.DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
		//   31   64:putfield        #92  <Field ParsingLoadable mediaPlaylistLoadable>
		//   32   67:return          
		}
	}


	public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsdatasourcefactory, int i, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		dataSourceFactory = hlsdatasourcefactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field HlsDataSourceFactory dataSourceFactory>
		minRetryCount = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #56  <Field int minRetryCount>
		playlistParser = parser;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
	//   11   19:aload_0         
	//   12   20:new             #60  <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #61  <Method void ArrayList()>
	//   15   27:putfield        #63  <Field List listeners>
	//   16   30:aload_0         
	//   17   31:new             #65  <Class IdentityHashMap>
	//   18   34:dup             
	//   19   35:invokespecial   #66  <Method void IdentityHashMap()>
	//   20   38:putfield        #68  <Field IdentityHashMap playlistBundles>
		initialStartTimeUs = 0x1L;
	//   21   41:aload_0         
	//   22   42:ldc2w           #69  <Long 0x1L>
	//   23   45:putfield        #72  <Field long initialStartTimeUs>
	//   24   48:return          
	}

	private void createBundles(List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #129 <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          57
		{
			HlsMasterPlaylist.HlsUrl hlsurl = (HlsMasterPlaylist.HlsUrl)list.get(i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokeinterface #133 <Method Object List.get(int)>
	//   11   21:checkcast       #135 <Class HlsMasterPlaylist$HlsUrl>
	//   12   24:astore          4
			MediaPlaylistBundle mediaplaylistbundle = new MediaPlaylistBundle(hlsurl);
	//   13   26:new             #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:aload           4
	//   17   33:invokespecial   #138 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle(DefaultHlsPlaylistTracker, HlsMasterPlaylist$HlsUrl)>
	//   18   36:astore          5
			playlistBundles.put(((Object) (hlsurl)), ((Object) (mediaplaylistbundle)));
	//   19   38:aload_0         
	//   20   39:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   21   42:aload           4
	//   22   44:aload           5
	//   23   46:invokevirtual   #142 <Method Object IdentityHashMap.put(Object, Object)>
	//   24   49:pop             
		}

	//   25   50:iload_2         
	//   26   51:iconst_1        
	//   27   52:iadd            
	//   28   53:istore_2        
	//*  29   54:goto            9
	//   30   57:return          
	}

	private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist hlsmediaplaylist, HlsMediaPlaylist hlsmediaplaylist1)
	{
		int i = (int)(hlsmediaplaylist1.mediaSequence - hlsmediaplaylist.mediaSequence);
	//    0    0:aload_1         
	//    1    1:getfield        #150 <Field long HlsMediaPlaylist.mediaSequence>
	//    2    4:aload_0         
	//    3    5:getfield        #150 <Field long HlsMediaPlaylist.mediaSequence>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:istore_2        
		hlsmediaplaylist = ((HlsMediaPlaylist) (hlsmediaplaylist.segments));
	//    7   11:aload_0         
	//    8   12:getfield        #153 <Field List HlsMediaPlaylist.segments>
	//    9   15:astore_0        
		if(i < ((List) (hlsmediaplaylist)).size())
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:invokeinterface #129 <Method int List.size()>
	//*  13   23:icmpge          37
			return (HlsMediaPlaylist.Segment)((List) (hlsmediaplaylist)).get(i);
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:invokeinterface #133 <Method Object List.get(int)>
	//   17   33:checkcast       #155 <Class HlsMediaPlaylist$Segment>
	//   18   36:areturn         
		else
			return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
	}

	private HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist hlsmediaplaylist, HlsMediaPlaylist hlsmediaplaylist1)
	{
		if(!hlsmediaplaylist1.isNewerThan(hlsmediaplaylist))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #159 <Method boolean HlsMediaPlaylist.isNewerThan(HlsMediaPlaylist)>
	//*   3    5:ifne            22
		{
			if(hlsmediaplaylist1.hasEndTag)
	//*   4    8:aload_2         
	//*   5    9:getfield        #162 <Field boolean HlsMediaPlaylist.hasEndTag>
	//*   6   12:ifeq            20
				return hlsmediaplaylist.copyWithEndTag();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #166 <Method HlsMediaPlaylist HlsMediaPlaylist.copyWithEndTag()>
	//    9   19:areturn         
			else
				return hlsmediaplaylist;
	//   10   20:aload_1         
	//   11   21:areturn         
		} else
		{
			return hlsmediaplaylist1.copyWith(getLoadedPlaylistStartTimeUs(hlsmediaplaylist, hlsmediaplaylist1), getLoadedPlaylistDiscontinuitySequence(hlsmediaplaylist, hlsmediaplaylist1));
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokespecial   #170 <Method long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist, HlsMediaPlaylist)>
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:aload_2         
	//   20   32:invokespecial   #174 <Method int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist, HlsMediaPlaylist)>
	//   21   35:invokevirtual   #178 <Method HlsMediaPlaylist HlsMediaPlaylist.copyWith(long, int)>
	//   22   38:areturn         
		}
	}

	private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist hlsmediaplaylist, HlsMediaPlaylist hlsmediaplaylist1)
	{
		if(hlsmediaplaylist1.hasDiscontinuitySequence)
	//*   0    0:aload_2         
	//*   1    1:getfield        #181 <Field boolean HlsMediaPlaylist.hasDiscontinuitySequence>
	//*   2    4:ifeq            12
			return hlsmediaplaylist1.discontinuitySequence;
	//    3    7:aload_2         
	//    4    8:getfield        #184 <Field int HlsMediaPlaylist.discontinuitySequence>
	//    5   11:ireturn         
		int i;
		if(primaryUrlSnapshot != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//*   8   16:ifnull          30
			i = primaryUrlSnapshot.discontinuitySequence;
	//    9   19:aload_0         
	//   10   20:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//   11   23:getfield        #184 <Field int HlsMediaPlaylist.discontinuitySequence>
	//   12   26:istore_3        
		else
	//*  13   27:goto            32
			i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_3        
		if(hlsmediaplaylist == null)
	//*  16   32:aload_1         
	//*  17   33:ifnonnull       38
			return i;
	//   18   36:iload_3         
	//   19   37:ireturn         
		HlsMediaPlaylist.Segment segment = getFirstOldOverlappingSegment(hlsmediaplaylist, hlsmediaplaylist1);
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokestatic    #188 <Method HlsMediaPlaylist$Segment getFirstOldOverlappingSegment(HlsMediaPlaylist, HlsMediaPlaylist)>
	//   23   43:astore          4
		if(segment != null)
	//*  24   45:aload           4
	//*  25   47:ifnull          78
			return (hlsmediaplaylist.discontinuitySequence + segment.relativeDiscontinuitySequence) - ((HlsMediaPlaylist.Segment)hlsmediaplaylist1.segments.get(0)).relativeDiscontinuitySequence;
	//   26   50:aload_1         
	//   27   51:getfield        #184 <Field int HlsMediaPlaylist.discontinuitySequence>
	//   28   54:aload           4
	//   29   56:getfield        #191 <Field int HlsMediaPlaylist$Segment.relativeDiscontinuitySequence>
	//   30   59:iadd            
	//   31   60:aload_2         
	//   32   61:getfield        #153 <Field List HlsMediaPlaylist.segments>
	//   33   64:iconst_0        
	//   34   65:invokeinterface #133 <Method Object List.get(int)>
	//   35   70:checkcast       #155 <Class HlsMediaPlaylist$Segment>
	//   36   73:getfield        #191 <Field int HlsMediaPlaylist$Segment.relativeDiscontinuitySequence>
	//   37   76:isub            
	//   38   77:ireturn         
		else
			return i;
	//   39   78:iload_3         
	//   40   79:ireturn         
	}

	private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist hlsmediaplaylist, HlsMediaPlaylist hlsmediaplaylist1)
	{
		if(hlsmediaplaylist1.hasProgramDateTime)
	//*   0    0:aload_2         
	//*   1    1:getfield        #194 <Field boolean HlsMediaPlaylist.hasProgramDateTime>
	//*   2    4:ifeq            12
			return hlsmediaplaylist1.startTimeUs;
	//    3    7:aload_2         
	//    4    8:getfield        #197 <Field long HlsMediaPlaylist.startTimeUs>
	//    5   11:lreturn         
		long l;
		if(primaryUrlSnapshot != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//*   8   16:ifnull          31
			l = primaryUrlSnapshot.startTimeUs;
	//    9   19:aload_0         
	//   10   20:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//   11   23:getfield        #197 <Field long HlsMediaPlaylist.startTimeUs>
	//   12   26:lstore          4
		else
	//*  13   28:goto            34
			l = 0L;
	//   14   31:lconst_0        
	//   15   32:lstore          4
		if(hlsmediaplaylist == null)
	//*  16   34:aload_1         
	//*  17   35:ifnonnull       41
			return l;
	//   18   38:lload           4
	//   19   40:lreturn         
		int i = hlsmediaplaylist.segments.size();
	//   20   41:aload_1         
	//   21   42:getfield        #153 <Field List HlsMediaPlaylist.segments>
	//   22   45:invokeinterface #129 <Method int List.size()>
	//   23   50:istore_3        
		HlsMediaPlaylist.Segment segment = getFirstOldOverlappingSegment(hlsmediaplaylist, hlsmediaplaylist1);
	//   24   51:aload_1         
	//   25   52:aload_2         
	//   26   53:invokestatic    #188 <Method HlsMediaPlaylist$Segment getFirstOldOverlappingSegment(HlsMediaPlaylist, HlsMediaPlaylist)>
	//   27   56:astore          6
		if(segment != null)
	//*  28   58:aload           6
	//*  29   60:ifnull          74
			return hlsmediaplaylist.startTimeUs + segment.relativeStartTimeUs;
	//   30   63:aload_1         
	//   31   64:getfield        #197 <Field long HlsMediaPlaylist.startTimeUs>
	//   32   67:aload           6
	//   33   69:getfield        #200 <Field long HlsMediaPlaylist$Segment.relativeStartTimeUs>
	//   34   72:ladd            
	//   35   73:lreturn         
		if((long)i == hlsmediaplaylist1.mediaSequence - hlsmediaplaylist.mediaSequence)
	//*  36   74:iload_3         
	//*  37   75:i2l             
	//*  38   76:aload_2         
	//*  39   77:getfield        #150 <Field long HlsMediaPlaylist.mediaSequence>
	//*  40   80:aload_1         
	//*  41   81:getfield        #150 <Field long HlsMediaPlaylist.mediaSequence>
	//*  42   84:lsub            
	//*  43   85:lcmp            
	//*  44   86:ifne            94
			return hlsmediaplaylist.getEndTimeUs();
	//   45   89:aload_1         
	//   46   90:invokevirtual   #204 <Method long HlsMediaPlaylist.getEndTimeUs()>
	//   47   93:lreturn         
		else
			return l;
	//   48   94:lload           4
	//   49   96:lreturn         
	}

	private boolean maybeSelectNewPrimaryUrl()
	{
		List list = masterPlaylist.variants;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field HlsMasterPlaylist masterPlaylist>
	//    2    4:getfield        #209 <Field List HlsMasterPlaylist.variants>
	//    3    7:astore          5
		int j = list.size();
	//    4    9:aload           5
	//    5   11:invokeinterface #129 <Method int List.size()>
	//    6   16:istore_2        
		long l = SystemClock.elapsedRealtime();
	//    7   17:invokestatic    #214 <Method long SystemClock.elapsedRealtime()>
	//    8   20:lstore_3        
		for(int i = 0; i < j; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:iload_2         
	//*  13   25:icmpge          81
		{
			MediaPlaylistBundle mediaplaylistbundle = (MediaPlaylistBundle)playlistBundles.get(list.get(i));
	//   14   28:aload_0         
	//   15   29:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   16   32:aload           5
	//   17   34:iload_1         
	//   18   35:invokeinterface #133 <Method Object List.get(int)>
	//   19   40:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//   20   43:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//   21   46:astore          6
			if(l > mediaplaylistbundle.blacklistUntilMs)
	//*  22   48:lload_3         
	//*  23   49:aload           6
	//*  24   51:invokestatic    #221 <Method long DefaultHlsPlaylistTracker$MediaPlaylistBundle.access$100(DefaultHlsPlaylistTracker$MediaPlaylistBundle)>
	//*  25   54:lcmp            
	//*  26   55:ifle            74
			{
				primaryHlsUrl = mediaplaylistbundle.playlistUrl;
	//   27   58:aload_0         
	//   28   59:aload           6
	//   29   61:invokestatic    #225 <Method HlsMasterPlaylist$HlsUrl DefaultHlsPlaylistTracker$MediaPlaylistBundle.access$200(DefaultHlsPlaylistTracker$MediaPlaylistBundle)>
	//   30   64:putfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
				mediaplaylistbundle.loadPlaylist();
	//   31   67:aload           6
	//   32   69:invokevirtual   #228 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.loadPlaylist()>
				return true;
	//   33   72:iconst_1        
	//   34   73:ireturn         
			}
		}

	//   35   74:iload_1         
	//   36   75:iconst_1        
	//   37   76:iadd            
	//   38   77:istore_1        
	//*  39   78:goto            23
		return false;
	//   40   81:iconst_0        
	//   41   82:ireturn         
	}

	private void maybeSetPrimaryUrl(HlsMasterPlaylist.HlsUrl hlsurl)
	{
		if(hlsurl != primaryHlsUrl && masterPlaylist.variants.contains(((Object) (hlsurl))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//*   3    5:if_acmpeq       65
	//*   4    8:aload_0         
	//*   5    9:getfield        #103 <Field HlsMasterPlaylist masterPlaylist>
	//*   6   12:getfield        #209 <Field List HlsMasterPlaylist.variants>
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #234 <Method boolean List.contains(Object)>
	//*   9   21:ifeq            65
		{
			if(primaryUrlSnapshot != null && primaryUrlSnapshot.hasEndTag)
	//*  10   24:aload_0         
	//*  11   25:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//*  12   28:ifnull          42
	//*  13   31:aload_0         
	//*  14   32:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//*  15   35:getfield        #162 <Field boolean HlsMediaPlaylist.hasEndTag>
	//*  16   38:ifeq            42
			{
				return;
	//   17   41:return          
			} else
			{
				primaryHlsUrl = hlsurl;
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:putfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
				((MediaPlaylistBundle)playlistBundles.get(((Object) (primaryHlsUrl)))).loadPlaylist();
	//   21   47:aload_0         
	//   22   48:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   23   51:aload_0         
	//   24   52:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//   25   55:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//   26   58:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//   27   61:invokevirtual   #228 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.loadPlaylist()>
				return;
	//   28   64:return          
			}
		} else
		{
			return;
	//   29   65:return          
		}
	}

	private boolean notifyPlaylistError(HlsMasterPlaylist.HlsUrl hlsurl, boolean flag)
	{
		int j = listeners.size();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List listeners>
	//    2    4:invokeinterface #129 <Method int List.size()>
	//    3    9:istore          4
		int i = 0;
	//    4   11:iconst_0        
	//    5   12:istore_3        
		boolean flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		for(; i < j; i++)
	//*   8   16:iload_3         
	//*   9   17:iload           4
	//*  10   19:icmpge          56
			flag1 |= ((HlsPlaylistTracker.PlaylistEventListener)listeners.get(i)).onPlaylistError(hlsurl, flag) ^ true;
	//   11   22:iload           5
	//   12   24:aload_0         
	//   13   25:getfield        #63  <Field List listeners>
	//   14   28:iload_3         
	//   15   29:invokeinterface #133 <Method Object List.get(int)>
	//   16   34:checkcast       #236 <Class HlsPlaylistTracker$PlaylistEventListener>
	//   17   37:aload_1         
	//   18   38:iload_2         
	//   19   39:invokeinterface #239 <Method boolean HlsPlaylistTracker$PlaylistEventListener.onPlaylistError(HlsMasterPlaylist$HlsUrl, boolean)>
	//   20   44:iconst_1        
	//   21   45:ixor            
	//   22   46:ior             
	//   23   47:istore          5

	//   24   49:iload_3         
	//   25   50:iconst_1        
	//   26   51:iadd            
	//   27   52:istore_3        
	//*  28   53:goto            16
		return flag1;
	//   29   56:iload           5
	//   30   58:ireturn         
	}

	private void onPlaylistUpdated(HlsMasterPlaylist.HlsUrl hlsurl, HlsMediaPlaylist hlsmediaplaylist)
	{
		if(hlsurl == primaryHlsUrl)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//*   3    5:if_acmpne       48
		{
			if(primaryUrlSnapshot == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
	//*   6   12:ifnonnull       33
			{
				isLive = hlsmediaplaylist.hasEndTag ^ true;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:getfield        #162 <Field boolean HlsMediaPlaylist.hasEndTag>
	//   10   20:iconst_1        
	//   11   21:ixor            
	//   12   22:putfield        #241 <Field boolean isLive>
				initialStartTimeUs = hlsmediaplaylist.startTimeUs;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:getfield        #197 <Field long HlsMediaPlaylist.startTimeUs>
	//   16   30:putfield        #72  <Field long initialStartTimeUs>
			}
			primaryUrlSnapshot = hlsmediaplaylist;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
			primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsmediaplaylist);
	//   20   38:aload_0         
	//   21   39:getfield        #243 <Field HlsPlaylistTracker$PrimaryPlaylistListener primaryPlaylistListener>
	//   22   42:aload_2         
	//   23   43:invokeinterface #249 <Method void HlsPlaylistTracker$PrimaryPlaylistListener.onPrimaryPlaylistRefreshed(HlsMediaPlaylist)>
		}
		int j = listeners.size();
	//   24   48:aload_0         
	//   25   49:getfield        #63  <Field List listeners>
	//   26   52:invokeinterface #129 <Method int List.size()>
	//   27   57:istore          4
		for(int i = 0; i < j; i++)
	//*  28   59:iconst_0        
	//*  29   60:istore_3        
	//*  30   61:iload_3         
	//*  31   62:iload           4
	//*  32   64:icmpge          92
			((HlsPlaylistTracker.PlaylistEventListener)listeners.get(i)).onPlaylistChanged();
	//   33   67:aload_0         
	//   34   68:getfield        #63  <Field List listeners>
	//   35   71:iload_3         
	//   36   72:invokeinterface #133 <Method Object List.get(int)>
	//   37   77:checkcast       #236 <Class HlsPlaylistTracker$PlaylistEventListener>
	//   38   80:invokeinterface #252 <Method void HlsPlaylistTracker$PlaylistEventListener.onPlaylistChanged()>

	//   39   85:iload_3         
	//   40   86:iconst_1        
	//   41   87:iadd            
	//   42   88:istore_3        
	//*  43   89:goto            61
	//   44   92:return          
	}

	public void addListener(HlsPlaylistTracker.PlaylistEventListener playlisteventlistener)
	{
		listeners.add(((Object) (playlisteventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #257 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public long getInitialStartTimeUs()
	{
		return initialStartTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long initialStartTimeUs>
	//    2    4:lreturn         
	}

	public HlsMasterPlaylist getMasterPlaylist()
	{
		return masterPlaylist;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field HlsMasterPlaylist masterPlaylist>
	//    2    4:areturn         
	}

	public HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl hlsurl)
	{
		HlsMediaPlaylist hlsmediaplaylist = ((MediaPlaylistBundle)playlistBundles.get(((Object) (hlsurl)))).getPlaylistSnapshot();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field IdentityHashMap playlistBundles>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//    4    8:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//    5   11:invokevirtual   #264 <Method HlsMediaPlaylist DefaultHlsPlaylistTracker$MediaPlaylistBundle.getPlaylistSnapshot()>
	//    6   14:astore_2        
		if(hlsmediaplaylist != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          24
			maybeSetPrimaryUrl(hlsurl);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #266 <Method void maybeSetPrimaryUrl(HlsMasterPlaylist$HlsUrl)>
		return hlsmediaplaylist;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public boolean isLive()
	{
		return isLive;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field boolean isLive>
	//    2    4:ireturn         
	}

	public boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl hlsurl)
	{
		return ((MediaPlaylistBundle)playlistBundles.get(((Object) (hlsurl)))).isSnapshotValid();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field IdentityHashMap playlistBundles>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//    4    8:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//    5   11:invokevirtual   #270 <Method boolean DefaultHlsPlaylistTracker$MediaPlaylistBundle.isSnapshotValid()>
	//    6   14:ireturn         
	}

	public void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl hlsurl)
		throws IOException
	{
		((MediaPlaylistBundle)playlistBundles.get(((Object) (hlsurl)))).maybeThrowPlaylistRefreshError();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field IdentityHashMap playlistBundles>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//    4    8:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//    5   11:invokevirtual   #275 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.maybeThrowPlaylistRefreshError()>
	//    6   14:return          
	}

	public void maybeThrowPrimaryPlaylistRefreshError()
		throws IOException
	{
		if(initialPlaylistLoader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #279 <Field Loader initialPlaylistLoader>
	//*   2    4:ifnull          14
			initialPlaylistLoader.maybeThrowError();
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field Loader initialPlaylistLoader>
	//    5   11:invokevirtual   #284 <Method void Loader.maybeThrowError()>
		if(primaryHlsUrl != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//*   8   18:ifnull          29
			maybeThrowPlaylistRefreshError(primaryHlsUrl);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//   12   26:invokevirtual   #286 <Method void maybeThrowPlaylistRefreshError(HlsMasterPlaylist$HlsUrl)>
	//   13   29:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #290 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #293 <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
	{
		eventDispatcher.loadCanceled(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #297 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//    4    8:iconst_4        
	//    5    9:lload_2         
	//    6   10:lload           4
	//    7   12:aload_1         
	//    8   13:invokevirtual   #300 <Method long ParsingLoadable.bytesLoaded()>
	//    9   16:invokevirtual   #306 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
	//   10   19:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((ParsingLoadable)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #290 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #312 <Method void onLoadCompleted(ParsingLoadable, long, long)>
	//    6   11:return          
	}

	public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
	{
		HlsPlaylist hlsplaylist = (HlsPlaylist)parsingloadable.getResult();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #316 <Method Object ParsingLoadable.getResult()>
	//    2    4:checkcast       #318 <Class HlsPlaylist>
	//    3    7:astore          8
		boolean flag = hlsplaylist instanceof HlsMediaPlaylist;
	//    4    9:aload           8
	//    5   11:instanceof      #147 <Class HlsMediaPlaylist>
	//    6   14:istore          6
		Object obj;
		if(flag)
	//*   7   16:iload           6
	//*   8   18:ifeq            34
			obj = ((Object) (HlsMasterPlaylist.createSingleVariantMasterPlaylist(hlsplaylist.baseUri)));
	//    9   21:aload           8
	//   10   23:getfield        #322 <Field String HlsPlaylist.baseUri>
	//   11   26:invokestatic    #326 <Method HlsMasterPlaylist HlsMasterPlaylist.createSingleVariantMasterPlaylist(String)>
	//   12   29:astore          7
		else
	//*  13   31:goto            41
			obj = ((Object) ((HlsMasterPlaylist)hlsplaylist));
	//   14   34:aload           8
	//   15   36:checkcast       #206 <Class HlsMasterPlaylist>
	//   16   39:astore          7
		masterPlaylist = ((HlsMasterPlaylist) (obj));
	//   17   41:aload_0         
	//   18   42:aload           7
	//   19   44:putfield        #103 <Field HlsMasterPlaylist masterPlaylist>
		primaryHlsUrl = (HlsMasterPlaylist.HlsUrl)((HlsMasterPlaylist) (obj)).variants.get(0);
	//   20   47:aload_0         
	//   21   48:aload           7
	//   22   50:getfield        #209 <Field List HlsMasterPlaylist.variants>
	//   23   53:iconst_0        
	//   24   54:invokeinterface #133 <Method Object List.get(int)>
	//   25   59:checkcast       #135 <Class HlsMasterPlaylist$HlsUrl>
	//   26   62:putfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
		ArrayList arraylist = new ArrayList();
	//   27   65:new             #60  <Class ArrayList>
	//   28   68:dup             
	//   29   69:invokespecial   #61  <Method void ArrayList()>
	//   30   72:astore          9
		arraylist.addAll(((Collection) (((HlsMasterPlaylist) (obj)).variants)));
	//   31   74:aload           9
	//   32   76:aload           7
	//   33   78:getfield        #209 <Field List HlsMasterPlaylist.variants>
	//   34   81:invokevirtual   #330 <Method boolean ArrayList.addAll(Collection)>
	//   35   84:pop             
		arraylist.addAll(((Collection) (((HlsMasterPlaylist) (obj)).audios)));
	//   36   85:aload           9
	//   37   87:aload           7
	//   38   89:getfield        #333 <Field List HlsMasterPlaylist.audios>
	//   39   92:invokevirtual   #330 <Method boolean ArrayList.addAll(Collection)>
	//   40   95:pop             
		arraylist.addAll(((Collection) (((HlsMasterPlaylist) (obj)).subtitles)));
	//   41   96:aload           9
	//   42   98:aload           7
	//   43  100:getfield        #336 <Field List HlsMasterPlaylist.subtitles>
	//   44  103:invokevirtual   #330 <Method boolean ArrayList.addAll(Collection)>
	//   45  106:pop             
		createBundles(((List) (arraylist)));
	//   46  107:aload_0         
	//   47  108:aload           9
	//   48  110:invokespecial   #338 <Method void createBundles(List)>
		obj = ((Object) ((MediaPlaylistBundle)playlistBundles.get(((Object) (primaryHlsUrl)))));
	//   49  113:aload_0         
	//   50  114:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   51  117:aload_0         
	//   52  118:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//   53  121:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//   54  124:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//   55  127:astore          7
		if(flag)
	//*  56  129:iload           6
	//*  57  131:ifeq            147
			((MediaPlaylistBundle) (obj)).processLoadedPlaylist((HlsMediaPlaylist)hlsplaylist);
	//   58  134:aload           7
	//   59  136:aload           8
	//   60  138:checkcast       #147 <Class HlsMediaPlaylist>
	//   61  141:invokestatic    #342 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.access$000(DefaultHlsPlaylistTracker$MediaPlaylistBundle, HlsMediaPlaylist)>
		else
	//*  62  144:goto            152
			((MediaPlaylistBundle) (obj)).loadPlaylist();
	//   63  147:aload           7
	//   64  149:invokevirtual   #228 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.loadPlaylist()>
		eventDispatcher.loadCompleted(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
	//   65  152:aload_0         
	//   66  153:getfield        #113 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   67  156:aload_1         
	//   68  157:getfield        #297 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//   69  160:iconst_4        
	//   70  161:lload_2         
	//   71  162:lload           4
	//   72  164:aload_1         
	//   73  165:invokevirtual   #300 <Method long ParsingLoadable.bytesLoaded()>
	//   74  168:invokevirtual   #345 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
	//   75  171:return          
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #290 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #351 <Method int onLoadError(ParsingLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
	{
		boolean flag = ioexception instanceof ParserException;
	//    0    0:aload           6
	//    1    2:instanceof      #353 <Class ParserException>
	//    2    5:istore          7
		eventDispatcher.loadError(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded(), ioexception, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:aload_1         
	//    6   12:getfield        #297 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//    7   15:iconst_4        
	//    8   16:lload_2         
	//    9   17:lload           4
	//   10   19:aload_1         
	//   11   20:invokevirtual   #300 <Method long ParsingLoadable.bytesLoaded()>
	//   12   23:aload           6
	//   13   25:iload           7
	//   14   27:invokevirtual   #357 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long, IOException, boolean)>
		return !flag ? 0 : 3;
	//   15   30:iload           7
	//   16   32:ifeq            37
	//   17   35:iconst_3        
	//   18   36:ireturn         
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public void refreshPlaylist(HlsMasterPlaylist.HlsUrl hlsurl)
	{
		((MediaPlaylistBundle)playlistBundles.get(((Object) (hlsurl)))).loadPlaylist();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field IdentityHashMap playlistBundles>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method Object IdentityHashMap.get(Object)>
	//    4    8:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//    5   11:invokevirtual   #228 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.loadPlaylist()>
	//    6   14:return          
	}

	public void removeListener(HlsPlaylistTracker.PlaylistEventListener playlisteventlistener)
	{
		listeners.remove(((Object) (playlisteventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #363 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void start(Uri uri, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryplaylistlistener)
	{
		playlistRefreshHandler = new Handler();
	//    0    0:aload_0         
	//    1    1:new             #367 <Class Handler>
	//    2    4:dup             
	//    3    5:invokespecial   #368 <Method void Handler()>
	//    4    8:putfield        #109 <Field Handler playlistRefreshHandler>
		eventDispatcher = eventdispatcher;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #113 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		primaryPlaylistListener = primaryplaylistlistener;
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:putfield        #243 <Field HlsPlaylistTracker$PrimaryPlaylistListener primaryPlaylistListener>
		uri = ((Uri) (new ParsingLoadable(dataSourceFactory.createDataSource(4), uri, 4, playlistParser)));
	//   11   21:new             #290 <Class ParsingLoadable>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field HlsDataSourceFactory dataSourceFactory>
	//   15   29:iconst_4        
	//   16   30:invokeinterface #374 <Method com.google.android.exoplayer2.upstream.DataSource HlsDataSourceFactory.createDataSource(int)>
	//   17   35:aload_1         
	//   18   36:iconst_4        
	//   19   37:aload_0         
	//   20   38:getfield        #58  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
	//   21   41:invokespecial   #377 <Method void ParsingLoadable(com.google.android.exoplayer2.upstream.DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   22   44:astore_1        
		boolean flag;
		if(initialPlaylistLoader == null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #279 <Field Loader initialPlaylistLoader>
	//*  25   49:ifnonnull       58
			flag = true;
	//   26   52:iconst_1        
	//   27   53:istore          4
		else
	//*  28   55:goto            61
			flag = false;
	//   29   58:iconst_0        
	//   30   59:istore          4
		Assertions.checkState(flag);
	//   31   61:iload           4
	//   32   63:invokestatic    #383 <Method void Assertions.checkState(boolean)>
		initialPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
	//   33   66:aload_0         
	//   34   67:new             #281 <Class Loader>
	//   35   70:dup             
	//   36   71:ldc2            #385 <String "DefaultHlsPlaylistTracker:MasterPlaylist">
	//   37   74:invokespecial   #388 <Method void Loader(String)>
	//   38   77:putfield        #279 <Field Loader initialPlaylistLoader>
		long l = initialPlaylistLoader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (uri)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minRetryCount);
	//   39   80:aload_0         
	//   40   81:getfield        #279 <Field Loader initialPlaylistLoader>
	//   41   84:aload_1         
	//   42   85:aload_0         
	//   43   86:aload_0         
	//   44   87:getfield        #56  <Field int minRetryCount>
	//   45   90:invokevirtual   #392 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   46   93:lstore          5
		eventdispatcher.loadStarted(((ParsingLoadable) (uri)).dataSpec, ((ParsingLoadable) (uri)).type, l);
	//   47   95:aload_2         
	//   48   96:aload_1         
	//   49   97:getfield        #297 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//   50  100:aload_1         
	//   51  101:getfield        #395 <Field int ParsingLoadable.type>
	//   52  104:lload           5
	//   53  106:invokevirtual   #399 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(com.google.android.exoplayer2.upstream.DataSpec, int, long)>
	//   54  109:return          
	}

	public void stop()
	{
		primaryHlsUrl = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
		primaryUrlSnapshot = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #186 <Field HlsMediaPlaylist primaryUrlSnapshot>
		masterPlaylist = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #103 <Field HlsMasterPlaylist masterPlaylist>
		initialStartTimeUs = 0x1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #69  <Long 0x1L>
	//   11   19:putfield        #72  <Field long initialStartTimeUs>
		initialPlaylistLoader.release();
	//   12   22:aload_0         
	//   13   23:getfield        #279 <Field Loader initialPlaylistLoader>
	//   14   26:invokevirtual   #403 <Method void Loader.release()>
		initialPlaylistLoader = null;
	//   15   29:aload_0         
	//   16   30:aconst_null     
	//   17   31:putfield        #279 <Field Loader initialPlaylistLoader>
		for(Iterator iterator = playlistBundles.values().iterator(); iterator.hasNext(); ((MediaPlaylistBundle)iterator.next()).release());
	//   18   34:aload_0         
	//   19   35:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   20   38:invokevirtual   #407 <Method Collection IdentityHashMap.values()>
	//   21   41:invokeinterface #413 <Method Iterator Collection.iterator()>
	//   22   46:astore_1        
	//   23   47:aload_1         
	//   24   48:invokeinterface #418 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            71
	//   26   56:aload_1         
	//   27   57:invokeinterface #421 <Method Object Iterator.next()>
	//   28   62:checkcast       #11  <Class DefaultHlsPlaylistTracker$MediaPlaylistBundle>
	//   29   65:invokevirtual   #422 <Method void DefaultHlsPlaylistTracker$MediaPlaylistBundle.release()>
	//*  30   68:goto            47
		playlistRefreshHandler.removeCallbacksAndMessages(((Object) (null)));
	//   31   71:aload_0         
	//   32   72:getfield        #109 <Field Handler playlistRefreshHandler>
	//   33   75:aconst_null     
	//   34   76:invokevirtual   #426 <Method void Handler.removeCallbacksAndMessages(Object)>
		playlistRefreshHandler = null;
	//   35   79:aload_0         
	//   36   80:aconst_null     
	//   37   81:putfield        #109 <Field Handler playlistRefreshHandler>
		playlistBundles.clear();
	//   38   84:aload_0         
	//   39   85:getfield        #68  <Field IdentityHashMap playlistBundles>
	//   40   88:invokevirtual   #429 <Method void IdentityHashMap.clear()>
	//   41   91:return          
	}

	private static final double PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5D;
	private final HlsDataSourceFactory dataSourceFactory;
	private com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private Loader initialPlaylistLoader;
	private long initialStartTimeUs;
	private boolean isLive;
	private final List listeners = new ArrayList();
	private HlsMasterPlaylist masterPlaylist;
	private final int minRetryCount;
	private final IdentityHashMap playlistBundles = new IdentityHashMap();
	private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser playlistParser;
	private Handler playlistRefreshHandler;
	private HlsMasterPlaylist.HlsUrl primaryHlsUrl;
	private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;
	private HlsMediaPlaylist primaryUrlSnapshot;


/*
	static HlsMediaPlaylist access$1000(DefaultHlsPlaylistTracker defaulthlsplaylisttracker, HlsMediaPlaylist hlsmediaplaylist, HlsMediaPlaylist hlsmediaplaylist1)
	{
		return defaulthlsplaylisttracker.getLatestPlaylistSnapshot(hlsmediaplaylist, hlsmediaplaylist1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #81  <Method HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist, HlsMediaPlaylist)>
	//    4    6:areturn         
	}

*/


/*
	static void access$1100(DefaultHlsPlaylistTracker defaulthlsplaylisttracker, HlsMasterPlaylist.HlsUrl hlsurl, HlsMediaPlaylist hlsmediaplaylist)
	{
		defaulthlsplaylisttracker.onPlaylistUpdated(hlsurl, hlsmediaplaylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void onPlaylistUpdated(HlsMasterPlaylist$HlsUrl, HlsMediaPlaylist)>
		return;
	//    4    6:return          
	}

*/


/*
	static HlsMasterPlaylist.HlsUrl access$1200(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.primaryHlsUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field HlsMasterPlaylist$HlsUrl primaryHlsUrl>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1300(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.maybeSelectNewPrimaryUrl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method boolean maybeSelectNewPrimaryUrl()>
	//    2    4:ireturn         
	}

*/


/*
	static HlsDataSourceFactory access$300(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.dataSourceFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field HlsDataSourceFactory dataSourceFactory>
	//    2    4:areturn         
	}

*/


/*
	static HlsMasterPlaylist access$400(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.masterPlaylist;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field HlsMasterPlaylist masterPlaylist>
	//    2    4:areturn         
	}

*/


/*
	static com.google.android.exoplayer2.upstream.ParsingLoadable.Parser access$500(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.playlistParser;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$600(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.playlistRefreshHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler playlistRefreshHandler>
	//    2    4:areturn         
	}

*/


/*
	static com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$700(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.eventDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$800(DefaultHlsPlaylistTracker defaulthlsplaylisttracker, HlsMasterPlaylist.HlsUrl hlsurl, boolean flag)
	{
		return defaulthlsplaylisttracker.notifyPlaylistError(hlsurl, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #119 <Method boolean notifyPlaylistError(HlsMasterPlaylist$HlsUrl, boolean)>
	//    4    6:ireturn         
	}

*/


/*
	static int access$900(DefaultHlsPlaylistTracker defaulthlsplaylisttracker)
	{
		return defaulthlsplaylisttracker.minRetryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int minRetryCount>
	//    2    4:ireturn         
	}

*/
}
