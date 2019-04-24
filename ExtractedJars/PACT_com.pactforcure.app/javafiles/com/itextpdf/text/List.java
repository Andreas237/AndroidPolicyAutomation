// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.api.Indentable;
import com.itextpdf.text.factories.RomanAlphabetFactory;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.text:
//			TextElementArray, Chunk, ListItem, Element, 
//			AccessibleElementId, DocumentException, ElementListener

public class List
	implements TextElementArray, Indentable, IAccessibleElement
{

	public List()
	{
		this(false, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokespecial   #50  <Method void List(boolean, boolean)>
	//    4    6:return          
	}

	public List(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		list = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #56  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void ArrayList()>
	//    6   12:putfield        #59  <Field ArrayList list>
		numbered = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #61  <Field boolean numbered>
		lettered = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field boolean lettered>
		lowercase = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #65  <Field boolean lowercase>
		autoindent = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #67  <Field boolean autoindent>
		alignindent = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #69  <Field boolean alignindent>
		first = 1;
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:putfield        #71  <Field int first>
		symbol = new Chunk("- ");
	//   25   45:aload_0         
	//   26   46:new             #73  <Class Chunk>
	//   27   49:dup             
	//   28   50:ldc1            #75  <String "- ">
	//   29   52:invokespecial   #78  <Method void Chunk(String)>
	//   30   55:putfield        #80  <Field Chunk symbol>
		preSymbol = "";
	//   31   58:aload_0         
	//   32   59:ldc1            #82  <String "">
	//   33   61:putfield        #84  <Field String preSymbol>
		postSymbol = ". ";
	//   34   64:aload_0         
	//   35   65:ldc1            #86  <String ". ">
	//   36   67:putfield        #88  <Field String postSymbol>
		indentationLeft = 0.0F;
	//   37   70:aload_0         
	//   38   71:fconst_0        
	//   39   72:putfield        #90  <Field float indentationLeft>
		indentationRight = 0.0F;
	//   40   75:aload_0         
	//   41   76:fconst_0        
	//   42   77:putfield        #92  <Field float indentationRight>
		symbolIndent = 0.0F;
	//   43   80:aload_0         
	//   44   81:fconst_0        
	//   45   82:putfield        #94  <Field float symbolIndent>
		role = PdfName.L;
	//   46   85:aload_0         
	//   47   86:getstatic       #99  <Field PdfName PdfName.L>
	//   48   89:putfield        #101 <Field PdfName role>
		accessibleAttributes = null;
	//   49   92:aload_0         
	//   50   93:aconst_null     
	//   51   94:putfield        #103 <Field HashMap accessibleAttributes>
		id = null;
	//   52   97:aload_0         
	//   53   98:aconst_null     
	//   54   99:putfield        #105 <Field AccessibleElementId id>
		symbolIndent = f;
	//   55  102:aload_0         
	//   56  103:fload_1         
	//   57  104:putfield        #94  <Field float symbolIndent>
	//   58  107:return          
	}

	public List(boolean flag)
	{
		this(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #50  <Method void List(boolean, boolean)>
	//    4    6:return          
	}

	public List(boolean flag, float f)
	{
		this(flag, false, f);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:fload_2         
	//    4    4:invokespecial   #110 <Method void List(boolean, boolean, float)>
	//    5    7:return          
	}

	public List(boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		list = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #56  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void ArrayList()>
	//    6   12:putfield        #59  <Field ArrayList list>
		numbered = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #61  <Field boolean numbered>
		lettered = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field boolean lettered>
		lowercase = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #65  <Field boolean lowercase>
		autoindent = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #67  <Field boolean autoindent>
		alignindent = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #69  <Field boolean alignindent>
		first = 1;
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:putfield        #71  <Field int first>
		symbol = new Chunk("- ");
	//   25   45:aload_0         
	//   26   46:new             #73  <Class Chunk>
	//   27   49:dup             
	//   28   50:ldc1            #75  <String "- ">
	//   29   52:invokespecial   #78  <Method void Chunk(String)>
	//   30   55:putfield        #80  <Field Chunk symbol>
		preSymbol = "";
	//   31   58:aload_0         
	//   32   59:ldc1            #82  <String "">
	//   33   61:putfield        #84  <Field String preSymbol>
		postSymbol = ". ";
	//   34   64:aload_0         
	//   35   65:ldc1            #86  <String ". ">
	//   36   67:putfield        #88  <Field String postSymbol>
		indentationLeft = 0.0F;
	//   37   70:aload_0         
	//   38   71:fconst_0        
	//   39   72:putfield        #90  <Field float indentationLeft>
		indentationRight = 0.0F;
	//   40   75:aload_0         
	//   41   76:fconst_0        
	//   42   77:putfield        #92  <Field float indentationRight>
		symbolIndent = 0.0F;
	//   43   80:aload_0         
	//   44   81:fconst_0        
	//   45   82:putfield        #94  <Field float symbolIndent>
		role = PdfName.L;
	//   46   85:aload_0         
	//   47   86:getstatic       #99  <Field PdfName PdfName.L>
	//   48   89:putfield        #101 <Field PdfName role>
		accessibleAttributes = null;
	//   49   92:aload_0         
	//   50   93:aconst_null     
	//   51   94:putfield        #103 <Field HashMap accessibleAttributes>
		id = null;
	//   52   97:aload_0         
	//   53   98:aconst_null     
	//   54   99:putfield        #105 <Field AccessibleElementId id>
		numbered = flag;
	//   55  102:aload_0         
	//   56  103:iload_1         
	//   57  104:putfield        #61  <Field boolean numbered>
		lettered = flag1;
	//   58  107:aload_0         
	//   59  108:iload_2         
	//   60  109:putfield        #63  <Field boolean lettered>
		autoindent = true;
	//   61  112:aload_0         
	//   62  113:iconst_1        
	//   63  114:putfield        #67  <Field boolean autoindent>
		alignindent = true;
	//   64  117:aload_0         
	//   65  118:iconst_1        
	//   66  119:putfield        #69  <Field boolean alignindent>
	//   67  122:return          
	}

	public List(boolean flag, boolean flag1, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		list = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #56  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void ArrayList()>
	//    6   12:putfield        #59  <Field ArrayList list>
		numbered = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #61  <Field boolean numbered>
		lettered = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field boolean lettered>
		lowercase = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #65  <Field boolean lowercase>
		autoindent = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #67  <Field boolean autoindent>
		alignindent = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #69  <Field boolean alignindent>
		first = 1;
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:putfield        #71  <Field int first>
		symbol = new Chunk("- ");
	//   25   45:aload_0         
	//   26   46:new             #73  <Class Chunk>
	//   27   49:dup             
	//   28   50:ldc1            #75  <String "- ">
	//   29   52:invokespecial   #78  <Method void Chunk(String)>
	//   30   55:putfield        #80  <Field Chunk symbol>
		preSymbol = "";
	//   31   58:aload_0         
	//   32   59:ldc1            #82  <String "">
	//   33   61:putfield        #84  <Field String preSymbol>
		postSymbol = ". ";
	//   34   64:aload_0         
	//   35   65:ldc1            #86  <String ". ">
	//   36   67:putfield        #88  <Field String postSymbol>
		indentationLeft = 0.0F;
	//   37   70:aload_0         
	//   38   71:fconst_0        
	//   39   72:putfield        #90  <Field float indentationLeft>
		indentationRight = 0.0F;
	//   40   75:aload_0         
	//   41   76:fconst_0        
	//   42   77:putfield        #92  <Field float indentationRight>
		symbolIndent = 0.0F;
	//   43   80:aload_0         
	//   44   81:fconst_0        
	//   45   82:putfield        #94  <Field float symbolIndent>
		role = PdfName.L;
	//   46   85:aload_0         
	//   47   86:getstatic       #99  <Field PdfName PdfName.L>
	//   48   89:putfield        #101 <Field PdfName role>
		accessibleAttributes = null;
	//   49   92:aload_0         
	//   50   93:aconst_null     
	//   51   94:putfield        #103 <Field HashMap accessibleAttributes>
		id = null;
	//   52   97:aload_0         
	//   53   98:aconst_null     
	//   54   99:putfield        #105 <Field AccessibleElementId id>
		numbered = flag;
	//   55  102:aload_0         
	//   56  103:iload_1         
	//   57  104:putfield        #61  <Field boolean numbered>
		lettered = flag1;
	//   58  107:aload_0         
	//   59  108:iload_2         
	//   60  109:putfield        #63  <Field boolean lettered>
		symbolIndent = f;
	//   61  112:aload_0         
	//   62  113:fload_3         
	//   63  114:putfield        #94  <Field float symbolIndent>
	//   64  117:return          
	}

	public boolean add(Element element)
	{
		if(element instanceof ListItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #114 <Class ListItem>
	//*   2    4:ifeq            152
		{
			element = ((Element) ((ListItem)element));
	//    3    7:aload_1         
	//    4    8:checkcast       #114 <Class ListItem>
	//    5   11:astore_1        
			if(numbered || lettered)
	//*   6   12:aload_0         
	//*   7   13:getfield        #61  <Field boolean numbered>
	//*   8   16:ifne            26
	//*   9   19:aload_0         
	//*  10   20:getfield        #63  <Field boolean lettered>
	//*  11   23:ifeq            141
			{
				Chunk chunk = new Chunk(preSymbol, symbol.getFont());
	//   12   26:new             #73  <Class Chunk>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #84  <Field String preSymbol>
	//   16   34:aload_0         
	//   17   35:getfield        #80  <Field Chunk symbol>
	//   18   38:invokevirtual   #118 <Method Font Chunk.getFont()>
	//   19   41:invokespecial   #121 <Method void Chunk(String, Font)>
	//   20   44:astore_3        
				chunk.setAttributes(symbol.getAttributes());
	//   21   45:aload_3         
	//   22   46:aload_0         
	//   23   47:getfield        #80  <Field Chunk symbol>
	//   24   50:invokevirtual   #125 <Method HashMap Chunk.getAttributes()>
	//   25   53:invokevirtual   #129 <Method void Chunk.setAttributes(HashMap)>
				int i = first + list.size();
	//   26   56:aload_0         
	//   27   57:getfield        #71  <Field int first>
	//   28   60:aload_0         
	//   29   61:getfield        #59  <Field ArrayList list>
	//   30   64:invokevirtual   #133 <Method int ArrayList.size()>
	//   31   67:iadd            
	//   32   68:istore_2        
				if(lettered)
	//*  33   69:aload_0         
	//*  34   70:getfield        #63  <Field boolean lettered>
	//*  35   73:ifeq            129
					chunk.append(RomanAlphabetFactory.getString(i, lowercase));
	//   36   76:aload_3         
	//   37   77:iload_2         
	//   38   78:aload_0         
	//   39   79:getfield        #65  <Field boolean lowercase>
	//   40   82:invokestatic    #139 <Method String RomanAlphabetFactory.getString(int, boolean)>
	//   41   85:invokevirtual   #143 <Method StringBuffer Chunk.append(String)>
	//   42   88:pop             
				else
	//*  43   89:aload_3         
	//*  44   90:aload_0         
	//*  45   91:getfield        #88  <Field String postSymbol>
	//*  46   94:invokevirtual   #143 <Method StringBuffer Chunk.append(String)>
	//*  47   97:pop             
	//*  48   98:aload_1         
	//*  49   99:aload_3         
	//*  50  100:invokevirtual   #147 <Method void ListItem.setListSymbol(Chunk)>
	//*  51  103:aload_1         
	//*  52  104:aload_0         
	//*  53  105:getfield        #94  <Field float symbolIndent>
	//*  54  108:aload_0         
	//*  55  109:getfield        #67  <Field boolean autoindent>
	//*  56  112:invokevirtual   #151 <Method void ListItem.setIndentationLeft(float, boolean)>
	//*  57  115:aload_1         
	//*  58  116:fconst_0        
	//*  59  117:invokevirtual   #154 <Method void ListItem.setIndentationRight(float)>
	//*  60  120:aload_0         
	//*  61  121:getfield        #59  <Field ArrayList list>
	//*  62  124:aload_1         
	//*  63  125:invokevirtual   #157 <Method boolean ArrayList.add(Object)>
	//*  64  128:ireturn         
					chunk.append(String.valueOf(i));
	//   65  129:aload_3         
	//   66  130:iload_2         
	//   67  131:invokestatic    #163 <Method String String.valueOf(int)>
	//   68  134:invokevirtual   #143 <Method StringBuffer Chunk.append(String)>
	//   69  137:pop             
				chunk.append(postSymbol);
				((ListItem) (element)).setListSymbol(chunk);
			} else
	//*  70  138:goto            89
			{
				((ListItem) (element)).setListSymbol(symbol);
	//   71  141:aload_1         
	//   72  142:aload_0         
	//   73  143:getfield        #80  <Field Chunk symbol>
	//   74  146:invokevirtual   #147 <Method void ListItem.setListSymbol(Chunk)>
			}
			((ListItem) (element)).setIndentationLeft(symbolIndent, autoindent);
			((ListItem) (element)).setIndentationRight(0.0F);
			return list.add(((Object) (element)));
		}
	//*  75  149:goto            103
		if(element instanceof List)
	//*  76  152:aload_1         
	//*  77  153:instanceof      #2   <Class List>
	//*  78  156:ifeq            196
		{
			element = ((Element) ((List)element));
	//   79  159:aload_1         
	//   80  160:checkcast       #2   <Class List>
	//   81  163:astore_1        
			((List) (element)).setIndentationLeft(((List) (element)).getIndentationLeft() + symbolIndent);
	//   82  164:aload_1         
	//   83  165:aload_1         
	//   84  166:invokevirtual   #167 <Method float getIndentationLeft()>
	//   85  169:aload_0         
	//   86  170:getfield        #94  <Field float symbolIndent>
	//   87  173:fadd            
	//   88  174:invokevirtual   #169 <Method void setIndentationLeft(float)>
			first = first - 1;
	//   89  177:aload_0         
	//   90  178:aload_0         
	//   91  179:getfield        #71  <Field int first>
	//   92  182:iconst_1        
	//   93  183:isub            
	//   94  184:putfield        #71  <Field int first>
			return list.add(((Object) (element)));
	//   95  187:aload_0         
	//   96  188:getfield        #59  <Field ArrayList list>
	//   97  191:aload_1         
	//   98  192:invokevirtual   #157 <Method boolean ArrayList.add(Object)>
	//   99  195:ireturn         
		} else
		{
			return false;
	//  100  196:iconst_0        
	//  101  197:ireturn         
		}
	}

	public boolean add(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			return add(((Element) (new ListItem(s))));
	//    2    4:aload_0         
	//    3    5:new             #114 <Class ListItem>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #171 <Method void ListItem(String)>
	//    7   13:invokevirtual   #173 <Method boolean add(Element)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public List cloneShallow()
	{
		List list1 = new List();
	//    0    0:new             #2   <Class List>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void List()>
	//    3    7:astore_1        
		populateProperties(list1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #180 <Method void populateProperties(List)>
		return list1;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #188 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #190 <Class PdfObject>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return accessibleAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public java.util.List getChunks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #56  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = list.iterator(); iterator.hasNext(); ((java.util.List) (arraylist)).addAll(((java.util.Collection) (((Element)iterator.next()).getChunks()))));
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field ArrayList list>
	//    6   12:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
	//    8   16:aload_2         
	//    9   17:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            49
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #209 <Method Object Iterator.next()>
	//   14   32:checkcast       #211 <Class Element>
	//   15   35:invokeinterface #213 <Method java.util.List Element.getChunks()>
	//   16   40:invokeinterface #219 <Method boolean java.util.List.addAll(java.util.Collection)>
	//   17   45:pop             
	//*  18   46:goto            16
		return ((java.util.List) (arraylist));
	//   19   49:aload_1         
	//   20   50:areturn         
	}

	public int getFirst()
	{
		return first;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int first>
	//    2    4:ireturn         
	}

	public ListItem getFirstItem()
	{
		Element element;
		if(list.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList list>
	//*   2    4:invokevirtual   #133 <Method int ArrayList.size()>
	//*   3    7:ifle            38
			element = (Element)list.get(0);
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field ArrayList list>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #226 <Method Object ArrayList.get(int)>
	//    8   18:checkcast       #211 <Class Element>
	//    9   21:astore_1        
		else
	//*  10   22:aload_1         
	//*  11   23:ifnull          58
	//*  12   26:aload_1         
	//*  13   27:instanceof      #114 <Class ListItem>
	//*  14   30:ifeq            43
	//*  15   33:aload_1         
	//*  16   34:checkcast       #114 <Class ListItem>
	//*  17   37:areturn         
			element = null;
	//   18   38:aconst_null     
	//   19   39:astore_1        
		if(element != null)
		{
			if(element instanceof ListItem)
				return (ListItem)element;
	//*  20   40:goto            22
			if(element instanceof List)
	//*  21   43:aload_1         
	//*  22   44:instanceof      #2   <Class List>
	//*  23   47:ifeq            58
				return ((List)element).getFirstItem();
	//   24   50:aload_1         
	//   25   51:checkcast       #2   <Class List>
	//   26   54:invokevirtual   #228 <Method ListItem getFirstItem()>
	//   27   57:areturn         
		}
		return null;
	//   28   58:aconst_null     
	//   29   59:areturn         
	}

	public AccessibleElementId getId()
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field AccessibleElementId id>
	//*   2    4:ifnonnull       18
			id = new AccessibleElementId();
	//    3    7:aload_0         
	//    4    8:new             #232 <Class AccessibleElementId>
	//    5   11:dup             
	//    6   12:invokespecial   #233 <Method void AccessibleElementId()>
	//    7   15:putfield        #105 <Field AccessibleElementId id>
		return id;
	//    8   18:aload_0         
	//    9   19:getfield        #105 <Field AccessibleElementId id>
	//   10   22:areturn         
	}

	public float getIndentationLeft()
	{
		return indentationLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float indentationLeft>
	//    2    4:freturn         
	}

	public float getIndentationRight()
	{
		return indentationRight;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float indentationRight>
	//    2    4:freturn         
	}

	public ArrayList getItems()
	{
		return list;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList list>
	//    2    4:areturn         
	}

	public ListItem getLastItem()
	{
		Element element;
		if(list.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList list>
	//*   2    4:invokevirtual   #133 <Method int ArrayList.size()>
	//*   3    7:ifle            46
			element = (Element)list.get(list.size() - 1);
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field ArrayList list>
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field ArrayList list>
	//    8   18:invokevirtual   #133 <Method int ArrayList.size()>
	//    9   21:iconst_1        
	//   10   22:isub            
	//   11   23:invokevirtual   #226 <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #211 <Class Element>
	//   13   29:astore_1        
		else
	//*  14   30:aload_1         
	//*  15   31:ifnull          66
	//*  16   34:aload_1         
	//*  17   35:instanceof      #114 <Class ListItem>
	//*  18   38:ifeq            51
	//*  19   41:aload_1         
	//*  20   42:checkcast       #114 <Class ListItem>
	//*  21   45:areturn         
			element = null;
	//   22   46:aconst_null     
	//   23   47:astore_1        
		if(element != null)
		{
			if(element instanceof ListItem)
				return (ListItem)element;
	//*  24   48:goto            30
			if(element instanceof List)
	//*  25   51:aload_1         
	//*  26   52:instanceof      #2   <Class List>
	//*  27   55:ifeq            66
				return ((List)element).getLastItem();
	//   28   58:aload_1         
	//   29   59:checkcast       #2   <Class List>
	//   30   62:invokevirtual   #240 <Method ListItem getLastItem()>
	//   31   65:areturn         
		}
		return null;
	//   32   66:aconst_null     
	//   33   67:areturn         
	}

	public String getPostSymbol()
	{
		return postSymbol;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String postSymbol>
	//    2    4:areturn         
	}

	public String getPreSymbol()
	{
		return preSymbol;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String preSymbol>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field PdfName role>
	//    2    4:areturn         
	}

	public Chunk getSymbol()
	{
		return symbol;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Chunk symbol>
	//    2    4:areturn         
	}

	public float getSymbolIndent()
	{
		return symbolIndent;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float symbolIndent>
	//    2    4:freturn         
	}

	public float getTotalLeading()
	{
		if(list.size() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList list>
	//*   2    4:invokevirtual   #133 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:icmpge          14
			return -1F;
	//    5   11:ldc1            #250 <Float -1F>
	//    6   13:freturn         
		else
			return ((ListItem)list.get(0)).getTotalLeading();
	//    7   14:aload_0         
	//    8   15:getfield        #59  <Field ArrayList list>
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #226 <Method Object ArrayList.get(int)>
	//   11   22:checkcast       #114 <Class ListItem>
	//   12   25:invokevirtual   #252 <Method float ListItem.getTotalLeading()>
	//   13   28:freturn         
	}

	public boolean isAlignindent()
	{
		return alignindent;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean alignindent>
	//    2    4:ireturn         
	}

	public boolean isAutoindent()
	{
		return autoindent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean autoindent>
	//    2    4:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList list>
	//    2    4:invokevirtual   #258 <Method boolean ArrayList.isEmpty()>
	//    3    7:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLettered()
	{
		return lettered;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean lettered>
	//    2    4:ireturn         
	}

	public boolean isLowercase()
	{
		return lowercase;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean lowercase>
	//    2    4:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNumbered()
	{
		return numbered;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean numbered>
	//    2    4:ireturn         
	}

	public void normalizeIndentation()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		Iterator iterator = list.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field ArrayList list>
	//    4    6:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   10:aload_2         
	//    7   11:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            51
			Element element = (Element)iterator.next();
	//    9   19:aload_2         
	//   10   20:invokeinterface #209 <Method Object Iterator.next()>
	//   11   25:checkcast       #211 <Class Element>
	//   12   28:astore_3        
			if(element instanceof ListItem)
	//*  13   29:aload_3         
	//*  14   30:instanceof      #114 <Class ListItem>
	//*  15   33:ifeq            10
				f = Math.max(f, ((ListItem)element).getIndentationLeft());
	//   16   36:fload_1         
	//   17   37:aload_3         
	//   18   38:checkcast       #114 <Class ListItem>
	//   19   41:invokevirtual   #265 <Method float ListItem.getIndentationLeft()>
	//   20   44:invokestatic    #271 <Method float Math.max(float, float)>
	//   21   47:fstore_1        
		} while(true);
	//   22   48:goto            10
		iterator = list.iterator();
	//   23   51:aload_0         
	//   24   52:getfield        #59  <Field ArrayList list>
	//   25   55:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
	//   26   58:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   27   59:aload_2         
	//   28   60:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   29   65:ifeq            96
			Element element1 = (Element)iterator.next();
	//   30   68:aload_2         
	//   31   69:invokeinterface #209 <Method Object Iterator.next()>
	//   32   74:checkcast       #211 <Class Element>
	//   33   77:astore_3        
			if(element1 instanceof ListItem)
	//*  34   78:aload_3         
	//*  35   79:instanceof      #114 <Class ListItem>
	//*  36   82:ifeq            59
				((ListItem)element1).setIndentationLeft(f);
	//   37   85:aload_3         
	//   38   86:checkcast       #114 <Class ListItem>
	//   39   89:fload_1         
	//   40   90:invokevirtual   #272 <Method void ListItem.setIndentationLeft(float)>
		} while(true);
	//   41   93:goto            59
	//   42   96:return          
	}

	protected void populateProperties(List list1)
	{
		list1.indentationLeft = indentationLeft;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field float indentationLeft>
	//    3    5:putfield        #90  <Field float indentationLeft>
		list1.indentationRight = indentationRight;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #92  <Field float indentationRight>
	//    7   13:putfield        #92  <Field float indentationRight>
		list1.autoindent = autoindent;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field boolean autoindent>
	//   11   21:putfield        #67  <Field boolean autoindent>
		list1.alignindent = alignindent;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #69  <Field boolean alignindent>
	//   15   29:putfield        #69  <Field boolean alignindent>
		list1.symbolIndent = symbolIndent;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #94  <Field float symbolIndent>
	//   19   37:putfield        #94  <Field float symbolIndent>
		list1.symbol = symbol;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #80  <Field Chunk symbol>
	//   23   45:putfield        #80  <Field Chunk symbol>
	//   24   48:return          
	}

	public boolean process(ElementListener elementlistener)
	{
		try
		{
			for(Iterator iterator = list.iterator(); iterator.hasNext(); elementlistener.add((Element)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList list>
	//    2    4:invokevirtual   #199 <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
	//    4    8:aload_2         
	//    5    9:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            39
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #209 <Method Object Iterator.next()>
	//   10   24:checkcast       #211 <Class Element>
	//   11   27:invokeinterface #279 <Method boolean ElementListener.add(Element)>
	//   12   32:pop             
		}
	//*  13   33:goto            8
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*  14   36:astore_1        
		{
			return false;
	//   15   37:iconst_0        
	//   16   38:ireturn         
		}
		return true;
	//   17   39:iconst_1        
	//   18   40:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #184 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #282 <Method void HashMap()>
	//    7   15:putfield        #103 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #103 <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #286 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setAlignindent(boolean flag)
	{
		alignindent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean alignindent>
	//    3    5:return          
	}

	public void setAutoindent(boolean flag)
	{
		autoindent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean autoindent>
	//    3    5:return          
	}

	public void setFirst(int i)
	{
		first = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int first>
	//    3    5:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setIndentationLeft(float f)
	{
		indentationLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #90  <Field float indentationLeft>
	//    3    5:return          
	}

	public void setIndentationRight(float f)
	{
		indentationRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #92  <Field float indentationRight>
	//    3    5:return          
	}

	public void setLettered(boolean flag)
	{
		lettered = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean lettered>
	//    3    5:return          
	}

	public void setListSymbol(Chunk chunk)
	{
		symbol = chunk;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Chunk symbol>
	//    3    5:return          
	}

	public void setListSymbol(String s)
	{
		symbol = new Chunk(s);
	//    0    0:aload_0         
	//    1    1:new             #73  <Class Chunk>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #78  <Method void Chunk(String)>
	//    5    9:putfield        #80  <Field Chunk symbol>
	//    6   12:return          
	}

	public void setLowercase(boolean flag)
	{
		lowercase = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean lowercase>
	//    3    5:return          
	}

	public void setNumbered(boolean flag)
	{
		numbered = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean numbered>
	//    3    5:return          
	}

	public void setPostSymbol(String s)
	{
		postSymbol = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String postSymbol>
	//    3    5:return          
	}

	public void setPreSymbol(String s)
	{
		preSymbol = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String preSymbol>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field PdfName role>
	//    3    5:return          
	}

	public void setSymbolIndent(float f)
	{
		symbolIndent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #94  <Field float symbolIndent>
	//    3    5:return          
	}

	public int size()
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList list>
	//    2    4:invokevirtual   #133 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int type()
	{
		return 14;
	//    0    0:bipush          14
	//    1    2:ireturn         
	}

	public static final boolean ALPHABETICAL = true;
	public static final boolean LOWERCASE = true;
	public static final boolean NUMERICAL = false;
	public static final boolean ORDERED = true;
	public static final boolean UNORDERED = false;
	public static final boolean UPPERCASE = false;
	protected HashMap accessibleAttributes;
	protected boolean alignindent;
	protected boolean autoindent;
	protected int first;
	private AccessibleElementId id;
	protected float indentationLeft;
	protected float indentationRight;
	protected boolean lettered;
	protected ArrayList list;
	protected boolean lowercase;
	protected boolean numbered;
	protected String postSymbol;
	protected String preSymbol;
	protected PdfName role;
	protected Chunk symbol;
	protected float symbolIndent;
}
