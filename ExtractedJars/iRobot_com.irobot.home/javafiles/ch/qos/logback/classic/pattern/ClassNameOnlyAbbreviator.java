// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;


// Referenced classes of package ch.qos.logback.classic.pattern:
//			Abbreviator

public class ClassNameOnlyAbbreviator
	implements Abbreviator
{

	public ClassNameOnlyAbbreviator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public String abbreviate(String s)
	{
		int i = s.lastIndexOf('.');
	//    0    0:aload_1         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #19  <Method int String.lastIndexOf(int)>
	//    3    6:istore_2        
		String s1 = s;
	//    4    7:aload_1         
	//    5    8:astore_3        
		if(i != -1)
	//*   6    9:iload_2         
	//*   7   10:iconst_m1       
	//*   8   11:icmpeq          26
			s1 = s.substring(i + 1, s.length());
	//    9   14:aload_1         
	//   10   15:iload_2         
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:aload_1         
	//   14   19:invokevirtual   #23  <Method int String.length()>
	//   15   22:invokevirtual   #27  <Method String String.substring(int, int)>
	//   16   25:astore_3        
		return s1;
	//   17   26:aload_3         
	//   18   27:areturn         
	}
}
