// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.Element;
import com.itextpdf.text.ElementListener;
import com.itextpdf.text.html.HtmlUtilities;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.*;

public class TableWrapper
	implements Element
{

	public TableWrapper(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field Map styles>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void ArrayList()>
	//   11   23:putfield        #30  <Field List rows>
		styles.putAll(map);
	//   12   26:aload_0         
	//   13   27:getfield        #25  <Field Map styles>
	//   14   30:aload_1         
	//   15   31:invokeinterface #35  <Method void Map.putAll(Map)>
	//   16   36:return          
	}

	public void addRow(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
		{
			Collections.reverse(list);
	//    2    4:aload_1         
	//    3    5:invokestatic    #45  <Method void Collections.reverse(List)>
			rows.add(((Object) (list)));
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field List rows>
	//    6   12:aload_1         
	//    7   13:invokeinterface #51  <Method boolean List.add(Object)>
	//    8   18:pop             
		}
	//    9   19:return          
	}

	public PdfPTable createTable()
	{
		if(!rows.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List rows>
	//    2    4:invokeinterface #60  <Method boolean List.isEmpty()>
	//    3    9:ifeq            23
_L1:
		Object obj = ((Object) (new PdfPTable(1)));
	//    4   12:new             #62  <Class PdfPTable>
	//    5   15:dup             
	//    6   16:iconst_1        
	//    7   17:invokespecial   #65  <Method void PdfPTable(int)>
	//    8   20:astore_2        
_L4:
		return ((PdfPTable) (obj));
	//    9   21:aload_2         
	//   10   22:areturn         
_L2:
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		for(obj = ((Object) (((List)rows.get(0)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  13   25:aload_0         
	//*  14   26:getfield        #30  <Field List rows>
	//*  15   29:iconst_0        
	//*  16   30:invokeinterface #69  <Method Object List.get(int)>
	//*  17   35:checkcast       #47  <Class List>
	//*  18   38:invokeinterface #73  <Method Iterator List.iterator()>
	//*  19   43:astore_2        
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  22   50:ifeq            71
			i += ((PdfPCell)((Iterator) (obj)).next()).getColspan();
	//   23   53:iload_1         
	//   24   54:aload_2         
	//   25   55:invokeinterface #82  <Method Object Iterator.next()>
	//   26   60:checkcast       #84  <Class PdfPCell>
	//   27   63:invokevirtual   #88  <Method int PdfPCell.getColspan()>
	//   28   66:iadd            
	//   29   67:istore_1        

	//*  30   68:goto            44
		PdfPTable pdfptable = new PdfPTable(i);
	//   31   71:new             #62  <Class PdfPTable>
	//   32   74:dup             
	//   33   75:iload_1         
	//   34   76:invokespecial   #65  <Method void PdfPTable(int)>
	//   35   79:astore_3        
		obj = ((Object) ((String)styles.get("width")));
	//   36   80:aload_0         
	//   37   81:getfield        #25  <Field Map styles>
	//   38   84:ldc1            #90  <String "width">
	//   39   86:invokeinterface #93  <Method Object Map.get(Object)>
	//   40   91:checkcast       #95  <Class String>
	//   41   94:astore_2        
		Iterator iterator;
		if(obj == null)
	//*  42   95:aload_2         
	//*  43   96:ifnonnull       216
			pdfptable.setWidthPercentage(100F);
	//   44   99:aload_3         
	//   45  100:ldc1            #96  <Float 100F>
	//   46  102:invokevirtual   #100 <Method void PdfPTable.setWidthPercentage(float)>
		else
	//*  47  105:aload_0         
	//*  48  106:getfield        #25  <Field Map styles>
	//*  49  109:ldc1            #102 <String "align">
	//*  50  111:invokeinterface #93  <Method Object Map.get(Object)>
	//*  51  116:checkcast       #95  <Class String>
	//*  52  119:astore_2        
	//*  53  120:iconst_0        
	//*  54  121:istore_1        
	//*  55  122:aload_2         
	//*  56  123:ifnull          131
	//*  57  126:aload_2         
	//*  58  127:invokestatic    #108 <Method int HtmlUtilities.alignmentValue(String)>
	//*  59  130:istore_1        
	//*  60  131:aload_3         
	//*  61  132:iload_1         
	//*  62  133:invokevirtual   #111 <Method void PdfPTable.setHorizontalAlignment(int)>
	//*  63  136:aload_0         
	//*  64  137:getfield        #113 <Field float[] colWidths>
	//*  65  140:ifnull          151
	//*  66  143:aload_3         
	//*  67  144:aload_0         
	//*  68  145:getfield        #113 <Field float[] colWidths>
	//*  69  148:invokevirtual   #117 <Method void PdfPTable.setWidths(float[])>
	//*  70  151:aload_0         
	//*  71  152:getfield        #30  <Field List rows>
	//*  72  155:invokeinterface #73  <Method Iterator List.iterator()>
	//*  73  160:astore          4
	//*  74  162:aload_3         
	//*  75  163:astore_2        
	//*  76  164:aload           4
	//*  77  166:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  78  171:ifeq            21
	//*  79  174:aload           4
	//*  80  176:invokeinterface #82  <Method Object Iterator.next()>
	//*  81  181:checkcast       #47  <Class List>
	//*  82  184:invokeinterface #73  <Method Iterator List.iterator()>
	//*  83  189:astore_2        
	//*  84  190:aload_2         
	//*  85  191:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  86  196:ifeq            162
	//*  87  199:aload_3         
	//*  88  200:aload_2         
	//*  89  201:invokeinterface #82  <Method Object Iterator.next()>
	//*  90  206:checkcast       #84  <Class PdfPCell>
	//*  91  209:invokevirtual   #121 <Method PdfPCell PdfPTable.addCell(PdfPCell)>
	//*  92  212:pop             
	//*  93  213:goto            190
		if(((String) (obj)).endsWith("%"))
	//*  94  216:aload_2         
	//*  95  217:ldc1            #123 <String "%">
	//*  96  219:invokevirtual   #127 <Method boolean String.endsWith(String)>
	//*  97  222:ifeq            246
		{
			pdfptable.setWidthPercentage(Float.parseFloat(((String) (obj)).substring(0, ((String) (obj)).length() - 1)));
	//   98  225:aload_3         
	//   99  226:aload_2         
	//  100  227:iconst_0        
	//  101  228:aload_2         
	//  102  229:invokevirtual   #130 <Method int String.length()>
	//  103  232:iconst_1        
	//  104  233:isub            
	//  105  234:invokevirtual   #134 <Method String String.substring(int, int)>
	//  106  237:invokestatic    #140 <Method float Float.parseFloat(String)>
	//  107  240:invokevirtual   #100 <Method void PdfPTable.setWidthPercentage(float)>
		} else
	//* 108  243:goto            105
		{
			pdfptable.setTotalWidth(Float.parseFloat(((String) (obj))));
	//  109  246:aload_3         
	//  110  247:aload_2         
	//  111  248:invokestatic    #140 <Method float Float.parseFloat(String)>
	//  112  251:invokevirtual   #143 <Method void PdfPTable.setTotalWidth(float)>
			pdfptable.setLockedWidth(true);
	//  113  254:aload_3         
	//  114  255:iconst_1        
	//  115  256:invokevirtual   #147 <Method void PdfPTable.setLockedWidth(boolean)>
		}
		obj = ((Object) ((String)styles.get("align")));
		i = 0;
		if(obj != null)
			i = HtmlUtilities.alignmentValue(((String) (obj)));
		pdfptable.setHorizontalAlignment(i);
		try
		{
			if(colWidths != null)
				pdfptable.setWidths(colWidths);
		}
	//* 116  259:goto            105
		catch(Exception exception) { }
	//  117  262:astore_2        
		iterator = rows.iterator();
		obj = ((Object) (pdfptable));
		if(iterator.hasNext())
		{
			obj = ((Object) (((List)iterator.next()).iterator()));
			while(((Iterator) (obj)).hasNext()) 
				pdfptable.addCell((PdfPCell)((Iterator) (obj)).next());
			break MISSING_BLOCK_LABEL_162;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
	//* 118  263:goto            151
	}

	public List getChunks()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isContent()
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

	public boolean process(ElementListener elementlistener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setColWidths(float af[])
	{
		colWidths = af;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field float[] colWidths>
	//    3    5:return          
	}

	public int type()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private float colWidths[];
	private final List rows = new ArrayList();
	private final Map styles = new HashMap();
}
