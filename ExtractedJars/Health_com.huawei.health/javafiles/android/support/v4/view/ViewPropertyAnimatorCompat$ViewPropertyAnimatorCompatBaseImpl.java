// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatICS, ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl
	implements ViewPropertyAnimatorCompat.ViewPropertyAnimatorCompatImpl
{
	static class MyVpaListener
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

		MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
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

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
