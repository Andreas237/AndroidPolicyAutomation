// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class NewFeatureInfo
{

	public NewFeatureInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		notes = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "">
	//    4    7:putfield        #16  <Field String notes>
		specificUrl = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #14  <String "">
	//    7   13:putfield        #18  <Field String specificUrl>
		historicalUrl = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #14  <String "">
	//   10   19:putfield        #20  <Field String historicalUrl>
	//   11   22:return          
	}

	public String historicalUrl;
	public String notes;
	public String specificUrl;
}
