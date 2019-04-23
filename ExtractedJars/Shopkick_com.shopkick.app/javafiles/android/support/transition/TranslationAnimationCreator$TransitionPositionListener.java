// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.transition:
//			TranslationAnimationCreator

private static class TranslationAnimationCreator$TransitionPositionListener extends AnimatorListenerAdapter
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

	TranslationAnimationCreator$TransitionPositionListener(View view, View view1, int i, int j, float f, float f1)
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
