// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;


public class PostRequest
{

	public PostRequest(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String url>
		body = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String body>
	//    8   14:return          
	}

	public String body;
	public String url;
}
