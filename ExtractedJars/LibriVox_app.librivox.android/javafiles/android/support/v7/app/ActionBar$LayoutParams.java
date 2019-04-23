// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ActionBar$LayoutParams extends android.view.arams
{

	public int gravity;

	public ActionBar$LayoutParams(int i)
	{
		this(-2, -1, i);
	//    0    0:aload_0         
	//    1    1:bipush          -2
	//    2    3:iconst_m1       
	//    3    4:iload_1         
	//    4    5:invokespecial   #11  <Method void ActionBar$LayoutParams(int, int, int)>
	//    5    8:return          
	}

	public ActionBar$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		gravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field int gravity>
		gravity = 0x800013;
	//    7   11:aload_0         
	//    8   12:ldc1            #18  <Int 0x800013>
	//    9   14:putfield        #17  <Field int gravity>
	//   10   17:return          
	}

	public ActionBar$LayoutParams(int i, int j, int k)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		gravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field int gravity>
		gravity = k;
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:putfield        #17  <Field int gravity>
	//   10   16:return          
	}

	public ActionBar$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		gravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field int gravity>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBarLayout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #27  <Field int[] android.support.v7.appcompat.R$styleable.ActionBarLayout>
	//   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		gravity = ((TypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.ActionBarLayout_android_layout_gravity, 0);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #36  <Field int android.support.v7.appcompat.R$styleable.ActionBarLayout_android_layout_gravity>
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #42  <Method int TypedArray.getInt(int, int)>
	//   17   29:putfield        #17  <Field int gravity>
		((TypedArray) (context)).recycle();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #46  <Method void TypedArray.recycle()>
	//   20   36:return          
	}

	public ActionBar$LayoutParams(ActionBar$LayoutParams actionbar$layoutparams)
	{
		super(((android.view.arams) (actionbar$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		gravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field int gravity>
		gravity = actionbar$layoutparams.gravity;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #17  <Field int gravity>
	//    9   15:putfield        #17  <Field int gravity>
	//   10   18:return          
	}

	public ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams viewgroup$layoutparams)
	{
		super(viewgroup$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		gravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field int gravity>
	//    6   10:return          
	}
}
