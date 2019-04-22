// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.internal:
//			CallbackManagerImpl

public static final class CallbackManagerImpl$RequestCodeOffset extends Enum
{

	public static CallbackManagerImpl$RequestCodeOffset valueOf(String s)
	{
		return (CallbackManagerImpl$RequestCodeOffset)Enum.valueOf(com/facebook/internal/CallbackManagerImpl$RequestCodeOffset, s);
	//    0    0:ldc1            #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    1    2:aload_0         
	//    2    3:invokestatic    #74  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    4    9:areturn         
	}

	public static CallbackManagerImpl$RequestCodeOffset[] values()
	{
		return (CallbackManagerImpl$RequestCodeOffset[])((CallbackManagerImpl$RequestCodeOffset []) ($VALUES)).clone();
	//    0    0:getstatic       #61  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//    1    3:invokevirtual   #81  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
	//    2    6:checkcast       #77  <Class CallbackManagerImpl$RequestCodeOffset[]>
	//    3    9:areturn         
	}

	public int toRequestCode()
	{
		return FacebookSdk.getCallbackRequestCodeOffset() + offset;
	//    0    0:invokestatic    #88  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
	//    1    3:aload_0         
	//    2    4:getfield        #67  <Field int offset>
	//    3    7:iadd            
	//    4    8:ireturn         
	}

	private static final CallbackManagerImpl$RequestCodeOffset $VALUES[];
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupCreate;
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupJoin;
	public static final CallbackManagerImpl$RequestCodeOffset AppInvite;
	public static final CallbackManagerImpl$RequestCodeOffset DeviceShare;
	public static final CallbackManagerImpl$RequestCodeOffset GameRequest;
	public static final CallbackManagerImpl$RequestCodeOffset InAppPurchase;
	public static final CallbackManagerImpl$RequestCodeOffset Like;
	public static final CallbackManagerImpl$RequestCodeOffset Login;
	public static final CallbackManagerImpl$RequestCodeOffset Message;
	public static final CallbackManagerImpl$RequestCodeOffset Share;
	private final int offset;

	static 
	{
		Login = new CallbackManagerImpl$RequestCodeOffset("Login", 0, 0);
	//    0    0:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Login">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//    6   11:putstatic       #32  <Field CallbackManagerImpl$RequestCodeOffset Login>
		Share = new CallbackManagerImpl$RequestCodeOffset("Share", 1, 1);
	//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    8   17:dup             
	//    9   18:ldc1            #33  <String "Share">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   13   25:putstatic       #35  <Field CallbackManagerImpl$RequestCodeOffset Share>
		Message = new CallbackManagerImpl$RequestCodeOffset("Message", 2, 2);
	//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   15   31:dup             
	//   16   32:ldc1            #36  <String "Message">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   20   39:putstatic       #38  <Field CallbackManagerImpl$RequestCodeOffset Message>
		Like = new CallbackManagerImpl$RequestCodeOffset("Like", 3, 3);
	//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   22   45:dup             
	//   23   46:ldc1            #39  <String "Like">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   27   53:putstatic       #41  <Field CallbackManagerImpl$RequestCodeOffset Like>
		GameRequest = new CallbackManagerImpl$RequestCodeOffset("GameRequest", 4, 4);
	//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "GameRequest">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   34   67:putstatic       #44  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		AppGroupCreate = new CallbackManagerImpl$RequestCodeOffset("AppGroupCreate", 5, 5);
	//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   36   73:dup             
	//   37   74:ldc1            #45  <String "AppGroupCreate">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   41   81:putstatic       #47  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		AppGroupJoin = new CallbackManagerImpl$RequestCodeOffset("AppGroupJoin", 6, 6);
	//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   43   87:dup             
	//   44   88:ldc1            #48  <String "AppGroupJoin">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   48   97:putstatic       #50  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		AppInvite = new CallbackManagerImpl$RequestCodeOffset("AppInvite", 7, 7);
	//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   50  103:dup             
	//   51  104:ldc1            #51  <String "AppInvite">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   55  113:putstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		DeviceShare = new CallbackManagerImpl$RequestCodeOffset("DeviceShare", 8, 8);
	//   56  116:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   57  119:dup             
	//   58  120:ldc1            #54  <String "DeviceShare">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   62  129:putstatic       #56  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
		InAppPurchase = new CallbackManagerImpl$RequestCodeOffset("InAppPurchase", 9, 9);
	//   63  132:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   64  135:dup             
	//   65  136:ldc1            #57  <String "InAppPurchase">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #30  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   69  145:putstatic       #59  <Field CallbackManagerImpl$RequestCodeOffset InAppPurchase>
		$VALUES = (new CallbackManagerImpl$RequestCodeOffset[] {
			Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite, DeviceShare, InAppPurchase
		});
	//   70  148:bipush          10
	//   71  150:anewarray       CallbackManagerImpl$RequestCodeOffset[]
	//   72  153:dup             
	//   73  154:iconst_0        
	//   74  155:getstatic       #32  <Field CallbackManagerImpl$RequestCodeOffset Login>
	//   75  158:aastore         
	//   76  159:dup             
	//   77  160:iconst_1        
	//   78  161:getstatic       #35  <Field CallbackManagerImpl$RequestCodeOffset Share>
	//   79  164:aastore         
	//   80  165:dup             
	//   81  166:iconst_2        
	//   82  167:getstatic       #38  <Field CallbackManagerImpl$RequestCodeOffset Message>
	//   83  170:aastore         
	//   84  171:dup             
	//   85  172:iconst_3        
	//   86  173:getstatic       #41  <Field CallbackManagerImpl$RequestCodeOffset Like>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_4        
	//   90  179:getstatic       #44  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
	//   91  182:aastore         
	//   92  183:dup             
	//   93  184:iconst_5        
	//   94  185:getstatic       #47  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
	//   95  188:aastore         
	//   96  189:dup             
	//   97  190:bipush          6
	//   98  192:getstatic       #50  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:bipush          7
	//  102  199:getstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
	//  103  202:aastore         
	//  104  203:dup             
	//  105  204:bipush          8
	//  106  206:getstatic       #56  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
	//  107  209:aastore         
	//  108  210:dup             
	//  109  211:bipush          9
	//  110  213:getstatic       #59  <Field CallbackManagerImpl$RequestCodeOffset InAppPurchase>
	//  111  216:aastore         
	//  112  217:putstatic       #61  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//* 113  220:return          
	}

	private CallbackManagerImpl$RequestCodeOffset(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void Enum(String, int)>
		offset = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #67  <Field int offset>
	//    7   11:return          
	}
}
