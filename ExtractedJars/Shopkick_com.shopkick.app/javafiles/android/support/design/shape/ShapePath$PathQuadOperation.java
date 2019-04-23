// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.graphics.Matrix;
import android.graphics.Path;

// Referenced classes of package android.support.design.shape:
//			ShapePath

public static class ShapePath$PathQuadOperation extends ShapePath.PathOperation
{

	public void applyToPath(Matrix matrix, Path path)
	{
		Matrix matrix1 = this.matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Matrix matrix>
	//    2    4:astore_3        
		matrix.invert(matrix1);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #29  <Method boolean Matrix.invert(Matrix)>
	//    6   10:pop             
		path.transform(matrix1);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #35  <Method void Path.transform(Matrix)>
		path.quadTo(controlX, controlY, endX, endY);
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #37  <Field float controlX>
	//   13   21:aload_0         
	//   14   22:getfield        #39  <Field float controlY>
	//   15   25:aload_0         
	//   16   26:getfield        #41  <Field float endX>
	//   17   29:aload_0         
	//   18   30:getfield        #43  <Field float endY>
	//   19   33:invokevirtual   #47  <Method void Path.quadTo(float, float, float, float)>
		path.transform(matrix);
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #35  <Method void Path.transform(Matrix)>
	//   23   41:return          
	}

	public float controlX;
	public float controlY;
	public float endX;
	public float endY;

	public ShapePath$PathQuadOperation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ShapePath$PathOperation()>
	//    2    4:return          
	}
}
