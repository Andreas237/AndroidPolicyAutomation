// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase, RangedUri, SingleSegmentIndex

public abstract class Representation
{
	public static class MultiSegmentRepresentation extends Representation
		implements DashSegmentIndex
	{

		public String getCacheKey()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public long getDurationUs(long l, long l1)
		{
			return segmentBase.getSegmentDurationUs(l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:lload_3         
		//    4    6:invokevirtual   #28  <Method long SegmentBase$MultiSegmentBase.getSegmentDurationUs(long, long)>
		//    5    9:lreturn         
		}

		public long getFirstSegmentNum()
		{
			return segmentBase.getFirstSegmentNum();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:invokevirtual   #32  <Method long SegmentBase$MultiSegmentBase.getFirstSegmentNum()>
		//    3    7:lreturn         
		}

		public DashSegmentIndex getIndex()
		{
			return ((DashSegmentIndex) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public RangedUri getIndexUri()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getSegmentCount(long l)
		{
			return segmentBase.getSegmentCount(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #40  <Method int SegmentBase$MultiSegmentBase.getSegmentCount(long)>
		//    4    8:ireturn         
		}

		public long getSegmentNum(long l, long l1)
		{
			return segmentBase.getSegmentNum(l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:lload_3         
		//    4    6:invokevirtual   #43  <Method long SegmentBase$MultiSegmentBase.getSegmentNum(long, long)>
		//    5    9:lreturn         
		}

		public RangedUri getSegmentUrl(long l)
		{
			return segmentBase.getSegmentUrl(((Representation) (this)), l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:invokevirtual   #48  <Method RangedUri SegmentBase$MultiSegmentBase.getSegmentUrl(Representation, long)>
		//    5    9:areturn         
		}

		public long getTimeUs(long l)
		{
			return segmentBase.getSegmentTimeUs(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #53  <Method long SegmentBase$MultiSegmentBase.getSegmentTimeUs(long)>
		//    4    8:lreturn         
		}

		public boolean isExplicit()
		{
			return segmentBase.isExplicit();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:invokevirtual   #57  <Method boolean SegmentBase$MultiSegmentBase.isExplicit()>
		//    3    7:ireturn         
		}

		private final SegmentBase.MultiSegmentBase segmentBase;

		public MultiSegmentRepresentation(String s, long l, Format format1, String s1, SegmentBase.MultiSegmentBase multisegmentbase, List list)
		{
			super(s, l, format1, s1, ((SegmentBase) (multisegmentbase)), list, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:aload           6
		//    6    9:aload           7
		//    7   11:aconst_null     
		//    8   12:invokespecial   #14  <Method void Representation(String, long, Format, String, SegmentBase, List, Representation$1)>
			segmentBase = multisegmentbase;
		//    9   15:aload_0         
		//   10   16:aload           6
		//   11   18:putfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//   12   21:return          
		}
	}

	public static class SingleSegmentRepresentation extends Representation
	{

		public static SingleSegmentRepresentation newInstance(String s, long l, Format format1, String s1, long l1, long l2, long l3, long l4, List list, String s2, 
				long l5)
		{
			return new SingleSegmentRepresentation(s, l, format1, s1, new SegmentBase.SingleSegmentBase(new RangedUri(((String) (null)), l1, (l2 - l1) + 1L), 1L, 0L, l3, (l4 - l3) + 1L), list, s2, l5);
		//    0    0:new             #2   <Class Representation$SingleSegmentRepresentation>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:new             #30  <Class SegmentBase$SingleSegmentBase>
		//    7   12:dup             
		//    8   13:new             #67  <Class RangedUri>
		//    9   16:dup             
		//   10   17:aconst_null     
		//   11   18:lload           5
		//   12   20:lload           7
		//   13   22:lload           5
		//   14   24:lsub            
		//   15   25:lconst_1        
		//   16   26:ladd            
		//   17   27:invokespecial   #70  <Method void RangedUri(String, long, long)>
		//   18   30:lconst_1        
		//   19   31:lconst_0        
		//   20   32:lload           9
		//   21   34:lload           11
		//   22   36:lload           9
		//   23   38:lsub            
		//   24   39:lconst_1        
		//   25   40:ladd            
		//   26   41:invokespecial   #83  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
		//   27   44:aload           13
		//   28   46:aload           14
		//   29   48:lload           15
		//   30   50:invokespecial   #85  <Method void Representation$SingleSegmentRepresentation(String, long, Format, String, SegmentBase$SingleSegmentBase, List, String, long)>
		//   31   53:areturn         
		}

		public String getCacheKey()
		{
			return cacheKey;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field String cacheKey>
		//    2    4:areturn         
		}

		public DashSegmentIndex getIndex()
		{
			return ((DashSegmentIndex) (segmentIndex));
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field SingleSegmentIndex segmentIndex>
		//    2    4:areturn         
		}

		public RangedUri getIndexUri()
		{
			return indexUri;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field RangedUri indexUri>
		//    2    4:areturn         
		}

		private final String cacheKey;
		public final long contentLength;
		private final RangedUri indexUri;
		private final SingleSegmentIndex segmentIndex;
		public final Uri uri;

		public SingleSegmentRepresentation(String s, long l, Format format1, String s1, SegmentBase.SingleSegmentBase singlesegmentbase, List list, 
				String s2, long l1)
		{
			super(s, l, format1, s1, ((SegmentBase) (singlesegmentbase)), list, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:aload           6
		//    6    9:aload           7
		//    7   11:aconst_null     
		//    8   12:invokespecial   #20  <Method void Representation(String, long, Format, String, SegmentBase, List, Representation$1)>
			uri = Uri.parse(s1);
		//    9   15:aload_0         
		//   10   16:aload           5
		//   11   18:invokestatic    #26  <Method Uri Uri.parse(String)>
		//   12   21:putfield        #28  <Field Uri uri>
			indexUri = singlesegmentbase.getIndex();
		//   13   24:aload_0         
		//   14   25:aload           6
		//   15   27:invokevirtual   #34  <Method RangedUri SegmentBase$SingleSegmentBase.getIndex()>
		//   16   30:putfield        #36  <Field RangedUri indexUri>
			s1 = null;
		//   17   33:aconst_null     
		//   18   34:astore          5
			if(s2 != null)
		//*  19   36:aload           8
		//*  20   38:ifnull          47
				s = s2;
		//   21   41:aload           8
		//   22   43:astore_1        
			else
		//*  23   44:goto            112
			if(s != null)
		//*  24   47:aload_1         
		//*  25   48:ifnull          110
			{
				singlesegmentbase = ((SegmentBase.SingleSegmentBase) (new StringBuilder()));
		//   26   51:new             #38  <Class StringBuilder>
		//   27   54:dup             
		//   28   55:invokespecial   #41  <Method void StringBuilder()>
		//   29   58:astore          6
				((StringBuilder) (singlesegmentbase)).append(s);
		//   30   60:aload           6
		//   31   62:aload_1         
		//   32   63:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   33   66:pop             
				((StringBuilder) (singlesegmentbase)).append(".");
		//   34   67:aload           6
		//   35   69:ldc1            #47  <String ".">
		//   36   71:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   37   74:pop             
				((StringBuilder) (singlesegmentbase)).append(format1.id);
		//   38   75:aload           6
		//   39   77:aload           4
		//   40   79:getfield        #52  <Field String Format.id>
		//   41   82:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   42   85:pop             
				((StringBuilder) (singlesegmentbase)).append(".");
		//   43   86:aload           6
		//   44   88:ldc1            #47  <String ".">
		//   45   90:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   46   93:pop             
				((StringBuilder) (singlesegmentbase)).append(l);
		//   47   94:aload           6
		//   48   96:lload_2         
		//   49   97:invokevirtual   #55  <Method StringBuilder StringBuilder.append(long)>
		//   50  100:pop             
				s = ((StringBuilder) (singlesegmentbase)).toString();
		//   51  101:aload           6
		//   52  103:invokevirtual   #59  <Method String StringBuilder.toString()>
		//   53  106:astore_1        
			} else
		//*  54  107:goto            112
			{
				s = null;
		//   55  110:aconst_null     
		//   56  111:astore_1        
			}
			cacheKey = s;
		//   57  112:aload_0         
		//   58  113:aload_1         
		//   59  114:putfield        #61  <Field String cacheKey>
			contentLength = l1;
		//   60  117:aload_0         
		//   61  118:lload           9
		//   62  120:putfield        #63  <Field long contentLength>
			if(indexUri != null)
		//*  63  123:aload_0         
		//*  64  124:getfield        #36  <Field RangedUri indexUri>
		//*  65  127:ifnull          136
				s = s1;
		//   66  130:aload           5
		//   67  132:astore_1        
			else
		//*  68  133:goto            155
				s = ((String) (new SingleSegmentIndex(new RangedUri(((String) (null)), 0L, l1))));
		//   69  136:new             #65  <Class SingleSegmentIndex>
		//   70  139:dup             
		//   71  140:new             #67  <Class RangedUri>
		//   72  143:dup             
		//   73  144:aconst_null     
		//   74  145:lconst_0        
		//   75  146:lload           9
		//   76  148:invokespecial   #70  <Method void RangedUri(String, long, long)>
		//   77  151:invokespecial   #73  <Method void SingleSegmentIndex(RangedUri)>
		//   78  154:astore_1        
			segmentIndex = ((SingleSegmentIndex) (s));
		//   79  155:aload_0         
		//   80  156:aload_1         
		//   81  157:putfield        #75  <Field SingleSegmentIndex segmentIndex>
		//   82  160:return          
		}
	}


	private Representation(String s, long l, Format format1, String s1, SegmentBase segmentbase, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		contentId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String contentId>
		revisionId = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #37  <Field long revisionId>
		format = format1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #39  <Field Format format>
		baseUrl = s1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #41  <Field String baseUrl>
		if(list == null)
	//*  14   26:aload           7
	//*  15   28:ifnonnull       38
			s = ((String) (Collections.emptyList()));
	//   16   31:invokestatic    #47  <Method List Collections.emptyList()>
	//   17   34:astore_1        
		else
	//*  18   35:goto            44
			s = ((String) (Collections.unmodifiableList(list)));
	//   19   38:aload           7
	//   20   40:invokestatic    #51  <Method List Collections.unmodifiableList(List)>
	//   21   43:astore_1        
		inbandEventStreams = ((List) (s));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #53  <Field List inbandEventStreams>
		initializationUri = segmentbase.getInitialization(this);
	//   25   49:aload_0         
	//   26   50:aload           6
	//   27   52:aload_0         
	//   28   53:invokevirtual   #59  <Method RangedUri SegmentBase.getInitialization(Representation)>
	//   29   56:putfield        #61  <Field RangedUri initializationUri>
		presentationTimeOffsetUs = segmentbase.getPresentationTimeOffsetUs();
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:invokevirtual   #65  <Method long SegmentBase.getPresentationTimeOffsetUs()>
	//   33   65:putfield        #67  <Field long presentationTimeOffsetUs>
	//   34   68:return          
	}

	Representation(String s, long l, Format format1, String s1, SegmentBase segmentbase, List list, 
			_cls1 _pcls1)
	{
		this(s, l, format1, s1, segmentbase, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokespecial   #73  <Method void Representation(String, long, Format, String, SegmentBase, List)>
	//    8   14:return          
	}

	public static Representation newInstance(String s, long l, Format format1, String s1, SegmentBase segmentbase)
	{
		return newInstance(s, l, format1, s1, segmentbase, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aconst_null     
	//    6    8:invokestatic    #78  <Method Representation newInstance(String, long, Format, String, SegmentBase, List)>
	//    7   11:areturn         
	}

	public static Representation newInstance(String s, long l, Format format1, String s1, SegmentBase segmentbase, List list)
	{
		return newInstance(s, l, format1, s1, segmentbase, list, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aconst_null     
	//    7   10:invokestatic    #81  <Method Representation newInstance(String, long, Format, String, SegmentBase, List, String)>
	//    8   13:areturn         
	}

	public static Representation newInstance(String s, long l, Format format1, String s1, SegmentBase segmentbase, List list, String s2)
	{
		if(segmentbase instanceof SegmentBase.SingleSegmentBase)
	//*   0    0:aload           5
	//*   1    2:instanceof      #84  <Class SegmentBase$SingleSegmentBase>
	//*   2    5:ifeq            33
			return ((Representation) (new SingleSegmentRepresentation(s, l, format1, s1, (SegmentBase.SingleSegmentBase)segmentbase, list, s2, -1L)));
	//    3    8:new             #11  <Class Representation$SingleSegmentRepresentation>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:lload_1         
	//    7   14:aload_3         
	//    8   15:aload           4
	//    9   17:aload           5
	//   10   19:checkcast       #84  <Class SegmentBase$SingleSegmentBase>
	//   11   22:aload           6
	//   12   24:aload           7
	//   13   26:ldc2w           #15  <Long -1L>
	//   14   29:invokespecial   #87  <Method void Representation$SingleSegmentRepresentation(String, long, Format, String, SegmentBase$SingleSegmentBase, List, String, long)>
	//   15   32:areturn         
		if(segmentbase instanceof SegmentBase.MultiSegmentBase)
	//*  16   33:aload           5
	//*  17   35:instanceof      #89  <Class SegmentBase$MultiSegmentBase>
	//*  18   38:ifeq            61
			return ((Representation) (new MultiSegmentRepresentation(s, l, format1, s1, (SegmentBase.MultiSegmentBase)segmentbase, list)));
	//   19   41:new             #8   <Class Representation$MultiSegmentRepresentation>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:lload_1         
	//   23   47:aload_3         
	//   24   48:aload           4
	//   25   50:aload           5
	//   26   52:checkcast       #89  <Class SegmentBase$MultiSegmentBase>
	//   27   55:aload           6
	//   28   57:invokespecial   #92  <Method void Representation$MultiSegmentRepresentation(String, long, Format, String, SegmentBase$MultiSegmentBase, List)>
	//   29   60:areturn         
		else
			throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
	//   30   61:new             #94  <Class IllegalArgumentException>
	//   31   64:dup             
	//   32   65:ldc1            #96  <String "segmentBase must be of type SingleSegmentBase or MultiSegmentBase">
	//   33   67:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   34   70:athrow          
	}

	public abstract String getCacheKey();

	public abstract DashSegmentIndex getIndex();

	public abstract RangedUri getIndexUri();

	public RangedUri getInitializationUri()
	{
		return initializationUri;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field RangedUri initializationUri>
	//    2    4:areturn         
	}

	public static final long REVISION_ID_DEFAULT = -1L;
	public final String baseUrl;
	public final String contentId;
	public final Format format;
	public final List inbandEventStreams;
	private final RangedUri initializationUri;
	public final long presentationTimeOffsetUs;
	public final long revisionId;
}
