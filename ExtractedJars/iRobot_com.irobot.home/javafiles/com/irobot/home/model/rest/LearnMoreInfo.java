// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;
import java.util.List;

public class LearnMoreInfo
{

	public LearnMoreInfo(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		aboutItems = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List aboutItems>
		appRobotCompatibility = "";
	//    7   15:aload_0         
	//    8   16:ldc1            #22  <String "">
	//    9   18:putfield        #24  <Field String appRobotCompatibility>
		dataSecurity = "";
	//   10   21:aload_0         
	//   11   22:ldc1            #22  <String "">
	//   12   24:putfield        #26  <Field String dataSecurity>
		aboutItems.addAll(((java.util.Collection) (list)));
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field List aboutItems>
	//   15   31:aload_1         
	//   16   32:invokeinterface #32  <Method boolean List.addAll(java.util.Collection)>
	//   17   37:pop             
	//   18   38:return          
	}

	public List aboutItems;
	public String appRobotCompatibility;
	public String dataSecurity;
}
