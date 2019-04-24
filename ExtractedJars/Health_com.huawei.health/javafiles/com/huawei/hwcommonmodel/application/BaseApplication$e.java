// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwcommonmodel.application;


// Referenced classes of package com.huawei.hwcommonmodel.application:
//			BaseApplication

public static final class BaseApplication$e extends Enum
{

	public static BaseApplication$e valueOf(String s)
	{
		return (BaseApplication$e)Enum.valueOf(com/huawei/hwcommonmodel/application/BaseApplication$e, s);
	//    0    0:ldc1            #2   <Class BaseApplication$e>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BaseApplication$e>
	//    4    9:areturn         
	}

	public static BaseApplication$e[] values()
	{
		return (BaseApplication$e[])((BaseApplication$e []) (a)).clone();
	//    0    0:getstatic       #34  <Field BaseApplication$e[] a>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.huawei.hwcommonmodel.application.BaseApplication$e_3B_.clone()>
	//    2    6:checkcast       #50  <Class BaseApplication$e[]>
	//    3    9:areturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String c>
	//    2    4:areturn         
	}

	private static final BaseApplication$e a[];
	public static final BaseApplication$e d;
	public static final BaseApplication$e e;
	String c;

	static 
	{
		e = new BaseApplication$e("WEAR", 0, "com.huawei.bone");
	//    0    0:new             #2   <Class BaseApplication$e>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "WEAR">
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "com.huawei.bone">
	//    5    9:invokespecial   #24  <Method void BaseApplication$e(String, int, String)>
	//    6   12:putstatic       #26  <Field BaseApplication$e e>
		d = new BaseApplication$e("HEALTH", 1, "com.huawei.health");
	//    7   15:new             #2   <Class BaseApplication$e>
	//    8   18:dup             
	//    9   19:ldc1            #28  <String "HEALTH">
	//   10   21:iconst_1        
	//   11   22:ldc1            #30  <String "com.huawei.health">
	//   12   24:invokespecial   #24  <Method void BaseApplication$e(String, int, String)>
	//   13   27:putstatic       #32  <Field BaseApplication$e d>
		a = (new BaseApplication$e[] {
			e, d
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       BaseApplication$e[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #26  <Field BaseApplication$e e>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #32  <Field BaseApplication$e d>
	//   23   45:aastore         
	//   24   46:putstatic       #34  <Field BaseApplication$e[] a>
	//*  25   49:return          
	}

	private BaseApplication$e(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
		c = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #40  <Field String c>
	//    7   11:return          
	}
}
