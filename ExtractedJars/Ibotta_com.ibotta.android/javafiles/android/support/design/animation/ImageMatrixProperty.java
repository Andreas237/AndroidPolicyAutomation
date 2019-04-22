// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class ImageMatrixProperty extends Property
{

	public ImageMatrixProperty()
	{
		super(android/graphics/Matrix, "imageMatrixProperty");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <Class Matrix>
	//    2    3:ldc1            #13  <String "imageMatrixProperty">
	//    3    5:invokespecial   #16  <Method void Property(Class, String)>
	//    4    8:aload_0         
	//    5    9:new             #11  <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #18  <Method void Matrix()>
	//    8   16:putfield        #20  <Field Matrix matrix>
	//    9   19:return          
	}

	public Matrix get(ImageView imageview)
	{
		matrix.set(imageview.getImageMatrix());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Matrix matrix>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method Matrix ImageView.getImageMatrix()>
	//    4    8:invokevirtual   #33  <Method void Matrix.set(Matrix)>
		return matrix;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field Matrix matrix>
	//    7   15:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((ImageView)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class ImageView>
	//    3    5:invokevirtual   #36  <Method Matrix get(ImageView)>
	//    4    8:areturn         
	}

	public void set(ImageView imageview, Matrix matrix1)
	{
		imageview.setImageMatrix(matrix1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #40  <Method void ImageView.setImageMatrix(Matrix)>
	//    3    5:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((ImageView)obj, (Matrix)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class ImageView>
	//    3    5:aload_2         
	//    4    6:checkcast       #11  <Class Matrix>
	//    5    9:invokevirtual   #43  <Method void set(ImageView, Matrix)>
	//    6   12:return          
	}

	private final Matrix matrix = new Matrix();
}
