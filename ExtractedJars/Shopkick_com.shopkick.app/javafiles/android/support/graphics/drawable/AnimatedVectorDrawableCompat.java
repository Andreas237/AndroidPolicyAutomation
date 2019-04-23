// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCommon, Animatable2Compat, VectorDrawableCompat, AndroidResources, 
//			AnimatorInflaterCompat

public class AnimatedVectorDrawableCompat extends VectorDrawableCommon
	implements Animatable2Compat
{
	private static class AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int mChangingConfigurations>
		//    2    4:ireturn         
		}

		public Drawable newDrawable()
		{
			throw new IllegalStateException("No constant state support for SDK < 24.");
		//    0    0:new             #114 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #116 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #119 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public Drawable newDrawable(Resources resources)
		{
			throw new IllegalStateException("No constant state support for SDK < 24.");
		//    0    0:new             #114 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #116 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #119 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public void setupAnimatorSet()
		{
			if(mAnimatorSet == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #121 <Field AnimatorSet mAnimatorSet>
		//*   2    4:ifnonnull       18
				mAnimatorSet = new AnimatorSet();
		//    3    7:aload_0         
		//    4    8:new             #123 <Class AnimatorSet>
		//    5   11:dup             
		//    6   12:invokespecial   #124 <Method void AnimatorSet()>
		//    7   15:putfield        #121 <Field AnimatorSet mAnimatorSet>
			mAnimatorSet.playTogether(((java.util.Collection) (mAnimators)));
		//    8   18:aload_0         
		//    9   19:getfield        #121 <Field AnimatorSet mAnimatorSet>
		//   10   22:aload_0         
		//   11   23:getfield        #62  <Field ArrayList mAnimators>
		//   12   26:invokevirtual   #128 <Method void AnimatorSet.playTogether(java.util.Collection)>
		//   13   29:return          
		}

		AnimatorSet mAnimatorSet;
		ArrayList mAnimators;
		int mChangingConfigurations;
		ArrayMap mTargetNameMap;
		VectorDrawableCompat mVectorDrawable;

		public AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompatState animatedvectordrawablecompatstate, android.graphics.drawable.Drawable.Callback callback, Resources resources)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void android.graphics.drawable.Drawable$ConstantState()>
			if(animatedvectordrawablecompatstate != null)
		//*   2    4:aload_2         
		//*   3    5:ifnull          231
			{
				mChangingConfigurations = animatedvectordrawablecompatstate.mChangingConfigurations;
		//    4    8:aload_0         
		//    5    9:aload_2         
		//    6   10:getfield        #26  <Field int mChangingConfigurations>
		//    7   13:putfield        #26  <Field int mChangingConfigurations>
				context = ((Context) (animatedvectordrawablecompatstate.mVectorDrawable));
		//    8   16:aload_2         
		//    9   17:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   10   20:astore_1        
				int i = 0;
		//   11   21:iconst_0        
		//   12   22:istore          5
				if(context != null)
		//*  13   24:aload_1         
		//*  14   25:ifnull          109
				{
					context = ((Context) (((VectorDrawableCompat) (context)).getConstantState()));
		//   15   28:aload_1         
		//   16   29:invokevirtual   #34  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
		//   17   32:astore_1        
					if(resources != null)
		//*  18   33:aload           4
		//*  19   35:ifnull          54
						mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
		//   20   38:aload_0         
		//   21   39:aload_1         
		//   22   40:aload           4
		//   23   42:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//   24   45:checkcast       #30  <Class VectorDrawableCompat>
		//   25   48:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
					else
		//*  26   51:goto            65
						mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable();
		//   27   54:aload_0         
		//   28   55:aload_1         
		//   29   56:invokevirtual   #41  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//   30   59:checkcast       #30  <Class VectorDrawableCompat>
		//   31   62:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
					mVectorDrawable = (VectorDrawableCompat)mVectorDrawable.mutate();
		//   32   65:aload_0         
		//   33   66:aload_0         
		//   34   67:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   35   70:invokevirtual   #44  <Method Drawable VectorDrawableCompat.mutate()>
		//   36   73:checkcast       #30  <Class VectorDrawableCompat>
		//   37   76:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
					mVectorDrawable.setCallback(callback);
		//   38   79:aload_0         
		//   39   80:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   40   83:aload_3         
		//   41   84:invokevirtual   #48  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					mVectorDrawable.setBounds(animatedvectordrawablecompatstate.mVectorDrawable.getBounds());
		//   42   87:aload_0         
		//   43   88:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   44   91:aload_2         
		//   45   92:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   46   95:invokevirtual   #52  <Method Rect VectorDrawableCompat.getBounds()>
		//   47   98:invokevirtual   #56  <Method void VectorDrawableCompat.setBounds(Rect)>
					mVectorDrawable.setAllowCaching(false);
		//   48  101:aload_0         
		//   49  102:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   50  105:iconst_0        
		//   51  106:invokevirtual   #60  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
				}
				context = ((Context) (animatedvectordrawablecompatstate.mAnimators));
		//   52  109:aload_2         
		//   53  110:getfield        #62  <Field ArrayList mAnimators>
		//   54  113:astore_1        
				if(context != null)
		//*  55  114:aload_1         
		//*  56  115:ifnull          231
				{
					int j = ((ArrayList) (context)).size();
		//   57  118:aload_1         
		//   58  119:invokevirtual   #68  <Method int ArrayList.size()>
		//   59  122:istore          6
					mAnimators = new ArrayList(j);
		//   60  124:aload_0         
		//   61  125:new             #64  <Class ArrayList>
		//   62  128:dup             
		//   63  129:iload           6
		//   64  131:invokespecial   #71  <Method void ArrayList(int)>
		//   65  134:putfield        #62  <Field ArrayList mAnimators>
					mTargetNameMap = new ArrayMap(j);
		//   66  137:aload_0         
		//   67  138:new             #73  <Class ArrayMap>
		//   68  141:dup             
		//   69  142:iload           6
		//   70  144:invokespecial   #74  <Method void ArrayMap(int)>
		//   71  147:putfield        #76  <Field ArrayMap mTargetNameMap>
					for(; i < j; i++)
		//*  72  150:iload           5
		//*  73  152:iload           6
		//*  74  154:icmpge          227
					{
						callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompatstate.mAnimators.get(i)));
		//   75  157:aload_2         
		//   76  158:getfield        #62  <Field ArrayList mAnimators>
		//   77  161:iload           5
		//   78  163:invokevirtual   #80  <Method Object ArrayList.get(int)>
		//   79  166:checkcast       #82  <Class Animator>
		//   80  169:astore_3        
						context = ((Context) (((Animator) (callback)).clone()));
		//   81  170:aload_3         
		//   82  171:invokevirtual   #86  <Method Animator Animator.clone()>
		//   83  174:astore_1        
						callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompatstate.mTargetNameMap.get(((Object) (callback)))));
		//   84  175:aload_2         
		//   85  176:getfield        #76  <Field ArrayMap mTargetNameMap>
		//   86  179:aload_3         
		//   87  180:invokevirtual   #89  <Method Object ArrayMap.get(Object)>
		//   88  183:checkcast       #91  <Class String>
		//   89  186:astore_3        
						((Animator) (context)).setTarget(mVectorDrawable.getTargetByName(((String) (callback))));
		//   90  187:aload_1         
		//   91  188:aload_0         
		//   92  189:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   93  192:aload_3         
		//   94  193:invokevirtual   #95  <Method Object VectorDrawableCompat.getTargetByName(String)>
		//   95  196:invokevirtual   #99  <Method void Animator.setTarget(Object)>
						mAnimators.add(((Object) (context)));
		//   96  199:aload_0         
		//   97  200:getfield        #62  <Field ArrayList mAnimators>
		//   98  203:aload_1         
		//   99  204:invokevirtual   #103 <Method boolean ArrayList.add(Object)>
		//  100  207:pop             
						mTargetNameMap.put(((Object) (context)), ((Object) (callback)));
		//  101  208:aload_0         
		//  102  209:getfield        #76  <Field ArrayMap mTargetNameMap>
		//  103  212:aload_1         
		//  104  213:aload_3         
		//  105  214:invokevirtual   #107 <Method Object ArrayMap.put(Object, Object)>
		//  106  217:pop             
					}

		//  107  218:iload           5
		//  108  220:iconst_1        
		//  109  221:iadd            
		//  110  222:istore          5
		//* 111  224:goto            150
					setupAnimatorSet();
		//  112  227:aload_0         
		//  113  228:invokevirtual   #110 <Method void setupAnimatorSet()>
				}
			}
		//  114  231:return          
		}
	}

	private static class AnimatedVectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canApplyTheme()
		{
			return mDelegateState.canApplyTheme();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    2    4:invokevirtual   #24  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
		//    3    7:ireturn         
		}

		public int getChangingConfigurations()
		{
			return mDelegateState.getChangingConfigurations();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    2    4:invokevirtual   #28  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    3    7:ireturn         
		}

		public Drawable newDrawable()
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_1        
			animatedvectordrawablecompat.mDelegateDrawable = mDelegateState.newDrawable();
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:invokevirtual   #33  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//    8   16:putfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//    9   19:aload_1         
		//   10   20:getfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   11   23:aload_1         
		//   12   24:getfield        #41  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   13   27:invokevirtual   #47  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   14   30:aload_1         
		//   15   31:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_2        
			animatedvectordrawablecompat.mDelegateDrawable = mDelegateState.newDrawable(resources);
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #50  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//    9   17:putfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//   10   20:aload_2         
		//   11   21:getfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   12   24:aload_2         
		//   13   25:getfield        #41  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   14   28:invokevirtual   #47  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   15   31:aload_2         
		//   16   32:areturn         
		}

		public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_3        
			animatedvectordrawablecompat.mDelegateDrawable = mDelegateState.newDrawable(resources, theme);
		//    4    8:aload_3         
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #53  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
		//   10   18:putfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//   11   21:aload_3         
		//   12   22:getfield        #37  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   13   25:aload_3         
		//   14   26:getfield        #41  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   15   29:invokevirtual   #47  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   16   32:aload_3         
		//   17   33:areturn         
		}

		private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

		public AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mDelegateState = constantstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
		//    5    9:return          
		}
	}


	AnimatedVectorDrawableCompat()
	{
		this(((Context) (null)), ((AnimatedVectorDrawableCompatState) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #49  <Method void AnimatedVectorDrawableCompat(Context, AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState, Resources)>
	//    5    7:return          
	}

	private AnimatedVectorDrawableCompat(Context context)
	{
		this(context, ((AnimatedVectorDrawableCompatState) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #49  <Method void AnimatedVectorDrawableCompat(Context, AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState, Resources)>
	//    5    7:return          
	}

	private AnimatedVectorDrawableCompat(Context context, AnimatedVectorDrawableCompatState animatedvectordrawablecompatstate, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void VectorDrawableCommon()>
		mArgbEvaluator = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #57  <Field ArgbEvaluator mArgbEvaluator>
		mAnimatorListener = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
		mAnimationCallbacks = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #61  <Field ArrayList mAnimationCallbacks>
		mCallback = new android.graphics.drawable.Drawable.Callback() {

			public void invalidateDrawable(Drawable drawable)
			{
				invalidateSelf();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat this$0>
			//    2    4:invokevirtual   #23  <Method void AnimatedVectorDrawableCompat.invalidateSelf()>
			//    3    7:return          
			}

			public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
			{
				scheduleSelf(runnable, l);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat this$0>
			//    2    4:aload_2         
			//    3    5:lload_3         
			//    4    6:invokevirtual   #29  <Method void AnimatedVectorDrawableCompat.scheduleSelf(Runnable, long)>
			//    5    9:return          
			}

			public void unscheduleDrawable(Drawable drawable, Runnable runnable)
			{
				unscheduleSelf(runnable);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat this$0>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #35  <Method void AnimatedVectorDrawableCompat.unscheduleSelf(Runnable)>
			//    4    8:return          
			}

			final AnimatedVectorDrawableCompat this$0;

			
			{
				this$0 = AnimatedVectorDrawableCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AnimatedVectorDrawableCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #8   <Class AnimatedVectorDrawableCompat$1>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #64  <Method void AnimatedVectorDrawableCompat$1(AnimatedVectorDrawableCompat)>
	//   16   28:putfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
		mContext = context;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #68  <Field Context mContext>
		if(animatedvectordrawablecompatstate != null)
	//*  20   36:aload_2         
	//*  21   37:ifnull          46
		{
			mAnimatedVectorState = animatedvectordrawablecompatstate;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
			return;
	//   25   45:return          
		} else
		{
			mAnimatedVectorState = new AnimatedVectorDrawableCompatState(context, animatedvectordrawablecompatstate, mCallback, resources);
	//   26   46:aload_0         
	//   27   47:new             #12  <Class AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:aload_2         
	//   31   53:aload_0         
	//   32   54:getfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   33   57:aload_3         
	//   34   58:invokespecial   #73  <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState(Context, AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState, android.graphics.drawable.Drawable$Callback, Resources)>
	//   35   61:putfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
			return;
	//   36   64:return          
		}
	}

	public static void clearAnimationCallbacks(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
		{
			if(!(drawable instanceof Animatable))
	//*   2    4:aload_0         
	//*   3    5:instanceof      #77  <Class Animatable>
	//*   4    8:ifne            12
				return;
	//    5   11:return          
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   6   12:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          24
	//*   8   17:icmplt          28
			{
				((AnimatedVectorDrawable)drawable).clearAnimationCallbacks();
	//    9   20:aload_0         
	//   10   21:checkcast       #85  <Class AnimatedVectorDrawable>
	//   11   24:invokevirtual   #87  <Method void AnimatedVectorDrawable.clearAnimationCallbacks()>
				return;
	//   12   27:return          
			} else
			{
				((AnimatedVectorDrawableCompat)drawable).clearAnimationCallbacks();
	//   13   28:aload_0         
	//   14   29:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   15   32:invokevirtual   #88  <Method void clearAnimationCallbacks()>
				return;
	//   16   35:return          
			}
		} else
		{
			return;
	//   17   36:return          
		}
	}

	public static AnimatedVectorDrawableCompat create(Context context, int i)
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          64
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat(context);
	//    3    8:new             #2   <Class AnimatedVectorDrawableCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #98  <Method void AnimatedVectorDrawableCompat(Context)>
	//    7   16:astore_2        
			animatedvectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
	//    8   17:aload_2         
	//    9   18:aload_0         
	//   10   19:invokevirtual   #104 <Method Resources Context.getResources()>
	//   11   22:iload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #108 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   14   27:invokestatic    #114 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   15   30:putfield        #118 <Field Drawable mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//   16   33:aload_2         
	//   17   34:getfield        #118 <Field Drawable mDelegateDrawable>
	//   18   37:aload_2         
	//   19   38:getfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   20   41:invokevirtual   #124 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			animatedvectordrawablecompat.mCachedConstantStateDelegate = new AnimatedVectorDrawableDelegateState(animatedvectordrawablecompat.mDelegateDrawable.getConstantState());
	//   21   44:aload_2         
	//   22   45:new             #15  <Class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState>
	//   23   48:dup             
	//   24   49:aload_2         
	//   25   50:getfield        #118 <Field Drawable mDelegateDrawable>
	//   26   53:invokevirtual   #128 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   27   56:invokespecial   #131 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   28   59:putfield        #133 <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate>
			return animatedvectordrawablecompat;
	//   29   62:aload_2         
	//   30   63:areturn         
		}
		obj = ((Object) (context.getResources()));
	//   31   64:aload_0         
	//   32   65:invokevirtual   #104 <Method Resources Context.getResources()>
	//   33   68:astore_2        
		AttributeSet attributeset;
		obj = ((Object) (((Resources) (obj)).getXml(i)));
	//   34   69:aload_2         
	//   35   70:iload_1         
	//   36   71:invokevirtual   #139 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   37   74:astore_2        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (obj)));
	//   38   75:aload_2         
	//   39   76:invokestatic    #145 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   40   79:astore_3        
		do
			i = ((XmlPullParser) (obj)).next();
	//   41   80:aload_2         
	//   42   81:invokeinterface #151 <Method int XmlPullParser.next()>
	//   43   86:istore_1        
		while(i != 2 && i != 1);
	//   44   87:iload_1         
	//   45   88:iconst_2        
	//   46   89:icmpeq          100
	//   47   92:iload_1         
	//   48   93:iconst_1        
	//   49   94:icmpeq          100
	//*  50   97:goto            80
		if(i != 2)
			break MISSING_BLOCK_LABEL_120;
	//   51  100:iload_1         
	//   52  101:iconst_2        
	//   53  102:icmpne          120
		return createFromXmlInner(context, context.getResources(), ((XmlPullParser) (obj)), attributeset, context.getTheme());
	//   54  105:aload_0         
	//   55  106:aload_0         
	//   56  107:invokevirtual   #104 <Method Resources Context.getResources()>
	//   57  110:aload_2         
	//   58  111:aload_3         
	//   59  112:aload_0         
	//   60  113:invokevirtual   #108 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   61  116:invokestatic    #155 <Method AnimatedVectorDrawableCompat createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   62  119:areturn         
		throw new XmlPullParserException("No start tag found");
	//   63  120:new             #94  <Class XmlPullParserException>
	//   64  123:dup             
	//   65  124:ldc1            #157 <String "No start tag found">
	//   66  126:invokespecial   #160 <Method void XmlPullParserException(String)>
	//   67  129:athrow          
		context;
	//   68  130:astore_0        
		Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   69  131:ldc1            #26  <String "AnimatedVDCompat">
	//   70  133:ldc1            #162 <String "parser error">
	//   71  135:aload_0         
	//   72  136:invokestatic    #168 <Method int Log.e(String, String, Throwable)>
	//   73  139:pop             
		break MISSING_BLOCK_LABEL_153;
	//   74  140:goto            153
		context;
	//   75  143:astore_0        
		Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   76  144:ldc1            #26  <String "AnimatedVDCompat">
	//   77  146:ldc1            #162 <String "parser error">
	//   78  148:aload_0         
	//   79  149:invokestatic    #168 <Method int Log.e(String, String, Throwable)>
	//   80  152:pop             
		return null;
	//   81  153:aconst_null     
	//   82  154:areturn         
	}

	public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		context = ((Context) (new AnimatedVectorDrawableCompat(context)));
	//    0    0:new             #2   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #98  <Method void AnimatedVectorDrawableCompat(Context)>
	//    4    8:astore_0        
		((AnimatedVectorDrawableCompat) (context)).inflate(resources, xmlpullparser, attributeset, theme);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:invokevirtual   #173 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return ((AnimatedVectorDrawableCompat) (context));
	//   11   18:aload_0         
	//   12   19:areturn         
	}

	public static void registerAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		if(drawable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          43
		{
			if(animationcallback == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
				return;
	//    4    8:return          
			if(!(drawable instanceof Animatable))
	//*   5    9:aload_0         
	//*   6   10:instanceof      #77  <Class Animatable>
	//*   7   13:ifne            17
				return;
	//    8   16:return          
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   9   17:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          24
	//*  11   22:icmplt          34
			{
				registerPlatformCallback((AnimatedVectorDrawable)drawable, animationcallback);
	//   12   25:aload_0         
	//   13   26:checkcast       #85  <Class AnimatedVectorDrawable>
	//   14   29:aload_1         
	//   15   30:invokestatic    #180 <Method void registerPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
				return;
	//   16   33:return          
			} else
			{
				((AnimatedVectorDrawableCompat)drawable).registerAnimationCallback(animationcallback);
	//   17   34:aload_0         
	//   18   35:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #183 <Method void registerAnimationCallback(Animatable2Compat$AnimationCallback)>
				return;
	//   21   42:return          
			}
		} else
		{
			return;
	//   22   43:return          
		}
	}

	private static void registerPlatformCallback(AnimatedVectorDrawable animatedvectordrawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		animatedvectordrawable.registerAnimationCallback(animationcallback.getPlatformCallback());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #192 <Method android.graphics.drawable.Animatable2$AnimationCallback Animatable2Compat$AnimationCallback.getPlatformCallback()>
	//    3    5:invokevirtual   #195 <Method void AnimatedVectorDrawable.registerAnimationCallback(android.graphics.drawable.Animatable2$AnimationCallback)>
	//    4    8:return          
	}

	private void removeAnimatorSetListener()
	{
		if(mAnimatorListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//*   2    4:ifnull          26
		{
			mAnimatedVectorState.mAnimatorSet.removeListener(mAnimatorListener);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    5   11:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//    8   18:invokevirtual   #206 <Method void AnimatorSet.removeListener(android.animation.Animator$AnimatorListener)>
			mAnimatorListener = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
		}
	//   12   26:return          
	}

	private void setupAnimatorsForTarget(String s, Animator animator)
	{
		animator.setTarget(mAnimatedVectorState.mVectorDrawable.getTargetByName(s));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    3    5:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #218 <Method Object VectorDrawableCompat.getTargetByName(String)>
	//    6   12:invokevirtual   #224 <Method void Animator.setTarget(Object)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   7   15:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmpge          28
			setupColorAnimator(animator);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:invokespecial   #228 <Method void setupColorAnimator(Animator)>
		if(mAnimatedVectorState.mAnimators == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  15   32:getfield        #231 <Field ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimators>
	//*  16   35:ifnonnull       66
		{
			mAnimatedVectorState.mAnimators = new ArrayList();
	//   17   38:aload_0         
	//   18   39:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   19   42:new             #233 <Class ArrayList>
	//   20   45:dup             
	//   21   46:invokespecial   #234 <Method void ArrayList()>
	//   22   49:putfield        #231 <Field ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimators>
			mAnimatedVectorState.mTargetNameMap = new ArrayMap();
	//   23   52:aload_0         
	//   24   53:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   25   56:new             #236 <Class ArrayMap>
	//   26   59:dup             
	//   27   60:invokespecial   #237 <Method void ArrayMap()>
	//   28   63:putfield        #241 <Field ArrayMap AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mTargetNameMap>
		}
		mAnimatedVectorState.mAnimators.add(((Object) (animator)));
	//   29   66:aload_0         
	//   30   67:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   31   70:getfield        #231 <Field ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimators>
	//   32   73:aload_2         
	//   33   74:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
	//   34   77:pop             
		mAnimatedVectorState.mTargetNameMap.put(((Object) (animator)), ((Object) (s)));
	//   35   78:aload_0         
	//   36   79:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   37   82:getfield        #241 <Field ArrayMap AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mTargetNameMap>
	//   38   85:aload_2         
	//   39   86:aload_1         
	//   40   87:invokevirtual   #249 <Method Object ArrayMap.put(Object, Object)>
	//   41   90:pop             
	//   42   91:return          
	}

	private void setupColorAnimator(Animator animator)
	{
		if(animator instanceof AnimatorSet)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #202 <Class AnimatorSet>
	//*   2    4:ifeq            52
		{
			ArrayList arraylist = ((AnimatorSet)animator).getChildAnimations();
	//    3    7:aload_1         
	//    4    8:checkcast       #202 <Class AnimatorSet>
	//    5   11:invokevirtual   #253 <Method ArrayList AnimatorSet.getChildAnimations()>
	//    6   14:astore_3        
			if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
			{
				for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:aload_3         
	//*  13   23:invokeinterface #258 <Method int List.size()>
	//*  14   28:icmpge          52
					setupColorAnimator((Animator)((List) (arraylist)).get(i));
	//   15   31:aload_0         
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokeinterface #262 <Method Object List.get(int)>
	//   19   39:checkcast       #220 <Class Animator>
	//   20   42:invokespecial   #228 <Method void setupColorAnimator(Animator)>

	//   21   45:iload_2         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_2        
			}
		}
	//*  25   49:goto            21
		if(animator instanceof ObjectAnimator)
	//*  26   52:aload_1         
	//*  27   53:instanceof      #264 <Class ObjectAnimator>
	//*  28   56:ifeq            115
		{
			animator = ((Animator) ((ObjectAnimator)animator));
	//   29   59:aload_1         
	//   30   60:checkcast       #264 <Class ObjectAnimator>
	//   31   63:astore_1        
			String s = ((ObjectAnimator) (animator)).getPropertyName();
	//   32   64:aload_1         
	//   33   65:invokevirtual   #268 <Method String ObjectAnimator.getPropertyName()>
	//   34   68:astore_3        
			if("fillColor".equals(((Object) (s))) || "strokeColor".equals(((Object) (s))))
	//*  35   69:ldc2            #270 <String "fillColor">
	//*  36   72:aload_3         
	//*  37   73:invokevirtual   #275 <Method boolean String.equals(Object)>
	//*  38   76:ifne            89
	//*  39   79:ldc2            #277 <String "strokeColor">
	//*  40   82:aload_3         
	//*  41   83:invokevirtual   #275 <Method boolean String.equals(Object)>
	//*  42   86:ifeq            115
			{
				if(mArgbEvaluator == null)
	//*  43   89:aload_0         
	//*  44   90:getfield        #57  <Field ArgbEvaluator mArgbEvaluator>
	//*  45   93:ifnonnull       107
					mArgbEvaluator = new ArgbEvaluator();
	//   46   96:aload_0         
	//   47   97:new             #279 <Class ArgbEvaluator>
	//   48  100:dup             
	//   49  101:invokespecial   #280 <Method void ArgbEvaluator()>
	//   50  104:putfield        #57  <Field ArgbEvaluator mArgbEvaluator>
				((ObjectAnimator) (animator)).setEvaluator(((android.animation.TypeEvaluator) (mArgbEvaluator)));
	//   51  107:aload_1         
	//   52  108:aload_0         
	//   53  109:getfield        #57  <Field ArgbEvaluator mArgbEvaluator>
	//   54  112:invokevirtual   #284 <Method void ObjectAnimator.setEvaluator(android.animation.TypeEvaluator)>
			}
		}
	//   55  115:return          
	}

	public static boolean unregisterAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		if(drawable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          45
		{
			if(animationcallback == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
				return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
			if(!(drawable instanceof Animatable))
	//*   6   10:aload_0         
	//*   7   11:instanceof      #77  <Class Animatable>
	//*   8   14:ifne            19
				return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  11   19:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   22:bipush          24
	//*  13   24:icmplt          36
				return unregisterPlatformCallback((AnimatedVectorDrawable)drawable, animationcallback);
	//   14   27:aload_0         
	//   15   28:checkcast       #85  <Class AnimatedVectorDrawable>
	//   16   31:aload_1         
	//   17   32:invokestatic    #290 <Method boolean unregisterPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
	//   18   35:ireturn         
			else
				return ((AnimatedVectorDrawableCompat)drawable).unregisterAnimationCallback(animationcallback);
	//   19   36:aload_0         
	//   20   37:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   21   40:aload_1         
	//   22   41:invokevirtual   #293 <Method boolean unregisterAnimationCallback(Animatable2Compat$AnimationCallback)>
	//   23   44:ireturn         
		} else
		{
			return false;
	//   24   45:iconst_0        
	//   25   46:ireturn         
		}
	}

	private static boolean unregisterPlatformCallback(AnimatedVectorDrawable animatedvectordrawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		return animatedvectordrawable.unregisterAnimationCallback(animationcallback.getPlatformCallback());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #192 <Method android.graphics.drawable.Animatable2$AnimationCallback Animatable2Compat$AnimationCallback.getPlatformCallback()>
	//    3    5:invokevirtual   #296 <Method boolean AnimatedVectorDrawable.unregisterAnimationCallback(android.graphics.drawable.Animatable2$AnimationCallback)>
	//    4    8:ireturn         
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.applyTheme(mDelegateDrawable, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #303 <Method void DrawableCompat.applyTheme(Drawable, android.content.res.Resources$Theme)>
			return;
	//    7   15:return          
		} else
		{
			return;
	//    8   16:return          
		}
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #308 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void clearAnimationCallbacks()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).clearAnimationCallbacks();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #87  <Method void AnimatedVectorDrawable.clearAnimationCallbacks()>
			return;
	//    7   17:return          
		}
		removeAnimatorSetListener();
	//    8   18:aload_0         
	//    9   19:invokespecial   #310 <Method void removeAnimatorSetListener()>
		ArrayList arraylist = mAnimationCallbacks;
	//   10   22:aload_0         
	//   11   23:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   12   26:astore_1        
		if(arraylist == null)
	//*  13   27:aload_1         
	//*  14   28:ifnonnull       32
		{
			return;
	//   15   31:return          
		} else
		{
			arraylist.clear();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #313 <Method void ArrayList.clear()>
			return;
	//   18   36:return          
		}
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #316 <Method void VectorDrawableCommon.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #320 <Method void Drawable.draw(Canvas)>
			return;
	//    7   15:return          
		}
		mAnimatedVectorState.mVectorDrawable.draw(canvas);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #321 <Method void VectorDrawableCompat.draw(Canvas)>
		if(mAnimatedVectorState.mAnimatorSet.isStarted())
	//*  13   27:aload_0         
	//*  14   28:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  15   31:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//*  16   34:invokevirtual   #324 <Method boolean AnimatorSet.isStarted()>
	//*  17   37:ifeq            44
			invalidateSelf();
	//   18   40:aload_0         
	//   19   41:invokevirtual   #327 <Method void invalidateSelf()>
	//   20   44:return          
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #331 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #333 <Method int VectorDrawableCompat.getAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #336 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mAnimatedVectorState.mChangingConfigurations;
	//    7   15:aload_0         
	//    8   16:invokespecial   #337 <Method int VectorDrawableCommon.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   11   23:getfield        #340 <Field int AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mChangingConfigurations>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #344 <Method ColorFilter VectorDrawableCommon.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null && android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          30
	//*   3    7:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          24
	//*   5   12:icmplt          30
			return ((android.graphics.drawable.Drawable.ConstantState) (new AnimatedVectorDrawableDelegateState(mDelegateDrawable.getConstantState())));
	//    6   15:new             #15  <Class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:getfield        #118 <Field Drawable mDelegateDrawable>
	//   10   23:invokevirtual   #128 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   11   26:invokespecial   #131 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   12   29:areturn         
		else
			return null;
	//   13   30:aconst_null     
	//   14   31:areturn         
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #348 <Method Drawable VectorDrawableCommon.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #351 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #352 <Method int VectorDrawableCompat.getIntrinsicHeight()>
	//   11   25:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #355 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #356 <Method int VectorDrawableCompat.getIntrinsicWidth()>
	//   11   25:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method int VectorDrawableCommon.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #362 <Method int VectorDrawableCommon.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #365 <Method int Drawable.getOpacity()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getOpacity();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #366 <Method int VectorDrawableCompat.getOpacity()>
	//   11   25:ireturn         
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #370 <Method boolean VectorDrawableCommon.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #374 <Method int[] VectorDrawableCommon.getState()>
	//    2    4:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #378 <Method Region VectorDrawableCommon.getTransparentRegion()>
	//    2    4:areturn         
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		inflate(resources, xmlpullparser, attributeset, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #173 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6    8:return          
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #382 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		}
		int i = xmlpullparser.getEventType();
	//   11   20:aload_2         
	//   12   21:invokeinterface #385 <Method int XmlPullParser.getEventType()>
	//   13   26:istore          5
		for(int j = xmlpullparser.getDepth(); i != 1 && (xmlpullparser.getDepth() >= j + 1 || i != 3); i = xmlpullparser.next())
	//*  14   28:aload_2         
	//*  15   29:invokeinterface #388 <Method int XmlPullParser.getDepth()>
	//*  16   34:istore          6
	//*  17   36:iload           5
	//*  18   38:iconst_1        
	//*  19   39:icmpeq          275
	//*  20   42:aload_2         
	//*  21   43:invokeinterface #388 <Method int XmlPullParser.getDepth()>
	//*  22   48:iload           6
	//*  23   50:iconst_1        
	//*  24   51:iadd            
	//*  25   52:icmpge          61
	//*  26   55:iload           5
	//*  27   57:iconst_3        
	//*  28   58:icmpeq          275
		{
			if(i != 2)
				continue;
	//   29   61:iload           5
	//   30   63:iconst_2        
	//   31   64:icmpne          264
			Object obj = ((Object) (xmlpullparser.getName()));
	//   32   67:aload_2         
	//   33   68:invokeinterface #391 <Method String XmlPullParser.getName()>
	//   34   73:astore          7
			if("animated-vector".equals(obj))
	//*  35   75:ldc1            #20  <String "animated-vector">
	//*  36   77:aload           7
	//*  37   79:invokevirtual   #275 <Method boolean String.equals(Object)>
	//*  38   82:ifeq            174
			{
				obj = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE)));
	//   39   85:aload_1         
	//   40   86:aload           4
	//   41   88:aload_3         
	//   42   89:getstatic       #397 <Field int[] AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE>
	//   43   92:invokestatic    #403 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   44   95:astore          7
				i = ((TypedArray) (obj)).getResourceId(0, 0);
	//   45   97:aload           7
	//   46   99:iconst_0        
	//   47  100:iconst_0        
	//   48  101:invokevirtual   #409 <Method int TypedArray.getResourceId(int, int)>
	//   49  104:istore          5
				if(i != 0)
	//*  50  106:iload           5
	//*  51  108:ifeq            166
				{
					VectorDrawableCompat vectordrawablecompat = VectorDrawableCompat.create(resources, i, theme);
	//   52  111:aload_1         
	//   53  112:iload           5
	//   54  114:aload           4
	//   55  116:invokestatic    #412 <Method VectorDrawableCompat VectorDrawableCompat.create(Resources, int, android.content.res.Resources$Theme)>
	//   56  119:astore          8
					vectordrawablecompat.setAllowCaching(false);
	//   57  121:aload           8
	//   58  123:iconst_0        
	//   59  124:invokevirtual   #416 <Method void VectorDrawableCompat.setAllowCaching(boolean)>
					vectordrawablecompat.setCallback(mCallback);
	//   60  127:aload           8
	//   61  129:aload_0         
	//   62  130:getfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   63  133:invokevirtual   #417 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					if(mAnimatedVectorState.mVectorDrawable != null)
	//*  64  136:aload_0         
	//*  65  137:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  66  140:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//*  67  143:ifnull          157
						mAnimatedVectorState.mVectorDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   68  146:aload_0         
	//   69  147:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   70  150:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   71  153:aconst_null     
	//   72  154:invokevirtual   #417 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					mAnimatedVectorState.mVectorDrawable = vectordrawablecompat;
	//   73  157:aload_0         
	//   74  158:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   75  161:aload           8
	//   76  163:putfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
				}
				((TypedArray) (obj)).recycle();
	//   77  166:aload           7
	//   78  168:invokevirtual   #420 <Method void TypedArray.recycle()>
				continue;
	//   79  171:goto            264
			}
			if(!"target".equals(obj))
				continue;
	//   80  174:ldc1            #29  <String "target">
	//   81  176:aload           7
	//   82  178:invokevirtual   #275 <Method boolean String.equals(Object)>
	//   83  181:ifeq            264
			obj = ((Object) (resources.obtainAttributes(attributeset, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET)));
	//   84  184:aload_1         
	//   85  185:aload_3         
	//   86  186:getstatic       #423 <Field int[] AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET>
	//   87  189:invokevirtual   #426 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   88  192:astore          7
			String s = ((TypedArray) (obj)).getString(0);
	//   89  194:aload           7
	//   90  196:iconst_0        
	//   91  197:invokevirtual   #430 <Method String TypedArray.getString(int)>
	//   92  200:astore          8
			i = ((TypedArray) (obj)).getResourceId(1, 0);
	//   93  202:aload           7
	//   94  204:iconst_1        
	//   95  205:iconst_0        
	//   96  206:invokevirtual   #409 <Method int TypedArray.getResourceId(int, int)>
	//   97  209:istore          5
			if(i != 0)
	//*  98  211:iload           5
	//*  99  213:ifeq            259
			{
				Context context = mContext;
	//  100  216:aload_0         
	//  101  217:getfield        #68  <Field Context mContext>
	//  102  220:astore          9
				if(context != null)
	//* 103  222:aload           9
	//* 104  224:ifnull          243
				{
					setupAnimatorsForTarget(s, AnimatorInflaterCompat.loadAnimator(context, i));
	//  105  227:aload_0         
	//  106  228:aload           8
	//  107  230:aload           9
	//  108  232:iload           5
	//  109  234:invokestatic    #436 <Method Animator AnimatorInflaterCompat.loadAnimator(Context, int)>
	//  110  237:invokespecial   #438 <Method void setupAnimatorsForTarget(String, Animator)>
				} else
	//* 111  240:goto            259
				{
					((TypedArray) (obj)).recycle();
	//  112  243:aload           7
	//  113  245:invokevirtual   #420 <Method void TypedArray.recycle()>
					throw new IllegalStateException("Context can't be null when inflating animators");
	//  114  248:new             #440 <Class IllegalStateException>
	//  115  251:dup             
	//  116  252:ldc2            #442 <String "Context can't be null when inflating animators">
	//  117  255:invokespecial   #443 <Method void IllegalStateException(String)>
	//  118  258:athrow          
				}
			}
			((TypedArray) (obj)).recycle();
	//  119  259:aload           7
	//  120  261:invokevirtual   #420 <Method void TypedArray.recycle()>
		}

	//  121  264:aload_2         
	//  122  265:invokeinterface #151 <Method int XmlPullParser.next()>
	//  123  270:istore          5
	//* 124  272:goto            36
		mAnimatedVectorState.setupAnimatorSet();
	//  125  275:aload_0         
	//  126  276:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//  127  279:invokevirtual   #446 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.setupAnimatorSet()>
	//  128  282:return          
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #449 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #451 <Method boolean VectorDrawableCompat.isAutoMirrored()>
	//   11   25:ireturn         
	}

	public boolean isRunning()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
			return ((AnimatedVectorDrawable)mDelegateDrawable).isRunning();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #454 <Method boolean AnimatedVectorDrawable.isRunning()>
	//    7   17:ireturn         
		else
			return mAnimatedVectorState.mAnimatorSet.isRunning();
	//    8   18:aload_0         
	//    9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   22:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   11   25:invokevirtual   #455 <Method boolean AnimatorSet.isRunning()>
	//   12   28:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #458 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.isStateful();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #459 <Method boolean VectorDrawableCompat.isStateful()>
	//   11   25:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #462 <Method void VectorDrawableCommon.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #465 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
		return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #470 <Method void Drawable.setBounds(Rect)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setBounds(rect);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #471 <Method void VectorDrawableCompat.setBounds(Rect)>
			return;
	//   13   27:return          
		}
	}

	protected boolean onLevelChange(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setLevel(i);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #476 <Method boolean Drawable.setLevel(int)>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.setLevel(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #477 <Method boolean VectorDrawableCompat.setLevel(int)>
	//   13   27:ireturn         
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #482 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.setState(ai);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #483 <Method boolean VectorDrawableCompat.setState(int[])>
	//   13   27:ireturn         
	}

	public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationcallback)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          19
		{
			registerPlatformCallback((AnimatedVectorDrawable)mDelegateDrawable, animationcallback);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:aload_1         
	//    7   15:invokestatic    #180 <Method void registerPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
			return;
	//    8   18:return          
		}
		if(animationcallback == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       24
			return;
	//   11   23:return          
		if(mAnimationCallbacks == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  14   28:ifnonnull       42
			mAnimationCallbacks = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #233 <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #234 <Method void ArrayList()>
	//   19   39:putfield        #61  <Field ArrayList mAnimationCallbacks>
		if(mAnimationCallbacks.contains(((Object) (animationcallback))))
	//*  20   42:aload_0         
	//*  21   43:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #486 <Method boolean ArrayList.contains(Object)>
	//*  24   50:ifeq            54
			return;
	//   25   53:return          
		mAnimationCallbacks.add(((Object) (animationcallback)));
	//   26   54:aload_0         
	//   27   55:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #245 <Method boolean ArrayList.add(Object)>
	//   30   62:pop             
		if(mAnimatorListener == null)
	//*  31   63:aload_0         
	//*  32   64:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//*  33   67:ifnonnull       82
			mAnimatorListener = ((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					animator = ((Animator) (new ArrayList(((java.util.Collection) (mAnimationCallbacks)))));
				//    0    0:new             #23  <Class ArrayList>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
				//    4    8:getfield        #27  <Field ArrayList AnimatedVectorDrawableCompat.mAnimationCallbacks>
				//    5   11:invokespecial   #30  <Method void ArrayList(java.util.Collection)>
				//    6   14:astore_1        
					int j = ((ArrayList) (animator)).size();
				//    7   15:aload_1         
				//    8   16:invokevirtual   #34  <Method int ArrayList.size()>
				//    9   19:istore_3        
					for(int i = 0; i < j; i++)
				//*  10   20:iconst_0        
				//*  11   21:istore_2        
				//*  12   22:iload_2         
				//*  13   23:iload_3         
				//*  14   24:icmpge          49
						((Animatable2Compat.AnimationCallback)((ArrayList) (animator)).get(i)).onAnimationEnd(((Drawable) (AnimatedVectorDrawableCompat.this)));
				//   15   27:aload_1         
				//   16   28:iload_2         
				//   17   29:invokevirtual   #38  <Method Object ArrayList.get(int)>
				//   18   32:checkcast       #40  <Class Animatable2Compat$AnimationCallback>
				//   19   35:aload_0         
				//   20   36:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
				//   21   39:invokevirtual   #43  <Method void Animatable2Compat$AnimationCallback.onAnimationEnd(Drawable)>

				//   22   42:iload_2         
				//   23   43:iconst_1        
				//   24   44:iadd            
				//   25   45:istore_2        
				//*  26   46:goto            22
				//   27   49:return          
				}

				public void onAnimationStart(Animator animator)
				{
					animator = ((Animator) (new ArrayList(((java.util.Collection) (mAnimationCallbacks)))));
				//    0    0:new             #23  <Class ArrayList>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
				//    4    8:getfield        #27  <Field ArrayList AnimatedVectorDrawableCompat.mAnimationCallbacks>
				//    5   11:invokespecial   #30  <Method void ArrayList(java.util.Collection)>
				//    6   14:astore_1        
					int j = ((ArrayList) (animator)).size();
				//    7   15:aload_1         
				//    8   16:invokevirtual   #34  <Method int ArrayList.size()>
				//    9   19:istore_3        
					for(int i = 0; i < j; i++)
				//*  10   20:iconst_0        
				//*  11   21:istore_2        
				//*  12   22:iload_2         
				//*  13   23:iload_3         
				//*  14   24:icmpge          49
						((Animatable2Compat.AnimationCallback)((ArrayList) (animator)).get(i)).onAnimationStart(((Drawable) (AnimatedVectorDrawableCompat.this)));
				//   15   27:aload_1         
				//   16   28:iload_2         
				//   17   29:invokevirtual   #38  <Method Object ArrayList.get(int)>
				//   18   32:checkcast       #40  <Class Animatable2Compat$AnimationCallback>
				//   19   35:aload_0         
				//   20   36:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
				//   21   39:invokevirtual   #46  <Method void Animatable2Compat$AnimationCallback.onAnimationStart(Drawable)>

				//   22   42:iload_2         
				//   23   43:iconst_1        
				//   24   44:iadd            
				//   25   45:istore_2        
				//*  26   46:goto            22
				//   27   49:return          
				}

				final AnimatedVectorDrawableCompat this$0;

			
			{
				this$0 = AnimatedVectorDrawableCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AnimatedVectorDrawableCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
));
	//   34   70:aload_0         
	//   35   71:new             #10  <Class AnimatedVectorDrawableCompat$2>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #487 <Method void AnimatedVectorDrawableCompat$2(AnimatedVectorDrawableCompat)>
	//   39   79:putfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
		mAnimatedVectorState.mAnimatorSet.addListener(mAnimatorListener);
	//   40   82:aload_0         
	//   41   83:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   42   86:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   43   89:aload_0         
	//   44   90:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//   45   93:invokevirtual   #490 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
	//   46   96:return          
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #494 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setAlpha(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #495 <Method void VectorDrawableCompat.setAlpha(int)>
			return;
	//   13   27:return          
		}
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setAutoMirrored(mDelegateDrawable, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #499 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setAutoMirrored(flag);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #501 <Method void VectorDrawableCompat.setAutoMirrored(boolean)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #504 <Method void VectorDrawableCommon.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #508 <Method void VectorDrawableCommon.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #511 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setColorFilter(colorfilter);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #512 <Method void VectorDrawableCompat.setColorFilter(ColorFilter)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #515 <Method void VectorDrawableCommon.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #519 <Method void VectorDrawableCommon.setHotspot(float, float)>
	//    4    6:return          
	}

	public volatile void setHotspotBounds(int i, int j, int k, int l)
	{
		super.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #523 <Method void VectorDrawableCommon.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #524 <Method boolean VectorDrawableCommon.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #528 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTint(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #530 <Method void VectorDrawableCompat.setTint(int)>
			return;
	//   13   27:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #535 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTintList(colorstatelist);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #537 <Method void VectorDrawableCompat.setTintList(ColorStateList)>
			return;
	//   13   27:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #542 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTintMode(mode);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #544 <Method void VectorDrawableCompat.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   13   27:return          
		}
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #548 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   11   21:getfield        #212 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #549 <Method boolean VectorDrawableCompat.setVisible(boolean, boolean)>
	//   15   29:pop             
			return super.setVisible(flag, flag1);
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokespecial   #550 <Method boolean VectorDrawableCommon.setVisible(boolean, boolean)>
	//   20   36:ireturn         
		}
	}

	public void start()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).start();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #553 <Method void AnimatedVectorDrawable.start()>
			return;
	//    7   17:return          
		}
		if(mAnimatedVectorState.mAnimatorSet.isStarted())
	//*   8   18:aload_0         
	//*   9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  10   22:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//*  11   25:invokevirtual   #324 <Method boolean AnimatorSet.isStarted()>
	//*  12   28:ifeq            32
		{
			return;
	//   13   31:return          
		} else
		{
			mAnimatedVectorState.mAnimatorSet.start();
	//   14   32:aload_0         
	//   15   33:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   16   36:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   17   39:invokevirtual   #554 <Method void AnimatorSet.start()>
			invalidateSelf();
	//   18   42:aload_0         
	//   19   43:invokevirtual   #327 <Method void invalidateSelf()>
			return;
	//   20   46:return          
		}
	}

	public void stop()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).stop();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #557 <Method void AnimatedVectorDrawable.stop()>
			return;
	//    7   17:return          
		} else
		{
			mAnimatedVectorState.mAnimatorSet.end();
	//    8   18:aload_0         
	//    9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   22:getfield        #200 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   11   25:invokevirtual   #560 <Method void AnimatorSet.end()>
			return;
	//   12   28:return          
		}
	}

	public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationcallback)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          19
			unregisterPlatformCallback((AnimatedVectorDrawable)mDelegateDrawable, animationcallback);
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #85  <Class AnimatedVectorDrawable>
	//    6   14:aload_1         
	//    7   15:invokestatic    #290 <Method boolean unregisterPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
	//    8   18:pop             
		ArrayList arraylist = mAnimationCallbacks;
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   11   23:astore_3        
		if(arraylist != null && animationcallback != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          57
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       35
	//*  16   32:goto            57
		{
			boolean flag = arraylist.remove(((Object) (animationcallback)));
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #563 <Method boolean ArrayList.remove(Object)>
	//   20   40:istore_2        
			if(mAnimationCallbacks.size() == 0)
	//*  21   41:aload_0         
	//*  22   42:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  23   45:invokevirtual   #564 <Method int ArrayList.size()>
	//*  24   48:ifne            55
				removeAnimatorSetListener();
	//   25   51:aload_0         
	//   26   52:invokespecial   #310 <Method void removeAnimatorSetListener()>
			return flag;
	//   27   55:iload_2         
	//   28   56:ireturn         
		} else
		{
			return false;
	//   29   57:iconst_0        
	//   30   58:ireturn         
		}
	}

	private static final String ANIMATED_VECTOR = "animated-vector";
	private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
	private static final String LOGTAG = "AnimatedVDCompat";
	private static final String TARGET = "target";
	private AnimatedVectorDrawableCompatState mAnimatedVectorState;
	ArrayList mAnimationCallbacks;
	private android.animation.Animator.AnimatorListener mAnimatorListener;
	private ArgbEvaluator mArgbEvaluator;
	AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
	final android.graphics.drawable.Drawable.Callback mCallback;
	private Context mContext;
}
