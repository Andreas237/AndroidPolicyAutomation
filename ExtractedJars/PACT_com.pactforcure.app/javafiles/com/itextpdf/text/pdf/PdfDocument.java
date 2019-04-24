// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.api.WriterOperation;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.TempFileCache;
import com.itextpdf.text.pdf.collection.PdfCollection;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import com.itextpdf.text.pdf.internal.PdfAnnotationsImp;
import com.itextpdf.text.pdf.internal.PdfVersionImp;
import com.itextpdf.text.pdf.internal.PdfViewerPreferencesImp;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			FloatLayout, PdfContentByte, PdfWriter, PdfLine, 
//			PdfException, PdfChunk, PdfAction, PdfPageEvent, 
//			PdfPTable, PdfPCell, PdfDestination, PdfOutline, 
//			PdfDiv, PdfBody, PdfDictionary, PdfName, 
//			PdfFileSpecification, PdfString, PdfEncodings, PdfIndirectObject, 
//			ColumnText, PdfXConformanceException, PageResources, PdfPage, 
//			PdfRectangle, PdfArray, PdfNumber, PdfContents, 
//			PdfFont, PdfStructureElement, PdfPageLabels, PdfTransition, 
//			PdfStream, PdfEncryption, BaseFont, PdfAnnotation, 
//			PdfStructureTreeRoot, PdfFormField, PdfTextArray, PdfObject, 
//			PdfAcroForm, PdfIndirectReference, PdfNameTree, PdfDate

public class PdfDocument extends Document
{
	public class Destination
	{

		public PdfAction action;
		public PdfDestination destination;
		public PdfIndirectReference reference;
		final PdfDocument this$0;

		public Destination()
		{
			this$0 = PdfDocument.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field PdfDocument this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
		//    5    9:return          
		}
	}

	public static class Indentation
	{

		float imageIndentLeft;
		float imageIndentRight;
		float indentBottom;
		float indentLeft;
		float indentRight;
		float indentTop;
		float listIndentLeft;
		float sectionIndentLeft;
		float sectionIndentRight;

		public Indentation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			indentLeft = 0.0F;
		//    2    4:aload_0         
		//    3    5:fconst_0        
		//    4    6:putfield        #23  <Field float indentLeft>
			sectionIndentLeft = 0.0F;
		//    5    9:aload_0         
		//    6   10:fconst_0        
		//    7   11:putfield        #25  <Field float sectionIndentLeft>
			listIndentLeft = 0.0F;
		//    8   14:aload_0         
		//    9   15:fconst_0        
		//   10   16:putfield        #27  <Field float listIndentLeft>
			imageIndentLeft = 0.0F;
		//   11   19:aload_0         
		//   12   20:fconst_0        
		//   13   21:putfield        #29  <Field float imageIndentLeft>
			indentRight = 0.0F;
		//   14   24:aload_0         
		//   15   25:fconst_0        
		//   16   26:putfield        #31  <Field float indentRight>
			sectionIndentRight = 0.0F;
		//   17   29:aload_0         
		//   18   30:fconst_0        
		//   19   31:putfield        #33  <Field float sectionIndentRight>
			imageIndentRight = 0.0F;
		//   20   34:aload_0         
		//   21   35:fconst_0        
		//   22   36:putfield        #35  <Field float imageIndentRight>
			indentTop = 0.0F;
		//   23   39:aload_0         
		//   24   40:fconst_0        
		//   25   41:putfield        #37  <Field float indentTop>
			indentBottom = 0.0F;
		//   26   44:aload_0         
		//   27   45:fconst_0        
		//   28   46:putfield        #39  <Field float indentBottom>
		//   29   49:return          
		}
	}

	static class PdfCatalog extends PdfDictionary
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
					obj = ((Object) ((Destination)((java.util.Map.Entry) (obj)).getValue()));
		//   36   89:aload           8
		//   37   91:invokeinterface #76  <Method Object java.util.Map$Entry.getValue()>
		//   38   96:checkcast       #78  <Class PdfDocument$Destination>
		//   39   99:astore          8
					if(((Destination) (obj)).destination != null)
		//*  40  101:aload           8
		//*  41  103:getfield        #82  <Field PdfDestination PdfDocument$Destination.destination>
		//*  42  106:ifnull          57
						hashmap2.put(((Object) (s)), ((Object) (((Destination) (obj)).reference)));
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

		PdfCatalog(PdfIndirectReference pdfindirectreference, PdfWriter pdfwriter)
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

	public static class PdfInfo extends PdfDictionary
	{

		void addAuthor(String s)
		{
			put(PdfName.AUTHOR, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//    0    0:aload_0         
		//    1    1:getstatic       #36  <Field PdfName PdfName.AUTHOR>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:ldc1            #40  <String "UnicodeBig">
		//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
		//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   17:return          
		}

		void addCreationDate()
		{
			PdfDate pdfdate = new PdfDate();
		//    0    0:new             #49  <Class PdfDate>
		//    1    3:dup             
		//    2    4:invokespecial   #50  <Method void PdfDate()>
		//    3    7:astore_1        
			put(PdfName.CREATIONDATE, ((PdfObject) (pdfdate)));
		//    4    8:aload_0         
		//    5    9:getstatic       #53  <Field PdfName PdfName.CREATIONDATE>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			put(PdfName.MODDATE, ((PdfObject) (pdfdate)));
		//    8   16:aload_0         
		//    9   17:getstatic       #56  <Field PdfName PdfName.MODDATE>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//   12   24:return          
		}

		void addCreator(String s)
		{
			put(PdfName.CREATOR, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//    0    0:aload_0         
		//    1    1:getstatic       #60  <Field PdfName PdfName.CREATOR>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:ldc1            #40  <String "UnicodeBig">
		//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
		//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   17:return          
		}

		void addKeywords(String s)
		{
			put(PdfName.KEYWORDS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//    0    0:aload_0         
		//    1    1:getstatic       #64  <Field PdfName PdfName.KEYWORDS>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:ldc1            #40  <String "UnicodeBig">
		//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
		//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   17:return          
		}

		void addProducer()
		{
			put(PdfName.PRODUCER, ((PdfObject) (new PdfString(Version.getInstance().getVersion()))));
		//    0    0:aload_0         
		//    1    1:getstatic       #67  <Field PdfName PdfName.PRODUCER>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:invokestatic    #73  <Method Version Version.getInstance()>
		//    5   11:invokevirtual   #77  <Method String Version.getVersion()>
		//    6   14:invokespecial   #79  <Method void PdfString(String)>
		//    7   17:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   20:return          
		}

		void addSubject(String s)
		{
			put(PdfName.SUBJECT, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//    0    0:aload_0         
		//    1    1:getstatic       #82  <Field PdfName PdfName.SUBJECT>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:ldc1            #40  <String "UnicodeBig">
		//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
		//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   17:return          
		}

		void addTitle(String s)
		{
			put(PdfName.TITLE, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//    0    0:aload_0         
		//    1    1:getstatic       #85  <Field PdfName PdfName.TITLE>
		//    2    4:new             #38  <Class PdfString>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:ldc1            #40  <String "UnicodeBig">
		//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
		//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		//    8   17:return          
		}

		void addkey(String s, String s1)
		{
			if(s.equals("Producer") || s.equals("CreationDate"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #88  <String "Producer">
		//*   2    3:invokevirtual   #94  <Method boolean String.equals(Object)>
		//*   3    6:ifne            18
		//*   4    9:aload_1         
		//*   5   10:ldc1            #96  <String "CreationDate">
		//*   6   12:invokevirtual   #94  <Method boolean String.equals(Object)>
		//*   7   15:ifeq            19
			{
				return;
		//    8   18:return          
			} else
			{
				put(new PdfName(s), ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
		//    9   19:aload_0         
		//   10   20:new             #32  <Class PdfName>
		//   11   23:dup             
		//   12   24:aload_1         
		//   13   25:invokespecial   #97  <Method void PdfName(String)>
		//   14   28:new             #38  <Class PdfString>
		//   15   31:dup             
		//   16   32:aload_2         
		//   17   33:ldc1            #40  <String "UnicodeBig">
		//   18   35:invokespecial   #43  <Method void PdfString(String, String)>
		//   19   38:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
				return;
		//   20   41:return          
			}
		}

		PdfInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PdfDictionary()>
			addProducer();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #14  <Method void addProducer()>
			addCreationDate();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #17  <Method void addCreationDate()>
		//    6   12:return          
		}

		PdfInfo(String s, String s1, String s2)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void PdfDocument$PdfInfo()>
			addTitle(s1);
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #24  <Method void addTitle(String)>
			addSubject(s2);
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:invokevirtual   #27  <Method void addSubject(String)>
			addAuthor(s);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #30  <Method void addAuthor(String)>
		//   11   19:return          
		}
	}


	public PdfDocument()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void Document()>
		structElements = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #130 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #131 <Method void HashMap()>
	//    6   12:putfield        #133 <Field HashMap structElements>
		externallyStoredStructElements = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #130 <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #131 <Method void HashMap()>
	//   11   23:putfield        #135 <Field HashMap externallyStoredStructElements>
		elementsParents = new HashMap();
	//   12   26:aload_0         
	//   13   27:new             #130 <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #131 <Method void HashMap()>
	//   16   34:putfield        #137 <Field HashMap elementsParents>
		isToUseExternalCache = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #139 <Field boolean isToUseExternalCache>
		openMCDocument = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #141 <Field boolean openMCDocument>
		structParentIndices = new HashMap();
	//   23   47:aload_0         
	//   24   48:new             #130 <Class HashMap>
	//   25   51:dup             
	//   26   52:invokespecial   #131 <Method void HashMap()>
	//   27   55:putfield        #143 <Field HashMap structParentIndices>
		markPoints = new HashMap();
	//   28   58:aload_0         
	//   29   59:new             #130 <Class HashMap>
	//   30   62:dup             
	//   31   63:invokespecial   #131 <Method void HashMap()>
	//   32   66:putfield        #145 <Field HashMap markPoints>
		leading = 0.0F;
	//   33   69:aload_0         
	//   34   70:fconst_0        
	//   35   71:putfield        #147 <Field float leading>
		alignment = 0;
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:putfield        #149 <Field int alignment>
		currentHeight = 0.0F;
	//   39   79:aload_0         
	//   40   80:fconst_0        
	//   41   81:putfield        #151 <Field float currentHeight>
		isSectionTitle = false;
	//   42   84:aload_0         
	//   43   85:iconst_0        
	//   44   86:putfield        #153 <Field boolean isSectionTitle>
		anchorAction = null;
	//   45   89:aload_0         
	//   46   90:aconst_null     
	//   47   91:putfield        #155 <Field PdfAction anchorAction>
		leadingStack = new Stack();
	//   48   94:aload_0         
	//   49   95:new             #157 <Class Stack>
	//   50   98:dup             
	//   51   99:invokespecial   #158 <Method void Stack()>
	//   52  102:putfield        #160 <Field Stack leadingStack>
		firstPageEvent = true;
	//   53  105:aload_0         
	//   54  106:iconst_1        
	//   55  107:putfield        #162 <Field boolean firstPageEvent>
		line = null;
	//   56  110:aload_0         
	//   57  111:aconst_null     
	//   58  112:putfield        #164 <Field PdfLine line>
		lines = new ArrayList();
	//   59  115:aload_0         
	//   60  116:new             #166 <Class ArrayList>
	//   61  119:dup             
	//   62  120:invokespecial   #167 <Method void ArrayList()>
	//   63  123:putfield        #169 <Field ArrayList lines>
		lastElementType = -1;
	//   64  126:aload_0         
	//   65  127:iconst_m1       
	//   66  128:putfield        #171 <Field int lastElementType>
		indentation = new Indentation();
	//   67  131:aload_0         
	//   68  132:new             #9   <Class PdfDocument$Indentation>
	//   69  135:dup             
	//   70  136:invokespecial   #172 <Method void PdfDocument$Indentation()>
	//   71  139:putfield        #174 <Field PdfDocument$Indentation indentation>
		info = new PdfInfo();
	//   72  142:aload_0         
	//   73  143:new             #15  <Class PdfDocument$PdfInfo>
	//   74  146:dup             
	//   75  147:invokespecial   #175 <Method void PdfDocument$PdfInfo()>
	//   76  150:putfield        #177 <Field PdfDocument$PdfInfo info>
		viewerPreferences = new PdfViewerPreferencesImp();
	//   77  153:aload_0         
	//   78  154:new             #179 <Class PdfViewerPreferencesImp>
	//   79  157:dup             
	//   80  158:invokespecial   #180 <Method void PdfViewerPreferencesImp()>
	//   81  161:putfield        #182 <Field PdfViewerPreferencesImp viewerPreferences>
		localDestinations = new TreeMap();
	//   82  164:aload_0         
	//   83  165:new             #184 <Class TreeMap>
	//   84  168:dup             
	//   85  169:invokespecial   #185 <Method void TreeMap()>
	//   86  172:putfield        #187 <Field TreeMap localDestinations>
		documentLevelJS = new HashMap();
	//   87  175:aload_0         
	//   88  176:new             #130 <Class HashMap>
	//   89  179:dup             
	//   90  180:invokespecial   #131 <Method void HashMap()>
	//   91  183:putfield        #189 <Field HashMap documentLevelJS>
		documentFileAttachment = new HashMap();
	//   92  186:aload_0         
	//   93  187:new             #130 <Class HashMap>
	//   94  190:dup             
	//   95  191:invokespecial   #131 <Method void HashMap()>
	//   96  194:putfield        #191 <Field HashMap documentFileAttachment>
		nextPageSize = null;
	//   97  197:aload_0         
	//   98  198:aconst_null     
	//   99  199:putfield        #193 <Field Rectangle nextPageSize>
		thisBoxSize = new HashMap();
	//  100  202:aload_0         
	//  101  203:new             #130 <Class HashMap>
	//  102  206:dup             
	//  103  207:invokespecial   #131 <Method void HashMap()>
	//  104  210:putfield        #195 <Field HashMap thisBoxSize>
		boxSize = new HashMap();
	//  105  213:aload_0         
	//  106  214:new             #130 <Class HashMap>
	//  107  217:dup             
	//  108  218:invokespecial   #131 <Method void HashMap()>
	//  109  221:putfield        #197 <Field HashMap boxSize>
		pageEmpty = true;
	//  110  224:aload_0         
	//  111  225:iconst_1        
	//  112  226:putfield        #199 <Field boolean pageEmpty>
		pageAA = null;
	//  113  229:aload_0         
	//  114  230:aconst_null     
	//  115  231:putfield        #201 <Field PdfDictionary pageAA>
		strictImageSequence = false;
	//  116  234:aload_0         
	//  117  235:iconst_0        
	//  118  236:putfield        #203 <Field boolean strictImageSequence>
		imageEnd = -1F;
	//  119  239:aload_0         
	//  120  240:ldc1            #204 <Float -1F>
	//  121  242:putfield        #206 <Field float imageEnd>
		imageWait = null;
	//  122  245:aload_0         
	//  123  246:aconst_null     
	//  124  247:putfield        #208 <Field Image imageWait>
		floatingElements = new ArrayList();
	//  125  250:aload_0         
	//  126  251:new             #166 <Class ArrayList>
	//  127  254:dup             
	//  128  255:invokespecial   #167 <Method void ArrayList()>
	//  129  258:putfield        #210 <Field ArrayList floatingElements>
		addProducer();
	//  130  261:aload_0         
	//  131  262:invokevirtual   #214 <Method boolean addProducer()>
	//  132  265:pop             
		addCreationDate();
	//  133  266:aload_0         
	//  134  267:invokevirtual   #217 <Method boolean addCreationDate()>
	//  135  270:pop             
	//  136  271:return          
	}

	private void addDiv(PdfDiv pdfdiv)
		throws DocumentException
	{
		if(floatingElements == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field ArrayList floatingElements>
	//*   2    4:ifnonnull       18
			floatingElements = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #166 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #167 <Method void ArrayList()>
	//    7   15:putfield        #210 <Field ArrayList floatingElements>
		floatingElements.add(((Object) (pdfdiv)));
	//    8   18:aload_0         
	//    9   19:getfield        #210 <Field ArrayList floatingElements>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	private void flushFloatingElements()
		throws DocumentException
	{
		if(floatingElements == null || floatingElements.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field ArrayList floatingElements>
	//    2    4:ifnull          218
	//    3    7:aload_0         
	//    4    8:getfield        #210 <Field ArrayList floatingElements>
	//    5   11:invokevirtual   #232 <Method boolean ArrayList.isEmpty()>
	//    6   14:ifne            218
_L1:
		int i;
		FloatLayout floatlayout;
		ArrayList arraylist = floatingElements;
	//    7   17:aload_0         
	//    8   18:getfield        #210 <Field ArrayList floatingElements>
	//    9   21:astore_2        
		floatingElements = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #210 <Field ArrayList floatingElements>
		floatlayout = new FloatLayout(((java.util.List) (arraylist)), false);
	//   13   27:new             #234 <Class FloatLayout>
	//   14   30:dup             
	//   15   31:aload_2         
	//   16   32:iconst_0        
	//   17   33:invokespecial   #237 <Method void FloatLayout(java.util.List, boolean)>
	//   18   36:astore_3        
		i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_1        
_L7:
		indentLeft();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #241 <Method float indentLeft()>
	//   23   43:pop             
		floatlayout.setSimpleColumn(indentLeft(), indentBottom(), indentRight(), indentTop() - currentHeight);
	//   24   44:aload_3         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #241 <Method float indentLeft()>
	//   27   49:aload_0         
	//   28   50:invokevirtual   #244 <Method float indentBottom()>
	//   29   53:aload_0         
	//   30   54:invokevirtual   #247 <Method float indentRight()>
	//   31   57:aload_0         
	//   32   58:invokevirtual   #250 <Method float indentTop()>
	//   33   61:aload_0         
	//   34   62:getfield        #151 <Field float currentHeight>
	//   35   65:fsub            
	//   36   66:invokevirtual   #254 <Method void FloatLayout.setSimpleColumn(float, float, float, float)>
		if(!isTagged(writer)) goto _L4; else goto _L3
	//   37   69:aload_0         
	//   38   70:getfield        #256 <Field PdfWriter writer>
	//   39   73:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//   40   76:ifeq            134
_L3:
		PdfContentByte pdfcontentbyte = text;
	//   41   79:aload_0         
	//   42   80:getfield        #262 <Field PdfContentByte text>
	//   43   83:astore_2        
_L5:
		if((floatlayout.layout(pdfcontentbyte, false) & 1) == 0)
			break MISSING_BLOCK_LABEL_172;
	//   44   84:aload_3         
	//   45   85:aload_2         
	//   46   86:iconst_0        
	//   47   87:invokevirtual   #266 <Method int FloatLayout.layout(PdfContentByte, boolean)>
	//   48   90:iconst_1        
	//   49   91:iand            
	//   50   92:ifeq            172
		if(!isTagged(writer))
			break MISSING_BLOCK_LABEL_145;
	//   51   95:aload_0         
	//   52   96:getfield        #256 <Field PdfWriter writer>
	//   53   99:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//   54  102:ifeq            145
		text.setTextMatrix(indentLeft(), floatlayout.getYLine());
	//   55  105:aload_0         
	//   56  106:getfield        #262 <Field PdfContentByte text>
	//   57  109:aload_0         
	//   58  110:invokevirtual   #241 <Method float indentLeft()>
	//   59  113:aload_3         
	//   60  114:invokevirtual   #269 <Method float FloatLayout.getYLine()>
	//   61  117:invokevirtual   #275 <Method void PdfContentByte.setTextMatrix(float, float)>
_L6:
		currentHeight = indentTop() - floatlayout.getYLine();
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:invokevirtual   #250 <Method float indentTop()>
	//   65  125:aload_3         
	//   66  126:invokevirtual   #269 <Method float FloatLayout.getYLine()>
	//   67  129:fsub            
	//   68  130:putfield        #151 <Field float currentHeight>
		return;
	//   69  133:return          
_L4:
		try
		{
			pdfcontentbyte = writer.getDirectContent();
	//   70  134:aload_0         
	//   71  135:getfield        #256 <Field PdfWriter writer>
	//   72  138:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//   73  141:astore_2        
		}
	//*  74  142:goto            84
	//*  75  145:aload_0         
	//*  76  146:getfield        #262 <Field PdfContentByte text>
	//*  77  149:fconst_0        
	//*  78  150:aload_3         
	//*  79  151:invokevirtual   #269 <Method float FloatLayout.getYLine()>
	//*  80  154:aload_0         
	//*  81  155:invokevirtual   #250 <Method float indentTop()>
	//*  82  158:fsub            
	//*  83  159:aload_0         
	//*  84  160:getfield        #151 <Field float currentHeight>
	//*  85  163:fadd            
	//*  86  164:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//*  87  167:goto            120
		catch(Exception exception)
	//*  88  170:astore_2        
		{
			return;
	//   89  171:return          
		}
		  goto _L5
		text.moveText(0.0F, (floatlayout.getYLine() - indentTop()) + currentHeight);
		  goto _L6
		if(indentTop() - currentHeight == floatlayout.getYLine() || isPageEmpty())
	//*  90  172:aload_0         
	//*  91  173:invokevirtual   #250 <Method float indentTop()>
	//*  92  176:aload_0         
	//*  93  177:getfield        #151 <Field float currentHeight>
	//*  94  180:fsub            
	//*  95  181:aload_3         
	//*  96  182:invokevirtual   #269 <Method float FloatLayout.getYLine()>
	//*  97  185:fcmpl           
	//*  98  186:ifeq            196
	//*  99  189:aload_0         
	//* 100  190:invokevirtual   #287 <Method boolean isPageEmpty()>
	//* 101  193:ifeq            213
			i++;
	//  102  196:iload_1         
	//  103  197:iconst_1        
	//  104  198:iadd            
	//  105  199:istore_1        
		else
	//* 106  200:iload_1         
	//* 107  201:iconst_2        
	//* 108  202:icmpeq          218
	//* 109  205:aload_0         
	//* 110  206:invokevirtual   #290 <Method boolean newPage()>
	//* 111  209:pop             
	//* 112  210:goto            39
			i = 0;
	//  113  213:iconst_0        
	//  114  214:istore_1        
		if(i == 2)
			break; /* Loop/switch isn't completed */
		newPage();
		if(true) goto _L7; else goto _L2
	//* 115  215:goto            200
_L2:
	//  116  218:return          
	}

	private PdfLine getLastLine()
	{
		if(lines.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field ArrayList lines>
	//*   2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//*   3    7:ifle            30
			return (PdfLine)lines.get(lines.size() - 1);
	//    4   10:aload_0         
	//    5   11:getfield        #169 <Field ArrayList lines>
	//    6   14:aload_0         
	//    7   15:getfield        #169 <Field ArrayList lines>
	//    8   18:invokevirtual   #296 <Method int ArrayList.size()>
	//    9   21:iconst_1        
	//   10   22:isub            
	//   11   23:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #302 <Class PdfLine>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	private static boolean isTagged(PdfWriter pdfwriter)
	{
		return pdfwriter != null && pdfwriter.isTagged();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #304 <Method boolean PdfWriter.isTagged()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	protected void add(Image image)
		throws PdfException, DocumentException
	{
		if(image.hasAbsoluteY())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #312 <Method boolean Image.hasAbsoluteY()>
	//*   2    4:ifeq            21
		{
			graphics.addImage(image);
	//    3    7:aload_0         
	//    4    8:getfield        #314 <Field PdfContentByte graphics>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #317 <Method void PdfContentByte.addImage(Image)>
			pageEmpty = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #199 <Field boolean pageEmpty>
		} else
	//*  10   20:return          
		{
			if(currentHeight != 0.0F && indentTop() - currentHeight - image.getScaledHeight() < indentBottom())
	//*  11   21:aload_0         
	//*  12   22:getfield        #151 <Field float currentHeight>
	//*  13   25:fconst_0        
	//*  14   26:fcmpl           
	//*  15   27:ifeq            114
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #250 <Method float indentTop()>
	//*  18   34:aload_0         
	//*  19   35:getfield        #151 <Field float currentHeight>
	//*  20   38:fsub            
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//*  23   43:fsub            
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #244 <Method float indentBottom()>
	//*  26   48:fcmpg           
	//*  27   49:ifge            114
			{
				if(!strictImageSequence && imageWait == null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #203 <Field boolean strictImageSequence>
	//*  30   56:ifne            72
	//*  31   59:aload_0         
	//*  32   60:getfield        #208 <Field Image imageWait>
	//*  33   63:ifnonnull       72
				{
					imageWait = image;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:putfield        #208 <Field Image imageWait>
					return;
	//   37   71:return          
				}
				newPage();
	//   38   72:aload_0         
	//   39   73:invokevirtual   #290 <Method boolean newPage()>
	//   40   76:pop             
				if(currentHeight != 0.0F && indentTop() - currentHeight - image.getScaledHeight() < indentBottom())
	//*  41   77:aload_0         
	//*  42   78:getfield        #151 <Field float currentHeight>
	//*  43   81:fconst_0        
	//*  44   82:fcmpl           
	//*  45   83:ifeq            114
	//*  46   86:aload_0         
	//*  47   87:invokevirtual   #250 <Method float indentTop()>
	//*  48   90:aload_0         
	//*  49   91:getfield        #151 <Field float currentHeight>
	//*  50   94:fsub            
	//*  51   95:aload_1         
	//*  52   96:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//*  53   99:fsub            
	//*  54  100:aload_0         
	//*  55  101:invokevirtual   #244 <Method float indentBottom()>
	//*  56  104:fcmpg           
	//*  57  105:ifge            114
				{
					imageWait = image;
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:putfield        #208 <Field Image imageWait>
					return;
	//   61  113:return          
				}
			}
			pageEmpty = false;
	//   62  114:aload_0         
	//   63  115:iconst_0        
	//   64  116:putfield        #199 <Field boolean pageEmpty>
			if(image == imageWait)
	//*  65  119:aload_1         
	//*  66  120:aload_0         
	//*  67  121:getfield        #208 <Field Image imageWait>
	//*  68  124:if_acmpne       132
				imageWait = null;
	//   69  127:aload_0         
	//   70  128:aconst_null     
	//   71  129:putfield        #208 <Field Image imageWait>
			float f;
			float f1;
			float f2;
			float f3;
			float f4;
			boolean flag;
			boolean flag1;
			float af[];
			if((image.getAlignment() & 4) == 4 && (image.getAlignment() & 1) != 1)
	//*  72  132:aload_1         
	//*  73  133:invokevirtual   #323 <Method int Image.getAlignment()>
	//*  74  136:iconst_4        
	//*  75  137:iand            
	//*  76  138:iconst_4        
	//*  77  139:icmpne          473
	//*  78  142:aload_1         
	//*  79  143:invokevirtual   #323 <Method int Image.getAlignment()>
	//*  80  146:iconst_1        
	//*  81  147:iand            
	//*  82  148:iconst_1        
	//*  83  149:icmpeq          473
				flag = true;
	//   84  152:iconst_1        
	//   85  153:istore          7
			else
	//*  86  155:aload_1         
	//*  87  156:invokevirtual   #323 <Method int Image.getAlignment()>
	//*  88  159:bipush          8
	//*  89  161:iand            
	//*  90  162:bipush          8
	//*  91  164:icmpne          479
	//*  92  167:iconst_1        
	//*  93  168:istore          8
	//*  94  170:aload_0         
	//*  95  171:getfield        #147 <Field float leading>
	//*  96  174:fconst_2        
	//*  97  175:fdiv            
	//*  98  176:fstore_2        
	//*  99  177:fload_2         
	//* 100  178:fstore_3        
	//* 101  179:iload           7
	//* 102  181:ifeq            191
	//* 103  184:fload_2         
	//* 104  185:aload_0         
	//* 105  186:getfield        #147 <Field float leading>
	//* 106  189:fadd            
	//* 107  190:fstore_3        
	//* 108  191:aload_0         
	//* 109  192:invokevirtual   #250 <Method float indentTop()>
	//* 110  195:fstore          4
	//* 111  197:aload_0         
	//* 112  198:getfield        #151 <Field float currentHeight>
	//* 113  201:fstore          5
	//* 114  203:aload_1         
	//* 115  204:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//* 116  207:fstore          6
	//* 117  209:aload_1         
	//* 118  210:invokevirtual   #327 <Method float[] Image.matrix()>
	//* 119  213:astore          9
	//* 120  215:aload_0         
	//* 121  216:invokevirtual   #241 <Method float indentLeft()>
	//* 122  219:aload           9
	//* 123  221:iconst_4        
	//* 124  222:faload          
	//* 125  223:fsub            
	//* 126  224:fstore_2        
	//* 127  225:aload_1         
	//* 128  226:invokevirtual   #323 <Method int Image.getAlignment()>
	//* 129  229:iconst_2        
	//* 130  230:iand            
	//* 131  231:iconst_2        
	//* 132  232:icmpne          250
	//* 133  235:aload_0         
	//* 134  236:invokevirtual   #247 <Method float indentRight()>
	//* 135  239:aload_1         
	//* 136  240:invokevirtual   #330 <Method float Image.getScaledWidth()>
	//* 137  243:fsub            
	//* 138  244:aload           9
	//* 139  246:iconst_4        
	//* 140  247:faload          
	//* 141  248:fsub            
	//* 142  249:fstore_2        
	//* 143  250:aload_1         
	//* 144  251:invokevirtual   #323 <Method int Image.getAlignment()>
	//* 145  254:iconst_1        
	//* 146  255:iand            
	//* 147  256:iconst_1        
	//* 148  257:icmpne          287
	//* 149  260:aload_0         
	//* 150  261:invokevirtual   #241 <Method float indentLeft()>
	//* 151  264:aload_0         
	//* 152  265:invokevirtual   #247 <Method float indentRight()>
	//* 153  268:aload_0         
	//* 154  269:invokevirtual   #241 <Method float indentLeft()>
	//* 155  272:fsub            
	//* 156  273:aload_1         
	//* 157  274:invokevirtual   #330 <Method float Image.getScaledWidth()>
	//* 158  277:fsub            
	//* 159  278:fconst_2        
	//* 160  279:fdiv            
	//* 161  280:fadd            
	//* 162  281:aload           9
	//* 163  283:iconst_4        
	//* 164  284:faload          
	//* 165  285:fsub            
	//* 166  286:fstore_2        
	//* 167  287:aload_1         
	//* 168  288:invokevirtual   #333 <Method boolean Image.hasAbsoluteX()>
	//* 169  291:ifeq            299
	//* 170  294:aload_1         
	//* 171  295:invokevirtual   #336 <Method float Image.getAbsoluteX()>
	//* 172  298:fstore_2        
	//* 173  299:iload           7
	//* 174  301:ifeq            514
	//* 175  304:aload_0         
	//* 176  305:getfield        #206 <Field float imageEnd>
	//* 177  308:fconst_0        
	//* 178  309:fcmpg           
	//* 179  310:iflt            332
	//* 180  313:aload_0         
	//* 181  314:getfield        #206 <Field float imageEnd>
	//* 182  317:aload_0         
	//* 183  318:getfield        #151 <Field float currentHeight>
	//* 184  321:aload_1         
	//* 185  322:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//* 186  325:fadd            
	//* 187  326:fload_3         
	//* 188  327:fadd            
	//* 189  328:fcmpg           
	//* 190  329:ifge            347
	//* 191  332:aload_0         
	//* 192  333:aload_0         
	//* 193  334:getfield        #151 <Field float currentHeight>
	//* 194  337:aload_1         
	//* 195  338:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//* 196  341:fadd            
	//* 197  342:fload_3         
	//* 198  343:fadd            
	//* 199  344:putfield        #206 <Field float imageEnd>
	//* 200  347:aload_1         
	//* 201  348:invokevirtual   #323 <Method int Image.getAlignment()>
	//* 202  351:iconst_2        
	//* 203  352:iand            
	//* 204  353:iconst_2        
	//* 205  354:icmpne          485
	//* 206  357:aload_0         
	//* 207  358:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 208  361:astore          10
	//* 209  363:aload           10
	//* 210  365:aload           10
	//* 211  367:getfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
	//* 212  370:aload_1         
	//* 213  371:invokevirtual   #330 <Method float Image.getScaledWidth()>
	//* 214  374:aload_1         
	//* 215  375:invokevirtual   #342 <Method float Image.getIndentationLeft()>
	//* 216  378:fadd            
	//* 217  379:fadd            
	//* 218  380:putfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
	//* 219  383:aload_0         
	//* 220  384:getfield        #314 <Field PdfContentByte graphics>
	//* 221  387:aload_1         
	//* 222  388:aload           9
	//* 223  390:iconst_0        
	//* 224  391:faload          
	//* 225  392:aload           9
	//* 226  394:iconst_1        
	//* 227  395:faload          
	//* 228  396:aload           9
	//* 229  398:iconst_2        
	//* 230  399:faload          
	//* 231  400:aload           9
	//* 232  402:iconst_3        
	//* 233  403:faload          
	//* 234  404:fload_2         
	//* 235  405:fload           4
	//* 236  407:fload           5
	//* 237  409:fsub            
	//* 238  410:fload           6
	//* 239  412:fsub            
	//* 240  413:fload_3         
	//* 241  414:fsub            
	//* 242  415:aload           9
	//* 243  417:iconst_5        
	//* 244  418:faload          
	//* 245  419:fsub            
	//* 246  420:invokevirtual   #345 <Method void PdfContentByte.addImage(Image, float, float, float, float, float, float)>
	//* 247  423:iload           7
	//* 248  425:ifne            20
	//* 249  428:iload           8
	//* 250  430:ifne            20
	//* 251  433:aload_0         
	//* 252  434:aload_0         
	//* 253  435:getfield        #151 <Field float currentHeight>
	//* 254  438:aload_1         
	//* 255  439:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//* 256  442:fload_3         
	//* 257  443:fadd            
	//* 258  444:fadd            
	//* 259  445:putfield        #151 <Field float currentHeight>
	//* 260  448:aload_0         
	//* 261  449:invokevirtual   #348 <Method float flushLines()>
	//* 262  452:pop             
	//* 263  453:aload_0         
	//* 264  454:getfield        #262 <Field PdfContentByte text>
	//* 265  457:fconst_0        
	//* 266  458:aload_1         
	//* 267  459:invokevirtual   #320 <Method float Image.getScaledHeight()>
	//* 268  462:fload_3         
	//* 269  463:fadd            
	//* 270  464:fneg            
	//* 271  465:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//* 272  468:aload_0         
	//* 273  469:invokevirtual   #351 <Method void newLine()>
	//* 274  472:return          
				flag = false;
	//  275  473:iconst_0        
	//  276  474:istore          7
			if((image.getAlignment() & 8) == 8)
				flag1 = true;
			else
	//* 277  476:goto            155
				flag1 = false;
	//  278  479:iconst_0        
	//  279  480:istore          8
			f = leading / 2.0F;
			f1 = f;
			if(flag)
				f1 = f + leading;
			f2 = indentTop();
			f3 = currentHeight;
			f4 = image.getScaledHeight();
			af = image.matrix();
			f = indentLeft() - af[4];
			if((image.getAlignment() & 2) == 2)
				f = indentRight() - image.getScaledWidth() - af[4];
			if((image.getAlignment() & 1) == 1)
				f = (indentLeft() + (indentRight() - indentLeft() - image.getScaledWidth()) / 2.0F) - af[4];
			if(image.hasAbsoluteX())
				f = image.getAbsoluteX();
			if(flag)
			{
				if(imageEnd < 0.0F || imageEnd < currentHeight + image.getScaledHeight() + f1)
					imageEnd = currentHeight + image.getScaledHeight() + f1;
				if((image.getAlignment() & 2) == 2)
				{
					Indentation indentation1 = indentation;
					indentation1.imageIndentRight = indentation1.imageIndentRight + (image.getScaledWidth() + image.getIndentationLeft());
				} else
	//* 280  482:goto            170
				{
					Indentation indentation2 = indentation;
	//  281  485:aload_0         
	//  282  486:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  283  489:astore          10
					indentation2.imageIndentLeft = indentation2.imageIndentLeft + (image.getScaledWidth() + image.getIndentationRight());
	//  284  491:aload           10
	//  285  493:aload           10
	//  286  495:getfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
	//  287  498:aload_1         
	//  288  499:invokevirtual   #330 <Method float Image.getScaledWidth()>
	//  289  502:aload_1         
	//  290  503:invokevirtual   #357 <Method float Image.getIndentationRight()>
	//  291  506:fadd            
	//  292  507:fadd            
	//  293  508:putfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
				}
			} else
	//* 294  511:goto            383
			if((image.getAlignment() & 2) == 2)
	//* 295  514:aload_1         
	//* 296  515:invokevirtual   #323 <Method int Image.getAlignment()>
	//* 297  518:iconst_2        
	//* 298  519:iand            
	//* 299  520:iconst_2        
	//* 300  521:icmpne          534
				f -= image.getIndentationRight();
	//  301  524:fload_2         
	//  302  525:aload_1         
	//  303  526:invokevirtual   #357 <Method float Image.getIndentationRight()>
	//  304  529:fsub            
	//  305  530:fstore_2        
			else
	//* 306  531:goto            383
			if((image.getAlignment() & 1) == 1)
	//* 307  534:aload_1         
	//* 308  535:invokevirtual   #323 <Method int Image.getAlignment()>
	//* 309  538:iconst_1        
	//* 310  539:iand            
	//* 311  540:iconst_1        
	//* 312  541:icmpne          559
				f += image.getIndentationLeft() - image.getIndentationRight();
	//  313  544:fload_2         
	//  314  545:aload_1         
	//  315  546:invokevirtual   #342 <Method float Image.getIndentationLeft()>
	//  316  549:aload_1         
	//  317  550:invokevirtual   #357 <Method float Image.getIndentationRight()>
	//  318  553:fsub            
	//  319  554:fadd            
	//  320  555:fstore_2        
			else
	//* 321  556:goto            383
				f += image.getIndentationLeft();
	//  322  559:fload_2         
	//  323  560:aload_1         
	//  324  561:invokevirtual   #342 <Method float Image.getIndentationLeft()>
	//  325  564:fadd            
	//  326  565:fstore_2        
			graphics.addImage(image, af[0], af[1], af[2], af[3], f, f2 - f3 - f4 - f1 - af[5]);
			if(!flag && !flag1)
			{
				currentHeight = currentHeight + (image.getScaledHeight() + f1);
				flushLines();
				text.moveText(0.0F, -(image.getScaledHeight() + f1));
				newLine();
				return;
			}
		}
	//* 327  566:goto            383
	}

	public boolean add(Element element)
		throws DocumentException
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		if(element.type() != 37)
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #366 <Method int Element.type()>
	//*  11   25:bipush          37
	//*  12   27:icmpeq          34
			flushFloatingElements();
	//   13   30:aload_0         
	//   14   31:invokespecial   #368 <Method void flushFloatingElements()>
		element.type();
	//   15   34:aload_1         
	//   16   35:invokeinterface #366 <Method int Element.type()>
		JVM INSTR lookupswitch 30: default 2706
	//	               0: 292
	//	               1: 325
	//	               2: 352
	//	               3: 369
	//	               4: 386
	//	               5: 434
	//	               6: 444
	//	               7: 403
	//	               8: 420
	//	               10: 454
	//	               11: 771
	//	               12: 834
	//	               13: 1438
	//	               14: 1917
	//	               15: 2087
	//	               16: 1438
	//	               17: 563
	//	               23: 2373
	//	               29: 627
	//	               30: 2350
	//	               32: 2419
	//	               33: 2419
	//	               34: 2419
	//	               35: 2419
	//	               36: 2419
	//	               37: 2659
	//	               38: 2684
	//	               50: 2595
	//	               55: 2502
	//	               666: 2635;
	//   17   40:lookupswitch    30: default 2706
	//	               0: 292
	//	               1: 325
	//	               2: 352
	//	               3: 369
	//	               4: 386
	//	               5: 434
	//	               6: 444
	//	               7: 403
	//	               8: 420
	//	               10: 454
	//	               11: 771
	//	               12: 834
	//	               13: 1438
	//	               14: 1917
	//	               15: 2087
	//	               16: 1438
	//	               17: 563
	//	               23: 2373
	//	               29: 627
	//	               30: 2350
	//	               32: 2419
	//	               33: 2419
	//	               34: 2419
	//	               35: 2419
	//	               36: 2419
	//	               37: 2659
	//	               38: 2684
	//	               50: 2595
	//	               55: 2502
	//	               666: 2635
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L14 _L17 _L18 _L19 _L20 _L21 _L21 _L21 _L21 _L21 _L22 _L23 _L24 _L25 _L26
_L2:
		info.addkey(((Meta)element).getName(), ((Meta)element).getContent());
	//   18  292:aload_0         
	//   19  293:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   20  296:aload_1         
	//   21  297:checkcast       #370 <Class Meta>
	//   22  300:invokevirtual   #374 <Method String Meta.getName()>
	//   23  303:aload_1         
	//   24  304:checkcast       #370 <Class Meta>
	//   25  307:invokevirtual   #377 <Method String Meta.getContent()>
	//   26  310:invokevirtual   #381 <Method void PdfDocument$PdfInfo.addkey(String, String)>
_L27:
		lastElementType = element.type();
	//   27  313:aload_0         
	//   28  314:aload_1         
	//   29  315:invokeinterface #366 <Method int Element.type()>
	//   30  320:putfield        #171 <Field int lastElementType>
		return true;
	//   31  323:iconst_1        
	//   32  324:ireturn         
_L3:
		try
		{
			info.addTitle(((Meta)element).getContent());
	//   33  325:aload_0         
	//   34  326:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   35  329:aload_1         
	//   36  330:checkcast       #370 <Class Meta>
	//   37  333:invokevirtual   #377 <Method String Meta.getContent()>
	//   38  336:invokevirtual   #384 <Method void PdfDocument$PdfInfo.addTitle(String)>
		}
	//*  39  339:goto            313
		// Misplaced declaration of an exception variable
		catch(Element element)
	//*  40  342:astore_1        
		{
			throw new DocumentException(((Exception) (element)));
	//   41  343:new             #221 <Class DocumentException>
	//   42  346:dup             
	//   43  347:aload_1         
	//   44  348:invokespecial   #387 <Method void DocumentException(Exception)>
	//   45  351:athrow          
		}
		  goto _L27
_L4:
		info.addSubject(((Meta)element).getContent());
	//   46  352:aload_0         
	//   47  353:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   48  356:aload_1         
	//   49  357:checkcast       #370 <Class Meta>
	//   50  360:invokevirtual   #377 <Method String Meta.getContent()>
	//   51  363:invokevirtual   #390 <Method void PdfDocument$PdfInfo.addSubject(String)>
		  goto _L27
	//*  52  366:goto            313
_L5:
		info.addKeywords(((Meta)element).getContent());
	//   53  369:aload_0         
	//   54  370:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   55  373:aload_1         
	//   56  374:checkcast       #370 <Class Meta>
	//   57  377:invokevirtual   #377 <Method String Meta.getContent()>
	//   58  380:invokevirtual   #393 <Method void PdfDocument$PdfInfo.addKeywords(String)>
		  goto _L27
	//*  59  383:goto            313
_L6:
		info.addAuthor(((Meta)element).getContent());
	//   60  386:aload_0         
	//   61  387:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   62  390:aload_1         
	//   63  391:checkcast       #370 <Class Meta>
	//   64  394:invokevirtual   #377 <Method String Meta.getContent()>
	//   65  397:invokevirtual   #396 <Method void PdfDocument$PdfInfo.addAuthor(String)>
		  goto _L27
	//*  66  400:goto            313
_L9:
		info.addCreator(((Meta)element).getContent());
	//   67  403:aload_0         
	//   68  404:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   69  407:aload_1         
	//   70  408:checkcast       #370 <Class Meta>
	//   71  411:invokevirtual   #377 <Method String Meta.getContent()>
	//   72  414:invokevirtual   #399 <Method void PdfDocument$PdfInfo.addCreator(String)>
		  goto _L27
	//*  73  417:goto            313
_L10:
		setLanguage(((Meta)element).getContent());
	//   74  420:aload_0         
	//   75  421:aload_1         
	//   76  422:checkcast       #370 <Class Meta>
	//   77  425:invokevirtual   #377 <Method String Meta.getContent()>
	//   78  428:invokevirtual   #402 <Method void setLanguage(String)>
		  goto _L27
	//*  79  431:goto            313
_L7:
		info.addProducer();
	//   80  434:aload_0         
	//   81  435:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   82  438:invokevirtual   #404 <Method void PdfDocument$PdfInfo.addProducer()>
		  goto _L27
	//*  83  441:goto            313
_L8:
		info.addCreationDate();
	//   84  444:aload_0         
	//   85  445:getfield        #177 <Field PdfDocument$PdfInfo info>
	//   86  448:invokevirtual   #406 <Method void PdfDocument$PdfInfo.addCreationDate()>
		  goto _L27
	//*  87  451:goto            313
_L11:
		Object obj;
		if(line == null)
	//*  88  454:aload_0         
	//*  89  455:getfield        #164 <Field PdfLine line>
	//*  90  458:ifnonnull       465
			carriageReturn();
	//   91  461:aload_0         
	//   92  462:invokevirtual   #409 <Method void carriageReturn()>
		obj = ((Object) (new PdfChunk((Chunk)element, anchorAction, tabSettings)));
	//   93  465:new             #411 <Class PdfChunk>
	//   94  468:dup             
	//   95  469:aload_1         
	//   96  470:checkcast       #413 <Class Chunk>
	//   97  473:aload_0         
	//   98  474:getfield        #155 <Field PdfAction anchorAction>
	//   99  477:aload_0         
	//  100  478:getfield        #415 <Field TabSettings tabSettings>
	//  101  481:invokespecial   #418 <Method void PdfChunk(Chunk, PdfAction, TabSettings)>
	//  102  484:astore          12
_L29:
		Object obj1 = ((Object) (line.add(((PdfChunk) (obj)), leading)));
	//  103  486:aload_0         
	//  104  487:getfield        #164 <Field PdfLine line>
	//  105  490:aload           12
	//  106  492:aload_0         
	//  107  493:getfield        #147 <Field float leading>
	//  108  496:invokevirtual   #421 <Method PdfChunk PdfLine.add(PdfChunk, float)>
	//  109  499:astore          13
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_539;
	//  110  501:aload           13
	//  111  503:ifnull          539
		boolean flag1;
		carriageReturn();
	//  112  506:aload_0         
	//  113  507:invokevirtual   #409 <Method void carriageReturn()>
		flag1 = ((PdfChunk) (obj)).isNewlineSplit();
	//  114  510:aload           12
	//  115  512:invokevirtual   #424 <Method boolean PdfChunk.isNewlineSplit()>
	//  116  515:istore          11
		obj = obj1;
	//  117  517:aload           13
	//  118  519:astore          12
		if(flag1) goto _L29; else goto _L28
	//  119  521:iload           11
	//  120  523:ifne            486
_L28:
		((PdfChunk) (obj1)).trimFirstSpace();
	//  121  526:aload           13
	//  122  528:invokevirtual   #427 <Method float PdfChunk.trimFirstSpace()>
	//  123  531:pop             
		obj = obj1;
	//  124  532:aload           13
	//  125  534:astore          12
		  goto _L29
	//* 126  536:goto            486
		pageEmpty = false;
	//  127  539:aload_0         
	//  128  540:iconst_0        
	//  129  541:putfield        #199 <Field boolean pageEmpty>
		if(((PdfChunk) (obj)).isAttribute("NEWPAGE"))
	//* 130  544:aload           12
	//* 131  546:ldc2            #429 <String "NEWPAGE">
	//* 132  549:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 133  552:ifeq            313
			newPage();
	//  134  555:aload_0         
	//  135  556:invokevirtual   #290 <Method boolean newPage()>
	//  136  559:pop             
		  goto _L27
	//* 137  560:goto            313
_L17:
		obj = ((Object) ((Anchor)element));
	//  138  563:aload_1         
	//  139  564:checkcast       #435 <Class Anchor>
	//  140  567:astore          12
		obj1 = ((Object) (((Anchor) (obj)).getReference()));
	//  141  569:aload           12
	//  142  571:invokevirtual   #438 <Method String Anchor.getReference()>
	//  143  574:astore          13
		leading = ((Anchor) (obj)).getLeading();
	//  144  576:aload_0         
	//  145  577:aload           12
	//  146  579:invokevirtual   #441 <Method float Anchor.getLeading()>
	//  147  582:putfield        #147 <Field float leading>
		pushLeading();
	//  148  585:aload_0         
	//  149  586:invokevirtual   #444 <Method void pushLeading()>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_607;
	//  150  589:aload           13
	//  151  591:ifnull          607
		anchorAction = new PdfAction(((String) (obj1)));
	//  152  594:aload_0         
	//  153  595:new             #446 <Class PdfAction>
	//  154  598:dup             
	//  155  599:aload           13
	//  156  601:invokespecial   #447 <Method void PdfAction(String)>
	//  157  604:putfield        #155 <Field PdfAction anchorAction>
		element.process(((com.itextpdf.text.ElementListener) (this)));
	//  158  607:aload_1         
	//  159  608:aload_0         
	//  160  609:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//  161  614:pop             
		anchorAction = null;
	//  162  615:aload_0         
	//  163  616:aconst_null     
	//  164  617:putfield        #155 <Field PdfAction anchorAction>
		popLeading();
	//  165  620:aload_0         
	//  166  621:invokevirtual   #454 <Method void popLeading()>
		  goto _L27
	//* 167  624:goto            313
_L19:
		if(line == null)
	//* 168  627:aload_0         
	//* 169  628:getfield        #164 <Field PdfLine line>
	//* 170  631:ifnonnull       638
			carriageReturn();
	//  171  634:aload_0         
	//  172  635:invokevirtual   #409 <Method void carriageReturn()>
		obj1 = ((Object) ((Annotation)element));
	//  173  638:aload_1         
	//  174  639:checkcast       #456 <Class Annotation>
	//  175  642:astore          13
		obj = ((Object) (new Rectangle(0.0F, 0.0F)));
	//  176  644:new             #458 <Class Rectangle>
	//  177  647:dup             
	//  178  648:fconst_0        
	//  179  649:fconst_0        
	//  180  650:invokespecial   #460 <Method void Rectangle(float, float)>
	//  181  653:astore          12
		if(line != null)
	//* 182  655:aload_0         
	//* 183  656:getfield        #164 <Field PdfLine line>
	//* 184  659:ifnull          741
			obj = ((Object) (new Rectangle(((Annotation) (obj1)).llx(indentRight() - line.widthLeft()), ((Annotation) (obj1)).ury(indentTop() - currentHeight - 20F), ((Annotation) (obj1)).urx((indentRight() - line.widthLeft()) + 20F), ((Annotation) (obj1)).lly(indentTop() - currentHeight))));
	//  185  662:new             #458 <Class Rectangle>
	//  186  665:dup             
	//  187  666:aload           13
	//  188  668:aload_0         
	//  189  669:invokevirtual   #247 <Method float indentRight()>
	//  190  672:aload_0         
	//  191  673:getfield        #164 <Field PdfLine line>
	//  192  676:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//  193  679:fsub            
	//  194  680:invokevirtual   #467 <Method float Annotation.llx(float)>
	//  195  683:aload           13
	//  196  685:aload_0         
	//  197  686:invokevirtual   #250 <Method float indentTop()>
	//  198  689:aload_0         
	//  199  690:getfield        #151 <Field float currentHeight>
	//  200  693:fsub            
	//  201  694:ldc2            #468 <Float 20F>
	//  202  697:fsub            
	//  203  698:invokevirtual   #471 <Method float Annotation.ury(float)>
	//  204  701:aload           13
	//  205  703:aload_0         
	//  206  704:invokevirtual   #247 <Method float indentRight()>
	//  207  707:aload_0         
	//  208  708:getfield        #164 <Field PdfLine line>
	//  209  711:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//  210  714:fsub            
	//  211  715:ldc2            #468 <Float 20F>
	//  212  718:fadd            
	//  213  719:invokevirtual   #474 <Method float Annotation.urx(float)>
	//  214  722:aload           13
	//  215  724:aload_0         
	//  216  725:invokevirtual   #250 <Method float indentTop()>
	//  217  728:aload_0         
	//  218  729:getfield        #151 <Field float currentHeight>
	//  219  732:fsub            
	//  220  733:invokevirtual   #477 <Method float Annotation.lly(float)>
	//  221  736:invokespecial   #479 <Method void Rectangle(float, float, float, float)>
	//  222  739:astore          12
		obj = ((Object) (PdfAnnotationsImp.convertAnnotation(writer, ((Annotation) (obj1)), ((Rectangle) (obj)))));
	//  223  741:aload_0         
	//  224  742:getfield        #256 <Field PdfWriter writer>
	//  225  745:aload           13
	//  226  747:aload           12
	//  227  749:invokestatic    #485 <Method PdfAnnotation PdfAnnotationsImp.convertAnnotation(PdfWriter, Annotation, Rectangle)>
	//  228  752:astore          12
		annotationsImp.addPlainAnnotation(((PdfAnnotation) (obj)));
	//  229  754:aload_0         
	//  230  755:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//  231  758:aload           12
	//  232  760:invokevirtual   #491 <Method void PdfAnnotationsImp.addPlainAnnotation(PdfAnnotation)>
		pageEmpty = false;
	//  233  763:aload_0         
	//  234  764:iconst_0        
	//  235  765:putfield        #199 <Field boolean pageEmpty>
		  goto _L27
	//* 236  768:goto            313
_L12:
		obj = ((Object) (tabSettings));
	//  237  771:aload_0         
	//  238  772:getfield        #415 <Field TabSettings tabSettings>
	//  239  775:astore          12
		if(((Phrase)element).getTabSettings() != null)
	//* 240  777:aload_1         
	//* 241  778:checkcast       #493 <Class Phrase>
	//* 242  781:invokevirtual   #497 <Method TabSettings Phrase.getTabSettings()>
	//* 243  784:ifnull          798
			tabSettings = ((Phrase)element).getTabSettings();
	//  244  787:aload_0         
	//  245  788:aload_1         
	//  246  789:checkcast       #493 <Class Phrase>
	//  247  792:invokevirtual   #497 <Method TabSettings Phrase.getTabSettings()>
	//  248  795:putfield        #415 <Field TabSettings tabSettings>
		leading = ((Phrase)element).getTotalLeading();
	//  249  798:aload_0         
	//  250  799:aload_1         
	//  251  800:checkcast       #493 <Class Phrase>
	//  252  803:invokevirtual   #500 <Method float Phrase.getTotalLeading()>
	//  253  806:putfield        #147 <Field float leading>
		pushLeading();
	//  254  809:aload_0         
	//  255  810:invokevirtual   #444 <Method void pushLeading()>
		element.process(((com.itextpdf.text.ElementListener) (this)));
	//  256  813:aload_1         
	//  257  814:aload_0         
	//  258  815:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//  259  820:pop             
		tabSettings = ((TabSettings) (obj));
	//  260  821:aload_0         
	//  261  822:aload           12
	//  262  824:putfield        #415 <Field TabSettings tabSettings>
		popLeading();
	//  263  827:aload_0         
	//  264  828:invokevirtual   #454 <Method void popLeading()>
		  goto _L27
	//* 265  831:goto            313
_L13:
		Object obj2;
		obj = ((Object) (tabSettings));
	//  266  834:aload_0         
	//  267  835:getfield        #415 <Field TabSettings tabSettings>
	//  268  838:astore          12
		if(((Phrase)element).getTabSettings() != null)
	//* 269  840:aload_1         
	//* 270  841:checkcast       #493 <Class Phrase>
	//* 271  844:invokevirtual   #497 <Method TabSettings Phrase.getTabSettings()>
	//* 272  847:ifnull          861
			tabSettings = ((Phrase)element).getTabSettings();
	//  273  850:aload_0         
	//  274  851:aload_1         
	//  275  852:checkcast       #493 <Class Phrase>
	//  276  855:invokevirtual   #497 <Method TabSettings Phrase.getTabSettings()>
	//  277  858:putfield        #415 <Field TabSettings tabSettings>
		obj1 = ((Object) ((Paragraph)element));
	//  278  861:aload_1         
	//  279  862:checkcast       #502 <Class Paragraph>
	//  280  865:astore          13
		if(isTagged(writer))
	//* 281  867:aload_0         
	//* 282  868:getfield        #256 <Field PdfWriter writer>
	//* 283  871:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 284  874:ifeq            891
		{
			flushLines();
	//  285  877:aload_0         
	//  286  878:invokevirtual   #348 <Method float flushLines()>
	//  287  881:pop             
			text.openMCBlock(((IAccessibleElement) (obj1)));
	//  288  882:aload_0         
	//  289  883:getfield        #262 <Field PdfContentByte text>
	//  290  886:aload           13
	//  291  888:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
		}
		addSpacing(((Paragraph) (obj1)).getSpacingBefore(), leading, ((Paragraph) (obj1)).getFont());
	//  292  891:aload_0         
	//  293  892:aload           13
	//  294  894:invokevirtual   #509 <Method float Paragraph.getSpacingBefore()>
	//  295  897:aload_0         
	//  296  898:getfield        #147 <Field float leading>
	//  297  901:aload           13
	//  298  903:invokevirtual   #513 <Method Font Paragraph.getFont()>
	//  299  906:invokevirtual   #517 <Method void addSpacing(float, float, Font)>
		alignment = ((Paragraph) (obj1)).getAlignment();
	//  300  909:aload_0         
	//  301  910:aload           13
	//  302  912:invokevirtual   #518 <Method int Paragraph.getAlignment()>
	//  303  915:putfield        #149 <Field int alignment>
		leading = ((Paragraph) (obj1)).getTotalLeading();
	//  304  918:aload_0         
	//  305  919:aload           13
	//  306  921:invokevirtual   #519 <Method float Paragraph.getTotalLeading()>
	//  307  924:putfield        #147 <Field float leading>
		pushLeading();
	//  308  927:aload_0         
	//  309  928:invokevirtual   #444 <Method void pushLeading()>
		carriageReturn();
	//  310  931:aload_0         
	//  311  932:invokevirtual   #409 <Method void carriageReturn()>
		if(currentHeight + calculateLineHeight() > indentTop() - indentBottom())
	//* 312  935:aload_0         
	//* 313  936:getfield        #151 <Field float currentHeight>
	//* 314  939:aload_0         
	//* 315  940:invokevirtual   #522 <Method float calculateLineHeight()>
	//* 316  943:fadd            
	//* 317  944:aload_0         
	//* 318  945:invokevirtual   #250 <Method float indentTop()>
	//* 319  948:aload_0         
	//* 320  949:invokevirtual   #244 <Method float indentBottom()>
	//* 321  952:fsub            
	//* 322  953:fcmpl           
	//* 323  954:ifle            962
			newPage();
	//  324  957:aload_0         
	//  325  958:invokevirtual   #290 <Method boolean newPage()>
	//  326  961:pop             
		obj2 = ((Object) (indentation));
	//  327  962:aload_0         
	//  328  963:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  329  966:astore          14
		obj2.indentLeft = ((Indentation) (obj2)).indentLeft + ((Paragraph) (obj1)).getIndentationLeft();
	//  330  968:aload           14
	//  331  970:aload           14
	//  332  972:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//  333  975:aload           13
	//  334  977:invokevirtual   #525 <Method float Paragraph.getIndentationLeft()>
	//  335  980:fadd            
	//  336  981:putfield        #524 <Field float PdfDocument$Indentation.indentLeft>
		obj2 = ((Object) (indentation));
	//  337  984:aload_0         
	//  338  985:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  339  988:astore          14
		obj2.indentRight = ((Indentation) (obj2)).indentRight + ((Paragraph) (obj1)).getIndentationRight();
	//  340  990:aload           14
	//  341  992:aload           14
	//  342  994:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//  343  997:aload           13
	//  344  999:invokevirtual   #528 <Method float Paragraph.getIndentationRight()>
	//  345 1002:fadd            
	//  346 1003:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
		carriageReturn();
	//  347 1006:aload_0         
	//  348 1007:invokevirtual   #409 <Method void carriageReturn()>
		obj2 = ((Object) (writer.getPageEvent()));
	//  349 1010:aload_0         
	//  350 1011:getfield        #256 <Field PdfWriter writer>
	//  351 1014:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//  352 1017:astore          14
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_1052;
	//  353 1019:aload           14
	//  354 1021:ifnull          1052
		if(!isSectionTitle)
	//* 355 1024:aload_0         
	//* 356 1025:getfield        #153 <Field boolean isSectionTitle>
	//* 357 1028:ifne            1052
			((PdfPageEvent) (obj2)).onParagraph(writer, ((Document) (this)), indentTop() - currentHeight);
	//  358 1031:aload           14
	//  359 1033:aload_0         
	//  360 1034:getfield        #256 <Field PdfWriter writer>
	//  361 1037:aload_0         
	//  362 1038:aload_0         
	//  363 1039:invokevirtual   #250 <Method float indentTop()>
	//  364 1042:aload_0         
	//  365 1043:getfield        #151 <Field float currentHeight>
	//  366 1046:fsub            
	//  367 1047:invokeinterface #538 <Method void PdfPageEvent.onParagraph(PdfWriter, Document, float)>
		if(!((Paragraph) (obj1)).getKeepTogether())
			break MISSING_BLOCK_LABEL_1367;
	//  368 1052:aload           13
	//  369 1054:invokevirtual   #541 <Method boolean Paragraph.getKeepTogether()>
	//  370 1057:ifeq            1367
		carriageReturn();
	//  371 1060:aload_0         
	//  372 1061:invokevirtual   #409 <Method void carriageReturn()>
		Object obj3 = ((Object) (new PdfPTable(1)));
	//  373 1064:new             #543 <Class PdfPTable>
	//  374 1067:dup             
	//  375 1068:iconst_1        
	//  376 1069:invokespecial   #546 <Method void PdfPTable(int)>
	//  377 1072:astore          15
		((PdfPTable) (obj3)).setKeepTogether(((Paragraph) (obj1)).getKeepTogether());
	//  378 1074:aload           15
	//  379 1076:aload           13
	//  380 1078:invokevirtual   #541 <Method boolean Paragraph.getKeepTogether()>
	//  381 1081:invokevirtual   #550 <Method void PdfPTable.setKeepTogether(boolean)>
		((PdfPTable) (obj3)).setWidthPercentage(100F);
	//  382 1084:aload           15
	//  383 1086:ldc2            #551 <Float 100F>
	//  384 1089:invokevirtual   #555 <Method void PdfPTable.setWidthPercentage(float)>
		Object obj4 = ((Object) (new PdfPCell()));
	//  385 1092:new             #557 <Class PdfPCell>
	//  386 1095:dup             
	//  387 1096:invokespecial   #558 <Method void PdfPCell()>
	//  388 1099:astore          16
		((PdfPCell) (obj4)).addElement(((Element) (obj1)));
	//  389 1101:aload           16
	//  390 1103:aload           13
	//  391 1105:invokevirtual   #562 <Method void PdfPCell.addElement(Element)>
		((PdfPCell) (obj4)).setBorder(0);
	//  392 1108:aload           16
	//  393 1110:iconst_0        
	//  394 1111:invokevirtual   #565 <Method void PdfPCell.setBorder(int)>
		((PdfPCell) (obj4)).setPadding(0.0F);
	//  395 1114:aload           16
	//  396 1116:fconst_0        
	//  397 1117:invokevirtual   #568 <Method void PdfPCell.setPadding(float)>
		((PdfPTable) (obj3)).addCell(((PdfPCell) (obj4)));
	//  398 1120:aload           15
	//  399 1122:aload           16
	//  400 1124:invokevirtual   #572 <Method PdfPCell PdfPTable.addCell(PdfPCell)>
	//  401 1127:pop             
		obj4 = ((Object) (indentation));
	//  402 1128:aload_0         
	//  403 1129:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  404 1132:astore          16
		obj4.indentLeft = ((Indentation) (obj4)).indentLeft - ((Paragraph) (obj1)).getIndentationLeft();
	//  405 1134:aload           16
	//  406 1136:aload           16
	//  407 1138:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//  408 1141:aload           13
	//  409 1143:invokevirtual   #525 <Method float Paragraph.getIndentationLeft()>
	//  410 1146:fsub            
	//  411 1147:putfield        #524 <Field float PdfDocument$Indentation.indentLeft>
		obj4 = ((Object) (indentation));
	//  412 1150:aload_0         
	//  413 1151:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  414 1154:astore          16
		obj4.indentRight = ((Indentation) (obj4)).indentRight - ((Paragraph) (obj1)).getIndentationRight();
	//  415 1156:aload           16
	//  416 1158:aload           16
	//  417 1160:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//  418 1163:aload           13
	//  419 1165:invokevirtual   #528 <Method float Paragraph.getIndentationRight()>
	//  420 1168:fsub            
	//  421 1169:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
		add(((Element) (obj3)));
	//  422 1172:aload_0         
	//  423 1173:aload           15
	//  424 1175:invokevirtual   #574 <Method boolean add(Element)>
	//  425 1178:pop             
		obj3 = ((Object) (indentation));
	//  426 1179:aload_0         
	//  427 1180:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  428 1183:astore          15
		obj3.indentLeft = ((Indentation) (obj3)).indentLeft + ((Paragraph) (obj1)).getIndentationLeft();
	//  429 1185:aload           15
	//  430 1187:aload           15
	//  431 1189:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//  432 1192:aload           13
	//  433 1194:invokevirtual   #525 <Method float Paragraph.getIndentationLeft()>
	//  434 1197:fadd            
	//  435 1198:putfield        #524 <Field float PdfDocument$Indentation.indentLeft>
		obj3 = ((Object) (indentation));
	//  436 1201:aload_0         
	//  437 1202:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  438 1205:astore          15
		obj3.indentRight = ((Indentation) (obj3)).indentRight + ((Paragraph) (obj1)).getIndentationRight();
	//  439 1207:aload           15
	//  440 1209:aload           15
	//  441 1211:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//  442 1214:aload           13
	//  443 1216:invokevirtual   #528 <Method float Paragraph.getIndentationRight()>
	//  444 1219:fadd            
	//  445 1220:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
_L30:
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_1256;
	//  446 1223:aload           14
	//  447 1225:ifnull          1256
		if(!isSectionTitle)
	//* 448 1228:aload_0         
	//* 449 1229:getfield        #153 <Field boolean isSectionTitle>
	//* 450 1232:ifne            1256
			((PdfPageEvent) (obj2)).onParagraphEnd(writer, ((Document) (this)), indentTop() - currentHeight);
	//  451 1235:aload           14
	//  452 1237:aload_0         
	//  453 1238:getfield        #256 <Field PdfWriter writer>
	//  454 1241:aload_0         
	//  455 1242:aload_0         
	//  456 1243:invokevirtual   #250 <Method float indentTop()>
	//  457 1246:aload_0         
	//  458 1247:getfield        #151 <Field float currentHeight>
	//  459 1250:fsub            
	//  460 1251:invokeinterface #577 <Method void PdfPageEvent.onParagraphEnd(PdfWriter, Document, float)>
		alignment = 0;
	//  461 1256:aload_0         
	//  462 1257:iconst_0        
	//  463 1258:putfield        #149 <Field int alignment>
		if(floatingElements != null && floatingElements.size() != 0)
	//* 464 1261:aload_0         
	//* 465 1262:getfield        #210 <Field ArrayList floatingElements>
	//* 466 1265:ifnull          1282
	//* 467 1268:aload_0         
	//* 468 1269:getfield        #210 <Field ArrayList floatingElements>
	//* 469 1272:invokevirtual   #296 <Method int ArrayList.size()>
	//* 470 1275:ifeq            1282
			flushFloatingElements();
	//  471 1278:aload_0         
	//  472 1279:invokespecial   #368 <Method void flushFloatingElements()>
		obj2 = ((Object) (indentation));
	//  473 1282:aload_0         
	//  474 1283:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  475 1286:astore          14
		obj2.indentLeft = ((Indentation) (obj2)).indentLeft - ((Paragraph) (obj1)).getIndentationLeft();
	//  476 1288:aload           14
	//  477 1290:aload           14
	//  478 1292:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//  479 1295:aload           13
	//  480 1297:invokevirtual   #525 <Method float Paragraph.getIndentationLeft()>
	//  481 1300:fsub            
	//  482 1301:putfield        #524 <Field float PdfDocument$Indentation.indentLeft>
		obj2 = ((Object) (indentation));
	//  483 1304:aload_0         
	//  484 1305:getfield        #174 <Field PdfDocument$Indentation indentation>
	//  485 1308:astore          14
		obj2.indentRight = ((Indentation) (obj2)).indentRight - ((Paragraph) (obj1)).getIndentationRight();
	//  486 1310:aload           14
	//  487 1312:aload           14
	//  488 1314:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//  489 1317:aload           13
	//  490 1319:invokevirtual   #528 <Method float Paragraph.getIndentationRight()>
	//  491 1322:fsub            
	//  492 1323:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
		carriageReturn();
	//  493 1326:aload_0         
	//  494 1327:invokevirtual   #409 <Method void carriageReturn()>
		tabSettings = ((TabSettings) (obj));
	//  495 1330:aload_0         
	//  496 1331:aload           12
	//  497 1333:putfield        #415 <Field TabSettings tabSettings>
		popLeading();
	//  498 1336:aload_0         
	//  499 1337:invokevirtual   #454 <Method void popLeading()>
		if(isTagged(writer))
	//* 500 1340:aload_0         
	//* 501 1341:getfield        #256 <Field PdfWriter writer>
	//* 502 1344:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 503 1347:ifeq            313
		{
			flushLines();
	//  504 1350:aload_0         
	//  505 1351:invokevirtual   #348 <Method float flushLines()>
	//  506 1354:pop             
			text.closeMCBlock(((IAccessibleElement) (obj1)));
	//  507 1355:aload_0         
	//  508 1356:getfield        #262 <Field PdfContentByte text>
	//  509 1359:aload           13
	//  510 1361:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		}
		  goto _L27
	//* 511 1364:goto            313
		line.setExtraIndent(((Paragraph) (obj1)).getFirstLineIndent());
	//  512 1367:aload_0         
	//  513 1368:getfield        #164 <Field PdfLine line>
	//  514 1371:aload           13
	//  515 1373:invokevirtual   #583 <Method float Paragraph.getFirstLineIndent()>
	//  516 1376:invokevirtual   #586 <Method void PdfLine.setExtraIndent(float)>
		float f = currentHeight;
	//  517 1379:aload_0         
	//  518 1380:getfield        #151 <Field float currentHeight>
	//  519 1383:fstore_2        
		element.process(((com.itextpdf.text.ElementListener) (this)));
	//  520 1384:aload_1         
	//  521 1385:aload_0         
	//  522 1386:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//  523 1391:pop             
		carriageReturn();
	//  524 1392:aload_0         
	//  525 1393:invokevirtual   #409 <Method void carriageReturn()>
		if(f != currentHeight || lines.size() > 0)
	//* 526 1396:fload_2         
	//* 527 1397:aload_0         
	//* 528 1398:getfield        #151 <Field float currentHeight>
	//* 529 1401:fcmpl           
	//* 530 1402:ifne            1415
	//* 531 1405:aload_0         
	//* 532 1406:getfield        #169 <Field ArrayList lines>
	//* 533 1409:invokevirtual   #296 <Method int ArrayList.size()>
	//* 534 1412:ifle            1223
			addSpacing(((Paragraph) (obj1)).getSpacingAfter(), ((Paragraph) (obj1)).getTotalLeading(), ((Paragraph) (obj1)).getFont(), true);
	//  535 1415:aload_0         
	//  536 1416:aload           13
	//  537 1418:invokevirtual   #589 <Method float Paragraph.getSpacingAfter()>
	//  538 1421:aload           13
	//  539 1423:invokevirtual   #519 <Method float Paragraph.getTotalLeading()>
	//  540 1426:aload           13
	//  541 1428:invokevirtual   #513 <Method Font Paragraph.getFont()>
	//  542 1431:iconst_1        
	//  543 1432:invokevirtual   #592 <Method void addSpacing(float, float, Font, boolean)>
		  goto _L30
	//* 544 1435:goto            1223
_L14:
		obj = ((Object) ((Section)element));
	//  545 1438:aload_1         
	//  546 1439:checkcast       #594 <Class Section>
	//  547 1442:astore          12
		obj1 = ((Object) (writer.getPageEvent()));
	//  548 1444:aload_0         
	//  549 1445:getfield        #256 <Field PdfWriter writer>
	//  550 1448:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//  551 1451:astore          13
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		boolean flag;
		int i;
		if(((Section) (obj)).isNotAddedYet() && ((Section) (obj)).getTitle() != null)
	//* 552 1453:aload           12
	//* 553 1455:invokevirtual   #597 <Method boolean Section.isNotAddedYet()>
	//* 554 1458:ifeq            2708
	//* 555 1461:aload           12
	//* 556 1463:invokevirtual   #601 <Method Paragraph Section.getTitle()>
	//* 557 1466:ifnull          2708
			flag = true;
	//  558 1469:iconst_1        
	//  559 1470:istore          9
		else
	//* 560 1472:aload           12
	//* 561 1474:invokevirtual   #604 <Method boolean Section.isTriggerNewPage()>
	//* 562 1477:ifeq            1485
	//* 563 1480:aload_0         
	//* 564 1481:invokevirtual   #290 <Method boolean newPage()>
	//* 565 1484:pop             
	//* 566 1485:iload           9
	//* 567 1487:ifeq            1603
	//* 568 1490:aload_0         
	//* 569 1491:invokevirtual   #250 <Method float indentTop()>
	//* 570 1494:aload_0         
	//* 571 1495:getfield        #151 <Field float currentHeight>
	//* 572 1498:fsub            
	//* 573 1499:fstore_3        
	//* 574 1500:aload_0         
	//* 575 1501:getfield        #607 <Field Rectangle pageSize>
	//* 576 1504:invokevirtual   #610 <Method int Rectangle.getRotation()>
	//* 577 1507:istore          10
	//* 578 1509:iload           10
	//* 579 1511:bipush          90
	//* 580 1513:icmpeq          1526
	//* 581 1516:fload_3         
	//* 582 1517:fstore_2        
	//* 583 1518:iload           10
	//* 584 1520:sipush          180
	//* 585 1523:icmpne          1536
	//* 586 1526:aload_0         
	//* 587 1527:getfield        #607 <Field Rectangle pageSize>
	//* 588 1530:invokevirtual   #613 <Method float Rectangle.getHeight()>
	//* 589 1533:fload_3         
	//* 590 1534:fsub            
	//* 591 1535:fstore_2        
	//* 592 1536:new             #615 <Class PdfDestination>
	//* 593 1539:dup             
	//* 594 1540:iconst_2        
	//* 595 1541:fload_2         
	//* 596 1542:invokespecial   #618 <Method void PdfDestination(int, float)>
	//* 597 1545:astore          14
	//* 598 1547:aload_0         
	//* 599 1548:getfield        #620 <Field PdfOutline currentOutline>
	//* 600 1551:invokevirtual   #625 <Method int PdfOutline.level()>
	//* 601 1554:aload           12
	//* 602 1556:invokevirtual   #628 <Method int Section.getDepth()>
	//* 603 1559:icmplt          1576
	//* 604 1562:aload_0         
	//* 605 1563:aload_0         
	//* 606 1564:getfield        #620 <Field PdfOutline currentOutline>
	//* 607 1567:invokevirtual   #632 <Method PdfOutline PdfOutline.parent()>
	//* 608 1570:putfield        #620 <Field PdfOutline currentOutline>
	//* 609 1573:goto            1547
	//* 610 1576:aload_0         
	//* 611 1577:new             #622 <Class PdfOutline>
	//* 612 1580:dup             
	//* 613 1581:aload_0         
	//* 614 1582:getfield        #620 <Field PdfOutline currentOutline>
	//* 615 1585:aload           14
	//* 616 1587:aload           12
	//* 617 1589:invokevirtual   #635 <Method Paragraph Section.getBookmarkTitle()>
	//* 618 1592:aload           12
	//* 619 1594:invokevirtual   #638 <Method boolean Section.isBookmarkOpen()>
	//* 620 1597:invokespecial   #641 <Method void PdfOutline(PdfOutline, PdfDestination, Paragraph, boolean)>
	//* 621 1600:putfield        #620 <Field PdfOutline currentOutline>
	//* 622 1603:aload_0         
	//* 623 1604:invokevirtual   #409 <Method void carriageReturn()>
	//* 624 1607:aload_0         
	//* 625 1608:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 626 1611:astore          14
	//* 627 1613:aload           14
	//* 628 1615:aload           14
	//* 629 1617:getfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 630 1620:aload           12
	//* 631 1622:invokevirtual   #645 <Method float Section.getIndentationLeft()>
	//* 632 1625:fadd            
	//* 633 1626:putfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 634 1629:aload_0         
	//* 635 1630:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 636 1633:astore          14
	//* 637 1635:aload           14
	//* 638 1637:aload           14
	//* 639 1639:getfield        #648 <Field float PdfDocument$Indentation.sectionIndentRight>
	//* 640 1642:aload           12
	//* 641 1644:invokevirtual   #649 <Method float Section.getIndentationRight()>
	//* 642 1647:fadd            
	//* 643 1648:putfield        #648 <Field float PdfDocument$Indentation.sectionIndentRight>
	//* 644 1651:aload           12
	//* 645 1653:invokevirtual   #597 <Method boolean Section.isNotAddedYet()>
	//* 646 1656:ifeq            1701
	//* 647 1659:aload           13
	//* 648 1661:ifnull          1701
	//* 649 1664:aload_1         
	//* 650 1665:invokeinterface #366 <Method int Element.type()>
	//* 651 1670:bipush          16
	//* 652 1672:icmpne          1859
	//* 653 1675:aload           13
	//* 654 1677:aload_0         
	//* 655 1678:getfield        #256 <Field PdfWriter writer>
	//* 656 1681:aload_0         
	//* 657 1682:aload_0         
	//* 658 1683:invokevirtual   #250 <Method float indentTop()>
	//* 659 1686:aload_0         
	//* 660 1687:getfield        #151 <Field float currentHeight>
	//* 661 1690:fsub            
	//* 662 1691:aload           12
	//* 663 1693:invokevirtual   #601 <Method Paragraph Section.getTitle()>
	//* 664 1696:invokeinterface #653 <Method void PdfPageEvent.onChapter(PdfWriter, Document, float, Paragraph)>
	//* 665 1701:iload           9
	//* 666 1703:ifeq            1726
	//* 667 1706:aload_0         
	//* 668 1707:iconst_1        
	//* 669 1708:putfield        #153 <Field boolean isSectionTitle>
	//* 670 1711:aload_0         
	//* 671 1712:aload           12
	//* 672 1714:invokevirtual   #601 <Method Paragraph Section.getTitle()>
	//* 673 1717:invokevirtual   #574 <Method boolean add(Element)>
	//* 674 1720:pop             
	//* 675 1721:aload_0         
	//* 676 1722:iconst_0        
	//* 677 1723:putfield        #153 <Field boolean isSectionTitle>
	//* 678 1726:aload_0         
	//* 679 1727:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 680 1730:astore          14
	//* 681 1732:aload           14
	//* 682 1734:aload           14
	//* 683 1736:getfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 684 1739:aload           12
	//* 685 1741:invokevirtual   #656 <Method float Section.getIndentation()>
	//* 686 1744:fadd            
	//* 687 1745:putfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 688 1748:aload_1         
	//* 689 1749:aload_0         
	//* 690 1750:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//* 691 1755:pop             
	//* 692 1756:aload_0         
	//* 693 1757:invokevirtual   #348 <Method float flushLines()>
	//* 694 1760:pop             
	//* 695 1761:aload_0         
	//* 696 1762:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 697 1765:astore          14
	//* 698 1767:aload           14
	//* 699 1769:aload           14
	//* 700 1771:getfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 701 1774:aload           12
	//* 702 1776:invokevirtual   #645 <Method float Section.getIndentationLeft()>
	//* 703 1779:aload           12
	//* 704 1781:invokevirtual   #656 <Method float Section.getIndentation()>
	//* 705 1784:fadd            
	//* 706 1785:fsub            
	//* 707 1786:putfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//* 708 1789:aload_0         
	//* 709 1790:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 710 1793:astore          14
	//* 711 1795:aload           14
	//* 712 1797:aload           14
	//* 713 1799:getfield        #648 <Field float PdfDocument$Indentation.sectionIndentRight>
	//* 714 1802:aload           12
	//* 715 1804:invokevirtual   #649 <Method float Section.getIndentationRight()>
	//* 716 1807:fsub            
	//* 717 1808:putfield        #648 <Field float PdfDocument$Indentation.sectionIndentRight>
	//* 718 1811:aload           12
	//* 719 1813:invokevirtual   #659 <Method boolean Section.isComplete()>
	//* 720 1816:ifeq            313
	//* 721 1819:aload           13
	//* 722 1821:ifnull          313
	//* 723 1824:aload_1         
	//* 724 1825:invokeinterface #366 <Method int Element.type()>
	//* 725 1830:bipush          16
	//* 726 1832:icmpne          1893
	//* 727 1835:aload           13
	//* 728 1837:aload_0         
	//* 729 1838:getfield        #256 <Field PdfWriter writer>
	//* 730 1841:aload_0         
	//* 731 1842:aload_0         
	//* 732 1843:invokevirtual   #250 <Method float indentTop()>
	//* 733 1846:aload_0         
	//* 734 1847:getfield        #151 <Field float currentHeight>
	//* 735 1850:fsub            
	//* 736 1851:invokeinterface #662 <Method void PdfPageEvent.onChapterEnd(PdfWriter, Document, float)>
	//* 737 1856:goto            313
	//* 738 1859:aload           13
	//* 739 1861:aload_0         
	//* 740 1862:getfield        #256 <Field PdfWriter writer>
	//* 741 1865:aload_0         
	//* 742 1866:aload_0         
	//* 743 1867:invokevirtual   #250 <Method float indentTop()>
	//* 744 1870:aload_0         
	//* 745 1871:getfield        #151 <Field float currentHeight>
	//* 746 1874:fsub            
	//* 747 1875:aload           12
	//* 748 1877:invokevirtual   #628 <Method int Section.getDepth()>
	//* 749 1880:aload           12
	//* 750 1882:invokevirtual   #601 <Method Paragraph Section.getTitle()>
	//* 751 1885:invokeinterface #666 <Method void PdfPageEvent.onSection(PdfWriter, Document, float, int, Paragraph)>
	//* 752 1890:goto            1701
	//* 753 1893:aload           13
	//* 754 1895:aload_0         
	//* 755 1896:getfield        #256 <Field PdfWriter writer>
	//* 756 1899:aload_0         
	//* 757 1900:aload_0         
	//* 758 1901:invokevirtual   #250 <Method float indentTop()>
	//* 759 1904:aload_0         
	//* 760 1905:getfield        #151 <Field float currentHeight>
	//* 761 1908:fsub            
	//* 762 1909:invokeinterface #669 <Method void PdfPageEvent.onSectionEnd(PdfWriter, Document, float)>
	//* 763 1914:goto            313
	//* 764 1917:aload_1         
	//* 765 1918:checkcast       #671 <Class List>
	//* 766 1921:astore          12
	//* 767 1923:aload_0         
	//* 768 1924:getfield        #256 <Field PdfWriter writer>
	//* 769 1927:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 770 1930:ifeq            1947
	//* 771 1933:aload_0         
	//* 772 1934:invokevirtual   #348 <Method float flushLines()>
	//* 773 1937:pop             
	//* 774 1938:aload_0         
	//* 775 1939:getfield        #262 <Field PdfContentByte text>
	//* 776 1942:aload           12
	//* 777 1944:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 778 1947:aload           12
	//* 779 1949:invokevirtual   #674 <Method boolean List.isAlignindent()>
	//* 780 1952:ifeq            1960
	//* 781 1955:aload           12
	//* 782 1957:invokevirtual   #677 <Method void List.normalizeIndentation()>
	//* 783 1960:aload_0         
	//* 784 1961:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 785 1964:astore          13
	//* 786 1966:aload           13
	//* 787 1968:aload           13
	//* 788 1970:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 789 1973:aload           12
	//* 790 1975:invokevirtual   #681 <Method float List.getIndentationLeft()>
	//* 791 1978:fadd            
	//* 792 1979:putfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 793 1982:aload_0         
	//* 794 1983:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 795 1986:astore          13
	//* 796 1988:aload           13
	//* 797 1990:aload           13
	//* 798 1992:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 799 1995:aload           12
	//* 800 1997:invokevirtual   #682 <Method float List.getIndentationRight()>
	//* 801 2000:fadd            
	//* 802 2001:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 803 2004:aload_1         
	//* 804 2005:aload_0         
	//* 805 2006:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//* 806 2011:pop             
	//* 807 2012:aload_0         
	//* 808 2013:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 809 2016:astore          13
	//* 810 2018:aload           13
	//* 811 2020:aload           13
	//* 812 2022:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 813 2025:aload           12
	//* 814 2027:invokevirtual   #681 <Method float List.getIndentationLeft()>
	//* 815 2030:fsub            
	//* 816 2031:putfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 817 2034:aload_0         
	//* 818 2035:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 819 2038:astore          13
	//* 820 2040:aload           13
	//* 821 2042:aload           13
	//* 822 2044:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 823 2047:aload           12
	//* 824 2049:invokevirtual   #682 <Method float List.getIndentationRight()>
	//* 825 2052:fsub            
	//* 826 2053:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 827 2056:aload_0         
	//* 828 2057:invokevirtual   #409 <Method void carriageReturn()>
	//* 829 2060:aload_0         
	//* 830 2061:getfield        #256 <Field PdfWriter writer>
	//* 831 2064:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 832 2067:ifeq            313
	//* 833 2070:aload_0         
	//* 834 2071:invokevirtual   #348 <Method float flushLines()>
	//* 835 2074:pop             
	//* 836 2075:aload_0         
	//* 837 2076:getfield        #262 <Field PdfContentByte text>
	//* 838 2079:aload           12
	//* 839 2081:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 840 2084:goto            313
	//* 841 2087:aload_1         
	//* 842 2088:checkcast       #684 <Class ListItem>
	//* 843 2091:astore          12
	//* 844 2093:aload_0         
	//* 845 2094:getfield        #256 <Field PdfWriter writer>
	//* 846 2097:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 847 2100:ifeq            2117
	//* 848 2103:aload_0         
	//* 849 2104:invokevirtual   #348 <Method float flushLines()>
	//* 850 2107:pop             
	//* 851 2108:aload_0         
	//* 852 2109:getfield        #262 <Field PdfContentByte text>
	//* 853 2112:aload           12
	//* 854 2114:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 855 2117:aload_0         
	//* 856 2118:aload           12
	//* 857 2120:invokevirtual   #685 <Method float ListItem.getSpacingBefore()>
	//* 858 2123:aload_0         
	//* 859 2124:getfield        #147 <Field float leading>
	//* 860 2127:aload           12
	//* 861 2129:invokevirtual   #686 <Method Font ListItem.getFont()>
	//* 862 2132:invokevirtual   #517 <Method void addSpacing(float, float, Font)>
	//* 863 2135:aload_0         
	//* 864 2136:aload           12
	//* 865 2138:invokevirtual   #687 <Method int ListItem.getAlignment()>
	//* 866 2141:putfield        #149 <Field int alignment>
	//* 867 2144:aload_0         
	//* 868 2145:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 869 2148:astore          13
	//* 870 2150:aload           13
	//* 871 2152:aload           13
	//* 872 2154:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 873 2157:aload           12
	//* 874 2159:invokevirtual   #688 <Method float ListItem.getIndentationLeft()>
	//* 875 2162:fadd            
	//* 876 2163:putfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 877 2166:aload_0         
	//* 878 2167:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 879 2170:astore          13
	//* 880 2172:aload           13
	//* 881 2174:aload           13
	//* 882 2176:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 883 2179:aload           12
	//* 884 2181:invokevirtual   #689 <Method float ListItem.getIndentationRight()>
	//* 885 2184:fadd            
	//* 886 2185:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 887 2188:aload_0         
	//* 888 2189:aload           12
	//* 889 2191:invokevirtual   #690 <Method float ListItem.getTotalLeading()>
	//* 890 2194:putfield        #147 <Field float leading>
	//* 891 2197:aload_0         
	//* 892 2198:invokevirtual   #444 <Method void pushLeading()>
	//* 893 2201:aload_0         
	//* 894 2202:invokevirtual   #409 <Method void carriageReturn()>
	//* 895 2205:aload_0         
	//* 896 2206:getfield        #164 <Field PdfLine line>
	//* 897 2209:aload           12
	//* 898 2211:invokevirtual   #694 <Method void PdfLine.setListItem(ListItem)>
	//* 899 2214:aload_1         
	//* 900 2215:aload_0         
	//* 901 2216:invokeinterface #451 <Method boolean Element.process(com.itextpdf.text.ElementListener)>
	//* 902 2221:pop             
	//* 903 2222:aload_0         
	//* 904 2223:aload           12
	//* 905 2225:invokevirtual   #695 <Method float ListItem.getSpacingAfter()>
	//* 906 2228:aload           12
	//* 907 2230:invokevirtual   #690 <Method float ListItem.getTotalLeading()>
	//* 908 2233:aload           12
	//* 909 2235:invokevirtual   #686 <Method Font ListItem.getFont()>
	//* 910 2238:iconst_1        
	//* 911 2239:invokevirtual   #592 <Method void addSpacing(float, float, Font, boolean)>
	//* 912 2242:aload_0         
	//* 913 2243:getfield        #164 <Field PdfLine line>
	//* 914 2246:invokevirtual   #698 <Method boolean PdfLine.hasToBeJustified()>
	//* 915 2249:ifeq            2259
	//* 916 2252:aload_0         
	//* 917 2253:getfield        #164 <Field PdfLine line>
	//* 918 2256:invokevirtual   #701 <Method void PdfLine.resetAlignment()>
	//* 919 2259:aload_0         
	//* 920 2260:invokevirtual   #409 <Method void carriageReturn()>
	//* 921 2263:aload_0         
	//* 922 2264:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 923 2267:astore          13
	//* 924 2269:aload           13
	//* 925 2271:aload           13
	//* 926 2273:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 927 2276:aload           12
	//* 928 2278:invokevirtual   #688 <Method float ListItem.getIndentationLeft()>
	//* 929 2281:fsub            
	//* 930 2282:putfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//* 931 2285:aload_0         
	//* 932 2286:getfield        #174 <Field PdfDocument$Indentation indentation>
	//* 933 2289:astore          13
	//* 934 2291:aload           13
	//* 935 2293:aload           13
	//* 936 2295:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 937 2298:aload           12
	//* 938 2300:invokevirtual   #689 <Method float ListItem.getIndentationRight()>
	//* 939 2303:fsub            
	//* 940 2304:putfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//* 941 2307:aload_0         
	//* 942 2308:invokevirtual   #454 <Method void popLeading()>
	//* 943 2311:aload_0         
	//* 944 2312:getfield        #256 <Field PdfWriter writer>
	//* 945 2315:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 946 2318:ifeq            313
	//* 947 2321:aload_0         
	//* 948 2322:invokevirtual   #348 <Method float flushLines()>
	//* 949 2325:pop             
	//* 950 2326:aload_0         
	//* 951 2327:getfield        #262 <Field PdfContentByte text>
	//* 952 2330:aload           12
	//* 953 2332:invokevirtual   #705 <Method com.itextpdf.text.ListBody ListItem.getListBody()>
	//* 954 2335:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 955 2338:aload_0         
	//* 956 2339:getfield        #262 <Field PdfContentByte text>
	//* 957 2342:aload           12
	//* 958 2344:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 959 2347:goto            313
	//* 960 2350:aload_1         
	//* 961 2351:checkcast       #458 <Class Rectangle>
	//* 962 2354:astore          12
	//* 963 2356:aload_0         
	//* 964 2357:getfield        #314 <Field PdfContentByte graphics>
	//* 965 2360:aload           12
	//* 966 2362:invokevirtual   #709 <Method void PdfContentByte.rectangle(Rectangle)>
	//* 967 2365:aload_0         
	//* 968 2366:iconst_0        
	//* 969 2367:putfield        #199 <Field boolean pageEmpty>
	//* 970 2370:goto            313
	//* 971 2373:aload_1         
	//* 972 2374:checkcast       #543 <Class PdfPTable>
	//* 973 2377:astore          12
	//* 974 2379:aload           12
	//* 975 2381:invokevirtual   #710 <Method int PdfPTable.size()>
	//* 976 2384:aload           12
	//* 977 2386:invokevirtual   #713 <Method int PdfPTable.getHeaderRows()>
	//* 978 2389:icmple          313
	//* 979 2392:aload_0         
	//* 980 2393:invokevirtual   #716 <Method void ensureNewLine()>
	//* 981 2396:aload_0         
	//* 982 2397:invokevirtual   #348 <Method float flushLines()>
	//* 983 2400:pop             
	//* 984 2401:aload_0         
	//* 985 2402:aload           12
	//* 986 2404:invokevirtual   #720 <Method void addPTable(PdfPTable)>
	//* 987 2407:aload_0         
	//* 988 2408:iconst_0        
	//* 989 2409:putfield        #199 <Field boolean pageEmpty>
	//* 990 2412:aload_0         
	//* 991 2413:invokevirtual   #351 <Method void newLine()>
	//* 992 2416:goto            313
	//* 993 2419:aload_0         
	//* 994 2420:getfield        #256 <Field PdfWriter writer>
	//* 995 2423:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 996 2426:ifeq            2455
	//* 997 2429:aload_1         
	//* 998 2430:checkcast       #309 <Class Image>
	//* 999 2433:invokevirtual   #723 <Method boolean Image.isImgTemplate()>
	//*1000 2436:ifne            2455
	//*1001 2439:aload_0         
	//*1002 2440:invokevirtual   #348 <Method float flushLines()>
	//*1003 2443:pop             
	//*1004 2444:aload_0         
	//*1005 2445:getfield        #262 <Field PdfContentByte text>
	//*1006 2448:aload_1         
	//*1007 2449:checkcast       #309 <Class Image>
	//*1008 2452:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//*1009 2455:aload_0         
	//*1010 2456:aload_1         
	//*1011 2457:checkcast       #309 <Class Image>
	//*1012 2460:invokevirtual   #725 <Method void add(Image)>
	//*1013 2463:aload_0         
	//*1014 2464:getfield        #256 <Field PdfWriter writer>
	//*1015 2467:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*1016 2470:ifeq            313
	//*1017 2473:aload_1         
	//*1018 2474:checkcast       #309 <Class Image>
	//*1019 2477:invokevirtual   #723 <Method boolean Image.isImgTemplate()>
	//*1020 2480:ifne            313
	//*1021 2483:aload_0         
	//*1022 2484:invokevirtual   #348 <Method float flushLines()>
	//*1023 2487:pop             
	//*1024 2488:aload_0         
	//*1025 2489:getfield        #262 <Field PdfContentByte text>
	//*1026 2492:aload_1         
	//*1027 2493:checkcast       #309 <Class Image>
	//*1028 2496:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//*1029 2499:goto            313
	//*1030 2502:aload_1         
	//*1031 2503:checkcast       #727 <Class DrawInterface>
	//*1032 2506:astore          12
	//*1033 2508:aload_0         
	//*1034 2509:getfield        #314 <Field PdfContentByte graphics>
	//*1035 2512:astore          13
	//*1036 2514:aload_0         
	//*1037 2515:invokevirtual   #241 <Method float indentLeft()>
	//*1038 2518:fstore_3        
	//*1039 2519:aload_0         
	//*1040 2520:invokevirtual   #244 <Method float indentBottom()>
	//*1041 2523:fstore          4
	//*1042 2525:aload_0         
	//*1043 2526:invokevirtual   #247 <Method float indentRight()>
	//*1044 2529:fstore          5
	//*1045 2531:aload_0         
	//*1046 2532:invokevirtual   #250 <Method float indentTop()>
	//*1047 2535:fstore          6
	//*1048 2537:aload_0         
	//*1049 2538:invokevirtual   #250 <Method float indentTop()>
	//*1050 2541:fstore          7
	//*1051 2543:aload_0         
	//*1052 2544:getfield        #151 <Field float currentHeight>
	//*1053 2547:fstore          8
	//*1054 2549:aload_0         
	//*1055 2550:getfield        #160 <Field Stack leadingStack>
	//*1056 2553:invokevirtual   #728 <Method int Stack.size()>
	//*1057 2556:ifle            2714
	//*1058 2559:aload_0         
	//*1059 2560:getfield        #147 <Field float leading>
	//*1060 2563:fstore_2        
	//*1061 2564:aload           12
	//*1062 2566:aload           13
	//*1063 2568:fload_3         
	//*1064 2569:fload           4
	//*1065 2571:fload           5
	//*1066 2573:fload           6
	//*1067 2575:fload           7
	//*1068 2577:fload           8
	//*1069 2579:fsub            
	//*1070 2580:fload_2         
	//*1071 2581:fsub            
	//*1072 2582:invokeinterface #732 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//*1073 2587:aload_0         
	//*1074 2588:iconst_0        
	//*1075 2589:putfield        #199 <Field boolean pageEmpty>
	//*1076 2592:goto            313
	//*1077 2595:aload_1         
	//*1078 2596:instanceof      #734 <Class MarkedSection>
	//*1079 2599:ifeq            2623
	//*1080 2602:aload_1         
	//*1081 2603:checkcast       #734 <Class MarkedSection>
	//*1082 2606:invokevirtual   #737 <Method MarkedObject MarkedSection.getTitle()>
	//*1083 2609:astore          12
	//*1084 2611:aload           12
	//*1085 2613:ifnull          2623
	//*1086 2616:aload           12
	//*1087 2618:aload_0         
	//*1088 2619:invokevirtual   #740 <Method boolean MarkedObject.process(com.itextpdf.text.ElementListener)>
	//*1089 2622:pop             
	//*1090 2623:aload_1         
	//*1091 2624:checkcast       #739 <Class MarkedObject>
	//*1092 2627:aload_0         
	//*1093 2628:invokevirtual   #740 <Method boolean MarkedObject.process(com.itextpdf.text.ElementListener)>
	//*1094 2631:pop             
	//*1095 2632:goto            313
	//*1096 2635:aload_0         
	//*1097 2636:getfield        #256 <Field PdfWriter writer>
	//*1098 2639:ifnull          313
	//*1099 2642:aload_1         
	//*1100 2643:checkcast       #742 <Class WriterOperation>
	//*1101 2646:aload_0         
	//*1102 2647:getfield        #256 <Field PdfWriter writer>
	//*1103 2650:aload_0         
	//*1104 2651:invokeinterface #746 <Method void WriterOperation.write(PdfWriter, Document)>
	//*1105 2656:goto            313
	//*1106 2659:aload_0         
	//*1107 2660:invokevirtual   #716 <Method void ensureNewLine()>
	//*1108 2663:aload_0         
	//*1109 2664:invokevirtual   #348 <Method float flushLines()>
	//*1110 2667:pop             
	//*1111 2668:aload_0         
	//*1112 2669:aload_1         
	//*1113 2670:checkcast       #748 <Class PdfDiv>
	//*1114 2673:invokespecial   #750 <Method void addDiv(PdfDiv)>
	//*1115 2676:aload_0         
	//*1116 2677:iconst_0        
	//*1117 2678:putfield        #199 <Field boolean pageEmpty>
	//*1118 2681:goto            313
	//*1119 2684:aload_0         
	//*1120 2685:aload_1         
	//*1121 2686:checkcast       #752 <Class PdfBody>
	//*1122 2689:putfield        #754 <Field PdfBody body>
	//*1123 2692:aload_0         
	//*1124 2693:getfield        #314 <Field PdfContentByte graphics>
	//*1125 2696:aload_0         
	//*1126 2697:getfield        #754 <Field PdfBody body>
	//*1127 2700:invokevirtual   #709 <Method void PdfContentByte.rectangle(Rectangle)>
	//*1128 2703:goto            2706
	//*1129 2706:iconst_0        
	//*1130 2707:ireturn         
			flag = false;
	// 1131 2708:iconst_0        
	// 1132 2709:istore          9
		if(((Section) (obj)).isTriggerNewPage())
			newPage();
		if(!flag)
			break MISSING_BLOCK_LABEL_1603;
		f2 = indentTop() - currentHeight;
		i = pageSize.getRotation();
		if(i != 90)
		{
			f1 = f2;
			if(i != 180)
				break MISSING_BLOCK_LABEL_1536;
		}
		f1 = pageSize.getHeight() - f2;
		obj2 = ((Object) (new PdfDestination(2, f1)));
		for(; currentOutline.level() >= ((Section) (obj)).getDepth(); currentOutline = currentOutline.parent());
		currentOutline = new PdfOutline(currentOutline, ((PdfDestination) (obj2)), ((Section) (obj)).getBookmarkTitle(), ((Section) (obj)).isBookmarkOpen());
		carriageReturn();
		Indentation indentation1 = indentation;
		indentation1.sectionIndentLeft = indentation1.sectionIndentLeft + ((Section) (obj)).getIndentationLeft();
		indentation1 = indentation;
		indentation1.sectionIndentRight = indentation1.sectionIndentRight + ((Section) (obj)).getIndentationRight();
		if(!((Section) (obj)).isNotAddedYet() || obj1 == null)
			break MISSING_BLOCK_LABEL_1701;
		if(element.type() != 16)
			break MISSING_BLOCK_LABEL_1859;
		((PdfPageEvent) (obj1)).onChapter(writer, ((Document) (this)), indentTop() - currentHeight, ((Section) (obj)).getTitle());
_L32:
		if(!flag)
			break MISSING_BLOCK_LABEL_1726;
		isSectionTitle = true;
		add(((Element) (((Section) (obj)).getTitle())));
		isSectionTitle = false;
		Indentation indentation2 = indentation;
		indentation2.sectionIndentLeft = indentation2.sectionIndentLeft + ((Section) (obj)).getIndentation();
		element.process(((com.itextpdf.text.ElementListener) (this)));
		flushLines();
		indentation2 = indentation;
		indentation2.sectionIndentLeft = indentation2.sectionIndentLeft - (((Section) (obj)).getIndentationLeft() + ((Section) (obj)).getIndentation());
		indentation2 = indentation;
		indentation2.sectionIndentRight = indentation2.sectionIndentRight - ((Section) (obj)).getIndentationRight();
		if(!((Section) (obj)).isComplete() || obj1 == null) goto _L27; else goto _L31
_L31:
		if(element.type() != 16)
			break MISSING_BLOCK_LABEL_1893;
		((PdfPageEvent) (obj1)).onChapterEnd(writer, ((Document) (this)), indentTop() - currentHeight);
		  goto _L27
		((PdfPageEvent) (obj1)).onSection(writer, ((Document) (this)), indentTop() - currentHeight, ((Section) (obj)).getDepth(), ((Section) (obj)).getTitle());
		  goto _L32
		((PdfPageEvent) (obj1)).onSectionEnd(writer, ((Document) (this)), indentTop() - currentHeight);
		  goto _L27
_L15:
		obj = ((Object) ((List)element));
		if(isTagged(writer))
		{
			flushLines();
			text.openMCBlock(((IAccessibleElement) (obj)));
		}
		if(((List) (obj)).isAlignindent())
			((List) (obj)).normalizeIndentation();
		obj1 = ((Object) (indentation));
		obj1.listIndentLeft = ((Indentation) (obj1)).listIndentLeft + ((List) (obj)).getIndentationLeft();
		obj1 = ((Object) (indentation));
		obj1.indentRight = ((Indentation) (obj1)).indentRight + ((List) (obj)).getIndentationRight();
		element.process(((com.itextpdf.text.ElementListener) (this)));
		obj1 = ((Object) (indentation));
		obj1.listIndentLeft = ((Indentation) (obj1)).listIndentLeft - ((List) (obj)).getIndentationLeft();
		obj1 = ((Object) (indentation));
		obj1.indentRight = ((Indentation) (obj1)).indentRight - ((List) (obj)).getIndentationRight();
		carriageReturn();
		if(isTagged(writer))
		{
			flushLines();
			text.closeMCBlock(((IAccessibleElement) (obj)));
		}
		  goto _L27
_L16:
		obj = ((Object) ((ListItem)element));
		if(isTagged(writer))
		{
			flushLines();
			text.openMCBlock(((IAccessibleElement) (obj)));
		}
		addSpacing(((ListItem) (obj)).getSpacingBefore(), leading, ((ListItem) (obj)).getFont());
		alignment = ((ListItem) (obj)).getAlignment();
		obj1 = ((Object) (indentation));
		obj1.listIndentLeft = ((Indentation) (obj1)).listIndentLeft + ((ListItem) (obj)).getIndentationLeft();
		obj1 = ((Object) (indentation));
		obj1.indentRight = ((Indentation) (obj1)).indentRight + ((ListItem) (obj)).getIndentationRight();
		leading = ((ListItem) (obj)).getTotalLeading();
		pushLeading();
		carriageReturn();
		line.setListItem(((ListItem) (obj)));
		element.process(((com.itextpdf.text.ElementListener) (this)));
		addSpacing(((ListItem) (obj)).getSpacingAfter(), ((ListItem) (obj)).getTotalLeading(), ((ListItem) (obj)).getFont(), true);
		if(line.hasToBeJustified())
			line.resetAlignment();
		carriageReturn();
		obj1 = ((Object) (indentation));
		obj1.listIndentLeft = ((Indentation) (obj1)).listIndentLeft - ((ListItem) (obj)).getIndentationLeft();
		obj1 = ((Object) (indentation));
		obj1.indentRight = ((Indentation) (obj1)).indentRight - ((ListItem) (obj)).getIndentationRight();
		popLeading();
		if(isTagged(writer))
		{
			flushLines();
			text.closeMCBlock(((IAccessibleElement) (((ListItem) (obj)).getListBody())));
			text.closeMCBlock(((IAccessibleElement) (obj)));
		}
		  goto _L27
_L20:
		obj = ((Object) ((Rectangle)element));
		graphics.rectangle(((Rectangle) (obj)));
		pageEmpty = false;
		  goto _L27
_L18:
		obj = ((Object) ((PdfPTable)element));
		if(((PdfPTable) (obj)).size() > ((PdfPTable) (obj)).getHeaderRows())
		{
			ensureNewLine();
			flushLines();
			addPTable(((PdfPTable) (obj)));
			pageEmpty = false;
			newLine();
		}
		  goto _L27
_L21:
		if(isTagged(writer) && !((Image)element).isImgTemplate())
		{
			flushLines();
			text.openMCBlock(((IAccessibleElement) ((Image)element)));
		}
		add((Image)element);
		if(isTagged(writer) && !((Image)element).isImgTemplate())
		{
			flushLines();
			text.closeMCBlock(((IAccessibleElement) ((Image)element)));
		}
		  goto _L27
_L25:
		obj = ((Object) ((DrawInterface)element));
		obj1 = ((Object) (graphics));
		f2 = indentLeft();
		f3 = indentBottom();
		f4 = indentRight();
		f5 = indentTop();
		f6 = indentTop();
		f7 = currentHeight;
		if(leadingStack.size() <= 0)
			break MISSING_BLOCK_LABEL_2714;
		f1 = leading;
_L34:
		((DrawInterface) (obj)).draw(((PdfContentByte) (obj1)), f2, f3, f4, f5, f6 - f7 - f1);
		pageEmpty = false;
		  goto _L27
_L24:
		if(!(element instanceof MarkedSection))
			break MISSING_BLOCK_LABEL_2623;
		obj = ((Object) (((MarkedSection)element).getTitle()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_2623;
		((MarkedObject) (obj)).process(((com.itextpdf.text.ElementListener) (this)));
		((MarkedObject)element).process(((com.itextpdf.text.ElementListener) (this)));
		  goto _L27
_L26:
		if(writer == null) goto _L27; else goto _L33
_L33:
		((WriterOperation)element).write(writer, ((Document) (this)));
		  goto _L27
_L22:
		ensureNewLine();
		flushLines();
		addDiv((PdfDiv)element);
		pageEmpty = false;
		  goto _L27
_L23:
		body = (PdfBody)element;
		graphics.rectangle(((Rectangle) (body)));
_L1:
		return false;
	//*1133 2711:goto            1472
		f1 = 0.0F;
	// 1134 2714:fconst_0        
	// 1135 2715:fstore_2        
		  goto _L34
	//*1136 2716:goto            2564
	}

	void addAdditionalAction(PdfName pdfname, PdfAction pdfaction)
	{
		if(additionalActions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #758 <Field PdfDictionary additionalActions>
	//*   2    4:ifnonnull       18
			additionalActions = new PdfDictionary();
	//    3    7:aload_0         
	//    4    8:new             #760 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #761 <Method void PdfDictionary()>
	//    7   15:putfield        #758 <Field PdfDictionary additionalActions>
		if(pdfaction == null)
	//*   8   18:aload_2         
	//*   9   19:ifnonnull       46
			additionalActions.remove(pdfname);
	//   10   22:aload_0         
	//   11   23:getfield        #758 <Field PdfDictionary additionalActions>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #765 <Method void PdfDictionary.remove(PdfName)>
		else
	//*  14   30:aload_0         
	//*  15   31:getfield        #758 <Field PdfDictionary additionalActions>
	//*  16   34:invokevirtual   #766 <Method int PdfDictionary.size()>
	//*  17   37:ifne            45
	//*  18   40:aload_0         
	//*  19   41:aconst_null     
	//*  20   42:putfield        #758 <Field PdfDictionary additionalActions>
	//*  21   45:return          
			additionalActions.put(pdfname, ((PdfObject) (pdfaction)));
	//   22   46:aload_0         
	//   23   47:getfield        #758 <Field PdfDictionary additionalActions>
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #770 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(additionalActions.size() == 0)
			additionalActions = null;
	//*  27   55:goto            30
	}

	void addAnnotation(PdfAnnotation pdfannotation)
	{
		pageEmpty = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #199 <Field boolean pageEmpty>
		annotationsImp.addAnnotation(pdfannotation);
	//    3    5:aload_0         
	//    4    6:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #773 <Method void PdfAnnotationsImp.addAnnotation(PdfAnnotation)>
	//    7   13:return          
	}

	void addCalculationOrder(PdfFormField pdfformfield)
	{
		annotationsImp.addCalculationOrder(pdfformfield);
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #777 <Method void PdfAnnotationsImp.addCalculationOrder(PdfFormField)>
	//    4    8:return          
	}

	void addFileAttachment(String s, PdfFileSpecification pdffilespecification)
		throws IOException
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       27
		{
			s = ((String) ((PdfString)pdffilespecification.get(PdfName.DESC)));
	//    4    7:aload_2         
	//    5    8:getstatic       #787 <Field PdfName PdfName.DESC>
	//    6   11:invokevirtual   #792 <Method PdfObject PdfFileSpecification.get(PdfName)>
	//    7   14:checkcast       #794 <Class PdfString>
	//    8   17:astore_1        
			int i;
			if(s == null)
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       133
				s1 = "";
	//   11   22:ldc2            #796 <String "">
	//   12   25:astore          4
			else
	//*  13   27:aload_2         
	//*  14   28:aload           4
	//*  15   30:iconst_1        
	//*  16   31:invokevirtual   #800 <Method void PdfFileSpecification.addDescription(String, boolean)>
	//*  17   34:aload           4
	//*  18   36:astore_1        
	//*  19   37:aload           4
	//*  20   39:invokevirtual   #805 <Method int String.length()>
	//*  21   42:ifne            49
	//*  22   45:ldc2            #807 <String "Unnamed">
	//*  23   48:astore_1        
	//*  24   49:new             #794 <Class PdfString>
	//*  25   52:dup             
	//*  26   53:aload_1         
	//*  27   54:ldc2            #809 <String "UnicodeBig">
	//*  28   57:invokespecial   #811 <Method void PdfString(String, String)>
	//*  29   60:invokevirtual   #815 <Method byte[] PdfString.getBytes()>
	//*  30   63:aconst_null     
	//*  31   64:invokestatic    #821 <Method String PdfEncodings.convertToString(byte[], String)>
	//*  32   67:astore          4
	//*  33   69:iconst_0        
	//*  34   70:istore_3        
	//*  35   71:aload_0         
	//*  36   72:getfield        #191 <Field HashMap documentFileAttachment>
	//*  37   75:aload           4
	//*  38   77:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//*  39   80:ifeq            146
	//*  40   83:iload_3         
	//*  41   84:iconst_1        
	//*  42   85:iadd            
	//*  43   86:istore_3        
	//*  44   87:new             #794 <Class PdfString>
	//*  45   90:dup             
	//*  46   91:new             #826 <Class StringBuilder>
	//*  47   94:dup             
	//*  48   95:invokespecial   #827 <Method void StringBuilder()>
	//*  49   98:aload_1         
	//*  50   99:invokevirtual   #831 <Method StringBuilder StringBuilder.append(String)>
	//*  51  102:ldc2            #833 <String " ">
	//*  52  105:invokevirtual   #831 <Method StringBuilder StringBuilder.append(String)>
	//*  53  108:iload_3         
	//*  54  109:invokevirtual   #836 <Method StringBuilder StringBuilder.append(int)>
	//*  55  112:invokevirtual   #839 <Method String StringBuilder.toString()>
	//*  56  115:ldc2            #809 <String "UnicodeBig">
	//*  57  118:invokespecial   #811 <Method void PdfString(String, String)>
	//*  58  121:invokevirtual   #815 <Method byte[] PdfString.getBytes()>
	//*  59  124:aconst_null     
	//*  60  125:invokestatic    #821 <Method String PdfEncodings.convertToString(byte[], String)>
	//*  61  128:astore          4
	//*  62  130:goto            71
				s1 = PdfEncodings.convertToString(((PdfString) (s)).getBytes(), ((String) (null)));
	//   63  133:aload_1         
	//   64  134:invokevirtual   #815 <Method byte[] PdfString.getBytes()>
	//   65  137:aconst_null     
	//   66  138:invokestatic    #821 <Method String PdfEncodings.convertToString(byte[], String)>
	//   67  141:astore          4
		}
		pdffilespecification.addDescription(s1, true);
		s = s1;
		if(s1.length() == 0)
			s = "Unnamed";
		s1 = PdfEncodings.convertToString((new PdfString(s, "UnicodeBig")).getBytes(), ((String) (null)));
		i = 0;
		for(; documentFileAttachment.containsKey(((Object) (s1))); s1 = PdfEncodings.convertToString((new PdfString((new StringBuilder()).append(s).append(" ").append(i).toString(), "UnicodeBig")).getBytes(), ((String) (null))))
			i++;

	//*  68  143:goto            27
		documentFileAttachment.put(((Object) (s1)), ((Object) (pdffilespecification.getReference())));
	//   69  146:aload_0         
	//   70  147:getfield        #191 <Field HashMap documentFileAttachment>
	//   71  150:aload           4
	//   72  152:aload_2         
	//   73  153:invokevirtual   #842 <Method PdfIndirectReference PdfFileSpecification.getReference()>
	//   74  156:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   75  159:pop             
	//   76  160:return          
	}

	void addJavaScript(PdfAction pdfaction)
	{
		if(pdfaction.get(PdfName.JS) == null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #850 <Field PdfName PdfName.JS>
	//*   2    4:invokevirtual   #851 <Method PdfObject PdfAction.get(PdfName)>
	//*   3    7:ifnonnull       28
			throw new RuntimeException(MessageLocalization.getComposedMessage("only.javascript.actions.are.allowed", new Object[0]));
	//    4   10:new             #853 <Class RuntimeException>
	//    5   13:dup             
	//    6   14:ldc2            #855 <String "only.javascript.actions.are.allowed">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #864 <Method void RuntimeException(String)>
	//   11   27:athrow          
		try
		{
			HashMap hashmap = documentLevelJS;
	//   12   28:aload_0         
	//   13   29:getfield        #189 <Field HashMap documentLevelJS>
	//   14   32:astore_3        
			DecimalFormat decimalformat = SIXTEEN_DIGITS;
	//   15   33:getstatic       #125 <Field DecimalFormat SIXTEEN_DIGITS>
	//   16   36:astore          4
			int i = jsCounter;
	//   17   38:aload_0         
	//   18   39:getfield        #866 <Field int jsCounter>
	//   19   42:istore_2        
			jsCounter = i + 1;
	//   20   43:aload_0         
	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:putfield        #866 <Field int jsCounter>
			hashmap.put(((Object) (decimalformat.format(i))), ((Object) (writer.addToBody(((PdfObject) (pdfaction))).getIndirectReference())));
	//   25   50:aload_3         
	//   26   51:aload           4
	//   27   53:iload_2         
	//   28   54:i2l             
	//   29   55:invokevirtual   #870 <Method String DecimalFormat.format(long)>
	//   30   58:aload_0         
	//   31   59:getfield        #256 <Field PdfWriter writer>
	//   32   62:aload_1         
	//   33   63:invokevirtual   #874 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   34   66:invokevirtual   #879 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   35   69:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   36   72:pop             
			return;
	//   37   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(PdfAction pdfaction)
	//*  38   74:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfaction)));
	//   39   75:new             #881 <Class ExceptionConverter>
	//   40   78:dup             
	//   41   79:aload_1         
	//   42   80:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   43   83:athrow          
		}
	}

	void addJavaScript(String s, PdfAction pdfaction)
	{
		if(pdfaction.get(PdfName.JS) == null)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #850 <Field PdfName PdfName.JS>
	//*   2    4:invokevirtual   #851 <Method PdfObject PdfAction.get(PdfName)>
	//*   3    7:ifnonnull       28
			throw new RuntimeException(MessageLocalization.getComposedMessage("only.javascript.actions.are.allowed", new Object[0]));
	//    4   10:new             #853 <Class RuntimeException>
	//    5   13:dup             
	//    6   14:ldc2            #855 <String "only.javascript.actions.are.allowed">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #864 <Method void RuntimeException(String)>
	//   11   27:athrow          
		try
		{
			documentLevelJS.put(((Object) (s)), ((Object) (writer.addToBody(((PdfObject) (pdfaction))).getIndirectReference())));
	//   12   28:aload_0         
	//   13   29:getfield        #189 <Field HashMap documentLevelJS>
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:getfield        #256 <Field PdfWriter writer>
	//   17   37:aload_2         
	//   18   38:invokevirtual   #874 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   19   41:invokevirtual   #879 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   20   44:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
			return;
	//   22   48:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   49:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   24   50:new             #881 <Class ExceptionConverter>
	//   25   53:dup             
	//   26   54:aload_1         
	//   27   55:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   28   58:athrow          
		}
	}

	void addOutline(PdfOutline pdfoutline, String s)
	{
		localDestination(s, pdfoutline.getPdfDestination());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #889 <Method PdfDestination PdfOutline.getPdfDestination()>
	//    4    6:invokevirtual   #893 <Method boolean localDestination(String, PdfDestination)>
	//    5    9:pop             
	//    6   10:return          
	}

	void addPTable(PdfPTable pdfptable)
		throws DocumentException
	{
		int j;
		boolean flag;
		Object obj;
		if(isTagged(writer))
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*   3    7:ifeq            202
			obj = ((Object) (text));
	//    4   10:aload_0         
	//    5   11:getfield        #262 <Field PdfContentByte text>
	//    6   14:astore          5
		else
	//*   7   16:new             #895 <Class ColumnText>
	//*   8   19:dup             
	//*   9   20:aload           5
	//*  10   22:invokespecial   #898 <Method void ColumnText(PdfContentByte)>
	//*  11   25:astore          5
	//*  12   27:aload           5
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #901 <Method int PdfPTable.getRunDirection()>
	//*  15   33:invokevirtual   #904 <Method void ColumnText.setRunDirection(int)>
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #905 <Method boolean PdfPTable.getKeepTogether()>
	//*  18   40:ifeq            85
	//*  19   43:aload_0         
	//*  20   44:aload_1         
	//*  21   45:fconst_0        
	//*  22   46:invokevirtual   #909 <Method boolean fitsPage(PdfPTable, float)>
	//*  23   49:ifne            85
	//*  24   52:aload_0         
	//*  25   53:getfield        #151 <Field float currentHeight>
	//*  26   56:fconst_0        
	//*  27   57:fcmpl           
	//*  28   58:ifle            85
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #290 <Method boolean newPage()>
	//*  31   65:pop             
	//*  32   66:aload_0         
	//*  33   67:getfield        #256 <Field PdfWriter writer>
	//*  34   70:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  35   73:ifeq            85
	//*  36   76:aload           5
	//*  37   78:aload_0         
	//*  38   79:getfield        #262 <Field PdfContentByte text>
	//*  39   82:invokevirtual   #912 <Method void ColumnText.setCanvas(PdfContentByte)>
	//*  40   85:aload_0         
	//*  41   86:getfield        #151 <Field float currentHeight>
	//*  42   89:fconst_0        
	//*  43   90:fcmpl           
	//*  44   91:ifne            100
	//*  45   94:aload           5
	//*  46   96:iconst_0        
	//*  47   97:invokevirtual   #915 <Method void ColumnText.setAdjustFirstLine(boolean)>
	//*  48  100:aload           5
	//*  49  102:aload_1         
	//*  50  103:invokevirtual   #916 <Method void ColumnText.addElement(Element)>
	//*  51  106:aload_1         
	//*  52  107:invokevirtual   #919 <Method boolean PdfPTable.isHeadersInEvent()>
	//*  53  110:istore          4
	//*  54  112:aload_1         
	//*  55  113:iconst_1        
	//*  56  114:invokevirtual   #922 <Method void PdfPTable.setHeadersInEvent(boolean)>
	//*  57  117:iconst_0        
	//*  58  118:istore_3        
	//*  59  119:aload           5
	//*  60  121:aload_0         
	//*  61  122:invokevirtual   #241 <Method float indentLeft()>
	//*  62  125:aload_0         
	//*  63  126:invokevirtual   #244 <Method float indentBottom()>
	//*  64  129:aload_0         
	//*  65  130:invokevirtual   #247 <Method float indentRight()>
	//*  66  133:aload_0         
	//*  67  134:invokevirtual   #250 <Method float indentTop()>
	//*  68  137:aload_0         
	//*  69  138:getfield        #151 <Field float currentHeight>
	//*  70  141:fsub            
	//*  71  142:invokevirtual   #923 <Method void ColumnText.setSimpleColumn(float, float, float, float)>
	//*  72  145:aload           5
	//*  73  147:invokevirtual   #926 <Method int ColumnText.go()>
	//*  74  150:iconst_1        
	//*  75  151:iand            
	//*  76  152:ifeq            240
	//*  77  155:aload_0         
	//*  78  156:getfield        #256 <Field PdfWriter writer>
	//*  79  159:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  80  162:ifeq            214
	//*  81  165:aload_0         
	//*  82  166:getfield        #262 <Field PdfContentByte text>
	//*  83  169:aload_0         
	//*  84  170:invokevirtual   #241 <Method float indentLeft()>
	//*  85  173:aload           5
	//*  86  175:invokevirtual   #927 <Method float ColumnText.getYLine()>
	//*  87  178:invokevirtual   #275 <Method void PdfContentByte.setTextMatrix(float, float)>
	//*  88  181:aload_0         
	//*  89  182:aload_0         
	//*  90  183:invokevirtual   #250 <Method float indentTop()>
	//*  91  186:aload           5
	//*  92  188:invokevirtual   #927 <Method float ColumnText.getYLine()>
	//*  93  191:fsub            
	//*  94  192:putfield        #151 <Field float currentHeight>
	//*  95  195:aload_1         
	//*  96  196:iload           4
	//*  97  198:invokevirtual   #922 <Method void PdfPTable.setHeadersInEvent(boolean)>
	//*  98  201:return          
			obj = ((Object) (writer.getDirectContent()));
	//   99  202:aload_0         
	//  100  203:getfield        #256 <Field PdfWriter writer>
	//  101  206:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//  102  209:astore          5
		obj = ((Object) (new ColumnText(((PdfContentByte) (obj)))));
		((ColumnText) (obj)).setRunDirection(pdfptable.getRunDirection());
		if(pdfptable.getKeepTogether() && !fitsPage(pdfptable, 0.0F) && currentHeight > 0.0F)
		{
			newPage();
			if(isTagged(writer))
				((ColumnText) (obj)).setCanvas(text);
		}
		if(currentHeight == 0.0F)
			((ColumnText) (obj)).setAdjustFirstLine(false);
		((ColumnText) (obj)).addElement(((Element) (pdfptable)));
		flag = pdfptable.isHeadersInEvent();
		pdfptable.setHeadersInEvent(true);
		j = 0;
		do
		{
			int i;
			do
			{
				((ColumnText) (obj)).setSimpleColumn(indentLeft(), indentBottom(), indentRight(), indentTop() - currentHeight);
				if((((ColumnText) (obj)).go() & 1) != 0)
				{
					if(isTagged(writer))
						text.setTextMatrix(indentLeft(), ((ColumnText) (obj)).getYLine());
					else
	//* 103  211:goto            16
						text.moveText(0.0F, (((ColumnText) (obj)).getYLine() - indentTop()) + currentHeight);
	//  104  214:aload_0         
	//  105  215:getfield        #262 <Field PdfContentByte text>
	//  106  218:fconst_0        
	//  107  219:aload           5
	//  108  221:invokevirtual   #927 <Method float ColumnText.getYLine()>
	//  109  224:aload_0         
	//  110  225:invokevirtual   #250 <Method float indentTop()>
	//  111  228:fsub            
	//  112  229:aload_0         
	//  113  230:getfield        #151 <Field float currentHeight>
	//  114  233:fadd            
	//  115  234:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
					currentHeight = indentTop() - ((ColumnText) (obj)).getYLine();
					pdfptable.setHeadersInEvent(flag);
					return;
				}
	//* 116  237:goto            181
				if(indentTop() - currentHeight == ((ColumnText) (obj)).getYLine())
	//* 117  240:aload_0         
	//* 118  241:invokevirtual   #250 <Method float indentTop()>
	//* 119  244:aload_0         
	//* 120  245:getfield        #151 <Field float currentHeight>
	//* 121  248:fsub            
	//* 122  249:aload           5
	//* 123  251:invokevirtual   #927 <Method float ColumnText.getYLine()>
	//* 124  254:fcmpl           
	//* 125  255:ifne            285
					i = j + 1;
	//  126  258:iload_3         
	//  127  259:iconst_1        
	//  128  260:iadd            
	//  129  261:istore_2        
				else
	//* 130  262:iload_2         
	//* 131  263:iconst_3        
	//* 132  264:icmpne          290
	//* 133  267:new             #221 <Class DocumentException>
	//* 134  270:dup             
	//* 135  271:ldc2            #929 <String "infinite.table.loop">
	//* 136  274:iconst_0        
	//* 137  275:anewarray       Object[]
	//* 138  278:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 139  281:invokespecial   #930 <Method void DocumentException(String)>
	//* 140  284:athrow          
					i = 0;
	//  141  285:iconst_0        
	//  142  286:istore_2        
				if(i == 3)
					throw new DocumentException(MessageLocalization.getComposedMessage("infinite.table.loop", new Object[0]));
	//* 143  287:goto            262
				currentHeight = indentTop() - ((ColumnText) (obj)).getYLine();
	//  144  290:aload_0         
	//  145  291:aload_0         
	//  146  292:invokevirtual   #250 <Method float indentTop()>
	//  147  295:aload           5
	//  148  297:invokevirtual   #927 <Method float ColumnText.getYLine()>
	//  149  300:fsub            
	//  150  301:putfield        #151 <Field float currentHeight>
				newPage();
	//  151  304:aload_0         
	//  152  305:invokevirtual   #290 <Method boolean newPage()>
	//  153  308:pop             
				j = i;
	//  154  309:iload_2         
	//  155  310:istore_3        
			} while(!isTagged(writer));
	//  156  311:aload_0         
	//  157  312:getfield        #256 <Field PdfWriter writer>
	//  158  315:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//  159  318:ifeq            119
			((ColumnText) (obj)).setCanvas(text);
	//  160  321:aload           5
	//  161  323:aload_0         
	//  162  324:getfield        #262 <Field PdfContentByte text>
	//  163  327:invokevirtual   #912 <Method void ColumnText.setCanvas(PdfContentByte)>
			j = i;
	//  164  330:iload_2         
	//  165  331:istore_3        
		} while(true);
	//  166  332:goto            119
	}

	protected void addSpacing(float f, float f1, Font font)
	{
		addSpacing(f, f1, font, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #592 <Method void addSpacing(float, float, Font, boolean)>
	//    6    8:return          
	}

	protected void addSpacing(float f, float f1, Font font, boolean flag)
	{
		Font font1;
label0:
		{
			while(f == 0.0F || pageEmpty) 
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            7
				return;
	//    4    6:return          
	//    5    7:aload_0         
	//    6    8:getfield        #199 <Field boolean pageEmpty>
	//    7   11:ifne            6
			float f2;
			if(flag)
	//*   8   14:iload           4
	//*   9   16:ifeq            48
				f2 = f;
	//   10   19:fload_1         
	//   11   20:fstore          5
			else
	//*  12   22:aload_0         
	//*  13   23:getfield        #151 <Field float currentHeight>
	//*  14   26:fload           5
	//*  15   28:fadd            
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #250 <Method float indentTop()>
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #244 <Method float indentBottom()>
	//*  20   37:fsub            
	//*  21   38:fcmpl           
	//*  22   39:ifle            57
	//*  23   42:aload_0         
	//*  24   43:invokevirtual   #290 <Method boolean newPage()>
	//*  25   46:pop             
	//*  26   47:return          
				f2 = calculateLineHeight();
	//   27   48:aload_0         
	//   28   49:invokevirtual   #522 <Method float calculateLineHeight()>
	//   29   52:fstore          5
			if(currentHeight + f2 > indentTop() - indentBottom())
			{
				newPage();
				return;
			}
	//*  30   54:goto            22
			leading = f;
	//   31   57:aload_0         
	//   32   58:fload_1         
	//   33   59:putfield        #147 <Field float leading>
			carriageReturn();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #409 <Method void carriageReturn()>
			if(!font.isUnderlined())
	//*  36   66:aload_3         
	//*  37   67:invokevirtual   #935 <Method boolean Font.isUnderlined()>
	//*  38   70:ifne            83
			{
				font1 = font;
	//   39   73:aload_3         
	//   40   74:astore          6
				if(!font.isStrikethru())
					break label0;
	//   41   76:aload_3         
	//   42   77:invokevirtual   #938 <Method boolean Font.isStrikethru()>
	//   43   80:ifeq            109
			}
			font1 = new Font(font);
	//   44   83:new             #932 <Class Font>
	//   45   86:dup             
	//   46   87:aload_3         
	//   47   88:invokespecial   #941 <Method void Font(Font)>
	//   48   91:astore          6
			font1.setStyle(font1.getStyle() & -5 & -9);
	//   49   93:aload           6
	//   50   95:aload           6
	//   51   97:invokevirtual   #944 <Method int Font.getStyle()>
	//   52  100:bipush          -5
	//   53  102:iand            
	//   54  103:bipush          -9
	//   55  105:iand            
	//   56  106:invokevirtual   #947 <Method void Font.setStyle(int)>
		}
		Chunk chunk = new Chunk(" ", font1);
	//   57  109:new             #413 <Class Chunk>
	//   58  112:dup             
	//   59  113:ldc2            #833 <String " ">
	//   60  116:aload           6
	//   61  118:invokespecial   #950 <Method void Chunk(String, Font)>
	//   62  121:astore          7
		font = ((Font) (chunk));
	//   63  123:aload           7
	//   64  125:astore_3        
		if(flag)
	//*  65  126:iload           4
	//*  66  128:ifeq            154
		{
			font = ((Font) (chunk));
	//   67  131:aload           7
	//   68  133:astore_3        
			if(pageEmpty)
	//*  69  134:aload_0         
	//*  70  135:getfield        #199 <Field boolean pageEmpty>
	//*  71  138:ifeq            154
				font = ((Font) (new Chunk("", font1)));
	//   72  141:new             #413 <Class Chunk>
	//   73  144:dup             
	//   74  145:ldc2            #796 <String "">
	//   75  148:aload           6
	//   76  150:invokespecial   #950 <Method void Chunk(String, Font)>
	//   77  153:astore_3        
		}
		((Chunk) (font)).process(((com.itextpdf.text.ElementListener) (this)));
	//   78  154:aload_3         
	//   79  155:aload_0         
	//   80  156:invokevirtual   #951 <Method boolean Chunk.process(com.itextpdf.text.ElementListener)>
	//   81  159:pop             
		carriageReturn();
	//   82  160:aload_0         
	//   83  161:invokevirtual   #409 <Method void carriageReturn()>
		leading = f1;
	//   84  164:aload_0         
	//   85  165:fload_2         
	//   86  166:putfield        #147 <Field float leading>
	//   87  169:return          
	}

	void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		viewerPreferences.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field PdfViewerPreferencesImp viewerPreferences>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #954 <Method void PdfViewerPreferencesImp.addViewerPreference(PdfName, PdfObject)>
	//    5    9:return          
	}

	public void addWriter(PdfWriter pdfwriter)
		throws DocumentException
	{
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
		{
			writer = pdfwriter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #256 <Field PdfWriter writer>
			annotationsImp = new PdfAnnotationsImp(pdfwriter);
	//    6   12:aload_0         
	//    7   13:new             #481 <Class PdfAnnotationsImp>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #958 <Method void PdfAnnotationsImp(PdfWriter)>
	//   11   21:putfield        #487 <Field PdfAnnotationsImp annotationsImp>
			return;
	//   12   24:return          
		} else
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("you.can.only.add.a.writer.to.a.pdfdocument.once", new Object[0]));
	//   13   25:new             #221 <Class DocumentException>
	//   14   28:dup             
	//   15   29:ldc2            #960 <String "you.can.only.add.a.writer.to.a.pdfdocument.once">
	//   16   32:iconst_0        
	//   17   33:anewarray       Object[]
	//   18   36:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   39:invokespecial   #930 <Method void DocumentException(String)>
	//   20   42:athrow          
		}
	}

	protected float calculateLineHeight()
	{
		float f1 = line.height();
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field PdfLine line>
	//    2    4:invokevirtual   #963 <Method float PdfLine.height()>
	//    3    7:fstore_2        
		float f = f1;
	//    4    8:fload_2         
	//    5    9:fstore_1        
		if(f1 != leading)
	//*   6   10:fload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #147 <Field float leading>
	//*   9   15:fcmpl           
	//*  10   16:ifeq            26
			f = f1 + leading;
	//   11   19:fload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #147 <Field float leading>
	//   14   24:fadd            
	//   15   25:fstore_1        
		return f;
	//   16   26:fload_1         
	//   17   27:freturn         
	}

	void calculateOutlineCount()
	{
		if(rootOutline.getKids().size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #966 <Field PdfOutline rootOutline>
	//*   2    4:invokevirtual   #970 <Method ArrayList PdfOutline.getKids()>
	//*   3    7:invokevirtual   #296 <Method int ArrayList.size()>
	//*   4   10:ifne            14
		{
			return;
	//    5   13:return          
		} else
		{
			traverseOutlineCount(rootOutline);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #966 <Field PdfOutline rootOutline>
	//    9   19:invokevirtual   #974 <Method void traverseOutlineCount(PdfOutline)>
			return;
	//   10   22:return          
		}
	}

	protected void carriageReturn()
	{
		if(lines == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field ArrayList lines>
	//*   2    4:ifnonnull       18
			lines = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #166 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #167 <Method void ArrayList()>
	//    7   15:putfield        #169 <Field ArrayList lines>
		if(line != null && line.size() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #164 <Field PdfLine line>
	//*  10   22:ifnull          127
	//*  11   25:aload_0         
	//*  12   26:getfield        #164 <Field PdfLine line>
	//*  13   29:invokevirtual   #975 <Method int PdfLine.size()>
	//*  14   32:ifle            127
		{
			if(currentHeight + calculateLineHeight() > indentTop() - indentBottom() && currentHeight != 0.0F)
	//*  15   35:aload_0         
	//*  16   36:getfield        #151 <Field float currentHeight>
	//*  17   39:aload_0         
	//*  18   40:invokevirtual   #522 <Method float calculateLineHeight()>
	//*  19   43:fadd            
	//*  20   44:aload_0         
	//*  21   45:invokevirtual   #250 <Method float indentTop()>
	//*  22   48:aload_0         
	//*  23   49:invokevirtual   #244 <Method float indentBottom()>
	//*  24   52:fsub            
	//*  25   53:fcmpl           
	//*  26   54:ifle            94
	//*  27   57:aload_0         
	//*  28   58:getfield        #151 <Field float currentHeight>
	//*  29   61:fconst_0        
	//*  30   62:fcmpl           
	//*  31   63:ifeq            94
			{
				PdfLine pdfline = line;
	//   32   66:aload_0         
	//   33   67:getfield        #164 <Field PdfLine line>
	//   34   70:astore_1        
				line = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #164 <Field PdfLine line>
				newPage();
	//   38   76:aload_0         
	//   39   77:invokevirtual   #290 <Method boolean newPage()>
	//   40   80:pop             
				line = pdfline;
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:putfield        #164 <Field PdfLine line>
				pdfline.left = indentLeft();
	//   44   86:aload_1         
	//   45   87:aload_0         
	//   46   88:invokevirtual   #241 <Method float indentLeft()>
	//   47   91:putfield        #978 <Field float PdfLine.left>
			}
			currentHeight = currentHeight + line.height();
	//   48   94:aload_0         
	//   49   95:aload_0         
	//   50   96:getfield        #151 <Field float currentHeight>
	//   51   99:aload_0         
	//   52  100:getfield        #164 <Field PdfLine line>
	//   53  103:invokevirtual   #963 <Method float PdfLine.height()>
	//   54  106:fadd            
	//   55  107:putfield        #151 <Field float currentHeight>
			lines.add(((Object) (line)));
	//   56  110:aload_0         
	//   57  111:getfield        #169 <Field ArrayList lines>
	//   58  114:aload_0         
	//   59  115:getfield        #164 <Field PdfLine line>
	//   60  118:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   61  121:pop             
			pageEmpty = false;
	//   62  122:aload_0         
	//   63  123:iconst_0        
	//   64  124:putfield        #199 <Field boolean pageEmpty>
		}
		if(imageEnd > -1F && currentHeight > imageEnd)
	//*  65  127:aload_0         
	//*  66  128:getfield        #206 <Field float imageEnd>
	//*  67  131:ldc1            #204 <Float -1F>
	//*  68  133:fcmpl           
	//*  69  134:ifle            171
	//*  70  137:aload_0         
	//*  71  138:getfield        #151 <Field float currentHeight>
	//*  72  141:aload_0         
	//*  73  142:getfield        #206 <Field float imageEnd>
	//*  74  145:fcmpl           
	//*  75  146:ifle            171
		{
			imageEnd = -1F;
	//   76  149:aload_0         
	//   77  150:ldc1            #204 <Float -1F>
	//   78  152:putfield        #206 <Field float imageEnd>
			indentation.imageIndentRight = 0.0F;
	//   79  155:aload_0         
	//   80  156:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   81  159:fconst_0        
	//   82  160:putfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
			indentation.imageIndentLeft = 0.0F;
	//   83  163:aload_0         
	//   84  164:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   85  167:fconst_0        
	//   86  168:putfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
		}
		line = new PdfLine(indentLeft(), indentRight(), alignment, leading);
	//   87  171:aload_0         
	//   88  172:new             #302 <Class PdfLine>
	//   89  175:dup             
	//   90  176:aload_0         
	//   91  177:invokevirtual   #241 <Method float indentLeft()>
	//   92  180:aload_0         
	//   93  181:invokevirtual   #247 <Method float indentRight()>
	//   94  184:aload_0         
	//   95  185:getfield        #149 <Field int alignment>
	//   96  188:aload_0         
	//   97  189:getfield        #147 <Field float leading>
	//   98  192:invokespecial   #981 <Method void PdfLine(float, float, int, float)>
	//   99  195:putfield        #164 <Field PdfLine line>
	//  100  198:return          
	}

	public void clearTextWrap()
	{
		float f1 = imageEnd - currentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field float imageEnd>
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field float currentHeight>
	//    4    8:fsub            
	//    5    9:fstore_2        
		float f = f1;
	//    6   10:fload_2         
	//    7   11:fstore_1        
		if(line != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #164 <Field PdfLine line>
	//*  10   16:ifnull          29
			f = f1 + line.height();
	//   11   19:fload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #164 <Field PdfLine line>
	//   14   24:invokevirtual   #963 <Method float PdfLine.height()>
	//   15   27:fadd            
	//   16   28:fstore_1        
		if(imageEnd > -1F && f > 0.0F)
	//*  17   29:aload_0         
	//*  18   30:getfield        #206 <Field float imageEnd>
	//*  19   33:ldc1            #204 <Float -1F>
	//*  20   35:fcmpl           
	//*  21   36:ifle            59
	//*  22   39:fload_1         
	//*  23   40:fconst_0        
	//*  24   41:fcmpl           
	//*  25   42:ifle            59
		{
			carriageReturn();
	//   26   45:aload_0         
	//   27   46:invokevirtual   #409 <Method void carriageReturn()>
			currentHeight = currentHeight + f;
	//   28   49:aload_0         
	//   29   50:aload_0         
	//   30   51:getfield        #151 <Field float currentHeight>
	//   31   54:fload_1         
	//   32   55:fadd            
	//   33   56:putfield        #151 <Field float currentHeight>
		}
	//   34   59:return          
	}

	public void close()
	{
		if(close)
	//*   0    0:aload_0         
	//*   1    1:getfield        #985 <Field boolean close>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		int i;
		if(!isTagged(writer))
			break MISSING_BLOCK_LABEL_160;
	//    4    8:aload_0         
	//    5    9:getfield        #256 <Field PdfWriter writer>
	//    6   12:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//    7   15:ifeq            160
		flushFloatingElements();
	//    8   18:aload_0         
	//    9   19:invokespecial   #368 <Method void flushFloatingElements()>
		flushLines();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #348 <Method float flushLines()>
	//   12   26:pop             
		writer.flushAcroFields();
	//   13   27:aload_0         
	//   14   28:getfield        #256 <Field PdfWriter writer>
	//   15   31:invokevirtual   #988 <Method void PdfWriter.flushAcroFields()>
		writer.flushTaggedObjects();
	//   16   34:aload_0         
	//   17   35:getfield        #256 <Field PdfWriter writer>
	//   18   38:invokevirtual   #991 <Method void PdfWriter.flushTaggedObjects()>
		if(!isPageEmpty())
			break MISSING_BLOCK_LABEL_88;
	//   19   41:aload_0         
	//   20   42:invokevirtual   #287 <Method boolean isPageEmpty()>
	//   21   45:ifeq            88
		i = writer.pageReferences.size();
	//   22   48:aload_0         
	//   23   49:getfield        #256 <Field PdfWriter writer>
	//   24   52:getfield        #994 <Field ArrayList PdfWriter.pageReferences>
	//   25   55:invokevirtual   #296 <Method int ArrayList.size()>
	//   26   58:istore_1        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_88;
	//   27   59:iload_1         
	//   28   60:ifle            88
		if(writer.currentPageNumber == i)
	//*  29   63:aload_0         
	//*  30   64:getfield        #256 <Field PdfWriter writer>
	//*  31   67:getfield        #997 <Field int PdfWriter.currentPageNumber>
	//*  32   70:iload_1         
	//*  33   71:icmpne          88
			writer.pageReferences.remove(i - 1);
	//   34   74:aload_0         
	//   35   75:getfield        #256 <Field PdfWriter writer>
	//   36   78:getfield        #994 <Field ArrayList PdfWriter.pageReferences>
	//   37   81:iload_1         
	//   38   82:iconst_1        
	//   39   83:isub            
	//   40   84:invokevirtual   #999 <Method Object ArrayList.remove(int)>
	//   41   87:pop             
_L1:
		Exception exception;
		if(imageWait != null)
	//*  42   88:aload_0         
	//*  43   89:getfield        #208 <Field Image imageWait>
	//*  44   92:ifnull          100
			newPage();
	//   45   95:aload_0         
	//   46   96:invokevirtual   #290 <Method boolean newPage()>
	//   47   99:pop             
		endPage();
	//   48  100:aload_0         
	//   49  101:invokevirtual   #1002 <Method ArrayList endPage()>
	//   50  104:pop             
		if(isTagged(writer))
	//*  51  105:aload_0         
	//*  52  106:getfield        #256 <Field PdfWriter writer>
	//*  53  109:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  54  112:ifeq            126
			writer.getDirectContent().closeMCBlock(((IAccessibleElement) (this)));
	//   55  115:aload_0         
	//   56  116:getfield        #256 <Field PdfWriter writer>
	//   57  119:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//   58  122:aload_0         
	//   59  123:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		if(annotationsImp.hasUnusedAnnotations())
	//*  60  126:aload_0         
	//*  61  127:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//*  62  130:invokevirtual   #1005 <Method boolean PdfAnnotationsImp.hasUnusedAnnotations()>
	//*  63  133:ifeq            170
			throw new RuntimeException(MessageLocalization.getComposedMessage("not.all.annotations.could.be.added.to.the.document.the.document.doesn.t.have.enough.pages", new Object[0]));
	//   64  136:new             #853 <Class RuntimeException>
	//   65  139:dup             
	//   66  140:ldc2            #1007 <String "not.all.annotations.could.be.added.to.the.document.the.document.doesn.t.have.enough.pages">
	//   67  143:iconst_0        
	//   68  144:anewarray       Object[]
	//   69  147:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   70  150:invokespecial   #864 <Method void RuntimeException(String)>
	//   71  153:athrow          
		break MISSING_BLOCK_LABEL_170;
	//*  72  154:astore_2        
	//*  73  155:aload_2         
	//*  74  156:invokestatic    #1011 <Method RuntimeException ExceptionConverter.convertException(Exception)>
	//*  75  159:athrow          
		try
		{
			writer.flushAcroFields();
	//   76  160:aload_0         
	//   77  161:getfield        #256 <Field PdfWriter writer>
	//   78  164:invokevirtual   #988 <Method void PdfWriter.flushAcroFields()>
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			throw ExceptionConverter.convertException(exception);
		}
		  goto _L1
	//*  79  167:goto            88
		PdfPageEvent pdfpageevent = writer.getPageEvent();
	//   80  170:aload_0         
	//   81  171:getfield        #256 <Field PdfWriter writer>
	//   82  174:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//   83  177:astore_2        
		if(pdfpageevent == null)
			break MISSING_BLOCK_LABEL_193;
	//   84  178:aload_2         
	//   85  179:ifnull          193
		pdfpageevent.onCloseDocument(writer, ((Document) (this)));
	//   86  182:aload_2         
	//   87  183:aload_0         
	//   88  184:getfield        #256 <Field PdfWriter writer>
	//   89  187:aload_0         
	//   90  188:invokeinterface #1014 <Method void PdfPageEvent.onCloseDocument(PdfWriter, Document)>
		super.close();
	//   91  193:aload_0         
	//   92  194:invokespecial   #1016 <Method void Document.close()>
		writer.addLocalDestinations(localDestinations);
	//   93  197:aload_0         
	//   94  198:getfield        #256 <Field PdfWriter writer>
	//   95  201:aload_0         
	//   96  202:getfield        #187 <Field TreeMap localDestinations>
	//   97  205:invokevirtual   #1020 <Method void PdfWriter.addLocalDestinations(TreeMap)>
		calculateOutlineCount();
	//   98  208:aload_0         
	//   99  209:invokevirtual   #1022 <Method void calculateOutlineCount()>
		writeOutlines();
	//  100  212:aload_0         
	//  101  213:invokevirtual   #1025 <Method void writeOutlines()>
		writer.close();
	//  102  216:aload_0         
	//  103  217:getfield        #256 <Field PdfWriter writer>
	//  104  220:invokevirtual   #1026 <Method void PdfWriter.close()>
		return;
	//  105  223:return          
	}

	protected ArrayList endPage()
	{
		int i;
		Object obj;
		if(isPageEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #287 <Method boolean isPageEmpty()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		PdfPageEvent pdfpageevent;
		try
		{
			flushFloatingElements();
	//    7   11:aload_0         
	//    8   12:invokespecial   #368 <Method void flushFloatingElements()>
		}
	//*   9   15:aload_0         
	//*  10   16:iconst_m1       
	//*  11   17:putfield        #171 <Field int lastElementType>
	//*  12   20:aload_0         
	//*  13   21:getfield        #256 <Field PdfWriter writer>
	//*  14   24:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//*  15   27:astore_3        
	//*  16   28:aload_3         
	//*  17   29:ifnull          43
	//*  18   32:aload_3         
	//*  19   33:aload_0         
	//*  20   34:getfield        #256 <Field PdfWriter writer>
	//*  21   37:aload_0         
	//*  22   38:invokeinterface #1029 <Method void PdfPageEvent.onEndPage(PdfWriter, Document)>
	//*  23   43:aload_0         
	//*  24   44:invokevirtual   #348 <Method float flushLines()>
	//*  25   47:pop             
	//*  26   48:aload_0         
	//*  27   49:getfield        #607 <Field Rectangle pageSize>
	//*  28   52:invokevirtual   #610 <Method int Rectangle.getRotation()>
	//*  29   55:istore_1        
	//*  30   56:aload_0         
	//*  31   57:getfield        #256 <Field PdfWriter writer>
	//*  32   60:invokevirtual   #1032 <Method boolean PdfWriter.isPdfIso()>
	//*  33   63:ifeq            190
	//*  34   66:aload_0         
	//*  35   67:getfield        #195 <Field HashMap thisBoxSize>
	//*  36   70:ldc2            #1034 <String "art">
	//*  37   73:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//*  38   76:ifeq            130
	//*  39   79:aload_0         
	//*  40   80:getfield        #195 <Field HashMap thisBoxSize>
	//*  41   83:ldc2            #1036 <String "trim">
	//*  42   86:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//*  43   89:ifeq            130
	//*  44   92:new             #1038 <Class PdfXConformanceException>
	//*  45   95:dup             
	//*  46   96:ldc2            #1040 <String "only.one.of.artbox.or.trimbox.can.exist.in.the.page">
	//*  47   99:iconst_0        
	//*  48  100:anewarray       Object[]
	//*  49  103:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  50  106:invokespecial   #1041 <Method void PdfXConformanceException(String)>
	//*  51  109:athrow          
	//*  52  110:astore_2        
	//*  53  111:new             #881 <Class ExceptionConverter>
	//*  54  114:dup             
	//*  55  115:aload_2         
	//*  56  116:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//*  57  119:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  58  120:astore_2        
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//   59  121:new             #881 <Class ExceptionConverter>
	//   60  124:dup             
	//   61  125:aload_2         
	//   62  126:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   63  129:athrow          
		}
		lastElementType = -1;
		pdfpageevent = writer.getPageEvent();
		if(pdfpageevent != null)
			pdfpageevent.onEndPage(writer, ((Document) (this)));
		flushLines();
		i = pageSize.getRotation();
		if(!writer.isPdfIso()) goto _L2; else goto _L1
_L1:
		if(thisBoxSize.containsKey("art") && thisBoxSize.containsKey("trim"))
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("only.one.of.artbox.or.trimbox.can.exist.in.the.page", new Object[0]));
		if(thisBoxSize.containsKey("art") || thisBoxSize.containsKey("trim")) goto _L2; else goto _L3
	//   64  130:aload_0         
	//   65  131:getfield        #195 <Field HashMap thisBoxSize>
	//   66  134:ldc2            #1034 <String "art">
	//   67  137:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//   68  140:ifne            190
	//   69  143:aload_0         
	//   70  144:getfield        #195 <Field HashMap thisBoxSize>
	//   71  147:ldc2            #1036 <String "trim">
	//   72  150:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//   73  153:ifne            190
_L3:
		if(!thisBoxSize.containsKey("crop")) goto _L5; else goto _L4
	//   74  156:aload_0         
	//   75  157:getfield        #195 <Field HashMap thisBoxSize>
	//   76  160:ldc2            #1043 <String "crop">
	//   77  163:invokevirtual   #824 <Method boolean HashMap.containsKey(Object)>
	//   78  166:ifeq            572
_L4:
		thisBoxSize.put("trim", thisBoxSize.get("crop"));
	//   79  169:aload_0         
	//   80  170:getfield        #195 <Field HashMap thisBoxSize>
	//   81  173:ldc2            #1036 <String "trim">
	//   82  176:aload_0         
	//   83  177:getfield        #195 <Field HashMap thisBoxSize>
	//   84  180:ldc2            #1043 <String "crop">
	//   85  183:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//   86  186:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   87  189:pop             
_L2:
		PdfPage pdfpage;
		pageResources.addDefaultColorDiff(writer.getDefaultColorspace());
	//   88  190:aload_0         
	//   89  191:getfield        #1048 <Field PageResources pageResources>
	//   90  194:aload_0         
	//   91  195:getfield        #256 <Field PdfWriter writer>
	//   92  198:invokevirtual   #1052 <Method PdfDictionary PdfWriter.getDefaultColorspace()>
	//   93  201:invokevirtual   #1058 <Method void PageResources.addDefaultColorDiff(PdfDictionary)>
		if(writer.isRgbTransparencyBlending())
	//*  94  204:aload_0         
	//*  95  205:getfield        #256 <Field PdfWriter writer>
	//*  96  208:invokevirtual   #1061 <Method boolean PdfWriter.isRgbTransparencyBlending()>
	//*  97  211:ifeq            240
		{
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   98  214:new             #760 <Class PdfDictionary>
	//   99  217:dup             
	//  100  218:invokespecial   #761 <Method void PdfDictionary()>
	//  101  221:astore_3        
			pdfdictionary.put(PdfName.CS, ((PdfObject) (PdfName.DEVICERGB)));
	//  102  222:aload_3         
	//  103  223:getstatic       #1064 <Field PdfName PdfName.CS>
	//  104  226:getstatic       #1067 <Field PdfName PdfName.DEVICERGB>
	//  105  229:invokevirtual   #770 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pageResources.addDefaultColorDiff(pdfdictionary);
	//  106  232:aload_0         
	//  107  233:getfield        #1048 <Field PageResources pageResources>
	//  108  236:aload_3         
	//  109  237:invokevirtual   #1058 <Method void PageResources.addDefaultColorDiff(PdfDictionary)>
		}
		PdfDictionary pdfdictionary1 = pageResources.getResources();
	//  110  240:aload_0         
	//  111  241:getfield        #1048 <Field PageResources pageResources>
	//  112  244:invokevirtual   #1070 <Method PdfDictionary PageResources.getResources()>
	//  113  247:astore_3        
		pdfpage = new PdfPage(new PdfRectangle(pageSize, i), thisBoxSize, pdfdictionary1, i);
	//  114  248:new             #1072 <Class PdfPage>
	//  115  251:dup             
	//  116  252:new             #1074 <Class PdfRectangle>
	//  117  255:dup             
	//  118  256:aload_0         
	//  119  257:getfield        #607 <Field Rectangle pageSize>
	//  120  260:iload_1         
	//  121  261:invokespecial   #1077 <Method void PdfRectangle(Rectangle, int)>
	//  122  264:aload_0         
	//  123  265:getfield        #195 <Field HashMap thisBoxSize>
	//  124  268:aload_3         
	//  125  269:iload_1         
	//  126  270:invokespecial   #1080 <Method void PdfPage(PdfRectangle, HashMap, PdfDictionary, int)>
	//  127  273:astore          4
		if(!isTagged(writer)) goto _L7; else goto _L6
	//  128  275:aload_0         
	//  129  276:getfield        #256 <Field PdfWriter writer>
	//  130  279:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//  131  282:ifeq            604
_L6:
		pdfpage.put(PdfName.TABS, ((PdfObject) (PdfName.S)));
	//  132  285:aload           4
	//  133  287:getstatic       #1083 <Field PdfName PdfName.TABS>
	//  134  290:getstatic       #1086 <Field PdfName PdfName.S>
	//  135  293:invokevirtual   #1087 <Method void PdfPage.put(PdfName, PdfObject)>
_L10:
		pdfpage.putAll(writer.getPageDictEntries());
	//  136  296:aload           4
	//  137  298:aload_0         
	//  138  299:getfield        #256 <Field PdfWriter writer>
	//  139  302:invokevirtual   #1090 <Method PdfDictionary PdfWriter.getPageDictEntries()>
	//  140  305:invokevirtual   #1093 <Method void PdfPage.putAll(PdfDictionary)>
		writer.resetPageDictEntries();
	//  141  308:aload_0         
	//  142  309:getfield        #256 <Field PdfWriter writer>
	//  143  312:invokevirtual   #1096 <Method void PdfWriter.resetPageDictEntries()>
		if(pageAA != null)
	//* 144  315:aload_0         
	//* 145  316:getfield        #201 <Field PdfDictionary pageAA>
	//* 146  319:ifnull          349
		{
			pdfpage.put(PdfName.AA, ((PdfObject) (writer.addToBody(((PdfObject) (pageAA))).getIndirectReference())));
	//  147  322:aload           4
	//  148  324:getstatic       #1099 <Field PdfName PdfName.AA>
	//  149  327:aload_0         
	//  150  328:getfield        #256 <Field PdfWriter writer>
	//  151  331:aload_0         
	//  152  332:getfield        #201 <Field PdfDictionary pageAA>
	//  153  335:invokevirtual   #874 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  154  338:invokevirtual   #879 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  155  341:invokevirtual   #1087 <Method void PdfPage.put(PdfName, PdfObject)>
			pageAA = null;
	//  156  344:aload_0         
	//  157  345:aconst_null     
	//  158  346:putfield        #201 <Field PdfDictionary pageAA>
		}
		if(annotationsImp.hasUnusedAnnotations())
	//* 159  349:aload_0         
	//* 160  350:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//* 161  353:invokevirtual   #1005 <Method boolean PdfAnnotationsImp.hasUnusedAnnotations()>
	//* 162  356:ifeq            391
		{
			PdfArray pdfarray = annotationsImp.rotateAnnotations(writer, pageSize);
	//  163  359:aload_0         
	//  164  360:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//  165  363:aload_0         
	//  166  364:getfield        #256 <Field PdfWriter writer>
	//  167  367:aload_0         
	//  168  368:getfield        #607 <Field Rectangle pageSize>
	//  169  371:invokevirtual   #1103 <Method PdfArray PdfAnnotationsImp.rotateAnnotations(PdfWriter, Rectangle)>
	//  170  374:astore_3        
			if(pdfarray.size() != 0)
	//* 171  375:aload_3         
	//* 172  376:invokevirtual   #1106 <Method int PdfArray.size()>
	//* 173  379:ifeq            391
				pdfpage.put(PdfName.ANNOTS, ((PdfObject) (pdfarray)));
	//  174  382:aload           4
	//  175  384:getstatic       #1109 <Field PdfName PdfName.ANNOTS>
	//  176  387:aload_3         
	//  177  388:invokevirtual   #1087 <Method void PdfPage.put(PdfName, PdfObject)>
		}
		if(isTagged(writer))
	//* 178  391:aload_0         
	//* 179  392:getfield        #256 <Field PdfWriter writer>
	//* 180  395:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 181  398:ifeq            427
			pdfpage.put(PdfName.STRUCTPARENTS, ((PdfObject) (new PdfNumber(getStructParentIndex(((Object) (writer.getCurrentPage())))))));
	//  182  401:aload           4
	//  183  403:getstatic       #1112 <Field PdfName PdfName.STRUCTPARENTS>
	//  184  406:new             #1114 <Class PdfNumber>
	//  185  409:dup             
	//  186  410:aload_0         
	//  187  411:aload_0         
	//  188  412:getfield        #256 <Field PdfWriter writer>
	//  189  415:invokevirtual   #1117 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//  190  418:invokevirtual   #1121 <Method int getStructParentIndex(Object)>
	//  191  421:invokespecial   #1122 <Method void PdfNumber(int)>
	//  192  424:invokevirtual   #1087 <Method void PdfPage.put(PdfName, PdfObject)>
		if(text.size() <= textEmptySize && !isTagged(writer)) goto _L9; else goto _L8
	//  193  427:aload_0         
	//  194  428:getfield        #262 <Field PdfContentByte text>
	//  195  431:invokevirtual   #1123 <Method int PdfContentByte.size()>
	//  196  434:aload_0         
	//  197  435:getfield        #1125 <Field int textEmptySize>
	//  198  438:icmpgt          451
	//  199  441:aload_0         
	//  200  442:getfield        #256 <Field PdfWriter writer>
	//  201  445:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//  202  448:ifeq            622
_L8:
		text.endText();
	//  203  451:aload_0         
	//  204  452:getfield        #262 <Field PdfContentByte text>
	//  205  455:invokevirtual   #1128 <Method void PdfContentByte.endText()>
_L11:
		PdfContentByte pdfcontentbyte;
		PdfWriter pdfwriter;
		PdfContentByte pdfcontentbyte1;
		PdfContentByte pdfcontentbyte2;
		if(isTagged(writer))
	//* 206  458:aload_0         
	//* 207  459:getfield        #256 <Field PdfWriter writer>
	//* 208  462:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 209  465:ifeq            479
			obj = ((Object) (writer.getDirectContent().saveMCBlocks()));
	//  210  468:aload_0         
	//  211  469:getfield        #256 <Field PdfWriter writer>
	//  212  472:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//  213  475:invokevirtual   #1131 <Method ArrayList PdfContentByte.saveMCBlocks()>
	//  214  478:astore_2        
		pdfwriter = writer;
	//  215  479:aload_0         
	//  216  480:getfield        #256 <Field PdfWriter writer>
	//  217  483:astore          5
		pdfcontentbyte1 = writer.getDirectContentUnder();
	//  218  485:aload_0         
	//  219  486:getfield        #256 <Field PdfWriter writer>
	//  220  489:invokevirtual   #1134 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//  221  492:astore          6
		pdfcontentbyte2 = graphics;
	//  222  494:aload_0         
	//  223  495:getfield        #314 <Field PdfContentByte graphics>
	//  224  498:astore          7
		if(isTagged(writer))
			break MISSING_BLOCK_LABEL_630;
	//  225  500:aload_0         
	//  226  501:getfield        #256 <Field PdfWriter writer>
	//  227  504:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//  228  507:ifne            630
		pdfcontentbyte = text;
	//  229  510:aload_0         
	//  230  511:getfield        #262 <Field PdfContentByte text>
	//  231  514:astore_3        
_L12:
		pdfwriter.add(pdfpage, new PdfContents(pdfcontentbyte1, pdfcontentbyte2, pdfcontentbyte, writer.getDirectContent(), pageSize));
	//  232  515:aload           5
	//  233  517:aload           4
	//  234  519:new             #1136 <Class PdfContents>
	//  235  522:dup             
	//  236  523:aload           6
	//  237  525:aload           7
	//  238  527:aload_3         
	//  239  528:aload_0         
	//  240  529:getfield        #256 <Field PdfWriter writer>
	//  241  532:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//  242  535:aload_0         
	//  243  536:getfield        #607 <Field Rectangle pageSize>
	//  244  539:invokespecial   #1139 <Method void PdfContents(PdfContentByte, PdfContentByte, PdfContentByte, PdfContentByte, Rectangle)>
	//  245  542:invokevirtual   #1142 <Method PdfIndirectReference PdfWriter.add(PdfPage, PdfContents)>
	//  246  545:pop             
		annotationsImp.resetAnnotations();
	//  247  546:aload_0         
	//  248  547:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//  249  550:invokevirtual   #1145 <Method void PdfAnnotationsImp.resetAnnotations()>
		writer.resetContent();
	//  250  553:aload_0         
	//  251  554:getfield        #256 <Field PdfWriter writer>
	//  252  557:invokevirtual   #1148 <Method void PdfWriter.resetContent()>
		IOException ioexception;
		return ((ArrayList) (obj));
	//  253  560:aload_2         
	//  254  561:areturn         
	//* 255  562:astore_2        
	//* 256  563:new             #881 <Class ExceptionConverter>
	//* 257  566:dup             
	//* 258  567:aload_2         
	//* 259  568:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//* 260  571:athrow          
_L5:
		try
		{
			thisBoxSize.put("trim", ((Object) (new PdfRectangle(pageSize, pageSize.getRotation()))));
	//  261  572:aload_0         
	//  262  573:getfield        #195 <Field HashMap thisBoxSize>
	//  263  576:ldc2            #1036 <String "trim">
	//  264  579:new             #1074 <Class PdfRectangle>
	//  265  582:dup             
	//  266  583:aload_0         
	//  267  584:getfield        #607 <Field Rectangle pageSize>
	//  268  587:aload_0         
	//  269  588:getfield        #607 <Field Rectangle pageSize>
	//  270  591:invokevirtual   #610 <Method int Rectangle.getRotation()>
	//  271  594:invokespecial   #1077 <Method void PdfRectangle(Rectangle, int)>
	//  272  597:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//  273  600:pop             
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new ExceptionConverter(((Exception) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
		}
		  goto _L2
	//* 274  601:goto            190
_L7:
		pdfpage.put(PdfName.TABS, ((PdfObject) (writer.getTabs())));
	//  275  604:aload           4
	//  276  606:getstatic       #1083 <Field PdfName PdfName.TABS>
	//  277  609:aload_0         
	//  278  610:getfield        #256 <Field PdfWriter writer>
	//  279  613:invokevirtual   #1152 <Method PdfName PdfWriter.getTabs()>
	//  280  616:invokevirtual   #1087 <Method void PdfPage.put(PdfName, PdfObject)>
		  goto _L10
	//* 281  619:goto            296
_L9:
		text = null;
	//  282  622:aload_0         
	//  283  623:aconst_null     
	//  284  624:putfield        #262 <Field PdfContentByte text>
		  goto _L11
	//* 285  627:goto            458
		pdfcontentbyte = null;
	//  286  630:aconst_null     
	//  287  631:astore_3        
		  goto _L12
	//* 288  632:goto            515
	}

	protected void ensureNewLine()
	{
		try
		{
			if(lastElementType == 11 || lastElementType == 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field int lastElementType>
	//*   2    4:bipush          11
	//*   3    6:icmpeq          18
	//*   4    9:aload_0         
	//*   5   10:getfield        #171 <Field int lastElementType>
	//*   6   13:bipush          10
	//*   7   15:icmpne          27
			{
				newLine();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #351 <Method void newLine()>
				flushLines();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #348 <Method float flushLines()>
	//   12   26:pop             
			}
			return;
	//   13   27:return          
		}
		catch(DocumentException documentexception)
	//*  14   28:astore_1        
		{
			throw new ExceptionConverter(((Exception) (documentexception)));
	//   15   29:new             #881 <Class ExceptionConverter>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   19   37:athrow          
		}
	}

	boolean fitsPage(PdfPTable pdfptable, float f)
	{
		if(!pdfptable.isLockedWidth())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1157 <Method boolean PdfPTable.isLockedWidth()>
	//*   2    4:ifne            29
			pdfptable.setTotalWidth(((indentRight() - indentLeft()) * pdfptable.getWidthPercentage()) / 100F);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #247 <Method float indentRight()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #241 <Method float indentLeft()>
	//    8   16:fsub            
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1160 <Method float PdfPTable.getWidthPercentage()>
	//   11   21:fmul            
	//   12   22:ldc2            #551 <Float 100F>
	//   13   25:fdiv            
	//   14   26:invokevirtual   #1163 <Method void PdfPTable.setTotalWidth(float)>
		ensureNewLine();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #716 <Method void ensureNewLine()>
		float f1;
		float f2;
		if(pdfptable.isSkipFirstHeader())
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #1166 <Method boolean PdfPTable.isSkipFirstHeader()>
	//*  19   37:ifeq            99
			f1 = pdfptable.getTotalHeight() - pdfptable.getHeaderHeight();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #1169 <Method float PdfPTable.getTotalHeight()>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #1172 <Method float PdfPTable.getHeaderHeight()>
	//   24   48:fsub            
	//   25   49:fstore_3        
		else
	//*  26   50:fload_3         
	//*  27   51:invokestatic    #1178 <Method Float Float.valueOf(float)>
	//*  28   54:invokevirtual   #1181 <Method float Float.floatValue()>
	//*  29   57:fstore          4
	//*  30   59:aload_0         
	//*  31   60:getfield        #151 <Field float currentHeight>
	//*  32   63:fconst_0        
	//*  33   64:fcmpl           
	//*  34   65:ifle            107
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #1184 <Method float PdfPTable.spacingBefore()>
	//*  37   72:fstore_3        
	//*  38   73:fload_3         
	//*  39   74:fload           4
	//*  40   76:fadd            
	//*  41   77:aload_0         
	//*  42   78:invokevirtual   #250 <Method float indentTop()>
	//*  43   81:aload_0         
	//*  44   82:getfield        #151 <Field float currentHeight>
	//*  45   85:fsub            
	//*  46   86:aload_0         
	//*  47   87:invokevirtual   #244 <Method float indentBottom()>
	//*  48   90:fsub            
	//*  49   91:fload_2         
	//*  50   92:fsub            
	//*  51   93:fcmpg           
	//*  52   94:ifgt            112
	//*  53   97:iconst_1        
	//*  54   98:ireturn         
			f1 = pdfptable.getTotalHeight();
	//   55   99:aload_1         
	//   56  100:invokevirtual   #1169 <Method float PdfPTable.getTotalHeight()>
	//   57  103:fstore_3        
		f2 = Float.valueOf(f1).floatValue();
		if(currentHeight > 0.0F)
			f1 = pdfptable.spacingBefore();
		else
	//*  58  104:goto            50
			f1 = 0.0F;
	//   59  107:fconst_0        
	//   60  108:fstore_3        
		return f1 + f2 <= indentTop() - currentHeight - indentBottom() - f;
	//   61  109:goto            73
	//   62  112:iconst_0        
	//   63  113:ireturn         
	}

	protected float flushLines()
		throws DocumentException
	{
		if(lines == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field ArrayList lines>
	//*   2    4:ifnonnull       9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		if(line != null && line.size() > 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #164 <Field PdfLine line>
	//*   7   13:ifnull          65
	//*   8   16:aload_0         
	//*   9   17:getfield        #164 <Field PdfLine line>
	//*  10   20:invokevirtual   #975 <Method int PdfLine.size()>
	//*  11   23:ifle            65
		{
			lines.add(((Object) (line)));
	//   12   26:aload_0         
	//   13   27:getfield        #169 <Field ArrayList lines>
	//   14   30:aload_0         
	//   15   31:getfield        #164 <Field PdfLine line>
	//   16   34:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   17   37:pop             
			line = new PdfLine(indentLeft(), indentRight(), alignment, leading);
	//   18   38:aload_0         
	//   19   39:new             #302 <Class PdfLine>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokevirtual   #241 <Method float indentLeft()>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #247 <Method float indentRight()>
	//   25   51:aload_0         
	//   26   52:getfield        #149 <Field int alignment>
	//   27   55:aload_0         
	//   28   56:getfield        #147 <Field float leading>
	//   29   59:invokespecial   #981 <Method void PdfLine(float, float, int, float)>
	//   30   62:putfield        #164 <Field PdfLine line>
		}
		if(lines.isEmpty())
	//*  31   65:aload_0         
	//*  32   66:getfield        #169 <Field ArrayList lines>
	//*  33   69:invokevirtual   #232 <Method boolean ArrayList.isEmpty()>
	//*  34   72:ifeq            77
			return 0.0F;
	//   35   75:fconst_0        
	//   36   76:freturn         
		Object aobj[] = new Object[2];
	//   37   77:iconst_2        
	//   38   78:anewarray       Object[]
	//   39   81:astore          7
		Object obj = null;
	//   40   83:aconst_null     
	//   41   84:astore_3        
		float f = 0.0F;
	//   42   85:fconst_0        
	//   43   86:fstore_1        
		aobj[1] = ((Object) (new Float(0.0F)));
	//   44   87:aload           7
	//   45   89:iconst_1        
	//   46   90:new             #1174 <Class Float>
	//   47   93:dup             
	//   48   94:fconst_0        
	//   49   95:invokespecial   #1186 <Method void Float(float)>
	//   50   98:aastore         
		float f1;
		for(Iterator iterator = lines.iterator(); iterator.hasNext(); text.moveText(-f1, 0.0F))
	//*  51   99:aload_0         
	//*  52  100:getfield        #169 <Field ArrayList lines>
	//*  53  103:invokevirtual   #1190 <Method Iterator ArrayList.iterator()>
	//*  54  106:astore          8
	//*  55  108:aload           8
	//*  56  110:invokeinterface #1195 <Method boolean Iterator.hasNext()>
	//*  57  115:ifeq            395
		{
			PdfLine pdfline = (PdfLine)iterator.next();
	//   58  118:aload           8
	//   59  120:invokeinterface #1199 <Method Object Iterator.next()>
	//   60  125:checkcast       #302 <Class PdfLine>
	//   61  128:astore          9
			f1 = (pdfline.indentLeft() - indentLeft()) + indentation.indentLeft + indentation.listIndentLeft + indentation.sectionIndentLeft;
	//   62  130:aload           9
	//   63  132:invokevirtual   #1200 <Method float PdfLine.indentLeft()>
	//   64  135:aload_0         
	//   65  136:invokevirtual   #241 <Method float indentLeft()>
	//   66  139:fsub            
	//   67  140:aload_0         
	//   68  141:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   69  144:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//   70  147:fadd            
	//   71  148:aload_0         
	//   72  149:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   73  152:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//   74  155:fadd            
	//   75  156:aload_0         
	//   76  157:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   77  160:getfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//   78  163:fadd            
	//   79  164:fstore_2        
			text.moveText(f1, -pdfline.height());
	//   80  165:aload_0         
	//   81  166:getfield        #262 <Field PdfContentByte text>
	//   82  169:fload_2         
	//   83  170:aload           9
	//   84  172:invokevirtual   #963 <Method float PdfLine.height()>
	//   85  175:fneg            
	//   86  176:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
			pdfline.flush();
	//   87  179:aload           9
	//   88  181:invokevirtual   #1203 <Method void PdfLine.flush()>
			if(pdfline.listSymbol() != null)
	//*  89  184:aload           9
	//*  90  186:invokevirtual   #1207 <Method Chunk PdfLine.listSymbol()>
	//*  91  189:ifnull          304
			{
				com.itextpdf.text.ListLabel listlabel = null;
	//   92  192:aconst_null     
	//   93  193:astore          5
				Chunk chunk1 = pdfline.listSymbol();
	//   94  195:aload           9
	//   95  197:invokevirtual   #1207 <Method Chunk PdfLine.listSymbol()>
	//   96  200:astore          6
				Chunk chunk = chunk1;
	//   97  202:aload           6
	//   98  204:astore          4
				if(isTagged(writer))
	//*  99  206:aload_0         
	//* 100  207:getfield        #256 <Field PdfWriter writer>
	//* 101  210:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 102  213:ifeq            252
				{
					listlabel = pdfline.listItem().getListLabel();
	//  103  216:aload           9
	//  104  218:invokevirtual   #1211 <Method ListItem PdfLine.listItem()>
	//  105  221:invokevirtual   #1215 <Method com.itextpdf.text.ListLabel ListItem.getListLabel()>
	//  106  224:astore          5
					graphics.openMCBlock(((IAccessibleElement) (listlabel)));
	//  107  226:aload_0         
	//  108  227:getfield        #314 <Field PdfContentByte graphics>
	//  109  230:aload           5
	//  110  232:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
					chunk = new Chunk(chunk1);
	//  111  235:new             #413 <Class Chunk>
	//  112  238:dup             
	//  113  239:aload           6
	//  114  241:invokespecial   #1218 <Method void Chunk(Chunk)>
	//  115  244:astore          4
					chunk.setRole(((PdfName) (null)));
	//  116  246:aload           4
	//  117  248:aconst_null     
	//  118  249:invokevirtual   #1221 <Method void Chunk.setRole(PdfName)>
				}
				ColumnText.showTextAligned(graphics, 0, new Phrase(chunk), text.getXTLM() - pdfline.listIndent(), text.getYTLM(), 0.0F);
	//  119  252:aload_0         
	//  120  253:getfield        #314 <Field PdfContentByte graphics>
	//  121  256:iconst_0        
	//  122  257:new             #493 <Class Phrase>
	//  123  260:dup             
	//  124  261:aload           4
	//  125  263:invokespecial   #1222 <Method void Phrase(Chunk)>
	//  126  266:aload_0         
	//  127  267:getfield        #262 <Field PdfContentByte text>
	//  128  270:invokevirtual   #1225 <Method float PdfContentByte.getXTLM()>
	//  129  273:aload           9
	//  130  275:invokevirtual   #1228 <Method float PdfLine.listIndent()>
	//  131  278:fsub            
	//  132  279:aload_0         
	//  133  280:getfield        #262 <Field PdfContentByte text>
	//  134  283:invokevirtual   #1231 <Method float PdfContentByte.getYTLM()>
	//  135  286:fconst_0        
	//  136  287:invokestatic    #1235 <Method void ColumnText.showTextAligned(PdfContentByte, int, Phrase, float, float, float)>
				if(listlabel != null)
	//* 137  290:aload           5
	//* 138  292:ifnull          304
					graphics.closeMCBlock(((IAccessibleElement) (listlabel)));
	//  139  295:aload_0         
	//  140  296:getfield        #314 <Field PdfContentByte graphics>
	//  141  299:aload           5
	//  142  301:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
			}
			aobj[0] = obj;
	//  143  304:aload           7
	//  144  306:iconst_0        
	//  145  307:aload_3         
	//  146  308:aastore         
			if(isTagged(writer) && pdfline.listItem() != null)
	//* 147  309:aload_0         
	//* 148  310:getfield        #256 <Field PdfWriter writer>
	//* 149  313:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 150  316:ifeq            342
	//* 151  319:aload           9
	//* 152  321:invokevirtual   #1211 <Method ListItem PdfLine.listItem()>
	//* 153  324:ifnull          342
				text.openMCBlock(((IAccessibleElement) (pdfline.listItem().getListBody())));
	//  154  327:aload_0         
	//  155  328:getfield        #262 <Field PdfContentByte text>
	//  156  331:aload           9
	//  157  333:invokevirtual   #1211 <Method ListItem PdfLine.listItem()>
	//  158  336:invokevirtual   #705 <Method com.itextpdf.text.ListBody ListItem.getListBody()>
	//  159  339:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
			writeLineToContent(pdfline, text, graphics, aobj, writer.getSpaceCharRatio());
	//  160  342:aload_0         
	//  161  343:aload           9
	//  162  345:aload_0         
	//  163  346:getfield        #262 <Field PdfContentByte text>
	//  164  349:aload_0         
	//  165  350:getfield        #314 <Field PdfContentByte graphics>
	//  166  353:aload           7
	//  167  355:aload_0         
	//  168  356:getfield        #256 <Field PdfWriter writer>
	//  169  359:invokevirtual   #1238 <Method float PdfWriter.getSpaceCharRatio()>
	//  170  362:invokevirtual   #1242 <Method float writeLineToContent(PdfLine, PdfContentByte, PdfContentByte, Object[], float)>
	//  171  365:pop             
			obj = ((Object) ((PdfFont)aobj[0]));
	//  172  366:aload           7
	//  173  368:iconst_0        
	//  174  369:aaload          
	//  175  370:checkcast       #1244 <Class PdfFont>
	//  176  373:astore_3        
			f += pdfline.height();
	//  177  374:fload_1         
	//  178  375:aload           9
	//  179  377:invokevirtual   #963 <Method float PdfLine.height()>
	//  180  380:fadd            
	//  181  381:fstore_1        
		}

	//  182  382:aload_0         
	//  183  383:getfield        #262 <Field PdfContentByte text>
	//  184  386:fload_2         
	//  185  387:fneg            
	//  186  388:fconst_0        
	//  187  389:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//* 188  392:goto            108
		lines = new ArrayList();
	//  189  395:aload_0         
	//  190  396:new             #166 <Class ArrayList>
	//  191  399:dup             
	//  192  400:invokespecial   #167 <Method void ArrayList()>
	//  193  403:putfield        #169 <Field ArrayList lines>
		return f;
	//  194  406:fload_1         
	//  195  407:freturn         
	}

	protected void flushStructureElementsOnNewPage()
	{
		if(isToUseExternalCache) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field boolean isToUseExternalCache>
	//    2    4:ifne            8
_L1:
		return;
	//    3    7:return          
_L2:
		Iterator iterator = structElements.entrySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field HashMap structElements>
	//    6   12:invokevirtual   #1249 <Method Set HashMap.entrySet()>
	//    7   15:invokeinterface #1252 <Method Iterator Set.iterator()>
	//    8   20:astore_2        
_L3:
		java.util.Map.Entry entry;
		do
		{
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//    9   21:aload_2         
	//   10   22:invokeinterface #1195 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            7
			entry = (java.util.Map.Entry)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #1199 <Method Object Iterator.next()>
	//   14   36:checkcast       #1254 <Class java.util.Map$Entry>
	//   15   39:astore_3        
		} while(((PdfStructureElement)entry.getValue()).getStructureType().equals(((Object) (PdfName.DOCUMENT))));
	//   16   40:aload_3         
	//   17   41:invokeinterface #1257 <Method Object java.util.Map$Entry.getValue()>
	//   18   46:checkcast       #1259 <Class PdfStructureElement>
	//   19   49:invokevirtual   #1262 <Method PdfName PdfStructureElement.getStructureType()>
	//   20   52:getstatic       #1265 <Field PdfName PdfName.DOCUMENT>
	//   21   55:invokevirtual   #1268 <Method boolean PdfName.equals(Object)>
	//   22   58:ifne            21
		Object obj;
		PdfStructureElement pdfstructureelement;
		PdfDictionary pdfdictionary;
		try
		{
			pdfstructureelement = (PdfStructureElement)entry.getValue();
	//   23   61:aload_3         
	//   24   62:invokeinterface #1257 <Method Object java.util.Map$Entry.getValue()>
	//   25   67:checkcast       #1259 <Class PdfStructureElement>
	//   26   70:astore          4
			pdfdictionary = pdfstructureelement.getParent();
	//   27   72:aload           4
	//   28   74:invokevirtual   #1271 <Method PdfDictionary PdfStructureElement.getParent()>
	//   29   77:astore          5
		}
	//*  30   79:aconst_null     
	//*  31   80:astore_1        
	//*  32   81:aload           5
	//*  33   83:instanceof      #1259 <Class PdfStructureElement>
	//*  34   86:ifeq            95
	//*  35   89:aload           5
	//*  36   91:checkcast       #1259 <Class PdfStructureElement>
	//*  37   94:astore_1        
	//*  38   95:aload_1         
	//*  39   96:ifnull          117
	//*  40   99:aload_0         
	//*  41  100:getfield        #137 <Field HashMap elementsParents>
	//*  42  103:aload_3         
	//*  43  104:invokeinterface #1274 <Method Object java.util.Map$Entry.getKey()>
	//*  44  109:aload_1         
	//*  45  110:invokevirtual   #1278 <Method AccessibleElementId PdfStructureElement.getElementId()>
	//*  46  113:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//*  47  116:pop             
	//*  48  117:aload_0         
	//*  49  118:getfield        #1280 <Field TempFileCache externalCache>
	//*  50  121:aload           4
	//*  51  123:invokevirtual   #1285 <Method com.itextpdf.text.io.TempFileCache$ObjectPosition TempFileCache.put(PdfObject)>
	//*  52  126:astore_1        
	//*  53  127:aload_0         
	//*  54  128:getfield        #135 <Field HashMap externallyStoredStructElements>
	//*  55  131:aload_3         
	//*  56  132:invokeinterface #1274 <Method Object java.util.Map$Entry.getKey()>
	//*  57  137:aload_1         
	//*  58  138:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//*  59  141:pop             
	//*  60  142:aload_2         
	//*  61  143:invokeinterface #1287 <Method void Iterator.remove()>
	//*  62  148:goto            21
		catch(IOException ioexception)
	//*  63  151:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//   64  152:new             #881 <Class ExceptionConverter>
	//   65  155:dup             
	//   66  156:aload_1         
	//   67  157:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   68  160:athrow          
		}
		obj = null;
		if(pdfdictionary instanceof PdfStructureElement)
			obj = ((Object) ((PdfStructureElement)pdfdictionary));
		if(obj == null)
			break MISSING_BLOCK_LABEL_117;
		elementsParents.put(entry.getKey(), ((Object) (((PdfStructureElement) (obj)).getElementId())));
		obj = ((Object) (externalCache.put(((PdfObject) (pdfstructureelement)))));
		externallyStoredStructElements.put(entry.getKey(), obj);
		iterator.remove();
		  goto _L3
		if(true) goto _L1; else goto _L4
_L4:
	}

	PdfAcroForm getAcroForm()
	{
		return annotationsImp.getAcroForm();
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    2    4:invokevirtual   #1291 <Method PdfAcroForm PdfAnnotationsImp.getAcroForm()>
	//    3    7:areturn         
	}

	Rectangle getBoxSize(String s)
	{
		s = ((String) ((PdfRectangle)thisBoxSize.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field HashMap thisBoxSize>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1074 <Class PdfRectangle>
	//    5   11:astore_1        
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          21
			return ((PdfRectangle) (s)).getRectangle();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #1297 <Method Rectangle PdfRectangle.getRectangle()>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	PdfCatalog getCatalog(PdfIndirectReference pdfindirectreference)
	{
		pdfindirectreference = ((PdfIndirectReference) (new PdfCatalog(pdfindirectreference, writer)));
	//    0    0:new             #12  <Class PdfDocument$PdfCatalog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #256 <Field PdfWriter writer>
	//    5    9:invokespecial   #1302 <Method void PdfDocument$PdfCatalog(PdfIndirectReference, PdfWriter)>
	//    6   12:astore_1        
		if(rootOutline.getKids().size() > 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #966 <Field PdfOutline rootOutline>
	//*   9   17:invokevirtual   #970 <Method ArrayList PdfOutline.getKids()>
	//*  10   20:invokevirtual   #296 <Method int ArrayList.size()>
	//*  11   23:ifle            50
		{
			((PdfCatalog) (pdfindirectreference)).put(PdfName.PAGEMODE, ((PdfObject) (PdfName.USEOUTLINES)));
	//   12   26:aload_1         
	//   13   27:getstatic       #1305 <Field PdfName PdfName.PAGEMODE>
	//   14   30:getstatic       #1308 <Field PdfName PdfName.USEOUTLINES>
	//   15   33:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
			((PdfCatalog) (pdfindirectreference)).put(PdfName.OUTLINES, ((PdfObject) (rootOutline.indirectReference())));
	//   16   36:aload_1         
	//   17   37:getstatic       #1312 <Field PdfName PdfName.OUTLINES>
	//   18   40:aload_0         
	//   19   41:getfield        #966 <Field PdfOutline rootOutline>
	//   20   44:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   21   47:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
		}
		writer.getPdfVersion().addToCatalog(((PdfDictionary) (pdfindirectreference)));
	//   22   50:aload_0         
	//   23   51:getfield        #256 <Field PdfWriter writer>
	//   24   54:invokevirtual   #1319 <Method PdfVersionImp PdfWriter.getPdfVersion()>
	//   25   57:aload_1         
	//   26   58:invokevirtual   #1324 <Method void PdfVersionImp.addToCatalog(PdfDictionary)>
		viewerPreferences.addToCatalog(((PdfDictionary) (pdfindirectreference)));
	//   27   61:aload_0         
	//   28   62:getfield        #182 <Field PdfViewerPreferencesImp viewerPreferences>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #1325 <Method void PdfViewerPreferencesImp.addToCatalog(PdfDictionary)>
		if(pageLabels != null)
	//*  31   69:aload_0         
	//*  32   70:getfield        #1327 <Field PdfPageLabels pageLabels>
	//*  33   73:ifnull          94
			((PdfCatalog) (pdfindirectreference)).put(PdfName.PAGELABELS, ((PdfObject) (pageLabels.getDictionary(writer))));
	//   34   76:aload_1         
	//   35   77:getstatic       #1330 <Field PdfName PdfName.PAGELABELS>
	//   36   80:aload_0         
	//   37   81:getfield        #1327 <Field PdfPageLabels pageLabels>
	//   38   84:aload_0         
	//   39   85:getfield        #256 <Field PdfWriter writer>
	//   40   88:invokevirtual   #1336 <Method PdfDictionary PdfPageLabels.getDictionary(PdfWriter)>
	//   41   91:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
		((PdfCatalog) (pdfindirectreference)).addNames(localDestinations, getDocumentLevelJS(), documentFileAttachment, writer);
	//   42   94:aload_1         
	//   43   95:aload_0         
	//   44   96:getfield        #187 <Field TreeMap localDestinations>
	//   45   99:aload_0         
	//   46  100:invokevirtual   #1340 <Method HashMap getDocumentLevelJS()>
	//   47  103:aload_0         
	//   48  104:getfield        #191 <Field HashMap documentFileAttachment>
	//   49  107:aload_0         
	//   50  108:getfield        #256 <Field PdfWriter writer>
	//   51  111:invokevirtual   #1344 <Method void PdfDocument$PdfCatalog.addNames(TreeMap, HashMap, HashMap, PdfWriter)>
		if(openActionName != null)
	//*  52  114:aload_0         
	//*  53  115:getfield        #1346 <Field String openActionName>
	//*  54  118:ifnull          220
			((PdfCatalog) (pdfindirectreference)).setOpenAction(getLocalGotoAction(openActionName));
	//   55  121:aload_1         
	//   56  122:aload_0         
	//   57  123:aload_0         
	//   58  124:getfield        #1346 <Field String openActionName>
	//   59  127:invokevirtual   #1350 <Method PdfAction getLocalGotoAction(String)>
	//   60  130:invokevirtual   #1353 <Method void PdfDocument$PdfCatalog.setOpenAction(PdfAction)>
		else
	//*  61  133:aload_0         
	//*  62  134:getfield        #758 <Field PdfDictionary additionalActions>
	//*  63  137:ifnull          148
	//*  64  140:aload_1         
	//*  65  141:aload_0         
	//*  66  142:getfield        #758 <Field PdfDictionary additionalActions>
	//*  67  145:invokevirtual   #1356 <Method void PdfDocument$PdfCatalog.setAdditionalActions(PdfDictionary)>
	//*  68  148:aload_0         
	//*  69  149:getfield        #1358 <Field PdfCollection collection>
	//*  70  152:ifnull          166
	//*  71  155:aload_1         
	//*  72  156:getstatic       #1361 <Field PdfName PdfName.COLLECTION>
	//*  73  159:aload_0         
	//*  74  160:getfield        #1358 <Field PdfCollection collection>
	//*  75  163:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
	//*  76  166:aload_0         
	//*  77  167:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//*  78  170:invokevirtual   #1364 <Method boolean PdfAnnotationsImp.hasValidAcroForm()>
	//*  79  173:ifeq            200
	//*  80  176:aload_1         
	//*  81  177:getstatic       #1367 <Field PdfName PdfName.ACROFORM>
	//*  82  180:aload_0         
	//*  83  181:getfield        #256 <Field PdfWriter writer>
	//*  84  184:aload_0         
	//*  85  185:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//*  86  188:invokevirtual   #1291 <Method PdfAcroForm PdfAnnotationsImp.getAcroForm()>
	//*  87  191:invokevirtual   #874 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  88  194:invokevirtual   #879 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  89  197:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
	//*  90  200:aload_0         
	//*  91  201:getfield        #1369 <Field PdfString language>
	//*  92  204:ifnull          218
	//*  93  207:aload_1         
	//*  94  208:getstatic       #1372 <Field PdfName PdfName.LANG>
	//*  95  211:aload_0         
	//*  96  212:getfield        #1369 <Field PdfString language>
	//*  97  215:invokevirtual   #1309 <Method void PdfDocument$PdfCatalog.put(PdfName, PdfObject)>
	//*  98  218:aload_1         
	//*  99  219:areturn         
		if(openActionAction != null)
	//* 100  220:aload_0         
	//* 101  221:getfield        #1374 <Field PdfAction openActionAction>
	//* 102  224:ifnull          133
			((PdfCatalog) (pdfindirectreference)).setOpenAction(openActionAction);
	//  103  227:aload_1         
	//  104  228:aload_0         
	//  105  229:getfield        #1374 <Field PdfAction openActionAction>
	//  106  232:invokevirtual   #1353 <Method void PdfDocument$PdfCatalog.setOpenAction(PdfAction)>
		if(additionalActions != null)
			((PdfCatalog) (pdfindirectreference)).setAdditionalActions(additionalActions);
		if(collection != null)
			((PdfCatalog) (pdfindirectreference)).put(PdfName.COLLECTION, ((PdfObject) (collection)));
		if(annotationsImp.hasValidAcroForm())
			try
			{
				((PdfCatalog) (pdfindirectreference)).put(PdfName.ACROFORM, ((PdfObject) (writer.addToBody(((PdfObject) (annotationsImp.getAcroForm()))).getIndirectReference())));
			}
	//* 107  235:goto            133
			// Misplaced declaration of an exception variable
			catch(PdfIndirectReference pdfindirectreference)
	//* 108  238:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfindirectreference)));
	//  109  239:new             #881 <Class ExceptionConverter>
	//  110  242:dup             
	//  111  243:aload_1         
	//  112  244:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//  113  247:athrow          
			}
		if(language != null)
			((PdfCatalog) (pdfindirectreference)).put(PdfName.LANG, ((PdfObject) (language)));
		return ((PdfCatalog) (pdfindirectreference));
	}

	HashMap getDocumentFileAttachment()
	{
		return documentFileAttachment;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field HashMap documentFileAttachment>
	//    2    4:areturn         
	}

	HashMap getDocumentLevelJS()
	{
		return documentLevelJS;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field HashMap documentLevelJS>
	//    2    4:areturn         
	}

	PdfInfo getInfo()
	{
		return info;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field PdfDocument$PdfInfo info>
	//    2    4:areturn         
	}

	public float getLeading()
	{
		return leading;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field float leading>
	//    2    4:freturn         
	}

	PdfAction getLocalGotoAction(String s)
	{
		Destination destination1 = (Destination)localDestinations.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field TreeMap localDestinations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1379 <Method Object TreeMap.get(Object)>
	//    4    8:checkcast       #6   <Class PdfDocument$Destination>
	//    5   11:astore_3        
		Destination destination = destination1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(destination1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       27
			destination = new Destination();
	//   10   18:new             #6   <Class PdfDocument$Destination>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #1382 <Method void PdfDocument$Destination(PdfDocument)>
	//   14   26:astore_2        
		if(destination.action == null)
	//*  15   27:aload_2         
	//*  16   28:getfield        #1385 <Field PdfAction PdfDocument$Destination.action>
	//*  17   31:ifnonnull       81
		{
			if(destination.reference == null)
	//*  18   34:aload_2         
	//*  19   35:getfield        #1389 <Field PdfIndirectReference PdfDocument$Destination.reference>
	//*  20   38:ifnonnull       52
				destination.reference = writer.getPdfIndirectReference();
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #256 <Field PdfWriter writer>
	//   24   46:invokevirtual   #1392 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   25   49:putfield        #1389 <Field PdfIndirectReference PdfDocument$Destination.reference>
			PdfAction pdfaction = new PdfAction(destination.reference);
	//   26   52:new             #446 <Class PdfAction>
	//   27   55:dup             
	//   28   56:aload_2         
	//   29   57:getfield        #1389 <Field PdfIndirectReference PdfDocument$Destination.reference>
	//   30   60:invokespecial   #1395 <Method void PdfAction(PdfIndirectReference)>
	//   31   63:astore_3        
			destination.action = pdfaction;
	//   32   64:aload_2         
	//   33   65:aload_3         
	//   34   66:putfield        #1385 <Field PdfAction PdfDocument$Destination.action>
			localDestinations.put(((Object) (s)), ((Object) (destination)));
	//   35   69:aload_0         
	//   36   70:getfield        #187 <Field TreeMap localDestinations>
	//   37   73:aload_1         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #1396 <Method Object TreeMap.put(Object, Object)>
	//   40   78:pop             
			return pdfaction;
	//   41   79:aload_3         
	//   42   80:areturn         
		} else
		{
			return destination.action;
	//   43   81:aload_2         
	//   44   82:getfield        #1385 <Field PdfAction PdfDocument$Destination.action>
	//   45   85:areturn         
		}
	}

	public int getNextMarkPoint(Object obj)
	{
		int ai1[] = (int[])structParentIndices.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field HashMap structParentIndices>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1399 <Class int[]>
	//    5   11:astore          4
		int ai[] = ai1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(ai1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       49
		{
			ai = new int[2];
	//   10   21:iconst_2        
	//   11   22:newarray        int[]
	//   12   24:astore_3        
			ai[0] = structParentIndices.size();
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #143 <Field HashMap structParentIndices>
	//   17   31:invokevirtual   #1400 <Method int HashMap.size()>
	//   18   34:iastore         
			ai[1] = 0;
	//   19   35:aload_3         
	//   20   36:iconst_1        
	//   21   37:iconst_0        
	//   22   38:iastore         
			structParentIndices.put(obj, ((Object) (ai)));
	//   23   39:aload_0         
	//   24   40:getfield        #143 <Field HashMap structParentIndices>
	//   25   43:aload_1         
	//   26   44:aload_3         
	//   27   45:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   28   48:pop             
		}
		int i = ai[1];
	//   29   49:aload_3         
	//   30   50:iconst_1        
	//   31   51:iaload          
	//   32   52:istore_2        
		ai[1] = ai[1] + 1;
	//   33   53:aload_3         
	//   34   54:iconst_1        
	//   35   55:aload_3         
	//   36   56:iconst_1        
	//   37   57:iaload          
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:iastore         
		return i;
	//   41   61:iload_2         
	//   42   62:ireturn         
	}

	public PdfPageLabels getPageLabels()
	{
		return pageLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #1327 <Field PdfPageLabels pageLabels>
	//    2    4:areturn         
	}

	PageResources getPageResources()
	{
		return pageResources;
	//    0    0:aload_0         
	//    1    1:getfield        #1048 <Field PageResources pageResources>
	//    2    4:areturn         
	}

	public PdfOutline getRootOutline()
	{
		return rootOutline;
	//    0    0:aload_0         
	//    1    1:getfield        #966 <Field PdfOutline rootOutline>
	//    2    4:areturn         
	}

	protected PdfStructureElement getStructElement(AccessibleElementId accessibleelementid)
	{
		return getStructElement(accessibleelementid, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #1410 <Method PdfStructureElement getStructElement(AccessibleElementId, boolean)>
	//    4    6:areturn         
	}

	protected PdfStructureElement getStructElement(AccessibleElementId accessibleelementid, boolean flag)
	{
		PdfStructureElement pdfstructureelement1 = (PdfStructureElement)structElements.get(((Object) (accessibleelementid)));
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field HashMap structElements>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1259 <Class PdfStructureElement>
	//    5   11:astore          4
		PdfStructureElement pdfstructureelement = pdfstructureelement1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(!isToUseExternalCache)
			break MISSING_BLOCK_LABEL_133;
	//    8   16:aload_0         
	//    9   17:getfield        #139 <Field boolean isToUseExternalCache>
	//   10   20:ifeq            133
		pdfstructureelement = pdfstructureelement1;
	//   11   23:aload           4
	//   12   25:astore_3        
		if(pdfstructureelement1 != null)
			break MISSING_BLOCK_LABEL_133;
	//   13   26:aload           4
	//   14   28:ifnonnull       133
		com.itextpdf.text.io.TempFileCache.ObjectPosition objectposition = (com.itextpdf.text.io.TempFileCache.ObjectPosition)externallyStoredStructElements.get(((Object) (accessibleelementid)));
	//   15   31:aload_0         
	//   16   32:getfield        #135 <Field HashMap externallyStoredStructElements>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//   19   39:checkcast       #1414 <Class com.itextpdf.text.io.TempFileCache$ObjectPosition>
	//   20   42:astore          5
		pdfstructureelement = pdfstructureelement1;
	//   21   44:aload           4
	//   22   46:astore_3        
		if(objectposition == null)
			break MISSING_BLOCK_LABEL_133;
	//   23   47:aload           5
	//   24   49:ifnull          133
		try
		{
			pdfstructureelement1 = (PdfStructureElement)externalCache.get(objectposition);
	//   25   52:aload_0         
	//   26   53:getfield        #1280 <Field TempFileCache externalCache>
	//   27   56:aload           5
	//   28   58:invokevirtual   #1417 <Method PdfObject TempFileCache.get(com.itextpdf.text.io.TempFileCache$ObjectPosition)>
	//   29   61:checkcast       #1259 <Class PdfStructureElement>
	//   30   64:astore          4
			pdfstructureelement1.setStructureTreeRoot(writer.getStructureTreeRoot());
	//   31   66:aload           4
	//   32   68:aload_0         
	//   33   69:getfield        #256 <Field PdfWriter writer>
	//   34   72:invokevirtual   #1421 <Method PdfStructureTreeRoot PdfWriter.getStructureTreeRoot()>
	//   35   75:invokevirtual   #1425 <Method void PdfStructureElement.setStructureTreeRoot(PdfStructureTreeRoot)>
			pdfstructureelement1.setStructureElementParent(getStructElement((AccessibleElementId)elementsParents.get(((Object) (pdfstructureelement1.getElementId()))), flag));
	//   36   78:aload           4
	//   37   80:aload_0         
	//   38   81:aload_0         
	//   39   82:getfield        #137 <Field HashMap elementsParents>
	//   40   85:aload           4
	//   41   87:invokevirtual   #1278 <Method AccessibleElementId PdfStructureElement.getElementId()>
	//   42   90:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//   43   93:checkcast       #1427 <Class AccessibleElementId>
	//   44   96:iload_2         
	//   45   97:invokevirtual   #1410 <Method PdfStructureElement getStructElement(AccessibleElementId, boolean)>
	//   46  100:invokevirtual   #1431 <Method void PdfStructureElement.setStructureElementParent(PdfStructureElement)>
		}
	//*  47  103:aload           4
	//*  48  105:astore_3        
	//*  49  106:iload_2         
	//*  50  107:ifeq            133
	//*  51  110:aload_0         
	//*  52  111:getfield        #135 <Field HashMap externallyStoredStructElements>
	//*  53  114:aload_1         
	//*  54  115:invokevirtual   #1433 <Method Object HashMap.remove(Object)>
	//*  55  118:pop             
	//*  56  119:aload_0         
	//*  57  120:getfield        #133 <Field HashMap structElements>
	//*  58  123:aload_1         
	//*  59  124:aload           4
	//*  60  126:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//*  61  129:pop             
	//*  62  130:aload           4
	//*  63  132:astore_3        
	//*  64  133:aload_3         
	//*  65  134:areturn         
		// Misplaced declaration of an exception variable
		catch(AccessibleElementId accessibleelementid)
	//*  66  135:astore_1        
		{
			throw new ExceptionConverter(((Exception) (accessibleelementid)));
	//   67  136:new             #881 <Class ExceptionConverter>
	//   68  139:dup             
	//   69  140:aload_1         
	//   70  141:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   71  144:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(AccessibleElementId accessibleelementid)
	//*  72  145:astore_1        
		{
			throw new ExceptionConverter(((Exception) (accessibleelementid)));
	//   73  146:new             #881 <Class ExceptionConverter>
	//   74  149:dup             
	//   75  150:aload_1         
	//   76  151:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   77  154:athrow          
		}
		pdfstructureelement = pdfstructureelement1;
		if(!flag)
			break MISSING_BLOCK_LABEL_133;
		externallyStoredStructElements.remove(((Object) (accessibleelementid)));
		structElements.put(((Object) (accessibleelementid)), ((Object) (pdfstructureelement1)));
		pdfstructureelement = pdfstructureelement1;
		return pdfstructureelement;
	}

	public Set getStructElements()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #1436 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1437 <Method void HashSet()>
	//    3    7:astore_1        
		((Set) (hashset)).addAll(((java.util.Collection) (externallyStoredStructElements.keySet())));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #135 <Field HashMap externallyStoredStructElements>
	//    7   13:invokevirtual   #1440 <Method Set HashMap.keySet()>
	//    8   16:invokeinterface #1444 <Method boolean Set.addAll(java.util.Collection)>
	//    9   21:pop             
		((Set) (hashset)).addAll(((java.util.Collection) (structElements.keySet())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #133 <Field HashMap structElements>
	//   13   27:invokevirtual   #1440 <Method Set HashMap.keySet()>
	//   14   30:invokeinterface #1444 <Method boolean Set.addAll(java.util.Collection)>
	//   15   35:pop             
		return ((Set) (hashset));
	//   16   36:aload_1         
	//   17   37:areturn         
	}

	public int getStructParentIndex(Object obj)
	{
		int ai1[] = (int[])structParentIndices.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field HashMap structParentIndices>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1399 <Class int[]>
	//    5   11:astore_3        
		int ai[] = ai1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(ai1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       46
		{
			ai = new int[2];
	//   10   18:iconst_2        
	//   11   19:newarray        int[]
	//   12   21:astore_2        
			ai[0] = structParentIndices.size();
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:aload_0         
	//   16   25:getfield        #143 <Field HashMap structParentIndices>
	//   17   28:invokevirtual   #1400 <Method int HashMap.size()>
	//   18   31:iastore         
			ai[1] = 0;
	//   19   32:aload_2         
	//   20   33:iconst_1        
	//   21   34:iconst_0        
	//   22   35:iastore         
			structParentIndices.put(obj, ((Object) (ai)));
	//   23   36:aload_0         
	//   24   37:getfield        #143 <Field HashMap structParentIndices>
	//   25   40:aload_1         
	//   26   41:aload_2         
	//   27   42:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   28   45:pop             
		}
		return ai[0];
	//   29   46:aload_2         
	//   30   47:iconst_0        
	//   31   48:iaload          
	//   32   49:ireturn         
	}

	public int[] getStructParentIndexAndNextMarkPoint(Object obj)
	{
		int ai1[] = (int[])structParentIndices.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field HashMap structParentIndices>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1046 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1399 <Class int[]>
	//    5   11:astore          4
		int ai[] = ai1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(ai1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       49
		{
			ai = new int[2];
	//   10   21:iconst_2        
	//   11   22:newarray        int[]
	//   12   24:astore_3        
			ai[0] = structParentIndices.size();
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #143 <Field HashMap structParentIndices>
	//   17   31:invokevirtual   #1400 <Method int HashMap.size()>
	//   18   34:iastore         
			ai[1] = 0;
	//   19   35:aload_3         
	//   20   36:iconst_1        
	//   21   37:iconst_0        
	//   22   38:iastore         
			structParentIndices.put(obj, ((Object) (ai)));
	//   23   39:aload_0         
	//   24   40:getfield        #143 <Field HashMap structParentIndices>
	//   25   43:aload_1         
	//   26   44:aload_3         
	//   27   45:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   28   48:pop             
		}
		int i = ai[1];
	//   29   49:aload_3         
	//   30   50:iconst_1        
	//   31   51:iaload          
	//   32   52:istore_2        
		ai[1] = ai[1] + 1;
	//   33   53:aload_3         
	//   34   54:iconst_1        
	//   35   55:aload_3         
	//   36   56:iconst_1        
	//   37   57:iaload          
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:iastore         
		return (new int[] {
			ai[0], i
		});
	//   41   61:iconst_2        
	//   42   62:newarray        int[]
	//   43   64:dup             
	//   44   65:iconst_0        
	//   45   66:aload_3         
	//   46   67:iconst_0        
	//   47   68:iaload          
	//   48   69:iastore         
	//   49   70:dup             
	//   50   71:iconst_1        
	//   51   72:iload_2         
	//   52   73:iastore         
	//   53   74:areturn         
	}

	public TabSettings getTabSettings()
	{
		return tabSettings;
	//    0    0:aload_0         
	//    1    1:getfield        #415 <Field TabSettings tabSettings>
	//    2    4:areturn         
	}

	public float getVerticalPosition(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			ensureNewLine();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #716 <Method void ensureNewLine()>
		return top() - currentHeight - indentation.indentTop;
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1452 <Method float top()>
	//    6   12:aload_0         
	//    7   13:getfield        #151 <Field float currentHeight>
	//    8   16:fsub            
	//    9   17:aload_0         
	//   10   18:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   11   21:getfield        #1454 <Field float PdfDocument$Indentation.indentTop>
	//   12   24:fsub            
	//   13   25:freturn         
	}

	float indentBottom()
	{
		return bottom(indentation.indentBottom);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    3    5:getfield        #1456 <Field float PdfDocument$Indentation.indentBottom>
	//    4    8:invokevirtual   #1459 <Method float bottom(float)>
	//    5   11:freturn         
	}

	protected float indentLeft()
	{
		return left(indentation.indentLeft + indentation.listIndentLeft + indentation.imageIndentLeft + indentation.sectionIndentLeft);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    3    5:getfield        #524 <Field float PdfDocument$Indentation.indentLeft>
	//    4    8:aload_0         
	//    5    9:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    6   12:getfield        #680 <Field float PdfDocument$Indentation.listIndentLeft>
	//    7   15:fadd            
	//    8   16:aload_0         
	//    9   17:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   10   20:getfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
	//   11   23:fadd            
	//   12   24:aload_0         
	//   13   25:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   14   28:getfield        #644 <Field float PdfDocument$Indentation.sectionIndentLeft>
	//   15   31:fadd            
	//   16   32:invokevirtual   #1461 <Method float left(float)>
	//   17   35:freturn         
	}

	protected float indentRight()
	{
		return right(indentation.indentRight + indentation.sectionIndentRight + indentation.imageIndentRight);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    3    5:getfield        #527 <Field float PdfDocument$Indentation.indentRight>
	//    4    8:aload_0         
	//    5    9:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    6   12:getfield        #648 <Field float PdfDocument$Indentation.sectionIndentRight>
	//    7   15:fadd            
	//    8   16:aload_0         
	//    9   17:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   10   20:getfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
	//   11   23:fadd            
	//   12   24:invokevirtual   #1464 <Method float right(float)>
	//   13   27:freturn         
	}

	protected float indentTop()
	{
		return top(indentation.indentTop);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #174 <Field PdfDocument$Indentation indentation>
	//    3    5:getfield        #1454 <Field float PdfDocument$Indentation.indentTop>
	//    4    8:invokevirtual   #1466 <Method float top(float)>
	//    5   11:freturn         
	}

	protected void initPage()
		throws DocumentException
	{
		pageN = pageN + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #1470 <Field int pageN>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #1470 <Field int pageN>
		pageResources = new PageResources();
	//    6   10:aload_0         
	//    7   11:new             #1054 <Class PageResources>
	//    8   14:dup             
	//    9   15:invokespecial   #1471 <Method void PageResources()>
	//   10   18:putfield        #1048 <Field PageResources pageResources>
		float f;
		int i;
		PdfPageEvent pdfpageevent;
		if(isTagged(writer))
	//*  11   21:aload_0         
	//*  12   22:getfield        #256 <Field PdfWriter writer>
	//*  13   25:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  14   28:ifeq            256
		{
			graphics = writer.getDirectContentUnder().getDuplicate();
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #256 <Field PdfWriter writer>
	//   18   36:invokevirtual   #1134 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//   19   39:invokevirtual   #1474 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//   20   42:putfield        #314 <Field PdfContentByte graphics>
			writer.getDirectContent().duplicatedFrom = graphics;
	//   21   45:aload_0         
	//   22   46:getfield        #256 <Field PdfWriter writer>
	//   23   49:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//   24   52:aload_0         
	//   25   53:getfield        #314 <Field PdfContentByte graphics>
	//   26   56:putfield        #1477 <Field PdfContentByte PdfContentByte.duplicatedFrom>
		} else
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #1480 <Method void setNewPageSizeAndMargins()>
	//*  29   63:aload_0         
	//*  30   64:ldc1            #204 <Float -1F>
	//*  31   66:putfield        #206 <Field float imageEnd>
	//*  32   69:aload_0         
	//*  33   70:getfield        #174 <Field PdfDocument$Indentation indentation>
	//*  34   73:fconst_0        
	//*  35   74:putfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
	//*  36   77:aload_0         
	//*  37   78:getfield        #174 <Field PdfDocument$Indentation indentation>
	//*  38   81:fconst_0        
	//*  39   82:putfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
	//*  40   85:aload_0         
	//*  41   86:getfield        #174 <Field PdfDocument$Indentation indentation>
	//*  42   89:fconst_0        
	//*  43   90:putfield        #1456 <Field float PdfDocument$Indentation.indentBottom>
	//*  44   93:aload_0         
	//*  45   94:getfield        #174 <Field PdfDocument$Indentation indentation>
	//*  46   97:fconst_0        
	//*  47   98:putfield        #1454 <Field float PdfDocument$Indentation.indentTop>
	//*  48  101:aload_0         
	//*  49  102:fconst_0        
	//*  50  103:putfield        #151 <Field float currentHeight>
	//*  51  106:aload_0         
	//*  52  107:new             #130 <Class HashMap>
	//*  53  110:dup             
	//*  54  111:aload_0         
	//*  55  112:getfield        #197 <Field HashMap boxSize>
	//*  56  115:invokespecial   #1483 <Method void HashMap(java.util.Map)>
	//*  57  118:putfield        #195 <Field HashMap thisBoxSize>
	//*  58  121:aload_0         
	//*  59  122:getfield        #607 <Field Rectangle pageSize>
	//*  60  125:invokevirtual   #1487 <Method BaseColor Rectangle.getBackgroundColor()>
	//*  61  128:ifnonnull       151
	//*  62  131:aload_0         
	//*  63  132:getfield        #607 <Field Rectangle pageSize>
	//*  64  135:invokevirtual   #1490 <Method boolean Rectangle.hasBorders()>
	//*  65  138:ifne            151
	//*  66  141:aload_0         
	//*  67  142:getfield        #607 <Field Rectangle pageSize>
	//*  68  145:invokevirtual   #1493 <Method BaseColor Rectangle.getBorderColor()>
	//*  69  148:ifnull          160
	//*  70  151:aload_0         
	//*  71  152:aload_0         
	//*  72  153:getfield        #607 <Field Rectangle pageSize>
	//*  73  156:invokevirtual   #574 <Method boolean add(Element)>
	//*  74  159:pop             
	//*  75  160:aload_0         
	//*  76  161:getfield        #147 <Field float leading>
	//*  77  164:fstore_1        
	//*  78  165:aload_0         
	//*  79  166:getfield        #149 <Field int alignment>
	//*  80  169:istore_2        
	//*  81  170:aload_0         
	//*  82  171:iconst_1        
	//*  83  172:putfield        #199 <Field boolean pageEmpty>
	//*  84  175:aload_0         
	//*  85  176:getfield        #208 <Field Image imageWait>
	//*  86  179:ifnull          195
	//*  87  182:aload_0         
	//*  88  183:aload_0         
	//*  89  184:getfield        #208 <Field Image imageWait>
	//*  90  187:invokevirtual   #725 <Method void add(Image)>
	//*  91  190:aload_0         
	//*  92  191:aconst_null     
	//*  93  192:putfield        #208 <Field Image imageWait>
	//*  94  195:aload_0         
	//*  95  196:fload_1         
	//*  96  197:putfield        #147 <Field float leading>
	//*  97  200:aload_0         
	//*  98  201:iload_2         
	//*  99  202:putfield        #149 <Field int alignment>
	//* 100  205:aload_0         
	//* 101  206:invokevirtual   #409 <Method void carriageReturn()>
	//* 102  209:aload_0         
	//* 103  210:getfield        #256 <Field PdfWriter writer>
	//* 104  213:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//* 105  216:astore_3        
	//* 106  217:aload_3         
	//* 107  218:ifnull          250
	//* 108  221:aload_0         
	//* 109  222:getfield        #162 <Field boolean firstPageEvent>
	//* 110  225:ifeq            239
	//* 111  228:aload_3         
	//* 112  229:aload_0         
	//* 113  230:getfield        #256 <Field PdfWriter writer>
	//* 114  233:aload_0         
	//* 115  234:invokeinterface #1496 <Method void PdfPageEvent.onOpenDocument(PdfWriter, Document)>
	//* 116  239:aload_3         
	//* 117  240:aload_0         
	//* 118  241:getfield        #256 <Field PdfWriter writer>
	//* 119  244:aload_0         
	//* 120  245:invokeinterface #1499 <Method void PdfPageEvent.onStartPage(PdfWriter, Document)>
	//* 121  250:aload_0         
	//* 122  251:iconst_0        
	//* 123  252:putfield        #162 <Field boolean firstPageEvent>
	//* 124  255:return          
		{
			graphics = new PdfContentByte(writer);
	//  125  256:aload_0         
	//  126  257:new             #271 <Class PdfContentByte>
	//  127  260:dup             
	//  128  261:aload_0         
	//  129  262:getfield        #256 <Field PdfWriter writer>
	//  130  265:invokespecial   #1500 <Method void PdfContentByte(PdfWriter)>
	//  131  268:putfield        #314 <Field PdfContentByte graphics>
		}
		setNewPageSizeAndMargins();
		imageEnd = -1F;
		indentation.imageIndentRight = 0.0F;
		indentation.imageIndentLeft = 0.0F;
		indentation.indentBottom = 0.0F;
		indentation.indentTop = 0.0F;
		currentHeight = 0.0F;
		thisBoxSize = new HashMap(((java.util.Map) (boxSize)));
		if(pageSize.getBackgroundColor() != null || pageSize.hasBorders() || pageSize.getBorderColor() != null)
			add(((Element) (pageSize)));
		f = leading;
		i = alignment;
		pageEmpty = true;
		try
		{
			if(imageWait != null)
			{
				add(imageWait);
				imageWait = null;
			}
		}
	//* 132  271:goto            59
		catch(Exception exception)
	//* 133  274:astore_3        
		{
			throw new ExceptionConverter(exception);
	//  134  275:new             #881 <Class ExceptionConverter>
	//  135  278:dup             
	//  136  279:aload_3         
	//  137  280:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//  138  283:athrow          
		}
		leading = f;
		alignment = i;
		carriageReturn();
		pdfpageevent = writer.getPageEvent();
		if(pdfpageevent != null)
		{
			if(firstPageEvent)
				pdfpageevent.onOpenDocument(writer, ((Document) (this)));
			pdfpageevent.onStartPage(writer, ((Document) (this)));
		}
		firstPageEvent = false;
	}

	boolean isPageEmpty()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!isTagged(writer)) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #256 <Field PdfWriter writer>
	//    4    6:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//    5    9:ifeq            92
_L1:
		boolean flag;
label0:
		{
			if(writer != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #256 <Field PdfWriter writer>
	//*   8   16:ifnull          88
			{
				flag = flag1;
	//    9   19:iload_2         
	//   10   20:istore_1        
				if(writer.getDirectContent().size(false) != 0)
					break label0;
	//   11   21:aload_0         
	//   12   22:getfield        #256 <Field PdfWriter writer>
	//   13   25:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #1503 <Method int PdfContentByte.size(boolean)>
	//   16   32:ifne            90
				flag = flag1;
	//   17   35:iload_2         
	//   18   36:istore_1        
				if(writer.getDirectContentUnder().size(false) != 0)
					break label0;
	//   19   37:aload_0         
	//   20   38:getfield        #256 <Field PdfWriter writer>
	//   21   41:invokevirtual   #1134 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #1503 <Method int PdfContentByte.size(boolean)>
	//   24   48:ifne            90
				flag = flag1;
	//   25   51:iload_2         
	//   26   52:istore_1        
				if(text.size(false) - textEmptySize != 0)
					break label0;
	//   27   53:aload_0         
	//   28   54:getfield        #262 <Field PdfContentByte text>
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #1503 <Method int PdfContentByte.size(boolean)>
	//   31   61:aload_0         
	//   32   62:getfield        #1125 <Field int textEmptySize>
	//   33   65:isub            
	//   34   66:ifne            90
				if(!pageEmpty)
	//*  35   69:aload_0         
	//*  36   70:getfield        #199 <Field boolean pageEmpty>
	//*  37   73:ifne            88
				{
					flag = flag1;
	//   38   76:iload_2         
	//   39   77:istore_1        
					if(!writer.isPaused())
						break label0;
	//   40   78:aload_0         
	//   41   79:getfield        #256 <Field PdfWriter writer>
	//   42   82:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//   43   85:ifeq            90
				}
			}
			flag = true;
	//   44   88:iconst_1        
	//   45   89:istore_1        
		}
_L4:
		return flag;
	//   46   90:iload_1         
	//   47   91:ireturn         
_L2:
		if(writer == null)
			break; /* Loop/switch isn't completed */
	//   48   92:aload_0         
	//   49   93:getfield        #256 <Field PdfWriter writer>
	//   50   96:ifnull          148
		flag = flag1;
	//   51   99:iload_2         
	//   52  100:istore_1        
		if(writer.getDirectContent().size() != 0) goto _L4; else goto _L3
	//   53  101:aload_0         
	//   54  102:getfield        #256 <Field PdfWriter writer>
	//   55  105:invokevirtual   #281 <Method PdfContentByte PdfWriter.getDirectContent()>
	//   56  108:invokevirtual   #1123 <Method int PdfContentByte.size()>
	//   57  111:ifne            90
_L3:
		flag = flag1;
	//   58  114:iload_2         
	//   59  115:istore_1        
		if(writer.getDirectContentUnder().size() != 0) goto _L4; else goto _L5
	//   60  116:aload_0         
	//   61  117:getfield        #256 <Field PdfWriter writer>
	//   62  120:invokevirtual   #1134 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//   63  123:invokevirtual   #1123 <Method int PdfContentByte.size()>
	//   64  126:ifne            90
_L5:
		if(pageEmpty)
			break; /* Loop/switch isn't completed */
	//   65  129:aload_0         
	//   66  130:getfield        #199 <Field boolean pageEmpty>
	//   67  133:ifne            148
		flag = flag1;
	//   68  136:iload_2         
	//   69  137:istore_1        
		if(!writer.isPaused()) goto _L4; else goto _L6
	//   70  138:aload_0         
	//   71  139:getfield        #256 <Field PdfWriter writer>
	//   72  142:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//   73  145:ifeq            90
_L6:
		return true;
	//   74  148:iconst_1        
	//   75  149:ireturn         
	}

	boolean isStrictImageSequence()
	{
		return strictImageSequence;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field boolean strictImageSequence>
	//    2    4:ireturn         
	}

	boolean localDestination(String s, PdfDestination pdfdestination)
	{
		Destination destination1 = (Destination)localDestinations.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field TreeMap localDestinations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1379 <Method Object TreeMap.get(Object)>
	//    4    8:checkcast       #6   <Class PdfDocument$Destination>
	//    5   11:astore          4
		Destination destination = destination1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(destination1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       30
			destination = new Destination();
	//   10   21:new             #6   <Class PdfDocument$Destination>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #1382 <Method void PdfDocument$Destination(PdfDocument)>
	//   14   29:astore_3        
		if(destination.destination != null)
	//*  15   30:aload_3         
	//*  16   31:getfield        #1508 <Field PdfDestination PdfDocument$Destination.destination>
	//*  17   34:ifnull          39
			return false;
	//   18   37:iconst_0        
	//   19   38:ireturn         
		destination.destination = pdfdestination;
	//   20   39:aload_3         
	//   21   40:aload_2         
	//   22   41:putfield        #1508 <Field PdfDestination PdfDocument$Destination.destination>
		localDestinations.put(((Object) (s)), ((Object) (destination)));
	//   23   44:aload_0         
	//   24   45:getfield        #187 <Field TreeMap localDestinations>
	//   25   48:aload_1         
	//   26   49:aload_3         
	//   27   50:invokevirtual   #1396 <Method Object TreeMap.put(Object, Object)>
	//   28   53:pop             
		if(!pdfdestination.hasPage())
	//*  29   54:aload_2         
	//*  30   55:invokevirtual   #1511 <Method boolean PdfDestination.hasPage()>
	//*  31   58:ifne            73
			pdfdestination.addPage(writer.getCurrentPage());
	//   32   61:aload_2         
	//   33   62:aload_0         
	//   34   63:getfield        #256 <Field PdfWriter writer>
	//   35   66:invokevirtual   #1117 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//   36   69:invokevirtual   #1515 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//   37   72:pop             
		return true;
	//   38   73:iconst_1        
	//   39   74:ireturn         
	}

	void localGoto(String s, float f, float f1, float f2, float f3)
	{
		s = ((String) (getLocalGotoAction(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1350 <Method PdfAction getLocalGotoAction(String)>
	//    3    5:astore_1        
		annotationsImp.addPlainAnnotation(writer.createAnnotation(f, f1, f2, f3, ((PdfAction) (s)), ((PdfName) (null))));
	//    4    6:aload_0         
	//    5    7:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    6   10:aload_0         
	//    7   11:getfield        #256 <Field PdfWriter writer>
	//    8   14:fload_2         
	//    9   15:fload_3         
	//   10   16:fload           4
	//   11   18:fload           5
	//   12   20:aload_1         
	//   13   21:aconst_null     
	//   14   22:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   15   25:invokevirtual   #491 <Method void PdfAnnotationsImp.addPlainAnnotation(PdfAnnotation)>
	//   16   28:return          
	}

	protected void newLine()
		throws DocumentException
	{
		lastElementType = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #171 <Field int lastElementType>
		carriageReturn();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #409 <Method void carriageReturn()>
		if(lines != null && !lines.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #169 <Field ArrayList lines>
	//*   7   13:ifnull          54
	//*   8   16:aload_0         
	//*   9   17:getfield        #169 <Field ArrayList lines>
	//*  10   20:invokevirtual   #232 <Method boolean ArrayList.isEmpty()>
	//*  11   23:ifne            54
		{
			lines.add(((Object) (line)));
	//   12   26:aload_0         
	//   13   27:getfield        #169 <Field ArrayList lines>
	//   14   30:aload_0         
	//   15   31:getfield        #164 <Field PdfLine line>
	//   16   34:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   17   37:pop             
			currentHeight = currentHeight + line.height();
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #151 <Field float currentHeight>
	//   21   43:aload_0         
	//   22   44:getfield        #164 <Field PdfLine line>
	//   23   47:invokevirtual   #963 <Method float PdfLine.height()>
	//   24   50:fadd            
	//   25   51:putfield        #151 <Field float currentHeight>
		}
		line = new PdfLine(indentLeft(), indentRight(), alignment, leading);
	//   26   54:aload_0         
	//   27   55:new             #302 <Class PdfLine>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:invokevirtual   #241 <Method float indentLeft()>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #247 <Method float indentRight()>
	//   33   67:aload_0         
	//   34   68:getfield        #149 <Field int alignment>
	//   35   71:aload_0         
	//   36   72:getfield        #147 <Field float leading>
	//   37   75:invokespecial   #981 <Method void PdfLine(float, float, int, float)>
	//   38   78:putfield        #164 <Field PdfLine line>
	//   39   81:return          
	}

	public boolean newPage()
	{
		if(isPageEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #287 <Method boolean isPageEmpty()>
	//*   2    4:ifeq            13
		{
			setNewPageSizeAndMargins();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1480 <Method void setNewPageSizeAndMargins()>
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		}
		if(!open || close)
	//*   7   13:aload_0         
	//*   8   14:getfield        #1524 <Field boolean open>
	//*   9   17:ifeq            27
	//*  10   20:aload_0         
	//*  11   21:getfield        #985 <Field boolean close>
	//*  12   24:ifeq            45
			throw new RuntimeException(MessageLocalization.getComposedMessage("the.document.is.not.open", new Object[0]));
	//   13   27:new             #853 <Class RuntimeException>
	//   14   30:dup             
	//   15   31:ldc2            #1526 <String "the.document.is.not.open">
	//   16   34:iconst_0        
	//   17   35:anewarray       Object[]
	//   18   38:invokestatic    #863 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   41:invokespecial   #864 <Method void RuntimeException(String)>
	//   20   44:athrow          
		ArrayList arraylist = endPage();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #1002 <Method ArrayList endPage()>
	//   23   49:astore_1        
		super.newPage();
	//   24   50:aload_0         
	//   25   51:invokespecial   #1527 <Method boolean Document.newPage()>
	//   26   54:pop             
		indentation.imageIndentLeft = 0.0F;
	//   27   55:aload_0         
	//   28   56:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   29   59:fconst_0        
	//   30   60:putfield        #354 <Field float PdfDocument$Indentation.imageIndentLeft>
		indentation.imageIndentRight = 0.0F;
	//   31   63:aload_0         
	//   32   64:getfield        #174 <Field PdfDocument$Indentation indentation>
	//   33   67:fconst_0        
	//   34   68:putfield        #339 <Field float PdfDocument$Indentation.imageIndentRight>
		try
		{
			if(isTagged(writer))
	//*  35   71:aload_0         
	//*  36   72:getfield        #256 <Field PdfWriter writer>
	//*  37   75:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  38   78:ifeq            96
			{
				flushStructureElementsOnNewPage();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #1529 <Method void flushStructureElementsOnNewPage()>
				writer.getDirectContentUnder().restoreMCBlocks(arraylist);
	//   41   85:aload_0         
	//   42   86:getfield        #256 <Field PdfWriter writer>
	//   43   89:invokevirtual   #1134 <Method PdfContentByte PdfWriter.getDirectContentUnder()>
	//   44   92:aload_1         
	//   45   93:invokevirtual   #1533 <Method void PdfContentByte.restoreMCBlocks(ArrayList)>
			}
			initPage();
	//   46   96:aload_0         
	//   47   97:invokevirtual   #1535 <Method void initPage()>
			if(body != null && body.getBackgroundColor() != null)
	//*  48  100:aload_0         
	//*  49  101:getfield        #754 <Field PdfBody body>
	//*  50  104:ifnull          128
	//*  51  107:aload_0         
	//*  52  108:getfield        #754 <Field PdfBody body>
	//*  53  111:invokevirtual   #1536 <Method BaseColor PdfBody.getBackgroundColor()>
	//*  54  114:ifnull          128
				graphics.rectangle(((Rectangle) (body)));
	//   55  117:aload_0         
	//   56  118:getfield        #314 <Field PdfContentByte graphics>
	//   57  121:aload_0         
	//   58  122:getfield        #754 <Field PdfBody body>
	//   59  125:invokevirtual   #709 <Method void PdfContentByte.rectangle(Rectangle)>
		}
	//*  60  128:iconst_1        
	//*  61  129:ireturn         
		catch(DocumentException documentexception)
	//*  62  130:astore_1        
		{
			throw new ExceptionConverter(((Exception) (documentexception)));
	//   63  131:new             #881 <Class ExceptionConverter>
	//   64  134:dup             
	//   65  135:aload_1         
	//   66  136:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   67  139:athrow          
		}
		return true;
	}

	public void open()
	{
		if(!open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1524 <Field boolean open>
	//*   2    4:ifne            41
		{
			super.open();
	//    3    7:aload_0         
	//    4    8:invokespecial   #1538 <Method void Document.open()>
			writer.open();
	//    5   11:aload_0         
	//    6   12:getfield        #256 <Field PdfWriter writer>
	//    7   15:invokevirtual   #1539 <Method void PdfWriter.open()>
			rootOutline = new PdfOutline(writer);
	//    8   18:aload_0         
	//    9   19:new             #622 <Class PdfOutline>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #256 <Field PdfWriter writer>
	//   13   27:invokespecial   #1540 <Method void PdfOutline(PdfWriter)>
	//   14   30:putfield        #966 <Field PdfOutline rootOutline>
			currentOutline = rootOutline;
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #966 <Field PdfOutline rootOutline>
	//   18   38:putfield        #620 <Field PdfOutline currentOutline>
		}
		try
		{
			if(isTagged(writer))
	//*  19   41:aload_0         
	//*  20   42:getfield        #256 <Field PdfWriter writer>
	//*  21   45:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  22   48:ifeq            56
				openMCDocument = true;
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:putfield        #141 <Field boolean openMCDocument>
			initPage();
	//   26   56:aload_0         
	//   27   57:invokevirtual   #1535 <Method void initPage()>
			return;
	//   28   60:return          
		}
		catch(DocumentException documentexception)
	//*  29   61:astore_1        
		{
			throw new ExceptionConverter(((Exception) (documentexception)));
	//   30   62:new             #881 <Class ExceptionConverter>
	//   31   65:dup             
	//   32   66:aload_1         
	//   33   67:invokespecial   #882 <Method void ExceptionConverter(Exception)>
	//   34   70:athrow          
		}
	}

	void outlineTree(PdfOutline pdfoutline)
		throws IOException
	{
		pdfoutline.setIndirectReference(writer.getPdfIndirectReference());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #256 <Field PdfWriter writer>
	//    3    5:invokevirtual   #1392 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//    4    8:invokevirtual   #1544 <Method void PdfOutline.setIndirectReference(PdfIndirectReference)>
		if(pdfoutline.parent() != null)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #632 <Method PdfOutline PdfOutline.parent()>
	//*   7   15:ifnull          32
			pdfoutline.put(PdfName.PARENT, ((PdfObject) (pdfoutline.parent().indirectReference())));
	//    8   18:aload_1         
	//    9   19:getstatic       #1547 <Field PdfName PdfName.PARENT>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #632 <Method PdfOutline PdfOutline.parent()>
	//   12   26:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   13   29:invokevirtual   #1548 <Method void PdfOutline.put(PdfName, PdfObject)>
		ArrayList arraylist = pdfoutline.getKids();
	//   14   32:aload_1         
	//   15   33:invokevirtual   #970 <Method ArrayList PdfOutline.getKids()>
	//   16   36:astore          4
		int l = arraylist.size();
	//   17   38:aload           4
	//   18   40:invokevirtual   #296 <Method int ArrayList.size()>
	//   19   43:istore_3        
		for(int i = 0; i < l; i++)
	//*  20   44:iconst_0        
	//*  21   45:istore_2        
	//*  22   46:iload_2         
	//*  23   47:iload_3         
	//*  24   48:icmpge          71
			outlineTree((PdfOutline)arraylist.get(i));
	//   25   51:aload_0         
	//   26   52:aload           4
	//   27   54:iload_2         
	//   28   55:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   29   58:checkcast       #622 <Class PdfOutline>
	//   30   61:invokevirtual   #1550 <Method void outlineTree(PdfOutline)>

	//   31   64:iload_2         
	//   32   65:iconst_1        
	//   33   66:iadd            
	//   34   67:istore_2        
	//*  35   68:goto            46
		for(int j = 0; j < l; j++)
	//*  36   71:iconst_0        
	//*  37   72:istore_2        
	//*  38   73:iload_2         
	//*  39   74:iload_3         
	//*  40   75:icmpge          154
		{
			if(j > 0)
	//*  41   78:iload_2         
	//*  42   79:ifle            111
				((PdfOutline)arraylist.get(j)).put(PdfName.PREV, ((PdfObject) (((PdfOutline)arraylist.get(j - 1)).indirectReference())));
	//   43   82:aload           4
	//   44   84:iload_2         
	//   45   85:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   46   88:checkcast       #622 <Class PdfOutline>
	//   47   91:getstatic       #1553 <Field PdfName PdfName.PREV>
	//   48   94:aload           4
	//   49   96:iload_2         
	//   50   97:iconst_1        
	//   51   98:isub            
	//   52   99:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   53  102:checkcast       #622 <Class PdfOutline>
	//   54  105:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   55  108:invokevirtual   #1548 <Method void PdfOutline.put(PdfName, PdfObject)>
			if(j < l - 1)
	//*  56  111:iload_2         
	//*  57  112:iload_3         
	//*  58  113:iconst_1        
	//*  59  114:isub            
	//*  60  115:icmpge          147
				((PdfOutline)arraylist.get(j)).put(PdfName.NEXT, ((PdfObject) (((PdfOutline)arraylist.get(j + 1)).indirectReference())));
	//   61  118:aload           4
	//   62  120:iload_2         
	//   63  121:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   64  124:checkcast       #622 <Class PdfOutline>
	//   65  127:getstatic       #1556 <Field PdfName PdfName.NEXT>
	//   66  130:aload           4
	//   67  132:iload_2         
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   71  138:checkcast       #622 <Class PdfOutline>
	//   72  141:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   73  144:invokevirtual   #1548 <Method void PdfOutline.put(PdfName, PdfObject)>
		}

	//   74  147:iload_2         
	//   75  148:iconst_1        
	//   76  149:iadd            
	//   77  150:istore_2        
	//*  78  151:goto            73
		if(l > 0)
	//*  79  154:iload_3         
	//*  80  155:ifle            198
		{
			pdfoutline.put(PdfName.FIRST, ((PdfObject) (((PdfOutline)arraylist.get(0)).indirectReference())));
	//   81  158:aload_1         
	//   82  159:getstatic       #1559 <Field PdfName PdfName.FIRST>
	//   83  162:aload           4
	//   84  164:iconst_0        
	//   85  165:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   86  168:checkcast       #622 <Class PdfOutline>
	//   87  171:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   88  174:invokevirtual   #1548 <Method void PdfOutline.put(PdfName, PdfObject)>
			pdfoutline.put(PdfName.LAST, ((PdfObject) (((PdfOutline)arraylist.get(l - 1)).indirectReference())));
	//   89  177:aload_1         
	//   90  178:getstatic       #1562 <Field PdfName PdfName.LAST>
	//   91  181:aload           4
	//   92  183:iload_3         
	//   93  184:iconst_1        
	//   94  185:isub            
	//   95  186:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   96  189:checkcast       #622 <Class PdfOutline>
	//   97  192:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   98  195:invokevirtual   #1548 <Method void PdfOutline.put(PdfName, PdfObject)>
		}
		for(int k = 0; k < l; k++)
	//*  99  198:iconst_0        
	//* 100  199:istore_2        
	//* 101  200:iload_2         
	//* 102  201:iload_3         
	//* 103  202:icmpge          235
		{
			pdfoutline = (PdfOutline)arraylist.get(k);
	//  104  205:aload           4
	//  105  207:iload_2         
	//  106  208:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//  107  211:checkcast       #622 <Class PdfOutline>
	//  108  214:astore_1        
			writer.addToBody(((PdfObject) (pdfoutline)), pdfoutline.indirectReference());
	//  109  215:aload_0         
	//  110  216:getfield        #256 <Field PdfWriter writer>
	//  111  219:aload_1         
	//  112  220:aload_1         
	//  113  221:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//  114  224:invokevirtual   #1565 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//  115  227:pop             
		}

	//  116  228:iload_2         
	//  117  229:iconst_1        
	//  118  230:iadd            
	//  119  231:istore_2        
	//* 120  232:goto            200
	//  121  235:return          
	}

	protected void popLeading()
	{
		leading = ((Float)leadingStack.pop()).floatValue();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #160 <Field Stack leadingStack>
	//    3    5:invokevirtual   #1568 <Method Object Stack.pop()>
	//    4    8:checkcast       #1174 <Class Float>
	//    5   11:invokevirtual   #1181 <Method float Float.floatValue()>
	//    6   14:putfield        #147 <Field float leading>
		if(leadingStack.size() > 0)
	//*   7   17:aload_0         
	//*   8   18:getfield        #160 <Field Stack leadingStack>
	//*   9   21:invokevirtual   #728 <Method int Stack.size()>
	//*  10   24:ifle            44
			leading = ((Float)leadingStack.peek()).floatValue();
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:getfield        #160 <Field Stack leadingStack>
	//   14   32:invokevirtual   #1571 <Method Object Stack.peek()>
	//   15   35:checkcast       #1174 <Class Float>
	//   16   38:invokevirtual   #1181 <Method float Float.floatValue()>
	//   17   41:putfield        #147 <Field float leading>
	//   18   44:return          
	}

	protected void pushLeading()
	{
		leadingStack.push(((Object) (Float.valueOf(leading))));
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Stack leadingStack>
	//    2    4:aload_0         
	//    3    5:getfield        #147 <Field float leading>
	//    4    8:invokestatic    #1178 <Method Float Float.valueOf(float)>
	//    5   11:invokevirtual   #1574 <Method Object Stack.push(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	void remoteGoto(String s, int i, float f, float f1, float f2, float f3)
	{
		addAnnotation(writer.createAnnotation(f, f1, f2, f3, new PdfAction(s, i), ((PdfName) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #256 <Field PdfWriter writer>
	//    3    5:fload_3         
	//    4    6:fload           4
	//    5    8:fload           5
	//    6   10:fload           6
	//    7   12:new             #446 <Class PdfAction>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:invokespecial   #1579 <Method void PdfAction(String, int)>
	//   12   21:aconst_null     
	//   13   22:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   14   25:invokevirtual   #1580 <Method void addAnnotation(PdfAnnotation)>
	//   15   28:return          
	}

	void remoteGoto(String s, String s1, float f, float f1, float f2, float f3)
	{
		annotationsImp.addPlainAnnotation(writer.createAnnotation(f, f1, f2, f3, new PdfAction(s, s1), ((PdfName) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    2    4:aload_0         
	//    3    5:getfield        #256 <Field PdfWriter writer>
	//    4    8:fload_3         
	//    5    9:fload           4
	//    6   11:fload           5
	//    7   13:fload           6
	//    8   15:new             #446 <Class PdfAction>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokespecial   #1582 <Method void PdfAction(String, String)>
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   15   28:invokevirtual   #491 <Method void PdfAnnotationsImp.addPlainAnnotation(PdfAnnotation)>
	//   16   31:return          
	}

	public void resetPageCount()
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            18
		{
			return;
	//    7   17:return          
		} else
		{
			super.resetPageCount();
	//    8   18:aload_0         
	//    9   19:invokespecial   #1585 <Method void Document.resetPageCount()>
			return;
	//   10   22:return          
		}
	}

	protected void saveStructElement(AccessibleElementId accessibleelementid, PdfStructureElement pdfstructureelement)
	{
		structElements.put(((Object) (accessibleelementid)), ((Object) (pdfstructureelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field HashMap structElements>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	void setAction(PdfAction pdfaction, float f, float f1, float f2, float f3)
	{
		addAnnotation(writer.createAnnotation(f, f1, f2, f3, pdfaction, ((PdfName) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #256 <Field PdfWriter writer>
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fload           5
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//   10   16:invokevirtual   #1580 <Method void addAnnotation(PdfAnnotation)>
	//   11   19:return          
	}

	void setBoxSize(String s, Rectangle rectangle)
	{
		if(rectangle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
		{
			boxSize.remove(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field HashMap boxSize>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1433 <Method Object HashMap.remove(Object)>
	//    6   12:pop             
			return;
	//    7   13:return          
		} else
		{
			boxSize.put(((Object) (s)), ((Object) (new PdfRectangle(rectangle))));
	//    8   14:aload_0         
	//    9   15:getfield        #197 <Field HashMap boxSize>
	//   10   18:aload_1         
	//   11   19:new             #1074 <Class PdfRectangle>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:invokespecial   #1593 <Method void PdfRectangle(Rectangle)>
	//   15   27:invokevirtual   #845 <Method Object HashMap.put(Object, Object)>
	//   16   30:pop             
			return;
	//   17   31:return          
		}
	}

	public void setCollection(PdfCollection pdfcollection)
	{
		collection = pdfcollection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1358 <Field PdfCollection collection>
	//    3    5:return          
	}

	void setCropBoxSize(Rectangle rectangle)
	{
		setBoxSize("crop", rectangle);
	//    0    0:aload_0         
	//    1    1:ldc2            #1043 <String "crop">
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1598 <Method void setBoxSize(String, Rectangle)>
	//    4    8:return          
	}

	void setDuration(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            22
			writer.addPageDictEntry(PdfName.DUR, ((PdfObject) (new PdfNumber(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #256 <Field PdfWriter writer>
	//    4    8:getstatic       #1602 <Field PdfName PdfName.DUR>
	//    5   11:new             #1114 <Class PdfNumber>
	//    6   14:dup             
	//    7   15:iload_1         
	//    8   16:invokespecial   #1122 <Method void PdfNumber(int)>
	//    9   19:invokevirtual   #1605 <Method void PdfWriter.addPageDictEntry(PdfName, PdfObject)>
	//   10   22:return          
	}

	void setLanguage(String s)
	{
		language = new PdfString(s);
	//    0    0:aload_0         
	//    1    1:new             #794 <Class PdfString>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1606 <Method void PdfString(String)>
	//    5    9:putfield        #1369 <Field PdfString language>
	//    6   12:return          
	}

	void setLeading(float f)
	{
		leading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #147 <Field float leading>
	//    3    5:return          
	}

	public boolean setMarginMirroring(boolean flag)
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return super.setMarginMirroring(flag);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokespecial   #1611 <Method boolean Document.setMarginMirroring(boolean)>
	//   12   24:ireturn         
	}

	public boolean setMarginMirroringTopBottom(boolean flag)
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return super.setMarginMirroringTopBottom(flag);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokespecial   #1614 <Method boolean Document.setMarginMirroringTopBottom(boolean)>
	//   12   24:ireturn         
	}

	public boolean setMargins(float f, float f1, float f2, float f3)
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            19
		{
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		} else
		{
			nextMarginLeft = f;
	//    9   19:aload_0         
	//   10   20:fload_1         
	//   11   21:putfield        #1618 <Field float nextMarginLeft>
			nextMarginRight = f1;
	//   12   24:aload_0         
	//   13   25:fload_2         
	//   14   26:putfield        #1620 <Field float nextMarginRight>
			nextMarginTop = f2;
	//   15   29:aload_0         
	//   16   30:fload_3         
	//   17   31:putfield        #1622 <Field float nextMarginTop>
			nextMarginBottom = f3;
	//   18   34:aload_0         
	//   19   35:fload           4
	//   20   37:putfield        #1624 <Field float nextMarginBottom>
			return true;
	//   21   40:iconst_1        
	//   22   41:ireturn         
		}
	}

	protected void setNewPageSizeAndMargins()
	{
		pageSize = nextPageSize;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #193 <Field Rectangle nextPageSize>
	//    3    5:putfield        #607 <Field Rectangle pageSize>
		if(marginMirroring && (getPageNumber() & 1) == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #1627 <Field boolean marginMirroring>
	//*   6   12:ifeq            148
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #1630 <Method int getPageNumber()>
	//*   9   19:iconst_1        
	//*  10   20:iand            
	//*  11   21:ifne            148
		{
			marginRight = nextMarginLeft;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #1618 <Field float nextMarginLeft>
	//   15   29:putfield        #1633 <Field float marginRight>
			marginLeft = nextMarginRight;
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #1620 <Field float nextMarginRight>
	//   19   37:putfield        #1636 <Field float marginLeft>
		} else
	//*  20   40:aload_0         
	//*  21   41:getfield        #1639 <Field boolean marginMirroringTopBottom>
	//*  22   44:ifeq            167
	//*  23   47:aload_0         
	//*  24   48:invokevirtual   #1630 <Method int getPageNumber()>
	//*  25   51:iconst_1        
	//*  26   52:iand            
	//*  27   53:ifne            167
	//*  28   56:aload_0         
	//*  29   57:aload_0         
	//*  30   58:getfield        #1624 <Field float nextMarginBottom>
	//*  31   61:putfield        #1642 <Field float marginTop>
	//*  32   64:aload_0         
	//*  33   65:aload_0         
	//*  34   66:getfield        #1622 <Field float nextMarginTop>
	//*  35   69:putfield        #1645 <Field float marginBottom>
	//*  36   72:aload_0         
	//*  37   73:getfield        #256 <Field PdfWriter writer>
	//*  38   76:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  39   79:ifne            186
	//*  40   82:aload_0         
	//*  41   83:new             #271 <Class PdfContentByte>
	//*  42   86:dup             
	//*  43   87:aload_0         
	//*  44   88:getfield        #256 <Field PdfWriter writer>
	//*  45   91:invokespecial   #1500 <Method void PdfContentByte(PdfWriter)>
	//*  46   94:putfield        #262 <Field PdfContentByte text>
	//*  47   97:aload_0         
	//*  48   98:getfield        #262 <Field PdfContentByte text>
	//*  49  101:invokevirtual   #1648 <Method void PdfContentByte.reset()>
	//*  50  104:aload_0         
	//*  51  105:getfield        #262 <Field PdfContentByte text>
	//*  52  108:invokevirtual   #1651 <Method void PdfContentByte.beginText()>
	//*  53  111:aload_0         
	//*  54  112:getfield        #262 <Field PdfContentByte text>
	//*  55  115:aload_0         
	//*  56  116:invokevirtual   #1653 <Method float left()>
	//*  57  119:aload_0         
	//*  58  120:invokevirtual   #1452 <Method float top()>
	//*  59  123:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//*  60  126:aload_0         
	//*  61  127:getfield        #256 <Field PdfWriter writer>
	//*  62  130:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*  63  133:ifeq            147
	//*  64  136:aload_0         
	//*  65  137:aload_0         
	//*  66  138:getfield        #262 <Field PdfContentByte text>
	//*  67  141:invokevirtual   #1123 <Method int PdfContentByte.size()>
	//*  68  144:putfield        #1125 <Field int textEmptySize>
	//*  69  147:return          
		{
			marginLeft = nextMarginLeft;
	//   70  148:aload_0         
	//   71  149:aload_0         
	//   72  150:getfield        #1618 <Field float nextMarginLeft>
	//   73  153:putfield        #1636 <Field float marginLeft>
			marginRight = nextMarginRight;
	//   74  156:aload_0         
	//   75  157:aload_0         
	//   76  158:getfield        #1620 <Field float nextMarginRight>
	//   77  161:putfield        #1633 <Field float marginRight>
		}
		if(marginMirroringTopBottom && (getPageNumber() & 1) == 0)
		{
			marginTop = nextMarginBottom;
			marginBottom = nextMarginTop;
		} else
	//*  78  164:goto            40
		{
			marginTop = nextMarginTop;
	//   79  167:aload_0         
	//   80  168:aload_0         
	//   81  169:getfield        #1622 <Field float nextMarginTop>
	//   82  172:putfield        #1642 <Field float marginTop>
			marginBottom = nextMarginBottom;
	//   83  175:aload_0         
	//   84  176:aload_0         
	//   85  177:getfield        #1624 <Field float nextMarginBottom>
	//   86  180:putfield        #1645 <Field float marginBottom>
		}
		if(!isTagged(writer))
		{
			text = new PdfContentByte(writer);
			text.reset();
		} else
	//*  87  183:goto            72
		{
			text = graphics;
	//   88  186:aload_0         
	//   89  187:aload_0         
	//   90  188:getfield        #314 <Field PdfContentByte graphics>
	//   91  191:putfield        #262 <Field PdfContentByte text>
		}
		text.beginText();
		text.moveText(left(), top());
		if(isTagged(writer))
			textEmptySize = text.size();
	//*  92  194:goto            104
	}

	void setOpenAction(PdfAction pdfaction)
	{
		openActionAction = pdfaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1374 <Field PdfAction openActionAction>
		openActionName = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #1346 <Field String openActionName>
	//    6   10:return          
	}

	void setOpenAction(String s)
	{
		openActionName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1346 <Field String openActionName>
		openActionAction = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #1374 <Field PdfAction openActionAction>
	//    6   10:return          
	}

	void setPageAction(PdfName pdfname, PdfAction pdfaction)
	{
		if(pageAA == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field PdfDictionary pageAA>
	//*   2    4:ifnonnull       18
			pageAA = new PdfDictionary();
	//    3    7:aload_0         
	//    4    8:new             #760 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #761 <Method void PdfDictionary()>
	//    7   15:putfield        #201 <Field PdfDictionary pageAA>
		pageAA.put(pdfname, ((PdfObject) (pdfaction)));
	//    8   18:aload_0         
	//    9   19:getfield        #201 <Field PdfDictionary pageAA>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #770 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   13   27:return          
	}

	public void setPageCount(int i)
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            18
		{
			return;
	//    7   17:return          
		} else
		{
			super.setPageCount(i);
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:invokespecial   #1657 <Method void Document.setPageCount(int)>
			return;
	//   11   23:return          
		}
	}

	void setPageEmpty(boolean flag)
	{
		pageEmpty = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #199 <Field boolean pageEmpty>
	//    3    5:return          
	}

	void setPageLabels(PdfPageLabels pdfpagelabels)
	{
		pageLabels = pdfpagelabels;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1327 <Field PdfPageLabels pageLabels>
	//    3    5:return          
	}

	public boolean setPageSize(Rectangle rectangle)
	{
		if(writer != null && writer.isPaused())
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field PdfWriter writer>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #256 <Field PdfWriter writer>
	//*   5   11:invokevirtual   #361 <Method boolean PdfWriter.isPaused()>
	//*   6   14:ifeq            19
		{
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		} else
		{
			nextPageSize = new Rectangle(rectangle);
	//    9   19:aload_0         
	//   10   20:new             #458 <Class Rectangle>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #1663 <Method void Rectangle(Rectangle)>
	//   14   28:putfield        #193 <Field Rectangle nextPageSize>
			return true;
	//   15   31:iconst_1        
	//   16   32:ireturn         
		}
	}

	void setSigFlags(int i)
	{
		annotationsImp.setSigFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field PdfAnnotationsImp annotationsImp>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1666 <Method void PdfAnnotationsImp.setSigFlags(int)>
	//    4    8:return          
	}

	void setStrictImageSequence(boolean flag)
	{
		strictImageSequence = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #203 <Field boolean strictImageSequence>
	//    3    5:return          
	}

	public void setTabSettings(TabSettings tabsettings)
	{
		tabSettings = tabsettings;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #415 <Field TabSettings tabSettings>
	//    3    5:return          
	}

	void setThumbnail(Image image)
		throws PdfException, DocumentException
	{
		writer.addPageDictEntry(PdfName.THUMB, ((PdfObject) (writer.getImageReference(writer.addDirectImageSimple(image)))));
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field PdfWriter writer>
	//    2    4:getstatic       #1673 <Field PdfName PdfName.THUMB>
	//    3    7:aload_0         
	//    4    8:getfield        #256 <Field PdfWriter writer>
	//    5   11:aload_0         
	//    6   12:getfield        #256 <Field PdfWriter writer>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1677 <Method PdfName PdfWriter.addDirectImageSimple(Image)>
	//    9   19:invokevirtual   #1681 <Method PdfIndirectReference PdfWriter.getImageReference(PdfName)>
	//   10   22:invokevirtual   #1605 <Method void PdfWriter.addPageDictEntry(PdfName, PdfObject)>
	//   11   25:return          
	}

	void setTransition(PdfTransition pdftransition)
	{
		writer.addPageDictEntry(PdfName.TRANS, ((PdfObject) (pdftransition.getTransitionDictionary())));
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field PdfWriter writer>
	//    2    4:getstatic       #1686 <Field PdfName PdfName.TRANS>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #1691 <Method PdfDictionary PdfTransition.getTransitionDictionary()>
	//    5   11:invokevirtual   #1605 <Method void PdfWriter.addPageDictEntry(PdfName, PdfObject)>
	//    6   14:return          
	}

	void setViewerPreferences(int i)
	{
		viewerPreferences.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field PdfViewerPreferencesImp viewerPreferences>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1694 <Method void PdfViewerPreferencesImp.setViewerPreferences(int)>
	//    4    8:return          
	}

	public void setXmpMetadata(byte abyte0[])
		throws IOException
	{
		abyte0 = ((byte []) (new PdfStream(abyte0)));
	//    0    0:new             #1698 <Class PdfStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1700 <Method void PdfStream(byte[])>
	//    4    8:astore_1        
		((PdfStream) (abyte0)).put(PdfName.TYPE, ((PdfObject) (PdfName.METADATA)));
	//    5    9:aload_1         
	//    6   10:getstatic       #1703 <Field PdfName PdfName.TYPE>
	//    7   13:getstatic       #1706 <Field PdfName PdfName.METADATA>
	//    8   16:invokevirtual   #1707 <Method void PdfStream.put(PdfName, PdfObject)>
		((PdfStream) (abyte0)).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.XML)));
	//    9   19:aload_1         
	//   10   20:getstatic       #1710 <Field PdfName PdfName.SUBTYPE>
	//   11   23:getstatic       #1713 <Field PdfName PdfName.XML>
	//   12   26:invokevirtual   #1707 <Method void PdfStream.put(PdfName, PdfObject)>
		PdfEncryption pdfencryption = writer.getEncryption();
	//   13   29:aload_0         
	//   14   30:getfield        #256 <Field PdfWriter writer>
	//   15   33:invokevirtual   #1717 <Method PdfEncryption PdfWriter.getEncryption()>
	//   16   36:astore_2        
		if(pdfencryption != null && !pdfencryption.isMetadataEncrypted())
	//*  17   37:aload_2         
	//*  18   38:ifnull          72
	//*  19   41:aload_2         
	//*  20   42:invokevirtual   #1722 <Method boolean PdfEncryption.isMetadataEncrypted()>
	//*  21   45:ifne            72
		{
			PdfArray pdfarray = new PdfArray();
	//   22   48:new             #1105 <Class PdfArray>
	//   23   51:dup             
	//   24   52:invokespecial   #1723 <Method void PdfArray()>
	//   25   55:astore_2        
			pdfarray.add(((PdfObject) (PdfName.CRYPT)));
	//   26   56:aload_2         
	//   27   57:getstatic       #1726 <Field PdfName PdfName.CRYPT>
	//   28   60:invokevirtual   #1729 <Method boolean PdfArray.add(PdfObject)>
	//   29   63:pop             
			((PdfStream) (abyte0)).put(PdfName.FILTER, ((PdfObject) (pdfarray)));
	//   30   64:aload_1         
	//   31   65:getstatic       #1732 <Field PdfName PdfName.FILTER>
	//   32   68:aload_2         
	//   33   69:invokevirtual   #1707 <Method void PdfStream.put(PdfName, PdfObject)>
		}
		writer.addPageDictEntry(PdfName.METADATA, ((PdfObject) (writer.addToBody(((PdfObject) (abyte0))).getIndirectReference())));
	//   34   72:aload_0         
	//   35   73:getfield        #256 <Field PdfWriter writer>
	//   36   76:getstatic       #1706 <Field PdfName PdfName.METADATA>
	//   37   79:aload_0         
	//   38   80:getfield        #256 <Field PdfWriter writer>
	//   39   83:aload_1         
	//   40   84:invokevirtual   #874 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   41   87:invokevirtual   #879 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   42   90:invokevirtual   #1605 <Method void PdfWriter.addPageDictEntry(PdfName, PdfObject)>
	//   43   93:return          
	}

	void traverseOutlineCount(PdfOutline pdfoutline)
	{
		ArrayList arraylist = pdfoutline.getKids();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #970 <Method ArrayList PdfOutline.getKids()>
	//    2    4:astore_3        
		PdfOutline pdfoutline1 = pdfoutline.parent();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #632 <Method PdfOutline PdfOutline.parent()>
	//    5    9:astore          4
		if(arraylist.isEmpty())
	//*   6   11:aload_3         
	//*   7   12:invokevirtual   #232 <Method boolean ArrayList.isEmpty()>
	//*   8   15:ifeq            36
		{
			if(pdfoutline1 != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          35
				pdfoutline1.setCount(pdfoutline1.getCount() + 1);
	//   11   23:aload           4
	//   12   25:aload           4
	//   13   27:invokevirtual   #1735 <Method int PdfOutline.getCount()>
	//   14   30:iconst_1        
	//   15   31:iadd            
	//   16   32:invokevirtual   #1738 <Method void PdfOutline.setCount(int)>
		} else
	//*  17   35:return          
		{
			for(int i = 0; i < arraylist.size(); i++)
	//*  18   36:iconst_0        
	//*  19   37:istore_2        
	//*  20   38:iload_2         
	//*  21   39:aload_3         
	//*  22   40:invokevirtual   #296 <Method int ArrayList.size()>
	//*  23   43:icmpge          65
				traverseOutlineCount((PdfOutline)arraylist.get(i));
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   28   52:checkcast       #622 <Class PdfOutline>
	//   29   55:invokevirtual   #974 <Method void traverseOutlineCount(PdfOutline)>

	//   30   58:iload_2         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_2        
	//*  34   62:goto            38
			if(pdfoutline1 != null)
	//*  35   65:aload           4
	//*  36   67:ifnull          35
				if(pdfoutline.isOpen())
	//*  37   70:aload_1         
	//*  38   71:invokevirtual   #1741 <Method boolean PdfOutline.isOpen()>
	//*  39   74:ifeq            95
				{
					pdfoutline1.setCount(pdfoutline.getCount() + pdfoutline1.getCount() + 1);
	//   40   77:aload           4
	//   41   79:aload_1         
	//   42   80:invokevirtual   #1735 <Method int PdfOutline.getCount()>
	//   43   83:aload           4
	//   44   85:invokevirtual   #1735 <Method int PdfOutline.getCount()>
	//   45   88:iadd            
	//   46   89:iconst_1        
	//   47   90:iadd            
	//   48   91:invokevirtual   #1738 <Method void PdfOutline.setCount(int)>
					return;
	//   49   94:return          
				} else
				{
					pdfoutline1.setCount(pdfoutline1.getCount() + 1);
	//   50   95:aload           4
	//   51   97:aload           4
	//   52   99:invokevirtual   #1735 <Method int PdfOutline.getCount()>
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:invokevirtual   #1738 <Method void PdfOutline.setCount(int)>
					pdfoutline.setCount(-pdfoutline.getCount());
	//   56  107:aload_1         
	//   57  108:aload_1         
	//   58  109:invokevirtual   #1735 <Method int PdfOutline.getCount()>
	//   59  112:ineg            
	//   60  113:invokevirtual   #1738 <Method void PdfOutline.setCount(int)>
					return;
	//   61  116:return          
				}
		}
	}

	protected void useExternalCache(TempFileCache tempfilecache)
	{
		isToUseExternalCache = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #139 <Field boolean isToUseExternalCache>
		externalCache = tempfilecache;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #1280 <Field TempFileCache externalCache>
	//    6   10:return          
	}

	float writeLineToContent(PdfLine pdfline, PdfContentByte pdfcontentbyte, PdfContentByte pdfcontentbyte1, Object aobj[], float f)
		throws DocumentException
	{
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		float f8;
		float f10;
		float f11;
		float f12;
		float f13;
		float f17;
		float f18;
		int i;
		boolean flag;
		int j;
		int j2;
		boolean flag3;
		Object obj;
		obj = ((Object) ((PdfFont)aobj[0]));
	//    0    0:aload           4
	//    1    2:iconst_0        
	//    2    3:aaload          
	//    3    4:checkcast       #1244 <Class PdfFont>
	//    4    7:astore          32
		f1 = ((Float)aobj[1]).floatValue();
	//    5    9:aload           4
	//    6   11:iconst_1        
	//    7   12:aaload          
	//    8   13:checkcast       #1174 <Class Float>
	//    9   16:invokevirtual   #1181 <Method float Float.floatValue()>
	//   10   19:fstore          6
		f5 = 0.0F;
	//   11   21:fconst_0        
	//   12   22:fstore          10
		f2 = 0.0F;
	//   13   24:fconst_0        
	//   14   25:fstore          7
		f3 = (0.0F / 0.0F);
	//   15   27:ldc2            #1744 <Float (0.0F / 0.0F)>
	//   16   30:fstore          8
		f10 = 0.0F;
	//   17   32:fconst_0        
	//   18   33:fstore          14
		f11 = 0.0F;
	//   19   35:fconst_0        
	//   20   36:fstore          15
		f4 = 0.0F;
	//   21   38:fconst_0        
	//   22   39:fstore          9
		f8 = pdfcontentbyte.getXTLM() + pdfline.getOriginalWidth();
	//   23   41:aload_2         
	//   24   42:invokevirtual   #1225 <Method float PdfContentByte.getXTLM()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #1747 <Method float PdfLine.getOriginalWidth()>
	//   27   49:fadd            
	//   28   50:fstore          13
		j2 = pdfline.numberOfSpaces();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #1750 <Method int PdfLine.numberOfSpaces()>
	//   31   56:istore          28
		i = pdfline.getLineLengthUtf32();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #1753 <Method int PdfLine.getLineLengthUtf32()>
	//   34   62:istore          22
		float f15;
		int k;
		int j1;
		int k2;
		Object aobj1[];
		Object obj2;
		Iterator iterator;
		Object aobj3[][];
		float af[];
		if(pdfline.hasToBeJustified() && (j2 != 0 || i > 1))
	//*  35   64:aload_1         
	//*  36   65:invokevirtual   #698 <Method boolean PdfLine.hasToBeJustified()>
	//*  37   68:ifeq            989
	//*  38   71:iload           28
	//*  39   73:ifne            82
	//*  40   76:iload           22
	//*  41   78:iconst_1        
	//*  42   79:icmple          989
			flag = true;
	//   43   82:iconst_1        
	//   44   83:istore          23
		else
	//*  45   85:aload_1         
	//*  46   86:invokevirtual   #1756 <Method int PdfLine.getSeparatorCount()>
	//*  47   89:istore          24
	//*  48   91:iload           24
	//*  49   93:ifle            995
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//*  52  100:iload           24
	//*  53  102:i2f             
	//*  54  103:fdiv            
	//*  55  104:fstore          12
	//*  56  106:fload           13
	//*  57  108:fstore          17
	//*  58  110:fload           6
	//*  59  112:fstore          5
	//*  60  114:fload           7
	//*  61  116:fstore          16
	//*  62  118:fload           14
	//*  63  120:fstore          11
	//*  64  122:fload           15
	//*  65  124:fstore          10
	//*  66  126:aload_1         
	//*  67  127:invokevirtual   #1759 <Method int PdfLine.getLastStrokeChunk()>
	//*  68  130:istore          29
	//*  69  132:iconst_0        
	//*  70  133:istore          24
	//*  71  135:aload_2         
	//*  72  136:invokevirtual   #1225 <Method float PdfContentByte.getXTLM()>
	//*  73  139:fstore          20
	//*  74  141:aload_2         
	//*  75  142:invokevirtual   #1231 <Method float PdfContentByte.getYTLM()>
	//*  76  145:fstore          21
	//*  77  147:iconst_0        
	//*  78  148:istore          22
	//*  79  150:iconst_0        
	//*  80  151:istore          31
	//*  81  153:aload_1         
	//*  82  154:invokevirtual   #1760 <Method Iterator PdfLine.iterator()>
	//*  83  157:astore          36
	//*  84  159:fconst_0        
	//*  85  160:fstore          7
	//*  86  162:fload           20
	//*  87  164:fstore          6
	//*  88  166:aload           36
	//*  89  168:invokeinterface #1195 <Method boolean Iterator.hasNext()>
	//*  90  173:ifeq            3564
	//*  91  176:aload           36
	//*  92  178:invokeinterface #1199 <Method Object Iterator.next()>
	//*  93  183:checkcast       #411 <Class PdfChunk>
	//*  94  186:astore          37
	//*  95  188:iload           31
	//*  96  190:istore          30
	//*  97  192:aload_0         
	//*  98  193:getfield        #256 <Field PdfWriter writer>
	//*  99  196:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 100  199:ifeq            226
	//* 101  202:iload           31
	//* 102  204:istore          30
	//* 103  206:aload           37
	//* 104  208:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//* 105  211:ifnull          226
	//* 106  214:aload_2         
	//* 107  215:aload           37
	//* 108  217:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//* 109  220:invokevirtual   #506 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 110  223:iconst_1        
	//* 111  224:istore          30
	//* 112  226:aload           37
	//* 113  228:invokevirtual   #1767 <Method BaseColor PdfChunk.color()>
	//* 114  231:astore          33
	//* 115  233:aload           37
	//* 116  235:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//* 117  238:invokevirtual   #1773 <Method float PdfFont.size()>
	//* 118  241:fstore          18
	//* 119  243:aload           37
	//* 120  245:invokevirtual   #1776 <Method boolean PdfChunk.isImage()>
	//* 121  248:ifeq            1327
	//* 122  251:aload           37
	//* 123  253:invokevirtual   #1777 <Method float PdfChunk.height()>
	//* 124  256:fstore          14
	//* 125  258:aload           37
	//* 126  260:invokevirtual   #1777 <Method float PdfChunk.height()>
	//* 127  263:fstore          18
	//* 128  265:fconst_0        
	//* 129  266:fstore          15
	//* 130  268:iload           24
	//* 131  270:iload           29
	//* 132  272:icmpgt          3665
	//* 133  275:iload           23
	//* 134  277:ifeq            1362
	//* 135  280:aload           37
	//* 136  282:fload           10
	//* 137  284:fload           11
	//* 138  286:invokevirtual   #1781 <Method float PdfChunk.getWidthCorrected(float, float)>
	//* 139  289:fstore          9
	//* 140  291:aload           37
	//* 141  293:invokevirtual   #1784 <Method boolean PdfChunk.isStroked()>
	//* 142  296:ifeq            3651
	//* 143  299:aload_1         
	//* 144  300:iload           24
	//* 145  302:iconst_1        
	//* 146  303:iadd            
	//* 147  304:invokevirtual   #1788 <Method PdfChunk PdfLine.getChunk(int)>
	//* 148  307:astore          38
	//* 149  309:aload           37
	//* 150  311:invokevirtual   #1791 <Method boolean PdfChunk.isSeparator()>
	//* 151  314:ifeq            388
	//* 152  317:fload           12
	//* 153  319:fstore          9
	//* 154  321:aload           37
	//* 155  323:ldc2            #1793 <String "SEPARATOR">
	//* 156  326:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 157  329:checkcast       #1799 <Class Object[]>
	//* 158  332:checkcast       #1799 <Class Object[]>
	//* 159  335:astore          34
	//* 160  337:aload           34
	//* 161  339:iconst_0        
	//* 162  340:aaload          
	//* 163  341:checkcast       #727 <Class DrawInterface>
	//* 164  344:astore          35
	//* 165  346:aload           34
	//* 166  348:iconst_1        
	//* 167  349:aaload          
	//* 168  350:checkcast       #1801 <Class Boolean>
	//* 169  353:invokevirtual   #1804 <Method boolean Boolean.booleanValue()>
	//* 170  356:ifeq            1372
	//* 171  359:aload           35
	//* 172  361:aload_3         
	//* 173  362:fload           20
	//* 174  364:fload           21
	//* 175  366:fload           15
	//* 176  368:fadd            
	//* 177  369:fload           20
	//* 178  371:aload_1         
	//* 179  372:invokevirtual   #1747 <Method float PdfLine.getOriginalWidth()>
	//* 180  375:fadd            
	//* 181  376:fload           14
	//* 182  378:fload           15
	//* 183  380:fsub            
	//* 184  381:fload           21
	//* 185  383:invokeinterface #732 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//* 186  388:aload           37
	//* 187  390:invokevirtual   #1807 <Method boolean PdfChunk.isTab()>
	//* 188  393:ifeq            3648
	//* 189  396:aload           37
	//* 190  398:ldc2            #1809 <String "TABSETTINGS">
	//* 191  401:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 192  404:ifeq            1409
	//* 193  407:aload           37
	//* 194  409:invokevirtual   #1813 <Method TabStop PdfChunk.getTabStop()>
	//* 195  412:astore          34
	//* 196  414:aload           34
	//* 197  416:ifnull          1402
	//* 198  419:aload           34
	//* 199  421:invokevirtual   #1818 <Method float TabStop.getPosition()>
	//* 200  424:fload           20
	//* 201  426:fadd            
	//* 202  427:fstore          13
	//* 203  429:fload           13
	//* 204  431:fstore          7
	//* 205  433:aload           34
	//* 206  435:invokevirtual   #1822 <Method DrawInterface TabStop.getLeader()>
	//* 207  438:ifnull          472
	//* 208  441:aload           34
	//* 209  443:invokevirtual   #1822 <Method DrawInterface TabStop.getLeader()>
	//* 210  446:aload_3         
	//* 211  447:fload           6
	//* 212  449:fload           21
	//* 213  451:fload           15
	//* 214  453:fadd            
	//* 215  454:fload           13
	//* 216  456:fload           14
	//* 217  458:fload           15
	//* 218  460:fsub            
	//* 219  461:fload           21
	//* 220  463:invokeinterface #732 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//* 221  468:fload           13
	//* 222  470:fstore          7
	//* 223  472:fload           7
	//* 224  474:fstore          13
	//* 225  476:fload           6
	//* 226  478:fstore          7
	//* 227  480:fload           13
	//* 228  482:fstore          6
	//* 229  484:aload           37
	//* 230  486:ldc2            #1824 <String "BACKGROUND">
	//* 231  489:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 232  492:ifeq            707
	//* 233  495:aload           37
	//* 234  497:ldc2            #1824 <String "BACKGROUND">
	//* 235  500:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 236  503:checkcast       #1799 <Class Object[]>
	//* 237  506:checkcast       #1799 <Class Object[]>
	//* 238  509:astore          34
	//* 239  511:aload           34
	//* 240  513:iconst_0        
	//* 241  514:aaload          
	//* 242  515:ifnull          707
	//* 243  518:aload_3         
	//* 244  519:invokevirtual   #1827 <Method boolean PdfContentByte.getInText()>
	//* 245  522:istore          31
	//* 246  524:iload           31
	//* 247  526:ifeq            543
	//* 248  529:aload_0         
	//* 249  530:getfield        #256 <Field PdfWriter writer>
	//* 250  533:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 251  536:ifeq            543
	//* 252  539:aload_3         
	//* 253  540:invokevirtual   #1128 <Method void PdfContentByte.endText()>
	//* 254  543:aload_3         
	//* 255  544:invokevirtual   #1830 <Method void PdfContentByte.saveState()>
	//* 256  547:fload           5
	//* 257  549:fstore          19
	//* 258  551:fload           19
	//* 259  553:fstore          13
	//* 260  555:aload           38
	//* 261  557:ifnull          578
	//* 262  560:fload           19
	//* 263  562:fstore          13
	//* 264  564:aload           38
	//* 265  566:ldc2            #1824 <String "BACKGROUND">
	//* 266  569:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 267  572:ifeq            578
	//* 268  575:fconst_0        
	//* 269  576:fstore          13
	//* 270  578:fload           13
	//* 271  580:fstore          19
	//* 272  582:aload           38
	//* 273  584:ifnonnull       594
	//* 274  587:fload           13
	//* 275  589:fload           16
	//* 276  591:fadd            
	//* 277  592:fstore          19
	//* 278  594:aload_3         
	//* 279  595:aload           34
	//* 280  597:iconst_0        
	//* 281  598:aaload          
	//* 282  599:checkcast       #1832 <Class BaseColor>
	//* 283  602:invokevirtual   #1836 <Method void PdfContentByte.setColorFill(BaseColor)>
	//* 284  605:aload           34
	//* 285  607:iconst_1        
	//* 286  608:aaload          
	//* 287  609:checkcast       #1838 <Class float[]>
	//* 288  612:checkcast       #1838 <Class float[]>
	//* 289  615:astore          34
	//* 290  617:aload_3         
	//* 291  618:fload           6
	//* 292  620:aload           34
	//* 293  622:iconst_0        
	//* 294  623:faload          
	//* 295  624:fsub            
	//* 296  625:fload           21
	//* 297  627:fload           15
	//* 298  629:fadd            
	//* 299  630:aload           34
	//* 300  632:iconst_1        
	//* 301  633:faload          
	//* 302  634:fsub            
	//* 303  635:aload           37
	//* 304  637:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	//* 305  640:fadd            
	//* 306  641:fload           9
	//* 307  643:fload           19
	//* 308  645:fsub            
	//* 309  646:aload           34
	//* 310  648:iconst_0        
	//* 311  649:faload          
	//* 312  650:fadd            
	//* 313  651:aload           34
	//* 314  653:iconst_2        
	//* 315  654:faload          
	//* 316  655:fadd            
	//* 317  656:fload           14
	//* 318  658:fload           15
	//* 319  660:fsub            
	//* 320  661:aload           34
	//* 321  663:iconst_1        
	//* 322  664:faload          
	//* 323  665:fadd            
	//* 324  666:aload           34
	//* 325  668:iconst_3        
	//* 326  669:faload          
	//* 327  670:fadd            
	//* 328  671:invokevirtual   #1843 <Method void PdfContentByte.rectangle(float, float, float, float)>
	//* 329  674:aload_3         
	//* 330  675:invokevirtual   #1846 <Method void PdfContentByte.fill()>
	//* 331  678:aload_3         
	//* 332  679:fconst_0        
	//* 333  680:invokevirtual   #1849 <Method void PdfContentByte.setGrayFill(float)>
	//* 334  683:aload_3         
	//* 335  684:invokevirtual   #1852 <Method void PdfContentByte.restoreState()>
	//* 336  687:iload           31
	//* 337  689:ifeq            707
	//* 338  692:aload_0         
	//* 339  693:getfield        #256 <Field PdfWriter writer>
	//* 340  696:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 341  699:ifeq            707
	//* 342  702:aload_3         
	//* 343  703:iconst_1        
	//* 344  704:invokevirtual   #1854 <Method void PdfContentByte.beginText(boolean)>
	//* 345  707:aload           37
	//* 346  709:ldc2            #1856 <String "UNDERLINE">
	//* 347  712:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 348  715:ifeq            1525
	//* 349  718:aload_3         
	//* 350  719:invokevirtual   #1827 <Method boolean PdfContentByte.getInText()>
	//* 351  722:istore          31
	//* 352  724:iload           31
	//* 353  726:ifeq            743
	//* 354  729:aload_0         
	//* 355  730:getfield        #256 <Field PdfWriter writer>
	//* 356  733:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 357  736:ifeq            743
	//* 358  739:aload_3         
	//* 359  740:invokevirtual   #1128 <Method void PdfContentByte.endText()>
	//* 360  743:fload           5
	//* 361  745:fstore          19
	//* 362  747:fload           19
	//* 363  749:fstore          13
	//* 364  751:aload           38
	//* 365  753:ifnull          774
	//* 366  756:fload           19
	//* 367  758:fstore          13
	//* 368  760:aload           38
	//* 369  762:ldc2            #1856 <String "UNDERLINE">
	//* 370  765:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 371  768:ifeq            774
	//* 372  771:fconst_0        
	//* 373  772:fstore          13
	//* 374  774:fload           13
	//* 375  776:fstore          19
	//* 376  778:aload           38
	//* 377  780:ifnonnull       790
	//* 378  783:fload           13
	//* 379  785:fload           16
	//* 380  787:fadd            
	//* 381  788:fstore          19
	//* 382  790:aload           37
	//* 383  792:ldc2            #1856 <String "UNDERLINE">
	//* 384  795:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 385  798:checkcast       #1858 <Class Object[][]>
	//* 386  801:checkcast       #1858 <Class Object[][]>
	//* 387  804:astore          39
	//* 388  806:iconst_0        
	//* 389  807:istore          25
	//* 390  809:iload           25
	//* 391  811:aload           39
	//* 392  813:arraylength     
	//* 393  814:icmpge          1500
	//* 394  817:aload           39
	//* 395  819:iload           25
	//* 396  821:aaload          
	//* 397  822:astore          34
	//* 398  824:aload           34
	//* 399  826:iconst_0        
	//* 400  827:aaload          
	//* 401  828:checkcast       #1832 <Class BaseColor>
	//* 402  831:astore          35
	//* 403  833:aload           34
	//* 404  835:iconst_1        
	//* 405  836:aaload          
	//* 406  837:checkcast       #1838 <Class float[]>
	//* 407  840:checkcast       #1838 <Class float[]>
	//* 408  843:astore          40
	//* 409  845:aload           35
	//* 410  847:astore          34
	//* 411  849:aload           35
	//* 412  851:ifnonnull       858
	//* 413  854:aload           33
	//* 414  856:astore          34
	//* 415  858:aload           34
	//* 416  860:ifnull          869
	//* 417  863:aload_3         
	//* 418  864:aload           34
	//* 419  866:invokevirtual   #1861 <Method void PdfContentByte.setColorStroke(BaseColor)>
	//* 420  869:aload_3         
	//* 421  870:aload           40
	//* 422  872:iconst_0        
	//* 423  873:faload          
	//* 424  874:aload           37
	//* 425  876:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//* 426  879:invokevirtual   #1773 <Method float PdfFont.size()>
	//* 427  882:aload           40
	//* 428  884:iconst_1        
	//* 429  885:faload          
	//* 430  886:fmul            
	//* 431  887:fadd            
	//* 432  888:invokevirtual   #1864 <Method void PdfContentByte.setLineWidth(float)>
	//* 433  891:aload           40
	//* 434  893:iconst_2        
	//* 435  894:faload          
	//* 436  895:aload           37
	//* 437  897:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//* 438  900:invokevirtual   #1773 <Method float PdfFont.size()>
	//* 439  903:aload           40
	//* 440  905:iconst_3        
	//* 441  906:faload          
	//* 442  907:fmul            
	//* 443  908:fadd            
	//* 444  909:fstore          13
	//* 445  911:aload           40
	//* 446  913:iconst_4        
	//* 447  914:faload          
	//* 448  915:f2i             
	//* 449  916:istore          26
	//* 450  918:iload           26
	//* 451  920:ifeq            929
	//* 452  923:aload_3         
	//* 453  924:iload           26
	//* 454  926:invokevirtual   #1867 <Method void PdfContentByte.setLineCap(int)>
	//* 455  929:aload_3         
	//* 456  930:fload           6
	//* 457  932:fload           21
	//* 458  934:fload           13
	//* 459  936:fadd            
	//* 460  937:invokevirtual   #1870 <Method void PdfContentByte.moveTo(float, float)>
	//* 461  940:aload_3         
	//* 462  941:fload           6
	//* 463  943:fload           9
	//* 464  945:fadd            
	//* 465  946:fload           19
	//* 466  948:fsub            
	//* 467  949:fload           21
	//* 468  951:fload           13
	//* 469  953:fadd            
	//* 470  954:invokevirtual   #1873 <Method void PdfContentByte.lineTo(float, float)>
	//* 471  957:aload_3         
	//* 472  958:invokevirtual   #1876 <Method void PdfContentByte.stroke()>
	//* 473  961:aload           34
	//* 474  963:ifnull          970
	//* 475  966:aload_3         
	//* 476  967:invokevirtual   #1879 <Method void PdfContentByte.resetGrayStroke()>
	//* 477  970:iload           26
	//* 478  972:ifeq            980
	//* 479  975:aload_3         
	//* 480  976:iconst_0        
	//* 481  977:invokevirtual   #1867 <Method void PdfContentByte.setLineCap(int)>
	//* 482  980:iload           25
	//* 483  982:iconst_1        
	//* 484  983:iadd            
	//* 485  984:istore          25
	//* 486  986:goto            809
			flag = false;
	//  487  989:iconst_0        
	//  488  990:istore          23
		j = pdfline.getSeparatorCount();
		if(j > 0)
		{
			f7 = pdfline.widthLeft() / (float)j;
			f13 = f8;
			f = f1;
			f12 = f2;
			f6 = f10;
			f5 = f11;
		} else
	//* 489  992:goto            85
		{
label0:
			{
				if(!flag || j != 0)
					break label0;
	//  490  995:iload           23
	//  491  997:ifeq            1256
	//  492 1000:iload           24
	//  493 1002:ifne            1256
				if(pdfline.isNewlineSplit() && pdfline.widthLeft() >= (((float)j2 * f + (float)i) - 1.0F) * f1)
	//* 494 1005:aload_1         
	//* 495 1006:invokevirtual   #1880 <Method boolean PdfLine.isNewlineSplit()>
	//* 496 1009:ifeq            1097
	//* 497 1012:aload_1         
	//* 498 1013:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//* 499 1016:iload           28
	//* 500 1018:i2f             
	//* 501 1019:fload           5
	//* 502 1021:fmul            
	//* 503 1022:iload           22
	//* 504 1024:i2f             
	//* 505 1025:fadd            
	//* 506 1026:fconst_1        
	//* 507 1027:fsub            
	//* 508 1028:fload           6
	//* 509 1030:fmul            
	//* 510 1031:fcmpl           
	//* 511 1032:iflt            1097
				{
					if(pdfline.isRTL())
	//* 512 1035:aload_1         
	//* 513 1036:invokevirtual   #1883 <Method boolean PdfLine.isRTL()>
	//* 514 1039:ifeq            1067
						pdfcontentbyte.moveText(pdfline.widthLeft() - (((float)j2 * f + (float)i) - 1.0F) * f1, 0.0F);
	//  515 1042:aload_2         
	//  516 1043:aload_1         
	//  517 1044:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//  518 1047:iload           28
	//  519 1049:i2f             
	//  520 1050:fload           5
	//  521 1052:fmul            
	//  522 1053:iload           22
	//  523 1055:i2f             
	//  524 1056:fadd            
	//  525 1057:fconst_1        
	//  526 1058:fsub            
	//  527 1059:fload           6
	//  528 1061:fmul            
	//  529 1062:fsub            
	//  530 1063:fconst_0        
	//  531 1064:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
					f6 = f * f1;
	//  532 1067:fload           5
	//  533 1069:fload           6
	//  534 1071:fmul            
	//  535 1072:fstore          11
					f5 = f1;
	//  536 1074:fload           6
	//  537 1076:fstore          10
					f7 = f4;
	//  538 1078:fload           9
	//  539 1080:fstore          12
					f12 = f2;
	//  540 1082:fload           7
	//  541 1084:fstore          16
					f = f1;
	//  542 1086:fload           6
	//  543 1088:fstore          5
					f13 = f8;
	//  544 1090:fload           13
	//  545 1092:fstore          17
				} else
	//* 546 1094:goto            126
				{
					f6 = pdfline.widthLeft();
	//  547 1097:aload_1         
	//  548 1098:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//  549 1101:fstore          11
					obj1 = ((Object) (pdfline.getChunk(pdfline.size() - 1)));
	//  550 1103:aload_1         
	//  551 1104:aload_1         
	//  552 1105:invokevirtual   #975 <Method int PdfLine.size()>
	//  553 1108:iconst_1        
	//  554 1109:isub            
	//  555 1110:invokevirtual   #1788 <Method PdfChunk PdfLine.getChunk(int)>
	//  556 1113:astore          33
					f1 = f5;
	//  557 1115:fload           10
	//  558 1117:fstore          6
					f2 = f6;
	//  559 1119:fload           11
	//  560 1121:fstore          7
					if(obj1 != null)
	//* 561 1123:aload           33
	//* 562 1125:ifnull          1209
					{
						String s = ((PdfChunk) (obj1)).toString();
	//  563 1128:aload           33
	//  564 1130:invokevirtual   #1884 <Method String PdfChunk.toString()>
	//  565 1133:astore          34
						f1 = f5;
	//  566 1135:fload           10
	//  567 1137:fstore          6
						f2 = f6;
	//  568 1139:fload           11
	//  569 1141:fstore          7
						if(s.length() > 0)
	//* 570 1143:aload           34
	//* 571 1145:invokevirtual   #805 <Method int String.length()>
	//* 572 1148:ifle            1209
						{
							j = ((int) (s.charAt(s.length() - 1)));
	//  573 1151:aload           34
	//  574 1153:aload           34
	//  575 1155:invokevirtual   #805 <Method int String.length()>
	//  576 1158:iconst_1        
	//  577 1159:isub            
	//  578 1160:invokevirtual   #1888 <Method char String.charAt(int)>
	//  579 1163:istore          24
							f1 = f5;
	//  580 1165:fload           10
	//  581 1167:fstore          6
							f2 = f6;
	//  582 1169:fload           11
	//  583 1171:fstore          7
							if(".,;:'".indexOf(j) >= 0)
	//* 584 1173:ldc1            #22  <String ".,;:'">
	//* 585 1175:iload           24
	//* 586 1177:invokevirtual   #1892 <Method int String.indexOf(int)>
	//* 587 1180:iflt            1209
							{
								f2 = f6 + ((PdfChunk) (obj1)).font().width(j) * 0.4F;
	//  588 1183:fload           11
	//  589 1185:aload           33
	//  590 1187:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//  591 1190:iload           24
	//  592 1192:invokevirtual   #1896 <Method float PdfFont.width(int)>
	//  593 1195:ldc2            #1897 <Float 0.4F>
	//  594 1198:fmul            
	//  595 1199:fadd            
	//  596 1200:fstore          7
								f1 = f2 - f6;
	//  597 1202:fload           7
	//  598 1204:fload           11
	//  599 1206:fsub            
	//  600 1207:fstore          6
							}
						}
					}
					f2 /= ((float)j2 * f + (float)i) - 1.0F;
	//  601 1209:fload           7
	//  602 1211:iload           28
	//  603 1213:i2f             
	//  604 1214:fload           5
	//  605 1216:fmul            
	//  606 1217:iload           22
	//  607 1219:i2f             
	//  608 1220:fadd            
	//  609 1221:fconst_1        
	//  610 1222:fsub            
	//  611 1223:fdiv            
	//  612 1224:fstore          7
					f6 = f * f2;
	//  613 1226:fload           5
	//  614 1228:fload           7
	//  615 1230:fmul            
	//  616 1231:fstore          11
					f5 = f2;
	//  617 1233:fload           7
	//  618 1235:fstore          10
					f = f2;
	//  619 1237:fload           7
	//  620 1239:fstore          5
					f7 = f4;
	//  621 1241:fload           9
	//  622 1243:fstore          12
					f12 = f1;
	//  623 1245:fload           6
	//  624 1247:fstore          16
					f13 = f8;
	//  625 1249:fload           13
	//  626 1251:fstore          17
				}
			}
		}
_L4:
		k2 = pdfline.getLastStrokeChunk();
		j = 0;
		f17 = pdfcontentbyte.getXTLM();
		f18 = pdfcontentbyte.getYTLM();
		i = 0;
		flag3 = false;
		iterator = pdfline.iterator();
		f2 = 0.0F;
		f1 = f17;
		  goto _L1
	//* 627 1253:goto            126
		if(pdfline.alignment == 0) goto _L3; else goto _L2
	//  628 1256:aload_1         
	//  629 1257:getfield        #1898 <Field int PdfLine.alignment>
	//  630 1260:ifeq            1295
_L2:
		f5 = f11;
	//  631 1263:fload           15
	//  632 1265:fstore          10
		f6 = f10;
	//  633 1267:fload           14
	//  634 1269:fstore          11
		f7 = f4;
	//  635 1271:fload           9
	//  636 1273:fstore          12
		f12 = f2;
	//  637 1275:fload           7
	//  638 1277:fstore          16
		f = f1;
	//  639 1279:fload           6
	//  640 1281:fstore          5
		f13 = f8;
	//  641 1283:fload           13
	//  642 1285:fstore          17
		if(pdfline.alignment != -1) goto _L4; else goto _L3
	//  643 1287:aload_1         
	//  644 1288:getfield        #1898 <Field int PdfLine.alignment>
	//  645 1291:iconst_m1       
	//  646 1292:icmpne          126
_L3:
		f13 = f8 - pdfline.widthLeft();
	//  647 1295:fload           13
	//  648 1297:aload_1         
	//  649 1298:invokevirtual   #463 <Method float PdfLine.widthLeft()>
	//  650 1301:fsub            
	//  651 1302:fstore          17
		f5 = f11;
	//  652 1304:fload           15
	//  653 1306:fstore          10
		f6 = f10;
	//  654 1308:fload           14
	//  655 1310:fstore          11
		f7 = f4;
	//  656 1312:fload           9
	//  657 1314:fstore          12
		f12 = f2;
	//  658 1316:fload           7
	//  659 1318:fstore          16
		f = f1;
	//  660 1320:fload           6
	//  661 1322:fstore          5
		  goto _L4
	//* 662 1324:goto            126
	//* 663 1327:aload           37
	//* 664 1329:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//* 665 1332:invokevirtual   #1901 <Method BaseFont PdfFont.getFont()>
	//* 666 1335:iconst_1        
	//* 667 1336:fload           18
	//* 668 1338:invokevirtual   #1907 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 669 1341:fstore          14
	//* 670 1343:aload           37
	//* 671 1345:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//* 672 1348:invokevirtual   #1901 <Method BaseFont PdfFont.getFont()>
	//* 673 1351:iconst_3        
	//* 674 1352:fload           18
	//* 675 1354:invokevirtual   #1907 <Method float BaseFont.getFontDescriptor(int, float)>
	//* 676 1357:fstore          15
	//* 677 1359:goto            268
	//* 678 1362:aload           37
	//* 679 1364:invokevirtual   #1909 <Method float PdfChunk.width()>
	//* 680 1367:fstore          9
	//* 681 1369:goto            291
	//* 682 1372:aload           35
	//* 683 1374:aload_3         
	//* 684 1375:fload           6
	//* 685 1377:fload           21
	//* 686 1379:fload           15
	//* 687 1381:fadd            
	//* 688 1382:fload           6
	//* 689 1384:fload           9
	//* 690 1386:fadd            
	//* 691 1387:fload           14
	//* 692 1389:fload           15
	//* 693 1391:fsub            
	//* 694 1392:fload           21
	//* 695 1394:invokeinterface #732 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//* 696 1399:goto            388
	//* 697 1402:fload           6
	//* 698 1404:fstore          7
	//* 699 1406:goto            472
	//* 700 1409:aload           37
	//* 701 1411:ldc2            #1911 <String "TAB">
	//* 702 1414:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 703 1417:checkcast       #1799 <Class Object[]>
	//* 704 1420:checkcast       #1799 <Class Object[]>
	//* 705 1423:astore          34
	//* 706 1425:aload           34
	//* 707 1427:iconst_0        
	//* 708 1428:aaload          
	//* 709 1429:checkcast       #727 <Class DrawInterface>
	//* 710 1432:astore          35
	//* 711 1434:aload           34
	//* 712 1436:iconst_1        
	//* 713 1437:aaload          
	//* 714 1438:checkcast       #1174 <Class Float>
	//* 715 1441:invokevirtual   #1181 <Method float Float.floatValue()>
	//* 716 1444:aload           34
	//* 717 1446:iconst_3        
	//* 718 1447:aaload          
	//* 719 1448:checkcast       #1174 <Class Float>
	//* 720 1451:invokevirtual   #1181 <Method float Float.floatValue()>
	//* 721 1454:fadd            
	//* 722 1455:fstore          13
	//* 723 1457:fload           13
	//* 724 1459:fstore          7
	//* 725 1461:fload           13
	//* 726 1463:fload           6
	//* 727 1465:fcmpl           
	//* 728 1466:ifle            472
	//* 729 1469:aload           35
	//* 730 1471:aload_3         
	//* 731 1472:fload           6
	//* 732 1474:fload           21
	//* 733 1476:fload           15
	//* 734 1478:fadd            
	//* 735 1479:fload           13
	//* 736 1481:fload           14
	//* 737 1483:fload           15
	//* 738 1485:fsub            
	//* 739 1486:fload           21
	//* 740 1488:invokeinterface #732 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//* 741 1493:fload           13
	//* 742 1495:fstore          7
	//* 743 1497:goto            472
		pdfcontentbyte1.setLineWidth(1.0F);
	//  744 1500:aload_3         
	//  745 1501:fconst_1        
	//  746 1502:invokevirtual   #1864 <Method void PdfContentByte.setLineWidth(float)>
		if(flag3 && isTagged(writer))
	//* 747 1505:iload           31
	//* 748 1507:ifeq            1525
	//* 749 1510:aload_0         
	//* 750 1511:getfield        #256 <Field PdfWriter writer>
	//* 751 1514:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 752 1517:ifeq            1525
			pdfcontentbyte1.beginText(true);
	//  753 1520:aload_3         
	//  754 1521:iconst_1        
	//  755 1522:invokevirtual   #1854 <Method void PdfContentByte.beginText(boolean)>
		float f16;
		Object obj3;
		if(pdfchunk.isAttribute("ACTION"))
	//* 756 1525:aload           37
	//* 757 1527:ldc2            #1913 <String "ACTION">
	//* 758 1530:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 759 1533:ifeq            1746
		{
			f16 = f;
	//  760 1536:fload           5
	//  761 1538:fstore          19
			f8 = f16;
	//  762 1540:fload           19
	//  763 1542:fstore          13
			if(obj6 != null)
	//* 764 1544:aload           38
	//* 765 1546:ifnull          1567
			{
				f8 = f16;
	//  766 1549:fload           19
	//  767 1551:fstore          13
				if(((PdfChunk) (obj6)).isAttribute("ACTION"))
	//* 768 1553:aload           38
	//* 769 1555:ldc2            #1913 <String "ACTION">
	//* 770 1558:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 771 1561:ifeq            1567
					f8 = 0.0F;
	//  772 1564:fconst_0        
	//  773 1565:fstore          13
			}
			f16 = f8;
	//  774 1567:fload           13
	//  775 1569:fstore          19
			if(obj6 == null)
	//* 776 1571:aload           38
	//* 777 1573:ifnonnull       1583
				f16 = f8 + f12;
	//  778 1576:fload           13
	//  779 1578:fload           16
	//  780 1580:fadd            
	//  781 1581:fstore          19
			boolean flag1;
			int i1;
			int k1;
			Object aobj4[];
			if(pdfchunk.isImage())
	//* 782 1583:aload           37
	//* 783 1585:invokevirtual   #1776 <Method boolean PdfChunk.isImage()>
	//* 784 1588:ifeq            3076
				obj3 = ((Object) (writer.createAnnotation(f1, f18 + pdfchunk.getImageOffsetY(), (f1 + f4) - f16, pdfchunk.getImageHeight() + f18 + pdfchunk.getImageOffsetY(), (PdfAction)pdfchunk.getAttribute("ACTION"), ((PdfName) (null)))));
	//  785 1591:aload_0         
	//  786 1592:getfield        #256 <Field PdfWriter writer>
	//  787 1595:fload           6
	//  788 1597:fload           21
	//  789 1599:aload           37
	//  790 1601:invokevirtual   #1916 <Method float PdfChunk.getImageOffsetY()>
	//  791 1604:fadd            
	//  792 1605:fload           6
	//  793 1607:fload           9
	//  794 1609:fadd            
	//  795 1610:fload           19
	//  796 1612:fsub            
	//  797 1613:aload           37
	//  798 1615:invokevirtual   #1919 <Method float PdfChunk.getImageHeight()>
	//  799 1618:fload           21
	//  800 1620:fadd            
	//  801 1621:aload           37
	//  802 1623:invokevirtual   #1916 <Method float PdfChunk.getImageOffsetY()>
	//  803 1626:fadd            
	//  804 1627:aload           37
	//  805 1629:ldc2            #1913 <String "ACTION">
	//  806 1632:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//  807 1635:checkcast       #446 <Class PdfAction>
	//  808 1638:aconst_null     
	//  809 1639:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	//  810 1642:astore          34
			else
	//* 811 1644:aload_2         
	//* 812 1645:aload           34
	//* 813 1647:iconst_1        
	//* 814 1648:invokevirtual   #1922 <Method void PdfContentByte.addAnnotation(PdfAnnotation, boolean)>
	//* 815 1651:aload_0         
	//* 816 1652:getfield        #256 <Field PdfWriter writer>
	//* 817 1655:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//* 818 1658:ifeq            1746
	//* 819 1661:aload           37
	//* 820 1663:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//* 821 1666:ifnull          1746
	//* 822 1669:aload_0         
	//* 823 1670:aload           37
	//* 824 1672:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//* 825 1675:invokeinterface #1927 <Method AccessibleElementId IAccessibleElement.getId()>
	//* 826 1680:invokevirtual   #1929 <Method PdfStructureElement getStructElement(AccessibleElementId)>
	//* 827 1683:astore          35
	//* 828 1685:aload           35
	//* 829 1687:ifnull          1746
	//* 830 1690:aload_0         
	//* 831 1691:aload           34
	//* 832 1693:invokevirtual   #1121 <Method int getStructParentIndex(Object)>
	//* 833 1696:istore          25
	//* 834 1698:aload           34
	//* 835 1700:getstatic       #1932 <Field PdfName PdfName.STRUCTPARENT>
	//* 836 1703:new             #1114 <Class PdfNumber>
	//* 837 1706:dup             
	//* 838 1707:iload           25
	//* 839 1709:invokespecial   #1122 <Method void PdfNumber(int)>
	//* 840 1712:invokevirtual   #1935 <Method void PdfAnnotation.put(PdfName, PdfObject)>
	//* 841 1715:aload           35
	//* 842 1717:aload           34
	//* 843 1719:aload_0         
	//* 844 1720:getfield        #256 <Field PdfWriter writer>
	//* 845 1723:invokevirtual   #1117 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//* 846 1726:invokevirtual   #1939 <Method void PdfStructureElement.setAnnotation(PdfAnnotation, PdfIndirectReference)>
	//* 847 1729:aload_0         
	//* 848 1730:getfield        #256 <Field PdfWriter writer>
	//* 849 1733:invokevirtual   #1421 <Method PdfStructureTreeRoot PdfWriter.getStructureTreeRoot()>
	//* 850 1736:iload           25
	//* 851 1738:aload           35
	//* 852 1740:invokevirtual   #1940 <Method PdfIndirectReference PdfStructureElement.getReference()>
	//* 853 1743:invokevirtual   #1946 <Method void PdfStructureTreeRoot.setAnnotationMark(int, PdfIndirectReference)>
	//* 854 1746:aload           37
	//* 855 1748:ldc2            #1948 <String "REMOTEGOTO">
	//* 856 1751:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 857 1754:ifeq            1884
	//* 858 1757:fload           5
	//* 859 1759:fstore          19
	//* 860 1761:fload           19
	//* 861 1763:fstore          13
	//* 862 1765:aload           38
	//* 863 1767:ifnull          1788
	//* 864 1770:fload           19
	//* 865 1772:fstore          13
	//* 866 1774:aload           38
	//* 867 1776:ldc2            #1948 <String "REMOTEGOTO">
	//* 868 1779:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 869 1782:ifeq            1788
	//* 870 1785:fconst_0        
	//* 871 1786:fstore          13
	//* 872 1788:fload           13
	//* 873 1790:fstore          19
	//* 874 1792:aload           38
	//* 875 1794:ifnonnull       1804
	//* 876 1797:fload           13
	//* 877 1799:fload           16
	//* 878 1801:fadd            
	//* 879 1802:fstore          19
	//* 880 1804:aload           37
	//* 881 1806:ldc2            #1948 <String "REMOTEGOTO">
	//* 882 1809:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 883 1812:checkcast       #1799 <Class Object[]>
	//* 884 1815:checkcast       #1799 <Class Object[]>
	//* 885 1818:astore          34
	//* 886 1820:aload           34
	//* 887 1822:iconst_0        
	//* 888 1823:aaload          
	//* 889 1824:checkcast       #802 <Class String>
	//* 890 1827:astore          35
	//* 891 1829:aload           34
	//* 892 1831:iconst_1        
	//* 893 1832:aaload          
	//* 894 1833:instanceof      #802 <Class String>
	//* 895 1836:ifeq            3132
	//* 896 1839:aload_0         
	//* 897 1840:aload           35
	//* 898 1842:aload           34
	//* 899 1844:iconst_1        
	//* 900 1845:aaload          
	//* 901 1846:checkcast       #802 <Class String>
	//* 902 1849:fload           6
	//* 903 1851:fload           21
	//* 904 1853:fload           15
	//* 905 1855:fadd            
	//* 906 1856:aload           37
	//* 907 1858:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	//* 908 1861:fadd            
	//* 909 1862:fload           6
	//* 910 1864:fload           9
	//* 911 1866:fadd            
	//* 912 1867:fload           19
	//* 913 1869:fsub            
	//* 914 1870:fload           21
	//* 915 1872:fload           14
	//* 916 1874:fadd            
	//* 917 1875:aload           37
	//* 918 1877:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	//* 919 1880:fadd            
	//* 920 1881:invokevirtual   #1950 <Method void remoteGoto(String, String, float, float, float, float)>
	//* 921 1884:aload           37
	//* 922 1886:ldc2            #1952 <String "LOCALGOTO">
	//* 923 1889:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 924 1892:ifeq            1974
	//* 925 1895:fload           5
	//* 926 1897:fstore          19
	//* 927 1899:fload           19
	//* 928 1901:fstore          13
	//* 929 1903:aload           38
	//* 930 1905:ifnull          1926
	//* 931 1908:fload           19
	//* 932 1910:fstore          13
	//* 933 1912:aload           38
	//* 934 1914:ldc2            #1952 <String "LOCALGOTO">
	//* 935 1917:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 936 1920:ifeq            1926
	//* 937 1923:fconst_0        
	//* 938 1924:fstore          13
	//* 939 1926:fload           13
	//* 940 1928:fstore          19
	//* 941 1930:aload           38
	//* 942 1932:ifnonnull       1942
	//* 943 1935:fload           13
	//* 944 1937:fload           16
	//* 945 1939:fadd            
	//* 946 1940:fstore          19
	//* 947 1942:aload_0         
	//* 948 1943:aload           37
	//* 949 1945:ldc2            #1952 <String "LOCALGOTO">
	//* 950 1948:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 951 1951:checkcast       #802 <Class String>
	//* 952 1954:fload           6
	//* 953 1956:fload           21
	//* 954 1958:fload           6
	//* 955 1960:fload           9
	//* 956 1962:fadd            
	//* 957 1963:fload           19
	//* 958 1965:fsub            
	//* 959 1966:fload           21
	//* 960 1968:fload           18
	//* 961 1970:fadd            
	//* 962 1971:invokevirtual   #1954 <Method void localGoto(String, float, float, float, float)>
	//* 963 1974:aload           37
	//* 964 1976:ldc2            #1956 <String "LOCALDESTINATION">
	//* 965 1979:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 966 1982:ifeq            2017
	//* 967 1985:aload_0         
	//* 968 1986:aload           37
	//* 969 1988:ldc2            #1956 <String "LOCALDESTINATION">
	//* 970 1991:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//* 971 1994:checkcast       #802 <Class String>
	//* 972 1997:new             #615 <Class PdfDestination>
	//* 973 2000:dup             
	//* 974 2001:iconst_0        
	//* 975 2002:fload           6
	//* 976 2004:fload           21
	//* 977 2006:fload           18
	//* 978 2008:fadd            
	//* 979 2009:fconst_0        
	//* 980 2010:invokespecial   #1959 <Method void PdfDestination(int, float, float, float)>
	//* 981 2013:invokevirtual   #893 <Method boolean localDestination(String, PdfDestination)>
	//* 982 2016:pop             
	//* 983 2017:aload           37
	//* 984 2019:ldc2            #1961 <String "GENERICTAG">
	//* 985 2022:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 986 2025:ifeq            2140
	//* 987 2028:fload           5
	//* 988 2030:fstore          19
	//* 989 2032:fload           19
	//* 990 2034:fstore          13
	//* 991 2036:aload           38
	//* 992 2038:ifnull          2059
	//* 993 2041:fload           19
	//* 994 2043:fstore          13
	//* 995 2045:aload           38
	//* 996 2047:ldc2            #1961 <String "GENERICTAG">
	//* 997 2050:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//* 998 2053:ifeq            2059
	//* 999 2056:fconst_0        
	//*1000 2057:fstore          13
	//*1001 2059:fload           13
	//*1002 2061:fstore          19
	//*1003 2063:aload           38
	//*1004 2065:ifnonnull       2075
	//*1005 2068:fload           13
	//*1006 2070:fload           16
	//*1007 2072:fadd            
	//*1008 2073:fstore          19
	//*1009 2075:new             #458 <Class Rectangle>
	//*1010 2078:dup             
	//*1011 2079:fload           6
	//*1012 2081:fload           21
	//*1013 2083:fload           6
	//*1014 2085:fload           9
	//*1015 2087:fadd            
	//*1016 2088:fload           19
	//*1017 2090:fsub            
	//*1018 2091:fload           21
	//*1019 2093:fload           18
	//*1020 2095:fadd            
	//*1021 2096:invokespecial   #479 <Method void Rectangle(float, float, float, float)>
	//*1022 2099:astore          34
	//*1023 2101:aload_0         
	//*1024 2102:getfield        #256 <Field PdfWriter writer>
	//*1025 2105:invokevirtual   #532 <Method PdfPageEvent PdfWriter.getPageEvent()>
	//*1026 2108:astore          35
	//*1027 2110:aload           35
	//*1028 2112:ifnull          2140
	//*1029 2115:aload           35
	//*1030 2117:aload_0         
	//*1031 2118:getfield        #256 <Field PdfWriter writer>
	//*1032 2121:aload_0         
	//*1033 2122:aload           34
	//*1034 2124:aload           37
	//*1035 2126:ldc2            #1961 <String "GENERICTAG">
	//*1036 2129:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1037 2132:checkcast       #802 <Class String>
	//*1038 2135:invokeinterface #1965 <Method void PdfPageEvent.onGenericTag(PdfWriter, Document, Rectangle, String)>
	//*1039 2140:aload           37
	//*1040 2142:ldc2            #1967 <String "PDFANNOTATION">
	//*1041 2145:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1042 2148:ifeq            2256
	//*1043 2151:fload           5
	//*1044 2153:fstore          18
	//*1045 2155:fload           18
	//*1046 2157:fstore          13
	//*1047 2159:aload           38
	//*1048 2161:ifnull          2182
	//*1049 2164:fload           18
	//*1050 2166:fstore          13
	//*1051 2168:aload           38
	//*1052 2170:ldc2            #1967 <String "PDFANNOTATION">
	//*1053 2173:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1054 2176:ifeq            2182
	//*1055 2179:fconst_0        
	//*1056 2180:fstore          13
	//*1057 2182:fload           13
	//*1058 2184:fstore          18
	//*1059 2186:aload           38
	//*1060 2188:ifnonnull       2198
	//*1061 2191:fload           13
	//*1062 2193:fload           16
	//*1063 2195:fadd            
	//*1064 2196:fstore          18
	//*1065 2198:aload           37
	//*1066 2200:ldc2            #1967 <String "PDFANNOTATION">
	//*1067 2203:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1068 2206:checkcast       #1934 <Class PdfAnnotation>
	//*1069 2209:invokestatic    #1973 <Method PdfAnnotation PdfFormField.shallowDuplicate(PdfAnnotation)>
	//*1070 2212:astore          34
	//*1071 2214:aload           34
	//*1072 2216:getstatic       #1976 <Field PdfName PdfName.RECT>
	//*1073 2219:new             #1074 <Class PdfRectangle>
	//*1074 2222:dup             
	//*1075 2223:fload           6
	//*1076 2225:fload           21
	//*1077 2227:fload           15
	//*1078 2229:fadd            
	//*1079 2230:fload           6
	//*1080 2232:fload           9
	//*1081 2234:fadd            
	//*1082 2235:fload           18
	//*1083 2237:fsub            
	//*1084 2238:fload           21
	//*1085 2240:fload           14
	//*1086 2242:fadd            
	//*1087 2243:invokespecial   #1977 <Method void PdfRectangle(float, float, float, float)>
	//*1088 2246:invokevirtual   #1935 <Method void PdfAnnotation.put(PdfName, PdfObject)>
	//*1089 2249:aload_2         
	//*1090 2250:aload           34
	//*1091 2252:iconst_1        
	//*1092 2253:invokevirtual   #1922 <Method void PdfContentByte.addAnnotation(PdfAnnotation, boolean)>
	//*1093 2256:aload           37
	//*1094 2258:ldc2            #1979 <String "SKEW">
	//*1095 2261:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1096 2264:checkcast       #1838 <Class float[]>
	//*1097 2267:checkcast       #1838 <Class float[]>
	//*1098 2270:astore          34
	//*1099 2272:aload           37
	//*1100 2274:ldc2            #1981 <String "HSCALE">
	//*1101 2277:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1102 2280:checkcast       #1174 <Class Float>
	//*1103 2283:astore          35
	//*1104 2285:aload           34
	//*1105 2287:ifnonnull       2295
	//*1106 2290:aload           35
	//*1107 2292:ifnull          3642
	//*1108 2295:fconst_0        
	//*1109 2296:fstore          13
	//*1110 2298:fconst_0        
	//*1111 2299:fstore          14
	//*1112 2301:aload           34
	//*1113 2303:ifnull          2318
	//*1114 2306:aload           34
	//*1115 2308:iconst_0        
	//*1116 2309:faload          
	//*1117 2310:fstore          13
	//*1118 2312:aload           34
	//*1119 2314:iconst_1        
	//*1120 2315:faload          
	//*1121 2316:fstore          14
	//*1122 2318:aload           35
	//*1123 2320:ifnull          3636
	//*1124 2323:aload           35
	//*1125 2325:invokevirtual   #1181 <Method float Float.floatValue()>
	//*1126 2328:fstore          15
	//*1127 2330:aload_2         
	//*1128 2331:fload           15
	//*1129 2333:fload           13
	//*1130 2335:fload           14
	//*1131 2337:fconst_1        
	//*1132 2338:fload           6
	//*1133 2340:fload           21
	//*1134 2342:invokevirtual   #1984 <Method void PdfContentByte.setTextMatrix(float, float, float, float, float, float)>
	//*1135 2345:iload           23
	//*1136 2347:ifne            2408
	//*1137 2350:aload           37
	//*1138 2352:ldc2            #1986 <String "WORD_SPACING">
	//*1139 2355:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1140 2358:ifeq            2379
	//*1141 2361:aload_2         
	//*1142 2362:aload           37
	//*1143 2364:ldc2            #1986 <String "WORD_SPACING">
	//*1144 2367:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1145 2370:checkcast       #1174 <Class Float>
	//*1146 2373:invokevirtual   #1181 <Method float Float.floatValue()>
	//*1147 2376:invokevirtual   #1989 <Method void PdfContentByte.setWordSpacing(float)>
	//*1148 2379:aload           37
	//*1149 2381:ldc2            #1991 <String "CHAR_SPACING">
	//*1150 2384:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1151 2387:ifeq            2408
	//*1152 2390:aload_2         
	//*1153 2391:aload           37
	//*1154 2393:ldc2            #1991 <String "CHAR_SPACING">
	//*1155 2396:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1156 2399:checkcast       #1174 <Class Float>
	//*1157 2402:invokevirtual   #1181 <Method float Float.floatValue()>
	//*1158 2405:invokevirtual   #1994 <Method void PdfContentByte.setCharacterSpacing(float)>
	//*1159 2408:fload           6
	//*1160 2410:fstore          18
	//*1161 2412:fload           7
	//*1162 2414:fstore          13
	//*1163 2416:fload           15
	//*1164 2418:fstore          14
	//*1165 2420:aload           37
	//*1166 2422:invokevirtual   #1776 <Method boolean PdfChunk.isImage()>
	//*1167 2425:ifeq            2603
	//*1168 2428:aload           37
	//*1169 2430:invokevirtual   #1998 <Method Image PdfChunk.getImage()>
	//*1170 2433:astore          34
	//*1171 2435:aload           37
	//*1172 2437:invokevirtual   #2001 <Method float PdfChunk.getImageWidth()>
	//*1173 2440:fstore          9
	//*1174 2442:aload           34
	//*1175 2444:aload           37
	//*1176 2446:invokevirtual   #2004 <Method float PdfChunk.getImageScalePercentage()>
	//*1177 2449:invokevirtual   #2007 <Method float[] Image.matrix(float)>
	//*1178 2452:astore          35
	//*1179 2454:aload           35
	//*1180 2456:iconst_4        
	//*1181 2457:aload           37
	//*1182 2459:invokevirtual   #2010 <Method float PdfChunk.getImageOffsetX()>
	//*1183 2462:fload           6
	//*1184 2464:fadd            
	//*1185 2465:aload           35
	//*1186 2467:iconst_4        
	//*1187 2468:faload          
	//*1188 2469:fsub            
	//*1189 2470:fastore         
	//*1190 2471:aload           35
	//*1191 2473:iconst_5        
	//*1192 2474:aload           37
	//*1193 2476:invokevirtual   #1916 <Method float PdfChunk.getImageOffsetY()>
	//*1194 2479:fload           21
	//*1195 2481:fadd            
	//*1196 2482:aload           35
	//*1197 2484:iconst_5        
	//*1198 2485:faload          
	//*1199 2486:fsub            
	//*1200 2487:fastore         
	//*1201 2488:iconst_0        
	//*1202 2489:istore          26
	//*1203 2491:iload           26
	//*1204 2493:istore          25
	//*1205 2495:aload_3         
	//*1206 2496:invokevirtual   #1827 <Method boolean PdfContentByte.getInText()>
	//*1207 2499:ifeq            2521
	//*1208 2502:iload           26
	//*1209 2504:istore          25
	//*1210 2506:aload           34
	//*1211 2508:instanceof      #2012 <Class ImgTemplate>
	//*1212 2511:ifne            2521
	//*1213 2514:iconst_1        
	//*1214 2515:istore          25
	//*1215 2517:aload_3         
	//*1216 2518:invokevirtual   #1128 <Method void PdfContentByte.endText()>
	//*1217 2521:aload_3         
	//*1218 2522:aload           34
	//*1219 2524:aload           35
	//*1220 2526:iconst_0        
	//*1221 2527:faload          
	//*1222 2528:f2d             
	//*1223 2529:aload           35
	//*1224 2531:iconst_1        
	//*1225 2532:faload          
	//*1226 2533:f2d             
	//*1227 2534:aload           35
	//*1228 2536:iconst_2        
	//*1229 2537:faload          
	//*1230 2538:f2d             
	//*1231 2539:aload           35
	//*1232 2541:iconst_3        
	//*1233 2542:faload          
	//*1234 2543:f2d             
	//*1235 2544:aload           35
	//*1236 2546:iconst_4        
	//*1237 2547:faload          
	//*1238 2548:f2d             
	//*1239 2549:aload           35
	//*1240 2551:iconst_5        
	//*1241 2552:faload          
	//*1242 2553:f2d             
	//*1243 2554:iconst_0        
	//*1244 2555:iload           30
	//*1245 2557:invokevirtual   #2015 <Method void PdfContentByte.addImage(Image, double, double, double, double, double, double, boolean, boolean)>
	//*1246 2560:iload           25
	//*1247 2562:ifeq            2570
	//*1248 2565:aload_3         
	//*1249 2566:iconst_1        
	//*1250 2567:invokevirtual   #1854 <Method void PdfContentByte.beginText(boolean)>
	//*1251 2570:aload_2         
	//*1252 2571:fload           6
	//*1253 2573:fload           5
	//*1254 2575:fadd            
	//*1255 2576:aload           37
	//*1256 2578:invokevirtual   #2001 <Method float PdfChunk.getImageWidth()>
	//*1257 2581:fadd            
	//*1258 2582:aload_2         
	//*1259 2583:invokevirtual   #1225 <Method float PdfContentByte.getXTLM()>
	//*1260 2586:fsub            
	//*1261 2587:fconst_0        
	//*1262 2588:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//*1263 2591:fload           15
	//*1264 2593:fstore          14
	//*1265 2595:fload           7
	//*1266 2597:fstore          13
	//*1267 2599:fload           6
	//*1268 2601:fstore          18
	//*1269 2603:fload           18
	//*1270 2605:fload           9
	//*1271 2607:fadd            
	//*1272 2608:fstore          7
	//*1273 2610:iload           24
	//*1274 2612:iconst_1        
	//*1275 2613:iadd            
	//*1276 2614:istore          24
	//*1277 2616:fload           14
	//*1278 2618:fstore          6
	//*1279 2620:fload           13
	//*1280 2622:fstore          9
	//*1281 2624:aload           32
	//*1282 2626:astore          34
	//*1283 2628:aload           37
	//*1284 2630:invokevirtual   #1776 <Method boolean PdfChunk.isImage()>
	//*1285 2633:ifne            2674
	//*1286 2636:aload           32
	//*1287 2638:astore          34
	//*1288 2640:aload           37
	//*1289 2642:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//*1290 2645:aload           32
	//*1291 2647:invokevirtual   #2019 <Method int PdfFont.compareTo(PdfFont)>
	//*1292 2650:ifeq            2674
	//*1293 2653:aload           37
	//*1294 2655:invokevirtual   #1771 <Method PdfFont PdfChunk.font()>
	//*1295 2658:astore          34
	//*1296 2660:aload_2         
	//*1297 2661:aload           34
	//*1298 2663:invokevirtual   #1901 <Method BaseFont PdfFont.getFont()>
	//*1299 2666:aload           34
	//*1300 2668:invokevirtual   #1773 <Method float PdfFont.size()>
	//*1301 2671:invokevirtual   #2023 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
	//*1302 2674:fconst_0        
	//*1303 2675:fstore          15
	//*1304 2677:aload           37
	//*1305 2679:ldc2            #2025 <String "TEXTRENDERMODE">
	//*1306 2682:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1307 2685:checkcast       #1799 <Class Object[]>
	//*1308 2688:checkcast       #1799 <Class Object[]>
	//*1309 2691:astore          39
	//*1310 2693:iconst_0        
	//*1311 2694:istore          25
	//*1312 2696:fconst_1        
	//*1313 2697:fstore          13
	//*1314 2699:aconst_null     
	//*1315 2700:astore          32
	//*1316 2702:aload           37
	//*1317 2704:ldc2            #2027 <String "SUBSUPSCRIPT">
	//*1318 2707:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	//*1319 2710:checkcast       #1174 <Class Float>
	//*1320 2713:astore          38
	//*1321 2715:aload           32
	//*1322 2717:astore          35
	//*1323 2719:fload           13
	//*1324 2721:fstore          14
	//*1325 2723:aload           39
	//*1326 2725:ifnull          2859
	//*1327 2728:aload           39
	//*1328 2730:iconst_0        
	//*1329 2731:aaload          
	//*1330 2732:checkcast       #2029 <Class Integer>
	//*1331 2735:invokevirtual   #2032 <Method int Integer.intValue()>
	//*1332 2738:iconst_3        
	//*1333 2739:iand            
	//*1334 2740:istore          26
	//*1335 2742:iload           26
	//*1336 2744:ifeq            2753
	//*1337 2747:aload_2         
	//*1338 2748:iload           26
	//*1339 2750:invokevirtual   #2035 <Method void PdfContentByte.setTextRenderingMode(int)>
	//*1340 2753:iload           26
	//*1341 2755:iconst_1        
	//*1342 2756:icmpeq          2777
	//*1343 2759:aload           32
	//*1344 2761:astore          35
	//*1345 2763:fload           13
	//*1346 2765:fstore          14
	//*1347 2767:iload           26
	//*1348 2769:istore          25
	//*1349 2771:iload           26
	//*1350 2773:iconst_2        
	//*1351 2774:icmpne          2859
	//*1352 2777:aload           39
	//*1353 2779:iconst_1        
	//*1354 2780:aaload          
	//*1355 2781:checkcast       #1174 <Class Float>
	//*1356 2784:invokevirtual   #1181 <Method float Float.floatValue()>
	//*1357 2787:fstore          13
	//*1358 2789:fload           13
	//*1359 2791:fconst_1        
	//*1360 2792:fcmpl           
	//*1361 2793:ifeq            2802
	//*1362 2796:aload_2         
	//*1363 2797:fload           13
	//*1364 2799:invokevirtual   #1864 <Method void PdfContentByte.setLineWidth(float)>
	//*1365 2802:aload           39
	//*1366 2804:iconst_2        
	//*1367 2805:aaload          
	//*1368 2806:checkcast       #1832 <Class BaseColor>
	//*1369 2809:astore          35
	//*1370 2811:aload           35
	//*1371 2813:astore          32
	//*1372 2815:aload           35
	//*1373 2817:ifnonnull       2824
	//*1374 2820:aload           33
	//*1375 2822:astore          32
	//*1376 2824:aload           32
	//*1377 2826:astore          35
	//*1378 2828:fload           13
	//*1379 2830:fstore          14
	//*1380 2832:iload           26
	//*1381 2834:istore          25
	//*1382 2836:aload           32
	//*1383 2838:ifnull          2859
	//*1384 2841:aload_2         
	//*1385 2842:aload           32
	//*1386 2844:invokevirtual   #1861 <Method void PdfContentByte.setColorStroke(BaseColor)>
	//*1387 2847:iload           26
	//*1388 2849:istore          25
	//*1389 2851:fload           13
	//*1390 2853:fstore          14
	//*1391 2855:aload           32
	//*1392 2857:astore          35
	//*1393 2859:aload           38
	//*1394 2861:ifnull          2871
	//*1395 2864:aload           38
	//*1396 2866:invokevirtual   #1181 <Method float Float.floatValue()>
	//*1397 2869:fstore          15
	//*1398 2871:aload           33
	//*1399 2873:ifnull          2882
	//*1400 2876:aload_2         
	//*1401 2877:aload           33
	//*1402 2879:invokevirtual   #1836 <Method void PdfContentByte.setColorFill(BaseColor)>
	//*1403 2882:fload           15
	//*1404 2884:fconst_0        
	//*1405 2885:fcmpl           
	//*1406 2886:ifeq            2895
	//*1407 2889:aload_2         
	//*1408 2890:fload           15
	//*1409 2892:invokevirtual   #2038 <Method void PdfContentByte.setTextRise(float)>
	//*1410 2895:aload           37
	//*1411 2897:invokevirtual   #1776 <Method boolean PdfChunk.isImage()>
	//*1412 2900:ifeq            3183
	//*1413 2903:iconst_1        
	//*1414 2904:istore          22
	//*1415 2906:fload           15
	//*1416 2908:fconst_0        
	//*1417 2909:fcmpl           
	//*1418 2910:ifeq            2918
	//*1419 2913:aload_2         
	//*1420 2914:fconst_0        
	//*1421 2915:invokevirtual   #2038 <Method void PdfContentByte.setTextRise(float)>
	//*1422 2918:aload           33
	//*1423 2920:ifnull          2927
	//*1424 2923:aload_2         
	//*1425 2924:invokevirtual   #2041 <Method void PdfContentByte.resetRGBColorFill()>
	//*1426 2927:iload           25
	//*1427 2929:ifeq            2937
	//*1428 2932:aload_2         
	//*1429 2933:iconst_0        
	//*1430 2934:invokevirtual   #2035 <Method void PdfContentByte.setTextRenderingMode(int)>
	//*1431 2937:aload           35
	//*1432 2939:ifnull          2946
	//*1433 2942:aload_2         
	//*1434 2943:invokevirtual   #2044 <Method void PdfContentByte.resetRGBColorStroke()>
	//*1435 2946:fload           14
	//*1436 2948:fconst_1        
	//*1437 2949:fcmpl           
	//*1438 2950:ifeq            2958
	//*1439 2953:aload_2         
	//*1440 2954:fconst_1        
	//*1441 2955:invokevirtual   #1864 <Method void PdfContentByte.setLineWidth(float)>
	//*1442 2958:aload           37
	//*1443 2960:ldc2            #1979 <String "SKEW">
	//*1444 2963:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1445 2966:ifne            2980
	//*1446 2969:aload           37
	//*1447 2971:ldc2            #1981 <String "HSCALE">
	//*1448 2974:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1449 2977:ifeq            2991
	//*1450 2980:iconst_1        
	//*1451 2981:istore          22
	//*1452 2983:aload_2         
	//*1453 2984:fload           7
	//*1454 2986:fload           21
	//*1455 2988:invokevirtual   #275 <Method void PdfContentByte.setTextMatrix(float, float)>
	//*1456 2991:iload           23
	//*1457 2993:ifne            3030
	//*1458 2996:aload           37
	//*1459 2998:ldc2            #1991 <String "CHAR_SPACING">
	//*1460 3001:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1461 3004:ifeq            3013
	//*1462 3007:aload_2         
	//*1463 3008:fload           10
	//*1464 3010:invokevirtual   #1994 <Method void PdfContentByte.setCharacterSpacing(float)>
	//*1465 3013:aload           37
	//*1466 3015:ldc2            #1986 <String "WORD_SPACING">
	//*1467 3018:invokevirtual   #433 <Method boolean PdfChunk.isAttribute(String)>
	//*1468 3021:ifeq            3030
	//*1469 3024:aload_2         
	//*1470 3025:fload           11
	//*1471 3027:invokevirtual   #1989 <Method void PdfContentByte.setWordSpacing(float)>
	//*1472 3030:aload_0         
	//*1473 3031:getfield        #256 <Field PdfWriter writer>
	//*1474 3034:invokestatic    #260 <Method boolean isTagged(PdfWriter)>
	//*1475 3037:ifeq            3057
	//*1476 3040:aload           37
	//*1477 3042:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//*1478 3045:ifnull          3057
	//*1479 3048:aload_2         
	//*1480 3049:aload           37
	//*1481 3051:getfield        #1764 <Field IAccessibleElement PdfChunk.accessibleElement>
	//*1482 3054:invokevirtual   #580 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//*1483 3057:fload           7
	//*1484 3059:fstore          6
	//*1485 3061:iload           30
	//*1486 3063:istore          31
	//*1487 3065:aload           34
	//*1488 3067:astore          32
	//*1489 3069:fload           9
	//*1490 3071:fstore          7
	//*1491 3073:goto            166
				obj3 = ((Object) (writer.createAnnotation(f1, f18 + f11 + pdfchunk.getTextRise(), (f1 + f4) - f16, f18 + f10 + pdfchunk.getTextRise(), (PdfAction)pdfchunk.getAttribute("ACTION"), ((PdfName) (null)))));
	// 1492 3076:aload_0         
	// 1493 3077:getfield        #256 <Field PdfWriter writer>
	// 1494 3080:fload           6
	// 1495 3082:fload           21
	// 1496 3084:fload           15
	// 1497 3086:fadd            
	// 1498 3087:aload           37
	// 1499 3089:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	// 1500 3092:fadd            
	// 1501 3093:fload           6
	// 1502 3095:fload           9
	// 1503 3097:fadd            
	// 1504 3098:fload           19
	// 1505 3100:fsub            
	// 1506 3101:fload           21
	// 1507 3103:fload           14
	// 1508 3105:fadd            
	// 1509 3106:aload           37
	// 1510 3108:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	// 1511 3111:fadd            
	// 1512 3112:aload           37
	// 1513 3114:ldc2            #1913 <String "ACTION">
	// 1514 3117:invokevirtual   #1797 <Method Object PdfChunk.getAttribute(String)>
	// 1515 3120:checkcast       #446 <Class PdfAction>
	// 1516 3123:aconst_null     
	// 1517 3124:invokevirtual   #1521 <Method PdfAnnotation PdfWriter.createAnnotation(float, float, float, float, PdfAction, PdfName)>
	// 1518 3127:astore          34
			pdfcontentbyte.addAnnotation(((PdfAnnotation) (obj3)), true);
			if(isTagged(writer) && pdfchunk.accessibleElement != null)
			{
				PdfStructureElement pdfstructureelement = getStructElement(pdfchunk.accessibleElement.getId());
				if(pdfstructureelement != null)
				{
					int l = getStructParentIndex(obj3);
					((PdfAnnotation) (obj3)).put(PdfName.STRUCTPARENT, ((PdfObject) (new PdfNumber(l))));
					pdfstructureelement.setAnnotation(((PdfAnnotation) (obj3)), writer.getCurrentPage());
					writer.getStructureTreeRoot().setAnnotationMark(l, pdfstructureelement.getReference());
				}
			}
		}
		if(pdfchunk.isAttribute("REMOTEGOTO"))
		{
			f16 = f;
			f8 = f16;
			if(obj6 != null)
			{
				f8 = f16;
				if(((PdfChunk) (obj6)).isAttribute("REMOTEGOTO"))
					f8 = 0.0F;
			}
			f16 = f8;
			if(obj6 == null)
				f16 = f8 + f12;
			obj3 = ((Object) ((Object[])(Object[])pdfchunk.getAttribute("REMOTEGOTO")));
			Object obj5 = ((Object) ((String)obj3[0]));
			if(obj3[1] instanceof String)
				remoteGoto(((String) (obj5)), (String)obj3[1], f1, f18 + f11 + pdfchunk.getTextRise(), (f1 + f4) - f16, f18 + f10 + pdfchunk.getTextRise());
			else
	//*1519 3129:goto            1644
				remoteGoto(((String) (obj5)), ((Integer)obj3[1]).intValue(), f1, f18 + f11 + pdfchunk.getTextRise(), (f1 + f4) - f16, f18 + f10 + pdfchunk.getTextRise());
	// 1520 3132:aload_0         
	// 1521 3133:aload           35
	// 1522 3135:aload           34
	// 1523 3137:iconst_1        
	// 1524 3138:aaload          
	// 1525 3139:checkcast       #2029 <Class Integer>
	// 1526 3142:invokevirtual   #2032 <Method int Integer.intValue()>
	// 1527 3145:fload           6
	// 1528 3147:fload           21
	// 1529 3149:fload           15
	// 1530 3151:fadd            
	// 1531 3152:aload           37
	// 1532 3154:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	// 1533 3157:fadd            
	// 1534 3158:fload           6
	// 1535 3160:fload           9
	// 1536 3162:fadd            
	// 1537 3163:fload           19
	// 1538 3165:fsub            
	// 1539 3166:fload           21
	// 1540 3168:fload           14
	// 1541 3170:fadd            
	// 1542 3171:aload           37
	// 1543 3173:invokevirtual   #1841 <Method float PdfChunk.getTextRise()>
	// 1544 3176:fadd            
	// 1545 3177:invokevirtual   #2046 <Method void remoteGoto(String, int, float, float, float, float)>
		}
		if(pdfchunk.isAttribute("LOCALGOTO"))
		{
			f16 = f;
			f8 = f16;
			if(obj6 != null)
			{
				f8 = f16;
				if(((PdfChunk) (obj6)).isAttribute("LOCALGOTO"))
					f8 = 0.0F;
			}
			f16 = f8;
			if(obj6 == null)
				f16 = f8 + f12;
			localGoto((String)pdfchunk.getAttribute("LOCALGOTO"), f1, f18, (f1 + f4) - f16, f18 + f14);
		}
		if(pdfchunk.isAttribute("LOCALDESTINATION"))
			localDestination((String)pdfchunk.getAttribute("LOCALDESTINATION"), new PdfDestination(0, f1, f18 + f14, 0.0F));
		if(pdfchunk.isAttribute("GENERICTAG"))
		{
			f16 = f;
			f8 = f16;
			if(obj6 != null)
			{
				f8 = f16;
				if(((PdfChunk) (obj6)).isAttribute("GENERICTAG"))
					f8 = 0.0F;
			}
			f16 = f8;
			if(obj6 == null)
				f16 = f8 + f12;
			obj3 = ((Object) (new Rectangle(f1, f18, (f1 + f4) - f16, f18 + f14)));
			obj5 = ((Object) (writer.getPageEvent()));
			if(obj5 != null)
				((PdfPageEvent) (obj5)).onGenericTag(writer, ((Document) (this)), ((Rectangle) (obj3)), (String)pdfchunk.getAttribute("GENERICTAG"));
		}
		if(pdfchunk.isAttribute("PDFANNOTATION"))
		{
			f14 = f;
			f8 = f14;
			if(obj6 != null)
			{
				f8 = f14;
				if(((PdfChunk) (obj6)).isAttribute("PDFANNOTATION"))
					f8 = 0.0F;
			}
			f14 = f8;
			if(obj6 == null)
				f14 = f8 + f12;
			obj3 = ((Object) (PdfFormField.shallowDuplicate((PdfAnnotation)pdfchunk.getAttribute("PDFANNOTATION"))));
			((PdfAnnotation) (obj3)).put(PdfName.RECT, ((PdfObject) (new PdfRectangle(f1, f18 + f11, (f1 + f4) - f14, f18 + f10))));
			pdfcontentbyte.addAnnotation(((PdfAnnotation) (obj3)), true);
		}
		obj3 = ((Object) ((float[])(float[])pdfchunk.getAttribute("SKEW")));
		obj5 = ((Object) ((Float)pdfchunk.getAttribute("HSCALE")));
		if(obj3 != null || obj5 != null)
		{
			f8 = 0.0F;
			f10 = 0.0F;
			if(obj3 != null)
			{
				f8 = obj3[0];
				f10 = obj3[1];
			}
			int l1;
			int i2;
			if(obj5 != null)
				f11 = ((Float) (obj5)).floatValue();
			else
	//*1546 3180:goto            1884
	//*1547 3183:aload           37
	//*1548 3185:invokevirtual   #2049 <Method boolean PdfChunk.isHorizontalSeparator()>
	//*1549 3188:ifeq            3233
	//*1550 3191:new             #2051 <Class PdfTextArray>
	//*1551 3194:dup             
	//*1552 3195:invokespecial   #2052 <Method void PdfTextArray()>
	//*1553 3198:astore          32
	//*1554 3200:aload           32
	//*1555 3202:fload           12
	//*1556 3204:fneg            
	//*1557 3205:ldc2            #2053 <Float 1000F>
	//*1558 3208:fmul            
	//*1559 3209:aload           37
	//*1560 3211:getfield        #2056 <Field PdfFont PdfChunk.font>
	//*1561 3214:invokevirtual   #1773 <Method float PdfFont.size()>
	//*1562 3217:fdiv            
	//*1563 3218:fload           6
	//*1564 3220:fdiv            
	//*1565 3221:invokevirtual   #2058 <Method void PdfTextArray.add(float)>
	//*1566 3224:aload_2         
	//*1567 3225:aload           32
	//*1568 3227:invokevirtual   #2062 <Method void PdfContentByte.showText(PdfTextArray)>
	//*1569 3230:goto            2906
	//*1570 3233:aload           37
	//*1571 3235:invokevirtual   #1807 <Method boolean PdfChunk.isTab()>
	//*1572 3238:ifeq            3293
	//*1573 3241:fload           9
	//*1574 3243:fload           7
	//*1575 3245:fcmpl           
	//*1576 3246:ifeq            3293
	//*1577 3249:new             #2051 <Class PdfTextArray>
	//*1578 3252:dup             
	//*1579 3253:invokespecial   #2052 <Method void PdfTextArray()>
	//*1580 3256:astore          32
	//*1581 3258:aload           32
	//*1582 3260:fload           9
	//*1583 3262:fload           7
	//*1584 3264:fsub            
	//*1585 3265:ldc2            #2053 <Float 1000F>
	//*1586 3268:fmul            
	//*1587 3269:aload           37
	//*1588 3271:getfield        #2056 <Field PdfFont PdfChunk.font>
	//*1589 3274:invokevirtual   #1773 <Method float PdfFont.size()>
	//*1590 3277:fdiv            
	//*1591 3278:fload           6
	//*1592 3280:fdiv            
	//*1593 3281:invokevirtual   #2058 <Method void PdfTextArray.add(float)>
	//*1594 3284:aload_2         
	//*1595 3285:aload           32
	//*1596 3287:invokevirtual   #2062 <Method void PdfContentByte.showText(PdfTextArray)>
	//*1597 3290:goto            2906
	//*1598 3293:iload           23
	//*1599 3295:ifeq            3500
	//*1600 3298:iload           28
	//*1601 3300:ifle            3500
	//*1602 3303:aload           37
	//*1603 3305:invokevirtual   #2065 <Method boolean PdfChunk.isSpecialEncoding()>
	//*1604 3308:ifeq            3500
	//*1605 3311:fload           8
	//*1606 3313:fstore          13
	//*1607 3315:fload           6
	//*1608 3317:fload           8
	//*1609 3319:fcmpl           
	//*1610 3320:ifeq            3350
	//*1611 3323:fload           6
	//*1612 3325:fstore          13
	//*1613 3327:aload_2         
	//*1614 3328:fload           11
	//*1615 3330:fload           6
	//*1616 3332:fdiv            
	//*1617 3333:invokevirtual   #1989 <Method void PdfContentByte.setWordSpacing(float)>
	//*1618 3336:aload_2         
	//*1619 3337:fload           10
	//*1620 3339:fload           6
	//*1621 3341:fdiv            
	//*1622 3342:aload_2         
	//*1623 3343:invokevirtual   #2068 <Method float PdfContentByte.getCharacterSpacing()>
	//*1624 3346:fadd            
	//*1625 3347:invokevirtual   #1994 <Method void PdfContentByte.setCharacterSpacing(float)>
	//*1626 3350:aload           37
	//*1627 3352:invokevirtual   #1884 <Method String PdfChunk.toString()>
	//*1628 3355:astore          32
	//*1629 3357:aload           32
	//*1630 3359:bipush          32
	//*1631 3361:invokevirtual   #1892 <Method int String.indexOf(int)>
	//*1632 3364:istore          26
	//*1633 3366:iload           26
	//*1634 3368:ifge            3384
	//*1635 3371:aload_2         
	//*1636 3372:aload           32
	//*1637 3374:invokevirtual   #2070 <Method void PdfContentByte.showText(String)>
	//*1638 3377:fload           13
	//*1639 3379:fstore          8
	//*1640 3381:goto            2906
	//*1641 3384:fload           11
	//*1642 3386:fneg            
	//*1643 3387:ldc2            #2053 <Float 1000F>
	//*1644 3390:fmul            
	//*1645 3391:aload           37
	//*1646 3393:getfield        #2056 <Field PdfFont PdfChunk.font>
	//*1647 3396:invokevirtual   #1773 <Method float PdfFont.size()>
	//*1648 3399:fdiv            
	//*1649 3400:fload           6
	//*1650 3402:fdiv            
	//*1651 3403:fstore          6
	//*1652 3405:new             #2051 <Class PdfTextArray>
	//*1653 3408:dup             
	//*1654 3409:aload           32
	//*1655 3411:iconst_0        
	//*1656 3412:iload           26
	//*1657 3414:invokevirtual   #2074 <Method String String.substring(int, int)>
	//*1658 3417:invokespecial   #2075 <Method void PdfTextArray(String)>
	//*1659 3420:astore          38
	//*1660 3422:aload           32
	//*1661 3424:bipush          32
	//*1662 3426:iload           26
	//*1663 3428:iconst_1        
	//*1664 3429:iadd            
	//*1665 3430:invokevirtual   #2078 <Method int String.indexOf(int, int)>
	//*1666 3433:istore          27
	//*1667 3435:iload           27
	//*1668 3437:iflt            3468
	//*1669 3440:aload           38
	//*1670 3442:fload           6
	//*1671 3444:invokevirtual   #2058 <Method void PdfTextArray.add(float)>
	//*1672 3447:aload           38
	//*1673 3449:aload           32
	//*1674 3451:iload           26
	//*1675 3453:iload           27
	//*1676 3455:invokevirtual   #2074 <Method String String.substring(int, int)>
	//*1677 3458:invokevirtual   #2080 <Method void PdfTextArray.add(String)>
	//*1678 3461:iload           27
	//*1679 3463:istore          26
	//*1680 3465:goto            3422
	//*1681 3468:aload           38
	//*1682 3470:fload           6
	//*1683 3472:invokevirtual   #2058 <Method void PdfTextArray.add(float)>
	//*1684 3475:aload           38
	//*1685 3477:aload           32
	//*1686 3479:iload           26
	//*1687 3481:invokevirtual   #2083 <Method String String.substring(int)>
	//*1688 3484:invokevirtual   #2080 <Method void PdfTextArray.add(String)>
	//*1689 3487:aload_2         
	//*1690 3488:aload           38
	//*1691 3490:invokevirtual   #2062 <Method void PdfContentByte.showText(PdfTextArray)>
	//*1692 3493:fload           13
	//*1693 3495:fstore          8
	//*1694 3497:goto            2906
	//*1695 3500:fload           8
	//*1696 3502:fstore          13
	//*1697 3504:iload           23
	//*1698 3506:ifeq            3548
	//*1699 3509:fload           8
	//*1700 3511:fstore          13
	//*1701 3513:fload           6
	//*1702 3515:fload           8
	//*1703 3517:fcmpl           
	//*1704 3518:ifeq            3548
	//*1705 3521:fload           6
	//*1706 3523:fstore          13
	//*1707 3525:aload_2         
	//*1708 3526:fload           11
	//*1709 3528:fload           6
	//*1710 3530:fdiv            
	//*1711 3531:invokevirtual   #1989 <Method void PdfContentByte.setWordSpacing(float)>
	//*1712 3534:aload_2         
	//*1713 3535:fload           10
	//*1714 3537:fload           6
	//*1715 3539:fdiv            
	//*1716 3540:aload_2         
	//*1717 3541:invokevirtual   #2068 <Method float PdfContentByte.getCharacterSpacing()>
	//*1718 3544:fadd            
	//*1719 3545:invokevirtual   #1994 <Method void PdfContentByte.setCharacterSpacing(float)>
	//*1720 3548:aload_2         
	//*1721 3549:aload           37
	//*1722 3551:invokevirtual   #1884 <Method String PdfChunk.toString()>
	//*1723 3554:invokevirtual   #2070 <Method void PdfContentByte.showText(String)>
	//*1724 3557:fload           13
	//*1725 3559:fstore          8
	//*1726 3561:goto            2906
	//*1727 3564:fload           5
	//*1728 3566:fstore          6
	//*1729 3568:iload           23
	//*1730 3570:ifeq            3597
	//*1731 3573:aload_2         
	//*1732 3574:fconst_0        
	//*1733 3575:invokevirtual   #1989 <Method void PdfContentByte.setWordSpacing(float)>
	//*1734 3578:aload_2         
	//*1735 3579:fconst_0        
	//*1736 3580:invokevirtual   #1994 <Method void PdfContentByte.setCharacterSpacing(float)>
	//*1737 3583:fload           5
	//*1738 3585:fstore          6
	//*1739 3587:aload_1         
	//*1740 3588:invokevirtual   #1880 <Method boolean PdfLine.isNewlineSplit()>
	//*1741 3591:ifeq            3597
	//*1742 3594:fconst_0        
	//*1743 3595:fstore          6
	//*1744 3597:iload           22
	//*1745 3599:ifeq            3614
	//*1746 3602:aload_2         
	//*1747 3603:fload           20
	//*1748 3605:aload_2         
	//*1749 3606:invokevirtual   #1225 <Method float PdfContentByte.getXTLM()>
	//*1750 3609:fsub            
	//*1751 3610:fconst_0        
	//*1752 3611:invokevirtual   #284 <Method void PdfContentByte.moveText(float, float)>
	//*1753 3614:aload           4
	//*1754 3616:iconst_0        
	//*1755 3617:aload           32
	//*1756 3619:aastore         
	//*1757 3620:aload           4
	//*1758 3622:iconst_1        
	//*1759 3623:new             #1174 <Class Float>
	//*1760 3626:dup             
	//*1761 3627:fload           6
	//*1762 3629:invokespecial   #1186 <Method void Float(float)>
	//*1763 3632:aastore         
	//*1764 3633:fload           17
	//*1765 3635:freturn         
				f11 = 1.0F;
	// 1766 3636:fconst_1        
	// 1767 3637:fstore          15
			pdfcontentbyte.setTextMatrix(f11, f8, f10, 1.0F, f1, f18);
		} else
	//*1768 3639:goto            2330
		{
			f11 = 1.0F;
	// 1769 3642:fconst_1        
	// 1770 3643:fstore          15
		}
		if(!flag)
		{
			if(pdfchunk.isAttribute("WORD_SPACING"))
				pdfcontentbyte.setWordSpacing(((Float)pdfchunk.getAttribute("WORD_SPACING")).floatValue());
			if(pdfchunk.isAttribute("CHAR_SPACING"))
				pdfcontentbyte.setCharacterSpacing(((Float)pdfchunk.getAttribute("CHAR_SPACING")).floatValue());
		}
		f14 = f1;
		f8 = f2;
		f10 = f11;
		if(pdfchunk.isImage())
		{
			obj3 = ((Object) (pdfchunk.getImage()));
			f4 = pdfchunk.getImageWidth();
			obj5 = ((Object) (((Image) (obj3)).matrix(pdfchunk.getImageScalePercentage())));
			obj5[4] = (pdfchunk.getImageOffsetX() + f1) - obj5[4];
			obj5[5] = (pdfchunk.getImageOffsetY() + f18) - obj5[5];
			k1 = 0;
			flag1 = ((boolean) (k1));
			if(pdfcontentbyte1.getInText())
			{
				flag1 = ((boolean) (k1));
				if(!(obj3 instanceof ImgTemplate))
				{
					flag1 = true;
					pdfcontentbyte1.endText();
				}
			}
			pdfcontentbyte1.addImage(((Image) (obj3)), obj5[0], obj5[1], obj5[2], obj5[3], obj5[4], obj5[5], false, flag2);
			if(flag1)
				pdfcontentbyte1.beginText(true);
			pdfcontentbyte.moveText((f1 + f + pdfchunk.getImageWidth()) - pdfcontentbyte.getXTLM(), 0.0F);
			f10 = f11;
			f8 = f2;
			f14 = f1;
		}
_L5:
		f2 = f14 + f4;
		j++;
		f1 = f10;
		f4 = f8;
_L6:
label1:
		{
			obj3 = obj;
			if(!pdfchunk.isImage())
			{
				obj3 = obj;
				if(pdfchunk.font().compareTo(((PdfFont) (obj))) != 0)
				{
					obj3 = ((Object) (pdfchunk.font()));
					pdfcontentbyte.setFontAndSize(((PdfFont) (obj3)).getFont(), ((PdfFont) (obj3)).size());
				}
			}
			f11 = 0.0F;
			aobj4 = (Object[])(Object[])pdfchunk.getAttribute("TEXTRENDERMODE");
			i1 = 0;
			f8 = 1.0F;
			obj = null;
			obj6 = ((Object) ((Float)pdfchunk.getAttribute("SUBSUPSCRIPT")));
			obj5 = obj;
			f10 = f8;
			if(aobj4 == null)
				break label1;
			k1 = ((Integer)aobj4[0]).intValue() & 3;
			if(k1 != 0)
				pdfcontentbyte.setTextRenderingMode(k1);
			if(k1 != 1)
			{
				obj5 = obj;
				f10 = f8;
				i1 = k1;
				if(k1 != 2)
					break label1;
			}
			f8 = ((Float)aobj4[1]).floatValue();
			if(f8 != 1.0F)
				pdfcontentbyte.setLineWidth(f8);
			obj5 = ((Object) ((BaseColor)aobj4[2]));
			obj = obj5;
			if(obj5 == null)
				obj = obj1;
			obj5 = obj;
			f10 = f8;
			i1 = k1;
			if(obj != null)
			{
				pdfcontentbyte.setColorStroke(((BaseColor) (obj)));
				i1 = k1;
				f10 = f8;
				obj5 = obj;
			}
		}
		if(obj6 != null)
			f11 = ((Float) (obj6)).floatValue();
		if(obj1 != null)
			pdfcontentbyte.setColorFill(((BaseColor) (obj1)));
		if(f11 != 0.0F)
			pdfcontentbyte.setTextRise(f11);
		if(pdfchunk.isImage())
			i = 1;
		else
		if(pdfchunk.isHorizontalSeparator())
		{
			obj = ((Object) (new PdfTextArray()));
			((PdfTextArray) (obj)).add((-f7 * 1000F) / pdfchunk.font.size() / f1);
			pdfcontentbyte.showText(((PdfTextArray) (obj)));
		} else
		if(pdfchunk.isTab() && f4 != f2)
		{
			obj = ((Object) (new PdfTextArray()));
			((PdfTextArray) (obj)).add(((f4 - f2) * 1000F) / pdfchunk.font.size() / f1);
			pdfcontentbyte.showText(((PdfTextArray) (obj)));
		} else
		if(flag && j2 > 0 && pdfchunk.isSpecialEncoding())
		{
			f8 = f3;
			if(f1 != f3)
			{
				f8 = f1;
				pdfcontentbyte.setWordSpacing(f6 / f1);
				pdfcontentbyte.setCharacterSpacing(f5 / f1 + pdfcontentbyte.getCharacterSpacing());
			}
			obj = ((Object) (pdfchunk.toString()));
			l1 = ((String) (obj)).indexOf(' ');
			if(l1 < 0)
			{
				pdfcontentbyte.showText(((String) (obj)));
				f3 = f8;
			} else
			{
				f1 = (-f6 * 1000F) / pdfchunk.font.size() / f1;
				obj6 = ((Object) (new PdfTextArray(((String) (obj)).substring(0, l1))));
				do
				{
					i2 = ((String) (obj)).indexOf(' ', l1 + 1);
					if(i2 < 0)
						break;
					((PdfTextArray) (obj6)).add(f1);
					((PdfTextArray) (obj6)).add(((String) (obj)).substring(l1, i2));
					l1 = i2;
				} while(true);
				((PdfTextArray) (obj6)).add(f1);
				((PdfTextArray) (obj6)).add(((String) (obj)).substring(l1));
				pdfcontentbyte.showText(((PdfTextArray) (obj6)));
				f3 = f8;
			}
		} else
		{
			f8 = f3;
			if(flag)
			{
				f8 = f3;
				if(f1 != f3)
				{
					f8 = f1;
					pdfcontentbyte.setWordSpacing(f6 / f1);
					pdfcontentbyte.setCharacterSpacing(f5 / f1 + pdfcontentbyte.getCharacterSpacing());
				}
			}
			pdfcontentbyte.showText(pdfchunk.toString());
			f3 = f8;
		}
		if(f11 != 0.0F)
			pdfcontentbyte.setTextRise(0.0F);
		if(obj1 != null)
			pdfcontentbyte.resetRGBColorFill();
		if(i1 != 0)
			pdfcontentbyte.setTextRenderingMode(0);
		if(obj5 != null)
			pdfcontentbyte.resetRGBColorStroke();
		if(f10 != 1.0F)
			pdfcontentbyte.setLineWidth(1.0F);
		if(pdfchunk.isAttribute("SKEW") || pdfchunk.isAttribute("HSCALE"))
		{
			i = 1;
			pdfcontentbyte.setTextMatrix(f2, f18);
		}
		if(!flag)
		{
			if(pdfchunk.isAttribute("CHAR_SPACING"))
				pdfcontentbyte.setCharacterSpacing(f5);
			if(pdfchunk.isAttribute("WORD_SPACING"))
				pdfcontentbyte.setWordSpacing(f6);
		}
		if(isTagged(writer) && pdfchunk.accessibleElement != null)
			pdfcontentbyte.closeMCBlock(pdfchunk.accessibleElement);
		f1 = f2;
		flag3 = flag2;
		obj = obj3;
		f2 = f4;
_L1:
		float f14;
		boolean flag2;
		Object obj1;
		PdfChunk pdfchunk;
		Object obj6;
		if(iterator.hasNext())
		{
			pdfchunk = (PdfChunk)iterator.next();
			flag2 = flag3;
			if(isTagged(writer))
			{
				flag2 = flag3;
				if(pdfchunk.accessibleElement != null)
				{
					pdfcontentbyte.openMCBlock(pdfchunk.accessibleElement);
					flag2 = true;
				}
			}
			obj1 = ((Object) (pdfchunk.color()));
			f14 = pdfchunk.font().size();
			if(pdfchunk.isImage())
			{
				f10 = pdfchunk.height();
				f14 = pdfchunk.height();
				f11 = 0.0F;
			} else
			{
				f10 = pdfchunk.font().getFont().getFontDescriptor(1, f14);
				f11 = pdfchunk.font().getFont().getFontDescriptor(3, f14);
			}
			if(j > k2)
				break MISSING_BLOCK_LABEL_3665;
			if(flag)
				f4 = pdfchunk.getWidthCorrected(f5, f6);
			else
				f4 = pdfchunk.width();
			if(pdfchunk.isStroked())
			{
				obj6 = ((Object) (pdfline.getChunk(j + 1)));
				if(pdfchunk.isSeparator())
				{
					f4 = f7;
					aobj1 = (Object[])(Object[])pdfchunk.getAttribute("SEPARATOR");
					Object obj4 = ((Object) ((DrawInterface)aobj1[0]));
					if(((Boolean)aobj1[1]).booleanValue())
						((DrawInterface) (obj4)).draw(pdfcontentbyte1, f17, f18 + f11, f17 + pdfline.getOriginalWidth(), f10 - f11, f18);
					else
						((DrawInterface) (obj4)).draw(pdfcontentbyte1, f1, f18 + f11, f1 + f4, f10 - f11, f18);
				}
				if(pdfchunk.isTab())
				{
					if(pdfchunk.isAttribute("TABSETTINGS"))
					{
						obj2 = ((Object) (pdfchunk.getTabStop()));
						if(obj2 != null)
						{
							f8 = ((TabStop) (obj2)).getPosition() + f17;
							f2 = f8;
							if(((TabStop) (obj2)).getLeader() != null)
							{
								((TabStop) (obj2)).getLeader().draw(pdfcontentbyte1, f1, f18 + f11, f8, f10 - f11, f18);
								f2 = f8;
							}
						} else
						{
							f2 = f1;
						}
					} else
					{
						Object aobj2[] = (Object[])(Object[])pdfchunk.getAttribute("TAB");
						DrawInterface drawinterface = (DrawInterface)aobj2[0];
						f8 = ((Float)aobj2[1]).floatValue() + ((Float)aobj2[3]).floatValue();
						f2 = f8;
						if(f8 > f1)
						{
							drawinterface.draw(pdfcontentbyte1, f1, f18 + f11, f8, f10 - f11, f18);
							f2 = f8;
						}
					}
					f8 = f2;
					f2 = f1;
					f1 = f8;
				}
				if(pdfchunk.isAttribute("BACKGROUND"))
				{
					obj2 = ((Object) ((Object[])(Object[])pdfchunk.getAttribute("BACKGROUND")));
					if(obj2[0] != null)
					{
						flag3 = pdfcontentbyte1.getInText();
						if(flag3 && isTagged(writer))
							pdfcontentbyte1.endText();
						pdfcontentbyte1.saveState();
						f15 = f;
						f8 = f15;
						if(obj6 != null)
						{
							f8 = f15;
							if(((PdfChunk) (obj6)).isAttribute("BACKGROUND"))
								f8 = 0.0F;
						}
						f15 = f8;
						if(obj6 == null)
							f15 = f8 + f12;
						pdfcontentbyte1.setColorFill((BaseColor)obj2[0]);
						obj2 = ((Object) ((float[])(float[])obj2[1]));
						pdfcontentbyte1.rectangle(f1 - obj2[0], ((f18 + f11) - obj2[1]) + pdfchunk.getTextRise(), (f4 - f15) + obj2[0] + obj2[2], (f10 - f11) + obj2[1] + obj2[3]);
						pdfcontentbyte1.fill();
						pdfcontentbyte1.setGrayFill(0.0F);
						pdfcontentbyte1.restoreState();
						if(flag3 && isTagged(writer))
							pdfcontentbyte1.beginText(true);
					}
				}
				if(!pdfchunk.isAttribute("UNDERLINE"))
					break MISSING_BLOCK_LABEL_1525;
				flag3 = pdfcontentbyte1.getInText();
				if(flag3 && isTagged(writer))
					pdfcontentbyte1.endText();
				f15 = f;
				f8 = f15;
				if(obj6 != null)
				{
					f8 = f15;
					if(((PdfChunk) (obj6)).isAttribute("UNDERLINE"))
						f8 = 0.0F;
				}
				f15 = f8;
				if(obj6 == null)
					f15 = f8 + f12;
				aobj3 = (Object[][])(Object[][])pdfchunk.getAttribute("UNDERLINE");
				for(k = 0; k < aobj3.length; k++)
				{
					obj2 = ((Object) (aobj3[k]));
					obj4 = ((Object) ((BaseColor)obj2[0]));
					af = (float[])(float[])obj2[1];
					obj2 = obj4;
					if(obj4 == null)
						obj2 = obj1;
					if(obj2 != null)
						pdfcontentbyte1.setColorStroke(((BaseColor) (obj2)));
					pdfcontentbyte1.setLineWidth(af[0] + pdfchunk.font().size() * af[1]);
					f8 = af[2] + pdfchunk.font().size() * af[3];
					j1 = (int)af[4];
					if(j1 != 0)
						pdfcontentbyte1.setLineCap(j1);
					pdfcontentbyte1.moveTo(f1, f18 + f8);
					pdfcontentbyte1.lineTo((f1 + f4) - f15, f18 + f8);
					pdfcontentbyte1.stroke();
					if(obj2 != null)
						pdfcontentbyte1.resetGrayStroke();
					if(j1 != 0)
						pdfcontentbyte1.setLineCap(0);
				}

				break MISSING_BLOCK_LABEL_1500;
			}
		} else
		{
			f1 = f;
			if(flag)
			{
				pdfcontentbyte.setWordSpacing(0.0F);
				pdfcontentbyte.setCharacterSpacing(0.0F);
				f1 = f;
				if(pdfline.isNewlineSplit())
					f1 = 0.0F;
			}
			if(i != 0)
				pdfcontentbyte.moveText(f17 - pdfcontentbyte.getXTLM(), 0.0F);
			aobj[0] = obj;
			aobj[1] = ((Object) (new Float(f1)));
			return f13;
		}
	//*1771 3645:goto            2345
	//*1772 3648:goto            484
		f10 = 1.0F;
	// 1773 3651:fconst_1        
	// 1774 3652:fstore          14
		f14 = f1;
	// 1775 3654:fload           6
	// 1776 3656:fstore          18
		f8 = f2;
	// 1777 3658:fload           7
	// 1778 3660:fstore          13
		  goto _L5
	//*1779 3662:goto            2603
		f4 = f2;
	// 1780 3665:fload           7
	// 1781 3667:fstore          9
		float f9 = 1.0F;
	// 1782 3669:fconst_1        
	// 1783 3670:fstore          13
		f2 = f1;
	// 1784 3672:fload           6
	// 1785 3674:fstore          7
		f1 = f9;
	// 1786 3676:fload           13
	// 1787 3678:fstore          6
		  goto _L6
	//*1788 3680:goto            2624
	}

	void writeOutlines()
		throws IOException
	{
		if(rootOutline.getKids().size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #966 <Field PdfOutline rootOutline>
	//*   2    4:invokevirtual   #970 <Method ArrayList PdfOutline.getKids()>
	//*   3    7:invokevirtual   #296 <Method int ArrayList.size()>
	//*   4   10:ifne            14
		{
			return;
	//    5   13:return          
		} else
		{
			outlineTree(rootOutline);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #966 <Field PdfOutline rootOutline>
	//    9   19:invokevirtual   #1550 <Method void outlineTree(PdfOutline)>
			writer.addToBody(((PdfObject) (rootOutline)), rootOutline.indirectReference());
	//   10   22:aload_0         
	//   11   23:getfield        #256 <Field PdfWriter writer>
	//   12   26:aload_0         
	//   13   27:getfield        #966 <Field PdfOutline rootOutline>
	//   14   30:aload_0         
	//   15   31:getfield        #966 <Field PdfOutline rootOutline>
	//   16   34:invokevirtual   #1315 <Method PdfIndirectReference PdfOutline.indirectReference()>
	//   17   37:invokevirtual   #1565 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	protected static final DecimalFormat SIXTEEN_DIGITS = new DecimalFormat("0000000000000000");
	static final String hangingPunctuation = ".,;:'";
	protected PdfDictionary additionalActions;
	protected int alignment;
	protected PdfAction anchorAction;
	PdfAnnotationsImp annotationsImp;
	private PdfBody body;
	protected HashMap boxSize;
	protected PdfCollection collection;
	protected float currentHeight;
	protected PdfOutline currentOutline;
	protected HashMap documentFileAttachment;
	protected HashMap documentLevelJS;
	private HashMap elementsParents;
	private TempFileCache externalCache;
	private HashMap externallyStoredStructElements;
	protected boolean firstPageEvent;
	private ArrayList floatingElements;
	protected PdfContentByte graphics;
	protected float imageEnd;
	protected Image imageWait;
	protected Indentation indentation;
	protected PdfInfo info;
	protected boolean isSectionTitle;
	private boolean isToUseExternalCache;
	int jsCounter;
	protected PdfString language;
	protected int lastElementType;
	protected float leading;
	private Stack leadingStack;
	protected PdfLine line;
	protected ArrayList lines;
	protected TreeMap localDestinations;
	protected HashMap markPoints;
	protected float nextMarginBottom;
	protected float nextMarginLeft;
	protected float nextMarginRight;
	protected float nextMarginTop;
	protected Rectangle nextPageSize;
	protected PdfAction openActionAction;
	protected String openActionName;
	protected boolean openMCDocument;
	protected PdfDictionary pageAA;
	private boolean pageEmpty;
	protected PdfPageLabels pageLabels;
	protected PageResources pageResources;
	protected PdfOutline rootOutline;
	protected boolean strictImageSequence;
	private HashMap structElements;
	protected HashMap structParentIndices;
	protected TabSettings tabSettings;
	protected PdfContentByte text;
	protected int textEmptySize;
	protected HashMap thisBoxSize;
	protected PdfViewerPreferencesImp viewerPreferences;
	protected PdfWriter writer;

	static 
	{
	//    0    0:new             #117 <Class DecimalFormat>
	//    1    3:dup             
	//    2    4:ldc1            #119 <String "0000000000000000">
	//    3    6:invokespecial   #123 <Method void DecimalFormat(String)>
	//    4    9:putstatic       #125 <Field DecimalFormat SIXTEEN_DIGITS>
	//*   5   12:return          
	}
}
