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
	//    3    6:astore_2        
		if(obj instanceof ViewPropertyAnimatorListener)
	//*   4    7:aload_2         
	//*   5    8:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*   6   11:ifeq            31
			obj = ((Object) ((ViewPropertyAnimatorListener)obj));
	//    7   14:aload_2         
	//    8   15:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//    9   18:astore_2        
		else
	//*  10   19:aload_2         
	//*  11   20:ifnull          30
	//*  12   23:aload_2         
	//*  13   24:aload_1         
	//*  14   25:invokeinterface #32  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
	//*  15   30:return          
			obj = null;
	//   16   31:aconst_null     
	//   17   32:astore_2        
		if(obj != null)
			((ViewPropertyAnimatorListener) (obj)).onAnimationCancel(view);
	//*  18   33:goto            19
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
	//*  20   43:ifne            113
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
	//   38   84:astore_2        
			if(obj instanceof ViewPropertyAnimatorListener)
	//*  39   85:aload_2         
	//*  40   86:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*  41   89:ifeq            114
				obj = ((Object) ((ViewPropertyAnimatorListener)obj));
	//   42   92:aload_2         
	//   43   93:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//   44   96:astore_2        
			else
	//*  45   97:aload_2         
	//*  46   98:ifnull          108
	//*  47  101:aload_2         
	//*  48  102:aload_1         
	//*  49  103:invokeinterface #59  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
	//*  50  108:aload_0         
	//*  51  109:iconst_1        
	//*  52  110:putfield        #48  <Field boolean mAnimEndCalled>
	//*  53  113:return          
				obj = null;
	//   54  114:aconst_null     
	//   55  115:astore_2        
			if(obj != null)
				((ViewPropertyAnimatorListener) (obj)).onAnimationEnd(view);
			mAnimEndCalled = true;
		}
	//*  56  116:goto            97
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
	//   29   60:astore_2        
		if(obj instanceof ViewPropertyAnimatorListener)
	//*  30   61:aload_2         
	//*  31   62:instanceof      #6   <Class ViewPropertyAnimatorListener>
	//*  32   65:ifeq            85
			obj = ((Object) ((ViewPropertyAnimatorListener)obj));
	//   33   68:aload_2         
	//   34   69:checkcast       #6   <Class ViewPropertyAnimatorListener>
	//   35   72:astore_2        
		else
	//*  36   73:aload_2         
	//*  37   74:ifnull          84
	//*  38   77:aload_2         
	//*  39   78:aload_1         
	//*  40   79:invokeinterface #65  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
	//*  41   84:return          
			obj = null;
	//   42   85:aconst_null     
	//   43   86:astore_2        
		if(obj != null)
			((ViewPropertyAnimatorListener) (obj)).onAnimationStart(view);
	//*  44   87:goto            73
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
