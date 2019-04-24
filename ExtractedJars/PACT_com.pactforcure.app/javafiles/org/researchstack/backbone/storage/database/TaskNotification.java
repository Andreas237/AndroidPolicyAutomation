// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.database;

import java.io.Serializable;
import java.util.Date;

public class TaskNotification
	implements Serializable
{

	public TaskNotification()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public String chronTime;
	public Date endDate;
	public int id;
}
