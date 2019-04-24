// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			au

static final class au$2 extends Property
{

	public Rect a(View view)
	{
		return s.z(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method Rect s.z(View)>
	//    2    4:areturn         
	}

	public void a(View view, Rect rect)
	{
		s.a(view, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #22  <Method void s.a(View, Rect)>
	//    3    5:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class View>
	//    3    5:invokevirtual   #28  <Method Rect a(View)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((View)obj, (Rect)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #32  <Class Rect>
	//    5    9:invokevirtual   #33  <Method void a(View, Rect)>
	//    6   12:return          
	}

	au$2(Class class1, String s1)
	{
		super(class1, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
