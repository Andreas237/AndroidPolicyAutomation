// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.pdfelement;

import com.itextpdf.text.*;
import com.itextpdf.text.api.Indentable;

public class NoNewLineParagraph extends Phrase
	implements Indentable
{

	public NoNewLineParagraph()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Phrase()>
		alignment = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #33  <Field boolean keeptogether>
	//   14   24:return          
	}

	public NoNewLineParagraph(float f)
	{
		super(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #37  <Method void Phrase(float)>
		alignment = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #33  <Field boolean keeptogether>
	//   15   25:return          
	}

	public NoNewLineParagraph(float f, Chunk chunk)
	{
		super(f, chunk);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void Phrase(float, Chunk)>
		alignment = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//   10   16:aload_0         
	//   11   17:fconst_0        
	//   12   18:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #33  <Field boolean keeptogether>
	//   16   26:return          
	}

	public NoNewLineParagraph(float f, String s)
	{
		super(f, s);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void Phrase(float, String)>
		alignment = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//   10   16:aload_0         
	//   11   17:fconst_0        
	//   12   18:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #33  <Field boolean keeptogether>
	//   16   26:return          
	}

	public NoNewLineParagraph(float f, String s, Font font)
	{
		super(f, s, font);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #46  <Method void Phrase(float, String, Font)>
		alignment = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    8   12:aload_0         
	//    9   13:fconst_0        
	//   10   14:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//   11   17:aload_0         
	//   12   18:fconst_0        
	//   13   19:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #33  <Field boolean keeptogether>
	//   17   27:return          
	}

	public NoNewLineParagraph(Chunk chunk)
	{
		super(chunk);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void Phrase(Chunk)>
		alignment = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #33  <Field boolean keeptogether>
	//   15   25:return          
	}

	public NoNewLineParagraph(Phrase phrase)
	{
		super(phrase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void Phrase(Phrase)>
		alignment = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #33  <Field boolean keeptogether>
		if(phrase instanceof NoNewLineParagraph)
	//*  15   25:aload_1         
	//*  16   26:instanceof      #2   <Class NoNewLineParagraph>
	//*  17   29:ifeq            93
		{
			NoNewLineParagraph nonewlineparagraph = (NoNewLineParagraph)phrase;
	//   18   32:aload_1         
	//   19   33:checkcast       #2   <Class NoNewLineParagraph>
	//   20   36:astore_2        
			alignment = nonewlineparagraph.getAlignment();
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokevirtual   #56  <Method int getAlignment()>
	//   24   42:putfield        #27  <Field int alignment>
			indentationLeft = nonewlineparagraph.getIndentationLeft();
	//   25   45:aload_0         
	//   26   46:aload_2         
	//   27   47:invokevirtual   #60  <Method float getIndentationLeft()>
	//   28   50:putfield        #62  <Field float indentationLeft>
			indentationRight = nonewlineparagraph.getIndentationRight();
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #65  <Method float getIndentationRight()>
	//   32   58:putfield        #67  <Field float indentationRight>
			firstLineIndent = nonewlineparagraph.getFirstLineIndent();
	//   33   61:aload_0         
	//   34   62:aload_2         
	//   35   63:invokevirtual   #70  <Method float getFirstLineIndent()>
	//   36   66:putfield        #29  <Field float firstLineIndent>
			spacingAfter = nonewlineparagraph.getSpacingAfter();
	//   37   69:aload_0         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #73  <Method float getSpacingAfter()>
	//   40   74:putfield        #75  <Field float spacingAfter>
			spacingBefore = nonewlineparagraph.getSpacingBefore();
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #78  <Method float getSpacingBefore()>
	//   44   82:putfield        #80  <Field float spacingBefore>
			extraParagraphSpace = nonewlineparagraph.getExtraParagraphSpace();
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #83  <Method float getExtraParagraphSpace()>
	//   48   90:putfield        #31  <Field float extraParagraphSpace>
		}
		if(phrase instanceof Paragraph)
	//*  49   93:aload_1         
	//*  50   94:instanceof      #85  <Class Paragraph>
	//*  51   97:ifeq            161
		{
			phrase = ((Phrase) ((Paragraph)phrase));
	//   52  100:aload_1         
	//   53  101:checkcast       #85  <Class Paragraph>
	//   54  104:astore_1        
			setAlignment(((Paragraph) (phrase)).getAlignment());
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:invokevirtual   #86  <Method int Paragraph.getAlignment()>
	//   58  110:invokevirtual   #90  <Method void setAlignment(int)>
			setIndentationLeft(((Paragraph) (phrase)).getIndentationLeft());
	//   59  113:aload_0         
	//   60  114:aload_1         
	//   61  115:invokevirtual   #91  <Method float Paragraph.getIndentationLeft()>
	//   62  118:invokevirtual   #94  <Method void setIndentationLeft(float)>
			setIndentationRight(((Paragraph) (phrase)).getIndentationRight());
	//   63  121:aload_0         
	//   64  122:aload_1         
	//   65  123:invokevirtual   #95  <Method float Paragraph.getIndentationRight()>
	//   66  126:invokevirtual   #98  <Method void setIndentationRight(float)>
			setFirstLineIndent(((Paragraph) (phrase)).getFirstLineIndent());
	//   67  129:aload_0         
	//   68  130:aload_1         
	//   69  131:invokevirtual   #99  <Method float Paragraph.getFirstLineIndent()>
	//   70  134:invokevirtual   #102 <Method void setFirstLineIndent(float)>
			setSpacingAfter(((Paragraph) (phrase)).getSpacingAfter());
	//   71  137:aload_0         
	//   72  138:aload_1         
	//   73  139:invokevirtual   #103 <Method float Paragraph.getSpacingAfter()>
	//   74  142:invokevirtual   #106 <Method void setSpacingAfter(float)>
			setSpacingBefore(((Paragraph) (phrase)).getSpacingBefore());
	//   75  145:aload_0         
	//   76  146:aload_1         
	//   77  147:invokevirtual   #107 <Method float Paragraph.getSpacingBefore()>
	//   78  150:invokevirtual   #110 <Method void setSpacingBefore(float)>
			setExtraParagraphSpace(((Paragraph) (phrase)).getExtraParagraphSpace());
	//   79  153:aload_0         
	//   80  154:aload_1         
	//   81  155:invokevirtual   #111 <Method float Paragraph.getExtraParagraphSpace()>
	//   82  158:invokevirtual   #114 <Method void setExtraParagraphSpace(float)>
		}
	//   83  161:return          
	}

	public NoNewLineParagraph(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void Phrase(String)>
		alignment = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #33  <Field boolean keeptogether>
	//   15   25:return          
	}

	public NoNewLineParagraph(String s, Font font)
	{
		super(s, font);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #120 <Method void Phrase(String, Font)>
		alignment = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #27  <Field int alignment>
		firstLineIndent = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #29  <Field float firstLineIndent>
		extraParagraphSpace = 0.0F;
	//   10   16:aload_0         
	//   11   17:fconst_0        
	//   12   18:putfield        #31  <Field float extraParagraphSpace>
		keeptogether = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #33  <Field boolean keeptogether>
	//   16   26:return          
	}

	public boolean add(Element element)
	{
		if(element instanceof List)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #124 <Class List>
	//*   2    4:ifeq            39
		{
			element = ((Element) ((List)element));
	//    3    7:aload_1         
	//    4    8:checkcast       #124 <Class List>
	//    5   11:astore_1        
			((List) (element)).setIndentationLeft(((List) (element)).getIndentationLeft() + indentationLeft);
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #125 <Method float List.getIndentationLeft()>
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field float indentationLeft>
	//   11   21:fadd            
	//   12   22:invokevirtual   #126 <Method void List.setIndentationLeft(float)>
			((List) (element)).setIndentationRight(indentationRight);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #67  <Field float indentationRight>
	//   16   30:invokevirtual   #127 <Method void List.setIndentationRight(float)>
			return super.add(element);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokespecial   #129 <Method boolean Phrase.add(Element)>
	//   20   38:ireturn         
		}
		if(element instanceof Image)
	//*  21   39:aload_1         
	//*  22   40:instanceof      #131 <Class Image>
	//*  23   43:ifeq            53
		{
			super.addSpecial(element);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #135 <Method void Phrase.addSpecial(Element)>
			return true;
	//   27   51:iconst_1        
	//   28   52:ireturn         
		} else
		{
			return super.add(element);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokespecial   #129 <Method boolean Phrase.add(Element)>
	//   32   58:ireturn         
		}
	}

	public volatile boolean add(Object obj)
	{
		return add((Element)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #138 <Class Element>
	//    3    5:invokevirtual   #139 <Method boolean add(Element)>
	//    4    8:ireturn         
	}

	public int getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int alignment>
	//    2    4:ireturn         
	}

	public float getExtraParagraphSpace()
	{
		return extraParagraphSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float extraParagraphSpace>
	//    2    4:freturn         
	}

	public float getFirstLineIndent()
	{
		return firstLineIndent;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float firstLineIndent>
	//    2    4:freturn         
	}

	public float getIndentationLeft()
	{
		return indentationLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float indentationLeft>
	//    2    4:freturn         
	}

	public float getIndentationRight()
	{
		return indentationRight;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float indentationRight>
	//    2    4:freturn         
	}

	public boolean getKeepTogether()
	{
		return keeptogether;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean keeptogether>
	//    2    4:ireturn         
	}

	public float getSpacingAfter()
	{
		return spacingAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field float spacingAfter>
	//    2    4:freturn         
	}

	public float getSpacingBefore()
	{
		return spacingBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float spacingBefore>
	//    2    4:freturn         
	}

	public void setAlignment(int i)
	{
		alignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int alignment>
	//    3    5:return          
	}

	public void setExtraParagraphSpace(float f)
	{
		extraParagraphSpace = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #31  <Field float extraParagraphSpace>
	//    3    5:return          
	}

	public void setFirstLineIndent(float f)
	{
		firstLineIndent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #29  <Field float firstLineIndent>
	//    3    5:return          
	}

	public void setIndentationLeft(float f)
	{
		indentationLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #62  <Field float indentationLeft>
	//    3    5:return          
	}

	public void setIndentationRight(float f)
	{
		indentationRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #67  <Field float indentationRight>
	//    3    5:return          
	}

	public void setKeepTogether(boolean flag)
	{
		keeptogether = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean keeptogether>
	//    3    5:return          
	}

	public void setSpacingAfter(float f)
	{
		spacingAfter = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #75  <Field float spacingAfter>
	//    3    5:return          
	}

	public void setSpacingBefore(float f)
	{
		spacingBefore = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float spacingBefore>
	//    3    5:return          
	}

	public float spacingAfter()
	{
		return spacingAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field float spacingAfter>
	//    2    4:freturn         
	}

	public float spacingBefore()
	{
		return getSpacingBefore();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method float getSpacingBefore()>
	//    2    4:freturn         
	}

	private static final long serialVersionUID = 0x3a4b501cL;
	protected int alignment;
	private float extraParagraphSpace;
	private float firstLineIndent;
	protected float indentationLeft;
	protected float indentationRight;
	protected boolean keeptogether;
	protected float spacingAfter;
	protected float spacingBefore;
}
