// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.*;
import com.google.android.exoplayer2.upstream.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsDownloader extends SegmentDownloader
{

	public SsDownloader(Uri uri, List list, DownloaderConstructorHelper downloaderconstructorhelper)
	{
		super(SsUtil.fixManifestUri(uri), list, downloaderconstructorhelper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #13  <Method Uri SsUtil.fixManifestUri(Uri)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #15  <Method void SegmentDownloader(Uri, List, DownloaderConstructorHelper)>
	//    6   10:return          
	}

	protected volatile FilterableManifest getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return ((FilterableManifest) (getManifest(datasource, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #25  <Method SsManifest getManifest(DataSource, Uri)>
	//    4    6:areturn         
	}

	protected SsManifest getManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		datasource = ((DataSource) (new ParsingLoadable(datasource, uri, 4, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new SsManifestParser())))));
	//    0    0:new             #28  <Class ParsingLoadable>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_4        
	//    5    7:new             #30  <Class SsManifestParser>
	//    6   10:dup             
	//    7   11:invokespecial   #33  <Method void SsManifestParser()>
	//    8   14:invokespecial   #36  <Method void ParsingLoadable(DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//    9   17:astore_1        
		((ParsingLoadable) (datasource)).load();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #39  <Method void ParsingLoadable.load()>
		return (SsManifest)((ParsingLoadable) (datasource)).getResult();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #43  <Method Object ParsingLoadable.getResult()>
	//   14   26:checkcast       #45  <Class SsManifest>
	//   15   29:areturn         
	}

	protected volatile List getSegments(DataSource datasource, FilterableManifest filterablemanifest, boolean flag)
		throws InterruptedException, IOException
	{
		return getSegments(datasource, (SsManifest)filterablemanifest, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #45  <Class SsManifest>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #52  <Method List getSegments(DataSource, SsManifest, boolean)>
	//    6   10:areturn         
	}

	protected List getSegments(DataSource datasource, SsManifest ssmanifest, boolean flag)
	{
		datasource = ((DataSource) (new ArrayList()));
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void ArrayList()>
	//    3    7:astore_1        
		ssmanifest = ((SsManifest) (ssmanifest.streamElements));
	//    4    8:aload_2         
	//    5    9:getfield        #59  <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    6   12:astore_2        
		int l = ssmanifest.length;
	//    7   13:aload_2         
	//    8   14:arraylength     
	//    9   15:istore          7
		for(int i = 0; i < l; i++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           7
	//*  14   24:icmpge          122
		{
			com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement = ((com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement) (ssmanifest[i]));
	//   15   27:aload_2         
	//   16   28:iload           4
	//   17   30:aaload          
	//   18   31:astore          8
			for(int j = 0; j < streamelement.formats.length; j++)
	//*  19   33:iconst_0        
	//*  20   34:istore          5
	//*  21   36:iload           5
	//*  22   38:aload           8
	//*  23   40:getfield        #65  <Field com.google.android.exoplayer2.Format[] com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.formats>
	//*  24   43:arraylength     
	//*  25   44:icmpge          113
			{
				for(int k = 0; k < streamelement.chunkCount; k++)
	//*  26   47:iconst_0        
	//*  27   48:istore          6
	//*  28   50:iload           6
	//*  29   52:aload           8
	//*  30   54:getfield        #69  <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  31   57:icmpge          104
					((ArrayList) (datasource)).add(((Object) (new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(streamelement.getStartTimeUs(k), new DataSpec(streamelement.buildRequestUri(j, k))))));
	//   32   60:aload_1         
	//   33   61:new             #71  <Class com.google.android.exoplayer2.offline.SegmentDownloader$Segment>
	//   34   64:dup             
	//   35   65:aload           8
	//   36   67:iload           6
	//   37   69:invokevirtual   #75  <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   38   72:new             #77  <Class DataSpec>
	//   39   75:dup             
	//   40   76:aload           8
	//   41   78:iload           5
	//   42   80:iload           6
	//   43   82:invokevirtual   #81  <Method Uri com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.buildRequestUri(int, int)>
	//   44   85:invokespecial   #84  <Method void DataSpec(Uri)>
	//   45   88:invokespecial   #87  <Method void com.google.android.exoplayer2.offline.SegmentDownloader$Segment(long, DataSpec)>
	//   46   91:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//   47   94:pop             

	//   48   95:iload           6
	//   49   97:iconst_1        
	//   50   98:iadd            
	//   51   99:istore          6
			}

	//   52  101:goto            50
	//   53  104:iload           5
	//   54  106:iconst_1        
	//   55  107:iadd            
	//   56  108:istore          5
		}

	//   57  110:goto            36
	//   58  113:iload           4
	//   59  115:iconst_1        
	//   60  116:iadd            
	//   61  117:istore          4
	//*  62  119:goto            20
		return ((List) (datasource));
	//   63  122:aload_1         
	//   64  123:areturn         
	}
}
