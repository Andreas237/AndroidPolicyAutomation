// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class LoginAuthenticator extends Authenticator
{

	LoginAuthenticator(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Authenticator()>
		username = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String username>
		password = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String password>
	//    8   14:return          
	}

	public PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication(username, password);
	//    0    0:new             #21  <Class PasswordAuthentication>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field String username>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String password>
	//    6   12:invokespecial   #23  <Method void PasswordAuthentication(String, String)>
	//    7   15:areturn         
	}

	String password;
	String username;
}
