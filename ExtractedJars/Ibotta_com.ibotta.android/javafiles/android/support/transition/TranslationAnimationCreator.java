// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.view.View;

// Referenced classes of package android.support.transition:
//			TransitionValues, AnimatorUtils

class TranslationAnimationCreator
{
	private static class TransitionPositionListener extends AnimatorListenerAdapter
	{

		public void onAnimationCancel(Animator animator)
		{
			if(mTransitionPosition == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #64  <Field int[] mTransitionPosition>
		//*   2    4:ifnonnull       14
				mTransitionPosition = new int[2];
		//    3    7:aload_0         
		//    4    8:iconst_2        
		//    5    9:newarray        int[]
		//    6   11:putfield        #64  <Field int[] mTransitionPosition>
			mTransitionPosition[0] = Math.round((float)mStartX + mMovingView.getTranslationX());
		//    7   14:aload_0         
		//    8   15:getfield        #64  <Field int[] mTransitionPosition>
		//    9   18:iconst_0        
		//   10   19:aload_0         
		//   11   20:getfield        #43  <Field int mStartX>
		//   12   23:i2f             
		//   13   24:aload_0         
		//   14   25:getfield        #27  <Field View mMovingView>
		//   15   28:invokevirtual   #35  <Method float View.getTranslationX()>
		//   16   31:fadd            
		//   17   32:invokestatic    #41  <Method int Math.round(float)>
		//   18   35:iastore         
			mTransitionPosition[1] = Math.round((float)mStartY + mMovingView.getTranslationY());
		//   19   36:aload_0         
		//   20   37:getfield        #64  <Field int[] mTransitionPosition>
		//   21   40:iconst_1        
		//   22   41:aload_0         
		//   23   42:getfield        #48  <Field int mStartY>
		//   24   45:i2f             
		//   25   46:aload_0         
		//   26   47:getfield        #27  <Field View mMovingView>
		//   27   50:invokevirtual   #46  <Method float View.getTranslationY()>
		//   28   53:fadd            
		//   29   54:invokestatic    #41  <Method int Math.round(float)>
		//   30   57:iastore         
			mViewInHierarchy.setTag(R.id.transition_position, ((Object) (mTransitionPosition)));
		//   31   58:aload_0         
		//   32   59:getfield        #29  <Field View mViewInHierarchy>
		//   33   62:getstatic       #57  <Field int R$id.transition_position>
		//   34   65:aload_0         
		//   35   66:getfield        #64  <Field int[] mTransitionPosition>
		//   36   69:invokevirtual   #68  <Method void View.setTag(int, Object)>
		//   37   72:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			mMovingView.setTranslationX(mTerminalX);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field View mMovingView>
		//    2    4:aload_0         
		//    3    5:getfield        #50  <Field float mTerminalX>
		//    4    8:invokevirtual   #76  <Method void View.setTranslationX(float)>
			mMovingView.setTranslationY(mTerminalY);
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field View mMovingView>
		//    7   15:aload_0         
		//    8   16:getfield        #52  <Field float mTerminalY>
		//    9   19:invokevirtual   #79  <Method void View.setTranslationY(float)>
		//   10   22:return          
		}

		public void onAnimationPause(Animator animator)
		{
			mPausedX = mMovingView.getTranslationX();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #27  <Field View mMovingView>
		//    3    5:invokevirtual   #35  <Method float View.getTranslationX()>
		//    4    8:putfield        #82  <Field float mPausedX>
			mPausedY = mMovingView.getTranslationY();
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #27  <Field View mMovingView>
		//    8   16:invokevirtual   #46  <Method float View.getTranslationY()>
		//    9   19:putfield        #84  <Field float mPausedY>
			mMovingView.setTranslationX(mTerminalX);
		//   10   22:aload_0         
		//   11   23:getfield        #27  <Field View mMovingView>
		//   12   26:aload_0         
		//   13   27:getfield        #50  <Field float mTerminalX>
		//   14   30:invokevirtual   #76  <Method void View.setTranslationX(float)>
			mMovingView.setTranslationY(mTerminalY);
		//   15   33:aload_0         
		//   16   34:getfield        #27  <Field View mMovingView>
		//   17   37:aload_0         
		//   18   38:getfield        #52  <Field float mTerminalY>
		//   19   41:invokevirtual   #79  <Method void View.setTranslationY(float)>
		//   20   44:return          
		}

		public void onAnimationResume(Animator animator)
		{
			mMovingView.setTranslationX(mPausedX);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field View mMovingView>
		//    2    4:aload_0         
		//    3    5:getfield        #82  <Field float mPausedX>
		//    4    8:invokevirtual   #76  <Method void View.setTranslationX(float)>
			mMovingView.setTranslationY(mPausedY);
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field View mMovingView>
		//    7   15:aload_0         
		//    8   16:getfield        #84  <Field float mPausedY>
		//    9   19:invokevirtual   #79  <Method void View.setTranslationY(float)>
		//   10   22:return          
		}

		private final View mMovingView;
		private float mPausedX;
		private float mPausedY;
		private final int mStartX;
		private final int mStartY;
		private final float mTerminalX;
		private final float mTerminalY;
		private int mTransitionPosition[];
		private final View mViewInHierarchy;

		TransitionPositionListener(View view, View view1, int i, int j, float f, float f1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void AnimatorListenerAdapter()>
			mMovingView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field View mMovingView>
			mViewInHierarchy = view1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field View mViewInHierarchy>
			mStartX = i - Math.round(mMovingView.getTranslationX());
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:aload_0         
		//   11   17:getfield        #27  <Field View mMovingView>
		//   12   20:invokevirtual   #35  <Method float View.getTranslationX()>
		//   13   23:invokestatic    #41  <Method int Math.round(float)>
		//   14   26:isub            
		//   15   27:putfield        #43  <Field int mStartX>
			mStartY = j - Math.round(mMovingView.getTranslationY());
		//   16   30:aload_0         
		//   17   31:iload           4
		//   18   33:aload_0         
		//   19   34:getfield        #27  <Field View mMovingView>
		//   20   37:invokevirtual   #46  <Method float View.getTranslationY()>
		//   21   40:invokestatic    #41  <Method int Math.round(float)>
		//   22   43:isub            
		//   23   44:putfield        #48  <Field int mStartY>
			mTerminalX = f;
		//   24   47:aload_0         
		//   25   48:fload           5
		//   26   50:putfield        #50  <Field float mTerminalX>
			mTerminalY = f1;
		//   27   53:aload_0         
		//   28   54:fload           6
		//   29   56:putfield        #52  <Field float mTerminalY>
			mTransitionPosition = (int[])mViewInHierarchy.getTag(R.id.transition_position);
		//   30   59:aload_0         
		//   31   60:aload_0         
		//   32   61:getfield        #29  <Field View mViewInHierarchy>
		//   33   64:getstatic       #57  <Field int R$id.transition_position>
		//   34   67:invokevirtual   #61  <Method Object View.getTag(int)>
		//   35   70:checkcast       #62  <Class int[]>
		//   36   73:putfield        #64  <Field int[] mTransitionPosition>
			if(mTransitionPosition != null)
		//*  37   76:aload_0         
		//*  38   77:getfield        #64  <Field int[] mTransitionPosition>
		//*  39   80:ifnull          94
				mViewInHierarchy.setTag(R.id.transition_position, ((Object) (null)));
		//   40   83:aload_0         
		//   41   84:getfield        #29  <Field View mViewInHierarchy>
		//   42   87:getstatic       #57  <Field int R$id.transition_position>
		//   43   90:aconst_null     
		//   44   91:invokevirtual   #68  <Method void View.setTag(int, Object)>
		//   45   94:return          
		}
	}


	static Animator createAnimation(View view, TransitionValues transitionvalues, int i, int j, float f, float f1, float f2, float f3, 
			TimeInterpolator timeinterpolator)
	{
		float f4 = view.getTranslationX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method float View.getTranslationX()>
	//    2    4:fstore          9
		float f5 = view.getTranslationY();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #18  <Method float View.getTranslationY()>
	//    5   10:fstore          10
		int ai[] = (int[])transitionvalues.view.getTag(R.id.transition_position);
	//    6   12:aload_1         
	//    7   13:getfield        #24  <Field View TransitionValues.view>
	//    8   16:getstatic       #30  <Field int R$id.transition_position>
	//    9   19:invokevirtual   #34  <Method Object View.getTag(int)>
	//   10   22:checkcast       #36  <Class int[]>
	//   11   25:astore          13
		if(ai != null)
	//*  12   27:aload           13
	//*  13   29:ifnull          59
		{
			f = (float)(ai[0] - i) + f4;
	//   14   32:aload           13
	//   15   34:iconst_0        
	//   16   35:iaload          
	//   17   36:iload_2         
	//   18   37:isub            
	//   19   38:i2f             
	//   20   39:fload           9
	//   21   41:fadd            
	//   22   42:fstore          4
			f1 = (float)(ai[1] - j) + f5;
	//   23   44:aload           13
	//   24   46:iconst_1        
	//   25   47:iaload          
	//   26   48:iload_3         
	//   27   49:isub            
	//   28   50:i2f             
	//   29   51:fload           10
	//   30   53:fadd            
	//   31   54:fstore          5
		}
	//*  32   56:goto            59
		int k = Math.round(f - f4);
	//   33   59:fload           4
	//   34   61:fload           9
	//   35   63:fsub            
	//   36   64:invokestatic    #42  <Method int Math.round(float)>
	//   37   67:istore          11
		int l = Math.round(f1 - f5);
	//   38   69:fload           5
	//   39   71:fload           10
	//   40   73:fsub            
	//   41   74:invokestatic    #42  <Method int Math.round(float)>
	//   42   77:istore          12
		view.setTranslationX(f);
	//   43   79:aload_0         
	//   44   80:fload           4
	//   45   82:invokevirtual   #46  <Method void View.setTranslationX(float)>
		view.setTranslationY(f1);
	//   46   85:aload_0         
	//   47   86:fload           5
	//   48   88:invokevirtual   #49  <Method void View.setTranslationY(float)>
		if(f == f2 && f1 == f3)
	//*  49   91:fload           4
	//*  50   93:fload           6
	//*  51   95:fcmpl           
	//*  52   96:ifne            109
	//*  53   99:fload           5
	//*  54  101:fload           7
	//*  55  103:fcmpl           
	//*  56  104:ifne            109
		{
			return null;
	//   57  107:aconst_null     
	//   58  108:areturn         
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(((Object) (view)), new PropertyValuesHolder[] {
				PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] {
					f, f2
				}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] {
					f1, f3
				})
			});
	//   59  109:aload_0         
	//   60  110:iconst_2        
	//   61  111:anewarray       PropertyValuesHolder[]
	//   62  114:dup             
	//   63  115:iconst_0        
	//   64  116:getstatic       #55  <Field android.util.Property View.TRANSLATION_X>
	//   65  119:iconst_2        
	//   66  120:newarray        float[]
	//   67  122:dup             
	//   68  123:iconst_0        
	//   69  124:fload           4
	//   70  126:fastore         
	//   71  127:dup             
	//   72  128:iconst_1        
	//   73  129:fload           6
	//   74  131:fastore         
	//   75  132:invokestatic    #59  <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(android.util.Property, float[])>
	//   76  135:aastore         
	//   77  136:dup             
	//   78  137:iconst_1        
	//   79  138:getstatic       #62  <Field android.util.Property View.TRANSLATION_Y>
	//   80  141:iconst_2        
	//   81  142:newarray        float[]
	//   82  144:dup             
	//   83  145:iconst_0        
	//   84  146:fload           5
	//   85  148:fastore         
	//   86  149:dup             
	//   87  150:iconst_1        
	//   88  151:fload           7
	//   89  153:fastore         
	//   90  154:invokestatic    #59  <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(android.util.Property, float[])>
	//   91  157:aastore         
	//   92  158:invokestatic    #68  <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//   93  161:astore          13
			view = ((View) (new TransitionPositionListener(view, transitionvalues.view, i + k, j + l, f4, f5)));
	//   94  163:new             #6   <Class TranslationAnimationCreator$TransitionPositionListener>
	//   95  166:dup             
	//   96  167:aload_0         
	//   97  168:aload_1         
	//   98  169:getfield        #24  <Field View TransitionValues.view>
	//   99  172:iload_2         
	//  100  173:iload           11
	//  101  175:iadd            
	//  102  176:iload_3         
	//  103  177:iload           12
	//  104  179:iadd            
	//  105  180:fload           9
	//  106  182:fload           10
	//  107  184:invokespecial   #72  <Method void TranslationAnimationCreator$TransitionPositionListener(View, View, int, int, float, float)>
	//  108  187:astore_0        
			objectanimator.addListener(((android.animation.Animator.AnimatorListener) (view)));
	//  109  188:aload           13
	//  110  190:aload_0         
	//  111  191:invokevirtual   #76  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			AnimatorUtils.addPauseListener(((Animator) (objectanimator)), ((AnimatorListenerAdapter) (view)));
	//  112  194:aload           13
	//  113  196:aload_0         
	//  114  197:invokestatic    #82  <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
			objectanimator.setInterpolator(timeinterpolator);
	//  115  200:aload           13
	//  116  202:aload           8
	//  117  204:invokevirtual   #86  <Method void ObjectAnimator.setInterpolator(TimeInterpolator)>
			return ((Animator) (objectanimator));
	//  118  207:aload           13
	//  119  209:areturn         
		}
	}
}
