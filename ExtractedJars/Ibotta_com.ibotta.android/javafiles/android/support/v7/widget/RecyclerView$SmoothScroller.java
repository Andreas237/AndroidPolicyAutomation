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
		//*   1    1:getfield        #47  <Field Interpolator mInterpolator>
		//*   2    4:ifnull          28
		//*   3    7:aload_0         
		//*   4    8:getfield        #45  <Field int mDuration>
		//*   5   11:iconst_1        
		//*   6   12:icmplt          18
		//*   7   15:goto            28
				throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
		//    8   18:new             #50  <Class IllegalStateException>
		//    9   21:dup             
		//   10   22:ldc1            #52  <String "If you provide an interpolator, you must set a positive duration">
		//   11   24:invokespecial   #55  <Method void IllegalStateException(String)>
		//   12   27:athrow          
			if(mDuration >= 1)
		//*  13   28:aload_0         
		//*  14   29:getfield        #45  <Field int mDuration>
		//*  15   32:iconst_1        
		//*  16   33:icmplt          37
				return;
		//   17   36:return          
			else
				throw new IllegalStateException("Scroll duration must be a positive number");
		//   18   37:new             #50  <Class IllegalStateException>
		//   19   40:dup             
		//   20   41:ldc1            #57  <String "Scroll duration must be a positive number">
		//   21   43:invokespecial   #55  <Method void IllegalStateException(String)>
		//   22   46:athrow          
		}

		boolean hasJumpTarget()
		{
			return mJumpToPosition >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int mJumpToPosition>
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
		//    2    2:putfield        #35  <Field int mJumpToPosition>
		//    3    5:return          
		}

		void runIfNecessary(RecyclerView recyclerview)
		{
			int i = mJumpToPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int mJumpToPosition>
		//    2    4:istore_2        
			if(i >= 0)
		//*   3    5:iload_2         
		//*   4    6:iflt            25
			{
				mJumpToPosition = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #35  <Field int mJumpToPosition>
				recyclerview.jumpToPositionForSmoothScroller(i);
		//    8   14:aload_1         
		//    9   15:iload_2         
		//   10   16:invokevirtual   #66  <Method void RecyclerView.jumpToPositionForSmoothScroller(int)>
				mChanged = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #37  <Field boolean mChanged>
				return;
		//   14   24:return          
			}
			if(mChanged)
		//*  15   25:aload_0         
		//*  16   26:getfield        #37  <Field boolean mChanged>
		//*  17   29:ifeq            148
			{
				validate();
		//   18   32:aload_0         
		//   19   33:invokespecial   #68  <Method void validate()>
				if(mInterpolator == null)
		//*  20   36:aload_0         
		//*  21   37:getfield        #47  <Field Interpolator mInterpolator>
		//*  22   40:ifnonnull       92
				{
					if(mDuration == 0x80000000)
		//*  23   43:aload_0         
		//*  24   44:getfield        #45  <Field int mDuration>
		//*  25   47:ldc1            #24  <Int 0x80000000>
		//*  26   49:icmpne          70
						recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy);
		//   27   52:aload_1         
		//   28   53:getfield        #72  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   29   56:aload_0         
		//   30   57:getfield        #41  <Field int mDx>
		//   31   60:aload_0         
		//   32   61:getfield        #43  <Field int mDy>
		//   33   64:invokevirtual   #77  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int)>
					else
		//*  34   67:goto            115
						recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration);
		//   35   70:aload_1         
		//   36   71:getfield        #72  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   37   74:aload_0         
		//   38   75:getfield        #41  <Field int mDx>
		//   39   78:aload_0         
		//   40   79:getfield        #43  <Field int mDy>
		//   41   82:aload_0         
		//   42   83:getfield        #45  <Field int mDuration>
		//   43   86:invokevirtual   #80  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int)>
				} else
		//*  44   89:goto            115
				{
					recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
		//   45   92:aload_1         
		//   46   93:getfield        #72  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
		//   47   96:aload_0         
		//   48   97:getfield        #41  <Field int mDx>
		//   49  100:aload_0         
		//   50  101:getfield        #43  <Field int mDy>
		//   51  104:aload_0         
		//   52  105:getfield        #45  <Field int mDuration>
		//   53  108:aload_0         
		//   54  109:getfield        #47  <Field Interpolator mInterpolator>
		//   55  112:invokevirtual   #82  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int, Interpolator)>
				}
				mConsecutiveUpdates = mConsecutiveUpdates + 1;
		//   56  115:aload_0         
		//   57  116:aload_0         
		//   58  117:getfield        #39  <Field int mConsecutiveUpdates>
		//   59  120:iconst_1        
		//   60  121:iadd            
		//   61  122:putfield        #39  <Field int mConsecutiveUpdates>
				if(mConsecutiveUpdates > 10)
		//*  62  125:aload_0         
		//*  63  126:getfield        #39  <Field int mConsecutiveUpdates>
		//*  64  129:bipush          10
		//*  65  131:icmple          142
					Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
		//   66  134:ldc1            #84  <String "RecyclerView">
		//   67  136:ldc1            #86  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
		//   68  138:invokestatic    #92  <Method int Log.e(String, String)>
		//   69  141:pop             
				mChanged = false;
		//   70  142:aload_0         
		//   71  143:iconst_0        
		//   72  144:putfield        #37  <Field boolean mChanged>
				return;
		//   73  147:return          
			} else
			{
				mConsecutiveUpdates = 0;
		//   74  148:aload_0         
		//   75  149:iconst_0        
		//   76  150:putfield        #39  <Field int mConsecutiveUpdates>
				return;
		//   77  153:return          
			}
		}

		public void update(int i, int j, int k, Interpolator interpolator)
		{
			mDx = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field int mDx>
			mDy = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #43  <Field int mDy>
			mDuration = k;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #45  <Field int mDuration>
			mInterpolator = interpolator;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #47  <Field Interpolator mInterpolator>
			mChanged = true;
		//   12   21:aload_0         
		//   13   22:iconst_1        
		//   14   23:putfield        #37  <Field boolean mChanged>
		//   15   26:return          
		}

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
		//    3    3:ldc1            #24  <Int 0x80000000>
		//    4    5:aconst_null     
		//    5    6:invokespecial   #27  <Method void RecyclerView$SmoothScroller$Action(int, int, int, Interpolator)>
		//    6    9:return          
		}

		public Action(int i, int j, int k, Interpolator interpolator)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			mJumpToPosition = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #35  <Field int mJumpToPosition>
			mChanged = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #37  <Field boolean mChanged>
			mConsecutiveUpdates = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #39  <Field int mConsecutiveUpdates>
			mDx = i;
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:putfield        #41  <Field int mDx>
			mDy = j;
		//   14   24:aload_0         
		//   15   25:iload_2         
		//   16   26:putfield        #43  <Field int mDy>
			mDuration = k;
		//   17   29:aload_0         
		//   18   30:iload_3         
		//   19   31:putfield        #45  <Field int mDuration>
			mInterpolator = interpolator;
		//   20   34:aload_0         
		//   21   35:aload           4
		//   22   37:putfield        #47  <Field Interpolator mInterpolator>
		//   23   40:return          
		}
	}

	public static interface ScrollVectorProvider
	{

		public abstract PointF computeScrollVectorForPosition(int i);
	}


	public PointF computeScrollVectorForPosition(int i)
	{
		RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_2        
		if(layoutmanager instanceof ScrollVectorProvider)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #12  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   5    9:ifeq            23
		{
			return ((ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(i);
	//    6   12:aload_2         
	//    7   13:checkcast       #12  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//    8   16:iload_1         
	//    9   17:invokeinterface #48  <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   10   22:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #50  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #51  <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
	//   15   31:aload_2         
	//   16   32:ldc1            #53  <String "You should override computeScrollVectorForPosition when the LayoutManager does not implement ">
	//   17   34:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(((Class) (android/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider)).getCanonicalName());
	//   19   38:aload_2         
	//   20   39:ldc1            #12  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   21   41:invokevirtual   #63  <Method String Class.getCanonicalName()>
	//   22   44:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			Log.w("RecyclerView", stringbuilder.toString());
	//   24   48:ldc1            #65  <String "RecyclerView">
	//   25   50:aload_2         
	//   26   51:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   27   54:invokestatic    #74  <Method int Log.w(String, String)>
	//   28   57:pop             
			return null;
	//   29   58:aconst_null     
	//   30   59:areturn         
		}
	}

	public View findViewByPosition(int i)
	{
		return mRecyclerView.mLayout.findViewByPosition(i);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field RecyclerView mRecyclerView>
	//    2    4:getfield        #82  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #86  <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//    5   11:areturn         
	}

	public int getChildCount()
	{
		return mRecyclerView.mLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field RecyclerView mRecyclerView>
	//    2    4:getfield        #82  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    3    7:invokevirtual   #90  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    4   10:ireturn         
	}

	public int getChildPosition(View view)
	{
		return mRecyclerView.getChildLayoutPosition(view);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field RecyclerView mRecyclerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method int RecyclerView.getChildLayoutPosition(View)>
	//    4    8:ireturn         
	}

	public RecyclerView.LayoutManager getLayoutManager()
	{
		return mLayoutManager;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:areturn         
	}

	public int getTargetPosition()
	{
		return mTargetPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mTargetPosition>
	//    2    4:ireturn         
	}

	public boolean isPendingInitialRun()
	{
		return mPendingInitialRun;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field boolean mPendingInitialRun>
	//    2    4:ireturn         
	}

	public boolean isRunning()
	{
		return mRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean mRunning>
	//    2    4:ireturn         
	}

	protected void normalize(PointF pointf)
	{
		float f = (float)Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
	//    0    0:aload_1         
	//    1    1:getfield        #114 <Field float PointF.x>
	//    2    4:aload_1         
	//    3    5:getfield        #114 <Field float PointF.x>
	//    4    8:fmul            
	//    5    9:aload_1         
	//    6   10:getfield        #117 <Field float PointF.y>
	//    7   13:aload_1         
	//    8   14:getfield        #117 <Field float PointF.y>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:f2d             
	//   12   20:invokestatic    #123 <Method double Math.sqrt(double)>
	//   13   23:d2f             
	//   14   24:fstore_2        
		pointf.x = pointf.x / f;
	//   15   25:aload_1         
	//   16   26:aload_1         
	//   17   27:getfield        #114 <Field float PointF.x>
	//   18   30:fload_2         
	//   19   31:fdiv            
	//   20   32:putfield        #114 <Field float PointF.x>
		pointf.y = pointf.y / f;
	//   21   35:aload_1         
	//   22   36:aload_1         
	//   23   37:getfield        #117 <Field float PointF.y>
	//   24   40:fload_2         
	//   25   41:fdiv            
	//   26   42:putfield        #117 <Field float PointF.y>
	//   27   45:return          
	}

	void onAnimation(int i, int j)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field RecyclerView mRecyclerView>
	//    2    4:astore          4
		if(!mRunning || mTargetPosition == -1 || recyclerview == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #105 <Field boolean mRunning>
	//*   5   10:ifeq            26
	//*   6   13:aload_0         
	//*   7   14:getfield        #33  <Field int mTargetPosition>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          26
	//*  10   21:aload           4
	//*  11   23:ifnonnull       30
			stop();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #128 <Method void stop()>
		if(mPendingInitialRun && mTargetView == null && mLayoutManager != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #102 <Field boolean mPendingInitialRun>
	//*  16   34:ifeq            110
	//*  17   37:aload_0         
	//*  18   38:getfield        #130 <Field View mTargetView>
	//*  19   41:ifnonnull       110
	//*  20   44:aload_0         
	//*  21   45:getfield        #97  <Field RecyclerView$LayoutManager mLayoutManager>
	//*  22   48:ifnull          110
		{
			PointF pointf = computeScrollVectorForPosition(mTargetPosition);
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #33  <Field int mTargetPosition>
	//   26   56:invokevirtual   #131 <Method PointF computeScrollVectorForPosition(int)>
	//   27   59:astore          5
			if(pointf != null && (pointf.x != 0.0F || pointf.y != 0.0F))
	//*  28   61:aload           5
	//*  29   63:ifnull          110
	//*  30   66:aload           5
	//*  31   68:getfield        #114 <Field float PointF.x>
	//*  32   71:fconst_0        
	//*  33   72:fcmpl           
	//*  34   73:ifne            86
	//*  35   76:aload           5
	//*  36   78:getfield        #117 <Field float PointF.y>
	//*  37   81:fconst_0        
	//*  38   82:fcmpl           
	//*  39   83:ifeq            110
				recyclerview.scrollStep((int)Math.signum(pointf.x), (int)Math.signum(pointf.y), ((int []) (null)));
	//   40   86:aload           4
	//   41   88:aload           5
	//   42   90:getfield        #114 <Field float PointF.x>
	//   43   93:invokestatic    #135 <Method float Math.signum(float)>
	//   44   96:f2i             
	//   45   97:aload           5
	//   46   99:getfield        #117 <Field float PointF.y>
	//   47  102:invokestatic    #135 <Method float Math.signum(float)>
	//   48  105:f2i             
	//   49  106:aconst_null     
	//   50  107:invokevirtual   #139 <Method void RecyclerView.scrollStep(int, int, int[])>
		}
		mPendingInitialRun = false;
	//   51  110:aload_0         
	//   52  111:iconst_0        
	//   53  112:putfield        #102 <Field boolean mPendingInitialRun>
		View view = mTargetView;
	//   54  115:aload_0         
	//   55  116:getfield        #130 <Field View mTargetView>
	//   56  119:astore          5
		if(view != null)
	//*  57  121:aload           5
	//*  58  123:ifnull          185
			if(getChildPosition(view) == mTargetPosition)
	//*  59  126:aload_0         
	//*  60  127:aload           5
	//*  61  129:invokevirtual   #141 <Method int getChildPosition(View)>
	//*  62  132:aload_0         
	//*  63  133:getfield        #33  <Field int mTargetPosition>
	//*  64  136:icmpne          172
			{
				onTargetFound(mTargetView, recyclerview.mState, mRecyclingAction);
	//   65  139:aload_0         
	//   66  140:aload_0         
	//   67  141:getfield        #130 <Field View mTargetView>
	//   68  144:aload           4
	//   69  146:getfield        #145 <Field RecyclerView$State RecyclerView.mState>
	//   70  149:aload_0         
	//   71  150:getfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   72  153:invokevirtual   #149 <Method void onTargetFound(View, RecyclerView$State, RecyclerView$SmoothScroller$Action)>
				mRecyclingAction.runIfNecessary(recyclerview);
	//   73  156:aload_0         
	//   74  157:getfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   75  160:aload           4
	//   76  162:invokevirtual   #153 <Method void RecyclerView$SmoothScroller$Action.runIfNecessary(RecyclerView)>
				stop();
	//   77  165:aload_0         
	//   78  166:invokevirtual   #128 <Method void stop()>
			} else
	//*  79  169:goto            185
			{
				Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
	//   80  172:ldc1            #65  <String "RecyclerView">
	//   81  174:ldc1            #155 <String "Passed over target position while smooth scrolling.">
	//   82  176:invokestatic    #158 <Method int Log.e(String, String)>
	//   83  179:pop             
				mTargetView = null;
	//   84  180:aload_0         
	//   85  181:aconst_null     
	//   86  182:putfield        #130 <Field View mTargetView>
			}
		if(mRunning)
	//*  87  185:aload_0         
	//*  88  186:getfield        #105 <Field boolean mRunning>
	//*  89  189:ifeq            253
		{
			onSeekTargetStep(i, j, recyclerview.mState, mRecyclingAction);
	//   90  192:aload_0         
	//   91  193:iload_1         
	//   92  194:iload_2         
	//   93  195:aload           4
	//   94  197:getfield        #145 <Field RecyclerView$State RecyclerView.mState>
	//   95  200:aload_0         
	//   96  201:getfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   97  204:invokevirtual   #162 <Method void onSeekTargetStep(int, int, RecyclerView$State, RecyclerView$SmoothScroller$Action)>
			boolean flag = mRecyclingAction.hasJumpTarget();
	//   98  207:aload_0         
	//   99  208:getfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//  100  211:invokevirtual   #165 <Method boolean RecyclerView$SmoothScroller$Action.hasJumpTarget()>
	//  101  214:istore_3        
			mRecyclingAction.runIfNecessary(recyclerview);
	//  102  215:aload_0         
	//  103  216:getfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//  104  219:aload           4
	//  105  221:invokevirtual   #153 <Method void RecyclerView$SmoothScroller$Action.runIfNecessary(RecyclerView)>
			if(flag)
	//* 106  224:iload_3         
	//* 107  225:ifeq            253
			{
				if(mRunning)
	//* 108  228:aload_0         
	//* 109  229:getfield        #105 <Field boolean mRunning>
	//* 110  232:ifeq            249
				{
					mPendingInitialRun = true;
	//  111  235:aload_0         
	//  112  236:iconst_1        
	//  113  237:putfield        #102 <Field boolean mPendingInitialRun>
					recyclerview.mViewFlinger.postOnAnimation();
	//  114  240:aload           4
	//  115  242:getfield        #169 <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//  116  245:invokevirtual   #174 <Method void RecyclerView$ViewFlinger.postOnAnimation()>
					return;
	//  117  248:return          
				}
				stop();
	//  118  249:aload_0         
	//  119  250:invokevirtual   #128 <Method void stop()>
			}
		}
	//  120  253:return          
	}

	protected void onChildAttachedToWindow(View view)
	{
		if(getChildPosition(view) == getTargetPosition())
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #141 <Method int getChildPosition(View)>
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #178 <Method int getTargetPosition()>
	//*   5    9:icmpne          17
			mTargetView = view;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #130 <Field View mTargetView>
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
	//    2    2:putfield        #33  <Field int mTargetPosition>
	//    3    5:return          
	}

	void start(RecyclerView recyclerview, RecyclerView.LayoutManager layoutmanager)
	{
		if(mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field boolean mStarted>
	//*   2    4:ifeq            91
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #50  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #51  <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("An instance of ");
	//    7   15:aload_3         
	//    8   16:ldc1            #189 <String "An instance of ">
	//    9   18:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   11   22:aload_3         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #193 <Method Class Object.getClass()>
	//   14   27:invokevirtual   #196 <Method String Class.getSimpleName()>
	//   15   30:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(" was started ");
	//   17   34:aload_3         
	//   18   35:ldc1            #198 <String " was started ">
	//   19   37:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append("more than once. Each instance of");
	//   21   41:aload_3         
	//   22   42:ldc1            #200 <String "more than once. Each instance of">
	//   23   44:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   25   48:aload_3         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #193 <Method Class Object.getClass()>
	//   28   53:invokevirtual   #196 <Method String Class.getSimpleName()>
	//   29   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			stringbuilder.append(" ");
	//   31   60:aload_3         
	//   32   61:ldc1            #202 <String " ">
	//   33   63:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			stringbuilder.append("is intended to only be used once. You should create a new instance for ");
	//   35   67:aload_3         
	//   36   68:ldc1            #204 <String "is intended to only be used once. You should create a new instance for ">
	//   37   70:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
			stringbuilder.append("each use.");
	//   39   74:aload_3         
	//   40   75:ldc1            #206 <String "each use.">
	//   41   77:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
			Log.w("RecyclerView", stringbuilder.toString());
	//   43   81:ldc1            #65  <String "RecyclerView">
	//   44   83:aload_3         
	//   45   84:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   46   87:invokestatic    #74  <Method int Log.w(String, String)>
	//   47   90:pop             
		}
		mRecyclerView = recyclerview;
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:putfield        #79  <Field RecyclerView mRecyclerView>
		mLayoutManager = layoutmanager;
	//   51   96:aload_0         
	//   52   97:aload_2         
	//   53   98:putfield        #97  <Field RecyclerView$LayoutManager mLayoutManager>
		if(mTargetPosition != -1)
	//*  54  101:aload_0         
	//*  55  102:getfield        #33  <Field int mTargetPosition>
	//*  56  105:iconst_m1       
	//*  57  106:icmpeq          165
		{
			mRecyclerView.mState.mTargetPosition = mTargetPosition;
	//   58  109:aload_0         
	//   59  110:getfield        #79  <Field RecyclerView mRecyclerView>
	//   60  113:getfield        #145 <Field RecyclerView$State RecyclerView.mState>
	//   61  116:aload_0         
	//   62  117:getfield        #33  <Field int mTargetPosition>
	//   63  120:putfield        #209 <Field int RecyclerView$State.mTargetPosition>
			mRunning = true;
	//   64  123:aload_0         
	//   65  124:iconst_1        
	//   66  125:putfield        #105 <Field boolean mRunning>
			mPendingInitialRun = true;
	//   67  128:aload_0         
	//   68  129:iconst_1        
	//   69  130:putfield        #102 <Field boolean mPendingInitialRun>
			mTargetView = findViewByPosition(getTargetPosition());
	//   70  133:aload_0         
	//   71  134:aload_0         
	//   72  135:aload_0         
	//   73  136:invokevirtual   #178 <Method int getTargetPosition()>
	//   74  139:invokevirtual   #210 <Method View findViewByPosition(int)>
	//   75  142:putfield        #130 <Field View mTargetView>
			onStart();
	//   76  145:aload_0         
	//   77  146:invokevirtual   #212 <Method void onStart()>
			mRecyclerView.mViewFlinger.postOnAnimation();
	//   78  149:aload_0         
	//   79  150:getfield        #79  <Field RecyclerView mRecyclerView>
	//   80  153:getfield        #169 <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//   81  156:invokevirtual   #174 <Method void RecyclerView$ViewFlinger.postOnAnimation()>
			mStarted = true;
	//   82  159:aload_0         
	//   83  160:iconst_1        
	//   84  161:putfield        #187 <Field boolean mStarted>
			return;
	//   85  164:return          
		} else
		{
			throw new IllegalArgumentException("Invalid target position");
	//   86  165:new             #214 <Class IllegalArgumentException>
	//   87  168:dup             
	//   88  169:ldc1            #216 <String "Invalid target position">
	//   89  171:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//   90  174:athrow          
		}
	}

	protected final void stop()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field boolean mRunning>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			mRunning = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #105 <Field boolean mRunning>
			onStop();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #221 <Method void onStop()>
			mRecyclerView.mState.mTargetPosition = -1;
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field RecyclerView mRecyclerView>
	//   11   21:getfield        #145 <Field RecyclerView$State RecyclerView.mState>
	//   12   24:iconst_m1       
	//   13   25:putfield        #209 <Field int RecyclerView$State.mTargetPosition>
			mTargetView = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #130 <Field View mTargetView>
			mTargetPosition = -1;
	//   17   33:aload_0         
	//   18   34:iconst_m1       
	//   19   35:putfield        #33  <Field int mTargetPosition>
			mPendingInitialRun = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #102 <Field boolean mPendingInitialRun>
			mLayoutManager.onSmoothScrollerStopped(this);
	//   23   43:aload_0         
	//   24   44:getfield        #97  <Field RecyclerView$LayoutManager mLayoutManager>
	//   25   47:aload_0         
	//   26   48:invokevirtual   #225 <Method void RecyclerView$LayoutManager.onSmoothScrollerStopped(RecyclerView$SmoothScroller)>
			mLayoutManager = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #97  <Field RecyclerView$LayoutManager mLayoutManager>
			mRecyclerView = null;
	//   30   56:aload_0         
	//   31   57:aconst_null     
	//   32   58:putfield        #79  <Field RecyclerView mRecyclerView>
			return;
	//   33   61:return          
		}
	}

	private RecyclerView.LayoutManager mLayoutManager;
	private boolean mPendingInitialRun;
	private RecyclerView mRecyclerView;
	private final Action mRecyclingAction = new Action(0, 0);
	private boolean mRunning;
	private boolean mStarted;
	private int mTargetPosition;
	private View mTargetView;

	public RecyclerView$SmoothScroller()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mTargetPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #33  <Field int mTargetPosition>
	//    5    9:aload_0         
	//    6   10:new             #9   <Class RecyclerView$SmoothScroller$Action>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:invokespecial   #36  <Method void RecyclerView$SmoothScroller$Action(int, int)>
	//   11   19:putfield        #38  <Field RecyclerView$SmoothScroller$Action mRecyclingAction>
	//   12   22:return          
	}
}
