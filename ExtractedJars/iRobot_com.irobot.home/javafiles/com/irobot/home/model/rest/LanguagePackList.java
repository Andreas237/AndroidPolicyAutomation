// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;
import java.util.List;

public class LanguagePackList
{

	public LanguagePackList(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		languagePackItems = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field List languagePackItems>
		languagePackItems.addAll(((java.util.Collection) (list)));
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field List languagePackItems>
	//    9   19:aload_1         
	//   10   20:invokeinterface #23  <Method boolean List.addAll(java.util.Collection)>
	//   11   25:pop             
	//   12   26:return          
	}

	public List languagePackItems;
}
