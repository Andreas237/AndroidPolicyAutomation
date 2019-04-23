// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.util.Property;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget

public static class CircularRevealWidget$CircularRevealScrimColorProperty extends Property
{

	public Integer get(CircularRevealWidget circularrevealwidget)
	{
		return Integer.valueOf(circularrevealwidget.getCircularRevealScrimColor());
	//    0    0:aload_1         
	//    1    1:invokeinterface #32  <Method int CircularRevealWidget.getCircularRevealScrimColor()>
	//    2    6:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//    3    9:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((CircularRevealWidget)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class CircularRevealWidget>
	//    3    5:invokevirtual   #39  <Method Integer get(CircularRevealWidget)>
	//    4    8:areturn         
	}

	public void set(CircularRevealWidget circularrevealwidget, Integer integer)
	{
		circularrevealwidget.setCircularRevealScrimColor(integer.intValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method int Integer.intValue()>
	//    3    5:invokeinterface #48  <Method void CircularRevealWidget.setCircularRevealScrimColor(int)>
	//    4   10:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((CircularRevealWidget)obj, (Integer)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class CircularRevealWidget>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class Integer>
	//    5    9:invokevirtual   #51  <Method void set(CircularRevealWidget, Integer)>
	//    6   12:return          
	}

	public static final Property CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealWidget$CircularRevealScrimColorProperty("circularRevealScrimColor");

	static 
	{
	//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealScrimColorProperty>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "circularRevealScrimColor">
	//    3    6:invokespecial   #18  <Method void CircularRevealWidget$CircularRevealScrimColorProperty(String)>
	//    4    9:putstatic       #20  <Field Property CIRCULAR_REVEAL_SCRIM_COLOR>
	//*   5   12:return          
	}

	private CircularRevealWidget$CircularRevealScrimColorProperty(String s)
	{
		super(java/lang/Integer, s);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class Integer>
	//    2    3:aload_1         
	//    3    4:invokespecial   #26  <Method void Property(Class, String)>
	//    4    7:return          
	}
}
