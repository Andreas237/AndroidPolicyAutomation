// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

public static final class ShareDialog$Mode extends Enum
{

	public static ShareDialog$Mode valueOf(String s)
	{
		return (ShareDialog$Mode)Enum.valueOf(com/facebook/share/widget/ShareDialog$Mode, s);
	//    0    0:ldc1            #2   <Class ShareDialog$Mode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShareDialog$Mode>
	//    4    9:areturn         
	}

	public static ShareDialog$Mode[] values()
	{
		return (ShareDialog$Mode[])((ShareDialog$Mode []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field ShareDialog$Mode[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.share.widget.ShareDialog$Mode_3B_.clone()>
	//    2    6:checkcast       #46  <Class ShareDialog$Mode[]>
	//    3    9:areturn         
	}

	private static final ShareDialog$Mode $VALUES[];
	public static final ShareDialog$Mode AUTOMATIC;
	public static final ShareDialog$Mode FEED;
	public static final ShareDialog$Mode NATIVE;
	public static final ShareDialog$Mode WEB;

	static 
	{
		AUTOMATIC = new ShareDialog$Mode("AUTOMATIC", 0);
	//    0    0:new             #2   <Class ShareDialog$Mode>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "AUTOMATIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
	//    5   10:putstatic       #24  <Field ShareDialog$Mode AUTOMATIC>
		NATIVE = new ShareDialog$Mode("NATIVE", 1);
	//    6   13:new             #2   <Class ShareDialog$Mode>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NATIVE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
	//   11   23:putstatic       #27  <Field ShareDialog$Mode NATIVE>
		WEB = new ShareDialog$Mode("WEB", 2);
	//   12   26:new             #2   <Class ShareDialog$Mode>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "WEB">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
	//   17   36:putstatic       #30  <Field ShareDialog$Mode WEB>
		FEED = new ShareDialog$Mode("FEED", 3);
	//   18   39:new             #2   <Class ShareDialog$Mode>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "FEED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
	//   23   49:putstatic       #33  <Field ShareDialog$Mode FEED>
		$VALUES = (new ShareDialog$Mode[] {
			AUTOMATIC, NATIVE, WEB, FEED
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ShareDialog$Mode[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field ShareDialog$Mode AUTOMATIC>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field ShareDialog$Mode NATIVE>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field ShareDialog$Mode WEB>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field ShareDialog$Mode FEED>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field ShareDialog$Mode[] $VALUES>
	//*  43   83:return          
	}

	private ShareDialog$Mode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
