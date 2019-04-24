// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ViewUtils

static final class ViewUtils$1 extends Property
{

	public Float get(View view)
	{
		return Float.valueOf(ViewUtils.getTransitionAlpha(view));
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method float ViewUtils.getTransitionAlpha(View)>
	//    2    4:invokestatic    #24  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class View>
	//    3    5:invokevirtual   #29  <Method Float get(View)>
	//    4    8:areturn         
	}

	public void set(View view, Float float1)
	{
		ViewUtils.setTransitionAlpha(view, float1.floatValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #35  <Method float Float.floatValue()>
	//    3    5:invokestatic    #39  <Method void ViewUtils.setTransitionAlpha(View, float)>
	//    4    8:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((View)obj, (Float)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class Float>
	//    5    9:invokevirtual   #42  <Method void set(View, Float)>
	//    6   12:return          
	}

	ViewUtils$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
