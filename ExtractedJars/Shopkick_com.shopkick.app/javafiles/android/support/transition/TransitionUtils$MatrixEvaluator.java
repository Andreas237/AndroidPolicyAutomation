// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

// Referenced classes of package android.support.transition:
//			TransitionUtils

static class TransitionUtils$MatrixEvaluator
	implements TypeEvaluator
{

	public Matrix evaluate(float f, Matrix matrix, Matrix matrix1)
	{
		matrix.getValues(mTempStartValues);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field float[] mTempStartValues>
	//    3    5:invokevirtual   #35  <Method void Matrix.getValues(float[])>
		matrix1.getValues(mTempEndValues);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field float[] mTempEndValues>
	//    7   13:invokevirtual   #35  <Method void Matrix.getValues(float[])>
		for(int i = 0; i < 9; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore          6
	//*  10   19:iload           6
	//*  11   21:bipush          9
	//*  12   23:icmpge          73
		{
			matrix = ((Matrix) (mTempEndValues));
	//   13   26:aload_0         
	//   14   27:getfield        #23  <Field float[] mTempEndValues>
	//   15   30:astore_2        
			float f1 = matrix[i];
	//   16   31:aload_2         
	//   17   32:iload           6
	//   18   34:faload          
	//   19   35:fstore          4
			matrix1 = ((Matrix) (mTempStartValues));
	//   20   37:aload_0         
	//   21   38:getfield        #21  <Field float[] mTempStartValues>
	//   22   41:astore_3        
			float f2 = matrix1[i];
	//   23   42:aload_3         
	//   24   43:iload           6
	//   25   45:faload          
	//   26   46:fstore          5
			matrix[i] = matrix1[i] + (f1 - f2) * f;
	//   27   48:aload_2         
	//   28   49:iload           6
	//   29   51:aload_3         
	//   30   52:iload           6
	//   31   54:faload          
	//   32   55:fload           4
	//   33   57:fload           5
	//   34   59:fsub            
	//   35   60:fload_1         
	//   36   61:fmul            
	//   37   62:fadd            
	//   38   63:fastore         
		}

	//   39   64:iload           6
	//   40   66:iconst_1        
	//   41   67:iadd            
	//   42   68:istore          6
	//*  43   70:goto            19
		mTempMatrix.setValues(mTempEndValues);
	//   44   73:aload_0         
	//   45   74:getfield        #28  <Field Matrix mTempMatrix>
	//   46   77:aload_0         
	//   47   78:getfield        #23  <Field float[] mTempEndValues>
	//   48   81:invokevirtual   #38  <Method void Matrix.setValues(float[])>
		return mTempMatrix;
	//   49   84:aload_0         
	//   50   85:getfield        #28  <Field Matrix mTempMatrix>
	//   51   88:areturn         
	}

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (Matrix)obj, (Matrix)obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #25  <Class Matrix>
	//    4    6:aload_3         
	//    5    7:checkcast       #25  <Class Matrix>
	//    6   10:invokevirtual   #41  <Method Matrix evaluate(float, Matrix, Matrix)>
	//    7   13:areturn         
	}

	final float mTempEndValues[] = new float[9];
	final Matrix mTempMatrix = new Matrix();
	final float mTempStartValues[] = new float[9];

	TransitionUtils$MatrixEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:newarray        float[]
	//    5    9:putfield        #21  <Field float[] mTempStartValues>
	//    6   12:aload_0         
	//    7   13:bipush          9
	//    8   15:newarray        float[]
	//    9   17:putfield        #23  <Field float[] mTempEndValues>
	//   10   20:aload_0         
	//   11   21:new             #25  <Class Matrix>
	//   12   24:dup             
	//   13   25:invokespecial   #26  <Method void Matrix()>
	//   14   28:putfield        #28  <Field Matrix mTempMatrix>
	//   15   31:return          
	}
}
