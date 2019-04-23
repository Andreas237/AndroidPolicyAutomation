// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


public final class AccessTokenSource extends Enum
{

	private AccessTokenSource(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
		canExtendToken = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #60  <Field boolean canExtendToken>
	//    7   11:return          
	}

	public static AccessTokenSource valueOf(String s)
	{
		return (AccessTokenSource)Enum.valueOf(com/facebook/AccessTokenSource, s);
	//    0    0:ldc1            #2   <Class AccessTokenSource>
	//    1    2:aload_0         
	//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccessTokenSource>
	//    4    9:areturn         
	}

	public static AccessTokenSource[] values()
	{
		return (AccessTokenSource[])((AccessTokenSource []) ($VALUES)).clone();
	//    0    0:getstatic       #54  <Field AccessTokenSource[] $VALUES>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.facebook.AccessTokenSource_3B_.clone()>
	//    2    6:checkcast       #70  <Class AccessTokenSource[]>
	//    3    9:areturn         
	}

	boolean canExtendToken()
	{
		return canExtendToken;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean canExtendToken>
	//    2    4:ireturn         
	}

	private static final AccessTokenSource $VALUES[];
	public static final AccessTokenSource CHROME_CUSTOM_TAB;
	public static final AccessTokenSource CLIENT_TOKEN;
	public static final AccessTokenSource DEVICE_AUTH;
	public static final AccessTokenSource FACEBOOK_APPLICATION_NATIVE;
	public static final AccessTokenSource FACEBOOK_APPLICATION_SERVICE;
	public static final AccessTokenSource FACEBOOK_APPLICATION_WEB;
	public static final AccessTokenSource NONE;
	public static final AccessTokenSource TEST_USER;
	public static final AccessTokenSource WEB_VIEW;
	private final boolean canExtendToken;

	static 
	{
		NONE = new AccessTokenSource("NONE", 0, false);
	//    0    0:new             #2   <Class AccessTokenSource>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//    6   11:putstatic       #28  <Field AccessTokenSource NONE>
		FACEBOOK_APPLICATION_WEB = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
	//    7   14:new             #2   <Class AccessTokenSource>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "FACEBOOK_APPLICATION_WEB">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   13   25:putstatic       #31  <Field AccessTokenSource FACEBOOK_APPLICATION_WEB>
		FACEBOOK_APPLICATION_NATIVE = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
	//   14   28:new             #2   <Class AccessTokenSource>
	//   15   31:dup             
	//   16   32:ldc1            #32  <String "FACEBOOK_APPLICATION_NATIVE">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   20   39:putstatic       #34  <Field AccessTokenSource FACEBOOK_APPLICATION_NATIVE>
		FACEBOOK_APPLICATION_SERVICE = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
	//   21   42:new             #2   <Class AccessTokenSource>
	//   22   45:dup             
	//   23   46:ldc1            #35  <String "FACEBOOK_APPLICATION_SERVICE">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   27   53:putstatic       #37  <Field AccessTokenSource FACEBOOK_APPLICATION_SERVICE>
		WEB_VIEW = new AccessTokenSource("WEB_VIEW", 4, true);
	//   28   56:new             #2   <Class AccessTokenSource>
	//   29   59:dup             
	//   30   60:ldc1            #38  <String "WEB_VIEW">
	//   31   62:iconst_4        
	//   32   63:iconst_1        
	//   33   64:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   34   67:putstatic       #40  <Field AccessTokenSource WEB_VIEW>
		CHROME_CUSTOM_TAB = new AccessTokenSource("CHROME_CUSTOM_TAB", 5, true);
	//   35   70:new             #2   <Class AccessTokenSource>
	//   36   73:dup             
	//   37   74:ldc1            #41  <String "CHROME_CUSTOM_TAB">
	//   38   76:iconst_5        
	//   39   77:iconst_1        
	//   40   78:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   41   81:putstatic       #43  <Field AccessTokenSource CHROME_CUSTOM_TAB>
		TEST_USER = new AccessTokenSource("TEST_USER", 6, true);
	//   42   84:new             #2   <Class AccessTokenSource>
	//   43   87:dup             
	//   44   88:ldc1            #44  <String "TEST_USER">
	//   45   90:bipush          6
	//   46   92:iconst_1        
	//   47   93:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   48   96:putstatic       #46  <Field AccessTokenSource TEST_USER>
		CLIENT_TOKEN = new AccessTokenSource("CLIENT_TOKEN", 7, true);
	//   49   99:new             #2   <Class AccessTokenSource>
	//   50  102:dup             
	//   51  103:ldc1            #47  <String "CLIENT_TOKEN">
	//   52  105:bipush          7
	//   53  107:iconst_1        
	//   54  108:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   55  111:putstatic       #49  <Field AccessTokenSource CLIENT_TOKEN>
		DEVICE_AUTH = new AccessTokenSource("DEVICE_AUTH", 8, true);
	//   56  114:new             #2   <Class AccessTokenSource>
	//   57  117:dup             
	//   58  118:ldc1            #50  <String "DEVICE_AUTH">
	//   59  120:bipush          8
	//   60  122:iconst_1        
	//   61  123:invokespecial   #26  <Method void AccessTokenSource(String, int, boolean)>
	//   62  126:putstatic       #52  <Field AccessTokenSource DEVICE_AUTH>
		$VALUES = (new AccessTokenSource[] {
			NONE, FACEBOOK_APPLICATION_WEB, FACEBOOK_APPLICATION_NATIVE, FACEBOOK_APPLICATION_SERVICE, WEB_VIEW, CHROME_CUSTOM_TAB, TEST_USER, CLIENT_TOKEN, DEVICE_AUTH
		});
	//   63  129:bipush          9
	//   64  131:anewarray       AccessTokenSource[]
	//   65  134:dup             
	//   66  135:iconst_0        
	//   67  136:getstatic       #28  <Field AccessTokenSource NONE>
	//   68  139:aastore         
	//   69  140:dup             
	//   70  141:iconst_1        
	//   71  142:getstatic       #31  <Field AccessTokenSource FACEBOOK_APPLICATION_WEB>
	//   72  145:aastore         
	//   73  146:dup             
	//   74  147:iconst_2        
	//   75  148:getstatic       #34  <Field AccessTokenSource FACEBOOK_APPLICATION_NATIVE>
	//   76  151:aastore         
	//   77  152:dup             
	//   78  153:iconst_3        
	//   79  154:getstatic       #37  <Field AccessTokenSource FACEBOOK_APPLICATION_SERVICE>
	//   80  157:aastore         
	//   81  158:dup             
	//   82  159:iconst_4        
	//   83  160:getstatic       #40  <Field AccessTokenSource WEB_VIEW>
	//   84  163:aastore         
	//   85  164:dup             
	//   86  165:iconst_5        
	//   87  166:getstatic       #43  <Field AccessTokenSource CHROME_CUSTOM_TAB>
	//   88  169:aastore         
	//   89  170:dup             
	//   90  171:bipush          6
	//   91  173:getstatic       #46  <Field AccessTokenSource TEST_USER>
	//   92  176:aastore         
	//   93  177:dup             
	//   94  178:bipush          7
	//   95  180:getstatic       #49  <Field AccessTokenSource CLIENT_TOKEN>
	//   96  183:aastore         
	//   97  184:dup             
	//   98  185:bipush          8
	//   99  187:getstatic       #52  <Field AccessTokenSource DEVICE_AUTH>
	//  100  190:aastore         
	//  101  191:putstatic       #54  <Field AccessTokenSource[] $VALUES>
	//* 102  194:return          
	}
}
