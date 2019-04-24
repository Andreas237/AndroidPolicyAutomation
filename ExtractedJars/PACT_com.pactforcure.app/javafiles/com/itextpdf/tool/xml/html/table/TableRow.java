// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import com.itextpdf.tool.xml.html.pdfelement.HtmlCell;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html.table:
//			TableRowElement

public class TableRow extends AbstractTagProcessor
{

	public TableRow()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		ArrayList arraylist = new ArrayList(1);
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #16  <Method void ArrayList(int)>
	//    4    8:astore          5
		int i;
		if(tag.getParent().getName().equalsIgnoreCase("thead"))
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #22  <Method Tag Tag.getParent()>
	//*   7   14:invokevirtual   #26  <Method String Tag.getName()>
	//*   8   17:ldc1            #28  <String "thead">
	//*   9   19:invokevirtual   #34  <Method boolean String.equalsIgnoreCase(String)>
	//*  10   22:ifeq            96
			workercontext = ((WorkerContext) (new TableRowElement(list, TableRowElement.Place.HEADER)));
	//   11   25:new             #36  <Class TableRowElement>
	//   12   28:dup             
	//   13   29:aload_3         
	//   14   30:getstatic       #42  <Field TableRowElement$Place TableRowElement$Place.HEADER>
	//   15   33:invokespecial   #45  <Method void TableRowElement(List, TableRowElement$Place)>
	//   16   36:astore_1        
		else
	//*  17   37:aload_0         
	//*  18   38:aload_2         
	//*  19   39:invokevirtual   #49  <Method int getRunDirection(Tag)>
	//*  20   42:istore          4
	//*  21   44:iload           4
	//*  22   46:iconst_1        
	//*  23   47:icmpeq          171
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #53  <Method List TableRowElement.getContent()>
	//*  26   54:invokeinterface #59  <Method Iterator List.iterator()>
	//*  27   59:astore_2        
	//*  28   60:aload_2         
	//*  29   61:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*  30   66:ifeq            171
	//*  31   69:aload_2         
	//*  32   70:invokeinterface #69  <Method Object Iterator.next()>
	//*  33   75:checkcast       #71  <Class HtmlCell>
	//*  34   78:astore_3        
	//*  35   79:aload_3         
	//*  36   80:invokevirtual   #74  <Method int HtmlCell.getRunDirection()>
	//*  37   83:iconst_1        
	//*  38   84:icmpne          60
	//*  39   87:aload_3         
	//*  40   88:iload           4
	//*  41   90:invokevirtual   #77  <Method void HtmlCell.setRunDirection(int)>
	//*  42   93:goto            60
		if(tag.getParent().getName().equalsIgnoreCase("tbody"))
	//*  43   96:aload_2         
	//*  44   97:invokevirtual   #22  <Method Tag Tag.getParent()>
	//*  45  100:invokevirtual   #26  <Method String Tag.getName()>
	//*  46  103:ldc1            #79  <String "tbody">
	//*  47  105:invokevirtual   #34  <Method boolean String.equalsIgnoreCase(String)>
	//*  48  108:ifeq            126
			workercontext = ((WorkerContext) (new TableRowElement(list, TableRowElement.Place.BODY)));
	//   49  111:new             #36  <Class TableRowElement>
	//   50  114:dup             
	//   51  115:aload_3         
	//   52  116:getstatic       #82  <Field TableRowElement$Place TableRowElement$Place.BODY>
	//   53  119:invokespecial   #45  <Method void TableRowElement(List, TableRowElement$Place)>
	//   54  122:astore_1        
		else
	//*  55  123:goto            37
		if(tag.getParent().getName().equalsIgnoreCase("tfoot"))
	//*  56  126:aload_2         
	//*  57  127:invokevirtual   #22  <Method Tag Tag.getParent()>
	//*  58  130:invokevirtual   #26  <Method String Tag.getName()>
	//*  59  133:ldc1            #84  <String "tfoot">
	//*  60  135:invokevirtual   #34  <Method boolean String.equalsIgnoreCase(String)>
	//*  61  138:ifeq            156
			workercontext = ((WorkerContext) (new TableRowElement(list, TableRowElement.Place.FOOTER)));
	//   62  141:new             #36  <Class TableRowElement>
	//   63  144:dup             
	//   64  145:aload_3         
	//   65  146:getstatic       #87  <Field TableRowElement$Place TableRowElement$Place.FOOTER>
	//   66  149:invokespecial   #45  <Method void TableRowElement(List, TableRowElement$Place)>
	//   67  152:astore_1        
		else
	//*  68  153:goto            37
			workercontext = ((WorkerContext) (new TableRowElement(list, TableRowElement.Place.BODY)));
	//   69  156:new             #36  <Class TableRowElement>
	//   70  159:dup             
	//   71  160:aload_3         
	//   72  161:getstatic       #82  <Field TableRowElement$Place TableRowElement$Place.BODY>
	//   73  164:invokespecial   #45  <Method void TableRowElement(List, TableRowElement$Place)>
	//   74  167:astore_1        
		i = getRunDirection(tag);
		if(i != 1)
		{
			tag = ((Tag) (((TableRowElement) (workercontext)).getContent().iterator()));
			do
			{
				if(!((Iterator) (tag)).hasNext())
					break;
				list = ((List) ((HtmlCell)((Iterator) (tag)).next()));
				if(((HtmlCell) (list)).getRunDirection() == 1)
					((HtmlCell) (list)).setRunDirection(i);
			} while(true);
		}
	//*  75  168:goto            37
		((List) (arraylist)).add(((Object) (workercontext)));
	//   76  171:aload           5
	//   77  173:aload_1         
	//   78  174:invokeinterface #91  <Method boolean List.add(Object)>
	//   79  179:pop             
		return ((List) (arraylist));
	//   80  180:aload           5
	//   81  182:areturn         
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
