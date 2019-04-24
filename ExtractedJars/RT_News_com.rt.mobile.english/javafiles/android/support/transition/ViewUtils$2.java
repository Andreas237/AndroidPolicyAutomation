// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ViewUtils

static final class ViewUtils$2 extends Property
{

	public Rect get(View view)
	{
		return ViewCompat.getClipBounds(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method Rect ViewCompat.getClipBounds(View)>
	//    2    4:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class View>
	//    3    5:invokevirtual   #24  <Method Rect get(View)>
	//    4    8:areturn         
	}

	public void set(View view, Rect rect)
	{
		ViewCompat.setClipBounds(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #29  <Method void ViewCompat.setClipBounds(View, Rect)>
	//    3    5:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((View)obj, (Rect)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #32  <Class Rect>
	//    5    9:invokevirtual   #34  <Method void set(View, Rect)>
	//    6   12:return          
	}

	ViewUtils$2(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
