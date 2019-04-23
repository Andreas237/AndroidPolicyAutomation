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

	public AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState animatedvectordrawablecompat$animatedvectordrawablecompatstate, android.graphics.drawable.Drawable.Callback callback, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void android.graphics.drawable.Drawable$ConstantState()>
		if(animatedvectordrawablecompat$animatedvectordrawablecompatstate != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          231
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
				mVectorDrawable.setBounds(animatedvectordrawablecompat$animatedvectordrawablecompatstate.mVectorDrawable.getBounds());
	//   42   87:aload_0         
	//   43   88:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   44   91:aload_2         
	//   45   92:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   46   95:invokevirtual   #52  <Method android.graphics.Rect VectorDrawableCompat.getBounds()>
	//   47   98:invokevirtual   #56  <Method void VectorDrawableCompat.setBounds(android.graphics.Rect)>
				mVectorDrawable.setAllowCaching(false);
	//   48  101:aload_0         
	//   49  102:getfield        #28  <Field VectorDrawableCompat mVectorDrawable>
	//   50  105:iconst_0        
	//   51  106:invokevirtual   #60  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
			}
			context = ((Context) (animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators));
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
					callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mAnimators.get(i)));
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
					callback = ((android.graphics.drawable.Drawable.Callback) ((String)animatedvectordrawablecompat$animatedvectordrawablecompatstate.mTargetNameMap.get(((Object) (callback)))));
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
