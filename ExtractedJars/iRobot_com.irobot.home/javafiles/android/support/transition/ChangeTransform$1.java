// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Property;

// Referenced classes of package android.support.transition:
//			ChangeTransform

static final class ChangeTransform$1 extends Property
{

	public void a(ChangeTransform$b changetransform$b, float af[])
	{
		changetransform$b.a(af);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #19  <Method void ChangeTransform$b.a(float[])>
	//    3    5:return          
	}

	public float[] a(ChangeTransform$b changetransform$b)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object get(Object obj)
	{
		return ((Object) (a((ChangeTransform$b)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ChangeTransform$b>
	//    3    5:invokevirtual   #24  <Method float[] a(ChangeTransform$b)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((ChangeTransform$b)obj, (float[])obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ChangeTransform$b>
	//    3    5:aload_2         
	//    4    6:checkcast       #28  <Class float[]>
	//    5    9:invokevirtual   #30  <Method void a(ChangeTransform$b, float[])>
	//    6   12:return          
	}

	ChangeTransform$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
