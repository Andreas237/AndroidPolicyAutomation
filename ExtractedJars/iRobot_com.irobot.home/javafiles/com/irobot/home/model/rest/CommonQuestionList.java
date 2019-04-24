// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;
import java.util.List;

public class CommonQuestionList
{

	public CommonQuestionList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		customerCareWeb = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "">
	//    4    7:putfield        #17  <Field String customerCareWeb>
		commonQuestions = ((List) (new ArrayList()));
	//    5   10:aload_0         
	//    6   11:new             #19  <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #20  <Method void ArrayList()>
	//    9   18:putfield        #22  <Field List commonQuestions>
	//   10   21:return          
	}

	public List commonQuestions;
	public String customerCareWeb;
}
