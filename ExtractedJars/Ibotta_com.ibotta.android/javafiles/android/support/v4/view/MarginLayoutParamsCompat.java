// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


public final class MarginLayoutParamsCompat
{

	public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return marginlayoutparams.getMarginEnd();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #17  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginEnd()>
	//    5   12:ireturn         
		else
			return marginlayoutparams.rightMargin;
	//    6   13:aload_0         
	//    7   14:getfield        #20  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//    8   17:ireturn         
	}

	public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return marginlayoutparams.getMarginStart();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #24  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginStart()>
	//    5   12:ireturn         
		else
			return marginlayoutparams.leftMargin;
	//    6   13:aload_0         
	//    7   14:getfield        #27  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    8   17:ireturn         
	}

	public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
		{
			marginlayoutparams.setMarginEnd(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #32  <Method void android.view.ViewGroup$MarginLayoutParams.setMarginEnd(int)>
			return;
	//    6   13:return          
		} else
		{
			marginlayoutparams.rightMargin = i;
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:putfield        #20  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
			return;
	//   10   19:return          
		}
	}
}
