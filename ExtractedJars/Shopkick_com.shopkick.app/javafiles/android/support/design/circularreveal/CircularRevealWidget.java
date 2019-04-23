// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.widget.MathUtils;
import android.util.Property;

public interface CircularRevealWidget
	extends CircularRevealHelper.Delegate
{
	public static class CircularRevealEvaluator
		implements TypeEvaluator
	{

		public RevealInfo evaluate(float f, RevealInfo revealinfo, RevealInfo revealinfo1)
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
			return ((Object) (evaluate(f, (RevealInfo)obj, (RevealInfo)obj1)));
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #26  <Class CircularRevealWidget$RevealInfo>
		//    4    6:aload_3         
		//    5    7:checkcast       #26  <Class CircularRevealWidget$RevealInfo>
		//    6   10:invokevirtual   #56  <Method CircularRevealWidget$RevealInfo evaluate(float, CircularRevealWidget$RevealInfo, CircularRevealWidget$RevealInfo)>
		//    7   13:areturn         
		}

		public static final TypeEvaluator CIRCULAR_REVEAL = new CircularRevealEvaluator();
		private final RevealInfo revealInfo = new RevealInfo();

		static 
		{
		//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealEvaluator>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void CircularRevealWidget$CircularRevealEvaluator()>
		//    3    7:putstatic       #22  <Field TypeEvaluator CIRCULAR_REVEAL>
		//*   4   10:return          
		}

		public CircularRevealEvaluator()
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

	public static class CircularRevealProperty extends Property
	{

		public RevealInfo get(CircularRevealWidget circularrevealwidget)
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

		public void set(CircularRevealWidget circularrevealwidget, RevealInfo revealinfo)
		{
			circularrevealwidget.setRevealInfo(revealinfo);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #41  <Method void CircularRevealWidget.setRevealInfo(CircularRevealWidget$RevealInfo)>
		//    3    7:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((CircularRevealWidget)obj, (RevealInfo)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class CircularRevealWidget>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class CircularRevealWidget$RevealInfo>
		//    5    9:invokevirtual   #44  <Method void set(CircularRevealWidget, CircularRevealWidget$RevealInfo)>
		//    6   12:return          
		}

		public static final Property CIRCULAR_REVEAL = new CircularRevealProperty("circularReveal");

		static 
		{
		//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealProperty>
		//    1    3:dup             
		//    2    4:ldc1            #14  <String "circularReveal">
		//    3    6:invokespecial   #18  <Method void CircularRevealWidget$CircularRevealProperty(String)>
		//    4    9:putstatic       #20  <Field Property CIRCULAR_REVEAL>
		//*   5   12:return          
		}

		private CircularRevealProperty(String s)
		{
			super(android/support/design/circularreveal/CircularRevealWidget$RevealInfo, s);
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <Class CircularRevealWidget$RevealInfo>
		//    2    3:aload_1         
		//    3    4:invokespecial   #26  <Method void Property(Class, String)>
		//    4    7:return          
		}
	}

	public static class CircularRevealScrimColorProperty extends Property
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

		public static final Property CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty("circularRevealScrimColor");

		static 
		{
		//    0    0:new             #2   <Class CircularRevealWidget$CircularRevealScrimColorProperty>
		//    1    3:dup             
		//    2    4:ldc1            #14  <String "circularRevealScrimColor">
		//    3    6:invokespecial   #18  <Method void CircularRevealWidget$CircularRevealScrimColorProperty(String)>
		//    4    9:putstatic       #20  <Field Property CIRCULAR_REVEAL_SCRIM_COLOR>
		//*   5   12:return          
		}

		private CircularRevealScrimColorProperty(String s)
		{
			super(java/lang/Integer, s);
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <Class Integer>
		//    2    3:aload_1         
		//    3    4:invokespecial   #26  <Method void Property(Class, String)>
		//    4    7:return          
		}
	}

	public static class RevealInfo
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

		public void set(RevealInfo revealinfo)
		{
			set(revealinfo.centerX, revealinfo.centerY, revealinfo.radius);
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

		private RevealInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

		public RevealInfo(float f, float f1, float f2)
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


		public RevealInfo(RevealInfo revealinfo)
		{
			this(revealinfo.centerX, revealinfo.centerY, revealinfo.radius);
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


	public abstract void buildCircularRevealCache();

	public abstract void destroyCircularRevealCache();

	public abstract void draw(Canvas canvas);

	public abstract Drawable getCircularRevealOverlayDrawable();

	public abstract int getCircularRevealScrimColor();

	public abstract RevealInfo getRevealInfo();

	public abstract boolean isOpaque();

	public abstract void setCircularRevealOverlayDrawable(Drawable drawable);

	public abstract void setCircularRevealScrimColor(int i);

	public abstract void setRevealInfo(RevealInfo revealinfo);
}
