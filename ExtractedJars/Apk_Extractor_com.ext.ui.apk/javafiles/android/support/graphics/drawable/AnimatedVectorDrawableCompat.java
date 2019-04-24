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
		//    0    0:new             #118 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #120 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #123 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public Drawable newDrawable(Resources resources)
		{
			throw new IllegalStateException("No constant state support for SDK < 24.");
		//    0    0:new             #118 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #120 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #123 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public void setupAnimatorSet()
		{
			if(mAnimatorSet == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #125 <Field AnimatorSet mAnimatorSet>
		//*   2    4:ifnonnull       18
				mAnimatorSet = new AnimatorSet();
		//    3    7:aload_0         
		//    4    8:new             #127 <Class AnimatorSet>
		//    5   11:dup             
		//    6   12:invokespecial   #128 <Method void AnimatorSet()>
		//    7   15:putfield        #125 <Field AnimatorSet mAnimatorSet>
			mAnimatorSet.playTogether(((java.util.Collection) (mAnimators)));
		//    8   18:aload_0         
		//    9   19:getfield        #125 <Field AnimatorSet mAnimatorSet>
		//   10   22:aload_0         
		//   11   23:getfield        #60  <Field ArrayList mAnimators>
		//   12   26:invokevirtual   #132 <Method void AnimatorSet.playTogether(java.util.Collection)>
		//   13   29:return          
		}

		AnimatorSet mAnimatorSet;
		private ArrayList mAnimators;
		int mChangingConfigurations;
		ArrayMap mTargetNameMap;
		VectorDrawableCompat mVectorDrawable;


/*
		static ArrayList access$000(AnimatedVectorDrawableCompatState animatedvectordrawablecompatstate)
		{
			return animatedvectordrawablecompatstate.mAnimators;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field ArrayList mAnimators>
		//    2    4:areturn         
		}

*/


/*
		static ArrayList access$002(AnimatedVectorDrawableCompatState animatedvectordrawablecompatstate, ArrayList arraylist)
		{
			animatedvectordrawablecompatstate.mAnimators = arraylist;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #60  <Field ArrayList mAnimators>
			return arraylist;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		public AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompatState animatedvectordrawablecompatstate, android.graphics.drawable.Drawable.Callback callback, Resources resources)
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore          5
			super();
		//    2    3:aload_0         
		//    3    4:invokespecial   #24  <Method void android.graphics.drawable.Drawable$ConstantState()>
			if(animatedvectordrawablecompatstate != null)
		//*   4    7:aload_2         
		//*   5    8:ifnull          233
			{
				mChangingConfigurations = animatedvectordrawablecompatstate.mChangingConfigurations;
		//    6   11:aload_0         
		//    7   12:aload_2         
		//    8   13:getfield        #26  <Field int mChangingConfigurations>
		//    9   16:putfield        #26  <Field int mChangingConfigurations>
				if(animatedvectordrawablecompatstate.mVectorDrawable != null)
		//*  10   19:aload_2         
		//*  11   20:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  12   23:ifnull          96
				{
					context = ((Context) (animatedvectordrawablecompatstate.mVectorDrawable.getConstantState()));
		//   13   26:aload_2         
		//   14   27:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//   15   30:invokevirtual   #34  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
		//   16   33:astore_1        
					int j;
					if(resources != null)
		//*  17   34:aload           4
		//*  18   36:ifnull          215
						mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
		//   19   39:aload_0         
		//   20   40:aload_1         
		//   21   41:aload           4
		//   22   43:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//   23   46:checkcast       #30  <Class VectorDrawableCompat>
		//   24   49:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
					else
		//*  25   52:aload_0         
		//*  26   53:aload_0         
		//*  27   54:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  28   57:invokevirtual   #42  <Method Drawable VectorDrawableCompat.mutate()>
		//*  29   60:checkcast       #30  <Class VectorDrawableCompat>
		//*  30   63:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  31   66:aload_0         
		//*  32   67:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  33   70:aload_3         
		//*  34   71:invokevirtual   #46  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
		//*  35   74:aload_0         
		//*  36   75:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  37   78:aload_2         
		//*  38   79:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  39   82:invokevirtual   #50  <Method Rect VectorDrawableCompat.getBounds()>
		//*  40   85:invokevirtual   #54  <Method void VectorDrawableCompat.setBounds(Rect)>
		//*  41   88:aload_0         
		//*  42   89:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  43   92:iconst_0        
		//*  44   93:invokevirtual   #58  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
		//*  45   96:aload_2         
		//*  46   97:getfield        #60  <Field ArrayList mAnimators>
		//*  47  100:ifnull          233
		//*  48  103:aload_2         
		//*  49  104:getfield        #60  <Field ArrayList mAnimators>
		//*  50  107:invokevirtual   #66  <Method int ArrayList.size()>
		//*  51  110:istore          6
		//*  52  112:aload_0         
		//*  53  113:new             #62  <Class ArrayList>
		//*  54  116:dup             
		//*  55  117:iload           6
		//*  56  119:invokespecial   #69  <Method void ArrayList(int)>
		//*  57  122:putfield        #60  <Field ArrayList mAnimators>
		//*  58  125:aload_0         
		//*  59  126:new             #71  <Class ArrayMap>
		//*  60  129:dup             
		//*  61  130:iload           6
		//*  62  132:invokespecial   #72  <Method void ArrayMap(int)>
		//*  63  135:putfield        #74  <Field ArrayMap mTargetNameMap>
		//*  64  138:iload           5
		//*  65  140:iload           6
		//*  66  142:icmpge          229
		//*  67  145:aload_2         
		//*  68  146:getfield        #60  <Field ArrayList mAnimators>
		//*  69  149:iload           5
		//*  70  151:invokevirtual   #78  <Method Object ArrayList.get(int)>
		//*  71  154:checkcast       #80  <Class Animator>
		//*  72  157:astore_3        
		//*  73  158:aload_3         
		//*  74  159:invokevirtual   #84  <Method Animator Animator.clone()>
		//*  75  162:astore_1        
		//*  76  163:aload_2         
		//*  77  164:getfield        #74  <Field ArrayMap mTargetNameMap>
		//*  78  167:aload_3         
		//*  79  168:invokevirtual   #87  <Method Object ArrayMap.get(Object)>
		//*  80  171:checkcast       #89  <Class String>
		//*  81  174:astore_3        
		//*  82  175:aload_1         
		//*  83  176:aload_0         
		//*  84  177:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
		//*  85  180:aload_3         
		//*  86  181:invokevirtual   #93  <Method Object VectorDrawableCompat.getTargetByName(String)>
		//*  87  184:invokevirtual   #97  <Method void Animator.setTarget(Object)>
		//*  88  187:aload_0         
		//*  89  188:getfield        #60  <Field ArrayList mAnimators>
		//*  90  191:aload_1         
		//*  91  192:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
		//*  92  195:pop             
		//*  93  196:aload_0         
		//*  94  197:getfield        #74  <Field ArrayMap mTargetNameMap>
		//*  95  200:aload_1         
		//*  96  201:aload_3         
		//*  97  202:invokevirtual   #105 <Method Object ArrayMap.put(Object, Object)>
		//*  98  205:pop             
		//*  99  206:iload           5
		//* 100  208:iconst_1        
		//* 101  209:iadd            
		//* 102  210:istore          5
		//* 103  212:goto            138
						mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable();
		//  104  215:aload_0         
		//  105  216:aload_1         
		//  106  217:invokevirtual   #107 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//  107  220:checkcast       #30  <Class VectorDrawableCompat>
		//  108  223:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
					mVectorDrawable = (VectorDrawableCompat)mVectorDrawable.mutate();
					mVectorDrawable.setCallback(callback);
					mVectorDrawable.setBounds(animatedvectordrawablecompatstate.mVectorDrawable.getBounds());
					mVectorDrawable.setAllowCaching(false);
				}
				if(animatedvectordrawablecompatstate.mAnimators != null)
				{
					j = animatedvectordrawablecompatstate.mAnimators.size();
					mAnimators = new ArrayList(j);
					mTargetNameMap = new ArrayMap(j);
					for(; i < j; i++)
					{
						callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompatstate.mAnimators.get(i)));
						context = ((Context) (((Animator) (callback)).clone()));
						callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompatstate.mTargetNameMap.get(((Object) (callback)))));
						((Animator) (context)).setTarget(mVectorDrawable.getTargetByName(((String) (callback))));
						mAnimators.add(((Object) (context)));
						mTargetNameMap.put(((Object) (context)), ((Object) (callback)));
					}

		//* 109  226:goto            52
					setupAnimatorSet();
		//  110  229:aload_0         
		//  111  230:invokevirtual   #110 <Method void setupAnimatorSet()>
				}
			}
		//  112  233:return          
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
		if(drawable == null || !(drawable instanceof Animatable))
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:instanceof      #79  <Class Animatable>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   6   12:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          24
	//*   8   17:icmplt          28
		{
			((AnimatedVectorDrawable)drawable).clearAnimationCallbacks();
	//    9   20:aload_0         
	//   10   21:checkcast       #87  <Class AnimatedVectorDrawable>
	//   11   24:invokevirtual   #89  <Method void AnimatedVectorDrawable.clearAnimationCallbacks()>
			return;
	//   12   27:return          
		} else
		{
			((AnimatedVectorDrawableCompat)drawable).clearAnimationCallbacks();
	//   13   28:aload_0         
	//   14   29:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   15   32:invokevirtual   #90  <Method void clearAnimationCallbacks()>
			return;
	//   16   35:return          
		}
	}

	public static AnimatedVectorDrawableCompat create(Context context, int i)
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          64
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat(context);
	//    3    8:new             #2   <Class AnimatedVectorDrawableCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #100 <Method void AnimatedVectorDrawableCompat(Context)>
	//    7   16:astore_2        
			animatedvectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
	//    8   17:aload_2         
	//    9   18:aload_0         
	//   10   19:invokevirtual   #106 <Method Resources Context.getResources()>
	//   11   22:iload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #110 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   14   27:invokestatic    #116 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   15   30:putfield        #120 <Field Drawable mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//   16   33:aload_2         
	//   17   34:getfield        #120 <Field Drawable mDelegateDrawable>
	//   18   37:aload_2         
	//   19   38:getfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   20   41:invokevirtual   #126 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			animatedvectordrawablecompat.mCachedConstantStateDelegate = new AnimatedVectorDrawableDelegateState(animatedvectordrawablecompat.mDelegateDrawable.getConstantState());
	//   21   44:aload_2         
	//   22   45:new             #15  <Class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState>
	//   23   48:dup             
	//   24   49:aload_2         
	//   25   50:getfield        #120 <Field Drawable mDelegateDrawable>
	//   26   53:invokevirtual   #130 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   27   56:invokespecial   #133 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
	//   28   59:putfield        #135 <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate>
			return animatedvectordrawablecompat;
	//   29   62:aload_2         
	//   30   63:areturn         
		}
		obj = ((Object) (context.getResources()));
	//   31   64:aload_0         
	//   32   65:invokevirtual   #106 <Method Resources Context.getResources()>
	//   33   68:astore_2        
		AttributeSet attributeset;
		obj = ((Object) (((Resources) (obj)).getXml(i)));
	//   34   69:aload_2         
	//   35   70:iload_1         
	//   36   71:invokevirtual   #141 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   37   74:astore_2        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (obj)));
	//   38   75:aload_2         
	//   39   76:invokestatic    #147 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   40   79:astore_3        
		do
			i = ((XmlPullParser) (obj)).next();
	//   41   80:aload_2         
	//   42   81:invokeinterface #153 <Method int XmlPullParser.next()>
	//   43   86:istore_1        
		while(i != 2 && i != 1);
	//   44   87:iload_1         
	//   45   88:iconst_2        
	//   46   89:icmpeq          97
	//   47   92:iload_1         
	//   48   93:iconst_1        
	//   49   94:icmpne          80
		if(i != 2)
	//*  50   97:iload_1         
	//*  51   98:iconst_2        
	//*  52   99:icmpeq          124
		{
			try
			{
				throw new XmlPullParserException("No start tag found");
	//   53  102:new             #96  <Class XmlPullParserException>
	//   54  105:dup             
	//   55  106:ldc1            #155 <String "No start tag found">
	//   56  108:invokespecial   #158 <Method void XmlPullParserException(String)>
	//   57  111:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  58  112:astore_0        
			{
				Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   59  113:ldc1            #26  <String "AnimatedVDCompat">
	//   60  115:ldc1            #160 <String "parser error">
	//   61  117:aload_0         
	//   62  118:invokestatic    #166 <Method int Log.e(String, String, Throwable)>
	//   63  121:pop             
			}
	//*  64  122:aconst_null     
	//*  65  123:areturn         
	//*  66  124:aload_0         
	//*  67  125:aload_0         
	//*  68  126:invokevirtual   #106 <Method Resources Context.getResources()>
	//*  69  129:aload_2         
	//*  70  130:aload_3         
	//*  71  131:aload_0         
	//*  72  132:invokevirtual   #110 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  73  135:invokestatic    #170 <Method AnimatedVectorDrawableCompat createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//*  74  138:astore_0        
	//*  75  139:aload_0         
	//*  76  140:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  77  141:astore_0        
			{
				Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   78  142:ldc1            #26  <String "AnimatedVDCompat">
	//   79  144:ldc1            #160 <String "parser error">
	//   80  146:aload_0         
	//   81  147:invokestatic    #166 <Method int Log.e(String, String, Throwable)>
	//   82  150:pop             
			}
			return null;
		}
		context = ((Context) (createFromXmlInner(context, context.getResources(), ((XmlPullParser) (obj)), attributeset, context.getTheme())));
		return ((AnimatedVectorDrawableCompat) (context));
	//*  83  151:goto            122
	}

	public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		context = ((Context) (new AnimatedVectorDrawableCompat(context)));
	//    0    0:new             #2   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #100 <Method void AnimatedVectorDrawableCompat(Context)>
	//    4    8:astore_0        
		((AnimatedVectorDrawableCompat) (context)).inflate(resources, xmlpullparser, attributeset, theme);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:invokevirtual   #175 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return ((AnimatedVectorDrawableCompat) (context));
	//   11   18:aload_0         
	//   12   19:areturn         
	}

	public static void registerAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		while(drawable == null || animationcallback == null || !(drawable instanceof Animatable)) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
	//    5    9:aload_0         
	//    6   10:instanceof      #79  <Class Animatable>
	//    7   13:ifeq            8
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   8   16:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          24
	//*  10   21:icmplt          33
		{
			registerPlatformCallback((AnimatedVectorDrawable)drawable, animationcallback);
	//   11   24:aload_0         
	//   12   25:checkcast       #87  <Class AnimatedVectorDrawable>
	//   13   28:aload_1         
	//   14   29:invokestatic    #182 <Method void registerPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
			return;
	//   15   32:return          
		} else
		{
			((AnimatedVectorDrawableCompat)drawable).registerAnimationCallback(animationcallback);
	//   16   33:aload_0         
	//   17   34:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #185 <Method void registerAnimationCallback(Animatable2Compat$AnimationCallback)>
			return;
	//   20   41:return          
		}
	}

	private static void registerPlatformCallback(AnimatedVectorDrawable animatedvectordrawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		animatedvectordrawable.registerAnimationCallback(animationcallback.getPlatformCallback());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method android.graphics.drawable.Animatable2$AnimationCallback Animatable2Compat$AnimationCallback.getPlatformCallback()>
	//    3    5:invokevirtual   #197 <Method void AnimatedVectorDrawable.registerAnimationCallback(android.graphics.drawable.Animatable2$AnimationCallback)>
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
	//    5   11:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//    8   18:invokevirtual   #208 <Method void AnimatorSet.removeListener(android.animation.Animator$AnimatorListener)>
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
	//    3    5:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #220 <Method Object VectorDrawableCompat.getTargetByName(String)>
	//    6   12:invokevirtual   #226 <Method void Animator.setTarget(Object)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   7   15:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmpge          28
			setupColorAnimator(animator);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:invokespecial   #230 <Method void setupColorAnimator(Animator)>
		if(mAnimatedVectorState.mAnimators == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  15   32:invokestatic    #234 <Method ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.access$000(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState)>
	//*  16   35:ifnonnull       67
		{
			mAnimatedVectorState.mAnimators = new ArrayList();
	//   17   38:aload_0         
	//   18   39:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   19   42:new             #236 <Class ArrayList>
	//   20   45:dup             
	//   21   46:invokespecial   #237 <Method void ArrayList()>
	//   22   49:invokestatic    #241 <Method ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.access$002(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState, ArrayList)>
	//   23   52:pop             
			mAnimatedVectorState.mTargetNameMap = new ArrayMap();
	//   24   53:aload_0         
	//   25   54:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   26   57:new             #243 <Class ArrayMap>
	//   27   60:dup             
	//   28   61:invokespecial   #244 <Method void ArrayMap()>
	//   29   64:putfield        #248 <Field ArrayMap AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mTargetNameMap>
		}
		mAnimatedVectorState.mAnimators.add(((Object) (animator)));
	//   30   67:aload_0         
	//   31   68:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   32   71:invokestatic    #234 <Method ArrayList AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.access$000(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState)>
	//   33   74:aload_2         
	//   34   75:invokevirtual   #252 <Method boolean ArrayList.add(Object)>
	//   35   78:pop             
		mAnimatedVectorState.mTargetNameMap.put(((Object) (animator)), ((Object) (s)));
	//   36   79:aload_0         
	//   37   80:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   38   83:getfield        #248 <Field ArrayMap AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mTargetNameMap>
	//   39   86:aload_2         
	//   40   87:aload_1         
	//   41   88:invokevirtual   #256 <Method Object ArrayMap.put(Object, Object)>
	//   42   91:pop             
	//   43   92:return          
	}

	private void setupColorAnimator(Animator animator)
	{
		if(animator instanceof AnimatorSet)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #204 <Class AnimatorSet>
	//*   2    4:ifeq            52
		{
			ArrayList arraylist = ((AnimatorSet)animator).getChildAnimations();
	//    3    7:aload_1         
	//    4    8:checkcast       #204 <Class AnimatorSet>
	//    5   11:invokevirtual   #260 <Method ArrayList AnimatorSet.getChildAnimations()>
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
	//*  13   23:invokeinterface #265 <Method int List.size()>
	//*  14   28:icmpge          52
					setupColorAnimator((Animator)((List) (arraylist)).get(i));
	//   15   31:aload_0         
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokeinterface #269 <Method Object List.get(int)>
	//   19   39:checkcast       #222 <Class Animator>
	//   20   42:invokespecial   #230 <Method void setupColorAnimator(Animator)>

	//   21   45:iload_2         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_2        
			}
		}
	//*  25   49:goto            21
		if(animator instanceof ObjectAnimator)
	//*  26   52:aload_1         
	//*  27   53:instanceof      #271 <Class ObjectAnimator>
	//*  28   56:ifeq            115
		{
			animator = ((Animator) ((ObjectAnimator)animator));
	//   29   59:aload_1         
	//   30   60:checkcast       #271 <Class ObjectAnimator>
	//   31   63:astore_1        
			String s = ((ObjectAnimator) (animator)).getPropertyName();
	//   32   64:aload_1         
	//   33   65:invokevirtual   #275 <Method String ObjectAnimator.getPropertyName()>
	//   34   68:astore_3        
			if("fillColor".equals(((Object) (s))) || "strokeColor".equals(((Object) (s))))
	//*  35   69:ldc2            #277 <String "fillColor">
	//*  36   72:aload_3         
	//*  37   73:invokevirtual   #282 <Method boolean String.equals(Object)>
	//*  38   76:ifne            89
	//*  39   79:ldc2            #284 <String "strokeColor">
	//*  40   82:aload_3         
	//*  41   83:invokevirtual   #282 <Method boolean String.equals(Object)>
	//*  42   86:ifeq            115
			{
				if(mArgbEvaluator == null)
	//*  43   89:aload_0         
	//*  44   90:getfield        #57  <Field ArgbEvaluator mArgbEvaluator>
	//*  45   93:ifnonnull       107
					mArgbEvaluator = new ArgbEvaluator();
	//   46   96:aload_0         
	//   47   97:new             #286 <Class ArgbEvaluator>
	//   48  100:dup             
	//   49  101:invokespecial   #287 <Method void ArgbEvaluator()>
	//   50  104:putfield        #57  <Field ArgbEvaluator mArgbEvaluator>
				((ObjectAnimator) (animator)).setEvaluator(((android.animation.TypeEvaluator) (mArgbEvaluator)));
	//   51  107:aload_1         
	//   52  108:aload_0         
	//   53  109:getfield        #57  <Field ArgbEvaluator mArgbEvaluator>
	//   54  112:invokevirtual   #291 <Method void ObjectAnimator.setEvaluator(android.animation.TypeEvaluator)>
			}
		}
	//   55  115:return          
	}

	public static boolean unregisterAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		while(drawable == null || animationcallback == null || !(drawable instanceof Animatable)) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:instanceof      #79  <Class Animatable>
	//    8   14:ifeq            8
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   9   17:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          24
	//*  11   22:icmplt          34
			return unregisterPlatformCallback((AnimatedVectorDrawable)drawable, animationcallback);
	//   12   25:aload_0         
	//   13   26:checkcast       #87  <Class AnimatedVectorDrawable>
	//   14   29:aload_1         
	//   15   30:invokestatic    #297 <Method boolean unregisterPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
	//   16   33:ireturn         
		else
			return ((AnimatedVectorDrawableCompat)drawable).unregisterAnimationCallback(animationcallback);
	//   17   34:aload_0         
	//   18   35:checkcast       #2   <Class AnimatedVectorDrawableCompat>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #300 <Method boolean unregisterAnimationCallback(Animatable2Compat$AnimationCallback)>
	//   21   42:ireturn         
	}

	private static boolean unregisterPlatformCallback(AnimatedVectorDrawable animatedvectordrawable, Animatable2Compat.AnimationCallback animationcallback)
	{
		return animatedvectordrawable.unregisterAnimationCallback(animationcallback.getPlatformCallback());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method android.graphics.drawable.Animatable2$AnimationCallback Animatable2Compat$AnimationCallback.getPlatformCallback()>
	//    3    5:invokevirtual   #303 <Method boolean AnimatedVectorDrawable.unregisterAnimationCallback(android.graphics.drawable.Animatable2$AnimationCallback)>
	//    4    8:ireturn         
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.applyTheme(mDelegateDrawable, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #310 <Method void DrawableCompat.applyTheme(Drawable, android.content.res.Resources$Theme)>
	//    7   15:return          
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #315 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
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
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).clearAnimationCallbacks();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #89  <Method void AnimatedVectorDrawable.clearAnimationCallbacks()>
		} else
	//*   7   17:return          
		{
			removeAnimatorSetListener();
	//    8   18:aload_0         
	//    9   19:invokespecial   #317 <Method void removeAnimatorSetListener()>
			if(mAnimationCallbacks != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  12   26:ifnull          17
			{
				mAnimationCallbacks.clear();
	//   13   29:aload_0         
	//   14   30:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   15   33:invokevirtual   #320 <Method void ArrayList.clear()>
				return;
	//   16   36:return          
			}
		}
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method void VectorDrawableCommon.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #327 <Method void Drawable.draw(Canvas)>
		} else
	//*   7   15:return          
		{
			mAnimatedVectorState.mVectorDrawable.draw(canvas);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #328 <Method void VectorDrawableCompat.draw(Canvas)>
			if(mAnimatedVectorState.mAnimatorSet.isStarted())
	//*  13   27:aload_0         
	//*  14   28:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  15   31:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//*  16   34:invokevirtual   #331 <Method boolean AnimatorSet.isStarted()>
	//*  17   37:ifeq            15
			{
				invalidateSelf();
	//   18   40:aload_0         
	//   19   41:invokevirtual   #334 <Method void invalidateSelf()>
				return;
	//   20   44:return          
			}
		}
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #338 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #340 <Method int VectorDrawableCompat.getAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #343 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mAnimatedVectorState.mChangingConfigurations;
	//    7   15:aload_0         
	//    8   16:invokespecial   #344 <Method int VectorDrawableCommon.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   11   23:getfield        #347 <Field int AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mChangingConfigurations>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #351 <Method ColorFilter VectorDrawableCommon.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null && android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          30
	//*   3    7:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          24
	//*   5   12:icmplt          30
			return ((android.graphics.drawable.Drawable.ConstantState) (new AnimatedVectorDrawableDelegateState(mDelegateDrawable.getConstantState())));
	//    6   15:new             #15  <Class AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:getfield        #120 <Field Drawable mDelegateDrawable>
	//   10   23:invokevirtual   #130 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   11   26:invokespecial   #133 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable$ConstantState)>
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
	//    1    1:invokespecial   #355 <Method Drawable VectorDrawableCommon.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #358 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #359 <Method int VectorDrawableCompat.getIntrinsicHeight()>
	//   11   25:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #362 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #363 <Method int VectorDrawableCompat.getIntrinsicWidth()>
	//   11   25:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #366 <Method int VectorDrawableCommon.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #369 <Method int VectorDrawableCommon.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #372 <Method int Drawable.getOpacity()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.getOpacity();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #373 <Method int VectorDrawableCompat.getOpacity()>
	//   11   25:ireturn         
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #377 <Method boolean VectorDrawableCommon.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method int[] VectorDrawableCommon.getState()>
	//    2    4:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #385 <Method Region VectorDrawableCommon.getTransparentRegion()>
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
	//    5    5:invokevirtual   #175 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6    8:return          
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		int i;
		int k;
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #389 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		}
		i = xmlpullparser.getEventType();
	//   11   20:aload_2         
	//   12   21:invokeinterface #392 <Method int XmlPullParser.getEventType()>
	//   13   26:istore          5
		k = xmlpullparser.getDepth();
	//   14   28:aload_2         
	//   15   29:invokeinterface #395 <Method int XmlPullParser.getDepth()>
	//   16   34:istore          6
_L2:
		Object obj;
		if(i == 1 || xmlpullparser.getDepth() < k + 1 && i == 3)
			break MISSING_BLOCK_LABEL_270;
	//   17   36:iload           5
	//   18   38:iconst_1        
	//   19   39:icmpeq          270
	//   20   42:aload_2         
	//   21   43:invokeinterface #395 <Method int XmlPullParser.getDepth()>
	//   22   48:iload           6
	//   23   50:iconst_1        
	//   24   51:iadd            
	//   25   52:icmpge          61
	//   26   55:iload           5
	//   27   57:iconst_3        
	//   28   58:icmpeq          270
		if(i == 2)
	//*  29   61:iload           5
	//*  30   63:iconst_2        
	//*  31   64:icmpne          171
		{
			obj = ((Object) (xmlpullparser.getName()));
	//   32   67:aload_2         
	//   33   68:invokeinterface #398 <Method String XmlPullParser.getName()>
	//   34   73:astore          7
			if(!"animated-vector".equals(obj))
				break; /* Loop/switch isn't completed */
	//   35   75:ldc1            #20  <String "animated-vector">
	//   36   77:aload           7
	//   37   79:invokevirtual   #282 <Method boolean String.equals(Object)>
	//   38   82:ifeq            182
			obj = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE)));
	//   39   85:aload_1         
	//   40   86:aload           4
	//   41   88:aload_3         
	//   42   89:getstatic       #404 <Field int[] AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE>
	//   43   92:invokestatic    #410 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   44   95:astore          7
			i = ((TypedArray) (obj)).getResourceId(0, 0);
	//   45   97:aload           7
	//   46   99:iconst_0        
	//   47  100:iconst_0        
	//   48  101:invokevirtual   #416 <Method int TypedArray.getResourceId(int, int)>
	//   49  104:istore          5
			if(i != 0)
	//*  50  106:iload           5
	//*  51  108:ifeq            166
			{
				VectorDrawableCompat vectordrawablecompat = VectorDrawableCompat.create(resources, i, theme);
	//   52  111:aload_1         
	//   53  112:iload           5
	//   54  114:aload           4
	//   55  116:invokestatic    #419 <Method VectorDrawableCompat VectorDrawableCompat.create(Resources, int, android.content.res.Resources$Theme)>
	//   56  119:astore          8
				vectordrawablecompat.setAllowCaching(false);
	//   57  121:aload           8
	//   58  123:iconst_0        
	//   59  124:invokevirtual   #423 <Method void VectorDrawableCompat.setAllowCaching(boolean)>
				vectordrawablecompat.setCallback(mCallback);
	//   60  127:aload           8
	//   61  129:aload_0         
	//   62  130:getfield        #66  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   63  133:invokevirtual   #424 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
				if(mAnimatedVectorState.mVectorDrawable != null)
	//*  64  136:aload_0         
	//*  65  137:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  66  140:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//*  67  143:ifnull          157
					mAnimatedVectorState.mVectorDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   68  146:aload_0         
	//   69  147:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   70  150:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   71  153:aconst_null     
	//   72  154:invokevirtual   #424 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
				mAnimatedVectorState.mVectorDrawable = vectordrawablecompat;
	//   73  157:aload_0         
	//   74  158:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   75  161:aload           8
	//   76  163:putfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
			}
			((TypedArray) (obj)).recycle();
	//   77  166:aload           7
	//   78  168:invokevirtual   #427 <Method void TypedArray.recycle()>
		}
_L4:
		i = xmlpullparser.next();
	//   79  171:aload_2         
	//   80  172:invokeinterface #153 <Method int XmlPullParser.next()>
	//   81  177:istore          5
		if(true) goto _L2; else goto _L1
	//   82  179:goto            36
_L1:
		if(!"target".equals(obj)) goto _L4; else goto _L3
	//   83  182:ldc1            #29  <String "target">
	//   84  184:aload           7
	//   85  186:invokevirtual   #282 <Method boolean String.equals(Object)>
	//   86  189:ifeq            171
_L3:
label0:
		{
			obj = ((Object) (resources.obtainAttributes(attributeset, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET)));
	//   87  192:aload_1         
	//   88  193:aload_3         
	//   89  194:getstatic       #430 <Field int[] AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET>
	//   90  197:invokevirtual   #433 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   91  200:astore          7
			String s = ((TypedArray) (obj)).getString(0);
	//   92  202:aload           7
	//   93  204:iconst_0        
	//   94  205:invokevirtual   #437 <Method String TypedArray.getString(int)>
	//   95  208:astore          8
			int j = ((TypedArray) (obj)).getResourceId(1, 0);
	//   96  210:aload           7
	//   97  212:iconst_1        
	//   98  213:iconst_0        
	//   99  214:invokevirtual   #416 <Method int TypedArray.getResourceId(int, int)>
	//  100  217:istore          5
			if(j != 0)
	//* 101  219:iload           5
	//* 102  221:ifeq            246
			{
				if(mContext == null)
					break label0;
	//  103  224:aload_0         
	//  104  225:getfield        #68  <Field Context mContext>
	//  105  228:ifnull          254
				setupAnimatorsForTarget(s, AnimatorInflaterCompat.loadAnimator(mContext, j));
	//  106  231:aload_0         
	//  107  232:aload           8
	//  108  234:aload_0         
	//  109  235:getfield        #68  <Field Context mContext>
	//  110  238:iload           5
	//  111  240:invokestatic    #443 <Method Animator AnimatorInflaterCompat.loadAnimator(Context, int)>
	//  112  243:invokespecial   #445 <Method void setupAnimatorsForTarget(String, Animator)>
			}
			((TypedArray) (obj)).recycle();
	//  113  246:aload           7
	//  114  248:invokevirtual   #427 <Method void TypedArray.recycle()>
		}
		  goto _L4
	//* 115  251:goto            171
		((TypedArray) (obj)).recycle();
	//  116  254:aload           7
	//  117  256:invokevirtual   #427 <Method void TypedArray.recycle()>
		throw new IllegalStateException("Context can't be null when inflating animators");
	//  118  259:new             #447 <Class IllegalStateException>
	//  119  262:dup             
	//  120  263:ldc2            #449 <String "Context can't be null when inflating animators">
	//  121  266:invokespecial   #450 <Method void IllegalStateException(String)>
	//  122  269:athrow          
		mAnimatedVectorState.setupAnimatorSet();
	//  123  270:aload_0         
	//  124  271:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//  125  274:invokevirtual   #453 <Method void AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.setupAnimatorSet()>
		return;
	//  126  277:return          
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #456 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #458 <Method boolean VectorDrawableCompat.isAutoMirrored()>
	//   11   25:ireturn         
	}

	public boolean isRunning()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
			return ((AnimatedVectorDrawable)mDelegateDrawable).isRunning();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #461 <Method boolean AnimatedVectorDrawable.isRunning()>
	//    7   17:ireturn         
		else
			return mAnimatedVectorState.mAnimatorSet.isRunning();
	//    8   18:aload_0         
	//    9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   22:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   11   25:invokevirtual   #462 <Method boolean AnimatorSet.isRunning()>
	//   12   28:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #465 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.isStateful();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//    9   19:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   10   22:invokevirtual   #466 <Method boolean VectorDrawableCompat.isStateful()>
	//   11   25:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #469 <Method void VectorDrawableCommon.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #472 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
		return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #477 <Method void Drawable.setBounds(Rect)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setBounds(rect);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #478 <Method void VectorDrawableCompat.setBounds(Rect)>
			return;
	//   13   27:return          
		}
	}

	protected boolean onLevelChange(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setLevel(i);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #483 <Method boolean Drawable.setLevel(int)>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.setLevel(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #484 <Method boolean VectorDrawableCompat.setLevel(int)>
	//   13   27:ireturn         
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #489 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.mVectorDrawable.setState(ai);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #490 <Method boolean VectorDrawableCompat.setState(int[])>
	//   13   27:ireturn         
	}

	public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationcallback)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          19
			registerPlatformCallback((AnimatedVectorDrawable)mDelegateDrawable, animationcallback);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:aload_1         
	//    7   15:invokestatic    #182 <Method void registerPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
		else
	//*   8   18:return          
		if(animationcallback != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          18
		{
			if(mAnimationCallbacks == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  13   27:ifnonnull       41
				mAnimationCallbacks = new ArrayList();
	//   14   30:aload_0         
	//   15   31:new             #236 <Class ArrayList>
	//   16   34:dup             
	//   17   35:invokespecial   #237 <Method void ArrayList()>
	//   18   38:putfield        #61  <Field ArrayList mAnimationCallbacks>
			if(!mAnimationCallbacks.contains(((Object) (animationcallback))))
	//*  19   41:aload_0         
	//*  20   42:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #493 <Method boolean ArrayList.contains(Object)>
	//*  23   49:ifne            18
			{
				mAnimationCallbacks.add(((Object) (animationcallback)));
	//   24   52:aload_0         
	//   25   53:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #252 <Method boolean ArrayList.add(Object)>
	//   28   60:pop             
				if(mAnimatorListener == null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//*  31   65:ifnonnull       80
					mAnimatorListener = ((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

						public void onAnimationEnd(Animator animator)
						{
							animator = ((Animator) (new ArrayList(((java.util.Collection) (mAnimationCallbacks)))));
						//    0    0:new             #23  <Class ArrayList>
						//    1    3:dup             
						//    2    4:aload_0         
						//    3    5:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
						//    4    8:invokestatic    #27  <Method ArrayList AnimatedVectorDrawableCompat.access$100(AnimatedVectorDrawableCompat)>
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
						//    4    8:invokestatic    #27  <Method ArrayList AnimatedVectorDrawableCompat.access$100(AnimatedVectorDrawableCompat)>
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
	//   32   68:aload_0         
	//   33   69:new             #10  <Class AnimatedVectorDrawableCompat$2>
	//   34   72:dup             
	//   35   73:aload_0         
	//   36   74:invokespecial   #494 <Method void AnimatedVectorDrawableCompat$2(AnimatedVectorDrawableCompat)>
	//   37   77:putfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
				mAnimatedVectorState.mAnimatorSet.addListener(mAnimatorListener);
	//   38   80:aload_0         
	//   39   81:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   40   84:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   41   87:aload_0         
	//   42   88:getfield        #59  <Field android.animation.Animator$AnimatorListener mAnimatorListener>
	//   43   91:invokevirtual   #497 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
				return;
	//   44   94:return          
			}
		}
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #501 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setAlpha(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #502 <Method void VectorDrawableCompat.setAlpha(int)>
			return;
	//   13   27:return          
		}
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setAutoMirrored(mDelegateDrawable, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #506 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setAutoMirrored(flag);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #508 <Method void VectorDrawableCompat.setAutoMirrored(boolean)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #511 <Method void VectorDrawableCommon.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #515 <Method void VectorDrawableCommon.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #518 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setColorFilter(colorfilter);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #519 <Method void VectorDrawableCompat.setColorFilter(ColorFilter)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #522 <Method void VectorDrawableCommon.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #526 <Method void VectorDrawableCommon.setHotspot(float, float)>
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
	//    5    6:invokespecial   #530 <Method void VectorDrawableCommon.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #531 <Method boolean VectorDrawableCommon.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #535 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTint(i);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #537 <Method void VectorDrawableCompat.setTint(int)>
			return;
	//   13   27:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #542 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTintList(colorstatelist);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #544 <Method void VectorDrawableCompat.setTintList(ColorStateList)>
			return;
	//   13   27:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #549 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setTintMode(mode);
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   20:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #551 <Method void VectorDrawableCompat.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   13   27:return          
		}
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #555 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		} else
		{
			mAnimatedVectorState.mVectorDrawable.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   11   21:getfield        #214 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mVectorDrawable>
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #556 <Method boolean VectorDrawableCompat.setVisible(boolean, boolean)>
	//   15   29:pop             
			return super.setVisible(flag, flag1);
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokespecial   #557 <Method boolean VectorDrawableCommon.setVisible(boolean, boolean)>
	//   20   36:ireturn         
		}
	}

	public void start()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
			((AnimatedVectorDrawable)mDelegateDrawable).start();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #560 <Method void AnimatedVectorDrawable.start()>
		else
	//*   7   17:return          
		if(!mAnimatedVectorState.mAnimatorSet.isStarted())
	//*   8   18:aload_0         
	//*   9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//*  10   22:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//*  11   25:invokevirtual   #331 <Method boolean AnimatorSet.isStarted()>
	//*  12   28:ifne            17
		{
			mAnimatedVectorState.mAnimatorSet.start();
	//   13   31:aload_0         
	//   14   32:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   15   35:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   16   38:invokevirtual   #561 <Method void AnimatorSet.start()>
			invalidateSelf();
	//   17   41:aload_0         
	//   18   42:invokevirtual   #334 <Method void invalidateSelf()>
			return;
	//   19   45:return          
		}
	}

	public void stop()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).stop();
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #564 <Method void AnimatedVectorDrawable.stop()>
			return;
	//    7   17:return          
		} else
		{
			mAnimatedVectorState.mAnimatorSet.end();
	//    8   18:aload_0         
	//    9   19:getfield        #70  <Field AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState mAnimatedVectorState>
	//   10   22:getfield        #202 <Field AnimatorSet AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState.mAnimatorSet>
	//   11   25:invokevirtual   #567 <Method void AnimatorSet.end()>
			return;
	//   12   28:return          
		}
	}

	public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationcallback)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          19
			unregisterPlatformCallback((AnimatedVectorDrawable)mDelegateDrawable, animationcallback);
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #87  <Class AnimatedVectorDrawable>
	//    6   14:aload_1         
	//    7   15:invokestatic    #297 <Method boolean unregisterPlatformCallback(AnimatedVectorDrawable, Animatable2Compat$AnimationCallback)>
	//    8   18:pop             
		boolean flag;
		if(mAnimationCallbacks == null || animationcallback == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  11   23:ifnull          30
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       34
		{
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		} else
	//*  16   32:iload_2         
	//*  17   33:ireturn         
		{
			boolean flag1 = mAnimationCallbacks.remove(((Object) (animationcallback)));
	//   18   34:aload_0         
	//   19   35:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #570 <Method boolean ArrayList.remove(Object)>
	//   22   42:istore_3        
			flag = flag1;
	//   23   43:iload_3         
	//   24   44:istore_2        
			if(mAnimationCallbacks.size() == 0)
	//*  25   45:aload_0         
	//*  26   46:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//*  27   49:invokevirtual   #571 <Method int ArrayList.size()>
	//*  28   52:ifne            32
			{
				removeAnimatorSetListener();
	//   29   55:aload_0         
	//   30   56:invokespecial   #317 <Method void removeAnimatorSetListener()>
				return flag1;
	//   31   59:iload_3         
	//   32   60:ireturn         
			}
		}
		return flag;
	}

	private static final String ANIMATED_VECTOR = "animated-vector";
	private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
	private static final String LOGTAG = "AnimatedVDCompat";
	private static final String TARGET = "target";
	private AnimatedVectorDrawableCompatState mAnimatedVectorState;
	private ArrayList mAnimationCallbacks;
	private android.animation.Animator.AnimatorListener mAnimatorListener;
	private ArgbEvaluator mArgbEvaluator;
	AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
	final android.graphics.drawable.Drawable.Callback mCallback;
	private Context mContext;


/*
	static ArrayList access$100(AnimatedVectorDrawableCompat animatedvectordrawablecompat)
	{
		return animatedvectordrawablecompat.mAnimationCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mAnimationCallbacks>
	//    2    4:areturn         
	}

*/
}
