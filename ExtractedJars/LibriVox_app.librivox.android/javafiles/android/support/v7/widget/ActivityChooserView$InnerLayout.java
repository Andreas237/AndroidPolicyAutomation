// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

public class ActivityChooserView$InnerLayout extends LinearLayout
{

	private static final int TINT_ATTRS[] = {
		0x10100d4
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #9   <Int 0x10100d4>
	//    5    7:iastore         
	//    6    8:putstatic       #11  <Field int[] TINT_ATTRS>
	//*   7   11:return          
	}

	public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void LinearLayout(Context, AttributeSet)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #11  <Field int[] TINT_ATTRS>
	//    7   11:invokestatic    #22  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
	//    8   14:astore_1        
		setBackgroundDrawable(((TintTypedArray) (context)).getDrawable(0));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #26  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   13   21:invokevirtual   #30  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		((TintTypedArray) (context)).recycle();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #33  <Method void TintTypedArray.recycle()>
	//   16   28:return          
	}
}
