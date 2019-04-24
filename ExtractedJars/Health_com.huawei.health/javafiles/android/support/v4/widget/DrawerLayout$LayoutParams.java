// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

public static class DrawerLayout$LayoutParams extends android.view.ms
{

	private static final int FLAG_IS_CLOSING = 4;
	private static final int FLAG_IS_OPENED = 1;
	private static final int FLAG_IS_OPENING = 2;
	public int gravity;
	boolean isPeeking;
	float onScreen;
	int openState;

	public DrawerLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #24  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		gravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #26  <Field int gravity>
	//    7   11:return          
	}

	public DrawerLayout$LayoutParams(int i, int j, int k)
	{
		this(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void DrawerLayout$LayoutParams(int, int)>
		gravity = k;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #26  <Field int gravity>
	//    7   11:return          
	}

	public DrawerLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		gravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #26  <Field int gravity>
		context = ((Context) (context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #36  <Field int[] DrawerLayout.LAYOUT_ATTRS>
	//   10   16:invokevirtual   #42  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		gravity = ((TypedArray) (context)).getInt(0, 0);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:iconst_0        
	//   15   23:iconst_0        
	//   16   24:invokevirtual   #48  <Method int TypedArray.getInt(int, int)>
	//   17   27:putfield        #26  <Field int gravity>
		((TypedArray) (context)).recycle();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #52  <Method void TypedArray.recycle()>
	//   20   34:return          
	}

	public DrawerLayout$LayoutParams(DrawerLayout$LayoutParams drawerlayout$layoutparams)
	{
		super(((android.view.ms) (drawerlayout$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		gravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #26  <Field int gravity>
		gravity = drawerlayout$layoutparams.gravity;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #26  <Field int gravity>
	//    9   15:putfield        #26  <Field int gravity>
	//   10   18:return          
	}

	public DrawerLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		gravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #26  <Field int gravity>
	//    6   10:return          
	}

	public DrawerLayout$LayoutParams(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		gravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #26  <Field int gravity>
	//    6   10:return          
	}
}
