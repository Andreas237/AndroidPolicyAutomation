// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.configuration;


// Referenced classes of package com.appboy.configuration:
//			AppboyConfigurationProvider

static final class AppboyConfigurationProvider$a extends Enum
{

	public static AppboyConfigurationProvider$a valueOf(String s)
	{
		return (AppboyConfigurationProvider$a)Enum.valueOf(com/appboy/configuration/AppboyConfigurationProvider$a, s);
	//    0    0:ldc1            #2   <Class AppboyConfigurationProvider$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppboyConfigurationProvider$a>
	//    4    9:areturn         
	}

	public static AppboyConfigurationProvider$a[] values()
	{
		return (AppboyConfigurationProvider$a[])((AppboyConfigurationProvider$a []) (c)).clone();
	//    0    0:getstatic       #28  <Field AppboyConfigurationProvider$a[] c>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.configuration.AppboyConfigurationProvider$a_3B_.clone()>
	//    2    6:checkcast       #39  <Class AppboyConfigurationProvider$a[]>
	//    3    9:areturn         
	}

	public static final AppboyConfigurationProvider$a a;
	public static final AppboyConfigurationProvider$a b;
	private static final AppboyConfigurationProvider$a c[];

	static 
	{
		a = new AppboyConfigurationProvider$a("SMALL", 0);
	//    0    0:new             #2   <Class AppboyConfigurationProvider$a>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "SMALL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AppboyConfigurationProvider$a(String, int)>
	//    5   10:putstatic       #22  <Field AppboyConfigurationProvider$a a>
		b = new AppboyConfigurationProvider$a("LARGE", 1);
	//    6   13:new             #2   <Class AppboyConfigurationProvider$a>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "LARGE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AppboyConfigurationProvider$a(String, int)>
	//   11   23:putstatic       #26  <Field AppboyConfigurationProvider$a b>
		c = (new AppboyConfigurationProvider$a[] {
			a, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppboyConfigurationProvider$a[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field AppboyConfigurationProvider$a a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field AppboyConfigurationProvider$a b>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field AppboyConfigurationProvider$a[] c>
	//*  23   45:return          
	}

	private AppboyConfigurationProvider$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
