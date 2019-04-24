// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.Point;
import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.BadPasswordException;
import com.itextpdf.text.log.Counter;
import com.itextpdf.text.log.CounterFactory;
import com.itextpdf.text.pdf.collection.PdfCollection;
import com.itextpdf.text.pdf.internal.PdfVersionImp;
import com.itextpdf.text.pdf.internal.PdfViewerPreferencesImp;
import com.itextpdf.text.xml.xmp.*;
import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMetaFactory;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfDocument, IntHashtable, PdfStamper, 
//			PdfReader, PdfEncryption, RandomAccessFileOrArray, OutputStreamCounter, 
//			PdfArray, PdfObject, PdfLayer, PRIndirectReference, 
//			PdfDictionary, PdfName, PdfIndirectReference, PdfNumber, 
//			PdfAppearance, PdfContentByte, PdfStream, PdfRectangle, 
//			PdfAnnotation, PdfFormField, FdfReader, PdfString, 
//			PdfTemplate, PdfIndirectObject, PdfNameTree, ByteBuffer, 
//			PdfContents, StampContent, PageResources, AcroFields, 
//			XfaForm, PdfPageLabels, PdfOCProperties, PdfDate, 
//			PRStream, NumberArray, PdfReaderInstance, PdfOCG, 
//			ICC_Profile, PdfException, PdfTransition, PdfAction

class PdfStamperImp extends PdfWriter
{
	static class PageStamp
	{

		StampContent over;
		PdfDictionary pageN;
		PageResources pageResources;
		int replacePoint;
		StampContent under;

		PageStamp(PdfStamperImp pdfstamperimp, PdfReader pdfreader, PdfDictionary pdfdictionary)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			replacePoint = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #23  <Field int replacePoint>
			pageN = pdfdictionary;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #25  <Field PdfDictionary pageN>
			pageResources = new PageResources();
		//    8   14:aload_0         
		//    9   15:new             #27  <Class PageResources>
		//   10   18:dup             
		//   11   19:invokespecial   #28  <Method void PageResources()>
		//   12   22:putfield        #30  <Field PageResources pageResources>
			pdfreader = ((PdfReader) (pdfdictionary.getAsDict(PdfName.RESOURCES)));
		//   13   25:aload_3         
		//   14   26:getstatic       #36  <Field PdfName PdfName.RESOURCES>
		//   15   29:invokevirtual   #42  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
		//   16   32:astore_2        
			pageResources.setOriginalResources(((PdfDictionary) (pdfreader)), pdfstamperimp.namePtr);
		//   17   33:aload_0         
		//   18   34:getfield        #30  <Field PageResources pageResources>
		//   19   37:aload_2         
		//   20   38:aload_1         
		//   21   39:getfield        #46  <Field int[] PdfStamperImp.namePtr>
		//   22   42:invokevirtual   #50  <Method void PageResources.setOriginalResources(PdfDictionary, int[])>
		//   23   45:return          
		}
	}


	protected PdfStamperImp(PdfReader pdfreader, OutputStream outputstream, char c, boolean flag)
		throws DocumentException, IOException
	{
		super(new PdfDocument(), outputstream);
	//    0    0:aload_0         
	//    1    1:new             #61  <Class PdfDocument>
	//    2    4:dup             
	//    3    5:invokespecial   #64  <Method void PdfDocument()>
	//    4    8:aload_2         
	//    5    9:invokespecial   #67  <Method void PdfWriter(PdfDocument, OutputStream)>
		readers2intrefs = new HashMap();
	//    6   12:aload_0         
	//    7   13:new             #69  <Class HashMap>
	//    8   16:dup             
	//    9   17:invokespecial   #70  <Method void HashMap()>
	//   10   20:putfield        #72  <Field HashMap readers2intrefs>
		readers2file = new HashMap();
	//   11   23:aload_0         
	//   12   24:new             #69  <Class HashMap>
	//   13   27:dup             
	//   14   28:invokespecial   #70  <Method void HashMap()>
	//   15   31:putfield        #74  <Field HashMap readers2file>
		myXref = new IntHashtable();
	//   16   34:aload_0         
	//   17   35:new             #76  <Class IntHashtable>
	//   18   38:dup             
	//   19   39:invokespecial   #77  <Method void IntHashtable()>
	//   20   42:putfield        #79  <Field IntHashtable myXref>
		pagesToContent = new HashMap();
	//   21   45:aload_0         
	//   22   46:new             #69  <Class HashMap>
	//   23   49:dup             
	//   24   50:invokespecial   #70  <Method void HashMap()>
	//   25   53:putfield        #81  <Field HashMap pagesToContent>
		closed = false;
	//   26   56:aload_0         
	//   27   57:iconst_0        
	//   28   58:putfield        #83  <Field boolean closed>
		rotateContents = true;
	//   29   61:aload_0         
	//   30   62:iconst_1        
	//   31   63:putfield        #85  <Field boolean rotateContents>
		flat = false;
	//   32   66:aload_0         
	//   33   67:iconst_0        
	//   34   68:putfield        #87  <Field boolean flat>
		flatFreeText = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #89  <Field boolean flatFreeText>
		flatannotations = false;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #91  <Field boolean flatannotations>
	//   41   81:aload_0         
	//   42   82:iconst_1        
	//   43   83:newarray        int[]
	//   44   85:dup             
	//   45   86:iconst_0        
	//   46   87:iconst_0        
	//   47   88:iastore         
	//   48   89:putfield        #93  <Field int[] namePtr>
		partialFlattening = new HashSet();
	//   49   92:aload_0         
	//   50   93:new             #95  <Class HashSet>
	//   51   96:dup             
	//   52   97:invokespecial   #96  <Method void HashSet()>
	//   53  100:putfield        #98  <Field HashSet partialFlattening>
		useVp = false;
	//   54  103:aload_0         
	//   55  104:iconst_0        
	//   56  105:putfield        #100 <Field boolean useVp>
		viewerPreferences = new PdfViewerPreferencesImp();
	//   57  108:aload_0         
	//   58  109:new             #102 <Class PdfViewerPreferencesImp>
	//   59  112:dup             
	//   60  113:invokespecial   #103 <Method void PdfViewerPreferencesImp()>
	//   61  116:putfield        #105 <Field PdfViewerPreferencesImp viewerPreferences>
		fieldTemplates = new HashSet();
	//   62  119:aload_0         
	//   63  120:new             #95  <Class HashSet>
	//   64  123:dup             
	//   65  124:invokespecial   #96  <Method void HashSet()>
	//   66  127:putfield        #107 <Field HashSet fieldTemplates>
		fieldsAdded = false;
	//   67  130:aload_0         
	//   68  131:iconst_0        
	//   69  132:putfield        #109 <Field boolean fieldsAdded>
		sigFlags = 0;
	//   70  135:aload_0         
	//   71  136:iconst_0        
	//   72  137:putfield        #111 <Field int sigFlags>
		namedDestinations = new HashMap();
	//   73  140:aload_0         
	//   74  141:new             #69  <Class HashMap>
	//   75  144:dup             
	//   76  145:invokespecial   #70  <Method void HashMap()>
	//   77  148:putfield        #113 <Field HashMap namedDestinations>
		COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfStamper);
	//   78  151:aload_0         
	//   79  152:ldc1            #115 <Class PdfStamper>
	//   80  154:invokestatic    #121 <Method Counter CounterFactory.getCounter(Class)>
	//   81  157:putfield        #123 <Field Counter COUNTER>
		originalLayersAreRead = false;
	//   82  160:aload_0         
	//   83  161:iconst_0        
	//   84  162:putfield        #125 <Field boolean originalLayersAreRead>
	//   85  165:aload_0         
	//   86  166:bipush          6
	//   87  168:newarray        double[]
	//   88  170:dup             
	//   89  171:iconst_0        
	//   90  172:dconst_1        
	//   91  173:dastore         
	//   92  174:dup             
	//   93  175:iconst_1        
	//   94  176:dconst_0        
	//   95  177:dastore         
	//   96  178:dup             
	//   97  179:iconst_2        
	//   98  180:dconst_0        
	//   99  181:dastore         
	//  100  182:dup             
	//  101  183:iconst_3        
	//  102  184:dconst_1        
	//  103  185:dastore         
	//  104  186:dup             
	//  105  187:iconst_4        
	//  106  188:dconst_0        
	//  107  189:dastore         
	//  108  190:dup             
	//  109  191:iconst_5        
	//  110  192:dconst_0        
	//  111  193:dastore         
	//  112  194:putfield        #127 <Field double[] DEFAULT_MATRIX>
		if(!pdfreader.isOpenedWithFullPermissions())
	//* 113  197:aload_1         
	//* 114  198:invokevirtual   #133 <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//* 115  201:ifne            221
			throw new BadPasswordException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//  116  204:new             #135 <Class BadPasswordException>
	//  117  207:dup             
	//  118  208:ldc1            #137 <String "pdfreader.not.opened.with.owner.password">
	//  119  210:iconst_0        
	//  120  211:anewarray       Object[]
	//  121  214:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  122  217:invokespecial   #148 <Method void BadPasswordException(String)>
	//  123  220:athrow          
		if(pdfreader.isTampered())
	//* 124  221:aload_1         
	//* 125  222:invokevirtual   #151 <Method boolean PdfReader.isTampered()>
	//* 126  225:ifeq            245
			throw new DocumentException(MessageLocalization.getComposedMessage("the.original.document.was.reused.read.it.again.from.file", new Object[0]));
	//  127  228:new             #57  <Class DocumentException>
	//  128  231:dup             
	//  129  232:ldc1            #153 <String "the.original.document.was.reused.read.it.again.from.file">
	//  130  234:iconst_0        
	//  131  235:anewarray       Object[]
	//  132  238:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  133  241:invokespecial   #154 <Method void DocumentException(String)>
	//  134  244:athrow          
		pdfreader.setTampered(true);
	//  135  245:aload_1         
	//  136  246:iconst_1        
	//  137  247:invokevirtual   #158 <Method void PdfReader.setTampered(boolean)>
		reader = pdfreader;
	//  138  250:aload_0         
	//  139  251:aload_1         
	//  140  252:putfield        #160 <Field PdfReader reader>
		file = pdfreader.getSafeFile();
	//  141  255:aload_0         
	//  142  256:aload_1         
	//  143  257:invokevirtual   #164 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//  144  260:putfield        #166 <Field RandomAccessFileOrArray file>
		append = flag;
	//  145  263:aload_0         
	//  146  264:iload           4
	//  147  266:putfield        #168 <Field boolean append>
		if(pdfreader.isEncrypted() && (flag || PdfReader.unethicalreading))
	//* 148  269:aload_1         
	//* 149  270:invokevirtual   #171 <Method boolean PdfReader.isEncrypted()>
	//* 150  273:ifeq            302
	//* 151  276:iload           4
	//* 152  278:ifne            287
	//* 153  281:getstatic       #174 <Field boolean PdfReader.unethicalreading>
	//* 154  284:ifeq            302
			crypto = new PdfEncryption(pdfreader.getDecrypt());
	//  155  287:aload_0         
	//  156  288:new             #176 <Class PdfEncryption>
	//  157  291:dup             
	//  158  292:aload_1         
	//  159  293:invokevirtual   #180 <Method PdfEncryption PdfReader.getDecrypt()>
	//  160  296:invokespecial   #183 <Method void PdfEncryption(PdfEncryption)>
	//  161  299:putfield        #187 <Field PdfEncryption crypto>
		if(flag)
	//* 162  302:iload           4
	//* 163  304:ifeq            500
		{
			if(pdfreader.isRebuilt())
	//* 164  307:aload_1         
	//* 165  308:invokevirtual   #190 <Method boolean PdfReader.isRebuilt()>
	//* 166  311:ifeq            331
				throw new DocumentException(MessageLocalization.getComposedMessage("append.mode.requires.a.document.without.errors.even.if.recovery.was.possible", new Object[0]));
	//  167  314:new             #57  <Class DocumentException>
	//  168  317:dup             
	//  169  318:ldc1            #192 <String "append.mode.requires.a.document.without.errors.even.if.recovery.was.possible">
	//  170  320:iconst_0        
	//  171  321:anewarray       Object[]
	//  172  324:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  173  327:invokespecial   #154 <Method void DocumentException(String)>
	//  174  330:athrow          
			pdf_version.setAppendmode(true);
	//  175  331:aload_0         
	//  176  332:getfield        #196 <Field PdfVersionImp pdf_version>
	//  177  335:iconst_1        
	//  178  336:invokevirtual   #201 <Method void PdfVersionImp.setAppendmode(boolean)>
			if(c == 0)
	//* 179  339:iload_3         
	//* 180  340:ifne            389
				pdf_version.setPdfVersion(pdfreader.getPdfVersion());
	//  181  343:aload_0         
	//  182  344:getfield        #196 <Field PdfVersionImp pdf_version>
	//  183  347:aload_1         
	//  184  348:invokevirtual   #205 <Method char PdfReader.getPdfVersion()>
	//  185  351:invokevirtual   #209 <Method void PdfVersionImp.setPdfVersion(char)>
			else
	//* 186  354:sipush          8192
	//* 187  357:newarray        byte[]
	//* 188  359:astore_2        
	//* 189  360:aload_0         
	//* 190  361:getfield        #166 <Field RandomAccessFileOrArray file>
	//* 191  364:aload_2         
	//* 192  365:invokevirtual   #215 <Method int RandomAccessFileOrArray.read(byte[])>
	//* 193  368:istore          5
	//* 194  370:iload           5
	//* 195  372:ifle            400
	//* 196  375:aload_0         
	//* 197  376:getfield        #219 <Field OutputStreamCounter os>
	//* 198  379:aload_2         
	//* 199  380:iconst_0        
	//* 200  381:iload           5
	//* 201  383:invokevirtual   #225 <Method void OutputStreamCounter.write(byte[], int, int)>
	//* 202  386:goto            360
				pdf_version.setPdfVersion(c);
	//  203  389:aload_0         
	//  204  390:getfield        #196 <Field PdfVersionImp pdf_version>
	//  205  393:iload_3         
	//  206  394:invokevirtual   #209 <Method void PdfVersionImp.setPdfVersion(char)>
			outputstream = ((OutputStream) (new byte[8192]));
			do
			{
				int i = file.read(((byte []) (outputstream)));
				if(i <= 0)
					break;
				os.write(((byte []) (outputstream)), 0, i);
			} while(true);
	//* 207  397:goto            354
			prevxref = pdfreader.getLastXref();
	//  208  400:aload_0         
	//  209  401:aload_1         
	//  210  402:invokevirtual   #229 <Method long PdfReader.getLastXref()>
	//  211  405:putfield        #233 <Field long prevxref>
			pdfreader.setAppendable(true);
	//  212  408:aload_1         
	//  213  409:iconst_1        
	//  214  410:invokevirtual   #236 <Method void PdfReader.setAppendable(boolean)>
		} else
	//* 215  413:aload_1         
	//* 216  414:invokevirtual   #239 <Method boolean PdfReader.isTagged()>
	//* 217  417:ifeq            424
	//* 218  420:aload_0         
	//* 219  421:invokevirtual   #242 <Method void setTagged()>
	//* 220  424:aload_0         
	//* 221  425:invokespecial   #245 <Method void PdfWriter.open()>
	//* 222  428:aload_0         
	//* 223  429:getfield        #249 <Field PdfDocument pdf>
	//* 224  432:aload_0         
	//* 225  433:invokevirtual   #253 <Method void PdfDocument.addWriter(PdfWriter)>
	//* 226  436:iload           4
	//* 227  438:ifeq            487
	//* 228  441:aload_0         
	//* 229  442:getfield        #257 <Field PdfWriter$PdfBody body>
	//* 230  445:aload_1         
	//* 231  446:invokevirtual   #261 <Method int PdfReader.getXrefSize()>
	//* 232  449:invokevirtual   #267 <Method void PdfWriter$PdfBody.setRefnum(int)>
	//* 233  452:aload_0         
	//* 234  453:new             #76  <Class IntHashtable>
	//* 235  456:dup             
	//* 236  457:invokespecial   #77  <Method void IntHashtable()>
	//* 237  460:putfield        #269 <Field IntHashtable marked>
	//* 238  463:aload_1         
	//* 239  464:invokevirtual   #272 <Method boolean PdfReader.isNewXrefType()>
	//* 240  467:ifeq            475
	//* 241  470:aload_0         
	//* 242  471:iconst_1        
	//* 243  472:putfield        #275 <Field boolean fullCompression>
	//* 244  475:aload_1         
	//* 245  476:invokevirtual   #278 <Method boolean PdfReader.isHybridXref()>
	//* 246  479:ifeq            487
	//* 247  482:aload_0         
	//* 248  483:iconst_0        
	//* 249  484:putfield        #275 <Field boolean fullCompression>
	//* 250  487:aload_0         
	//* 251  488:aload_1         
	//* 252  489:invokevirtual   #261 <Method int PdfReader.getXrefSize()>
	//* 253  492:putfield        #280 <Field int initialXrefSize>
	//* 254  495:aload_0         
	//* 255  496:invokevirtual   #283 <Method void readColorProfile()>
	//* 256  499:return          
		if(c == 0)
	//* 257  500:iload_3         
	//* 258  501:ifne            515
			super.setPdfVersion(pdfreader.getPdfVersion());
	//  259  504:aload_0         
	//  260  505:aload_1         
	//  261  506:invokevirtual   #205 <Method char PdfReader.getPdfVersion()>
	//  262  509:invokespecial   #284 <Method void PdfWriter.setPdfVersion(char)>
		else
	//* 263  512:goto            413
			super.setPdfVersion(c);
	//  264  515:aload_0         
	//  265  516:iload_3         
	//  266  517:invokespecial   #284 <Method void PdfWriter.setPdfVersion(char)>
		if(pdfreader.isTagged())
			setTagged();
		super.open();
		pdf.addWriter(((PdfWriter) (this)));
		if(flag)
		{
			body.setRefnum(pdfreader.getXrefSize());
			marked = new IntHashtable();
			if(pdfreader.isNewXrefType())
				fullCompression = true;
			if(pdfreader.isHybridXref())
				fullCompression = false;
		}
		initialXrefSize = pdfreader.getXrefSize();
		readColorProfile();
	//* 267  520:goto            413
	}

	private void addOrder(PdfLayer pdflayer, PdfArray pdfarray, Map map)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
_L5:
		if(i >= pdfarray.size()) goto _L2; else goto _L1
	//    2    3:iload           4
	//    3    5:aload_2         
	//    4    6:invokevirtual   #293 <Method int PdfArray.size()>
	//    5    9:icmpge          166
_L1:
		Object obj = ((Object) (pdfarray.getPdfObject(i)));
	//    6   12:aload_2         
	//    7   13:iload           4
	//    8   15:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//    9   18:astore          6
		if(!((PdfObject) (obj)).isIndirect()) goto _L4; else goto _L3
	//   10   20:aload           6
	//   11   22:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//   12   25:ifeq            139
_L3:
		int j;
		obj = ((Object) ((PdfLayer)map.get(((Object) (((PdfObject) (obj)).toString())))));
	//   13   28:aload_3         
	//   14   29:aload           6
	//   15   31:invokevirtual   #306 <Method String PdfObject.toString()>
	//   16   34:invokeinterface #312 <Method Object Map.get(Object)>
	//   17   39:checkcast       #314 <Class PdfLayer>
	//   18   42:astore          6
		j = i;
	//   19   44:iload           4
	//   20   46:istore          5
		if(obj != null)
	//*  21   48:aload           6
	//*  22   50:ifnull          130
		{
			((PdfLayer) (obj)).setOnPanel(true);
	//   23   53:aload           6
	//   24   55:iconst_1        
	//   25   56:invokevirtual   #317 <Method void PdfLayer.setOnPanel(boolean)>
			registerLayer(((PdfOCG) (obj)));
	//   26   59:aload_0         
	//   27   60:aload           6
	//   28   62:invokevirtual   #321 <Method void registerLayer(PdfOCG)>
			if(pdflayer != null)
	//*  29   65:aload_1         
	//*  30   66:ifnull          75
				pdflayer.addChild(((PdfLayer) (obj)));
	//   31   69:aload_1         
	//   32   70:aload           6
	//   33   72:invokevirtual   #325 <Method void PdfLayer.addChild(PdfLayer)>
			j = i;
	//   34   75:iload           4
	//   35   77:istore          5
			if(pdfarray.size() > i + 1)
	//*  36   79:aload_2         
	//*  37   80:invokevirtual   #293 <Method int PdfArray.size()>
	//*  38   83:iload           4
	//*  39   85:iconst_1        
	//*  40   86:iadd            
	//*  41   87:icmple          130
			{
				j = i;
	//   42   90:iload           4
	//   43   92:istore          5
				if(pdfarray.getPdfObject(i + 1).isArray())
	//*  44   94:aload_2         
	//*  45   95:iload           4
	//*  46   97:iconst_1        
	//*  47   98:iadd            
	//*  48   99:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  49  102:invokevirtual   #328 <Method boolean PdfObject.isArray()>
	//*  50  105:ifeq            130
				{
					j = i + 1;
	//   51  108:iload           4
	//   52  110:iconst_1        
	//   53  111:iadd            
	//   54  112:istore          5
					addOrder(((PdfLayer) (obj)), (PdfArray)pdfarray.getPdfObject(j), map);
	//   55  114:aload_0         
	//   56  115:aload           6
	//   57  117:aload_2         
	//   58  118:iload           5
	//   59  120:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//   60  123:checkcast       #290 <Class PdfArray>
	//   61  126:aload_3         
	//   62  127:invokespecial   #330 <Method void addOrder(PdfLayer, PdfArray, Map)>
				}
			}
		}
_L7:
		i = j + 1;
	//   63  130:iload           5
	//   64  132:iconst_1        
	//   65  133:iadd            
	//   66  134:istore          4
		  goto _L5
	//*  67  136:goto            3
_L4:
		j = i;
	//   68  139:iload           4
	//   69  141:istore          5
		if(!((PdfObject) (obj)).isArray()) goto _L7; else goto _L6
	//   70  143:aload           6
	//   71  145:invokevirtual   #328 <Method boolean PdfObject.isArray()>
	//   72  148:ifeq            130
_L6:
		obj = ((Object) ((PdfArray)obj));
	//   73  151:aload           6
	//   74  153:checkcast       #290 <Class PdfArray>
	//   75  156:astore          6
		if(!((PdfArray) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_167;
	//   76  158:aload           6
	//   77  160:invokevirtual   #333 <Method boolean PdfArray.isEmpty()>
	//   78  163:ifeq            167
_L2:
		return;
	//   79  166:return          
		Object obj1 = ((Object) (((PdfArray) (obj)).getPdfObject(0)));
	//   80  167:aload           6
	//   81  169:iconst_0        
	//   82  170:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//   83  173:astore          7
		if(((PdfObject) (obj1)).isString())
	//*  84  175:aload           7
	//*  85  177:invokevirtual   #336 <Method boolean PdfObject.isString()>
	//*  86  180:ifeq            280
		{
			obj1 = ((Object) (new PdfLayer(((PdfObject) (obj1)).toString())));
	//   87  183:new             #314 <Class PdfLayer>
	//   88  186:dup             
	//   89  187:aload           7
	//   90  189:invokevirtual   #306 <Method String PdfObject.toString()>
	//   91  192:invokespecial   #337 <Method void PdfLayer(String)>
	//   92  195:astore          7
			((PdfLayer) (obj1)).setOnPanel(true);
	//   93  197:aload           7
	//   94  199:iconst_1        
	//   95  200:invokevirtual   #317 <Method void PdfLayer.setOnPanel(boolean)>
			registerLayer(((PdfOCG) (obj1)));
	//   96  203:aload_0         
	//   97  204:aload           7
	//   98  206:invokevirtual   #321 <Method void registerLayer(PdfOCG)>
			if(pdflayer != null)
	//*  99  209:aload_1         
	//* 100  210:ifnull          219
				pdflayer.addChild(((PdfLayer) (obj1)));
	//  101  213:aload_1         
	//  102  214:aload           7
	//  103  216:invokevirtual   #325 <Method void PdfLayer.addChild(PdfLayer)>
			PdfArray pdfarray1 = new PdfArray();
	//  104  219:new             #290 <Class PdfArray>
	//  105  222:dup             
	//  106  223:invokespecial   #338 <Method void PdfArray()>
	//  107  226:astore          8
			for(obj = ((Object) (((PdfArray) (obj)).listIterator())); ((Iterator) (obj)).hasNext(); pdfarray1.add((PdfObject)((Iterator) (obj)).next()));
	//  108  228:aload           6
	//  109  230:invokevirtual   #342 <Method java.util.ListIterator PdfArray.listIterator()>
	//  110  233:astore          6
	//  111  235:aload           6
	//  112  237:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//  113  242:ifeq            264
	//  114  245:aload           8
	//  115  247:aload           6
	//  116  249:invokeinterface #351 <Method Object Iterator.next()>
	//  117  254:checkcast       #299 <Class PdfObject>
	//  118  257:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//  119  260:pop             
	//* 120  261:goto            235
			addOrder(((PdfLayer) (obj1)), pdfarray1, map);
	//  121  264:aload_0         
	//  122  265:aload           7
	//  123  267:aload           8
	//  124  269:aload_3         
	//  125  270:invokespecial   #330 <Method void addOrder(PdfLayer, PdfArray, Map)>
			j = i;
	//  126  273:iload           4
	//  127  275:istore          5
		} else
	//* 128  277:goto            130
		{
			addOrder(pdflayer, (PdfArray)obj1, map);
	//  129  280:aload_0         
	//  130  281:aload_1         
	//  131  282:aload           7
	//  132  284:checkcast       #290 <Class PdfArray>
	//  133  287:aload_3         
	//  134  288:invokespecial   #330 <Method void addOrder(PdfLayer, PdfArray, Map)>
			j = i;
	//  135  291:iload           4
	//  136  293:istore          5
		}
		  goto _L7
	//* 137  295:goto            130
	}

	static void findAllObjects(PdfReader pdfreader, PdfObject pdfobject, IntHashtable inthashtable)
	{
		if(pdfobject != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		switch(pdfobject.type())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #362 <Method int PdfObject.type()>
		{
	//*   5    9:tableswitch     5 10: default 48
	//	               5 49
	//	               6 129
	//	               7 129
	//	               8 48
	//	               9 48
	//	               10 81
		case 8: // '\b'
		case 9: // '\t'
		default:
			return;
	//    6   48:return          

		case 5: // '\005'
			pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//    7   49:aload_1         
	//    8   50:checkcast       #290 <Class PdfArray>
	//    9   53:astore_1        
			int i = 0;
	//   10   54:iconst_0        
	//   11   55:istore_3        
			while(i < ((PdfArray) (pdfobject)).size()) 
	//*  12   56:iload_3         
	//*  13   57:aload_1         
	//*  14   58:invokevirtual   #293 <Method int PdfArray.size()>
	//*  15   61:icmpge          4
			{
				findAllObjects(pdfreader, ((PdfArray) (pdfobject)).getPdfObject(i), inthashtable);
	//   16   64:aload_0         
	//   17   65:aload_1         
	//   18   66:iload_3         
	//   19   67:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//   20   70:aload_2         
	//   21   71:invokestatic    #364 <Method void findAllObjects(PdfReader, PdfObject, IntHashtable)>
				i++;
	//   22   74:iload_3         
	//   23   75:iconst_1        
	//   24   76:iadd            
	//   25   77:istore_3        
			}
			break;

	//*  26   78:goto            56
		case 10: // '\n'
			PRIndirectReference prindirectreference = (PRIndirectReference)pdfobject;
	//   27   81:aload_1         
	//   28   82:checkcast       #366 <Class PRIndirectReference>
	//   29   85:astore          4
			if(pdfreader == prindirectreference.getReader() && !inthashtable.containsKey(prindirectreference.getNumber()))
	//*  30   87:aload_0         
	//*  31   88:aload           4
	//*  32   90:invokevirtual   #370 <Method PdfReader PRIndirectReference.getReader()>
	//*  33   93:if_acmpne       4
	//*  34   96:aload_2         
	//*  35   97:aload           4
	//*  36   99:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//*  37  102:invokevirtual   #377 <Method boolean IntHashtable.containsKey(int)>
	//*  38  105:ifne            4
			{
				inthashtable.put(prindirectreference.getNumber(), 1);
	//   39  108:aload_2         
	//   40  109:aload           4
	//   41  111:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//   42  114:iconst_1        
	//   43  115:invokevirtual   #381 <Method int IntHashtable.put(int, int)>
	//   44  118:pop             
				findAllObjects(pdfreader, PdfReader.getPdfObject(pdfobject), inthashtable);
	//   45  119:aload_0         
	//   46  120:aload_1         
	//   47  121:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   48  124:aload_2         
	//   49  125:invokestatic    #364 <Method void findAllObjects(PdfReader, PdfObject, IntHashtable)>
				return;
	//   50  128:return          
			}
			break;

		case 6: // '\006'
		case 7: // '\007'
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//   51  129:aload_1         
	//   52  130:checkcast       #386 <Class PdfDictionary>
	//   53  133:astore_1        
			Iterator iterator = ((PdfDictionary) (pdfobject)).getKeys().iterator();
	//   54  134:aload_1         
	//   55  135:invokevirtual   #390 <Method Set PdfDictionary.getKeys()>
	//   56  138:invokeinterface #396 <Method Iterator Set.iterator()>
	//   57  143:astore          4
			while(iterator.hasNext()) 
	//*  58  145:aload           4
	//*  59  147:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  60  152:ifeq            4
				findAllObjects(pdfreader, ((PdfDictionary) (pdfobject)).get((PdfName)iterator.next()), inthashtable);
	//   61  155:aload_0         
	//   62  156:aload_1         
	//   63  157:aload           4
	//   64  159:invokeinterface #351 <Method Object Iterator.next()>
	//   65  164:checkcast       #398 <Class PdfName>
	//   66  167:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   67  170:aload_2         
	//   68  171:invokestatic    #364 <Method void findAllObjects(PdfReader, PdfObject, IntHashtable)>
			break;
		}
		if(true) goto _L1; else goto _L3
	//   69  174:goto            145
_L3:
	}

	private void flattenAnnotations(boolean flag)
	{
		int j;
		if(append)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field boolean append>
	//*   2    4:ifeq            47
			if(flag)
	//*   3    7:iload_1         
	//*   4    8:ifeq            29
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("freetext.flattening.is.not.supported.in.append.mode", new Object[0]));
	//    5   11:new             #404 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc2            #406 <String "freetext.flattening.is.not.supported.in.append.mode">
	//    8   18:iconst_0        
	//    9   19:anewarray       Object[]
	//   10   22:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   25:invokespecial   #407 <Method void IllegalArgumentException(String)>
	//   12   28:athrow          
			else
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("annotation.flattening.is.not.supported.in.append.mode", new Object[0]));
	//   13   29:new             #404 <Class IllegalArgumentException>
	//   14   32:dup             
	//   15   33:ldc2            #409 <String "annotation.flattening.is.not.supported.in.append.mode">
	//   16   36:iconst_0        
	//   17   37:anewarray       Object[]
	//   18   40:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   43:invokespecial   #407 <Method void IllegalArgumentException(String)>
	//   20   46:athrow          
		j = 1;
	//   21   47:iconst_1        
	//   22   48:istore_3        
_L2:
		PdfDictionary pdfdictionary;
		PdfArray pdfarray;
		if(j > reader.getNumberOfPages())
			break MISSING_BLOCK_LABEL_737;
	//   23   49:iload_3         
	//   24   50:aload_0         
	//   25   51:getfield        #160 <Field PdfReader reader>
	//   26   54:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//   27   57:icmpgt          737
		pdfdictionary = reader.getPageN(j);
	//   28   60:aload_0         
	//   29   61:getfield        #160 <Field PdfReader reader>
	//   30   64:iload_3         
	//   31   65:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//   32   68:astore          9
		pdfarray = pdfdictionary.getAsArray(PdfName.ANNOTS);
	//   33   70:aload           9
	//   34   72:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//   35   75:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   36   78:astore          10
		if(pdfarray != null)
			break; /* Loop/switch isn't completed */
	//   37   80:aload           10
	//   38   82:ifnonnull       92
_L11:
		j++;
	//   39   85:iload_3         
	//   40   86:iconst_1        
	//   41   87:iadd            
	//   42   88:istore_3        
		if(true) goto _L2; else goto _L1
	//   43   89:goto            49
_L1:
		int i = 0;
	//   44   92:iconst_0        
	//   45   93:istore_2        
_L4:
		int k;
		PdfObject pdfobject;
		if(i >= pdfarray.size())
			break MISSING_BLOCK_LABEL_706;
	//   46   94:iload_2         
	//   47   95:aload           10
	//   48   97:invokevirtual   #293 <Method int PdfArray.size()>
	//   49  100:icmpge          706
		pdfobject = pdfarray.getDirectObject(i);
	//   50  103:aload           10
	//   51  105:iload_2         
	//   52  106:invokevirtual   #427 <Method PdfObject PdfArray.getDirectObject(int)>
	//   53  109:astore          6
		if(!(pdfobject instanceof PdfIndirectReference) || pdfobject.isIndirect())
			break; /* Loop/switch isn't completed */
	//   54  111:aload           6
	//   55  113:instanceof      #429 <Class PdfIndirectReference>
	//   56  116:ifeq            138
	//   57  119:aload           6
	//   58  121:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//   59  124:ifne            138
		k = i;
	//   60  127:iload_2         
	//   61  128:istore          4
_L6:
		i = k + 1;
	//   62  130:iload           4
	//   63  132:iconst_1        
	//   64  133:iadd            
	//   65  134:istore_2        
		if(true) goto _L4; else goto _L3
	//   66  135:goto            94
_L3:
		k = i;
	//   67  138:iload_2         
	//   68  139:istore          4
		if(!(pdfobject instanceof PdfDictionary)) goto _L6; else goto _L5
	//   69  141:aload           6
	//   70  143:instanceof      #386 <Class PdfDictionary>
	//   71  146:ifeq            130
_L5:
		Object obj2 = ((Object) ((PdfDictionary)pdfobject));
	//   72  149:aload           6
	//   73  151:checkcast       #386 <Class PdfDictionary>
	//   74  154:astore          11
		if(!flag) goto _L8; else goto _L7
	//   75  156:iload_1         
	//   76  157:ifeq            482
_L7:
		k = i;
	//   77  160:iload_2         
	//   78  161:istore          4
		if(!((Object) (((PdfDictionary) (obj2)).get(PdfName.SUBTYPE))).equals(((Object) (PdfName.FREETEXT)))) goto _L6; else goto _L9
	//   79  163:aload           11
	//   80  165:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//   81  168:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   82  171:getstatic       #435 <Field PdfName PdfName.FREETEXT>
	//   83  174:invokevirtual   #439 <Method boolean Object.equals(Object)>
	//   84  177:ifeq            130
_L9:
		PdfNumber pdfnumber = ((PdfDictionary) (obj2)).getAsNumber(PdfName.F);
	//   85  180:aload           11
	//   86  182:getstatic       #442 <Field PdfName PdfName.F>
	//   87  185:invokevirtual   #446 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   88  188:astore          6
		int l;
		if(pdfnumber != null)
	//*  89  190:aload           6
	//*  90  192:ifnull          505
			l = pdfnumber.intValue();
	//   91  195:aload           6
	//   92  197:invokevirtual   #451 <Method int PdfNumber.intValue()>
	//   93  200:istore          5
		else
	//*  94  202:iload_2         
	//*  95  203:istore          4
	//*  96  205:iload           5
	//*  97  207:iconst_4        
	//*  98  208:iand            
	//*  99  209:ifeq            130
	//* 100  212:iload_2         
	//* 101  213:istore          4
	//* 102  215:iload           5
	//* 103  217:iconst_2        
	//* 104  218:iand            
	//* 105  219:ifne            130
	//* 106  222:aload           11
	//* 107  224:getstatic       #454 <Field PdfName PdfName.AP>
	//* 108  227:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 109  230:astore          6
	//* 110  232:iload_2         
	//* 111  233:istore          4
	//* 112  235:aload           6
	//* 113  237:ifnull          130
	//* 114  240:aload           6
	//* 115  242:instanceof      #429 <Class PdfIndirectReference>
	//* 116  245:ifeq            511
	//* 117  248:aload           6
	//* 118  250:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 119  253:checkcast       #386 <Class PdfDictionary>
	//* 120  256:astore          7
	//* 121  258:aload           7
	//* 122  260:getstatic       #457 <Field PdfName PdfName.N>
	//* 123  263:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 124  266:astore          6
	//* 125  268:aload           7
	//* 126  270:getstatic       #457 <Field PdfName PdfName.N>
	//* 127  273:invokevirtual   #461 <Method PdfStream PdfDictionary.getAsStream(PdfName)>
	//* 128  276:astore          12
	//* 129  278:aconst_null     
	//* 130  279:astore          8
	//* 131  281:aload           6
	//* 132  283:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 133  286:astore          13
	//* 134  288:aload           6
	//* 135  290:instanceof      #429 <Class PdfIndirectReference>
	//* 136  293:ifeq            521
	//* 137  296:aload           6
	//* 138  298:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 139  301:ifne            521
	//* 140  304:new             #463 <Class PdfAppearance>
	//* 141  307:dup             
	//* 142  308:aload           6
	//* 143  310:checkcast       #429 <Class PdfIndirectReference>
	//* 144  313:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//* 145  316:astore          6
	//* 146  318:iload_2         
	//* 147  319:istore          4
	//* 148  321:aload           6
	//* 149  323:ifnull          130
	//* 150  326:aload           11
	//* 151  328:getstatic       #469 <Field PdfName PdfName.RECT>
	//* 152  331:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 153  334:invokestatic    #473 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//* 154  337:astore          7
	//* 155  339:aload           12
	//* 156  341:getstatic       #476 <Field PdfName PdfName.BBOX>
	//* 157  344:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 158  347:invokestatic    #473 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//* 159  350:astore          11
	//* 160  352:aload_0         
	//* 161  353:iload_3         
	//* 162  354:invokevirtual   #480 <Method PdfContentByte getOverContent(int)>
	//* 163  357:astore          8
	//* 164  359:aload           8
	//* 165  361:ldc2            #482 <String "Q ">
	//* 166  364:invokevirtual   #487 <Method void PdfContentByte.setLiteral(String)>
	//* 167  367:aload           12
	//* 168  369:getstatic       #490 <Field PdfName PdfName.MATRIX>
	//* 169  372:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 170  375:ifnull          662
	//* 171  378:aload_0         
	//* 172  379:getfield        #127 <Field double[] DEFAULT_MATRIX>
	//* 173  382:aload           12
	//* 174  384:getstatic       #490 <Field PdfName PdfName.MATRIX>
	//* 175  387:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 176  390:invokevirtual   #494 <Method double[] PdfArray.asDoubleArray()>
	//* 177  393:invokestatic    #499 <Method boolean Arrays.equals(double[], double[])>
	//* 178  396:ifne            662
	//* 179  399:aload_0         
	//* 180  400:aload           11
	//* 181  402:aload           12
	//* 182  404:getstatic       #490 <Field PdfName PdfName.MATRIX>
	//* 183  407:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 184  410:invokevirtual   #494 <Method double[] PdfArray.asDoubleArray()>
	//* 185  413:invokespecial   #503 <Method Rectangle transformBBoxByMatrix(Rectangle, double[])>
	//* 186  416:astore          11
	//* 187  418:aload           8
	//* 188  420:aload           6
	//* 189  422:aload           7
	//* 190  424:invokevirtual   #509 <Method float Rectangle.getWidth()>
	//* 191  427:aload           11
	//* 192  429:invokevirtual   #509 <Method float Rectangle.getWidth()>
	//* 193  432:fdiv            
	//* 194  433:fconst_0        
	//* 195  434:fconst_0        
	//* 196  435:aload           7
	//* 197  437:invokevirtual   #512 <Method float Rectangle.getHeight()>
	//* 198  440:aload           11
	//* 199  442:invokevirtual   #512 <Method float Rectangle.getHeight()>
	//* 200  445:fdiv            
	//* 201  446:aload           7
	//* 202  448:invokevirtual   #515 <Method float Rectangle.getLeft()>
	//* 203  451:aload           7
	//* 204  453:invokevirtual   #518 <Method float Rectangle.getBottom()>
	//* 205  456:invokevirtual   #522 <Method void PdfContentByte.addTemplate(PdfTemplate, float, float, float, float, float, float)>
	//* 206  459:aload           8
	//* 207  461:ldc2            #524 <String "q ">
	//* 208  464:invokevirtual   #487 <Method void PdfContentByte.setLiteral(String)>
	//* 209  467:aload           10
	//* 210  469:iload_2         
	//* 211  470:invokevirtual   #527 <Method PdfObject PdfArray.remove(int)>
	//* 212  473:pop             
	//* 213  474:iload_2         
	//* 214  475:iconst_1        
	//* 215  476:isub            
	//* 216  477:istore          4
	//* 217  479:goto            130
	//* 218  482:aload           11
	//* 219  484:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//* 220  487:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 221  490:getstatic       #530 <Field PdfName PdfName.WIDGET>
	//* 222  493:invokevirtual   #439 <Method boolean Object.equals(Object)>
	//* 223  496:ifeq            180
	//* 224  499:iload_2         
	//* 225  500:istore          4
	//* 226  502:goto            130
			l = 0;
	//  227  505:iconst_0        
	//  228  506:istore          5
		k = i;
		if((l & 4) != 0)
		{
			k = i;
			if((l & 2) == 0)
			{
				Object obj = ((Object) (((PdfDictionary) (obj2)).get(PdfName.AP)));
				k = i;
				if(obj != null)
				{
					Object obj1;
					PdfContentByte pdfcontentbyte;
					PdfStream pdfstream;
					Object obj3;
					if(obj instanceof PdfIndirectReference)
						obj1 = ((Object) ((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))));
					else
	//* 229  508:goto            202
						obj1 = ((Object) ((PdfDictionary)obj));
	//  230  511:aload           6
	//  231  513:checkcast       #386 <Class PdfDictionary>
	//  232  516:astore          7
					obj = ((Object) (((PdfDictionary) (obj1)).get(PdfName.N)));
					pdfstream = ((PdfDictionary) (obj1)).getAsStream(PdfName.N);
					pdfcontentbyte = null;
					obj3 = ((Object) (PdfReader.getPdfObject(((PdfObject) (obj)))));
					if((obj instanceof PdfIndirectReference) && !((PdfObject) (obj)).isIndirect())
						obj = ((Object) (new PdfAppearance((PdfIndirectReference)obj)));
					else
	//* 233  518:goto            258
					if(obj3 instanceof PdfStream)
	//* 234  521:aload           13
	//* 235  523:instanceof      #532 <Class PdfStream>
	//* 236  526:ifeq            560
					{
						((PdfDictionary)obj3).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
	//  237  529:aload           13
	//  238  531:checkcast       #386 <Class PdfDictionary>
	//  239  534:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//  240  537:getstatic       #535 <Field PdfName PdfName.FORM>
	//  241  540:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
						obj = ((Object) (new PdfAppearance((PdfIndirectReference)obj)));
	//  242  543:new             #463 <Class PdfAppearance>
	//  243  546:dup             
	//  244  547:aload           6
	//  245  549:checkcast       #429 <Class PdfIndirectReference>
	//  246  552:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//  247  555:astore          6
					} else
	//* 248  557:goto            318
					{
						obj = ((Object) (pdfcontentbyte));
	//  249  560:aload           8
	//  250  562:astore          6
						if(((PdfObject) (obj3)).isDictionary())
	//* 251  564:aload           13
	//* 252  566:invokevirtual   #541 <Method boolean PdfObject.isDictionary()>
	//* 253  569:ifeq            318
						{
							obj1 = ((Object) (((PdfDictionary) (obj1)).getAsName(PdfName.AS)));
	//  254  572:aload           7
	//  255  574:getstatic       #544 <Field PdfName PdfName.AS>
	//  256  577:invokevirtual   #548 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  257  580:astore          7
							obj = ((Object) (pdfcontentbyte));
	//  258  582:aload           8
	//  259  584:astore          6
							if(obj1 != null)
	//* 260  586:aload           7
	//* 261  588:ifnull          318
							{
								obj3 = ((Object) ((PdfIndirectReference)((PdfDictionary)obj3).get(((PdfName) (obj1)))));
	//  262  591:aload           13
	//  263  593:checkcast       #386 <Class PdfDictionary>
	//  264  596:aload           7
	//  265  598:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  266  601:checkcast       #429 <Class PdfIndirectReference>
	//  267  604:astore          13
								obj = ((Object) (pdfcontentbyte));
	//  268  606:aload           8
	//  269  608:astore          6
								if(obj3 != null)
	//* 270  610:aload           13
	//* 271  612:ifnull          318
								{
									obj1 = ((Object) (new PdfAppearance(((PdfIndirectReference) (obj3)))));
	//  272  615:new             #463 <Class PdfAppearance>
	//  273  618:dup             
	//  274  619:aload           13
	//  275  621:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//  276  624:astore          7
									obj = obj1;
	//  277  626:aload           7
	//  278  628:astore          6
									if(((PdfIndirectReference) (obj3)).isIndirect())
	//* 279  630:aload           13
	//* 280  632:invokevirtual   #549 <Method boolean PdfIndirectReference.isIndirect()>
	//* 281  635:ifeq            318
									{
										((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj3)))).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
	//  282  638:aload           13
	//  283  640:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  284  643:checkcast       #386 <Class PdfDictionary>
	//  285  646:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//  286  649:getstatic       #535 <Field PdfName PdfName.FORM>
	//  287  652:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
										obj = obj1;
	//  288  655:aload           7
	//  289  657:astore          6
									}
								}
							}
						}
					}
					k = i;
					if(obj != null)
					{
						obj1 = ((Object) (PdfReader.getNormalizedRectangle(((PdfDictionary) (obj2)).getAsArray(PdfName.RECT))));
						obj2 = ((Object) (PdfReader.getNormalizedRectangle(((PdfDictionary) (pdfstream)).getAsArray(PdfName.BBOX))));
						pdfcontentbyte = getOverContent(j);
						pdfcontentbyte.setLiteral("Q ");
						if(((PdfDictionary) (pdfstream)).getAsArray(PdfName.MATRIX) != null && !Arrays.equals(DEFAULT_MATRIX, ((PdfDictionary) (pdfstream)).getAsArray(PdfName.MATRIX).asDoubleArray()))
						{
							obj2 = ((Object) (transformBBoxByMatrix(((Rectangle) (obj2)), ((PdfDictionary) (pdfstream)).getAsArray(PdfName.MATRIX).asDoubleArray())));
							pdfcontentbyte.addTemplate(((PdfTemplate) (obj)), ((Rectangle) (obj1)).getWidth() / ((Rectangle) (obj2)).getWidth(), 0.0F, 0.0F, ((Rectangle) (obj1)).getHeight() / ((Rectangle) (obj2)).getHeight(), ((Rectangle) (obj1)).getLeft(), ((Rectangle) (obj1)).getBottom());
						} else
	//* 290  659:goto            318
						{
							pdfcontentbyte.addTemplate(((PdfTemplate) (obj)), ((Rectangle) (obj1)).getWidth() / ((Rectangle) (obj2)).getWidth(), 0.0F, 0.0F, ((Rectangle) (obj1)).getHeight() / ((Rectangle) (obj2)).getHeight(), ((Rectangle) (obj1)).getLeft(), ((Rectangle) (obj1)).getBottom());
	//  291  662:aload           8
	//  292  664:aload           6
	//  293  666:aload           7
	//  294  668:invokevirtual   #509 <Method float Rectangle.getWidth()>
	//  295  671:aload           11
	//  296  673:invokevirtual   #509 <Method float Rectangle.getWidth()>
	//  297  676:fdiv            
	//  298  677:fconst_0        
	//  299  678:fconst_0        
	//  300  679:aload           7
	//  301  681:invokevirtual   #512 <Method float Rectangle.getHeight()>
	//  302  684:aload           11
	//  303  686:invokevirtual   #512 <Method float Rectangle.getHeight()>
	//  304  689:fdiv            
	//  305  690:aload           7
	//  306  692:invokevirtual   #515 <Method float Rectangle.getLeft()>
	//  307  695:aload           7
	//  308  697:invokevirtual   #518 <Method float Rectangle.getBottom()>
	//  309  700:invokevirtual   #522 <Method void PdfContentByte.addTemplate(PdfTemplate, float, float, float, float, float, float)>
						}
						pdfcontentbyte.setLiteral("q ");
						pdfarray.remove(i);
						k = i - 1;
					}
				}
			}
		}
		  goto _L6
_L8:
		if(!((Object) (((PdfDictionary) (obj2)).get(PdfName.SUBTYPE))).equals(((Object) (PdfName.WIDGET)))) goto _L9; else goto _L10
_L10:
		k = i;
		  goto _L6
	//* 310  703:goto            459
		if(pdfarray.isEmpty())
	//* 311  706:aload           10
	//* 312  708:invokevirtual   #333 <Method boolean PdfArray.isEmpty()>
	//* 313  711:ifeq            85
		{
			PdfReader.killIndirect(pdfdictionary.get(PdfName.ANNOTS));
	//  314  714:aload           9
	//  315  716:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//  316  719:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  317  722:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//  318  725:pop             
			pdfdictionary.remove(PdfName.ANNOTS);
	//  319  726:aload           9
	//  320  728:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//  321  731:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		}
		  goto _L11
	//* 322  734:goto            85
	//  323  737:return          
	}

	private PdfArray getLastChildInNameTree(PdfDictionary pdfdictionary)
	{
		PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.KIDS);
	//    0    0:aload_1         
	//    1    1:getstatic       #560 <Field PdfName PdfName.KIDS>
	//    2    4:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    3    7:astore_2        
		if(pdfarray != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          27
			return getLastChildInNameTree(pdfarray.getAsDict(pdfarray.size() - 1));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #293 <Method int PdfArray.size()>
	//   10   18:iconst_1        
	//   11   19:isub            
	//   12   20:invokevirtual   #563 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   13   23:invokespecial   #565 <Method PdfArray getLastChildInNameTree(PdfDictionary)>
	//   14   26:areturn         
		else
			return pdfdictionary.getAsArray(PdfName.NAMES);
	//   15   27:aload_1         
	//   16   28:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   17   31:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   18   34:areturn         
	}

	private static void moveRectangle(PdfDictionary pdfdictionary, PdfReader pdfreader, int i, PdfName pdfname, String s)
	{
		pdfreader = ((PdfReader) (pdfreader.getBoxSize(i, s)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload           4
	//    3    4:invokevirtual   #574 <Method Rectangle PdfReader.getBoxSize(int, String)>
	//    4    7:astore_1        
		if(pdfreader == null)
	//*   5    8:aload_1         
	//*   6    9:ifnonnull       18
		{
			pdfdictionary.remove(pdfname);
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
			return;
	//   10   17:return          
		} else
		{
			pdfdictionary.put(pdfname, ((PdfObject) (new PdfRectangle(((Rectangle) (pdfreader))))));
	//   11   18:aload_0         
	//   12   19:aload_3         
	//   13   20:new             #576 <Class PdfRectangle>
	//   14   23:dup             
	//   15   24:aload_1         
	//   16   25:invokespecial   #579 <Method void PdfRectangle(Rectangle)>
	//   17   28:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   18   31:return          
		}
	}

	private void outlineTravel(PRIndirectReference prindirectreference)
	{
		PdfDictionary pdfdictionary;
		for(; prindirectreference != null; prindirectreference = (PRIndirectReference)pdfdictionary.get(PdfName.NEXT))
	//*   0    0:aload_1         
	//*   1    1:ifnull          73
		{
			pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(((PdfObject) (prindirectreference)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #584 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    4    8:checkcast       #386 <Class PdfDictionary>
	//    5   11:astore_2        
			PRIndirectReference prindirectreference1 = (PRIndirectReference)pdfdictionary.get(PdfName.FIRST);
	//    6   12:aload_2         
	//    7   13:getstatic       #587 <Field PdfName PdfName.FIRST>
	//    8   16:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//    9   19:checkcast       #366 <Class PRIndirectReference>
	//   10   22:astore_3        
			if(prindirectreference1 != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          32
				outlineTravel(prindirectreference1);
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokespecial   #589 <Method void outlineTravel(PRIndirectReference)>
			PdfReader.killIndirect(pdfdictionary.get(PdfName.DEST));
	//   16   32:aload_2         
	//   17   33:getstatic       #592 <Field PdfName PdfName.DEST>
	//   18   36:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   39:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//   20   42:pop             
			PdfReader.killIndirect(pdfdictionary.get(PdfName.A));
	//   21   43:aload_2         
	//   22   44:getstatic       #595 <Field PdfName PdfName.A>
	//   23   47:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   24   50:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//   25   53:pop             
			PdfReader.killIndirect(((PdfObject) (prindirectreference)));
	//   26   54:aload_1         
	//   27   55:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//   28   58:pop             
		}

	//   29   59:aload_2         
	//   30   60:getstatic       #598 <Field PdfName PdfName.NEXT>
	//   31   63:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   32   66:checkcast       #366 <Class PRIndirectReference>
	//   33   69:astore_1        
	//*  34   70:goto            0
	//   35   73:return          
	}

	private Rectangle transformBBoxByMatrix(Rectangle rectangle, double ad[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #600 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #601 <Method void ArrayList()>
	//    3    7:astore_3        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #600 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #601 <Method void ArrayList()>
	//    7   15:astore          4
		Point point = transformPoint(rectangle.getLeft(), rectangle.getBottom(), ad);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #515 <Method float Rectangle.getLeft()>
	//   11   22:f2d             
	//   12   23:aload_1         
	//   13   24:invokevirtual   #518 <Method float Rectangle.getBottom()>
	//   14   27:f2d             
	//   15   28:aload_2         
	//   16   29:invokespecial   #605 <Method Point transformPoint(double, double, double[])>
	//   17   32:astore          5
		((List) (arraylist)).add(((Object) (Double.valueOf(point.x))));
	//   18   34:aload_3         
	//   19   35:aload           5
	//   20   37:getfield        #611 <Field double Point.x>
	//   21   40:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   22   43:invokeinterface #621 <Method boolean List.add(Object)>
	//   23   48:pop             
		((List) (arraylist1)).add(((Object) (Double.valueOf(point.y))));
	//   24   49:aload           4
	//   25   51:aload           5
	//   26   53:getfield        #624 <Field double Point.y>
	//   27   56:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   28   59:invokeinterface #621 <Method boolean List.add(Object)>
	//   29   64:pop             
		point = transformPoint(rectangle.getRight(), rectangle.getTop(), ad);
	//   30   65:aload_0         
	//   31   66:aload_1         
	//   32   67:invokevirtual   #627 <Method float Rectangle.getRight()>
	//   33   70:f2d             
	//   34   71:aload_1         
	//   35   72:invokevirtual   #630 <Method float Rectangle.getTop()>
	//   36   75:f2d             
	//   37   76:aload_2         
	//   38   77:invokespecial   #605 <Method Point transformPoint(double, double, double[])>
	//   39   80:astore          5
		((List) (arraylist)).add(((Object) (Double.valueOf(point.x))));
	//   40   82:aload_3         
	//   41   83:aload           5
	//   42   85:getfield        #611 <Field double Point.x>
	//   43   88:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   44   91:invokeinterface #621 <Method boolean List.add(Object)>
	//   45   96:pop             
		((List) (arraylist1)).add(((Object) (Double.valueOf(point.y))));
	//   46   97:aload           4
	//   47   99:aload           5
	//   48  101:getfield        #624 <Field double Point.y>
	//   49  104:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   50  107:invokeinterface #621 <Method boolean List.add(Object)>
	//   51  112:pop             
		point = transformPoint(rectangle.getLeft(), rectangle.getTop(), ad);
	//   52  113:aload_0         
	//   53  114:aload_1         
	//   54  115:invokevirtual   #515 <Method float Rectangle.getLeft()>
	//   55  118:f2d             
	//   56  119:aload_1         
	//   57  120:invokevirtual   #630 <Method float Rectangle.getTop()>
	//   58  123:f2d             
	//   59  124:aload_2         
	//   60  125:invokespecial   #605 <Method Point transformPoint(double, double, double[])>
	//   61  128:astore          5
		((List) (arraylist)).add(((Object) (Double.valueOf(point.x))));
	//   62  130:aload_3         
	//   63  131:aload           5
	//   64  133:getfield        #611 <Field double Point.x>
	//   65  136:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   66  139:invokeinterface #621 <Method boolean List.add(Object)>
	//   67  144:pop             
		((List) (arraylist1)).add(((Object) (Double.valueOf(point.y))));
	//   68  145:aload           4
	//   69  147:aload           5
	//   70  149:getfield        #624 <Field double Point.y>
	//   71  152:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   72  155:invokeinterface #621 <Method boolean List.add(Object)>
	//   73  160:pop             
		rectangle = ((Rectangle) (transformPoint(rectangle.getRight(), rectangle.getBottom(), ad)));
	//   74  161:aload_0         
	//   75  162:aload_1         
	//   76  163:invokevirtual   #627 <Method float Rectangle.getRight()>
	//   77  166:f2d             
	//   78  167:aload_1         
	//   79  168:invokevirtual   #518 <Method float Rectangle.getBottom()>
	//   80  171:f2d             
	//   81  172:aload_2         
	//   82  173:invokespecial   #605 <Method Point transformPoint(double, double, double[])>
	//   83  176:astore_1        
		((List) (arraylist)).add(((Object) (Double.valueOf(((Point) (rectangle)).x))));
	//   84  177:aload_3         
	//   85  178:aload_1         
	//   86  179:getfield        #611 <Field double Point.x>
	//   87  182:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   88  185:invokeinterface #621 <Method boolean List.add(Object)>
	//   89  190:pop             
		((List) (arraylist1)).add(((Object) (Double.valueOf(((Point) (rectangle)).y))));
	//   90  191:aload           4
	//   91  193:aload_1         
	//   92  194:getfield        #624 <Field double Point.y>
	//   93  197:invokestatic    #617 <Method Double Double.valueOf(double)>
	//   94  200:invokeinterface #621 <Method boolean List.add(Object)>
	//   95  205:pop             
		return new Rectangle(((Double)Collections.min(((Collection) (arraylist)))).floatValue(), ((Double)Collections.min(((Collection) (arraylist1)))).floatValue(), ((Double)Collections.max(((Collection) (arraylist)))).floatValue(), ((Double)Collections.max(((Collection) (arraylist1)))).floatValue());
	//   96  206:new             #505 <Class Rectangle>
	//   97  209:dup             
	//   98  210:aload_3         
	//   99  211:invokestatic    #636 <Method Object Collections.min(Collection)>
	//  100  214:checkcast       #613 <Class Double>
	//  101  217:invokevirtual   #639 <Method float Double.floatValue()>
	//  102  220:aload           4
	//  103  222:invokestatic    #636 <Method Object Collections.min(Collection)>
	//  104  225:checkcast       #613 <Class Double>
	//  105  228:invokevirtual   #639 <Method float Double.floatValue()>
	//  106  231:aload_3         
	//  107  232:invokestatic    #642 <Method Object Collections.max(Collection)>
	//  108  235:checkcast       #613 <Class Double>
	//  109  238:invokevirtual   #639 <Method float Double.floatValue()>
	//  110  241:aload           4
	//  111  243:invokestatic    #642 <Method Object Collections.max(Collection)>
	//  112  246:checkcast       #613 <Class Double>
	//  113  249:invokevirtual   #639 <Method float Double.floatValue()>
	//  114  252:invokespecial   #645 <Method void Rectangle(float, float, float, float)>
	//  115  255:areturn         
	}

	private Point transformPoint(double d, double d1, double ad[])
	{
		Point point = new Point();
	//    0    0:new             #607 <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #646 <Method void Point()>
	//    3    7:astore          6
		point.x = ad[0] * d + ad[2] * d1 + ad[4];
	//    4    9:aload           6
	//    5   11:aload           5
	//    6   13:iconst_0        
	//    7   14:daload          
	//    8   15:dload_1         
	//    9   16:dmul            
	//   10   17:aload           5
	//   11   19:iconst_2        
	//   12   20:daload          
	//   13   21:dload_3         
	//   14   22:dmul            
	//   15   23:dadd            
	//   16   24:aload           5
	//   17   26:iconst_4        
	//   18   27:daload          
	//   19   28:dadd            
	//   20   29:putfield        #611 <Field double Point.x>
		point.y = ad[1] * d + ad[3] * d1 + ad[5];
	//   21   32:aload           6
	//   22   34:aload           5
	//   23   36:iconst_1        
	//   24   37:daload          
	//   25   38:dload_1         
	//   26   39:dmul            
	//   27   40:aload           5
	//   28   42:iconst_3        
	//   29   43:daload          
	//   30   44:dload_3         
	//   31   45:dmul            
	//   32   46:dadd            
	//   33   47:aload           5
	//   34   49:iconst_5        
	//   35   50:daload          
	//   36   51:dadd            
	//   37   52:putfield        #624 <Field double Point.y>
		return point;
	//   38   55:aload           6
	//   39   57:areturn         
	}

	public void addAnnotation(PdfAnnotation pdfannotation)
	{
		throw new RuntimeException(MessageLocalization.getComposedMessage("unsupported.in.this.context.use.pdfstamper.addannotation", new Object[0]));
	//    0    0:new             #650 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #652 <String "unsupported.in.this.context.use.pdfstamper.addannotation">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #653 <Method void RuntimeException(String)>
	//    7   17:athrow          
	}

	void addAnnotation(PdfAnnotation pdfannotation, int i)
	{
		if(pdfannotation.isAnnotation())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #659 <Method boolean PdfAnnotation.isAnnotation()>
	//*   2    4:ifeq            12
			pdfannotation.setPage(i);
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #662 <Method void PdfAnnotation.setPage(int)>
		addAnnotation(pdfannotation, reader.getPageN(i));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #160 <Field PdfReader reader>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//   12   22:invokevirtual   #665 <Method void addAnnotation(PdfAnnotation, PdfDictionary)>
	//   13   25:return          
	}

	void addAnnotation(PdfAnnotation pdfannotation, PdfDictionary pdfdictionary)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #600 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #601 <Method void ArrayList()>
	//    3    7:astore          5
		if(!pdfannotation.isForm()) goto _L2; else goto _L1
	//    4    9:aload_1         
	//    5   10:invokevirtual   #668 <Method boolean PdfAnnotation.isForm()>
	//    6   13:ifeq            356
_L1:
		fieldsAdded = true;
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:putfield        #109 <Field boolean fieldsAdded>
		getAcroFields();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #672 <Method AcroFields getAcroFields()>
	//   12   25:pop             
		pdfannotation = ((PdfAnnotation) ((PdfFormField)pdfannotation));
	//   13   26:aload_1         
	//   14   27:checkcast       #674 <Class PdfFormField>
	//   15   30:astore_1        
		if(((PdfFormField) (pdfannotation)).getParent() != null)
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #678 <Method PdfFormField PdfFormField.getParent()>
	//*  18   35:ifnull          39
			return;
	//   19   38:return          
		int i;
		int j;
		PdfAnnotation pdfannotation1;
		Rectangle rectangle;
		try
		{
			expandFields(((PdfFormField) (pdfannotation)), arraylist);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload           5
	//   23   43:invokevirtual   #682 <Method void expandFields(PdfFormField, ArrayList)>
		}
	//*  24   46:goto            535
	//*  25   49:iload_3         
	//*  26   50:aload           5
	//*  27   52:invokevirtual   #683 <Method int ArrayList.size()>
	//*  28   55:icmpge          534
	//*  29   58:aload           5
	//*  30   60:iload_3         
	//*  31   61:invokevirtual   #686 <Method Object ArrayList.get(int)>
	//*  32   64:checkcast       #656 <Class PdfAnnotation>
	//*  33   67:astore          6
	//*  34   69:aload           6
	//*  35   71:invokevirtual   #689 <Method int PdfAnnotation.getPlaceInPage()>
	//*  36   74:ifle            90
	//*  37   77:aload_0         
	//*  38   78:getfield        #160 <Field PdfReader reader>
	//*  39   81:aload           6
	//*  40   83:invokevirtual   #689 <Method int PdfAnnotation.getPlaceInPage()>
	//*  41   86:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//*  42   89:astore_1        
	//*  43   90:aload           6
	//*  44   92:invokevirtual   #668 <Method boolean PdfAnnotation.isForm()>
	//*  45   95:ifeq            146
	//*  46   98:aload           6
	//*  47  100:invokevirtual   #692 <Method boolean PdfAnnotation.isUsed()>
	//*  48  103:ifne            125
	//*  49  106:aload           6
	//*  50  108:invokevirtual   #696 <Method HashSet PdfAnnotation.getTemplates()>
	//*  51  111:astore_2        
	//*  52  112:aload_2         
	//*  53  113:ifnull          125
	//*  54  116:aload_0         
	//*  55  117:getfield        #107 <Field HashSet fieldTemplates>
	//*  56  120:aload_2         
	//*  57  121:invokevirtual   #700 <Method boolean HashSet.addAll(Collection)>
	//*  58  124:pop             
	//*  59  125:aload           6
	//*  60  127:checkcast       #674 <Class PdfFormField>
	//*  61  130:astore_2        
	//*  62  131:aload_2         
	//*  63  132:invokevirtual   #678 <Method PdfFormField PdfFormField.getParent()>
	//*  64  135:ifnonnull       146
	//*  65  138:aload_0         
	//*  66  139:aload_2         
	//*  67  140:invokevirtual   #704 <Method PdfIndirectReference PdfFormField.getIndirectReference()>
	//*  68  143:invokevirtual   #707 <Method void addDocumentField(PdfIndirectReference)>
	//*  69  146:aload           6
	//*  70  148:invokevirtual   #659 <Method boolean PdfAnnotation.isAnnotation()>
	//*  71  151:ifeq            328
	//*  72  154:aload_1         
	//*  73  155:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//*  74  158:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  75  161:aload_1         
	//*  76  162:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//*  77  165:astore_2        
	//*  78  166:aload_2         
	//*  79  167:ifnull          177
	//*  80  170:aload_2         
	//*  81  171:invokevirtual   #328 <Method boolean PdfObject.isArray()>
	//*  82  174:ifne            376
	//*  83  177:new             #290 <Class PdfArray>
	//*  84  180:dup             
	//*  85  181:invokespecial   #338 <Method void PdfArray()>
	//*  86  184:astore_2        
	//*  87  185:aload_1         
	//*  88  186:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//*  89  189:aload_2         
	//*  90  190:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  91  193:aload_0         
	//*  92  194:aload_1         
	//*  93  195:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//*  94  198:aload_2         
	//*  95  199:aload           6
	//*  96  201:invokevirtual   #715 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//*  97  204:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//*  98  207:pop             
	//*  99  208:aload_0         
	//* 100  209:aload_2         
	//* 101  210:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//* 102  213:aload           6
	//* 103  215:invokevirtual   #692 <Method boolean PdfAnnotation.isUsed()>
	//* 104  218:ifne            328
	//* 105  221:aload           6
	//* 106  223:getstatic       #469 <Field PdfName PdfName.RECT>
	//* 107  226:invokevirtual   #716 <Method PdfObject PdfAnnotation.get(PdfName)>
	//* 108  229:checkcast       #576 <Class PdfRectangle>
	//* 109  232:astore_2        
	//* 110  233:aload_2         
	//* 111  234:ifnull          328
	//* 112  237:aload_2         
	//* 113  238:invokevirtual   #719 <Method float PdfRectangle.left()>
	//* 114  241:fconst_0        
	//* 115  242:fcmpl           
	//* 116  243:ifne            273
	//* 117  246:aload_2         
	//* 118  247:invokevirtual   #722 <Method float PdfRectangle.right()>
	//* 119  250:fconst_0        
	//* 120  251:fcmpl           
	//* 121  252:ifne            273
	//* 122  255:aload_2         
	//* 123  256:invokevirtual   #725 <Method float PdfRectangle.top()>
	//* 124  259:fconst_0        
	//* 125  260:fcmpl           
	//* 126  261:ifne            273
	//* 127  264:aload_2         
	//* 128  265:invokevirtual   #728 <Method float PdfRectangle.bottom()>
	//* 129  268:fconst_0        
	//* 130  269:fcmpl           
	//* 131  270:ifeq            328
	//* 132  273:aload_0         
	//* 133  274:getfield        #160 <Field PdfReader reader>
	//* 134  277:aload_1         
	//* 135  278:invokevirtual   #732 <Method int PdfReader.getPageRotation(PdfDictionary)>
	//* 136  281:istore          4
	//* 137  283:aload_0         
	//* 138  284:getfield        #160 <Field PdfReader reader>
	//* 139  287:aload_1         
	//* 140  288:invokevirtual   #736 <Method Rectangle PdfReader.getPageSizeWithRotation(PdfDictionary)>
	//* 141  291:astore          7
	//* 142  293:iload           4
	//* 143  295:lookupswitch    3: default 542
	//	               90: 384
	//	               180: 430
	//	               270: 488
	//* 144  328:aload           6
	//* 145  330:invokevirtual   #692 <Method boolean PdfAnnotation.isUsed()>
	//* 146  333:ifne            545
	//* 147  336:aload           6
	//* 148  338:invokevirtual   #739 <Method void PdfAnnotation.setUsed()>
	//* 149  341:aload_0         
	//* 150  342:aload           6
	//* 151  344:aload           6
	//* 152  346:invokevirtual   #715 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//* 153  349:invokevirtual   #743 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//* 154  352:pop             
	//* 155  353:goto            545
	//* 156  356:aload           5
	//* 157  358:aload_1         
	//* 158  359:invokevirtual   #744 <Method boolean ArrayList.add(Object)>
	//* 159  362:pop             
	//* 160  363:goto            535
		// Misplaced declaration of an exception variable
		catch(PdfAnnotation pdfannotation)
	//* 161  366:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfannotation)));
	//  162  367:new             #746 <Class ExceptionConverter>
	//  163  370:dup             
	//  164  371:aload_1         
	//  165  372:invokespecial   #749 <Method void ExceptionConverter(Exception)>
	//  166  375:athrow          
		}
		  goto _L3
_L20:
		if(i >= arraylist.size()) goto _L5; else goto _L4
_L4:
		pdfannotation1 = (PdfAnnotation)arraylist.get(i);
		if(pdfannotation1.getPlaceInPage() > 0)
			pdfannotation = ((PdfAnnotation) (reader.getPageN(pdfannotation1.getPlaceInPage())));
		if(!pdfannotation1.isForm())
			break MISSING_BLOCK_LABEL_146;
		if(pdfannotation1.isUsed())
			break MISSING_BLOCK_LABEL_125;
		pdfdictionary = ((PdfDictionary) (pdfannotation1.getTemplates()));
		if(pdfdictionary == null)
			break MISSING_BLOCK_LABEL_125;
		fieldTemplates.addAll(((Collection) (pdfdictionary)));
		pdfdictionary = ((PdfDictionary) ((PdfFormField)pdfannotation1));
		if(((PdfFormField) (pdfdictionary)).getParent() == null)
			addDocumentField(((PdfFormField) (pdfdictionary)).getIndirectReference());
		if(!pdfannotation1.isAnnotation()) goto _L7; else goto _L6
_L6:
		pdfdictionary = ((PdfDictionary) (PdfReader.getPdfObject(((PdfDictionary) (pdfannotation)).get(PdfName.ANNOTS), ((PdfObject) (pdfannotation)))));
		if(pdfdictionary == null) goto _L9; else goto _L8
_L8:
		if(((PdfObject) (pdfdictionary)).isArray()) goto _L10; else goto _L9
_L9:
		pdfdictionary = ((PdfDictionary) (new PdfArray()));
		((PdfDictionary) (pdfannotation)).put(PdfName.ANNOTS, ((PdfObject) (pdfdictionary)));
		markUsed(((PdfObject) (pdfannotation)));
_L18:
		((PdfArray) (pdfdictionary)).add(((PdfObject) (pdfannotation1.getIndirectReference())));
		markUsed(((PdfObject) (pdfdictionary)));
		if(pdfannotation1.isUsed()) goto _L7; else goto _L11
_L11:
		pdfdictionary = ((PdfDictionary) ((PdfRectangle)pdfannotation1.get(PdfName.RECT)));
		if(pdfdictionary == null) goto _L7; else goto _L12
_L12:
		if(((PdfRectangle) (pdfdictionary)).left() == 0.0F && ((PdfRectangle) (pdfdictionary)).right() == 0.0F && ((PdfRectangle) (pdfdictionary)).top() == 0.0F && ((PdfRectangle) (pdfdictionary)).bottom() == 0.0F) goto _L7; else goto _L13
_L13:
		j = reader.getPageRotation(((PdfDictionary) (pdfannotation)));
		rectangle = reader.getPageSizeWithRotation(((PdfDictionary) (pdfannotation)));
		j;
		JVM INSTR lookupswitch 3: default 542
	//	               90: 384
	//	               180: 430
	//	               270: 488;
		   goto _L7 _L14 _L15 _L16
_L7:
		if(!pdfannotation1.isUsed())
		{
			pdfannotation1.setUsed();
			addToBody(((PdfObject) (pdfannotation1)), pdfannotation1.getIndirectReference());
		}
		  goto _L17
_L2:
		arraylist.add(((Object) (pdfannotation)));
		  goto _L3
_L10:
		pdfdictionary = ((PdfDictionary) ((PdfArray)pdfdictionary));
	//  167  376:aload_2         
	//  168  377:checkcast       #290 <Class PdfArray>
	//  169  380:astore_2        
		  goto _L18
	//* 170  381:goto            198
_L14:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle.getTop() - ((PdfRectangle) (pdfdictionary)).top(), ((PdfRectangle) (pdfdictionary)).right(), rectangle.getTop() - ((PdfRectangle) (pdfdictionary)).bottom(), ((PdfRectangle) (pdfdictionary)).left()))));
	//  171  384:aload           6
	//  172  386:getstatic       #469 <Field PdfName PdfName.RECT>
	//  173  389:new             #576 <Class PdfRectangle>
	//  174  392:dup             
	//  175  393:aload           7
	//  176  395:invokevirtual   #630 <Method float Rectangle.getTop()>
	//  177  398:aload_2         
	//  178  399:invokevirtual   #725 <Method float PdfRectangle.top()>
	//  179  402:fsub            
	//  180  403:aload_2         
	//  181  404:invokevirtual   #722 <Method float PdfRectangle.right()>
	//  182  407:aload           7
	//  183  409:invokevirtual   #630 <Method float Rectangle.getTop()>
	//  184  412:aload_2         
	//  185  413:invokevirtual   #728 <Method float PdfRectangle.bottom()>
	//  186  416:fsub            
	//  187  417:aload_2         
	//  188  418:invokevirtual   #719 <Method float PdfRectangle.left()>
	//  189  421:invokespecial   #750 <Method void PdfRectangle(float, float, float, float)>
	//  190  424:invokevirtual   #751 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 191  427:goto            328
_L15:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle.getRight() - ((PdfRectangle) (pdfdictionary)).left(), rectangle.getTop() - ((PdfRectangle) (pdfdictionary)).bottom(), rectangle.getRight() - ((PdfRectangle) (pdfdictionary)).right(), rectangle.getTop() - ((PdfRectangle) (pdfdictionary)).top()))));
	//  192  430:aload           6
	//  193  432:getstatic       #469 <Field PdfName PdfName.RECT>
	//  194  435:new             #576 <Class PdfRectangle>
	//  195  438:dup             
	//  196  439:aload           7
	//  197  441:invokevirtual   #627 <Method float Rectangle.getRight()>
	//  198  444:aload_2         
	//  199  445:invokevirtual   #719 <Method float PdfRectangle.left()>
	//  200  448:fsub            
	//  201  449:aload           7
	//  202  451:invokevirtual   #630 <Method float Rectangle.getTop()>
	//  203  454:aload_2         
	//  204  455:invokevirtual   #728 <Method float PdfRectangle.bottom()>
	//  205  458:fsub            
	//  206  459:aload           7
	//  207  461:invokevirtual   #627 <Method float Rectangle.getRight()>
	//  208  464:aload_2         
	//  209  465:invokevirtual   #722 <Method float PdfRectangle.right()>
	//  210  468:fsub            
	//  211  469:aload           7
	//  212  471:invokevirtual   #630 <Method float Rectangle.getTop()>
	//  213  474:aload_2         
	//  214  475:invokevirtual   #725 <Method float PdfRectangle.top()>
	//  215  478:fsub            
	//  216  479:invokespecial   #750 <Method void PdfRectangle(float, float, float, float)>
	//  217  482:invokevirtual   #751 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 218  485:goto            328
_L16:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(((PdfRectangle) (pdfdictionary)).bottom(), rectangle.getRight() - ((PdfRectangle) (pdfdictionary)).left(), ((PdfRectangle) (pdfdictionary)).top(), rectangle.getRight() - ((PdfRectangle) (pdfdictionary)).right()))));
	//  219  488:aload           6
	//  220  490:getstatic       #469 <Field PdfName PdfName.RECT>
	//  221  493:new             #576 <Class PdfRectangle>
	//  222  496:dup             
	//  223  497:aload_2         
	//  224  498:invokevirtual   #728 <Method float PdfRectangle.bottom()>
	//  225  501:aload           7
	//  226  503:invokevirtual   #627 <Method float Rectangle.getRight()>
	//  227  506:aload_2         
	//  228  507:invokevirtual   #719 <Method float PdfRectangle.left()>
	//  229  510:fsub            
	//  230  511:aload_2         
	//  231  512:invokevirtual   #725 <Method float PdfRectangle.top()>
	//  232  515:aload           7
	//  233  517:invokevirtual   #627 <Method float Rectangle.getRight()>
	//  234  520:aload_2         
	//  235  521:invokevirtual   #722 <Method float PdfRectangle.right()>
	//  236  524:fsub            
	//  237  525:invokespecial   #750 <Method void PdfRectangle(float, float, float, float)>
	//  238  528:invokevirtual   #751 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 239  531:goto            328
_L5:
		return;
	//  240  534:return          
_L3:
		i = 0;
	//  241  535:iconst_0        
	//  242  536:istore_3        
		pdfannotation = ((PdfAnnotation) (pdfdictionary));
	//  243  537:aload_2         
	//  244  538:astore_1        
		continue; /* Loop/switch isn't completed */
	//  245  539:goto            49
	//* 246  542:goto            328
_L17:
		i++;
	//  247  545:iload_3         
	//  248  546:iconst_1        
	//  249  547:iadd            
	//  250  548:istore_3        
		if(true) goto _L20; else goto _L19
	//  251  549:goto            49
_L19:
	}

	public void addComments(FdfReader fdfreader)
		throws IOException
	{
		if(!readers2intrefs.containsKey(((Object) (fdfreader)))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field HashMap readers2intrefs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//    4    8:ifeq            12
_L1:
		Object obj;
		return;
	//    5   11:return          
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #761 <Method PdfDictionary FdfReader.getCatalog()>
	//*   8   16:getstatic       #764 <Field PdfName PdfName.FDF>
	//*   9   19:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  10   22:astore          4
_L2:
		if((obj = ((Object) (fdfreader.getCatalog().getAsDict(PdfName.FDF)))) == null || ((obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.ANNOTS)))) == null || ((PdfArray) (obj)).size() == 0))
			continue; /* Loop/switch isn't completed */
	//   11   24:aload           4
	//   12   26:ifnull          11
	//   13   29:aload           4
	//   14   31:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//   15   34:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   16   37:astore          4
	//   17   39:aload           4
	//   18   41:ifnull          11
	//   19   44:aload           4
	//   20   46:invokevirtual   #293 <Method int PdfArray.size()>
	//   21   49:ifeq            11
		registerReader(((PdfReader) (fdfreader)), false);
	//   22   52:aload_0         
	//   23   53:aload_1         
	//   24   54:iconst_0        
	//   25   55:invokevirtual   #771 <Method void registerReader(PdfReader, boolean)>
		IntHashtable inthashtable = new IntHashtable();
	//   26   58:new             #76  <Class IntHashtable>
	//   27   61:dup             
	//   28   62:invokespecial   #77  <Method void IntHashtable()>
	//   29   65:astore          5
		HashMap hashmap = new HashMap();
	//   30   67:new             #69  <Class HashMap>
	//   31   70:dup             
	//   32   71:invokespecial   #70  <Method void HashMap()>
	//   33   74:astore          7
		ArrayList arraylist = new ArrayList();
	//   34   76:new             #600 <Class ArrayList>
	//   35   79:dup             
	//   36   80:invokespecial   #601 <Method void ArrayList()>
	//   37   83:astore          6
		int i = 0;
	//   38   85:iconst_0        
	//   39   86:istore_2        
		while(i < ((PdfArray) (obj)).size()) 
	//*  40   87:iload_2         
	//*  41   88:aload           4
	//*  42   90:invokevirtual   #293 <Method int PdfArray.size()>
	//*  43   93:icmpge          220
		{
			PdfObject pdfobject2 = ((PdfArray) (obj)).getPdfObject(i);
	//   44   96:aload           4
	//   45   98:iload_2         
	//   46   99:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//   47  102:astore          8
			Object obj2 = ((Object) ((PdfDictionary)PdfReader.getPdfObject(pdfobject2)));
	//   48  104:aload           8
	//   49  106:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   50  109:checkcast       #386 <Class PdfDictionary>
	//   51  112:astore          9
			PdfNumber pdfnumber = ((PdfDictionary) (obj2)).getAsNumber(PdfName.PAGE);
	//   52  114:aload           9
	//   53  116:getstatic       #774 <Field PdfName PdfName.PAGE>
	//   54  119:invokevirtual   #446 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   55  122:astore          10
			if(pdfnumber != null && pdfnumber.intValue() < reader.getNumberOfPages())
	//*  56  124:aload           10
	//*  57  126:ifnull          144
	//*  58  129:aload           10
	//*  59  131:invokevirtual   #451 <Method int PdfNumber.intValue()>
	//*  60  134:aload_0         
	//*  61  135:getfield        #160 <Field PdfReader reader>
	//*  62  138:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//*  63  141:icmplt          151
	//*  64  144:iload_2         
	//*  65  145:iconst_1        
	//*  66  146:iadd            
	//*  67  147:istore_2        
	//*  68  148:goto            87
			{
				findAllObjects(((PdfReader) (fdfreader)), pdfobject2, inthashtable);
	//   69  151:aload_1         
	//   70  152:aload           8
	//   71  154:aload           5
	//   72  156:invokestatic    #364 <Method void findAllObjects(PdfReader, PdfObject, IntHashtable)>
				arraylist.add(((Object) (pdfobject2)));
	//   73  159:aload           6
	//   74  161:aload           8
	//   75  163:invokevirtual   #744 <Method boolean ArrayList.add(Object)>
	//   76  166:pop             
				if(pdfobject2.type() == 10)
	//*  77  167:aload           8
	//*  78  169:invokevirtual   #362 <Method int PdfObject.type()>
	//*  79  172:bipush          10
	//*  80  174:icmpne          144
				{
					obj2 = ((Object) (PdfReader.getPdfObject(((PdfDictionary) (obj2)).get(PdfName.NM))));
	//   81  177:aload           9
	//   82  179:getstatic       #777 <Field PdfName PdfName.NM>
	//   83  182:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   84  185:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   85  188:astore          9
					if(obj2 != null && ((PdfObject) (obj2)).type() == 3)
	//*  86  190:aload           9
	//*  87  192:ifnull          144
	//*  88  195:aload           9
	//*  89  197:invokevirtual   #362 <Method int PdfObject.type()>
	//*  90  200:iconst_3        
	//*  91  201:icmpne          144
						hashmap.put(((Object) (((PdfObject) (obj2)).toString())), ((Object) (pdfobject2)));
	//   92  204:aload           7
	//   93  206:aload           9
	//   94  208:invokevirtual   #306 <Method String PdfObject.toString()>
	//   95  211:aload           8
	//   96  213:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   97  216:pop             
				}
			}
			i++;
		}
	//*  98  217:goto            144
		int ai[] = inthashtable.getKeys();
	//   99  220:aload           5
	//  100  222:invokevirtual   #783 <Method int[] IntHashtable.getKeys()>
	//  101  225:astore          8
		for(i = 0; i < ai.length; i++)
	//* 102  227:iconst_0        
	//* 103  228:istore_2        
	//* 104  229:iload_2         
	//* 105  230:aload           8
	//* 106  232:arraylength     
	//* 107  233:icmpge          374
		{
			int j = ai[i];
	//  108  236:aload           8
	//  109  238:iload_2         
	//  110  239:iaload          
	//  111  240:istore_3        
			PdfObject pdfobject = fdfreader.getPdfObject(j);
	//  112  241:aload_1         
	//  113  242:iload_3         
	//  114  243:invokevirtual   #784 <Method PdfObject FdfReader.getPdfObject(int)>
	//  115  246:astore          5
			Object obj1 = ((Object) (pdfobject));
	//  116  248:aload           5
	//  117  250:astore          4
			if(pdfobject.type() == 6)
	//* 118  252:aload           5
	//* 119  254:invokevirtual   #362 <Method int PdfObject.type()>
	//* 120  257:bipush          6
	//* 121  259:icmpne          353
			{
				PdfObject pdfobject3 = PdfReader.getPdfObject(((PdfDictionary)pdfobject).get(PdfName.IRT));
	//  122  262:aload           5
	//  123  264:checkcast       #386 <Class PdfDictionary>
	//  124  267:getstatic       #787 <Field PdfName PdfName.IRT>
	//  125  270:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  126  273:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  127  276:astore          9
				obj1 = ((Object) (pdfobject));
	//  128  278:aload           5
	//  129  280:astore          4
				if(pdfobject3 != null)
	//* 130  282:aload           9
	//* 131  284:ifnull          353
				{
					obj1 = ((Object) (pdfobject));
	//  132  287:aload           5
	//  133  289:astore          4
					if(pdfobject3.type() == 3)
	//* 134  291:aload           9
	//* 135  293:invokevirtual   #362 <Method int PdfObject.type()>
	//* 136  296:iconst_3        
	//* 137  297:icmpne          353
					{
						pdfobject3 = (PdfObject)hashmap.get(((Object) (pdfobject3.toString())));
	//  138  300:aload           7
	//  139  302:aload           9
	//  140  304:invokevirtual   #306 <Method String PdfObject.toString()>
	//  141  307:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//  142  310:checkcast       #299 <Class PdfObject>
	//  143  313:astore          9
						obj1 = ((Object) (pdfobject));
	//  144  315:aload           5
	//  145  317:astore          4
						if(pdfobject3 != null)
	//* 146  319:aload           9
	//* 147  321:ifnull          353
						{
							obj1 = ((Object) (new PdfDictionary()));
	//  148  324:new             #386 <Class PdfDictionary>
	//  149  327:dup             
	//  150  328:invokespecial   #789 <Method void PdfDictionary()>
	//  151  331:astore          4
							((PdfDictionary) (obj1)).merge((PdfDictionary)pdfobject);
	//  152  333:aload           4
	//  153  335:aload           5
	//  154  337:checkcast       #386 <Class PdfDictionary>
	//  155  340:invokevirtual   #793 <Method void PdfDictionary.merge(PdfDictionary)>
							((PdfDictionary) (obj1)).put(PdfName.IRT, pdfobject3);
	//  156  343:aload           4
	//  157  345:getstatic       #787 <Field PdfName PdfName.IRT>
	//  158  348:aload           9
	//  159  350:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
						}
					}
				}
			}
			addToBody(((PdfObject) (obj1)), getNewObjectNumber(((PdfReader) (fdfreader)), j, 0));
	//  160  353:aload_0         
	//  161  354:aload           4
	//  162  356:aload_0         
	//  163  357:aload_1         
	//  164  358:iload_3         
	//  165  359:iconst_0        
	//  166  360:invokevirtual   #797 <Method int getNewObjectNumber(PdfReader, int, int)>
	//  167  363:invokevirtual   #800 <Method PdfIndirectObject addToBody(PdfObject, int)>
	//  168  366:pop             
		}

	//  169  367:iload_2         
	//  170  368:iconst_1        
	//  171  369:iadd            
	//  172  370:istore_2        
	//* 173  371:goto            229
		i = 0;
	//  174  374:iconst_0        
	//  175  375:istore_2        
		while(i < arraylist.size()) 
	//* 176  376:iload_2         
	//* 177  377:aload           6
	//* 178  379:invokevirtual   #683 <Method int ArrayList.size()>
	//* 179  382:icmpge          11
		{
			PdfObject pdfobject1 = (PdfObject)arraylist.get(i);
	//  180  385:aload           6
	//  181  387:iload_2         
	//  182  388:invokevirtual   #686 <Method Object ArrayList.get(int)>
	//  183  391:checkcast       #299 <Class PdfObject>
	//  184  394:astore          5
			fdfreader = ((FdfReader) (((PdfDictionary)PdfReader.getPdfObject(pdfobject1)).getAsNumber(PdfName.PAGE)));
	//  185  396:aload           5
	//  186  398:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  187  401:checkcast       #386 <Class PdfDictionary>
	//  188  404:getstatic       #774 <Field PdfName PdfName.PAGE>
	//  189  407:invokevirtual   #446 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  190  410:astore_1        
			PdfDictionary pdfdictionary = reader.getPageN(((PdfNumber) (fdfreader)).intValue() + 1);
	//  191  411:aload_0         
	//  192  412:getfield        #160 <Field PdfReader reader>
	//  193  415:aload_1         
	//  194  416:invokevirtual   #451 <Method int PdfNumber.intValue()>
	//  195  419:iconst_1        
	//  196  420:iadd            
	//  197  421:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//  198  424:astore          7
			PdfArray pdfarray = (PdfArray)PdfReader.getPdfObject(pdfdictionary.get(PdfName.ANNOTS), ((PdfObject) (pdfdictionary)));
	//  199  426:aload           7
	//  200  428:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//  201  431:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  202  434:aload           7
	//  203  436:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//  204  439:checkcast       #290 <Class PdfArray>
	//  205  442:astore          4
			fdfreader = ((FdfReader) (pdfarray));
	//  206  444:aload           4
	//  207  446:astore_1        
			if(pdfarray == null)
	//* 208  447:aload           4
	//* 209  449:ifnonnull       475
			{
				fdfreader = ((FdfReader) (new PdfArray()));
	//  210  452:new             #290 <Class PdfArray>
	//  211  455:dup             
	//  212  456:invokespecial   #338 <Method void PdfArray()>
	//  213  459:astore_1        
				pdfdictionary.put(PdfName.ANNOTS, ((PdfObject) (fdfreader)));
	//  214  460:aload           7
	//  215  462:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//  216  465:aload_1         
	//  217  466:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				markUsed(((PdfObject) (pdfdictionary)));
	//  218  469:aload_0         
	//  219  470:aload           7
	//  220  472:invokevirtual   #714 <Method void markUsed(PdfObject)>
			}
			markUsed(((PdfObject) (fdfreader)));
	//  221  475:aload_0         
	//  222  476:aload_1         
	//  223  477:invokevirtual   #714 <Method void markUsed(PdfObject)>
			((PdfArray) (fdfreader)).add(pdfobject1);
	//  224  480:aload_1         
	//  225  481:aload           5
	//  226  483:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//  227  486:pop             
			i++;
	//  228  487:iload_2         
	//  229  488:iconst_1        
	//  230  489:iadd            
	//  231  490:istore_2        
		}
		if(true) goto _L1; else goto _L3
	//  232  491:goto            376
_L3:
	}

	void addDocumentField(PdfIndirectReference pdfindirectreference)
	{
		Object obj1 = ((Object) (reader.getCatalog()));
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:astore          4
		Object obj = ((Object) ((PdfDictionary)PdfReader.getPdfObject(((PdfDictionary) (obj1)).get(PdfName.ACROFORM), ((PdfObject) (obj1)))));
	//    4    9:aload           4
	//    5   11:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//    6   14:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//    7   17:aload           4
	//    8   19:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//    9   22:checkcast       #386 <Class PdfDictionary>
	//   10   25:astore_3        
		PdfDictionary pdfdictionary = ((PdfDictionary) (obj));
	//   11   26:aload_3         
	//   12   27:astore_2        
		if(obj == null)
	//*  13   28:aload_3         
	//*  14   29:ifnonnull       55
		{
			pdfdictionary = new PdfDictionary();
	//   15   32:new             #386 <Class PdfDictionary>
	//   16   35:dup             
	//   17   36:invokespecial   #789 <Method void PdfDictionary()>
	//   18   39:astore_2        
			((PdfDictionary) (obj1)).put(PdfName.ACROFORM, ((PdfObject) (pdfdictionary)));
	//   19   40:aload           4
	//   20   42:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//   21   45:aload_2         
	//   22   46:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (obj1)));
	//   23   49:aload_0         
	//   24   50:aload           4
	//   25   52:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		obj1 = ((Object) ((PdfArray)PdfReader.getPdfObject(pdfdictionary.get(PdfName.FIELDS), ((PdfObject) (pdfdictionary)))));
	//   26   55:aload_2         
	//   27   56:getstatic       #807 <Field PdfName PdfName.FIELDS>
	//   28   59:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   29   62:aload_2         
	//   30   63:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   31   66:checkcast       #290 <Class PdfArray>
	//   32   69:astore          4
		obj = obj1;
	//   33   71:aload           4
	//   34   73:astore_3        
		if(obj1 == null)
	//*  35   74:aload           4
	//*  36   76:ifnonnull       100
		{
			obj = ((Object) (new PdfArray()));
	//   37   79:new             #290 <Class PdfArray>
	//   38   82:dup             
	//   39   83:invokespecial   #338 <Method void PdfArray()>
	//   40   86:astore_3        
			pdfdictionary.put(PdfName.FIELDS, ((PdfObject) (obj)));
	//   41   87:aload_2         
	//   42   88:getstatic       #807 <Field PdfName PdfName.FIELDS>
	//   43   91:aload_3         
	//   44   92:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (pdfdictionary)));
	//   45   95:aload_0         
	//   46   96:aload_2         
	//   47   97:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		if(!pdfdictionary.contains(PdfName.DA))
	//*  48  100:aload_2         
	//*  49  101:getstatic       #810 <Field PdfName PdfName.DA>
	//*  50  104:invokevirtual   #814 <Method boolean PdfDictionary.contains(PdfName)>
	//*  51  107:ifne            132
		{
			pdfdictionary.put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//   52  110:aload_2         
	//   53  111:getstatic       #810 <Field PdfName PdfName.DA>
	//   54  114:new             #816 <Class PdfString>
	//   55  117:dup             
	//   56  118:ldc2            #818 <String "/Helv 0 Tf 0 g ">
	//   57  121:invokespecial   #819 <Method void PdfString(String)>
	//   58  124:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (pdfdictionary)));
	//   59  127:aload_0         
	//   60  128:aload_2         
	//   61  129:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		((PdfArray) (obj)).add(((PdfObject) (pdfindirectreference)));
	//   62  132:aload_3         
	//   63  133:aload_1         
	//   64  134:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//   65  137:pop             
		markUsed(((PdfObject) (obj)));
	//   66  138:aload_0         
	//   67  139:aload_3         
	//   68  140:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//   69  143:return          
	}

	protected void addFieldResources()
		throws IOException
	{
		if(!fieldTemplates.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field HashSet fieldTemplates>
	//*   2    4:invokevirtual   #821 <Method boolean HashSet.isEmpty()>
	//*   3    7:ifeq            11
	//*   4   10:return          
		{
			Object obj = ((Object) (reader.getCatalog()));
	//    5   11:aload_0         
	//    6   12:getfield        #160 <Field PdfReader reader>
	//    7   15:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    8   18:astore_3        
			PdfDictionary pdfdictionary1 = (PdfDictionary)PdfReader.getPdfObject(((PdfDictionary) (obj)).get(PdfName.ACROFORM), ((PdfObject) (obj)));
	//    9   19:aload_3         
	//   10   20:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//   11   23:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   12   26:aload_3         
	//   13   27:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   14   30:checkcast       #386 <Class PdfDictionary>
	//   15   33:astore_2        
			PdfDictionary pdfdictionary = pdfdictionary1;
	//   16   34:aload_2         
	//   17   35:astore_1        
			if(pdfdictionary1 == null)
	//*  18   36:aload_2         
	//*  19   37:ifnonnull       61
			{
				pdfdictionary = new PdfDictionary();
	//   20   40:new             #386 <Class PdfDictionary>
	//   21   43:dup             
	//   22   44:invokespecial   #789 <Method void PdfDictionary()>
	//   23   47:astore_1        
				((PdfDictionary) (obj)).put(PdfName.ACROFORM, ((PdfObject) (pdfdictionary)));
	//   24   48:aload_3         
	//   25   49:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				markUsed(((PdfObject) (obj)));
	//   28   56:aload_0         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #714 <Method void markUsed(PdfObject)>
			}
			obj = ((Object) ((PdfDictionary)PdfReader.getPdfObject(pdfdictionary.get(PdfName.DR), ((PdfObject) (pdfdictionary)))));
	//   31   61:aload_1         
	//   32   62:getstatic       #824 <Field PdfName PdfName.DR>
	//   33   65:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   68:aload_1         
	//   35   69:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   36   72:checkcast       #386 <Class PdfDictionary>
	//   37   75:astore_3        
			pdfdictionary1 = ((PdfDictionary) (obj));
	//   38   76:aload_3         
	//   39   77:astore_2        
			if(obj == null)
	//*  40   78:aload_3         
	//*  41   79:ifnonnull       103
			{
				pdfdictionary1 = new PdfDictionary();
	//   42   82:new             #386 <Class PdfDictionary>
	//   43   85:dup             
	//   44   86:invokespecial   #789 <Method void PdfDictionary()>
	//   45   89:astore_2        
				pdfdictionary.put(PdfName.DR, ((PdfObject) (pdfdictionary1)));
	//   46   90:aload_1         
	//   47   91:getstatic       #824 <Field PdfName PdfName.DR>
	//   48   94:aload_2         
	//   49   95:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				markUsed(((PdfObject) (pdfdictionary)));
	//   50   98:aload_0         
	//   51   99:aload_1         
	//   52  100:invokevirtual   #714 <Method void markUsed(PdfObject)>
			}
			markUsed(((PdfObject) (pdfdictionary1)));
	//   53  103:aload_0         
	//   54  104:aload_2         
	//   55  105:invokevirtual   #714 <Method void markUsed(PdfObject)>
			for(obj = ((Object) (fieldTemplates.iterator())); ((Iterator) (obj)).hasNext(); PdfFormField.mergeResources(pdfdictionary1, (PdfDictionary)((PdfTemplate)((Iterator) (obj)).next()).getResources(), this));
	//   56  108:aload_0         
	//   57  109:getfield        #107 <Field HashSet fieldTemplates>
	//   58  112:invokevirtual   #825 <Method Iterator HashSet.iterator()>
	//   59  115:astore_3        
	//   60  116:aload_3         
	//   61  117:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//   62  122:ifeq            148
	//   63  125:aload_2         
	//   64  126:aload_3         
	//   65  127:invokeinterface #351 <Method Object Iterator.next()>
	//   66  132:checkcast       #827 <Class PdfTemplate>
	//   67  135:invokevirtual   #831 <Method PdfObject PdfTemplate.getResources()>
	//   68  138:checkcast       #386 <Class PdfDictionary>
	//   69  141:aload_0         
	//   70  142:invokestatic    #835 <Method void PdfFormField.mergeResources(PdfDictionary, PdfDictionary, PdfStamperImp)>
	//*  71  145:goto            116
			PdfDictionary pdfdictionary4 = pdfdictionary1.getAsDict(PdfName.FONT);
	//   72  148:aload_2         
	//   73  149:getstatic       #838 <Field PdfName PdfName.FONT>
	//   74  152:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   75  155:astore          4
			obj = ((Object) (pdfdictionary4));
	//   76  157:aload           4
	//   77  159:astore_3        
			if(pdfdictionary4 == null)
	//*  78  160:aload           4
	//*  79  162:ifnonnull       181
			{
				obj = ((Object) (new PdfDictionary()));
	//   80  165:new             #386 <Class PdfDictionary>
	//   81  168:dup             
	//   82  169:invokespecial   #789 <Method void PdfDictionary()>
	//   83  172:astore_3        
				pdfdictionary1.put(PdfName.FONT, ((PdfObject) (obj)));
	//   84  173:aload_2         
	//   85  174:getstatic       #838 <Field PdfName PdfName.FONT>
	//   86  177:aload_3         
	//   87  178:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			if(!((PdfDictionary) (obj)).contains(PdfName.HELV))
	//*  88  181:aload_3         
	//*  89  182:getstatic       #841 <Field PdfName PdfName.HELV>
	//*  90  185:invokevirtual   #814 <Method boolean PdfDictionary.contains(PdfName)>
	//*  91  188:ifne            257
			{
				PdfDictionary pdfdictionary2 = new PdfDictionary(PdfName.FONT);
	//   92  191:new             #386 <Class PdfDictionary>
	//   93  194:dup             
	//   94  195:getstatic       #838 <Field PdfName PdfName.FONT>
	//   95  198:invokespecial   #843 <Method void PdfDictionary(PdfName)>
	//   96  201:astore_2        
				pdfdictionary2.put(PdfName.BASEFONT, ((PdfObject) (PdfName.HELVETICA)));
	//   97  202:aload_2         
	//   98  203:getstatic       #846 <Field PdfName PdfName.BASEFONT>
	//   99  206:getstatic       #849 <Field PdfName PdfName.HELVETICA>
	//  100  209:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.ENCODING, ((PdfObject) (PdfName.WIN_ANSI_ENCODING)));
	//  101  212:aload_2         
	//  102  213:getstatic       #852 <Field PdfName PdfName.ENCODING>
	//  103  216:getstatic       #855 <Field PdfName PdfName.WIN_ANSI_ENCODING>
	//  104  219:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.NAME, ((PdfObject) (PdfName.HELV)));
	//  105  222:aload_2         
	//  106  223:getstatic       #858 <Field PdfName PdfName.NAME>
	//  107  226:getstatic       #841 <Field PdfName PdfName.HELV>
	//  108  229:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//  109  232:aload_2         
	//  110  233:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//  111  236:getstatic       #861 <Field PdfName PdfName.TYPE1>
	//  112  239:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.HELV, ((PdfObject) (addToBody(((PdfObject) (pdfdictionary2))).getIndirectReference())));
	//  113  242:aload_3         
	//  114  243:getstatic       #841 <Field PdfName PdfName.HELV>
	//  115  246:aload_0         
	//  116  247:aload_2         
	//  117  248:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//  118  251:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  119  254:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			if(!((PdfDictionary) (obj)).contains(PdfName.ZADB))
	//* 120  257:aload_3         
	//* 121  258:getstatic       #870 <Field PdfName PdfName.ZADB>
	//* 122  261:invokevirtual   #814 <Method boolean PdfDictionary.contains(PdfName)>
	//* 123  264:ifne            323
			{
				PdfDictionary pdfdictionary3 = new PdfDictionary(PdfName.FONT);
	//  124  267:new             #386 <Class PdfDictionary>
	//  125  270:dup             
	//  126  271:getstatic       #838 <Field PdfName PdfName.FONT>
	//  127  274:invokespecial   #843 <Method void PdfDictionary(PdfName)>
	//  128  277:astore_2        
				pdfdictionary3.put(PdfName.BASEFONT, ((PdfObject) (PdfName.ZAPFDINGBATS)));
	//  129  278:aload_2         
	//  130  279:getstatic       #846 <Field PdfName PdfName.BASEFONT>
	//  131  282:getstatic       #873 <Field PdfName PdfName.ZAPFDINGBATS>
	//  132  285:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary3.put(PdfName.NAME, ((PdfObject) (PdfName.ZADB)));
	//  133  288:aload_2         
	//  134  289:getstatic       #858 <Field PdfName PdfName.NAME>
	//  135  292:getstatic       #870 <Field PdfName PdfName.ZADB>
	//  136  295:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary3.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//  137  298:aload_2         
	//  138  299:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//  139  302:getstatic       #861 <Field PdfName PdfName.TYPE1>
	//  140  305:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.ZADB, ((PdfObject) (addToBody(((PdfObject) (pdfdictionary3))).getIndirectReference())));
	//  141  308:aload_3         
	//  142  309:getstatic       #870 <Field PdfName PdfName.ZADB>
	//  143  312:aload_0         
	//  144  313:aload_2         
	//  145  314:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//  146  317:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  147  320:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			if(pdfdictionary.get(PdfName.DA) == null)
	//* 148  323:aload_1         
	//* 149  324:getstatic       #810 <Field PdfName PdfName.DA>
	//* 150  327:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 151  330:ifnonnull       10
			{
				pdfdictionary.put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//  152  333:aload_1         
	//  153  334:getstatic       #810 <Field PdfName PdfName.DA>
	//  154  337:new             #816 <Class PdfString>
	//  155  340:dup             
	//  156  341:ldc2            #818 <String "/Helv 0 Tf 0 g ">
	//  157  344:invokespecial   #819 <Method void PdfString(String)>
	//  158  347:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				markUsed(((PdfObject) (pdfdictionary)));
	//  159  350:aload_0         
	//  160  351:aload_1         
	//  161  352:invokevirtual   #714 <Method void markUsed(PdfObject)>
				return;
	//  162  355:return          
			}
		}
	}

	protected void addFileAttachments()
		throws IOException
	{
		Object obj1 = ((Object) (pdf.getDocumentFileAttachment()));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #878 <Method HashMap PdfDocument.getDocumentFileAttachment()>
	//    3    7:astore          4
		if(((HashMap) (obj1)).isEmpty())
	//*   4    9:aload           4
	//*   5   11:invokevirtual   #879 <Method boolean HashMap.isEmpty()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		PdfDictionary pdfdictionary1 = reader.getCatalog();
	//    8   18:aload_0         
	//    9   19:getfield        #160 <Field PdfReader reader>
	//   10   22:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   11   25:astore          5
		Object obj = ((Object) ((PdfDictionary)PdfReader.getPdfObject(pdfdictionary1.get(PdfName.NAMES), ((PdfObject) (pdfdictionary1)))));
	//   12   27:aload           5
	//   13   29:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   14   32:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   15   35:aload           5
	//   16   37:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   17   40:checkcast       #386 <Class PdfDictionary>
	//   18   43:astore_3        
		PdfDictionary pdfdictionary = ((PdfDictionary) (obj));
	//   19   44:aload_3         
	//   20   45:astore_2        
		if(obj == null)
	//*  21   46:aload_3         
	//*  22   47:ifnonnull       73
		{
			pdfdictionary = new PdfDictionary();
	//   23   50:new             #386 <Class PdfDictionary>
	//   24   53:dup             
	//   25   54:invokespecial   #789 <Method void PdfDictionary()>
	//   26   57:astore_2        
			pdfdictionary1.put(PdfName.NAMES, ((PdfObject) (pdfdictionary)));
	//   27   58:aload           5
	//   28   60:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   29   63:aload_2         
	//   30   64:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (pdfdictionary1)));
	//   31   67:aload_0         
	//   32   68:aload           5
	//   33   70:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		markUsed(((PdfObject) (pdfdictionary)));
	//   34   73:aload_0         
	//   35   74:aload_2         
	//   36   75:invokevirtual   #714 <Method void markUsed(PdfObject)>
		obj = ((Object) (PdfNameTree.readTree((PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.EMBEDDEDFILES)))));
	//   37   78:aload_2         
	//   38   79:getstatic       #882 <Field PdfName PdfName.EMBEDDEDFILES>
	//   39   82:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   40   85:invokestatic    #584 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   41   88:checkcast       #386 <Class PdfDictionary>
	//   42   91:invokestatic    #888 <Method HashMap PdfNameTree.readTree(PdfDictionary)>
	//   43   94:astore_3        
		java.util.Map.Entry entry;
		Object obj2;
		for(obj1 = ((Object) (((HashMap) (obj1)).entrySet().iterator())); ((Iterator) (obj1)).hasNext(); ((HashMap) (obj)).put(((Object) (((StringBuilder) (obj2)).toString())), entry.getValue()))
	//*  44   95:aload           4
	//*  45   97:invokevirtual   #891 <Method Set HashMap.entrySet()>
	//*  46  100:invokeinterface #396 <Method Iterator Set.iterator()>
	//*  47  105:astore          4
	//*  48  107:aload           4
	//*  49  109:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  50  114:ifeq            206
		{
			entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   51  117:aload           4
	//   52  119:invokeinterface #351 <Method Object Iterator.next()>
	//   53  124:checkcast       #893 <Class java.util.Map$Entry>
	//   54  127:astore          5
			obj2 = ((Object) ((String)entry.getKey()));
	//   55  129:aload           5
	//   56  131:invokeinterface #896 <Method Object java.util.Map$Entry.getKey()>
	//   57  136:checkcast       #898 <Class String>
	//   58  139:astore          6
			int i = 0;
	//   59  141:iconst_0        
	//   60  142:istore_1        
			for(obj2 = ((Object) (new StringBuilder(((String) (obj2))))); ((HashMap) (obj)).containsKey(((Object) (((StringBuilder) (obj2)).toString()))); ((StringBuilder) (obj2)).append(" ").append(i))
	//*  61  143:new             #900 <Class StringBuilder>
	//*  62  146:dup             
	//*  63  147:aload           6
	//*  64  149:invokespecial   #901 <Method void StringBuilder(String)>
	//*  65  152:astore          6
	//*  66  154:aload_3         
	//*  67  155:aload           6
	//*  68  157:invokevirtual   #902 <Method String StringBuilder.toString()>
	//*  69  160:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*  70  163:ifeq            186
				i++;
	//   71  166:iload_1         
	//   72  167:iconst_1        
	//   73  168:iadd            
	//   74  169:istore_1        

	//   75  170:aload           6
	//   76  172:ldc2            #904 <String " ">
	//   77  175:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//   78  178:iload_1         
	//   79  179:invokevirtual   #910 <Method StringBuilder StringBuilder.append(int)>
	//   80  182:pop             
		}

	//   81  183:goto            154
	//   82  186:aload_3         
	//   83  187:aload           6
	//   84  189:invokevirtual   #902 <Method String StringBuilder.toString()>
	//   85  192:aload           5
	//   86  194:invokeinterface #913 <Method Object java.util.Map$Entry.getValue()>
	//   87  199:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   88  202:pop             
	//*  89  203:goto            107
		obj = ((Object) (PdfNameTree.writeTree(((HashMap) (obj)), ((PdfWriter) (this)))));
	//   90  206:aload_3         
	//   91  207:aload_0         
	//   92  208:invokestatic    #917 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   93  211:astore_3        
		obj1 = ((Object) (pdfdictionary.get(PdfName.EMBEDDEDFILES)));
	//   94  212:aload_2         
	//   95  213:getstatic       #882 <Field PdfName PdfName.EMBEDDEDFILES>
	//   96  216:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   97  219:astore          4
		if(obj1 != null)
	//*  98  221:aload           4
	//*  99  223:ifnull          232
			PdfReader.killIndirect(((PdfObject) (obj1)));
	//  100  226:aload           4
	//  101  228:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//  102  231:pop             
		pdfdictionary.put(PdfName.EMBEDDEDFILES, ((PdfObject) (addToBody(((PdfObject) (obj))).getIndirectReference())));
	//  103  232:aload_2         
	//  104  233:getstatic       #882 <Field PdfName PdfName.EMBEDDEDFILES>
	//  105  236:aload_0         
	//  106  237:aload_3         
	//  107  238:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//  108  241:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  109  244:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  110  247:return          
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		useVp = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #100 <Field boolean useVp>
		viewerPreferences.addViewerPreference(pdfname, pdfobject);
	//    3    5:aload_0         
	//    4    6:getfield        #105 <Field PdfViewerPreferencesImp viewerPreferences>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #920 <Method void PdfViewerPreferencesImp.addViewerPreference(PdfName, PdfObject)>
	//    8   14:return          
	}

	protected void alterContents()
		throws IOException
	{
		Iterator iterator = pagesToContent.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field HashMap pagesToContent>
	//    2    4:invokevirtual   #925 <Method Collection HashMap.values()>
	//    3    7:invokeinterface #928 <Method Iterator Collection.iterator()>
	//    4   12:astore_2        
		while(iterator.hasNext()) 
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            427
		{
			PageStamp pagestamp = (PageStamp)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #351 <Method Object Iterator.next()>
	//   10   28:checkcast       #6   <Class PdfStamperImp$PageStamp>
	//   11   31:astore_3        
			Object obj1 = ((Object) (pagestamp.pageN));
	//   12   32:aload_3         
	//   13   33:getfield        #932 <Field PdfDictionary PdfStamperImp$PageStamp.pageN>
	//   14   36:astore          4
			markUsed(((PdfObject) (obj1)));
	//   15   38:aload_0         
	//   16   39:aload           4
	//   17   41:invokevirtual   #714 <Method void markUsed(PdfObject)>
			Object obj = ((Object) (PdfReader.getPdfObject(((PdfDictionary) (obj1)).get(PdfName.CONTENTS), ((PdfObject) (obj1)))));
	//   18   44:aload           4
	//   19   46:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//   20   49:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   21   52:aload           4
	//   22   54:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   23   57:astore_1        
			ByteBuffer bytebuffer;
			PdfStream pdfstream;
			if(obj == null)
	//*  24   58:aload_1         
	//*  25   59:ifnonnull       336
			{
				obj = ((Object) (new PdfArray()));
	//   26   62:new             #290 <Class PdfArray>
	//   27   65:dup             
	//   28   66:invokespecial   #338 <Method void PdfArray()>
	//   29   69:astore_1        
				((PdfDictionary) (obj1)).put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//   30   70:aload           4
	//   31   72:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//   32   75:aload_1         
	//   33   76:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//*  34   79:new             #937 <Class ByteBuffer>
	//*  35   82:dup             
	//*  36   83:invokespecial   #938 <Method void ByteBuffer()>
	//*  37   86:astore          5
	//*  38   88:aload_3         
	//*  39   89:getfield        #942 <Field StampContent PdfStamperImp$PageStamp.under>
	//*  40   92:ifnull          134
	//*  41   95:aload           5
	//*  42   97:getstatic       #948 <Field byte[] PdfContents.SAVESTATE>
	//*  43  100:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  44  103:pop             
	//*  45  104:aload_0         
	//*  46  105:aload           4
	//*  47  107:aload           5
	//*  48  109:invokevirtual   #955 <Method void applyRotation(PdfDictionary, ByteBuffer)>
	//*  49  112:aload           5
	//*  50  114:aload_3         
	//*  51  115:getfield        #942 <Field StampContent PdfStamperImp$PageStamp.under>
	//*  52  118:invokevirtual   #961 <Method ByteBuffer StampContent.getInternalBuffer()>
	//*  53  121:invokevirtual   #964 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
	//*  54  124:pop             
	//*  55  125:aload           5
	//*  56  127:getstatic       #967 <Field byte[] PdfContents.RESTORESTATE>
	//*  57  130:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  58  133:pop             
	//*  59  134:aload_3         
	//*  60  135:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//*  61  138:ifnull          150
	//*  62  141:aload           5
	//*  63  143:getstatic       #948 <Field byte[] PdfContents.SAVESTATE>
	//*  64  146:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  65  149:pop             
	//*  66  150:new             #532 <Class PdfStream>
	//*  67  153:dup             
	//*  68  154:aload           5
	//*  69  156:invokevirtual   #974 <Method byte[] ByteBuffer.toByteArray()>
	//*  70  159:invokespecial   #977 <Method void PdfStream(byte[])>
	//*  71  162:astore          6
	//*  72  164:aload           6
	//*  73  166:aload_0         
	//*  74  167:getfield        #980 <Field int compressionLevel>
	//*  75  170:invokevirtual   #983 <Method void PdfStream.flateCompress(int)>
	//*  76  173:aload_1         
	//*  77  174:aload_0         
	//*  78  175:aload           6
	//*  79  177:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//*  80  180:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  81  183:invokevirtual   #986 <Method void PdfArray.addFirst(PdfObject)>
	//*  82  186:aload           5
	//*  83  188:invokevirtual   #989 <Method void ByteBuffer.reset()>
	//*  84  191:aload_3         
	//*  85  192:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//*  86  195:ifnull          328
	//*  87  198:aload           5
	//*  88  200:bipush          32
	//*  89  202:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//*  90  205:pop             
	//*  91  206:aload           5
	//*  92  208:getstatic       #967 <Field byte[] PdfContents.RESTORESTATE>
	//*  93  211:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  94  214:pop             
	//*  95  215:aload_3         
	//*  96  216:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//*  97  219:invokevirtual   #961 <Method ByteBuffer StampContent.getInternalBuffer()>
	//*  98  222:astore          6
	//*  99  224:aload           5
	//* 100  226:aload           6
	//* 101  228:invokevirtual   #995 <Method byte[] ByteBuffer.getBuffer()>
	//* 102  231:iconst_0        
	//* 103  232:aload_3         
	//* 104  233:getfield        #998 <Field int PdfStamperImp$PageStamp.replacePoint>
	//* 105  236:invokevirtual   #1001 <Method ByteBuffer ByteBuffer.append(byte[], int, int)>
	//* 106  239:pop             
	//* 107  240:aload           5
	//* 108  242:getstatic       #948 <Field byte[] PdfContents.SAVESTATE>
	//* 109  245:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 110  248:pop             
	//* 111  249:aload_0         
	//* 112  250:aload           4
	//* 113  252:aload           5
	//* 114  254:invokevirtual   #955 <Method void applyRotation(PdfDictionary, ByteBuffer)>
	//* 115  257:aload           5
	//* 116  259:aload           6
	//* 117  261:invokevirtual   #995 <Method byte[] ByteBuffer.getBuffer()>
	//* 118  264:aload_3         
	//* 119  265:getfield        #998 <Field int PdfStamperImp$PageStamp.replacePoint>
	//* 120  268:aload           6
	//* 121  270:invokevirtual   #1002 <Method int ByteBuffer.size()>
	//* 122  273:aload_3         
	//* 123  274:getfield        #998 <Field int PdfStamperImp$PageStamp.replacePoint>
	//* 124  277:isub            
	//* 125  278:invokevirtual   #1001 <Method ByteBuffer ByteBuffer.append(byte[], int, int)>
	//* 126  281:pop             
	//* 127  282:aload           5
	//* 128  284:getstatic       #967 <Field byte[] PdfContents.RESTORESTATE>
	//* 129  287:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 130  290:pop             
	//* 131  291:new             #532 <Class PdfStream>
	//* 132  294:dup             
	//* 133  295:aload           5
	//* 134  297:invokevirtual   #974 <Method byte[] ByteBuffer.toByteArray()>
	//* 135  300:invokespecial   #977 <Method void PdfStream(byte[])>
	//* 136  303:astore          4
	//* 137  305:aload           4
	//* 138  307:aload_0         
	//* 139  308:getfield        #980 <Field int compressionLevel>
	//* 140  311:invokevirtual   #983 <Method void PdfStream.flateCompress(int)>
	//* 141  314:aload_1         
	//* 142  315:aload_0         
	//* 143  316:aload           4
	//* 144  318:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//* 145  321:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 146  324:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//* 147  327:pop             
	//* 148  328:aload_0         
	//* 149  329:aload_3         
	//* 150  330:invokevirtual   #1006 <Method void alterResources(PdfStamperImp$PageStamp)>
	//* 151  333:goto            13
			if(((PdfObject) (obj)).isArray())
	//* 152  336:aload_1         
	//* 153  337:invokevirtual   #328 <Method boolean PdfObject.isArray()>
	//* 154  340:ifeq            367
			{
				obj = ((Object) (new PdfArray((PdfArray)obj)));
	//  155  343:new             #290 <Class PdfArray>
	//  156  346:dup             
	//  157  347:aload_1         
	//  158  348:checkcast       #290 <Class PdfArray>
	//  159  351:invokespecial   #1009 <Method void PdfArray(PdfArray)>
	//  160  354:astore_1        
				((PdfDictionary) (obj1)).put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//  161  355:aload           4
	//  162  357:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//  163  360:aload_1         
	//  164  361:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 165  364:goto            79
			if(((PdfObject) (obj)).isStream())
	//* 166  367:aload_1         
	//* 167  368:invokevirtual   #1012 <Method boolean PdfObject.isStream()>
	//* 168  371:ifeq            407
			{
				obj = ((Object) (new PdfArray()));
	//  169  374:new             #290 <Class PdfArray>
	//  170  377:dup             
	//  171  378:invokespecial   #338 <Method void PdfArray()>
	//  172  381:astore_1        
				((PdfArray) (obj)).add(((PdfDictionary) (obj1)).get(PdfName.CONTENTS));
	//  173  382:aload_1         
	//  174  383:aload           4
	//  175  385:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//  176  388:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  177  391:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//  178  394:pop             
				((PdfDictionary) (obj1)).put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//  179  395:aload           4
	//  180  397:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//  181  400:aload_1         
	//  182  401:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 183  404:goto            79
			{
				obj = ((Object) (new PdfArray()));
	//  184  407:new             #290 <Class PdfArray>
	//  185  410:dup             
	//  186  411:invokespecial   #338 <Method void PdfArray()>
	//  187  414:astore_1        
				((PdfDictionary) (obj1)).put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//  188  415:aload           4
	//  189  417:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//  190  420:aload_1         
	//  191  421:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			bytebuffer = new ByteBuffer();
			if(pagestamp.under != null)
			{
				bytebuffer.append(PdfContents.SAVESTATE);
				applyRotation(((PdfDictionary) (obj1)), bytebuffer);
				bytebuffer.append(pagestamp.under.getInternalBuffer());
				bytebuffer.append(PdfContents.RESTORESTATE);
			}
			if(pagestamp.over != null)
				bytebuffer.append(PdfContents.SAVESTATE);
			pdfstream = new PdfStream(bytebuffer.toByteArray());
			pdfstream.flateCompress(compressionLevel);
			((PdfArray) (obj)).addFirst(((PdfObject) (addToBody(((PdfObject) (pdfstream))).getIndirectReference())));
			bytebuffer.reset();
			if(pagestamp.over != null)
			{
				bytebuffer.append(' ');
				bytebuffer.append(PdfContents.RESTORESTATE);
				ByteBuffer bytebuffer1 = pagestamp.over.getInternalBuffer();
				bytebuffer.append(bytebuffer1.getBuffer(), 0, pagestamp.replacePoint);
				bytebuffer.append(PdfContents.SAVESTATE);
				applyRotation(((PdfDictionary) (obj1)), bytebuffer);
				bytebuffer.append(bytebuffer1.getBuffer(), pagestamp.replacePoint, bytebuffer1.size() - pagestamp.replacePoint);
				bytebuffer.append(PdfContents.RESTORESTATE);
				obj1 = ((Object) (new PdfStream(bytebuffer.toByteArray())));
				((PdfStream) (obj1)).flateCompress(compressionLevel);
				((PdfArray) (obj)).add(((PdfObject) (addToBody(((PdfObject) (obj1))).getIndirectReference())));
			}
			alterResources(pagestamp);
		}
	//* 192  424:goto            79
	//  193  427:return          
	}

	void alterResources(PageStamp pagestamp)
	{
		pagestamp.pageN.put(PdfName.RESOURCES, ((PdfObject) (pagestamp.pageResources.getResources())));
	//    0    0:aload_1         
	//    1    1:getfield        #932 <Field PdfDictionary PdfStamperImp$PageStamp.pageN>
	//    2    4:getstatic       #1015 <Field PdfName PdfName.RESOURCES>
	//    3    7:aload_1         
	//    4    8:getfield        #1019 <Field PageResources PdfStamperImp$PageStamp.pageResources>
	//    5   11:invokevirtual   #1023 <Method PdfDictionary PageResources.getResources()>
	//    6   14:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    7   17:return          
	}

	void applyRotation(PdfDictionary pdfdictionary, ByteBuffer bytebuffer)
	{
		if(!rotateContents)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field boolean rotateContents>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		pdfdictionary = ((PdfDictionary) (reader.getPageSizeWithRotation(pdfdictionary)));
	//    4    8:aload_0         
	//    5    9:getfield        #160 <Field PdfReader reader>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #736 <Method Rectangle PdfReader.getPageSizeWithRotation(PdfDictionary)>
	//    8   16:astore_1        
		switch(((Rectangle) (pdfdictionary)).getRotation())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #1026 <Method int Rectangle.getRotation()>
		{
	//*  11   21:lookupswitch    3: default 56
	//	               90: 57
	//	               180: 93
	//	               270: 135
		default:
			return;
	//   12   56:return          

		case 90: // 'Z'
			bytebuffer.append(PdfContents.ROTATE90);
	//   13   57:aload_2         
	//   14   58:getstatic       #1029 <Field byte[] PdfContents.ROTATE90>
	//   15   61:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   16   64:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getTop());
	//   17   65:aload_2         
	//   18   66:aload_1         
	//   19   67:invokevirtual   #630 <Method float Rectangle.getTop()>
	//   20   70:invokevirtual   #1032 <Method ByteBuffer ByteBuffer.append(float)>
	//   21   73:pop             
			bytebuffer.append(' ').append('0').append(PdfContents.ROTATEFINAL);
	//   22   74:aload_2         
	//   23   75:bipush          32
	//   24   77:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//   25   80:bipush          48
	//   26   82:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//   27   85:getstatic       #1035 <Field byte[] PdfContents.ROTATEFINAL>
	//   28   88:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   29   91:pop             
			return;
	//   30   92:return          

		case 180: 
			bytebuffer.append(PdfContents.ROTATE180);
	//   31   93:aload_2         
	//   32   94:getstatic       #1038 <Field byte[] PdfContents.ROTATE180>
	//   33   97:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   34  100:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getRight());
	//   35  101:aload_2         
	//   36  102:aload_1         
	//   37  103:invokevirtual   #627 <Method float Rectangle.getRight()>
	//   38  106:invokevirtual   #1032 <Method ByteBuffer ByteBuffer.append(float)>
	//   39  109:pop             
			bytebuffer.append(' ');
	//   40  110:aload_2         
	//   41  111:bipush          32
	//   42  113:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//   43  116:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getTop());
	//   44  117:aload_2         
	//   45  118:aload_1         
	//   46  119:invokevirtual   #630 <Method float Rectangle.getTop()>
	//   47  122:invokevirtual   #1032 <Method ByteBuffer ByteBuffer.append(float)>
	//   48  125:pop             
			bytebuffer.append(PdfContents.ROTATEFINAL);
	//   49  126:aload_2         
	//   50  127:getstatic       #1035 <Field byte[] PdfContents.ROTATEFINAL>
	//   51  130:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   52  133:pop             
			return;
	//   53  134:return          

		case 270: 
			bytebuffer.append(PdfContents.ROTATE270);
	//   54  135:aload_2         
	//   55  136:getstatic       #1041 <Field byte[] PdfContents.ROTATE270>
	//   56  139:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   57  142:pop             
			break;
		}
		bytebuffer.append('0').append(' ');
	//   58  143:aload_2         
	//   59  144:bipush          48
	//   60  146:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//   61  149:bipush          32
	//   62  151:invokevirtual   #992 <Method ByteBuffer ByteBuffer.append(char)>
	//   63  154:pop             
		bytebuffer.append(((Rectangle) (pdfdictionary)).getRight());
	//   64  155:aload_2         
	//   65  156:aload_1         
	//   66  157:invokevirtual   #627 <Method float Rectangle.getRight()>
	//   67  160:invokevirtual   #1032 <Method ByteBuffer ByteBuffer.append(float)>
	//   68  163:pop             
		bytebuffer.append(PdfContents.ROTATEFINAL);
	//   69  164:aload_2         
	//   70  165:getstatic       #1035 <Field byte[] PdfContents.ROTATEFINAL>
	//   71  168:invokevirtual   #951 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   72  171:pop             
	//   73  172:return          
	}

	protected void close(PdfIndirectReference pdfindirectreference, int i)
		throws IOException
	{
		alterContents();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1045 <Method void alterContents()>
		int l = ((PRIndirectReference)reader.trailer.get(PdfName.ROOT)).getNumber();
	//    2    4:aload_0         
	//    3    5:getfield        #160 <Field PdfReader reader>
	//    4    8:getfield        #1048 <Field PdfDictionary PdfReader.trailer>
	//    5   11:getstatic       #1051 <Field PdfName PdfName.ROOT>
	//    6   14:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//    7   17:checkcast       #366 <Class PRIndirectReference>
	//    8   20:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//    9   23:istore          4
		if(append)
	//*  10   25:aload_0         
	//*  11   26:getfield        #168 <Field boolean append>
	//*  12   29:ifeq            183
		{
			int ai[] = marked.getKeys();
	//   13   32:aload_0         
	//   14   33:getfield        #269 <Field IntHashtable marked>
	//   15   36:invokevirtual   #783 <Method int[] IntHashtable.getKeys()>
	//   16   39:astore          7
			int j = 0;
	//   17   41:iconst_0        
	//   18   42:istore_3        
			while(j < ai.length) 
	//*  19   43:iload_3         
	//*  20   44:aload           7
	//*  21   46:arraylength     
	//*  22   47:icmpge          128
			{
				int i1 = ai[j];
	//   23   50:aload           7
	//   24   52:iload_3         
	//   25   53:iaload          
	//   26   54:istore          5
				PdfObject pdfobject2 = reader.getPdfObjectRelease(i1);
	//   27   56:aload_0         
	//   28   57:getfield        #160 <Field PdfReader reader>
	//   29   60:iload           5
	//   30   62:invokevirtual   #1053 <Method PdfObject PdfReader.getPdfObjectRelease(int)>
	//   31   65:astore          8
				if(pdfobject2 != null && i != i1 && i1 < initialXrefSize)
	//*  32   67:aload           8
	//*  33   69:ifnull          115
	//*  34   72:iload_2         
	//*  35   73:iload           5
	//*  36   75:icmpeq          115
	//*  37   78:iload           5
	//*  38   80:aload_0         
	//*  39   81:getfield        #280 <Field int initialXrefSize>
	//*  40   84:icmpge          115
				{
					PRIndirectReference prindirectreference = pdfobject2.getIndRef();
	//   41   87:aload           8
	//   42   89:invokevirtual   #1057 <Method PRIndirectReference PdfObject.getIndRef()>
	//   43   92:astore          9
					boolean flag;
					if(i1 != l)
	//*  44   94:iload           5
	//*  45   96:iload           4
	//*  46   98:icmpeq          122
						flag = true;
	//   47  101:iconst_1        
	//   48  102:istore          6
					else
	//*  49  104:aload_0         
	//*  50  105:aload           8
	//*  51  107:aload           9
	//*  52  109:iload           6
	//*  53  111:invokevirtual   #1060 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference, boolean)>
	//*  54  114:pop             
	//*  55  115:iload_3         
	//*  56  116:iconst_1        
	//*  57  117:iadd            
	//*  58  118:istore_3        
	//*  59  119:goto            43
						flag = false;
	//   60  122:iconst_0        
	//   61  123:istore          6
					addToBody(pdfobject2, ((PdfIndirectReference) (prindirectreference)), flag);
				}
				j++;
			}
	//*  62  125:goto            104
			for(i = initialXrefSize; i < reader.getXrefSize(); i++)
	//*  63  128:aload_0         
	//*  64  129:getfield        #280 <Field int initialXrefSize>
	//*  65  132:istore_2        
	//*  66  133:iload_2         
	//*  67  134:aload_0         
	//*  68  135:getfield        #160 <Field PdfReader reader>
	//*  69  138:invokevirtual   #261 <Method int PdfReader.getXrefSize()>
	//*  70  141:icmpge          261
			{
				PdfObject pdfobject = reader.getPdfObject(i);
	//   71  144:aload_0         
	//   72  145:getfield        #160 <Field PdfReader reader>
	//   73  148:iload_2         
	//   74  149:invokevirtual   #1061 <Method PdfObject PdfReader.getPdfObject(int)>
	//   75  152:astore          7
				if(pdfobject != null)
	//*  76  154:aload           7
	//*  77  156:ifnull          176
					addToBody(pdfobject, getNewObjectNumber(reader, i, 0));
	//   78  159:aload_0         
	//   79  160:aload           7
	//   80  162:aload_0         
	//   81  163:aload_0         
	//   82  164:getfield        #160 <Field PdfReader reader>
	//   83  167:iload_2         
	//   84  168:iconst_0        
	//   85  169:invokevirtual   #797 <Method int getNewObjectNumber(PdfReader, int, int)>
	//   86  172:invokevirtual   #800 <Method PdfIndirectObject addToBody(PdfObject, int)>
	//   87  175:pop             
			}

	//   88  176:iload_2         
	//   89  177:iconst_1        
	//   90  178:iadd            
	//   91  179:istore_2        
		} else
	//*  92  180:goto            133
		{
			int k = 1;
	//   93  183:iconst_1        
	//   94  184:istore_3        
			while(k < reader.getXrefSize()) 
	//*  95  185:iload_3         
	//*  96  186:aload_0         
	//*  97  187:getfield        #160 <Field PdfReader reader>
	//*  98  190:invokevirtual   #261 <Method int PdfReader.getXrefSize()>
	//*  99  193:icmpge          261
			{
				PdfObject pdfobject1 = reader.getPdfObjectRelease(k);
	//  100  196:aload_0         
	//  101  197:getfield        #160 <Field PdfReader reader>
	//  102  200:iload_3         
	//  103  201:invokevirtual   #1053 <Method PdfObject PdfReader.getPdfObjectRelease(int)>
	//  104  204:astore          7
				if(pdfobject1 != null && i != k)
	//* 105  206:aload           7
	//* 106  208:ifnull          248
	//* 107  211:iload_2         
	//* 108  212:iload_3         
	//* 109  213:icmpeq          248
				{
					int j1 = getNewObjectNumber(reader, k, 0);
	//  110  216:aload_0         
	//  111  217:aload_0         
	//  112  218:getfield        #160 <Field PdfReader reader>
	//  113  221:iload_3         
	//  114  222:iconst_0        
	//  115  223:invokevirtual   #797 <Method int getNewObjectNumber(PdfReader, int, int)>
	//  116  226:istore          5
					boolean flag1;
					if(k != l)
	//* 117  228:iload_3         
	//* 118  229:iload           4
	//* 119  231:icmpeq          255
						flag1 = true;
	//  120  234:iconst_1        
	//  121  235:istore          6
					else
	//* 122  237:aload_0         
	//* 123  238:aload           7
	//* 124  240:iload           5
	//* 125  242:iload           6
	//* 126  244:invokevirtual   #1064 <Method PdfIndirectObject addToBody(PdfObject, int, boolean)>
	//* 127  247:pop             
	//* 128  248:iload_3         
	//* 129  249:iconst_1        
	//* 130  250:iadd            
	//* 131  251:istore_3        
	//* 132  252:goto            185
						flag1 = false;
	//  133  255:iconst_0        
	//  134  256:istore          6
					addToBody(pdfobject1, j1, flag1);
				}
				k++;
			}
		}
	//* 135  258:goto            237
		PdfIndirectReference pdfindirectreference1 = null;
	//  136  261:aconst_null     
	//  137  262:astore          8
		Object obj;
		Object obj1;
		if(crypto != null)
	//* 138  264:aload_0         
	//* 139  265:getfield        #187 <Field PdfEncryption crypto>
	//* 140  268:ifnull          479
		{
			if(append)
	//* 141  271:aload_0         
	//* 142  272:getfield        #168 <Field boolean append>
	//* 143  275:ifeq            459
				pdfindirectreference1 = reader.getCryptoRef();
	//  144  278:aload_0         
	//  145  279:getfield        #160 <Field PdfReader reader>
	//  146  282:invokevirtual   #1067 <Method PdfIndirectReference PdfReader.getCryptoRef()>
	//  147  285:astore          8
			else
	//* 148  287:aload_0         
	//* 149  288:getfield        #187 <Field PdfEncryption crypto>
	//* 150  291:iconst_1        
	//* 151  292:invokevirtual   #1071 <Method PdfObject PdfEncryption.getFileID(boolean)>
	//* 152  295:astore          7
	//* 153  297:aload_0         
	//* 154  298:getfield        #160 <Field PdfReader reader>
	//* 155  301:getfield        #1048 <Field PdfDictionary PdfReader.trailer>
	//* 156  304:getstatic       #1051 <Field PdfName PdfName.ROOT>
	//* 157  307:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 158  310:checkcast       #366 <Class PRIndirectReference>
	//* 159  313:astore          9
	//* 160  315:new             #429 <Class PdfIndirectReference>
	//* 161  318:dup             
	//* 162  319:iconst_0        
	//* 163  320:aload_0         
	//* 164  321:aload_0         
	//* 165  322:getfield        #160 <Field PdfReader reader>
	//* 166  325:aload           9
	//* 167  327:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 168  330:iconst_0        
	//* 169  331:invokevirtual   #797 <Method int getNewObjectNumber(PdfReader, int, int)>
	//* 170  334:invokespecial   #1074 <Method void PdfIndirectReference(int, int)>
	//* 171  337:astore          9
	//* 172  339:aload_0         
	//* 173  340:getfield        #257 <Field PdfWriter$PdfBody body>
	//* 174  343:aload_0         
	//* 175  344:getfield        #219 <Field OutputStreamCounter os>
	//* 176  347:aload           9
	//* 177  349:aload_1         
	//* 178  350:aload           8
	//* 179  352:aload           7
	//* 180  354:aload_0         
	//* 181  355:getfield        #233 <Field long prevxref>
	//* 182  358:invokevirtual   #1078 <Method void PdfWriter$PdfBody.writeCrossReferenceTable(OutputStream, PdfIndirectReference, PdfIndirectReference, PdfIndirectReference, PdfObject, long)>
	//* 183  361:aload_0         
	//* 184  362:getfield        #275 <Field boolean fullCompression>
	//* 185  365:ifeq            538
	//* 186  368:aload_0         
	//* 187  369:getfield        #219 <Field OutputStreamCounter os>
	//* 188  372:invokestatic    #1082 <Method void writeKeyInfo(OutputStream)>
	//* 189  375:aload_0         
	//* 190  376:getfield        #219 <Field OutputStreamCounter os>
	//* 191  379:ldc2            #1084 <String "startxref\n">
	//* 192  382:invokestatic    #1088 <Method byte[] getISOBytes(String)>
	//* 193  385:invokevirtual   #1090 <Method void OutputStreamCounter.write(byte[])>
	//* 194  388:aload_0         
	//* 195  389:getfield        #219 <Field OutputStreamCounter os>
	//* 196  392:aload_0         
	//* 197  393:getfield        #257 <Field PdfWriter$PdfBody body>
	//* 198  396:invokevirtual   #1093 <Method long PdfWriter$PdfBody.offset()>
	//* 199  399:invokestatic    #1096 <Method String String.valueOf(long)>
	//* 200  402:invokestatic    #1088 <Method byte[] getISOBytes(String)>
	//* 201  405:invokevirtual   #1090 <Method void OutputStreamCounter.write(byte[])>
	//* 202  408:aload_0         
	//* 203  409:getfield        #219 <Field OutputStreamCounter os>
	//* 204  412:ldc2            #1098 <String "\n%%EOF\n">
	//* 205  415:invokestatic    #1088 <Method byte[] getISOBytes(String)>
	//* 206  418:invokevirtual   #1090 <Method void OutputStreamCounter.write(byte[])>
	//* 207  421:aload_0         
	//* 208  422:getfield        #219 <Field OutputStreamCounter os>
	//* 209  425:invokevirtual   #1101 <Method void OutputStreamCounter.flush()>
	//* 210  428:aload_0         
	//* 211  429:invokevirtual   #1104 <Method boolean isCloseStream()>
	//* 212  432:ifeq            442
	//* 213  435:aload_0         
	//* 214  436:getfield        #219 <Field OutputStreamCounter os>
	//* 215  439:invokevirtual   #1106 <Method void OutputStreamCounter.close()>
	//* 216  442:aload_0         
	//* 217  443:invokevirtual   #1109 <Method Counter getCounter()>
	//* 218  446:aload_0         
	//* 219  447:getfield        #219 <Field OutputStreamCounter os>
	//* 220  450:invokevirtual   #1111 <Method long OutputStreamCounter.getCounter()>
	//* 221  453:invokeinterface #1117 <Method void Counter.written(long)>
	//* 222  458:return          
				pdfindirectreference1 = addToBody(((PdfObject) (crypto.getEncryptionDictionary())), false).getIndirectReference();
	//  223  459:aload_0         
	//  224  460:aload_0         
	//  225  461:getfield        #187 <Field PdfEncryption crypto>
	//  226  464:invokevirtual   #1120 <Method PdfDictionary PdfEncryption.getEncryptionDictionary()>
	//  227  467:iconst_0        
	//  228  468:invokevirtual   #1123 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//  229  471:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  230  474:astore          8
			obj = ((Object) (crypto.getFileID(true)));
		} else
	//* 231  476:goto            287
		{
			obj = ((Object) (reader.trailer.getAsArray(PdfName.ID)));
	//  232  479:aload_0         
	//  233  480:getfield        #160 <Field PdfReader reader>
	//  234  483:getfield        #1048 <Field PdfDictionary PdfReader.trailer>
	//  235  486:getstatic       #1126 <Field PdfName PdfName.ID>
	//  236  489:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  237  492:astore          7
			if(obj != null && ((PdfArray) (obj)).getAsString(0) != null)
	//* 238  494:aload           7
	//* 239  496:ifnull          526
	//* 240  499:aload           7
	//* 241  501:iconst_0        
	//* 242  502:invokevirtual   #1130 <Method PdfString PdfArray.getAsString(int)>
	//* 243  505:ifnull          526
				obj = ((Object) (PdfEncryption.createInfoId(((PdfArray) (obj)).getAsString(0).getBytes(), true)));
	//  244  508:aload           7
	//  245  510:iconst_0        
	//  246  511:invokevirtual   #1130 <Method PdfString PdfArray.getAsString(int)>
	//  247  514:invokevirtual   #1133 <Method byte[] PdfString.getBytes()>
	//  248  517:iconst_1        
	//  249  518:invokestatic    #1137 <Method PdfObject PdfEncryption.createInfoId(byte[], boolean)>
	//  250  521:astore          7
			else
	//* 251  523:goto            297
				obj = ((Object) (PdfEncryption.createInfoId(PdfEncryption.createDocumentId(), true)));
	//  252  526:invokestatic    #1140 <Method byte[] PdfEncryption.createDocumentId()>
	//  253  529:iconst_1        
	//  254  530:invokestatic    #1137 <Method PdfObject PdfEncryption.createInfoId(byte[], boolean)>
	//  255  533:astore          7
		}
		obj1 = ((Object) ((PRIndirectReference)reader.trailer.get(PdfName.ROOT)));
		obj1 = ((Object) (new PdfIndirectReference(0, getNewObjectNumber(reader, ((PRIndirectReference) (obj1)).getNumber(), 0))));
		body.writeCrossReferenceTable(((OutputStream) (os)), ((PdfIndirectReference) (obj1)), pdfindirectreference, pdfindirectreference1, ((PdfObject) (obj)), prevxref);
		if(fullCompression)
		{
			writeKeyInfo(((OutputStream) (os)));
			os.write(getISOBytes("startxref\n"));
			os.write(getISOBytes(String.valueOf(body.offset())));
			os.write(getISOBytes("\n%%EOF\n"));
		} else
	//* 256  535:goto            297
		{
			(new PdfWriter.PdfTrailer(body.size(), body.offset(), ((PdfIndirectReference) (obj1)), pdfindirectreference, pdfindirectreference1, ((PdfObject) (obj)), prevxref)).toPdf(((PdfWriter) (this)), ((OutputStream) (os)));
	//  257  538:new             #1142 <Class PdfWriter$PdfTrailer>
	//  258  541:dup             
	//  259  542:aload_0         
	//  260  543:getfield        #257 <Field PdfWriter$PdfBody body>
	//  261  546:invokevirtual   #1143 <Method int PdfWriter$PdfBody.size()>
	//  262  549:aload_0         
	//  263  550:getfield        #257 <Field PdfWriter$PdfBody body>
	//  264  553:invokevirtual   #1093 <Method long PdfWriter$PdfBody.offset()>
	//  265  556:aload           9
	//  266  558:aload_1         
	//  267  559:aload           8
	//  268  561:aload           7
	//  269  563:aload_0         
	//  270  564:getfield        #233 <Field long prevxref>
	//  271  567:invokespecial   #1146 <Method void PdfWriter$PdfTrailer(int, long, PdfIndirectReference, PdfIndirectReference, PdfIndirectReference, PdfObject, long)>
	//  272  570:aload_0         
	//  273  571:aload_0         
	//  274  572:getfield        #219 <Field OutputStreamCounter os>
	//  275  575:invokevirtual   #1150 <Method void PdfWriter$PdfTrailer.toPdf(PdfWriter, OutputStream)>
		}
		os.flush();
		if(isCloseStream())
			os.close();
		getCounter().written(os.getCounter());
	//* 276  578:goto            421
	}

	protected void close(Map map)
		throws IOException
	{
		Object obj;
		Object obj2;
		String s;
		byte abyte0[];
		Object obj4;
		PdfDictionary pdfdictionary1;
		PdfDictionary pdfdictionary2;
		PdfDate pdfdate;
		if(closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean closed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(useVp)
	//*   4    8:aload_0         
	//*   5    9:getfield        #100 <Field boolean useVp>
	//*   6   12:ifeq            19
			setViewerPreferences();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #1156 <Method void setViewerPreferences()>
		if(flat)
	//*   9   19:aload_0         
	//*  10   20:getfield        #87  <Field boolean flat>
	//*  11   23:ifeq            30
			flatFields();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #1159 <Method void flatFields()>
		if(flatFreeText)
	//*  14   30:aload_0         
	//*  15   31:getfield        #89  <Field boolean flatFreeText>
	//*  16   34:ifeq            41
			flatFreeTextFields();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #1162 <Method void flatFreeTextFields()>
		if(flatannotations)
	//*  19   41:aload_0         
	//*  20   42:getfield        #91  <Field boolean flatannotations>
	//*  21   45:ifeq            52
			flattenAnnotations();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #1164 <Method void flattenAnnotations()>
		addFieldResources();
	//   24   52:aload_0         
	//   25   53:invokevirtual   #1166 <Method void addFieldResources()>
		pdfdictionary1 = reader.getCatalog();
	//   26   56:aload_0         
	//   27   57:getfield        #160 <Field PdfReader reader>
	//   28   60:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   29   63:astore          10
		getPdfVersion().addToCatalog(pdfdictionary1);
	//   30   65:aload_0         
	//   31   66:invokevirtual   #1169 <Method PdfVersionImp getPdfVersion()>
	//   32   69:aload           10
	//   33   71:invokevirtual   #1172 <Method void PdfVersionImp.addToCatalog(PdfDictionary)>
		obj = ((Object) ((PdfDictionary)PdfReader.getPdfObject(pdfdictionary1.get(PdfName.ACROFORM), ((PdfObject) (reader.getCatalog())))));
	//   34   74:aload           10
	//   35   76:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//   36   79:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   37   82:aload_0         
	//   38   83:getfield        #160 <Field PdfReader reader>
	//   39   86:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   40   89:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   41   92:checkcast       #386 <Class PdfDictionary>
	//   42   95:astore          4
		if(acroFields != null && acroFields.getXfa().isChanged())
	//*  43   97:aload_0         
	//*  44   98:getfield        #1174 <Field AcroFields acroFields>
	//*  45  101:ifnull          141
	//*  46  104:aload_0         
	//*  47  105:getfield        #1174 <Field AcroFields acroFields>
	//*  48  108:invokevirtual   #1180 <Method XfaForm AcroFields.getXfa()>
	//*  49  111:invokevirtual   #1185 <Method boolean XfaForm.isChanged()>
	//*  50  114:ifeq            141
		{
			markUsed(((PdfObject) (obj)));
	//   51  117:aload_0         
	//   52  118:aload           4
	//   53  120:invokevirtual   #714 <Method void markUsed(PdfObject)>
			if(!flat)
	//*  54  123:aload_0         
	//*  55  124:getfield        #87  <Field boolean flat>
	//*  56  127:ifne            141
				acroFields.getXfa().setXfa(((PdfWriter) (this)));
	//   57  130:aload_0         
	//   58  131:getfield        #1174 <Field AcroFields acroFields>
	//   59  134:invokevirtual   #1180 <Method XfaForm AcroFields.getXfa()>
	//   60  137:aload_0         
	//   61  138:invokevirtual   #1188 <Method void XfaForm.setXfa(PdfWriter)>
		}
		if(sigFlags != 0 && obj != null)
	//*  62  141:aload_0         
	//*  63  142:getfield        #111 <Field int sigFlags>
	//*  64  145:ifeq            184
	//*  65  148:aload           4
	//*  66  150:ifnull          184
		{
			((PdfDictionary) (obj)).put(PdfName.SIGFLAGS, ((PdfObject) (new PdfNumber(sigFlags))));
	//   67  153:aload           4
	//   68  155:getstatic       #1191 <Field PdfName PdfName.SIGFLAGS>
	//   69  158:new             #448 <Class PdfNumber>
	//   70  161:dup             
	//   71  162:aload_0         
	//   72  163:getfield        #111 <Field int sigFlags>
	//   73  166:invokespecial   #1193 <Method void PdfNumber(int)>
	//   74  169:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (obj)));
	//   75  172:aload_0         
	//   76  173:aload           4
	//   77  175:invokevirtual   #714 <Method void markUsed(PdfObject)>
			markUsed(((PdfObject) (pdfdictionary1)));
	//   78  178:aload_0         
	//   79  179:aload           10
	//   80  181:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		closed = true;
	//   81  184:aload_0         
	//   82  185:iconst_1        
	//   83  186:putfield        #83  <Field boolean closed>
		addSharedObjectsToBody();
	//   84  189:aload_0         
	//   85  190:invokevirtual   #1196 <Method void addSharedObjectsToBody()>
		setOutlines();
	//   86  193:aload_0         
	//   87  194:invokevirtual   #1199 <Method void setOutlines()>
		setJavaScript();
	//   88  197:aload_0         
	//   89  198:invokevirtual   #1202 <Method void setJavaScript()>
		addFileAttachments();
	//   90  201:aload_0         
	//   91  202:invokevirtual   #1204 <Method void addFileAttachments()>
		if(extraCatalog != null)
	//*  92  205:aload_0         
	//*  93  206:getfield        #1207 <Field PdfDictionary extraCatalog>
	//*  94  209:ifnull          221
			pdfdictionary1.mergeDifferent(extraCatalog);
	//   95  212:aload           10
	//   96  214:aload_0         
	//   97  215:getfield        #1207 <Field PdfDictionary extraCatalog>
	//   98  218:invokevirtual   #1210 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		if(openAction != null)
	//*  99  221:aload_0         
	//* 100  222:getfield        #1212 <Field PdfAction openAction>
	//* 101  225:ifnull          240
			pdfdictionary1.put(PdfName.OPENACTION, ((PdfObject) (openAction)));
	//  102  228:aload           10
	//  103  230:getstatic       #1215 <Field PdfName PdfName.OPENACTION>
	//  104  233:aload_0         
	//  105  234:getfield        #1212 <Field PdfAction openAction>
	//  106  237:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdf.pageLabels != null)
	//* 107  240:aload_0         
	//* 108  241:getfield        #249 <Field PdfDocument pdf>
	//* 109  244:getfield        #1219 <Field PdfPageLabels PdfDocument.pageLabels>
	//* 110  247:ifnull          269
			pdfdictionary1.put(PdfName.PAGELABELS, ((PdfObject) (pdf.pageLabels.getDictionary(((PdfWriter) (this))))));
	//  111  250:aload           10
	//  112  252:getstatic       #1222 <Field PdfName PdfName.PAGELABELS>
	//  113  255:aload_0         
	//  114  256:getfield        #249 <Field PdfDocument pdf>
	//  115  259:getfield        #1219 <Field PdfPageLabels PdfDocument.pageLabels>
	//  116  262:aload_0         
	//  117  263:invokevirtual   #1228 <Method PdfDictionary PdfPageLabels.getDictionary(PdfWriter)>
	//  118  266:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		int i;
		Object obj1;
		if(!documentOCG.isEmpty())
	//* 119  269:aload_0         
	//* 120  270:getfield        #1232 <Field LinkedHashSet documentOCG>
	//* 121  273:invokevirtual   #1235 <Method boolean LinkedHashSet.isEmpty()>
	//* 122  276:ifne            326
		{
			fillOCProperties(false);
	//  123  279:aload_0         
	//  124  280:iconst_0        
	//  125  281:invokevirtual   #1238 <Method void fillOCProperties(boolean)>
			obj2 = ((Object) (pdfdictionary1.getAsDict(PdfName.OCPROPERTIES)));
	//  126  284:aload           10
	//  127  286:getstatic       #1241 <Field PdfName PdfName.OCPROPERTIES>
	//  128  289:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  129  292:astore          6
			PdfDictionary pdfdictionary;
			if(obj2 == null)
	//* 130  294:aload           6
	//* 131  296:ifnonnull       511
			{
				reader.getCatalog().put(PdfName.OCPROPERTIES, ((PdfObject) (OCProperties)));
	//  132  299:aload_0         
	//  133  300:getfield        #160 <Field PdfReader reader>
	//  134  303:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//  135  306:getstatic       #1241 <Field PdfName PdfName.OCPROPERTIES>
	//  136  309:aload_0         
	//  137  310:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  138  313:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 139  316:aload_0         
	//* 140  317:bipush          7
	//* 141  319:aload_0         
	//* 142  320:getfield        #1245 <Field PdfOCProperties OCProperties>
	//* 143  323:invokestatic    #1249 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
	//* 144  326:iconst_m1       
	//* 145  327:istore_2        
	//* 146  328:aload_0         
	//* 147  329:getfield        #160 <Field PdfReader reader>
	//* 148  332:invokevirtual   #1252 <Method PdfDictionary PdfReader.getTrailer()>
	//* 149  335:getstatic       #1255 <Field PdfName PdfName.INFO>
	//* 150  338:invokevirtual   #1259 <Method PdfIndirectReference PdfDictionary.getAsIndirectObject(PdfName)>
	//* 151  341:astore          6
	//* 152  343:aload           6
	//* 153  345:ifnull          354
	//* 154  348:aload           6
	//* 155  350:invokevirtual   #1260 <Method int PdfIndirectReference.getNumber()>
	//* 156  353:istore_2        
	//* 157  354:aload_0         
	//* 158  355:getfield        #160 <Field PdfReader reader>
	//* 159  358:invokevirtual   #1252 <Method PdfDictionary PdfReader.getTrailer()>
	//* 160  361:getstatic       #1255 <Field PdfName PdfName.INFO>
	//* 161  364:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 162  367:astore          8
	//* 163  369:aconst_null     
	//* 164  370:astore          5
	//* 165  372:aload           5
	//* 166  374:astore          4
	//* 167  376:aload           8
	//* 168  378:ifnull          409
	//* 169  381:aload           5
	//* 170  383:astore          4
	//* 171  385:aload           8
	//* 172  387:getstatic       #1263 <Field PdfName PdfName.PRODUCER>
	//* 173  390:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 174  393:ifnull          409
	//* 175  396:aload           8
	//* 176  398:getstatic       #1263 <Field PdfName PdfName.PRODUCER>
	//* 177  401:invokevirtual   #1266 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//* 178  404:invokevirtual   #1269 <Method String PdfString.toUnicodeString()>
	//* 179  407:astore          4
	//* 180  409:invokestatic    #1275 <Method Version Version.getInstance()>
	//* 181  412:astore          5
	//* 182  414:aload           4
	//* 183  416:ifnull          436
	//* 184  419:aload           5
	//* 185  421:invokevirtual   #1278 <Method String Version.getVersion()>
	//* 186  424:aload           5
	//* 187  426:invokevirtual   #1281 <Method String Version.getProduct()>
	//* 188  429:invokevirtual   #1285 <Method int String.indexOf(String)>
	//* 189  432:iconst_m1       
	//* 190  433:icmpne          666
	//* 191  436:aload           5
	//* 192  438:invokevirtual   #1278 <Method String Version.getVersion()>
	//* 193  441:astore          7
	//* 194  443:new             #386 <Class PdfDictionary>
	//* 195  446:dup             
	//* 196  447:invokespecial   #789 <Method void PdfDictionary()>
	//* 197  450:astore          11
	//* 198  452:aload           8
	//* 199  454:ifnull          740
	//* 200  457:aload           8
	//* 201  459:invokevirtual   #390 <Method Set PdfDictionary.getKeys()>
	//* 202  462:invokeinterface #396 <Method Iterator Set.iterator()>
	//* 203  467:astore          4
	//* 204  469:aload           4
	//* 205  471:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//* 206  476:ifeq            740
	//* 207  479:aload           4
	//* 208  481:invokeinterface #351 <Method Object Iterator.next()>
	//* 209  486:checkcast       #398 <Class PdfName>
	//* 210  489:astore          5
	//* 211  491:aload           11
	//* 212  493:aload           5
	//* 213  495:aload           8
	//* 214  497:aload           5
	//* 215  499:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 216  502:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 217  505:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 218  508:goto            469
			{
				((PdfDictionary) (obj2)).put(PdfName.OCGS, OCProperties.get(PdfName.OCGS));
	//  219  511:aload           6
	//  220  513:getstatic       #1288 <Field PdfName PdfName.OCGS>
	//  221  516:aload_0         
	//  222  517:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  223  520:getstatic       #1288 <Field PdfName PdfName.OCGS>
	//  224  523:invokevirtual   #1291 <Method PdfObject PdfOCProperties.get(PdfName)>
	//  225  526:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				obj1 = ((Object) (((PdfDictionary) (obj2)).getAsDict(PdfName.D)));
	//  226  529:aload           6
	//  227  531:getstatic       #1293 <Field PdfName PdfName.D>
	//  228  534:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  229  537:astore          5
				obj = obj1;
	//  230  539:aload           5
	//  231  541:astore          4
				if(obj1 == null)
	//* 232  543:aload           5
	//* 233  545:ifnonnull       567
				{
					obj = ((Object) (new PdfDictionary()));
	//  234  548:new             #386 <Class PdfDictionary>
	//  235  551:dup             
	//  236  552:invokespecial   #789 <Method void PdfDictionary()>
	//  237  555:astore          4
					((PdfDictionary) (obj2)).put(PdfName.D, ((PdfObject) (obj)));
	//  238  557:aload           6
	//  239  559:getstatic       #1293 <Field PdfName PdfName.D>
	//  240  562:aload           4
	//  241  564:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
				((PdfDictionary) (obj)).put(PdfName.ORDER, OCProperties.getAsDict(PdfName.D).get(PdfName.ORDER));
	//  242  567:aload           4
	//  243  569:getstatic       #1296 <Field PdfName PdfName.ORDER>
	//  244  572:aload_0         
	//  245  573:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  246  576:getstatic       #1293 <Field PdfName PdfName.D>
	//  247  579:invokevirtual   #1297 <Method PdfDictionary PdfOCProperties.getAsDict(PdfName)>
	//  248  582:getstatic       #1296 <Field PdfName PdfName.ORDER>
	//  249  585:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  250  588:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.RBGROUPS, OCProperties.getAsDict(PdfName.D).get(PdfName.RBGROUPS));
	//  251  591:aload           4
	//  252  593:getstatic       #1300 <Field PdfName PdfName.RBGROUPS>
	//  253  596:aload_0         
	//  254  597:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  255  600:getstatic       #1293 <Field PdfName PdfName.D>
	//  256  603:invokevirtual   #1297 <Method PdfDictionary PdfOCProperties.getAsDict(PdfName)>
	//  257  606:getstatic       #1300 <Field PdfName PdfName.RBGROUPS>
	//  258  609:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  259  612:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.OFF, OCProperties.getAsDict(PdfName.D).get(PdfName.OFF));
	//  260  615:aload           4
	//  261  617:getstatic       #1303 <Field PdfName PdfName.OFF>
	//  262  620:aload_0         
	//  263  621:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  264  624:getstatic       #1293 <Field PdfName PdfName.D>
	//  265  627:invokevirtual   #1297 <Method PdfDictionary PdfOCProperties.getAsDict(PdfName)>
	//  266  630:getstatic       #1303 <Field PdfName PdfName.OFF>
	//  267  633:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  268  636:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.AS, OCProperties.getAsDict(PdfName.D).get(PdfName.AS));
	//  269  639:aload           4
	//  270  641:getstatic       #544 <Field PdfName PdfName.AS>
	//  271  644:aload_0         
	//  272  645:getfield        #1245 <Field PdfOCProperties OCProperties>
	//  273  648:getstatic       #1293 <Field PdfName PdfName.D>
	//  274  651:invokevirtual   #1297 <Method PdfDictionary PdfOCProperties.getAsDict(PdfName)>
	//  275  654:getstatic       #544 <Field PdfName PdfName.AS>
	//  276  657:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  277  660:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			PdfWriter.checkPdfIsoConformance(((PdfWriter) (this)), 7, ((Object) (OCProperties)));
		}
		i = -1;
		obj2 = ((Object) (reader.getTrailer().getAsIndirectObject(PdfName.INFO)));
		if(obj2 != null)
			i = ((PdfIndirectReference) (obj2)).getNumber();
		pdfdictionary = reader.getTrailer().getAsDict(PdfName.INFO);
		obj1 = null;
		obj = obj1;
		if(pdfdictionary != null)
		{
			obj = obj1;
			if(pdfdictionary.get(PdfName.PRODUCER) != null)
				obj = ((Object) (pdfdictionary.getAsString(PdfName.PRODUCER).toUnicodeString()));
		}
		obj1 = ((Object) (Version.getInstance()));
		if(obj == null || ((Version) (obj1)).getVersion().indexOf(((Version) (obj1)).getProduct()) == -1)
		{
			s = ((Version) (obj1)).getVersion();
		} else
	//* 278  663:goto            316
		{
			int j = ((String) (obj)).indexOf("; modified using");
	//  279  666:aload           4
	//  280  668:ldc2            #1305 <String "; modified using">
	//  281  671:invokevirtual   #1285 <Method int String.indexOf(String)>
	//  282  674:istore_3        
			if(j == -1)
	//* 283  675:iload_3         
	//* 284  676:iconst_m1       
	//* 285  677:icmpne          721
				obj = ((Object) (new StringBuffer(((String) (obj)))));
	//  286  680:new             #1307 <Class StringBuffer>
	//  287  683:dup             
	//  288  684:aload           4
	//  289  686:invokespecial   #1308 <Method void StringBuffer(String)>
	//  290  689:astore          4
			else
	//* 291  691:aload           4
	//* 292  693:ldc2            #1310 <String "; modified using ">
	//* 293  696:invokevirtual   #1313 <Method StringBuffer StringBuffer.append(String)>
	//* 294  699:pop             
	//* 295  700:aload           4
	//* 296  702:aload           5
	//* 297  704:invokevirtual   #1278 <Method String Version.getVersion()>
	//* 298  707:invokevirtual   #1313 <Method StringBuffer StringBuffer.append(String)>
	//* 299  710:pop             
	//* 300  711:aload           4
	//* 301  713:invokevirtual   #1314 <Method String StringBuffer.toString()>
	//* 302  716:astore          7
	//* 303  718:goto            443
				obj = ((Object) (new StringBuffer(((String) (obj)).substring(0, j))));
	//  304  721:new             #1307 <Class StringBuffer>
	//  305  724:dup             
	//  306  725:aload           4
	//  307  727:iconst_0        
	//  308  728:iload_3         
	//  309  729:invokevirtual   #1318 <Method String String.substring(int, int)>
	//  310  732:invokespecial   #1308 <Method void StringBuffer(String)>
	//  311  735:astore          4
			((StringBuffer) (obj)).append("; modified using ");
			((StringBuffer) (obj)).append(((Version) (obj1)).getVersion());
			s = ((StringBuffer) (obj)).toString();
		}
		pdfdictionary2 = new PdfDictionary();
		if(pdfdictionary != null)
			for(obj = ((Object) (pdfdictionary.getKeys().iterator())); ((Iterator) (obj)).hasNext(); pdfdictionary2.put(((PdfName) (obj1)), PdfReader.getPdfObject(pdfdictionary.get(((PdfName) (obj1))))))
				obj1 = ((Object) ((PdfName)((Iterator) (obj)).next()));

	//* 312  737:goto            691
		if(map != null)
	//* 313  740:aload_1         
	//* 314  741:ifnull          847
			for(obj = ((Object) (map.entrySet().iterator())); ((Iterator) (obj)).hasNext();)
	//* 315  744:aload_1         
	//* 316  745:invokeinterface #1319 <Method Set Map.entrySet()>
	//* 317  750:invokeinterface #396 <Method Iterator Set.iterator()>
	//* 318  755:astore          4
	//* 319  757:aload           4
	//* 320  759:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//* 321  764:ifeq            847
			{
				Object obj3 = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//  322  767:aload           4
	//  323  769:invokeinterface #351 <Method Object Iterator.next()>
	//  324  774:checkcast       #893 <Class java.util.Map$Entry>
	//  325  777:astore          8
				obj1 = ((Object) (new PdfName((String)((java.util.Map.Entry) (obj3)).getKey())));
	//  326  779:new             #398 <Class PdfName>
	//  327  782:dup             
	//  328  783:aload           8
	//  329  785:invokeinterface #896 <Method Object java.util.Map$Entry.getKey()>
	//  330  790:checkcast       #898 <Class String>
	//  331  793:invokespecial   #1320 <Method void PdfName(String)>
	//  332  796:astore          5
				obj3 = ((Object) ((String)((java.util.Map.Entry) (obj3)).getValue()));
	//  333  798:aload           8
	//  334  800:invokeinterface #913 <Method Object java.util.Map$Entry.getValue()>
	//  335  805:checkcast       #898 <Class String>
	//  336  808:astore          8
				if(obj3 == null)
	//* 337  810:aload           8
	//* 338  812:ifnonnull       825
					pdfdictionary2.remove(((PdfName) (obj1)));
	//  339  815:aload           11
	//  340  817:aload           5
	//  341  819:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
				else
	//* 342  822:goto            757
					pdfdictionary2.put(((PdfName) (obj1)), ((PdfObject) (new PdfString(((String) (obj3)), "UnicodeBig"))));
	//  343  825:aload           11
	//  344  827:aload           5
	//  345  829:new             #816 <Class PdfString>
	//  346  832:dup             
	//  347  833:aload           8
	//  348  835:ldc2            #1322 <String "UnicodeBig">
	//  349  838:invokespecial   #1325 <Method void PdfString(String, String)>
	//  350  841:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}

	//* 351  844:goto            757
		pdfdate = new PdfDate();
	//  352  847:new             #1327 <Class PdfDate>
	//  353  850:dup             
	//  354  851:invokespecial   #1328 <Method void PdfDate()>
	//  355  854:astore          13
		pdfdictionary2.put(PdfName.MODDATE, ((PdfObject) (pdfdate)));
	//  356  856:aload           11
	//  357  858:getstatic       #1331 <Field PdfName PdfName.MODDATE>
	//  358  861:aload           13
	//  359  863:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.PRODUCER, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//  360  866:aload           11
	//  361  868:getstatic       #1263 <Field PdfName PdfName.PRODUCER>
	//  362  871:new             #816 <Class PdfString>
	//  363  874:dup             
	//  364  875:aload           7
	//  365  877:ldc2            #1322 <String "UnicodeBig">
	//  366  880:invokespecial   #1325 <Method void PdfString(String, String)>
	//  367  883:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfObject pdfobject;
		if(append)
	//* 368  886:aload_0         
	//* 369  887:getfield        #168 <Field boolean append>
	//* 370  890:ifeq            1235
		{
			if(obj2 == null)
	//* 371  893:aload           6
	//* 372  895:ifnonnull       1215
				obj1 = ((Object) (addToBody(((PdfObject) (pdfdictionary2)), false).getIndirectReference()));
	//  373  898:aload_0         
	//  374  899:aload           11
	//  375  901:iconst_0        
	//  376  902:invokevirtual   #1123 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//  377  905:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  378  908:astore          5
			else
	//* 379  910:aconst_null     
	//* 380  911:astore          6
	//* 381  913:aload           10
	//* 382  915:getstatic       #1334 <Field PdfName PdfName.METADATA>
	//* 383  918:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 384  921:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 385  924:astore          12
	//* 386  926:aload           6
	//* 387  928:astore          4
	//* 388  930:aload           12
	//* 389  932:ifnull          969
	//* 390  935:aload           6
	//* 391  937:astore          4
	//* 392  939:aload           12
	//* 393  941:invokevirtual   #1012 <Method boolean PdfObject.isStream()>
	//* 394  944:ifeq            969
	//* 395  947:aload           12
	//* 396  949:checkcast       #1336 <Class PRStream>
	//* 397  952:invokestatic    #1340 <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//* 398  955:astore          4
	//* 399  957:aload           10
	//* 400  959:getstatic       #1334 <Field PdfName PdfName.METADATA>
	//* 401  962:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 402  965:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//* 403  968:pop             
	//* 404  969:aconst_null     
	//* 405  970:astore          9
	//* 406  972:aload_0         
	//* 407  973:getfield        #1343 <Field byte[] xmpMetadata>
	//* 408  976:ifnull          1250
	//* 409  979:aload_0         
	//* 410  980:getfield        #1343 <Field byte[] xmpMetadata>
	//* 411  983:astore          8
	//* 412  985:aload           9
	//* 413  987:astore          6
	//* 414  989:aload           6
	//* 415  991:astore          4
	//* 416  993:aload           6
	//* 417  995:ifnonnull       1097
	//* 418  998:aload           6
	//* 419 1000:astore          4
	//* 420 1002:aload           8
	//* 421 1004:ifnull          1097
	//* 422 1007:new             #1345 <Class ByteArrayOutputStream>
	//* 423 1010:dup             
	//* 424 1011:invokespecial   #1346 <Method void ByteArrayOutputStream()>
	//* 425 1014:astore          4
	//* 426 1016:aload_1         
	//* 427 1017:ifnull          1027
	//* 428 1020:aload_0         
	//* 429 1021:getfield        #1343 <Field byte[] xmpMetadata>
	//* 430 1024:ifnull          1371
	//* 431 1027:aload           8
	//* 432 1029:invokestatic    #1352 <Method com.itextpdf.xmp.XMPMeta XMPMetaFactory.parseFromBuffer(byte[])>
	//* 433 1032:astore_1        
	//* 434 1033:aload_1         
	//* 435 1034:aload           7
	//* 436 1036:invokestatic    #1358 <Method void PdfProperties.setProducer(com.itextpdf.xmp.XMPMeta, String)>
	//* 437 1039:aload_1         
	//* 438 1040:aload           13
	//* 439 1042:invokevirtual   #1361 <Method String PdfDate.getW3CDate()>
	//* 440 1045:invokestatic    #1366 <Method void XmpBasicProperties.setModDate(com.itextpdf.xmp.XMPMeta, String)>
	//* 441 1048:aload_1         
	//* 442 1049:aload           13
	//* 443 1051:invokevirtual   #1361 <Method String PdfDate.getW3CDate()>
	//* 444 1054:invokestatic    #1369 <Method void XmpBasicProperties.setMetaDataDate(com.itextpdf.xmp.XMPMeta, String)>
	//* 445 1057:new             #1371 <Class SerializeOptions>
	//* 446 1060:dup             
	//* 447 1061:invokespecial   #1372 <Method void SerializeOptions()>
	//* 448 1064:astore          6
	//* 449 1066:aload           6
	//* 450 1068:sipush          2000
	//* 451 1071:invokevirtual   #1376 <Method SerializeOptions SerializeOptions.setPadding(int)>
	//* 452 1074:pop             
	//* 453 1075:aload_1         
	//* 454 1076:aload           4
	//* 455 1078:aload           6
	//* 456 1080:invokestatic    #1380 <Method void XMPMetaFactory.serialize(com.itextpdf.xmp.XMPMeta, OutputStream, SerializeOptions)>
	//* 457 1083:new             #532 <Class PdfStream>
	//* 458 1086:dup             
	//* 459 1087:aload           4
	//* 460 1089:invokevirtual   #1381 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 461 1092:invokespecial   #977 <Method void PdfStream(byte[])>
	//* 462 1095:astore          4
	//* 463 1097:aload           4
	//* 464 1099:ifnull          1193
	//* 465 1102:aload           4
	//* 466 1104:getstatic       #1384 <Field PdfName PdfName.TYPE>
	//* 467 1107:getstatic       #1334 <Field PdfName PdfName.METADATA>
	//* 468 1110:invokevirtual   #1385 <Method void PdfStream.put(PdfName, PdfObject)>
	//* 469 1113:aload           4
	//* 470 1115:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//* 471 1118:getstatic       #1388 <Field PdfName PdfName.XML>
	//* 472 1121:invokevirtual   #1385 <Method void PdfStream.put(PdfName, PdfObject)>
	//* 473 1124:aload_0         
	//* 474 1125:getfield        #187 <Field PdfEncryption crypto>
	//* 475 1128:ifnull          1166
	//* 476 1131:aload_0         
	//* 477 1132:getfield        #187 <Field PdfEncryption crypto>
	//* 478 1135:invokevirtual   #1391 <Method boolean PdfEncryption.isMetadataEncrypted()>
	//* 479 1138:ifne            1166
	//* 480 1141:new             #290 <Class PdfArray>
	//* 481 1144:dup             
	//* 482 1145:invokespecial   #338 <Method void PdfArray()>
	//* 483 1148:astore_1        
	//* 484 1149:aload_1         
	//* 485 1150:getstatic       #1394 <Field PdfName PdfName.CRYPT>
	//* 486 1153:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//* 487 1156:pop             
	//* 488 1157:aload           4
	//* 489 1159:getstatic       #1397 <Field PdfName PdfName.FILTER>
	//* 490 1162:aload_1         
	//* 491 1163:invokevirtual   #1385 <Method void PdfStream.put(PdfName, PdfObject)>
	//* 492 1166:aload_0         
	//* 493 1167:getfield        #168 <Field boolean append>
	//* 494 1170:ifeq            1415
	//* 495 1173:aload           12
	//* 496 1175:ifnull          1415
	//* 497 1178:aload_0         
	//* 498 1179:getfield        #257 <Field PdfWriter$PdfBody body>
	//* 499 1182:aload           4
	//* 500 1184:aload           12
	//* 501 1186:invokevirtual   #1057 <Method PRIndirectReference PdfObject.getIndRef()>
	//* 502 1189:invokevirtual   #1399 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, PdfIndirectReference)>
	//* 503 1192:pop             
	//* 504 1193:aload_0         
	//* 505 1194:getfield        #113 <Field HashMap namedDestinations>
	//* 506 1197:invokevirtual   #879 <Method boolean HashMap.isEmpty()>
	//* 507 1200:ifne            1207
	//* 508 1203:aload_0         
	//* 509 1204:invokevirtual   #1402 <Method void updateNamedDestinations()>
	//* 510 1207:aload_0         
	//* 511 1208:aload           5
	//* 512 1210:iload_2         
	//* 513 1211:invokevirtual   #1404 <Method void close(PdfIndirectReference, int)>
	//* 514 1214:return          
				obj1 = ((Object) (addToBody(((PdfObject) (pdfdictionary2)), ((PdfIndirectReference) (obj2)).getNumber(), false).getIndirectReference()));
	//  515 1215:aload_0         
	//  516 1216:aload           11
	//  517 1218:aload           6
	//  518 1220:invokevirtual   #1260 <Method int PdfIndirectReference.getNumber()>
	//  519 1223:iconst_0        
	//  520 1224:invokevirtual   #1064 <Method PdfIndirectObject addToBody(PdfObject, int, boolean)>
	//  521 1227:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  522 1230:astore          5
		} else
	//* 523 1232:goto            910
		{
			obj1 = ((Object) (addToBody(((PdfObject) (pdfdictionary2)), false).getIndirectReference()));
	//  524 1235:aload_0         
	//  525 1236:aload           11
	//  526 1238:iconst_0        
	//  527 1239:invokevirtual   #1123 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//  528 1242:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  529 1245:astore          5
		}
		obj2 = null;
		pdfobject = PdfReader.getPdfObject(pdfdictionary1.get(PdfName.METADATA));
		obj = obj2;
		if(pdfobject != null)
		{
			obj = obj2;
			if(pdfobject.isStream())
			{
				obj = ((Object) (PdfReader.getStreamBytesRaw((PRStream)pdfobject)));
				PdfReader.killIndirect(pdfdictionary1.get(PdfName.METADATA));
			}
		}
		obj4 = null;
		if(xmpMetadata == null) goto _L2; else goto _L1
_L1:
		abyte0 = xmpMetadata;
		obj2 = ((Object) (obj4));
_L10:
		obj = obj2;
		if(obj2 != null) goto _L4; else goto _L3
_L3:
		obj = obj2;
		if(abyte0 == null) goto _L4; else goto _L5
_L5:
		obj = ((Object) (new ByteArrayOutputStream()));
		if(map == null) goto _L7; else goto _L6
_L6:
		if(xmpMetadata == null) goto _L8; else goto _L7
_L7:
		map = ((Map) (XMPMetaFactory.parseFromBuffer(abyte0)));
		PdfProperties.setProducer(((com.itextpdf.xmp.XMPMeta) (map)), s);
		XmpBasicProperties.setModDate(((com.itextpdf.xmp.XMPMeta) (map)), pdfdate.getW3CDate());
		XmpBasicProperties.setMetaDataDate(((com.itextpdf.xmp.XMPMeta) (map)), pdfdate.getW3CDate());
		obj2 = ((Object) (new SerializeOptions()));
		((SerializeOptions) (obj2)).setPadding(2000);
		XMPMetaFactory.serialize(((com.itextpdf.xmp.XMPMeta) (map)), ((OutputStream) (obj)), ((SerializeOptions) (obj2)));
_L11:
		obj = ((Object) (new PdfStream(((ByteArrayOutputStream) (obj)).toByteArray())));
_L4:
		if(obj != null)
		{
			((PdfStream) (obj)).put(PdfName.TYPE, ((PdfObject) (PdfName.METADATA)));
			((PdfStream) (obj)).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.XML)));
			if(crypto != null && !crypto.isMetadataEncrypted())
			{
				map = ((Map) (new PdfArray()));
				((PdfArray) (map)).add(((PdfObject) (PdfName.CRYPT)));
				((PdfStream) (obj)).put(PdfName.FILTER, ((PdfObject) (map)));
			}
			XMPException xmpexception;
			if(append && pdfobject != null)
			{
				body.add(((PdfObject) (obj)), ((PdfIndirectReference) (pdfobject.getIndRef())));
			} else
	//* 530 1247:goto            910
	//* 531 1250:aload           4
	//* 532 1252:astore          8
	//* 533 1254:aload           9
	//* 534 1256:astore          6
	//* 535 1258:aload_0         
	//* 536 1259:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 537 1262:ifnull          989
	//* 538 1265:new             #1345 <Class ByteArrayOutputStream>
	//* 539 1268:dup             
	//* 540 1269:invokespecial   #1346 <Method void ByteArrayOutputStream()>
	//* 541 1272:astore          6
	//* 542 1274:aload_0         
	//* 543 1275:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 544 1278:invokevirtual   #1414 <Method com.itextpdf.xmp.XMPMeta XmpWriter.getXmpMeta()>
	//* 545 1281:aload           7
	//* 546 1283:invokestatic    #1358 <Method void PdfProperties.setProducer(com.itextpdf.xmp.XMPMeta, String)>
	//* 547 1286:aload_0         
	//* 548 1287:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 549 1290:invokevirtual   #1414 <Method com.itextpdf.xmp.XMPMeta XmpWriter.getXmpMeta()>
	//* 550 1293:aload           13
	//* 551 1295:invokevirtual   #1361 <Method String PdfDate.getW3CDate()>
	//* 552 1298:invokestatic    #1366 <Method void XmpBasicProperties.setModDate(com.itextpdf.xmp.XMPMeta, String)>
	//* 553 1301:aload_0         
	//* 554 1302:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 555 1305:invokevirtual   #1414 <Method com.itextpdf.xmp.XMPMeta XmpWriter.getXmpMeta()>
	//* 556 1308:aload           13
	//* 557 1310:invokevirtual   #1361 <Method String PdfDate.getW3CDate()>
	//* 558 1313:invokestatic    #1369 <Method void XmpBasicProperties.setMetaDataDate(com.itextpdf.xmp.XMPMeta, String)>
	//* 559 1316:aload_0         
	//* 560 1317:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 561 1320:aload           6
	//* 562 1322:invokevirtual   #1416 <Method void XmpWriter.serialize(OutputStream)>
	//* 563 1325:aload_0         
	//* 564 1326:getfield        #1408 <Field XmpWriter xmpWriter>
	//* 565 1329:invokevirtual   #1417 <Method void XmpWriter.close()>
	//* 566 1332:new             #532 <Class PdfStream>
	//* 567 1335:dup             
	//* 568 1336:aload           6
	//* 569 1338:invokevirtual   #1381 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 570 1341:invokespecial   #977 <Method void PdfStream(byte[])>
	//* 571 1344:astore          6
	//* 572 1346:aload           4
	//* 573 1348:astore          8
	//* 574 1350:goto            989
	//* 575 1353:astore          6
	//* 576 1355:aload_0         
	//* 577 1356:aconst_null     
	//* 578 1357:putfield        #1408 <Field XmpWriter xmpWriter>
	//* 579 1360:aload           4
	//* 580 1362:astore          8
	//* 581 1364:aload           9
	//* 582 1366:astore          6
	//* 583 1368:goto            989
	//* 584 1371:aload_0         
	//* 585 1372:aload           4
	//* 586 1374:aload           11
	//* 587 1376:invokevirtual   #1421 <Method XmpWriter createXmpWriter(ByteArrayOutputStream, PdfDictionary)>
	//* 588 1379:invokevirtual   #1417 <Method void XmpWriter.close()>
	//* 589 1382:goto            1083
	//* 590 1385:astore_1        
	//* 591 1386:new             #532 <Class PdfStream>
	//* 592 1389:dup             
	//* 593 1390:aload           8
	//* 594 1392:invokespecial   #977 <Method void PdfStream(byte[])>
	//* 595 1395:astore          4
	//* 596 1397:goto            1097
	//* 597 1400:astore_1        
	//* 598 1401:new             #532 <Class PdfStream>
	//* 599 1404:dup             
	//* 600 1405:aload           8
	//* 601 1407:invokespecial   #977 <Method void PdfStream(byte[])>
	//* 602 1410:astore          4
	//* 603 1412:goto            1097
			{
				pdfdictionary1.put(PdfName.METADATA, ((PdfObject) (body.add(((PdfObject) (obj))).getIndirectReference())));
	//  604 1415:aload           10
	//  605 1417:getstatic       #1334 <Field PdfName PdfName.METADATA>
	//  606 1420:aload_0         
	//  607 1421:getfield        #257 <Field PdfWriter$PdfBody body>
	//  608 1424:aload           4
	//  609 1426:invokevirtual   #1423 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject)>
	//  610 1429:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  611 1432:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
				markUsed(((PdfObject) (pdfdictionary1)));
	//  612 1435:aload_0         
	//  613 1436:aload           10
	//  614 1438:invokevirtual   #714 <Method void markUsed(PdfObject)>
			}
		}
		if(!namedDestinations.isEmpty())
			updateNamedDestinations();
		close(((PdfIndirectReference) (obj1)), i);
		return;
_L2:
		abyte0 = ((byte []) (obj));
		obj2 = ((Object) (obj4));
		if(xmpWriter == null) goto _L10; else goto _L9
_L9:
		obj2 = ((Object) (new ByteArrayOutputStream()));
		PdfProperties.setProducer(xmpWriter.getXmpMeta(), s);
		XmpBasicProperties.setModDate(xmpWriter.getXmpMeta(), pdfdate.getW3CDate());
		XmpBasicProperties.setMetaDataDate(xmpWriter.getXmpMeta(), pdfdate.getW3CDate());
		xmpWriter.serialize(((OutputStream) (obj2)));
		xmpWriter.close();
		obj2 = ((Object) (new PdfStream(((ByteArrayOutputStream) (obj2)).toByteArray())));
		abyte0 = ((byte []) (obj));
		  goto _L10
		xmpexception;
		xmpWriter = null;
		abyte0 = ((byte []) (obj));
		xmpexception = ((XMPException) (obj4));
		  goto _L10
_L8:
		createXmpWriter(((ByteArrayOutputStream) (obj)), pdfdictionary2).close();
		  goto _L11
		map;
		obj = ((Object) (new PdfStream(abyte0)));
		  goto _L4
		map;
		obj = ((Object) (new PdfStream(abyte0)));
		  goto _L4
	//* 615 1441:goto            1193
	}

	void correctAcroFieldPages(int i)
	{
		if(acroFields != null && i <= reader.getNumberOfPages())
	//*   0    0:aload_0         
	//*   1    1:getfield        #1174 <Field AcroFields acroFields>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #160 <Field PdfReader reader>
	//*   7   13:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//*   8   16:icmpgt          7
		{
			Iterator iterator = acroFields.getFields().values().iterator();
	//    9   19:aload_0         
	//   10   20:getfield        #1174 <Field AcroFields acroFields>
	//   11   23:invokevirtual   #1429 <Method Map AcroFields.getFields()>
	//   12   26:invokeinterface #1430 <Method Collection Map.values()>
	//   13   31:invokeinterface #928 <Method Iterator Collection.iterator()>
	//   14   36:astore          4
			while(iterator.hasNext()) 
	//*  15   38:aload           4
	//*  16   40:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  17   45:ifeq            7
			{
				AcroFields.Item item = (AcroFields.Item)iterator.next();
	//   18   48:aload           4
	//   19   50:invokeinterface #351 <Method Object Iterator.next()>
	//   20   55:checkcast       #1432 <Class AcroFields$Item>
	//   21   58:astore          5
				int j = 0;
	//   22   60:iconst_0        
	//   23   61:istore_2        
				while(j < item.size()) 
	//*  24   62:iload_2         
	//*  25   63:aload           5
	//*  26   65:invokevirtual   #1433 <Method int AcroFields$Item.size()>
	//*  27   68:icmpge          38
				{
					int k = item.getPage(j).intValue();
	//   28   71:aload           5
	//   29   73:iload_2         
	//   30   74:invokevirtual   #1437 <Method Integer AcroFields$Item.getPage(int)>
	//   31   77:invokevirtual   #1440 <Method int Integer.intValue()>
	//   32   80:istore_3        
					if(k >= i)
	//*  33   81:iload_3         
	//*  34   82:iload_1         
	//*  35   83:icmplt          95
						item.forcePage(j, k + 1);
	//   36   86:aload           5
	//   37   88:iload_2         
	//   38   89:iload_3         
	//   39   90:iconst_1        
	//   40   91:iadd            
	//   41   92:invokevirtual   #1443 <Method void AcroFields$Item.forcePage(int, int)>
					j++;
	//   42   95:iload_2         
	//   43   96:iconst_1        
	//   44   97:iadd            
	//   45   98:istore_2        
				}
			}
		}
	//*  46   99:goto            62
	}

	public void createXmpMetadata()
	{
		try
		{
			xmpWriter = createXmpWriter(((ByteArrayOutputStream) (null)), reader.getInfo());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aconst_null     
	//    3    3:aload_0         
	//    4    4:getfield        #160 <Field PdfReader reader>
	//    5    7:invokevirtual   #1447 <Method HashMap PdfReader.getInfo()>
	//    6   10:invokevirtual   #1450 <Method XmpWriter createXmpWriter(ByteArrayOutputStream, HashMap)>
	//    7   13:putfield        #1408 <Field XmpWriter xmpWriter>
			xmpMetadata = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #1343 <Field byte[] xmpMetadata>
			return;
	//   11   21:return          
		}
		catch(IOException ioexception)
	//*  12   22:astore_1        
		{
			ioexception.printStackTrace();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #1453 <Method void IOException.printStackTrace()>
		}
	//   15   27:return          
	}

	void deleteOutlines()
	{
		PdfDictionary pdfdictionary = reader.getCatalog();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:astore_1        
		Object obj = ((Object) (pdfdictionary.get(PdfName.OUTLINES)));
	//    4    8:aload_1         
	//    5    9:getstatic       #1457 <Field PdfName PdfName.OUTLINES>
	//    6   12:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//    7   15:astore_2        
		if(obj == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(obj instanceof PRIndirectReference)
	//*  11   21:aload_2         
	//*  12   22:instanceof      #366 <Class PRIndirectReference>
	//*  13   25:ifeq            43
		{
			obj = ((Object) ((PRIndirectReference)obj));
	//   14   28:aload_2         
	//   15   29:checkcast       #366 <Class PRIndirectReference>
	//   16   32:astore_2        
			outlineTravel(((PRIndirectReference) (obj)));
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokespecial   #589 <Method void outlineTravel(PRIndirectReference)>
			PdfReader.killIndirect(((PdfObject) (obj)));
	//   20   38:aload_2         
	//   21   39:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//   22   42:pop             
		}
		pdfdictionary.remove(PdfName.OUTLINES);
	//   23   43:aload_1         
	//   24   44:getstatic       #1457 <Field PdfName PdfName.OUTLINES>
	//   25   47:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		markUsed(((PdfObject) (pdfdictionary)));
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//   29   55:return          
	}

	void eliminateAcroformObjects()
	{
		Object obj = ((Object) (reader.getCatalog().get(PdfName.ACROFORM)));
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//    4   10:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//    5   13:astore_1        
		if(obj == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		obj = ((Object) ((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))));
	//    9   19:aload_1         
	//   10   20:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   11   23:checkcast       #386 <Class PdfDictionary>
	//   12   26:astore_1        
		reader.killXref(((PdfDictionary) (obj)).get(PdfName.XFA));
	//   13   27:aload_0         
	//   14   28:getfield        #160 <Field PdfReader reader>
	//   15   31:aload_1         
	//   16   32:getstatic       #1461 <Field PdfName PdfName.XFA>
	//   17   35:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   18   38:invokevirtual   #1464 <Method void PdfReader.killXref(PdfObject)>
		((PdfDictionary) (obj)).remove(PdfName.XFA);
	//   19   41:aload_1         
	//   20   42:getstatic       #1461 <Field PdfName PdfName.XFA>
	//   21   45:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		PdfObject pdfobject = ((PdfDictionary) (obj)).get(PdfName.FIELDS);
	//   22   48:aload_1         
	//   23   49:getstatic       #807 <Field PdfName PdfName.FIELDS>
	//   24   52:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   25   55:astore_2        
		if(pdfobject != null)
	//*  26   56:aload_2         
	//*  27   57:ifnull          100
		{
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   28   60:new             #386 <Class PdfDictionary>
	//   29   63:dup             
	//   30   64:invokespecial   #789 <Method void PdfDictionary()>
	//   31   67:astore_3        
			pdfdictionary.put(PdfName.KIDS, pdfobject);
	//   32   68:aload_3         
	//   33   69:getstatic       #560 <Field PdfName PdfName.KIDS>
	//   34   72:aload_2         
	//   35   73:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			sweepKids(((PdfObject) (pdfdictionary)));
	//   36   76:aload_0         
	//   37   77:aload_3         
	//   38   78:invokevirtual   #1467 <Method void sweepKids(PdfObject)>
			PdfReader.killIndirect(pdfobject);
	//   39   81:aload_2         
	//   40   82:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//   41   85:pop             
			((PdfDictionary) (obj)).put(PdfName.FIELDS, ((PdfObject) (new PdfArray())));
	//   42   86:aload_1         
	//   43   87:getstatic       #807 <Field PdfName PdfName.FIELDS>
	//   44   90:new             #290 <Class PdfArray>
	//   45   93:dup             
	//   46   94:invokespecial   #338 <Method void PdfArray()>
	//   47   97:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		((PdfDictionary) (obj)).remove(PdfName.SIGFLAGS);
	//   48  100:aload_1         
	//   49  101:getstatic       #1191 <Field PdfName PdfName.SIGFLAGS>
	//   50  104:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		((PdfDictionary) (obj)).remove(PdfName.NEEDAPPEARANCES);
	//   51  107:aload_1         
	//   52  108:getstatic       #1470 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   53  111:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		((PdfDictionary) (obj)).remove(PdfName.DR);
	//   54  114:aload_1         
	//   55  115:getstatic       #824 <Field PdfName PdfName.DR>
	//   56  118:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
	//   57  121:return          
	}

	void expandFields(PdfFormField pdfformfield, ArrayList arraylist)
	{
		arraylist.add(((Object) (pdfformfield)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #744 <Method boolean ArrayList.add(Object)>
	//    3    5:pop             
		pdfformfield = ((PdfFormField) (pdfformfield.getKids()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #1474 <Method ArrayList PdfFormField.getKids()>
	//    6   10:astore_1        
		if(pdfformfield != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          45
		{
			for(int i = 0; i < ((ArrayList) (pdfformfield)).size(); i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:aload_1         
	//*  13   19:invokevirtual   #683 <Method int ArrayList.size()>
	//*  14   22:icmpge          45
				expandFields((PdfFormField)((ArrayList) (pdfformfield)).get(i), arraylist);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokevirtual   #686 <Method Object ArrayList.get(int)>
	//   19   31:checkcast       #674 <Class PdfFormField>
	//   20   34:aload_2         
	//   21   35:invokevirtual   #682 <Method void expandFields(PdfFormField, ArrayList)>

	//   22   38:iload_3         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_3        
		}
	//*  26   42:goto            17
	//   27   45:return          
	}

	protected void flatFields()
	{
		Object obj2;
		Iterator iterator1;
		if(append)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field boolean append>
	//*   2    4:ifeq            25
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("field.flattening.is.not.supported.in.append.mode", new Object[0]));
	//    3    7:new             #404 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #1477 <String "field.flattening.is.not.supported.in.append.mode">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #407 <Method void IllegalArgumentException(String)>
	//   10   24:athrow          
		getAcroFields();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #672 <Method AcroFields getAcroFields()>
	//   13   29:pop             
		Map map = acroFields.getFields();
	//   14   30:aload_0         
	//   15   31:getfield        #1174 <Field AcroFields acroFields>
	//   16   34:invokevirtual   #1429 <Method Map AcroFields.getFields()>
	//   17   37:astore          13
		if(fieldsAdded && partialFlattening.isEmpty())
	//*  18   39:aload_0         
	//*  19   40:getfield        #109 <Field boolean fieldsAdded>
	//*  20   43:ifeq            105
	//*  21   46:aload_0         
	//*  22   47:getfield        #98  <Field HashSet partialFlattening>
	//*  23   50:invokevirtual   #821 <Method boolean HashSet.isEmpty()>
	//*  24   53:ifeq            105
		{
			String s;
			for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); partialFlattening.add(((Object) (s))))
	//*  25   56:aload           13
	//*  26   58:invokeinterface #1480 <Method Set Map.keySet()>
	//*  27   63:invokeinterface #396 <Method Iterator Set.iterator()>
	//*  28   68:astore          14
	//*  29   70:aload           14
	//*  30   72:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  31   77:ifeq            105
				s = (String)iterator.next();
	//   32   80:aload           14
	//   33   82:invokeinterface #351 <Method Object Iterator.next()>
	//   34   87:checkcast       #898 <Class String>
	//   35   90:astore          15

	//   36   92:aload_0         
	//   37   93:getfield        #98  <Field HashSet partialFlattening>
	//   38   96:aload           15
	//   39   98:invokevirtual   #1481 <Method boolean HashSet.add(Object)>
	//   40  101:pop             
		}
	//*  41  102:goto            70
		PdfDictionary pdfdictionary = reader.getCatalog().getAsDict(PdfName.ACROFORM);
	//   42  105:aload_0         
	//   43  106:getfield        #160 <Field PdfReader reader>
	//   44  109:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   45  112:getstatic       #804 <Field PdfName PdfName.ACROFORM>
	//   46  115:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   47  118:astore          14
		obj2 = null;
	//   48  120:aconst_null     
	//   49  121:astore          15
		if(pdfdictionary != null)
	//*  50  123:aload           14
	//*  51  125:ifnull          146
			obj2 = ((Object) ((PdfArray)PdfReader.getPdfObject(pdfdictionary.get(PdfName.FIELDS), ((PdfObject) (pdfdictionary)))));
	//   52  128:aload           14
	//   53  130:getstatic       #807 <Field PdfName PdfName.FIELDS>
	//   54  133:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   55  136:aload           14
	//   56  138:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   57  141:checkcast       #290 <Class PdfArray>
	//   58  144:astore          15
		iterator1 = map.entrySet().iterator();
	//   59  146:aload           13
	//   60  148:invokeinterface #1319 <Method Set Map.entrySet()>
	//   61  153:invokeinterface #396 <Method Iterator Set.iterator()>
	//   62  158:astore          17
_L2:
		int k;
		String s1;
		AcroFields.Item item;
		java.util.Map.Entry entry;
		do
		{
			if(!iterator1.hasNext())
				break MISSING_BLOCK_LABEL_1590;
	//   63  160:aload           17
	//   64  162:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//   65  167:ifeq            1590
			entry = (java.util.Map.Entry)iterator1.next();
	//   66  170:aload           17
	//   67  172:invokeinterface #351 <Method Object Iterator.next()>
	//   68  177:checkcast       #893 <Class java.util.Map$Entry>
	//   69  180:astore          13
			s1 = (String)entry.getKey();
	//   70  182:aload           13
	//   71  184:invokeinterface #896 <Method Object java.util.Map$Entry.getKey()>
	//   72  189:checkcast       #898 <Class String>
	//   73  192:astore          18
		} while(!partialFlattening.isEmpty() && !partialFlattening.contains(((Object) (s1))));
	//   74  194:aload_0         
	//   75  195:getfield        #98  <Field HashSet partialFlattening>
	//   76  198:invokevirtual   #821 <Method boolean HashSet.isEmpty()>
	//   77  201:ifne            216
	//   78  204:aload_0         
	//   79  205:getfield        #98  <Field HashSet partialFlattening>
	//   80  208:aload           18
	//   81  210:invokevirtual   #1483 <Method boolean HashSet.contains(Object)>
	//   82  213:ifeq            160
		item = (AcroFields.Item)entry.getValue();
	//   83  216:aload           13
	//   84  218:invokeinterface #913 <Method Object java.util.Map$Entry.getValue()>
	//   85  223:checkcast       #1432 <Class AcroFields$Item>
	//   86  226:astore          19
		k = 0;
	//   87  228:iconst_0        
	//   88  229:istore          11
_L5:
		if(k >= item.size()) goto _L2; else goto _L1
	//   89  231:iload           11
	//   90  233:aload           19
	//   91  235:invokevirtual   #1433 <Method int AcroFields$Item.size()>
	//   92  238:icmpge          160
_L1:
		int i;
		int j;
		Object obj4;
		obj4 = ((Object) (item.getMerged(k)));
	//   93  241:aload           19
	//   94  243:iload           11
	//   95  245:invokevirtual   #1486 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   96  248:astore          20
		PdfNumber pdfnumber = ((PdfDictionary) (obj4)).getAsNumber(PdfName.F);
	//   97  250:aload           20
	//   98  252:getstatic       #442 <Field PdfName PdfName.F>
	//   99  255:invokevirtual   #446 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  100  258:astore          13
		i = 0;
	//  101  260:iconst_0        
	//  102  261:istore          9
		if(pdfnumber != null)
	//* 103  263:aload           13
	//* 104  265:ifnull          275
			i = pdfnumber.intValue();
	//  105  268:aload           13
	//  106  270:invokevirtual   #451 <Method int PdfNumber.intValue()>
	//  107  273:istore          9
		j = item.getPage(k).intValue();
	//  108  275:aload           19
	//  109  277:iload           11
	//  110  279:invokevirtual   #1437 <Method Integer AcroFields$Item.getPage(int)>
	//  111  282:invokevirtual   #1440 <Method int Integer.intValue()>
	//  112  285:istore          10
		if(j >= 1) goto _L4; else goto _L3
	//  113  287:iload           10
	//  114  289:iconst_1        
	//  115  290:icmpge          302
_L3:
		k++;
	//  116  293:iload           11
	//  117  295:iconst_1        
	//  118  296:iadd            
	//  119  297:istore          11
		  goto _L5
	//* 120  299:goto            231
_L4:
label0:
		{
			Object obj3 = ((Object) (((PdfDictionary) (obj4)).getAsDict(PdfName.AP)));
	//  121  302:aload           20
	//  122  304:getstatic       #454 <Field PdfName PdfName.AP>
	//  123  307:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  124  310:astore          16
			Object obj1 = null;
	//  125  312:aconst_null     
	//  126  313:astore          14
			if(obj3 != null)
	//* 127  315:aload           16
	//* 128  317:ifnull          349
			{
				PdfStream pdfstream = ((PdfDictionary) (obj3)).getAsStream(PdfName.N);
	//  129  320:aload           16
	//  130  322:getstatic       #457 <Field PdfName PdfName.N>
	//  131  325:invokevirtual   #461 <Method PdfStream PdfDictionary.getAsStream(PdfName)>
	//  132  328:astore          13
				obj1 = ((Object) (pdfstream));
	//  133  330:aload           13
	//  134  332:astore          14
				if(pdfstream == null)
	//* 135  334:aload           13
	//* 136  336:ifnonnull       349
					obj1 = ((Object) (((PdfDictionary) (obj3)).getAsDict(PdfName.N)));
	//  137  339:aload           16
	//  138  341:getstatic       #457 <Field PdfName PdfName.N>
	//  139  344:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  140  347:astore          14
			}
			Object obj;
			Object obj5;
			if(acroFields.isGenerateAppearances())
	//* 141  349:aload_0         
	//* 142  350:getfield        #1174 <Field AcroFields acroFields>
	//* 143  353:invokevirtual   #1489 <Method boolean AcroFields.isGenerateAppearances()>
	//* 144  356:ifeq            889
			{
				if(obj3 == null || obj1 == null)
	//* 145  359:aload           16
	//* 146  361:ifnull          369
	//* 147  364:aload           14
	//* 148  366:ifnonnull       617
				{
					try
					{
						acroFields.regenerateField(s1);
	//  149  369:aload_0         
	//  150  370:getfield        #1174 <Field AcroFields acroFields>
	//  151  373:aload           18
	//  152  375:invokevirtual   #1493 <Method boolean AcroFields.regenerateField(String)>
	//  153  378:pop             
						obj = ((Object) (acroFields.getFieldItem(s1).getMerged(k).getAsDict(PdfName.AP)));
	//  154  379:aload_0         
	//  155  380:getfield        #1174 <Field AcroFields acroFields>
	//  156  383:aload           18
	//  157  385:invokevirtual   #1497 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//  158  388:iload           11
	//  159  390:invokevirtual   #1486 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  160  393:getstatic       #454 <Field PdfName PdfName.AP>
	//  161  396:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  162  399:astore          13
					}
	//* 163  401:aload           13
	//* 164  403:ifnull          538
	//* 165  406:iload           9
	//* 166  408:iconst_4        
	//* 167  409:iand            
	//* 168  410:ifeq            538
	//* 169  413:iload           9
	//* 170  415:iconst_2        
	//* 171  416:iand            
	//* 172  417:ifne            538
	//* 173  420:aload           13
	//* 174  422:getstatic       #457 <Field PdfName PdfName.N>
	//* 175  425:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 176  428:astore          21
	//* 177  430:aconst_null     
	//* 178  431:astore          14
	//* 179  433:aload           14
	//* 180  435:astore          13
	//* 181  437:aload           21
	//* 182  439:ifnull          479
	//* 183  442:aload           21
	//* 184  444:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 185  447:astore          16
	//* 186  449:aload           21
	//* 187  451:instanceof      #429 <Class PdfIndirectReference>
	//* 188  454:ifeq            1123
	//* 189  457:aload           21
	//* 190  459:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 191  462:ifne            1123
	//* 192  465:new             #463 <Class PdfAppearance>
	//* 193  468:dup             
	//* 194  469:aload           21
	//* 195  471:checkcast       #429 <Class PdfIndirectReference>
	//* 196  474:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//* 197  477:astore          13
	//* 198  479:aload           13
	//* 199  481:ifnull          538
	//* 200  484:aload           20
	//* 201  486:getstatic       #469 <Field PdfName PdfName.RECT>
	//* 202  489:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 203  492:invokestatic    #473 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//* 204  495:astore          14
	//* 205  497:aload_0         
	//* 206  498:iload           10
	//* 207  500:invokevirtual   #480 <Method PdfContentByte getOverContent(int)>
	//* 208  503:astore          16
	//* 209  505:aload           16
	//* 210  507:ldc2            #482 <String "Q ">
	//* 211  510:invokevirtual   #487 <Method void PdfContentByte.setLiteral(String)>
	//* 212  513:aload           16
	//* 213  515:aload           13
	//* 214  517:aload           14
	//* 215  519:invokevirtual   #515 <Method float Rectangle.getLeft()>
	//* 216  522:aload           14
	//* 217  524:invokevirtual   #518 <Method float Rectangle.getBottom()>
	//* 218  527:invokevirtual   #1500 <Method void PdfContentByte.addTemplate(PdfTemplate, float, float)>
	//* 219  530:aload           16
	//* 220  532:ldc2            #524 <String "q ">
	//* 221  535:invokevirtual   #487 <Method void PdfContentByte.setLiteral(String)>
	//* 222  538:aload_0         
	//* 223  539:getfield        #98  <Field HashSet partialFlattening>
	//* 224  542:invokevirtual   #821 <Method boolean HashSet.isEmpty()>
	//* 225  545:ifne            293
	//* 226  548:aload_0         
	//* 227  549:getfield        #160 <Field PdfReader reader>
	//* 228  552:iload           10
	//* 229  554:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//* 230  557:astore          16
	//* 231  559:aload           16
	//* 232  561:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 233  564:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 234  567:astore          20
	//* 235  569:aload           20
	//* 236  571:ifnull          293
	//* 237  574:iconst_0        
	//* 238  575:istore          9
	//* 239  577:iload           9
	//* 240  579:aload           20
	//* 241  581:invokevirtual   #293 <Method int PdfArray.size()>
	//* 242  584:icmpge          1559
	//* 243  587:aload           20
	//* 244  589:iload           9
	//* 245  591:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 246  594:astore          13
	//* 247  596:aload           13
	//* 248  598:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 249  601:ifne            1273
	//* 250  604:iload           9
	//* 251  606:istore          10
	//* 252  608:iload           10
	//* 253  610:iconst_1        
	//* 254  611:iadd            
	//* 255  612:istore          9
	//* 256  614:goto            577
	//* 257  617:aload           16
	//* 258  619:astore          13
	//* 259  621:aload           14
	//* 260  623:invokevirtual   #1012 <Method boolean PdfObject.isStream()>
	//* 261  626:ifeq            401
	//* 262  629:aload           14
	//* 263  631:checkcast       #532 <Class PdfStream>
	//* 264  634:astore          14
	//* 265  636:aload           14
	//* 266  638:getstatic       #476 <Field PdfName PdfName.BBOX>
	//* 267  641:invokevirtual   #1501 <Method PdfArray PdfStream.getAsArray(PdfName)>
	//* 268  644:astore          21
	//* 269  646:aload           20
	//* 270  648:getstatic       #469 <Field PdfName PdfName.RECT>
	//* 271  651:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 272  654:astore          22
	//* 273  656:aload           16
	//* 274  658:astore          13
	//* 275  660:aload           21
	//* 276  662:ifnull          401
	//* 277  665:aload           16
	//* 278  667:astore          13
	//* 279  669:aload           22
	//* 280  671:ifnull          401
	//* 281  674:aload           22
	//* 282  676:iconst_2        
	//* 283  677:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 284  680:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 285  683:fstore_1        
	//* 286  684:aload           22
	//* 287  686:iconst_0        
	//* 288  687:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 289  690:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 290  693:fstore          5
	//* 291  695:aload           21
	//* 292  697:iconst_2        
	//* 293  698:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 294  701:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 295  704:aload           21
	//* 296  706:iconst_0        
	//* 297  707:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 298  710:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 299  713:fsub            
	//* 300  714:fstore          6
	//* 301  716:aload           22
	//* 302  718:iconst_3        
	//* 303  719:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 304  722:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 305  725:fstore_2        
	//* 306  726:aload           22
	//* 307  728:iconst_1        
	//* 308  729:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 309  732:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 310  735:fstore_3        
	//* 311  736:aload           21
	//* 312  738:iconst_3        
	//* 313  739:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 314  742:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 315  745:aload           21
	//* 316  747:iconst_1        
	//* 317  748:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 318  751:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 319  754:fsub            
	//* 320  755:fstore          4
	//* 321  757:fload           6
	//* 322  759:fconst_0        
	//* 323  760:fcmpl           
	//* 324  761:ifeq            875
	//* 325  764:fload_1         
	//* 326  765:fload           5
	//* 327  767:fsub            
	//* 328  768:fload           6
	//* 329  770:fdiv            
	//* 330  771:fstore_1        
	//* 331  772:fload_1         
	//* 332  773:invokestatic    #1511 <Method float Math.abs(float)>
	//* 333  776:fstore          5
	//* 334  778:fload           4
	//* 335  780:fconst_0        
	//* 336  781:fcmpl           
	//* 337  782:ifeq            882
	//* 338  785:fload_2         
	//* 339  786:fload_3         
	//* 340  787:fsub            
	//* 341  788:fload           4
	//* 342  790:fdiv            
	//* 343  791:fstore_1        
	//* 344  792:fload_1         
	//* 345  793:invokestatic    #1511 <Method float Math.abs(float)>
	//* 346  796:fstore_1        
	//* 347  797:fload           5
	//* 348  799:fconst_1        
	//* 349  800:fcmpl           
	//* 350  801:ifne            814
	//* 351  804:aload           16
	//* 352  806:astore          13
	//* 353  808:fload_1         
	//* 354  809:fconst_1        
	//* 355  810:fcmpl           
	//* 356  811:ifeq            401
	//* 357  814:new             #1513 <Class NumberArray>
	//* 358  817:dup             
	//* 359  818:bipush          6
	//* 360  820:newarray        float[]
	//* 361  822:dup             
	//* 362  823:iconst_0        
	//* 363  824:fload           5
	//* 364  826:fastore         
	//* 365  827:dup             
	//* 366  828:iconst_1        
	//* 367  829:fconst_0        
	//* 368  830:fastore         
	//* 369  831:dup             
	//* 370  832:iconst_2        
	//* 371  833:fconst_0        
	//* 372  834:fastore         
	//* 373  835:dup             
	//* 374  836:iconst_3        
	//* 375  837:fload_1         
	//* 376  838:fastore         
	//* 377  839:dup             
	//* 378  840:iconst_4        
	//* 379  841:fconst_0        
	//* 380  842:fastore         
	//* 381  843:dup             
	//* 382  844:iconst_5        
	//* 383  845:fconst_0        
	//* 384  846:fastore         
	//* 385  847:invokespecial   #1516 <Method void NumberArray(float[])>
	//* 386  850:astore          13
	//* 387  852:aload           14
	//* 388  854:getstatic       #490 <Field PdfName PdfName.MATRIX>
	//* 389  857:aload           13
	//* 390  859:invokevirtual   #1385 <Method void PdfStream.put(PdfName, PdfObject)>
	//* 391  862:aload_0         
	//* 392  863:aload           14
	//* 393  865:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//* 394  868:aload           16
	//* 395  870:astore          13
	//* 396  872:goto            401
	//* 397  875:ldc2            #1517 <Float 3.402823E+38F>
	//* 398  878:fstore_1        
	//* 399  879:goto            772
	//* 400  882:ldc2            #1517 <Float 3.402823E+38F>
	//* 401  885:fstore_1        
	//* 402  886:goto            792
	//* 403  889:aload           16
	//* 404  891:astore          13
	//* 405  893:aload           16
	//* 406  895:ifnull          401
	//* 407  898:aload           16
	//* 408  900:astore          13
	//* 409  902:aload           14
	//* 410  904:ifnull          401
	//* 411  907:aload           14
	//* 412  909:checkcast       #386 <Class PdfDictionary>
	//* 413  912:getstatic       #476 <Field PdfName PdfName.BBOX>
	//* 414  915:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 415  918:astore          14
	//* 416  920:aload           20
	//* 417  922:getstatic       #469 <Field PdfName PdfName.RECT>
	//* 418  925:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 419  928:astore          21
	//* 420  930:aload           16
	//* 421  932:astore          13
	//* 422  934:aload           14
	//* 423  936:ifnull          401
	//* 424  939:aload           16
	//* 425  941:astore          13
	//* 426  943:aload           21
	//* 427  945:ifnull          401
	//* 428  948:aload           14
	//* 429  950:iconst_2        
	//* 430  951:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 431  954:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 432  957:fstore_1        
	//* 433  958:aload           14
	//* 434  960:iconst_0        
	//* 435  961:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 436  964:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 437  967:fstore_2        
	//* 438  968:aload           21
	//* 439  970:iconst_2        
	//* 440  971:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 441  974:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 442  977:fstore_3        
	//* 443  978:aload           21
	//* 444  980:iconst_0        
	//* 445  981:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 446  984:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 447  987:fstore          4
	//* 448  989:aload           14
	//* 449  991:iconst_3        
	//* 450  992:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 451  995:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 452  998:fstore          5
	//* 453 1000:aload           14
	//* 454 1002:iconst_1        
	//* 455 1003:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 456 1006:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 457 1009:fstore          6
	//* 458 1011:aload           21
	//* 459 1013:iconst_3        
	//* 460 1014:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 461 1017:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 462 1020:fstore          7
	//* 463 1022:aload           21
	//* 464 1024:iconst_1        
	//* 465 1025:invokevirtual   #1504 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 466 1028:invokevirtual   #1505 <Method float PdfNumber.floatValue()>
	//* 467 1031:fstore          8
	//* 468 1033:fload_1         
	//* 469 1034:fload_2         
	//* 470 1035:fsub            
	//* 471 1036:fload_3         
	//* 472 1037:fload           4
	//* 473 1039:fsub            
	//* 474 1040:fsub            
	//* 475 1041:invokestatic    #1511 <Method float Math.abs(float)>
	//* 476 1044:fconst_1        
	//* 477 1045:fcmpl           
	//* 478 1046:ifgt            1072
	//* 479 1049:aload           16
	//* 480 1051:astore          13
	//* 481 1053:fload           5
	//* 482 1055:fload           6
	//* 483 1057:fsub            
	//* 484 1058:fload           7
	//* 485 1060:fload           8
	//* 486 1062:fsub            
	//* 487 1063:fsub            
	//* 488 1064:invokestatic    #1511 <Method float Math.abs(float)>
	//* 489 1067:fconst_1        
	//* 490 1068:fcmpl           
	//* 491 1069:ifle            401
	//* 492 1072:aload_0         
	//* 493 1073:getfield        #1174 <Field AcroFields acroFields>
	//* 494 1076:iconst_1        
	//* 495 1077:invokevirtual   #1520 <Method void AcroFields.setGenerateAppearances(boolean)>
	//* 496 1080:aload_0         
	//* 497 1081:getfield        #1174 <Field AcroFields acroFields>
	//* 498 1084:aload           18
	//* 499 1086:invokevirtual   #1493 <Method boolean AcroFields.regenerateField(String)>
	//* 500 1089:pop             
	//* 501 1090:aload_0         
	//* 502 1091:getfield        #1174 <Field AcroFields acroFields>
	//* 503 1094:iconst_0        
	//* 504 1095:invokevirtual   #1520 <Method void AcroFields.setGenerateAppearances(boolean)>
	//* 505 1098:aload_0         
	//* 506 1099:getfield        #1174 <Field AcroFields acroFields>
	//* 507 1102:aload           18
	//* 508 1104:invokevirtual   #1497 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//* 509 1107:iload           11
	//* 510 1109:invokevirtual   #1486 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//* 511 1112:getstatic       #454 <Field PdfName PdfName.AP>
	//* 512 1115:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 513 1118:astore          13
	//* 514 1120:goto            401
	//* 515 1123:aload           16
	//* 516 1125:instanceof      #532 <Class PdfStream>
	//* 517 1128:ifeq            1162
	//* 518 1131:aload           16
	//* 519 1133:checkcast       #386 <Class PdfDictionary>
	//* 520 1136:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//* 521 1139:getstatic       #535 <Field PdfName PdfName.FORM>
	//* 522 1142:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 523 1145:new             #463 <Class PdfAppearance>
	//* 524 1148:dup             
	//* 525 1149:aload           21
	//* 526 1151:checkcast       #429 <Class PdfIndirectReference>
	//* 527 1154:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//* 528 1157:astore          13
	//* 529 1159:goto            479
	//* 530 1162:aload           14
	//* 531 1164:astore          13
	//* 532 1166:aload           16
	//* 533 1168:ifnull          479
	//* 534 1171:aload           14
	//* 535 1173:astore          13
	//* 536 1175:aload           16
	//* 537 1177:invokevirtual   #541 <Method boolean PdfObject.isDictionary()>
	//* 538 1180:ifeq            479
	//* 539 1183:aload           20
	//* 540 1185:getstatic       #544 <Field PdfName PdfName.AS>
	//* 541 1188:invokevirtual   #548 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//* 542 1191:astore          21
	//* 543 1193:aload           14
	//* 544 1195:astore          13
	//* 545 1197:aload           21
	//* 546 1199:ifnull          479
	//* 547 1202:aload           16
	//* 548 1204:checkcast       #386 <Class PdfDictionary>
	//* 549 1207:aload           21
	//* 550 1209:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 551 1212:checkcast       #429 <Class PdfIndirectReference>
	//* 552 1215:astore          16
	//* 553 1217:aload           14
	//* 554 1219:astore          13
	//* 555 1221:aload           16
	//* 556 1223:ifnull          479
	//* 557 1226:new             #463 <Class PdfAppearance>
	//* 558 1229:dup             
	//* 559 1230:aload           16
	//* 560 1232:invokespecial   #466 <Method void PdfAppearance(PdfIndirectReference)>
	//* 561 1235:astore          14
	//* 562 1237:aload           14
	//* 563 1239:astore          13
	//* 564 1241:aload           16
	//* 565 1243:invokevirtual   #549 <Method boolean PdfIndirectReference.isIndirect()>
	//* 566 1246:ifeq            479
	//* 567 1249:aload           16
	//* 568 1251:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 569 1254:checkcast       #386 <Class PdfDictionary>
	//* 570 1257:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//* 571 1260:getstatic       #535 <Field PdfName PdfName.FORM>
	//* 572 1263:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 573 1266:aload           14
	//* 574 1268:astore          13
	//* 575 1270:goto            479
	//* 576 1273:aload           19
	//* 577 1275:iload           11
	//* 578 1277:invokevirtual   #1524 <Method PdfIndirectReference AcroFields$Item.getWidgetRef(int)>
	//* 579 1280:astore          14
	//* 580 1282:iload           9
	//* 581 1284:istore          10
	//* 582 1286:aload           14
	//* 583 1288:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 584 1291:ifeq            608
	//* 585 1294:iload           9
	//* 586 1296:istore          10
	//* 587 1298:aload           13
	//* 588 1300:checkcast       #366 <Class PRIndirectReference>
	//* 589 1303:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 590 1306:aload           14
	//* 591 1308:checkcast       #366 <Class PRIndirectReference>
	//* 592 1311:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 593 1314:icmpne          608
	//* 594 1317:iload           9
	//* 595 1319:iconst_1        
	//* 596 1320:isub            
	//* 597 1321:istore          10
	//* 598 1323:aload           20
	//* 599 1325:iload           9
	//* 600 1327:invokevirtual   #527 <Method PdfObject PdfArray.remove(int)>
	//* 601 1330:pop             
	//* 602 1331:aload           14
	//* 603 1333:checkcast       #366 <Class PRIndirectReference>
	//* 604 1336:astore          13
	//* 605 1338:aload           13
	//* 606 1340:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 607 1343:checkcast       #386 <Class PdfDictionary>
	//* 608 1346:getstatic       #1527 <Field PdfName PdfName.PARENT>
	//* 609 1349:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 610 1352:checkcast       #366 <Class PRIndirectReference>
	//* 611 1355:astore          14
	//* 612 1357:aload           13
	//* 613 1359:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//* 614 1362:pop             
	//* 615 1363:aload           14
	//* 616 1365:ifnonnull       1448
	//* 617 1368:iconst_0        
	//* 618 1369:istore          9
	//* 619 1371:iload           9
	//* 620 1373:aload           15
	//* 621 1375:invokevirtual   #293 <Method int PdfArray.size()>
	//* 622 1378:icmpge          1445
	//* 623 1381:aload           15
	//* 624 1383:iload           9
	//* 625 1385:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 626 1388:astore          14
	//* 627 1390:iload           9
	//* 628 1392:istore          12
	//* 629 1394:aload           14
	//* 630 1396:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 631 1399:ifeq            1436
	//* 632 1402:iload           9
	//* 633 1404:istore          12
	//* 634 1406:aload           14
	//* 635 1408:checkcast       #366 <Class PRIndirectReference>
	//* 636 1411:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 637 1414:aload           13
	//* 638 1416:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 639 1419:icmpne          1436
	//* 640 1422:aload           15
	//* 641 1424:iload           9
	//* 642 1426:invokevirtual   #527 <Method PdfObject PdfArray.remove(int)>
	//* 643 1429:pop             
	//* 644 1430:iload           9
	//* 645 1432:iconst_1        
	//* 646 1433:isub            
	//* 647 1434:istore          12
	//* 648 1436:iload           12
	//* 649 1438:iconst_1        
	//* 650 1439:iadd            
	//* 651 1440:istore          9
	//* 652 1442:goto            1371
	//* 653 1445:goto            608
	//* 654 1448:aload           14
	//* 655 1450:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 656 1453:checkcast       #386 <Class PdfDictionary>
	//* 657 1456:getstatic       #560 <Field PdfName PdfName.KIDS>
	//* 658 1459:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 659 1462:astore          21
	//* 660 1464:iconst_0        
	//* 661 1465:istore          9
	//* 662 1467:iload           9
	//* 663 1469:aload           21
	//* 664 1471:invokevirtual   #293 <Method int PdfArray.size()>
	//* 665 1474:icmpge          1541
	//* 666 1477:aload           21
	//* 667 1479:iload           9
	//* 668 1481:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 669 1484:astore          22
	//* 670 1486:iload           9
	//* 671 1488:istore          12
	//* 672 1490:aload           22
	//* 673 1492:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 674 1495:ifeq            1532
	//* 675 1498:iload           9
	//* 676 1500:istore          12
	//* 677 1502:aload           22
	//* 678 1504:checkcast       #366 <Class PRIndirectReference>
	//* 679 1507:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 680 1510:aload           13
	//* 681 1512:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//* 682 1515:icmpne          1532
	//* 683 1518:aload           21
	//* 684 1520:iload           9
	//* 685 1522:invokevirtual   #527 <Method PdfObject PdfArray.remove(int)>
	//* 686 1525:pop             
	//* 687 1526:iload           9
	//* 688 1528:iconst_1        
	//* 689 1529:isub            
	//* 690 1530:istore          12
	//* 691 1532:iload           12
	//* 692 1534:iconst_1        
	//* 693 1535:iadd            
	//* 694 1536:istore          9
	//* 695 1538:goto            1467
	//* 696 1541:aload           21
	//* 697 1543:invokevirtual   #333 <Method boolean PdfArray.isEmpty()>
	//* 698 1546:ifne            1552
	//* 699 1549:goto            608
	//* 700 1552:aload           14
	//* 701 1554:astore          13
	//* 702 1556:goto            1338
	//* 703 1559:aload           20
	//* 704 1561:invokevirtual   #333 <Method boolean PdfArray.isEmpty()>
	//* 705 1564:ifeq            293
	//* 706 1567:aload           16
	//* 707 1569:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 708 1572:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 709 1575:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//* 710 1578:pop             
	//* 711 1579:aload           16
	//* 712 1581:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 713 1584:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
	//* 714 1587:goto            293
	//* 715 1590:aload_0         
	//* 716 1591:getfield        #109 <Field boolean fieldsAdded>
	//* 717 1594:ifne            1792
	//* 718 1597:aload_0         
	//* 719 1598:getfield        #98  <Field HashSet partialFlattening>
	//* 720 1601:invokevirtual   #821 <Method boolean HashSet.isEmpty()>
	//* 721 1604:ifeq            1792
	//* 722 1607:iconst_1        
	//* 723 1608:istore          10
	//* 724 1610:iload           10
	//* 725 1612:aload_0         
	//* 726 1613:getfield        #160 <Field PdfReader reader>
	//* 727 1616:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//* 728 1619:icmpgt          1788
	//* 729 1622:aload_0         
	//* 730 1623:getfield        #160 <Field PdfReader reader>
	//* 731 1626:iload           10
	//* 732 1628:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//* 733 1631:astore          13
	//* 734 1633:aload           13
	//* 735 1635:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 736 1638:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 737 1641:astore          14
	//* 738 1643:aload           14
	//* 739 1645:ifnonnull       1657
	//* 740 1648:iload           10
	//* 741 1650:iconst_1        
	//* 742 1651:iadd            
	//* 743 1652:istore          10
	//* 744 1654:goto            1610
	//* 745 1657:iconst_0        
	//* 746 1658:istore          9
	//* 747 1660:iload           9
	//* 748 1662:aload           14
	//* 749 1664:invokevirtual   #293 <Method int PdfArray.size()>
	//* 750 1667:icmpge          1757
	//* 751 1670:aload           14
	//* 752 1672:iload           9
	//* 753 1674:invokevirtual   #427 <Method PdfObject PdfArray.getDirectObject(int)>
	//* 754 1677:astore          15
	//* 755 1679:aload           15
	//* 756 1681:instanceof      #429 <Class PdfIndirectReference>
	//* 757 1684:ifeq            1708
	//* 758 1687:aload           15
	//* 759 1689:invokevirtual   #302 <Method boolean PdfObject.isIndirect()>
	//* 760 1692:ifne            1708
	//* 761 1695:iload           9
	//* 762 1697:istore          11
	//* 763 1699:iload           11
	//* 764 1701:iconst_1        
	//* 765 1702:iadd            
	//* 766 1703:istore          9
	//* 767 1705:goto            1660
	//* 768 1708:aload           15
	//* 769 1710:invokevirtual   #541 <Method boolean PdfObject.isDictionary()>
	//* 770 1713:ifeq            1740
	//* 771 1716:iload           9
	//* 772 1718:istore          11
	//* 773 1720:getstatic       #530 <Field PdfName PdfName.WIDGET>
	//* 774 1723:aload           15
	//* 775 1725:checkcast       #386 <Class PdfDictionary>
	//* 776 1728:getstatic       #432 <Field PdfName PdfName.SUBTYPE>
	//* 777 1731:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 778 1734:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//* 779 1737:ifeq            1699
	//* 780 1740:aload           14
	//* 781 1742:iload           9
	//* 782 1744:invokevirtual   #527 <Method PdfObject PdfArray.remove(int)>
	//* 783 1747:pop             
	//* 784 1748:iload           9
	//* 785 1750:iconst_1        
	//* 786 1751:isub            
	//* 787 1752:istore          11
	//* 788 1754:goto            1699
	//* 789 1757:aload           14
	//* 790 1759:invokevirtual   #333 <Method boolean PdfArray.isEmpty()>
	//* 791 1762:ifeq            1648
	//* 792 1765:aload           13
	//* 793 1767:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 794 1770:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 795 1773:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//* 796 1776:pop             
	//* 797 1777:aload           13
	//* 798 1779:getstatic       #420 <Field PdfName PdfName.ANNOTS>
	//* 799 1782:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
	//* 800 1785:goto            1648
	//* 801 1788:aload_0         
	//* 802 1789:invokevirtual   #1530 <Method void eliminateAcroformObjects()>
	//* 803 1792:return          
	//* 804 1793:astore          13
	//* 805 1795:aload           16
	//* 806 1797:astore          13
	//* 807 1799:goto            401
	//* 808 1802:astore          13
	//* 809 1804:aload           16
	//* 810 1806:astore          13
	//* 811 1808:goto            401
	//* 812 1811:astore          13
	//* 813 1813:aload           16
	//* 814 1815:astore          13
	//* 815 1817:goto            401
					catch(IOException ioexception)
	//* 816 1820:astore          13
					{
						ioexception = ((IOException) (obj3));
	//  817 1822:aload           16
	//  818 1824:astore          13
					}
					// Misplaced declaration of an exception variable
					catch(Object obj)
					{
						obj = obj3;
					}
				} else
				{
					obj = obj3;
					if(!((PdfObject) (obj1)).isStream())
						break label0;
					obj1 = ((Object) ((PdfStream)obj1));
					obj5 = ((Object) (((PdfStream) (obj1)).getAsArray(PdfName.BBOX)));
					PdfArray pdfarray = ((PdfDictionary) (obj4)).getAsArray(PdfName.RECT);
					obj = obj3;
					if(obj5 == null)
						break label0;
					obj = obj3;
					if(pdfarray == null)
						break label0;
					float f = pdfarray.getAsNumber(2).floatValue();
					float f8 = pdfarray.getAsNumber(0).floatValue();
					float f10 = ((PdfArray) (obj5)).getAsNumber(2).floatValue() - ((PdfArray) (obj5)).getAsNumber(0).floatValue();
					float f2 = pdfarray.getAsNumber(3).floatValue();
					float f4 = pdfarray.getAsNumber(1).floatValue();
					float f6 = ((PdfArray) (obj5)).getAsNumber(3).floatValue() - ((PdfArray) (obj5)).getAsNumber(1).floatValue();
					if(f10 != 0.0F)
						f = (f - f8) / f10;
					else
						f = 3.402823E+38F;
					f8 = Math.abs(f);
					if(f6 != 0.0F)
						f = (f2 - f4) / f6;
					else
						f = 3.402823E+38F;
					f = Math.abs(f);
					if(f8 == 1.0F)
					{
						obj = obj3;
						if(f == 1.0F)
							break label0;
					}
					obj = ((Object) (new NumberArray(new float[] {
						f8, 0.0F, 0.0F, f, 0.0F, 0.0F
					})));
					((PdfStream) (obj1)).put(PdfName.MATRIX, ((PdfObject) (obj)));
					markUsed(((PdfObject) (obj1)));
					obj = obj3;
				}
			} else
			{
				obj = obj3;
				if(obj3 == null)
					break label0;
				obj = obj3;
				if(obj1 == null)
					break label0;
				obj1 = ((Object) (((PdfDictionary)obj1).getAsArray(PdfName.BBOX)));
				obj5 = ((Object) (((PdfDictionary) (obj4)).getAsArray(PdfName.RECT)));
				obj = obj3;
				if(obj1 == null)
					break label0;
				obj = obj3;
				if(obj5 == null)
					break label0;
				float f1 = ((PdfArray) (obj1)).getAsNumber(2).floatValue();
				float f3 = ((PdfArray) (obj1)).getAsNumber(0).floatValue();
				float f5 = ((PdfArray) (obj5)).getAsNumber(2).floatValue();
				float f7 = ((PdfArray) (obj5)).getAsNumber(0).floatValue();
				float f9 = ((PdfArray) (obj1)).getAsNumber(3).floatValue();
				float f11 = ((PdfArray) (obj1)).getAsNumber(1).floatValue();
				float f12 = ((PdfArray) (obj5)).getAsNumber(3).floatValue();
				float f13 = ((PdfArray) (obj5)).getAsNumber(1).floatValue();
				if(Math.abs(f1 - f3 - (f5 - f7)) <= 1.0F)
				{
					obj = obj3;
					if(Math.abs(f9 - f11 - (f12 - f13)) <= 1.0F)
						break label0;
				}
				int l;
				PdfObject pdfobject;
				try
				{
					acroFields.setGenerateAppearances(true);
					acroFields.regenerateField(s1);
					acroFields.setGenerateAppearances(false);
					obj = ((Object) (acroFields.getFieldItem(s1).getMerged(k).getAsDict(PdfName.AP)));
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					obj = obj3;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					obj = obj3;
				}
			}
		}
		if(obj != null && (i & 4) != 0 && (i & 2) == 0)
		{
			obj5 = ((Object) (((PdfDictionary) (obj)).get(PdfName.N)));
			obj1 = null;
			obj = obj1;
			if(obj5 != null)
			{
				obj3 = ((Object) (PdfReader.getPdfObject(((PdfObject) (obj5)))));
				if((obj5 instanceof PdfIndirectReference) && !((PdfObject) (obj5)).isIndirect())
					obj = ((Object) (new PdfAppearance((PdfIndirectReference)obj5)));
				else
				if(obj3 instanceof PdfStream)
				{
					((PdfDictionary)obj3).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
					obj = ((Object) (new PdfAppearance((PdfIndirectReference)obj5)));
				} else
				{
					obj = obj1;
					if(obj3 != null)
					{
						obj = obj1;
						if(((PdfObject) (obj3)).isDictionary())
						{
							obj5 = ((Object) (((PdfDictionary) (obj4)).getAsName(PdfName.AS)));
							obj = obj1;
							if(obj5 != null)
							{
								obj3 = ((Object) ((PdfIndirectReference)((PdfDictionary)obj3).get(((PdfName) (obj5)))));
								obj = obj1;
								if(obj3 != null)
								{
									obj1 = ((Object) (new PdfAppearance(((PdfIndirectReference) (obj3)))));
									obj = obj1;
									if(((PdfIndirectReference) (obj3)).isIndirect())
									{
										((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj3)))).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
										obj = obj1;
									}
								}
							}
						}
					}
				}
			}
			if(obj != null)
			{
				obj1 = ((Object) (PdfReader.getNormalizedRectangle(((PdfDictionary) (obj4)).getAsArray(PdfName.RECT))));
				obj3 = ((Object) (getOverContent(j)));
				((PdfContentByte) (obj3)).setLiteral("Q ");
				((PdfContentByte) (obj3)).addTemplate(((PdfTemplate) (obj)), ((Rectangle) (obj1)).getLeft(), ((Rectangle) (obj1)).getBottom());
				((PdfContentByte) (obj3)).setLiteral("q ");
			}
		}
		if(partialFlattening.isEmpty()) goto _L3; else goto _L6
_L6:
		obj3 = ((Object) (reader.getPageN(j)));
		obj4 = ((Object) (((PdfDictionary) (obj3)).getAsArray(PdfName.ANNOTS)));
		if(obj4 == null) goto _L3; else goto _L7
_L7:
		i = 0;
_L9:
		if(i >= ((PdfArray) (obj4)).size())
			break MISSING_BLOCK_LABEL_1559;
		obj = ((Object) (((PdfArray) (obj4)).getPdfObject(i)));
		if(((PdfObject) (obj)).isIndirect())
			break; /* Loop/switch isn't completed */
		j = i;
_L11:
		i = j + 1;
		if(true) goto _L9; else goto _L8
_L8:
		obj1 = ((Object) (item.getWidgetRef(k)));
		j = i;
		if(!((PdfObject) (obj1)).isIndirect()) goto _L11; else goto _L10
_L10:
		j = i;
		if(((PRIndirectReference)obj).getNumber() != ((PRIndirectReference)obj1).getNumber()) goto _L11; else goto _L12
_L12:
		j = i - 1;
		((PdfArray) (obj4)).remove(i);
		obj = ((Object) ((PRIndirectReference)obj1));
_L14:
label1:
		{
			obj1 = ((Object) ((PRIndirectReference)((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))).get(PdfName.PARENT)));
			PdfReader.killIndirect(((PdfObject) (obj)));
			if(obj1 != null)
				break label1;
			i = 0;
			while(i < ((PdfArray) (obj2)).size()) 
			{
				obj1 = ((Object) (((PdfArray) (obj2)).getPdfObject(i)));
				l = i;
				if(((PdfObject) (obj1)).isIndirect())
				{
					l = i;
					if(((PRIndirectReference)obj1).getNumber() == ((PRIndirectReference) (obj)).getNumber())
					{
						((PdfArray) (obj2)).remove(i);
						l = i - 1;
					}
				}
				i = l + 1;
			}
		}
		  goto _L11
		obj5 = ((Object) (((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj1)))).getAsArray(PdfName.KIDS)));
		for(i = 0; i < ((PdfArray) (obj5)).size(); i = l + 1)
		{
			pdfobject = ((PdfArray) (obj5)).getPdfObject(i);
			l = i;
			if(!pdfobject.isIndirect())
				continue;
			l = i;
			if(((PRIndirectReference)pdfobject).getNumber() == ((PRIndirectReference) (obj)).getNumber())
			{
				((PdfArray) (obj5)).remove(i);
				l = i - 1;
			}
		}

		if(((PdfArray) (obj5)).isEmpty()) goto _L13; else goto _L11
_L13:
		obj = obj1;
		  goto _L14
		if(((PdfArray) (obj4)).isEmpty())
		{
			PdfReader.killIndirect(((PdfDictionary) (obj3)).get(PdfName.ANNOTS));
			((PdfDictionary) (obj3)).remove(PdfName.ANNOTS);
		}
		  goto _L3
		if(fieldsAdded || !partialFlattening.isEmpty())
			break MISSING_BLOCK_LABEL_1792;
		j = 1;
_L16:
		if(j > reader.getNumberOfPages())
			break MISSING_BLOCK_LABEL_1788;
		obj = ((Object) (reader.getPageN(j)));
		obj1 = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.ANNOTS)));
		if(obj1 != null)
			break; /* Loop/switch isn't completed */
_L22:
		j++;
		if(true) goto _L16; else goto _L15
_L15:
		i = 0;
_L18:
		if(i >= ((PdfArray) (obj1)).size())
			break MISSING_BLOCK_LABEL_1757;
		obj2 = ((Object) (((PdfArray) (obj1)).getDirectObject(i)));
		if(!(obj2 instanceof PdfIndirectReference) || ((PdfObject) (obj2)).isIndirect())
			break; /* Loop/switch isn't completed */
		k = i;
_L21:
		i = k + 1;
		if(true) goto _L18; else goto _L17
_L17:
		if(!((PdfObject) (obj2)).isDictionary()) goto _L20; else goto _L19
_L19:
		k = i;
		if(!PdfName.WIDGET.equals(((Object) (((PdfDictionary)obj2).get(PdfName.SUBTYPE))))) goto _L21; else goto _L20
_L20:
		((PdfArray) (obj1)).remove(i);
		k = i - 1;
		  goto _L21
		if(((PdfArray) (obj1)).isEmpty())
		{
			PdfReader.killIndirect(((PdfDictionary) (obj)).get(PdfName.ANNOTS));
			((PdfDictionary) (obj)).remove(PdfName.ANNOTS);
		}
		  goto _L22
		eliminateAcroformObjects();
	//* 819 1826:goto            401
	}

	protected void flatFreeTextFields()
	{
		flattenAnnotations(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #1532 <Method void flattenAnnotations(boolean)>
	//    3    5:return          
	}

	protected void flattenAnnotations()
	{
		flattenAnnotations(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #1532 <Method void flattenAnnotations(boolean)>
	//    3    5:return          
	}

	AcroFields getAcroFields()
	{
		if(acroFields == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1174 <Field AcroFields acroFields>
	//*   2    4:ifnonnull       23
			acroFields = new AcroFields(reader, ((PdfWriter) (this)));
	//    3    7:aload_0         
	//    4    8:new             #1176 <Class AcroFields>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #160 <Field PdfReader reader>
	//    8   16:aload_0         
	//    9   17:invokespecial   #1535 <Method void AcroFields(PdfReader, PdfWriter)>
	//   10   20:putfield        #1174 <Field AcroFields acroFields>
		return acroFields;
	//   11   23:aload_0         
	//   12   24:getfield        #1174 <Field AcroFields acroFields>
	//   13   27:areturn         
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Counter COUNTER>
	//    2    4:areturn         
	}

	public PdfContentByte getDirectContent()
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.pdfstamper.getundercontent.or.pdfstamper.getovercontent", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1541 <String "use.pdfstamper.getundercontent.or.pdfstamper.getovercontent">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	public PdfContentByte getDirectContentUnder()
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.pdfstamper.getundercontent.or.pdfstamper.getovercontent", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1541 <String "use.pdfstamper.getundercontent.or.pdfstamper.getovercontent">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	protected HashMap getNamedDestinations()
	{
		return namedDestinations;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field HashMap namedDestinations>
	//    2    4:areturn         
	}

	protected int getNewObjectNumber(PdfReader pdfreader, int i, int j)
	{
		pdfreader = ((PdfReader) ((IntHashtable)readers2intrefs.get(((Object) (pdfreader)))));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field HashMap readers2intrefs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #76  <Class IntHashtable>
	//    5   11:astore_1        
		if(pdfreader != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          45
		{
			int k = ((IntHashtable) (pdfreader)).get(i);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #1548 <Method int IntHashtable.get(int)>
	//   11   21:istore          4
			j = k;
	//   12   23:iload           4
	//   13   25:istore_3        
			if(k == 0)
	//*  14   26:iload           4
	//*  15   28:ifne            43
			{
				j = getIndirectReferenceNumber();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #1551 <Method int getIndirectReferenceNumber()>
	//   18   35:istore_3        
				((IntHashtable) (pdfreader)).put(i, j);
	//   19   36:aload_1         
	//   20   37:iload_2         
	//   21   38:iload_3         
	//   22   39:invokevirtual   #381 <Method int IntHashtable.put(int, int)>
	//   23   42:pop             
			}
		} else
	//*  24   43:iload_3         
	//*  25   44:ireturn         
		if(currentPdfReaderInstance == null)
	//*  26   45:aload_0         
	//*  27   46:getfield        #1555 <Field PdfReaderInstance currentPdfReaderInstance>
	//*  28   49:ifnonnull       104
		{
			if(append && i < initialXrefSize)
	//*  29   52:aload_0         
	//*  30   53:getfield        #168 <Field boolean append>
	//*  31   56:ifeq            69
	//*  32   59:iload_2         
	//*  33   60:aload_0         
	//*  34   61:getfield        #280 <Field int initialXrefSize>
	//*  35   64:icmpge          69
				return i;
	//   36   67:iload_2         
	//   37   68:ireturn         
			int l = myXref.get(i);
	//   38   69:aload_0         
	//   39   70:getfield        #79  <Field IntHashtable myXref>
	//   40   73:iload_2         
	//   41   74:invokevirtual   #1548 <Method int IntHashtable.get(int)>
	//   42   77:istore          4
			j = l;
	//   43   79:iload           4
	//   44   81:istore_3        
			if(l == 0)
	//*  45   82:iload           4
	//*  46   84:ifne            43
			{
				j = getIndirectReferenceNumber();
	//   47   87:aload_0         
	//   48   88:invokevirtual   #1551 <Method int getIndirectReferenceNumber()>
	//   49   91:istore_3        
				myXref.put(i, j);
	//   50   92:aload_0         
	//   51   93:getfield        #79  <Field IntHashtable myXref>
	//   52   96:iload_2         
	//   53   97:iload_3         
	//   54   98:invokevirtual   #381 <Method int IntHashtable.put(int, int)>
	//   55  101:pop             
				return j;
	//   56  102:iload_3         
	//   57  103:ireturn         
			}
		} else
		{
			return currentPdfReaderInstance.getNewObjectNumber(i, j);
	//   58  104:aload_0         
	//   59  105:getfield        #1555 <Field PdfReaderInstance currentPdfReaderInstance>
	//   60  108:iload_2         
	//   61  109:iload_3         
	//   62  110:invokevirtual   #1559 <Method int PdfReaderInstance.getNewObjectNumber(int, int)>
	//   63  113:ireturn         
		}
		return j;
	}

	PdfContentByte getOverContent(int i)
	{
		if(i < 1 || i > reader.getNumberOfPages())
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          16
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #160 <Field PdfReader reader>
	//*   6   10:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//*   7   13:icmple          18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		PageStamp pagestamp = getPageStamp(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1563 <Method PdfStamperImp$PageStamp getPageStamp(int)>
	//   13   23:astore_2        
		if(pagestamp.over == null)
	//*  14   24:aload_2         
	//*  15   25:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//*  16   28:ifnonnull       44
			pagestamp.over = new StampContent(this, pagestamp);
	//   17   31:aload_2         
	//   18   32:new             #957 <Class StampContent>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokespecial   #1566 <Method void StampContent(PdfStamperImp, PdfStamperImp$PageStamp)>
	//   23   41:putfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
		return ((PdfContentByte) (pagestamp.over));
	//   24   44:aload_2         
	//   25   45:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//   26   48:areturn         
	}

	public PdfIndirectReference getPageReference(int i)
	{
		PRIndirectReference prindirectreference = reader.getPageOrigRef(i);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1571 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//    4    8:astore_2        
		if(prindirectreference == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       28
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.page.number.1", i));
	//    7   13:new             #404 <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:ldc2            #1573 <String "invalid.page.number.1">
	//   10   20:iload_1         
	//   11   21:invokestatic    #1576 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   12   24:invokespecial   #407 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		else
			return ((PdfIndirectReference) (prindirectreference));
	//   14   28:aload_2         
	//   15   29:areturn         
	}

	PageStamp getPageStamp(int i)
	{
		PdfDictionary pdfdictionary = reader.getPageN(i);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//    4    8:astore          4
		PageStamp pagestamp1 = (PageStamp)pagesToContent.get(((Object) (pdfdictionary)));
	//    5   10:aload_0         
	//    6   11:getfield        #81  <Field HashMap pagesToContent>
	//    7   14:aload           4
	//    8   16:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #6   <Class PdfStamperImp$PageStamp>
	//   10   22:astore_3        
		PageStamp pagestamp = pagestamp1;
	//   11   23:aload_3         
	//   12   24:astore_2        
		if(pagestamp1 == null)
	//*  13   25:aload_3         
	//*  14   26:ifnonnull       55
		{
			pagestamp = new PageStamp(this, reader, pdfdictionary);
	//   15   29:new             #6   <Class PdfStamperImp$PageStamp>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #160 <Field PdfReader reader>
	//   20   38:aload           4
	//   21   40:invokespecial   #1579 <Method void PdfStamperImp$PageStamp(PdfStamperImp, PdfReader, PdfDictionary)>
	//   22   43:astore_2        
			pagesToContent.put(((Object) (pdfdictionary)), ((Object) (pagestamp)));
	//   23   44:aload_0         
	//   24   45:getfield        #81  <Field HashMap pagesToContent>
	//   25   48:aload           4
	//   26   50:aload_2         
	//   27   51:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   28   54:pop             
		}
		return pagestamp;
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	public Map getPdfLayers()
	{
		if(!originalLayersAreRead)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean originalLayersAreRead>
	//*   2    4:ifne            16
		{
			originalLayersAreRead = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #125 <Field boolean originalLayersAreRead>
			readOCProperties();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1583 <Method void readOCProperties()>
		}
		HashMap hashmap = new HashMap();
	//    8   16:new             #69  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #70  <Method void HashMap()>
	//   11   23:astore          4
		String s;
		String s1;
		PdfLayer pdflayer;
		for(Iterator iterator = documentOCG.iterator(); iterator.hasNext(); hashmap.put(((Object) (s1)), ((Object) (pdflayer))))
	//*  12   25:aload_0         
	//*  13   26:getfield        #1232 <Field LinkedHashSet documentOCG>
	//*  14   29:invokevirtual   #1584 <Method Iterator LinkedHashSet.iterator()>
	//*  15   32:astore          5
	//*  16   34:aload           5
	//*  17   36:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  18   41:ifeq            191
		{
			pdflayer = (PdfLayer)(PdfOCG)iterator.next();
	//   19   44:aload           5
	//   20   46:invokeinterface #351 <Method Object Iterator.next()>
	//   21   51:checkcast       #1586 <Class PdfOCG>
	//   22   54:checkcast       #314 <Class PdfLayer>
	//   23   57:astore          6
			int i;
			if(pdflayer.getTitle() == null)
	//*  24   59:aload           6
	//*  25   61:invokevirtual   #1589 <Method String PdfLayer.getTitle()>
	//*  26   64:ifnonnull       170
				s = pdflayer.getAsString(PdfName.NAME).toString();
	//   27   67:aload           6
	//   28   69:getstatic       #858 <Field PdfName PdfName.NAME>
	//   29   72:invokevirtual   #1590 <Method PdfString PdfLayer.getAsString(PdfName)>
	//   30   75:invokevirtual   #1591 <Method String PdfString.toString()>
	//   31   78:astore_2        
			else
	//*  32   79:aload_2         
	//*  33   80:astore_3        
	//*  34   81:aload           4
	//*  35   83:aload_2         
	//*  36   84:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*  37   87:ifeq            179
	//*  38   90:iconst_2        
	//*  39   91:istore_1        
	//*  40   92:new             #900 <Class StringBuilder>
	//*  41   95:dup             
	//*  42   96:invokespecial   #1592 <Method void StringBuilder()>
	//*  43   99:aload_2         
	//*  44  100:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  45  103:ldc2            #1594 <String "(">
	//*  46  106:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  47  109:iconst_2        
	//*  48  110:invokevirtual   #910 <Method StringBuilder StringBuilder.append(int)>
	//*  49  113:ldc2            #1596 <String ")">
	//*  50  116:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  51  119:invokevirtual   #902 <Method String StringBuilder.toString()>
	//*  52  122:astore_3        
	//*  53  123:aload           4
	//*  54  125:aload_3         
	//*  55  126:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*  56  129:ifeq            179
	//*  57  132:iload_1         
	//*  58  133:iconst_1        
	//*  59  134:iadd            
	//*  60  135:istore_1        
	//*  61  136:new             #900 <Class StringBuilder>
	//*  62  139:dup             
	//*  63  140:invokespecial   #1592 <Method void StringBuilder()>
	//*  64  143:aload_2         
	//*  65  144:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  66  147:ldc2            #1594 <String "(">
	//*  67  150:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  68  153:iload_1         
	//*  69  154:invokevirtual   #910 <Method StringBuilder StringBuilder.append(int)>
	//*  70  157:ldc2            #1596 <String ")">
	//*  71  160:invokevirtual   #907 <Method StringBuilder StringBuilder.append(String)>
	//*  72  163:invokevirtual   #902 <Method String StringBuilder.toString()>
	//*  73  166:astore_3        
	//*  74  167:goto            123
				s = pdflayer.getTitle();
	//   75  170:aload           6
	//   76  172:invokevirtual   #1589 <Method String PdfLayer.getTitle()>
	//   77  175:astore_2        
			s1 = s;
			if(!hashmap.containsKey(((Object) (s))))
				continue;
			i = 2;
			for(s1 = (new StringBuilder()).append(s).append("(").append(2).append(")").toString(); hashmap.containsKey(((Object) (s1))); s1 = (new StringBuilder()).append(s).append("(").append(i).append(")").toString())
				i++;

		}

	//   78  176:goto            79
	//   79  179:aload           4
	//   80  181:aload_3         
	//   81  182:aload           6
	//   82  184:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   83  187:pop             
	//*  84  188:goto            34
		return ((Map) (hashmap));
	//   85  191:aload           4
	//   86  193:areturn         
	}

	public PdfReader getPdfReader()
	{
		return reader;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:areturn         
	}

	RandomAccessFileOrArray getReaderFile(PdfReader pdfreader)
	{
		if(readers2intrefs.containsKey(((Object) (pdfreader))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field HashMap readers2intrefs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifeq            34
		{
			RandomAccessFileOrArray randomaccessfileorarray = (RandomAccessFileOrArray)readers2file.get(((Object) (pdfreader)));
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field HashMap readers2file>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #211 <Class RandomAccessFileOrArray>
	//   10   22:astore_2        
			if(randomaccessfileorarray != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          29
				return randomaccessfileorarray;
	//   13   27:aload_2         
	//   14   28:areturn         
			else
				return pdfreader.getSafeFile();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #164 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   17   33:areturn         
		}
		if(currentPdfReaderInstance == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #1555 <Field PdfReaderInstance currentPdfReaderInstance>
	//*  20   38:ifnonnull       46
			return file;
	//   21   41:aload_0         
	//   22   42:getfield        #166 <Field RandomAccessFileOrArray file>
	//   23   45:areturn         
		else
			return currentPdfReaderInstance.getReaderFile();
	//   24   46:aload_0         
	//   25   47:getfield        #1555 <Field PdfReaderInstance currentPdfReaderInstance>
	//   26   50:invokevirtual   #1602 <Method RandomAccessFileOrArray PdfReaderInstance.getReaderFile()>
	//   27   53:areturn         
	}

	PdfContentByte getUnderContent(int i)
	{
		if(i < 1 || i > reader.getNumberOfPages())
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          16
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #160 <Field PdfReader reader>
	//*   6   10:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//*   7   13:icmple          18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		PageStamp pagestamp = getPageStamp(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #1563 <Method PdfStamperImp$PageStamp getPageStamp(int)>
	//   13   23:astore_2        
		if(pagestamp.under == null)
	//*  14   24:aload_2         
	//*  15   25:getfield        #942 <Field StampContent PdfStamperImp$PageStamp.under>
	//*  16   28:ifnonnull       44
			pagestamp.under = new StampContent(this, pagestamp);
	//   17   31:aload_2         
	//   18   32:new             #957 <Class StampContent>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokespecial   #1566 <Method void StampContent(PdfStamperImp, PdfStamperImp$PageStamp)>
	//   23   41:putfield        #942 <Field StampContent PdfStamperImp$PageStamp.under>
		return ((PdfContentByte) (pagestamp.under));
	//   24   44:aload_2         
	//   25   45:getfield        #942 <Field StampContent PdfStamperImp$PageStamp.under>
	//   26   48:areturn         
	}

	void insertPage(int i, Rectangle rectangle)
	{
		PdfDictionary pdfdictionary;
		PRIndirectReference prindirectreference;
		rectangle = new Rectangle(rectangle);
	//    0    0:new             #505 <Class Rectangle>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #1606 <Method void Rectangle(Rectangle)>
	//    4    8:astore_2        
		int j = rectangle.getRotation() % 360;
	//    5    9:aload_2         
	//    6   10:invokevirtual   #1026 <Method int Rectangle.getRotation()>
	//    7   13:sipush          360
	//    8   16:irem            
	//    9   17:istore_3        
		pdfdictionary = new PdfDictionary(PdfName.PAGE);
	//   10   18:new             #386 <Class PdfDictionary>
	//   11   21:dup             
	//   12   22:getstatic       #774 <Field PdfName PdfName.PAGE>
	//   13   25:invokespecial   #843 <Method void PdfDictionary(PdfName)>
	//   14   28:astore          7
		pdfdictionary.put(PdfName.RESOURCES, ((PdfObject) (new PdfDictionary())));
	//   15   30:aload           7
	//   16   32:getstatic       #1015 <Field PdfName PdfName.RESOURCES>
	//   17   35:new             #386 <Class PdfDictionary>
	//   18   38:dup             
	//   19   39:invokespecial   #789 <Method void PdfDictionary()>
	//   20   42:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.ROTATE, ((PdfObject) (new PdfNumber(j))));
	//   21   45:aload           7
	//   22   47:getstatic       #1609 <Field PdfName PdfName.ROTATE>
	//   23   50:new             #448 <Class PdfNumber>
	//   24   53:dup             
	//   25   54:iload_3         
	//   26   55:invokespecial   #1193 <Method void PdfNumber(int)>
	//   27   58:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.MEDIABOX, ((PdfObject) (new PdfRectangle(rectangle, j))));
	//   28   61:aload           7
	//   29   63:getstatic       #1612 <Field PdfName PdfName.MEDIABOX>
	//   30   66:new             #576 <Class PdfRectangle>
	//   31   69:dup             
	//   32   70:aload_2         
	//   33   71:iload_3         
	//   34   72:invokespecial   #1615 <Method void PdfRectangle(Rectangle, int)>
	//   35   75:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		prindirectreference = reader.addPdfObject(((PdfObject) (pdfdictionary)));
	//   36   78:aload_0         
	//   37   79:getfield        #160 <Field PdfReader reader>
	//   38   82:aload           7
	//   39   84:invokevirtual   #1619 <Method PRIndirectReference PdfReader.addPdfObject(PdfObject)>
	//   40   87:astore          8
		if(i <= reader.getNumberOfPages()) goto _L2; else goto _L1
	//   41   89:iload_1         
	//   42   90:aload_0         
	//   43   91:getfield        #160 <Field PdfReader reader>
	//   44   94:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//   45   97:icmple          259
_L1:
		Object obj;
		rectangle = ((Rectangle) ((PRIndirectReference)reader.getPageNRelease(reader.getNumberOfPages()).get(PdfName.PARENT)));
	//   46  100:aload_0         
	//   47  101:getfield        #160 <Field PdfReader reader>
	//   48  104:aload_0         
	//   49  105:getfield        #160 <Field PdfReader reader>
	//   50  108:invokevirtual   #412 <Method int PdfReader.getNumberOfPages()>
	//   51  111:invokevirtual   #1622 <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//   52  114:getstatic       #1527 <Field PdfName PdfName.PARENT>
	//   53  117:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   54  120:checkcast       #366 <Class PRIndirectReference>
	//   55  123:astore_2        
		obj = ((Object) (new PRIndirectReference(reader, ((PRIndirectReference) (rectangle)).getNumber())));
	//   56  124:new             #366 <Class PRIndirectReference>
	//   57  127:dup             
	//   58  128:aload_0         
	//   59  129:getfield        #160 <Field PdfReader reader>
	//   60  132:aload_2         
	//   61  133:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//   62  136:invokespecial   #1625 <Method void PRIndirectReference(PdfReader, int)>
	//   63  139:astore          6
		rectangle = ((Rectangle) ((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))));
	//   64  141:aload           6
	//   65  143:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   66  146:checkcast       #386 <Class PdfDictionary>
	//   67  149:astore_2        
		PdfArray pdfarray = (PdfArray)PdfReader.getPdfObject(((PdfDictionary) (rectangle)).get(PdfName.KIDS), ((PdfObject) (rectangle)));
	//   68  150:aload_2         
	//   69  151:getstatic       #560 <Field PdfName PdfName.KIDS>
	//   70  154:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   71  157:aload_2         
	//   72  158:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   73  161:checkcast       #290 <Class PdfArray>
	//   74  164:astore          9
		pdfarray.add(((PdfObject) (prindirectreference)));
	//   75  166:aload           9
	//   76  168:aload           8
	//   77  170:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//   78  173:pop             
		markUsed(((PdfObject) (pdfarray)));
	//   79  174:aload_0         
	//   80  175:aload           9
	//   81  177:invokevirtual   #714 <Method void markUsed(PdfObject)>
		reader.pageRefs.insertPage(i, prindirectreference);
	//   82  180:aload_0         
	//   83  181:getfield        #160 <Field PdfReader reader>
	//   84  184:getfield        #1629 <Field PdfReader$PageRefs PdfReader.pageRefs>
	//   85  187:iload_1         
	//   86  188:aload           8
	//   87  190:invokevirtual   #1634 <Method void PdfReader$PageRefs.insertPage(int, PRIndirectReference)>
_L4:
		pdfdictionary.put(PdfName.PARENT, ((PdfObject) (obj)));
	//   88  193:aload           7
	//   89  195:getstatic       #1527 <Field PdfName PdfName.PARENT>
	//   90  198:aload           6
	//   91  200:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		for(; rectangle != null; rectangle = ((Rectangle) (((PdfDictionary) (rectangle)).getAsDict(PdfName.PARENT))))
	//*  92  203:aload_2         
	//*  93  204:ifnull          457
		{
			markUsed(((PdfObject) (rectangle)));
	//   94  207:aload_0         
	//   95  208:aload_2         
	//   96  209:invokevirtual   #714 <Method void markUsed(PdfObject)>
			obj = ((Object) ((PdfNumber)PdfReader.getPdfObjectRelease(((PdfDictionary) (rectangle)).get(PdfName.COUNT))));
	//   97  212:aload_2         
	//   98  213:getstatic       #1637 <Field PdfName PdfName.COUNT>
	//   99  216:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  100  219:invokestatic    #584 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//  101  222:checkcast       #448 <Class PdfNumber>
	//  102  225:astore          6
			((PdfDictionary) (rectangle)).put(PdfName.COUNT, ((PdfObject) (new PdfNumber(((PdfNumber) (obj)).intValue() + 1))));
	//  103  227:aload_2         
	//  104  228:getstatic       #1637 <Field PdfName PdfName.COUNT>
	//  105  231:new             #448 <Class PdfNumber>
	//  106  234:dup             
	//  107  235:aload           6
	//  108  237:invokevirtual   #451 <Method int PdfNumber.intValue()>
	//  109  240:iconst_1        
	//  110  241:iadd            
	//  111  242:invokespecial   #1193 <Method void PdfNumber(int)>
	//  112  245:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//  113  248:aload_2         
	//  114  249:getstatic       #1527 <Field PdfName PdfName.PARENT>
	//  115  252:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  116  255:astore_2        
		break; /* Loop/switch isn't completed */
	//  117  256:goto            203
_L2:
		int k = i;
	//  118  259:iload_1         
	//  119  260:istore_3        
		if(i < 1)
	//* 120  261:iload_1         
	//* 121  262:iconst_1        
	//* 122  263:icmpge          268
			k = 1;
	//  123  266:iconst_1        
	//  124  267:istore_3        
		rectangle = ((Rectangle) (reader.getPageN(k)));
	//  125  268:aload_0         
	//  126  269:getfield        #160 <Field PdfReader reader>
	//  127  272:iload_3         
	//  128  273:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//  129  276:astore_2        
		PRIndirectReference prindirectreference1 = reader.getPageOrigRef(k);
	//  130  277:aload_0         
	//  131  278:getfield        #160 <Field PdfReader reader>
	//  132  281:iload_3         
	//  133  282:invokevirtual   #1571 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//  134  285:astore          9
		reader.releasePage(k);
	//  135  287:aload_0         
	//  136  288:getfield        #160 <Field PdfReader reader>
	//  137  291:iload_3         
	//  138  292:invokevirtual   #1640 <Method void PdfReader.releasePage(int)>
		rectangle = ((Rectangle) ((PRIndirectReference)((PdfDictionary) (rectangle)).get(PdfName.PARENT)));
	//  139  295:aload_2         
	//  140  296:getstatic       #1527 <Field PdfName PdfName.PARENT>
	//  141  299:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  142  302:checkcast       #366 <Class PRIndirectReference>
	//  143  305:astore_2        
		obj = ((Object) (new PRIndirectReference(reader, ((PRIndirectReference) (rectangle)).getNumber())));
	//  144  306:new             #366 <Class PRIndirectReference>
	//  145  309:dup             
	//  146  310:aload_0         
	//  147  311:getfield        #160 <Field PdfReader reader>
	//  148  314:aload_2         
	//  149  315:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//  150  318:invokespecial   #1625 <Method void PRIndirectReference(PdfReader, int)>
	//  151  321:astore          6
		rectangle = ((Rectangle) ((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))));
	//  152  323:aload           6
	//  153  325:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  154  328:checkcast       #386 <Class PdfDictionary>
	//  155  331:astore_2        
		PdfArray pdfarray1 = (PdfArray)PdfReader.getPdfObject(((PdfDictionary) (rectangle)).get(PdfName.KIDS), ((PdfObject) (rectangle)));
	//  156  332:aload_2         
	//  157  333:getstatic       #560 <Field PdfName PdfName.KIDS>
	//  158  336:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//  159  339:aload_2         
	//  160  340:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//  161  343:checkcast       #290 <Class PdfArray>
	//  162  346:astore          10
		int l = pdfarray1.size();
	//  163  348:aload           10
	//  164  350:invokevirtual   #293 <Method int PdfArray.size()>
	//  165  353:istore          4
		int i1 = prindirectreference1.getNumber();
	//  166  355:aload           9
	//  167  357:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//  168  360:istore          5
		i = 0;
	//  169  362:iconst_0        
	//  170  363:istore_1        
label0:
		do
		{
label1:
			{
				if(i < l)
	//* 171  364:iload_1         
	//* 172  365:iload           4
	//* 173  367:icmpge          395
				{
					if(i1 != ((PRIndirectReference)pdfarray1.getPdfObject(i)).getNumber())
						break label1;
	//  174  370:iload           5
	//  175  372:aload           10
	//  176  374:iload_1         
	//  177  375:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//  178  378:checkcast       #366 <Class PRIndirectReference>
	//  179  381:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//  180  384:icmpne          423
					pdfarray1.add(i, ((PdfObject) (prindirectreference)));
	//  181  387:aload           10
	//  182  389:iload_1         
	//  183  390:aload           8
	//  184  392:invokevirtual   #1643 <Method void PdfArray.add(int, PdfObject)>
				}
				if(l == pdfarray1.size())
	//* 185  395:iload           4
	//* 186  397:aload           10
	//* 187  399:invokevirtual   #293 <Method int PdfArray.size()>
	//* 188  402:icmpne          430
					throw new RuntimeException(MessageLocalization.getComposedMessage("internal.inconsistence", new Object[0]));
	//  189  405:new             #650 <Class RuntimeException>
	//  190  408:dup             
	//  191  409:ldc2            #1645 <String "internal.inconsistence">
	//  192  412:iconst_0        
	//  193  413:anewarray       Object[]
	//  194  416:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  195  419:invokespecial   #653 <Method void RuntimeException(String)>
	//  196  422:athrow          
				break label0;
			}
			i++;
	//  197  423:iload_1         
	//  198  424:iconst_1        
	//  199  425:iadd            
	//  200  426:istore_1        
		} while(true);
	//  201  427:goto            364
		markUsed(((PdfObject) (pdfarray1)));
	//  202  430:aload_0         
	//  203  431:aload           10
	//  204  433:invokevirtual   #714 <Method void markUsed(PdfObject)>
		reader.pageRefs.insertPage(k, prindirectreference);
	//  205  436:aload_0         
	//  206  437:getfield        #160 <Field PdfReader reader>
	//  207  440:getfield        #1629 <Field PdfReader$PageRefs PdfReader.pageRefs>
	//  208  443:iload_3         
	//  209  444:aload           8
	//  210  446:invokevirtual   #1634 <Method void PdfReader$PageRefs.insertPage(int, PRIndirectReference)>
		correctAcroFieldPages(k);
	//  211  449:aload_0         
	//  212  450:iload_3         
	//  213  451:invokevirtual   #1647 <Method void correctAcroFieldPages(int)>
		if(true) goto _L4; else goto _L3
	//  214  454:goto            193
_L3:
	//  215  457:return          
	}

	boolean isAppend()
	{
		return append;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field boolean append>
	//    2    4:ireturn         
	}

	boolean isContentWritten()
	{
		return body.size() > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field PdfWriter$PdfBody body>
	//    2    4:invokevirtual   #1143 <Method int PdfWriter$PdfBody.size()>
	//    3    7:iconst_1        
	//    4    8:icmple          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	boolean isRotateContents()
	{
		return rotateContents;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean rotateContents>
	//    2    4:ireturn         
	}

	void makePackage(PdfCollection pdfcollection)
	{
		reader.getCatalog().put(PdfName.COLLECTION, ((PdfObject) (pdfcollection)));
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:getstatic       #1655 <Field PdfName PdfName.COLLECTION>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    6   14:return          
	}

	protected void markUsed(int i)
	{
		if(append)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field boolean append>
	//*   2    4:ifeq            17
			marked.put(i, 1);
	//    3    7:aload_0         
	//    4    8:getfield        #269 <Field IntHashtable marked>
	//    5   11:iload_1         
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #381 <Method int IntHashtable.put(int, int)>
	//    8   16:pop             
	//    9   17:return          
	}

	protected void markUsed(PdfObject pdfobject)
	{
		if(append && pdfobject != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field boolean append>
	//*   2    4:ifeq            42
	//*   3    7:aload_1         
	//*   4    8:ifnull          42
		{
			if(pdfobject.type() == 10)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #362 <Method int PdfObject.type()>
	//*   7   15:bipush          10
	//*   8   17:icmpne          43
				pdfobject = ((PdfObject) ((PRIndirectReference)pdfobject));
	//    9   20:aload_1         
	//   10   21:checkcast       #366 <Class PRIndirectReference>
	//   11   24:astore_1        
			else
	//*  12   25:aload_1         
	//*  13   26:ifnull          42
	//*  14   29:aload_0         
	//*  15   30:getfield        #269 <Field IntHashtable marked>
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #373 <Method int PRIndirectReference.getNumber()>
	//*  18   37:iconst_1        
	//*  19   38:invokevirtual   #381 <Method int IntHashtable.put(int, int)>
	//*  20   41:pop             
	//*  21   42:return          
				pdfobject = ((PdfObject) (pdfobject.getIndRef()));
	//   22   43:aload_1         
	//   23   44:invokevirtual   #1057 <Method PRIndirectReference PdfObject.getIndRef()>
	//   24   47:astore_1        
			if(pdfobject != null)
				marked.put(((PRIndirectReference) (pdfobject)).getNumber(), 1);
		}
	//*  25   48:goto            25
	}

	boolean partialFormFlattening(String s)
	{
		getAcroFields();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #672 <Method AcroFields getAcroFields()>
	//    2    4:pop             
		if(acroFields.getXfa().isXfaPresent())
	//*   3    5:aload_0         
	//*   4    6:getfield        #1174 <Field AcroFields acroFields>
	//*   5    9:invokevirtual   #1180 <Method XfaForm AcroFields.getXfa()>
	//*   6   12:invokevirtual   #1659 <Method boolean XfaForm.isXfaPresent()>
	//*   7   15:ifeq            36
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("partial.form.flattening.is.not.supported.with.xfa.forms", new Object[0]));
	//    8   18:new             #1539 <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc2            #1661 <String "partial.form.flattening.is.not.supported.with.xfa.forms">
	//   11   25:iconst_0        
	//   12   26:anewarray       Object[]
	//   13   29:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   32:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//   15   35:athrow          
		if(!acroFields.getFields().containsKey(((Object) (s))))
	//*  16   36:aload_0         
	//*  17   37:getfield        #1174 <Field AcroFields acroFields>
	//*  18   40:invokevirtual   #1429 <Method Map AcroFields.getFields()>
	//*  19   43:aload_1         
	//*  20   44:invokeinterface #1662 <Method boolean Map.containsKey(Object)>
	//*  21   49:ifne            54
		{
			return false;
	//   22   52:iconst_0        
	//   23   53:ireturn         
		} else
		{
			partialFlattening.add(((Object) (s)));
	//   24   54:aload_0         
	//   25   55:getfield        #98  <Field HashSet partialFlattening>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #1481 <Method boolean HashSet.add(Object)>
	//   28   62:pop             
			return true;
	//   29   63:iconst_1        
	//   30   64:ireturn         
		}
	}

	protected void readColorProfile()
	{
		PdfArray pdfarray = reader.getCatalog().getAsArray(PdfName.OUTPUTINTENTS);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:getstatic       #1665 <Field PdfName PdfName.OUTPUTINTENTS>
	//    4   10:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    5   13:astore          4
		if(pdfarray == null || ((PdfArray)pdfarray).size() <= 0) goto _L2; else goto _L1
	//    6   15:aload           4
	//    7   17:ifnull          98
	//    8   20:aload           4
	//    9   22:checkcast       #290 <Class PdfArray>
	//   10   25:invokevirtual   #293 <Method int PdfArray.size()>
	//   11   28:ifle            98
_L1:
		int i;
		Object obj;
		obj = null;
	//   12   31:aconst_null     
	//   13   32:astore_2        
		i = 0;
	//   14   33:iconst_0        
	//   15   34:istore_1        
_L9:
		Object obj1 = obj;
	//   16   35:aload_2         
	//   17   36:astore_3        
		if(i >= ((PdfArray)pdfarray).size()) goto _L4; else goto _L3
	//   18   37:iload_1         
	//   19   38:aload           4
	//   20   40:checkcast       #290 <Class PdfArray>
	//   21   43:invokevirtual   #293 <Method int PdfArray.size()>
	//   22   46:icmpge          77
_L3:
		obj1 = ((Object) (((PdfArray)pdfarray).getAsDict(i)));
	//   23   49:aload           4
	//   24   51:checkcast       #290 <Class PdfArray>
	//   25   54:iload_1         
	//   26   55:invokevirtual   #563 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   27   58:astore_3        
		if(obj1 == null) goto _L6; else goto _L5
	//   28   59:aload_3         
	//   29   60:ifnull          99
_L5:
		obj1 = ((Object) (((PdfDictionary) (obj1)).getAsStream(PdfName.DESTOUTPUTPROFILE)));
	//   30   63:aload_3         
	//   31   64:getstatic       #1668 <Field PdfName PdfName.DESTOUTPUTPROFILE>
	//   32   67:invokevirtual   #461 <Method PdfStream PdfDictionary.getAsStream(PdfName)>
	//   33   70:astore_3        
		obj = obj1;
	//   34   71:aload_3         
	//   35   72:astore_2        
		if(obj1 == null) goto _L6; else goto _L4
	//   36   73:aload_3         
	//   37   74:ifnull          99
_L4:
		if(!(obj1 instanceof PRStream)) goto _L2; else goto _L7
	//   38   77:aload_3         
	//   39   78:instanceof      #1336 <Class PRStream>
	//   40   81:ifeq            98
_L7:
		colorProfile = ICC_Profile.getInstance(PdfReader.getStreamBytes((PRStream)obj1));
	//   41   84:aload_0         
	//   42   85:aload_3         
	//   43   86:checkcast       #1336 <Class PRStream>
	//   44   89:invokestatic    #1671 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   45   92:invokestatic    #1676 <Method ICC_Profile ICC_Profile.getInstance(byte[])>
	//   46   95:putfield        #1680 <Field ICC_Profile colorProfile>
_L2:
		return;
	//   47   98:return          
_L6:
		i++;
	//   48   99:iload_1         
	//   49  100:iconst_1        
	//   50  101:iadd            
	//   51  102:istore_1        
		if(true) goto _L9; else goto _L8
	//   52  103:goto            35
_L8:
		IOException ioexception;
		ioexception;
	//   53  106:astore_2        
		throw new ExceptionConverter(((Exception) (ioexception)));
	//   54  107:new             #746 <Class ExceptionConverter>
	//   55  110:dup             
	//   56  111:aload_2         
	//   57  112:invokespecial   #749 <Method void ExceptionConverter(Exception)>
	//   58  115:athrow          
	}

	protected void readOCProperties()
	{
		PdfDictionary pdfdictionary;
		if(documentOCG.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #1232 <Field LinkedHashSet documentOCG>
	//*   2    4:invokevirtual   #1235 <Method boolean LinkedHashSet.isEmpty()>
	//*   3    7:ifne            11
	//*   4   10:return          
	//*   5   11:aload_0         
	//*   6   12:getfield        #160 <Field PdfReader reader>
	//*   7   15:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//*   8   18:getstatic       #1241 <Field PdfName PdfName.OCPROPERTIES>
	//*   9   21:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  10   24:astore_2        
			if((pdfdictionary = reader.getCatalog().getAsDict(PdfName.OCPROPERTIES)) != null)
	//*  11   25:aload_2         
	//*  12   26:ifnull          10
			{
				Object obj = ((Object) (pdfdictionary.getAsArray(PdfName.OCGS)));
	//   13   29:aload_2         
	//   14   30:getstatic       #1288 <Field PdfName PdfName.OCGS>
	//   15   33:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   16   36:astore_3        
				HashMap hashmap = new HashMap();
	//   17   37:new             #69  <Class HashMap>
	//   18   40:dup             
	//   19   41:invokespecial   #70  <Method void HashMap()>
	//   20   44:astore_1        
				PdfIndirectReference pdfindirectreference;
				PdfLayer pdflayer;
				for(obj = ((Object) (((PdfArray) (obj)).listIterator())); ((Iterator) (obj)).hasNext(); hashmap.put(((Object) (pdfindirectreference.toString())), ((Object) (pdflayer))))
	//*  21   45:aload_3         
	//*  22   46:invokevirtual   #342 <Method java.util.ListIterator PdfArray.listIterator()>
	//*  23   49:astore_3        
	//*  24   50:aload_3         
	//*  25   51:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  26   56:ifeq            121
				{
					pdfindirectreference = (PdfIndirectReference)((Iterator) (obj)).next();
	//   27   59:aload_3         
	//   28   60:invokeinterface #351 <Method Object Iterator.next()>
	//   29   65:checkcast       #429 <Class PdfIndirectReference>
	//   30   68:astore          4
					pdflayer = new PdfLayer(((String) (null)));
	//   31   70:new             #314 <Class PdfLayer>
	//   32   73:dup             
	//   33   74:aconst_null     
	//   34   75:invokespecial   #337 <Method void PdfLayer(String)>
	//   35   78:astore          5
					pdflayer.setRef(pdfindirectreference);
	//   36   80:aload           5
	//   37   82:aload           4
	//   38   84:invokevirtual   #1683 <Method void PdfLayer.setRef(PdfIndirectReference)>
					pdflayer.setOnPanel(false);
	//   39   87:aload           5
	//   40   89:iconst_0        
	//   41   90:invokevirtual   #317 <Method void PdfLayer.setOnPanel(boolean)>
					pdflayer.merge((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (pdfindirectreference))));
	//   42   93:aload           5
	//   43   95:aload           4
	//   44   97:invokestatic    #384 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   45  100:checkcast       #386 <Class PdfDictionary>
	//   46  103:invokevirtual   #1684 <Method void PdfLayer.merge(PdfDictionary)>
				}

	//   47  106:aload_1         
	//   48  107:aload           4
	//   49  109:invokevirtual   #1685 <Method String PdfIndirectReference.toString()>
	//   50  112:aload           5
	//   51  114:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   52  117:pop             
	//*  53  118:goto            50
				pdfdictionary = pdfdictionary.getAsDict(PdfName.D);
	//   54  121:aload_2         
	//   55  122:getstatic       #1293 <Field PdfName PdfName.D>
	//   56  125:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   57  128:astore_2        
				obj = ((Object) (pdfdictionary.getAsArray(PdfName.OFF)));
	//   58  129:aload_2         
	//   59  130:getstatic       #1303 <Field PdfName PdfName.OFF>
	//   60  133:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   61  136:astore_3        
				if(obj != null)
	//*  62  137:aload_3         
	//*  63  138:ifnull          181
					for(obj = ((Object) (((PdfArray) (obj)).listIterator())); ((Iterator) (obj)).hasNext(); ((PdfLayer)hashmap.get(((Object) (((PdfIndirectReference)((Iterator) (obj)).next()).toString())))).setOn(false));
	//   64  141:aload_3         
	//   65  142:invokevirtual   #342 <Method java.util.ListIterator PdfArray.listIterator()>
	//   66  145:astore_3        
	//   67  146:aload_3         
	//   68  147:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//   69  152:ifeq            181
	//   70  155:aload_1         
	//   71  156:aload_3         
	//   72  157:invokeinterface #351 <Method Object Iterator.next()>
	//   73  162:checkcast       #429 <Class PdfIndirectReference>
	//   74  165:invokevirtual   #1685 <Method String PdfIndirectReference.toString()>
	//   75  168:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//   76  171:checkcast       #314 <Class PdfLayer>
	//   77  174:iconst_0        
	//   78  175:invokevirtual   #1688 <Method void PdfLayer.setOn(boolean)>
	//*  79  178:goto            146
				obj = ((Object) (pdfdictionary.getAsArray(PdfName.ORDER)));
	//   80  181:aload_2         
	//   81  182:getstatic       #1296 <Field PdfName PdfName.ORDER>
	//   82  185:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   83  188:astore_3        
				if(obj != null)
	//*  84  189:aload_3         
	//*  85  190:ifnull          200
					addOrder(((PdfLayer) (null)), ((PdfArray) (obj)), ((Map) (hashmap)));
	//   86  193:aload_0         
	//   87  194:aconst_null     
	//   88  195:aload_3         
	//   89  196:aload_1         
	//   90  197:invokespecial   #330 <Method void addOrder(PdfLayer, PdfArray, Map)>
				documentOCG.addAll(hashmap.values());
	//   91  200:aload_0         
	//   92  201:getfield        #1232 <Field LinkedHashSet documentOCG>
	//   93  204:aload_1         
	//   94  205:invokevirtual   #925 <Method Collection HashMap.values()>
	//   95  208:invokevirtual   #1689 <Method boolean LinkedHashSet.addAll(Collection)>
	//   96  211:pop             
				OCGRadioGroup = pdfdictionary.getAsArray(PdfName.RBGROUPS);
	//   97  212:aload_0         
	//   98  213:aload_2         
	//   99  214:getstatic       #1300 <Field PdfName PdfName.RBGROUPS>
	//  100  217:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  101  220:putfield        #1693 <Field PdfArray OCGRadioGroup>
				if(OCGRadioGroup == null)
	//* 102  223:aload_0         
	//* 103  224:getfield        #1693 <Field PdfArray OCGRadioGroup>
	//* 104  227:ifnonnull       241
					OCGRadioGroup = new PdfArray();
	//  105  230:aload_0         
	//  106  231:new             #290 <Class PdfArray>
	//  107  234:dup             
	//  108  235:invokespecial   #338 <Method void PdfArray()>
	//  109  238:putfield        #1693 <Field PdfArray OCGRadioGroup>
				OCGLocked = pdfdictionary.getAsArray(PdfName.LOCKED);
	//  110  241:aload_0         
	//  111  242:aload_2         
	//  112  243:getstatic       #1696 <Field PdfName PdfName.LOCKED>
	//  113  246:invokevirtual   #424 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  114  249:putfield        #1699 <Field PdfArray OCGLocked>
				if(OCGLocked == null)
	//* 115  252:aload_0         
	//* 116  253:getfield        #1699 <Field PdfArray OCGLocked>
	//* 117  256:ifnonnull       10
				{
					OCGLocked = new PdfArray();
	//  118  259:aload_0         
	//  119  260:new             #290 <Class PdfArray>
	//  120  263:dup             
	//  121  264:invokespecial   #338 <Method void PdfArray()>
	//  122  267:putfield        #1699 <Field PdfArray OCGLocked>
					return;
	//  123  270:return          
				}
			}
	}

	void registerLayer(PdfOCG pdfocg)
	{
		if(!originalLayersAreRead)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean originalLayersAreRead>
	//*   2    4:ifne            16
		{
			originalLayersAreRead = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #125 <Field boolean originalLayersAreRead>
			readOCProperties();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1583 <Method void readOCProperties()>
		}
		super.registerLayer(pdfocg);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #1700 <Method void PdfWriter.registerLayer(PdfOCG)>
	//   11   21:return          
	}

	public void registerReader(PdfReader pdfreader, boolean flag)
		throws IOException
	{
		if(!readers2intrefs.containsKey(((Object) (pdfreader))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field HashMap readers2intrefs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifeq            12
	//*   5   11:return          
		{
			readers2intrefs.put(((Object) (pdfreader)), ((Object) (new IntHashtable())));
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field HashMap readers2intrefs>
	//    8   16:aload_1         
	//    9   17:new             #76  <Class IntHashtable>
	//   10   20:dup             
	//   11   21:invokespecial   #77  <Method void IntHashtable()>
	//   12   24:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
			if(flag)
	//*  14   28:iload_2         
	//*  15   29:ifeq            11
			{
				RandomAccessFileOrArray randomaccessfileorarray = pdfreader.getSafeFile();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #164 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   18   36:astore_3        
				readers2file.put(((Object) (pdfreader)), ((Object) (randomaccessfileorarray)));
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field HashMap readers2file>
	//   21   41:aload_1         
	//   22   42:aload_3         
	//   23   43:invokevirtual   #780 <Method Object HashMap.put(Object, Object)>
	//   24   46:pop             
				randomaccessfileorarray.reOpen();
	//   25   47:aload_3         
	//   26   48:invokevirtual   #1703 <Method void RandomAccessFileOrArray.reOpen()>
				return;
	//   27   51:return          
			}
		}
	}

	void replacePage(PdfReader pdfreader, int i, int j)
	{
		PdfDictionary pdfdictionary = reader.getPageN(j);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//    4    8:astore          4
		if(pagesToContent.containsKey(((Object) (pdfdictionary))))
	//*   5   10:aload_0         
	//*   6   11:getfield        #81  <Field HashMap pagesToContent>
	//*   7   14:aload           4
	//*   8   16:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*   9   19:ifeq            40
		{
			throw new IllegalStateException(MessageLocalization.getComposedMessage("this.page.cannot.be.replaced.new.content.was.already.added", new Object[0]));
	//   10   22:new             #1707 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc2            #1709 <String "this.page.cannot.be.replaced.new.content.was.already.added">
	//   13   29:iconst_0        
	//   14   30:anewarray       Object[]
	//   15   33:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   36:invokespecial   #1710 <Method void IllegalStateException(String)>
	//   17   39:athrow          
		} else
		{
			PdfImportedPage pdfimportedpage = getImportedPage(pdfreader, i);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:iload_2         
	//   21   43:invokevirtual   #1714 <Method PdfImportedPage getImportedPage(PdfReader, int)>
	//   22   46:astore          5
			PdfDictionary pdfdictionary1 = reader.getPageNRelease(j);
	//   23   48:aload_0         
	//   24   49:getfield        #160 <Field PdfReader reader>
	//   25   52:iload_3         
	//   26   53:invokevirtual   #1622 <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//   27   56:astore          6
			pdfdictionary1.remove(PdfName.RESOURCES);
	//   28   58:aload           6
	//   29   60:getstatic       #1015 <Field PdfName PdfName.RESOURCES>
	//   30   63:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
			pdfdictionary1.remove(PdfName.CONTENTS);
	//   31   66:aload           6
	//   32   68:getstatic       #935 <Field PdfName PdfName.CONTENTS>
	//   33   71:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
			moveRectangle(pdfdictionary1, pdfreader, i, PdfName.MEDIABOX, "media");
	//   34   74:aload           6
	//   35   76:aload_1         
	//   36   77:iload_2         
	//   37   78:getstatic       #1612 <Field PdfName PdfName.MEDIABOX>
	//   38   81:ldc2            #1716 <String "media">
	//   39   84:invokestatic    #1718 <Method void moveRectangle(PdfDictionary, PdfReader, int, PdfName, String)>
			moveRectangle(pdfdictionary1, pdfreader, i, PdfName.CROPBOX, "crop");
	//   40   87:aload           6
	//   41   89:aload_1         
	//   42   90:iload_2         
	//   43   91:getstatic       #1721 <Field PdfName PdfName.CROPBOX>
	//   44   94:ldc2            #1723 <String "crop">
	//   45   97:invokestatic    #1718 <Method void moveRectangle(PdfDictionary, PdfReader, int, PdfName, String)>
			moveRectangle(pdfdictionary1, pdfreader, i, PdfName.TRIMBOX, "trim");
	//   46  100:aload           6
	//   47  102:aload_1         
	//   48  103:iload_2         
	//   49  104:getstatic       #1726 <Field PdfName PdfName.TRIMBOX>
	//   50  107:ldc2            #1728 <String "trim">
	//   51  110:invokestatic    #1718 <Method void moveRectangle(PdfDictionary, PdfReader, int, PdfName, String)>
			moveRectangle(pdfdictionary1, pdfreader, i, PdfName.ARTBOX, "art");
	//   52  113:aload           6
	//   53  115:aload_1         
	//   54  116:iload_2         
	//   55  117:getstatic       #1731 <Field PdfName PdfName.ARTBOX>
	//   56  120:ldc2            #1733 <String "art">
	//   57  123:invokestatic    #1718 <Method void moveRectangle(PdfDictionary, PdfReader, int, PdfName, String)>
			moveRectangle(pdfdictionary1, pdfreader, i, PdfName.BLEEDBOX, "bleed");
	//   58  126:aload           6
	//   59  128:aload_1         
	//   60  129:iload_2         
	//   61  130:getstatic       #1736 <Field PdfName PdfName.BLEEDBOX>
	//   62  133:ldc2            #1738 <String "bleed">
	//   63  136:invokestatic    #1718 <Method void moveRectangle(PdfDictionary, PdfReader, int, PdfName, String)>
			pdfdictionary1.put(PdfName.ROTATE, ((PdfObject) (new PdfNumber(pdfreader.getPageRotation(i)))));
	//   64  139:aload           6
	//   65  141:getstatic       #1609 <Field PdfName PdfName.ROTATE>
	//   66  144:new             #448 <Class PdfNumber>
	//   67  147:dup             
	//   68  148:aload_1         
	//   69  149:iload_2         
	//   70  150:invokevirtual   #1740 <Method int PdfReader.getPageRotation(int)>
	//   71  153:invokespecial   #1193 <Method void PdfNumber(int)>
	//   72  156:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			getOverContent(j).addTemplate(((PdfTemplate) (pdfimportedpage)), 0.0F, 0.0F);
	//   73  159:aload_0         
	//   74  160:iload_3         
	//   75  161:invokevirtual   #480 <Method PdfContentByte getOverContent(int)>
	//   76  164:aload           5
	//   77  166:fconst_0        
	//   78  167:fconst_0        
	//   79  168:invokevirtual   #1500 <Method void PdfContentByte.addTemplate(PdfTemplate, float, float)>
			pdfreader = ((PdfReader) ((PageStamp)pagesToContent.get(((Object) (pdfdictionary)))));
	//   80  171:aload_0         
	//   81  172:getfield        #81  <Field HashMap pagesToContent>
	//   82  175:aload           4
	//   83  177:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//   84  180:checkcast       #6   <Class PdfStamperImp$PageStamp>
	//   85  183:astore_1        
			pdfreader.replacePoint = ((PageStamp) (pdfreader)).over.getInternalBuffer().size();
	//   86  184:aload_1         
	//   87  185:aload_1         
	//   88  186:getfield        #970 <Field StampContent PdfStamperImp$PageStamp.over>
	//   89  189:invokevirtual   #961 <Method ByteBuffer StampContent.getInternalBuffer()>
	//   90  192:invokevirtual   #1002 <Method int ByteBuffer.size()>
	//   91  195:putfield        #998 <Field int PdfStamperImp$PageStamp.replacePoint>
			return;
	//   92  198:return          
		}
	}

	public void setAdditionalAction(PdfName pdfname, PdfAction pdfaction)
		throws PdfException
	{
		if(!pdfname.equals(((Object) (DOCUMENT_CLOSE))) && !pdfname.equals(((Object) (WILL_SAVE))) && !pdfname.equals(((Object) (DID_SAVE))) && !pdfname.equals(((Object) (WILL_PRINT))) && !pdfname.equals(((Object) (DID_PRINT))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #1747 <Field PdfName DOCUMENT_CLOSE>
	//*   2    4:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifne            75
	//*   4   10:aload_1         
	//*   5   11:getstatic       #1750 <Field PdfName WILL_SAVE>
	//*   6   14:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*   7   17:ifne            75
	//*   8   20:aload_1         
	//*   9   21:getstatic       #1753 <Field PdfName DID_SAVE>
	//*  10   24:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*  11   27:ifne            75
	//*  12   30:aload_1         
	//*  13   31:getstatic       #1756 <Field PdfName WILL_PRINT>
	//*  14   34:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*  15   37:ifne            75
	//*  16   40:aload_1         
	//*  17   41:getstatic       #1759 <Field PdfName DID_PRINT>
	//*  18   44:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*  19   47:ifne            75
			throw new PdfException(MessageLocalization.getComposedMessage("invalid.additional.action.type.1", new Object[] {
				pdfname.toString()
			}));
	//   20   50:new             #1744 <Class PdfException>
	//   21   53:dup             
	//   22   54:ldc2            #1761 <String "invalid.additional.action.type.1">
	//   23   57:iconst_1        
	//   24   58:anewarray       Object[]
	//   25   61:dup             
	//   26   62:iconst_0        
	//   27   63:aload_1         
	//   28   64:invokevirtual   #1762 <Method String PdfName.toString()>
	//   29   67:aastore         
	//   30   68:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   71:invokespecial   #1763 <Method void PdfException(String)>
	//   32   74:athrow          
		PdfDictionary pdfdictionary1 = reader.getCatalog().getAsDict(PdfName.AA);
	//   33   75:aload_0         
	//   34   76:getfield        #160 <Field PdfReader reader>
	//   35   79:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   36   82:getstatic       #1766 <Field PdfName PdfName.AA>
	//   37   85:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   38   88:astore          4
		PdfDictionary pdfdictionary = pdfdictionary1;
	//   39   90:aload           4
	//   40   92:astore_3        
		if(pdfdictionary1 == null)
	//*  41   93:aload           4
	//*  42   95:ifnonnull       125
		{
			if(pdfaction == null)
	//*  43   98:aload_2         
	//*  44   99:ifnonnull       103
				return;
	//   45  102:return          
			pdfdictionary = new PdfDictionary();
	//   46  103:new             #386 <Class PdfDictionary>
	//   47  106:dup             
	//   48  107:invokespecial   #789 <Method void PdfDictionary()>
	//   49  110:astore_3        
			reader.getCatalog().put(PdfName.AA, ((PdfObject) (pdfdictionary)));
	//   50  111:aload_0         
	//   51  112:getfield        #160 <Field PdfReader reader>
	//   52  115:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   53  118:getstatic       #1766 <Field PdfName PdfName.AA>
	//   54  121:aload_3         
	//   55  122:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		markUsed(((PdfObject) (pdfdictionary)));
	//   56  125:aload_0         
	//   57  126:aload_3         
	//   58  127:invokevirtual   #714 <Method void markUsed(PdfObject)>
		if(pdfaction == null)
	//*  59  130:aload_2         
	//*  60  131:ifnonnull       140
		{
			pdfdictionary.remove(pdfname);
	//   61  134:aload_3         
	//   62  135:aload_1         
	//   63  136:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
			return;
	//   64  139:return          
		} else
		{
			pdfdictionary.put(pdfname, ((PdfObject) (pdfaction)));
	//   65  140:aload_3         
	//   66  141:aload_1         
	//   67  142:aload_2         
	//   68  143:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   69  146:return          
		}
	}

	public void setDuration(int i)
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.setpageaction.pdfname.actiontype.pdfaction.action.int.page", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1769 <String "use.setpageaction.pdfname.actiontype.pdfaction.action.int.page">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	void setDuration(int i, int j)
	{
		PdfDictionary pdfdictionary = reader.getPageN(j);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//    4    8:astore_3        
		if(i < 0)
	//*   5    9:iload_1         
	//*   6   10:ifge            26
			pdfdictionary.remove(PdfName.DUR);
	//    7   13:aload_3         
	//    8   14:getstatic       #1772 <Field PdfName PdfName.DUR>
	//    9   17:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		else
	//*  10   20:aload_0         
	//*  11   21:aload_3         
	//*  12   22:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//*  13   25:return          
			pdfdictionary.put(PdfName.DUR, ((PdfObject) (new PdfNumber(i))));
	//   14   26:aload_3         
	//   15   27:getstatic       #1772 <Field PdfName PdfName.DUR>
	//   16   30:new             #448 <Class PdfNumber>
	//   17   33:dup             
	//   18   34:iload_1         
	//   19   35:invokespecial   #1193 <Method void PdfNumber(int)>
	//   20   38:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (pdfdictionary)));
	//*  21   41:goto            20
	}

	public void setFlatAnnotations(boolean flag)
	{
		flatannotations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field boolean flatannotations>
	//    3    5:return          
	}

	void setFormFlattening(boolean flag)
	{
		flat = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean flat>
	//    3    5:return          
	}

	void setFreeTextFlattening(boolean flag)
	{
		flatFreeText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean flatFreeText>
	//    3    5:return          
	}

	protected void setJavaScript()
		throws IOException
	{
		HashMap hashmap = pdf.getDocumentLevelJS();
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1778 <Method HashMap PdfDocument.getDocumentLevelJS()>
	//    3    7:astore_3        
		if(hashmap.isEmpty())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #879 <Method boolean HashMap.isEmpty()>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		PdfDictionary pdfdictionary2 = reader.getCatalog();
	//    8   16:aload_0         
	//    9   17:getfield        #160 <Field PdfReader reader>
	//   10   20:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   11   23:astore          4
		PdfDictionary pdfdictionary1 = (PdfDictionary)PdfReader.getPdfObject(pdfdictionary2.get(PdfName.NAMES), ((PdfObject) (pdfdictionary2)));
	//   12   25:aload           4
	//   13   27:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   14   30:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   15   33:aload           4
	//   16   35:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   17   38:checkcast       #386 <Class PdfDictionary>
	//   18   41:astore_2        
		PdfDictionary pdfdictionary = pdfdictionary1;
	//   19   42:aload_2         
	//   20   43:astore_1        
		if(pdfdictionary1 == null)
	//*  21   44:aload_2         
	//*  22   45:ifnonnull       71
		{
			pdfdictionary = new PdfDictionary();
	//   23   48:new             #386 <Class PdfDictionary>
	//   24   51:dup             
	//   25   52:invokespecial   #789 <Method void PdfDictionary()>
	//   26   55:astore_1        
			pdfdictionary2.put(PdfName.NAMES, ((PdfObject) (pdfdictionary)));
	//   27   56:aload           4
	//   28   58:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   29   61:aload_1         
	//   30   62:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (pdfdictionary2)));
	//   31   65:aload_0         
	//   32   66:aload           4
	//   33   68:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		markUsed(((PdfObject) (pdfdictionary)));
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #714 <Method void markUsed(PdfObject)>
		pdfdictionary1 = PdfNameTree.writeTree(hashmap, ((PdfWriter) (this)));
	//   37   76:aload_3         
	//   38   77:aload_0         
	//   39   78:invokestatic    #917 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   40   81:astore_2        
		pdfdictionary.put(PdfName.JAVASCRIPT, ((PdfObject) (addToBody(((PdfObject) (pdfdictionary1))).getIndirectReference())));
	//   41   82:aload_1         
	//   42   83:getstatic       #1781 <Field PdfName PdfName.JAVASCRIPT>
	//   43   86:aload_0         
	//   44   87:aload_2         
	//   45   88:invokevirtual   #864 <Method PdfIndirectObject addToBody(PdfObject)>
	//   46   91:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   47   94:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   48   97:return          
	}

	public void setOpenAction(PdfAction pdfaction)
	{
		openAction = pdfaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1212 <Field PdfAction openAction>
	//    3    5:return          
	}

	public void setOpenAction(String s)
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("open.actions.by.name.are.not.supported", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1785 <String "open.actions.by.name.are.not.supported">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	protected void setOutlines()
		throws IOException
	{
		if(newBookmarks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1789 <Field List newBookmarks>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			deleteOutlines();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1791 <Method void deleteOutlines()>
			if(!newBookmarks.isEmpty())
	//*   6   12:aload_0         
	//*   7   13:getfield        #1789 <Field List newBookmarks>
	//*   8   16:invokeinterface #1792 <Method boolean List.isEmpty()>
	//*   9   21:ifne            7
			{
				PdfDictionary pdfdictionary = reader.getCatalog();
	//   10   24:aload_0         
	//   11   25:getfield        #160 <Field PdfReader reader>
	//   12   28:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   13   31:astore_2        
				boolean flag;
				if(pdfdictionary.get(PdfName.DESTS) != null)
	//*  14   32:aload_2         
	//*  15   33:getstatic       #1795 <Field PdfName PdfName.DESTS>
	//*  16   36:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  17   39:ifnull          56
					flag = true;
	//   18   42:iconst_1        
	//   19   43:istore_1        
				else
	//*  20   44:aload_0         
	//*  21   45:aload_2         
	//*  22   46:iload_1         
	//*  23   47:invokevirtual   #1799 <Method void writeOutlines(PdfDictionary, boolean)>
	//*  24   50:aload_0         
	//*  25   51:aload_2         
	//*  26   52:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//*  27   55:return          
					flag = false;
	//   28   56:iconst_0        
	//   29   57:istore_1        
				writeOutlines(pdfdictionary, flag);
				markUsed(((PdfObject) (pdfdictionary)));
				return;
			}
		}
	//*  30   58:goto            44
	}

	public void setPageAction(PdfName pdfname, PdfAction pdfaction)
		throws PdfException
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.setpageaction.pdfname.actiontype.pdfaction.action.int.page", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1769 <String "use.setpageaction.pdfname.actiontype.pdfaction.action.int.page">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	void setPageAction(PdfName pdfname, PdfAction pdfaction, int i)
		throws PdfException
	{
		if(!pdfname.equals(((Object) (PAGE_OPEN))) && !pdfname.equals(((Object) (PAGE_CLOSE))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #1804 <Field PdfName PAGE_OPEN>
	//*   2    4:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifne            45
	//*   4   10:aload_1         
	//*   5   11:getstatic       #1807 <Field PdfName PAGE_CLOSE>
	//*   6   14:invokevirtual   #1528 <Method boolean PdfName.equals(Object)>
	//*   7   17:ifne            45
			throw new PdfException(MessageLocalization.getComposedMessage("invalid.page.additional.action.type.1", new Object[] {
				pdfname.toString()
			}));
	//    8   20:new             #1744 <Class PdfException>
	//    9   23:dup             
	//   10   24:ldc2            #1809 <String "invalid.page.additional.action.type.1">
	//   11   27:iconst_1        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:aload_1         
	//   16   34:invokevirtual   #1762 <Method String PdfName.toString()>
	//   17   37:aastore         
	//   18   38:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   41:invokespecial   #1763 <Method void PdfException(String)>
	//   20   44:athrow          
		PdfDictionary pdfdictionary2 = reader.getPageN(i);
	//   21   45:aload_0         
	//   22   46:getfield        #160 <Field PdfReader reader>
	//   23   49:iload_3         
	//   24   50:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//   25   53:astore          6
		PdfDictionary pdfdictionary1 = (PdfDictionary)PdfReader.getPdfObject(pdfdictionary2.get(PdfName.AA), ((PdfObject) (pdfdictionary2)));
	//   26   55:aload           6
	//   27   57:getstatic       #1766 <Field PdfName PdfName.AA>
	//   28   60:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   29   63:aload           6
	//   30   65:invokestatic    #710 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   31   68:checkcast       #386 <Class PdfDictionary>
	//   32   71:astore          5
		PdfDictionary pdfdictionary = pdfdictionary1;
	//   33   73:aload           5
	//   34   75:astore          4
		if(pdfdictionary1 == null)
	//*  35   77:aload           5
	//*  36   79:ifnonnull       107
		{
			pdfdictionary = new PdfDictionary();
	//   37   82:new             #386 <Class PdfDictionary>
	//   38   85:dup             
	//   39   86:invokespecial   #789 <Method void PdfDictionary()>
	//   40   89:astore          4
			pdfdictionary2.put(PdfName.AA, ((PdfObject) (pdfdictionary)));
	//   41   91:aload           6
	//   42   93:getstatic       #1766 <Field PdfName PdfName.AA>
	//   43   96:aload           4
	//   44   98:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (pdfdictionary2)));
	//   45  101:aload_0         
	//   46  102:aload           6
	//   47  104:invokevirtual   #714 <Method void markUsed(PdfObject)>
		}
		pdfdictionary.put(pdfname, ((PdfObject) (pdfaction)));
	//   48  107:aload           4
	//   49  109:aload_1         
	//   50  110:aload_2         
	//   51  111:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (pdfdictionary)));
	//   52  114:aload_0         
	//   53  115:aload           4
	//   54  117:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//   55  120:return          
	}

	void setRotateContents(boolean flag)
	{
		rotateContents = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field boolean rotateContents>
	//    3    5:return          
	}

	public void setSigFlags(int i)
	{
		sigFlags = sigFlags | i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #111 <Field int sigFlags>
	//    3    5:iload_1         
	//    4    6:ior             
	//    5    7:putfield        #111 <Field int sigFlags>
	//    6   10:return          
	}

	public void setThumbnail(Image image)
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.pdfstamper.setthumbnail", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1815 <String "use.pdfstamper.setthumbnail">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	void setThumbnail(Image image, int i)
		throws PdfException, DocumentException
	{
		image = ((Image) (getImageReference(addDirectImageSimple(image))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #1820 <Method PdfName addDirectImageSimple(Image)>
	//    4    6:invokevirtual   #1823 <Method PdfIndirectReference getImageReference(PdfName)>
	//    5    9:astore_1        
		reader.resetReleasePage();
	//    6   10:aload_0         
	//    7   11:getfield        #160 <Field PdfReader reader>
	//    8   14:invokevirtual   #1826 <Method void PdfReader.resetReleasePage()>
		reader.getPageN(i).put(PdfName.THUMB, ((PdfObject) (image)));
	//    9   17:aload_0         
	//   10   18:getfield        #160 <Field PdfReader reader>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//   13   25:getstatic       #1829 <Field PdfName PdfName.THUMB>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		reader.resetReleasePage();
	//   16   32:aload_0         
	//   17   33:getfield        #160 <Field PdfReader reader>
	//   18   36:invokevirtual   #1826 <Method void PdfReader.resetReleasePage()>
	//   19   39:return          
	}

	public void setTransition(PdfTransition pdftransition)
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("use.setpageaction.pdfname.actiontype.pdfaction.action.int.page", new Object[0]));
	//    0    0:new             #1539 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #1769 <String "use.setpageaction.pdfname.actiontype.pdfaction.action.int.page">
	//    3    7:iconst_0        
	//    4    8:anewarray       Object[]
	//    5   11:invokestatic    #145 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   14:invokespecial   #1542 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
	}

	void setTransition(PdfTransition pdftransition, int i)
	{
		PdfDictionary pdfdictionary = reader.getPageN(i);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #416 <Method PdfDictionary PdfReader.getPageN(int)>
	//    4    8:astore_3        
		if(pdftransition == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       26
			pdfdictionary.remove(PdfName.TRANS);
	//    7   13:aload_3         
	//    8   14:getstatic       #1835 <Field PdfName PdfName.TRANS>
	//    9   17:invokevirtual   #555 <Method void PdfDictionary.remove(PdfName)>
		else
	//*  10   20:aload_0         
	//*  11   21:aload_3         
	//*  12   22:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//*  13   25:return          
			pdfdictionary.put(PdfName.TRANS, ((PdfObject) (pdftransition.getTransitionDictionary())));
	//   14   26:aload_3         
	//   15   27:getstatic       #1835 <Field PdfName PdfName.TRANS>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1840 <Method PdfDictionary PdfTransition.getTransitionDictionary()>
	//   18   34:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (pdfdictionary)));
	//*  19   37:goto            20
	}

	protected void setViewerPreferences()
	{
		reader.setViewerPreferences(viewerPreferences);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field PdfViewerPreferencesImp viewerPreferences>
	//    4    8:invokevirtual   #1843 <Method void PdfReader.setViewerPreferences(PdfViewerPreferencesImp)>
		markUsed(reader.getTrailer().get(PdfName.ROOT));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #160 <Field PdfReader reader>
	//    8   16:invokevirtual   #1252 <Method PdfDictionary PdfReader.getTrailer()>
	//    9   19:getstatic       #1051 <Field PdfName PdfName.ROOT>
	//   10   22:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//   11   25:invokevirtual   #714 <Method void markUsed(PdfObject)>
	//   12   28:return          
	}

	public void setViewerPreferences(int i)
	{
		useVp = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #100 <Field boolean useVp>
		viewerPreferences.setViewerPreferences(i);
	//    3    5:aload_0         
	//    4    6:getfield        #105 <Field PdfViewerPreferencesImp viewerPreferences>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #1845 <Method void PdfViewerPreferencesImp.setViewerPreferences(int)>
	//    7   13:return          
	}

	void sweepKids(PdfObject pdfobject)
	{
		pdfobject = PdfReader.killIndirect(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//    2    4:astore_1        
		if(pdfobject != null && pdfobject.isDictionary()) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnull          16
	//    5    9:aload_1         
	//    6   10:invokevirtual   #541 <Method boolean PdfObject.isDictionary()>
	//    7   13:ifne            17
_L1:
		return;
	//    8   16:return          
	//*   9   17:aload_1         
	//*  10   18:checkcast       #386 <Class PdfDictionary>
	//*  11   21:getstatic       #560 <Field PdfName PdfName.KIDS>
	//*  12   24:invokevirtual   #401 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  13   27:invokestatic    #552 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//*  14   30:checkcast       #290 <Class PdfArray>
	//*  15   33:astore_1        
_L2:
		if((pdfobject = ((PdfObject) ((PdfArray)PdfReader.killIndirect(((PdfDictionary)pdfobject).get(PdfName.KIDS))))) != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          16
		{
			int i = 0;
	//   18   38:iconst_0        
	//   19   39:istore_2        
			while(i < ((PdfArray) (pdfobject)).size()) 
	//*  20   40:iload_2         
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #293 <Method int PdfArray.size()>
	//*  23   45:icmpge          16
			{
				sweepKids(((PdfArray) (pdfobject)).getPdfObject(i));
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:iload_2         
	//   27   51:invokevirtual   #297 <Method PdfObject PdfArray.getPdfObject(int)>
	//   28   54:invokevirtual   #1467 <Method void sweepKids(PdfObject)>
				i++;
	//   29   57:iload_2         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_2        
			}
		}
		if(true) goto _L1; else goto _L3
	//   33   61:goto            40
_L3:
	}

	public void unRegisterReader(PdfReader pdfreader)
	{
		if(readers2intrefs.containsKey(((Object) (pdfreader))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field HashMap readers2intrefs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #755 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            12
	//*   5   11:return          
		{
			readers2intrefs.remove(((Object) (pdfreader)));
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field HashMap readers2intrefs>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #1851 <Method Object HashMap.remove(Object)>
	//   10   20:pop             
			RandomAccessFileOrArray randomaccessfileorarray = (RandomAccessFileOrArray)readers2file.get(((Object) (pdfreader)));
	//   11   21:aload_0         
	//   12   22:getfield        #74  <Field HashMap readers2file>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//   15   29:checkcast       #211 <Class RandomAccessFileOrArray>
	//   16   32:astore_2        
			if(randomaccessfileorarray != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          11
			{
				readers2file.remove(((Object) (pdfreader)));
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field HashMap readers2file>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #1851 <Method Object HashMap.remove(Object)>
	//   23   45:pop             
				try
				{
					randomaccessfileorarray.close();
	//   24   46:aload_2         
	//   25   47:invokevirtual   #1852 <Method void RandomAccessFileOrArray.close()>
					return;
	//   26   50:return          
				}
				// Misplaced declaration of an exception variable
				catch(PdfReader pdfreader)
	//*  27   51:astore_1        
				{
					return;
	//   28   52:return          
				}
			}
		}
	}

	protected void updateNamedDestinations()
		throws IOException
	{
		PdfDictionary pdfdictionary = reader.getCatalog().getAsDict(PdfName.NAMES);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field PdfReader reader>
	//    2    4:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:getstatic       #568 <Field PdfName PdfName.NAMES>
	//    4   10:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    5   13:astore_2        
		Object obj = ((Object) (pdfdictionary));
	//    6   14:aload_2         
	//    7   15:astore_1        
		if(pdfdictionary != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          28
			obj = ((Object) (pdfdictionary.getAsDict(PdfName.DESTS)));
	//   10   20:aload_2         
	//   11   21:getstatic       #1795 <Field PdfName PdfName.DESTS>
	//   12   24:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   13   27:astore_1        
		pdfdictionary = ((PdfDictionary) (obj));
	//   14   28:aload_1         
	//   15   29:astore_2        
		if(obj == null)
	//*  16   30:aload_1         
	//*  17   31:ifnonnull       48
			pdfdictionary = reader.getCatalog().getAsDict(PdfName.DESTS);
	//   18   34:aload_0         
	//   19   35:getfield        #160 <Field PdfReader reader>
	//   20   38:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   21   41:getstatic       #1795 <Field PdfName PdfName.DESTS>
	//   22   44:invokevirtual   #767 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   23   47:astore_2        
		obj = ((Object) (pdfdictionary));
	//   24   48:aload_2         
	//   25   49:astore_1        
		if(pdfdictionary == null)
	//*  26   50:aload_2         
	//*  27   51:ifnonnull       106
		{
			obj = ((Object) (new PdfDictionary()));
	//   28   54:new             #386 <Class PdfDictionary>
	//   29   57:dup             
	//   30   58:invokespecial   #789 <Method void PdfDictionary()>
	//   31   61:astore_1        
			PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   32   62:new             #386 <Class PdfDictionary>
	//   33   65:dup             
	//   34   66:invokespecial   #789 <Method void PdfDictionary()>
	//   35   69:astore_2        
			((PdfDictionary) (obj)).put(PdfName.NAMES, ((PdfObject) (new PdfArray())));
	//   36   70:aload_1         
	//   37   71:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   38   74:new             #290 <Class PdfArray>
	//   39   77:dup             
	//   40   78:invokespecial   #338 <Method void PdfArray()>
	//   41   81:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.DESTS, ((PdfObject) (obj)));
	//   42   84:aload_2         
	//   43   85:getstatic       #1795 <Field PdfName PdfName.DESTS>
	//   44   88:aload_1         
	//   45   89:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
			reader.getCatalog().put(PdfName.NAMES, ((PdfObject) (pdfdictionary1)));
	//   46   92:aload_0         
	//   47   93:getfield        #160 <Field PdfReader reader>
	//   48   96:invokevirtual   #801 <Method PdfDictionary PdfReader.getCatalog()>
	//   49   99:getstatic       #568 <Field PdfName PdfName.NAMES>
	//   50  102:aload_2         
	//   51  103:invokevirtual   #538 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		obj = ((Object) (getLastChildInNameTree(((PdfDictionary) (obj)))));
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:invokespecial   #565 <Method PdfArray getLastChildInNameTree(PdfDictionary)>
	//   55  111:astore_1        
		Object obj1;
		for(Iterator iterator = namedDestinations.keySet().iterator(); iterator.hasNext(); ((PdfArray) (obj)).add(((PdfObject) (addToBody((PdfObject)namedDestinations.get(obj1), getPdfIndirectReference()).getIndirectReference()))))
	//*  56  112:aload_0         
	//*  57  113:getfield        #113 <Field HashMap namedDestinations>
	//*  58  116:invokevirtual   #1853 <Method Set HashMap.keySet()>
	//*  59  119:invokeinterface #396 <Method Iterator Set.iterator()>
	//*  60  124:astore_2        
	//*  61  125:aload_2         
	//*  62  126:invokeinterface #347 <Method boolean Iterator.hasNext()>
	//*  63  131:ifeq            187
		{
			obj1 = iterator.next();
	//   64  134:aload_2         
	//   65  135:invokeinterface #351 <Method Object Iterator.next()>
	//   66  140:astore_3        
			((PdfArray) (obj)).add(((PdfObject) (new PdfString(obj1.toString()))));
	//   67  141:aload_1         
	//   68  142:new             #816 <Class PdfString>
	//   69  145:dup             
	//   70  146:aload_3         
	//   71  147:invokevirtual   #1854 <Method String Object.toString()>
	//   72  150:invokespecial   #819 <Method void PdfString(String)>
	//   73  153:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//   74  156:pop             
		}

	//   75  157:aload_1         
	//   76  158:aload_0         
	//   77  159:aload_0         
	//   78  160:getfield        #113 <Field HashMap namedDestinations>
	//   79  163:aload_3         
	//   80  164:invokevirtual   #788 <Method Object HashMap.get(Object)>
	//   81  167:checkcast       #299 <Class PdfObject>
	//   82  170:aload_0         
	//   83  171:invokevirtual   #1857 <Method PdfIndirectReference getPdfIndirectReference()>
	//   84  174:invokevirtual   #743 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   85  177:invokevirtual   #867 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   86  180:invokevirtual   #355 <Method boolean PdfArray.add(PdfObject)>
	//   87  183:pop             
	//*  88  184:goto            125
	//   89  187:return          
	}

	protected Counter COUNTER;
	private double DEFAULT_MATRIX[] = {
		1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D
	};
	protected AcroFields acroFields;
	protected boolean append;
	protected boolean closed;
	protected HashSet fieldTemplates;
	protected boolean fieldsAdded;
	protected RandomAccessFileOrArray file;
	protected boolean flat;
	protected boolean flatFreeText;
	protected boolean flatannotations;
	protected int initialXrefSize;
	protected IntHashtable marked;
	IntHashtable myXref;
	protected int namePtr[] = {
		0
	};
	protected HashMap namedDestinations;
	protected PdfAction openAction;
	private boolean originalLayersAreRead;
	HashMap pagesToContent;
	protected HashSet partialFlattening;
	PdfReader reader;
	HashMap readers2file;
	HashMap readers2intrefs;
	private boolean rotateContents;
	protected int sigFlags;
	protected boolean useVp;
	protected PdfViewerPreferencesImp viewerPreferences;
}
