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
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void clearNonTransitionAlpha(View view)
	{
		if(view.getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method int View.getVisibility()>
	//*   2    4:ifne            15
			view.setTag(R.id.save_non_transition_alpha, ((Object) (null)));
	//    3    7:aload_1         
	//    4    8:getstatic       #26  <Field int R$id.save_non_transition_alpha>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #30  <Method void View.setTag(int, Object)>
	//    7   15:return          
	}

	public float getTransitionAlpha(View view)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #26  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #37  <Method Object View.getTag(int)>
	//    3    7:checkcast       #39  <Class Float>
	//    4   10:astore_2        
		if(float1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          25
			return view.getAlpha() / float1.floatValue();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #43  <Method float View.getAlpha()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #46  <Method float Float.floatValue()>
	//   11   23:fdiv            
	//   12   24:freturn         
		else
			return view.getAlpha();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method float View.getAlpha()>
	//   15   29:freturn         
	}

	public void saveNonTransitionAlpha(View view)
	{
		if(view.getTag(R.id.save_non_transition_alpha) == null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #26  <Field int R$id.save_non_transition_alpha>
	//*   2    4:invokevirtual   #37  <Method Object View.getTag(int)>
	//*   3    7:ifnonnull       24
			view.setTag(R.id.save_non_transition_alpha, ((Object) (Float.valueOf(view.getAlpha()))));
	//    4   10:aload_1         
	//    5   11:getstatic       #26  <Field int R$id.save_non_transition_alpha>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #43  <Method float View.getAlpha()>
	//    8   18:invokestatic    #51  <Method Float Float.valueOf(float)>
	//    9   21:invokevirtual   #30  <Method void View.setTag(int, Object)>
	//   10   24:return          
	}

	public void setAnimationMatrix(View view, Matrix matrix)
	{
		if(matrix != null && !matrix.isIdentity())
	//*   0    0:aload_2         
	//*   1    1:ifnull          173
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #59  <Method boolean Matrix.isIdentity()>
	//*   4    8:ifeq            14
	//*   5   11:goto            173
		{
			float af1[] = mMatrixValues;
	//    6   14:aload_0         
	//    7   15:getfield        #61  <Field float[] mMatrixValues>
	//    8   18:astore          10
			float af[] = af1;
	//    9   20:aload           10
	//   10   22:astore          9
			if(af1 == null)
	//*  11   24:aload           10
	//*  12   26:ifnonnull       41
			{
				af = new float[9];
	//   13   29:bipush          9
	//   14   31:newarray        float[]
	//   15   33:astore          9
				mMatrixValues = af;
	//   16   35:aload_0         
	//   17   36:aload           9
	//   18   38:putfield        #61  <Field float[] mMatrixValues>
			}
			matrix.getValues(af);
	//   19   41:aload_2         
	//   20   42:aload           9
	//   21   44:invokevirtual   #65  <Method void Matrix.getValues(float[])>
			float f = af[3];
	//   22   47:aload           9
	//   23   49:iconst_3        
	//   24   50:faload          
	//   25   51:fstore_3        
			float f1 = (float)Math.sqrt(1.0F - f * f);
	//   26   52:fconst_1        
	//   27   53:fload_3         
	//   28   54:fload_3         
	//   29   55:fmul            
	//   30   56:fsub            
	//   31   57:f2d             
	//   32   58:invokestatic    #71  <Method double Math.sqrt(double)>
	//   33   61:d2f             
	//   34   62:fstore          4
			int i;
			if(af[0] < 0.0F)
	//*  35   64:aload           9
	//*  36   66:iconst_0        
	//*  37   67:faload          
	//*  38   68:fconst_0        
	//*  39   69:fcmpg           
	//*  40   70:ifge            79
				i = -1;
	//   41   73:iconst_m1       
	//   42   74:istore          8
			else
	//*  43   76:goto            82
				i = 1;
	//   44   79:iconst_1        
	//   45   80:istore          8
			float f2 = f1 * (float)i;
	//   46   82:fload           4
	//   47   84:iload           8
	//   48   86:i2f             
	//   49   87:fmul            
	//   50   88:fstore          5
			f = (float)Math.toDegrees(Math.atan2(f, f2));
	//   51   90:fload_3         
	//   52   91:f2d             
	//   53   92:fload           5
	//   54   94:f2d             
	//   55   95:invokestatic    #75  <Method double Math.atan2(double, double)>
	//   56   98:invokestatic    #78  <Method double Math.toDegrees(double)>
	//   57  101:d2f             
	//   58  102:fstore_3        
			f1 = af[0] / f2;
	//   59  103:aload           9
	//   60  105:iconst_0        
	//   61  106:faload          
	//   62  107:fload           5
	//   63  109:fdiv            
	//   64  110:fstore          4
			f2 = af[4] / f2;
	//   65  112:aload           9
	//   66  114:iconst_4        
	//   67  115:faload          
	//   68  116:fload           5
	//   69  118:fdiv            
	//   70  119:fstore          5
			float f3 = af[2];
	//   71  121:aload           9
	//   72  123:iconst_2        
	//   73  124:faload          
	//   74  125:fstore          6
			float f4 = af[5];
	//   75  127:aload           9
	//   76  129:iconst_5        
	//   77  130:faload          
	//   78  131:fstore          7
			view.setPivotX(0.0F);
	//   79  133:aload_1         
	//   80  134:fconst_0        
	//   81  135:invokevirtual   #82  <Method void View.setPivotX(float)>
			view.setPivotY(0.0F);
	//   82  138:aload_1         
	//   83  139:fconst_0        
	//   84  140:invokevirtual   #85  <Method void View.setPivotY(float)>
			view.setTranslationX(f3);
	//   85  143:aload_1         
	//   86  144:fload           6
	//   87  146:invokevirtual   #88  <Method void View.setTranslationX(float)>
			view.setTranslationY(f4);
	//   88  149:aload_1         
	//   89  150:fload           7
	//   90  152:invokevirtual   #91  <Method void View.setTranslationY(float)>
			view.setRotation(f);
	//   91  155:aload_1         
	//   92  156:fload_3         
	//   93  157:invokevirtual   #94  <Method void View.setRotation(float)>
			view.setScaleX(f1);
	//   94  160:aload_1         
	//   95  161:fload           4
	//   96  163:invokevirtual   #97  <Method void View.setScaleX(float)>
			view.setScaleY(f2);
	//   97  166:aload_1         
	//   98  167:fload           5
	//   99  169:invokevirtual   #100 <Method void View.setScaleY(float)>
			return;
	//  100  172:return          
		} else
		{
			view.setPivotX(view.getWidth() / 2);
	//  101  173:aload_1         
	//  102  174:aload_1         
	//  103  175:invokevirtual   #103 <Method int View.getWidth()>
	//  104  178:iconst_2        
	//  105  179:idiv            
	//  106  180:i2f             
	//  107  181:invokevirtual   #82  <Method void View.setPivotX(float)>
			view.setPivotY(view.getHeight() / 2);
	//  108  184:aload_1         
	//  109  185:aload_1         
	//  110  186:invokevirtual   #106 <Method int View.getHeight()>
	//  111  189:iconst_2        
	//  112  190:idiv            
	//  113  191:i2f             
	//  114  192:invokevirtual   #85  <Method void View.setPivotY(float)>
			view.setTranslationX(0.0F);
	//  115  195:aload_1         
	//  116  196:fconst_0        
	//  117  197:invokevirtual   #88  <Method void View.setTranslationX(float)>
			view.setTranslationY(0.0F);
	//  118  200:aload_1         
	//  119  201:fconst_0        
	//  120  202:invokevirtual   #91  <Method void View.setTranslationY(float)>
			view.setScaleX(1.0F);
	//  121  205:aload_1         
	//  122  206:fconst_1        
	//  123  207:invokevirtual   #97  <Method void View.setScaleX(float)>
			view.setScaleY(1.0F);
	//  124  210:aload_1         
	//  125  211:fconst_1        
	//  126  212:invokevirtual   #100 <Method void View.setScaleY(float)>
			view.setRotation(0.0F);
	//  127  215:aload_1         
	//  128  216:fconst_0        
	//  129  217:invokevirtual   #94  <Method void View.setRotation(float)>
			return;
	//  130  220:return          
		}
	}

	public void setLeftTopRightBottom(View view, int i, int j, int k, int l)
	{
		view.setLeft(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #112 <Method void View.setLeft(int)>
		view.setTop(j);
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #115 <Method void View.setTop(int)>
		view.setRight(k);
	//    6   10:aload_1         
	//    7   11:iload           4
	//    8   13:invokevirtual   #118 <Method void View.setRight(int)>
		view.setBottom(l);
	//    9   16:aload_1         
	//   10   17:iload           5
	//   11   19:invokevirtual   #121 <Method void View.setBottom(int)>
	//   12   22:return          
	}

	public void setTransitionAlpha(View view, float f)
	{
		Float float1 = (Float)view.getTag(R.id.save_non_transition_alpha);
	//    0    0:aload_1         
	//    1    1:getstatic       #26  <Field int R$id.save_non_transition_alpha>
	//    2    4:invokevirtual   #37  <Method Object View.getTag(int)>
	//    3    7:checkcast       #39  <Class Float>
	//    4   10:astore_3        
		if(float1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          26
		{
			view.setAlpha(float1.floatValue() * f);
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #46  <Method float Float.floatValue()>
	//   10   20:fload_2         
	//   11   21:fmul            
	//   12   22:invokevirtual   #126 <Method void View.setAlpha(float)>
			return;
	//   13   25:return          
		} else
		{
			view.setAlpha(f);
	//   14   26:aload_1         
	//   15   27:fload_2         
	//   16   28:invokevirtual   #126 <Method void View.setAlpha(float)>
			return;
	//   17   31:return          
		}
	}

	public void transformMatrixToGlobal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #131 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #16  <Class View>
	//*   5    9:ifeq            40
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #16  <Class View>
	//    8   16:astore_3        
			transformMatrixToGlobal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #133 <Method void transformMatrixToGlobal(View, Matrix)>
			matrix.preTranslate(-((View) (obj)).getScrollX(), -((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #136 <Method int View.getScrollX()>
	//   16   28:ineg            
	//   17   29:i2f             
	//   18   30:aload_3         
	//   19   31:invokevirtual   #139 <Method int View.getScrollY()>
	//   20   34:ineg            
	//   21   35:i2f             
	//   22   36:invokevirtual   #143 <Method boolean Matrix.preTranslate(float, float)>
	//   23   39:pop             
		}
		matrix.preTranslate(view.getLeft(), view.getTop());
	//   24   40:aload_2         
	//   25   41:aload_1         
	//   26   42:invokevirtual   #146 <Method int View.getLeft()>
	//   27   45:i2f             
	//   28   46:aload_1         
	//   29   47:invokevirtual   #149 <Method int View.getTop()>
	//   30   50:i2f             
	//   31   51:invokevirtual   #143 <Method boolean Matrix.preTranslate(float, float)>
	//   32   54:pop             
		view = ((View) (view.getMatrix()));
	//   33   55:aload_1         
	//   34   56:invokevirtual   #153 <Method Matrix View.getMatrix()>
	//   35   59:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  36   60:aload_1         
	//*  37   61:invokevirtual   #59  <Method boolean Matrix.isIdentity()>
	//*  38   64:ifne            73
			matrix.preConcat(((Matrix) (view)));
	//   39   67:aload_2         
	//   40   68:aload_1         
	//   41   69:invokevirtual   #157 <Method boolean Matrix.preConcat(Matrix)>
	//   42   72:pop             
	//   43   73:return          
	}

	public void transformMatrixToLocal(View view, Matrix matrix)
	{
		Object obj = ((Object) (view.getParent()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #131 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_3        
		if(obj instanceof View)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #16  <Class View>
	//*   5    9:ifeq            38
		{
			obj = ((Object) ((View)obj));
	//    6   12:aload_3         
	//    7   13:checkcast       #16  <Class View>
	//    8   16:astore_3        
			transformMatrixToLocal(((View) (obj)), matrix);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #160 <Method void transformMatrixToLocal(View, Matrix)>
			matrix.postTranslate(((View) (obj)).getScrollX(), ((View) (obj)).getScrollY());
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #136 <Method int View.getScrollX()>
	//   16   28:i2f             
	//   17   29:aload_3         
	//   18   30:invokevirtual   #139 <Method int View.getScrollY()>
	//   19   33:i2f             
	//   20   34:invokevirtual   #163 <Method boolean Matrix.postTranslate(float, float)>
	//   21   37:pop             
		}
		matrix.postTranslate(view.getLeft(), view.getTop());
	//   22   38:aload_2         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #146 <Method int View.getLeft()>
	//   25   43:i2f             
	//   26   44:aload_1         
	//   27   45:invokevirtual   #149 <Method int View.getTop()>
	//   28   48:i2f             
	//   29   49:invokevirtual   #163 <Method boolean Matrix.postTranslate(float, float)>
	//   30   52:pop             
		view = ((View) (view.getMatrix()));
	//   31   53:aload_1         
	//   32   54:invokevirtual   #153 <Method Matrix View.getMatrix()>
	//   33   57:astore_1        
		if(!((Matrix) (view)).isIdentity())
	//*  34   58:aload_1         
	//*  35   59:invokevirtual   #59  <Method boolean Matrix.isIdentity()>
	//*  36   62:ifne            87
		{
			Matrix matrix1 = new Matrix();
	//   37   65:new             #55  <Class Matrix>
	//   38   68:dup             
	//   39   69:invokespecial   #164 <Method void Matrix()>
	//   40   72:astore_3        
			if(((Matrix) (view)).invert(matrix1))
	//*  41   73:aload_1         
	//*  42   74:aload_3         
	//*  43   75:invokevirtual   #167 <Method boolean Matrix.invert(Matrix)>
	//*  44   78:ifeq            87
				matrix.postConcat(matrix1);
	//   45   81:aload_2         
	//   46   82:aload_3         
	//   47   83:invokevirtual   #170 <Method boolean Matrix.postConcat(Matrix)>
	//   48   86:pop             
		}
	//   49   87:return          
	}

	private float mMatrixValues[];
}
