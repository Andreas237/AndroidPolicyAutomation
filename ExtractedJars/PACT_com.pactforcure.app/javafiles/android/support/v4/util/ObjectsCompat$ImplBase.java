// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//			ObjectsCompat

private static class ObjectsCompat$ImplBase
{

	public boolean equals(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:if_acmpeq       17
	//    3    5:aload_1         
	//    4    6:ifnull          19
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #19  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private ObjectsCompat$ImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	ObjectsCompat$ImplBase(ObjectsCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ObjectsCompat$ImplBase()>
	//    2    4:return          
	}
}
