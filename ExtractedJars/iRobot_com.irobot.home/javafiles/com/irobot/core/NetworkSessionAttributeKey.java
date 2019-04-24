// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class NetworkSessionAttributeKey extends Enum
{

	private NetworkSessionAttributeKey(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static NetworkSessionAttributeKey valueOf(String s)
	{
		return (NetworkSessionAttributeKey)Enum.valueOf(com/irobot/core/NetworkSessionAttributeKey, s);
	//    0    0:ldc1            #2   <Class NetworkSessionAttributeKey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NetworkSessionAttributeKey>
	//    4    9:areturn         
	}

	public static NetworkSessionAttributeKey[] values()
	{
		return (NetworkSessionAttributeKey[])((NetworkSessionAttributeKey []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field NetworkSessionAttributeKey[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.irobot.core.NetworkSessionAttributeKey_3B_.clone()>
	//    2    6:checkcast       #55  <Class NetworkSessionAttributeKey[]>
	//    3    9:areturn         
	}

	private static final NetworkSessionAttributeKey $VALUES[];
	public static final NetworkSessionAttributeKey AssetId;
	public static final NetworkSessionAttributeKey BleAttributes;
	public static final NetworkSessionAttributeKey Callback;
	public static final NetworkSessionAttributeKey ConnectionTimeout;
	public static final NetworkSessionAttributeKey ListOfSubscriptionTopics;
	public static final NetworkSessionAttributeKey NetworkAddress;
	public static final NetworkSessionAttributeKey Password;

	static 
	{
		Password = new NetworkSessionAttributeKey("Password", 0);
	//    0    0:new             #2   <Class NetworkSessionAttributeKey>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Password">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//    5   10:putstatic       #24  <Field NetworkSessionAttributeKey Password>
		NetworkAddress = new NetworkSessionAttributeKey("NetworkAddress", 1);
	//    6   13:new             #2   <Class NetworkSessionAttributeKey>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NetworkAddress">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   11   23:putstatic       #27  <Field NetworkSessionAttributeKey NetworkAddress>
		AssetId = new NetworkSessionAttributeKey("AssetId", 2);
	//   12   26:new             #2   <Class NetworkSessionAttributeKey>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "AssetId">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   17   36:putstatic       #30  <Field NetworkSessionAttributeKey AssetId>
		Callback = new NetworkSessionAttributeKey("Callback", 3);
	//   18   39:new             #2   <Class NetworkSessionAttributeKey>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "Callback">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   23   49:putstatic       #33  <Field NetworkSessionAttributeKey Callback>
		ConnectionTimeout = new NetworkSessionAttributeKey("ConnectionTimeout", 4);
	//   24   52:new             #2   <Class NetworkSessionAttributeKey>
	//   25   55:dup             
	//   26   56:ldc1            #34  <String "ConnectionTimeout">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   29   62:putstatic       #36  <Field NetworkSessionAttributeKey ConnectionTimeout>
		ListOfSubscriptionTopics = new NetworkSessionAttributeKey("ListOfSubscriptionTopics", 5);
	//   30   65:new             #2   <Class NetworkSessionAttributeKey>
	//   31   68:dup             
	//   32   69:ldc1            #37  <String "ListOfSubscriptionTopics">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   35   75:putstatic       #39  <Field NetworkSessionAttributeKey ListOfSubscriptionTopics>
		BleAttributes = new NetworkSessionAttributeKey("BleAttributes", 6);
	//   36   78:new             #2   <Class NetworkSessionAttributeKey>
	//   37   81:dup             
	//   38   82:ldc1            #40  <String "BleAttributes">
	//   39   84:bipush          6
	//   40   86:invokespecial   #22  <Method void NetworkSessionAttributeKey(String, int)>
	//   41   89:putstatic       #42  <Field NetworkSessionAttributeKey BleAttributes>
		$VALUES = (new NetworkSessionAttributeKey[] {
			Password, NetworkAddress, AssetId, Callback, ConnectionTimeout, ListOfSubscriptionTopics, BleAttributes
		});
	//   42   92:bipush          7
	//   43   94:anewarray       NetworkSessionAttributeKey[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #24  <Field NetworkSessionAttributeKey Password>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #27  <Field NetworkSessionAttributeKey NetworkAddress>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #30  <Field NetworkSessionAttributeKey AssetId>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #33  <Field NetworkSessionAttributeKey Callback>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #36  <Field NetworkSessionAttributeKey ConnectionTimeout>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #39  <Field NetworkSessionAttributeKey ListOfSubscriptionTopics>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #42  <Field NetworkSessionAttributeKey BleAttributes>
	//   71  139:aastore         
	//   72  140:putstatic       #44  <Field NetworkSessionAttributeKey[] $VALUES>
	//*  73  143:return          
	}
}
