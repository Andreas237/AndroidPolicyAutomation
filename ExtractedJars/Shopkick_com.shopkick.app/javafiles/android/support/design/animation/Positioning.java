// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;


public class Positioning
{

	public Positioning(int i, float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		gravity = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int gravity>
		xAdjustment = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #18  <Field float xAdjustment>
		yAdjustment = f1;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #20  <Field float yAdjustment>
	//   11   19:return          
	}

	public final int gravity;
	public final float xAdjustment;
	public final float yAdjustment;
}
