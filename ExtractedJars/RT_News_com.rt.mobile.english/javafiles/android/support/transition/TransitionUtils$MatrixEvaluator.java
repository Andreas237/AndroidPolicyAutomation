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
	//*  12   23:icmpge          75
		{
			float f1 = mTempEndValues[i];
	//   13   26:aload_0         
	//   14   27:getfield        #23  <Field float[] mTempEndValues>
	//   15   30:iload           6
	//   16   32:faload          
	//   17   33:fstore          4
			float f2 = mTempStartValues[i];
	//   18   35:aload_0         
	//   19   36:getfield        #21  <Field float[] mTempStartValues>
	//   20   39:iload           6
	//   21   41:faload          
	//   22   42:fstore          5
			mTempEndValues[i] = mTempStartValues[i] + (f1 - f2) * f;
	//   23   44:aload_0         
	//   24   45:getfield        #23  <Field float[] mTempEndValues>
	//   25   48:iload           6
	//   26   50:aload_0         
	//   27   51:getfield        #21  <Field float[] mTempStartValues>
	//   28   54:iload           6
	//   29   56:faload          
	//   30   57:fload           4
	//   31   59:fload           5
	//   32   61:fsub            
	//   33   62:fload_1         
	//   34   63:fmul            
	//   35   64:fadd            
	//   36   65:fastore         
		}

	//   37   66:iload           6
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore          6
	//*  41   72:goto            19
		mTempMatrix.setValues(mTempEndValues);
	//   42   75:aload_0         
	//   43   76:getfield        #28  <Field Matrix mTempMatrix>
	//   44   79:aload_0         
	//   45   80:getfield        #23  <Field float[] mTempEndValues>
	//   46   83:invokevirtual   #38  <Method void Matrix.setValues(float[])>
		return mTempMatrix;
	//   47   86:aload_0         
	//   48   87:getfield        #28  <Field Matrix mTempMatrix>
	//   49   90:areturn         
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
