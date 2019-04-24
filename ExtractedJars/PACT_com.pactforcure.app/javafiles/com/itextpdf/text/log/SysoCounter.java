// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;

import java.io.PrintStream;

// Referenced classes of package com.itextpdf.text.log:
//			Counter

public class SysoCounter
	implements Counter
{

	public SysoCounter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		name = "iText";
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "iText">
	//    4    7:putfield        #16  <Field String name>
	//    5   10:return          
	}

	protected SysoCounter(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		name = class1.getName();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method String Class.getName()>
	//    5    9:putfield        #16  <Field String name>
	//    6   12:return          
	}

	public Counter getCounter(Class class1)
	{
		return ((Counter) (new SysoCounter(class1)));
	//    0    0:new             #2   <Class SysoCounter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #30  <Method void SysoCounter(Class)>
	//    4    8:areturn         
	}

	public void read(long l)
	{
		System.out.println(String.format("[%s] %s bytes read", new Object[] {
			name, Long.valueOf(l)
		}));
	//    0    0:getstatic       #39  <Field PrintStream System.out>
	//    1    3:ldc1            #41  <String "[%s] %s bytes read">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #16  <Field String name>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:lload_1         
	//   12   19:invokestatic    #47  <Method Long Long.valueOf(long)>
	//   13   22:aastore         
	//   14   23:invokestatic    #53  <Method String String.format(String, Object[])>
	//   15   26:invokevirtual   #59  <Method void PrintStream.println(String)>
	//   16   29:return          
	}

	public void written(long l)
	{
		System.out.println(String.format("[%s] %s bytes written", new Object[] {
			name, Long.valueOf(l)
		}));
	//    0    0:getstatic       #39  <Field PrintStream System.out>
	//    1    3:ldc1            #62  <String "[%s] %s bytes written">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #16  <Field String name>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:lload_1         
	//   12   19:invokestatic    #47  <Method Long Long.valueOf(long)>
	//   13   22:aastore         
	//   14   23:invokestatic    #53  <Method String String.format(String, Object[])>
	//   15   26:invokevirtual   #59  <Method void PrintStream.println(String)>
	//   16   29:return          
	}

	protected String name;
}
