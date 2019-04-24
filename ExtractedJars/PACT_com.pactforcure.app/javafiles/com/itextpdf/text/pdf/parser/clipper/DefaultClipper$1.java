// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.Comparator;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			DefaultClipper

class DefaultClipper$1
	implements Comparator
{

	public int compare(tersectNode tersectnode, tersectNode tersectnode1)
	{
		long l = tersectnode1.getPt().getY() - tersectnode.getPt().getY();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #29  <Method Point$LongPoint DefaultClipper$IntersectNode.getPt()>
	//    2    4:invokevirtual   #35  <Method long Point$LongPoint.getY()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #29  <Method Point$LongPoint DefaultClipper$IntersectNode.getPt()>
	//    5   11:invokevirtual   #35  <Method long Point$LongPoint.getY()>
	//    6   14:lsub            
	//    7   15:lstore_3        
		if(l > 0L)
	//*   8   16:lload_3         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifle            24
			return 1;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		return l >= 0L ? 0 : -1;
	//   14   24:lload_3         
	//   15   25:lconst_0        
	//   16   26:lcmp            
	//   17   27:ifge            32
	//   18   30:iconst_m1       
	//   19   31:ireturn         
	//   20   32:iconst_0        
	//   21   33:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((tersectNode)obj, (tersectNode)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class DefaultClipper$IntersectNode>
	//    3    5:aload_2         
	//    4    6:checkcast       #25  <Class DefaultClipper$IntersectNode>
	//    5    9:invokevirtual   #38  <Method int compare(DefaultClipper$IntersectNode, DefaultClipper$IntersectNode)>
	//    6   12:ireturn         
	}

	final DefaultClipper this$0;

	DefaultClipper$1()
	{
		this$0 = DefaultClipper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DefaultClipper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
