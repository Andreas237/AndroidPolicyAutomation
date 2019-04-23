// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.chunk.Chunk;
import com.google.android.exoplayer.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer.chunk.ChunkOperationHolder;
import com.google.android.exoplayer.chunk.ChunkSource;
import com.google.android.exoplayer.chunk.ContainerMediaChunk;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import com.google.android.exoplayer.chunk.InitializationChunk;
import com.google.android.exoplayer.chunk.MediaChunk;
import com.google.android.exoplayer.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.ContentProtection;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.RangedUri;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.ChunkIndex;
import com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer.extractor.webm.WebmExtractor;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Clock;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashWrappingSegmentIndex, DashTrackSelector, DashSegmentIndex

public class DashChunkSource
	implements ChunkSource, DashTrackSelector.Output
{
	public static interface EventListener
	{

		public abstract void onAvailableRangeChanged(int i, TimeRange timerange);
	}

	protected static final class ExposedTrack
	{

		public boolean isAdaptive()
		{
			return adaptiveFormats != null;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		private final int adaptationSetIndex;
		private final Format adaptiveFormats[];
		public final int adaptiveMaxHeight;
		public final int adaptiveMaxWidth;
		private final Format fixedFormat;
		public final MediaFormat trackFormat;


/*
		static Format[] access$000(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptiveFormats;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Format[] adaptiveFormats>
		//    2    4:areturn         
		}

*/


/*
		static Format access$100(ExposedTrack exposedtrack)
		{
			return exposedtrack.fixedFormat;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Format fixedFormat>
		//    2    4:areturn         
		}

*/


/*
		static int access$500(ExposedTrack exposedtrack)
		{
			return exposedtrack.adaptationSetIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int adaptationSetIndex>
		//    2    4:ireturn         
		}

*/

		public ExposedTrack(MediaFormat mediaformat, int i, Format format)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			trackFormat = mediaformat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field MediaFormat trackFormat>
			adaptationSetIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int adaptationSetIndex>
			fixedFormat = format;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Format fixedFormat>
			adaptiveFormats = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #30  <Field Format[] adaptiveFormats>
			adaptiveMaxWidth = -1;
		//   14   24:aload_0         
		//   15   25:iconst_m1       
		//   16   26:putfield        #32  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = -1;
		//   17   29:aload_0         
		//   18   30:iconst_m1       
		//   19   31:putfield        #34  <Field int adaptiveMaxHeight>
		//   20   34:return          
		}

		public ExposedTrack(MediaFormat mediaformat, int i, Format aformat[], int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			trackFormat = mediaformat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field MediaFormat trackFormat>
			adaptationSetIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int adaptationSetIndex>
			adaptiveFormats = aformat;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field Format[] adaptiveFormats>
			adaptiveMaxWidth = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field int adaptiveMaxWidth>
			adaptiveMaxHeight = k;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #34  <Field int adaptiveMaxHeight>
			fixedFormat = null;
		//   17   31:aload_0         
		//   18   32:aconst_null     
		//   19   33:putfield        #28  <Field Format fixedFormat>
		//   20   36:return          
		}
	}

	public static class NoAdaptationSetException extends IOException
	{

		public NoAdaptationSetException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void IOException(String)>
		//    3    5:return          
		}
	}

	protected static final class PeriodHolder
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

		public void updatePeriod(MediaPresentationDescription mediapresentationdescription, int i, ExposedTrack exposedtrack)
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
			mediapresentationdescription = ((MediaPresentationDescription) (((AdaptationSet)period.adaptationSets.get(exposedtrack.adaptationSetIndex)).representations));
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
				exposedtrack = ((ExposedTrack) (representationIndices));
		//   18   37:aload_0         
		//   19   38:getfield        #96  <Field int[] representationIndices>
		//   20   41:astore_3        
				if(i < exposedtrack.length)
		//*  21   42:iload_2         
		//*  22   43:aload_3         
		//*  23   44:arraylength     
		//*  24   45:icmpge          91
				{
					exposedtrack = ((ExposedTrack) ((Representation)((List) (mediapresentationdescription)).get(exposedtrack[i])));
		//   25   48:aload_1         
		//   26   49:aload_3         
		//   27   50:iload_2         
		//   28   51:iaload          
		//   29   52:invokeinterface #58  <Method Object List.get(int)>
		//   30   57:checkcast       #107 <Class Representation>
		//   31   60:astore_3        
					((RepresentationHolder)representationHolders.get(((Object) (((Representation) (exposedtrack)).format.id)))).updateRepresentation(l, ((Representation) (exposedtrack)));
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
					updateRepresentationIndependentProperties(l, (Representation)((List) (mediapresentationdescription)).get(exposedtrack[0]));
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
		static DrmInitData access$200(PeriodHolder periodholder)
		{
			return periodholder.drmInitData;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field DrmInitData drmInitData>
		//    2    4:areturn         
		}

*/


/*
		static DrmInitData access$202(PeriodHolder periodholder, DrmInitData drminitdata)
		{
			periodholder.drmInitData = drminitdata;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #76  <Field DrmInitData drmInitData>
			return drminitdata;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		public PeriodHolder(int i, MediaPresentationDescription mediapresentationdescription, int j, ExposedTrack exposedtrack)
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
			AdaptationSet adaptationset = (AdaptationSet)period.adaptationSets.get(exposedtrack.adaptationSetIndex);
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
			if(!exposedtrack.isAdaptive())
		//*  33   71:aload           4
		//*  34   73:invokevirtual   #80  <Method boolean DashChunkSource$ExposedTrack.isAdaptive()>
		//*  35   76:ifne            104
			{
				representationIndices = (new int[] {
					getRepresentationIndex(((List) (mediapresentationdescription)), exposedtrack.fixedFormat.id)
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
				representationIndices = new int[exposedtrack.adaptiveFormats.length];
		//   49  104:aload_0         
		//   50  105:aload           4
		//   51  107:invokestatic    #100 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
		//   52  110:arraylength     
		//   53  111:newarray        int[]
		//   54  113:putfield        #96  <Field int[] representationIndices>
				for(i = 0; i < exposedtrack.adaptiveFormats.length; i++)
		//*  55  116:iconst_0        
		//*  56  117:istore_1        
		//*  57  118:iload_1         
		//*  58  119:aload           4
		//*  59  121:invokestatic    #100 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
		//*  60  124:arraylength     
		//*  61  125:icmpge          155
					representationIndices[i] = getRepresentationIndex(((List) (mediapresentationdescription)), exposedtrack.adaptiveFormats[i].id);
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
				exposedtrack = ((ExposedTrack) (representationIndices));
		//   85  168:aload_0         
		//   86  169:getfield        #96  <Field int[] representationIndices>
		//   87  172:astore          4
				if(i < exposedtrack.length)
		//*  88  174:iload_1         
		//*  89  175:aload           4
		//*  90  177:arraylength     
		//*  91  178:icmpge          238
				{
					exposedtrack = ((ExposedTrack) ((Representation)((List) (mediapresentationdescription)).get(exposedtrack[i])));
		//   92  181:aload_2         
		//   93  182:aload           4
		//   94  184:iload_1         
		//   95  185:iaload          
		//   96  186:invokeinterface #58  <Method Object List.get(int)>
		//   97  191:checkcast       #107 <Class Representation>
		//   98  194:astore          4
					RepresentationHolder representationholder = new RepresentationHolder(startTimeUs, l, ((Representation) (exposedtrack)));
		//   99  196:new             #109 <Class DashChunkSource$RepresentationHolder>
		//  100  199:dup             
		//  101  200:aload_0         
		//  102  201:getfield        #70  <Field long startTimeUs>
		//  103  204:lload           5
		//  104  206:aload           4
		//  105  208:invokespecial   #112 <Method void DashChunkSource$RepresentationHolder(long, long, Representation)>
		//  106  211:astore          7
					representationHolders.put(((Object) (((Representation) (exposedtrack)).format.id)), ((Object) (representationholder)));
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
					updateRepresentationIndependentProperties(l, (Representation)((List) (mediapresentationdescription)).get(exposedtrack[0]));
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

	protected static final class RepresentationHolder
	{

		public int getFirstAvailableSegmentNum()
		{
			return segmentIndex.getFirstSegmentNum() + segmentNumShift;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    2    4:invokeinterface #80  <Method int DashSegmentIndex.getFirstSegmentNum()>
		//    3    9:aload_0         
		//    4   10:getfield        #82  <Field int segmentNumShift>
		//    5   13:iadd            
		//    6   14:ireturn         
		}

		public int getLastSegmentNum()
		{
			return segmentIndex.getLastSegmentNum(periodDurationUs);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field long periodDurationUs>
		//    4    8:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
		//    5   13:ireturn         
		}

		public long getSegmentEndTimeUs(int i)
		{
			return getSegmentStartTimeUs(i) + segmentIndex.getDurationUs(i - segmentNumShift, periodDurationUs);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #91  <Method long getSegmentStartTimeUs(int)>
		//    3    5:aload_0         
		//    4    6:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    5    9:iload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #82  <Field int segmentNumShift>
		//    8   14:isub            
		//    9   15:aload_0         
		//   10   16:getfield        #31  <Field long periodDurationUs>
		//   11   19:invokeinterface #95  <Method long DashSegmentIndex.getDurationUs(int, long)>
		//   12   24:ladd            
		//   13   25:lreturn         
		}

		public int getSegmentNum(long l)
		{
			return segmentIndex.getSegmentNum(l - periodStartTimeUs, periodDurationUs) + segmentNumShift;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #29  <Field long periodStartTimeUs>
		//    5    9:lsub            
		//    6   10:aload_0         
		//    7   11:getfield        #31  <Field long periodDurationUs>
		//    8   14:invokeinterface #99  <Method int DashSegmentIndex.getSegmentNum(long, long)>
		//    9   19:aload_0         
		//   10   20:getfield        #82  <Field int segmentNumShift>
		//   11   23:iadd            
		//   12   24:ireturn         
		}

		public long getSegmentStartTimeUs(int i)
		{
			return segmentIndex.getTimeUs(i - segmentNumShift) + periodStartTimeUs;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #82  <Field int segmentNumShift>
		//    5    9:isub            
		//    6   10:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field long periodStartTimeUs>
		//    9   19:ladd            
		//   10   20:lreturn         
		}

		public RangedUri getSegmentUrl(int i)
		{
			return segmentIndex.getSegmentUrl(i - segmentNumShift);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #82  <Field int segmentNumShift>
		//    5    9:isub            
		//    6   10:invokeinterface #106 <Method RangedUri DashSegmentIndex.getSegmentUrl(int)>
		//    7   15:areturn         
		}

		public boolean isBeyondLastSegment(int i)
		{
			int j = getLastSegmentNum();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #110 <Method int getLastSegmentNum()>
		//    2    4:istore_2        
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(j == -1)
		//*   5    7:iload_2         
		//*   6    8:iconst_m1       
		//*   7    9:icmpne          14
				return false;
		//    8   12:iconst_0        
		//    9   13:ireturn         
			if(i > j + segmentNumShift)
		//*  10   14:iload_1         
		//*  11   15:iload_2         
		//*  12   16:aload_0         
		//*  13   17:getfield        #82  <Field int segmentNumShift>
		//*  14   20:iadd            
		//*  15   21:icmple          26
				flag = true;
		//   16   24:iconst_1        
		//   17   25:istore_3        
			return flag;
		//   18   26:iload_3         
		//   19   27:ireturn         
		}

		public void updateRepresentation(long l, Representation representation1)
			throws BehindLiveWindowException
		{
			DashSegmentIndex dashsegmentindex = representation.getIndex();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Representation representation>
		//    2    4:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
		//    3    7:astore          10
			DashSegmentIndex dashsegmentindex1 = representation1.getIndex();
		//    4    9:aload_3         
		//    5   10:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
		//    6   13:astore          11
			periodDurationUs = l;
		//    7   15:aload_0         
		//    8   16:lload_1         
		//    9   17:putfield        #31  <Field long periodDurationUs>
			representation = representation1;
		//   10   20:aload_0         
		//   11   21:aload_3         
		//   12   22:putfield        #33  <Field Representation representation>
			if(dashsegmentindex == null)
		//*  13   25:aload           10
		//*  14   27:ifnonnull       31
				return;
		//   15   30:return          
			segmentIndex = dashsegmentindex1;
		//   16   31:aload_0         
		//   17   32:aload           11
		//   18   34:putfield        #72  <Field DashSegmentIndex segmentIndex>
			if(!dashsegmentindex.isExplicit())
		//*  19   37:aload           10
		//*  20   39:invokeinterface #118 <Method boolean DashSegmentIndex.isExplicit()>
		//*  21   44:ifne            48
				return;
		//   22   47:return          
			int i = dashsegmentindex.getLastSegmentNum(periodDurationUs);
		//   23   48:aload           10
		//   24   50:aload_0         
		//   25   51:getfield        #31  <Field long periodDurationUs>
		//   26   54:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
		//   27   59:istore          4
			l = dashsegmentindex.getTimeUs(i);
		//   28   61:aload           10
		//   29   63:iload           4
		//   30   65:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
		//   31   70:lstore_1        
			long l1 = dashsegmentindex.getDurationUs(i, periodDurationUs);
		//   32   71:aload           10
		//   33   73:iload           4
		//   34   75:aload_0         
		//   35   76:getfield        #31  <Field long periodDurationUs>
		//   36   79:invokeinterface #95  <Method long DashSegmentIndex.getDurationUs(int, long)>
		//   37   84:lstore          6
			i = dashsegmentindex1.getFirstSegmentNum();
		//   38   86:aload           11
		//   39   88:invokeinterface #80  <Method int DashSegmentIndex.getFirstSegmentNum()>
		//   40   93:istore          4
			long l2 = dashsegmentindex1.getTimeUs(i);
		//   41   95:aload           11
		//   42   97:iload           4
		//   43   99:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
		//   44  104:lstore          8
			int j = l + l1 != l2;
		//   45  106:lload_1         
		//   46  107:lload           6
		//   47  109:ladd            
		//   48  110:lload           8
		//   49  112:lcmp            
		//   50  113:istore          5
			if(j == 0)
		//*  51  115:iload           5
		//*  52  117:ifne            146
			{
				segmentNumShift = segmentNumShift + ((dashsegmentindex.getLastSegmentNum(periodDurationUs) + 1) - i);
		//   53  120:aload_0         
		//   54  121:aload_0         
		//   55  122:getfield        #82  <Field int segmentNumShift>
		//   56  125:aload           10
		//   57  127:aload_0         
		//   58  128:getfield        #31  <Field long periodDurationUs>
		//   59  131:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
		//   60  136:iconst_1        
		//   61  137:iadd            
		//   62  138:iload           4
		//   63  140:isub            
		//   64  141:iadd            
		//   65  142:putfield        #82  <Field int segmentNumShift>
				return;
		//   66  145:return          
			}
			if(j >= 0)
		//*  67  146:iload           5
		//*  68  148:iflt            177
			{
				segmentNumShift = segmentNumShift + (dashsegmentindex.getSegmentNum(l2, periodDurationUs) - i);
		//   69  151:aload_0         
		//   70  152:aload_0         
		//   71  153:getfield        #82  <Field int segmentNumShift>
		//   72  156:aload           10
		//   73  158:lload           8
		//   74  160:aload_0         
		//   75  161:getfield        #31  <Field long periodDurationUs>
		//   76  164:invokeinterface #99  <Method int DashSegmentIndex.getSegmentNum(long, long)>
		//   77  169:iload           4
		//   78  171:isub            
		//   79  172:iadd            
		//   80  173:putfield        #82  <Field int segmentNumShift>
				return;
		//   81  176:return          
			} else
			{
				throw new BehindLiveWindowException();
		//   82  177:new             #114 <Class BehindLiveWindowException>
		//   83  180:dup             
		//   84  181:invokespecial   #119 <Method void BehindLiveWindowException()>
		//   85  184:athrow          
			}
		}

		public final ChunkExtractorWrapper extractorWrapper;
		public MediaFormat mediaFormat;
		public final boolean mimeTypeIsRawText;
		private long periodDurationUs;
		private final long periodStartTimeUs;
		public Representation representation;
		public DashSegmentIndex segmentIndex;
		private int segmentNumShift;

		public RepresentationHolder(long l, long l1, Representation representation1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			periodStartTimeUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #29  <Field long periodStartTimeUs>
			periodDurationUs = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #31  <Field long periodDurationUs>
			representation = representation1;
		//    8   14:aload_0         
		//    9   15:aload           5
		//   10   17:putfield        #33  <Field Representation representation>
			Object obj = ((Object) (representation1.format.mimeType));
		//   11   20:aload           5
		//   12   22:getfield        #39  <Field Format Representation.format>
		//   13   25:getfield        #45  <Field String Format.mimeType>
		//   14   28:astore          6
			mimeTypeIsRawText = DashChunkSource.mimeTypeIsRawText(((String) (obj)));
		//   15   30:aload_0         
		//   16   31:aload           6
		//   17   33:invokestatic    #48  <Method boolean DashChunkSource.mimeTypeIsRawText(String)>
		//   18   36:putfield        #50  <Field boolean mimeTypeIsRawText>
			if(mimeTypeIsRawText)
		//*  19   39:aload_0         
		//*  20   40:getfield        #50  <Field boolean mimeTypeIsRawText>
		//*  21   43:ifeq            52
			{
				obj = null;
		//   22   46:aconst_null     
		//   23   47:astore          6
			} else
		//*  24   49:goto            92
			{
				if(DashChunkSource.mimeTypeIsWebm(((String) (obj))))
		//*  25   52:aload           6
		//*  26   54:invokestatic    #53  <Method boolean DashChunkSource.mimeTypeIsWebm(String)>
		//*  27   57:ifeq            72
					obj = ((Object) (new WebmExtractor()));
		//   28   60:new             #55  <Class WebmExtractor>
		//   29   63:dup             
		//   30   64:invokespecial   #56  <Method void WebmExtractor()>
		//   31   67:astore          6
				else
		//*  32   69:goto            81
					obj = ((Object) (new FragmentedMp4Extractor()));
		//   33   72:new             #58  <Class FragmentedMp4Extractor>
		//   34   75:dup             
		//   35   76:invokespecial   #59  <Method void FragmentedMp4Extractor()>
		//   36   79:astore          6
				obj = ((Object) (new ChunkExtractorWrapper(((com.google.android.exoplayer.extractor.Extractor) (obj)))));
		//   37   81:new             #61  <Class ChunkExtractorWrapper>
		//   38   84:dup             
		//   39   85:aload           6
		//   40   87:invokespecial   #64  <Method void ChunkExtractorWrapper(com.google.android.exoplayer.extractor.Extractor)>
		//   41   90:astore          6
			}
			extractorWrapper = ((ChunkExtractorWrapper) (obj));
		//   42   92:aload_0         
		//   43   93:aload           6
		//   44   95:putfield        #66  <Field ChunkExtractorWrapper extractorWrapper>
			segmentIndex = representation1.getIndex();
		//   45   98:aload_0         
		//   46   99:aload           5
		//   47  101:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
		//   48  104:putfield        #72  <Field DashSegmentIndex segmentIndex>
		//   49  107:return          
		}
	}


	public DashChunkSource(DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l, int i, List list)
	{
		this(buildManifest(l, i, list), dashtrackselector, datasource, formatevaluator);
	//    0    0:aload_0         
	//    1    1:lload           4
	//    2    3:iload           6
	//    3    5:aload           7
	//    4    7:invokestatic    #80  <Method MediaPresentationDescription buildManifest(long, int, List)>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #83  <Method void DashChunkSource(MediaPresentationDescription, DashTrackSelector, DataSource, FormatEvaluator)>
	//    9   16:return          
	}

	public transient DashChunkSource(DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l, int i, Representation arepresentation[])
	{
		this(dashtrackselector, datasource, formatevaluator, l, i, Arrays.asList(((Object []) (arepresentation))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:aload           7
	//    7   10:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//    8   13:invokespecial   #95  <Method void DashChunkSource(DashTrackSelector, DataSource, FormatEvaluator, long, int, List)>
	//    9   16:return          
	}

	public DashChunkSource(MediaPresentationDescription mediapresentationdescription, DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator)
	{
		this(((ManifestFetcher) (null)), mediapresentationdescription, dashtrackselector, datasource, formatevaluator, ((Clock) (new SystemClock())), 0L, 0L, false, ((Handler) (null)), ((EventListener) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:new             #97  <Class SystemClock>
	//    7   10:dup             
	//    8   11:invokespecial   #100 <Method void SystemClock()>
	//    9   14:lconst_0        
	//   10   15:lconst_0        
	//   11   16:iconst_0        
	//   12   17:aconst_null     
	//   13   18:aconst_null     
	//   14   19:iconst_0        
	//   15   20:invokespecial   #103 <Method void DashChunkSource(ManifestFetcher, MediaPresentationDescription, DashTrackSelector, DataSource, FormatEvaluator, Clock, long, long, boolean, Handler, DashChunkSource$EventListener, int)>
	//   16   23:return          
	}

	public DashChunkSource(ManifestFetcher manifestfetcher, DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l, long l1, Handler handler, EventListener eventlistener, int i)
	{
		this(manifestfetcher, (MediaPresentationDescription)manifestfetcher.getManifest(), dashtrackselector, datasource, formatevaluator, ((Clock) (new SystemClock())), l * 1000L, l1 * 1000L, true, handler, eventlistener, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #110 <Method Object ManifestFetcher.getManifest()>
	//    4    6:checkcast       #112 <Class MediaPresentationDescription>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:new             #97  <Class SystemClock>
	//    9   16:dup             
	//   10   17:invokespecial   #100 <Method void SystemClock()>
	//   11   20:lload           5
	//   12   22:ldc2w           #113 <Long 1000L>
	//   13   25:lmul            
	//   14   26:lload           7
	//   15   28:ldc2w           #113 <Long 1000L>
	//   16   31:lmul            
	//   17   32:iconst_1        
	//   18   33:aload           9
	//   19   35:aload           10
	//   20   37:iload           11
	//   21   39:invokespecial   #103 <Method void DashChunkSource(ManifestFetcher, MediaPresentationDescription, DashTrackSelector, DataSource, FormatEvaluator, Clock, long, long, boolean, Handler, DashChunkSource$EventListener, int)>
	//   22   42:return          
	}

	public DashChunkSource(ManifestFetcher manifestfetcher, DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator, long l, long l1, boolean flag, Handler handler, EventListener eventlistener, int i)
	{
		this(manifestfetcher, (MediaPresentationDescription)manifestfetcher.getManifest(), dashtrackselector, datasource, formatevaluator, ((Clock) (new SystemClock())), l * 1000L, l1 * 1000L, flag, handler, eventlistener, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #110 <Method Object ManifestFetcher.getManifest()>
	//    4    6:checkcast       #112 <Class MediaPresentationDescription>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:new             #97  <Class SystemClock>
	//    9   16:dup             
	//   10   17:invokespecial   #100 <Method void SystemClock()>
	//   11   20:lload           5
	//   12   22:ldc2w           #113 <Long 1000L>
	//   13   25:lmul            
	//   14   26:lload           7
	//   15   28:ldc2w           #113 <Long 1000L>
	//   16   31:lmul            
	//   17   32:iload           9
	//   18   34:aload           10
	//   19   36:aload           11
	//   20   38:iload           12
	//   21   40:invokespecial   #103 <Method void DashChunkSource(ManifestFetcher, MediaPresentationDescription, DashTrackSelector, DataSource, FormatEvaluator, Clock, long, long, boolean, Handler, DashChunkSource$EventListener, int)>
	//   22   43:return          
	}

	DashChunkSource(ManifestFetcher manifestfetcher, MediaPresentationDescription mediapresentationdescription, DashTrackSelector dashtrackselector, DataSource datasource, FormatEvaluator formatevaluator, Clock clock, long l, long l1, boolean flag, Handler handler, EventListener eventlistener, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Object()>
		manifestFetcher = manifestfetcher;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #120 <Field ManifestFetcher manifestFetcher>
		currentManifest = mediapresentationdescription;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #122 <Field MediaPresentationDescription currentManifest>
		trackSelector = dashtrackselector;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #124 <Field DashTrackSelector trackSelector>
		dataSource = datasource;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #126 <Field DataSource dataSource>
		adaptiveFormatEvaluator = formatevaluator;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #128 <Field FormatEvaluator adaptiveFormatEvaluator>
		systemClock = clock;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #130 <Field Clock systemClock>
		liveEdgeLatencyUs = l;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #132 <Field long liveEdgeLatencyUs>
		elapsedRealtimeOffsetUs = l1;
	//   23   43:aload_0         
	//   24   44:lload           9
	//   25   46:putfield        #134 <Field long elapsedRealtimeOffsetUs>
		startAtLiveEdge = flag;
	//   26   49:aload_0         
	//   27   50:iload           11
	//   28   52:putfield        #136 <Field boolean startAtLiveEdge>
		eventHandler = handler;
	//   29   55:aload_0         
	//   30   56:aload           12
	//   31   58:putfield        #138 <Field Handler eventHandler>
		eventListener = eventlistener;
	//   32   61:aload_0         
	//   33   62:aload           13
	//   34   64:putfield        #140 <Field DashChunkSource$EventListener eventListener>
		eventSourceId = i;
	//   35   67:aload_0         
	//   36   68:iload           14
	//   37   70:putfield        #142 <Field int eventSourceId>
		evaluation = new com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation();
	//   38   73:aload_0         
	//   39   74:new             #144 <Class com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation>
	//   40   77:dup             
	//   41   78:invokespecial   #145 <Method void com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation()>
	//   42   81:putfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
		availableRangeValues = new long[2];
	//   43   84:aload_0         
	//   44   85:iconst_2        
	//   45   86:newarray        long[]
	//   46   88:putfield        #149 <Field long[] availableRangeValues>
		periodHolders = new SparseArray();
	//   47   91:aload_0         
	//   48   92:new             #151 <Class SparseArray>
	//   49   95:dup             
	//   50   96:invokespecial   #152 <Method void SparseArray()>
	//   51   99:putfield        #154 <Field SparseArray periodHolders>
		tracks = new ArrayList();
	//   52  102:aload_0         
	//   53  103:new             #156 <Class ArrayList>
	//   54  106:dup             
	//   55  107:invokespecial   #157 <Method void ArrayList()>
	//   56  110:putfield        #159 <Field ArrayList tracks>
		live = mediapresentationdescription.dynamic;
	//   57  113:aload_0         
	//   58  114:aload_2         
	//   59  115:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//   60  118:putfield        #164 <Field boolean live>
	//   61  121:return          
	}

	private static MediaPresentationDescription buildManifest(long l, int i, List list)
	{
		return new MediaPresentationDescription(-1L, l, -1L, false, -1L, -1L, ((com.google.android.exoplayer.dash.mpd.UtcTimingElement) (null)), ((String) (null)), Collections.singletonList(((Object) (new Period(((String) (null)), 0L, Collections.singletonList(((Object) (new AdaptationSet(0, i, list)))))))));
	//    0    0:new             #112 <Class MediaPresentationDescription>
	//    1    3:dup             
	//    2    4:ldc2w           #170 <Long -1L>
	//    3    7:lload_0         
	//    4    8:ldc2w           #170 <Long -1L>
	//    5   11:iconst_0        
	//    6   12:ldc2w           #170 <Long -1L>
	//    7   15:ldc2w           #170 <Long -1L>
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:new             #173 <Class Period>
	//   11   23:dup             
	//   12   24:aconst_null     
	//   13   25:lconst_0        
	//   14   26:new             #175 <Class AdaptationSet>
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:iload_2         
	//   18   32:aload_3         
	//   19   33:invokespecial   #178 <Method void AdaptationSet(int, int, List)>
	//   20   36:invokestatic    #184 <Method List Collections.singletonList(Object)>
	//   21   39:invokespecial   #187 <Method void Period(String, long, List)>
	//   22   42:invokestatic    #184 <Method List Collections.singletonList(Object)>
	//   23   45:invokespecial   #190 <Method void MediaPresentationDescription(long, long, long, boolean, long, long, com.google.android.exoplayer.dash.mpd.UtcTimingElement, String, List)>
	//   24   48:areturn         
	}

	private PeriodHolder findPeriodHolder(long l)
	{
		Object obj = ((Object) (periodHolders));
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field SparseArray periodHolders>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(l < ((PeriodHolder)((SparseArray) (obj)).valueAt(0)).getAvailableStartTimeUs())
	//*   5    8:lload_1         
	//*   6    9:aload           4
	//*   7   11:iconst_0        
	//*   8   12:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//*   9   15:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//*  10   18:invokevirtual   #201 <Method long DashChunkSource$PeriodHolder.getAvailableStartTimeUs()>
	//*  11   21:lcmp            
	//*  12   22:ifge            37
			return (PeriodHolder)periodHolders.valueAt(0);
	//   13   25:aload_0         
	//   14   26:getfield        #154 <Field SparseArray periodHolders>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//   17   33:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   18   36:areturn         
		for(; i < periodHolders.size() - 1; i++)
	//*  19   37:iload_3         
	//*  20   38:aload_0         
	//*  21   39:getfield        #154 <Field SparseArray periodHolders>
	//*  22   42:invokevirtual   #205 <Method int SparseArray.size()>
	//*  23   45:iconst_1        
	//*  24   46:isub            
	//*  25   47:icmpge          83
		{
			obj = ((Object) ((PeriodHolder)periodHolders.valueAt(i)));
	//   26   50:aload_0         
	//   27   51:getfield        #154 <Field SparseArray periodHolders>
	//   28   54:iload_3         
	//   29   55:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//   30   58:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   31   61:astore          4
			if(l < ((PeriodHolder) (obj)).getAvailableEndTimeUs())
	//*  32   63:lload_1         
	//*  33   64:aload           4
	//*  34   66:invokevirtual   #208 <Method long DashChunkSource$PeriodHolder.getAvailableEndTimeUs()>
	//*  35   69:lcmp            
	//*  36   70:ifge            76
				return ((PeriodHolder) (obj));
	//   37   73:aload           4
	//   38   75:areturn         
		}

	//   39   76:iload_3         
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore_3        
	//*  43   80:goto            37
		obj = ((Object) (periodHolders));
	//   44   83:aload_0         
	//   45   84:getfield        #154 <Field SparseArray periodHolders>
	//   46   87:astore          4
		return (PeriodHolder)((SparseArray) (obj)).valueAt(((SparseArray) (obj)).size() - 1);
	//   47   89:aload           4
	//   48   91:aload           4
	//   49   93:invokevirtual   #205 <Method int SparseArray.size()>
	//   50   96:iconst_1        
	//   51   97:isub            
	//   52   98:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//   53  101:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   54  104:areturn         
	}

	private TimeRange getAvailableRange(long l)
	{
		PeriodHolder periodholder = (PeriodHolder)periodHolders.valueAt(0);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field SparseArray periodHolders>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//    4    8:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//    5   11:astore          13
		Object obj = ((Object) (periodHolders));
	//    6   13:aload_0         
	//    7   14:getfield        #154 <Field SparseArray periodHolders>
	//    8   17:astore          14
		obj = ((Object) ((PeriodHolder)((SparseArray) (obj)).valueAt(((SparseArray) (obj)).size() - 1)));
	//    9   19:aload           14
	//   10   21:aload           14
	//   11   23:invokevirtual   #205 <Method int SparseArray.size()>
	//   12   26:iconst_1        
	//   13   27:isub            
	//   14   28:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//   15   31:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   16   34:astore          14
		if(currentManifest.dynamic && !((PeriodHolder) (obj)).isIndexExplicit())
	//*  17   36:aload_0         
	//*  18   37:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//*  19   40:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//*  20   43:ifeq            172
	//*  21   46:aload           14
	//*  22   48:invokevirtual   #214 <Method boolean DashChunkSource$PeriodHolder.isIndexExplicit()>
	//*  23   51:ifeq            57
	//*  24   54:goto            172
		{
			long l3 = periodholder.getAvailableStartTimeUs();
	//   25   57:aload           13
	//   26   59:invokevirtual   #201 <Method long DashChunkSource$PeriodHolder.getAvailableStartTimeUs()>
	//   27   62:lstore          7
			long l1;
			if(((PeriodHolder) (obj)).isIndexUnbounded())
	//*  28   64:aload           14
	//*  29   66:invokevirtual   #217 <Method boolean DashChunkSource$PeriodHolder.isIndexUnbounded()>
	//*  30   69:ifeq            79
				l1 = 0xffffffffL;
	//   31   72:ldc2w           #218 <Long 0xffffffffL>
	//   32   75:lstore_3        
			else
	//*  33   76:goto            85
				l1 = ((PeriodHolder) (obj)).getAvailableEndTimeUs();
	//   34   79:aload           14
	//   35   81:invokevirtual   #208 <Method long DashChunkSource$PeriodHolder.getAvailableEndTimeUs()>
	//   36   84:lstore_3        
			long l4 = systemClock.elapsedRealtime();
	//   37   85:aload_0         
	//   38   86:getfield        #130 <Field Clock systemClock>
	//   39   89:invokeinterface #224 <Method long Clock.elapsedRealtime()>
	//   40   94:lstore          9
			long l5 = currentManifest.availabilityStartTime;
	//   41   96:aload_0         
	//   42   97:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//   43  100:getfield        #227 <Field long MediaPresentationDescription.availabilityStartTime>
	//   44  103:lstore          11
			long l2;
			if(currentManifest.timeShiftBufferDepth == -1L)
	//*  45  105:aload_0         
	//*  46  106:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//*  47  109:getfield        #230 <Field long MediaPresentationDescription.timeShiftBufferDepth>
	//*  48  112:ldc2w           #170 <Long -1L>
	//*  49  115:lcmp            
	//*  50  116:ifne            127
				l2 = -1L;
	//   51  119:ldc2w           #170 <Long -1L>
	//   52  122:lstore          5
			else
	//*  53  124:goto            140
				l2 = currentManifest.timeShiftBufferDepth * 1000L;
	//   54  127:aload_0         
	//   55  128:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//   56  131:getfield        #230 <Field long MediaPresentationDescription.timeShiftBufferDepth>
	//   57  134:ldc2w           #113 <Long 1000L>
	//   58  137:lmul            
	//   59  138:lstore          5
			return ((TimeRange) (new com.google.android.exoplayer.TimeRange.DynamicTimeRange(l3, l1, l4 * 1000L - (l - l5 * 1000L), l2, systemClock)));
	//   60  140:new             #232 <Class com.google.android.exoplayer.TimeRange$DynamicTimeRange>
	//   61  143:dup             
	//   62  144:lload           7
	//   63  146:lload_3         
	//   64  147:lload           9
	//   65  149:ldc2w           #113 <Long 1000L>
	//   66  152:lmul            
	//   67  153:lload_1         
	//   68  154:lload           11
	//   69  156:ldc2w           #113 <Long 1000L>
	//   70  159:lmul            
	//   71  160:lsub            
	//   72  161:lsub            
	//   73  162:lload           5
	//   74  164:aload_0         
	//   75  165:getfield        #130 <Field Clock systemClock>
	//   76  168:invokespecial   #235 <Method void com.google.android.exoplayer.TimeRange$DynamicTimeRange(long, long, long, long, Clock)>
	//   77  171:areturn         
		} else
		{
			return ((TimeRange) (new com.google.android.exoplayer.TimeRange.StaticTimeRange(periodholder.getAvailableStartTimeUs(), ((PeriodHolder) (obj)).getAvailableEndTimeUs())));
	//   78  172:new             #237 <Class com.google.android.exoplayer.TimeRange$StaticTimeRange>
	//   79  175:dup             
	//   80  176:aload           13
	//   81  178:invokevirtual   #201 <Method long DashChunkSource$PeriodHolder.getAvailableStartTimeUs()>
	//   82  181:aload           14
	//   83  183:invokevirtual   #208 <Method long DashChunkSource$PeriodHolder.getAvailableEndTimeUs()>
	//   84  186:invokespecial   #240 <Method void com.google.android.exoplayer.TimeRange$StaticTimeRange(long, long)>
	//   85  189:areturn         
		}
	}

	private static String getMediaMimeType(Format format)
	{
		String s = format.mimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field String Format.mimeType>
	//    2    4:astore_1        
		if(MimeTypes.isAudio(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #253 <Method boolean MimeTypes.isAudio(String)>
	//*   5    9:ifeq            20
			return MimeTypes.getAudioMediaMimeType(format.codecs);
	//    6   12:aload_0         
	//    7   13:getfield        #256 <Field String Format.codecs>
	//    8   16:invokestatic    #260 <Method String MimeTypes.getAudioMediaMimeType(String)>
	//    9   19:areturn         
		if(MimeTypes.isVideo(s))
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #263 <Method boolean MimeTypes.isVideo(String)>
	//*  12   24:ifeq            35
			return MimeTypes.getVideoMediaMimeType(format.codecs);
	//   13   27:aload_0         
	//   14   28:getfield        #256 <Field String Format.codecs>
	//   15   31:invokestatic    #266 <Method String MimeTypes.getVideoMediaMimeType(String)>
	//   16   34:areturn         
		if(mimeTypeIsRawText(s))
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #269 <Method boolean mimeTypeIsRawText(String)>
	//*  19   39:ifeq            44
			return s;
	//   20   42:aload_1         
	//   21   43:areturn         
		if("application/mp4".equals(((Object) (s))))
	//*  22   44:ldc2            #271 <String "application/mp4">
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  25   51:ifeq            88
		{
			if("stpp".equals(((Object) (format.codecs))))
	//*  26   54:ldc2            #279 <String "stpp">
	//*  27   57:aload_0         
	//*  28   58:getfield        #256 <Field String Format.codecs>
	//*  29   61:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  30   64:ifeq            71
				return "application/ttml+xml";
	//   31   67:ldc2            #281 <String "application/ttml+xml">
	//   32   70:areturn         
			if("wvtt".equals(((Object) (format.codecs))))
	//*  33   71:ldc2            #283 <String "wvtt">
	//*  34   74:aload_0         
	//*  35   75:getfield        #256 <Field String Format.codecs>
	//*  36   78:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  37   81:ifeq            88
				return "application/x-mp4vtt";
	//   38   84:ldc2            #285 <String "application/x-mp4vtt">
	//   39   87:areturn         
		}
		return null;
	//   40   88:aconst_null     
	//   41   89:areturn         
	}

	private long getNowUnixTimeUs()
	{
		if(elapsedRealtimeOffsetUs != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field long elapsedRealtimeOffsetUs>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            28
			return systemClock.elapsedRealtime() * 1000L + elapsedRealtimeOffsetUs;
	//    5    9:aload_0         
	//    6   10:getfield        #130 <Field Clock systemClock>
	//    7   13:invokeinterface #224 <Method long Clock.elapsedRealtime()>
	//    8   18:ldc2w           #113 <Long 1000L>
	//    9   21:lmul            
	//   10   22:aload_0         
	//   11   23:getfield        #134 <Field long elapsedRealtimeOffsetUs>
	//   12   26:ladd            
	//   13   27:lreturn         
		else
			return System.currentTimeMillis() * 1000L;
	//   14   28:invokestatic    #291 <Method long System.currentTimeMillis()>
	//   15   31:ldc2w           #113 <Long 1000L>
	//   16   34:lmul            
	//   17   35:lreturn         
	}

	private static MediaFormat getTrackFormat(int i, Format format, String s, long l)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 76
	//	               1 48
	//	               2 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 2: // '\002'
			return MediaFormat.createTextFormat(format.id, s, format.bitrate, l, format.language);
	//    4   30:aload_1         
	//    5   31:getfield        #296 <Field String Format.id>
	//    6   34:aload_2         
	//    7   35:aload_1         
	//    8   36:getfield        #299 <Field int Format.bitrate>
	//    9   39:lload_3         
	//   10   40:aload_1         
	//   11   41:getfield        #302 <Field String Format.language>
	//   12   44:invokestatic    #308 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//   13   47:areturn         

		case 1: // '\001'
			return MediaFormat.createAudioFormat(format.id, s, format.bitrate, -1, l, format.audioChannels, format.audioSamplingRate, ((List) (null)), format.language);
	//   14   48:aload_1         
	//   15   49:getfield        #296 <Field String Format.id>
	//   16   52:aload_2         
	//   17   53:aload_1         
	//   18   54:getfield        #299 <Field int Format.bitrate>
	//   19   57:iconst_m1       
	//   20   58:lload_3         
	//   21   59:aload_1         
	//   22   60:getfield        #311 <Field int Format.audioChannels>
	//   23   63:aload_1         
	//   24   64:getfield        #314 <Field int Format.audioSamplingRate>
	//   25   67:aconst_null     
	//   26   68:aload_1         
	//   27   69:getfield        #302 <Field String Format.language>
	//   28   72:invokestatic    #318 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String)>
	//   29   75:areturn         

		case 0: // '\0'
			return MediaFormat.createVideoFormat(format.id, s, format.bitrate, -1, l, format.width, format.height, ((List) (null)));
	//   30   76:aload_1         
	//   31   77:getfield        #296 <Field String Format.id>
	//   32   80:aload_2         
	//   33   81:aload_1         
	//   34   82:getfield        #299 <Field int Format.bitrate>
	//   35   85:iconst_m1       
	//   36   86:lload_3         
	//   37   87:aload_1         
	//   38   88:getfield        #321 <Field int Format.width>
	//   39   91:aload_1         
	//   40   92:getfield        #324 <Field int Format.height>
	//   41   95:aconst_null     
	//   42   96:invokestatic    #328 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List)>
	//   43   99:areturn         
		}
	}

	static boolean mimeTypeIsRawText(String s)
	{
		return "text/vtt".equals(((Object) (s))) || "application/ttml+xml".equals(((Object) (s)));
	//    0    0:ldc2            #330 <String "text/vtt">
	//    1    3:aload_0         
	//    2    4:invokevirtual   #277 <Method boolean String.equals(Object)>
	//    3    7:ifne            25
	//    4   10:ldc2            #281 <String "application/ttml+xml">
	//    5   13:aload_0         
	//    6   14:invokevirtual   #277 <Method boolean String.equals(Object)>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	static boolean mimeTypeIsWebm(String s)
	{
		return s.startsWith("video/webm") || s.startsWith("audio/webm") || s.startsWith("application/webm");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "video/webm">
	//    2    4:invokevirtual   #336 <Method boolean String.startsWith(String)>
	//    3    7:ifne            35
	//    4   10:aload_0         
	//    5   11:ldc2            #338 <String "audio/webm">
	//    6   14:invokevirtual   #336 <Method boolean String.startsWith(String)>
	//    7   17:ifne            35
	//    8   20:aload_0         
	//    9   21:ldc2            #340 <String "application/webm">
	//   10   24:invokevirtual   #336 <Method boolean String.startsWith(String)>
	//   11   27:ifeq            33
	//   12   30:goto            35
	//   13   33:iconst_0        
	//   14   34:ireturn         
	//   15   35:iconst_1        
	//   16   36:ireturn         
	}

	private Chunk newInitializationChunk(RangedUri rangeduri, RangedUri rangeduri1, Representation representation, ChunkExtractorWrapper chunkextractorwrapper, DataSource datasource, int i, int j)
	{
		RangedUri rangeduri2 = rangeduri1;
	//    0    0:aload_2         
	//    1    1:astore          8
		if(rangeduri != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          27
		{
			rangeduri1 = rangeduri.attemptMerge(rangeduri1, representation.baseUrl);
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:getfield        #347 <Field String Representation.baseUrl>
	//    8   13:invokevirtual   #353 <Method RangedUri RangedUri.attemptMerge(RangedUri, String)>
	//    9   16:astore_2        
			rangeduri2 = rangeduri1;
	//   10   17:aload_2         
	//   11   18:astore          8
			if(rangeduri1 == null)
	//*  12   20:aload_2         
	//*  13   21:ifnonnull       27
				rangeduri2 = rangeduri;
	//   14   24:aload_1         
	//   15   25:astore          8
		}
		return ((Chunk) (new InitializationChunk(datasource, new DataSpec(rangeduri2.resolveUri(representation.baseUrl), rangeduri2.start, rangeduri2.length, representation.getCacheKey()), j, representation.format, chunkextractorwrapper, i)));
	//   16   27:new             #355 <Class InitializationChunk>
	//   17   30:dup             
	//   18   31:aload           5
	//   19   33:new             #357 <Class DataSpec>
	//   20   36:dup             
	//   21   37:aload           8
	//   22   39:aload_3         
	//   23   40:getfield        #347 <Field String Representation.baseUrl>
	//   24   43:invokevirtual   #361 <Method Uri RangedUri.resolveUri(String)>
	//   25   46:aload           8
	//   26   48:getfield        #364 <Field long RangedUri.start>
	//   27   51:aload           8
	//   28   53:getfield        #367 <Field long RangedUri.length>
	//   29   56:aload_3         
	//   30   57:invokevirtual   #371 <Method String Representation.getCacheKey()>
	//   31   60:invokespecial   #374 <Method void DataSpec(Uri, long, long, String)>
	//   32   63:iload           7
	//   33   65:aload_3         
	//   34   66:getfield        #378 <Field Format Representation.format>
	//   35   69:aload           4
	//   36   71:iload           6
	//   37   73:invokespecial   #381 <Method void InitializationChunk(DataSource, DataSpec, int, Format, ChunkExtractorWrapper, int)>
	//   38   76:areturn         
	}

	private void notifyAvailableRangeChanged(final TimeRange seekRange)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #140 <Field DashChunkSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onAvailableRangeChanged(eventSourceId, seekRange);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field DashChunkSource this$0>
				//    2    4:invokestatic    #30  <Method DashChunkSource$EventListener DashChunkSource.access$400(DashChunkSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field DashChunkSource this$0>
				//    5   11:invokestatic    #34  <Method int DashChunkSource.access$300(DashChunkSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field TimeRange val$seekRange>
				//    8   18:invokeinterface #40  <Method void DashChunkSource$EventListener.onAvailableRangeChanged(int, TimeRange)>
				//    9   23:return          
				}

				final DashChunkSource this$0;
				final TimeRange val$seekRange;

			
			{
				this$0 = DashChunkSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DashChunkSource this$0>
				seekRange = timerange;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TimeRange val$seekRange>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #10  <Class DashChunkSource$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #386 <Method void DashChunkSource$1(DashChunkSource, TimeRange)>
	//   14   26:invokevirtual   #392 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void processManifest(MediaPresentationDescription mediapresentationdescription)
	{
		PeriodHolder periodholder;
		for(Period period = mediapresentationdescription.getPeriod(0); periodHolders.size() > 0 && ((PeriodHolder)periodHolders.valueAt(0)).startTimeUs < period.startMs * 1000L; periodHolders.remove(periodholder.localIndex))
	//*   0    0:aload_1         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #400 <Method Period MediaPresentationDescription.getPeriod(int)>
	//*   3    5:astore_3        
	//*   4    6:aload_0         
	//*   5    7:getfield        #154 <Field SparseArray periodHolders>
	//*   6   10:invokevirtual   #205 <Method int SparseArray.size()>
	//*   7   13:ifle            70
	//*   8   16:aload_0         
	//*   9   17:getfield        #154 <Field SparseArray periodHolders>
	//*  10   20:iconst_0        
	//*  11   21:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//*  12   24:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//*  13   27:getfield        #403 <Field long DashChunkSource$PeriodHolder.startTimeUs>
	//*  14   30:aload_3         
	//*  15   31:getfield        #406 <Field long Period.startMs>
	//*  16   34:ldc2w           #113 <Long 1000L>
	//*  17   37:lmul            
	//*  18   38:lcmp            
	//*  19   39:ifge            70
			periodholder = (PeriodHolder)periodHolders.valueAt(0);
	//   20   42:aload_0         
	//   21   43:getfield        #154 <Field SparseArray periodHolders>
	//   22   46:iconst_0        
	//   23   47:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//   24   50:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   25   53:astore          4

	//   26   55:aload_0         
	//   27   56:getfield        #154 <Field SparseArray periodHolders>
	//   28   59:aload           4
	//   29   61:getfield        #409 <Field int DashChunkSource$PeriodHolder.localIndex>
	//   30   64:invokevirtual   #413 <Method void SparseArray.remove(int)>
	//*  31   67:goto            6
		if(periodHolders.size() > mediapresentationdescription.getPeriodCount())
	//*  32   70:aload_0         
	//*  33   71:getfield        #154 <Field SparseArray periodHolders>
	//*  34   74:invokevirtual   #205 <Method int SparseArray.size()>
	//*  35   77:aload_1         
	//*  36   78:invokevirtual   #416 <Method int MediaPresentationDescription.getPeriodCount()>
	//*  37   81:icmple          85
			return;
	//   38   84:return          
		int i;
		Object obj;
		TimeRange timerange;
		try
		{
			i = periodHolders.size();
	//   39   85:aload_0         
	//   40   86:getfield        #154 <Field SparseArray periodHolders>
	//   41   89:invokevirtual   #205 <Method int SparseArray.size()>
	//   42   92:istore_2        
		}
	//*  43   93:iload_2         
	//*  44   94:ifle            146
	//*  45   97:aload_0         
	//*  46   98:getfield        #154 <Field SparseArray periodHolders>
	//*  47  101:iconst_0        
	//*  48  102:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//*  49  105:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//*  50  108:aload_1         
	//*  51  109:iconst_0        
	//*  52  110:aload_0         
	//*  53  111:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*  54  114:invokevirtual   #422 <Method void DashChunkSource$PeriodHolder.updatePeriod(MediaPresentationDescription, int, DashChunkSource$ExposedTrack)>
	//*  55  117:iload_2         
	//*  56  118:iconst_1        
	//*  57  119:icmple          146
	//*  58  122:iload_2         
	//*  59  123:iconst_1        
	//*  60  124:isub            
	//*  61  125:istore_2        
	//*  62  126:aload_0         
	//*  63  127:getfield        #154 <Field SparseArray periodHolders>
	//*  64  130:iload_2         
	//*  65  131:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//*  66  134:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//*  67  137:aload_1         
	//*  68  138:iload_2         
	//*  69  139:aload_0         
	//*  70  140:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*  71  143:invokevirtual   #422 <Method void DashChunkSource$PeriodHolder.updatePeriod(MediaPresentationDescription, int, DashChunkSource$ExposedTrack)>
	//*  72  146:aload_0         
	//*  73  147:getfield        #154 <Field SparseArray periodHolders>
	//*  74  150:invokevirtual   #205 <Method int SparseArray.size()>
	//*  75  153:istore_2        
	//*  76  154:iload_2         
	//*  77  155:aload_1         
	//*  78  156:invokevirtual   #416 <Method int MediaPresentationDescription.getPeriodCount()>
	//*  79  159:icmpge          209
	//*  80  162:new             #21  <Class DashChunkSource$PeriodHolder>
	//*  81  165:dup             
	//*  82  166:aload_0         
	//*  83  167:getfield        #424 <Field int nextPeriodHolderIndex>
	//*  84  170:aload_1         
	//*  85  171:iload_2         
	//*  86  172:aload_0         
	//*  87  173:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*  88  176:invokespecial   #427 <Method void DashChunkSource$PeriodHolder(int, MediaPresentationDescription, int, DashChunkSource$ExposedTrack)>
	//*  89  179:astore_3        
	//*  90  180:aload_0         
	//*  91  181:getfield        #154 <Field SparseArray periodHolders>
	//*  92  184:aload_0         
	//*  93  185:getfield        #424 <Field int nextPeriodHolderIndex>
	//*  94  188:aload_3         
	//*  95  189:invokevirtual   #431 <Method void SparseArray.put(int, Object)>
	//*  96  192:aload_0         
	//*  97  193:aload_0         
	//*  98  194:getfield        #424 <Field int nextPeriodHolderIndex>
	//*  99  197:iconst_1        
	//* 100  198:iadd            
	//* 101  199:putfield        #424 <Field int nextPeriodHolderIndex>
	//* 102  202:iload_2         
	//* 103  203:iconst_1        
	//* 104  204:iadd            
	//* 105  205:istore_2        
	//* 106  206:goto            154
	//* 107  209:aload_0         
	//* 108  210:aload_0         
	//* 109  211:invokespecial   #433 <Method long getNowUnixTimeUs()>
	//* 110  214:invokespecial   #435 <Method TimeRange getAvailableRange(long)>
	//* 111  217:astore_3        
	//* 112  218:aload_0         
	//* 113  219:getfield        #437 <Field TimeRange availableRange>
	//* 114  222:astore          4
	//* 115  224:aload           4
	//* 116  226:ifnull          238
	//* 117  229:aload           4
	//* 118  231:aload_3         
	//* 119  232:invokevirtual   #438 <Method boolean Object.equals(Object)>
	//* 120  235:ifne            251
	//* 121  238:aload_0         
	//* 122  239:aload_3         
	//* 123  240:putfield        #437 <Field TimeRange availableRange>
	//* 124  243:aload_0         
	//* 125  244:aload_0         
	//* 126  245:getfield        #437 <Field TimeRange availableRange>
	//* 127  248:invokespecial   #440 <Method void notifyAvailableRangeChanged(TimeRange)>
	//* 128  251:aload_0         
	//* 129  252:aload_1         
	//* 130  253:putfield        #122 <Field MediaPresentationDescription currentManifest>
	//* 131  256:return          
		// Misplaced declaration of an exception variable
		catch(MediaPresentationDescription mediapresentationdescription)
	//* 132  257:astore_1        
		{
			fatalError = ((IOException) (mediapresentationdescription));
	//  133  258:aload_0         
	//  134  259:aload_1         
	//  135  260:putfield        #442 <Field IOException fatalError>
			return;
	//  136  263:return          
		}
		if(i <= 0)
			break MISSING_BLOCK_LABEL_146;
		((PeriodHolder)periodHolders.valueAt(0)).updatePeriod(mediapresentationdescription, 0, enabledTrack);
		if(i <= 1)
			break MISSING_BLOCK_LABEL_146;
		i--;
		((PeriodHolder)periodHolders.valueAt(i)).updatePeriod(mediapresentationdescription, i, enabledTrack);
		for(i = periodHolders.size(); i < mediapresentationdescription.getPeriodCount(); i++)
		{
			obj = ((Object) (new PeriodHolder(nextPeriodHolderIndex, mediapresentationdescription, i, enabledTrack)));
			periodHolders.put(nextPeriodHolderIndex, obj);
			nextPeriodHolderIndex = nextPeriodHolderIndex + 1;
		}

		obj = ((Object) (getAvailableRange(getNowUnixTimeUs())));
		timerange = availableRange;
		if(timerange == null || !((Object) (timerange)).equals(obj))
		{
			availableRange = ((TimeRange) (obj));
			notifyAvailableRangeChanged(availableRange);
		}
		currentManifest = mediapresentationdescription;
		return;
	}

	public void adaptiveTrack(MediaPresentationDescription mediapresentationdescription, int i, int j, int ai[])
	{
		if(adaptiveFormatEvaluator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field FormatEvaluator adaptiveFormatEvaluator>
	//*   2    4:ifnonnull       17
		{
			Log.w("DashChunkSource", "Skipping adaptive track (missing format evaluator)");
	//    3    7:ldc1            #29  <String "DashChunkSource">
	//    4    9:ldc2            #446 <String "Skipping adaptive track (missing format evaluator)">
	//    5   12:invokestatic    #452 <Method int Log.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		AdaptationSet adaptationset = (AdaptationSet)mediapresentationdescription.getPeriod(i).adaptationSets.get(j);
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:invokevirtual   #400 <Method Period MediaPresentationDescription.getPeriod(int)>
	//   11   22:getfield        #456 <Field List Period.adaptationSets>
	//   12   25:iload_3         
	//   13   26:invokeinterface #461 <Method Object List.get(int)>
	//   14   31:checkcast       #175 <Class AdaptationSet>
	//   15   34:astore          12
		Format aformat[] = new Format[ai.length];
	//   16   36:aload           4
	//   17   38:arraylength     
	//   18   39:anewarray       Format[]
	//   19   42:astore          11
		int k = 0;
	//   20   44:iconst_0        
	//   21   45:istore          5
		Format format = null;
	//   22   47:aconst_null     
	//   23   48:astore          9
		int l = 0;
	//   24   50:iconst_0        
	//   25   51:istore          6
		i = l;
	//   26   53:iload           6
	//   27   55:istore_2        
		for(; k < aformat.length; k++)
	//*  28   56:iload           5
	//*  29   58:aload           11
	//*  30   60:arraylength     
	//*  31   61:icmpge          143
		{
			Format format1 = ((Representation)adaptationset.representations.get(ai[k])).format;
	//   32   64:aload           12
	//   33   66:getfield        #464 <Field List AdaptationSet.representations>
	//   34   69:aload           4
	//   35   71:iload           5
	//   36   73:iaload          
	//   37   74:invokeinterface #461 <Method Object List.get(int)>
	//   38   79:checkcast       #344 <Class Representation>
	//   39   82:getfield        #378 <Field Format Representation.format>
	//   40   85:astore          10
			if(format == null || format1.height > i)
	//*  41   87:aload           9
	//*  42   89:ifnull          101
	//*  43   92:aload           10
	//*  44   94:getfield        #324 <Field int Format.height>
	//*  45   97:iload_2         
	//*  46   98:icmple          105
				format = format1;
	//   47  101:aload           10
	//   48  103:astore          9
			l = Math.max(l, format1.width);
	//   49  105:iload           6
	//   50  107:aload           10
	//   51  109:getfield        #321 <Field int Format.width>
	//   52  112:invokestatic    #470 <Method int Math.max(int, int)>
	//   53  115:istore          6
			i = Math.max(i, format1.height);
	//   54  117:iload_2         
	//   55  118:aload           10
	//   56  120:getfield        #324 <Field int Format.height>
	//   57  123:invokestatic    #470 <Method int Math.max(int, int)>
	//   58  126:istore_2        
			aformat[k] = format1;
	//   59  127:aload           11
	//   60  129:iload           5
	//   61  131:aload           10
	//   62  133:aastore         
		}

	//   63  134:iload           5
	//   64  136:iconst_1        
	//   65  137:iadd            
	//   66  138:istore          5
	//*  67  140:goto            56
		Arrays.sort(((Object []) (aformat)), ((java.util.Comparator) (new com.google.android.exoplayer.chunk.Format.DecreasingBandwidthComparator())));
	//   68  143:aload           11
	//   69  145:new             #472 <Class com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator>
	//   70  148:dup             
	//   71  149:invokespecial   #473 <Method void com.google.android.exoplayer.chunk.Format$DecreasingBandwidthComparator()>
	//   72  152:invokestatic    #477 <Method void Arrays.sort(Object[], java.util.Comparator)>
		long l1;
		if(live)
	//*  73  155:aload_0         
	//*  74  156:getfield        #164 <Field boolean live>
	//*  75  159:ifeq            170
			l1 = -1L;
	//   76  162:ldc2w           #170 <Long -1L>
	//   77  165:lstore          7
		else
	//*  78  167:goto            180
			l1 = mediapresentationdescription.duration * 1000L;
	//   79  170:aload_1         
	//   80  171:getfield        #480 <Field long MediaPresentationDescription.duration>
	//   81  174:ldc2w           #113 <Long 1000L>
	//   82  177:lmul            
	//   83  178:lstore          7
		mediapresentationdescription = ((MediaPresentationDescription) (getMediaMimeType(format)));
	//   84  180:aload           9
	//   85  182:invokestatic    #482 <Method String getMediaMimeType(Format)>
	//   86  185:astore_1        
		if(mediapresentationdescription == null)
	//*  87  186:aload_1         
	//*  88  187:ifnonnull       200
		{
			Log.w("DashChunkSource", "Skipped adaptive track (unknown media mime type)");
	//   89  190:ldc1            #29  <String "DashChunkSource">
	//   90  192:ldc2            #484 <String "Skipped adaptive track (unknown media mime type)">
	//   91  195:invokestatic    #452 <Method int Log.w(String, String)>
	//   92  198:pop             
			return;
	//   93  199:return          
		}
		mediapresentationdescription = ((MediaPresentationDescription) (getTrackFormat(adaptationset.type, format, ((String) (mediapresentationdescription)), l1)));
	//   94  200:aload           12
	//   95  202:getfield        #487 <Field int AdaptationSet.type>
	//   96  205:aload           9
	//   97  207:aload_1         
	//   98  208:lload           7
	//   99  210:invokestatic    #489 <Method MediaFormat getTrackFormat(int, Format, String, long)>
	//  100  213:astore_1        
		if(mediapresentationdescription == null)
	//* 101  214:aload_1         
	//* 102  215:ifnonnull       228
		{
			Log.w("DashChunkSource", "Skipped adaptive track (unknown media format)");
	//  103  218:ldc1            #29  <String "DashChunkSource">
	//  104  220:ldc2            #491 <String "Skipped adaptive track (unknown media format)">
	//  105  223:invokestatic    #452 <Method int Log.w(String, String)>
	//  106  226:pop             
			return;
	//  107  227:return          
		} else
		{
			tracks.add(((Object) (new ExposedTrack(((MediaFormat) (mediapresentationdescription)).copyAsAdaptive(((String) (null))), j, aformat, l, i))));
	//  108  228:aload_0         
	//  109  229:getfield        #159 <Field ArrayList tracks>
	//  110  232:new             #15  <Class DashChunkSource$ExposedTrack>
	//  111  235:dup             
	//  112  236:aload_1         
	//  113  237:aconst_null     
	//  114  238:invokevirtual   #495 <Method MediaFormat MediaFormat.copyAsAdaptive(String)>
	//  115  241:iload_3         
	//  116  242:aload           11
	//  117  244:iload           6
	//  118  246:iload_2         
	//  119  247:invokespecial   #498 <Method void DashChunkSource$ExposedTrack(MediaFormat, int, Format[], int, int)>
	//  120  250:invokevirtual   #501 <Method boolean ArrayList.add(Object)>
	//  121  253:pop             
			return;
	//  122  254:return          
		}
	}

	public void continueBuffering(long l)
	{
		if(manifestFetcher != null && currentManifest.dynamic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//*   2    4:ifnull          107
	//*   3    7:aload_0         
	//*   4    8:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//*   5   11:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//*   6   14:ifeq            107
		{
			if(fatalError != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #442 <Field IOException fatalError>
	//*   9   21:ifnull          25
				return;
	//   10   24:return          
			MediaPresentationDescription mediapresentationdescription = (MediaPresentationDescription)manifestFetcher.getManifest();
	//   11   25:aload_0         
	//   12   26:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//   13   29:invokevirtual   #110 <Method Object ManifestFetcher.getManifest()>
	//   14   32:checkcast       #112 <Class MediaPresentationDescription>
	//   15   35:astore          5
			if(mediapresentationdescription != null && mediapresentationdescription != processedManifest)
	//*  16   37:aload           5
	//*  17   39:ifnull          63
	//*  18   42:aload           5
	//*  19   44:aload_0         
	//*  20   45:getfield        #505 <Field MediaPresentationDescription processedManifest>
	//*  21   48:if_acmpeq       63
			{
				processManifest(mediapresentationdescription);
	//   22   51:aload_0         
	//   23   52:aload           5
	//   24   54:invokespecial   #507 <Method void processManifest(MediaPresentationDescription)>
				processedManifest = mediapresentationdescription;
	//   25   57:aload_0         
	//   26   58:aload           5
	//   27   60:putfield        #505 <Field MediaPresentationDescription processedManifest>
			}
			long l1 = currentManifest.minUpdatePeriod;
	//   28   63:aload_0         
	//   29   64:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//   30   67:getfield        #510 <Field long MediaPresentationDescription.minUpdatePeriod>
	//   31   70:lstore_3        
			l = l1;
	//   32   71:lload_3         
	//   33   72:lstore_1        
			if(l1 == 0L)
	//*  34   73:lload_3         
	//*  35   74:lconst_0        
	//*  36   75:lcmp            
	//*  37   76:ifne            83
				l = 5000L;
	//   38   79:ldc2w           #511 <Long 5000L>
	//   39   82:lstore_1        
			if(android.os.SystemClock.elapsedRealtime() > manifestFetcher.getManifestLoadStartTimestamp() + l)
	//*  40   83:invokestatic    #515 <Method long android.os.SystemClock.elapsedRealtime()>
	//*  41   86:aload_0         
	//*  42   87:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//*  43   90:invokevirtual   #518 <Method long ManifestFetcher.getManifestLoadStartTimestamp()>
	//*  44   93:lload_1         
	//*  45   94:ladd            
	//*  46   95:lcmp            
	//*  47   96:ifle            106
				manifestFetcher.requestRefresh();
	//   48   99:aload_0         
	//   49  100:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//   50  103:invokevirtual   #521 <Method void ManifestFetcher.requestRefresh()>
			return;
	//   51  106:return          
		} else
		{
			return;
	//   52  107:return          
		}
	}

	public void disable(List list)
	{
		if(enabledTrack.isAdaptive())
	//*   0    0:aload_0         
	//*   1    1:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*   2    4:invokevirtual   #526 <Method boolean DashChunkSource$ExposedTrack.isAdaptive()>
	//*   3    7:ifeq            19
			adaptiveFormatEvaluator.disable();
	//    4   10:aload_0         
	//    5   11:getfield        #128 <Field FormatEvaluator adaptiveFormatEvaluator>
	//    6   14:invokeinterface #530 <Method void FormatEvaluator.disable()>
		list = ((List) (manifestFetcher));
	//    7   19:aload_0         
	//    8   20:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//    9   23:astore_1        
		if(list != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          32
			((ManifestFetcher) (list)).disable();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #531 <Method void ManifestFetcher.disable()>
		periodHolders.clear();
	//   14   32:aload_0         
	//   15   33:getfield        #154 <Field SparseArray periodHolders>
	//   16   36:invokevirtual   #534 <Method void SparseArray.clear()>
		evaluation.format = null;
	//   17   39:aload_0         
	//   18   40:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   19   43:aconst_null     
	//   20   44:putfield        #535 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
		availableRange = null;
	//   21   47:aload_0         
	//   22   48:aconst_null     
	//   23   49:putfield        #437 <Field TimeRange availableRange>
		fatalError = null;
	//   24   52:aload_0         
	//   25   53:aconst_null     
	//   26   54:putfield        #442 <Field IOException fatalError>
		enabledTrack = null;
	//   27   57:aload_0         
	//   28   58:aconst_null     
	//   29   59:putfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//   30   62:return          
	}

	public void enable(int i)
	{
		enabledTrack = (ExposedTrack)tracks.get(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field ArrayList tracks>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #538 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #15  <Class DashChunkSource$ExposedTrack>
	//    6   12:putfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
		if(enabledTrack.isAdaptive())
	//*   7   15:aload_0         
	//*   8   16:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*   9   19:invokevirtual   #526 <Method boolean DashChunkSource$ExposedTrack.isAdaptive()>
	//*  10   22:ifeq            34
			adaptiveFormatEvaluator.enable();
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field FormatEvaluator adaptiveFormatEvaluator>
	//   13   29:invokeinterface #540 <Method void FormatEvaluator.enable()>
		ManifestFetcher manifestfetcher = manifestFetcher;
	//   14   34:aload_0         
	//   15   35:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//   16   38:astore_2        
		if(manifestfetcher != null)
	//*  17   39:aload_2         
	//*  18   40:ifnull          62
		{
			manifestfetcher.enable();
	//   19   43:aload_2         
	//   20   44:invokevirtual   #541 <Method void ManifestFetcher.enable()>
			processManifest((MediaPresentationDescription)manifestFetcher.getManifest());
	//   21   47:aload_0         
	//   22   48:aload_0         
	//   23   49:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//   24   52:invokevirtual   #110 <Method Object ManifestFetcher.getManifest()>
	//   25   55:checkcast       #112 <Class MediaPresentationDescription>
	//   26   58:invokespecial   #507 <Method void processManifest(MediaPresentationDescription)>
			return;
	//   27   61:return          
		} else
		{
			processManifest(currentManifest);
	//   28   62:aload_0         
	//   29   63:aload_0         
	//   30   64:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//   31   67:invokespecial   #507 <Method void processManifest(MediaPresentationDescription)>
			return;
	//   32   70:return          
		}
	}

	public void fixedTrack(MediaPresentationDescription mediapresentationdescription, int i, int j, int k)
	{
		AdaptationSet adaptationset = (AdaptationSet)mediapresentationdescription.getPeriod(i).adaptationSets.get(j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #400 <Method Period MediaPresentationDescription.getPeriod(int)>
	//    3    5:getfield        #456 <Field List Period.adaptationSets>
	//    4    8:iload_3         
	//    5    9:invokeinterface #461 <Method Object List.get(int)>
	//    6   14:checkcast       #175 <Class AdaptationSet>
	//    7   17:astore          8
		Format format = ((Representation)adaptationset.representations.get(k)).format;
	//    8   19:aload           8
	//    9   21:getfield        #464 <Field List AdaptationSet.representations>
	//   10   24:iload           4
	//   11   26:invokeinterface #461 <Method Object List.get(int)>
	//   12   31:checkcast       #344 <Class Representation>
	//   13   34:getfield        #378 <Field Format Representation.format>
	//   14   37:astore          7
		String s = getMediaMimeType(format);
	//   15   39:aload           7
	//   16   41:invokestatic    #482 <Method String getMediaMimeType(Format)>
	//   17   44:astore          9
		if(s == null)
	//*  18   46:aload           9
	//*  19   48:ifnonnull       96
		{
			mediapresentationdescription = ((MediaPresentationDescription) (new StringBuilder()));
	//   20   51:new             #545 <Class StringBuilder>
	//   21   54:dup             
	//   22   55:invokespecial   #546 <Method void StringBuilder()>
	//   23   58:astore_1        
			((StringBuilder) (mediapresentationdescription)).append("Skipped track ");
	//   24   59:aload_1         
	//   25   60:ldc2            #548 <String "Skipped track ">
	//   26   63:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   27   66:pop             
			((StringBuilder) (mediapresentationdescription)).append(format.id);
	//   28   67:aload_1         
	//   29   68:aload           7
	//   30   70:getfield        #296 <Field String Format.id>
	//   31   73:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
			((StringBuilder) (mediapresentationdescription)).append(" (unknown media mime type)");
	//   33   77:aload_1         
	//   34   78:ldc2            #554 <String " (unknown media mime type)">
	//   35   81:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   36   84:pop             
			Log.w("DashChunkSource", ((StringBuilder) (mediapresentationdescription)).toString());
	//   37   85:ldc1            #29  <String "DashChunkSource">
	//   38   87:aload_1         
	//   39   88:invokevirtual   #557 <Method String StringBuilder.toString()>
	//   40   91:invokestatic    #452 <Method int Log.w(String, String)>
	//   41   94:pop             
			return;
	//   42   95:return          
		}
		i = adaptationset.type;
	//   43   96:aload           8
	//   44   98:getfield        #487 <Field int AdaptationSet.type>
	//   45  101:istore_2        
		long l;
		if(mediapresentationdescription.dynamic)
	//*  46  102:aload_1         
	//*  47  103:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//*  48  106:ifeq            117
			l = -1L;
	//   49  109:ldc2w           #170 <Long -1L>
	//   50  112:lstore          5
		else
	//*  51  114:goto            127
			l = mediapresentationdescription.duration * 1000L;
	//   52  117:aload_1         
	//   53  118:getfield        #480 <Field long MediaPresentationDescription.duration>
	//   54  121:ldc2w           #113 <Long 1000L>
	//   55  124:lmul            
	//   56  125:lstore          5
		mediapresentationdescription = ((MediaPresentationDescription) (getTrackFormat(i, format, s, l)));
	//   57  127:iload_2         
	//   58  128:aload           7
	//   59  130:aload           9
	//   60  132:lload           5
	//   61  134:invokestatic    #489 <Method MediaFormat getTrackFormat(int, Format, String, long)>
	//   62  137:astore_1        
		if(mediapresentationdescription == null)
	//*  63  138:aload_1         
	//*  64  139:ifnonnull       187
		{
			mediapresentationdescription = ((MediaPresentationDescription) (new StringBuilder()));
	//   65  142:new             #545 <Class StringBuilder>
	//   66  145:dup             
	//   67  146:invokespecial   #546 <Method void StringBuilder()>
	//   68  149:astore_1        
			((StringBuilder) (mediapresentationdescription)).append("Skipped track ");
	//   69  150:aload_1         
	//   70  151:ldc2            #548 <String "Skipped track ">
	//   71  154:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   72  157:pop             
			((StringBuilder) (mediapresentationdescription)).append(format.id);
	//   73  158:aload_1         
	//   74  159:aload           7
	//   75  161:getfield        #296 <Field String Format.id>
	//   76  164:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   77  167:pop             
			((StringBuilder) (mediapresentationdescription)).append(" (unknown media format)");
	//   78  168:aload_1         
	//   79  169:ldc2            #559 <String " (unknown media format)">
	//   80  172:invokevirtual   #552 <Method StringBuilder StringBuilder.append(String)>
	//   81  175:pop             
			Log.w("DashChunkSource", ((StringBuilder) (mediapresentationdescription)).toString());
	//   82  176:ldc1            #29  <String "DashChunkSource">
	//   83  178:aload_1         
	//   84  179:invokevirtual   #557 <Method String StringBuilder.toString()>
	//   85  182:invokestatic    #452 <Method int Log.w(String, String)>
	//   86  185:pop             
			return;
	//   87  186:return          
		} else
		{
			tracks.add(((Object) (new ExposedTrack(((MediaFormat) (mediapresentationdescription)), j, format))));
	//   88  187:aload_0         
	//   89  188:getfield        #159 <Field ArrayList tracks>
	//   90  191:new             #15  <Class DashChunkSource$ExposedTrack>
	//   91  194:dup             
	//   92  195:aload_1         
	//   93  196:iload_3         
	//   94  197:aload           7
	//   95  199:invokespecial   #562 <Method void DashChunkSource$ExposedTrack(MediaFormat, int, Format)>
	//   96  202:invokevirtual   #501 <Method boolean ArrayList.add(Object)>
	//   97  205:pop             
			return;
	//   98  206:return          
		}
	}

	TimeRange getAvailableRange()
	{
		return availableRange;
	//    0    0:aload_0         
	//    1    1:getfield        #437 <Field TimeRange availableRange>
	//    2    4:areturn         
	}

	public final void getChunkOperation(List list, long l, ChunkOperationHolder chunkoperationholder)
	{
		long l1 = l;
	//    0    0:lload_2         
	//    1    1:lstore          7
		Object obj = ((Object) (fatalError));
	//    2    3:aload_0         
	//    3    4:getfield        #442 <Field IOException fatalError>
	//    4    7:astore          11
		RangedUri rangeduri = null;
	//    5    9:aconst_null     
	//    6   10:astore          13
		if(obj != null)
	//*   7   12:aload           11
	//*   8   14:ifnull          24
		{
			chunkoperationholder.chunk = null;
	//    9   17:aload           4
	//   10   19:aconst_null     
	//   11   20:putfield        #571 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//   12   23:return          
		}
		evaluation.queueSize = list.size();
	//   13   24:aload_0         
	//   14   25:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   15   28:aload_1         
	//   16   29:invokeinterface #572 <Method int List.size()>
	//   17   34:putfield        #575 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.queueSize>
		if(evaluation.format == null || !lastChunkWasInitialization)
	//*  18   37:aload_0         
	//*  19   38:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//*  20   41:getfield        #535 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
	//*  21   44:ifnull          54
	//*  22   47:aload_0         
	//*  23   48:getfield        #577 <Field boolean lastChunkWasInitialization>
	//*  24   51:ifne            111
			if(enabledTrack.isAdaptive())
	//*  25   54:aload_0         
	//*  26   55:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//*  27   58:invokevirtual   #526 <Method boolean DashChunkSource$ExposedTrack.isAdaptive()>
	//*  28   61:ifeq            89
			{
				adaptiveFormatEvaluator.evaluate(list, l, enabledTrack.adaptiveFormats, evaluation);
	//   29   64:aload_0         
	//   30   65:getfield        #128 <Field FormatEvaluator adaptiveFormatEvaluator>
	//   31   68:aload_1         
	//   32   69:lload_2         
	//   33   70:aload_0         
	//   34   71:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//   35   74:invokestatic    #581 <Method Format[] DashChunkSource$ExposedTrack.access$000(DashChunkSource$ExposedTrack)>
	//   36   77:aload_0         
	//   37   78:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   38   81:invokeinterface #585 <Method void FormatEvaluator.evaluate(List, long, Format[], com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation)>
			} else
	//*  39   86:goto            111
			{
				evaluation.format = enabledTrack.fixedFormat;
	//   40   89:aload_0         
	//   41   90:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   42   93:aload_0         
	//   43   94:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//   44   97:invokestatic    #589 <Method Format DashChunkSource$ExposedTrack.access$100(DashChunkSource$ExposedTrack)>
	//   45  100:putfield        #535 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
				evaluation.trigger = 2;
	//   46  103:aload_0         
	//   47  104:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   48  107:iconst_2        
	//   49  108:putfield        #592 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.trigger>
			}
		Object obj1 = ((Object) (evaluation.format));
	//   50  111:aload_0         
	//   51  112:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   52  115:getfield        #535 <Field Format com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.format>
	//   53  118:astore          12
		chunkoperationholder.queueSize = evaluation.queueSize;
	//   54  120:aload           4
	//   55  122:aload_0         
	//   56  123:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//   57  126:getfield        #575 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.queueSize>
	//   58  129:putfield        #593 <Field int ChunkOperationHolder.queueSize>
		if(obj1 == null)
	//*  59  132:aload           12
	//*  60  134:ifnonnull       144
		{
			chunkoperationholder.chunk = null;
	//   61  137:aload           4
	//   62  139:aconst_null     
	//   63  140:putfield        #571 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//   64  143:return          
		}
		if(chunkoperationholder.queueSize == list.size() && chunkoperationholder.chunk != null && chunkoperationholder.chunk.format.equals(obj1))
	//*  65  144:aload           4
	//*  66  146:getfield        #593 <Field int ChunkOperationHolder.queueSize>
	//*  67  149:aload_1         
	//*  68  150:invokeinterface #572 <Method int List.size()>
	//*  69  155:icmpne          183
	//*  70  158:aload           4
	//*  71  160:getfield        #571 <Field Chunk ChunkOperationHolder.chunk>
	//*  72  163:ifnull          183
	//*  73  166:aload           4
	//*  74  168:getfield        #571 <Field Chunk ChunkOperationHolder.chunk>
	//*  75  171:getfield        #596 <Field Format Chunk.format>
	//*  76  174:aload           12
	//*  77  176:invokevirtual   #597 <Method boolean Format.equals(Object)>
	//*  78  179:ifeq            183
			return;
	//   79  182:return          
		chunkoperationholder.chunk = null;
	//   80  183:aload           4
	//   81  185:aconst_null     
	//   82  186:putfield        #571 <Field Chunk ChunkOperationHolder.chunk>
		availableRange.getCurrentBoundsUs(availableRangeValues);
	//   83  189:aload_0         
	//   84  190:getfield        #437 <Field TimeRange availableRange>
	//   85  193:aload_0         
	//   86  194:getfield        #149 <Field long[] availableRangeValues>
	//   87  197:invokeinterface #603 <Method long[] TimeRange.getCurrentBoundsUs(long[])>
	//   88  202:pop             
		boolean flag1 = list.isEmpty();
	//   89  203:aload_1         
	//   90  204:invokeinterface #606 <Method boolean List.isEmpty()>
	//   91  209:istore          10
		boolean flag = true;
	//   92  211:iconst_1        
	//   93  212:istore          9
		int i;
		if(flag1)
	//*  94  214:iload           10
	//*  95  216:ifeq            313
		{
			if(live)
	//*  96  219:aload_0         
	//*  97  220:getfield        #164 <Field boolean live>
	//*  98  223:ifeq            297
			{
				if(l1 != 0L)
	//*  99  226:lload           7
	//* 100  228:lconst_0        
	//* 101  229:lcmp            
	//* 102  230:ifeq            238
					startAtLiveEdge = false;
	//  103  233:aload_0         
	//  104  234:iconst_0        
	//  105  235:putfield        #136 <Field boolean startAtLiveEdge>
				if(startAtLiveEdge)
	//* 106  238:aload_0         
	//* 107  239:getfield        #136 <Field boolean startAtLiveEdge>
	//* 108  242:ifeq            271
				{
					long al[] = availableRangeValues;
	//  109  245:aload_0         
	//  110  246:getfield        #149 <Field long[] availableRangeValues>
	//  111  249:astore          11
					l = Math.max(al[0], al[1] - liveEdgeLatencyUs);
	//  112  251:aload           11
	//  113  253:iconst_0        
	//  114  254:laload          
	//  115  255:aload           11
	//  116  257:iconst_1        
	//  117  258:laload          
	//  118  259:aload_0         
	//  119  260:getfield        #132 <Field long liveEdgeLatencyUs>
	//  120  263:lsub            
	//  121  264:invokestatic    #609 <Method long Math.max(long, long)>
	//  122  267:lstore_2        
				} else
	//* 123  268:goto            300
				{
					l = Math.max(Math.min(l1, availableRangeValues[1] - 1L), availableRangeValues[0]);
	//  124  271:lload           7
	//  125  273:aload_0         
	//  126  274:getfield        #149 <Field long[] availableRangeValues>
	//  127  277:iconst_1        
	//  128  278:laload          
	//  129  279:lconst_1        
	//  130  280:lsub            
	//  131  281:invokestatic    #612 <Method long Math.min(long, long)>
	//  132  284:aload_0         
	//  133  285:getfield        #149 <Field long[] availableRangeValues>
	//  134  288:iconst_0        
	//  135  289:laload          
	//  136  290:invokestatic    #609 <Method long Math.max(long, long)>
	//  137  293:lstore_2        
				}
			} else
	//* 138  294:goto            300
			{
				l = l1;
	//  139  297:lload           7
	//  140  299:lstore_2        
			}
			al = ((long []) (findPeriodHolder(l)));
	//  141  300:aload_0         
	//  142  301:lload_2         
	//  143  302:invokespecial   #614 <Method DashChunkSource$PeriodHolder findPeriodHolder(long)>
	//  144  305:astore          11
			i = 1;
	//  145  307:iconst_1        
	//  146  308:istore          5
		} else
	//* 147  310:goto            600
		{
			if(startAtLiveEdge)
	//* 148  313:aload_0         
	//* 149  314:getfield        #136 <Field boolean startAtLiveEdge>
	//* 150  317:ifeq            325
				startAtLiveEdge = false;
	//  151  320:aload_0         
	//  152  321:iconst_0        
	//  153  322:putfield        #136 <Field boolean startAtLiveEdge>
			MediaChunk mediachunk = (MediaChunk)list.get(chunkoperationholder.queueSize - 1);
	//  154  325:aload_1         
	//  155  326:aload           4
	//  156  328:getfield        #593 <Field int ChunkOperationHolder.queueSize>
	//  157  331:iconst_1        
	//  158  332:isub            
	//  159  333:invokeinterface #461 <Method Object List.get(int)>
	//  160  338:checkcast       #616 <Class MediaChunk>
	//  161  341:astore          14
			l = mediachunk.endTimeUs;
	//  162  343:aload           14
	//  163  345:getfield        #619 <Field long MediaChunk.endTimeUs>
	//  164  348:lstore_2        
			if(live && l < availableRangeValues[0])
	//* 165  349:aload_0         
	//* 166  350:getfield        #164 <Field boolean live>
	//* 167  353:ifeq            379
	//* 168  356:lload_2         
	//* 169  357:aload_0         
	//* 170  358:getfield        #149 <Field long[] availableRangeValues>
	//* 171  361:iconst_0        
	//* 172  362:laload          
	//* 173  363:lcmp            
	//* 174  364:ifge            379
			{
				fatalError = ((IOException) (new BehindLiveWindowException()));
	//  175  367:aload_0         
	//  176  368:new             #396 <Class BehindLiveWindowException>
	//  177  371:dup             
	//  178  372:invokespecial   #620 <Method void BehindLiveWindowException()>
	//  179  375:putfield        #442 <Field IOException fatalError>
				return;
	//  180  378:return          
			}
			if(currentManifest.dynamic && l >= availableRangeValues[1])
	//* 181  379:aload_0         
	//* 182  380:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//* 183  383:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//* 184  386:ifeq            401
	//* 185  389:lload_2         
	//* 186  390:aload_0         
	//* 187  391:getfield        #149 <Field long[] availableRangeValues>
	//* 188  394:iconst_1        
	//* 189  395:laload          
	//* 190  396:lcmp            
	//* 191  397:iflt            401
				return;
	//  192  400:return          
			al = ((long []) (periodHolders));
	//  193  401:aload_0         
	//  194  402:getfield        #154 <Field SparseArray periodHolders>
	//  195  405:astore          11
			al = ((long []) ((PeriodHolder)((SparseArray) (al)).valueAt(((SparseArray) (al)).size() - 1)));
	//  196  407:aload           11
	//  197  409:aload           11
	//  198  411:invokevirtual   #205 <Method int SparseArray.size()>
	//  199  414:iconst_1        
	//  200  415:isub            
	//  201  416:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//  202  419:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//  203  422:astore          11
			if(mediachunk.parentId == ((PeriodHolder) (al)).localIndex && ((RepresentationHolder)((PeriodHolder) (al)).representationHolders.get(((Object) (mediachunk.format.id)))).isBeyondLastSegment(mediachunk.getNextChunkIndex()))
	//* 204  424:aload           14
	//* 205  426:getfield        #623 <Field int MediaChunk.parentId>
	//* 206  429:aload           11
	//* 207  431:getfield        #409 <Field int DashChunkSource$PeriodHolder.localIndex>
	//* 208  434:icmpne          484
	//* 209  437:aload           11
	//* 210  439:getfield        #627 <Field HashMap DashChunkSource$PeriodHolder.representationHolders>
	//* 211  442:aload           14
	//* 212  444:getfield        #628 <Field Format MediaChunk.format>
	//* 213  447:getfield        #296 <Field String Format.id>
	//* 214  450:invokevirtual   #633 <Method Object HashMap.get(Object)>
	//* 215  453:checkcast       #24  <Class DashChunkSource$RepresentationHolder>
	//* 216  456:aload           14
	//* 217  458:invokevirtual   #636 <Method int MediaChunk.getNextChunkIndex()>
	//* 218  461:invokevirtual   #640 <Method boolean DashChunkSource$RepresentationHolder.isBeyondLastSegment(int)>
	//* 219  464:ifeq            484
			{
				if(!currentManifest.dynamic)
	//* 220  467:aload_0         
	//* 221  468:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//* 222  471:getfield        #162 <Field boolean MediaPresentationDescription.dynamic>
	//* 223  474:ifne            483
					chunkoperationholder.endOfStream = true;
	//  224  477:aload           4
	//  225  479:iconst_1        
	//  226  480:putfield        #643 <Field boolean ChunkOperationHolder.endOfStream>
				return;
	//  227  483:return          
			}
			al = ((long []) ((PeriodHolder)periodHolders.get(mediachunk.parentId)));
	//  228  484:aload_0         
	//  229  485:getfield        #154 <Field SparseArray periodHolders>
	//  230  488:aload           14
	//  231  490:getfield        #623 <Field int MediaChunk.parentId>
	//  232  493:invokevirtual   #644 <Method Object SparseArray.get(int)>
	//  233  496:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//  234  499:astore          11
			if(al == null)
	//* 235  501:aload           11
	//* 236  503:ifnonnull       528
			{
				al = ((long []) ((PeriodHolder)periodHolders.valueAt(0)));
	//  237  506:aload_0         
	//  238  507:getfield        #154 <Field SparseArray periodHolders>
	//  239  510:iconst_0        
	//  240  511:invokevirtual   #197 <Method Object SparseArray.valueAt(int)>
	//  241  514:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//  242  517:astore          11
				i = 1;
	//  243  519:iconst_1        
	//  244  520:istore          5
				l = l1;
	//  245  522:lload           7
	//  246  524:lstore_2        
			} else
	//* 247  525:goto            600
			if(!((PeriodHolder) (al)).isIndexUnbounded() && ((RepresentationHolder)((PeriodHolder) (al)).representationHolders.get(((Object) (mediachunk.format.id)))).isBeyondLastSegment(mediachunk.getNextChunkIndex()))
	//* 248  528:aload           11
	//* 249  530:invokevirtual   #217 <Method boolean DashChunkSource$PeriodHolder.isIndexUnbounded()>
	//* 250  533:ifne            594
	//* 251  536:aload           11
	//* 252  538:getfield        #627 <Field HashMap DashChunkSource$PeriodHolder.representationHolders>
	//* 253  541:aload           14
	//* 254  543:getfield        #628 <Field Format MediaChunk.format>
	//* 255  546:getfield        #296 <Field String Format.id>
	//* 256  549:invokevirtual   #633 <Method Object HashMap.get(Object)>
	//* 257  552:checkcast       #24  <Class DashChunkSource$RepresentationHolder>
	//* 258  555:aload           14
	//* 259  557:invokevirtual   #636 <Method int MediaChunk.getNextChunkIndex()>
	//* 260  560:invokevirtual   #640 <Method boolean DashChunkSource$RepresentationHolder.isBeyondLastSegment(int)>
	//* 261  563:ifeq            594
			{
				al = ((long []) ((PeriodHolder)periodHolders.get(mediachunk.parentId + 1)));
	//  262  566:aload_0         
	//  263  567:getfield        #154 <Field SparseArray periodHolders>
	//  264  570:aload           14
	//  265  572:getfield        #623 <Field int MediaChunk.parentId>
	//  266  575:iconst_1        
	//  267  576:iadd            
	//  268  577:invokevirtual   #644 <Method Object SparseArray.get(int)>
	//  269  580:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//  270  583:astore          11
				i = 1;
	//  271  585:iconst_1        
	//  272  586:istore          5
				l = l1;
	//  273  588:lload           7
	//  274  590:lstore_2        
			} else
	//* 275  591:goto            600
			{
				i = 0;
	//  276  594:iconst_0        
	//  277  595:istore          5
				l = l1;
	//  278  597:lload           7
	//  279  599:lstore_2        
			}
		}
		RepresentationHolder representationholder = (RepresentationHolder)((PeriodHolder) (al)).representationHolders.get(((Object) (((Format) (obj1)).id)));
	//  280  600:aload           11
	//  281  602:getfield        #627 <Field HashMap DashChunkSource$PeriodHolder.representationHolders>
	//  282  605:aload           12
	//  283  607:getfield        #296 <Field String Format.id>
	//  284  610:invokevirtual   #633 <Method Object HashMap.get(Object)>
	//  285  613:checkcast       #24  <Class DashChunkSource$RepresentationHolder>
	//  286  616:astore          14
		Representation representation = representationholder.representation;
	//  287  618:aload           14
	//  288  620:getfield        #648 <Field Representation DashChunkSource$RepresentationHolder.representation>
	//  289  623:astore          16
		MediaFormat mediaformat = representationholder.mediaFormat;
	//  290  625:aload           14
	//  291  627:getfield        #652 <Field MediaFormat DashChunkSource$RepresentationHolder.mediaFormat>
	//  292  630:astore          15
		if(mediaformat == null)
	//* 293  632:aload           15
	//* 294  634:ifnonnull       647
			obj1 = ((Object) (representation.getInitializationUri()));
	//  295  637:aload           16
	//  296  639:invokevirtual   #656 <Method RangedUri Representation.getInitializationUri()>
	//  297  642:astore          12
		else
	//* 298  644:goto            650
			obj1 = null;
	//  299  647:aconst_null     
	//  300  648:astore          12
		if(representationholder.segmentIndex == null)
	//* 301  650:aload           14
	//* 302  652:getfield        #660 <Field DashSegmentIndex DashChunkSource$RepresentationHolder.segmentIndex>
	//* 303  655:ifnonnull       665
			rangeduri = representation.getIndexUri();
	//  304  658:aload           16
	//  305  660:invokevirtual   #663 <Method RangedUri Representation.getIndexUri()>
	//  306  663:astore          13
		if(obj1 == null && rangeduri == null)
	//* 307  665:aload           12
	//* 308  667:ifnonnull       797
	//* 309  670:aload           13
	//* 310  672:ifnull          678
	//* 311  675:goto            797
		{
			if(list.isEmpty())
	//* 312  678:aload_1         
	//* 313  679:invokeinterface #606 <Method boolean List.isEmpty()>
	//* 314  684:ifeq            698
				i = representationholder.getSegmentNum(l);
	//  315  687:aload           14
	//  316  689:lload_2         
	//  317  690:invokevirtual   #667 <Method int DashChunkSource$RepresentationHolder.getSegmentNum(long)>
	//  318  693:istore          5
			else
	//* 319  695:goto            734
			if(i != 0)
	//* 320  698:iload           5
	//* 321  700:ifeq            713
				i = representationholder.getFirstAvailableSegmentNum();
	//  322  703:aload           14
	//  323  705:invokevirtual   #670 <Method int DashChunkSource$RepresentationHolder.getFirstAvailableSegmentNum()>
	//  324  708:istore          5
			else
	//* 325  710:goto            734
				i = ((MediaChunk)list.get(chunkoperationholder.queueSize - 1)).getNextChunkIndex();
	//  326  713:aload_1         
	//  327  714:aload           4
	//  328  716:getfield        #593 <Field int ChunkOperationHolder.queueSize>
	//  329  719:iconst_1        
	//  330  720:isub            
	//  331  721:invokeinterface #461 <Method Object List.get(int)>
	//  332  726:checkcast       #616 <Class MediaChunk>
	//  333  729:invokevirtual   #636 <Method int MediaChunk.getNextChunkIndex()>
	//  334  732:istore          5
			list = ((List) (dataSource));
	//  335  734:aload_0         
	//  336  735:getfield        #126 <Field DataSource dataSource>
	//  337  738:astore_1        
			obj1 = ((Object) (enabledTrack));
	//  338  739:aload_0         
	//  339  740:getfield        #418 <Field DashChunkSource$ExposedTrack enabledTrack>
	//  340  743:astore          12
			int j = evaluation.trigger;
	//  341  745:aload_0         
	//  342  746:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//  343  749:getfield        #592 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.trigger>
	//  344  752:istore          6
			if(mediaformat == null)
	//* 345  754:aload           15
	//* 346  756:ifnull          762
	//* 347  759:goto            765
				flag = false;
	//  348  762:iconst_0        
	//  349  763:istore          9
			list = ((List) (newMediaChunk(((PeriodHolder) (al)), representationholder, ((DataSource) (list)), mediaformat, ((ExposedTrack) (obj1)), i, j, flag)));
	//  350  765:aload_0         
	//  351  766:aload           11
	//  352  768:aload           14
	//  353  770:aload_1         
	//  354  771:aload           15
	//  355  773:aload           12
	//  356  775:iload           5
	//  357  777:iload           6
	//  358  779:iload           9
	//  359  781:invokevirtual   #674 <Method Chunk newMediaChunk(DashChunkSource$PeriodHolder, DashChunkSource$RepresentationHolder, DataSource, MediaFormat, DashChunkSource$ExposedTrack, int, int, boolean)>
	//  360  784:astore_1        
			lastChunkWasInitialization = false;
	//  361  785:aload_0         
	//  362  786:iconst_0        
	//  363  787:putfield        #577 <Field boolean lastChunkWasInitialization>
			chunkoperationholder.chunk = ((Chunk) (list));
	//  364  790:aload           4
	//  365  792:aload_1         
	//  366  793:putfield        #571 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//  367  796:return          
		} else
		{
			list = ((List) (newInitializationChunk(((RangedUri) (obj1)), rangeduri, representation, representationholder.extractorWrapper, dataSource, ((PeriodHolder) (al)).localIndex, evaluation.trigger)));
	//  368  797:aload_0         
	//  369  798:aload           12
	//  370  800:aload           13
	//  371  802:aload           16
	//  372  804:aload           14
	//  373  806:getfield        #678 <Field ChunkExtractorWrapper DashChunkSource$RepresentationHolder.extractorWrapper>
	//  374  809:aload_0         
	//  375  810:getfield        #126 <Field DataSource dataSource>
	//  376  813:aload           11
	//  377  815:getfield        #409 <Field int DashChunkSource$PeriodHolder.localIndex>
	//  378  818:aload_0         
	//  379  819:getfield        #147 <Field com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation evaluation>
	//  380  822:getfield        #592 <Field int com.google.android.exoplayer.chunk.FormatEvaluator$Evaluation.trigger>
	//  381  825:invokespecial   #680 <Method Chunk newInitializationChunk(RangedUri, RangedUri, Representation, ChunkExtractorWrapper, DataSource, int, int)>
	//  382  828:astore_1        
			lastChunkWasInitialization = true;
	//  383  829:aload_0         
	//  384  830:iconst_1        
	//  385  831:putfield        #577 <Field boolean lastChunkWasInitialization>
			chunkoperationholder.chunk = ((Chunk) (list));
	//  386  834:aload           4
	//  387  836:aload_1         
	//  388  837:putfield        #571 <Field Chunk ChunkOperationHolder.chunk>
			return;
	//  389  840:return          
		}
	}

	public final MediaFormat getFormat(int i)
	{
		return ((ExposedTrack)tracks.get(i)).trackFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ArrayList tracks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #538 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #15  <Class DashChunkSource$ExposedTrack>
	//    5   11:getfield        #686 <Field MediaFormat DashChunkSource$ExposedTrack.trackFormat>
	//    6   14:areturn         
	}

	public int getTrackCount()
	{
		return tracks.size();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ArrayList tracks>
	//    2    4:invokevirtual   #688 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		Object obj = ((Object) (fatalError));
	//    0    0:aload_0         
	//    1    1:getfield        #442 <Field IOException fatalError>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       23
		{
			obj = ((Object) (manifestFetcher));
	//    5    9:aload_0         
	//    6   10:getfield        #120 <Field ManifestFetcher manifestFetcher>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          22
				((ManifestFetcher) (obj)).maybeThrowError();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #693 <Method void ManifestFetcher.maybeThrowError()>
			return;
	//   12   22:return          
		} else
		{
			throw obj;
	//   13   23:aload_1         
	//   14   24:athrow          
		}
	}

	protected Chunk newMediaChunk(PeriodHolder periodholder, RepresentationHolder representationholder, DataSource datasource, MediaFormat mediaformat, ExposedTrack exposedtrack, int i, int j, 
			boolean flag)
	{
		Representation representation = representationholder.representation;
	//    0    0:aload_2         
	//    1    1:getfield        #648 <Field Representation DashChunkSource$RepresentationHolder.representation>
	//    2    4:astore          17
		Format format = representation.format;
	//    3    6:aload           17
	//    4    8:getfield        #378 <Field Format Representation.format>
	//    5   11:astore          18
		long l = representationholder.getSegmentStartTimeUs(i);
	//    6   13:aload_2         
	//    7   14:iload           6
	//    8   16:invokevirtual   #698 <Method long DashChunkSource$RepresentationHolder.getSegmentStartTimeUs(int)>
	//    9   19:lstore          9
		long l1 = representationholder.getSegmentEndTimeUs(i);
	//   10   21:aload_2         
	//   11   22:iload           6
	//   12   24:invokevirtual   #701 <Method long DashChunkSource$RepresentationHolder.getSegmentEndTimeUs(int)>
	//   13   27:lstore          11
		Object obj = ((Object) (representationholder.getSegmentUrl(i)));
	//   14   29:aload_2         
	//   15   30:iload           6
	//   16   32:invokevirtual   #705 <Method RangedUri DashChunkSource$RepresentationHolder.getSegmentUrl(int)>
	//   17   35:astore          19
		obj = ((Object) (new DataSpec(((RangedUri) (obj)).resolveUri(representation.baseUrl), ((RangedUri) (obj)).start, ((RangedUri) (obj)).length, representation.getCacheKey())));
	//   18   37:new             #357 <Class DataSpec>
	//   19   40:dup             
	//   20   41:aload           19
	//   21   43:aload           17
	//   22   45:getfield        #347 <Field String Representation.baseUrl>
	//   23   48:invokevirtual   #361 <Method Uri RangedUri.resolveUri(String)>
	//   24   51:aload           19
	//   25   53:getfield        #364 <Field long RangedUri.start>
	//   26   56:aload           19
	//   27   58:getfield        #367 <Field long RangedUri.length>
	//   28   61:aload           17
	//   29   63:invokevirtual   #371 <Method String Representation.getCacheKey()>
	//   30   66:invokespecial   #374 <Method void DataSpec(Uri, long, long, String)>
	//   31   69:astore          19
		long l2 = periodholder.startTimeUs;
	//   32   71:aload_1         
	//   33   72:getfield        #403 <Field long DashChunkSource$PeriodHolder.startTimeUs>
	//   34   75:lstore          13
		long l3 = representation.presentationTimeOffsetUs;
	//   35   77:aload           17
	//   36   79:getfield        #708 <Field long Representation.presentationTimeOffsetUs>
	//   37   82:lstore          15
		if(mimeTypeIsRawText(format.mimeType))
	//*  38   84:aload           18
	//*  39   86:getfield        #247 <Field String Format.mimeType>
	//*  40   89:invokestatic    #269 <Method boolean mimeTypeIsRawText(String)>
	//*  41   92:ifeq            125
			return ((Chunk) (new SingleSampleMediaChunk(datasource, ((DataSpec) (obj)), 1, format, l, l1, i, exposedtrack.trackFormat, ((DrmInitData) (null)), periodholder.localIndex)));
	//   42   95:new             #710 <Class SingleSampleMediaChunk>
	//   43   98:dup             
	//   44   99:aload_3         
	//   45  100:aload           19
	//   46  102:iconst_1        
	//   47  103:aload           18
	//   48  105:lload           9
	//   49  107:lload           11
	//   50  109:iload           6
	//   51  111:aload           5
	//   52  113:getfield        #686 <Field MediaFormat DashChunkSource$ExposedTrack.trackFormat>
	//   53  116:aconst_null     
	//   54  117:aload_1         
	//   55  118:getfield        #409 <Field int DashChunkSource$PeriodHolder.localIndex>
	//   56  121:invokespecial   #713 <Method void SingleSampleMediaChunk(DataSource, DataSpec, int, Format, long, long, int, MediaFormat, DrmInitData, int)>
	//   57  124:areturn         
		else
			return ((Chunk) (new ContainerMediaChunk(datasource, ((DataSpec) (obj)), j, format, l, l1, i, l2 - l3, representationholder.extractorWrapper, mediaformat, exposedtrack.adaptiveMaxWidth, exposedtrack.adaptiveMaxHeight, periodholder.drmInitData, flag, periodholder.localIndex)));
	//   58  125:new             #715 <Class ContainerMediaChunk>
	//   59  128:dup             
	//   60  129:aload_3         
	//   61  130:aload           19
	//   62  132:iload           7
	//   63  134:aload           18
	//   64  136:lload           9
	//   65  138:lload           11
	//   66  140:iload           6
	//   67  142:lload           13
	//   68  144:lload           15
	//   69  146:lsub            
	//   70  147:aload_2         
	//   71  148:getfield        #678 <Field ChunkExtractorWrapper DashChunkSource$RepresentationHolder.extractorWrapper>
	//   72  151:aload           4
	//   73  153:aload           5
	//   74  155:getfield        #718 <Field int DashChunkSource$ExposedTrack.adaptiveMaxWidth>
	//   75  158:aload           5
	//   76  160:getfield        #721 <Field int DashChunkSource$ExposedTrack.adaptiveMaxHeight>
	//   77  163:aload_1         
	//   78  164:invokestatic    #725 <Method DrmInitData DashChunkSource$PeriodHolder.access$200(DashChunkSource$PeriodHolder)>
	//   79  167:iload           8
	//   80  169:aload_1         
	//   81  170:getfield        #409 <Field int DashChunkSource$PeriodHolder.localIndex>
	//   82  173:invokespecial   #728 <Method void ContainerMediaChunk(DataSource, DataSpec, int, Format, long, long, int, long, ChunkExtractorWrapper, MediaFormat, int, int, DrmInitData, boolean, int)>
	//   83  176:areturn         
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
		if(chunk instanceof InitializationChunk)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #355 <Class InitializationChunk>
	//*   2    4:ifeq            132
		{
			chunk = ((Chunk) ((InitializationChunk)chunk));
	//    3    7:aload_1         
	//    4    8:checkcast       #355 <Class InitializationChunk>
	//    5   11:astore_1        
			Object obj = ((Object) (((InitializationChunk) (chunk)).format.id));
	//    6   12:aload_1         
	//    7   13:getfield        #731 <Field Format InitializationChunk.format>
	//    8   16:getfield        #296 <Field String Format.id>
	//    9   19:astore_3        
			PeriodHolder periodholder = (PeriodHolder)periodHolders.get(((InitializationChunk) (chunk)).parentId);
	//   10   20:aload_0         
	//   11   21:getfield        #154 <Field SparseArray periodHolders>
	//   12   24:aload_1         
	//   13   25:getfield        #732 <Field int InitializationChunk.parentId>
	//   14   28:invokevirtual   #644 <Method Object SparseArray.get(int)>
	//   15   31:checkcast       #21  <Class DashChunkSource$PeriodHolder>
	//   16   34:astore_2        
			if(periodholder == null)
	//*  17   35:aload_2         
	//*  18   36:ifnonnull       40
				return;
	//   19   39:return          
			obj = ((Object) ((RepresentationHolder)periodholder.representationHolders.get(obj)));
	//   20   40:aload_2         
	//   21   41:getfield        #627 <Field HashMap DashChunkSource$PeriodHolder.representationHolders>
	//   22   44:aload_3         
	//   23   45:invokevirtual   #633 <Method Object HashMap.get(Object)>
	//   24   48:checkcast       #24  <Class DashChunkSource$RepresentationHolder>
	//   25   51:astore_3        
			if(((InitializationChunk) (chunk)).hasFormat())
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #735 <Method boolean InitializationChunk.hasFormat()>
	//*  28   56:ifeq            67
				obj.mediaFormat = ((InitializationChunk) (chunk)).getFormat();
	//   29   59:aload_3         
	//   30   60:aload_1         
	//   31   61:invokevirtual   #738 <Method MediaFormat InitializationChunk.getFormat()>
	//   32   64:putfield        #652 <Field MediaFormat DashChunkSource$RepresentationHolder.mediaFormat>
			if(((RepresentationHolder) (obj)).segmentIndex == null && ((InitializationChunk) (chunk)).hasSeekMap())
	//*  33   67:aload_3         
	//*  34   68:getfield        #660 <Field DashSegmentIndex DashChunkSource$RepresentationHolder.segmentIndex>
	//*  35   71:ifnonnull       109
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #741 <Method boolean InitializationChunk.hasSeekMap()>
	//*  38   78:ifeq            109
				obj.segmentIndex = ((DashSegmentIndex) (new DashWrappingSegmentIndex((ChunkIndex)((InitializationChunk) (chunk)).getSeekMap(), ((InitializationChunk) (chunk)).dataSpec.uri.toString())));
	//   39   81:aload_3         
	//   40   82:new             #743 <Class DashWrappingSegmentIndex>
	//   41   85:dup             
	//   42   86:aload_1         
	//   43   87:invokevirtual   #747 <Method com.google.android.exoplayer.extractor.SeekMap InitializationChunk.getSeekMap()>
	//   44   90:checkcast       #749 <Class ChunkIndex>
	//   45   93:aload_1         
	//   46   94:getfield        #753 <Field DataSpec InitializationChunk.dataSpec>
	//   47   97:getfield        #757 <Field Uri DataSpec.uri>
	//   48  100:invokevirtual   #760 <Method String Uri.toString()>
	//   49  103:invokespecial   #763 <Method void DashWrappingSegmentIndex(ChunkIndex, String)>
	//   50  106:putfield        #660 <Field DashSegmentIndex DashChunkSource$RepresentationHolder.segmentIndex>
			if(periodholder.drmInitData == null && ((InitializationChunk) (chunk)).hasDrmInitData())
	//*  51  109:aload_2         
	//*  52  110:invokestatic    #725 <Method DrmInitData DashChunkSource$PeriodHolder.access$200(DashChunkSource$PeriodHolder)>
	//*  53  113:ifnonnull       132
	//*  54  116:aload_1         
	//*  55  117:invokevirtual   #766 <Method boolean InitializationChunk.hasDrmInitData()>
	//*  56  120:ifeq            132
				periodholder.drmInitData = ((InitializationChunk) (chunk)).getDrmInitData();
	//   57  123:aload_2         
	//   58  124:aload_1         
	//   59  125:invokevirtual   #770 <Method DrmInitData InitializationChunk.getDrmInitData()>
	//   60  128:invokestatic    #774 <Method DrmInitData DashChunkSource$PeriodHolder.access$202(DashChunkSource$PeriodHolder, DrmInitData)>
	//   61  131:pop             
		}
	//   62  132:return          
	}

	public void onChunkLoadError(Chunk chunk, Exception exception)
	{
	//    0    0:return          
	}

	public boolean prepare()
	{
		boolean flag1 = prepareCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #779 <Field boolean prepareCalled>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            40
		{
			prepareCalled = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #779 <Field boolean prepareCalled>
			try
			{
				trackSelector.selectTracks(currentManifest, 0, ((DashTrackSelector.Output) (this)));
	//   10   16:aload_0         
	//   11   17:getfield        #124 <Field DashTrackSelector trackSelector>
	//   12   20:aload_0         
	//   13   21:getfield        #122 <Field MediaPresentationDescription currentManifest>
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:invokeinterface #785 <Method void DashTrackSelector.selectTracks(MediaPresentationDescription, int, DashTrackSelector$Output)>
			}
	//*  17   31:goto            40
			catch(IOException ioexception)
	//*  18   34:astore_3        
			{
				fatalError = ioexception;
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:putfield        #442 <Field IOException fatalError>
			}
		}
		if(fatalError == null)
	//*  22   40:aload_0         
	//*  23   41:getfield        #442 <Field IOException fatalError>
	//*  24   44:ifnonnull       49
			flag = true;
	//   25   47:iconst_1        
	//   26   48:istore_1        
		return flag;
	//   27   49:iload_1         
	//   28   50:ireturn         
	}

	private static final String TAG = "DashChunkSource";
	private final FormatEvaluator adaptiveFormatEvaluator;
	private TimeRange availableRange;
	private final long availableRangeValues[];
	private MediaPresentationDescription currentManifest;
	private final DataSource dataSource;
	private final long elapsedRealtimeOffsetUs;
	private ExposedTrack enabledTrack;
	private final com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final int eventSourceId;
	private IOException fatalError;
	private boolean lastChunkWasInitialization;
	private final boolean live;
	private final long liveEdgeLatencyUs;
	private final ManifestFetcher manifestFetcher;
	private int nextPeriodHolderIndex;
	private final SparseArray periodHolders;
	private boolean prepareCalled;
	private MediaPresentationDescription processedManifest;
	private boolean startAtLiveEdge;
	private final Clock systemClock;
	private final DashTrackSelector trackSelector;
	private final ArrayList tracks;


/*
	static int access$300(DashChunkSource dashchunksource)
	{
		return dashchunksource.eventSourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int eventSourceId>
	//    2    4:ireturn         
	}

*/


/*
	static EventListener access$400(DashChunkSource dashchunksource)
	{
		return dashchunksource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field DashChunkSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
