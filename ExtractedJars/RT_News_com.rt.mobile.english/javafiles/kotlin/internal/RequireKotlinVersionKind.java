// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.internal;


public final class RequireKotlinVersionKind extends Enum
{

	protected RequireKotlinVersionKind(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RequireKotlinVersionKind valueOf(String s)
	{
		return (RequireKotlinVersionKind)Enum.valueOf(kotlin/internal/RequireKotlinVersionKind, s);
	//    0    0:ldc1            #2   <Class RequireKotlinVersionKind>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RequireKotlinVersionKind>
	//    4    9:areturn         
	}

	public static RequireKotlinVersionKind[] values()
	{
		return (RequireKotlinVersionKind[])((RequireKotlinVersionKind []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field RequireKotlinVersionKind[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lkotlin.internal.RequireKotlinVersionKind_3B_.clone()>
	//    2    6:checkcast       #55  <Class RequireKotlinVersionKind[]>
	//    3    9:areturn         
	}

	private static final RequireKotlinVersionKind $VALUES[];
	public static final RequireKotlinVersionKind API_VERSION;
	public static final RequireKotlinVersionKind COMPILER_VERSION;
	public static final RequireKotlinVersionKind LANGUAGE_VERSION;

	static 
	{
		RequireKotlinVersionKind requirekotlinversionkind = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
	//    0    0:new             #2   <Class RequireKotlinVersionKind>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "LANGUAGE_VERSION">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void RequireKotlinVersionKind(String, int)>
	//    5   10:astore_0        
		LANGUAGE_VERSION = requirekotlinversionkind;
	//    6   11:aload_0         
	//    7   12:putstatic       #36  <Field RequireKotlinVersionKind LANGUAGE_VERSION>
		RequireKotlinVersionKind requirekotlinversionkind1 = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
	//    8   15:new             #2   <Class RequireKotlinVersionKind>
	//    9   18:dup             
	//   10   19:ldc1            #37  <String "COMPILER_VERSION">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #34  <Method void RequireKotlinVersionKind(String, int)>
	//   13   25:astore_1        
		COMPILER_VERSION = requirekotlinversionkind1;
	//   14   26:aload_1         
	//   15   27:putstatic       #39  <Field RequireKotlinVersionKind COMPILER_VERSION>
		RequireKotlinVersionKind requirekotlinversionkind2 = new RequireKotlinVersionKind("API_VERSION", 2);
	//   16   30:new             #2   <Class RequireKotlinVersionKind>
	//   17   33:dup             
	//   18   34:ldc1            #40  <String "API_VERSION">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #34  <Method void RequireKotlinVersionKind(String, int)>
	//   21   40:astore_2        
		API_VERSION = requirekotlinversionkind2;
	//   22   41:aload_2         
	//   23   42:putstatic       #42  <Field RequireKotlinVersionKind API_VERSION>
		$VALUES = (new RequireKotlinVersionKind[] {
			requirekotlinversionkind, requirekotlinversionkind1, requirekotlinversionkind2
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       RequireKotlinVersionKind[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_0         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:putstatic       #44  <Field RequireKotlinVersionKind[] $VALUES>
	//*  39   64:return          
	}
}
