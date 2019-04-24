// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;
import java.util.List;

public class FirmwareUpdateItemList
{

	public FirmwareUpdateItemList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		firmwareUpdateItems = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List firmwareUpdateItems>
	//    7   15:return          
	}

	public List firmwareUpdateItems;
}
