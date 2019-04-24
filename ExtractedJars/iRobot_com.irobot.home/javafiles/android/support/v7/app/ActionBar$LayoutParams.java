// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.app:
//			ActionBar

public static class ActionBar$LayoutParams extends android.view.arams
{

	public int a;

	public ActionBar$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int a>
		a = 0x800013;
	//    7   11:aload_0         
	//    8   12:ldc1            #16  <Int 0x800013>
	//    9   14:putfield        #15  <Field int a>
	//   10   17:return          
	}

	public ActionBar$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int a>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActionBarLayout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #26  <Field int[] android.support.v7.a.a$j.ActionBarLayout>
	//   10   16:invokevirtual   #32  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		a = ((TypedArray) (context)).getInt(android.support.v7.a.a.j.ActionBarLayout_android_layout_gravity, 0);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #35  <Field int android.support.v7.a.a$j.ActionBarLayout_android_layout_gravity>
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #41  <Method int TypedArray.getInt(int, int)>
	//   17   29:putfield        #15  <Field int a>
		((TypedArray) (context)).recycle();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #45  <Method void TypedArray.recycle()>
	//   20   36:return          
	}

	public ActionBar$LayoutParams(ActionBar$LayoutParams actionbar$layoutparams)
	{
		super(((android.view.arams) (actionbar$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		a = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int a>
		a = actionbar$layoutparams.a;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #15  <Field int a>
	//    9   15:putfield        #15  <Field int a>
	//   10   18:return          
	}

	public ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams viewgroup$layoutparams)
	{
		super(viewgroup$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		a = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int a>
	//    6   10:return          
	}
}
