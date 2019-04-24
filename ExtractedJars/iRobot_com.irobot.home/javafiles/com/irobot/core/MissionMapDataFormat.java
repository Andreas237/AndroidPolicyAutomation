// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionMapDataFormat extends Enum
{

	private MissionMapDataFormat(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MissionMapDataFormat valueOf(String s)
	{
		return (MissionMapDataFormat)Enum.valueOf(com/irobot/core/MissionMapDataFormat, s);
	//    0    0:ldc1            #2   <Class MissionMapDataFormat>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MissionMapDataFormat>
	//    4    9:areturn         
	}

	public static MissionMapDataFormat[] values()
	{
		return (MissionMapDataFormat[])((MissionMapDataFormat []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field MissionMapDataFormat[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.irobot.core.MissionMapDataFormat_3B_.clone()>
	//    2    6:checkcast       #35  <Class MissionMapDataFormat[]>
	//    3    9:areturn         
	}

	private static final MissionMapDataFormat $VALUES[];
	public static final MissionMapDataFormat Image;
	public static final MissionMapDataFormat Umf;

	static 
	{
		Umf = new MissionMapDataFormat("Umf", 0);
	//    0    0:new             #2   <Class MissionMapDataFormat>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "Umf">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void MissionMapDataFormat(String, int)>
	//    5   10:putstatic       #19  <Field MissionMapDataFormat Umf>
		Image = new MissionMapDataFormat("Image", 1);
	//    6   13:new             #2   <Class MissionMapDataFormat>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "Image">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void MissionMapDataFormat(String, int)>
	//   11   23:putstatic       #22  <Field MissionMapDataFormat Image>
		$VALUES = (new MissionMapDataFormat[] {
			Umf, Image
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       MissionMapDataFormat[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field MissionMapDataFormat Umf>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field MissionMapDataFormat Image>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field MissionMapDataFormat[] $VALUES>
	//*  23   45:return          
	}
}
