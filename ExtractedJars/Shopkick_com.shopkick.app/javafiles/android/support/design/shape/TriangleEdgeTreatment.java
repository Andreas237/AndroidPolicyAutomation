// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			EdgeTreatment, ShapePath

public class TriangleEdgeTreatment extends EdgeTreatment
{

	public TriangleEdgeTreatment(float f, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void EdgeTreatment()>
		size = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #18  <Field float size>
		inside = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean inside>
	//    8   14:return          
	}

	public void getEdgePath(float f, float f1, ShapePath shapepath)
	{
		float f3 = f / 2.0F;
	//    0    0:fload_1         
	//    1    1:fconst_2        
	//    2    2:fdiv            
	//    3    3:fstore          5
		shapepath.lineTo(f3 - size * f1, 0.0F);
	//    4    5:aload_3         
	//    5    6:fload           5
	//    6    8:aload_0         
	//    7    9:getfield        #18  <Field float size>
	//    8   12:fload_2         
	//    9   13:fmul            
	//   10   14:fsub            
	//   11   15:fconst_0        
	//   12   16:invokevirtual   #29  <Method void ShapePath.lineTo(float, float)>
		float f2;
		if(inside)
	//*  13   19:aload_0         
	//*  14   20:getfield        #20  <Field boolean inside>
	//*  15   23:ifeq            35
			f2 = size;
	//   16   26:aload_0         
	//   17   27:getfield        #18  <Field float size>
	//   18   30:fstore          4
		else
	//*  19   32:goto            42
			f2 = -size;
	//   20   35:aload_0         
	//   21   36:getfield        #18  <Field float size>
	//   22   39:fneg            
	//   23   40:fstore          4
		shapepath.lineTo(f3, f2 * f1);
	//   24   42:aload_3         
	//   25   43:fload           5
	//   26   45:fload           4
	//   27   47:fload_2         
	//   28   48:fmul            
	//   29   49:invokevirtual   #29  <Method void ShapePath.lineTo(float, float)>
		shapepath.lineTo(f3 + size * f1, 0.0F);
	//   30   52:aload_3         
	//   31   53:fload           5
	//   32   55:aload_0         
	//   33   56:getfield        #18  <Field float size>
	//   34   59:fload_2         
	//   35   60:fmul            
	//   36   61:fadd            
	//   37   62:fconst_0        
	//   38   63:invokevirtual   #29  <Method void ShapePath.lineTo(float, float)>
		shapepath.lineTo(f, 0.0F);
	//   39   66:aload_3         
	//   40   67:fload_1         
	//   41   68:fconst_0        
	//   42   69:invokevirtual   #29  <Method void ShapePath.lineTo(float, float)>
	//   43   72:return          
	}

	private final boolean inside;
	private final float size;
}
