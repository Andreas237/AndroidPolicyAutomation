// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14
	implements ViewPropertyAnimatorListener
{

	public void onAnimationCancel(View view)
	{
		Object obj = view.getTag(0x7e000000);
	//    0    0:aload_1         
	//    1    1:ldc1            #24  <Int 0x7e000000>
	//    2    3:invokevirtual   #30  <Method Object View.getTag(int)>
	//    3    6:astore_3        
		ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
	//    4    7:aconst_null     
	//    5    8:astore_2        
		if(obj instanceof ViewPropertyAnimatorListener)
	//*   6    9:aload_3         
	//*   7   10:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*   8   13:ifeq            21
			viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
	//    9   16:aload_3         
	//   10   17:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//   11   20:astore_2        
		if(viewpropertyanimatorlistener != null)
	//*  12   21:aload_2         
	//*  13   22:ifnull          32
			viewpropertyanimatorlistener.onAnimationCancel(view);
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokeinterface #32  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
	//   17   32:return          
	}

	public void onAnimationEnd(View view)
	{
		if(mVpa.mOldLayerType > -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//*   2    4:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
	//*   3    7:iconst_m1       
	//*   4    8:icmple          31
		{
			view.setLayerType(mVpa.mOldLayerType, ((android.graphics.Paint) (null)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//    8   16:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #41  <Method void View.setLayerType(int, android.graphics.Paint)>
			mVpa.mOldLayerType = -1;
	//   11   23:aload_0         
	//   12   24:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//   13   27:iconst_m1       
	//   14   28:putfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		}
		if(android.os.Build.VERSION.SDK_INT >= 16 || !mAnimEndCalled)
	//*  15   31:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          16
	//*  17   36:icmpge          46
	//*  18   39:aload_0         
	//*  19   40:getfield        #48  <Field boolean mAnimEndCalled>
	//*  20   43:ifne            115
		{
			if(mVpa.mEndAction != null)
	//*  21   46:aload_0         
	//*  22   47:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//*  23   50:getfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
	//*  24   53:ifnull          78
			{
				Runnable runnable = mVpa.mEndAction;
	//   25   56:aload_0         
	//   26   57:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//   27   60:getfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
	//   28   63:astore_2        
				mVpa.mEndAction = null;
	//   29   64:aload_0         
	//   30   65:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//   31   68:aconst_null     
	//   32   69:putfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
				runnable.run();
	//   33   72:aload_2         
	//   34   73:invokeinterface #57  <Method void Runnable.run()>
			}
			Object obj = view.getTag(0x7e000000);
	//   35   78:aload_1         
	//   36   79:ldc1            #24  <Int 0x7e000000>
	//   37   81:invokevirtual   #30  <Method Object View.getTag(int)>
	//   38   84:astore_3        
			ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
	//   39   85:aconst_null     
	//   40   86:astore_2        
			if(obj instanceof ViewPropertyAnimatorListener)
	//*  41   87:aload_3         
	//*  42   88:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*  43   91:ifeq            99
				viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
	//   44   94:aload_3         
	//   45   95:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//   46   98:astore_2        
			if(viewpropertyanimatorlistener != null)
	//*  47   99:aload_2         
	//*  48  100:ifnull          110
				viewpropertyanimatorlistener.onAnimationEnd(view);
	//   49  103:aload_2         
	//   50  104:aload_1         
	//   51  105:invokeinterface #59  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			mAnimEndCalled = true;
	//   52  110:aload_0         
	//   53  111:iconst_1        
	//   54  112:putfield        #48  <Field boolean mAnimEndCalled>
		}
	//   55  115:return          
	}

	public void onAnimationStart(View view)
	{
		mAnimEndCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #48  <Field boolean mAnimEndCalled>
		if(mVpa.mOldLayerType > -1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//*   5    9:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
	//*   6   12:iconst_m1       
	//*   7   13:icmple          22
			view.setLayerType(2, ((android.graphics.Paint) (null)));
	//    8   16:aload_1         
	//    9   17:iconst_2        
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #41  <Method void View.setLayerType(int, android.graphics.Paint)>
		if(mVpa.mStartAction != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//*  14   26:getfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
	//*  15   29:ifnull          54
		{
			Runnable runnable = mVpa.mStartAction;
	//   16   32:aload_0         
	//   17   33:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//   18   36:getfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
	//   19   39:astore_2        
			mVpa.mStartAction = null;
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//   22   44:aconst_null     
	//   23   45:putfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
			runnable.run();
	//   24   48:aload_2         
	//   25   49:invokeinterface #57  <Method void Runnable.run()>
		}
		Object obj = view.getTag(0x7e000000);
	//   26   54:aload_1         
	//   27   55:ldc1            #24  <Int 0x7e000000>
	//   28   57:invokevirtual   #30  <Method Object View.getTag(int)>
	//   29   60:astore_3        
		ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
	//   30   61:aconst_null     
	//   31   62:astore_2        
		if(obj instanceof ViewPropertyAnimatorListener)
	//*  32   63:aload_3         
	//*  33   64:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*  34   67:ifeq            75
			viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
	//   35   70:aload_3         
	//   36   71:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//   37   74:astore_2        
		if(viewpropertyanimatorlistener != null)
	//*  38   75:aload_2         
	//*  39   76:ifnull          86
			viewpropertyanimatorlistener.onAnimationStart(view);
	//   40   79:aload_2         
	//   41   80:aload_1         
	//   42   81:invokeinterface #65  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
	//   43   86:return          
	}

	boolean mAnimEndCalled;
	ViewPropertyAnimatorCompat mVpa;

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mVpa = viewpropertyanimatorcompat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
	//    5    9:return          
	}
}
