// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;


// Referenced classes of package com.facebook.share:
//			Sharer

public static class Sharer$Result
{

	public String getPostId()
	{
		return postId;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String postId>
	//    2    4:areturn         
	}

	final String postId;

	public Sharer$Result(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		postId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String postId>
	//    5    9:return          
	}
}
