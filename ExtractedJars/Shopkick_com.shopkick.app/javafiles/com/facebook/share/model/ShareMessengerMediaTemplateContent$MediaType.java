// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareMessengerMediaTemplateContent

public static final class ShareMessengerMediaTemplateContent$MediaType extends Enum
{

	public static ShareMessengerMediaTemplateContent$MediaType valueOf(String s)
	{
		return (ShareMessengerMediaTemplateContent$MediaType)Enum.valueOf(com/facebook/share/model/ShareMessengerMediaTemplateContent$MediaType, s);
	//    0    0:ldc1            #2   <Class ShareMessengerMediaTemplateContent$MediaType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShareMessengerMediaTemplateContent$MediaType>
	//    4    9:areturn         
	}

	public static ShareMessengerMediaTemplateContent$MediaType[] values()
	{
		return (ShareMessengerMediaTemplateContent$MediaType[])((ShareMessengerMediaTemplateContent$MediaType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ShareMessengerMediaTemplateContent$MediaType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType_3B_.clone()>
	//    2    6:checkcast       #38  <Class ShareMessengerMediaTemplateContent$MediaType[]>
	//    3    9:areturn         
	}

	private static final ShareMessengerMediaTemplateContent$MediaType $VALUES[];
	public static final ShareMessengerMediaTemplateContent$MediaType IMAGE;
	public static final ShareMessengerMediaTemplateContent$MediaType VIDEO;

	static 
	{
		IMAGE = new ShareMessengerMediaTemplateContent$MediaType("IMAGE", 0);
	//    0    0:new             #2   <Class ShareMessengerMediaTemplateContent$MediaType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "IMAGE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ShareMessengerMediaTemplateContent$MediaType(String, int)>
	//    5   10:putstatic       #22  <Field ShareMessengerMediaTemplateContent$MediaType IMAGE>
		VIDEO = new ShareMessengerMediaTemplateContent$MediaType("VIDEO", 1);
	//    6   13:new             #2   <Class ShareMessengerMediaTemplateContent$MediaType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "VIDEO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ShareMessengerMediaTemplateContent$MediaType(String, int)>
	//   11   23:putstatic       #25  <Field ShareMessengerMediaTemplateContent$MediaType VIDEO>
		$VALUES = (new ShareMessengerMediaTemplateContent$MediaType[] {
			IMAGE, VIDEO
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ShareMessengerMediaTemplateContent$MediaType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ShareMessengerMediaTemplateContent$MediaType IMAGE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ShareMessengerMediaTemplateContent$MediaType VIDEO>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ShareMessengerMediaTemplateContent$MediaType[] $VALUES>
	//*  23   45:return          
	}

	private ShareMessengerMediaTemplateContent$MediaType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
