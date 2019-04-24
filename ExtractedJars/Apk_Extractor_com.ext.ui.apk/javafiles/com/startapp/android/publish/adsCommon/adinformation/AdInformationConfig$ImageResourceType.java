// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;


// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			AdInformationConfig

public static final class AdInformationConfig$ImageResourceType extends Enum
{

	public static AdInformationConfig$ImageResourceType getByName(String s)
	{
		AdInformationConfig$ImageResourceType adinformationconfig$imageresourcetype = INFO_S;
	//    0    0:getstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
	//    1    3:astore_2        
		AdInformationConfig$ImageResourceType aadinformationconfig$imageresourcetype[] = values();
	//    2    4:invokestatic    #54  <Method AdInformationConfig$ImageResourceType[] values()>
	//    3    7:astore_3        
		for(int i = 0; i < aadinformationconfig$imageresourcetype.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpge          46
			if(aadinformationconfig$imageresourcetype[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:aaload          
	//*  13   19:invokevirtual   #58  <Method String name()>
	//*  14   22:invokevirtual   #63  <Method String String.toLowerCase()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #63  <Method String String.toLowerCase()>
	//*  17   29:invokevirtual   #67  <Method int String.compareTo(String)>
	//*  18   32:ifne            39
				adinformationconfig$imageresourcetype = aadinformationconfig$imageresourcetype[i];
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:aaload          
	//   22   38:astore_2        

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            10
		return adinformationconfig$imageresourcetype;
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	public static AdInformationConfig$ImageResourceType valueOf(String s)
	{
		return (AdInformationConfig$ImageResourceType)Enum.valueOf(com/startapp/android/publish/adsCommon/adinformation/AdInformationConfig$ImageResourceType, s);
	//    0    0:ldc1            #2   <Class AdInformationConfig$ImageResourceType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdInformationConfig$ImageResourceType>
	//    4    9:areturn         
	}

	public static AdInformationConfig$ImageResourceType[] values()
	{
		return (AdInformationConfig$ImageResourceType[])((AdInformationConfig$ImageResourceType []) ($VALUES)).clone();
	//    0    0:getstatic       #38  <Field AdInformationConfig$ImageResourceType[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.adinformation.AdInformationConfig$ImageResourceType_3B_.clone()>
	//    2    6:checkcast       #72  <Class AdInformationConfig$ImageResourceType[]>
	//    3    9:areturn         
	}

	public int getDefaultHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int height>
	//    2    4:ireturn         
	}

	public int getDefaultWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int width>
	//    2    4:ireturn         
	}

	private static final AdInformationConfig$ImageResourceType $VALUES[];
	public static final AdInformationConfig$ImageResourceType INFO_EX_L;
	public static final AdInformationConfig$ImageResourceType INFO_EX_S;
	public static final AdInformationConfig$ImageResourceType INFO_L;
	public static final AdInformationConfig$ImageResourceType INFO_S;
	private int height;
	private int width;

	static 
	{
		INFO_S = new AdInformationConfig$ImageResourceType("INFO_S", 0, 17, 14);
	//    0    0:new             #2   <Class AdInformationConfig$ImageResourceType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "INFO_S">
	//    3    6:iconst_0        
	//    4    7:bipush          17
	//    5    9:bipush          14
	//    6   11:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
	//    7   14:putstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
		INFO_EX_S = new AdInformationConfig$ImageResourceType("INFO_EX_S", 1, 88, 14);
	//    8   17:new             #2   <Class AdInformationConfig$ImageResourceType>
	//    9   20:dup             
	//   10   21:ldc1            #28  <String "INFO_EX_S">
	//   11   23:iconst_1        
	//   12   24:bipush          88
	//   13   26:bipush          14
	//   14   28:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
	//   15   31:putstatic       #30  <Field AdInformationConfig$ImageResourceType INFO_EX_S>
		INFO_L = new AdInformationConfig$ImageResourceType("INFO_L", 2, 25, 21);
	//   16   34:new             #2   <Class AdInformationConfig$ImageResourceType>
	//   17   37:dup             
	//   18   38:ldc1            #31  <String "INFO_L">
	//   19   40:iconst_2        
	//   20   41:bipush          25
	//   21   43:bipush          21
	//   22   45:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
	//   23   48:putstatic       #33  <Field AdInformationConfig$ImageResourceType INFO_L>
		INFO_EX_L = new AdInformationConfig$ImageResourceType("INFO_EX_L", 3, 130, 21);
	//   24   51:new             #2   <Class AdInformationConfig$ImageResourceType>
	//   25   54:dup             
	//   26   55:ldc1            #34  <String "INFO_EX_L">
	//   27   57:iconst_3        
	//   28   58:sipush          130
	//   29   61:bipush          21
	//   30   63:invokespecial   #25  <Method void AdInformationConfig$ImageResourceType(String, int, int, int)>
	//   31   66:putstatic       #36  <Field AdInformationConfig$ImageResourceType INFO_EX_L>
		$VALUES = (new AdInformationConfig$ImageResourceType[] {
			INFO_S, INFO_EX_S, INFO_L, INFO_EX_L
		});
	//   32   69:iconst_4        
	//   33   70:anewarray       AdInformationConfig$ImageResourceType[]
	//   34   73:dup             
	//   35   74:iconst_0        
	//   36   75:getstatic       #27  <Field AdInformationConfig$ImageResourceType INFO_S>
	//   37   78:aastore         
	//   38   79:dup             
	//   39   80:iconst_1        
	//   40   81:getstatic       #30  <Field AdInformationConfig$ImageResourceType INFO_EX_S>
	//   41   84:aastore         
	//   42   85:dup             
	//   43   86:iconst_2        
	//   44   87:getstatic       #33  <Field AdInformationConfig$ImageResourceType INFO_L>
	//   45   90:aastore         
	//   46   91:dup             
	//   47   92:iconst_3        
	//   48   93:getstatic       #36  <Field AdInformationConfig$ImageResourceType INFO_EX_L>
	//   49   96:aastore         
	//   50   97:putstatic       #38  <Field AdInformationConfig$ImageResourceType[] $VALUES>
	//*  51  100:return          
	}

	private AdInformationConfig$ImageResourceType(String s, int i, int j, int k)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		width = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #44  <Field int width>
		height = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #46  <Field int height>
	//   10   17:return          
	}
}
