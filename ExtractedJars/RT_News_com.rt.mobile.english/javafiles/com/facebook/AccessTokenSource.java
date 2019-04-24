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
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		canExtendToken = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #52  <Field boolean canExtendToken>
	//    7   11:return          
	}

	public static AccessTokenSource valueOf(String s)
	{
		return (AccessTokenSource)Enum.valueOf(com/facebook/AccessTokenSource, s);
	//    0    0:ldc1            #2   <Class AccessTokenSource>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccessTokenSource>
	//    4    9:areturn         
	}

	public static AccessTokenSource[] values()
	{
		return (AccessTokenSource[])((AccessTokenSource []) ($VALUES)).clone();
	//    0    0:getstatic       #46  <Field AccessTokenSource[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.facebook.AccessTokenSource_3B_.clone()>
	//    2    6:checkcast       #62  <Class AccessTokenSource[]>
	//    3    9:areturn         
	}

	boolean canExtendToken()
	{
		return canExtendToken;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean canExtendToken>
	//    2    4:ireturn         
	}

	private static final AccessTokenSource $VALUES[];
	public static final AccessTokenSource CLIENT_TOKEN;
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
	//    2    4:ldc1            #20  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//    6   11:putstatic       #26  <Field AccessTokenSource NONE>
		FACEBOOK_APPLICATION_WEB = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
	//    7   14:new             #2   <Class AccessTokenSource>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "FACEBOOK_APPLICATION_WEB">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   13   25:putstatic       #29  <Field AccessTokenSource FACEBOOK_APPLICATION_WEB>
		FACEBOOK_APPLICATION_NATIVE = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
	//   14   28:new             #2   <Class AccessTokenSource>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "FACEBOOK_APPLICATION_NATIVE">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   20   39:putstatic       #32  <Field AccessTokenSource FACEBOOK_APPLICATION_NATIVE>
		FACEBOOK_APPLICATION_SERVICE = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
	//   21   42:new             #2   <Class AccessTokenSource>
	//   22   45:dup             
	//   23   46:ldc1            #33  <String "FACEBOOK_APPLICATION_SERVICE">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   27   53:putstatic       #35  <Field AccessTokenSource FACEBOOK_APPLICATION_SERVICE>
		WEB_VIEW = new AccessTokenSource("WEB_VIEW", 4, false);
	//   28   56:new             #2   <Class AccessTokenSource>
	//   29   59:dup             
	//   30   60:ldc1            #36  <String "WEB_VIEW">
	//   31   62:iconst_4        
	//   32   63:iconst_0        
	//   33   64:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   34   67:putstatic       #38  <Field AccessTokenSource WEB_VIEW>
		TEST_USER = new AccessTokenSource("TEST_USER", 5, true);
	//   35   70:new             #2   <Class AccessTokenSource>
	//   36   73:dup             
	//   37   74:ldc1            #39  <String "TEST_USER">
	//   38   76:iconst_5        
	//   39   77:iconst_1        
	//   40   78:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   41   81:putstatic       #41  <Field AccessTokenSource TEST_USER>
		CLIENT_TOKEN = new AccessTokenSource("CLIENT_TOKEN", 6, true);
	//   42   84:new             #2   <Class AccessTokenSource>
	//   43   87:dup             
	//   44   88:ldc1            #42  <String "CLIENT_TOKEN">
	//   45   90:bipush          6
	//   46   92:iconst_1        
	//   47   93:invokespecial   #24  <Method void AccessTokenSource(String, int, boolean)>
	//   48   96:putstatic       #44  <Field AccessTokenSource CLIENT_TOKEN>
		$VALUES = (new AccessTokenSource[] {
			NONE, FACEBOOK_APPLICATION_WEB, FACEBOOK_APPLICATION_NATIVE, FACEBOOK_APPLICATION_SERVICE, WEB_VIEW, TEST_USER, CLIENT_TOKEN
		});
	//   49   99:bipush          7
	//   50  101:anewarray       AccessTokenSource[]
	//   51  104:dup             
	//   52  105:iconst_0        
	//   53  106:getstatic       #26  <Field AccessTokenSource NONE>
	//   54  109:aastore         
	//   55  110:dup             
	//   56  111:iconst_1        
	//   57  112:getstatic       #29  <Field AccessTokenSource FACEBOOK_APPLICATION_WEB>
	//   58  115:aastore         
	//   59  116:dup             
	//   60  117:iconst_2        
	//   61  118:getstatic       #32  <Field AccessTokenSource FACEBOOK_APPLICATION_NATIVE>
	//   62  121:aastore         
	//   63  122:dup             
	//   64  123:iconst_3        
	//   65  124:getstatic       #35  <Field AccessTokenSource FACEBOOK_APPLICATION_SERVICE>
	//   66  127:aastore         
	//   67  128:dup             
	//   68  129:iconst_4        
	//   69  130:getstatic       #38  <Field AccessTokenSource WEB_VIEW>
	//   70  133:aastore         
	//   71  134:dup             
	//   72  135:iconst_5        
	//   73  136:getstatic       #41  <Field AccessTokenSource TEST_USER>
	//   74  139:aastore         
	//   75  140:dup             
	//   76  141:bipush          6
	//   77  143:getstatic       #44  <Field AccessTokenSource CLIENT_TOKEN>
	//   78  146:aastore         
	//   79  147:putstatic       #46  <Field AccessTokenSource[] $VALUES>
	//*  80  150:return          
	}
}
