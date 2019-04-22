// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.util.Property;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget

public static class CircularRevealWidget$CircularRevealProperty extends Property
{

	public CircularRevealWidget.RevealInfo get(CircularRevealWidget circularrevealwidget)
	{
		return circularrevealwidget.getRevealInfo();
	//    0    0:aload_1         
	//    1    1:invokeinterface #32  <Method CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//    2    6:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((CircularRevealWidget)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class CircularRevealWidget>
	//    3    5:invokevirtual   #35  <Method CircularRevealWidget$RevealInfo get(CircularRevealWidget)>
	//    4    8:areturn         
	}

	public void set(CircularRevealWidget circularrevealwidget, CircularRevealWidget.RevealInfo revealinfo)
	{
		circularrevealwidget.setRevealInfo(revealinfo);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #41  <Method void CircularRevealWidget.setRevealInfo(CircularRevealWidget$RevealInfo)>
	//    3    7:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((CircularRevealWidget)obj, (CircularRevealWidget.RevealInfo)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class CircularRevealWidget>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class CircularRevealWidget$RevealInfo>
	//    5    9:invokevirtual   #44  <Method void set(CircularRevealWidget, CircularRevealWidget$RevealInfo)>
	//    6   12:return          
	}

	public static final Property CIRCULAR_REVEAL = new CircularRevealWidget$CircularRevealProperty("circularReveal");

	static 
	{
	//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealProperty>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "circularReveal">
	//    3    6:invokespecial   #18  <Method void CircularRevealWidget$CircularRevealProperty(String)>
	//    4    9:putstatic       #20  <Field Property CIRCULAR_REVEAL>
	//*   5   12:return          
	}

	private CircularRevealWidget$CircularRevealProperty(String s)
	{
		super(android/support/design/circularreveal/CircularRevealWidget$RevealInfo, s);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class CircularRevealWidget$RevealInfo>
	//    2    3:aload_1         
	//    3    4:invokespecial   #26  <Method void Property(Class, String)>
	//    4    7:return          
	}
}
