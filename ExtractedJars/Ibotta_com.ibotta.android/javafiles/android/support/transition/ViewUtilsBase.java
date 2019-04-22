// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;

class ViewUtilsBase
{

	ViewUtilsBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public void clearNonTransitionAlpha(View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #18  <Method int View.getVisibility()>
	//*   2    4:ifne            15
			view.setTag(R.id.save_non_transition_alpha, ((Object) (null)));
	//    3    7:aload_1         
	//    4    8:getstatic       #24  <Field int R$id.save_non_transition_alpha>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #28  <Method void View.setTag(int, Object)>
	//    7   15:return          
	}

	public float getTransitionAlpha(View view)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #24  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #35  <Method Object View.getTag(int)>
	//    3    7:checkcast       #37  <Class Float>
	//    4   10:astore_2        
		if(float1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          25
			return view.getAlpha() / float1.floatValue();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #41  <Method float View.getAlpha()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #44  <Method float Float.floatValue()>
	//   11   23:fdiv            
	//   12   24:freturn         
		else
			return view.getAlpha();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #41  <Method float View.getAlpha()>
	//   15   29:freturn         
	}

	public void saveNonTransitionAlpha(View view)
	{
		if(view.getTag(R.id.save_non_transition_alpha) == null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #24  <Field int R$id.save_non_transition_alpha>
	//*   2    4:invokevirtual   #35  <Method Object View.getTag(int)>
	//*   3    7:ifnonnull       24
			view.setTag(R.id.save_non_transition_alpha, ((Object) (Float.valueOf(view.getAlpha()))));
	//    4   10:aload_1         
	//    5   11:getstatic       #24  <Field int R$id.save_non_transition_alpha>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #41  <Method float View.getAlpha()>
	//    8   18:invokestatic    #49  <Method Float Float.valueOf(float)>
	//    9   21:invokevirtual   #28  <Method void View.setTag(int, Object)>
	//   10   24:return          
	}

	public void setLeftTopRightBottom(View view, int i, int j, int k, int l)
	{
		view.setLeft(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #55  <Method void View.setLeft(int)>
		view.setTop(j);
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #58  <Method void View.setTop(int)>
		view.setRight(k);
	//    6   10:aload_1         
	//    7   11:iload           4
	//    8   13:invokevirtual   #61  <Method void View.setRight(int)>
		view.setBottom(l);
	//    9   16:aload_1         
	//   10   17:iload           5
	//   11   19:invokevirtual   #64  <Method void View.setBottom(int)>
	//   12   22:return          
	}

	public void setTransitionAlpha(View view, float f)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #24  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #35  <Method Object View.getTag(int)>
	//    3    7:checkcast       #37  <Class Float>
	//    4   10:astore_3        
		if(float1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          26
		{
			view.setAlpha(float1.floatValue() * f);
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #44  <Method float Float.floatValue()>
	//   10   20:fload_2         
	//   11   21:fmul            
	//   12   22:invokevirtual   #70  <Method void View.setAlpha(float)>
			return;
	//   13   25:return          
		} else
		{
			view.setAlpha(f);
	//   14   26:aload_1         
	//   15   27:fload_2         
	//   16   28:invokevirtual   #70  <Method void View.setAlpha(float)>
			return;
	//   17   31:return          
		}
	}

	public void transformMatrixToGlobal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #14  <Class View>
	//*   5    9:ifeq            40
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #14  <Class View>
	//    8   16:astore_3        
			transformMatrixToGlobal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #78  <Method void transformMatrixToGlobal(View, Matrix)>
			matrix.preTranslate(-((View) (obj)).getScrollX(), -((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #81  <Method int View.getScrollX()>
	//   16   28:ineg            
	//   17   29:i2f             
	//   18   30:aload_3         
	//   19   31:invokevirtual   #84  <Method int View.getScrollY()>
	//   20   34:ineg            
	//   21   35:i2f             
	//   22   36:invokevirtual   #90  <Method boolean Matrix.preTranslate(float, float)>
	//   23   39:pop             
		}
		matrix.preTranslate(view.getLeft(), view.getTop());
	//   24   40:aload_2         
	//   25   41:aload_1         
	//   26   42:invokevirtual   #93  <Method int View.getLeft()>
	//   27   45:i2f             
	//   28   46:aload_1         
	//   29   47:invokevirtual   #96  <Method int View.getTop()>
	//   30   50:i2f             
	//   31   51:invokevirtual   #90  <Method boolean Matrix.preTranslate(float, float)>
	//   32   54:pop             
		view = ((View) (view.getMatrix()));
	//   33   55:aload_1         
	//   34   56:invokevirtual   #100 <Method Matrix View.getMatrix()>
	//   35   59:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  36   60:aload_1         
	//*  37   61:invokevirtual   #104 <Method boolean Matrix.isIdentity()>
	//*  38   64:ifne            73
			matrix.preConcat(((Matrix) (view)));
	//   39   67:aload_2         
	//   40   68:aload_1         
	//   41   69:invokevirtual   #108 <Method boolean Matrix.preConcat(Matrix)>
	//   42   72:pop             
	//   43   73:return          
	}

	public void transformMatrixToLocal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #14  <Class View>
	//*   5    9:ifeq            38
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #14  <Class View>
	//    8   16:astore_3        
			transformMatrixToLocal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #111 <Method void transformMatrixToLocal(View, Matrix)>
			matrix.postTranslate(((View) (obj)).getScrollX(), ((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #81  <Method int View.getScrollX()>
	//   16   28:i2f             
	//   17   29:aload_3         
	//   18   30:invokevirtual   #84  <Method int View.getScrollY()>
	//   19   33:i2f             
	//   20   34:invokevirtual   #114 <Method boolean Matrix.postTranslate(float, float)>
	//   21   37:pop             
		}
		matrix.postTranslate(view.getLeft(), view.getTop());
	//   22   38:aload_2         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #93  <Method int View.getLeft()>
	//   25   43:i2f             
	//   26   44:aload_1         
	//   27   45:invokevirtual   #96  <Method int View.getTop()>
	//   28   48:i2f             
	//   29   49:invokevirtual   #114 <Method boolean Matrix.postTranslate(float, float)>
	//   30   52:pop             
		view = ((View) (view.getMatrix()));
	//   31   53:aload_1         
	//   32   54:invokevirtual   #100 <Method Matrix View.getMatrix()>
	//   33   57:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  34   58:aload_1         
	//*  35   59:invokevirtual   #104 <Method boolean Matrix.isIdentity()>
	//*  36   62:ifne            87
		{
			Matrix matrix1 = new Matrix();
	//   37   65:new             #86  <Class Matrix>
	//   38   68:dup             
	//   39   69:invokespecial   #115 <Method void Matrix()>
	//   40   72:astore_3        
			if(((Matrix) (view)).invert(matrix1))
	//*  41   73:aload_1         
	//*  42   74:aload_3         
	//*  43   75:invokevirtual   #118 <Method boolean Matrix.invert(Matrix)>
	//*  44   78:ifeq            87
				matrix.postConcat(matrix1);
	//   45   81:aload_2         
	//   46   82:aload_3         
	//   47   83:invokevirtual   #121 <Method boolean Matrix.postConcat(Matrix)>
	//   48   86:pop             
		}
	//   49   87:return          
	}
}
