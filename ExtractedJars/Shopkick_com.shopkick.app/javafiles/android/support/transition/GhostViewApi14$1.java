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
		GhostViewApi14 ghostviewapi14 = GhostViewApi14.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field GhostViewApi14 this$0>
	//    2    4:astore_1        
		ghostviewapi14.mCurrentMatrix = ghostviewapi14.mView.getMatrix();
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #24  <Field View GhostViewApi14.mView>
	//    6   10:invokevirtual   #30  <Method android.graphics.Matrix View.getMatrix()>
	//    7   13:putfield        #34  <Field android.graphics.Matrix GhostViewApi14.mCurrentMatrix>
		ViewCompat.postInvalidateOnAnimation(((View) (GhostViewApi14.this)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field GhostViewApi14 this$0>
	//   10   20:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		if(mStartParent != null && mStartView != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #14  <Field GhostViewApi14 this$0>
	//*  13   27:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//*  14   30:ifnull          85
	//*  15   33:aload_0         
	//*  16   34:getfield        #14  <Field GhostViewApi14 this$0>
	//*  17   37:getfield        #47  <Field View GhostViewApi14.mStartView>
	//*  18   40:ifnull          85
		{
			mStartParent.endViewTransition(mStartView);
	//   19   43:aload_0         
	//   20   44:getfield        #14  <Field GhostViewApi14 this$0>
	//   21   47:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//   22   50:aload_0         
	//   23   51:getfield        #14  <Field GhostViewApi14 this$0>
	//   24   54:getfield        #47  <Field View GhostViewApi14.mStartView>
	//   25   57:invokevirtual   #52  <Method void ViewGroup.endViewTransition(View)>
			ViewCompat.postInvalidateOnAnimation(((View) (mStartParent)));
	//   26   60:aload_0         
	//   27   61:getfield        #14  <Field GhostViewApi14 this$0>
	//   28   64:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
	//   29   67:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			GhostViewApi14 ghostviewapi14_1 = GhostViewApi14.this;
	//   30   70:aload_0         
	//   31   71:getfield        #14  <Field GhostViewApi14 this$0>
	//   32   74:astore_1        
			ghostviewapi14_1.mStartParent = null;
	//   33   75:aload_1         
	//   34   76:aconst_null     
	//   35   77:putfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
			ghostviewapi14_1.mStartView = null;
	//   36   80:aload_1         
	//   37   81:aconst_null     
	//   38   82:putfield        #47  <Field View GhostViewApi14.mStartView>
		}
		return true;
	//   39   85:iconst_1        
	//   40   86:ireturn         
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
