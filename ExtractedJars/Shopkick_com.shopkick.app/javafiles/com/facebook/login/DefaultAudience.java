// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;


public final class DefaultAudience extends Enum
{

	private DefaultAudience(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void Enum(String, int)>
		nativeProtocolAudience = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #46  <Field String nativeProtocolAudience>
	//    7   11:return          
	}

	public static DefaultAudience valueOf(String s)
	{
		return (DefaultAudience)Enum.valueOf(com/facebook/login/DefaultAudience, s);
	//    0    0:ldc1            #2   <Class DefaultAudience>
	//    1    2:aload_0         
	//    2    3:invokestatic    #53  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DefaultAudience>
	//    4    9:areturn         
	}

	public static DefaultAudience[] values()
	{
		return (DefaultAudience[])((DefaultAudience []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field DefaultAudience[] $VALUES>
	//    1    3:invokevirtual   #60  <Method Object _5B_Lcom.facebook.login.DefaultAudience_3B_.clone()>
	//    2    6:checkcast       #56  <Class DefaultAudience[]>
	//    3    9:areturn         
	}

	public String getNativeProtocolAudience()
	{
		return nativeProtocolAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String nativeProtocolAudience>
	//    2    4:areturn         
	}

	private static final DefaultAudience $VALUES[];
	public static final DefaultAudience EVERYONE;
	public static final DefaultAudience FRIENDS;
	public static final DefaultAudience NONE;
	public static final DefaultAudience ONLY_ME;
	private final String nativeProtocolAudience;

	static 
	{
		NONE = new DefaultAudience("NONE", 0, ((String) (null)));
	//    0    0:new             #2   <Class DefaultAudience>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:aconst_null     
	//    5    8:invokespecial   #21  <Method void DefaultAudience(String, int, String)>
	//    6   11:putstatic       #23  <Field DefaultAudience NONE>
		ONLY_ME = new DefaultAudience("ONLY_ME", 1, "only_me");
	//    7   14:new             #2   <Class DefaultAudience>
	//    8   17:dup             
	//    9   18:ldc1            #24  <String "ONLY_ME">
	//   10   20:iconst_1        
	//   11   21:ldc1            #26  <String "only_me">
	//   12   23:invokespecial   #21  <Method void DefaultAudience(String, int, String)>
	//   13   26:putstatic       #28  <Field DefaultAudience ONLY_ME>
		FRIENDS = new DefaultAudience("FRIENDS", 2, "friends");
	//   14   29:new             #2   <Class DefaultAudience>
	//   15   32:dup             
	//   16   33:ldc1            #29  <String "FRIENDS">
	//   17   35:iconst_2        
	//   18   36:ldc1            #31  <String "friends">
	//   19   38:invokespecial   #21  <Method void DefaultAudience(String, int, String)>
	//   20   41:putstatic       #33  <Field DefaultAudience FRIENDS>
		EVERYONE = new DefaultAudience("EVERYONE", 3, "everyone");
	//   21   44:new             #2   <Class DefaultAudience>
	//   22   47:dup             
	//   23   48:ldc1            #34  <String "EVERYONE">
	//   24   50:iconst_3        
	//   25   51:ldc1            #36  <String "everyone">
	//   26   53:invokespecial   #21  <Method void DefaultAudience(String, int, String)>
	//   27   56:putstatic       #38  <Field DefaultAudience EVERYONE>
		$VALUES = (new DefaultAudience[] {
			NONE, ONLY_ME, FRIENDS, EVERYONE
		});
	//   28   59:iconst_4        
	//   29   60:anewarray       DefaultAudience[]
	//   30   63:dup             
	//   31   64:iconst_0        
	//   32   65:getstatic       #23  <Field DefaultAudience NONE>
	//   33   68:aastore         
	//   34   69:dup             
	//   35   70:iconst_1        
	//   36   71:getstatic       #28  <Field DefaultAudience ONLY_ME>
	//   37   74:aastore         
	//   38   75:dup             
	//   39   76:iconst_2        
	//   40   77:getstatic       #33  <Field DefaultAudience FRIENDS>
	//   41   80:aastore         
	//   42   81:dup             
	//   43   82:iconst_3        
	//   44   83:getstatic       #38  <Field DefaultAudience EVERYONE>
	//   45   86:aastore         
	//   46   87:putstatic       #40  <Field DefaultAudience[] $VALUES>
	//*  47   90:return          
	}
}
