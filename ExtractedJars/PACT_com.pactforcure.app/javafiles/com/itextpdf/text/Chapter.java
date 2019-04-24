// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			Section, Paragraph

public class Chapter extends Section
{

	public Chapter(int i)
	{
		super(((Paragraph) (null)), 1);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_1        
	//    3    3:invokespecial   #13  <Method void Section(Paragraph, int)>
		numbers = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #15  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void ArrayList()>
	//    8   14:putfield        #22  <Field ArrayList numbers>
		numbers.add(((Object) (Integer.valueOf(i))));
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field ArrayList numbers>
	//   11   21:iload_1         
	//   12   22:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   13   25:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//   14   28:pop             
		triggerNewPage = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #36  <Field boolean triggerNewPage>
	//   18   34:return          
	}

	public Chapter(Paragraph paragraph, int i)
	{
		super(paragraph, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #13  <Method void Section(Paragraph, int)>
		numbers = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #15  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void ArrayList()>
	//    8   14:putfield        #22  <Field ArrayList numbers>
		numbers.add(((Object) (Integer.valueOf(i))));
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field ArrayList numbers>
	//   11   21:iload_2         
	//   12   22:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//   13   25:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//   14   28:pop             
		triggerNewPage = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #36  <Field boolean triggerNewPage>
	//   18   34:return          
	}

	public Chapter(String s, int i)
	{
		this(new Paragraph(s), i);
	//    0    0:aload_0         
	//    1    1:new             #40  <Class Paragraph>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #43  <Method void Paragraph(String)>
	//    5    9:iload_2         
	//    6   10:invokespecial   #44  <Method void Chapter(Paragraph, int)>
	//    7   13:return          
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int type()
	{
		return 16;
	//    0    0:bipush          16
	//    1    2:ireturn         
	}

	private static final long serialVersionUID = 0xc867f2b1L;
}
