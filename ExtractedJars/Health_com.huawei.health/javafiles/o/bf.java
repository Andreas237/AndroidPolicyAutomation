// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Type;
import java.util.Date;

// Referenced classes of package o:
//			bl, bi

public final class bf
	implements bl, bi
{

	public bf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final Object b(Object obj)
	{
		return ((Object) (Long.valueOf(((Date)obj).getTime())));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Date>
	//    2    4:invokevirtual   #21  <Method long Date.getTime()>
	//    3    7:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    4   10:areturn         
	}

	public final Object d(Object obj, Type type)
	{
		return ((Object) (new Date(((Long)obj).longValue())));
	//    0    0:new             #17  <Class Date>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #23  <Class Long>
	//    4    8:invokevirtual   #32  <Method long Long.longValue()>
	//    5   11:invokespecial   #35  <Method void Date(long)>
	//    6   14:areturn         
	}

	public final boolean e(Class class1)
	{
		return ((Class) (java/util/Date)).isAssignableFrom(class1);
	//    0    0:ldc1            #17  <Class Date>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #42  <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ireturn         
	}
}
