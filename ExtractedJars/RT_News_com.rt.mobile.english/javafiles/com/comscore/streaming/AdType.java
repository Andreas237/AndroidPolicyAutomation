// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;


public final class AdType extends Enum
{

	private AdType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void Enum(String, int)>
		a = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #54  <Field String a>
	//    7   11:return          
	}

	public static AdType valueOf(String s)
	{
		return (AdType)Enum.valueOf(com/comscore/streaming/AdType, s);
	//    0    0:ldc1            #2   <Class AdType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #61  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdType>
	//    4    9:areturn         
	}

	public static AdType[] values()
	{
		return (AdType[])((AdType []) (b)).clone();
	//    0    0:getstatic       #48  <Field AdType[] b>
	//    1    3:invokevirtual   #68  <Method Object _5B_Lcom.comscore.streaming.AdType_3B_.clone()>
	//    2    6:checkcast       #64  <Class AdType[]>
	//    3    9:areturn         
	}

	protected String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String a>
	//    2    4:areturn         
	}

	public static final AdType LinearLive;
	public static final AdType LinearOnDemandMidRoll;
	public static final AdType LinearOnDemandPostRoll;
	public static final AdType LinearOnDemandPreRoll;
	public static final AdType Other;
	private static final AdType b[];
	private final String a;

	static 
	{
		LinearOnDemandPreRoll = new AdType("LinearOnDemandPreRoll", 0, "a11");
	//    0    0:new             #2   <Class AdType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LinearOnDemandPreRoll">
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "a11">
	//    5    9:invokespecial   #24  <Method void AdType(String, int, String)>
	//    6   12:putstatic       #26  <Field AdType LinearOnDemandPreRoll>
		LinearOnDemandMidRoll = new AdType("LinearOnDemandMidRoll", 1, "a12");
	//    7   15:new             #2   <Class AdType>
	//    8   18:dup             
	//    9   19:ldc1            #27  <String "LinearOnDemandMidRoll">
	//   10   21:iconst_1        
	//   11   22:ldc1            #29  <String "a12">
	//   12   24:invokespecial   #24  <Method void AdType(String, int, String)>
	//   13   27:putstatic       #31  <Field AdType LinearOnDemandMidRoll>
		LinearOnDemandPostRoll = new AdType("LinearOnDemandPostRoll", 2, "a13");
	//   14   30:new             #2   <Class AdType>
	//   15   33:dup             
	//   16   34:ldc1            #32  <String "LinearOnDemandPostRoll">
	//   17   36:iconst_2        
	//   18   37:ldc1            #34  <String "a13">
	//   19   39:invokespecial   #24  <Method void AdType(String, int, String)>
	//   20   42:putstatic       #36  <Field AdType LinearOnDemandPostRoll>
		LinearLive = new AdType("LinearLive", 3, "a21");
	//   21   45:new             #2   <Class AdType>
	//   22   48:dup             
	//   23   49:ldc1            #37  <String "LinearLive">
	//   24   51:iconst_3        
	//   25   52:ldc1            #39  <String "a21">
	//   26   54:invokespecial   #24  <Method void AdType(String, int, String)>
	//   27   57:putstatic       #41  <Field AdType LinearLive>
		Other = new AdType("Other", 4, "a00");
	//   28   60:new             #2   <Class AdType>
	//   29   63:dup             
	//   30   64:ldc1            #42  <String "Other">
	//   31   66:iconst_4        
	//   32   67:ldc1            #44  <String "a00">
	//   33   69:invokespecial   #24  <Method void AdType(String, int, String)>
	//   34   72:putstatic       #46  <Field AdType Other>
		b = (new AdType[] {
			LinearOnDemandPreRoll, LinearOnDemandMidRoll, LinearOnDemandPostRoll, LinearLive, Other
		});
	//   35   75:iconst_5        
	//   36   76:anewarray       AdType[]
	//   37   79:dup             
	//   38   80:iconst_0        
	//   39   81:getstatic       #26  <Field AdType LinearOnDemandPreRoll>
	//   40   84:aastore         
	//   41   85:dup             
	//   42   86:iconst_1        
	//   43   87:getstatic       #31  <Field AdType LinearOnDemandMidRoll>
	//   44   90:aastore         
	//   45   91:dup             
	//   46   92:iconst_2        
	//   47   93:getstatic       #36  <Field AdType LinearOnDemandPostRoll>
	//   48   96:aastore         
	//   49   97:dup             
	//   50   98:iconst_3        
	//   51   99:getstatic       #41  <Field AdType LinearLive>
	//   52  102:aastore         
	//   53  103:dup             
	//   54  104:iconst_4        
	//   55  105:getstatic       #46  <Field AdType Other>
	//   56  108:aastore         
	//   57  109:putstatic       #48  <Field AdType[] b>
	//*  58  112:return          
	}
}
