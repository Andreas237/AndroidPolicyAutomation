// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.util.HashMap;

public class FieldPositioningEvents extends PdfPageEventHelper
	implements PdfPCellEvent
{

	public FieldPositioningEvents()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPageEventHelper()>
		genericChunkFields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap genericChunkFields>
		cellField = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #29  <Field PdfWriter fieldWriter>
		parent = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #31  <Field PdfFormField parent>
	//   16   30:return          
	}

	public FieldPositioningEvents(PdfFormField pdfformfield, PdfFormField pdfformfield1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPageEventHelper()>
		genericChunkFields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap genericChunkFields>
		cellField = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #29  <Field PdfWriter fieldWriter>
		parent = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #31  <Field PdfFormField parent>
		cellField = pdfformfield1;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #27  <Field PdfFormField cellField>
		parent = pdfformfield;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #31  <Field PdfFormField parent>
	//   22   40:return          
	}

	public FieldPositioningEvents(PdfWriter pdfwriter, PdfFormField pdfformfield)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPageEventHelper()>
		genericChunkFields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap genericChunkFields>
		cellField = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #29  <Field PdfWriter fieldWriter>
		parent = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #31  <Field PdfFormField parent>
		cellField = pdfformfield;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = pdfwriter;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #29  <Field PdfWriter fieldWriter>
	//   22   40:return          
	}

	public FieldPositioningEvents(PdfWriter pdfwriter, PdfFormField pdfformfield, String s)
		throws IOException, DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPageEventHelper()>
		genericChunkFields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap genericChunkFields>
		cellField = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #29  <Field PdfWriter fieldWriter>
		parent = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #31  <Field PdfFormField parent>
		parent = pdfformfield;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #31  <Field PdfFormField parent>
		pdfwriter = ((PdfWriter) (new TextField(pdfwriter, new Rectangle(0.0F, 0.0F), s)));
	//   19   35:new             #41  <Class TextField>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:new             #43  <Class Rectangle>
	//   23   43:dup             
	//   24   44:fconst_0        
	//   25   45:fconst_0        
	//   26   46:invokespecial   #46  <Method void Rectangle(float, float)>
	//   27   49:aload_3         
	//   28   50:invokespecial   #49  <Method void TextField(PdfWriter, Rectangle, String)>
	//   29   53:astore_1        
		((TextField) (pdfwriter)).setFontSize(14F);
	//   30   54:aload_1         
	//   31   55:ldc1            #50  <Float 14F>
	//   32   57:invokevirtual   #54  <Method void TextField.setFontSize(float)>
		cellField = ((TextField) (pdfwriter)).getTextField();
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #58  <Method PdfFormField TextField.getTextField()>
	//   36   65:putfield        #27  <Field PdfFormField cellField>
	//   37   68:return          
	}

	public FieldPositioningEvents(PdfWriter pdfwriter, String s)
		throws IOException, DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfPageEventHelper()>
		genericChunkFields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashMap()>
	//    6   12:putfield        #25  <Field HashMap genericChunkFields>
		cellField = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #27  <Field PdfFormField cellField>
		fieldWriter = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #29  <Field PdfWriter fieldWriter>
		parent = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #31  <Field PdfFormField parent>
		fieldWriter = pdfwriter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #29  <Field PdfWriter fieldWriter>
		pdfwriter = ((PdfWriter) (new TextField(pdfwriter, new Rectangle(0.0F, 0.0F), s)));
	//   19   35:new             #41  <Class TextField>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:new             #43  <Class Rectangle>
	//   23   43:dup             
	//   24   44:fconst_0        
	//   25   45:fconst_0        
	//   26   46:invokespecial   #46  <Method void Rectangle(float, float)>
	//   27   49:aload_2         
	//   28   50:invokespecial   #49  <Method void TextField(PdfWriter, Rectangle, String)>
	//   29   53:astore_1        
		((TextField) (pdfwriter)).setFontSize(14F);
	//   30   54:aload_1         
	//   31   55:ldc1            #50  <Float 14F>
	//   32   57:invokevirtual   #54  <Method void TextField.setFontSize(float)>
		cellField = ((TextField) (pdfwriter)).getTextField();
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #58  <Method PdfFormField TextField.getTextField()>
	//   36   65:putfield        #27  <Field PdfFormField cellField>
	//   37   68:return          
	}

	public void addField(String s, PdfFormField pdfformfield)
	{
		genericChunkFields.put(((Object) (s)), ((Object) (pdfformfield)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap genericChunkFields>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #66  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void cellLayout(PdfPCell pdfpcell, Rectangle rectangle, PdfContentByte apdfcontentbyte[])
	{
		if(cellField == null || fieldWriter == null && parent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field PdfFormField cellField>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field PdfWriter fieldWriter>
	//*   5   11:ifnonnull       38
	//*   6   14:aload_0         
	//*   7   15:getfield        #31  <Field PdfFormField parent>
	//*   8   18:ifnonnull       38
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("you.have.used.the.wrong.constructor.for.this.fieldpositioningevents.class", new Object[0]));
	//    9   21:new             #70  <Class IllegalArgumentException>
	//   10   24:dup             
	//   11   25:ldc1            #72  <String "you.have.used.the.wrong.constructor.for.this.fieldpositioningevents.class">
	//   12   27:iconst_0        
	//   13   28:anewarray       Object[]
	//   14   31:invokestatic    #80  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   34:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   16   37:athrow          
		cellField.put(PdfName.RECT, ((com.itextpdf.text.pdf.PdfObject) (new PdfRectangle(rectangle.getLeft(padding), rectangle.getBottom(padding), rectangle.getRight(padding), rectangle.getTop(padding)))));
	//   17   38:aload_0         
	//   18   39:getfield        #27  <Field PdfFormField cellField>
	//   19   42:getstatic       #89  <Field PdfName PdfName.RECT>
	//   20   45:new             #91  <Class PdfRectangle>
	//   21   48:dup             
	//   22   49:aload_2         
	//   23   50:aload_0         
	//   24   51:getfield        #93  <Field float padding>
	//   25   54:invokevirtual   #97  <Method float Rectangle.getLeft(float)>
	//   26   57:aload_2         
	//   27   58:aload_0         
	//   28   59:getfield        #93  <Field float padding>
	//   29   62:invokevirtual   #100 <Method float Rectangle.getBottom(float)>
	//   30   65:aload_2         
	//   31   66:aload_0         
	//   32   67:getfield        #93  <Field float padding>
	//   33   70:invokevirtual   #103 <Method float Rectangle.getRight(float)>
	//   34   73:aload_2         
	//   35   74:aload_0         
	//   36   75:getfield        #93  <Field float padding>
	//   37   78:invokevirtual   #106 <Method float Rectangle.getTop(float)>
	//   38   81:invokespecial   #109 <Method void PdfRectangle(float, float, float, float)>
	//   39   84:invokevirtual   #114 <Method void PdfFormField.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		if(parent == null)
	//*  40   87:aload_0         
	//*  41   88:getfield        #31  <Field PdfFormField parent>
	//*  42   91:ifnonnull       106
		{
			fieldWriter.addAnnotation(((com.itextpdf.text.pdf.PdfAnnotation) (cellField)));
	//   43   94:aload_0         
	//   44   95:getfield        #29  <Field PdfWriter fieldWriter>
	//   45   98:aload_0         
	//   46   99:getfield        #27  <Field PdfFormField cellField>
	//   47  102:invokevirtual   #120 <Method void PdfWriter.addAnnotation(com.itextpdf.text.pdf.PdfAnnotation)>
			return;
	//   48  105:return          
		} else
		{
			parent.addKid(cellField);
	//   49  106:aload_0         
	//   50  107:getfield        #31  <Field PdfFormField parent>
	//   51  110:aload_0         
	//   52  111:getfield        #27  <Field PdfFormField cellField>
	//   53  114:invokevirtual   #124 <Method void PdfFormField.addKid(PdfFormField)>
			return;
	//   54  117:return          
		}
	}

	public void onGenericTag(PdfWriter pdfwriter, Document document, Rectangle rectangle, String s)
	{
		rectangle.setBottom(rectangle.getBottom() - 3F);
	//    0    0:aload_3         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #131 <Method float Rectangle.getBottom()>
	//    3    5:ldc1            #132 <Float 3F>
	//    4    7:fsub            
	//    5    8:invokevirtual   #135 <Method void Rectangle.setBottom(float)>
		document = ((Document) ((PdfFormField)genericChunkFields.get(((Object) (s)))));
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field HashMap genericChunkFields>
	//    8   15:aload           4
	//    9   17:invokevirtual   #139 <Method Object HashMap.get(Object)>
	//   10   20:checkcast       #111 <Class PdfFormField>
	//   11   23:astore_2        
		if(document == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       112
		{
			document = ((Document) (new TextField(pdfwriter, new Rectangle(rectangle.getLeft(padding), rectangle.getBottom(padding), rectangle.getRight(padding), rectangle.getTop(padding)), s)));
	//   14   28:new             #41  <Class TextField>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:new             #43  <Class Rectangle>
	//   18   36:dup             
	//   19   37:aload_3         
	//   20   38:aload_0         
	//   21   39:getfield        #93  <Field float padding>
	//   22   42:invokevirtual   #97  <Method float Rectangle.getLeft(float)>
	//   23   45:aload_3         
	//   24   46:aload_0         
	//   25   47:getfield        #93  <Field float padding>
	//   26   50:invokevirtual   #100 <Method float Rectangle.getBottom(float)>
	//   27   53:aload_3         
	//   28   54:aload_0         
	//   29   55:getfield        #93  <Field float padding>
	//   30   58:invokevirtual   #103 <Method float Rectangle.getRight(float)>
	//   31   61:aload_3         
	//   32   62:aload_0         
	//   33   63:getfield        #93  <Field float padding>
	//   34   66:invokevirtual   #106 <Method float Rectangle.getTop(float)>
	//   35   69:invokespecial   #140 <Method void Rectangle(float, float, float, float)>
	//   36   72:aload           4
	//   37   74:invokespecial   #49  <Method void TextField(PdfWriter, Rectangle, String)>
	//   38   77:astore_2        
			((TextField) (document)).setFontSize(14F);
	//   39   78:aload_2         
	//   40   79:ldc1            #50  <Float 14F>
	//   41   81:invokevirtual   #54  <Method void TextField.setFontSize(float)>
			try
			{
				document = ((Document) (((TextField) (document)).getTextField()));
	//   42   84:aload_2         
	//   43   85:invokevirtual   #58  <Method PdfFormField TextField.getTextField()>
	//   44   88:astore_2        
			}
	//*  45   89:aload_0         
	//*  46   90:getfield        #31  <Field PdfFormField parent>
	//*  47   93:ifnonnull       161
	//*  48   96:aload_1         
	//*  49   97:aload_2         
	//*  50   98:invokevirtual   #120 <Method void PdfWriter.addAnnotation(com.itextpdf.text.pdf.PdfAnnotation)>
	//*  51  101:return          
			// Misplaced declaration of an exception variable
			catch(PdfWriter pdfwriter)
	//*  52  102:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfwriter)));
	//   53  103:new             #142 <Class ExceptionConverter>
	//   54  106:dup             
	//   55  107:aload_1         
	//   56  108:invokespecial   #145 <Method void ExceptionConverter(Exception)>
	//   57  111:athrow          
			}
		} else
		{
			((PdfFormField) (document)).put(PdfName.RECT, ((com.itextpdf.text.pdf.PdfObject) (new PdfRectangle(rectangle.getLeft(padding), rectangle.getBottom(padding), rectangle.getRight(padding), rectangle.getTop(padding)))));
	//   58  112:aload_2         
	//   59  113:getstatic       #89  <Field PdfName PdfName.RECT>
	//   60  116:new             #91  <Class PdfRectangle>
	//   61  119:dup             
	//   62  120:aload_3         
	//   63  121:aload_0         
	//   64  122:getfield        #93  <Field float padding>
	//   65  125:invokevirtual   #97  <Method float Rectangle.getLeft(float)>
	//   66  128:aload_3         
	//   67  129:aload_0         
	//   68  130:getfield        #93  <Field float padding>
	//   69  133:invokevirtual   #100 <Method float Rectangle.getBottom(float)>
	//   70  136:aload_3         
	//   71  137:aload_0         
	//   72  138:getfield        #93  <Field float padding>
	//   73  141:invokevirtual   #103 <Method float Rectangle.getRight(float)>
	//   74  144:aload_3         
	//   75  145:aload_0         
	//   76  146:getfield        #93  <Field float padding>
	//   77  149:invokevirtual   #106 <Method float Rectangle.getTop(float)>
	//   78  152:invokespecial   #109 <Method void PdfRectangle(float, float, float, float)>
	//   79  155:invokevirtual   #114 <Method void PdfFormField.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		}
		if(parent == null)
		{
			pdfwriter.addAnnotation(((com.itextpdf.text.pdf.PdfAnnotation) (document)));
			return;
		} else
	//*  80  158:goto            89
		{
			parent.addKid(((PdfFormField) (document)));
	//   81  161:aload_0         
	//   82  162:getfield        #31  <Field PdfFormField parent>
	//   83  165:aload_2         
	//   84  166:invokevirtual   #124 <Method void PdfFormField.addKid(PdfFormField)>
			return;
	//   85  169:return          
		}
	}

	public void setPadding(float f)
	{
		padding = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #93  <Field float padding>
	//    3    5:return          
	}

	public void setParent(PdfFormField pdfformfield)
	{
		parent = pdfformfield;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field PdfFormField parent>
	//    3    5:return          
	}

	protected PdfFormField cellField;
	protected PdfWriter fieldWriter;
	protected HashMap genericChunkFields;
	public float padding;
	protected PdfFormField parent;
}
