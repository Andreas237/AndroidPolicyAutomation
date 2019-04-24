// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;

public class SocialInfoList
{

	public SocialInfoList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public boolean hasItems()
	{
		return socialMediaItems != null && !socialMediaItems.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList socialMediaItems>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field ArrayList socialMediaItems>
	//    5   11:invokevirtual   #23  <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public String connectedHomeUrl;
	public ArrayList socialMediaItems;
}
