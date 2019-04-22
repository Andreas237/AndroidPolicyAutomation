// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			Mask

static final class Mask$MaskMode extends Enum
{

	public static Mask$MaskMode valueOf(String s)
	{
		return (Mask$MaskMode)Enum.valueOf(com/airbnb/lottie/Mask$MaskMode, s);
	//    0    0:ldc1            #2   <Class Mask$MaskMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Mask$MaskMode>
	//    4    9:areturn         
	}

	public static Mask$MaskMode[] values()
	{
		return (Mask$MaskMode[])((Mask$MaskMode []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Mask$MaskMode[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.airbnb.lottie.Mask$MaskMode_3B_.clone()>
	//    2    6:checkcast       #46  <Class Mask$MaskMode[]>
	//    3    9:areturn         
	}

	private static final Mask$MaskMode $VALUES[];
	public static final Mask$MaskMode MaskModeAdd;
	public static final Mask$MaskMode MaskModeIntersect;
	public static final Mask$MaskMode MaskModeSubtract;
	public static final Mask$MaskMode MaskModeUnknown;

	static 
	{
		MaskModeAdd = new Mask$MaskMode("MaskModeAdd", 0);
	//    0    0:new             #2   <Class Mask$MaskMode>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "MaskModeAdd">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
	//    5   10:putstatic       #24  <Field Mask$MaskMode MaskModeAdd>
		MaskModeSubtract = new Mask$MaskMode("MaskModeSubtract", 1);
	//    6   13:new             #2   <Class Mask$MaskMode>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "MaskModeSubtract">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
	//   11   23:putstatic       #27  <Field Mask$MaskMode MaskModeSubtract>
		MaskModeIntersect = new Mask$MaskMode("MaskModeIntersect", 2);
	//   12   26:new             #2   <Class Mask$MaskMode>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "MaskModeIntersect">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
	//   17   36:putstatic       #30  <Field Mask$MaskMode MaskModeIntersect>
		MaskModeUnknown = new Mask$MaskMode("MaskModeUnknown", 3);
	//   18   39:new             #2   <Class Mask$MaskMode>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "MaskModeUnknown">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Mask$MaskMode(String, int)>
	//   23   49:putstatic       #33  <Field Mask$MaskMode MaskModeUnknown>
		$VALUES = (new Mask$MaskMode[] {
			MaskModeAdd, MaskModeSubtract, MaskModeIntersect, MaskModeUnknown
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Mask$MaskMode[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Mask$MaskMode MaskModeAdd>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Mask$MaskMode MaskModeSubtract>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Mask$MaskMode MaskModeIntersect>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Mask$MaskMode MaskModeUnknown>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Mask$MaskMode[] $VALUES>
	//*  43   83:return          
	}

	private Mask$MaskMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
