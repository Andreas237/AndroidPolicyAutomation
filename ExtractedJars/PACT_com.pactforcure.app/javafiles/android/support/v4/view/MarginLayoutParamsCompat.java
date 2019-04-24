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
		int j;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          30
			i = marginlayoutparams.getLayoutDirection();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #22  <Method int android.view.ViewGroup$MarginLayoutParams.getLayoutDirection()>
	//    5   12:istore_1        
		else
	//*   6   13:iload_1         
	//*   7   14:istore_2        
	//*   8   15:iload_1         
	//*   9   16:ifeq            28
	//*  10   19:iload_1         
	//*  11   20:istore_2        
	//*  12   21:iload_1         
	//*  13   22:iconst_1        
	//*  14   23:icmpeq          28
	//*  15   26:iconst_0        
	//*  16   27:istore_2        
	//*  17   28:iload_2         
	//*  18   29:ireturn         
			i = 0;
	//   19   30:iconst_0        
	//   20   31:istore_1        
		j = i;
		if(i != 0)
		{
			j = i;
			if(i != 1)
				j = 0;
		}
		return j;
	//*  21   32:goto            13
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
