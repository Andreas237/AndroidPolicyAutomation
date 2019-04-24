// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor

public class OrderedUnorderedListItem extends AbstractTagProcessor
{

	public OrderedUnorderedListItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		return textContent(workercontext, tag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #14  <Method List textContent(WorkerContext, Tag, String)>
	//    5    7:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		float f1;
		workercontext = ((WorkerContext) (new ArrayList(1)));
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #23  <Method void ArrayList(int)>
	//    4    8:astore_1        
		tag = ((Tag) (new ListItem()));
	//    5    9:new             #25  <Class ListItem>
	//    6   12:dup             
	//    7   13:invokespecial   #26  <Method void ListItem()>
	//    8   16:astore_2        
		f1 = -1F;
	//    9   17:ldc1            #27  <Float -1F>
	//   10   19:fstore          5
		list = ((List) (list.iterator()));
	//   11   21:aload_3         
	//   12   22:invokeinterface #33  <Method Iterator List.iterator()>
	//   13   27:astore_3        
		do
		{
label0:
			{
				if(!((Iterator) (list)).hasNext())
					break label0;
	//   14   28:aload_3         
	//   15   29:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            122
				Object obj = ((Object) ((Element)((Iterator) (list)).next()));
	//   17   37:aload_3         
	//   18   38:invokeinterface #43  <Method Object Iterator.next()>
	//   19   43:checkcast       #45  <Class Element>
	//   20   46:astore          6
				((ListItem) (tag)).add(((Element) (obj)));
	//   21   48:aload_2         
	//   22   49:aload           6
	//   23   51:invokevirtual   #49  <Method boolean ListItem.add(Element)>
	//   24   54:pop             
				obj = ((Object) (((Element) (obj)).getChunks().iterator()));
	//   25   55:aload           6
	//   26   57:invokeinterface #53  <Method List Element.getChunks()>
	//   27   62:invokeinterface #33  <Method Iterator List.iterator()>
	//   28   67:astore          6
				float f = f1;
	//   29   69:fload           5
	//   30   71:fstore          4
				do
				{
					f1 = f;
	//   31   73:fload           4
	//   32   75:fstore          5
					if(!((Iterator) (obj)).hasNext())
						break;
	//   33   77:aload           6
	//   34   79:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   35   84:ifeq            28
					f1 = ((Chunk)((Iterator) (obj)).next()).getFont().getCalculatedLeading(1.333333F);
	//   36   87:aload           6
	//   37   89:invokeinterface #43  <Method Object Iterator.next()>
	//   38   94:checkcast       #55  <Class Chunk>
	//   39   97:invokevirtual   #59  <Method Font Chunk.getFont()>
	//   40  100:ldc1            #60  <Float 1.333333F>
	//   41  102:invokevirtual   #66  <Method float Font.getCalculatedLeading(float)>
	//   42  105:fstore          5
					if(f < f1)
	//*  43  107:fload           4
	//*  44  109:fload           5
	//*  45  111:fcmpg           
	//*  46  112:ifge            73
						f = f1;
	//   47  115:fload           5
	//   48  117:fstore          4
				} while(true);
	//   49  119:goto            73
			}
		} while(true);
		if(((ListItem) (tag)).getLeading() < f1)
	//*  50  122:aload_2         
	//*  51  123:invokevirtual   #70  <Method float ListItem.getLeading()>
	//*  52  126:fload           5
	//*  53  128:fcmpg           
	//*  54  129:ifge            138
			((ListItem) (tag)).setLeading(f1);
	//   55  132:aload_2         
	//   56  133:fload           5
	//   57  135:invokevirtual   #74  <Method void ListItem.setLeading(float)>
		if(((ListItem) (tag)).trim())
	//*  58  138:aload_2         
	//*  59  139:invokevirtual   #77  <Method boolean ListItem.trim()>
	//*  60  142:ifeq            153
			((List) (workercontext)).add(((Object) (tag)));
	//   61  145:aload_1         
	//   62  146:aload_2         
	//   63  147:invokeinterface #80  <Method boolean List.add(Object)>
	//   64  152:pop             
		return ((List) (workercontext));
	//   65  153:aload_1         
	//   66  154:areturn         
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
