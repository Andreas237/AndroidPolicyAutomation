// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.graphics.*;
import android.view.*;
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


	private TransitionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	static View copyViewImage(ViewGroup viewgroup, View view, View view1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #35  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void Matrix()>
	//    3    7:astore          7
		matrix.setTranslate(-view1.getScrollX(), -view1.getScrollY());
	//    4    9:aload           7
	//    5   11:aload_2         
	//    6   12:invokevirtual   #42  <Method int View.getScrollX()>
	//    7   15:ineg            
	//    8   16:i2f             
	//    9   17:aload_2         
	//   10   18:invokevirtual   #45  <Method int View.getScrollY()>
	//   11   21:ineg            
	//   12   22:i2f             
	//   13   23:invokevirtual   #49  <Method void Matrix.setTranslate(float, float)>
		ViewUtils.transformMatrixToGlobal(view, matrix);
	//   14   26:aload_1         
	//   15   27:aload           7
	//   16   29:invokestatic    #55  <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
		ViewUtils.transformMatrixToLocal(((View) (viewgroup)), matrix);
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:invokestatic    #58  <Method void ViewUtils.transformMatrixToLocal(View, Matrix)>
		RectF rectf = new RectF(0.0F, 0.0F, view.getWidth(), view.getHeight());
	//   20   38:new             #60  <Class RectF>
	//   21   41:dup             
	//   22   42:fconst_0        
	//   23   43:fconst_0        
	//   24   44:aload_1         
	//   25   45:invokevirtual   #63  <Method int View.getWidth()>
	//   26   48:i2f             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #66  <Method int View.getHeight()>
	//   29   53:i2f             
	//   30   54:invokespecial   #69  <Method void RectF(float, float, float, float)>
	//   31   57:astore          8
		matrix.mapRect(rectf);
	//   32   59:aload           7
	//   33   61:aload           8
	//   34   63:invokevirtual   #73  <Method boolean Matrix.mapRect(RectF)>
	//   35   66:pop             
		int i = Math.round(rectf.left);
	//   36   67:aload           8
	//   37   69:getfield        #77  <Field float RectF.left>
	//   38   72:invokestatic    #83  <Method int Math.round(float)>
	//   39   75:istore_3        
		int j = Math.round(rectf.top);
	//   40   76:aload           8
	//   41   78:getfield        #86  <Field float RectF.top>
	//   42   81:invokestatic    #83  <Method int Math.round(float)>
	//   43   84:istore          4
		int k = Math.round(rectf.right);
	//   44   86:aload           8
	//   45   88:getfield        #89  <Field float RectF.right>
	//   46   91:invokestatic    #83  <Method int Math.round(float)>
	//   47   94:istore          5
		int l = Math.round(rectf.bottom);
	//   48   96:aload           8
	//   49   98:getfield        #92  <Field float RectF.bottom>
	//   50  101:invokestatic    #83  <Method int Math.round(float)>
	//   51  104:istore          6
		view1 = ((View) (new ImageView(view.getContext())));
	//   52  106:new             #94  <Class ImageView>
	//   53  109:dup             
	//   54  110:aload_1         
	//   55  111:invokevirtual   #98  <Method android.content.Context View.getContext()>
	//   56  114:invokespecial   #101 <Method void ImageView(android.content.Context)>
	//   57  117:astore_2        
		((ImageView) (view1)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   58  118:aload_2         
	//   59  119:getstatic       #107 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   60  122:invokevirtual   #111 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		viewgroup = ((ViewGroup) (createViewBitmap(view, matrix, rectf, viewgroup)));
	//   61  125:aload_1         
	//   62  126:aload           7
	//   63  128:aload           8
	//   64  130:aload_0         
	//   65  131:invokestatic    #115 <Method Bitmap createViewBitmap(View, Matrix, RectF, ViewGroup)>
	//   66  134:astore_0        
		if(viewgroup != null)
	//*  67  135:aload_0         
	//*  68  136:ifnull          144
			((ImageView) (view1)).setImageBitmap(((Bitmap) (viewgroup)));
	//   69  139:aload_2         
	//   70  140:aload_0         
	//   71  141:invokevirtual   #119 <Method void ImageView.setImageBitmap(Bitmap)>
		((ImageView) (view1)).measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l - j, 0x40000000));
	//   72  144:aload_2         
	//   73  145:iload           5
	//   74  147:iload_3         
	//   75  148:isub            
	//   76  149:ldc1            #120 <Int 0x40000000>
	//   77  151:invokestatic    #126 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   78  154:iload           6
	//   79  156:iload           4
	//   80  158:isub            
	//   81  159:ldc1            #120 <Int 0x40000000>
	//   82  161:invokestatic    #126 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   83  164:invokevirtual   #130 <Method void ImageView.measure(int, int)>
		((ImageView) (view1)).layout(i, j, k, l);
	//   84  167:aload_2         
	//   85  168:iload_3         
	//   86  169:iload           4
	//   87  171:iload           5
	//   88  173:iload           6
	//   89  175:invokevirtual   #134 <Method void ImageView.layout(int, int, int, int)>
		return view1;
	//   90  178:aload_2         
	//   91  179:areturn         
	}

	private static Bitmap createViewBitmap(View view, Matrix matrix, RectF rectf, ViewGroup viewgroup)
	{
		boolean flag = HAS_IS_ATTACHED_TO_WINDOW;
	//    0    0:getstatic       #23  <Field boolean HAS_IS_ATTACHED_TO_WINDOW>
	//    1    3:istore          8
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore          5
		boolean flag1;
		if(flag)
	//*   4    8:iload           8
	//*   5   10:ifeq            40
		{
			flag1 = view.isAttachedToWindow() ^ true;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #138 <Method boolean View.isAttachedToWindow()>
	//    8   17:iconst_1        
	//    9   18:ixor            
	//   10   19:istore          9
			if(viewgroup == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       31
				flag = false;
	//   13   25:iconst_0        
	//   14   26:istore          8
			else
	//*  15   28:goto            47
				flag = viewgroup.isAttachedToWindow();
	//   16   31:aload_3         
	//   17   32:invokevirtual   #141 <Method boolean ViewGroup.isAttachedToWindow()>
	//   18   35:istore          8
		} else
	//*  19   37:goto            47
		{
			flag1 = false;
	//   20   40:iconst_0        
	//   21   41:istore          9
			flag = flag1;
	//   22   43:iload           9
	//   23   45:istore          8
		}
		boolean flag2 = HAS_OVERLAY;
	//   24   47:getstatic       #25  <Field boolean HAS_OVERLAY>
	//   25   50:istore          10
		Object obj1 = null;
	//   26   52:aconst_null     
	//   27   53:astore          13
		ViewGroup viewgroup1;
		if(flag2 && flag1)
	//*  28   55:iload           10
	//*  29   57:ifeq            100
	//*  30   60:iload           9
	//*  31   62:ifeq            100
		{
			if(!flag)
	//*  32   65:iload           8
	//*  33   67:ifne            72
				return null;
	//   34   70:aconst_null     
	//   35   71:areturn         
			viewgroup1 = (ViewGroup)view.getParent();
	//   36   72:aload_0         
	//   37   73:invokevirtual   #145 <Method android.view.ViewParent View.getParent()>
	//   38   76:checkcast       #140 <Class ViewGroup>
	//   39   79:astore          12
			i = viewgroup1.indexOfChild(view);
	//   40   81:aload           12
	//   41   83:aload_0         
	//   42   84:invokevirtual   #149 <Method int ViewGroup.indexOfChild(View)>
	//   43   87:istore          5
			viewgroup.getOverlay().add(view);
	//   44   89:aload_3         
	//   45   90:invokevirtual   #153 <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//   46   93:aload_0         
	//   47   94:invokevirtual   #159 <Method void ViewGroupOverlay.add(View)>
		} else
	//*  48   97:goto            103
		{
			viewgroup1 = null;
	//   49  100:aconst_null     
	//   50  101:astore          12
		}
		int k = Math.round(rectf.width());
	//   51  103:aload_2         
	//   52  104:invokevirtual   #163 <Method float RectF.width()>
	//   53  107:invokestatic    #83  <Method int Math.round(float)>
	//   54  110:istore          7
		int j = Math.round(rectf.height());
	//   55  112:aload_2         
	//   56  113:invokevirtual   #166 <Method float RectF.height()>
	//   57  116:invokestatic    #83  <Method int Math.round(float)>
	//   58  119:istore          6
		Object obj = ((Object) (obj1));
	//   59  121:aload           13
	//   60  123:astore          11
		if(k > 0)
	//*  61  125:iload           7
	//*  62  127:ifle            281
		{
			obj = ((Object) (obj1));
	//   63  130:aload           13
	//   64  132:astore          11
			if(j > 0)
	//*  65  134:iload           6
	//*  66  136:ifle            281
			{
				float f = Math.min(1.0F, 1048576F / (float)(k * j));
	//   67  139:fconst_1        
	//   68  140:ldc1            #167 <Float 1048576F>
	//   69  142:iload           7
	//   70  144:iload           6
	//   71  146:imul            
	//   72  147:i2f             
	//   73  148:fdiv            
	//   74  149:invokestatic    #171 <Method float Math.min(float, float)>
	//   75  152:fstore          4
				k = Math.round((float)k * f);
	//   76  154:iload           7
	//   77  156:i2f             
	//   78  157:fload           4
	//   79  159:fmul            
	//   80  160:invokestatic    #83  <Method int Math.round(float)>
	//   81  163:istore          7
				j = Math.round((float)j * f);
	//   82  165:iload           6
	//   83  167:i2f             
	//   84  168:fload           4
	//   85  170:fmul            
	//   86  171:invokestatic    #83  <Method int Math.round(float)>
	//   87  174:istore          6
				matrix.postTranslate(-rectf.left, -rectf.top);
	//   88  176:aload_1         
	//   89  177:aload_2         
	//   90  178:getfield        #77  <Field float RectF.left>
	//   91  181:fneg            
	//   92  182:aload_2         
	//   93  183:getfield        #86  <Field float RectF.top>
	//   94  186:fneg            
	//   95  187:invokevirtual   #175 <Method boolean Matrix.postTranslate(float, float)>
	//   96  190:pop             
				matrix.postScale(f, f);
	//   97  191:aload_1         
	//   98  192:fload           4
	//   99  194:fload           4
	//  100  196:invokevirtual   #178 <Method boolean Matrix.postScale(float, float)>
	//  101  199:pop             
				if(HAS_PICTURE_BITMAP)
	//* 102  200:getstatic       #27  <Field boolean HAS_PICTURE_BITMAP>
	//* 103  203:ifeq            249
				{
					rectf = ((RectF) (new Picture()));
	//  104  206:new             #180 <Class Picture>
	//  105  209:dup             
	//  106  210:invokespecial   #181 <Method void Picture()>
	//  107  213:astore_2        
					obj = ((Object) (((Picture) (rectf)).beginRecording(k, j)));
	//  108  214:aload_2         
	//  109  215:iload           7
	//  110  217:iload           6
	//  111  219:invokevirtual   #185 <Method Canvas Picture.beginRecording(int, int)>
	//  112  222:astore          11
					((Canvas) (obj)).concat(matrix);
	//  113  224:aload           11
	//  114  226:aload_1         
	//  115  227:invokevirtual   #191 <Method void Canvas.concat(Matrix)>
					view.draw(((Canvas) (obj)));
	//  116  230:aload_0         
	//  117  231:aload           11
	//  118  233:invokevirtual   #195 <Method void View.draw(Canvas)>
					((Picture) (rectf)).endRecording();
	//  119  236:aload_2         
	//  120  237:invokevirtual   #198 <Method void Picture.endRecording()>
					obj = ((Object) (Bitmap.createBitmap(((Picture) (rectf)))));
	//  121  240:aload_2         
	//  122  241:invokestatic    #204 <Method Bitmap Bitmap.createBitmap(Picture)>
	//  123  244:astore          11
				} else
	//* 124  246:goto            281
				{
					obj = ((Object) (Bitmap.createBitmap(k, j, android.graphics.Bitmap.Config.ARGB_8888)));
	//  125  249:iload           7
	//  126  251:iload           6
	//  127  253:getstatic       #210 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  128  256:invokestatic    #213 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  129  259:astore          11
					rectf = ((RectF) (new Canvas(((Bitmap) (obj)))));
	//  130  261:new             #187 <Class Canvas>
	//  131  264:dup             
	//  132  265:aload           11
	//  133  267:invokespecial   #215 <Method void Canvas(Bitmap)>
	//  134  270:astore_2        
					((Canvas) (rectf)).concat(matrix);
	//  135  271:aload_2         
	//  136  272:aload_1         
	//  137  273:invokevirtual   #191 <Method void Canvas.concat(Matrix)>
					view.draw(((Canvas) (rectf)));
	//  138  276:aload_0         
	//  139  277:aload_2         
	//  140  278:invokevirtual   #195 <Method void View.draw(Canvas)>
				}
			}
		}
		if(HAS_OVERLAY && flag1)
	//* 141  281:getstatic       #25  <Field boolean HAS_OVERLAY>
	//* 142  284:ifeq            308
	//* 143  287:iload           9
	//* 144  289:ifeq            308
		{
			viewgroup.getOverlay().remove(view);
	//  145  292:aload_3         
	//  146  293:invokevirtual   #153 <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//  147  296:aload_0         
	//  148  297:invokevirtual   #218 <Method void ViewGroupOverlay.remove(View)>
			viewgroup1.addView(view, i);
	//  149  300:aload           12
	//  150  302:aload_0         
	//  151  303:iload           5
	//  152  305:invokevirtual   #222 <Method void ViewGroup.addView(View, int)>
		}
		return ((Bitmap) (obj));
	//  153  308:aload           11
	//  154  310:areturn         
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
	//    8   12:new             #226 <Class AnimatorSet>
	//    9   15:dup             
	//   10   16:invokespecial   #227 <Method void AnimatorSet()>
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
	//   23   33:invokevirtual   #233 <Method void AnimatorSet.playTogether(Animator[])>
			return ((Animator) (animatorset));
	//   24   36:aload_2         
	//   25   37:areturn         
		}
	}

	private static final boolean HAS_IS_ATTACHED_TO_WINDOW;
	private static final boolean HAS_OVERLAY;
	private static final boolean HAS_PICTURE_BITMAP;
	private static final int MAX_IMAGE_SIZE = 0x100000;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		boolean flag;
		if(i >= 19)
	//*   4    6:iload_0         
	//*   5    7:bipush          19
	//*   6    9:icmplt          17
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_1        
		else
	//*   9   14:goto            19
			flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_1        
		HAS_IS_ATTACHED_TO_WINDOW = flag;
	//   12   19:iload_1         
	//   13   20:putstatic       #23  <Field boolean HAS_IS_ATTACHED_TO_WINDOW>
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  14   23:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   26:bipush          18
	//*  16   28:icmplt          36
			flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_1        
		else
	//*  19   33:goto            38
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_1        
		HAS_OVERLAY = flag;
	//   22   38:iload_1         
	//   23   39:putstatic       #25  <Field boolean HAS_OVERLAY>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  24   42:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   45:bipush          28
	//*  26   47:icmplt          55
			flag = flag1;
	//   27   50:iload_2         
	//   28   51:istore_1        
		else
	//*  29   52:goto            57
			flag = false;
	//   30   55:iconst_0        
	//   31   56:istore_1        
		HAS_PICTURE_BITMAP = flag;
	//   32   57:iload_1         
	//   33   58:putstatic       #27  <Field boolean HAS_PICTURE_BITMAP>
	//*  34   61:return          
	}
}
