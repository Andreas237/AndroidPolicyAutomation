// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			CornerTreatment, ShapePath

public class CutCornerTreatment extends CornerTreatment
{

	public CutCornerTreatment(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CornerTreatment()>
		size = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #16  <Field float size>
	//    5    9:return          
	}

	public void getCornerPath(float f, float f1, ShapePath shapepath)
	{
		shapepath.reset(0.0F, size * f1);
	//    0    0:aload_3         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field float size>
	//    4    6:fload_2         
	//    5    7:fmul            
	//    6    8:invokevirtual   #25  <Method void ShapePath.reset(float, float)>
		double d = f;
	//    7   11:fload_1         
	//    8   12:f2d             
	//    9   13:dstore          4
		double d1 = Math.sin(d);
	//   10   15:dload           4
	//   11   17:invokestatic    #31  <Method double Math.sin(double)>
	//   12   20:dstore          6
		double d2 = size;
	//   13   22:aload_0         
	//   14   23:getfield        #16  <Field float size>
	//   15   26:f2d             
	//   16   27:dstore          8
		double d3 = f1;
	//   17   29:fload_2         
	//   18   30:f2d             
	//   19   31:dstore          10
		shapepath.lineTo((float)(d1 * d2 * d3), (float)(Math.cos(d) * (double)size * d3));
	//   20   33:aload_3         
	//   21   34:dload           6
	//   22   36:dload           8
	//   23   38:dmul            
	//   24   39:dload           10
	//   25   41:dmul            
	//   26   42:d2f             
	//   27   43:dload           4
	//   28   45:invokestatic    #34  <Method double Math.cos(double)>
	//   29   48:aload_0         
	//   30   49:getfield        #16  <Field float size>
	//   31   52:f2d             
	//   32   53:dmul            
	//   33   54:dload           10
	//   34   56:dmul            
	//   35   57:d2f             
	//   36   58:invokevirtual   #37  <Method void ShapePath.lineTo(float, float)>
	//   37   61:return          
	}

	private final float size;
}
