// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.util;


// Referenced classes of package ch.qos.logback.core.pattern.util:
//			IEscapeUtil

public class RestrictedEscapeUtil
	implements IEscapeUtil
{

	public RestrictedEscapeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void escape(String s, StringBuffer stringbuffer, char c, int i)
	{
		if(s.indexOf(((int) (c))) < 0)
	//*   0    0:aload_1         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #19  <Method int String.indexOf(int)>
	//*   3    5:iflt            15
	//*   4    8:aload_2         
	//*   5    9:iload_3         
	//*   6   10:invokevirtual   #25  <Method StringBuffer StringBuffer.append(char)>
	//*   7   13:pop             
	//*   8   14:return          
			stringbuffer.append("\\");
	//    9   15:aload_2         
	//   10   16:ldc1            #27  <String "\\">
	//   11   18:invokevirtual   #30  <Method StringBuffer StringBuffer.append(String)>
	//   12   21:pop             
		stringbuffer.append(c);
	//*  13   22:goto            8
	}
}
