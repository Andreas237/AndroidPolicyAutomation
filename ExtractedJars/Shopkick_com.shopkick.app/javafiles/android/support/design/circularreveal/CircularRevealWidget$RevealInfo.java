// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;


// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget

public static class CircularRevealWidget$RevealInfo
{

	public boolean isInvalid()
	{
		return radius == 3.402823E+38F;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float radius>
	//    2    4:ldc1            #10  <Float 3.402823E+38F>
	//    3    6:fcmpl           
	//    4    7:ifne            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public void set(float f, float f1, float f2)
	{
		centerX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float centerX>
		centerY = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #23  <Field float centerY>
		radius = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #25  <Field float radius>
	//    9   15:return          
	}

	public void set(CircularRevealWidget$RevealInfo circularrevealwidget$revealinfo)
	{
		set(circularrevealwidget$revealinfo.centerX, circularrevealwidget$revealinfo.centerY, circularrevealwidget$revealinfo.radius);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #21  <Field float centerX>
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field float centerY>
	//    5    9:aload_1         
	//    6   10:getfield        #25  <Field float radius>
	//    7   13:invokevirtual   #35  <Method void set(float, float, float)>
	//    8   16:return          
	}

	public static final float INVALID_RADIUS = 3.402823E+38F;
	public float centerX;
	public float centerY;
	public float radius;

	private CircularRevealWidget$RevealInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public CircularRevealWidget$RevealInfo(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		centerX = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #21  <Field float centerX>
		centerY = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #23  <Field float centerY>
		radius = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #25  <Field float radius>
	//   11   19:return          
	}

	CircularRevealWidget$RevealInfo(CircularRevealWidget._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void CircularRevealWidget$RevealInfo()>
	//    2    4:return          
	}

	public CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo circularrevealwidget$revealinfo)
	{
		this(circularrevealwidget$revealinfo.centerX, circularrevealwidget$revealinfo.centerY, circularrevealwidget$revealinfo.radius);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #21  <Field float centerX>
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field float centerY>
	//    5    9:aload_1         
	//    6   10:getfield        #25  <Field float radius>
	//    7   13:invokespecial   #30  <Method void CircularRevealWidget$RevealInfo(float, float, float)>
	//    8   16:return          
	}
}
