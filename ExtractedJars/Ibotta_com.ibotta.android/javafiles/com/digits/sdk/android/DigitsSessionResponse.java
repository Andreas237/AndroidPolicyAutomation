// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


class DigitsSessionResponse
{

	DigitsSessionResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public boolean isEmpty()
	{
		return token == null && secret == null && screenName == null && userId == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String token>
	//    2    4:ifnonnull       32
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String secret>
	//    5   11:ifnonnull       32
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field String screenName>
	//    8   18:ifnonnull       32
	//    9   21:aload_0         
	//   10   22:getfield        #31  <Field long userId>
	//   11   25:lconst_0        
	//   12   26:lcmp            
	//   13   27:ifne            32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public String screenName;
	public String secret;
	public String token;
	public long userId;
}
