// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$SmoothScroller$Action
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

	public RecyclerView$SmoothScroller$Action(int i, int j)
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

	public RecyclerView$SmoothScroller$Action(int i, int j, int k, Interpolator interpolator)
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
