// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.*;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.manifest.*;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash.offline:
//			DashDownloadAction

public final class DashDownloadHelper extends DownloadHelper
{

	public DashDownloadHelper(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
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

	private static List toRepresentationKeys(List list)
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
	//*  11   23:icmpge          70
		{
			TrackKey trackkey = (TrackKey)list.get(i);
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:invokeinterface #38  <Method Object List.get(int)>
	//   15   33:checkcast       #40  <Class TrackKey>
	//   16   36:astore_3        
			((List) (arraylist)).add(((Object) (new RepresentationKey(trackkey.periodIndex, trackkey.groupIndex, trackkey.trackIndex))));
	//   17   37:aload_2         
	//   18   38:new             #42  <Class RepresentationKey>
	//   19   41:dup             
	//   20   42:aload_3         
	//   21   43:getfield        #46  <Field int TrackKey.periodIndex>
	//   22   46:aload_3         
	//   23   47:getfield        #49  <Field int TrackKey.groupIndex>
	//   24   50:aload_3         
	//   25   51:getfield        #52  <Field int TrackKey.trackIndex>
	//   26   54:invokespecial   #55  <Method void RepresentationKey(int, int, int)>
	//   27   57:invokeinterface #59  <Method boolean List.add(Object)>
	//   28   62:pop             
		}

	//   29   63:iload_1         
	//   30   64:iconst_1        
	//   31   65:iadd            
	//   32   66:istore_1        
	//*  33   67:goto            16
		return ((List) (arraylist));
	//   34   70:aload_2         
	//   35   71:areturn         
	}

	public volatile DownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return ((DownloadAction) (getDownloadAction(abyte0, list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #67  <Method DashDownloadAction getDownloadAction(byte[], List)>
	//    4    6:areturn         
	}

	public DashDownloadAction getDownloadAction(byte abyte0[], List list)
	{
		return new DashDownloadAction(uri, false, abyte0, toRepresentationKeys(list));
	//    0    0:new             #70  <Class DashDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Uri uri>
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #72  <Method List toRepresentationKeys(List)>
	//    8   14:invokespecial   #75  <Method void DashDownloadAction(Uri, boolean, byte[], List)>
	//    9   17:areturn         
	}

	public DashManifest getManifest()
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field DashManifest manifest>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return manifest;
	//    4    8:aload_0         
	//    5    9:getfield        #80  <Field DashManifest manifest>
	//    6   12:areturn         
	}

	public int getPeriodCount()
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field DashManifest manifest>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		return manifest.getPeriodCount();
	//    4    8:aload_0         
	//    5    9:getfield        #80  <Field DashManifest manifest>
	//    6   12:invokevirtual   #91  <Method int DashManifest.getPeriodCount()>
	//    7   15:ireturn         
	}

	public volatile DownloadAction getRemoveAction(byte abyte0[])
	{
		return ((DownloadAction) (getRemoveAction(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method DashDownloadAction getRemoveAction(byte[])>
	//    3    5:areturn         
	}

	public DashDownloadAction getRemoveAction(byte abyte0[])
	{
		return new DashDownloadAction(uri, true, abyte0, Collections.emptyList());
	//    0    0:new             #70  <Class DashDownloadAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Uri uri>
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokestatic    #102 <Method List Collections.emptyList()>
	//    7   13:invokespecial   #75  <Method void DashDownloadAction(Uri, boolean, byte[], List)>
	//    8   16:areturn         
	}

	public TrackGroupArray getTrackGroups(int i)
	{
		Assertions.checkNotNull(((Object) (manifest)));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field DashManifest manifest>
	//    2    4:invokestatic    #86  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		List list = manifest.getPeriod(i).adaptationSets;
	//    4    8:aload_0         
	//    5    9:getfield        #80  <Field DashManifest manifest>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #108 <Method Period DashManifest.getPeriod(int)>
	//    8   16:getfield        #114 <Field List Period.adaptationSets>
	//    9   19:astore          4
		TrackGroup atrackgroup[] = new TrackGroup[list.size()];
	//   10   21:aload           4
	//   11   23:invokeinterface #31  <Method int List.size()>
	//   12   28:anewarray       TrackGroup[]
	//   13   31:astore          5
		for(i = 0; i < atrackgroup.length; i++)
	//*  14   33:iconst_0        
	//*  15   34:istore_1        
	//*  16   35:iload_1         
	//*  17   36:aload           5
	//*  18   38:arraylength     
	//*  19   39:icmpge          130
		{
			List list1 = ((AdaptationSet)list.get(i)).representations;
	//   20   42:aload           4
	//   21   44:iload_1         
	//   22   45:invokeinterface #38  <Method Object List.get(int)>
	//   23   50:checkcast       #118 <Class AdaptationSet>
	//   24   53:getfield        #121 <Field List AdaptationSet.representations>
	//   25   56:astore          6
			Format aformat[] = new Format[list1.size()];
	//   26   58:aload           6
	//   27   60:invokeinterface #31  <Method int List.size()>
	//   28   65:anewarray       Format[]
	//   29   68:astore          7
			int k = list1.size();
	//   30   70:aload           6
	//   31   72:invokeinterface #31  <Method int List.size()>
	//   32   77:istore_3        
			for(int j = 0; j < k; j++)
	//*  33   78:iconst_0        
	//*  34   79:istore_2        
	//*  35   80:iload_2         
	//*  36   81:iload_3         
	//*  37   82:icmpge          110
				aformat[j] = ((Representation)list1.get(j)).format;
	//   38   85:aload           7
	//   39   87:iload_2         
	//   40   88:aload           6
	//   41   90:iload_2         
	//   42   91:invokeinterface #38  <Method Object List.get(int)>
	//   43   96:checkcast       #125 <Class Representation>
	//   44   99:getfield        #129 <Field Format Representation.format>
	//   45  102:aastore         

	//   46  103:iload_2         
	//   47  104:iconst_1        
	//   48  105:iadd            
	//   49  106:istore_2        
	//*  50  107:goto            80
			atrackgroup[i] = new TrackGroup(aformat);
	//   51  110:aload           5
	//   52  112:iload_1         
	//   53  113:new             #116 <Class TrackGroup>
	//   54  116:dup             
	//   55  117:aload           7
	//   56  119:invokespecial   #132 <Method void TrackGroup(Format[])>
	//   57  122:aastore         
		}

	//   58  123:iload_1         
	//   59  124:iconst_1        
	//   60  125:iadd            
	//   61  126:istore_1        
	//*  62  127:goto            35
		return new TrackGroupArray(atrackgroup);
	//   63  130:new             #134 <Class TrackGroupArray>
	//   64  133:dup             
	//   65  134:aload           5
	//   66  136:invokespecial   #137 <Method void TrackGroupArray(TrackGroup[])>
	//   67  139:areturn         
	}

	protected void prepareInternal()
		throws IOException
	{
		manifest = (DashManifest)ParsingLoadable.load(manifestDataSourceFactory.createDataSource(), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new DashManifestParser())), uri);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//    3    5:invokeinterface #146 <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    4   10:new             #148 <Class DashManifestParser>
	//    5   13:dup             
	//    6   14:invokespecial   #149 <Method void DashManifestParser()>
	//    7   17:aload_0         
	//    8   18:getfield        #18  <Field Uri uri>
	//    9   21:invokestatic    #155 <Method Object ParsingLoadable.load(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, Uri)>
	//   10   24:checkcast       #89  <Class DashManifest>
	//   11   27:putfield        #80  <Field DashManifest manifest>
	//   12   30:return          
	}

	private DashManifest manifest;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private final Uri uri;
}
