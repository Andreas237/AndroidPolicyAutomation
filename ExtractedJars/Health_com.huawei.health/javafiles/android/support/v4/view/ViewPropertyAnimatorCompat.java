// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener, ViewPropertyAnimatorCompatJB, ViewPropertyAnimatorCompatICS, 
//			ViewPropertyAnimatorCompatKK

public final class ViewPropertyAnimatorCompat
{
	static class ViewPropertyAnimatorCompatApi16Impl extends ViewPropertyAnimatorCompatBaseImpl
	{

		public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
		{
			ViewPropertyAnimatorCompatJB.setListener(view, viewpropertyanimatorlistener);
		//    0    0:aload_2         
		//    1    1:aload_3         
		//    2    2:invokestatic    #22  <Method void ViewPropertyAnimatorCompatJB.setListener(View, ViewPropertyAnimatorListener)>
		//    3    5:return          
		}

		public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
		{
			view.animate().withEndAction(runnable);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
		//    2    4:aload_3         
		//    3    5:invokevirtual   #35  <Method ViewPropertyAnimator ViewPropertyAnimator.withEndAction(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
		{
			view.animate().withLayer();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
		//    2    4:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.withLayer()>
		//    3    7:pop             
		//    4    8:return          
		}

		public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
		{
			view.animate().withStartAction(runnable);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
		//    2    4:aload_3         
		//    3    5:invokevirtual   #42  <Method ViewPropertyAnimator ViewPropertyAnimator.withStartAction(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		ViewPropertyAnimatorCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class ViewPropertyAnimatorCompatApi18Impl extends ViewPropertyAnimatorCompatApi16Impl
	{

		public Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
		{
			return (Interpolator)view.animate().getInterpolator();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
		//    2    4:invokevirtual   #28  <Method android.animation.TimeInterpolator ViewPropertyAnimator.getInterpolator()>
		//    3    7:checkcast       #30  <Class Interpolator>
		//    4   10:areturn         
		}

		ViewPropertyAnimatorCompatApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class ViewPropertyAnimatorCompatApi19Impl extends ViewPropertyAnimatorCompatApi18Impl
	{

		public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
		{
			ViewPropertyAnimatorCompatKK.setUpdateListener(view, viewpropertyanimatorupdatelistener);
		//    0    0:aload_2         
		//    1    1:aload_3         
		//    2    2:invokestatic    #22  <Method void ViewPropertyAnimatorCompatKK.setUpdateListener(View, ViewPropertyAnimatorUpdateListener)>
		//    3    5:return          
		}

		ViewPropertyAnimatorCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl()>
		//    2    4:return          
		}
	}

	static class ViewPropertyAnimatorCompatApi21Impl extends ViewPropertyAnimatorCompatApi19Impl
	{

		public void translationZ(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
			view.animate().translationZ(f);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
		//    2    4:fload_3         
		//    3    5:invokevirtual   #28  <Method ViewPropertyAnimator ViewPropertyAnimator.translationZ(float)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void translationZBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
			view.animate().translationZBy(f);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
		//    2    4:fload_3         
		//    3    5:invokevirtual   #31  <Method ViewPropertyAnimator ViewPropertyAnimator.translationZBy(float)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void z(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
			view.animate().z(f);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
		//    2    4:fload_3         
		//    3    5:invokevirtual   #34  <Method ViewPropertyAnimator ViewPropertyAnimator.z(float)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void zBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
			view.animate().zBy(f);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
		//    2    4:fload_3         
		//    3    5:invokevirtual   #37  <Method ViewPropertyAnimator ViewPropertyAnimator.zBy(float)>
		//    4    8:pop             
		//    5    9:return          
		}

		ViewPropertyAnimatorCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl()>
		//    2    4:return          
		}
	}

	static class ViewPropertyAnimatorCompatBaseImpl
		implements ViewPropertyAnimatorCompatImpl
	{

		public Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
		{
			view.setTag(0x7e000000, ((Object) (viewpropertyanimatorlistener)));
		//    0    0:aload_2         
		//    1    1:ldc1            #22  <Int 0x7e000000>
		//    2    3:aload_3         
		//    3    4:invokevirtual   #28  <Method void View.setTag(int, Object)>
			ViewPropertyAnimatorCompatICS.setListener(view, ((ViewPropertyAnimatorListener) (new MyVpaListener(viewpropertyanimatorcompat))));
		//    4    7:aload_2         
		//    5    8:new             #11  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener>
		//    6   11:dup             
		//    7   12:aload_1         
		//    8   13:invokespecial   #31  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener(ViewPropertyAnimatorCompat)>
		//    9   16:invokestatic    #36  <Method void ViewPropertyAnimatorCompatICS.setListener(View, ViewPropertyAnimatorListener)>
		//   10   19:return          
		}

		public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
		{
		//    0    0:return          
		}

		public void translationZ(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
		//    0    0:return          
		}

		public void translationZBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
		//    0    0:return          
		}

		public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
		{
			ViewPropertyAnimatorCompatICS.setListener(view, ((ViewPropertyAnimatorListener) (new MyVpaListener(viewpropertyanimatorcompat))));
		//    0    0:aload_2         
		//    1    1:new             #11  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #31  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener(ViewPropertyAnimatorCompat)>
		//    5    9:invokestatic    #36  <Method void ViewPropertyAnimatorCompatICS.setListener(View, ViewPropertyAnimatorListener)>
			viewpropertyanimatorcompat.mEndAction = runnable;
		//    6   12:aload_1         
		//    7   13:aload_3         
		//    8   14:putfield        #47  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
		//    9   17:return          
		}

		public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
		{
			viewpropertyanimatorcompat.mOldLayerType = view.getLayerType();
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #53  <Method int View.getLayerType()>
		//    3    5:putfield        #57  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
			ViewPropertyAnimatorCompatICS.setListener(view, ((ViewPropertyAnimatorListener) (new MyVpaListener(viewpropertyanimatorcompat))));
		//    4    8:aload_2         
		//    5    9:new             #11  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #31  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener(ViewPropertyAnimatorCompat)>
		//    9   17:invokestatic    #36  <Method void ViewPropertyAnimatorCompatICS.setListener(View, ViewPropertyAnimatorListener)>
		//   10   20:return          
		}

		public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
		{
			ViewPropertyAnimatorCompatICS.setListener(view, ((ViewPropertyAnimatorListener) (new MyVpaListener(viewpropertyanimatorcompat))));
		//    0    0:aload_2         
		//    1    1:new             #11  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #31  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl$MyVpaListener(ViewPropertyAnimatorCompat)>
		//    5    9:invokestatic    #36  <Method void ViewPropertyAnimatorCompatICS.setListener(View, ViewPropertyAnimatorListener)>
			viewpropertyanimatorcompat.mStartAction = runnable;
		//    6   12:aload_1         
		//    7   13:aload_3         
		//    8   14:putfield        #61  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
		//    9   17:return          
		}

		public void z(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
		//    0    0:return          
		}

		public void zBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
		{
		//    0    0:return          
		}

		ViewPropertyAnimatorCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ViewPropertyAnimatorCompatBaseImpl.MyVpaListener
		implements ViewPropertyAnimatorListener
	{

		public void onAnimationCancel(View view)
		{
			Object obj = view.getTag(0x7e000000);
		//    0    0:aload_1         
		//    1    1:ldc1            #27  <Int 0x7e000000>
		//    2    3:invokevirtual   #33  <Method Object View.getTag(int)>
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
		//   16   27:invokeinterface #35  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
		//   17   32:return          
		}

		public void onAnimationEnd(View view)
		{
			if(mVpa.mOldLayerType >= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//*   2    4:getfield        #40  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//*   3    7:iflt            30
			{
				view.setLayerType(mVpa.mOldLayerType, ((android.graphics.Paint) (null)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//    7   15:getfield        #40  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//    8   18:aconst_null     
		//    9   19:invokevirtual   #44  <Method void View.setLayerType(int, android.graphics.Paint)>
				mVpa.mOldLayerType = -1;
		//   10   22:aload_0         
		//   11   23:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//   12   26:iconst_m1       
		//   13   27:putfield        #40  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
			}
			if(android.os.Build.VERSION.SDK_INT >= 16 || !mAnimEndCalled)
		//*  14   30:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
		//*  15   33:bipush          16
		//*  16   35:icmpge          45
		//*  17   38:aload_0         
		//*  18   39:getfield        #51  <Field boolean mAnimEndCalled>
		//*  19   42:ifne            114
			{
				if(mVpa.mEndAction != null)
		//*  20   45:aload_0         
		//*  21   46:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//*  22   49:getfield        #55  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
		//*  23   52:ifnull          77
				{
					Runnable runnable = mVpa.mEndAction;
		//   24   55:aload_0         
		//   25   56:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//   26   59:getfield        #55  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
		//   27   62:astore_2        
					mVpa.mEndAction = null;
		//   28   63:aload_0         
		//   29   64:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//   30   67:aconst_null     
		//   31   68:putfield        #55  <Field Runnable ViewPropertyAnimatorCompat.mEndAction>
					runnable.run();
		//   32   71:aload_2         
		//   33   72:invokeinterface #60  <Method void Runnable.run()>
				}
				Object obj = view.getTag(0x7e000000);
		//   34   77:aload_1         
		//   35   78:ldc1            #27  <Int 0x7e000000>
		//   36   80:invokevirtual   #33  <Method Object View.getTag(int)>
		//   37   83:astore_3        
				ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
		//   38   84:aconst_null     
		//   39   85:astore_2        
				if(obj instanceof ViewPropertyAnimatorListener)
		//*  40   86:aload_3         
		//*  41   87:instanceof      #6   <Class ViewPropertyAnimatorListener>
		//*  42   90:ifeq            98
					viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
		//   43   93:aload_3         
		//   44   94:checkcast       #6   <Class ViewPropertyAnimatorListener>
		//   45   97:astore_2        
				if(viewpropertyanimatorlistener != null)
		//*  46   98:aload_2         
		//*  47   99:ifnull          109
					viewpropertyanimatorlistener.onAnimationEnd(view);
		//   48  102:aload_2         
		//   49  103:aload_1         
		//   50  104:invokeinterface #62  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
				mAnimEndCalled = true;
		//   51  109:aload_0         
		//   52  110:iconst_1        
		//   53  111:putfield        #51  <Field boolean mAnimEndCalled>
			}
		//   54  114:return          
		}

		public void onAnimationStart(View view)
		{
			mAnimEndCalled = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #51  <Field boolean mAnimEndCalled>
			if(mVpa.mOldLayerType >= 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//*   5    9:getfield        #40  <Field int ViewPropertyAnimatorCompat.mOldLayerType>
		//*   6   12:iflt            21
				view.setLayerType(2, ((android.graphics.Paint) (null)));
		//    7   15:aload_1         
		//    8   16:iconst_2        
		//    9   17:aconst_null     
		//   10   18:invokevirtual   #44  <Method void View.setLayerType(int, android.graphics.Paint)>
			if(mVpa.mStartAction != null)
		//*  11   21:aload_0         
		//*  12   22:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//*  13   25:getfield        #66  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
		//*  14   28:ifnull          53
			{
				Runnable runnable = mVpa.mStartAction;
		//   15   31:aload_0         
		//   16   32:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//   17   35:getfield        #66  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
		//   18   38:astore_2        
				mVpa.mStartAction = null;
		//   19   39:aload_0         
		//   20   40:getfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//   21   43:aconst_null     
		//   22   44:putfield        #66  <Field Runnable ViewPropertyAnimatorCompat.mStartAction>
				runnable.run();
		//   23   47:aload_2         
		//   24   48:invokeinterface #60  <Method void Runnable.run()>
			}
			Object obj = view.getTag(0x7e000000);
		//   25   53:aload_1         
		//   26   54:ldc1            #27  <Int 0x7e000000>
		//   27   56:invokevirtual   #33  <Method Object View.getTag(int)>
		//   28   59:astore_3        
			ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
		//   29   60:aconst_null     
		//   30   61:astore_2        
			if(obj instanceof ViewPropertyAnimatorListener)
		//*  31   62:aload_3         
		//*  32   63:instanceof      #6   <Class ViewPropertyAnimatorListener>
		//*  33   66:ifeq            74
				viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
		//   34   69:aload_3         
		//   35   70:checkcast       #6   <Class ViewPropertyAnimatorListener>
		//   36   73:astore_2        
			if(viewpropertyanimatorlistener != null)
		//*  37   74:aload_2         
		//*  38   75:ifnull          85
				viewpropertyanimatorlistener.onAnimationStart(view);
		//   39   78:aload_2         
		//   40   79:aload_1         
		//   41   80:invokeinterface #68  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
		//   42   85:return          
		}

		boolean mAnimEndCalled;
		ViewPropertyAnimatorCompat mVpa;

		ViewPropertyAnimatorCompatBaseImpl.MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mVpa = viewpropertyanimatorcompat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field ViewPropertyAnimatorCompat mVpa>
		//    5    9:return          
		}
	}

	static interface ViewPropertyAnimatorCompatImpl
	{

		public abstract Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

		public abstract void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

		public abstract void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener);

		public abstract void translationZ(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

		public abstract void translationZBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

		public abstract void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

		public abstract void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

		public abstract void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

		public abstract void z(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

		public abstract void zBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
	}


	ViewPropertyAnimatorCompat(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mStartAction = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #62  <Field Runnable mStartAction>
		mEndAction = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #64  <Field Runnable mEndAction>
		mOldLayerType = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #66  <Field int mOldLayerType>
		mView = new WeakReference(((Object) (view)));
	//   11   19:aload_0         
	//   12   20:new             #68  <Class WeakReference>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:invokespecial   #71  <Method void WeakReference(Object)>
	//   16   28:putfield        #73  <Field WeakReference mView>
	//   17   31:return          
	}

	public ViewPropertyAnimatorCompat alpha(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().alpha(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #90  <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat alphaBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().alphaBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #93  <Method ViewPropertyAnimator ViewPropertyAnimator.alphaBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void cancel()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().cancel();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #96  <Method void ViewPropertyAnimator.cancel()>
	//   10   22:return          
	}

	public long getDuration()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			return view.animate().getDuration();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #100 <Method long ViewPropertyAnimator.getDuration()>
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
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
			return IMPL.getInterpolator(this, view);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #105 <Method Interpolator ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.getInterpolator(ViewPropertyAnimatorCompat, View)>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public long getStartDelay()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			return view.animate().getStartDelay();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #108 <Method long ViewPropertyAnimator.getStartDelay()>
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
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotation(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #111 <Method ViewPropertyAnimator ViewPropertyAnimator.rotation(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #114 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #117 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #120 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #123 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat rotationYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().rotationYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #126 <Method ViewPropertyAnimator ViewPropertyAnimator.rotationYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat scaleYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().scaleYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #138 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setDuration(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setDuration(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #143 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #148 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.setListener(this, view, viewpropertyanimatorlistener);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokeinterface #153 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.setListener(ViewPropertyAnimatorCompat, View, ViewPropertyAnimatorListener)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat setStartDelay(long l)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          24
			view.animate().setStartDelay(l);
	//    7   15:aload_3         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:lload_1         
	//   10   20:invokevirtual   #156 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat setUpdateListener(ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.setUpdateListener(this, view, viewpropertyanimatorupdatelistener);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokeinterface #161 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.setUpdateListener(ViewPropertyAnimatorCompat, View, ViewPropertyAnimatorUpdateListener)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public void start()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			view.animate().start();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:invokevirtual   #164 <Method void ViewPropertyAnimator.start()>
	//   10   22:return          
	}

	public ViewPropertyAnimatorCompat translationX(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationX(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #167 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationXBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationXBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #170 <Method ViewPropertyAnimator ViewPropertyAnimator.translationXBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationY(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationY(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #173 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationYBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().translationYBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #176 <Method ViewPropertyAnimator ViewPropertyAnimator.translationYBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat translationZ(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.translationZ(this, view, f);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:fload_1         
	//   11   21:invokeinterface #180 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.translationZ(ViewPropertyAnimatorCompat, View, float)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat translationZBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.translationZBy(this, view, f);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:fload_1         
	//   11   21:invokeinterface #183 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.translationZBy(ViewPropertyAnimatorCompat, View, float)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat withEndAction(Runnable runnable)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.withEndAction(this, view, runnable);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokeinterface #188 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.withEndAction(ViewPropertyAnimatorCompat, View, Runnable)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat withLayer()
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_1        
		if(view != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          25
			IMPL.withLayer(this, view);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #193 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.withLayer(ViewPropertyAnimatorCompat, View)>
		return this;
	//   11   25:aload_0         
	//   12   26:areturn         
	}

	public ViewPropertyAnimatorCompat withStartAction(Runnable runnable)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.withStartAction(this, view, runnable);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokeinterface #196 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.withStartAction(ViewPropertyAnimatorCompat, View, Runnable)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat x(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().x(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #199 <Method ViewPropertyAnimator ViewPropertyAnimator.x(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat xBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().xBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #202 <Method ViewPropertyAnimator ViewPropertyAnimator.xBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat y(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().y(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #205 <Method ViewPropertyAnimator ViewPropertyAnimator.y(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat yBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			view.animate().yBy(f);
	//    7   15:aload_2         
	//    8   16:invokevirtual   #85  <Method ViewPropertyAnimator View.animate()>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #208 <Method ViewPropertyAnimator ViewPropertyAnimator.yBy(float)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ViewPropertyAnimatorCompat z(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.z(this, view, f);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:fload_1         
	//   11   21:invokeinterface #211 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.z(ViewPropertyAnimatorCompat, View, float)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ViewPropertyAnimatorCompat zBy(float f)
	{
		View view = (View)mView.get();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field WeakReference mView>
	//    2    4:invokevirtual   #79  <Method Object WeakReference.get()>
	//    3    7:checkcast       #81  <Class View>
	//    4   10:astore_2        
		if(view != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			IMPL.zBy(this, view, f);
	//    7   15:getstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    8   18:aload_0         
	//    9   19:aload_2         
	//   10   20:fload_1         
	//   11   21:invokeinterface #214 <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl.zBy(ViewPropertyAnimatorCompat, View, float)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	static final ViewPropertyAnimatorCompatImpl IMPL;
	static final int LISTENER_TAG_ID = 0x7e000000;
	private static final String TAG = "ViewAnimatorCompat";
	Runnable mEndAction;
	int mOldLayerType;
	Runnable mStartAction;
	private WeakReference mView;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((ViewPropertyAnimatorCompatImpl) (new ViewPropertyAnimatorCompatApi21Impl()));
	//    3    8:new             #15  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi21Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #51  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi21Impl()>
	//    6   15:putstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   8   19:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          19
	//*  10   24:icmplt          38
			IMPL = ((ViewPropertyAnimatorCompatImpl) (new ViewPropertyAnimatorCompatApi19Impl()));
	//   11   27:new             #12  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #54  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl()>
	//   14   34:putstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  16   38:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          18
	//*  18   43:icmplt          57
			IMPL = ((ViewPropertyAnimatorCompatImpl) (new ViewPropertyAnimatorCompatApi18Impl()));
	//   19   46:new             #9   <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl>
	//   20   49:dup             
	//   21   50:invokespecial   #55  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl()>
	//   22   53:putstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//   23   56:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  24   57:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   60:bipush          16
	//*  26   62:icmplt          76
			IMPL = ((ViewPropertyAnimatorCompatImpl) (new ViewPropertyAnimatorCompatApi16Impl()));
	//   27   65:new             #6   <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl>
	//   28   68:dup             
	//   29   69:invokespecial   #56  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl()>
	//   30   72:putstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//   31   75:return          
		else
			IMPL = ((ViewPropertyAnimatorCompatImpl) (new ViewPropertyAnimatorCompatBaseImpl()));
	//   32   76:new             #18  <Class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl>
	//   33   79:dup             
	//   34   80:invokespecial   #57  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl()>
	//   35   83:putstatic       #53  <Field ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL>
	//*  36   86:return          
	}
}
