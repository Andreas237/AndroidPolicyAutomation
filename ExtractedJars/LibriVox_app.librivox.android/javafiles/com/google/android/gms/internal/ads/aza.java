// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ayv, ayx

public abstract class aza
{

	public aza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static aza a(Class class1)
	{
		if(System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik"))
	//*   0    0:ldc1            #13  <String "java.vm.name">
	//*   1    2:invokestatic    #19  <Method String System.getProperty(String)>
	//*   2    5:ldc1            #21  <String "Dalvik">
	//*   3    7:invokevirtual   #27  <Method boolean String.equalsIgnoreCase(String)>
	//*   4   10:ifeq            25
			return ((aza) (new ayv(class1.getSimpleName())));
	//    5   13:new             #29  <Class ayv>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokevirtual   #35  <Method String Class.getSimpleName()>
	//    9   21:invokespecial   #38  <Method void ayv(String)>
	//   10   24:areturn         
		else
			return ((aza) (new ayx(class1.getSimpleName())));
	//   11   25:new             #40  <Class ayx>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokevirtual   #35  <Method String Class.getSimpleName()>
	//   15   33:invokespecial   #41  <Method void ayx(String)>
	//   16   36:areturn         
	}

	public abstract void a(String s);
}
