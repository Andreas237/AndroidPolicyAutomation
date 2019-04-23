// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform, ViewUtils

private static class ChangeTransform$PathAnimatorMatrix
{

	private void setAnimationMatrix()
	{
		float af[] = mValues;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float[] mValues>
	//    2    4:astore_1        
		af[2] = mTranslationX;
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field float mTranslationX>
	//    7   11:fastore         
		af[5] = mTranslationY;
	//    8   12:aload_1         
	//    9   13:iconst_5        
	//   10   14:aload_0         
	//   11   15:getfield        #39  <Field float mTranslationY>
	//   12   18:fastore         
		mMatrix.setValues(af);
	//   13   19:aload_0         
	//   14   20:getfield        #26  <Field Matrix mMatrix>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #47  <Method void Matrix.setValues(float[])>
		ViewUtils.setAnimationMatrix(mView, mMatrix);
	//   17   27:aload_0         
	//   18   28:getfield        #28  <Field View mView>
	//   19   31:aload_0         
	//   20   32:getfield        #26  <Field Matrix mMatrix>
	//   21   35:invokestatic    #52  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
	//   22   38:return          
	}

	Matrix getMatrix()
	{
		return mMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Matrix mMatrix>
	//    2    4:areturn         
	}

	void setTranslation(PointF pointf)
	{
		mTranslationX = pointf.x;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #61  <Field float PointF.x>
	//    3    5:putfield        #37  <Field float mTranslationX>
		mTranslationY = pointf.y;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #64  <Field float PointF.y>
	//    7   13:putfield        #39  <Field float mTranslationY>
		setAnimationMatrix();
	//    8   16:aload_0         
	//    9   17:invokespecial   #42  <Method void setAnimationMatrix()>
	//   10   20:return          
	}

	void setValues(float af[])
	{
		System.arraycopy(((Object) (af)), 0, ((Object) (mValues)), 0, af.length);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field float[] mValues>
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
		setAnimationMatrix();
	//    8   12:aload_0         
	//    9   13:invokespecial   #42  <Method void setAnimationMatrix()>
	//   10   16:return          
	}

	private final Matrix mMatrix = new Matrix();
	private float mTranslationX;
	private float mTranslationY;
	private final float mValues[];
	private final View mView;

	ChangeTransform$PathAnimatorMatrix(View view, float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void Matrix()>
	//    6   12:putfield        #26  <Field Matrix mMatrix>
		mView = view;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #28  <Field View mView>
		mValues = (float[])((float []) (af)).clone();
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #33  <Method Object _5B_F.clone()>
	//   13   25:checkcast       #29  <Class float[]>
	//   14   28:putfield        #35  <Field float[] mValues>
		view = ((View) (mValues));
	//   15   31:aload_0         
	//   16   32:getfield        #35  <Field float[] mValues>
	//   17   35:astore_1        
		mTranslationX = view[2];
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:iconst_2        
	//   21   39:faload          
	//   22   40:putfield        #37  <Field float mTranslationX>
		mTranslationY = view[5];
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:iconst_5        
	//   26   46:faload          
	//   27   47:putfield        #39  <Field float mTranslationY>
		setAnimationMatrix();
	//   28   50:aload_0         
	//   29   51:invokespecial   #42  <Method void setAnimationMatrix()>
	//   30   54:return          
	}
}
