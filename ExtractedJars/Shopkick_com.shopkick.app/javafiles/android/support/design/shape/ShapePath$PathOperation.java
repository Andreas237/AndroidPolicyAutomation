// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.graphics.Matrix;
import android.graphics.Path;

// Referenced classes of package android.support.design.shape:
//			ShapePath

public static abstract class ShapePath$PathOperation
{

	public abstract void applyToPath(Matrix matrix1, Path path);

	protected final Matrix matrix = new Matrix();

	public ShapePath$PathOperation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Matrix()>
	//    6   12:putfield        #18  <Field Matrix matrix>
	//    7   15:return          
	}
}
