// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.dash.*;
import com.google.android.exoplayer2.source.dash.manifest.*;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloader extends SegmentDownloader
{

	public DashDownloader(Uri uri, List list, DownloaderConstructorHelper downloaderconstructorhelper)
	{
		super(uri, list, downloaderconstructorhelper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #9   <Method void SegmentDownloader(Uri, List, DownloaderConstructorHelper)>
	//    5    7:return          
	}

	private static void addSegment(long l, String s, RangedUri rangeduri, ArrayList arraylist)
	{
		arraylist.add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(l, new DataSpec(rangeduri.resolveUri(s), rangeduri.start, rangeduri.length, ((String) (null)))))));
	//    0    0:aload           4
	//    1    2:new             #16  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//    2    5:dup             
	//    3    6:lload_0         
	//    4    7:new             #18  <Class DataSpec>
	//    5   10:dup             
	//    6   11:aload_3         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #24  <Method Uri RangedUri.resolveUri(String)>
	//    9   16:aload_3         
	//   10   17:getfield        #28  <Field long RangedUri.start>
	//   11   20:aload_3         
	//   12   21:getfield        #31  <Field long RangedUri.length>
	//   13   24:aconst_null     
	//   14   25:invokespecial   #34  <Method void DataSpec(Uri, long, long, String)>
	//   15   28:invokespecial   #37  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//   16   31:invokevirtual   #43  <Method boolean ArrayList.add(Object)>
	//   17   34:pop             
	//   18   35:return          
	}

	private static void addSegmentsForAdaptationSet(DataSource datasource, AdaptationSet adaptationset, long l, long l1, boolean flag, ArrayList arraylist)
		throws IOException, InterruptedException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
_L3:
		if(i >= adaptationset.representations.size()) goto _L2; else goto _L1
	//    2    3:iload           8
	//    3    5:aload_1         
	//    4    6:getfield        #56  <Field List AdaptationSet.representations>
	//    5    9:invokeinterface #62  <Method int List.size()>
	//    6   14:icmpge          224
_L1:
		Object obj = ((Object) ((Representation)adaptationset.representations.get(i)));
	//    7   17:aload_1         
	//    8   18:getfield        #56  <Field List AdaptationSet.representations>
	//    9   21:iload           8
	//   10   23:invokeinterface #66  <Method Object List.get(int)>
	//   11   28:checkcast       #68  <Class Representation>
	//   12   31:astore          18
		DashSegmentIndex dashsegmentindex = getSegmentIndex(datasource, adaptationset.type, ((Representation) (obj)));
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:getfield        #72  <Field int AdaptationSet.type>
	//   16   38:aload           18
	//   17   40:invokestatic    #76  <Method DashSegmentIndex getSegmentIndex(DataSource, int, Representation)>
	//   18   43:astore          16
		if(dashsegmentindex == null)
	//*  19   45:aload           16
	//*  20   47:ifnonnull       60
		{
			try
			{
				throw new DownloadException("Missing segment index");
	//   21   50:new             #78  <Class DownloadException>
	//   22   53:dup             
	//   23   54:ldc1            #80  <String "Missing segment index">
	//   24   56:invokespecial   #83  <Method void DownloadException(String)>
	//   25   59:athrow          
			}
	//*  26   60:aload           16
	//*  27   62:lload           4
	//*  28   64:invokeinterface #89  <Method int DashSegmentIndex.getSegmentCount(long)>
	//*  29   69:istore          9
	//*  30   71:iload           9
	//*  31   73:iconst_m1       
	//*  32   74:icmpne          87
	//*  33   77:new             #78  <Class DownloadException>
	//*  34   80:dup             
	//*  35   81:ldc1            #91  <String "Unbounded segment index">
	//*  36   83:invokespecial   #83  <Method void DownloadException(String)>
	//*  37   86:athrow          
	//*  38   87:aload           18
	//*  39   89:getfield        #95  <Field String Representation.baseUrl>
	//*  40   92:astore          17
	//*  41   94:aload           18
	//*  42   96:invokevirtual   #99  <Method RangedUri Representation.getInitializationUri()>
	//*  43   99:astore          19
	//*  44  101:aload           19
	//*  45  103:ifnull          116
	//*  46  106:lload_2         
	//*  47  107:aload           17
	//*  48  109:aload           19
	//*  49  111:aload           7
	//*  50  113:invokestatic    #101 <Method void addSegment(long, String, RangedUri, ArrayList)>
	//*  51  116:aload           18
	//*  52  118:invokevirtual   #104 <Method RangedUri Representation.getIndexUri()>
	//*  53  121:astore          18
	//*  54  123:aload           18
	//*  55  125:ifnull          138
	//*  56  128:lload_2         
	//*  57  129:aload           17
	//*  58  131:aload           18
	//*  59  133:aload           7
	//*  60  135:invokestatic    #101 <Method void addSegment(long, String, RangedUri, ArrayList)>
	//*  61  138:aload           16
	//*  62  140:invokeinterface #108 <Method long DashSegmentIndex.getFirstSegmentNum()>
	//*  63  145:lstore          12
	//*  64  147:iload           9
	//*  65  149:i2l             
	//*  66  150:lstore          14
	//*  67  152:lload           12
	//*  68  154:lstore          10
	//*  69  156:lload           10
	//*  70  158:lload           12
	//*  71  160:lload           14
	//*  72  162:ladd            
	//*  73  163:lconst_1        
	//*  74  164:lsub            
	//*  75  165:lcmp            
	//*  76  166:ifgt            215
	//*  77  169:lload_2         
	//*  78  170:aload           16
	//*  79  172:lload           10
	//*  80  174:invokeinterface #112 <Method long DashSegmentIndex.getTimeUs(long)>
	//*  81  179:ladd            
	//*  82  180:aload           17
	//*  83  182:aload           16
	//*  84  184:lload           10
	//*  85  186:invokeinterface #116 <Method RangedUri DashSegmentIndex.getSegmentUrl(long)>
	//*  86  191:aload           7
	//*  87  193:invokestatic    #101 <Method void addSegment(long, String, RangedUri, ArrayList)>
	//*  88  196:lload           10
	//*  89  198:lconst_1        
	//*  90  199:ladd            
	//*  91  200:lstore          10
	//*  92  202:goto            156
			catch(IOException ioexception)
	//*  93  205:astore          16
			{
				if(!flag)
	//*  94  207:iload           6
	//*  95  209:ifne            215
					throw ioexception;
	//   96  212:aload           16
	//   97  214:athrow          
			}
		} else
		{
			int j = dashsegmentindex.getSegmentCount(l1);
			if(j == -1)
				throw new DownloadException("Unbounded segment index");
			String s = ((Representation) (obj)).baseUrl;
			RangedUri rangeduri = ((Representation) (obj)).getInitializationUri();
			if(rangeduri != null)
				addSegment(l, s, rangeduri, arraylist);
			obj = ((Object) (((Representation) (obj)).getIndexUri()));
			if(obj != null)
				addSegment(l, s, ((RangedUri) (obj)), arraylist);
			long l3 = dashsegmentindex.getFirstSegmentNum();
			long l4 = j;
			for(long l2 = l3; l2 <= (l3 + l4) - 1L; l2++)
				addSegment(l + dashsegmentindex.getTimeUs(l2), s, dashsegmentindex.getSegmentUrl(l2), arraylist);

			continue; /* Loop/switch isn't completed */
		}
		i++;
	//   98  215:iload           8
	//   99  217:iconst_1        
	//  100  218:iadd            
	//  101  219:istore          8
		  goto _L3
	//* 102  221:goto            3
_L2:
	//  103  224:return          
	}

	private static DashSegmentIndex getSegmentIndex(DataSource datasource, int i, Representation representation)
		throws IOException, InterruptedException
	{
		DashSegmentIndex dashsegmentindex = representation.getIndex();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #123 <Method DashSegmentIndex Representation.getIndex()>
	//    2    4:astore_3        
		if(dashsegmentindex != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          11
			return dashsegmentindex;
	//    5    9:aload_3         
	//    6   10:areturn         
		datasource = ((DataSource) (DashUtil.loadChunkIndex(datasource, i, representation)));
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_2         
	//   10   14:invokestatic    #129 <Method com.google.android.exoplayer2.extractor.ChunkIndex DashUtil.loadChunkIndex(DataSource, int, Representation)>
	//   11   17:astore_0        
		if(datasource == null)
	//*  12   18:aload_0         
	//*  13   19:ifnonnull       24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		else
			return ((DashSegmentIndex) (new DashWrappingSegmentIndex(((com.google.android.exoplayer2.extractor.ChunkIndex) (datasource)), representation.presentationTimeOffsetUs)));
	//   16   24:new             #131 <Class DashWrappingSegmentIndex>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:aload_2         
	//   20   30:getfield        #134 <Field long Representation.presentationTimeOffsetUs>
	//   21   33:invokespecial   #137 <Method void DashWrappingSegmentIndex(com.google.android.exoplayer2.extractor.ChunkIndex, long)>
	//   22   36:areturn         
	}

	protected volatile FilterableManifest getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return ((FilterableManifest) (getManifest(datasource, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #143 <Method DashManifest getManifest(DataSource, Uri)>
	//    4    6:areturn         
	}

	protected DashManifest getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return DashUtil.loadManifest(datasource, uri);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #146 <Method DashManifest DashUtil.loadManifest(DataSource, Uri)>
	//    3    5:areturn         
	}

	protected volatile List getSegments(DataSource datasource, FilterableManifest filterablemanifest, boolean flag)
		throws InterruptedException, IOException
	{
		return getSegments(datasource, (DashManifest)filterablemanifest, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #150 <Class DashManifest>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #153 <Method List getSegments(DataSource, DashManifest, boolean)>
	//    6   10:areturn         
	}

	protected List getSegments(DataSource datasource, DashManifest dashmanifest, boolean flag)
		throws InterruptedException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #39  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #156 <Method void ArrayList()>
	//    3    7:astore          11
		for(int i = 0; i < dashmanifest.getPeriodCount(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #159 <Method int DashManifest.getPeriodCount()>
	//*   9   18:icmpge          110
		{
			Object obj = ((Object) (dashmanifest.getPeriod(i)));
	//   10   21:aload_2         
	//   11   22:iload           4
	//   12   24:invokevirtual   #163 <Method Period DashManifest.getPeriod(int)>
	//   13   27:astore          10
			long l = C.msToUs(((Period) (obj)).startMs);
	//   14   29:aload           10
	//   15   31:getfield        #168 <Field long Period.startMs>
	//   16   34:invokestatic    #173 <Method long C.msToUs(long)>
	//   17   37:lstore          6
			long l1 = dashmanifest.getPeriodDurationUs(i);
	//   18   39:aload_2         
	//   19   40:iload           4
	//   20   42:invokevirtual   #177 <Method long DashManifest.getPeriodDurationUs(int)>
	//   21   45:lstore          8
			obj = ((Object) (((Period) (obj)).adaptationSets));
	//   22   47:aload           10
	//   23   49:getfield        #180 <Field List Period.adaptationSets>
	//   24   52:astore          10
			for(int j = 0; j < ((List) (obj)).size(); j++)
	//*  25   54:iconst_0        
	//*  26   55:istore          5
	//*  27   57:iload           5
	//*  28   59:aload           10
	//*  29   61:invokeinterface #62  <Method int List.size()>
	//*  30   66:icmpge          101
				addSegmentsForAdaptationSet(datasource, (AdaptationSet)((List) (obj)).get(j), l, l1, flag, arraylist);
	//   31   69:aload_1         
	//   32   70:aload           10
	//   33   72:iload           5
	//   34   74:invokeinterface #66  <Method Object List.get(int)>
	//   35   79:checkcast       #52  <Class AdaptationSet>
	//   36   82:lload           6
	//   37   84:lload           8
	//   38   86:iload_3         
	//   39   87:aload           11
	//   40   89:invokestatic    #182 <Method void addSegmentsForAdaptationSet(DataSource, AdaptationSet, long, long, boolean, ArrayList)>

	//   41   92:iload           5
	//   42   94:iconst_1        
	//   43   95:iadd            
	//   44   96:istore          5
		}

	//   45   98:goto            57
	//   46  101:iload           4
	//   47  103:iconst_1        
	//   48  104:iadd            
	//   49  105:istore          4
	//*  50  107:goto            12
		return ((List) (arraylist));
	//   51  110:aload           11
	//   52  112:areturn         
	}
}
