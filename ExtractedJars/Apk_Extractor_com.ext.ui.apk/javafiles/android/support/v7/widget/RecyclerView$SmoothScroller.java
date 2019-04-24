// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$SmoothScroller
{
	public static class Action
	{

		private void validate()
		{
			if(mInterpolator != null && mDuration < 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field Interpolator mInterpolator>
		//*   2    4:ifnull          25
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field int mDuration>
		//*   5   11:iconst_1        
		//*   6   12:icmpge          25
				throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
		//    7   15:new             #49  <Class IllegalStateException>
		//    8   18:dup             
		//    9   19:ldc1            #51  <String "If you provide an interpolator, you must set a positive duration">
		//   10   21:invokespecial   #54  <Method void IllegalStateException(String)>
		//   11   24:athrow          
			if(mDuration < 1)
		//*  12   25:aload_0         
		//*  13   26:getfield        #44  <Field int mDuration>
		//*  14   29:iconst_1        
		//*  15   30:icmpge          43
				throw new IllegalStateException("Scroll duration must be a positive number");
		//   16   33:new             #49  <Class IllegalStateException>
		//   17   36:dup             
		//   18   37:ldc1            #56  <String "Scroll duration must be a positive number">
		//   19   39:invokespecial   #54  <Method void IllegalStateException(String)>
		//   20   42:athrow          
			else
				return;
		//   21   43:return          
		}

		public int getDuration()
		{
			return mDuration;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int mDuration>
		//    2    4:ireturn         
		}

		public int getDx()
		{
			return mDx;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int mDx>
		//    2    4:ireturn         
		}

		public int getDy()
		{
			return mDy;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int mDy>
		//    2    4:ireturn         
		}

		public Interpolator getInterpolator()
		{
			return mInterpolator;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Interpolator mInterpolator>
		//    2    4:areturn         
		}

		boolean hasJumpTarget()
		{
			return mJumpToPosition >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int mJumpToPosition>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public void jumpTo(int i)
		{
			mJumpToPosition = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #34  <Field int mJumpToPosition>
		//    3    5:return          
		}

		void runIfNecessary(RecyclerView recyclerview)
		{
			if(mJumpToPosition >= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field int mJumpToPosition>
		//*   2    4:iflt            28
			{
				int i = mJumpToPosition;
		//    3    7:aload_0         
		//    4    8:getfield        #34  <Field int mJumpToPosition>
		//    5   11:istore_2        
				mJumpToPosition = -1;
		//    6   12:aload_0         
		//    7   13:iconst_m1       
		//    8   14:putfield        #34  <Field int mJumpToPosition>
				recyclerview.jumpToPositionForSmoothScroller(i);
		//    9   17:aload_1         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #71  <Method void RecyclerView.jumpToPositionForSmoothScroller(int)>
				mChanged = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #36  <Field boolean mChanged>
				return;
		//   15   27:return          
			}
			if(mChanged)
		//*  16   28:aload_0         
		//*  17   29:getfield        #36  <Field boolean mChanged>
		//*  18   32:ifeq            151
			{
				validate();
		//   19   35:aload_0         
		//   20   36:invokespecial   #73  <Method void validate()>
				if(mInterpolator == null)
		//*  21   39:aload_0         
		//*  22   40:getfield        #46  <Field Interpolator mInterpolator>
		//*  23   43:ifnonnull       125
				{
					if(mDuration == 0x80000000)
		//*  24   46:aload_0         
		//*  25   47:getfield        #44  <Field int mDuration>
		//*  26   50:ldc1            #13  <Int 0x80000000>
		//*  27   52:icmpne          103
						recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy);
		//   28   55:aload_1         
		//   29   56:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   30   59:aload_0         
		//   31   60:getfield        #40  <Field int mDx>
		//   32   63:aload_0         
		//   33   64:getfield        #42  <Field int mDy>
		//   34   67:invokevirtual   #82  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int)>
					else
		//*  35   70:aload_0         
		//*  36   71:aload_0         
		//*  37   72:getfield        #38  <Field int mConsecutiveUpdates>
		//*  38   75:iconst_1        
		//*  39   76:iadd            
		//*  40   77:putfield        #38  <Field int mConsecutiveUpdates>
		//*  41   80:aload_0         
		//*  42   81:getfield        #38  <Field int mConsecutiveUpdates>
		//*  43   84:bipush          10
		//*  44   86:icmple          97
		//*  45   89:ldc1            #84  <String "RecyclerView">
		//*  46   91:ldc1            #86  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
		//*  47   93:invokestatic    #92  <Method int Log.e(String, String)>
		//*  48   96:pop             
		//*  49   97:aload_0         
		//*  50   98:iconst_0        
		//*  51   99:putfield        #36  <Field boolean mChanged>
		//*  52  102:return          
						recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration);
		//   53  103:aload_1         
		//   54  104:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   55  107:aload_0         
		//   56  108:getfield        #40  <Field int mDx>
		//   57  111:aload_0         
		//   58  112:getfield        #42  <Field int mDy>
		//   59  115:aload_0         
		//   60  116:getfield        #44  <Field int mDuration>
		//   61  119:invokevirtual   #94  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int)>
				} else
		//*  62  122:goto            70
				{
					recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
		//   63  125:aload_1         
		//   64  126:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   65  129:aload_0         
		//   66  130:getfield        #40  <Field int mDx>
		//   67  133:aload_0         
		//   68  134:getfield        #42  <Field int mDy>
		//   69  137:aload_0         
		//   70  138:getfield        #44  <Field int mDuration>
		//   71  141:aload_0         
		//   72  142:getfield        #46  <Field Interpolator mInterpolator>
		//   73  145:invokevirtual   #96  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int, Interpolator)>
				}
				mConsecutiveUpdates = mConsecutiveUpdates + 1;
				if(mConsecutiveUpdates > 10)
					Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
				mChanged = false;
				return;
			} else
		//*  74  148:goto            70
			{
				mConsecutiveUpdates = 0;
		//   75  151:aload_0         
		//   76  152:iconst_0        
		//   77  153:putfield        #38  <Field int mConsecutiveUpdates>
				return;
		//   78  156:return          
			}
		}

		public void setDuration(int i)
		{
			mChanged = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #36  <Field boolean mChanged>
			mDuration = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #44  <Field int mDuration>
		//    6   10:return          
		}

		public void setDx(int i)
		{
			mChanged = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #36  <Field boolean mChanged>
			mDx = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #40  <Field int mDx>
		//    6   10:return          
		}

		public void setDy(int i)
		{
			mChanged = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #36  <Field boolean mChanged>
			mDy = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #42  <Field int mDy>
		//    6   10:return          
		}

		public void setInterpolator(Interpolator interpolator)
		{
			mChanged = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #36  <Field boolean mChanged>
			mInterpolator = interpolator;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #46  <Field Interpolator mInterpolator>
		//    6   10:return          
		}

		public void update(int i, int j, int k, Interpolator interpolator)
		{
			mDx = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #40  <Field int mDx>
			mDy = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #42  <Field int mDy>
			mDuration = k;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #44  <Field int mDuration>
			mInterpolator = interpolator;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #46  <Field Interpolator mInterpolator>
			mChanged = true;
		//   12   21:aload_0         
		//   13   22:iconst_1        
		//   14   23:putfield        #36  <Field boolean mChanged>
		//   15   26:return          
		}

		public static final int UNDEFINED_DURATION = 0x80000000;
		private boolean mChanged;
		private int mConsecutiveUpdates;
		private int mDuration;
		private int mDx;
		private int mDy;
		private Interpolator mInterpolator;
		private int mJumpToPosition;

		public Action(int i, int j)
		{
			this(i, j, 0x80000000, ((Interpolator) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:ldc1            #13  <Int 0x80000000>
		//    4    5:aconst_null     
		//    5    6:invokespecial   #27  <Method void RecyclerView$SmoothScroller$Action(int, int, int, Interpolator)>
		//    6    9:return          
		}

		public Action(int i, int j, int k)
		{
			this(i, j, k, ((Interpolator) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #27  <Method void RecyclerView$SmoothScroller$Action(int, int, int, Interpolator)>
		//    6    8:return          
		}

		public Action(int i, int j, int k, Interpolator interpolator)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			mJumpToPosition = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #34  <Field int mJumpToPosition>
			mChanged = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #36  <Field boolean mChanged>
			mConsecutiveUpdates = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #38  <Field int mConsecutiveUpdates>
			mDx = i;
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:putfield        #40  <Field int mDx>
			mDy = j;
		//   14   24:aload_0         
		//   15   25:iload_2         
		//   16   26:putfield        #42  <Field int mDy>
			mDuration = k;
		//   17   29:aload_0         
		//   18   30:iload_3         
		//   19   31:putfield        #44  <Field int mDuration>
			mInterpolator = interpolator;
		//   20   34:aload_0         
		//   21   35:aload           4
		//   22   37:putfield        #46  <Field Interpolator mInterpolator>
		//   23   40:return          
		}
	}

	public static interface ScrollVectorProvider
	{

		public abstract PointF computeScrollVectorForPosition(int i);
	}


	private void onAnimation(int i, int j)
	{
label0:
		{
			RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RecyclerView mRecyclerView>
	//    2    4:astore          4
			if(!mRunning || mTargetPosition == -1 || recyclerview == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #47  <Field boolean mRunning>
	//*   5   10:ifeq            26
	//*   6   13:aload_0         
	//*   7   14:getfield        #32  <Field int mTargetPosition>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          26
	//*  10   21:aload           4
	//*  11   23:ifnonnull       30
				stop();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #50  <Method void stop()>
			mPendingInitialRun = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #52  <Field boolean mPendingInitialRun>
			if(mTargetView != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #54  <Field View mTargetView>
	//*  19   39:ifnull          87
				if(getChildPosition(mTargetView) == mTargetPosition)
	//*  20   42:aload_0         
	//*  21   43:aload_0         
	//*  22   44:getfield        #54  <Field View mTargetView>
	//*  23   47:invokevirtual   #58  <Method int getChildPosition(View)>
	//*  24   50:aload_0         
	//*  25   51:getfield        #32  <Field int mTargetPosition>
	//*  26   54:icmpne          151
				{
					onTargetFound(mTargetView, recyclerview.mState, mRecyclingAction);
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #54  <Field View mTargetView>
	//   30   62:aload           4
	//   31   64:getfield        #62  <Field RecyclerView$State RecyclerView.mState>
	//   32   67:aload_0         
	//   33   68:getfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   34   71:invokevirtual   #66  <Method void onTargetFound(View, RecyclerView$State, RecyclerView$SmoothScroller$Action)>
					mRecyclingAction.runIfNecessary(recyclerview);
	//   35   74:aload_0         
	//   36   75:getfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   37   78:aload           4
	//   38   80:invokevirtual   #70  <Method void RecyclerView$SmoothScroller$Action.runIfNecessary(RecyclerView)>
					stop();
	//   39   83:aload_0         
	//   40   84:invokevirtual   #50  <Method void stop()>
				} else
	//*  41   87:aload_0         
	//*  42   88:getfield        #47  <Field boolean mRunning>
	//*  43   91:ifeq            150
	//*  44   94:aload_0         
	//*  45   95:iload_1         
	//*  46   96:iload_2         
	//*  47   97:aload           4
	//*  48   99:getfield        #62  <Field RecyclerView$State RecyclerView.mState>
	//*  49  102:aload_0         
	//*  50  103:getfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//*  51  106:invokevirtual   #74  <Method void onSeekTargetStep(int, int, RecyclerView$State, RecyclerView$SmoothScroller$Action)>
	//*  52  109:aload_0         
	//*  53  110:getfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//*  54  113:invokevirtual   #78  <Method boolean RecyclerView$SmoothScroller$Action.hasJumpTarget()>
	//*  55  116:istore_3        
	//*  56  117:aload_0         
	//*  57  118:getfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//*  58  121:aload           4
	//*  59  123:invokevirtual   #70  <Method void RecyclerView$SmoothScroller$Action.runIfNecessary(RecyclerView)>
	//*  60  126:iload_3         
	//*  61  127:ifeq            150
	//*  62  130:aload_0         
	//*  63  131:getfield        #47  <Field boolean mRunning>
	//*  64  134:ifeq            167
	//*  65  137:aload_0         
	//*  66  138:iconst_1        
	//*  67  139:putfield        #52  <Field boolean mPendingInitialRun>
	//*  68  142:aload           4
	//*  69  144:getfield        #82  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//*  70  147:invokevirtual   #87  <Method void RecyclerView$ViewFlinger.postOnAnimation()>
	//*  71  150:return          
				{
					Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
	//   72  151:ldc1            #89  <String "RecyclerView">
	//   73  153:ldc1            #91  <String "Passed over target position while smooth scrolling.">
	//   74  155:invokestatic    #97  <Method int Log.e(String, String)>
	//   75  158:pop             
					mTargetView = null;
	//   76  159:aload_0         
	//   77  160:aconst_null     
	//   78  161:putfield        #54  <Field View mTargetView>
				}
			if(mRunning)
			{
				onSeekTargetStep(i, j, recyclerview.mState, mRecyclingAction);
				boolean flag = mRecyclingAction.hasJumpTarget();
				mRecyclingAction.runIfNecessary(recyclerview);
				if(flag)
				{
					if(!mRunning)
						break label0;
					mPendingInitialRun = true;
					recyclerview.mViewFlinger.postOnAnimation();
				}
			}
			return;
		}
	//*  79  164:goto            87
		stop();
	//   80  167:aload_0         
	//   81  168:invokevirtual   #50  <Method void stop()>
	//   82  171:return          
	}

	public View findViewByPosition(int i)
	{
		return mRecyclerView.mLayout.findViewByPosition(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RecyclerView mRecyclerView>
	//    2    4:getfield        #102 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #106 <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//    5   11:areturn         
	}

	public int getChildCount()
	{
		return mRecyclerView.mLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RecyclerView mRecyclerView>
	//    2    4:getfield        #102 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    3    7:invokevirtual   #110 <Method int RecyclerView$LayoutManager.getChildCount()>
	//    4   10:ireturn         
	}

	public int getChildPosition(View view)
	{
		return mRecyclerView.getChildLayoutPosition(view);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RecyclerView mRecyclerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method int RecyclerView.getChildLayoutPosition(View)>
	//    4    8:ireturn         
	}

	public RecyclerView.LayoutManager getLayoutManager()
	{
		return mLayoutManager;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:areturn         
	}

	public int getTargetPosition()
	{
		return mTargetPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int mTargetPosition>
	//    2    4:ireturn         
	}

	public void instantScrollToPosition(int i)
	{
		mRecyclerView.scrollToPosition(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RecyclerView mRecyclerView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method void RecyclerView.scrollToPosition(int)>
	//    4    8:return          
	}

	public boolean isPendingInitialRun()
	{
		return mPendingInitialRun;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean mPendingInitialRun>
	//    2    4:ireturn         
	}

	public boolean isRunning()
	{
		return mRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean mRunning>
	//    2    4:ireturn         
	}

	protected void normalize(PointF pointf)
	{
		float f = (float)Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
	//    0    0:aload_1         
	//    1    1:getfield        #137 <Field float PointF.x>
	//    2    4:aload_1         
	//    3    5:getfield        #137 <Field float PointF.x>
	//    4    8:fmul            
	//    5    9:aload_1         
	//    6   10:getfield        #140 <Field float PointF.y>
	//    7   13:aload_1         
	//    8   14:getfield        #140 <Field float PointF.y>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:f2d             
	//   12   20:invokestatic    #146 <Method double Math.sqrt(double)>
	//   13   23:d2f             
	//   14   24:fstore_2        
		pointf.x = pointf.x / f;
	//   15   25:aload_1         
	//   16   26:aload_1         
	//   17   27:getfield        #137 <Field float PointF.x>
	//   18   30:fload_2         
	//   19   31:fdiv            
	//   20   32:putfield        #137 <Field float PointF.x>
		pointf.y = pointf.y / f;
	//   21   35:aload_1         
	//   22   36:aload_1         
	//   23   37:getfield        #140 <Field float PointF.y>
	//   24   40:fload_2         
	//   25   41:fdiv            
	//   26   42:putfield        #140 <Field float PointF.y>
	//   27   45:return          
	}

	protected void onChildAttachedToWindow(View view)
	{
		if(getChildPosition(view) == getTargetPosition())
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #58  <Method int getChildPosition(View)>
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #150 <Method int getTargetPosition()>
	//*   5    9:icmpne          17
			mTargetView = view;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #54  <Field View mTargetView>
	//    9   17:return          
	}

	protected abstract void onSeekTargetStep(int i, int j, RecyclerView.State state, Action action);

	protected abstract void onStart();

	protected abstract void onStop();

	protected abstract void onTargetFound(View view, RecyclerView.State state, Action action);

	public void setTargetPosition(int i)
	{
		mTargetPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int mTargetPosition>
	//    3    5:return          
	}

	void start(RecyclerView recyclerview, RecyclerView.LayoutManager layoutmanager)
	{
		mRecyclerView = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field RecyclerView mRecyclerView>
		mLayoutManager = layoutmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #118 <Field RecyclerView$LayoutManager mLayoutManager>
		if(mTargetPosition == -1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #32  <Field int mTargetPosition>
	//*   8   14:iconst_m1       
	//*   9   15:icmpne          28
		{
			throw new IllegalArgumentException("Invalid target position");
	//   10   18:new             #157 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc1            #159 <String "Invalid target position">
	//   13   24:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   14   27:athrow          
		} else
		{
			RecyclerView.State.access$1302(mRecyclerView.mState, mTargetPosition);
	//   15   28:aload_0         
	//   16   29:getfield        #45  <Field RecyclerView mRecyclerView>
	//   17   32:getfield        #62  <Field RecyclerView$State RecyclerView.mState>
	//   18   35:aload_0         
	//   19   36:getfield        #32  <Field int mTargetPosition>
	//   20   39:invokestatic    #168 <Method int RecyclerView$State.access$1302(RecyclerView$State, int)>
	//   21   42:pop             
			mRunning = true;
	//   22   43:aload_0         
	//   23   44:iconst_1        
	//   24   45:putfield        #47  <Field boolean mRunning>
			mPendingInitialRun = true;
	//   25   48:aload_0         
	//   26   49:iconst_1        
	//   27   50:putfield        #52  <Field boolean mPendingInitialRun>
			mTargetView = findViewByPosition(getTargetPosition());
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #150 <Method int getTargetPosition()>
	//   32   59:invokevirtual   #169 <Method View findViewByPosition(int)>
	//   33   62:putfield        #54  <Field View mTargetView>
			onStart();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #171 <Method void onStart()>
			mRecyclerView.mViewFlinger.postOnAnimation();
	//   36   69:aload_0         
	//   37   70:getfield        #45  <Field RecyclerView mRecyclerView>
	//   38   73:getfield        #82  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//   39   76:invokevirtual   #87  <Method void RecyclerView$ViewFlinger.postOnAnimation()>
			return;
	//   40   79:return          
		}
	}

	protected final void stop()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean mRunning>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			onStop();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #173 <Method void onStop()>
			RecyclerView.State.access$1302(mRecyclerView.mState, -1);
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field RecyclerView mRecyclerView>
	//    8   16:getfield        #62  <Field RecyclerView$State RecyclerView.mState>
	//    9   19:iconst_m1       
	//   10   20:invokestatic    #168 <Method int RecyclerView$State.access$1302(RecyclerView$State, int)>
	//   11   23:pop             
			mTargetView = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #54  <Field View mTargetView>
			mTargetPosition = -1;
	//   15   29:aload_0         
	//   16   30:iconst_m1       
	//   17   31:putfield        #32  <Field int mTargetPosition>
			mPendingInitialRun = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #52  <Field boolean mPendingInitialRun>
			mRunning = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #47  <Field boolean mRunning>
			RecyclerView.LayoutManager.access$1400(mLayoutManager, this);
	//   24   44:aload_0         
	//   25   45:getfield        #118 <Field RecyclerView$LayoutManager mLayoutManager>
	//   26   48:aload_0         
	//   27   49:invokestatic    #177 <Method void RecyclerView$LayoutManager.access$1400(RecyclerView$LayoutManager, RecyclerView$SmoothScroller)>
			mLayoutManager = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #118 <Field RecyclerView$LayoutManager mLayoutManager>
			mRecyclerView = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #45  <Field RecyclerView mRecyclerView>
			return;
	//   34   62:return          
		}
	}

	private RecyclerView.LayoutManager mLayoutManager;
	private boolean mPendingInitialRun;
	private RecyclerView mRecyclerView;
	private final Action mRecyclingAction = new Action(0, 0);
	private boolean mRunning;
	private int mTargetPosition;
	private View mTargetView;


/*
	static void access$600(RecyclerView$SmoothScroller recyclerview$smoothscroller, int i, int j)
	{
		recyclerview$smoothscroller.onAnimation(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void onAnimation(int, int)>
		return;
	//    4    6:return          
	}

*/

	public RecyclerView$SmoothScroller()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mTargetPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #32  <Field int mTargetPosition>
	//    5    9:aload_0         
	//    6   10:new             #9   <Class RecyclerView$SmoothScroller$Action>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:invokespecial   #35  <Method void RecyclerView$SmoothScroller$Action(int, int)>
	//   11   19:putfield        #37  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   12   22:return          
	}
}
