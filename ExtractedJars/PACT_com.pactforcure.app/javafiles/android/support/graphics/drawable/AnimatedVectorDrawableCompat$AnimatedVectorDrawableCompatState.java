// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatedVectorDrawableCompat, VectorDrawableCompat

private static class AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState
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
	static ArrayList access$000(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState animatedvectordrawablecompat$animatedvectordrawablecompatstate)
	{
		return animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ArrayList mAnimators>
	//    2    4:areturn         
	}

*/


/*
	static ArrayList access$002(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState animatedvectordrawablecompat$animatedvectordrawablecompatstate, ArrayList arraylist)
	{
		animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field ArrayList mAnimators>
		return arraylist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	public AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState animatedvectordrawablecompat$animatedvectordrawablecompatstate, android.graphics.drawable.Drawable.Callback callback, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void android.graphics.drawable.Drawable$ConstantState()>
		if(animatedvectordrawablecompat$animatedvectordrawablecompatstate != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          233
		{
			mChangingConfigurations = animatedvectordrawablecompat$animatedvectordrawablecompatstate.mChangingConfigurations;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:getfield        #26  <Field int mChangingConfigurations>
	//    7   13:putfield        #26  <Field int mChangingConfigurations>
			if(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable != null)
	//*   8   16:aload_2         
	//*   9   17:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  10   20:ifnull          93
			{
				context = ((Context) (animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable.getConstantState()));
	//   11   23:aload_2         
	//   12   24:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   13   27:invokevirtual   #34  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
	//   14   30:astore_1        
				int i;
				int j;
				if(resources != null)
	//*  15   31:aload           4
	//*  16   33:ifnull          215
					mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   21   43:checkcast       #30  <Class VectorDrawableCompat>
	//   22   46:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
				else
	//*  23   49:aload_0         
	//*  24   50:aload_0         
	//*  25   51:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  26   54:invokevirtual   #42  <Method Drawable VectorDrawableCompat.mutate()>
	//*  27   57:checkcast       #30  <Class VectorDrawableCompat>
	//*  28   60:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  29   63:aload_0         
	//*  30   64:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  31   67:aload_3         
	//*  32   68:invokevirtual   #46  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
	//*  33   71:aload_0         
	//*  34   72:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  35   75:aload_2         
	//*  36   76:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  37   79:invokevirtual   #50  <Method android.graphics.Rect VectorDrawableCompat.getBounds()>
	//*  38   82:invokevirtual   #54  <Method void VectorDrawableCompat.setBounds(android.graphics.Rect)>
	//*  39   85:aload_0         
	//*  40   86:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//*  41   89:iconst_0        
	//*  42   90:invokevirtual   #58  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
	//*  43   93:aload_2         
	//*  44   94:getfield        #60  <Field ArrayList mAnimators>
	//*  45   97:ifnull          233
	//*  46  100:aload_2         
	//*  47  101:getfield        #60  <Field ArrayList mAnimators>
	//*  48  104:invokevirtual   #66  <Method int ArrayList.size()>
	//*  49  107:istore          6
	//*  50  109:aload_0         
	//*  51  110:new             #62  <Class ArrayList>
	//*  52  113:dup             
	//*  53  114:iload           6
	//*  54  116:invokespecial   #69  <Method void ArrayList(int)>
	//*  55  119:putfield        #60  <Field ArrayList mAnimators>
	//*  56  122:aload_0         
	//*  57  123:new             #71  <Class ArrayMap>
	//*  58  126:dup             
	//*  59  127:iload           6
	//*  60  129:invokespecial   #72  <Method void ArrayMap(int)>
	//*  61  132:putfield        #74  <Field ArrayMap mTargetNameMap>
	//*  62  135:iconst_0        
	//*  63  136:istore          5
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
				mVectorDrawable.setBounds(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable.getBounds());
				mVectorDrawable.setAllowCaching(false);
			}
			if(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators != null)
			{
				j = animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators.size();
				mAnimators = new ArrayList(j);
				mTargetNameMap = new ArrayMap(j);
				for(i = 0; i < j; i++)
				{
					callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators.get(i)));
					context = ((Context) (((Animator) (callback)).clone()));
					callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mTargetNameMap.get(((Object) (callback)))));
					((Animator) (context)).setTarget(mVectorDrawable.getTargetByName(((String) (callback))));
					mAnimators.add(((Object) (context)));
					mTargetNameMap.put(((Object) (context)), ((Object) (callback)));
				}

	//* 109  226:goto            49
				setupAnimatorSet();
	//  110  229:aload_0         
	//  111  230:invokevirtual   #110 <Method void setupAnimatorSet()>
			}
		}
	//  112  233:return          
	}
}
