// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.support.v4.view.*;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{

	public ViewPropertyAnimatorCompatSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mDuration = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #28  <Long -1L>
	//    4    8:putfield        #31  <Field long mDuration>
	//    5   11:aload_0         
	//    6   12:new             #6   <Class ViewPropertyAnimatorCompatSet$1>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #34  <Method void ViewPropertyAnimatorCompatSet$1(ViewPropertyAnimatorCompatSet)>
	//   10   20:putfield        #36  <Field ViewPropertyAnimatorListenerAdapter mProxyListener>
	//   11   23:aload_0         
	//   12   24:new             #38  <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #39  <Method void ArrayList()>
	//   15   31:putfield        #41  <Field ArrayList mAnimators>
	//   16   34:return          
	}

	public void cancel()
	{
		if(!mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		for(Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ((ViewPropertyAnimatorCompat)iterator.next()).cancel());
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field ArrayList mAnimators>
	//    6   12:invokevirtual   #49  <Method Iterator ArrayList.iterator()>
	//    7   15:astore_1        
	//    8   16:aload_1         
	//    9   17:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            40
	//   11   25:aload_1         
	//   12   26:invokeinterface #59  <Method Object Iterator.next()>
	//   13   31:checkcast       #61  <Class ViewPropertyAnimatorCompat>
	//   14   34:invokevirtual   #63  <Method void ViewPropertyAnimatorCompat.cancel()>
	//*  15   37:goto            16
		mIsStarted = false;
	//   16   40:aload_0         
	//   17   41:iconst_0        
	//   18   42:putfield        #45  <Field boolean mIsStarted>
	//   19   45:return          
	}

	void onAnimationsEnded()
	{
		mIsStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field boolean mIsStarted>
	//    3    5:return          
	}

	public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
	{
		if(!mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifne            16
			mAnimators.add(((Object) (viewpropertyanimatorcompat)));
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field ArrayList mAnimators>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, ViewPropertyAnimatorCompat viewpropertyanimatorcompat1)
	{
		mAnimators.add(((Object) (viewpropertyanimatorcompat)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ArrayList mAnimators>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		viewpropertyanimatorcompat1.setStartDelay(viewpropertyanimatorcompat.getDuration());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #76  <Method long ViewPropertyAnimatorCompat.getDuration()>
	//    8   14:invokevirtual   #80  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setStartDelay(long)>
	//    9   17:pop             
		mAnimators.add(((Object) (viewpropertyanimatorcompat1)));
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field ArrayList mAnimators>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public ViewPropertyAnimatorCompatSet setDuration(long l)
	{
		if(!mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifne            12
			mDuration = l;
	//    3    7:aload_0         
	//    4    8:lload_1         
	//    5    9:putfield        #31  <Field long mDuration>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator)
	{
		if(!mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifne            12
			mInterpolator = interpolator;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #86  <Field Interpolator mInterpolator>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		if(!mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifne            12
			mListener = viewpropertyanimatorlistener;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #90  <Field ViewPropertyAnimatorListener mListener>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public void start()
	{
		if(mIsStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mIsStarted>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
		for(Iterator iterator = mAnimators.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.start())
	//*   4    8:aload_0         
	//*   5    9:getfield        #41  <Field ArrayList mAnimators>
	//*   6   12:invokevirtual   #49  <Method Iterator ArrayList.iterator()>
	//*   7   15:astore_3        
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            98
		{
			viewpropertyanimatorcompat = (ViewPropertyAnimatorCompat)iterator.next();
	//   11   25:aload_3         
	//   12   26:invokeinterface #59  <Method Object Iterator.next()>
	//   13   31:checkcast       #61  <Class ViewPropertyAnimatorCompat>
	//   14   34:astore          4
			long l = mDuration;
	//   15   36:aload_0         
	//   16   37:getfield        #31  <Field long mDuration>
	//   17   40:lstore_1        
			if(l >= 0L)
	//*  18   41:lload_1         
	//*  19   42:lconst_0        
	//*  20   43:lcmp            
	//*  21   44:iflt            54
				viewpropertyanimatorcompat.setDuration(l);
	//   22   47:aload           4
	//   23   49:lload_1         
	//   24   50:invokevirtual   #93  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//   25   53:pop             
			Interpolator interpolator = mInterpolator;
	//   26   54:aload_0         
	//   27   55:getfield        #86  <Field Interpolator mInterpolator>
	//   28   58:astore          5
			if(interpolator != null)
	//*  29   60:aload           5
	//*  30   62:ifnull          73
				viewpropertyanimatorcompat.setInterpolator(interpolator);
	//   31   65:aload           4
	//   32   67:aload           5
	//   33   69:invokevirtual   #96  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setInterpolator(Interpolator)>
	//   34   72:pop             
			if(mListener != null)
	//*  35   73:aload_0         
	//*  36   74:getfield        #90  <Field ViewPropertyAnimatorListener mListener>
	//*  37   77:ifnull          90
				viewpropertyanimatorcompat.setListener(((ViewPropertyAnimatorListener) (mProxyListener)));
	//   38   80:aload           4
	//   39   82:aload_0         
	//   40   83:getfield        #36  <Field ViewPropertyAnimatorListenerAdapter mProxyListener>
	//   41   86:invokevirtual   #99  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(ViewPropertyAnimatorListener)>
	//   42   89:pop             
		}

	//   43   90:aload           4
	//   44   92:invokevirtual   #101 <Method void ViewPropertyAnimatorCompat.start()>
	//*  45   95:goto            16
		mIsStarted = true;
	//   46   98:aload_0         
	//   47   99:iconst_1        
	//   48  100:putfield        #45  <Field boolean mIsStarted>
	//   49  103:return          
	}

	final ArrayList mAnimators = new ArrayList();
	private long mDuration;
	private Interpolator mInterpolator;
	private boolean mIsStarted;
	ViewPropertyAnimatorListener mListener;
	private final ViewPropertyAnimatorListenerAdapter mProxyListener = new ViewPropertyAnimatorListenerAdapter() {

		public void onAnimationEnd(View view)
		{
			int i = mProxyEndCount + 1;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int mProxyEndCount>
		//    2    4:iconst_1        
		//    3    5:iadd            
		//    4    6:istore_2        
			mProxyEndCount = i;
		//    5    7:aload_0         
		//    6    8:iload_2         
		//    7    9:putfield        #23  <Field int mProxyEndCount>
			if(i == mAnimators.size())
		//*   8   12:iload_2         
		//*   9   13:aload_0         
		//*  10   14:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//*  11   17:getfield        #30  <Field ArrayList ViewPropertyAnimatorCompatSet.mAnimators>
		//*  12   20:invokevirtual   #36  <Method int ArrayList.size()>
		//*  13   23:icmpne          53
			{
				if(mListener != null)
		//*  14   26:aload_0         
		//*  15   27:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//*  16   30:getfield        #40  <Field ViewPropertyAnimatorListener ViewPropertyAnimatorCompatSet.mListener>
		//*  17   33:ifnull          49
					mListener.onAnimationEnd(((View) (null)));
		//   18   36:aload_0         
		//   19   37:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//   20   40:getfield        #40  <Field ViewPropertyAnimatorListener ViewPropertyAnimatorCompatSet.mListener>
		//   21   43:aconst_null     
		//   22   44:invokeinterface #44  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
				onEnd();
		//   23   49:aload_0         
		//   24   50:invokevirtual   #47  <Method void onEnd()>
			}
		//   25   53:return          
		}

		public void onAnimationStart(View view)
		{
			if(mProxyStarted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field boolean mProxyStarted>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			mProxyStarted = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #21  <Field boolean mProxyStarted>
			if(mListener != null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//*   9   17:getfield        #40  <Field ViewPropertyAnimatorListener ViewPropertyAnimatorCompatSet.mListener>
		//*  10   20:ifnull          36
				mListener.onAnimationStart(((View) (null)));
		//   11   23:aload_0         
		//   12   24:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//   13   27:getfield        #40  <Field ViewPropertyAnimatorListener ViewPropertyAnimatorCompatSet.mListener>
		//   14   30:aconst_null     
		//   15   31:invokeinterface #50  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
		//   16   36:return          
		}

		void onEnd()
		{
			mProxyEndCount = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #23  <Field int mProxyEndCount>
			mProxyStarted = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #21  <Field boolean mProxyStarted>
			onAnimationsEnded();
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
		//    8   14:invokevirtual   #53  <Method void ViewPropertyAnimatorCompatSet.onAnimationsEnded()>
		//    9   17:return          
		}

		private int mProxyEndCount;
		private boolean mProxyStarted;
		final ViewPropertyAnimatorCompatSet this$0;

			
			{
				this$0 = ViewPropertyAnimatorCompatSet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ViewPropertyAnimatorCompatSet this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void ViewPropertyAnimatorListenerAdapter()>
				mProxyStarted = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #21  <Field boolean mProxyStarted>
				mProxyEndCount = 0;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #23  <Field int mProxyEndCount>
			//   11   19:return          
			}
	}
;
}
