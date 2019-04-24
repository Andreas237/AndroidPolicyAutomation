// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			z, at, ad, av, 
//			ah, ax, af

public class al
{

	public al()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public at a(Class class1)
	{
		return ((at) (new z(class1)));
	//    0    0:new             #13  <Class z>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #16  <Method void z(Class)>
	//    4    8:areturn         
	}

	public av a(ad ad)
	{
		return ((av) (ad));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public ax a(ah ah)
	{
		return ((ax) (ah));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public String a(af af)
	{
		String s = ((Object) (((Object) (af)).getClass().getGenericInterfaces()[0])).toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #29  <Method java.lang.reflect.Type[] Class.getGenericInterfaces()>
	//    3    7:iconst_0        
	//    4    8:aaload          
	//    5    9:invokevirtual   #33  <Method String Object.toString()>
	//    6   12:astore_2        
		af = ((af) (s));
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(s.startsWith("truenet.kotlin.jvm.functions."))
	//*   9   15:aload_2         
	//*  10   16:ldc1            #35  <String "truenet.kotlin.jvm.functions.">
	//*  11   18:invokevirtual   #41  <Method boolean String.startsWith(String)>
	//*  12   21:ifeq            34
			af = ((af) (s.substring("truenet.kotlin.jvm.functions.".length())));
	//   13   24:aload_2         
	//   14   25:ldc1            #35  <String "truenet.kotlin.jvm.functions.">
	//   15   27:invokevirtual   #45  <Method int String.length()>
	//   16   30:invokevirtual   #49  <Method String String.substring(int)>
	//   17   33:astore_1        
		return ((String) (af));
	//   18   34:aload_1         
	//   19   35:areturn         
	}
}
