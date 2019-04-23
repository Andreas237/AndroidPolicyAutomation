// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;


// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

public static final class MadvertiseUtil$HashType extends Enum
{

	public static MadvertiseUtil$HashType valueOf(String s)
	{
		return (MadvertiseUtil$HashType)Enum.valueOf(com/appscend/mraid/MadvertiseUtil$HashType, s);
	//    0    0:ldc1            #2   <Class MadvertiseUtil$HashType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MadvertiseUtil$HashType>
	//    4    9:areturn         
	}

	public static MadvertiseUtil$HashType[] values()
	{
		return (MadvertiseUtil$HashType[])((MadvertiseUtil$HashType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field MadvertiseUtil$HashType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.appscend.mraid.MadvertiseUtil$HashType_3B_.clone()>
	//    2    6:checkcast       #38  <Class MadvertiseUtil$HashType[]>
	//    3    9:areturn         
	}

	private static final MadvertiseUtil$HashType $VALUES[];
	public static final MadvertiseUtil$HashType MD5;
	public static final MadvertiseUtil$HashType SHA1;

	static 
	{
		MD5 = new MadvertiseUtil$HashType("MD5", 0);
	//    0    0:new             #2   <Class MadvertiseUtil$HashType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "MD5">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void MadvertiseUtil$HashType(String, int)>
	//    5   10:putstatic       #22  <Field MadvertiseUtil$HashType MD5>
		SHA1 = new MadvertiseUtil$HashType("SHA1", 1);
	//    6   13:new             #2   <Class MadvertiseUtil$HashType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "SHA1">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void MadvertiseUtil$HashType(String, int)>
	//   11   23:putstatic       #25  <Field MadvertiseUtil$HashType SHA1>
		$VALUES = (new MadvertiseUtil$HashType[] {
			MD5, SHA1
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       MadvertiseUtil$HashType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field MadvertiseUtil$HashType MD5>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field MadvertiseUtil$HashType SHA1>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field MadvertiseUtil$HashType[] $VALUES>
	//*  23   45:return          
	}

	private MadvertiseUtil$HashType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
