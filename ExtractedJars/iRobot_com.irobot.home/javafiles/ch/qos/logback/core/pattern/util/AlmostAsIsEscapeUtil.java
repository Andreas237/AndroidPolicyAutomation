// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.util;


// Referenced classes of package ch.qos.logback.core.pattern.util:
//			RestrictedEscapeUtil

public class AlmostAsIsEscapeUtil extends RestrictedEscapeUtil
{

	public AlmostAsIsEscapeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void RestrictedEscapeUtil()>
	//    2    4:return          
	}

	public void escape(String s, StringBuffer stringbuffer, char c, int i)
	{
		super.escape("%)", stringbuffer, c, i);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "%)">
	//    2    3:aload_2         
	//    3    4:iload_3         
	//    4    5:iload           4
	//    5    7:invokespecial   #15  <Method void RestrictedEscapeUtil.escape(String, StringBuffer, char, int)>
	//    6   10:return          
	}
}
