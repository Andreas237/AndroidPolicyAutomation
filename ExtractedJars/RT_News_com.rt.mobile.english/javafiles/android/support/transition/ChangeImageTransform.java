// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, ImageViewUtils, MatrixUtils

public class ChangeImageTransform extends Transition
{

	public ChangeImageTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Transition()>
	//    2    4:return          
	}

	public ChangeImageTransform(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void Transition(Context, AttributeSet)>
	//    4    6:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #58  <Field View TransitionValues.view>
	//    2    4:astore_2        
		if(view instanceof ImageView)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #60  <Class ImageView>
	//*   5    9:ifeq            84
		{
			if(view.getVisibility() != 0)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #66  <Method int View.getVisibility()>
	//*   8   16:ifeq            20
				return;
	//    9   19:return          
			ImageView imageview = (ImageView)view;
	//   10   20:aload_2         
	//   11   21:checkcast       #60  <Class ImageView>
	//   12   24:astore_3        
			if(imageview.getDrawable() == null)
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//*  15   29:ifnonnull       33
			{
				return;
	//   16   32:return          
			} else
			{
				transitionvalues = ((TransitionValues) (transitionvalues.values));
	//   17   33:aload_1         
	//   18   34:getfield        #74  <Field Map TransitionValues.values>
	//   19   37:astore_1        
				((Map) (transitionvalues)).put("android:changeImageTransform:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   20   38:aload_1         
	//   21   39:ldc1            #20  <String "android:changeImageTransform:bounds">
	//   22   41:new             #76  <Class Rect>
	//   23   44:dup             
	//   24   45:aload_2         
	//   25   46:invokevirtual   #79  <Method int View.getLeft()>
	//   26   49:aload_2         
	//   27   50:invokevirtual   #82  <Method int View.getTop()>
	//   28   53:aload_2         
	//   29   54:invokevirtual   #85  <Method int View.getRight()>
	//   30   57:aload_2         
	//   31   58:invokevirtual   #88  <Method int View.getBottom()>
	//   32   61:invokespecial   #91  <Method void Rect(int, int, int, int)>
	//   33   64:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   34   69:pop             
				((Map) (transitionvalues)).put("android:changeImageTransform:matrix", ((Object) (copyImageMatrix(imageview))));
	//   35   70:aload_1         
	//   36   71:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   37   73:aload_3         
	//   38   74:invokestatic    #101 <Method Matrix copyImageMatrix(ImageView)>
	//   39   77:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   40   82:pop             
				return;
	//   41   83:return          
			}
		} else
		{
			return;
	//   42   84:return          
		}
	}

	private static Matrix centerCropMatrix(ImageView imageview)
	{
		Drawable drawable = imageview.getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//    2    4:astore          8
		int i = drawable.getIntrinsicWidth();
	//    3    6:aload           8
	//    4    8:invokevirtual   #107 <Method int Drawable.getIntrinsicWidth()>
	//    5   11:istore          6
		float f = imageview.getWidth();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #110 <Method int ImageView.getWidth()>
	//    8   17:i2f             
	//    9   18:fstore_1        
		float f1 = i;
	//   10   19:iload           6
	//   11   21:i2f             
	//   12   22:fstore_2        
		float f4 = f / f1;
	//   13   23:fload_1         
	//   14   24:fload_2         
	//   15   25:fdiv            
	//   16   26:fstore          5
		i = drawable.getIntrinsicHeight();
	//   17   28:aload           8
	//   18   30:invokevirtual   #113 <Method int Drawable.getIntrinsicHeight()>
	//   19   33:istore          6
		float f2 = imageview.getHeight();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #116 <Method int ImageView.getHeight()>
	//   22   39:i2f             
	//   23   40:fstore_3        
		float f3 = i;
	//   24   41:iload           6
	//   25   43:i2f             
	//   26   44:fstore          4
		f4 = Math.max(f4, f2 / f3);
	//   27   46:fload           5
	//   28   48:fload_3         
	//   29   49:fload           4
	//   30   51:fdiv            
	//   31   52:invokestatic    #122 <Method float Math.max(float, float)>
	//   32   55:fstore          5
		i = Math.round((f - f1 * f4) / 2.0F);
	//   33   57:fload_1         
	//   34   58:fload_2         
	//   35   59:fload           5
	//   36   61:fmul            
	//   37   62:fsub            
	//   38   63:fconst_2        
	//   39   64:fdiv            
	//   40   65:invokestatic    #126 <Method int Math.round(float)>
	//   41   68:istore          6
		int j = Math.round((f2 - f3 * f4) / 2.0F);
	//   42   70:fload_3         
	//   43   71:fload           4
	//   44   73:fload           5
	//   45   75:fmul            
	//   46   76:fsub            
	//   47   77:fconst_2        
	//   48   78:fdiv            
	//   49   79:invokestatic    #126 <Method int Math.round(float)>
	//   50   82:istore          7
		imageview = ((ImageView) (new Matrix()));
	//   51   84:new             #38  <Class Matrix>
	//   52   87:dup             
	//   53   88:invokespecial   #127 <Method void Matrix()>
	//   54   91:astore_0        
		((Matrix) (imageview)).postScale(f4, f4);
	//   55   92:aload_0         
	//   56   93:fload           5
	//   57   95:fload           5
	//   58   97:invokevirtual   #131 <Method boolean Matrix.postScale(float, float)>
	//   59  100:pop             
		((Matrix) (imageview)).postTranslate(i, j);
	//   60  101:aload_0         
	//   61  102:iload           6
	//   62  104:i2f             
	//   63  105:iload           7
	//   64  107:i2f             
	//   65  108:invokevirtual   #134 <Method boolean Matrix.postTranslate(float, float)>
	//   66  111:pop             
		return ((Matrix) (imageview));
	//   67  112:aload_0         
	//   68  113:areturn         
	}

	private static Matrix copyImageMatrix(ImageView imageview)
	{
		static class _cls3
		{

			static final int $SwitchMap$android$widget$ImageView$ScaleType[];

			static 
			{
				$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
			//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
			//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  10   23:getstatic       #31  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
			//*  11   26:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls3..SwitchMap.android.widget.ImageView.ScaleType[imageview.getScaleType().ordinal()])
	//*   0    0:getstatic       #138 <Field int[] ChangeImageTransform$3.$SwitchMap$android$widget$ImageView$ScaleType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #142 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*   3    7:invokevirtual   #147 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 2: default 32
	//	               1 49
	//	               2 44
		default:
			return new Matrix(imageview.getImageMatrix());
	//    6   32:new             #38  <Class Matrix>
	//    7   35:dup             
	//    8   36:aload_0         
	//    9   37:invokevirtual   #151 <Method Matrix ImageView.getImageMatrix()>
	//   10   40:invokespecial   #154 <Method void Matrix(Matrix)>
	//   11   43:areturn         

		case 2: // '\002'
			return centerCropMatrix(imageview);
	//   12   44:aload_0         
	//   13   45:invokestatic    #156 <Method Matrix centerCropMatrix(ImageView)>
	//   14   48:areturn         

		case 1: // '\001'
			return fitXYMatrix(imageview);
	//   15   49:aload_0         
	//   16   50:invokestatic    #159 <Method Matrix fitXYMatrix(ImageView)>
	//   17   53:areturn         
		}
	}

	private ObjectAnimator createMatrixAnimator(ImageView imageview, Matrix matrix, Matrix matrix1)
	{
		return ObjectAnimator.ofObject(((Object) (imageview)), ANIMATED_TRANSFORM_PROPERTY, ((TypeEvaluator) (new TransitionUtils.MatrixEvaluator())), ((Object []) (new Matrix[] {
			matrix, matrix1
		})));
	//    0    0:aload_1         
	//    1    1:getstatic       #45  <Field Property ANIMATED_TRANSFORM_PROPERTY>
	//    2    4:new             #163 <Class TransitionUtils$MatrixEvaluator>
	//    3    7:dup             
	//    4    8:invokespecial   #164 <Method void TransitionUtils$MatrixEvaluator()>
	//    5   11:iconst_2        
	//    6   12:anewarray       Matrix[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:aload_2         
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:aload_3         
	//   14   22:aastore         
	//   15   23:invokestatic    #170 <Method ObjectAnimator ObjectAnimator.ofObject(Object, Property, TypeEvaluator, Object[])>
	//   16   26:areturn         
	}

	private ObjectAnimator createNullAnimator(ImageView imageview)
	{
		return ObjectAnimator.ofObject(((Object) (imageview)), ANIMATED_TRANSFORM_PROPERTY, NULL_MATRIX_EVALUATOR, ((Object []) (new Matrix[] {
			null, null
		})));
	//    0    0:aload_1         
	//    1    1:getstatic       #45  <Field Property ANIMATED_TRANSFORM_PROPERTY>
	//    2    4:getstatic       #36  <Field TypeEvaluator NULL_MATRIX_EVALUATOR>
	//    3    7:iconst_2        
	//    4    8:anewarray       Matrix[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aconst_null     
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aconst_null     
	//   12   18:aastore         
	//   13   19:invokestatic    #170 <Method ObjectAnimator ObjectAnimator.ofObject(Object, Property, TypeEvaluator, Object[])>
	//   14   22:areturn         
	}

	private static Matrix fitXYMatrix(ImageView imageview)
	{
		Drawable drawable = imageview.getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//    2    4:astore_1        
		Matrix matrix = new Matrix();
	//    3    5:new             #38  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #127 <Method void Matrix()>
	//    6   12:astore_2        
		matrix.postScale((float)imageview.getWidth() / (float)drawable.getIntrinsicWidth(), (float)imageview.getHeight() / (float)drawable.getIntrinsicHeight());
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #110 <Method int ImageView.getWidth()>
	//   10   18:i2f             
	//   11   19:aload_1         
	//   12   20:invokevirtual   #107 <Method int Drawable.getIntrinsicWidth()>
	//   13   23:i2f             
	//   14   24:fdiv            
	//   15   25:aload_0         
	//   16   26:invokevirtual   #116 <Method int ImageView.getHeight()>
	//   17   29:i2f             
	//   18   30:aload_1         
	//   19   31:invokevirtual   #113 <Method int Drawable.getIntrinsicHeight()>
	//   20   34:i2f             
	//   21   35:fdiv            
	//   22   36:invokevirtual   #131 <Method boolean Matrix.postScale(float, float)>
	//   23   39:pop             
		return matrix;
	//   24   40:aload_2         
	//   25   41:areturn         
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          228
		{
			if(transitionvalues1 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
				return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
			viewgroup = ((ViewGroup) ((Rect)transitionvalues.values.get("android:changeImageTransform:bounds")));
	//    6   10:aload_2         
	//    7   11:getfield        #74  <Field Map TransitionValues.values>
	//    8   14:ldc1            #20  <String "android:changeImageTransform:bounds">
	//    9   16:invokeinterface #184 <Method Object Map.get(Object)>
	//   10   21:checkcast       #76  <Class Rect>
	//   11   24:astore_1        
			Rect rect = (Rect)transitionvalues1.values.get("android:changeImageTransform:bounds");
	//   12   25:aload_3         
	//   13   26:getfield        #74  <Field Map TransitionValues.values>
	//   14   29:ldc1            #20  <String "android:changeImageTransform:bounds">
	//   15   31:invokeinterface #184 <Method Object Map.get(Object)>
	//   16   36:checkcast       #76  <Class Rect>
	//   17   39:astore          7
			if(viewgroup != null)
	//*  18   41:aload_1         
	//*  19   42:ifnull          226
			{
				if(rect == null)
	//*  20   45:aload           7
	//*  21   47:ifnonnull       52
					return null;
	//   22   50:aconst_null     
	//   23   51:areturn         
				transitionvalues = ((TransitionValues) ((Matrix)transitionvalues.values.get("android:changeImageTransform:matrix")));
	//   24   52:aload_2         
	//   25   53:getfield        #74  <Field Map TransitionValues.values>
	//   26   56:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   27   58:invokeinterface #184 <Method Object Map.get(Object)>
	//   28   63:checkcast       #38  <Class Matrix>
	//   29   66:astore_2        
				Matrix matrix = (Matrix)transitionvalues1.values.get("android:changeImageTransform:matrix");
	//   30   67:aload_3         
	//   31   68:getfield        #74  <Field Map TransitionValues.values>
	//   32   71:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   33   73:invokeinterface #184 <Method Object Map.get(Object)>
	//   34   78:checkcast       #38  <Class Matrix>
	//   35   81:astore          6
				int i;
				if(transitionvalues == null && matrix == null || transitionvalues != null && ((Matrix) (transitionvalues)).equals(((Object) (matrix))))
	//*  36   83:aload_2         
	//*  37   84:ifnonnull       92
	//*  38   87:aload           6
	//*  39   89:ifnull          105
	//*  40   92:aload_2         
	//*  41   93:ifnull          111
	//*  42   96:aload_2         
	//*  43   97:aload           6
	//*  44   99:invokevirtual   #188 <Method boolean Matrix.equals(Object)>
	//*  45  102:ifeq            111
					i = 1;
	//   46  105:iconst_1        
	//   47  106:istore          4
				else
	//*  48  108:goto            114
					i = 0;
	//   49  111:iconst_0        
	//   50  112:istore          4
				if(((Rect) (viewgroup)).equals(((Object) (rect))) && i)
	//*  51  114:aload_1         
	//*  52  115:aload           7
	//*  53  117:invokevirtual   #189 <Method boolean Rect.equals(Object)>
	//*  54  120:ifeq            130
	//*  55  123:iload           4
	//*  56  125:ifeq            130
					return null;
	//   57  128:aconst_null     
	//   58  129:areturn         
				transitionvalues1 = ((TransitionValues) ((ImageView)transitionvalues1.view));
	//   59  130:aload_3         
	//   60  131:getfield        #58  <Field View TransitionValues.view>
	//   61  134:checkcast       #60  <Class ImageView>
	//   62  137:astore_3        
				viewgroup = ((ViewGroup) (((ImageView) (transitionvalues1)).getDrawable()));
	//   63  138:aload_3         
	//   64  139:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//   65  142:astore_1        
				i = ((Drawable) (viewgroup)).getIntrinsicWidth();
	//   66  143:aload_1         
	//   67  144:invokevirtual   #107 <Method int Drawable.getIntrinsicWidth()>
	//   68  147:istore          4
				int j = ((Drawable) (viewgroup)).getIntrinsicHeight();
	//   69  149:aload_1         
	//   70  150:invokevirtual   #113 <Method int Drawable.getIntrinsicHeight()>
	//   71  153:istore          5
				ImageViewUtils.startAnimateTransform(((ImageView) (transitionvalues1)));
	//   72  155:aload_3         
	//   73  156:invokestatic    #195 <Method void ImageViewUtils.startAnimateTransform(ImageView)>
				if(i != 0 && j != 0)
	//*  74  159:iload           4
	//*  75  161:ifeq            213
	//*  76  164:iload           5
	//*  77  166:ifne            172
	//*  78  169:goto            213
				{
					viewgroup = ((ViewGroup) (transitionvalues));
	//   79  172:aload_2         
	//   80  173:astore_1        
					if(transitionvalues == null)
	//*  81  174:aload_2         
	//*  82  175:ifnonnull       182
						viewgroup = ((ViewGroup) (MatrixUtils.IDENTITY_MATRIX));
	//   83  178:getstatic       #201 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   84  181:astore_1        
					transitionvalues = ((TransitionValues) (matrix));
	//   85  182:aload           6
	//   86  184:astore_2        
					if(matrix == null)
	//*  87  185:aload           6
	//*  88  187:ifnonnull       194
						transitionvalues = ((TransitionValues) (MatrixUtils.IDENTITY_MATRIX));
	//   89  190:getstatic       #201 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   90  193:astore_2        
					ANIMATED_TRANSFORM_PROPERTY.set(((Object) (transitionvalues1)), ((Object) (viewgroup)));
	//   91  194:getstatic       #45  <Field Property ANIMATED_TRANSFORM_PROPERTY>
	//   92  197:aload_3         
	//   93  198:aload_1         
	//   94  199:invokevirtual   #207 <Method void Property.set(Object, Object)>
					viewgroup = ((ViewGroup) (createMatrixAnimator(((ImageView) (transitionvalues1)), ((Matrix) (viewgroup)), ((Matrix) (transitionvalues)))));
	//   95  202:aload_0         
	//   96  203:aload_3         
	//   97  204:aload_1         
	//   98  205:aload_2         
	//   99  206:invokespecial   #209 <Method ObjectAnimator createMatrixAnimator(ImageView, Matrix, Matrix)>
	//  100  209:astore_1        
				} else
	//* 101  210:goto            219
				{
					viewgroup = ((ViewGroup) (createNullAnimator(((ImageView) (transitionvalues1)))));
	//  102  213:aload_0         
	//  103  214:aload_3         
	//  104  215:invokespecial   #211 <Method ObjectAnimator createNullAnimator(ImageView)>
	//  105  218:astore_1        
				}
				ImageViewUtils.reserveEndAnimateTransform(((ImageView) (transitionvalues1)), ((Animator) (viewgroup)));
	//  106  219:aload_3         
	//  107  220:aload_1         
	//  108  221:invokestatic    #215 <Method void ImageViewUtils.reserveEndAnimateTransform(ImageView, Animator)>
				return ((Animator) (viewgroup));
	//  109  224:aload_1         
	//  110  225:areturn         
			} else
			{
				return null;
	//  111  226:aconst_null     
	//  112  227:areturn         
			}
		} else
		{
			return null;
	//  113  228:aconst_null     
	//  114  229:areturn         
		}
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #31  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	private static final Property ANIMATED_TRANSFORM_PROPERTY = new Property(android/graphics/Matrix, "animatedTransform") {

		public Matrix get(ImageView imageview)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((ImageView)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ImageView>
		//    3    5:invokevirtual   #19  <Method Matrix get(ImageView)>
		//    4    8:areturn         
		}

		public void set(ImageView imageview, Matrix matrix)
		{
			ImageViewUtils.animateTransform(imageview, matrix);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #26  <Method void ImageViewUtils.animateTransform(ImageView, Matrix)>
		//    3    5:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((ImageView)obj, (Matrix)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ImageView>
		//    3    5:aload_2         
		//    4    6:checkcast       #29  <Class Matrix>
		//    5    9:invokevirtual   #31  <Method void set(ImageView, Matrix)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final TypeEvaluator NULL_MATRIX_EVALUATOR = new TypeEvaluator() {

		public Matrix evaluate(float f, Matrix matrix, Matrix matrix1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object evaluate(float f, Object obj, Object obj1)
		{
			return ((Object) (evaluate(f, (Matrix)obj, (Matrix)obj1)));
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #19  <Class Matrix>
		//    4    6:aload_3         
		//    5    7:checkcast       #19  <Class Matrix>
		//    6   10:invokevirtual   #21  <Method Matrix evaluate(float, Matrix, Matrix)>
		//    7   13:areturn         
		}

	}
;
	private static final String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
	private static final String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
	private static final String sTransitionProperties[] = {
		"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"
	};

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #23  <String "android:changeImageTransform:matrix">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #20  <String "android:changeImageTransform:bounds">
	//    9   13:aastore         
	//   10   14:putstatic       #31  <Field String[] sTransitionProperties>
	//   11   17:new             #6   <Class ChangeImageTransform$1>
	//   12   20:dup             
	//   13   21:invokespecial   #34  <Method void ChangeImageTransform$1()>
	//   14   24:putstatic       #36  <Field TypeEvaluator NULL_MATRIX_EVALUATOR>
	//   15   27:new             #8   <Class ChangeImageTransform$2>
	//   16   30:dup             
	//   17   31:ldc1            #38  <Class Matrix>
	//   18   33:ldc1            #40  <String "animatedTransform">
	//   19   35:invokespecial   #43  <Method void ChangeImageTransform$2(Class, String)>
	//   20   38:putstatic       #45  <Field Property ANIMATED_TRANSFORM_PROPERTY>
	//*  21   41:return          
	}
}
