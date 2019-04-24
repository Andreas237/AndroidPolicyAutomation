// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.text.Element;
import com.itextpdf.text.ElementListener;
import com.itextpdf.tool.xml.exceptions.NotImplementedException;
import com.itextpdf.tool.xml.html.pdfelement.HtmlCell;
import java.util.*;

public class TableRowElement
	implements Element
{
	public static final class Place extends Enum
	{

		public static Place valueOf(String s)
		{
			return (Place)Enum.valueOf(com/itextpdf/tool/xml/html/table/TableRowElement$Place, s);
		//    0    0:ldc1            #2   <Class TableRowElement$Place>
		//    1    2:aload_0         
		//    2    3:invokestatic    #62  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class TableRowElement$Place>
		//    4    9:areturn         
		}

		public static Place[] values()
		{
			return (Place[])((Place []) ($VALUES)).clone();
		//    0    0:getstatic       #48  <Field TableRowElement$Place[] $VALUES>
		//    1    3:invokevirtual   #69  <Method Object _5B_Lcom.itextpdf.tool.xml.html.table.TableRowElement$Place_3B_.clone()>
		//    2    6:checkcast       #65  <Class TableRowElement$Place[]>
		//    3    9:areturn         
		}

		public Integer getNormal()
		{
			return normal;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field Integer normal>
		//    2    4:areturn         
		}

		public Integer getRepeated()
		{
			return repeated;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Integer repeated>
		//    2    4:areturn         
		}

		private static final Place $VALUES[];
		public static final Place BODY;
		public static final Place CAPTION_BOTTOM;
		public static final Place CAPTION_TOP;
		public static final Place FOOTER;
		public static final Place HEADER;
		private Integer normal;
		private Integer repeated;

		static 
		{
			CAPTION_TOP = new Place("CAPTION_TOP", 0, Integer.valueOf(-2), Integer.valueOf(-2));
		//    0    0:new             #2   <Class TableRowElement$Place>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "CAPTION_TOP">
		//    3    6:iconst_0        
		//    4    7:bipush          -2
		//    5    9:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    6   12:bipush          -2
		//    7   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    8   17:invokespecial   #32  <Method void TableRowElement$Place(String, int, Integer, Integer)>
		//    9   20:putstatic       #34  <Field TableRowElement$Place CAPTION_TOP>
			HEADER = new Place("HEADER", 1, Integer.valueOf(-1), Integer.valueOf(-1));
		//   10   23:new             #2   <Class TableRowElement$Place>
		//   11   26:dup             
		//   12   27:ldc1            #35  <String "HEADER">
		//   13   29:iconst_1        
		//   14   30:iconst_m1       
		//   15   31:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   16   34:iconst_m1       
		//   17   35:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   18   38:invokespecial   #32  <Method void TableRowElement$Place(String, int, Integer, Integer)>
		//   19   41:putstatic       #37  <Field TableRowElement$Place HEADER>
			BODY = new Place("BODY", 2, Integer.valueOf(0), Integer.valueOf(1));
		//   20   44:new             #2   <Class TableRowElement$Place>
		//   21   47:dup             
		//   22   48:ldc1            #38  <String "BODY">
		//   23   50:iconst_2        
		//   24   51:iconst_0        
		//   25   52:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   26   55:iconst_1        
		//   27   56:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   28   59:invokespecial   #32  <Method void TableRowElement$Place(String, int, Integer, Integer)>
		//   29   62:putstatic       #40  <Field TableRowElement$Place BODY>
			FOOTER = new Place("FOOTER", 3, Integer.valueOf(1), Integer.valueOf(0));
		//   30   65:new             #2   <Class TableRowElement$Place>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "FOOTER">
		//   33   71:iconst_3        
		//   34   72:iconst_1        
		//   35   73:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   36   76:iconst_0        
		//   37   77:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   38   80:invokespecial   #32  <Method void TableRowElement$Place(String, int, Integer, Integer)>
		//   39   83:putstatic       #43  <Field TableRowElement$Place FOOTER>
			CAPTION_BOTTOM = new Place("CAPTION_BOTTOM", 4, Integer.valueOf(2), Integer.valueOf(2));
		//   40   86:new             #2   <Class TableRowElement$Place>
		//   41   89:dup             
		//   42   90:ldc1            #44  <String "CAPTION_BOTTOM">
		//   43   92:iconst_4        
		//   44   93:iconst_2        
		//   45   94:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   46   97:iconst_2        
		//   47   98:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   48  101:invokespecial   #32  <Method void TableRowElement$Place(String, int, Integer, Integer)>
		//   49  104:putstatic       #46  <Field TableRowElement$Place CAPTION_BOTTOM>
			$VALUES = (new Place[] {
				CAPTION_TOP, HEADER, BODY, FOOTER, CAPTION_BOTTOM
			});
		//   50  107:iconst_5        
		//   51  108:anewarray       Place[]
		//   52  111:dup             
		//   53  112:iconst_0        
		//   54  113:getstatic       #34  <Field TableRowElement$Place CAPTION_TOP>
		//   55  116:aastore         
		//   56  117:dup             
		//   57  118:iconst_1        
		//   58  119:getstatic       #37  <Field TableRowElement$Place HEADER>
		//   59  122:aastore         
		//   60  123:dup             
		//   61  124:iconst_2        
		//   62  125:getstatic       #40  <Field TableRowElement$Place BODY>
		//   63  128:aastore         
		//   64  129:dup             
		//   65  130:iconst_3        
		//   66  131:getstatic       #43  <Field TableRowElement$Place FOOTER>
		//   67  134:aastore         
		//   68  135:dup             
		//   69  136:iconst_4        
		//   70  137:getstatic       #46  <Field TableRowElement$Place CAPTION_BOTTOM>
		//   71  140:aastore         
		//   72  141:putstatic       #48  <Field TableRowElement$Place[] $VALUES>
		//*  73  144:return          
		}

		private Place(String s, int i, Integer integer, Integer integer1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #52  <Method void Enum(String, int)>
			normal = integer;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #54  <Field Integer normal>
			repeated = integer1;
		//    7   11:aload_0         
		//    8   12:aload           4
		//    9   14:putfield        #56  <Field Integer repeated>
		//   10   17:return          
		}
	}


	public TableRowElement(List list, Place place1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		content = ((List) (new ArrayList(list.size())));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokeinterface #27  <Method int List.size()>
	//    7   15:invokespecial   #30  <Method void ArrayList(int)>
	//    8   18:putfield        #32  <Field List content>
		list = ((List) (list.iterator()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #36  <Method Iterator List.iterator()>
	//   11   27:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   12   28:aload_1         
	//   13   29:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            71
			Element element = (Element)((Iterator) (list)).next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #46  <Method Object Iterator.next()>
	//   17   43:checkcast       #6   <Class Element>
	//   18   46:astore_3        
			if(element instanceof HtmlCell)
	//*  19   47:aload_3         
	//*  20   48:instanceof      #48  <Class HtmlCell>
	//*  21   51:ifeq            28
				content.add(((Object) ((HtmlCell)element)));
	//   22   54:aload_0         
	//   23   55:getfield        #32  <Field List content>
	//   24   58:aload_3         
	//   25   59:checkcast       #48  <Class HtmlCell>
	//   26   62:invokeinterface #52  <Method boolean List.add(Object)>
	//   27   67:pop             
		} while(true);
	//   28   68:goto            28
		place = place1;
	//   29   71:aload_0         
	//   30   72:aload_2         
	//   31   73:putfield        #54  <Field TableRowElement$Place place>
	//   32   76:return          
	}

	public List getChunks()
	{
		throw new NotImplementedException();
	//    0    0:new             #61  <Class NotImplementedException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void NotImplementedException()>
	//    3    7:athrow          
	}

	public List getContent()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List content>
	//    2    4:areturn         
	}

	public Place getPlace()
	{
		return place;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field TableRowElement$Place place>
	//    2    4:areturn         
	}

	public boolean isContent()
	{
		throw new NotImplementedException();
	//    0    0:new             #61  <Class NotImplementedException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void NotImplementedException()>
	//    3    7:athrow          
	}

	public boolean isNestable()
	{
		throw new NotImplementedException();
	//    0    0:new             #61  <Class NotImplementedException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void NotImplementedException()>
	//    3    7:athrow          
	}

	public boolean process(ElementListener elementlistener)
	{
		throw new NotImplementedException();
	//    0    0:new             #61  <Class NotImplementedException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void NotImplementedException()>
	//    3    7:athrow          
	}

	public int type()
	{
		throw new NotImplementedException();
	//    0    0:new             #61  <Class NotImplementedException>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void NotImplementedException()>
	//    3    7:athrow          
	}

	private final List content;
	private final Place place;
}
