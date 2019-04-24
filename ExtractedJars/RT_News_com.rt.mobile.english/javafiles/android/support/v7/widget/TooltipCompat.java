// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			TooltipCompatHandler

public class TooltipCompat
{

	private TooltipCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
		{
			view.setTooltipText(charsequence);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #24  <Method void View.setTooltipText(CharSequence)>
			return;
	//    6   13:return          
		} else
		{
			TooltipCompatHandler.setTooltipText(view, charsequence);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #28  <Method void TooltipCompatHandler.setTooltipText(View, CharSequence)>
			return;
	//   10   19:return          
		}
	}
}
