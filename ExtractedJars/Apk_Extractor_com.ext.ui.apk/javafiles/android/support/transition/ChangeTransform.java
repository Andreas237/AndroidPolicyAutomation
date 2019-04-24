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
			if(obj instanceof Transforms)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ChangeTransform$Transforms>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_1         
		//*   6   10:checkcast       #2   <Class ChangeTransform$Transforms>
		//*   7   13:astore_1        
				if(((Transforms) (obj = ((Object) ((Transforms)obj)))).mTranslationX == mTranslationX && ((Transforms) (obj)).mTranslationY == mTranslationY && ((Transforms) (obj)).mTranslationZ == mTranslationZ && ((Transforms) (obj)).mScaleX == mScaleX && ((Transforms) (obj)).mScaleY == mScaleY && ((Transforms) (obj)).mRotationX == mRotationX && ((Transforms) (obj)).mRotationY == mRotationY && ((Transforms) (obj)).mRotationZ == mRotationZ)
		//*   8   14:aload_1         
		//*   9   15:getfield        #29  <Field float mTranslationX>
		//*  10   18:aload_0         
		//*  11   19:getfield        #29  <Field float mTranslationX>
		//*  12   22:fcmpl           
		//*  13   23:ifne            7
		//*  14   26:aload_1         
		//*  15   27:getfield        #34  <Field float mTranslationY>
		//*  16   30:aload_0         
		//*  17   31:getfield        #34  <Field float mTranslationY>
		//*  18   34:fcmpl           
		//*  19   35:ifne            7
		//*  20   38:aload_1         
		//*  21   39:getfield        #42  <Field float mTranslationZ>
		//*  22   42:aload_0         
		//*  23   43:getfield        #42  <Field float mTranslationZ>
		//*  24   46:fcmpl           
		//*  25   47:ifne            7
		//*  26   50:aload_1         
		//*  27   51:getfield        #47  <Field float mScaleX>
		//*  28   54:aload_0         
		//*  29   55:getfield        #47  <Field float mScaleX>
		//*  30   58:fcmpl           
		//*  31   59:ifne            7
		//*  32   62:aload_1         
		//*  33   63:getfield        #52  <Field float mScaleY>
		//*  34   66:aload_0         
		//*  35   67:getfield        #52  <Field float mScaleY>
		//*  36   70:fcmpl           
		//*  37   71:ifne            7
		//*  38   74:aload_1         
		//*  39   75:getfield        #57  <Field float mRotationX>
		//*  40   78:aload_0         
		//*  41   79:getfield        #57  <Field float mRotationX>
		//*  42   82:fcmpl           
		//*  43   83:ifne            7
		//*  44   86:aload_1         
		//*  45   87:getfield        #62  <Field float mRotationY>
		//*  46   90:aload_0         
		//*  47   91:getfield        #62  <Field float mRotationY>
		//*  48   94:fcmpl           
		//*  49   95:ifne            7
		//*  50   98:aload_1         
		//*  51   99:getfield        #67  <Field float mRotationZ>
		//*  52  102:aload_0         
		//*  53  103:getfield        #67  <Field float mRotationZ>
		//*  54  106:fcmpl           
		//*  55  107:ifne            7
					return true;
		//   56  110:iconst_1        
		//   57  111:ireturn         
			return false;
		}

		public int hashCode()
		{
			int l1 = 0;
		//    0    0:iconst_0        
		//    1    1:istore          8
			int i;
			int j;
			int k;
			int l;
			int i1;
			int j1;
			int k1;
			if(mTranslationX != 0.0F)
		//*   2    3:aload_0         
		//*   3    4:getfield        #29  <Field float mTranslationX>
		//*   4    7:fconst_0        
		//*   5    8:fcmpl           
		//*   6    9:ifeq            186
				i = Float.floatToIntBits(mTranslationX);
		//    7   12:aload_0         
		//    8   13:getfield        #29  <Field float mTranslationX>
		//    9   16:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//   10   19:istore_1        
			else
		//*  11   20:aload_0         
		//*  12   21:getfield        #34  <Field float mTranslationY>
		//*  13   24:fconst_0        
		//*  14   25:fcmpl           
		//*  15   26:ifeq            191
		//*  16   29:aload_0         
		//*  17   30:getfield        #34  <Field float mTranslationY>
		//*  18   33:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  19   36:istore_2        
		//*  20   37:aload_0         
		//*  21   38:getfield        #42  <Field float mTranslationZ>
		//*  22   41:fconst_0        
		//*  23   42:fcmpl           
		//*  24   43:ifeq            196
		//*  25   46:aload_0         
		//*  26   47:getfield        #42  <Field float mTranslationZ>
		//*  27   50:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  28   53:istore_3        
		//*  29   54:aload_0         
		//*  30   55:getfield        #47  <Field float mScaleX>
		//*  31   58:fconst_0        
		//*  32   59:fcmpl           
		//*  33   60:ifeq            201
		//*  34   63:aload_0         
		//*  35   64:getfield        #47  <Field float mScaleX>
		//*  36   67:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  37   70:istore          4
		//*  38   72:aload_0         
		//*  39   73:getfield        #52  <Field float mScaleY>
		//*  40   76:fconst_0        
		//*  41   77:fcmpl           
		//*  42   78:ifeq            207
		//*  43   81:aload_0         
		//*  44   82:getfield        #52  <Field float mScaleY>
		//*  45   85:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  46   88:istore          5
		//*  47   90:aload_0         
		//*  48   91:getfield        #57  <Field float mRotationX>
		//*  49   94:fconst_0        
		//*  50   95:fcmpl           
		//*  51   96:ifeq            213
		//*  52   99:aload_0         
		//*  53  100:getfield        #57  <Field float mRotationX>
		//*  54  103:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  55  106:istore          6
		//*  56  108:aload_0         
		//*  57  109:getfield        #62  <Field float mRotationY>
		//*  58  112:fconst_0        
		//*  59  113:fcmpl           
		//*  60  114:ifeq            219
		//*  61  117:aload_0         
		//*  62  118:getfield        #62  <Field float mRotationY>
		//*  63  121:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  64  124:istore          7
		//*  65  126:aload_0         
		//*  66  127:getfield        #67  <Field float mRotationZ>
		//*  67  130:fconst_0        
		//*  68  131:fcmpl           
		//*  69  132:ifeq            144
		//*  70  135:aload_0         
		//*  71  136:getfield        #67  <Field float mRotationZ>
		//*  72  139:invokestatic    #78  <Method int Float.floatToIntBits(float)>
		//*  73  142:istore          8
		//*  74  144:iload           7
		//*  75  146:iload           6
		//*  76  148:iload           5
		//*  77  150:iload           4
		//*  78  152:iload_3         
		//*  79  153:iload_2         
		//*  80  154:iload_1         
		//*  81  155:bipush          31
		//*  82  157:imul            
		//*  83  158:iadd            
		//*  84  159:bipush          31
		//*  85  161:imul            
		//*  86  162:iadd            
		//*  87  163:bipush          31
		//*  88  165:imul            
		//*  89  166:iadd            
		//*  90  167:bipush          31
		//*  91  169:imul            
		//*  92  170:iadd            
		//*  93  171:bipush          31
		//*  94  173:imul            
		//*  95  174:iadd            
		//*  96  175:bipush          31
		//*  97  177:imul            
		//*  98  178:iadd            
		//*  99  179:bipush          31
		//* 100  181:imul            
		//* 101  182:iload           8
		//* 102  184:iadd            
		//* 103  185:ireturn         
				i = 0;
		//  104  186:iconst_0        
		//  105  187:istore_1        
			if(mTranslationY != 0.0F)
				j = Float.floatToIntBits(mTranslationY);
			else
		//* 106  188:goto            20
				j = 0;
		//  107  191:iconst_0        
		//  108  192:istore_2        
			if(mTranslationZ != 0.0F)
				k = Float.floatToIntBits(mTranslationZ);
			else
		//* 109  193:goto            37
				k = 0;
		//  110  196:iconst_0        
		//  111  197:istore_3        
			if(mScaleX != 0.0F)
				l = Float.floatToIntBits(mScaleX);
			else
		//* 112  198:goto            54
				l = 0;
		//  113  201:iconst_0        
		//  114  202:istore          4
			if(mScaleY != 0.0F)
				i1 = Float.floatToIntBits(mScaleY);
			else
		//* 115  204:goto            72
				i1 = 0;
		//  116  207:iconst_0        
		//  117  208:istore          5
			if(mRotationX != 0.0F)
				j1 = Float.floatToIntBits(mRotationX);
			else
		//* 118  210:goto            90
				j1 = 0;
		//  119  213:iconst_0        
		//  120  214:istore          6
			if(mRotationY != 0.0F)
				k1 = Float.floatToIntBits(mRotationY);
			else
		//* 121  216:goto            108
				k1 = 0;
		//  122  219:iconst_0        
		//  123  220:istore          7
			if(mRotationZ != 0.0F)
				l1 = Float.floatToIntBits(mRotationZ);
			return (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l1;
		//* 124  222:goto            126
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
		mUseOverlay = TypedArrayUtils.getNamedBoolean(((TypedArray) (context)), (XmlPullParser)attributeset, "reparentWithOverlay", 1, true);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:checkcast       #111 <Class XmlPullParser>
	//   24   42:ldc1            #113 <String "reparentWithOverlay">
	//   25   44:iconst_1        
	//   26   45:iconst_1        
	//   27   46:invokestatic    #119 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   28   49:putfield        #87  <Field boolean mUseOverlay>
		mReparent = TypedArrayUtils.getNamedBoolean(((TypedArray) (context)), (XmlPullParser)attributeset, "reparent", 0, true);
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:aload_2         
	//   32   55:checkcast       #111 <Class XmlPullParser>
	//   33   58:ldc1            #121 <String "reparent">
	//   34   60:iconst_0        
	//   35   61:iconst_1        
	//   36   62:invokestatic    #119 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   37   65:putfield        #89  <Field boolean mReparent>
		((TypedArray) (context)).recycle();
	//   38   68:aload_1         
	//   39   69:invokevirtual   #126 <Method void TypedArray.recycle()>
	//   40   72:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #146 <Field View TransitionValues.view>
	//    2    4:astore_3        
		if(view.getVisibility() != 8)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #152 <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
	//*   7   14:return          
		{
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
			if(obj == null || ((Matrix) (obj)).isIdentity())
	//*  29   58:aload_2         
	//*  30   59:ifnull          69
	//*  31   62:aload_2         
	//*  32   63:invokevirtual   #176 <Method boolean Matrix.isIdentity()>
	//*  33   66:ifeq            185
				obj = null;
	//   34   69:aconst_null     
	//   35   70:astore_2        
			else
	//*  36   71:aload_1         
	//*  37   72:getfield        #156 <Field Map TransitionValues.values>
	//*  38   75:ldc1            #32  <String "android:changeTransform:matrix">
	//*  39   77:aload_2         
	//*  40   78:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  41   83:pop             
	//*  42   84:aload_0         
	//*  43   85:getfield        #89  <Field boolean mReparent>
	//*  44   88:ifeq            14
	//*  45   91:new             #91  <Class Matrix>
	//*  46   94:dup             
	//*  47   95:invokespecial   #92  <Method void Matrix()>
	//*  48   98:astore_2        
	//*  49   99:aload_3         
	//*  50  100:invokevirtual   #160 <Method android.view.ViewParent View.getParent()>
	//*  51  103:checkcast       #178 <Class ViewGroup>
	//*  52  106:astore          4
	//*  53  108:aload           4
	//*  54  110:aload_2         
	//*  55  111:invokestatic    #184 <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
	//*  56  114:aload_2         
	//*  57  115:aload           4
	//*  58  117:invokevirtual   #187 <Method int ViewGroup.getScrollX()>
	//*  59  120:ineg            
	//*  60  121:i2f             
	//*  61  122:aload           4
	//*  62  124:invokevirtual   #190 <Method int ViewGroup.getScrollY()>
	//*  63  127:ineg            
	//*  64  128:i2f             
	//*  65  129:invokevirtual   #194 <Method boolean Matrix.preTranslate(float, float)>
	//*  66  132:pop             
	//*  67  133:aload_1         
	//*  68  134:getfield        #156 <Field Map TransitionValues.values>
	//*  69  137:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//*  70  139:aload_2         
	//*  71  140:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  72  145:pop             
	//*  73  146:aload_1         
	//*  74  147:getfield        #156 <Field Map TransitionValues.values>
	//*  75  150:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//*  76  152:aload_3         
	//*  77  153:getstatic       #199 <Field int R$id.transition_transform>
	//*  78  156:invokevirtual   #203 <Method Object View.getTag(int)>
	//*  79  159:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  80  164:pop             
	//*  81  165:aload_1         
	//*  82  166:getfield        #156 <Field Map TransitionValues.values>
	//*  83  169:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//*  84  171:aload_3         
	//*  85  172:getstatic       #206 <Field int R$id.parent_matrix>
	//*  86  175:invokevirtual   #203 <Method Object View.getTag(int)>
	//*  87  178:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  88  183:pop             
	//*  89  184:return          
				obj = ((Object) (new Matrix(((Matrix) (obj)))));
	//   90  185:new             #91  <Class Matrix>
	//   91  188:dup             
	//   92  189:aload_2         
	//   93  190:invokespecial   #209 <Method void Matrix(Matrix)>
	//   94  193:astore_2        
			transitionvalues.values.put("android:changeTransform:matrix", obj);
			if(mReparent)
			{
				obj = ((Object) (new Matrix()));
				ViewGroup viewgroup = (ViewGroup)view.getParent();
				ViewUtils.transformMatrixToGlobal(((View) (viewgroup)), ((Matrix) (obj)));
				((Matrix) (obj)).preTranslate(-viewgroup.getScrollX(), -viewgroup.getScrollY());
				transitionvalues.values.put("android:changeTransform:parentMatrix", obj);
				transitionvalues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
				transitionvalues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
				return;
			}
		}
	//*  95  194:goto            71
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
	//   10   24:invokespecial   #209 <Method void Matrix(Matrix)>
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
		if(obj != null)
	//*  20   45:aload           5
	//*  21   47:ifnonnull       51
	//*  22   50:return          
		{
			((GhostViewImpl) (obj)).reserveEndViewTransition((ViewGroup)transitionvalues.values.get("android:changeTransform:parent"), transitionvalues.view);
	//   23   51:aload           5
	//   24   53:aload_2         
	//   25   54:getfield        #156 <Field Map TransitionValues.values>
	//   26   57:ldc1            #35  <String "android:changeTransform:parent">
	//   27   59:invokeinterface #215 <Method Object Map.get(Object)>
	//   28   64:checkcast       #178 <Class ViewGroup>
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
	//*  50  112:ifeq            50
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
				return;
	//   63  140:return          
			}
		}
	}

	private ObjectAnimator createTransformAnimator(final TransitionValues finalEndMatrix, final TransitionValues view, final boolean handleParentChange)
	{
		Matrix matrix = (Matrix)finalEndMatrix.values.get("android:changeTransform:matrix");
	//    0    0:aload_1         
	//    1    1:getfield        #156 <Field Map TransitionValues.values>
	//    2    4:ldc1            #32  <String "android:changeTransform:matrix">
	//    3    6:invokeinterface #215 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore          5
		finalEndMatrix = ((TransitionValues) ((Matrix)view.values.get("android:changeTransform:matrix")));
	//    6   16:aload_2         
	//    7   17:getfield        #156 <Field Map TransitionValues.values>
	//    8   20:ldc1            #32  <String "android:changeTransform:matrix">
	//    9   22:invokeinterface #215 <Method Object Map.get(Object)>
	//   10   27:checkcast       #91  <Class Matrix>
	//   11   30:astore_1        
		final PathAnimatorMatrix pathAnimatorMatrix = ((PathAnimatorMatrix) (matrix));
	//   12   31:aload           5
	//   13   33:astore          4
		if(matrix == null)
	//*  14   35:aload           5
	//*  15   37:ifnonnull       45
			pathAnimatorMatrix = ((PathAnimatorMatrix) (MatrixUtils.IDENTITY_MATRIX));
	//   16   40:getstatic       #252 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   17   43:astore          4
		if(finalEndMatrix == null)
	//*  18   45:aload_1         
	//*  19   46:ifnonnull       242
			finalEndMatrix = ((TransitionValues) (MatrixUtils.IDENTITY_MATRIX));
	//   20   49:getstatic       #252 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   21   52:astore_1        
		if(((Matrix) (pathAnimatorMatrix)).equals(((Object) (finalEndMatrix))))
	//*  22   53:aload           4
	//*  23   55:aload_1         
	//*  24   56:invokevirtual   #256 <Method boolean Matrix.equals(Object)>
	//*  25   59:ifeq            64
		{
			return null;
	//   26   62:aconst_null     
	//   27   63:areturn         
		} else
		{
			final Transforms transforms = (Transforms)view.values.get("android:changeTransform:transforms");
	//   28   64:aload_2         
	//   29   65:getfield        #156 <Field Map TransitionValues.values>
	//   30   68:ldc1            #41  <String "android:changeTransform:transforms">
	//   31   70:invokeinterface #215 <Method Object Map.get(Object)>
	//   32   75:checkcast       #18  <Class ChangeTransform$Transforms>
	//   33   78:astore          5
			view = ((TransitionValues) (view.view));
	//   34   80:aload_2         
	//   35   81:getfield        #146 <Field View TransitionValues.view>
	//   36   84:astore_2        
			setIdentityTransforms(((View) (view)));
	//   37   85:aload_2         
	//   38   86:invokestatic    #133 <Method void setIdentityTransforms(View)>
			float af[] = new float[9];
	//   39   89:bipush          9
	//   40   91:newarray        float[]
	//   41   93:astore          6
			((Matrix) (pathAnimatorMatrix)).getValues(af);
	//   42   95:aload           4
	//   43   97:aload           6
	//   44   99:invokevirtual   #260 <Method void Matrix.getValues(float[])>
			float af1[] = new float[9];
	//   45  102:bipush          9
	//   46  104:newarray        float[]
	//   47  106:astore          8
			((Matrix) (finalEndMatrix)).getValues(af1);
	//   48  108:aload_1         
	//   49  109:aload           8
	//   50  111:invokevirtual   #260 <Method void Matrix.getValues(float[])>
			pathAnimatorMatrix = new PathAnimatorMatrix(((View) (view)), af);
	//   51  114:new             #15  <Class ChangeTransform$PathAnimatorMatrix>
	//   52  117:dup             
	//   53  118:aload_2         
	//   54  119:aload           6
	//   55  121:invokespecial   #263 <Method void ChangeTransform$PathAnimatorMatrix(View, float[])>
	//   56  124:astore          4
			PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, ((android.animation.TypeEvaluator) (new FloatArrayEvaluator(new float[9]))), ((Object []) (new float[][] {
				af, af1
			})));
	//   57  126:getstatic       #67  <Field Property NON_TRANSLATIONS_PROPERTY>
	//   58  129:new             #265 <Class FloatArrayEvaluator>
	//   59  132:dup             
	//   60  133:bipush          9
	//   61  135:newarray        float[]
	//   62  137:invokespecial   #267 <Method void FloatArrayEvaluator(float[])>
	//   63  140:iconst_2        
	//   64  141:anewarray       float[][]
	//   65  144:dup             
	//   66  145:iconst_0        
	//   67  146:aload           6
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_1        
	//   71  151:aload           8
	//   72  153:aastore         
	//   73  154:invokestatic    #273 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, android.animation.TypeEvaluator, Object[])>
	//   74  157:astore          7
			Object obj = ((Object) (getPathMotion().getPath(af[2], af[5], af1[2], af1[5])));
	//   75  159:aload_0         
	//   76  160:invokevirtual   #277 <Method PathMotion getPathMotion()>
	//   77  163:aload           6
	//   78  165:iconst_2        
	//   79  166:faload          
	//   80  167:aload           6
	//   81  169:iconst_5        
	//   82  170:faload          
	//   83  171:aload           8
	//   84  173:iconst_2        
	//   85  174:faload          
	//   86  175:aload           8
	//   87  177:iconst_5        
	//   88  178:faload          
	//   89  179:invokevirtual   #283 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//   90  182:astore          6
			obj = ((Object) (ObjectAnimator.ofPropertyValuesHolder(((Object) (pathAnimatorMatrix)), new PropertyValuesHolder[] {
				propertyvaluesholder, PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, ((android.graphics.Path) (obj)))
			})));
	//   91  184:aload           4
	//   92  186:iconst_2        
	//   93  187:anewarray       PropertyValuesHolder[]
	//   94  190:dup             
	//   95  191:iconst_0        
	//   96  192:aload           7
	//   97  194:aastore         
	//   98  195:dup             
	//   99  196:iconst_1        
	//  100  197:getstatic       #74  <Field Property TRANSLATIONS_PROPERTY>
	//  101  200:aload           6
	//  102  202:invokestatic    #289 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//  103  205:aastore         
	//  104  206:invokestatic    #295 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  105  209:astore          6
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
				//*   2    4:ifne            32
						if(handleParentChange && mUseOverlay)
				//*   3    7:aload_0         
				//*   4    8:getfield        #29  <Field boolean val$handleParentChange>
				//*   5   11:ifeq            52
				//*   6   14:aload_0         
				//*   7   15:getfield        #27  <Field ChangeTransform this$0>
				//*   8   18:invokestatic    #78  <Method boolean ChangeTransform.access$000(ChangeTransform)>
				//*   9   21:ifeq            52
						{
							setCurrentMatrix(finalEndMatrix);
				//   10   24:aload_0         
				//   11   25:aload_0         
				//   12   26:getfield        #31  <Field Matrix val$finalEndMatrix>
				//   13   29:invokespecial   #80  <Method void setCurrentMatrix(Matrix)>
						} else
				//*  14   32:aload_0         
				//*  15   33:getfield        #33  <Field View val$view>
				//*  16   36:aconst_null     
				//*  17   37:invokestatic    #86  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
				//*  18   40:aload_0         
				//*  19   41:getfield        #35  <Field ChangeTransform$Transforms val$transforms>
				//*  20   44:aload_0         
				//*  21   45:getfield        #33  <Field View val$view>
				//*  22   48:invokevirtual   #69  <Method void ChangeTransform$Transforms.restore(View)>
				//*  23   51:return          
						{
							view.setTag(R.id.transition_transform, ((Object) (null)));
				//   24   52:aload_0         
				//   25   53:getfield        #33  <Field View val$view>
				//   26   56:getstatic       #57  <Field int R$id.transition_transform>
				//   27   59:aconst_null     
				//   28   60:invokevirtual   #63  <Method void View.setTag(int, Object)>
							view.setTag(R.id.parent_matrix, ((Object) (null)));
				//   29   63:aload_0         
				//   30   64:getfield        #33  <Field View val$view>
				//   31   67:getstatic       #89  <Field int R$id.parent_matrix>
				//   32   70:aconst_null     
				//   33   71:invokevirtual   #63  <Method void View.setTag(int, Object)>
						}
					ViewUtils.setAnimationMatrix(view, ((Matrix) (null)));
					transforms.restore(view);
				//*  34   74:goto            32
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
	//  106  211:new             #10  <Class ChangeTransform$3>
	//  107  214:dup             
	//  108  215:aload_0         
	//  109  216:iload_3         
	//  110  217:aload_1         
	//  111  218:aload_2         
	//  112  219:aload           5
	//  113  221:aload           4
	//  114  223:invokespecial   #298 <Method void ChangeTransform$3(ChangeTransform, boolean, Matrix, View, ChangeTransform$Transforms, ChangeTransform$PathAnimatorMatrix)>
	//  115  226:astore_1        
			((ObjectAnimator) (obj)).addListener(((android.animation.Animator.AnimatorListener) (finalEndMatrix)));
	//  116  227:aload           6
	//  117  229:aload_1         
	//  118  230:invokevirtual   #301 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			AnimatorUtils.addPauseListener(((Animator) (obj)), ((AnimatorListenerAdapter) (finalEndMatrix)));
	//  119  233:aload           6
	//  120  235:aload_1         
	//  121  236:invokestatic    #307 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
			return ((ObjectAnimator) (obj));
	//  122  239:aload           6
	//  123  241:areturn         
		}
	//* 124  242:goto            53
	}

	private boolean parentsMatch(ViewGroup viewgroup, ViewGroup viewgroup1)
	{
		if(isValidTarget(((View) (viewgroup))) && isValidTarget(((View) (viewgroup1)))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #313 <Method boolean isValidTarget(View)>
	//    3    5:ifeq            16
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #313 <Method boolean isValidTarget(View)>
	//    7   13:ifne            25
_L1:
		if(viewgroup != viewgroup1) goto _L4; else goto _L3
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:if_acmpne       23
_L3:
		return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
_L4:
		return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
_L2:
		viewgroup = ((ViewGroup) (getMatchedTransitionValues(((View) (viewgroup)), true)));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #317 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//   19   31:astore_1        
		if(viewgroup != null)
	//*  20   32:aload_1         
	//*  21   33:ifnull          46
		{
			if(viewgroup1 != ((TransitionValues) (viewgroup)).view)
	//*  22   36:aload_2         
	//*  23   37:aload_1         
	//*  24   38:getfield        #146 <Field View TransitionValues.view>
	//*  25   41:if_acmpeq       21
				return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
		} else
		{
			return false;
	//   28   46:iconst_0        
	//   29   47:ireturn         
		}
		if(true) goto _L3; else goto _L5
_L5:
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
		Matrix matrix1 = (Matrix)transitionvalues1.values.get("android:changeTransform:parentMatrix");
	//    0    0:aload_2         
	//    1    1:getfield        #156 <Field Map TransitionValues.values>
	//    2    4:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//    3    6:invokeinterface #215 <Method Object Map.get(Object)>
	//    4   11:checkcast       #91  <Class Matrix>
	//    5   14:astore          4
		transitionvalues1.view.setTag(R.id.parent_matrix, ((Object) (matrix1)));
	//    6   16:aload_2         
	//    7   17:getfield        #146 <Field View TransitionValues.view>
	//    8   20:getstatic       #206 <Field int R$id.parent_matrix>
	//    9   23:aload           4
	//   10   25:invokevirtual   #323 <Method void View.setTag(int, Object)>
		Matrix matrix = mTempMatrix;
	//   11   28:aload_0         
	//   12   29:getfield        #94  <Field Matrix mTempMatrix>
	//   13   32:astore_3        
		matrix.reset();
	//   14   33:aload_3         
	//   15   34:invokevirtual   #326 <Method void Matrix.reset()>
		matrix1.invert(matrix);
	//   16   37:aload           4
	//   17   39:aload_3         
	//   18   40:invokevirtual   #330 <Method boolean Matrix.invert(Matrix)>
	//   19   43:pop             
		transitionvalues1 = ((TransitionValues) ((Matrix)transitionvalues.values.get("android:changeTransform:matrix")));
	//   20   44:aload_1         
	//   21   45:getfield        #156 <Field Map TransitionValues.values>
	//   22   48:ldc1            #32  <String "android:changeTransform:matrix">
	//   23   50:invokeinterface #215 <Method Object Map.get(Object)>
	//   24   55:checkcast       #91  <Class Matrix>
	//   25   58:astore_2        
		if(transitionvalues1 == null)
	//*  26   59:aload_2         
	//*  27   60:ifnonnull       110
		{
			transitionvalues1 = ((TransitionValues) (new Matrix()));
	//   28   63:new             #91  <Class Matrix>
	//   29   66:dup             
	//   30   67:invokespecial   #92  <Method void Matrix()>
	//   31   70:astore_2        
			transitionvalues.values.put("android:changeTransform:matrix", ((Object) (transitionvalues1)));
	//   32   71:aload_1         
	//   33   72:getfield        #156 <Field Map TransitionValues.values>
	//   34   75:ldc1            #32  <String "android:changeTransform:matrix">
	//   35   77:aload_2         
	//   36   78:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   37   83:pop             
		}
		((Matrix) (transitionvalues1)).postConcat((Matrix)transitionvalues.values.get("android:changeTransform:parentMatrix"));
	//   38   84:aload_2         
	//   39   85:aload_1         
	//   40   86:getfield        #156 <Field Map TransitionValues.values>
	//   41   89:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//   42   91:invokeinterface #215 <Method Object Map.get(Object)>
	//   43   96:checkcast       #91  <Class Matrix>
	//   44   99:invokevirtual   #333 <Method boolean Matrix.postConcat(Matrix)>
	//   45  102:pop             
		((Matrix) (transitionvalues1)).postConcat(matrix);
	//   46  103:aload_2         
	//   47  104:aload_3         
	//   48  105:invokevirtual   #333 <Method boolean Matrix.postConcat(Matrix)>
	//   49  108:pop             
	//   50  109:return          
	//*  51  110:goto            84
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
	//    8   18:checkcast       #178 <Class ViewGroup>
	//    9   21:aload_1         
	//   10   22:getfield        #146 <Field View TransitionValues.view>
	//   11   25:invokevirtual   #369 <Method void ViewGroup.startViewTransition(View)>
	//   12   28:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		ViewGroup viewgroup1;
		if(transitionvalues == null || transitionvalues1 == null || !transitionvalues.values.containsKey("android:changeTransform:parent") || !transitionvalues1.values.containsKey("android:changeTransform:parent"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          36
	//*   2    4:aload_3         
	//*   3    5:ifnull          36
	//*   4    8:aload_2         
	//*   5    9:getfield        #156 <Field Map TransitionValues.values>
	//*   6   12:ldc1            #35  <String "android:changeTransform:parent">
	//*   7   14:invokeinterface #374 <Method boolean Map.containsKey(Object)>
	//*   8   19:ifeq            36
	//*   9   22:aload_3         
	//*  10   23:getfield        #156 <Field Map TransitionValues.values>
	//*  11   26:ldc1            #35  <String "android:changeTransform:parent">
	//*  12   28:invokeinterface #374 <Method boolean Map.containsKey(Object)>
	//*  13   33:ifne            38
			return null;
	//   14   36:aconst_null     
	//   15   37:areturn         
		viewgroup1 = (ViewGroup)transitionvalues.values.get("android:changeTransform:parent");
	//   16   38:aload_2         
	//   17   39:getfield        #156 <Field Map TransitionValues.values>
	//   18   42:ldc1            #35  <String "android:changeTransform:parent">
	//   19   44:invokeinterface #215 <Method Object Map.get(Object)>
	//   20   49:checkcast       #178 <Class ViewGroup>
	//   21   52:astore          5
		Object obj = ((Object) ((ViewGroup)transitionvalues1.values.get("android:changeTransform:parent")));
	//   22   54:aload_3         
	//   23   55:getfield        #156 <Field Map TransitionValues.values>
	//   24   58:ldc1            #35  <String "android:changeTransform:parent">
	//   25   60:invokeinterface #215 <Method Object Map.get(Object)>
	//   26   65:checkcast       #178 <Class ViewGroup>
	//   27   68:astore          6
		boolean flag;
		if(mReparent && !parentsMatch(viewgroup1, ((ViewGroup) (obj))))
	//*  28   70:aload_0         
	//*  29   71:getfield        #89  <Field boolean mReparent>
	//*  30   74:ifeq            209
	//*  31   77:aload_0         
	//*  32   78:aload           5
	//*  33   80:aload           6
	//*  34   82:invokespecial   #376 <Method boolean parentsMatch(ViewGroup, ViewGroup)>
	//*  35   85:ifne            209
			flag = true;
	//   36   88:iconst_1        
	//   37   89:istore          4
		else
	//*  38   91:aload_2         
	//*  39   92:getfield        #156 <Field Map TransitionValues.values>
	//*  40   95:ldc1            #26  <String "android:changeTransform:intermediateMatrix">
	//*  41   97:invokeinterface #215 <Method Object Map.get(Object)>
	//*  42  102:checkcast       #91  <Class Matrix>
	//*  43  105:astore          6
	//*  44  107:aload           6
	//*  45  109:ifnull          126
	//*  46  112:aload_2         
	//*  47  113:getfield        #156 <Field Map TransitionValues.values>
	//*  48  116:ldc1            #32  <String "android:changeTransform:matrix">
	//*  49  118:aload           6
	//*  50  120:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  51  125:pop             
	//*  52  126:aload_2         
	//*  53  127:getfield        #156 <Field Map TransitionValues.values>
	//*  54  130:ldc1            #29  <String "android:changeTransform:intermediateParentMatrix">
	//*  55  132:invokeinterface #215 <Method Object Map.get(Object)>
	//*  56  137:checkcast       #91  <Class Matrix>
	//*  57  140:astore          6
	//*  58  142:aload           6
	//*  59  144:ifnull          161
	//*  60  147:aload_2         
	//*  61  148:getfield        #156 <Field Map TransitionValues.values>
	//*  62  151:ldc1            #38  <String "android:changeTransform:parentMatrix">
	//*  63  153:aload           6
	//*  64  155:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//*  65  160:pop             
	//*  66  161:iload           4
	//*  67  163:ifeq            172
	//*  68  166:aload_0         
	//*  69  167:aload_2         
	//*  70  168:aload_3         
	//*  71  169:invokespecial   #378 <Method void setMatricesForParent(TransitionValues, TransitionValues)>
	//*  72  172:aload_0         
	//*  73  173:aload_2         
	//*  74  174:aload_3         
	//*  75  175:iload           4
	//*  76  177:invokespecial   #380 <Method ObjectAnimator createTransformAnimator(TransitionValues, TransitionValues, boolean)>
	//*  77  180:astore          6
	//*  78  182:iload           4
	//*  79  184:ifeq            215
	//*  80  187:aload           6
	//*  81  189:ifnull          215
	//*  82  192:aload_0         
	//*  83  193:getfield        #87  <Field boolean mUseOverlay>
	//*  84  196:ifeq            215
	//*  85  199:aload_0         
	//*  86  200:aload_1         
	//*  87  201:aload_2         
	//*  88  202:aload_3         
	//*  89  203:invokespecial   #382 <Method void createGhostView(ViewGroup, TransitionValues, TransitionValues)>
	//*  90  206:aload           6
	//*  91  208:areturn         
			flag = false;
	//   92  209:iconst_0        
	//   93  210:istore          4
		obj = ((Object) ((Matrix)transitionvalues.values.get("android:changeTransform:intermediateMatrix")));
		if(obj != null)
			transitionvalues.values.put("android:changeTransform:matrix", obj);
		obj = ((Object) ((Matrix)transitionvalues.values.get("android:changeTransform:intermediateParentMatrix")));
		if(obj != null)
			transitionvalues.values.put("android:changeTransform:parentMatrix", obj);
		if(flag)
			setMatricesForParent(transitionvalues, transitionvalues1);
		obj = ((Object) (createTransformAnimator(transitionvalues, transitionvalues1, flag)));
		if(!flag || obj == null || !mUseOverlay) goto _L2; else goto _L1
_L1:
		createGhostView(viewgroup, transitionvalues, transitionvalues1);
_L4:
		return ((Animator) (obj));
	//*  94  212:goto            91
_L2:
		if(!SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
	//*  95  215:getstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  96  218:ifne            206
			viewgroup1.endViewTransition(transitionvalues.view);
	//   97  221:aload           5
	//   98  223:aload_2         
	//   99  224:getfield        #146 <Field View TransitionValues.view>
	//  100  227:invokevirtual   #385 <Method void ViewGroup.endViewTransition(View)>
		if(true) goto _L4; else goto _L3
	//  101  230:goto            206
_L3:
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
		boolean flag = true;
	//    0    0:iconst_1        
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
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*  29   52:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   55:bipush          21
	//*  31   57:icmplt          65
	//*  32   60:iload_0         
	//*  33   61:putstatic       #82  <Field boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION>
	//*  34   64:return          
			flag = false;
	//   35   65:iconst_0        
	//   36   66:istore_0        
		SUPPORTS_VIEW_REMOVAL_SUPPRESSION = flag;
	//*  37   67:goto            60
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
