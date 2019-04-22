// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.graphics.Matrix;
import android.graphics.Path;

// Referenced classes of package android.support.design.shape:
//			ShapePath

public static class ShapePath$PathLineOperation extends ShapePath.PathOperation
{

	public void applyToPath(Matrix matrix, Path path)
	{
		Matrix matrix1 = this.matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Matrix matrix>
	//    2    4:astore_3        
		matrix.invert(matrix1);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #34  <Method boolean Matrix.invert(Matrix)>
	//    6   10:pop             
		path.transform(matrix1);
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #40  <Method void Path.transform(Matrix)>
		path.lineTo(x, y);
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #19  <Field float x>
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field float y>
	//   15   25:invokevirtual   #44  <Method void Path.lineTo(float, float)>
		path.transform(matrix);
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #40  <Method void Path.transform(Matrix)>
	//   19   33:return          
	}

	private float x;
	private float y;


/*
	static float access$002(ShapePath$PathLineOperation shapepath$pathlineoperation, float f)
	{
		shapepath$pathlineoperation.x = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float x>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/


/*
	static float access$102(ShapePath$PathLineOperation shapepath$pathlineoperation, float f)
	{
		shapepath$pathlineoperation.y = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float y>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/

	public ShapePath$PathLineOperation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ShapePath$PathOperation()>
	//    2    4:return          
	}
}
