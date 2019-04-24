// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.ArrayList;
import java.util.List;

public class HelpInfo
{

	public HelpInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		customerCareWeb = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <String "">
	//    4    7:putfield        #23  <Field String customerCareWeb>
		customerCareEmail = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #21  <String "">
	//    7   13:putfield        #25  <Field String customerCareEmail>
		guidedTourPages = ((List) (new ArrayList()));
	//    8   16:aload_0         
	//    9   17:new             #27  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void ArrayList()>
	//   12   24:putfield        #30  <Field List guidedTourPages>
		warranty = "";
	//   13   27:aload_0         
	//   14   28:ldc1            #21  <String "">
	//   15   30:putfield        #32  <Field String warranty>
		ownersManual = "";
	//   16   33:aload_0         
	//   17   34:ldc1            #21  <String "">
	//   18   36:putfield        #34  <Field String ownersManual>
		quickStart = "";
	//   19   39:aload_0         
	//   20   40:ldc1            #21  <String "">
	//   21   42:putfield        #36  <Field String quickStart>
		storeUrl = "";
	//   22   45:aload_0         
	//   23   46:ldc1            #21  <String "">
	//   24   48:putfield        #38  <Field String storeUrl>
		otherContent = ((List) (new ArrayList()));
	//   25   51:aload_0         
	//   26   52:new             #27  <Class ArrayList>
	//   27   55:dup             
	//   28   56:invokespecial   #28  <Method void ArrayList()>
	//   29   59:putfield        #40  <Field List otherContent>
	//   30   62:return          
	}

	public String customerCareEmail;
	public String customerCareWeb;
	public List guidedTourPages;
	public List otherContent;
	public String ownersManual;
	public String quickStart;
	public String storeUrl;
	public String warranty;
}
