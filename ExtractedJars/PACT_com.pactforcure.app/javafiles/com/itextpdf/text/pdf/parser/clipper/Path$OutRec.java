// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Path, PolyNode

static class Path$OutRec
{

	public double area()
	{
		Path.OutPt outpt = pts;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Path$OutPt pts>
	//    2    4:astore          5
		if(outpt == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
			return 0.0D;
	//    5   11:dconst_0        
	//    6   12:dreturn         
		double d = 0.0D;
	//    7   13:dconst_0        
	//    8   14:dstore_1        
		double d1;
		Path.OutPt outpt1;
		do
		{
			d1 = d + (double)(outpt.prev.getPt().getX() + outpt.getPt().getX()) * (double)(outpt.prev.getPt().getY() - outpt.getPt().getY());
	//    9   15:dload_1         
	//   10   16:aload           5
	//   11   18:getfield        #33  <Field Path$OutPt Path$OutPt.prev>
	//   12   21:invokevirtual   #37  <Method Point$LongPoint Path$OutPt.getPt()>
	//   13   24:invokevirtual   #43  <Method long Point$LongPoint.getX()>
	//   14   27:aload           5
	//   15   29:invokevirtual   #37  <Method Point$LongPoint Path$OutPt.getPt()>
	//   16   32:invokevirtual   #43  <Method long Point$LongPoint.getX()>
	//   17   35:ladd            
	//   18   36:l2d             
	//   19   37:aload           5
	//   20   39:getfield        #33  <Field Path$OutPt Path$OutPt.prev>
	//   21   42:invokevirtual   #37  <Method Point$LongPoint Path$OutPt.getPt()>
	//   22   45:invokevirtual   #46  <Method long Point$LongPoint.getY()>
	//   23   48:aload           5
	//   24   50:invokevirtual   #37  <Method Point$LongPoint Path$OutPt.getPt()>
	//   25   53:invokevirtual   #46  <Method long Point$LongPoint.getY()>
	//   26   56:lsub            
	//   27   57:l2d             
	//   28   58:dmul            
	//   29   59:dadd            
	//   30   60:dstore_3        
			outpt1 = outpt.next;
	//   31   61:aload           5
	//   32   63:getfield        #49  <Field Path$OutPt Path$OutPt.next>
	//   33   66:astore          6
			d = d1;
	//   34   68:dload_3         
	//   35   69:dstore_1        
			outpt = outpt1;
	//   36   70:aload           6
	//   37   72:astore          5
		} while(outpt1 != pts);
	//   38   74:aload           6
	//   39   76:aload_0         
	//   40   77:getfield        #28  <Field Path$OutPt pts>
	//   41   80:if_acmpne       15
		return 0.5D * d1;
	//   42   83:ldc2w           #50  <Double 0.5D>
	//   43   86:dload_3         
	//   44   87:dmul            
	//   45   88:dreturn         
	}

	public void fixHoleLinkage()
	{
		if(firstLeft == null || isHole != firstLeft.isHole && firstLeft.pts != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Path$OutRec firstLeft>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field boolean isHole>
	//*   5   11:aload_0         
	//*   6   12:getfield        #54  <Field Path$OutRec firstLeft>
	//*   7   15:getfield        #56  <Field boolean isHole>
	//*   8   18:icmpeq          32
	//*   9   21:aload_0         
	//*  10   22:getfield        #54  <Field Path$OutRec firstLeft>
	//*  11   25:getfield        #28  <Field Path$OutPt pts>
	//*  12   28:ifnull          32
			return;
	//   13   31:return          
		Path$OutRec path$outrec;
		for(path$outrec = firstLeft; path$outrec != null && (path$outrec.isHole == isHole || path$outrec.pts == null); path$outrec = path$outrec.firstLeft);
	//   14   32:aload_0         
	//   15   33:getfield        #54  <Field Path$OutRec firstLeft>
	//   16   36:astore_1        
	//   17   37:aload_1         
	//   18   38:ifnull          67
	//   19   41:aload_1         
	//   20   42:getfield        #56  <Field boolean isHole>
	//   21   45:aload_0         
	//   22   46:getfield        #56  <Field boolean isHole>
	//   23   49:icmpeq          59
	//   24   52:aload_1         
	//   25   53:getfield        #28  <Field Path$OutPt pts>
	//   26   56:ifnonnull       67
	//   27   59:aload_1         
	//   28   60:getfield        #54  <Field Path$OutRec firstLeft>
	//   29   63:astore_1        
	//*  30   64:goto            37
		firstLeft = path$outrec;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:putfield        #54  <Field Path$OutRec firstLeft>
	//   34   72:return          
	}

	public Path.OutPt getPoints()
	{
		return pts;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Path$OutPt pts>
	//    2    4:areturn         
	}

	public void setPoints(Path.OutPt outpt)
	{
		pts = outpt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Path$OutPt pts>
	//    3    5:return          
	}

	int Idx;
	Path.OutPt bottomPt;
	Path$OutRec firstLeft;
	boolean isHole;
	boolean isOpen;
	PolyNode polyNode;
	protected Path.OutPt pts;

	Path$OutRec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
