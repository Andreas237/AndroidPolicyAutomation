// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.Property;

// Referenced classes of package android.support.v7.widget:
//			SwitchCompat

static final class SwitchCompat$1 extends Property
{

	public Float get(SwitchCompat switchcompat)
	{
		return Float.valueOf(switchcompat.mThumbPosition);
	//    0    0:aload_1         
	//    1    1:getfield        #18  <Field float SwitchCompat.mThumbPosition>
	//    2    4:invokestatic    #24  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((SwitchCompat)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class SwitchCompat>
	//    3    5:invokevirtual   #27  <Method Float get(SwitchCompat)>
	//    4    8:areturn         
	}

	public void set(SwitchCompat switchcompat, Float float1)
	{
		switchcompat.setThumbPosition(float1.floatValue());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method float Float.floatValue()>
	//    3    5:invokevirtual   #37  <Method void SwitchCompat.setThumbPosition(float)>
	//    4    8:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((SwitchCompat)obj, (Float)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class SwitchCompat>
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class Float>
	//    5    9:invokevirtual   #40  <Method void set(SwitchCompat, Float)>
	//    6   12:return          
	}

	SwitchCompat$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
