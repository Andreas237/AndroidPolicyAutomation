// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

public final class GravityCompat
{

	public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    9   16:invokestatic    #16  <Method void Gravity.apply(int, int, int, Rect, Rect, int)>
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
	//   16   26:invokestatic    #19  <Method void Gravity.apply(int, int, int, Rect, Rect)>
			return;
	//   17   29:return          
		}
	}

	public static int getAbsoluteGravity(int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
			return Gravity.getAbsoluteGravity(i, j);
	//    3    8:iload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #24  <Method int Gravity.getAbsoluteGravity(int, int)>
	//    6   13:ireturn         
		else
			return i & 0xff7fffff;
	//    7   14:iload_0         
	//    8   15:ldc1            #25  <Int 0xff7fffff>
	//    9   17:iand            
	//   10   18:ireturn         
	}
}
