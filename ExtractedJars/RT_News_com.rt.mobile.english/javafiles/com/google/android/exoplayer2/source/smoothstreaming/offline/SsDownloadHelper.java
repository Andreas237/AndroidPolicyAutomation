// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.*;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming.offline:
//			SsDownloadAction

public final class SsDownloadHelper extends DownloadHelper
{

	public SsDownloadHelper(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void DownloadHelper()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Uri uri>
		manifestDataSourceFactory = factory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//    8   14:return          
	}

	private static List toStreamKeys(List list)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #31  <Method int List.size()>
	//    4   10:invokespecial   #34  <Method void ArrayList(int)>
	//    5   13:astore_2        
		for(int i = 0; i < list.size(); i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_1        
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:invokeinterface #31  <Method int List.size()>
	//*  11   23:icmpge          66
		{
			TrackKey trackkey = (TrackKey)list.get(i);
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:invokeinterface #38  <Method Object List.get(int)>
	//   15   33:checkcast       #40  <Class TrackKey>
	//   16   36:astore_3        
			((List) (arraylist)).add(((Object) (new StreamKey(trackkey.groupIndex, trackkey.trackIndex))));
	//   17   37:aload_2         
	//   18   38:new             #42  <Class StreamKey>
	//   19   41:dup             
	//   20   42:aload_3         
	//   21   43:getfield        #46  <Field int TrackKey.groupIndex>
	//   22   46:aload_3         
	//   23   47:getfield        #49  <Field int TrackKey.trackIndex>
	//   24   50:invokespecial   #52  <Method void StreamKey(int, int)>
	//   25   53:invokeinterface #56  <Method boolean List.add(Object)>
	//   26   58:pop             
		}

	//   27   59:iload_1         
	//   28   60:iconst_1        
	//   29   61:iadd            
	//   30   62:istore_1        
	//*  31   63:goto            16
		return ((List) (arraylist));
	//   32   66:aload_2         
	//   33   67:areturn         
	}

	public volatile DownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return ((DownloadAction) (getDownloadAction(abyte0, list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method SsDownloadAction getDownloadAction(byte[], List)>
	//    4    6:areturn         
	}

	public SsDownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return new SsDownloadAction(uri, false, abyte0, toStreamKeys(list));
	//    0    0:new             #67  <Class SsDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Uri uri>
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #69  <Method List toStreamKeys(List)>
	//    8   14:invokespecial   #72  <Method void SsDownloadAction(Uri, boolean, byte[], List)>
	//    9   17:areturn         
	}

	public SsManifest getManifest()
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field SsManifest manifest>
	//    2    4:invokestatic    #83  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return manifest;
	//    4    8:aload_0         
	//    5    9:getfield        #77  <Field SsManifest manifest>
	//    6   12:areturn         
	}

	public int getPeriodCount()
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field SsManifest manifest>
	//    2    4:invokestatic    #83  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return 1;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public volatile DownloadAction getRemoveAction(byte abyte0[])
	{
		return ((DownloadAction) (getRemoveAction(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method SsDownloadAction getRemoveAction(byte[])>
	//    3    5:areturn         
	}

	public SsDownloadAction getRemoveAction(byte abyte0[])
	{
		return new SsDownloadAction(uri, true, abyte0, Collections.emptyList());
	//    0    0:new             #67  <Class SsDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Uri uri>
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokestatic    #95  <Method List Collections.emptyList()>
	//    7   13:invokespecial   #72  <Method void SsDownloadAction(Uri, boolean, byte[], List)>
	//    8   16:areturn         
	}

	public TrackGroupArray getTrackGroups(int i)
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field SsManifest manifest>
	//    2    4:invokestatic    #83  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement astreamelement[] = manifest.streamElements;
	//    4    8:aload_0         
	//    5    9:getfield        #77  <Field SsManifest manifest>
	//    6   12:getfield        #103 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//    7   15:astore_2        
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		TrackGroup atrackgroup[] = new TrackGroup[astreamelement.length];
	//   10   18:aload_2         
	//   11   19:arraylength     
	//   12   20:anewarray       TrackGroup[]
	//   13   23:astore_3        
		for(; i < astreamelement.length; i++)
	//*  14   24:iload_1         
	//*  15   25:aload_2         
	//*  16   26:arraylength     
	//*  17   27:icmpge          53
			atrackgroup[i] = new TrackGroup(astreamelement[i].formats);
	//   18   30:aload_3         
	//   19   31:iload_1         
	//   20   32:new             #105 <Class TrackGroup>
	//   21   35:dup             
	//   22   36:aload_2         
	//   23   37:iload_1         
	//   24   38:aaload          
	//   25   39:getfield        #111 <Field com.google.android.exoplayer2.Format[] com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.formats>
	//   26   42:invokespecial   #114 <Method void TrackGroup(com.google.android.exoplayer2.Format[])>
	//   27   45:aastore         

	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_1        
	//*  32   50:goto            24
		return new TrackGroupArray(atrackgroup);
	//   33   53:new             #116 <Class TrackGroupArray>
	//   34   56:dup             
	//   35   57:aload_3         
	//   36   58:invokespecial   #119 <Method void TrackGroupArray(TrackGroup[])>
	//   37   61:areturn         
	}

	protected void prepareInternal()
		throws IOException
	{
		manifest = (SsManifest)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new SsManifestParser())), uri);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//    3    5:invokeinterface #128 <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    4   10:new             #130 <Class SsManifestParser>
	//    5   13:dup             
	//    6   14:invokespecial   #131 <Method void SsManifestParser()>
	//    7   17:aload_0         
	//    8   18:getfield        #18  <Field Uri uri>
	//    9   21:invokestatic    #137 <Method Object ParsingLoadable.load(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, Uri)>
	//   10   24:checkcast       #99  <Class SsManifest>
	//   11   27:putfield        #77  <Field SsManifest manifest>
	//   12   30:return          
	}

	private SsManifest manifest;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private final Uri uri;
}
