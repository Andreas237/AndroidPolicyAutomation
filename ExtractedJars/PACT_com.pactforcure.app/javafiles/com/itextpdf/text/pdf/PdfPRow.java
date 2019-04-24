// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfPCell, PdfPHeaderCell, PdfContentByte, 
//			PdfWriter, ColumnText, PdfPTable, PdfObject, 
//			ByteBuffer, PdfPCellEvent

public class PdfPRow
	implements IAccessibleElement
{

	public PdfPRow(PdfPRow pdfprow)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPRow);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPRow>
	//    4    7:invokestatic    #54  <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #56  <Field Logger LOGGER>
		mayNotBreak = false;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #58  <Field boolean mayNotBreak>
		maxHeight = 0.0F;
	//    9   18:aload_0         
	//   10   19:fconst_0        
	//   11   20:putfield        #60  <Field float maxHeight>
		calculated = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #62  <Field boolean calculated>
		adjusted = false;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #64  <Field boolean adjusted>
		role = PdfName.TR;
	//   18   33:aload_0         
	//   19   34:getstatic       #69  <Field PdfName PdfName.TR>
	//   20   37:putfield        #71  <Field PdfName role>
		accessibleAttributes = null;
	//   21   40:aload_0         
	//   22   41:aconst_null     
	//   23   42:putfield        #73  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   24   45:aload_0         
	//   25   46:new             #75  <Class AccessibleElementId>
	//   26   49:dup             
	//   27   50:invokespecial   #76  <Method void AccessibleElementId()>
	//   28   53:putfield        #78  <Field AccessibleElementId id>
		mayNotBreak = pdfprow.mayNotBreak;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:getfield        #58  <Field boolean mayNotBreak>
	//   32   61:putfield        #58  <Field boolean mayNotBreak>
		maxHeight = pdfprow.maxHeight;
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:getfield        #60  <Field float maxHeight>
	//   36   69:putfield        #60  <Field float maxHeight>
		calculated = pdfprow.calculated;
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:getfield        #62  <Field boolean calculated>
	//   40   77:putfield        #62  <Field boolean calculated>
		cells = new PdfPCell[pdfprow.cells.length];
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:getfield        #80  <Field PdfPCell[] cells>
	//   44   85:arraylength     
	//   45   86:anewarray       PdfPCell[]
	//   46   89:putfield        #80  <Field PdfPCell[] cells>
		int i = 0;
	//   47   92:iconst_0        
	//   48   93:istore_2        
		while(i < cells.length) 
	//*  49   94:iload_2         
	//*  50   95:aload_0         
	//*  51   96:getfield        #80  <Field PdfPCell[] cells>
	//*  52   99:arraylength     
	//*  53  100:icmpge          175
		{
			if(pdfprow.cells[i] != null)
	//*  54  103:aload_1         
	//*  55  104:getfield        #80  <Field PdfPCell[] cells>
	//*  56  107:iload_2         
	//*  57  108:aaload          
	//*  58  109:ifnull          146
				if(pdfprow.cells[i] instanceof PdfPHeaderCell)
	//*  59  112:aload_1         
	//*  60  113:getfield        #80  <Field PdfPCell[] cells>
	//*  61  116:iload_2         
	//*  62  117:aaload          
	//*  63  118:instanceof      #84  <Class PdfPHeaderCell>
	//*  64  121:ifeq            153
					cells[i] = ((PdfPCell) (new PdfPHeaderCell((PdfPHeaderCell)pdfprow.cells[i])));
	//   65  124:aload_0         
	//   66  125:getfield        #80  <Field PdfPCell[] cells>
	//   67  128:iload_2         
	//   68  129:new             #84  <Class PdfPHeaderCell>
	//   69  132:dup             
	//   70  133:aload_1         
	//   71  134:getfield        #80  <Field PdfPCell[] cells>
	//   72  137:iload_2         
	//   73  138:aaload          
	//   74  139:checkcast       #84  <Class PdfPHeaderCell>
	//   75  142:invokespecial   #87  <Method void PdfPHeaderCell(PdfPHeaderCell)>
	//   76  145:aastore         
				else
	//*  77  146:iload_2         
	//*  78  147:iconst_1        
	//*  79  148:iadd            
	//*  80  149:istore_2        
	//*  81  150:goto            94
					cells[i] = new PdfPCell(pdfprow.cells[i]);
	//   82  153:aload_0         
	//   83  154:getfield        #80  <Field PdfPCell[] cells>
	//   84  157:iload_2         
	//   85  158:new             #82  <Class PdfPCell>
	//   86  161:dup             
	//   87  162:aload_1         
	//   88  163:getfield        #80  <Field PdfPCell[] cells>
	//   89  166:iload_2         
	//   90  167:aaload          
	//   91  168:invokespecial   #90  <Method void PdfPCell(PdfPCell)>
	//   92  171:aastore         
			i++;
		}
	//*  93  172:goto            146
		widths = new float[cells.length];
	//   94  175:aload_0         
	//   95  176:aload_0         
	//   96  177:getfield        #80  <Field PdfPCell[] cells>
	//   97  180:arraylength     
	//   98  181:newarray        float[]
	//   99  183:putfield        #92  <Field float[] widths>
		System.arraycopy(((Object) (pdfprow.widths)), 0, ((Object) (widths)), 0, cells.length);
	//  100  186:aload_1         
	//  101  187:getfield        #92  <Field float[] widths>
	//  102  190:iconst_0        
	//  103  191:aload_0         
	//  104  192:getfield        #92  <Field float[] widths>
	//  105  195:iconst_0        
	//  106  196:aload_0         
	//  107  197:getfield        #80  <Field PdfPCell[] cells>
	//  108  200:arraylength     
	//  109  201:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
		initExtraHeights();
	//  110  204:aload_0         
	//  111  205:invokevirtual   #101 <Method void initExtraHeights()>
		id = pdfprow.id;
	//  112  208:aload_0         
	//  113  209:aload_1         
	//  114  210:getfield        #78  <Field AccessibleElementId id>
	//  115  213:putfield        #78  <Field AccessibleElementId id>
		role = pdfprow.role;
	//  116  216:aload_0         
	//  117  217:aload_1         
	//  118  218:getfield        #71  <Field PdfName role>
	//  119  221:putfield        #71  <Field PdfName role>
		if(pdfprow.accessibleAttributes != null)
	//* 120  224:aload_1         
	//* 121  225:getfield        #73  <Field HashMap accessibleAttributes>
	//* 122  228:ifnull          246
			accessibleAttributes = new HashMap(((java.util.Map) (pdfprow.accessibleAttributes)));
	//  123  231:aload_0         
	//  124  232:new             #103 <Class HashMap>
	//  125  235:dup             
	//  126  236:aload_1         
	//  127  237:getfield        #73  <Field HashMap accessibleAttributes>
	//  128  240:invokespecial   #106 <Method void HashMap(java.util.Map)>
	//  129  243:putfield        #73  <Field HashMap accessibleAttributes>
	//  130  246:return          
	}

	public PdfPRow(PdfPCell apdfpcell[])
	{
		this(apdfpcell, ((PdfPRow) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #110 <Method void PdfPRow(PdfPCell[], PdfPRow)>
	//    4    6:return          
	}

	public PdfPRow(PdfPCell apdfpcell[], PdfPRow pdfprow)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPRow);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPRow>
	//    4    7:invokestatic    #54  <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #56  <Field Logger LOGGER>
		mayNotBreak = false;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #58  <Field boolean mayNotBreak>
		maxHeight = 0.0F;
	//    9   18:aload_0         
	//   10   19:fconst_0        
	//   11   20:putfield        #60  <Field float maxHeight>
		calculated = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #62  <Field boolean calculated>
		adjusted = false;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #64  <Field boolean adjusted>
		role = PdfName.TR;
	//   18   33:aload_0         
	//   19   34:getstatic       #69  <Field PdfName PdfName.TR>
	//   20   37:putfield        #71  <Field PdfName role>
		accessibleAttributes = null;
	//   21   40:aload_0         
	//   22   41:aconst_null     
	//   23   42:putfield        #73  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   24   45:aload_0         
	//   25   46:new             #75  <Class AccessibleElementId>
	//   26   49:dup             
	//   27   50:invokespecial   #76  <Method void AccessibleElementId()>
	//   28   53:putfield        #78  <Field AccessibleElementId id>
		cells = apdfpcell;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:putfield        #80  <Field PdfPCell[] cells>
		widths = new float[apdfpcell.length];
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:arraylength     
	//   35   64:newarray        float[]
	//   36   66:putfield        #92  <Field float[] widths>
		initExtraHeights();
	//   37   69:aload_0         
	//   38   70:invokevirtual   #101 <Method void initExtraHeights()>
		if(pdfprow != null)
	//*  39   73:aload_2         
	//*  40   74:ifnull          115
		{
			id = pdfprow.id;
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:getfield        #78  <Field AccessibleElementId id>
	//   44   82:putfield        #78  <Field AccessibleElementId id>
			role = pdfprow.role;
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:getfield        #71  <Field PdfName role>
	//   48   90:putfield        #71  <Field PdfName role>
			if(pdfprow.accessibleAttributes != null)
	//*  49   93:aload_2         
	//*  50   94:getfield        #73  <Field HashMap accessibleAttributes>
	//*  51   97:ifnull          115
				accessibleAttributes = new HashMap(((java.util.Map) (pdfprow.accessibleAttributes)));
	//   52  100:aload_0         
	//   53  101:new             #103 <Class HashMap>
	//   54  104:dup             
	//   55  105:aload_2         
	//   56  106:getfield        #73  <Field HashMap accessibleAttributes>
	//   57  109:invokespecial   #106 <Method void HashMap(java.util.Map)>
	//   58  112:putfield        #73  <Field HashMap accessibleAttributes>
		}
	//   59  115:return          
	}

	private static boolean isTagged(PdfContentByte pdfcontentbyte)
	{
		return pdfcontentbyte != null && pdfcontentbyte.writer != null && pdfcontentbyte.writer.isTagged();
	//    0    0:aload_0         
	//    1    1:ifnull          23
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field PdfWriter PdfContentByte.writer>
	//    4    8:ifnull          23
	//    5   11:aload_0         
	//    6   12:getfield        #118 <Field PdfWriter PdfContentByte.writer>
	//    7   15:invokevirtual   #122 <Method boolean PdfWriter.isTagged()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public static float setColumn(ColumnText columntext, float f, float f1, float f2, float f3)
	{
		float f4 = f2;
	//    0    0:fload_3         
	//    1    1:fstore          5
		if(f > f2)
	//*   2    3:fload_1         
	//*   3    4:fload_3         
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f4 = f;
	//    6    9:fload_1         
	//    7   10:fstore          5
		f2 = f3;
	//    8   12:fload           4
	//    9   14:fstore_3        
		if(f1 > f3)
	//*  10   15:fload_2         
	//*  11   16:fload           4
	//*  12   18:fcmpl           
	//*  13   19:ifle            24
			f2 = f1;
	//   14   22:fload_2         
	//   15   23:fstore_3        
		columntext.setSimpleColumn(f, f1, f4, f2);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:fload_2         
	//   19   27:fload           5
	//   20   29:fload_3         
	//   21   30:invokevirtual   #130 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
		return f2;
	//   22   33:fload_3         
	//   23   34:freturn         
	}

	protected void calculateHeights()
	{
		maxHeight = 0.0F;
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:putfield        #60  <Field float maxHeight>
		LOGGER.info("calculateHeights");
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Logger LOGGER>
	//    5    9:ldc1            #132 <String "calculateHeights">
	//    6   11:invokeinterface #138 <Method void Logger.info(String)>
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		while(i < cells.length) 
	//*   9   18:iload_2         
	//*  10   19:aload_0         
	//*  11   20:getfield        #80  <Field PdfPCell[] cells>
	//*  12   23:arraylength     
	//*  13   24:icmpge          90
		{
			PdfPCell pdfpcell = cells[i];
	//   14   27:aload_0         
	//   15   28:getfield        #80  <Field PdfPCell[] cells>
	//   16   31:iload_2         
	//   17   32:aaload          
	//   18   33:astore_3        
			if(pdfpcell != null)
	//*  19   34:aload_3         
	//*  20   35:ifnonnull       45
	//*  21   38:iload_2         
	//*  22   39:iconst_1        
	//*  23   40:iadd            
	//*  24   41:istore_2        
	//*  25   42:goto            18
			{
				float f;
				if(pdfpcell.hasCalculatedHeight())
	//*  26   45:aload_3         
	//*  27   46:invokevirtual   #141 <Method boolean PdfPCell.hasCalculatedHeight()>
	//*  28   49:ifeq            82
					f = pdfpcell.getCalculatedHeight();
	//   29   52:aload_3         
	//   30   53:invokevirtual   #145 <Method float PdfPCell.getCalculatedHeight()>
	//   31   56:fstore_1        
				else
	//*  32   57:fload_1         
	//*  33   58:aload_0         
	//*  34   59:getfield        #60  <Field float maxHeight>
	//*  35   62:fcmpl           
	//*  36   63:ifle            38
	//*  37   66:aload_3         
	//*  38   67:invokevirtual   #149 <Method int PdfPCell.getRowspan()>
	//*  39   70:iconst_1        
	//*  40   71:icmpne          38
	//*  41   74:aload_0         
	//*  42   75:fload_1         
	//*  43   76:putfield        #60  <Field float maxHeight>
	//*  44   79:goto            38
					f = pdfpcell.getMaxHeight();
	//   45   82:aload_3         
	//   46   83:invokevirtual   #152 <Method float PdfPCell.getMaxHeight()>
	//   47   86:fstore_1        
				if(f > maxHeight && pdfpcell.getRowspan() == 1)
					maxHeight = f;
			}
			i++;
		}
	//*  48   87:goto            57
		calculated = true;
	//   49   90:aload_0         
	//   50   91:iconst_1        
	//   51   92:putfield        #62  <Field boolean calculated>
	//   52   95:return          
	}

	public void copyRowContent(PdfPTable pdfptable, int i)
	{
		if(pdfptable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
			while(j < cells.length) 
	//*   5    7:iload_3         
	//*   6    8:aload_0         
	//*   7    9:getfield        #80  <Field PdfPCell[] cells>
	//*   8   12:arraylength     
	//*   9   13:icmpge          4
			{
				int k = i;
	//   10   16:iload_2         
	//   11   17:istore          4
				PdfPCell pdfpcell;
				for(pdfpcell = pdfptable.getRow(k).getCells()[j]; pdfpcell == null && k > 0; pdfpcell = pdfptable.getRow(k).getCells()[j])
	//*  12   19:aload_1         
	//*  13   20:iload           4
	//*  14   22:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//*  15   25:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//*  16   28:iload_3         
	//*  17   29:aaload          
	//*  18   30:astore          5
	//*  19   32:aload           5
	//*  20   34:ifnonnull       64
	//*  21   37:iload           4
	//*  22   39:ifle            64
					k--;
	//   23   42:iload           4
	//   24   44:iconst_1        
	//   25   45:isub            
	//   26   46:istore          4

	//   27   48:aload_1         
	//   28   49:iload           4
	//   29   51:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//   30   54:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//   31   57:iload_3         
	//   32   58:aaload          
	//   33   59:astore          5
	//*  34   61:goto            32
				if(cells[j] != null && pdfpcell != null)
	//*  35   64:aload_0         
	//*  36   65:getfield        #80  <Field PdfPCell[] cells>
	//*  37   68:iload_3         
	//*  38   69:aaload          
	//*  39   70:ifnull          97
	//*  40   73:aload           5
	//*  41   75:ifnull          97
				{
					cells[j].setColumn(pdfpcell.getColumn());
	//   42   78:aload_0         
	//   43   79:getfield        #80  <Field PdfPCell[] cells>
	//   44   82:iload_3         
	//   45   83:aaload          
	//   46   84:aload           5
	//   47   86:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//   48   89:invokevirtual   #171 <Method void PdfPCell.setColumn(ColumnText)>
					calculated = false;
	//   49   92:aload_0         
	//   50   93:iconst_0        
	//   51   94:putfield        #62  <Field boolean calculated>
				}
				j++;
	//   52   97:iload_3         
	//   53   98:iconst_1        
	//   54   99:iadd            
	//   55  100:istore_3        
			}
		}
	//*  56  101:goto            7
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #177 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #179 <Class PdfObject>
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
	//    1    1:getfield        #73  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public PdfPCell[] getCells()
	{
		return cells;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field PdfPCell[] cells>
	//    2    4:areturn         
	}

	float[] getEventWidth(float f, float af[])
	{
		int i;
		int k;
		k = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
_L2:
		int l;
		int j1;
		do
		{
			if(i >= cells.length)
				break MISSING_BLOCK_LABEL_100;
	//    4    5:iload_3         
	//    5    6:aload_0         
	//    6    7:getfield        #80  <Field PdfPCell[] cells>
	//    7   10:arraylength     
	//    8   11:icmpge          100
			l = i;
	//    9   14:iload_3         
	//   10   15:istore          5
			j1 = k;
	//   11   17:iload           4
	//   12   19:istore          6
			if(cells[i] == null)
				break;
	//   13   21:aload_0         
	//   14   22:getfield        #80  <Field PdfPCell[] cells>
	//   15   25:iload_3         
	//   16   26:aaload          
	//   17   27:ifnull          51
			k++;
	//   18   30:iload           4
	//   19   32:iconst_1        
	//   20   33:iadd            
	//   21   34:istore          4
			i += cells[i].getColspan();
	//   22   36:iload_3         
	//   23   37:aload_0         
	//   24   38:getfield        #80  <Field PdfPCell[] cells>
	//   25   41:iload_3         
	//   26   42:aaload          
	//   27   43:invokevirtual   #188 <Method int PdfPCell.getColspan()>
	//   28   46:iadd            
	//   29   47:istore_3        
		} while(true);
	//   30   48:goto            5
_L4:
		i = l;
	//   31   51:iload           5
	//   32   53:istore_3        
		k = j1;
	//   33   54:iload           6
	//   34   56:istore          4
		if(l >= cells.length) goto _L2; else goto _L1
	//   35   58:iload           5
	//   36   60:aload_0         
	//   37   61:getfield        #80  <Field PdfPCell[] cells>
	//   38   64:arraylength     
	//   39   65:icmpge          5
_L1:
		i = l;
	//   40   68:iload           5
	//   41   70:istore_3        
		k = j1;
	//   42   71:iload           6
	//   43   73:istore          4
		if(cells[l] != null) goto _L2; else goto _L3
	//   44   75:aload_0         
	//   45   76:getfield        #80  <Field PdfPCell[] cells>
	//   46   79:iload           5
	//   47   81:aaload          
	//   48   82:ifnonnull       5
_L3:
		j1++;
	//   49   85:iload           6
	//   50   87:iconst_1        
	//   51   88:iadd            
	//   52   89:istore          6
		l++;
	//   53   91:iload           5
	//   54   93:iconst_1        
	//   55   94:iadd            
	//   56   95:istore          5
		  goto _L4
	//*  57   97:goto            51
		float af1[] = new float[k];
	//   58  100:iload           4
	//   59  102:newarray        float[]
	//   60  104:astore          7
		af1[0] = f;
	//   61  106:aload           7
	//   62  108:iconst_0        
	//   63  109:fload_1         
	//   64  110:fastore         
		k = 1;
	//   65  111:iconst_1        
	//   66  112:istore          4
		for(int j = 0; j < cells.length && k < af1.length;)
	//*  67  114:iconst_0        
	//*  68  115:istore_3        
	//*  69  116:iload_3         
	//*  70  117:aload_0         
	//*  71  118:getfield        #80  <Field PdfPCell[] cells>
	//*  72  121:arraylength     
	//*  73  122:icmpge          277
	//*  74  125:iload           4
	//*  75  127:aload           7
	//*  76  129:arraylength     
	//*  77  130:icmpge          277
			if(cells[j] != null)
	//*  78  133:aload_0         
	//*  79  134:getfield        #80  <Field PdfPCell[] cells>
	//*  80  137:iload_3         
	//*  81  138:aaload          
	//*  82  139:ifnull          217
			{
				int k1 = cells[j].getColspan();
	//   83  142:aload_0         
	//   84  143:getfield        #80  <Field PdfPCell[] cells>
	//   85  146:iload_3         
	//   86  147:aaload          
	//   87  148:invokevirtual   #188 <Method int PdfPCell.getColspan()>
	//   88  151:istore          6
				af1[k] = af1[k - 1];
	//   89  153:aload           7
	//   90  155:iload           4
	//   91  157:aload           7
	//   92  159:iload           4
	//   93  161:iconst_1        
	//   94  162:isub            
	//   95  163:faload          
	//   96  164:fastore         
				for(int i1 = 0; i1 < k1 && j < af.length; j++)
	//*  97  165:iconst_0        
	//*  98  166:istore          5
	//*  99  168:iload           5
	//* 100  170:iload           6
	//* 101  172:icmpge          208
	//* 102  175:iload_3         
	//* 103  176:aload_2         
	//* 104  177:arraylength     
	//* 105  178:icmpge          208
				{
					af1[k] = af1[k] + af[j];
	//  106  181:aload           7
	//  107  183:iload           4
	//  108  185:aload           7
	//  109  187:iload           4
	//  110  189:faload          
	//  111  190:aload_2         
	//  112  191:iload_3         
	//  113  192:faload          
	//  114  193:fadd            
	//  115  194:fastore         
					i1++;
	//  116  195:iload           5
	//  117  197:iconst_1        
	//  118  198:iadd            
	//  119  199:istore          5
				}

	//  120  201:iload_3         
	//  121  202:iconst_1        
	//  122  203:iadd            
	//  123  204:istore_3        
	//* 124  205:goto            168
				k++;
	//  125  208:iload           4
	//  126  210:iconst_1        
	//  127  211:iadd            
	//  128  212:istore          4
			} else
	//* 129  214:goto            116
			{
				af1[k] = af1[k - 1];
	//  130  217:aload           7
	//  131  219:iload           4
	//  132  221:aload           7
	//  133  223:iload           4
	//  134  225:iconst_1        
	//  135  226:isub            
	//  136  227:faload          
	//  137  228:fastore         
				for(; j < cells.length && cells[j] == null; j++)
	//* 138  229:iload_3         
	//* 139  230:aload_0         
	//* 140  231:getfield        #80  <Field PdfPCell[] cells>
	//* 141  234:arraylength     
	//* 142  235:icmpge          268
	//* 143  238:aload_0         
	//* 144  239:getfield        #80  <Field PdfPCell[] cells>
	//* 145  242:iload_3         
	//* 146  243:aaload          
	//* 147  244:ifnonnull       268
					af1[k] = af1[k] + af[j];
	//  148  247:aload           7
	//  149  249:iload           4
	//  150  251:aload           7
	//  151  253:iload           4
	//  152  255:faload          
	//  153  256:aload_2         
	//  154  257:iload_3         
	//  155  258:faload          
	//  156  259:fadd            
	//  157  260:fastore         

	//  158  261:iload_3         
	//  159  262:iconst_1        
	//  160  263:iadd            
	//  161  264:istore_3        
	//* 162  265:goto            229
				k++;
	//  163  268:iload           4
	//  164  270:iconst_1        
	//  165  271:iadd            
	//  166  272:istore          4
			}

	//* 167  274:goto            116
		return af1;
	//  168  277:aload           7
	//  169  279:areturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public float getMaxHeights()
	{
		if(!calculated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean calculated>
	//*   2    4:ifne            11
			calculateHeights();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #193 <Method void calculateHeights()>
		return maxHeight;
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field float maxHeight>
	//    7   15:freturn         
	}

	public float getMaxRowHeightsWithoutCalculating()
	{
		return maxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float maxHeight>
	//    2    4:freturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field PdfName role>
	//    2    4:areturn         
	}

	public boolean hasRowspan()
	{
		for(int i = 0; i < cells.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #80  <Field PdfPCell[] cells>
	//*   5    7:arraylength     
	//*   6    8:icmpge          42
			if(cells[i] != null && cells[i].getRowspan() > 1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #80  <Field PdfPCell[] cells>
	//*   9   15:iload_1         
	//*  10   16:aaload          
	//*  11   17:ifnull          35
	//*  12   20:aload_0         
	//*  13   21:getfield        #80  <Field PdfPCell[] cells>
	//*  14   24:iload_1         
	//*  15   25:aaload          
	//*  16   26:invokevirtual   #149 <Method int PdfPCell.getRowspan()>
	//*  17   29:iconst_1        
	//*  18   30:icmple          35
				return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         

	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
	//*  25   39:goto            2
		return false;
	//   26   42:iconst_0        
	//   27   43:ireturn         
	}

	protected void initExtraHeights()
	{
		extraHeights = new float[cells.length];
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field PdfPCell[] cells>
	//    3    5:arraylength     
	//    4    6:newarray        float[]
	//    5    8:putfield        #199 <Field float[] extraHeights>
		for(int i = 0; i < extraHeights.length; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_1        
	//*   8   13:iload_1         
	//*   9   14:aload_0         
	//*  10   15:getfield        #199 <Field float[] extraHeights>
	//*  11   18:arraylength     
	//*  12   19:icmpge          36
			extraHeights[i] = 0.0F;
	//   13   22:aload_0         
	//   14   23:getfield        #199 <Field float[] extraHeights>
	//   15   26:iload_1         
	//   16   27:fconst_0        
	//   17   28:fastore         

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//*  22   33:goto            13
	//   23   36:return          
	}

	public boolean isAdjusted()
	{
		return adjusted;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean adjusted>
	//    2    4:ireturn         
	}

	public boolean isCalculated()
	{
		return calculated;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean calculated>
	//    2    4:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isMayNotBreak()
	{
		return mayNotBreak;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean mayNotBreak>
	//    2    4:ireturn         
	}

	protected void restoreCanvases(PdfContentByte apdfcontentbyte[])
	{
		for(int i = 0; i < 4; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          61
		{
			ByteBuffer bytebuffer = apdfcontentbyte[i].getInternalBuffer();
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:aaload          
	//    8   10:invokevirtual   #209 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//    9   13:astore          4
			int j = bytebuffer.size();
	//   10   15:aload           4
	//   11   17:invokevirtual   #214 <Method int ByteBuffer.size()>
	//   12   20:istore_3        
			apdfcontentbyte[i].restoreState();
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:aaload          
	//   16   24:invokevirtual   #217 <Method void PdfContentByte.restoreState()>
			if(j == canvasesPos[i * 2 + 1])
	//*  17   27:iload_3         
	//*  18   28:aload_0         
	//*  19   29:getfield        #219 <Field int[] canvasesPos>
	//*  20   32:iload_2         
	//*  21   33:iconst_2        
	//*  22   34:imul            
	//*  23   35:iconst_1        
	//*  24   36:iadd            
	//*  25   37:iaload          
	//*  26   38:icmpne          54
				bytebuffer.setSize(canvasesPos[i * 2]);
	//   27   41:aload           4
	//   28   43:aload_0         
	//   29   44:getfield        #219 <Field int[] canvasesPos>
	//   30   47:iload_2         
	//   31   48:iconst_2        
	//   32   49:imul            
	//   33   50:iaload          
	//   34   51:invokevirtual   #223 <Method void ByteBuffer.setSize(int)>
		}

	//   35   54:iload_2         
	//   36   55:iconst_1        
	//   37   56:iadd            
	//   38   57:istore_2        
	//*  39   58:goto            2
	//   40   61:return          
	}

	protected void saveAndRotateCanvases(PdfContentByte apdfcontentbyte[], float f, float f1, float f2, float f3, float f4, float f5)
	{
		if(canvasesPos == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field int[] canvasesPos>
	//*   2    4:ifnonnull       15
			canvasesPos = new int[8];
	//    3    7:aload_0         
	//    4    8:bipush          8
	//    5   10:newarray        int[]
	//    6   12:putfield        #219 <Field int[] canvasesPos>
		for(int i = 0; i < 4; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore          8
	//*   9   18:iload           8
	//*  10   20:iconst_4        
	//*  11   21:icmpge          96
		{
			ByteBuffer bytebuffer = apdfcontentbyte[i].getInternalBuffer();
	//   12   24:aload_1         
	//   13   25:iload           8
	//   14   27:aaload          
	//   15   28:invokevirtual   #209 <Method ByteBuffer PdfContentByte.getInternalBuffer()>
	//   16   31:astore          9
			canvasesPos[i * 2] = bytebuffer.size();
	//   17   33:aload_0         
	//   18   34:getfield        #219 <Field int[] canvasesPos>
	//   19   37:iload           8
	//   20   39:iconst_2        
	//   21   40:imul            
	//   22   41:aload           9
	//   23   43:invokevirtual   #214 <Method int ByteBuffer.size()>
	//   24   46:iastore         
			apdfcontentbyte[i].saveState();
	//   25   47:aload_1         
	//   26   48:iload           8
	//   27   50:aaload          
	//   28   51:invokevirtual   #228 <Method void PdfContentByte.saveState()>
			apdfcontentbyte[i].concatCTM(f, f1, f2, f3, f4, f5);
	//   29   54:aload_1         
	//   30   55:iload           8
	//   31   57:aaload          
	//   32   58:fload_2         
	//   33   59:fload_3         
	//   34   60:fload           4
	//   35   62:fload           5
	//   36   64:fload           6
	//   37   66:fload           7
	//   38   68:invokevirtual   #232 <Method void PdfContentByte.concatCTM(float, float, float, float, float, float)>
			canvasesPos[i * 2 + 1] = bytebuffer.size();
	//   39   71:aload_0         
	//   40   72:getfield        #219 <Field int[] canvasesPos>
	//   41   75:iload           8
	//   42   77:iconst_2        
	//   43   78:imul            
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:aload           9
	//   47   83:invokevirtual   #214 <Method int ByteBuffer.size()>
	//   48   86:iastore         
		}

	//   49   87:iload           8
	//   50   89:iconst_1        
	//   51   90:iadd            
	//   52   91:istore          8
	//*  53   93:goto            18
	//   54   96:return          
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #103 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #235 <Method void HashMap()>
	//    7   15:putfield        #73  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #239 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setAdjusted(boolean flag)
	{
		adjusted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean adjusted>
	//    3    5:return          
	}

	public void setExtraHeight(int i, float f)
	{
		if(i < 0 || i >= cells.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field PdfPCell[] cells>
	//*   5    9:arraylength     
	//*   6   10:icmplt          14
		{
			return;
	//    7   13:return          
		} else
		{
			extraHeights[i] = f;
	//    8   14:aload_0         
	//    9   15:getfield        #199 <Field float[] extraHeights>
	//   10   18:iload_1         
	//   11   19:fload_2         
	//   12   20:fastore         
			return;
	//   13   21:return          
		}
	}

	public void setFinalMaxHeights(float f)
	{
		setMaxHeights(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #248 <Method void setMaxHeights(float)>
		calculated = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #62  <Field boolean calculated>
	//    6   10:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setMaxHeights(float f)
	{
		maxHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #60  <Field float maxHeight>
	//    3    5:return          
	}

	public void setMayNotBreak(boolean flag)
	{
		mayNotBreak = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean mayNotBreak>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field PdfName role>
	//    3    5:return          
	}

	public boolean setWidths(float af[])
	{
		if(af.length != cells.length)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #80  <Field PdfPCell[] cells>
	//*   4    6:arraylength     
	//*   5    7:icmpeq          12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		System.arraycopy(((Object) (af)), 0, ((Object) (widths)), 0, cells.length);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_0         
	//   11   15:getfield        #92  <Field float[] widths>
	//   12   18:iconst_0        
	//   13   19:aload_0         
	//   14   20:getfield        #80  <Field PdfPCell[] cells>
	//   15   23:arraylength     
	//   16   24:invokestatic    #98  <Method void System.arraycopy(Object, int, Object, int, int)>
		float f = 0.0F;
	//   17   27:fconst_0        
	//   18   28:fstore_2        
		calculated = false;
	//   19   29:aload_0         
	//   20   30:iconst_0        
	//   21   31:putfield        #62  <Field boolean calculated>
		int i = 0;
	//   22   34:iconst_0        
	//   23   35:istore_3        
		while(i < af.length) 
	//*  24   36:iload_3         
	//*  25   37:aload_1         
	//*  26   38:arraylength     
	//*  27   39:icmpge          129
		{
			PdfPCell pdfpcell = cells[i];
	//   28   42:aload_0         
	//   29   43:getfield        #80  <Field PdfPCell[] cells>
	//   30   46:iload_3         
	//   31   47:aaload          
	//   32   48:astore          6
			if(pdfpcell == null)
	//*  33   50:aload           6
	//*  34   52:ifnonnull       68
			{
				f += af[i];
	//   35   55:fload_2         
	//   36   56:aload_1         
	//   37   57:iload_3         
	//   38   58:faload          
	//   39   59:fadd            
	//   40   60:fstore_2        
			} else
	//*  41   61:iload_3         
	//*  42   62:iconst_1        
	//*  43   63:iadd            
	//*  44   64:istore_3        
	//*  45   65:goto            36
			{
				pdfpcell.setLeft(f);
	//   46   68:aload           6
	//   47   70:fload_2         
	//   48   71:invokevirtual   #258 <Method void PdfPCell.setLeft(float)>
				int k = pdfpcell.getColspan();
	//   49   74:aload           6
	//   50   76:invokevirtual   #188 <Method int PdfPCell.getColspan()>
	//   51   79:istore          5
				int j;
				for(j = i; j < i + k; j++)
	//*  52   81:iload_3         
	//*  53   82:istore          4
	//*  54   84:iload           4
	//*  55   86:iload_3         
	//*  56   87:iload           5
	//*  57   89:iadd            
	//*  58   90:icmpge          109
					f += af[j];
	//   59   93:fload_2         
	//   60   94:aload_1         
	//   61   95:iload           4
	//   62   97:faload          
	//   63   98:fadd            
	//   64   99:fstore_2        

	//   65  100:iload           4
	//   66  102:iconst_1        
	//   67  103:iadd            
	//   68  104:istore          4
	//*  69  106:goto            84
				i = j - 1;
	//   70  109:iload           4
	//   71  111:iconst_1        
	//   72  112:isub            
	//   73  113:istore_3        
				pdfpcell.setRight(f);
	//   74  114:aload           6
	//   75  116:fload_2         
	//   76  117:invokevirtual   #261 <Method void PdfPCell.setRight(float)>
				pdfpcell.setTop(0.0F);
	//   77  120:aload           6
	//   78  122:fconst_0        
	//   79  123:invokevirtual   #264 <Method void PdfPCell.setTop(float)>
			}
			i++;
		}
	//*  80  126:goto            61
		return true;
	//   81  129:iconst_1        
	//   82  130:ireturn         
	}

	public PdfPRow splitRow(PdfPTable pdfptable, int i, float f)
	{
		boolean flag1;
		int j;
		float af[];
		float af1[];
		float af2[];
		PdfPCell apdfpcell[];
		LOGGER.info(String.format("Splitting row %s available height: %s", new Object[] {
			Integer.valueOf(i), Float.valueOf(f)
		}));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Logger LOGGER>
	//    2    4:ldc2            #270 <String "Splitting row %s available height: %s">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:iload_2         
	//    8   14:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:fload_3         
	//   13   21:invokestatic    #281 <Method Float Float.valueOf(float)>
	//   14   24:aastore         
	//   15   25:invokestatic    #287 <Method String String.format(String, Object[])>
	//   16   28:invokeinterface #138 <Method void Logger.info(String)>
		apdfpcell = new PdfPCell[cells.length];
	//   17   33:aload_0         
	//   18   34:getfield        #80  <Field PdfPCell[] cells>
	//   19   37:arraylength     
	//   20   38:anewarray       PdfPCell[]
	//   21   41:astore          16
		af = new float[cells.length];
	//   22   43:aload_0         
	//   23   44:getfield        #80  <Field PdfPCell[] cells>
	//   24   47:arraylength     
	//   25   48:newarray        float[]
	//   26   50:astore          13
		af1 = new float[cells.length];
	//   27   52:aload_0         
	//   28   53:getfield        #80  <Field PdfPCell[] cells>
	//   29   56:arraylength     
	//   30   57:newarray        float[]
	//   31   59:astore          14
		af2 = new float[cells.length];
	//   32   61:aload_0         
	//   33   62:getfield        #80  <Field PdfPCell[] cells>
	//   34   65:arraylength     
	//   35   66:newarray        float[]
	//   36   68:astore          15
		flag1 = true;
	//   37   70:iconst_1        
	//   38   71:istore          10
		j = 0;
	//   39   73:iconst_0        
	//   40   74:istore          11
_L2:
		float f1;
		boolean flag;
		Object obj;
		if(j >= cells.length)
			break MISSING_BLOCK_LABEL_649;
	//   41   76:iload           11
	//   42   78:aload_0         
	//   43   79:getfield        #80  <Field PdfPCell[] cells>
	//   44   82:arraylength     
	//   45   83:icmpge          649
		f1 = f;
	//   46   86:fload_3         
	//   47   87:fstore          4
		obj = ((Object) (cells[j]));
	//   48   89:aload_0         
	//   49   90:getfield        #80  <Field PdfPCell[] cells>
	//   50   93:iload           11
	//   51   95:aaload          
	//   52   96:astore          17
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//   53   98:aload           17
	//   54  100:ifnonnull       256
		int k = i;
	//   55  103:iload_2         
	//   56  104:istore          12
		flag = flag1;
	//   57  106:iload           10
	//   58  108:istore          9
		if(pdfptable.rowSpanAbove(k, j))
	//*  59  110:aload_1         
	//*  60  111:iload           12
	//*  61  113:iload           11
	//*  62  115:invokevirtual   #291 <Method boolean PdfPTable.rowSpanAbove(int, int)>
	//*  63  118:ifeq            243
		{
			do
			{
				k--;
	//   64  121:iload           12
	//   65  123:iconst_1        
	//   66  124:isub            
	//   67  125:istore          12
				if(!pdfptable.rowSpanAbove(k, j))
					break;
	//   68  127:aload_1         
	//   69  128:iload           12
	//   70  130:iload           11
	//   71  132:invokevirtual   #291 <Method boolean PdfPTable.rowSpanAbove(int, int)>
	//   72  135:ifeq            155
				f1 += pdfptable.getRow(k).getMaxHeights();
	//   73  138:fload           4
	//   74  140:aload_1         
	//   75  141:iload           12
	//   76  143:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//   77  146:invokevirtual   #293 <Method float getMaxHeights()>
	//   78  149:fadd            
	//   79  150:fstore          4
			} while(true);
	//   80  152:goto            121
			obj = ((Object) (pdfptable.getRow(k)));
	//   81  155:aload_1         
	//   82  156:iload           12
	//   83  158:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//   84  161:astore          17
			flag = flag1;
	//   85  163:iload           10
	//   86  165:istore          9
			if(obj != null)
	//*  87  167:aload           17
	//*  88  169:ifnull          243
			{
				flag = flag1;
	//   89  172:iload           10
	//   90  174:istore          9
				if(((PdfPRow) (obj)).getCells()[j] != null)
	//*  91  176:aload           17
	//*  92  178:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//*  93  181:iload           11
	//*  94  183:aaload          
	//*  95  184:ifnull          243
				{
					apdfpcell[j] = new PdfPCell(((PdfPRow) (obj)).getCells()[j]);
	//   96  187:aload           16
	//   97  189:iload           11
	//   98  191:new             #82  <Class PdfPCell>
	//   99  194:dup             
	//  100  195:aload           17
	//  101  197:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//  102  200:iload           11
	//  103  202:aaload          
	//  104  203:invokespecial   #90  <Method void PdfPCell(PdfPCell)>
	//  105  206:aastore         
					apdfpcell[j].setColumn(((ColumnText) (null)));
	//  106  207:aload           16
	//  107  209:iload           11
	//  108  211:aaload          
	//  109  212:aconst_null     
	//  110  213:invokevirtual   #171 <Method void PdfPCell.setColumn(ColumnText)>
					apdfpcell[j].setRowspan((((PdfPRow) (obj)).getCells()[j].getRowspan() - i) + k);
	//  111  216:aload           16
	//  112  218:iload           11
	//  113  220:aaload          
	//  114  221:aload           17
	//  115  223:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//  116  226:iload           11
	//  117  228:aaload          
	//  118  229:invokevirtual   #149 <Method int PdfPCell.getRowspan()>
	//  119  232:iload_2         
	//  120  233:isub            
	//  121  234:iload           12
	//  122  236:iadd            
	//  123  237:invokevirtual   #296 <Method void PdfPCell.setRowspan(int)>
					flag = false;
	//  124  240:iconst_0        
	//  125  241:istore          9
				}
			}
		}
_L5:
		j++;
	//  126  243:iload           11
	//  127  245:iconst_1        
	//  128  246:iadd            
	//  129  247:istore          11
		flag1 = flag;
	//  130  249:iload           9
	//  131  251:istore          10
		if(true) goto _L2; else goto _L1
	//  132  253:goto            76
_L1:
		PdfPCell pdfpcell;
		Object obj1;
		af[j] = ((PdfPCell) (obj)).getCalculatedHeight();
	//  133  256:aload           13
	//  134  258:iload           11
	//  135  260:aload           17
	//  136  262:invokevirtual   #145 <Method float PdfPCell.getCalculatedHeight()>
	//  137  265:fastore         
		af1[j] = ((PdfPCell) (obj)).getFixedHeight();
	//  138  266:aload           14
	//  139  268:iload           11
	//  140  270:aload           17
	//  141  272:invokevirtual   #299 <Method float PdfPCell.getFixedHeight()>
	//  142  275:fastore         
		af2[j] = ((PdfPCell) (obj)).getMinimumHeight();
	//  143  276:aload           15
	//  144  278:iload           11
	//  145  280:aload           17
	//  146  282:invokevirtual   #302 <Method float PdfPCell.getMinimumHeight()>
	//  147  285:fastore         
		obj1 = ((Object) (((PdfPCell) (obj)).getImage()));
	//  148  286:aload           17
	//  149  288:invokevirtual   #306 <Method Image PdfPCell.getImage()>
	//  150  291:astore          19
		pdfpcell = new PdfPCell(((PdfPCell) (obj)));
	//  151  293:new             #82  <Class PdfPCell>
	//  152  296:dup             
	//  153  297:aload           17
	//  154  299:invokespecial   #90  <Method void PdfPCell(PdfPCell)>
	//  155  302:astore          18
		if(obj1 == null) goto _L4; else goto _L3
	//  156  304:aload           19
	//  157  306:ifnull          388
_L3:
label0:
		{
			float f2 = ((PdfPCell) (obj)).getEffectivePaddingBottom() + ((PdfPCell) (obj)).getEffectivePaddingTop() + 2.0F;
	//  158  309:aload           17
	//  159  311:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//  160  314:aload           17
	//  161  316:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  162  319:fadd            
	//  163  320:fconst_2        
	//  164  321:fadd            
	//  165  322:fstore          5
			if(!((Image) (obj1)).isScaleToFitHeight())
	//* 166  324:aload           19
	//* 167  326:invokevirtual   #317 <Method boolean Image.isScaleToFitHeight()>
	//* 168  329:ifne            350
			{
				flag = flag1;
	//  169  332:iload           10
	//  170  334:istore          9
				if(((Image) (obj1)).getScaledHeight() + f2 >= f1)
					break label0;
	//  171  336:aload           19
	//  172  338:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//  173  341:fload           5
	//  174  343:fadd            
	//  175  344:fload           4
	//  176  346:fcmpg           
	//  177  347:ifge            371
			}
			flag = flag1;
	//  178  350:iload           10
	//  179  352:istore          9
			if(f1 > f2)
	//* 180  354:fload           4
	//* 181  356:fload           5
	//* 182  358:fcmpl           
	//* 183  359:ifle            371
			{
				pdfpcell.setPhrase(((com.itextpdf.text.Phrase) (null)));
	//  184  362:aload           18
	//  185  364:aconst_null     
	//  186  365:invokevirtual   #324 <Method void PdfPCell.setPhrase(com.itextpdf.text.Phrase)>
				flag = false;
	//  187  368:iconst_0        
	//  188  369:istore          9
			}
		}
_L6:
		apdfpcell[j] = pdfpcell;
	//  189  371:aload           16
	//  190  373:iload           11
	//  191  375:aload           18
	//  192  377:aastore         
		((PdfPCell) (obj)).setCalculatedHeight(f1);
	//  193  378:aload           17
	//  194  380:fload           4
	//  195  382:invokevirtual   #327 <Method void PdfPCell.setCalculatedHeight(float)>
		  goto _L5
	//* 196  385:goto            243
_L4:
		float f3;
		float f4;
		float f5;
		float f6;
		obj1 = ((Object) (ColumnText.duplicate(((PdfPCell) (obj)).getColumn())));
	//  197  388:aload           17
	//  198  390:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//  199  393:invokestatic    #331 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//  200  396:astore          19
		f4 = ((PdfPCell) (obj)).getLeft() + ((PdfPCell) (obj)).getEffectivePaddingLeft();
	//  201  398:aload           17
	//  202  400:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  203  403:aload           17
	//  204  405:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  205  408:fadd            
	//  206  409:fstore          6
		f5 = (((PdfPCell) (obj)).getTop() + ((PdfPCell) (obj)).getEffectivePaddingBottom()) - f1;
	//  207  411:aload           17
	//  208  413:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//  209  416:aload           17
	//  210  418:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//  211  421:fadd            
	//  212  422:fload           4
	//  213  424:fsub            
	//  214  425:fstore          7
		f3 = ((PdfPCell) (obj)).getRight() - ((PdfPCell) (obj)).getEffectivePaddingRight();
	//  215  427:aload           17
	//  216  429:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//  217  432:aload           17
	//  218  434:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  219  437:fsub            
	//  220  438:fstore          5
		f6 = ((PdfPCell) (obj)).getTop() - ((PdfPCell) (obj)).getEffectivePaddingTop();
	//  221  440:aload           17
	//  222  442:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//  223  445:aload           17
	//  224  447:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  225  450:fsub            
	//  226  451:fstore          8
		switch(((PdfPCell) (obj)).getRotation())
	//* 227  453:aload           17
	//* 228  455:invokevirtual   #349 <Method int PdfPCell.getRotation()>
		{
	//* 229  458:lookupswitch    2: default 484
	//	               90: 577
	//	               270: 577
		default:
			if(((PdfPCell) (obj)).isNoWrap())
	//* 230  484:aload           17
	//* 231  486:invokevirtual   #352 <Method boolean PdfPCell.isNoWrap()>
	//* 232  489:ifeq            496
				f3 = 20000F;
	//  233  492:ldc1            #13  <Float 20000F>
	//  234  494:fstore          5
			f3 = setColumn(((ColumnText) (obj1)), f4, 1E-05F + f5, f3, f6);
	//  235  496:aload           19
	//  236  498:fload           6
	//  237  500:ldc2            #353 <Float 1E-05F>
	//  238  503:fload           7
	//  239  505:fadd            
	//  240  506:fload           5
	//  241  508:fload           8
	//  242  510:invokestatic    #355 <Method float setColumn(ColumnText, float, float, float, float)>
	//  243  513:fstore          5
			break;

		case 90: // 'Z'
		case 270: 
			break MISSING_BLOCK_LABEL_577;
		}
_L7:
		int l;
		try
		{
			l = ((ColumnText) (obj1)).go(true);
	//  244  515:aload           19
	//  245  517:iconst_1        
	//  246  518:invokevirtual   #359 <Method int ColumnText.go(boolean)>
	//  247  521:istore          12
		}
	//* 248  523:aload           19
	//* 249  525:invokevirtual   #362 <Method float ColumnText.getYLine()>
	//* 250  528:fload           5
	//* 251  530:fcmpl           
	//* 252  531:ifne            605
	//* 253  534:iconst_1        
	//* 254  535:istore          9
	//* 255  537:iload           9
	//* 256  539:ifeq            611
	//* 257  542:aload           18
	//* 258  544:aload           17
	//* 259  546:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//* 260  549:invokestatic    #331 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//* 261  552:invokevirtual   #171 <Method void PdfPCell.setColumn(ColumnText)>
	//* 262  555:aload           19
	//* 263  557:fconst_0        
	//* 264  558:invokevirtual   #365 <Method void ColumnText.setFilledWidth(float)>
	//* 265  561:iload           10
	//* 266  563:ifeq            643
	//* 267  566:iload           9
	//* 268  568:ifeq            643
	//* 269  571:iconst_1        
	//* 270  572:istore          9
	//* 271  574:goto            371
	//* 272  577:aload           19
	//* 273  579:fload           7
	//* 274  581:fload           6
	//* 275  583:fload           8
	//* 276  585:fload           5
	//* 277  587:invokestatic    #355 <Method float setColumn(ColumnText, float, float, float, float)>
	//* 278  590:fstore          5
	//* 279  592:goto            515
		// Misplaced declaration of an exception variable
		catch(PdfPTable pdfptable)
	//* 280  595:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfptable)));
	//  281  596:new             #367 <Class ExceptionConverter>
	//  282  599:dup             
	//  283  600:aload_1         
	//  284  601:invokespecial   #370 <Method void ExceptionConverter(Exception)>
	//  285  604:athrow          
		}
		if(((ColumnText) (obj1)).getYLine() == f3)
			flag = true;
		else
			flag = false;
	//  286  605:iconst_0        
	//  287  606:istore          9
		if(flag)
		{
			pdfpcell.setColumn(ColumnText.duplicate(((PdfPCell) (obj)).getColumn()));
			((ColumnText) (obj1)).setFilledWidth(0.0F);
		} else
	//* 288  608:goto            537
		if((l & 1) == 0)
	//* 289  611:iload           12
	//* 290  613:iconst_1        
	//* 291  614:iand            
	//* 292  615:ifne            634
		{
			pdfpcell.setColumn(((ColumnText) (obj1)));
	//  293  618:aload           18
	//  294  620:aload           19
	//  295  622:invokevirtual   #171 <Method void PdfPCell.setColumn(ColumnText)>
			((ColumnText) (obj1)).setFilledWidth(0.0F);
	//  296  625:aload           19
	//  297  627:fconst_0        
	//  298  628:invokevirtual   #365 <Method void ColumnText.setFilledWidth(float)>
		} else
	//* 299  631:goto            561
		{
			pdfpcell.setPhrase(((com.itextpdf.text.Phrase) (null)));
	//  300  634:aload           18
	//  301  636:aconst_null     
	//  302  637:invokevirtual   #324 <Method void PdfPCell.setPhrase(com.itextpdf.text.Phrase)>
		}
		if(flag1 && flag)
			flag = true;
		else
	//* 303  640:goto            561
			flag = false;
	//  304  643:iconst_0        
	//  305  644:istore          9
		  goto _L6
		f3 = setColumn(((ColumnText) (obj1)), f5, f4, f6, f3);
		  goto _L7
	//* 306  646:goto            574
		if(flag1)
	//* 307  649:iload           10
	//* 308  651:ifeq            724
		{
			i = 0;
	//  309  654:iconst_0        
	//  310  655:istore_2        
			while(i < cells.length) 
	//* 311  656:iload_2         
	//* 312  657:aload_0         
	//* 313  658:getfield        #80  <Field PdfPCell[] cells>
	//* 314  661:arraylength     
	//* 315  662:icmpge          722
			{
				pdfptable = ((PdfPTable) (cells[i]));
	//  316  665:aload_0         
	//  317  666:getfield        #80  <Field PdfPCell[] cells>
	//  318  669:iload_2         
	//  319  670:aaload          
	//  320  671:astore_1        
				if(pdfptable != null)
	//* 321  672:aload_1         
	//* 322  673:ifnonnull       683
	//* 323  676:iload_2         
	//* 324  677:iconst_1        
	//* 325  678:iadd            
	//* 326  679:istore_2        
	//* 327  680:goto            656
				{
					((PdfPCell) (pdfptable)).setCalculatedHeight(af[i]);
	//  328  683:aload_1         
	//  329  684:aload           13
	//  330  686:iload_2         
	//  331  687:faload          
	//  332  688:invokevirtual   #327 <Method void PdfPCell.setCalculatedHeight(float)>
					if(af1[i] > 0.0F)
	//* 333  691:aload           14
	//* 334  693:iload_2         
	//* 335  694:faload          
	//* 336  695:fconst_0        
	//* 337  696:fcmpl           
	//* 338  697:ifle            711
						((PdfPCell) (pdfptable)).setFixedHeight(af1[i]);
	//  339  700:aload_1         
	//  340  701:aload           14
	//  341  703:iload_2         
	//  342  704:faload          
	//  343  705:invokevirtual   #373 <Method void PdfPCell.setFixedHeight(float)>
					else
	//* 344  708:goto            676
						((PdfPCell) (pdfptable)).setMinimumHeight(af2[i]);
	//  345  711:aload_1         
	//  346  712:aload           15
	//  347  714:iload_2         
	//  348  715:faload          
	//  349  716:invokevirtual   #376 <Method void PdfPCell.setMinimumHeight(float)>
				}
				i++;
			}
	//* 350  719:goto            676
			return null;
	//  351  722:aconst_null     
	//  352  723:areturn         
		}
		calculateHeights();
	//  353  724:aload_0         
	//  354  725:invokevirtual   #193 <Method void calculateHeights()>
		pdfptable = ((PdfPTable) (new PdfPRow(apdfpcell, this)));
	//  355  728:new             #2   <Class PdfPRow>
	//  356  731:dup             
	//  357  732:aload           16
	//  358  734:aload_0         
	//  359  735:invokespecial   #110 <Method void PdfPRow(PdfPCell[], PdfPRow)>
	//  360  738:astore_1        
		pdfptable.widths = (float[])(float[])((float []) (widths)).clone();
	//  361  739:aload_1         
	//  362  740:aload_0         
	//  363  741:getfield        #92  <Field float[] widths>
	//  364  744:invokevirtual   #381 <Method Object _5B_F.clone()>
	//  365  747:checkcast       #377 <Class float[]>
	//  366  750:checkcast       #377 <Class float[]>
	//  367  753:putfield        #92  <Field float[] widths>
		return ((PdfPRow) (pdfptable));
	//  368  756:aload_1         
	//  369  757:areturn         
		  goto _L6
	}

	public void splitRowspans(PdfPTable pdfptable, int i, PdfPTable pdfptable1, int j)
	{
		if(pdfptable != null && pdfptable1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       9
	//*   4    8:return          
		{
			int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
			while(k < cells.length) 
	//*   7   12:iload           5
	//*   8   14:aload_0         
	//*   9   15:getfield        #80  <Field PdfPCell[] cells>
	//*  10   18:arraylength     
	//*  11   19:icmpge          8
				if(cells[k] == null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #80  <Field PdfPCell[] cells>
	//*  14   26:iload           5
	//*  15   28:aaload          
	//*  16   29:ifnonnull       167
				{
					int l = pdfptable.getCellStartRowIndex(i, k);
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload           5
	//   20   36:invokevirtual   #387 <Method int PdfPTable.getCellStartRowIndex(int, int)>
	//   21   39:istore          6
					int j1 = pdfptable1.getCellStartRowIndex(j, k);
	//   22   41:aload_3         
	//   23   42:iload           4
	//   24   44:iload           5
	//   25   46:invokevirtual   #387 <Method int PdfPTable.getCellStartRowIndex(int, int)>
	//   26   49:istore          7
					PdfPCell pdfpcell = pdfptable.getRow(l).getCells()[k];
	//   27   51:aload_1         
	//   28   52:iload           6
	//   29   54:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//   30   57:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//   31   60:iload           5
	//   32   62:aaload          
	//   33   63:astore          8
					PdfPCell pdfpcell1 = pdfptable1.getRow(j1).getCells()[k];
	//   34   65:aload_3         
	//   35   66:iload           7
	//   36   68:invokevirtual   #160 <Method PdfPRow PdfPTable.getRow(int)>
	//   37   71:invokevirtual   #164 <Method PdfPCell[] getCells()>
	//   38   74:iload           5
	//   39   76:aaload          
	//   40   77:astore          9
					if(pdfpcell != null)
	//*  41   79:aload           8
	//*  42   81:ifnull          158
					{
						if(!$assertionsDisabled && pdfpcell1 == null)
	//*  43   84:getstatic       #43  <Field boolean $assertionsDisabled>
	//*  44   87:ifne            103
	//*  45   90:aload           9
	//*  46   92:ifnonnull       103
							throw new AssertionError();
	//   47   95:new             #389 <Class AssertionError>
	//   48   98:dup             
	//   49   99:invokespecial   #390 <Method void AssertionError()>
	//   50  102:athrow          
						cells[k] = new PdfPCell(pdfpcell1);
	//   51  103:aload_0         
	//   52  104:getfield        #80  <Field PdfPCell[] cells>
	//   53  107:iload           5
	//   54  109:new             #82  <Class PdfPCell>
	//   55  112:dup             
	//   56  113:aload           9
	//   57  115:invokespecial   #90  <Method void PdfPCell(PdfPCell)>
	//   58  118:aastore         
						int i1 = (j - j1) + 1;
	//   59  119:iload           4
	//   60  121:iload           7
	//   61  123:isub            
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:istore          6
						cells[k].setRowspan(pdfpcell1.getRowspan() - i1);
	//   65  128:aload_0         
	//   66  129:getfield        #80  <Field PdfPCell[] cells>
	//   67  132:iload           5
	//   68  134:aaload          
	//   69  135:aload           9
	//   70  137:invokevirtual   #149 <Method int PdfPCell.getRowspan()>
	//   71  140:iload           6
	//   72  142:isub            
	//   73  143:invokevirtual   #296 <Method void PdfPCell.setRowspan(int)>
						pdfpcell.setRowspan(i1);
	//   74  146:aload           8
	//   75  148:iload           6
	//   76  150:invokevirtual   #296 <Method void PdfPCell.setRowspan(int)>
						calculated = false;
	//   77  153:aload_0         
	//   78  154:iconst_0        
	//   79  155:putfield        #62  <Field boolean calculated>
					}
					k++;
	//   80  158:iload           5
	//   81  160:iconst_1        
	//   82  161:iadd            
	//   83  162:istore          5
				} else
	//*  84  164:goto            12
				{
					k += cells[k].getColspan();
	//   85  167:iload           5
	//   86  169:aload_0         
	//   87  170:getfield        #80  <Field PdfPCell[] cells>
	//   88  173:iload           5
	//   89  175:aaload          
	//   90  176:invokevirtual   #188 <Method int PdfPCell.getColspan()>
	//   91  179:iadd            
	//   92  180:istore          5
				}
		}
	//*  93  182:goto            12
	}

	public void writeBorderAndBackground(float f, float f1, float f2, PdfPCell pdfpcell, PdfContentByte apdfcontentbyte[])
	{
		com.itextpdf.text.BaseColor basecolor = pdfpcell.getBackgroundColor();
	//    0    0:aload           4
	//    1    2:invokevirtual   #396 <Method com.itextpdf.text.BaseColor PdfPCell.getBackgroundColor()>
	//    2    5:astore          7
		if(basecolor != null || pdfpcell.hasBorders())
	//*   3    7:aload           7
	//*   4    9:ifnonnull       20
	//*   5   12:aload           4
	//*   6   14:invokevirtual   #399 <Method boolean PdfPCell.hasBorders()>
	//*   7   17:ifeq            130
		{
			float f3 = pdfpcell.getRight() + f;
	//    8   20:aload           4
	//    9   22:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//   10   25:fload_1         
	//   11   26:fadd            
	//   12   27:fstore          6
			f1 = pdfpcell.getTop() + f1;
	//   13   29:aload           4
	//   14   31:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//   15   34:fload_2         
	//   16   35:fadd            
	//   17   36:fstore_2        
			f = pdfpcell.getLeft() + f;
	//   18   37:aload           4
	//   19   39:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//   20   42:fload_1         
	//   21   43:fadd            
	//   22   44:fstore_1        
			f2 = f1 - f2;
	//   23   45:fload_2         
	//   24   46:fload_3         
	//   25   47:fsub            
	//   26   48:fstore_3        
			if(basecolor != null)
	//*  27   49:aload           7
	//*  28   51:ifnull          86
			{
				PdfContentByte pdfcontentbyte = apdfcontentbyte[1];
	//   29   54:aload           5
	//   30   56:iconst_1        
	//   31   57:aaload          
	//   32   58:astore          8
				pdfcontentbyte.setColorFill(basecolor);
	//   33   60:aload           8
	//   34   62:aload           7
	//   35   64:invokevirtual   #403 <Method void PdfContentByte.setColorFill(com.itextpdf.text.BaseColor)>
				pdfcontentbyte.rectangle(f, f2, f3 - f, f1 - f2);
	//   36   67:aload           8
	//   37   69:fload_1         
	//   38   70:fload_3         
	//   39   71:fload           6
	//   40   73:fload_1         
	//   41   74:fsub            
	//   42   75:fload_2         
	//   43   76:fload_3         
	//   44   77:fsub            
	//   45   78:invokevirtual   #406 <Method void PdfContentByte.rectangle(float, float, float, float)>
				pdfcontentbyte.fill();
	//   46   81:aload           8
	//   47   83:invokevirtual   #409 <Method void PdfContentByte.fill()>
			}
			if(pdfpcell.hasBorders())
	//*  48   86:aload           4
	//*  49   88:invokevirtual   #399 <Method boolean PdfPCell.hasBorders()>
	//*  50   91:ifeq            130
			{
				Rectangle rectangle = new Rectangle(f, f2, f3, f1);
	//   51   94:new             #411 <Class Rectangle>
	//   52   97:dup             
	//   53   98:fload_1         
	//   54   99:fload_3         
	//   55  100:fload           6
	//   56  102:fload_2         
	//   57  103:invokespecial   #413 <Method void Rectangle(float, float, float, float)>
	//   58  106:astore          7
				rectangle.cloneNonPositionParameters(((Rectangle) (pdfpcell)));
	//   59  108:aload           7
	//   60  110:aload           4
	//   61  112:invokevirtual   #417 <Method void Rectangle.cloneNonPositionParameters(Rectangle)>
				rectangle.setBackgroundColor(((com.itextpdf.text.BaseColor) (null)));
	//   62  115:aload           7
	//   63  117:aconst_null     
	//   64  118:invokevirtual   #420 <Method void Rectangle.setBackgroundColor(com.itextpdf.text.BaseColor)>
				apdfcontentbyte[2].rectangle(rectangle);
	//   65  121:aload           5
	//   66  123:iconst_2        
	//   67  124:aaload          
	//   68  125:aload           7
	//   69  127:invokevirtual   #422 <Method void PdfContentByte.rectangle(Rectangle)>
			}
		}
	//   70  130:return          
	}

	public void writeCells(int i, int j, float f, float f1, PdfContentByte apdfcontentbyte[], boolean flag)
	{
		int k;
		if(!calculated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean calculated>
	//*   2    4:ifne            11
			calculateHeights();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #193 <Method void calculateHeights()>
		if(j < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            37
			k = cells.length;
	//    7   15:aload_0         
	//    8   16:getfield        #80  <Field PdfPCell[] cells>
	//    9   19:arraylength     
	//   10   20:istore          15
		else
	//*  11   22:iload_1         
	//*  12   23:istore_2        
	//*  13   24:iload_1         
	//*  14   25:ifge            30
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload           15
	//*  19   33:icmplt          51
	//*  20   36:return          
			k = Math.min(j, cells.length);
	//   21   37:iload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #80  <Field PdfPCell[] cells>
	//   24   42:arraylength     
	//   25   43:invokestatic    #429 <Method int Math.min(int, int)>
	//   26   46:istore          15
		j = i;
		if(i < 0)
			j = 0;
		if(j < k) goto _L2; else goto _L1
_L1:
		return;
	//*  27   48:goto            22
_L2:
		i = j;
	//   28   51:iload_2         
	//   29   52:istore_1        
_L7:
		if(i >= 0 && cells[i] == null) goto _L4; else goto _L3
	//   30   53:iload_1         
	//   31   54:iflt            66
	//   32   57:aload_0         
	//   33   58:getfield        #80  <Field PdfPCell[] cells>
	//   34   61:iload_1         
	//   35   62:aaload          
	//   36   63:ifnull          145
_L3:
		float f5;
		j = i;
	//   37   66:iload_1         
	//   38   67:istore_2        
		if(i < 0)
	//*  39   68:iload_1         
	//*  40   69:ifge            74
			j = 0;
	//   41   72:iconst_0        
	//   42   73:istore_2        
		f5 = f;
	//   43   74:fload_3         
	//   44   75:fstore          9
		if(cells[j] != null)
	//*  45   77:aload_0         
	//*  46   78:getfield        #80  <Field PdfPCell[] cells>
	//*  47   81:iload_2         
	//*  48   82:aaload          
	//*  49   83:ifnull          99
			f5 = f - cells[j].getLeft();
	//   50   86:fload_3         
	//   51   87:aload_0         
	//   52   88:getfield        #80  <Field PdfPCell[] cells>
	//   53   91:iload_2         
	//   54   92:aaload          
	//   55   93:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//   56   96:fsub            
	//   57   97:fstore          9
		if(isTagged(apdfcontentbyte[3]))
	//*  58   99:aload           5
	//*  59  101:iconst_3        
	//*  60  102:aaload          
	//*  61  103:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//*  62  106:ifeq            117
			apdfcontentbyte[3].openMCBlock(((IAccessibleElement) (this)));
	//   63  109:aload           5
	//   64  111:iconst_3        
	//   65  112:aaload          
	//   66  113:aload_0         
	//   67  114:invokevirtual   #435 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
		i = j;
	//   68  117:iload_2         
	//   69  118:istore_1        
_L6:
		PdfPCell pdfpcell;
		if(i >= k)
			continue; /* Loop/switch isn't completed */
	//   70  119:iload_1         
	//   71  120:iload           15
	//   72  122:icmpge          1742
		pdfpcell = cells[i];
	//   73  125:aload_0         
	//   74  126:getfield        #80  <Field PdfPCell[] cells>
	//   75  129:iload_1         
	//   76  130:aaload          
	//   77  131:astore          18
		if(pdfpcell != null)
			break; /* Loop/switch isn't completed */
	//   78  133:aload           18
	//   79  135:ifnonnull       174
_L16:
		i++;
	//   80  138:iload_1         
	//   81  139:iconst_1        
	//   82  140:iadd            
	//   83  141:istore_1        
		if(true) goto _L6; else goto _L5
	//   84  142:goto            119
_L4:
		float f2 = f;
	//   85  145:fload_3         
	//   86  146:fstore          7
		if(i > 0)
	//*  87  148:iload_1         
	//*  88  149:ifle            164
			f2 = f - widths[i - 1];
	//   89  152:fload_3         
	//   90  153:aload_0         
	//   91  154:getfield        #92  <Field float[] widths>
	//   92  157:iload_1         
	//   93  158:iconst_1        
	//   94  159:isub            
	//   95  160:faload          
	//   96  161:fsub            
	//   97  162:fstore          7
		i--;
	//   98  164:iload_1         
	//   99  165:iconst_1        
	//  100  166:isub            
	//  101  167:istore_1        
		f = f2;
	//  102  168:fload           7
	//  103  170:fstore_3        
		  goto _L7
	//* 104  171:goto            53
_L5:
		float f3;
		float f9;
		Image image;
		if(isTagged(apdfcontentbyte[3]))
	//* 105  174:aload           5
	//* 106  176:iconst_3        
	//* 107  177:aaload          
	//* 108  178:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//* 109  181:ifeq            193
			apdfcontentbyte[3].openMCBlock(((IAccessibleElement) (pdfpcell)));
	//  110  184:aload           5
	//  111  186:iconst_3        
	//  112  187:aaload          
	//  113  188:aload           18
	//  114  190:invokevirtual   #435 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
		f9 = maxHeight + extraHeights[i];
	//  115  193:aload_0         
	//  116  194:getfield        #60  <Field float maxHeight>
	//  117  197:aload_0         
	//  118  198:getfield        #199 <Field float[] extraHeights>
	//  119  201:iload_1         
	//  120  202:faload          
	//  121  203:fadd            
	//  122  204:fstore          13
		writeBorderAndBackground(f5, f1, f9, pdfpcell, apdfcontentbyte);
	//  123  206:aload_0         
	//  124  207:fload           9
	//  125  209:fload           4
	//  126  211:fload           13
	//  127  213:aload           18
	//  128  215:aload           5
	//  129  217:invokevirtual   #437 <Method void writeBorderAndBackground(float, float, float, PdfPCell, PdfContentByte[])>
		image = pdfpcell.getImage();
	//  130  220:aload           18
	//  131  222:invokevirtual   #306 <Method Image PdfPCell.getImage()>
	//  132  225:astore          17
		f3 = (pdfpcell.getTop() + f1) - pdfpcell.getEffectivePaddingTop();
	//  133  227:aload           18
	//  134  229:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//  135  232:fload           4
	//  136  234:fadd            
	//  137  235:aload           18
	//  138  237:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  139  240:fsub            
	//  140  241:fstore          7
		f = f3;
	//  141  243:fload           7
	//  142  245:fstore_3        
		if(pdfpcell.getHeight() > f9) goto _L9; else goto _L8
	//  143  246:aload           18
	//  144  248:invokevirtual   #440 <Method float PdfPCell.getHeight()>
	//  145  251:fload           13
	//  146  253:fcmpg           
	//  147  254:ifgt            287
_L8:
		pdfpcell.getVerticalAlignment();
	//  148  257:aload           18
	//  149  259:invokevirtual   #443 <Method int PdfPCell.getVerticalAlignment()>
		JVM INSTR tableswitch 5 6: default 284
	//	               5 650
	//	               6 623;
	//  150  262:tableswitch     5 6: default 284
	//	               5 650
	//	               6 623
		   goto _L10 _L11 _L12
_L10:
		f = f3;
	//  151  284:fload           7
	//  152  286:fstore_3        
_L9:
		if(image == null) goto _L14; else goto _L13
	//  153  287:aload           17
	//  154  289:ifnull          753
_L13:
		Object obj;
		obj = ((Object) (image));
	//  155  292:aload           17
	//  156  294:astore          16
		if(pdfpcell.getRotation() != 0)
	//* 157  296:aload           18
	//* 158  298:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 159  301:ifeq            337
		{
			obj = ((Object) (Image.getInstance(image)));
	//  160  304:aload           17
	//  161  306:invokestatic    #447 <Method Image Image.getInstance(Image)>
	//  162  309:astore          16
			((Image) (obj)).setRotation(((Image) (obj)).getImageRotation() + (float)(((double)pdfpcell.getRotation() * 3.1415926535897931D) / 180D));
	//  163  311:aload           16
	//  164  313:aload           16
	//  165  315:invokevirtual   #450 <Method float Image.getImageRotation()>
	//  166  318:aload           18
	//  167  320:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//  168  323:i2d             
	//  169  324:ldc2w           #451 <Double 3.1415926535897931D>
	//  170  327:dmul            
	//  171  328:ldc2w           #453 <Double 180D>
	//  172  331:ddiv            
	//  173  332:d2f             
	//  174  333:fadd            
	//  175  334:invokevirtual   #457 <Method void Image.setRotation(float)>
		}
		j = 0;
	//  176  337:iconst_0        
	//  177  338:istore_2        
		if(pdfpcell.getHeight() <= f9)
			break MISSING_BLOCK_LABEL_397;
	//  178  339:aload           18
	//  179  341:invokevirtual   #440 <Method float PdfPCell.getHeight()>
	//  180  344:fload           13
	//  181  346:fcmpl           
	//  182  347:ifle            397
		if(!((Image) (obj)).isScaleToFitHeight()) goto _L16; else goto _L15
	//  183  350:aload           16
	//  184  352:invokevirtual   #317 <Method boolean Image.isScaleToFitHeight()>
	//  185  355:ifeq            138
_L15:
		((Image) (obj)).scalePercent(100F);
	//  186  358:aload           16
	//  187  360:ldc2            #458 <Float 100F>
	//  188  363:invokevirtual   #461 <Method void Image.scalePercent(float)>
		((Image) (obj)).scalePercent(100F * ((f9 - pdfpcell.getEffectivePaddingTop() - pdfpcell.getEffectivePaddingBottom()) / ((Image) (obj)).getScaledHeight()));
	//  189  366:aload           16
	//  190  368:ldc2            #458 <Float 100F>
	//  191  371:fload           13
	//  192  373:aload           18
	//  193  375:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  194  378:fsub            
	//  195  379:aload           18
	//  196  381:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//  197  384:fsub            
	//  198  385:aload           16
	//  199  387:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//  200  390:fdiv            
	//  201  391:fmul            
	//  202  392:invokevirtual   #461 <Method void Image.scalePercent(float)>
		j = 1;
	//  203  395:iconst_1        
	//  204  396:istore_2        
		float f4;
		float f6;
		f3 = pdfpcell.getLeft() + f5 + pdfpcell.getEffectivePaddingLeft();
	//  205  397:aload           18
	//  206  399:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  207  402:fload           9
	//  208  404:fadd            
	//  209  405:aload           18
	//  210  407:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  211  410:fadd            
	//  212  411:fstore          7
		f4 = f3;
	//  213  413:fload           7
	//  214  415:fstore          8
		f6 = f;
	//  215  417:fload_3         
	//  216  418:fstore          10
		if(j == 0) goto _L18; else goto _L17
	//  217  420:iload_2         
	//  218  421:ifeq            474
_L17:
		pdfpcell.getHorizontalAlignment();
	//  219  424:aload           18
	//  220  426:invokevirtual   #464 <Method int PdfPCell.getHorizontalAlignment()>
		JVM INSTR tableswitch 1 2: default 452
	//	               1 679
	//	               2 717;
	//  221  429:tableswitch     1 2: default 452
	//	               1 679
	//	               2 717
		   goto _L19 _L20 _L21
_L19:
		f = f3;
	//  222  452:fload           7
	//  223  454:fstore_3        
_L22:
		f6 = (pdfpcell.getTop() + f1) - pdfpcell.getEffectivePaddingTop();
	//  224  455:aload           18
	//  225  457:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//  226  460:fload           4
	//  227  462:fadd            
	//  228  463:aload           18
	//  229  465:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  230  468:fsub            
	//  231  469:fstore          10
		f4 = f;
	//  232  471:fload_3         
	//  233  472:fstore          8
_L18:
		((Image) (obj)).setAbsolutePosition(f4, f6 - ((Image) (obj)).getScaledHeight());
	//  234  474:aload           16
	//  235  476:fload           8
	//  236  478:fload           10
	//  237  480:aload           16
	//  238  482:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//  239  485:fsub            
	//  240  486:invokevirtual   #468 <Method void Image.setAbsolutePosition(float, float)>
		try
		{
			if(isTagged(apdfcontentbyte[3]))
	//* 241  489:aload           5
	//* 242  491:iconst_3        
	//* 243  492:aaload          
	//* 244  493:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//* 245  496:ifeq            508
				apdfcontentbyte[3].openMCBlock(((IAccessibleElement) (obj)));
	//  246  499:aload           5
	//  247  501:iconst_3        
	//  248  502:aaload          
	//  249  503:aload           16
	//  250  505:invokevirtual   #435 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
			apdfcontentbyte[3].addImage(((Image) (obj)));
	//  251  508:aload           5
	//  252  510:iconst_3        
	//  253  511:aaload          
	//  254  512:aload           16
	//  255  514:invokevirtual   #472 <Method void PdfContentByte.addImage(Image)>
			if(isTagged(apdfcontentbyte[3]))
	//* 256  517:aload           5
	//* 257  519:iconst_3        
	//* 258  520:aaload          
	//* 259  521:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//* 260  524:ifeq            536
				apdfcontentbyte[3].closeMCBlock(((IAccessibleElement) (obj)));
	//  261  527:aload           5
	//  262  529:iconst_3        
	//  263  530:aaload          
	//  264  531:aload           16
	//  265  533:invokevirtual   #475 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		}
	//* 266  536:aload           18
	//* 267  538:invokevirtual   #479 <Method PdfPCellEvent PdfPCell.getCellEvent()>
	//* 268  541:astore          16
	//* 269  543:aload           16
	//* 270  545:ifnull          601
	//* 271  548:aload           16
	//* 272  550:aload           18
	//* 273  552:new             #411 <Class Rectangle>
	//* 274  555:dup             
	//* 275  556:aload           18
	//* 276  558:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//* 277  561:fload           9
	//* 278  563:fadd            
	//* 279  564:aload           18
	//* 280  566:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 281  569:fload           4
	//* 282  571:fadd            
	//* 283  572:fload           13
	//* 284  574:fsub            
	//* 285  575:aload           18
	//* 286  577:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//* 287  580:fload           9
	//* 288  582:fadd            
	//* 289  583:aload           18
	//* 290  585:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 291  588:fload           4
	//* 292  590:fadd            
	//* 293  591:invokespecial   #413 <Method void Rectangle(float, float, float, float)>
	//* 294  594:aload           5
	//* 295  596:invokeinterface #485 <Method void PdfPCellEvent.cellLayout(PdfPCell, Rectangle, PdfContentByte[])>
	//* 296  601:aload           5
	//* 297  603:iconst_3        
	//* 298  604:aaload          
	//* 299  605:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//* 300  608:ifeq            138
	//* 301  611:aload           5
	//* 302  613:iconst_3        
	//* 303  614:aaload          
	//* 304  615:aload           18
	//* 305  617:invokevirtual   #475 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 306  620:goto            138
	//* 307  623:aload           18
	//* 308  625:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 309  628:fload           4
	//* 310  630:fadd            
	//* 311  631:fload           13
	//* 312  633:fsub            
	//* 313  634:aload           18
	//* 314  636:invokevirtual   #440 <Method float PdfPCell.getHeight()>
	//* 315  639:fadd            
	//* 316  640:aload           18
	//* 317  642:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//* 318  645:fsub            
	//* 319  646:fstore_3        
	//* 320  647:goto            287
	//* 321  650:aload           18
	//* 322  652:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 323  655:fload           4
	//* 324  657:fadd            
	//* 325  658:aload           18
	//* 326  660:invokevirtual   #440 <Method float PdfPCell.getHeight()>
	//* 327  663:fload           13
	//* 328  665:fsub            
	//* 329  666:fconst_2        
	//* 330  667:fdiv            
	//* 331  668:fadd            
	//* 332  669:aload           18
	//* 333  671:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//* 334  674:fsub            
	//* 335  675:fstore_3        
	//* 336  676:goto            287
	//* 337  679:fload           9
	//* 338  681:aload           18
	//* 339  683:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//* 340  686:aload           18
	//* 341  688:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//* 342  691:fadd            
	//* 343  692:aload           18
	//* 344  694:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//* 345  697:fadd            
	//* 346  698:aload           18
	//* 347  700:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//* 348  703:fsub            
	//* 349  704:aload           16
	//* 350  706:invokevirtual   #488 <Method float Image.getScaledWidth()>
	//* 351  709:fsub            
	//* 352  710:fconst_2        
	//* 353  711:fdiv            
	//* 354  712:fadd            
	//* 355  713:fstore_3        
	//* 356  714:goto            455
	//* 357  717:aload           18
	//* 358  719:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//* 359  722:fload           9
	//* 360  724:fadd            
	//* 361  725:aload           18
	//* 362  727:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//* 363  730:fsub            
	//* 364  731:aload           16
	//* 365  733:invokevirtual   #488 <Method float Image.getScaledWidth()>
	//* 366  736:fsub            
	//* 367  737:fstore_3        
	//* 368  738:goto            455
		// Misplaced declaration of an exception variable
		catch(PdfContentByte apdfcontentbyte[])
	//* 369  741:astore          5
		{
			throw new ExceptionConverter(((Exception) (apdfcontentbyte)));
	//  370  743:new             #367 <Class ExceptionConverter>
	//  371  746:dup             
	//  372  747:aload           5
	//  373  749:invokespecial   #370 <Method void ExceptionConverter(Exception)>
	//  374  752:athrow          
		}
_L24:
		obj = ((Object) (pdfpcell.getCellEvent()));
		if(obj != null)
			((PdfPCellEvent) (obj)).cellLayout(pdfpcell, new Rectangle(pdfpcell.getLeft() + f5, (pdfpcell.getTop() + f1) - f9, pdfpcell.getRight() + f5, pdfpcell.getTop() + f1), apdfcontentbyte);
		if(isTagged(apdfcontentbyte[3]))
			apdfcontentbyte[3].closeMCBlock(((IAccessibleElement) (pdfpcell)));
		  goto _L16
_L12:
		f = (((pdfpcell.getTop() + f1) - f9) + pdfpcell.getHeight()) - pdfpcell.getEffectivePaddingTop();
		  goto _L9
_L11:
		f = (pdfpcell.getTop() + f1 + (pdfpcell.getHeight() - f9) / 2.0F) - pdfpcell.getEffectivePaddingTop();
		  goto _L9
_L20:
		f = f5 + ((pdfpcell.getLeft() + pdfpcell.getEffectivePaddingLeft() + pdfpcell.getRight()) - pdfpcell.getEffectivePaddingRight() - ((Image) (obj)).getScaledWidth()) / 2.0F;
		  goto _L22
_L21:
		f = (pdfpcell.getRight() + f5) - pdfpcell.getEffectivePaddingRight() - ((Image) (obj)).getScaledWidth();
		  goto _L22
_L14:
		if(pdfpcell.getRotation() != 90 && pdfpcell.getRotation() != 270)
			break MISSING_BLOCK_LABEL_1296;
	//  375  753:aload           18
	//  376  755:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//  377  758:bipush          90
	//  378  760:icmpeq          774
	//  379  763:aload           18
	//  380  765:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//  381  768:sipush          270
	//  382  771:icmpne          1296
		f4 = f9 - pdfpcell.getEffectivePaddingTop() - pdfpcell.getEffectivePaddingBottom();
	//  383  774:fload           13
	//  384  776:aload           18
	//  385  778:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  386  781:fsub            
	//  387  782:aload           18
	//  388  784:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//  389  787:fsub            
	//  390  788:fstore          8
		f3 = pdfpcell.getWidth() - pdfpcell.getEffectivePaddingLeft() - pdfpcell.getEffectivePaddingRight();
	//  391  790:aload           18
	//  392  792:invokevirtual   #491 <Method float PdfPCell.getWidth()>
	//  393  795:aload           18
	//  394  797:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  395  800:fsub            
	//  396  801:aload           18
	//  397  803:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  398  806:fsub            
	//  399  807:fstore          7
		obj = ((Object) (ColumnText.duplicate(pdfpcell.getColumn())));
	//  400  809:aload           18
	//  401  811:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//  402  814:invokestatic    #331 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//  403  817:astore          16
		((ColumnText) (obj)).setCanvases(apdfcontentbyte);
	//  404  819:aload           16
	//  405  821:aload           5
	//  406  823:invokevirtual   #494 <Method void ColumnText.setCanvases(PdfContentByte[])>
		((ColumnText) (obj)).setSimpleColumn(0.0F, 0.0F, 0.001F + f4, -f3);
	//  407  826:aload           16
	//  408  828:fconst_0        
	//  409  829:fconst_0        
	//  410  830:ldc2            #495 <Float 0.001F>
	//  411  833:fload           8
	//  412  835:fadd            
	//  413  836:fload           7
	//  414  838:fneg            
	//  415  839:invokevirtual   #130 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
		try
		{
			((ColumnText) (obj)).go(true);
	//  416  842:aload           16
	//  417  844:iconst_1        
	//  418  845:invokevirtual   #359 <Method int ColumnText.go(boolean)>
	//  419  848:pop             
		}
	//* 420  849:aload           16
	//* 421  851:invokevirtual   #362 <Method float ColumnText.getYLine()>
	//* 422  854:fneg            
	//* 423  855:fstore_3        
	//* 424  856:fload           8
	//* 425  858:fconst_0        
	//* 426  859:fcmpg           
	//* 427  860:ifle            870
	//* 428  863:fload           7
	//* 429  865:fconst_0        
	//* 430  866:fcmpg           
	//* 431  867:ifgt            872
	//* 432  870:fconst_0        
	//* 433  871:fstore_3        
	//* 434  872:fload_3         
	//* 435  873:fconst_0        
	//* 436  874:fcmpl           
	//* 437  875:ifle            536
	//* 438  878:fload_3         
	//* 439  879:fstore          7
	//* 440  881:aload           18
	//* 441  883:invokevirtual   #498 <Method boolean PdfPCell.isUseDescender()>
	//* 442  886:ifeq            898
	//* 443  889:fload_3         
	//* 444  890:aload           16
	//* 445  892:invokevirtual   #501 <Method float ColumnText.getDescender()>
	//* 446  895:fsub            
	//* 447  896:fstore          7
	//* 448  898:iload           6
	//* 449  900:ifeq            1061
	//* 450  903:aload           18
	//* 451  905:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//* 452  908:invokestatic    #331 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//* 453  911:astore          16
	//* 454  913:aload           16
	//* 455  915:aload           5
	//* 456  917:invokevirtual   #494 <Method void ColumnText.setCanvases(PdfContentByte[])>
	//* 457  920:aload           16
	//* 458  922:ldc2            #502 <Float -0.003F>
	//* 459  925:ldc2            #503 <Float -0.001F>
	//* 460  928:ldc2            #504 <Float 0.003F>
	//* 461  931:fload           8
	//* 462  933:fadd            
	//* 463  934:fload           7
	//* 464  936:invokevirtual   #130 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 465  939:aload           18
	//* 466  941:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 467  944:bipush          90
	//* 468  946:icmpne          1130
	//* 469  949:aload           18
	//* 470  951:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 471  954:fstore          8
	//* 472  956:aload           18
	//* 473  958:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//* 474  961:fstore          10
	//* 475  963:aload           18
	//* 476  965:invokevirtual   #443 <Method int PdfPCell.getVerticalAlignment()>
	//* 477  968:tableswitch     5 6: default 992
	//	               5 1095
	//	               6 1071
	//* 478  992:aload           18
	//* 479  994:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//* 480  997:fload           9
	//* 481  999:fadd            
	//* 482 1000:aload           18
	//* 483 1002:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//* 484 1005:fadd            
	//* 485 1006:fload           7
	//* 486 1008:fadd            
	//* 487 1009:fstore_3        
	//* 488 1010:aload_0         
	//* 489 1011:aload           5
	//* 490 1013:fconst_0        
	//* 491 1014:fconst_1        
	//* 492 1015:ldc2            #505 <Float -1F>
	//* 493 1018:fconst_0        
	//* 494 1019:fload_3         
	//* 495 1020:fload           8
	//* 496 1022:fload           4
	//* 497 1024:fadd            
	//* 498 1025:fload           13
	//* 499 1027:fsub            
	//* 500 1028:fload           10
	//* 501 1030:fadd            
	//* 502 1031:invokevirtual   #507 <Method void saveAndRotateCanvases(PdfContentByte[], float, float, float, float, float, float)>
	//* 503 1034:aload           16
	//* 504 1036:invokevirtual   #509 <Method int ColumnText.go()>
	//* 505 1039:pop             
	//* 506 1040:aload_0         
	//* 507 1041:aload           5
	//* 508 1043:invokevirtual   #511 <Method void restoreCanvases(PdfContentByte[])>
	//* 509 1046:goto            536
		// Misplaced declaration of an exception variable
		catch(PdfContentByte apdfcontentbyte[])
	//* 510 1049:astore          5
		{
			throw new ExceptionConverter(((Exception) (apdfcontentbyte)));
	//  511 1051:new             #367 <Class ExceptionConverter>
	//  512 1054:dup             
	//  513 1055:aload           5
	//  514 1057:invokespecial   #370 <Method void ExceptionConverter(Exception)>
	//  515 1060:athrow          
		}
		f = -((ColumnText) (obj)).getYLine();
		if(f4 <= 0.0F || f3 <= 0.0F)
			f = 0.0F;
		if(f <= 0.0F) goto _L24; else goto _L23
_L23:
		f3 = f;
		if(pdfpcell.isUseDescender())
			f3 = f - ((ColumnText) (obj)).getDescender();
		if(flag)
			obj = ((Object) (ColumnText.duplicate(pdfpcell.getColumn())));
		else
			obj = ((Object) (pdfpcell.getColumn()));
	//  516 1061:aload           18
	//  517 1063:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//  518 1066:astore          16
		((ColumnText) (obj)).setCanvases(apdfcontentbyte);
		((ColumnText) (obj)).setSimpleColumn(-0.003F, -0.001F, 0.003F + f4, f3);
		if(pdfpcell.getRotation() != 90) goto _L26; else goto _L25
_L25:
		f4 = pdfpcell.getTop();
		f6 = pdfpcell.getEffectivePaddingBottom();
		pdfpcell.getVerticalAlignment();
		JVM INSTR tableswitch 5 6: default 992
	//	               5 1095
	//	               6 1071;
		   goto _L27 _L28 _L29
_L27:
		f = pdfpcell.getLeft() + f5 + pdfpcell.getEffectivePaddingLeft() + f3;
_L30:
		saveAndRotateCanvases(apdfcontentbyte, 0.0F, 1.0F, -1F, 0.0F, f, ((f4 + f1) - f9) + f6);
_L34:
		((ColumnText) (obj)).go();
		restoreCanvases(apdfcontentbyte);
		  goto _L24
	//* 519 1068:goto            913
_L29:
		f = (pdfpcell.getLeft() + f5 + pdfpcell.getWidth()) - pdfpcell.getEffectivePaddingRight();
	//  520 1071:aload           18
	//  521 1073:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  522 1076:fload           9
	//  523 1078:fadd            
	//  524 1079:aload           18
	//  525 1081:invokevirtual   #491 <Method float PdfPCell.getWidth()>
	//  526 1084:fadd            
	//  527 1085:aload           18
	//  528 1087:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  529 1090:fsub            
	//  530 1091:fstore_3        
		  goto _L30
	//* 531 1092:goto            1010
_L28:
		f = pdfpcell.getLeft() + f5 + (((pdfpcell.getWidth() + pdfpcell.getEffectivePaddingLeft()) - pdfpcell.getEffectivePaddingRight()) + f3) / 2.0F;
	//  532 1095:aload           18
	//  533 1097:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  534 1100:fload           9
	//  535 1102:fadd            
	//  536 1103:aload           18
	//  537 1105:invokevirtual   #491 <Method float PdfPCell.getWidth()>
	//  538 1108:aload           18
	//  539 1110:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  540 1113:fadd            
	//  541 1114:aload           18
	//  542 1116:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  543 1119:fsub            
	//  544 1120:fload           7
	//  545 1122:fadd            
	//  546 1123:fconst_2        
	//  547 1124:fdiv            
	//  548 1125:fadd            
	//  549 1126:fstore_3        
		  goto _L30
	//* 550 1127:goto            1010
_L26:
		f4 = pdfpcell.getTop();
	//  551 1130:aload           18
	//  552 1132:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//  553 1135:fstore          8
		f6 = pdfpcell.getEffectivePaddingTop();
	//  554 1137:aload           18
	//  555 1139:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//  556 1142:fstore          10
		pdfpcell.getVerticalAlignment();
	//  557 1144:aload           18
	//  558 1146:invokevirtual   #443 <Method int PdfPCell.getVerticalAlignment()>
		JVM INSTR tableswitch 5 6: default 1172
	//	               5 1238
	//	               6 1220;
	//  559 1149:tableswitch     5 6: default 1172
	//	               5 1238
	//	               6 1220
		   goto _L31 _L32 _L33
_L32:
		break MISSING_BLOCK_LABEL_1238;
_L31:
		f = (pdfpcell.getLeft() + f5 + pdfpcell.getWidth()) - pdfpcell.getEffectivePaddingRight() - f3;
	//  560 1172:aload           18
	//  561 1174:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  562 1177:fload           9
	//  563 1179:fadd            
	//  564 1180:aload           18
	//  565 1182:invokevirtual   #491 <Method float PdfPCell.getWidth()>
	//  566 1185:fadd            
	//  567 1186:aload           18
	//  568 1188:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  569 1191:fsub            
	//  570 1192:fload           7
	//  571 1194:fsub            
	//  572 1195:fstore_3        
_L35:
		saveAndRotateCanvases(apdfcontentbyte, 0.0F, -1F, 1.0F, 0.0F, f, (f4 + f1) - f6);
	//  573 1196:aload_0         
	//  574 1197:aload           5
	//  575 1199:fconst_0        
	//  576 1200:ldc2            #505 <Float -1F>
	//  577 1203:fconst_1        
	//  578 1204:fconst_0        
	//  579 1205:fload_3         
	//  580 1206:fload           8
	//  581 1208:fload           4
	//  582 1210:fadd            
	//  583 1211:fload           10
	//  584 1213:fsub            
	//  585 1214:invokevirtual   #507 <Method void saveAndRotateCanvases(PdfContentByte[], float, float, float, float, float, float)>
		  goto _L34
	//* 586 1217:goto            1034
_L33:
		f = pdfpcell.getLeft() + f5 + pdfpcell.getEffectivePaddingLeft();
	//  587 1220:aload           18
	//  588 1222:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  589 1225:fload           9
	//  590 1227:fadd            
	//  591 1228:aload           18
	//  592 1230:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  593 1233:fadd            
	//  594 1234:fstore_3        
		  goto _L35
	//* 595 1235:goto            1196
		f = pdfpcell.getLeft() + f5 + ((pdfpcell.getWidth() + pdfpcell.getEffectivePaddingLeft()) - pdfpcell.getEffectivePaddingRight() - f3) / 2.0F;
	//  596 1238:aload           18
	//  597 1240:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  598 1243:fload           9
	//  599 1245:fadd            
	//  600 1246:aload           18
	//  601 1248:invokevirtual   #491 <Method float PdfPCell.getWidth()>
	//  602 1251:aload           18
	//  603 1253:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  604 1256:fadd            
	//  605 1257:aload           18
	//  606 1259:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  607 1262:fsub            
	//  608 1263:fload           7
	//  609 1265:fsub            
	//  610 1266:fconst_2        
	//  611 1267:fdiv            
	//  612 1268:fadd            
	//  613 1269:fstore_3        
		  goto _L35
	//* 614 1270:goto            1196
		Object obj1;
		obj1;
	//  615 1273:astore          16
		throw new ExceptionConverter(((Exception) (obj1)));
	//  616 1275:new             #367 <Class ExceptionConverter>
	//  617 1278:dup             
	//  618 1279:aload           16
	//  619 1281:invokespecial   #370 <Method void ExceptionConverter(Exception)>
	//  620 1284:athrow          
		obj1;
	//  621 1285:astore          16
		restoreCanvases(apdfcontentbyte);
	//  622 1287:aload_0         
	//  623 1288:aload           5
	//  624 1290:invokevirtual   #511 <Method void restoreCanvases(PdfContentByte[])>
		throw obj1;
	//  625 1293:aload           16
	//  626 1295:athrow          
		float f7;
		float f10;
		f10 = pdfpcell.getFixedHeight();
	//  627 1296:aload           18
	//  628 1298:invokevirtual   #299 <Method float PdfPCell.getFixedHeight()>
	//  629 1301:fstore          14
		f7 = (pdfpcell.getRight() + f5) - pdfpcell.getEffectivePaddingRight();
	//  630 1303:aload           18
	//  631 1305:invokevirtual   #343 <Method float PdfPCell.getRight()>
	//  632 1308:fload           9
	//  633 1310:fadd            
	//  634 1311:aload           18
	//  635 1313:invokevirtual   #346 <Method float PdfPCell.getEffectivePaddingRight()>
	//  636 1316:fsub            
	//  637 1317:fstore          11
		f6 = pdfpcell.getLeft() + f5 + pdfpcell.getEffectivePaddingLeft();
	//  638 1319:aload           18
	//  639 1321:invokevirtual   #334 <Method float PdfPCell.getLeft()>
	//  640 1324:fload           9
	//  641 1326:fadd            
	//  642 1327:aload           18
	//  643 1329:invokevirtual   #337 <Method float PdfPCell.getEffectivePaddingLeft()>
	//  644 1332:fadd            
	//  645 1333:fstore          10
		f3 = f6;
	//  646 1335:fload           10
	//  647 1337:fstore          7
		f4 = f7;
	//  648 1339:fload           11
	//  649 1341:fstore          8
		if(!pdfpcell.isNoWrap()) goto _L37; else goto _L36
	//  650 1343:aload           18
	//  651 1345:invokevirtual   #352 <Method boolean PdfPCell.isNoWrap()>
	//  652 1348:ifeq            1402
_L36:
		pdfpcell.getHorizontalAlignment();
	//  653 1351:aload           18
	//  654 1353:invokevirtual   #464 <Method int PdfPCell.getHorizontalAlignment()>
		JVM INSTR tableswitch 1 2: default 1380
	//	               1 1626
	//	               2 1645;
	//  655 1356:tableswitch     1 2: default 1380
	//	               1 1626
	//	               2 1645
		   goto _L38 _L39 _L40
_L40:
		break MISSING_BLOCK_LABEL_1645;
_L38:
		float f8;
		if(pdfpcell.getRotation() == 180)
	//* 656 1380:aload           18
	//* 657 1382:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 658 1385:sipush          180
	//* 659 1388:icmpne          1684
		{
			f3 = f6 - 20000F;
	//  660 1391:fload           10
	//  661 1393:ldc1            #13  <Float 20000F>
	//  662 1395:fsub            
	//  663 1396:fstore          7
			f4 = f7;
	//  664 1398:fload           11
	//  665 1400:fstore          8
		} else
	//* 666 1402:iload           6
	//* 667 1404:ifeq            1698
	//* 668 1407:aload           18
	//* 669 1409:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//* 670 1412:invokestatic    #331 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//* 671 1415:astore          16
	//* 672 1417:aload           16
	//* 673 1419:aload           5
	//* 674 1421:invokevirtual   #494 <Method void ColumnText.setCanvases(PdfContentByte[])>
	//* 675 1424:fload_3         
	//* 676 1425:fload           13
	//* 677 1427:aload           18
	//* 678 1429:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//* 679 1432:fsub            
	//* 680 1433:aload           18
	//* 681 1435:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//* 682 1438:fsub            
	//* 683 1439:fsub            
	//* 684 1440:fstore          12
	//* 685 1442:fload           12
	//* 686 1444:fstore          11
	//* 687 1446:fload_3         
	//* 688 1447:fstore          10
	//* 689 1449:fload           14
	//* 690 1451:fconst_0        
	//* 691 1452:fcmpl           
	//* 692 1453:ifle            1509
	//* 693 1456:fload           12
	//* 694 1458:fstore          11
	//* 695 1460:fload_3         
	//* 696 1461:fstore          10
	//* 697 1463:aload           18
	//* 698 1465:invokevirtual   #440 <Method float PdfPCell.getHeight()>
	//* 699 1468:fload           13
	//* 700 1470:fcmpl           
	//* 701 1471:ifle            1509
	//* 702 1474:aload           18
	//* 703 1476:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 704 1479:fload           4
	//* 705 1481:fadd            
	//* 706 1482:aload           18
	//* 707 1484:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//* 708 1487:fsub            
	//* 709 1488:fstore          10
	//* 710 1490:aload           18
	//* 711 1492:invokevirtual   #340 <Method float PdfPCell.getTop()>
	//* 712 1495:fload           4
	//* 713 1497:fadd            
	//* 714 1498:fload           13
	//* 715 1500:fsub            
	//* 716 1501:aload           18
	//* 717 1503:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//* 718 1506:fadd            
	//* 719 1507:fstore          11
	//* 720 1509:fload           10
	//* 721 1511:fload           11
	//* 722 1513:fcmpl           
	//* 723 1514:ifgt            1525
	//* 724 1517:aload           16
	//* 725 1519:invokevirtual   #514 <Method boolean ColumnText.zeroHeightElement()>
	//* 726 1522:ifeq            536
	//* 727 1525:fload           7
	//* 728 1527:fload           8
	//* 729 1529:fcmpg           
	//* 730 1530:ifge            536
	//* 731 1533:aload           16
	//* 732 1535:fload           7
	//* 733 1537:fload           11
	//* 734 1539:ldc2            #495 <Float 0.001F>
	//* 735 1542:fsub            
	//* 736 1543:fload           8
	//* 737 1545:fload           10
	//* 738 1547:invokevirtual   #130 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//* 739 1550:aload           18
	//* 740 1552:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 741 1555:sipush          180
	//* 742 1558:icmpne          1600
	//* 743 1561:aload_0         
	//* 744 1562:aload           5
	//* 745 1564:ldc2            #505 <Float -1F>
	//* 746 1567:fconst_0        
	//* 747 1568:fconst_0        
	//* 748 1569:ldc2            #505 <Float -1F>
	//* 749 1572:fload           7
	//* 750 1574:fload           8
	//* 751 1576:fadd            
	//* 752 1577:fload           4
	//* 753 1579:fload           4
	//* 754 1581:fadd            
	//* 755 1582:fload           13
	//* 756 1584:fsub            
	//* 757 1585:aload           18
	//* 758 1587:invokevirtual   #309 <Method float PdfPCell.getEffectivePaddingBottom()>
	//* 759 1590:fadd            
	//* 760 1591:aload           18
	//* 761 1593:invokevirtual   #312 <Method float PdfPCell.getEffectivePaddingTop()>
	//* 762 1596:fsub            
	//* 763 1597:invokevirtual   #507 <Method void saveAndRotateCanvases(PdfContentByte[], float, float, float, float, float, float)>
	//* 764 1600:aload           16
	//* 765 1602:invokevirtual   #509 <Method int ColumnText.go()>
	//* 766 1605:pop             
	//* 767 1606:aload           18
	//* 768 1608:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 769 1611:sipush          180
	//* 770 1614:icmpne          536
	//* 771 1617:aload_0         
	//* 772 1618:aload           5
	//* 773 1620:invokevirtual   #511 <Method void restoreCanvases(PdfContentByte[])>
	//* 774 1623:goto            536
	//* 775 1626:fload           11
	//* 776 1628:ldc2            #515 <Float 10000F>
	//* 777 1631:fadd            
	//* 778 1632:fstore          8
	//* 779 1634:fload           10
	//* 780 1636:ldc2            #515 <Float 10000F>
	//* 781 1639:fsub            
	//* 782 1640:fstore          7
	//* 783 1642:goto            1402
	//* 784 1645:aload           18
	//* 785 1647:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 786 1650:sipush          180
	//* 787 1653:icmpne          1670
	//* 788 1656:fload           11
	//* 789 1658:ldc1            #13  <Float 20000F>
	//* 790 1660:fadd            
	//* 791 1661:fstore          8
	//* 792 1663:fload           10
	//* 793 1665:fstore          7
	//* 794 1667:goto            1402
	//* 795 1670:fload           10
	//* 796 1672:ldc1            #13  <Float 20000F>
	//* 797 1674:fsub            
	//* 798 1675:fstore          7
	//* 799 1677:fload           11
	//* 800 1679:fstore          8
	//* 801 1681:goto            1402
		{
			f4 = f7 + 20000F;
	//  802 1684:fload           11
	//  803 1686:ldc1            #13  <Float 20000F>
	//  804 1688:fadd            
	//  805 1689:fstore          8
			f3 = f6;
	//  806 1691:fload           10
	//  807 1693:fstore          7
		}
_L37:
		if(flag)
			obj1 = ((Object) (ColumnText.duplicate(pdfpcell.getColumn())));
		else
	//* 808 1695:goto            1402
			obj1 = ((Object) (pdfpcell.getColumn()));
	//  809 1698:aload           18
	//  810 1700:invokevirtual   #168 <Method ColumnText PdfPCell.getColumn()>
	//  811 1703:astore          16
		((ColumnText) (obj1)).setCanvases(apdfcontentbyte);
		f8 = f - (f9 - pdfpcell.getEffectivePaddingTop() - pdfpcell.getEffectivePaddingBottom());
		f7 = f8;
		f6 = f;
		if(f10 > 0.0F)
		{
			f7 = f8;
			f6 = f;
			if(pdfpcell.getHeight() > f9)
			{
				f6 = (pdfpcell.getTop() + f1) - pdfpcell.getEffectivePaddingTop();
				f7 = ((pdfpcell.getTop() + f1) - f9) + pdfpcell.getEffectivePaddingBottom();
			}
		}
		if(f6 <= f7 && !((ColumnText) (obj1)).zeroHeightElement() || f3 >= f4) goto _L24; else goto _L41
_L41:
		((ColumnText) (obj1)).setSimpleColumn(f3, f7 - 0.001F, f4, f6);
		if(pdfpcell.getRotation() == 180)
			saveAndRotateCanvases(apdfcontentbyte, -1F, 0.0F, 0.0F, -1F, f3 + f4, (((f1 + f1) - f9) + pdfpcell.getEffectivePaddingBottom()) - pdfpcell.getEffectivePaddingTop());
		((ColumnText) (obj1)).go();
		if(pdfpcell.getRotation() == 180)
			restoreCanvases(apdfcontentbyte);
		  goto _L24
_L39:
		f4 = f7 + 10000F;
		f3 = f6 - 10000F;
		  goto _L37
		if(pdfpcell.getRotation() == 180)
		{
			f4 = f7 + 20000F;
			f3 = f6;
		} else
		{
			f3 = f6 - 20000F;
			f4 = f7;
		}
		  goto _L37
	//* 812 1705:goto            1417
		obj1;
	//  813 1708:astore          16
		throw new ExceptionConverter(((Exception) (obj1)));
	//  814 1710:new             #367 <Class ExceptionConverter>
	//  815 1713:dup             
	//  816 1714:aload           16
	//  817 1716:invokespecial   #370 <Method void ExceptionConverter(Exception)>
	//  818 1719:athrow          
		obj1;
	//  819 1720:astore          16
		if(pdfpcell.getRotation() == 180)
	//* 820 1722:aload           18
	//* 821 1724:invokevirtual   #349 <Method int PdfPCell.getRotation()>
	//* 822 1727:sipush          180
	//* 823 1730:icmpne          1739
			restoreCanvases(apdfcontentbyte);
	//  824 1733:aload_0         
	//  825 1734:aload           5
	//  826 1736:invokevirtual   #511 <Method void restoreCanvases(PdfContentByte[])>
		throw obj1;
	//  827 1739:aload           16
	//  828 1741:athrow          
		if(!isTagged(apdfcontentbyte[3])) goto _L1; else goto _L42
	//  829 1742:aload           5
	//  830 1744:iconst_3        
	//  831 1745:aaload          
	//  832 1746:invokestatic    #431 <Method boolean isTagged(PdfContentByte)>
	//  833 1749:ifeq            36
_L42:
		apdfcontentbyte[3].closeMCBlock(((IAccessibleElement) (this)));
	//  834 1752:aload           5
	//  835 1754:iconst_3        
	//  836 1755:aaload          
	//  837 1756:aload_0         
	//  838 1757:invokevirtual   #475 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		return;
	//  839 1760:return          
	}

	static final boolean $assertionsDisabled;
	public static final float BOTTOM_LIMIT = -1.073742E+09F;
	public static final float RIGHT_LIMIT = 20000F;
	private final Logger LOGGER;
	protected HashMap accessibleAttributes;
	protected boolean adjusted;
	protected boolean calculated;
	private int canvasesPos[];
	protected PdfPCell cells[];
	protected float extraHeights[];
	protected AccessibleElementId id;
	protected float maxHeight;
	public boolean mayNotBreak;
	protected PdfName role;
	protected float widths[];

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/text/pdf/PdfPRow)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class PdfPRow>
	//*   1    2:invokevirtual   #41  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #43  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
