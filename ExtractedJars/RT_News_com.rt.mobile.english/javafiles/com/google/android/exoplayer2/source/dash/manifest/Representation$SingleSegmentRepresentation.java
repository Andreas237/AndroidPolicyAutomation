// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			Representation, SingleSegmentIndex, RangedUri

public static class Representation$SingleSegmentRepresentation extends Representation
{

	public static Representation$SingleSegmentRepresentation newInstance(String s, long l, Format format, String s1, long l1, long l2, long l3, long l4, List list, String s2, 
			long l5)
	{
		return new Representation$SingleSegmentRepresentation(s, l, format, s1, new SegmentBase.SingleSegmentBase(new RangedUri(((String) (null)), l1, (l2 - l1) + 1L), 1L, 0L, l3, (l4 - l3) + 1L), list, s2, l5);
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

	public Representation$SingleSegmentRepresentation(String s, long l, Format format, String s1, SegmentBase.SingleSegmentBase singlesegmentbase, List list, 
			String s2, long l1)
	{
		super(s, l, format, s1, ((SegmentBase) (singlesegmentbase)), list, ((Representation._cls1) (null)));
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
			((StringBuilder) (singlesegmentbase)).append(format.id);
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
