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
	//*  23   43:ifnonnull       95
			{
				if(mDuration == 0x80000000)
	//*  24   46:aload_0         
	//*  25   47:getfield        #44  <Field int mDuration>
	//*  26   50:ldc1            #13  <Int 0x80000000>
	//*  27   52:icmpne          73
					recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy);
	//   28   55:aload_1         
	//   29   56:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//   30   59:aload_0         
	//   31   60:getfield        #40  <Field int mDx>
	//   32   63:aload_0         
	//   33   64:getfield        #42  <Field int mDy>
	//   34   67:invokevirtual   #82  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int)>
				else
	//*  35   70:goto            118
					recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration);
	//   36   73:aload_1         
	//   37   74:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//   38   77:aload_0         
	//   39   78:getfield        #40  <Field int mDx>
	//   40   81:aload_0         
	//   41   82:getfield        #42  <Field int mDy>
	//   42   85:aload_0         
	//   43   86:getfield        #44  <Field int mDuration>
	//   44   89:invokevirtual   #84  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int)>
			} else
	//*  45   92:goto            118
			{
				recyclerview.mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
	//   46   95:aload_1         
	//   47   96:getfield        #77  <Field RecyclerView$ViewFlinger RecyclerView.mViewFlinger>
	//   48   99:aload_0         
	//   49  100:getfield        #40  <Field int mDx>
	//   50  103:aload_0         
	//   51  104:getfield        #42  <Field int mDy>
	//   52  107:aload_0         
	//   53  108:getfield        #44  <Field int mDuration>
	//   54  111:aload_0         
	//   55  112:getfield        #46  <Field Interpolator mInterpolator>
	//   56  115:invokevirtual   #86  <Method void RecyclerView$ViewFlinger.smoothScrollBy(int, int, int, Interpolator)>
			}
			mConsecutiveUpdates = mConsecutiveUpdates + 1;
	//   57  118:aload_0         
	//   58  119:aload_0         
	//   59  120:getfield        #38  <Field int mConsecutiveUpdates>
	//   60  123:iconst_1        
	//   61  124:iadd            
	//   62  125:putfield        #38  <Field int mConsecutiveUpdates>
			if(mConsecutiveUpdates > 10)
	//*  63  128:aload_0         
	//*  64  129:getfield        #38  <Field int mConsecutiveUpdates>
	//*  65  132:bipush          10
	//*  66  134:icmple          145
				Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
	//   67  137:ldc1            #88  <String "RecyclerView">
	//   68  139:ldc1            #90  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
	//   69  141:invokestatic    #96  <Method int Log.e(String, String)>
	//   70  144:pop             
			mChanged = false;
	//   71  145:aload_0         
	//   72  146:iconst_0        
	//   73  147:putfield        #36  <Field boolean mChanged>
			return;
	//   74  150:return          
		} else
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

	public RecyclerView$SmoothScroller$Action(int i, int j)
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

	public RecyclerView$SmoothScroller$Action(int i, int j, int k)
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

	public RecyclerView$SmoothScroller$Action(int i, int j, int k, Interpolator interpolator)
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
