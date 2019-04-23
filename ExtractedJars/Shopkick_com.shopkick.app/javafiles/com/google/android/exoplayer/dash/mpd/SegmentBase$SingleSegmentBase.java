// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;


// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			SegmentBase, RangedUri

public static class SegmentBase$SingleSegmentBase extends SegmentBase
{

	public RangedUri getIndex()
	{
		long l = indexLength;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long indexLength>
	//    2    4:lstore_1        
		if(l <= 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifgt            13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		else
			return new RangedUri(((String) (null)), indexStart, l);
	//    9   13:new             #27  <Class RangedUri>
	//   10   16:dup             
	//   11   17:aconst_null     
	//   12   18:aload_0         
	//   13   19:getfield        #21  <Field long indexStart>
	//   14   22:lload_1         
	//   15   23:invokespecial   #30  <Method void RangedUri(String, long, long)>
	//   16   26:areturn         
	}

	final long indexLength;
	final long indexStart;

	public SegmentBase$SingleSegmentBase()
	{
		this(((RangedUri) (null)), 1L, 0L, 0L, -1L);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lconst_1        
	//    3    3:lconst_0        
	//    4    4:lconst_0        
	//    5    5:ldc2w           #11  <Long -1L>
	//    6    8:invokespecial   #15  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
	//    7   11:return          
	}

	public SegmentBase$SingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
			long l3)
	{
		super(rangeduri, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #19  <Method void SegmentBase(RangedUri, long, long)>
		indexStart = l2;
	//    5    8:aload_0         
	//    6    9:lload           6
	//    7   11:putfield        #21  <Field long indexStart>
		indexLength = l3;
	//    8   14:aload_0         
	//    9   15:lload           8
	//   10   17:putfield        #23  <Field long indexLength>
	//   11   20:return          
	}
}
