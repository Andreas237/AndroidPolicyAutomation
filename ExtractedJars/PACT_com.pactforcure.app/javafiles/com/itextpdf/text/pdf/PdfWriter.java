// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocListener;
import com.itextpdf.text.DocWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Image;
import com.itextpdf.text.ImgJBIG2;
import com.itextpdf.text.ImgWMF;
import com.itextpdf.text.Version;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.TempFileCache;
import com.itextpdf.text.log.Counter;
import com.itextpdf.text.log.CounterFactory;
import com.itextpdf.text.pdf.collection.PdfCollection;
import com.itextpdf.text.pdf.events.PdfPageEventForwarder;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import com.itextpdf.text.pdf.interfaces.PdfAnnotations;
import com.itextpdf.text.pdf.interfaces.PdfDocumentActions;
import com.itextpdf.text.pdf.interfaces.PdfEncryptionSettings;
import com.itextpdf.text.pdf.interfaces.PdfIsoConformance;
import com.itextpdf.text.pdf.interfaces.PdfPageActions;
import com.itextpdf.text.pdf.interfaces.PdfRunDirection;
import com.itextpdf.text.pdf.interfaces.PdfVersion;
import com.itextpdf.text.pdf.interfaces.PdfViewerPreferences;
import com.itextpdf.text.pdf.interfaces.PdfXConformance;
import com.itextpdf.text.pdf.internal.PdfVersionImp;
import com.itextpdf.text.pdf.internal.PdfXConformanceImp;
import com.itextpdf.text.xml.xmp.XmpWriter;
import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;
import com.itextpdf.xmp.options.PropertyOptions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfPages, PdfDictionary, PdfArray, 
//			PdfContentByte, PdfLayer, PdfOCProperties, PdfString, 
//			PdfDocument, PdfReader, PdfObject, PdfIndirectObject, 
//			PdfException, PdfImage, PRIndirectReference, PdfIndirectReference, 
//			PdfPage, PdfTemplate, PdfICCBased, PdfImportedPage, 
//			PdfReaderInstance, PdfFileSpecification, PdfAction, PdfDestination, 
//			FontDetails, ColorDetails, PdfPatternPainter, PdfShadingPattern, 
//			PdfShading, PdfLayerMembership, IPdfSpecialColorSpace, BaseFont, 
//			DocumentFont, ExtendedColor, SpotColor, PdfOCG, 
//			PdfStructureTreeRoot, PdfStructureElement, PdfBoolean, PdfStream, 
//			PdfEncryption, OutputStreamCounter, PdfAnnotation, BadPdfFormatException, 
//			TtfUnicodeWriter, ICC_Profile, PRStream, PdfXConformanceException, 
//			PdfNumber, SimpleBookmark, PdfPageEvent, PdfContents, 
//			PdfFormField, PdfDeveloperExtension, ICachedColorSpace, PdfAcroForm, 
//			RandomAccessFileOrArray, PdfOutline, PdfPageLabels, PdfTransition, 
//			ByteBuffer

public class PdfWriter extends DocWriter
	implements PdfViewerPreferences, PdfEncryptionSettings, PdfVersion, PdfDocumentActions, PdfPageActions, PdfRunDirection, PdfAnnotations
{
	public static class PdfBody
	{

		PdfIndirectObject add(PdfObject pdfobject)
			throws IOException
		{
			return add(pdfobject, getIndirectReferenceNumber());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_0         
		//    3    3:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
		//    4    6:invokevirtual   #73  <Method PdfIndirectObject add(PdfObject, int)>
		//    5    9:areturn         
		}

		PdfIndirectObject add(PdfObject pdfobject, int i)
			throws IOException
		{
			return add(pdfobject, i, 0, true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:iconst_1        
		//    5    5:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
		//    6    8:areturn         
		}

		protected PdfIndirectObject add(PdfObject pdfobject, int i, int j, boolean flag)
			throws IOException
		{
			if(flag && pdfobject.canBeInObjStm() && writer.isFullCompression())
		//*   0    0:iload           4
		//*   1    2:ifeq            78
		//*   2    5:aload_1         
		//*   3    6:invokevirtual   #83  <Method boolean PdfObject.canBeInObjStm()>
		//*   4    9:ifeq            78
		//*   5   12:aload_0         
		//*   6   13:getfield        #62  <Field PdfWriter writer>
		//*   7   16:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
		//*   8   19:ifeq            78
			{
				PdfCrossReference pdfcrossreference = addToObjStm(pdfobject, i);
		//    9   22:aload_0         
		//   10   23:aload_1         
		//   11   24:iload_2         
		//   12   25:invokevirtual   #90  <Method PdfWriter$PdfBody$PdfCrossReference addToObjStm(PdfObject, int)>
		//   13   28:astore          5
				pdfobject = ((PdfObject) (new PdfIndirectObject(i, pdfobject, writer)));
		//   14   30:new             #92  <Class PdfIndirectObject>
		//   15   33:dup             
		//   16   34:iload_2         
		//   17   35:aload_1         
		//   18   36:aload_0         
		//   19   37:getfield        #62  <Field PdfWriter writer>
		//   20   40:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
		//   21   43:astore_1        
				if(!xrefs.add(((Object) (pdfcrossreference))))
		//*  22   44:aload_0         
		//*  23   45:getfield        #38  <Field TreeSet xrefs>
		//*  24   48:aload           5
		//*  25   50:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//*  26   53:ifne            76
				{
					xrefs.remove(((Object) (pdfcrossreference)));
		//   27   56:aload_0         
		//   28   57:getfield        #38  <Field TreeSet xrefs>
		//   29   60:aload           5
		//   30   62:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
		//   31   65:pop             
					xrefs.add(((Object) (pdfcrossreference)));
		//   32   66:aload_0         
		//   33   67:getfield        #38  <Field TreeSet xrefs>
		//   34   70:aload           5
		//   35   72:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   36   75:pop             
				}
				return ((PdfIndirectObject) (pdfobject));
		//   37   76:aload_1         
		//   38   77:areturn         
			}
			if(writer.isFullCompression())
		//*  39   78:aload_0         
		//*  40   79:getfield        #62  <Field PdfWriter writer>
		//*  41   82:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
		//*  42   85:ifeq            110
			{
				pdfobject = ((PdfObject) (new PdfIndirectObject(i, pdfobject, writer)));
		//   43   88:new             #92  <Class PdfIndirectObject>
		//   44   91:dup             
		//   45   92:iload_2         
		//   46   93:aload_1         
		//   47   94:aload_0         
		//   48   95:getfield        #62  <Field PdfWriter writer>
		//   49   98:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
		//   50  101:astore_1        
				write(((PdfIndirectObject) (pdfobject)), i);
		//   51  102:aload_0         
		//   52  103:aload_1         
		//   53  104:iload_2         
		//   54  105:invokevirtual   #102 <Method void write(PdfIndirectObject, int)>
				return ((PdfIndirectObject) (pdfobject));
		//   55  108:aload_1         
		//   56  109:areturn         
			} else
			{
				pdfobject = ((PdfObject) (new PdfIndirectObject(i, j, pdfobject, writer)));
		//   57  110:new             #92  <Class PdfIndirectObject>
		//   58  113:dup             
		//   59  114:iload_2         
		//   60  115:iload_3         
		//   61  116:aload_1         
		//   62  117:aload_0         
		//   63  118:getfield        #62  <Field PdfWriter writer>
		//   64  121:invokespecial   #105 <Method void PdfIndirectObject(int, int, PdfObject, PdfWriter)>
		//   65  124:astore_1        
				write(((PdfIndirectObject) (pdfobject)), i, j);
		//   66  125:aload_0         
		//   67  126:aload_1         
		//   68  127:iload_2         
		//   69  128:iload_3         
		//   70  129:invokevirtual   #108 <Method void write(PdfIndirectObject, int, int)>
				return ((PdfIndirectObject) (pdfobject));
		//   71  132:aload_1         
		//   72  133:areturn         
			}
		}

		PdfIndirectObject add(PdfObject pdfobject, PdfIndirectReference pdfindirectreference)
			throws IOException
		{
			return add(pdfobject, pdfindirectreference, true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_1        
		//    4    4:invokevirtual   #112 <Method PdfIndirectObject add(PdfObject, PdfIndirectReference, boolean)>
		//    5    7:areturn         
		}

		PdfIndirectObject add(PdfObject pdfobject, PdfIndirectReference pdfindirectreference, boolean flag)
			throws IOException
		{
			return add(pdfobject, pdfindirectreference.getNumber(), pdfindirectreference.getGeneration(), flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #117 <Method int PdfIndirectReference.getNumber()>
		//    4    6:aload_2         
		//    5    7:invokevirtual   #120 <Method int PdfIndirectReference.getGeneration()>
		//    6   10:iload_3         
		//    7   11:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
		//    8   14:areturn         
		}

		PdfIndirectObject add(PdfObject pdfobject, boolean flag)
			throws IOException
		{
			return add(pdfobject, getIndirectReferenceNumber(), 0, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_0         
		//    3    3:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
		//    4    6:iconst_0        
		//    5    7:iload_2         
		//    6    8:invokevirtual   #77  <Method PdfIndirectObject add(PdfObject, int, int, boolean)>
		//    7   11:areturn         
		}

		protected PdfCrossReference addToObjStm(PdfObject pdfobject, int i)
			throws IOException
		{
			if(numObj >= 200)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int numObj>
		//*   2    4:sipush          200
		//*   3    7:icmplt          14
				flushObjStm();
		//    4   10:aload_0         
		//    5   11:invokevirtual   #124 <Method void flushObjStm()>
			if(index == null)
		//*   6   14:aload_0         
		//*   7   15:getfield        #126 <Field ByteBuffer index>
		//*   8   18:ifnonnull       56
			{
				index = new ByteBuffer();
		//    9   21:aload_0         
		//   10   22:new             #128 <Class ByteBuffer>
		//   11   25:dup             
		//   12   26:invokespecial   #129 <Method void ByteBuffer()>
		//   13   29:putfield        #126 <Field ByteBuffer index>
				streamObjects = new ByteBuffer();
		//   14   32:aload_0         
		//   15   33:new             #128 <Class ByteBuffer>
		//   16   36:dup             
		//   17   37:invokespecial   #129 <Method void ByteBuffer()>
		//   18   40:putfield        #131 <Field ByteBuffer streamObjects>
				currentObjNum = getIndirectReferenceNumber();
		//   19   43:aload_0         
		//   20   44:aload_0         
		//   21   45:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
		//   22   48:putfield        #133 <Field int currentObjNum>
				numObj = 0;
		//   23   51:aload_0         
		//   24   52:iconst_0        
		//   25   53:putfield        #33  <Field int numObj>
			}
			int j = streamObjects.size();
		//   26   56:aload_0         
		//   27   57:getfield        #131 <Field ByteBuffer streamObjects>
		//   28   60:invokevirtual   #136 <Method int ByteBuffer.size()>
		//   29   63:istore_3        
			int k = numObj;
		//   30   64:aload_0         
		//   31   65:getfield        #33  <Field int numObj>
		//   32   68:istore          4
			numObj = k + 1;
		//   33   70:aload_0         
		//   34   71:iload           4
		//   35   73:iconst_1        
		//   36   74:iadd            
		//   37   75:putfield        #33  <Field int numObj>
			PdfEncryption pdfencryption = writer.crypto;
		//   38   78:aload_0         
		//   39   79:getfield        #62  <Field PdfWriter writer>
		//   40   82:getfield        #140 <Field PdfEncryption PdfWriter.crypto>
		//   41   85:astore          5
			writer.crypto = null;
		//   42   87:aload_0         
		//   43   88:getfield        #62  <Field PdfWriter writer>
		//   44   91:aconst_null     
		//   45   92:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
			pdfobject.toPdf(writer, ((OutputStream) (streamObjects)));
		//   46   95:aload_1         
		//   47   96:aload_0         
		//   48   97:getfield        #62  <Field PdfWriter writer>
		//   49  100:aload_0         
		//   50  101:getfield        #131 <Field ByteBuffer streamObjects>
		//   51  104:invokevirtual   #144 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
			writer.crypto = pdfencryption;
		//   52  107:aload_0         
		//   53  108:getfield        #62  <Field PdfWriter writer>
		//   54  111:aload           5
		//   55  113:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
			streamObjects.append(' ');
		//   56  116:aload_0         
		//   57  117:getfield        #131 <Field ByteBuffer streamObjects>
		//   58  120:bipush          32
		//   59  122:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
		//   60  125:pop             
			index.append(i).append(' ').append(j).append(' ');
		//   61  126:aload_0         
		//   62  127:getfield        #126 <Field ByteBuffer index>
		//   63  130:iload_2         
		//   64  131:invokevirtual   #151 <Method ByteBuffer ByteBuffer.append(int)>
		//   65  134:bipush          32
		//   66  136:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
		//   67  139:iload_3         
		//   68  140:invokevirtual   #151 <Method ByteBuffer ByteBuffer.append(int)>
		//   69  143:bipush          32
		//   70  145:invokevirtual   #148 <Method ByteBuffer ByteBuffer.append(char)>
		//   71  148:pop             
			return new PdfCrossReference(2, i, currentObjNum, k);
		//   72  149:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   73  152:dup             
		//   74  153:iconst_2        
		//   75  154:iload_2         
		//   76  155:aload_0         
		//   77  156:getfield        #133 <Field int currentObjNum>
		//   78  159:i2l             
		//   79  160:iload           4
		//   80  162:invokespecial   #154 <Method void PdfWriter$PdfBody$PdfCrossReference(int, int, long, int)>
		//   81  165:areturn         
		}

		public void flushObjStm()
			throws IOException
		{
			if(numObj == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int numObj>
		//*   2    4:ifne            8
			{
				return;
		//    3    7:return          
			} else
			{
				int i = index.size();
		//    4    8:aload_0         
		//    5    9:getfield        #126 <Field ByteBuffer index>
		//    6   12:invokevirtual   #136 <Method int ByteBuffer.size()>
		//    7   15:istore_1        
				index.append(streamObjects);
		//    8   16:aload_0         
		//    9   17:getfield        #126 <Field ByteBuffer index>
		//   10   20:aload_0         
		//   11   21:getfield        #131 <Field ByteBuffer streamObjects>
		//   12   24:invokevirtual   #157 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
		//   13   27:pop             
				PdfStream pdfstream = new PdfStream(index.toByteArray());
		//   14   28:new             #159 <Class PdfStream>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:getfield        #126 <Field ByteBuffer index>
		//   18   36:invokevirtual   #163 <Method byte[] ByteBuffer.toByteArray()>
		//   19   39:invokespecial   #166 <Method void PdfStream(byte[])>
		//   20   42:astore_2        
				pdfstream.flateCompress(writer.getCompressionLevel());
		//   21   43:aload_2         
		//   22   44:aload_0         
		//   23   45:getfield        #62  <Field PdfWriter writer>
		//   24   48:invokevirtual   #169 <Method int PdfWriter.getCompressionLevel()>
		//   25   51:invokevirtual   #173 <Method void PdfStream.flateCompress(int)>
				pdfstream.put(PdfName.TYPE, ((PdfObject) (PdfName.OBJSTM)));
		//   26   54:aload_2         
		//   27   55:getstatic       #179 <Field PdfName PdfName.TYPE>
		//   28   58:getstatic       #182 <Field PdfName PdfName.OBJSTM>
		//   29   61:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				pdfstream.put(PdfName.N, ((PdfObject) (new PdfNumber(numObj))));
		//   30   64:aload_2         
		//   31   65:getstatic       #189 <Field PdfName PdfName.N>
		//   32   68:new             #191 <Class PdfNumber>
		//   33   71:dup             
		//   34   72:aload_0         
		//   35   73:getfield        #33  <Field int numObj>
		//   36   76:invokespecial   #193 <Method void PdfNumber(int)>
		//   37   79:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				pdfstream.put(PdfName.FIRST, ((PdfObject) (new PdfNumber(i))));
		//   38   82:aload_2         
		//   39   83:getstatic       #196 <Field PdfName PdfName.FIRST>
		//   40   86:new             #191 <Class PdfNumber>
		//   41   89:dup             
		//   42   90:iload_1         
		//   43   91:invokespecial   #193 <Method void PdfNumber(int)>
		//   44   94:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				add(((PdfObject) (pdfstream)), currentObjNum);
		//   45   97:aload_0         
		//   46   98:aload_2         
		//   47   99:aload_0         
		//   48  100:getfield        #133 <Field int currentObjNum>
		//   49  103:invokevirtual   #73  <Method PdfIndirectObject add(PdfObject, int)>
		//   50  106:pop             
				index = null;
		//   51  107:aload_0         
		//   52  108:aconst_null     
		//   53  109:putfield        #126 <Field ByteBuffer index>
				streamObjects = null;
		//   54  112:aload_0         
		//   55  113:aconst_null     
		//   56  114:putfield        #131 <Field ByteBuffer streamObjects>
				numObj = 0;
		//   57  117:aload_0         
		//   58  118:iconst_0        
		//   59  119:putfield        #33  <Field int numObj>
				return;
		//   60  122:return          
			}
		}

		protected int getIndirectReferenceNumber()
		{
			int i = refnum;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field int refnum>
		//    2    4:istore_1        
			refnum = i + 1;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #60  <Field int refnum>
			xrefs.add(((Object) (new PdfCrossReference(i, 0L, 65535))));
		//    8   12:aload_0         
		//    9   13:getfield        #38  <Field TreeSet xrefs>
		//   10   16:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   11   19:dup             
		//   12   20:iload_1         
		//   13   21:lconst_0        
		//   14   22:ldc1            #39  <Int 65535>
		//   15   24:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
		//   16   27:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   17   30:pop             
			return i;
		//   18   31:iload_1         
		//   19   32:ireturn         
		}

		public PdfIndirectReference getPdfIndirectReference()
		{
			return new PdfIndirectReference(0, getIndirectReferenceNumber());
		//    0    0:new             #114 <Class PdfIndirectReference>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:aload_0         
		//    4    6:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
		//    5    9:invokespecial   #201 <Method void PdfIndirectReference(int, int)>
		//    6   12:areturn         
		}

		public long offset()
		{
			return position;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field long position>
		//    2    4:lreturn         
		}

		void setRefnum(int i)
		{
			refnum = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #60  <Field int refnum>
		//    3    5:return          
		}

		public int size()
		{
			return Math.max(((PdfCrossReference)xrefs.last()).getRefnum() + 1, refnum);
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field TreeSet xrefs>
		//    2    4:invokevirtual   #207 <Method Object TreeSet.last()>
		//    3    7:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    4   10:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
		//    5   13:iconst_1        
		//    6   14:iadd            
		//    7   15:aload_0         
		//    8   16:getfield        #60  <Field int refnum>
		//    9   19:invokestatic    #216 <Method int Math.max(int, int)>
		//   10   22:ireturn         
		}

		protected void write(PdfIndirectObject pdfindirectobject, int i)
			throws IOException
		{
			PdfCrossReference pdfcrossreference = new PdfCrossReference(i, position);
		//    0    0:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    1    3:dup             
		//    2    4:iload_2         
		//    3    5:aload_0         
		//    4    6:getfield        #58  <Field long position>
		//    5    9:invokespecial   #219 <Method void PdfWriter$PdfBody$PdfCrossReference(int, long)>
		//    6   12:astore_3        
			if(!xrefs.add(((Object) (pdfcrossreference))))
		//*   7   13:aload_0         
		//*   8   14:getfield        #38  <Field TreeSet xrefs>
		//*   9   17:aload_3         
		//*  10   18:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//*  11   21:ifne            42
			{
				xrefs.remove(((Object) (pdfcrossreference)));
		//   12   24:aload_0         
		//   13   25:getfield        #38  <Field TreeSet xrefs>
		//   14   28:aload_3         
		//   15   29:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
		//   16   32:pop             
				xrefs.add(((Object) (pdfcrossreference)));
		//   17   33:aload_0         
		//   18   34:getfield        #38  <Field TreeSet xrefs>
		//   19   37:aload_3         
		//   20   38:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   21   41:pop             
			}
			pdfindirectobject.writeTo(((OutputStream) (writer.getOs())));
		//   22   42:aload_1         
		//   23   43:aload_0         
		//   24   44:getfield        #62  <Field PdfWriter writer>
		//   25   47:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//   26   50:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
			position = writer.getOs().getCounter();
		//   27   53:aload_0         
		//   28   54:aload_0         
		//   29   55:getfield        #62  <Field PdfWriter writer>
		//   30   58:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//   31   61:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
		//   32   64:putfield        #58  <Field long position>
		//   33   67:return          
		}

		protected void write(PdfIndirectObject pdfindirectobject, int i, int j)
			throws IOException
		{
			PdfCrossReference pdfcrossreference = new PdfCrossReference(i, position, j);
		//    0    0:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    1    3:dup             
		//    2    4:iload_2         
		//    3    5:aload_0         
		//    4    6:getfield        #58  <Field long position>
		//    5    9:iload_3         
		//    6   10:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
		//    7   13:astore          4
			if(!xrefs.add(((Object) (pdfcrossreference))))
		//*   8   15:aload_0         
		//*   9   16:getfield        #38  <Field TreeSet xrefs>
		//*  10   19:aload           4
		//*  11   21:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//*  12   24:ifne            47
			{
				xrefs.remove(((Object) (pdfcrossreference)));
		//   13   27:aload_0         
		//   14   28:getfield        #38  <Field TreeSet xrefs>
		//   15   31:aload           4
		//   16   33:invokevirtual   #98  <Method boolean TreeSet.remove(Object)>
		//   17   36:pop             
				xrefs.add(((Object) (pdfcrossreference)));
		//   18   37:aload_0         
		//   19   38:getfield        #38  <Field TreeSet xrefs>
		//   20   41:aload           4
		//   21   43:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   22   46:pop             
			}
			pdfindirectobject.writeTo(((OutputStream) (writer.getOs())));
		//   23   47:aload_1         
		//   24   48:aload_0         
		//   25   49:getfield        #62  <Field PdfWriter writer>
		//   26   52:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//   27   55:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
			position = writer.getOs().getCounter();
		//   28   58:aload_0         
		//   29   59:aload_0         
		//   30   60:getfield        #62  <Field PdfWriter writer>
		//   31   63:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//   32   66:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
		//   33   69:putfield        #58  <Field long position>
		//   34   72:return          
		}

		public void writeCrossReferenceTable(OutputStream outputstream, PdfIndirectReference pdfindirectreference, PdfIndirectReference pdfindirectreference1, PdfIndirectReference pdfindirectreference2, PdfObject pdfobject, long l)
			throws IOException
		{
			int j1 = 0;
		//    0    0:iconst_0        
		//    1    1:istore          9
			if(writer.isFullCompression())
		//*   2    3:aload_0         
		//*   3    4:getfield        #62  <Field PdfWriter writer>
		//*   4    7:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
		//*   5   10:ifeq            44
			{
				flushObjStm();
		//    6   13:aload_0         
		//    7   14:invokevirtual   #124 <Method void flushObjStm()>
				j1 = getIndirectReferenceNumber();
		//    8   17:aload_0         
		//    9   18:invokevirtual   #70  <Method int getIndirectReferenceNumber()>
		//   10   21:istore          9
				xrefs.add(((Object) (new PdfCrossReference(j1, position))));
		//   11   23:aload_0         
		//   12   24:getfield        #38  <Field TreeSet xrefs>
		//   13   27:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   14   30:dup             
		//   15   31:iload           9
		//   16   33:aload_0         
		//   17   34:getfield        #58  <Field long position>
		//   18   37:invokespecial   #219 <Method void PdfWriter$PdfBody$PdfCrossReference(int, long)>
		//   19   40:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   20   43:pop             
			}
			int l1 = ((PdfCrossReference)xrefs.first()).getRefnum();
		//   21   44:aload_0         
		//   22   45:getfield        #38  <Field TreeSet xrefs>
		//   23   48:invokevirtual   #228 <Method Object TreeSet.first()>
		//   24   51:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   25   54:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
		//   26   57:istore          10
			int i = 0;
		//   27   59:iconst_0        
		//   28   60:istore          8
			ArrayList arraylist = new ArrayList();
		//   29   62:new             #230 <Class ArrayList>
		//   30   65:dup             
		//   31   66:invokespecial   #231 <Method void ArrayList()>
		//   32   69:astore          13
			for(Iterator iterator = xrefs.iterator(); iterator.hasNext();)
		//*  33   71:aload_0         
		//*  34   72:getfield        #38  <Field TreeSet xrefs>
		//*  35   75:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
		//*  36   78:astore          14
		//*  37   80:aload           14
		//*  38   82:invokeinterface #240 <Method boolean Iterator.hasNext()>
		//*  39   87:ifeq            159
			{
				PdfCrossReference pdfcrossreference = (PdfCrossReference)iterator.next();
		//   40   90:aload           14
		//   41   92:invokeinterface #243 <Method Object Iterator.next()>
		//   42   97:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   43  100:astore          15
				if(l1 + i == pdfcrossreference.getRefnum())
		//*  44  102:iload           10
		//*  45  104:iload           8
		//*  46  106:iadd            
		//*  47  107:aload           15
		//*  48  109:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
		//*  49  112:icmpne          124
				{
					i++;
		//   50  115:iload           8
		//   51  117:iconst_1        
		//   52  118:iadd            
		//   53  119:istore          8
				} else
		//*  54  121:goto            80
				{
					arraylist.add(((Object) (Integer.valueOf(l1))));
		//   55  124:aload           13
		//   56  126:iload           10
		//   57  128:invokestatic    #249 <Method Integer Integer.valueOf(int)>
		//   58  131:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
		//   59  134:pop             
					arraylist.add(((Object) (Integer.valueOf(i))));
		//   60  135:aload           13
		//   61  137:iload           8
		//   62  139:invokestatic    #249 <Method Integer Integer.valueOf(int)>
		//   63  142:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
		//   64  145:pop             
					l1 = pdfcrossreference.getRefnum();
		//   65  146:aload           15
		//   66  148:invokevirtual   #210 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
		//   67  151:istore          10
					i = 1;
		//   68  153:iconst_1        
		//   69  154:istore          8
				}
			}

		//*  70  156:goto            80
			arraylist.add(((Object) (Integer.valueOf(l1))));
		//   71  159:aload           13
		//   72  161:iload           10
		//   73  163:invokestatic    #249 <Method Integer Integer.valueOf(int)>
		//   74  166:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
		//   75  169:pop             
			arraylist.add(((Object) (Integer.valueOf(i))));
		//   76  170:aload           13
		//   77  172:iload           8
		//   78  174:invokestatic    #249 <Method Integer Integer.valueOf(int)>
		//   79  177:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
		//   80  180:pop             
			if(writer.isFullCompression())
		//*  81  181:aload_0         
		//*  82  182:getfield        #62  <Field PdfWriter writer>
		//*  83  185:invokevirtual   #86  <Method boolean PdfWriter.isFullCompression()>
		//*  84  188:ifeq            543
			{
				int j = 5;
		//   85  191:iconst_5        
		//   86  192:istore          8
				long l2 = 0x0L;
		//   87  194:ldc2w           #251 <Long 0x0L>
		//   88  197:lstore          11
				do
				{
					if(j <= 1 || (position & l2) != 0L)
		//*  89  199:iload           8
		//*  90  201:iconst_1        
		//*  91  202:icmple          217
		//*  92  205:aload_0         
		//*  93  206:getfield        #58  <Field long position>
		//*  94  209:lload           11
		//*  95  211:land            
		//*  96  212:lconst_0        
		//*  97  213:lcmp            
		//*  98  214:ifeq            263
					{
						outputstream = ((OutputStream) (new ByteBuffer()));
		//   99  217:new             #128 <Class ByteBuffer>
		//  100  220:dup             
		//  101  221:invokespecial   #129 <Method void ByteBuffer()>
		//  102  224:astore_1        
						for(Iterator iterator1 = xrefs.iterator(); iterator1.hasNext(); ((PdfCrossReference)iterator1.next()).toPdf(j, outputstream));
		//  103  225:aload_0         
		//  104  226:getfield        #38  <Field TreeSet xrefs>
		//  105  229:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
		//  106  232:astore          14
		//  107  234:aload           14
		//  108  236:invokeinterface #240 <Method boolean Iterator.hasNext()>
		//  109  241:ifeq            279
		//  110  244:aload           14
		//  111  246:invokeinterface #243 <Method Object Iterator.next()>
		//  112  251:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//  113  254:iload           8
		//  114  256:aload_1         
		//  115  257:invokevirtual   #255 <Method void PdfWriter$PdfBody$PdfCrossReference.toPdf(int, OutputStream)>
						break;
		//  116  260:goto            234
					}
					l2 >>>= 8;
		//  117  263:lload           11
		//  118  265:bipush          8
		//  119  267:lushr           
		//  120  268:lstore          11
					j--;
		//  121  270:iload           8
		//  122  272:iconst_1        
		//  123  273:isub            
		//  124  274:istore          8
				} while(true);
		//  125  276:goto            199
				outputstream = ((OutputStream) (new PdfStream(((ByteBuffer) (outputstream)).toByteArray())));
		//  126  279:new             #159 <Class PdfStream>
		//  127  282:dup             
		//  128  283:aload_1         
		//  129  284:invokevirtual   #163 <Method byte[] ByteBuffer.toByteArray()>
		//  130  287:invokespecial   #166 <Method void PdfStream(byte[])>
		//  131  290:astore_1        
				((PdfStream) (outputstream)).flateCompress(writer.getCompressionLevel());
		//  132  291:aload_1         
		//  133  292:aload_0         
		//  134  293:getfield        #62  <Field PdfWriter writer>
		//  135  296:invokevirtual   #169 <Method int PdfWriter.getCompressionLevel()>
		//  136  299:invokevirtual   #173 <Method void PdfStream.flateCompress(int)>
				((PdfStream) (outputstream)).put(PdfName.SIZE, ((PdfObject) (new PdfNumber(size()))));
		//  137  302:aload_1         
		//  138  303:getstatic       #258 <Field PdfName PdfName.SIZE>
		//  139  306:new             #191 <Class PdfNumber>
		//  140  309:dup             
		//  141  310:aload_0         
		//  142  311:invokevirtual   #259 <Method int size()>
		//  143  314:invokespecial   #193 <Method void PdfNumber(int)>
		//  144  317:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				((PdfStream) (outputstream)).put(PdfName.ROOT, ((PdfObject) (pdfindirectreference)));
		//  145  320:aload_1         
		//  146  321:getstatic       #262 <Field PdfName PdfName.ROOT>
		//  147  324:aload_2         
		//  148  325:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				if(pdfindirectreference1 != null)
		//* 149  328:aload_3         
		//* 150  329:ifnull          340
					((PdfStream) (outputstream)).put(PdfName.INFO, ((PdfObject) (pdfindirectreference1)));
		//  151  332:aload_1         
		//  152  333:getstatic       #265 <Field PdfName PdfName.INFO>
		//  153  336:aload_3         
		//  154  337:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				if(pdfindirectreference2 != null)
		//* 155  340:aload           4
		//* 156  342:ifnull          354
					((PdfStream) (outputstream)).put(PdfName.ENCRYPT, ((PdfObject) (pdfindirectreference2)));
		//  157  345:aload_1         
		//  158  346:getstatic       #268 <Field PdfName PdfName.ENCRYPT>
		//  159  349:aload           4
		//  160  351:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				if(pdfobject != null)
		//* 161  354:aload           5
		//* 162  356:ifnull          368
					((PdfStream) (outputstream)).put(PdfName.ID, pdfobject);
		//  163  359:aload_1         
		//  164  360:getstatic       #271 <Field PdfName PdfName.ID>
		//  165  363:aload           5
		//  166  365:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				((PdfStream) (outputstream)).put(PdfName.W, ((PdfObject) (new PdfArray(new int[] {
					1, j, 2
				}))));
		//  167  368:aload_1         
		//  168  369:getstatic       #274 <Field PdfName PdfName.W>
		//  169  372:new             #276 <Class PdfArray>
		//  170  375:dup             
		//  171  376:iconst_3        
		//  172  377:newarray        int[]
		//  173  379:dup             
		//  174  380:iconst_0        
		//  175  381:iconst_1        
		//  176  382:iastore         
		//  177  383:dup             
		//  178  384:iconst_1        
		//  179  385:iload           8
		//  180  387:iastore         
		//  181  388:dup             
		//  182  389:iconst_2        
		//  183  390:iconst_2        
		//  184  391:iastore         
		//  185  392:invokespecial   #279 <Method void PdfArray(int[])>
		//  186  395:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				((PdfStream) (outputstream)).put(PdfName.TYPE, ((PdfObject) (PdfName.XREF)));
		//  187  398:aload_1         
		//  188  399:getstatic       #179 <Field PdfName PdfName.TYPE>
		//  189  402:getstatic       #282 <Field PdfName PdfName.XREF>
		//  190  405:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				pdfindirectreference = ((PdfIndirectReference) (new PdfArray()));
		//  191  408:new             #276 <Class PdfArray>
		//  192  411:dup             
		//  193  412:invokespecial   #283 <Method void PdfArray()>
		//  194  415:astore_2        
				for(int k = 0; k < arraylist.size(); k++)
		//* 195  416:iconst_0        
		//* 196  417:istore          8
		//* 197  419:iload           8
		//* 198  421:aload           13
		//* 199  423:invokevirtual   #284 <Method int ArrayList.size()>
		//* 200  426:icmpge          463
					((PdfArray) (pdfindirectreference)).add(((PdfObject) (new PdfNumber(((Integer)arraylist.get(k)).intValue()))));
		//  201  429:aload_2         
		//  202  430:new             #191 <Class PdfNumber>
		//  203  433:dup             
		//  204  434:aload           13
		//  205  436:iload           8
		//  206  438:invokevirtual   #288 <Method Object ArrayList.get(int)>
		//  207  441:checkcast       #245 <Class Integer>
		//  208  444:invokevirtual   #291 <Method int Integer.intValue()>
		//  209  447:invokespecial   #193 <Method void PdfNumber(int)>
		//  210  450:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
		//  211  453:pop             

		//  212  454:iload           8
		//  213  456:iconst_1        
		//  214  457:iadd            
		//  215  458:istore          8
		//* 216  460:goto            419
				((PdfStream) (outputstream)).put(PdfName.INDEX, ((PdfObject) (pdfindirectreference)));
		//  217  463:aload_1         
		//  218  464:getstatic       #297 <Field PdfName PdfName.INDEX>
		//  219  467:aload_2         
		//  220  468:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				if(l > 0L)
		//* 221  471:lload           6
		//* 222  473:lconst_0        
		//* 223  474:lcmp            
		//* 224  475:ifle            494
					((PdfStream) (outputstream)).put(PdfName.PREV, ((PdfObject) (new PdfNumber(l))));
		//  225  478:aload_1         
		//  226  479:getstatic       #300 <Field PdfName PdfName.PREV>
		//  227  482:new             #191 <Class PdfNumber>
		//  228  485:dup             
		//  229  486:lload           6
		//  230  488:invokespecial   #303 <Method void PdfNumber(long)>
		//  231  491:invokevirtual   #186 <Method void PdfStream.put(PdfName, PdfObject)>
				pdfindirectreference = ((PdfIndirectReference) (writer.crypto));
		//  232  494:aload_0         
		//  233  495:getfield        #62  <Field PdfWriter writer>
		//  234  498:getfield        #140 <Field PdfEncryption PdfWriter.crypto>
		//  235  501:astore_2        
				writer.crypto = null;
		//  236  502:aload_0         
		//  237  503:getfield        #62  <Field PdfWriter writer>
		//  238  506:aconst_null     
		//  239  507:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
				(new PdfIndirectObject(j1, ((PdfObject) (outputstream)), writer)).writeTo(((OutputStream) (writer.getOs())));
		//  240  510:new             #92  <Class PdfIndirectObject>
		//  241  513:dup             
		//  242  514:iload           9
		//  243  516:aload_1         
		//  244  517:aload_0         
		//  245  518:getfield        #62  <Field PdfWriter writer>
		//  246  521:invokespecial   #95  <Method void PdfIndirectObject(int, PdfObject, PdfWriter)>
		//  247  524:aload_0         
		//  248  525:getfield        #62  <Field PdfWriter writer>
		//  249  528:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//  250  531:invokevirtual   #223 <Method void PdfIndirectObject.writeTo(OutputStream)>
				writer.crypto = ((PdfEncryption) (pdfindirectreference));
		//  251  534:aload_0         
		//  252  535:getfield        #62  <Field PdfWriter writer>
		//  253  538:aload_2         
		//  254  539:putfield        #140 <Field PdfEncryption PdfWriter.crypto>
			} else
		//* 255  542:return          
			{
				outputstream.write(DocWriter.getISOBytes("xref\n"));
		//  256  543:aload_1         
		//  257  544:ldc2            #305 <String "xref\n">
		//  258  547:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
		//  259  550:invokevirtual   #315 <Method void OutputStream.write(byte[])>
				pdfindirectreference = ((PdfIndirectReference) (xrefs.iterator()));
		//  260  553:aload_0         
		//  261  554:getfield        #38  <Field TreeSet xrefs>
		//  262  557:invokevirtual   #235 <Method Iterator TreeSet.iterator()>
		//  263  560:astore_2        
				int i1 = 0;
		//  264  561:iconst_0        
		//  265  562:istore          8
				while(i1 < arraylist.size()) 
		//* 266  564:iload           8
		//* 267  566:aload           13
		//* 268  568:invokevirtual   #284 <Method int ArrayList.size()>
		//* 269  571:icmpge          542
				{
					int i2 = ((Integer)arraylist.get(i1)).intValue();
		//  270  574:aload           13
		//  271  576:iload           8
		//  272  578:invokevirtual   #288 <Method Object ArrayList.get(int)>
		//  273  581:checkcast       #245 <Class Integer>
		//  274  584:invokevirtual   #291 <Method int Integer.intValue()>
		//  275  587:istore          10
					int k1 = ((Integer)arraylist.get(i1 + 1)).intValue();
		//  276  589:aload           13
		//  277  591:iload           8
		//  278  593:iconst_1        
		//  279  594:iadd            
		//  280  595:invokevirtual   #288 <Method Object ArrayList.get(int)>
		//  281  598:checkcast       #245 <Class Integer>
		//  282  601:invokevirtual   #291 <Method int Integer.intValue()>
		//  283  604:istore          9
					outputstream.write(DocWriter.getISOBytes(String.valueOf(i2)));
		//  284  606:aload_1         
		//  285  607:iload           10
		//  286  609:invokestatic    #320 <Method String String.valueOf(int)>
		//  287  612:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
		//  288  615:invokevirtual   #315 <Method void OutputStream.write(byte[])>
					outputstream.write(DocWriter.getISOBytes(" "));
		//  289  618:aload_1         
		//  290  619:ldc2            #322 <String " ">
		//  291  622:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
		//  292  625:invokevirtual   #315 <Method void OutputStream.write(byte[])>
					outputstream.write(DocWriter.getISOBytes(String.valueOf(k1)));
		//  293  628:aload_1         
		//  294  629:iload           9
		//  295  631:invokestatic    #320 <Method String String.valueOf(int)>
		//  296  634:invokestatic    #311 <Method byte[] DocWriter.getISOBytes(String)>
		//  297  637:invokevirtual   #315 <Method void OutputStream.write(byte[])>
					outputstream.write(10);
		//  298  640:aload_1         
		//  299  641:bipush          10
		//  300  643:invokevirtual   #324 <Method void OutputStream.write(int)>
					for(; k1 > 0; k1--)
		//* 301  646:iload           9
		//* 302  648:ifle            673
						((PdfCrossReference)((Iterator) (pdfindirectreference)).next()).toPdf(outputstream);
		//  303  651:aload_2         
		//  304  652:invokeinterface #243 <Method Object Iterator.next()>
		//  305  657:checkcast       #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//  306  660:aload_1         
		//  307  661:invokevirtual   #326 <Method void PdfWriter$PdfBody$PdfCrossReference.toPdf(OutputStream)>

		//  308  664:iload           9
		//  309  666:iconst_1        
		//  310  667:isub            
		//  311  668:istore          9
		//* 312  670:goto            646
					i1 += 2;
		//  313  673:iload           8
		//  314  675:iconst_2        
		//  315  676:iadd            
		//  316  677:istore          8
				}
			}
		//* 317  679:goto            564
		}

		private static final int OBJSINSTREAM = 200;
		protected int currentObjNum;
		protected ByteBuffer index;
		protected int numObj;
		protected long position;
		protected int refnum;
		protected ByteBuffer streamObjects;
		protected final PdfWriter writer;
		protected final TreeSet xrefs = new TreeSet();

		protected PdfBody(PdfWriter pdfwriter)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			numObj = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #33  <Field int numObj>
		//    5    9:aload_0         
		//    6   10:new             #35  <Class TreeSet>
		//    7   13:dup             
		//    8   14:invokespecial   #36  <Method void TreeSet()>
		//    9   17:putfield        #38  <Field TreeSet xrefs>
			xrefs.add(((Object) (new PdfCrossReference(0, 0L, 65535))));
		//   10   20:aload_0         
		//   11   21:getfield        #38  <Field TreeSet xrefs>
		//   12   24:new             #9   <Class PdfWriter$PdfBody$PdfCrossReference>
		//   13   27:dup             
		//   14   28:iconst_0        
		//   15   29:lconst_0        
		//   16   30:ldc1            #39  <Int 65535>
		//   17   32:invokespecial   #42  <Method void PdfWriter$PdfBody$PdfCrossReference(int, long, int)>
		//   18   35:invokevirtual   #46  <Method boolean TreeSet.add(Object)>
		//   19   38:pop             
			position = pdfwriter.getOs().getCounter();
		//   20   39:aload_0         
		//   21   40:aload_1         
		//   22   41:invokevirtual   #50  <Method OutputStreamCounter PdfWriter.getOs()>
		//   23   44:invokevirtual   #56  <Method long OutputStreamCounter.getCounter()>
		//   24   47:putfield        #58  <Field long position>
			refnum = 1;
		//   25   50:aload_0         
		//   26   51:iconst_1        
		//   27   52:putfield        #60  <Field int refnum>
			writer = pdfwriter;
		//   28   55:aload_0         
		//   29   56:aload_1         
		//   30   57:putfield        #62  <Field PdfWriter writer>
		//   31   60:return          
		}
	}

	public static class PdfBody.PdfCrossReference
		implements Comparable
	{

		public int compareTo(PdfBody.PdfCrossReference pdfcrossreference)
		{
			if(refnum < pdfcrossreference.refnum)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field int refnum>
		//*   2    4:aload_1         
		//*   3    5:getfield        #30  <Field int refnum>
		//*   4    8:icmpge          13
				return -1;
		//    5   11:iconst_m1       
		//    6   12:ireturn         
			return refnum != pdfcrossreference.refnum ? 1 : 0;
		//    7   13:aload_0         
		//    8   14:getfield        #30  <Field int refnum>
		//    9   17:aload_1         
		//   10   18:getfield        #30  <Field int refnum>
		//   11   21:icmpne          26
		//   12   24:iconst_0        
		//   13   25:ireturn         
		//   14   26:iconst_1        
		//   15   27:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((PdfBody.PdfCrossReference)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    3    5:invokevirtual   #40  <Method int compareTo(PdfWriter$PdfBody$PdfCrossReference)>
		//    4    8:ireturn         
		}

		public boolean equals(Object obj)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			boolean flag = flag1;
		//    2    2:iload_3         
		//    3    3:istore_2        
			if(obj instanceof PdfBody.PdfCrossReference)
		//*   4    4:aload_1         
		//*   5    5:instanceof      #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//*   6    8:ifeq            31
			{
				obj = ((Object) ((PdfBody.PdfCrossReference)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class PdfWriter$PdfBody$PdfCrossReference>
		//    9   15:astore_1        
				flag = flag1;
		//   10   16:iload_3         
		//   11   17:istore_2        
				if(refnum == ((PdfBody.PdfCrossReference) (obj)).refnum)
		//*  12   18:aload_0         
		//*  13   19:getfield        #30  <Field int refnum>
		//*  14   22:aload_1         
		//*  15   23:getfield        #30  <Field int refnum>
		//*  16   26:icmpne          31
					flag = true;
		//   17   29:iconst_1        
		//   18   30:istore_2        
			}
			return flag;
		//   19   31:iload_2         
		//   20   32:ireturn         
		}

		public int getRefnum()
		{
			return refnum;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int refnum>
		//    2    4:ireturn         
		}

		public int hashCode()
		{
			return refnum;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int refnum>
		//    2    4:ireturn         
		}

		public void toPdf(int i, OutputStream outputstream)
			throws IOException
		{
			outputstream.write(((int) ((byte)type)));
		//    0    0:aload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #26  <Field int type>
		//    3    5:int2byte        
		//    4    6:invokevirtual   #55  <Method void OutputStream.write(int)>
			do
			{
				i--;
		//    5    9:iload_1         
		//    6   10:iconst_1        
		//    7   11:isub            
		//    8   12:istore_1        
				if(i >= 0)
		//*   9   13:iload_1         
		//*  10   14:iflt            39
				{
					outputstream.write(((int) ((byte)(int)(offset >>> i * 8 & 255L))));
		//   11   17:aload_2         
		//   12   18:aload_0         
		//   13   19:getfield        #28  <Field long offset>
		//   14   22:iload_1         
		//   15   23:bipush          8
		//   16   25:imul            
		//   17   26:lushr           
		//   18   27:ldc2w           #56  <Long 255L>
		//   19   30:land            
		//   20   31:l2i             
		//   21   32:int2byte        
		//   22   33:invokevirtual   #55  <Method void OutputStream.write(int)>
				} else
		//*  23   36:goto            9
				{
					outputstream.write(((int) ((byte)(generation >>> 8 & 0xff))));
		//   24   39:aload_2         
		//   25   40:aload_0         
		//   26   41:getfield        #32  <Field int generation>
		//   27   44:bipush          8
		//   28   46:iushr           
		//   29   47:sipush          255
		//   30   50:iand            
		//   31   51:int2byte        
		//   32   52:invokevirtual   #55  <Method void OutputStream.write(int)>
					outputstream.write(((int) ((byte)(generation & 0xff))));
		//   33   55:aload_2         
		//   34   56:aload_0         
		//   35   57:getfield        #32  <Field int generation>
		//   36   60:sipush          255
		//   37   63:iand            
		//   38   64:int2byte        
		//   39   65:invokevirtual   #55  <Method void OutputStream.write(int)>
					return;
		//   40   68:return          
				}
			} while(true);
		}

		public void toPdf(OutputStream outputstream)
			throws IOException
		{
			StringBuffer stringbuffer = (new StringBuffer("0000000000")).append(offset);
		//    0    0:new             #61  <Class StringBuffer>
		//    1    3:dup             
		//    2    4:ldc1            #63  <String "0000000000">
		//    3    6:invokespecial   #66  <Method void StringBuffer(String)>
		//    4    9:aload_0         
		//    5   10:getfield        #28  <Field long offset>
		//    6   13:invokevirtual   #70  <Method StringBuffer StringBuffer.append(long)>
		//    7   16:astore_3        
			stringbuffer.delete(0, stringbuffer.length() - 10);
		//    8   17:aload_3         
		//    9   18:iconst_0        
		//   10   19:aload_3         
		//   11   20:invokevirtual   #73  <Method int StringBuffer.length()>
		//   12   23:bipush          10
		//   13   25:isub            
		//   14   26:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
		//   15   29:pop             
			Object obj = ((Object) ((new StringBuffer("00000")).append(generation)));
		//   16   30:new             #61  <Class StringBuffer>
		//   17   33:dup             
		//   18   34:ldc1            #79  <String "00000">
		//   19   36:invokespecial   #66  <Method void StringBuffer(String)>
		//   20   39:aload_0         
		//   21   40:getfield        #32  <Field int generation>
		//   22   43:invokevirtual   #82  <Method StringBuffer StringBuffer.append(int)>
		//   23   46:astore_2        
			((StringBuffer) (obj)).delete(0, ((StringBuffer) (obj)).length() - 5);
		//   24   47:aload_2         
		//   25   48:iconst_0        
		//   26   49:aload_2         
		//   27   50:invokevirtual   #73  <Method int StringBuffer.length()>
		//   28   53:iconst_5        
		//   29   54:isub            
		//   30   55:invokevirtual   #77  <Method StringBuffer StringBuffer.delete(int, int)>
		//   31   58:pop             
			StringBuffer stringbuffer1 = stringbuffer.append(' ').append(((StringBuffer) (obj)));
		//   32   59:aload_3         
		//   33   60:bipush          32
		//   34   62:invokevirtual   #85  <Method StringBuffer StringBuffer.append(char)>
		//   35   65:aload_2         
		//   36   66:invokevirtual   #88  <Method StringBuffer StringBuffer.append(StringBuffer)>
		//   37   69:astore          4
			if(generation == 65535)
		//*  38   71:aload_0         
		//*  39   72:getfield        #32  <Field int generation>
		//*  40   75:ldc1            #89  <Int 65535>
		//*  41   77:icmpne          102
				obj = " f \n";
		//   42   80:ldc1            #91  <String " f \n">
		//   43   82:astore_2        
			else
		//*  44   83:aload           4
		//*  45   85:aload_2         
		//*  46   86:invokevirtual   #94  <Method StringBuffer StringBuffer.append(String)>
		//*  47   89:pop             
		//*  48   90:aload_1         
		//*  49   91:aload_3         
		//*  50   92:invokevirtual   #98  <Method String StringBuffer.toString()>
		//*  51   95:invokestatic    #104 <Method byte[] DocWriter.getISOBytes(String)>
		//*  52   98:invokevirtual   #107 <Method void OutputStream.write(byte[])>
		//*  53  101:return          
				obj = " n \n";
		//   54  102:ldc1            #109 <String " n \n">
		//   55  104:astore_2        
			stringbuffer1.append(((String) (obj)));
			outputstream.write(DocWriter.getISOBytes(stringbuffer.toString()));
		//*  56  105:goto            83
		}

		private final int generation;
		private final long offset;
		private final int refnum;
		private final int type;

		public PdfBody.PdfCrossReference(int i, int j, long l, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #28  <Field long offset>
			refnum = j;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #30  <Field int refnum>
			generation = k;
		//   11   19:aload_0         
		//   12   20:iload           5
		//   13   22:putfield        #32  <Field int generation>
		//   14   25:return          
		}

		public PdfBody.PdfCrossReference(int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #28  <Field long offset>
			refnum = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #30  <Field int refnum>
			generation = 0;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #32  <Field int generation>
		//   14   24:return          
		}

		public PdfBody.PdfCrossReference(int i, long l, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #26  <Field int type>
			offset = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #28  <Field long offset>
			refnum = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #30  <Field int refnum>
			generation = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field int generation>
		//   14   25:return          
		}
	}

	public static class PdfTrailer extends PdfDictionary
	{

		public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
			throws IOException
		{
			PdfWriter.checkPdfIsoConformance(pdfwriter, 8, ((Object) (this)));
		//    0    0:aload_1         
		//    1    1:bipush          8
		//    2    3:aload_0         
		//    3    4:invokestatic    #58  <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
			outputstream.write(DocWriter.getISOBytes("trailer\n"));
		//    4    7:aload_2         
		//    5    8:ldc1            #60  <String "trailer\n">
		//    6   10:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
		//    7   13:invokevirtual   #72  <Method void OutputStream.write(byte[])>
			super.toPdf(((PdfWriter) (null)), outputstream);
		//    8   16:aload_0         
		//    9   17:aconst_null     
		//   10   18:aload_2         
		//   11   19:invokespecial   #74  <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
			outputstream.write(10);
		//   12   22:aload_2         
		//   13   23:bipush          10
		//   14   25:invokevirtual   #76  <Method void OutputStream.write(int)>
			PdfWriter.writeKeyInfo(outputstream);
		//   15   28:aload_2         
		//   16   29:invokestatic    #80  <Method void PdfWriter.writeKeyInfo(OutputStream)>
			outputstream.write(DocWriter.getISOBytes("startxref\n"));
		//   17   32:aload_2         
		//   18   33:ldc1            #82  <String "startxref\n">
		//   19   35:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
		//   20   38:invokevirtual   #72  <Method void OutputStream.write(byte[])>
			outputstream.write(DocWriter.getISOBytes(String.valueOf(offset)));
		//   21   41:aload_2         
		//   22   42:aload_0         
		//   23   43:getfield        #16  <Field long offset>
		//   24   46:invokestatic    #88  <Method String String.valueOf(long)>
		//   25   49:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
		//   26   52:invokevirtual   #72  <Method void OutputStream.write(byte[])>
			outputstream.write(DocWriter.getISOBytes("\n%%EOF\n"));
		//   27   55:aload_2         
		//   28   56:ldc1            #90  <String "\n%%EOF\n">
		//   29   58:invokestatic    #66  <Method byte[] DocWriter.getISOBytes(String)>
		//   30   61:invokevirtual   #72  <Method void OutputStream.write(byte[])>
		//   31   64:return          
		}

		long offset;

		public PdfTrailer(int i, long l, PdfIndirectReference pdfindirectreference, PdfIndirectReference pdfindirectreference1, PdfIndirectReference pdfindirectreference2, PdfObject pdfobject, 
				long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void PdfDictionary()>
			offset = l;
		//    2    4:aload_0         
		//    3    5:lload_2         
		//    4    6:putfield        #16  <Field long offset>
			put(PdfName.SIZE, ((PdfObject) (new PdfNumber(i))));
		//    5    9:aload_0         
		//    6   10:getstatic       #22  <Field PdfName PdfName.SIZE>
		//    7   13:new             #24  <Class PdfNumber>
		//    8   16:dup             
		//    9   17:iload_1         
		//   10   18:invokespecial   #27  <Method void PdfNumber(int)>
		//   11   21:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
			put(PdfName.ROOT, ((PdfObject) (pdfindirectreference)));
		//   12   24:aload_0         
		//   13   25:getstatic       #34  <Field PdfName PdfName.ROOT>
		//   14   28:aload           4
		//   15   30:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
			if(pdfindirectreference1 != null)
		//*  16   33:aload           5
		//*  17   35:ifnull          47
				put(PdfName.INFO, ((PdfObject) (pdfindirectreference1)));
		//   18   38:aload_0         
		//   19   39:getstatic       #37  <Field PdfName PdfName.INFO>
		//   20   42:aload           5
		//   21   44:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
			if(pdfindirectreference2 != null)
		//*  22   47:aload           6
		//*  23   49:ifnull          61
				put(PdfName.ENCRYPT, ((PdfObject) (pdfindirectreference2)));
		//   24   52:aload_0         
		//   25   53:getstatic       #40  <Field PdfName PdfName.ENCRYPT>
		//   26   56:aload           6
		//   27   58:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
			if(pdfobject != null)
		//*  28   61:aload           7
		//*  29   63:ifnull          75
				put(PdfName.ID, pdfobject);
		//   30   66:aload_0         
		//   31   67:getstatic       #43  <Field PdfName PdfName.ID>
		//   32   70:aload           7
		//   33   72:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
			if(l1 > 0L)
		//*  34   75:lload           8
		//*  35   77:lconst_0        
		//*  36   78:lcmp            
		//*  37   79:ifle            98
				put(PdfName.PREV, ((PdfObject) (new PdfNumber(l1))));
		//   38   82:aload_0         
		//   39   83:getstatic       #46  <Field PdfName PdfName.PREV>
		//   40   86:new             #24  <Class PdfNumber>
		//   41   89:dup             
		//   42   90:lload           8
		//   43   92:invokespecial   #49  <Method void PdfNumber(long)>
		//   44   95:invokevirtual   #31  <Method void put(PdfName, PdfObject)>
		//   45   98:return          
		}
	}


	protected PdfWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #490 <Method void DocWriter()>
		root = new PdfPages(this);
	//    2    4:aload_0         
	//    3    5:new             #492 <Class PdfPages>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #495 <Method void PdfPages(PdfWriter)>
	//    7   13:putfield        #497 <Field PdfPages root>
		pageReferences = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #499 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #500 <Method void ArrayList()>
	//   12   24:putfield        #502 <Field ArrayList pageReferences>
		currentPageNumber = 1;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #504 <Field int currentPageNumber>
		tabs = null;
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:putfield        #506 <Field PdfName tabs>
		pageDictEntries = new PdfDictionary();
	//   19   37:aload_0         
	//   20   38:new             #508 <Class PdfDictionary>
	//   21   41:dup             
	//   22   42:invokespecial   #509 <Method void PdfDictionary()>
	//   23   45:putfield        #511 <Field PdfDictionary pageDictEntries>
		prevxref = 0L;
	//   24   48:aload_0         
	//   25   49:lconst_0        
	//   26   50:putfield        #513 <Field long prevxref>
		originalFileID = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #515 <Field byte[] originalFileID>
		pdf_version = new PdfVersionImp();
	//   30   58:aload_0         
	//   31   59:new             #517 <Class PdfVersionImp>
	//   32   62:dup             
	//   33   63:invokespecial   #518 <Method void PdfVersionImp()>
	//   34   66:putfield        #520 <Field PdfVersionImp pdf_version>
		xmpMetadata = null;
	//   35   69:aload_0         
	//   36   70:aconst_null     
	//   37   71:putfield        #522 <Field byte[] xmpMetadata>
		xmpWriter = null;
	//   38   74:aload_0         
	//   39   75:aconst_null     
	//   40   76:putfield        #524 <Field XmpWriter xmpWriter>
		pdfIsoConformance = initPdfIsoConformance();
	//   41   79:aload_0         
	//   42   80:aload_0         
	//   43   81:invokevirtual   #528 <Method PdfIsoConformance initPdfIsoConformance()>
	//   44   84:putfield        #530 <Field PdfIsoConformance pdfIsoConformance>
		fullCompression = false;
	//   45   87:aload_0         
	//   46   88:iconst_0        
	//   47   89:putfield        #532 <Field boolean fullCompression>
		compressionLevel = -1;
	//   48   92:aload_0         
	//   49   93:iconst_m1       
	//   50   94:putfield        #534 <Field int compressionLevel>
		documentFonts = new LinkedHashMap();
	//   51   97:aload_0         
	//   52   98:new             #536 <Class LinkedHashMap>
	//   53  101:dup             
	//   54  102:invokespecial   #537 <Method void LinkedHashMap()>
	//   55  105:putfield        #539 <Field LinkedHashMap documentFonts>
		fontNumber = 1;
	//   56  108:aload_0         
	//   57  109:iconst_1        
	//   58  110:putfield        #541 <Field int fontNumber>
		formXObjects = new HashMap();
	//   59  113:aload_0         
	//   60  114:new             #543 <Class HashMap>
	//   61  117:dup             
	//   62  118:invokespecial   #544 <Method void HashMap()>
	//   63  121:putfield        #546 <Field HashMap formXObjects>
		formXObjectsCounter = 1;
	//   64  124:aload_0         
	//   65  125:iconst_1        
	//   66  126:putfield        #548 <Field int formXObjectsCounter>
		readerInstances = new HashMap();
	//   67  129:aload_0         
	//   68  130:new             #543 <Class HashMap>
	//   69  133:dup             
	//   70  134:invokespecial   #544 <Method void HashMap()>
	//   71  137:putfield        #550 <Field HashMap readerInstances>
		documentColors = new HashMap();
	//   72  140:aload_0         
	//   73  141:new             #543 <Class HashMap>
	//   74  144:dup             
	//   75  145:invokespecial   #544 <Method void HashMap()>
	//   76  148:putfield        #552 <Field HashMap documentColors>
		colorNumber = 1;
	//   77  151:aload_0         
	//   78  152:iconst_1        
	//   79  153:putfield        #554 <Field int colorNumber>
		documentPatterns = new HashMap();
	//   80  156:aload_0         
	//   81  157:new             #543 <Class HashMap>
	//   82  160:dup             
	//   83  161:invokespecial   #544 <Method void HashMap()>
	//   84  164:putfield        #556 <Field HashMap documentPatterns>
		patternNumber = 1;
	//   85  167:aload_0         
	//   86  168:iconst_1        
	//   87  169:putfield        #558 <Field int patternNumber>
		documentShadingPatterns = new HashSet();
	//   88  172:aload_0         
	//   89  173:new             #560 <Class HashSet>
	//   90  176:dup             
	//   91  177:invokespecial   #561 <Method void HashSet()>
	//   92  180:putfield        #563 <Field HashSet documentShadingPatterns>
		documentShadings = new HashSet();
	//   93  183:aload_0         
	//   94  184:new             #560 <Class HashSet>
	//   95  187:dup             
	//   96  188:invokespecial   #561 <Method void HashSet()>
	//   97  191:putfield        #565 <Field HashSet documentShadings>
		documentExtGState = new HashMap();
	//   98  194:aload_0         
	//   99  195:new             #543 <Class HashMap>
	//  100  198:dup             
	//  101  199:invokespecial   #544 <Method void HashMap()>
	//  102  202:putfield        #567 <Field HashMap documentExtGState>
		documentProperties = new HashMap();
	//  103  205:aload_0         
	//  104  206:new             #543 <Class HashMap>
	//  105  209:dup             
	//  106  210:invokespecial   #544 <Method void HashMap()>
	//  107  213:putfield        #569 <Field HashMap documentProperties>
		tagged = false;
	//  108  216:aload_0         
	//  109  217:iconst_0        
	//  110  218:putfield        #571 <Field boolean tagged>
		taggingMode = 1;
	//  111  221:aload_0         
	//  112  222:iconst_1        
	//  113  223:putfield        #573 <Field int taggingMode>
		documentOCG = new LinkedHashSet();
	//  114  226:aload_0         
	//  115  227:new             #575 <Class LinkedHashSet>
	//  116  230:dup             
	//  117  231:invokespecial   #576 <Method void LinkedHashSet()>
	//  118  234:putfield        #578 <Field LinkedHashSet documentOCG>
		documentOCGorder = new ArrayList();
	//  119  237:aload_0         
	//  120  238:new             #499 <Class ArrayList>
	//  121  241:dup             
	//  122  242:invokespecial   #500 <Method void ArrayList()>
	//  123  245:putfield        #580 <Field ArrayList documentOCGorder>
		OCGRadioGroup = new PdfArray();
	//  124  248:aload_0         
	//  125  249:new             #582 <Class PdfArray>
	//  126  252:dup             
	//  127  253:invokespecial   #583 <Method void PdfArray()>
	//  128  256:putfield        #585 <Field PdfArray OCGRadioGroup>
		OCGLocked = new PdfArray();
	//  129  259:aload_0         
	//  130  260:new             #582 <Class PdfArray>
	//  131  263:dup             
	//  132  264:invokespecial   #583 <Method void PdfArray()>
	//  133  267:putfield        #587 <Field PdfArray OCGLocked>
		spaceCharRatio = 2.5F;
	//  134  270:aload_0         
	//  135  271:ldc1            #135 <Float 2.5F>
	//  136  273:putfield        #589 <Field float spaceCharRatio>
		runDirection = 1;
	//  137  276:aload_0         
	//  138  277:iconst_1        
	//  139  278:putfield        #591 <Field int runDirection>
		defaultColorspace = new PdfDictionary();
	//  140  281:aload_0         
	//  141  282:new             #508 <Class PdfDictionary>
	//  142  285:dup             
	//  143  286:invokespecial   #509 <Method void PdfDictionary()>
	//  144  289:putfield        #593 <Field PdfDictionary defaultColorspace>
		documentSpotPatterns = new HashMap();
	//  145  292:aload_0         
	//  146  293:new             #543 <Class HashMap>
	//  147  296:dup             
	//  148  297:invokespecial   #544 <Method void HashMap()>
	//  149  300:putfield        #595 <Field HashMap documentSpotPatterns>
		imageDictionary = new PdfDictionary();
	//  150  303:aload_0         
	//  151  304:new             #508 <Class PdfDictionary>
	//  152  307:dup             
	//  153  308:invokespecial   #509 <Method void PdfDictionary()>
	//  154  311:putfield        #597 <Field PdfDictionary imageDictionary>
		images = new HashMap();
	//  155  314:aload_0         
	//  156  315:new             #543 <Class HashMap>
	//  157  318:dup             
	//  158  319:invokespecial   #544 <Method void HashMap()>
	//  159  322:putfield        #599 <Field HashMap images>
		JBIG2Globals = new HashMap();
	//  160  325:aload_0         
	//  161  326:new             #543 <Class HashMap>
	//  162  329:dup             
	//  163  330:invokespecial   #544 <Method void HashMap()>
	//  164  333:putfield        #601 <Field HashMap JBIG2Globals>
		ttfUnicodeWriter = null;
	//  165  336:aload_0         
	//  166  337:aconst_null     
	//  167  338:putfield        #603 <Field TtfUnicodeWriter ttfUnicodeWriter>
	//  168  341:return          
	}

	protected PdfWriter(PdfDocument pdfdocument, OutputStream outputstream)
	{
		super(((Document) (pdfdocument)), outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #607 <Method void DocWriter(Document, OutputStream)>
		root = new PdfPages(this);
	//    4    6:aload_0         
	//    5    7:new             #492 <Class PdfPages>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #495 <Method void PdfPages(PdfWriter)>
	//    9   15:putfield        #497 <Field PdfPages root>
		pageReferences = new ArrayList();
	//   10   18:aload_0         
	//   11   19:new             #499 <Class ArrayList>
	//   12   22:dup             
	//   13   23:invokespecial   #500 <Method void ArrayList()>
	//   14   26:putfield        #502 <Field ArrayList pageReferences>
		currentPageNumber = 1;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #504 <Field int currentPageNumber>
		tabs = null;
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:putfield        #506 <Field PdfName tabs>
		pageDictEntries = new PdfDictionary();
	//   21   39:aload_0         
	//   22   40:new             #508 <Class PdfDictionary>
	//   23   43:dup             
	//   24   44:invokespecial   #509 <Method void PdfDictionary()>
	//   25   47:putfield        #511 <Field PdfDictionary pageDictEntries>
		prevxref = 0L;
	//   26   50:aload_0         
	//   27   51:lconst_0        
	//   28   52:putfield        #513 <Field long prevxref>
		originalFileID = null;
	//   29   55:aload_0         
	//   30   56:aconst_null     
	//   31   57:putfield        #515 <Field byte[] originalFileID>
		pdf_version = new PdfVersionImp();
	//   32   60:aload_0         
	//   33   61:new             #517 <Class PdfVersionImp>
	//   34   64:dup             
	//   35   65:invokespecial   #518 <Method void PdfVersionImp()>
	//   36   68:putfield        #520 <Field PdfVersionImp pdf_version>
		xmpMetadata = null;
	//   37   71:aload_0         
	//   38   72:aconst_null     
	//   39   73:putfield        #522 <Field byte[] xmpMetadata>
		xmpWriter = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #524 <Field XmpWriter xmpWriter>
		pdfIsoConformance = initPdfIsoConformance();
	//   43   81:aload_0         
	//   44   82:aload_0         
	//   45   83:invokevirtual   #528 <Method PdfIsoConformance initPdfIsoConformance()>
	//   46   86:putfield        #530 <Field PdfIsoConformance pdfIsoConformance>
		fullCompression = false;
	//   47   89:aload_0         
	//   48   90:iconst_0        
	//   49   91:putfield        #532 <Field boolean fullCompression>
		compressionLevel = -1;
	//   50   94:aload_0         
	//   51   95:iconst_m1       
	//   52   96:putfield        #534 <Field int compressionLevel>
		documentFonts = new LinkedHashMap();
	//   53   99:aload_0         
	//   54  100:new             #536 <Class LinkedHashMap>
	//   55  103:dup             
	//   56  104:invokespecial   #537 <Method void LinkedHashMap()>
	//   57  107:putfield        #539 <Field LinkedHashMap documentFonts>
		fontNumber = 1;
	//   58  110:aload_0         
	//   59  111:iconst_1        
	//   60  112:putfield        #541 <Field int fontNumber>
		formXObjects = new HashMap();
	//   61  115:aload_0         
	//   62  116:new             #543 <Class HashMap>
	//   63  119:dup             
	//   64  120:invokespecial   #544 <Method void HashMap()>
	//   65  123:putfield        #546 <Field HashMap formXObjects>
		formXObjectsCounter = 1;
	//   66  126:aload_0         
	//   67  127:iconst_1        
	//   68  128:putfield        #548 <Field int formXObjectsCounter>
		readerInstances = new HashMap();
	//   69  131:aload_0         
	//   70  132:new             #543 <Class HashMap>
	//   71  135:dup             
	//   72  136:invokespecial   #544 <Method void HashMap()>
	//   73  139:putfield        #550 <Field HashMap readerInstances>
		documentColors = new HashMap();
	//   74  142:aload_0         
	//   75  143:new             #543 <Class HashMap>
	//   76  146:dup             
	//   77  147:invokespecial   #544 <Method void HashMap()>
	//   78  150:putfield        #552 <Field HashMap documentColors>
		colorNumber = 1;
	//   79  153:aload_0         
	//   80  154:iconst_1        
	//   81  155:putfield        #554 <Field int colorNumber>
		documentPatterns = new HashMap();
	//   82  158:aload_0         
	//   83  159:new             #543 <Class HashMap>
	//   84  162:dup             
	//   85  163:invokespecial   #544 <Method void HashMap()>
	//   86  166:putfield        #556 <Field HashMap documentPatterns>
		patternNumber = 1;
	//   87  169:aload_0         
	//   88  170:iconst_1        
	//   89  171:putfield        #558 <Field int patternNumber>
		documentShadingPatterns = new HashSet();
	//   90  174:aload_0         
	//   91  175:new             #560 <Class HashSet>
	//   92  178:dup             
	//   93  179:invokespecial   #561 <Method void HashSet()>
	//   94  182:putfield        #563 <Field HashSet documentShadingPatterns>
		documentShadings = new HashSet();
	//   95  185:aload_0         
	//   96  186:new             #560 <Class HashSet>
	//   97  189:dup             
	//   98  190:invokespecial   #561 <Method void HashSet()>
	//   99  193:putfield        #565 <Field HashSet documentShadings>
		documentExtGState = new HashMap();
	//  100  196:aload_0         
	//  101  197:new             #543 <Class HashMap>
	//  102  200:dup             
	//  103  201:invokespecial   #544 <Method void HashMap()>
	//  104  204:putfield        #567 <Field HashMap documentExtGState>
		documentProperties = new HashMap();
	//  105  207:aload_0         
	//  106  208:new             #543 <Class HashMap>
	//  107  211:dup             
	//  108  212:invokespecial   #544 <Method void HashMap()>
	//  109  215:putfield        #569 <Field HashMap documentProperties>
		tagged = false;
	//  110  218:aload_0         
	//  111  219:iconst_0        
	//  112  220:putfield        #571 <Field boolean tagged>
		taggingMode = 1;
	//  113  223:aload_0         
	//  114  224:iconst_1        
	//  115  225:putfield        #573 <Field int taggingMode>
		documentOCG = new LinkedHashSet();
	//  116  228:aload_0         
	//  117  229:new             #575 <Class LinkedHashSet>
	//  118  232:dup             
	//  119  233:invokespecial   #576 <Method void LinkedHashSet()>
	//  120  236:putfield        #578 <Field LinkedHashSet documentOCG>
		documentOCGorder = new ArrayList();
	//  121  239:aload_0         
	//  122  240:new             #499 <Class ArrayList>
	//  123  243:dup             
	//  124  244:invokespecial   #500 <Method void ArrayList()>
	//  125  247:putfield        #580 <Field ArrayList documentOCGorder>
		OCGRadioGroup = new PdfArray();
	//  126  250:aload_0         
	//  127  251:new             #582 <Class PdfArray>
	//  128  254:dup             
	//  129  255:invokespecial   #583 <Method void PdfArray()>
	//  130  258:putfield        #585 <Field PdfArray OCGRadioGroup>
		OCGLocked = new PdfArray();
	//  131  261:aload_0         
	//  132  262:new             #582 <Class PdfArray>
	//  133  265:dup             
	//  134  266:invokespecial   #583 <Method void PdfArray()>
	//  135  269:putfield        #587 <Field PdfArray OCGLocked>
		spaceCharRatio = 2.5F;
	//  136  272:aload_0         
	//  137  273:ldc1            #135 <Float 2.5F>
	//  138  275:putfield        #589 <Field float spaceCharRatio>
		runDirection = 1;
	//  139  278:aload_0         
	//  140  279:iconst_1        
	//  141  280:putfield        #591 <Field int runDirection>
		defaultColorspace = new PdfDictionary();
	//  142  283:aload_0         
	//  143  284:new             #508 <Class PdfDictionary>
	//  144  287:dup             
	//  145  288:invokespecial   #509 <Method void PdfDictionary()>
	//  146  291:putfield        #593 <Field PdfDictionary defaultColorspace>
		documentSpotPatterns = new HashMap();
	//  147  294:aload_0         
	//  148  295:new             #543 <Class HashMap>
	//  149  298:dup             
	//  150  299:invokespecial   #544 <Method void HashMap()>
	//  151  302:putfield        #595 <Field HashMap documentSpotPatterns>
		imageDictionary = new PdfDictionary();
	//  152  305:aload_0         
	//  153  306:new             #508 <Class PdfDictionary>
	//  154  309:dup             
	//  155  310:invokespecial   #509 <Method void PdfDictionary()>
	//  156  313:putfield        #597 <Field PdfDictionary imageDictionary>
		images = new HashMap();
	//  157  316:aload_0         
	//  158  317:new             #543 <Class HashMap>
	//  159  320:dup             
	//  160  321:invokespecial   #544 <Method void HashMap()>
	//  161  324:putfield        #599 <Field HashMap images>
		JBIG2Globals = new HashMap();
	//  162  327:aload_0         
	//  163  328:new             #543 <Class HashMap>
	//  164  331:dup             
	//  165  332:invokespecial   #544 <Method void HashMap()>
	//  166  335:putfield        #601 <Field HashMap JBIG2Globals>
		ttfUnicodeWriter = null;
	//  167  338:aload_0         
	//  168  339:aconst_null     
	//  169  340:putfield        #603 <Field TtfUnicodeWriter ttfUnicodeWriter>
		pdf = pdfdocument;
	//  170  343:aload_0         
	//  171  344:aload_1         
	//  172  345:putfield        #609 <Field PdfDocument pdf>
		directContentUnder = new PdfContentByte(this);
	//  173  348:aload_0         
	//  174  349:new             #611 <Class PdfContentByte>
	//  175  352:dup             
	//  176  353:aload_0         
	//  177  354:invokespecial   #612 <Method void PdfContentByte(PdfWriter)>
	//  178  357:putfield        #614 <Field PdfContentByte directContentUnder>
		directContent = directContentUnder.getDuplicate();
	//  179  360:aload_0         
	//  180  361:aload_0         
	//  181  362:getfield        #614 <Field PdfContentByte directContentUnder>
	//  182  365:invokevirtual   #618 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//  183  368:putfield        #620 <Field PdfContentByte directContent>
	//  184  371:return          
	}

	private void addASEvent(PdfName pdfname, PdfName pdfname1)
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #582 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #583 <Method void PdfArray()>
	//    3    7:astore          5
		Object obj = ((Object) (documentOCG.iterator()));
	//    4    9:aload_0         
	//    5   10:getfield        #578 <Field LinkedHashSet documentOCG>
	//    6   13:invokevirtual   #626 <Method Iterator LinkedHashSet.iterator()>
	//    7   16:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//    8   17:aload_3         
	//    9   18:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   10   23:ifeq            75
			PdfLayer pdflayer = (PdfLayer)((Iterator) (obj)).next();
	//   11   26:aload_3         
	//   12   27:invokeinterface #636 <Method Object Iterator.next()>
	//   13   32:checkcast       #638 <Class PdfLayer>
	//   14   35:astore          4
			PdfDictionary pdfdictionary = pdflayer.getAsDict(PdfName.USAGE);
	//   15   37:aload           4
	//   16   39:getstatic       #641 <Field PdfName PdfName.USAGE>
	//   17   42:invokevirtual   #645 <Method PdfDictionary PdfLayer.getAsDict(PdfName)>
	//   18   45:astore          6
			if(pdfdictionary != null && pdfdictionary.get(pdfname1) != null)
	//*  19   47:aload           6
	//*  20   49:ifnull          17
	//*  21   52:aload           6
	//*  22   54:aload_2         
	//*  23   55:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  24   58:ifnull          17
				pdfarray.add(((PdfObject) (pdflayer.getRef())));
	//   25   61:aload           5
	//   26   63:aload           4
	//   27   65:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//   28   68:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   29   71:pop             
		} while(true);
	//   30   72:goto            17
		if(pdfarray.size() == 0)
	//*  31   75:aload           5
	//*  32   77:invokevirtual   #661 <Method int PdfArray.size()>
	//*  33   80:ifne            84
			return;
	//   34   83:return          
		PdfDictionary pdfdictionary1 = OCProperties.getAsDict(PdfName.D);
	//   35   84:aload_0         
	//   36   85:getfield        #663 <Field PdfOCProperties OCProperties>
	//   37   88:getstatic       #666 <Field PdfName PdfName.D>
	//   38   91:invokevirtual   #669 <Method PdfDictionary PdfOCProperties.getAsDict(PdfName)>
	//   39   94:astore          6
		Object obj1 = ((Object) (pdfdictionary1.getAsArray(PdfName.AS)));
	//   40   96:aload           6
	//   41   98:getstatic       #672 <Field PdfName PdfName.AS>
	//   42  101:invokevirtual   #676 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   43  104:astore          4
		obj = obj1;
	//   44  106:aload           4
	//   45  108:astore_3        
		if(obj1 == null)
	//*  46  109:aload           4
	//*  47  111:ifnonnull       131
		{
			obj = ((Object) (new PdfArray()));
	//   48  114:new             #582 <Class PdfArray>
	//   49  117:dup             
	//   50  118:invokespecial   #583 <Method void PdfArray()>
	//   51  121:astore_3        
			pdfdictionary1.put(PdfName.AS, ((PdfObject) (obj)));
	//   52  122:aload           6
	//   53  124:getstatic       #672 <Field PdfName PdfName.AS>
	//   54  127:aload_3         
	//   55  128:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		obj1 = ((Object) (new PdfDictionary()));
	//   56  131:new             #508 <Class PdfDictionary>
	//   57  134:dup             
	//   58  135:invokespecial   #509 <Method void PdfDictionary()>
	//   59  138:astore          4
		((PdfDictionary) (obj1)).put(PdfName.EVENT, ((PdfObject) (pdfname)));
	//   60  140:aload           4
	//   61  142:getstatic       #683 <Field PdfName PdfName.EVENT>
	//   62  145:aload_1         
	//   63  146:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj1)).put(PdfName.CATEGORY, ((PdfObject) (new PdfArray(((PdfObject) (pdfname1))))));
	//   64  149:aload           4
	//   65  151:getstatic       #686 <Field PdfName PdfName.CATEGORY>
	//   66  154:new             #582 <Class PdfArray>
	//   67  157:dup             
	//   68  158:aload_2         
	//   69  159:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//   70  162:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj1)).put(PdfName.OCGS, ((PdfObject) (pdfarray)));
	//   71  165:aload           4
	//   72  167:getstatic       #692 <Field PdfName PdfName.OCGS>
	//   73  170:aload           5
	//   74  172:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfArray) (obj)).add(((PdfObject) (obj1)));
	//   75  175:aload_3         
	//   76  176:aload           4
	//   77  178:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   78  181:pop             
	//   79  182:return          
	}

	public static void checkPdfIsoConformance(PdfWriter pdfwriter, int i, Object obj)
	{
		if(pdfwriter != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
			pdfwriter.checkPdfIsoConformance(i, obj);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #697 <Method void checkPdfIsoConformance(int, Object)>
	//    6   10:return          
	}

	private void completeExtraCatalog(PdfDictionary pdfdictionary)
	{
		if(isPdfX() && pdfdictionary.get(PdfName.OUTPUTINTENTS) == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #702 <Method boolean isPdfX()>
	//*   2    4:ifeq            121
	//*   3    7:aload_1         
	//*   4    8:getstatic       #705 <Field PdfName PdfName.OUTPUTINTENTS>
	//*   5   11:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*   6   14:ifnonnull       121
		{
			PdfDictionary pdfdictionary1 = new PdfDictionary(PdfName.OUTPUTINTENT);
	//    7   17:new             #508 <Class PdfDictionary>
	//    8   20:dup             
	//    9   21:getstatic       #708 <Field PdfName PdfName.OUTPUTINTENT>
	//   10   24:invokespecial   #711 <Method void PdfDictionary(PdfName)>
	//   11   27:astore_2        
			pdfdictionary1.put(PdfName.OUTPUTCONDITION, ((PdfObject) (new PdfString("SWOP CGATS TR 001-1995"))));
	//   12   28:aload_2         
	//   13   29:getstatic       #714 <Field PdfName PdfName.OUTPUTCONDITION>
	//   14   32:new             #716 <Class PdfString>
	//   15   35:dup             
	//   16   36:ldc2            #718 <String "SWOP CGATS TR 001-1995">
	//   17   39:invokespecial   #719 <Method void PdfString(String)>
	//   18   42:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.OUTPUTCONDITIONIDENTIFIER, ((PdfObject) (new PdfString("CGATS TR 001"))));
	//   19   45:aload_2         
	//   20   46:getstatic       #722 <Field PdfName PdfName.OUTPUTCONDITIONIDENTIFIER>
	//   21   49:new             #716 <Class PdfString>
	//   22   52:dup             
	//   23   53:ldc2            #724 <String "CGATS TR 001">
	//   24   56:invokespecial   #719 <Method void PdfString(String)>
	//   25   59:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.REGISTRYNAME, ((PdfObject) (new PdfString("http://www.color.org"))));
	//   26   62:aload_2         
	//   27   63:getstatic       #727 <Field PdfName PdfName.REGISTRYNAME>
	//   28   66:new             #716 <Class PdfString>
	//   29   69:dup             
	//   30   70:ldc2            #729 <String "http://www.color.org">
	//   31   73:invokespecial   #719 <Method void PdfString(String)>
	//   32   76:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.INFO, ((PdfObject) (new PdfString(""))));
	//   33   79:aload_2         
	//   34   80:getstatic       #732 <Field PdfName PdfName.INFO>
	//   35   83:new             #716 <Class PdfString>
	//   36   86:dup             
	//   37   87:ldc2            #734 <String "">
	//   38   90:invokespecial   #719 <Method void PdfString(String)>
	//   39   93:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.S, ((PdfObject) (PdfName.GTS_PDFX)));
	//   40   96:aload_2         
	//   41   97:getstatic       #737 <Field PdfName PdfName.S>
	//   42  100:getstatic       #740 <Field PdfName PdfName.GTS_PDFX>
	//   43  103:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.OUTPUTINTENTS, ((PdfObject) (new PdfArray(((PdfObject) (pdfdictionary1))))));
	//   44  106:aload_1         
	//   45  107:getstatic       #705 <Field PdfName PdfName.OUTPUTINTENTS>
	//   46  110:new             #582 <Class PdfArray>
	//   47  113:dup             
	//   48  114:aload_2         
	//   49  115:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//   50  118:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
	//   51  121:return          
	}

	private void completeInfoDictionary(PdfDictionary pdfdictionary)
	{
		if(!isPdfX()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #702 <Method boolean isPdfX()>
	//    2    4:ifeq            152
_L1:
		if(pdfdictionary.get(PdfName.GTS_PDFXVERSION) != null) goto _L4; else goto _L3
	//    3    7:aload_1         
	//    4    8:getstatic       #744 <Field PdfName PdfName.GTS_PDFXVERSION>
	//    5   11:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//    6   14:ifnonnull       71
_L3:
		if(!((PdfXConformanceImp)pdfIsoConformance).isPdfX1A2001()) goto _L6; else goto _L5
	//    7   17:aload_0         
	//    8   18:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    9   21:checkcast       #746 <Class PdfXConformanceImp>
	//   10   24:invokevirtual   #749 <Method boolean PdfXConformanceImp.isPdfX1A2001()>
	//   11   27:ifeq            153
_L5:
		pdfdictionary.put(PdfName.GTS_PDFXVERSION, ((PdfObject) (new PdfString("PDF/X-1:2001"))));
	//   12   30:aload_1         
	//   13   31:getstatic       #744 <Field PdfName PdfName.GTS_PDFXVERSION>
	//   14   34:new             #716 <Class PdfString>
	//   15   37:dup             
	//   16   38:ldc2            #751 <String "PDF/X-1:2001">
	//   17   41:invokespecial   #719 <Method void PdfString(String)>
	//   18   44:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(new PdfName("GTS_PDFXConformance"), ((PdfObject) (new PdfString("PDF/X-1a:2001"))));
	//   19   47:aload_1         
	//   20   48:new             #271 <Class PdfName>
	//   21   51:dup             
	//   22   52:ldc2            #753 <String "GTS_PDFXConformance">
	//   23   55:invokespecial   #277 <Method void PdfName(String)>
	//   24   58:new             #716 <Class PdfString>
	//   25   61:dup             
	//   26   62:ldc2            #755 <String "PDF/X-1a:2001">
	//   27   65:invokespecial   #719 <Method void PdfString(String)>
	//   28   68:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
_L4:
		if(pdfdictionary.get(PdfName.TITLE) == null)
	//*  29   71:aload_1         
	//*  30   72:getstatic       #758 <Field PdfName PdfName.TITLE>
	//*  31   75:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  32   78:ifnonnull       98
			pdfdictionary.put(PdfName.TITLE, ((PdfObject) (new PdfString("Pdf document"))));
	//   33   81:aload_1         
	//   34   82:getstatic       #758 <Field PdfName PdfName.TITLE>
	//   35   85:new             #716 <Class PdfString>
	//   36   88:dup             
	//   37   89:ldc2            #760 <String "Pdf document">
	//   38   92:invokespecial   #719 <Method void PdfString(String)>
	//   39   95:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfdictionary.get(PdfName.CREATOR) == null)
	//*  40   98:aload_1         
	//*  41   99:getstatic       #763 <Field PdfName PdfName.CREATOR>
	//*  42  102:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  43  105:ifnonnull       125
			pdfdictionary.put(PdfName.CREATOR, ((PdfObject) (new PdfString("Unknown"))));
	//   44  108:aload_1         
	//   45  109:getstatic       #763 <Field PdfName PdfName.CREATOR>
	//   46  112:new             #716 <Class PdfString>
	//   47  115:dup             
	//   48  116:ldc2            #765 <String "Unknown">
	//   49  119:invokespecial   #719 <Method void PdfString(String)>
	//   50  122:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfdictionary.get(PdfName.TRAPPED) == null)
	//*  51  125:aload_1         
	//*  52  126:getstatic       #768 <Field PdfName PdfName.TRAPPED>
	//*  53  129:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  54  132:ifnonnull       152
			pdfdictionary.put(PdfName.TRAPPED, ((PdfObject) (new PdfName("False"))));
	//   55  135:aload_1         
	//   56  136:getstatic       #768 <Field PdfName PdfName.TRAPPED>
	//   57  139:new             #271 <Class PdfName>
	//   58  142:dup             
	//   59  143:ldc2            #770 <String "False">
	//   60  146:invokespecial   #277 <Method void PdfName(String)>
	//   61  149:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
_L2:
		return;
	//   62  152:return          
_L6:
		if(((PdfXConformanceImp)pdfIsoConformance).isPdfX32002())
	//*  63  153:aload_0         
	//*  64  154:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//*  65  157:checkcast       #746 <Class PdfXConformanceImp>
	//*  66  160:invokevirtual   #773 <Method boolean PdfXConformanceImp.isPdfX32002()>
	//*  67  163:ifeq            71
			pdfdictionary.put(PdfName.GTS_PDFXVERSION, ((PdfObject) (new PdfString("PDF/X-3:2002"))));
	//   68  166:aload_1         
	//   69  167:getstatic       #744 <Field PdfName PdfName.GTS_PDFXVERSION>
	//   70  170:new             #716 <Class PdfString>
	//   71  173:dup             
	//   72  174:ldc2            #775 <String "PDF/X-3:2002">
	//   73  177:invokespecial   #719 <Method void PdfString(String)>
	//   74  180:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(true) goto _L4; else goto _L7
	//   75  183:goto            71
_L7:
	}

	public static PdfWriter getInstance(Document document, OutputStream outputstream)
		throws DocumentException
	{
		PdfDocument pdfdocument = new PdfDocument();
	//    0    0:new             #781 <Class PdfDocument>
	//    1    3:dup             
	//    2    4:invokespecial   #782 <Method void PdfDocument()>
	//    3    7:astore_2        
		document.addDocListener(((DocListener) (pdfdocument)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #788 <Method void Document.addDocListener(DocListener)>
		document = ((Document) (new PdfWriter(pdfdocument, outputstream)));
	//    7   13:new             #2   <Class PdfWriter>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokespecial   #790 <Method void PdfWriter(PdfDocument, OutputStream)>
	//   12   22:astore_0        
		pdfdocument.addWriter(((PdfWriter) (document)));
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #793 <Method void PdfDocument.addWriter(PdfWriter)>
		return ((PdfWriter) (document));
	//   16   28:aload_0         
	//   17   29:areturn         
	}

	public static PdfWriter getInstance(Document document, OutputStream outputstream, DocListener doclistener)
		throws DocumentException
	{
		PdfDocument pdfdocument = new PdfDocument();
	//    0    0:new             #781 <Class PdfDocument>
	//    1    3:dup             
	//    2    4:invokespecial   #782 <Method void PdfDocument()>
	//    3    7:astore_3        
		pdfdocument.addDocListener(doclistener);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #796 <Method void PdfDocument.addDocListener(DocListener)>
		document.addDocListener(((DocListener) (pdfdocument)));
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #788 <Method void Document.addDocListener(DocListener)>
		document = ((Document) (new PdfWriter(pdfdocument, outputstream)));
	//   10   18:new             #2   <Class PdfWriter>
	//   11   21:dup             
	//   12   22:aload_3         
	//   13   23:aload_1         
	//   14   24:invokespecial   #790 <Method void PdfWriter(PdfDocument, OutputStream)>
	//   15   27:astore_0        
		pdfdocument.addWriter(((PdfWriter) (document)));
	//   16   28:aload_3         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #793 <Method void PdfDocument.addWriter(PdfWriter)>
		return ((PdfWriter) (document));
	//   19   33:aload_0         
	//   20   34:areturn         
	}

	protected static String getNameString(PdfDictionary pdfdictionary, PdfName pdfname)
	{
		pdfdictionary = ((PdfDictionary) (PdfReader.getPdfObject(pdfdictionary.get(pdfname))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    5:invokestatic    #804 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    4    8:astore_0        
		if(pdfdictionary == null || !((PdfObject) (pdfdictionary)).isString())
	//*   5    9:aload_0         
	//*   6   10:ifnull          20
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #809 <Method boolean PdfObject.isString()>
	//*   9   17:ifne            22
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		else
			return ((PdfString)pdfdictionary).toUnicodeString();
	//   12   22:aload_0         
	//   13   23:checkcast       #716 <Class PdfString>
	//   14   26:invokevirtual   #813 <Method String PdfString.toUnicodeString()>
	//   15   29:areturn         
	}

	private static void getOCGOrder(PdfArray pdfarray, PdfLayer pdflayer)
	{
		if(pdflayer.isOnPanel())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #818 <Method boolean PdfLayer.isOnPanel()>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			if(pdflayer.getTitle() == null)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #821 <Method String PdfLayer.getTitle()>
	//*   6   12:ifnonnull       24
				pdfarray.add(((PdfObject) (pdflayer.getRef())));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//   10   20:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   11   23:pop             
			ArrayList arraylist = pdflayer.getChildren();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #825 <Method ArrayList PdfLayer.getChildren()>
	//   14   28:astore_3        
			if(arraylist != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          7
			{
				PdfArray pdfarray1 = new PdfArray();
	//   17   33:new             #582 <Class PdfArray>
	//   18   36:dup             
	//   19   37:invokespecial   #583 <Method void PdfArray()>
	//   20   40:astore          4
				if(pdflayer.getTitle() != null)
	//*  21   42:aload_1         
	//*  22   43:invokevirtual   #821 <Method String PdfLayer.getTitle()>
	//*  23   46:ifnull          69
					pdfarray1.add(((PdfObject) (new PdfString(pdflayer.getTitle(), "UnicodeBig"))));
	//   24   49:aload           4
	//   25   51:new             #716 <Class PdfString>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokevirtual   #821 <Method String PdfLayer.getTitle()>
	//   29   59:ldc2            #827 <String "UnicodeBig">
	//   30   62:invokespecial   #830 <Method void PdfString(String, String)>
	//   31   65:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   32   68:pop             
				for(int i = 0; i < arraylist.size(); i++)
	//*  33   69:iconst_0        
	//*  34   70:istore_2        
	//*  35   71:iload_2         
	//*  36   72:aload_3         
	//*  37   73:invokevirtual   #831 <Method int ArrayList.size()>
	//*  38   76:icmpge          99
					getOCGOrder(pdfarray1, (PdfLayer)arraylist.get(i));
	//   39   79:aload           4
	//   40   81:aload_3         
	//   41   82:iload_2         
	//   42   83:invokevirtual   #834 <Method Object ArrayList.get(int)>
	//   43   86:checkcast       #638 <Class PdfLayer>
	//   44   89:invokestatic    #836 <Method void getOCGOrder(PdfArray, PdfLayer)>

	//   45   92:iload_2         
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:istore_2        
	//*  49   96:goto            71
				if(pdfarray1.size() > 0)
	//*  50   99:aload           4
	//*  51  101:invokevirtual   #661 <Method int PdfArray.size()>
	//*  52  104:ifle            7
				{
					pdfarray.add(((PdfObject) (pdfarray1)));
	//   53  107:aload_0         
	//   54  108:aload           4
	//   55  110:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   56  113:pop             
					return;
	//   57  114:return          
				}
			}
		}
	}

	protected static void writeKeyInfo(OutputStream outputstream)
		throws IOException
	{
		Version version = Version.getInstance();
	//    0    0:invokestatic    #845 <Method Version Version.getInstance()>
	//    1    3:astore_3        
		String s1 = version.getKey();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #848 <Method String Version.getKey()>
	//    4    8:astore_2        
		String s = s1;
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(s1 == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			s = "iText";
	//    9   15:ldc2            #850 <String "iText">
	//   10   18:astore_1        
		outputstream.write(getISOBytes(String.format("%%%s-%s\n", new Object[] {
			s, version.getRelease()
		})));
	//   11   19:aload_0         
	//   12   20:ldc2            #852 <String "%%%s-%s\n">
	//   13   23:iconst_2        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_1         
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:aload_3         
	//   22   34:invokevirtual   #857 <Method String Version.getRelease()>
	//   23   37:aastore         
	//   24   38:invokestatic    #863 <Method String String.format(String, Object[])>
	//   25   41:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//   26   44:invokevirtual   #873 <Method void OutputStream.write(byte[])>
	//   27   47:return          
	}

	protected PdfIndirectReference add(PdfICCBased pdficcbased)
	{
		try
		{
			pdficcbased = ((PdfICCBased) (addToBody(((PdfObject) (pdficcbased)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//    3    5:astore_1        
		}
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfICCBased pdficcbased)
	//*   7   11:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdficcbased)));
	//    8   12:new             #885 <Class ExceptionConverter>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   12   20:athrow          
		}
		return ((PdfIndirectObject) (pdficcbased)).getIndirectReference();
	}

	PdfIndirectReference add(PdfImage pdfimage, PdfIndirectReference pdfindirectreference)
		throws PdfException
	{
label0:
		{
			{
				if(imageDictionary.contains(pdfimage.name()))
					break MISSING_BLOCK_LABEL_108;
	//    0    0:aload_0         
	//    1    1:getfield        #597 <Field PdfDictionary imageDictionary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #897 <Method PdfName PdfImage.name()>
	//    4    8:invokevirtual   #901 <Method boolean PdfDictionary.contains(PdfName)>
	//    5   11:ifne            108
				checkPdfIsoConformance(this, 5, ((Object) (pdfimage)));
	//    6   14:aload_0         
	//    7   15:iconst_5        
	//    8   16:aload_1         
	//    9   17:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
				PdfIndirectReference pdfindirectreference1 = pdfindirectreference;
	//   10   20:aload_2         
	//   11   21:astore_3        
				if(pdfindirectreference instanceof PRIndirectReference)
	//*  12   22:aload_2         
	//*  13   23:instanceof      #905 <Class PRIndirectReference>
	//*  14   26:ifeq            59
				{
					pdfindirectreference = ((PdfIndirectReference) ((PRIndirectReference)pdfindirectreference));
	//   15   29:aload_2         
	//   16   30:checkcast       #905 <Class PRIndirectReference>
	//   17   33:astore_2        
					pdfindirectreference1 = new PdfIndirectReference(0, getNewObjectNumber(((PRIndirectReference) (pdfindirectreference)).getReader(), ((PRIndirectReference) (pdfindirectreference)).getNumber(), ((PRIndirectReference) (pdfindirectreference)).getGeneration()));
	//   18   34:new             #907 <Class PdfIndirectReference>
	//   19   37:dup             
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #911 <Method PdfReader PRIndirectReference.getReader()>
	//   24   44:aload_2         
	//   25   45:invokevirtual   #914 <Method int PRIndirectReference.getNumber()>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #917 <Method int PRIndirectReference.getGeneration()>
	//   28   52:invokevirtual   #921 <Method int getNewObjectNumber(PdfReader, int, int)>
	//   29   55:invokespecial   #924 <Method void PdfIndirectReference(int, int)>
	//   30   58:astore_3        
				}
				if(pdfindirectreference1 != null)
					break label0;
	//   31   59:aload_3         
	//   32   60:ifnonnull       86
				try
				{
					pdfindirectreference = addToBody(((PdfObject) (pdfimage))).getIndirectReference();
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//   36   68:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   37   71:astore_2        
				}
	//*  38   72:aload_0         
	//*  39   73:getfield        #597 <Field PdfDictionary imageDictionary>
	//*  40   76:aload_1         
	//*  41   77:invokevirtual   #897 <Method PdfName PdfImage.name()>
	//*  42   80:aload_2         
	//*  43   81:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  44   84:aload_2         
	//*  45   85:areturn         
	//*  46   86:aload_0         
	//*  47   87:aload_1         
	//*  48   88:aload_3         
	//*  49   89:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//*  50   92:pop             
	//*  51   93:aload_3         
	//*  52   94:astore_2        
	//*  53   95:goto            72
				// Misplaced declaration of an exception variable
				catch(PdfImage pdfimage)
	//*  54   98:astore_1        
				{
					throw new ExceptionConverter(((Exception) (pdfimage)));
	//   55   99:new             #885 <Class ExceptionConverter>
	//   56  102:dup             
	//   57  103:aload_1         
	//   58  104:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   59  107:athrow          
				}
			}
			imageDictionary.put(pdfimage.name(), ((PdfObject) (pdfindirectreference)));
			return pdfindirectreference;
		}
		addToBody(((PdfObject) (pdfimage)), pdfindirectreference1);
		pdfindirectreference = pdfindirectreference1;
		if(true)
			break MISSING_BLOCK_LABEL_72;
		return (PdfIndirectReference)imageDictionary.get(pdfimage.name());
	//   60  108:aload_0         
	//   61  109:getfield        #597 <Field PdfDictionary imageDictionary>
	//   62  112:aload_1         
	//   63  113:invokevirtual   #897 <Method PdfName PdfImage.name()>
	//   64  116:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//   65  119:checkcast       #907 <Class PdfIndirectReference>
	//   66  122:areturn         
	}

	PdfIndirectReference add(PdfPage pdfpage, PdfContents pdfcontents)
		throws PdfException
	{
		if(!open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifne            25
			throw new PdfException(MessageLocalization.getComposedMessage("the.document.is.not.open", new Object[0]));
	//    3    7:new             #891 <Class PdfException>
	//    4   10:dup             
	//    5   11:ldc2            #933 <String "the.document.is.not.open">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #939 <Method void PdfException(String)>
	//   10   24:athrow          
		try
		{
			pdfcontents = ((PdfContents) (addToBody(((PdfObject) (pdfcontents)))));
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//   14   30:astore_2        
		}
	//*  15   31:aload_1         
	//*  16   32:aload_2         
	//*  17   33:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  18   36:invokevirtual   #944 <Method void PdfPage.add(PdfIndirectReference)>
	//*  19   39:aload_0         
	//*  20   40:getfield        #946 <Field PdfDictionary group>
	//*  21   43:ifnull          92
	//*  22   46:aload_1         
	//*  23   47:getstatic       #949 <Field PdfName PdfName.GROUP>
	//*  24   50:aload_0         
	//*  25   51:getfield        #946 <Field PdfDictionary group>
	//*  26   54:invokevirtual   #950 <Method void PdfPage.put(PdfName, PdfObject)>
	//*  27   57:aload_0         
	//*  28   58:aconst_null     
	//*  29   59:putfield        #946 <Field PdfDictionary group>
	//*  30   62:aload_0         
	//*  31   63:getfield        #497 <Field PdfPages root>
	//*  32   66:aload_1         
	//*  33   67:invokevirtual   #953 <Method void PdfPages.addPage(PdfDictionary)>
	//*  34   70:aload_0         
	//*  35   71:aload_0         
	//*  36   72:getfield        #504 <Field int currentPageNumber>
	//*  37   75:iconst_1        
	//*  38   76:iadd            
	//*  39   77:putfield        #504 <Field int currentPageNumber>
	//*  40   80:aconst_null     
	//*  41   81:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfPage pdfpage)
	//*  42   82:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfpage)));
	//   43   83:new             #885 <Class ExceptionConverter>
	//   44   86:dup             
	//   45   87:aload_1         
	//   46   88:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   47   91:athrow          
		}
		pdfpage.add(((PdfIndirectObject) (pdfcontents)).getIndirectReference());
		if(group == null) goto _L2; else goto _L1
_L1:
		pdfpage.put(PdfName.GROUP, ((PdfObject) (group)));
		group = null;
_L4:
		root.addPage(((PdfDictionary) (pdfpage)));
		currentPageNumber = currentPageNumber + 1;
		return null;
_L2:
		if(rgbTransparencyBlending)
	//*  48   92:aload_0         
	//*  49   93:getfield        #955 <Field boolean rgbTransparencyBlending>
	//*  50   96:ifeq            62
		{
			pdfcontents = ((PdfContents) (new PdfDictionary()));
	//   51   99:new             #508 <Class PdfDictionary>
	//   52  102:dup             
	//   53  103:invokespecial   #509 <Method void PdfDictionary()>
	//   54  106:astore_2        
			((PdfDictionary) (pdfcontents)).put(PdfName.TYPE, ((PdfObject) (PdfName.GROUP)));
	//   55  107:aload_2         
	//   56  108:getstatic       #958 <Field PdfName PdfName.TYPE>
	//   57  111:getstatic       #949 <Field PdfName PdfName.GROUP>
	//   58  114:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (pdfcontents)).put(PdfName.S, ((PdfObject) (PdfName.TRANSPARENCY)));
	//   59  117:aload_2         
	//   60  118:getstatic       #737 <Field PdfName PdfName.S>
	//   61  121:getstatic       #961 <Field PdfName PdfName.TRANSPARENCY>
	//   62  124:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (pdfcontents)).put(PdfName.CS, ((PdfObject) (PdfName.DEVICERGB)));
	//   63  127:aload_2         
	//   64  128:getstatic       #964 <Field PdfName PdfName.CS>
	//   65  131:getstatic       #967 <Field PdfName PdfName.DEVICERGB>
	//   66  134:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfpage.put(PdfName.GROUP, ((PdfObject) (pdfcontents)));
	//   67  137:aload_1         
	//   68  138:getstatic       #949 <Field PdfName PdfName.GROUP>
	//   69  141:aload_2         
	//   70  142:invokevirtual   #950 <Method void PdfPage.put(PdfName, PdfObject)>
		}
		if(true) goto _L4; else goto _L3
	//   71  145:goto            62
_L3:
	}

	public void addAnnotation(PdfAnnotation pdfannotation)
	{
		pdf.addAnnotation(pdfannotation);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #971 <Method void PdfDocument.addAnnotation(PdfAnnotation)>
	//    4    8:return          
	}

	void addAnnotation(PdfAnnotation pdfannotation, int i)
	{
		addAnnotation(pdfannotation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #973 <Method void addAnnotation(PdfAnnotation)>
	//    3    5:return          
	}

	public void addCalculationOrder(PdfFormField pdfformfield)
	{
		pdf.addCalculationOrder(pdfformfield);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #977 <Method void PdfDocument.addCalculationOrder(PdfFormField)>
	//    4    8:return          
	}

	public void addDeveloperExtension(PdfDeveloperExtension pdfdeveloperextension)
	{
		pdf_version.addDeveloperExtension(pdfdeveloperextension);
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #981 <Method void PdfVersionImp.addDeveloperExtension(PdfDeveloperExtension)>
	//    4    8:return          
	}

	public PdfName addDirectImageSimple(Image image)
		throws PdfException, DocumentException
	{
		return addDirectImageSimple(image, ((PdfIndirectReference) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #986 <Method PdfName addDirectImageSimple(Image, PdfIndirectReference)>
	//    4    6:areturn         
	}

	public PdfName addDirectImageSimple(Image image, PdfIndirectReference pdfindirectreference)
		throws PdfException, DocumentException
	{
		if(!images.containsKey(((Object) (image.getMySerialId())))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #599 <Field HashMap images>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #994 <Method Long Image.getMySerialId()>
	//    4    8:invokevirtual   #998 <Method boolean HashMap.containsKey(Object)>
	//    5   11:ifeq            31
_L1:
		pdfindirectreference = ((PdfIndirectReference) ((PdfName)images.get(((Object) (image.getMySerialId())))));
	//    6   14:aload_0         
	//    7   15:getfield        #599 <Field HashMap images>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #994 <Method Long Image.getMySerialId()>
	//   10   22:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #271 <Class PdfName>
	//   12   28:astore_2        
_L4:
		return ((PdfName) (pdfindirectreference));
	//   13   29:aload_2         
	//   14   30:areturn         
_L2:
		if(!image.isImgTemplate())
			break; /* Loop/switch isn't completed */
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1004 <Method boolean Image.isImgTemplate()>
	//   17   35:ifeq            122
		PdfName pdfname = new PdfName((new StringBuilder()).append("img").append(images.size()).toString());
	//   18   38:new             #271 <Class PdfName>
	//   19   41:dup             
	//   20   42:new             #1006 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #1007 <Method void StringBuilder()>
	//   23   49:ldc2            #1009 <String "img">
	//   24   52:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_0         
	//   26   56:getfield        #599 <Field HashMap images>
	//   27   59:invokevirtual   #1014 <Method int HashMap.size()>
	//   28   62:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   29   65:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   30   68:invokespecial   #277 <Method void PdfName(String)>
	//   31   71:astore_3        
		pdfindirectreference = ((PdfIndirectReference) (pdfname));
	//   32   72:aload_3         
	//   33   73:astore_2        
		if(image instanceof ImgWMF)
	//*  34   74:aload_1         
	//*  35   75:instanceof      #1022 <Class ImgWMF>
	//*  36   78:ifeq            96
		{
			try
			{
				((ImgWMF)image).readWMF(PdfTemplate.createTemplate(this, 0.0F, 0.0F));
	//   37   81:aload_1         
	//   38   82:checkcast       #1022 <Class ImgWMF>
	//   39   85:aload_0         
	//   40   86:fconst_0        
	//   41   87:fconst_0        
	//   42   88:invokestatic    #1028 <Method PdfTemplate PdfTemplate.createTemplate(PdfWriter, float, float)>
	//   43   91:invokevirtual   #1032 <Method void ImgWMF.readWMF(PdfTemplate)>
			}
	//*  44   94:aload_3         
	//*  45   95:astore_2        
	//*  46   96:aload_0         
	//*  47   97:getfield        #599 <Field HashMap images>
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #994 <Method Long Image.getMySerialId()>
	//*  50  104:aload_2         
	//*  51  105:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//*  52  108:pop             
	//*  53  109:goto            29
			// Misplaced declaration of an exception variable
			catch(Image image)
	//*  54  112:astore_1        
			{
				throw new DocumentException(((Exception) (image)));
	//   55  113:new             #779 <Class DocumentException>
	//   56  116:dup             
	//   57  117:aload_1         
	//   58  118:invokespecial   #1036 <Method void DocumentException(Exception)>
	//   59  121:athrow          
			}
			pdfindirectreference = ((PdfIndirectReference) (pdfname));
		}
_L5:
		images.put(((Object) (image.getMySerialId())), ((Object) (pdfindirectreference)));
		if(true) goto _L4; else goto _L3
_L3:
		Object obj = ((Object) (image.getDirectReference()));
	//   60  122:aload_1         
	//   61  123:invokevirtual   #1039 <Method PdfIndirectReference Image.getDirectReference()>
	//   62  126:astore_3        
		if(obj != null)
	//*  63  127:aload_3         
	//*  64  128:ifnull          189
		{
			pdfindirectreference = ((PdfIndirectReference) (new PdfName((new StringBuilder()).append("img").append(images.size()).toString())));
	//   65  131:new             #271 <Class PdfName>
	//   66  134:dup             
	//   67  135:new             #1006 <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #1007 <Method void StringBuilder()>
	//   70  142:ldc2            #1009 <String "img">
	//   71  145:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   72  148:aload_0         
	//   73  149:getfield        #599 <Field HashMap images>
	//   74  152:invokevirtual   #1014 <Method int HashMap.size()>
	//   75  155:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   76  158:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   77  161:invokespecial   #277 <Method void PdfName(String)>
	//   78  164:astore_2        
			images.put(((Object) (image.getMySerialId())), ((Object) (pdfindirectreference)));
	//   79  165:aload_0         
	//   80  166:getfield        #599 <Field HashMap images>
	//   81  169:aload_1         
	//   82  170:invokevirtual   #994 <Method Long Image.getMySerialId()>
	//   83  173:aload_2         
	//   84  174:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   85  177:pop             
			imageDictionary.put(((PdfName) (pdfindirectreference)), ((PdfObject) (obj)));
	//   86  178:aload_0         
	//   87  179:getfield        #597 <Field PdfDictionary imageDictionary>
	//   88  182:aload_2         
	//   89  183:aload_3         
	//   90  184:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return ((PdfName) (pdfindirectreference));
	//   91  187:aload_2         
	//   92  188:areturn         
		}
		Image image1 = image.getImageMask();
	//   93  189:aload_1         
	//   94  190:invokevirtual   #1043 <Method Image Image.getImageMask()>
	//   95  193:astore          4
		obj = null;
	//   96  195:aconst_null     
	//   97  196:astore_3        
		if(image1 != null)
	//*  98  197:aload           4
	//*  99  199:ifnull          222
			obj = ((Object) (getImageReference((PdfName)images.get(((Object) (image1.getMySerialId()))))));
	//  100  202:aload_0         
	//  101  203:aload_0         
	//  102  204:getfield        #599 <Field HashMap images>
	//  103  207:aload           4
	//  104  209:invokevirtual   #994 <Method Long Image.getMySerialId()>
	//  105  212:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//  106  215:checkcast       #271 <Class PdfName>
	//  107  218:invokevirtual   #1047 <Method PdfIndirectReference getImageReference(PdfName)>
	//  108  221:astore_3        
		obj = ((Object) (new PdfImage(image, (new StringBuilder()).append("img").append(images.size()).toString(), ((PdfIndirectReference) (obj)))));
	//  109  222:new             #893 <Class PdfImage>
	//  110  225:dup             
	//  111  226:aload_1         
	//  112  227:new             #1006 <Class StringBuilder>
	//  113  230:dup             
	//  114  231:invokespecial   #1007 <Method void StringBuilder()>
	//  115  234:ldc2            #1009 <String "img">
	//  116  237:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//  117  240:aload_0         
	//  118  241:getfield        #599 <Field HashMap images>
	//  119  244:invokevirtual   #1014 <Method int HashMap.size()>
	//  120  247:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//  121  250:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//  122  253:aload_3         
	//  123  254:invokespecial   #1050 <Method void PdfImage(Image, String, PdfIndirectReference)>
	//  124  257:astore_3        
		if(image instanceof ImgJBIG2)
	//* 125  258:aload_1         
	//* 126  259:instanceof      #1052 <Class ImgJBIG2>
	//* 127  262:ifeq            311
		{
			byte abyte0[] = ((ImgJBIG2)image).getGlobalBytes();
	//  128  265:aload_1         
	//  129  266:checkcast       #1052 <Class ImgJBIG2>
	//  130  269:invokevirtual   #1056 <Method byte[] ImgJBIG2.getGlobalBytes()>
	//  131  272:astore          4
			if(abyte0 != null)
	//* 132  274:aload           4
	//* 133  276:ifnull          311
			{
				PdfDictionary pdfdictionary = new PdfDictionary();
	//  134  279:new             #508 <Class PdfDictionary>
	//  135  282:dup             
	//  136  283:invokespecial   #509 <Method void PdfDictionary()>
	//  137  286:astore          5
				pdfdictionary.put(PdfName.JBIG2GLOBALS, ((PdfObject) (getReferenceJBIG2Globals(abyte0))));
	//  138  288:aload           5
	//  139  290:getstatic       #1059 <Field PdfName PdfName.JBIG2GLOBALS>
	//  140  293:aload_0         
	//  141  294:aload           4
	//  142  296:invokevirtual   #1063 <Method PdfIndirectReference getReferenceJBIG2Globals(byte[])>
	//  143  299:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfImage) (obj)).put(PdfName.DECODEPARMS, ((PdfObject) (pdfdictionary)));
	//  144  302:aload_3         
	//  145  303:getstatic       #1066 <Field PdfName PdfName.DECODEPARMS>
	//  146  306:aload           5
	//  147  308:invokevirtual   #1067 <Method void PdfImage.put(PdfName, PdfObject)>
			}
		}
		if(image.hasICCProfile())
	//* 148  311:aload_1         
	//* 149  312:invokevirtual   #1070 <Method boolean Image.hasICCProfile()>
	//* 150  315:ifeq            412
		{
			Object obj1 = ((Object) (add(new PdfICCBased(image.getICCProfile(), image.getCompressionLevel()))));
	//  151  318:aload_0         
	//  152  319:new             #1072 <Class PdfICCBased>
	//  153  322:dup             
	//  154  323:aload_1         
	//  155  324:invokevirtual   #1076 <Method ICC_Profile Image.getICCProfile()>
	//  156  327:aload_1         
	//  157  328:invokevirtual   #1079 <Method int Image.getCompressionLevel()>
	//  158  331:invokespecial   #1082 <Method void PdfICCBased(ICC_Profile, int)>
	//  159  334:invokevirtual   #1084 <Method PdfIndirectReference add(PdfICCBased)>
	//  160  337:astore          5
			PdfArray pdfarray = new PdfArray();
	//  161  339:new             #582 <Class PdfArray>
	//  162  342:dup             
	//  163  343:invokespecial   #583 <Method void PdfArray()>
	//  164  346:astore          4
			pdfarray.add(((PdfObject) (PdfName.ICCBASED)));
	//  165  348:aload           4
	//  166  350:getstatic       #1087 <Field PdfName PdfName.ICCBASED>
	//  167  353:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  168  356:pop             
			pdfarray.add(((PdfObject) (obj1)));
	//  169  357:aload           4
	//  170  359:aload           5
	//  171  361:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  172  364:pop             
			obj1 = ((Object) (((PdfImage) (obj)).getAsArray(PdfName.COLORSPACE)));
	//  173  365:aload_3         
	//  174  366:getstatic       #1090 <Field PdfName PdfName.COLORSPACE>
	//  175  369:invokevirtual   #1091 <Method PdfArray PdfImage.getAsArray(PdfName)>
	//  176  372:astore          5
			if(obj1 != null)
	//* 177  374:aload           5
	//* 178  376:ifnull          439
			{
				if(((PdfArray) (obj1)).size() > 1 && PdfName.INDEXED.equals(((Object) (((PdfArray) (obj1)).getPdfObject(0)))))
	//* 179  379:aload           5
	//* 180  381:invokevirtual   #661 <Method int PdfArray.size()>
	//* 181  384:iconst_1        
	//* 182  385:icmple          427
	//* 183  388:getstatic       #1094 <Field PdfName PdfName.INDEXED>
	//* 184  391:aload           5
	//* 185  393:iconst_0        
	//* 186  394:invokevirtual   #1097 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 187  397:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//* 188  400:ifeq            427
					((PdfArray) (obj1)).set(1, ((PdfObject) (pdfarray)));
	//  189  403:aload           5
	//  190  405:iconst_1        
	//  191  406:aload           4
	//  192  408:invokevirtual   #1104 <Method PdfObject PdfArray.set(int, PdfObject)>
	//  193  411:pop             
				else
	//* 194  412:aload_0         
	//* 195  413:aload_3         
	//* 196  414:aload_2         
	//* 197  415:invokevirtual   #1106 <Method PdfIndirectReference add(PdfImage, PdfIndirectReference)>
	//* 198  418:pop             
	//* 199  419:aload_3         
	//* 200  420:invokevirtual   #897 <Method PdfName PdfImage.name()>
	//* 201  423:astore_2        
	//* 202  424:goto            96
					((PdfImage) (obj)).put(PdfName.COLORSPACE, ((PdfObject) (pdfarray)));
	//  203  427:aload_3         
	//  204  428:getstatic       #1090 <Field PdfName PdfName.COLORSPACE>
	//  205  431:aload           4
	//  206  433:invokevirtual   #1067 <Method void PdfImage.put(PdfName, PdfObject)>
			} else
	//* 207  436:goto            412
			{
				((PdfImage) (obj)).put(PdfName.COLORSPACE, ((PdfObject) (pdfarray)));
	//  208  439:aload_3         
	//  209  440:getstatic       #1090 <Field PdfName PdfName.COLORSPACE>
	//  210  443:aload           4
	//  211  445:invokevirtual   #1067 <Method void PdfImage.put(PdfName, PdfObject)>
			}
		}
		add(((PdfImage) (obj)), pdfindirectreference);
		pdfindirectreference = ((PdfIndirectReference) (((PdfImage) (obj)).name()));
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 212  448:goto            412
	}

	PdfName addDirectTemplateSimple(PdfTemplate pdftemplate, PdfName pdfname)
	{
		Object obj;
		PdfIndirectReference pdfindirectreference;
		pdfindirectreference = pdftemplate.getIndirectReference();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//    2    4:astore          4
		obj = ((Object) ((Object[])formXObjects.get(((Object) (pdfindirectreference)))));
	//    3    6:aload_0         
	//    4    7:getfield        #546 <Field HashMap formXObjects>
	//    5   10:aload           4
	//    6   12:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #1111 <Class Object[]>
	//    8   18:astore_3        
		if(obj != null) goto _L2; else goto _L1
	//    9   19:aload_3         
	//   10   20:ifnonnull       142
_L1:
		if(pdfname != null)
			break MISSING_BLOCK_LABEL_68;
	//   11   23:aload_2         
	//   12   24:ifnonnull       170
		pdfname = new PdfName((new StringBuilder()).append("Xf").append(formXObjectsCounter).toString());
	//   13   27:new             #271 <Class PdfName>
	//   14   30:dup             
	//   15   31:new             #1006 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #1007 <Method void StringBuilder()>
	//   18   38:ldc2            #1113 <String "Xf">
	//   19   41:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:aload_0         
	//   21   45:getfield        #548 <Field int formXObjectsCounter>
	//   22   48:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   23   51:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   24   54:invokespecial   #277 <Method void PdfName(String)>
	//   25   57:astore_2        
		formXObjectsCounter = formXObjectsCounter + 1;
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #548 <Field int formXObjectsCounter>
	//   29   63:iconst_1        
	//   30   64:iadd            
	//   31   65:putfield        #548 <Field int formXObjectsCounter>
		obj = ((Object) (pdftemplate));
	//   32   68:aload_1         
	//   33   69:astore_3        
		if(pdftemplate.getType() != 2) goto _L4; else goto _L3
	//   34   70:aload_1         
	//   35   71:invokevirtual   #1116 <Method int PdfTemplate.getType()>
	//   36   74:iconst_2        
	//   37   75:icmpne          118
_L3:
		pdftemplate = ((PdfTemplate) ((PdfImportedPage)pdftemplate));
	//   38   78:aload_1         
	//   39   79:checkcast       #1118 <Class PdfImportedPage>
	//   40   82:astore_1        
		obj = ((Object) (((PdfImportedPage) (pdftemplate)).getPdfReaderInstance().getReader()));
	//   41   83:aload_1         
	//   42   84:invokevirtual   #1122 <Method PdfReaderInstance PdfImportedPage.getPdfReaderInstance()>
	//   43   87:invokevirtual   #1125 <Method PdfReader PdfReaderInstance.getReader()>
	//   44   90:astore_3        
		if(!readerInstances.containsKey(obj))
	//*  45   91:aload_0         
	//*  46   92:getfield        #550 <Field HashMap readerInstances>
	//*  47   95:aload_3         
	//*  48   96:invokevirtual   #998 <Method boolean HashMap.containsKey(Object)>
	//*  49   99:ifne            165
			readerInstances.put(obj, ((Object) (((PdfImportedPage) (pdftemplate)).getPdfReaderInstance())));
	//   50  102:aload_0         
	//   51  103:getfield        #550 <Field HashMap readerInstances>
	//   52  106:aload_3         
	//   53  107:aload_1         
	//   54  108:invokevirtual   #1122 <Method PdfReaderInstance PdfImportedPage.getPdfReaderInstance()>
	//   55  111:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   56  114:pop             
		  goto _L5
	//*  57  115:goto            165
_L4:
		formXObjects.put(((Object) (pdfindirectreference)), ((Object) (new Object[] {
			pdfname, obj
		})));
	//   58  118:aload_0         
	//   59  119:getfield        #546 <Field HashMap formXObjects>
	//   60  122:aload           4
	//   61  124:iconst_2        
	//   62  125:anewarray       Object[]
	//   63  128:dup             
	//   64  129:iconst_0        
	//   65  130:aload_2         
	//   66  131:aastore         
	//   67  132:dup             
	//   68  133:iconst_1        
	//   69  134:aload_3         
	//   70  135:aastore         
	//   71  136:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   72  139:pop             
		return pdfname;
	//   73  140:aload_2         
	//   74  141:areturn         
_L2:
		pdftemplate = ((PdfTemplate) ((PdfName)obj[0]));
	//   75  142:aload_3         
	//   76  143:iconst_0        
	//   77  144:aaload          
	//   78  145:checkcast       #271 <Class PdfName>
	//   79  148:astore_1        
		return ((PdfName) (pdftemplate));
	//   80  149:aload_1         
	//   81  150:areturn         
		pdftemplate;
	//   82  151:astore_1        
_L6:
		throw new ExceptionConverter(((Exception) (pdftemplate)));
	//   83  152:new             #885 <Class ExceptionConverter>
	//   84  155:dup             
	//   85  156:aload_1         
	//   86  157:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   87  160:athrow          
		pdftemplate;
	//   88  161:astore_1        
		if(true) goto _L6; else goto _L5
	//   89  162:goto            152
_L5:
		obj = null;
	//   90  165:aconst_null     
	//   91  166:astore_3        
		if(true) goto _L4; else goto _L7
	//   92  167:goto            118
_L7:
	//*  93  170:goto            68
	}

	public void addFileAttachment(PdfFileSpecification pdffilespecification)
		throws IOException
	{
		addFileAttachment(((String) (null)), pdffilespecification);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #1130 <Method void addFileAttachment(String, PdfFileSpecification)>
	//    4    6:return          
	}

	public void addFileAttachment(String s, PdfFileSpecification pdffilespecification)
		throws IOException
	{
		pdf.addFileAttachment(s, pdffilespecification);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1131 <Method void PdfDocument.addFileAttachment(String, PdfFileSpecification)>
	//    5    9:return          
	}

	public void addFileAttachment(String s, byte abyte0[], String s1, String s2)
		throws IOException
	{
		addFileAttachment(s, PdfFileSpecification.fileEmbedded(this, s1, s2, abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload_2         
	//    6    7:invokestatic    #1138 <Method PdfFileSpecification PdfFileSpecification.fileEmbedded(PdfWriter, String, String, byte[])>
	//    7   10:invokevirtual   #1130 <Method void addFileAttachment(String, PdfFileSpecification)>
	//    8   13:return          
	}

	public void addJavaScript(PdfAction pdfaction)
	{
		pdf.addJavaScript(pdfaction);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1142 <Method void PdfDocument.addJavaScript(PdfAction)>
	//    4    8:return          
	}

	public void addJavaScript(String s)
	{
		addJavaScript(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1145 <Method void addJavaScript(String, boolean)>
	//    4    6:return          
	}

	public void addJavaScript(String s, PdfAction pdfaction)
	{
		pdf.addJavaScript(s, pdfaction);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1148 <Method void PdfDocument.addJavaScript(String, PdfAction)>
	//    5    9:return          
	}

	public void addJavaScript(String s, String s1)
	{
		addJavaScript(s, s1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1151 <Method void addJavaScript(String, String, boolean)>
	//    5    7:return          
	}

	public void addJavaScript(String s, String s1, boolean flag)
	{
		addJavaScript(s, PdfAction.javaScript(s1, this, flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:iload_3         
	//    5    5:invokestatic    #1157 <Method PdfAction PdfAction.javaScript(String, PdfWriter, boolean)>
	//    6    8:invokevirtual   #1158 <Method void addJavaScript(String, PdfAction)>
	//    7   11:return          
	}

	public void addJavaScript(String s, boolean flag)
	{
		addJavaScript(PdfAction.javaScript(s, this, flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokestatic    #1157 <Method PdfAction PdfAction.javaScript(String, PdfWriter, boolean)>
	//    5    7:invokevirtual   #1159 <Method void addJavaScript(PdfAction)>
	//    6   10:return          
	}

	void addLocalDestinations(TreeMap treemap)
		throws IOException
	{
		for(treemap = ((TreeMap) (treemap.entrySet().iterator())); ((Iterator) (treemap)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1167 <Method Set TreeMap.entrySet()>
	//*   2    4:invokeinterface #1170 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            128
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (treemap)).next()));
	//    7   19:aload_1         
	//    8   20:invokeinterface #636 <Method Object Iterator.next()>
	//    9   25:checkcast       #1172 <Class java.util.Map$Entry>
	//   10   28:astore_3        
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   11   29:aload_3         
	//   12   30:invokeinterface #1174 <Method Object java.util.Map$Entry.getKey()>
	//   13   35:checkcast       #859 <Class String>
	//   14   38:astore_2        
			obj = ((Object) ((PdfDocument.Destination)((java.util.Map.Entry) (obj)).getValue()));
	//   15   39:aload_3         
	//   16   40:invokeinterface #1177 <Method Object java.util.Map$Entry.getValue()>
	//   17   45:checkcast       #1179 <Class PdfDocument$Destination>
	//   18   48:astore_3        
			PdfDestination pdfdestination = ((PdfDocument.Destination) (obj)).destination;
	//   19   49:aload_3         
	//   20   50:getfield        #1183 <Field PdfDestination PdfDocument$Destination.destination>
	//   21   53:astore          4
			if(((PdfDocument.Destination) (obj)).reference == null)
	//*  22   55:aload_3         
	//*  23   56:getfield        #1187 <Field PdfIndirectReference PdfDocument$Destination.reference>
	//*  24   59:ifnonnull       70
				obj.reference = getPdfIndirectReference();
	//   25   62:aload_3         
	//   26   63:aload_0         
	//   27   64:invokevirtual   #1190 <Method PdfIndirectReference getPdfIndirectReference()>
	//   28   67:putfield        #1187 <Field PdfIndirectReference PdfDocument$Destination.reference>
			if(pdfdestination == null)
	//*  29   70:aload           4
	//*  30   72:ifnonnull       114
				addToBody(((PdfObject) (new PdfString((new StringBuilder()).append("invalid_").append(s).toString()))), ((PdfDocument.Destination) (obj)).reference);
	//   31   75:aload_0         
	//   32   76:new             #716 <Class PdfString>
	//   33   79:dup             
	//   34   80:new             #1006 <Class StringBuilder>
	//   35   83:dup             
	//   36   84:invokespecial   #1007 <Method void StringBuilder()>
	//   37   87:ldc2            #1192 <String "invalid_">
	//   38   90:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   39   93:aload_2         
	//   40   94:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   41   97:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   42  100:invokespecial   #719 <Method void PdfString(String)>
	//   43  103:aload_3         
	//   44  104:getfield        #1187 <Field PdfIndirectReference PdfDocument$Destination.reference>
	//   45  107:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   46  110:pop             
			else
	//*  47  111:goto            10
				addToBody(((PdfObject) (pdfdestination)), ((PdfDocument.Destination) (obj)).reference);
	//   48  114:aload_0         
	//   49  115:aload           4
	//   50  117:aload_3         
	//   51  118:getfield        #1187 <Field PdfIndirectReference PdfDocument$Destination.reference>
	//   52  121:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   53  124:pop             
		}

	//*  54  125:goto            10
	//   55  128:return          
	}

	public void addNamedDestination(String s, int i, PdfDestination pdfdestination)
	{
		pdfdestination = new PdfDestination(pdfdestination);
	//    0    0:new             #1198 <Class PdfDestination>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #1201 <Method void PdfDestination(PdfDestination)>
	//    4    8:astore_3        
		pdfdestination.addPage(getPageReference(i));
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #1205 <Method PdfIndirectReference getPageReference(int)>
	//    9   15:invokevirtual   #1208 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//   10   18:pop             
		pdf.localDestination(s, pdfdestination);
	//   11   19:aload_0         
	//   12   20:getfield        #609 <Field PdfDocument pdf>
	//   13   23:aload_1         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #1212 <Method boolean PdfDocument.localDestination(String, PdfDestination)>
	//   16   28:pop             
	//   17   29:return          
	}

	public void addNamedDestinations(Map map, int i)
	{
		int j;
		java.util.Map.Entry entry;
		Object obj;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); addNamedDestination((String)entry.getKey(), j + i, ((PdfDestination) (obj))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #1217 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #1170 <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            108
		{
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #636 <Method Object Iterator.next()>
	//    9   27:checkcast       #1172 <Class java.util.Map$Entry>
	//   10   30:astore          4
			obj = ((Object) ((String)entry.getValue()));
	//   11   32:aload           4
	//   12   34:invokeinterface #1177 <Method Object java.util.Map$Entry.getValue()>
	//   13   39:checkcast       #859 <Class String>
	//   14   42:astore          5
			j = Integer.parseInt(((String) (obj)).substring(0, ((String) (obj)).indexOf(" ")));
	//   15   44:aload           5
	//   16   46:iconst_0        
	//   17   47:aload           5
	//   18   49:ldc2            #1219 <String " ">
	//   19   52:invokevirtual   #1223 <Method int String.indexOf(String)>
	//   20   55:invokevirtual   #1227 <Method String String.substring(int, int)>
	//   21   58:invokestatic    #1232 <Method int Integer.parseInt(String)>
	//   22   61:istore_3        
			obj = ((Object) (new PdfDestination(((String) (obj)).substring(((String) (obj)).indexOf(" ") + 1))));
	//   23   62:new             #1198 <Class PdfDestination>
	//   24   65:dup             
	//   25   66:aload           5
	//   26   68:aload           5
	//   27   70:ldc2            #1219 <String " ">
	//   28   73:invokevirtual   #1223 <Method int String.indexOf(String)>
	//   29   76:iconst_1        
	//   30   77:iadd            
	//   31   78:invokevirtual   #1235 <Method String String.substring(int)>
	//   32   81:invokespecial   #1236 <Method void PdfDestination(String)>
	//   33   84:astore          5
		}

	//   34   86:aload_0         
	//   35   87:aload           4
	//   36   89:invokeinterface #1174 <Method Object java.util.Map$Entry.getKey()>
	//   37   94:checkcast       #859 <Class String>
	//   38   97:iload_3         
	//   39   98:iload_2         
	//   40   99:iadd            
	//   41  100:aload           5
	//   42  102:invokevirtual   #1238 <Method void addNamedDestination(String, int, PdfDestination)>
	//*  43  105:goto            12
	//   44  108:return          
	}

	public void addOCGRadioGroup(ArrayList arraylist)
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #582 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #583 <Method void PdfArray()>
	//    3    7:astore_3        
		for(int i = 0; i < arraylist.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #831 <Method int ArrayList.size()>
	//*   9   15:icmpge          53
		{
			PdfLayer pdflayer = (PdfLayer)arraylist.get(i);
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #834 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #638 <Class PdfLayer>
	//   14   26:astore          4
			if(pdflayer.getTitle() == null)
	//*  15   28:aload           4
	//*  16   30:invokevirtual   #821 <Method String PdfLayer.getTitle()>
	//*  17   33:ifnonnull       46
				pdfarray.add(((PdfObject) (pdflayer.getRef())));
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//   21   42:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   22   45:pop             
		}

	//   23   46:iload_2         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore_2        
	//*  27   50:goto            10
		if(pdfarray.size() == 0)
	//*  28   53:aload_3         
	//*  29   54:invokevirtual   #661 <Method int PdfArray.size()>
	//*  30   57:ifne            61
		{
			return;
	//   31   60:return          
		} else
		{
			OCGRadioGroup.add(((PdfObject) (pdfarray)));
	//   32   61:aload_0         
	//   33   62:getfield        #585 <Field PdfArray OCGRadioGroup>
	//   34   65:aload_3         
	//   35   66:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   36   69:pop             
			return;
	//   37   70:return          
		}
	}

	public void addPageDictEntry(PdfName pdfname, PdfObject pdfobject)
	{
		pageDictEntries.put(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #511 <Field PdfDictionary pageDictEntries>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//    5    9:return          
	}

	protected void addSharedObjectsToBody()
		throws IOException
	{
		for(Iterator iterator = documentFonts.values().iterator(); iterator.hasNext(); ((FontDetails)iterator.next()).writeFont(this));
	//    0    0:aload_0         
	//    1    1:getfield        #539 <Field LinkedHashMap documentFonts>
	//    2    4:invokevirtual   #1248 <Method Collection LinkedHashMap.values()>
	//    3    7:invokeinterface #1251 <Method Iterator Collection.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            38
	//    8   22:aload_1         
	//    9   23:invokeinterface #636 <Method Object Iterator.next()>
	//   10   28:checkcast       #1253 <Class FontDetails>
	//   11   31:aload_0         
	//   12   32:invokevirtual   #1256 <Method void FontDetails.writeFont(PdfWriter)>
	//*  13   35:goto            13
		addXFormsToBody();
	//   14   38:aload_0         
	//   15   39:invokevirtual   #1259 <Method void addXFormsToBody()>
		for(Iterator iterator1 = readerInstances.values().iterator(); iterator1.hasNext(); currentPdfReaderInstance.writeAllPages())
	//*  16   42:aload_0         
	//*  17   43:getfield        #550 <Field HashMap readerInstances>
	//*  18   46:invokevirtual   #1260 <Method Collection HashMap.values()>
	//*  19   49:invokeinterface #1251 <Method Iterator Collection.iterator()>
	//*  20   54:astore_1        
	//*  21   55:aload_1         
	//*  22   56:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  23   61:ifeq            87
			currentPdfReaderInstance = (PdfReaderInstance)iterator1.next();
	//   24   64:aload_0         
	//   25   65:aload_1         
	//   26   66:invokeinterface #636 <Method Object Iterator.next()>
	//   27   71:checkcast       #1124 <Class PdfReaderInstance>
	//   28   74:putfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>

	//   29   77:aload_0         
	//   30   78:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//   31   81:invokevirtual   #1265 <Method void PdfReaderInstance.writeAllPages()>
	//*  32   84:goto            55
		currentPdfReaderInstance = null;
	//   33   87:aload_0         
	//   34   88:aconst_null     
	//   35   89:putfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
		ColorDetails colordetails;
		for(Iterator iterator2 = documentColors.values().iterator(); iterator2.hasNext(); addToBody(colordetails.getPdfObject(this), colordetails.getIndirectReference()))
	//*  36   92:aload_0         
	//*  37   93:getfield        #552 <Field HashMap documentColors>
	//*  38   96:invokevirtual   #1260 <Method Collection HashMap.values()>
	//*  39   99:invokeinterface #1251 <Method Iterator Collection.iterator()>
	//*  40  104:astore_1        
	//*  41  105:aload_1         
	//*  42  106:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  43  111:ifeq            141
			colordetails = (ColorDetails)iterator2.next();
	//   44  114:aload_1         
	//   45  115:invokeinterface #636 <Method Object Iterator.next()>
	//   46  120:checkcast       #1267 <Class ColorDetails>
	//   47  123:astore_2        

	//   48  124:aload_0         
	//   49  125:aload_2         
	//   50  126:aload_0         
	//   51  127:invokevirtual   #1270 <Method PdfObject ColorDetails.getPdfObject(PdfWriter)>
	//   52  130:aload_2         
	//   53  131:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   54  134:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   55  137:pop             
	//*  56  138:goto            105
		PdfPatternPainter pdfpatternpainter;
		for(Iterator iterator3 = documentPatterns.keySet().iterator(); iterator3.hasNext(); addToBody(((PdfObject) (pdfpatternpainter.getPattern(compressionLevel))), pdfpatternpainter.getIndirectReference()))
	//*  57  141:aload_0         
	//*  58  142:getfield        #556 <Field HashMap documentPatterns>
	//*  59  145:invokevirtual   #1274 <Method Set HashMap.keySet()>
	//*  60  148:invokeinterface #1170 <Method Iterator Set.iterator()>
	//*  61  153:astore_1        
	//*  62  154:aload_1         
	//*  63  155:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  64  160:ifeq            193
			pdfpatternpainter = (PdfPatternPainter)iterator3.next();
	//   65  163:aload_1         
	//   66  164:invokeinterface #636 <Method Object Iterator.next()>
	//   67  169:checkcast       #1276 <Class PdfPatternPainter>
	//   68  172:astore_2        

	//   69  173:aload_0         
	//   70  174:aload_2         
	//   71  175:aload_0         
	//   72  176:getfield        #534 <Field int compressionLevel>
	//   73  179:invokevirtual   #1280 <Method PdfPattern PdfPatternPainter.getPattern(int)>
	//   74  182:aload_2         
	//   75  183:invokevirtual   #1281 <Method PdfIndirectReference PdfPatternPainter.getIndirectReference()>
	//   76  186:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   77  189:pop             
	//*  78  190:goto            154
		for(Iterator iterator4 = documentShadingPatterns.iterator(); iterator4.hasNext(); ((PdfShadingPattern)iterator4.next()).addToBody());
	//   79  193:aload_0         
	//   80  194:getfield        #563 <Field HashSet documentShadingPatterns>
	//   81  197:invokevirtual   #1282 <Method Iterator HashSet.iterator()>
	//   82  200:astore_1        
	//   83  201:aload_1         
	//   84  202:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   85  207:ifeq            225
	//   86  210:aload_1         
	//   87  211:invokeinterface #636 <Method Object Iterator.next()>
	//   88  216:checkcast       #1284 <Class PdfShadingPattern>
	//   89  219:invokevirtual   #1286 <Method void PdfShadingPattern.addToBody()>
	//*  90  222:goto            201
		for(Iterator iterator5 = documentShadings.iterator(); iterator5.hasNext(); ((PdfShading)iterator5.next()).addToBody());
	//   91  225:aload_0         
	//   92  226:getfield        #565 <Field HashSet documentShadings>
	//   93  229:invokevirtual   #1282 <Method Iterator HashSet.iterator()>
	//   94  232:astore_1        
	//   95  233:aload_1         
	//   96  234:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   97  239:ifeq            257
	//   98  242:aload_1         
	//   99  243:invokeinterface #636 <Method Object Iterator.next()>
	//  100  248:checkcast       #1288 <Class PdfShading>
	//  101  251:invokevirtual   #1289 <Method void PdfShading.addToBody()>
	//* 102  254:goto            233
		java.util.Map.Entry entry;
		for(Iterator iterator6 = documentExtGState.entrySet().iterator(); iterator6.hasNext(); addToBody(((PdfObject) ((PdfDictionary)entry.getKey())), (PdfIndirectReference)((PdfObject[])entry.getValue())[1]))
	//* 103  257:aload_0         
	//* 104  258:getfield        #567 <Field HashMap documentExtGState>
	//* 105  261:invokevirtual   #1290 <Method Set HashMap.entrySet()>
	//* 106  264:invokeinterface #1170 <Method Iterator Set.iterator()>
	//* 107  269:astore_1        
	//* 108  270:aload_1         
	//* 109  271:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//* 110  276:ifeq            320
			entry = (java.util.Map.Entry)iterator6.next();
	//  111  279:aload_1         
	//  112  280:invokeinterface #636 <Method Object Iterator.next()>
	//  113  285:checkcast       #1172 <Class java.util.Map$Entry>
	//  114  288:astore_2        

	//  115  289:aload_0         
	//  116  290:aload_2         
	//  117  291:invokeinterface #1174 <Method Object java.util.Map$Entry.getKey()>
	//  118  296:checkcast       #508 <Class PdfDictionary>
	//  119  299:aload_2         
	//  120  300:invokeinterface #1177 <Method Object java.util.Map$Entry.getValue()>
	//  121  305:checkcast       #1292 <Class PdfObject[]>
	//  122  308:iconst_1        
	//  123  309:aaload          
	//  124  310:checkcast       #907 <Class PdfIndirectReference>
	//  125  313:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  126  316:pop             
	//* 127  317:goto            270
		Iterator iterator7 = documentProperties.entrySet().iterator();
	//  128  320:aload_0         
	//  129  321:getfield        #569 <Field HashMap documentProperties>
	//  130  324:invokevirtual   #1290 <Method Set HashMap.entrySet()>
	//  131  327:invokeinterface #1170 <Method Iterator Set.iterator()>
	//  132  332:astore_1        
		do
		{
			if(!iterator7.hasNext())
				break;
	//  133  333:aload_1         
	//  134  334:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//  135  339:ifeq            429
			java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator7.next();
	//  136  342:aload_1         
	//  137  343:invokeinterface #636 <Method Object Iterator.next()>
	//  138  348:checkcast       #1172 <Class java.util.Map$Entry>
	//  139  351:astore_3        
			Object obj = entry1.getKey();
	//  140  352:aload_3         
	//  141  353:invokeinterface #1174 <Method Object java.util.Map$Entry.getKey()>
	//  142  358:astore_2        
			PdfObject apdfobject[] = (PdfObject[])entry1.getValue();
	//  143  359:aload_3         
	//  144  360:invokeinterface #1177 <Method Object java.util.Map$Entry.getValue()>
	//  145  365:checkcast       #1292 <Class PdfObject[]>
	//  146  368:astore_3        
			if(obj instanceof PdfLayerMembership)
	//* 147  369:aload_2         
	//* 148  370:instanceof      #1294 <Class PdfLayerMembership>
	//* 149  373:ifeq            397
			{
				obj = ((Object) ((PdfLayerMembership)obj));
	//  150  376:aload_2         
	//  151  377:checkcast       #1294 <Class PdfLayerMembership>
	//  152  380:astore_2        
				addToBody(((PdfLayerMembership) (obj)).getPdfObject(), ((PdfLayerMembership) (obj)).getRef());
	//  153  381:aload_0         
	//  154  382:aload_2         
	//  155  383:invokevirtual   #1297 <Method PdfObject PdfLayerMembership.getPdfObject()>
	//  156  386:aload_2         
	//  157  387:invokevirtual   #1298 <Method PdfIndirectReference PdfLayerMembership.getRef()>
	//  158  390:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  159  393:pop             
			} else
	//* 160  394:goto            333
			if((obj instanceof PdfDictionary) && !(obj instanceof PdfLayer))
	//* 161  397:aload_2         
	//* 162  398:instanceof      #508 <Class PdfDictionary>
	//* 163  401:ifeq            333
	//* 164  404:aload_2         
	//* 165  405:instanceof      #638 <Class PdfLayer>
	//* 166  408:ifne            333
				addToBody(((PdfObject) ((PdfDictionary)obj)), (PdfIndirectReference)apdfobject[1]);
	//  167  411:aload_0         
	//  168  412:aload_2         
	//  169  413:checkcast       #508 <Class PdfDictionary>
	//  170  416:aload_3         
	//  171  417:iconst_1        
	//  172  418:aaload          
	//  173  419:checkcast       #907 <Class PdfIndirectReference>
	//  174  422:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  175  425:pop             
		} while(true);
	//  176  426:goto            333
	//  177  429:return          
	}

	ColorDetails addSimple(ICachedColorSpace icachedcolorspace)
	{
		ColorDetails colordetails1 = (ColorDetails)documentColors.get(((Object) (icachedcolorspace)));
	//    0    0:aload_0         
	//    1    1:getfield        #552 <Field HashMap documentColors>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1267 <Class ColorDetails>
	//    5   11:astore_3        
		ColorDetails colordetails = colordetails1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(colordetails1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       66
		{
			colordetails = new ColorDetails(getColorspaceName(), body.getPdfIndirectReference(), icachedcolorspace);
	//   10   18:new             #1267 <Class ColorDetails>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokevirtual   #1303 <Method PdfName getColorspaceName()>
	//   14   26:aload_0         
	//   15   27:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   16   30:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   17   33:aload_1         
	//   18   34:invokespecial   #1309 <Method void ColorDetails(PdfName, PdfIndirectReference, ICachedColorSpace)>
	//   19   37:astore_2        
			if(icachedcolorspace instanceof IPdfSpecialColorSpace)
	//*  20   38:aload_1         
	//*  21   39:instanceof      #1311 <Class IPdfSpecialColorSpace>
	//*  22   42:ifeq            56
				((IPdfSpecialColorSpace)icachedcolorspace).getColorantDetails(this);
	//   23   45:aload_1         
	//   24   46:checkcast       #1311 <Class IPdfSpecialColorSpace>
	//   25   49:aload_0         
	//   26   50:invokeinterface #1315 <Method ColorDetails[] IPdfSpecialColorSpace.getColorantDetails(PdfWriter)>
	//   27   55:pop             
			documentColors.put(((Object) (icachedcolorspace)), ((Object) (colordetails)));
	//   28   56:aload_0         
	//   29   57:getfield        #552 <Field HashMap documentColors>
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   33   65:pop             
		}
		return colordetails;
	//   34   66:aload_2         
	//   35   67:areturn         
	}

	FontDetails addSimple(BaseFont basefont)
	{
		FontDetails fontdetails = (FontDetails)documentFonts.get(((Object) (basefont)));
	//    0    0:aload_0         
	//    1    1:getfield        #539 <Field LinkedHashMap documentFonts>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1317 <Method Object LinkedHashMap.get(Object)>
	//    4    8:checkcast       #1253 <Class FontDetails>
	//    5   11:astore          4
		Object obj = ((Object) (fontdetails));
	//    6   13:aload           4
	//    7   15:astore_3        
		if(fontdetails == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       102
		{
			checkPdfIsoConformance(this, 4, ((Object) (basefont)));
	//   10   21:aload_0         
	//   11   22:iconst_4        
	//   12   23:aload_1         
	//   13   24:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
			if(basefont.getFontType() == 4)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #1322 <Method int BaseFont.getFontType()>
	//*  16   31:iconst_4        
	//*  17   32:icmpne          104
			{
				obj = ((Object) ((new StringBuilder()).append("F")));
	//   18   35:new             #1006 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #1007 <Method void StringBuilder()>
	//   21   42:ldc2            #1323 <String "F">
	//   22   45:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:astore_3        
				int i = fontNumber;
	//   24   49:aload_0         
	//   25   50:getfield        #541 <Field int fontNumber>
	//   26   53:istore_2        
				fontNumber = i + 1;
	//   27   54:aload_0         
	//   28   55:iload_2         
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:putfield        #541 <Field int fontNumber>
				obj = ((Object) (new FontDetails(new PdfName(((StringBuilder) (obj)).append(i).toString()), ((DocumentFont)basefont).getIndirectReference(), basefont)));
	//   32   61:new             #1253 <Class FontDetails>
	//   33   64:dup             
	//   34   65:new             #271 <Class PdfName>
	//   35   68:dup             
	//   36   69:aload_3         
	//   37   70:iload_2         
	//   38   71:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   39   74:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   40   77:invokespecial   #277 <Method void PdfName(String)>
	//   41   80:aload_1         
	//   42   81:checkcast       #1325 <Class DocumentFont>
	//   43   84:invokevirtual   #1326 <Method PdfIndirectReference DocumentFont.getIndirectReference()>
	//   44   87:aload_1         
	//   45   88:invokespecial   #1329 <Method void FontDetails(PdfName, PdfIndirectReference, BaseFont)>
	//   46   91:astore_3        
			} else
	//*  47   92:aload_0         
	//*  48   93:getfield        #539 <Field LinkedHashMap documentFonts>
	//*  49   96:aload_1         
	//*  50   97:aload_3         
	//*  51   98:invokevirtual   #1330 <Method Object LinkedHashMap.put(Object, Object)>
	//*  52  101:pop             
	//*  53  102:aload_3         
	//*  54  103:areturn         
			{
				obj = ((Object) ((new StringBuilder()).append("F")));
	//   55  104:new             #1006 <Class StringBuilder>
	//   56  107:dup             
	//   57  108:invokespecial   #1007 <Method void StringBuilder()>
	//   58  111:ldc2            #1323 <String "F">
	//   59  114:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   60  117:astore_3        
				int j = fontNumber;
	//   61  118:aload_0         
	//   62  119:getfield        #541 <Field int fontNumber>
	//   63  122:istore_2        
				fontNumber = j + 1;
	//   64  123:aload_0         
	//   65  124:iload_2         
	//   66  125:iconst_1        
	//   67  126:iadd            
	//   68  127:putfield        #541 <Field int fontNumber>
				obj = ((Object) (new FontDetails(new PdfName(((StringBuilder) (obj)).append(j).toString()), body.getPdfIndirectReference(), basefont)));
	//   69  130:new             #1253 <Class FontDetails>
	//   70  133:dup             
	//   71  134:new             #271 <Class PdfName>
	//   72  137:dup             
	//   73  138:aload_3         
	//   74  139:iload_2         
	//   75  140:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   76  143:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   77  146:invokespecial   #277 <Method void PdfName(String)>
	//   78  149:aload_0         
	//   79  150:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   80  153:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   81  156:aload_1         
	//   82  157:invokespecial   #1329 <Method void FontDetails(PdfName, PdfIndirectReference, BaseFont)>
	//   83  160:astore_3        
			}
			documentFonts.put(((Object) (basefont)), obj);
		}
		return ((FontDetails) (obj));
	//*  84  161:goto            92
	}

	PdfObject[] addSimpleExtGState(PdfDictionary pdfdictionary)
	{
		if(!documentExtGState.containsKey(((Object) (pdfdictionary))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #567 <Field HashMap documentExtGState>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #998 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            69
			documentExtGState.put(((Object) (pdfdictionary)), ((Object) (new PdfObject[] {
				new PdfName((new StringBuilder()).append("GS").append(documentExtGState.size() + 1).toString()), getPdfIndirectReference()
			})));
	//    5   11:aload_0         
	//    6   12:getfield        #567 <Field HashMap documentExtGState>
	//    7   15:aload_1         
	//    8   16:iconst_2        
	//    9   17:anewarray       PdfObject[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:new             #271 <Class PdfName>
	//   13   25:dup             
	//   14   26:new             #1006 <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #1007 <Method void StringBuilder()>
	//   17   33:ldc2            #1334 <String "GS">
	//   18   36:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:aload_0         
	//   20   40:getfield        #567 <Field HashMap documentExtGState>
	//   21   43:invokevirtual   #1014 <Method int HashMap.size()>
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   25   51:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   26   54:invokespecial   #277 <Method void PdfName(String)>
	//   27   57:aastore         
	//   28   58:dup             
	//   29   59:iconst_1        
	//   30   60:aload_0         
	//   31   61:invokevirtual   #1190 <Method PdfIndirectReference getPdfIndirectReference()>
	//   32   64:aastore         
	//   33   65:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   34   68:pop             
		return (PdfObject[])documentExtGState.get(((Object) (pdfdictionary)));
	//   35   69:aload_0         
	//   36   70:getfield        #567 <Field HashMap documentExtGState>
	//   37   73:aload_1         
	//   38   74:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//   39   77:checkcast       #1292 <Class PdfObject[]>
	//   40   80:areturn         
	}

	PdfName addSimplePattern(PdfPatternPainter pdfpatternpainter)
	{
		PdfName pdfname;
		PdfName pdfname1 = (PdfName)documentPatterns.get(((Object) (pdfpatternpainter)));
	//    0    0:aload_0         
	//    1    1:getfield        #556 <Field HashMap documentPatterns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #271 <Class PdfName>
	//    5   11:astore_3        
		pdfname = pdfname1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(pdfname1 != null)
			break MISSING_BLOCK_LABEL_69;
	//    8   14:aload_3         
	//    9   15:ifnonnull       69
		pdfname = new PdfName((new StringBuilder()).append("P").append(patternNumber).toString());
	//   10   18:new             #271 <Class PdfName>
	//   11   21:dup             
	//   12   22:new             #1006 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #1007 <Method void StringBuilder()>
	//   15   29:ldc2            #1337 <String "P">
	//   16   32:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:getfield        #558 <Field int patternNumber>
	//   19   39:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   20   42:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   21   45:invokespecial   #277 <Method void PdfName(String)>
	//   22   48:astore_2        
		patternNumber = patternNumber + 1;
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #558 <Field int patternNumber>
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:putfield        #558 <Field int patternNumber>
		documentPatterns.put(((Object) (pdfpatternpainter)), ((Object) (pdfname)));
	//   29   59:aload_0         
	//   30   60:getfield        #556 <Field HashMap documentPatterns>
	//   31   63:aload_1         
	//   32   64:aload_2         
	//   33   65:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   34   68:pop             
		return pdfname;
	//   35   69:aload_2         
	//   36   70:areturn         
		pdfpatternpainter;
	//   37   71:astore_1        
_L2:
		throw new ExceptionConverter(((Exception) (pdfpatternpainter)));
	//   38   72:new             #885 <Class ExceptionConverter>
	//   39   75:dup             
	//   40   76:aload_1         
	//   41   77:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   42   80:athrow          
		pdfpatternpainter;
	//   43   81:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  44   82:goto            72
	}

	ColorDetails addSimplePatternColorspace(BaseColor basecolor)
	{
		int i;
		i = ExtendedColor.getType(basecolor);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1344 <Method int ExtendedColor.getType(BaseColor)>
	//    2    4:istore_2        
		if(i == 4 || i == 5)
	//*   3    5:iload_2         
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          15
	//*   6   10:iload_2         
	//*   7   11:iconst_5        
	//*   8   12:icmpne          33
			throw new RuntimeException(MessageLocalization.getComposedMessage("an.uncolored.tile.pattern.can.not.have.another.pattern.or.shading.as.color", new Object[0]));
	//    9   15:new             #1346 <Class RuntimeException>
	//   10   18:dup             
	//   11   19:ldc2            #1348 <String "an.uncolored.tile.pattern.can.not.have.another.pattern.or.shading.as.color">
	//   12   22:iconst_0        
	//   13   23:anewarray       Object[]
	//   14   26:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   29:invokespecial   #1349 <Method void RuntimeException(String)>
	//   16   32:athrow          
		i;
	//   17   33:iload_2         
		JVM INSTR tableswitch 0 3: default 64
	//	               0 95
	//	               1 229
	//	               2 162
	//	               3 296;
	//   18   34:tableswitch     0 3: default 64
	//	               0 95
	//	               1 229
	//	               2 162
	//	               3 296
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		try
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.color.type", new Object[0]));
	//   19   64:new             #1346 <Class RuntimeException>
	//   20   67:dup             
	//   21   68:ldc2            #1351 <String "invalid.color.type">
	//   22   71:iconst_0        
	//   23   72:anewarray       Object[]
	//   24   75:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   25   78:invokespecial   #1349 <Method void RuntimeException(String)>
	//   26   81:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(BaseColor basecolor)
	//*  27   82:astore_1        
		{
			throw new RuntimeException(((Exception) (basecolor)).getMessage());
	//   28   83:new             #1346 <Class RuntimeException>
	//   29   86:dup             
	//   30   87:aload_1         
	//   31   88:invokevirtual   #1354 <Method String Exception.getMessage()>
	//   32   91:invokespecial   #1349 <Method void RuntimeException(String)>
	//   33   94:athrow          
		}
_L2:
		if(patternColorspaceRGB == null)
	//*  34   95:aload_0         
	//*  35   96:getfield        #1356 <Field ColorDetails patternColorspaceRGB>
	//*  36   99:ifnonnull       157
		{
			patternColorspaceRGB = new ColorDetails(getColorspaceName(), body.getPdfIndirectReference(), ((ICachedColorSpace) (null)));
	//   37  102:aload_0         
	//   38  103:new             #1267 <Class ColorDetails>
	//   39  106:dup             
	//   40  107:aload_0         
	//   41  108:invokevirtual   #1303 <Method PdfName getColorspaceName()>
	//   42  111:aload_0         
	//   43  112:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   44  115:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   45  118:aconst_null     
	//   46  119:invokespecial   #1309 <Method void ColorDetails(PdfName, PdfIndirectReference, ICachedColorSpace)>
	//   47  122:putfield        #1356 <Field ColorDetails patternColorspaceRGB>
			basecolor = ((BaseColor) (new PdfArray(((PdfObject) (PdfName.PATTERN)))));
	//   48  125:new             #582 <Class PdfArray>
	//   49  128:dup             
	//   50  129:getstatic       #1359 <Field PdfName PdfName.PATTERN>
	//   51  132:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//   52  135:astore_1        
			((PdfArray) (basecolor)).add(((PdfObject) (PdfName.DEVICERGB)));
	//   53  136:aload_1         
	//   54  137:getstatic       #967 <Field PdfName PdfName.DEVICERGB>
	//   55  140:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   56  143:pop             
			addToBody(((PdfObject) (basecolor)), patternColorspaceRGB.getIndirectReference());
	//   57  144:aload_0         
	//   58  145:aload_1         
	//   59  146:aload_0         
	//   60  147:getfield        #1356 <Field ColorDetails patternColorspaceRGB>
	//   61  150:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   62  153:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   63  156:pop             
		}
		return patternColorspaceRGB;
	//   64  157:aload_0         
	//   65  158:getfield        #1356 <Field ColorDetails patternColorspaceRGB>
	//   66  161:areturn         
_L4:
		if(patternColorspaceCMYK == null)
	//*  67  162:aload_0         
	//*  68  163:getfield        #1361 <Field ColorDetails patternColorspaceCMYK>
	//*  69  166:ifnonnull       224
		{
			patternColorspaceCMYK = new ColorDetails(getColorspaceName(), body.getPdfIndirectReference(), ((ICachedColorSpace) (null)));
	//   70  169:aload_0         
	//   71  170:new             #1267 <Class ColorDetails>
	//   72  173:dup             
	//   73  174:aload_0         
	//   74  175:invokevirtual   #1303 <Method PdfName getColorspaceName()>
	//   75  178:aload_0         
	//   76  179:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   77  182:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   78  185:aconst_null     
	//   79  186:invokespecial   #1309 <Method void ColorDetails(PdfName, PdfIndirectReference, ICachedColorSpace)>
	//   80  189:putfield        #1361 <Field ColorDetails patternColorspaceCMYK>
			basecolor = ((BaseColor) (new PdfArray(((PdfObject) (PdfName.PATTERN)))));
	//   81  192:new             #582 <Class PdfArray>
	//   82  195:dup             
	//   83  196:getstatic       #1359 <Field PdfName PdfName.PATTERN>
	//   84  199:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//   85  202:astore_1        
			((PdfArray) (basecolor)).add(((PdfObject) (PdfName.DEVICECMYK)));
	//   86  203:aload_1         
	//   87  204:getstatic       #1364 <Field PdfName PdfName.DEVICECMYK>
	//   88  207:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   89  210:pop             
			addToBody(((PdfObject) (basecolor)), patternColorspaceCMYK.getIndirectReference());
	//   90  211:aload_0         
	//   91  212:aload_1         
	//   92  213:aload_0         
	//   93  214:getfield        #1361 <Field ColorDetails patternColorspaceCMYK>
	//   94  217:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//   95  220:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   96  223:pop             
		}
		return patternColorspaceCMYK;
	//   97  224:aload_0         
	//   98  225:getfield        #1361 <Field ColorDetails patternColorspaceCMYK>
	//   99  228:areturn         
_L3:
		if(patternColorspaceGRAY == null)
	//* 100  229:aload_0         
	//* 101  230:getfield        #1366 <Field ColorDetails patternColorspaceGRAY>
	//* 102  233:ifnonnull       291
		{
			patternColorspaceGRAY = new ColorDetails(getColorspaceName(), body.getPdfIndirectReference(), ((ICachedColorSpace) (null)));
	//  103  236:aload_0         
	//  104  237:new             #1267 <Class ColorDetails>
	//  105  240:dup             
	//  106  241:aload_0         
	//  107  242:invokevirtual   #1303 <Method PdfName getColorspaceName()>
	//  108  245:aload_0         
	//  109  246:getfield        #1305 <Field PdfWriter$PdfBody body>
	//  110  249:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//  111  252:aconst_null     
	//  112  253:invokespecial   #1309 <Method void ColorDetails(PdfName, PdfIndirectReference, ICachedColorSpace)>
	//  113  256:putfield        #1366 <Field ColorDetails patternColorspaceGRAY>
			basecolor = ((BaseColor) (new PdfArray(((PdfObject) (PdfName.PATTERN)))));
	//  114  259:new             #582 <Class PdfArray>
	//  115  262:dup             
	//  116  263:getstatic       #1359 <Field PdfName PdfName.PATTERN>
	//  117  266:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//  118  269:astore_1        
			((PdfArray) (basecolor)).add(((PdfObject) (PdfName.DEVICEGRAY)));
	//  119  270:aload_1         
	//  120  271:getstatic       #1369 <Field PdfName PdfName.DEVICEGRAY>
	//  121  274:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  122  277:pop             
			addToBody(((PdfObject) (basecolor)), patternColorspaceGRAY.getIndirectReference());
	//  123  278:aload_0         
	//  124  279:aload_1         
	//  125  280:aload_0         
	//  126  281:getfield        #1366 <Field ColorDetails patternColorspaceGRAY>
	//  127  284:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//  128  287:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  129  290:pop             
		}
		return patternColorspaceGRAY;
	//  130  291:aload_0         
	//  131  292:getfield        #1366 <Field ColorDetails patternColorspaceGRAY>
	//  132  295:areturn         
_L5:
		ColorDetails colordetails;
		ColorDetails colordetails1;
		colordetails1 = addSimple(((ICachedColorSpace) (((SpotColor)basecolor).getPdfSpotColor())));
	//  133  296:aload_0         
	//  134  297:aload_1         
	//  135  298:checkcast       #1371 <Class SpotColor>
	//  136  301:invokevirtual   #1375 <Method PdfSpotColor SpotColor.getPdfSpotColor()>
	//  137  304:invokevirtual   #1377 <Method ColorDetails addSimple(ICachedColorSpace)>
	//  138  307:astore          4
		colordetails = (ColorDetails)documentSpotPatterns.get(((Object) (colordetails1)));
	//  139  309:aload_0         
	//  140  310:getfield        #595 <Field HashMap documentSpotPatterns>
	//  141  313:aload           4
	//  142  315:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//  143  318:checkcast       #1267 <Class ColorDetails>
	//  144  321:astore_3        
		basecolor = ((BaseColor) (colordetails));
	//  145  322:aload_3         
	//  146  323:astore_1        
		if(colordetails != null) goto _L7; else goto _L6
	//  147  324:aload_3         
	//  148  325:ifnonnull       390
_L6:
		basecolor = ((BaseColor) (new ColorDetails(getColorspaceName(), body.getPdfIndirectReference(), ((ICachedColorSpace) (null)))));
	//  149  328:new             #1267 <Class ColorDetails>
	//  150  331:dup             
	//  151  332:aload_0         
	//  152  333:invokevirtual   #1303 <Method PdfName getColorspaceName()>
	//  153  336:aload_0         
	//  154  337:getfield        #1305 <Field PdfWriter$PdfBody body>
	//  155  340:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//  156  343:aconst_null     
	//  157  344:invokespecial   #1309 <Method void ColorDetails(PdfName, PdfIndirectReference, ICachedColorSpace)>
	//  158  347:astore_1        
		PdfArray pdfarray = new PdfArray(((PdfObject) (PdfName.PATTERN)));
	//  159  348:new             #582 <Class PdfArray>
	//  160  351:dup             
	//  161  352:getstatic       #1359 <Field PdfName PdfName.PATTERN>
	//  162  355:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//  163  358:astore_3        
		pdfarray.add(((PdfObject) (colordetails1.getIndirectReference())));
	//  164  359:aload_3         
	//  165  360:aload           4
	//  166  362:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//  167  365:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  168  368:pop             
		addToBody(((PdfObject) (pdfarray)), ((ColorDetails) (basecolor)).getIndirectReference());
	//  169  369:aload_0         
	//  170  370:aload_3         
	//  171  371:aload_1         
	//  172  372:invokevirtual   #1271 <Method PdfIndirectReference ColorDetails.getIndirectReference()>
	//  173  375:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  174  378:pop             
		documentSpotPatterns.put(((Object) (colordetails1)), ((Object) (basecolor)));
	//  175  379:aload_0         
	//  176  380:getfield        #595 <Field HashMap documentSpotPatterns>
	//  177  383:aload           4
	//  178  385:aload_1         
	//  179  386:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//  180  389:pop             
_L7:
		return ((ColorDetails) (basecolor));
	//  181  390:aload_1         
	//  182  391:areturn         
	}

	PdfObject[] addSimpleProperty(Object obj, PdfIndirectReference pdfindirectreference)
	{
		if(!documentProperties.containsKey(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #569 <Field HashMap documentProperties>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #998 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            80
		{
			if(obj instanceof PdfOCG)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #1381 <Class PdfOCG>
	//*   7   15:ifeq            25
				checkPdfIsoConformance(this, 7, obj);
	//    8   18:aload_0         
	//    9   19:bipush          7
	//   10   21:aload_1         
	//   11   22:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
			documentProperties.put(obj, ((Object) (new PdfObject[] {
				new PdfName((new StringBuilder()).append("Pr").append(documentProperties.size() + 1).toString()), pdfindirectreference
			})));
	//   12   25:aload_0         
	//   13   26:getfield        #569 <Field HashMap documentProperties>
	//   14   29:aload_1         
	//   15   30:iconst_2        
	//   16   31:anewarray       PdfObject[]
	//   17   34:dup             
	//   18   35:iconst_0        
	//   19   36:new             #271 <Class PdfName>
	//   20   39:dup             
	//   21   40:new             #1006 <Class StringBuilder>
	//   22   43:dup             
	//   23   44:invokespecial   #1007 <Method void StringBuilder()>
	//   24   47:ldc2            #1383 <String "Pr">
	//   25   50:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:aload_0         
	//   27   54:getfield        #569 <Field HashMap documentProperties>
	//   28   57:invokevirtual   #1014 <Method int HashMap.size()>
	//   29   60:iconst_1        
	//   30   61:iadd            
	//   31   62:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   32   65:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   33   68:invokespecial   #277 <Method void PdfName(String)>
	//   34   71:aastore         
	//   35   72:dup             
	//   36   73:iconst_1        
	//   37   74:aload_2         
	//   38   75:aastore         
	//   39   76:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   40   79:pop             
		}
		return (PdfObject[])documentProperties.get(obj);
	//   41   80:aload_0         
	//   42   81:getfield        #569 <Field HashMap documentProperties>
	//   43   84:aload_1         
	//   44   85:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//   45   88:checkcast       #1292 <Class PdfObject[]>
	//   46   91:areturn         
	}

	void addSimpleShading(PdfShading pdfshading)
	{
		if(!documentShadings.contains(((Object) (pdfshading))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #565 <Field HashSet documentShadings>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1387 <Method boolean HashSet.contains(Object)>
	//*   4    8:ifne            31
		{
			documentShadings.add(((Object) (pdfshading)));
	//    5   11:aload_0         
	//    6   12:getfield        #565 <Field HashSet documentShadings>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1389 <Method boolean HashSet.add(Object)>
	//    9   19:pop             
			pdfshading.setName(documentShadings.size());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #565 <Field HashSet documentShadings>
	//   13   25:invokevirtual   #1390 <Method int HashSet.size()>
	//   14   28:invokevirtual   #1394 <Method void PdfShading.setName(int)>
		}
	//   15   31:return          
	}

	void addSimpleShadingPattern(PdfShadingPattern pdfshadingpattern)
	{
		if(!documentShadingPatterns.contains(((Object) (pdfshadingpattern))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #563 <Field HashSet documentShadingPatterns>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1387 <Method boolean HashSet.contains(Object)>
	//*   4    8:ifne            46
		{
			pdfshadingpattern.setName(patternNumber);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #558 <Field int patternNumber>
	//    8   16:invokevirtual   #1397 <Method void PdfShadingPattern.setName(int)>
			patternNumber = patternNumber + 1;
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #558 <Field int patternNumber>
	//   12   24:iconst_1        
	//   13   25:iadd            
	//   14   26:putfield        #558 <Field int patternNumber>
			documentShadingPatterns.add(((Object) (pdfshadingpattern)));
	//   15   29:aload_0         
	//   16   30:getfield        #563 <Field HashSet documentShadingPatterns>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #1389 <Method boolean HashSet.add(Object)>
	//   19   37:pop             
			addSimpleShading(pdfshadingpattern.getShading());
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #1401 <Method PdfShading PdfShadingPattern.getShading()>
	//   23   43:invokevirtual   #1403 <Method void addSimpleShading(PdfShading)>
		}
	//   24   46:return          
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1405 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject)>
	//    4    8:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, int i)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1412 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, int)>
	//    5    9:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, int i, boolean flag)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject, i, 0, flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iconst_0        
	//    5    7:iload_3         
	//    6    8:invokevirtual   #1416 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, int, int, boolean)>
	//    7   11:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//   11   17:aload_1         
	//   12   18:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, PdfIndirectReference pdfindirectreference)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject, pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1418 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, PdfIndirectReference)>
	//    5    9:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, PdfIndirectReference pdfindirectreference, boolean flag)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject, pdfindirectreference, flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #1421 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, PdfIndirectReference, boolean)>
	//    6   10:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, boolean flag)
		throws IOException
	{
		pdfobject = ((PdfObject) (body.add(pdfobject, flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1424 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, boolean)>
	//    5    9:astore_1        
		cacheObject(((PdfIndirectObject) (pdfobject)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #1409 <Method void cacheObject(PdfIndirectObject)>
		return ((PdfIndirectObject) (pdfobject));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		pdf.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1427 <Method void PdfDocument.addViewerPreference(PdfName, PdfObject)>
	//    5    9:return          
	}

	protected void addXFormsToBody()
		throws IOException
	{
		Iterator iterator = formXObjects.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #546 <Field HashMap formXObjects>
	//    2    4:invokevirtual   #1260 <Method Collection HashMap.values()>
	//    3    7:invokeinterface #1251 <Method Iterator Collection.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            83
			PdfTemplate pdftemplate = (PdfTemplate)((Object[])iterator.next())[1];
	//    8   22:aload_1         
	//    9   23:invokeinterface #636 <Method Object Iterator.next()>
	//   10   28:checkcast       #1111 <Class Object[]>
	//   11   31:iconst_1        
	//   12   32:aaload          
	//   13   33:checkcast       #1024 <Class PdfTemplate>
	//   14   36:astore_2        
			if((pdftemplate == null || !(pdftemplate.getIndirectReference() instanceof PRIndirectReference)) && pdftemplate != null && pdftemplate.getType() == 1)
	//*  15   37:aload_2         
	//*  16   38:ifnull          51
	//*  17   41:aload_2         
	//*  18   42:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//*  19   45:instanceof      #905 <Class PRIndirectReference>
	//*  20   48:ifne            13
	//*  21   51:aload_2         
	//*  22   52:ifnull          13
	//*  23   55:aload_2         
	//*  24   56:invokevirtual   #1116 <Method int PdfTemplate.getType()>
	//*  25   59:iconst_1        
	//*  26   60:icmpne          13
				addToBody(((PdfObject) (pdftemplate.getFormXObject(compressionLevel))), pdftemplate.getIndirectReference());
	//   27   63:aload_0         
	//   28   64:aload_2         
	//   29   65:aload_0         
	//   30   66:getfield        #534 <Field int compressionLevel>
	//   31   69:invokevirtual   #1431 <Method PdfStream PdfTemplate.getFormXObject(int)>
	//   32   72:aload_2         
	//   33   73:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//   34   76:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   35   79:pop             
		} while(true);
	//   36   80:goto            13
	//   37   83:return          
	}

	protected void buildStructTreeRootForTagged(PdfDictionary pdfdictionary)
	{
		if(tagged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #571 <Field boolean tagged>
	//*   2    4:ifeq            136
		{
			try
			{
				getStructureTreeRoot().buildTree();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1436 <Method PdfStructureTreeRoot getStructureTreeRoot()>
	//    5   11:invokevirtual   #1441 <Method void PdfStructureTreeRoot.buildTree()>
				Object obj;
				for(Iterator iterator = pdf.getStructElements().iterator(); iterator.hasNext(); addToBody(((PdfObject) (obj)), ((PdfStructureElement) (obj)).getReference()))
	//*   6   14:aload_0         
	//*   7   15:getfield        #609 <Field PdfDocument pdf>
	//*   8   18:invokevirtual   #1444 <Method Set PdfDocument.getStructElements()>
	//*   9   21:invokeinterface #1170 <Method Iterator Set.iterator()>
	//*  10   26:astore_2        
	//*  11   27:aload_2         
	//*  12   28:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            79
				{
					obj = ((Object) ((AccessibleElementId)iterator.next()));
	//   14   36:aload_2         
	//   15   37:invokeinterface #636 <Method Object Iterator.next()>
	//   16   42:checkcast       #1446 <Class AccessibleElementId>
	//   17   45:astore_3        
					obj = ((Object) (pdf.getStructElement(((AccessibleElementId) (obj)), false)));
	//   18   46:aload_0         
	//   19   47:getfield        #609 <Field PdfDocument pdf>
	//   20   50:aload_3         
	//   21   51:iconst_0        
	//   22   52:invokevirtual   #1450 <Method PdfStructureElement PdfDocument.getStructElement(AccessibleElementId, boolean)>
	//   23   55:astore_3        
				}

	//   24   56:aload_0         
	//   25   57:aload_3         
	//   26   58:aload_3         
	//   27   59:invokevirtual   #1455 <Method PdfIndirectReference PdfStructureElement.getReference()>
	//   28   62:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   29   65:pop             
			}
	//*  30   66:goto            27
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//*  31   69:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfdictionary)));
	//   32   70:new             #885 <Class ExceptionConverter>
	//   33   73:dup             
	//   34   74:aload_1         
	//   35   75:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   36   78:athrow          
			}
			pdfdictionary.put(PdfName.STRUCTTREEROOT, ((PdfObject) (structureTreeRoot.getReference())));
	//   37   79:aload_1         
	//   38   80:getstatic       #1458 <Field PdfName PdfName.STRUCTTREEROOT>
	//   39   83:aload_0         
	//   40   84:getfield        #1460 <Field PdfStructureTreeRoot structureTreeRoot>
	//   41   87:invokevirtual   #1461 <Method PdfIndirectReference PdfStructureTreeRoot.getReference()>
	//   42   90:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   43   93:new             #508 <Class PdfDictionary>
	//   44   96:dup             
	//   45   97:invokespecial   #509 <Method void PdfDictionary()>
	//   46  100:astore_2        
			pdfdictionary1.put(PdfName.MARKED, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   47  101:aload_2         
	//   48  102:getstatic       #1464 <Field PdfName PdfName.MARKED>
	//   49  105:getstatic       #1470 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   50  108:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(userProperties)
	//*  51  111:aload_0         
	//*  52  112:getfield        #1472 <Field boolean userProperties>
	//*  53  115:ifeq            128
				pdfdictionary1.put(PdfName.USERPROPERTIES, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   54  118:aload_2         
	//   55  119:getstatic       #1475 <Field PdfName PdfName.USERPROPERTIES>
	//   56  122:getstatic       #1470 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   57  125:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.MARKINFO, ((PdfObject) (pdfdictionary1)));
	//   58  128:aload_1         
	//   59  129:getstatic       #1478 <Field PdfName PdfName.MARKINFO>
	//   60  132:aload_2         
	//   61  133:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
	//   62  136:return          
	}

	protected void cacheObject(PdfIndirectObject pdfindirectobject)
	{
	//    0    0:return          
	}

	public void checkElementRole(IAccessibleElement iaccessibleelement, IAccessibleElement iaccessibleelement1)
	{
		if(iaccessibleelement1 != null && (iaccessibleelement1.getRole() == null || PdfName.ARTIFACT.equals(((Object) (iaccessibleelement1.getRole())))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          36
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #1485 <Method PdfName IAccessibleElement.getRole()>
	//*   4   10:ifnull          28
	//*   5   13:getstatic       #1488 <Field PdfName PdfName.ARTIFACT>
	//*   6   16:aload_2         
	//*   7   17:invokeinterface #1485 <Method PdfName IAccessibleElement.getRole()>
	//*   8   22:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*   9   25:ifeq            36
			iaccessibleelement.setRole(((PdfName) (null)));
	//   10   28:aload_1         
	//   11   29:aconst_null     
	//   12   30:invokeinterface #1491 <Method void IAccessibleElement.setRole(PdfName)>
		else
	//*  13   35:return          
		if((taggingMode & 1) != 0 && iaccessibleelement.isInline() && iaccessibleelement.getRole() == null && (iaccessibleelement1 == null || !iaccessibleelement1.isInline()))
	//*  14   36:aload_0         
	//*  15   37:getfield        #573 <Field int taggingMode>
	//*  16   40:iconst_1        
	//*  17   41:iand            
	//*  18   42:ifeq            35
	//*  19   45:aload_1         
	//*  20   46:invokeinterface #1494 <Method boolean IAccessibleElement.isInline()>
	//*  21   51:ifeq            35
	//*  22   54:aload_1         
	//*  23   55:invokeinterface #1485 <Method PdfName IAccessibleElement.getRole()>
	//*  24   60:ifnonnull       35
	//*  25   63:aload_2         
	//*  26   64:ifnull          76
	//*  27   67:aload_2         
	//*  28   68:invokeinterface #1494 <Method boolean IAccessibleElement.isInline()>
	//*  29   73:ifne            35
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("inline.elements.with.role.null.are.not.allowed", new Object[0]));
	//   30   76:new             #1496 <Class IllegalArgumentException>
	//   31   79:dup             
	//   32   80:ldc2            #1498 <String "inline.elements.with.role.null.are.not.allowed">
	//   33   83:iconst_0        
	//   34   84:anewarray       Object[]
	//   35   87:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   36   90:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   37   93:athrow          
	}

	public void checkPdfIsoConformance(int i, Object obj)
	{
		pdfIsoConformance.checkPdfIsoConformance(i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #1502 <Method void PdfIsoConformance.checkPdfIsoConformance(int, Object)>
	//    5   11:return          
	}

	public void clearTextWrap()
		throws DocumentException
	{
		pdf.clearTextWrap();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1505 <Method void PdfDocument.clearTextWrap()>
	//    3    7:return          
	}

	public void close()
	{
		if(!open) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #931 <Field boolean open>
	//    2    4:ifeq            537
_L1:
		if(currentPageNumber - 1 != pageReferences.size())
	//*   3    7:aload_0         
	//*   4    8:getfield        #504 <Field int currentPageNumber>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:aload_0         
	//*   8   14:getfield        #502 <Field ArrayList pageReferences>
	//*   9   17:invokevirtual   #831 <Method int ArrayList.size()>
	//*  10   20:icmpeq          78
			throw new RuntimeException((new StringBuilder()).append("The page ").append(pageReferences.size()).append(" was requested but the document has only ").append(currentPageNumber - 1).append(" pages.").toString());
	//   11   23:new             #1346 <Class RuntimeException>
	//   12   26:dup             
	//   13   27:new             #1006 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #1007 <Method void StringBuilder()>
	//   16   34:ldc2            #1510 <String "The page ">
	//   17   37:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #502 <Field ArrayList pageReferences>
	//   20   44:invokevirtual   #831 <Method int ArrayList.size()>
	//   21   47:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   22   50:ldc2            #1512 <String " was requested but the document has only ">
	//   23   53:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:aload_0         
	//   25   57:getfield        #504 <Field int currentPageNumber>
	//   26   60:iconst_1        
	//   27   61:isub            
	//   28   62:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   29   65:ldc2            #1514 <String " pages.">
	//   30   68:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   32   74:invokespecial   #1349 <Method void RuntimeException(String)>
	//   33   77:athrow          
		pdf.close();
	//   34   78:aload_0         
	//   35   79:getfield        #609 <Field PdfDocument pdf>
	//   36   82:invokevirtual   #1516 <Method void PdfDocument.close()>
		addSharedObjectsToBody();
	//   37   85:aload_0         
	//   38   86:invokevirtual   #1518 <Method void addSharedObjectsToBody()>
		PdfOCG pdfocg;
		for(Iterator iterator = documentOCG.iterator(); iterator.hasNext(); addToBody(pdfocg.getPdfObject(), pdfocg.getRef()))
	//*  39   89:aload_0         
	//*  40   90:getfield        #578 <Field LinkedHashSet documentOCG>
	//*  41   93:invokevirtual   #626 <Method Iterator LinkedHashSet.iterator()>
	//*  42   96:astore_2        
	//*  43   97:aload_2         
	//*  44   98:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  45  103:ifeq            153
			pdfocg = (PdfOCG)iterator.next();
	//   46  106:aload_2         
	//   47  107:invokeinterface #636 <Method Object Iterator.next()>
	//   48  112:checkcast       #1381 <Class PdfOCG>
	//   49  115:astore_3        

	//   50  116:aload_0         
	//   51  117:aload_3         
	//   52  118:invokeinterface #1519 <Method PdfObject PdfOCG.getPdfObject()>
	//   53  123:aload_3         
	//   54  124:invokeinterface #1520 <Method PdfIndirectReference PdfOCG.getRef()>
	//   55  129:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   56  132:pop             
		break MISSING_BLOCK_LABEL_153;
	//   57  133:goto            97
		Object obj;
		obj;
	//   58  136:astore_2        
		throw new ExceptionConverter(((Exception) (obj)));
	//   59  137:new             #885 <Class ExceptionConverter>
	//   60  140:dup             
	//   61  141:aload_2         
	//   62  142:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   63  145:athrow          
		obj;
	//   64  146:astore_2        
		super.close();
	//   65  147:aload_0         
	//   66  148:invokespecial   #1521 <Method void DocWriter.close()>
		throw obj;
	//   67  151:aload_2         
	//   68  152:athrow          
		Object obj1;
		Object obj2;
		obj1 = ((Object) (getCatalog(root.writePageTree())));
	//   69  153:aload_0         
	//   70  154:aload_0         
	//   71  155:getfield        #497 <Field PdfPages root>
	//   72  158:invokevirtual   #1524 <Method PdfIndirectReference PdfPages.writePageTree()>
	//   73  161:invokevirtual   #1528 <Method PdfDictionary getCatalog(PdfIndirectReference)>
	//   74  164:astore_2        
		if(!documentOCG.isEmpty())
	//*  75  165:aload_0         
	//*  76  166:getfield        #578 <Field LinkedHashSet documentOCG>
	//*  77  169:invokevirtual   #1531 <Method boolean LinkedHashSet.isEmpty()>
	//*  78  172:ifne            185
			checkPdfIsoConformance(this, 7, ((Object) (OCProperties)));
	//   79  175:aload_0         
	//   80  176:bipush          7
	//   81  178:aload_0         
	//   82  179:getfield        #663 <Field PdfOCProperties OCProperties>
	//   83  182:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
		if(xmpMetadata != null)
			break MISSING_BLOCK_LABEL_232;
	//   84  185:aload_0         
	//   85  186:getfield        #522 <Field byte[] xmpMetadata>
	//   86  189:ifnonnull       232
		obj2 = ((Object) (xmpWriter));
	//   87  192:aload_0         
	//   88  193:getfield        #524 <Field XmpWriter xmpWriter>
	//   89  196:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_232;
	//   90  197:aload_3         
	//   91  198:ifnull          232
		obj2 = ((Object) (new ByteArrayOutputStream()));
	//   92  201:new             #1533 <Class ByteArrayOutputStream>
	//   93  204:dup             
	//   94  205:invokespecial   #1534 <Method void ByteArrayOutputStream()>
	//   95  208:astore_3        
		xmpWriter.serialize(((OutputStream) (obj2)));
	//   96  209:aload_0         
	//   97  210:getfield        #524 <Field XmpWriter xmpWriter>
	//   98  213:aload_3         
	//   99  214:invokevirtual   #1539 <Method void XmpWriter.serialize(OutputStream)>
		xmpWriter.close();
	//  100  217:aload_0         
	//  101  218:getfield        #524 <Field XmpWriter xmpWriter>
	//  102  221:invokevirtual   #1540 <Method void XmpWriter.close()>
		xmpMetadata = ((ByteArrayOutputStream) (obj2)).toByteArray();
	//  103  224:aload_0         
	//  104  225:aload_3         
	//  105  226:invokevirtual   #1543 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  106  229:putfield        #522 <Field byte[] xmpMetadata>
_L5:
		PdfIndirectObject pdfindirectobject;
		PdfIndirectObject pdfindirectobject1;
		if(xmpMetadata != null)
	//* 107  232:aload_0         
	//* 108  233:getfield        #522 <Field byte[] xmpMetadata>
	//* 109  236:ifnull          333
		{
			obj2 = ((Object) (new PdfStream(xmpMetadata)));
	//  110  239:new             #1545 <Class PdfStream>
	//  111  242:dup             
	//  112  243:aload_0         
	//  113  244:getfield        #522 <Field byte[] xmpMetadata>
	//  114  247:invokespecial   #1547 <Method void PdfStream(byte[])>
	//  115  250:astore_3        
			((PdfStream) (obj2)).put(PdfName.TYPE, ((PdfObject) (PdfName.METADATA)));
	//  116  251:aload_3         
	//  117  252:getstatic       #958 <Field PdfName PdfName.TYPE>
	//  118  255:getstatic       #1550 <Field PdfName PdfName.METADATA>
	//  119  258:invokevirtual   #1551 <Method void PdfStream.put(PdfName, PdfObject)>
			((PdfStream) (obj2)).put(PdfName.SUBTYPE, ((PdfObject) (PdfName.XML)));
	//  120  261:aload_3         
	//  121  262:getstatic       #1554 <Field PdfName PdfName.SUBTYPE>
	//  122  265:getstatic       #1557 <Field PdfName PdfName.XML>
	//  123  268:invokevirtual   #1551 <Method void PdfStream.put(PdfName, PdfObject)>
			if(crypto != null && !crypto.isMetadataEncrypted())
	//* 124  271:aload_0         
	//* 125  272:getfield        #1559 <Field PdfEncryption crypto>
	//* 126  275:ifnull          315
	//* 127  278:aload_0         
	//* 128  279:getfield        #1559 <Field PdfEncryption crypto>
	//* 129  282:invokevirtual   #1564 <Method boolean PdfEncryption.isMetadataEncrypted()>
	//* 130  285:ifne            315
			{
				PdfArray pdfarray = new PdfArray();
	//  131  288:new             #582 <Class PdfArray>
	//  132  291:dup             
	//  133  292:invokespecial   #583 <Method void PdfArray()>
	//  134  295:astore          4
				pdfarray.add(((PdfObject) (PdfName.CRYPT)));
	//  135  297:aload           4
	//  136  299:getstatic       #1567 <Field PdfName PdfName.CRYPT>
	//  137  302:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  138  305:pop             
				((PdfStream) (obj2)).put(PdfName.FILTER, ((PdfObject) (pdfarray)));
	//  139  306:aload_3         
	//  140  307:getstatic       #1570 <Field PdfName PdfName.FILTER>
	//  141  310:aload           4
	//  142  312:invokevirtual   #1551 <Method void PdfStream.put(PdfName, PdfObject)>
			}
			((PdfDictionary) (obj1)).put(PdfName.METADATA, ((PdfObject) (body.add(((PdfObject) (obj2))).getIndirectReference())));
	//  143  315:aload_2         
	//  144  316:getstatic       #1550 <Field PdfName PdfName.METADATA>
	//  145  319:aload_0         
	//  146  320:getfield        #1305 <Field PdfWriter$PdfBody body>
	//  147  323:aload_3         
	//  148  324:invokevirtual   #1405 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject)>
	//  149  327:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  150  330:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(isPdfX())
	//* 151  333:aload_0         
	//* 152  334:invokevirtual   #702 <Method boolean isPdfX()>
	//* 153  337:ifeq            356
		{
			completeInfoDictionary(getInfo());
	//  154  340:aload_0         
	//  155  341:aload_0         
	//  156  342:invokevirtual   #1574 <Method PdfDictionary getInfo()>
	//  157  345:invokespecial   #1576 <Method void completeInfoDictionary(PdfDictionary)>
			completeExtraCatalog(getExtraCatalog());
	//  158  348:aload_0         
	//  159  349:aload_0         
	//  160  350:invokevirtual   #1579 <Method PdfDictionary getExtraCatalog()>
	//  161  353:invokespecial   #1581 <Method void completeExtraCatalog(PdfDictionary)>
		}
		if(extraCatalog != null)
	//* 162  356:aload_0         
	//* 163  357:getfield        #1583 <Field PdfDictionary extraCatalog>
	//* 164  360:ifnull          371
			((PdfDictionary) (obj1)).mergeDifferent(extraCatalog);
	//  165  363:aload_2         
	//  166  364:aload_0         
	//  167  365:getfield        #1583 <Field PdfDictionary extraCatalog>
	//  168  368:invokevirtual   #1586 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		writeOutlines(((PdfDictionary) (obj1)), false);
	//  169  371:aload_0         
	//  170  372:aload_2         
	//  171  373:iconst_0        
	//  172  374:invokevirtual   #1590 <Method void writeOutlines(PdfDictionary, boolean)>
		pdfindirectobject = addToBody(((PdfObject) (obj1)), false);
	//  173  377:aload_0         
	//  174  378:aload_2         
	//  175  379:iconst_0        
	//  176  380:invokevirtual   #1592 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//  177  383:astore          5
		pdfindirectobject1 = addToBody(((PdfObject) (getInfo())), false);
	//  178  385:aload_0         
	//  179  386:aload_0         
	//  180  387:invokevirtual   #1574 <Method PdfDictionary getInfo()>
	//  181  390:iconst_0        
	//  182  391:invokevirtual   #1592 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//  183  394:astore          6
		obj2 = null;
	//  184  396:aconst_null     
	//  185  397:astore_3        
		body.flushObjStm();
	//  186  398:aload_0         
	//  187  399:getfield        #1305 <Field PdfWriter$PdfBody body>
	//  188  402:invokevirtual   #1595 <Method void PdfWriter$PdfBody.flushObjStm()>
		boolean flag;
		PdfObject pdfobject;
		if(originalFileID != null)
	//* 189  405:aload_0         
	//* 190  406:getfield        #515 <Field byte[] originalFileID>
	//* 191  409:ifnull          651
			flag = true;
	//  192  412:iconst_1        
	//  193  413:istore_1        
		else
	//* 194  414:aload_0         
	//* 195  415:getfield        #1559 <Field PdfEncryption crypto>
	//* 196  418:ifnull          572
	//* 197  421:aload_0         
	//* 198  422:aload_0         
	//* 199  423:getfield        #1559 <Field PdfEncryption crypto>
	//* 200  426:invokevirtual   #1598 <Method PdfDictionary PdfEncryption.getEncryptionDictionary()>
	//* 201  429:iconst_0        
	//* 202  430:invokevirtual   #1592 <Method PdfIndirectObject addToBody(PdfObject, boolean)>
	//* 203  433:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 204  436:astore_2        
	//* 205  437:aload_0         
	//* 206  438:getfield        #1559 <Field PdfEncryption crypto>
	//* 207  441:iload_1         
	//* 208  442:invokevirtual   #1602 <Method PdfObject PdfEncryption.getFileID(boolean)>
	//* 209  445:astore_3        
	//* 210  446:aload_0         
	//* 211  447:getfield        #1305 <Field PdfWriter$PdfBody body>
	//* 212  450:aload_0         
	//* 213  451:getfield        #1606 <Field OutputStreamCounter os>
	//* 214  454:aload           5
	//* 215  456:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 216  459:aload           6
	//* 217  461:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 218  464:aload_2         
	//* 219  465:aload_3         
	//* 220  466:aload_0         
	//* 221  467:getfield        #513 <Field long prevxref>
	//* 222  470:invokevirtual   #1610 <Method void PdfWriter$PdfBody.writeCrossReferenceTable(OutputStream, PdfIndirectReference, PdfIndirectReference, PdfIndirectReference, PdfObject, long)>
	//* 223  473:aload_0         
	//* 224  474:getfield        #532 <Field boolean fullCompression>
	//* 225  477:ifeq            603
	//* 226  480:aload_0         
	//* 227  481:getfield        #1606 <Field OutputStreamCounter os>
	//* 228  484:invokestatic    #1612 <Method void writeKeyInfo(OutputStream)>
	//* 229  487:aload_0         
	//* 230  488:getfield        #1606 <Field OutputStreamCounter os>
	//* 231  491:ldc2            #1614 <String "startxref\n">
	//* 232  494:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//* 233  497:invokevirtual   #1617 <Method void OutputStreamCounter.write(byte[])>
	//* 234  500:aload_0         
	//* 235  501:getfield        #1606 <Field OutputStreamCounter os>
	//* 236  504:aload_0         
	//* 237  505:getfield        #1305 <Field PdfWriter$PdfBody body>
	//* 238  508:invokevirtual   #1621 <Method long PdfWriter$PdfBody.offset()>
	//* 239  511:invokestatic    #1625 <Method String String.valueOf(long)>
	//* 240  514:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//* 241  517:invokevirtual   #1617 <Method void OutputStreamCounter.write(byte[])>
	//* 242  520:aload_0         
	//* 243  521:getfield        #1606 <Field OutputStreamCounter os>
	//* 244  524:ldc2            #1627 <String "\n%%EOF\n">
	//* 245  527:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//* 246  530:invokevirtual   #1617 <Method void OutputStreamCounter.write(byte[])>
	//* 247  533:aload_0         
	//* 248  534:invokespecial   #1521 <Method void DocWriter.close()>
	//* 249  537:aload_0         
	//* 250  538:invokevirtual   #1630 <Method Counter getCounter()>
	//* 251  541:aload_0         
	//* 252  542:getfield        #1606 <Field OutputStreamCounter os>
	//* 253  545:invokevirtual   #1632 <Method long OutputStreamCounter.getCounter()>
	//* 254  548:invokeinterface #1638 <Method void Counter.written(long)>
	//* 255  553:return          
	//* 256  554:astore_3        
	//* 257  555:aload_0         
	//* 258  556:aconst_null     
	//* 259  557:putfield        #524 <Field XmpWriter xmpWriter>
	//* 260  560:goto            232
	//* 261  563:astore_3        
	//* 262  564:aload_0         
	//* 263  565:aconst_null     
	//* 264  566:putfield        #524 <Field XmpWriter xmpWriter>
	//* 265  569:goto            232
	//* 266  572:iload_1         
	//* 267  573:ifeq            596
	//* 268  576:aload_0         
	//* 269  577:getfield        #515 <Field byte[] originalFileID>
	//* 270  580:astore_2        
	//* 271  581:aload_2         
	//* 272  582:iload_1         
	//* 273  583:invokestatic    #1642 <Method PdfObject PdfEncryption.createInfoId(byte[], boolean)>
	//* 274  586:astore          4
	//* 275  588:aload_3         
	//* 276  589:astore_2        
	//* 277  590:aload           4
	//* 278  592:astore_3        
	//* 279  593:goto            446
	//* 280  596:invokestatic    #1645 <Method byte[] PdfEncryption.createDocumentId()>
	//* 281  599:astore_2        
	//* 282  600:goto            581
	//* 283  603:new             #26  <Class PdfWriter$PdfTrailer>
	//* 284  606:dup             
	//* 285  607:aload_0         
	//* 286  608:getfield        #1305 <Field PdfWriter$PdfBody body>
	//* 287  611:invokevirtual   #1646 <Method int PdfWriter$PdfBody.size()>
	//* 288  614:aload_0         
	//* 289  615:getfield        #1305 <Field PdfWriter$PdfBody body>
	//* 290  618:invokevirtual   #1621 <Method long PdfWriter$PdfBody.offset()>
	//* 291  621:aload           5
	//* 292  623:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 293  626:aload           6
	//* 294  628:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 295  631:aload_2         
	//* 296  632:aload_3         
	//* 297  633:aload_0         
	//* 298  634:getfield        #513 <Field long prevxref>
	//* 299  637:invokespecial   #1649 <Method void PdfWriter$PdfTrailer(int, long, PdfIndirectReference, PdfIndirectReference, PdfIndirectReference, PdfObject, long)>
	//* 300  640:aload_0         
	//* 301  641:aload_0         
	//* 302  642:getfield        #1606 <Field OutputStreamCounter os>
	//* 303  645:invokevirtual   #1653 <Method void PdfWriter$PdfTrailer.toPdf(PdfWriter, OutputStream)>
	//* 304  648:goto            533
			flag = false;
	//  305  651:iconst_0        
	//  306  652:istore_1        
		if(crypto == null) goto _L4; else goto _L3
_L3:
		obj1 = ((Object) (addToBody(((PdfObject) (crypto.getEncryptionDictionary())), false).getIndirectReference()));
		obj2 = ((Object) (crypto.getFileID(flag)));
_L6:
		body.writeCrossReferenceTable(((OutputStream) (os)), pdfindirectobject.getIndirectReference(), pdfindirectobject1.getIndirectReference(), ((PdfIndirectReference) (obj1)), ((PdfObject) (obj2)), prevxref);
		if(!fullCompression)
			break MISSING_BLOCK_LABEL_603;
		writeKeyInfo(((OutputStream) (os)));
		os.write(getISOBytes("startxref\n"));
		os.write(getISOBytes(String.valueOf(body.offset())));
		os.write(getISOBytes("\n%%EOF\n"));
_L8:
		super.close();
_L2:
		getCounter().written(os.getCounter());
		return;
		obj2;
		xmpWriter = null;
		  goto _L5
		obj2;
		xmpWriter = null;
		  goto _L5
_L4:
		if(!flag)
			break MISSING_BLOCK_LABEL_596;
		obj1 = ((Object) (originalFileID));
_L7:
		pdfobject = PdfEncryption.createInfoId(((byte []) (obj1)), flag);
		obj1 = obj2;
		obj2 = ((Object) (pdfobject));
		  goto _L6
		obj1 = ((Object) (PdfEncryption.createDocumentId()));
		  goto _L7
		(new PdfTrailer(body.size(), body.offset(), pdfindirectobject.getIndirectReference(), pdfindirectobject1.getIndirectReference(), ((PdfIndirectReference) (obj1)), ((PdfObject) (obj2)), prevxref)).toPdf(this, ((OutputStream) (os)));
		  goto _L8
	//* 307  653:goto            414
	}

	public PdfAnnotation createAnnotation(float f, float f1, float f2, float f3, PdfAction pdfaction, PdfName pdfname)
	{
		pdfaction = ((PdfAction) (new PdfAnnotation(this, f, f1, f2, f3, pdfaction)));
	//    0    0:new             #1657 <Class PdfAnnotation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #1660 <Method void PdfAnnotation(PdfWriter, float, float, float, float, PdfAction)>
	//    9   15:astore          5
		if(pdfname != null)
	//*  10   17:aload           6
	//*  11   19:ifnull          32
			((PdfAnnotation) (pdfaction)).put(PdfName.SUBTYPE, ((PdfObject) (pdfname)));
	//   12   22:aload           5
	//   13   24:getstatic       #1554 <Field PdfName PdfName.SUBTYPE>
	//   14   27:aload           6
	//   15   29:invokevirtual   #1661 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfaction));
	//   16   32:aload           5
	//   17   34:areturn         
	}

	public PdfAnnotation createAnnotation(float f, float f1, float f2, float f3, PdfString pdfstring, PdfString pdfstring1, PdfName pdfname)
	{
		pdfstring = ((PdfString) (new PdfAnnotation(this, f, f1, f2, f3, pdfstring, pdfstring1)));
	//    0    0:new             #1657 <Class PdfAnnotation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #1665 <Method void PdfAnnotation(PdfWriter, float, float, float, float, PdfString, PdfString)>
	//   10   17:astore          5
		if(pdfname != null)
	//*  11   19:aload           7
	//*  12   21:ifnull          34
			((PdfAnnotation) (pdfstring)).put(PdfName.SUBTYPE, ((PdfObject) (pdfname)));
	//   13   24:aload           5
	//   14   26:getstatic       #1554 <Field PdfName PdfName.SUBTYPE>
	//   15   29:aload           7
	//   16   31:invokevirtual   #1661 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		return ((PdfAnnotation) (pdfstring));
	//   17   34:aload           5
	//   18   36:areturn         
	}

	public PdfAnnotation createAnnotation(com.itextpdf.text.Rectangle rectangle, PdfName pdfname)
	{
		rectangle = ((com.itextpdf.text.Rectangle) (new PdfAnnotation(this, rectangle)));
	//    0    0:new             #1657 <Class PdfAnnotation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #1669 <Method void PdfAnnotation(PdfWriter, com.itextpdf.text.Rectangle)>
	//    5    9:astore_1        
		if(pdfname != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
			((PdfAnnotation) (rectangle)).put(PdfName.SUBTYPE, ((PdfObject) (pdfname)));
	//    8   14:aload_1         
	//    9   15:getstatic       #1554 <Field PdfName PdfName.SUBTYPE>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #1661 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		return ((PdfAnnotation) (rectangle));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public void createXmpMetadata()
	{
		boolean flag;
		xmpWriter = createXmpWriter(((ByteArrayOutputStream) (null)), ((PdfDictionary) (pdf.getInfo())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aconst_null     
	//    3    3:aload_0         
	//    4    4:getfield        #609 <Field PdfDocument pdf>
	//    5    7:invokevirtual   #1673 <Method PdfDocument$PdfInfo PdfDocument.getInfo()>
	//    6   10:invokevirtual   #1677 <Method XmpWriter createXmpWriter(ByteArrayOutputStream, PdfDictionary)>
	//    7   13:putfield        #524 <Field XmpWriter xmpWriter>
		flag = isTagged();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1680 <Method boolean isTagged()>
	//   10   20:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_54;
	//   11   21:iload_1         
	//   12   22:ifeq            54
		try
		{
			xmpWriter.getXmpMeta().setPropertyInteger("http://www.aiim.org/pdfua/ns/id/", "part", 1, new PropertyOptions(0x40000000));
	//   13   25:aload_0         
	//   14   26:getfield        #524 <Field XmpWriter xmpWriter>
	//   15   29:invokevirtual   #1684 <Method XMPMeta XmpWriter.getXmpMeta()>
	//   16   32:ldc2            #1686 <String "http://www.aiim.org/pdfua/ns/id/">
	//   17   35:ldc2            #1688 <String "part">
	//   18   38:iconst_1        
	//   19   39:new             #1690 <Class PropertyOptions>
	//   20   42:dup             
	//   21   43:ldc2            #1691 <Int 0x40000000>
	//   22   46:invokespecial   #1693 <Method void PropertyOptions(int)>
	//   23   49:invokeinterface #1699 <Method void XMPMeta.setPropertyInteger(String, String, int, PropertyOptions)>
		}
	//*  24   54:aload_0         
	//*  25   55:aconst_null     
	//*  26   56:putfield        #522 <Field byte[] xmpMetadata>
	//*  27   59:return          
		catch(XMPException xmpexception)
	//*  28   60:astore_2        
		{
			try
			{
				throw new ExceptionConverter(((Exception) (xmpexception)));
	//   29   61:new             #885 <Class ExceptionConverter>
	//   30   64:dup             
	//   31   65:aload_2         
	//   32   66:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//   33   69:athrow          
			}
			catch(IOException ioexception)
	//*  34   70:astore_2        
			{
				ioexception.printStackTrace();
	//   35   71:aload_2         
	//   36   72:invokevirtual   #1702 <Method void IOException.printStackTrace()>
			}
			return;
	//   37   75:return          
		}
		xmpMetadata = null;
		return;
	}

	protected XmpWriter createXmpWriter(ByteArrayOutputStream bytearrayoutputstream, PdfDictionary pdfdictionary)
		throws IOException
	{
		return new XmpWriter(((OutputStream) (bytearrayoutputstream)), pdfdictionary);
	//    0    0:new             #1536 <Class XmpWriter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #1705 <Method void XmpWriter(OutputStream, PdfDictionary)>
	//    5    9:areturn         
	}

	protected XmpWriter createXmpWriter(ByteArrayOutputStream bytearrayoutputstream, HashMap hashmap)
		throws IOException
	{
		return new XmpWriter(((OutputStream) (bytearrayoutputstream)), ((Map) (hashmap)));
	//    0    0:new             #1536 <Class XmpWriter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #1709 <Method void XmpWriter(OutputStream, Map)>
	//    5    9:areturn         
	}

	void eliminateFontSubset(PdfDictionary pdfdictionary)
	{
		Iterator iterator = documentFonts.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #539 <Field LinkedHashMap documentFonts>
	//    2    4:invokevirtual   #1248 <Method Collection LinkedHashMap.values()>
	//    3    7:invokeinterface #1251 <Method Iterator Collection.iterator()>
	//    4   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_2         
	//    6   14:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            51
			FontDetails fontdetails = (FontDetails)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #636 <Method Object Iterator.next()>
	//   10   28:checkcast       #1253 <Class FontDetails>
	//   11   31:astore_3        
			if(pdfdictionary.get(fontdetails.getFontName()) != null)
	//*  12   32:aload_1         
	//*  13   33:aload_3         
	//*  14   34:invokevirtual   #1714 <Method PdfName FontDetails.getFontName()>
	//*  15   37:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  16   40:ifnull          13
				fontdetails.setSubset(false);
	//   17   43:aload_3         
	//   18   44:iconst_0        
	//   19   45:invokevirtual   #1718 <Method void FontDetails.setSubset(boolean)>
		} while(true);
	//   20   48:goto            13
	//   21   51:return          
	}

	protected void fillOCProperties(boolean flag)
	{
		if(OCProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #663 <Field PdfOCProperties OCProperties>
	//*   2    4:ifnonnull       18
			OCProperties = new PdfOCProperties();
	//    3    7:aload_0         
	//    4    8:new             #668 <Class PdfOCProperties>
	//    5   11:dup             
	//    6   12:invokespecial   #1720 <Method void PdfOCProperties()>
	//    7   15:putfield        #663 <Field PdfOCProperties OCProperties>
		if(flag)
	//*   8   18:iload_1         
	//*   9   19:ifeq            42
		{
			OCProperties.remove(PdfName.OCGS);
	//   10   22:aload_0         
	//   11   23:getfield        #663 <Field PdfOCProperties OCProperties>
	//   12   26:getstatic       #692 <Field PdfName PdfName.OCGS>
	//   13   29:invokevirtual   #1723 <Method void PdfOCProperties.remove(PdfName)>
			OCProperties.remove(PdfName.D);
	//   14   32:aload_0         
	//   15   33:getfield        #663 <Field PdfOCProperties OCProperties>
	//   16   36:getstatic       #666 <Field PdfName PdfName.D>
	//   17   39:invokevirtual   #1723 <Method void PdfOCProperties.remove(PdfName)>
		}
		if(OCProperties.get(PdfName.OCGS) == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #663 <Field PdfOCProperties OCProperties>
	//*  20   46:getstatic       #692 <Field PdfName PdfName.OCGS>
	//*  21   49:invokevirtual   #1724 <Method PdfObject PdfOCProperties.get(PdfName)>
	//*  22   52:ifnonnull       111
		{
			PdfArray pdfarray = new PdfArray();
	//   23   55:new             #582 <Class PdfArray>
	//   24   58:dup             
	//   25   59:invokespecial   #583 <Method void PdfArray()>
	//   26   62:astore_2        
			for(Iterator iterator = documentOCG.iterator(); iterator.hasNext(); pdfarray.add(((PdfObject) (((PdfLayer)iterator.next()).getRef()))));
	//   27   63:aload_0         
	//   28   64:getfield        #578 <Field LinkedHashSet documentOCG>
	//   29   67:invokevirtual   #626 <Method Iterator LinkedHashSet.iterator()>
	//   30   70:astore_3        
	//   31   71:aload_3         
	//   32   72:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   33   77:ifeq            100
	//   34   80:aload_2         
	//   35   81:aload_3         
	//   36   82:invokeinterface #636 <Method Object Iterator.next()>
	//   37   87:checkcast       #638 <Class PdfLayer>
	//   38   90:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//   39   93:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//   40   96:pop             
	//*  41   97:goto            71
			OCProperties.put(PdfName.OCGS, ((PdfObject) (pdfarray)));
	//   42  100:aload_0         
	//   43  101:getfield        #663 <Field PdfOCProperties OCProperties>
	//   44  104:getstatic       #692 <Field PdfName PdfName.OCGS>
	//   45  107:aload_2         
	//   46  108:invokevirtual   #1725 <Method void PdfOCProperties.put(PdfName, PdfObject)>
		}
		if(OCProperties.get(PdfName.D) != null)
	//*  47  111:aload_0         
	//*  48  112:getfield        #663 <Field PdfOCProperties OCProperties>
	//*  49  115:getstatic       #666 <Field PdfName PdfName.D>
	//*  50  118:invokevirtual   #1724 <Method PdfObject PdfOCProperties.get(PdfName)>
	//*  51  121:ifnull          125
			return;
	//   52  124:return          
		Object obj1 = ((Object) (new ArrayList(((Collection) (documentOCGorder)))));
	//   53  125:new             #499 <Class ArrayList>
	//   54  128:dup             
	//   55  129:aload_0         
	//   56  130:getfield        #580 <Field ArrayList documentOCGorder>
	//   57  133:invokespecial   #1728 <Method void ArrayList(Collection)>
	//   58  136:astore_3        
		Object obj = ((Object) (((ArrayList) (obj1)).iterator()));
	//   59  137:aload_3         
	//   60  138:invokevirtual   #1729 <Method Iterator ArrayList.iterator()>
	//   61  141:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   62  142:aload_2         
	//   63  143:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   64  148:ifeq            175
			if(((PdfLayer)((Iterator) (obj)).next()).getParent() != null)
	//*  65  151:aload_2         
	//*  66  152:invokeinterface #636 <Method Object Iterator.next()>
	//*  67  157:checkcast       #638 <Class PdfLayer>
	//*  68  160:invokevirtual   #1733 <Method PdfLayer PdfLayer.getParent()>
	//*  69  163:ifnull          142
				((Iterator) (obj)).remove();
	//   70  166:aload_2         
	//   71  167:invokeinterface #1735 <Method void Iterator.remove()>
		} while(true);
	//   72  172:goto            142
		Object obj2 = ((Object) (new PdfArray()));
	//   73  175:new             #582 <Class PdfArray>
	//   74  178:dup             
	//   75  179:invokespecial   #583 <Method void PdfArray()>
	//   76  182:astore          4
		for(obj = ((Object) (((ArrayList) (obj1)).iterator())); ((Iterator) (obj)).hasNext(); getOCGOrder(((PdfArray) (obj2)), (PdfLayer)((Iterator) (obj)).next()));
	//   77  184:aload_3         
	//   78  185:invokevirtual   #1729 <Method Iterator ArrayList.iterator()>
	//   79  188:astore_2        
	//   80  189:aload_2         
	//   81  190:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//   82  195:ifeq            215
	//   83  198:aload           4
	//   84  200:aload_2         
	//   85  201:invokeinterface #636 <Method Object Iterator.next()>
	//   86  206:checkcast       #638 <Class PdfLayer>
	//   87  209:invokestatic    #836 <Method void getOCGOrder(PdfArray, PdfLayer)>
	//*  88  212:goto            189
		obj = ((Object) (new PdfDictionary()));
	//   89  215:new             #508 <Class PdfDictionary>
	//   90  218:dup             
	//   91  219:invokespecial   #509 <Method void PdfDictionary()>
	//   92  222:astore_2        
		OCProperties.put(PdfName.D, ((PdfObject) (obj)));
	//   93  223:aload_0         
	//   94  224:getfield        #663 <Field PdfOCProperties OCProperties>
	//   95  227:getstatic       #666 <Field PdfName PdfName.D>
	//   96  230:aload_2         
	//   97  231:invokevirtual   #1725 <Method void PdfOCProperties.put(PdfName, PdfObject)>
		((PdfDictionary) (obj)).put(PdfName.ORDER, ((PdfObject) (obj2)));
	//   98  234:aload_2         
	//   99  235:getstatic       #1738 <Field PdfName PdfName.ORDER>
	//  100  238:aload           4
	//  101  240:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(((ArrayList) (obj1)).size() > 0 && (((ArrayList) (obj1)).get(0) instanceof PdfLayer))
	//* 102  243:aload_3         
	//* 103  244:invokevirtual   #831 <Method int ArrayList.size()>
	//* 104  247:ifle            288
	//* 105  250:aload_3         
	//* 106  251:iconst_0        
	//* 107  252:invokevirtual   #834 <Method Object ArrayList.get(int)>
	//* 108  255:instanceof      #638 <Class PdfLayer>
	//* 109  258:ifeq            288
		{
			obj1 = ((Object) (((PdfLayer)((ArrayList) (obj1)).get(0)).getAsString(PdfName.NAME)));
	//  110  261:aload_3         
	//  111  262:iconst_0        
	//  112  263:invokevirtual   #834 <Method Object ArrayList.get(int)>
	//  113  266:checkcast       #638 <Class PdfLayer>
	//  114  269:getstatic       #1741 <Field PdfName PdfName.NAME>
	//  115  272:invokevirtual   #1745 <Method PdfString PdfLayer.getAsString(PdfName)>
	//  116  275:astore_3        
			if(obj1 != null)
	//* 117  276:aload_3         
	//* 118  277:ifnull          288
				((PdfDictionary) (obj)).put(PdfName.NAME, ((PdfObject) (obj1)));
	//  119  280:aload_2         
	//  120  281:getstatic       #1741 <Field PdfName PdfName.NAME>
	//  121  284:aload_3         
	//  122  285:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		obj1 = ((Object) (new PdfArray()));
	//  123  288:new             #582 <Class PdfArray>
	//  124  291:dup             
	//  125  292:invokespecial   #583 <Method void PdfArray()>
	//  126  295:astore_3        
		obj2 = ((Object) (documentOCG.iterator()));
	//  127  296:aload_0         
	//  128  297:getfield        #578 <Field LinkedHashSet documentOCG>
	//  129  300:invokevirtual   #626 <Method Iterator LinkedHashSet.iterator()>
	//  130  303:astore          4
		do
		{
			if(!((Iterator) (obj2)).hasNext())
				break;
	//  131  305:aload           4
	//  132  307:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//  133  312:ifeq            348
			PdfLayer pdflayer = (PdfLayer)((Iterator) (obj2)).next();
	//  134  315:aload           4
	//  135  317:invokeinterface #636 <Method Object Iterator.next()>
	//  136  322:checkcast       #638 <Class PdfLayer>
	//  137  325:astore          5
			if(!pdflayer.isOn())
	//* 138  327:aload           5
	//* 139  329:invokevirtual   #1748 <Method boolean PdfLayer.isOn()>
	//* 140  332:ifne            305
				((PdfArray) (obj1)).add(((PdfObject) (pdflayer.getRef())));
	//  141  335:aload_3         
	//  142  336:aload           5
	//  143  338:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//  144  341:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  145  344:pop             
		} while(true);
	//  146  345:goto            305
		if(((PdfArray) (obj1)).size() > 0)
	//* 147  348:aload_3         
	//* 148  349:invokevirtual   #661 <Method int PdfArray.size()>
	//* 149  352:ifle            363
			((PdfDictionary) (obj)).put(PdfName.OFF, ((PdfObject) (obj1)));
	//  150  355:aload_2         
	//  151  356:getstatic       #1751 <Field PdfName PdfName.OFF>
	//  152  359:aload_3         
	//  153  360:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(OCGRadioGroup.size() > 0)
	//* 154  363:aload_0         
	//* 155  364:getfield        #585 <Field PdfArray OCGRadioGroup>
	//* 156  367:invokevirtual   #661 <Method int PdfArray.size()>
	//* 157  370:ifle            384
			((PdfDictionary) (obj)).put(PdfName.RBGROUPS, ((PdfObject) (OCGRadioGroup)));
	//  158  373:aload_2         
	//  159  374:getstatic       #1754 <Field PdfName PdfName.RBGROUPS>
	//  160  377:aload_0         
	//  161  378:getfield        #585 <Field PdfArray OCGRadioGroup>
	//  162  381:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(OCGLocked.size() > 0)
	//* 163  384:aload_0         
	//* 164  385:getfield        #587 <Field PdfArray OCGLocked>
	//* 165  388:invokevirtual   #661 <Method int PdfArray.size()>
	//* 166  391:ifle            405
			((PdfDictionary) (obj)).put(PdfName.LOCKED, ((PdfObject) (OCGLocked)));
	//  167  394:aload_2         
	//  168  395:getstatic       #1757 <Field PdfName PdfName.LOCKED>
	//  169  398:aload_0         
	//  170  399:getfield        #587 <Field PdfArray OCGLocked>
	//  171  402:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		addASEvent(PdfName.VIEW, PdfName.ZOOM);
	//  172  405:aload_0         
	//  173  406:getstatic       #1760 <Field PdfName PdfName.VIEW>
	//  174  409:getstatic       #1763 <Field PdfName PdfName.ZOOM>
	//  175  412:invokespecial   #1765 <Method void addASEvent(PdfName, PdfName)>
		addASEvent(PdfName.VIEW, PdfName.VIEW);
	//  176  415:aload_0         
	//  177  416:getstatic       #1760 <Field PdfName PdfName.VIEW>
	//  178  419:getstatic       #1760 <Field PdfName PdfName.VIEW>
	//  179  422:invokespecial   #1765 <Method void addASEvent(PdfName, PdfName)>
		addASEvent(PdfName.PRINT, PdfName.PRINT);
	//  180  425:aload_0         
	//  181  426:getstatic       #1768 <Field PdfName PdfName.PRINT>
	//  182  429:getstatic       #1768 <Field PdfName PdfName.PRINT>
	//  183  432:invokespecial   #1765 <Method void addASEvent(PdfName, PdfName)>
		addASEvent(PdfName.EXPORT, PdfName.EXPORT);
	//  184  435:aload_0         
	//  185  436:getstatic       #1771 <Field PdfName PdfName.EXPORT>
	//  186  439:getstatic       #1771 <Field PdfName PdfName.EXPORT>
	//  187  442:invokespecial   #1765 <Method void addASEvent(PdfName, PdfName)>
		((PdfDictionary) (obj)).put(PdfName.LISTMODE, ((PdfObject) (PdfName.VISIBLEPAGES)));
	//  188  445:aload_2         
	//  189  446:getstatic       #1774 <Field PdfName PdfName.LISTMODE>
	//  190  449:getstatic       #1777 <Field PdfName PdfName.VISIBLEPAGES>
	//  191  452:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  192  455:return          
	}

	protected void flushAcroFields()
		throws IOException, BadPdfFormatException
	{
	//    0    0:return          
	}

	protected void flushTaggedObjects()
		throws IOException
	{
	//    0    0:return          
	}

	public void freeReader(PdfReader pdfreader)
		throws IOException
	{
		currentPdfReaderInstance = (PdfReaderInstance)readerInstances.get(((Object) (pdfreader)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #550 <Field HashMap readerInstances>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    5    9:checkcast       #1124 <Class PdfReaderInstance>
	//    6   12:putfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
		if(currentPdfReaderInstance == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//*   9   19:ifnonnull       23
		{
			return;
	//   10   22:return          
		} else
		{
			currentPdfReaderInstance.writeAllPages();
	//   11   23:aload_0         
	//   12   24:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//   13   27:invokevirtual   #1265 <Method void PdfReaderInstance.writeAllPages()>
			currentPdfReaderInstance = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
			readerInstances.remove(((Object) (pdfreader)));
	//   17   35:aload_0         
	//   18   36:getfield        #550 <Field HashMap readerInstances>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #1785 <Method Object HashMap.remove(Object)>
	//   21   43:pop             
			return;
	//   22   44:return          
		}
	}

	public PdfAcroForm getAcroForm()
	{
		return pdf.getAcroForm();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1789 <Method PdfAcroForm PdfDocument.getAcroForm()>
	//    3    7:areturn         
	}

	public com.itextpdf.text.Rectangle getBoxSize(String s)
	{
		return pdf.getBoxSize(s);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1793 <Method com.itextpdf.text.Rectangle PdfDocument.getBoxSize(String)>
	//    4    8:areturn         
	}

	public com.itextpdf.text.Rectangle getBoxSize(String s, com.itextpdf.text.Rectangle rectangle)
	{
		s = ((String) (pdf.getBoxSize(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1793 <Method com.itextpdf.text.Rectangle PdfDocument.getBoxSize(String)>
	//    4    8:astore_1        
		if(s != null && rectangle != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       19
	//*   9   17:aconst_null     
	//*  10   18:areturn         
	//*  11   19:new             #1796 <Class Rectangle>
	//*  12   22:dup             
	//*  13   23:aload_1         
	//*  14   24:invokespecial   #1799 <Method void Rectangle(com.itextpdf.text.Rectangle)>
	//*  15   27:new             #1796 <Class Rectangle>
	//*  16   30:dup             
	//*  17   31:aload_2         
	//*  18   32:invokespecial   #1799 <Method void Rectangle(com.itextpdf.text.Rectangle)>
	//*  19   35:invokevirtual   #1803 <Method Rectangle Rectangle.intersection(Rectangle)>
	//*  20   38:astore_1        
			if(!((Rectangle) (s = ((String) ((new Rectangle(((com.itextpdf.text.Rectangle) (s)))).intersection(new Rectangle(rectangle)))))).isEmpty())
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #1804 <Method boolean Rectangle.isEmpty()>
	//*  23   43:ifne            17
			{
				s = ((String) (new com.itextpdf.text.Rectangle((float)((Rectangle) (s)).getX(), (float)((Rectangle) (s)).getY(), (float)(((Rectangle) (s)).getX() + ((Rectangle) (s)).getWidth()), (float)(((Rectangle) (s)).getY() + ((Rectangle) (s)).getHeight()))));
	//   24   46:new             #1806 <Class com.itextpdf.text.Rectangle>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:invokevirtual   #1810 <Method double Rectangle.getX()>
	//   28   54:d2f             
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1813 <Method double Rectangle.getY()>
	//   31   59:d2f             
	//   32   60:aload_1         
	//   33   61:invokevirtual   #1810 <Method double Rectangle.getX()>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #1816 <Method double Rectangle.getWidth()>
	//   36   68:dadd            
	//   37   69:d2f             
	//   38   70:aload_1         
	//   39   71:invokevirtual   #1813 <Method double Rectangle.getY()>
	//   40   74:aload_1         
	//   41   75:invokevirtual   #1819 <Method double Rectangle.getHeight()>
	//   42   78:dadd            
	//   43   79:d2f             
	//   44   80:invokespecial   #1822 <Method void com.itextpdf.text.Rectangle(float, float, float, float)>
	//   45   83:astore_1        
				((com.itextpdf.text.Rectangle) (s)).normalize();
	//   46   84:aload_1         
	//   47   85:invokevirtual   #1825 <Method void com.itextpdf.text.Rectangle.normalize()>
				return ((com.itextpdf.text.Rectangle) (s));
	//   48   88:aload_1         
	//   49   89:areturn         
			}
		return null;
	}

	protected PdfDictionary getCatalog(PdfIndirectReference pdfindirectreference)
	{
		pdfindirectreference = ((PdfIndirectReference) (pdf.getCatalog(pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1828 <Method PdfDocument$PdfCatalog PdfDocument.getCatalog(PdfIndirectReference)>
	//    4    8:astore_1        
		buildStructTreeRootForTagged(((PdfDictionary) (pdfindirectreference)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1830 <Method void buildStructTreeRootForTagged(PdfDictionary)>
		if(!documentOCG.isEmpty())
	//*   8   14:aload_0         
	//*   9   15:getfield        #578 <Field LinkedHashSet documentOCG>
	//*  10   18:invokevirtual   #1531 <Method boolean LinkedHashSet.isEmpty()>
	//*  11   21:ifne            40
		{
			fillOCProperties(false);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #1832 <Method void fillOCProperties(boolean)>
			((PdfDictionary) (pdfindirectreference)).put(PdfName.OCPROPERTIES, ((PdfObject) (OCProperties)));
	//   15   29:aload_1         
	//   16   30:getstatic       #1835 <Field PdfName PdfName.OCPROPERTIES>
	//   17   33:aload_0         
	//   18   34:getfield        #663 <Field PdfOCProperties OCProperties>
	//   19   37:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		return ((PdfDictionary) (pdfindirectreference));
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public ICC_Profile getColorProfile()
	{
		return colorProfile;
	//    0    0:aload_0         
	//    1    1:getfield        #1838 <Field ICC_Profile colorProfile>
	//    2    4:areturn         
	}

	PdfName getColorspaceName()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append("CS");
	//    0    0:new             #1006 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #1007 <Method void StringBuilder()>
	//    3    7:ldc2            #1839 <String "CS">
	//    4   10:invokevirtual   #1013 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:astore_2        
		int i = colorNumber;
	//    6   14:aload_0         
	//    7   15:getfield        #554 <Field int colorNumber>
	//    8   18:istore_1        
		colorNumber = i + 1;
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #554 <Field int colorNumber>
		return new PdfName(stringbuilder.append(i).toString());
	//   14   26:new             #271 <Class PdfName>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #1017 <Method StringBuilder StringBuilder.append(int)>
	//   19   35:invokevirtual   #1020 <Method String StringBuilder.toString()>
	//   20   38:invokespecial   #277 <Method void PdfName(String)>
	//   21   41:areturn         
	}

	public int getCompressionLevel()
	{
		return compressionLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #534 <Field int compressionLevel>
	//    2    4:ireturn         
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:getstatic       #269 <Field Counter COUNTER>
	//    1    3:areturn         
	}

	public long getCurrentDocumentSize()
	{
		return body.offset() + (long)(body.size() * 20) + 72L;
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:invokevirtual   #1621 <Method long PdfWriter$PdfBody.offset()>
	//    3    7:aload_0         
	//    4    8:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    5   11:invokevirtual   #1646 <Method int PdfWriter$PdfBody.size()>
	//    6   14:bipush          20
	//    7   16:imul            
	//    8   17:i2l             
	//    9   18:ladd            
	//   10   19:ldc2w           #1841 <Long 72L>
	//   11   22:ladd            
	//   12   23:lreturn         
	}

	PdfIndirectReference getCurrentPage()
	{
		return getPageReference(currentPageNumber);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #504 <Field int currentPageNumber>
	//    3    5:invokevirtual   #1205 <Method PdfIndirectReference getPageReference(int)>
	//    4    8:areturn         
	}

	public int getCurrentPageNumber()
	{
		return currentPageNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #504 <Field int currentPageNumber>
	//    2    4:ireturn         
	}

	public PdfDictionary getDefaultColorspace()
	{
		return defaultColorspace;
	//    0    0:aload_0         
	//    1    1:getfield        #593 <Field PdfDictionary defaultColorspace>
	//    2    4:areturn         
	}

	public PdfContentByte getDirectContent()
	{
		if(!open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifne            25
			throw new RuntimeException(MessageLocalization.getComposedMessage("the.document.is.not.open", new Object[0]));
	//    3    7:new             #1346 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #933 <String "the.document.is.not.open">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1349 <Method void RuntimeException(String)>
	//   10   24:athrow          
		else
			return directContent;
	//   11   25:aload_0         
	//   12   26:getfield        #620 <Field PdfContentByte directContent>
	//   13   29:areturn         
	}

	public PdfContentByte getDirectContentUnder()
	{
		if(!open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifne            25
			throw new RuntimeException(MessageLocalization.getComposedMessage("the.document.is.not.open", new Object[0]));
	//    3    7:new             #1346 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #933 <String "the.document.is.not.open">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1349 <Method void RuntimeException(String)>
	//   10   24:athrow          
		else
			return directContentUnder;
	//   11   25:aload_0         
	//   12   26:getfield        #614 <Field PdfContentByte directContentUnder>
	//   13   29:areturn         
	}

	PdfEncryption getEncryption()
	{
		return crypto;
	//    0    0:aload_0         
	//    1    1:getfield        #1559 <Field PdfEncryption crypto>
	//    2    4:areturn         
	}

	public PdfDictionary getExtraCatalog()
	{
		if(extraCatalog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1583 <Field PdfDictionary extraCatalog>
	//*   2    4:ifnonnull       18
			extraCatalog = new PdfDictionary();
	//    3    7:aload_0         
	//    4    8:new             #508 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #509 <Method void PdfDictionary()>
	//    7   15:putfield        #1583 <Field PdfDictionary extraCatalog>
		return extraCatalog;
	//    8   18:aload_0         
	//    9   19:getfield        #1583 <Field PdfDictionary extraCatalog>
	//   10   22:areturn         
	}

	public PdfDictionary getGroup()
	{
		return group;
	//    0    0:aload_0         
	//    1    1:getfield        #946 <Field PdfDictionary group>
	//    2    4:areturn         
	}

	PdfIndirectReference getImageReference(PdfName pdfname)
	{
		return (PdfIndirectReference)imageDictionary.get(pdfname);
	//    0    0:aload_0         
	//    1    1:getfield        #597 <Field PdfDictionary imageDictionary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4    8:checkcast       #907 <Class PdfIndirectReference>
	//    5   11:areturn         
	}

	public PdfImportedPage getImportedPage(PdfReader pdfreader, int i)
	{
		return getPdfReaderInstance(pdfreader).getImportedPage(i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1855 <Method PdfReaderInstance getPdfReaderInstance(PdfReader)>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1858 <Method PdfImportedPage PdfReaderInstance.getImportedPage(int)>
	//    5    9:areturn         
	}

	protected int getIndirectReferenceNumber()
	{
		return body.getIndirectReferenceNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:invokevirtual   #1861 <Method int PdfWriter$PdfBody.getIndirectReferenceNumber()>
	//    3    7:ireturn         
	}

	public PdfDictionary getInfo()
	{
		return ((PdfDictionary) (pdf.getInfo()));
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1673 <Method PdfDocument$PdfInfo PdfDocument.getInfo()>
	//    3    7:areturn         
	}

	protected int getNewObjectNumber(PdfReader pdfreader, int i, int j)
	{
		if(currentPdfReaderInstance == null || currentPdfReaderInstance.getReader() != pdfreader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//*   5   11:invokevirtual   #1125 <Method PdfReader PdfReaderInstance.getReader()>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       27
			currentPdfReaderInstance = getPdfReaderInstance(pdfreader);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #1855 <Method PdfReaderInstance getPdfReaderInstance(PdfReader)>
	//   12   24:putfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
		return currentPdfReaderInstance.getNewObjectNumber(i, j);
	//   13   27:aload_0         
	//   14   28:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//   15   31:iload_2         
	//   16   32:iload_3         
	//   17   33:invokevirtual   #1864 <Method int PdfReaderInstance.getNewObjectNumber(int, int)>
	//   18   36:ireturn         
	}

	public PdfOCProperties getOCProperties()
	{
		fillOCProperties(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1832 <Method void fillOCProperties(boolean)>
		return OCProperties;
	//    3    5:aload_0         
	//    4    6:getfield        #663 <Field PdfOCProperties OCProperties>
	//    5    9:areturn         
	}

	public OutputStreamCounter getOs()
	{
		return os;
	//    0    0:aload_0         
	//    1    1:getfield        #1606 <Field OutputStreamCounter os>
	//    2    4:areturn         
	}

	public int getPDFXConformance()
	{
		if(pdfIsoConformance instanceof PdfXConformanceImp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//*   2    4:instanceof      #746 <Class PdfXConformanceImp>
	//*   3    7:ifeq            23
			return ((PdfXConformance)pdfIsoConformance).getPDFXConformance();
	//    4   10:aload_0         
	//    5   11:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    6   14:checkcast       #1871 <Class PdfXConformance>
	//    7   17:invokeinterface #1873 <Method int PdfXConformance.getPDFXConformance()>
	//    8   22:ireturn         
		else
			return 0;
	//    9   23:iconst_0        
	//   10   24:ireturn         
	}

	public PdfDictionary getPageDictEntries()
	{
		return pageDictEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #511 <Field PdfDictionary pageDictEntries>
	//    2    4:areturn         
	}

	public PdfPageEvent getPageEvent()
	{
		return pageEvent;
	//    0    0:aload_0         
	//    1    1:getfield        #1878 <Field PdfPageEvent pageEvent>
	//    2    4:areturn         
	}

	public int getPageNumber()
	{
		return pdf.getPageNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1881 <Method int PdfDocument.getPageNumber()>
	//    3    7:ireturn         
	}

	public PdfIndirectReference getPageReference(int i)
	{
		int j = i - 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore_2        
		if(j < 0)
	//*   4    4:iload_2         
	//*   5    5:ifge            26
			throw new IndexOutOfBoundsException(MessageLocalization.getComposedMessage("the.page.number.must.be.gt.eq.1", new Object[0]));
	//    6    8:new             #1883 <Class IndexOutOfBoundsException>
	//    7   11:dup             
	//    8   12:ldc2            #1885 <String "the.page.number.must.be.gt.eq.1">
	//    9   15:iconst_0        
	//   10   16:anewarray       Object[]
	//   11   19:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   22:invokespecial   #1886 <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
		if(j < pageReferences.size())
	//*  14   26:iload_2         
	//*  15   27:aload_0         
	//*  16   28:getfield        #502 <Field ArrayList pageReferences>
	//*  17   31:invokevirtual   #831 <Method int ArrayList.size()>
	//*  18   34:icmpge          82
		{
			PdfIndirectReference pdfindirectreference2 = (PdfIndirectReference)pageReferences.get(j);
	//   19   37:aload_0         
	//   20   38:getfield        #502 <Field ArrayList pageReferences>
	//   21   41:iload_2         
	//   22   42:invokevirtual   #834 <Method Object ArrayList.get(int)>
	//   23   45:checkcast       #907 <Class PdfIndirectReference>
	//   24   48:astore          5
			PdfIndirectReference pdfindirectreference = pdfindirectreference2;
	//   25   50:aload           5
	//   26   52:astore          4
			if(pdfindirectreference2 == null)
	//*  27   54:aload           5
	//*  28   56:ifnonnull       79
			{
				pdfindirectreference = body.getPdfIndirectReference();
	//   29   59:aload_0         
	//   30   60:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   31   63:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   32   66:astore          4
				pageReferences.set(j, ((Object) (pdfindirectreference)));
	//   33   68:aload_0         
	//   34   69:getfield        #502 <Field ArrayList pageReferences>
	//   35   72:iload_2         
	//   36   73:aload           4
	//   37   75:invokevirtual   #1889 <Method Object ArrayList.set(int, Object)>
	//   38   78:pop             
			}
			return pdfindirectreference;
	//   39   79:aload           4
	//   40   81:areturn         
		}
		int k = pageReferences.size();
	//   41   82:aload_0         
	//   42   83:getfield        #502 <Field ArrayList pageReferences>
	//   43   86:invokevirtual   #831 <Method int ArrayList.size()>
	//   44   89:istore_3        
		for(i = 0; i < j - k; i++)
	//*  45   90:iconst_0        
	//*  46   91:istore_1        
	//*  47   92:iload_1         
	//*  48   93:iload_2         
	//*  49   94:iload_3         
	//*  50   95:isub            
	//*  51   96:icmpge          115
			pageReferences.add(((Object) (null)));
	//   52   99:aload_0         
	//   53  100:getfield        #502 <Field ArrayList pageReferences>
	//   54  103:aconst_null     
	//   55  104:invokevirtual   #1890 <Method boolean ArrayList.add(Object)>
	//   56  107:pop             

	//   57  108:iload_1         
	//   58  109:iconst_1        
	//   59  110:iadd            
	//   60  111:istore_1        
	//*  61  112:goto            92
		PdfIndirectReference pdfindirectreference1 = body.getPdfIndirectReference();
	//   62  115:aload_0         
	//   63  116:getfield        #1305 <Field PdfWriter$PdfBody body>
	//   64  119:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   65  122:astore          4
		pageReferences.add(((Object) (pdfindirectreference1)));
	//   66  124:aload_0         
	//   67  125:getfield        #502 <Field ArrayList pageReferences>
	//   68  128:aload           4
	//   69  130:invokevirtual   #1890 <Method boolean ArrayList.add(Object)>
	//   70  133:pop             
		return pdfindirectreference1;
	//   71  134:aload           4
	//   72  136:areturn         
	}

	public com.itextpdf.text.Rectangle getPageSize()
	{
		return pdf.getPageSize();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1894 <Method com.itextpdf.text.Rectangle PdfDocument.getPageSize()>
	//    3    7:areturn         
	}

	PdfDocument getPdfDocument()
	{
		return pdf;
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:areturn         
	}

	public PdfIndirectReference getPdfIndirectReference()
	{
		return body.getPdfIndirectReference();
	//    0    0:aload_0         
	//    1    1:getfield        #1305 <Field PdfWriter$PdfBody body>
	//    2    4:invokevirtual   #1306 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//    3    7:areturn         
	}

	protected PdfReaderInstance getPdfReaderInstance(PdfReader pdfreader)
	{
		PdfReaderInstance pdfreaderinstance1 = (PdfReaderInstance)readerInstances.get(((Object) (pdfreader)));
	//    0    0:aload_0         
	//    1    1:getfield        #550 <Field HashMap readerInstances>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #1124 <Class PdfReaderInstance>
	//    5   11:astore_3        
		PdfReaderInstance pdfreaderinstance = pdfreaderinstance1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(pdfreaderinstance1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       34
		{
			pdfreaderinstance = pdfreader.getPdfReaderInstance(this);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #1899 <Method PdfReaderInstance PdfReader.getPdfReaderInstance(PdfWriter)>
	//   13   23:astore_2        
			readerInstances.put(((Object) (pdfreader)), ((Object) (pdfreaderinstance)));
	//   14   24:aload_0         
	//   15   25:getfield        #550 <Field HashMap readerInstances>
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   19   33:pop             
		}
		return pdfreaderinstance;
	//   20   34:aload_2         
	//   21   35:areturn         
	}

	PdfVersionImp getPdfVersion()
	{
		return pdf_version;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//    2    4:areturn         
	}

	RandomAccessFileOrArray getReaderFile(PdfReader pdfreader)
	{
		return currentPdfReaderInstance.getReaderFile();
	//    0    0:aload_0         
	//    1    1:getfield        #1262 <Field PdfReaderInstance currentPdfReaderInstance>
	//    2    4:invokevirtual   #1906 <Method RandomAccessFileOrArray PdfReaderInstance.getReaderFile()>
	//    3    7:areturn         
	}

	protected PdfIndirectReference getReferenceJBIG2Globals(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		for(Iterator iterator = JBIG2Globals.keySet().iterator(); iterator.hasNext();)
	//*   4    6:aload_0         
	//*   5    7:getfield        #601 <Field HashMap JBIG2Globals>
	//*   6   10:invokevirtual   #1274 <Method Set HashMap.keySet()>
	//*   7   13:invokeinterface #1170 <Method Iterator Set.iterator()>
	//*   8   18:astore_2        
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #632 <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            61
		{
			PdfStream pdfstream = (PdfStream)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #636 <Method Object Iterator.next()>
	//   14   34:checkcast       #1545 <Class PdfStream>
	//   15   37:astore_3        
			if(Arrays.equals(abyte0, pdfstream.getBytes()))
	//*  16   38:aload_1         
	//*  17   39:aload_3         
	//*  18   40:invokevirtual   #1909 <Method byte[] PdfStream.getBytes()>
	//*  19   43:invokestatic    #1912 <Method boolean Arrays.equals(byte[], byte[])>
	//*  20   46:ifeq            19
				return (PdfIndirectReference)JBIG2Globals.get(((Object) (pdfstream)));
	//   21   49:aload_0         
	//   22   50:getfield        #601 <Field HashMap JBIG2Globals>
	//   23   53:aload_3         
	//   24   54:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//   25   57:checkcast       #907 <Class PdfIndirectReference>
	//   26   60:areturn         
		}

		abyte0 = ((byte []) (new PdfStream(abyte0)));
	//   27   61:new             #1545 <Class PdfStream>
	//   28   64:dup             
	//   29   65:aload_1         
	//   30   66:invokespecial   #1547 <Method void PdfStream(byte[])>
	//   31   69:astore_1        
		PdfIndirectObject pdfindirectobject;
		try
		{
			pdfindirectobject = addToBody(((PdfObject) (abyte0)));
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//   35   75:astore_2        
		}
	//*  36   76:aload_0         
	//*  37   77:getfield        #601 <Field HashMap JBIG2Globals>
	//*  38   80:aload_1         
	//*  39   81:aload_2         
	//*  40   82:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  41   85:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//*  42   88:pop             
	//*  43   89:aload_2         
	//*  44   90:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  45   93:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  46   94:astore_1        
		{
			return null;
	//   47   95:aconst_null     
	//   48   96:areturn         
		}
		JBIG2Globals.put(((Object) (abyte0)), ((Object) (pdfindirectobject.getIndirectReference())));
		return pdfindirectobject.getIndirectReference();
	}

	public PdfOutline getRootOutline()
	{
		return directContent.getRootOutline();
	//    0    0:aload_0         
	//    1    1:getfield        #620 <Field PdfContentByte directContent>
	//    2    4:invokevirtual   #1916 <Method PdfOutline PdfContentByte.getRootOutline()>
	//    3    7:areturn         
	}

	public int getRunDirection()
	{
		return runDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #591 <Field int runDirection>
	//    2    4:ireturn         
	}

	public float getSpaceCharRatio()
	{
		return spaceCharRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #589 <Field float spaceCharRatio>
	//    2    4:freturn         
	}

	public List getStandardStructElems()
	{
		if(pdf_version.getVersion() < '7')
	//*   0    0:aload_0         
	//*   1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//*   2    4:invokevirtual   #1925 <Method char PdfVersionImp.getVersion()>
	//*   3    7:bipush          55
	//*   4    9:icmpge          16
			return standardStructElems_1_4;
	//    5   12:getstatic       #455 <Field List standardStructElems_1_4>
	//    6   15:areturn         
		else
			return standardStructElems_1_7;
	//    7   16:getstatic       #487 <Field List standardStructElems_1_7>
	//    8   19:areturn         
	}

	public PdfStructureTreeRoot getStructureTreeRoot()
	{
		if(tagged && structureTreeRoot == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #571 <Field boolean tagged>
	//*   2    4:ifeq            26
	//*   3    7:aload_0         
	//*   4    8:getfield        #1460 <Field PdfStructureTreeRoot structureTreeRoot>
	//*   5   11:ifnonnull       26
			structureTreeRoot = new PdfStructureTreeRoot(this);
	//    6   14:aload_0         
	//    7   15:new             #1438 <Class PdfStructureTreeRoot>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #1927 <Method void PdfStructureTreeRoot(PdfWriter)>
	//   11   23:putfield        #1460 <Field PdfStructureTreeRoot structureTreeRoot>
		return structureTreeRoot;
	//   12   26:aload_0         
	//   13   27:getfield        #1460 <Field PdfStructureTreeRoot structureTreeRoot>
	//   14   30:areturn         
	}

	public PdfName getTabs()
	{
		return tabs;
	//    0    0:aload_0         
	//    1    1:getfield        #506 <Field PdfName tabs>
	//    2    4:areturn         
	}

	protected TtfUnicodeWriter getTtfUnicodeWriter()
	{
		if(ttfUnicodeWriter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #603 <Field TtfUnicodeWriter ttfUnicodeWriter>
	//*   2    4:ifnonnull       19
			ttfUnicodeWriter = new TtfUnicodeWriter(this);
	//    3    7:aload_0         
	//    4    8:new             #1932 <Class TtfUnicodeWriter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #1933 <Method void TtfUnicodeWriter(PdfWriter)>
	//    8   16:putfield        #603 <Field TtfUnicodeWriter ttfUnicodeWriter>
		return ttfUnicodeWriter;
	//    9   19:aload_0         
	//   10   20:getfield        #603 <Field TtfUnicodeWriter ttfUnicodeWriter>
	//   11   23:areturn         
	}

	public float getVerticalPosition(boolean flag)
	{
		return pdf.getVerticalPosition(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1937 <Method float PdfDocument.getVerticalPosition(boolean)>
	//    4    8:freturn         
	}

	public XmpWriter getXmpWriter()
	{
		return xmpWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #524 <Field XmpWriter xmpWriter>
	//    2    4:areturn         
	}

	protected PdfIsoConformance initPdfIsoConformance()
	{
		return ((PdfIsoConformance) (new PdfXConformanceImp(this)));
	//    0    0:new             #746 <Class PdfXConformanceImp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1940 <Method void PdfXConformanceImp(PdfWriter)>
	//    4    8:areturn         
	}

	public boolean isFullCompression()
	{
		return fullCompression;
	//    0    0:aload_0         
	//    1    1:getfield        #532 <Field boolean fullCompression>
	//    2    4:ireturn         
	}

	public boolean isPageEmpty()
	{
		return pdf.isPageEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1944 <Method boolean PdfDocument.isPageEmpty()>
	//    3    7:ireturn         
	}

	public boolean isPdfIso()
	{
		return pdfIsoConformance.isPdfIso();
	//    0    0:aload_0         
	//    1    1:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    2    4:invokeinterface #1947 <Method boolean PdfIsoConformance.isPdfIso()>
	//    3    9:ireturn         
	}

	public boolean isPdfX()
	{
		if(pdfIsoConformance instanceof PdfXConformanceImp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//*   2    4:instanceof      #746 <Class PdfXConformanceImp>
	//*   3    7:ifeq            23
			return ((PdfXConformance)pdfIsoConformance).isPdfX();
	//    4   10:aload_0         
	//    5   11:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    6   14:checkcast       #1871 <Class PdfXConformance>
	//    7   17:invokeinterface #1948 <Method boolean PdfXConformance.isPdfX()>
	//    8   22:ireturn         
		else
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
	}

	public boolean isRgbTransparencyBlending()
	{
		return rgbTransparencyBlending;
	//    0    0:aload_0         
	//    1    1:getfield        #955 <Field boolean rgbTransparencyBlending>
	//    2    4:ireturn         
	}

	public boolean isStrictImageSequence()
	{
		return pdf.isStrictImageSequence();
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:invokevirtual   #1952 <Method boolean PdfDocument.isStrictImageSequence()>
	//    3    7:ireturn         
	}

	public boolean isTagged()
	{
		return tagged;
	//    0    0:aload_0         
	//    1    1:getfield        #571 <Field boolean tagged>
	//    2    4:ireturn         
	}

	public boolean isUserProperties()
	{
		return userProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #1472 <Field boolean userProperties>
	//    2    4:ireturn         
	}

	public void lockLayer(PdfLayer pdflayer)
	{
		OCGLocked.add(((PdfObject) (pdflayer.getRef())));
	//    0    0:aload_0         
	//    1    1:getfield        #587 <Field PdfArray OCGLocked>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #653 <Method PdfIndirectReference PdfLayer.getRef()>
	//    4    8:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//    5   11:pop             
	//    6   12:return          
	}

	public boolean needToBeMarkedInContent(IAccessibleElement iaccessibleelement)
	{
		return (taggingMode & 1) == 0 || iaccessibleelement.isInline() || PdfName.ARTIFACT.equals(((Object) (iaccessibleelement.getRole())));
	//    0    0:aload_0         
	//    1    1:getfield        #573 <Field int taggingMode>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            33
	//    5    9:aload_1         
	//    6   10:invokeinterface #1494 <Method boolean IAccessibleElement.isInline()>
	//    7   15:ifne            33
	//    8   18:getstatic       #1488 <Field PdfName PdfName.ARTIFACT>
	//    9   21:aload_1         
	//   10   22:invokeinterface #1485 <Method PdfName IAccessibleElement.getRole()>
	//   11   27:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//   12   30:ifeq            35
	//   13   33:iconst_1        
	//   14   34:ireturn         
	//   15   35:iconst_0        
	//   16   36:ireturn         
	}

	public void open()
	{
		super.open();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1959 <Method void DocWriter.open()>
		try
		{
			pdf_version.writeHeader(os);
	//    2    4:aload_0         
	//    3    5:getfield        #520 <Field PdfVersionImp pdf_version>
	//    4    8:aload_0         
	//    5    9:getfield        #1606 <Field OutputStreamCounter os>
	//    6   12:invokevirtual   #1963 <Method void PdfVersionImp.writeHeader(OutputStreamCounter)>
			body = new PdfBody(this);
	//    7   15:aload_0         
	//    8   16:new             #20  <Class PdfWriter$PdfBody>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #1964 <Method void PdfWriter$PdfBody(PdfWriter)>
	//   12   24:putfield        #1305 <Field PdfWriter$PdfBody body>
			if(isPdfX() && ((PdfXConformanceImp)pdfIsoConformance).isPdfX32002())
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #702 <Method boolean isPdfX()>
	//*  15   31:ifeq            230
	//*  16   34:aload_0         
	//*  17   35:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//*  18   38:checkcast       #746 <Class PdfXConformanceImp>
	//*  19   41:invokevirtual   #773 <Method boolean PdfXConformanceImp.isPdfX32002()>
	//*  20   44:ifeq            230
			{
				PdfDictionary pdfdictionary = new PdfDictionary();
	//   21   47:new             #508 <Class PdfDictionary>
	//   22   50:dup             
	//   23   51:invokespecial   #509 <Method void PdfDictionary()>
	//   24   54:astore_1        
				pdfdictionary.put(PdfName.GAMMA, ((PdfObject) (new PdfArray(new float[] {
					2.2F, 2.2F, 2.2F
				}))));
	//   25   55:aload_1         
	//   26   56:getstatic       #1967 <Field PdfName PdfName.GAMMA>
	//   27   59:new             #582 <Class PdfArray>
	//   28   62:dup             
	//   29   63:iconst_3        
	//   30   64:newarray        float[]
	//   31   66:dup             
	//   32   67:iconst_0        
	//   33   68:ldc2            #1968 <Float 2.2F>
	//   34   71:fastore         
	//   35   72:dup             
	//   36   73:iconst_1        
	//   37   74:ldc2            #1968 <Float 2.2F>
	//   38   77:fastore         
	//   39   78:dup             
	//   40   79:iconst_2        
	//   41   80:ldc2            #1968 <Float 2.2F>
	//   42   83:fastore         
	//   43   84:invokespecial   #1971 <Method void PdfArray(float[])>
	//   44   87:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary.put(PdfName.MATRIX, ((PdfObject) (new PdfArray(new float[] {
					0.4124F, 0.2126F, 0.0193F, 0.3576F, 0.7152F, 0.1192F, 0.1805F, 0.0722F, 0.9505F
				}))));
	//   45   90:aload_1         
	//   46   91:getstatic       #1974 <Field PdfName PdfName.MATRIX>
	//   47   94:new             #582 <Class PdfArray>
	//   48   97:dup             
	//   49   98:bipush          9
	//   50  100:newarray        float[]
	//   51  102:dup             
	//   52  103:iconst_0        
	//   53  104:ldc2            #1975 <Float 0.4124F>
	//   54  107:fastore         
	//   55  108:dup             
	//   56  109:iconst_1        
	//   57  110:ldc2            #1976 <Float 0.2126F>
	//   58  113:fastore         
	//   59  114:dup             
	//   60  115:iconst_2        
	//   61  116:ldc2            #1977 <Float 0.0193F>
	//   62  119:fastore         
	//   63  120:dup             
	//   64  121:iconst_3        
	//   65  122:ldc2            #1978 <Float 0.3576F>
	//   66  125:fastore         
	//   67  126:dup             
	//   68  127:iconst_4        
	//   69  128:ldc2            #1979 <Float 0.7152F>
	//   70  131:fastore         
	//   71  132:dup             
	//   72  133:iconst_5        
	//   73  134:ldc2            #1980 <Float 0.1192F>
	//   74  137:fastore         
	//   75  138:dup             
	//   76  139:bipush          6
	//   77  141:ldc2            #1981 <Float 0.1805F>
	//   78  144:fastore         
	//   79  145:dup             
	//   80  146:bipush          7
	//   81  148:ldc2            #1982 <Float 0.0722F>
	//   82  151:fastore         
	//   83  152:dup             
	//   84  153:bipush          8
	//   85  155:ldc2            #1983 <Float 0.9505F>
	//   86  158:fastore         
	//   87  159:invokespecial   #1971 <Method void PdfArray(float[])>
	//   88  162:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary.put(PdfName.WHITEPOINT, ((PdfObject) (new PdfArray(new float[] {
					0.9505F, 1.0F, 1.089F
				}))));
	//   89  165:aload_1         
	//   90  166:getstatic       #1986 <Field PdfName PdfName.WHITEPOINT>
	//   91  169:new             #582 <Class PdfArray>
	//   92  172:dup             
	//   93  173:iconst_3        
	//   94  174:newarray        float[]
	//   95  176:dup             
	//   96  177:iconst_0        
	//   97  178:ldc2            #1983 <Float 0.9505F>
	//   98  181:fastore         
	//   99  182:dup             
	//  100  183:iconst_1        
	//  101  184:fconst_1        
	//  102  185:fastore         
	//  103  186:dup             
	//  104  187:iconst_2        
	//  105  188:ldc2            #1987 <Float 1.089F>
	//  106  191:fastore         
	//  107  192:invokespecial   #1971 <Method void PdfArray(float[])>
	//  108  195:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
				PdfArray pdfarray = new PdfArray(((PdfObject) (PdfName.CALRGB)));
	//  109  198:new             #582 <Class PdfArray>
	//  110  201:dup             
	//  111  202:getstatic       #1990 <Field PdfName PdfName.CALRGB>
	//  112  205:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//  113  208:astore_2        
				pdfarray.add(((PdfObject) (pdfdictionary)));
	//  114  209:aload_2         
	//  115  210:aload_1         
	//  116  211:invokevirtual   #657 <Method boolean PdfArray.add(PdfObject)>
	//  117  214:pop             
				setDefaultColorspace(PdfName.DEFAULTRGB, ((PdfObject) (addToBody(((PdfObject) (pdfarray))).getIndirectReference())));
	//  118  215:aload_0         
	//  119  216:getstatic       #1993 <Field PdfName PdfName.DEFAULTRGB>
	//  120  219:aload_0         
	//  121  220:aload_2         
	//  122  221:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//  123  224:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  124  227:invokevirtual   #1996 <Method void setDefaultColorspace(PdfName, PdfObject)>
			}
			return;
	//  125  230:return          
		}
		catch(IOException ioexception)
	//* 126  231:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//  127  232:new             #885 <Class ExceptionConverter>
	//  128  235:dup             
	//  129  236:aload_1         
	//  130  237:invokespecial   #888 <Method void ExceptionConverter(Exception)>
	//  131  240:athrow          
		}
	}

	boolean propertyExists(Object obj)
	{
		return documentProperties.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #569 <Field HashMap documentProperties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #998 <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	void registerLayer(PdfOCG pdfocg)
	{
		checkPdfIsoConformance(this, 7, ((Object) (pdfocg)));
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_1         
	//    3    4:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
		if(pdfocg instanceof PdfLayer)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #638 <Class PdfLayer>
	//*   6   11:ifeq            64
		{
			if(((PdfLayer)pdfocg).getTitle() == null)
	//*   7   14:aload_1         
	//*   8   15:checkcast       #638 <Class PdfLayer>
	//*   9   18:invokevirtual   #821 <Method String PdfLayer.getTitle()>
	//*  10   21:ifnonnull       54
			{
				if(!documentOCG.contains(((Object) (pdfocg))))
	//*  11   24:aload_0         
	//*  12   25:getfield        #578 <Field LinkedHashSet documentOCG>
	//*  13   28:aload_1         
	//*  14   29:invokevirtual   #2000 <Method boolean LinkedHashSet.contains(Object)>
	//*  15   32:ifne            53
				{
					documentOCG.add(((Object) (pdfocg)));
	//   16   35:aload_0         
	//   17   36:getfield        #578 <Field LinkedHashSet documentOCG>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #2001 <Method boolean LinkedHashSet.add(Object)>
	//   20   43:pop             
					documentOCGorder.add(((Object) (pdfocg)));
	//   21   44:aload_0         
	//   22   45:getfield        #580 <Field ArrayList documentOCGorder>
	//   23   48:aload_1         
	//   24   49:invokevirtual   #1890 <Method boolean ArrayList.add(Object)>
	//   25   52:pop             
				}
				return;
	//   26   53:return          
			} else
			{
				documentOCGorder.add(((Object) (pdfocg)));
	//   27   54:aload_0         
	//   28   55:getfield        #580 <Field ArrayList documentOCGorder>
	//   29   58:aload_1         
	//   30   59:invokevirtual   #1890 <Method boolean ArrayList.add(Object)>
	//   31   62:pop             
				return;
	//   32   63:return          
			}
		} else
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("only.pdflayer.is.accepted", new Object[0]));
	//   33   64:new             #1496 <Class IllegalArgumentException>
	//   34   67:dup             
	//   35   68:ldc2            #2003 <String "only.pdflayer.is.accepted">
	//   36   71:iconst_0        
	//   37   72:anewarray       Object[]
	//   38   75:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   39   78:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   40   81:athrow          
		}
	}

	public void releaseTemplate(PdfTemplate pdftemplate)
		throws IOException
	{
		pdftemplate = ((PdfTemplate) (pdftemplate.getIndirectReference()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//    2    4:astore_1        
		pdftemplate = ((PdfTemplate) ((Object[])formXObjects.get(((Object) (pdftemplate)))));
	//    3    5:aload_0         
	//    4    6:getfield        #546 <Field HashMap formXObjects>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1001 <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #1111 <Class Object[]>
	//    8   16:astore_1        
		PdfTemplate pdftemplate1;
		if(pdftemplate != null && pdftemplate[1] != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          27
	//*  11   21:aload_1         
	//*  12   22:iconst_1        
	//*  13   23:aaload          
	//*  14   24:ifnonnull       28
	//*  15   27:return          
	//*  16   28:aload_1         
	//*  17   29:iconst_1        
	//*  18   30:aaload          
	//*  19   31:checkcast       #1024 <Class PdfTemplate>
	//*  20   34:astore_2        
			if(!((pdftemplate1 = (PdfTemplate)pdftemplate[1]).getIndirectReference() instanceof PRIndirectReference) && pdftemplate1.getType() == 1)
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//*  23   39:instanceof      #905 <Class PRIndirectReference>
	//*  24   42:ifne            27
	//*  25   45:aload_2         
	//*  26   46:invokevirtual   #1116 <Method int PdfTemplate.getType()>
	//*  27   49:iconst_1        
	//*  28   50:icmpne          27
			{
				addToBody(((PdfObject) (pdftemplate1.getFormXObject(compressionLevel))), pdftemplate1.getIndirectReference());
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #534 <Field int compressionLevel>
	//   33   59:invokevirtual   #1431 <Method PdfStream PdfTemplate.getFormXObject(int)>
	//   34   62:aload_2         
	//   35   63:invokevirtual   #1109 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//   36   66:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   37   69:pop             
				pdftemplate[1] = null;
	//   38   70:aload_1         
	//   39   71:iconst_1        
	//   40   72:aconst_null     
	//   41   73:aastore         
				return;
	//   42   74:return          
			}
	}

	public int reorderPages(int ai[])
		throws DocumentException
	{
		return root.reorderPages(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #497 <Field PdfPages root>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2008 <Method int PdfPages.reorderPages(int[])>
	//    4    8:ireturn         
	}

	void resetContent()
	{
		directContent.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #620 <Field PdfContentByte directContent>
	//    2    4:invokevirtual   #2012 <Method void PdfContentByte.reset()>
		directContentUnder.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #614 <Field PdfContentByte directContentUnder>
	//    5   11:invokevirtual   #2012 <Method void PdfContentByte.reset()>
	//    6   14:return          
	}

	public void resetPageDictEntries()
	{
		pageDictEntries = new PdfDictionary();
	//    0    0:aload_0         
	//    1    1:new             #508 <Class PdfDictionary>
	//    2    4:dup             
	//    3    5:invokespecial   #509 <Method void PdfDictionary()>
	//    4    8:putfield        #511 <Field PdfDictionary pageDictEntries>
	//    5   11:return          
	}

	public void setAdditionalAction(PdfName pdfname, PdfAction pdfaction)
		throws DocumentException
	{
		if(!pdfname.equals(((Object) (DOCUMENT_CLOSE))) && !pdfname.equals(((Object) (WILL_SAVE))) && !pdfname.equals(((Object) (DID_SAVE))) && !pdfname.equals(((Object) (WILL_PRINT))) && !pdfname.equals(((Object) (DID_PRINT))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #304 <Field PdfName DOCUMENT_CLOSE>
	//*   2    4:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifne            75
	//*   4   10:aload_1         
	//*   5   11:getstatic       #309 <Field PdfName WILL_SAVE>
	//*   6   14:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*   7   17:ifne            75
	//*   8   20:aload_1         
	//*   9   21:getstatic       #314 <Field PdfName DID_SAVE>
	//*  10   24:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*  11   27:ifne            75
	//*  12   30:aload_1         
	//*  13   31:getstatic       #319 <Field PdfName WILL_PRINT>
	//*  14   34:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*  15   37:ifne            75
	//*  16   40:aload_1         
	//*  17   41:getstatic       #324 <Field PdfName DID_PRINT>
	//*  18   44:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*  19   47:ifne            75
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("invalid.additional.action.type.1", new Object[] {
				pdfname.toString()
			}));
	//   20   50:new             #779 <Class DocumentException>
	//   21   53:dup             
	//   22   54:ldc2            #2017 <String "invalid.additional.action.type.1">
	//   23   57:iconst_1        
	//   24   58:anewarray       Object[]
	//   25   61:dup             
	//   26   62:iconst_0        
	//   27   63:aload_1         
	//   28   64:invokevirtual   #2018 <Method String PdfName.toString()>
	//   29   67:aastore         
	//   30   68:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   71:invokespecial   #2019 <Method void DocumentException(String)>
	//   32   74:athrow          
		} else
		{
			pdf.addAdditionalAction(pdfname, pdfaction);
	//   33   75:aload_0         
	//   34   76:getfield        #609 <Field PdfDocument pdf>
	//   35   79:aload_1         
	//   36   80:aload_2         
	//   37   81:invokevirtual   #2022 <Method void PdfDocument.addAdditionalAction(PdfName, PdfAction)>
			return;
	//   38   84:return          
		}
	}

	public void setAtLeastPdfVersion(char c)
	{
		pdf_version.setAtLeastPdfVersion(c);
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2026 <Method void PdfVersionImp.setAtLeastPdfVersion(char)>
	//    4    8:return          
	}

	public void setBoxSize(String s, com.itextpdf.text.Rectangle rectangle)
	{
		pdf.setBoxSize(s, rectangle);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #2030 <Method void PdfDocument.setBoxSize(String, com.itextpdf.text.Rectangle)>
	//    5    9:return          
	}

	public void setCollection(PdfCollection pdfcollection)
	{
		setAtLeastPdfVersion('7');
	//    0    0:aload_0         
	//    1    1:bipush          55
	//    2    3:invokevirtual   #2033 <Method void setAtLeastPdfVersion(char)>
		pdf.setCollection(pdfcollection);
	//    3    6:aload_0         
	//    4    7:getfield        #609 <Field PdfDocument pdf>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #2035 <Method void PdfDocument.setCollection(PdfCollection)>
	//    7   14:return          
	}

	public void setCompressionLevel(int i)
	{
		if(i < 0 || i > 9)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
	//*   2    4:iload_1         
	//*   3    5:bipush          9
	//*   4    7:icmple          16
		{
			compressionLevel = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #534 <Field int compressionLevel>
			return;
	//    8   15:return          
		} else
		{
			compressionLevel = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #534 <Field int compressionLevel>
			return;
	//   12   21:return          
		}
	}

	public void setCropBoxSize(com.itextpdf.text.Rectangle rectangle)
	{
		pdf.setCropBoxSize(rectangle);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2039 <Method void PdfDocument.setCropBoxSize(com.itextpdf.text.Rectangle)>
	//    4    8:return          
	}

	public void setDefaultColorspace(PdfName pdfname, PdfObject pdfobject)
	{
		if(pdfobject == null || pdfobject.isNull())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #2042 <Method boolean PdfObject.isNull()>
	//*   4    8:ifeq            19
			defaultColorspace.remove(pdfname);
	//    5   11:aload_0         
	//    6   12:getfield        #593 <Field PdfDictionary defaultColorspace>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #2043 <Method void PdfDictionary.remove(PdfName)>
		defaultColorspace.put(pdfname, pdfobject);
	//    9   19:aload_0         
	//   10   20:getfield        #593 <Field PdfDictionary defaultColorspace>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   14   28:return          
	}

	public void setDuration(int i)
	{
		pdf.setDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2046 <Method void PdfDocument.setDuration(int)>
	//    4    8:return          
	}

	public void setEncryption(int i, String s, String s1, int j)
		throws DocumentException
	{
		setEncryption(getISOBytes(s), getISOBytes(s1), j, i);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//    5    9:iload           4
	//    6   11:iload_1         
	//    7   12:invokevirtual   #2051 <Method void setEncryption(byte[], byte[], int, int)>
	//    8   15:return          
	}

	public void setEncryption(boolean flag, String s, String s1, int i)
		throws DocumentException
	{
		s = ((String) (getISOBytes(s)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//    2    4:astore_2        
		s1 = ((String) (getISOBytes(s1)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #867 <Method byte[] getISOBytes(String)>
	//    5    9:astore_3        
		int j;
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            28
			j = 1;
	//    8   14:iconst_1        
	//    9   15:istore          5
		else
	//*  10   17:aload_0         
	//*  11   18:aload_2         
	//*  12   19:aload_3         
	//*  13   20:iload           4
	//*  14   22:iload           5
	//*  15   24:invokevirtual   #2051 <Method void setEncryption(byte[], byte[], int, int)>
	//*  16   27:return          
			j = 0;
	//   17   28:iconst_0        
	//   18   29:istore          5
		setEncryption(((byte []) (s)), ((byte []) (s1)), i, j);
	//*  19   31:goto            17
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, int j)
		throws DocumentException
	{
		if(pdf.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #609 <Field PdfDocument pdf>
	//*   2    4:invokevirtual   #2056 <Method boolean PdfDocument.isOpen()>
	//*   3    7:ifeq            28
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("encryption.can.only.be.added.before.opening.the.document", new Object[0]));
	//    4   10:new             #779 <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #2058 <String "encryption.can.only.be.added.before.opening.the.document">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #2019 <Method void DocumentException(String)>
	//   11   27:athrow          
		} else
		{
			crypto = new PdfEncryption();
	//   12   28:aload_0         
	//   13   29:new             #1561 <Class PdfEncryption>
	//   14   32:dup             
	//   15   33:invokespecial   #2059 <Method void PdfEncryption()>
	//   16   36:putfield        #1559 <Field PdfEncryption crypto>
			crypto.setCryptoMode(j, 0);
	//   17   39:aload_0         
	//   18   40:getfield        #1559 <Field PdfEncryption crypto>
	//   19   43:iload           4
	//   20   45:iconst_0        
	//   21   46:invokevirtual   #2062 <Method void PdfEncryption.setCryptoMode(int, int)>
			crypto.setupAllKeys(abyte0, abyte1, i);
	//   22   49:aload_0         
	//   23   50:getfield        #1559 <Field PdfEncryption crypto>
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:iload_3         
	//   27   56:invokevirtual   #2066 <Method void PdfEncryption.setupAllKeys(byte[], byte[], int)>
			return;
	//   28   59:return          
		}
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, boolean flag)
		throws DocumentException
	{
		int j;
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            18
			j = 1;
	//    2    5:iconst_1        
	//    3    6:istore          5
		else
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:iload_3         
	//*   8   12:iload           5
	//*   9   14:invokevirtual   #2051 <Method void setEncryption(byte[], byte[], int, int)>
	//*  10   17:return          
			j = 0;
	//   11   18:iconst_0        
	//   12   19:istore          5
		setEncryption(abyte0, abyte1, i, j);
	//*  13   21:goto            8
	}

	public void setEncryption(Certificate acertificate[], int ai[], int i)
		throws DocumentException
	{
		if(pdf.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #609 <Field PdfDocument pdf>
	//*   2    4:invokevirtual   #2056 <Method boolean PdfDocument.isOpen()>
	//*   3    7:ifeq            28
			throw new DocumentException(MessageLocalization.getComposedMessage("encryption.can.only.be.added.before.opening.the.document", new Object[0]));
	//    4   10:new             #779 <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #2058 <String "encryption.can.only.be.added.before.opening.the.document">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #2019 <Method void DocumentException(String)>
	//   11   27:athrow          
		crypto = new PdfEncryption();
	//   12   28:aload_0         
	//   13   29:new             #1561 <Class PdfEncryption>
	//   14   32:dup             
	//   15   33:invokespecial   #2059 <Method void PdfEncryption()>
	//   16   36:putfield        #1559 <Field PdfEncryption crypto>
		if(acertificate != null)
	//*  17   39:aload_1         
	//*  18   40:ifnull          77
		{
			for(int j = 0; j < acertificate.length; j++)
	//*  19   43:iconst_0        
	//*  20   44:istore          4
	//*  21   46:iload           4
	//*  22   48:aload_1         
	//*  23   49:arraylength     
	//*  24   50:icmpge          77
				crypto.addRecipient(acertificate[j], ai[j]);
	//   25   53:aload_0         
	//   26   54:getfield        #1559 <Field PdfEncryption crypto>
	//   27   57:aload_1         
	//   28   58:iload           4
	//   29   60:aaload          
	//   30   61:aload_2         
	//   31   62:iload           4
	//   32   64:iaload          
	//   33   65:invokevirtual   #2072 <Method void PdfEncryption.addRecipient(Certificate, int)>

	//   34   68:iload           4
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:istore          4
		}
	//*  38   74:goto            46
		crypto.setCryptoMode(i, 0);
	//   39   77:aload_0         
	//   40   78:getfield        #1559 <Field PdfEncryption crypto>
	//   41   81:iload_3         
	//   42   82:iconst_0        
	//   43   83:invokevirtual   #2062 <Method void PdfEncryption.setCryptoMode(int, int)>
		crypto.getEncryptionDictionary();
	//   44   86:aload_0         
	//   45   87:getfield        #1559 <Field PdfEncryption crypto>
	//   46   90:invokevirtual   #1598 <Method PdfDictionary PdfEncryption.getEncryptionDictionary()>
	//   47   93:pop             
	//   48   94:return          
	}

	public void setFullCompression()
		throws DocumentException
	{
		if(open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifeq            25
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("you.can.t.set.the.full.compression.if.the.document.is.already.open", new Object[0]));
	//    3    7:new             #779 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #2075 <String "you.can.t.set.the.full.compression.if.the.document.is.already.open">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #2019 <Method void DocumentException(String)>
	//   10   24:athrow          
		} else
		{
			fullCompression = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #532 <Field boolean fullCompression>
			setAtLeastPdfVersion('5');
	//   14   30:aload_0         
	//   15   31:bipush          53
	//   16   33:invokevirtual   #2033 <Method void setAtLeastPdfVersion(char)>
			return;
	//   17   36:return          
		}
	}

	public void setGroup(PdfDictionary pdfdictionary)
	{
		group = pdfdictionary;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #946 <Field PdfDictionary group>
	//    3    5:return          
	}

	public void setInitialLeading(float f)
		throws DocumentException
	{
		if(open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifeq            25
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("you.can.t.set.the.initial.leading.if.the.document.is.already.open", new Object[0]));
	//    3    7:new             #779 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #2080 <String "you.can.t.set.the.initial.leading.if.the.document.is.already.open">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #2019 <Method void DocumentException(String)>
	//   10   24:athrow          
		} else
		{
			pdf.setLeading(f);
	//   11   25:aload_0         
	//   12   26:getfield        #609 <Field PdfDocument pdf>
	//   13   29:fload_1         
	//   14   30:invokevirtual   #2083 <Method void PdfDocument.setLeading(float)>
			return;
	//   15   33:return          
		}
	}

	public void setLanguage(String s)
	{
		pdf.setLanguage(s);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2086 <Method void PdfDocument.setLanguage(String)>
	//    4    8:return          
	}

	public void setLinearPageMode()
	{
		root.setLinearMode(((PdfIndirectReference) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #497 <Field PdfPages root>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #2090 <Method void PdfPages.setLinearMode(PdfIndirectReference)>
	//    4    8:return          
	}

	public void setOpenAction(PdfAction pdfaction)
	{
		pdf.setOpenAction(pdfaction);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2093 <Method void PdfDocument.setOpenAction(PdfAction)>
	//    4    8:return          
	}

	public void setOpenAction(String s)
	{
		pdf.setOpenAction(s);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2095 <Method void PdfDocument.setOpenAction(String)>
	//    4    8:return          
	}

	public void setOutlines(List list)
	{
		newBookmarks = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #2099 <Field List newBookmarks>
	//    3    5:return          
	}

	public void setOutputIntents(String s, String s1, String s2, String s3, ICC_Profile icc_profile)
		throws IOException
	{
		checkPdfIsoConformance(this, 19, ((Object) (icc_profile)));
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload           5
	//    3    5:invokestatic    #903 <Method void checkPdfIsoConformance(PdfWriter, int, Object)>
		getExtraCatalog();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1579 <Method PdfDictionary getExtraCatalog()>
	//    6   12:pop             
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.OUTPUTINTENT);
	//    7   13:new             #508 <Class PdfDictionary>
	//    8   16:dup             
	//    9   17:getstatic       #708 <Field PdfName PdfName.OUTPUTINTENT>
	//   10   20:invokespecial   #711 <Method void PdfDictionary(PdfName)>
	//   11   23:astore          6
		if(s1 != null)
	//*  12   25:aload_2         
	//*  13   26:ifnull          48
			pdfdictionary.put(PdfName.OUTPUTCONDITION, ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//   14   29:aload           6
	//   15   31:getstatic       #714 <Field PdfName PdfName.OUTPUTCONDITION>
	//   16   34:new             #716 <Class PdfString>
	//   17   37:dup             
	//   18   38:aload_2         
	//   19   39:ldc2            #827 <String "UnicodeBig">
	//   20   42:invokespecial   #830 <Method void PdfString(String, String)>
	//   21   45:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s != null)
	//*  22   48:aload_1         
	//*  23   49:ifnull          71
			pdfdictionary.put(PdfName.OUTPUTCONDITIONIDENTIFIER, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   24   52:aload           6
	//   25   54:getstatic       #722 <Field PdfName PdfName.OUTPUTCONDITIONIDENTIFIER>
	//   26   57:new             #716 <Class PdfString>
	//   27   60:dup             
	//   28   61:aload_1         
	//   29   62:ldc2            #827 <String "UnicodeBig">
	//   30   65:invokespecial   #830 <Method void PdfString(String, String)>
	//   31   68:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s2 != null)
	//*  32   71:aload_3         
	//*  33   72:ifnull          94
			pdfdictionary.put(PdfName.REGISTRYNAME, ((PdfObject) (new PdfString(s2, "UnicodeBig"))));
	//   34   75:aload           6
	//   35   77:getstatic       #727 <Field PdfName PdfName.REGISTRYNAME>
	//   36   80:new             #716 <Class PdfString>
	//   37   83:dup             
	//   38   84:aload_3         
	//   39   85:ldc2            #827 <String "UnicodeBig">
	//   40   88:invokespecial   #830 <Method void PdfString(String, String)>
	//   41   91:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s3 != null)
	//*  42   94:aload           4
	//*  43   96:ifnull          119
			pdfdictionary.put(PdfName.INFO, ((PdfObject) (new PdfString(s3, "UnicodeBig"))));
	//   44   99:aload           6
	//   45  101:getstatic       #732 <Field PdfName PdfName.INFO>
	//   46  104:new             #716 <Class PdfString>
	//   47  107:dup             
	//   48  108:aload           4
	//   49  110:ldc2            #827 <String "UnicodeBig">
	//   50  113:invokespecial   #830 <Method void PdfString(String, String)>
	//   51  116:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(icc_profile != null)
	//*  52  119:aload           5
	//*  53  121:ifnull          154
		{
			s = ((String) (new PdfICCBased(icc_profile, compressionLevel)));
	//   54  124:new             #1072 <Class PdfICCBased>
	//   55  127:dup             
	//   56  128:aload           5
	//   57  130:aload_0         
	//   58  131:getfield        #534 <Field int compressionLevel>
	//   59  134:invokespecial   #1082 <Method void PdfICCBased(ICC_Profile, int)>
	//   60  137:astore_1        
			pdfdictionary.put(PdfName.DESTOUTPUTPROFILE, ((PdfObject) (addToBody(((PdfObject) (s))).getIndirectReference())));
	//   61  138:aload           6
	//   62  140:getstatic       #2105 <Field PdfName PdfName.DESTOUTPUTPROFILE>
	//   63  143:aload_0         
	//   64  144:aload_1         
	//   65  145:invokevirtual   #878 <Method PdfIndirectObject addToBody(PdfObject)>
	//   66  148:invokevirtual   #883 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   67  151:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.GTS_PDFX)));
	//   68  154:aload           6
	//   69  156:getstatic       #737 <Field PdfName PdfName.S>
	//   70  159:getstatic       #740 <Field PdfName PdfName.GTS_PDFX>
	//   71  162:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		extraCatalog.put(PdfName.OUTPUTINTENTS, ((PdfObject) (new PdfArray(((PdfObject) (pdfdictionary))))));
	//   72  165:aload_0         
	//   73  166:getfield        #1583 <Field PdfDictionary extraCatalog>
	//   74  169:getstatic       #705 <Field PdfName PdfName.OUTPUTINTENTS>
	//   75  172:new             #582 <Class PdfArray>
	//   76  175:dup             
	//   77  176:aload           6
	//   78  178:invokespecial   #689 <Method void PdfArray(PdfObject)>
	//   79  181:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
		colorProfile = icc_profile;
	//   80  184:aload_0         
	//   81  185:aload           5
	//   82  187:putfield        #1838 <Field ICC_Profile colorProfile>
	//   83  190:return          
	}

	public void setOutputIntents(String s, String s1, String s2, String s3, byte abyte0[])
		throws IOException
	{
		if(abyte0 == null)
	//*   0    0:aload           5
	//*   1    2:ifnonnull       20
			abyte0 = null;
	//    2    5:aconst_null     
	//    3    6:astore          5
		else
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:aload           4
	//*   9   14:aload           5
	//*  10   16:invokevirtual   #2108 <Method void setOutputIntents(String, String, String, String, ICC_Profile)>
	//*  11   19:return          
			abyte0 = ((byte []) (ICC_Profile.getInstance(abyte0)));
	//   12   20:aload           5
	//   13   22:invokestatic    #2113 <Method ICC_Profile ICC_Profile.getInstance(byte[])>
	//   14   25:astore          5
		setOutputIntents(s, s1, s2, s3, ((ICC_Profile) (abyte0)));
	//*  15   27:goto            8
	}

	public boolean setOutputIntents(PdfReader pdfreader, boolean flag)
		throws IOException
	{
		pdfreader = ((PdfReader) (pdfreader.getCatalog().getAsArray(PdfName.OUTPUTINTENTS)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #2116 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #705 <Field PdfName PdfName.OUTPUTINTENTS>
	//    3    7:invokevirtual   #676 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    4   10:astore_1        
		break MISSING_BLOCK_LABEL_11;
		if(pdfreader != null && !((PdfArray) (pdfreader)).isEmpty())
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:iconst_0        
	//*   8   16:ireturn         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #2117 <Method boolean PdfArray.isEmpty()>
	//*  11   21:ifne            15
		{
			PdfDictionary pdfdictionary = ((PdfArray) (pdfreader)).getAsDict(0);
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #2120 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   15   29:astore_3        
			pdfreader = ((PdfReader) (PdfReader.getPdfObject(pdfdictionary.get(PdfName.S))));
	//   16   30:aload_3         
	//   17   31:getstatic       #737 <Field PdfName PdfName.S>
	//   18   34:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   37:invokestatic    #804 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   20   40:astore_1        
			if(pdfreader != null && PdfName.GTS_PDFX.equals(((Object) (pdfreader))))
	//*  21   41:aload_1         
	//*  22   42:ifnull          15
	//*  23   45:getstatic       #740 <Field PdfName PdfName.GTS_PDFX>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*  26   52:ifeq            15
			{
				if(flag)
	//*  27   55:iload_2         
	//*  28   56:ifeq            61
					return true;
	//   29   59:iconst_1        
	//   30   60:ireturn         
				PRStream prstream = (PRStream)PdfReader.getPdfObject(pdfdictionary.get(PdfName.DESTOUTPUTPROFILE));
	//   31   61:aload_3         
	//   32   62:getstatic       #2105 <Field PdfName PdfName.DESTOUTPUTPROFILE>
	//   33   65:invokevirtual   #649 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   68:invokestatic    #804 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   35   71:checkcast       #2122 <Class PRStream>
	//   36   74:astore          4
				pdfreader = null;
	//   37   76:aconst_null     
	//   38   77:astore_1        
				if(prstream != null)
	//*  39   78:aload           4
	//*  40   80:ifnull          89
					pdfreader = ((PdfReader) (PdfReader.getStreamBytes(prstream)));
	//   41   83:aload           4
	//   42   85:invokestatic    #2126 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   43   88:astore_1        
				setOutputIntents(getNameString(pdfdictionary, PdfName.OUTPUTCONDITIONIDENTIFIER), getNameString(pdfdictionary, PdfName.OUTPUTCONDITION), getNameString(pdfdictionary, PdfName.REGISTRYNAME), getNameString(pdfdictionary, PdfName.INFO), ((byte []) (pdfreader)));
	//   44   89:aload_0         
	//   45   90:aload_3         
	//   46   91:getstatic       #722 <Field PdfName PdfName.OUTPUTCONDITIONIDENTIFIER>
	//   47   94:invokestatic    #2128 <Method String getNameString(PdfDictionary, PdfName)>
	//   48   97:aload_3         
	//   49   98:getstatic       #714 <Field PdfName PdfName.OUTPUTCONDITION>
	//   50  101:invokestatic    #2128 <Method String getNameString(PdfDictionary, PdfName)>
	//   51  104:aload_3         
	//   52  105:getstatic       #727 <Field PdfName PdfName.REGISTRYNAME>
	//   53  108:invokestatic    #2128 <Method String getNameString(PdfDictionary, PdfName)>
	//   54  111:aload_3         
	//   55  112:getstatic       #732 <Field PdfName PdfName.INFO>
	//   56  115:invokestatic    #2128 <Method String getNameString(PdfDictionary, PdfName)>
	//   57  118:aload_1         
	//   58  119:invokevirtual   #2130 <Method void setOutputIntents(String, String, String, String, byte[])>
				return true;
	//   59  122:iconst_1        
	//   60  123:ireturn         
			}
		}
		return false;
	}

	public void setPDFXConformance(int i)
	{
		while(!(pdfIsoConformance instanceof PdfXConformanceImp) || ((PdfXConformance)pdfIsoConformance).getPDFXConformance() == i) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//*   2    4:instanceof      #746 <Class PdfXConformanceImp>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
	//    5   11:aload_0         
	//    6   12:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//    7   15:checkcast       #1871 <Class PdfXConformance>
	//    8   18:invokeinterface #1873 <Method int PdfXConformance.getPDFXConformance()>
	//    9   23:iload_1         
	//   10   24:icmpeq          10
		if(pdf.isOpen())
	//*  11   27:aload_0         
	//*  12   28:getfield        #609 <Field PdfDocument pdf>
	//*  13   31:invokevirtual   #2056 <Method boolean PdfDocument.isOpen()>
	//*  14   34:ifeq            55
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("pdfx.conformance.can.only.be.set.before.opening.the.document", new Object[0]));
	//   15   37:new             #2133 <Class PdfXConformanceException>
	//   16   40:dup             
	//   17   41:ldc2            #2135 <String "pdfx.conformance.can.only.be.set.before.opening.the.document">
	//   18   44:iconst_0        
	//   19   45:anewarray       Object[]
	//   20   48:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   51:invokespecial   #2136 <Method void PdfXConformanceException(String)>
	//   22   54:athrow          
		if(crypto != null)
	//*  23   55:aload_0         
	//*  24   56:getfield        #1559 <Field PdfEncryption crypto>
	//*  25   59:ifnull          80
			throw new PdfXConformanceException(MessageLocalization.getComposedMessage("a.pdfx.conforming.document.cannot.be.encrypted", new Object[0]));
	//   26   62:new             #2133 <Class PdfXConformanceException>
	//   27   65:dup             
	//   28   66:ldc2            #2138 <String "a.pdfx.conforming.document.cannot.be.encrypted">
	//   29   69:iconst_0        
	//   30   70:anewarray       Object[]
	//   31   73:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   32   76:invokespecial   #2136 <Method void PdfXConformanceException(String)>
	//   33   79:athrow          
		if(i != 0)
	//*  34   80:iload_1         
	//*  35   81:ifeq            90
			setPdfVersion('3');
	//   36   84:aload_0         
	//   37   85:bipush          51
	//   38   87:invokevirtual   #2141 <Method void setPdfVersion(char)>
		((PdfXConformance)pdfIsoConformance).setPDFXConformance(i);
	//   39   90:aload_0         
	//   40   91:getfield        #530 <Field PdfIsoConformance pdfIsoConformance>
	//   41   94:checkcast       #1871 <Class PdfXConformance>
	//   42   97:iload_1         
	//   43   98:invokeinterface #2143 <Method void PdfXConformance.setPDFXConformance(int)>
	//   44  103:return          
	}

	public void setPageAction(PdfName pdfname, PdfAction pdfaction)
		throws DocumentException
	{
		if(!pdfname.equals(((Object) (PAGE_OPEN))) && !pdfname.equals(((Object) (PAGE_CLOSE))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #329 <Field PdfName PAGE_OPEN>
	//*   2    4:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifne            45
	//*   4   10:aload_1         
	//*   5   11:getstatic       #333 <Field PdfName PAGE_CLOSE>
	//*   6   14:invokevirtual   #1100 <Method boolean PdfName.equals(Object)>
	//*   7   17:ifne            45
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("invalid.page.additional.action.type.1", new Object[] {
				pdfname.toString()
			}));
	//    8   20:new             #779 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #2146 <String "invalid.page.additional.action.type.1">
	//   11   27:iconst_1        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:aload_1         
	//   16   34:invokevirtual   #2018 <Method String PdfName.toString()>
	//   17   37:aastore         
	//   18   38:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   41:invokespecial   #2019 <Method void DocumentException(String)>
	//   20   44:athrow          
		} else
		{
			pdf.setPageAction(pdfname, pdfaction);
	//   21   45:aload_0         
	//   22   46:getfield        #609 <Field PdfDocument pdf>
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:invokevirtual   #2148 <Method void PdfDocument.setPageAction(PdfName, PdfAction)>
			return;
	//   26   54:return          
		}
	}

	public void setPageEmpty(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            5
		{
			return;
	//    2    4:return          
		} else
		{
			pdf.setPageEmpty(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #609 <Field PdfDocument pdf>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #2151 <Method void PdfDocument.setPageEmpty(boolean)>
			return;
	//    7   13:return          
		}
	}

	public void setPageEvent(PdfPageEvent pdfpageevent)
	{
		if(pdfpageevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			pageEvent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #1878 <Field PdfPageEvent pageEvent>
			return;
	//    5    9:return          
		}
		if(pageEvent == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #1878 <Field PdfPageEvent pageEvent>
	//*   8   14:ifnonnull       23
		{
			pageEvent = pdfpageevent;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #1878 <Field PdfPageEvent pageEvent>
			return;
	//   12   22:return          
		}
		if(pageEvent instanceof PdfPageEventForwarder)
	//*  13   23:aload_0         
	//*  14   24:getfield        #1878 <Field PdfPageEvent pageEvent>
	//*  15   27:instanceof      #2155 <Class PdfPageEventForwarder>
	//*  16   30:ifeq            45
		{
			((PdfPageEventForwarder)pageEvent).addPageEvent(pdfpageevent);
	//   17   33:aload_0         
	//   18   34:getfield        #1878 <Field PdfPageEvent pageEvent>
	//   19   37:checkcast       #2155 <Class PdfPageEventForwarder>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #2158 <Method void PdfPageEventForwarder.addPageEvent(PdfPageEvent)>
			return;
	//   22   44:return          
		} else
		{
			PdfPageEventForwarder pdfpageeventforwarder = new PdfPageEventForwarder();
	//   23   45:new             #2155 <Class PdfPageEventForwarder>
	//   24   48:dup             
	//   25   49:invokespecial   #2159 <Method void PdfPageEventForwarder()>
	//   26   52:astore_2        
			pdfpageeventforwarder.addPageEvent(pageEvent);
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #1878 <Field PdfPageEvent pageEvent>
	//   30   58:invokevirtual   #2158 <Method void PdfPageEventForwarder.addPageEvent(PdfPageEvent)>
			pdfpageeventforwarder.addPageEvent(pdfpageevent);
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #2158 <Method void PdfPageEventForwarder.addPageEvent(PdfPageEvent)>
			pageEvent = ((PdfPageEvent) (pdfpageeventforwarder));
	//   34   66:aload_0         
	//   35   67:aload_2         
	//   36   68:putfield        #1878 <Field PdfPageEvent pageEvent>
			return;
	//   37   71:return          
		}
	}

	public void setPageLabels(PdfPageLabels pdfpagelabels)
	{
		pdf.setPageLabels(pdfpagelabels);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2163 <Method void PdfDocument.setPageLabels(PdfPageLabels)>
	//    4    8:return          
	}

	public void setPageViewport(PdfArray pdfarray)
	{
		addPageDictEntry(PdfName.VP, ((PdfObject) (pdfarray)));
	//    0    0:aload_0         
	//    1    1:getstatic       #2168 <Field PdfName PdfName.VP>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2170 <Method void addPageDictEntry(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setPageXmpMetadata(byte abyte0[])
		throws IOException
	{
		pdf.setXmpMetadata(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2174 <Method void PdfDocument.setXmpMetadata(byte[])>
	//    4    8:return          
	}

	public void setPdfVersion(char c)
	{
		pdf_version.setPdfVersion(c);
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2175 <Method void PdfVersionImp.setPdfVersion(char)>
	//    4    8:return          
	}

	public void setPdfVersion(PdfName pdfname)
	{
		pdf_version.setPdfVersion(pdfname);
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field PdfVersionImp pdf_version>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2177 <Method void PdfVersionImp.setPdfVersion(PdfName)>
	//    4    8:return          
	}

	public void setRgbTransparencyBlending(boolean flag)
	{
		rgbTransparencyBlending = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #955 <Field boolean rgbTransparencyBlending>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		if(i < 1 || i > 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          10
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmple          25
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.run.direction.1", i));
	//    6   10:new             #1346 <Class RuntimeException>
	//    7   13:dup             
	//    8   14:ldc2            #2181 <String "invalid.run.direction.1">
	//    9   17:iload_1         
	//   10   18:invokestatic    #2184 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   11   21:invokespecial   #1349 <Method void RuntimeException(String)>
	//   12   24:athrow          
		} else
		{
			runDirection = i;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:putfield        #591 <Field int runDirection>
			return;
	//   16   30:return          
		}
	}

	public void setSigFlags(int i)
	{
		pdf.setSigFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2187 <Method void PdfDocument.setSigFlags(int)>
	//    4    8:return          
	}

	public void setSpaceCharRatio(float f)
	{
		if(f < 0.001F)
	//*   0    0:fload_1         
	//*   1    1:ldc2            #2189 <Float 0.001F>
	//*   2    4:fcmpg           
	//*   3    5:ifge            16
		{
			spaceCharRatio = 0.001F;
	//    4    8:aload_0         
	//    5    9:ldc2            #2189 <Float 0.001F>
	//    6   12:putfield        #589 <Field float spaceCharRatio>
			return;
	//    7   15:return          
		} else
		{
			spaceCharRatio = f;
	//    8   16:aload_0         
	//    9   17:fload_1         
	//   10   18:putfield        #589 <Field float spaceCharRatio>
			return;
	//   11   21:return          
		}
	}

	public void setStrictImageSequence(boolean flag)
	{
		pdf.setStrictImageSequence(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2192 <Method void PdfDocument.setStrictImageSequence(boolean)>
	//    4    8:return          
	}

	public void setTabs(PdfName pdfname)
	{
		tabs = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #506 <Field PdfName tabs>
	//    3    5:return          
	}

	public void setTagged()
	{
		setTagged(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #2196 <Method void setTagged(int)>
	//    3    5:return          
	}

	public void setTagged(int i)
	{
		if(open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field boolean open>
	//*   2    4:ifeq            25
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("tagging.must.be.set.before.opening.the.document", new Object[0]));
	//    3    7:new             #1496 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #2198 <String "tagging.must.be.set.before.opening.the.document">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1499 <Method void IllegalArgumentException(String)>
	//   10   24:athrow          
		} else
		{
			tagged = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #571 <Field boolean tagged>
			taggingMode = i;
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:putfield        #573 <Field int taggingMode>
			return;
	//   17   35:return          
		}
	}

	public void setThumbnail(Image image)
		throws PdfException, DocumentException
	{
		pdf.setThumbnail(image);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2202 <Method void PdfDocument.setThumbnail(Image)>
	//    4    8:return          
	}

	public void setTransition(PdfTransition pdftransition)
	{
		pdf.setTransition(pdftransition);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2206 <Method void PdfDocument.setTransition(PdfTransition)>
	//    4    8:return          
	}

	public void setUserProperties(boolean flag)
	{
		userProperties = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1472 <Field boolean userProperties>
	//    3    5:return          
	}

	public void setUserunit(float f)
		throws DocumentException
	{
		if(f < 1.0F || f > 75000F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpg           
	//*   3    3:iflt            14
	//*   4    6:fload_1         
	//*   5    7:ldc2            #2209 <Float 75000F>
	//*   6   10:fcmpl           
	//*   7   11:ifle            32
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("userunit.should.be.a.value.between.1.and.75000", new Object[0]));
	//    8   14:new             #779 <Class DocumentException>
	//    9   17:dup             
	//   10   18:ldc2            #2211 <String "userunit.should.be.a.value.between.1.and.75000">
	//   11   21:iconst_0        
	//   12   22:anewarray       Object[]
	//   13   25:invokestatic    #938 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   28:invokespecial   #2019 <Method void DocumentException(String)>
	//   15   31:athrow          
		} else
		{
			addPageDictEntry(PdfName.USERUNIT, ((PdfObject) (new PdfNumber(f))));
	//   16   32:aload_0         
	//   17   33:getstatic       #2214 <Field PdfName PdfName.USERUNIT>
	//   18   36:new             #2216 <Class PdfNumber>
	//   19   39:dup             
	//   20   40:fload_1         
	//   21   41:invokespecial   #2218 <Method void PdfNumber(float)>
	//   22   44:invokevirtual   #2170 <Method void addPageDictEntry(PdfName, PdfObject)>
			setAtLeastPdfVersion('6');
	//   23   47:aload_0         
	//   24   48:bipush          54
	//   25   50:invokevirtual   #2033 <Method void setAtLeastPdfVersion(char)>
			return;
	//   26   53:return          
		}
	}

	public void setViewerPreferences(int i)
	{
		pdf.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #2221 <Method void PdfDocument.setViewerPreferences(int)>
	//    4    8:return          
	}

	public void setXmpMetadata(byte abyte0[])
	{
		xmpMetadata = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #522 <Field byte[] xmpMetadata>
	//    3    5:return          
	}

	public void useExternalCacheForTagStructure(TempFileCache tempfilecache)
	{
		pdf.useExternalCache(tempfilecache);
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #2226 <Method void PdfDocument.useExternalCache(TempFileCache)>
	//    4    8:return          
	}

	protected void writeOutlines(PdfDictionary pdfdictionary, boolean flag)
		throws IOException
	{
		if(newBookmarks == null || newBookmarks.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #2099 <Field List newBookmarks>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #2099 <Field List newBookmarks>
	//*   5   11:invokeinterface #2229 <Method boolean List.isEmpty()>
	//*   6   16:ifeq            20
		{
			return;
	//    7   19:return          
		} else
		{
			PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    8   20:new             #508 <Class PdfDictionary>
	//    9   23:dup             
	//   10   24:invokespecial   #509 <Method void PdfDictionary()>
	//   11   27:astore_3        
			PdfIndirectReference pdfindirectreference = getPdfIndirectReference();
	//   12   28:aload_0         
	//   13   29:invokevirtual   #1190 <Method PdfIndirectReference getPdfIndirectReference()>
	//   14   32:astore          4
			Object aobj[] = SimpleBookmark.iterateOutlines(this, pdfindirectreference, newBookmarks, flag);
	//   15   34:aload_0         
	//   16   35:aload           4
	//   17   37:aload_0         
	//   18   38:getfield        #2099 <Field List newBookmarks>
	//   19   41:iload_2         
	//   20   42:invokestatic    #2235 <Method Object[] SimpleBookmark.iterateOutlines(PdfWriter, PdfIndirectReference, List, boolean)>
	//   21   45:astore          5
			pdfdictionary1.put(PdfName.FIRST, ((PdfObject) ((PdfIndirectReference)aobj[0])));
	//   22   47:aload_3         
	//   23   48:getstatic       #2238 <Field PdfName PdfName.FIRST>
	//   24   51:aload           5
	//   25   53:iconst_0        
	//   26   54:aaload          
	//   27   55:checkcast       #907 <Class PdfIndirectReference>
	//   28   58:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.LAST, ((PdfObject) ((PdfIndirectReference)aobj[1])));
	//   29   61:aload_3         
	//   30   62:getstatic       #2241 <Field PdfName PdfName.LAST>
	//   31   65:aload           5
	//   32   67:iconst_1        
	//   33   68:aaload          
	//   34   69:checkcast       #907 <Class PdfIndirectReference>
	//   35   72:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.COUNT, ((PdfObject) (new PdfNumber(((Integer)aobj[2]).intValue()))));
	//   36   75:aload_3         
	//   37   76:getstatic       #2244 <Field PdfName PdfName.COUNT>
	//   38   79:new             #2216 <Class PdfNumber>
	//   39   82:dup             
	//   40   83:aload           5
	//   41   85:iconst_2        
	//   42   86:aaload          
	//   43   87:checkcast       #1229 <Class Integer>
	//   44   90:invokevirtual   #2247 <Method int Integer.intValue()>
	//   45   93:invokespecial   #2248 <Method void PdfNumber(int)>
	//   46   96:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			addToBody(((PdfObject) (pdfdictionary1)), pdfindirectreference);
	//   47   99:aload_0         
	//   48  100:aload_3         
	//   49  101:aload           4
	//   50  103:invokevirtual   #927 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   51  106:pop             
			pdfdictionary.put(PdfName.OUTLINES, ((PdfObject) (pdfindirectreference)));
	//   52  107:aload_1         
	//   53  108:getstatic       #2251 <Field PdfName PdfName.OUTLINES>
	//   54  111:aload           4
	//   55  113:invokevirtual   #680 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   56  116:return          
		}
	}

	public static final int ALLOW_ASSEMBLY = 1024;
	public static final int ALLOW_COPY = 16;
	public static final int ALLOW_DEGRADED_PRINTING = 4;
	public static final int ALLOW_FILL_IN = 256;
	public static final int ALLOW_MODIFY_ANNOTATIONS = 32;
	public static final int ALLOW_MODIFY_CONTENTS = 8;
	public static final int ALLOW_PRINTING = 2052;
	public static final int ALLOW_SCREENREADERS = 512;
	public static final int AllowAssembly = 1024;
	public static final int AllowCopy = 16;
	public static final int AllowDegradedPrinting = 4;
	public static final int AllowFillIn = 256;
	public static final int AllowModifyAnnotations = 32;
	public static final int AllowModifyContents = 8;
	public static final int AllowPrinting = 2052;
	public static final int AllowScreenReaders = 512;
	protected static Counter COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfWriter);
	public static final int CenterWindow = 0x10000;
	public static final PdfName DID_PRINT;
	public static final PdfName DID_SAVE;
	public static final PdfName DOCUMENT_CLOSE;
	public static final int DO_NOT_ENCRYPT_METADATA = 8;
	public static final int DirectionL2R = 0x400000;
	public static final int DirectionR2L = 0x800000;
	public static final int DisplayDocTitle = 0x20000;
	public static final int EMBEDDED_FILES_ONLY = 24;
	public static final int ENCRYPTION_AES_128 = 2;
	public static final int ENCRYPTION_AES_256 = 3;
	static final int ENCRYPTION_MASK = 7;
	public static final int FitWindow = 32768;
	public static final int GENERATION_MAX = 65535;
	public static final int HideMenubar = 8192;
	public static final int HideToolbar = 4096;
	public static final int HideWindowUI = 16384;
	public static final float NO_SPACE_CHAR_RATIO = 1E+07F;
	public static final int NonFullScreenPageModeUseNone = 0x40000;
	public static final int NonFullScreenPageModeUseOC = 0x200000;
	public static final int NonFullScreenPageModeUseOutlines = 0x80000;
	public static final int NonFullScreenPageModeUseThumbs = 0x100000;
	public static final PdfName PAGE_CLOSE;
	public static final PdfName PAGE_OPEN;
	public static final int PDFX1A2001 = 1;
	public static final int PDFX32002 = 2;
	public static final int PDFXNONE = 0;
	public static final PdfName PDF_VERSION_1_2 = new PdfName("1.2");
	public static final PdfName PDF_VERSION_1_3 = new PdfName("1.3");
	public static final PdfName PDF_VERSION_1_4 = new PdfName("1.4");
	public static final PdfName PDF_VERSION_1_5 = new PdfName("1.5");
	public static final PdfName PDF_VERSION_1_6 = new PdfName("1.6");
	public static final PdfName PDF_VERSION_1_7 = new PdfName("1.7");
	public static final int PageLayoutOneColumn = 2;
	public static final int PageLayoutSinglePage = 1;
	public static final int PageLayoutTwoColumnLeft = 4;
	public static final int PageLayoutTwoColumnRight = 8;
	public static final int PageLayoutTwoPageLeft = 16;
	public static final int PageLayoutTwoPageRight = 32;
	public static final int PageModeFullScreen = 512;
	public static final int PageModeUseAttachments = 2048;
	public static final int PageModeUseNone = 64;
	public static final int PageModeUseOC = 1024;
	public static final int PageModeUseOutlines = 128;
	public static final int PageModeUseThumbs = 256;
	public static final int PrintScalingNone = 0x1000000;
	public static final int RUN_DIRECTION_DEFAULT = 0;
	public static final int RUN_DIRECTION_LTR = 2;
	public static final int RUN_DIRECTION_NO_BIDI = 1;
	public static final int RUN_DIRECTION_RTL = 3;
	public static final int SIGNATURE_APPEND_ONLY = 2;
	public static final int SIGNATURE_EXISTS = 1;
	public static final float SPACE_CHAR_RATIO_DEFAULT = 2.5F;
	public static final int STANDARD_ENCRYPTION_128 = 1;
	public static final int STANDARD_ENCRYPTION_40 = 0;
	public static final boolean STRENGTH128BITS = true;
	public static final boolean STRENGTH40BITS = false;
	public static final char VERSION_1_2 = 50;
	public static final char VERSION_1_3 = 51;
	public static final char VERSION_1_4 = 52;
	public static final char VERSION_1_5 = 53;
	public static final char VERSION_1_6 = 54;
	public static final char VERSION_1_7 = 55;
	public static final PdfName WILL_PRINT;
	public static final PdfName WILL_SAVE;
	public static final int markAll = 0;
	public static final int markInlineElementsOnly = 1;
	private static final List standardStructElems_1_4;
	private static final List standardStructElems_1_7;
	protected HashMap JBIG2Globals;
	protected PdfArray OCGLocked;
	protected PdfArray OCGRadioGroup;
	protected PdfOCProperties OCProperties;
	protected PdfBody body;
	protected int colorNumber;
	protected ICC_Profile colorProfile;
	protected int compressionLevel;
	protected PdfEncryption crypto;
	protected int currentPageNumber;
	protected PdfReaderInstance currentPdfReaderInstance;
	protected PdfDictionary defaultColorspace;
	protected PdfContentByte directContent;
	protected PdfContentByte directContentUnder;
	protected HashMap documentColors;
	protected HashMap documentExtGState;
	protected LinkedHashMap documentFonts;
	protected LinkedHashSet documentOCG;
	protected ArrayList documentOCGorder;
	protected HashMap documentPatterns;
	protected HashMap documentProperties;
	protected HashSet documentShadingPatterns;
	protected HashSet documentShadings;
	protected HashMap documentSpotPatterns;
	protected PdfDictionary extraCatalog;
	protected int fontNumber;
	protected HashMap formXObjects;
	protected int formXObjectsCounter;
	protected boolean fullCompression;
	protected PdfDictionary group;
	protected PdfDictionary imageDictionary;
	private final HashMap images;
	protected List newBookmarks;
	protected byte originalFileID[];
	protected PdfDictionary pageDictEntries;
	private PdfPageEvent pageEvent;
	protected ArrayList pageReferences;
	protected ColorDetails patternColorspaceCMYK;
	protected ColorDetails patternColorspaceGRAY;
	protected ColorDetails patternColorspaceRGB;
	protected int patternNumber;
	protected PdfDocument pdf;
	protected PdfIsoConformance pdfIsoConformance;
	protected PdfVersionImp pdf_version;
	protected long prevxref;
	protected HashMap readerInstances;
	private boolean rgbTransparencyBlending;
	protected PdfPages root;
	protected int runDirection;
	private float spaceCharRatio;
	protected PdfStructureTreeRoot structureTreeRoot;
	protected PdfName tabs;
	protected boolean tagged;
	protected int taggingMode;
	protected TtfUnicodeWriter ttfUnicodeWriter;
	private boolean userProperties;
	protected byte xmpMetadata[];
	protected XmpWriter xmpWriter;

	static 
	{
	//    0    0:ldc1            #2   <Class PdfWriter>
	//    1    2:invokestatic    #267 <Method Counter CounterFactory.getCounter(Class)>
	//    2    5:putstatic       #269 <Field Counter COUNTER>
	//    3    8:new             #271 <Class PdfName>
	//    4   11:dup             
	//    5   12:ldc2            #273 <String "1.2">
	//    6   15:invokespecial   #277 <Method void PdfName(String)>
	//    7   18:putstatic       #279 <Field PdfName PDF_VERSION_1_2>
	//    8   21:new             #271 <Class PdfName>
	//    9   24:dup             
	//   10   25:ldc2            #281 <String "1.3">
	//   11   28:invokespecial   #277 <Method void PdfName(String)>
	//   12   31:putstatic       #283 <Field PdfName PDF_VERSION_1_3>
	//   13   34:new             #271 <Class PdfName>
	//   14   37:dup             
	//   15   38:ldc2            #285 <String "1.4">
	//   16   41:invokespecial   #277 <Method void PdfName(String)>
	//   17   44:putstatic       #287 <Field PdfName PDF_VERSION_1_4>
	//   18   47:new             #271 <Class PdfName>
	//   19   50:dup             
	//   20   51:ldc2            #289 <String "1.5">
	//   21   54:invokespecial   #277 <Method void PdfName(String)>
	//   22   57:putstatic       #291 <Field PdfName PDF_VERSION_1_5>
	//   23   60:new             #271 <Class PdfName>
	//   24   63:dup             
	//   25   64:ldc2            #293 <String "1.6">
	//   26   67:invokespecial   #277 <Method void PdfName(String)>
	//   27   70:putstatic       #295 <Field PdfName PDF_VERSION_1_6>
	//   28   73:new             #271 <Class PdfName>
	//   29   76:dup             
	//   30   77:ldc2            #297 <String "1.7">
	//   31   80:invokespecial   #277 <Method void PdfName(String)>
	//   32   83:putstatic       #299 <Field PdfName PDF_VERSION_1_7>
		DOCUMENT_CLOSE = PdfName.WC;
	//   33   86:getstatic       #302 <Field PdfName PdfName.WC>
	//   34   89:putstatic       #304 <Field PdfName DOCUMENT_CLOSE>
		WILL_SAVE = PdfName.WS;
	//   35   92:getstatic       #307 <Field PdfName PdfName.WS>
	//   36   95:putstatic       #309 <Field PdfName WILL_SAVE>
		DID_SAVE = PdfName.DS;
	//   37   98:getstatic       #312 <Field PdfName PdfName.DS>
	//   38  101:putstatic       #314 <Field PdfName DID_SAVE>
		WILL_PRINT = PdfName.WP;
	//   39  104:getstatic       #317 <Field PdfName PdfName.WP>
	//   40  107:putstatic       #319 <Field PdfName WILL_PRINT>
		DID_PRINT = PdfName.DP;
	//   41  110:getstatic       #322 <Field PdfName PdfName.DP>
	//   42  113:putstatic       #324 <Field PdfName DID_PRINT>
		PAGE_OPEN = PdfName.O;
	//   43  116:getstatic       #327 <Field PdfName PdfName.O>
	//   44  119:putstatic       #329 <Field PdfName PAGE_OPEN>
		PAGE_CLOSE = PdfName.C;
	//   45  122:getstatic       #331 <Field PdfName PdfName.C>
	//   46  125:putstatic       #333 <Field PdfName PAGE_CLOSE>
		standardStructElems_1_4 = Arrays.asList(((Object []) (new PdfName[] {
			PdfName.DOCUMENT, PdfName.PART, PdfName.ART, PdfName.SECT, PdfName.DIV, PdfName.BLOCKQUOTE, PdfName.CAPTION, PdfName.TOC, PdfName.TOCI, PdfName.INDEX, 
			PdfName.NONSTRUCT, PdfName.PRIVATE, PdfName.P, PdfName.H, PdfName.H1, PdfName.H2, PdfName.H3, PdfName.H4, PdfName.H5, PdfName.H6, 
			PdfName.L, PdfName.LBL, PdfName.LI, PdfName.LBODY, PdfName.TABLE, PdfName.TR, PdfName.TH, PdfName.TD, PdfName.SPAN, PdfName.QUOTE, 
			PdfName.NOTE, PdfName.REFERENCE, PdfName.BIBENTRY, PdfName.CODE, PdfName.LINK, PdfName.FIGURE, PdfName.FORMULA, PdfName.FORM
		})));
	//   47  128:bipush          38
	//   48  130:anewarray       PdfName[]
	//   49  133:dup             
	//   50  134:iconst_0        
	//   51  135:getstatic       #336 <Field PdfName PdfName.DOCUMENT>
	//   52  138:aastore         
	//   53  139:dup             
	//   54  140:iconst_1        
	//   55  141:getstatic       #339 <Field PdfName PdfName.PART>
	//   56  144:aastore         
	//   57  145:dup             
	//   58  146:iconst_2        
	//   59  147:getstatic       #342 <Field PdfName PdfName.ART>
	//   60  150:aastore         
	//   61  151:dup             
	//   62  152:iconst_3        
	//   63  153:getstatic       #345 <Field PdfName PdfName.SECT>
	//   64  156:aastore         
	//   65  157:dup             
	//   66  158:iconst_4        
	//   67  159:getstatic       #348 <Field PdfName PdfName.DIV>
	//   68  162:aastore         
	//   69  163:dup             
	//   70  164:iconst_5        
	//   71  165:getstatic       #351 <Field PdfName PdfName.BLOCKQUOTE>
	//   72  168:aastore         
	//   73  169:dup             
	//   74  170:bipush          6
	//   75  172:getstatic       #354 <Field PdfName PdfName.CAPTION>
	//   76  175:aastore         
	//   77  176:dup             
	//   78  177:bipush          7
	//   79  179:getstatic       #357 <Field PdfName PdfName.TOC>
	//   80  182:aastore         
	//   81  183:dup             
	//   82  184:bipush          8
	//   83  186:getstatic       #360 <Field PdfName PdfName.TOCI>
	//   84  189:aastore         
	//   85  190:dup             
	//   86  191:bipush          9
	//   87  193:getstatic       #363 <Field PdfName PdfName.INDEX>
	//   88  196:aastore         
	//   89  197:dup             
	//   90  198:bipush          10
	//   91  200:getstatic       #366 <Field PdfName PdfName.NONSTRUCT>
	//   92  203:aastore         
	//   93  204:dup             
	//   94  205:bipush          11
	//   95  207:getstatic       #369 <Field PdfName PdfName.PRIVATE>
	//   96  210:aastore         
	//   97  211:dup             
	//   98  212:bipush          12
	//   99  214:getstatic       #372 <Field PdfName PdfName.P>
	//  100  217:aastore         
	//  101  218:dup             
	//  102  219:bipush          13
	//  103  221:getstatic       #375 <Field PdfName PdfName.H>
	//  104  224:aastore         
	//  105  225:dup             
	//  106  226:bipush          14
	//  107  228:getstatic       #378 <Field PdfName PdfName.H1>
	//  108  231:aastore         
	//  109  232:dup             
	//  110  233:bipush          15
	//  111  235:getstatic       #381 <Field PdfName PdfName.H2>
	//  112  238:aastore         
	//  113  239:dup             
	//  114  240:bipush          16
	//  115  242:getstatic       #384 <Field PdfName PdfName.H3>
	//  116  245:aastore         
	//  117  246:dup             
	//  118  247:bipush          17
	//  119  249:getstatic       #387 <Field PdfName PdfName.H4>
	//  120  252:aastore         
	//  121  253:dup             
	//  122  254:bipush          18
	//  123  256:getstatic       #390 <Field PdfName PdfName.H5>
	//  124  259:aastore         
	//  125  260:dup             
	//  126  261:bipush          19
	//  127  263:getstatic       #393 <Field PdfName PdfName.H6>
	//  128  266:aastore         
	//  129  267:dup             
	//  130  268:bipush          20
	//  131  270:getstatic       #396 <Field PdfName PdfName.L>
	//  132  273:aastore         
	//  133  274:dup             
	//  134  275:bipush          21
	//  135  277:getstatic       #399 <Field PdfName PdfName.LBL>
	//  136  280:aastore         
	//  137  281:dup             
	//  138  282:bipush          22
	//  139  284:getstatic       #402 <Field PdfName PdfName.LI>
	//  140  287:aastore         
	//  141  288:dup             
	//  142  289:bipush          23
	//  143  291:getstatic       #405 <Field PdfName PdfName.LBODY>
	//  144  294:aastore         
	//  145  295:dup             
	//  146  296:bipush          24
	//  147  298:getstatic       #408 <Field PdfName PdfName.TABLE>
	//  148  301:aastore         
	//  149  302:dup             
	//  150  303:bipush          25
	//  151  305:getstatic       #411 <Field PdfName PdfName.TR>
	//  152  308:aastore         
	//  153  309:dup             
	//  154  310:bipush          26
	//  155  312:getstatic       #414 <Field PdfName PdfName.TH>
	//  156  315:aastore         
	//  157  316:dup             
	//  158  317:bipush          27
	//  159  319:getstatic       #417 <Field PdfName PdfName.TD>
	//  160  322:aastore         
	//  161  323:dup             
	//  162  324:bipush          28
	//  163  326:getstatic       #420 <Field PdfName PdfName.SPAN>
	//  164  329:aastore         
	//  165  330:dup             
	//  166  331:bipush          29
	//  167  333:getstatic       #423 <Field PdfName PdfName.QUOTE>
	//  168  336:aastore         
	//  169  337:dup             
	//  170  338:bipush          30
	//  171  340:getstatic       #426 <Field PdfName PdfName.NOTE>
	//  172  343:aastore         
	//  173  344:dup             
	//  174  345:bipush          31
	//  175  347:getstatic       #429 <Field PdfName PdfName.REFERENCE>
	//  176  350:aastore         
	//  177  351:dup             
	//  178  352:bipush          32
	//  179  354:getstatic       #432 <Field PdfName PdfName.BIBENTRY>
	//  180  357:aastore         
	//  181  358:dup             
	//  182  359:bipush          33
	//  183  361:getstatic       #435 <Field PdfName PdfName.CODE>
	//  184  364:aastore         
	//  185  365:dup             
	//  186  366:bipush          34
	//  187  368:getstatic       #438 <Field PdfName PdfName.LINK>
	//  188  371:aastore         
	//  189  372:dup             
	//  190  373:bipush          35
	//  191  375:getstatic       #441 <Field PdfName PdfName.FIGURE>
	//  192  378:aastore         
	//  193  379:dup             
	//  194  380:bipush          36
	//  195  382:getstatic       #444 <Field PdfName PdfName.FORMULA>
	//  196  385:aastore         
	//  197  386:dup             
	//  198  387:bipush          37
	//  199  389:getstatic       #447 <Field PdfName PdfName.FORM>
	//  200  392:aastore         
	//  201  393:invokestatic    #453 <Method List Arrays.asList(Object[])>
	//  202  396:putstatic       #455 <Field List standardStructElems_1_4>
		standardStructElems_1_7 = Arrays.asList(((Object []) (new PdfName[] {
			PdfName.DOCUMENT, PdfName.PART, PdfName.ART, PdfName.SECT, PdfName.DIV, PdfName.BLOCKQUOTE, PdfName.CAPTION, PdfName.TOC, PdfName.TOCI, PdfName.INDEX, 
			PdfName.NONSTRUCT, PdfName.PRIVATE, PdfName.P, PdfName.H, PdfName.H1, PdfName.H2, PdfName.H3, PdfName.H4, PdfName.H5, PdfName.H6, 
			PdfName.L, PdfName.LBL, PdfName.LI, PdfName.LBODY, PdfName.TABLE, PdfName.TR, PdfName.TH, PdfName.TD, PdfName.THEAD, PdfName.TBODY, 
			PdfName.TFOOT, PdfName.SPAN, PdfName.QUOTE, PdfName.NOTE, PdfName.REFERENCE, PdfName.BIBENTRY, PdfName.CODE, PdfName.LINK, PdfName.ANNOT, PdfName.RUBY, 
			PdfName.RB, PdfName.RT, PdfName.RP, PdfName.WARICHU, PdfName.WT, PdfName.WP, PdfName.FIGURE, PdfName.FORMULA, PdfName.FORM
		})));
	//  203  399:bipush          49
	//  204  401:anewarray       PdfName[]
	//  205  404:dup             
	//  206  405:iconst_0        
	//  207  406:getstatic       #336 <Field PdfName PdfName.DOCUMENT>
	//  208  409:aastore         
	//  209  410:dup             
	//  210  411:iconst_1        
	//  211  412:getstatic       #339 <Field PdfName PdfName.PART>
	//  212  415:aastore         
	//  213  416:dup             
	//  214  417:iconst_2        
	//  215  418:getstatic       #342 <Field PdfName PdfName.ART>
	//  216  421:aastore         
	//  217  422:dup             
	//  218  423:iconst_3        
	//  219  424:getstatic       #345 <Field PdfName PdfName.SECT>
	//  220  427:aastore         
	//  221  428:dup             
	//  222  429:iconst_4        
	//  223  430:getstatic       #348 <Field PdfName PdfName.DIV>
	//  224  433:aastore         
	//  225  434:dup             
	//  226  435:iconst_5        
	//  227  436:getstatic       #351 <Field PdfName PdfName.BLOCKQUOTE>
	//  228  439:aastore         
	//  229  440:dup             
	//  230  441:bipush          6
	//  231  443:getstatic       #354 <Field PdfName PdfName.CAPTION>
	//  232  446:aastore         
	//  233  447:dup             
	//  234  448:bipush          7
	//  235  450:getstatic       #357 <Field PdfName PdfName.TOC>
	//  236  453:aastore         
	//  237  454:dup             
	//  238  455:bipush          8
	//  239  457:getstatic       #360 <Field PdfName PdfName.TOCI>
	//  240  460:aastore         
	//  241  461:dup             
	//  242  462:bipush          9
	//  243  464:getstatic       #363 <Field PdfName PdfName.INDEX>
	//  244  467:aastore         
	//  245  468:dup             
	//  246  469:bipush          10
	//  247  471:getstatic       #366 <Field PdfName PdfName.NONSTRUCT>
	//  248  474:aastore         
	//  249  475:dup             
	//  250  476:bipush          11
	//  251  478:getstatic       #369 <Field PdfName PdfName.PRIVATE>
	//  252  481:aastore         
	//  253  482:dup             
	//  254  483:bipush          12
	//  255  485:getstatic       #372 <Field PdfName PdfName.P>
	//  256  488:aastore         
	//  257  489:dup             
	//  258  490:bipush          13
	//  259  492:getstatic       #375 <Field PdfName PdfName.H>
	//  260  495:aastore         
	//  261  496:dup             
	//  262  497:bipush          14
	//  263  499:getstatic       #378 <Field PdfName PdfName.H1>
	//  264  502:aastore         
	//  265  503:dup             
	//  266  504:bipush          15
	//  267  506:getstatic       #381 <Field PdfName PdfName.H2>
	//  268  509:aastore         
	//  269  510:dup             
	//  270  511:bipush          16
	//  271  513:getstatic       #384 <Field PdfName PdfName.H3>
	//  272  516:aastore         
	//  273  517:dup             
	//  274  518:bipush          17
	//  275  520:getstatic       #387 <Field PdfName PdfName.H4>
	//  276  523:aastore         
	//  277  524:dup             
	//  278  525:bipush          18
	//  279  527:getstatic       #390 <Field PdfName PdfName.H5>
	//  280  530:aastore         
	//  281  531:dup             
	//  282  532:bipush          19
	//  283  534:getstatic       #393 <Field PdfName PdfName.H6>
	//  284  537:aastore         
	//  285  538:dup             
	//  286  539:bipush          20
	//  287  541:getstatic       #396 <Field PdfName PdfName.L>
	//  288  544:aastore         
	//  289  545:dup             
	//  290  546:bipush          21
	//  291  548:getstatic       #399 <Field PdfName PdfName.LBL>
	//  292  551:aastore         
	//  293  552:dup             
	//  294  553:bipush          22
	//  295  555:getstatic       #402 <Field PdfName PdfName.LI>
	//  296  558:aastore         
	//  297  559:dup             
	//  298  560:bipush          23
	//  299  562:getstatic       #405 <Field PdfName PdfName.LBODY>
	//  300  565:aastore         
	//  301  566:dup             
	//  302  567:bipush          24
	//  303  569:getstatic       #408 <Field PdfName PdfName.TABLE>
	//  304  572:aastore         
	//  305  573:dup             
	//  306  574:bipush          25
	//  307  576:getstatic       #411 <Field PdfName PdfName.TR>
	//  308  579:aastore         
	//  309  580:dup             
	//  310  581:bipush          26
	//  311  583:getstatic       #414 <Field PdfName PdfName.TH>
	//  312  586:aastore         
	//  313  587:dup             
	//  314  588:bipush          27
	//  315  590:getstatic       #417 <Field PdfName PdfName.TD>
	//  316  593:aastore         
	//  317  594:dup             
	//  318  595:bipush          28
	//  319  597:getstatic       #458 <Field PdfName PdfName.THEAD>
	//  320  600:aastore         
	//  321  601:dup             
	//  322  602:bipush          29
	//  323  604:getstatic       #461 <Field PdfName PdfName.TBODY>
	//  324  607:aastore         
	//  325  608:dup             
	//  326  609:bipush          30
	//  327  611:getstatic       #464 <Field PdfName PdfName.TFOOT>
	//  328  614:aastore         
	//  329  615:dup             
	//  330  616:bipush          31
	//  331  618:getstatic       #420 <Field PdfName PdfName.SPAN>
	//  332  621:aastore         
	//  333  622:dup             
	//  334  623:bipush          32
	//  335  625:getstatic       #423 <Field PdfName PdfName.QUOTE>
	//  336  628:aastore         
	//  337  629:dup             
	//  338  630:bipush          33
	//  339  632:getstatic       #426 <Field PdfName PdfName.NOTE>
	//  340  635:aastore         
	//  341  636:dup             
	//  342  637:bipush          34
	//  343  639:getstatic       #429 <Field PdfName PdfName.REFERENCE>
	//  344  642:aastore         
	//  345  643:dup             
	//  346  644:bipush          35
	//  347  646:getstatic       #432 <Field PdfName PdfName.BIBENTRY>
	//  348  649:aastore         
	//  349  650:dup             
	//  350  651:bipush          36
	//  351  653:getstatic       #435 <Field PdfName PdfName.CODE>
	//  352  656:aastore         
	//  353  657:dup             
	//  354  658:bipush          37
	//  355  660:getstatic       #438 <Field PdfName PdfName.LINK>
	//  356  663:aastore         
	//  357  664:dup             
	//  358  665:bipush          38
	//  359  667:getstatic       #467 <Field PdfName PdfName.ANNOT>
	//  360  670:aastore         
	//  361  671:dup             
	//  362  672:bipush          39
	//  363  674:getstatic       #470 <Field PdfName PdfName.RUBY>
	//  364  677:aastore         
	//  365  678:dup             
	//  366  679:bipush          40
	//  367  681:getstatic       #473 <Field PdfName PdfName.RB>
	//  368  684:aastore         
	//  369  685:dup             
	//  370  686:bipush          41
	//  371  688:getstatic       #476 <Field PdfName PdfName.RT>
	//  372  691:aastore         
	//  373  692:dup             
	//  374  693:bipush          42
	//  375  695:getstatic       #479 <Field PdfName PdfName.RP>
	//  376  698:aastore         
	//  377  699:dup             
	//  378  700:bipush          43
	//  379  702:getstatic       #482 <Field PdfName PdfName.WARICHU>
	//  380  705:aastore         
	//  381  706:dup             
	//  382  707:bipush          44
	//  383  709:getstatic       #485 <Field PdfName PdfName.WT>
	//  384  712:aastore         
	//  385  713:dup             
	//  386  714:bipush          45
	//  387  716:getstatic       #317 <Field PdfName PdfName.WP>
	//  388  719:aastore         
	//  389  720:dup             
	//  390  721:bipush          46
	//  391  723:getstatic       #441 <Field PdfName PdfName.FIGURE>
	//  392  726:aastore         
	//  393  727:dup             
	//  394  728:bipush          47
	//  395  730:getstatic       #444 <Field PdfName PdfName.FORMULA>
	//  396  733:aastore         
	//  397  734:dup             
	//  398  735:bipush          48
	//  399  737:getstatic       #447 <Field PdfName PdfName.FORM>
	//  400  740:aastore         
	//  401  741:invokestatic    #453 <Method List Arrays.asList(Object[])>
	//  402  744:putstatic       #487 <Field List standardStructElems_1_7>
	//* 403  747:return          
	}
}
