// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view:
//			GravityCompat, GravityCompatJellybeanMr1

static class GravityCompat$GravityCompatImplJellybeanMr1
	implements GravityCompat.GravityCompatImpl
{

	public void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, 
			int j1)
	{
		GravityCompatJellybeanMr1.apply(i, j, k, rect, l, i1, rect1, j1);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:aload           7
	//    7   11:iload           8
	//    8   13:invokestatic    #20  <Method void GravityCompatJellybeanMr1.apply(int, int, int, Rect, int, int, Rect, int)>
	//    9   16:return          
	}

	public void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		GravityCompatJellybeanMr1.apply(i, j, k, rect, rect1, l);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:iload           6
	//    6    9:invokestatic    #23  <Method void GravityCompatJellybeanMr1.apply(int, int, int, Rect, Rect, int)>
	//    7   12:return          
	}

	public void applyDisplay(int i, Rect rect, Rect rect1, int j)
	{
		GravityCompatJellybeanMr1.applyDisplay(i, rect, rect1, j);
	//    0    0:iload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #27  <Method void GravityCompatJellybeanMr1.applyDisplay(int, Rect, Rect, int)>
	//    5    8:return          
	}

	public int getAbsoluteGravity(int i, int j)
	{
		return GravityCompatJellybeanMr1.getAbsoluteGravity(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #31  <Method int GravityCompatJellybeanMr1.getAbsoluteGravity(int, int)>
	//    3    5:ireturn         
	}

	GravityCompat$GravityCompatImplJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
