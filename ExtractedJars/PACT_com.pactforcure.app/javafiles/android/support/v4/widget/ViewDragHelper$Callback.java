// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

public static abstract class ViewDragHelper$Callback
{

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getOrderedChildIndex(int i)
	{
		return i;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public int getViewHorizontalDragRange(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getViewVerticalDragRange(View view)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onEdgeDragStarted(int i, int j)
	{
	//    0    0:return          
	}

	public boolean onEdgeLock(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onEdgeTouched(int i, int j)
	{
	//    0    0:return          
	}

	public void onViewCaptured(View view, int i)
	{
	//    0    0:return          
	}

	public void onViewDragStateChanged(int i)
	{
	//    0    0:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
	//    0    0:return          
	}

	public abstract boolean tryCaptureView(View view, int i);

	public ViewDragHelper$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
