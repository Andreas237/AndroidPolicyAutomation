// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import java.util.ArrayList;
import java.util.List;

class Vcards
{

	Vcards(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List vcards>
		vcards.addAll(((java.util.Collection) (list)));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field List vcards>
	//    9   19:aload_1         
	//   10   20:invokeinterface #25  <Method boolean List.addAll(java.util.Collection)>
	//   11   25:pop             
	//   12   26:return          
	}

	final List vcards = new ArrayList();
}
