// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfLiteral, PdfNumber, PdfReader, PdfName, 
//			PdfDictionary, PdfObject, PRStream, PdfImportedPage, 
//			PdfRectangle, PdfWriter, RandomAccessFileOrArray, PdfStream

class PdfReaderInstance
{

	PdfReaderInstance(PdfReader pdfreader, PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		importedPages = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #50  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void HashMap()>
	//    6   12:putfield        #53  <Field HashMap importedPages>
		visited = new HashSet();
	//    7   15:aload_0         
	//    8   16:new             #55  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void HashSet()>
	//   11   23:putfield        #58  <Field HashSet visited>
		nextRound = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #60  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #61  <Method void ArrayList()>
	//   16   34:putfield        #63  <Field ArrayList nextRound>
		reader = pdfreader;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #65  <Field PdfReader reader>
		writer = pdfwriter;
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:putfield        #67  <Field PdfWriter writer>
		file = pdfreader.getSafeFile();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #73  <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   26   52:putfield        #75  <Field RandomAccessFileOrArray file>
		myXref = new int[pdfreader.getXrefSize()];
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #79  <Method int PdfReader.getXrefSize()>
	//   30   60:newarray        int[]
	//   31   62:putfield        #81  <Field int[] myXref>
	//   32   65:return          
	}

	PdfStream getFormXObject(int i, int j)
		throws IOException
	{
		Object obj = ((Object) (reader.getPageNRelease(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field PdfReader reader>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #89  <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//    4    8:astore          6
		PdfObject pdfobject = PdfReader.getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.CONTENTS));
	//    5   10:aload           6
	//    6   12:getstatic       #95  <Field PdfName PdfName.CONTENTS>
	//    7   15:invokevirtual   #101 <Method PdfObject PdfDictionary.get(PdfName)>
	//    8   18:invokestatic    #105 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    9   21:astore          5
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   10   23:new             #97  <Class PdfDictionary>
	//   11   26:dup             
	//   12   27:invokespecial   #106 <Method void PdfDictionary()>
	//   13   30:astore          4
		byte abyte0[] = null;
	//   14   32:aconst_null     
	//   15   33:astore_3        
		if(pdfobject != null)
	//*  16   34:aload           5
	//*  17   36:ifnull          203
		{
			if(pdfobject.isStream())
	//*  18   39:aload           5
	//*  19   41:invokevirtual   #112 <Method boolean PdfObject.isStream()>
	//*  20   44:ifeq            187
				pdfdictionary.putAll(((PdfDictionary) ((PRStream)pdfobject)));
	//   21   47:aload           4
	//   22   49:aload           5
	//   23   51:checkcast       #114 <Class PRStream>
	//   24   54:invokevirtual   #118 <Method void PdfDictionary.putAll(PdfDictionary)>
			else
	//*  25   57:aload           4
	//*  26   59:getstatic       #121 <Field PdfName PdfName.RESOURCES>
	//*  27   62:aload           6
	//*  28   64:getstatic       #121 <Field PdfName PdfName.RESOURCES>
	//*  29   67:invokevirtual   #101 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  30   70:invokestatic    #105 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//*  31   73:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  32   76:aload           4
	//*  33   78:getstatic       #128 <Field PdfName PdfName.TYPE>
	//*  34   81:getstatic       #131 <Field PdfName PdfName.XOBJECT>
	//*  35   84:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  36   87:aload           4
	//*  37   89:getstatic       #134 <Field PdfName PdfName.SUBTYPE>
	//*  38   92:getstatic       #137 <Field PdfName PdfName.FORM>
	//*  39   95:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  40   98:aload_0         
	//*  41   99:getfield        #53  <Field HashMap importedPages>
	//*  42  102:iload_1         
	//*  43  103:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//*  44  106:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//*  45  109:checkcast       #148 <Class PdfImportedPage>
	//*  46  112:astore          6
	//*  47  114:aload           4
	//*  48  116:getstatic       #151 <Field PdfName PdfName.BBOX>
	//*  49  119:new             #153 <Class PdfRectangle>
	//*  50  122:dup             
	//*  51  123:aload           6
	//*  52  125:invokevirtual   #157 <Method com.itextpdf.text.Rectangle PdfImportedPage.getBoundingBox()>
	//*  53  128:invokespecial   #160 <Method void PdfRectangle(com.itextpdf.text.Rectangle)>
	//*  54  131:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  55  134:aload           6
	//*  56  136:invokevirtual   #164 <Method PdfArray PdfImportedPage.getMatrix()>
	//*  57  139:astore          6
	//*  58  141:aload           6
	//*  59  143:ifnonnull       210
	//*  60  146:aload           4
	//*  61  148:getstatic       #167 <Field PdfName PdfName.MATRIX>
	//*  62  151:getstatic       #37  <Field PdfLiteral IDENTITYMATRIX>
	//*  63  154:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  64  157:aload           4
	//*  65  159:getstatic       #170 <Field PdfName PdfName.FORMTYPE>
	//*  66  162:getstatic       #44  <Field PdfNumber ONE>
	//*  67  165:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  68  168:aload_3         
	//*  69  169:ifnonnull       223
	//*  70  172:new             #114 <Class PRStream>
	//*  71  175:dup             
	//*  72  176:aload           5
	//*  73  178:checkcast       #114 <Class PRStream>
	//*  74  181:aload           4
	//*  75  183:invokespecial   #173 <Method void PRStream(PRStream, PdfDictionary)>
	//*  76  186:areturn         
				abyte0 = reader.getPageContent(i, file);
	//   77  187:aload_0         
	//   78  188:getfield        #65  <Field PdfReader reader>
	//   79  191:iload_1         
	//   80  192:aload_0         
	//   81  193:getfield        #75  <Field RandomAccessFileOrArray file>
	//   82  196:invokevirtual   #177 <Method byte[] PdfReader.getPageContent(int, RandomAccessFileOrArray)>
	//   83  199:astore_3        
		} else
	//*  84  200:goto            57
		{
			abyte0 = new byte[0];
	//   85  203:iconst_0        
	//   86  204:newarray        byte[]
	//   87  206:astore_3        
		}
		pdfdictionary.put(PdfName.RESOURCES, PdfReader.getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.RESOURCES)));
		pdfdictionary.put(PdfName.TYPE, ((PdfObject) (PdfName.XOBJECT)));
		pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
		obj = ((Object) ((PdfImportedPage)importedPages.get(((Object) (Integer.valueOf(i))))));
		pdfdictionary.put(PdfName.BBOX, ((PdfObject) (new PdfRectangle(((PdfImportedPage) (obj)).getBoundingBox()))));
		obj = ((Object) (((PdfImportedPage) (obj)).getMatrix()));
		if(obj == null)
			pdfdictionary.put(PdfName.MATRIX, ((PdfObject) (IDENTITYMATRIX)));
		else
	//*  88  207:goto            57
			pdfdictionary.put(PdfName.MATRIX, ((PdfObject) (obj)));
	//   89  210:aload           4
	//   90  212:getstatic       #167 <Field PdfName PdfName.MATRIX>
	//   91  215:aload           6
	//   92  217:invokevirtual   #125 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FORMTYPE, ((PdfObject) (ONE)));
		if(abyte0 == null)
		{
			return ((PdfStream) (new PRStream((PRStream)pdfobject, pdfdictionary)));
		} else
	//*  93  220:goto            157
		{
			PRStream prstream = new PRStream(reader, abyte0, j);
	//   94  223:new             #114 <Class PRStream>
	//   95  226:dup             
	//   96  227:aload_0         
	//   97  228:getfield        #65  <Field PdfReader reader>
	//   98  231:aload_3         
	//   99  232:iload_2         
	//  100  233:invokespecial   #180 <Method void PRStream(PdfReader, byte[], int)>
	//  101  236:astore_3        
			prstream.putAll(pdfdictionary);
	//  102  237:aload_3         
	//  103  238:aload           4
	//  104  240:invokevirtual   #181 <Method void PRStream.putAll(PdfDictionary)>
			return ((PdfStream) (prstream));
	//  105  243:aload_3         
	//  106  244:areturn         
		}
	}

	PdfImportedPage getImportedPage(int i)
	{
		if(!reader.isOpenedWithFullPermissions())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field PdfReader reader>
	//*   2    4:invokevirtual   #187 <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//*   3    7:ifne            27
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//    4   10:new             #189 <Class IllegalArgumentException>
	//    5   13:dup             
	//    6   14:ldc1            #191 <String "pdfreader.not.opened.with.owner.password">
	//    7   16:iconst_0        
	//    8   17:anewarray       Object[]
	//    9   20:invokestatic    #197 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   23:invokespecial   #198 <Method void IllegalArgumentException(String)>
	//   11   26:athrow          
		if(i < 1 || i > reader.getNumberOfPages())
	//*  12   27:iload_1         
	//*  13   28:iconst_1        
	//*  14   29:icmplt          43
	//*  15   32:iload_1         
	//*  16   33:aload_0         
	//*  17   34:getfield        #65  <Field PdfReader reader>
	//*  18   37:invokevirtual   #201 <Method int PdfReader.getNumberOfPages()>
	//*  19   40:icmple          57
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.page.number.1", i));
	//   20   43:new             #189 <Class IllegalArgumentException>
	//   21   46:dup             
	//   22   47:ldc1            #203 <String "invalid.page.number.1">
	//   23   49:iload_1         
	//   24   50:invokestatic    #206 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   25   53:invokespecial   #198 <Method void IllegalArgumentException(String)>
	//   26   56:athrow          
		Integer integer = Integer.valueOf(i);
	//   27   57:iload_1         
	//   28   58:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   29   61:astore          4
		PdfImportedPage pdfimportedpage1 = (PdfImportedPage)importedPages.get(((Object) (integer)));
	//   30   63:aload_0         
	//   31   64:getfield        #53  <Field HashMap importedPages>
	//   32   67:aload           4
	//   33   69:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   34   72:checkcast       #148 <Class PdfImportedPage>
	//   35   75:astore_3        
		PdfImportedPage pdfimportedpage = pdfimportedpage1;
	//   36   76:aload_3         
	//   37   77:astore_2        
		if(pdfimportedpage1 == null)
	//*  38   78:aload_3         
	//*  39   79:ifnonnull       107
		{
			pdfimportedpage = new PdfImportedPage(this, writer, i);
	//   40   82:new             #148 <Class PdfImportedPage>
	//   41   85:dup             
	//   42   86:aload_0         
	//   43   87:aload_0         
	//   44   88:getfield        #67  <Field PdfWriter writer>
	//   45   91:iload_1         
	//   46   92:invokespecial   #209 <Method void PdfImportedPage(PdfReaderInstance, PdfWriter, int)>
	//   47   95:astore_2        
			importedPages.put(((Object) (integer)), ((Object) (pdfimportedpage)));
	//   48   96:aload_0         
	//   49   97:getfield        #53  <Field HashMap importedPages>
	//   50  100:aload           4
	//   51  102:aload_2         
	//   52  103:invokevirtual   #212 <Method Object HashMap.put(Object, Object)>
	//   53  106:pop             
		}
		return pdfimportedpage;
	//   54  107:aload_2         
	//   55  108:areturn         
	}

	int getNewObjectNumber(int i, int j)
	{
		if(myXref[i] == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int[] myXref>
	//*   2    4:iload_1         
	//*   3    5:iaload          
	//*   4    6:ifne            34
		{
			myXref[i] = writer.getIndirectReferenceNumber();
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field int[] myXref>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #67  <Field PdfWriter writer>
	//   10   18:invokevirtual   #219 <Method int PdfWriter.getIndirectReferenceNumber()>
	//   11   21:iastore         
			nextRound.add(((Object) (Integer.valueOf(i))));
	//   12   22:aload_0         
	//   13   23:getfield        #63  <Field ArrayList nextRound>
	//   14   26:iload_1         
	//   15   27:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//   16   30:invokevirtual   #223 <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		}
		return myXref[i];
	//   18   34:aload_0         
	//   19   35:getfield        #81  <Field int[] myXref>
	//   20   38:iload_1         
	//   21   39:iaload          
	//   22   40:ireturn         
	}

	PdfReader getReader()
	{
		return reader;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field PdfReader reader>
	//    2    4:areturn         
	}

	RandomAccessFileOrArray getReaderFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field RandomAccessFileOrArray file>
	//    2    4:areturn         
	}

	PdfObject getResources(int i)
	{
		return PdfReader.getPdfObjectRelease(reader.getPageNRelease(i).get(PdfName.RESOURCES));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field PdfReader reader>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #89  <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//    4    8:getstatic       #121 <Field PdfName PdfName.RESOURCES>
	//    5   11:invokevirtual   #101 <Method PdfObject PdfDictionary.get(PdfName)>
	//    6   14:invokestatic    #105 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    7   17:areturn         
	}

	public void writeAllPages()
		throws IOException
	{
		file.reOpen();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field RandomAccessFileOrArray file>
	//    2    4:invokevirtual   #236 <Method void RandomAccessFileOrArray.reOpen()>
		Iterator iterator = importedPages.values().iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field HashMap importedPages>
	//    5   11:invokevirtual   #240 <Method Collection HashMap.values()>
	//    6   14:invokeinterface #246 <Method Iterator Collection.iterator()>
	//    7   19:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   20:aload_1         
	//    9   21:invokeinterface #251 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            86
			PdfImportedPage pdfimportedpage = (PdfImportedPage)iterator.next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #255 <Method Object Iterator.next()>
	//   13   35:checkcast       #148 <Class PdfImportedPage>
	//   14   38:astore_2        
			if(pdfimportedpage.isToCopy())
	//*  15   39:aload_2         
	//*  16   40:invokevirtual   #258 <Method boolean PdfImportedPage.isToCopy()>
	//*  17   43:ifeq            20
			{
				writer.addToBody(((PdfObject) (pdfimportedpage.getFormXObject(writer.getCompressionLevel()))), pdfimportedpage.getIndirectReference());
	//   18   46:aload_0         
	//   19   47:getfield        #67  <Field PdfWriter writer>
	//   20   50:aload_2         
	//   21   51:aload_0         
	//   22   52:getfield        #67  <Field PdfWriter writer>
	//   23   55:invokevirtual   #261 <Method int PdfWriter.getCompressionLevel()>
	//   24   58:invokevirtual   #264 <Method PdfStream PdfImportedPage.getFormXObject(int)>
	//   25   61:aload_2         
	//   26   62:invokevirtual   #268 <Method PdfIndirectReference PdfImportedPage.getIndirectReference()>
	//   27   65:invokevirtual   #272 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   28   68:pop             
				pdfimportedpage.setCopied();
	//   29   69:aload_2         
	//   30   70:invokevirtual   #275 <Method void PdfImportedPage.setCopied()>
			}
		} while(true);
	//   31   73:goto            20
		break MISSING_BLOCK_LABEL_86;
		Exception exception;
		exception;
	//   32   76:astore_1        
		try
		{
			file.close();
	//   33   77:aload_0         
	//   34   78:getfield        #75  <Field RandomAccessFileOrArray file>
	//   35   81:invokevirtual   #278 <Method void RandomAccessFileOrArray.close()>
		}
	//*  36   84:aload_1         
	//*  37   85:athrow          
	//*  38   86:aload_0         
	//*  39   87:invokevirtual   #281 <Method void writeAllVisited()>
	//*  40   90:aload_0         
	//*  41   91:getfield        #75  <Field RandomAccessFileOrArray file>
	//*  42   94:invokevirtual   #278 <Method void RandomAccessFileOrArray.close()>
	//*  43   97:return          
		catch(Exception exception2) { }
	//   44   98:astore_2        
		throw exception;
		writeAllVisited();
		try
		{
			file.close();
			return;
		}
	//*  45   99:goto            84
		catch(Exception exception1)
	//*  46  102:astore_1        
		{
			return;
	//   47  103:return          
		}
	}

	void writeAllVisited()
		throws IOException
	{
		while(!nextRound.isEmpty()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ArrayList nextRound>
	//*   2    4:invokevirtual   #284 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            103
		{
			ArrayList arraylist = nextRound;
	//    4   10:aload_0         
	//    5   11:getfield        #63  <Field ArrayList nextRound>
	//    6   14:astore_3        
			nextRound = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #60  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #61  <Method void ArrayList()>
	//   11   23:putfield        #63  <Field ArrayList nextRound>
			int i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
			while(i < arraylist.size()) 
	//*  14   28:iload_1         
	//*  15   29:aload_3         
	//*  16   30:invokevirtual   #287 <Method int ArrayList.size()>
	//*  17   33:icmpge          0
			{
				Integer integer = (Integer)arraylist.get(i);
	//   18   36:aload_3         
	//   19   37:iload_1         
	//   20   38:invokevirtual   #290 <Method Object ArrayList.get(int)>
	//   21   41:checkcast       #139 <Class Integer>
	//   22   44:astore          4
				if(!visited.contains(((Object) (integer))))
	//*  23   46:aload_0         
	//*  24   47:getfield        #58  <Field HashSet visited>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #293 <Method boolean HashSet.contains(Object)>
	//*  27   55:ifne            96
				{
					visited.add(((Object) (integer)));
	//   28   58:aload_0         
	//   29   59:getfield        #58  <Field HashSet visited>
	//   30   62:aload           4
	//   31   64:invokevirtual   #294 <Method boolean HashSet.add(Object)>
	//   32   67:pop             
					int j = integer.intValue();
	//   33   68:aload           4
	//   34   70:invokevirtual   #297 <Method int Integer.intValue()>
	//   35   73:istore_2        
					writer.addToBody(reader.getPdfObjectRelease(j), myXref[j]);
	//   36   74:aload_0         
	//   37   75:getfield        #67  <Field PdfWriter writer>
	//   38   78:aload_0         
	//   39   79:getfield        #65  <Field PdfReader reader>
	//   40   82:iload_2         
	//   41   83:invokevirtual   #299 <Method PdfObject PdfReader.getPdfObjectRelease(int)>
	//   42   86:aload_0         
	//   43   87:getfield        #81  <Field int[] myXref>
	//   44   90:iload_2         
	//   45   91:iaload          
	//   46   92:invokevirtual   #302 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, int)>
	//   47   95:pop             
				}
				i++;
	//   48   96:iload_1         
	//   49   97:iconst_1        
	//   50   98:iadd            
	//   51   99:istore_1        
			}
		}
	//*  52  100:goto            28
	//   53  103:return          
	}

	static final PdfLiteral IDENTITYMATRIX = new PdfLiteral("[1 0 0 1 0 0]");
	static final PdfNumber ONE = new PdfNumber(1);
	RandomAccessFileOrArray file;
	HashMap importedPages;
	int myXref[];
	ArrayList nextRound;
	PdfReader reader;
	HashSet visited;
	PdfWriter writer;

	static 
	{
	//    0    0:new             #29  <Class PdfLiteral>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "[1 0 0 1 0 0]">
	//    3    6:invokespecial   #35  <Method void PdfLiteral(String)>
	//    4    9:putstatic       #37  <Field PdfLiteral IDENTITYMATRIX>
	//    5   12:new             #39  <Class PdfNumber>
	//    6   15:dup             
	//    7   16:iconst_1        
	//    8   17:invokespecial   #42  <Method void PdfNumber(int)>
	//    9   20:putstatic       #44  <Field PdfNumber ONE>
	//*  10   23:return          
	}
}
