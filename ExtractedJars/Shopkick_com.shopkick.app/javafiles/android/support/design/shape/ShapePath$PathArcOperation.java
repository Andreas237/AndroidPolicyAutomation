// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.graphics.*;

// Referenced classes of package android.support.design.shape:
//			ShapePath

public static class ShapePath$PathArcOperation extends ShapePath.PathOperation
{

	public void applyToPath(Matrix matrix, Path path)
	{
		Matrix matrix1 = this.matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Matrix matrix>
	//    2    4:astore_3        
		matrix.invert(matrix1);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #48  <Method boolean Matrix.invert(Matrix)>
	//    6   10:pop             
		path.transform(matrix1);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #54  <Method void Path.transform(Matrix)>
		rectF.set(left, top, right, bottom);
	//   10   16:getstatic       #25  <Field RectF rectF>
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field float left>
	//   13   23:aload_0         
	//   14   24:getfield        #32  <Field float top>
	//   15   27:aload_0         
	//   16   28:getfield        #34  <Field float right>
	//   17   31:aload_0         
	//   18   32:getfield        #36  <Field float bottom>
	//   19   35:invokevirtual   #57  <Method void RectF.set(float, float, float, float)>
		path.arcTo(rectF, startAngle, sweepAngle, false);
	//   20   38:aload_2         
	//   21   39:getstatic       #25  <Field RectF rectF>
	//   22   42:aload_0         
	//   23   43:getfield        #59  <Field float startAngle>
	//   24   46:aload_0         
	//   25   47:getfield        #61  <Field float sweepAngle>
	//   26   50:iconst_0        
	//   27   51:invokevirtual   #65  <Method void Path.arcTo(RectF, float, float, boolean)>
		path.transform(matrix);
	//   28   54:aload_2         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #54  <Method void Path.transform(Matrix)>
	//   31   59:return          
	}

	private static final RectF rectF = new RectF();
	public float bottom;
	public float left;
	public float right;
	public float startAngle;
	public float sweepAngle;
	public float top;

	static 
	{
	//    0    0:new             #20  <Class RectF>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RectF()>
	//    3    7:putstatic       #25  <Field RectF rectF>
	//*   4   10:return          
	}

	public ShapePath$PathArcOperation(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ShapePath$PathOperation()>
		left = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #30  <Field float left>
		top = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #32  <Field float top>
		right = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #34  <Field float right>
		bottom = f3;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #36  <Field float bottom>
	//   14   25:return          
	}
}
