// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.factories.GreekAlphabetFactory;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			List, ListItem, Chunk, Font, 
//			FontFactory, Element

public class GreekList extends List
{

	public GreekList()
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #9   <Method void List(boolean)>
		setGreekFont();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #12  <Method void setGreekFont()>
	//    5    9:return          
	}

	public GreekList(int i)
	{
		super(true, i);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:i2f             
	//    4    4:invokespecial   #17  <Method void List(boolean, float)>
		setGreekFont();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #12  <Method void setGreekFont()>
	//    7   11:return          
	}

	public GreekList(boolean flag, int i)
	{
		super(true, i);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_2         
	//    3    3:i2f             
	//    4    4:invokespecial   #17  <Method void List(boolean, float)>
		lowercase = flag;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #22  <Field boolean lowercase>
		setGreekFont();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #12  <Method void setGreekFont()>
	//   10   16:return          
	}

	public boolean add(Element element)
	{
		if(element instanceof ListItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #26  <Class ListItem>
	//*   2    4:ifeq            108
		{
			element = ((Element) ((ListItem)element));
	//    3    7:aload_1         
	//    4    8:checkcast       #26  <Class ListItem>
	//    5   11:astore_1        
			Chunk chunk = new Chunk(preSymbol, symbol.getFont());
	//    6   12:new             #28  <Class Chunk>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field String preSymbol>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Chunk symbol>
	//   12   24:invokevirtual   #40  <Method Font Chunk.getFont()>
	//   13   27:invokespecial   #43  <Method void Chunk(String, Font)>
	//   14   30:astore_2        
			chunk.setAttributes(symbol.getAttributes());
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #36  <Field Chunk symbol>
	//   18   36:invokevirtual   #47  <Method java.util.HashMap Chunk.getAttributes()>
	//   19   39:invokevirtual   #51  <Method void Chunk.setAttributes(java.util.HashMap)>
			chunk.append(GreekAlphabetFactory.getString(first + list.size(), lowercase));
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:getfield        #55  <Field int first>
	//   23   47:aload_0         
	//   24   48:getfield        #59  <Field ArrayList list>
	//   25   51:invokevirtual   #65  <Method int ArrayList.size()>
	//   26   54:iadd            
	//   27   55:aload_0         
	//   28   56:getfield        #22  <Field boolean lowercase>
	//   29   59:invokestatic    #71  <Method String GreekAlphabetFactory.getString(int, boolean)>
	//   30   62:invokevirtual   #75  <Method StringBuffer Chunk.append(String)>
	//   31   65:pop             
			chunk.append(postSymbol);
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #78  <Field String postSymbol>
	//   35   71:invokevirtual   #75  <Method StringBuffer Chunk.append(String)>
	//   36   74:pop             
			((ListItem) (element)).setListSymbol(chunk);
	//   37   75:aload_1         
	//   38   76:aload_2         
	//   39   77:invokevirtual   #82  <Method void ListItem.setListSymbol(Chunk)>
			((ListItem) (element)).setIndentationLeft(symbolIndent, autoindent);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #86  <Field float symbolIndent>
	//   43   85:aload_0         
	//   44   86:getfield        #89  <Field boolean autoindent>
	//   45   89:invokevirtual   #93  <Method void ListItem.setIndentationLeft(float, boolean)>
			((ListItem) (element)).setIndentationRight(0.0F);
	//   46   92:aload_1         
	//   47   93:fconst_0        
	//   48   94:invokevirtual   #97  <Method void ListItem.setIndentationRight(float)>
			list.add(((Object) (element)));
	//   49   97:aload_0         
	//   50   98:getfield        #59  <Field ArrayList list>
	//   51  101:aload_1         
	//   52  102:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   53  105:pop             
		} else
	//*  54  106:iconst_0        
	//*  55  107:ireturn         
		if(element instanceof List)
	//*  56  108:aload_1         
	//*  57  109:instanceof      #4   <Class List>
	//*  58  112:ifeq            106
		{
			element = ((Element) ((List)element));
	//   59  115:aload_1         
	//   60  116:checkcast       #4   <Class List>
	//   61  119:astore_1        
			((List) (element)).setIndentationLeft(((List) (element)).getIndentationLeft() + symbolIndent);
	//   62  120:aload_1         
	//   63  121:aload_1         
	//   64  122:invokevirtual   #104 <Method float List.getIndentationLeft()>
	//   65  125:aload_0         
	//   66  126:getfield        #86  <Field float symbolIndent>
	//   67  129:fadd            
	//   68  130:invokevirtual   #106 <Method void List.setIndentationLeft(float)>
			first = first - 1;
	//   69  133:aload_0         
	//   70  134:aload_0         
	//   71  135:getfield        #55  <Field int first>
	//   72  138:iconst_1        
	//   73  139:isub            
	//   74  140:putfield        #55  <Field int first>
			return list.add(((Object) (element)));
	//   75  143:aload_0         
	//   76  144:getfield        #59  <Field ArrayList list>
	//   77  147:aload_1         
	//   78  148:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
	//   79  151:ireturn         
		}
		return false;
	}

	public List cloneShallow()
	{
		GreekList greeklist = new GreekList();
	//    0    0:new             #2   <Class GreekList>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void GreekList()>
	//    3    7:astore_1        
		populateProperties(((List) (greeklist)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #114 <Method void populateProperties(List)>
		return ((List) (greeklist));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	protected void setGreekFont()
	{
		float f = symbol.getFont().getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Chunk symbol>
	//    2    4:invokevirtual   #40  <Method Font Chunk.getFont()>
	//    3    7:invokevirtual   #119 <Method float Font.getSize()>
	//    4   10:fstore_1        
		symbol.setFont(FontFactory.getFont("Symbol", f, 0));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field Chunk symbol>
	//    7   15:ldc1            #121 <String "Symbol">
	//    8   17:fload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #126 <Method Font FontFactory.getFont(String, float, int)>
	//   11   22:invokevirtual   #130 <Method void Chunk.setFont(Font)>
	//   12   25:return          
	}
}
