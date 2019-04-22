// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class DrawableAlphaProperty extends Property
{

	private DrawableAlphaProperty()
	{
		super(java/lang/Integer, "drawableAlphaCompat");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <Class Integer>
	//    2    3:ldc1            #22  <String "drawableAlphaCompat">
	//    3    5:invokespecial   #25  <Method void Property(Class, String)>
	//    4    8:aload_0         
	//    5    9:new             #27  <Class WeakHashMap>
	//    6   12:dup             
	//    7   13:invokespecial   #28  <Method void WeakHashMap()>
	//    8   16:putfield        #30  <Field WeakHashMap alphaCache>
	//    9   19:return          
	}

	public Integer get(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return Integer.valueOf(drawable.getAlpha());
	//    3    8:aload_1         
	//    4    9:invokevirtual   #44  <Method int Drawable.getAlpha()>
	//    5   12:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    6   15:areturn         
		if(alphaCache.containsKey(((Object) (drawable))))
	//*   7   16:aload_0         
	//*   8   17:getfield        #30  <Field WeakHashMap alphaCache>
	//*   9   20:aload_1         
	//*  10   21:invokevirtual   #52  <Method boolean WeakHashMap.containsKey(Object)>
	//*  11   24:ifeq            39
			return (Integer)alphaCache.get(((Object) (drawable)));
	//   12   27:aload_0         
	//   13   28:getfield        #30  <Field WeakHashMap alphaCache>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #55  <Method Object WeakHashMap.get(Object)>
	//   16   35:checkcast       #20  <Class Integer>
	//   17   38:areturn         
		else
			return Integer.valueOf(255);
	//   18   39:sipush          255
	//   19   42:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   20   45:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((Drawable)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class Drawable>
	//    3    5:invokevirtual   #57  <Method Integer get(Drawable)>
	//    4    8:areturn         
	}

	public void set(Drawable drawable, Integer integer)
	{
		if(android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpge          18
			alphaCache.put(((Object) (drawable)), ((Object) (integer)));
	//    3    8:aload_0         
	//    4    9:getfield        #30  <Field WeakHashMap alphaCache>
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokevirtual   #63  <Method Object WeakHashMap.put(Object, Object)>
	//    8   17:pop             
		drawable.setAlpha(integer.intValue());
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokevirtual   #66  <Method int Integer.intValue()>
	//   12   23:invokevirtual   #70  <Method void Drawable.setAlpha(int)>
	//   13   26:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((Drawable)obj, (Integer)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class Drawable>
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class Integer>
	//    5    9:invokevirtual   #73  <Method void set(Drawable, Integer)>
	//    6   12:return          
	}

	public static final Property DRAWABLE_ALPHA_COMPAT = new DrawableAlphaProperty();
	private final WeakHashMap alphaCache = new WeakHashMap();

	static 
	{
	//    0    0:new             #2   <Class DrawableAlphaProperty>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void DrawableAlphaProperty()>
	//    3    7:putstatic       #17  <Field Property DRAWABLE_ALPHA_COMPAT>
	//*   4   10:return          
	}
}
