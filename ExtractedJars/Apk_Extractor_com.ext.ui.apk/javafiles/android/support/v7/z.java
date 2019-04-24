// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			at, y, ae, u

public final class z
	implements at, y
{

	public z(Class class1)
	{
		ae.b(((Object) (class1)), "jClass");
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "jClass">
	//    2    3:invokestatic    #23  <Method void ae.b(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #26  <Method void Object()>
		a = class1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #28  <Field Class a>
	//    8   15:return          
	}

	public Class a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Class a>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof z) && ae.a(((Object) (u.a(((at) (this))))), ((Object) (u.a((at)obj))));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class z>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:invokestatic    #43  <Method Class u.a(at)>
	//    5   11:aload_1         
	//    6   12:checkcast       #7   <Class at>
	//    7   15:invokestatic    #43  <Method Class u.a(at)>
	//    8   18:invokestatic    #46  <Method boolean ae.a(Object, Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int hashCode()
	{
		return u.a(((at) (this))).hashCode();
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method Class u.a(at)>
	//    2    4:invokevirtual   #52  <Method int Class.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(a().toString()).append(" (Kotlin reflection is not available)").toString();
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #59  <Method Class a()>
	//    5   11:invokevirtual   #61  <Method String Class.toString()>
	//    6   14:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #67  <String " (Kotlin reflection is not available)">
	//    8   19:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	private final Class a;
}
