// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			OrientationHelper

final class OrientationHelper$2 extends OrientationHelper
{

	public int getDecoratedEnd(View view)
	{
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedBottom(view) + arams.bottomMargin;
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
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedMeasuredHeight(view) + arams.topMargin + arams.bottomMargin;
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
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedMeasuredWidth(view) + arams.leftMargin + arams.rightMargin;
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
		arams arams = (arams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #18  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return mLayoutManager.getDecoratedTop(view) - arams.topMargin;
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

	OrientationHelper$2(anager anager)
	{
		super(anager, ((OrientationHelper$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void OrientationHelper(RecyclerView$LayoutManager, OrientationHelper$1)>
	//    4    6:return          
	}
}
