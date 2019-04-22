// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.stetho.server.http:
//			PathMatcher

public class RegexpPathMatcher
	implements PathMatcher
{

	public RegexpPathMatcher(Pattern pattern)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mPattern = pattern;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Pattern mPattern>
	//    5    9:return          
	}

	public boolean match(String s)
	{
		return mPattern.matcher(((CharSequence) (s))).matches();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Pattern mPattern>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method Matcher Pattern.matcher(CharSequence)>
	//    4    8:invokevirtual   #30  <Method boolean Matcher.matches()>
	//    5   11:ireturn         
	}

	private final Pattern mPattern;
}
