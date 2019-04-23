// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;

class DropDownListView$GateKeeperDrawable extends DrawableWrapper
{

	public void draw(Canvas canvas)
	{
		if(mEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean mEnabled>
	//*   2    4:ifeq            12
			super.draw(canvas);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #17  <Method void DrawableWrapper.draw(Canvas)>
	//    6   12:return          
	}

	void setEnabled(boolean flag)
	{
		mEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #12  <Field boolean mEnabled>
	//    3    5:return          
	}

	public void setHotspot(float f, float f1)
	{
		if(mEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean mEnabled>
	//*   2    4:ifeq            13
			super.setHotspot(f, f1);
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:fload_2         
	//    6   10:invokespecial   #23  <Method void DrawableWrapper.setHotspot(float, float)>
	//    7   13:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		if(mEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean mEnabled>
	//*   2    4:ifeq            16
			super.setHotspotBounds(i, j, k, l);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokespecial   #27  <Method void DrawableWrapper.setHotspotBounds(int, int, int, int)>
	//    9   16:return          
	}

	public boolean setState(int ai[])
	{
		if(mEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean mEnabled>
	//*   2    4:ifeq            13
			return super.setState(ai);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #31  <Method boolean DrawableWrapper.setState(int[])>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean mEnabled>
	//*   2    4:ifeq            14
			return super.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #35  <Method boolean DrawableWrapper.setVisible(boolean, boolean)>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private boolean mEnabled;

	DropDownListView$GateKeeperDrawable(Drawable drawable)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void DrawableWrapper(Drawable)>
		mEnabled = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #12  <Field boolean mEnabled>
	//    6   10:return          
	}
}
