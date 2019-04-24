// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ed

public static final class ed$e extends Enum
{

	public static ed$e valueOf(String s)
	{
		return (ed$e)Enum.valueOf(com/amap/api/mapcore/util/ed$e, s);
	//    0    0:ldc1            #2   <Class ed$e>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ed$e>
	//    4    9:areturn         
	}

	public static ed$e[] values()
	{
		return (ed$e[])((ed$e []) (d)).clone();
	//    0    0:getstatic       #34  <Field ed$e[] d>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.amap.api.mapcore.util.ed$e_3B_.clone()>
	//    2    6:checkcast       #45  <Class ed$e[]>
	//    3    9:areturn         
	}

	public static final ed$e a;
	public static final ed$e b;
	public static final ed$e c;
	private static final ed$e d[];

	static 
	{
		a = new ed$e("PENDING", 0);
	//    0    0:new             #2   <Class ed$e>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "PENDING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ed$e(String, int)>
	//    5   10:putstatic       #24  <Field ed$e a>
		b = new ed$e("RUNNING", 1);
	//    6   13:new             #2   <Class ed$e>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ed$e(String, int)>
	//   11   23:putstatic       #28  <Field ed$e b>
		c = new ed$e("FINISHED", 2);
	//   12   26:new             #2   <Class ed$e>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "FINISHED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ed$e(String, int)>
	//   17   36:putstatic       #32  <Field ed$e c>
		d = (new ed$e[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ed$e[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #24  <Field ed$e a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #28  <Field ed$e b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #32  <Field ed$e c>
	//   31   60:aastore         
	//   32   61:putstatic       #34  <Field ed$e[] d>
	//*  33   64:return          
	}

	private ed$e(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
