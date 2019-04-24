// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

class GravityCompatJellybeanMr1
{

	GravityCompatJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, int j1)
	{
		Gravity.apply(i, j, k, rect, l, i1, rect1, j1);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:invokestatic    #18  <Method void Gravity.apply(int, int, int, Rect, int, int, Rect, int)>
	//    9   15:return          
	}

	public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		Gravity.apply(i, j, k, rect, rect1, l);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #21  <Method void Gravity.apply(int, int, int, Rect, Rect, int)>
	//    7   11:return          
	}

	public static void applyDisplay(int i, Rect rect, Rect rect1, int j)
	{
		Gravity.applyDisplay(i, rect, rect1, j);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #25  <Method void Gravity.applyDisplay(int, Rect, Rect, int)>
	//    5    7:return          
	}

	public static int getAbsoluteGravity(int i, int j)
	{
		return Gravity.getAbsoluteGravity(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #29  <Method int Gravity.getAbsoluteGravity(int, int)>
	//    3    5:ireturn         
	}
}
