// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

// Referenced classes of package android.support.transition:
//			ChangeImageTransform

static final class ChangeImageTransform$1
	implements TypeEvaluator
{

	public Matrix a(float f, Matrix matrix, Matrix matrix1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (a(f, (Matrix)obj, (Matrix)obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #20  <Class Matrix>
	//    4    6:aload_3         
	//    5    7:checkcast       #20  <Class Matrix>
	//    6   10:invokevirtual   #22  <Method Matrix a(float, Matrix, Matrix)>
	//    7   13:areturn         
	}

	ChangeImageTransform$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
