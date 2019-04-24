// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


public final class MarginLayoutParamsCompat
{

	private MarginLayoutParamsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		int i;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          24
			i = marginlayoutparams.getLayoutDirection();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #22  <Method int android.view.ViewGroup$MarginLayoutParams.getLayoutDirection()>
	//    5   12:istore_1        
		else
	//*   6   13:iload_1         
	//*   7   14:ifeq            29
	//*   8   17:iload_1         
	//*   9   18:iconst_1        
	//*  10   19:icmpeq          29
	//*  11   22:iconst_0        
	//*  12   23:ireturn         
			i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_1        
		if(i != 0 && i != 1)
			return 0;
		else
	//*  15   26:goto            13
			return i;
	//   16   29:iload_1         
	//   17   30:ireturn         
	}

	public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return marginlayoutparams.getMarginEnd();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #25  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginEnd()>
	//    5   12:ireturn         
		else
			return marginlayoutparams.rightMargin;
	//    6   13:aload_0         
	//    7   14:getfield        #28  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//    8   17:ireturn         
	}

	public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return marginlayoutparams.getMarginStart();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method int android.view.ViewGroup$MarginLayoutParams.getMarginStart()>
	//    5   12:ireturn         
		else
			return marginlayoutparams.leftMargin;
	//    6   13:aload_0         
	//    7   14:getfield        #34  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    8   17:ireturn         
	}

	public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return marginlayoutparams.isMarginRelative();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #39  <Method boolean android.view.ViewGroup$MarginLayoutParams.isMarginRelative()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			marginlayoutparams.resolveLayoutDirection(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #44  <Method void android.view.ViewGroup$MarginLayoutParams.resolveLayoutDirection(int)>
	//    6   13:return          
	}

	public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			marginlayoutparams.setLayoutDirection(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #47  <Method void android.view.ViewGroup$MarginLayoutParams.setLayoutDirection(int)>
	//    6   13:return          
	}

	public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
		{
			marginlayoutparams.setMarginEnd(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #50  <Method void android.view.ViewGroup$MarginLayoutParams.setMarginEnd(int)>
			return;
	//    6   13:return          
		} else
		{
			marginlayoutparams.rightMargin = i;
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:putfield        #28  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
			return;
	//   10   19:return          
		}
	}

	public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
		{
			marginlayoutparams.setMarginStart(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #53  <Method void android.view.ViewGroup$MarginLayoutParams.setMarginStart(int)>
			return;
	//    6   13:return          
		} else
		{
			marginlayoutparams.leftMargin = i;
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:putfield        #34  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
			return;
	//   10   19:return          
		}
	}
}
