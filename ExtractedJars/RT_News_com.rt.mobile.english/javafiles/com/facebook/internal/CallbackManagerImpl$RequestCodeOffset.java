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
	//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    4    9:areturn         
	}

	public static CallbackManagerImpl$RequestCodeOffset[] values()
	{
		return (CallbackManagerImpl$RequestCodeOffset[])((CallbackManagerImpl$RequestCodeOffset []) ($VALUES)).clone();
	//    0    0:getstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.facebook.internal.CallbackManagerImpl$RequestCodeOffset_3B_.clone()>
	//    2    6:checkcast       #69  <Class CallbackManagerImpl$RequestCodeOffset[]>
	//    3    9:areturn         
	}

	public int toRequestCode()
	{
		return FacebookSdk.getCallbackRequestCodeOffset() + offset;
	//    0    0:invokestatic    #80  <Method int FacebookSdk.getCallbackRequestCodeOffset()>
	//    1    3:aload_0         
	//    2    4:getfield        #59  <Field int offset>
	//    3    7:iadd            
	//    4    8:ireturn         
	}

	private static final CallbackManagerImpl$RequestCodeOffset $VALUES[];
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupCreate;
	public static final CallbackManagerImpl$RequestCodeOffset AppGroupJoin;
	public static final CallbackManagerImpl$RequestCodeOffset AppInvite;
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
	//    2    4:ldc1            #24  <String "Login">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//    6   11:putstatic       #30  <Field CallbackManagerImpl$RequestCodeOffset Login>
		Share = new CallbackManagerImpl$RequestCodeOffset("Share", 1, 1);
	//    7   14:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//    8   17:dup             
	//    9   18:ldc1            #31  <String "Share">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   13   25:putstatic       #33  <Field CallbackManagerImpl$RequestCodeOffset Share>
		Message = new CallbackManagerImpl$RequestCodeOffset("Message", 2, 2);
	//   14   28:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "Message">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   20   39:putstatic       #36  <Field CallbackManagerImpl$RequestCodeOffset Message>
		Like = new CallbackManagerImpl$RequestCodeOffset("Like", 3, 3);
	//   21   42:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   22   45:dup             
	//   23   46:ldc1            #37  <String "Like">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   27   53:putstatic       #39  <Field CallbackManagerImpl$RequestCodeOffset Like>
		GameRequest = new CallbackManagerImpl$RequestCodeOffset("GameRequest", 4, 4);
	//   28   56:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   29   59:dup             
	//   30   60:ldc1            #40  <String "GameRequest">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   34   67:putstatic       #42  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
		AppGroupCreate = new CallbackManagerImpl$RequestCodeOffset("AppGroupCreate", 5, 5);
	//   35   70:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   36   73:dup             
	//   37   74:ldc1            #43  <String "AppGroupCreate">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   41   81:putstatic       #45  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
		AppGroupJoin = new CallbackManagerImpl$RequestCodeOffset("AppGroupJoin", 6, 6);
	//   42   84:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   43   87:dup             
	//   44   88:ldc1            #46  <String "AppGroupJoin">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   48   97:putstatic       #48  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
		AppInvite = new CallbackManagerImpl$RequestCodeOffset("AppInvite", 7, 7);
	//   49  100:new             #2   <Class CallbackManagerImpl$RequestCodeOffset>
	//   50  103:dup             
	//   51  104:ldc1            #49  <String "AppInvite">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #28  <Method void CallbackManagerImpl$RequestCodeOffset(String, int, int)>
	//   55  113:putstatic       #51  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
		$VALUES = (new CallbackManagerImpl$RequestCodeOffset[] {
			Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite
		});
	//   56  116:bipush          8
	//   57  118:anewarray       CallbackManagerImpl$RequestCodeOffset[]
	//   58  121:dup             
	//   59  122:iconst_0        
	//   60  123:getstatic       #30  <Field CallbackManagerImpl$RequestCodeOffset Login>
	//   61  126:aastore         
	//   62  127:dup             
	//   63  128:iconst_1        
	//   64  129:getstatic       #33  <Field CallbackManagerImpl$RequestCodeOffset Share>
	//   65  132:aastore         
	//   66  133:dup             
	//   67  134:iconst_2        
	//   68  135:getstatic       #36  <Field CallbackManagerImpl$RequestCodeOffset Message>
	//   69  138:aastore         
	//   70  139:dup             
	//   71  140:iconst_3        
	//   72  141:getstatic       #39  <Field CallbackManagerImpl$RequestCodeOffset Like>
	//   73  144:aastore         
	//   74  145:dup             
	//   75  146:iconst_4        
	//   76  147:getstatic       #42  <Field CallbackManagerImpl$RequestCodeOffset GameRequest>
	//   77  150:aastore         
	//   78  151:dup             
	//   79  152:iconst_5        
	//   80  153:getstatic       #45  <Field CallbackManagerImpl$RequestCodeOffset AppGroupCreate>
	//   81  156:aastore         
	//   82  157:dup             
	//   83  158:bipush          6
	//   84  160:getstatic       #48  <Field CallbackManagerImpl$RequestCodeOffset AppGroupJoin>
	//   85  163:aastore         
	//   86  164:dup             
	//   87  165:bipush          7
	//   88  167:getstatic       #51  <Field CallbackManagerImpl$RequestCodeOffset AppInvite>
	//   89  170:aastore         
	//   90  171:putstatic       #53  <Field CallbackManagerImpl$RequestCodeOffset[] $VALUES>
	//*  91  174:return          
	}

	private CallbackManagerImpl$RequestCodeOffset(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
		offset = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #59  <Field int offset>
	//    7   11:return          
	}
}
