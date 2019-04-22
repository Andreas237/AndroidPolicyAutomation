// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


final class GradientType extends Enum
{

	private GradientType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static GradientType valueOf(String s)
	{
		return (GradientType)Enum.valueOf(com/airbnb/lottie/GradientType, s);
	//    0    0:ldc1            #2   <Class GradientType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GradientType>
	//    4    9:areturn         
	}

	public static GradientType[] values()
	{
		return (GradientType[])((GradientType []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field GradientType[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.airbnb.lottie.GradientType_3B_.clone()>
	//    2    6:checkcast       #35  <Class GradientType[]>
	//    3    9:areturn         
	}

	private static final GradientType $VALUES[];
	public static final GradientType Linear;
	public static final GradientType Radial;

	static 
	{
		Linear = new GradientType("Linear", 0);
	//    0    0:new             #2   <Class GradientType>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "Linear">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void GradientType(String, int)>
	//    5   10:putstatic       #19  <Field GradientType Linear>
		Radial = new GradientType("Radial", 1);
	//    6   13:new             #2   <Class GradientType>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "Radial">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void GradientType(String, int)>
	//   11   23:putstatic       #22  <Field GradientType Radial>
		$VALUES = (new GradientType[] {
			Linear, Radial
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       GradientType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field GradientType Linear>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field GradientType Radial>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field GradientType[] $VALUES>
	//*  23   45:return          
	}
}
