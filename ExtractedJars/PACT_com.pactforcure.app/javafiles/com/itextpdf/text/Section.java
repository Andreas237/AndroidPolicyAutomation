// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.api.Indentable;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			TextElementArray, LargeElement, Paragraph, Chunk, 
//			Element, MarkedSection, MarkedObject, DocumentException, 
//			ElementListener, AccessibleElementId

public class Section extends ArrayList
	implements TextElementArray, LargeElement, Indentable, IAccessibleElement
{

	protected Section()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void ArrayList()>
		numberStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #48  <Field int numberStyle>
		bookmarkOpen = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #50  <Field boolean bookmarkOpen>
		triggerNewPage = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #52  <Field boolean triggerNewPage>
		subsections = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #54  <Field int subsections>
		numbers = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #56  <Field ArrayList numbers>
		complete = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #58  <Field boolean complete>
		addedCompletely = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #60  <Field boolean addedCompletely>
		notAddedYet = true;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #62  <Field boolean notAddedYet>
		title = new Paragraph();
	//   26   44:aload_0         
	//   27   45:new             #64  <Class Paragraph>
	//   28   48:dup             
	//   29   49:invokespecial   #65  <Method void Paragraph()>
	//   30   52:putfield        #67  <Field Paragraph title>
		numberDepth = 1;
	//   31   55:aload_0         
	//   32   56:iconst_1        
	//   33   57:putfield        #69  <Field int numberDepth>
		title.setRole(new PdfName((new StringBuilder()).append("H").append(numberDepth).toString()));
	//   34   60:aload_0         
	//   35   61:getfield        #67  <Field Paragraph title>
	//   36   64:new             #71  <Class PdfName>
	//   37   67:dup             
	//   38   68:new             #73  <Class StringBuilder>
	//   39   71:dup             
	//   40   72:invokespecial   #74  <Method void StringBuilder()>
	//   41   75:ldc1            #76  <String "H">
	//   42   77:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   43   80:aload_0         
	//   44   81:getfield        #69  <Field int numberDepth>
	//   45   84:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   46   87:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47   90:invokespecial   #90  <Method void PdfName(String)>
	//   48   93:invokevirtual   #94  <Method void Paragraph.setRole(PdfName)>
	//   49   96:return          
	}

	protected Section(Paragraph paragraph, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void ArrayList()>
		numberStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #48  <Field int numberStyle>
		bookmarkOpen = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #50  <Field boolean bookmarkOpen>
		triggerNewPage = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #52  <Field boolean triggerNewPage>
		subsections = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #54  <Field int subsections>
		numbers = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #56  <Field ArrayList numbers>
		complete = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #58  <Field boolean complete>
		addedCompletely = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #60  <Field boolean addedCompletely>
		notAddedYet = true;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #62  <Field boolean notAddedYet>
		numberDepth = i;
	//   26   44:aload_0         
	//   27   45:iload_2         
	//   28   46:putfield        #69  <Field int numberDepth>
		title = paragraph;
	//   29   49:aload_0         
	//   30   50:aload_1         
	//   31   51:putfield        #67  <Field Paragraph title>
		if(paragraph != null)
	//*  32   54:aload_1         
	//*  33   55:ifnull          88
			paragraph.setRole(new PdfName((new StringBuilder()).append("H").append(i).toString()));
	//   34   58:aload_1         
	//   35   59:new             #71  <Class PdfName>
	//   36   62:dup             
	//   37   63:new             #73  <Class StringBuilder>
	//   38   66:dup             
	//   39   67:invokespecial   #74  <Method void StringBuilder()>
	//   40   70:ldc1            #76  <String "H">
	//   41   72:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   42   75:iload_2         
	//   43   76:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   44   79:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   45   82:invokespecial   #90  <Method void PdfName(String)>
	//   46   85:invokevirtual   #94  <Method void Paragraph.setRole(PdfName)>
	//   47   88:return          
	}

	public static Paragraph constructTitle(Paragraph paragraph, ArrayList arraylist, int i, int j)
	{
		Paragraph paragraph1;
		if(paragraph == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
		{
			paragraph1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
		} else
	//*   4    7:aload           5
	//*   5    9:areturn         
		{
			int k = Math.min(arraylist.size(), i);
	//    6   10:aload_1         
	//    7   11:invokevirtual   #102 <Method int ArrayList.size()>
	//    8   14:iload_2         
	//    9   15:invokestatic    #108 <Method int Math.min(int, int)>
	//   10   18:istore          4
			paragraph1 = paragraph;
	//   11   20:aload_0         
	//   12   21:astore          5
			if(k >= 1)
	//*  13   23:iload           4
	//*  14   25:iconst_1        
	//*  15   26:icmplt          7
			{
				StringBuffer stringbuffer = new StringBuffer(" ");
	//   16   29:new             #110 <Class StringBuffer>
	//   17   32:dup             
	//   18   33:ldc1            #112 <String " ">
	//   19   35:invokespecial   #113 <Method void StringBuffer(String)>
	//   20   38:astore          5
				for(i = 0; i < k; i++)
	//*  21   40:iconst_0        
	//*  22   41:istore_2        
	//*  23   42:iload_2         
	//*  24   43:iload           4
	//*  25   45:icmpge          82
				{
					stringbuffer.insert(0, ".");
	//   26   48:aload           5
	//   27   50:iconst_0        
	//   28   51:ldc1            #115 <String ".">
	//   29   53:invokevirtual   #119 <Method StringBuffer StringBuffer.insert(int, String)>
	//   30   56:pop             
					stringbuffer.insert(0, ((Integer)arraylist.get(i)).intValue());
	//   31   57:aload           5
	//   32   59:iconst_0        
	//   33   60:aload_1         
	//   34   61:iload_2         
	//   35   62:invokevirtual   #123 <Method Object ArrayList.get(int)>
	//   36   65:checkcast       #125 <Class Integer>
	//   37   68:invokevirtual   #128 <Method int Integer.intValue()>
	//   38   71:invokevirtual   #131 <Method StringBuffer StringBuffer.insert(int, int)>
	//   39   74:pop             
				}

	//   40   75:iload_2         
	//   41   76:iconst_1        
	//   42   77:iadd            
	//   43   78:istore_2        
	//*  44   79:goto            42
				if(j == 1)
	//*  45   82:iload_3         
	//*  46   83:iconst_1        
	//*  47   84:icmpne          100
					stringbuffer.deleteCharAt(stringbuffer.length() - 2);
	//   48   87:aload           5
	//   49   89:aload           5
	//   50   91:invokevirtual   #134 <Method int StringBuffer.length()>
	//   51   94:iconst_2        
	//   52   95:isub            
	//   53   96:invokevirtual   #138 <Method StringBuffer StringBuffer.deleteCharAt(int)>
	//   54   99:pop             
				arraylist = ((ArrayList) (new Paragraph(((Phrase) (paragraph)))));
	//   55  100:new             #64  <Class Paragraph>
	//   56  103:dup             
	//   57  104:aload_0         
	//   58  105:invokespecial   #141 <Method void Paragraph(Phrase)>
	//   59  108:astore_1        
				((Paragraph) (arraylist)).add(0, ((Element) (new Chunk(stringbuffer.toString(), paragraph.getFont()))));
	//   60  109:aload_1         
	//   61  110:iconst_0        
	//   62  111:new             #143 <Class Chunk>
	//   63  114:dup             
	//   64  115:aload           5
	//   65  117:invokevirtual   #144 <Method String StringBuffer.toString()>
	//   66  120:aload_0         
	//   67  121:invokevirtual   #148 <Method Font Paragraph.getFont()>
	//   68  124:invokespecial   #151 <Method void Chunk(String, Font)>
	//   69  127:invokevirtual   #155 <Method void Paragraph.add(int, Element)>
				return ((Paragraph) (arraylist));
	//   70  130:aload_1         
	//   71  131:areturn         
			}
		}
		return paragraph1;
	}

	private void setNumbers(int i, ArrayList arraylist)
	{
		numbers = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #5   <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #46  <Method void ArrayList()>
	//    4    8:putfield        #56  <Field ArrayList numbers>
		numbers.add(((Object) (Integer.valueOf(i))));
	//    5   11:aload_0         
	//    6   12:getfield        #56  <Field ArrayList numbers>
	//    7   15:iload_1         
	//    8   16:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//    9   19:invokevirtual   #166 <Method boolean ArrayList.add(Object)>
	//   10   22:pop             
		numbers.addAll(((Collection) (arraylist)));
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field ArrayList numbers>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #170 <Method boolean ArrayList.addAll(Collection)>
	//   15   31:pop             
	//   16   32:return          
	}

	public void add(int i, Element element)
	{
		if(isAddedCompletely())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #177 <Method boolean isAddedCompletely()>
	//*   2    4:ifeq            24
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.largeelement.has.already.been.added.to.the.document", new Object[0]));
	//    3    7:new             #179 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #181 <String "this.largeelement.has.already.been.added.to.the.document">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #190 <Method void IllegalStateException(String)>
	//   10   23:athrow          
		try
		{
			if(element.isNestable())
	//*  11   24:aload_2         
	//*  12   25:invokeinterface #195 <Method boolean Element.isNestable()>
	//*  13   30:ifeq            40
			{
				super.add(i, ((Object) (element)));
	//   14   33:aload_0         
	//   15   34:iload_1         
	//   16   35:aload_2         
	//   17   36:invokespecial   #198 <Method void ArrayList.add(int, Object)>
				return;
	//   18   39:return          
			}
		}
	//*  19   40:new             #173 <Class ClassCastException>
	//*  20   43:dup             
	//*  21   44:ldc1            #200 <String "you.can.t.add.a.1.to.a.section">
	//*  22   46:iconst_1        
	//*  23   47:anewarray       Object[]
	//*  24   50:dup             
	//*  25   51:iconst_0        
	//*  26   52:aload_2         
	//*  27   53:invokevirtual   #204 <Method Class Object.getClass()>
	//*  28   56:invokevirtual   #209 <Method String Class.getName()>
	//*  29   59:aastore         
	//*  30   60:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  31   63:invokespecial   #210 <Method void ClassCastException(String)>
	//*  32   66:athrow          
		// Misplaced declaration of an exception variable
		catch(Element element)
	//*  33   67:astore_2        
		{
			throw new ClassCastException(MessageLocalization.getComposedMessage("insertion.of.illegal.element.1", new Object[] {
				((ClassCastException) (element)).getMessage()
			}));
	//   34   68:new             #173 <Class ClassCastException>
	//   35   71:dup             
	//   36   72:ldc1            #212 <String "insertion.of.illegal.element.1">
	//   37   74:iconst_1        
	//   38   75:anewarray       Object[]
	//   39   78:dup             
	//   40   79:iconst_0        
	//   41   80:aload_2         
	//   42   81:invokevirtual   #215 <Method String ClassCastException.getMessage()>
	//   43   84:aastore         
	//   44   85:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   45   88:invokespecial   #210 <Method void ClassCastException(String)>
	//   46   91:athrow          
		}
		throw new ClassCastException(MessageLocalization.getComposedMessage("you.can.t.add.a.1.to.a.section", new Object[] {
			((Object) (element)).getClass().getName()
		}));
	}

	public volatile void add(int i, Object obj)
	{
		add(i, (Element)obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #192 <Class Element>
	//    4    6:invokevirtual   #216 <Method void add(int, Element)>
	//    5    9:return          
	}

	public boolean add(Element element)
	{
		if(isAddedCompletely())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #177 <Method boolean isAddedCompletely()>
	//*   2    4:ifeq            24
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.largeelement.has.already.been.added.to.the.document", new Object[0]));
	//    3    7:new             #179 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #181 <String "this.largeelement.has.already.been.added.to.the.document">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #190 <Method void IllegalStateException(String)>
	//   10   23:athrow          
		try
		{
			if(element.type() == 13)
	//*  11   24:aload_1         
	//*  12   25:invokeinterface #220 <Method int Element.type()>
	//*  13   30:bipush          13
	//*  14   32:icmpne          67
			{
				element = ((Element) ((Section)element));
	//   15   35:aload_1         
	//   16   36:checkcast       #2   <Class Section>
	//   17   39:astore_1        
				int i = subsections + 1;
	//   18   40:aload_0         
	//   19   41:getfield        #54  <Field int subsections>
	//   20   44:iconst_1        
	//   21   45:iadd            
	//   22   46:istore_2        
				subsections = i;
	//   23   47:aload_0         
	//   24   48:iload_2         
	//   25   49:putfield        #54  <Field int subsections>
				((Section) (element)).setNumbers(i, numbers);
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #56  <Field ArrayList numbers>
	//   30   58:invokespecial   #222 <Method void setNumbers(int, ArrayList)>
				return super.add(((Object) (element)));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokespecial   #166 <Method boolean ArrayList.add(Object)>
	//   34   66:ireturn         
			}
			if((element instanceof MarkedSection) && ((MarkedObject)element).element.type() == 13)
	//*  35   67:aload_1         
	//*  36   68:instanceof      #224 <Class MarkedSection>
	//*  37   71:ifeq            131
	//*  38   74:aload_1         
	//*  39   75:checkcast       #226 <Class MarkedObject>
	//*  40   78:getfield        #230 <Field Element MarkedObject.element>
	//*  41   81:invokeinterface #220 <Method int Element.type()>
	//*  42   86:bipush          13
	//*  43   88:icmpne          131
			{
				element = ((Element) ((MarkedSection)element));
	//   44   91:aload_1         
	//   45   92:checkcast       #224 <Class MarkedSection>
	//   46   95:astore_1        
				Section section = (Section)((MarkedSection) (element)).element;
	//   47   96:aload_1         
	//   48   97:getfield        #231 <Field Element MarkedSection.element>
	//   49  100:checkcast       #2   <Class Section>
	//   50  103:astore_3        
				int j = subsections + 1;
	//   51  104:aload_0         
	//   52  105:getfield        #54  <Field int subsections>
	//   53  108:iconst_1        
	//   54  109:iadd            
	//   55  110:istore_2        
				subsections = j;
	//   56  111:aload_0         
	//   57  112:iload_2         
	//   58  113:putfield        #54  <Field int subsections>
				section.setNumbers(j, numbers);
	//   59  116:aload_3         
	//   60  117:iload_2         
	//   61  118:aload_0         
	//   62  119:getfield        #56  <Field ArrayList numbers>
	//   63  122:invokespecial   #222 <Method void setNumbers(int, ArrayList)>
				return super.add(((Object) (element)));
	//   64  125:aload_0         
	//   65  126:aload_1         
	//   66  127:invokespecial   #166 <Method boolean ArrayList.add(Object)>
	//   67  130:ireturn         
			}
			if(element.isNestable())
	//*  68  131:aload_1         
	//*  69  132:invokeinterface #195 <Method boolean Element.isNestable()>
	//*  70  137:ifeq            146
				return super.add(((Object) (element)));
	//   71  140:aload_0         
	//   72  141:aload_1         
	//   73  142:invokespecial   #166 <Method boolean ArrayList.add(Object)>
	//   74  145:ireturn         
			else
				throw new ClassCastException(MessageLocalization.getComposedMessage("you.can.t.add.a.1.to.a.section", new Object[] {
					((Object) (element)).getClass().getName()
				}));
	//   75  146:new             #173 <Class ClassCastException>
	//   76  149:dup             
	//   77  150:ldc1            #200 <String "you.can.t.add.a.1.to.a.section">
	//   78  152:iconst_1        
	//   79  153:anewarray       Object[]
	//   80  156:dup             
	//   81  157:iconst_0        
	//   82  158:aload_1         
	//   83  159:invokevirtual   #204 <Method Class Object.getClass()>
	//   84  162:invokevirtual   #209 <Method String Class.getName()>
	//   85  165:aastore         
	//   86  166:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   87  169:invokespecial   #210 <Method void ClassCastException(String)>
	//   88  172:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Element element)
	//*  89  173:astore_1        
		{
			throw new ClassCastException(MessageLocalization.getComposedMessage("insertion.of.illegal.element.1", new Object[] {
				((ClassCastException) (element)).getMessage()
			}));
	//   90  174:new             #173 <Class ClassCastException>
	//   91  177:dup             
	//   92  178:ldc1            #212 <String "insertion.of.illegal.element.1">
	//   93  180:iconst_1        
	//   94  181:anewarray       Object[]
	//   95  184:dup             
	//   96  185:iconst_0        
	//   97  186:aload_1         
	//   98  187:invokevirtual   #215 <Method String ClassCastException.getMessage()>
	//   99  190:aastore         
	//  100  191:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  101  194:invokespecial   #210 <Method void ClassCastException(String)>
	//  102  197:athrow          
		}
	}

	public volatile boolean add(Object obj)
	{
		return add((Element)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #192 <Class Element>
	//    3    5:invokevirtual   #233 <Method boolean add(Element)>
	//    4    8:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #236 <Method int Collection.size()>
	//*   2    6:ifne            11
			return false;
	//    3    9:iconst_0        
	//    4   10:ireturn         
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); add((Element)((Iterator) (collection)).next()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #240 <Method Iterator Collection.iterator()>
	//    7   17:astore_1        
	//    8   18:aload_1         
	//    9   19:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:invokeinterface #249 <Method Object Iterator.next()>
	//   14   34:checkcast       #192 <Class Element>
	//   15   37:invokevirtual   #233 <Method boolean add(Element)>
	//   16   40:pop             
	//*  17   41:goto            18
		return true;
	//   18   44:iconst_1        
	//   19   45:ireturn         
	}

	protected MarkedSection addMarkedSection()
	{
		MarkedSection markedsection = new MarkedSection(new Section(((Paragraph) (null)), numberDepth + 1));
	//    0    0:new             #224 <Class MarkedSection>
	//    1    3:dup             
	//    2    4:new             #2   <Class Section>
	//    3    7:dup             
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field int numberDepth>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:invokespecial   #254 <Method void Section(Paragraph, int)>
	//   10   18:invokespecial   #257 <Method void MarkedSection(Section)>
	//   11   21:astore_1        
		add(((Element) (markedsection)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #233 <Method boolean add(Element)>
	//   15   27:pop             
		return markedsection;
	//   16   28:aload_1         
	//   17   29:areturn         
	}

	public Section addSection(float f, Paragraph paragraph)
	{
		return addSection(f, paragraph, numberDepth + 1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #69  <Field int numberDepth>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:invokevirtual   #262 <Method Section addSection(float, Paragraph, int)>
	//    8   12:areturn         
	}

	public Section addSection(float f, Paragraph paragraph, int i)
	{
		if(isAddedCompletely())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #177 <Method boolean isAddedCompletely()>
	//*   2    4:ifeq            24
		{
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.largeelement.has.already.been.added.to.the.document", new Object[0]));
	//    3    7:new             #179 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #181 <String "this.largeelement.has.already.been.added.to.the.document">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #189 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #190 <Method void IllegalStateException(String)>
	//   10   23:athrow          
		} else
		{
			paragraph = ((Paragraph) (new Section(paragraph, i)));
	//   11   24:new             #2   <Class Section>
	//   12   27:dup             
	//   13   28:aload_2         
	//   14   29:iload_3         
	//   15   30:invokespecial   #254 <Method void Section(Paragraph, int)>
	//   16   33:astore_2        
			((Section) (paragraph)).setIndentation(f);
	//   17   34:aload_2         
	//   18   35:fload_1         
	//   19   36:invokevirtual   #266 <Method void setIndentation(float)>
			add(((Element) (paragraph)));
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #233 <Method boolean add(Element)>
	//   23   44:pop             
			return ((Section) (paragraph));
	//   24   45:aload_2         
	//   25   46:areturn         
		}
	}

	public Section addSection(float f, String s)
	{
		return addSection(f, new Paragraph(s));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:new             #64  <Class Paragraph>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #268 <Method void Paragraph(String)>
	//    6   10:invokevirtual   #270 <Method Section addSection(float, Paragraph)>
	//    7   13:areturn         
	}

	public Section addSection(float f, String s, int i)
	{
		return addSection(f, new Paragraph(s), i);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:new             #64  <Class Paragraph>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #268 <Method void Paragraph(String)>
	//    6   10:iload_3         
	//    7   11:invokevirtual   #262 <Method Section addSection(float, Paragraph, int)>
	//    8   14:areturn         
	}

	public Section addSection(Paragraph paragraph)
	{
		return addSection(0.0F, paragraph, numberDepth + 1);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #69  <Field int numberDepth>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:invokevirtual   #262 <Method Section addSection(float, Paragraph, int)>
	//    8   12:areturn         
	}

	public Section addSection(Paragraph paragraph, int i)
	{
		return addSection(0.0F, paragraph, i);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #262 <Method Section addSection(float, Paragraph, int)>
	//    5    7:areturn         
	}

	public Section addSection(String s)
	{
		return addSection(new Paragraph(s));
	//    0    0:aload_0         
	//    1    1:new             #64  <Class Paragraph>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #268 <Method void Paragraph(String)>
	//    5    9:invokevirtual   #276 <Method Section addSection(Paragraph)>
	//    6   12:areturn         
	}

	public Section addSection(String s, int i)
	{
		return addSection(new Paragraph(s), i);
	//    0    0:aload_0         
	//    1    1:new             #64  <Class Paragraph>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #268 <Method void Paragraph(String)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #279 <Method Section addSection(Paragraph, int)>
	//    7   13:areturn         
	}

	public void flushContent()
	{
		setNotAddedYet(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #284 <Method void setNotAddedYet(boolean)>
		title = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #67  <Field Paragraph title>
		Iterator iterator = iterator();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #285 <Method Iterator iterator()>
	//    8   14:astore_1        
		do
		{
label0:
			{
				Object obj;
label1:
				{
					if(iterator.hasNext())
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//*  11   21:ifeq            65
					{
						obj = ((Object) ((Element)iterator.next()));
	//   12   24:aload_1         
	//   13   25:invokeinterface #249 <Method Object Iterator.next()>
	//   14   30:checkcast       #192 <Class Element>
	//   15   33:astore_2        
						if(!(obj instanceof Section))
							break label0;
	//   16   34:aload_2         
	//   17   35:instanceof      #2   <Class Section>
	//   18   38:ifeq            71
						obj = ((Object) ((Section)obj));
	//   19   41:aload_2         
	//   20   42:checkcast       #2   <Class Section>
	//   21   45:astore_2        
						if(((Section) (obj)).isComplete() || size() != 1)
							break label1;
	//   22   46:aload_2         
	//   23   47:invokevirtual   #288 <Method boolean isComplete()>
	//   24   50:ifne            66
	//   25   53:aload_0         
	//   26   54:invokevirtual   #289 <Method int size()>
	//   27   57:iconst_1        
	//   28   58:icmpne          66
						((Section) (obj)).flushContent();
	//   29   61:aload_2         
	//   30   62:invokevirtual   #291 <Method void flushContent()>
					}
					return;
	//   31   65:return          
				}
				((Section) (obj)).setAddedCompletely(true);
	//   32   66:aload_2         
	//   33   67:iconst_1        
	//   34   68:invokevirtual   #294 <Method void setAddedCompletely(boolean)>
			}
			iterator.remove();
	//   35   71:aload_1         
	//   36   72:invokeinterface #297 <Method void Iterator.remove()>
		} while(true);
	//   37   77:goto            15
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		return title.getAccessibleAttribute(pdfname);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #301 <Method PdfObject Paragraph.getAccessibleAttribute(PdfName)>
	//    4    8:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return title.getAccessibleAttributes();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:invokevirtual   #305 <Method HashMap Paragraph.getAccessibleAttributes()>
	//    3    7:areturn         
	}

	public Paragraph getBookmarkTitle()
	{
		if(bookmarkTitle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field String bookmarkTitle>
	//*   2    4:ifnonnull       12
			return getTitle();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #313 <Method Paragraph getTitle()>
	//    5   11:areturn         
		else
			return new Paragraph(bookmarkTitle);
	//    6   12:new             #64  <Class Paragraph>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #310 <Field String bookmarkTitle>
	//   10   20:invokespecial   #268 <Method void Paragraph(String)>
	//   11   23:areturn         
	}

	public List getChunks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #5   <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = iterator(); iterator.hasNext(); ((List) (arraylist)).addAll(((Collection) (((Element)iterator.next()).getChunks()))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #285 <Method Iterator iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            46
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokeinterface #249 <Method Object Iterator.next()>
	//   13   29:checkcast       #192 <Class Element>
	//   14   32:invokeinterface #317 <Method List Element.getChunks()>
	//   15   37:invokeinterface #320 <Method boolean List.addAll(Collection)>
	//   16   42:pop             
	//*  17   43:goto            13
		return ((List) (arraylist));
	//   18   46:aload_1         
	//   19   47:areturn         
	}

	public int getDepth()
	{
		return numbers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ArrayList numbers>
	//    2    4:invokevirtual   #102 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public AccessibleElementId getId()
	{
		return title.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:invokevirtual   #326 <Method AccessibleElementId Paragraph.getId()>
	//    3    7:areturn         
	}

	public float getIndentation()
	{
		return indentation;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field float indentation>
	//    2    4:freturn         
	}

	public float getIndentationLeft()
	{
		return indentationLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field float indentationLeft>
	//    2    4:freturn         
	}

	public float getIndentationRight()
	{
		return indentationRight;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field float indentationRight>
	//    2    4:freturn         
	}

	public int getNumberDepth()
	{
		return numberDepth;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int numberDepth>
	//    2    4:ireturn         
	}

	public int getNumberStyle()
	{
		return numberStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int numberStyle>
	//    2    4:ireturn         
	}

	public PdfName getRole()
	{
		return title.getRole();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:invokevirtual   #342 <Method PdfName Paragraph.getRole()>
	//    3    7:areturn         
	}

	public Paragraph getTitle()
	{
		return constructTitle(title, numbers, numberDepth, numberStyle);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ArrayList numbers>
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field int numberDepth>
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field int numberStyle>
	//    8   16:invokestatic    #344 <Method Paragraph constructTitle(Paragraph, ArrayList, int, int)>
	//    9   19:areturn         
	}

	protected boolean isAddedCompletely()
	{
		return addedCompletely;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean addedCompletely>
	//    2    4:ireturn         
	}

	public boolean isBookmarkOpen()
	{
		return bookmarkOpen;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean bookmarkOpen>
	//    2    4:ireturn         
	}

	public boolean isChapter()
	{
		return type() == 16;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #347 <Method int type()>
	//    2    4:bipush          16
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isComplete()
	{
		return complete;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean complete>
	//    2    4:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNotAddedYet()
	{
		return notAddedYet;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean notAddedYet>
	//    2    4:ireturn         
	}

	public boolean isSection()
	{
		return type() == 13;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #347 <Method int type()>
	//    2    4:bipush          13
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isTriggerNewPage()
	{
		return triggerNewPage && notAddedYet;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean triggerNewPage>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field boolean notAddedYet>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void newPage()
	{
		add(((Element) (Chunk.NEXTPAGE)));
	//    0    0:aload_0         
	//    1    1:getstatic       #357 <Field Chunk Chunk.NEXTPAGE>
	//    2    4:invokevirtual   #233 <Method boolean add(Element)>
	//    3    7:pop             
	//    4    8:return          
	}

	public boolean process(ElementListener elementlistener)
	{
		try
		{
			for(Iterator iterator = iterator(); iterator.hasNext(); elementlistener.add((Element)iterator.next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method Iterator iterator()>
	//    2    4:astore_2        
	//    3    5:aload_2         
	//    4    6:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            36
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokeinterface #249 <Method Object Iterator.next()>
	//    9   21:checkcast       #192 <Class Element>
	//   10   24:invokeinterface #364 <Method boolean ElementListener.add(Element)>
	//   11   29:pop             
		}
	//*  12   30:goto            5
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*  13   33:astore_1        
		{
			return false;
	//   14   34:iconst_0        
	//   15   35:ireturn         
		}
		return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		title.setAccessibleAttribute(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #368 <Method void Paragraph.setAccessibleAttribute(PdfName, PdfObject)>
	//    5    9:return          
	}

	protected void setAddedCompletely(boolean flag)
	{
		addedCompletely = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean addedCompletely>
	//    3    5:return          
	}

	public void setBookmarkOpen(boolean flag)
	{
		bookmarkOpen = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean bookmarkOpen>
	//    3    5:return          
	}

	public void setBookmarkTitle(String s)
	{
		bookmarkTitle = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #310 <Field String bookmarkTitle>
	//    3    5:return          
	}

	public void setChapterNumber(int i)
	{
		numbers.set(numbers.size() - 1, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ArrayList numbers>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ArrayList numbers>
	//    4    8:invokevirtual   #102 <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:iload_1         
	//    8   14:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//    9   17:invokevirtual   #376 <Method Object ArrayList.set(int, Object)>
	//   10   20:pop             
		Iterator iterator = iterator();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #285 <Method Iterator iterator()>
	//   13   25:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   26:aload_2         
	//   15   27:invokeinterface #245 <Method boolean Iterator.hasNext()>
	//   16   32:ifeq            60
			Object obj = iterator.next();
	//   17   35:aload_2         
	//   18   36:invokeinterface #249 <Method Object Iterator.next()>
	//   19   41:astore_3        
			if(obj instanceof Section)
	//*  20   42:aload_3         
	//*  21   43:instanceof      #2   <Class Section>
	//*  22   46:ifeq            26
				((Section)obj).setChapterNumber(i);
	//   23   49:aload_3         
	//   24   50:checkcast       #2   <Class Section>
	//   25   53:iload_1         
	//   26   54:invokevirtual   #378 <Method void setChapterNumber(int)>
		} while(true);
	//   27   57:goto            26
	//   28   60:return          
	}

	public void setComplete(boolean flag)
	{
		complete = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean complete>
	//    3    5:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		title.setId(accessibleelementid);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #383 <Method void Paragraph.setId(AccessibleElementId)>
	//    4    8:return          
	}

	public void setIndentation(float f)
	{
		indentation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #330 <Field float indentation>
	//    3    5:return          
	}

	public void setIndentationLeft(float f)
	{
		indentationLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #333 <Field float indentationLeft>
	//    3    5:return          
	}

	public void setIndentationRight(float f)
	{
		indentationRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #336 <Field float indentationRight>
	//    3    5:return          
	}

	public void setNotAddedYet(boolean flag)
	{
		notAddedYet = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean notAddedYet>
	//    3    5:return          
	}

	public void setNumberDepth(int i)
	{
		numberDepth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int numberDepth>
	//    3    5:return          
	}

	public void setNumberStyle(int i)
	{
		numberStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int numberStyle>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		title.setRole(pdfname);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Paragraph title>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method void Paragraph.setRole(PdfName)>
	//    4    8:return          
	}

	public void setTitle(Paragraph paragraph)
	{
		title = paragraph;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Paragraph title>
	//    3    5:return          
	}

	public void setTriggerNewPage(boolean flag)
	{
		triggerNewPage = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean triggerNewPage>
	//    3    5:return          
	}

	public int type()
	{
		return 13;
	//    0    0:bipush          13
	//    1    2:ireturn         
	}

	public static final int NUMBERSTYLE_DOTTED = 0;
	public static final int NUMBERSTYLE_DOTTED_WITHOUT_FINAL_DOT = 1;
	private static final long serialVersionUID = 0xd8a63c0bL;
	protected boolean addedCompletely;
	protected boolean bookmarkOpen;
	protected String bookmarkTitle;
	protected boolean complete;
	protected float indentation;
	protected float indentationLeft;
	protected float indentationRight;
	protected boolean notAddedYet;
	protected int numberDepth;
	protected int numberStyle;
	protected ArrayList numbers;
	protected int subsections;
	protected Paragraph title;
	protected boolean triggerNewPage;
}
