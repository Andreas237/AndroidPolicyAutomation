// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//			AnimationUtils, StateListAnimator, VisibilityAwareImageButton, ShadowDrawableWrapper, 
//			CircularBorderDrawable, ShadowViewDelegate

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

	private class ElevateToTranslationZAnimation extends ShadowAnimatorImpl
	{

		protected float getTargetShadowSize()
		{
			return mElevation + mPressedTranslationZ;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.mElevation>
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    5   11:getfield        #26  <Field float FloatingActionButtonImpl.mPressedTranslationZ>
		//    6   14:fadd            
		//    7   15:freturn         
		}

		final FloatingActionButtonImpl this$0;

		ElevateToTranslationZAnimation()
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
			return mElevation;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.mElevation>
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
			mShadowDrawable.setShadowSize(mShadowSizeEnd);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//    2    4:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
		//    3    7:aload_0         
		//    4    8:getfield        #37  <Field float mShadowSizeEnd>
		//    5   11:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
			mValidValues = false;
		//    6   14:aload_0         
		//    7   15:iconst_0        
		//    8   16:putfield        #45  <Field boolean mValidValues>
		//    9   19:return          
		}

		public void onAnimationUpdate(ValueAnimator valueanimator)
		{
			if(!mValidValues)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field boolean mValidValues>
		//*   2    4:ifne            34
			{
				mShadowSizeStart = mShadowDrawable.getShadowSize();
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//    6   12:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
		//    7   15:invokevirtual   #50  <Method float ShadowDrawableWrapper.getShadowSize()>
		//    8   18:putfield        #52  <Field float mShadowSizeStart>
				mShadowSizeEnd = getTargetShadowSize();
		//    9   21:aload_0         
		//   10   22:aload_0         
		//   11   23:invokevirtual   #54  <Method float getTargetShadowSize()>
		//   12   26:putfield        #37  <Field float mShadowSizeEnd>
				mValidValues = true;
		//   13   29:aload_0         
		//   14   30:iconst_1        
		//   15   31:putfield        #45  <Field boolean mValidValues>
			}
			mShadowDrawable.setShadowSize(mShadowSizeStart + (mShadowSizeEnd - mShadowSizeStart) * valueanimator.getAnimatedFraction());
		//   16   34:aload_0         
		//   17   35:getfield        #20  <Field FloatingActionButtonImpl this$0>
		//   18   38:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
		//   19   41:aload_0         
		//   20   42:getfield        #52  <Field float mShadowSizeStart>
		//   21   45:aload_0         
		//   22   46:getfield        #37  <Field float mShadowSizeEnd>
		//   23   49:aload_0         
		//   24   50:getfield        #52  <Field float mShadowSizeStart>
		//   25   53:fsub            
		//   26   54:aload_1         
		//   27   55:invokevirtual   #59  <Method float ValueAnimator.getAnimatedFraction()>
		//   28   58:fmul            
		//   29   59:fadd            
		//   30   60:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
		//   31   63:return          
		}

		private float mShadowSizeEnd;
		private float mShadowSizeStart;
		private boolean mValidValues;
		final FloatingActionButtonImpl this$0;

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
	//    1    1:invokespecial   #97  <Method void Object()>
		mAnimState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #99  <Field int mAnimState>
	//    5    9:aload_0         
	//    6   10:new             #101 <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #102 <Method void Rect()>
	//    9   17:putfield        #104 <Field Rect mTmpRect>
		mView = visibilityawareimagebutton;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #106 <Field VisibilityAwareImageButton mView>
		mShadowViewDelegate = shadowviewdelegate;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #108 <Field ShadowViewDelegate mShadowViewDelegate>
	//   16   30:aload_0         
	//   17   31:new             #110 <Class StateListAnimator>
	//   18   34:dup             
	//   19   35:invokespecial   #111 <Method void StateListAnimator()>
	//   20   38:putfield        #113 <Field StateListAnimator mStateListAnimator>
		mStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createAnimator(((ShadowAnimatorImpl) (new ElevateToTranslationZAnimation()))));
	//   21   41:aload_0         
	//   22   42:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//   23   45:getstatic       #85  <Field int[] PRESSED_ENABLED_STATE_SET>
	//   24   48:aload_0         
	//   25   49:new             #15  <Class FloatingActionButtonImpl$ElevateToTranslationZAnimation>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokespecial   #116 <Method void FloatingActionButtonImpl$ElevateToTranslationZAnimation(FloatingActionButtonImpl)>
	//   29   57:invokespecial   #120 <Method ValueAnimator createAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   30   60:invokevirtual   #124 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		mStateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createAnimator(((ShadowAnimatorImpl) (new ElevateToTranslationZAnimation()))));
	//   31   63:aload_0         
	//   32   64:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//   33   67:getstatic       #88  <Field int[] FOCUSED_ENABLED_STATE_SET>
	//   34   70:aload_0         
	//   35   71:new             #15  <Class FloatingActionButtonImpl$ElevateToTranslationZAnimation>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #116 <Method void FloatingActionButtonImpl$ElevateToTranslationZAnimation(FloatingActionButtonImpl)>
	//   39   79:invokespecial   #120 <Method ValueAnimator createAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   40   82:invokevirtual   #124 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		mStateListAnimator.addState(ENABLED_STATE_SET, createAnimator(((ShadowAnimatorImpl) (new ResetElevationAnimation()))));
	//   41   85:aload_0         
	//   42   86:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//   43   89:getstatic       #90  <Field int[] ENABLED_STATE_SET>
	//   44   92:aload_0         
	//   45   93:new             #21  <Class FloatingActionButtonImpl$ResetElevationAnimation>
	//   46   96:dup             
	//   47   97:aload_0         
	//   48   98:invokespecial   #125 <Method void FloatingActionButtonImpl$ResetElevationAnimation(FloatingActionButtonImpl)>
	//   49  101:invokespecial   #120 <Method ValueAnimator createAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   50  104:invokevirtual   #124 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		mStateListAnimator.addState(EMPTY_STATE_SET, createAnimator(((ShadowAnimatorImpl) (new DisabledElevationAnimation()))));
	//   51  107:aload_0         
	//   52  108:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//   53  111:getstatic       #92  <Field int[] EMPTY_STATE_SET>
	//   54  114:aload_0         
	//   55  115:new             #12  <Class FloatingActionButtonImpl$DisabledElevationAnimation>
	//   56  118:dup             
	//   57  119:aload_0         
	//   58  120:invokespecial   #126 <Method void FloatingActionButtonImpl$DisabledElevationAnimation(FloatingActionButtonImpl)>
	//   59  123:invokespecial   #120 <Method ValueAnimator createAnimator(FloatingActionButtonImpl$ShadowAnimatorImpl)>
	//   60  126:invokevirtual   #124 <Method void StateListAnimator.addState(int[], ValueAnimator)>
		mRotation = mView.getRotation();
	//   61  129:aload_0         
	//   62  130:aload_0         
	//   63  131:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   64  134:invokevirtual   #132 <Method float VisibilityAwareImageButton.getRotation()>
	//   65  137:putfield        #134 <Field float mRotation>
	//   66  140:return          
	}

	private ValueAnimator createAnimator(ShadowAnimatorImpl shadowanimatorimpl)
	{
		ValueAnimator valueanimator = new ValueAnimator();
	//    0    0:new             #137 <Class ValueAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ValueAnimator()>
	//    3    7:astore_2        
		valueanimator.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//    4    8:aload_2         
	//    5    9:getstatic       #81  <Field Interpolator ANIM_INTERPOLATOR>
	//    6   12:invokevirtual   #142 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.setDuration(100L);
	//    7   15:aload_2         
	//    8   16:ldc2w           #44  <Long 100L>
	//    9   19:invokevirtual   #146 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   10   22:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (shadowanimatorimpl)));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #150 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (shadowanimatorimpl)));
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #154 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
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
	//   28   45:invokevirtual   #158 <Method void ValueAnimator.setFloatValues(float[])>
		return valueanimator;
	//   29   48:aload_2         
	//   30   49:areturn         
	}

	private static ColorStateList createColorStateList(int i)
	{
		int ai[][] = new int[3][];
	//    0    0:iconst_3        
	//    1    1:anewarray       int[][]
	//    2    4:astore_2        
		int ai1[] = new int[3];
	//    3    5:iconst_3        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		ai[0] = FOCUSED_ENABLED_STATE_SET;
	//    6    9:aload_2         
	//    7   10:iconst_0        
	//    8   11:getstatic       #88  <Field int[] FOCUSED_ENABLED_STATE_SET>
	//    9   14:aastore         
		ai1[0] = i;
	//   10   15:aload_3         
	//   11   16:iconst_0        
	//   12   17:iload_0         
	//   13   18:iastore         
		int j = 0 + 1;
	//   14   19:iconst_0        
	//   15   20:iconst_1        
	//   16   21:iadd            
	//   17   22:istore_1        
		ai[j] = PRESSED_ENABLED_STATE_SET;
	//   18   23:aload_2         
	//   19   24:iload_1         
	//   20   25:getstatic       #85  <Field int[] PRESSED_ENABLED_STATE_SET>
	//   21   28:aastore         
		ai1[j] = i;
	//   22   29:aload_3         
	//   23   30:iload_1         
	//   24   31:iload_0         
	//   25   32:iastore         
		i = j + 1;
	//   26   33:iload_1         
	//   27   34:iconst_1        
	//   28   35:iadd            
	//   29   36:istore_0        
		ai[i] = new int[0];
	//   30   37:aload_2         
	//   31   38:iload_0         
	//   32   39:iconst_0        
	//   33   40:newarray        int[]
	//   34   42:aastore         
		ai1[i] = 0;
	//   35   43:aload_3         
	//   36   44:iload_0         
	//   37   45:iconst_0        
	//   38   46:iastore         
		return new ColorStateList(ai, ai1);
	//   39   47:new             #164 <Class ColorStateList>
	//   40   50:dup             
	//   41   51:aload_2         
	//   42   52:aload_3         
	//   43   53:invokespecial   #167 <Method void ColorStateList(int[][], int[])>
	//   44   56:areturn         
	}

	private void ensurePreDrawListener()
	{
		if(mPreDrawListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
	//*   2    4:ifnonnull       19
			mPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

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
	//    7   13:invokespecial   #171 <Method void FloatingActionButtonImpl$3(FloatingActionButtonImpl)>
	//    8   16:putfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
	//    9   19:return          
	}

	private boolean shouldAnimateVisibilityChange()
	{
		return ViewCompat.isLaidOut(((android.view.View) (mView))) && !mView.isInEditMode();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    2    4:invokestatic    #179 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//    3    7:ifeq            22
	//    4   10:aload_0         
	//    5   11:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    6   14:invokevirtual   #182 <Method boolean VisibilityAwareImageButton.isInEditMode()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private void updateFromViewRotation()
	{
		if(android.os.Build.VERSION.SDK_INT != 19) goto _L2; else goto _L1
	//    0    0:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          19
	//    2    5:icmpne          40
_L1:
		if(mRotation % 90F == 0.0F) goto _L4; else goto _L3
	//    3    8:aload_0         
	//    4    9:getfield        #134 <Field float mRotation>
	//    5   12:ldc1            #189 <Float 90F>
	//    6   14:frem            
	//    7   15:fconst_0        
	//    8   16:fcmpl           
	//    9   17:ifeq            79
_L3:
		if(mView.getLayerType() != 1)
	//*  10   20:aload_0         
	//*  11   21:getfield        #106 <Field VisibilityAwareImageButton mView>
	//*  12   24:invokevirtual   #193 <Method int VisibilityAwareImageButton.getLayerType()>
	//*  13   27:iconst_1        
	//*  14   28:icmpeq          40
			mView.setLayerType(1, ((android.graphics.Paint) (null)));
	//   15   31:aload_0         
	//   16   32:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   17   35:iconst_1        
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #197 <Method void VisibilityAwareImageButton.setLayerType(int, android.graphics.Paint)>
_L2:
		if(mShadowDrawable != null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//*  22   44:ifnull          59
			mShadowDrawable.setRotation(-mRotation);
	//   23   47:aload_0         
	//   24   48:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//   25   51:aload_0         
	//   26   52:getfield        #134 <Field float mRotation>
	//   27   55:fneg            
	//   28   56:invokevirtual   #205 <Method void ShadowDrawableWrapper.setRotation(float)>
		if(mBorderDrawable != null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #207 <Field CircularBorderDrawable mBorderDrawable>
	//*  31   63:ifnull          78
			mBorderDrawable.setRotation(-mRotation);
	//   32   66:aload_0         
	//   33   67:getfield        #207 <Field CircularBorderDrawable mBorderDrawable>
	//   34   70:aload_0         
	//   35   71:getfield        #134 <Field float mRotation>
	//   36   74:fneg            
	//   37   75:invokevirtual   #210 <Method void CircularBorderDrawable.setRotation(float)>
		return;
	//   38   78:return          
_L4:
		if(mView.getLayerType() != 0)
	//*  39   79:aload_0         
	//*  40   80:getfield        #106 <Field VisibilityAwareImageButton mView>
	//*  41   83:invokevirtual   #193 <Method int VisibilityAwareImageButton.getLayerType()>
	//*  42   86:ifeq            40
			mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//   43   89:aload_0         
	//   44   90:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   45   93:iconst_0        
	//   46   94:aconst_null     
	//   47   95:invokevirtual   #197 <Method void VisibilityAwareImageButton.setLayerType(int, android.graphics.Paint)>
		if(true) goto _L2; else goto _L5
	//   48   98:goto            40
_L5:
	}

	CircularBorderDrawable createBorderDrawable(int i, ColorStateList colorstatelist)
	{
		android.content.Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    2    4:invokevirtual   #216 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//    3    7:astore_3        
		CircularBorderDrawable circularborderdrawable = newCircularDrawable();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #220 <Method CircularBorderDrawable newCircularDrawable()>
	//    6   12:astore          4
		circularborderdrawable.setGradientColors(ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, android.support.design.R.color.design_fab_stroke_end_outer_color));
	//    7   14:aload           4
	//    8   16:aload_3         
	//    9   17:getstatic       #225 <Field int android.support.design.R$color.design_fab_stroke_top_outer_color>
	//   10   20:invokestatic    #231 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   11   23:aload_3         
	//   12   24:getstatic       #234 <Field int android.support.design.R$color.design_fab_stroke_top_inner_color>
	//   13   27:invokestatic    #231 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   14   30:aload_3         
	//   15   31:getstatic       #237 <Field int android.support.design.R$color.design_fab_stroke_end_inner_color>
	//   16   34:invokestatic    #231 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   17   37:aload_3         
	//   18   38:getstatic       #240 <Field int android.support.design.R$color.design_fab_stroke_end_outer_color>
	//   19   41:invokestatic    #231 <Method int ContextCompat.getColor(android.content.Context, int)>
	//   20   44:invokevirtual   #244 <Method void CircularBorderDrawable.setGradientColors(int, int, int, int)>
		circularborderdrawable.setBorderWidth(i);
	//   21   47:aload           4
	//   22   49:iload_1         
	//   23   50:i2f             
	//   24   51:invokevirtual   #247 <Method void CircularBorderDrawable.setBorderWidth(float)>
		circularborderdrawable.setBorderTint(colorstatelist);
	//   25   54:aload           4
	//   26   56:aload_2         
	//   27   57:invokevirtual   #251 <Method void CircularBorderDrawable.setBorderTint(ColorStateList)>
		return circularborderdrawable;
	//   28   60:aload           4
	//   29   62:areturn         
	}

	GradientDrawable createShapeDrawable()
	{
		GradientDrawable gradientdrawable = newGradientDrawableForShape();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method GradientDrawable newGradientDrawableForShape()>
	//    2    4:astore_1        
		gradientdrawable.setShape(1);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #262 <Method void GradientDrawable.setShape(int)>
		gradientdrawable.setColor(-1);
	//    6   10:aload_1         
	//    7   11:iconst_m1       
	//    8   12:invokevirtual   #265 <Method void GradientDrawable.setColor(int)>
		return gradientdrawable;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	final Drawable getContentBackground()
	{
		return mContentBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field Drawable mContentBackground>
	//    2    4:areturn         
	}

	float getElevation()
	{
		return mElevation;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field float mElevation>
	//    2    4:freturn         
	}

	void getPadding(Rect rect)
	{
		mShadowDrawable.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #277 <Method boolean ShadowDrawableWrapper.getPadding(Rect)>
	//    4    8:pop             
	//    5    9:return          
	}

	void hide(final InternalVisibilityChangedListener listener, final boolean fromUser)
	{
		if(!isOrWillBeHidden())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #283 <Method boolean isOrWillBeHidden()>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
			mView.animate().cancel();
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    6   12:invokevirtual   #287 <Method ViewPropertyAnimator VisibilityAwareImageButton.animate()>
	//    7   15:invokevirtual   #292 <Method void ViewPropertyAnimator.cancel()>
			if(shouldAnimateVisibilityChange())
	//*   8   18:aload_0         
	//*   9   19:invokespecial   #294 <Method boolean shouldAnimateVisibilityChange()>
	//*  10   22:ifeq            76
			{
				mAnimState = 1;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #99  <Field int mAnimState>
				mView.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationCancel(Animator animator)
					{
						mCancelled = true;
					//    0    0:aload_0         
					//    1    1:iconst_1        
					//    2    2:putfield        #32  <Field boolean mCancelled>
					//    3    5:return          
					}

					public void onAnimationEnd(Animator animator)
					{
						mAnimState = 0;
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
					//    2    4:iconst_0        
					//    3    5:putfield        #37  <Field int FloatingActionButtonImpl.mAnimState>
						if(!mCancelled)
					//*   4    8:aload_0         
					//*   5    9:getfield        #32  <Field boolean mCancelled>
					//*   6   12:ifne            58
						{
							animator = ((Animator) (mView));
					//    7   15:aload_0         
					//    8   16:getfield        #20  <Field FloatingActionButtonImpl this$0>
					//    9   19:getfield        #41  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
					//   10   22:astore_1        
							byte byte1;
							if(fromUser)
					//*  11   23:aload_0         
					//*  12   24:getfield        #22  <Field boolean val$fromUser>
					//*  13   27:ifeq            59
								byte1 = 8;
					//   14   30:bipush          8
					//   15   32:istore_2        
							else
					//*  16   33:aload_1         
					//*  17   34:iload_2         
					//*  18   35:aload_0         
					//*  19   36:getfield        #22  <Field boolean val$fromUser>
					//*  20   39:invokevirtual   #47  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
					//*  21   42:aload_0         
					//*  22   43:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
					//*  23   46:ifnull          58
					//*  24   49:aload_0         
					//*  25   50:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
					//*  26   53:invokeinterface #52  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
					//*  27   58:return          
								byte1 = 4;
					//   28   59:iconst_4        
					//   29   60:istore_2        
							((VisibilityAwareImageButton) (animator)).internalSetVisibility(((int) (byte1)), fromUser);
							if(listener != null)
								listener.onHidden();
						}
					//*  30   61:goto            33
					}

					public void onAnimationStart(Animator animator)
					{
						mView.internalSetVisibility(0, fromUser);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
					//    2    4:getfield        #41  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
					//    3    7:iconst_0        
					//    4    8:aload_0         
					//    5    9:getfield        #22  <Field boolean val$fromUser>
					//    6   12:invokevirtual   #47  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
						mCancelled = false;
					//    7   15:aload_0         
					//    8   16:iconst_0        
					//    9   17:putfield        #32  <Field boolean mCancelled>
					//   10   20:return          
					}

					private boolean mCancelled;
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
	//   14   30:aload_0         
	//   15   31:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   16   34:invokevirtual   #287 <Method ViewPropertyAnimator VisibilityAwareImageButton.animate()>
	//   17   37:fconst_0        
	//   18   38:invokevirtual   #298 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   19   41:fconst_0        
	//   20   42:invokevirtual   #301 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   21   45:fconst_0        
	//   22   46:invokevirtual   #304 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   23   49:ldc2w           #305 <Long 200L>
	//   24   52:invokevirtual   #309 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   25   55:getstatic       #79  <Field Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   26   58:invokevirtual   #312 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   27   61:new             #6   <Class FloatingActionButtonImpl$1>
	//   28   64:dup             
	//   29   65:aload_0         
	//   30   66:iload_2         
	//   31   67:aload_1         
	//   32   68:invokespecial   #315 <Method void FloatingActionButtonImpl$1(FloatingActionButtonImpl, boolean, FloatingActionButtonImpl$InternalVisibilityChangedListener)>
	//   33   71:invokevirtual   #319 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   34   74:pop             
				return;
	//   35   75:return          
			}
			VisibilityAwareImageButton visibilityawareimagebutton = mView;
	//   36   76:aload_0         
	//   37   77:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   38   80:astore          4
			byte byte0;
			if(fromUser)
	//*  39   82:iload_2         
	//*  40   83:ifeq            107
				byte0 = 8;
	//   41   86:bipush          8
	//   42   88:istore_3        
			else
	//*  43   89:aload           4
	//*  44   91:iload_3         
	//*  45   92:iload_2         
	//*  46   93:invokevirtual   #323 <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
	//*  47   96:aload_1         
	//*  48   97:ifnull          7
	//*  49  100:aload_1         
	//*  50  101:invokeinterface #326 <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
	//*  51  106:return          
				byte0 = 4;
	//   52  107:iconst_4        
	//   53  108:istore_3        
			visibilityawareimagebutton.internalSetVisibility(((int) (byte0)), fromUser);
			if(listener != null)
			{
				listener.onHidden();
				return;
			}
		}
	//*  54  109:goto            89
	}

	boolean isOrWillBeHidden()
	{
		if(mView.getVisibility() != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    2    4:invokevirtual   #329 <Method int VisibilityAwareImageButton.getVisibility()>
	//    3    7:ifne            22
_L1:
		if(mAnimState != 1) goto _L4; else goto _L3
	//    4   10:aload_0         
	//    5   11:getfield        #99  <Field int mAnimState>
	//    6   14:iconst_1        
	//    7   15:icmpne          20
_L3:
		return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
_L4:
		return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
_L2:
		if(mAnimState == 2)
	//*  12   22:aload_0         
	//*  13   23:getfield        #99  <Field int mAnimState>
	//*  14   26:iconst_2        
	//*  15   27:icmpne          18
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	boolean isOrWillBeShown()
	{
		if(mView.getVisibility() == 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    2    4:invokevirtual   #329 <Method int VisibilityAwareImageButton.getVisibility()>
	//    3    7:ifeq            22
_L1:
		if(mAnimState != 2) goto _L4; else goto _L3
	//    4   10:aload_0         
	//    5   11:getfield        #99  <Field int mAnimState>
	//    6   14:iconst_2        
	//    7   15:icmpne          20
_L3:
		return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
_L4:
		return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
_L2:
		if(mAnimState == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #99  <Field int mAnimState>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          18
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	void jumpDrawableToCurrentState()
	{
		mStateListAnimator.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//    2    4:invokevirtual   #334 <Method void StateListAnimator.jumpToCurrentState()>
	//    3    7:return          
	}

	CircularBorderDrawable newCircularDrawable()
	{
		return new CircularBorderDrawable();
	//    0    0:new             #209 <Class CircularBorderDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #335 <Method void CircularBorderDrawable()>
	//    3    7:areturn         
	}

	GradientDrawable newGradientDrawableForShape()
	{
		return new GradientDrawable();
	//    0    0:new             #258 <Class GradientDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #336 <Method void GradientDrawable()>
	//    3    7:areturn         
	}

	void onAttachedToWindow()
	{
		if(requirePreDrawListener())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #340 <Method boolean requirePreDrawListener()>
	//*   2    4:ifeq            25
		{
			ensurePreDrawListener();
	//    3    7:aload_0         
	//    4    8:invokespecial   #342 <Method void ensurePreDrawListener()>
			mView.getViewTreeObserver().addOnPreDrawListener(mPreDrawListener);
	//    5   11:aload_0         
	//    6   12:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    7   15:invokevirtual   #346 <Method ViewTreeObserver VisibilityAwareImageButton.getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
	//   10   22:invokevirtual   #352 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
	//   11   25:return          
	}

	void onCompatShadowChanged()
	{
	//    0    0:return          
	}

	void onDetachedFromWindow()
	{
		if(mPreDrawListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
	//*   2    4:ifnull          26
		{
			mView.getViewTreeObserver().removeOnPreDrawListener(mPreDrawListener);
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    5   11:invokevirtual   #346 <Method ViewTreeObserver VisibilityAwareImageButton.getViewTreeObserver()>
	//    6   14:aload_0         
	//    7   15:getfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
	//    8   18:invokevirtual   #357 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			mPreDrawListener = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #170 <Field android.view.ViewTreeObserver$OnPreDrawListener mPreDrawListener>
		}
	//   12   26:return          
	}

	void onDrawableStateChanged(int ai[])
	{
		mStateListAnimator.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field StateListAnimator mStateListAnimator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #362 <Method void StateListAnimator.setState(int[])>
	//    4    8:return          
	}

	void onElevationsChanged(float f, float f1)
	{
		if(mShadowDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//*   2    4:ifnull          25
		{
			mShadowDrawable.setShadowSize(f, mPressedTranslationZ + f);
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//    5   11:fload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #366 <Field float mPressedTranslationZ>
	//    8   16:fload_1         
	//    9   17:fadd            
	//   10   18:invokevirtual   #369 <Method void ShadowDrawableWrapper.setShadowSize(float, float)>
			updatePadding();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #372 <Method void updatePadding()>
		}
	//   13   25:return          
	}

	void onPaddingUpdated(Rect rect)
	{
	//    0    0:return          
	}

	void onPreDraw()
	{
		float f = mView.getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    2    4:invokevirtual   #132 <Method float VisibilityAwareImageButton.getRotation()>
	//    3    7:fstore_1        
		if(mRotation != f)
	//*   4    8:aload_0         
	//*   5    9:getfield        #134 <Field float mRotation>
	//*   6   12:fload_1         
	//*   7   13:fcmpl           
	//*   8   14:ifeq            26
		{
			mRotation = f;
	//    9   17:aload_0         
	//   10   18:fload_1         
	//   11   19:putfield        #134 <Field float mRotation>
			updateFromViewRotation();
	//   12   22:aload_0         
	//   13   23:invokespecial   #376 <Method void updateFromViewRotation()>
		}
	//   14   26:return          
	}

	boolean requirePreDrawListener()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j)
	{
		mShapeDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #380 <Method GradientDrawable createShapeDrawable()>
	//    3    5:invokestatic    #386 <Method Drawable DrawableCompat.wrap(Drawable)>
	//    4    8:putfield        #388 <Field Drawable mShapeDrawable>
		DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
	//    5   11:aload_0         
	//    6   12:getfield        #388 <Field Drawable mShapeDrawable>
	//    7   15:aload_1         
	//    8   16:invokestatic    #392 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mode != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			DrawableCompat.setTintMode(mShapeDrawable, mode);
	//   11   23:aload_0         
	//   12   24:getfield        #388 <Field Drawable mShapeDrawable>
	//   13   27:aload_2         
	//   14   28:invokestatic    #396 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		mRippleDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:invokevirtual   #380 <Method GradientDrawable createShapeDrawable()>
	//   18   36:invokestatic    #386 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   19   39:putfield        #398 <Field Drawable mRippleDrawable>
		DrawableCompat.setTintList(mRippleDrawable, createColorStateList(i));
	//   20   42:aload_0         
	//   21   43:getfield        #398 <Field Drawable mRippleDrawable>
	//   22   46:iload_3         
	//   23   47:invokestatic    #400 <Method ColorStateList createColorStateList(int)>
	//   24   50:invokestatic    #392 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(j > 0)
	//*  25   53:iload           4
	//*  26   55:ifle            173
		{
			mBorderDrawable = createBorderDrawable(j, colorstatelist);
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:iload           4
	//   30   62:aload_1         
	//   31   63:invokevirtual   #402 <Method CircularBorderDrawable createBorderDrawable(int, ColorStateList)>
	//   32   66:putfield        #207 <Field CircularBorderDrawable mBorderDrawable>
			colorstatelist = ((ColorStateList) (new Drawable[3]));
	//   33   69:iconst_3        
	//   34   70:anewarray       Drawable[]
	//   35   73:astore_1        
			colorstatelist[0] = ((/*<invalid signature>*/java.lang.Object) (mBorderDrawable));
	//   36   74:aload_1         
	//   37   75:iconst_0        
	//   38   76:aload_0         
	//   39   77:getfield        #207 <Field CircularBorderDrawable mBorderDrawable>
	//   40   80:aastore         
			colorstatelist[1] = ((/*<invalid signature>*/java.lang.Object) (mShapeDrawable));
	//   41   81:aload_1         
	//   42   82:iconst_1        
	//   43   83:aload_0         
	//   44   84:getfield        #388 <Field Drawable mShapeDrawable>
	//   45   87:aastore         
			colorstatelist[2] = ((/*<invalid signature>*/java.lang.Object) (mRippleDrawable));
	//   46   88:aload_1         
	//   47   89:iconst_2        
	//   48   90:aload_0         
	//   49   91:getfield        #398 <Field Drawable mRippleDrawable>
	//   50   94:aastore         
		} else
	//*  51   95:aload_0         
	//*  52   96:new             #406 <Class LayerDrawable>
	//*  53   99:dup             
	//*  54  100:aload_1         
	//*  55  101:invokespecial   #409 <Method void LayerDrawable(Drawable[])>
	//*  56  104:putfield        #269 <Field Drawable mContentBackground>
	//*  57  107:aload_0         
	//*  58  108:new             #201 <Class ShadowDrawableWrapper>
	//*  59  111:dup             
	//*  60  112:aload_0         
	//*  61  113:getfield        #106 <Field VisibilityAwareImageButton mView>
	//*  62  116:invokevirtual   #216 <Method android.content.Context VisibilityAwareImageButton.getContext()>
	//*  63  119:aload_0         
	//*  64  120:getfield        #269 <Field Drawable mContentBackground>
	//*  65  123:aload_0         
	//*  66  124:getfield        #108 <Field ShadowViewDelegate mShadowViewDelegate>
	//*  67  127:invokeinterface #414 <Method float ShadowViewDelegate.getRadius()>
	//*  68  132:aload_0         
	//*  69  133:getfield        #272 <Field float mElevation>
	//*  70  136:aload_0         
	//*  71  137:getfield        #272 <Field float mElevation>
	//*  72  140:aload_0         
	//*  73  141:getfield        #366 <Field float mPressedTranslationZ>
	//*  74  144:fadd            
	//*  75  145:invokespecial   #417 <Method void ShadowDrawableWrapper(android.content.Context, Drawable, float, float, float)>
	//*  76  148:putfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//*  77  151:aload_0         
	//*  78  152:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//*  79  155:iconst_0        
	//*  80  156:invokevirtual   #421 <Method void ShadowDrawableWrapper.setAddPaddingForCorners(boolean)>
	//*  81  159:aload_0         
	//*  82  160:getfield        #108 <Field ShadowViewDelegate mShadowViewDelegate>
	//*  83  163:aload_0         
	//*  84  164:getfield        #199 <Field ShadowDrawableWrapper mShadowDrawable>
	//*  85  167:invokeinterface #424 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
	//*  86  172:return          
		{
			mBorderDrawable = null;
	//   87  173:aload_0         
	//   88  174:aconst_null     
	//   89  175:putfield        #207 <Field CircularBorderDrawable mBorderDrawable>
			colorstatelist = ((ColorStateList) (new Drawable[2]));
	//   90  178:iconst_2        
	//   91  179:anewarray       Drawable[]
	//   92  182:astore_1        
			colorstatelist[0] = ((/*<invalid signature>*/java.lang.Object) (mShapeDrawable));
	//   93  183:aload_1         
	//   94  184:iconst_0        
	//   95  185:aload_0         
	//   96  186:getfield        #388 <Field Drawable mShapeDrawable>
	//   97  189:aastore         
			colorstatelist[1] = ((/*<invalid signature>*/java.lang.Object) (mRippleDrawable));
	//   98  190:aload_1         
	//   99  191:iconst_1        
	//  100  192:aload_0         
	//  101  193:getfield        #398 <Field Drawable mRippleDrawable>
	//  102  196:aastore         
		}
		mContentBackground = ((Drawable) (new LayerDrawable(((Drawable []) (colorstatelist)))));
		mShadowDrawable = new ShadowDrawableWrapper(mView.getContext(), mContentBackground, mShadowViewDelegate.getRadius(), mElevation, mElevation + mPressedTranslationZ);
		mShadowDrawable.setAddPaddingForCorners(false);
		mShadowViewDelegate.setBackgroundDrawable(((Drawable) (mShadowDrawable)));
	//* 103  197:goto            95
	}

	void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mShapeDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #388 <Field Drawable mShapeDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #388 <Field Drawable mShapeDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #392 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mBorderDrawable != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #207 <Field CircularBorderDrawable mBorderDrawable>
	//*   9   19:ifnull          30
			mBorderDrawable.setBorderTint(colorstatelist);
	//   10   22:aload_0         
	//   11   23:getfield        #207 <Field CircularBorderDrawable mBorderDrawable>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #251 <Method void CircularBorderDrawable.setBorderTint(ColorStateList)>
	//   14   30:return          
	}

	void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mShapeDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #388 <Field Drawable mShapeDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.setTintMode(mShapeDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #388 <Field Drawable mShapeDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #396 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	final void setElevation(float f)
	{
		if(mElevation != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field float mElevation>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            23
		{
			mElevation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #272 <Field float mElevation>
			onElevationsChanged(f, mPressedTranslationZ);
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #366 <Field float mPressedTranslationZ>
	//   12   20:invokevirtual   #430 <Method void onElevationsChanged(float, float)>
		}
	//   13   23:return          
	}

	final void setPressedTranslationZ(float f)
	{
		if(mPressedTranslationZ != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #366 <Field float mPressedTranslationZ>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            23
		{
			mPressedTranslationZ = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #366 <Field float mPressedTranslationZ>
			onElevationsChanged(mElevation, f);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #272 <Field float mElevation>
	//   11   19:fload_1         
	//   12   20:invokevirtual   #430 <Method void onElevationsChanged(float, float)>
		}
	//   13   23:return          
	}

	void setRippleColor(int i)
	{
		if(mRippleDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field Drawable mRippleDrawable>
	//*   2    4:ifnull          18
			DrawableCompat.setTintList(mRippleDrawable, createColorStateList(i));
	//    3    7:aload_0         
	//    4    8:getfield        #398 <Field Drawable mRippleDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #400 <Method ColorStateList createColorStateList(int)>
	//    7   15:invokestatic    #392 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
	//    8   18:return          
	}

	void show(final InternalVisibilityChangedListener listener, final boolean fromUser)
	{
		if(!isOrWillBeShown())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #435 <Method boolean isOrWillBeShown()>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
			mView.animate().cancel();
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field VisibilityAwareImageButton mView>
	//    6   12:invokevirtual   #287 <Method ViewPropertyAnimator VisibilityAwareImageButton.animate()>
	//    7   15:invokevirtual   #292 <Method void ViewPropertyAnimator.cancel()>
			if(shouldAnimateVisibilityChange())
	//*   8   18:aload_0         
	//*   9   19:invokespecial   #294 <Method boolean shouldAnimateVisibilityChange()>
	//*  10   22:ifeq            110
			{
				mAnimState = 2;
	//   11   25:aload_0         
	//   12   26:iconst_2        
	//   13   27:putfield        #99  <Field int mAnimState>
				if(mView.getVisibility() != 0)
	//*  14   30:aload_0         
	//*  15   31:getfield        #106 <Field VisibilityAwareImageButton mView>
	//*  16   34:invokevirtual   #329 <Method int VisibilityAwareImageButton.getVisibility()>
	//*  17   37:ifeq            64
				{
					mView.setAlpha(0.0F);
	//   18   40:aload_0         
	//   19   41:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   20   44:fconst_0        
	//   21   45:invokevirtual   #438 <Method void VisibilityAwareImageButton.setAlpha(float)>
					mView.setScaleY(0.0F);
	//   22   48:aload_0         
	//   23   49:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   24   52:fconst_0        
	//   25   53:invokevirtual   #441 <Method void VisibilityAwareImageButton.setScaleY(float)>
					mView.setScaleX(0.0F);
	//   26   56:aload_0         
	//   27   57:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   28   60:fconst_0        
	//   29   61:invokevirtual   #444 <Method void VisibilityAwareImageButton.setScaleX(float)>
				}
				mView.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						mAnimState = 0;
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
					//    2    4:iconst_0        
					//    3    5:putfield        #33  <Field int FloatingActionButtonImpl.mAnimState>
						if(listener != null)
					//*   4    8:aload_0         
					//*   5    9:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
					//*   6   12:ifnull          24
							listener.onShown();
					//    7   15:aload_0         
					//    8   16:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
					//    9   19:invokeinterface #38  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
					//   10   24:return          
					}

					public void onAnimationStart(Animator animator)
					{
						mView.internalSetVisibility(0, fromUser);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
					//    2    4:getfield        #43  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
					//    3    7:iconst_0        
					//    4    8:aload_0         
					//    5    9:getfield        #21  <Field boolean val$fromUser>
					//    6   12:invokevirtual   #49  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
					//    7   15:return          
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
	//   30   64:aload_0         
	//   31   65:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   32   68:invokevirtual   #287 <Method ViewPropertyAnimator VisibilityAwareImageButton.animate()>
	//   33   71:fconst_1        
	//   34   72:invokevirtual   #298 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   35   75:fconst_1        
	//   36   76:invokevirtual   #301 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   37   79:fconst_1        
	//   38   80:invokevirtual   #304 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   39   83:ldc2w           #305 <Long 200L>
	//   40   86:invokevirtual   #309 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   41   89:getstatic       #447 <Field Interpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   42   92:invokevirtual   #312 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   43   95:new             #8   <Class FloatingActionButtonImpl$2>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:iload_2         
	//   47  101:aload_1         
	//   48  102:invokespecial   #448 <Method void FloatingActionButtonImpl$2(FloatingActionButtonImpl, boolean, FloatingActionButtonImpl$InternalVisibilityChangedListener)>
	//   49  105:invokevirtual   #319 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   50  108:pop             
				return;
	//   51  109:return          
			}
			mView.internalSetVisibility(0, fromUser);
	//   52  110:aload_0         
	//   53  111:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   54  114:iconst_0        
	//   55  115:iload_2         
	//   56  116:invokevirtual   #323 <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
			mView.setAlpha(1.0F);
	//   57  119:aload_0         
	//   58  120:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   59  123:fconst_1        
	//   60  124:invokevirtual   #438 <Method void VisibilityAwareImageButton.setAlpha(float)>
			mView.setScaleY(1.0F);
	//   61  127:aload_0         
	//   62  128:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   63  131:fconst_1        
	//   64  132:invokevirtual   #441 <Method void VisibilityAwareImageButton.setScaleY(float)>
			mView.setScaleX(1.0F);
	//   65  135:aload_0         
	//   66  136:getfield        #106 <Field VisibilityAwareImageButton mView>
	//   67  139:fconst_1        
	//   68  140:invokevirtual   #444 <Method void VisibilityAwareImageButton.setScaleX(float)>
			if(listener != null)
	//*  69  143:aload_1         
	//*  70  144:ifnull          7
			{
				listener.onShown();
	//   71  147:aload_1         
	//   72  148:invokeinterface #451 <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
				return;
	//   73  153:return          
			}
		}
	}

	final void updatePadding()
	{
		Rect rect = mTmpRect;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Rect mTmpRect>
	//    2    4:astore_1        
		getPadding(rect);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #453 <Method void getPadding(Rect)>
		onPaddingUpdated(rect);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #455 <Method void onPaddingUpdated(Rect)>
		mShadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field ShadowViewDelegate mShadowViewDelegate>
	//   11   19:aload_1         
	//   12   20:getfield        #458 <Field int Rect.left>
	//   13   23:aload_1         
	//   14   24:getfield        #461 <Field int Rect.top>
	//   15   27:aload_1         
	//   16   28:getfield        #464 <Field int Rect.right>
	//   17   31:aload_1         
	//   18   32:getfield        #467 <Field int Rect.bottom>
	//   19   35:invokeinterface #470 <Method void ShadowViewDelegate.setShadowPadding(int, int, int, int)>
	//   20   40:return          
	}

	static final Interpolator ANIM_INTERPOLATOR;
	static final int ANIM_STATE_HIDING = 1;
	static final int ANIM_STATE_NONE = 0;
	static final int ANIM_STATE_SHOWING = 2;
	static final int EMPTY_STATE_SET[] = new int[0];
	static final int ENABLED_STATE_SET[] = {
		0x101009e
	};
	static final int FOCUSED_ENABLED_STATE_SET[] = {
		0x101009c, 0x101009e
	};
	static final long PRESSED_ANIM_DELAY = 100L;
	static final long PRESSED_ANIM_DURATION = 100L;
	static final int PRESSED_ENABLED_STATE_SET[] = {
		0x10100a7, 0x101009e
	};
	static final int SHOW_HIDE_ANIM_DURATION = 200;
	int mAnimState;
	CircularBorderDrawable mBorderDrawable;
	Drawable mContentBackground;
	float mElevation;
	private android.view.ViewTreeObserver.OnPreDrawListener mPreDrawListener;
	float mPressedTranslationZ;
	Drawable mRippleDrawable;
	private float mRotation;
	ShadowDrawableWrapper mShadowDrawable;
	final ShadowViewDelegate mShadowViewDelegate;
	Drawable mShapeDrawable;
	private final StateListAnimator mStateListAnimator = new StateListAnimator();
	private final Rect mTmpRect = new Rect();
	final VisibilityAwareImageButton mView;

	static 
	{
		ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
	//    0    0:getstatic       #79  <Field Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//    1    3:putstatic       #81  <Field Interpolator ANIM_INTERPOLATOR>
	//    2    6:iconst_2        
	//    3    7:newarray        int[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #82  <Int 0x10100a7>
	//    7   13:iastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #83  <Int 0x101009e>
	//   11   18:iastore         
	//   12   19:putstatic       #85  <Field int[] PRESSED_ENABLED_STATE_SET>
	//   13   22:iconst_2        
	//   14   23:newarray        int[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:ldc1            #86  <Int 0x101009c>
	//   18   29:iastore         
	//   19   30:dup             
	//   20   31:iconst_1        
	//   21   32:ldc1            #83  <Int 0x101009e>
	//   22   34:iastore         
	//   23   35:putstatic       #88  <Field int[] FOCUSED_ENABLED_STATE_SET>
	//   24   38:iconst_1        
	//   25   39:newarray        int[]
	//   26   41:dup             
	//   27   42:iconst_0        
	//   28   43:ldc1            #83  <Int 0x101009e>
	//   29   45:iastore         
	//   30   46:putstatic       #90  <Field int[] ENABLED_STATE_SET>
	//   31   49:iconst_0        
	//   32   50:newarray        int[]
	//   33   52:putstatic       #92  <Field int[] EMPTY_STATE_SET>
	//*  34   55:return          
	}
}
