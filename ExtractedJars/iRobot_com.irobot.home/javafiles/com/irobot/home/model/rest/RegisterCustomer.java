// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class RegisterCustomer
{

	public RegisterCustomer(String s, boolean flag, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		email = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String email>
		promoOptIn = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean promoOptIn>
		country = s2;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #22  <Field String country>
		postalCode = s1;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #24  <Field String postalCode>
		language = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #26  <Field String language>
	//   17   31:return          
	}

	public String country;
	public String email;
	public String language;
	public String postalCode;
	public boolean promoOptIn;
}
