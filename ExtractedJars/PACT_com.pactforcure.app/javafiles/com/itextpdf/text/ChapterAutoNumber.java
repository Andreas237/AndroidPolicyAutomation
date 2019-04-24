// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text:
//			Chapter, Paragraph, Section

public class ChapterAutoNumber extends Chapter
{

	public ChapterAutoNumber(Paragraph paragraph)
	{
		super(paragraph, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #15  <Method void Chapter(Paragraph, int)>
		numberSet = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field boolean numberSet>
	//    7   11:return          
	}

	public ChapterAutoNumber(String s)
	{
		super(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #22  <Method void Chapter(String, int)>
		numberSet = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field boolean numberSet>
	//    7   11:return          
	}

	public Section addSection(Paragraph paragraph)
	{
		if(isAddedCompletely())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean isAddedCompletely()>
	//*   2    4:ifeq            24
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.largeelement.has.already.been.added.to.the.document", new Object[0]));
	//    3    7:new             #30  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #32  <String "this.largeelement.has.already.been.added.to.the.document">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #40  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #42  <Method void IllegalStateException(String)>
	//   10   23:athrow          
		else
			return addSection(paragraph, 2);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iconst_2        
	//   14   27:invokevirtual   #45  <Method Section addSection(Paragraph, int)>
	//   15   30:areturn         
	}

	public Section addSection(String s)
	{
		if(isAddedCompletely())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean isAddedCompletely()>
	//*   2    4:ifeq            24
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.largeelement.has.already.been.added.to.the.document", new Object[0]));
	//    3    7:new             #30  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #32  <String "this.largeelement.has.already.been.added.to.the.document">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #40  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #42  <Method void IllegalStateException(String)>
	//   10   23:athrow          
		else
			return addSection(s, 2);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iconst_2        
	//   14   27:invokevirtual   #49  <Method Section addSection(String, int)>
	//   15   30:areturn         
	}

	public int setAutomaticNumber(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(!numberSet)
	//*   2    2:aload_0         
	//*   3    3:getfield        #17  <Field boolean numberSet>
	//*   4    6:ifne            23
		{
			j = i + 1;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:istore_2        
			super.setChapterNumber(j);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokespecial   #55  <Method void Chapter.setChapterNumber(int)>
			numberSet = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #17  <Field boolean numberSet>
		}
		return j;
	//   15   23:iload_2         
	//   16   24:ireturn         
	}

	private static final long serialVersionUID = 0x4b85d8a9L;
	protected boolean numberSet;
}
