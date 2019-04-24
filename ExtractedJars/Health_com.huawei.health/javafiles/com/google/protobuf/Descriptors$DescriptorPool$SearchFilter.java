// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors

static final class Descriptors$DescriptorPool$SearchFilter extends Enum
{

	public static Descriptors$DescriptorPool$SearchFilter valueOf(String s)
	{
		return (Descriptors$DescriptorPool$SearchFilter)Enum.valueOf(com/google/protobuf/Descriptors$DescriptorPool$SearchFilter, s);
	//    0    0:ldc1            #2   <Class Descriptors$DescriptorPool$SearchFilter>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Descriptors$DescriptorPool$SearchFilter>
	//    4    9:areturn         
	}

	public static Descriptors$DescriptorPool$SearchFilter[] values()
	{
		return (Descriptors$DescriptorPool$SearchFilter[])((Descriptors$DescriptorPool$SearchFilter []) ($VALUES)).clone();
	//    0    0:getstatic       #34  <Field Descriptors$DescriptorPool$SearchFilter[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.google.protobuf.Descriptors$DescriptorPool$SearchFilter_3B_.clone()>
	//    2    6:checkcast       #45  <Class Descriptors$DescriptorPool$SearchFilter[]>
	//    3    9:areturn         
	}

	private static final Descriptors$DescriptorPool$SearchFilter $VALUES[];
	public static final Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY;
	public static final Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS;
	public static final Descriptors$DescriptorPool$SearchFilter TYPES_ONLY;

	static 
	{
		TYPES_ONLY = new Descriptors$DescriptorPool$SearchFilter("TYPES_ONLY", 0);
	//    0    0:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "TYPES_ONLY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
	//    5   10:putstatic       #26  <Field Descriptors$DescriptorPool$SearchFilter TYPES_ONLY>
		AGGREGATES_ONLY = new Descriptors$DescriptorPool$SearchFilter("AGGREGATES_ONLY", 1);
	//    6   13:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "AGGREGATES_ONLY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
	//   11   23:putstatic       #29  <Field Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY>
		ALL_SYMBOLS = new Descriptors$DescriptorPool$SearchFilter("ALL_SYMBOLS", 2);
	//   12   26:new             #2   <Class Descriptors$DescriptorPool$SearchFilter>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "ALL_SYMBOLS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void Descriptors$DescriptorPool$SearchFilter(String, int)>
	//   17   36:putstatic       #32  <Field Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS>
		$VALUES = (new Descriptors$DescriptorPool$SearchFilter[] {
			TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Descriptors$DescriptorPool$SearchFilter[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #26  <Field Descriptors$DescriptorPool$SearchFilter TYPES_ONLY>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #29  <Field Descriptors$DescriptorPool$SearchFilter AGGREGATES_ONLY>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #32  <Field Descriptors$DescriptorPool$SearchFilter ALL_SYMBOLS>
	//   31   60:aastore         
	//   32   61:putstatic       #34  <Field Descriptors$DescriptorPool$SearchFilter[] $VALUES>
	//*  33   64:return          
	}

	private Descriptors$DescriptorPool$SearchFilter(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
