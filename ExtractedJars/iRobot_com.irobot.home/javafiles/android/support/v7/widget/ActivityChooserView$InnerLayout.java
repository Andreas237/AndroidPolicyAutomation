// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ActivityChooserView, av

public static class ActivityChooserView$InnerLayout extends LinearLayoutCompat
{

	private static final int a[] = {
		0x10100d4
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #12  <Int 0x10100d4>
	//    5    7:iastore         
	//    6    8:putstatic       #14  <Field int[] a>
	//*   7   11:return          
	}

	public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void LinearLayoutCompat(Context, AttributeSet)>
		context = ((Context) (av.a(context, attributeset, a)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #14  <Field int[] a>
	//    7   11:invokestatic    #24  <Method av av.a(Context, AttributeSet, int[])>
	//    8   14:astore_1        
		setBackgroundDrawable(((av) (context)).a(0));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #27  <Method android.graphics.drawable.Drawable av.a(int)>
	//   13   21:invokevirtual   #31  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		((av) (context)).a();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #33  <Method void av.a()>
	//   16   28:return          
	}
}
