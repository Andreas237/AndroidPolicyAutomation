// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ViewUtilsImpl, ViewOverlayApi14, WindowIdApi14, ViewOverlayImpl, 
//			WindowIdImpl

class ViewUtilsApi14
	implements ViewUtilsImpl
{

	ViewUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public void clearNonTransitionAlpha(View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #25  <Method int View.getVisibility()>
	//*   2    4:ifne            15
			view.setTag(R.id.save_non_transition_alpha, ((Object) (null)));
	//    3    7:aload_1         
	//    4    8:getstatic       #31  <Field int R$id.save_non_transition_alpha>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #35  <Method void View.setTag(int, Object)>
	//    7   15:return          
	}

	public ViewOverlayImpl getOverlay(View view)
	{
		return ((ViewOverlayImpl) (ViewOverlayApi14.createFrom(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #44  <Method ViewOverlayApi14 ViewOverlayApi14.createFrom(View)>
	//    2    4:areturn         
	}

	public float getTransitionAlpha(View view)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #31  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #50  <Method Object View.getTag(int)>
	//    3    7:checkcast       #52  <Class Float>
	//    4   10:astore_2        
		if(float1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          25
			return view.getAlpha() / float1.floatValue();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #56  <Method float View.getAlpha()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #59  <Method float Float.floatValue()>
	//   11   23:fdiv            
	//   12   24:freturn         
		else
			return view.getAlpha();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #56  <Method float View.getAlpha()>
	//   15   29:freturn         
	}

	public WindowIdImpl getWindowId(View view)
	{
		return ((WindowIdImpl) (new WindowIdApi14(view.getWindowToken())));
	//    0    0:new             #63  <Class WindowIdApi14>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method android.os.IBinder View.getWindowToken()>
	//    4    8:invokespecial   #70  <Method void WindowIdApi14(android.os.IBinder)>
	//    5   11:areturn         
	}

	public void saveNonTransitionAlpha(View view)
	{
		if(view.getTag(R.id.save_non_transition_alpha) == null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #31  <Field int R$id.save_non_transition_alpha>
	//*   2    4:invokevirtual   #50  <Method Object View.getTag(int)>
	//*   3    7:ifnonnull       24
			view.setTag(R.id.save_non_transition_alpha, ((Object) (Float.valueOf(view.getAlpha()))));
	//    4   10:aload_1         
	//    5   11:getstatic       #31  <Field int R$id.save_non_transition_alpha>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #56  <Method float View.getAlpha()>
	//    8   18:invokestatic    #75  <Method Float Float.valueOf(float)>
	//    9   21:invokevirtual   #35  <Method void View.setTag(int, Object)>
	//   10   24:return          
	}

	public void setAnimationMatrix(View view, Matrix matrix)
	{
		if(matrix == null || matrix.isIdentity())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #83  <Method boolean Matrix.isIdentity()>
	//*   4    8:ifeq            59
		{
			view.setPivotX(view.getWidth() / 2);
	//    5   11:aload_1         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #86  <Method int View.getWidth()>
	//    8   16:iconst_2        
	//    9   17:idiv            
	//   10   18:i2f             
	//   11   19:invokevirtual   #90  <Method void View.setPivotX(float)>
			view.setPivotY(view.getHeight() / 2);
	//   12   22:aload_1         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #93  <Method int View.getHeight()>
	//   15   27:iconst_2        
	//   16   28:idiv            
	//   17   29:i2f             
	//   18   30:invokevirtual   #96  <Method void View.setPivotY(float)>
			view.setTranslationX(0.0F);
	//   19   33:aload_1         
	//   20   34:fconst_0        
	//   21   35:invokevirtual   #99  <Method void View.setTranslationX(float)>
			view.setTranslationY(0.0F);
	//   22   38:aload_1         
	//   23   39:fconst_0        
	//   24   40:invokevirtual   #102 <Method void View.setTranslationY(float)>
			view.setScaleX(1.0F);
	//   25   43:aload_1         
	//   26   44:fconst_1        
	//   27   45:invokevirtual   #105 <Method void View.setScaleX(float)>
			view.setScaleY(1.0F);
	//   28   48:aload_1         
	//   29   49:fconst_1        
	//   30   50:invokevirtual   #108 <Method void View.setScaleY(float)>
			view.setRotation(0.0F);
	//   31   53:aload_1         
	//   32   54:fconst_0        
	//   33   55:invokevirtual   #111 <Method void View.setRotation(float)>
			return;
	//   34   58:return          
		}
		float af1[] = mMatrixValues;
	//   35   59:aload_0         
	//   36   60:getfield        #113 <Field float[] mMatrixValues>
	//   37   63:astore          10
		float af[] = af1;
	//   38   65:aload           10
	//   39   67:astore          9
		if(af1 == null)
	//*  40   69:aload           10
	//*  41   71:ifnonnull       86
		{
			af = new float[9];
	//   42   74:bipush          9
	//   43   76:newarray        float[]
	//   44   78:astore          9
			mMatrixValues = af;
	//   45   80:aload_0         
	//   46   81:aload           9
	//   47   83:putfield        #113 <Field float[] mMatrixValues>
		}
		matrix.getValues(af);
	//   48   86:aload_2         
	//   49   87:aload           9
	//   50   89:invokevirtual   #117 <Method void Matrix.getValues(float[])>
		float f = af[3];
	//   51   92:aload           9
	//   52   94:iconst_3        
	//   53   95:faload          
	//   54   96:fstore_3        
		float f1 = (float)Math.sqrt(1.0F - f * f);
	//   55   97:fconst_1        
	//   56   98:fload_3         
	//   57   99:fload_3         
	//   58  100:fmul            
	//   59  101:fsub            
	//   60  102:f2d             
	//   61  103:invokestatic    #123 <Method double Math.sqrt(double)>
	//   62  106:d2f             
	//   63  107:fstore          4
		float f2;
		float f3;
		float f4;
		int i;
		if(af[0] < 0.0F)
	//*  64  109:aload           9
	//*  65  111:iconst_0        
	//*  66  112:faload          
	//*  67  113:fconst_0        
	//*  68  114:fcmpg           
	//*  69  115:ifge            212
			i = -1;
	//   70  118:iconst_m1       
	//   71  119:istore          8
		else
	//*  72  121:iload           8
	//*  73  123:i2f             
	//*  74  124:fload           4
	//*  75  126:fmul            
	//*  76  127:fstore          5
	//*  77  129:fload_3         
	//*  78  130:f2d             
	//*  79  131:fload           5
	//*  80  133:f2d             
	//*  81  134:invokestatic    #127 <Method double Math.atan2(double, double)>
	//*  82  137:invokestatic    #130 <Method double Math.toDegrees(double)>
	//*  83  140:d2f             
	//*  84  141:fstore_3        
	//*  85  142:aload           9
	//*  86  144:iconst_0        
	//*  87  145:faload          
	//*  88  146:fload           5
	//*  89  148:fdiv            
	//*  90  149:fstore          4
	//*  91  151:aload           9
	//*  92  153:iconst_4        
	//*  93  154:faload          
	//*  94  155:fload           5
	//*  95  157:fdiv            
	//*  96  158:fstore          5
	//*  97  160:aload           9
	//*  98  162:iconst_2        
	//*  99  163:faload          
	//* 100  164:fstore          6
	//* 101  166:aload           9
	//* 102  168:iconst_5        
	//* 103  169:faload          
	//* 104  170:fstore          7
	//* 105  172:aload_1         
	//* 106  173:fconst_0        
	//* 107  174:invokevirtual   #90  <Method void View.setPivotX(float)>
	//* 108  177:aload_1         
	//* 109  178:fconst_0        
	//* 110  179:invokevirtual   #96  <Method void View.setPivotY(float)>
	//* 111  182:aload_1         
	//* 112  183:fload           6
	//* 113  185:invokevirtual   #99  <Method void View.setTranslationX(float)>
	//* 114  188:aload_1         
	//* 115  189:fload           7
	//* 116  191:invokevirtual   #102 <Method void View.setTranslationY(float)>
	//* 117  194:aload_1         
	//* 118  195:fload_3         
	//* 119  196:invokevirtual   #111 <Method void View.setRotation(float)>
	//* 120  199:aload_1         
	//* 121  200:fload           4
	//* 122  202:invokevirtual   #105 <Method void View.setScaleX(float)>
	//* 123  205:aload_1         
	//* 124  206:fload           5
	//* 125  208:invokevirtual   #108 <Method void View.setScaleY(float)>
	//* 126  211:return          
			i = 1;
	//  127  212:iconst_1        
	//  128  213:istore          8
		f2 = (float)i * f1;
		f = (float)Math.toDegrees(Math.atan2(f, f2));
		f1 = af[0] / f2;
		f2 = af[4] / f2;
		f3 = af[2];
		f4 = af[5];
		view.setPivotX(0.0F);
		view.setPivotY(0.0F);
		view.setTranslationX(f3);
		view.setTranslationY(f4);
		view.setRotation(f);
		view.setScaleX(f1);
		view.setScaleY(f2);
	//* 129  215:goto            121
	}

	public void setLeftTopRightBottom(View view, int i, int j, int k, int l)
	{
		view.setLeft(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #136 <Method void View.setLeft(int)>
		view.setTop(j);
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #139 <Method void View.setTop(int)>
		view.setRight(k);
	//    6   10:aload_1         
	//    7   11:iload           4
	//    8   13:invokevirtual   #142 <Method void View.setRight(int)>
		view.setBottom(l);
	//    9   16:aload_1         
	//   10   17:iload           5
	//   11   19:invokevirtual   #145 <Method void View.setBottom(int)>
	//   12   22:return          
	}

	public void setTransitionAlpha(View view, float f)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #31  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #50  <Method Object View.getTag(int)>
	//    3    7:checkcast       #52  <Class Float>
	//    4   10:astore_3        
		if(float1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          26
		{
			view.setAlpha(float1.floatValue() * f);
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #59  <Method float Float.floatValue()>
	//   10   20:fload_2         
	//   11   21:fmul            
	//   12   22:invokevirtual   #150 <Method void View.setAlpha(float)>
			return;
	//   13   25:return          
		} else
		{
			view.setAlpha(f);
	//   14   26:aload_1         
	//   15   27:fload_2         
	//   16   28:invokevirtual   #150 <Method void View.setAlpha(float)>
			return;
	//   17   31:return          
		}
	}

	public void transformMatrixToGlobal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #155 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #21  <Class View>
	//*   5    9:ifeq            40
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #21  <Class View>
	//    8   16:astore_3        
			transformMatrixToGlobal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #157 <Method void transformMatrixToGlobal(View, Matrix)>
			matrix.preTranslate(-((View) (obj)).getScrollX(), -((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #160 <Method int View.getScrollX()>
	//   16   28:ineg            
	//   17   29:i2f             
	//   18   30:aload_3         
	//   19   31:invokevirtual   #163 <Method int View.getScrollY()>
	//   20   34:ineg            
	//   21   35:i2f             
	//   22   36:invokevirtual   #167 <Method boolean Matrix.preTranslate(float, float)>
	//   23   39:pop             
		}
		matrix.preTranslate(view.getLeft(), view.getTop());
	//   24   40:aload_2         
	//   25   41:aload_1         
	//   26   42:invokevirtual   #170 <Method int View.getLeft()>
	//   27   45:i2f             
	//   28   46:aload_1         
	//   29   47:invokevirtual   #173 <Method int View.getTop()>
	//   30   50:i2f             
	//   31   51:invokevirtual   #167 <Method boolean Matrix.preTranslate(float, float)>
	//   32   54:pop             
		view = ((View) (view.getMatrix()));
	//   33   55:aload_1         
	//   34   56:invokevirtual   #177 <Method Matrix View.getMatrix()>
	//   35   59:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  36   60:aload_1         
	//*  37   61:invokevirtual   #83  <Method boolean Matrix.isIdentity()>
	//*  38   64:ifne            73
			matrix.preConcat(((Matrix) (view)));
	//   39   67:aload_2         
	//   40   68:aload_1         
	//   41   69:invokevirtual   #181 <Method boolean Matrix.preConcat(Matrix)>
	//   42   72:pop             
	//   43   73:return          
	}

	public void transformMatrixToLocal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #155 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #21  <Class View>
	//*   5    9:ifeq            38
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #21  <Class View>
	//    8   16:astore_3        
			transformMatrixToLocal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #184 <Method void transformMatrixToLocal(View, Matrix)>
			matrix.postTranslate(((View) (obj)).getScrollX(), ((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #160 <Method int View.getScrollX()>
	//   16   28:i2f             
	//   17   29:aload_3         
	//   18   30:invokevirtual   #163 <Method int View.getScrollY()>
	//   19   33:i2f             
	//   20   34:invokevirtual   #187 <Method boolean Matrix.postTranslate(float, float)>
	//   21   37:pop             
		}
		matrix.postTranslate(view.getLeft(), view.getTop());
	//   22   38:aload_2         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #170 <Method int View.getLeft()>
	//   25   43:i2f             
	//   26   44:aload_1         
	//   27   45:invokevirtual   #173 <Method int View.getTop()>
	//   28   48:i2f             
	//   29   49:invokevirtual   #187 <Method boolean Matrix.postTranslate(float, float)>
	//   30   52:pop             
		view = ((View) (view.getMatrix()));
	//   31   53:aload_1         
	//   32   54:invokevirtual   #177 <Method Matrix View.getMatrix()>
	//   33   57:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  34   58:aload_1         
	//*  35   59:invokevirtual   #83  <Method boolean Matrix.isIdentity()>
	//*  36   62:ifne            87
		{
			Matrix matrix1 = new Matrix();
	//   37   65:new             #79  <Class Matrix>
	//   38   68:dup             
	//   39   69:invokespecial   #188 <Method void Matrix()>
	//   40   72:astore_3        
			if(((Matrix) (view)).invert(matrix1))
	//*  41   73:aload_1         
	//*  42   74:aload_3         
	//*  43   75:invokevirtual   #191 <Method boolean Matrix.invert(Matrix)>
	//*  44   78:ifeq            87
				matrix.postConcat(matrix1);
	//   45   81:aload_2         
	//   46   82:aload_3         
	//   47   83:invokevirtual   #194 <Method boolean Matrix.postConcat(Matrix)>
	//   48   86:pop             
		}
	//   49   87:return          
	}

	private float mMatrixValues[];
}
