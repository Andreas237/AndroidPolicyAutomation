// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core.assist;


public final class ImageScaleType extends Enum
{

	private ImageScaleType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ImageScaleType valueOf(String s)
	{
		return (ImageScaleType)Enum.valueOf(com/nostra13/universalimageloader/core/assist/ImageScaleType, s);
	//    0    0:ldc1            #2   <Class ImageScaleType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ImageScaleType>
	//    4    9:areturn         
	}

	public static ImageScaleType[] values()
	{
		return (ImageScaleType[])((ImageScaleType []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field ImageScaleType[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.nostra13.universalimageloader.core.assist.ImageScaleType_3B_.clone()>
	//    2    6:checkcast       #51  <Class ImageScaleType[]>
	//    3    9:areturn         
	}

	private static final ImageScaleType $VALUES[];
	public static final ImageScaleType EXACTLY;
	public static final ImageScaleType EXACTLY_STRETCHED;
	public static final ImageScaleType IN_SAMPLE_INT;
	public static final ImageScaleType IN_SAMPLE_POWER_OF_2;
	public static final ImageScaleType NONE;
	public static final ImageScaleType NONE_SAFE;

	static 
	{
		NONE = new ImageScaleType("NONE", 0);
	//    0    0:new             #2   <Class ImageScaleType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//    5   10:putstatic       #23  <Field ImageScaleType NONE>
		NONE_SAFE = new ImageScaleType("NONE_SAFE", 1);
	//    6   13:new             #2   <Class ImageScaleType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "NONE_SAFE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//   11   23:putstatic       #26  <Field ImageScaleType NONE_SAFE>
		IN_SAMPLE_POWER_OF_2 = new ImageScaleType("IN_SAMPLE_POWER_OF_2", 2);
	//   12   26:new             #2   <Class ImageScaleType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "IN_SAMPLE_POWER_OF_2">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//   17   36:putstatic       #29  <Field ImageScaleType IN_SAMPLE_POWER_OF_2>
		IN_SAMPLE_INT = new ImageScaleType("IN_SAMPLE_INT", 3);
	//   18   39:new             #2   <Class ImageScaleType>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "IN_SAMPLE_INT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//   23   49:putstatic       #32  <Field ImageScaleType IN_SAMPLE_INT>
		EXACTLY = new ImageScaleType("EXACTLY", 4);
	//   24   52:new             #2   <Class ImageScaleType>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "EXACTLY">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//   29   62:putstatic       #35  <Field ImageScaleType EXACTLY>
		EXACTLY_STRETCHED = new ImageScaleType("EXACTLY_STRETCHED", 5);
	//   30   65:new             #2   <Class ImageScaleType>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "EXACTLY_STRETCHED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void ImageScaleType(String, int)>
	//   35   75:putstatic       #38  <Field ImageScaleType EXACTLY_STRETCHED>
		$VALUES = (new ImageScaleType[] {
			NONE, NONE_SAFE, IN_SAMPLE_POWER_OF_2, IN_SAMPLE_INT, EXACTLY, EXACTLY_STRETCHED
		});
	//   36   78:bipush          6
	//   37   80:anewarray       ImageScaleType[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field ImageScaleType NONE>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field ImageScaleType NONE_SAFE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field ImageScaleType IN_SAMPLE_POWER_OF_2>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field ImageScaleType IN_SAMPLE_INT>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field ImageScaleType EXACTLY>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field ImageScaleType EXACTLY_STRETCHED>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field ImageScaleType[] $VALUES>
	//*  63  122:return          
	}
}
