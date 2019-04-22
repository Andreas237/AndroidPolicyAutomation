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
		//    3    6:astore_2        
			if(obj instanceof ViewPropertyAnimatorListener)
		//*   4    7:aload_2         
		//*   5    8:instanceof      #6   <Class ViewPropertyAnimatorListener>
		//*   6   11:ifeq            22
				obj = ((Object) ((ViewPropertyAnimatorListener)obj));
		//    7   14:aload_2         
		//    8   15:checkcast       #6   <Class ViewPropertyAnimatorListener>
		//    9   18:astore_2        
			else
		//*  10   19:goto            24
				obj = null;
		//   11   22:aconst_null     
		//   12   23:astore_2        
			if(obj != null)
		//*  13   24:aload_2         
		//*  14   25:ifnull          35
				((ViewPropertyAnimatorListener) (obj)).onAnimationCancel(view);
		//   15   28:aload_2         
		//   16   29:aload_1         
		//   17   30:invokeinterface #32  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
		//   18   35:return          
		}

		public void onAnimationEnd(View view)
		{
			int i = mVpa.mOldLayerType;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//    2    4:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//    3    7:istore_2        
			ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
		//    4    8:aconst_null     
		//    5    9:astore_3        
			if(i > -1)
		//*   6   10:iload_2         
		//*   7   11:iconst_m1       
		//*   8   12:icmple          35
			{
				view.setLayerType(mVpa.mOldLayerType, ((android.graphics.Paint) (null)));
		//    9   15:aload_1         
		//   10   16:aload_0         
		//   11   17:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   12   20:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//   13   23:aconst_null     
		//   14   24:invokevirtual   #41  <Method void View.setLayerType(int, android.graphics.Paint)>
				mVpa.mOldLayerType = -1;
		//   15   27:aload_0         
		//   16   28:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   17   31:iconst_m1       
		//   18   32:putfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
			}
			if(android.os.Build.VERSION.SDK_INT >= 16 || !mAnimEndCalled)
		//*  19   35:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
		//*  20   38:bipush          16
		//*  21   40:icmpge          50
		//*  22   43:aload_0         
		//*  23   44:getfield        #48  <Field boolean mAnimEndCalled>
		//*  24   47:ifne            122
			{
				if(mVpa.mEndAction != null)
		//*  25   50:aload_0         
		//*  26   51:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//*  27   54:getfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
		//*  28   57:ifnull          84
				{
					Runnable runnable = mVpa.mEndAction;
		//   29   60:aload_0         
		//   30   61:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   31   64:getfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
		//   32   67:astore          4
					mVpa.mEndAction = null;
		//   33   69:aload_0         
		//   34   70:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   35   73:aconst_null     
		//   36   74:putfield        #52  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
					runnable.run();
		//   37   77:aload           4
		//   38   79:invokeinterface #57  <Method void Runnable.run()>
				}
				Object obj = view.getTag(0x7e000000);
		//   39   84:aload_1         
		//   40   85:ldc1            #24  <Int 0x7e000000>
		//   41   87:invokevirtual   #30  <Method Object View.getTag(int)>
		//   42   90:astore          4
				if(obj instanceof ViewPropertyAnimatorListener)
		//*  43   92:aload           4
		//*  44   94:instanceof      #6   <Class ViewPropertyAnimatorListener>
		//*  45   97:ifeq            106
					viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
		//   46  100:aload           4
		//   47  102:checkcast       #6   <Class ViewPropertyAnimatorListener>
		//   48  105:astore_3        
				if(viewpropertyanimatorlistener != null)
		//*  49  106:aload_3         
		//*  50  107:ifnull          117
					viewpropertyanimatorlistener.onAnimationEnd(view);
		//   51  110:aload_3         
		//   52  111:aload_1         
		//   53  112:invokeinterface #59  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
				mAnimEndCalled = true;
		//   54  117:aload_0         
		//   55  118:iconst_1        
		//   56  119:putfield        #48  <Field boolean mAnimEndCalled>
			}
		//   57  122:return          
		}

		public void onAnimationStart(View view)
		{
			mAnimEndCalled = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #48  <Field boolean mAnimEndCalled>
			int i = mVpa.mOldLayerType;
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//    5    9:getfield        #37  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//    6   12:istore_2        
			ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
		//    7   13:aconst_null     
		//    8   14:astore_3        
			if(i > -1)
		//*   9   15:iload_2         
		//*  10   16:iconst_m1       
		//*  11   17:icmple          26
				view.setLayerType(2, ((android.graphics.Paint) (null)));
		//   12   20:aload_1         
		//   13   21:iconst_2        
		//   14   22:aconst_null     
		//   15   23:invokevirtual   #41  <Method void View.setLayerType(int, android.graphics.Paint)>
			if(mVpa.mStartAction != null)
		//*  16   26:aload_0         
		//*  17   27:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//*  18   30:getfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
		//*  19   33:ifnull          60
			{
				Runnable runnable = mVpa.mStartAction;
		//   20   36:aload_0         
		//   21   37:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   22   40:getfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
		//   23   43:astore          4
				mVpa.mStartAction = null;
		//   24   45:aload_0         
		//   25   46:getfield        #20  <Field ViewPropertyAnimatorCompat mVpa>
		//   26   49:aconst_null     
		//   27   50:putfield        #63  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
				runnable.run();
		//   28   53:aload           4
		//   29   55:invokeinterface #57  <Method void Runnable.run()>
			}
			Object obj = view.getTag(0x7e000000);
		//   30   60:aload_1         
		//   31   61:ldc1            #24  <Int 0x7e000000>
		//   32   63:invokevirtual   #30  <Method Object View.getTag(int)>
		//   33   66:astore          4
			if(obj instanceof ViewPropertyAnimatorListener)
		//*  34   68:aload           4
		//*  35   70:instanceof      #6   <Class ViewPropertyAnimatorListener>
		//*  36   73:ifeq            82
				viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
		//   37   76:aload           4
		//   38   78:checkcast       #6   <Class ViewPropertyAnimatorListener>
		//   39   81:astore_3        
			if(viewpropertyanimatorlistener != null)
		//*  40   82:aload_3         
		//*  41   83:ifnull          93
				viewpropertyanimatorlistener.onAnimationStart(view);
		//   42   86:aload_3         
		//   43   87:aload_1         
		//   44   88:invokeinterface #65  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
		//   45   93:return          
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
	//    1    1:invokespecial   #24  <Method void Object()>
		mStartAction = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field Runnable mStartAction>
		mEndAction = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field Runnable mEndAction>
		mOldLayerType = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #30  <Field int mOldLayerType>
		mView = new WeakReference(((Object) (view)));
	//   11   19:aload_0         
	//   12   20:new             #32  <Class WeakReference>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:invokespecial   #35  <Method void WeakReference(Object)>
	//   16   28:putfield        #37  <Field WeakReference mView>
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
	//    3    5:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    4    8:new             #6   <Class ViewPropertyAnimatorCompat$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokespecial   #49  <Method void ViewPropertyAnimatorCompat$1(ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, View)>
	//   10   18:invokevirtual   #55  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   11   21:pop             
			return;
	//   12   22:return          
		} else
		{
			view.animate().setListener(((android.animation.Animator.AnimatorListener) (null)));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #55  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   17   31:pop             
			return;
	//   18   32:return          
		}
	}

	public ViewPropertyAnimatorCompat alpha(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().alpha(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #64  <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void cancel()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().cancel();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #67  <Method void ViewPropertyAnimator.cancel()>
	//   10   22:return          
	}

	public long getDuration()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			return view.animate().getDuration();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #71  <Method long ViewPropertyAnimator.getDuration()>
	//   10   22:lreturn         
		else
			return 0L;
	//   11   23:lconst_0        
	//   12   24:lreturn         
	}

	public ViewPropertyAnimatorCompat setDuration(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setDuration(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #76  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//    7   15:aload_2         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #81  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          51
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          31
			{
				setListenerInternal(view, viewpropertyanimatorlistener);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #89  <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
				return this;
	//   14   29:aload_0         
	//   15   30:areturn         
			}
			view.setTag(0x7e000000, ((Object) (viewpropertyanimatorlistener)));
	//   16   31:aload_2         
	//   17   32:ldc1            #90  <Int 0x7e000000>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #94  <Method void View.setTag(int, Object)>
			setListenerInternal(view, ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerApi14(this))));
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:new             #10  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokespecial   #97  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat)>
	//   26   48:invokespecial   #89  <Method void setListenerInternal(View, ViewPropertyAnimatorListener)>
		}
		return this;
	//   27   51:aload_0         
	//   28   52:areturn         
	}

	public ViewPropertyAnimatorCompat setStartDelay(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setStartDelay(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #100 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener listener)
	{
		final View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
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
	//   19   36:invokespecial   #105 <Method void ViewPropertyAnimatorCompat$2(ViewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener, View)>
	//   20   39:astore_2        
			view.animate().setUpdateListener(animatorupdatelistener);
	//   21   40:aload_3         
	//   22   41:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #108 <Method ViewPropertyAnimator ViewPropertyAnimator.setUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
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
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().start();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #111 <Method void ViewPropertyAnimator.start()>
	//   10   22:return          
	}

	public ViewPropertyAnimatorCompat translationY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WeakReference mView>
	//    2    4:invokevirtual   #61  <Method Object WeakReference.get()>
	//    3    7:checkcast       #42  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #46  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #114 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	Runnable mEndAction;
	int mOldLayerType;
	Runnable mStartAction;
	private WeakReference mView;
}
