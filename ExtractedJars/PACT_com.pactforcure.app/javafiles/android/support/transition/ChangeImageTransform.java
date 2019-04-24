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
		ImageView imageview;
		if((view instanceof ImageView) && view.getVisibility() == 0)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #60  <Class ImageView>
	//*   5    9:ifeq            19
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #66  <Method int View.getVisibility()>
	//*   8   16:ifeq            20
	//*   9   19:return          
	//*  10   20:aload_2         
	//*  11   21:checkcast       #60  <Class ImageView>
	//*  12   24:astore_3        
			if((imageview = (ImageView)view).getDrawable() != null)
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//*  15   29:ifnull          19
			{
				transitionvalues = ((TransitionValues) (transitionvalues.values));
	//   16   32:aload_1         
	//   17   33:getfield        #74  <Field Map TransitionValues.values>
	//   18   36:astore_1        
				((Map) (transitionvalues)).put("android:changeImageTransform:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   19   37:aload_1         
	//   20   38:ldc1            #20  <String "android:changeImageTransform:bounds">
	//   21   40:new             #76  <Class Rect>
	//   22   43:dup             
	//   23   44:aload_2         
	//   24   45:invokevirtual   #79  <Method int View.getLeft()>
	//   25   48:aload_2         
	//   26   49:invokevirtual   #82  <Method int View.getTop()>
	//   27   52:aload_2         
	//   28   53:invokevirtual   #85  <Method int View.getRight()>
	//   29   56:aload_2         
	//   30   57:invokevirtual   #88  <Method int View.getBottom()>
	//   31   60:invokespecial   #91  <Method void Rect(int, int, int, int)>
	//   32   63:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   33   68:pop             
				((Map) (transitionvalues)).put("android:changeImageTransform:matrix", ((Object) (copyImageMatrix(imageview))));
	//   34   69:aload_1         
	//   35   70:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   36   72:aload_3         
	//   37   73:invokestatic    #101 <Method Matrix copyImageMatrix(ImageView)>
	//   38   76:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   39   81:pop             
				return;
	//   40   82:return          
			}
	}

	private static Matrix centerCropMatrix(ImageView imageview)
	{
		Drawable drawable = imageview.getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//    2    4:astore          8
		int j = drawable.getIntrinsicWidth();
	//    3    6:aload           8
	//    4    8:invokevirtual   #107 <Method int Drawable.getIntrinsicWidth()>
	//    5   11:istore          5
		int k = imageview.getWidth();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #110 <Method int ImageView.getWidth()>
	//    8   17:istore          6
		float f = (float)k / (float)j;
	//    9   19:iload           6
	//   10   21:i2f             
	//   11   22:iload           5
	//   12   24:i2f             
	//   13   25:fdiv            
	//   14   26:fstore_1        
		int l = drawable.getIntrinsicHeight();
	//   15   27:aload           8
	//   16   29:invokevirtual   #113 <Method int Drawable.getIntrinsicHeight()>
	//   17   32:istore          7
		int i = imageview.getHeight();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #116 <Method int ImageView.getHeight()>
	//   20   38:istore          4
		f = Math.max(f, (float)i / (float)l);
	//   21   40:fload_1         
	//   22   41:iload           4
	//   23   43:i2f             
	//   24   44:iload           7
	//   25   46:i2f             
	//   26   47:fdiv            
	//   27   48:invokestatic    #122 <Method float Math.max(float, float)>
	//   28   51:fstore_1        
		float f1 = j;
	//   29   52:iload           5
	//   30   54:i2f             
	//   31   55:fstore_2        
		float f2 = l;
	//   32   56:iload           7
	//   33   58:i2f             
	//   34   59:fstore_3        
		j = Math.round(((float)k - f1 * f) / 2.0F);
	//   35   60:iload           6
	//   36   62:i2f             
	//   37   63:fload_2         
	//   38   64:fload_1         
	//   39   65:fmul            
	//   40   66:fsub            
	//   41   67:fconst_2        
	//   42   68:fdiv            
	//   43   69:invokestatic    #126 <Method int Math.round(float)>
	//   44   72:istore          5
		i = Math.round(((float)i - f2 * f) / 2.0F);
	//   45   74:iload           4
	//   46   76:i2f             
	//   47   77:fload_3         
	//   48   78:fload_1         
	//   49   79:fmul            
	//   50   80:fsub            
	//   51   81:fconst_2        
	//   52   82:fdiv            
	//   53   83:invokestatic    #126 <Method int Math.round(float)>
	//   54   86:istore          4
		imageview = ((ImageView) (new Matrix()));
	//   55   88:new             #38  <Class Matrix>
	//   56   91:dup             
	//   57   92:invokespecial   #127 <Method void Matrix()>
	//   58   95:astore_0        
		((Matrix) (imageview)).postScale(f, f);
	//   59   96:aload_0         
	//   60   97:fload_1         
	//   61   98:fload_1         
	//   62   99:invokevirtual   #131 <Method boolean Matrix.postScale(float, float)>
	//   63  102:pop             
		((Matrix) (imageview)).postTranslate(j, i);
	//   64  103:aload_0         
	//   65  104:iload           5
	//   66  106:i2f             
	//   67  107:iload           4
	//   68  109:i2f             
	//   69  110:invokevirtual   #134 <Method boolean Matrix.postTranslate(float, float)>
	//   70  113:pop             
		return ((Matrix) (imageview));
	//   71  114:aload_0         
	//   72  115:areturn         
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
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
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
	//	               1 44
	//	               2 49
		default:
			return new Matrix(imageview.getImageMatrix());
	//    6   32:new             #38  <Class Matrix>
	//    7   35:dup             
	//    8   36:aload_0         
	//    9   37:invokevirtual   #151 <Method Matrix ImageView.getImageMatrix()>
	//   10   40:invokespecial   #154 <Method void Matrix(Matrix)>
	//   11   43:areturn         

		case 1: // '\001'
			return fitXYMatrix(imageview);
	//   12   44:aload_0         
	//   13   45:invokestatic    #157 <Method Matrix fitXYMatrix(ImageView)>
	//   14   48:areturn         

		case 2: // '\002'
			return centerCropMatrix(imageview);
	//   15   49:aload_0         
	//   16   50:invokestatic    #159 <Method Matrix centerCropMatrix(ImageView)>
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
		if(transitionvalues != null && transitionvalues1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
	//*   4    8:aconst_null     
	//*   5    9:areturn         
		{
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
			if(viewgroup != null && rect != null)
	//*  18   41:aload_1         
	//*  19   42:ifnull          8
	//*  20   45:aload           7
	//*  21   47:ifnull          8
			{
				transitionvalues = ((TransitionValues) ((Matrix)transitionvalues.values.get("android:changeImageTransform:matrix")));
	//   22   50:aload_2         
	//   23   51:getfield        #74  <Field Map TransitionValues.values>
	//   24   54:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   25   56:invokeinterface #184 <Method Object Map.get(Object)>
	//   26   61:checkcast       #38  <Class Matrix>
	//   27   64:astore_2        
				Matrix matrix = (Matrix)transitionvalues1.values.get("android:changeImageTransform:matrix");
	//   28   65:aload_3         
	//   29   66:getfield        #74  <Field Map TransitionValues.values>
	//   30   69:ldc1            #23  <String "android:changeImageTransform:matrix">
	//   31   71:invokeinterface #184 <Method Object Map.get(Object)>
	//   32   76:checkcast       #38  <Class Matrix>
	//   33   79:astore          6
				int i;
				if(transitionvalues == null && matrix == null || transitionvalues != null && ((Matrix) (transitionvalues)).equals(((Object) (matrix))))
	//*  34   81:aload_2         
	//*  35   82:ifnonnull       90
	//*  36   85:aload           6
	//*  37   87:ifnull          103
	//*  38   90:aload_2         
	//*  39   91:ifnull          172
	//*  40   94:aload_2         
	//*  41   95:aload           6
	//*  42   97:invokevirtual   #188 <Method boolean Matrix.equals(Object)>
	//*  43  100:ifeq            172
					i = 1;
	//   44  103:iconst_1        
	//   45  104:istore          4
				else
	//*  46  106:aload_1         
	//*  47  107:aload           7
	//*  48  109:invokevirtual   #189 <Method boolean Rect.equals(Object)>
	//*  49  112:ifeq            120
	//*  50  115:iload           4
	//*  51  117:ifne            8
	//*  52  120:aload_3         
	//*  53  121:getfield        #58  <Field View TransitionValues.view>
	//*  54  124:checkcast       #60  <Class ImageView>
	//*  55  127:astore_3        
	//*  56  128:aload_3         
	//*  57  129:invokevirtual   #70  <Method Drawable ImageView.getDrawable()>
	//*  58  132:astore_1        
	//*  59  133:aload_1         
	//*  60  134:invokevirtual   #107 <Method int Drawable.getIntrinsicWidth()>
	//*  61  137:istore          4
	//*  62  139:aload_1         
	//*  63  140:invokevirtual   #113 <Method int Drawable.getIntrinsicHeight()>
	//*  64  143:istore          5
	//*  65  145:aload_3         
	//*  66  146:invokestatic    #195 <Method void ImageViewUtils.startAnimateTransform(ImageView)>
	//*  67  149:iload           4
	//*  68  151:ifeq            159
	//*  69  154:iload           5
	//*  70  156:ifne            178
	//*  71  159:aload_0         
	//*  72  160:aload_3         
	//*  73  161:invokespecial   #197 <Method ObjectAnimator createNullAnimator(ImageView)>
	//*  74  164:astore_1        
	//*  75  165:aload_3         
	//*  76  166:aload_1         
	//*  77  167:invokestatic    #201 <Method void ImageViewUtils.reserveEndAnimateTransform(ImageView, Animator)>
	//*  78  170:aload_1         
	//*  79  171:areturn         
					i = 0;
	//   80  172:iconst_0        
	//   81  173:istore          4
				if(!((Rect) (viewgroup)).equals(((Object) (rect))) || i == 0)
				{
					transitionvalues1 = ((TransitionValues) ((ImageView)transitionvalues1.view));
					viewgroup = ((ViewGroup) (((ImageView) (transitionvalues1)).getDrawable()));
					i = ((Drawable) (viewgroup)).getIntrinsicWidth();
					int j = ((Drawable) (viewgroup)).getIntrinsicHeight();
					ImageViewUtils.startAnimateTransform(((ImageView) (transitionvalues1)));
					if(i == 0 || j == 0)
					{
						viewgroup = ((ViewGroup) (createNullAnimator(((ImageView) (transitionvalues1)))));
					} else
	//*  82  175:goto            106
					{
						viewgroup = ((ViewGroup) (transitionvalues));
	//   83  178:aload_2         
	//   84  179:astore_1        
						if(transitionvalues == null)
	//*  85  180:aload_2         
	//*  86  181:ifnonnull       188
							viewgroup = ((ViewGroup) (MatrixUtils.IDENTITY_MATRIX));
	//   87  184:getstatic       #207 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   88  187:astore_1        
						transitionvalues = ((TransitionValues) (matrix));
	//   89  188:aload           6
	//   90  190:astore_2        
						if(matrix == null)
	//*  91  191:aload           6
	//*  92  193:ifnonnull       200
							transitionvalues = ((TransitionValues) (MatrixUtils.IDENTITY_MATRIX));
	//   93  196:getstatic       #207 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   94  199:astore_2        
						ANIMATED_TRANSFORM_PROPERTY.set(((Object) (transitionvalues1)), ((Object) (viewgroup)));
	//   95  200:getstatic       #45  <Field Property ANIMATED_TRANSFORM_PROPERTY>
	//   96  203:aload_3         
	//   97  204:aload_1         
	//   98  205:invokevirtual   #213 <Method void Property.set(Object, Object)>
						viewgroup = ((ViewGroup) (createMatrixAnimator(((ImageView) (transitionvalues1)), ((Matrix) (viewgroup)), ((Matrix) (transitionvalues)))));
	//   99  208:aload_0         
	//  100  209:aload_3         
	//  101  210:aload_1         
	//  102  211:aload_2         
	//  103  212:invokespecial   #215 <Method ObjectAnimator createMatrixAnimator(ImageView, Matrix, Matrix)>
	//  104  215:astore_1        
					}
					ImageViewUtils.reserveEndAnimateTransform(((ImageView) (transitionvalues1)), ((Animator) (viewgroup)));
					return ((Animator) (viewgroup));
				}
			}
		}
		return null;
	//* 105  216:goto            165
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
