// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.chunk.*;
import com.google.android.exoplayer.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer.extractor.ts.TsExtractor;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsPlaylist, HlsPlaylistParser, HlsMasterPlaylist, Variant, 
//			HlsMediaPlaylist, TsChunk, HlsExtractorWrapper, PtsTimestampAdjusterProvider, 
//			WebvttExtractor, HlsTrackSelector

public class HlsChunkSource
	implements HlsTrackSelector.Output
{
	private static final class EncryptionKeyChunk extends DataChunk
	{

		protected void consume(byte abyte0[], int i)
			throws IOException
		{
			result = Arrays.copyOf(abyte0, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #33  <Method byte[] Arrays.copyOf(byte[], int)>
		//    4    6:putfield        #35  <Field byte[] result>
		//    5    9:return          
		}

		public byte[] getResult()
		{
			return result;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field byte[] result>
		//    2    4:areturn         
		}

		public final String iv;
		private byte result[];
		public final int variantIndex;

		public EncryptionKeyChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], String s, int i)
		{
			super(datasource, dataspec, 3, 0, ((Format) (null)), -1, abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_3        
		//    4    4:iconst_0        
		//    5    5:aconst_null     
		//    6    6:iconst_m1       
		//    7    7:aload_3         
		//    8    8:invokespecial   #18  <Method void DataChunk(DataSource, DataSpec, int, int, Format, int, byte[])>
			iv = s;
		//    9   11:aload_0         
		//   10   12:aload           4
		//   11   14:putfield        #20  <Field String iv>
			variantIndex = i;
		//   12   17:aload_0         
		//   13   18:iload           5
		//   14   20:putfield        #22  <Field int variantIndex>
		//   15   23:return          
		}
	}

	public static interface EventListener
	{

		public abstract void onMediaPlaylistLoadCompleted(byte abyte0[]);
	}

	private static final class ExposedTrack
	{

		private final int adaptiveMaxHeight;
		private final int adaptiveMaxWidth;
		private final int defaultVariantIndex;
		private final Variant variants[];


/*
		static Variant[] access$000(ExposedTrack exposedtrack)
		{
			return exposedtrack.variants;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Variant[] variants>
		//    2    4:areturn         
		}

*/


/*
		static int access$100(ExposedTrack exposedtrack)
		{
			return exposedtrack.defaultVariantIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int defaultVariantIndex>
		//    2    4:ireturn         
		}

*/


/*
		static int access$200(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveMaxWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int adaptiveMaxWidth>
		//    2    4:ireturn         
		}

*/


/*
		static int access$300(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveMaxHeight;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int adaptiveMaxHeight>
		//    2    4:ireturn         
		}

*/

		public ExposedTrack(Variant variant)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			variants = (new Variant[] {
				variant
			});
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:anewarray       Variant[]
		//    5    9:dup             
		//    6   10:iconst_0        
		//    7   11:aload_1         
		//    8   12:aastore         
		//    9   13:putfield        #22  <Field Variant[] variants>
			defaultVariantIndex = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #24  <Field int defaultVariantIndex>
			adaptiveMaxWidth = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #26  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #28  <Field int adaptiveMaxHeight>
		//   19   31:return          
		}

		public ExposedTrack(Variant avariant[], int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			variants = avariant;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Variant[] variants>
			defaultVariantIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int defaultVariantIndex>
			adaptiveMaxWidth = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #28  <Field int adaptiveMaxHeight>
		//   14   25:return          
		}
	}

	private static final class MediaPlaylistChunk extends DataChunk
	{

		protected void consume(byte abyte0[], int i)
			throws IOException
		{
			rawResponse = Arrays.copyOf(abyte0, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #39  <Method byte[] Arrays.copyOf(byte[], int)>
		//    4    6:putfield        #41  <Field byte[] rawResponse>
			result = (HlsMediaPlaylist)playlistParser.parse(playlistUrl, ((java.io.InputStream) (new ByteArrayInputStream(rawResponse))));
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #26  <Field HlsPlaylistParser playlistParser>
		//    8   14:aload_0         
		//    9   15:getfield        #28  <Field String playlistUrl>
		//   10   18:new             #43  <Class ByteArrayInputStream>
		//   11   21:dup             
		//   12   22:aload_0         
		//   13   23:getfield        #41  <Field byte[] rawResponse>
		//   14   26:invokespecial   #46  <Method void ByteArrayInputStream(byte[])>
		//   15   29:invokevirtual   #52  <Method HlsPlaylist HlsPlaylistParser.parse(String, java.io.InputStream)>
		//   16   32:checkcast       #54  <Class HlsMediaPlaylist>
		//   17   35:putfield        #56  <Field HlsMediaPlaylist result>
		//   18   38:return          
		}

		public byte[] getRawResponse()
		{
			return rawResponse;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field byte[] rawResponse>
		//    2    4:areturn         
		}

		public HlsMediaPlaylist getResult()
		{
			return result;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field HlsMediaPlaylist result>
		//    2    4:areturn         
		}

		private final HlsPlaylistParser playlistParser;
		private final String playlistUrl;
		private byte rawResponse[];
		private HlsMediaPlaylist result;
		public final int variantIndex;

		public MediaPlaylistChunk(DataSource datasource, DataSpec dataspec, byte abyte0[], HlsPlaylistParser hlsplaylistparser, int i, String s)
		{
			super(datasource, dataspec, 4, 0, ((Format) (null)), -1, abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_4        
		//    4    4:iconst_0        
		//    5    5:aconst_null     
		//    6    6:iconst_m1       
		//    7    7:aload_3         
		//    8    8:invokespecial   #22  <Method void DataChunk(DataSource, DataSpec, int, int, Format, int, byte[])>
			variantIndex = i;
		//    9   11:aload_0         
		//   10   12:iload           5
		//   11   14:putfield        #24  <Field int variantIndex>
			playlistParser = hlsplaylistparser;
		//   12   17:aload_0         
		//   13   18:aload           4
		//   14   20:putfield        #26  <Field HlsPlaylistParser playlistParser>
			playlistUrl = s;
		//   15   23:aload_0         
		//   16   24:aload           6
		//   17   26:putfield        #28  <Field String playlistUrl>
		//   18   29:return          
		}
	}


	public HlsChunkSource(boolean flag, DataSource datasource, HlsPlaylist hlsplaylist, HlsTrackSelector hlstrackselector, BandwidthMeter bandwidthmeter, PtsTimestampAdjusterProvider ptstimestampadjusterprovider)
	{
		this(flag, datasource, hlsplaylist, hlstrackselector, bandwidthmeter, ptstimestampadjusterprovider, 5000L, 20000L, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:ldc2w           #35  <Long 5000L>
	//    8   13:ldc2w           #32  <Long 20000L>
	//    9   16:aconst_null     
	//   10   17:aconst_null     
	//   11   18:invokespecial   #106 <Method void HlsChunkSource(boolean, DataSource, HlsPlaylist, HlsTrackSelector, BandwidthMeter, PtsTimestampAdjusterProvider, long, long, Handler, HlsChunkSource$EventListener)>
	//   12   21:return          
	}

	public HlsChunkSource(boolean flag, DataSource datasource, HlsPlaylist hlsplaylist, HlsTrackSelector hlstrackselector, BandwidthMeter bandwidthmeter, PtsTimestampAdjusterProvider ptstimestampadjusterprovider, long l, long l1)
	{
		this(flag, datasource, hlsplaylist, hlstrackselector, bandwidthmeter, ptstimestampadjusterprovider, l, l1, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:lload           7
	//    8   12:lload           9
	//    9   14:aconst_null     
	//   10   15:aconst_null     
	//   11   16:invokespecial   #106 <Method void HlsChunkSource(boolean, DataSource, HlsPlaylist, HlsTrackSelector, BandwidthMeter, PtsTimestampAdjusterProvider, long, long, Handler, HlsChunkSource$EventListener)>
	//   12   19:return          
	}

	public HlsChunkSource(boolean flag, DataSource datasource, HlsPlaylist hlsplaylist, HlsTrackSelector hlstrackselector, BandwidthMeter bandwidthmeter, PtsTimestampAdjusterProvider ptstimestampadjusterprovider, long l, long l1, Handler handler, EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void Object()>
		isMaster = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #113 <Field boolean isMaster>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #115 <Field DataSource dataSource>
		trackSelector = hlstrackselector;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #117 <Field HlsTrackSelector trackSelector>
		bandwidthMeter = bandwidthmeter;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #119 <Field BandwidthMeter bandwidthMeter>
		timestampAdjusterProvider = ptstimestampadjusterprovider;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #121 <Field PtsTimestampAdjusterProvider timestampAdjusterProvider>
		eventListener = eventlistener;
	//   17   32:aload_0         
	//   18   33:aload           12
	//   19   35:putfield        #123 <Field HlsChunkSource$EventListener eventListener>
		eventHandler = handler;
	//   20   38:aload_0         
	//   21   39:aload           11
	//   22   41:putfield        #125 <Field Handler eventHandler>
		minBufferDurationToSwitchUpUs = l * 1000L;
	//   23   44:aload_0         
	//   24   45:lload           7
	//   25   47:ldc2w           #126 <Long 1000L>
	//   26   50:lmul            
	//   27   51:putfield        #129 <Field long minBufferDurationToSwitchUpUs>
		maxBufferDurationToSwitchDownUs = 1000L * l1;
	//   28   54:aload_0         
	//   29   55:ldc2w           #126 <Long 1000L>
	//   30   58:lload           9
	//   31   60:lmul            
	//   32   61:putfield        #131 <Field long maxBufferDurationToSwitchDownUs>
		baseUri = hlsplaylist.baseUri;
	//   33   64:aload_0         
	//   34   65:aload_3         
	//   35   66:getfield        #135 <Field String HlsPlaylist.baseUri>
	//   36   69:putfield        #136 <Field String baseUri>
		playlistParser = new HlsPlaylistParser();
	//   37   72:aload_0         
	//   38   73:new             #138 <Class HlsPlaylistParser>
	//   39   76:dup             
	//   40   77:invokespecial   #139 <Method void HlsPlaylistParser()>
	//   41   80:putfield        #141 <Field HlsPlaylistParser playlistParser>
		tracks = new ArrayList();
	//   42   83:aload_0         
	//   43   84:new             #143 <Class ArrayList>
	//   44   87:dup             
	//   45   88:invokespecial   #144 <Method void ArrayList()>
	//   46   91:putfield        #146 <Field ArrayList tracks>
		if(hlsplaylist.type == 0)
	//*  47   94:aload_3         
	//*  48   95:getfield        #149 <Field int HlsPlaylist.type>
	//*  49   98:ifne            110
		{
			masterPlaylist = (HlsMasterPlaylist)hlsplaylist;
	//   50  101:aload_0         
	//   51  102:aload_3         
	//   52  103:checkcast       #151 <Class HlsMasterPlaylist>
	//   53  106:putfield        #153 <Field HlsMasterPlaylist masterPlaylist>
			return;
	//   54  109:return          
		} else
		{
			datasource = ((DataSource) (new Format("0", "application/x-mpegURL", -1, -1, -1F, -1, -1, -1, ((String) (null)), ((String) (null)))));
	//   55  110:new             #155 <Class Format>
	//   56  113:dup             
	//   57  114:ldc1            #157 <String "0">
	//   58  116:ldc1            #159 <String "application/x-mpegURL">
	//   59  118:iconst_m1       
	//   60  119:iconst_m1       
	//   61  120:ldc1            #160 <Float -1F>
	//   62  122:iconst_m1       
	//   63  123:iconst_m1       
	//   64  124:iconst_m1       
	//   65  125:aconst_null     
	//   66  126:aconst_null     
	//   67  127:invokespecial   #163 <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//   68  130:astore_2        
			hlsplaylist = ((HlsPlaylist) (new ArrayList()));
	//   69  131:new             #143 <Class ArrayList>
	//   70  134:dup             
	//   71  135:invokespecial   #144 <Method void ArrayList()>
	//   72  138:astore_3        
			((List) (hlsplaylist)).add(((Object) (new Variant(baseUri, ((Format) (datasource))))));
	//   73  139:aload_3         
	//   74  140:new             #165 <Class Variant>
	//   75  143:dup             
	//   76  144:aload_0         
	//   77  145:getfield        #136 <Field String baseUri>
	//   78  148:aload_2         
	//   79  149:invokespecial   #168 <Method void Variant(String, Format)>
	//   80  152:invokeinterface #174 <Method boolean List.add(Object)>
	//   81  157:pop             
			masterPlaylist = new HlsMasterPlaylist(baseUri, ((List) (hlsplaylist)), Collections.emptyList(), Collections.emptyList(), ((String) (null)), ((String) (null)));
	//   82  158:aload_0         
	//   83  159:new             #151 <Class HlsMasterPlaylist>
	//   84  162:dup             
	//   85  163:aload_0         
	//   86  164:getfield        #136 <Field String baseUri>
	//   87  167:aload_3         
	//   88  168:invokestatic    #180 <Method List Collections.emptyList()>
	//   89  171:invokestatic    #180 <Method List Collections.emptyList()>
	//   90  174:aconst_null     
	//   91  175:aconst_null     
	//   92  176:invokespecial   #183 <Method void HlsMasterPlaylist(String, List, List, List, String, String)>
	//   93  179:putfield        #153 <Field HlsMasterPlaylist masterPlaylist>
			return;
	//   94  182:return          
		}
	}

	private boolean allVariantsBlacklisted()
	{
		long al[] = variantBlacklistTimes;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field long[] variantBlacklistTimes>
	//    2    4:astore_3        
		int j = al.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          32
			if(al[i] == 0L)
	//*  11   15:aload_3         
	//*  12   16:iload_1         
	//*  13   17:laload          
	//*  14   18:lconst_0        
	//*  15   19:lcmp            
	//*  16   20:ifne            25
				return false;
	//   17   23:iconst_0        
	//   18   24:ireturn         

	//   19   25:iload_1         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_1        
	//*  23   29:goto            10
		return true;
	//   24   32:iconst_1        
	//   25   33:ireturn         
	}

	private void clearEncryptionData()
	{
		encryptionKeyUri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #192 <Field Uri encryptionKeyUri>
		encryptionKey = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #194 <Field byte[] encryptionKey>
		encryptionIvString = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #196 <Field String encryptionIvString>
		encryptionIv = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #198 <Field byte[] encryptionIv>
	//   12   20:return          
	}

	private void clearStaleBlacklistedVariants()
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #205 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_2        
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		do
		{
			long al[] = variantBlacklistTimes;
	//    4    6:aload_0         
	//    5    7:getfield        #189 <Field long[] variantBlacklistTimes>
	//    6   10:astore          4
			if(i < al.length)
	//*   7   12:iload_1         
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:icmpge          53
			{
				if(al[i] != 0L && l - al[i] > 60000L)
	//*  11   19:aload           4
	//*  12   21:iload_1         
	//*  13   22:laload          
	//*  14   23:lconst_0        
	//*  15   24:lcmp            
	//*  16   25:ifeq            46
	//*  17   28:lload_2         
	//*  18   29:aload           4
	//*  19   31:iload_1         
	//*  20   32:laload          
	//*  21   33:lsub            
	//*  22   34:ldc2w           #38  <Long 60000L>
	//*  23   37:lcmp            
	//*  24   38:ifle            46
					al[i] = 0L;
	//   25   41:aload           4
	//   26   43:iload_1         
	//   27   44:lconst_0        
	//   28   45:lastore         
				i++;
	//   29   46:iload_1         
	//   30   47:iconst_1        
	//   31   48:iadd            
	//   32   49:istore_1        
			} else
	//*  33   50:goto            6
			{
				return;
	//   34   53:return          
			}
		} while(true);
	}

	private int getLiveNextChunkSequenceNumber(int i, int j, int k)
	{
		if(j == k)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpne          9
			return i + 1;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:ireturn         
		HlsMediaPlaylist ahlsmediaplaylist[] = variantPlaylists;
	//    7    9:aload_0         
	//    8   10:getfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
	//    9   13:astore          9
		HlsMediaPlaylist hlsmediaplaylist = ahlsmediaplaylist[j];
	//   10   15:aload           9
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          8
		HlsMediaPlaylist hlsmediaplaylist1 = ahlsmediaplaylist[k];
	//   14   21:aload           9
	//   15   23:iload_3         
	//   16   24:aaload          
	//   17   25:astore          9
		if(i < hlsmediaplaylist.mediaSequence)
	//*  18   27:iload_1         
	//*  19   28:aload           8
	//*  20   30:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//*  21   33:icmpge          44
			return hlsmediaplaylist1.mediaSequence - 1;
	//   22   36:aload           9
	//   23   38:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   24   41:iconst_1        
	//   25   42:isub            
	//   26   43:ireturn         
		i -= hlsmediaplaylist.mediaSequence;
	//   27   44:iload_1         
	//   28   45:aload           8
	//   29   47:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   30   50:isub            
	//   31   51:istore_1        
		double d = 0.0D;
	//   32   52:dconst_0        
	//   33   53:dstore          4
		for(; i < hlsmediaplaylist.segments.size(); i++)
	//*  34   55:iload_1         
	//*  35   56:aload           8
	//*  36   58:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//*  37   61:invokeinterface #222 <Method int List.size()>
	//*  38   66:icmpge          98
			d += ((HlsMediaPlaylist.Segment)hlsmediaplaylist.segments.get(i)).durationSecs;
	//   39   69:dload           4
	//   40   71:aload           8
	//   41   73:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//   42   76:iload_1         
	//   43   77:invokeinterface #226 <Method Object List.get(int)>
	//   44   82:checkcast       #228 <Class HlsMediaPlaylist$Segment>
	//   45   85:getfield        #231 <Field double HlsMediaPlaylist$Segment.durationSecs>
	//   46   88:dadd            
	//   47   89:dstore          4

	//   48   91:iload_1         
	//   49   92:iconst_1        
	//   50   93:iadd            
	//   51   94:istore_1        
	//*  52   95:goto            55
		long l = SystemClock.elapsedRealtime();
	//   53   98:invokestatic    #205 <Method long SystemClock.elapsedRealtime()>
	//   54  101:lstore          6
		long al[] = variantLastPlaylistLoadTimesMs;
	//   55  103:aload_0         
	//   56  104:getfield        #233 <Field long[] variantLastPlaylistLoadTimesMs>
	//   57  107:astore          8
		d = (d + (double)(l - al[j]) / 1000D + 2D) - (double)(l - al[k]) / 1000D;
	//   58  109:dload           4
	//   59  111:lload           6
	//   60  113:aload           8
	//   61  115:iload_2         
	//   62  116:laload          
	//   63  117:lsub            
	//   64  118:l2d             
	//   65  119:ldc2w           #234 <Double 1000D>
	//   66  122:ddiv            
	//   67  123:dadd            
	//   68  124:ldc2w           #42  <Double 2D>
	//   69  127:dadd            
	//   70  128:lload           6
	//   71  130:aload           8
	//   72  132:iload_3         
	//   73  133:laload          
	//   74  134:lsub            
	//   75  135:l2d             
	//   76  136:ldc2w           #234 <Double 1000D>
	//   77  139:ddiv            
	//   78  140:dsub            
	//   79  141:dstore          4
		if(d < 0.0D)
	//*  80  143:dload           4
	//*  81  145:dconst_0        
	//*  82  146:dcmpg           
	//*  83  147:ifge            169
			return hlsmediaplaylist1.mediaSequence + hlsmediaplaylist1.segments.size() + 1;
	//   84  150:aload           9
	//   85  152:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   86  155:aload           9
	//   87  157:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//   88  160:invokeinterface #222 <Method int List.size()>
	//   89  165:iadd            
	//   90  166:iconst_1        
	//   91  167:iadd            
	//   92  168:ireturn         
		for(i = hlsmediaplaylist1.segments.size() - 1; i >= 0; i--)
	//*  93  169:aload           9
	//*  94  171:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//*  95  174:invokeinterface #222 <Method int List.size()>
	//*  96  179:iconst_1        
	//*  97  180:isub            
	//*  98  181:istore_1        
	//*  99  182:iload_1         
	//* 100  183:iflt            230
		{
			d -= ((HlsMediaPlaylist.Segment)hlsmediaplaylist1.segments.get(i)).durationSecs;
	//  101  186:dload           4
	//  102  188:aload           9
	//  103  190:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//  104  193:iload_1         
	//  105  194:invokeinterface #226 <Method Object List.get(int)>
	//  106  199:checkcast       #228 <Class HlsMediaPlaylist$Segment>
	//  107  202:getfield        #231 <Field double HlsMediaPlaylist$Segment.durationSecs>
	//  108  205:dsub            
	//  109  206:dstore          4
			if(d < 0.0D)
	//* 110  208:dload           4
	//* 111  210:dconst_0        
	//* 112  211:dcmpg           
	//* 113  212:ifge            223
				return hlsmediaplaylist1.mediaSequence + i;
	//  114  215:aload           9
	//  115  217:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//  116  220:iload_1         
	//  117  221:iadd            
	//  118  222:ireturn         
		}

	//  119  223:iload_1         
	//  120  224:iconst_1        
	//  121  225:isub            
	//  122  226:istore_1        
	//* 123  227:goto            182
		return hlsmediaplaylist1.mediaSequence - 1;
	//  124  230:aload           9
	//  125  232:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//  126  235:iconst_1        
	//  127  236:isub            
	//  128  237:ireturn         
	}

	private int getLiveStartChunkSequenceNumber(int i)
	{
		HlsMediaPlaylist hlsmediaplaylist = variantPlaylists[i];
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_2        
		if(hlsmediaplaylist.segments.size() > 3)
	//*   5    7:aload_2         
	//*   6    8:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//*   7   11:invokeinterface #222 <Method int List.size()>
	//*   8   16:iconst_3        
	//*   9   17:icmple          35
			i = hlsmediaplaylist.segments.size() - 3;
	//   10   20:aload_2         
	//   11   21:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//   12   24:invokeinterface #222 <Method int List.size()>
	//   13   29:iconst_3        
	//   14   30:isub            
	//   15   31:istore_1        
		else
	//*  16   32:goto            37
			i = 0;
	//   17   35:iconst_0        
	//   18   36:istore_1        
		return i + hlsmediaplaylist.mediaSequence;
	//   19   37:iload_1         
	//   20   38:aload_2         
	//   21   39:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   22   42:iadd            
	//   23   43:ireturn         
	}

	private int getNextVariantIndex(TsChunk tschunk, long l)
	{
		clearStaleBlacklistedVariants();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void clearStaleBlacklistedVariants()>
		long l1 = bandwidthMeter.getBitrateEstimate();
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field BandwidthMeter bandwidthMeter>
	//    4    8:invokeinterface #246 <Method long BandwidthMeter.getBitrateEstimate()>
	//    5   13:lstore          6
		long al[] = variantBlacklistTimes;
	//    6   15:aload_0         
	//    7   16:getfield        #189 <Field long[] variantBlacklistTimes>
	//    8   19:astore          8
		int i = selectedVariantIndex;
	//    9   21:aload_0         
	//   10   22:getfield        #248 <Field int selectedVariantIndex>
	//   11   25:istore          4
		if(al[i] != 0L)
	//*  12   27:aload           8
	//*  13   29:iload           4
	//*  14   31:laload          
	//*  15   32:lconst_0        
	//*  16   33:lcmp            
	//*  17   34:ifeq            44
			return getVariantIndexForBandwidth(l1);
	//   18   37:aload_0         
	//   19   38:lload           6
	//   20   40:invokespecial   #252 <Method int getVariantIndexForBandwidth(long)>
	//   21   43:ireturn         
		if(tschunk == null)
	//*  22   44:aload_1         
	//*  23   45:ifnonnull       51
			return i;
	//   24   48:iload           4
	//   25   50:ireturn         
		if(l1 == -1L)
	//*  26   51:lload           6
	//*  27   53:ldc2w           #253 <Long -1L>
	//*  28   56:lcmp            
	//*  29   57:ifne            63
			return i;
	//   30   60:iload           4
	//   31   62:ireturn         
		i = getVariantIndexForBandwidth(l1);
	//   32   63:aload_0         
	//   33   64:lload           6
	//   34   66:invokespecial   #252 <Method int getVariantIndexForBandwidth(long)>
	//   35   69:istore          4
		int j = selectedVariantIndex;
	//   36   71:aload_0         
	//   37   72:getfield        #248 <Field int selectedVariantIndex>
	//   38   75:istore          5
		if(i == j)
	//*  39   77:iload           4
	//*  40   79:iload           5
	//*  41   81:icmpne          87
			return j;
	//   42   84:iload           5
	//   43   86:ireturn         
		l = tschunk.getAdjustedEndTimeUs() - tschunk.getDurationUs() - l;
	//   44   87:aload_1         
	//   45   88:invokevirtual   #259 <Method long TsChunk.getAdjustedEndTimeUs()>
	//   46   91:aload_1         
	//   47   92:invokevirtual   #262 <Method long TsChunk.getDurationUs()>
	//   48   95:lsub            
	//   49   96:lload_2         
	//   50   97:lsub            
	//   51   98:lstore_2        
		tschunk = ((TsChunk) (variantBlacklistTimes));
	//   52   99:aload_0         
	//   53  100:getfield        #189 <Field long[] variantBlacklistTimes>
	//   54  103:astore_1        
		j = selectedVariantIndex;
	//   55  104:aload_0         
	//   56  105:getfield        #248 <Field int selectedVariantIndex>
	//   57  108:istore          5
		if(tschunk[j] == 0L && (i <= j || l >= maxBufferDurationToSwitchDownUs))
	//*  58  110:aload_1         
	//*  59  111:iload           5
	//*  60  113:laload          
	//*  61  114:lconst_0        
	//*  62  115:lcmp            
	//*  63  116:ifne            161
	//*  64  119:iload           4
	//*  65  121:iload           5
	//*  66  123:icmple          135
	//*  67  126:lload_2         
	//*  68  127:aload_0         
	//*  69  128:getfield        #131 <Field long maxBufferDurationToSwitchDownUs>
	//*  70  131:lcmp            
	//*  71  132:iflt            161
		{
			if(i < selectedVariantIndex && l > minBufferDurationToSwitchUpUs)
	//*  72  135:iload           4
	//*  73  137:aload_0         
	//*  74  138:getfield        #248 <Field int selectedVariantIndex>
	//*  75  141:icmpge          156
	//*  76  144:lload_2         
	//*  77  145:aload_0         
	//*  78  146:getfield        #129 <Field long minBufferDurationToSwitchUpUs>
	//*  79  149:lcmp            
	//*  80  150:ifle            156
				return i;
	//   81  153:iload           4
	//   82  155:ireturn         
			else
				return selectedVariantIndex;
	//   83  156:aload_0         
	//   84  157:getfield        #248 <Field int selectedVariantIndex>
	//   85  160:ireturn         
		} else
		{
			return i;
	//   86  161:iload           4
	//   87  163:ireturn         
		}
	}

	private int getVariantIndex(Format format)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			Variant avariant[] = variants;
	//    2    2:aload_0         
	//    3    3:getfield        #266 <Field Variant[] variants>
	//    4    6:astore_3        
			if(i < avariant.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          35
			{
				if(avariant[i].format.equals(((Object) (format))))
	//*   9   13:aload_3         
	//*  10   14:iload_2         
	//*  11   15:aaload          
	//*  12   16:getfield        #270 <Field Format Variant.format>
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #273 <Method boolean Format.equals(Object)>
	//*  15   23:ifeq            28
					return i;
	//   16   26:iload_2         
	//   17   27:ireturn         
				i++;
	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
			} else
	//*  22   32:goto            2
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   23   35:new             #275 <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #276 <Method void StringBuilder()>
	//   26   42:astore_3        
				stringbuilder.append("Invalid format: ");
	//   27   43:aload_3         
	//   28   44:ldc2            #278 <String "Invalid format: ">
	//   29   47:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   30   50:pop             
				stringbuilder.append(((Object) (format)));
	//   31   51:aload_3         
	//   32   52:aload_1         
	//   33   53:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   34   56:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   35   57:new             #287 <Class IllegalStateException>
	//   36   60:dup             
	//   37   61:aload_3         
	//   38   62:invokevirtual   #291 <Method String StringBuilder.toString()>
	//   39   65:invokespecial   #294 <Method void IllegalStateException(String)>
	//   40   68:athrow          
			}
		} while(true);
	}

	private int getVariantIndexForBandwidth(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore          6
		if(l == -1L)
	//*   2    3:lload_1         
	//*   3    4:ldc2w           #253 <Long -1L>
	//*   4    7:lcmp            
	//*   5    8:ifne            14
			l1 = 0L;
	//    6   11:lconst_0        
	//    7   12:lstore          6
		int k = (int)((float)l1 * 0.8F);
	//    8   14:lload           6
	//    9   16:l2f             
	//   10   17:ldc1            #29  <Float 0.8F>
	//   11   19:fmul            
	//   12   20:f2i             
	//   13   21:istore          5
		boolean flag = false;
	//   14   23:iconst_0        
	//   15   24:istore          8
		int i = 0;
	//   16   26:iconst_0        
	//   17   27:istore_3        
		int j = -1;
	//   18   28:iconst_m1       
	//   19   29:istore          4
		do
		{
			Variant avariant[] = variants;
	//   20   31:aload_0         
	//   21   32:getfield        #266 <Field Variant[] variants>
	//   22   35:astore          9
			if(i >= avariant.length)
				break;
	//   23   37:iload_3         
	//   24   38:aload           9
	//   25   40:arraylength     
	//   26   41:icmpge          82
			if(variantBlacklistTimes[i] == 0L)
	//*  27   44:aload_0         
	//*  28   45:getfield        #189 <Field long[] variantBlacklistTimes>
	//*  29   48:iload_3         
	//*  30   49:laload          
	//*  31   50:lconst_0        
	//*  32   51:lcmp            
	//*  33   52:ifne            75
			{
				if(avariant[i].format.bitrate <= k)
	//*  34   55:aload           9
	//*  35   57:iload_3         
	//*  36   58:aaload          
	//*  37   59:getfield        #270 <Field Format Variant.format>
	//*  38   62:getfield        #297 <Field int Format.bitrate>
	//*  39   65:iload           5
	//*  40   67:icmpgt          72
					return i;
	//   41   70:iload_3         
	//   42   71:ireturn         
				j = i;
	//   43   72:iload_3         
	//   44   73:istore          4
			}
			i++;
	//   45   75:iload_3         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore_3        
		} while(true);
	//   49   79:goto            31
		if(j != -1)
	//*  50   82:iload           4
	//*  51   84:iconst_m1       
	//*  52   85:icmpeq          91
			flag = true;
	//   53   88:iconst_1        
	//   54   89:istore          8
		Assertions.checkState(flag);
	//   55   91:iload           8
	//   56   93:invokestatic    #303 <Method void Assertions.checkState(boolean)>
		return j;
	//   57   96:iload           4
	//   58   98:ireturn         
	}

	private EncryptionKeyChunk newEncryptionKeyChunk(Uri uri, String s, int i)
	{
		uri = ((Uri) (new DataSpec(uri, 0L, -1L, ((String) (null)), 1)));
	//    0    0:new             #307 <Class DataSpec>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:ldc2w           #253 <Long -1L>
	//    5    9:aconst_null     
	//    6   10:iconst_1        
	//    7   11:invokespecial   #310 <Method void DataSpec(Uri, long, long, String, int)>
	//    8   14:astore_1        
		return new EncryptionKeyChunk(dataSource, ((DataSpec) (uri)), scratchSpace, s, i);
	//    9   15:new             #12  <Class HlsChunkSource$EncryptionKeyChunk>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #115 <Field DataSource dataSource>
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #312 <Field byte[] scratchSpace>
	//   16   28:aload_2         
	//   17   29:iload_3         
	//   18   30:invokespecial   #315 <Method void HlsChunkSource$EncryptionKeyChunk(DataSource, DataSpec, byte[], String, int)>
	//   19   33:areturn         
	}

	private MediaPlaylistChunk newMediaPlaylistChunk(int i)
	{
		Uri uri = UriUtil.resolveToUri(baseUri, variants[i].url);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field String baseUri>
	//    2    4:aload_0         
	//    3    5:getfield        #266 <Field Variant[] variants>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:getfield        #320 <Field String Variant.url>
	//    7   13:invokestatic    #326 <Method Uri UriUtil.resolveToUri(String, String)>
	//    8   16:astore_2        
		DataSpec dataspec = new DataSpec(uri, 0L, -1L, ((String) (null)), 1);
	//    9   17:new             #307 <Class DataSpec>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:lconst_0        
	//   13   23:ldc2w           #253 <Long -1L>
	//   14   26:aconst_null     
	//   15   27:iconst_1        
	//   16   28:invokespecial   #310 <Method void DataSpec(Uri, long, long, String, int)>
	//   17   31:astore_3        
		return new MediaPlaylistChunk(dataSource, dataspec, scratchSpace, playlistParser, i, uri.toString());
	//   18   32:new             #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #115 <Field DataSource dataSource>
	//   22   40:aload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #312 <Field byte[] scratchSpace>
	//   25   45:aload_0         
	//   26   46:getfield        #141 <Field HlsPlaylistParser playlistParser>
	//   27   49:iload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #329 <Method String Uri.toString()>
	//   30   54:invokespecial   #332 <Method void HlsChunkSource$MediaPlaylistChunk(DataSource, DataSpec, byte[], HlsPlaylistParser, int, String)>
	//   31   57:areturn         
	}

	private void setEncryptionData(Uri uri, String s, byte abyte0[])
	{
		String s1;
		if(s.toLowerCase(Locale.getDefault()).startsWith("0x"))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #340 <Method Locale Locale.getDefault()>
	//*   2    4:invokevirtual   #346 <Method String String.toLowerCase(Locale)>
	//*   3    7:ldc2            #348 <String "0x">
	//*   4   10:invokevirtual   #352 <Method boolean String.startsWith(String)>
	//*   5   13:ifeq            26
			s1 = s.substring(2);
	//    6   16:aload_2         
	//    7   17:iconst_2        
	//    8   18:invokevirtual   #356 <Method String String.substring(int)>
	//    9   21:astore          5
		else
	//*  10   23:goto            29
			s1 = s;
	//   11   26:aload_2         
	//   12   27:astore          5
		byte abyte1[] = (new BigInteger(s1, 16)).toByteArray();
	//   13   29:new             #358 <Class BigInteger>
	//   14   32:dup             
	//   15   33:aload           5
	//   16   35:bipush          16
	//   17   37:invokespecial   #361 <Method void BigInteger(String, int)>
	//   18   40:invokevirtual   #365 <Method byte[] BigInteger.toByteArray()>
	//   19   43:astore          5
		byte abyte2[] = new byte[16];
	//   20   45:bipush          16
	//   21   47:newarray        byte[]
	//   22   49:astore          6
		int i;
		if(abyte1.length > 16)
	//*  23   51:aload           5
	//*  24   53:arraylength     
	//*  25   54:bipush          16
	//*  26   56:icmple          70
			i = abyte1.length - 16;
	//   27   59:aload           5
	//   28   61:arraylength     
	//   29   62:bipush          16
	//   30   64:isub            
	//   31   65:istore          4
		else
	//*  32   67:goto            73
			i = 0;
	//   33   70:iconst_0        
	//   34   71:istore          4
		System.arraycopy(((Object) (abyte1)), i, ((Object) (abyte2)), (abyte2.length - abyte1.length) + i, abyte1.length - i);
	//   35   73:aload           5
	//   36   75:iload           4
	//   37   77:aload           6
	//   38   79:aload           6
	//   39   81:arraylength     
	//   40   82:aload           5
	//   41   84:arraylength     
	//   42   85:isub            
	//   43   86:iload           4
	//   44   88:iadd            
	//   45   89:aload           5
	//   46   91:arraylength     
	//   47   92:iload           4
	//   48   94:isub            
	//   49   95:invokestatic    #371 <Method void System.arraycopy(Object, int, Object, int, int)>
		encryptionKeyUri = uri;
	//   50   98:aload_0         
	//   51   99:aload_1         
	//   52  100:putfield        #192 <Field Uri encryptionKeyUri>
		encryptionKey = abyte0;
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:putfield        #194 <Field byte[] encryptionKey>
		encryptionIvString = s;
	//   56  108:aload_0         
	//   57  109:aload_2         
	//   58  110:putfield        #196 <Field String encryptionIvString>
		encryptionIv = abyte2;
	//   59  113:aload_0         
	//   60  114:aload           6
	//   61  116:putfield        #198 <Field byte[] encryptionIv>
	//   62  119:return          
	}

	private void setMediaPlaylist(int i, HlsMediaPlaylist hlsmediaplaylist)
	{
		variantLastPlaylistLoadTimesMs[i] = SystemClock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field long[] variantLastPlaylistLoadTimesMs>
	//    2    4:iload_1         
	//    3    5:invokestatic    #205 <Method long SystemClock.elapsedRealtime()>
	//    4    8:lastore         
		variantPlaylists[i] = hlsmediaplaylist;
	//    5    9:aload_0         
	//    6   10:getfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:aastore         
		live = live | hlsmediaplaylist.live;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #375 <Field boolean live>
	//   13   21:aload_2         
	//   14   22:getfield        #376 <Field boolean HlsMediaPlaylist.live>
	//   15   25:ior             
	//   16   26:putfield        #375 <Field boolean live>
		long l;
		if(live)
	//*  17   29:aload_0         
	//*  18   30:getfield        #375 <Field boolean live>
	//*  19   33:ifeq            43
			l = -1L;
	//   20   36:ldc2w           #253 <Long -1L>
	//   21   39:lstore_3        
		else
	//*  22   40:goto            48
			l = hlsmediaplaylist.durationUs;
	//   23   43:aload_2         
	//   24   44:getfield        #378 <Field long HlsMediaPlaylist.durationUs>
	//   25   47:lstore_3        
		durationUs = l;
	//   26   48:aload_0         
	//   27   49:lload_3         
	//   28   50:putfield        #379 <Field long durationUs>
	//   29   53:return          
	}

	private boolean shouldRerequestLiveMediaPlaylist(int i)
	{
		HlsMediaPlaylist hlsmediaplaylist = variantPlaylists[i];
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_2        
		return SystemClock.elapsedRealtime() - variantLastPlaylistLoadTimesMs[i] >= (long)((hlsmediaplaylist.targetDurationSecs * 1000) / 2);
	//    5    7:invokestatic    #205 <Method long SystemClock.elapsedRealtime()>
	//    6   10:aload_0         
	//    7   11:getfield        #233 <Field long[] variantLastPlaylistLoadTimesMs>
	//    8   14:iload_1         
	//    9   15:laload          
	//   10   16:lsub            
	//   11   17:aload_2         
	//   12   18:getfield        #384 <Field int HlsMediaPlaylist.targetDurationSecs>
	//   13   21:sipush          1000
	//   14   24:imul            
	//   15   25:iconst_2        
	//   16   26:idiv            
	//   17   27:i2l             
	//   18   28:lcmp            
	//   19   29:iflt            34
	//   20   32:iconst_1        
	//   21   33:ireturn         
	//   22   34:iconst_0        
	//   23   35:ireturn         
	}

	public void adaptiveTrack(HlsMasterPlaylist hlsmasterplaylist, Variant avariant[])
	{
		Arrays.sort(((Object []) (avariant)), new Comparator() {

			public int compare(Variant variant, Variant variant1)
			{
				return formatComparator.compare(((Object) (variant.format)), ((Object) (variant1.format)));
			//    0    0:aload_0         
			//    1    1:getfield        #29  <Field Comparator formatComparator>
			//    2    4:aload_1         
			//    3    5:getfield        #38  <Field Format Variant.format>
			//    4    8:aload_2         
			//    5    9:getfield        #38  <Field Format Variant.format>
			//    6   12:invokeinterface #41  <Method int Comparator.compare(Object, Object)>
			//    7   17:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((Variant)obj, (Variant)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #34  <Class Variant>
			//    3    5:aload_2         
			//    4    6:checkcast       #34  <Class Variant>
			//    5    9:invokevirtual   #43  <Method int compare(Variant, Variant)>
			//    6   12:ireturn         
			}

			private final Comparator formatComparator = new com.google.android.exoplayer.chunk.Format.DecreasingBandwidthComparator();
			final HlsChunkSource this$0;

			
			{
				this$0 = HlsChunkSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field HlsChunkSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:aload_0         
			//    6   10:new             #26  <Class com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator>
			//    7   13:dup             
			//    8   14:invokespecial   #27  <Method void com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator()>
			//    9   17:putfield        #29  <Field Comparator formatComparator>
			//   10   20:return          
			}
		}
);
	//    0    0:aload_2         
	//    1    1:new             #10  <Class HlsChunkSource$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #389 <Method void HlsChunkSource$2(HlsChunkSource)>
	//    5    9:invokestatic    #395 <Method void Arrays.sort(Object[], Comparator)>
		int l = computeDefaultVariantIndex(hlsmasterplaylist, avariant, bandwidthMeter);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #119 <Field BandwidthMeter bandwidthMeter>
	//   11   19:invokevirtual   #399 <Method int computeDefaultVariantIndex(HlsMasterPlaylist, Variant[], BandwidthMeter)>
	//   12   22:istore          6
		int j = -1;
	//   13   24:iconst_m1       
	//   14   25:istore          4
		int k = 0;
	//   15   27:iconst_0        
	//   16   28:istore          5
		int i = -1;
	//   17   30:iconst_m1       
	//   18   31:istore_3        
		for(; k < avariant.length; k++)
	//*  19   32:iload           5
	//*  20   34:aload_2         
	//*  21   35:arraylength     
	//*  22   36:icmpge          76
		{
			hlsmasterplaylist = ((HlsMasterPlaylist) (avariant[k].format));
	//   23   39:aload_2         
	//   24   40:iload           5
	//   25   42:aaload          
	//   26   43:getfield        #270 <Field Format Variant.format>
	//   27   46:astore_1        
			j = Math.max(((Format) (hlsmasterplaylist)).width, j);
	//   28   47:aload_1         
	//   29   48:getfield        #402 <Field int Format.width>
	//   30   51:iload           4
	//   31   53:invokestatic    #408 <Method int Math.max(int, int)>
	//   32   56:istore          4
			i = Math.max(((Format) (hlsmasterplaylist)).height, i);
	//   33   58:aload_1         
	//   34   59:getfield        #411 <Field int Format.height>
	//   35   62:iload_3         
	//   36   63:invokestatic    #408 <Method int Math.max(int, int)>
	//   37   66:istore_3        
		}

	//   38   67:iload           5
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore          5
	//*  42   73:goto            32
		if(j <= 0)
	//*  43   76:iload           4
	//*  44   78:ifle            84
	//*  45   81:goto            89
			j = 1920;
	//   46   84:sipush          1920
	//   47   87:istore          4
		if(i <= 0)
	//*  48   89:iload_3         
	//*  49   90:ifle            96
	//*  50   93:goto            100
			i = 1080;
	//   51   96:sipush          1080
	//   52   99:istore_3        
		tracks.add(((Object) (new ExposedTrack(avariant, l, j, i))));
	//   53  100:aload_0         
	//   54  101:getfield        #146 <Field ArrayList tracks>
	//   55  104:new             #18  <Class HlsChunkSource$ExposedTrack>
	//   56  107:dup             
	//   57  108:aload_2         
	//   58  109:iload           6
	//   59  111:iload           4
	//   60  113:iload_3         
	//   61  114:invokespecial   #414 <Method void HlsChunkSource$ExposedTrack(Variant[], int, int, int)>
	//   62  117:invokevirtual   #415 <Method boolean ArrayList.add(Object)>
	//   63  120:pop             
	//   64  121:return          
	}

	protected int computeDefaultVariantIndex(HlsMasterPlaylist hlsmasterplaylist, Variant avariant[], BandwidthMeter bandwidthmeter)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = 0x7fffffff;
	//    2    3:ldc2            #416 <Int 0x7fffffff>
	//    3    6:istore          5
		int l = 0;
	//    4    8:iconst_0        
	//    5    9:istore          7
		while(i < avariant.length) 
	//*   6   11:iload           4
	//*   7   13:aload_2         
	//*   8   14:arraylength     
	//*   9   15:icmpge          65
		{
			int i1 = hlsmasterplaylist.variants.indexOf(((Object) (avariant[i])));
	//   10   18:aload_1         
	//   11   19:getfield        #418 <Field List HlsMasterPlaylist.variants>
	//   12   22:aload_2         
	//   13   23:iload           4
	//   14   25:aaload          
	//   15   26:invokeinterface #422 <Method int List.indexOf(Object)>
	//   16   31:istore          8
			int k = j;
	//   17   33:iload           5
	//   18   35:istore          6
			if(i1 < j)
	//*  19   37:iload           8
	//*  20   39:iload           5
	//*  21   41:icmpge          52
			{
				l = i;
	//   22   44:iload           4
	//   23   46:istore          7
				k = i1;
	//   24   48:iload           8
	//   25   50:istore          6
			}
			i++;
	//   26   52:iload           4
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:istore          4
			j = k;
	//   30   58:iload           6
	//   31   60:istore          5
		}
	//*  32   62:goto            11
		return l;
	//   33   65:iload           7
	//   34   67:ireturn         
	}

	public void fixedTrack(HlsMasterPlaylist hlsmasterplaylist, Variant variant)
	{
		tracks.add(((Object) (new ExposedTrack(variant))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ArrayList tracks>
	//    2    4:new             #18  <Class HlsChunkSource$ExposedTrack>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #427 <Method void HlsChunkSource$ExposedTrack(Variant)>
	//    6   12:invokevirtual   #415 <Method boolean ArrayList.add(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void getChunkOperation(TsChunk tschunk, long l, ChunkOperationHolder chunkoperationholder)
	{
		int i;
		if(tschunk == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			i = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          5
		else
	//*   4    7:goto            20
			i = getVariantIndex(tschunk.format);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:getfield        #430 <Field Format TsChunk.format>
	//    8   15:invokespecial   #432 <Method int getVariantIndex(Format)>
	//    9   18:istore          5
		int j = getNextVariantIndex(tschunk, l);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:lload_2         
	//   13   23:invokespecial   #434 <Method int getNextVariantIndex(TsChunk, long)>
	//   14   26:istore          6
		boolean flag;
		if(tschunk != null && i != j)
	//*  15   28:aload_1         
	//*  16   29:ifnull          45
	//*  17   32:iload           5
	//*  18   34:iload           6
	//*  19   36:icmpeq          45
			flag = true;
	//   20   39:iconst_1        
	//   21   40:istore          14
		else
	//*  22   42:goto            48
			flag = false;
	//   23   45:iconst_0        
	//   24   46:istore          14
		Object obj = ((Object) (variantPlaylists[j]));
	//   25   48:aload_0         
	//   26   49:getfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
	//   27   52:iload           6
	//   28   54:aaload          
	//   29   55:astore          17
		if(obj == null)
	//*  30   57:aload           17
	//*  31   59:ifnonnull       74
		{
			chunkoperationholder.chunk = ((Chunk) (newMediaPlaylistChunk(j)));
	//   32   62:aload           4
	//   33   64:aload_0         
	//   34   65:iload           6
	//   35   67:invokespecial   #436 <Method HlsChunkSource$MediaPlaylistChunk newMediaPlaylistChunk(int)>
	//   36   70:putfield        #442 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//   37   73:return          
		}
		selectedVariantIndex = j;
	//   38   74:aload_0         
	//   39   75:iload           6
	//   40   77:putfield        #248 <Field int selectedVariantIndex>
		if(live)
	//*  41   80:aload_0         
	//*  42   81:getfield        #375 <Field boolean live>
	//*  43   84:ifeq            145
		{
			if(tschunk == null)
	//*  44   87:aload_1         
	//*  45   88:ifnonnull       104
			{
				i = getLiveStartChunkSequenceNumber(selectedVariantIndex);
	//   46   91:aload_0         
	//   47   92:aload_0         
	//   48   93:getfield        #248 <Field int selectedVariantIndex>
	//   49   96:invokespecial   #444 <Method int getLiveStartChunkSequenceNumber(int)>
	//   50   99:istore          5
			} else
	//*  51  101:goto            213
			{
				i = getLiveNextChunkSequenceNumber(tschunk.chunkIndex, i, selectedVariantIndex);
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #447 <Field int TsChunk.chunkIndex>
	//   55  109:iload           5
	//   56  111:aload_0         
	//   57  112:getfield        #248 <Field int selectedVariantIndex>
	//   58  115:invokespecial   #449 <Method int getLiveNextChunkSequenceNumber(int, int, int)>
	//   59  118:istore          5
				if(i < ((HlsMediaPlaylist) (obj)).mediaSequence)
	//*  60  120:iload           5
	//*  61  122:aload           17
	//*  62  124:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//*  63  127:icmpge          142
				{
					fatalError = ((IOException) (new BehindLiveWindowException()));
	//   64  130:aload_0         
	//   65  131:new             #451 <Class BehindLiveWindowException>
	//   66  134:dup             
	//   67  135:invokespecial   #452 <Method void BehindLiveWindowException()>
	//   68  138:putfield        #454 <Field IOException fatalError>
					return;
	//   69  141:return          
				}
			}
		} else
	//*  70  142:goto            213
		if(tschunk == null)
	//*  71  145:aload_1         
	//*  72  146:ifnonnull       174
			i = Util.binarySearchFloor(((HlsMediaPlaylist) (obj)).segments, ((Object) (Long.valueOf(l))), true, true) + ((HlsMediaPlaylist) (obj)).mediaSequence;
	//   73  149:aload           17
	//   74  151:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//   75  154:lload_2         
	//   76  155:invokestatic    #460 <Method Long Long.valueOf(long)>
	//   77  158:iconst_1        
	//   78  159:iconst_1        
	//   79  160:invokestatic    #466 <Method int Util.binarySearchFloor(List, Object, boolean, boolean)>
	//   80  163:aload           17
	//   81  165:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   82  168:iadd            
	//   83  169:istore          5
		else
	//*  84  171:goto            213
		if(flag)
	//*  85  174:iload           14
	//*  86  176:ifeq            207
			i = Util.binarySearchFloor(((HlsMediaPlaylist) (obj)).segments, ((Object) (Long.valueOf(tschunk.startTimeUs))), true, true) + ((HlsMediaPlaylist) (obj)).mediaSequence;
	//   87  179:aload           17
	//   88  181:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//   89  184:aload_1         
	//   90  185:getfield        #469 <Field long TsChunk.startTimeUs>
	//   91  188:invokestatic    #460 <Method Long Long.valueOf(long)>
	//   92  191:iconst_1        
	//   93  192:iconst_1        
	//   94  193:invokestatic    #466 <Method int Util.binarySearchFloor(List, Object, boolean, boolean)>
	//   95  196:aload           17
	//   96  198:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//   97  201:iadd            
	//   98  202:istore          5
		else
	//*  99  204:goto            213
			i = tschunk.getNextChunkIndex();
	//  100  207:aload_1         
	//  101  208:invokevirtual   #472 <Method int TsChunk.getNextChunkIndex()>
	//  102  211:istore          5
		j = i - ((HlsMediaPlaylist) (obj)).mediaSequence;
	//  103  213:iload           5
	//  104  215:aload           17
	//  105  217:getfield        #214 <Field int HlsMediaPlaylist.mediaSequence>
	//  106  220:isub            
	//  107  221:istore          6
		if(j >= ((HlsMediaPlaylist) (obj)).segments.size())
	//* 108  223:iload           6
	//* 109  225:aload           17
	//* 110  227:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//* 111  230:invokeinterface #222 <Method int List.size()>
	//* 112  235:icmplt          278
		{
			if(!((HlsMediaPlaylist) (obj)).live)
	//* 113  238:aload           17
	//* 114  240:getfield        #376 <Field boolean HlsMediaPlaylist.live>
	//* 115  243:ifne            253
			{
				chunkoperationholder.endOfStream = true;
	//  116  246:aload           4
	//  117  248:iconst_1        
	//  118  249:putfield        #475 <Field boolean ChunkOperationHolder.endOfStream>
				return;
	//  119  252:return          
			}
			if(shouldRerequestLiveMediaPlaylist(selectedVariantIndex))
	//* 120  253:aload_0         
	//* 121  254:aload_0         
	//* 122  255:getfield        #248 <Field int selectedVariantIndex>
	//* 123  258:invokespecial   #477 <Method boolean shouldRerequestLiveMediaPlaylist(int)>
	//* 124  261:ifeq            277
				chunkoperationholder.chunk = ((Chunk) (newMediaPlaylistChunk(selectedVariantIndex)));
	//  125  264:aload           4
	//  126  266:aload_0         
	//  127  267:aload_0         
	//  128  268:getfield        #248 <Field int selectedVariantIndex>
	//  129  271:invokespecial   #436 <Method HlsChunkSource$MediaPlaylistChunk newMediaPlaylistChunk(int)>
	//  130  274:putfield        #442 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//  131  277:return          
		}
		HlsMediaPlaylist.Segment segment = (HlsMediaPlaylist.Segment)((HlsMediaPlaylist) (obj)).segments.get(j);
	//  132  278:aload           17
	//  133  280:getfield        #218 <Field List HlsMediaPlaylist.segments>
	//  134  283:iload           6
	//  135  285:invokeinterface #226 <Method Object List.get(int)>
	//  136  290:checkcast       #228 <Class HlsMediaPlaylist$Segment>
	//  137  293:astore          16
		Object obj1 = ((Object) (UriUtil.resolveToUri(((HlsMediaPlaylist) (obj)).baseUri, segment.url)));
	//  138  295:aload           17
	//  139  297:getfield        #478 <Field String HlsMediaPlaylist.baseUri>
	//  140  300:aload           16
	//  141  302:getfield        #479 <Field String HlsMediaPlaylist$Segment.url>
	//  142  305:invokestatic    #326 <Method Uri UriUtil.resolveToUri(String, String)>
	//  143  308:astore          19
		if(segment.isEncrypted)
	//* 144  310:aload           16
	//* 145  312:getfield        #482 <Field boolean HlsMediaPlaylist$Segment.isEncrypted>
	//* 146  315:ifeq            399
		{
			obj = ((Object) (UriUtil.resolveToUri(((HlsMediaPlaylist) (obj)).baseUri, segment.encryptionKeyUri)));
	//  147  318:aload           17
	//  148  320:getfield        #478 <Field String HlsMediaPlaylist.baseUri>
	//  149  323:aload           16
	//  150  325:getfield        #484 <Field String HlsMediaPlaylist$Segment.encryptionKeyUri>
	//  151  328:invokestatic    #326 <Method Uri UriUtil.resolveToUri(String, String)>
	//  152  331:astore          17
			if(!((Uri) (obj)).equals(((Object) (encryptionKeyUri))))
	//* 153  333:aload           17
	//* 154  335:aload_0         
	//* 155  336:getfield        #192 <Field Uri encryptionKeyUri>
	//* 156  339:invokevirtual   #485 <Method boolean Uri.equals(Object)>
	//* 157  342:ifne            366
			{
				chunkoperationholder.chunk = ((Chunk) (newEncryptionKeyChunk(((Uri) (obj)), segment.encryptionIV, selectedVariantIndex)));
	//  158  345:aload           4
	//  159  347:aload_0         
	//  160  348:aload           17
	//  161  350:aload           16
	//  162  352:getfield        #488 <Field String HlsMediaPlaylist$Segment.encryptionIV>
	//  163  355:aload_0         
	//  164  356:getfield        #248 <Field int selectedVariantIndex>
	//  165  359:invokespecial   #490 <Method HlsChunkSource$EncryptionKeyChunk newEncryptionKeyChunk(Uri, String, int)>
	//  166  362:putfield        #442 <Field Chunk ChunkOperationHolder.chunk>
				return;
	//  167  365:return          
			}
			if(!Util.areEqual(((Object) (segment.encryptionIV)), ((Object) (encryptionIvString))))
	//* 168  366:aload           16
	//* 169  368:getfield        #488 <Field String HlsMediaPlaylist$Segment.encryptionIV>
	//* 170  371:aload_0         
	//* 171  372:getfield        #196 <Field String encryptionIvString>
	//* 172  375:invokestatic    #494 <Method boolean Util.areEqual(Object, Object)>
	//* 173  378:ifne            403
				setEncryptionData(((Uri) (obj)), segment.encryptionIV, encryptionKey);
	//  174  381:aload_0         
	//  175  382:aload           17
	//  176  384:aload           16
	//  177  386:getfield        #488 <Field String HlsMediaPlaylist$Segment.encryptionIV>
	//  178  389:aload_0         
	//  179  390:getfield        #194 <Field byte[] encryptionKey>
	//  180  393:invokespecial   #496 <Method void setEncryptionData(Uri, String, byte[])>
		} else
	//* 181  396:goto            403
		{
			clearEncryptionData();
	//  182  399:aload_0         
	//  183  400:invokespecial   #498 <Method void clearEncryptionData()>
		}
		obj = ((Object) (new DataSpec(((Uri) (obj1)), segment.byterangeOffset, segment.byterangeLength, ((String) (null)))));
	//  184  403:new             #307 <Class DataSpec>
	//  185  406:dup             
	//  186  407:aload           19
	//  187  409:aload           16
	//  188  411:getfield        #501 <Field long HlsMediaPlaylist$Segment.byterangeOffset>
	//  189  414:aload           16
	//  190  416:getfield        #504 <Field long HlsMediaPlaylist$Segment.byterangeLength>
	//  191  419:aconst_null     
	//  192  420:invokespecial   #507 <Method void DataSpec(Uri, long, long, String)>
	//  193  423:astore          17
		boolean flag1 = live;
	//  194  425:aload_0         
	//  195  426:getfield        #375 <Field boolean live>
	//  196  429:istore          15
		l = 0L;
	//  197  431:lconst_0        
	//  198  432:lstore_2        
		if(flag1)
	//* 199  433:iload           15
	//* 200  435:ifeq            471
		{
			if(tschunk == null)
	//* 201  438:aload_1         
	//* 202  439:ifnonnull       447
			{
				l = 0L;
	//  203  442:lconst_0        
	//  204  443:lstore_2        
			} else
	//* 205  444:goto            477
			{
				long l1 = tschunk.getAdjustedEndTimeUs();
	//  206  447:aload_1         
	//  207  448:invokevirtual   #259 <Method long TsChunk.getAdjustedEndTimeUs()>
	//  208  451:lstore          8
				if(flag)
	//* 209  453:iload           14
	//* 210  455:ifeq            463
					l = tschunk.getDurationUs();
	//  211  458:aload_1         
	//  212  459:invokevirtual   #262 <Method long TsChunk.getDurationUs()>
	//  213  462:lstore_2        
				l = l1 - l;
	//  214  463:lload           8
	//  215  465:lload_2         
	//  216  466:lsub            
	//  217  467:lstore_2        
			}
		} else
	//* 218  468:goto            477
		{
			l = segment.startTimeUs;
	//  219  471:aload           16
	//  220  473:getfield        #508 <Field long HlsMediaPlaylist$Segment.startTimeUs>
	//  221  476:lstore_2        
		}
		long l4 = (long)(segment.durationSecs * 1000000D);
	//  222  477:aload           16
	//  223  479:getfield        #231 <Field double HlsMediaPlaylist$Segment.durationSecs>
	//  224  482:ldc2w           #509 <Double 1000000D>
	//  225  485:dmul            
	//  226  486:d2l             
	//  227  487:lstore          12
		Format format = variants[selectedVariantIndex].format;
	//  228  489:aload_0         
	//  229  490:getfield        #266 <Field Variant[] variants>
	//  230  493:aload_0         
	//  231  494:getfield        #248 <Field int selectedVariantIndex>
	//  232  497:aaload          
	//  233  498:getfield        #270 <Field Format Variant.format>
	//  234  501:astore          18
		obj1 = ((Object) (((Uri) (obj1)).getLastPathSegment()));
	//  235  503:aload           19
	//  236  505:invokevirtual   #513 <Method String Uri.getLastPathSegment()>
	//  237  508:astore          19
		long l2;
		if(((String) (obj1)).endsWith(".aac"))
	//* 238  510:aload           19
	//* 239  512:ldc1            #26  <String ".aac">
	//* 240  514:invokevirtual   #516 <Method boolean String.endsWith(String)>
	//* 241  517:ifeq            550
		{
			tschunk = ((TsChunk) (new HlsExtractorWrapper(0, format, l, ((com.google.android.exoplayer.extractor.Extractor) (new AdtsExtractor(l))), flag, -1, -1)));
	//  242  520:new             #518 <Class HlsExtractorWrapper>
	//  243  523:dup             
	//  244  524:iconst_0        
	//  245  525:aload           18
	//  246  527:lload_2         
	//  247  528:new             #520 <Class AdtsExtractor>
	//  248  531:dup             
	//  249  532:lload_2         
	//  250  533:invokespecial   #523 <Method void AdtsExtractor(long)>
	//  251  536:iload           14
	//  252  538:iconst_m1       
	//  253  539:iconst_m1       
	//  254  540:invokespecial   #526 <Method void HlsExtractorWrapper(int, Format, long, com.google.android.exoplayer.extractor.Extractor, boolean, int, int)>
	//  255  543:astore_1        
			l2 = l;
	//  256  544:lload_2         
	//  257  545:lstore          8
		} else
	//* 258  547:goto            857
		if(((String) (obj1)).endsWith(".mp3"))
	//* 259  550:aload           19
	//* 260  552:ldc1            #46  <String ".mp3">
	//* 261  554:invokevirtual   #516 <Method boolean String.endsWith(String)>
	//* 262  557:ifeq            590
		{
			tschunk = ((TsChunk) (new HlsExtractorWrapper(0, format, l, ((com.google.android.exoplayer.extractor.Extractor) (new Mp3Extractor(l))), flag, -1, -1)));
	//  263  560:new             #518 <Class HlsExtractorWrapper>
	//  264  563:dup             
	//  265  564:iconst_0        
	//  266  565:aload           18
	//  267  567:lload_2         
	//  268  568:new             #528 <Class Mp3Extractor>
	//  269  571:dup             
	//  270  572:lload_2         
	//  271  573:invokespecial   #529 <Method void Mp3Extractor(long)>
	//  272  576:iload           14
	//  273  578:iconst_m1       
	//  274  579:iconst_m1       
	//  275  580:invokespecial   #526 <Method void HlsExtractorWrapper(int, Format, long, com.google.android.exoplayer.extractor.Extractor, boolean, int, int)>
	//  276  583:astore_1        
			l2 = l;
	//  277  584:lload_2         
	//  278  585:lstore          8
		} else
	//* 279  587:goto            857
		if(!((String) (obj1)).endsWith(".webvtt") && !((String) (obj1)).endsWith(".vtt"))
	//* 280  590:aload           19
	//* 281  592:ldc1            #55  <String ".webvtt">
	//* 282  594:invokevirtual   #516 <Method boolean String.endsWith(String)>
	//* 283  597:ifne            795
	//* 284  600:aload           19
	//* 285  602:ldc1            #52  <String ".vtt">
	//* 286  604:invokevirtual   #516 <Method boolean String.endsWith(String)>
	//* 287  607:ifeq            613
	//* 288  610:goto            795
		{
			if(tschunk != null && tschunk.discontinuitySequenceNumber == segment.discontinuitySequenceNumber && format.equals(((Object) (tschunk.format))))
	//* 289  613:aload_1         
	//* 290  614:ifnull          655
	//* 291  617:aload_1         
	//* 292  618:getfield        #532 <Field int TsChunk.discontinuitySequenceNumber>
	//* 293  621:aload           16
	//* 294  623:getfield        #533 <Field int HlsMediaPlaylist$Segment.discontinuitySequenceNumber>
	//* 295  626:icmpne          655
	//* 296  629:aload           18
	//* 297  631:aload_1         
	//* 298  632:getfield        #430 <Field Format TsChunk.format>
	//* 299  635:invokevirtual   #273 <Method boolean Format.equals(Object)>
	//* 300  638:ifne            644
	//* 301  641:goto            655
			{
				tschunk = ((TsChunk) (tschunk.extractorWrapper));
	//  302  644:aload_1         
	//  303  645:getfield        #537 <Field HlsExtractorWrapper TsChunk.extractorWrapper>
	//  304  648:astore_1        
				l2 = l;
	//  305  649:lload_2         
	//  306  650:lstore          8
			} else
	//* 307  652:goto            857
			{
				tschunk = ((TsChunk) (timestampAdjusterProvider.getAdjuster(isMaster, segment.discontinuitySequenceNumber, l)));
	//  308  655:aload_0         
	//  309  656:getfield        #121 <Field PtsTimestampAdjusterProvider timestampAdjusterProvider>
	//  310  659:aload_0         
	//  311  660:getfield        #113 <Field boolean isMaster>
	//  312  663:aload           16
	//  313  665:getfield        #533 <Field int HlsMediaPlaylist$Segment.discontinuitySequenceNumber>
	//  314  668:lload_2         
	//  315  669:invokevirtual   #543 <Method com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster PtsTimestampAdjusterProvider.getAdjuster(boolean, int, long)>
	//  316  672:astore_1        
				if(tschunk == null)
	//* 317  673:aload_1         
	//* 318  674:ifnonnull       678
					return;
	//  319  677:return          
				byte byte0 = 16;
	//  320  678:bipush          16
	//  321  680:istore          7
				Object obj2 = ((Object) (format.codecs));
	//  322  682:aload           18
	//  323  684:getfield        #546 <Field String Format.codecs>
	//  324  687:astore          19
				int k = ((int) (byte0));
	//  325  689:iload           7
	//  326  691:istore          6
				if(!TextUtils.isEmpty(((CharSequence) (obj2))))
	//* 327  693:aload           19
	//* 328  695:invokestatic    #552 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 329  698:ifne            737
				{
					if(MimeTypes.getAudioMediaMimeType(((String) (obj2))) != "audio/mp4a-latm")
	//* 330  701:aload           19
	//* 331  703:invokestatic    #558 <Method String MimeTypes.getAudioMediaMimeType(String)>
	//* 332  706:ldc2            #560 <String "audio/mp4a-latm">
	//* 333  709:if_acmpeq       716
						byte0 = 18;
	//  334  712:bipush          18
	//  335  714:istore          7
					k = ((int) (byte0));
	//  336  716:iload           7
	//  337  718:istore          6
					if(MimeTypes.getVideoMediaMimeType(((String) (obj2))) != "video/avc")
	//* 338  720:aload           19
	//* 339  722:invokestatic    #563 <Method String MimeTypes.getVideoMediaMimeType(String)>
	//* 340  725:ldc2            #565 <String "video/avc">
	//* 341  728:if_acmpeq       737
						k = byte0 | 4;
	//  342  731:iload           7
	//  343  733:iconst_4        
	//  344  734:ior             
	//  345  735:istore          6
				}
				tschunk = ((TsChunk) (new TsExtractor(((com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster) (tschunk)), k)));
	//  346  737:new             #567 <Class TsExtractor>
	//  347  740:dup             
	//  348  741:aload_1         
	//  349  742:iload           6
	//  350  744:invokespecial   #570 <Method void TsExtractor(com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster, int)>
	//  351  747:astore_1        
				obj2 = ((Object) ((ExposedTrack)tracks.get(selectedTrackIndex)));
	//  352  748:aload_0         
	//  353  749:getfield        #146 <Field ArrayList tracks>
	//  354  752:aload_0         
	//  355  753:getfield        #572 <Field int selectedTrackIndex>
	//  356  756:invokevirtual   #573 <Method Object ArrayList.get(int)>
	//  357  759:checkcast       #18  <Class HlsChunkSource$ExposedTrack>
	//  358  762:astore          19
				tschunk = ((TsChunk) (new HlsExtractorWrapper(0, format, l, ((com.google.android.exoplayer.extractor.Extractor) (tschunk)), flag, ((ExposedTrack) (obj2)).adaptiveMaxWidth, ((ExposedTrack) (obj2)).adaptiveMaxHeight)));
	//  359  764:new             #518 <Class HlsExtractorWrapper>
	//  360  767:dup             
	//  361  768:iconst_0        
	//  362  769:aload           18
	//  363  771:lload_2         
	//  364  772:aload_1         
	//  365  773:iload           14
	//  366  775:aload           19
	//  367  777:invokestatic    #577 <Method int HlsChunkSource$ExposedTrack.access$200(HlsChunkSource$ExposedTrack)>
	//  368  780:aload           19
	//  369  782:invokestatic    #580 <Method int HlsChunkSource$ExposedTrack.access$300(HlsChunkSource$ExposedTrack)>
	//  370  785:invokespecial   #526 <Method void HlsExtractorWrapper(int, Format, long, com.google.android.exoplayer.extractor.Extractor, boolean, int, int)>
	//  371  788:astore_1        
				l2 = l;
	//  372  789:lload_2         
	//  373  790:lstore          8
			}
		} else
	//* 374  792:goto            857
		{
			l2 = l;
	//  375  795:lload_2         
	//  376  796:lstore          8
			tschunk = ((TsChunk) (timestampAdjusterProvider.getAdjuster(isMaster, segment.discontinuitySequenceNumber, l2)));
	//  377  798:aload_0         
	//  378  799:getfield        #121 <Field PtsTimestampAdjusterProvider timestampAdjusterProvider>
	//  379  802:aload_0         
	//  380  803:getfield        #113 <Field boolean isMaster>
	//  381  806:aload           16
	//  382  808:getfield        #533 <Field int HlsMediaPlaylist$Segment.discontinuitySequenceNumber>
	//  383  811:lload           8
	//  384  813:invokevirtual   #543 <Method com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster PtsTimestampAdjusterProvider.getAdjuster(boolean, int, long)>
	//  385  816:astore_1        
			if(tschunk == null)
	//* 386  817:aload_1         
	//* 387  818:ifnonnull       822
				return;
	//  388  821:return          
			tschunk = ((TsChunk) (new WebvttExtractor(((com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster) (tschunk)))));
	//  389  822:new             #582 <Class WebvttExtractor>
	//  390  825:dup             
	//  391  826:aload_1         
	//  392  827:invokespecial   #585 <Method void WebvttExtractor(com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster)>
	//  393  830:astore_1        
			long l3 = l2;
	//  394  831:lload           8
	//  395  833:lstore          10
			tschunk = ((TsChunk) (new HlsExtractorWrapper(0, format, l2, ((com.google.android.exoplayer.extractor.Extractor) (tschunk)), flag, -1, -1)));
	//  396  835:new             #518 <Class HlsExtractorWrapper>
	//  397  838:dup             
	//  398  839:iconst_0        
	//  399  840:aload           18
	//  400  842:lload           8
	//  401  844:aload_1         
	//  402  845:iload           14
	//  403  847:iconst_m1       
	//  404  848:iconst_m1       
	//  405  849:invokespecial   #526 <Method void HlsExtractorWrapper(int, Format, long, com.google.android.exoplayer.extractor.Extractor, boolean, int, int)>
	//  406  852:astore_1        
			l2 = l3;
	//  407  853:lload           10
	//  408  855:lstore          8
		}
		chunkoperationholder.chunk = ((Chunk) (new TsChunk(dataSource, ((DataSpec) (obj)), 0, format, l2, l + l4, i, segment.discontinuitySequenceNumber, ((HlsExtractorWrapper) (tschunk)), encryptionKey, encryptionIv)));
	//  409  857:aload           4
	//  410  859:new             #256 <Class TsChunk>
	//  411  862:dup             
	//  412  863:aload_0         
	//  413  864:getfield        #115 <Field DataSource dataSource>
	//  414  867:aload           17
	//  415  869:iconst_0        
	//  416  870:aload           18
	//  417  872:lload           8
	//  418  874:lload_2         
	//  419  875:lload           12
	//  420  877:ladd            
	//  421  878:iload           5
	//  422  880:aload           16
	//  423  882:getfield        #533 <Field int HlsMediaPlaylist$Segment.discontinuitySequenceNumber>
	//  424  885:aload_1         
	//  425  886:aload_0         
	//  426  887:getfield        #194 <Field byte[] encryptionKey>
	//  427  890:aload_0         
	//  428  891:getfield        #198 <Field byte[] encryptionIv>
	//  429  894:invokespecial   #588 <Method void TsChunk(DataSource, DataSpec, int, Format, long, long, int, int, HlsExtractorWrapper, byte[], byte[])>
	//  430  897:putfield        #442 <Field Chunk ChunkOperationHolder.chunk>
	//  431  900:return          
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field long durationUs>
	//    2    4:lreturn         
	}

	public Variant getFixedTrackVariant(int i)
	{
		Variant avariant[] = ((ExposedTrack)tracks.get(i)).variants;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ArrayList tracks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #573 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #18  <Class HlsChunkSource$ExposedTrack>
	//    5   11:invokestatic    #594 <Method Variant[] HlsChunkSource$ExposedTrack.access$000(HlsChunkSource$ExposedTrack)>
	//    6   14:astore_2        
		if(avariant.length == 1)
	//*   7   15:aload_2         
	//*   8   16:arraylength     
	//*   9   17:iconst_1        
	//*  10   18:icmpne          25
			return avariant[0];
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:aaload          
	//   14   24:areturn         
		else
			return null;
	//   15   25:aconst_null     
	//   16   26:areturn         
	}

	public String getMuxedAudioLanguage()
	{
		return masterPlaylist.muxedAudioLanguage;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field HlsMasterPlaylist masterPlaylist>
	//    2    4:getfield        #598 <Field String HlsMasterPlaylist.muxedAudioLanguage>
	//    3    7:areturn         
	}

	public String getMuxedCaptionLanguage()
	{
		return masterPlaylist.muxedCaptionLanguage;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field HlsMasterPlaylist masterPlaylist>
	//    2    4:getfield        #602 <Field String HlsMasterPlaylist.muxedCaptionLanguage>
	//    3    7:areturn         
	}

	public int getSelectedTrackIndex()
	{
		return selectedTrackIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #572 <Field int selectedTrackIndex>
	//    2    4:ireturn         
	}

	public int getTrackCount()
	{
		return tracks.size();
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ArrayList tracks>
	//    2    4:invokevirtual   #605 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public boolean isLive()
	{
		return live;
	//    0    0:aload_0         
	//    1    1:getfield        #375 <Field boolean live>
	//    2    4:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = fatalError;
	//    0    0:aload_0         
	//    1    1:getfield        #454 <Field IOException fatalError>
	//    2    4:astore_1        
		if(ioexception == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		else
			throw ioexception;
	//    6   10:aload_1         
	//    7   11:athrow          
	}

	public void onChunkLoadCompleted(final Chunk rawResponse)
	{
		if(rawResponse instanceof MediaPlaylistChunk)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//*   2    4:ifeq            69
		{
			rawResponse = ((Chunk) ((MediaPlaylistChunk)rawResponse));
	//    3    7:aload_1         
	//    4    8:checkcast       #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//    5   11:astore_1        
			scratchSpace = ((MediaPlaylistChunk) (rawResponse)).getDataHolder();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #615 <Method byte[] HlsChunkSource$MediaPlaylistChunk.getDataHolder()>
	//    9   17:putfield        #312 <Field byte[] scratchSpace>
			setMediaPlaylist(((MediaPlaylistChunk) (rawResponse)).variantIndex, ((MediaPlaylistChunk) (rawResponse)).getResult());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #618 <Field int HlsChunkSource$MediaPlaylistChunk.variantIndex>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #622 <Method HlsMediaPlaylist HlsChunkSource$MediaPlaylistChunk.getResult()>
	//   15   29:invokespecial   #624 <Method void setMediaPlaylist(int, HlsMediaPlaylist)>
			if(eventHandler != null && eventListener != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #125 <Field Handler eventHandler>
	//*  18   36:ifnull          108
	//*  19   39:aload_0         
	//*  20   40:getfield        #123 <Field HlsChunkSource$EventListener eventListener>
	//*  21   43:ifnull          108
			{
				rawResponse = ((Chunk) (((MediaPlaylistChunk) (rawResponse)).getRawResponse()));
	//   22   46:aload_1         
	//   23   47:invokevirtual   #627 <Method byte[] HlsChunkSource$MediaPlaylistChunk.getRawResponse()>
	//   24   50:astore_1        
				eventHandler.post(new Runnable() {

					public void run()
					{
						eventListener.onMediaPlaylistLoadCompleted(rawResponse);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field HlsChunkSource this$0>
					//    2    4:invokestatic    #30  <Method HlsChunkSource$EventListener HlsChunkSource.access$400(HlsChunkSource)>
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field byte[] val$rawResponse>
					//    5   11:invokeinterface #36  <Method void HlsChunkSource$EventListener.onMediaPlaylistLoadCompleted(byte[])>
					//    6   16:return          
					}

					final HlsChunkSource this$0;
					final byte val$rawResponse[];

			
			{
				this$0 = HlsChunkSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field HlsChunkSource this$0>
				rawResponse = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field byte[] val$rawResponse>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   25   51:aload_0         
	//   26   52:getfield        #125 <Field Handler eventHandler>
	//   27   55:new             #8   <Class HlsChunkSource$1>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokespecial   #630 <Method void HlsChunkSource$1(HlsChunkSource, byte[])>
	//   32   64:invokevirtual   #636 <Method boolean Handler.post(Runnable)>
	//   33   67:pop             
				return;
	//   34   68:return          
			}
		} else
		if(rawResponse instanceof EncryptionKeyChunk)
	//*  35   69:aload_1         
	//*  36   70:instanceof      #12  <Class HlsChunkSource$EncryptionKeyChunk>
	//*  37   73:ifeq            108
		{
			rawResponse = ((Chunk) ((EncryptionKeyChunk)rawResponse));
	//   38   76:aload_1         
	//   39   77:checkcast       #12  <Class HlsChunkSource$EncryptionKeyChunk>
	//   40   80:astore_1        
			scratchSpace = ((EncryptionKeyChunk) (rawResponse)).getDataHolder();
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #637 <Method byte[] HlsChunkSource$EncryptionKeyChunk.getDataHolder()>
	//   44   86:putfield        #312 <Field byte[] scratchSpace>
			setEncryptionData(((EncryptionKeyChunk) (rawResponse)).dataSpec.uri, ((EncryptionKeyChunk) (rawResponse)).iv, ((EncryptionKeyChunk) (rawResponse)).getResult());
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:getfield        #641 <Field DataSpec HlsChunkSource$EncryptionKeyChunk.dataSpec>
	//   48   94:getfield        #644 <Field Uri DataSpec.uri>
	//   49   97:aload_1         
	//   50   98:getfield        #647 <Field String HlsChunkSource$EncryptionKeyChunk.iv>
	//   51  101:aload_1         
	//   52  102:invokevirtual   #649 <Method byte[] HlsChunkSource$EncryptionKeyChunk.getResult()>
	//   53  105:invokespecial   #496 <Method void setEncryptionData(Uri, String, byte[])>
		}
	//   54  108:return          
	}

	public boolean onChunkLoadError(Chunk chunk, IOException ioexception)
	{
		if(chunk.bytesLoaded() == 0L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #656 <Method long Chunk.bytesLoaded()>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            325
		{
			boolean flag1 = chunk instanceof TsChunk;
	//    5    9:aload_1         
	//    6   10:instanceof      #256 <Class TsChunk>
	//    7   13:istore          6
			if((flag1 || (chunk instanceof MediaPlaylistChunk) || (chunk instanceof EncryptionKeyChunk)) && (ioexception instanceof com.google.android.exoplayer.upstream.HttpDataSource.InvalidResponseCodeException))
	//*   8   15:iload           6
	//*   9   17:ifne            34
	//*  10   20:aload_1         
	//*  11   21:instanceof      #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//*  12   24:ifne            34
	//*  13   27:aload_1         
	//*  14   28:instanceof      #12  <Class HlsChunkSource$EncryptionKeyChunk>
	//*  15   31:ifeq            325
	//*  16   34:aload_2         
	//*  17   35:instanceof      #658 <Class com.google.android.exoplayer.upstream.HttpDataSource$InvalidResponseCodeException>
	//*  18   38:ifeq            325
			{
				int j = ((com.google.android.exoplayer.upstream.HttpDataSource.InvalidResponseCodeException)ioexception).responseCode;
	//   19   41:aload_2         
	//   20   42:checkcast       #658 <Class com.google.android.exoplayer.upstream.HttpDataSource$InvalidResponseCodeException>
	//   21   45:getfield        #661 <Field int com.google.android.exoplayer.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//   22   48:istore          5
				if(j == 404 || j == 410)
	//*  23   50:iload           5
	//*  24   52:sipush          404
	//*  25   55:icmpeq          66
	//*  26   58:iload           5
	//*  27   60:sipush          410
	//*  28   63:icmpne          325
				{
					int i;
					if(flag1)
	//*  29   66:iload           6
	//*  30   68:ifeq            86
						i = getVariantIndex(((TsChunk)chunk).format);
	//   31   71:aload_0         
	//   32   72:aload_1         
	//   33   73:checkcast       #256 <Class TsChunk>
	//   34   76:getfield        #430 <Field Format TsChunk.format>
	//   35   79:invokespecial   #432 <Method int getVariantIndex(Format)>
	//   36   82:istore_3        
					else
	//*  37   83:goto            112
					if(chunk instanceof MediaPlaylistChunk)
	//*  38   86:aload_1         
	//*  39   87:instanceof      #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//*  40   90:ifeq            104
						i = ((MediaPlaylistChunk)chunk).variantIndex;
	//   41   93:aload_1         
	//   42   94:checkcast       #21  <Class HlsChunkSource$MediaPlaylistChunk>
	//   43   97:getfield        #618 <Field int HlsChunkSource$MediaPlaylistChunk.variantIndex>
	//   44  100:istore_3        
					else
	//*  45  101:goto            112
						i = ((EncryptionKeyChunk)chunk).variantIndex;
	//   46  104:aload_1         
	//   47  105:checkcast       #12  <Class HlsChunkSource$EncryptionKeyChunk>
	//   48  108:getfield        #662 <Field int HlsChunkSource$EncryptionKeyChunk.variantIndex>
	//   49  111:istore_3        
					boolean flag;
					if(variantBlacklistTimes[i] != 0L)
	//*  50  112:aload_0         
	//*  51  113:getfield        #189 <Field long[] variantBlacklistTimes>
	//*  52  116:iload_3         
	//*  53  117:laload          
	//*  54  118:lconst_0        
	//*  55  119:lcmp            
	//*  56  120:ifeq            129
						flag = true;
	//   57  123:iconst_1        
	//   58  124:istore          4
					else
	//*  59  126:goto            132
						flag = false;
	//   60  129:iconst_0        
	//   61  130:istore          4
					variantBlacklistTimes[i] = SystemClock.elapsedRealtime();
	//   62  132:aload_0         
	//   63  133:getfield        #189 <Field long[] variantBlacklistTimes>
	//   64  136:iload_3         
	//   65  137:invokestatic    #205 <Method long SystemClock.elapsedRealtime()>
	//   66  140:lastore         
					if(flag)
	//*  67  141:iload           4
	//*  68  143:ifeq            201
					{
						ioexception = ((IOException) (new StringBuilder()));
	//   69  146:new             #275 <Class StringBuilder>
	//   70  149:dup             
	//   71  150:invokespecial   #276 <Method void StringBuilder()>
	//   72  153:astore_2        
						((StringBuilder) (ioexception)).append("Already blacklisted variant (");
	//   73  154:aload_2         
	//   74  155:ldc2            #664 <String "Already blacklisted variant (">
	//   75  158:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   76  161:pop             
						((StringBuilder) (ioexception)).append(j);
	//   77  162:aload_2         
	//   78  163:iload           5
	//   79  165:invokevirtual   #667 <Method StringBuilder StringBuilder.append(int)>
	//   80  168:pop             
						((StringBuilder) (ioexception)).append("): ");
	//   81  169:aload_2         
	//   82  170:ldc2            #669 <String "): ">
	//   83  173:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   84  176:pop             
						((StringBuilder) (ioexception)).append(((Object) (chunk.dataSpec.uri)));
	//   85  177:aload_2         
	//   86  178:aload_1         
	//   87  179:getfield        #670 <Field DataSpec Chunk.dataSpec>
	//   88  182:getfield        #644 <Field Uri DataSpec.uri>
	//   89  185:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   90  188:pop             
						Log.w("HlsChunkSource", ((StringBuilder) (ioexception)).toString());
	//   91  189:ldc1            #49  <String "HlsChunkSource">
	//   92  191:aload_2         
	//   93  192:invokevirtual   #291 <Method String StringBuilder.toString()>
	//   94  195:invokestatic    #676 <Method int Log.w(String, String)>
	//   95  198:pop             
						return false;
	//   96  199:iconst_0        
	//   97  200:ireturn         
					}
					if(!allVariantsBlacklisted())
	//*  98  201:aload_0         
	//*  99  202:invokespecial   #678 <Method boolean allVariantsBlacklisted()>
	//* 100  205:ifne            263
					{
						ioexception = ((IOException) (new StringBuilder()));
	//  101  208:new             #275 <Class StringBuilder>
	//  102  211:dup             
	//  103  212:invokespecial   #276 <Method void StringBuilder()>
	//  104  215:astore_2        
						((StringBuilder) (ioexception)).append("Blacklisted variant (");
	//  105  216:aload_2         
	//  106  217:ldc2            #680 <String "Blacklisted variant (">
	//  107  220:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  108  223:pop             
						((StringBuilder) (ioexception)).append(j);
	//  109  224:aload_2         
	//  110  225:iload           5
	//  111  227:invokevirtual   #667 <Method StringBuilder StringBuilder.append(int)>
	//  112  230:pop             
						((StringBuilder) (ioexception)).append("): ");
	//  113  231:aload_2         
	//  114  232:ldc2            #669 <String "): ">
	//  115  235:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  116  238:pop             
						((StringBuilder) (ioexception)).append(((Object) (chunk.dataSpec.uri)));
	//  117  239:aload_2         
	//  118  240:aload_1         
	//  119  241:getfield        #670 <Field DataSpec Chunk.dataSpec>
	//  120  244:getfield        #644 <Field Uri DataSpec.uri>
	//  121  247:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//  122  250:pop             
						Log.w("HlsChunkSource", ((StringBuilder) (ioexception)).toString());
	//  123  251:ldc1            #49  <String "HlsChunkSource">
	//  124  253:aload_2         
	//  125  254:invokevirtual   #291 <Method String StringBuilder.toString()>
	//  126  257:invokestatic    #676 <Method int Log.w(String, String)>
	//  127  260:pop             
						return true;
	//  128  261:iconst_1        
	//  129  262:ireturn         
					} else
					{
						ioexception = ((IOException) (new StringBuilder()));
	//  130  263:new             #275 <Class StringBuilder>
	//  131  266:dup             
	//  132  267:invokespecial   #276 <Method void StringBuilder()>
	//  133  270:astore_2        
						((StringBuilder) (ioexception)).append("Final variant not blacklisted (");
	//  134  271:aload_2         
	//  135  272:ldc2            #682 <String "Final variant not blacklisted (">
	//  136  275:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  137  278:pop             
						((StringBuilder) (ioexception)).append(j);
	//  138  279:aload_2         
	//  139  280:iload           5
	//  140  282:invokevirtual   #667 <Method StringBuilder StringBuilder.append(int)>
	//  141  285:pop             
						((StringBuilder) (ioexception)).append("): ");
	//  142  286:aload_2         
	//  143  287:ldc2            #669 <String "): ">
	//  144  290:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  145  293:pop             
						((StringBuilder) (ioexception)).append(((Object) (chunk.dataSpec.uri)));
	//  146  294:aload_2         
	//  147  295:aload_1         
	//  148  296:getfield        #670 <Field DataSpec Chunk.dataSpec>
	//  149  299:getfield        #644 <Field Uri DataSpec.uri>
	//  150  302:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//  151  305:pop             
						Log.w("HlsChunkSource", ((StringBuilder) (ioexception)).toString());
	//  152  306:ldc1            #49  <String "HlsChunkSource">
	//  153  308:aload_2         
	//  154  309:invokevirtual   #291 <Method String StringBuilder.toString()>
	//  155  312:invokestatic    #676 <Method int Log.w(String, String)>
	//  156  315:pop             
						variantBlacklistTimes[i] = 0L;
	//  157  316:aload_0         
	//  158  317:getfield        #189 <Field long[] variantBlacklistTimes>
	//  159  320:iload_3         
	//  160  321:lconst_0        
	//  161  322:lastore         
						return false;
	//  162  323:iconst_0        
	//  163  324:ireturn         
					}
				}
			}
		}
		return false;
	//  164  325:iconst_0        
	//  165  326:ireturn         
	}

	public boolean prepare()
	{
		boolean flag1 = prepareCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #685 <Field boolean prepareCalled>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            44
		{
			prepareCalled = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #685 <Field boolean prepareCalled>
			try
			{
				trackSelector.selectTracks(masterPlaylist, ((HlsTrackSelector.Output) (this)));
	//   10   16:aload_0         
	//   11   17:getfield        #117 <Field HlsTrackSelector trackSelector>
	//   12   20:aload_0         
	//   13   21:getfield        #153 <Field HlsMasterPlaylist masterPlaylist>
	//   14   24:aload_0         
	//   15   25:invokeinterface #691 <Method void HlsTrackSelector.selectTracks(HlsMasterPlaylist, HlsTrackSelector$Output)>
				selectTrack(0);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #695 <Method void selectTrack(int)>
			}
	//*  19   35:goto            44
			catch(IOException ioexception)
	//*  20   38:astore_3        
			{
				fatalError = ioexception;
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:putfield        #454 <Field IOException fatalError>
			}
		}
		if(fatalError == null)
	//*  24   44:aload_0         
	//*  25   45:getfield        #454 <Field IOException fatalError>
	//*  26   48:ifnonnull       53
			flag = true;
	//   27   51:iconst_1        
	//   28   52:istore_1        
		return flag;
	//   29   53:iload_1         
	//   30   54:ireturn         
	}

	public void reset()
	{
		fatalError = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #454 <Field IOException fatalError>
	//    3    5:return          
	}

	public void seek()
	{
		if(isMaster)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean isMaster>
	//*   2    4:ifeq            14
			timestampAdjusterProvider.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #121 <Field PtsTimestampAdjusterProvider timestampAdjusterProvider>
	//    5   11:invokevirtual   #699 <Method void PtsTimestampAdjusterProvider.reset()>
	//    6   14:return          
	}

	public void selectTrack(int i)
	{
		selectedTrackIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #572 <Field int selectedTrackIndex>
		ExposedTrack exposedtrack = (ExposedTrack)tracks.get(selectedTrackIndex);
	//    3    5:aload_0         
	//    4    6:getfield        #146 <Field ArrayList tracks>
	//    5    9:aload_0         
	//    6   10:getfield        #572 <Field int selectedTrackIndex>
	//    7   13:invokevirtual   #573 <Method Object ArrayList.get(int)>
	//    8   16:checkcast       #18  <Class HlsChunkSource$ExposedTrack>
	//    9   19:astore_2        
		selectedVariantIndex = exposedtrack.defaultVariantIndex;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokestatic    #702 <Method int HlsChunkSource$ExposedTrack.access$100(HlsChunkSource$ExposedTrack)>
	//   13   25:putfield        #248 <Field int selectedVariantIndex>
		variants = exposedtrack.variants;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokestatic    #594 <Method Variant[] HlsChunkSource$ExposedTrack.access$000(HlsChunkSource$ExposedTrack)>
	//   17   33:putfield        #266 <Field Variant[] variants>
		Variant avariant[] = variants;
	//   18   36:aload_0         
	//   19   37:getfield        #266 <Field Variant[] variants>
	//   20   40:astore_2        
		variantPlaylists = new HlsMediaPlaylist[avariant.length];
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:arraylength     
	//   24   44:anewarray       HlsMediaPlaylist[]
	//   25   47:putfield        #209 <Field HlsMediaPlaylist[] variantPlaylists>
		variantLastPlaylistLoadTimesMs = new long[avariant.length];
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:arraylength     
	//   29   53:newarray        long[]
	//   30   55:putfield        #233 <Field long[] variantLastPlaylistLoadTimesMs>
		variantBlacklistTimes = new long[avariant.length];
	//   31   58:aload_0         
	//   32   59:aload_2         
	//   33   60:arraylength     
	//   34   61:newarray        long[]
	//   35   63:putfield        #189 <Field long[] variantBlacklistTimes>
	//   36   66:return          
	}

	private static final String AAC_FILE_EXTENSION = ".aac";
	private static final float BANDWIDTH_FRACTION = 0.8F;
	public static final long DEFAULT_MAX_BUFFER_TO_SWITCH_DOWN_MS = 20000L;
	public static final long DEFAULT_MIN_BUFFER_TO_SWITCH_UP_MS = 5000L;
	public static final long DEFAULT_PLAYLIST_BLACKLIST_MS = 60000L;
	private static final double LIVE_VARIANT_SWITCH_SAFETY_EXTRA_SECS = 2D;
	private static final String MP3_FILE_EXTENSION = ".mp3";
	private static final String TAG = "HlsChunkSource";
	private static final String VTT_FILE_EXTENSION = ".vtt";
	private static final String WEBVTT_FILE_EXTENSION = ".webvtt";
	private final BandwidthMeter bandwidthMeter;
	private final String baseUri;
	private final DataSource dataSource;
	private long durationUs;
	private byte encryptionIv[];
	private String encryptionIvString;
	private byte encryptionKey[];
	private Uri encryptionKeyUri;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private IOException fatalError;
	private final boolean isMaster;
	private boolean live;
	private final HlsMasterPlaylist masterPlaylist;
	private final long maxBufferDurationToSwitchDownUs;
	private final long minBufferDurationToSwitchUpUs;
	private final HlsPlaylistParser playlistParser;
	private boolean prepareCalled;
	private byte scratchSpace[];
	private int selectedTrackIndex;
	private int selectedVariantIndex;
	private final PtsTimestampAdjusterProvider timestampAdjusterProvider;
	private final HlsTrackSelector trackSelector;
	private final ArrayList tracks;
	private long variantBlacklistTimes[];
	private long variantLastPlaylistLoadTimesMs[];
	private HlsMediaPlaylist variantPlaylists[];
	private Variant variants[];


/*
	static EventListener access$400(HlsChunkSource hlschunksource)
	{
		return hlschunksource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field HlsChunkSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
