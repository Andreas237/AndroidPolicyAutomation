// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;


public class QName
{

	public QName(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		int i = s.indexOf(':');
	//    2    4:aload_1         
	//    3    5:bipush          58
	//    4    7:invokevirtual   #18  <Method int String.indexOf(int)>
	//    5   10:istore_2        
		if(i >= 0)
	//*   6   11:iload_2         
	//*   7   12:iflt            37
		{
			prefix = s.substring(0, i);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:iconst_0        
	//   11   18:iload_2         
	//   12   19:invokevirtual   #22  <Method String String.substring(int, int)>
	//   13   22:putfield        #24  <Field String prefix>
			localName = s.substring(i + 1);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:iload_2         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:invokevirtual   #27  <Method String String.substring(int)>
	//   20   33:putfield        #29  <Field String localName>
			return;
	//   21   36:return          
		} else
		{
			prefix = "";
	//   22   37:aload_0         
	//   23   38:ldc1            #31  <String "">
	//   24   40:putfield        #24  <Field String prefix>
			localName = s;
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:putfield        #29  <Field String localName>
			return;
	//   28   48:return          
		}
	}

	public QName(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		prefix = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String prefix>
		localName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field String localName>
	//    8   14:return          
	}

	public String getLocalName()
	{
		return localName;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String localName>
	//    2    4:areturn         
	}

	public String getPrefix()
	{
		return prefix;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String prefix>
	//    2    4:areturn         
	}

	public boolean hasPrefix()
	{
		return prefix != null && prefix.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String prefix>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field String prefix>
	//    5   11:invokevirtual   #42  <Method int String.length()>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private String localName;
	private String prefix;
}
