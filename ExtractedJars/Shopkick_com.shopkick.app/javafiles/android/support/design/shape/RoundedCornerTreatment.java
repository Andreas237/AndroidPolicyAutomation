// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			CornerTreatment, ShapePath

public class RoundedCornerTreatment extends CornerTreatment
{

	public RoundedCornerTreatment(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CornerTreatment()>
		radius = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #16  <Field float radius>
	//    5    9:return          
	}

	public void getCornerPath(float f, float f1, ShapePath shapepath)
	{
		shapepath.reset(0.0F, radius * f1);
	//    0    0:aload_3         
	//    1    1:fconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field float radius>
	//    4    6:fload_2         
	//    5    7:fmul            
	//    6    8:invokevirtual   #25  <Method void ShapePath.reset(float, float)>
		float f2 = radius;
	//    7   11:aload_0         
	//    8   12:getfield        #16  <Field float radius>
	//    9   15:fstore          4
		shapepath.addArc(0.0F, 0.0F, f2 * 2.0F * f1, f2 * 2.0F * f1, f + 180F, 90F);
	//   10   17:aload_3         
	//   11   18:fconst_0        
	//   12   19:fconst_0        
	//   13   20:fload           4
	//   14   22:fconst_2        
	//   15   23:fmul            
	//   16   24:fload_2         
	//   17   25:fmul            
	//   18   26:fload           4
	//   19   28:fconst_2        
	//   20   29:fmul            
	//   21   30:fload_2         
	//   22   31:fmul            
	//   23   32:fload_1         
	//   24   33:ldc1            #26  <Float 180F>
	//   25   35:fadd            
	//   26   36:ldc1            #27  <Float 90F>
	//   27   38:invokevirtual   #31  <Method void ShapePath.addArc(float, float, float, float, float, float)>
	//   28   41:return          
	}

	private final float radius;
}
