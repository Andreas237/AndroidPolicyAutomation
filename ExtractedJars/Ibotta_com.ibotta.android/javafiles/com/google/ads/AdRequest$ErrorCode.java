// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads;


// Referenced classes of package com.google.ads:
//			AdRequest

public static final class AdRequest$ErrorCode extends Enum
{

	public static AdRequest$ErrorCode valueOf(String s)
	{
		return (AdRequest$ErrorCode)Enum.valueOf(com/google/ads/AdRequest$ErrorCode, s);
	//    0    0:ldc1            #2   <Class AdRequest$ErrorCode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdRequest$ErrorCode>
	//    4    9:areturn         
	}

	public static AdRequest$ErrorCode[] values()
	{
		return (AdRequest$ErrorCode[])((AdRequest$ErrorCode []) (zzcl)).clone();
	//    0    0:getstatic       #45  <Field AdRequest$ErrorCode[] zzcl>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.ads.AdRequest$ErrorCode_3B_.clone()>
	//    2    6:checkcast       #61  <Class AdRequest$ErrorCode[]>
	//    3    9:areturn         
	}

	public final String toString()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String description>
	//    2    4:areturn         
	}

	public static final AdRequest$ErrorCode INTERNAL_ERROR;
	public static final AdRequest$ErrorCode INVALID_REQUEST;
	public static final AdRequest$ErrorCode NETWORK_ERROR;
	public static final AdRequest$ErrorCode NO_FILL;
	private static final AdRequest$ErrorCode zzcl[];
	private final String description;

	static 
	{
		INVALID_REQUEST = new AdRequest$ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
	//    0    0:new             #2   <Class AdRequest$ErrorCode>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INVALID_REQUEST">
	//    3    6:iconst_0        
	//    4    7:ldc1            #22  <String "Invalid Ad request.">
	//    5    9:invokespecial   #26  <Method void AdRequest$ErrorCode(String, int, String)>
	//    6   12:putstatic       #28  <Field AdRequest$ErrorCode INVALID_REQUEST>
		NO_FILL = new AdRequest$ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
	//    7   15:new             #2   <Class AdRequest$ErrorCode>
	//    8   18:dup             
	//    9   19:ldc1            #29  <String "NO_FILL">
	//   10   21:iconst_1        
	//   11   22:ldc1            #31  <String "Ad request successful, but no ad returned due to lack of ad inventory.">
	//   12   24:invokespecial   #26  <Method void AdRequest$ErrorCode(String, int, String)>
	//   13   27:putstatic       #33  <Field AdRequest$ErrorCode NO_FILL>
		NETWORK_ERROR = new AdRequest$ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
	//   14   30:new             #2   <Class AdRequest$ErrorCode>
	//   15   33:dup             
	//   16   34:ldc1            #34  <String "NETWORK_ERROR">
	//   17   36:iconst_2        
	//   18   37:ldc1            #36  <String "A network error occurred.">
	//   19   39:invokespecial   #26  <Method void AdRequest$ErrorCode(String, int, String)>
	//   20   42:putstatic       #38  <Field AdRequest$ErrorCode NETWORK_ERROR>
		INTERNAL_ERROR = new AdRequest$ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
	//   21   45:new             #2   <Class AdRequest$ErrorCode>
	//   22   48:dup             
	//   23   49:ldc1            #39  <String "INTERNAL_ERROR">
	//   24   51:iconst_3        
	//   25   52:ldc1            #41  <String "There was an internal error.">
	//   26   54:invokespecial   #26  <Method void AdRequest$ErrorCode(String, int, String)>
	//   27   57:putstatic       #43  <Field AdRequest$ErrorCode INTERNAL_ERROR>
		zzcl = (new AdRequest$ErrorCode[] {
			INVALID_REQUEST, NO_FILL, NETWORK_ERROR, INTERNAL_ERROR
		});
	//   28   60:iconst_4        
	//   29   61:anewarray       AdRequest$ErrorCode[]
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:getstatic       #28  <Field AdRequest$ErrorCode INVALID_REQUEST>
	//   33   69:aastore         
	//   34   70:dup             
	//   35   71:iconst_1        
	//   36   72:getstatic       #33  <Field AdRequest$ErrorCode NO_FILL>
	//   37   75:aastore         
	//   38   76:dup             
	//   39   77:iconst_2        
	//   40   78:getstatic       #38  <Field AdRequest$ErrorCode NETWORK_ERROR>
	//   41   81:aastore         
	//   42   82:dup             
	//   43   83:iconst_3        
	//   44   84:getstatic       #43  <Field AdRequest$ErrorCode INTERNAL_ERROR>
	//   45   87:aastore         
	//   46   88:putstatic       #45  <Field AdRequest$ErrorCode[] zzcl>
	//*  47   91:return          
	}

	private AdRequest$ErrorCode(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		description = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #51  <Field String description>
	//    7   11:return          
	}
}
