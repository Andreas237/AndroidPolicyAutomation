// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.view:
//			GravityCompat

static class GravityCompat$GravityCompatImplBase
	implements GravityCompat.GravityCompatImpl
{

	public void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, 
			int j1)
	{
		Gravity.apply(i, j, k, rect, l, i1, rect1);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:aload           7
	//    7   11:invokestatic    #21  <Method void Gravity.apply(int, int, int, Rect, int, int, Rect)>
	//    8   14:return          
	}

	public void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		Gravity.apply(i, j, k, rect, rect1);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokestatic    #25  <Method void Gravity.apply(int, int, int, Rect, Rect)>
	//    6   10:return          
	}

	public void applyDisplay(int i, Rect rect, Rect rect1, int j)
	{
		Gravity.applyDisplay(i, rect, rect1);
	//    0    0:iload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #30  <Method void Gravity.applyDisplay(int, Rect, Rect)>
	//    4    6:return          
	}

	public int getAbsoluteGravity(int i, int j)
	{
		return 0xff7fffff & i;
	//    0    0:ldc1            #33  <Int 0xff7fffff>
	//    1    2:iload_1         
	//    2    3:iand            
	//    3    4:ireturn         
	}

	GravityCompat$GravityCompatImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
