// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.*;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.hls.offline:
//			HlsDownloadAction

public final class HlsDownloadHelper extends DownloadHelper
{

	public HlsDownloadHelper(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void DownloadHelper()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Uri uri>
		manifestDataSourceFactory = factory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//    8   14:return          
	}

	private static Format[] toFormats(List list)
	{
		Format aformat[] = new Format[list.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #31  <Method int List.size()>
	//    2    6:anewarray       Format[]
	//    3    9:astore_2        
		for(int i = 0; i < list.size(); i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:aload_0         
	//*   8   14:invokeinterface #31  <Method int List.size()>
	//*   9   19:icmpge          45
			aformat[i] = ((com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl)list.get(i)).format;
	//   10   22:aload_2         
	//   11   23:iload_1         
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokeinterface #37  <Method Object List.get(int)>
	//   15   31:checkcast       #39  <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl>
	//   16   34:getfield        #43  <Field Format com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.format>
	//   17   37:aastore         

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            12
		return aformat;
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	private static List toRenditionKeys(List list, int ai[])
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #49  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #31  <Method int List.size()>
	//    4   10:invokespecial   #52  <Method void ArrayList(int)>
	//    5   13:astore_3        
		for(int i = 0; i < list.size(); i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_2        
	//*   8   16:iload_2         
	//*   9   17:aload_0         
	//*  10   18:invokeinterface #31  <Method int List.size()>
	//*  11   23:icmpge          71
		{
			TrackKey trackkey = (TrackKey)list.get(i);
	//   12   26:aload_0         
	//   13   27:iload_2         
	//   14   28:invokeinterface #37  <Method Object List.get(int)>
	//   15   33:checkcast       #54  <Class TrackKey>
	//   16   36:astore          4
			((List) (arraylist)).add(((Object) (new RenditionKey(ai[trackkey.groupIndex], trackkey.trackIndex))));
	//   17   38:aload_3         
	//   18   39:new             #56  <Class RenditionKey>
	//   19   42:dup             
	//   20   43:aload_1         
	//   21   44:aload           4
	//   22   46:getfield        #60  <Field int TrackKey.groupIndex>
	//   23   49:iaload          
	//   24   50:aload           4
	//   25   52:getfield        #63  <Field int TrackKey.trackIndex>
	//   26   55:invokespecial   #66  <Method void RenditionKey(int, int)>
	//   27   58:invokeinterface #70  <Method boolean List.add(Object)>
	//   28   63:pop             
		}

	//   29   64:iload_2         
	//   30   65:iconst_1        
	//   31   66:iadd            
	//   32   67:istore_2        
	//*  33   68:goto            16
		return ((List) (arraylist));
	//   34   71:aload_3         
	//   35   72:areturn         
	}

	public volatile DownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return ((DownloadAction) (getDownloadAction(abyte0, list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #77  <Method HlsDownloadAction getDownloadAction(byte[], List)>
	//    4    6:areturn         
	}

	public HlsDownloadAction getDownloadAction(byte abyte0[], List list)
	{
		Assertions.checkNotNull(((Object) (renditionTypes)));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int[] renditionTypes>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return new HlsDownloadAction(uri, false, abyte0, toRenditionKeys(list, renditionTypes));
	//    4    8:new             #88  <Class HlsDownloadAction>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Uri uri>
	//    8   16:iconst_0        
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #80  <Field int[] renditionTypes>
	//   13   23:invokestatic    #90  <Method List toRenditionKeys(List, int[])>
	//   14   26:invokespecial   #93  <Method void HlsDownloadAction(Uri, boolean, byte[], List)>
	//   15   29:areturn         
	}

	public int getPeriodCount()
	{
		Assertions.checkNotNull(((Object) (playlist)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field HlsPlaylist playlist>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return 1;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public HlsPlaylist getPlaylist()
	{
		Assertions.checkNotNull(((Object) (playlist)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field HlsPlaylist playlist>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return playlist;
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field HlsPlaylist playlist>
	//    6   12:areturn         
	}

	public volatile DownloadAction getRemoveAction(byte abyte0[])
	{
		return ((DownloadAction) (getRemoveAction(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method HlsDownloadAction getRemoveAction(byte[])>
	//    3    5:areturn         
	}

	public HlsDownloadAction getRemoveAction(byte abyte0[])
	{
		return new HlsDownloadAction(uri, true, abyte0, Collections.emptyList());
	//    0    0:new             #88  <Class HlsDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri uri>
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokestatic    #110 <Method List Collections.emptyList()>
	//    7   13:invokespecial   #93  <Method void HlsDownloadAction(Uri, boolean, byte[], List)>
	//    8   16:areturn         
	}

	public TrackGroupArray getTrackGroups(int i)
	{
		Assertions.checkNotNull(((Object) (playlist)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field HlsPlaylist playlist>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		boolean flag = playlist instanceof HlsMediaPlaylist;
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field HlsPlaylist playlist>
	//    6   12:instanceof      #114 <Class HlsMediaPlaylist>
	//    7   15:istore_3        
		int j = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		if(flag)
	//*  10   18:iload_3         
	//*  11   19:ifeq            33
		{
			renditionTypes = new int[0];
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:newarray        int[]
	//   15   26:putfield        #80  <Field int[] renditionTypes>
			return TrackGroupArray.EMPTY;
	//   16   29:getstatic       #120 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//   17   32:areturn         
		}
		HlsMasterPlaylist hlsmasterplaylist = (HlsMasterPlaylist)playlist;
	//   18   33:aload_0         
	//   19   34:getfield        #97  <Field HlsPlaylist playlist>
	//   20   37:checkcast       #122 <Class HlsMasterPlaylist>
	//   21   40:astore          4
		TrackGroup atrackgroup[] = new TrackGroup[3];
	//   22   42:iconst_3        
	//   23   43:anewarray       TrackGroup[]
	//   24   46:astore          5
		renditionTypes = new int[3];
	//   25   48:aload_0         
	//   26   49:iconst_3        
	//   27   50:newarray        int[]
	//   28   52:putfield        #80  <Field int[] renditionTypes>
		if(!hlsmasterplaylist.variants.isEmpty())
	//*  29   55:aload           4
	//*  30   57:getfield        #128 <Field List HlsMasterPlaylist.variants>
	//*  31   60:invokeinterface #132 <Method boolean List.isEmpty()>
	//*  32   65:ifne            96
		{
			renditionTypes[0] = 0;
	//   33   68:aload_0         
	//   34   69:getfield        #80  <Field int[] renditionTypes>
	//   35   72:iconst_0        
	//   36   73:iconst_0        
	//   37   74:iastore         
			atrackgroup[0] = new TrackGroup(toFormats(hlsmasterplaylist.variants));
	//   38   75:aload           5
	//   39   77:iconst_0        
	//   40   78:new             #124 <Class TrackGroup>
	//   41   81:dup             
	//   42   82:aload           4
	//   43   84:getfield        #128 <Field List HlsMasterPlaylist.variants>
	//   44   87:invokestatic    #134 <Method Format[] toFormats(List)>
	//   45   90:invokespecial   #137 <Method void TrackGroup(Format[])>
	//   46   93:aastore         
			j = 1;
	//   47   94:iconst_1        
	//   48   95:istore_2        
		}
		i = j;
	//   49   96:iload_2         
	//   50   97:istore_1        
		if(!hlsmasterplaylist.audios.isEmpty())
	//*  51   98:aload           4
	//*  52  100:getfield        #140 <Field List HlsMasterPlaylist.audios>
	//*  53  103:invokeinterface #132 <Method boolean List.isEmpty()>
	//*  54  108:ifne            141
		{
			renditionTypes[j] = 1;
	//   55  111:aload_0         
	//   56  112:getfield        #80  <Field int[] renditionTypes>
	//   57  115:iload_2         
	//   58  116:iconst_1        
	//   59  117:iastore         
			atrackgroup[j] = new TrackGroup(toFormats(hlsmasterplaylist.audios));
	//   60  118:aload           5
	//   61  120:iload_2         
	//   62  121:new             #124 <Class TrackGroup>
	//   63  124:dup             
	//   64  125:aload           4
	//   65  127:getfield        #140 <Field List HlsMasterPlaylist.audios>
	//   66  130:invokestatic    #134 <Method Format[] toFormats(List)>
	//   67  133:invokespecial   #137 <Method void TrackGroup(Format[])>
	//   68  136:aastore         
			i = j + 1;
	//   69  137:iload_2         
	//   70  138:iconst_1        
	//   71  139:iadd            
	//   72  140:istore_1        
		}
		j = i;
	//   73  141:iload_1         
	//   74  142:istore_2        
		if(!hlsmasterplaylist.subtitles.isEmpty())
	//*  75  143:aload           4
	//*  76  145:getfield        #143 <Field List HlsMasterPlaylist.subtitles>
	//*  77  148:invokeinterface #132 <Method boolean List.isEmpty()>
	//*  78  153:ifne            186
		{
			renditionTypes[i] = 2;
	//   79  156:aload_0         
	//   80  157:getfield        #80  <Field int[] renditionTypes>
	//   81  160:iload_1         
	//   82  161:iconst_2        
	//   83  162:iastore         
			atrackgroup[i] = new TrackGroup(toFormats(hlsmasterplaylist.subtitles));
	//   84  163:aload           5
	//   85  165:iload_1         
	//   86  166:new             #124 <Class TrackGroup>
	//   87  169:dup             
	//   88  170:aload           4
	//   89  172:getfield        #143 <Field List HlsMasterPlaylist.subtitles>
	//   90  175:invokestatic    #134 <Method Format[] toFormats(List)>
	//   91  178:invokespecial   #137 <Method void TrackGroup(Format[])>
	//   92  181:aastore         
			j = i + 1;
	//   93  182:iload_1         
	//   94  183:iconst_1        
	//   95  184:iadd            
	//   96  185:istore_2        
		}
		return new TrackGroupArray((TrackGroup[])Arrays.copyOf(((Object []) (atrackgroup)), j));
	//   97  186:new             #116 <Class TrackGroupArray>
	//   98  189:dup             
	//   99  190:aload           5
	//  100  192:iload_2         
	//  101  193:invokestatic    #149 <Method Object[] Arrays.copyOf(Object[], int)>
	//  102  196:checkcast       #151 <Class TrackGroup[]>
	//  103  199:invokespecial   #154 <Method void TrackGroupArray(TrackGroup[])>
	//  104  202:areturn         
	}

	protected void prepareInternal()
		throws IOException
	{
		playlist = (HlsPlaylist)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new HlsPlaylistParser())), uri);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//    3    5:invokeinterface #163 <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    4   10:new             #165 <Class HlsPlaylistParser>
	//    5   13:dup             
	//    6   14:invokespecial   #166 <Method void HlsPlaylistParser()>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field Uri uri>
	//    9   21:invokestatic    #172 <Method Object ParsingLoadable.load(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, Uri)>
	//   10   24:checkcast       #174 <Class HlsPlaylist>
	//   11   27:putfield        #97  <Field HlsPlaylist playlist>
	//   12   30:return          
	}

	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private HlsPlaylist playlist;
	private int renditionTypes[];
	private final Uri uri;
}
