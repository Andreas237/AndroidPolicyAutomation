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
	//   11   23:getfield        #62  <Field ArrayList mAnimators>
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
	//    1    1:getfield        #62  <Field ArrayList mAnimators>
	//    2    4:areturn         
	}

*/


/*
	static ArrayList access$002(AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState animatedvectordrawablecompat$animatedvectordrawablecompatstate, ArrayList arraylist)
	{
		animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ArrayList mAnimators>
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
	//*   3    5:ifnull          235
		{
			mChangingConfigurations = animatedvectordrawablecompat$animatedvectordrawablecompatstate.mChangingConfigurations;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:getfield        #26  <Field int mChangingConfigurations>
	//    7   13:putfield        #26  <Field int mChangingConfigurations>
			context = ((Context) (animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable));
	//    8   16:aload_2         
	//    9   17:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   10   20:astore_1        
			int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore          5
			if(context != null)
	//*  13   24:aload_1         
	//*  14   25:ifnull          112
			{
				context = ((Context) (animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable.getConstantState()));
	//   15   28:aload_2         
	//   16   29:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   17   32:invokevirtual   #34  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
	//   18   35:astore_1        
				if(resources != null)
	//*  19   36:aload           4
	//*  20   38:ifnull          57
					mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload           4
	//   24   45:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   25   48:checkcast       #30  <Class VectorDrawableCompat>
	//   26   51:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
				else
	//*  27   54:goto            68
					mVectorDrawable = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable();
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:invokevirtual   #41  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   31   62:checkcast       #30  <Class VectorDrawableCompat>
	//   32   65:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
				mVectorDrawable = (VectorDrawableCompat)mVectorDrawable.mutate();
	//   33   68:aload_0         
	//   34   69:aload_0         
	//   35   70:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   36   73:invokevirtual   #44  <Method Drawable VectorDrawableCompat.mutate()>
	//   37   76:checkcast       #30  <Class VectorDrawableCompat>
	//   38   79:putfield        #28  <Field VectorDrawableCompat mVectorDrawable>
				mVectorDrawable.setCallback(callback);
	//   39   82:aload_0         
	//   40   83:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   41   86:aload_3         
	//   42   87:invokevirtual   #48  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
				mVectorDrawable.setBounds(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable.getBounds());
	//   43   90:aload_0         
	//   44   91:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   45   94:aload_2         
	//   46   95:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   47   98:invokevirtual   #52  <Method android.graphics.Rect VectorDrawableCompat.getBounds()>
	//   48  101:invokevirtual   #56  <Method void VectorDrawableCompat.setBounds(android.graphics.Rect)>
				mVectorDrawable.setAllowCaching(false);
	//   49  104:aload_0         
	//   50  105:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   51  108:iconst_0        
	//   52  109:invokevirtual   #60  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
			}
			if(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators != null)
	//*  53  112:aload_2         
	//*  54  113:getfield        #62  <Field ArrayList mAnimators>
	//*  55  116:ifnull          235
			{
				int j = animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators.size();
	//   56  119:aload_2         
	//   57  120:getfield        #62  <Field ArrayList mAnimators>
	//   58  123:invokevirtual   #68  <Method int ArrayList.size()>
	//   59  126:istore          6
				mAnimators = new ArrayList(j);
	//   60  128:aload_0         
	//   61  129:new             #64  <Class ArrayList>
	//   62  132:dup             
	//   63  133:iload           6
	//   64  135:invokespecial   #71  <Method void ArrayList(int)>
	//   65  138:putfield        #62  <Field ArrayList mAnimators>
				mTargetNameMap = new ArrayMap(j);
	//   66  141:aload_0         
	//   67  142:new             #73  <Class ArrayMap>
	//   68  145:dup             
	//   69  146:iload           6
	//   70  148:invokespecial   #74  <Method void ArrayMap(int)>
	//   71  151:putfield        #76  <Field ArrayMap mTargetNameMap>
				for(; i < j; i++)
	//*  72  154:iload           5
	//*  73  156:iload           6
	//*  74  158:icmpge          231
				{
					callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators.get(i)));
	//   75  161:aload_2         
	//   76  162:getfield        #62  <Field ArrayList mAnimators>
	//   77  165:iload           5
	//   78  167:invokevirtual   #80  <Method Object ArrayList.get(int)>
	//   79  170:checkcast       #82  <Class Animator>
	//   80  173:astore_3        
					context = ((Context) (((Animator) (callback)).clone()));
	//   81  174:aload_3         
	//   82  175:invokevirtual   #86  <Method Animator Animator.clone()>
	//   83  178:astore_1        
					callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mTargetNameMap.get(((Object) (callback)))));
	//   84  179:aload_2         
	//   85  180:getfield        #76  <Field ArrayMap mTargetNameMap>
	//   86  183:aload_3         
	//   87  184:invokevirtual   #89  <Method Object ArrayMap.get(Object)>
	//   88  187:checkcast       #91  <Class String>
	//   89  190:astore_3        
					((Animator) (context)).setTarget(mVectorDrawable.getTargetByName(((String) (callback))));
	//   90  191:aload_1         
	//   91  192:aload_0         
	//   92  193:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   93  196:aload_3         
	//   94  197:invokevirtual   #95  <Method Object VectorDrawableCompat.getTargetByName(String)>
	//   95  200:invokevirtual   #99  <Method void Animator.setTarget(Object)>
					mAnimators.add(((Object) (context)));
	//   96  203:aload_0         
	//   97  204:getfield        #62  <Field ArrayList mAnimators>
	//   98  207:aload_1         
	//   99  208:invokevirtual   #103 <Method boolean ArrayList.add(Object)>
	//  100  211:pop             
					mTargetNameMap.put(((Object) (context)), ((Object) (callback)));
	//  101  212:aload_0         
	//  102  213:getfield        #76  <Field ArrayMap mTargetNameMap>
	//  103  216:aload_1         
	//  104  217:aload_3         
	//  105  218:invokevirtual   #107 <Method Object ArrayMap.put(Object, Object)>
	//  106  221:pop             
				}

	//  107  222:iload           5
	//  108  224:iconst_1        
	//  109  225:iadd            
	//  110  226:istore          5
	//* 111  228:goto            154
				setupAnimatorSet();
	//  112  231:aload_0         
	//  113  232:invokevirtual   #110 <Method void setupAnimatorSet()>
			}
		}
	//  114  235:return          
	}
}
