// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.api.Indentable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.text:
//			MarkedObject, Section, Paragraph, DocumentException, 
//			Element, ElementListener

public class MarkedSection extends MarkedObject
	implements Indentable
{

	public MarkedSection(Section section)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MarkedObject()>
		title = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field MarkedObject title>
		if(section.title != null)
	//*   5    9:aload_1         
	//*   6   10:getfield        #21  <Field Paragraph Section.title>
	//*   7   13:ifnull          36
		{
			title = new MarkedObject(((Element) (section.title)));
	//    8   16:aload_0         
	//    9   17:new             #4   <Class MarkedObject>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:getfield        #21  <Field Paragraph Section.title>
	//   13   25:invokespecial   #24  <Method void MarkedObject(Element)>
	//   14   28:putfield        #16  <Field MarkedObject title>
			section.setTitle(((Paragraph) (null)));
	//   15   31:aload_1         
	//   16   32:aconst_null     
	//   17   33:invokevirtual   #28  <Method void Section.setTitle(Paragraph)>
		}
		element = ((Element) (section));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #32  <Field Element element>
	//   21   41:return          
	}

	public void add(int i, Element element)
	{
		((Section)this.element).add(i, element);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:iload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #37  <Method void Section.add(int, Element)>
	//    6   12:return          
	}

	public boolean add(Element element)
	{
		return ((Section)this.element).add(element);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #40  <Method boolean Section.add(Element)>
	//    5   11:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		return ((Section)element).addAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #44  <Method boolean Section.addAll(Collection)>
	//    5   11:ireturn         
	}

	public MarkedSection addSection()
	{
		return ((Section)element).addMarkedSection();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #51  <Method MarkedSection Section.addMarkedSection()>
	//    4   10:areturn         
	}

	public MarkedSection addSection(float f)
	{
		MarkedSection markedsection = ((Section)element).addMarkedSection();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #51  <Method MarkedSection Section.addMarkedSection()>
	//    4   10:astore_2        
		markedsection.setIndentation(f);
	//    5   11:aload_2         
	//    6   12:fload_1         
	//    7   13:invokevirtual   #56  <Method void setIndentation(float)>
		return markedsection;
	//    8   16:aload_2         
	//    9   17:areturn         
	}

	public MarkedSection addSection(float f, int i)
	{
		MarkedSection markedsection = ((Section)element).addMarkedSection();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #51  <Method MarkedSection Section.addMarkedSection()>
	//    4   10:astore_3        
		markedsection.setIndentation(f);
	//    5   11:aload_3         
	//    6   12:fload_1         
	//    7   13:invokevirtual   #56  <Method void setIndentation(float)>
		markedsection.setNumberDepth(i);
	//    8   16:aload_3         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #61  <Method void setNumberDepth(int)>
		return markedsection;
	//   11   21:aload_3         
	//   12   22:areturn         
	}

	public MarkedSection addSection(int i)
	{
		MarkedSection markedsection = ((Section)element).addMarkedSection();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #51  <Method MarkedSection Section.addMarkedSection()>
	//    4   10:astore_2        
		markedsection.setNumberDepth(i);
	//    5   11:aload_2         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #61  <Method void setNumberDepth(int)>
		return markedsection;
	//    8   16:aload_2         
	//    9   17:areturn         
	}

	public float getIndentationLeft()
	{
		return ((Section)element).getIndentationLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #66  <Method float Section.getIndentationLeft()>
	//    4   10:freturn         
	}

	public float getIndentationRight()
	{
		return ((Section)element).getIndentationRight();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #69  <Method float Section.getIndentationRight()>
	//    4   10:freturn         
	}

	public MarkedObject getTitle()
	{
		MarkedObject markedobject = new MarkedObject(((Element) (Section.constructTitle((Paragraph)title.element, ((Section)element).numbers, ((Section)element).numberDepth, ((Section)element).numberStyle))));
	//    0    0:new             #4   <Class MarkedObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MarkedObject title>
	//    4    8:getfield        #72  <Field Element MarkedObject.element>
	//    5   11:checkcast       #74  <Class Paragraph>
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field Element element>
	//    8   18:checkcast       #18  <Class Section>
	//    9   21:getfield        #78  <Field java.util.ArrayList Section.numbers>
	//   10   24:aload_0         
	//   11   25:getfield        #32  <Field Element element>
	//   12   28:checkcast       #18  <Class Section>
	//   13   31:getfield        #82  <Field int Section.numberDepth>
	//   14   34:aload_0         
	//   15   35:getfield        #32  <Field Element element>
	//   16   38:checkcast       #18  <Class Section>
	//   17   41:getfield        #85  <Field int Section.numberStyle>
	//   18   44:invokestatic    #89  <Method Paragraph Section.constructTitle(Paragraph, java.util.ArrayList, int, int)>
	//   19   47:invokespecial   #24  <Method void MarkedObject(Element)>
	//   20   50:astore_1        
		markedobject.markupAttributes = title.markupAttributes;
	//   21   51:aload_1         
	//   22   52:aload_0         
	//   23   53:getfield        #16  <Field MarkedObject title>
	//   24   56:getfield        #93  <Field java.util.Properties MarkedObject.markupAttributes>
	//   25   59:putfield        #93  <Field java.util.Properties MarkedObject.markupAttributes>
		return markedobject;
	//   26   62:aload_1         
	//   27   63:areturn         
	}

	public void newPage()
	{
		((Section)element).newPage();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #96  <Method void Section.newPage()>
	//    4   10:return          
	}

	public boolean process(ElementListener elementlistener)
	{
		try
		{
			for(Iterator iterator = ((Section)element).iterator(); iterator.hasNext(); elementlistener.add((Element)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:invokevirtual   #104 <Method Iterator Section.iterator()>
	//    4   10:astore_2        
	//    5   11:aload_2         
	//    6   12:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            42
	//    8   20:aload_1         
	//    9   21:aload_2         
	//   10   22:invokeinterface #114 <Method Object Iterator.next()>
	//   11   27:checkcast       #116 <Class Element>
	//   12   30:invokeinterface #119 <Method boolean ElementListener.add(Element)>
	//   13   35:pop             
		}
	//*  14   36:goto            11
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*  15   39:astore_1        
		{
			return false;
	//   16   40:iconst_0        
	//   17   41:ireturn         
		}
		return true;
	//   18   42:iconst_1        
	//   19   43:ireturn         
	}

	public void setBookmarkOpen(boolean flag)
	{
		((Section)element).setBookmarkOpen(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #123 <Method void Section.setBookmarkOpen(boolean)>
	//    5   11:return          
	}

	public void setBookmarkTitle(String s)
	{
		((Section)element).setBookmarkTitle(s);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #127 <Method void Section.setBookmarkTitle(String)>
	//    5   11:return          
	}

	public void setIndentation(float f)
	{
		((Section)element).setIndentation(f);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:fload_1         
	//    4    8:invokevirtual   #128 <Method void Section.setIndentation(float)>
	//    5   11:return          
	}

	public void setIndentationLeft(float f)
	{
		((Section)element).setIndentationLeft(f);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:fload_1         
	//    4    8:invokevirtual   #131 <Method void Section.setIndentationLeft(float)>
	//    5   11:return          
	}

	public void setIndentationRight(float f)
	{
		((Section)element).setIndentationRight(f);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:fload_1         
	//    4    8:invokevirtual   #134 <Method void Section.setIndentationRight(float)>
	//    5   11:return          
	}

	public void setNumberDepth(int i)
	{
		((Section)element).setNumberDepth(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #135 <Method void Section.setNumberDepth(int)>
	//    5   11:return          
	}

	public void setTitle(MarkedObject markedobject)
	{
		if(markedobject.element instanceof Paragraph)
	//*   0    0:aload_1         
	//*   1    1:getfield        #72  <Field Element MarkedObject.element>
	//*   2    4:instanceof      #74  <Class Paragraph>
	//*   3    7:ifeq            15
			title = markedobject;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #16  <Field MarkedObject title>
	//    7   15:return          
	}

	public void setTriggerNewPage(boolean flag)
	{
		((Section)element).setTriggerNewPage(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Element element>
	//    2    4:checkcast       #18  <Class Section>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #139 <Method void Section.setTriggerNewPage(boolean)>
	//    5   11:return          
	}

	protected MarkedObject title;
}
