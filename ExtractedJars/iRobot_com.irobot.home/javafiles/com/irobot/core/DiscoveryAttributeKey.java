// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class DiscoveryAttributeKey extends Enum
{

	private DiscoveryAttributeKey(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DiscoveryAttributeKey valueOf(String s)
	{
		return (DiscoveryAttributeKey)Enum.valueOf(com/irobot/core/DiscoveryAttributeKey, s);
	//    0    0:ldc1            #2   <Class DiscoveryAttributeKey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DiscoveryAttributeKey>
	//    4    9:areturn         
	}

	public static DiscoveryAttributeKey[] values()
	{
		return (DiscoveryAttributeKey[])((DiscoveryAttributeKey []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field DiscoveryAttributeKey[] $VALUES>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.irobot.core.DiscoveryAttributeKey_3B_.clone()>
	//    2    6:checkcast       #39  <Class DiscoveryAttributeKey[]>
	//    3    9:areturn         
	}

	private static final DiscoveryAttributeKey $VALUES[];
	public static final DiscoveryAttributeKey BleServiceUuids;
	public static final DiscoveryAttributeKey Callback;
	public static final DiscoveryAttributeKey Type;

	static 
	{
		Type = new DiscoveryAttributeKey("Type", 0);
	//    0    0:new             #2   <Class DiscoveryAttributeKey>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "Type">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void DiscoveryAttributeKey(String, int)>
	//    5   10:putstatic       #20  <Field DiscoveryAttributeKey Type>
		Callback = new DiscoveryAttributeKey("Callback", 1);
	//    6   13:new             #2   <Class DiscoveryAttributeKey>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "Callback">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void DiscoveryAttributeKey(String, int)>
	//   11   23:putstatic       #23  <Field DiscoveryAttributeKey Callback>
		BleServiceUuids = new DiscoveryAttributeKey("BleServiceUuids", 2);
	//   12   26:new             #2   <Class DiscoveryAttributeKey>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "BleServiceUuids">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void DiscoveryAttributeKey(String, int)>
	//   17   36:putstatic       #26  <Field DiscoveryAttributeKey BleServiceUuids>
		$VALUES = (new DiscoveryAttributeKey[] {
			Type, Callback, BleServiceUuids
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       DiscoveryAttributeKey[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field DiscoveryAttributeKey Type>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field DiscoveryAttributeKey Callback>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field DiscoveryAttributeKey BleServiceUuids>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field DiscoveryAttributeKey[] $VALUES>
	//*  33   64:return          
	}
}
