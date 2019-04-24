// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.api.Spaceable;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.events.PdfPTableEventForwarder;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPCell, PdfName, PdfPRow, PdfContentByte, 
//			PdfWriter, PdfPTableBody, PdfArtifact, PdfPHeaderCell, 
//			PdfObject, PdfPTableFooter, PdfPTableHeader, PdfString, 
//			PdfPTableEvent

public class PdfPTable
	implements LargeElement, Spaceable, IAccessibleElement
{
	public static class ColumnMeasurementState
	{

		public void beginCell(PdfPCell pdfpcell, float f, float f1)
		{
			rowspan = pdfpcell.getRowspan();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #31  <Method int PdfPCell.getRowspan()>
		//    3    5:putfield        #20  <Field int rowspan>
			colspan = pdfpcell.getColspan();
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #34  <Method int PdfPCell.getColspan()>
		//    7   13:putfield        #22  <Field int colspan>
			float f2;
			if(pdfpcell.hasCachedMaxHeight())
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #38  <Method boolean PdfPCell.hasCachedMaxHeight()>
		//*  10   20:ifeq            42
				f2 = pdfpcell.getCachedMaxHeight();
		//   11   23:aload_1         
		//   12   24:invokevirtual   #42  <Method float PdfPCell.getCachedMaxHeight()>
		//   13   27:fstore          4
			else
		//*  14   29:aload_0         
		//*  15   30:fload           4
		//*  16   32:fload_3         
		//*  17   33:invokestatic    #48  <Method float Math.max(float, float)>
		//*  18   36:fload_2         
		//*  19   37:fadd            
		//*  20   38:putfield        #18  <Field float height>
		//*  21   41:return          
				f2 = pdfpcell.getMaxHeight();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #51  <Method float PdfPCell.getMaxHeight()>
		//   24   46:fstore          4
			height = Math.max(f2, f1) + f;
		//*  25   48:goto            29
		}

		public boolean cellEnds()
		{
			return rowspan == 1;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int rowspan>
		//    2    4:iconst_1        
		//    3    5:icmpne          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void consumeRowspan(float f, float f1)
		{
			rowspan = rowspan - 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field int rowspan>
		//    3    5:iconst_1        
		//    4    6:isub            
		//    5    7:putfield        #20  <Field int rowspan>
		//    6   10:return          
		}

		public int colspan;
		public float height;
		public int rowspan;

		public ColumnMeasurementState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			height = 0.0F;
		//    2    4:aload_0         
		//    3    5:fconst_0        
		//    4    6:putfield        #18  <Field float height>
			rowspan = 1;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #20  <Field int rowspan>
			colspan = 1;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #22  <Field int colspan>
		//   11   19:return          
		}
	}

	public static class FittingRows
	{

		public void correctLastRowChosen(PdfPTable pdfptable, int i)
		{
			pdfptable = ((PdfPTable) (pdfptable.getRow(i)));
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #40  <Method PdfPRow PdfPTable.getRow(int)>
		//    3    5:astore_1        
			Float float1 = (Float)correctedHeightsForLastRow.get(((Object) (Integer.valueOf(i))));
		//    4    6:aload_0         
		//    5    7:getfield        #31  <Field Map correctedHeightsForLastRow>
		//    6   10:iload_2         
		//    7   11:invokestatic    #46  <Method Integer Integer.valueOf(int)>
		//    8   14:invokeinterface #52  <Method Object Map.get(Object)>
		//    9   19:checkcast       #54  <Class Float>
		//   10   22:astore_3        
			if(float1 != null)
		//*  11   23:aload_3         
		//*  12   24:ifnull          35
				((PdfPRow) (pdfptable)).setFinalMaxHeights(float1.floatValue());
		//   13   27:aload_1         
		//   14   28:aload_3         
		//   15   29:invokevirtual   #58  <Method float Float.floatValue()>
		//   16   32:invokevirtual   #64  <Method void PdfPRow.setFinalMaxHeights(float)>
		//   17   35:return          
		}

		public final float completedRowsHeight;
		private final Map correctedHeightsForLastRow;
		public final int firstRow;
		public final float height;
		public final int lastRow;

		public FittingRows(int i, int j, float f, float f1, Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			firstRow = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #23  <Field int firstRow>
			lastRow = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int lastRow>
			height = f;
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:putfield        #27  <Field float height>
			completedRowsHeight = f1;
		//   11   19:aload_0         
		//   12   20:fload           4
		//   13   22:putfield        #29  <Field float completedRowsHeight>
			correctedHeightsForLastRow = map;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #31  <Field Map correctedHeightsForLastRow>
		//   17   31:return          
		}
	}


	protected PdfPTable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPTable);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPTable>
	//    4    7:invokestatic    #101 <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #103 <Field Logger LOGGER>
		rows = new ArrayList();
	//    6   13:aload_0         
	//    7   14:new             #105 <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #106 <Method void ArrayList()>
	//   10   21:putfield        #108 <Field ArrayList rows>
		totalHeight = 0.0F;
	//   11   24:aload_0         
	//   12   25:fconst_0        
	//   13   26:putfield        #110 <Field float totalHeight>
		currentColIdx = 0;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #112 <Field int currentColIdx>
		defaultCell = new PdfPCell((Phrase)null);
	//   17   34:aload_0         
	//   18   35:new             #114 <Class PdfPCell>
	//   19   38:dup             
	//   20   39:aconst_null     
	//   21   40:checkcast       #116 <Class Phrase>
	//   22   43:invokespecial   #119 <Method void PdfPCell(Phrase)>
	//   23   46:putfield        #121 <Field PdfPCell defaultCell>
		totalWidth = 0.0F;
	//   24   49:aload_0         
	//   25   50:fconst_0        
	//   26   51:putfield        #123 <Field float totalWidth>
		widthPercentage = 80F;
	//   27   54:aload_0         
	//   28   55:ldc1            #124 <Float 80F>
	//   29   57:putfield        #126 <Field float widthPercentage>
		horizontalAlignment = 1;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #128 <Field int horizontalAlignment>
		skipFirstHeader = false;
	//   33   65:aload_0         
	//   34   66:iconst_0        
	//   35   67:putfield        #130 <Field boolean skipFirstHeader>
		skipLastFooter = false;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #132 <Field boolean skipLastFooter>
		isColspan = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #134 <Field boolean isColspan>
		runDirection = 1;
	//   42   80:aload_0         
	//   43   81:iconst_1        
	//   44   82:putfield        #136 <Field int runDirection>
		lockedWidth = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #138 <Field boolean lockedWidth>
		splitRows = true;
	//   48   90:aload_0         
	//   49   91:iconst_1        
	//   50   92:putfield        #140 <Field boolean splitRows>
	//   51   95:aload_0         
	//   52   96:iconst_2        
	//   53   97:newarray        boolean[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:ldc1            #23  <Int 0>
	//   57  103:bastore         
	//   58  104:dup             
	//   59  105:iconst_1        
	//   60  106:ldc1            #23  <Int 0>
	//   61  108:bastore         
	//   62  109:putfield        #142 <Field boolean[] extendLastRow>
		splitLate = true;
	//   63  112:aload_0         
	//   64  113:iconst_1        
	//   65  114:putfield        #144 <Field boolean splitLate>
		complete = true;
	//   66  117:aload_0         
	//   67  118:iconst_1        
	//   68  119:putfield        #146 <Field boolean complete>
		rowCompleted = true;
	//   69  122:aload_0         
	//   70  123:iconst_1        
	//   71  124:putfield        #148 <Field boolean rowCompleted>
		loopCheck = true;
	//   72  127:aload_0         
	//   73  128:iconst_1        
	//   74  129:putfield        #150 <Field boolean loopCheck>
		rowsNotChecked = true;
	//   75  132:aload_0         
	//   76  133:iconst_1        
	//   77  134:putfield        #152 <Field boolean rowsNotChecked>
		role = PdfName.TABLE;
	//   78  137:aload_0         
	//   79  138:getstatic       #157 <Field PdfName PdfName.TABLE>
	//   80  141:putfield        #159 <Field PdfName role>
		accessibleAttributes = null;
	//   81  144:aload_0         
	//   82  145:aconst_null     
	//   83  146:putfield        #161 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   84  149:aload_0         
	//   85  150:new             #163 <Class AccessibleElementId>
	//   86  153:dup             
	//   87  154:invokespecial   #164 <Method void AccessibleElementId()>
	//   88  157:putfield        #166 <Field AccessibleElementId id>
		header = null;
	//   89  160:aload_0         
	//   90  161:aconst_null     
	//   91  162:putfield        #168 <Field PdfPTableHeader header>
		body = null;
	//   92  165:aload_0         
	//   93  166:aconst_null     
	//   94  167:putfield        #170 <Field PdfPTableBody body>
		footer = null;
	//   95  170:aload_0         
	//   96  171:aconst_null     
	//   97  172:putfield        #172 <Field PdfPTableFooter footer>
	//   98  175:return          
	}

	public PdfPTable(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPTable);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPTable>
	//    4    7:invokestatic    #101 <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #103 <Field Logger LOGGER>
		rows = new ArrayList();
	//    6   13:aload_0         
	//    7   14:new             #105 <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #106 <Method void ArrayList()>
	//   10   21:putfield        #108 <Field ArrayList rows>
		totalHeight = 0.0F;
	//   11   24:aload_0         
	//   12   25:fconst_0        
	//   13   26:putfield        #110 <Field float totalHeight>
		currentColIdx = 0;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #112 <Field int currentColIdx>
		defaultCell = new PdfPCell((Phrase)null);
	//   17   34:aload_0         
	//   18   35:new             #114 <Class PdfPCell>
	//   19   38:dup             
	//   20   39:aconst_null     
	//   21   40:checkcast       #116 <Class Phrase>
	//   22   43:invokespecial   #119 <Method void PdfPCell(Phrase)>
	//   23   46:putfield        #121 <Field PdfPCell defaultCell>
		totalWidth = 0.0F;
	//   24   49:aload_0         
	//   25   50:fconst_0        
	//   26   51:putfield        #123 <Field float totalWidth>
		widthPercentage = 80F;
	//   27   54:aload_0         
	//   28   55:ldc1            #124 <Float 80F>
	//   29   57:putfield        #126 <Field float widthPercentage>
		horizontalAlignment = 1;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #128 <Field int horizontalAlignment>
		skipFirstHeader = false;
	//   33   65:aload_0         
	//   34   66:iconst_0        
	//   35   67:putfield        #130 <Field boolean skipFirstHeader>
		skipLastFooter = false;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #132 <Field boolean skipLastFooter>
		isColspan = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #134 <Field boolean isColspan>
		runDirection = 1;
	//   42   80:aload_0         
	//   43   81:iconst_1        
	//   44   82:putfield        #136 <Field int runDirection>
		lockedWidth = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #138 <Field boolean lockedWidth>
		splitRows = true;
	//   48   90:aload_0         
	//   49   91:iconst_1        
	//   50   92:putfield        #140 <Field boolean splitRows>
	//   51   95:aload_0         
	//   52   96:iconst_2        
	//   53   97:newarray        boolean[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:ldc1            #23  <Int 0>
	//   57  103:bastore         
	//   58  104:dup             
	//   59  105:iconst_1        
	//   60  106:ldc1            #23  <Int 0>
	//   61  108:bastore         
	//   62  109:putfield        #142 <Field boolean[] extendLastRow>
		splitLate = true;
	//   63  112:aload_0         
	//   64  113:iconst_1        
	//   65  114:putfield        #144 <Field boolean splitLate>
		complete = true;
	//   66  117:aload_0         
	//   67  118:iconst_1        
	//   68  119:putfield        #146 <Field boolean complete>
		rowCompleted = true;
	//   69  122:aload_0         
	//   70  123:iconst_1        
	//   71  124:putfield        #148 <Field boolean rowCompleted>
		loopCheck = true;
	//   72  127:aload_0         
	//   73  128:iconst_1        
	//   74  129:putfield        #150 <Field boolean loopCheck>
		rowsNotChecked = true;
	//   75  132:aload_0         
	//   76  133:iconst_1        
	//   77  134:putfield        #152 <Field boolean rowsNotChecked>
		role = PdfName.TABLE;
	//   78  137:aload_0         
	//   79  138:getstatic       #157 <Field PdfName PdfName.TABLE>
	//   80  141:putfield        #159 <Field PdfName role>
		accessibleAttributes = null;
	//   81  144:aload_0         
	//   82  145:aconst_null     
	//   83  146:putfield        #161 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   84  149:aload_0         
	//   85  150:new             #163 <Class AccessibleElementId>
	//   86  153:dup             
	//   87  154:invokespecial   #164 <Method void AccessibleElementId()>
	//   88  157:putfield        #166 <Field AccessibleElementId id>
		header = null;
	//   89  160:aload_0         
	//   90  161:aconst_null     
	//   91  162:putfield        #168 <Field PdfPTableHeader header>
		body = null;
	//   92  165:aload_0         
	//   93  166:aconst_null     
	//   94  167:putfield        #170 <Field PdfPTableBody body>
		footer = null;
	//   95  170:aload_0         
	//   96  171:aconst_null     
	//   97  172:putfield        #172 <Field PdfPTableFooter footer>
		if(i <= 0)
	//*  98  175:iload_1         
	//*  99  176:ifgt            196
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero", new Object[0]));
	//  100  179:new             #175 <Class IllegalArgumentException>
	//  101  182:dup             
	//  102  183:ldc1            #177 <String "the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero">
	//  103  185:iconst_0        
	//  104  186:anewarray       Object[]
	//  105  189:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  106  192:invokespecial   #186 <Method void IllegalArgumentException(String)>
	//  107  195:athrow          
		relativeWidths = new float[i];
	//  108  196:aload_0         
	//  109  197:iload_1         
	//  110  198:newarray        float[]
	//  111  200:putfield        #188 <Field float[] relativeWidths>
		for(int j = 0; j < i; j++)
	//* 112  203:iconst_0        
	//* 113  204:istore_2        
	//* 114  205:iload_2         
	//* 115  206:iload_1         
	//* 116  207:icmpge          224
			relativeWidths[j] = 1.0F;
	//  117  210:aload_0         
	//  118  211:getfield        #188 <Field float[] relativeWidths>
	//  119  214:iload_2         
	//  120  215:fconst_1        
	//  121  216:fastore         

	//  122  217:iload_2         
	//  123  218:iconst_1        
	//  124  219:iadd            
	//  125  220:istore_2        
	//* 126  221:goto            205
		absoluteWidths = new float[relativeWidths.length];
	//  127  224:aload_0         
	//  128  225:aload_0         
	//  129  226:getfield        #188 <Field float[] relativeWidths>
	//  130  229:arraylength     
	//  131  230:newarray        float[]
	//  132  232:putfield        #190 <Field float[] absoluteWidths>
		calculateWidths();
	//  133  235:aload_0         
	//  134  236:invokevirtual   #193 <Method void calculateWidths()>
		currentRow = new PdfPCell[absoluteWidths.length];
	//  135  239:aload_0         
	//  136  240:aload_0         
	//  137  241:getfield        #190 <Field float[] absoluteWidths>
	//  138  244:arraylength     
	//  139  245:anewarray       PdfPCell[]
	//  140  248:putfield        #195 <Field PdfPCell[] currentRow>
		keepTogether = false;
	//  141  251:aload_0         
	//  142  252:iconst_0        
	//  143  253:putfield        #197 <Field boolean keepTogether>
	//  144  256:return          
	}

	public PdfPTable(PdfPTable pdfptable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPTable);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPTable>
	//    4    7:invokestatic    #101 <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #103 <Field Logger LOGGER>
		rows = new ArrayList();
	//    6   13:aload_0         
	//    7   14:new             #105 <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #106 <Method void ArrayList()>
	//   10   21:putfield        #108 <Field ArrayList rows>
		totalHeight = 0.0F;
	//   11   24:aload_0         
	//   12   25:fconst_0        
	//   13   26:putfield        #110 <Field float totalHeight>
		currentColIdx = 0;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #112 <Field int currentColIdx>
		defaultCell = new PdfPCell((Phrase)null);
	//   17   34:aload_0         
	//   18   35:new             #114 <Class PdfPCell>
	//   19   38:dup             
	//   20   39:aconst_null     
	//   21   40:checkcast       #116 <Class Phrase>
	//   22   43:invokespecial   #119 <Method void PdfPCell(Phrase)>
	//   23   46:putfield        #121 <Field PdfPCell defaultCell>
		totalWidth = 0.0F;
	//   24   49:aload_0         
	//   25   50:fconst_0        
	//   26   51:putfield        #123 <Field float totalWidth>
		widthPercentage = 80F;
	//   27   54:aload_0         
	//   28   55:ldc1            #124 <Float 80F>
	//   29   57:putfield        #126 <Field float widthPercentage>
		horizontalAlignment = 1;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #128 <Field int horizontalAlignment>
		skipFirstHeader = false;
	//   33   65:aload_0         
	//   34   66:iconst_0        
	//   35   67:putfield        #130 <Field boolean skipFirstHeader>
		skipLastFooter = false;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #132 <Field boolean skipLastFooter>
		isColspan = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #134 <Field boolean isColspan>
		runDirection = 1;
	//   42   80:aload_0         
	//   43   81:iconst_1        
	//   44   82:putfield        #136 <Field int runDirection>
		lockedWidth = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #138 <Field boolean lockedWidth>
		splitRows = true;
	//   48   90:aload_0         
	//   49   91:iconst_1        
	//   50   92:putfield        #140 <Field boolean splitRows>
	//   51   95:aload_0         
	//   52   96:iconst_2        
	//   53   97:newarray        boolean[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:ldc1            #23  <Int 0>
	//   57  103:bastore         
	//   58  104:dup             
	//   59  105:iconst_1        
	//   60  106:ldc1            #23  <Int 0>
	//   61  108:bastore         
	//   62  109:putfield        #142 <Field boolean[] extendLastRow>
		splitLate = true;
	//   63  112:aload_0         
	//   64  113:iconst_1        
	//   65  114:putfield        #144 <Field boolean splitLate>
		complete = true;
	//   66  117:aload_0         
	//   67  118:iconst_1        
	//   68  119:putfield        #146 <Field boolean complete>
		rowCompleted = true;
	//   69  122:aload_0         
	//   70  123:iconst_1        
	//   71  124:putfield        #148 <Field boolean rowCompleted>
		loopCheck = true;
	//   72  127:aload_0         
	//   73  128:iconst_1        
	//   74  129:putfield        #150 <Field boolean loopCheck>
		rowsNotChecked = true;
	//   75  132:aload_0         
	//   76  133:iconst_1        
	//   77  134:putfield        #152 <Field boolean rowsNotChecked>
		role = PdfName.TABLE;
	//   78  137:aload_0         
	//   79  138:getstatic       #157 <Field PdfName PdfName.TABLE>
	//   80  141:putfield        #159 <Field PdfName role>
		accessibleAttributes = null;
	//   81  144:aload_0         
	//   82  145:aconst_null     
	//   83  146:putfield        #161 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   84  149:aload_0         
	//   85  150:new             #163 <Class AccessibleElementId>
	//   86  153:dup             
	//   87  154:invokespecial   #164 <Method void AccessibleElementId()>
	//   88  157:putfield        #166 <Field AccessibleElementId id>
		header = null;
	//   89  160:aload_0         
	//   90  161:aconst_null     
	//   91  162:putfield        #168 <Field PdfPTableHeader header>
		body = null;
	//   92  165:aload_0         
	//   93  166:aconst_null     
	//   94  167:putfield        #170 <Field PdfPTableBody body>
		footer = null;
	//   95  170:aload_0         
	//   96  171:aconst_null     
	//   97  172:putfield        #172 <Field PdfPTableFooter footer>
		copyFormat(pdfptable);
	//   98  175:aload_0         
	//   99  176:aload_1         
	//  100  177:invokevirtual   #201 <Method void copyFormat(PdfPTable)>
		int i = 0;
	//  101  180:iconst_0        
	//  102  181:istore_2        
		do
		{
			if(i >= currentRow.length || pdfptable.currentRow[i] == null)
	//* 103  182:iload_2         
	//* 104  183:aload_0         
	//* 105  184:getfield        #195 <Field PdfPCell[] currentRow>
	//* 106  187:arraylength     
	//* 107  188:icmpge          200
	//* 108  191:aload_1         
	//* 109  192:getfield        #195 <Field PdfPCell[] currentRow>
	//* 110  195:iload_2         
	//* 111  196:aaload          
	//* 112  197:ifnonnull       260
			{
				for(i = 0; i < pdfptable.rows.size(); i++)
	//* 113  200:iconst_0        
	//* 114  201:istore_2        
	//* 115  202:iload_2         
	//* 116  203:aload_1         
	//* 117  204:getfield        #108 <Field ArrayList rows>
	//* 118  207:invokevirtual   #205 <Method int ArrayList.size()>
	//* 119  210:icmpge          286
				{
					PdfPRow pdfprow1 = (PdfPRow)pdfptable.rows.get(i);
	//  120  213:aload_1         
	//  121  214:getfield        #108 <Field ArrayList rows>
	//  122  217:iload_2         
	//  123  218:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//  124  221:checkcast       #211 <Class PdfPRow>
	//  125  224:astore          4
					PdfPRow pdfprow = pdfprow1;
	//  126  226:aload           4
	//  127  228:astore_3        
					if(pdfprow1 != null)
	//* 128  229:aload           4
	//* 129  231:ifnull          244
						pdfprow = new PdfPRow(pdfprow1);
	//  130  234:new             #211 <Class PdfPRow>
	//  131  237:dup             
	//  132  238:aload           4
	//  133  240:invokespecial   #214 <Method void PdfPRow(PdfPRow)>
	//  134  243:astore_3        
					rows.add(((Object) (pdfprow)));
	//  135  244:aload_0         
	//  136  245:getfield        #108 <Field ArrayList rows>
	//  137  248:aload_3         
	//  138  249:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  139  252:pop             
				}

	//  140  253:iload_2         
	//  141  254:iconst_1        
	//  142  255:iadd            
	//  143  256:istore_2        
				break;
	//  144  257:goto            202
			}
			currentRow[i] = new PdfPCell(pdfptable.currentRow[i]);
	//  145  260:aload_0         
	//  146  261:getfield        #195 <Field PdfPCell[] currentRow>
	//  147  264:iload_2         
	//  148  265:new             #114 <Class PdfPCell>
	//  149  268:dup             
	//  150  269:aload_1         
	//  151  270:getfield        #195 <Field PdfPCell[] currentRow>
	//  152  273:iload_2         
	//  153  274:aaload          
	//  154  275:invokespecial   #221 <Method void PdfPCell(PdfPCell)>
	//  155  278:aastore         
			i++;
	//  156  279:iload_2         
	//  157  280:iconst_1        
	//  158  281:iadd            
	//  159  282:istore_2        
		} while(true);
	//  160  283:goto            182
	//  161  286:return          
	}

	public PdfPTable(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfPTable);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PdfPTable>
	//    4    7:invokestatic    #101 <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #103 <Field Logger LOGGER>
		rows = new ArrayList();
	//    6   13:aload_0         
	//    7   14:new             #105 <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #106 <Method void ArrayList()>
	//   10   21:putfield        #108 <Field ArrayList rows>
		totalHeight = 0.0F;
	//   11   24:aload_0         
	//   12   25:fconst_0        
	//   13   26:putfield        #110 <Field float totalHeight>
		currentColIdx = 0;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #112 <Field int currentColIdx>
		defaultCell = new PdfPCell((Phrase)null);
	//   17   34:aload_0         
	//   18   35:new             #114 <Class PdfPCell>
	//   19   38:dup             
	//   20   39:aconst_null     
	//   21   40:checkcast       #116 <Class Phrase>
	//   22   43:invokespecial   #119 <Method void PdfPCell(Phrase)>
	//   23   46:putfield        #121 <Field PdfPCell defaultCell>
		totalWidth = 0.0F;
	//   24   49:aload_0         
	//   25   50:fconst_0        
	//   26   51:putfield        #123 <Field float totalWidth>
		widthPercentage = 80F;
	//   27   54:aload_0         
	//   28   55:ldc1            #124 <Float 80F>
	//   29   57:putfield        #126 <Field float widthPercentage>
		horizontalAlignment = 1;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #128 <Field int horizontalAlignment>
		skipFirstHeader = false;
	//   33   65:aload_0         
	//   34   66:iconst_0        
	//   35   67:putfield        #130 <Field boolean skipFirstHeader>
		skipLastFooter = false;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #132 <Field boolean skipLastFooter>
		isColspan = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #134 <Field boolean isColspan>
		runDirection = 1;
	//   42   80:aload_0         
	//   43   81:iconst_1        
	//   44   82:putfield        #136 <Field int runDirection>
		lockedWidth = false;
	//   45   85:aload_0         
	//   46   86:iconst_0        
	//   47   87:putfield        #138 <Field boolean lockedWidth>
		splitRows = true;
	//   48   90:aload_0         
	//   49   91:iconst_1        
	//   50   92:putfield        #140 <Field boolean splitRows>
	//   51   95:aload_0         
	//   52   96:iconst_2        
	//   53   97:newarray        boolean[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:ldc1            #23  <Int 0>
	//   57  103:bastore         
	//   58  104:dup             
	//   59  105:iconst_1        
	//   60  106:ldc1            #23  <Int 0>
	//   61  108:bastore         
	//   62  109:putfield        #142 <Field boolean[] extendLastRow>
		splitLate = true;
	//   63  112:aload_0         
	//   64  113:iconst_1        
	//   65  114:putfield        #144 <Field boolean splitLate>
		complete = true;
	//   66  117:aload_0         
	//   67  118:iconst_1        
	//   68  119:putfield        #146 <Field boolean complete>
		rowCompleted = true;
	//   69  122:aload_0         
	//   70  123:iconst_1        
	//   71  124:putfield        #148 <Field boolean rowCompleted>
		loopCheck = true;
	//   72  127:aload_0         
	//   73  128:iconst_1        
	//   74  129:putfield        #150 <Field boolean loopCheck>
		rowsNotChecked = true;
	//   75  132:aload_0         
	//   76  133:iconst_1        
	//   77  134:putfield        #152 <Field boolean rowsNotChecked>
		role = PdfName.TABLE;
	//   78  137:aload_0         
	//   79  138:getstatic       #157 <Field PdfName PdfName.TABLE>
	//   80  141:putfield        #159 <Field PdfName role>
		accessibleAttributes = null;
	//   81  144:aload_0         
	//   82  145:aconst_null     
	//   83  146:putfield        #161 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   84  149:aload_0         
	//   85  150:new             #163 <Class AccessibleElementId>
	//   86  153:dup             
	//   87  154:invokespecial   #164 <Method void AccessibleElementId()>
	//   88  157:putfield        #166 <Field AccessibleElementId id>
		header = null;
	//   89  160:aload_0         
	//   90  161:aconst_null     
	//   91  162:putfield        #168 <Field PdfPTableHeader header>
		body = null;
	//   92  165:aload_0         
	//   93  166:aconst_null     
	//   94  167:putfield        #170 <Field PdfPTableBody body>
		footer = null;
	//   95  170:aload_0         
	//   96  171:aconst_null     
	//   97  172:putfield        #172 <Field PdfPTableFooter footer>
		if(af == null)
	//*  98  175:aload_1         
	//*  99  176:ifnonnull       196
			throw new NullPointerException(MessageLocalization.getComposedMessage("the.widths.array.in.pdfptable.constructor.can.not.be.null", new Object[0]));
	//  100  179:new             #224 <Class NullPointerException>
	//  101  182:dup             
	//  102  183:ldc1            #226 <String "the.widths.array.in.pdfptable.constructor.can.not.be.null">
	//  103  185:iconst_0        
	//  104  186:anewarray       Object[]
	//  105  189:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  106  192:invokespecial   #227 <Method void NullPointerException(String)>
	//  107  195:athrow          
		if(af.length == 0)
	//* 108  196:aload_1         
	//* 109  197:arraylength     
	//* 110  198:ifne            218
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.widths.array.in.pdfptable.constructor.can.not.have.zero.length", new Object[0]));
	//  111  201:new             #175 <Class IllegalArgumentException>
	//  112  204:dup             
	//  113  205:ldc1            #229 <String "the.widths.array.in.pdfptable.constructor.can.not.have.zero.length">
	//  114  207:iconst_0        
	//  115  208:anewarray       Object[]
	//  116  211:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  117  214:invokespecial   #186 <Method void IllegalArgumentException(String)>
	//  118  217:athrow          
		} else
		{
			relativeWidths = new float[af.length];
	//  119  218:aload_0         
	//  120  219:aload_1         
	//  121  220:arraylength     
	//  122  221:newarray        float[]
	//  123  223:putfield        #188 <Field float[] relativeWidths>
			System.arraycopy(((Object) (af)), 0, ((Object) (relativeWidths)), 0, af.length);
	//  124  226:aload_1         
	//  125  227:iconst_0        
	//  126  228:aload_0         
	//  127  229:getfield        #188 <Field float[] relativeWidths>
	//  128  232:iconst_0        
	//  129  233:aload_1         
	//  130  234:arraylength     
	//  131  235:invokestatic    #235 <Method void System.arraycopy(Object, int, Object, int, int)>
			absoluteWidths = new float[af.length];
	//  132  238:aload_0         
	//  133  239:aload_1         
	//  134  240:arraylength     
	//  135  241:newarray        float[]
	//  136  243:putfield        #190 <Field float[] absoluteWidths>
			calculateWidths();
	//  137  246:aload_0         
	//  138  247:invokevirtual   #193 <Method void calculateWidths()>
			currentRow = new PdfPCell[absoluteWidths.length];
	//  139  250:aload_0         
	//  140  251:aload_0         
	//  141  252:getfield        #190 <Field float[] absoluteWidths>
	//  142  255:arraylength     
	//  143  256:anewarray       PdfPCell[]
	//  144  259:putfield        #195 <Field PdfPCell[] currentRow>
			keepTogether = false;
	//  145  262:aload_0         
	//  146  263:iconst_0        
	//  147  264:putfield        #197 <Field boolean keepTogether>
			return;
	//  148  267:return          
		}
	}

	public static PdfContentByte[] beginWritingRows(PdfContentByte pdfcontentbyte)
	{
		return (new PdfContentByte[] {
			pdfcontentbyte, pdfcontentbyte.getDuplicate(), pdfcontentbyte.getDuplicate(), pdfcontentbyte.getDuplicate()
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       PdfContentByte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_0         
	//    9   11:invokevirtual   #243 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//   10   14:aastore         
	//   11   15:dup             
	//   12   16:iconst_2        
	//   13   17:aload_0         
	//   14   18:invokevirtual   #243 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//   15   21:aastore         
	//   16   22:dup             
	//   17   23:iconst_3        
	//   18   24:aload_0         
	//   19   25:invokevirtual   #243 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//   20   28:aastore         
	//   21   29:areturn         
	}

	private PdfPTableBody closeTableBlock(PdfPTableBody pdfptablebody, PdfContentByte pdfcontentbyte)
	{
		if(pdfcontentbyte.writer.getStandardStructElems().contains(((Object) (pdfptablebody.getRole()))))
	//*   0    0:aload_2         
	//*   1    1:getfield        #249 <Field PdfWriter PdfContentByte.writer>
	//*   2    4:invokevirtual   #255 <Method List PdfWriter.getStandardStructElems()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #261 <Method PdfName PdfPTableBody.getRole()>
	//*   5   11:invokeinterface #266 <Method boolean List.contains(Object)>
	//*   6   16:ifeq            24
			pdfcontentbyte.closeMCBlock(((IAccessibleElement) (pdfptablebody)));
	//    7   19:aload_2         
	//    8   20:aload_1         
	//    9   21:invokevirtual   #270 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
	}

	public static void endWritingRows(PdfContentByte apdfcontentbyte[])
	{
		PdfContentByte pdfcontentbyte = apdfcontentbyte[0];
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_1        
		PdfArtifact pdfartifact = new PdfArtifact();
	//    4    4:new             #274 <Class PdfArtifact>
	//    5    7:dup             
	//    6    8:invokespecial   #275 <Method void PdfArtifact()>
	//    7   11:astore_2        
		pdfcontentbyte.openMCBlock(((IAccessibleElement) (pdfartifact)));
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #278 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
		pdfcontentbyte.saveState();
	//   11   17:aload_1         
	//   12   18:invokevirtual   #281 <Method void PdfContentByte.saveState()>
		pdfcontentbyte.add(apdfcontentbyte[1]);
	//   13   21:aload_1         
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:aaload          
	//   17   25:invokevirtual   #284 <Method void PdfContentByte.add(PdfContentByte)>
		pdfcontentbyte.restoreState();
	//   18   28:aload_1         
	//   19   29:invokevirtual   #287 <Method void PdfContentByte.restoreState()>
		pdfcontentbyte.saveState();
	//   20   32:aload_1         
	//   21   33:invokevirtual   #281 <Method void PdfContentByte.saveState()>
		pdfcontentbyte.setLineCap(2);
	//   22   36:aload_1         
	//   23   37:iconst_2        
	//   24   38:invokevirtual   #290 <Method void PdfContentByte.setLineCap(int)>
		pdfcontentbyte.resetRGBColorStroke();
	//   25   41:aload_1         
	//   26   42:invokevirtual   #293 <Method void PdfContentByte.resetRGBColorStroke()>
		pdfcontentbyte.add(apdfcontentbyte[2]);
	//   27   45:aload_1         
	//   28   46:aload_0         
	//   29   47:iconst_2        
	//   30   48:aaload          
	//   31   49:invokevirtual   #284 <Method void PdfContentByte.add(PdfContentByte)>
		pdfcontentbyte.restoreState();
	//   32   52:aload_1         
	//   33   53:invokevirtual   #287 <Method void PdfContentByte.restoreState()>
		pdfcontentbyte.closeMCBlock(((IAccessibleElement) (pdfartifact)));
	//   34   56:aload_1         
	//   35   57:aload_2         
	//   36   58:invokevirtual   #270 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		pdfcontentbyte.add(apdfcontentbyte[3]);
	//   37   61:aload_1         
	//   38   62:aload_0         
	//   39   63:iconst_3        
	//   40   64:aaload          
	//   41   65:invokevirtual   #284 <Method void PdfContentByte.add(PdfContentByte)>
	//   42   68:return          
	}

	private PdfPTableBody openTableBlock(PdfPTableBody pdfptablebody, PdfContentByte pdfcontentbyte)
	{
		if(pdfcontentbyte.writer.getStandardStructElems().contains(((Object) (pdfptablebody.getRole()))))
	//*   0    0:aload_2         
	//*   1    1:getfield        #249 <Field PdfWriter PdfContentByte.writer>
	//*   2    4:invokevirtual   #255 <Method List PdfWriter.getStandardStructElems()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #261 <Method PdfName PdfPTableBody.getRole()>
	//*   5   11:invokeinterface #266 <Method boolean List.contains(Object)>
	//*   6   16:ifeq            26
		{
			pdfcontentbyte.openMCBlock(((IAccessibleElement) (pdfptablebody)));
	//    7   19:aload_2         
	//    8   20:aload_1         
	//    9   21:invokevirtual   #278 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
			return pdfptablebody;
	//   10   24:aload_1         
	//   11   25:areturn         
		} else
		{
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		}
	}

	public static PdfPTable shallowCopy(PdfPTable pdfptable)
	{
		PdfPTable pdfptable1 = new PdfPTable();
	//    0    0:new             #2   <Class PdfPTable>
	//    1    3:dup             
	//    2    4:invokespecial   #297 <Method void PdfPTable()>
	//    3    7:astore_1        
		pdfptable1.copyFormat(pdfptable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #201 <Method void copyFormat(PdfPTable)>
		return pdfptable1;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private void skipColsWithRowspanAbove()
	{
		byte byte0 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(runDirection == 3)
	//*   2    2:aload_0         
	//*   3    3:getfield        #136 <Field int runDirection>
	//*   4    6:iconst_3        
	//*   5    7:icmpne          12
			byte0 = -1;
	//    6   10:iconst_m1       
	//    7   11:istore_1        
		for(; rowSpanAbove(rows.size(), currentColIdx); currentColIdx = currentColIdx + byte0);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #108 <Field ArrayList rows>
	//   11   17:invokevirtual   #205 <Method int ArrayList.size()>
	//   12   20:aload_0         
	//   13   21:getfield        #112 <Field int currentColIdx>
	//   14   24:invokevirtual   #302 <Method boolean rowSpanAbove(int, int)>
	//   15   27:ifeq            43
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #112 <Field int currentColIdx>
	//   19   35:iload_1         
	//   20   36:iadd            
	//   21   37:putfield        #112 <Field int currentColIdx>
	//*  22   40:goto            12
	//   23   43:return          
	}

	public PdfPCell addCell(PdfPCell pdfpcell)
	{
		rowCompleted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #148 <Field boolean rowCompleted>
		boolean flag;
		int k;
		if(pdfpcell instanceof PdfPHeaderCell)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #306 <Class PdfPHeaderCell>
	//*   5    9:ifeq            217
			pdfpcell = ((PdfPCell) (new PdfPHeaderCell((PdfPHeaderCell)pdfpcell)));
	//    6   12:new             #306 <Class PdfPHeaderCell>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:checkcast       #306 <Class PdfPHeaderCell>
	//   10   20:invokespecial   #309 <Method void PdfPHeaderCell(PdfPHeaderCell)>
	//   11   23:astore_1        
		else
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #312 <Method int PdfPCell.getColspan()>
	//*  14   28:iconst_1        
	//*  15   29:invokestatic    #318 <Method int Math.max(int, int)>
	//*  16   32:aload_0         
	//*  17   33:getfield        #195 <Field PdfPCell[] currentRow>
	//*  18   36:arraylength     
	//*  19   37:aload_0         
	//*  20   38:getfield        #112 <Field int currentColIdx>
	//*  21   41:isub            
	//*  22   42:invokestatic    #321 <Method int Math.min(int, int)>
	//*  23   45:istore          5
	//*  24   47:aload_1         
	//*  25   48:iload           5
	//*  26   50:invokevirtual   #324 <Method void PdfPCell.setColspan(int)>
	//*  27   53:iload           5
	//*  28   55:iconst_1        
	//*  29   56:icmpeq          64
	//*  30   59:aload_0         
	//*  31   60:iconst_1        
	//*  32   61:putfield        #134 <Field boolean isColspan>
	//*  33   64:aload_1         
	//*  34   65:invokevirtual   #327 <Method int PdfPCell.getRunDirection()>
	//*  35   68:iconst_1        
	//*  36   69:icmpne          80
	//*  37   72:aload_1         
	//*  38   73:aload_0         
	//*  39   74:getfield        #136 <Field int runDirection>
	//*  40   77:invokevirtual   #330 <Method void PdfPCell.setRunDirection(int)>
	//*  41   80:aload_0         
	//*  42   81:invokespecial   #332 <Method void skipColsWithRowspanAbove()>
	//*  43   84:iconst_0        
	//*  44   85:istore_2        
	//*  45   86:aload_0         
	//*  46   87:getfield        #112 <Field int currentColIdx>
	//*  47   90:aload_0         
	//*  48   91:getfield        #195 <Field PdfPCell[] currentRow>
	//*  49   94:arraylength     
	//*  50   95:icmpge          121
	//*  51   98:aload_0         
	//*  52   99:getfield        #195 <Field PdfPCell[] currentRow>
	//*  53  102:aload_0         
	//*  54  103:getfield        #112 <Field int currentColIdx>
	//*  55  106:aload_1         
	//*  56  107:aastore         
	//*  57  108:aload_0         
	//*  58  109:aload_0         
	//*  59  110:getfield        #112 <Field int currentColIdx>
	//*  60  113:iload           5
	//*  61  115:iadd            
	//*  62  116:putfield        #112 <Field int currentColIdx>
	//*  63  119:iconst_1        
	//*  64  120:istore_2        
	//*  65  121:aload_0         
	//*  66  122:invokespecial   #332 <Method void skipColsWithRowspanAbove()>
	//*  67  125:aload_0         
	//*  68  126:getfield        #112 <Field int currentColIdx>
	//*  69  129:aload_0         
	//*  70  130:getfield        #195 <Field PdfPCell[] currentRow>
	//*  71  133:arraylength     
	//*  72  134:icmplt          317
	//*  73  137:aload_0         
	//*  74  138:invokevirtual   #335 <Method int getNumberOfColumns()>
	//*  75  141:istore          6
	//*  76  143:aload_0         
	//*  77  144:getfield        #136 <Field int runDirection>
	//*  78  147:iconst_3        
	//*  79  148:icmpne          235
	//*  80  151:iload           6
	//*  81  153:anewarray       PdfPCell[]
	//*  82  156:astore          8
	//*  83  158:aload_0         
	//*  84  159:getfield        #195 <Field PdfPCell[] currentRow>
	//*  85  162:arraylength     
	//*  86  163:istore          4
	//*  87  165:iconst_0        
	//*  88  166:istore_3        
	//*  89  167:iload_3         
	//*  90  168:aload_0         
	//*  91  169:getfield        #195 <Field PdfPCell[] currentRow>
	//*  92  172:arraylength     
	//*  93  173:icmpge          229
	//*  94  176:aload_0         
	//*  95  177:getfield        #195 <Field PdfPCell[] currentRow>
	//*  96  180:iload_3         
	//*  97  181:aaload          
	//*  98  182:astore          9
	//*  99  184:aload           9
	//* 100  186:invokevirtual   #312 <Method int PdfPCell.getColspan()>
	//* 101  189:istore          7
	//* 102  191:iload           4
	//* 103  193:iload           7
	//* 104  195:isub            
	//* 105  196:istore          4
	//* 106  198:aload           8
	//* 107  200:iload           4
	//* 108  202:aload           9
	//* 109  204:aastore         
	//* 110  205:iload_3         
	//* 111  206:iload           7
	//* 112  208:iconst_1        
	//* 113  209:isub            
	//* 114  210:iadd            
	//* 115  211:iconst_1        
	//* 116  212:iadd            
	//* 117  213:istore_3        
	//* 118  214:goto            167
			pdfpcell = new PdfPCell(pdfpcell);
	//  119  217:new             #114 <Class PdfPCell>
	//  120  220:dup             
	//  121  221:aload_1         
	//  122  222:invokespecial   #221 <Method void PdfPCell(PdfPCell)>
	//  123  225:astore_1        
		k = Math.min(Math.max(pdfpcell.getColspan(), 1), currentRow.length - currentColIdx);
		pdfpcell.setColspan(k);
		if(k != 1)
			isColspan = true;
		if(pdfpcell.getRunDirection() == 1)
			pdfpcell.setRunDirection(runDirection);
		skipColsWithRowspanAbove();
		flag = false;
		if(currentColIdx < currentRow.length)
		{
			currentRow[currentColIdx] = pdfpcell;
			currentColIdx = currentColIdx + k;
			flag = true;
		}
		skipColsWithRowspanAbove();
		while(currentColIdx >= currentRow.length) 
		{
			int l = getNumberOfColumns();
			if(runDirection == 3)
			{
				PdfPCell apdfpcell[] = new PdfPCell[l];
				int j = currentRow.length;
				int i1;
				for(int i = 0; i < currentRow.length; i = i + (i1 - 1) + 1)
				{
					PdfPCell pdfpcell1 = currentRow[i];
					i1 = pdfpcell1.getColspan();
					j -= i1;
					apdfpcell[j] = pdfpcell1;
				}

	//* 124  226:goto            24
				currentRow = apdfpcell;
	//  125  229:aload_0         
	//  126  230:aload           8
	//  127  232:putfield        #195 <Field PdfPCell[] currentRow>
			}
			PdfPRow pdfprow = new PdfPRow(currentRow);
	//  128  235:new             #211 <Class PdfPRow>
	//  129  238:dup             
	//  130  239:aload_0         
	//  131  240:getfield        #195 <Field PdfPCell[] currentRow>
	//  132  243:invokespecial   #338 <Method void PdfPRow(PdfPCell[])>
	//  133  246:astore          8
			if(totalWidth > 0.0F)
	//* 134  248:aload_0         
	//* 135  249:getfield        #123 <Field float totalWidth>
	//* 136  252:fconst_0        
	//* 137  253:fcmpl           
	//* 138  254:ifle            281
			{
				pdfprow.setWidths(absoluteWidths);
	//  139  257:aload           8
	//  140  259:aload_0         
	//  141  260:getfield        #190 <Field float[] absoluteWidths>
	//  142  263:invokevirtual   #342 <Method boolean PdfPRow.setWidths(float[])>
	//  143  266:pop             
				totalHeight = totalHeight + pdfprow.getMaxHeights();
	//  144  267:aload_0         
	//  145  268:aload_0         
	//  146  269:getfield        #110 <Field float totalHeight>
	//  147  272:aload           8
	//  148  274:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//  149  277:fadd            
	//  150  278:putfield        #110 <Field float totalHeight>
			}
			rows.add(((Object) (pdfprow)));
	//  151  281:aload_0         
	//  152  282:getfield        #108 <Field ArrayList rows>
	//  153  285:aload           8
	//  154  287:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//  155  290:pop             
			currentRow = new PdfPCell[l];
	//  156  291:aload_0         
	//  157  292:iload           6
	//  158  294:anewarray       PdfPCell[]
	//  159  297:putfield        #195 <Field PdfPCell[] currentRow>
			currentColIdx = 0;
	//  160  300:aload_0         
	//  161  301:iconst_0        
	//  162  302:putfield        #112 <Field int currentColIdx>
			skipColsWithRowspanAbove();
	//  163  305:aload_0         
	//  164  306:invokespecial   #332 <Method void skipColsWithRowspanAbove()>
			rowCompleted = true;
	//  165  309:aload_0         
	//  166  310:iconst_1        
	//  167  311:putfield        #148 <Field boolean rowCompleted>
		}
	//* 168  314:goto            125
		if(!flag)
	//* 169  317:iload_2         
	//* 170  318:ifne            342
		{
			currentRow[currentColIdx] = pdfpcell;
	//  171  321:aload_0         
	//  172  322:getfield        #195 <Field PdfPCell[] currentRow>
	//  173  325:aload_0         
	//  174  326:getfield        #112 <Field int currentColIdx>
	//  175  329:aload_1         
	//  176  330:aastore         
			currentColIdx = currentColIdx + k;
	//  177  331:aload_0         
	//  178  332:aload_0         
	//  179  333:getfield        #112 <Field int currentColIdx>
	//  180  336:iload           5
	//  181  338:iadd            
	//  182  339:putfield        #112 <Field int currentColIdx>
		}
		return pdfpcell;
	//  183  342:aload_1         
	//  184  343:areturn         
	}

	public void addCell(Image image)
	{
		defaultCell.setImage(image);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field PdfPCell defaultCell>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #350 <Method void PdfPCell.setImage(Image)>
		addCell(defaultCell).id = new AccessibleElementId();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field PdfPCell defaultCell>
	//    7   13:invokevirtual   #352 <Method PdfPCell addCell(PdfPCell)>
	//    8   16:new             #163 <Class AccessibleElementId>
	//    9   19:dup             
	//   10   20:invokespecial   #164 <Method void AccessibleElementId()>
	//   11   23:putfield        #353 <Field AccessibleElementId PdfPCell.id>
		defaultCell.setImage(((Image) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #121 <Field PdfPCell defaultCell>
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #350 <Method void PdfPCell.setImage(Image)>
	//   16   34:return          
	}

	public void addCell(Phrase phrase)
	{
		defaultCell.setPhrase(phrase);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field PdfPCell defaultCell>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #356 <Method void PdfPCell.setPhrase(Phrase)>
		addCell(defaultCell).id = new AccessibleElementId();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field PdfPCell defaultCell>
	//    7   13:invokevirtual   #352 <Method PdfPCell addCell(PdfPCell)>
	//    8   16:new             #163 <Class AccessibleElementId>
	//    9   19:dup             
	//   10   20:invokespecial   #164 <Method void AccessibleElementId()>
	//   11   23:putfield        #353 <Field AccessibleElementId PdfPCell.id>
		defaultCell.setPhrase(((Phrase) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #121 <Field PdfPCell defaultCell>
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #356 <Method void PdfPCell.setPhrase(Phrase)>
	//   16   34:return          
	}

	public void addCell(PdfPTable pdfptable)
	{
		defaultCell.setTable(pdfptable);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field PdfPCell defaultCell>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #359 <Method void PdfPCell.setTable(PdfPTable)>
		addCell(defaultCell).id = new AccessibleElementId();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field PdfPCell defaultCell>
	//    7   13:invokevirtual   #352 <Method PdfPCell addCell(PdfPCell)>
	//    8   16:new             #163 <Class AccessibleElementId>
	//    9   19:dup             
	//   10   20:invokespecial   #164 <Method void AccessibleElementId()>
	//   11   23:putfield        #353 <Field AccessibleElementId PdfPCell.id>
		defaultCell.setTable(((PdfPTable) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #121 <Field PdfPCell defaultCell>
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #359 <Method void PdfPCell.setTable(PdfPTable)>
	//   16   34:return          
	}

	public void addCell(String s)
	{
		addCell(new Phrase(s));
	//    0    0:aload_0         
	//    1    1:new             #116 <Class Phrase>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #360 <Method void Phrase(String)>
	//    5    9:invokevirtual   #362 <Method void addCell(Phrase)>
	//    6   12:return          
	}

	void addNumberOfRowsWritten(int i)
	{
		numberOfWrittenRows = numberOfWrittenRows + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #365 <Field int numberOfWrittenRows>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #365 <Field int numberOfWrittenRows>
	//    6   10:return          
	}

	protected PdfPRow adjustCellsInRow(int i, int j)
	{
		PdfPRow pdfprow = getRow(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//    3    5:astore          7
		if(pdfprow.isAdjusted())
	//*   4    7:aload           7
	//*   5    9:invokevirtual   #374 <Method boolean PdfPRow.isAdjusted()>
	//*   6   12:ifeq            18
			return pdfprow;
	//    7   15:aload           7
	//    8   17:areturn         
		pdfprow = new PdfPRow(pdfprow);
	//    9   18:new             #211 <Class PdfPRow>
	//   10   21:dup             
	//   11   22:aload           7
	//   12   24:invokespecial   #214 <Method void PdfPRow(PdfPRow)>
	//   13   27:astore          7
		PdfPCell apdfpcell[] = pdfprow.getCells();
	//   14   29:aload           7
	//   15   31:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   16   34:astore          8
		int k = 0;
	//   17   36:iconst_0        
	//   18   37:istore          4
		while(k < apdfpcell.length) 
	//*  19   39:iload           4
	//*  20   41:aload           8
	//*  21   43:arraylength     
	//*  22   44:icmpge          136
		{
			PdfPCell pdfpcell = apdfpcell[k];
	//   23   47:aload           8
	//   24   49:iload           4
	//   25   51:aaload          
	//   26   52:astore          9
			if(pdfpcell != null && pdfpcell.getRowspan() != 1)
	//*  27   54:aload           9
	//*  28   56:ifnull          68
	//*  29   59:aload           9
	//*  30   61:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//*  31   64:iconst_1        
	//*  32   65:icmpne          77
	//*  33   68:iload           4
	//*  34   70:iconst_1        
	//*  35   71:iadd            
	//*  36   72:istore          4
	//*  37   74:goto            39
			{
				int i1 = Math.min(j, pdfpcell.getRowspan() + i);
	//   38   77:iload_2         
	//   39   78:aload           9
	//   40   80:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//   41   83:iload_1         
	//   42   84:iadd            
	//   43   85:invokestatic    #321 <Method int Math.min(int, int)>
	//   44   88:istore          6
				float f = 0.0F;
	//   45   90:fconst_0        
	//   46   91:fstore_3        
				for(int l = i + 1; l < i1; l++)
	//*  47   92:iload_1         
	//*  48   93:iconst_1        
	//*  49   94:iadd            
	//*  50   95:istore          5
	//*  51   97:iload           5
	//*  52   99:iload           6
	//*  53  101:icmpge          125
					f += getRow(l).getMaxHeights();
	//   54  104:fload_3         
	//   55  105:aload_0         
	//   56  106:iload           5
	//   57  108:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//   58  111:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//   59  114:fadd            
	//   60  115:fstore_3        

	//   61  116:iload           5
	//   62  118:iconst_1        
	//   63  119:iadd            
	//   64  120:istore          5
	//*  65  122:goto            97
				pdfprow.setExtraHeight(k, f);
	//   66  125:aload           7
	//   67  127:iload           4
	//   68  129:fload_3         
	//   69  130:invokevirtual   #385 <Method void PdfPRow.setExtraHeight(int, float)>
			}
			k++;
		}
	//*  70  133:goto            68
		pdfprow.setAdjusted(true);
	//   71  136:aload           7
	//   72  138:iconst_1        
	//   73  139:invokevirtual   #389 <Method void PdfPRow.setAdjusted(boolean)>
		return pdfprow;
	//   74  142:aload           7
	//   75  144:areturn         
	}

	public float calculateHeights()
	{
		if(totalWidth <= 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field float totalWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifgt            11
			return 0.0F;
	//    5    9:fconst_0        
	//    6   10:freturn         
		totalHeight = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #110 <Field float totalHeight>
		for(int i = 0; i < rows.size(); i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:aload_0         
	//*  14   20:getfield        #108 <Field ArrayList rows>
	//*  15   23:invokevirtual   #205 <Method int ArrayList.size()>
	//*  16   26:icmpge          51
			totalHeight = totalHeight + getRowHeight(i, true);
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #110 <Field float totalHeight>
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:invokevirtual   #394 <Method float getRowHeight(int, boolean)>
	//   24   40:fadd            
	//   25   41:putfield        #110 <Field float totalHeight>

	//   26   44:iload_1         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_1        
	//*  30   48:goto            18
		return totalHeight;
	//   31   51:aload_0         
	//   32   52:getfield        #110 <Field float totalHeight>
	//   33   55:freturn         
	}

	protected void calculateWidths()
	{
		if(totalWidth > 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field float totalWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifgt            10
	//*   5    9:return          
		{
			float f = 0.0F;
	//    6   10:fconst_0        
	//    7   11:fstore_1        
			int k = getNumberOfColumns();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   10   16:istore_3        
			for(int i = 0; i < k; i++)
	//*  11   17:iconst_0        
	//*  12   18:istore_2        
	//*  13   19:iload_2         
	//*  14   20:iload_3         
	//*  15   21:icmpge          40
				f += relativeWidths[i];
	//   16   24:fload_1         
	//   17   25:aload_0         
	//   18   26:getfield        #188 <Field float[] relativeWidths>
	//   19   29:iload_2         
	//   20   30:faload          
	//   21   31:fadd            
	//   22   32:fstore_1        

	//   23   33:iload_2         
	//   24   34:iconst_1        
	//   25   35:iadd            
	//   26   36:istore_2        
	//*  27   37:goto            19
			int j = 0;
	//   28   40:iconst_0        
	//   29   41:istore_2        
			while(j < k) 
	//*  30   42:iload_2         
	//*  31   43:iload_3         
	//*  32   44:icmpge          9
			{
				absoluteWidths[j] = (totalWidth * relativeWidths[j]) / f;
	//   33   47:aload_0         
	//   34   48:getfield        #190 <Field float[] absoluteWidths>
	//   35   51:iload_2         
	//   36   52:aload_0         
	//   37   53:getfield        #123 <Field float totalWidth>
	//   38   56:aload_0         
	//   39   57:getfield        #188 <Field float[] relativeWidths>
	//   40   60:iload_2         
	//   41   61:faload          
	//   42   62:fmul            
	//   43   63:fload_1         
	//   44   64:fdiv            
	//   45   65:fastore         
				j++;
	//   46   66:iload_2         
	//   47   67:iconst_1        
	//   48   68:iadd            
	//   49   69:istore_2        
			}
		}
	//*  50   70:goto            42
	}

	PdfPCell cellAt(int i, int j)
	{
		PdfPCell apdfpcell[] = ((PdfPRow)rows.get(i)).getCells();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList rows>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #211 <Class PdfPRow>
	//    5   11:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//    6   14:astore_3        
		for(i = 0; i < apdfpcell.length; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:aload_3         
	//*  11   19:arraylength     
	//*  12   20:icmpge          57
			if(apdfpcell[i] != null && j >= i && j < apdfpcell[i].getColspan() + i)
	//*  13   23:aload_3         
	//*  14   24:iload_1         
	//*  15   25:aaload          
	//*  16   26:ifnull          50
	//*  17   29:iload_2         
	//*  18   30:iload_1         
	//*  19   31:icmplt          50
	//*  20   34:iload_2         
	//*  21   35:aload_3         
	//*  22   36:iload_1         
	//*  23   37:aaload          
	//*  24   38:invokevirtual   #312 <Method int PdfPCell.getColspan()>
	//*  25   41:iload_1         
	//*  26   42:iadd            
	//*  27   43:icmpge          50
				return apdfpcell[i];
	//   28   46:aload_3         
	//   29   47:iload_1         
	//   30   48:aaload          
	//   31   49:areturn         

	//   32   50:iload_1         
	//   33   51:iconst_1        
	//   34   52:iadd            
	//   35   53:istore_1        
	//*  36   54:goto            17
		return null;
	//   37   57:aconst_null     
	//   38   58:areturn         
	}

	public void completeRow()
	{
		while(!rowCompleted) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field boolean rowCompleted>
	//*   2    4:ifne            19
			addCell(defaultCell);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #121 <Field PdfPCell defaultCell>
	//    6   12:invokevirtual   #352 <Method PdfPCell addCell(PdfPCell)>
	//    7   15:pop             
	//*   8   16:goto            0
	//    9   19:return          
	}

	protected void copyFormat(PdfPTable pdfptable)
	{
		rowsNotChecked = pdfptable.rowsNotChecked;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #152 <Field boolean rowsNotChecked>
	//    3    5:putfield        #152 <Field boolean rowsNotChecked>
		relativeWidths = new float[pdfptable.getNumberOfColumns()];
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #335 <Method int getNumberOfColumns()>
	//    7   13:newarray        float[]
	//    8   15:putfield        #188 <Field float[] relativeWidths>
		absoluteWidths = new float[pdfptable.getNumberOfColumns()];
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   12   23:newarray        float[]
	//   13   25:putfield        #190 <Field float[] absoluteWidths>
		System.arraycopy(((Object) (pdfptable.relativeWidths)), 0, ((Object) (relativeWidths)), 0, getNumberOfColumns());
	//   14   28:aload_1         
	//   15   29:getfield        #188 <Field float[] relativeWidths>
	//   16   32:iconst_0        
	//   17   33:aload_0         
	//   18   34:getfield        #188 <Field float[] relativeWidths>
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   22   42:invokestatic    #235 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (pdfptable.absoluteWidths)), 0, ((Object) (absoluteWidths)), 0, getNumberOfColumns());
	//   23   45:aload_1         
	//   24   46:getfield        #190 <Field float[] absoluteWidths>
	//   25   49:iconst_0        
	//   26   50:aload_0         
	//   27   51:getfield        #190 <Field float[] absoluteWidths>
	//   28   54:iconst_0        
	//   29   55:aload_0         
	//   30   56:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   31   59:invokestatic    #235 <Method void System.arraycopy(Object, int, Object, int, int)>
		totalWidth = pdfptable.totalWidth;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #123 <Field float totalWidth>
	//   35   67:putfield        #123 <Field float totalWidth>
		totalHeight = pdfptable.totalHeight;
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:getfield        #110 <Field float totalHeight>
	//   39   75:putfield        #110 <Field float totalHeight>
		currentColIdx = 0;
	//   40   78:aload_0         
	//   41   79:iconst_0        
	//   42   80:putfield        #112 <Field int currentColIdx>
		tableEvent = pdfptable.tableEvent;
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:getfield        #399 <Field PdfPTableEvent tableEvent>
	//   46   88:putfield        #399 <Field PdfPTableEvent tableEvent>
		runDirection = pdfptable.runDirection;
	//   47   91:aload_0         
	//   48   92:aload_1         
	//   49   93:getfield        #136 <Field int runDirection>
	//   50   96:putfield        #136 <Field int runDirection>
		if(pdfptable.defaultCell instanceof PdfPHeaderCell)
	//*  51   99:aload_1         
	//*  52  100:getfield        #121 <Field PdfPCell defaultCell>
	//*  53  103:instanceof      #306 <Class PdfPHeaderCell>
	//*  54  106:ifeq            338
			defaultCell = ((PdfPCell) (new PdfPHeaderCell((PdfPHeaderCell)pdfptable.defaultCell)));
	//   55  109:aload_0         
	//   56  110:new             #306 <Class PdfPHeaderCell>
	//   57  113:dup             
	//   58  114:aload_1         
	//   59  115:getfield        #121 <Field PdfPCell defaultCell>
	//   60  118:checkcast       #306 <Class PdfPHeaderCell>
	//   61  121:invokespecial   #309 <Method void PdfPHeaderCell(PdfPHeaderCell)>
	//   62  124:putfield        #121 <Field PdfPCell defaultCell>
		else
	//*  63  127:aload_0         
	//*  64  128:aload_1         
	//*  65  129:getfield        #195 <Field PdfPCell[] currentRow>
	//*  66  132:arraylength     
	//*  67  133:anewarray       PdfPCell[]
	//*  68  136:putfield        #195 <Field PdfPCell[] currentRow>
	//*  69  139:aload_0         
	//*  70  140:aload_1         
	//*  71  141:getfield        #134 <Field boolean isColspan>
	//*  72  144:putfield        #134 <Field boolean isColspan>
	//*  73  147:aload_0         
	//*  74  148:aload_1         
	//*  75  149:getfield        #140 <Field boolean splitRows>
	//*  76  152:putfield        #140 <Field boolean splitRows>
	//*  77  155:aload_0         
	//*  78  156:aload_1         
	//*  79  157:getfield        #401 <Field float spacingAfter>
	//*  80  160:putfield        #401 <Field float spacingAfter>
	//*  81  163:aload_0         
	//*  82  164:aload_1         
	//*  83  165:getfield        #403 <Field float spacingBefore>
	//*  84  168:putfield        #403 <Field float spacingBefore>
	//*  85  171:aload_0         
	//*  86  172:aload_1         
	//*  87  173:getfield        #405 <Field int headerRows>
	//*  88  176:putfield        #405 <Field int headerRows>
	//*  89  179:aload_0         
	//*  90  180:aload_1         
	//*  91  181:getfield        #407 <Field int footerRows>
	//*  92  184:putfield        #407 <Field int footerRows>
	//*  93  187:aload_0         
	//*  94  188:aload_1         
	//*  95  189:getfield        #138 <Field boolean lockedWidth>
	//*  96  192:putfield        #138 <Field boolean lockedWidth>
	//*  97  195:aload_0         
	//*  98  196:aload_1         
	//*  99  197:getfield        #142 <Field boolean[] extendLastRow>
	//* 100  200:putfield        #142 <Field boolean[] extendLastRow>
	//* 101  203:aload_0         
	//* 102  204:aload_1         
	//* 103  205:getfield        #409 <Field boolean headersInEvent>
	//* 104  208:putfield        #409 <Field boolean headersInEvent>
	//* 105  211:aload_0         
	//* 106  212:aload_1         
	//* 107  213:getfield        #126 <Field float widthPercentage>
	//* 108  216:putfield        #126 <Field float widthPercentage>
	//* 109  219:aload_0         
	//* 110  220:aload_1         
	//* 111  221:getfield        #144 <Field boolean splitLate>
	//* 112  224:putfield        #144 <Field boolean splitLate>
	//* 113  227:aload_0         
	//* 114  228:aload_1         
	//* 115  229:getfield        #130 <Field boolean skipFirstHeader>
	//* 116  232:putfield        #130 <Field boolean skipFirstHeader>
	//* 117  235:aload_0         
	//* 118  236:aload_1         
	//* 119  237:getfield        #132 <Field boolean skipLastFooter>
	//* 120  240:putfield        #132 <Field boolean skipLastFooter>
	//* 121  243:aload_0         
	//* 122  244:aload_1         
	//* 123  245:getfield        #128 <Field int horizontalAlignment>
	//* 124  248:putfield        #128 <Field int horizontalAlignment>
	//* 125  251:aload_0         
	//* 126  252:aload_1         
	//* 127  253:getfield        #197 <Field boolean keepTogether>
	//* 128  256:putfield        #197 <Field boolean keepTogether>
	//* 129  259:aload_0         
	//* 130  260:aload_1         
	//* 131  261:getfield        #146 <Field boolean complete>
	//* 132  264:putfield        #146 <Field boolean complete>
	//* 133  267:aload_0         
	//* 134  268:aload_1         
	//* 135  269:getfield        #150 <Field boolean loopCheck>
	//* 136  272:putfield        #150 <Field boolean loopCheck>
	//* 137  275:aload_0         
	//* 138  276:aload_1         
	//* 139  277:getfield        #166 <Field AccessibleElementId id>
	//* 140  280:putfield        #166 <Field AccessibleElementId id>
	//* 141  283:aload_0         
	//* 142  284:aload_1         
	//* 143  285:getfield        #159 <Field PdfName role>
	//* 144  288:putfield        #159 <Field PdfName role>
	//* 145  291:aload_1         
	//* 146  292:getfield        #161 <Field HashMap accessibleAttributes>
	//* 147  295:ifnull          313
	//* 148  298:aload_0         
	//* 149  299:new             #411 <Class HashMap>
	//* 150  302:dup             
	//* 151  303:aload_1         
	//* 152  304:getfield        #161 <Field HashMap accessibleAttributes>
	//* 153  307:invokespecial   #414 <Method void HashMap(Map)>
	//* 154  310:putfield        #161 <Field HashMap accessibleAttributes>
	//* 155  313:aload_0         
	//* 156  314:aload_1         
	//* 157  315:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 158  318:putfield        #168 <Field PdfPTableHeader header>
	//* 159  321:aload_0         
	//* 160  322:aload_1         
	//* 161  323:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 162  326:putfield        #170 <Field PdfPTableBody body>
	//* 163  329:aload_0         
	//* 164  330:aload_1         
	//* 165  331:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//* 166  334:putfield        #172 <Field PdfPTableFooter footer>
	//* 167  337:return          
			defaultCell = new PdfPCell(pdfptable.defaultCell);
	//  168  338:aload_0         
	//  169  339:new             #114 <Class PdfPCell>
	//  170  342:dup             
	//  171  343:aload_1         
	//  172  344:getfield        #121 <Field PdfPCell defaultCell>
	//  173  347:invokespecial   #221 <Method void PdfPCell(PdfPCell)>
	//  174  350:putfield        #121 <Field PdfPCell defaultCell>
		currentRow = new PdfPCell[pdfptable.currentRow.length];
		isColspan = pdfptable.isColspan;
		splitRows = pdfptable.splitRows;
		spacingAfter = pdfptable.spacingAfter;
		spacingBefore = pdfptable.spacingBefore;
		headerRows = pdfptable.headerRows;
		footerRows = pdfptable.footerRows;
		lockedWidth = pdfptable.lockedWidth;
		extendLastRow = pdfptable.extendLastRow;
		headersInEvent = pdfptable.headersInEvent;
		widthPercentage = pdfptable.widthPercentage;
		splitLate = pdfptable.splitLate;
		skipFirstHeader = pdfptable.skipFirstHeader;
		skipLastFooter = pdfptable.skipLastFooter;
		horizontalAlignment = pdfptable.horizontalAlignment;
		keepTogether = pdfptable.keepTogether;
		complete = pdfptable.complete;
		loopCheck = pdfptable.loopCheck;
		id = pdfptable.id;
		role = pdfptable.role;
		if(pdfptable.accessibleAttributes != null)
			accessibleAttributes = new HashMap(((Map) (pdfptable.accessibleAttributes)));
		header = pdfptable.getHeader();
		body = pdfptable.getBody();
		footer = pdfptable.getFooter();
	//* 175  353:goto            127
	}

	public void deleteBodyRows()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #105 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < headerRows; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #405 <Field int headerRows>
	//*   9   15:icmpge          38
			arraylist.add(rows.get(i));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #108 <Field ArrayList rows>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   15   27:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   16   30:pop             

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            10
		rows = arraylist;
	//   22   38:aload_0         
	//   23   39:aload_2         
	//   24   40:putfield        #108 <Field ArrayList rows>
		totalHeight = 0.0F;
	//   25   43:aload_0         
	//   26   44:fconst_0        
	//   27   45:putfield        #110 <Field float totalHeight>
		if(totalWidth > 0.0F)
	//*  28   48:aload_0         
	//*  29   49:getfield        #123 <Field float totalWidth>
	//*  30   52:fconst_0        
	//*  31   53:fcmpl           
	//*  32   54:ifle            65
			totalHeight = getHeaderHeight();
	//   33   57:aload_0         
	//   34   58:aload_0         
	//   35   59:invokevirtual   #430 <Method float getHeaderHeight()>
	//   36   62:putfield        #110 <Field float totalHeight>
	//   37   65:return          
	}

	public boolean deleteLastRow()
	{
		return deleteRow(rows.size() - 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field ArrayList rows>
	//    3    5:invokevirtual   #205 <Method int ArrayList.size()>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:invokevirtual   #435 <Method boolean deleteRow(int)>
	//    7   13:ireturn         
	}

	public boolean deleteRow(int i)
	{
		if(i < 0 || i >= rows.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #108 <Field ArrayList rows>
	//*   5    9:invokevirtual   #205 <Method int ArrayList.size()>
	//*   6   12:icmplt          17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(totalWidth > 0.0F)
	//*   9   17:aload_0         
	//*  10   18:getfield        #123 <Field float totalWidth>
	//*  11   21:fconst_0        
	//*  12   22:fcmpl           
	//*  13   23:ifle            55
		{
			PdfPRow pdfprow = (PdfPRow)rows.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #108 <Field ArrayList rows>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #211 <Class PdfPRow>
	//   19   37:astore_2        
			if(pdfprow != null)
	//*  20   38:aload_2         
	//*  21   39:ifnull          55
				totalHeight = totalHeight - pdfprow.getMaxHeights();
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #110 <Field float totalHeight>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//   27   51:fsub            
	//   28   52:putfield        #110 <Field float totalHeight>
		}
		rows.remove(i);
	//   29   55:aload_0         
	//   30   56:getfield        #108 <Field ArrayList rows>
	//   31   59:iload_1         
	//   32   60:invokevirtual   #438 <Method Object ArrayList.remove(int)>
	//   33   63:pop             
		if(i < headerRows)
	//*  34   64:iload_1         
	//*  35   65:aload_0         
	//*  36   66:getfield        #405 <Field int headerRows>
	//*  37   69:icmpge          105
		{
			headerRows = headerRows - 1;
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #405 <Field int headerRows>
	//   41   77:iconst_1        
	//   42   78:isub            
	//   43   79:putfield        #405 <Field int headerRows>
			if(i >= headerRows - footerRows)
	//*  44   82:iload_1         
	//*  45   83:aload_0         
	//*  46   84:getfield        #405 <Field int headerRows>
	//*  47   87:aload_0         
	//*  48   88:getfield        #407 <Field int footerRows>
	//*  49   91:isub            
	//*  50   92:icmplt          105
				footerRows = footerRows - 1;
	//   51   95:aload_0         
	//   52   96:aload_0         
	//   53   97:getfield        #407 <Field int footerRows>
	//   54  100:iconst_1        
	//   55  101:isub            
	//   56  102:putfield        #407 <Field int footerRows>
		}
		return true;
	//   57  105:iconst_1        
	//   58  106:ireturn         
	}

	public void flushContent()
	{
		deleteBodyRows();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #441 <Method void deleteBodyRows()>
		if(numberOfWrittenRows > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #365 <Field int numberOfWrittenRows>
	//*   4    8:ifle            16
			setSkipFirstHeader(true);
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #444 <Method void setSkipFirstHeader(boolean)>
	//    8   16:return          
	}

	public float[] getAbsoluteWidths()
	{
		return absoluteWidths;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field float[] absoluteWidths>
	//    2    4:areturn         
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #451 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #453 <Class PdfObject>
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
	//    1    1:getfield        #161 <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public PdfPTableBody getBody()
	{
		if(body == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field PdfPTableBody body>
	//*   2    4:ifnonnull       18
			body = new PdfPTableBody();
	//    3    7:aload_0         
	//    4    8:new             #257 <Class PdfPTableBody>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void PdfPTableBody()>
	//    7   15:putfield        #170 <Field PdfPTableBody body>
		return body;
	//    8   18:aload_0         
	//    9   19:getfield        #170 <Field PdfPTableBody body>
	//   10   22:areturn         
	}

	public int getCellStartRowIndex(int i, int j)
	{
		for(; getRow(i).getCells()[j] == null && i > 0; i--);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//    3    5:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//    4    8:iload_2         
	//    5    9:aaload          
	//    6   10:ifnonnull       24
	//    7   13:iload_1         
	//    8   14:ifle            24
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:isub            
	//   12   20:istore_1        
	//*  13   21:goto            0
		return i;
	//   14   24:iload_1         
	//   15   25:ireturn         
	}

	public List getChunks()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #105 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public PdfPCell getDefaultCell()
	{
		return defaultCell;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field PdfPCell defaultCell>
	//    2    4:areturn         
	}

	float[][] getEventWidths(float f, int i, int j, boolean flag)
	{
		int k;
		int l;
		float af[][];
		k = i;
	//    0    0:iload_2         
	//    1    1:istore          5
		l = j;
	//    2    3:iload_3         
	//    3    4:istore          6
		if(flag)
	//*   4    6:iload           4
	//*   5    8:ifeq            31
		{
			k = Math.max(i, headerRows);
	//    6   11:iload_2         
	//    7   12:aload_0         
	//    8   13:getfield        #405 <Field int headerRows>
	//    9   16:invokestatic    #318 <Method int Math.max(int, int)>
	//   10   19:istore          5
			l = Math.max(j, headerRows);
	//   11   21:iload_3         
	//   12   22:aload_0         
	//   13   23:getfield        #405 <Field int headerRows>
	//   14   26:invokestatic    #318 <Method int Math.max(int, int)>
	//   15   29:istore          6
		}
		int i1;
		if(flag)
	//*  16   31:iload           4
	//*  17   33:ifeq            115
			i = headerRows;
	//   18   36:aload_0         
	//   19   37:getfield        #405 <Field int headerRows>
	//   20   40:istore_2        
		else
	//*  21   41:iload_2         
	//*  22   42:iload           6
	//*  23   44:iadd            
	//*  24   45:iload           5
	//*  25   47:isub            
	//*  26   48:anewarray       float[][]
	//*  27   51:astore          8
	//*  28   53:aload_0         
	//*  29   54:getfield        #134 <Field boolean isColspan>
	//*  30   57:ifeq            203
	//*  31   60:iconst_0        
	//*  32   61:istore_3        
	//*  33   62:iconst_0        
	//*  34   63:istore_2        
	//*  35   64:iload           4
	//*  36   66:ifeq            276
	//*  37   69:iconst_0        
	//*  38   70:istore          7
	//*  39   72:iload_2         
	//*  40   73:istore_3        
	//*  41   74:iload           7
	//*  42   76:aload_0         
	//*  43   77:getfield        #405 <Field int headerRows>
	//*  44   80:icmpge          276
	//*  45   83:aload_0         
	//*  46   84:getfield        #108 <Field ArrayList rows>
	//*  47   87:iload           7
	//*  48   89:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//*  49   92:checkcast       #211 <Class PdfPRow>
	//*  50   95:astore          9
	//*  51   97:aload           9
	//*  52   99:ifnonnull       120
	//*  53  102:iload_2         
	//*  54  103:iconst_1        
	//*  55  104:iadd            
	//*  56  105:istore_2        
	//*  57  106:iload           7
	//*  58  108:iconst_1        
	//*  59  109:iadd            
	//*  60  110:istore          7
	//*  61  112:goto            72
			i = 0;
	//   62  115:iconst_0        
	//   63  116:istore_2        
		af = new float[(i + l) - k][];
		if(!isColspan) goto _L2; else goto _L1
_L1:
		j = 0;
		i = 0;
		PdfPRow pdfprow1;
		float af1[];
		if(flag)
		{
			i1 = 0;
			do
			{
				j = i;
				if(i1 >= headerRows)
					break;
				PdfPRow pdfprow = (PdfPRow)rows.get(i1);
				if(pdfprow == null)
				{
					i++;
				} else
	//*  64  117:goto            41
				{
					af[i] = pdfprow.getEventWidth(f, absoluteWidths);
	//   65  120:aload           8
	//   66  122:iload_2         
	//   67  123:aload           9
	//   68  125:fload_1         
	//   69  126:aload_0         
	//   70  127:getfield        #190 <Field float[] absoluteWidths>
	//   71  130:invokevirtual   #470 <Method float[] PdfPRow.getEventWidth(float, float[])>
	//   72  133:aastore         
					i++;
	//   73  134:iload_2         
	//   74  135:iconst_1        
	//   75  136:iadd            
	//   76  137:istore_2        
				}
				i1++;
			} while(true);
	//   77  138:goto            106
		}
	//*  78  141:iload           5
	//*  79  143:iload           6
	//*  80  145:icmpge          273
	//*  81  148:aload_0         
	//*  82  149:getfield        #108 <Field ArrayList rows>
	//*  83  152:iload           5
	//*  84  154:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//*  85  157:checkcast       #211 <Class PdfPRow>
	//*  86  160:astore          9
	//*  87  162:aload           9
	//*  88  164:ifnonnull       180
	//*  89  167:iload_2         
	//*  90  168:iconst_1        
	//*  91  169:iadd            
	//*  92  170:istore_2        
	//*  93  171:iload           5
	//*  94  173:iconst_1        
	//*  95  174:iadd            
	//*  96  175:istore          5
	//*  97  177:goto            141
	//*  98  180:iload_2         
	//*  99  181:iconst_1        
	//* 100  182:iadd            
	//* 101  183:istore_3        
	//* 102  184:aload           8
	//* 103  186:iload_2         
	//* 104  187:aload           9
	//* 105  189:fload_1         
	//* 106  190:aload_0         
	//* 107  191:getfield        #190 <Field float[] absoluteWidths>
	//* 108  194:invokevirtual   #470 <Method float[] PdfPRow.getEventWidth(float, float[])>
	//* 109  197:aastore         
	//* 110  198:iload_3         
	//* 111  199:istore_2        
	//* 112  200:goto            171
	//* 113  203:aload_0         
	//* 114  204:invokevirtual   #335 <Method int getNumberOfColumns()>
	//* 115  207:istore_3        
	//* 116  208:iload_3         
	//* 117  209:iconst_1        
	//* 118  210:iadd            
	//* 119  211:newarray        float[]
	//* 120  213:astore          9
	//* 121  215:aload           9
	//* 122  217:iconst_0        
	//* 123  218:fload_1         
	//* 124  219:fastore         
	//* 125  220:iconst_0        
	//* 126  221:istore_2        
	//* 127  222:iload_2         
	//* 128  223:iload_3         
	//* 129  224:icmpge          251
	//* 130  227:aload           9
	//* 131  229:iload_2         
	//* 132  230:iconst_1        
	//* 133  231:iadd            
	//* 134  232:aload           9
	//* 135  234:iload_2         
	//* 136  235:faload          
	//* 137  236:aload_0         
	//* 138  237:getfield        #190 <Field float[] absoluteWidths>
	//* 139  240:iload_2         
	//* 140  241:faload          
	//* 141  242:fadd            
	//* 142  243:fastore         
	//* 143  244:iload_2         
	//* 144  245:iconst_1        
	//* 145  246:iadd            
	//* 146  247:istore_2        
	//* 147  248:goto            222
	//* 148  251:iconst_0        
	//* 149  252:istore_2        
	//* 150  253:iload_2         
	//* 151  254:aload           8
	//* 152  256:arraylength     
	//* 153  257:icmpge          273
	//* 154  260:aload           8
	//* 155  262:iload_2         
	//* 156  263:aload           9
	//* 157  265:aastore         
	//* 158  266:iload_2         
	//* 159  267:iconst_1        
	//* 160  268:iadd            
	//* 161  269:istore_2        
	//* 162  270:goto            253
	//* 163  273:aload           8
	//* 164  275:areturn         
		i = j;
	//  165  276:iload_3         
	//  166  277:istore_2        
		  goto _L3
_L6:
		while(k < l) 
		{
			pdfprow1 = (PdfPRow)rows.get(k);
			if(pdfprow1 == null)
			{
				i++;
			} else
			{
				j = i + 1;
				af[i] = pdfprow1.getEventWidth(f, absoluteWidths);
				i = j;
			}
			k++;
		}
		  goto _L4
_L2:
		j = getNumberOfColumns();
		af1 = new float[j + 1];
		af1[0] = f;
		for(i = 0; i < j; i++)
			af1[i + 1] = af1[i] + absoluteWidths[i];

		for(i = 0; i < af.length; i++)
			af[i] = af1;

_L4:
		return af;
_L3:
		if(true) goto _L6; else goto _L5
	//  167  278:goto            141
_L5:
	}

	public FittingRows getFittingRows(float f, int i)
	{
		LOGGER.info(String.format("getFittingRows(%s, %s)", new Object[] {
			Float.valueOf(f), Integer.valueOf(i)
		}));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Logger LOGGER>
	//    2    4:ldc2            #474 <String "getFittingRows(%s, %s)">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:fload_1         
	//    8   14:invokestatic    #480 <Method Float Float.valueOf(float)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:iload_2         
	//   13   21:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//   14   24:aastore         
	//   15   25:invokestatic    #490 <Method String String.format(String, Object[])>
	//   16   28:invokeinterface #495 <Method void Logger.info(String)>
		if(i > 0 && i < rows.size() && !$assertionsDisabled && getRow(i).getCells()[0] == null)
	//*  17   33:iload_2         
	//*  18   34:ifle            75
	//*  19   37:iload_2         
	//*  20   38:aload_0         
	//*  21   39:getfield        #108 <Field ArrayList rows>
	//*  22   42:invokevirtual   #205 <Method int ArrayList.size()>
	//*  23   45:icmpge          75
	//*  24   48:getstatic       #91  <Field boolean $assertionsDisabled>
	//*  25   51:ifne            75
	//*  26   54:aload_0         
	//*  27   55:iload_2         
	//*  28   56:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//*  29   59:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//*  30   62:iconst_0        
	//*  31   63:aaload          
	//*  32   64:ifnonnull       75
			throw new AssertionError();
	//   33   67:new             #497 <Class AssertionError>
	//   34   70:dup             
	//   35   71:invokespecial   #498 <Method void AssertionError()>
	//   36   74:athrow          
		int l1 = getNumberOfColumns();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   39   79:istore          11
		ColumnMeasurementState acolumnmeasurementstate[] = new ColumnMeasurementState[l1];
	//   40   81:iload           11
	//   41   83:anewarray       ColumnMeasurementState[]
	//   42   86:astore          12
		for(int j = 0; j < l1; j++)
	//*  43   88:iconst_0        
	//*  44   89:istore          8
	//*  45   91:iload           8
	//*  46   93:iload           11
	//*  47   95:icmpge          119
			acolumnmeasurementstate[j] = new ColumnMeasurementState();
	//   48   98:aload           12
	//   49  100:iload           8
	//   50  102:new             #12  <Class PdfPTable$ColumnMeasurementState>
	//   51  105:dup             
	//   52  106:invokespecial   #499 <Method void PdfPTable$ColumnMeasurementState()>
	//   53  109:aastore         

	//   54  110:iload           8
	//   55  112:iconst_1        
	//   56  113:iadd            
	//   57  114:istore          8
	//*  58  116:goto            91
		float f5 = 0.0F;
	//   59  119:fconst_0        
	//   60  120:fstore          6
		float f4 = 0.0F;
	//   61  122:fconst_0        
	//   62  123:fstore          5
		HashMap hashmap = new HashMap();
	//   63  125:new             #411 <Class HashMap>
	//   64  128:dup             
	//   65  129:invokespecial   #500 <Method void HashMap()>
	//   66  132:astore          13
		int k = i;
	//   67  134:iload_2         
	//   68  135:istore          8
		do
		{
			float f1;
			float f3;
label0:
			{
				if(k < size())
	//*  69  137:iload           8
	//*  70  139:aload_0         
	//*  71  140:invokevirtual   #501 <Method int size()>
	//*  72  143:icmpge          433
				{
					PdfPRow pdfprow = getRow(k);
	//   73  146:aload_0         
	//   74  147:iload           8
	//   75  149:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//   76  152:astore          14
					float f6 = pdfprow.getMaxRowHeightsWithoutCalculating();
	//   77  154:aload           14
	//   78  156:invokevirtual   #504 <Method float PdfPRow.getMaxRowHeightsWithoutCalculating()>
	//   79  159:fstore          7
					f1 = 0.0F;
	//   80  161:fconst_0        
	//   81  162:fstore_3        
					for(int l = 0; l < l1;)
	//*  82  163:iconst_0        
	//*  83  164:istore          9
	//*  84  166:iload           9
	//*  85  168:iload           11
	//*  86  170:icmpge          344
					{
						PdfPCell pdfpcell = pdfprow.getCells()[l];
	//   87  173:aload           14
	//   88  175:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   89  178:iload           9
	//   90  180:aaload          
	//   91  181:astore          15
						ColumnMeasurementState columnmeasurementstate1 = acolumnmeasurementstate[l];
	//   92  183:aload           12
	//   93  185:iload           9
	//   94  187:aaload          
	//   95  188:astore          16
						float f2;
						if(pdfpcell == null)
	//*  96  190:aload           15
	//*  97  192:ifnonnull       273
						{
							columnmeasurementstate1.consumeRowspan(f5, f6);
	//   98  195:aload           16
	//   99  197:fload           6
	//  100  199:fload           7
	//  101  201:invokevirtual   #508 <Method void PdfPTable$ColumnMeasurementState.consumeRowspan(float, float)>
						} else
	//* 102  204:fload_3         
	//* 103  205:fstore          4
	//* 104  207:aload           16
	//* 105  209:invokevirtual   #511 <Method boolean PdfPTable$ColumnMeasurementState.cellEnds()>
	//* 106  212:ifeq            235
	//* 107  215:fload_3         
	//* 108  216:fstore          4
	//* 109  218:aload           16
	//* 110  220:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//* 111  223:fload_3         
	//* 112  224:fcmpl           
	//* 113  225:ifle            235
	//* 114  228:aload           16
	//* 115  230:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//* 116  233:fstore          4
	//* 117  235:iconst_1        
	//* 118  236:istore          10
	//* 119  238:iload           10
	//* 120  240:aload           16
	//* 121  242:getfield        #517 <Field int PdfPTable$ColumnMeasurementState.colspan>
	//* 122  245:icmpge          328
	//* 123  248:aload           12
	//* 124  250:iload           9
	//* 125  252:iload           10
	//* 126  254:iadd            
	//* 127  255:aaload          
	//* 128  256:aload           16
	//* 129  258:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//* 130  261:putfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//* 131  264:iload           10
	//* 132  266:iconst_1        
	//* 133  267:iadd            
	//* 134  268:istore          10
	//* 135  270:goto            238
						{
							columnmeasurementstate1.beginCell(pdfpcell, f5, f6);
	//  136  273:aload           16
	//  137  275:aload           15
	//  138  277:fload           6
	//  139  279:fload           7
	//  140  281:invokevirtual   #521 <Method void PdfPTable$ColumnMeasurementState.beginCell(PdfPCell, float, float)>
							LOGGER.info(String.format("Height after beginCell: %s (cell: %s)", new Object[] {
								Float.valueOf(columnmeasurementstate1.height), Float.valueOf(pdfpcell.getCachedMaxHeight())
							}));
	//  141  284:aload_0         
	//  142  285:getfield        #103 <Field Logger LOGGER>
	//  143  288:ldc2            #523 <String "Height after beginCell: %s (cell: %s)">
	//  144  291:iconst_2        
	//  145  292:anewarray       Object[]
	//  146  295:dup             
	//  147  296:iconst_0        
	//  148  297:aload           16
	//  149  299:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//  150  302:invokestatic    #480 <Method Float Float.valueOf(float)>
	//  151  305:aastore         
	//  152  306:dup             
	//  153  307:iconst_1        
	//  154  308:aload           15
	//  155  310:invokevirtual   #526 <Method float PdfPCell.getCachedMaxHeight()>
	//  156  313:invokestatic    #480 <Method Float Float.valueOf(float)>
	//  157  316:aastore         
	//  158  317:invokestatic    #490 <Method String String.format(String, Object[])>
	//  159  320:invokeinterface #495 <Method void Logger.info(String)>
						}
						f2 = f1;
						if(columnmeasurementstate1.cellEnds())
						{
							f2 = f1;
							if(columnmeasurementstate1.height > f1)
								f2 = columnmeasurementstate1.height;
						}
						for(int j1 = 1; j1 < columnmeasurementstate1.colspan; j1++)
							acolumnmeasurementstate[l + j1].height = columnmeasurementstate1.height;

	//* 160  325:goto            204
						l += columnmeasurementstate1.colspan;
	//  161  328:iload           9
	//  162  330:aload           16
	//  163  332:getfield        #517 <Field int PdfPTable$ColumnMeasurementState.colspan>
	//  164  335:iadd            
	//  165  336:istore          9
						f1 = f2;
	//  166  338:fload           4
	//  167  340:fstore_3        
					}

	//* 168  341:goto            166
					f3 = 0.0F;
	//  169  344:fconst_0        
	//  170  345:fstore          4
					int k1 = acolumnmeasurementstate.length;
	//  171  347:aload           12
	//  172  349:arraylength     
	//  173  350:istore          10
					for(int i1 = 0; i1 < k1;)
	//* 174  352:iconst_0        
	//* 175  353:istore          9
	//* 176  355:iload           9
	//* 177  357:iload           10
	//* 178  359:icmpge          404
					{
						ColumnMeasurementState columnmeasurementstate = acolumnmeasurementstate[i1];
	//  179  362:aload           12
	//  180  364:iload           9
	//  181  366:aaload          
	//  182  367:astore          15
						f6 = f3;
	//  183  369:fload           4
	//  184  371:fstore          7
						if(columnmeasurementstate.height > f3)
	//* 185  373:aload           15
	//* 186  375:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//* 187  378:fload           4
	//* 188  380:fcmpl           
	//* 189  381:ifle            391
							f6 = columnmeasurementstate.height;
	//  190  384:aload           15
	//  191  386:getfield        #514 <Field float PdfPTable$ColumnMeasurementState.height>
	//  192  389:fstore          7
						i1++;
	//  193  391:iload           9
	//  194  393:iconst_1        
	//  195  394:iadd            
	//  196  395:istore          9
						f3 = f6;
	//  197  397:fload           7
	//  198  399:fstore          4
					}

	//* 199  401:goto            355
					pdfprow.setFinalMaxHeights(f1 - f5);
	//  200  404:aload           14
	//  201  406:fload_3         
	//  202  407:fload           6
	//  203  409:fsub            
	//  204  410:invokevirtual   #530 <Method void PdfPRow.setFinalMaxHeights(float)>
					if(isSplitLate())
	//* 205  413:aload_0         
	//* 206  414:invokevirtual   #533 <Method boolean isSplitLate()>
	//* 207  417:ifeq            457
						f6 = f3;
	//  208  420:fload           4
	//  209  422:fstore          7
					else
	//* 210  424:fload_1         
	//* 211  425:fload           7
	//* 212  427:fsub            
	//* 213  428:fconst_0        
	//* 214  429:fcmpg           
	//* 215  430:ifge            463
	//* 216  433:aload_0         
	//* 217  434:iconst_0        
	//* 218  435:putfield        #152 <Field boolean rowsNotChecked>
	//* 219  438:new             #15  <Class PdfPTable$FittingRows>
	//* 220  441:dup             
	//* 221  442:iload_2         
	//* 222  443:iload           8
	//* 223  445:iconst_1        
	//* 224  446:isub            
	//* 225  447:fload           5
	//* 226  449:fload           6
	//* 227  451:aload           13
	//* 228  453:invokespecial   #536 <Method void PdfPTable$FittingRows(int, int, float, float, Map)>
	//* 229  456:areturn         
						f6 = f1;
	//  230  457:fload_3         
	//  231  458:fstore          7
					if(f - f6 >= 0.0F)
						break label0;
				}
				rowsNotChecked = false;
				return new FittingRows(i, k - 1, f4, f5, ((Map) (hashmap)));
			}
	//* 232  460:goto            424
			((Map) (hashmap)).put(((Object) (Integer.valueOf(k))), ((Object) (Float.valueOf(f3 - f5))));
	//  233  463:aload           13
	//  234  465:iload           8
	//  235  467:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//  236  470:fload           4
	//  237  472:fload           6
	//  238  474:fsub            
	//  239  475:invokestatic    #480 <Method Float Float.valueOf(float)>
	//  240  478:invokeinterface #542 <Method Object Map.put(Object, Object)>
	//  241  483:pop             
			k++;
	//  242  484:iload           8
	//  243  486:iconst_1        
	//  244  487:iadd            
	//  245  488:istore          8
			f4 = f3;
	//  246  490:fload           4
	//  247  492:fstore          5
			f5 = f1;
	//  248  494:fload_3         
	//  249  495:fstore          6
		} while(true);
	//  250  497:goto            137
	}

	public PdfPTableFooter getFooter()
	{
		if(footer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field PdfPTableFooter footer>
	//*   2    4:ifnonnull       18
			footer = new PdfPTableFooter();
	//    3    7:aload_0         
	//    4    8:new             #544 <Class PdfPTableFooter>
	//    5   11:dup             
	//    6   12:invokespecial   #545 <Method void PdfPTableFooter()>
	//    7   15:putfield        #172 <Field PdfPTableFooter footer>
		return footer;
	//    8   18:aload_0         
	//    9   19:getfield        #172 <Field PdfPTableFooter footer>
	//   10   22:areturn         
	}

	public float getFooterHeight()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		int i = Math.max(0, headerRows - footerRows);
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:getfield        #405 <Field int headerRows>
	//    5    7:aload_0         
	//    6    8:getfield        #407 <Field int footerRows>
	//    7   11:isub            
	//    8   12:invokestatic    #318 <Method int Math.max(int, int)>
	//    9   15:istore_3        
		for(int j = Math.min(rows.size(), headerRows); i < j;)
	//*  10   16:aload_0         
	//*  11   17:getfield        #108 <Field ArrayList rows>
	//*  12   20:invokevirtual   #205 <Method int ArrayList.size()>
	//*  13   23:aload_0         
	//*  14   24:getfield        #405 <Field int headerRows>
	//*  15   27:invokestatic    #321 <Method int Math.min(int, int)>
	//*  16   30:istore          4
	//*  17   32:iload_3         
	//*  18   33:iload           4
	//*  19   35:icmpge          75
		{
			PdfPRow pdfprow = (PdfPRow)rows.get(i);
	//   20   38:aload_0         
	//   21   39:getfield        #108 <Field ArrayList rows>
	//   22   42:iload_3         
	//   23   43:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   24   46:checkcast       #211 <Class PdfPRow>
	//   25   49:astore          5
			float f1 = f;
	//   26   51:fload_1         
	//   27   52:fstore_2        
			if(pdfprow != null)
	//*  28   53:aload           5
	//*  29   55:ifnull          66
				f1 = f + pdfprow.getMaxHeights();
	//   30   58:fload_1         
	//   31   59:aload           5
	//   32   61:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//   33   64:fadd            
	//   34   65:fstore_2        
			i++;
	//   35   66:iload_3         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_3        
			f = f1;
	//   39   70:fload_2         
	//   40   71:fstore_1        
		}

	//*  41   72:goto            32
		return f;
	//   42   75:fload_1         
	//   43   76:freturn         
	}

	public int getFooterRows()
	{
		return footerRows;
	//    0    0:aload_0         
	//    1    1:getfield        #407 <Field int footerRows>
	//    2    4:ireturn         
	}

	public PdfPTableHeader getHeader()
	{
		if(header == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field PdfPTableHeader header>
	//*   2    4:ifnonnull       18
			header = new PdfPTableHeader();
	//    3    7:aload_0         
	//    4    8:new             #549 <Class PdfPTableHeader>
	//    5   11:dup             
	//    6   12:invokespecial   #550 <Method void PdfPTableHeader()>
	//    7   15:putfield        #168 <Field PdfPTableHeader header>
		return header;
	//    8   18:aload_0         
	//    9   19:getfield        #168 <Field PdfPTableHeader header>
	//   10   22:areturn         
	}

	public float getHeaderHeight()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		int j = Math.min(rows.size(), headerRows);
	//    2    2:aload_0         
	//    3    3:getfield        #108 <Field ArrayList rows>
	//    4    6:invokevirtual   #205 <Method int ArrayList.size()>
	//    5    9:aload_0         
	//    6   10:getfield        #405 <Field int headerRows>
	//    7   13:invokestatic    #321 <Method int Math.min(int, int)>
	//    8   16:istore          4
		for(int i = 0; i < j;)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          63
		{
			PdfPRow pdfprow = (PdfPRow)rows.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #108 <Field ArrayList rows>
	//   16   30:iload_3         
	//   17   31:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #211 <Class PdfPRow>
	//   19   37:astore          5
			float f1 = f;
	//   20   39:fload_1         
	//   21   40:fstore_2        
			if(pdfprow != null)
	//*  22   41:aload           5
	//*  23   43:ifnull          54
				f1 = f + pdfprow.getMaxHeights();
	//   24   46:fload_1         
	//   25   47:aload           5
	//   26   49:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//   27   52:fadd            
	//   28   53:fstore_2        
			i++;
	//   29   54:iload_3         
	//   30   55:iconst_1        
	//   31   56:iadd            
	//   32   57:istore_3        
			f = f1;
	//   33   58:fload_2         
	//   34   59:fstore_1        
		}

	//*  35   60:goto            20
		return f;
	//   36   63:fload_1         
	//   37   64:freturn         
	}

	public int getHeaderRows()
	{
		return headerRows;
	//    0    0:aload_0         
	//    1    1:getfield        #405 <Field int headerRows>
	//    2    4:ireturn         
	}

	public int getHorizontalAlignment()
	{
		return horizontalAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int horizontalAlignment>
	//    2    4:ireturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public boolean getKeepTogether()
	{
		return keepTogether;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field boolean keepTogether>
	//    2    4:ireturn         
	}

	public int getLastCompletedRowIndex()
	{
		return rows.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList rows>
	//    2    4:invokevirtual   #205 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int getNumberOfColumns()
	{
		return relativeWidths.length;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field float[] relativeWidths>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public float getPaddingTop()
	{
		return paddingTop;
	//    0    0:aload_0         
	//    1    1:getfield        #559 <Field float paddingTop>
	//    2    4:freturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field PdfName role>
	//    2    4:areturn         
	}

	public PdfPRow getRow(int i)
	{
		return (PdfPRow)rows.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList rows>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #211 <Class PdfPRow>
	//    5   11:areturn         
	}

	public float getRowHeight(int i)
	{
		return getRowHeight(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #394 <Method float getRowHeight(int, boolean)>
	//    4    6:freturn         
	}

	protected float getRowHeight(int i, boolean flag)
	{
		PdfPRow pdfprow;
		if(totalWidth > 0.0F && i >= 0 && i < rows.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field float totalWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifle            24
	//*   5    9:iload_1         
	//*   6   10:iflt            24
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #108 <Field ArrayList rows>
	//*  10   18:invokevirtual   #205 <Method int ArrayList.size()>
	//*  11   21:icmplt          26
	//*  12   24:fconst_0        
	//*  13   25:freturn         
	//*  14   26:aload_0         
	//*  15   27:getfield        #108 <Field ArrayList rows>
	//*  16   30:iload_1         
	//*  17   31:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//*  18   34:checkcast       #211 <Class PdfPRow>
	//*  19   37:astore          8
			if((pdfprow = (PdfPRow)rows.get(i)) != null)
	//*  20   39:aload           8
	//*  21   41:ifnull          24
			{
				if(flag)
	//*  22   44:iload_2         
	//*  23   45:ifeq            58
					pdfprow.setWidths(absoluteWidths);
	//   24   48:aload           8
	//   25   50:aload_0         
	//   26   51:getfield        #190 <Field float[] absoluteWidths>
	//   27   54:invokevirtual   #342 <Method boolean PdfPRow.setWidths(float[])>
	//   28   57:pop             
				float f2 = pdfprow.getMaxHeights();
	//   29   58:aload           8
	//   30   60:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//   31   63:fstore          5
				int k = 0;
	//   32   65:iconst_0        
	//   33   66:istore          7
				while(k < relativeWidths.length) 
	//*  34   68:iload           7
	//*  35   70:aload_0         
	//*  36   71:getfield        #188 <Field float[] relativeWidths>
	//*  37   74:arraylength     
	//*  38   75:icmpge          232
				{
					float f1;
					if(!rowSpanAbove(i, k))
	//*  39   78:aload_0         
	//*  40   79:iload_1         
	//*  41   80:iload           7
	//*  42   82:invokevirtual   #302 <Method boolean rowSpanAbove(int, int)>
	//*  43   85:ifne            105
					{
						f1 = f2;
	//   44   88:fload           5
	//   45   90:fstore          4
					} else
	//*  46   92:iload           7
	//*  47   94:iconst_1        
	//*  48   95:iadd            
	//*  49   96:istore          7
	//*  50   98:fload           4
	//*  51  100:fstore          5
	//*  52  102:goto            68
					{
						int j;
						for(j = 1; rowSpanAbove(i - j, k); j++);
	//   53  105:iconst_1        
	//   54  106:istore          6
	//   55  108:aload_0         
	//   56  109:iload_1         
	//   57  110:iload           6
	//   58  112:isub            
	//   59  113:iload           7
	//   60  115:invokevirtual   #302 <Method boolean rowSpanAbove(int, int)>
	//   61  118:ifeq            130
	//   62  121:iload           6
	//   63  123:iconst_1        
	//   64  124:iadd            
	//   65  125:istore          6
	//*  66  127:goto            108
						PdfPCell pdfpcell = ((PdfPRow)rows.get(i - j)).getCells()[k];
	//   67  130:aload_0         
	//   68  131:getfield        #108 <Field ArrayList rows>
	//   69  134:iload_1         
	//   70  135:iload           6
	//   71  137:isub            
	//   72  138:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   73  141:checkcast       #211 <Class PdfPRow>
	//   74  144:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   75  147:iload           7
	//   76  149:aaload          
	//   77  150:astore          9
						f1 = 0.0F;
	//   78  152:fconst_0        
	//   79  153:fstore          4
						float f = f1;
	//   80  155:fload           4
	//   81  157:fstore_3        
						if(pdfpcell != null)
	//*  82  158:aload           9
	//*  83  160:ifnull          215
						{
							f = f1;
	//   84  163:fload           4
	//   85  165:fstore_3        
							if(pdfpcell.getRowspan() == j + 1)
	//*  86  166:aload           9
	//*  87  168:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//*  88  171:iload           6
	//*  89  173:iconst_1        
	//*  90  174:iadd            
	//*  91  175:icmpne          215
							{
								f1 = pdfpcell.getMaxHeight();
	//   92  178:aload           9
	//   93  180:invokevirtual   #563 <Method float PdfPCell.getMaxHeight()>
	//   94  183:fstore          4
								do
								{
									f = f1;
	//   95  185:fload           4
	//   96  187:fstore_3        
									if(j <= 0)
										break;
	//   97  188:iload           6
	//   98  190:ifle            215
									f1 -= getRowHeight(i - j);
	//   99  193:fload           4
	//  100  195:aload_0         
	//  101  196:iload_1         
	//  102  197:iload           6
	//  103  199:isub            
	//  104  200:invokevirtual   #565 <Method float getRowHeight(int)>
	//  105  203:fsub            
	//  106  204:fstore          4
									j--;
	//  107  206:iload           6
	//  108  208:iconst_1        
	//  109  209:isub            
	//  110  210:istore          6
								} while(true);
	//  111  212:goto            185
							}
						}
						f1 = f2;
	//  112  215:fload           5
	//  113  217:fstore          4
						if(f > f2)
	//* 114  219:fload_3         
	//* 115  220:fload           5
	//* 116  222:fcmpl           
	//* 117  223:ifle            92
							f1 = f;
	//  118  226:fload_3         
	//  119  227:fstore          4
					}
					k++;
					f2 = f1;
				}
	//* 120  229:goto            92
				pdfprow.setMaxHeights(f2);
	//  121  232:aload           8
	//  122  234:fload           5
	//  123  236:invokevirtual   #568 <Method void PdfPRow.setMaxHeights(float)>
				return f2;
	//  124  239:fload           5
	//  125  241:freturn         
			}
		return 0.0F;
	}

	public ArrayList getRows()
	{
		return rows;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList rows>
	//    2    4:areturn         
	}

	public ArrayList getRows(int i, int j)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #105 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void ArrayList()>
	//    3    7:astore_3        
		if(i >= 0 && j <= size())
	//*   4    8:iload_1         
	//*   5    9:iflt            20
	//*   6   12:iload_2         
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #501 <Method int size()>
	//*   9   17:icmple          22
	//*  10   20:aload_3         
	//*  11   21:areturn         
			while(i < j) 
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmpge          20
			{
				arraylist.add(((Object) (adjustCellsInRow(i, j))));
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #574 <Method PdfPRow adjustCellsInRow(int, int)>
	//   20   34:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//   21   37:pop             
				i++;
	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
			}
		return arraylist;
	//*  26   42:goto            22
	}

	public float getRowspanHeight(int i, int j)
	{
		float f;
		float f1;
		f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		f1 = f;
	//    2    2:fload_3         
	//    3    3:fstore          4
		if(totalWidth <= 0.0F) goto _L2; else goto _L1
	//    4    5:aload_0         
	//    5    6:getfield        #123 <Field float totalWidth>
	//    6    9:fconst_0        
	//    7   10:fcmpg           
	//    8   11:ifle            35
_L1:
		f1 = f;
	//    9   14:fload_3         
	//   10   15:fstore          4
		if(i < 0) goto _L2; else goto _L3
	//   11   17:iload_1         
	//   12   18:iflt            35
_L3:
		if(i < rows.size()) goto _L5; else goto _L4
	//   13   21:iload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #108 <Field ArrayList rows>
	//   16   26:invokevirtual   #205 <Method int ArrayList.size()>
	//   17   29:icmplt          38
_L4:
		f1 = f;
	//   18   32:fload_3         
	//   19   33:fstore          4
_L2:
		return f1;
	//   20   35:fload           4
	//   21   37:freturn         
_L5:
		Object obj = ((Object) ((PdfPRow)rows.get(i)));
	//   22   38:aload_0         
	//   23   39:getfield        #108 <Field ArrayList rows>
	//   24   42:iload_1         
	//   25   43:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   26   46:checkcast       #211 <Class PdfPRow>
	//   27   49:astore          5
		f1 = f;
	//   28   51:fload_3         
	//   29   52:fstore          4
		if(obj == null)
			continue;
	//   30   54:aload           5
	//   31   56:ifnull          35
		f1 = f;
	//   32   59:fload_3         
	//   33   60:fstore          4
		if(j >= ((PdfPRow) (obj)).getCells().length)
			continue;
	//   34   62:iload_2         
	//   35   63:aload           5
	//   36   65:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   37   68:arraylength     
	//   38   69:icmpge          35
		obj = ((Object) (((PdfPRow) (obj)).getCells()[j]));
	//   39   72:aload           5
	//   40   74:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   41   77:iload_2         
	//   42   78:aaload          
	//   43   79:astore          5
		f1 = f;
	//   44   81:fload_3         
	//   45   82:fstore          4
		if(obj == null)
			continue;
	//   46   84:aload           5
	//   47   86:ifnull          35
		f = 0.0F;
	//   48   89:fconst_0        
	//   49   90:fstore_3        
		j = 0;
	//   50   91:iconst_0        
	//   51   92:istore_2        
		do
		{
			f1 = f;
	//   52   93:fload_3         
	//   53   94:fstore          4
			if(j >= ((PdfPCell) (obj)).getRowspan())
				continue;
	//   54   96:iload_2         
	//   55   97:aload           5
	//   56   99:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//   57  102:icmpge          35
			f += getRowHeight(i + j);
	//   58  105:fload_3         
	//   59  106:aload_0         
	//   60  107:iload_1         
	//   61  108:iload_2         
	//   62  109:iadd            
	//   63  110:invokevirtual   #565 <Method float getRowHeight(int)>
	//   64  113:fadd            
	//   65  114:fstore_3        
			j++;
	//   66  115:iload_2         
	//   67  116:iconst_1        
	//   68  117:iadd            
	//   69  118:istore_2        
		} while(true);
	//   70  119:goto            93
		if(true) goto _L2; else goto _L6
_L6:
	}

	public int getRunDirection()
	{
		return runDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int runDirection>
	//    2    4:ireturn         
	}

	public float getSpacingAfter()
	{
		return spacingAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field float spacingAfter>
	//    2    4:freturn         
	}

	public float getSpacingBefore()
	{
		return spacingBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #403 <Field float spacingBefore>
	//    2    4:freturn         
	}

	public String getSummary()
	{
		return getAccessibleAttribute(PdfName.SUMMARY).toString();
	//    0    0:aload_0         
	//    1    1:getstatic       #584 <Field PdfName PdfName.SUMMARY>
	//    2    4:invokevirtual   #586 <Method PdfObject getAccessibleAttribute(PdfName)>
	//    3    7:invokevirtual   #589 <Method String PdfObject.toString()>
	//    4   10:areturn         
	}

	public PdfPTableEvent getTableEvent()
	{
		return tableEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #399 <Field PdfPTableEvent tableEvent>
	//    2    4:areturn         
	}

	public float getTotalHeight()
	{
		return totalHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field float totalHeight>
	//    2    4:freturn         
	}

	public float getTotalWidth()
	{
		return totalWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field float totalWidth>
	//    2    4:freturn         
	}

	public float getWidthPercentage()
	{
		return widthPercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field float widthPercentage>
	//    2    4:freturn         
	}

	public boolean hasRowspan(int i)
	{
		if(i >= rows.size() || !getRow(i).hasRowspan()) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field ArrayList rows>
	//    3    5:invokevirtual   #205 <Method int ArrayList.size()>
	//    4    8:icmpge          24
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//    8   16:invokevirtual   #597 <Method boolean PdfPRow.hasRowspan()>
	//    9   19:ifeq            24
_L1:
		return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
_L2:
		PdfPRow pdfprow;
		if(i > 0)
	//*  12   24:iload_1         
	//*  13   25:ifle            75
			pdfprow = getRow(i - 1);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//   19   35:astore_3        
		else
	//*  20   36:aload_3         
	//*  21   37:ifnull          47
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #597 <Method boolean PdfPRow.hasRowspan()>
	//*  24   44:ifne            22
	//*  25   47:iconst_0        
	//*  26   48:istore_2        
	//*  27   49:iload_2         
	//*  28   50:aload_0         
	//*  29   51:invokevirtual   #335 <Method int getNumberOfColumns()>
	//*  30   54:icmpge          80
	//*  31   57:aload_0         
	//*  32   58:iload_1         
	//*  33   59:iconst_1        
	//*  34   60:isub            
	//*  35   61:iload_2         
	//*  36   62:invokevirtual   #302 <Method boolean rowSpanAbove(int, int)>
	//*  37   65:ifne            22
	//*  38   68:iload_2         
	//*  39   69:iconst_1        
	//*  40   70:iadd            
	//*  41   71:istore_2        
	//*  42   72:goto            49
			pdfprow = null;
	//   43   75:aconst_null     
	//   44   76:astore_3        
		if(pdfprow == null || !pdfprow.hasRowspan())
		{
			int j = 0;
label0:
			do
			{
label1:
				{
					if(j >= getNumberOfColumns())
						break label1;
					if(rowSpanAbove(i - 1, j))
						break label0;
					j++;
				}
			} while(true);
		}
		if(true) goto _L1; else goto _L3
	//*  45   77:goto            36
_L3:
		return false;
	//   46   80:iconst_0        
	//   47   81:ireturn         
	}

	public void init()
	{
		LOGGER.info("Initialize row and cell heights");
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Logger LOGGER>
	//    2    4:ldc2            #600 <String "Initialize row and cell heights">
	//    3    7:invokeinterface #495 <Method void Logger.info(String)>
		Iterator iterator = getRows().iterator();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #602 <Method ArrayList getRows()>
	//    6   16:invokevirtual   #606 <Method Iterator ArrayList.iterator()>
	//    7   19:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   20:aload_3         
	//    9   21:invokeinterface #611 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            96
			PdfPRow pdfprow = (PdfPRow)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #615 <Method Object Iterator.next()>
	//   13   35:checkcast       #211 <Class PdfPRow>
	//   14   38:astore          4
			if(pdfprow != null)
	//*  15   40:aload           4
	//*  16   42:ifnull          20
			{
				pdfprow.calculated = false;
	//   17   45:aload           4
	//   18   47:iconst_0        
	//   19   48:putfield        #618 <Field boolean PdfPRow.calculated>
				PdfPCell apdfpcell[] = pdfprow.getCells();
	//   20   51:aload           4
	//   21   53:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   22   56:astore          4
				int j = apdfpcell.length;
	//   23   58:aload           4
	//   24   60:arraylength     
	//   25   61:istore_2        
				int i = 0;
	//   26   62:iconst_0        
	//   27   63:istore_1        
				while(i < j) 
	//*  28   64:iload_1         
	//*  29   65:iload_2         
	//*  30   66:icmpge          20
				{
					PdfPCell pdfpcell = apdfpcell[i];
	//   31   69:aload           4
	//   32   71:iload_1         
	//   33   72:aaload          
	//   34   73:astore          5
					if(pdfpcell != null)
	//*  35   75:aload           5
	//*  36   77:ifnonnull       87
	//*  37   80:iload_1         
	//*  38   81:iconst_1        
	//*  39   82:iadd            
	//*  40   83:istore_1        
	//*  41   84:goto            64
						pdfpcell.setCalculatedHeight(0.0F);
	//   42   87:aload           5
	//   43   89:fconst_0        
	//   44   90:invokevirtual   #621 <Method void PdfPCell.setCalculatedHeight(float)>
					i++;
				}
			}
		} while(true);
	//   45   93:goto            80
	//   46   96:return          
	}

	public boolean isComplete()
	{
		return complete;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean complete>
	//    2    4:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isExtendLastRow()
	{
		return extendLastRow[0];
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field boolean[] extendLastRow>
	//    2    4:iconst_0        
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public boolean isExtendLastRow(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			return extendLastRow[0];
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field boolean[] extendLastRow>
	//    4    8:iconst_0        
	//    5    9:baload          
	//    6   10:ireturn         
		else
			return extendLastRow[1];
	//    7   11:aload_0         
	//    8   12:getfield        #142 <Field boolean[] extendLastRow>
	//    9   15:iconst_1        
	//   10   16:baload          
	//   11   17:ireturn         
	}

	public boolean isHeadersInEvent()
	{
		return headersInEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field boolean headersInEvent>
	//    2    4:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLockedWidth()
	{
		return lockedWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean lockedWidth>
	//    2    4:ireturn         
	}

	public boolean isLoopCheck()
	{
		return loopCheck;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field boolean loopCheck>
	//    2    4:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isSkipFirstHeader()
	{
		return skipFirstHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field boolean skipFirstHeader>
	//    2    4:ireturn         
	}

	public boolean isSkipLastFooter()
	{
		return skipLastFooter;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field boolean skipLastFooter>
	//    2    4:ireturn         
	}

	public boolean isSplitLate()
	{
		return splitLate;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field boolean splitLate>
	//    2    4:ireturn         
	}

	public boolean isSplitRows()
	{
		return splitRows;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean splitRows>
	//    2    4:ireturn         
	}

	public void keepRowsTogether(int i)
	{
		keepRowsTogether(i, rows.size());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #108 <Field ArrayList rows>
	//    4    6:invokevirtual   #205 <Method int ArrayList.size()>
	//    5    9:invokevirtual   #637 <Method void keepRowsTogether(int, int)>
	//    6   12:return          
	}

	public void keepRowsTogether(int i, int j)
	{
		if(i < j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          26
			for(; i < j; i++)
	//*   3    5:iload_1         
	//*   4    6:iload_2         
	//*   5    7:icmpge          26
				getRow(i).setMayNotBreak(true);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #640 <Method void PdfPRow.setMayNotBreak(boolean)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:istore_1        
	//*  15   23:goto            5
	//   16   26:return          
	}

	public void keepRowsTogether(int ai[])
	{
		for(int i = 0; i < ai.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          26
			getRow(ai[i]).setMayNotBreak(true);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:iaload          
	//   10   12:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//   11   15:iconst_1        
	//   12   16:invokevirtual   #640 <Method void PdfPRow.setMayNotBreak(boolean)>

	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:istore_2        
	//*  17   23:goto            2
	//   18   26:return          
	}

	public void normalizeHeadersFooters()
	{
		if(footerRows > headerRows)
	//*   0    0:aload_0         
	//*   1    1:getfield        #407 <Field int footerRows>
	//*   2    4:aload_0         
	//*   3    5:getfield        #405 <Field int headerRows>
	//*   4    8:icmple          19
			footerRows = headerRows;
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #405 <Field int headerRows>
	//    8   16:putfield        #407 <Field int footerRows>
	//    9   19:return          
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((com.itextpdf.text.Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #651 <Method boolean ElementListener.add(com.itextpdf.text.Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public void resetColumnCount(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            21
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero", new Object[0]));
	//    2    4:new             #175 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #177 <String "the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero">
	//    5   10:iconst_0        
	//    6   11:anewarray       Object[]
	//    7   14:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    8   17:invokespecial   #186 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		relativeWidths = new float[i];
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:newarray        float[]
	//   13   25:putfield        #188 <Field float[] relativeWidths>
		for(int j = 0; j < i; j++)
	//*  14   28:iconst_0        
	//*  15   29:istore_2        
	//*  16   30:iload_2         
	//*  17   31:iload_1         
	//*  18   32:icmpge          49
			relativeWidths[j] = 1.0F;
	//   19   35:aload_0         
	//   20   36:getfield        #188 <Field float[] relativeWidths>
	//   21   39:iload_2         
	//   22   40:fconst_1        
	//   23   41:fastore         

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            30
		absoluteWidths = new float[relativeWidths.length];
	//   29   49:aload_0         
	//   30   50:aload_0         
	//   31   51:getfield        #188 <Field float[] relativeWidths>
	//   32   54:arraylength     
	//   33   55:newarray        float[]
	//   34   57:putfield        #190 <Field float[] absoluteWidths>
		calculateWidths();
	//   35   60:aload_0         
	//   36   61:invokevirtual   #193 <Method void calculateWidths()>
		currentRow = new PdfPCell[absoluteWidths.length];
	//   37   64:aload_0         
	//   38   65:aload_0         
	//   39   66:getfield        #190 <Field float[] absoluteWidths>
	//   40   69:arraylength     
	//   41   70:anewarray       PdfPCell[]
	//   42   73:putfield        #195 <Field PdfPCell[] currentRow>
		totalHeight = 0.0F;
	//   43   76:aload_0         
	//   44   77:fconst_0        
	//   45   78:putfield        #110 <Field float totalHeight>
	//   46   81:return          
	}

	boolean rowSpanAbove(int i, int j)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(j < getNumberOfColumns() && j >= 0 && i >= 1) goto _L2; else goto _L1
	//    2    3:iload_2         
	//    3    4:aload_0         
	//    4    5:invokevirtual   #335 <Method int getNumberOfColumns()>
	//    5    8:icmpge          20
	//    6   11:iload_2         
	//    7   12:iflt            20
	//    8   15:iload_1         
	//    9   16:iconst_1        
	//   10   17:icmpge          22
_L1:
		int k;
		return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
	//*  13   22:iload_1         
	//*  14   23:iconst_1        
	//*  15   24:isub            
	//*  16   25:istore_3        
_L2:
		Object obj;
		if((PdfPRow)rows.get(k = i - 1) != null)
	//*  17   26:aload_0         
	//*  18   27:getfield        #108 <Field ArrayList rows>
	//*  19   30:iload_3         
	//*  20   31:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//*  21   34:checkcast       #211 <Class PdfPRow>
	//*  22   37:ifnull          20
		{
			obj = ((Object) (cellAt(k, j)));
	//   23   40:aload_0         
	//   24   41:iload_3         
	//   25   42:iload_2         
	//   26   43:invokevirtual   #654 <Method PdfPCell cellAt(int, int)>
	//   27   46:astore          6
label0:
			do
			{
label1:
				{
					if(obj != null || k <= 0)
						break label1;
	//   28   48:aload           6
	//   29   50:ifnonnull       90
	//   30   53:iload_3         
	//   31   54:ifle            90
					obj = ((Object) (rows));
	//   32   57:aload_0         
	//   33   58:getfield        #108 <Field ArrayList rows>
	//   34   61:astore          6
					k--;
	//   35   63:iload_3         
	//   36   64:iconst_1        
	//   37   65:isub            
	//   38   66:istore_3        
					if((PdfPRow)((ArrayList) (obj)).get(k) == null)
						break label0;
	//   39   67:aload           6
	//   40   69:iload_3         
	//   41   70:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   42   73:checkcast       #211 <Class PdfPRow>
	//   43   76:ifnull          20
					obj = ((Object) (cellAt(k, j)));
	//   44   79:aload_0         
	//   45   80:iload_3         
	//   46   81:iload_2         
	//   47   82:invokevirtual   #654 <Method PdfPCell cellAt(int, int)>
	//   48   85:astore          6
				}
			} while(true);
	//   49   87:goto            48
		}
		if(true) goto _L1; else goto _L3
_L3:
		int l = i - k;
	//   50   90:iload_1         
	//   51   91:iload_3         
	//   52   92:isub            
	//   53   93:istore          4
		Object obj2 = obj;
	//   54   95:aload           6
	//   55   97:astore          7
		i = l;
	//   56   99:iload           4
	//   57  101:istore_1        
		if(((PdfPCell) (obj)).getRowspan() == 1)
	//*  58  102:aload           6
	//*  59  104:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//*  60  107:iconst_1        
	//*  61  108:icmpne          198
		{
			obj2 = obj;
	//   62  111:aload           6
	//   63  113:astore          7
			i = l;
	//   64  115:iload           4
	//   65  117:istore_1        
			if(l > 1)
	//*  66  118:iload           4
	//*  67  120:iconst_1        
	//*  68  121:icmple          198
			{
				j--;
	//   69  124:iload_2         
	//   70  125:iconst_1        
	//   71  126:isub            
	//   72  127:istore_2        
				PdfPRow pdfprow = (PdfPRow)rows.get(k + 1);
	//   73  128:aload_0         
	//   74  129:getfield        #108 <Field ArrayList rows>
	//   75  132:iload_3         
	//   76  133:iconst_1        
	//   77  134:iadd            
	//   78  135:invokevirtual   #209 <Method Object ArrayList.get(int)>
	//   79  138:checkcast       #211 <Class PdfPRow>
	//   80  141:astore          8
				k = l - 1;
	//   81  143:iload           4
	//   82  145:iconst_1        
	//   83  146:isub            
	//   84  147:istore_3        
				Object obj1 = ((Object) (pdfprow.getCells()[j]));
	//   85  148:aload           8
	//   86  150:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//   87  153:iload_2         
	//   88  154:aaload          
	//   89  155:astore          6
				do
				{
					obj2 = obj1;
	//   90  157:aload           6
	//   91  159:astore          7
					i = k;
	//   92  161:iload_3         
	//   93  162:istore_1        
					if(obj1 != null)
						break;
	//   94  163:aload           6
	//   95  165:ifnonnull       198
					obj2 = obj1;
	//   96  168:aload           6
	//   97  170:astore          7
					i = k;
	//   98  172:iload_3         
	//   99  173:istore_1        
					if(j <= 0)
						break;
	//  100  174:iload_2         
	//  101  175:ifle            198
					obj1 = ((Object) (pdfprow.getCells()));
	//  102  178:aload           8
	//  103  180:invokevirtual   #378 <Method PdfPCell[] PdfPRow.getCells()>
	//  104  183:astore          6
					j--;
	//  105  185:iload_2         
	//  106  186:iconst_1        
	//  107  187:isub            
	//  108  188:istore_2        
					obj1 = ((Object) (obj1[j]));
	//  109  189:aload           6
	//  110  191:iload_2         
	//  111  192:aaload          
	//  112  193:astore          6
				} while(true);
	//  113  195:goto            157
			}
		}
		if(obj2 == null || ((PdfPCell) (obj2)).getRowspan() <= i)
	//* 114  198:aload           7
	//* 115  200:ifnull          215
	//* 116  203:aload           7
	//* 117  205:invokevirtual   #381 <Method int PdfPCell.getRowspan()>
	//* 118  208:iload_1         
	//* 119  209:icmple          215
	//* 120  212:iload           5
	//* 121  214:ireturn         
			flag = false;
	//  122  215:iconst_0        
	//  123  216:istore          5
		return flag;
	//* 124  218:goto            212
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #411 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #500 <Method void HashMap()>
	//    7   15:putfield        #161 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #161 <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #657 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public transient void setBreakPoints(int ai[])
	{
		keepRowsTogether(0, rows.size());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #108 <Field ArrayList rows>
	//    4    6:invokevirtual   #205 <Method int ArrayList.size()>
	//    5    9:invokevirtual   #637 <Method void keepRowsTogether(int, int)>
		for(int i = 0; i < ai.length; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmpge          38
			getRow(ai[i]).setMayNotBreak(false);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:iaload          
	//   16   24:invokevirtual   #371 <Method PdfPRow getRow(int)>
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #640 <Method void PdfPRow.setMayNotBreak(boolean)>

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            14
	//   24   38:return          
	}

	public void setComplete(boolean flag)
	{
		complete = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field boolean complete>
	//    3    5:return          
	}

	public void setExtendLastRow(boolean flag)
	{
		extendLastRow[0] = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field boolean[] extendLastRow>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:bastore         
		extendLastRow[1] = flag;
	//    5    7:aload_0         
	//    6    8:getfield        #142 <Field boolean[] extendLastRow>
	//    7   11:iconst_1        
	//    8   12:iload_1         
	//    9   13:bastore         
	//   10   14:return          
	}

	public void setExtendLastRow(boolean flag, boolean flag1)
	{
		extendLastRow[0] = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field boolean[] extendLastRow>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:bastore         
		extendLastRow[1] = flag1;
	//    5    7:aload_0         
	//    6    8:getfield        #142 <Field boolean[] extendLastRow>
	//    7   11:iconst_1        
	//    8   12:iload_2         
	//    9   13:bastore         
	//   10   14:return          
	}

	public void setFooterRows(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		footerRows = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #407 <Field int footerRows>
	//    9   13:return          
	}

	public void setHeaderRows(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		headerRows = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #405 <Field int headerRows>
	//    9   13:return          
	}

	public void setHeadersInEvent(boolean flag)
	{
		headersInEvent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #409 <Field boolean headersInEvent>
	//    3    5:return          
	}

	public void setHorizontalAlignment(int i)
	{
		horizontalAlignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int horizontalAlignment>
	//    3    5:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setKeepTogether(boolean flag)
	{
		keepTogether = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #197 <Field boolean keepTogether>
	//    3    5:return          
	}

	public void setLockedWidth(boolean flag)
	{
		lockedWidth = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field boolean lockedWidth>
	//    3    5:return          
	}

	public void setLoopCheck(boolean flag)
	{
		loopCheck = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #150 <Field boolean loopCheck>
	//    3    5:return          
	}

	public void setPaddingTop(float f)
	{
		paddingTop = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #559 <Field float paddingTop>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field PdfName role>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 47
	//	               1 47
	//	               2 47
	//	               3 47
		default:
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.run.direction.1", i));
	//    2   32:new             #675 <Class RuntimeException>
	//    3   35:dup             
	//    4   36:ldc2            #677 <String "invalid.run.direction.1">
	//    5   39:iload_1         
	//    6   40:invokestatic    #680 <Method String MessageLocalization.getComposedMessage(String, int)>
	//    7   43:invokespecial   #681 <Method void RuntimeException(String)>
	//    8   46:athrow          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			runDirection = i;
	//    9   47:aload_0         
	//   10   48:iload_1         
	//   11   49:putfield        #136 <Field int runDirection>
			break;
		}
	//   12   52:return          
	}

	public void setSkipFirstHeader(boolean flag)
	{
		skipFirstHeader = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field boolean skipFirstHeader>
	//    3    5:return          
	}

	public void setSkipLastFooter(boolean flag)
	{
		skipLastFooter = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field boolean skipLastFooter>
	//    3    5:return          
	}

	public void setSpacingAfter(float f)
	{
		spacingAfter = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #401 <Field float spacingAfter>
	//    3    5:return          
	}

	public void setSpacingBefore(float f)
	{
		spacingBefore = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #403 <Field float spacingBefore>
	//    3    5:return          
	}

	public void setSplitLate(boolean flag)
	{
		splitLate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field boolean splitLate>
	//    3    5:return          
	}

	public void setSplitRows(boolean flag)
	{
		splitRows = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field boolean splitRows>
	//    3    5:return          
	}

	public void setSummary(String s)
	{
		setAccessibleAttribute(PdfName.SUMMARY, ((PdfObject) (new PdfString(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #584 <Field PdfName PdfName.SUMMARY>
	//    2    4:new             #689 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #690 <Method void PdfString(String)>
	//    6   12:invokevirtual   #692 <Method void setAccessibleAttribute(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setTableEvent(PdfPTableEvent pdfptableevent)
	{
		if(pdfptableevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			tableEvent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #399 <Field PdfPTableEvent tableEvent>
			return;
	//    5    9:return          
		}
		if(tableEvent == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #399 <Field PdfPTableEvent tableEvent>
	//*   8   14:ifnonnull       23
		{
			tableEvent = pdfptableevent;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #399 <Field PdfPTableEvent tableEvent>
			return;
	//   12   22:return          
		}
		if(tableEvent instanceof PdfPTableEventForwarder)
	//*  13   23:aload_0         
	//*  14   24:getfield        #399 <Field PdfPTableEvent tableEvent>
	//*  15   27:instanceof      #696 <Class PdfPTableEventForwarder>
	//*  16   30:ifeq            45
		{
			((PdfPTableEventForwarder)tableEvent).addTableEvent(pdfptableevent);
	//   17   33:aload_0         
	//   18   34:getfield        #399 <Field PdfPTableEvent tableEvent>
	//   19   37:checkcast       #696 <Class PdfPTableEventForwarder>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #699 <Method void PdfPTableEventForwarder.addTableEvent(PdfPTableEvent)>
			return;
	//   22   44:return          
		} else
		{
			PdfPTableEventForwarder pdfptableeventforwarder = new PdfPTableEventForwarder();
	//   23   45:new             #696 <Class PdfPTableEventForwarder>
	//   24   48:dup             
	//   25   49:invokespecial   #700 <Method void PdfPTableEventForwarder()>
	//   26   52:astore_2        
			pdfptableeventforwarder.addTableEvent(tableEvent);
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #399 <Field PdfPTableEvent tableEvent>
	//   30   58:invokevirtual   #699 <Method void PdfPTableEventForwarder.addTableEvent(PdfPTableEvent)>
			pdfptableeventforwarder.addTableEvent(pdfptableevent);
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #699 <Method void PdfPTableEventForwarder.addTableEvent(PdfPTableEvent)>
			tableEvent = ((PdfPTableEvent) (pdfptableeventforwarder));
	//   34   66:aload_0         
	//   35   67:aload_2         
	//   36   68:putfield        #399 <Field PdfPTableEvent tableEvent>
			return;
	//   37   71:return          
		}
	}

	public void setTotalWidth(float f)
	{
		if(totalWidth == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field float totalWidth>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			totalWidth = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #123 <Field float totalWidth>
			totalHeight = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #110 <Field float totalHeight>
			calculateWidths();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #193 <Method void calculateWidths()>
			calculateHeights();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #703 <Method float calculateHeights()>
	//   16   28:pop             
			return;
	//   17   29:return          
		}
	}

	public void setTotalWidth(float af[])
		throws DocumentException
	{
		if(af.length != getNumberOfColumns())
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #335 <Method int getNumberOfColumns()>
	//*   4    6:icmpeq          27
			throw new DocumentException(MessageLocalization.getComposedMessage("wrong.number.of.columns", new Object[0]));
	//    5    9:new             #646 <Class DocumentException>
	//    6   12:dup             
	//    7   13:ldc2            #705 <String "wrong.number.of.columns">
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   23:invokespecial   #706 <Method void DocumentException(String)>
	//   12   26:athrow          
		totalWidth = 0.0F;
	//   13   27:aload_0         
	//   14   28:fconst_0        
	//   15   29:putfield        #123 <Field float totalWidth>
		for(int i = 0; i < af.length; i++)
	//*  16   32:iconst_0        
	//*  17   33:istore_2        
	//*  18   34:iload_2         
	//*  19   35:aload_1         
	//*  20   36:arraylength     
	//*  21   37:icmpge          59
			totalWidth = totalWidth + af[i];
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #123 <Field float totalWidth>
	//   25   45:aload_1         
	//   26   46:iload_2         
	//   27   47:faload          
	//   28   48:fadd            
	//   29   49:putfield        #123 <Field float totalWidth>

	//   30   52:iload_2         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:istore_2        
	//*  34   56:goto            34
		setWidths(af);
	//   35   59:aload_0         
	//   36   60:aload_1         
	//   37   61:invokevirtual   #708 <Method void setWidths(float[])>
	//   38   64:return          
	}

	public void setWidthPercentage(float f)
	{
		widthPercentage = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #126 <Field float widthPercentage>
	//    3    5:return          
	}

	public void setWidthPercentage(float af[], Rectangle rectangle)
		throws DocumentException
	{
		if(af.length != getNumberOfColumns())
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #335 <Method int getNumberOfColumns()>
	//*   4    6:icmpeq          27
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("wrong.number.of.columns", new Object[0]));
	//    5    9:new             #175 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #705 <String "wrong.number.of.columns">
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   23:invokespecial   #186 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		} else
		{
			setTotalWidth(af);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #713 <Method void setTotalWidth(float[])>
			widthPercentage = (totalWidth / (rectangle.getRight() - rectangle.getLeft())) * 100F;
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #123 <Field float totalWidth>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #718 <Method float Rectangle.getRight()>
	//   21   41:aload_2         
	//   22   42:invokevirtual   #721 <Method float Rectangle.getLeft()>
	//   23   45:fsub            
	//   24   46:fdiv            
	//   25   47:ldc2            #722 <Float 100F>
	//   26   50:fmul            
	//   27   51:putfield        #126 <Field float widthPercentage>
			return;
	//   28   54:return          
		}
	}

	public void setWidths(float af[])
		throws DocumentException
	{
		if(af.length != getNumberOfColumns())
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #335 <Method int getNumberOfColumns()>
	//*   4    6:icmpeq          27
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("wrong.number.of.columns", new Object[0]));
	//    5    9:new             #646 <Class DocumentException>
	//    6   12:dup             
	//    7   13:ldc2            #705 <String "wrong.number.of.columns">
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   23:invokespecial   #706 <Method void DocumentException(String)>
	//   12   26:athrow          
		} else
		{
			relativeWidths = new float[af.length];
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:arraylength     
	//   16   30:newarray        float[]
	//   17   32:putfield        #188 <Field float[] relativeWidths>
			System.arraycopy(((Object) (af)), 0, ((Object) (relativeWidths)), 0, af.length);
	//   18   35:aload_1         
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:getfield        #188 <Field float[] relativeWidths>
	//   22   41:iconst_0        
	//   23   42:aload_1         
	//   24   43:arraylength     
	//   25   44:invokestatic    #235 <Method void System.arraycopy(Object, int, Object, int, int)>
			absoluteWidths = new float[af.length];
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:arraylength     
	//   29   50:newarray        float[]
	//   30   52:putfield        #190 <Field float[] absoluteWidths>
			totalHeight = 0.0F;
	//   31   55:aload_0         
	//   32   56:fconst_0        
	//   33   57:putfield        #110 <Field float totalHeight>
			calculateWidths();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #193 <Method void calculateWidths()>
			calculateHeights();
	//   36   64:aload_0         
	//   37   65:invokevirtual   #703 <Method float calculateHeights()>
	//   38   68:pop             
			return;
	//   39   69:return          
		}
	}

	public void setWidths(int ai[])
		throws DocumentException
	{
		float af[] = new float[ai.length];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:newarray        float[]
	//    3    4:astore_3        
		for(int i = 0; i < ai.length; i++)
	//*   4    5:iconst_0        
	//*   5    6:istore_2        
	//*   6    7:iload_2         
	//*   7    8:aload_1         
	//*   8    9:arraylength     
	//*   9   10:icmpge          27
			af[i] = ai[i];
	//   10   13:aload_3         
	//   11   14:iload_2         
	//   12   15:aload_1         
	//   13   16:iload_2         
	//   14   17:iaload          
	//   15   18:i2f             
	//   16   19:fastore         

	//   17   20:iload_2         
	//   18   21:iconst_1        
	//   19   22:iadd            
	//   20   23:istore_2        
	//*  21   24:goto            7
		setWidths(af);
	//   22   27:aload_0         
	//   23   28:aload_3         
	//   24   29:invokevirtual   #708 <Method void setWidths(float[])>
	//   25   32:return          
	}

	public int size()
	{
		return rows.size();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList rows>
	//    2    4:invokevirtual   #205 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public float spacingAfter()
	{
		return spacingAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field float spacingAfter>
	//    2    4:freturn         
	}

	public float spacingBefore()
	{
		return spacingBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #403 <Field float spacingBefore>
	//    2    4:freturn         
	}

	public int type()
	{
		return 23;
	//    0    0:bipush          23
	//    1    2:ireturn         
	}

	public float writeSelectedRows(int i, int j, float f, float f1, PdfContentByte pdfcontentbyte)
	{
		return writeSelectedRows(0, -1, i, j, f, f1, pdfcontentbyte);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_m1       
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:fload_3         
	//    6    6:fload           4
	//    7    8:aload           5
	//    8   10:invokevirtual   #728 <Method float writeSelectedRows(int, int, int, int, float, float, PdfContentByte)>
	//    9   13:freturn         
	}

	public float writeSelectedRows(int i, int j, float f, float f1, PdfContentByte apdfcontentbyte[])
	{
		return writeSelectedRows(0, -1, i, j, f, f1, apdfcontentbyte);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_m1       
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:fload_3         
	//    6    6:fload           4
	//    7    8:aload           5
	//    8   10:invokevirtual   #732 <Method float writeSelectedRows(int, int, int, int, float, float, PdfContentByte[])>
	//    9   13:freturn         
	}

	public float writeSelectedRows(int i, int j, int k, int l, float f, float f1, PdfContentByte pdfcontentbyte)
	{
		return writeSelectedRows(i, j, k, l, f, f1, pdfcontentbyte, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:aload           7
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #735 <Method float writeSelectedRows(int, int, int, int, float, float, PdfContentByte, boolean)>
	//   10   16:freturn         
	}

	public float writeSelectedRows(int i, int j, int k, int l, float f, float f1, PdfContentByte pdfcontentbyte, 
			boolean flag)
	{
		int j1 = getNumberOfColumns();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #335 <Method int getNumberOfColumns()>
	//    2    4:istore          14
		boolean flag1;
		if(i < 0)
	//*   3    6:iload_1         
	//*   4    7:ifge            70
			i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_1        
		else
	//*   7   12:iload_2         
	//*   8   13:ifge            80
	//*   9   16:iload           14
	//*  10   18:istore_2        
	//*  11   19:iload_1         
	//*  12   20:ifne            29
	//*  13   23:iload_2         
	//*  14   24:iload           14
	//*  15   26:icmpeq          90
	//*  16   29:iconst_1        
	//*  17   30:istore          12
	//*  18   32:iload           12
	//*  19   34:ifeq            155
	//*  20   37:fconst_0        
	//*  21   38:fstore          9
	//*  22   40:iload_1         
	//*  23   41:istore          13
	//*  24   43:iload           13
	//*  25   45:iload_2         
	//*  26   46:icmpge          96
	//*  27   49:fload           9
	//*  28   51:aload_0         
	//*  29   52:getfield        #190 <Field float[] absoluteWidths>
	//*  30   55:iload           13
	//*  31   57:faload          
	//*  32   58:fadd            
	//*  33   59:fstore          9
	//*  34   61:iload           13
	//*  35   63:iconst_1        
	//*  36   64:iadd            
	//*  37   65:istore          13
	//*  38   67:goto            43
			i = Math.min(i, j1);
	//   39   70:iload_1         
	//   40   71:iload           14
	//   41   73:invokestatic    #321 <Method int Math.min(int, int)>
	//   42   76:istore_1        
		if(j < 0)
			j = j1;
		else
	//*  43   77:goto            12
			j = Math.min(j, j1);
	//   44   80:iload_2         
	//   45   81:iload           14
	//   46   83:invokestatic    #321 <Method int Math.min(int, int)>
	//   47   86:istore_2        
		if(i != 0 || j != j1)
			flag1 = true;
		else
	//*  48   87:goto            19
			flag1 = false;
	//   49   90:iconst_0        
	//   50   91:istore          12
		if(flag1)
		{
			float f2 = 0.0F;
			for(int i1 = i; i1 < j; i1++)
				f2 += absoluteWidths[i1];

	//*  51   93:goto            32
			pdfcontentbyte.saveState();
	//   52   96:aload           7
	//   53   98:invokevirtual   #281 <Method void PdfContentByte.saveState()>
			float f3;
			float f4;
			PdfContentByte apdfcontentbyte[];
			if(i == 0)
	//*  54  101:iload_1         
	//*  55  102:ifne            199
				f3 = 10000F;
	//   56  105:ldc2            #736 <Float 10000F>
	//   57  108:fstore          10
			else
	//*  58  110:iload_2         
	//*  59  111:iload           14
	//*  60  113:icmpne          205
	//*  61  116:ldc2            #736 <Float 10000F>
	//*  62  119:fstore          11
	//*  63  121:aload           7
	//*  64  123:fload           5
	//*  65  125:fload           10
	//*  66  127:fsub            
	//*  67  128:ldc2            #737 <Float -10000F>
	//*  68  131:fload           9
	//*  69  133:fload           10
	//*  70  135:fadd            
	//*  71  136:fload           11
	//*  72  138:fadd            
	//*  73  139:ldc2            #738 <Float 20000F>
	//*  74  142:invokevirtual   #742 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//*  75  145:aload           7
	//*  76  147:invokevirtual   #745 <Method void PdfContentByte.clip()>
	//*  77  150:aload           7
	//*  78  152:invokevirtual   #748 <Method void PdfContentByte.newPath()>
	//*  79  155:aload           7
	//*  80  157:invokestatic    #750 <Method PdfContentByte[] beginWritingRows(PdfContentByte)>
	//*  81  160:astore          15
	//*  82  162:aload_0         
	//*  83  163:iload_1         
	//*  84  164:iload_2         
	//*  85  165:iload_3         
	//*  86  166:iload           4
	//*  87  168:fload           5
	//*  88  170:fload           6
	//*  89  172:aload           15
	//*  90  174:iload           8
	//*  91  176:invokevirtual   #753 <Method float writeSelectedRows(int, int, int, int, float, float, PdfContentByte[], boolean)>
	//*  92  179:fstore          5
	//*  93  181:aload           15
	//*  94  183:invokestatic    #755 <Method void endWritingRows(PdfContentByte[])>
	//*  95  186:iload           12
	//*  96  188:ifeq            196
	//*  97  191:aload           7
	//*  98  193:invokevirtual   #287 <Method void PdfContentByte.restoreState()>
	//*  99  196:fload           5
	//* 100  198:freturn         
				f3 = 0.0F;
	//  101  199:fconst_0        
	//  102  200:fstore          10
			if(j == j1)
				f4 = 10000F;
			else
	//* 103  202:goto            110
				f4 = 0.0F;
	//  104  205:fconst_0        
	//  105  206:fstore          11
			pdfcontentbyte.rectangle(f - f3, -10000F, f2 + f3 + f4, 20000F);
			pdfcontentbyte.clip();
			pdfcontentbyte.newPath();
		}
		apdfcontentbyte = beginWritingRows(pdfcontentbyte);
		f = writeSelectedRows(i, j, k, l, f, f1, apdfcontentbyte, flag);
		endWritingRows(apdfcontentbyte);
		if(flag1)
			pdfcontentbyte.restoreState();
		return f;
	//* 106  208:goto            121
	}

	public float writeSelectedRows(int i, int j, int k, int l, float f, float f1, PdfContentByte apdfcontentbyte[])
	{
		return writeSelectedRows(i, j, k, l, f, f1, apdfcontentbyte, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:aload           7
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #753 <Method float writeSelectedRows(int, int, int, int, float, float, PdfContentByte[], boolean)>
	//   10   16:freturn         
	}

	public float writeSelectedRows(int i, int j, int k, int l, float f, float f1, PdfContentByte apdfcontentbyte[], 
			boolean flag)
	{
		float f3;
		int i1;
		int j1;
		PdfPTableBody pdfptablebody;
		PdfPTableBody pdfptablebody1;
		ArrayList arraylist;
		PdfPRow pdfprow1;
		if(totalWidth <= 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field float totalWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifgt            27
			throw new RuntimeException(MessageLocalization.getComposedMessage("the.table.width.must.be.greater.than.zero", new Object[0]));
	//    5    9:new             #675 <Class RuntimeException>
	//    6   12:dup             
	//    7   13:ldc2            #757 <String "the.table.width.must.be.greater.than.zero">
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:invokestatic    #183 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   23:invokespecial   #681 <Method void RuntimeException(String)>
	//   12   26:athrow          
		j1 = rows.size();
	//   13   27:aload_0         
	//   14   28:getfield        #108 <Field ArrayList rows>
	//   15   31:invokevirtual   #205 <Method int ArrayList.size()>
	//   16   34:istore          12
		i1 = k;
	//   17   36:iload_3         
	//   18   37:istore          11
		if(k < 0)
	//*  19   39:iload_3         
	//*  20   40:ifge            46
			i1 = 0;
	//   21   43:iconst_0        
	//   22   44:istore          11
		if(l < 0)
	//*  23   46:iload           4
	//*  24   48:ifge            63
			k = j1;
	//   25   51:iload           12
	//   26   53:istore_3        
		else
	//*  27   54:iload           11
	//*  28   56:iload_3         
	//*  29   57:icmplt          74
	//*  30   60:fload           6
	//*  31   62:freturn         
			k = Math.min(l, j1);
	//   32   63:iload           4
	//   33   65:iload           12
	//   34   67:invokestatic    #321 <Method int Math.min(int, int)>
	//   35   70:istore_3        
		if(i1 >= k)
			return f1;
	//*  36   71:goto            54
		j1 = getNumberOfColumns();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #335 <Method int getNumberOfColumns()>
	//   39   78:istore          12
		float f2;
		Iterator iterator;
		if(i < 0)
	//*  40   80:iload_1         
	//*  41   81:ifge            371
			i = 0;
	//   42   84:iconst_0        
	//   43   85:istore_1        
		else
	//*  44   86:iload_2         
	//*  45   87:ifge            381
	//*  46   90:iload           12
	//*  47   92:istore_2        
	//*  48   93:aload_0         
	//*  49   94:getfield        #103 <Field Logger LOGGER>
	//*  50   97:ldc2            #759 <String "Writing row %s to %s; column %s to %s">
	//*  51  100:iconst_4        
	//*  52  101:anewarray       Object[]
	//*  53  104:dup             
	//*  54  105:iconst_0        
	//*  55  106:iload           11
	//*  56  108:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//*  57  111:aastore         
	//*  58  112:dup             
	//*  59  113:iconst_1        
	//*  60  114:iload_3         
	//*  61  115:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//*  62  118:aastore         
	//*  63  119:dup             
	//*  64  120:iconst_2        
	//*  65  121:iload_1         
	//*  66  122:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//*  67  125:aastore         
	//*  68  126:dup             
	//*  69  127:iconst_3        
	//*  70  128:iload_2         
	//*  71  129:invokestatic    #485 <Method Integer Integer.valueOf(int)>
	//*  72  132:aastore         
	//*  73  133:invokestatic    #490 <Method String String.format(String, Object[])>
	//*  74  136:invokeinterface #495 <Method void Logger.info(String)>
	//*  75  141:aconst_null     
	//*  76  142:astore          14
	//*  77  144:aload_0         
	//*  78  145:getfield        #152 <Field boolean rowsNotChecked>
	//*  79  148:ifeq            161
	//*  80  151:aload_0         
	//*  81  152:ldc2            #760 <Float 3.402823E+38F>
	//*  82  155:iload           11
	//*  83  157:invokevirtual   #762 <Method PdfPTable$FittingRows getFittingRows(float, int)>
	//*  84  160:pop             
	//*  85  161:aload_0         
	//*  86  162:iload           11
	//*  87  164:iload_3         
	//*  88  165:invokevirtual   #764 <Method ArrayList getRows(int, int)>
	//*  89  168:astore          15
	//*  90  170:iload           11
	//*  91  172:istore          4
	//*  92  174:aload           15
	//*  93  176:invokeinterface #765 <Method Iterator List.iterator()>
	//*  94  181:astore          16
	//*  95  183:fload           6
	//*  96  185:fstore          9
	//*  97  187:fload           9
	//*  98  189:fstore          10
	//*  99  191:aload           16
	//* 100  193:invokeinterface #611 <Method boolean Iterator.hasNext()>
	//* 101  198:ifeq            657
	//* 102  201:aload           16
	//* 103  203:invokeinterface #615 <Method Object Iterator.next()>
	//* 104  208:checkcast       #211 <Class PdfPRow>
	//* 105  211:astore          17
	//* 106  213:aload_0         
	//* 107  214:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 108  217:getfield        #766 <Field ArrayList PdfPTableHeader.rows>
	//* 109  220:ifnull          391
	//* 110  223:aload_0         
	//* 111  224:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 112  227:getfield        #766 <Field ArrayList PdfPTableHeader.rows>
	//* 113  230:aload           17
	//* 114  232:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 115  235:ifeq            391
	//* 116  238:aload           14
	//* 117  240:ifnonnull       391
	//* 118  243:aload_0         
	//* 119  244:aload_0         
	//* 120  245:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 121  248:aload           7
	//* 122  250:iconst_3        
	//* 123  251:aaload          
	//* 124  252:invokespecial   #769 <Method PdfPTableBody openTableBlock(PdfPTableBody, PdfContentByte)>
	//* 125  255:astore          13
	//* 126  257:fload           10
	//* 127  259:fstore          9
	//* 128  261:aload           17
	//* 129  263:ifnull          291
	//* 130  266:aload           17
	//* 131  268:iload_1         
	//* 132  269:iload_2         
	//* 133  270:fload           5
	//* 134  272:fload           10
	//* 135  274:aload           7
	//* 136  276:iload           8
	//* 137  278:invokevirtual   #773 <Method void PdfPRow.writeCells(int, int, float, float, PdfContentByte[], boolean)>
	//* 138  281:fload           10
	//* 139  283:aload           17
	//* 140  285:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//* 141  288:fsub            
	//* 142  289:fstore          9
	//* 143  291:aload_0         
	//* 144  292:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 145  295:getfield        #766 <Field ArrayList PdfPTableHeader.rows>
	//* 146  298:ifnull          497
	//* 147  301:aload_0         
	//* 148  302:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 149  305:getfield        #766 <Field ArrayList PdfPTableHeader.rows>
	//* 150  308:aload           17
	//* 151  310:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 152  313:ifeq            497
	//* 153  316:iload           4
	//* 154  318:iload_3         
	//* 155  319:iconst_1        
	//* 156  320:isub            
	//* 157  321:icmpeq          348
	//* 158  324:aload_0         
	//* 159  325:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 160  328:getfield        #766 <Field ArrayList PdfPTableHeader.rows>
	//* 161  331:aload           15
	//* 162  333:iload           4
	//* 163  335:iconst_1        
	//* 164  336:iadd            
	//* 165  337:invokeinterface #774 <Method Object List.get(int)>
	//* 166  342:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 167  345:ifne            497
	//* 168  348:aload_0         
	//* 169  349:aload_0         
	//* 170  350:invokevirtual   #418 <Method PdfPTableHeader getHeader()>
	//* 171  353:aload           7
	//* 172  355:iconst_3        
	//* 173  356:aaload          
	//* 174  357:invokespecial   #776 <Method PdfPTableBody closeTableBlock(PdfPTableBody, PdfContentByte)>
	//* 175  360:astore          14
	//* 176  362:iload           4
	//* 177  364:iconst_1        
	//* 178  365:iadd            
	//* 179  366:istore          4
	//* 180  368:goto            187
			i = Math.min(i, j1);
	//  181  371:iload_1         
	//  182  372:iload           12
	//  183  374:invokestatic    #321 <Method int Math.min(int, int)>
	//  184  377:istore_1        
		if(j < 0)
			j = j1;
		else
	//* 185  378:goto            86
			j = Math.min(j, j1);
	//  186  381:iload_2         
	//  187  382:iload           12
	//  188  384:invokestatic    #321 <Method int Math.min(int, int)>
	//  189  387:istore_2        
		LOGGER.info(String.format("Writing row %s to %s; column %s to %s", new Object[] {
			Integer.valueOf(i1), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j)
		}));
		pdfptablebody1 = null;
		if(rowsNotChecked)
			getFittingRows(3.402823E+38F, i1);
		arraylist = getRows(i1, k);
		l = i1;
		iterator = ((List) (arraylist)).iterator();
		f2 = f1;
_L7:
		f3 = f2;
		if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
		pdfprow1 = (PdfPRow)iterator.next();
		if(getHeader().rows != null && getHeader().rows.contains(((Object) (pdfprow1))) && pdfptablebody1 == null)
			pdfptablebody = openTableBlock(((PdfPTableBody) (getHeader())), apdfcontentbyte[3]);
		else
	//* 190  388:goto            93
		if(getBody().rows != null && getBody().rows.contains(((Object) (pdfprow1))) && pdfptablebody1 == null)
	//* 191  391:aload_0         
	//* 192  392:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 193  395:getfield        #777 <Field ArrayList PdfPTableBody.rows>
	//* 194  398:ifnull          438
	//* 195  401:aload_0         
	//* 196  402:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 197  405:getfield        #777 <Field ArrayList PdfPTableBody.rows>
	//* 198  408:aload           17
	//* 199  410:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 200  413:ifeq            438
	//* 201  416:aload           14
	//* 202  418:ifnonnull       438
		{
			pdfptablebody = openTableBlock(getBody(), apdfcontentbyte[3]);
	//  203  421:aload_0         
	//  204  422:aload_0         
	//  205  423:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//  206  426:aload           7
	//  207  428:iconst_3        
	//  208  429:aaload          
	//  209  430:invokespecial   #769 <Method PdfPTableBody openTableBlock(PdfPTableBody, PdfContentByte)>
	//  210  433:astore          13
		} else
	//* 211  435:goto            257
		{
			pdfptablebody = pdfptablebody1;
	//  212  438:aload           14
	//  213  440:astore          13
			if(getFooter().rows != null)
	//* 214  442:aload_0         
	//* 215  443:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//* 216  446:getfield        #778 <Field ArrayList PdfPTableFooter.rows>
	//* 217  449:ifnull          257
			{
				pdfptablebody = pdfptablebody1;
	//  218  452:aload           14
	//  219  454:astore          13
				if(getFooter().rows.contains(((Object) (pdfprow1))))
	//* 220  456:aload_0         
	//* 221  457:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//* 222  460:getfield        #778 <Field ArrayList PdfPTableFooter.rows>
	//* 223  463:aload           17
	//* 224  465:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 225  468:ifeq            257
				{
					pdfptablebody = pdfptablebody1;
	//  226  471:aload           14
	//  227  473:astore          13
					if(pdfptablebody1 == null)
	//* 228  475:aload           14
	//* 229  477:ifnonnull       257
						pdfptablebody = openTableBlock(((PdfPTableBody) (getFooter())), apdfcontentbyte[3]);
	//  230  480:aload_0         
	//  231  481:aload_0         
	//  232  482:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//  233  485:aload           7
	//  234  487:iconst_3        
	//  235  488:aaload          
	//  236  489:invokespecial   #769 <Method PdfPTableBody openTableBlock(PdfPTableBody, PdfContentByte)>
	//  237  492:astore          13
				}
			}
		}
		f2 = f3;
		if(pdfprow1 != null)
		{
			pdfprow1.writeCells(i, j, f, f3, apdfcontentbyte, flag);
			f2 = f3 - pdfprow1.getMaxHeights();
		}
		if(getHeader().rows == null || !getHeader().rows.contains(((Object) (pdfprow1))) || l != k - 1 && getHeader().rows.contains(((List) (arraylist)).get(l + 1))) goto _L4; else goto _L3
_L3:
		pdfptablebody1 = closeTableBlock(((PdfPTableBody) (getHeader())), apdfcontentbyte[3]);
_L5:
		l++;
		continue; /* Loop/switch isn't completed */
	//* 238  494:goto            257
_L4:
		if(getBody().rows != null && getBody().rows.contains(((Object) (pdfprow1))) && (l == k - 1 || !getBody().rows.contains(((List) (arraylist)).get(l + 1))))
	//* 239  497:aload_0         
	//* 240  498:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 241  501:getfield        #777 <Field ArrayList PdfPTableBody.rows>
	//* 242  504:ifnull          571
	//* 243  507:aload_0         
	//* 244  508:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 245  511:getfield        #777 <Field ArrayList PdfPTableBody.rows>
	//* 246  514:aload           17
	//* 247  516:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 248  519:ifeq            571
	//* 249  522:iload           4
	//* 250  524:iload_3         
	//* 251  525:iconst_1        
	//* 252  526:isub            
	//* 253  527:icmpeq          554
	//* 254  530:aload_0         
	//* 255  531:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//* 256  534:getfield        #777 <Field ArrayList PdfPTableBody.rows>
	//* 257  537:aload           15
	//* 258  539:iload           4
	//* 259  541:iconst_1        
	//* 260  542:iadd            
	//* 261  543:invokeinterface #774 <Method Object List.get(int)>
	//* 262  548:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//* 263  551:ifne            571
		{
			pdfptablebody1 = closeTableBlock(getBody(), apdfcontentbyte[3]);
	//  264  554:aload_0         
	//  265  555:aload_0         
	//  266  556:invokevirtual   #422 <Method PdfPTableBody getBody()>
	//  267  559:aload           7
	//  268  561:iconst_3        
	//  269  562:aaload          
	//  270  563:invokespecial   #776 <Method PdfPTableBody closeTableBlock(PdfPTableBody, PdfContentByte)>
	//  271  566:astore          14
			continue; /* Loop/switch isn't completed */
	//  272  568:goto            362
		}
		pdfptablebody1 = pdfptablebody;
	//  273  571:aload           13
	//  274  573:astore          14
		if(getFooter().rows == null)
			continue; /* Loop/switch isn't completed */
	//  275  575:aload_0         
	//  276  576:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//  277  579:getfield        #778 <Field ArrayList PdfPTableFooter.rows>
	//  278  582:ifnull          362
		pdfptablebody1 = pdfptablebody;
	//  279  585:aload           13
	//  280  587:astore          14
		if(!getFooter().rows.contains(((Object) (pdfprow1))))
			continue; /* Loop/switch isn't completed */
	//  281  589:aload_0         
	//  282  590:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//  283  593:getfield        #778 <Field ArrayList PdfPTableFooter.rows>
	//  284  596:aload           17
	//  285  598:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//  286  601:ifeq            362
		if(l != k - 1)
	//* 287  604:iload           4
	//* 288  606:iload_3         
	//* 289  607:iconst_1        
	//* 290  608:isub            
	//* 291  609:icmpeq          640
		{
			pdfptablebody1 = pdfptablebody;
	//  292  612:aload           13
	//  293  614:astore          14
			if(getFooter().rows.contains(((List) (arraylist)).get(l + 1)))
				continue; /* Loop/switch isn't completed */
	//  294  616:aload_0         
	//  295  617:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//  296  620:getfield        #778 <Field ArrayList PdfPTableFooter.rows>
	//  297  623:aload           15
	//  298  625:iload           4
	//  299  627:iconst_1        
	//  300  628:iadd            
	//  301  629:invokeinterface #774 <Method Object List.get(int)>
	//  302  634:invokevirtual   #767 <Method boolean ArrayList.contains(Object)>
	//  303  637:ifne            362
		}
		pdfptablebody1 = closeTableBlock(((PdfPTableBody) (getFooter())), apdfcontentbyte[3]);
	//  304  640:aload_0         
	//  305  641:aload_0         
	//  306  642:invokevirtual   #426 <Method PdfPTableFooter getFooter()>
	//  307  645:aload           7
	//  308  647:iconst_3        
	//  309  648:aaload          
	//  310  649:invokespecial   #776 <Method PdfPTableBody closeTableBlock(PdfPTableBody, PdfContentByte)>
	//  311  652:astore          14
		if(true) goto _L5; else goto _L2
	//  312  654:goto            362
_L2:
		if(tableEvent != null && i == 0 && j == j1)
	//* 313  657:aload_0         
	//* 314  658:getfield        #399 <Field PdfPTableEvent tableEvent>
	//* 315  661:ifnull          802
	//* 316  664:iload_1         
	//* 317  665:ifne            802
	//* 318  668:iload_2         
	//* 319  669:iload           12
	//* 320  671:icmpne          802
		{
			float af[] = new float[(k - i1) + 1];
	//  321  674:iload_3         
	//  322  675:iload           11
	//  323  677:isub            
	//  324  678:iconst_1        
	//  325  679:iadd            
	//  326  680:newarray        float[]
	//  327  682:astore          13
			af[0] = f1;
	//  328  684:aload           13
	//  329  686:iconst_0        
	//  330  687:fload           6
	//  331  689:fastore         
			for(i = i1; i < k; i++)
	//* 332  690:iload           11
	//* 333  692:istore_1        
	//* 334  693:iload_1         
	//* 335  694:iload_3         
	//* 336  695:icmpge          752
			{
				PdfPRow pdfprow = (PdfPRow)((List) (arraylist)).get(i);
	//  337  698:aload           15
	//  338  700:iload_1         
	//  339  701:invokeinterface #774 <Method Object List.get(int)>
	//  340  706:checkcast       #211 <Class PdfPRow>
	//  341  709:astore          14
				f1 = 0.0F;
	//  342  711:fconst_0        
	//  343  712:fstore          6
				if(pdfprow != null)
	//* 344  714:aload           14
	//* 345  716:ifnull          726
					f1 = pdfprow.getMaxHeights();
	//  346  719:aload           14
	//  347  721:invokevirtual   #346 <Method float PdfPRow.getMaxHeights()>
	//  348  724:fstore          6
				af[(i - i1) + 1] = af[i - i1] - f1;
	//  349  726:aload           13
	//  350  728:iload_1         
	//  351  729:iload           11
	//  352  731:isub            
	//  353  732:iconst_1        
	//  354  733:iadd            
	//  355  734:aload           13
	//  356  736:iload_1         
	//  357  737:iload           11
	//  358  739:isub            
	//  359  740:faload          
	//  360  741:fload           6
	//  361  743:fsub            
	//  362  744:fastore         
			}

	//  363  745:iload_1         
	//  364  746:iconst_1        
	//  365  747:iadd            
	//  366  748:istore_1        
	//* 367  749:goto            693
			PdfPTableEvent pdfptableevent = tableEvent;
	//  368  752:aload_0         
	//  369  753:getfield        #399 <Field PdfPTableEvent tableEvent>
	//  370  756:astore          14
			float af1[][] = getEventWidths(f, i1, k, headersInEvent);
	//  371  758:aload_0         
	//  372  759:fload           5
	//  373  761:iload           11
	//  374  763:iload_3         
	//  375  764:aload_0         
	//  376  765:getfield        #409 <Field boolean headersInEvent>
	//  377  768:invokevirtual   #780 <Method float[][] getEventWidths(float, int, int, boolean)>
	//  378  771:astore          15
			if(headersInEvent)
	//* 379  773:aload_0         
	//* 380  774:getfield        #409 <Field boolean headersInEvent>
	//* 381  777:ifeq            805
				i = headerRows;
	//  382  780:aload_0         
	//  383  781:getfield        #405 <Field int headerRows>
	//  384  784:istore_1        
			else
	//* 385  785:aload           14
	//* 386  787:aload_0         
	//* 387  788:aload           15
	//* 388  790:aload           13
	//* 389  792:iload_1         
	//* 390  793:iload           11
	//* 391  795:aload           7
	//* 392  797:invokeinterface #786 <Method void PdfPTableEvent.tableLayout(PdfPTable, float[][], float[], int, int, PdfContentByte[])>
	//* 393  802:fload           10
	//* 394  804:freturn         
				i = 0;
	//  395  805:iconst_0        
	//  396  806:istore_1        
			pdfptableevent.tableLayout(this, af1, af, i, i1, apdfcontentbyte);
		}
		return f3;
		if(true) goto _L7; else goto _L6
	//  397  807:goto            785
_L6:
	}

	static final boolean $assertionsDisabled;
	public static final int BACKGROUNDCANVAS = 1;
	public static final int BASECANVAS = 0;
	public static final int LINECANVAS = 2;
	public static final int TEXTCANVAS = 3;
	private final Logger LOGGER;
	protected float absoluteWidths[];
	protected HashMap accessibleAttributes;
	private PdfPTableBody body;
	protected boolean complete;
	protected int currentColIdx;
	protected PdfPCell currentRow[];
	protected PdfPCell defaultCell;
	private boolean extendLastRow[] = {
		0, 0
	};
	private PdfPTableFooter footer;
	private int footerRows;
	private PdfPTableHeader header;
	protected int headerRows;
	private boolean headersInEvent;
	private int horizontalAlignment;
	protected AccessibleElementId id;
	protected boolean isColspan;
	private boolean keepTogether;
	private boolean lockedWidth;
	protected boolean loopCheck;
	private int numberOfWrittenRows;
	protected float paddingTop;
	protected float relativeWidths[];
	protected PdfName role;
	protected boolean rowCompleted;
	protected ArrayList rows;
	protected boolean rowsNotChecked;
	protected int runDirection;
	private boolean skipFirstHeader;
	private boolean skipLastFooter;
	protected float spacingAfter;
	protected float spacingBefore;
	private boolean splitLate;
	private boolean splitRows;
	protected PdfPTableEvent tableEvent;
	protected float totalHeight;
	protected float totalWidth;
	protected float widthPercentage;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/text/pdf/PdfPTable)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class PdfPTable>
	//*   1    2:invokevirtual   #89  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #91  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
