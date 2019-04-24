// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Type;

// Referenced classes of package o:
//			bl, bi

public final class bg
	implements bl, bi
{

	public bg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final Object b(Object obj)
	{
		return ((Object) (((Enum)obj).name()));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Enum>
	//    2    4:invokevirtual   #21  <Method String Enum.name()>
	//    3    7:areturn         
	}

	public final Object d(Object obj, Type type)
	{
		return ((Object) (Enum.valueOf((Class)type, obj.toString())));
	//    0    0:aload_2         
	//    1    1:checkcast       #25  <Class Class>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method String Object.toString()>
	//    4    8:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    5   11:areturn         
	}

	public final boolean e(Class class1)
	{
		return ((Class) (java/lang/Enum)).isAssignableFrom(class1);
	//    0    0:ldc1            #17  <Class Enum>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #37  <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ireturn         
	}
}
