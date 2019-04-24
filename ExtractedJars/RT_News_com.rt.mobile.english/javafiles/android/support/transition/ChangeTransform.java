// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			Transition, Styleable, TransitionValues, ViewUtils, 
//			GhostViewUtils, GhostViewImpl, MatrixUtils, FloatArrayEvaluator, 
//			PathMotion, PropertyValuesHolderUtils, AnimatorUtils, TransitionListenerAdapter

public class ChangeTransform extends Transition
{
	private static class GhostListener extends TransitionListenerAdapter
	{

		public void onTransitionEnd(Transition transition)
		{
			transition.removeListener(((Transition.TransitionListener) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #30  <Method Transition Transition.removeListener(Transition$TransitionListener)>
		//    3    5:pop             
			GhostViewUtils.removeGhost(mView);
		//    4    6:aload_0         
		//    5    7:getfield        #18  <Field View mView>
		//    6   10:invokestatic    #36  <Method void GhostViewUtils.removeGhost(View)>
			mView.setTag(R.id.transition_transform, ((Object) (null)));
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field View mView>
		//    9   17:getstatic       #42  <Field int R$id.transition_transform>
		//   10   20:aconst_null     
		//   11   21:invokevirtual   #48  <Method void View.setTag(int, Object)>
			mView.setTag(R.id.parent_matrix, ((Object) (null)));
		//   12   24:aload_0         
		//   13   25:getfield        #18  <Field View mView>
		//   14   28:getstatic       #51  <Field int R$id.parent_matrix>
		//   15   31:aconst_null     
		//   16   32:invokevirtual   #48  <Method void View.setTag(int, Object)>
		//   17   35:return          
		}

		public void onTransitionPause(Transition transition)
		{
			mGhostView.setVisibility(4);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field GhostViewImpl mGhostView>
		//    2    4:iconst_4        
		//    3    5:invokeinterface #59  <Method void GhostViewImpl.setVisibility(int)>
		//    4   10:return          
		}

		public void onTransitionResume(Transition transition)
		{
			mGhostView.setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field GhostViewImpl mGhostView>
		//    2    4:iconst_0        
		//    3    5:invokeinterface #59  <Method void GhostViewImpl.setVisibility(int)>
		//    4   10:return          
		}

		private GhostViewImpl mGhostView;
		private View mView;

		GhostListener(View view, GhostViewImpl ghostviewimpl)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void TransitionListenerAdapter()>
			mView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field View mView>
			mGhostView = ghostviewimpl;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field GhostViewImpl mGhostView>
		//    8   14:return          
		}
	}

	private static class PathAnimatorMatrix
	{

		private void setAnimationMatrix()
		{
			mValues[2] = mTranslationX;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field float[] mValues>
		//    2    4:iconst_2        
		//    3    5:aload_0         
		//    4    6:getfield        #37  <Field float mTranslationX>
		//    5    9:fastore         
			mValues[5] = mTranslationY;
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field float[] mValues>
		//    8   14:iconst_5        
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field float mTranslationY>
		//   11   19:fastore         
			mMatrix.setValues(mValues);
		//   12   20:aload_0         
		//   13   21:getfield        #26  <Field Matrix mMatrix>
		//   14   24:aload_0         
		//   15   25:getfield        #35  <Field float[] mValues>
		//   16   28:invokevirtual   #47  <Method void Matrix.setValues(float[])>
			ViewUtils.setAnimationMatrix(mView, mMatrix);
		//   17   31:aload_0         
		//   18   32:getfield        #28  <Field View mView>
		//   19   35:aload_0         
		//   20   36:getfield        #26  <Field Matrix mMatrix>
		//   21   39:invokestatic    #52  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
		//   22   42:return          
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

		PathAnimatorMatrix(View view, float af[])
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
			mTranslationX = mValues[2];
		//   15   31:aload_0         
		//   16   32:aload_0         
		//   17   33:getfield        #35  <Field float[] mValues>
		//   18   36:iconst_2        
		//   19   37:faload          
		//   20   38:putfield        #37  <Field float mTranslationX>
			mTranslationY = mValues[5];
		//   21   41:aload_0         
		//   22   42:aload_0         
		//   23   43:getfield        #35  <Field float[] mValues>
		//   24   46:iconst_5        
		//   25   47:faload          
		//   26   48:putfield        #39  <Field float mTranslationY>
			setAnimationMatrix();
		//   27   51:aload_0         
		//   28   52:invokespecial   #42  <Method void setAnimationMatrix()>
		//   29   55:return          
		}
	}

	private static class Transforms
	{

		public boolean equals(Object obj)
		{
			boolean flag = obj instanceof Transforms;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class ChangeTransform$Transforms>
		//    2    4:istore_2        
			boolean flag1 = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(!flag)
		//*   5    7:iload_2         
		//*   6    8:ifne            13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			obj = ((Object) ((Transforms)obj));
		//    9   13:aload_1         
		//   10   14:checkcast       #2   <Class ChangeTransform$Transforms>
		//   11   17:astore_1        
			flag = flag1;
		//   12   18:iload_3         
		//   13   19:istore_2        
			if(((Transforms) (obj)).mTranslationX == mTranslationX)
		//*  14   20:aload_1         
		//*  15   21:getfield        #29  <Field float mTranslationX>
		//*  16   24:aload_0         
		//*  17   25:getfield        #29  <Field float mTranslationX>
		//*  18   28:fcmpl           
		//*  19   29:ifne            132
			{
				flag = flag1;
		//   20   32:iload_3         
		//   21   33:istore_2        
				if(((Transforms) (obj)).mTranslationY == mTranslationY)
		//*  22   34:aload_1         
		//*  23   35:getfield        #34  <Field float mTranslationY>
		//*  24   38:aload_0         
		//*  25   39:getfield        #34  <Field float mTranslationY>
		//*  26   42:fcmpl           
		//*  27   43:ifne            132
				{
					flag = flag1;
		//   28   46:iload_3         
		//   29   47:istore_2        
					if(((Transforms) (obj)).mTranslationZ == mTranslationZ)
		//*  30   48:aload_1         
		//*  31   49:getfield        #42  <Field float mTranslationZ>
		//*  32   52:aload_0         
		//*  33   53:getfield        #42  <Field float mTranslationZ>
		//*  34   56:fcmpl           
		//*  35   57:ifne            132
					{
						flag = flag1;
		//   36   60:iload_3         
		//   37   61:istore_2        
						if(((Transforms) (obj)).mScaleX == mScaleX)
		//*  38   62:aload_1         
		//*  39   63:getfield        #47  <Field float mScaleX>
		//*  40   66:aload_0         
		//*  41   67:getfield        #47  <Field float mScaleX>
		//*  42   70:fcmpl           
		//*  43   71:ifne            132
						{
							flag = flag1;
		//   44   74:iload_3         
		//   45   75:istore_2        
							if(((Transforms) (obj)).mScaleY == mScaleY)
		//*  46   76:aload_1         
		//*  47   77:getfield        #52  <Field float mScaleY>
		//*  48   80:aload_0         
		//*  49   81:getfield        #52  <Field float mScaleY>
		//*  50   84:fcmpl           
		//*  51   85:ifne            132
							{
								flag = flag1;
		//   52   88:iload_3         
		//   53   89:istore_2        
								if(((Transforms) (obj)).mRotationX == mRotationX)
		//*  54   90:aload_1         
		//*  55   91:getfield        #57  <Field float mRotationX>
		//*  56   94:aload_0         
		//*  57   95:getfield        #57  <Field float mRotationX>
		//*  58   98:fcmpl           
		//*  59   99:ifne            132
								{
									flag = flag1;
		//   60  102:iload_3         
		//   61  103:istore_2        
									if(((Transforms) (obj)).mRotationY == mRotationY)
		//*  62  104:aload_1         
		//*  63  105:getfield        #62  <Field float mRotationY>
		//*  64  108:aload_0         
		//*  65  109:getfield        #62  <Field float mRotationY>
		//*  66  112:fcmpl           
		//*  67  113:ifne            132
									{
										flag = flag1;
		//   68  116:iload_3         
		//   69  117:istore_2        
										if(((Transforms) (obj)).mRotationZ == mRotationZ)
		//*  70  118:aload_1         
		//*  71  119:getfield        #67  <Field float mRotationZ>
		//*  72  122:aload_0         
		//*  73  123:getfield        #67  <Field float mRotationZ>
		//*  74  126:fcmpl           
		//*  75  127:ifne            132
											flag = true;
		//   76  130:iconst_1        
		//   77  131:istore_2        
									}
								}
							}
						}
					}
				}
			}
			return flag;
		//   78  132:iload_2         
		//   79  133:ireturn         
		}

		public int hashCode()
		{
			float f = mTranslationX;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field float mTranslationX>
		//    2    4:fstore_1        
			int l1 = 0;
		//    3    5:iconst_0        
		//    4    6:istore          9
			int i;
			if(f != 0.0F)
		//*   5    8:fload_1         
		//*   6    9:fconst_0        
		//*   7   10:fcmpl           
		//*   8   11:ifeq            25
				i = Float.floatToIntBits(mTranslationX);
		//    9   14:aload_0         
		//   10   15:getfield        #29  <Field float mTranslationX>
		//   11   18:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   12   21:istore_2        
			else
		//*  13   22:goto            27
				i = 0;
		//   14   25:iconst_0        
		//   15   26:istore_2        
			int j;
			if(mTranslationY != 0.0F)
		//*  16   27:aload_0         
		//*  17   28:getfield        #34  <Field float mTranslationY>
		//*  18   31:fconst_0        
		//*  19   32:fcmpl           
		//*  20   33:ifeq            47
				j = Float.floatToIntBits(mTranslationY);
		//   21   36:aload_0         
		//   22   37:getfield        #34  <Field float mTranslationY>
		//   23   40:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   24   43:istore_3        
			else
		//*  25   44:goto            49
				j = 0;
		//   26   47:iconst_0        
		//   27   48:istore_3        
			int k;
			if(mTranslationZ != 0.0F)
		//*  28   49:aload_0         
		//*  29   50:getfield        #42  <Field float mTranslationZ>
		//*  30   53:fconst_0        
		//*  31   54:fcmpl           
		//*  32   55:ifeq            70
				k = Float.floatToIntBits(mTranslationZ);
		//   33   58:aload_0         
		//   34   59:getfield        #42  <Field float mTranslationZ>
		//   35   62:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   36   65:istore          4
			else
		//*  37   67:goto            73
				k = 0;
		//   38   70:iconst_0        
		//   39   71:istore          4
			int l;
			if(mScaleX != 0.0F)
		//*  40   73:aload_0         
		//*  41   74:getfield        #47  <Field float mScaleX>
		//*  42   77:fconst_0        
		//*  43   78:fcmpl           
		//*  44   79:ifeq            94
				l = Float.floatToIntBits(mScaleX);
		//   45   82:aload_0         
		//   46   83:getfield        #47  <Field float mScaleX>
		//   47   86:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   48   89:istore          5
			else
		//*  49   91:goto            97
				l = 0;
		//   50   94:iconst_0        
		//   51   95:istore          5
			int i1;
			if(mScaleY != 0.0F)
		//*  52   97:aload_0         
		//*  53   98:getfield        #52  <Field float mScaleY>
		//*  54  101:fconst_0        
		//*  55  102:fcmpl           
		//*  56  103:ifeq            118
				i1 = Float.floatToIntBits(mScaleY);
		//   57  106:aload_0         
		//   58  107:getfield        #52  <Field float mScaleY>
		//   59  110:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   60  113:istore          6
			else
		//*  61  115:goto            121
				i1 = 0;
		//   62  118:iconst_0        
		//   63  119:istore          6
			int j1;
			if(mRotationX != 0.0F)
		//*  64  121:aload_0         
		//*  65  122:getfield        #57  <Field float mRotationX>
		//*  66  125:fconst_0        
		//*  67  126:fcmpl           
		//*  68  127:ifeq            142
				j1 = Float.floatToIntBits(mRotationX);
		//   69  130:aload_0         
		//   70  131:getfield        #57  <Field float mRotationX>
		//   71  134:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   72  137:istore          7
			else
		//*  73  139:goto            145
				j1 = 0;
		//   74  142:iconst_0        
		//   75  143:istore          7
			int k1;
			if(mRotationY != 0.0F)
		//*  76  145:aload_0         
		//*  77  146:getfield        #62  <Field float mRotationY>
		//*  78  149:fconst_0        
		//*  79  150:fcmpl           
		//*  80  151:ifeq            166
				k1 = Float.floatToIntBits(mRotationY);
		//   81  154:aload_0         
		//   82  155:getfield        #62  <Field float mRotationY>
		//   83  158:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   84  161:istore          8
			else
		//*  85  163:goto            169
				k1 = 0;
		//   86  166:iconst_0        
		//   87  167:istore          8
			if(mRotationZ != 0.0F)
		//*  88  169:aload_0         
		//*  89  170:getfield        #67  <Field float mRotationZ>
		//*  90  173:fconst_0        
		//*  91  174:fcmpl           
		//*  92  175:ifeq            187
				l1 = Float.floatToIntBits(mRotationZ);
		//   93  178:aload_0         
		//   94  179:getfield        #67  <Field float mRotationZ>
		//   95  182:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   96  185:istore          9
			return 31 * ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) + l1;
		//   97  187:bipush          31
		//   98  189:iload_2         
		//   99  190:bipush          31
		//  100  192:imul            
		//  101  193:iload_3         
		//  102  194:iadd            
		//  103  195:bipush          31
		//  104  197:imul            
		//  105  198:iload           4
		//  106  200:iadd            
		//  107  201:bipush          31
		//  108  203:imul            
		//  109  204:iload           5
		//  110  206:iadd            
		//  111  207:bipush          31
		//  112  209:imul            
		//  113  210:iload           6
		//  114  212:iadd            
		//  115  213:bipush          31
		//  116  215:imul            
		//  117  216:iload           7
		//  118  218:iadd            
		//  119  219:bipush          31
		//  120  221:imul            
		//  121  222:iload           8
		//  122  224:iadd            
		//  123  225:imul            
		//  124  226:iload           9
		//  125  228:iadd            
		//  126  229:ireturn         
		}

		public void restore(View view)
		{
			ChangeTransform.setTransforms(view, mTranslationX, mTranslationY, mTranslationZ, mScaleX, mScaleY, mRotationX, mRotationY, mRotationZ);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #29  <Field float mTranslationX>
		//    3    5:aload_0         
		//    4    6:getfield        #34  <Field float mTranslationY>
		//    5    9:aload_0         
		//    6   10:getfield        #42  <Field float mTranslationZ>
		//    7   13:aload_0         
		//    8   14:getfield        #47  <Field float mScaleX>
		//    9   17:aload_0         
		//   10   18:getfield        #52  <Field float mScaleY>
		//   11   21:aload_0         
		//   12   22:getfield        #57  <Field float mRotationX>
		//   13   25:aload_0         
		//   14   26:getfield        #62  <Field float mRotationY>
		//   15   29:aload_0         
		//   16   30:getfield        #67  <Field float mRotationZ>
		//   17   33:invokestatic    #83  <Method void ChangeTransform.access$200(View, float, float, float, float, float, float, float, float)>
		//   18   36:return          
		}

		final float mRotationX;
		final float mRotationY;
		final float mRotationZ;
		final float mScaleX;
		final float mScaleY;
		final float mTranslationX;
		final float mTranslationY;
		final float mTranslationZ;

		Transforms(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mTranslationX = view.getTranslationX();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #27  <Method float View.getTranslationX()>
		//    5    9:putfield        #29  <Field float mTranslationX>
			mTranslationY = view.getTranslationY();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #32  <Method float View.getTranslationY()>
		//    9   17:putfield        #34  <Field float mTranslationY>
			mTranslationZ = ViewCompat.getTranslationZ(view);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #40  <Method float ViewCompat.getTranslationZ(View)>
		//   13   25:putfield        #42  <Field float mTranslationZ>
			mScaleX = view.getScaleX();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #45  <Method float View.getScaleX()>
		//   17   33:putfield        #47  <Field float mScaleX>
			mScaleY = view.getScaleY();
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokevirtual   #50  <Method float View.getScaleY()>
		//   21   41:putfield        #52  <Field float mScaleY>
			mRotationX = view.getRotationX();
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokevirtual   #55  <Method float View.getRotationX()>
		//   25   49:putfield        #57  <Field float mRotationX>
			mRotationY = view.getRotationY();
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokevirtual   #60  <Method float View.getRotationY()>
		//   29   57:putfield        #62  <Field float mRotationY>
			mRotationZ = view.getRotation();
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:invokevirtual   #65  <Method float View.getRotation()>
		//   33   65:putfield        #67  <Field float mRotationZ>
		//   34   68:return          
		}
	}


	public ChangeTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Transition()>
		mUseOverlay = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #87  <Field boolean mUseOverlay>
		mReparent = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #89  <Field boolean mReparent>
		mTempMatrix = new Matrix();
	//    8   14:aload_0         
	//    9   15:new             #91  <Class Matrix>
	//   10   18:dup             
	//   11   19:invokespecial   #92  <Method void Matrix()>
	//   12   22:putfield        #94  <Field Matrix mTempMatrix>
	//   13   25:return          
	}

	public ChangeTransform(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #97  <Method void Transition(Context, AttributeSet)>
		mUseOverlay = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #87  <Field boolean mUseOverlay>
		mReparent = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #89  <Field boolean mReparent>
		mTempMatrix = new Matrix();
	//   10   16:aload_0         
	//   11   17:new             #91  <Class Matrix>
	//   12   20:dup             
	//   13   21:invokespecial   #92  <Method void Matrix()>
	//   14   24:putfield        #94  <Field Matrix mTempMatrix>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.CHANGE_TRANSFORM)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #103 <Field int[] Styleable.CHANGE_TRANSFORM>
	//   18   32:invokevirtual   #109 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   19   35:astore_1        
		attributeset = ((AttributeSet) ((XmlPullParser)attributeset));
	//   20   36:aload_2         
	//   21   37:checkcast       #111 <Class XmlPullParser>
	//   22   40:astore_2        
		mUseOverlay = TypedArrayUtils.getNamedBoolean(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "reparentWithOverlay", 1, true);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:ldc1            #113 <String "reparentWithOverlay">
	//   27   46:iconst_1        
	//   28   47:iconst_1        
	//   29   48:invokestatic    #119 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   30   51:putfield        #87  <Field boolean mUseOverlay>
		mReparent = TypedArrayUtils.getNamedBoolean(((TypedArray) (context)), ((XmlPullParser) (attributeset)), "reparent", 0, true);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:aload_2         
	//   34   57:ldc1            #121 <String "reparent">
	//   35   59:iconst_0        
	//   36   60:iconst_1        
	//   37   61:invokestatic    #119 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   38   64:putfield        #89  <Field boolean mReparent>
		((TypedArray) (context)).recycle();
	//   39   67:aload_1         
	//   40   68:invokevirtual   #126 <Method void TypedArray.recycle()>
	//   41   71:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #146 <Field View TransitionValues.view>
	//    2    4:astore_3        
		if(view.getVisibility() == 8)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #152 <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
			return;
	//    7   14:return          
		transitionvalues.values.put("android:changeTransform:parent", ((Object) (view.getParent())));
	//    8   15:aload_1         
	//    9   16:getfield        #156 <Field Map TransitionValues.values>
	//   10   19:ldc1            #35  <String "android:changeTransform:parent">
	//   11   21:aload_3         
	//   12   22:invokevirtual   #160 <Method android.view.ViewParent View.getParent()>
	//   13   25:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   14   30:pop             
		Object obj = ((Object) (new Transforms(view)));
	//   15   31:new             #18  <Class ChangeTransform$Transforms>
	//   16   34:dup             
	//   17   35:aload_3         
	//   18   36:invokespecial   #168 <Method void ChangeTransform$Transforms(View)>
	//   19   39:astore_2        
		transitionvalues.values.put("android:changeTransform:transforms", obj);
	//   20   40:aload_1         
	//   21   41:getfield        #156 <Field Map TransitionValues.values>
	//   22   44:ldc1            #41  <String "android:changeTransform:transforms">
	//   23   46:aload_2         
	//   24   47:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   25   52:pop             
		obj = ((Object) (view.getMatrix()));
	//   26   53:aload_3         
	//   27   54:invokevirtual   #172 <Method Matrix View.getMatrix()>
	//   28   57:astore_2        
		if(obj != null && !((Matrix) (obj)).isIdentity())
	//*  29   58:aload_2         
	//*  30   59:ifnull          84
	//*  31   62:aload_2         
	//*  32   63:invokevirtual   #176 <Method boolean Matrix.isIdentity()>
	//*  33   66:ifeq            72
	//*  34   69:goto            84
			obj = ((Object) (new Matrix(((Matrix) (obj)))));
	//   35   72:new             #91  <Class Matrix>
	//   36   75:dup             
	//   37   76:aload_2         
	//   38   77:invokespecial   #179 <Method void Matrix(Matrix)>
	//   39   80:astore_2        
		else
	//*  40   81:goto            86
			obj = null;
	//   41   84:aconst_null     
	//   42   85:astore_2        
		transitionvalues.values.put("android:changeTransform:matrix", obj);
	//   43   86:aload_1         
	//   44   87:getfield        #156 <Field Map TransitionValues.values>
	//   45   90:ldc1            #32  <String "android:changeTransform:matrix">
	//   46   92:aload_2         
	//   47   93:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   48   98:pop             
		if(mReparent)
	//*  49   99:aload_0         
	//*  50  100:getfield        #89  <Field boolean mReparent>
	//*  51  103:ifeq            199
		{
			Matrix matrix = new Matrix();
	//   52  106:new             #91  <Class Matrix>
	//   53  109:dup             
	//   54  110:invokespecial   #92  <Method void Matrix()>
	//   55  113:astore_2        
			ViewGroup viewgroup = (ViewGroup)view.getParent();
	//   56  114:aload_3         
	//   57  115:invokevirtual   #160 <Method android.view.ViewParent View.getParent()>
	//   58  118:checkcast       #181 <Class ViewGroup>
	//   59  121:astore          4
			ViewUtils.transformMatrixToGlobal(((View) (viewgroup)), matrix);
	//   60  123:aload           4
	//   61  125:aload_2         
	//   62  126:invokestatic    #187 <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
			matrix.preTranslate(-viewgroup.getScrollX(), -viewgroup.getScrollY());
	//   63  129:aload_2         
	//   64  130:aload           4
	//   65  132:invokevirtual   #190 <Method int ViewGroup.getScrollX()>
	//   66  135:ineg            
	//   67  136:i2f             
	//   68  137:aload           4
	//   69  139:invokevirtual   #193 <Method int ViewGroup.getScrollY()>
	//   70  142:ineg            
	//   71  143:i2f             
	//   72  144:invokevirtual   #197 <Method boolean Matrix.preTranslate(float, float)>
	//   73  147:pop             
			transitionvalues.values.put("android:changeTransform:parentMatrix", ((Object) (matrix)));
	//   74  148:aload_1         
	//   75  149:getfield        #156 <Field Map TransitionValues.values>
	//   76  152:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   77  154:aload_2         
	//   78  155:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   79  160:pop             
			transitionvalues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
	//   80  161:aload_1         
	//   81  162:getfield        #156 <Field Map TransitionValues.values>
	//   82  165:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//   83  167:aload_3         
	//   84  168:getstatic       #202 <Field int R$id.transition_transform>
	//   85  171:invokevirtual   #206 <Method Object View.getTag(int)>
	//   86  174:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   87  179:pop             
			transitionvalues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
	//   88  180:aload_1         
	//   89  181:getfield        #156 <Field Map TransitionValues.values>
	//   90  184:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//   91  186:aload_3         
	//   92  187:getstatic       #209 <Field int R$id.parent_matrix>
	//   93  190:invokevirtual   #206 <Method Object View.getTag(int)>
	//   94  193:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   95  198:pop             
		}
	//   96  199:return          
	}

	private void createGhostView(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		View view = transitionvalues1.view;
	//    0    0:aload_3         
	//    1    1:getfield        #146 <Field View TransitionValues.view>
	//    2    4:astore          4
		Object obj = ((Object) (new Matrix((Matrix)transitionvalues1.values.get("android:changeTransform:parentMatrix"))));
	//    3    6:new             #91  <Class Matrix>
	//    4    9:dup             
	//    5   10:aload_3         
	//    6   11:getfield        #156 <Field Map TransitionValues.values>
	//    7   14:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//    8   16:invokeinterface #215 <Method Object Map.get(Object)>
	//    9   21:checkcast       #91  <Class Matrix>
	//   10   24:invokespecial   #179 <Method void Matrix(Matrix)>
	//   11   27:astore          5
		ViewUtils.transformMatrixToLocal(((View) (viewgroup)), ((Matrix) (obj)));
	//   12   29:aload_1         
	//   13   30:aload           5
	//   14   32:invokestatic    #218 <Method void ViewUtils.transformMatrixToLocal(View, Matrix)>
		obj = ((Object) (GhostViewUtils.addGhost(view, viewgroup, ((Matrix) (obj)))));
	//   15   35:aload           4
	//   16   37:aload_1         
	//   17   38:aload           5
	//   18   40:invokestatic    #224 <Method GhostViewImpl GhostViewUtils.addGhost(View, ViewGroup, Matrix)>
	//   19   43:astore          5
		if(obj == null)
	//*  20   45:aload           5
	//*  21   47:ifnonnull       51
			return;
	//   22   50:return          
		((GhostViewImpl) (obj)).reserveEndViewTransition((ViewGroup)transitionvalues.values.get("android:changeTransform:parent"), transitionvalues.view);
	//   23   51:aload           5
	//   24   53:aload_2         
	//   25   54:getfield        #156 <Field Map TransitionValues.values>
	//   26   57:ldc1            #35  <String "android:changeTransform:parent">
	//   27   59:invokeinterface #215 <Method Object Map.get(Object)>
	//   28   64:checkcast       #181 <Class ViewGroup>
	//   29   67:aload_2         
	//   30   68:getfield        #146 <Field View TransitionValues.view>
	//   31   71:invokeinterface #230 <Method void GhostViewImpl.reserveEndViewTransition(ViewGroup, View)>
		for(viewgroup = ((ViewGroup) (this)); ((Transition) (viewgroup)).mParent != null; viewgroup = ((ViewGroup) (((Transition) (viewgroup)).mParent)));
	//   32   76:aload_0         
	//   33   77:astore_1        
	//   34   78:aload_1         
	//   35   79:getfield        #234 <Field TransitionSet Transition.mParent>
	//   36   82:ifnull          93
	//   37   85:aload_1         
	//   38   86:getfield        #234 <Field TransitionSet Transition.mParent>
	//   39   89:astore_1        
	//*  40   90:goto            78
		((Transition) (viewgroup)).addListener(((Transition.TransitionListener) (new GhostListener(view, ((GhostViewImpl) (obj))))));
	//   41   93:aload_1         
	//   42   94:new             #12  <Class ChangeTransform$GhostListener>
	//   43   97:dup             
	//   44   98:aload           4
	//   45  100:aload           5
	//   46  102:invokespecial   #237 <Method void ChangeTransform$GhostListener(View, GhostViewImpl)>
	//   47  105:invokevirtual   #241 <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   48  108:pop             
		if(SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*  49  109:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  50  112:ifeq            140
		{
			if(transitionvalues.view != transitionvalues1.view)
	//*  51  115:aload_2         
	//*  52  116:getfield        #146 <Field View TransitionValues.view>
	//*  53  119:aload_3         
	//*  54  120:getfield        #146 <Field View TransitionValues.view>
	//*  55  123:if_acmpeq       134
				ViewUtils.setTransitionAlpha(transitionvalues.view, 0.0F);
	//   56  126:aload_2         
	//   57  127:getfield        #146 <Field View TransitionValues.view>
	//   58  130:fconst_0        
	//   59  131:invokestatic    #245 <Method void ViewUtils.setTransitionAlpha(View, float)>
			ViewUtils.setTransitionAlpha(view, 1.0F);
	//   60  134:aload           4
	//   61  136:fconst_1        
	//   62  137:invokestatic    #245 <Method void ViewUtils.setTransitionAlpha(View, float)>
		}
	//   63  140:return          
	}

	private ObjectAnimator createTransformAnimator(final TransitionValues finalEndMatrix, final TransitionValues view, final boolean handleParentChange)
	{
		finalEndMatrix = ((TransitionValues) ((Matrix)finalEndMatrix.values.get("android:changeTransform:matrix")));
	//    0    0:aload_1         
	//    1    1:getfield        #156 <Field Map TransitionValues.values>
	//    2    4:ldc1            #32  <String "android:changeTransform:matrix">
	//    3    6:invokeinterface #215 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore_1        
		Matrix matrix = (Matrix)view.values.get("android:changeTransform:matrix");
	//    6   15:aload_2         
	//    7   16:getfield        #156 <Field Map TransitionValues.values>
	//    8   19:ldc1            #32  <String "android:changeTransform:matrix">
	//    9   21:invokeinterface #215 <Method Object Map.get(Object)>
	//   10   26:checkcast       #91  <Class Matrix>
	//   11   29:astore          5
		final PathAnimatorMatrix pathAnimatorMatrix = ((PathAnimatorMatrix) (finalEndMatrix));
	//   12   31:aload_1         
	//   13   32:astore          4
		if(finalEndMatrix == null)
	//*  14   34:aload_1         
	//*  15   35:ifnonnull       43
			pathAnimatorMatrix = ((PathAnimatorMatrix) (MatrixUtils.IDENTITY_MATRIX));
	//   16   38:getstatic       #252 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   17   41:astore          4
		finalEndMatrix = ((TransitionValues) (matrix));
	//   18   43:aload           5
	//   19   45:astore_1        
		if(matrix == null)
	//*  20   46:aload           5
	//*  21   48:ifnonnull       55
			finalEndMatrix = ((TransitionValues) (MatrixUtils.IDENTITY_MATRIX));
	//   22   51:getstatic       #252 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   23   54:astore_1        
		if(((Matrix) (pathAnimatorMatrix)).equals(((Object) (finalEndMatrix))))
	//*  24   55:aload           4
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #256 <Method boolean Matrix.equals(Object)>
	//*  27   61:ifeq            66
		{
			return null;
	//   28   64:aconst_null     
	//   29   65:areturn         
		} else
		{
			final Transforms transforms = (Transforms)view.values.get("android:changeTransform:transforms");
	//   30   66:aload_2         
	//   31   67:getfield        #156 <Field Map TransitionValues.values>
	//   32   70:ldc1            #41  <String "android:changeTransform:transforms">
	//   33   72:invokeinterface #215 <Method Object Map.get(Object)>
	//   34   77:checkcast       #18  <Class ChangeTransform$Transforms>
	//   35   80:astore          5
			view = ((TransitionValues) (view.view));
	//   36   82:aload_2         
	//   37   83:getfield        #146 <Field View TransitionValues.view>
	//   38   86:astore_2        
			setIdentityTransforms(((View) (view)));
	//   39   87:aload_2         
	//   40   88:invokestatic    #133 <Method void setIdentityTransforms(View)>
			float af[] = new float[9];
	//   41   91:bipush          9
	//   42   93:newarray        float[]
	//   43   95:astore          6
			((Matrix) (pathAnimatorMatrix)).getValues(af);
	//   44   97:aload           4
	//   45   99:aload           6
	//   46  101:invokevirtual   #260 <Method void Matrix.getValues(float[])>
			float af1[] = new float[9];
	//   47  104:bipush          9
	//   48  106:newarray        float[]
	//   49  108:astore          8
			((Matrix) (finalEndMatrix)).getValues(af1);
	//   50  110:aload_1         
	//   51  111:aload           8
	//   52  113:invokevirtual   #260 <Method void Matrix.getValues(float[])>
			pathAnimatorMatrix = new PathAnimatorMatrix(((View) (view)), af);
	//   53  116:new             #15  <Class ChangeTransform$PathAnimatorMatrix>
	//   54  119:dup             
	//   55  120:aload_2         
	//   56  121:aload           6
	//   57  123:invokespecial   #263 <Method void ChangeTransform$PathAnimatorMatrix(View, float[])>
	//   58  126:astore          4
			PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, ((android.animation.TypeEvaluator) (new FloatArrayEvaluator(new float[9]))), ((Object []) (new float[][] {
				af, af1
			})));
	//   59  128:getstatic       #67  <Field Property NON_TRANSLATIONS_PROPERTY>
	//   60  131:new             #265 <Class FloatArrayEvaluator>
	//   61  134:dup             
	//   62  135:bipush          9
	//   63  137:newarray        float[]
	//   64  139:invokespecial   #267 <Method void FloatArrayEvaluator(float[])>
	//   65  142:iconst_2        
	//   66  143:anewarray       float[][]
	//   67  146:dup             
	//   68  147:iconst_0        
	//   69  148:aload           6
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_1        
	//   73  153:aload           8
	//   74  155:aastore         
	//   75  156:invokestatic    #273 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeEvaluator, Object[])>
	//   76  159:astore          7
			Object obj = ((Object) (getPathMotion().getPath(af[2], af[5], af1[2], af1[5])));
	//   77  161:aload_0         
	//   78  162:invokevirtual   #277 <Method PathMotion getPathMotion()>
	//   79  165:aload           6
	//   80  167:iconst_2        
	//   81  168:faload          
	//   82  169:aload           6
	//   83  171:iconst_5        
	//   84  172:faload          
	//   85  173:aload           8
	//   86  175:iconst_2        
	//   87  176:faload          
	//   88  177:aload           8
	//   89  179:iconst_5        
	//   90  180:faload          
	//   91  181:invokevirtual   #283 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//   92  184:astore          6
			obj = ((Object) (ObjectAnimator.ofPropertyValuesHolder(((Object) (pathAnimatorMatrix)), new PropertyValuesHolder[] {
				propertyvaluesholder, PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, ((android.graphics.Path) (obj)))
			})));
	//   93  186:aload           4
	//   94  188:iconst_2        
	//   95  189:anewarray       PropertyValuesHolder[]
	//   96  192:dup             
	//   97  193:iconst_0        
	//   98  194:aload           7
	//   99  196:aastore         
	//  100  197:dup             
	//  101  198:iconst_1        
	//  102  199:getstatic       #74  <Field Property TRANSLATIONS_PROPERTY>
	//  103  202:aload           6
	//  104  204:invokestatic    #289 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//  105  207:aastore         
	//  106  208:invokestatic    #295 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  107  211:astore          6
			finalEndMatrix = ((TransitionValues) (new AnimatorListenerAdapter() {

				private void setCurrentMatrix(Matrix matrix1)
				{
					mTempMatrix.set(matrix1);
				//    0    0:aload_0         
				//    1    1:getfield        #45  <Field Matrix mTempMatrix>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #51  <Method void Matrix.set(Matrix)>
					view.setTag(R.id.transition_transform, ((Object) (mTempMatrix)));
				//    4    8:aload_0         
				//    5    9:getfield        #33  <Field View val$view>
				//    6   12:getstatic       #57  <Field int R$id.transition_transform>
				//    7   15:aload_0         
				//    8   16:getfield        #45  <Field Matrix mTempMatrix>
				//    9   19:invokevirtual   #63  <Method void View.setTag(int, Object)>
					transforms.restore(view);
				//   10   22:aload_0         
				//   11   23:getfield        #35  <Field ChangeTransform$Transforms val$transforms>
				//   12   26:aload_0         
				//   13   27:getfield        #33  <Field View val$view>
				//   14   30:invokevirtual   #69  <Method void ChangeTransform$Transforms.restore(View)>
				//   15   33:return          
				}

				public void onAnimationCancel(Animator animator)
				{
					mIsCanceled = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #73  <Field boolean mIsCanceled>
				//    3    5:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					if(!mIsCanceled)
				//*   0    0:aload_0         
				//*   1    1:getfield        #73  <Field boolean mIsCanceled>
				//*   2    4:ifne            57
						if(handleParentChange && mUseOverlay)
				//*   3    7:aload_0         
				//*   4    8:getfield        #29  <Field boolean val$handleParentChange>
				//*   5   11:ifeq            35
				//*   6   14:aload_0         
				//*   7   15:getfield        #27  <Field ChangeTransform this$0>
				//*   8   18:invokestatic    #78  <Method boolean ChangeTransform.access$000(ChangeTransform)>
				//*   9   21:ifeq            35
						{
							setCurrentMatrix(finalEndMatrix);
				//   10   24:aload_0         
				//   11   25:aload_0         
				//   12   26:getfield        #31  <Field Matrix val$finalEndMatrix>
				//   13   29:invokespecial   #80  <Method void setCurrentMatrix(Matrix)>
						} else
				//*  14   32:goto            57
						{
							view.setTag(R.id.transition_transform, ((Object) (null)));
				//   15   35:aload_0         
				//   16   36:getfield        #33  <Field View val$view>
				//   17   39:getstatic       #57  <Field int R$id.transition_transform>
				//   18   42:aconst_null     
				//   19   43:invokevirtual   #63  <Method void View.setTag(int, Object)>
							view.setTag(R.id.parent_matrix, ((Object) (null)));
				//   20   46:aload_0         
				//   21   47:getfield        #33  <Field View val$view>
				//   22   50:getstatic       #83  <Field int R$id.parent_matrix>
				//   23   53:aconst_null     
				//   24   54:invokevirtual   #63  <Method void View.setTag(int, Object)>
						}
					ViewUtils.setAnimationMatrix(view, ((Matrix) (null)));
				//   25   57:aload_0         
				//   26   58:getfield        #33  <Field View val$view>
				//   27   61:aconst_null     
				//   28   62:invokestatic    #89  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
					transforms.restore(view);
				//   29   65:aload_0         
				//   30   66:getfield        #35  <Field ChangeTransform$Transforms val$transforms>
				//   31   69:aload_0         
				//   32   70:getfield        #33  <Field View val$view>
				//   33   73:invokevirtual   #69  <Method void ChangeTransform$Transforms.restore(View)>
				//   34   76:return          
				}

				public void onAnimationPause(Animator animator)
				{
					setCurrentMatrix(pathAnimatorMatrix.getMatrix());
				//    0    0:aload_0         
				//    1    1:aload_0         
				//    2    2:getfield        #37  <Field ChangeTransform$PathAnimatorMatrix val$pathAnimatorMatrix>
				//    3    5:invokevirtual   #96  <Method Matrix ChangeTransform$PathAnimatorMatrix.getMatrix()>
				//    4    8:invokespecial   #80  <Method void setCurrentMatrix(Matrix)>
				//    5   11:return          
				}

				public void onAnimationResume(Animator animator)
				{
					ChangeTransform.setIdentityTransforms(view);
				//    0    0:aload_0         
				//    1    1:getfield        #33  <Field View val$view>
				//    2    4:invokestatic    #100 <Method void ChangeTransform.access$100(View)>
				//    3    7:return          
				}

				private boolean mIsCanceled;
				private Matrix mTempMatrix;
				final ChangeTransform this$0;
				final Matrix val$finalEndMatrix;
				final boolean val$handleParentChange;
				final PathAnimatorMatrix val$pathAnimatorMatrix;
				final Transforms val$transforms;
				final View val$view;

			
			{
				this$0 = ChangeTransform.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field ChangeTransform this$0>
				handleParentChange = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field boolean val$handleParentChange>
				finalEndMatrix = matrix;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Matrix val$finalEndMatrix>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field View val$view>
				transforms = transforms1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field ChangeTransform$Transforms val$transforms>
				pathAnimatorMatrix = pathanimatormatrix;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #37  <Field ChangeTransform$PathAnimatorMatrix val$pathAnimatorMatrix>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #40  <Method void AnimatorListenerAdapter()>
				mTempMatrix = new Matrix();
			//   20   37:aload_0         
			//   21   38:new             #42  <Class Matrix>
			//   22   41:dup             
			//   23   42:invokespecial   #43  <Method void Matrix()>
			//   24   45:putfield        #45  <Field Matrix mTempMatrix>
			//   25   48:return          
			}
			}
));
	//  108  213:new             #10  <Class ChangeTransform$3>
	//  109  216:dup             
	//  110  217:aload_0         
	//  111  218:iload_3         
	//  112  219:aload_1         
	//  113  220:aload_2         
	//  114  221:aload           5
	//  115  223:aload           4
	//  116  225:invokespecial   #298 <Method void ChangeTransform$3(ChangeTransform, boolean, Matrix, View, ChangeTransform$Transforms, ChangeTransform$PathAnimatorMatrix)>
	//  117  228:astore_1        
			((ObjectAnimator) (obj)).addListener(((android.animation.Animator.AnimatorListener) (finalEndMatrix)));
	//  118  229:aload           6
	//  119  231:aload_1         
	//  120  232:invokevirtual   #301 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			AnimatorUtils.addPauseListener(((Animator) (obj)), ((AnimatorListenerAdapter) (finalEndMatrix)));
	//  121  235:aload           6
	//  122  237:aload_1         
	//  123  238:invokestatic    #307 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
			return ((ObjectAnimator) (obj));
	//  124  241:aload           6
	//  125  243:areturn         
		}
	}

	private boolean parentsMatch(ViewGroup viewgroup, ViewGroup viewgroup1)
	{
		return isValidTarget(((View) (viewgroup))) && isValidTarget(((View) (viewgroup1))) ? (viewgroup = ((ViewGroup) (getMatchedTransitionValues(((View) (viewgroup)), true)))) == null || viewgroup1 != ((TransitionValues) (viewgroup)).view : viewgroup != viewgroup1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #313 <Method boolean isValidTarget(View)>
	//    3    5:ifeq            40
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #313 <Method boolean isValidTarget(View)>
	//    7   13:ifne            19
	//    8   16:goto            40
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #317 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//   13   25:astore_1        
	//   14   26:aload_1         
	//   15   27:ifnull          48
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:getfield        #146 <Field View TransitionValues.view>
	//   19   35:if_acmpne       48
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:if_acmpne       48
	//   25   45:goto            38
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	private static void setIdentityTransforms(View view)
	{
		setTransforms(view, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_1        
	//    5    5:fconst_1        
	//    6    6:fconst_0        
	//    7    7:fconst_0        
	//    8    8:fconst_0        
	//    9    9:invokestatic    #138 <Method void setTransforms(View, float, float, float, float, float, float, float, float)>
	//   10   12:return          
	}

	private void setMatricesForParent(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		Matrix matrix = (Matrix)transitionvalues1.values.get("android:changeTransform:parentMatrix");
	//    0    0:aload_2         
	//    1    1:getfield        #156 <Field Map TransitionValues.values>
	//    2    4:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//    3    6:invokeinterface #215 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore_3        
		transitionvalues1.view.setTag(R.id.parent_matrix, ((Object) (matrix)));
	//    6   15:aload_2         
	//    7   16:getfield        #146 <Field View TransitionValues.view>
	//    8   19:getstatic       #209 <Field int R$id.parent_matrix>
	//    9   22:aload_3         
	//   10   23:invokevirtual   #323 <Method void View.setTag(int, Object)>
		Matrix matrix1 = mTempMatrix;
	//   11   26:aload_0         
	//   12   27:getfield        #94  <Field Matrix mTempMatrix>
	//   13   30:astore          4
		matrix1.reset();
	//   14   32:aload           4
	//   15   34:invokevirtual   #326 <Method void Matrix.reset()>
		matrix.invert(matrix1);
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokevirtual   #330 <Method boolean Matrix.invert(Matrix)>
	//   19   43:pop             
		matrix = (Matrix)transitionvalues.values.get("android:changeTransform:matrix");
	//   20   44:aload_1         
	//   21   45:getfield        #156 <Field Map TransitionValues.values>
	//   22   48:ldc1            #32  <String "android:changeTransform:matrix">
	//   23   50:invokeinterface #215 <Method Object Map.get(Object)>
	//   24   55:checkcast       #91  <Class Matrix>
	//   25   58:astore_3        
		transitionvalues1 = ((TransitionValues) (matrix));
	//   26   59:aload_3         
	//   27   60:astore_2        
		if(matrix == null)
	//*  28   61:aload_3         
	//*  29   62:ifnonnull       86
		{
			transitionvalues1 = ((TransitionValues) (new Matrix()));
	//   30   65:new             #91  <Class Matrix>
	//   31   68:dup             
	//   32   69:invokespecial   #92  <Method void Matrix()>
	//   33   72:astore_2        
			transitionvalues.values.put("android:changeTransform:matrix", ((Object) (transitionvalues1)));
	//   34   73:aload_1         
	//   35   74:getfield        #156 <Field Map TransitionValues.values>
	//   36   77:ldc1            #32  <String "android:changeTransform:matrix">
	//   37   79:aload_2         
	//   38   80:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   39   85:pop             
		}
		((Matrix) (transitionvalues1)).postConcat((Matrix)transitionvalues.values.get("android:changeTransform:parentMatrix"));
	//   40   86:aload_2         
	//   41   87:aload_1         
	//   42   88:getfield        #156 <Field Map TransitionValues.values>
	//   43   91:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   44   93:invokeinterface #215 <Method Object Map.get(Object)>
	//   45   98:checkcast       #91  <Class Matrix>
	//   46  101:invokevirtual   #333 <Method boolean Matrix.postConcat(Matrix)>
	//   47  104:pop             
		((Matrix) (transitionvalues1)).postConcat(matrix1);
	//   48  105:aload_2         
	//   49  106:aload           4
	//   50  108:invokevirtual   #333 <Method boolean Matrix.postConcat(Matrix)>
	//   51  111:pop             
	//   52  112:return          
	}

	private static void setTransforms(View view, float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			float f7)
	{
		view.setTranslationX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #337 <Method void View.setTranslationX(float)>
		view.setTranslationY(f1);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #340 <Method void View.setTranslationY(float)>
		ViewCompat.setTranslationZ(view, f2);
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:invokestatic    #345 <Method void ViewCompat.setTranslationZ(View, float)>
		view.setScaleX(f3);
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:invokevirtual   #348 <Method void View.setScaleX(float)>
		view.setScaleY(f4);
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:invokevirtual   #351 <Method void View.setScaleY(float)>
		view.setRotationX(f5);
	//   15   27:aload_0         
	//   16   28:fload           6
	//   17   30:invokevirtual   #354 <Method void View.setRotationX(float)>
		view.setRotationY(f6);
	//   18   33:aload_0         
	//   19   34:fload           7
	//   20   36:invokevirtual   #357 <Method void View.setRotationY(float)>
		view.setRotation(f7);
	//   21   39:aload_0         
	//   22   40:fload           8
	//   23   42:invokevirtual   #360 <Method void View.setRotation(float)>
	//   24   45:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #364 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #364 <Method void captureValues(TransitionValues)>
		if(!SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*   3    5:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*   4    8:ifne            28
			((ViewGroup)transitionvalues.view.getParent()).startViewTransition(transitionvalues.view);
	//    5   11:aload_1         
	//    6   12:getfield        #146 <Field View TransitionValues.view>
	//    7   15:invokevirtual   #160 <Method android.view.ViewParent View.getParent()>
	//    8   18:checkcast       #181 <Class ViewGroup>
	//    9   21:aload_1         
	//   10   22:getfield        #146 <Field View TransitionValues.view>
	//   11   25:invokevirtual   #369 <Method void ViewGroup.startViewTransition(View)>
	//   12   28:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues != null && transitionvalues1 != null && transitionvalues.values.containsKey("android:changeTransform:parent") && transitionvalues1.values.containsKey("android:changeTransform:parent"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          234
	//*   2    4:aload_3         
	//*   3    5:ifnull          234
	//*   4    8:aload_2         
	//*   5    9:getfield        #156 <Field Map TransitionValues.values>
	//*   6   12:ldc1            #35  <String "android:changeTransform:parent">
	//*   7   14:invokeinterface #374 <Method boolean Map.containsKey(Object)>
	//*   8   19:ifeq            234
	//*   9   22:aload_3         
	//*  10   23:getfield        #156 <Field Map TransitionValues.values>
	//*  11   26:ldc1            #35  <String "android:changeTransform:parent">
	//*  12   28:invokeinterface #374 <Method boolean Map.containsKey(Object)>
	//*  13   33:ifne            39
	//*  14   36:goto            234
		{
			ViewGroup viewgroup1 = (ViewGroup)transitionvalues.values.get("android:changeTransform:parent");
	//   15   39:aload_2         
	//   16   40:getfield        #156 <Field Map TransitionValues.values>
	//   17   43:ldc1            #35  <String "android:changeTransform:parent">
	//   18   45:invokeinterface #215 <Method Object Map.get(Object)>
	//   19   50:checkcast       #181 <Class ViewGroup>
	//   20   53:astore          5
			Object obj = ((Object) ((ViewGroup)transitionvalues1.values.get("android:changeTransform:parent")));
	//   21   55:aload_3         
	//   22   56:getfield        #156 <Field Map TransitionValues.values>
	//   23   59:ldc1            #35  <String "android:changeTransform:parent">
	//   24   61:invokeinterface #215 <Method Object Map.get(Object)>
	//   25   66:checkcast       #181 <Class ViewGroup>
	//   26   69:astore          6
			boolean flag;
			if(mReparent && !parentsMatch(viewgroup1, ((ViewGroup) (obj))))
	//*  27   71:aload_0         
	//*  28   72:getfield        #89  <Field boolean mReparent>
	//*  29   75:ifeq            95
	//*  30   78:aload_0         
	//*  31   79:aload           5
	//*  32   81:aload           6
	//*  33   83:invokespecial   #376 <Method boolean parentsMatch(ViewGroup, ViewGroup)>
	//*  34   86:ifne            95
				flag = true;
	//   35   89:iconst_1        
	//   36   90:istore          4
			else
	//*  37   92:goto            98
				flag = false;
	//   38   95:iconst_0        
	//   39   96:istore          4
			obj = ((Object) ((Matrix)transitionvalues.values.get("android:changeTransform:intermediateMatrix")));
	//   40   98:aload_2         
	//   41   99:getfield        #156 <Field Map TransitionValues.values>
	//   42  102:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//   43  104:invokeinterface #215 <Method Object Map.get(Object)>
	//   44  109:checkcast       #91  <Class Matrix>
	//   45  112:astore          6
			if(obj != null)
	//*  46  114:aload           6
	//*  47  116:ifnull          133
				transitionvalues.values.put("android:changeTransform:matrix", obj);
	//   48  119:aload_2         
	//   49  120:getfield        #156 <Field Map TransitionValues.values>
	//   50  123:ldc1            #32  <String "android:changeTransform:matrix">
	//   51  125:aload           6
	//   52  127:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   53  132:pop             
			obj = ((Object) ((Matrix)transitionvalues.values.get("android:changeTransform:intermediateParentMatrix")));
	//   54  133:aload_2         
	//   55  134:getfield        #156 <Field Map TransitionValues.values>
	//   56  137:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//   57  139:invokeinterface #215 <Method Object Map.get(Object)>
	//   58  144:checkcast       #91  <Class Matrix>
	//   59  147:astore          6
			if(obj != null)
	//*  60  149:aload           6
	//*  61  151:ifnull          168
				transitionvalues.values.put("android:changeTransform:parentMatrix", obj);
	//   62  154:aload_2         
	//   63  155:getfield        #156 <Field Map TransitionValues.values>
	//   64  158:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   65  160:aload           6
	//   66  162:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   67  167:pop             
			if(flag)
	//*  68  168:iload           4
	//*  69  170:ifeq            179
				setMatricesForParent(transitionvalues, transitionvalues1);
	//   70  173:aload_0         
	//   71  174:aload_2         
	//   72  175:aload_3         
	//   73  176:invokespecial   #378 <Method void setMatricesForParent(TransitionValues, TransitionValues)>
			obj = ((Object) (createTransformAnimator(transitionvalues, transitionvalues1, flag)));
	//   74  179:aload_0         
	//   75  180:aload_2         
	//   76  181:aload_3         
	//   77  182:iload           4
	//   78  184:invokespecial   #380 <Method ObjectAnimator createTransformAnimator(TransitionValues, TransitionValues, boolean)>
	//   79  187:astore          6
			if(flag && obj != null && mUseOverlay)
	//*  80  189:iload           4
	//*  81  191:ifeq            216
	//*  82  194:aload           6
	//*  83  196:ifnull          216
	//*  84  199:aload_0         
	//*  85  200:getfield        #87  <Field boolean mUseOverlay>
	//*  86  203:ifeq            216
			{
				createGhostView(viewgroup, transitionvalues, transitionvalues1);
	//   87  206:aload_0         
	//   88  207:aload_1         
	//   89  208:aload_2         
	//   90  209:aload_3         
	//   91  210:invokespecial   #382 <Method void createGhostView(ViewGroup, TransitionValues, TransitionValues)>
				return ((Animator) (obj));
	//   92  213:aload           6
	//   93  215:areturn         
			}
			if(!SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*  94  216:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  95  219:ifne            231
				viewgroup1.endViewTransition(transitionvalues.view);
	//   96  222:aload           5
	//   97  224:aload_2         
	//   98  225:getfield        #146 <Field View TransitionValues.view>
	//   99  228:invokevirtual   #385 <Method void ViewGroup.endViewTransition(View)>
			return ((Animator) (obj));
	//  100  231:aload           6
	//  101  233:areturn         
		} else
		{
			return null;
	//  102  234:aconst_null     
	//  103  235:areturn         
		}
	}

	public boolean getReparent()
	{
		return mReparent;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean mReparent>
	//    2    4:ireturn         
	}

	public boolean getReparentWithOverlay()
	{
		return mUseOverlay;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean mUseOverlay>
	//    2    4:ireturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #57  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	public void setReparent(boolean flag)
	{
		mReparent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean mReparent>
	//    3    5:return          
	}

	public void setReparentWithOverlay(boolean flag)
	{
		mUseOverlay = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean mUseOverlay>
	//    3    5:return          
	}

	private static final Property NON_TRANSLATIONS_PROPERTY = new Property([F, "nonTranslations") {

		public volatile Object get(Object obj)
		{
			return ((Object) (get((PathAnimatorMatrix)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class ChangeTransform$PathAnimatorMatrix>
		//    3    5:invokevirtual   #19  <Method float[] get(ChangeTransform$PathAnimatorMatrix)>
		//    4    8:areturn         
		}

		public float[] get(PathAnimatorMatrix pathanimatormatrix)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void set(PathAnimatorMatrix pathanimatormatrix, float af[])
		{
			pathanimatormatrix.setValues(af);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #25  <Method void ChangeTransform$PathAnimatorMatrix.setValues(float[])>
		//    3    5:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((PathAnimatorMatrix)obj, (float[])obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class ChangeTransform$PathAnimatorMatrix>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class float[]>
		//    5    9:invokevirtual   #30  <Method void set(ChangeTransform$PathAnimatorMatrix, float[])>
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
	private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
	private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
	private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
	private static final String PROPNAME_PARENT = "android:changeTransform:parent";
	private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
	private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
	private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION;
	private static final Property TRANSLATIONS_PROPERTY = new Property(android/graphics/PointF, "translations") {

		public PointF get(PathAnimatorMatrix pathanimatormatrix)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((PathAnimatorMatrix)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeTransform$PathAnimatorMatrix>
		//    3    5:invokevirtual   #19  <Method PointF get(ChangeTransform$PathAnimatorMatrix)>
		//    4    8:areturn         
		}

		public void set(PathAnimatorMatrix pathanimatormatrix, PointF pointf)
		{
			pathanimatormatrix.setTranslation(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #25  <Method void ChangeTransform$PathAnimatorMatrix.setTranslation(PointF)>
		//    3    5:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((PathAnimatorMatrix)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeTransform$PathAnimatorMatrix>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class PointF>
		//    5    9:invokevirtual   #30  <Method void set(ChangeTransform$PathAnimatorMatrix, PointF)>
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
	private static final String sTransitionProperties[] = {
		"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"
	};
	private boolean mReparent;
	private Matrix mTempMatrix;
	private boolean mUseOverlay;

	static 
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_0        
	//    2    2:iconst_3        
	//    3    3:anewarray       String[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:ldc1            #32  <String "android:changeTransform:matrix">
	//    7   10:aastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:ldc1            #41  <String "android:changeTransform:transforms">
	//   11   15:aastore         
	//   12   16:dup             
	//   13   17:iconst_2        
	//   14   18:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   15   20:aastore         
	//   16   21:putstatic       #57  <Field String[] sTransitionProperties>
	//   17   24:new             #6   <Class ChangeTransform$1>
	//   18   27:dup             
	//   19   28:ldc1            #59  <Class float[]>
	//   20   30:ldc1            #61  <String "nonTranslations">
	//   21   32:invokespecial   #65  <Method void ChangeTransform$1(Class, String)>
	//   22   35:putstatic       #67  <Field Property NON_TRANSLATIONS_PROPERTY>
	//   23   38:new             #8   <Class ChangeTransform$2>
	//   24   41:dup             
	//   25   42:ldc1            #69  <Class PointF>
	//   26   44:ldc1            #71  <String "translations">
	//   27   46:invokespecial   #72  <Method void ChangeTransform$2(Class, String)>
	//   28   49:putstatic       #74  <Field Property TRANSLATIONS_PROPERTY>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  29   52:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   55:bipush          21
	//*  31   57:icmplt          62
			flag = true;
	//   32   60:iconst_1        
	//   33   61:istore_0        
		SUPPORTS_VIEW_REMOVAL_SUPPRESSION = flag;
	//   34   62:iload_0         
	//   35   63:putstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  36   66:return          
	}


/*
	static boolean access$000(ChangeTransform changetransform)
	{
		return changetransform.mUseOverlay;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean mUseOverlay>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(View view)
	{
		setIdentityTransforms(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method void setIdentityTransforms(View)>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$200(View view, float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			float f7)
	{
		setTransforms(view, f, f1, f2, f3, f4, f5, f6, f7);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:fload           7
	//    8   12:fload           8
	//    9   14:invokestatic    #138 <Method void setTransforms(View, float, float, float, float, float, float, float, float)>
		return;
	//   10   17:return          
	}

*/
}
