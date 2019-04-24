// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.view:
//			GravityCompatJellybeanMr1

public final class GravityCompat
{
	static interface GravityCompatImpl
	{

		public abstract void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, 
				int j1);

		public abstract void apply(int i, int j, int k, Rect rect, Rect rect1, int l);

		public abstract void applyDisplay(int i, Rect rect, Rect rect1, int j);

		public abstract int getAbsoluteGravity(int i, int j);
	}

	static class GravityCompatImplBase
		implements GravityCompatImpl
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

		GravityCompatImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class GravityCompatImplJellybeanMr1
		implements GravityCompatImpl
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

		GravityCompatImplJellybeanMr1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private GravityCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, int j1)
	{
		IMPL.apply(i, j, k, rect, l, i1, rect1, j1);
	//    0    0:getstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:aload           6
	//    8   13:iload           7
	//    9   15:invokeinterface #43  <Method void GravityCompat$GravityCompatImpl.apply(int, int, int, Rect, int, int, Rect, int)>
	//   10   20:return          
	}

	public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
	{
		IMPL.apply(i, j, k, rect, rect1, l);
	//    0    0:getstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokeinterface #46  <Method void GravityCompat$GravityCompatImpl.apply(int, int, int, Rect, Rect, int)>
	//    8   16:return          
	}

	public static void applyDisplay(int i, Rect rect, Rect rect1, int j)
	{
		IMPL.applyDisplay(i, rect, rect1, j);
	//    0    0:getstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//    1    3:iload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #50  <Method void GravityCompat$GravityCompatImpl.applyDisplay(int, Rect, Rect, int)>
	//    6   12:return          
	}

	public static int getAbsoluteGravity(int i, int j)
	{
		return IMPL.getAbsoluteGravity(i, j);
	//    0    0:getstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #54  <Method int GravityCompat$GravityCompatImpl.getAbsoluteGravity(int, int)>
	//    4   10:ireturn         
	}

	public static final int END = 0x800005;
	static final GravityCompatImpl IMPL;
	public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 0x800007;
	public static final int RELATIVE_LAYOUT_DIRECTION = 0x800000;
	public static final int START = 0x800003;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			IMPL = ((GravityCompatImpl) (new GravityCompatImplJellybeanMr1()));
	//    3    8:new             #12  <Class GravityCompat$GravityCompatImplJellybeanMr1>
	//    4   11:dup             
	//    5   12:invokespecial   #34  <Method void GravityCompat$GravityCompatImplJellybeanMr1()>
	//    6   15:putstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((GravityCompatImpl) (new GravityCompatImplBase()));
	//    8   19:new             #9   <Class GravityCompat$GravityCompatImplBase>
	//    9   22:dup             
	//   10   23:invokespecial   #37  <Method void GravityCompat$GravityCompatImplBase()>
	//   11   26:putstatic       #36  <Field GravityCompat$GravityCompatImpl IMPL>
	//*  12   29:return          
	}
}
