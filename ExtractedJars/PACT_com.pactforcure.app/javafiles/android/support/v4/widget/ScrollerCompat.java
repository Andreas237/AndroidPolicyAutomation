// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class ScrollerCompat
{

	ScrollerCompat(Context context, Interpolator interpolator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		if(interpolator != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          24
			context = ((Context) (new OverScroller(context, interpolator)));
	//    4    8:new             #14  <Class OverScroller>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #16  <Method void OverScroller(Context, Interpolator)>
	//    9   17:astore_1        
		else
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:putfield        #18  <Field OverScroller mScroller>
	//*  13   23:return          
			context = ((Context) (new OverScroller(context)));
	//   14   24:new             #14  <Class OverScroller>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokespecial   #21  <Method void OverScroller(Context)>
	//   18   32:astore_1        
		mScroller = ((OverScroller) (context));
	//*  19   33:goto            18
	}

	public static ScrollerCompat create(Context context)
	{
		return create(context, ((Interpolator) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #27  <Method ScrollerCompat create(Context, Interpolator)>
	//    3    5:areturn         
	}

	public static ScrollerCompat create(Context context, Interpolator interpolator)
	{
		return new ScrollerCompat(context, interpolator);
	//    0    0:new             #2   <Class ScrollerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #29  <Method void ScrollerCompat(Context, Interpolator)>
	//    5    9:areturn         
	}

	public void abortAnimation()
	{
		mScroller.abortAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #32  <Method void OverScroller.abortAnimation()>
	//    3    7:return          
	}

	public boolean computeScrollOffset()
	{
		return mScroller.computeScrollOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #36  <Method boolean OverScroller.computeScrollOffset()>
	//    3    7:ireturn         
	}

	public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1)
	{
		mScroller.fling(i, j, k, l, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:invokevirtual   #40  <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
	//   11   20:return          
	}

	public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, int i2, int j2)
	{
		mScroller.fling(i, j, k, l, i1, j1, k1, l1, i2, j2);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:iload           9
	//   11   19:iload           10
	//   12   21:invokevirtual   #43  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
	//   13   24:return          
	}

	public float getCurrVelocity()
	{
		return mScroller.getCurrVelocity();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #47  <Method float OverScroller.getCurrVelocity()>
	//    3    7:freturn         
	}

	public int getCurrX()
	{
		return mScroller.getCurrX();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #51  <Method int OverScroller.getCurrX()>
	//    3    7:ireturn         
	}

	public int getCurrY()
	{
		return mScroller.getCurrY();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #54  <Method int OverScroller.getCurrY()>
	//    3    7:ireturn         
	}

	public int getFinalX()
	{
		return mScroller.getFinalX();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #57  <Method int OverScroller.getFinalX()>
	//    3    7:ireturn         
	}

	public int getFinalY()
	{
		return mScroller.getFinalY();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #60  <Method int OverScroller.getFinalY()>
	//    3    7:ireturn         
	}

	public boolean isFinished()
	{
		return mScroller.isFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #63  <Method boolean OverScroller.isFinished()>
	//    3    7:ireturn         
	}

	public boolean isOverScrolled()
	{
		return mScroller.isOverScrolled();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:invokevirtual   #66  <Method boolean OverScroller.isOverScrolled()>
	//    3    7:ireturn         
	}

	public void notifyHorizontalEdgeReached(int i, int j, int k)
	{
		mScroller.notifyHorizontalEdgeReached(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #70  <Method void OverScroller.notifyHorizontalEdgeReached(int, int, int)>
	//    6   10:return          
	}

	public void notifyVerticalEdgeReached(int i, int j, int k)
	{
		mScroller.notifyVerticalEdgeReached(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #73  <Method void OverScroller.notifyVerticalEdgeReached(int, int, int)>
	//    6   10:return          
	}

	public boolean springBack(int i, int j, int k, int l, int i1, int j1)
	{
		return mScroller.springBack(i, j, k, l, i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #77  <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//    9   16:ireturn         
	}

	public void startScroll(int i, int j, int k, int l)
	{
		mScroller.startScroll(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #81  <Method void OverScroller.startScroll(int, int, int, int)>
	//    7   12:return          
	}

	public void startScroll(int i, int j, int k, int l, int i1)
	{
		mScroller.startScroll(i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OverScroller mScroller>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #84  <Method void OverScroller.startScroll(int, int, int, int, int)>
	//    8   14:return          
	}

	OverScroller mScroller;
}
