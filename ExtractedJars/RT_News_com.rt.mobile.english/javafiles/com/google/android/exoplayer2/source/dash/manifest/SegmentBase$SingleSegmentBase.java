// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;


// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase, RangedUri

public static class SegmentBase$SingleSegmentBase extends SegmentBase
{

	public RangedUri getIndex()
	{
		if(indexLength <= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field long indexLength>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifgt            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new RangedUri(((String) (null)), indexStart, indexLength);
	//    7   11:new             #25  <Class RangedUri>
	//    8   14:dup             
	//    9   15:aconst_null     
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field long indexStart>
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field long indexLength>
	//   14   24:invokespecial   #28  <Method void RangedUri(String, long, long)>
	//   15   27:areturn         
	}

	final long indexLength;
	final long indexStart;

	public SegmentBase$SingleSegmentBase()
	{
		this(((RangedUri) (null)), 1L, 0L, 0L, 0L);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lconst_1        
	//    3    3:lconst_0        
	//    4    4:lconst_0        
	//    5    5:lconst_0        
	//    6    6:invokespecial   #13  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
	//    7    9:return          
	}

	public SegmentBase$SingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
			long l3)
	{
		super(rangeduri, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #17  <Method void SegmentBase(RangedUri, long, long)>
		indexStart = l2;
	//    5    8:aload_0         
	//    6    9:lload           6
	//    7   11:putfield        #19  <Field long indexStart>
		indexLength = l3;
	//    8   14:aload_0         
	//    9   15:lload           8
	//   10   17:putfield        #21  <Field long indexLength>
	//   11   20:return          
	}
}
