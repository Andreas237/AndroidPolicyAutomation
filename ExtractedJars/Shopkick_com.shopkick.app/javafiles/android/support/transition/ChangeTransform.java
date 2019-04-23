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
		//*   8   11:ifeq            22
				i = Float.floatToIntBits(f);
		//    9   14:fload_1         
		//   10   15:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   11   18:istore_2        
			else
		//*  12   19:goto            24
				i = 0;
		//   13   22:iconst_0        
		//   14   23:istore_2        
			f = mTranslationY;
		//   15   24:aload_0         
		//   16   25:getfield        #34  <Field float mTranslationY>
		//   17   28:fstore_1        
			int j;
			if(f != 0.0F)
		//*  18   29:fload_1         
		//*  19   30:fconst_0        
		//*  20   31:fcmpl           
		//*  21   32:ifeq            43
				j = Float.floatToIntBits(f);
		//   22   35:fload_1         
		//   23   36:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   24   39:istore_3        
			else
		//*  25   40:goto            45
				j = 0;
		//   26   43:iconst_0        
		//   27   44:istore_3        
			f = mTranslationZ;
		//   28   45:aload_0         
		//   29   46:getfield        #42  <Field float mTranslationZ>
		//   30   49:fstore_1        
			int k;
			if(f != 0.0F)
		//*  31   50:fload_1         
		//*  32   51:fconst_0        
		//*  33   52:fcmpl           
		//*  34   53:ifeq            65
				k = Float.floatToIntBits(f);
		//   35   56:fload_1         
		//   36   57:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   37   60:istore          4
			else
		//*  38   62:goto            68
				k = 0;
		//   39   65:iconst_0        
		//   40   66:istore          4
			f = mScaleX;
		//   41   68:aload_0         
		//   42   69:getfield        #47  <Field float mScaleX>
		//   43   72:fstore_1        
			int l;
			if(f != 0.0F)
		//*  44   73:fload_1         
		//*  45   74:fconst_0        
		//*  46   75:fcmpl           
		//*  47   76:ifeq            88
				l = Float.floatToIntBits(f);
		//   48   79:fload_1         
		//   49   80:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   50   83:istore          5
			else
		//*  51   85:goto            91
				l = 0;
		//   52   88:iconst_0        
		//   53   89:istore          5
			f = mScaleY;
		//   54   91:aload_0         
		//   55   92:getfield        #52  <Field float mScaleY>
		//   56   95:fstore_1        
			int i1;
			if(f != 0.0F)
		//*  57   96:fload_1         
		//*  58   97:fconst_0        
		//*  59   98:fcmpl           
		//*  60   99:ifeq            111
				i1 = Float.floatToIntBits(f);
		//   61  102:fload_1         
		//   62  103:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   63  106:istore          6
			else
		//*  64  108:goto            114
				i1 = 0;
		//   65  111:iconst_0        
		//   66  112:istore          6
			f = mRotationX;
		//   67  114:aload_0         
		//   68  115:getfield        #57  <Field float mRotationX>
		//   69  118:fstore_1        
			int j1;
			if(f != 0.0F)
		//*  70  119:fload_1         
		//*  71  120:fconst_0        
		//*  72  121:fcmpl           
		//*  73  122:ifeq            134
				j1 = Float.floatToIntBits(f);
		//   74  125:fload_1         
		//   75  126:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   76  129:istore          7
			else
		//*  77  131:goto            137
				j1 = 0;
		//   78  134:iconst_0        
		//   79  135:istore          7
			f = mRotationY;
		//   80  137:aload_0         
		//   81  138:getfield        #62  <Field float mRotationY>
		//   82  141:fstore_1        
			int k1;
			if(f != 0.0F)
		//*  83  142:fload_1         
		//*  84  143:fconst_0        
		//*  85  144:fcmpl           
		//*  86  145:ifeq            157
				k1 = Float.floatToIntBits(f);
		//   87  148:fload_1         
		//   88  149:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   89  152:istore          8
			else
		//*  90  154:goto            160
				k1 = 0;
		//   91  157:iconst_0        
		//   92  158:istore          8
			f = mRotationZ;
		//   93  160:aload_0         
		//   94  161:getfield        #67  <Field float mRotationZ>
		//   95  164:fstore_1        
			if(f != 0.0F)
		//*  96  165:fload_1         
		//*  97  166:fconst_0        
		//*  98  167:fcmpl           
		//*  99  168:ifeq            177
				l1 = Float.floatToIntBits(f);
		//  100  171:fload_1         
		//  101  172:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//  102  175:istore          9
			return ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
		//  103  177:iload_2         
		//  104  178:bipush          31
		//  105  180:imul            
		//  106  181:iload_3         
		//  107  182:iadd            
		//  108  183:bipush          31
		//  109  185:imul            
		//  110  186:iload           4
		//  111  188:iadd            
		//  112  189:bipush          31
		//  113  191:imul            
		//  114  192:iload           5
		//  115  194:iadd            
		//  116  195:bipush          31
		//  117  197:imul            
		//  118  198:iload           6
		//  119  200:iadd            
		//  120  201:bipush          31
		//  121  203:imul            
		//  122  204:iload           7
		//  123  206:iadd            
		//  124  207:bipush          31
		//  125  209:imul            
		//  126  210:iload           8
		//  127  212:iadd            
		//  128  213:bipush          31
		//  129  215:imul            
		//  130  216:iload           9
		//  131  218:iadd            
		//  132  219:ireturn         
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
		//   17   33:invokestatic    #83  <Method void ChangeTransform.setTransforms(View, float, float, float, float, float, float, float, float)>
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
	//    1    1:getfield        #134 <Field View TransitionValues.view>
	//    2    4:astore_3        
		if(view.getVisibility() == 8)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #140 <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
			return;
	//    7   14:return          
		transitionvalues.values.put("android:changeTransform:parent", ((Object) (view.getParent())));
	//    8   15:aload_1         
	//    9   16:getfield        #144 <Field Map TransitionValues.values>
	//   10   19:ldc1            #35  <String "android:changeTransform:parent">
	//   11   21:aload_3         
	//   12   22:invokevirtual   #148 <Method android.view.ViewParent View.getParent()>
	//   13   25:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   14   30:pop             
		Object obj = ((Object) (new Transforms(view)));
	//   15   31:new             #18  <Class ChangeTransform$Transforms>
	//   16   34:dup             
	//   17   35:aload_3         
	//   18   36:invokespecial   #157 <Method void ChangeTransform$Transforms(View)>
	//   19   39:astore_2        
		transitionvalues.values.put("android:changeTransform:transforms", obj);
	//   20   40:aload_1         
	//   21   41:getfield        #144 <Field Map TransitionValues.values>
	//   22   44:ldc1            #41  <String "android:changeTransform:transforms">
	//   23   46:aload_2         
	//   24   47:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   25   52:pop             
		obj = ((Object) (view.getMatrix()));
	//   26   53:aload_3         
	//   27   54:invokevirtual   #161 <Method Matrix View.getMatrix()>
	//   28   57:astore_2        
		if(obj != null && !((Matrix) (obj)).isIdentity())
	//*  29   58:aload_2         
	//*  30   59:ifnull          84
	//*  31   62:aload_2         
	//*  32   63:invokevirtual   #165 <Method boolean Matrix.isIdentity()>
	//*  33   66:ifeq            72
	//*  34   69:goto            84
			obj = ((Object) (new Matrix(((Matrix) (obj)))));
	//   35   72:new             #91  <Class Matrix>
	//   36   75:dup             
	//   37   76:aload_2         
	//   38   77:invokespecial   #168 <Method void Matrix(Matrix)>
	//   39   80:astore_2        
		else
	//*  40   81:goto            86
			obj = null;
	//   41   84:aconst_null     
	//   42   85:astore_2        
		transitionvalues.values.put("android:changeTransform:matrix", obj);
	//   43   86:aload_1         
	//   44   87:getfield        #144 <Field Map TransitionValues.values>
	//   45   90:ldc1            #32  <String "android:changeTransform:matrix">
	//   46   92:aload_2         
	//   47   93:invokeinterface #154 <Method Object Map.put(Object, Object)>
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
	//   57  115:invokevirtual   #148 <Method android.view.ViewParent View.getParent()>
	//   58  118:checkcast       #170 <Class ViewGroup>
	//   59  121:astore          4
			ViewUtils.transformMatrixToGlobal(((View) (viewgroup)), matrix);
	//   60  123:aload           4
	//   61  125:aload_2         
	//   62  126:invokestatic    #176 <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
			matrix.preTranslate(-viewgroup.getScrollX(), -viewgroup.getScrollY());
	//   63  129:aload_2         
	//   64  130:aload           4
	//   65  132:invokevirtual   #179 <Method int ViewGroup.getScrollX()>
	//   66  135:ineg            
	//   67  136:i2f             
	//   68  137:aload           4
	//   69  139:invokevirtual   #182 <Method int ViewGroup.getScrollY()>
	//   70  142:ineg            
	//   71  143:i2f             
	//   72  144:invokevirtual   #186 <Method boolean Matrix.preTranslate(float, float)>
	//   73  147:pop             
			transitionvalues.values.put("android:changeTransform:parentMatrix", ((Object) (matrix)));
	//   74  148:aload_1         
	//   75  149:getfield        #144 <Field Map TransitionValues.values>
	//   76  152:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   77  154:aload_2         
	//   78  155:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   79  160:pop             
			transitionvalues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
	//   80  161:aload_1         
	//   81  162:getfield        #144 <Field Map TransitionValues.values>
	//   82  165:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//   83  167:aload_3         
	//   84  168:getstatic       #191 <Field int R$id.transition_transform>
	//   85  171:invokevirtual   #195 <Method Object View.getTag(int)>
	//   86  174:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   87  179:pop             
			transitionvalues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
	//   88  180:aload_1         
	//   89  181:getfield        #144 <Field Map TransitionValues.values>
	//   90  184:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//   91  186:aload_3         
	//   92  187:getstatic       #198 <Field int R$id.parent_matrix>
	//   93  190:invokevirtual   #195 <Method Object View.getTag(int)>
	//   94  193:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   95  198:pop             
		}
	//   96  199:return          
	}

	private void createGhostView(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		View view = transitionvalues1.view;
	//    0    0:aload_3         
	//    1    1:getfield        #134 <Field View TransitionValues.view>
	//    2    4:astore          4
		Object obj = ((Object) (new Matrix((Matrix)transitionvalues1.values.get("android:changeTransform:parentMatrix"))));
	//    3    6:new             #91  <Class Matrix>
	//    4    9:dup             
	//    5   10:aload_3         
	//    6   11:getfield        #144 <Field Map TransitionValues.values>
	//    7   14:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//    8   16:invokeinterface #204 <Method Object Map.get(Object)>
	//    9   21:checkcast       #91  <Class Matrix>
	//   10   24:invokespecial   #168 <Method void Matrix(Matrix)>
	//   11   27:astore          5
		ViewUtils.transformMatrixToLocal(((View) (viewgroup)), ((Matrix) (obj)));
	//   12   29:aload_1         
	//   13   30:aload           5
	//   14   32:invokestatic    #207 <Method void ViewUtils.transformMatrixToLocal(View, Matrix)>
		obj = ((Object) (GhostViewUtils.addGhost(view, viewgroup, ((Matrix) (obj)))));
	//   15   35:aload           4
	//   16   37:aload_1         
	//   17   38:aload           5
	//   18   40:invokestatic    #213 <Method GhostViewImpl GhostViewUtils.addGhost(View, ViewGroup, Matrix)>
	//   19   43:astore          5
		if(obj == null)
	//*  20   45:aload           5
	//*  21   47:ifnonnull       51
			return;
	//   22   50:return          
		((GhostViewImpl) (obj)).reserveEndViewTransition((ViewGroup)transitionvalues.values.get("android:changeTransform:parent"), transitionvalues.view);
	//   23   51:aload           5
	//   24   53:aload_2         
	//   25   54:getfield        #144 <Field Map TransitionValues.values>
	//   26   57:ldc1            #35  <String "android:changeTransform:parent">
	//   27   59:invokeinterface #204 <Method Object Map.get(Object)>
	//   28   64:checkcast       #170 <Class ViewGroup>
	//   29   67:aload_2         
	//   30   68:getfield        #134 <Field View TransitionValues.view>
	//   31   71:invokeinterface #219 <Method void GhostViewImpl.reserveEndViewTransition(ViewGroup, View)>
		for(viewgroup = ((ViewGroup) (this)); ((Transition) (viewgroup)).mParent != null; viewgroup = ((ViewGroup) (((Transition) (viewgroup)).mParent)));
	//   32   76:aload_0         
	//   33   77:astore_1        
	//   34   78:aload_1         
	//   35   79:getfield        #223 <Field TransitionSet Transition.mParent>
	//   36   82:ifnull          93
	//   37   85:aload_1         
	//   38   86:getfield        #223 <Field TransitionSet Transition.mParent>
	//   39   89:astore_1        
	//*  40   90:goto            78
		((Transition) (viewgroup)).addListener(((Transition.TransitionListener) (new GhostListener(view, ((GhostViewImpl) (obj))))));
	//   41   93:aload_1         
	//   42   94:new             #12  <Class ChangeTransform$GhostListener>
	//   43   97:dup             
	//   44   98:aload           4
	//   45  100:aload           5
	//   46  102:invokespecial   #226 <Method void ChangeTransform$GhostListener(View, GhostViewImpl)>
	//   47  105:invokevirtual   #230 <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   48  108:pop             
		if(SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*  49  109:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  50  112:ifeq            140
		{
			if(transitionvalues.view != transitionvalues1.view)
	//*  51  115:aload_2         
	//*  52  116:getfield        #134 <Field View TransitionValues.view>
	//*  53  119:aload_3         
	//*  54  120:getfield        #134 <Field View TransitionValues.view>
	//*  55  123:if_acmpeq       134
				ViewUtils.setTransitionAlpha(transitionvalues.view, 0.0F);
	//   56  126:aload_2         
	//   57  127:getfield        #134 <Field View TransitionValues.view>
	//   58  130:fconst_0        
	//   59  131:invokestatic    #234 <Method void ViewUtils.setTransitionAlpha(View, float)>
			ViewUtils.setTransitionAlpha(view, 1.0F);
	//   60  134:aload           4
	//   61  136:fconst_1        
	//   62  137:invokestatic    #234 <Method void ViewUtils.setTransitionAlpha(View, float)>
		}
	//   63  140:return          
	}

	private ObjectAnimator createTransformAnimator(final TransitionValues finalEndMatrix, final TransitionValues view, final boolean handleParentChange)
	{
		Matrix matrix = (Matrix)finalEndMatrix.values.get("android:changeTransform:matrix");
	//    0    0:aload_1         
	//    1    1:getfield        #144 <Field Map TransitionValues.values>
	//    2    4:ldc1            #32  <String "android:changeTransform:matrix">
	//    3    6:invokeinterface #204 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore          5
		finalEndMatrix = ((TransitionValues) ((Matrix)view.values.get("android:changeTransform:matrix")));
	//    6   16:aload_2         
	//    7   17:getfield        #144 <Field Map TransitionValues.values>
	//    8   20:ldc1            #32  <String "android:changeTransform:matrix">
	//    9   22:invokeinterface #204 <Method Object Map.get(Object)>
	//   10   27:checkcast       #91  <Class Matrix>
	//   11   30:astore_1        
		final PathAnimatorMatrix pathAnimatorMatrix = ((PathAnimatorMatrix) (matrix));
	//   12   31:aload           5
	//   13   33:astore          4
		if(matrix == null)
	//*  14   35:aload           5
	//*  15   37:ifnonnull       45
			pathAnimatorMatrix = ((PathAnimatorMatrix) (MatrixUtils.IDENTITY_MATRIX));
	//   16   40:getstatic       #241 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   17   43:astore          4
		if(finalEndMatrix == null)
	//*  18   45:aload_1         
	//*  19   46:ifnonnull       56
			finalEndMatrix = ((TransitionValues) (MatrixUtils.IDENTITY_MATRIX));
	//   20   49:getstatic       #241 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   21   52:astore_1        
	//*  22   53:goto            56
		if(((Matrix) (pathAnimatorMatrix)).equals(((Object) (finalEndMatrix))))
	//*  23   56:aload           4
	//*  24   58:aload_1         
	//*  25   59:invokevirtual   #245 <Method boolean Matrix.equals(Object)>
	//*  26   62:ifeq            67
		{
			return null;
	//   27   65:aconst_null     
	//   28   66:areturn         
		} else
		{
			final Transforms transforms = (Transforms)view.values.get("android:changeTransform:transforms");
	//   29   67:aload_2         
	//   30   68:getfield        #144 <Field Map TransitionValues.values>
	//   31   71:ldc1            #41  <String "android:changeTransform:transforms">
	//   32   73:invokeinterface #204 <Method Object Map.get(Object)>
	//   33   78:checkcast       #18  <Class ChangeTransform$Transforms>
	//   34   81:astore          5
			view = ((TransitionValues) (view.view));
	//   35   83:aload_2         
	//   36   84:getfield        #134 <Field View TransitionValues.view>
	//   37   87:astore_2        
			setIdentityTransforms(((View) (view)));
	//   38   88:aload_2         
	//   39   89:invokestatic    #248 <Method void setIdentityTransforms(View)>
			float af[] = new float[9];
	//   40   92:bipush          9
	//   41   94:newarray        float[]
	//   42   96:astore          6
			((Matrix) (pathAnimatorMatrix)).getValues(af);
	//   43   98:aload           4
	//   44  100:aload           6
	//   45  102:invokevirtual   #252 <Method void Matrix.getValues(float[])>
			float af1[] = new float[9];
	//   46  105:bipush          9
	//   47  107:newarray        float[]
	//   48  109:astore          8
			((Matrix) (finalEndMatrix)).getValues(af1);
	//   49  111:aload_1         
	//   50  112:aload           8
	//   51  114:invokevirtual   #252 <Method void Matrix.getValues(float[])>
			pathAnimatorMatrix = new PathAnimatorMatrix(((View) (view)), af);
	//   52  117:new             #15  <Class ChangeTransform$PathAnimatorMatrix>
	//   53  120:dup             
	//   54  121:aload_2         
	//   55  122:aload           6
	//   56  124:invokespecial   #255 <Method void ChangeTransform$PathAnimatorMatrix(View, float[])>
	//   57  127:astore          4
			PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, ((android.animation.TypeEvaluator) (new FloatArrayEvaluator(new float[9]))), ((Object []) (new float[][] {
				af, af1
			})));
	//   58  129:getstatic       #67  <Field Property NON_TRANSLATIONS_PROPERTY>
	//   59  132:new             #257 <Class FloatArrayEvaluator>
	//   60  135:dup             
	//   61  136:bipush          9
	//   62  138:newarray        float[]
	//   63  140:invokespecial   #259 <Method void FloatArrayEvaluator(float[])>
	//   64  143:iconst_2        
	//   65  144:anewarray       float[][]
	//   66  147:dup             
	//   67  148:iconst_0        
	//   68  149:aload           6
	//   69  151:aastore         
	//   70  152:dup             
	//   71  153:iconst_1        
	//   72  154:aload           8
	//   73  156:aastore         
	//   74  157:invokestatic    #265 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeEvaluator, Object[])>
	//   75  160:astore          7
			Object obj = ((Object) (getPathMotion().getPath(af[2], af[5], af1[2], af1[5])));
	//   76  162:aload_0         
	//   77  163:invokevirtual   #269 <Method PathMotion getPathMotion()>
	//   78  166:aload           6
	//   79  168:iconst_2        
	//   80  169:faload          
	//   81  170:aload           6
	//   82  172:iconst_5        
	//   83  173:faload          
	//   84  174:aload           8
	//   85  176:iconst_2        
	//   86  177:faload          
	//   87  178:aload           8
	//   88  180:iconst_5        
	//   89  181:faload          
	//   90  182:invokevirtual   #275 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//   91  185:astore          6
			obj = ((Object) (ObjectAnimator.ofPropertyValuesHolder(((Object) (pathAnimatorMatrix)), new PropertyValuesHolder[] {
				propertyvaluesholder, PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, ((android.graphics.Path) (obj)))
			})));
	//   92  187:aload           4
	//   93  189:iconst_2        
	//   94  190:anewarray       PropertyValuesHolder[]
	//   95  193:dup             
	//   96  194:iconst_0        
	//   97  195:aload           7
	//   98  197:aastore         
	//   99  198:dup             
	//  100  199:iconst_1        
	//  101  200:getstatic       #74  <Field Property TRANSLATIONS_PROPERTY>
	//  102  203:aload           6
	//  103  205:invokestatic    #281 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//  104  208:aastore         
	//  105  209:invokestatic    #287 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  106  212:astore          6
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
				//*   8   18:getfield        #77  <Field boolean ChangeTransform.mUseOverlay>
				//*   9   21:ifeq            35
						{
							setCurrentMatrix(finalEndMatrix);
				//   10   24:aload_0         
				//   11   25:aload_0         
				//   12   26:getfield        #31  <Field Matrix val$finalEndMatrix>
				//   13   29:invokespecial   #79  <Method void setCurrentMatrix(Matrix)>
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
				//   22   50:getstatic       #82  <Field int R$id.parent_matrix>
				//   23   53:aconst_null     
				//   24   54:invokevirtual   #63  <Method void View.setTag(int, Object)>
						}
					ViewUtils.setAnimationMatrix(view, ((Matrix) (null)));
				//   25   57:aload_0         
				//   26   58:getfield        #33  <Field View val$view>
				//   27   61:aconst_null     
				//   28   62:invokestatic    #88  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
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
				//    3    5:invokevirtual   #95  <Method Matrix ChangeTransform$PathAnimatorMatrix.getMatrix()>
				//    4    8:invokespecial   #79  <Method void setCurrentMatrix(Matrix)>
				//    5   11:return          
				}

				public void onAnimationResume(Animator animator)
				{
					ChangeTransform.setIdentityTransforms(view);
				//    0    0:aload_0         
				//    1    1:getfield        #33  <Field View val$view>
				//    2    4:invokestatic    #99  <Method void ChangeTransform.setIdentityTransforms(View)>
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
	//  107  214:new             #10  <Class ChangeTransform$3>
	//  108  217:dup             
	//  109  218:aload_0         
	//  110  219:iload_3         
	//  111  220:aload_1         
	//  112  221:aload_2         
	//  113  222:aload           5
	//  114  224:aload           4
	//  115  226:invokespecial   #290 <Method void ChangeTransform$3(ChangeTransform, boolean, Matrix, View, ChangeTransform$Transforms, ChangeTransform$PathAnimatorMatrix)>
	//  116  229:astore_1        
			((ObjectAnimator) (obj)).addListener(((android.animation.Animator.AnimatorListener) (finalEndMatrix)));
	//  117  230:aload           6
	//  118  232:aload_1         
	//  119  233:invokevirtual   #293 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			AnimatorUtils.addPauseListener(((Animator) (obj)), ((AnimatorListenerAdapter) (finalEndMatrix)));
	//  120  236:aload           6
	//  121  238:aload_1         
	//  122  239:invokestatic    #299 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
			return ((ObjectAnimator) (obj));
	//  123  242:aload           6
	//  124  244:areturn         
		}
	}

	private boolean parentsMatch(ViewGroup viewgroup, ViewGroup viewgroup1)
	{
		boolean flag = isValidTarget(((View) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #305 <Method boolean isValidTarget(View)>
	//    3    5:istore_3        
		boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(flag && isValidTarget(((View) (viewgroup1))))
	//*   6    9:iload_3         
	//*   7   10:ifeq            51
	//*   8   13:aload_0         
	//*   9   14:aload_2         
	//*  10   15:invokevirtual   #305 <Method boolean isValidTarget(View)>
	//*  11   18:ifne            24
	//*  12   21:goto            51
		{
			viewgroup = ((ViewGroup) (getMatchedTransitionValues(((View) (viewgroup)), true)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:iconst_1        
	//   16   27:invokevirtual   #309 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//   17   30:astore_1        
			flag = flag1;
	//   18   31:iload           4
	//   19   33:istore_3        
			if(viewgroup != null)
	//*  20   34:aload_1         
	//*  21   35:ifnull          61
			{
				flag = flag1;
	//   22   38:iload           4
	//   23   40:istore_3        
				if(viewgroup1 == ((TransitionValues) (viewgroup)).view)
	//*  24   41:aload_2         
	//*  25   42:aload_1         
	//*  26   43:getfield        #134 <Field View TransitionValues.view>
	//*  27   46:if_acmpne       61
					return true;
	//   28   49:iconst_1        
	//   29   50:ireturn         
			}
		} else
		{
			flag = flag1;
	//   30   51:iload           4
	//   31   53:istore_3        
			if(viewgroup == viewgroup1)
	//*  32   54:aload_1         
	//*  33   55:aload_2         
	//*  34   56:if_acmpne       61
				flag = true;
	//   35   59:iconst_1        
	//   36   60:istore_3        
		}
		return flag;
	//   37   61:iload_3         
	//   38   62:ireturn         
	}

	static void setIdentityTransforms(View view)
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
	//    9    9:invokestatic    #313 <Method void setTransforms(View, float, float, float, float, float, float, float, float)>
	//   10   12:return          
	}

	private void setMatricesForParent(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		Matrix matrix = (Matrix)transitionvalues1.values.get("android:changeTransform:parentMatrix");
	//    0    0:aload_2         
	//    1    1:getfield        #144 <Field Map TransitionValues.values>
	//    2    4:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//    3    6:invokeinterface #204 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore_3        
		transitionvalues1.view.setTag(R.id.parent_matrix, ((Object) (matrix)));
	//    6   15:aload_2         
	//    7   16:getfield        #134 <Field View TransitionValues.view>
	//    8   19:getstatic       #198 <Field int R$id.parent_matrix>
	//    9   22:aload_3         
	//   10   23:invokevirtual   #319 <Method void View.setTag(int, Object)>
		Matrix matrix1 = mTempMatrix;
	//   11   26:aload_0         
	//   12   27:getfield        #94  <Field Matrix mTempMatrix>
	//   13   30:astore          4
		matrix1.reset();
	//   14   32:aload           4
	//   15   34:invokevirtual   #322 <Method void Matrix.reset()>
		matrix.invert(matrix1);
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokevirtual   #326 <Method boolean Matrix.invert(Matrix)>
	//   19   43:pop             
		matrix = (Matrix)transitionvalues.values.get("android:changeTransform:matrix");
	//   20   44:aload_1         
	//   21   45:getfield        #144 <Field Map TransitionValues.values>
	//   22   48:ldc1            #32  <String "android:changeTransform:matrix">
	//   23   50:invokeinterface #204 <Method Object Map.get(Object)>
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
	//   35   74:getfield        #144 <Field Map TransitionValues.values>
	//   36   77:ldc1            #32  <String "android:changeTransform:matrix">
	//   37   79:aload_2         
	//   38   80:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   39   85:pop             
		}
		((Matrix) (transitionvalues1)).postConcat((Matrix)transitionvalues.values.get("android:changeTransform:parentMatrix"));
	//   40   86:aload_2         
	//   41   87:aload_1         
	//   42   88:getfield        #144 <Field Map TransitionValues.values>
	//   43   91:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   44   93:invokeinterface #204 <Method Object Map.get(Object)>
	//   45   98:checkcast       #91  <Class Matrix>
	//   46  101:invokevirtual   #329 <Method boolean Matrix.postConcat(Matrix)>
	//   47  104:pop             
		((Matrix) (transitionvalues1)).postConcat(matrix1);
	//   48  105:aload_2         
	//   49  106:aload           4
	//   50  108:invokevirtual   #329 <Method boolean Matrix.postConcat(Matrix)>
	//   51  111:pop             
	//   52  112:return          
	}

	static void setTransforms(View view, float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			float f7)
	{
		view.setTranslationX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #333 <Method void View.setTranslationX(float)>
		view.setTranslationY(f1);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #336 <Method void View.setTranslationY(float)>
		ViewCompat.setTranslationZ(view, f2);
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:invokestatic    #341 <Method void ViewCompat.setTranslationZ(View, float)>
		view.setScaleX(f3);
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:invokevirtual   #344 <Method void View.setScaleX(float)>
		view.setScaleY(f4);
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:invokevirtual   #347 <Method void View.setScaleY(float)>
		view.setRotationX(f5);
	//   15   27:aload_0         
	//   16   28:fload           6
	//   17   30:invokevirtual   #350 <Method void View.setRotationX(float)>
		view.setRotationY(f6);
	//   18   33:aload_0         
	//   19   34:fload           7
	//   20   36:invokevirtual   #353 <Method void View.setRotationY(float)>
		view.setRotation(f7);
	//   21   39:aload_0         
	//   22   40:fload           8
	//   23   42:invokevirtual   #356 <Method void View.setRotation(float)>
	//   24   45:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #360 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #360 <Method void captureValues(TransitionValues)>
		if(!SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*   3    5:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*   4    8:ifne            28
			((ViewGroup)transitionvalues.view.getParent()).startViewTransition(transitionvalues.view);
	//    5   11:aload_1         
	//    6   12:getfield        #134 <Field View TransitionValues.view>
	//    7   15:invokevirtual   #148 <Method android.view.ViewParent View.getParent()>
	//    8   18:checkcast       #170 <Class ViewGroup>
	//    9   21:aload_1         
	//   10   22:getfield        #134 <Field View TransitionValues.view>
	//   11   25:invokevirtual   #365 <Method void ViewGroup.startViewTransition(View)>
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
	//*   5    9:getfield        #144 <Field Map TransitionValues.values>
	//*   6   12:ldc1            #35  <String "android:changeTransform:parent">
	//*   7   14:invokeinterface #370 <Method boolean Map.containsKey(Object)>
	//*   8   19:ifeq            234
	//*   9   22:aload_3         
	//*  10   23:getfield        #144 <Field Map TransitionValues.values>
	//*  11   26:ldc1            #35  <String "android:changeTransform:parent">
	//*  12   28:invokeinterface #370 <Method boolean Map.containsKey(Object)>
	//*  13   33:ifne            39
	//*  14   36:goto            234
		{
			ViewGroup viewgroup1 = (ViewGroup)transitionvalues.values.get("android:changeTransform:parent");
	//   15   39:aload_2         
	//   16   40:getfield        #144 <Field Map TransitionValues.values>
	//   17   43:ldc1            #35  <String "android:changeTransform:parent">
	//   18   45:invokeinterface #204 <Method Object Map.get(Object)>
	//   19   50:checkcast       #170 <Class ViewGroup>
	//   20   53:astore          5
			Object obj = ((Object) ((ViewGroup)transitionvalues1.values.get("android:changeTransform:parent")));
	//   21   55:aload_3         
	//   22   56:getfield        #144 <Field Map TransitionValues.values>
	//   23   59:ldc1            #35  <String "android:changeTransform:parent">
	//   24   61:invokeinterface #204 <Method Object Map.get(Object)>
	//   25   66:checkcast       #170 <Class ViewGroup>
	//   26   69:astore          6
			boolean flag;
			if(mReparent && !parentsMatch(viewgroup1, ((ViewGroup) (obj))))
	//*  27   71:aload_0         
	//*  28   72:getfield        #89  <Field boolean mReparent>
	//*  29   75:ifeq            95
	//*  30   78:aload_0         
	//*  31   79:aload           5
	//*  32   81:aload           6
	//*  33   83:invokespecial   #372 <Method boolean parentsMatch(ViewGroup, ViewGroup)>
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
	//   41   99:getfield        #144 <Field Map TransitionValues.values>
	//   42  102:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//   43  104:invokeinterface #204 <Method Object Map.get(Object)>
	//   44  109:checkcast       #91  <Class Matrix>
	//   45  112:astore          6
			if(obj != null)
	//*  46  114:aload           6
	//*  47  116:ifnull          133
				transitionvalues.values.put("android:changeTransform:matrix", obj);
	//   48  119:aload_2         
	//   49  120:getfield        #144 <Field Map TransitionValues.values>
	//   50  123:ldc1            #32  <String "android:changeTransform:matrix">
	//   51  125:aload           6
	//   52  127:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   53  132:pop             
			obj = ((Object) ((Matrix)transitionvalues.values.get("android:changeTransform:intermediateParentMatrix")));
	//   54  133:aload_2         
	//   55  134:getfield        #144 <Field Map TransitionValues.values>
	//   56  137:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//   57  139:invokeinterface #204 <Method Object Map.get(Object)>
	//   58  144:checkcast       #91  <Class Matrix>
	//   59  147:astore          6
			if(obj != null)
	//*  60  149:aload           6
	//*  61  151:ifnull          168
				transitionvalues.values.put("android:changeTransform:parentMatrix", obj);
	//   62  154:aload_2         
	//   63  155:getfield        #144 <Field Map TransitionValues.values>
	//   64  158:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   65  160:aload           6
	//   66  162:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   67  167:pop             
			if(flag)
	//*  68  168:iload           4
	//*  69  170:ifeq            179
				setMatricesForParent(transitionvalues, transitionvalues1);
	//   70  173:aload_0         
	//   71  174:aload_2         
	//   72  175:aload_3         
	//   73  176:invokespecial   #374 <Method void setMatricesForParent(TransitionValues, TransitionValues)>
			obj = ((Object) (createTransformAnimator(transitionvalues, transitionvalues1, flag)));
	//   74  179:aload_0         
	//   75  180:aload_2         
	//   76  181:aload_3         
	//   77  182:iload           4
	//   78  184:invokespecial   #376 <Method ObjectAnimator createTransformAnimator(TransitionValues, TransitionValues, boolean)>
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
	//   91  210:invokespecial   #378 <Method void createGhostView(ViewGroup, TransitionValues, TransitionValues)>
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
	//   98  225:getfield        #134 <Field View TransitionValues.view>
	//   99  228:invokevirtual   #381 <Method void ViewGroup.endViewTransition(View)>
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
	boolean mUseOverlay;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #32  <String "android:changeTransform:matrix">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #41  <String "android:changeTransform:transforms">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   13   18:aastore         
	//   14   19:putstatic       #57  <Field String[] sTransitionProperties>
	//   15   22:new             #6   <Class ChangeTransform$1>
	//   16   25:dup             
	//   17   26:ldc1            #59  <Class float[]>
	//   18   28:ldc1            #61  <String "nonTranslations">
	//   19   30:invokespecial   #65  <Method void ChangeTransform$1(Class, String)>
	//   20   33:putstatic       #67  <Field Property NON_TRANSLATIONS_PROPERTY>
	//   21   36:new             #8   <Class ChangeTransform$2>
	//   22   39:dup             
	//   23   40:ldc1            #69  <Class PointF>
	//   24   42:ldc1            #71  <String "translations">
	//   25   44:invokespecial   #72  <Method void ChangeTransform$2(Class, String)>
	//   26   47:putstatic       #74  <Field Property TRANSLATIONS_PROPERTY>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  27   50:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   53:bipush          21
	//*  29   55:icmplt          63
			flag = true;
	//   30   58:iconst_1        
	//   31   59:istore_0        
		else
	//*  32   60:goto            65
			flag = false;
	//   33   63:iconst_0        
	//   34   64:istore_0        
		SUPPORTS_VIEW_REMOVAL_SUPPRESSION = flag;
	//   35   65:iload_0         
	//   36   66:putstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  37   69:return          
	}
}
