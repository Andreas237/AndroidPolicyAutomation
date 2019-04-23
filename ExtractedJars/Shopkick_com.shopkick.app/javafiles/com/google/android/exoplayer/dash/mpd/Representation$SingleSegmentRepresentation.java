// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import android.net.Uri;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			Representation, DashSingleSegmentIndex, RangedUri

public static class Representation$SingleSegmentRepresentation extends Representation
{

	public static Representation$SingleSegmentRepresentation newInstance(String s, long l, Format format, String s1, long l1, long l2, long l3, long l4, String s2, long l5)
	{
		return new Representation$SingleSegmentRepresentation(s, l, format, new SegmentBase.SingleSegmentBase(new RangedUri("", l1, (l2 - l1) + 1L), 1L, 0L, l3, (l4 - l3) + 1L), s2, l5, s1);
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

	public Representation$SingleSegmentRepresentation(String s, long l, Format format, SegmentBase.SingleSegmentBase singlesegmentbase, String s1, long l1, String s2)
	{
		super(s, l, format, s2, ((SegmentBase) (singlesegmentbase)), s1, ((Representation._cls1) (null)));
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
