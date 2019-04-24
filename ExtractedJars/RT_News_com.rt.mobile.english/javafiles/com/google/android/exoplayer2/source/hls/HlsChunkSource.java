// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.*;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsDataSourceFactory, HlsMediaChunk, TimestampAdjusterProvider, HlsExtractorFactory

class HlsChunkSource
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
		//    3    3:invokestatic    #29  <Method byte[] Arrays.copyOf(byte[], int)>
		//    4    6:putfield        #31  <Field byte[] result>
		//    5    9:return          
		}

		public byte[] getResult()
		{
			return result;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field byte[] result>
		//    2    4:areturn         
		}

		public final String iv;
		private byte result[];

		public EncryptionKeyChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, byte abyte0[], String s)
		{
			super(datasource, dataspec, 3, format, i, obj, abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_3        
		//    4    4:aload_3         
		//    5    5:iload           4
		//    6    7:aload           5
		//    7    9:aload           6
		//    8   11:invokespecial   #16  <Method void DataChunk(DataSource, DataSpec, int, Format, int, Object, byte[])>
			iv = s;
		//    9   14:aload_0         
		//   10   15:aload           7
		//   11   17:putfield        #18  <Field String iv>
		//   12   20:return          
		}
	}

	public static final class HlsChunkHolder
	{

		public void clear()
		{
			chunk = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #23  <Field Chunk chunk>
			endOfStream = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field boolean endOfStream>
			playlist = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #27  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl playlist>
		//    9   15:return          
		}

		public Chunk chunk;
		public boolean endOfStream;
		public com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl playlist;

		public HlsChunkHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			clear();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #20  <Method void clear()>
		//    4    8:return          
		}
	}

	private static final class InitializationTrackSelection extends BaseTrackSelection
	{

		public int getSelectedIndex()
		{
			return selectedIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int selectedIndex>
		//    2    4:ireturn         
		}

		public Object getSelectionData()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getSelectionReason()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void updateSelectedTrack(long l, long l1, long l2)
		{
			l = SystemClock.elapsedRealtime();
		//    0    0:invokestatic    #39  <Method long SystemClock.elapsedRealtime()>
		//    1    3:lstore_1        
			if(!isBlacklisted(selectedIndex, l))
		//*   2    4:aload_0         
		//*   3    5:aload_0         
		//*   4    6:getfield        #25  <Field int selectedIndex>
		//*   5    9:lload_1         
		//*   6   10:invokevirtual   #43  <Method boolean isBlacklisted(int, long)>
		//*   7   13:ifne            17
				return;
		//    8   16:return          
			for(int i = length - 1; i >= 0; i--)
		//*   9   17:aload_0         
		//*  10   18:getfield        #46  <Field int length>
		//*  11   21:iconst_1        
		//*  12   22:isub            
		//*  13   23:istore          7
		//*  14   25:iload           7
		//*  15   27:iflt            56
				if(!isBlacklisted(i, l))
		//*  16   30:aload_0         
		//*  17   31:iload           7
		//*  18   33:lload_1         
		//*  19   34:invokevirtual   #43  <Method boolean isBlacklisted(int, long)>
		//*  20   37:ifne            47
				{
					selectedIndex = i;
		//   21   40:aload_0         
		//   22   41:iload           7
		//   23   43:putfield        #25  <Field int selectedIndex>
					return;
		//   24   46:return          
				}

		//   25   47:iload           7
		//   26   49:iconst_1        
		//   27   50:isub            
		//   28   51:istore          7
		//*  29   53:goto            25
			throw new IllegalStateException();
		//   30   56:new             #48  <Class IllegalStateException>
		//   31   59:dup             
		//   32   60:invokespecial   #51  <Method void IllegalStateException()>
		//   33   63:athrow          
		}

		private int selectedIndex;

		public InitializationTrackSelection(TrackGroup trackgroup, int ai[])
		{
			super(trackgroup, ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #13  <Method void BaseTrackSelection(TrackGroup, int[])>
			selectedIndex = indexOf(trackgroup.getFormat(0));
		//    4    6:aload_0         
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:iconst_0        
		//    8   10:invokevirtual   #19  <Method Format TrackGroup.getFormat(int)>
		//    9   13:invokevirtual   #23  <Method int indexOf(Format)>
		//   10   16:putfield        #25  <Field int selectedIndex>
		//   11   19:return          
		}
	}


	public HlsChunkSource(HlsExtractorFactory hlsextractorfactory, HlsPlaylistTracker hlsplaylisttracker, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl ahlsurl[], HlsDataSourceFactory hlsdatasourcefactory, TimestampAdjusterProvider timestampadjusterprovider, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		extractorFactory = hlsextractorfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field HlsExtractorFactory extractorFactory>
		playlistTracker = hlsplaylisttracker;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #58  <Field HlsPlaylistTracker playlistTracker>
		variants = ahlsurl;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #60  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[] variants>
		timestampAdjusterProvider = timestampadjusterprovider;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #62  <Field TimestampAdjusterProvider timestampAdjusterProvider>
		muxedCaptionFormats = list;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #64  <Field List muxedCaptionFormats>
		liveEdgeInPeriodTimeUs = 0x1L;
	//   17   31:aload_0         
	//   18   32:ldc2w           #65  <Long 0x1L>
	//   19   35:putfield        #68  <Field long liveEdgeInPeriodTimeUs>
		int i = 0;
	//   20   38:iconst_0        
	//   21   39:istore          7
		hlsextractorfactory = ((HlsExtractorFactory) (new Format[ahlsurl.length]));
	//   22   41:aload_3         
	//   23   42:arraylength     
	//   24   43:anewarray       Format[]
	//   25   46:astore_1        
		hlsplaylisttracker = ((HlsPlaylistTracker) (new int[ahlsurl.length]));
	//   26   47:aload_3         
	//   27   48:arraylength     
	//   28   49:newarray        int[]
	//   29   51:astore_2        
		for(; i < ahlsurl.length; i++)
	//*  30   52:iload           7
	//*  31   54:aload_3         
	//*  32   55:arraylength     
	//*  33   56:icmpge          85
		{
			hlsextractorfactory[i] = ((/*<invalid signature>*/java.lang.Object) (ahlsurl[i].format));
	//   34   59:aload_1         
	//   35   60:iload           7
	//   36   62:aload_3         
	//   37   63:iload           7
	//   38   65:aaload          
	//   39   66:getfield        #76  <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   40   69:aastore         
			hlsplaylisttracker[i] = i;
	//   41   70:aload_2         
	//   42   71:iload           7
	//   43   73:iload           7
	//   44   75:iastore         
		}

	//   45   76:iload           7
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore          7
	//*  49   82:goto            52
		mediaDataSource = hlsdatasourcefactory.createDataSource(1);
	//   50   85:aload_0         
	//   51   86:aload           4
	//   52   88:iconst_1        
	//   53   89:invokeinterface #82  <Method DataSource HlsDataSourceFactory.createDataSource(int)>
	//   54   94:putfield        #84  <Field DataSource mediaDataSource>
		encryptionDataSource = hlsdatasourcefactory.createDataSource(3);
	//   55   97:aload_0         
	//   56   98:aload           4
	//   57  100:iconst_3        
	//   58  101:invokeinterface #82  <Method DataSource HlsDataSourceFactory.createDataSource(int)>
	//   59  106:putfield        #86  <Field DataSource encryptionDataSource>
		trackGroup = new TrackGroup(((Format []) (hlsextractorfactory)));
	//   60  109:aload_0         
	//   61  110:new             #88  <Class TrackGroup>
	//   62  113:dup             
	//   63  114:aload_1         
	//   64  115:invokespecial   #91  <Method void TrackGroup(Format[])>
	//   65  118:putfield        #93  <Field TrackGroup trackGroup>
		trackSelection = ((TrackSelection) (new InitializationTrackSelection(trackGroup, ((int []) (hlsplaylisttracker)))));
	//   66  121:aload_0         
	//   67  122:new             #12  <Class HlsChunkSource$InitializationTrackSelection>
	//   68  125:dup             
	//   69  126:aload_0         
	//   70  127:getfield        #93  <Field TrackGroup trackGroup>
	//   71  130:aload_2         
	//   72  131:invokespecial   #96  <Method void HlsChunkSource$InitializationTrackSelection(TrackGroup, int[])>
	//   73  134:putfield        #98  <Field TrackSelection trackSelection>
	//   74  137:return          
	}

	private void clearEncryptionData()
	{
		encryptionKeyUri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #104 <Field Uri encryptionKeyUri>
		encryptionKey = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #106 <Field byte[] encryptionKey>
		encryptionIvString = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #108 <Field String encryptionIvString>
		encryptionIv = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #110 <Field byte[] encryptionIv>
	//   12   20:return          
	}

	private EncryptionKeyChunk newEncryptionKeyChunk(Uri uri, String s, int i, int j, Object obj)
	{
		uri = ((Uri) (new DataSpec(uri, 0L, -1L, ((String) (null)), 1)));
	//    0    0:new             #114 <Class DataSpec>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:ldc2w           #115 <Long -1L>
	//    5    9:aconst_null     
	//    6   10:iconst_1        
	//    7   11:invokespecial   #119 <Method void DataSpec(Uri, long, long, String, int)>
	//    8   14:astore_1        
		return new EncryptionKeyChunk(encryptionDataSource, ((DataSpec) (uri)), variants[i].format, j, obj, scratchSpace, s);
	//    9   15:new             #6   <Class HlsChunkSource$EncryptionKeyChunk>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #86  <Field DataSource encryptionDataSource>
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #60  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[] variants>
	//   16   28:iload_3         
	//   17   29:aaload          
	//   18   30:getfield        #76  <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   19   33:iload           4
	//   20   35:aload           5
	//   21   37:aload_0         
	//   22   38:getfield        #121 <Field byte[] scratchSpace>
	//   23   41:aload_2         
	//   24   42:invokespecial   #124 <Method void HlsChunkSource$EncryptionKeyChunk(DataSource, DataSpec, Format, int, Object, byte[], String)>
	//   25   45:areturn         
	}

	private long resolveTimeToLiveEdgeUs(long l)
	{
		long l2 = liveEdgeInPeriodTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long liveEdgeInPeriodTimeUs>
	//    2    4:lstore          6
		long l1 = 0x1L;
	//    3    6:ldc2w           #65  <Long 0x1L>
	//    4    9:lstore          4
		boolean flag;
		if(l2 != 0x1L)
	//*   5   11:lload           6
	//*   6   13:ldc2w           #65  <Long 0x1L>
	//*   7   16:lcmp            
	//*   8   17:ifeq            25
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore_3        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_3        
		if(flag)
	//*  14   27:iload_3         
	//*  15   28:ifeq            39
			l1 = liveEdgeInPeriodTimeUs - l;
	//   16   31:aload_0         
	//   17   32:getfield        #68  <Field long liveEdgeInPeriodTimeUs>
	//   18   35:lload_1         
	//   19   36:lsub            
	//   20   37:lstore          4
		return l1;
	//   21   39:lload           4
	//   22   41:lreturn         
	}

	private void setEncryptionData(Uri uri, String s, byte abyte0[])
	{
		String s1;
		if(Util.toLowerInvariant(s).startsWith("0x"))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #134 <Method String Util.toLowerInvariant(String)>
	//*   2    4:ldc1            #136 <String "0x">
	//*   3    6:invokevirtual   #142 <Method boolean String.startsWith(String)>
	//*   4    9:ifeq            22
			s1 = s.substring(2);
	//    5   12:aload_2         
	//    6   13:iconst_2        
	//    7   14:invokevirtual   #146 <Method String String.substring(int)>
	//    8   17:astore          5
		else
	//*   9   19:goto            25
			s1 = s;
	//   10   22:aload_2         
	//   11   23:astore          5
		byte abyte1[] = (new BigInteger(s1, 16)).toByteArray();
	//   12   25:new             #148 <Class BigInteger>
	//   13   28:dup             
	//   14   29:aload           5
	//   15   31:bipush          16
	//   16   33:invokespecial   #151 <Method void BigInteger(String, int)>
	//   17   36:invokevirtual   #155 <Method byte[] BigInteger.toByteArray()>
	//   18   39:astore          5
		byte abyte2[] = new byte[16];
	//   19   41:bipush          16
	//   20   43:newarray        byte[]
	//   21   45:astore          6
		int i;
		if(abyte1.length > 16)
	//*  22   47:aload           5
	//*  23   49:arraylength     
	//*  24   50:bipush          16
	//*  25   52:icmple          66
			i = abyte1.length - 16;
	//   26   55:aload           5
	//   27   57:arraylength     
	//   28   58:bipush          16
	//   29   60:isub            
	//   30   61:istore          4
		else
	//*  31   63:goto            69
			i = 0;
	//   32   66:iconst_0        
	//   33   67:istore          4
		System.arraycopy(((Object) (abyte1)), i, ((Object) (abyte2)), (abyte2.length - abyte1.length) + i, abyte1.length - i);
	//   34   69:aload           5
	//   35   71:iload           4
	//   36   73:aload           6
	//   37   75:aload           6
	//   38   77:arraylength     
	//   39   78:aload           5
	//   40   80:arraylength     
	//   41   81:isub            
	//   42   82:iload           4
	//   43   84:iadd            
	//   44   85:aload           5
	//   45   87:arraylength     
	//   46   88:iload           4
	//   47   90:isub            
	//   48   91:invokestatic    #161 <Method void System.arraycopy(Object, int, Object, int, int)>
		encryptionKeyUri = uri;
	//   49   94:aload_0         
	//   50   95:aload_1         
	//   51   96:putfield        #104 <Field Uri encryptionKeyUri>
		encryptionKey = abyte0;
	//   52   99:aload_0         
	//   53  100:aload_3         
	//   54  101:putfield        #106 <Field byte[] encryptionKey>
		encryptionIvString = s;
	//   55  104:aload_0         
	//   56  105:aload_2         
	//   57  106:putfield        #108 <Field String encryptionIvString>
		encryptionIv = abyte2;
	//   58  109:aload_0         
	//   59  110:aload           6
	//   60  112:putfield        #110 <Field byte[] encryptionIv>
	//   61  115:return          
	}

	private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsmediaplaylist)
	{
		long l;
		if(hlsmediaplaylist.hasEndTag)
	//*   0    0:aload_1         
	//*   1    1:getfield        #168 <Field boolean HlsMediaPlaylist.hasEndTag>
	//*   2    4:ifeq            14
			l = 0x1L;
	//    3    7:ldc2w           #65  <Long 0x1L>
	//    4   10:lstore_2        
		else
	//*   5   11:goto            29
			l = hlsmediaplaylist.getEndTimeUs() - playlistTracker.getInitialStartTimeUs();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #172 <Method long HlsMediaPlaylist.getEndTimeUs()>
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//   10   22:invokeinterface #177 <Method long HlsPlaylistTracker.getInitialStartTimeUs()>
	//   11   27:lsub            
	//   12   28:lstore_2        
		liveEdgeInPeriodTimeUs = l;
	//   13   29:aload_0         
	//   14   30:lload_2         
	//   15   31:putfield        #68  <Field long liveEdgeInPeriodTimeUs>
	//   16   34:return          
	}

	public void getNextChunk(HlsMediaChunk hlsmediachunk, long l, long l1, HlsChunkHolder hlschunkholder)
	{
		int i;
		int j;
		if(hlsmediachunk == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			i = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          7
		else
	//*   4    7:iload           7
	//*   5    9:istore          8
	//*   6   11:goto            30
			i = trackGroup.indexOf(hlsmediachunk.trackFormat);
	//    7   14:aload_0         
	//    8   15:getfield        #93  <Field TrackGroup trackGroup>
	//    9   18:aload_1         
	//   10   19:getfield        #184 <Field Format HlsMediaChunk.trackFormat>
	//   11   22:invokevirtual   #188 <Method int TrackGroup.indexOf(Format)>
	//   12   25:istore          7
		j = i;
	//*  13   27:goto            7
		long l4 = l1 - l;
	//   14   30:lload           4
	//   15   32:lload_2         
	//   16   33:lsub            
	//   17   34:lstore          14
		long l2 = resolveTimeToLiveEdgeUs(l);
	//   18   36:aload_0         
	//   19   37:lload_2         
	//   20   38:invokespecial   #190 <Method long resolveTimeToLiveEdgeUs(long)>
	//   21   41:lstore          10
		long l3;
		if(hlsmediachunk != null && !independentSegments)
	//*  22   43:aload_1         
	//*  23   44:ifnull          117
	//*  24   47:aload_0         
	//*  25   48:getfield        #192 <Field boolean independentSegments>
	//*  26   51:ifne            117
		{
			long l5 = hlsmediachunk.getDurationUs();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #195 <Method long HlsMediaChunk.getDurationUs()>
	//   29   58:lstore          16
			l3 = Math.max(0L, l4 - l5);
	//   30   60:lconst_0        
	//   31   61:lload           14
	//   32   63:lload           16
	//   33   65:lsub            
	//   34   66:invokestatic    #201 <Method long Math.max(long, long)>
	//   35   69:lstore          12
			if(l2 != 0x1L)
	//*  36   71:lload           10
	//*  37   73:ldc2w           #65  <Long 0x1L>
	//*  38   76:lcmp            
	//*  39   77:ifeq            102
			{
				l4 = Math.max(0L, l2 - l5);
	//   40   80:lconst_0        
	//   41   81:lload           10
	//   42   83:lload           16
	//   43   85:lsub            
	//   44   86:invokestatic    #201 <Method long Math.max(long, long)>
	//   45   89:lstore          14
				l2 = l3;
	//   46   91:lload           12
	//   47   93:lstore          10
				l3 = l4;
	//   48   95:lload           14
	//   49   97:lstore          12
			} else
	//*  50   99:goto            125
			{
				l4 = l2;
	//   51  102:lload           10
	//   52  104:lstore          14
				l2 = l3;
	//   53  106:lload           12
	//   54  108:lstore          10
				l3 = l4;
	//   55  110:lload           14
	//   56  112:lstore          12
			}
		} else
	//*  57  114:goto            125
		{
			l3 = l2;
	//   58  117:lload           10
	//   59  119:lstore          12
			l2 = l4;
	//   60  121:lload           14
	//   61  123:lstore          10
		}
		trackSelection.updateSelectedTrack(l, l2, l3);
	//   62  125:aload_0         
	//   63  126:getfield        #98  <Field TrackSelection trackSelection>
	//   64  129:lload_2         
	//   65  130:lload           10
	//   66  132:lload           12
	//   67  134:invokeinterface #207 <Method void TrackSelection.updateSelectedTrack(long, long, long)>
		i = trackSelection.getSelectedIndexInTrackGroup();
	//   68  139:aload_0         
	//   69  140:getfield        #98  <Field TrackSelection trackSelection>
	//   70  143:invokeinterface #211 <Method int TrackSelection.getSelectedIndexInTrackGroup()>
	//   71  148:istore          7
		boolean flag;
		if(j != i)
	//*  72  150:iload           8
	//*  73  152:iload           7
	//*  74  154:icmpeq          163
			flag = true;
	//   75  157:iconst_1        
	//   76  158:istore          9
		else
	//*  77  160:goto            166
			flag = false;
	//   78  163:iconst_0        
	//   79  164:istore          9
		com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl = variants[i];
	//   80  166:aload_0         
	//   81  167:getfield        #60  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[] variants>
	//   82  170:iload           7
	//   83  172:aaload          
	//   84  173:astore          20
		if(!playlistTracker.isSnapshotValid(hlsurl))
	//*  85  175:aload_0         
	//*  86  176:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//*  87  179:aload           20
	//*  88  181:invokeinterface #215 <Method boolean HlsPlaylistTracker.isSnapshotValid(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
	//*  89  186:ifne            236
		{
			hlschunkholder.playlist = hlsurl;
	//   90  189:aload           6
	//   91  191:aload           20
	//   92  193:putfield        #218 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl HlsChunkSource$HlsChunkHolder.playlist>
			boolean flag1 = seenExpectedPlaylistError;
	//   93  196:aload_0         
	//   94  197:getfield        #220 <Field boolean seenExpectedPlaylistError>
	//   95  200:istore          18
			if(expectedPlaylistUrl == hlsurl)
	//*  96  202:aload_0         
	//*  97  203:getfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
	//*  98  206:aload           20
	//*  99  208:if_acmpne       217
				i = 1;
	//  100  211:iconst_1        
	//  101  212:istore          7
			else
	//* 102  214:goto            220
				i = 0;
	//  103  217:iconst_0        
	//  104  218:istore          7
			seenExpectedPlaylistError = ((boolean) (flag1 & i));
	//  105  220:aload_0         
	//  106  221:iload           18
	//  107  223:iload           7
	//  108  225:iand            
	//  109  226:putfield        #220 <Field boolean seenExpectedPlaylistError>
			expectedPlaylistUrl = hlsurl;
	//  110  229:aload_0         
	//  111  230:aload           20
	//  112  232:putfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
			return;
	//  113  235:return          
		}
		HlsMediaPlaylist hlsmediaplaylist = playlistTracker.getPlaylistSnapshot(hlsurl);
	//  114  236:aload_0         
	//  115  237:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//  116  240:aload           20
	//  117  242:invokeinterface #226 <Method HlsMediaPlaylist HlsPlaylistTracker.getPlaylistSnapshot(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
	//  118  247:astore          19
		independentSegments = hlsmediaplaylist.hasIndependentSegmentsTag;
	//  119  249:aload_0         
	//  120  250:aload           19
	//  121  252:getfield        #229 <Field boolean HlsMediaPlaylist.hasIndependentSegmentsTag>
	//  122  255:putfield        #192 <Field boolean independentSegments>
		updateLiveEdgeTimeUs(hlsmediaplaylist);
	//  123  258:aload_0         
	//  124  259:aload           19
	//  125  261:invokespecial   #231 <Method void updateLiveEdgeTimeUs(HlsMediaPlaylist)>
		l2 = hlsmediaplaylist.startTimeUs - playlistTracker.getInitialStartTimeUs();
	//  126  264:aload           19
	//  127  266:getfield        #234 <Field long HlsMediaPlaylist.startTimeUs>
	//  128  269:aload_0         
	//  129  270:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//  130  273:invokeinterface #177 <Method long HlsPlaylistTracker.getInitialStartTimeUs()>
	//  131  278:lsub            
	//  132  279:lstore          10
		if(hlsmediachunk != null && !flag)
	//* 133  281:aload_1         
	//* 134  282:ifnull          305
	//* 135  285:iload           9
	//* 136  287:ifeq            293
	//* 137  290:goto            305
		{
			l = hlsmediachunk.getNextChunkIndex();
	//  138  293:aload_1         
	//  139  294:invokevirtual   #237 <Method long HlsMediaChunk.getNextChunkIndex()>
	//  140  297:lstore_2        
			l1 = l2;
	//  141  298:lload           10
	//  142  300:lstore          4
		} else
	//* 143  302:goto            519
		{
			l = hlsmediaplaylist.durationUs;
	//  144  305:aload           19
	//  145  307:getfield        #240 <Field long HlsMediaPlaylist.durationUs>
	//  146  310:lstore_2        
			if(hlsmediachunk != null && !independentSegments)
	//* 147  311:aload_1         
	//* 148  312:ifnull          334
	//* 149  315:aload_0         
	//* 150  316:getfield        #192 <Field boolean independentSegments>
	//* 151  319:ifeq            325
	//* 152  322:goto            334
				l1 = hlsmediachunk.startTimeUs;
	//  153  325:aload_1         
	//  154  326:getfield        #241 <Field long HlsMediaChunk.startTimeUs>
	//  155  329:lstore          4
	//* 156  331:goto            334
			if(!hlsmediaplaylist.hasEndTag && l1 >= l2 + l)
	//* 157  334:aload           19
	//* 158  336:getfield        #168 <Field boolean HlsMediaPlaylist.hasEndTag>
	//* 159  339:ifne            383
	//* 160  342:lload           4
	//* 161  344:lload           10
	//* 162  346:lload_2         
	//* 163  347:ladd            
	//* 164  348:lcmp            
	//* 165  349:iflt            383
			{
				l = hlsmediaplaylist.mediaSequence;
	//  166  352:aload           19
	//  167  354:getfield        #244 <Field long HlsMediaPlaylist.mediaSequence>
	//  168  357:lstore_2        
				l1 = hlsmediaplaylist.segments.size();
	//  169  358:aload           19
	//  170  360:getfield        #247 <Field List HlsMediaPlaylist.segments>
	//  171  363:invokeinterface #252 <Method int List.size()>
	//  172  368:i2l             
	//  173  369:lstore          4
				l += l1;
	//  174  371:lload_2         
	//  175  372:lload           4
	//  176  374:ladd            
	//  177  375:lstore_2        
				l1 = l2;
	//  178  376:lload           10
	//  179  378:lstore          4
			} else
	//* 180  380:goto            519
			{
				List list = hlsmediaplaylist.segments;
	//  181  383:aload           19
	//  182  385:getfield        #247 <Field List HlsMediaPlaylist.segments>
	//  183  388:astore          21
				boolean flag2;
				if(playlistTracker.isLive() && hlsmediachunk != null)
	//* 184  390:aload_0         
	//* 185  391:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//* 186  394:invokeinterface #256 <Method boolean HlsPlaylistTracker.isLive()>
	//* 187  399:ifeq            415
	//* 188  402:aload_1         
	//* 189  403:ifnonnull       409
	//* 190  406:goto            415
					flag2 = false;
	//  191  409:iconst_0        
	//  192  410:istore          18
				else
	//* 193  412:goto            418
					flag2 = true;
	//  194  415:iconst_1        
	//  195  416:istore          18
				l = (long)Util.binarySearchFloor(list, ((Object) (Long.valueOf(l1 - l2))), true, flag2) + hlsmediaplaylist.mediaSequence;
	//  196  418:aload           21
	//  197  420:lload           4
	//  198  422:lload           10
	//  199  424:lsub            
	//  200  425:invokestatic    #262 <Method Long Long.valueOf(long)>
	//  201  428:iconst_1        
	//  202  429:iload           18
	//  203  431:invokestatic    #266 <Method int Util.binarySearchFloor(List, Object, boolean, boolean)>
	//  204  434:i2l             
	//  205  435:aload           19
	//  206  437:getfield        #244 <Field long HlsMediaPlaylist.mediaSequence>
	//  207  440:ladd            
	//  208  441:lstore_2        
				if(l < hlsmediaplaylist.mediaSequence && hlsmediachunk != null)
	//* 209  442:lload_2         
	//* 210  443:aload           19
	//* 211  445:getfield        #244 <Field long HlsMediaPlaylist.mediaSequence>
	//* 212  448:lcmp            
	//* 213  449:ifge            515
	//* 214  452:aload_1         
	//* 215  453:ifnull          515
				{
					hlsurl = variants[j];
	//  216  456:aload_0         
	//  217  457:getfield        #60  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl[] variants>
	//  218  460:iload           8
	//  219  462:aaload          
	//  220  463:astore          20
					hlsmediaplaylist = playlistTracker.getPlaylistSnapshot(hlsurl);
	//  221  465:aload_0         
	//  222  466:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//  223  469:aload           20
	//  224  471:invokeinterface #226 <Method HlsMediaPlaylist HlsPlaylistTracker.getPlaylistSnapshot(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
	//  225  476:astore          19
					l1 = hlsmediaplaylist.startTimeUs;
	//  226  478:aload           19
	//  227  480:getfield        #234 <Field long HlsMediaPlaylist.startTimeUs>
	//  228  483:lstore          4
					l2 = playlistTracker.getInitialStartTimeUs();
	//  229  485:aload_0         
	//  230  486:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//  231  489:invokeinterface #177 <Method long HlsPlaylistTracker.getInitialStartTimeUs()>
	//  232  494:lstore          10
					l = hlsmediachunk.getNextChunkIndex();
	//  233  496:aload_1         
	//  234  497:invokevirtual   #237 <Method long HlsMediaChunk.getNextChunkIndex()>
	//  235  500:lstore_2        
					l1 -= l2;
	//  236  501:lload           4
	//  237  503:lload           10
	//  238  505:lsub            
	//  239  506:lstore          4
					i = j;
	//  240  508:iload           8
	//  241  510:istore          7
				} else
	//* 242  512:goto            519
				{
					l1 = l2;
	//  243  515:lload           10
	//  244  517:lstore          4
				}
			}
		}
		if(l < hlsmediaplaylist.mediaSequence)
	//* 245  519:lload_2         
	//* 246  520:aload           19
	//* 247  522:getfield        #244 <Field long HlsMediaPlaylist.mediaSequence>
	//* 248  525:lcmp            
	//* 249  526:ifge            541
		{
			fatalError = ((IOException) (new BehindLiveWindowException()));
	//  250  529:aload_0         
	//  251  530:new             #268 <Class BehindLiveWindowException>
	//  252  533:dup             
	//  253  534:invokespecial   #269 <Method void BehindLiveWindowException()>
	//  254  537:putfield        #271 <Field IOException fatalError>
			return;
	//  255  540:return          
		}
		j = (int)(l - hlsmediaplaylist.mediaSequence);
	//  256  541:lload_2         
	//  257  542:aload           19
	//  258  544:getfield        #244 <Field long HlsMediaPlaylist.mediaSequence>
	//  259  547:lsub            
	//  260  548:l2i             
	//  261  549:istore          8
		if(j >= hlsmediaplaylist.segments.size())
	//* 262  551:iload           8
	//* 263  553:aload           19
	//* 264  555:getfield        #247 <Field List HlsMediaPlaylist.segments>
	//* 265  558:invokeinterface #252 <Method int List.size()>
	//* 266  563:icmplt          628
		{
			if(hlsmediaplaylist.hasEndTag)
	//* 267  566:aload           19
	//* 268  568:getfield        #168 <Field boolean HlsMediaPlaylist.hasEndTag>
	//* 269  571:ifeq            581
			{
				hlschunkholder.endOfStream = true;
	//  270  574:aload           6
	//  271  576:iconst_1        
	//  272  577:putfield        #274 <Field boolean HlsChunkSource$HlsChunkHolder.endOfStream>
				return;
	//  273  580:return          
			}
			i = 1;
	//  274  581:iconst_1        
	//  275  582:istore          7
			hlschunkholder.playlist = hlsurl;
	//  276  584:aload           6
	//  277  586:aload           20
	//  278  588:putfield        #218 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl HlsChunkSource$HlsChunkHolder.playlist>
			boolean flag3 = seenExpectedPlaylistError;
	//  279  591:aload_0         
	//  280  592:getfield        #220 <Field boolean seenExpectedPlaylistError>
	//  281  595:istore          18
			if(expectedPlaylistUrl != hlsurl)
	//* 282  597:aload_0         
	//* 283  598:getfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
	//* 284  601:aload           20
	//* 285  603:if_acmpne       609
	//* 286  606:goto            612
				i = 0;
	//  287  609:iconst_0        
	//  288  610:istore          7
			seenExpectedPlaylistError = ((boolean) (i & flag3));
	//  289  612:aload_0         
	//  290  613:iload           7
	//  291  615:iload           18
	//  292  617:iand            
	//  293  618:putfield        #220 <Field boolean seenExpectedPlaylistError>
			expectedPlaylistUrl = hlsurl;
	//  294  621:aload_0         
	//  295  622:aload           20
	//  296  624:putfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
			return;
	//  297  627:return          
		}
		seenExpectedPlaylistError = false;
	//  298  628:aload_0         
	//  299  629:iconst_0        
	//  300  630:putfield        #220 <Field boolean seenExpectedPlaylistError>
		DataSpec dataspec = null;
	//  301  633:aconst_null     
	//  302  634:astore          21
		expectedPlaylistUrl = null;
	//  303  636:aload_0         
	//  304  637:aconst_null     
	//  305  638:putfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
		com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment segment = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment)hlsmediaplaylist.segments.get(j);
	//  306  641:aload           19
	//  307  643:getfield        #247 <Field List HlsMediaPlaylist.segments>
	//  308  646:iload           8
	//  309  648:invokeinterface #278 <Method Object List.get(int)>
	//  310  653:checkcast       #280 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment>
	//  311  656:astore          22
		if(segment.fullSegmentEncryptionKeyUri != null)
	//* 312  658:aload           22
	//* 313  660:getfield        #283 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.fullSegmentEncryptionKeyUri>
	//* 314  663:ifnull          763
		{
			Uri uri = UriUtil.resolveToUri(hlsmediaplaylist.baseUri, segment.fullSegmentEncryptionKeyUri);
	//  315  666:aload           19
	//  316  668:getfield        #286 <Field String HlsMediaPlaylist.baseUri>
	//  317  671:aload           22
	//  318  673:getfield        #283 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.fullSegmentEncryptionKeyUri>
	//  319  676:invokestatic    #292 <Method Uri UriUtil.resolveToUri(String, String)>
	//  320  679:astore          23
			if(!uri.equals(((Object) (encryptionKeyUri))))
	//* 321  681:aload           23
	//* 322  683:aload_0         
	//* 323  684:getfield        #104 <Field Uri encryptionKeyUri>
	//* 324  687:invokevirtual   #298 <Method boolean Uri.equals(Object)>
	//* 325  690:ifne            730
			{
				hlschunkholder.chunk = ((Chunk) (newEncryptionKeyChunk(uri, segment.encryptionIV, i, trackSelection.getSelectionReason(), trackSelection.getSelectionData())));
	//  326  693:aload           6
	//  327  695:aload_0         
	//  328  696:aload           23
	//  329  698:aload           22
	//  330  700:getfield        #301 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.encryptionIV>
	//  331  703:iload           7
	//  332  705:aload_0         
	//  333  706:getfield        #98  <Field TrackSelection trackSelection>
	//  334  709:invokeinterface #304 <Method int TrackSelection.getSelectionReason()>
	//  335  714:aload_0         
	//  336  715:getfield        #98  <Field TrackSelection trackSelection>
	//  337  718:invokeinterface #308 <Method Object TrackSelection.getSelectionData()>
	//  338  723:invokespecial   #310 <Method HlsChunkSource$EncryptionKeyChunk newEncryptionKeyChunk(Uri, String, int, int, Object)>
	//  339  726:putfield        #314 <Field Chunk HlsChunkSource$HlsChunkHolder.chunk>
				return;
	//  340  729:return          
			}
			if(!Util.areEqual(((Object) (segment.encryptionIV)), ((Object) (encryptionIvString))))
	//* 341  730:aload           22
	//* 342  732:getfield        #301 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.encryptionIV>
	//* 343  735:aload_0         
	//* 344  736:getfield        #108 <Field String encryptionIvString>
	//* 345  739:invokestatic    #318 <Method boolean Util.areEqual(Object, Object)>
	//* 346  742:ifne            767
				setEncryptionData(uri, segment.encryptionIV, encryptionKey);
	//  347  745:aload_0         
	//  348  746:aload           23
	//  349  748:aload           22
	//  350  750:getfield        #301 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.encryptionIV>
	//  351  753:aload_0         
	//  352  754:getfield        #106 <Field byte[] encryptionKey>
	//  353  757:invokespecial   #320 <Method void setEncryptionData(Uri, String, byte[])>
		} else
	//* 354  760:goto            767
		{
			clearEncryptionData();
	//  355  763:aload_0         
	//  356  764:invokespecial   #322 <Method void clearEncryptionData()>
		}
		Object obj = ((Object) (segment.initializationSegment));
	//  357  767:aload           22
	//  358  769:getfield        #326 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.initializationSegment>
	//  359  772:astore          23
		if(obj != null)
	//* 360  774:aload           23
	//* 361  776:ifnull          812
			dataspec = new DataSpec(UriUtil.resolveToUri(hlsmediaplaylist.baseUri, ((com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) (obj)).url), ((com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) (obj)).byterangeOffset, ((com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) (obj)).byterangeLength, ((String) (null)));
	//  362  779:new             #114 <Class DataSpec>
	//  363  782:dup             
	//  364  783:aload           19
	//  365  785:getfield        #286 <Field String HlsMediaPlaylist.baseUri>
	//  366  788:aload           23
	//  367  790:getfield        #329 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.url>
	//  368  793:invokestatic    #292 <Method Uri UriUtil.resolveToUri(String, String)>
	//  369  796:aload           23
	//  370  798:getfield        #332 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeOffset>
	//  371  801:aload           23
	//  372  803:getfield        #335 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeLength>
	//  373  806:aconst_null     
	//  374  807:invokespecial   #338 <Method void DataSpec(Uri, long, long, String)>
	//  375  810:astore          21
		l1 += segment.relativeStartTimeUs;
	//  376  812:lload           4
	//  377  814:aload           22
	//  378  816:getfield        #341 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.relativeStartTimeUs>
	//  379  819:ladd            
	//  380  820:lstore          4
		i = hlsmediaplaylist.discontinuitySequence + segment.relativeDiscontinuitySequence;
	//  381  822:aload           19
	//  382  824:getfield        #345 <Field int HlsMediaPlaylist.discontinuitySequence>
	//  383  827:aload           22
	//  384  829:getfield        #348 <Field int com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.relativeDiscontinuitySequence>
	//  385  832:iadd            
	//  386  833:istore          7
		obj = ((Object) (timestampAdjusterProvider.getAdjuster(i)));
	//  387  835:aload_0         
	//  388  836:getfield        #62  <Field TimestampAdjusterProvider timestampAdjusterProvider>
	//  389  839:iload           7
	//  390  841:invokevirtual   #354 <Method com.google.android.exoplayer2.util.TimestampAdjuster TimestampAdjusterProvider.getAdjuster(int)>
	//  391  844:astore          23
		DataSpec dataspec1 = new DataSpec(UriUtil.resolveToUri(hlsmediaplaylist.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, ((String) (null)));
	//  392  846:new             #114 <Class DataSpec>
	//  393  849:dup             
	//  394  850:aload           19
	//  395  852:getfield        #286 <Field String HlsMediaPlaylist.baseUri>
	//  396  855:aload           22
	//  397  857:getfield        #329 <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.url>
	//  398  860:invokestatic    #292 <Method Uri UriUtil.resolveToUri(String, String)>
	//  399  863:aload           22
	//  400  865:getfield        #332 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeOffset>
	//  401  868:aload           22
	//  402  870:getfield        #335 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeLength>
	//  403  873:aconst_null     
	//  404  874:invokespecial   #338 <Method void DataSpec(Uri, long, long, String)>
	//  405  877:astore          24
		hlschunkholder.chunk = ((Chunk) (new HlsMediaChunk(extractorFactory, mediaDataSource, dataspec1, dataspec, hlsurl, muxedCaptionFormats, trackSelection.getSelectionReason(), trackSelection.getSelectionData(), l1, l1 + segment.durationUs, l, i, segment.hasGapTag, isTimestampMaster, ((com.google.android.exoplayer2.util.TimestampAdjuster) (obj)), hlsmediachunk, hlsmediaplaylist.drmInitData, encryptionKey, encryptionIv)));
	//  406  879:aload           6
	//  407  881:new             #181 <Class HlsMediaChunk>
	//  408  884:dup             
	//  409  885:aload_0         
	//  410  886:getfield        #56  <Field HlsExtractorFactory extractorFactory>
	//  411  889:aload_0         
	//  412  890:getfield        #84  <Field DataSource mediaDataSource>
	//  413  893:aload           24
	//  414  895:aload           21
	//  415  897:aload           20
	//  416  899:aload_0         
	//  417  900:getfield        #64  <Field List muxedCaptionFormats>
	//  418  903:aload_0         
	//  419  904:getfield        #98  <Field TrackSelection trackSelection>
	//  420  907:invokeinterface #304 <Method int TrackSelection.getSelectionReason()>
	//  421  912:aload_0         
	//  422  913:getfield        #98  <Field TrackSelection trackSelection>
	//  423  916:invokeinterface #308 <Method Object TrackSelection.getSelectionData()>
	//  424  921:lload           4
	//  425  923:lload           4
	//  426  925:aload           22
	//  427  927:getfield        #355 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.durationUs>
	//  428  930:ladd            
	//  429  931:lload_2         
	//  430  932:iload           7
	//  431  934:aload           22
	//  432  936:getfield        #358 <Field boolean com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.hasGapTag>
	//  433  939:aload_0         
	//  434  940:getfield        #360 <Field boolean isTimestampMaster>
	//  435  943:aload           23
	//  436  945:aload_1         
	//  437  946:aload           19
	//  438  948:getfield        #364 <Field com.google.android.exoplayer2.drm.DrmInitData HlsMediaPlaylist.drmInitData>
	//  439  951:aload_0         
	//  440  952:getfield        #106 <Field byte[] encryptionKey>
	//  441  955:aload_0         
	//  442  956:getfield        #110 <Field byte[] encryptionIv>
	//  443  959:invokespecial   #367 <Method void HlsMediaChunk(HlsExtractorFactory, DataSource, DataSpec, DataSpec, com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl, List, int, Object, long, long, long, int, boolean, boolean, com.google.android.exoplayer2.util.TimestampAdjuster, HlsMediaChunk, com.google.android.exoplayer2.drm.DrmInitData, byte[], byte[])>
	//  444  962:putfield        #314 <Field Chunk HlsChunkSource$HlsChunkHolder.chunk>
	//  445  965:return          
	}

	public TrackGroup getTrackGroup()
	{
		return trackGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field TrackGroup trackGroup>
	//    2    4:areturn         
	}

	public TrackSelection getTrackSelection()
	{
		return trackSelection;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field TrackSelection trackSelection>
	//    2    4:areturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field IOException fatalError>
	//*   2    4:ifnull          12
			throw fatalError;
	//    3    7:aload_0         
	//    4    8:getfield        #271 <Field IOException fatalError>
	//    5   11:athrow          
		if(expectedPlaylistUrl != null && seenExpectedPlaylistError)
	//*   6   12:aload_0         
	//*   7   13:getfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
	//*   8   16:ifnull          39
	//*   9   19:aload_0         
	//*  10   20:getfield        #220 <Field boolean seenExpectedPlaylistError>
	//*  11   23:ifeq            39
			playlistTracker.maybeThrowPlaylistRefreshError(expectedPlaylistUrl);
	//   12   26:aload_0         
	//   13   27:getfield        #58  <Field HlsPlaylistTracker playlistTracker>
	//   14   30:aload_0         
	//   15   31:getfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
	//   16   34:invokeinterface #378 <Method void HlsPlaylistTracker.maybeThrowPlaylistRefreshError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
	//   17   39:return          
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
		if(chunk instanceof EncryptionKeyChunk)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class HlsChunkSource$EncryptionKeyChunk>
	//*   2    4:ifeq            39
		{
			chunk = ((Chunk) ((EncryptionKeyChunk)chunk));
	//    3    7:aload_1         
	//    4    8:checkcast       #6   <Class HlsChunkSource$EncryptionKeyChunk>
	//    5   11:astore_1        
			scratchSpace = ((EncryptionKeyChunk) (chunk)).getDataHolder();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #384 <Method byte[] HlsChunkSource$EncryptionKeyChunk.getDataHolder()>
	//    9   17:putfield        #121 <Field byte[] scratchSpace>
			setEncryptionData(((EncryptionKeyChunk) (chunk)).dataSpec.uri, ((EncryptionKeyChunk) (chunk)).iv, ((EncryptionKeyChunk) (chunk)).getResult());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #388 <Field DataSpec HlsChunkSource$EncryptionKeyChunk.dataSpec>
	//   13   25:getfield        #391 <Field Uri DataSpec.uri>
	//   14   28:aload_1         
	//   15   29:getfield        #394 <Field String HlsChunkSource$EncryptionKeyChunk.iv>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #397 <Method byte[] HlsChunkSource$EncryptionKeyChunk.getResult()>
	//   18   36:invokespecial   #320 <Method void setEncryptionData(Uri, String, byte[])>
		}
	//   19   39:return          
	}

	public boolean onChunkLoadError(Chunk chunk, boolean flag, IOException ioexception)
	{
		return flag && ChunkedTrackBlacklistUtil.maybeBlacklistTrack(trackSelection, trackSelection.indexOf(trackGroup.indexOf(chunk.trackFormat)), ((Exception) (ioexception)));
	//    0    0:iload_2         
	//    1    1:ifeq            37
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field TrackSelection trackSelection>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TrackSelection trackSelection>
	//    6   12:aload_0         
	//    7   13:getfield        #93  <Field TrackGroup trackGroup>
	//    8   16:aload_1         
	//    9   17:getfield        #402 <Field Format Chunk.trackFormat>
	//   10   20:invokevirtual   #188 <Method int TrackGroup.indexOf(Format)>
	//   11   23:invokeinterface #405 <Method int TrackSelection.indexOf(int)>
	//   12   28:aload_3         
	//   13   29:invokestatic    #411 <Method boolean ChunkedTrackBlacklistUtil.maybeBlacklistTrack(TrackSelection, int, Exception)>
	//   14   32:ifeq            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	public boolean onPlaylistError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl, boolean flag)
	{
		int i = trackGroup.indexOf(hlsurl.format);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field TrackGroup trackGroup>
	//    2    4:aload_1         
	//    3    5:getfield        #76  <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//    4    8:invokevirtual   #188 <Method int TrackGroup.indexOf(Format)>
	//    5   11:istore_3        
		boolean flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
		if(i == -1)
	//*   8   15:iload_3         
	//*   9   16:iconst_m1       
	//*  10   17:icmpne          22
			return true;
	//   11   20:iconst_1        
	//   12   21:ireturn         
		int j = trackSelection.indexOf(i);
	//   13   22:aload_0         
	//   14   23:getfield        #98  <Field TrackSelection trackSelection>
	//   15   26:iload_3         
	//   16   27:invokeinterface #405 <Method int TrackSelection.indexOf(int)>
	//   17   32:istore          4
		if(j == -1)
	//*  18   34:iload           4
	//*  19   36:iconst_m1       
	//*  20   37:icmpne          42
			return true;
	//   21   40:iconst_1        
	//   22   41:ireturn         
		boolean flag2 = seenExpectedPlaylistError;
	//   23   42:aload_0         
	//   24   43:getfield        #220 <Field boolean seenExpectedPlaylistError>
	//   25   46:istore          6
		if(expectedPlaylistUrl == hlsurl)
	//*  26   48:aload_0         
	//*  27   49:getfield        #222 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl expectedPlaylistUrl>
	//*  28   52:aload_1         
	//*  29   53:if_acmpne       61
			i = 1;
	//   30   56:iconst_1        
	//   31   57:istore_3        
		else
	//*  32   58:goto            63
			i = 0;
	//   33   61:iconst_0        
	//   34   62:istore_3        
		seenExpectedPlaylistError = i | flag2;
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:iload           6
	//   38   67:ior             
	//   39   68:putfield        #220 <Field boolean seenExpectedPlaylistError>
		if(flag)
	//*  40   71:iload_2         
	//*  41   72:ifeq            97
		{
			if(trackSelection.blacklist(j, 60000L))
	//*  42   75:aload_0         
	//*  43   76:getfield        #98  <Field TrackSelection trackSelection>
	//*  44   79:iload           4
	//*  45   81:ldc2w           #414 <Long 60000L>
	//*  46   84:invokeinterface #419 <Method boolean TrackSelection.blacklist(int, long)>
	//*  47   89:ifeq            94
				return true;
	//   48   92:iconst_1        
	//   49   93:ireturn         
			flag1 = false;
	//   50   94:iconst_0        
	//   51   95:istore          5
		}
		return flag1;
	//   52   97:iload           5
	//   53   99:ireturn         
	}

	public void reset()
	{
		fatalError = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #271 <Field IOException fatalError>
	//    3    5:return          
	}

	public void selectTracks(TrackSelection trackselection)
	{
		trackSelection = trackselection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field TrackSelection trackSelection>
	//    3    5:return          
	}

	public void setIsTimestampMaster(boolean flag)
	{
		isTimestampMaster = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #360 <Field boolean isTimestampMaster>
	//    3    5:return          
	}

	private final DataSource encryptionDataSource;
	private byte encryptionIv[];
	private String encryptionIvString;
	private byte encryptionKey[];
	private Uri encryptionKeyUri;
	private com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl expectedPlaylistUrl;
	private final HlsExtractorFactory extractorFactory;
	private IOException fatalError;
	private boolean independentSegments;
	private boolean isTimestampMaster;
	private long liveEdgeInPeriodTimeUs;
	private final DataSource mediaDataSource;
	private final List muxedCaptionFormats;
	private final HlsPlaylistTracker playlistTracker;
	private byte scratchSpace[];
	private boolean seenExpectedPlaylistError;
	private final TimestampAdjusterProvider timestampAdjusterProvider;
	private final TrackGroup trackGroup;
	private TrackSelection trackSelection;
	private final com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl variants[];
}
