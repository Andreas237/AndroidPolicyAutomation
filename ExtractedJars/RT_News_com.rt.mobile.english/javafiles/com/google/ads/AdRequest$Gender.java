// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads;


// Referenced classes of package com.google.ads:
//			AdRequest

public static final class AdRequest$Gender extends Enum
{

	public static AdRequest$Gender valueOf(String s)
	{
		return (AdRequest$Gender)Enum.valueOf(com/google/ads/AdRequest$Gender, s);
	//    0    0:ldc1            #2   <Class AdRequest$Gender>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdRequest$Gender>
	//    4    9:areturn         
	}

	public static AdRequest$Gender[] values()
	{
		return (AdRequest$Gender[])((AdRequest$Gender []) (zzcm)).clone();
	//    0    0:getstatic       #31  <Field AdRequest$Gender[] zzcm>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.google.ads.AdRequest$Gender_3B_.clone()>
	//    2    6:checkcast       #42  <Class AdRequest$Gender[]>
	//    3    9:areturn         
	}

	public static final AdRequest$Gender FEMALE;
	public static final AdRequest$Gender MALE;
	public static final AdRequest$Gender UNKNOWN;
	private static final AdRequest$Gender zzcm[];

	static 
	{
		UNKNOWN = new AdRequest$Gender("UNKNOWN", 0);
	//    0    0:new             #2   <Class AdRequest$Gender>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AdRequest$Gender(String, int)>
	//    5   10:putstatic       #23  <Field AdRequest$Gender UNKNOWN>
		MALE = new AdRequest$Gender("MALE", 1);
	//    6   13:new             #2   <Class AdRequest$Gender>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "MALE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AdRequest$Gender(String, int)>
	//   11   23:putstatic       #26  <Field AdRequest$Gender MALE>
		FEMALE = new AdRequest$Gender("FEMALE", 2);
	//   12   26:new             #2   <Class AdRequest$Gender>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "FEMALE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void AdRequest$Gender(String, int)>
	//   17   36:putstatic       #29  <Field AdRequest$Gender FEMALE>
		zzcm = (new AdRequest$Gender[] {
			UNKNOWN, MALE, FEMALE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       AdRequest$Gender[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field AdRequest$Gender UNKNOWN>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field AdRequest$Gender MALE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field AdRequest$Gender FEMALE>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field AdRequest$Gender[] zzcm>
	//*  33   64:return          
	}

	private AdRequest$Gender(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
