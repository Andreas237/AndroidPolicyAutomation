// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


public class ContentTypeUtil
{

	public ContentTypeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getSubType(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = s.indexOf('/');
	//    4    6:aload_0         
	//    5    7:bipush          47
	//    6    9:invokevirtual   #17  <Method int String.indexOf(int)>
	//    7   12:istore_1        
		if(i == -1)
	//*   8   13:iload_1         
	//*   9   14:iconst_m1       
	//*  10   15:icmpne          20
			return null;
	//   11   18:aconst_null     
	//   12   19:areturn         
		i++;
	//   13   20:iload_1         
	//   14   21:iconst_1        
	//   15   22:iadd            
	//   16   23:istore_1        
		if(i < s.length())
	//*  17   24:iload_1         
	//*  18   25:aload_0         
	//*  19   26:invokevirtual   #21  <Method int String.length()>
	//*  20   29:icmpge          38
			return s.substring(i);
	//   21   32:aload_0         
	//   22   33:iload_1         
	//   23   34:invokevirtual   #25  <Method String String.substring(int)>
	//   24   37:areturn         
		else
			return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static boolean isTextual(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return s.startsWith("text");
	//    4    6:aload_0         
	//    5    7:ldc1            #29  <String "text">
	//    6    9:invokevirtual   #32  <Method boolean String.startsWith(String)>
	//    7   12:ireturn         
	}
}
