// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import com.facebook.FacebookException;
import com.facebook.share.internal.LikeActionController;

// Referenced classes of package com.facebook.share.widget:
//			LikeView

private class LikeView$LikeActionControllerCreationCallback
	implements com.facebook.share.internal.LikeActionController.CreationCallback
{

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #27  <Field boolean isCancelled>
	//    3    5:return          
	}

	public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
	{
		if(isCancelled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean isCancelled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		FacebookException facebookexception1 = facebookexception;
	//    4    8:aload_2         
	//    5    9:astore_3        
		if(likeactioncontroller != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          48
		{
			if(!likeactioncontroller.shouldEnableView())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #35  <Method boolean LikeActionController.shouldEnableView()>
	//*  10   18:ifne            31
				facebookexception = new FacebookException("Cannot use LikeView. The device may not be supported.");
	//   11   21:new             #37  <Class FacebookException>
	//   12   24:dup             
	//   13   25:ldc1            #39  <String "Cannot use LikeView. The device may not be supported.">
	//   14   27:invokespecial   #42  <Method void FacebookException(String)>
	//   15   30:astore_2        
			LikeView.access$1100(LikeView.this, likeactioncontroller);
	//   16   31:aload_0         
	//   17   32:getfield        #17  <Field LikeView this$0>
	//   18   35:aload_1         
	//   19   36:invokestatic    #46  <Method void LikeView.access$1100(LikeView, LikeActionController)>
			LikeView.access$700(LikeView.this);
	//   20   39:aload_0         
	//   21   40:getfield        #17  <Field LikeView this$0>
	//   22   43:invokestatic    #49  <Method void LikeView.access$700(LikeView)>
			facebookexception1 = facebookexception;
	//   23   46:aload_2         
	//   24   47:astore_3        
		}
		if(facebookexception1 != null && LikeView.access$800(LikeView.this) != null)
	//*  25   48:aload_3         
	//*  26   49:ifnull          75
	//*  27   52:aload_0         
	//*  28   53:getfield        #17  <Field LikeView this$0>
	//*  29   56:invokestatic    #53  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
	//*  30   59:ifnull          75
			LikeView.access$800(LikeView.this).onError(facebookexception1);
	//   31   62:aload_0         
	//   32   63:getfield        #17  <Field LikeView this$0>
	//   33   66:invokestatic    #53  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
	//   34   69:aload_3         
	//   35   70:invokeinterface #59  <Method void LikeView$OnErrorListener.onError(FacebookException)>
		LikeView.access$1202(LikeView.this, ((LikeView$LikeActionControllerCreationCallback) (null)));
	//   36   75:aload_0         
	//   37   76:getfield        #17  <Field LikeView this$0>
	//   38   79:aconst_null     
	//   39   80:invokestatic    #63  <Method LikeView$LikeActionControllerCreationCallback LikeView.access$1202(LikeView, LikeView$LikeActionControllerCreationCallback)>
	//   40   83:pop             
	//   41   84:return          
	}

	private boolean isCancelled;
	final LikeView this$0;

	private LikeView$LikeActionControllerCreationCallback()
	{
		this$0 = LikeView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	LikeView$LikeActionControllerCreationCallback(LikeView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void LikeView$LikeActionControllerCreationCallback(LikeView)>
	//    3    5:return          
	}
}
