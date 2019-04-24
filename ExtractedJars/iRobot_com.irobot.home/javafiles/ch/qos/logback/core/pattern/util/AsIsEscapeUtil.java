// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.util;


// Referenced classes of package ch.qos.logback.core.pattern.util:
//			IEscapeUtil

public class AsIsEscapeUtil
	implements IEscapeUtil
{

	public AsIsEscapeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void escape(String s, StringBuffer stringbuffer, char c, int i)
	{
		stringbuffer.append("\\");
	//    0    0:aload_2         
	//    1    1:ldc1            #15  <String "\\">
	//    2    3:invokevirtual   #21  <Method StringBuffer StringBuffer.append(String)>
	//    3    6:pop             
		stringbuffer.append(c);
	//    4    7:aload_2         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #24  <Method StringBuffer StringBuffer.append(char)>
	//    7   12:pop             
	//    8   13:return          
	}
}
