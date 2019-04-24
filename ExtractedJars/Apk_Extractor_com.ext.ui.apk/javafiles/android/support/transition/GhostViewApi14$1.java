// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			GhostViewApi14

class GhostViewApi14$1
	implements android.view.OnPreDrawListener
{

	public boolean onPreDraw()
	{
		mCurrentMatrix = mView.getMatrix();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field GhostViewApi14 this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field GhostViewApi14 this$0>
	//    4    8:getfield        #24  <Field View GhostViewApi14.mView>
	//    5   11:invokevirtual   #30  <Method android.graphics.Matrix View.getMatrix()>
	//    6   14:putfield        #34  <Field android.graphics.Matrix GhostViewApi14.mCurrentMatrix>
		ViewCompat.postInvalidateOnAnimation(((View) (GhostViewApi14.this)));
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field GhostViewApi14 this$0>
	//    9   21:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		if(mStartParent != null && mStartView != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #14  <Field GhostViewApi14 this$0>
	//*  12   28:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//*  13   31:ifnull          87
	//*  14   34:aload_0         
	//*  15   35:getfield        #14  <Field GhostViewApi14 this$0>
	//*  16   38:getfield        #47  <Field View GhostViewApi14.mStartView>
	//*  17   41:ifnull          87
		{
			mStartParent.endViewTransition(mStartView);
	//   18   44:aload_0         
	//   19   45:getfield        #14  <Field GhostViewApi14 this$0>
	//   20   48:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//   21   51:aload_0         
	//   22   52:getfield        #14  <Field GhostViewApi14 this$0>
	//   23   55:getfield        #47  <Field View GhostViewApi14.mStartView>
	//   24   58:invokevirtual   #52  <Method void ViewGroup.endViewTransition(View)>
			ViewCompat.postInvalidateOnAnimation(((View) (mStartParent)));
	//   25   61:aload_0         
	//   26   62:getfield        #14  <Field GhostViewApi14 this$0>
	//   27   65:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//   28   68:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mStartParent = null;
	//   29   71:aload_0         
	//   30   72:getfield        #14  <Field GhostViewApi14 this$0>
	//   31   75:aconst_null     
	//   32   76:putfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
			mStartView = null;
	//   33   79:aload_0         
	//   34   80:getfield        #14  <Field GhostViewApi14 this$0>
	//   35   83:aconst_null     
	//   36   84:putfield        #47  <Field View GhostViewApi14.mStartView>
		}
		return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
	}

	final GhostViewApi14 this$0;

	GhostViewApi14$1()
	{
		this$0 = GhostViewApi14.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GhostViewApi14 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
