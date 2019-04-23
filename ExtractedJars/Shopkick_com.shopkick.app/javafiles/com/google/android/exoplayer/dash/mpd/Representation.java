// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import android.net.Uri;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			SegmentBase, RangedUri, DashSingleSegmentIndex

public abstract class Representation
	implements FormatWrapper
{
	public static class MultiSegmentRepresentation extends Representation
		implements DashSegmentIndex
	{

		public long getDurationUs(int i, long l)
		{
			return segmentBase.getSegmentDurationUs(i, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #24  <Method long SegmentBase$MultiSegmentBase.getSegmentDurationUs(int, long)>
		//    5    9:lreturn         
		}

		public int getFirstSegmentNum()
		{
			return segmentBase.getFirstSegmentNum();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:invokevirtual   #28  <Method int SegmentBase$MultiSegmentBase.getFirstSegmentNum()>
		//    3    7:ireturn         
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

		public int getLastSegmentNum(long l)
		{
			return segmentBase.getLastSegmentNum(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #36  <Method int SegmentBase$MultiSegmentBase.getLastSegmentNum(long)>
		//    4    8:ireturn         
		}

		public int getSegmentNum(long l, long l1)
		{
			return segmentBase.getSegmentNum(l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:lload_1         
		//    3    5:lload_3         
		//    4    6:invokevirtual   #40  <Method int SegmentBase$MultiSegmentBase.getSegmentNum(long, long)>
		//    5    9:ireturn         
		}

		public RangedUri getSegmentUrl(int i)
		{
			return segmentBase.getSegmentUrl(((Representation) (this)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #45  <Method RangedUri SegmentBase$MultiSegmentBase.getSegmentUrl(Representation, int)>
		//    5    9:areturn         
		}

		public long getTimeUs(int i)
		{
			return segmentBase.getSegmentTimeUs(i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #50  <Method long SegmentBase$MultiSegmentBase.getSegmentTimeUs(int)>
		//    4    8:lreturn         
		}

		public boolean isExplicit()
		{
			return segmentBase.isExplicit();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//    2    4:invokevirtual   #54  <Method boolean SegmentBase$MultiSegmentBase.isExplicit()>
		//    3    7:ireturn         
		}

		private final SegmentBase.MultiSegmentBase segmentBase;

		public MultiSegmentRepresentation(String s, long l, Format format1, SegmentBase.MultiSegmentBase multisegmentbase, String s1, String s2)
		{
			super(s, l, format1, s2, ((SegmentBase) (multisegmentbase)), s1, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:aload           4
		//    4    5:aload           7
		//    5    7:aload           5
		//    6    9:aload           6
		//    7   11:aconst_null     
		//    8   12:invokespecial   #14  <Method void Representation(String, long, Format, String, SegmentBase, String, Representation$1)>
			segmentBase = multisegmentbase;
		//    9   15:aload_0         
		//   10   16:aload           5
		//   11   18:putfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
		//   12   21:return          
		}
	}

	public static class SingleSegmentRepresentation extends Representation
	{

		public static SingleSegmentRepresentation newInstance(String s, long l, Format format1, String s1, long l1, long l2, long l3, long l4, String s2, long l5)
		{
			return new SingleSegmentRepresentation(s, l, format1, new SegmentBase.SingleSegmentBase(new RangedUri("", l1, (l2 - l1) + 1L), 1L, 0L, l3, (l4 - l3) + 1L), s2, l5, s1);
		//    0    0:new             #2   <Class Representation$SingleSegmentRepresentation>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:aload_3         
		//    5    7:new             #28  <Class SegmentBase$SingleSegmentBase>
		//    6   10:dup             
		//    7   11:new             #40  <Class RangedUri>
		//    8   14:dup             
		//    9   15:ldc1            #42  <String "">
		//   10   17:lload           5
		//   11   19:lload           7
		//   12   21:lload           5
		//   13   23:lsub            
		//   14   24:lconst_1        
		//   15   25:ladd            
		//   16   26:invokespecial   #45  <Method void RangedUri(String, long, long)>
		//   17   29:lconst_1        
		//   18   30:lconst_0        
		//   19   31:lload           9
		//   20   33:lload           11
		//   21   35:lload           9
		//   22   37:lsub            
		//   23   38:lconst_1        
		//   24   39:ladd            
		//   25   40:invokespecial   #56  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
		//   26   43:aload           13
		//   27   45:lload           14
		//   28   47:aload           4
		//   29   49:invokespecial   #58  <Method void Representation$SingleSegmentRepresentation(String, long, Format, SegmentBase$SingleSegmentBase, String, long, String)>
		//   30   52:areturn         
		}

		public DashSegmentIndex getIndex()
		{
			return ((DashSegmentIndex) (segmentIndex));
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field DashSingleSegmentIndex segmentIndex>
		//    2    4:areturn         
		}

		public RangedUri getIndexUri()
		{
			return indexUri;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field RangedUri indexUri>
		//    2    4:areturn         
		}

		public final long contentLength;
		private final RangedUri indexUri;
		private final DashSingleSegmentIndex segmentIndex;
		public final Uri uri;

		public SingleSegmentRepresentation(String s, long l, Format format1, SegmentBase.SingleSegmentBase singlesegmentbase, String s1, long l1, String s2)
		{
			super(s, l, format1, s2, ((SegmentBase) (singlesegmentbase)), s1, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:aload           4
		//    4    5:aload           9
		//    5    7:aload           5
		//    6    9:aload           6
		//    7   11:aconst_null     
		//    8   12:invokespecial   #18  <Method void Representation(String, long, Format, String, SegmentBase, String, Representation$1)>
			uri = Uri.parse(s2);
		//    9   15:aload_0         
		//   10   16:aload           9
		//   11   18:invokestatic    #24  <Method Uri Uri.parse(String)>
		//   12   21:putfield        #26  <Field Uri uri>
			indexUri = singlesegmentbase.getIndex();
		//   13   24:aload_0         
		//   14   25:aload           5
		//   15   27:invokevirtual   #32  <Method RangedUri SegmentBase$SingleSegmentBase.getIndex()>
		//   16   30:putfield        #34  <Field RangedUri indexUri>
			contentLength = l1;
		//   17   33:aload_0         
		//   18   34:lload           7
		//   19   36:putfield        #36  <Field long contentLength>
			if(indexUri != null)
		//*  20   39:aload_0         
		//*  21   40:getfield        #34  <Field RangedUri indexUri>
		//*  22   43:ifnull          51
				s = null;
		//   23   46:aconst_null     
		//   24   47:astore_1        
			else
		//*  25   48:goto            71
				s = ((String) (new DashSingleSegmentIndex(new RangedUri("", 0L, l1))));
		//   26   51:new             #38  <Class DashSingleSegmentIndex>
		//   27   54:dup             
		//   28   55:new             #40  <Class RangedUri>
		//   29   58:dup             
		//   30   59:ldc1            #42  <String "">
		//   31   61:lconst_0        
		//   32   62:lload           7
		//   33   64:invokespecial   #45  <Method void RangedUri(String, long, long)>
		//   34   67:invokespecial   #48  <Method void DashSingleSegmentIndex(RangedUri)>
		//   35   70:astore_1        
			segmentIndex = ((DashSingleSegmentIndex) (s));
		//   36   71:aload_0         
		//   37   72:aload_1         
		//   38   73:putfield        #50  <Field DashSingleSegmentIndex segmentIndex>
		//   39   76:return          
		}
	}


	private Representation(String s, long l, Format format1, String s1, SegmentBase segmentbase, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		contentId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String contentId>
		revisionId = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #34  <Field long revisionId>
		format = format1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #36  <Field Format format>
		if(s2 == null)
	//*  11   20:aload           7
	//*  12   22:ifnull          28
	//*  13   25:goto            85
		{
			s2 = ((String) (new StringBuilder()));
	//   14   28:new             #38  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #39  <Method void StringBuilder()>
	//   17   35:astore          7
			((StringBuilder) (s2)).append(s);
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			((StringBuilder) (s2)).append(".");
	//   22   44:aload           7
	//   23   46:ldc1            #45  <String ".">
	//   24   48:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (s2)).append(format1.id);
	//   26   52:aload           7
	//   27   54:aload           4
	//   28   56:getfield        #50  <Field String Format.id>
	//   29   59:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			((StringBuilder) (s2)).append(".");
	//   31   63:aload           7
	//   32   65:ldc1            #45  <String ".">
	//   33   67:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
			((StringBuilder) (s2)).append(l);
	//   35   71:aload           7
	//   36   73:lload_2         
	//   37   74:invokevirtual   #53  <Method StringBuilder StringBuilder.append(long)>
	//   38   77:pop             
			s2 = ((StringBuilder) (s2)).toString();
	//   39   78:aload           7
	//   40   80:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   41   83:astore          7
		}
		cacheKey = s2;
	//   42   85:aload_0         
	//   43   86:aload           7
	//   44   88:putfield        #59  <Field String cacheKey>
		initializationUri = segmentbase.getInitialization(this);
	//   45   91:aload_0         
	//   46   92:aload           6
	//   47   94:aload_0         
	//   48   95:invokevirtual   #65  <Method RangedUri SegmentBase.getInitialization(Representation)>
	//   49   98:putfield        #67  <Field RangedUri initializationUri>
		presentationTimeOffsetUs = segmentbase.getPresentationTimeOffsetUs();
	//   50  101:aload_0         
	//   51  102:aload           6
	//   52  104:invokevirtual   #71  <Method long SegmentBase.getPresentationTimeOffsetUs()>
	//   53  107:putfield        #73  <Field long presentationTimeOffsetUs>
		baseUrl = s1;
	//   54  110:aload_0         
	//   55  111:aload           5
	//   56  113:putfield        #75  <Field String baseUrl>
	//   57  116:return          
	}

	Representation(String s, long l, Format format1, String s1, SegmentBase segmentbase, String s2, 
			_cls1 _pcls1)
	{
		this(s, l, format1, s1, segmentbase, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokespecial   #79  <Method void Representation(String, long, Format, String, SegmentBase, String)>
	//    8   14:return          
	}

	public static Representation newInstance(String s, long l, Format format1, String s1, SegmentBase segmentbase)
	{
		return newInstance(s, l, format1, s1, segmentbase, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aconst_null     
	//    6    8:invokestatic    #84  <Method Representation newInstance(String, long, Format, String, SegmentBase, String)>
	//    7   11:areturn         
	}

	public static Representation newInstance(String s, long l, Format format1, String s1, SegmentBase segmentbase, String s2)
	{
		if(segmentbase instanceof SegmentBase.SingleSegmentBase)
	//*   0    0:aload           5
	//*   1    2:instanceof      #86  <Class SegmentBase$SingleSegmentBase>
	//*   2    5:ifeq            31
			return ((Representation) (new SingleSegmentRepresentation(s, l, format1, (SegmentBase.SingleSegmentBase)segmentbase, s2, -1L, s1)));
	//    3    8:new             #13  <Class Representation$SingleSegmentRepresentation>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:lload_1         
	//    7   14:aload_3         
	//    8   15:aload           5
	//    9   17:checkcast       #86  <Class SegmentBase$SingleSegmentBase>
	//   10   20:aload           6
	//   11   22:ldc2w           #87  <Long -1L>
	//   12   25:aload           4
	//   13   27:invokespecial   #91  <Method void Representation$SingleSegmentRepresentation(String, long, Format, SegmentBase$SingleSegmentBase, String, long, String)>
	//   14   30:areturn         
		if(segmentbase instanceof SegmentBase.MultiSegmentBase)
	//*  15   31:aload           5
	//*  16   33:instanceof      #93  <Class SegmentBase$MultiSegmentBase>
	//*  17   36:ifeq            59
			return ((Representation) (new MultiSegmentRepresentation(s, l, format1, (SegmentBase.MultiSegmentBase)segmentbase, s2, s1)));
	//   18   39:new             #10  <Class Representation$MultiSegmentRepresentation>
	//   19   42:dup             
	//   20   43:aload_0         
	//   21   44:lload_1         
	//   22   45:aload_3         
	//   23   46:aload           5
	//   24   48:checkcast       #93  <Class SegmentBase$MultiSegmentBase>
	//   25   51:aload           6
	//   26   53:aload           4
	//   27   55:invokespecial   #96  <Method void Representation$MultiSegmentRepresentation(String, long, Format, SegmentBase$MultiSegmentBase, String, String)>
	//   28   58:areturn         
		else
			throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
	//   29   59:new             #98  <Class IllegalArgumentException>
	//   30   62:dup             
	//   31   63:ldc1            #100 <String "segmentBase must be of type SingleSegmentBase or MultiSegmentBase">
	//   32   65:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   33   68:athrow          
	}

	public String getCacheKey()
	{
		return cacheKey;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String cacheKey>
	//    2    4:areturn         
	}

	public Format getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Format format>
	//    2    4:areturn         
	}

	public abstract DashSegmentIndex getIndex();

	public abstract RangedUri getIndexUri();

	public RangedUri getInitializationUri()
	{
		return initializationUri;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field RangedUri initializationUri>
	//    2    4:areturn         
	}

	public final String baseUrl;
	private final String cacheKey;
	public final String contentId;
	public final Format format;
	private final RangedUri initializationUri;
	public final long presentationTimeOffsetUs;
	public final long revisionId;
}
