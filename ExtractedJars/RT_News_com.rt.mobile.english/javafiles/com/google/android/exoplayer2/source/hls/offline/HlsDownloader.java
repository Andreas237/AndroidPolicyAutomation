// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.hls.playlist.*;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.*;

public final class HlsDownloader extends SegmentDownloader
{

	public HlsDownloader(Uri uri, List list, DownloaderConstructorHelper downloaderconstructorhelper)
	{
		super(uri, list, downloaderconstructorhelper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #9   <Method void SegmentDownloader(Uri, List, DownloaderConstructorHelper)>
	//    5    7:return          
	}

	private static void addResolvedUris(String s, List list, List list1)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #20  <Method int List.size()>
	//*   5    9:icmpge          43
			list1.add(((Object) (UriUtil.resolveToUri(s, ((com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl)list.get(i)).url))));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokeinterface #24  <Method Object List.get(int)>
	//   11   21:checkcast       #26  <Class com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl>
	//   12   24:getfield        #30  <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl.url>
	//   13   27:invokestatic    #36  <Method Uri UriUtil.resolveToUri(String, String)>
	//   14   30:invokeinterface #40  <Method boolean List.add(Object)>
	//   15   35:pop             

	//   16   36:iload_3         
	//   17   37:iconst_1        
	//   18   38:iadd            
	//   19   39:istore_3        
	//*  20   40:goto            2
	//   21   43:return          
	}

	private static void addSegment(ArrayList arraylist, HlsMediaPlaylist hlsmediaplaylist, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment segment, HashSet hashset)
	{
		long l = hlsmediaplaylist.startTimeUs + segment.relativeStartTimeUs;
	//    0    0:aload_1         
	//    1    1:getfield        #49  <Field long HlsMediaPlaylist.startTimeUs>
	//    2    4:aload_2         
	//    3    5:getfield        #54  <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.relativeStartTimeUs>
	//    4    8:ladd            
	//    5    9:lstore          4
		if(segment.fullSegmentEncryptionKeyUri != null)
	//*   6   11:aload_2         
	//*   7   12:getfield        #57  <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.fullSegmentEncryptionKeyUri>
	//*   8   15:ifnull          63
		{
			Uri uri = UriUtil.resolveToUri(hlsmediaplaylist.baseUri, segment.fullSegmentEncryptionKeyUri);
	//    9   18:aload_1         
	//   10   19:getfield        #60  <Field String HlsMediaPlaylist.baseUri>
	//   11   22:aload_2         
	//   12   23:getfield        #57  <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.fullSegmentEncryptionKeyUri>
	//   13   26:invokestatic    #36  <Method Uri UriUtil.resolveToUri(String, String)>
	//   14   29:astore          6
			if(hashset.add(((Object) (uri))))
	//*  15   31:aload_3         
	//*  16   32:aload           6
	//*  17   34:invokevirtual   #63  <Method boolean HashSet.add(Object)>
	//*  18   37:ifeq            63
				arraylist.add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(l, new DataSpec(uri)))));
	//   19   40:aload_0         
	//   20   41:new             #65  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//   21   44:dup             
	//   22   45:lload           4
	//   23   47:new             #67  <Class DataSpec>
	//   24   50:dup             
	//   25   51:aload           6
	//   26   53:invokespecial   #70  <Method void DataSpec(Uri)>
	//   27   56:invokespecial   #73  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//   28   59:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   29   62:pop             
		}
		arraylist.add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(l, new DataSpec(UriUtil.resolveToUri(hlsmediaplaylist.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, ((String) (null)))))));
	//   30   63:aload_0         
	//   31   64:new             #65  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//   32   67:dup             
	//   33   68:lload           4
	//   34   70:new             #67  <Class DataSpec>
	//   35   73:dup             
	//   36   74:aload_1         
	//   37   75:getfield        #60  <Field String HlsMediaPlaylist.baseUri>
	//   38   78:aload_2         
	//   39   79:getfield        #77  <Field String com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.url>
	//   40   82:invokestatic    #36  <Method Uri UriUtil.resolveToUri(String, String)>
	//   41   85:aload_2         
	//   42   86:getfield        #80  <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeOffset>
	//   43   89:aload_2         
	//   44   90:getfield        #83  <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.byterangeLength>
	//   45   93:aconst_null     
	//   46   94:invokespecial   #86  <Method void DataSpec(Uri, long, long, String)>
	//   47   97:invokespecial   #73  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//   48  100:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   49  103:pop             
	//   50  104:return          
	}

	private static HlsPlaylist loadManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		datasource = ((DataSource) (new ParsingLoadable(datasource, uri, 4, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new HlsPlaylistParser())))));
	//    0    0:new             #93  <Class ParsingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_4        
	//    5    7:new             #95  <Class HlsPlaylistParser>
	//    6   10:dup             
	//    7   11:invokespecial   #98  <Method void HlsPlaylistParser()>
	//    8   14:invokespecial   #101 <Method void ParsingLoadable(DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//    9   17:astore_0        
		((ParsingLoadable) (datasource)).load();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #104 <Method void ParsingLoadable.load()>
		return (HlsPlaylist)((ParsingLoadable) (datasource)).getResult();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #108 <Method Object ParsingLoadable.getResult()>
	//   14   26:checkcast       #110 <Class HlsPlaylist>
	//   15   29:areturn         
	}

	protected volatile FilterableManifest getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return ((FilterableManifest) (getManifest(datasource, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #115 <Method HlsPlaylist getManifest(DataSource, Uri)>
	//    4    6:areturn         
	}

	protected HlsPlaylist getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return loadManifest(datasource, uri);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #117 <Method HlsPlaylist loadManifest(DataSource, Uri)>
	//    3    5:areturn         
	}

	protected volatile List getSegments(DataSource datasource, FilterableManifest filterablemanifest, boolean flag)
		throws InterruptedException, IOException
	{
		return getSegments(datasource, (HlsPlaylist)filterablemanifest, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #110 <Class HlsPlaylist>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #124 <Method List getSegments(DataSource, HlsPlaylist, boolean)>
	//    6   10:areturn         
	}

	protected List getSegments(DataSource datasource, HlsPlaylist hlsplaylist, boolean flag)
		throws IOException
	{
		ArrayList arraylist1;
		HashSet hashset;
		Iterator iterator;
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #75  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void ArrayList()>
	//    3    7:astore          5
		if(hlsplaylist instanceof HlsMasterPlaylist)
	//*   4    9:aload_2         
	//*   5   10:instanceof      #127 <Class HlsMasterPlaylist>
	//*   6   13:ifeq            63
		{
			hlsplaylist = ((HlsPlaylist) ((HlsMasterPlaylist)hlsplaylist));
	//    7   16:aload_2         
	//    8   17:checkcast       #127 <Class HlsMasterPlaylist>
	//    9   20:astore_2        
			addResolvedUris(((HlsMasterPlaylist) (hlsplaylist)).baseUri, ((HlsMasterPlaylist) (hlsplaylist)).variants, ((List) (arraylist)));
	//   10   21:aload_2         
	//   11   22:getfield        #128 <Field String HlsMasterPlaylist.baseUri>
	//   12   25:aload_2         
	//   13   26:getfield        #132 <Field List HlsMasterPlaylist.variants>
	//   14   29:aload           5
	//   15   31:invokestatic    #134 <Method void addResolvedUris(String, List, List)>
			addResolvedUris(((HlsMasterPlaylist) (hlsplaylist)).baseUri, ((HlsMasterPlaylist) (hlsplaylist)).audios, ((List) (arraylist)));
	//   16   34:aload_2         
	//   17   35:getfield        #128 <Field String HlsMasterPlaylist.baseUri>
	//   18   38:aload_2         
	//   19   39:getfield        #137 <Field List HlsMasterPlaylist.audios>
	//   20   42:aload           5
	//   21   44:invokestatic    #134 <Method void addResolvedUris(String, List, List)>
			addResolvedUris(((HlsMasterPlaylist) (hlsplaylist)).baseUri, ((HlsMasterPlaylist) (hlsplaylist)).subtitles, ((List) (arraylist)));
	//   22   47:aload_2         
	//   23   48:getfield        #128 <Field String HlsMasterPlaylist.baseUri>
	//   24   51:aload_2         
	//   25   52:getfield        #140 <Field List HlsMasterPlaylist.subtitles>
	//   26   55:aload           5
	//   27   57:invokestatic    #134 <Method void addResolvedUris(String, List, List)>
		} else
	//*  28   60:goto            76
		{
			arraylist.add(((Object) (Uri.parse(hlsplaylist.baseUri))));
	//   29   63:aload           5
	//   30   65:aload_2         
	//   31   66:getfield        #141 <Field String HlsPlaylist.baseUri>
	//   32   69:invokestatic    #147 <Method Uri Uri.parse(String)>
	//   33   72:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   34   75:pop             
		}
		arraylist1 = new ArrayList();
	//   35   76:new             #75  <Class ArrayList>
	//   36   79:dup             
	//   37   80:invokespecial   #125 <Method void ArrayList()>
	//   38   83:astore          7
		hashset = new HashSet();
	//   39   85:new             #62  <Class HashSet>
	//   40   88:dup             
	//   41   89:invokespecial   #148 <Method void HashSet()>
	//   42   92:astore          8
		iterator = arraylist.iterator();
	//   43   94:aload           5
	//   44   96:invokevirtual   #152 <Method Iterator ArrayList.iterator()>
	//   45   99:astore          9
_L2:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   46  101:aload           9
	//   47  103:invokeinterface #158 <Method boolean Iterator.hasNext()>
	//   48  108:ifeq            292
		hlsplaylist = ((HlsPlaylist) ((Uri)iterator.next()));
	//   49  111:aload           9
	//   50  113:invokeinterface #161 <Method Object Iterator.next()>
	//   51  118:checkcast       #143 <Class Uri>
	//   52  121:astore_2        
		HlsMediaPlaylist hlsmediaplaylist;
		hlsmediaplaylist = (HlsMediaPlaylist)loadManifest(datasource, ((Uri) (hlsplaylist)));
	//   53  122:aload_1         
	//   54  123:aload_2         
	//   55  124:invokestatic    #117 <Method HlsPlaylist loadManifest(DataSource, Uri)>
	//   56  127:checkcast       #45  <Class HlsMediaPlaylist>
	//   57  130:astore          10
		arraylist1.add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(hlsmediaplaylist.startTimeUs, new DataSpec(((Uri) (hlsplaylist)))))));
	//   58  132:aload           7
	//   59  134:new             #65  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//   60  137:dup             
	//   61  138:aload           10
	//   62  140:getfield        #49  <Field long HlsMediaPlaylist.startTimeUs>
	//   63  143:new             #67  <Class DataSpec>
	//   64  146:dup             
	//   65  147:aload_2         
	//   66  148:invokespecial   #70  <Method void DataSpec(Uri)>
	//   67  151:invokespecial   #73  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//   68  154:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   69  157:pop             
		hlsplaylist = null;
	//   70  158:aconst_null     
	//   71  159:astore_2        
		List list = hlsmediaplaylist.segments;
	//   72  160:aload           10
	//   73  162:getfield        #164 <Field List HlsMediaPlaylist.segments>
	//   74  165:astore          11
		int i = 0;
	//   75  167:iconst_0        
	//   76  168:istore          4
		while(i < list.size()) 
	//*  77  170:iload           4
	//*  78  172:aload           11
	//*  79  174:invokeinterface #20  <Method int List.size()>
	//*  80  179:icmpge          101
		{
			com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment segment1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment)list.get(i);
	//   81  182:aload           11
	//   82  184:iload           4
	//   83  186:invokeinterface #24  <Method Object List.get(int)>
	//   84  191:checkcast       #51  <Class com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment>
	//   85  194:astore          12
			com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment segment = segment1.initializationSegment;
	//   86  196:aload           12
	//   87  198:getfield        #168 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.initializationSegment>
	//   88  201:astore          6
			Object obj = ((Object) (hlsplaylist));
	//   89  203:aload_2         
	//   90  204:astore          5
			if(segment != null)
	//*  91  206:aload           6
	//*  92  208:ifnull          235
			{
				obj = ((Object) (hlsplaylist));
	//   93  211:aload_2         
	//   94  212:astore          5
				if(segment != hlsplaylist)
	//*  95  214:aload           6
	//*  96  216:aload_2         
	//*  97  217:if_acmpeq       235
				{
					addSegment(arraylist1, hlsmediaplaylist, segment, hashset);
	//   98  220:aload           7
	//   99  222:aload           10
	//  100  224:aload           6
	//  101  226:aload           8
	//  102  228:invokestatic    #170 <Method void addSegment(ArrayList, HlsMediaPlaylist, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment, HashSet)>
					obj = ((Object) (segment));
	//  103  231:aload           6
	//  104  233:astore          5
				}
			}
			addSegment(arraylist1, hlsmediaplaylist, segment1, hashset);
	//  105  235:aload           7
	//  106  237:aload           10
	//  107  239:aload           12
	//  108  241:aload           8
	//  109  243:invokestatic    #170 <Method void addSegment(ArrayList, HlsMediaPlaylist, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment, HashSet)>
			i++;
	//  110  246:iload           4
	//  111  248:iconst_1        
	//  112  249:iadd            
	//  113  250:istore          4
			hlsplaylist = ((HlsPlaylist) (obj));
	//  114  252:aload           5
	//  115  254:astore_2        
		}
		continue; /* Loop/switch isn't completed */
	//  116  255:goto            170
		IOException ioexception;
		ioexception;
	//  117  258:astore          5
		if(!flag)
	//* 118  260:iload_3         
	//* 119  261:ifne            267
			throw ioexception;
	//  120  264:aload           5
	//  121  266:athrow          
		arraylist1.add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(0L, new DataSpec(((Uri) (hlsplaylist)))))));
	//  122  267:aload           7
	//  123  269:new             #65  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//  124  272:dup             
	//  125  273:lconst_0        
	//  126  274:new             #67  <Class DataSpec>
	//  127  277:dup             
	//  128  278:aload_2         
	//  129  279:invokespecial   #70  <Method void DataSpec(Uri)>
	//  130  282:invokespecial   #73  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//  131  285:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//  132  288:pop             
		if(true) goto _L2; else goto _L1
	//  133  289:goto            101
_L1:
		return ((List) (arraylist1));
	//  134  292:aload           7
	//  135  294:areturn         
	}
}
