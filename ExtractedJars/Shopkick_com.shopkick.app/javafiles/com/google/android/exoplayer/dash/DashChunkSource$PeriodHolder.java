// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.ContentProtection;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashChunkSource, DashSegmentIndex

protected static final class DashChunkSource$PeriodHolder
{

	private static DrmInitData getDrmInitData(AdaptationSet adaptationset)
	{
		boolean flag = adaptationset.contentProtections.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field List AdaptationSet.contentProtections>
	//    2    4:invokeinterface #135 <Method boolean List.isEmpty()>
	//    3    9:istore_2        
		com.google.android.exoplayer.drm.DrmInitData.Mapped mapped = null;
	//    4   10:aconst_null     
	//    5   11:astore_3        
		if(flag)
	//*   6   12:iload_2         
	//*   7   13:ifeq            18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		for(int i = 0; i < adaptationset.contentProtections.size();)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #132 <Field List AdaptationSet.contentProtections>
	//*  15   25:invokeinterface #139 <Method int List.size()>
	//*  16   30:icmpge          111
		{
			ContentProtection contentprotection = (ContentProtection)adaptationset.contentProtections.get(i);
	//   17   33:aload_0         
	//   18   34:getfield        #132 <Field List AdaptationSet.contentProtections>
	//   19   37:iload_1         
	//   20   38:invokeinterface #58  <Method Object List.get(int)>
	//   21   43:checkcast       #141 <Class ContentProtection>
	//   22   46:astore          5
			com.google.android.exoplayer.drm.DrmInitData.Mapped mapped1 = mapped;
	//   23   48:aload_3         
	//   24   49:astore          4
			if(contentprotection.uuid != null)
	//*  25   51:aload           5
	//*  26   53:getfield        #145 <Field java.util.UUID ContentProtection.uuid>
	//*  27   56:ifnull          101
			{
				mapped1 = mapped;
	//   28   59:aload_3         
	//   29   60:astore          4
				if(contentprotection.data != null)
	//*  30   62:aload           5
	//*  31   64:getfield        #149 <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData ContentProtection.data>
	//*  32   67:ifnull          101
				{
					mapped1 = mapped;
	//   33   70:aload_3         
	//   34   71:astore          4
					if(mapped == null)
	//*  35   73:aload_3         
	//*  36   74:ifnonnull       86
						mapped1 = new com.google.android.exoplayer.drm.DrmInitData.Mapped();
	//   37   77:new             #151 <Class com.google.android.exoplayer.drm.DrmInitData$Mapped>
	//   38   80:dup             
	//   39   81:invokespecial   #152 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped()>
	//   40   84:astore          4
					mapped1.put(contentprotection.uuid, contentprotection.data);
	//   41   86:aload           4
	//   42   88:aload           5
	//   43   90:getfield        #145 <Field java.util.UUID ContentProtection.uuid>
	//   44   93:aload           5
	//   45   95:getfield        #149 <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData ContentProtection.data>
	//   46   98:invokevirtual   #155 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped.put(java.util.UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
				}
			}
			i++;
	//   47  101:iload_1         
	//   48  102:iconst_1        
	//   49  103:iadd            
	//   50  104:istore_1        
			mapped = mapped1;
	//   51  105:aload           4
	//   52  107:astore_3        
		}

	//*  53  108:goto            20
		return ((DrmInitData) (mapped));
	//   54  111:aload_3         
	//   55  112:areturn         
	}

	private static long getPeriodDurationUs(MediaPresentationDescription mediapresentationdescription, int i)
	{
		long l = mediapresentationdescription.getPeriodDuration(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #159 <Method long MediaPresentationDescription.getPeriodDuration(int)>
	//    3    5:lstore_2        
		if(l == -1L)
	//*   4    6:lload_2         
	//*   5    7:ldc2w           #160 <Long -1L>
	//*   6   10:lcmp            
	//*   7   11:ifne            18
			return -1L;
	//    8   14:ldc2w           #160 <Long -1L>
	//    9   17:lreturn         
		else
			return l * 1000L;
	//   10   18:lload_2         
	//   11   19:ldc2w           #67  <Long 1000L>
	//   12   22:lmul            
	//   13   23:lreturn         
	}

	private static int getRepresentationIndex(List list, String s)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokeinterface #139 <Method int List.size()>
	//*   5    9:icmpge          44
			if(s.equals(((Object) (((Representation)list.get(i)).format.id))))
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:iload_2         
	//*   9   15:invokeinterface #58  <Method Object List.get(int)>
	//*  10   20:checkcast       #107 <Class Representation>
	//*  11   23:getfield        #116 <Field Format Representation.format>
	//*  12   26:getfield        #90  <Field String Format.id>
	//*  13   29:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  14   32:ifeq            37
				return i;
	//   15   35:iload_2         
	//   16   36:ireturn         

	//   17   37:iload_2         
	//   18   38:iconst_1        
	//   19   39:iadd            
	//   20   40:istore_2        
	//*  21   41:goto            2
		list = ((List) (new StringBuilder()));
	//   22   44:new             #169 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #170 <Method void StringBuilder()>
	//   25   51:astore_0        
		((StringBuilder) (list)).append("Missing format id: ");
	//   26   52:aload_0         
	//   27   53:ldc1            #172 <String "Missing format id: ">
	//   28   55:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		((StringBuilder) (list)).append(s);
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   34   65:new             #178 <Class IllegalStateException>
	//   35   68:dup             
	//   36   69:aload_0         
	//   37   70:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   38   73:invokespecial   #185 <Method void IllegalStateException(String)>
	//   39   76:athrow          
	}

	private void updateRepresentationIndependentProperties(long l, Representation representation)
	{
		representation = ((Representation) (representation.getIndex()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #191 <Method DashSegmentIndex Representation.getIndex()>
	//    2    4:astore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore          8
		if(representation != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          109
		{
			int i = ((DashSegmentIndex) (representation)).getFirstSegmentNum();
	//    7   12:aload_3         
	//    8   13:invokeinterface #196 <Method int DashSegmentIndex.getFirstSegmentNum()>
	//    9   18:istore          4
			int j = ((DashSegmentIndex) (representation)).getLastSegmentNum(l);
	//   10   20:aload_3         
	//   11   21:lload_1         
	//   12   22:invokeinterface #200 <Method int DashSegmentIndex.getLastSegmentNum(long)>
	//   13   27:istore          5
			if(j != -1)
	//*  14   29:iload           5
	//*  15   31:iconst_m1       
	//*  16   32:icmpne          38
	//*  17   35:goto            41
				flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          8
			indexIsUnbounded = flag;
	//   20   41:aload_0         
	//   21   42:iload           8
	//   22   44:putfield        #202 <Field boolean indexIsUnbounded>
			indexIsExplicit = ((DashSegmentIndex) (representation)).isExplicit();
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:invokeinterface #205 <Method boolean DashSegmentIndex.isExplicit()>
	//   26   54:putfield        #207 <Field boolean indexIsExplicit>
			availableStartTimeUs = startTimeUs + ((DashSegmentIndex) (representation)).getTimeUs(i);
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #70  <Field long startTimeUs>
	//   30   62:aload_3         
	//   31   63:iload           4
	//   32   65:invokeinterface #210 <Method long DashSegmentIndex.getTimeUs(int)>
	//   33   70:ladd            
	//   34   71:putfield        #212 <Field long availableStartTimeUs>
			if(!indexIsUnbounded)
	//*  35   74:aload_0         
	//*  36   75:getfield        #202 <Field boolean indexIsUnbounded>
	//*  37   78:ifne            139
			{
				availableEndTimeUs = startTimeUs + ((DashSegmentIndex) (representation)).getTimeUs(j) + ((DashSegmentIndex) (representation)).getDurationUs(j, l);
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:getfield        #70  <Field long startTimeUs>
	//   41   86:aload_3         
	//   42   87:iload           5
	//   43   89:invokeinterface #210 <Method long DashSegmentIndex.getTimeUs(int)>
	//   44   94:ladd            
	//   45   95:aload_3         
	//   46   96:iload           5
	//   47   98:lload_1         
	//   48   99:invokeinterface #216 <Method long DashSegmentIndex.getDurationUs(int, long)>
	//   49  104:ladd            
	//   50  105:putfield        #218 <Field long availableEndTimeUs>
				return;
	//   51  108:return          
			}
		} else
		{
			indexIsUnbounded = false;
	//   52  109:aload_0         
	//   53  110:iconst_0        
	//   54  111:putfield        #202 <Field boolean indexIsUnbounded>
			indexIsExplicit = true;
	//   55  114:aload_0         
	//   56  115:iconst_1        
	//   57  116:putfield        #207 <Field boolean indexIsExplicit>
			long l1 = startTimeUs;
	//   58  119:aload_0         
	//   59  120:getfield        #70  <Field long startTimeUs>
	//   60  123:lstore          6
			availableStartTimeUs = l1;
	//   61  125:aload_0         
	//   62  126:lload           6
	//   63  128:putfield        #212 <Field long availableStartTimeUs>
			availableEndTimeUs = l1 + l;
	//   64  131:aload_0         
	//   65  132:lload           6
	//   66  134:lload_1         
	//   67  135:ladd            
	//   68  136:putfield        #218 <Field long availableEndTimeUs>
		}
	//   69  139:return          
	}

	public long getAvailableEndTimeUs()
	{
		if(!isIndexUnbounded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isIndexUnbounded()>
	//*   2    4:ifne            12
			return availableEndTimeUs;
	//    3    7:aload_0         
	//    4    8:getfield        #218 <Field long availableEndTimeUs>
	//    5   11:lreturn         
		else
			throw new IllegalStateException("Period has unbounded index");
	//    6   12:new             #178 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #225 <String "Period has unbounded index">
	//    9   18:invokespecial   #185 <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public long getAvailableStartTimeUs()
	{
		return availableStartTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field long availableStartTimeUs>
	//    2    4:lreturn         
	}

	public DrmInitData getDrmInitData()
	{
		return drmInitData;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field DrmInitData drmInitData>
	//    2    4:areturn         
	}

	public boolean isIndexExplicit()
	{
		return indexIsExplicit;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field boolean indexIsExplicit>
	//    2    4:ireturn         
	}

	public boolean isIndexUnbounded()
	{
		return indexIsUnbounded;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field boolean indexIsUnbounded>
	//    2    4:ireturn         
	}

	public void updatePeriod(MediaPresentationDescription mediapresentationdescription, int i, DashChunkSource$ExposedTrack dashchunksource$exposedtrack)
		throws BehindLiveWindowException
	{
		Period period = mediapresentationdescription.getPeriod(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #36  <Method Period MediaPresentationDescription.getPeriod(int)>
	//    3    5:astore          6
		long l = getPeriodDurationUs(mediapresentationdescription, i);
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:invokestatic    #40  <Method long getPeriodDurationUs(MediaPresentationDescription, int)>
	//    7   12:lstore          4
		mediapresentationdescription = ((MediaPresentationDescription) (((AdaptationSet)period.adaptationSets.get(DashChunkSource$ExposedTrack.access$500(dashchunksource$exposedtrack))).representations));
	//    8   14:aload           6
	//    9   16:getfield        #46  <Field List Period.adaptationSets>
	//   10   19:aload_3         
	//   11   20:invokestatic    #52  <Method int DashChunkSource$ExposedTrack.access$500(DashChunkSource$ExposedTrack)>
	//   12   23:invokeinterface #58  <Method Object List.get(int)>
	//   13   28:checkcast       #60  <Class AdaptationSet>
	//   14   31:getfield        #63  <Field List AdaptationSet.representations>
	//   15   34:astore_1        
		i = 0;
	//   16   35:iconst_0        
	//   17   36:istore_2        
		do
		{
			dashchunksource$exposedtrack = ((DashChunkSource$ExposedTrack) (representationIndices));
	//   18   37:aload_0         
	//   19   38:getfield        #96  <Field int[] representationIndices>
	//   20   41:astore_3        
			if(i < dashchunksource$exposedtrack.length)
	//*  21   42:iload_2         
	//*  22   43:aload_3         
	//*  23   44:arraylength     
	//*  24   45:icmpge          91
			{
				dashchunksource$exposedtrack = ((DashChunkSource$ExposedTrack) ((Representation)((List) (mediapresentationdescription)).get(dashchunksource$exposedtrack[i])));
	//   25   48:aload_1         
	//   26   49:aload_3         
	//   27   50:iload_2         
	//   28   51:iaload          
	//   29   52:invokeinterface #58  <Method Object List.get(int)>
	//   30   57:checkcast       #107 <Class Representation>
	//   31   60:astore_3        
				((nHolder)representationHolders.get(((Object) (((Representation) (dashchunksource$exposedtrack)).format.id)))).updateRepresentation(l, ((Representation) (dashchunksource$exposedtrack)));
	//   32   61:aload_0         
	//   33   62:getfield        #105 <Field HashMap representationHolders>
	//   34   65:aload_3         
	//   35   66:getfield        #116 <Field Format Representation.format>
	//   36   69:getfield        #90  <Field String Format.id>
	//   37   72:invokevirtual   #235 <Method Object HashMap.get(Object)>
	//   38   75:checkcast       #109 <Class DashChunkSource$RepresentationHolder>
	//   39   78:lload           4
	//   40   80:aload_3         
	//   41   81:invokevirtual   #238 <Method void DashChunkSource$RepresentationHolder.updateRepresentation(long, Representation)>
				i++;
	//   42   84:iload_2         
	//   43   85:iconst_1        
	//   44   86:iadd            
	//   45   87:istore_2        
			} else
	//*  46   88:goto            37
			{
				updateRepresentationIndependentProperties(l, (Representation)((List) (mediapresentationdescription)).get(dashchunksource$exposedtrack[0]));
	//   47   91:aload_0         
	//   48   92:lload           4
	//   49   94:aload_1         
	//   50   95:aload_3         
	//   51   96:iconst_0        
	//   52   97:iaload          
	//   53   98:invokeinterface #58  <Method Object List.get(int)>
	//   54  103:checkcast       #107 <Class Representation>
	//   55  106:invokespecial   #124 <Method void updateRepresentationIndependentProperties(long, Representation)>
				return;
	//   56  109:return          
			}
		} while(true);
	}

	private long availableEndTimeUs;
	private long availableStartTimeUs;
	private DrmInitData drmInitData;
	private boolean indexIsExplicit;
	private boolean indexIsUnbounded;
	public final int localIndex;
	public final HashMap representationHolders = new HashMap();
	private final int representationIndices[];
	public final long startTimeUs;


/*
	static DrmInitData access$200(DashChunkSource$PeriodHolder dashchunksource$periodholder)
	{
		return dashchunksource$periodholder.drmInitData;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field DrmInitData drmInitData>
	//    2    4:areturn         
	}

*/


/*
	static DrmInitData access$202(DashChunkSource$PeriodHolder dashchunksource$periodholder, DrmInitData drminitdata)
	{
		dashchunksource$periodholder.drmInitData = drminitdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field DrmInitData drmInitData>
		return drminitdata;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	public DashChunkSource$PeriodHolder(int i, MediaPresentationDescription mediapresentationdescription, int j, DashChunkSource$ExposedTrack dashchunksource$exposedtrack)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		localIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int localIndex>
		Period period = mediapresentationdescription.getPeriod(j);
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #36  <Method Period MediaPresentationDescription.getPeriod(int)>
	//    8   14:astore          7
		long l = getPeriodDurationUs(mediapresentationdescription, j);
	//    9   16:aload_2         
	//   10   17:iload_3         
	//   11   18:invokestatic    #40  <Method long getPeriodDurationUs(MediaPresentationDescription, int)>
	//   12   21:lstore          5
		AdaptationSet adaptationset = (AdaptationSet)period.adaptationSets.get(DashChunkSource$ExposedTrack.access$500(dashchunksource$exposedtrack));
	//   13   23:aload           7
	//   14   25:getfield        #46  <Field List Period.adaptationSets>
	//   15   28:aload           4
	//   16   30:invokestatic    #52  <Method int DashChunkSource$ExposedTrack.access$500(DashChunkSource$ExposedTrack)>
	//   17   33:invokeinterface #58  <Method Object List.get(int)>
	//   18   38:checkcast       #60  <Class AdaptationSet>
	//   19   41:astore          8
		mediapresentationdescription = ((MediaPresentationDescription) (adaptationset.representations));
	//   20   43:aload           8
	//   21   45:getfield        #63  <Field List AdaptationSet.representations>
	//   22   48:astore_2        
		startTimeUs = period.startMs * 1000L;
	//   23   49:aload_0         
	//   24   50:aload           7
	//   25   52:getfield        #66  <Field long Period.startMs>
	//   26   55:ldc2w           #67  <Long 1000L>
	//   27   58:lmul            
	//   28   59:putfield        #70  <Field long startTimeUs>
		drmInitData = getDrmInitData(adaptationset);
	//   29   62:aload_0         
	//   30   63:aload           8
	//   31   65:invokestatic    #74  <Method DrmInitData getDrmInitData(AdaptationSet)>
	//   32   68:putfield        #76  <Field DrmInitData drmInitData>
		if(!dashchunksource$exposedtrack.isAdaptive())
	//*  33   71:aload           4
	//*  34   73:invokevirtual   #80  <Method boolean DashChunkSource$ExposedTrack.isAdaptive()>
	//*  35   76:ifne            104
		{
			representationIndices = (new int[] {
				getRepresentationIndex(((List) (mediapresentationdescription)), DashChunkSource$ExposedTrack.access$100(dashchunksource$exposedtrack).id)
			});
	//   36   79:aload_0         
	//   37   80:iconst_1        
	//   38   81:newarray        int[]
	//   39   83:dup             
	//   40   84:iconst_0        
	//   41   85:aload_2         
	//   42   86:aload           4
	//   43   88:invokestatic    #84  <Method Format DashChunkSource$ExposedTrack.access$100(DashChunkSource$ExposedTrack)>
	//   44   91:getfield        #90  <Field String Format.id>
	//   45   94:invokestatic    #94  <Method int getRepresentationIndex(List, String)>
	//   46   97:iastore         
	//   47   98:putfield        #96  <Field int[] representationIndices>
		} else
	//*  48  101:goto            155
		{
			representationIndices = new int[DashChunkSource$ExposedTrack.access$000(dashchunksource$exposedtrack).length];
	//   49  104:aload_0         
	//   50  105:aload           4
	//   51  107:invokestatic    #100 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
	//   52  110:arraylength     
	//   53  111:newarray        int[]
	//   54  113:putfield        #96  <Field int[] representationIndices>
			for(i = 0; i < DashChunkSource$ExposedTrack.access$000(dashchunksource$exposedtrack).length; i++)
	//*  55  116:iconst_0        
	//*  56  117:istore_1        
	//*  57  118:iload_1         
	//*  58  119:aload           4
	//*  59  121:invokestatic    #100 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
	//*  60  124:arraylength     
	//*  61  125:icmpge          155
				representationIndices[i] = getRepresentationIndex(((List) (mediapresentationdescription)), DashChunkSource$ExposedTrack.access$000(dashchunksource$exposedtrack)[i].id);
	//   62  128:aload_0         
	//   63  129:getfield        #96  <Field int[] representationIndices>
	//   64  132:iload_1         
	//   65  133:aload_2         
	//   66  134:aload           4
	//   67  136:invokestatic    #100 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
	//   68  139:iload_1         
	//   69  140:aaload          
	//   70  141:getfield        #90  <Field String Format.id>
	//   71  144:invokestatic    #94  <Method int getRepresentationIndex(List, String)>
	//   72  147:iastore         

	//   73  148:iload_1         
	//   74  149:iconst_1        
	//   75  150:iadd            
	//   76  151:istore_1        
		}
	//*  77  152:goto            118
	//   78  155:aload_0         
	//   79  156:new             #102 <Class HashMap>
	//   80  159:dup             
	//   81  160:invokespecial   #103 <Method void HashMap()>
	//   82  163:putfield        #105 <Field HashMap representationHolders>
		i = 0;
	//   83  166:iconst_0        
	//   84  167:istore_1        
		do
		{
			dashchunksource$exposedtrack = ((DashChunkSource$ExposedTrack) (representationIndices));
	//   85  168:aload_0         
	//   86  169:getfield        #96  <Field int[] representationIndices>
	//   87  172:astore          4
			if(i < dashchunksource$exposedtrack.length)
	//*  88  174:iload_1         
	//*  89  175:aload           4
	//*  90  177:arraylength     
	//*  91  178:icmpge          238
			{
				dashchunksource$exposedtrack = ((DashChunkSource$ExposedTrack) ((Representation)((List) (mediapresentationdescription)).get(dashchunksource$exposedtrack[i])));
	//   92  181:aload_2         
	//   93  182:aload           4
	//   94  184:iload_1         
	//   95  185:iaload          
	//   96  186:invokeinterface #58  <Method Object List.get(int)>
	//   97  191:checkcast       #107 <Class Representation>
	//   98  194:astore          4
				nHolder nholder = new nHolder(startTimeUs, l, ((Representation) (dashchunksource$exposedtrack)));
	//   99  196:new             #109 <Class DashChunkSource$RepresentationHolder>
	//  100  199:dup             
	//  101  200:aload_0         
	//  102  201:getfield        #70  <Field long startTimeUs>
	//  103  204:lload           5
	//  104  206:aload           4
	//  105  208:invokespecial   #112 <Method void DashChunkSource$RepresentationHolder(long, long, Representation)>
	//  106  211:astore          7
				representationHolders.put(((Object) (((Representation) (dashchunksource$exposedtrack)).format.id)), ((Object) (nholder)));
	//  107  213:aload_0         
	//  108  214:getfield        #105 <Field HashMap representationHolders>
	//  109  217:aload           4
	//  110  219:getfield        #116 <Field Format Representation.format>
	//  111  222:getfield        #90  <Field String Format.id>
	//  112  225:aload           7
	//  113  227:invokevirtual   #120 <Method Object HashMap.put(Object, Object)>
	//  114  230:pop             
				i++;
	//  115  231:iload_1         
	//  116  232:iconst_1        
	//  117  233:iadd            
	//  118  234:istore_1        
			} else
	//* 119  235:goto            168
			{
				updateRepresentationIndependentProperties(l, (Representation)((List) (mediapresentationdescription)).get(dashchunksource$exposedtrack[0]));
	//  120  238:aload_0         
	//  121  239:lload           5
	//  122  241:aload_2         
	//  123  242:aload           4
	//  124  244:iconst_0        
	//  125  245:iaload          
	//  126  246:invokeinterface #58  <Method Object List.get(int)>
	//  127  251:checkcast       #107 <Class Representation>
	//  128  254:invokespecial   #124 <Method void updateRepresentationIndependentProperties(long, Representation)>
				return;
	//  129  257:return          
			}
		} while(true);
	}
}
