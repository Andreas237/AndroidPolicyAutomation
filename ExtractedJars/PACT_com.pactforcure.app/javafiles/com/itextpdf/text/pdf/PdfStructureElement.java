// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListBody;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.ListLabel;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import com.itextpdf.text.pdf.interfaces.IPdfStructureElement;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfStructureTreeRoot, PdfArray, 
//			PdfNumber, PdfWriter, PdfRectangle, PdfDiv, 
//			PdfPCell, PdfPHeaderCell, PdfString, PdfPTable, 
//			PdfTemplate, PdfNull, PdfAnnotation, PdfObject, 
//			PdfPRow, PdfPTableHeader, PdfPTableFooter, PdfPTableBody, 
//			PdfIndirectReference

public class PdfStructureElement extends PdfDictionary
	implements IPdfStructureElement
{

	protected PdfStructureElement(PdfDictionary pdfdictionary, PdfName pdfname, AccessibleElementId accessibleelementid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void PdfDictionary()>
		elementId = accessibleelementid;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #23  <Field AccessibleElementId elementId>
		if(pdfdictionary instanceof PdfStructureElement)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class PdfStructureElement>
	//*   7   13:ifeq            66
		{
			top = ((PdfStructureElement)pdfdictionary).top;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #2   <Class PdfStructureElement>
	//   11   21:getfield        #25  <Field PdfStructureTreeRoot top>
	//   12   24:putfield        #25  <Field PdfStructureTreeRoot top>
			init(pdfdictionary, pdfname);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokespecial   #29  <Method void init(PdfDictionary, PdfName)>
			parent = (PdfStructureElement)pdfdictionary;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:checkcast       #2   <Class PdfStructureElement>
	//   20   38:putfield        #31  <Field PdfStructureElement parent>
			put(PdfName.P, ((PdfObject) (((PdfStructureElement)pdfdictionary).reference)));
	//   21   41:aload_0         
	//   22   42:getstatic       #36  <Field PdfName PdfName.P>
	//   23   45:aload_1         
	//   24   46:checkcast       #2   <Class PdfStructureElement>
	//   25   49:getfield        #38  <Field PdfIndirectReference reference>
	//   26   52:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
			put(PdfName.TYPE, ((PdfObject) (PdfName.STRUCTELEM)));
	//   27   55:aload_0         
	//   28   56:getstatic       #45  <Field PdfName PdfName.TYPE>
	//   29   59:getstatic       #48  <Field PdfName PdfName.STRUCTELEM>
	//   30   62:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		} else
	//*  31   65:return          
		if(pdfdictionary instanceof PdfStructureTreeRoot)
	//*  32   66:aload_1         
	//*  33   67:instanceof      #50  <Class PdfStructureTreeRoot>
	//*  34   70:ifeq            65
		{
			top = (PdfStructureTreeRoot)pdfdictionary;
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:checkcast       #50  <Class PdfStructureTreeRoot>
	//   38   78:putfield        #25  <Field PdfStructureTreeRoot top>
			init(pdfdictionary, pdfname);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:invokespecial   #29  <Method void init(PdfDictionary, PdfName)>
			put(PdfName.P, ((PdfObject) (((PdfStructureTreeRoot)pdfdictionary).getReference())));
	//   43   87:aload_0         
	//   44   88:getstatic       #36  <Field PdfName PdfName.P>
	//   45   91:aload_1         
	//   46   92:checkcast       #50  <Class PdfStructureTreeRoot>
	//   47   95:invokevirtual   #54  <Method PdfIndirectReference PdfStructureTreeRoot.getReference()>
	//   48   98:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
			put(PdfName.TYPE, ((PdfObject) (PdfName.STRUCTELEM)));
	//   49  101:aload_0         
	//   50  102:getstatic       #45  <Field PdfName PdfName.TYPE>
	//   51  105:getstatic       #48  <Field PdfName PdfName.STRUCTELEM>
	//   52  108:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
			return;
	//   53  111:return          
		}
	}

	public PdfStructureElement(PdfStructureElement pdfstructureelement, PdfName pdfname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void PdfDictionary()>
		top = pdfstructureelement.top;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field PdfStructureTreeRoot top>
	//    5    9:putfield        #25  <Field PdfStructureTreeRoot top>
		init(((PdfDictionary) (pdfstructureelement)), pdfname);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #29  <Method void init(PdfDictionary, PdfName)>
		parent = pdfstructureelement;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #31  <Field PdfStructureElement parent>
		put(PdfName.P, ((PdfObject) (pdfstructureelement.reference)));
	//   13   23:aload_0         
	//   14   24:getstatic       #36  <Field PdfName PdfName.P>
	//   15   27:aload_1         
	//   16   28:getfield        #38  <Field PdfIndirectReference reference>
	//   17   31:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		put(PdfName.TYPE, ((PdfObject) (PdfName.STRUCTELEM)));
	//   18   34:aload_0         
	//   19   35:getstatic       #45  <Field PdfName PdfName.TYPE>
	//   20   38:getstatic       #48  <Field PdfName PdfName.STRUCTELEM>
	//   21   41:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//   22   44:return          
	}

	public PdfStructureElement(PdfStructureTreeRoot pdfstructuretreeroot, PdfName pdfname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void PdfDictionary()>
		top = pdfstructuretreeroot;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field PdfStructureTreeRoot top>
		init(((PdfDictionary) (pdfstructuretreeroot)), pdfname);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #29  <Method void init(PdfDictionary, PdfName)>
		put(PdfName.P, ((PdfObject) (pdfstructuretreeroot.getReference())));
	//    9   15:aload_0         
	//   10   16:getstatic       #36  <Field PdfName PdfName.P>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method PdfIndirectReference PdfStructureTreeRoot.getReference()>
	//   13   23:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		put(PdfName.TYPE, ((PdfObject) (PdfName.STRUCTELEM)));
	//   14   26:aload_0         
	//   15   27:getstatic       #45  <Field PdfName PdfName.TYPE>
	//   16   30:getstatic       #48  <Field PdfName PdfName.STRUCTELEM>
	//   17   33:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//   18   36:return          
	}

	private boolean colorsEqual(PdfArray pdfarray, float af[])
	{
		while(Float.compare(af[0], pdfarray.getAsNumber(0).floatValue()) != 0 || Float.compare(af[1], pdfarray.getAsNumber(1).floatValue()) != 0 || Float.compare(af[2], pdfarray.getAsNumber(2).floatValue()) != 0) 
	//*   0    0:aload_2         
	//*   1    1:iconst_0        
	//*   2    2:faload          
	//*   3    3:aload_1         
	//*   4    4:iconst_0        
	//*   5    5:invokevirtual   #65  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*   6    8:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*   7   11:invokestatic    #77  <Method int Float.compare(float, float)>
	//*   8   14:ifeq            19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	//   11   19:aload_2         
	//   12   20:iconst_1        
	//   13   21:faload          
	//   14   22:aload_1         
	//   15   23:iconst_1        
	//   16   24:invokevirtual   #65  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   17   27:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//   18   30:invokestatic    #77  <Method int Float.compare(float, float)>
	//   19   33:ifne            17
	//   20   36:aload_2         
	//   21   37:iconst_2        
	//   22   38:faload          
	//   23   39:aload_1         
	//   24   40:iconst_2        
	//   25   41:invokevirtual   #65  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   26   44:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//   27   47:invokestatic    #77  <Method int Float.compare(float, float)>
	//   28   50:ifne            17
		return true;
	//   29   53:iconst_1        
	//   30   54:ireturn         
	}

	private PdfObject getParentAttribute(IPdfStructureElement ipdfstructureelement, PdfName pdfname)
	{
		if(ipdfstructureelement == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ipdfstructureelement.getAttribute(pdfname);
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #83  <Method PdfObject IPdfStructureElement.getAttribute(PdfName)>
	//    7   13:areturn         
	}

	private void init(PdfDictionary pdfdictionary, PdfName pdfname)
	{
		PdfObject pdfobject;
		if(!top.getWriter().getStandardStructElems().contains(((Object) (pdfname))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field PdfStructureTreeRoot top>
	//*   2    4:invokevirtual   #87  <Method PdfWriter PdfStructureTreeRoot.getWriter()>
	//*   3    7:invokevirtual   #93  <Method List PdfWriter.getStandardStructElems()>
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #99  <Method boolean List.contains(Object)>
	//*   6   16:ifne            206
		{
			PdfDictionary pdfdictionary1 = top.getAsDict(PdfName.ROLEMAP);
	//    7   19:aload_0         
	//    8   20:getfield        #25  <Field PdfStructureTreeRoot top>
	//    9   23:getstatic       #102 <Field PdfName PdfName.ROLEMAP>
	//   10   26:invokevirtual   #106 <Method PdfDictionary PdfStructureTreeRoot.getAsDict(PdfName)>
	//   11   29:astore_3        
			if(pdfdictionary1 == null || !pdfdictionary1.contains(pdfname))
	//*  12   30:aload_3         
	//*  13   31:ifnull          42
	//*  14   34:aload_3         
	//*  15   35:aload_2         
	//*  16   36:invokevirtual   #109 <Method boolean PdfDictionary.contains(PdfName)>
	//*  17   39:ifne            73
				throw new ExceptionConverter(((Exception) (new DocumentException(MessageLocalization.getComposedMessage("unknown.structure.element.role.1", new Object[] {
					pdfname.toString()
				})))));
	//   18   42:new             #111 <Class ExceptionConverter>
	//   19   45:dup             
	//   20   46:new             #113 <Class DocumentException>
	//   21   49:dup             
	//   22   50:ldc1            #115 <String "unknown.structure.element.role.1">
	//   23   52:iconst_1        
	//   24   53:anewarray       Object[]
	//   25   56:dup             
	//   26   57:iconst_0        
	//   27   58:aload_2         
	//   28   59:invokevirtual   #121 <Method String PdfName.toString()>
	//   29   62:aastore         
	//   30   63:invokestatic    #127 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   66:invokespecial   #130 <Method void DocumentException(String)>
	//   32   69:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   33   72:athrow          
			structureType = pdfdictionary1.getAsName(pdfname);
	//   34   73:aload_0         
	//   35   74:aload_3         
	//   36   75:aload_2         
	//   37   76:invokevirtual   #137 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   38   79:putfield        #139 <Field PdfName structureType>
		} else
	//*  39   82:aload_1         
	//*  40   83:getstatic       #142 <Field PdfName PdfName.K>
	//*  41   86:invokevirtual   #145 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  42   89:astore          4
	//*  43   91:aload           4
	//*  44   93:ifnonnull       214
	//*  45   96:new             #61  <Class PdfArray>
	//*  46   99:dup             
	//*  47  100:invokespecial   #146 <Method void PdfArray()>
	//*  48  103:astore_3        
	//*  49  104:aload_1         
	//*  50  105:getstatic       #142 <Field PdfName PdfName.K>
	//*  51  108:aload_3         
	//*  52  109:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  53  112:aload_3         
	//*  54  113:astore_1        
	//*  55  114:aload_1         
	//*  56  115:invokevirtual   #151 <Method int PdfArray.size()>
	//*  57  118:ifle            174
	//*  58  121:aload_1         
	//*  59  122:iconst_0        
	//*  60  123:invokevirtual   #65  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  61  126:ifnull          135
	//*  62  129:aload_1         
	//*  63  130:iconst_0        
	//*  64  131:invokevirtual   #155 <Method PdfObject PdfArray.remove(int)>
	//*  65  134:pop             
	//*  66  135:aload_1         
	//*  67  136:invokevirtual   #151 <Method int PdfArray.size()>
	//*  68  139:ifle            174
	//*  69  142:aload_1         
	//*  70  143:iconst_0        
	//*  71  144:invokevirtual   #158 <Method PdfDictionary PdfArray.getAsDict(int)>
	//*  72  147:astore_3        
	//*  73  148:aload_3         
	//*  74  149:ifnull          174
	//*  75  152:getstatic       #161 <Field PdfName PdfName.MCR>
	//*  76  155:aload_3         
	//*  77  156:getstatic       #45  <Field PdfName PdfName.TYPE>
	//*  78  159:invokevirtual   #137 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  79  162:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  80  165:ifeq            174
	//*  81  168:aload_1         
	//*  82  169:iconst_0        
	//*  83  170:invokevirtual   #155 <Method PdfObject PdfArray.remove(int)>
	//*  84  173:pop             
	//*  85  174:aload_0         
	//*  86  175:getstatic       #167 <Field PdfName PdfName.S>
	//*  87  178:aload_2         
	//*  88  179:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  89  182:aload_0         
	//*  90  183:aload_0         
	//*  91  184:getfield        #25  <Field PdfStructureTreeRoot top>
	//*  92  187:invokevirtual   #87  <Method PdfWriter PdfStructureTreeRoot.getWriter()>
	//*  93  190:invokevirtual   #170 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//*  94  193:putfield        #38  <Field PdfIndirectReference reference>
	//*  95  196:aload_1         
	//*  96  197:aload_0         
	//*  97  198:getfield        #38  <Field PdfIndirectReference reference>
	//*  98  201:invokevirtual   #174 <Method boolean PdfArray.add(PdfObject)>
	//*  99  204:pop             
	//* 100  205:return          
		{
			structureType = pdfname;
	//  101  206:aload_0         
	//  102  207:aload_2         
	//  103  208:putfield        #139 <Field PdfName structureType>
		}
		pdfobject = pdfdictionary.get(PdfName.K);
		if(pdfobject == null)
		{
			PdfArray pdfarray = new PdfArray();
			pdfdictionary.put(PdfName.K, ((PdfObject) (pdfarray)));
			pdfdictionary = ((PdfDictionary) (pdfarray));
		} else
	//* 104  211:goto            82
		if(pdfobject instanceof PdfArray)
	//* 105  214:aload           4
	//* 106  216:instanceof      #61  <Class PdfArray>
	//* 107  219:ifeq            231
		{
			pdfdictionary = ((PdfDictionary) ((PdfArray)pdfobject));
	//  108  222:aload           4
	//  109  224:checkcast       #61  <Class PdfArray>
	//  110  227:astore_1        
		} else
	//* 111  228:goto            114
		{
			PdfArray pdfarray1 = new PdfArray();
	//  112  231:new             #61  <Class PdfArray>
	//  113  234:dup             
	//  114  235:invokespecial   #146 <Method void PdfArray()>
	//  115  238:astore_3        
			pdfarray1.add(pdfobject);
	//  116  239:aload_3         
	//  117  240:aload           4
	//  118  242:invokevirtual   #174 <Method boolean PdfArray.add(PdfObject)>
	//  119  245:pop             
			pdfdictionary.put(PdfName.K, ((PdfObject) (pdfarray1)));
	//  120  246:aload_1         
	//  121  247:getstatic       #142 <Field PdfName PdfName.K>
	//  122  250:aload_3         
	//  123  251:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary = ((PdfDictionary) (pdfarray1));
	//  124  254:aload_3         
	//  125  255:astore_1        
		}
		if(((PdfArray) (pdfdictionary)).size() > 0)
		{
			if(((PdfArray) (pdfdictionary)).getAsNumber(0) != null)
				((PdfArray) (pdfdictionary)).remove(0);
			if(((PdfArray) (pdfdictionary)).size() > 0)
			{
				PdfDictionary pdfdictionary2 = ((PdfArray) (pdfdictionary)).getAsDict(0);
				if(pdfdictionary2 != null && PdfName.MCR.equals(((Object) (pdfdictionary2.getAsName(PdfName.TYPE)))))
					((PdfArray) (pdfdictionary)).remove(0);
			}
		}
		put(PdfName.S, ((PdfObject) (pdfname)));
		reference = top.getWriter().getPdfIndirectReference();
		((PdfArray) (pdfdictionary)).add(((PdfObject) (reference)));
	//* 126  256:goto            114
	}

	private void setColorAttribute(BaseColor basecolor, PdfObject pdfobject, PdfName pdfname)
	{
		float af[] = new float[3];
	//    0    0:iconst_3        
	//    1    1:newarray        float[]
	//    2    3:astore          4
		af[0] = (float)basecolor.getRed() / 255F;
	//    3    5:aload           4
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:invokevirtual   #181 <Method int BaseColor.getRed()>
	//    7   12:i2f             
	//    8   13:ldc1            #182 <Float 255F>
	//    9   15:fdiv            
	//   10   16:fastore         
		af[1] = (float)basecolor.getGreen() / 255F;
	//   11   17:aload           4
	//   12   19:iconst_1        
	//   13   20:aload_1         
	//   14   21:invokevirtual   #185 <Method int BaseColor.getGreen()>
	//   15   24:i2f             
	//   16   25:ldc1            #182 <Float 255F>
	//   17   27:fdiv            
	//   18   28:fastore         
		af[2] = (float)basecolor.getBlue() / 255F;
	//   19   29:aload           4
	//   20   31:iconst_2        
	//   21   32:aload_1         
	//   22   33:invokevirtual   #188 <Method int BaseColor.getBlue()>
	//   23   36:i2f             
	//   24   37:ldc1            #182 <Float 255F>
	//   25   39:fdiv            
	//   26   40:fastore         
		if(pdfobject != null && (pdfobject instanceof PdfArray))
	//*  27   41:aload_2         
	//*  28   42:ifnull          95
	//*  29   45:aload_2         
	//*  30   46:instanceof      #61  <Class PdfArray>
	//*  31   49:ifeq            95
		{
			if(colorsEqual((PdfArray)pdfobject, af))
	//*  32   52:aload_0         
	//*  33   53:aload_2         
	//*  34   54:checkcast       #61  <Class PdfArray>
	//*  35   57:aload           4
	//*  36   59:invokespecial   #190 <Method boolean colorsEqual(PdfArray, float[])>
	//*  37   62:ifeq            80
			{
				setAttribute(pdfname, ((PdfObject) (new PdfArray(af))));
	//   38   65:aload_0         
	//   39   66:aload_3         
	//   40   67:new             #61  <Class PdfArray>
	//   41   70:dup             
	//   42   71:aload           4
	//   43   73:invokespecial   #193 <Method void PdfArray(float[])>
	//   44   76:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
				return;
	//   45   79:return          
			} else
			{
				setAttribute(pdfname, ((PdfObject) (new PdfArray(af))));
	//   46   80:aload_0         
	//   47   81:aload_3         
	//   48   82:new             #61  <Class PdfArray>
	//   49   85:dup             
	//   50   86:aload           4
	//   51   88:invokespecial   #193 <Method void PdfArray(float[])>
	//   52   91:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
				return;
	//   53   94:return          
			}
		} else
		{
			setAttribute(pdfname, ((PdfObject) (new PdfArray(af))));
	//   54   95:aload_0         
	//   55   96:aload_3         
	//   56   97:new             #61  <Class PdfArray>
	//   57  100:dup             
	//   58  101:aload           4
	//   59  103:invokespecial   #193 <Method void PdfArray(float[])>
	//   60  106:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			return;
	//   61  109:return          
		}
	}

	private void setTextAlignAttribute(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		i;
	//    2    2:iload_1         
		JVM INSTR tableswitch 0 3: default 32
	//	               0 77
	//	               1 84
	//	               2 91
	//	               3 98;
	//    3    3:tableswitch     0 3: default 32
	//	               0 77
	//	               1 84
	//	               2 91
	//	               3 98
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		Object obj1 = ((Object) (getParentAttribute(((IPdfStructureElement) (parent)), PdfName.TEXTALIGN)));
	//    4   32:aload_0         
	//    5   33:aload_0         
	//    6   34:getfield        #31  <Field PdfStructureElement parent>
	//    7   37:getstatic       #201 <Field PdfName PdfName.TEXTALIGN>
	//    8   40:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//    9   43:astore_3        
		if(!(obj1 instanceof PdfName)) goto _L7; else goto _L6
	//   10   44:aload_3         
	//   11   45:instanceof      #33  <Class PdfName>
	//   12   48:ifeq            105
_L6:
		obj1 = ((Object) ((PdfName)obj1));
	//   13   51:aload_3         
	//   14   52:checkcast       #33  <Class PdfName>
	//   15   55:astore_3        
		if(obj != null && !((PdfName) (obj1)).equals(obj))
	//*  16   56:aload_2         
	//*  17   57:ifnull          76
	//*  18   60:aload_3         
	//*  19   61:aload_2         
	//*  20   62:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  21   65:ifne            76
			setAttribute(PdfName.TEXTALIGN, ((PdfObject) (obj)));
	//   22   68:aload_0         
	//   23   69:getstatic       #201 <Field PdfName PdfName.TEXTALIGN>
	//   24   72:aload_2         
	//   25   73:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
_L9:
		return;
	//   26   76:return          
_L2:
		obj = ((Object) (PdfName.START));
	//   27   77:getstatic       #206 <Field PdfName PdfName.START>
	//   28   80:astore_2        
		continue; /* Loop/switch isn't completed */
	//   29   81:goto            32
_L3:
		obj = ((Object) (PdfName.CENTER));
	//   30   84:getstatic       #209 <Field PdfName PdfName.CENTER>
	//   31   87:astore_2        
		continue; /* Loop/switch isn't completed */
	//   32   88:goto            32
_L4:
		obj = ((Object) (PdfName.END));
	//   33   91:getstatic       #212 <Field PdfName PdfName.END>
	//   34   94:astore_2        
		continue; /* Loop/switch isn't completed */
	//   35   95:goto            32
_L5:
		obj = ((Object) (PdfName.JUSTIFY));
	//   36   98:getstatic       #215 <Field PdfName PdfName.JUSTIFY>
	//   37  101:astore_2        
		continue; /* Loop/switch isn't completed */
	//   38  102:goto            32
_L7:
		if(obj == null || PdfName.START.equals(obj)) goto _L9; else goto _L8
	//   39  105:aload_2         
	//   40  106:ifnull          76
	//   41  109:getstatic       #206 <Field PdfName PdfName.START>
	//   42  112:aload_2         
	//   43  113:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//   44  116:ifne            76
_L8:
		setAttribute(PdfName.TEXTALIGN, ((PdfObject) (obj)));
	//   45  119:aload_0         
	//   46  120:getstatic       #201 <Field PdfName PdfName.TEXTALIGN>
	//   47  123:aload_2         
	//   48  124:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		return;
	//   49  127:return          
		if(true) goto _L1; else goto _L10
_L10:
	}

	private void writeAttributes(Chunk chunk)
	{
		if(chunk != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
			if(chunk.getImage() != null)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #223 <Method Image Chunk.getImage()>
	//*   4    8:ifnull          20
			{
				writeAttributes(chunk.getImage());
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #223 <Method Image Chunk.getImage()>
	//    8   16:invokespecial   #226 <Method void writeAttributes(Image)>
			} else
	//*   9   19:return          
			{
				HashMap hashmap = chunk.getAttributes();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #230 <Method HashMap Chunk.getAttributes()>
	//   12   24:astore_3        
				if(hashmap != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          19
				{
					setAttribute(PdfName.O, ((PdfObject) (PdfName.LAYOUT)));
	//   15   29:aload_0         
	//   16   30:getstatic       #233 <Field PdfName PdfName.O>
	//   17   33:getstatic       #236 <Field PdfName PdfName.LAYOUT>
	//   18   36:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
					if(hashmap.containsKey("UNDERLINE"))
	//*  19   39:aload_3         
	//*  20   40:ldc1            #238 <String "UNDERLINE">
	//*  21   42:invokevirtual   #243 <Method boolean HashMap.containsKey(Object)>
	//*  22   45:ifeq            58
						setAttribute(PdfName.TEXTDECORATIONTYPE, ((PdfObject) (PdfName.UNDERLINE)));
	//   23   48:aload_0         
	//   24   49:getstatic       #246 <Field PdfName PdfName.TEXTDECORATIONTYPE>
	//   25   52:getstatic       #248 <Field PdfName PdfName.UNDERLINE>
	//   26   55:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
					if(hashmap.containsKey("BACKGROUND"))
	//*  27   58:aload_3         
	//*  28   59:ldc1            #250 <String "BACKGROUND">
	//*  29   61:invokevirtual   #243 <Method boolean HashMap.containsKey(Object)>
	//*  30   64:ifeq            139
					{
						BaseColor basecolor = (BaseColor)((Object[])(Object[])hashmap.get("BACKGROUND"))[0];
	//   31   67:aload_3         
	//   32   68:ldc1            #250 <String "BACKGROUND">
	//   33   70:invokevirtual   #253 <Method Object HashMap.get(Object)>
	//   34   73:checkcast       #255 <Class Object[]>
	//   35   76:checkcast       #255 <Class Object[]>
	//   36   79:iconst_0        
	//   37   80:aaload          
	//   38   81:checkcast       #178 <Class BaseColor>
	//   39   84:astore          4
						setAttribute(PdfName.BACKGROUNDCOLOR, ((PdfObject) (new PdfArray(new float[] {
							(float)basecolor.getRed() / 255F, (float)basecolor.getGreen() / 255F, (float)basecolor.getBlue() / 255F
						}))));
	//   40   86:aload_0         
	//   41   87:getstatic       #258 <Field PdfName PdfName.BACKGROUNDCOLOR>
	//   42   90:new             #61  <Class PdfArray>
	//   43   93:dup             
	//   44   94:iconst_3        
	//   45   95:newarray        float[]
	//   46   97:dup             
	//   47   98:iconst_0        
	//   48   99:aload           4
	//   49  101:invokevirtual   #181 <Method int BaseColor.getRed()>
	//   50  104:i2f             
	//   51  105:ldc1            #182 <Float 255F>
	//   52  107:fdiv            
	//   53  108:fastore         
	//   54  109:dup             
	//   55  110:iconst_1        
	//   56  111:aload           4
	//   57  113:invokevirtual   #185 <Method int BaseColor.getGreen()>
	//   58  116:i2f             
	//   59  117:ldc1            #182 <Float 255F>
	//   60  119:fdiv            
	//   61  120:fastore         
	//   62  121:dup             
	//   63  122:iconst_2        
	//   64  123:aload           4
	//   65  125:invokevirtual   #188 <Method int BaseColor.getBlue()>
	//   66  128:i2f             
	//   67  129:ldc1            #182 <Float 255F>
	//   68  131:fdiv            
	//   69  132:fastore         
	//   70  133:invokespecial   #193 <Method void PdfArray(float[])>
	//   71  136:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
					}
					IPdfStructureElement ipdfstructureelement = (IPdfStructureElement)getParent(true);
	//   72  139:aload_0         
	//   73  140:iconst_1        
	//   74  141:invokevirtual   #262 <Method PdfDictionary getParent(boolean)>
	//   75  144:checkcast       #6   <Class IPdfStructureElement>
	//   76  147:astore          4
					PdfObject pdfobject = getParentAttribute(ipdfstructureelement, PdfName.COLOR);
	//   77  149:aload_0         
	//   78  150:aload           4
	//   79  152:getstatic       #265 <Field PdfName PdfName.COLOR>
	//   80  155:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//   81  158:astore          5
					if(chunk.getFont() != null && chunk.getFont().getColor() != null)
	//*  82  160:aload_1         
	//*  83  161:invokevirtual   #269 <Method Font Chunk.getFont()>
	//*  84  164:ifnull          193
	//*  85  167:aload_1         
	//*  86  168:invokevirtual   #269 <Method Font Chunk.getFont()>
	//*  87  171:invokevirtual   #275 <Method BaseColor Font.getColor()>
	//*  88  174:ifnull          193
						setColorAttribute(chunk.getFont().getColor(), pdfobject, PdfName.COLOR);
	//   89  177:aload_0         
	//   90  178:aload_1         
	//   91  179:invokevirtual   #269 <Method Font Chunk.getFont()>
	//   92  182:invokevirtual   #275 <Method BaseColor Font.getColor()>
	//   93  185:aload           5
	//   94  187:getstatic       #265 <Field PdfName PdfName.COLOR>
	//   95  190:invokespecial   #277 <Method void setColorAttribute(BaseColor, PdfObject, PdfName)>
					chunk = ((Chunk) (getParentAttribute(ipdfstructureelement, PdfName.TEXTDECORATIONTHICKNESS)));
	//   96  193:aload_0         
	//   97  194:aload           4
	//   98  196:getstatic       #280 <Field PdfName PdfName.TEXTDECORATIONTHICKNESS>
	//   99  199:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//  100  202:astore_1        
					pdfobject = getParentAttribute(ipdfstructureelement, PdfName.TEXTDECORATIONCOLOR);
	//  101  203:aload_0         
	//  102  204:aload           4
	//  103  206:getstatic       #283 <Field PdfName PdfName.TEXTDECORATIONCOLOR>
	//  104  209:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//  105  212:astore          5
					float f;
					if(hashmap.containsKey("UNDERLINE"))
	//* 106  214:aload_3         
	//* 107  215:ldc1            #238 <String "UNDERLINE">
	//* 108  217:invokevirtual   #243 <Method boolean HashMap.containsKey(Object)>
	//* 109  220:ifeq            321
					{
						Object aobj[][] = (Object[][])(Object[][])hashmap.get("UNDERLINE");
	//  110  223:aload_3         
	//  111  224:ldc1            #238 <String "UNDERLINE">
	//  112  226:invokevirtual   #253 <Method Object HashMap.get(Object)>
	//  113  229:checkcast       #285 <Class Object[][]>
	//  114  232:checkcast       #285 <Class Object[][]>
	//  115  235:astore          6
						aobj = ((Object [][]) (aobj[aobj.length - 1]));
	//  116  237:aload           6
	//  117  239:aload           6
	//  118  241:arraylength     
	//  119  242:iconst_1        
	//  120  243:isub            
	//  121  244:aaload          
	//  122  245:astore          6
						BaseColor basecolor1 = (BaseColor)aobj[0];
	//  123  247:aload           6
	//  124  249:iconst_0        
	//  125  250:aaload          
	//  126  251:checkcast       #178 <Class BaseColor>
	//  127  254:astore          7
						f = ((float[])(float[])aobj[1])[0];
	//  128  256:aload           6
	//  129  258:iconst_1        
	//  130  259:aaload          
	//  131  260:checkcast       #287 <Class float[]>
	//  132  263:checkcast       #287 <Class float[]>
	//  133  266:iconst_0        
	//  134  267:faload          
	//  135  268:fstore_2        
						if(chunk instanceof PdfNumber)
	//* 136  269:aload_1         
	//* 137  270:instanceof      #67  <Class PdfNumber>
	//* 138  273:ifeq            392
						{
							if(Float.compare(f, ((PdfNumber)chunk).floatValue()) != 0)
	//* 139  276:fload_2         
	//* 140  277:aload_1         
	//* 141  278:checkcast       #67  <Class PdfNumber>
	//* 142  281:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//* 143  284:invokestatic    #77  <Method int Float.compare(float, float)>
	//* 144  287:ifeq            305
								setAttribute(PdfName.TEXTDECORATIONTHICKNESS, ((PdfObject) (new PdfNumber(f))));
	//  145  290:aload_0         
	//  146  291:getstatic       #280 <Field PdfName PdfName.TEXTDECORATIONTHICKNESS>
	//  147  294:new             #67  <Class PdfNumber>
	//  148  297:dup             
	//  149  298:fload_2         
	//  150  299:invokespecial   #290 <Method void PdfNumber(float)>
	//  151  302:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
						} else
	//* 152  305:aload           7
	//* 153  307:ifnull          321
	//* 154  310:aload_0         
	//* 155  311:aload           7
	//* 156  313:aload           5
	//* 157  315:getstatic       #283 <Field PdfName PdfName.TEXTDECORATIONCOLOR>
	//* 158  318:invokespecial   #277 <Method void setColorAttribute(BaseColor, PdfObject, PdfName)>
	//* 159  321:aload_3         
	//* 160  322:ldc2            #292 <String "LINEHEIGHT">
	//* 161  325:invokevirtual   #243 <Method boolean HashMap.containsKey(Object)>
	//* 162  328:ifeq            19
	//* 163  331:aload_3         
	//* 164  332:ldc2            #292 <String "LINEHEIGHT">
	//* 165  335:invokevirtual   #253 <Method Object HashMap.get(Object)>
	//* 166  338:checkcast       #73  <Class Float>
	//* 167  341:invokevirtual   #293 <Method float Float.floatValue()>
	//* 168  344:fstore_2        
	//* 169  345:aload_0         
	//* 170  346:aload           4
	//* 171  348:getstatic       #295 <Field PdfName PdfName.LINEHEIGHT>
	//* 172  351:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//* 173  354:astore_1        
	//* 174  355:aload_1         
	//* 175  356:instanceof      #67  <Class PdfNumber>
	//* 176  359:ifeq            410
	//* 177  362:aload_1         
	//* 178  363:checkcast       #67  <Class PdfNumber>
	//* 179  366:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//* 180  369:fload_2         
	//* 181  370:invokestatic    #77  <Method int Float.compare(float, float)>
	//* 182  373:ifeq            19
	//* 183  376:aload_0         
	//* 184  377:getstatic       #295 <Field PdfName PdfName.LINEHEIGHT>
	//* 185  380:new             #67  <Class PdfNumber>
	//* 186  383:dup             
	//* 187  384:fload_2         
	//* 188  385:invokespecial   #290 <Method void PdfNumber(float)>
	//* 189  388:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//* 190  391:return          
						{
							setAttribute(PdfName.TEXTDECORATIONTHICKNESS, ((PdfObject) (new PdfNumber(f))));
	//  191  392:aload_0         
	//  192  393:getstatic       #280 <Field PdfName PdfName.TEXTDECORATIONTHICKNESS>
	//  193  396:new             #67  <Class PdfNumber>
	//  194  399:dup             
	//  195  400:fload_2         
	//  196  401:invokespecial   #290 <Method void PdfNumber(float)>
	//  197  404:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
						}
						if(basecolor1 != null)
							setColorAttribute(basecolor1, pdfobject, PdfName.TEXTDECORATIONCOLOR);
					}
					if(hashmap.containsKey("LINEHEIGHT"))
					{
						f = ((Float)hashmap.get("LINEHEIGHT")).floatValue();
						chunk = ((Chunk) (getParentAttribute(ipdfstructureelement, PdfName.LINEHEIGHT)));
						if(chunk instanceof PdfNumber)
						{
							if(Float.compare(((PdfNumber)chunk).floatValue(), f) != 0)
							{
								setAttribute(PdfName.LINEHEIGHT, ((PdfObject) (new PdfNumber(f))));
								return;
							}
						} else
	//* 198  407:goto            305
						{
							setAttribute(PdfName.LINEHEIGHT, ((PdfObject) (new PdfNumber(f))));
	//  199  410:aload_0         
	//  200  411:getstatic       #295 <Field PdfName PdfName.LINEHEIGHT>
	//  201  414:new             #67  <Class PdfNumber>
	//  202  417:dup             
	//  203  418:fload_2         
	//  204  419:invokespecial   #290 <Method void PdfNumber(float)>
	//  205  422:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
							return;
	//  206  425:return          
						}
					}
				}
			}
	}

	private void writeAttributes(Document document)
	{
		if(document == null);
	//    0    0:aload_1         
	//    1    1:ifnull          4
	//    2    4:return          
	}

	private void writeAttributes(Image image)
	{
		if(image != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          151
		{
			setAttribute(PdfName.O, ((PdfObject) (PdfName.LAYOUT)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #236 <Field PdfName PdfName.LAYOUT>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(image.getWidth() > 0.0F)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #301 <Method float Image.getWidth()>
	//*   8   18:fconst_0        
	//*   9   19:fcmpl           
	//*  10   20:ifle            41
				setAttribute(PdfName.WIDTH, ((PdfObject) (new PdfNumber(image.getWidth()))));
	//   11   23:aload_0         
	//   12   24:getstatic       #304 <Field PdfName PdfName.WIDTH>
	//   13   27:new             #67  <Class PdfNumber>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokevirtual   #301 <Method float Image.getWidth()>
	//   17   35:invokespecial   #290 <Method void PdfNumber(float)>
	//   18   38:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(image.getHeight() > 0.0F)
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #307 <Method float Image.getHeight()>
	//*  21   45:fconst_0        
	//*  22   46:fcmpl           
	//*  23   47:ifle            68
				setAttribute(PdfName.HEIGHT, ((PdfObject) (new PdfNumber(image.getHeight()))));
	//   24   50:aload_0         
	//   25   51:getstatic       #310 <Field PdfName PdfName.HEIGHT>
	//   26   54:new             #67  <Class PdfNumber>
	//   27   57:dup             
	//   28   58:aload_1         
	//   29   59:invokevirtual   #307 <Method float Image.getHeight()>
	//   30   62:invokespecial   #290 <Method void PdfNumber(float)>
	//   31   65:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			PdfRectangle pdfrectangle = new PdfRectangle(((com.itextpdf.text.Rectangle) (image)), image.getRotation());
	//   32   68:new             #312 <Class PdfRectangle>
	//   33   71:dup             
	//   34   72:aload_1         
	//   35   73:aload_1         
	//   36   74:invokevirtual   #315 <Method int Image.getRotation()>
	//   37   77:invokespecial   #318 <Method void PdfRectangle(com.itextpdf.text.Rectangle, int)>
	//   38   80:astore_2        
			setAttribute(PdfName.BBOX, ((PdfObject) (pdfrectangle)));
	//   39   81:aload_0         
	//   40   82:getstatic       #321 <Field PdfName PdfName.BBOX>
	//   41   85:aload_2         
	//   42   86:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(image.getBackgroundColor() != null)
	//*  43   89:aload_1         
	//*  44   90:invokevirtual   #324 <Method BaseColor Image.getBackgroundColor()>
	//*  45   93:ifnull          151
			{
				image = ((Image) (image.getBackgroundColor()));
	//   46   96:aload_1         
	//   47   97:invokevirtual   #324 <Method BaseColor Image.getBackgroundColor()>
	//   48  100:astore_1        
				setAttribute(PdfName.BACKGROUNDCOLOR, ((PdfObject) (new PdfArray(new float[] {
					(float)((BaseColor) (image)).getRed() / 255F, (float)((BaseColor) (image)).getGreen() / 255F, (float)((BaseColor) (image)).getBlue() / 255F
				}))));
	//   49  101:aload_0         
	//   50  102:getstatic       #258 <Field PdfName PdfName.BACKGROUNDCOLOR>
	//   51  105:new             #61  <Class PdfArray>
	//   52  108:dup             
	//   53  109:iconst_3        
	//   54  110:newarray        float[]
	//   55  112:dup             
	//   56  113:iconst_0        
	//   57  114:aload_1         
	//   58  115:invokevirtual   #181 <Method int BaseColor.getRed()>
	//   59  118:i2f             
	//   60  119:ldc1            #182 <Float 255F>
	//   61  121:fdiv            
	//   62  122:fastore         
	//   63  123:dup             
	//   64  124:iconst_1        
	//   65  125:aload_1         
	//   66  126:invokevirtual   #185 <Method int BaseColor.getGreen()>
	//   67  129:i2f             
	//   68  130:ldc1            #182 <Float 255F>
	//   69  132:fdiv            
	//   70  133:fastore         
	//   71  134:dup             
	//   72  135:iconst_2        
	//   73  136:aload_1         
	//   74  137:invokevirtual   #188 <Method int BaseColor.getBlue()>
	//   75  140:i2f             
	//   76  141:ldc1            #182 <Float 255F>
	//   77  143:fdiv            
	//   78  144:fastore         
	//   79  145:invokespecial   #193 <Method void PdfArray(float[])>
	//   80  148:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			}
		}
	//   81  151:return          
	}

	private void writeAttributes(com.itextpdf.text.List list)
	{
		if(list == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          160
_L1:
		setAttribute(PdfName.O, ((PdfObject) (PdfName.LIST)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #328 <Field PdfName PdfName.LIST>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		if(!list.isAutoindent()) goto _L4; else goto _L3
	//    6   14:aload_1         
	//    7   15:invokevirtual   #334 <Method boolean com.itextpdf.text.List.isAutoindent()>
	//    8   18:ifeq            52
_L3:
		if(!list.isNumbered()) goto _L6; else goto _L5
	//    9   21:aload_1         
	//   10   22:invokevirtual   #337 <Method boolean com.itextpdf.text.List.isNumbered()>
	//   11   25:ifeq            187
_L5:
		PdfObject pdfobject;
		if(list.isLettered())
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #340 <Method boolean com.itextpdf.text.List.isLettered()>
	//*  14   32:ifeq            174
		{
			if(list.isLowercase())
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #343 <Method boolean com.itextpdf.text.List.isLowercase()>
	//*  17   39:ifeq            161
				setAttribute(PdfName.LISTNUMBERING, ((PdfObject) (PdfName.LOWERROMAN)));
	//   18   42:aload_0         
	//   19   43:getstatic       #346 <Field PdfName PdfName.LISTNUMBERING>
	//   20   46:getstatic       #349 <Field PdfName PdfName.LOWERROMAN>
	//   21   49:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			else
	//*  22   52:aload_0         
	//*  23   53:aload_0         
	//*  24   54:getfield        #31  <Field PdfStructureElement parent>
	//*  25   57:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//*  26   60:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//*  27   63:astore_2        
	//*  28   64:aload_2         
	//*  29   65:instanceof      #67  <Class PdfNumber>
	//*  30   68:ifeq            227
	//*  31   71:aload_2         
	//*  32   72:checkcast       #67  <Class PdfNumber>
	//*  33   75:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  34   78:aload_1         
	//*  35   79:invokevirtual   #355 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//*  36   82:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  37   85:ifeq            106
	//*  38   88:aload_0         
	//*  39   89:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//*  40   92:new             #67  <Class PdfNumber>
	//*  41   95:dup             
	//*  42   96:aload_1         
	//*  43   97:invokevirtual   #355 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//*  44  100:invokespecial   #290 <Method void PdfNumber(float)>
	//*  45  103:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//*  46  106:aload_0         
	//*  47  107:aload_0         
	//*  48  108:getfield        #31  <Field PdfStructureElement parent>
	//*  49  111:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//*  50  114:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//*  51  117:astore_2        
	//*  52  118:aload_2         
	//*  53  119:instanceof      #67  <Class PdfNumber>
	//*  54  122:ifeq            262
	//*  55  125:aload_2         
	//*  56  126:checkcast       #67  <Class PdfNumber>
	//*  57  129:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  58  132:aload_1         
	//*  59  133:invokevirtual   #361 <Method float com.itextpdf.text.List.getIndentationRight()>
	//*  60  136:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  61  139:ifeq            160
	//*  62  142:aload_0         
	//*  63  143:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//*  64  146:new             #67  <Class PdfNumber>
	//*  65  149:dup             
	//*  66  150:aload_1         
	//*  67  151:invokevirtual   #361 <Method float com.itextpdf.text.List.getIndentationRight()>
	//*  68  154:invokespecial   #290 <Method void PdfNumber(float)>
	//*  69  157:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//*  70  160:return          
				setAttribute(PdfName.LISTNUMBERING, ((PdfObject) (PdfName.UPPERROMAN)));
	//   71  161:aload_0         
	//   72  162:getstatic       #346 <Field PdfName PdfName.LISTNUMBERING>
	//   73  165:getstatic       #364 <Field PdfName PdfName.UPPERROMAN>
	//   74  168:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		} else
	//*  75  171:goto            52
		{
			setAttribute(PdfName.LISTNUMBERING, ((PdfObject) (PdfName.DECIMAL)));
	//   76  174:aload_0         
	//   77  175:getstatic       #346 <Field PdfName PdfName.LISTNUMBERING>
	//   78  178:getstatic       #367 <Field PdfName PdfName.DECIMAL>
	//   79  181:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		}
_L4:
		pdfobject = getParentAttribute(((IPdfStructureElement) (parent)), PdfName.STARTINDENT);
		if(pdfobject instanceof PdfNumber)
		{
			if(Float.compare(((PdfNumber)pdfobject).floatValue(), list.getIndentationLeft()) != 0)
				setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(list.getIndentationLeft()))));
		} else
	//*  80  184:goto            52
	//*  81  187:aload_1         
	//*  82  188:invokevirtual   #340 <Method boolean com.itextpdf.text.List.isLettered()>
	//*  83  191:ifeq            52
	//*  84  194:aload_1         
	//*  85  195:invokevirtual   #343 <Method boolean com.itextpdf.text.List.isLowercase()>
	//*  86  198:ifeq            214
	//*  87  201:aload_0         
	//*  88  202:getstatic       #346 <Field PdfName PdfName.LISTNUMBERING>
	//*  89  205:getstatic       #370 <Field PdfName PdfName.LOWERALPHA>
	//*  90  208:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//*  91  211:goto            52
	//*  92  214:aload_0         
	//*  93  215:getstatic       #346 <Field PdfName PdfName.LISTNUMBERING>
	//*  94  218:getstatic       #373 <Field PdfName PdfName.UPPERALPHA>
	//*  95  221:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//*  96  224:goto            52
		if(Math.abs(list.getIndentationLeft()) > 1.401298E-45F)
	//*  97  227:aload_1         
	//*  98  228:invokevirtual   #355 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//*  99  231:invokestatic    #379 <Method float Math.abs(float)>
	//* 100  234:ldc2            #380 <Float 1.401298E-45F>
	//* 101  237:fcmpl           
	//* 102  238:ifle            106
			setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(list.getIndentationLeft()))));
	//  103  241:aload_0         
	//  104  242:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//  105  245:new             #67  <Class PdfNumber>
	//  106  248:dup             
	//  107  249:aload_1         
	//  108  250:invokevirtual   #355 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//  109  253:invokespecial   #290 <Method void PdfNumber(float)>
	//  110  256:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		pdfobject = getParentAttribute(((IPdfStructureElement) (parent)), PdfName.ENDINDENT);
		if(!(pdfobject instanceof PdfNumber)) goto _L8; else goto _L7
_L7:
		if(Float.compare(((PdfNumber)pdfobject).floatValue(), list.getIndentationRight()) != 0)
			setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(list.getIndentationRight()))));
_L2:
		return;
_L6:
		if(list.isLettered())
			if(list.isLowercase())
				setAttribute(PdfName.LISTNUMBERING, ((PdfObject) (PdfName.LOWERALPHA)));
			else
				setAttribute(PdfName.LISTNUMBERING, ((PdfObject) (PdfName.UPPERALPHA)));
		continue; /* Loop/switch isn't completed */
	//* 111  259:goto            106
_L8:
		if(Float.compare(list.getIndentationRight(), 0.0F) == 0) goto _L2; else goto _L9
	//  112  262:aload_1         
	//  113  263:invokevirtual   #361 <Method float com.itextpdf.text.List.getIndentationRight()>
	//  114  266:fconst_0        
	//  115  267:invokestatic    #77  <Method int Float.compare(float, float)>
	//  116  270:ifeq            160
_L9:
		setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(list.getIndentationRight()))));
	//  117  273:aload_0         
	//  118  274:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//  119  277:new             #67  <Class PdfNumber>
	//  120  280:dup             
	//  121  281:aload_1         
	//  122  282:invokevirtual   #361 <Method float com.itextpdf.text.List.getIndentationRight()>
	//  123  285:invokespecial   #290 <Method void PdfNumber(float)>
	//  124  288:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		return;
	//  125  291:return          
		if(true) goto _L4; else goto _L10
_L10:
	}

	private void writeAttributes(ListBody listbody)
	{
		if(listbody == null);
	//    0    0:aload_1         
	//    1    1:ifnull          4
	//    2    4:return          
	}

	private void writeAttributes(ListItem listitem)
	{
		if(listitem == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          112
_L1:
		PdfObject pdfobject = getParentAttribute(((IPdfStructureElement) (parent)), PdfName.STARTINDENT);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field PdfStructureElement parent>
	//    5    9:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//    6   12:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//    7   15:astore_2        
		if(!(pdfobject instanceof PdfNumber)) goto _L4; else goto _L3
	//    8   16:aload_2         
	//    9   17:instanceof      #67  <Class PdfNumber>
	//   10   20:ifeq            113
_L3:
		if(Float.compare(((PdfNumber)pdfobject).floatValue(), listitem.getIndentationLeft()) != 0)
	//*  11   23:aload_2         
	//*  12   24:checkcast       #67  <Class PdfNumber>
	//*  13   27:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #385 <Method float ListItem.getIndentationLeft()>
	//*  16   34:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  17   37:ifeq            58
			setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(listitem.getIndentationLeft()))));
	//   18   40:aload_0         
	//   19   41:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//   20   44:new             #67  <Class PdfNumber>
	//   21   47:dup             
	//   22   48:aload_1         
	//   23   49:invokevirtual   #385 <Method float ListItem.getIndentationLeft()>
	//   24   52:invokespecial   #290 <Method void PdfNumber(float)>
	//   25   55:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
_L9:
		pdfobject = getParentAttribute(((IPdfStructureElement) (parent)), PdfName.ENDINDENT);
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #31  <Field PdfStructureElement parent>
	//   29   63:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//   30   66:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//   31   69:astore_2        
		if(!(pdfobject instanceof PdfNumber)) goto _L6; else goto _L5
	//   32   70:aload_2         
	//   33   71:instanceof      #67  <Class PdfNumber>
	//   34   74:ifeq            148
_L5:
		if(Float.compare(((PdfNumber)pdfobject).floatValue(), listitem.getIndentationRight()) != 0)
	//*  35   77:aload_2         
	//*  36   78:checkcast       #67  <Class PdfNumber>
	//*  37   81:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  38   84:aload_1         
	//*  39   85:invokevirtual   #386 <Method float ListItem.getIndentationRight()>
	//*  40   88:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  41   91:ifeq            112
			setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(listitem.getIndentationRight()))));
	//   42   94:aload_0         
	//   43   95:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//   44   98:new             #67  <Class PdfNumber>
	//   45  101:dup             
	//   46  102:aload_1         
	//   47  103:invokevirtual   #386 <Method float ListItem.getIndentationRight()>
	//   48  106:invokespecial   #290 <Method void PdfNumber(float)>
	//   49  109:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
_L2:
		return;
	//   50  112:return          
_L4:
		if(Math.abs(listitem.getIndentationLeft()) > 1.401298E-45F)
	//*  51  113:aload_1         
	//*  52  114:invokevirtual   #385 <Method float ListItem.getIndentationLeft()>
	//*  53  117:invokestatic    #379 <Method float Math.abs(float)>
	//*  54  120:ldc2            #380 <Float 1.401298E-45F>
	//*  55  123:fcmpl           
	//*  56  124:ifle            58
			setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(listitem.getIndentationLeft()))));
	//   57  127:aload_0         
	//   58  128:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//   59  131:new             #67  <Class PdfNumber>
	//   60  134:dup             
	//   61  135:aload_1         
	//   62  136:invokevirtual   #385 <Method float ListItem.getIndentationLeft()>
	//   63  139:invokespecial   #290 <Method void PdfNumber(float)>
	//   64  142:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		continue; /* Loop/switch isn't completed */
	//   65  145:goto            58
_L6:
		if(Float.compare(listitem.getIndentationRight(), 0.0F) == 0) goto _L2; else goto _L7
	//   66  148:aload_1         
	//   67  149:invokevirtual   #386 <Method float ListItem.getIndentationRight()>
	//   68  152:fconst_0        
	//   69  153:invokestatic    #77  <Method int Float.compare(float, float)>
	//   70  156:ifeq            112
_L7:
		setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(listitem.getIndentationRight()))));
	//   71  159:aload_0         
	//   72  160:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//   73  163:new             #67  <Class PdfNumber>
	//   74  166:dup             
	//   75  167:aload_1         
	//   76  168:invokevirtual   #386 <Method float ListItem.getIndentationRight()>
	//   77  171:invokespecial   #290 <Method void PdfNumber(float)>
	//   78  174:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		return;
	//   79  177:return          
		if(true) goto _L9; else goto _L8
_L8:
	}

	private void writeAttributes(ListLabel listlabel)
	{
		if(listlabel != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          58
		{
			PdfObject pdfobject = getParentAttribute(((IPdfStructureElement) (parent)), PdfName.STARTINDENT);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field PdfStructureElement parent>
	//    5    9:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//    6   12:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//    7   15:astore_2        
			if(pdfobject instanceof PdfNumber)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #67  <Class PdfNumber>
	//*  10   20:ifeq            59
			{
				if(Float.compare(((PdfNumber)pdfobject).floatValue(), listlabel.getIndentation()) != 0)
	//*  11   23:aload_2         
	//*  12   24:checkcast       #67  <Class PdfNumber>
	//*  13   27:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #392 <Method float ListLabel.getIndentation()>
	//*  16   34:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  17   37:ifeq            58
					setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(listlabel.getIndentation()))));
	//   18   40:aload_0         
	//   19   41:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//   20   44:new             #67  <Class PdfNumber>
	//   21   47:dup             
	//   22   48:aload_1         
	//   23   49:invokevirtual   #392 <Method float ListLabel.getIndentation()>
	//   24   52:invokespecial   #290 <Method void PdfNumber(float)>
	//   25   55:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			} else
	//*  26   58:return          
			if(Math.abs(listlabel.getIndentation()) > 1.401298E-45F)
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #392 <Method float ListLabel.getIndentation()>
	//*  29   63:invokestatic    #379 <Method float Math.abs(float)>
	//*  30   66:ldc2            #380 <Float 1.401298E-45F>
	//*  31   69:fcmpl           
	//*  32   70:ifle            58
			{
				setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(listlabel.getIndentation()))));
	//   33   73:aload_0         
	//   34   74:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//   35   77:new             #67  <Class PdfNumber>
	//   36   80:dup             
	//   37   81:aload_1         
	//   38   82:invokevirtual   #392 <Method float ListLabel.getIndentation()>
	//   39   85:invokespecial   #290 <Method void PdfNumber(float)>
	//   40   88:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
				return;
	//   41   91:return          
			}
		}
	}

	private void writeAttributes(Paragraph paragraph)
	{
		if(paragraph != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          332
		{
			setAttribute(PdfName.O, ((PdfObject) (PdfName.LAYOUT)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #236 <Field PdfName PdfName.LAYOUT>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(Float.compare(paragraph.getSpacingBefore(), 0.0F) != 0)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #398 <Method float Paragraph.getSpacingBefore()>
	//*   8   18:fconst_0        
	//*   9   19:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  10   22:ifeq            43
				setAttribute(PdfName.SPACEBEFORE, ((PdfObject) (new PdfNumber(paragraph.getSpacingBefore()))));
	//   11   25:aload_0         
	//   12   26:getstatic       #401 <Field PdfName PdfName.SPACEBEFORE>
	//   13   29:new             #67  <Class PdfNumber>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:invokevirtual   #398 <Method float Paragraph.getSpacingBefore()>
	//   17   37:invokespecial   #290 <Method void PdfNumber(float)>
	//   18   40:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(Float.compare(paragraph.getSpacingAfter(), 0.0F) != 0)
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #404 <Method float Paragraph.getSpacingAfter()>
	//*  21   47:fconst_0        
	//*  22   48:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  23   51:ifeq            72
				setAttribute(PdfName.SPACEAFTER, ((PdfObject) (new PdfNumber(paragraph.getSpacingAfter()))));
	//   24   54:aload_0         
	//   25   55:getstatic       #407 <Field PdfName PdfName.SPACEAFTER>
	//   26   58:new             #67  <Class PdfNumber>
	//   27   61:dup             
	//   28   62:aload_1         
	//   29   63:invokevirtual   #404 <Method float Paragraph.getSpacingAfter()>
	//   30   66:invokespecial   #290 <Method void PdfNumber(float)>
	//   31   69:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			Object obj = ((Object) ((IPdfStructureElement)getParent(true)));
	//   32   72:aload_0         
	//   33   73:iconst_1        
	//   34   74:invokevirtual   #262 <Method PdfDictionary getParent(boolean)>
	//   35   77:checkcast       #6   <Class IPdfStructureElement>
	//   36   80:astore          4
			PdfObject pdfobject = getParentAttribute(((IPdfStructureElement) (obj)), PdfName.COLOR);
	//   37   82:aload_0         
	//   38   83:aload           4
	//   39   85:getstatic       #265 <Field PdfName PdfName.COLOR>
	//   40   88:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//   41   91:astore          5
			if(paragraph.getFont() != null && paragraph.getFont().getColor() != null)
	//*  42   93:aload_1         
	//*  43   94:invokevirtual   #408 <Method Font Paragraph.getFont()>
	//*  44   97:ifnull          126
	//*  45  100:aload_1         
	//*  46  101:invokevirtual   #408 <Method Font Paragraph.getFont()>
	//*  47  104:invokevirtual   #275 <Method BaseColor Font.getColor()>
	//*  48  107:ifnull          126
				setColorAttribute(paragraph.getFont().getColor(), pdfobject, PdfName.COLOR);
	//   49  110:aload_0         
	//   50  111:aload_1         
	//   51  112:invokevirtual   #408 <Method Font Paragraph.getFont()>
	//   52  115:invokevirtual   #275 <Method BaseColor Font.getColor()>
	//   53  118:aload           5
	//   54  120:getstatic       #265 <Field PdfName PdfName.COLOR>
	//   55  123:invokespecial   #277 <Method void setColorAttribute(BaseColor, PdfObject, PdfName)>
			pdfobject = getParentAttribute(((IPdfStructureElement) (obj)), PdfName.TEXTINDENT);
	//   56  126:aload_0         
	//   57  127:aload           4
	//   58  129:getstatic       #411 <Field PdfName PdfName.TEXTINDENT>
	//   59  132:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//   60  135:astore          5
			if(Float.compare(paragraph.getFirstLineIndent(), 0.0F) != 0)
	//*  61  137:aload_1         
	//*  62  138:invokevirtual   #414 <Method float Paragraph.getFirstLineIndent()>
	//*  63  141:fconst_0        
	//*  64  142:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  65  145:ifeq            214
			{
				boolean flag1 = true;
	//   66  148:iconst_1        
	//   67  149:istore_3        
				boolean flag = flag1;
	//   68  150:iload_3         
	//   69  151:istore_2        
				if(pdfobject instanceof PdfNumber)
	//*  70  152:aload           5
	//*  71  154:instanceof      #67  <Class PdfNumber>
	//*  72  157:ifeq            192
				{
					flag = flag1;
	//   73  160:iload_3         
	//   74  161:istore_2        
					if(Float.compare(((PdfNumber)pdfobject).floatValue(), (new Float(paragraph.getFirstLineIndent())).floatValue()) == 0)
	//*  75  162:aload           5
	//*  76  164:checkcast       #67  <Class PdfNumber>
	//*  77  167:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//*  78  170:new             #73  <Class Float>
	//*  79  173:dup             
	//*  80  174:aload_1         
	//*  81  175:invokevirtual   #414 <Method float Paragraph.getFirstLineIndent()>
	//*  82  178:invokespecial   #415 <Method void Float(float)>
	//*  83  181:invokevirtual   #293 <Method float Float.floatValue()>
	//*  84  184:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  85  187:ifne            192
						flag = false;
	//   86  190:iconst_0        
	//   87  191:istore_2        
				}
				if(flag)
	//*  88  192:iload_2         
	//*  89  193:ifeq            214
					setAttribute(PdfName.TEXTINDENT, ((PdfObject) (new PdfNumber(paragraph.getFirstLineIndent()))));
	//   90  196:aload_0         
	//   91  197:getstatic       #411 <Field PdfName PdfName.TEXTINDENT>
	//   92  200:new             #67  <Class PdfNumber>
	//   93  203:dup             
	//   94  204:aload_1         
	//   95  205:invokevirtual   #414 <Method float Paragraph.getFirstLineIndent()>
	//   96  208:invokespecial   #290 <Method void PdfNumber(float)>
	//   97  211:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			}
			pdfobject = getParentAttribute(((IPdfStructureElement) (obj)), PdfName.STARTINDENT);
	//   98  214:aload_0         
	//   99  215:aload           4
	//  100  217:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//  101  220:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//  102  223:astore          5
			if(pdfobject instanceof PdfNumber)
	//* 103  225:aload           5
	//* 104  227:instanceof      #67  <Class PdfNumber>
	//* 105  230:ifeq            333
			{
				if(Float.compare(((PdfNumber)pdfobject).floatValue(), paragraph.getIndentationLeft()) != 0)
	//* 106  233:aload           5
	//* 107  235:checkcast       #67  <Class PdfNumber>
	//* 108  238:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//* 109  241:aload_1         
	//* 110  242:invokevirtual   #416 <Method float Paragraph.getIndentationLeft()>
	//* 111  245:invokestatic    #77  <Method int Float.compare(float, float)>
	//* 112  248:ifeq            269
					setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(paragraph.getIndentationLeft()))));
	//  113  251:aload_0         
	//  114  252:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//  115  255:new             #67  <Class PdfNumber>
	//  116  258:dup             
	//  117  259:aload_1         
	//  118  260:invokevirtual   #416 <Method float Paragraph.getIndentationLeft()>
	//  119  263:invokespecial   #290 <Method void PdfNumber(float)>
	//  120  266:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			} else
	//* 121  269:aload_0         
	//* 122  270:aload           4
	//* 123  272:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//* 124  275:invokespecial   #203 <Method PdfObject getParentAttribute(IPdfStructureElement, PdfName)>
	//* 125  278:astore          4
	//* 126  280:aload           4
	//* 127  282:instanceof      #67  <Class PdfNumber>
	//* 128  285:ifeq            368
	//* 129  288:aload           4
	//* 130  290:checkcast       #67  <Class PdfNumber>
	//* 131  293:invokevirtual   #71  <Method float PdfNumber.floatValue()>
	//* 132  296:aload_1         
	//* 133  297:invokevirtual   #417 <Method float Paragraph.getIndentationRight()>
	//* 134  300:invokestatic    #77  <Method int Float.compare(float, float)>
	//* 135  303:ifeq            324
	//* 136  306:aload_0         
	//* 137  307:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//* 138  310:new             #67  <Class PdfNumber>
	//* 139  313:dup             
	//* 140  314:aload_1         
	//* 141  315:invokevirtual   #417 <Method float Paragraph.getIndentationRight()>
	//* 142  318:invokespecial   #290 <Method void PdfNumber(float)>
	//* 143  321:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//* 144  324:aload_0         
	//* 145  325:aload_1         
	//* 146  326:invokevirtual   #420 <Method int Paragraph.getAlignment()>
	//* 147  329:invokespecial   #422 <Method void setTextAlignAttribute(int)>
	//* 148  332:return          
			if(Math.abs(paragraph.getIndentationLeft()) > 1.401298E-45F)
	//* 149  333:aload_1         
	//* 150  334:invokevirtual   #416 <Method float Paragraph.getIndentationLeft()>
	//* 151  337:invokestatic    #379 <Method float Math.abs(float)>
	//* 152  340:ldc2            #380 <Float 1.401298E-45F>
	//* 153  343:fcmpl           
	//* 154  344:ifle            269
				setAttribute(PdfName.STARTINDENT, ((PdfObject) (new PdfNumber(paragraph.getIndentationLeft()))));
	//  155  347:aload_0         
	//  156  348:getstatic       #352 <Field PdfName PdfName.STARTINDENT>
	//  157  351:new             #67  <Class PdfNumber>
	//  158  354:dup             
	//  159  355:aload_1         
	//  160  356:invokevirtual   #416 <Method float Paragraph.getIndentationLeft()>
	//  161  359:invokespecial   #290 <Method void PdfNumber(float)>
	//  162  362:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			obj = ((Object) (getParentAttribute(((IPdfStructureElement) (obj)), PdfName.ENDINDENT)));
			if(obj instanceof PdfNumber)
			{
				if(Float.compare(((PdfNumber)obj).floatValue(), paragraph.getIndentationRight()) != 0)
					setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(paragraph.getIndentationRight()))));
			} else
	//* 163  365:goto            269
			if(Float.compare(paragraph.getIndentationRight(), 0.0F) != 0)
	//* 164  368:aload_1         
	//* 165  369:invokevirtual   #417 <Method float Paragraph.getIndentationRight()>
	//* 166  372:fconst_0        
	//* 167  373:invokestatic    #77  <Method int Float.compare(float, float)>
	//* 168  376:ifeq            324
				setAttribute(PdfName.ENDINDENT, ((PdfObject) (new PdfNumber(paragraph.getIndentationRight()))));
	//  169  379:aload_0         
	//  170  380:getstatic       #358 <Field PdfName PdfName.ENDINDENT>
	//  171  383:new             #67  <Class PdfNumber>
	//  172  386:dup             
	//  173  387:aload_1         
	//  174  388:invokevirtual   #417 <Method float Paragraph.getIndentationRight()>
	//  175  391:invokespecial   #290 <Method void PdfNumber(float)>
	//  176  394:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			setTextAlignAttribute(paragraph.getAlignment());
		}
	//* 177  397:goto            324
	}

	private void writeAttributes(PdfDiv pdfdiv)
	{
		if(pdfdiv != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			if(pdfdiv.getBackgroundColor() != null)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #426 <Method BaseColor PdfDiv.getBackgroundColor()>
	//*   4    8:ifnull          23
				setColorAttribute(pdfdiv.getBackgroundColor(), ((PdfObject) (null)), PdfName.BACKGROUNDCOLOR);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #426 <Method BaseColor PdfDiv.getBackgroundColor()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #258 <Field PdfName PdfName.BACKGROUNDCOLOR>
	//   10   20:invokespecial   #277 <Method void setColorAttribute(BaseColor, PdfObject, PdfName)>
			setTextAlignAttribute(pdfdiv.getTextAlignment());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #429 <Method int PdfDiv.getTextAlignment()>
	//   14   28:invokespecial   #422 <Method void setTextAlignAttribute(int)>
		}
	//   15   31:return          
	}

	private void writeAttributes(PdfPCell pdfpcell)
	{
		if(pdfpcell != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          268
		{
			setAttribute(PdfName.O, ((PdfObject) (PdfName.TABLE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #433 <Field PdfName PdfName.TABLE>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfpcell.getColspan() != 1)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #438 <Method int PdfPCell.getColspan()>
	//*   8   18:iconst_1        
	//*   9   19:icmpeq          40
				setAttribute(PdfName.COLSPAN, ((PdfObject) (new PdfNumber(pdfpcell.getColspan()))));
	//   10   22:aload_0         
	//   11   23:getstatic       #441 <Field PdfName PdfName.COLSPAN>
	//   12   26:new             #67  <Class PdfNumber>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokevirtual   #438 <Method int PdfPCell.getColspan()>
	//   16   34:invokespecial   #443 <Method void PdfNumber(int)>
	//   17   37:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfpcell.getRowspan() != 1)
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #446 <Method int PdfPCell.getRowspan()>
	//*  20   44:iconst_1        
	//*  21   45:icmpeq          66
				setAttribute(PdfName.ROWSPAN, ((PdfObject) (new PdfNumber(pdfpcell.getRowspan()))));
	//   22   48:aload_0         
	//   23   49:getstatic       #449 <Field PdfName PdfName.ROWSPAN>
	//   24   52:new             #67  <Class PdfNumber>
	//   25   55:dup             
	//   26   56:aload_1         
	//   27   57:invokevirtual   #446 <Method int PdfPCell.getRowspan()>
	//   28   60:invokespecial   #443 <Method void PdfNumber(int)>
	//   29   63:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfpcell.getHeaders() != null)
	//*  30   66:aload_1         
	//*  31   67:invokevirtual   #453 <Method ArrayList PdfPCell.getHeaders()>
	//*  32   70:ifnull          152
			{
				PdfArray pdfarray = new PdfArray();
	//   33   73:new             #61  <Class PdfArray>
	//   34   76:dup             
	//   35   77:invokespecial   #146 <Method void PdfArray()>
	//   36   80:astore_2        
				Iterator iterator = pdfpcell.getHeaders().iterator();
	//   37   81:aload_1         
	//   38   82:invokevirtual   #453 <Method ArrayList PdfPCell.getHeaders()>
	//   39   85:invokevirtual   #459 <Method Iterator ArrayList.iterator()>
	//   40   88:astore_3        
				do
				{
					if(!iterator.hasNext())
						break;
	//   41   89:aload_3         
	//   42   90:invokeinterface #464 <Method boolean Iterator.hasNext()>
	//   43   95:ifeq            137
					PdfPHeaderCell pdfpheadercell = (PdfPHeaderCell)iterator.next();
	//   44   98:aload_3         
	//   45   99:invokeinterface #468 <Method Object Iterator.next()>
	//   46  104:checkcast       #470 <Class PdfPHeaderCell>
	//   47  107:astore          4
					if(pdfpheadercell.getName() != null)
	//*  48  109:aload           4
	//*  49  111:invokevirtual   #473 <Method String PdfPHeaderCell.getName()>
	//*  50  114:ifnull          89
						pdfarray.add(((PdfObject) (new PdfString(pdfpheadercell.getName()))));
	//   51  117:aload_2         
	//   52  118:new             #475 <Class PdfString>
	//   53  121:dup             
	//   54  122:aload           4
	//   55  124:invokevirtual   #473 <Method String PdfPHeaderCell.getName()>
	//   56  127:invokespecial   #476 <Method void PdfString(String)>
	//   57  130:invokevirtual   #174 <Method boolean PdfArray.add(PdfObject)>
	//   58  133:pop             
				} while(true);
	//   59  134:goto            89
				if(!pdfarray.isEmpty())
	//*  60  137:aload_2         
	//*  61  138:invokevirtual   #479 <Method boolean PdfArray.isEmpty()>
	//*  62  141:ifne            152
					setAttribute(PdfName.HEADERS, ((PdfObject) (pdfarray)));
	//   63  144:aload_0         
	//   64  145:getstatic       #482 <Field PdfName PdfName.HEADERS>
	//   65  148:aload_2         
	//   66  149:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			}
			if(pdfpcell.getCalculatedHeight() > 0.0F)
	//*  67  152:aload_1         
	//*  68  153:invokevirtual   #485 <Method float PdfPCell.getCalculatedHeight()>
	//*  69  156:fconst_0        
	//*  70  157:fcmpl           
	//*  71  158:ifle            179
				setAttribute(PdfName.HEIGHT, ((PdfObject) (new PdfNumber(pdfpcell.getCalculatedHeight()))));
	//   72  161:aload_0         
	//   73  162:getstatic       #310 <Field PdfName PdfName.HEIGHT>
	//   74  165:new             #67  <Class PdfNumber>
	//   75  168:dup             
	//   76  169:aload_1         
	//   77  170:invokevirtual   #485 <Method float PdfPCell.getCalculatedHeight()>
	//   78  173:invokespecial   #290 <Method void PdfNumber(float)>
	//   79  176:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfpcell.getWidth() > 0.0F)
	//*  80  179:aload_1         
	//*  81  180:invokevirtual   #486 <Method float PdfPCell.getWidth()>
	//*  82  183:fconst_0        
	//*  83  184:fcmpl           
	//*  84  185:ifle            206
				setAttribute(PdfName.WIDTH, ((PdfObject) (new PdfNumber(pdfpcell.getWidth()))));
	//   85  188:aload_0         
	//   86  189:getstatic       #304 <Field PdfName PdfName.WIDTH>
	//   87  192:new             #67  <Class PdfNumber>
	//   88  195:dup             
	//   89  196:aload_1         
	//   90  197:invokevirtual   #486 <Method float PdfPCell.getWidth()>
	//   91  200:invokespecial   #290 <Method void PdfNumber(float)>
	//   92  203:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfpcell.getBackgroundColor() != null)
	//*  93  206:aload_1         
	//*  94  207:invokevirtual   #487 <Method BaseColor PdfPCell.getBackgroundColor()>
	//*  95  210:ifnull          268
			{
				pdfpcell = ((PdfPCell) (pdfpcell.getBackgroundColor()));
	//   96  213:aload_1         
	//   97  214:invokevirtual   #487 <Method BaseColor PdfPCell.getBackgroundColor()>
	//   98  217:astore_1        
				setAttribute(PdfName.BACKGROUNDCOLOR, ((PdfObject) (new PdfArray(new float[] {
					(float)((BaseColor) (pdfpcell)).getRed() / 255F, (float)((BaseColor) (pdfpcell)).getGreen() / 255F, (float)((BaseColor) (pdfpcell)).getBlue() / 255F
				}))));
	//   99  218:aload_0         
	//  100  219:getstatic       #258 <Field PdfName PdfName.BACKGROUNDCOLOR>
	//  101  222:new             #61  <Class PdfArray>
	//  102  225:dup             
	//  103  226:iconst_3        
	//  104  227:newarray        float[]
	//  105  229:dup             
	//  106  230:iconst_0        
	//  107  231:aload_1         
	//  108  232:invokevirtual   #181 <Method int BaseColor.getRed()>
	//  109  235:i2f             
	//  110  236:ldc1            #182 <Float 255F>
	//  111  238:fdiv            
	//  112  239:fastore         
	//  113  240:dup             
	//  114  241:iconst_1        
	//  115  242:aload_1         
	//  116  243:invokevirtual   #185 <Method int BaseColor.getGreen()>
	//  117  246:i2f             
	//  118  247:ldc1            #182 <Float 255F>
	//  119  249:fdiv            
	//  120  250:fastore         
	//  121  251:dup             
	//  122  252:iconst_2        
	//  123  253:aload_1         
	//  124  254:invokevirtual   #188 <Method int BaseColor.getBlue()>
	//  125  257:i2f             
	//  126  258:ldc1            #182 <Float 255F>
	//  127  260:fdiv            
	//  128  261:fastore         
	//  129  262:invokespecial   #193 <Method void PdfArray(float[])>
	//  130  265:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			}
		}
	//  131  268:return          
	}

	private void writeAttributes(PdfPHeaderCell pdfpheadercell)
	{
		if(pdfpheadercell == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          70
_L1:
		if(pdfpheadercell.getScope() == 0) goto _L4; else goto _L3
	//    2    4:aload_1         
	//    3    5:invokevirtual   #491 <Method int PdfPHeaderCell.getScope()>
	//    4    8:ifeq            40
_L3:
		pdfpheadercell.getScope();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #491 <Method int PdfPHeaderCell.getScope()>
		JVM INSTR tableswitch 1 3: default 40
	//	               1 71
	//	               2 84
	//	               3 97;
	//    7   15:tableswitch     1 3: default 40
	//	               1 71
	//	               2 84
	//	               3 97
		   goto _L4 _L5 _L6 _L7
_L4:
		if(pdfpheadercell.getName() != null)
	//*   8   40:aload_1         
	//*   9   41:invokevirtual   #473 <Method String PdfPHeaderCell.getName()>
	//*  10   44:ifnull          65
			setAttribute(PdfName.NAME, ((PdfObject) (new PdfName(pdfpheadercell.getName()))));
	//   11   47:aload_0         
	//   12   48:getstatic       #494 <Field PdfName PdfName.NAME>
	//   13   51:new             #33  <Class PdfName>
	//   14   54:dup             
	//   15   55:aload_1         
	//   16   56:invokevirtual   #473 <Method String PdfPHeaderCell.getName()>
	//   17   59:invokespecial   #495 <Method void PdfName(String)>
	//   18   62:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		writeAttributes(((PdfPCell) (pdfpheadercell)));
	//   19   65:aload_0         
	//   20   66:aload_1         
	//   21   67:invokespecial   #497 <Method void writeAttributes(PdfPCell)>
_L2:
		return;
	//   22   70:return          
_L5:
		setAttribute(PdfName.SCOPE, ((PdfObject) (PdfName.ROW)));
	//   23   71:aload_0         
	//   24   72:getstatic       #500 <Field PdfName PdfName.SCOPE>
	//   25   75:getstatic       #503 <Field PdfName PdfName.ROW>
	//   26   78:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		continue; /* Loop/switch isn't completed */
	//   27   81:goto            40
_L6:
		setAttribute(PdfName.SCOPE, ((PdfObject) (PdfName.COLUMN)));
	//   28   84:aload_0         
	//   29   85:getstatic       #500 <Field PdfName PdfName.SCOPE>
	//   30   88:getstatic       #506 <Field PdfName PdfName.COLUMN>
	//   31   91:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		continue; /* Loop/switch isn't completed */
	//   32   94:goto            40
_L7:
		setAttribute(PdfName.SCOPE, ((PdfObject) (PdfName.BOTH)));
	//   33   97:aload_0         
	//   34   98:getstatic       #500 <Field PdfName PdfName.SCOPE>
	//   35  101:getstatic       #509 <Field PdfName PdfName.BOTH>
	//   36  104:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		if(true) goto _L4; else goto _L8
	//   37  107:goto            40
_L8:
	}

	private void writeAttributes(PdfPRow pdfprow)
	{
		if(pdfprow != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			setAttribute(PdfName.O, ((PdfObject) (PdfName.TABLE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #433 <Field PdfName PdfName.TABLE>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//    6   14:return          
	}

	private void writeAttributes(PdfPTable pdfptable)
	{
		if(pdfptable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          126
		{
			setAttribute(PdfName.O, ((PdfObject) (PdfName.TABLE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #433 <Field PdfName PdfName.TABLE>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(Float.compare(pdfptable.getSpacingBefore(), 0.0F) != 0)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #514 <Method float PdfPTable.getSpacingBefore()>
	//*   8   18:fconst_0        
	//*   9   19:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  10   22:ifeq            43
				setAttribute(PdfName.SPACEBEFORE, ((PdfObject) (new PdfNumber(pdfptable.getSpacingBefore()))));
	//   11   25:aload_0         
	//   12   26:getstatic       #401 <Field PdfName PdfName.SPACEBEFORE>
	//   13   29:new             #67  <Class PdfNumber>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:invokevirtual   #514 <Method float PdfPTable.getSpacingBefore()>
	//   17   37:invokespecial   #290 <Method void PdfNumber(float)>
	//   18   40:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(Float.compare(pdfptable.getSpacingAfter(), 0.0F) != 0)
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #515 <Method float PdfPTable.getSpacingAfter()>
	//*  21   47:fconst_0        
	//*  22   48:invokestatic    #77  <Method int Float.compare(float, float)>
	//*  23   51:ifeq            72
				setAttribute(PdfName.SPACEAFTER, ((PdfObject) (new PdfNumber(pdfptable.getSpacingAfter()))));
	//   24   54:aload_0         
	//   25   55:getstatic       #407 <Field PdfName PdfName.SPACEAFTER>
	//   26   58:new             #67  <Class PdfNumber>
	//   27   61:dup             
	//   28   62:aload_1         
	//   29   63:invokevirtual   #515 <Method float PdfPTable.getSpacingAfter()>
	//   30   66:invokespecial   #290 <Method void PdfNumber(float)>
	//   31   69:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfptable.getTotalHeight() > 0.0F)
	//*  32   72:aload_1         
	//*  33   73:invokevirtual   #518 <Method float PdfPTable.getTotalHeight()>
	//*  34   76:fconst_0        
	//*  35   77:fcmpl           
	//*  36   78:ifle            99
				setAttribute(PdfName.HEIGHT, ((PdfObject) (new PdfNumber(pdfptable.getTotalHeight()))));
	//   37   81:aload_0         
	//   38   82:getstatic       #310 <Field PdfName PdfName.HEIGHT>
	//   39   85:new             #67  <Class PdfNumber>
	//   40   88:dup             
	//   41   89:aload_1         
	//   42   90:invokevirtual   #518 <Method float PdfPTable.getTotalHeight()>
	//   43   93:invokespecial   #290 <Method void PdfNumber(float)>
	//   44   96:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdfptable.getTotalWidth() > 0.0F)
	//*  45   99:aload_1         
	//*  46  100:invokevirtual   #521 <Method float PdfPTable.getTotalWidth()>
	//*  47  103:fconst_0        
	//*  48  104:fcmpl           
	//*  49  105:ifle            126
				setAttribute(PdfName.WIDTH, ((PdfObject) (new PdfNumber(pdfptable.getTotalWidth()))));
	//   50  108:aload_0         
	//   51  109:getstatic       #304 <Field PdfName PdfName.WIDTH>
	//   52  112:new             #67  <Class PdfNumber>
	//   53  115:dup             
	//   54  116:aload_1         
	//   55  117:invokevirtual   #521 <Method float PdfPTable.getTotalWidth()>
	//   56  120:invokespecial   #290 <Method void PdfNumber(float)>
	//   57  123:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		}
	//   58  126:return          
	}

	private void writeAttributes(PdfPTableBody pdfptablebody)
	{
		if(pdfptablebody == null);
	//    0    0:aload_1         
	//    1    1:ifnull          4
	//    2    4:return          
	}

	private void writeAttributes(PdfPTableFooter pdfptablefooter)
	{
		if(pdfptablefooter == null);
	//    0    0:aload_1         
	//    1    1:ifnull          4
	//    2    4:return          
	}

	private void writeAttributes(PdfPTableHeader pdfptableheader)
	{
		if(pdfptableheader != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			setAttribute(PdfName.O, ((PdfObject) (PdfName.TABLE)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #433 <Field PdfName PdfName.TABLE>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
	//    6   14:return          
	}

	private void writeAttributes(PdfTemplate pdftemplate)
	{
		if(pdftemplate != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          88
		{
			setAttribute(PdfName.O, ((PdfObject) (PdfName.LAYOUT)));
	//    2    4:aload_0         
	//    3    5:getstatic       #233 <Field PdfName PdfName.O>
	//    4    8:getstatic       #236 <Field PdfName PdfName.LAYOUT>
	//    5   11:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdftemplate.getWidth() > 0.0F)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #528 <Method float PdfTemplate.getWidth()>
	//*   8   18:fconst_0        
	//*   9   19:fcmpl           
	//*  10   20:ifle            41
				setAttribute(PdfName.WIDTH, ((PdfObject) (new PdfNumber(pdftemplate.getWidth()))));
	//   11   23:aload_0         
	//   12   24:getstatic       #304 <Field PdfName PdfName.WIDTH>
	//   13   27:new             #67  <Class PdfNumber>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokevirtual   #528 <Method float PdfTemplate.getWidth()>
	//   17   35:invokespecial   #290 <Method void PdfNumber(float)>
	//   18   38:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			if(pdftemplate.getHeight() > 0.0F)
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #529 <Method float PdfTemplate.getHeight()>
	//*  21   45:fconst_0        
	//*  22   46:fcmpl           
	//*  23   47:ifle            68
				setAttribute(PdfName.HEIGHT, ((PdfObject) (new PdfNumber(pdftemplate.getHeight()))));
	//   24   50:aload_0         
	//   25   51:getstatic       #310 <Field PdfName PdfName.HEIGHT>
	//   26   54:new             #67  <Class PdfNumber>
	//   27   57:dup             
	//   28   58:aload_1         
	//   29   59:invokevirtual   #529 <Method float PdfTemplate.getHeight()>
	//   30   62:invokespecial   #290 <Method void PdfNumber(float)>
	//   31   65:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
			pdftemplate = ((PdfTemplate) (new PdfRectangle(pdftemplate.getBoundingBox())));
	//   32   68:new             #312 <Class PdfRectangle>
	//   33   71:dup             
	//   34   72:aload_1         
	//   35   73:invokevirtual   #533 <Method com.itextpdf.text.Rectangle PdfTemplate.getBoundingBox()>
	//   36   76:invokespecial   #536 <Method void PdfRectangle(com.itextpdf.text.Rectangle)>
	//   37   79:astore_1        
			setAttribute(PdfName.BBOX, ((PdfObject) (pdftemplate)));
	//   38   80:aload_0         
	//   39   81:getstatic       #321 <Field PdfName PdfName.BBOX>
	//   40   84:aload_1         
	//   41   85:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
		}
	//   42   88:return          
	}

	public PdfObject getAttribute(PdfName pdfname)
	{
		PdfDictionary pdfdictionary = getAsDict(PdfName.A);
	//    0    0:aload_0         
	//    1    1:getstatic       #539 <Field PdfName PdfName.A>
	//    2    4:invokevirtual   #540 <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:astore_2        
		if(pdfdictionary != null && pdfdictionary.contains(pdfname))
	//*   4    8:aload_2         
	//*   5    9:ifnull          26
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #109 <Method boolean PdfDictionary.contains(PdfName)>
	//*   9   17:ifeq            26
			return pdfdictionary.get(pdfname);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #145 <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   25:areturn         
		pdfdictionary = getParent();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #543 <Method PdfDictionary getParent()>
	//   16   30:astore_2        
		if(pdfdictionary instanceof PdfStructureElement)
	//*  17   31:aload_2         
	//*  18   32:instanceof      #2   <Class PdfStructureElement>
	//*  19   35:ifeq            47
			return ((PdfStructureElement)pdfdictionary).getAttribute(pdfname);
	//   20   38:aload_2         
	//   21   39:checkcast       #2   <Class PdfStructureElement>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #544 <Method PdfObject getAttribute(PdfName)>
	//   24   46:areturn         
		if(pdfdictionary instanceof PdfStructureTreeRoot)
	//*  25   47:aload_2         
	//*  26   48:instanceof      #50  <Class PdfStructureTreeRoot>
	//*  27   51:ifeq            63
			return ((PdfStructureTreeRoot)pdfdictionary).getAttribute(pdfname);
	//   28   54:aload_2         
	//   29   55:checkcast       #50  <Class PdfStructureTreeRoot>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #545 <Method PdfObject PdfStructureTreeRoot.getAttribute(PdfName)>
	//   32   62:areturn         
		else
			return ((PdfObject) (new PdfNull()));
	//   33   63:new             #547 <Class PdfNull>
	//   34   66:dup             
	//   35   67:invokespecial   #548 <Method void PdfNull()>
	//   36   70:areturn         
	}

	protected AccessibleElementId getElementId()
	{
		return elementId;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AccessibleElementId elementId>
	//    2    4:areturn         
	}

	public PdfDictionary getParent()
	{
		return getParent(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #262 <Method PdfDictionary getParent(boolean)>
	//    3    5:areturn         
	}

	public PdfDictionary getParent(boolean flag)
	{
		if(parent == null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field PdfStructureElement parent>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			return ((PdfDictionary) (top));
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field PdfStructureTreeRoot top>
	//    7   15:areturn         
		else
			return ((PdfDictionary) (parent));
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field PdfStructureElement parent>
	//   10   20:areturn         
	}

	public PdfIndirectReference getReference()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfIndirectReference reference>
	//    2    4:areturn         
	}

	public PdfName getStructureType()
	{
		return structureType;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field PdfName structureType>
	//    2    4:areturn         
	}

	void setAnnotation(PdfAnnotation pdfannotation, PdfIndirectReference pdfindirectreference)
	{
		Object obj = ((Object) (getAsArray(PdfName.K)));
	//    0    0:aload_0         
	//    1    1:getstatic       #142 <Field PdfName PdfName.K>
	//    2    4:invokevirtual   #558 <Method PdfArray getAsArray(PdfName)>
	//    3    7:astore          4
		PdfArray pdfarray = ((PdfArray) (obj));
	//    4    9:aload           4
	//    5   11:astore_3        
		if(obj == null)
	//*   6   12:aload           4
	//*   7   14:ifnonnull       54
		{
			pdfarray = new PdfArray();
	//    8   17:new             #61  <Class PdfArray>
	//    9   20:dup             
	//   10   21:invokespecial   #146 <Method void PdfArray()>
	//   11   24:astore_3        
			obj = ((Object) (get(PdfName.K)));
	//   12   25:aload_0         
	//   13   26:getstatic       #142 <Field PdfName PdfName.K>
	//   14   29:invokevirtual   #559 <Method PdfObject get(PdfName)>
	//   15   32:astore          4
			if(obj != null)
	//*  16   34:aload           4
	//*  17   36:ifnull          46
				pdfarray.add(((PdfObject) (obj)));
	//   18   39:aload_3         
	//   19   40:aload           4
	//   20   42:invokevirtual   #174 <Method boolean PdfArray.add(PdfObject)>
	//   21   45:pop             
			put(PdfName.K, ((PdfObject) (pdfarray)));
	//   22   46:aload_0         
	//   23   47:getstatic       #142 <Field PdfName PdfName.K>
	//   24   50:aload_3         
	//   25   51:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		}
		obj = ((Object) (new PdfDictionary()));
	//   26   54:new             #4   <Class PdfDictionary>
	//   27   57:dup             
	//   28   58:invokespecial   #21  <Method void PdfDictionary()>
	//   29   61:astore          4
		((PdfDictionary) (obj)).put(PdfName.TYPE, ((PdfObject) (PdfName.OBJR)));
	//   30   63:aload           4
	//   31   65:getstatic       #45  <Field PdfName PdfName.TYPE>
	//   32   68:getstatic       #562 <Field PdfName PdfName.OBJR>
	//   33   71:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (obj)).put(PdfName.OBJ, ((PdfObject) (pdfannotation.getIndirectReference())));
	//   34   74:aload           4
	//   35   76:getstatic       #565 <Field PdfName PdfName.OBJ>
	//   36   79:aload_1         
	//   37   80:invokevirtual   #570 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//   38   83:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfannotation.getRole() == PdfName.FORM)
	//*  39   86:aload_1         
	//*  40   87:invokevirtual   #573 <Method PdfName PdfAnnotation.getRole()>
	//*  41   90:getstatic       #576 <Field PdfName PdfName.FORM>
	//*  42   93:if_acmpne       105
			((PdfDictionary) (obj)).put(PdfName.PG, ((PdfObject) (pdfindirectreference)));
	//   43   96:aload           4
	//   44   98:getstatic       #579 <Field PdfName PdfName.PG>
	//   45  101:aload_2         
	//   46  102:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfarray.add(((PdfObject) (obj)));
	//   47  105:aload_3         
	//   48  106:aload           4
	//   49  108:invokevirtual   #174 <Method boolean PdfArray.add(PdfObject)>
	//   50  111:pop             
	//   51  112:return          
	}

	public void setAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		PdfDictionary pdfdictionary1 = getAsDict(PdfName.A);
	//    0    0:aload_0         
	//    1    1:getstatic       #539 <Field PdfName PdfName.A>
	//    2    4:invokevirtual   #540 <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:astore          4
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    4    9:aload           4
	//    5   11:astore_3        
		if(pdfdictionary1 == null)
	//*   6   12:aload           4
	//*   7   14:ifnonnull       33
		{
			pdfdictionary = new PdfDictionary();
	//    8   17:new             #4   <Class PdfDictionary>
	//    9   20:dup             
	//   10   21:invokespecial   #21  <Method void PdfDictionary()>
	//   11   24:astore_3        
			put(PdfName.A, ((PdfObject) (pdfdictionary)));
	//   12   25:aload_0         
	//   13   26:getstatic       #539 <Field PdfName PdfName.A>
	//   14   29:aload_3         
	//   15   30:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		}
		pdfdictionary.put(pdfname, pdfobject);
	//   16   33:aload_3         
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   20   39:return          
	}

	void setPageMark(int i, int j)
	{
		if(j >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            19
			put(PdfName.K, ((PdfObject) (new PdfNumber(j))));
	//    2    4:aload_0         
	//    3    5:getstatic       #142 <Field PdfName PdfName.K>
	//    4    8:new             #67  <Class PdfNumber>
	//    5   11:dup             
	//    6   12:iload_2         
	//    7   13:invokespecial   #443 <Method void PdfNumber(int)>
	//    8   16:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
		top.setPageMark(i, reference);
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field PdfStructureTreeRoot top>
	//   11   23:iload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field PdfIndirectReference reference>
	//   14   28:invokevirtual   #584 <Method void PdfStructureTreeRoot.setPageMark(int, PdfIndirectReference)>
	//   15   31:return          
	}

	protected void setStructureElementParent(PdfStructureElement pdfstructureelement)
	{
		parent = pdfstructureelement;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field PdfStructureElement parent>
	//    3    5:return          
	}

	protected void setStructureTreeRoot(PdfStructureTreeRoot pdfstructuretreeroot)
	{
		top = pdfstructuretreeroot;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field PdfStructureTreeRoot top>
	//    3    5:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 16, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          16
	//    2    3:aload_0         
	//    3    4:invokestatic    #596 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #598 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	public void writeAttributes(IAccessibleElement iaccessibleelement)
	{
		if(iaccessibleelement instanceof ListItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #384 <Class ListItem>
	//*   2    4:ifeq            103
		{
			writeAttributes((ListItem)iaccessibleelement);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #384 <Class ListItem>
	//    6   12:invokespecial   #602 <Method void writeAttributes(ListItem)>
			break MISSING_BLOCK_LABEL_15;
		} else
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #607 <Method HashMap IAccessibleElement.getAccessibleAttributes()>
	//*   9   21:ifnull          471
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #607 <Method HashMap IAccessibleElement.getAccessibleAttributes()>
	//*  12   30:invokevirtual   #611 <Method Set HashMap.keySet()>
	//*  13   33:invokeinterface #614 <Method Iterator Set.iterator()>
	//*  14   38:astore_2        
	//*  15   39:aload_2         
	//*  16   40:invokeinterface #464 <Method boolean Iterator.hasNext()>
	//*  17   45:ifeq            471
	//*  18   48:aload_2         
	//*  19   49:invokeinterface #468 <Method Object Iterator.next()>
	//*  20   54:checkcast       #33  <Class PdfName>
	//*  21   57:astore_3        
	//*  22   58:aload_3         
	//*  23   59:getstatic       #617 <Field PdfName PdfName.ID>
	//*  24   62:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  25   65:ifeq            391
	//*  26   68:aload_1         
	//*  27   69:aload_3         
	//*  28   70:invokeinterface #620 <Method PdfObject IAccessibleElement.getAccessibleAttribute(PdfName)>
	//*  29   75:astore          4
	//*  30   77:aload_0         
	//*  31   78:aload_3         
	//*  32   79:aload           4
	//*  33   81:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
	//*  34   84:aload_0         
	//*  35   85:getfield        #25  <Field PdfStructureTreeRoot top>
	//*  36   88:aload           4
	//*  37   90:invokevirtual   #623 <Method String PdfObject.toString()>
	//*  38   93:aload_0         
	//*  39   94:invokevirtual   #624 <Method PdfIndirectReference getReference()>
	//*  40   97:invokevirtual   #628 <Method void PdfStructureTreeRoot.putIDTree(String, PdfObject)>
	//*  41  100:goto            39
		{
			if(iaccessibleelement instanceof Paragraph)
	//*  42  103:aload_1         
	//*  43  104:instanceof      #395 <Class Paragraph>
	//*  44  107:ifeq            121
				writeAttributes((Paragraph)iaccessibleelement);
	//   45  110:aload_0         
	//   46  111:aload_1         
	//   47  112:checkcast       #395 <Class Paragraph>
	//   48  115:invokespecial   #630 <Method void writeAttributes(Paragraph)>
			else
	//*  49  118:goto            15
			if(iaccessibleelement instanceof Chunk)
	//*  50  121:aload_1         
	//*  51  122:instanceof      #219 <Class Chunk>
	//*  52  125:ifeq            139
				writeAttributes((Chunk)iaccessibleelement);
	//   53  128:aload_0         
	//   54  129:aload_1         
	//   55  130:checkcast       #219 <Class Chunk>
	//   56  133:invokespecial   #632 <Method void writeAttributes(Chunk)>
			else
	//*  57  136:goto            15
			if(iaccessibleelement instanceof Image)
	//*  58  139:aload_1         
	//*  59  140:instanceof      #298 <Class Image>
	//*  60  143:ifeq            157
				writeAttributes((Image)iaccessibleelement);
	//   61  146:aload_0         
	//   62  147:aload_1         
	//   63  148:checkcast       #298 <Class Image>
	//   64  151:invokespecial   #226 <Method void writeAttributes(Image)>
			else
	//*  65  154:goto            15
			if(iaccessibleelement instanceof com.itextpdf.text.List)
	//*  66  157:aload_1         
	//*  67  158:instanceof      #330 <Class com.itextpdf.text.List>
	//*  68  161:ifeq            175
				writeAttributes((com.itextpdf.text.List)iaccessibleelement);
	//   69  164:aload_0         
	//   70  165:aload_1         
	//   71  166:checkcast       #330 <Class com.itextpdf.text.List>
	//   72  169:invokespecial   #634 <Method void writeAttributes(com.itextpdf.text.List)>
			else
	//*  73  172:goto            15
			if(iaccessibleelement instanceof ListLabel)
	//*  74  175:aload_1         
	//*  75  176:instanceof      #389 <Class ListLabel>
	//*  76  179:ifeq            193
				writeAttributes((ListLabel)iaccessibleelement);
	//   77  182:aload_0         
	//   78  183:aload_1         
	//   79  184:checkcast       #389 <Class ListLabel>
	//   80  187:invokespecial   #636 <Method void writeAttributes(ListLabel)>
			else
	//*  81  190:goto            15
			if(iaccessibleelement instanceof ListBody)
	//*  82  193:aload_1         
	//*  83  194:instanceof      #638 <Class ListBody>
	//*  84  197:ifeq            211
				writeAttributes((ListBody)iaccessibleelement);
	//   85  200:aload_0         
	//   86  201:aload_1         
	//   87  202:checkcast       #638 <Class ListBody>
	//   88  205:invokespecial   #640 <Method void writeAttributes(ListBody)>
			else
	//*  89  208:goto            15
			if(iaccessibleelement instanceof PdfPTable)
	//*  90  211:aload_1         
	//*  91  212:instanceof      #513 <Class PdfPTable>
	//*  92  215:ifeq            229
				writeAttributes((PdfPTable)iaccessibleelement);
	//   93  218:aload_0         
	//   94  219:aload_1         
	//   95  220:checkcast       #513 <Class PdfPTable>
	//   96  223:invokespecial   #642 <Method void writeAttributes(PdfPTable)>
			else
	//*  97  226:goto            15
			if(iaccessibleelement instanceof PdfPRow)
	//*  98  229:aload_1         
	//*  99  230:instanceof      #644 <Class PdfPRow>
	//* 100  233:ifeq            247
				writeAttributes((PdfPRow)iaccessibleelement);
	//  101  236:aload_0         
	//  102  237:aload_1         
	//  103  238:checkcast       #644 <Class PdfPRow>
	//  104  241:invokespecial   #646 <Method void writeAttributes(PdfPRow)>
			else
	//* 105  244:goto            15
			if(iaccessibleelement instanceof PdfPHeaderCell)
	//* 106  247:aload_1         
	//* 107  248:instanceof      #470 <Class PdfPHeaderCell>
	//* 108  251:ifeq            265
				writeAttributes((PdfPHeaderCell)iaccessibleelement);
	//  109  254:aload_0         
	//  110  255:aload_1         
	//  111  256:checkcast       #470 <Class PdfPHeaderCell>
	//  112  259:invokespecial   #648 <Method void writeAttributes(PdfPHeaderCell)>
			else
	//* 113  262:goto            15
			if(iaccessibleelement instanceof PdfPCell)
	//* 114  265:aload_1         
	//* 115  266:instanceof      #435 <Class PdfPCell>
	//* 116  269:ifeq            283
				writeAttributes((PdfPCell)iaccessibleelement);
	//  117  272:aload_0         
	//  118  273:aload_1         
	//  119  274:checkcast       #435 <Class PdfPCell>
	//  120  277:invokespecial   #497 <Method void writeAttributes(PdfPCell)>
			else
	//* 121  280:goto            15
			if(iaccessibleelement instanceof PdfPTableHeader)
	//* 122  283:aload_1         
	//* 123  284:instanceof      #650 <Class PdfPTableHeader>
	//* 124  287:ifeq            301
				writeAttributes((PdfPTableHeader)iaccessibleelement);
	//  125  290:aload_0         
	//  126  291:aload_1         
	//  127  292:checkcast       #650 <Class PdfPTableHeader>
	//  128  295:invokespecial   #652 <Method void writeAttributes(PdfPTableHeader)>
			else
	//* 129  298:goto            15
			if(iaccessibleelement instanceof PdfPTableFooter)
	//* 130  301:aload_1         
	//* 131  302:instanceof      #654 <Class PdfPTableFooter>
	//* 132  305:ifeq            319
				writeAttributes((PdfPTableFooter)iaccessibleelement);
	//  133  308:aload_0         
	//  134  309:aload_1         
	//  135  310:checkcast       #654 <Class PdfPTableFooter>
	//  136  313:invokespecial   #656 <Method void writeAttributes(PdfPTableFooter)>
			else
	//* 137  316:goto            15
			if(iaccessibleelement instanceof PdfPTableBody)
	//* 138  319:aload_1         
	//* 139  320:instanceof      #658 <Class PdfPTableBody>
	//* 140  323:ifeq            337
				writeAttributes((PdfPTableBody)iaccessibleelement);
	//  141  326:aload_0         
	//  142  327:aload_1         
	//  143  328:checkcast       #658 <Class PdfPTableBody>
	//  144  331:invokespecial   #660 <Method void writeAttributes(PdfPTableBody)>
			else
	//* 145  334:goto            15
			if(iaccessibleelement instanceof PdfDiv)
	//* 146  337:aload_1         
	//* 147  338:instanceof      #425 <Class PdfDiv>
	//* 148  341:ifeq            355
				writeAttributes((PdfDiv)iaccessibleelement);
	//  149  344:aload_0         
	//  150  345:aload_1         
	//  151  346:checkcast       #425 <Class PdfDiv>
	//  152  349:invokespecial   #662 <Method void writeAttributes(PdfDiv)>
			else
	//* 153  352:goto            15
			if(iaccessibleelement instanceof PdfTemplate)
	//* 154  355:aload_1         
	//* 155  356:instanceof      #527 <Class PdfTemplate>
	//* 156  359:ifeq            373
				writeAttributes((PdfTemplate)iaccessibleelement);
	//  157  362:aload_0         
	//  158  363:aload_1         
	//  159  364:checkcast       #527 <Class PdfTemplate>
	//  160  367:invokespecial   #664 <Method void writeAttributes(PdfTemplate)>
			else
	//* 161  370:goto            15
			if(iaccessibleelement instanceof Document)
	//* 162  373:aload_1         
	//* 163  374:instanceof      #666 <Class Document>
	//* 164  377:ifeq            15
				writeAttributes((Document)iaccessibleelement);
	//  165  380:aload_0         
	//  166  381:aload_1         
	//  167  382:checkcast       #666 <Class Document>
	//  168  385:invokespecial   #668 <Method void writeAttributes(Document)>
			continue;
	//  169  388:goto            15
		}
		do
		{
			if(iaccessibleelement.getAccessibleAttributes() != null)
			{
				for(Iterator iterator = iaccessibleelement.getAccessibleAttributes().keySet().iterator(); iterator.hasNext();)
				{
					PdfName pdfname = (PdfName)iterator.next();
					if(pdfname.equals(((Object) (PdfName.ID))))
					{
						PdfObject pdfobject = iaccessibleelement.getAccessibleAttribute(pdfname);
						put(pdfname, pdfobject);
						top.putIDTree(pdfobject.toString(), ((PdfObject) (getReference())));
					} else
					if(pdfname.equals(((Object) (PdfName.LANG))) || pdfname.equals(((Object) (PdfName.ALT))) || pdfname.equals(((Object) (PdfName.ACTUALTEXT))) || pdfname.equals(((Object) (PdfName.E))) || pdfname.equals(((Object) (PdfName.T))))
	//* 170  391:aload_3         
	//* 171  392:getstatic       #671 <Field PdfName PdfName.LANG>
	//* 172  395:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//* 173  398:ifne            441
	//* 174  401:aload_3         
	//* 175  402:getstatic       #674 <Field PdfName PdfName.ALT>
	//* 176  405:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//* 177  408:ifne            441
	//* 178  411:aload_3         
	//* 179  412:getstatic       #677 <Field PdfName PdfName.ACTUALTEXT>
	//* 180  415:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//* 181  418:ifne            441
	//* 182  421:aload_3         
	//* 183  422:getstatic       #680 <Field PdfName PdfName.E>
	//* 184  425:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//* 185  428:ifne            441
	//* 186  431:aload_3         
	//* 187  432:getstatic       #683 <Field PdfName PdfName.T>
	//* 188  435:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//* 189  438:ifeq            456
						put(pdfname, iaccessibleelement.getAccessibleAttribute(pdfname));
	//  190  441:aload_0         
	//  191  442:aload_3         
	//  192  443:aload_1         
	//  193  444:aload_3         
	//  194  445:invokeinterface #620 <Method PdfObject IAccessibleElement.getAccessibleAttribute(PdfName)>
	//  195  450:invokevirtual   #42  <Method void put(PdfName, PdfObject)>
					else
	//* 196  453:goto            39
						setAttribute(pdfname, iaccessibleelement.getAccessibleAttribute(pdfname));
	//  197  456:aload_0         
	//  198  457:aload_3         
	//  199  458:aload_1         
	//  200  459:aload_3         
	//  201  460:invokeinterface #620 <Method PdfObject IAccessibleElement.getAccessibleAttribute(PdfName)>
	//  202  465:invokevirtual   #196 <Method void setAttribute(PdfName, PdfObject)>
				}

			}
	//* 203  468:goto            39
			return;
	//  204  471:return          
		} while(true);
	}

	private AccessibleElementId elementId;
	private transient PdfStructureElement parent;
	private PdfIndirectReference reference;
	private PdfName structureType;
	private transient PdfStructureTreeRoot top;
}
