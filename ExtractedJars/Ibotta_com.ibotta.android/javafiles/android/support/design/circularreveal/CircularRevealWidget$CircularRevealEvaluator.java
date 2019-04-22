// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.animation.TypeEvaluator;
import android.support.design.widget.MathUtils;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget

public static class CircularRevealWidget$CircularRevealEvaluator
	implements TypeEvaluator
{

	public CircularRevealWidget.RevealInfo evaluate(float f, CircularRevealWidget.RevealInfo revealinfo, CircularRevealWidget.RevealInfo revealinfo1)
	{
		revealInfo.set(MathUtils.lerp(revealinfo.centerX, revealinfo1.centerX, f), MathUtils.lerp(revealinfo.centerY, revealinfo1.centerY, f), MathUtils.lerp(revealinfo.radius, revealinfo1.radius, f));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    2    4:aload_2         
	//    3    5:getfield        #37  <Field float CircularRevealWidget$RevealInfo.centerX>
	//    4    8:aload_3         
	//    5    9:getfield        #37  <Field float CircularRevealWidget$RevealInfo.centerX>
	//    6   12:fload_1         
	//    7   13:invokestatic    #43  <Method float MathUtils.lerp(float, float, float)>
	//    8   16:aload_2         
	//    9   17:getfield        #46  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   10   20:aload_3         
	//   11   21:getfield        #46  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   12   24:fload_1         
	//   13   25:invokestatic    #43  <Method float MathUtils.lerp(float, float, float)>
	//   14   28:aload_2         
	//   15   29:getfield        #49  <Field float CircularRevealWidget$RevealInfo.radius>
	//   16   32:aload_3         
	//   17   33:getfield        #49  <Field float CircularRevealWidget$RevealInfo.radius>
	//   18   36:fload_1         
	//   19   37:invokestatic    #43  <Method float MathUtils.lerp(float, float, float)>
	//   20   40:invokevirtual   #53  <Method void CircularRevealWidget$RevealInfo.set(float, float, float)>
		return revealInfo;
	//   21   43:aload_0         
	//   22   44:getfield        #31  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   23   47:areturn         
	}

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (CircularRevealWidget.RevealInfo)obj, (CircularRevealWidget.RevealInfo)obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #26  <Class CircularRevealWidget$RevealInfo>
	//    4    6:aload_3         
	//    5    7:checkcast       #26  <Class CircularRevealWidget$RevealInfo>
	//    6   10:invokevirtual   #56  <Method CircularRevealWidget$RevealInfo evaluate(float, CircularRevealWidget$RevealInfo, CircularRevealWidget$RevealInfo)>
	//    7   13:areturn         
	}

	public static final TypeEvaluator CIRCULAR_REVEAL = new CircularRevealWidget$CircularRevealEvaluator();
	private final CircularRevealWidget.RevealInfo revealInfo = new CircularRevealWidget.RevealInfo(((CircularRevealWidget._cls1) (null)));

	static 
	{
	//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealEvaluator>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void CircularRevealWidget$CircularRevealEvaluator()>
	//    3    7:putstatic       #22  <Field TypeEvaluator CIRCULAR_REVEAL>
	//*   4   10:return          
	}

	public CircularRevealWidget$CircularRevealEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class CircularRevealWidget$RevealInfo>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #29  <Method void CircularRevealWidget$RevealInfo(CircularRevealWidget$1)>
	//    7   13:putfield        #31  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   16:return          
	}
}
