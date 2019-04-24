// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			au

static final class au$1 extends Property
{

	public Float a(View view)
	{
		return Float.valueOf(au.c(view));
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method float au.c(View)>
	//    2    4:invokestatic    #24  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	public void a(View view, Float float1)
	{
		au.a(view, float1.floatValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #29  <Method float Float.floatValue()>
	//    3    5:invokestatic    #32  <Method void au.a(View, float)>
	//    4    8:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class View>
	//    3    5:invokevirtual   #38  <Method Float a(View)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((View)obj, (Float)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class Float>
	//    5    9:invokevirtual   #42  <Method void a(View, Float)>
	//    6   12:return          
	}

	au$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
