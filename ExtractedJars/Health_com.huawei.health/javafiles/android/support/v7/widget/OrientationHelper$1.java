// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			OrientationHelper

static final class OrientationHelper$1 extends OrientationHelper
{

	public int getDecoratedEnd(View view)
	{
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedRight(view) + arams.rightMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #36  <Field int RecyclerView$LayoutParams.rightMargin>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	public int getDecoratedMeasurement(View view)
	{
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedMeasuredWidth(view) + arams.leftMargin + arams.rightMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #40  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredWidth(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #43  <Field int RecyclerView$LayoutParams.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #36  <Field int RecyclerView$LayoutParams.rightMargin>
	//   13   25:iadd            
	//   14   26:ireturn         
	}

	public int getDecoratedMeasurementInOther(View view)
	{
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedMeasuredHeight(view) + arams.topMargin + arams.bottomMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method int RecyclerView$LayoutManager.getDecoratedMeasuredHeight(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #50  <Field int RecyclerView$LayoutParams.topMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #53  <Field int RecyclerView$LayoutParams.bottomMargin>
	//   13   25:iadd            
	//   14   26:ireturn         
	}

	public int getDecoratedStart(View view)
	{
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedLeft(view) - arams.leftMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #57  <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #43  <Field int RecyclerView$LayoutParams.leftMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public int getEnd()
	{
		return mLayoutManager.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #62  <Method int RecyclerView$LayoutManager.getWidth()>
	//    3    7:ireturn         
	}

	public int getEndAfterPadding()
	{
		return mLayoutManager.getWidth() - mLayoutManager.getPaddingRight();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #62  <Method int RecyclerView$LayoutManager.getWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    5   11:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public int getEndPadding()
	{
		return mLayoutManager.getPaddingRight();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//    3    7:ireturn         
	}

	public int getMode()
	{
		return mLayoutManager.getWidthMode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #71  <Method int RecyclerView$LayoutManager.getWidthMode()>
	//    3    7:ireturn         
	}

	public int getModeInOther()
	{
		return mLayoutManager.getHeightMode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #75  <Method int RecyclerView$LayoutManager.getHeightMode()>
	//    3    7:ireturn         
	}

	public int getStartAfterPadding()
	{
		return mLayoutManager.getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #79  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
	//    3    7:ireturn         
	}

	public int getTotalSpace()
	{
		return mLayoutManager.getWidth() - mLayoutManager.getPaddingLeft() - mLayoutManager.getPaddingRight();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:invokevirtual   #62  <Method int RecyclerView$LayoutManager.getWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    5   11:invokevirtual   #79  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
	//    6   14:isub            
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    9   19:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//   10   22:isub            
	//   11   23:ireturn         
	}

	public int getTransformedEndWithDecoration(View view)
	{
		mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field Rect mTmpRect>
	//    6   10:invokevirtual   #89  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
		return mTmpRect.right;
	//    7   13:aload_0         
	//    8   14:getfield        #85  <Field Rect mTmpRect>
	//    9   17:getfield        #94  <Field int Rect.right>
	//   10   20:ireturn         
	}

	public int getTransformedStartWithDecoration(View view)
	{
		mLayoutManager.getTransformedBoundingBox(view, true, mTmpRect);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field Rect mTmpRect>
	//    6   10:invokevirtual   #89  <Method void RecyclerView$LayoutManager.getTransformedBoundingBox(View, boolean, Rect)>
		return mTmpRect.left;
	//    7   13:aload_0         
	//    8   14:getfield        #85  <Field Rect mTmpRect>
	//    9   17:getfield        #98  <Field int Rect.left>
	//   10   20:ireturn         
	}

	public void offsetChild(View view, int i)
	{
		view.offsetLeftAndRight(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #104 <Method void View.offsetLeftAndRight(int)>
	//    3    5:return          
	}

	public void offsetChildren(int i)
	{
		mLayoutManager.offsetChildrenHorizontal(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView$LayoutManager mLayoutManager>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method void RecyclerView$LayoutManager.offsetChildrenHorizontal(int)>
	//    4    8:return          
	}

	OrientationHelper$1(anager anager)
	{
		super(anager, ((OrientationHelper$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #12  <Method void OrientationHelper(RecyclerView$LayoutManager, OrientationHelper$1)>
	//    4    6:return          
	}
}
