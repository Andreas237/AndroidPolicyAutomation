// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.util.Calendar;

// Referenced classes of package com.itextpdf.text.pdf.collection:
//			PdfCollectionSchema, PdfCollectionField

public class PdfCollectionItem extends PdfDictionary
{

	public PdfCollectionItem(PdfCollectionSchema pdfcollectionschema)
	{
		super(PdfName.COLLECTIONITEM);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field PdfName PdfName.COLLECTIONITEM>
	//    2    4:invokespecial   #17  <Method void PdfDictionary(PdfName)>
		schema = pdfcollectionschema;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #19  <Field PdfCollectionSchema schema>
	//    6   12:return          
	}

	public void addItem(String s, double d)
	{
		addItem(s, new PdfNumber(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #24  <Class PdfNumber>
	//    3    5:dup             
	//    4    6:dload_2         
	//    5    7:invokespecial   #27  <Method void PdfNumber(double)>
	//    6   10:invokevirtual   #30  <Method void addItem(String, PdfNumber)>
	//    7   13:return          
	}

	public void addItem(String s, float f)
	{
		addItem(s, new PdfNumber(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #24  <Class PdfNumber>
	//    3    5:dup             
	//    4    6:fload_2         
	//    5    7:invokespecial   #34  <Method void PdfNumber(float)>
	//    6   10:invokevirtual   #30  <Method void addItem(String, PdfNumber)>
	//    7   13:return          
	}

	public void addItem(String s, int i)
	{
		addItem(s, new PdfNumber(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #24  <Class PdfNumber>
	//    3    5:dup             
	//    4    6:iload_2         
	//    5    7:invokespecial   #38  <Method void PdfNumber(int)>
	//    6   10:invokevirtual   #30  <Method void addItem(String, PdfNumber)>
	//    7   13:return          
	}

	public void addItem(String s, PdfDate pdfdate)
	{
		s = ((String) (new PdfName(s)));
	//    0    0:new             #10  <Class PdfName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #42  <Method void PdfName(String)>
	//    4    8:astore_1        
		if(((PdfCollectionField)schema.get(((PdfName) (s)))).fieldType == 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field PdfCollectionSchema schema>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #48  <Method com.itextpdf.text.pdf.PdfObject PdfCollectionSchema.get(PdfName)>
	//*   9   17:checkcast       #50  <Class PdfCollectionField>
	//*  10   20:getfield        #54  <Field int PdfCollectionField.fieldType>
	//*  11   23:iconst_1        
	//*  12   24:icmpne          33
			put(((PdfName) (s)), ((com.itextpdf.text.pdf.PdfObject) (pdfdate)));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #58  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   17   33:return          
	}

	public void addItem(String s, PdfNumber pdfnumber)
	{
		s = ((String) (new PdfName(s)));
	//    0    0:new             #10  <Class PdfName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #42  <Method void PdfName(String)>
	//    4    8:astore_1        
		if(((PdfCollectionField)schema.get(((PdfName) (s)))).fieldType == 2)
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field PdfCollectionSchema schema>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #48  <Method com.itextpdf.text.pdf.PdfObject PdfCollectionSchema.get(PdfName)>
	//*   9   17:checkcast       #50  <Class PdfCollectionField>
	//*  10   20:getfield        #54  <Field int PdfCollectionField.fieldType>
	//*  11   23:iconst_2        
	//*  12   24:icmpne          33
			put(((PdfName) (s)), ((com.itextpdf.text.pdf.PdfObject) (pdfnumber)));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #58  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   17   33:return          
	}

	public void addItem(String s, PdfString pdfstring)
	{
		s = ((String) (new PdfName(s)));
	//    0    0:new             #10  <Class PdfName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #42  <Method void PdfName(String)>
	//    4    8:astore_1        
		if(((PdfCollectionField)schema.get(((PdfName) (s)))).fieldType == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field PdfCollectionSchema schema>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #48  <Method com.itextpdf.text.pdf.PdfObject PdfCollectionSchema.get(PdfName)>
	//*   9   17:checkcast       #50  <Class PdfCollectionField>
	//*  10   20:getfield        #54  <Field int PdfCollectionField.fieldType>
	//*  11   23:ifne            32
			put(((PdfName) (s)), ((com.itextpdf.text.pdf.PdfObject) (pdfstring)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #58  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   16   32:return          
	}

	public void addItem(String s, String s1)
	{
		s = ((String) (new PdfName(s)));
	//    0    0:new             #10  <Class PdfName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #42  <Method void PdfName(String)>
	//    4    8:astore_1        
		put(((PdfName) (s)), ((PdfCollectionField)schema.get(((PdfName) (s)))).getValue(s1));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field PdfCollectionSchema schema>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #48  <Method com.itextpdf.text.pdf.PdfObject PdfCollectionSchema.get(PdfName)>
	//   11   19:checkcast       #50  <Class PdfCollectionField>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #64  <Method com.itextpdf.text.pdf.PdfObject PdfCollectionField.getValue(String)>
	//   14   26:invokevirtual   #58  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   15   29:return          
	}

	public void addItem(String s, Calendar calendar)
	{
		addItem(s, new PdfDate(calendar));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #67  <Class PdfDate>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #70  <Method void PdfDate(Calendar)>
	//    6   10:invokevirtual   #72  <Method void addItem(String, PdfDate)>
	//    7   13:return          
	}

	public void setPrefix(String s, String s1)
	{
		s = ((String) (new PdfName(s)));
	//    0    0:new             #10  <Class PdfName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #42  <Method void PdfName(String)>
	//    4    8:astore_1        
		com.itextpdf.text.pdf.PdfObject pdfobject = get(((PdfName) (s)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #74  <Method com.itextpdf.text.pdf.PdfObject get(PdfName)>
	//    8   14:astore_3        
		if(pdfobject == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       36
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("you.must.set.a.value.before.adding.a.prefix", new Object[0]));
	//   11   19:new             #76  <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:ldc1            #78  <String "you.must.set.a.value.before.adding.a.prefix">
	//   14   25:iconst_0        
	//   15   26:anewarray       Object[]
	//   16   29:invokestatic    #86  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   17   32:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   18   35:athrow          
		} else
		{
			PdfDictionary pdfdictionary = new PdfDictionary(PdfName.COLLECTIONSUBITEM);
	//   19   36:new             #4   <Class PdfDictionary>
	//   20   39:dup             
	//   21   40:getstatic       #90  <Field PdfName PdfName.COLLECTIONSUBITEM>
	//   22   43:invokespecial   #17  <Method void PdfDictionary(PdfName)>
	//   23   46:astore          4
			pdfdictionary.put(PdfName.D, pdfobject);
	//   24   48:aload           4
	//   25   50:getstatic       #93  <Field PdfName PdfName.D>
	//   26   53:aload_3         
	//   27   54:invokevirtual   #94  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			pdfdictionary.put(PdfName.P, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//   28   57:aload           4
	//   29   59:getstatic       #97  <Field PdfName PdfName.P>
	//   30   62:new             #99  <Class PdfString>
	//   31   65:dup             
	//   32   66:aload_2         
	//   33   67:ldc1            #101 <String "UnicodeBig">
	//   34   69:invokespecial   #103 <Method void PdfString(String, String)>
	//   35   72:invokevirtual   #94  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			put(((PdfName) (s)), ((com.itextpdf.text.pdf.PdfObject) (pdfdictionary)));
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:aload           4
	//   39   79:invokevirtual   #58  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   40   82:return          
		}
	}

	PdfCollectionSchema schema;
}
