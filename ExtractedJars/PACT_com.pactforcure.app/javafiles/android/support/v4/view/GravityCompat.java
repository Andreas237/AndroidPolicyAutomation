// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

public final class GravityCompat
{

	private GravityCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, int j1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          24
		{
			Gravity.apply(i, j, k, rect, l, i1, rect1, j1);
	//    3    8:iload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:iload           4
	//    8   14:iload           5
	//    9   16:aload           6
	//   10   18:iload           7
	//   11   20:invokestatic    #29  <Method void Gravity.apply(int, int, int, Rect, int, int, Rect, int)>
			return;
	//   12   23:return          
		} else
		{
			Gravity.apply(i, j, k, rect, l, i1, rect1);
	//   13   24:iload_0         
	//   14   25:iload_1         
	//   15   26:iload_2         
	//   16   27:aload_3         
	//   17   28:iload           4
	//   18   30:iload           5
	//   19   32:aload           6
	//   20   34:invokestatic    #32  <Method void Gravity.apply(int, int, int, Rect, int, int, Rect)>
			return;
	//   21   37:return          
		}
	}

	public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          20
		{
			Gravity.apply(i, j, k, rect, rect1, l);
	//    3    8:iload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:iload           5
	//    9   16:invokestatic    #35  <Method void Gravity.apply(int, int, int, Rect, Rect, int)>
			return;
	//   10   19:return          
		} else
		{
			Gravity.apply(i, j, k, rect, rect1);
	//   11   20:iload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:aload_3         
	//   15   24:aload           4
	//   16   26:invokestatic    #38  <Method void Gravity.apply(int, int, int, Rect, Rect)>
			return;
	//   17   29:return          
		}
	}

	public static void applyDisplay(int i, Rect rect, Rect rect1, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
		{
			Gravity.applyDisplay(i, rect, rect1, j);
	//    3    8:iload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:iload_3         
	//    7   12:invokestatic    #42  <Method void Gravity.applyDisplay(int, Rect, Rect, int)>
			return;
	//    8   15:return          
		} else
		{
			Gravity.applyDisplay(i, rect, rect1);
	//    9   16:iload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokestatic    #45  <Method void Gravity.applyDisplay(int, Rect, Rect)>
			return;
	//   13   22:return          
		}
	}

	public static int getAbsoluteGravity(int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
			return Gravity.getAbsoluteGravity(i, j);
	//    3    8:iload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #49  <Method int Gravity.getAbsoluteGravity(int, int)>
	//    6   13:ireturn         
		else
			return 0xff7fffff & i;
	//    7   14:ldc1            #50  <Int 0xff7fffff>
	//    8   16:iload_0         
	//    9   17:iand            
	//   10   18:ireturn         
	}

	public static final int END = 0x800005;
	public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 0x800007;
	public static final int RELATIVE_LAYOUT_DIRECTION = 0x800000;
	public static final int START = 0x800003;
}
