// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			CraftARItem, CraftARCollection

public class CraftARItemFactory
{

	public CraftARItemFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	static CraftARItem createItem(CraftARCollection craftarcollection, JSONObject jsonobject)
	{
		return mFactory.getItem(craftarcollection, jsonobject);
	//    0    0:getstatic       #15  <Field CraftARItemFactory mFactory>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #18  <Method CraftARItem getItem(CraftARCollection, JSONObject)>
	//    4    8:areturn         
	}

	public static CraftARItemFactory getFactory()
	{
		return mFactory;
	//    0    0:getstatic       #15  <Field CraftARItemFactory mFactory>
	//    1    3:areturn         
	}

	public static void setFactory(CraftARItemFactory craftaritemfactory)
	{
		mFactory = craftaritemfactory;
	//    0    0:aload_0         
	//    1    1:putstatic       #15  <Field CraftARItemFactory mFactory>
	//    2    4:return          
	}

	protected CraftARItem getItem(CraftARCollection craftarcollection, JSONObject jsonobject)
	{
		return new CraftARItem(craftarcollection, jsonobject);
	//    0    0:new             #24  <Class CraftARItem>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #27  <Method void CraftARItem(CraftARCollection, JSONObject)>
	//    5    9:areturn         
	}

	static CraftARItemFactory mFactory;
}
