// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

public static class Toolbar$LayoutParams extends android.support.v7.app.s
{

	void copyMarginsFromCompat(android.view.tParams tparams)
	{
		leftMargin = tparams.leftMargin;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #42  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    3    5:putfield        #43  <Field int leftMargin>
		topMargin = tparams.topMargin;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #46  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//    7   13:putfield        #47  <Field int topMargin>
		rightMargin = tparams.rightMargin;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #50  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   11   21:putfield        #51  <Field int rightMargin>
		bottomMargin = tparams.bottomMargin;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #54  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   15   29:putfield        #55  <Field int bottomMargin>
	//   16   32:return          
	}

	int mViewType;

	public Toolbar$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
		mViewType = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int mViewType>
		gravity = 0x800013;
	//    7   11:aload_0         
	//    8   12:ldc1            #16  <Int 0x800013>
	//    9   14:putfield        #19  <Field int gravity>
	//   10   17:return          
	}

	public Toolbar$LayoutParams(int i, int j, int k)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
		mViewType = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int mViewType>
		gravity = k;
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:putfield        #19  <Field int gravity>
	//   10   16:return          
	}

	public Toolbar$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void android.support.v7.app.ActionBar$LayoutParams(Context, AttributeSet)>
		mViewType = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int mViewType>
	//    7   11:return          
	}

	public Toolbar$LayoutParams(android.support.v7.app.s s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
		mViewType = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int mViewType>
	//    6   10:return          
	}

	public Toolbar$LayoutParams(Toolbar$LayoutParams toolbar$layoutparams)
	{
		super(((android.support.v7.app.s) (toolbar$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
		mViewType = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int mViewType>
		mViewType = toolbar$layoutparams.mViewType;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #15  <Field int mViewType>
	//    9   15:putfield        #15  <Field int mViewType>
	//   10   18:return          
	}

	public Toolbar$LayoutParams(android.view.s s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
		mViewType = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int mViewType>
	//    6   10:return          
	}

	public Toolbar$LayoutParams(android.view.tParams tparams)
	{
		super(((android.view.s) (tparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
		mViewType = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int mViewType>
		copyMarginsFromCompat(tparams);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #37  <Method void copyMarginsFromCompat(android.view.ViewGroup$MarginLayoutParams)>
	//    9   15:return          
	}
}
