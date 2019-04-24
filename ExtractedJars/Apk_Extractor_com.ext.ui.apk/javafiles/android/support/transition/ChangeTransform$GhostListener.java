// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, ChangeTransform, Transition, GhostViewUtils, 
//			GhostViewImpl

private static class ChangeTransform$GhostListener extends TransitionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		transition.removeListener(((Transition$TransitionListener) (this)));
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

	ChangeTransform$GhostListener(View view, GhostViewImpl ghostviewimpl)
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
