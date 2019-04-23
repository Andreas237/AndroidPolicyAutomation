// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class OrientationHelper
{

	private OrientationHelper(RecyclerView.LayoutManager layoutmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mLastTotalSpace = 0x80000000;
	//    2    4:aload_0         
	//    3    5:ldc1            #9   <Int 0x80000000>
	//    4    7:putfield        #23  <Field int mLastTotalSpace>
		mTmpRect = new Rect();
	//    5   10:aload_0         
	//    6   11:new             #25  <Class Rect>
	//    7   14:dup             
	//    8   15:invokespecial   #26  <Method void Rect()>
	//    9   18:putfield        #28  <Field Rect mTmpRect>
		mLayoutManager = layoutmanager;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #30  <Field RecyclerView$LayoutManager mLayoutManager>
	//   13   26:return          
	}

	OrientationHelper(RecyclerView.LayoutManager layoutmanager, _cls1 _pcls1)
	{
		this(layoutmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void OrientationHelper(RecyclerView$LayoutManager)>
	//    3    5:return          
	}

	public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		return ((OrientationHelper) (new _cls1(layoutmanager)));
	//    0    0:new             #38  <Class OrientationHelper$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void OrientationHelper$1(RecyclerView$LayoutManager)>
	//    4    8:areturn         
	}

	public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutmanager, int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 39
	//	               1 34
		default:
			throw new IllegalArgumentException("invalid orientation");
	//    2   24:new             #43  <Class IllegalArgumentException>
	//    3   27:dup             
	//    4   28:ldc1            #45  <String "invalid orientation">
	//    5   30:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//    6   33:athrow          

		case 1: // '\001'
			return createVerticalHelper(layoutmanager);
	//    7   34:aload_0         
	//    8   35:invokestatic    #51  <Method OrientationHelper createVerticalHelper(RecyclerView$LayoutManager)>
	//    9   38:areturn         

		case 0: // '\0'
			return createHorizontalHelper(layoutmanager);
	//   10   39:aload_0         
	//   11   40:invokestatic    #53  <Method OrientationHelper createHorizontalHelper(RecyclerView$LayoutManager)>
	//   12   43:areturn         
		}
	}

	public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		return ((OrientationHelper) (new _cls2(layoutmanager)));
	//    0    0:new             #55  <Class OrientationHelper$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void OrientationHelper$2(RecyclerView$LayoutManager)>
	//    4    8:areturn         
	}

	public abstract int getDecoratedEnd(View view);

	public abstract int getDecoratedMeasurement(View view);

	public abstract int getDecoratedMeasurementInOther(View view);

	public abstract int getDecoratedStart(View view);

	public abstract int getEnd();

	public abstract int getEndAfterPadding();

	public abstract int getEndPadding();

	public RecyclerView.LayoutManager getLayoutManager()
	{
		return mLayoutManager;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:areturn         
	}

	public abstract int getMode();

	public abstract int getModeInOther();

	public abstract int getStartAfterPadding();

	public abstract int getTotalSpace();

	public int getTotalSpaceChange()
	{
		if(0x80000000 == mLastTotalSpace)
	//*   0    0:ldc1            #9   <Int 0x80000000>
	//*   1    2:aload_0         
	//*   2    3:getfield        #23  <Field int mLastTotalSpace>
	//*   3    6:icmpne          11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return getTotalSpace() - mLastTotalSpace;
	//    6   11:aload_0         
	//    7   12:invokevirtual   #74  <Method int getTotalSpace()>
	//    8   15:aload_0         
	//    9   16:getfield        #23  <Field int mLastTotalSpace>
	//   10   19:isub            
	//   11   20:ireturn         
	}

	public abstract int getTransformedEndWithDecoration(View view);

	public abstract int getTransformedStartWithDecoration(View view);

	public abstract void offsetChild(View view, int i);

	public abstract void offsetChildren(int i);

	public void onLayoutComplete()
	{
		mLastTotalSpace = getTotalSpace();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #74  <Method int getTotalSpace()>
	//    3    5:putfield        #23  <Field int mLastTotalSpace>
	//    4    8:return          
	}

	public static final int HORIZONTAL = 0;
	private static final int INVALID_SIZE = 0x80000000;
	public static final int VERTICAL = 1;
	private int mLastTotalSpace;
	protected final RecyclerView.LayoutManager mLayoutManager;
	final Rect mTmpRect;

	private class _cls1 extends OrientationHelper
	{

		public int getDecoratedEnd(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedRight(view) + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #29  <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #33  <Field int RecyclerView$LayoutParams.rightMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		public int getDecoratedMeasurement(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedMeasuredWidth(view) + layoutparams.leftMargin + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredWidth(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:iadd            
		//   11   21:aload_2         
		//   12   22:getfield        #33  <Field int RecyclerView$LayoutParams.rightMargin>
		//   13   25:iadd            
		//   14   26:ireturn         
		}

		public int getDecoratedMeasurementInOther(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedMeasuredHeight(view) + layoutparams.topMargin + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #44  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredHeight(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #47  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:iadd            
		//   11   21:aload_2         
		//   12   22:getfield        #50  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   13   25:iadd            
		//   14   26:ireturn         
		}

		public int getDecoratedStart(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedLeft(view) - layoutparams.leftMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #54  <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public int getEnd()
		{
			return mLayoutManager.getWidth();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getWidth()>
		//    3    7:ireturn         
		}

		public int getEndAfterPadding()
		{
			return mLayoutManager.getWidth() - mLayoutManager.getPaddingRight();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getWidth()>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    5   11:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingRight()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int getEndPadding()
		{
			return mLayoutManager.getPaddingRight();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingRight()>
		//    3    7:ireturn         
		}

		public int getMode()
		{
			return mLayoutManager.getWidthMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #68  <Method int RecyclerView$LayoutManager.getWidthMode()>
		//    3    7:ireturn         
		}

		public int getModeInOther()
		{
			return mLayoutManager.getHeightMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #72  <Method int RecyclerView$LayoutManager.getHeightMode()>
		//    3    7:ireturn         
		}

		public int getStartAfterPadding()
		{
			return mLayoutManager.getPaddingLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #76  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
		//    3    7:ireturn         
		}

		public int getTotalSpace()
		{
			return mLayoutManager.getWidth() - mLayoutManager.getPaddingLeft() - mLayoutManager.getPaddingRight();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getWidth()>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    5   11:invokevirtual   #76  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
		//    6   14:isub            
		//    7   15:aload_0         
		//    8   16:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    9   19:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingRight()>
		//   10   22:isub            
		//   11   23:ireturn         
		}

		public int getTransformedEndWithDecoration(View view)
		{
			mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:aload_1         
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:getfield        #82  <Field Rect mTmpRect>
		//    6   10:invokevirtual   #86  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
			return mTmpRect.right;
		//    7   13:aload_0         
		//    8   14:getfield        #82  <Field Rect mTmpRect>
		//    9   17:getfield        #91  <Field int Rect.right>
		//   10   20:ireturn         
		}

		public int getTransformedStartWithDecoration(View view)
		{
			mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:aload_1         
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:getfield        #82  <Field Rect mTmpRect>
		//    6   10:invokevirtual   #86  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
			return mTmpRect.left;
		//    7   13:aload_0         
		//    8   14:getfield        #82  <Field Rect mTmpRect>
		//    9   17:getfield        #95  <Field int Rect.left>
		//   10   20:ireturn         
		}

		public void offsetChild(View view, int i)
		{
			view.offsetLeftAndRight(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #101 <Method void View.offsetLeftAndRight(int)>
		//    3    5:return          
		}

		public void offsetChildren(int i)
		{
			mLayoutManager.offsetChildrenHorizontal(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #105 <Method void RecyclerView$LayoutManager.offsetChildrenHorizontal(int)>
		//    4    8:return          
		}

		_cls1(RecyclerView.LayoutManager layoutmanager)
		{
			super(layoutmanager, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #9   <Method void OrientationHelper(RecyclerView$LayoutManager, OrientationHelper$1)>
		//    4    6:return          
		}
	}


	private class _cls2 extends OrientationHelper
	{

		public int getDecoratedEnd(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedBottom(view) + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #29  <Method int RecyclerView$LayoutManager.getDecoratedBottom(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #33  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		public int getDecoratedMeasurement(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedMeasuredHeight(view) + layoutparams.topMargin + layoutparams.bottomMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredHeight(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:iadd            
		//   11   21:aload_2         
		//   12   22:getfield        #33  <Field int RecyclerView$LayoutParams.bottomMargin>
		//   13   25:iadd            
		//   14   26:ireturn         
		}

		public int getDecoratedMeasurementInOther(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedMeasuredWidth(view) + layoutparams.leftMargin + layoutparams.rightMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #44  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredWidth(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #47  <Field int RecyclerView$LayoutParams.leftMargin>
		//   10   20:iadd            
		//   11   21:aload_2         
		//   12   22:getfield        #50  <Field int RecyclerView$LayoutParams.rightMargin>
		//   13   25:iadd            
		//   14   26:ireturn         
		}

		public int getDecoratedStart(View view)
		{
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
		//    3    7:astore_2        
			return mLayoutManager.getDecoratedTop(view) - layoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #54  <Method int RecyclerView$LayoutManager.getDecoratedTop(View)>
		//    8   16:aload_2         
		//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.topMargin>
		//   10   20:isub            
		//   11   21:ireturn         
		}

		public int getEnd()
		{
			return mLayoutManager.getHeight();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getHeight()>
		//    3    7:ireturn         
		}

		public int getEndAfterPadding()
		{
			return mLayoutManager.getHeight() - mLayoutManager.getPaddingBottom();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getHeight()>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    5   11:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingBottom()>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public int getEndPadding()
		{
			return mLayoutManager.getPaddingBottom();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingBottom()>
		//    3    7:ireturn         
		}

		public int getMode()
		{
			return mLayoutManager.getHeightMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #68  <Method int RecyclerView$LayoutManager.getHeightMode()>
		//    3    7:ireturn         
		}

		public int getModeInOther()
		{
			return mLayoutManager.getWidthMode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #72  <Method int RecyclerView$LayoutManager.getWidthMode()>
		//    3    7:ireturn         
		}

		public int getStartAfterPadding()
		{
			return mLayoutManager.getPaddingTop();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #76  <Method int RecyclerView$LayoutManager.getPaddingTop()>
		//    3    7:ireturn         
		}

		public int getTotalSpace()
		{
			return mLayoutManager.getHeight() - mLayoutManager.getPaddingTop() - mLayoutManager.getPaddingBottom();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:invokevirtual   #59  <Method int RecyclerView$LayoutManager.getHeight()>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    5   11:invokevirtual   #76  <Method int RecyclerView$LayoutManager.getPaddingTop()>
		//    6   14:isub            
		//    7   15:aload_0         
		//    8   16:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    9   19:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingBottom()>
		//   10   22:isub            
		//   11   23:ireturn         
		}

		public int getTransformedEndWithDecoration(View view)
		{
			mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:aload_1         
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:getfield        #82  <Field Rect mTmpRect>
		//    6   10:invokevirtual   #86  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
			return mTmpRect.bottom;
		//    7   13:aload_0         
		//    8   14:getfield        #82  <Field Rect mTmpRect>
		//    9   17:getfield        #91  <Field int Rect.bottom>
		//   10   20:ireturn         
		}

		public int getTransformedStartWithDecoration(View view)
		{
			mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:aload_1         
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:getfield        #82  <Field Rect mTmpRect>
		//    6   10:invokevirtual   #86  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
			return mTmpRect.top;
		//    7   13:aload_0         
		//    8   14:getfield        #82  <Field Rect mTmpRect>
		//    9   17:getfield        #95  <Field int Rect.top>
		//   10   20:ireturn         
		}

		public void offsetChild(View view, int i)
		{
			view.offsetTopAndBottom(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #101 <Method void View.offsetTopAndBottom(int)>
		//    3    5:return          
		}

		public void offsetChildren(int i)
		{
			mLayoutManager.offsetChildrenVertical(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RecyclerView$LayoutManager mLayoutManager>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #105 <Method void RecyclerView$LayoutManager.offsetChildrenVertical(int)>
		//    4    8:return          
		}

		_cls2(RecyclerView.LayoutManager layoutmanager)
		{
			super(layoutmanager, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #9   <Method void OrientationHelper(RecyclerView$LayoutManager, OrientationHelper$1)>
		//    4    6:return          
		}
	}

}
