// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.auth;


// Referenced classes of package com.amazonaws.auth:
//			AWSCredentials

public class BasicAWSCredentials
	implements AWSCredentials
{

	public BasicAWSCredentials(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(s == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("Access key cannot be null.");
	//    4    8:new             #16  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #18  <String "Access key cannot be null.">
	//    7   14:invokespecial   #21  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(s1 == null)
	//*   9   18:aload_2         
	//*  10   19:ifnonnull       32
		{
			throw new IllegalArgumentException("Secret key cannot be null.");
	//   11   22:new             #16  <Class IllegalArgumentException>
	//   12   25:dup             
	//   13   26:ldc1            #23  <String "Secret key cannot be null.">
	//   14   28:invokespecial   #21  <Method void IllegalArgumentException(String)>
	//   15   31:athrow          
		} else
		{
			a = s;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #25  <Field String a>
			b = s1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #27  <Field String b>
			return;
	//   22   42:return          
		}
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String b>
	//    2    4:areturn         
	}

	private final String a;
	private final String b;
}
