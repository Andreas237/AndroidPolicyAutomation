// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;

public class PdfCollectionSort extends PdfDictionary
{

	public PdfCollectionSort(String s)
	{
		super(PdfName.COLLECTIONSORT);
	//    0    0:aload_0         
	//    1    1:getstatic       #12  <Field PdfName PdfName.COLLECTIONSORT>
	//    2    4:invokespecial   #15  <Method void PdfDictionary(PdfName)>
		put(PdfName.S, ((com.itextpdf.text.pdf.PdfObject) (new PdfName(s))));
	//    3    7:aload_0         
	//    4    8:getstatic       #18  <Field PdfName PdfName.S>
	//    5   11:new             #8   <Class PdfName>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #20  <Method void PdfName(String)>
	//    9   19:invokevirtual   #24  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   10   22:return          
	}

	public PdfCollectionSort(String as[])
	{
		super(PdfName.COLLECTIONSORT);
	//    0    0:aload_0         
	//    1    1:getstatic       #12  <Field PdfName PdfName.COLLECTIONSORT>
	//    2    4:invokespecial   #15  <Method void PdfDictionary(PdfName)>
		PdfArray pdfarray = new PdfArray();
	//    3    7:new             #28  <Class PdfArray>
	//    4   10:dup             
	//    5   11:invokespecial   #31  <Method void PdfArray()>
	//    6   14:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:aload_1         
	//*  11   19:arraylength     
	//*  12   20:icmpge          45
			pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (new PdfName(as[i]))));
	//   13   23:aload_3         
	//   14   24:new             #8   <Class PdfName>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:invokespecial   #20  <Method void PdfName(String)>
	//   20   34:invokevirtual   #35  <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   21   37:pop             

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            17
		put(PdfName.S, ((com.itextpdf.text.pdf.PdfObject) (pdfarray)));
	//   27   45:aload_0         
	//   28   46:getstatic       #18  <Field PdfName PdfName.S>
	//   29   49:aload_3         
	//   30   50:invokevirtual   #24  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   31   53:return          
	}

	public void setSortOrder(boolean flag)
	{
		if(get(PdfName.S) instanceof PdfName)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #18  <Field PdfName PdfName.S>
	//*   2    4:invokevirtual   #41  <Method com.itextpdf.text.pdf.PdfObject get(PdfName)>
	//*   3    7:instanceof      #8   <Class PdfName>
	//*   4   10:ifeq            29
		{
			put(PdfName.A, ((com.itextpdf.text.pdf.PdfObject) (new PdfBoolean(flag))));
	//    5   13:aload_0         
	//    6   14:getstatic       #44  <Field PdfName PdfName.A>
	//    7   17:new             #46  <Class PdfBoolean>
	//    8   20:dup             
	//    9   21:iload_1         
	//   10   22:invokespecial   #48  <Method void PdfBoolean(boolean)>
	//   11   25:invokevirtual   #24  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   12   28:return          
		} else
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("you.have.to.define.a.boolean.array.for.this.collection.sort.dictionary", new Object[0]));
	//   13   29:new             #50  <Class IllegalArgumentException>
	//   14   32:dup             
	//   15   33:ldc1            #52  <String "you.have.to.define.a.boolean.array.for.this.collection.sort.dictionary">
	//   16   35:iconst_0        
	//   17   36:anewarray       Object[]
	//   18   39:invokestatic    #60  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   42:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   20   45:athrow          
		}
	}

	public void setSortOrder(boolean aflag[])
	{
		Object obj = ((Object) (get(PdfName.S)));
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field PdfName PdfName.S>
	//    2    4:invokevirtual   #41  <Method com.itextpdf.text.pdf.PdfObject get(PdfName)>
	//    3    7:astore_3        
		if(obj instanceof PdfArray)
	//*   4    8:aload_3         
	//*   5    9:instanceof      #28  <Class PdfArray>
	//*   6   12:ifeq            91
		{
			if(((PdfArray)obj).size() != aflag.length)
	//*   7   15:aload_3         
	//*   8   16:checkcast       #28  <Class PdfArray>
	//*   9   19:invokevirtual   #66  <Method int PdfArray.size()>
	//*  10   22:aload_1         
	//*  11   23:arraylength     
	//*  12   24:icmpeq          44
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.number.of.booleans.in.this.array.doesn.t.correspond.with.the.number.of.fields", new Object[0]));
	//   13   27:new             #50  <Class IllegalArgumentException>
	//   14   30:dup             
	//   15   31:ldc1            #68  <String "the.number.of.booleans.in.this.array.doesn.t.correspond.with.the.number.of.fields">
	//   16   33:iconst_0        
	//   17   34:anewarray       Object[]
	//   18   37:invokestatic    #60  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   40:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   20   43:athrow          
			obj = ((Object) (new PdfArray()));
	//   21   44:new             #28  <Class PdfArray>
	//   22   47:dup             
	//   23   48:invokespecial   #31  <Method void PdfArray()>
	//   24   51:astore_3        
			for(int i = 0; i < aflag.length; i++)
	//*  25   52:iconst_0        
	//*  26   53:istore_2        
	//*  27   54:iload_2         
	//*  28   55:aload_1         
	//*  29   56:arraylength     
	//*  30   57:icmpge          82
				((PdfArray) (obj)).add(((com.itextpdf.text.pdf.PdfObject) (new PdfBoolean(aflag[i]))));
	//   31   60:aload_3         
	//   32   61:new             #46  <Class PdfBoolean>
	//   33   64:dup             
	//   34   65:aload_1         
	//   35   66:iload_2         
	//   36   67:baload          
	//   37   68:invokespecial   #48  <Method void PdfBoolean(boolean)>
	//   38   71:invokevirtual   #35  <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   39   74:pop             

	//   40   75:iload_2         
	//   41   76:iconst_1        
	//   42   77:iadd            
	//   43   78:istore_2        
	//*  44   79:goto            54
			put(PdfName.A, ((com.itextpdf.text.pdf.PdfObject) (obj)));
	//   45   82:aload_0         
	//   46   83:getstatic       #44  <Field PdfName PdfName.A>
	//   47   86:aload_3         
	//   48   87:invokevirtual   #24  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   49   90:return          
		} else
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("you.need.a.single.boolean.for.this.collection.sort.dictionary", new Object[0]));
	//   50   91:new             #50  <Class IllegalArgumentException>
	//   51   94:dup             
	//   52   95:ldc1            #70  <String "you.need.a.single.boolean.for.this.collection.sort.dictionary">
	//   53   97:iconst_0        
	//   54   98:anewarray       Object[]
	//   55  101:invokestatic    #60  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   56  104:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   57  107:athrow          
		}
	}
}
