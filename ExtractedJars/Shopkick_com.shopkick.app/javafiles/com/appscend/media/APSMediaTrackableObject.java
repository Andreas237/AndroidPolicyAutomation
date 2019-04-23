// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import java.util.HashMap;

public abstract class APSMediaTrackableObject
{

	public APSMediaTrackableObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		trackingURLs = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field HashMap trackingURLs>
	//    7   15:return          
	}

	public HashMap trackingURLs;
}
