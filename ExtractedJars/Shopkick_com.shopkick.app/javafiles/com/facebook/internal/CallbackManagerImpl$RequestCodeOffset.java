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
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    4    9:areturn         
	}

	public static CallbackManagerImpl$RequestCodeOffset[] values()
	{
		return (CallbackManagerImpl$RequestCodeOffset[])((CallbackManagerImpl$RequestCodeOffset []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
	//    2    6:checkcast       #73  <Class CallbackManagerImpl$RequestCodeOffset[]>
	//    3    9:areturn         
	}

	public int toRequestCode()
	{
		return FacebookSdk.getCallbackRequestCodeOffset() + offset;
	//    0    0:invokestatic    #84  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
	//    1    3:aload_0         
	//    2    4:getfield        #63  <Field int offset>
	//    3    7:iadd            
	//    4    8:ireturn         
	}

	private static final CallbackManagerImpl$RequestCodeOffset $VALUES[];
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupCreate;
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupJoin;
	public static final CallbackManagerImpl$RequestCodeOffset AppInvite;
	public static final CallbackManagerImpl$RequestCodeOffset DeviceShare;
	public static final CallbackManagerImpl$RequestCodeOffset GameRequest;
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
	//    2    4:ldc1            #25  <String "Login">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//    6   11:putstatic       #31  <Field CallbackManagerImpl$RequestCodeOffset Login>
		Share = new CallbackManagerImpl$RequestCodeOffset("Share", 1, 1);
	//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    8   17:dup             
	//    9   18:ldc1            #32  <String "Share">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   13   25:putstatic       #34  <Field CallbackManagerImpl$RequestCodeOffset Share>
		Message = new CallbackManagerImpl$RequestCodeOffset("Message", 2, 2);
	//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   15   31:dup             
	//   16   32:ldc1            #35  <String "Message">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   20   39:putstatic       #37  <Field CallbackManagerImpl$RequestCodeOffset Message>
		Like = new CallbackManagerImpl$RequestCodeOffset("Like", 3, 3);
	//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "Like">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   27   53:putstatic       #40  <Field CallbackManagerImpl$RequestCodeOffset Like>
		GameRequest = new CallbackManagerImpl$RequestCodeOffset("GameRequest", 4, 4);
	//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   29   59:dup             
	//   30   60:ldc1            #41  <String "GameRequest">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   34   67:putstatic       #43  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		AppGroupCreate = new CallbackManagerImpl$RequestCodeOffset("AppGroupCreate", 5, 5);
	//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   36   73:dup             
	//   37   74:ldc1            #44  <String "AppGroupCreate">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   41   81:putstatic       #46  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		AppGroupJoin = new CallbackManagerImpl$RequestCodeOffset("AppGroupJoin", 6, 6);
	//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   43   87:dup             
	//   44   88:ldc1            #47  <String "AppGroupJoin">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   48   97:putstatic       #49  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		AppInvite = new CallbackManagerImpl$RequestCodeOffset("AppInvite", 7, 7);
	//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   50  103:dup             
	//   51  104:ldc1            #50  <String "AppInvite">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   55  113:putstatic       #52  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		DeviceShare = new CallbackManagerImpl$RequestCodeOffset("DeviceShare", 8, 8);
	//   56  116:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   57  119:dup             
	//   58  120:ldc1            #53  <String "DeviceShare">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #29  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   62  129:putstatic       #55  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
		$VALUES = (new CallbackManagerImpl$RequestCodeOffset[] {
			Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite, DeviceShare
		});
	//   63  132:bipush          9
	//   64  134:anewarray       CallbackManagerImpl$RequestCodeOffset[]
	//   65  137:dup             
	//   66  138:iconst_0        
	//   67  139:getstatic       #31  <Field CallbackManagerImpl$RequestCodeOffset Login>
	//   68  142:aastore         
	//   69  143:dup             
	//   70  144:iconst_1        
	//   71  145:getstatic       #34  <Field CallbackManagerImpl$RequestCodeOffset Share>
	//   72  148:aastore         
	//   73  149:dup             
	//   74  150:iconst_2        
	//   75  151:getstatic       #37  <Field CallbackManagerImpl$RequestCodeOffset Message>
	//   76  154:aastore         
	//   77  155:dup             
	//   78  156:iconst_3        
	//   79  157:getstatic       #40  <Field CallbackManagerImpl$RequestCodeOffset Like>
	//   80  160:aastore         
	//   81  161:dup             
	//   82  162:iconst_4        
	//   83  163:getstatic       #43  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
	//   84  166:aastore         
	//   85  167:dup             
	//   86  168:iconst_5        
	//   87  169:getstatic       #46  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
	//   88  172:aastore         
	//   89  173:dup             
	//   90  174:bipush          6
	//   91  176:getstatic       #49  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
	//   92  179:aastore         
	//   93  180:dup             
	//   94  181:bipush          7
	//   95  183:getstatic       #52  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
	//   96  186:aastore         
	//   97  187:dup             
	//   98  188:bipush          8
	//   99  190:getstatic       #55  <Field CallbackManagerImpl$RequestCodeOffset DeviceShare>
	//  100  193:aastore         
	//  101  194:putstatic       #57  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//* 102  197:return          
	}

	private CallbackManagerImpl$RequestCodeOffset(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		offset = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #63  <Field int offset>
	//    7   11:return          
	}
}
