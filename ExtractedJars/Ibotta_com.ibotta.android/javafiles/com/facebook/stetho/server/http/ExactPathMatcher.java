// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;


// Referenced classes of package com.facebook.stetho.server.http:
//			PathMatcher

public class ExactPathMatcher
	implements PathMatcher
{

	public ExactPathMatcher(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mPath = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String mPath>
	//    5    9:return          
	}

	public boolean match(String s)
	{
		return mPath.equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String mPath>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method boolean String.equals(Object)>
	//    4    8:ireturn         
	}

	private final String mPath;
}
