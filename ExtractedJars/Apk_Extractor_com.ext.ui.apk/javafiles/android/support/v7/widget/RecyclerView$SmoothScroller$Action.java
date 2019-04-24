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
