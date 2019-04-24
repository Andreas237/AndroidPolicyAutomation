// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			DocListener, PageSize, AccessibleElementId, DocumentException, 
//			Element, ChapterAutoNumber, LargeElement, Meta, 
//			ExceptionConverter, Header, Version, Rectangle

public class Document
	implements DocListener, IAccessibleElement
{

	public Document()
	{
		this(PageSize.A4);
	//    0    0:aload_0         
	//    1    1:getstatic       #56  <Field Rectangle PageSize.A4>
	//    2    4:invokespecial   #59  <Method void Document(Rectangle)>
	//    3    7:return          
	}

	public Document(Rectangle rectangle)
	{
		this(rectangle, 36F, 36F, 36F, 36F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #60  <Float 36F>
	//    3    4:ldc1            #60  <Float 36F>
	//    4    6:ldc1            #60  <Float 36F>
	//    5    8:ldc1            #60  <Float 36F>
	//    6   10:invokespecial   #63  <Method void Document(Rectangle, float, float, float, float)>
	//    7   13:return          
	}

	public Document(Rectangle rectangle, float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		listeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #67  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void ArrayList()>
	//    6   12:putfield        #70  <Field ArrayList listeners>
		marginLeft = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #72  <Field float marginLeft>
		marginRight = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #74  <Field float marginRight>
		marginTop = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #76  <Field float marginTop>
		marginBottom = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #78  <Field float marginBottom>
		marginMirroring = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #80  <Field boolean marginMirroring>
		marginMirroringTopBottom = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #82  <Field boolean marginMirroringTopBottom>
		javaScript_onLoad = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #84  <Field String javaScript_onLoad>
		javaScript_onUnLoad = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #86  <Field String javaScript_onUnLoad>
		htmlStyleClass = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #88  <Field String htmlStyleClass>
		pageN = 0;
	//   34   60:aload_0         
	//   35   61:iconst_0        
	//   36   62:putfield        #90  <Field int pageN>
		chapternumber = 0;
	//   37   65:aload_0         
	//   38   66:iconst_0        
	//   39   67:putfield        #92  <Field int chapternumber>
		role = PdfName.DOCUMENT;
	//   40   70:aload_0         
	//   41   71:getstatic       #97  <Field PdfName PdfName.DOCUMENT>
	//   42   74:putfield        #99  <Field PdfName role>
		accessibleAttributes = null;
	//   43   77:aload_0         
	//   44   78:aconst_null     
	//   45   79:putfield        #101 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   46   82:aload_0         
	//   47   83:new             #103 <Class AccessibleElementId>
	//   48   86:dup             
	//   49   87:invokespecial   #104 <Method void AccessibleElementId()>
	//   50   90:putfield        #106 <Field AccessibleElementId id>
		pageSize = rectangle;
	//   51   93:aload_0         
	//   52   94:aload_1         
	//   53   95:putfield        #108 <Field Rectangle pageSize>
		marginLeft = f;
	//   54   98:aload_0         
	//   55   99:fload_2         
	//   56  100:putfield        #72  <Field float marginLeft>
		marginRight = f1;
	//   57  103:aload_0         
	//   58  104:fload_3         
	//   59  105:putfield        #74  <Field float marginRight>
		marginTop = f2;
	//   60  108:aload_0         
	//   61  109:fload           4
	//   62  111:putfield        #76  <Field float marginTop>
		marginBottom = f3;
	//   63  114:aload_0         
	//   64  115:fload           5
	//   65  117:putfield        #78  <Field float marginBottom>
	//   66  120:return          
	}

	public boolean add(Element element)
		throws DocumentException
	{
		if(close)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean close>
	//*   2    4:ifeq            24
			throw new DocumentException(MessageLocalization.getComposedMessage("the.document.has.been.closed.you.can.t.add.any.elements", new Object[0]));
	//    3    7:new             #112 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc1            #116 <String "the.document.has.been.closed.you.can.t.add.any.elements">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #122 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #125 <Method void DocumentException(String)>
	//   10   23:athrow          
		if(!open && element.isContent())
	//*  11   24:aload_0         
	//*  12   25:getfield        #127 <Field boolean open>
	//*  13   28:ifne            57
	//*  14   31:aload_1         
	//*  15   32:invokeinterface #133 <Method boolean Element.isContent()>
	//*  16   37:ifeq            57
			throw new DocumentException(MessageLocalization.getComposedMessage("the.document.is.not.open.yet.you.can.only.add.meta.information", new Object[0]));
	//   17   40:new             #112 <Class DocumentException>
	//   18   43:dup             
	//   19   44:ldc1            #135 <String "the.document.is.not.open.yet.you.can.only.add.meta.information">
	//   20   46:iconst_0        
	//   21   47:anewarray       Object[]
	//   22   50:invokestatic    #122 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   53:invokespecial   #125 <Method void DocumentException(String)>
	//   24   56:athrow          
		boolean flag = false;
	//   25   57:iconst_0        
	//   26   58:istore_2        
		if(element instanceof ChapterAutoNumber)
	//*  27   59:aload_1         
	//*  28   60:instanceof      #137 <Class ChapterAutoNumber>
	//*  29   63:ifeq            81
			chapternumber = ((ChapterAutoNumber)element).setAutomaticNumber(chapternumber);
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:checkcast       #137 <Class ChapterAutoNumber>
	//   33   71:aload_0         
	//   34   72:getfield        #92  <Field int chapternumber>
	//   35   75:invokevirtual   #141 <Method int ChapterAutoNumber.setAutomaticNumber(int)>
	//   36   78:putfield        #92  <Field int chapternumber>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext();)
	//*  37   81:aload_0         
	//*  38   82:getfield        #70  <Field ArrayList listeners>
	//*  39   85:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//*  40   88:astore_3        
	//*  41   89:aload_3         
	//*  42   90:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  43   95:ifeq            119
			flag |= ((DocListener)iterator.next()).add(element);
	//   44   98:iload_2         
	//   45   99:aload_3         
	//   46  100:invokeinterface #154 <Method Object Iterator.next()>
	//   47  105:checkcast       #6   <Class DocListener>
	//   48  108:aload_1         
	//   49  109:invokeinterface #156 <Method boolean DocListener.add(Element)>
	//   50  114:ior             
	//   51  115:istore_2        

	//*  52  116:goto            89
		if(element instanceof LargeElement)
	//*  53  119:aload_1         
	//*  54  120:instanceof      #158 <Class LargeElement>
	//*  55  123:ifeq            146
		{
			element = ((Element) ((LargeElement)element));
	//   56  126:aload_1         
	//   57  127:checkcast       #158 <Class LargeElement>
	//   58  130:astore_1        
			if(!((LargeElement) (element)).isComplete())
	//*  59  131:aload_1         
	//*  60  132:invokeinterface #161 <Method boolean LargeElement.isComplete()>
	//*  61  137:ifne            146
				((LargeElement) (element)).flushContent();
	//   62  140:aload_1         
	//   63  141:invokeinterface #164 <Method void LargeElement.flushContent()>
		}
		return flag;
	//   64  146:iload_2         
	//   65  147:ireturn         
	}

	public boolean addAuthor(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(4, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:iconst_4        
	//    4    6:aload_1         
	//    5    7:invokespecial   #172 <Method void Meta(int, String)>
	//    6   10:invokevirtual   #173 <Method boolean add(Element)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   17:new             #175 <Class ExceptionConverter>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   25:athrow          
		}
		return flag;
	}

	public boolean addCreationDate()
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(6, (new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy")).format(new Date())))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:bipush          6
	//    4    7:new             #181 <Class SimpleDateFormat>
	//    5   10:dup             
	//    6   11:ldc1            #183 <String "EEE MMM dd HH:mm:ss zzz yyyy">
	//    7   13:invokespecial   #184 <Method void SimpleDateFormat(String)>
	//    8   16:new             #186 <Class Date>
	//    9   19:dup             
	//   10   20:invokespecial   #187 <Method void Date()>
	//   11   23:invokevirtual   #191 <Method String SimpleDateFormat.format(Date)>
	//   12   26:invokespecial   #172 <Method void Meta(int, String)>
	//   13   29:invokevirtual   #173 <Method boolean add(Element)>
	//   14   32:istore_1        
		}
	//*  15   33:iload_1         
	//*  16   34:ireturn         
		catch(DocumentException documentexception)
	//*  17   35:astore_2        
		{
			throw new ExceptionConverter(((Exception) (documentexception)));
	//   18   36:new             #175 <Class ExceptionConverter>
	//   19   39:dup             
	//   20   40:aload_2         
	//   21   41:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   22   44:athrow          
		}
		return flag;
	}

	public boolean addCreator(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(7, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:bipush          7
	//    4    7:aload_1         
	//    5    8:invokespecial   #172 <Method void Meta(int, String)>
	//    6   11:invokevirtual   #173 <Method boolean add(Element)>
	//    7   14:istore_2        
		}
	//*   8   15:iload_2         
	//*   9   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   17:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   18:new             #175 <Class ExceptionConverter>
	//   12   21:dup             
	//   13   22:aload_1         
	//   14   23:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   26:athrow          
		}
		return flag;
	}

	public void addDocListener(DocListener doclistener)
	{
		listeners.add(((Object) (doclistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ArrayList listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #197 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		if(doclistener instanceof IAccessibleElement)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #8   <Class IAccessibleElement>
	//*   7   13:ifeq            101
		{
			doclistener = ((DocListener) ((IAccessibleElement)doclistener));
	//    8   16:aload_1         
	//    9   17:checkcast       #8   <Class IAccessibleElement>
	//   10   20:astore_1        
			((IAccessibleElement) (doclistener)).setRole(role);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #99  <Field PdfName role>
	//   14   26:invokeinterface #201 <Method void IAccessibleElement.setRole(PdfName)>
			((IAccessibleElement) (doclistener)).setId(id);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #106 <Field AccessibleElementId id>
	//   18   36:invokeinterface #205 <Method void IAccessibleElement.setId(AccessibleElementId)>
			if(accessibleAttributes != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #101 <Field HashMap accessibleAttributes>
	//*  21   45:ifnull          101
			{
				PdfName pdfname;
				for(Iterator iterator = accessibleAttributes.keySet().iterator(); iterator.hasNext(); ((IAccessibleElement) (doclistener)).setAccessibleAttribute(pdfname, (PdfObject)accessibleAttributes.get(((Object) (pdfname)))))
	//*  22   48:aload_0         
	//*  23   49:getfield        #101 <Field HashMap accessibleAttributes>
	//*  24   52:invokevirtual   #211 <Method Set HashMap.keySet()>
	//*  25   55:invokeinterface #214 <Method Iterator Set.iterator()>
	//*  26   60:astore_2        
	//*  27   61:aload_2         
	//*  28   62:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  29   67:ifeq            101
					pdfname = (PdfName)iterator.next();
	//   30   70:aload_2         
	//   31   71:invokeinterface #154 <Method Object Iterator.next()>
	//   32   76:checkcast       #94  <Class PdfName>
	//   33   79:astore_3        

	//   34   80:aload_1         
	//   35   81:aload_3         
	//   36   82:aload_0         
	//   37   83:getfield        #101 <Field HashMap accessibleAttributes>
	//   38   86:aload_3         
	//   39   87:invokevirtual   #218 <Method Object HashMap.get(Object)>
	//   40   90:checkcast       #220 <Class PdfObject>
	//   41   93:invokeinterface #224 <Method void IAccessibleElement.setAccessibleAttribute(PdfName, PdfObject)>
			}
		}
	//*  42   98:goto            61
	//   43  101:return          
	}

	public boolean addHeader(String s, String s1)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Header(s, s1))));
	//    0    0:aload_0         
	//    1    1:new             #228 <Class Header>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #231 <Method void Header(String, String)>
	//    6   10:invokevirtual   #173 <Method boolean add(Element)>
	//    7   13:istore_3        
		}
	//*   8   14:iload_3         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   17:new             #175 <Class ExceptionConverter>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   25:athrow          
		}
		return flag;
	}

	public boolean addKeywords(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(3, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:iconst_3        
	//    4    6:aload_1         
	//    5    7:invokespecial   #172 <Method void Meta(int, String)>
	//    6   10:invokevirtual   #173 <Method boolean add(Element)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   17:new             #175 <Class ExceptionConverter>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   25:athrow          
		}
		return flag;
	}

	public boolean addLanguage(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(8, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aload_1         
	//    5    8:invokespecial   #172 <Method void Meta(int, String)>
	//    6   11:invokevirtual   #173 <Method boolean add(Element)>
	//    7   14:istore_2        
		}
	//*   8   15:iload_2         
	//*   9   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   17:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   18:new             #175 <Class ExceptionConverter>
	//   12   21:dup             
	//   13   22:aload_1         
	//   14   23:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   26:athrow          
		}
		return flag;
	}

	public boolean addProducer()
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(5, Version.getInstance().getVersion()))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:iconst_5        
	//    4    6:invokestatic    #240 <Method Version Version.getInstance()>
	//    5    9:invokevirtual   #244 <Method String Version.getVersion()>
	//    6   12:invokespecial   #172 <Method void Meta(int, String)>
	//    7   15:invokevirtual   #173 <Method boolean add(Element)>
	//    8   18:istore_1        
		}
	//*   9   19:iload_1         
	//*  10   20:ireturn         
		catch(DocumentException documentexception)
	//*  11   21:astore_2        
		{
			throw new ExceptionConverter(((Exception) (documentexception)));
	//   12   22:new             #175 <Class ExceptionConverter>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   16   30:athrow          
		}
		return flag;
	}

	public boolean addSubject(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(2, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:aload_1         
	//    5    7:invokespecial   #172 <Method void Meta(int, String)>
	//    6   10:invokevirtual   #173 <Method boolean add(Element)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   17:new             #175 <Class ExceptionConverter>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   25:athrow          
		}
		return flag;
	}

	public boolean addTitle(String s)
	{
		boolean flag;
		try
		{
			flag = add(((Element) (new Meta(1, s))));
	//    0    0:aload_0         
	//    1    1:new             #169 <Class Meta>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:aload_1         
	//    5    7:invokespecial   #172 <Method void Meta(int, String)>
	//    6   10:invokevirtual   #173 <Method boolean add(Element)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   11   17:new             #175 <Class ExceptionConverter>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:invokespecial   #178 <Method void ExceptionConverter(Exception)>
	//   15   25:athrow          
		}
		return flag;
	}

	public float bottom()
	{
		return pageSize.getBottom(marginBottom);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field float marginBottom>
	//    4    8:invokevirtual   #254 <Method float Rectangle.getBottom(float)>
	//    5   11:freturn         
	}

	public float bottom(float f)
	{
		return pageSize.getBottom(marginBottom + f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field float marginBottom>
	//    4    8:fload_1         
	//    5    9:fadd            
	//    6   10:invokevirtual   #254 <Method float Rectangle.getBottom(float)>
	//    7   13:freturn         
	}

	public float bottomMargin()
	{
		return marginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field float marginBottom>
	//    2    4:freturn         
	}

	public void close()
	{
		if(!close)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean close>
	//*   2    4:ifne            17
		{
			open = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #127 <Field boolean open>
			close = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #114 <Field boolean close>
		}
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).close());
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field ArrayList listeners>
	//   11   21:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//   12   24:astore_1        
	//   13   25:aload_1         
	//   14   26:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            51
	//   16   34:aload_1         
	//   17   35:invokeinterface #154 <Method Object Iterator.next()>
	//   18   40:checkcast       #6   <Class DocListener>
	//   19   43:invokeinterface #257 <Method void DocListener.close()>
	//*  20   48:goto            25
	//   21   51:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #218 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #220 <Class PdfObject>
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
	//    1    1:getfield        #101 <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public String getHtmlStyleClass()
	{
		return htmlStyleClass;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String htmlStyleClass>
	//    2    4:areturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public String getJavaScript_onLoad()
	{
		return javaScript_onLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String javaScript_onLoad>
	//    2    4:areturn         
	}

	public String getJavaScript_onUnLoad()
	{
		return javaScript_onUnLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String javaScript_onUnLoad>
	//    2    4:areturn         
	}

	public int getPageNumber()
	{
		return pageN;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int pageN>
	//    2    4:ireturn         
	}

	public Rectangle getPageSize()
	{
		return pageSize;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field PdfName role>
	//    2    4:areturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isMarginMirroring()
	{
		return marginMirroring;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean marginMirroring>
	//    2    4:ireturn         
	}

	public boolean isOpen()
	{
		return open;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean open>
	//    2    4:ireturn         
	}

	public float left()
	{
		return pageSize.getLeft(marginLeft);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field float marginLeft>
	//    4    8:invokevirtual   #281 <Method float Rectangle.getLeft(float)>
	//    5   11:freturn         
	}

	public float left(float f)
	{
		return pageSize.getLeft(marginLeft + f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field float marginLeft>
	//    4    8:fload_1         
	//    5    9:fadd            
	//    6   10:invokevirtual   #281 <Method float Rectangle.getLeft(float)>
	//    7   13:freturn         
	}

	public float leftMargin()
	{
		return marginLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field float marginLeft>
	//    2    4:freturn         
	}

	public boolean newPage()
	{
		if(!open || close)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean open>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #114 <Field boolean close>
	//*   5   11:ifeq            16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).newPage());
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field ArrayList listeners>
	//   10   20:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//   11   23:astore_1        
	//   12   24:aload_1         
	//   13   25:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            51
	//   15   33:aload_1         
	//   16   34:invokeinterface #154 <Method Object Iterator.next()>
	//   17   39:checkcast       #6   <Class DocListener>
	//   18   42:invokeinterface #285 <Method boolean DocListener.newPage()>
	//   19   47:pop             
	//*  20   48:goto            24
		return true;
	//   21   51:iconst_1        
	//   22   52:ireturn         
	}

	public void open()
	{
		if(!close)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean close>
	//*   2    4:ifne            12
			open = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #127 <Field boolean open>
		DocListener doclistener;
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); doclistener.open())
	//*   6   12:aload_0         
	//*   7   13:getfield        #70  <Field ArrayList listeners>
	//*   8   16:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//*   9   19:astore_1        
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            82
		{
			doclistener = (DocListener)iterator.next();
	//   13   29:aload_1         
	//   14   30:invokeinterface #154 <Method Object Iterator.next()>
	//   15   35:checkcast       #6   <Class DocListener>
	//   16   38:astore_2        
			doclistener.setPageSize(pageSize);
	//   17   39:aload_2         
	//   18   40:aload_0         
	//   19   41:getfield        #108 <Field Rectangle pageSize>
	//   20   44:invokeinterface #289 <Method boolean DocListener.setPageSize(Rectangle)>
	//   21   49:pop             
			doclistener.setMargins(marginLeft, marginRight, marginTop, marginBottom);
	//   22   50:aload_2         
	//   23   51:aload_0         
	//   24   52:getfield        #72  <Field float marginLeft>
	//   25   55:aload_0         
	//   26   56:getfield        #74  <Field float marginRight>
	//   27   59:aload_0         
	//   28   60:getfield        #76  <Field float marginTop>
	//   29   63:aload_0         
	//   30   64:getfield        #78  <Field float marginBottom>
	//   31   67:invokeinterface #293 <Method boolean DocListener.setMargins(float, float, float, float)>
	//   32   72:pop             
		}

	//   33   73:aload_2         
	//   34   74:invokeinterface #295 <Method void DocListener.open()>
	//*  35   79:goto            20
	//   36   82:return          
	}

	public void removeDocListener(DocListener doclistener)
	{
		listeners.remove(((Object) (doclistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ArrayList listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void resetPageCount()
	{
		pageN = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #90  <Field int pageN>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).resetPageCount());
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList listeners>
	//    5    9:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_1        
	//    7   13:aload_1         
	//    8   14:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            39
	//   10   22:aload_1         
	//   11   23:invokeinterface #154 <Method Object Iterator.next()>
	//   12   28:checkcast       #6   <Class DocListener>
	//   13   31:invokeinterface #302 <Method void DocListener.resetPageCount()>
	//*  14   36:goto            13
	//   15   39:return          
	}

	public float right()
	{
		return pageSize.getRight(marginRight);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field float marginRight>
	//    4    8:invokevirtual   #306 <Method float Rectangle.getRight(float)>
	//    5   11:freturn         
	}

	public float right(float f)
	{
		return pageSize.getRight(marginRight + f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field float marginRight>
	//    4    8:fload_1         
	//    5    9:fadd            
	//    6   10:invokevirtual   #306 <Method float Rectangle.getRight(float)>
	//    7   13:freturn         
	}

	public float rightMargin()
	{
		return marginRight;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field float marginRight>
	//    2    4:freturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #207 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #308 <Method void HashMap()>
	//    7   15:putfield        #101 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #101 <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #312 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setHtmlStyleClass(String s)
	{
		htmlStyleClass = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String htmlStyleClass>
	//    3    5:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setJavaScript_onLoad(String s)
	{
		javaScript_onLoad = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String javaScript_onLoad>
	//    3    5:return          
	}

	public void setJavaScript_onUnLoad(String s)
	{
		javaScript_onUnLoad = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String javaScript_onUnLoad>
	//    3    5:return          
	}

	public boolean setMarginMirroring(boolean flag)
	{
		marginMirroring = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean marginMirroring>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).setMarginMirroring(flag));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList listeners>
	//    5    9:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_2         
	//   11   23:invokeinterface #154 <Method Object Iterator.next()>
	//   12   28:checkcast       #6   <Class DocListener>
	//   13   31:iload_1         
	//   14   32:invokeinterface #319 <Method boolean DocListener.setMarginMirroring(boolean)>
	//   15   37:pop             
	//*  16   38:goto            13
		return true;
	//   17   41:iconst_1        
	//   18   42:ireturn         
	}

	public boolean setMarginMirroringTopBottom(boolean flag)
	{
		marginMirroringTopBottom = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean marginMirroringTopBottom>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).setMarginMirroringTopBottom(flag));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList listeners>
	//    5    9:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_2         
	//   11   23:invokeinterface #154 <Method Object Iterator.next()>
	//   12   28:checkcast       #6   <Class DocListener>
	//   13   31:iload_1         
	//   14   32:invokeinterface #322 <Method boolean DocListener.setMarginMirroringTopBottom(boolean)>
	//   15   37:pop             
	//*  16   38:goto            13
		return true;
	//   17   41:iconst_1        
	//   18   42:ireturn         
	}

	public boolean setMargins(float f, float f1, float f2, float f3)
	{
		marginLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #72  <Field float marginLeft>
		marginRight = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #74  <Field float marginRight>
		marginTop = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #76  <Field float marginTop>
		marginBottom = f3;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #78  <Field float marginBottom>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).setMargins(f, f1, f2, f3));
	//   12   21:aload_0         
	//   13   22:getfield        #70  <Field ArrayList listeners>
	//   14   25:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//   15   28:astore          5
	//   16   30:aload           5
	//   17   32:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   18   37:ifeq            64
	//   19   40:aload           5
	//   20   42:invokeinterface #154 <Method Object Iterator.next()>
	//   21   47:checkcast       #6   <Class DocListener>
	//   22   50:fload_1         
	//   23   51:fload_2         
	//   24   52:fload_3         
	//   25   53:fload           4
	//   26   55:invokeinterface #293 <Method boolean DocListener.setMargins(float, float, float, float)>
	//   27   60:pop             
	//*  28   61:goto            30
		return true;
	//   29   64:iconst_1        
	//   30   65:ireturn         
	}

	public void setPageCount(int i)
	{
		pageN = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field int pageN>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).setPageCount(i));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList listeners>
	//    5    9:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            40
	//   10   22:aload_2         
	//   11   23:invokeinterface #154 <Method Object Iterator.next()>
	//   12   28:checkcast       #6   <Class DocListener>
	//   13   31:iload_1         
	//   14   32:invokeinterface #326 <Method void DocListener.setPageCount(int)>
	//*  15   37:goto            13
	//   16   40:return          
	}

	public boolean setPageSize(Rectangle rectangle)
	{
		pageSize = rectangle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field Rectangle pageSize>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((DocListener)iterator.next()).setPageSize(rectangle));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field ArrayList listeners>
	//    5    9:invokevirtual   #145 <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_2         
	//   11   23:invokeinterface #154 <Method Object Iterator.next()>
	//   12   28:checkcast       #6   <Class DocListener>
	//   13   31:aload_1         
	//   14   32:invokeinterface #289 <Method boolean DocListener.setPageSize(Rectangle)>
	//   15   37:pop             
	//*  16   38:goto            13
		return true;
	//   17   41:iconst_1        
	//   18   42:ireturn         
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field PdfName role>
	//    3    5:return          
	}

	public float top()
	{
		return pageSize.getTop(marginTop);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field float marginTop>
	//    4    8:invokevirtual   #330 <Method float Rectangle.getTop(float)>
	//    5   11:freturn         
	}

	public float top(float f)
	{
		return pageSize.getTop(marginTop + f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Rectangle pageSize>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field float marginTop>
	//    4    8:fload_1         
	//    5    9:fadd            
	//    6   10:invokevirtual   #330 <Method float Rectangle.getTop(float)>
	//    7   13:freturn         
	}

	public float topMargin()
	{
		return marginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field float marginTop>
	//    2    4:freturn         
	}

	public static boolean compress = true;
	public static boolean plainRandomAccess = false;
	public static float wmfFontCorrection = 0.86F;
	protected HashMap accessibleAttributes;
	protected int chapternumber;
	protected boolean close;
	protected String htmlStyleClass;
	protected AccessibleElementId id;
	protected String javaScript_onLoad;
	protected String javaScript_onUnLoad;
	protected ArrayList listeners;
	protected float marginBottom;
	protected float marginLeft;
	protected boolean marginMirroring;
	protected boolean marginMirroringTopBottom;
	protected float marginRight;
	protected float marginTop;
	protected boolean open;
	protected int pageN;
	protected Rectangle pageSize;
	protected PdfName role;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:putstatic       #44  <Field boolean compress>
	//    2    4:iconst_0        
	//    3    5:putstatic       #46  <Field boolean plainRandomAccess>
	//    4    8:ldc1            #47  <Float 0.86F>
	//    5   10:putstatic       #49  <Field float wmfFontCorrection>
	//*   6   13:return          
	}
}
