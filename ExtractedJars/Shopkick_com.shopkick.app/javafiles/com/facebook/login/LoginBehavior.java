// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;


public final class LoginBehavior extends Enum
{

	private LoginBehavior(String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, 
			boolean flag5)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #55  <Method void Enum(String, int)>
		allowsGetTokenAuth = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #57  <Field boolean allowsGetTokenAuth>
		allowsKatanaAuth = flag1;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #59  <Field boolean allowsKatanaAuth>
		allowsWebViewAuth = flag2;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #61  <Field boolean allowsWebViewAuth>
		allowsDeviceAuth = flag3;
	//   13   23:aload_0         
	//   14   24:iload           6
	//   15   26:putfield        #63  <Field boolean allowsDeviceAuth>
		allowsCustomTabAuth = flag4;
	//   16   29:aload_0         
	//   17   30:iload           7
	//   18   32:putfield        #65  <Field boolean allowsCustomTabAuth>
		allowsFacebookLiteAuth = flag5;
	//   19   35:aload_0         
	//   20   36:iload           8
	//   21   38:putfield        #67  <Field boolean allowsFacebookLiteAuth>
	//   22   41:return          
	}

	public static LoginBehavior valueOf(String s)
	{
		return (LoginBehavior)Enum.valueOf(com/facebook/login/LoginBehavior, s);
	//    0    0:ldc1            #2   <Class LoginBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #74  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LoginBehavior>
	//    4    9:areturn         
	}

	public static LoginBehavior[] values()
	{
		return (LoginBehavior[])((LoginBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field LoginBehavior[] $VALUES>
	//    1    3:invokevirtual   #81  <Method Object _5B_Lcom.facebook.login.LoginBehavior_3B_.clone()>
	//    2    6:checkcast       #77  <Class LoginBehavior[]>
	//    3    9:areturn         
	}

	boolean allowsCustomTabAuth()
	{
		return allowsCustomTabAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean allowsCustomTabAuth>
	//    2    4:ireturn         
	}

	boolean allowsDeviceAuth()
	{
		return allowsDeviceAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean allowsDeviceAuth>
	//    2    4:ireturn         
	}

	boolean allowsFacebookLiteAuth()
	{
		return allowsFacebookLiteAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean allowsFacebookLiteAuth>
	//    2    4:ireturn         
	}

	boolean allowsGetTokenAuth()
	{
		return allowsGetTokenAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean allowsGetTokenAuth>
	//    2    4:ireturn         
	}

	boolean allowsKatanaAuth()
	{
		return allowsKatanaAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean allowsKatanaAuth>
	//    2    4:ireturn         
	}

	boolean allowsWebViewAuth()
	{
		return allowsWebViewAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean allowsWebViewAuth>
	//    2    4:ireturn         
	}

	private static final LoginBehavior $VALUES[];
	public static final LoginBehavior DEVICE_AUTH;
	public static final LoginBehavior DIALOG_ONLY;
	public static final LoginBehavior KATANA_ONLY;
	public static final LoginBehavior NATIVE_ONLY;
	public static final LoginBehavior NATIVE_WITH_FALLBACK;
	public static final LoginBehavior WEB_ONLY;
	public static final LoginBehavior WEB_VIEW_ONLY;
	private final boolean allowsCustomTabAuth;
	private final boolean allowsDeviceAuth;
	private final boolean allowsFacebookLiteAuth;
	private final boolean allowsGetTokenAuth;
	private final boolean allowsKatanaAuth;
	private final boolean allowsWebViewAuth;

	static 
	{
		NATIVE_WITH_FALLBACK = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true, true, false, true, true);
	//    0    0:new             #2   <Class LoginBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "NATIVE_WITH_FALLBACK">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:iconst_1        
	//    6    9:iconst_1        
	//    7   10:iconst_0        
	//    8   11:iconst_1        
	//    9   12:iconst_1        
	//   10   13:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   11   16:putstatic       #31  <Field LoginBehavior NATIVE_WITH_FALLBACK>
		NATIVE_ONLY = new LoginBehavior("NATIVE_ONLY", 1, true, true, false, false, false, true);
	//   12   19:new             #2   <Class LoginBehavior>
	//   13   22:dup             
	//   14   23:ldc1            #32  <String "NATIVE_ONLY">
	//   15   25:iconst_1        
	//   16   26:iconst_1        
	//   17   27:iconst_1        
	//   18   28:iconst_0        
	//   19   29:iconst_0        
	//   20   30:iconst_0        
	//   21   31:iconst_1        
	//   22   32:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   23   35:putstatic       #34  <Field LoginBehavior NATIVE_ONLY>
		KATANA_ONLY = new LoginBehavior("KATANA_ONLY", 2, false, true, false, false, false, false);
	//   24   38:new             #2   <Class LoginBehavior>
	//   25   41:dup             
	//   26   42:ldc1            #35  <String "KATANA_ONLY">
	//   27   44:iconst_2        
	//   28   45:iconst_0        
	//   29   46:iconst_1        
	//   30   47:iconst_0        
	//   31   48:iconst_0        
	//   32   49:iconst_0        
	//   33   50:iconst_0        
	//   34   51:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   35   54:putstatic       #37  <Field LoginBehavior KATANA_ONLY>
		WEB_ONLY = new LoginBehavior("WEB_ONLY", 3, false, false, true, false, true, false);
	//   36   57:new             #2   <Class LoginBehavior>
	//   37   60:dup             
	//   38   61:ldc1            #38  <String "WEB_ONLY">
	//   39   63:iconst_3        
	//   40   64:iconst_0        
	//   41   65:iconst_0        
	//   42   66:iconst_1        
	//   43   67:iconst_0        
	//   44   68:iconst_1        
	//   45   69:iconst_0        
	//   46   70:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   47   73:putstatic       #40  <Field LoginBehavior WEB_ONLY>
		WEB_VIEW_ONLY = new LoginBehavior("WEB_VIEW_ONLY", 4, false, false, true, false, false, false);
	//   48   76:new             #2   <Class LoginBehavior>
	//   49   79:dup             
	//   50   80:ldc1            #41  <String "WEB_VIEW_ONLY">
	//   51   82:iconst_4        
	//   52   83:iconst_0        
	//   53   84:iconst_0        
	//   54   85:iconst_1        
	//   55   86:iconst_0        
	//   56   87:iconst_0        
	//   57   88:iconst_0        
	//   58   89:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   59   92:putstatic       #43  <Field LoginBehavior WEB_VIEW_ONLY>
		DIALOG_ONLY = new LoginBehavior("DIALOG_ONLY", 5, false, true, true, false, true, true);
	//   60   95:new             #2   <Class LoginBehavior>
	//   61   98:dup             
	//   62   99:ldc1            #44  <String "DIALOG_ONLY">
	//   63  101:iconst_5        
	//   64  102:iconst_0        
	//   65  103:iconst_1        
	//   66  104:iconst_1        
	//   67  105:iconst_0        
	//   68  106:iconst_1        
	//   69  107:iconst_1        
	//   70  108:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   71  111:putstatic       #46  <Field LoginBehavior DIALOG_ONLY>
		DEVICE_AUTH = new LoginBehavior("DEVICE_AUTH", 6, false, false, false, true, false, false);
	//   72  114:new             #2   <Class LoginBehavior>
	//   73  117:dup             
	//   74  118:ldc1            #47  <String "DEVICE_AUTH">
	//   75  120:bipush          6
	//   76  122:iconst_0        
	//   77  123:iconst_0        
	//   78  124:iconst_0        
	//   79  125:iconst_1        
	//   80  126:iconst_0        
	//   81  127:iconst_0        
	//   82  128:invokespecial   #29  <Method void LoginBehavior(String, int, boolean, boolean, boolean, boolean, boolean, boolean)>
	//   83  131:putstatic       #49  <Field LoginBehavior DEVICE_AUTH>
		$VALUES = (new LoginBehavior[] {
			NATIVE_WITH_FALLBACK, NATIVE_ONLY, KATANA_ONLY, WEB_ONLY, WEB_VIEW_ONLY, DIALOG_ONLY, DEVICE_AUTH
		});
	//   84  134:bipush          7
	//   85  136:anewarray       LoginBehavior[]
	//   86  139:dup             
	//   87  140:iconst_0        
	//   88  141:getstatic       #31  <Field LoginBehavior NATIVE_WITH_FALLBACK>
	//   89  144:aastore         
	//   90  145:dup             
	//   91  146:iconst_1        
	//   92  147:getstatic       #34  <Field LoginBehavior NATIVE_ONLY>
	//   93  150:aastore         
	//   94  151:dup             
	//   95  152:iconst_2        
	//   96  153:getstatic       #37  <Field LoginBehavior KATANA_ONLY>
	//   97  156:aastore         
	//   98  157:dup             
	//   99  158:iconst_3        
	//  100  159:getstatic       #40  <Field LoginBehavior WEB_ONLY>
	//  101  162:aastore         
	//  102  163:dup             
	//  103  164:iconst_4        
	//  104  165:getstatic       #43  <Field LoginBehavior WEB_VIEW_ONLY>
	//  105  168:aastore         
	//  106  169:dup             
	//  107  170:iconst_5        
	//  108  171:getstatic       #46  <Field LoginBehavior DIALOG_ONLY>
	//  109  174:aastore         
	//  110  175:dup             
	//  111  176:bipush          6
	//  112  178:getstatic       #49  <Field LoginBehavior DEVICE_AUTH>
	//  113  181:aastore         
	//  114  182:putstatic       #51  <Field LoginBehavior[] $VALUES>
	//* 115  185:return          
	}
}
