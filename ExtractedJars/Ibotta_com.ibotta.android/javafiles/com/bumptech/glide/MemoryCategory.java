// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


public final class MemoryCategory extends Enum
{

	private MemoryCategory(String s, int i, float f)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		multiplier = f;
	//    4    6:aload_0         
	//    5    7:fload_3         
	//    6    8:putfield        #38  <Field float multiplier>
	//    7   11:return          
	}

	public static MemoryCategory valueOf(String s)
	{
		return (MemoryCategory)Enum.valueOf(com/bumptech/glide/MemoryCategory, s);
	//    0    0:ldc1            #2   <Class MemoryCategory>
	//    1    2:aload_0         
	//    2    3:invokestatic    #45  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MemoryCategory>
	//    4    9:areturn         
	}

	public static MemoryCategory[] values()
	{
		return (MemoryCategory[])((MemoryCategory []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field MemoryCategory[] $VALUES>
	//    1    3:invokevirtual   #52  <Method Object _5B_Lcom.bumptech.glide.MemoryCategory_3B_.clone()>
	//    2    6:checkcast       #48  <Class MemoryCategory[]>
	//    3    9:areturn         
	}

	private static final MemoryCategory $VALUES[];
	public static final MemoryCategory HIGH;
	public static final MemoryCategory LOW;
	public static final MemoryCategory NORMAL;
	private final float multiplier;

	static 
	{
		LOW = new MemoryCategory("LOW", 0, 0.5F);
	//    0    0:new             #2   <Class MemoryCategory>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LOW">
	//    3    6:iconst_0        
	//    4    7:ldc1            #17  <Float 0.5F>
	//    5    9:invokespecial   #21  <Method void MemoryCategory(String, int, float)>
	//    6   12:putstatic       #23  <Field MemoryCategory LOW>
		NORMAL = new MemoryCategory("NORMAL", 1, 1.0F);
	//    7   15:new             #2   <Class MemoryCategory>
	//    8   18:dup             
	//    9   19:ldc1            #24  <String "NORMAL">
	//   10   21:iconst_1        
	//   11   22:fconst_1        
	//   12   23:invokespecial   #21  <Method void MemoryCategory(String, int, float)>
	//   13   26:putstatic       #26  <Field MemoryCategory NORMAL>
		HIGH = new MemoryCategory("HIGH", 2, 1.5F);
	//   14   29:new             #2   <Class MemoryCategory>
	//   15   32:dup             
	//   16   33:ldc1            #27  <String "HIGH">
	//   17   35:iconst_2        
	//   18   36:ldc1            #28  <Float 1.5F>
	//   19   38:invokespecial   #21  <Method void MemoryCategory(String, int, float)>
	//   20   41:putstatic       #30  <Field MemoryCategory HIGH>
		$VALUES = (new MemoryCategory[] {
			LOW, NORMAL, HIGH
		});
	//   21   44:iconst_3        
	//   22   45:anewarray       MemoryCategory[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:getstatic       #23  <Field MemoryCategory LOW>
	//   26   53:aastore         
	//   27   54:dup             
	//   28   55:iconst_1        
	//   29   56:getstatic       #26  <Field MemoryCategory NORMAL>
	//   30   59:aastore         
	//   31   60:dup             
	//   32   61:iconst_2        
	//   33   62:getstatic       #30  <Field MemoryCategory HIGH>
	//   34   65:aastore         
	//   35   66:putstatic       #32  <Field MemoryCategory[] $VALUES>
	//*  36   69:return          
	}
}
