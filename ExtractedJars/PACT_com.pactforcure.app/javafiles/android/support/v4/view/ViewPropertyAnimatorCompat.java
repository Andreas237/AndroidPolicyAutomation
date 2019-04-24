// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.*;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener

public final class ViewPropertyAnimatorCompat
{
	static class ViewPropertyAnimatorListenerApi14
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

		ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
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


	ViewPropertyAnimatorCompat(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mStartAction = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field Runnable mStartAction>
		mEndAction = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #34  <Field Runnable mEndAction>
		mOldLayerType = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #36  <Field int mOldLayerType>
		mView = new WeakReference(((Object) (view)));
	//   11   19:aload_0         
	//   12   20:new             #38  <Class WeakReference>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:invokespecial   #41  <Method void WeakReference(Object)>
	//   16   28:putfield        #43  <Field WeakReference mView>
	//   17   31:return          
	}

	private void setListenerInternal(final View view, final ViewPropertyAnimatorListener listener)
	{
		if(listener != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          23
		{
			view.animate().setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationCancel(Animator animator)
				{
					listener.onAnimationCancel(view);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View val$view>
				//    4    8:invokeinterface #34  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
				//    5   13:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					listener.onAnimationEnd(view);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View val$view>
				//    4    8:invokeinterface #37  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
				//    5   13:return          
				}

				public void onAnimationStart(Animator animator)
				{
					listener.onAnimationStart(view);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View val$view>
				//    4    8:invokeinterface #40  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
				//    5   13:return          
				}

				final ViewPropertyAnimatorCompat this$0;
				final ViewPropertyAnimatorListener val$listener;
				final View val$view;

			
			{
				this$0 = ViewPropertyAnimatorCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewPropertyAnimatorCompat this$0>
				listener = viewpropertyanimatorlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewPropertyAnimatorListener val$listener>
				view = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View val$view>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
			}
)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    4    8:new             #6   <Class ViewPropertyAnimatorCompat$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokespecial   #55  <Method void ViewPropertyAnimatorCompat$1(ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, View)>
	//   10   18:invokevirtual   #61  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			view.animate().setListener(((android.animation.Animator.AnimatorListener) (null)));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #61  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   17   31:pop             
			return;
	//   18   32:return          
		}
	}

	public ViewPropertyAnimatorCompat alpha(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().alpha(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #70  <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat alphaBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().alphaBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #73  <Method ViewPropertyAnimator ViewPropertyAnimator.alphaBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void cancel()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().cancel();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #76  <Method void ViewPropertyAnimator.cancel()>
	//   10   22:return          
	}

	public long getDuration()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			return view.animate().getDuration();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #80  <Method long ViewPropertyAnimator.getDuration()>
	//   10   22:lreturn         
		else
			return 0L;
	//   11   23:lconst_0        
	//   12   24:lreturn         
	}

	public Interpolator getInterpolator()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 18)
	//*   5   11:aload_1         
	//*   6   12:ifnull          34
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          18
	//*   9   20:icmplt          34
			return (Interpolator)view.animate().getInterpolator();
	//   10   23:aload_1         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:invokevirtual   #90  <Method android.animation.TimeInterpolator ViewPropertyAnimator.getInterpolator()>
	//   13   30:checkcast       #92  <Class Interpolator>
	//   14   33:areturn         
		else
			return null;
	//   15   34:aconst_null     
	//   16   35:areturn         
	}

	public long getStartDelay()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			return view.animate().getStartDelay();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #95  <Method long ViewPropertyAnimator.getStartDelay()>
	//   10   22:lreturn         
		else
			return 0L;
	//   11   23:lconst_0        
	//   12   24:lreturn         
	}

	public ViewPropertyAnimatorCompat rotation(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotation(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #98  <Method ViewPropertyAnimator ViewPropertyAnimator.rotation(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #101 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #104 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #110 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #113 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #116 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #122 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setDuration(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setDuration(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #130 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		View view;
label0:
		{
			view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
			if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          29
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
					break label0;
	//    7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   18:bipush          16
	//    9   20:icmplt          31
				setListenerInternal(view, viewpropertyanimatorlistener);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #138 <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
			}
			return this;
	//   14   29:aload_0         
	//   15   30:areturn         
		}
		view.setTag(0x7e000000, ((Object) (viewpropertyanimatorlistener)));
	//   16   31:aload_2         
	//   17   32:ldc1            #14  <Int 0x7e000000>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #142 <Method void View.setTag(int, Object)>
		setListenerInternal(view, ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerApi14(this))));
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:new             #10  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokespecial   #145 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat)>
	//   26   48:invokespecial   #138 <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
		return this;
	//   27   51:aload_0         
	//   28   52:areturn         
	}

	public ViewPropertyAnimatorCompat setStartDelay(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setStartDelay(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #148 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener listener)
	{
		final View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_3        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 19)
	//*   5   11:aload_3         
	//*   6   12:ifnull          49
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          19
	//*   9   20:icmplt          49
		{
			android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener = null;
	//   10   23:aconst_null     
	//   11   24:astore_2        
			if(listener != null)
	//*  12   25:aload_1         
	//*  13   26:ifnull          40
				animatorupdatelistener = new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						listener.onAnimationUpdate(view);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field ViewPropertyAnimatorUpdateListener val$listener>
					//    2    4:aload_0         
					//    3    5:getfield        #25  <Field View val$view>
					//    4    8:invokeinterface #36  <Method void ViewPropertyAnimatorUpdateListener.onAnimationUpdate(View)>
					//    5   13:return          
					}

					final ViewPropertyAnimatorCompat this$0;
					final ViewPropertyAnimatorUpdateListener val$listener;
					final View val$view;

			
			{
				this$0 = ViewPropertyAnimatorCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ViewPropertyAnimatorCompat this$0>
				listener = viewpropertyanimatorupdatelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewPropertyAnimatorUpdateListener val$listener>
				view = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View val$view>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
;
	//   14   29:new             #8   <Class ViewPropertyAnimatorCompat$2>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_3         
	//   19   36:invokespecial   #153 <Method void ViewPropertyAnimatorCompat$2(ViewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener, View)>
	//   20   39:astore_2        
			view.animate().setUpdateListener(animatorupdatelistener);
	//   21   40:aload_3         
	//   22   41:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #156 <Method ViewPropertyAnimator ViewPropertyAnimator.setUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//   25   48:pop             
		}
		return this;
	//   26   49:aload_0         
	//   27   50:areturn         
	}

	public void start()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().start();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #159 <Method void ViewPropertyAnimator.start()>
	//   10   22:return          
	}

	public ViewPropertyAnimatorCompat translationX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #162 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #165 <Method ViewPropertyAnimator ViewPropertyAnimator.translationXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #168 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #171 <Method ViewPropertyAnimator ViewPropertyAnimator.translationYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationZ(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmplt          32
			view.animate().translationZ(f);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:fload_1         
	//   13   28:invokevirtual   #174 <Method ViewPropertyAnimator ViewPropertyAnimator.translationZ(float)>
	//   14   31:pop             
		return this;
	//   15   32:aload_0         
	//   16   33:areturn         
	}

	public ViewPropertyAnimatorCompat translationZBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmplt          32
			view.animate().translationZBy(f);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:fload_1         
	//   13   28:invokevirtual   #177 <Method ViewPropertyAnimator ViewPropertyAnimator.translationZBy(float)>
	//   14   31:pop             
		return this;
	//   15   32:aload_0         
	//   16   33:areturn         
	}

	public ViewPropertyAnimatorCompat withEndAction(Runnable runnable)
	{
		View view;
label0:
		{
			view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
			if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
					break label0;
	//    7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   18:bipush          16
	//    9   20:icmplt          34
				view.animate().withEndAction(runnable);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #182 <Method ViewPropertyAnimator ViewPropertyAnimator.withEndAction(Runnable)>
	//   14   31:pop             
			}
			return this;
	//   15   32:aload_0         
	//   16   33:areturn         
		}
		setListenerInternal(view, ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerApi14(this))));
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:new             #10  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14>
	//   20   39:dup             
	//   21   40:aload_0         
	//   22   41:invokespecial   #145 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat)>
	//   23   44:invokespecial   #138 <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
		mEndAction = runnable;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:putfield        #34  <Field Runnable mEndAction>
		return this;
	//   27   52:aload_0         
	//   28   53:areturn         
	}

	public ViewPropertyAnimatorCompat withLayer()
	{
		View view;
label0:
		{
			view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_1        
			if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          31
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
					break label0;
	//    7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   18:bipush          16
	//    9   20:icmplt          33
				view.animate().withLayer();
	//   10   23:aload_1         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:invokevirtual   #186 <Method ViewPropertyAnimator ViewPropertyAnimator.withLayer()>
	//   13   30:pop             
			}
			return this;
	//   14   31:aload_0         
	//   15   32:areturn         
		}
		mOldLayerType = view.getLayerType();
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #190 <Method int View.getLayerType()>
	//   19   38:putfield        #36  <Field int mOldLayerType>
		setListenerInternal(view, ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerApi14(this))));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:new             #10  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:invokespecial   #145 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat)>
	//   26   51:invokespecial   #138 <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
		return this;
	//   27   54:aload_0         
	//   28   55:areturn         
	}

	public ViewPropertyAnimatorCompat withStartAction(Runnable runnable)
	{
		View view;
label0:
		{
			view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
			if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
					break label0;
	//    7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   18:bipush          16
	//    9   20:icmplt          34
				view.animate().withStartAction(runnable);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #193 <Method ViewPropertyAnimator ViewPropertyAnimator.withStartAction(Runnable)>
	//   14   31:pop             
			}
			return this;
	//   15   32:aload_0         
	//   16   33:areturn         
		}
		setListenerInternal(view, ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerApi14(this))));
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:new             #10  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14>
	//   20   39:dup             
	//   21   40:aload_0         
	//   22   41:invokespecial   #145 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat)>
	//   23   44:invokespecial   #138 <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
		mStartAction = runnable;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:putfield        #32  <Field Runnable mStartAction>
		return this;
	//   27   52:aload_0         
	//   28   53:areturn         
	}

	public ViewPropertyAnimatorCompat x(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().x(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #196 <Method ViewPropertyAnimator ViewPropertyAnimator.x(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat xBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().xBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #199 <Method ViewPropertyAnimator ViewPropertyAnimator.xBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat y(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().y(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #202 <Method ViewPropertyAnimator ViewPropertyAnimator.y(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat yBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().yBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #205 <Method ViewPropertyAnimator ViewPropertyAnimator.yBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat z(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmplt          32
			view.animate().z(f);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:fload_1         
	//   13   28:invokevirtual   #208 <Method ViewPropertyAnimator ViewPropertyAnimator.z(float)>
	//   14   31:pop             
		return this;
	//   15   32:aload_0         
	//   16   33:areturn         
	}

	public ViewPropertyAnimatorCompat zBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field WeakReference mView>
	//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
	//    3    7:checkcast       #48  <Class View>
	//    4   10:astore_2        
		if(view != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   5   11:aload_2         
	//*   6   12:ifnull          32
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmplt          32
			view.animate().zBy(f);
	//   10   23:aload_2         
	//   11   24:invokevirtual   #52  <Method ViewPropertyAnimator View.animate()>
	//   12   27:fload_1         
	//   13   28:invokevirtual   #211 <Method ViewPropertyAnimator ViewPropertyAnimator.zBy(float)>
	//   14   31:pop             
		return this;
	//   15   32:aload_0         
	//   16   33:areturn         
	}

	static final int LISTENER_TAG_ID = 0x7e000000;
	private static final String TAG = "ViewAnimatorCompat";
	Runnable mEndAction;
	int mOldLayerType;
	Runnable mStartAction;
	private WeakReference mView;
}
