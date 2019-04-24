// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import com.itextpdf.text.pdf.parser.*;
import java.util.*;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

class CompareTool$CmpMarkedContentRenderFilter
	implements RenderListener
{

	public void beginTextBlock()
	{
		int i;
		for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).beginTextBlock())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Map tagsByMcid>
	//*   2    4:invokeinterface #34  <Method Set Map.keySet()>
	//*   3    9:invokeinterface #40  <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            61
			i = ((Integer)iterator.next()).intValue();
	//    8   24:aload_2         
	//    9   25:invokeinterface #50  <Method Object Iterator.next()>
	//   10   30:checkcast       #52  <Class Integer>
	//   11   33:invokevirtual   #56  <Method int Integer.intValue()>
	//   12   36:istore_1        

	//   13   37:aload_0         
	//   14   38:getfield        #26  <Field Map tagsByMcid>
	//   15   41:iload_1         
	//   16   42:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   17   45:invokeinterface #64  <Method Object Map.get(Object)>
	//   18   50:checkcast       #66  <Class TextExtractionStrategy>
	//   19   53:invokeinterface #68  <Method void TextExtractionStrategy.beginTextBlock()>
	//*  20   58:goto            15
	//   21   61:return          
	}

	public void endTextBlock()
	{
		int i;
		for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).endTextBlock())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Map tagsByMcid>
	//*   2    4:invokeinterface #34  <Method Set Map.keySet()>
	//*   3    9:invokeinterface #40  <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            61
			i = ((Integer)iterator.next()).intValue();
	//    8   24:aload_2         
	//    9   25:invokeinterface #50  <Method Object Iterator.next()>
	//   10   30:checkcast       #52  <Class Integer>
	//   11   33:invokevirtual   #56  <Method int Integer.intValue()>
	//   12   36:istore_1        

	//   13   37:aload_0         
	//   14   38:getfield        #26  <Field Map tagsByMcid>
	//   15   41:iload_1         
	//   16   42:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   17   45:invokeinterface #64  <Method Object Map.get(Object)>
	//   18   50:checkcast       #66  <Class TextExtractionStrategy>
	//   19   53:invokeinterface #71  <Method void TextExtractionStrategy.endTextBlock()>
	//*  20   58:goto            15
	//   21   61:return          
	}

	public Map getParsedTagContent()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:astore_2        
		int i;
		for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(i))), ((Object) (((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).getResultantText()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #26  <Field Map tagsByMcid>
	//*   6   12:invokeinterface #34  <Method Set Map.keySet()>
	//*   7   17:invokeinterface #40  <Method Iterator Set.iterator()>
	//*   8   22:astore_3        
	//*   9   23:aload_3         
	//*  10   24:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            80
			i = ((Integer)iterator.next()).intValue();
	//   12   32:aload_3         
	//   13   33:invokeinterface #50  <Method Object Iterator.next()>
	//   14   38:checkcast       #52  <Class Integer>
	//   15   41:invokevirtual   #56  <Method int Integer.intValue()>
	//   16   44:istore_1        

	//   17   45:aload_2         
	//   18   46:iload_1         
	//   19   47:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   20   50:aload_0         
	//   21   51:getfield        #26  <Field Map tagsByMcid>
	//   22   54:iload_1         
	//   23   55:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   24   58:invokeinterface #64  <Method Object Map.get(Object)>
	//   25   63:checkcast       #66  <Class TextExtractionStrategy>
	//   26   66:invokeinterface #77  <Method String TextExtractionStrategy.getResultantText()>
	//   27   71:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   28   76:pop             
	//*  29   77:goto            23
		return ((Map) (hashmap));
	//   30   80:aload_2         
	//   31   81:areturn         
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
	//    0    0:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		Integer integer = textrenderinfo.getMcid();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method Integer TextRenderInfo.getMcid()>
	//    2    4:astore_2        
		if(integer != null && tagsByMcid.containsKey(((Object) (integer))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          42
	//*   5    9:aload_0         
	//*   6   10:getfield        #26  <Field Map tagsByMcid>
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #97  <Method boolean Map.containsKey(Object)>
	//*   9   19:ifeq            42
			((TextExtractionStrategy)tagsByMcid.get(((Object) (integer)))).renderText(textrenderinfo);
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field Map tagsByMcid>
	//   12   26:aload_2         
	//   13   27:invokeinterface #64  <Method Object Map.get(Object)>
	//   14   32:checkcast       #66  <Class TextExtractionStrategy>
	//   15   35:aload_1         
	//   16   36:invokeinterface #99  <Method void TextExtractionStrategy.renderText(TextRenderInfo)>
		else
	//*  17   41:return          
		if(integer != null)
	//*  18   42:aload_2         
	//*  19   43:ifnull          41
		{
			tagsByMcid.put(((Object) (integer)), ((Object) (new SimpleTextExtractionStrategy())));
	//   20   46:aload_0         
	//   21   47:getfield        #26  <Field Map tagsByMcid>
	//   22   50:aload_2         
	//   23   51:new             #101 <Class SimpleTextExtractionStrategy>
	//   24   54:dup             
	//   25   55:invokespecial   #102 <Method void SimpleTextExtractionStrategy()>
	//   26   58:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   27   63:pop             
			((TextExtractionStrategy)tagsByMcid.get(((Object) (integer)))).renderText(textrenderinfo);
	//   28   64:aload_0         
	//   29   65:getfield        #26  <Field Map tagsByMcid>
	//   30   68:aload_2         
	//   31   69:invokeinterface #64  <Method Object Map.get(Object)>
	//   32   74:checkcast       #66  <Class TextExtractionStrategy>
	//   33   77:aload_1         
	//   34   78:invokeinterface #99  <Method void TextExtractionStrategy.renderText(TextRenderInfo)>
			return;
	//   35   83:return          
		}
	}

	Map tagsByMcid;
	final CompareTool this$0;

	CompareTool$CmpMarkedContentRenderFilter()
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		tagsByMcid = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #23  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void HashMap()>
	//    9   17:putfield        #26  <Field Map tagsByMcid>
	//   10   20:return          
	}
}
