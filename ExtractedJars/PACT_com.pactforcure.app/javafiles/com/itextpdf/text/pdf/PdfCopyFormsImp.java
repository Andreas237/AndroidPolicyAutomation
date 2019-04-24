// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopyFieldsImp, PdfReader, IntHashtable, AcroFields

class PdfCopyFormsImp extends PdfCopyFieldsImp
{

	PdfCopyFormsImp(OutputStream outputstream)
		throws DocumentException
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void PdfCopyFieldsImp(OutputStream)>
	//    3    5:return          
	}

	public void copyDocumentFields(PdfReader pdfreader)
		throws DocumentException
	{
		if(!pdfreader.isOpenedWithFullPermissions())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//*   2    4:ifne            24
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//    3    7:new             #22  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #24  <String "pdfreader.not.opened.with.owner.password">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #32  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		if(readers2intrefs.containsKey(((Object) (pdfreader))))
	//*  11   24:aload_0         
	//*  12   25:getfield        #39  <Field HashMap readers2intrefs>
	//*  13   28:aload_1         
	//*  14   29:invokevirtual   #45  <Method boolean HashMap.containsKey(Object)>
	//*  15   32:ifeq            99
		{
			pdfreader = new PdfReader(pdfreader);
	//   16   35:new             #16  <Class PdfReader>
	//   17   38:dup             
	//   18   39:aload_1         
	//   19   40:invokespecial   #47  <Method void PdfReader(PdfReader)>
	//   20   43:astore_1        
		} else
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #51  <Method int PdfReader.shuffleSubsetNames()>
	//*  23   48:pop             
	//*  24   49:aload_0         
	//*  25   50:getfield        #39  <Field HashMap readers2intrefs>
	//*  26   53:aload_1         
	//*  27   54:new             #53  <Class IntHashtable>
	//*  28   57:dup             
	//*  29   58:invokespecial   #56  <Method void IntHashtable()>
	//*  30   61:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//*  31   64:pop             
	//*  32   65:aload_0         
	//*  33   66:getfield        #63  <Field HashMap visited>
	//*  34   69:aload_1         
	//*  35   70:new             #53  <Class IntHashtable>
	//*  36   73:dup             
	//*  37   74:invokespecial   #56  <Method void IntHashtable()>
	//*  38   77:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//*  39   80:pop             
	//*  40   81:aload_0         
	//*  41   82:getfield        #67  <Field ArrayList fields>
	//*  42   85:aload_1         
	//*  43   86:invokevirtual   #71  <Method AcroFields PdfReader.getAcroFields()>
	//*  44   89:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//*  45   92:pop             
	//*  46   93:aload_0         
	//*  47   94:aload_1         
	//*  48   95:invokevirtual   #79  <Method void updateCalculationOrder(PdfReader)>
	//*  49   98:return          
		{
			if(pdfreader.isTampered())
	//*  50   99:aload_1         
	//*  51  100:invokevirtual   #82  <Method boolean PdfReader.isTampered()>
	//*  52  103:ifeq            123
				throw new DocumentException(MessageLocalization.getComposedMessage("the.document.was.reused", new Object[0]));
	//   53  106:new             #8   <Class DocumentException>
	//   54  109:dup             
	//   55  110:ldc1            #84  <String "the.document.was.reused">
	//   56  112:iconst_0        
	//   57  113:anewarray       Object[]
	//   58  116:invokestatic    #32  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   59  119:invokespecial   #85  <Method void DocumentException(String)>
	//   60  122:athrow          
			pdfreader.consolidateNamedDestinations();
	//   61  123:aload_1         
	//   62  124:invokevirtual   #88  <Method void PdfReader.consolidateNamedDestinations()>
			pdfreader.setTampered(true);
	//   63  127:aload_1         
	//   64  128:iconst_1        
	//   65  129:invokevirtual   #92  <Method void PdfReader.setTampered(boolean)>
		}
		pdfreader.shuffleSubsetNames();
		readers2intrefs.put(((Object) (pdfreader)), ((Object) (new IntHashtable())));
		visited.put(((Object) (pdfreader)), ((Object) (new IntHashtable())));
		fields.add(((Object) (pdfreader.getAcroFields())));
		updateCalculationOrder(pdfreader);
	//*  66  132:goto            44
	}

	void mergeFields()
	{
		for(int i = 0; i < fields.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #67  <Field ArrayList fields>
	//*   5    7:invokevirtual   #96  <Method int ArrayList.size()>
	//*   6   10:icmpge          38
			mergeWithMaster(((AcroFields)fields.get(i)).getFields());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #67  <Field ArrayList fields>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #102 <Class AcroFields>
	//   13   25:invokevirtual   #106 <Method java.util.Map AcroFields.getFields()>
	//   14   28:invokevirtual   #110 <Method void mergeWithMaster(java.util.Map)>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            2
	//   20   38:return          
	}
}
