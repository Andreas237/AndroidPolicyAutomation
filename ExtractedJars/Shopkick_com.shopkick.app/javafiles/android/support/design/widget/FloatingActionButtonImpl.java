// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.design.animation.*;
import android.support.design.ripple.RippleUtils;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.*;

// Referenced classes of package android.support.design.widget:
//			StateListAnimator, VisibilityAwareImageButton, ShadowDrawableWrapper, CircularBorderDrawable, 
//			ShadowViewDelegate

class FloatingActionButtonImpl
{
	private class DisabledElevationAnimation extends ShadowAnimatorImpl
	{

		protected float getTargetShadowSize()
		{
			return 0.0F;
		//    0    0:fconst_0        
		//    1    1:freturn         
		}

		final FloatingActionButtonImpl this$0;

		DisabledElevationAnimation()
		{
			this$0 = FloatingActionButtonImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field FloatingActionButtonImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #16  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl, FloatingActionButtonImpl$1)>
		//    7   11:return          
		}
	}

	private class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl
	{

		protected float getTargetShadowSize()
		{
			return elevation + hoveredFocusedTranslationZ;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.elevation>
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    5   11:getfield        #26  <Field float FloatingActionButtonImpl.hoveredFocusedTranslationZ>
		//    6   14:fadd            
		//    7   15:freturn         
		}

		final FloatingActionButtonImpl this$0;

		ElevateToHoveredFocusedTranslationZAnimation()
		{
			this$0 = FloatingActionButtonImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field FloatingActionButtonImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #16  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl, FloatingActionButtonImpl$1)>
		//    7   11:return          
		}
	}

	private class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl
	{

		protected float getTargetShadowSize()
		{
			return elevation + pressedTranslationZ;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.elevation>
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    5   11:getfield        #26  <Field float FloatingActionButtonImpl.pressedTranslationZ>
		//    6   14:fadd            
		//    7   15:freturn         
		}

		final FloatingActionButtonImpl this$0;

		ElevateToPressedTranslationZAnimation()
		{
			this$0 = FloatingActionButtonImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field FloatingActionButtonImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #16  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl, FloatingActionButtonImpl$1)>
		//    7   11:return          
		}
	}

	static interface InternalVisibilityChangedListener
	{

		public abstract void onHidden();

		public abstract void onShown();
	}

	private class ResetElevationAnimation extends ShadowAnimatorImpl
	{

		protected float getTargetShadowSize()
		{
			return elevation;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.elevation>
		//    3    7:freturn         
		}

		final FloatingActionButtonImpl this$0;

		ResetElevationAnimation()
		{
			this$0 = FloatingActionButtonImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field FloatingActionButtonImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #16  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl, FloatingActionButtonImpl$1)>
		//    7   11:return          
		}
	}

	private abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter
		implements android.animation.ValueAnimator.AnimatorUpdateListener
	{

		protected abstract float getTargetShadowSize();

		public void onAnimationEnd(Animator animator)
		{
			shadowDrawable.setShadowSize(shadowSizeEnd);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
		//    3    7:aload_0         
		//    4    8:getfield        #37  <Field float shadowSizeEnd>
		//    5   11:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
			validValues = false;
		//    6   14:aload_0         
		//    7   15:iconst_0        
		//    8   16:putfield        #45  <Field boolean validValues>
		//    9   19:return          
		}

		public void onAnimationUpdate(ValueAnimator valueanimator)
		{
			if(!validValues)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field boolean validValues>
		//*   2    4:ifne            34
			{
				shadowSizeStart = shadowDrawable.getShadowSize();
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//    6   12:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
		//    7   15:invokevirtual   #50  <Method float ShadowDrawableWrapper.getShadowSize()>
		//    8   18:putfield        #52  <Field float shadowSizeStart>
				shadowSizeEnd = getTargetShadowSize();
		//    9   21:aload_0         
		//   10   22:aload_0         
		//   11   23:invokevirtual   #54  <Method float getTargetShadowSize()>
		//   12   26:putfield        #37  <Field float shadowSizeEnd>
				validValues = true;
		//   13   29:aload_0         
		//   14   30:iconst_1        
		//   15   31:putfield        #45  <Field boolean validValues>
			}
			ShadowDrawableWrapper shadowdrawablewrapper = shadowDrawable;
		//   16   34:aload_0         
		//   17   35:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//   18   38:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
		//   19   41:astore_3        
			float f = shadowSizeStart;
		//   20   42:aload_0         
		//   21   43:getfield        #52  <Field float shadowSizeStart>
		//   22   46:fstore_2        
			shadowdrawablewrapper.setShadowSize(f + (shadowSizeEnd - f) * valueanimator.getAnimatedFraction());
		//   23   47:aload_3         
		//   24   48:fload_2         
		//   25   49:aload_0         
		//   26   50:getfield        #37  <Field float shadowSizeEnd>
		//   27   53:fload_2         
		//   28   54:fsub            
		//   29   55:aload_1         
		//   30   56:invokevirtual   #59  <Method float ValueAnimator.getAnimatedFraction()>
		//   31   59:fmul            
		//   32   60:fadd            
		//   33   61:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
		//   34   64:return          
		}

		private float shadowSizeEnd;
		private float shadowSizeStart;
		final FloatingActionButtonImpl this$0;
		private boolean validValues;

		private ShadowAnimatorImpl()
		{
			this$0 = FloatingActionButtonImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field FloatingActionButtonImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void AnimatorListenerAdapter()>
		//    5    9:return          
		}

	}


	FloatingActionButtonImpl(VisibilityAwareImageButton visibilityawareimagebutton, ShadowViewDelegate shadowviewdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Object()>
		animState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #132 <Field int animState>
		imageMatrixScale = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #134 <Field float imageMatrixScale>
	//    8   14:aload_0         
	//    9   15:new             #136 <Class Rect>
	//   10   18:dup             
	//   11   19:invokespecial   #137 <Method void Rect()>
	//   12   22:putfield        #139 <Field Rect tmpRect>
	//   13   25:aload_0         
	//   14   26:new             #141 <Class RectF>
	//   15   29:dup             
	//   16   30:invokespecial   #142 <Method void RectF()>
	//   17   33:putfield        #144 <Field RectF tmpRectF1>
	//   18   36:aload_0         
	//   19   37:new             #141 <Class RectF>
	//   20   40:dup             
	//   21   41:invokespecial   #142 <Method void RectF()>
	//   22   44:putfield        #146 <Field RectF tmpRectF2>
	//   23   47:aload_0         
	//   24   48:new             #148 <Class Matrix>
	//   25   51:dup             
	//   26   52:invokespecial   #149 <Method void Matrix()>
	//   27   55:putfield        #151 <Field Matrix tmpMatrix>
		view = visibilityawareimagebutton;
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:putfield        #153 <Field VisibilityAwareImageButton view>
		shadowViewDelegate = shadowviewdelegate;
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:putfield        #155 <Field ShadowViewDelegate shadowViewDelegate>
	//   34   68:aload_0         
	//   35   69:new             #157 <Class StateListAnimator>
	//   36   72:dup             
	//   37   73:invokespecial   #158 <Method void StateListAnimator()>
	//   38   76:putfield        #160 <Field StateListAnimator stateListAnimator>
		stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new ElevateToPressedTranslationZAnimation()))));
	//   39   79:aload_0         
	//   40   80:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   41   83:getstatic       #113 <Field int[] PRESSED_ENABLED_STATE_SET>
	//   42   86:aload_0         
	//   43   87:new             #18  <Class FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation>
	//   44   90:dup             
	//   45   91:aload_0         
	//   46   92:invokespecial   #163 <Method void FloatingActionButtonImpl$ElevateToPressedTranslationZAnimation(FloatingActionButtonImpl)>
	//   47   95:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   48   98:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new ElevateToHoveredFocusedTranslationZAnimation()))));
	//   49  101:aload_0         
	//   50  102:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   51  105:getstatic       #117 <Field int[] HOVERED_FOCUSED_ENABLED_STATE_SET>
	//   52  108:aload_0         
	//   53  109:new             #15  <Class FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation>
	//   54  112:dup             
	//   55  113:aload_0         
	//   56  114:invokespecial   #172 <Method void FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl)>
	//   57  117:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   58  120:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new ElevateToHoveredFocusedTranslationZAnimation()))));
	//   59  123:aload_0         
	//   60  124:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   61  127:getstatic       #119 <Field int[] FOCUSED_ENABLED_STATE_SET>
	//   62  130:aload_0         
	//   63  131:new             #15  <Class FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation>
	//   64  134:dup             
	//   65  135:aload_0         
	//   66  136:invokespecial   #172 <Method void FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl)>
	//   67  139:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   68  142:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new ElevateToHoveredFocusedTranslationZAnimation()))));
	//   69  145:aload_0         
	//   70  146:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   71  149:getstatic       #121 <Field int[] HOVERED_ENABLED_STATE_SET>
	//   72  152:aload_0         
	//   73  153:new             #15  <Class FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation>
	//   74  156:dup             
	//   75  157:aload_0         
	//   76  158:invokespecial   #172 <Method void FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl)>
	//   77  161:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   78  164:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		stateListAnimator.addState(ENABLED_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new ResetElevationAnimation()))));
	//   79  167:aload_0         
	//   80  168:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   81  171:getstatic       #123 <Field int[] ENABLED_STATE_SET>
	//   82  174:aload_0         
	//   83  175:new             #24  <Class FloatingActionButtonImpl$ResetElevationAnimation>
	//   84  178:dup             
	//   85  179:aload_0         
	//   86  180:invokespecial   #173 <Method void FloatingActionButtonImpl$ResetElevationAnimation(FloatingActionButtonImpl)>
	//   87  183:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   88  186:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(((ShadowAnimatorImpl) (new DisabledElevationAnimation()))));
	//   89  189:aload_0         
	//   90  190:getfield        #160 <Field StateListAnimator stateListAnimator>
	//   91  193:getstatic       #125 <Field int[] EMPTY_STATE_SET>
	//   92  196:aload_0         
	//   93  197:new             #12  <Class FloatingActionButtonImpl$DisabledElevationAnimation>
	//   94  200:dup             
	//   95  201:aload_0         
	//   96  202:invokespecial   #174 <Method void FloatingActionButtonImpl$DisabledElevationAnimation(FloatingActionButtonImpl)>
	//   97  205:invokespecial   #167 <Method ValueAnimator createElevationAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   98  208:invokevirtual   #171 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		rotation = view.getRotation();
	//   99  211:aload_0         
	//  100  212:aload_0         
	//  101  213:getfield        #153 <Field VisibilityAwareImageButton view>
	//  102  216:invokevirtual   #180 <Method float VisibilityAwareImageButton.getRotation()>
	//  103  219:putfield        #182 <Field float rotation>
	//  104  222:return          
	}

	private void calculateImageMatrixFromScale(float f, Matrix matrix)
	{
		matrix.reset();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #187 <Method void Matrix.reset()>
		Drawable drawable = view.getDrawable();
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field VisibilityAwareImageButton view>
	//    4    8:invokevirtual   #191 <Method Drawable VisibilityAwareImageButton.getDrawable()>
	//    5   11:astore          4
		if(drawable != null && maxImageSize != 0)
	//*   6   13:aload           4
	//*   7   15:ifnull          104
	//*   8   18:aload_0         
	//*   9   19:getfield        #193 <Field int maxImageSize>
	//*  10   22:ifeq            104
		{
			RectF rectf = tmpRectF1;
	//   11   25:aload_0         
	//   12   26:getfield        #144 <Field RectF tmpRectF1>
	//   13   29:astore          5
			RectF rectf1 = tmpRectF2;
	//   14   31:aload_0         
	//   15   32:getfield        #146 <Field RectF tmpRectF2>
	//   16   35:astore          6
			rectf.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//   17   37:aload           5
	//   18   39:fconst_0        
	//   19   40:fconst_0        
	//   20   41:aload           4
	//   21   43:invokevirtual   #199 <Method int Drawable.getIntrinsicWidth()>
	//   22   46:i2f             
	//   23   47:aload           4
	//   24   49:invokevirtual   #202 <Method int Drawable.getIntrinsicHeight()>
	//   25   52:i2f             
	//   26   53:invokevirtual   #206 <Method void RectF.set(float, float, float, float)>
			int i = maxImageSize;
	//   27   56:aload_0         
	//   28   57:getfield        #193 <Field int maxImageSize>
	//   29   60:istore_3        
			rectf1.set(0.0F, 0.0F, i, i);
	//   30   61:aload           6
	//   31   63:fconst_0        
	//   32   64:fconst_0        
	//   33   65:iload_3         
	//   34   66:i2f             
	//   35   67:iload_3         
	//   36   68:i2f             
	//   37   69:invokevirtual   #206 <Method void RectF.set(float, float, float, float)>
			matrix.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.CENTER);
	//   38   72:aload_2         
	//   39   73:aload           5
	//   40   75:aload           6
	//   41   77:getstatic       #212 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.CENTER>
	//   42   80:invokevirtual   #216 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//   43   83:pop             
			i = maxImageSize;
	//   44   84:aload_0         
	//   45   85:getfield        #193 <Field int maxImageSize>
	//   46   88:istore_3        
			matrix.postScale(f, f, (float)i / 2.0F, (float)i / 2.0F);
	//   47   89:aload_2         
	//   48   90:fload_1         
	//   49   91:fload_1         
	//   50   92:iload_3         
	//   51   93:i2f             
	//   52   94:fconst_2        
	//   53   95:fdiv            
	//   54   96:iload_3         
	//   55   97:i2f             
	//   56   98:fconst_2        
	//   57   99:fdiv            
	//   58  100:invokevirtual   #220 <Method boolean Matrix.postScale(float, float, float, float)>
	//   59  103:pop             
		}
	//   60  104:return          
	}

	private AnimatorSet createAnimator(MotionSpec motionspec, float f, float f1, float f2)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #225 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void ArrayList()>
	//    3    7:astore          5
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view)), View.ALPHA, new float[] {
			f
		});
	//    4    9:aload_0         
	//    5   10:getfield        #153 <Field VisibilityAwareImageButton view>
	//    6   13:getstatic       #232 <Field android.util.Property View.ALPHA>
	//    7   16:iconst_1        
	//    8   17:newarray        float[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:fload_2         
	//   12   22:fastore         
	//   13   23:invokestatic    #238 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   14   26:astore          6
		motionspec.getTiming("opacity").apply(((Animator) (objectanimator)));
	//   15   28:aload_1         
	//   16   29:ldc1            #240 <String "opacity">
	//   17   31:invokevirtual   #246 <Method MotionTiming MotionSpec.getTiming(String)>
	//   18   34:aload           6
	//   19   36:invokevirtual   #252 <Method void MotionTiming.apply(Animator)>
		((List) (arraylist)).add(((Object) (objectanimator)));
	//   20   39:aload           5
	//   21   41:aload           6
	//   22   43:invokeinterface #258 <Method boolean List.add(Object)>
	//   23   48:pop             
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), View.SCALE_X, new float[] {
			f1
		});
	//   24   49:aload_0         
	//   25   50:getfield        #153 <Field VisibilityAwareImageButton view>
	//   26   53:getstatic       #261 <Field android.util.Property View.SCALE_X>
	//   27   56:iconst_1        
	//   28   57:newarray        float[]
	//   29   59:dup             
	//   30   60:iconst_0        
	//   31   61:fload_3         
	//   32   62:fastore         
	//   33   63:invokestatic    #238 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   34   66:astore          6
		motionspec.getTiming("scale").apply(((Animator) (objectanimator)));
	//   35   68:aload_1         
	//   36   69:ldc2            #263 <String "scale">
	//   37   72:invokevirtual   #246 <Method MotionTiming MotionSpec.getTiming(String)>
	//   38   75:aload           6
	//   39   77:invokevirtual   #252 <Method void MotionTiming.apply(Animator)>
		((List) (arraylist)).add(((Object) (objectanimator)));
	//   40   80:aload           5
	//   41   82:aload           6
	//   42   84:invokeinterface #258 <Method boolean List.add(Object)>
	//   43   89:pop             
		objectanimator = ObjectAnimator.ofFloat(((Object) (view)), View.SCALE_Y, new float[] {
			f1
		});
	//   44   90:aload_0         
	//   45   91:getfield        #153 <Field VisibilityAwareImageButton view>
	//   46   94:getstatic       #266 <Field android.util.Property View.SCALE_Y>
	//   47   97:iconst_1        
	//   48   98:newarray        float[]
	//   49  100:dup             
	//   50  101:iconst_0        
	//   51  102:fload_3         
	//   52  103:fastore         
	//   53  104:invokestatic    #238 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   54  107:astore          6
		motionspec.getTiming("scale").apply(((Animator) (objectanimator)));
	//   55  109:aload_1         
	//   56  110:ldc2            #263 <String "scale">
	//   57  113:invokevirtual   #246 <Method MotionTiming MotionSpec.getTiming(String)>
	//   58  116:aload           6
	//   59  118:invokevirtual   #252 <Method void MotionTiming.apply(Animator)>
		((List) (arraylist)).add(((Object) (objectanimator)));
	//   60  121:aload           5
	//   61  123:aload           6
	//   62  125:invokeinterface #258 <Method boolean List.add(Object)>
	//   63  130:pop             
		calculateImageMatrixFromScale(f2, tmpMatrix);
	//   64  131:aload_0         
	//   65  132:fload           4
	//   66  134:aload_0         
	//   67  135:getfield        #151 <Field Matrix tmpMatrix>
	//   68  138:invokespecial   #268 <Method void calculateImageMatrixFromScale(float, Matrix)>
		objectanimator = ObjectAnimator.ofObject(((Object) (view)), ((android.util.Property) (new ImageMatrixProperty())), ((android.animation.TypeEvaluator) (new MatrixEvaluator())), ((Object []) (new Matrix[] {
			new Matrix(tmpMatrix)
		})));
	//   69  141:aload_0         
	//   70  142:getfield        #153 <Field VisibilityAwareImageButton view>
	//   71  145:new             #270 <Class ImageMatrixProperty>
	//   72  148:dup             
	//   73  149:invokespecial   #271 <Method void ImageMatrixProperty()>
	//   74  152:new             #273 <Class MatrixEvaluator>
	//   75  155:dup             
	//   76  156:invokespecial   #274 <Method void MatrixEvaluator()>
	//   77  159:iconst_1        
	//   78  160:anewarray       Matrix[]
	//   79  163:dup             
	//   80  164:iconst_0        
	//   81  165:new             #148 <Class Matrix>
	//   82  168:dup             
	//   83  169:aload_0         
	//   84  170:getfield        #151 <Field Matrix tmpMatrix>
	//   85  173:invokespecial   #277 <Method void Matrix(Matrix)>
	//   86  176:aastore         
	//   87  177:invokestatic    #281 <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//   88  180:astore          6
		motionspec.getTiming("iconScale").apply(((Animator) (objectanimator)));
	//   89  182:aload_1         
	//   90  183:ldc2            #283 <String "iconScale">
	//   91  186:invokevirtual   #246 <Method MotionTiming MotionSpec.getTiming(String)>
	//   92  189:aload           6
	//   93  191:invokevirtual   #252 <Method void MotionTiming.apply(Animator)>
		((List) (arraylist)).add(((Object) (objectanimator)));
	//   94  194:aload           5
	//   95  196:aload           6
	//   96  198:invokeinterface #258 <Method boolean List.add(Object)>
	//   97  203:pop             
		motionspec = ((MotionSpec) (new AnimatorSet()));
	//   98  204:new             #285 <Class AnimatorSet>
	//   99  207:dup             
	//  100  208:invokespecial   #286 <Method void AnimatorSet()>
	//  101  211:astore_1        
		AnimatorSetCompat.playTogether(((AnimatorSet) (motionspec)), ((List) (arraylist)));
	//  102  212:aload_1         
	//  103  213:aload           5
	//  104  215:invokestatic    #292 <Method void AnimatorSetCompat.playTogether(AnimatorSet, List)>
		return ((AnimatorSet) (motionspec));
	//  105  218:aload_1         
	//  106  219:areturn         
	}

	private ValueAnimator createElevationAnimator(ShadowAnimatorImpl shadowanimatorimpl)
	{
		ValueAnimator valueanimator = new ValueAnimator();
	//    0    0:new             #296 <Class ValueAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #297 <Method void ValueAnimator()>
	//    3    7:astore_2        
		valueanimator.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
	//    4    8:aload_2         
	//    5    9:getstatic       #109 <Field TimeInterpolator ELEVATION_ANIM_INTERPOLATOR>
	//    6   12:invokevirtual   #301 <Method void ValueAnimator.setInterpolator(TimeInterpolator)>
		valueanimator.setDuration(100L);
	//    7   15:aload_2         
	//    8   16:ldc2w           #38  <Long 100L>
	//    9   19:invokevirtual   #305 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   10   22:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (shadowanimatorimpl)));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #309 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (shadowanimatorimpl)));
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #313 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.setFloatValues(new float[] {
			0.0F, 1.0F
		});
	//   17   33:aload_2         
	//   18   34:iconst_2        
	//   19   35:newarray        float[]
	//   20   37:dup             
	//   21   38:iconst_0        
	//   22   39:fconst_0        
	//   23   40:fastore         
	//   24   41:dup             
	//   25   42:iconst_1        
	//   26   43:fconst_1        
	//   27   44:fastore         
	//   28   45:invokevirtual   #317 <Method void ValueAnimator.setFloatValues(float[])>
		return valueanimator;
	//   29   48:aload_2         
	//   30   49:areturn         
	}

	private void ensurePreDrawListener()
	{
		if(preDrawListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
	//*   2    4:ifnonnull       19
			preDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

				public boolean onPreDraw()
				{
					FloatingActionButtonImpl.this.onPreDraw();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field FloatingActionButtonImpl this$0>
				//    2    4:invokevirtual   #24  <Method void FloatingActionButtonImpl.onPreDraw()>
					return true;
				//    3    7:iconst_1        
				//    4    8:ireturn         
				}

				final FloatingActionButtonImpl this$0;

			
			{
				this$0 = FloatingActionButtonImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FloatingActionButtonImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    3    7:aload_0         
	//    4    8:new             #10  <Class FloatingActionButtonImpl$3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #321 <Method void FloatingActionButtonImpl$3(FloatingActionButtonImpl)>
	//    8   16:putfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
	//    9   19:return          
	}

	private MotionSpec getDefaultHideMotionSpec()
	{
		if(defaultHideMotionSpec == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #325 <Field MotionSpec defaultHideMotionSpec>
	//*   2    4:ifnonnull       24
			defaultHideMotionSpec = MotionSpec.createFromResource(view.getContext(), android.support.design.R.animator.design_fab_hide_motion_spec);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #153 <Field VisibilityAwareImageButton view>
	//    6   12:invokevirtual   #329 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//    7   15:getstatic       #334 <Field int android.support.design.R$animator.design_fab_hide_motion_spec>
	//    8   18:invokestatic    #338 <Method MotionSpec MotionSpec.createFromResource(android.content.Context, int)>
	//    9   21:putfield        #325 <Field MotionSpec defaultHideMotionSpec>
		return defaultHideMotionSpec;
	//   10   24:aload_0         
	//   11   25:getfield        #325 <Field MotionSpec defaultHideMotionSpec>
	//   12   28:areturn         
	}

	private MotionSpec getDefaultShowMotionSpec()
	{
		if(defaultShowMotionSpec == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field MotionSpec defaultShowMotionSpec>
	//*   2    4:ifnonnull       24
			defaultShowMotionSpec = MotionSpec.createFromResource(view.getContext(), android.support.design.R.animator.design_fab_show_motion_spec);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #153 <Field VisibilityAwareImageButton view>
	//    6   12:invokevirtual   #329 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//    7   15:getstatic       #344 <Field int android.support.design.R$animator.design_fab_show_motion_spec>
	//    8   18:invokestatic    #338 <Method MotionSpec MotionSpec.createFromResource(android.content.Context, int)>
	//    9   21:putfield        #341 <Field MotionSpec defaultShowMotionSpec>
		return defaultShowMotionSpec;
	//   10   24:aload_0         
	//   11   25:getfield        #341 <Field MotionSpec defaultShowMotionSpec>
	//   12   28:areturn         
	}

	private boolean shouldAnimateVisibilityChange()
	{
		return ViewCompat.isLaidOut(((View) (view))) && !view.isInEditMode();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field VisibilityAwareImageButton view>
	//    2    4:invokestatic    #352 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ifeq            22
	//    4   10:aload_0         
	//    5   11:getfield        #153 <Field VisibilityAwareImageButton view>
	//    6   14:invokevirtual   #355 <Method boolean VisibilityAwareImageButton.isInEditMode()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private void updateFromViewRotation()
	{
		if(android.os.Build.VERSION.SDK_INT == 19)
	//*   0    0:getstatic       #361 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpne          63
			if(rotation % 90F != 0.0F)
	//*   3    8:aload_0         
	//*   4    9:getfield        #182 <Field float rotation>
	//*   5   12:ldc2            #362 <Float 90F>
	//*   6   15:frem            
	//*   7   16:fconst_0        
	//*   8   17:fcmpl           
	//*   9   18:ifeq            44
			{
				if(view.getLayerType() != 1)
	//*  10   21:aload_0         
	//*  11   22:getfield        #153 <Field VisibilityAwareImageButton view>
	//*  12   25:invokevirtual   #365 <Method int VisibilityAwareImageButton.getLayerType()>
	//*  13   28:iconst_1        
	//*  14   29:icmpeq          63
					view.setLayerType(1, ((android.graphics.Paint) (null)));
	//   15   32:aload_0         
	//   16   33:getfield        #153 <Field VisibilityAwareImageButton view>
	//   17   36:iconst_1        
	//   18   37:aconst_null     
	//   19   38:invokevirtual   #369 <Method void VisibilityAwareImageButton.setLayerType(int, android.graphics.Paint)>
			} else
	//*  20   41:goto            63
			if(view.getLayerType() != 0)
	//*  21   44:aload_0         
	//*  22   45:getfield        #153 <Field VisibilityAwareImageButton view>
	//*  23   48:invokevirtual   #365 <Method int VisibilityAwareImageButton.getLayerType()>
	//*  24   51:ifeq            63
				view.setLayerType(0, ((android.graphics.Paint) (null)));
	//   25   54:aload_0         
	//   26   55:getfield        #153 <Field VisibilityAwareImageButton view>
	//   27   58:iconst_0        
	//   28   59:aconst_null     
	//   29   60:invokevirtual   #369 <Method void VisibilityAwareImageButton.setLayerType(int, android.graphics.Paint)>
		Object obj = ((Object) (shadowDrawable));
	//   30   63:aload_0         
	//   31   64:getfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
	//   32   67:astore_1        
		if(obj != null)
	//*  33   68:aload_1         
	//*  34   69:ifnull          81
			((ShadowDrawableWrapper) (obj)).setRotation(-rotation);
	//   35   72:aload_1         
	//   36   73:aload_0         
	//   37   74:getfield        #182 <Field float rotation>
	//   38   77:fneg            
	//   39   78:invokevirtual   #377 <Method void ShadowDrawableWrapper.setRotation(float)>
		obj = ((Object) (borderDrawable));
	//   40   81:aload_0         
	//   41   82:getfield        #379 <Field CircularBorderDrawable borderDrawable>
	//   42   85:astore_1        
		if(obj != null)
	//*  43   86:aload_1         
	//*  44   87:ifnull          99
			((CircularBorderDrawable) (obj)).setRotation(-rotation);
	//   45   90:aload_1         
	//   46   91:aload_0         
	//   47   92:getfield        #182 <Field float rotation>
	//   48   95:fneg            
	//   49   96:invokevirtual   #382 <Method void CircularBorderDrawable.setRotation(float)>
	//   50   99:return          
	}

	public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		if(hideListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #385 <Field ArrayList hideListeners>
	//*   2    4:ifnonnull       18
			hideListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #225 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #226 <Method void ArrayList()>
	//    7   15:putfield        #385 <Field ArrayList hideListeners>
		hideListeners.add(((Object) (animatorlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #385 <Field ArrayList hideListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #386 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	void addOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		if(showListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #389 <Field ArrayList showListeners>
	//*   2    4:ifnonnull       18
			showListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #225 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #226 <Method void ArrayList()>
	//    7   15:putfield        #389 <Field ArrayList showListeners>
		showListeners.add(((Object) (animatorlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #389 <Field ArrayList showListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #386 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	CircularBorderDrawable createBorderDrawable(int i, ColorStateList colorstatelist)
	{
		android.content.Context context = view.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field VisibilityAwareImageButton view>
	//    2    4:invokevirtual   #329 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//    3    7:astore_3        
		CircularBorderDrawable circularborderdrawable = newCircularDrawable();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #395 <Method CircularBorderDrawable newCircularDrawable()>
	//    6   12:astore          4
		circularborderdrawable.setGradientColors(ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_end_outer_color));
	//    7   14:aload           4
	//    8   16:aload_3         
	//    9   17:getstatic       #400 <Field int android.support.design.R$color.design_fab_stroke_top_outer_color>
	//   10   20:invokestatic    #406 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   11   23:aload_3         
	//   12   24:getstatic       #409 <Field int android.support.design.R$color.design_fab_stroke_top_inner_color>
	//   13   27:invokestatic    #406 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   14   30:aload_3         
	//   15   31:getstatic       #412 <Field int android.support.design.R$color.design_fab_stroke_end_inner_color>
	//   16   34:invokestatic    #406 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   17   37:aload_3         
	//   18   38:getstatic       #415 <Field int android.support.design.R$color.design_fab_stroke_end_outer_color>
	//   19   41:invokestatic    #406 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   20   44:invokevirtual   #419 <Method void CircularBorderDrawable.setGradientColors(int, int, int, int)>
		circularborderdrawable.setBorderWidth(i);
	//   21   47:aload           4
	//   22   49:iload_1         
	//   23   50:i2f             
	//   24   51:invokevirtual   #422 <Method void CircularBorderDrawable.setBorderWidth(float)>
		circularborderdrawable.setBorderTint(colorstatelist);
	//   25   54:aload           4
	//   26   56:aload_2         
	//   27   57:invokevirtual   #426 <Method void CircularBorderDrawable.setBorderTint(ColorStateList)>
		return circularborderdrawable;
	//   28   60:aload           4
	//   29   62:areturn         
	}

	GradientDrawable createShapeDrawable()
	{
		GradientDrawable gradientdrawable = newGradientDrawableForShape();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #431 <Method GradientDrawable newGradientDrawableForShape()>
	//    2    4:astore_1        
		gradientdrawable.setShape(1);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #437 <Method void GradientDrawable.setShape(int)>
		gradientdrawable.setColor(-1);
	//    6   10:aload_1         
	//    7   11:iconst_m1       
	//    8   12:invokevirtual   #440 <Method void GradientDrawable.setColor(int)>
		return gradientdrawable;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	final Drawable getContentBackground()
	{
		return contentBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #443 <Field Drawable contentBackground>
	//    2    4:areturn         
	}

	float getElevation()
	{
		return elevation;
	//    0    0:aload_0         
	//    1    1:getfield        #446 <Field float elevation>
	//    2    4:freturn         
	}

	final MotionSpec getHideMotionSpec()
	{
		return hideMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #449 <Field MotionSpec hideMotionSpec>
	//    2    4:areturn         
	}

	float getHoveredFocusedTranslationZ()
	{
		return hoveredFocusedTranslationZ;
	//    0    0:aload_0         
	//    1    1:getfield        #452 <Field float hoveredFocusedTranslationZ>
	//    2    4:freturn         
	}

	void getPadding(Rect rect)
	{
		shadowDrawable.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #457 <Method boolean ShadowDrawableWrapper.getPadding(Rect)>
	//    4    8:pop             
	//    5    9:return          
	}

	float getPressedTranslationZ()
	{
		return pressedTranslationZ;
	//    0    0:aload_0         
	//    1    1:getfield        #460 <Field float pressedTranslationZ>
	//    2    4:freturn         
	}

	final MotionSpec getShowMotionSpec()
	{
		return showMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #463 <Field MotionSpec showMotionSpec>
	//    2    4:areturn         
	}

	void hide(final InternalVisibilityChangedListener listener, final boolean fromUser)
	{
		if(isOrWillBeHidden())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean isOrWillBeHidden()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		Object obj = ((Object) (currentAnimator));
	//    4    8:aload_0         
	//    5    9:getfield        #470 <Field Animator currentAnimator>
	//    6   12:astore          4
		if(obj != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          24
			((Animator) (obj)).cancel();
	//    9   19:aload           4
	//   10   21:invokevirtual   #475 <Method void Animator.cancel()>
		if(shouldAnimateVisibilityChange())
	//*  11   24:aload_0         
	//*  12   25:invokespecial   #477 <Method boolean shouldAnimateVisibilityChange()>
	//*  13   28:ifeq            123
		{
			obj = ((Object) (hideMotionSpec));
	//   14   31:aload_0         
	//   15   32:getfield        #449 <Field MotionSpec hideMotionSpec>
	//   16   35:astore          4
			if(obj == null)
	//*  17   37:aload           4
	//*  18   39:ifnull          45
	//*  19   42:goto            51
				obj = ((Object) (getDefaultHideMotionSpec()));
	//   20   45:aload_0         
	//   21   46:invokespecial   #479 <Method MotionSpec getDefaultHideMotionSpec()>
	//   22   49:astore          4
			obj = ((Object) (createAnimator(((MotionSpec) (obj)), 0.0F, 0.0F, 0.0F)));
	//   23   51:aload_0         
	//   24   52:aload           4
	//   25   54:fconst_0        
	//   26   55:fconst_0        
	//   27   56:fconst_0        
	//   28   57:invokespecial   #481 <Method AnimatorSet createAnimator(MotionSpec, float, float, float)>
	//   29   60:astore          4
			((AnimatorSet) (obj)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationCancel(Animator animator)
				{
					cancelled = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #32  <Field boolean cancelled>
				//    3    5:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					animator = ((Animator) (FloatingActionButtonImpl.this));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
				//    2    4:astore_1        
					animator.animState = 0;
				//    3    5:aload_1         
				//    4    6:iconst_0        
				//    5    7:putfield        #37  <Field int FloatingActionButtonImpl.animState>
					animator.currentAnimator = null;
				//    6   10:aload_1         
				//    7   11:aconst_null     
				//    8   12:putfield        #41  <Field Animator FloatingActionButtonImpl.currentAnimator>
					if(!cancelled)
				//*   9   15:aload_0         
				//*  10   16:getfield        #32  <Field boolean cancelled>
				//*  11   19:ifne            66
					{
						animator = ((Animator) (((FloatingActionButtonImpl) (animator)).view));
				//   12   22:aload_1         
				//   13   23:getfield        #45  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
				//   14   26:astore_1        
						byte byte1;
						if(fromUser)
				//*  15   27:aload_0         
				//*  16   28:getfield        #22  <Field boolean val$fromUser>
				//*  17   31:ifeq            40
							byte1 = 8;
				//   18   34:bipush          8
				//   19   36:istore_2        
						else
				//*  20   37:goto            42
							byte1 = 4;
				//   21   40:iconst_4        
				//   22   41:istore_2        
						((VisibilityAwareImageButton) (animator)).internalSetVisibility(((int) (byte1)), fromUser);
				//   23   42:aload_1         
				//   24   43:iload_2         
				//   25   44:aload_0         
				//   26   45:getfield        #22  <Field boolean val$fromUser>
				//   27   48:invokevirtual   #51  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
						animator = ((Animator) (listener));
				//   28   51:aload_0         
				//   29   52:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
				//   30   55:astore_1        
						if(animator != null)
				//*  31   56:aload_1         
				//*  32   57:ifnull          66
							((InternalVisibilityChangedListener) (animator)).onHidden();
				//   33   60:aload_1         
				//   34   61:invokeinterface #56  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
					}
				//   35   66:return          
				}

				public void onAnimationStart(Animator animator)
				{
					view.internalSetVisibility(0, fromUser);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
				//    2    4:getfield        #45  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
				//    3    7:iconst_0        
				//    4    8:aload_0         
				//    5    9:getfield        #22  <Field boolean val$fromUser>
				//    6   12:invokevirtual   #51  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
					FloatingActionButtonImpl floatingactionbuttonimpl = FloatingActionButtonImpl.this;
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field FloatingActionButtonImpl this$0>
				//    9   19:astore_2        
					floatingactionbuttonimpl.animState = 1;
				//   10   20:aload_2         
				//   11   21:iconst_1        
				//   12   22:putfield        #37  <Field int FloatingActionButtonImpl.animState>
					floatingactionbuttonimpl.currentAnimator = animator;
				//   13   25:aload_2         
				//   14   26:aload_1         
				//   15   27:putfield        #41  <Field Animator FloatingActionButtonImpl.currentAnimator>
					cancelled = false;
				//   16   30:aload_0         
				//   17   31:iconst_0        
				//   18   32:putfield        #32  <Field boolean cancelled>
				//   19   35:return          
				}

				private boolean cancelled;
				final FloatingActionButtonImpl this$0;
				final boolean val$fromUser;
				final InternalVisibilityChangedListener val$listener;

			
			{
				this$0 = FloatingActionButtonImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FloatingActionButtonImpl this$0>
				fromUser = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field boolean val$fromUser>
				listener = internalvisibilitychangedlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
			}
)));
	//   30   62:aload           4
	//   31   64:new             #6   <Class FloatingActionButtonImpl$1>
	//   32   67:dup             
	//   33   68:aload_0         
	//   34   69:iload_2         
	//   35   70:aload_1         
	//   36   71:invokespecial   #484 <Method void FloatingActionButtonImpl$1(FloatingActionButtonImpl, boolean, FloatingActionButtonImpl$InternalVisibilityChangedListener)>
	//   37   74:invokevirtual   #485 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
			listener = ((InternalVisibilityChangedListener) (hideListeners));
	//   38   77:aload_0         
	//   39   78:getfield        #385 <Field ArrayList hideListeners>
	//   40   81:astore_1        
			if(listener != null)
	//*  41   82:aload_1         
	//*  42   83:ifnull          117
				for(listener = ((InternalVisibilityChangedListener) (((ArrayList) (listener)).iterator())); ((Iterator) (listener)).hasNext(); ((AnimatorSet) (obj)).addListener((android.animation.Animator.AnimatorListener)((Iterator) (listener)).next()));
	//   43   86:aload_1         
	//   44   87:invokevirtual   #489 <Method Iterator ArrayList.iterator()>
	//   45   90:astore_1        
	//   46   91:aload_1         
	//   47   92:invokeinterface #494 <Method boolean Iterator.hasNext()>
	//   48   97:ifeq            117
	//   49  100:aload           4
	//   50  102:aload_1         
	//   51  103:invokeinterface #498 <Method Object Iterator.next()>
	//   52  108:checkcast       #500 <Class android.animation.Animator$AnimatorListener>
	//   53  111:invokevirtual   #485 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
	//*  54  114:goto            91
			((AnimatorSet) (obj)).start();
	//   55  117:aload           4
	//   56  119:invokevirtual   #503 <Method void AnimatorSet.start()>
			return;
	//   57  122:return          
		}
		obj = ((Object) (view));
	//   58  123:aload_0         
	//   59  124:getfield        #153 <Field VisibilityAwareImageButton view>
	//   60  127:astore          4
		byte byte0;
		if(fromUser)
	//*  61  129:iload_2         
	//*  62  130:ifeq            139
			byte0 = 8;
	//   63  133:bipush          8
	//   64  135:istore_3        
		else
	//*  65  136:goto            141
			byte0 = 4;
	//   66  139:iconst_4        
	//   67  140:istore_3        
		((VisibilityAwareImageButton) (obj)).internalSetVisibility(((int) (byte0)), fromUser);
	//   68  141:aload           4
	//   69  143:iload_3         
	//   70  144:iload_2         
	//   71  145:invokevirtual   #507 <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
		if(listener != null)
	//*  72  148:aload_1         
	//*  73  149:ifnull          158
			listener.onHidden();
	//   74  152:aload_1         
	//   75  153:invokeinterface #510 <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
	//   76  158:return          
	}

	boolean isOrWillBeHidden()
	{
		int i = view.getVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field VisibilityAwareImageButton view>
	//    2    4:invokevirtual   #513 <Method int VisibilityAwareImageButton.getVisibility()>
	//    3    7:istore_1        
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            28
		{
			if(animState == 1)
	//*  10   16:aload_0         
	//*  11   17:getfield        #132 <Field int animState>
	//*  12   20:iconst_1        
	//*  13   21:icmpne          26
				flag = true;
	//   14   24:iconst_1        
	//   15   25:istore_2        
			return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
		}
		flag = flag1;
	//   18   28:iload_3         
	//   19   29:istore_2        
		if(animState != 2)
	//*  20   30:aload_0         
	//*  21   31:getfield        #132 <Field int animState>
	//*  22   34:iconst_2        
	//*  23   35:icmpeq          40
			flag = true;
	//   24   38:iconst_1        
	//   25   39:istore_2        
		return flag;
	//   26   40:iload_2         
	//   27   41:ireturn         
	}

	boolean isOrWillBeShown()
	{
		int i = view.getVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field VisibilityAwareImageButton view>
	//    2    4:invokevirtual   #513 <Method int VisibilityAwareImageButton.getVisibility()>
	//    3    7:istore_1        
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		if(i != 0)
	//*   8   12:iload_1         
	//*   9   13:ifeq            28
		{
			if(animState == 2)
	//*  10   16:aload_0         
	//*  11   17:getfield        #132 <Field int animState>
	//*  12   20:iconst_2        
	//*  13   21:icmpne          26
				flag = true;
	//   14   24:iconst_1        
	//   15   25:istore_2        
			return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
		}
		flag = flag1;
	//   18   28:iload_3         
	//   19   29:istore_2        
		if(animState != 1)
	//*  20   30:aload_0         
	//*  21   31:getfield        #132 <Field int animState>
	//*  22   34:iconst_1        
	//*  23   35:icmpeq          40
			flag = true;
	//   24   38:iconst_1        
	//   25   39:istore_2        
		return flag;
	//   26   40:iload_2         
	//   27   41:ireturn         
	}

	void jumpDrawableToCurrentState()
	{
		stateListAnimator.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field StateListAnimator stateListAnimator>
	//    2    4:invokevirtual   #518 <Method void StateListAnimator.jumpToCurrentState()>
	//    3    7:return          
	}

	CircularBorderDrawable newCircularDrawable()
	{
		return new CircularBorderDrawable();
	//    0    0:new             #381 <Class CircularBorderDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #519 <Method void CircularBorderDrawable()>
	//    3    7:areturn         
	}

	GradientDrawable newGradientDrawableForShape()
	{
		return new GradientDrawable();
	//    0    0:new             #433 <Class GradientDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #520 <Method void GradientDrawable()>
	//    3    7:areturn         
	}

	void onAttachedToWindow()
	{
		if(requirePreDrawListener())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #524 <Method boolean requirePreDrawListener()>
	//*   2    4:ifeq            25
		{
			ensurePreDrawListener();
	//    3    7:aload_0         
	//    4    8:invokespecial   #526 <Method void ensurePreDrawListener()>
			view.getViewTreeObserver().addOnPreDrawListener(preDrawListener);
	//    5   11:aload_0         
	//    6   12:getfield        #153 <Field VisibilityAwareImageButton view>
	//    7   15:invokevirtual   #530 <Method ViewTreeObserver VisibilityAwareImageButton.getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
	//   10   22:invokevirtual   #536 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
	//   11   25:return          
	}

	void onCompatShadowChanged()
	{
	//    0    0:return          
	}

	void onDetachedFromWindow()
	{
		if(preDrawListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
	//*   2    4:ifnull          26
		{
			view.getViewTreeObserver().removeOnPreDrawListener(preDrawListener);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field VisibilityAwareImageButton view>
	//    5   11:invokevirtual   #530 <Method ViewTreeObserver VisibilityAwareImageButton.getViewTreeObserver()>
	//    6   14:aload_0         
	//    7   15:getfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
	//    8   18:invokevirtual   #541 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			preDrawListener = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #320 <Field android.view.ViewTreeObserver$OnPreDrawListener preDrawListener>
		}
	//   12   26:return          
	}

	void onDrawableStateChanged(int ai[])
	{
		stateListAnimator.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field StateListAnimator stateListAnimator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #546 <Method void StateListAnimator.setState(int[])>
	//    4    8:return          
	}

	void onElevationsChanged(float f, float f1, float f2)
	{
		ShadowDrawableWrapper shadowdrawablewrapper = shadowDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
	//    2    4:astore          4
		if(shadowdrawablewrapper != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          27
		{
			shadowdrawablewrapper.setShadowSize(f, pressedTranslationZ + f);
	//    5   11:aload           4
	//    6   13:fload_1         
	//    7   14:aload_0         
	//    8   15:getfield        #460 <Field float pressedTranslationZ>
	//    9   18:fload_1         
	//   10   19:fadd            
	//   11   20:invokevirtual   #552 <Method void ShadowDrawableWrapper.setShadowSize(float, float)>
			updatePadding();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #555 <Method void updatePadding()>
		}
	//   14   27:return          
	}

	void onPaddingUpdated(Rect rect)
	{
	//    0    0:return          
	}

	void onPreDraw()
	{
		float f = view.getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field VisibilityAwareImageButton view>
	//    2    4:invokevirtual   #180 <Method float VisibilityAwareImageButton.getRotation()>
	//    3    7:fstore_1        
		if(rotation != f)
	//*   4    8:aload_0         
	//*   5    9:getfield        #182 <Field float rotation>
	//*   6   12:fload_1         
	//*   7   13:fcmpl           
	//*   8   14:ifeq            26
		{
			rotation = f;
	//    9   17:aload_0         
	//   10   18:fload_1         
	//   11   19:putfield        #182 <Field float rotation>
			updateFromViewRotation();
	//   12   22:aload_0         
	//   13   23:invokespecial   #559 <Method void updateFromViewRotation()>
		}
	//   14   26:return          
	}

	public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ArrayList arraylist = hideListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #385 <Field ArrayList hideListeners>
	//    2    4:astore_2        
		if(arraylist == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			arraylist.remove(((Object) (animatorlistener)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #563 <Method boolean ArrayList.remove(Object)>
	//    9   15:pop             
			return;
	//   10   16:return          
		}
	}

	void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ArrayList arraylist = showListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field ArrayList showListeners>
	//    2    4:astore_2        
		if(arraylist == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			arraylist.remove(((Object) (animatorlistener)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #563 <Method boolean ArrayList.remove(Object)>
	//    9   15:pop             
			return;
	//   10   16:return          
		}
	}

	boolean requirePreDrawListener()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, ColorStateList colorstatelist1, int i)
	{
		shapeDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #568 <Method GradientDrawable createShapeDrawable()>
	//    3    5:invokestatic    #574 <Method Drawable DrawableCompat.wrap(Drawable)>
	//    4    8:putfield        #576 <Field Drawable shapeDrawable>
		DrawableCompat.setTintList(shapeDrawable, colorstatelist);
	//    5   11:aload_0         
	//    6   12:getfield        #576 <Field Drawable shapeDrawable>
	//    7   15:aload_1         
	//    8   16:invokestatic    #580 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mode != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			DrawableCompat.setTintMode(shapeDrawable, mode);
	//   11   23:aload_0         
	//   12   24:getfield        #576 <Field Drawable shapeDrawable>
	//   13   27:aload_2         
	//   14   28:invokestatic    #584 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		rippleDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:invokevirtual   #568 <Method GradientDrawable createShapeDrawable()>
	//   18   36:invokestatic    #574 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   19   39:putfield        #586 <Field Drawable rippleDrawable>
		DrawableCompat.setTintList(rippleDrawable, RippleUtils.convertToRippleDrawableColor(colorstatelist1));
	//   20   42:aload_0         
	//   21   43:getfield        #586 <Field Drawable rippleDrawable>
	//   22   46:aload_3         
	//   23   47:invokestatic    #592 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//   24   50:invokestatic    #580 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(i > 0)
	//*  25   53:iload           4
	//*  26   55:ifle            98
		{
			borderDrawable = createBorderDrawable(i, colorstatelist);
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:iload           4
	//   30   62:aload_1         
	//   31   63:invokevirtual   #594 <Method CircularBorderDrawable createBorderDrawable(int, ColorStateList)>
	//   32   66:putfield        #379 <Field CircularBorderDrawable borderDrawable>
			colorstatelist = ((ColorStateList) (new Drawable[3]));
	//   33   69:iconst_3        
	//   34   70:anewarray       Drawable[]
	//   35   73:astore_1        
			colorstatelist[0] = ((/*<invalid signature>*/java.lang.Object) (borderDrawable));
	//   36   74:aload_1         
	//   37   75:iconst_0        
	//   38   76:aload_0         
	//   39   77:getfield        #379 <Field CircularBorderDrawable borderDrawable>
	//   40   80:aastore         
			colorstatelist[1] = ((/*<invalid signature>*/java.lang.Object) (shapeDrawable));
	//   41   81:aload_1         
	//   42   82:iconst_1        
	//   43   83:aload_0         
	//   44   84:getfield        #576 <Field Drawable shapeDrawable>
	//   45   87:aastore         
			colorstatelist[2] = ((/*<invalid signature>*/java.lang.Object) (rippleDrawable));
	//   46   88:aload_1         
	//   47   89:iconst_2        
	//   48   90:aload_0         
	//   49   91:getfield        #586 <Field Drawable rippleDrawable>
	//   50   94:aastore         
		} else
	//*  51   95:goto            122
		{
			borderDrawable = null;
	//   52   98:aload_0         
	//   53   99:aconst_null     
	//   54  100:putfield        #379 <Field CircularBorderDrawable borderDrawable>
			colorstatelist = ((ColorStateList) (new Drawable[2]));
	//   55  103:iconst_2        
	//   56  104:anewarray       Drawable[]
	//   57  107:astore_1        
			colorstatelist[0] = ((/*<invalid signature>*/java.lang.Object) (shapeDrawable));
	//   58  108:aload_1         
	//   59  109:iconst_0        
	//   60  110:aload_0         
	//   61  111:getfield        #576 <Field Drawable shapeDrawable>
	//   62  114:aastore         
			colorstatelist[1] = ((/*<invalid signature>*/java.lang.Object) (rippleDrawable));
	//   63  115:aload_1         
	//   64  116:iconst_1        
	//   65  117:aload_0         
	//   66  118:getfield        #586 <Field Drawable rippleDrawable>
	//   67  121:aastore         
		}
		contentBackground = ((Drawable) (new LayerDrawable(((Drawable []) (colorstatelist)))));
	//   68  122:aload_0         
	//   69  123:new             #596 <Class LayerDrawable>
	//   70  126:dup             
	//   71  127:aload_1         
	//   72  128:invokespecial   #599 <Method void LayerDrawable(Drawable[])>
	//   73  131:putfield        #443 <Field Drawable contentBackground>
		colorstatelist = ((ColorStateList) (view.getContext()));
	//   74  134:aload_0         
	//   75  135:getfield        #153 <Field VisibilityAwareImageButton view>
	//   76  138:invokevirtual   #329 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//   77  141:astore_1        
		mode = ((android.graphics.PorterDuff.Mode) (contentBackground));
	//   78  142:aload_0         
	//   79  143:getfield        #443 <Field Drawable contentBackground>
	//   80  146:astore_2        
		float f = shadowViewDelegate.getRadius();
	//   81  147:aload_0         
	//   82  148:getfield        #155 <Field ShadowViewDelegate shadowViewDelegate>
	//   83  151:invokeinterface #604 <Method float ShadowViewDelegate.getRadius()>
	//   84  156:fstore          5
		float f1 = elevation;
	//   85  158:aload_0         
	//   86  159:getfield        #446 <Field float elevation>
	//   87  162:fstore          6
		shadowDrawable = new ShadowDrawableWrapper(((android.content.Context) (colorstatelist)), ((Drawable) (mode)), f, f1, f1 + pressedTranslationZ);
	//   88  164:aload_0         
	//   89  165:new             #373 <Class ShadowDrawableWrapper>
	//   90  168:dup             
	//   91  169:aload_1         
	//   92  170:aload_2         
	//   93  171:fload           5
	//   94  173:fload           6
	//   95  175:fload           6
	//   96  177:aload_0         
	//   97  178:getfield        #460 <Field float pressedTranslationZ>
	//   98  181:fadd            
	//   99  182:invokespecial   #607 <Method void ShadowDrawableWrapper(android.content.Context, Drawable, float, float, float)>
	//  100  185:putfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
		shadowDrawable.setAddPaddingForCorners(false);
	//  101  188:aload_0         
	//  102  189:getfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
	//  103  192:iconst_0        
	//  104  193:invokevirtual   #611 <Method void ShadowDrawableWrapper.setAddPaddingForCorners(boolean)>
		shadowViewDelegate.setBackgroundDrawable(((Drawable) (shadowDrawable)));
	//  105  196:aload_0         
	//  106  197:getfield        #155 <Field ShadowViewDelegate shadowViewDelegate>
	//  107  200:aload_0         
	//  108  201:getfield        #371 <Field ShadowDrawableWrapper shadowDrawable>
	//  109  204:invokeinterface #614 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
	//  110  209:return          
	}

	void setBackgroundTintList(ColorStateList colorstatelist)
	{
		Object obj = ((Object) (shapeDrawable));
	//    0    0:aload_0         
	//    1    1:getfield        #576 <Field Drawable shapeDrawable>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			DrawableCompat.setTintList(((Drawable) (obj)), colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #580 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		obj = ((Object) (borderDrawable));
	//    8   14:aload_0         
	//    9   15:getfield        #379 <Field CircularBorderDrawable borderDrawable>
	//   10   18:astore_2        
		if(obj != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          28
			((CircularBorderDrawable) (obj)).setBorderTint(colorstatelist);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #426 <Method void CircularBorderDrawable.setBorderTint(ColorStateList)>
	//   16   28:return          
	}

	void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		Drawable drawable = shapeDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #576 <Field Drawable shapeDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			DrawableCompat.setTintMode(drawable, mode);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #584 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
	//    8   14:return          
	}

	final void setElevation(float f)
	{
		if(elevation != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #446 <Field float elevation>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            30
		{
			elevation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #446 <Field float elevation>
			onElevationsChanged(elevation, hoveredFocusedTranslationZ, pressedTranslationZ);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #446 <Field float elevation>
	//   11   19:aload_0         
	//   12   20:getfield        #452 <Field float hoveredFocusedTranslationZ>
	//   13   23:aload_0         
	//   14   24:getfield        #460 <Field float pressedTranslationZ>
	//   15   27:invokevirtual   #620 <Method void onElevationsChanged(float, float, float)>
		}
	//   16   30:return          
	}

	final void setHideMotionSpec(MotionSpec motionspec)
	{
		hideMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #449 <Field MotionSpec hideMotionSpec>
	//    3    5:return          
	}

	final void setHoveredFocusedTranslationZ(float f)
	{
		if(hoveredFocusedTranslationZ != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #452 <Field float hoveredFocusedTranslationZ>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            30
		{
			hoveredFocusedTranslationZ = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #452 <Field float hoveredFocusedTranslationZ>
			onElevationsChanged(elevation, hoveredFocusedTranslationZ, pressedTranslationZ);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #446 <Field float elevation>
	//   11   19:aload_0         
	//   12   20:getfield        #452 <Field float hoveredFocusedTranslationZ>
	//   13   23:aload_0         
	//   14   24:getfield        #460 <Field float pressedTranslationZ>
	//   15   27:invokevirtual   #620 <Method void onElevationsChanged(float, float, float)>
		}
	//   16   30:return          
	}

	final void setImageMatrixScale(float f)
	{
		imageMatrixScale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #134 <Field float imageMatrixScale>
		Matrix matrix = tmpMatrix;
	//    3    5:aload_0         
	//    4    6:getfield        #151 <Field Matrix tmpMatrix>
	//    5    9:astore_2        
		calculateImageMatrixFromScale(f, matrix);
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #268 <Method void calculateImageMatrixFromScale(float, Matrix)>
		view.setImageMatrix(matrix);
	//   10   16:aload_0         
	//   11   17:getfield        #153 <Field VisibilityAwareImageButton view>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #627 <Method void VisibilityAwareImageButton.setImageMatrix(Matrix)>
	//   14   24:return          
	}

	final void setMaxImageSize(int i)
	{
		if(maxImageSize != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field int maxImageSize>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			maxImageSize = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #193 <Field int maxImageSize>
			updateImageMatrixScale();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #631 <Method void updateImageMatrixScale()>
		}
	//    9   17:return          
	}

	final void setPressedTranslationZ(float f)
	{
		if(pressedTranslationZ != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #460 <Field float pressedTranslationZ>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            30
		{
			pressedTranslationZ = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #460 <Field float pressedTranslationZ>
			onElevationsChanged(elevation, hoveredFocusedTranslationZ, pressedTranslationZ);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #446 <Field float elevation>
	//   11   19:aload_0         
	//   12   20:getfield        #452 <Field float hoveredFocusedTranslationZ>
	//   13   23:aload_0         
	//   14   24:getfield        #460 <Field float pressedTranslationZ>
	//   15   27:invokevirtual   #620 <Method void onElevationsChanged(float, float, float)>
		}
	//   16   30:return          
	}

	void setRippleColor(ColorStateList colorstatelist)
	{
		Drawable drawable = rippleDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #586 <Field Drawable rippleDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			DrawableCompat.setTintList(drawable, RippleUtils.convertToRippleDrawableColor(colorstatelist));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #592 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//    8   14:invokestatic    #580 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
	//    9   17:return          
	}

	final void setShowMotionSpec(MotionSpec motionspec)
	{
		showMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #463 <Field MotionSpec showMotionSpec>
	//    3    5:return          
	}

	void show(final InternalVisibilityChangedListener listener, final boolean fromUser)
	{
		if(isOrWillBeShown())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #637 <Method boolean isOrWillBeShown()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		Animator animator = currentAnimator;
	//    4    8:aload_0         
	//    5    9:getfield        #470 <Field Animator currentAnimator>
	//    6   12:astore_3        
		if(animator != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          21
			animator.cancel();
	//    9   17:aload_3         
	//   10   18:invokevirtual   #475 <Method void Animator.cancel()>
		if(shouldAnimateVisibilityChange())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #477 <Method boolean shouldAnimateVisibilityChange()>
	//*  13   25:ifeq            151
		{
			if(view.getVisibility() != 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #153 <Field VisibilityAwareImageButton view>
	//*  16   32:invokevirtual   #513 <Method int VisibilityAwareImageButton.getVisibility()>
	//*  17   35:ifeq            67
			{
				view.setAlpha(0.0F);
	//   18   38:aload_0         
	//   19   39:getfield        #153 <Field VisibilityAwareImageButton view>
	//   20   42:fconst_0        
	//   21   43:invokevirtual   #640 <Method void VisibilityAwareImageButton.setAlpha(float)>
				view.setScaleY(0.0F);
	//   22   46:aload_0         
	//   23   47:getfield        #153 <Field VisibilityAwareImageButton view>
	//   24   50:fconst_0        
	//   25   51:invokevirtual   #643 <Method void VisibilityAwareImageButton.setScaleY(float)>
				view.setScaleX(0.0F);
	//   26   54:aload_0         
	//   27   55:getfield        #153 <Field VisibilityAwareImageButton view>
	//   28   58:fconst_0        
	//   29   59:invokevirtual   #646 <Method void VisibilityAwareImageButton.setScaleX(float)>
				setImageMatrixScale(0.0F);
	//   30   62:aload_0         
	//   31   63:fconst_0        
	//   32   64:invokevirtual   #648 <Method void setImageMatrixScale(float)>
			}
			Object obj = ((Object) (showMotionSpec));
	//   33   67:aload_0         
	//   34   68:getfield        #463 <Field MotionSpec showMotionSpec>
	//   35   71:astore_3        
			if(obj == null)
	//*  36   72:aload_3         
	//*  37   73:ifnull          79
	//*  38   76:goto            84
				obj = ((Object) (getDefaultShowMotionSpec()));
	//   39   79:aload_0         
	//   40   80:invokespecial   #650 <Method MotionSpec getDefaultShowMotionSpec()>
	//   41   83:astore_3        
			obj = ((Object) (createAnimator(((MotionSpec) (obj)), 1.0F, 1.0F, 1.0F)));
	//   42   84:aload_0         
	//   43   85:aload_3         
	//   44   86:fconst_1        
	//   45   87:fconst_1        
	//   46   88:fconst_1        
	//   47   89:invokespecial   #481 <Method AnimatorSet createAnimator(MotionSpec, float, float, float)>
	//   48   92:astore_3        
			((AnimatorSet) (obj)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator1)
				{
					animator1 = ((Animator) (FloatingActionButtonImpl.this));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
				//    2    4:astore_1        
					animator1.animState = 0;
				//    3    5:aload_1         
				//    4    6:iconst_0        
				//    5    7:putfield        #33  <Field int FloatingActionButtonImpl.animState>
					animator1.currentAnimator = null;
				//    6   10:aload_1         
				//    7   11:aconst_null     
				//    8   12:putfield        #37  <Field Animator FloatingActionButtonImpl.currentAnimator>
					animator1 = ((Animator) (listener));
				//    9   15:aload_0         
				//   10   16:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
				//   11   19:astore_1        
					if(animator1 != null)
				//*  12   20:aload_1         
				//*  13   21:ifnull          30
						((InternalVisibilityChangedListener) (animator1)).onShown();
				//   14   24:aload_1         
				//   15   25:invokeinterface #42  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
				//   16   30:return          
				}

				public void onAnimationStart(Animator animator1)
				{
					view.internalSetVisibility(0, fromUser);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
				//    2    4:getfield        #47  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
				//    3    7:iconst_0        
				//    4    8:aload_0         
				//    5    9:getfield        #21  <Field boolean val$fromUser>
				//    6   12:invokevirtual   #53  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
					FloatingActionButtonImpl floatingactionbuttonimpl = FloatingActionButtonImpl.this;
				//    7   15:aload_0         
				//    8   16:getfield        #19  <Field FloatingActionButtonImpl this$0>
				//    9   19:astore_2        
					floatingactionbuttonimpl.animState = 2;
				//   10   20:aload_2         
				//   11   21:iconst_2        
				//   12   22:putfield        #33  <Field int FloatingActionButtonImpl.animState>
					floatingactionbuttonimpl.currentAnimator = animator1;
				//   13   25:aload_2         
				//   14   26:aload_1         
				//   15   27:putfield        #37  <Field Animator FloatingActionButtonImpl.currentAnimator>
				//   16   30:return          
				}

				final FloatingActionButtonImpl this$0;
				final boolean val$fromUser;
				final InternalVisibilityChangedListener val$listener;

			
			{
				this$0 = FloatingActionButtonImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FloatingActionButtonImpl this$0>
				fromUser = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$fromUser>
				listener = internalvisibilitychangedlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
			}
)));
	//   49   93:aload_3         
	//   50   94:new             #8   <Class FloatingActionButtonImpl$2>
	//   51   97:dup             
	//   52   98:aload_0         
	//   53   99:iload_2         
	//   54  100:aload_1         
	//   55  101:invokespecial   #651 <Method void FloatingActionButtonImpl$2(FloatingActionButtonImpl, boolean, FloatingActionButtonImpl$InternalVisibilityChangedListener)>
	//   56  104:invokevirtual   #485 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
			listener = ((InternalVisibilityChangedListener) (showListeners));
	//   57  107:aload_0         
	//   58  108:getfield        #389 <Field ArrayList showListeners>
	//   59  111:astore_1        
			if(listener != null)
	//*  60  112:aload_1         
	//*  61  113:ifnull          146
				for(listener = ((InternalVisibilityChangedListener) (((ArrayList) (listener)).iterator())); ((Iterator) (listener)).hasNext(); ((AnimatorSet) (obj)).addListener((android.animation.Animator.AnimatorListener)((Iterator) (listener)).next()));
	//   62  116:aload_1         
	//   63  117:invokevirtual   #489 <Method Iterator ArrayList.iterator()>
	//   64  120:astore_1        
	//   65  121:aload_1         
	//   66  122:invokeinterface #494 <Method boolean Iterator.hasNext()>
	//   67  127:ifeq            146
	//   68  130:aload_3         
	//   69  131:aload_1         
	//   70  132:invokeinterface #498 <Method Object Iterator.next()>
	//   71  137:checkcast       #500 <Class android.animation.Animator$AnimatorListener>
	//   72  140:invokevirtual   #485 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
	//*  73  143:goto            121
			((AnimatorSet) (obj)).start();
	//   74  146:aload_3         
	//   75  147:invokevirtual   #503 <Method void AnimatorSet.start()>
			return;
	//   76  150:return          
		}
		view.internalSetVisibility(0, fromUser);
	//   77  151:aload_0         
	//   78  152:getfield        #153 <Field VisibilityAwareImageButton view>
	//   79  155:iconst_0        
	//   80  156:iload_2         
	//   81  157:invokevirtual   #507 <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
		view.setAlpha(1.0F);
	//   82  160:aload_0         
	//   83  161:getfield        #153 <Field VisibilityAwareImageButton view>
	//   84  164:fconst_1        
	//   85  165:invokevirtual   #640 <Method void VisibilityAwareImageButton.setAlpha(float)>
		view.setScaleY(1.0F);
	//   86  168:aload_0         
	//   87  169:getfield        #153 <Field VisibilityAwareImageButton view>
	//   88  172:fconst_1        
	//   89  173:invokevirtual   #643 <Method void VisibilityAwareImageButton.setScaleY(float)>
		view.setScaleX(1.0F);
	//   90  176:aload_0         
	//   91  177:getfield        #153 <Field VisibilityAwareImageButton view>
	//   92  180:fconst_1        
	//   93  181:invokevirtual   #646 <Method void VisibilityAwareImageButton.setScaleX(float)>
		setImageMatrixScale(1.0F);
	//   94  184:aload_0         
	//   95  185:fconst_1        
	//   96  186:invokevirtual   #648 <Method void setImageMatrixScale(float)>
		if(listener != null)
	//*  97  189:aload_1         
	//*  98  190:ifnull          199
			listener.onShown();
	//   99  193:aload_1         
	//  100  194:invokeinterface #654 <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
	//  101  199:return          
	}

	final void updateImageMatrixScale()
	{
		setImageMatrixScale(imageMatrixScale);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #134 <Field float imageMatrixScale>
	//    3    5:invokevirtual   #648 <Method void setImageMatrixScale(float)>
	//    4    8:return          
	}

	final void updatePadding()
	{
		Rect rect = tmpRect;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Rect tmpRect>
	//    2    4:astore_1        
		getPadding(rect);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #656 <Method void getPadding(Rect)>
		onPaddingUpdated(rect);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #658 <Method void onPaddingUpdated(Rect)>
		shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
	//    9   15:aload_0         
	//   10   16:getfield        #155 <Field ShadowViewDelegate shadowViewDelegate>
	//   11   19:aload_1         
	//   12   20:getfield        #661 <Field int Rect.left>
	//   13   23:aload_1         
	//   14   24:getfield        #664 <Field int Rect.top>
	//   15   27:aload_1         
	//   16   28:getfield        #667 <Field int Rect.right>
	//   17   31:aload_1         
	//   18   32:getfield        #670 <Field int Rect.bottom>
	//   19   35:invokeinterface #673 <Method void ShadowViewDelegate.setShadowPadding(int, int, int, int)>
	//   20   40:return          
	}

	static final int ANIM_STATE_HIDING = 1;
	static final int ANIM_STATE_NONE = 0;
	static final int ANIM_STATE_SHOWING = 2;
	static final long ELEVATION_ANIM_DELAY = 100L;
	static final long ELEVATION_ANIM_DURATION = 100L;
	static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR;
	static final int EMPTY_STATE_SET[] = new int[0];
	static final int ENABLED_STATE_SET[] = {
		0x101009e
	};
	static final int FOCUSED_ENABLED_STATE_SET[] = {
		0x101009c, 0x101009e
	};
	private static final float HIDE_ICON_SCALE = 0F;
	private static final float HIDE_OPACITY = 0F;
	private static final float HIDE_SCALE = 0F;
	static final int HOVERED_ENABLED_STATE_SET[] = {
		0x1010367, 0x101009e
	};
	static final int HOVERED_FOCUSED_ENABLED_STATE_SET[] = {
		0x1010367, 0x101009c, 0x101009e
	};
	static final int PRESSED_ENABLED_STATE_SET[] = {
		0x10100a7, 0x101009e
	};
	private static final float SHOW_ICON_SCALE = 1F;
	private static final float SHOW_OPACITY = 1F;
	private static final float SHOW_SCALE = 1F;
	int animState;
	CircularBorderDrawable borderDrawable;
	Drawable contentBackground;
	Animator currentAnimator;
	private MotionSpec defaultHideMotionSpec;
	private MotionSpec defaultShowMotionSpec;
	float elevation;
	private ArrayList hideListeners;
	MotionSpec hideMotionSpec;
	float hoveredFocusedTranslationZ;
	float imageMatrixScale;
	int maxImageSize;
	private android.view.ViewTreeObserver.OnPreDrawListener preDrawListener;
	float pressedTranslationZ;
	Drawable rippleDrawable;
	private float rotation;
	ShadowDrawableWrapper shadowDrawable;
	final ShadowViewDelegate shadowViewDelegate;
	Drawable shapeDrawable;
	private ArrayList showListeners;
	MotionSpec showMotionSpec;
	private final StateListAnimator stateListAnimator = new StateListAnimator();
	private final Matrix tmpMatrix = new Matrix();
	private final Rect tmpRect = new Rect();
	private final RectF tmpRectF1 = new RectF();
	private final RectF tmpRectF2 = new RectF();
	final VisibilityAwareImageButton view;

	static 
	{
		ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
	//    0    0:getstatic       #107 <Field TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//    1    3:putstatic       #109 <Field TimeInterpolator ELEVATION_ANIM_INTERPOLATOR>
	//    2    6:iconst_2        
	//    3    7:newarray        int[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #110 <Int 0x10100a7>
	//    7   13:iastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #111 <Int 0x101009e>
	//   11   18:iastore         
	//   12   19:putstatic       #113 <Field int[] PRESSED_ENABLED_STATE_SET>
	//   13   22:iconst_3        
	//   14   23:newarray        int[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:ldc1            #114 <Int 0x1010367>
	//   18   29:iastore         
	//   19   30:dup             
	//   20   31:iconst_1        
	//   21   32:ldc1            #115 <Int 0x101009c>
	//   22   34:iastore         
	//   23   35:dup             
	//   24   36:iconst_2        
	//   25   37:ldc1            #111 <Int 0x101009e>
	//   26   39:iastore         
	//   27   40:putstatic       #117 <Field int[] HOVERED_FOCUSED_ENABLED_STATE_SET>
	//   28   43:iconst_2        
	//   29   44:newarray        int[]
	//   30   46:dup             
	//   31   47:iconst_0        
	//   32   48:ldc1            #115 <Int 0x101009c>
	//   33   50:iastore         
	//   34   51:dup             
	//   35   52:iconst_1        
	//   36   53:ldc1            #111 <Int 0x101009e>
	//   37   55:iastore         
	//   38   56:putstatic       #119 <Field int[] FOCUSED_ENABLED_STATE_SET>
	//   39   59:iconst_2        
	//   40   60:newarray        int[]
	//   41   62:dup             
	//   42   63:iconst_0        
	//   43   64:ldc1            #114 <Int 0x1010367>
	//   44   66:iastore         
	//   45   67:dup             
	//   46   68:iconst_1        
	//   47   69:ldc1            #111 <Int 0x101009e>
	//   48   71:iastore         
	//   49   72:putstatic       #121 <Field int[] HOVERED_ENABLED_STATE_SET>
	//   50   75:iconst_1        
	//   51   76:newarray        int[]
	//   52   78:dup             
	//   53   79:iconst_0        
	//   54   80:ldc1            #111 <Int 0x101009e>
	//   55   82:iastore         
	//   56   83:putstatic       #123 <Field int[] ENABLED_STATE_SET>
	//   57   86:iconst_0        
	//   58   87:newarray        int[]
	//   59   89:putstatic       #125 <Field int[] EMPTY_STATE_SET>
	//*  60   92:return          
	}
}
