// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;


// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GigyaProvider

public static final class GigyaProvider$HttpMethod extends Enum
{

	public static GigyaProvider$HttpMethod valueOf(String s)
	{
		return (GigyaProvider$HttpMethod)Enum.valueOf(com/gigya/socialize/android/login/providers/GigyaProvider$HttpMethod, s);
	//    0    0:ldc1            #2   <Class GigyaProvider$HttpMethod>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GigyaProvider$HttpMethod>
	//    4    9:areturn         
	}

	public static GigyaProvider$HttpMethod[] values()
	{
		return (GigyaProvider$HttpMethod[])((GigyaProvider$HttpMethod []) ($VALUES)).clone();
	//    0    0:getstatic       #29  <Field GigyaProvider$HttpMethod[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.gigya.socialize.android.login.providers.GigyaProvider$HttpMethod_3B_.clone()>
	//    2    6:checkcast       #45  <Class GigyaProvider$HttpMethod[]>
	//    3    9:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String value>
	//    2    4:areturn         
	}

	private static final GigyaProvider$HttpMethod $VALUES[];
	public static final GigyaProvider$HttpMethod GET;
	public static final GigyaProvider$HttpMethod POST;
	private String value;

	static 
	{
		GET = new GigyaProvider$HttpMethod("GET", 0, "GET");
	//    0    0:new             #2   <Class GigyaProvider$HttpMethod>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "GET">
	//    3    6:iconst_0        
	//    4    7:ldc1            #18  <String "GET">
	//    5    9:invokespecial   #22  <Method void GigyaProvider$HttpMethod(String, int, String)>
	//    6   12:putstatic       #24  <Field GigyaProvider$HttpMethod GET>
		POST = new GigyaProvider$HttpMethod("POST", 1, "POST");
	//    7   15:new             #2   <Class GigyaProvider$HttpMethod>
	//    8   18:dup             
	//    9   19:ldc1            #25  <String "POST">
	//   10   21:iconst_1        
	//   11   22:ldc1            #25  <String "POST">
	//   12   24:invokespecial   #22  <Method void GigyaProvider$HttpMethod(String, int, String)>
	//   13   27:putstatic       #27  <Field GigyaProvider$HttpMethod POST>
		$VALUES = (new GigyaProvider$HttpMethod[] {
			GET, POST
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       GigyaProvider$HttpMethod[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #24  <Field GigyaProvider$HttpMethod GET>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #27  <Field GigyaProvider$HttpMethod POST>
	//   23   45:aastore         
	//   24   46:putstatic       #29  <Field GigyaProvider$HttpMethod[] $VALUES>
	//*  25   49:return          
	}

	private GigyaProvider$HttpMethod(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		value = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #35  <Field String value>
	//    7   11:return          
	}
}
