// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.graphics.*;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ViewUtils

class TransitionUtils
{
	static class MatrixEvaluator
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
				mTempEndValues[i] = mTempStartValues[i] + f * (f1 - f2);
		//   23   44:aload_0         
		//   24   45:getfield        #23  <Field float[] mTempEndValues>
		//   25   48:iload           6
		//   26   50:aload_0         
		//   27   51:getfield        #21  <Field float[] mTempStartValues>
		//   28   54:iload           6
		//   29   56:faload          
		//   30   57:fload_1         
		//   31   58:fload           4
		//   32   60:fload           5
		//   33   62:fsub            
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

		MatrixEvaluator()
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


	TransitionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	static View copyViewImage(ViewGroup viewgroup, View view, View view1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #19  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Matrix()>
	//    3    7:astore          7
		matrix.setTranslate(-view1.getScrollX(), -view1.getScrollY());
	//    4    9:aload           7
	//    5   11:aload_2         
	//    6   12:invokevirtual   #26  <Method int View.getScrollX()>
	//    7   15:ineg            
	//    8   16:i2f             
	//    9   17:aload_2         
	//   10   18:invokevirtual   #29  <Method int View.getScrollY()>
	//   11   21:ineg            
	//   12   22:i2f             
	//   13   23:invokevirtual   #33  <Method void Matrix.setTranslate(float, float)>
		ViewUtils.transformMatrixToGlobal(view, matrix);
	//   14   26:aload_1         
	//   15   27:aload           7
	//   16   29:invokestatic    #39  <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
		ViewUtils.transformMatrixToLocal(((View) (viewgroup)), matrix);
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:invokestatic    #42  <Method void ViewUtils.transformMatrixToLocal(View, Matrix)>
		view1 = ((View) (new RectF(0.0F, 0.0F, view.getWidth(), view.getHeight())));
	//   20   38:new             #44  <Class RectF>
	//   21   41:dup             
	//   22   42:fconst_0        
	//   23   43:fconst_0        
	//   24   44:aload_1         
	//   25   45:invokevirtual   #47  <Method int View.getWidth()>
	//   26   48:i2f             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #50  <Method int View.getHeight()>
	//   29   53:i2f             
	//   30   54:invokespecial   #53  <Method void RectF(float, float, float, float)>
	//   31   57:astore_2        
		matrix.mapRect(((RectF) (view1)));
	//   32   58:aload           7
	//   33   60:aload_2         
	//   34   61:invokevirtual   #57  <Method boolean Matrix.mapRect(RectF)>
	//   35   64:pop             
		int i = Math.round(((RectF) (view1)).left);
	//   36   65:aload_2         
	//   37   66:getfield        #61  <Field float RectF.left>
	//   38   69:invokestatic    #67  <Method int Math.round(float)>
	//   39   72:istore_3        
		int j = Math.round(((RectF) (view1)).top);
	//   40   73:aload_2         
	//   41   74:getfield        #70  <Field float RectF.top>
	//   42   77:invokestatic    #67  <Method int Math.round(float)>
	//   43   80:istore          4
		int k = Math.round(((RectF) (view1)).right);
	//   44   82:aload_2         
	//   45   83:getfield        #73  <Field float RectF.right>
	//   46   86:invokestatic    #67  <Method int Math.round(float)>
	//   47   89:istore          5
		int l = Math.round(((RectF) (view1)).bottom);
	//   48   91:aload_2         
	//   49   92:getfield        #76  <Field float RectF.bottom>
	//   50   95:invokestatic    #67  <Method int Math.round(float)>
	//   51   98:istore          6
		viewgroup = ((ViewGroup) (new ImageView(view.getContext())));
	//   52  100:new             #78  <Class ImageView>
	//   53  103:dup             
	//   54  104:aload_1         
	//   55  105:invokevirtual   #82  <Method android.content.Context View.getContext()>
	//   56  108:invokespecial   #85  <Method void ImageView(android.content.Context)>
	//   57  111:astore_0        
		((ImageView) (viewgroup)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   58  112:aload_0         
	//   59  113:getstatic       #91  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   60  116:invokevirtual   #95  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		view = ((View) (createViewBitmap(view, matrix, ((RectF) (view1)))));
	//   61  119:aload_1         
	//   62  120:aload           7
	//   63  122:aload_2         
	//   64  123:invokestatic    #99  <Method Bitmap createViewBitmap(View, Matrix, RectF)>
	//   65  126:astore_1        
		if(view != null)
	//*  66  127:aload_1         
	//*  67  128:ifnull          136
			((ImageView) (viewgroup)).setImageBitmap(((Bitmap) (view)));
	//   68  131:aload_0         
	//   69  132:aload_1         
	//   70  133:invokevirtual   #103 <Method void ImageView.setImageBitmap(Bitmap)>
		((ImageView) (viewgroup)).measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l - j, 0x40000000));
	//   71  136:aload_0         
	//   72  137:iload           5
	//   73  139:iload_3         
	//   74  140:isub            
	//   75  141:ldc1            #104 <Int 0x40000000>
	//   76  143:invokestatic    #110 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   77  146:iload           6
	//   78  148:iload           4
	//   79  150:isub            
	//   80  151:ldc1            #104 <Int 0x40000000>
	//   81  153:invokestatic    #110 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   82  156:invokevirtual   #114 <Method void ImageView.measure(int, int)>
		((ImageView) (viewgroup)).layout(i, j, k, l);
	//   83  159:aload_0         
	//   84  160:iload_3         
	//   85  161:iload           4
	//   86  163:iload           5
	//   87  165:iload           6
	//   88  167:invokevirtual   #118 <Method void ImageView.layout(int, int, int, int)>
		return ((View) (viewgroup));
	//   89  170:aload_0         
	//   90  171:areturn         
	}

	private static Bitmap createViewBitmap(View view, Matrix matrix, RectF rectf)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		int j = Math.round(rectf.width());
	//    2    3:aload_2         
	//    3    4:invokevirtual   #122 <Method float RectF.width()>
	//    4    7:invokestatic    #67  <Method int Math.round(float)>
	//    5   10:istore          5
		int i = Math.round(rectf.height());
	//    6   12:aload_2         
	//    7   13:invokevirtual   #125 <Method float RectF.height()>
	//    8   16:invokestatic    #67  <Method int Math.round(float)>
	//    9   19:istore          4
		Bitmap bitmap = ((Bitmap) (obj));
	//   10   21:aload           7
	//   11   23:astore          6
		if(j > 0)
	//*  12   25:iload           5
	//*  13   27:ifle            123
		{
			bitmap = ((Bitmap) (obj));
	//   14   30:aload           7
	//   15   32:astore          6
			if(i > 0)
	//*  16   34:iload           4
	//*  17   36:ifle            123
			{
				float f = Math.min(1.0F, 1048576F / (float)(j * i));
	//   18   39:fconst_1        
	//   19   40:ldc1            #126 <Float 1048576F>
	//   20   42:iload           5
	//   21   44:iload           4
	//   22   46:imul            
	//   23   47:i2f             
	//   24   48:fdiv            
	//   25   49:invokestatic    #130 <Method float Math.min(float, float)>
	//   26   52:fstore_3        
				j = (int)((float)j * f);
	//   27   53:iload           5
	//   28   55:i2f             
	//   29   56:fload_3         
	//   30   57:fmul            
	//   31   58:f2i             
	//   32   59:istore          5
				i = (int)((float)i * f);
	//   33   61:iload           4
	//   34   63:i2f             
	//   35   64:fload_3         
	//   36   65:fmul            
	//   37   66:f2i             
	//   38   67:istore          4
				matrix.postTranslate(-rectf.left, -rectf.top);
	//   39   69:aload_1         
	//   40   70:aload_2         
	//   41   71:getfield        #61  <Field float RectF.left>
	//   42   74:fneg            
	//   43   75:aload_2         
	//   44   76:getfield        #70  <Field float RectF.top>
	//   45   79:fneg            
	//   46   80:invokevirtual   #134 <Method boolean Matrix.postTranslate(float, float)>
	//   47   83:pop             
				matrix.postScale(f, f);
	//   48   84:aload_1         
	//   49   85:fload_3         
	//   50   86:fload_3         
	//   51   87:invokevirtual   #137 <Method boolean Matrix.postScale(float, float)>
	//   52   90:pop             
				bitmap = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   53   91:iload           5
	//   54   93:iload           4
	//   55   95:getstatic       #143 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   56   98:invokestatic    #149 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   57  101:astore          6
				rectf = ((RectF) (new Canvas(bitmap)));
	//   58  103:new             #151 <Class Canvas>
	//   59  106:dup             
	//   60  107:aload           6
	//   61  109:invokespecial   #153 <Method void Canvas(Bitmap)>
	//   62  112:astore_2        
				((Canvas) (rectf)).concat(matrix);
	//   63  113:aload_2         
	//   64  114:aload_1         
	//   65  115:invokevirtual   #157 <Method void Canvas.concat(Matrix)>
				view.draw(((Canvas) (rectf)));
	//   66  118:aload_0         
	//   67  119:aload_2         
	//   68  120:invokevirtual   #161 <Method void View.draw(Canvas)>
			}
		}
		return bitmap;
	//   69  123:aload           6
	//   70  125:areturn         
	}

	static Animator mergeAnimators(Animator animator, Animator animator1)
	{
		if(animator == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return animator1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(animator1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
		{
			return animator;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			AnimatorSet animatorset = new AnimatorSet();
	//    8   12:new             #165 <Class AnimatorSet>
	//    9   15:dup             
	//   10   16:invokespecial   #166 <Method void AnimatorSet()>
	//   11   19:astore_2        
			animatorset.playTogether(new Animator[] {
				animator, animator1
			});
	//   12   20:aload_2         
	//   13   21:iconst_2        
	//   14   22:anewarray       Animator[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:aload_0         
	//   18   28:aastore         
	//   19   29:dup             
	//   20   30:iconst_1        
	//   21   31:aload_1         
	//   22   32:aastore         
	//   23   33:invokevirtual   #172 <Method void AnimatorSet.playTogether(Animator[])>
			return ((Animator) (animatorset));
	//   24   36:aload_2         
	//   25   37:areturn         
		}
	}

	private static final int MAX_IMAGE_SIZE = 0x100000;
}
