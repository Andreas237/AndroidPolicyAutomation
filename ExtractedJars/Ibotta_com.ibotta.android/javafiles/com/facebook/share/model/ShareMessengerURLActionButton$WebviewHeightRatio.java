// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareMessengerURLActionButton

public static final class ShareMessengerURLActionButton$WebviewHeightRatio extends Enum
{

	public static ShareMessengerURLActionButton$WebviewHeightRatio valueOf(String s)
	{
		return (ShareMessengerURLActionButton$WebviewHeightRatio)Enum.valueOf(com/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio, s);
	//    0    0:ldc1            #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//    4    9:areturn         
	}

	public static ShareMessengerURLActionButton$WebviewHeightRatio[] values()
	{
		return (ShareMessengerURLActionButton$WebviewHeightRatio[])((ShareMessengerURLActionButton$WebviewHeightRatio []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ShareMessengerURLActionButton$WebviewHeightRatio[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio_3B_.clone()>
	//    2    6:checkcast       #42  <Class ShareMessengerURLActionButton$WebviewHeightRatio[]>
	//    3    9:areturn         
	}

	private static final ShareMessengerURLActionButton$WebviewHeightRatio $VALUES[];
	public static final ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioCompact;
	public static final ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioFull;
	public static final ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioTall;

	static 
	{
		WebviewHeightRatioFull = new ShareMessengerURLActionButton$WebviewHeightRatio("WebviewHeightRatioFull", 0);
	//    0    0:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "WebviewHeightRatioFull">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
	//    5   10:putstatic       #23  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioFull>
		WebviewHeightRatioTall = new ShareMessengerURLActionButton$WebviewHeightRatio("WebviewHeightRatioTall", 1);
	//    6   13:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "WebviewHeightRatioTall">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
	//   11   23:putstatic       #26  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioTall>
		WebviewHeightRatioCompact = new ShareMessengerURLActionButton$WebviewHeightRatio("WebviewHeightRatioCompact", 2);
	//   12   26:new             #2   <Class ShareMessengerURLActionButton$WebviewHeightRatio>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "WebviewHeightRatioCompact">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ShareMessengerURLActionButton$WebviewHeightRatio(String, int)>
	//   17   36:putstatic       #29  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioCompact>
		$VALUES = (new ShareMessengerURLActionButton$WebviewHeightRatio[] {
			WebviewHeightRatioFull, WebviewHeightRatioTall, WebviewHeightRatioCompact
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ShareMessengerURLActionButton$WebviewHeightRatio[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioFull>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioTall>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ShareMessengerURLActionButton$WebviewHeightRatio WebviewHeightRatioCompact>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ShareMessengerURLActionButton$WebviewHeightRatio[] $VALUES>
	//*  33   64:return          
	}

	private ShareMessengerURLActionButton$WebviewHeightRatio(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
