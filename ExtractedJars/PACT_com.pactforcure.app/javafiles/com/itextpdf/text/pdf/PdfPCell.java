// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.events.PdfPCellEventForwarder;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			ColumnText, PdfName, PdfPTable, PdfDiv, 
//			PdfObject, PdfPRow, PdfPCellEvent, PdfPHeaderCell

public class PdfPCell extends Rectangle
	implements IAccessibleElement
{

	public PdfPCell()
	{
		super(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokespecial   #49  <Method void Rectangle(float, float, float, float)>
		column = new ColumnText(((PdfContentByte) (null)));
	//    6    8:aload_0         
	//    7    9:new             #51  <Class ColumnText>
	//    8   12:dup             
	//    9   13:aconst_null     
	//   10   14:invokespecial   #54  <Method void ColumnText(PdfContentByte)>
	//   11   17:putfield        #56  <Field ColumnText column>
		verticalAlignment = 4;
	//   12   20:aload_0         
	//   13   21:iconst_4        
	//   14   22:putfield        #58  <Field int verticalAlignment>
		paddingLeft = 2.0F;
	//   15   25:aload_0         
	//   16   26:fconst_2        
	//   17   27:putfield        #60  <Field float paddingLeft>
		paddingRight = 2.0F;
	//   18   30:aload_0         
	//   19   31:fconst_2        
	//   20   32:putfield        #62  <Field float paddingRight>
		paddingTop = 2.0F;
	//   21   35:aload_0         
	//   22   36:fconst_2        
	//   23   37:putfield        #64  <Field float paddingTop>
		paddingBottom = 2.0F;
	//   24   40:aload_0         
	//   25   41:fconst_2        
	//   26   42:putfield        #66  <Field float paddingBottom>
		fixedHeight = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #68  <Field float fixedHeight>
		calculatedHeight = 0.0F;
	//   30   50:aload_0         
	//   31   51:fconst_0        
	//   32   52:putfield        #70  <Field float calculatedHeight>
		noWrap = false;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #72  <Field boolean noWrap>
		colspan = 1;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #74  <Field int colspan>
		rowspan = 1;
	//   39   65:aload_0         
	//   40   66:iconst_1        
	//   41   67:putfield        #76  <Field int rowspan>
		useDescender = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #78  <Field boolean useDescender>
		useBorderPadding = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #80  <Field boolean useBorderPadding>
		role = PdfName.TD;
	//   48   80:aload_0         
	//   49   81:getstatic       #85  <Field PdfName PdfName.TD>
	//   50   84:putfield        #87  <Field PdfName role>
		accessibleAttributes = null;
	//   51   87:aload_0         
	//   52   88:aconst_null     
	//   53   89:putfield        #89  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   54   92:aload_0         
	//   55   93:new             #91  <Class AccessibleElementId>
	//   56   96:dup             
	//   57   97:invokespecial   #93  <Method void AccessibleElementId()>
	//   58  100:putfield        #95  <Field AccessibleElementId id>
		headers = null;
	//   59  103:aload_0         
	//   60  104:aconst_null     
	//   61  105:putfield        #97  <Field ArrayList headers>
		borderWidth = 0.5F;
	//   62  108:aload_0         
	//   63  109:ldc1            #98  <Float 0.5F>
	//   64  111:putfield        #101 <Field float borderWidth>
		border = 15;
	//   65  114:aload_0         
	//   66  115:bipush          15
	//   67  117:putfield        #104 <Field int border>
		column.setLeading(0.0F, 1.0F);
	//   68  120:aload_0         
	//   69  121:getfield        #56  <Field ColumnText column>
	//   70  124:fconst_0        
	//   71  125:fconst_1        
	//   72  126:invokevirtual   #108 <Method void ColumnText.setLeading(float, float)>
	//   73  129:return          
	}

	public PdfPCell(Image image1)
	{
		this(image1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #113 <Method void PdfPCell(Image, boolean)>
	//    4    6:return          
	}

	public PdfPCell(Image image1, boolean flag)
	{
		super(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokespecial   #49  <Method void Rectangle(float, float, float, float)>
		column = new ColumnText(((PdfContentByte) (null)));
	//    6    8:aload_0         
	//    7    9:new             #51  <Class ColumnText>
	//    8   12:dup             
	//    9   13:aconst_null     
	//   10   14:invokespecial   #54  <Method void ColumnText(PdfContentByte)>
	//   11   17:putfield        #56  <Field ColumnText column>
		verticalAlignment = 4;
	//   12   20:aload_0         
	//   13   21:iconst_4        
	//   14   22:putfield        #58  <Field int verticalAlignment>
		paddingLeft = 2.0F;
	//   15   25:aload_0         
	//   16   26:fconst_2        
	//   17   27:putfield        #60  <Field float paddingLeft>
		paddingRight = 2.0F;
	//   18   30:aload_0         
	//   19   31:fconst_2        
	//   20   32:putfield        #62  <Field float paddingRight>
		paddingTop = 2.0F;
	//   21   35:aload_0         
	//   22   36:fconst_2        
	//   23   37:putfield        #64  <Field float paddingTop>
		paddingBottom = 2.0F;
	//   24   40:aload_0         
	//   25   41:fconst_2        
	//   26   42:putfield        #66  <Field float paddingBottom>
		fixedHeight = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #68  <Field float fixedHeight>
		calculatedHeight = 0.0F;
	//   30   50:aload_0         
	//   31   51:fconst_0        
	//   32   52:putfield        #70  <Field float calculatedHeight>
		noWrap = false;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #72  <Field boolean noWrap>
		colspan = 1;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #74  <Field int colspan>
		rowspan = 1;
	//   39   65:aload_0         
	//   40   66:iconst_1        
	//   41   67:putfield        #76  <Field int rowspan>
		useDescender = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #78  <Field boolean useDescender>
		useBorderPadding = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #80  <Field boolean useBorderPadding>
		role = PdfName.TD;
	//   48   80:aload_0         
	//   49   81:getstatic       #85  <Field PdfName PdfName.TD>
	//   50   84:putfield        #87  <Field PdfName role>
		accessibleAttributes = null;
	//   51   87:aload_0         
	//   52   88:aconst_null     
	//   53   89:putfield        #89  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   54   92:aload_0         
	//   55   93:new             #91  <Class AccessibleElementId>
	//   56   96:dup             
	//   57   97:invokespecial   #93  <Method void AccessibleElementId()>
	//   58  100:putfield        #95  <Field AccessibleElementId id>
		headers = null;
	//   59  103:aload_0         
	//   60  104:aconst_null     
	//   61  105:putfield        #97  <Field ArrayList headers>
		borderWidth = 0.5F;
	//   62  108:aload_0         
	//   63  109:ldc1            #98  <Float 0.5F>
	//   64  111:putfield        #101 <Field float borderWidth>
		border = 15;
	//   65  114:aload_0         
	//   66  115:bipush          15
	//   67  117:putfield        #104 <Field int border>
		column.setLeading(0.0F, 1.0F);
	//   68  120:aload_0         
	//   69  121:getfield        #56  <Field ColumnText column>
	//   70  124:fconst_0        
	//   71  125:fconst_1        
	//   72  126:invokevirtual   #108 <Method void ColumnText.setLeading(float, float)>
		if(flag)
	//*  73  129:iload_2         
	//*  74  130:ifeq            149
		{
			image = image1;
	//   75  133:aload_0         
	//   76  134:aload_1         
	//   77  135:putfield        #115 <Field Image image>
			setPadding(borderWidth / 2.0F);
	//   78  138:aload_0         
	//   79  139:aload_0         
	//   80  140:getfield        #101 <Field float borderWidth>
	//   81  143:fconst_2        
	//   82  144:fdiv            
	//   83  145:invokevirtual   #119 <Method void setPadding(float)>
			return;
	//   84  148:return          
		} else
		{
			image1.setScaleToFitLineWhenOverflow(false);
	//   85  149:aload_1         
	//   86  150:iconst_0        
	//   87  151:invokevirtual   #125 <Method void Image.setScaleToFitLineWhenOverflow(boolean)>
			ColumnText columntext = column;
	//   88  154:aload_0         
	//   89  155:getfield        #56  <Field ColumnText column>
	//   90  158:astore_3        
			image1 = ((Image) (new Phrase(new Chunk(image1, 0.0F, 0.0F, true))));
	//   91  159:new             #127 <Class Phrase>
	//   92  162:dup             
	//   93  163:new             #129 <Class Chunk>
	//   94  166:dup             
	//   95  167:aload_1         
	//   96  168:fconst_0        
	//   97  169:fconst_0        
	//   98  170:iconst_1        
	//   99  171:invokespecial   #132 <Method void Chunk(Image, float, float, boolean)>
	//  100  174:invokespecial   #135 <Method void Phrase(Chunk)>
	//  101  177:astore_1        
			phrase = ((Phrase) (image1));
	//  102  178:aload_0         
	//  103  179:aload_1         
	//  104  180:putfield        #137 <Field Phrase phrase>
			columntext.addText(((Phrase) (image1)));
	//  105  183:aload_3         
	//  106  184:aload_1         
	//  107  185:invokevirtual   #141 <Method void ColumnText.addText(Phrase)>
			setPadding(0.0F);
	//  108  188:aload_0         
	//  109  189:fconst_0        
	//  110  190:invokevirtual   #119 <Method void setPadding(float)>
			return;
	//  111  193:return          
		}
	}

	public PdfPCell(Phrase phrase1)
	{
		super(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokespecial   #49  <Method void Rectangle(float, float, float, float)>
		column = new ColumnText(((PdfContentByte) (null)));
	//    6    8:aload_0         
	//    7    9:new             #51  <Class ColumnText>
	//    8   12:dup             
	//    9   13:aconst_null     
	//   10   14:invokespecial   #54  <Method void ColumnText(PdfContentByte)>
	//   11   17:putfield        #56  <Field ColumnText column>
		verticalAlignment = 4;
	//   12   20:aload_0         
	//   13   21:iconst_4        
	//   14   22:putfield        #58  <Field int verticalAlignment>
		paddingLeft = 2.0F;
	//   15   25:aload_0         
	//   16   26:fconst_2        
	//   17   27:putfield        #60  <Field float paddingLeft>
		paddingRight = 2.0F;
	//   18   30:aload_0         
	//   19   31:fconst_2        
	//   20   32:putfield        #62  <Field float paddingRight>
		paddingTop = 2.0F;
	//   21   35:aload_0         
	//   22   36:fconst_2        
	//   23   37:putfield        #64  <Field float paddingTop>
		paddingBottom = 2.0F;
	//   24   40:aload_0         
	//   25   41:fconst_2        
	//   26   42:putfield        #66  <Field float paddingBottom>
		fixedHeight = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #68  <Field float fixedHeight>
		calculatedHeight = 0.0F;
	//   30   50:aload_0         
	//   31   51:fconst_0        
	//   32   52:putfield        #70  <Field float calculatedHeight>
		noWrap = false;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #72  <Field boolean noWrap>
		colspan = 1;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #74  <Field int colspan>
		rowspan = 1;
	//   39   65:aload_0         
	//   40   66:iconst_1        
	//   41   67:putfield        #76  <Field int rowspan>
		useDescender = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #78  <Field boolean useDescender>
		useBorderPadding = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #80  <Field boolean useBorderPadding>
		role = PdfName.TD;
	//   48   80:aload_0         
	//   49   81:getstatic       #85  <Field PdfName PdfName.TD>
	//   50   84:putfield        #87  <Field PdfName role>
		accessibleAttributes = null;
	//   51   87:aload_0         
	//   52   88:aconst_null     
	//   53   89:putfield        #89  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   54   92:aload_0         
	//   55   93:new             #91  <Class AccessibleElementId>
	//   56   96:dup             
	//   57   97:invokespecial   #93  <Method void AccessibleElementId()>
	//   58  100:putfield        #95  <Field AccessibleElementId id>
		headers = null;
	//   59  103:aload_0         
	//   60  104:aconst_null     
	//   61  105:putfield        #97  <Field ArrayList headers>
		borderWidth = 0.5F;
	//   62  108:aload_0         
	//   63  109:ldc1            #98  <Float 0.5F>
	//   64  111:putfield        #101 <Field float borderWidth>
		border = 15;
	//   65  114:aload_0         
	//   66  115:bipush          15
	//   67  117:putfield        #104 <Field int border>
		ColumnText columntext = column;
	//   68  120:aload_0         
	//   69  121:getfield        #56  <Field ColumnText column>
	//   70  124:astore_2        
		phrase = phrase1;
	//   71  125:aload_0         
	//   72  126:aload_1         
	//   73  127:putfield        #137 <Field Phrase phrase>
		columntext.addText(phrase1);
	//   74  130:aload_2         
	//   75  131:aload_1         
	//   76  132:invokevirtual   #141 <Method void ColumnText.addText(Phrase)>
		column.setLeading(0.0F, 1.0F);
	//   77  135:aload_0         
	//   78  136:getfield        #56  <Field ColumnText column>
	//   79  139:fconst_0        
	//   80  140:fconst_1        
	//   81  141:invokevirtual   #108 <Method void ColumnText.setLeading(float, float)>
	//   82  144:return          
	}

	public PdfPCell(PdfPCell pdfpcell)
	{
		super(pdfpcell.llx, pdfpcell.lly, pdfpcell.urx, pdfpcell.ury);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #145 <Field float llx>
	//    3    5:aload_1         
	//    4    6:getfield        #148 <Field float lly>
	//    5    9:aload_1         
	//    6   10:getfield        #151 <Field float urx>
	//    7   13:aload_1         
	//    8   14:getfield        #154 <Field float ury>
	//    9   17:invokespecial   #49  <Method void Rectangle(float, float, float, float)>
		column = new ColumnText(((PdfContentByte) (null)));
	//   10   20:aload_0         
	//   11   21:new             #51  <Class ColumnText>
	//   12   24:dup             
	//   13   25:aconst_null     
	//   14   26:invokespecial   #54  <Method void ColumnText(PdfContentByte)>
	//   15   29:putfield        #56  <Field ColumnText column>
		verticalAlignment = 4;
	//   16   32:aload_0         
	//   17   33:iconst_4        
	//   18   34:putfield        #58  <Field int verticalAlignment>
		paddingLeft = 2.0F;
	//   19   37:aload_0         
	//   20   38:fconst_2        
	//   21   39:putfield        #60  <Field float paddingLeft>
		paddingRight = 2.0F;
	//   22   42:aload_0         
	//   23   43:fconst_2        
	//   24   44:putfield        #62  <Field float paddingRight>
		paddingTop = 2.0F;
	//   25   47:aload_0         
	//   26   48:fconst_2        
	//   27   49:putfield        #64  <Field float paddingTop>
		paddingBottom = 2.0F;
	//   28   52:aload_0         
	//   29   53:fconst_2        
	//   30   54:putfield        #66  <Field float paddingBottom>
		fixedHeight = 0.0F;
	//   31   57:aload_0         
	//   32   58:fconst_0        
	//   33   59:putfield        #68  <Field float fixedHeight>
		calculatedHeight = 0.0F;
	//   34   62:aload_0         
	//   35   63:fconst_0        
	//   36   64:putfield        #70  <Field float calculatedHeight>
		noWrap = false;
	//   37   67:aload_0         
	//   38   68:iconst_0        
	//   39   69:putfield        #72  <Field boolean noWrap>
		colspan = 1;
	//   40   72:aload_0         
	//   41   73:iconst_1        
	//   42   74:putfield        #74  <Field int colspan>
		rowspan = 1;
	//   43   77:aload_0         
	//   44   78:iconst_1        
	//   45   79:putfield        #76  <Field int rowspan>
		useDescender = false;
	//   46   82:aload_0         
	//   47   83:iconst_0        
	//   48   84:putfield        #78  <Field boolean useDescender>
		useBorderPadding = false;
	//   49   87:aload_0         
	//   50   88:iconst_0        
	//   51   89:putfield        #80  <Field boolean useBorderPadding>
		role = PdfName.TD;
	//   52   92:aload_0         
	//   53   93:getstatic       #85  <Field PdfName PdfName.TD>
	//   54   96:putfield        #87  <Field PdfName role>
		accessibleAttributes = null;
	//   55   99:aload_0         
	//   56  100:aconst_null     
	//   57  101:putfield        #89  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   58  104:aload_0         
	//   59  105:new             #91  <Class AccessibleElementId>
	//   60  108:dup             
	//   61  109:invokespecial   #93  <Method void AccessibleElementId()>
	//   62  112:putfield        #95  <Field AccessibleElementId id>
		headers = null;
	//   63  115:aload_0         
	//   64  116:aconst_null     
	//   65  117:putfield        #97  <Field ArrayList headers>
		cloneNonPositionParameters(((Rectangle) (pdfpcell)));
	//   66  120:aload_0         
	//   67  121:aload_1         
	//   68  122:invokevirtual   #158 <Method void cloneNonPositionParameters(Rectangle)>
		verticalAlignment = pdfpcell.verticalAlignment;
	//   69  125:aload_0         
	//   70  126:aload_1         
	//   71  127:getfield        #58  <Field int verticalAlignment>
	//   72  130:putfield        #58  <Field int verticalAlignment>
		paddingLeft = pdfpcell.paddingLeft;
	//   73  133:aload_0         
	//   74  134:aload_1         
	//   75  135:getfield        #60  <Field float paddingLeft>
	//   76  138:putfield        #60  <Field float paddingLeft>
		paddingRight = pdfpcell.paddingRight;
	//   77  141:aload_0         
	//   78  142:aload_1         
	//   79  143:getfield        #62  <Field float paddingRight>
	//   80  146:putfield        #62  <Field float paddingRight>
		paddingTop = pdfpcell.paddingTop;
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:getfield        #64  <Field float paddingTop>
	//   84  154:putfield        #64  <Field float paddingTop>
		paddingBottom = pdfpcell.paddingBottom;
	//   85  157:aload_0         
	//   86  158:aload_1         
	//   87  159:getfield        #66  <Field float paddingBottom>
	//   88  162:putfield        #66  <Field float paddingBottom>
		phrase = pdfpcell.phrase;
	//   89  165:aload_0         
	//   90  166:aload_1         
	//   91  167:getfield        #137 <Field Phrase phrase>
	//   92  170:putfield        #137 <Field Phrase phrase>
		fixedHeight = pdfpcell.fixedHeight;
	//   93  173:aload_0         
	//   94  174:aload_1         
	//   95  175:getfield        #68  <Field float fixedHeight>
	//   96  178:putfield        #68  <Field float fixedHeight>
		minimumHeight = pdfpcell.minimumHeight;
	//   97  181:aload_0         
	//   98  182:aload_1         
	//   99  183:getfield        #160 <Field float minimumHeight>
	//  100  186:putfield        #160 <Field float minimumHeight>
		noWrap = pdfpcell.noWrap;
	//  101  189:aload_0         
	//  102  190:aload_1         
	//  103  191:getfield        #72  <Field boolean noWrap>
	//  104  194:putfield        #72  <Field boolean noWrap>
		colspan = pdfpcell.colspan;
	//  105  197:aload_0         
	//  106  198:aload_1         
	//  107  199:getfield        #74  <Field int colspan>
	//  108  202:putfield        #74  <Field int colspan>
		rowspan = pdfpcell.rowspan;
	//  109  205:aload_0         
	//  110  206:aload_1         
	//  111  207:getfield        #76  <Field int rowspan>
	//  112  210:putfield        #76  <Field int rowspan>
		if(pdfpcell.table != null)
	//* 113  213:aload_1         
	//* 114  214:getfield        #162 <Field PdfPTable table>
	//* 115  217:ifnull          235
			table = new PdfPTable(pdfpcell.table);
	//  116  220:aload_0         
	//  117  221:new             #164 <Class PdfPTable>
	//  118  224:dup             
	//  119  225:aload_1         
	//  120  226:getfield        #162 <Field PdfPTable table>
	//  121  229:invokespecial   #167 <Method void PdfPTable(PdfPTable)>
	//  122  232:putfield        #162 <Field PdfPTable table>
		image = Image.getInstance(pdfpcell.image);
	//  123  235:aload_0         
	//  124  236:aload_1         
	//  125  237:getfield        #115 <Field Image image>
	//  126  240:invokestatic    #171 <Method Image Image.getInstance(Image)>
	//  127  243:putfield        #115 <Field Image image>
		cellEvent = pdfpcell.cellEvent;
	//  128  246:aload_0         
	//  129  247:aload_1         
	//  130  248:getfield        #173 <Field PdfPCellEvent cellEvent>
	//  131  251:putfield        #173 <Field PdfPCellEvent cellEvent>
		useDescender = pdfpcell.useDescender;
	//  132  254:aload_0         
	//  133  255:aload_1         
	//  134  256:getfield        #78  <Field boolean useDescender>
	//  135  259:putfield        #78  <Field boolean useDescender>
		column = ColumnText.duplicate(pdfpcell.column);
	//  136  262:aload_0         
	//  137  263:aload_1         
	//  138  264:getfield        #56  <Field ColumnText column>
	//  139  267:invokestatic    #177 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//  140  270:putfield        #56  <Field ColumnText column>
		useBorderPadding = pdfpcell.useBorderPadding;
	//  141  273:aload_0         
	//  142  274:aload_1         
	//  143  275:getfield        #80  <Field boolean useBorderPadding>
	//  144  278:putfield        #80  <Field boolean useBorderPadding>
		rotation = pdfpcell.rotation;
	//  145  281:aload_0         
	//  146  282:aload_1         
	//  147  283:getfield        #179 <Field int rotation>
	//  148  286:putfield        #179 <Field int rotation>
		id = pdfpcell.id;
	//  149  289:aload_0         
	//  150  290:aload_1         
	//  151  291:getfield        #95  <Field AccessibleElementId id>
	//  152  294:putfield        #95  <Field AccessibleElementId id>
		role = pdfpcell.role;
	//  153  297:aload_0         
	//  154  298:aload_1         
	//  155  299:getfield        #87  <Field PdfName role>
	//  156  302:putfield        #87  <Field PdfName role>
		if(pdfpcell.accessibleAttributes != null)
	//* 157  305:aload_1         
	//* 158  306:getfield        #89  <Field HashMap accessibleAttributes>
	//* 159  309:ifnull          327
			accessibleAttributes = new HashMap(((java.util.Map) (pdfpcell.accessibleAttributes)));
	//  160  312:aload_0         
	//  161  313:new             #181 <Class HashMap>
	//  162  316:dup             
	//  163  317:aload_1         
	//  164  318:getfield        #89  <Field HashMap accessibleAttributes>
	//  165  321:invokespecial   #184 <Method void HashMap(java.util.Map)>
	//  166  324:putfield        #89  <Field HashMap accessibleAttributes>
		headers = pdfpcell.headers;
	//  167  327:aload_0         
	//  168  328:aload_1         
	//  169  329:getfield        #97  <Field ArrayList headers>
	//  170  332:putfield        #97  <Field ArrayList headers>
	//  171  335:return          
	}

	public PdfPCell(PdfPTable pdfptable)
	{
		this(pdfptable, ((PdfPCell) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #187 <Method void PdfPCell(PdfPTable, PdfPCell)>
	//    4    6:return          
	}

	public PdfPCell(PdfPTable pdfptable, PdfPCell pdfpcell)
	{
		super(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokespecial   #49  <Method void Rectangle(float, float, float, float)>
		column = new ColumnText(((PdfContentByte) (null)));
	//    6    8:aload_0         
	//    7    9:new             #51  <Class ColumnText>
	//    8   12:dup             
	//    9   13:aconst_null     
	//   10   14:invokespecial   #54  <Method void ColumnText(PdfContentByte)>
	//   11   17:putfield        #56  <Field ColumnText column>
		verticalAlignment = 4;
	//   12   20:aload_0         
	//   13   21:iconst_4        
	//   14   22:putfield        #58  <Field int verticalAlignment>
		paddingLeft = 2.0F;
	//   15   25:aload_0         
	//   16   26:fconst_2        
	//   17   27:putfield        #60  <Field float paddingLeft>
		paddingRight = 2.0F;
	//   18   30:aload_0         
	//   19   31:fconst_2        
	//   20   32:putfield        #62  <Field float paddingRight>
		paddingTop = 2.0F;
	//   21   35:aload_0         
	//   22   36:fconst_2        
	//   23   37:putfield        #64  <Field float paddingTop>
		paddingBottom = 2.0F;
	//   24   40:aload_0         
	//   25   41:fconst_2        
	//   26   42:putfield        #66  <Field float paddingBottom>
		fixedHeight = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #68  <Field float fixedHeight>
		calculatedHeight = 0.0F;
	//   30   50:aload_0         
	//   31   51:fconst_0        
	//   32   52:putfield        #70  <Field float calculatedHeight>
		noWrap = false;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #72  <Field boolean noWrap>
		colspan = 1;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #74  <Field int colspan>
		rowspan = 1;
	//   39   65:aload_0         
	//   40   66:iconst_1        
	//   41   67:putfield        #76  <Field int rowspan>
		useDescender = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #78  <Field boolean useDescender>
		useBorderPadding = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #80  <Field boolean useBorderPadding>
		role = PdfName.TD;
	//   48   80:aload_0         
	//   49   81:getstatic       #85  <Field PdfName PdfName.TD>
	//   50   84:putfield        #87  <Field PdfName role>
		accessibleAttributes = null;
	//   51   87:aload_0         
	//   52   88:aconst_null     
	//   53   89:putfield        #89  <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   54   92:aload_0         
	//   55   93:new             #91  <Class AccessibleElementId>
	//   56   96:dup             
	//   57   97:invokespecial   #93  <Method void AccessibleElementId()>
	//   58  100:putfield        #95  <Field AccessibleElementId id>
		headers = null;
	//   59  103:aload_0         
	//   60  104:aconst_null     
	//   61  105:putfield        #97  <Field ArrayList headers>
		borderWidth = 0.5F;
	//   62  108:aload_0         
	//   63  109:ldc1            #98  <Float 0.5F>
	//   64  111:putfield        #101 <Field float borderWidth>
		border = 15;
	//   65  114:aload_0         
	//   66  115:bipush          15
	//   67  117:putfield        #104 <Field int border>
		column.setLeading(0.0F, 1.0F);
	//   68  120:aload_0         
	//   69  121:getfield        #56  <Field ColumnText column>
	//   70  124:fconst_0        
	//   71  125:fconst_1        
	//   72  126:invokevirtual   #108 <Method void ColumnText.setLeading(float, float)>
		table = pdfptable;
	//   73  129:aload_0         
	//   74  130:aload_1         
	//   75  131:putfield        #162 <Field PdfPTable table>
		pdfptable.setWidthPercentage(100F);
	//   76  134:aload_1         
	//   77  135:ldc1            #188 <Float 100F>
	//   78  137:invokevirtual   #191 <Method void PdfPTable.setWidthPercentage(float)>
		pdfptable.setExtendLastRow(true);
	//   79  140:aload_1         
	//   80  141:iconst_1        
	//   81  142:invokevirtual   #194 <Method void PdfPTable.setExtendLastRow(boolean)>
		column.addElement(((Element) (pdfptable)));
	//   82  145:aload_0         
	//   83  146:getfield        #56  <Field ColumnText column>
	//   84  149:aload_1         
	//   85  150:invokevirtual   #198 <Method void ColumnText.addElement(Element)>
		if(pdfpcell != null)
	//*  86  153:aload_2         
	//*  87  154:ifnull          251
		{
			cloneNonPositionParameters(((Rectangle) (pdfpcell)));
	//   88  157:aload_0         
	//   89  158:aload_2         
	//   90  159:invokevirtual   #158 <Method void cloneNonPositionParameters(Rectangle)>
			verticalAlignment = pdfpcell.verticalAlignment;
	//   91  162:aload_0         
	//   92  163:aload_2         
	//   93  164:getfield        #58  <Field int verticalAlignment>
	//   94  167:putfield        #58  <Field int verticalAlignment>
			paddingLeft = pdfpcell.paddingLeft;
	//   95  170:aload_0         
	//   96  171:aload_2         
	//   97  172:getfield        #60  <Field float paddingLeft>
	//   98  175:putfield        #60  <Field float paddingLeft>
			paddingRight = pdfpcell.paddingRight;
	//   99  178:aload_0         
	//  100  179:aload_2         
	//  101  180:getfield        #62  <Field float paddingRight>
	//  102  183:putfield        #62  <Field float paddingRight>
			paddingTop = pdfpcell.paddingTop;
	//  103  186:aload_0         
	//  104  187:aload_2         
	//  105  188:getfield        #64  <Field float paddingTop>
	//  106  191:putfield        #64  <Field float paddingTop>
			paddingBottom = pdfpcell.paddingBottom;
	//  107  194:aload_0         
	//  108  195:aload_2         
	//  109  196:getfield        #66  <Field float paddingBottom>
	//  110  199:putfield        #66  <Field float paddingBottom>
			colspan = pdfpcell.colspan;
	//  111  202:aload_0         
	//  112  203:aload_2         
	//  113  204:getfield        #74  <Field int colspan>
	//  114  207:putfield        #74  <Field int colspan>
			rowspan = pdfpcell.rowspan;
	//  115  210:aload_0         
	//  116  211:aload_2         
	//  117  212:getfield        #76  <Field int rowspan>
	//  118  215:putfield        #76  <Field int rowspan>
			cellEvent = pdfpcell.cellEvent;
	//  119  218:aload_0         
	//  120  219:aload_2         
	//  121  220:getfield        #173 <Field PdfPCellEvent cellEvent>
	//  122  223:putfield        #173 <Field PdfPCellEvent cellEvent>
			useDescender = pdfpcell.useDescender;
	//  123  226:aload_0         
	//  124  227:aload_2         
	//  125  228:getfield        #78  <Field boolean useDescender>
	//  126  231:putfield        #78  <Field boolean useDescender>
			useBorderPadding = pdfpcell.useBorderPadding;
	//  127  234:aload_0         
	//  128  235:aload_2         
	//  129  236:getfield        #80  <Field boolean useBorderPadding>
	//  130  239:putfield        #80  <Field boolean useBorderPadding>
			rotation = pdfpcell.rotation;
	//  131  242:aload_0         
	//  132  243:aload_2         
	//  133  244:getfield        #179 <Field int rotation>
	//  134  247:putfield        #179 <Field int rotation>
			return;
	//  135  250:return          
		} else
		{
			setPadding(0.0F);
	//  136  251:aload_0         
	//  137  252:fconst_0        
	//  138  253:invokevirtual   #119 <Method void setPadding(float)>
			return;
	//  139  256:return          
		}
	}

	public void addElement(Element element)
	{
		if(table != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfPTable table>
	//*   2    4:ifnull          20
		{
			table = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #162 <Field PdfPTable table>
			column.setText(((Phrase) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field ColumnText column>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #201 <Method void ColumnText.setText(Phrase)>
		}
		if(element instanceof PdfPTable)
	//*  10   20:aload_1         
	//*  11   21:instanceof      #164 <Class PdfPTable>
	//*  12   24:ifeq            44
			((PdfPTable)element).setSplitLate(false);
	//   13   27:aload_1         
	//   14   28:checkcast       #164 <Class PdfPTable>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #204 <Method void PdfPTable.setSplitLate(boolean)>
		else
	//*  17   35:aload_0         
	//*  18   36:getfield        #56  <Field ColumnText column>
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #198 <Method void ColumnText.addElement(Element)>
	//*  21   43:return          
		if(element instanceof PdfDiv)
	//*  22   44:aload_1         
	//*  23   45:instanceof      #206 <Class PdfDiv>
	//*  24   48:ifeq            35
		{
			Iterator iterator = ((PdfDiv)element).getContent().iterator();
	//   25   51:aload_1         
	//   26   52:checkcast       #206 <Class PdfDiv>
	//   27   55:invokevirtual   #210 <Method ArrayList PdfDiv.getContent()>
	//   28   58:invokevirtual   #216 <Method Iterator ArrayList.iterator()>
	//   29   61:astore_2        
			while(iterator.hasNext()) 
	//*  30   62:aload_2         
	//*  31   63:invokeinterface #222 <Method boolean Iterator.hasNext()>
	//*  32   68:ifeq            35
			{
				Element element1 = (Element)iterator.next();
	//   33   71:aload_2         
	//   34   72:invokeinterface #226 <Method Object Iterator.next()>
	//   35   77:checkcast       #228 <Class Element>
	//   36   80:astore_3        
				if(element1 instanceof PdfPTable)
	//*  37   81:aload_3         
	//*  38   82:instanceof      #164 <Class PdfPTable>
	//*  39   85:ifeq            62
					((PdfPTable)element1).setSplitLate(false);
	//   40   88:aload_3         
	//   41   89:checkcast       #164 <Class PdfPTable>
	//   42   92:iconst_0        
	//   43   93:invokevirtual   #204 <Method void PdfPTable.setSplitLate(boolean)>
			}
		}
		column.addElement(element);
	//*  44   96:goto            62
	}

	public void addHeader(PdfPHeaderCell pdfpheadercell)
	{
		if(headers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field ArrayList headers>
	//*   2    4:ifnonnull       18
			headers = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #212 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #231 <Method void ArrayList()>
	//    7   15:putfield        #97  <Field ArrayList headers>
		headers.add(((Object) (pdfpheadercell)));
	//    8   18:aload_0         
	//    9   19:getfield        #97  <Field ArrayList headers>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #235 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #241 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #243 <Class PdfObject>
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
	//    1    1:getfield        #89  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public int getArabicOptions()
	{
		return column.getArabicOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #251 <Method int ColumnText.getArabicOptions()>
	//    3    7:ireturn         
	}

	public float getCachedMaxHeight()
	{
		return cachedMaxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field float cachedMaxHeight>
	//    2    4:freturn         
	}

	public float getCalculatedHeight()
	{
		return calculatedHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float calculatedHeight>
	//    2    4:freturn         
	}

	public PdfPCellEvent getCellEvent()
	{
		return cellEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field PdfPCellEvent cellEvent>
	//    2    4:areturn         
	}

	public int getColspan()
	{
		return colspan;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int colspan>
	//    2    4:ireturn         
	}

	public ColumnText getColumn()
	{
		return column;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:areturn         
	}

	public List getCompositeElements()
	{
		return ((List) (getColumn().compositeElements));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method ColumnText getColumn()>
	//    2    4:getfield        #269 <Field java.util.LinkedList ColumnText.compositeElements>
	//    3    7:areturn         
	}

	public float getEffectivePaddingBottom()
	{
		if(isUseBorderPadding())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean isUseBorderPadding()>
	//*   2    4:ifeq            37
		{
			float f1 = getBorderWidthBottom();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #277 <Method float getBorderWidthBottom()>
	//    5   11:fstore_2        
			float f;
			if(isUseVariableBorders())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #280 <Method boolean isUseVariableBorders()>
	//*   8   16:ifeq            32
				f = 1.0F;
	//    9   19:fconst_1        
	//   10   20:fstore_1        
			else
	//*  11   21:fload_2         
	//*  12   22:fload_1         
	//*  13   23:fdiv            
	//*  14   24:fstore_1        
	//*  15   25:aload_0         
	//*  16   26:getfield        #66  <Field float paddingBottom>
	//*  17   29:fload_1         
	//*  18   30:fadd            
	//*  19   31:freturn         
				f = 2.0F;
	//   20   32:fconst_2        
	//   21   33:fstore_1        
			f = f1 / f;
			return paddingBottom + f;
		} else
	//*  22   34:goto            21
		{
			return paddingBottom;
	//   23   37:aload_0         
	//   24   38:getfield        #66  <Field float paddingBottom>
	//   25   41:freturn         
		}
	}

	public float getEffectivePaddingLeft()
	{
		if(isUseBorderPadding())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean isUseBorderPadding()>
	//*   2    4:ifeq            37
		{
			float f1 = getBorderWidthLeft();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #284 <Method float getBorderWidthLeft()>
	//    5   11:fstore_2        
			float f;
			if(isUseVariableBorders())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #280 <Method boolean isUseVariableBorders()>
	//*   8   16:ifeq            32
				f = 1.0F;
	//    9   19:fconst_1        
	//   10   20:fstore_1        
			else
	//*  11   21:fload_2         
	//*  12   22:fload_1         
	//*  13   23:fdiv            
	//*  14   24:fstore_1        
	//*  15   25:aload_0         
	//*  16   26:getfield        #60  <Field float paddingLeft>
	//*  17   29:fload_1         
	//*  18   30:fadd            
	//*  19   31:freturn         
				f = 2.0F;
	//   20   32:fconst_2        
	//   21   33:fstore_1        
			f = f1 / f;
			return paddingLeft + f;
		} else
	//*  22   34:goto            21
		{
			return paddingLeft;
	//   23   37:aload_0         
	//   24   38:getfield        #60  <Field float paddingLeft>
	//   25   41:freturn         
		}
	}

	public float getEffectivePaddingRight()
	{
		if(isUseBorderPadding())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean isUseBorderPadding()>
	//*   2    4:ifeq            37
		{
			float f1 = getBorderWidthRight();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #288 <Method float getBorderWidthRight()>
	//    5   11:fstore_2        
			float f;
			if(isUseVariableBorders())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #280 <Method boolean isUseVariableBorders()>
	//*   8   16:ifeq            32
				f = 1.0F;
	//    9   19:fconst_1        
	//   10   20:fstore_1        
			else
	//*  11   21:fload_2         
	//*  12   22:fload_1         
	//*  13   23:fdiv            
	//*  14   24:fstore_1        
	//*  15   25:aload_0         
	//*  16   26:getfield        #62  <Field float paddingRight>
	//*  17   29:fload_1         
	//*  18   30:fadd            
	//*  19   31:freturn         
				f = 2.0F;
	//   20   32:fconst_2        
	//   21   33:fstore_1        
			f = f1 / f;
			return paddingRight + f;
		} else
	//*  22   34:goto            21
		{
			return paddingRight;
	//   23   37:aload_0         
	//   24   38:getfield        #62  <Field float paddingRight>
	//   25   41:freturn         
		}
	}

	public float getEffectivePaddingTop()
	{
		if(isUseBorderPadding())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean isUseBorderPadding()>
	//*   2    4:ifeq            37
		{
			float f1 = getBorderWidthTop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #292 <Method float getBorderWidthTop()>
	//    5   11:fstore_2        
			float f;
			if(isUseVariableBorders())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #280 <Method boolean isUseVariableBorders()>
	//*   8   16:ifeq            32
				f = 1.0F;
	//    9   19:fconst_1        
	//   10   20:fstore_1        
			else
	//*  11   21:fload_2         
	//*  12   22:fload_1         
	//*  13   23:fdiv            
	//*  14   24:fstore_1        
	//*  15   25:aload_0         
	//*  16   26:getfield        #64  <Field float paddingTop>
	//*  17   29:fload_1         
	//*  18   30:fadd            
	//*  19   31:freturn         
				f = 2.0F;
	//   20   32:fconst_2        
	//   21   33:fstore_1        
			f = f1 / f;
			return paddingTop + f;
		} else
	//*  22   34:goto            21
		{
			return paddingTop;
	//   23   37:aload_0         
	//   24   38:getfield        #64  <Field float paddingTop>
	//   25   41:freturn         
		}
	}

	public float getExtraParagraphSpace()
	{
		return column.getExtraParagraphSpace();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #295 <Method float ColumnText.getExtraParagraphSpace()>
	//    3    7:freturn         
	}

	public float getFixedHeight()
	{
		return fixedHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field float fixedHeight>
	//    2    4:freturn         
	}

	public float getFollowingIndent()
	{
		return column.getFollowingIndent();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #299 <Method float ColumnText.getFollowingIndent()>
	//    3    7:freturn         
	}

	public ArrayList getHeaders()
	{
		return headers;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ArrayList headers>
	//    2    4:areturn         
	}

	public int getHorizontalAlignment()
	{
		return column.getAlignment();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #305 <Method int ColumnText.getAlignment()>
	//    3    7:ireturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public Image getImage()
	{
		return image;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Image image>
	//    2    4:areturn         
	}

	public float getIndent()
	{
		return column.getIndent();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #312 <Method float ColumnText.getIndent()>
	//    3    7:freturn         
	}

	public float getLeading()
	{
		return column.getLeading();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #315 <Method float ColumnText.getLeading()>
	//    3    7:freturn         
	}

	public float getMaxHeight()
	{
		float f;
		float f1;
		boolean flag;
		Image image1;
		if(getRotation() == 90 || getRotation() == 270)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #321 <Method int getRotation()>
	//*   2    4:bipush          90
	//*   3    6:icmpeq          19
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #321 <Method int getRotation()>
	//*   6   13:sipush          270
	//*   7   16:icmpne          153
			flag = true;
	//    8   19:iconst_1        
	//    9   20:istore          5
		else
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #323 <Method Image getImage()>
	//*  12   26:astore          6
	//*  13   28:aload           6
	//*  14   30:ifnull          177
	//*  15   33:aload           6
	//*  16   35:ldc1            #188 <Float 100F>
	//*  17   37:invokevirtual   #326 <Method void Image.scalePercent(float)>
	//*  18   40:iload           5
	//*  19   42:ifeq            159
	//*  20   45:aload           6
	//*  21   47:invokevirtual   #329 <Method float Image.getScaledHeight()>
	//*  22   50:fstore_1        
	//*  23   51:aload           6
	//*  24   53:ldc1            #188 <Float 100F>
	//*  25   55:aload_0         
	//*  26   56:invokevirtual   #332 <Method float getRight()>
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #334 <Method float getEffectivePaddingRight()>
	//*  29   63:fsub            
	//*  30   64:aload_0         
	//*  31   65:invokevirtual   #336 <Method float getEffectivePaddingLeft()>
	//*  32   68:fsub            
	//*  33   69:aload_0         
	//*  34   70:invokevirtual   #339 <Method float getLeft()>
	//*  35   73:fsub            
	//*  36   74:fload_1         
	//*  37   75:fdiv            
	//*  38   76:fmul            
	//*  39   77:invokevirtual   #326 <Method void Image.scalePercent(float)>
	//*  40   80:iload           5
	//*  41   82:ifeq            168
	//*  42   85:aload           6
	//*  43   87:invokevirtual   #342 <Method float Image.getScaledWidth()>
	//*  44   90:fstore_1        
	//*  45   91:aload_0         
	//*  46   92:aload_0         
	//*  47   93:invokevirtual   #345 <Method float getTop()>
	//*  48   96:aload_0         
	//*  49   97:invokevirtual   #347 <Method float getEffectivePaddingTop()>
	//*  50  100:fsub            
	//*  51  101:aload_0         
	//*  52  102:invokevirtual   #349 <Method float getEffectivePaddingBottom()>
	//*  53  105:fsub            
	//*  54  106:fload_1         
	//*  55  107:fsub            
	//*  56  108:invokevirtual   #352 <Method void setBottom(float)>
	//*  57  111:aload_0         
	//*  58  112:invokevirtual   #355 <Method float getHeight()>
	//*  59  115:fstore_2        
	//*  60  116:fload_2         
	//*  61  117:fstore_1        
	//*  62  118:fload_2         
	//*  63  119:aload_0         
	//*  64  120:invokevirtual   #347 <Method float getEffectivePaddingTop()>
	//*  65  123:aload_0         
	//*  66  124:invokevirtual   #349 <Method float getEffectivePaddingBottom()>
	//*  67  127:fadd            
	//*  68  128:fcmpl           
	//*  69  129:ifne            134
	//*  70  132:fconst_0        
	//*  71  133:fstore_1        
	//*  72  134:aload_0         
	//*  73  135:invokevirtual   #358 <Method boolean hasFixedHeight()>
	//*  74  138:ifeq            428
	//*  75  141:aload_0         
	//*  76  142:invokevirtual   #360 <Method float getFixedHeight()>
	//*  77  145:fstore_2        
	//*  78  146:aload_0         
	//*  79  147:fload_2         
	//*  80  148:putfield        #255 <Field float cachedMaxHeight>
	//*  81  151:fload_2         
	//*  82  152:freturn         
			flag = false;
	//   83  153:iconst_0        
	//   84  154:istore          5
		image1 = getImage();
		if(image1 != null)
		{
			image1.scalePercent(100F);
			if(flag)
				f = image1.getScaledHeight();
			else
	//*  85  156:goto            22
				f = image1.getScaledWidth();
	//   86  159:aload           6
	//   87  161:invokevirtual   #342 <Method float Image.getScaledWidth()>
	//   88  164:fstore_1        
			image1.scalePercent(100F * ((getRight() - getEffectivePaddingRight() - getEffectivePaddingLeft() - getLeft()) / f));
			if(flag)
				f = image1.getScaledWidth();
			else
	//*  89  165:goto            51
				f = image1.getScaledHeight();
	//   90  168:aload           6
	//   91  170:invokevirtual   #329 <Method float Image.getScaledHeight()>
	//   92  173:fstore_1        
			setBottom(getTop() - getEffectivePaddingTop() - getEffectivePaddingBottom() - f);
		} else
	//*  93  174:goto            91
		if(flag && hasFixedHeight() || getColumn() == null)
	//*  94  177:iload           5
	//*  95  179:ifeq            189
	//*  96  182:aload_0         
	//*  97  183:invokevirtual   #358 <Method boolean hasFixedHeight()>
	//*  98  186:ifne            196
	//*  99  189:aload_0         
	//* 100  190:invokevirtual   #265 <Method ColumnText getColumn()>
	//* 101  193:ifnonnull       212
		{
			setBottom(getTop() - getFixedHeight());
	//  102  196:aload_0         
	//  103  197:aload_0         
	//  104  198:invokevirtual   #345 <Method float getTop()>
	//  105  201:aload_0         
	//  106  202:invokevirtual   #360 <Method float getFixedHeight()>
	//  107  205:fsub            
	//  108  206:invokevirtual   #352 <Method void setBottom(float)>
		} else
	//* 109  209:goto            111
		{
			Object obj = ((Object) (ColumnText.duplicate(getColumn())));
	//  110  212:aload_0         
	//  111  213:invokevirtual   #265 <Method ColumnText getColumn()>
	//  112  216:invokestatic    #177 <Method ColumnText ColumnText.duplicate(ColumnText)>
	//  113  219:astore          6
			float f2;
			float f3;
			if(flag)
	//* 114  221:iload           5
	//* 115  223:ifeq            303
			{
				f = 20000F;
	//  116  226:ldc2            #361 <Float 20000F>
	//  117  229:fstore_1        
				f3 = getRight() - getEffectivePaddingRight();
	//  118  230:aload_0         
	//  119  231:invokevirtual   #332 <Method float getRight()>
	//  120  234:aload_0         
	//  121  235:invokevirtual   #334 <Method float getEffectivePaddingRight()>
	//  122  238:fsub            
	//  123  239:fstore          4
				f2 = 0.0F;
	//  124  241:fconst_0        
	//  125  242:fstore_3        
				f1 = getLeft() + getEffectivePaddingLeft();
	//  126  243:aload_0         
	//  127  244:invokevirtual   #339 <Method float getLeft()>
	//  128  247:aload_0         
	//  129  248:invokevirtual   #336 <Method float getEffectivePaddingLeft()>
	//  130  251:fadd            
	//  131  252:fstore_2        
			} else
	//* 132  253:aload           6
	//* 133  255:fload_3         
	//* 134  256:fload_2         
	//* 135  257:fload_1         
	//* 136  258:fload           4
	//* 137  260:invokestatic    #367 <Method float PdfPRow.setColumn(ColumnText, float, float, float, float)>
	//* 138  263:pop             
	//* 139  264:aload           6
	//* 140  266:iconst_1        
	//* 141  267:invokevirtual   #371 <Method int ColumnText.go(boolean)>
	//* 142  270:pop             
	//* 143  271:iload           5
	//* 144  273:ifeq            392
	//* 145  276:aload_0         
	//* 146  277:aload_0         
	//* 147  278:invokevirtual   #345 <Method float getTop()>
	//* 148  281:aload_0         
	//* 149  282:invokevirtual   #347 <Method float getEffectivePaddingTop()>
	//* 150  285:fsub            
	//* 151  286:aload_0         
	//* 152  287:invokevirtual   #349 <Method float getEffectivePaddingBottom()>
	//* 153  290:fsub            
	//* 154  291:aload           6
	//* 155  293:invokevirtual   #374 <Method float ColumnText.getFilledWidth()>
	//* 156  296:fsub            
	//* 157  297:invokevirtual   #352 <Method void setBottom(float)>
	//* 158  300:goto            111
			{
				if(isNoWrap())
	//* 159  303:aload_0         
	//* 160  304:invokevirtual   #377 <Method boolean isNoWrap()>
	//* 161  307:ifeq            360
					f = 20000F;
	//  162  310:ldc2            #361 <Float 20000F>
	//  163  313:fstore_1        
				else
	//* 164  314:aload_0         
	//* 165  315:invokevirtual   #345 <Method float getTop()>
	//* 166  318:aload_0         
	//* 167  319:invokevirtual   #347 <Method float getEffectivePaddingTop()>
	//* 168  322:fsub            
	//* 169  323:fstore          4
	//* 170  325:aload_0         
	//* 171  326:invokevirtual   #339 <Method float getLeft()>
	//* 172  329:aload_0         
	//* 173  330:invokevirtual   #336 <Method float getEffectivePaddingLeft()>
	//* 174  333:fadd            
	//* 175  334:fstore_3        
	//* 176  335:aload_0         
	//* 177  336:invokevirtual   #380 <Method boolean hasCalculatedHeight()>
	//* 178  339:ifeq            373
	//* 179  342:aload_0         
	//* 180  343:invokevirtual   #345 <Method float getTop()>
	//* 181  346:aload_0         
	//* 182  347:invokevirtual   #349 <Method float getEffectivePaddingBottom()>
	//* 183  350:fadd            
	//* 184  351:aload_0         
	//* 185  352:invokevirtual   #382 <Method float getCalculatedHeight()>
	//* 186  355:fsub            
	//* 187  356:fstore_2        
	//* 188  357:goto            253
					f = getRight() - getEffectivePaddingRight();
	//  189  360:aload_0         
	//  190  361:invokevirtual   #332 <Method float getRight()>
	//  191  364:aload_0         
	//  192  365:invokevirtual   #334 <Method float getEffectivePaddingRight()>
	//  193  368:fsub            
	//  194  369:fstore_1        
				f3 = getTop() - getEffectivePaddingTop();
				f2 = getLeft() + getEffectivePaddingLeft();
				if(hasCalculatedHeight())
					f1 = (getTop() + getEffectivePaddingBottom()) - getCalculatedHeight();
				else
	//* 195  370:goto            314
					f1 = -1.073742E+09F;
	//  196  373:ldc2            #383 <Float -1.073742E+09F>
	//  197  376:fstore_2        
			}
			PdfPRow.setColumn(((ColumnText) (obj)), f2, f1, f, f3);
			try
			{
				((ColumnText) (obj)).go(true);
			}
	//* 198  377:goto            357
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 199  380:astore          6
			{
				throw new ExceptionConverter(((Exception) (obj)));
	//  200  382:new             #385 <Class ExceptionConverter>
	//  201  385:dup             
	//  202  386:aload           6
	//  203  388:invokespecial   #388 <Method void ExceptionConverter(Exception)>
	//  204  391:athrow          
			}
			if(flag)
			{
				setBottom(getTop() - getEffectivePaddingTop() - getEffectivePaddingBottom() - ((ColumnText) (obj)).getFilledWidth());
			} else
			{
				f1 = ((ColumnText) (obj)).getYLine();
	//  205  392:aload           6
	//  206  394:invokevirtual   #391 <Method float ColumnText.getYLine()>
	//  207  397:fstore_2        
				f = f1;
	//  208  398:fload_2         
	//  209  399:fstore_1        
				if(isUseDescender())
	//* 210  400:aload_0         
	//* 211  401:invokevirtual   #394 <Method boolean isUseDescender()>
	//* 212  404:ifeq            415
					f = f1 + ((ColumnText) (obj)).getDescender();
	//  213  407:fload_2         
	//  214  408:aload           6
	//  215  410:invokevirtual   #397 <Method float ColumnText.getDescender()>
	//  216  413:fadd            
	//  217  414:fstore_1        
				setBottom(f - getEffectivePaddingBottom());
	//  218  415:aload_0         
	//  219  416:fload_1         
	//  220  417:aload_0         
	//  221  418:invokevirtual   #349 <Method float getEffectivePaddingBottom()>
	//  222  421:fsub            
	//  223  422:invokevirtual   #352 <Method void setBottom(float)>
			}
		}
		f1 = getHeight();
		f = f1;
		if(f1 == getEffectivePaddingTop() + getEffectivePaddingBottom())
			f = 0.0F;
		if(!hasFixedHeight()) goto _L2; else goto _L1
_L1:
		f1 = getFixedHeight();
_L4:
		cachedMaxHeight = f1;
		return f1;
	//* 224  425:goto            111
_L2:
		f1 = f;
	//  225  428:fload_1         
	//  226  429:fstore_2        
		if(hasMinimumHeight())
	//* 227  430:aload_0         
	//* 228  431:invokevirtual   #400 <Method boolean hasMinimumHeight()>
	//* 229  434:ifeq            146
		{
			f1 = f;
	//  230  437:fload_1         
	//  231  438:fstore_2        
			if(f < getMinimumHeight())
	//* 232  439:fload_1         
	//* 233  440:aload_0         
	//* 234  441:invokevirtual   #403 <Method float getMinimumHeight()>
	//* 235  444:fcmpg           
	//* 236  445:ifge            146
				f1 = getMinimumHeight();
	//  237  448:aload_0         
	//  238  449:invokevirtual   #403 <Method float getMinimumHeight()>
	//  239  452:fstore_2        
		}
		if(true) goto _L4; else goto _L3
	//  240  453:goto            146
_L3:
	}

	public float getMinimumHeight()
	{
		return minimumHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field float minimumHeight>
	//    2    4:freturn         
	}

	public float getMultipliedLeading()
	{
		return column.getMultipliedLeading();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #406 <Method float ColumnText.getMultipliedLeading()>
	//    3    7:freturn         
	}

	public float getPaddingBottom()
	{
		return paddingBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field float paddingBottom>
	//    2    4:freturn         
	}

	public float getPaddingLeft()
	{
		return paddingLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float paddingLeft>
	//    2    4:freturn         
	}

	public float getPaddingRight()
	{
		return paddingRight;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float paddingRight>
	//    2    4:freturn         
	}

	public float getPaddingTop()
	{
		return paddingTop;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float paddingTop>
	//    2    4:freturn         
	}

	public Phrase getPhrase()
	{
		return phrase;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Phrase phrase>
	//    2    4:areturn         
	}

	public float getRightIndent()
	{
		return column.getRightIndent();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #415 <Method float ColumnText.getRightIndent()>
	//    3    7:freturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field PdfName role>
	//    2    4:areturn         
	}

	public int getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int rotation>
	//    2    4:ireturn         
	}

	public int getRowspan()
	{
		return rowspan;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int rowspan>
	//    2    4:ireturn         
	}

	public int getRunDirection()
	{
		return column.getRunDirection();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #421 <Method int ColumnText.getRunDirection()>
	//    3    7:ireturn         
	}

	public float getSpaceCharRatio()
	{
		return column.getSpaceCharRatio();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #424 <Method float ColumnText.getSpaceCharRatio()>
	//    3    7:freturn         
	}

	public PdfPTable getTable()
	{
		return table;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field PdfPTable table>
	//    2    4:areturn         
	}

	public int getVerticalAlignment()
	{
		return verticalAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int verticalAlignment>
	//    2    4:ireturn         
	}

	public boolean hasCachedMaxHeight()
	{
		return cachedMaxHeight > 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field float cachedMaxHeight>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean hasCalculatedHeight()
	{
		return getCalculatedHeight() > 0.0F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #382 <Method float getCalculatedHeight()>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean hasFixedHeight()
	{
		return getFixedHeight() > 0.0F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #360 <Method float getFixedHeight()>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean hasMinimumHeight()
	{
		return getMinimumHeight() > 0.0F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method float getMinimumHeight()>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNoWrap()
	{
		return noWrap;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean noWrap>
	//    2    4:ireturn         
	}

	public boolean isUseAscender()
	{
		return column.isUseAscender();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:invokevirtual   #432 <Method boolean ColumnText.isUseAscender()>
	//    3    7:ireturn         
	}

	public boolean isUseBorderPadding()
	{
		return useBorderPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean useBorderPadding>
	//    2    4:ireturn         
	}

	public boolean isUseDescender()
	{
		return useDescender;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean useDescender>
	//    2    4:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #181 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #435 <Method void HashMap()>
	//    7   15:putfield        #89  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #89  <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #439 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setArabicOptions(int i)
	{
		column.setArabicOptions(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #443 <Method void ColumnText.setArabicOptions(int)>
	//    4    8:return          
	}

	public void setCalculatedHeight(float f)
	{
		calculatedHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float calculatedHeight>
	//    3    5:return          
	}

	public void setCellEvent(PdfPCellEvent pdfpcellevent)
	{
		if(pdfpcellevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			cellEvent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #173 <Field PdfPCellEvent cellEvent>
			return;
	//    5    9:return          
		}
		if(cellEvent == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #173 <Field PdfPCellEvent cellEvent>
	//*   8   14:ifnonnull       23
		{
			cellEvent = pdfpcellevent;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #173 <Field PdfPCellEvent cellEvent>
			return;
	//   12   22:return          
		}
		if(cellEvent instanceof PdfPCellEventForwarder)
	//*  13   23:aload_0         
	//*  14   24:getfield        #173 <Field PdfPCellEvent cellEvent>
	//*  15   27:instanceof      #448 <Class PdfPCellEventForwarder>
	//*  16   30:ifeq            45
		{
			((PdfPCellEventForwarder)cellEvent).addCellEvent(pdfpcellevent);
	//   17   33:aload_0         
	//   18   34:getfield        #173 <Field PdfPCellEvent cellEvent>
	//   19   37:checkcast       #448 <Class PdfPCellEventForwarder>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #451 <Method void PdfPCellEventForwarder.addCellEvent(PdfPCellEvent)>
			return;
	//   22   44:return          
		} else
		{
			PdfPCellEventForwarder pdfpcelleventforwarder = new PdfPCellEventForwarder();
	//   23   45:new             #448 <Class PdfPCellEventForwarder>
	//   24   48:dup             
	//   25   49:invokespecial   #452 <Method void PdfPCellEventForwarder()>
	//   26   52:astore_2        
			pdfpcelleventforwarder.addCellEvent(cellEvent);
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #173 <Field PdfPCellEvent cellEvent>
	//   30   58:invokevirtual   #451 <Method void PdfPCellEventForwarder.addCellEvent(PdfPCellEvent)>
			pdfpcelleventforwarder.addCellEvent(pdfpcellevent);
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #451 <Method void PdfPCellEventForwarder.addCellEvent(PdfPCellEvent)>
			cellEvent = ((PdfPCellEvent) (pdfpcelleventforwarder));
	//   34   66:aload_0         
	//   35   67:aload_2         
	//   36   68:putfield        #173 <Field PdfPCellEvent cellEvent>
			return;
	//   37   71:return          
		}
	}

	public void setColspan(int i)
	{
		colspan = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int colspan>
	//    3    5:return          
	}

	public void setColumn(ColumnText columntext)
	{
		column = columntext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field ColumnText column>
	//    3    5:return          
	}

	public void setExtraParagraphSpace(float f)
	{
		column.setExtraParagraphSpace(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #457 <Method void ColumnText.setExtraParagraphSpace(float)>
	//    4    8:return          
	}

	public void setFixedHeight(float f)
	{
		fixedHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #68  <Field float fixedHeight>
		minimumHeight = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #160 <Field float minimumHeight>
	//    6   10:return          
	}

	public void setFollowingIndent(float f)
	{
		column.setFollowingIndent(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #461 <Method void ColumnText.setFollowingIndent(float)>
	//    4    8:return          
	}

	public void setHorizontalAlignment(int i)
	{
		column.setAlignment(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #465 <Method void ColumnText.setAlignment(int)>
	//    4    8:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setImage(Image image1)
	{
		column.setText(((Phrase) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #201 <Method void ColumnText.setText(Phrase)>
		table = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #162 <Field PdfPTable table>
		image = image1;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #115 <Field Image image>
	//   10   18:return          
	}

	public void setIndent(float f)
	{
		column.setIndent(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #471 <Method void ColumnText.setIndent(float)>
	//    4    8:return          
	}

	public void setLeading(float f, float f1)
	{
		column.setLeading(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #108 <Method void ColumnText.setLeading(float, float)>
	//    5    9:return          
	}

	public void setMinimumHeight(float f)
	{
		minimumHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #160 <Field float minimumHeight>
		fixedHeight = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #68  <Field float fixedHeight>
	//    6   10:return          
	}

	public void setNoWrap(boolean flag)
	{
		noWrap = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean noWrap>
	//    3    5:return          
	}

	public void setPadding(float f)
	{
		paddingBottom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #66  <Field float paddingBottom>
		paddingTop = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #64  <Field float paddingTop>
		paddingLeft = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #60  <Field float paddingLeft>
		paddingRight = f;
	//    9   15:aload_0         
	//   10   16:fload_1         
	//   11   17:putfield        #62  <Field float paddingRight>
	//   12   20:return          
	}

	public void setPaddingBottom(float f)
	{
		paddingBottom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #66  <Field float paddingBottom>
	//    3    5:return          
	}

	public void setPaddingLeft(float f)
	{
		paddingLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #60  <Field float paddingLeft>
	//    3    5:return          
	}

	public void setPaddingRight(float f)
	{
		paddingRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #62  <Field float paddingRight>
	//    3    5:return          
	}

	public void setPaddingTop(float f)
	{
		paddingTop = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #64  <Field float paddingTop>
	//    3    5:return          
	}

	public void setPhrase(Phrase phrase1)
	{
		table = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #162 <Field PdfPTable table>
		image = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #115 <Field Image image>
		ColumnText columntext = column;
	//    6   10:aload_0         
	//    7   11:getfield        #56  <Field ColumnText column>
	//    8   14:astore_2        
		phrase = phrase1;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #137 <Field Phrase phrase>
		columntext.setText(phrase1);
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #201 <Method void ColumnText.setText(Phrase)>
	//   15   25:return          
	}

	public void setRightIndent(float f)
	{
		column.setRightIndent(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #481 <Method void ColumnText.setRightIndent(float)>
	//    4    8:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field PdfName role>
	//    3    5:return          
	}

	public void setRotation(int i)
	{
		int j = i % 360;
	//    0    0:iload_1         
	//    1    1:sipush          360
	//    2    4:irem            
	//    3    5:istore_2        
		i = j;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(j < 0)
	//*   6    8:iload_2         
	//*   7    9:ifge            18
			i = j + 360;
	//    8   12:iload_2         
	//    9   13:sipush          360
	//   10   16:iadd            
	//   11   17:istore_1        
		if(i % 90 != 0)
	//*  12   18:iload_1         
	//*  13   19:bipush          90
	//*  14   21:irem            
	//*  15   22:ifeq            43
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("rotation.must.be.a.multiple.of.90", new Object[0]));
	//   16   25:new             #486 <Class IllegalArgumentException>
	//   17   28:dup             
	//   18   29:ldc2            #488 <String "rotation.must.be.a.multiple.of.90">
	//   19   32:iconst_0        
	//   20   33:anewarray       Object[]
	//   21   36:invokestatic    #496 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   39:invokespecial   #499 <Method void IllegalArgumentException(String)>
	//   23   42:athrow          
		} else
		{
			rotation = i;
	//   24   43:aload_0         
	//   25   44:iload_1         
	//   26   45:putfield        #179 <Field int rotation>
			return;
	//   27   48:return          
		}
	}

	public void setRowspan(int i)
	{
		rowspan = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field int rowspan>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		column.setRunDirection(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #503 <Method void ColumnText.setRunDirection(int)>
	//    4    8:return          
	}

	public void setSpaceCharRatio(float f)
	{
		column.setSpaceCharRatio(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #506 <Method void ColumnText.setSpaceCharRatio(float)>
	//    4    8:return          
	}

	void setTable(PdfPTable pdfptable)
	{
		table = pdfptable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field PdfPTable table>
		column.setText(((Phrase) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field ColumnText column>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #201 <Method void ColumnText.setText(Phrase)>
		image = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #115 <Field Image image>
		if(pdfptable != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          51
		{
			boolean flag;
			if(verticalAlignment == 4)
	//*  12   22:aload_0         
	//*  13   23:getfield        #58  <Field int verticalAlignment>
	//*  14   26:iconst_4        
	//*  15   27:icmpne          52
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			else
	//*  18   32:aload_1         
	//*  19   33:iload_2         
	//*  20   34:invokevirtual   #194 <Method void PdfPTable.setExtendLastRow(boolean)>
	//*  21   37:aload_0         
	//*  22   38:getfield        #56  <Field ColumnText column>
	//*  23   41:aload_1         
	//*  24   42:invokevirtual   #198 <Method void ColumnText.addElement(Element)>
	//*  25   45:aload_1         
	//*  26   46:ldc1            #188 <Float 100F>
	//*  27   48:invokevirtual   #191 <Method void PdfPTable.setWidthPercentage(float)>
	//*  28   51:return          
				flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_2        
			pdfptable.setExtendLastRow(flag);
			column.addElement(((Element) (pdfptable)));
			pdfptable.setWidthPercentage(100F);
		}
	//*  31   54:goto            32
	}

	public void setUseAscender(boolean flag)
	{
		column.setUseAscender(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ColumnText column>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #510 <Method void ColumnText.setUseAscender(boolean)>
	//    4    8:return          
	}

	public void setUseBorderPadding(boolean flag)
	{
		useBorderPadding = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean useBorderPadding>
	//    3    5:return          
	}

	public void setUseDescender(boolean flag)
	{
		useDescender = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean useDescender>
	//    3    5:return          
	}

	public void setVerticalAlignment(int i)
	{
		if(table != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field PdfPTable table>
	//*   2    4:ifnull          24
		{
			PdfPTable pdfptable = table;
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field PdfPTable table>
	//    5   11:astore_3        
			boolean flag;
			if(i == 4)
	//*   6   12:iload_1         
	//*   7   13:iconst_4        
	//*   8   14:icmpne          30
				flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
			else
	//*  11   19:aload_3         
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #194 <Method void PdfPTable.setExtendLastRow(boolean)>
	//*  14   24:aload_0         
	//*  15   25:iload_1         
	//*  16   26:putfield        #58  <Field int verticalAlignment>
	//*  17   29:return          
				flag = false;
	//   18   30:iconst_0        
	//   19   31:istore_2        
			pdfptable.setExtendLastRow(flag);
		}
		verticalAlignment = i;
	//*  20   32:goto            19
	}

	protected HashMap accessibleAttributes;
	private float cachedMaxHeight;
	private float calculatedHeight;
	private PdfPCellEvent cellEvent;
	private int colspan;
	private ColumnText column;
	private float fixedHeight;
	protected ArrayList headers;
	protected AccessibleElementId id;
	private Image image;
	private float minimumHeight;
	private boolean noWrap;
	private float paddingBottom;
	private float paddingLeft;
	private float paddingRight;
	private float paddingTop;
	protected Phrase phrase;
	protected PdfName role;
	private int rotation;
	private int rowspan;
	private PdfPTable table;
	private boolean useBorderPadding;
	private boolean useDescender;
	private int verticalAlignment;
}
