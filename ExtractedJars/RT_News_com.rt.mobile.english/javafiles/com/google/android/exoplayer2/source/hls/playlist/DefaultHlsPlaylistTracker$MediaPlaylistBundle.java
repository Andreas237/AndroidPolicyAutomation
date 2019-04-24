// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			DefaultHlsPlaylistTracker, HlsMasterPlaylist, HlsMediaPlaylist, HlsPlaylist

private final class DefaultHlsPlaylistTracker$MediaPlaylistBundle
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
		return DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker.this) == playlistUrl && !DefaultHlsPlaylistTracker.access$1300(DefaultHlsPlaylistTracker.this);
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
		long l = mediaPlaylistLoader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (mediaPlaylistLoadable)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), DefaultHlsPlaylistTracker.access$900(DefaultHlsPlaylistTracker.this));
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
		DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadStarted(mediaPlaylistLoadable.dataSpec, mediaPlaylistLoadable.type, l);
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
		playlistSnapshot = DefaultHlsPlaylistTracker.access$1000(DefaultHlsPlaylistTracker.this, hlsmediaplaylist1, hlsmediaplaylist);
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
			DefaultHlsPlaylistTracker.access$1100(DefaultHlsPlaylistTracker.this, playlistUrl, playlistSnapshot);
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
				DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this, playlistUrl, false);
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
				DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this, playlistUrl, true);
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
		if(playlistUrl == DefaultHlsPlaylistTracker.access$1200(DefaultHlsPlaylistTracker.this) && !playlistSnapshot.hasEndTag)
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
				DefaultHlsPlaylistTracker.access$600(DefaultHlsPlaylistTracker.this).postDelayed(((Runnable) (this)), earliestNextLoadTimeMs - l);
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
		DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadCanceled(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
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
			DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadCompleted(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded());
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
		DefaultHlsPlaylistTracker.access$700(DefaultHlsPlaylistTracker.this).loadError(parsingloadable.dataSpec, 4, l, l1, parsingloadable.bytesLoaded(), ioexception, flag2);
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
		if(!DefaultHlsPlaylistTracker.access$800(DefaultHlsPlaylistTracker.this, playlistUrl, flag3) && flag3)
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
	static void access$000(DefaultHlsPlaylistTracker$MediaPlaylistBundle defaulthlsplaylisttracker$mediaplaylistbundle, HlsMediaPlaylist hlsmediaplaylist)
	{
		defaulthlsplaylisttracker$mediaplaylistbundle.processLoadedPlaylist(hlsmediaplaylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method void processLoadedPlaylist(HlsMediaPlaylist)>
		return;
	//    3    5:return          
	}

*/


/*
	static long access$100(DefaultHlsPlaylistTracker$MediaPlaylistBundle defaulthlsplaylisttracker$mediaplaylistbundle)
	{
		return defaulthlsplaylisttracker$mediaplaylistbundle.blacklistUntilMs;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field long blacklistUntilMs>
	//    2    4:lreturn         
	}

*/


/*
	static HlsMasterPlaylist.HlsUrl access$200(DefaultHlsPlaylistTracker$MediaPlaylistBundle defaulthlsplaylisttracker$mediaplaylistbundle)
	{
		return defaulthlsplaylisttracker$mediaplaylistbundle.playlistUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field HlsMasterPlaylist$HlsUrl playlistUrl>
	//    2    4:areturn         
	}

*/

	public DefaultHlsPlaylistTracker$MediaPlaylistBundle(HlsMasterPlaylist.HlsUrl hlsurl)
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
		mediaPlaylistLoadable = new ParsingLoadable(DefaultHlsPlaylistTracker.access$300(DefaultHlsPlaylistTracker.this).createDataSource(4), UriUtil.resolveToUri(DefaultHlsPlaylistTracker.access$400(DefaultHlsPlaylistTracker.this).baseUri, hlsurl.url), 4, DefaultHlsPlaylistTracker.access$500(DefaultHlsPlaylistTracker.this));
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
	//   26   53:invokestatic    #83  <Method android.net.Uri UriUtil.resolveToUri(String, String)>
	//   27   56:iconst_4        
	//   28   57:aload_1         
	//   29   58:invokestatic    #87  <Method com.google.android.exoplayer2.upstream.ParsingLoadable$Parser DefaultHlsPlaylistTracker.access$500(DefaultHlsPlaylistTracker)>
	//   30   61:invokespecial   #90  <Method void ParsingLoadable(com.google.android.exoplayer2.upstream.DataSource, android.net.Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   31   64:putfield        #92  <Field ParsingLoadable mediaPlaylistLoadable>
	//   32   67:return          
	}
}
