// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfDocument, PdfName, PdfNameTree, 
//			PdfWriter, PdfIndirectObject, PdfIndirectReference, PdfAction

static class PdfDocument$PdfCatalog extends PdfDictionary
{

	void addNames(TreeMap treemap, HashMap hashmap, HashMap hashmap1, PdfWriter pdfwriter)
	{
		if(!treemap.isEmpty() || !hashmap.isEmpty() || !hashmap1.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method boolean TreeMap.isEmpty()>
	//    2    4:ifeq            22
	//    3    7:aload_2         
	//    4    8:invokevirtual   #43  <Method boolean HashMap.isEmpty()>
	//    5   11:ifeq            22
	//    6   14:aload_3         
	//    7   15:invokevirtual   #43  <Method boolean HashMap.isEmpty()>
	//    8   18:ifeq            22
_L1:
		return;
	//    9   21:return          
_L2:
		PdfDictionary pdfdictionary;
		HashMap hashmap2;
		try
		{
			pdfdictionary = new PdfDictionary();
	//   10   22:new             #4   <Class PdfDictionary>
	//   11   25:dup             
	//   12   26:invokespecial   #46  <Method void PdfDictionary()>
	//   13   29:astore          5
			if(treemap.isEmpty())
				break MISSING_BLOCK_LABEL_166;
	//   14   31:aload_1         
	//   15   32:invokevirtual   #40  <Method boolean TreeMap.isEmpty()>
	//   16   35:ifne            166
			hashmap2 = new HashMap();
	//   17   38:new             #42  <Class HashMap>
	//   18   41:dup             
	//   19   42:invokespecial   #47  <Method void HashMap()>
	//   20   45:astore          6
			treemap = ((TreeMap) (treemap.entrySet().iterator()));
	//   21   47:aload_1         
	//   22   48:invokevirtual   #51  <Method Set TreeMap.entrySet()>
	//   23   51:invokeinterface #57  <Method Iterator Set.iterator()>
	//   24   56:astore_1        
			do
			{
				if(!((Iterator) (treemap)).hasNext())
					break;
	//   25   57:aload_1         
	//   26   58:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   27   63:ifeq            135
				Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (treemap)).next()));
	//   28   66:aload_1         
	//   29   67:invokeinterface #66  <Method Object Iterator.next()>
	//   30   72:checkcast       #68  <Class java.util.Map$Entry>
	//   31   75:astore          8
				String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   32   77:aload           8
	//   33   79:invokeinterface #71  <Method Object java.util.Map$Entry.getKey()>
	//   34   84:checkcast       #73  <Class String>
	//   35   87:astore          7
				obj = ((Object) (()((java.util.Map.Entry) (obj)).getValue()));
	//   36   89:aload           8
	//   37   91:invokeinterface #76  <Method Object java.util.Map$Entry.getValue()>
	//   38   96:checkcast       #78  <Class PdfDocument$Destination>
	//   39   99:astore          8
				if((() (obj)).destination != null)
	//*  40  101:aload           8
	//*  41  103:getfield        #82  <Field PdfDestination PdfDocument$Destination.destination>
	//*  42  106:ifnull          57
					hashmap2.put(((Object) (s)), ((Object) ((() (obj)).reference)));
	//   43  109:aload           6
	//   44  111:aload           7
	//   45  113:aload           8
	//   46  115:getfield        #86  <Field PdfIndirectReference PdfDocument$Destination.reference>
	//   47  118:invokevirtual   #89  <Method Object HashMap.put(Object, Object)>
	//   48  121:pop             
			} while(true);
	//   49  122:goto            57
		}
		// Misplaced declaration of an exception variable
		catch(TreeMap treemap)
	//*  50  125:astore_1        
		{
			throw new ExceptionConverter(((Exception) (treemap)));
	//   51  126:new             #91  <Class ExceptionConverter>
	//   52  129:dup             
	//   53  130:aload_1         
	//   54  131:invokespecial   #94  <Method void ExceptionConverter(Exception)>
	//   55  134:athrow          
		}
		if(hashmap2.size() > 0)
	//*  56  135:aload           6
	//*  57  137:invokevirtual   #98  <Method int HashMap.size()>
	//*  58  140:ifle            166
			pdfdictionary.put(PdfName.DESTS, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (PdfNameTree.writeTree(hashmap2, pdfwriter)))).getIndirectReference())));
	//   59  143:aload           5
	//   60  145:getstatic       #101 <Field PdfName PdfName.DESTS>
	//   61  148:aload           4
	//   62  150:aload           6
	//   63  152:aload           4
	//   64  154:invokestatic    #107 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   65  157:invokevirtual   #113 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   66  160:invokevirtual   #119 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   67  163:invokevirtual   #120 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(!hashmap.isEmpty())
	//*  68  166:aload_2         
	//*  69  167:invokevirtual   #43  <Method boolean HashMap.isEmpty()>
	//*  70  170:ifne            197
		{
			treemap = ((TreeMap) (PdfNameTree.writeTree(hashmap, pdfwriter)));
	//   71  173:aload_2         
	//   72  174:aload           4
	//   73  176:invokestatic    #107 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   74  179:astore_1        
			pdfdictionary.put(PdfName.JAVASCRIPT, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (treemap))).getIndirectReference())));
	//   75  180:aload           5
	//   76  182:getstatic       #123 <Field PdfName PdfName.JAVASCRIPT>
	//   77  185:aload           4
	//   78  187:aload_1         
	//   79  188:invokevirtual   #113 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   80  191:invokevirtual   #119 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   81  194:invokevirtual   #120 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(!hashmap1.isEmpty())
	//*  82  197:aload_3         
	//*  83  198:invokevirtual   #43  <Method boolean HashMap.isEmpty()>
	//*  84  201:ifne            226
			pdfdictionary.put(PdfName.EMBEDDEDFILES, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (PdfNameTree.writeTree(hashmap1, pdfwriter)))).getIndirectReference())));
	//   85  204:aload           5
	//   86  206:getstatic       #126 <Field PdfName PdfName.EMBEDDEDFILES>
	//   87  209:aload           4
	//   88  211:aload_3         
	//   89  212:aload           4
	//   90  214:invokestatic    #107 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   91  217:invokevirtual   #113 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   92  220:invokevirtual   #119 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   93  223:invokevirtual   #120 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfdictionary.size() > 0)
	//*  94  226:aload           5
	//*  95  228:invokevirtual   #127 <Method int PdfDictionary.size()>
	//*  96  231:ifle            21
		{
			put(PdfName.NAMES, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference())));
	//   97  234:aload_0         
	//   98  235:getstatic       #130 <Field PdfName PdfName.NAMES>
	//   99  238:aload           4
	//  100  240:aload           5
	//  101  242:invokevirtual   #113 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  102  245:invokevirtual   #119 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  103  248:invokevirtual   #29  <Method void put(PdfName, PdfObject)>
			return;
	//  104  251:return          
		}
		  goto _L1
	}

	void setAdditionalActions(PdfDictionary pdfdictionary)
	{
		try
		{
			put(PdfName.AA, ((PdfObject) (writer.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference())));
	//    0    0:aload_0         
	//    1    1:getstatic       #139 <Field PdfName PdfName.AA>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field PdfWriter writer>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//    6   12:invokevirtual   #119 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//    7   15:invokevirtual   #29  <Method void put(PdfName, PdfObject)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(PdfDictionary pdfdictionary)
	//*   9   19:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfdictionary)));
	//   10   20:new             #91  <Class ExceptionConverter>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #94  <Method void ExceptionConverter(Exception)>
	//   14   28:athrow          
		}
	}

	void setOpenAction(PdfAction pdfaction)
	{
		put(PdfName.OPENACTION, ((PdfObject) (pdfaction)));
	//    0    0:aload_0         
	//    1    1:getstatic       #144 <Field PdfName PdfName.OPENACTION>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	PdfWriter writer;

	PdfDocument$PdfCatalog(PdfIndirectReference pdfindirectreference, PdfWriter pdfwriter)
	{
		super(CATALOG);
	//    0    0:aload_0         
	//    1    1:getstatic       #15  <Field PdfName CATALOG>
	//    2    4:invokespecial   #18  <Method void PdfDictionary(PdfName)>
		writer = pdfwriter;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #20  <Field PdfWriter writer>
		put(PdfName.PAGES, ((PdfObject) (pdfindirectreference)));
	//    6   12:aload_0         
	//    7   13:getstatic       #25  <Field PdfName PdfName.PAGES>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #29  <Method void put(PdfName, PdfObject)>
	//   10   20:return          
	}
}
