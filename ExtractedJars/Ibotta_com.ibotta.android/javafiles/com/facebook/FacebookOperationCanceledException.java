// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookException

public class FacebookOperationCanceledException extends FacebookException
{

	public FacebookOperationCanceledException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void FacebookException()>
	//    2    4:return          
	}

	public FacebookOperationCanceledException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FacebookException(String)>
	//    3    5:return          
	}

	static final long serialVersionUID = 1L;
}
