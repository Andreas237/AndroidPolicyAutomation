// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.AccessibleElementId;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, PdfName, PageResources, PdfWriter, 
//			ByteBuffer, PdfObject, PdfArray, PdfFormXObject, 
//			PdfNumber, PdfDictionary, PdfTransparencyGroup, PdfOCG, 
//			PdfIndirectReference, PdfStream

public class PdfTemplate extends PdfContentByte
	implements IAccessibleElement
{

	protected PdfTemplate()
	{
		super(((PdfWriter) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #43  <Method void PdfContentByte(PdfWriter)>
		bBox = new Rectangle(0.0F, 0.0F);
	//    3    5:aload_0         
	//    4    6:new             #45  <Class Rectangle>
	//    5    9:dup             
	//    6   10:fconst_0        
	//    7   11:fconst_0        
	//    8   12:invokespecial   #48  <Method void Rectangle(float, float)>
	//    9   15:putfield        #50  <Field Rectangle bBox>
		contentTagged = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #52  <Field boolean contentTagged>
		additional = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #54  <Field PdfDictionary additional>
		role = PdfName.FIGURE;
	//   16   28:aload_0         
	//   17   29:getstatic       #59  <Field PdfName PdfName.FIGURE>
	//   18   32:putfield        #61  <Field PdfName role>
		accessibleAttributes = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #63  <Field HashMap accessibleAttributes>
		id = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #65  <Field AccessibleElementId id>
		type = 1;
	//   25   45:aload_0         
	//   26   46:iconst_1        
	//   27   47:putfield        #67  <Field int type>
	//   28   50:return          
	}

	PdfTemplate(PdfWriter pdfwriter)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void PdfContentByte(PdfWriter)>
		bBox = new Rectangle(0.0F, 0.0F);
	//    3    5:aload_0         
	//    4    6:new             #45  <Class Rectangle>
	//    5    9:dup             
	//    6   10:fconst_0        
	//    7   11:fconst_0        
	//    8   12:invokespecial   #48  <Method void Rectangle(float, float)>
	//    9   15:putfield        #50  <Field Rectangle bBox>
		contentTagged = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #52  <Field boolean contentTagged>
		additional = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #54  <Field PdfDictionary additional>
		role = PdfName.FIGURE;
	//   16   28:aload_0         
	//   17   29:getstatic       #59  <Field PdfName PdfName.FIGURE>
	//   18   32:putfield        #61  <Field PdfName role>
		accessibleAttributes = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #63  <Field HashMap accessibleAttributes>
		id = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #65  <Field AccessibleElementId id>
		type = 1;
	//   25   45:aload_0         
	//   26   46:iconst_1        
	//   27   47:putfield        #67  <Field int type>
		pageResources = new PageResources();
	//   28   50:aload_0         
	//   29   51:new             #70  <Class PageResources>
	//   30   54:dup             
	//   31   55:invokespecial   #72  <Method void PageResources()>
	//   32   58:putfield        #74  <Field PageResources pageResources>
		pageResources.addDefaultColor(pdfwriter.getDefaultColorspace());
	//   33   61:aload_0         
	//   34   62:getfield        #74  <Field PageResources pageResources>
	//   35   65:aload_1         
	//   36   66:invokevirtual   #80  <Method PdfDictionary PdfWriter.getDefaultColorspace()>
	//   37   69:invokevirtual   #84  <Method void PageResources.addDefaultColor(PdfDictionary)>
		thisReference = writer.getPdfIndirectReference();
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #88  <Field PdfWriter writer>
	//   41   77:invokevirtual   #92  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   42   80:putfield        #94  <Field PdfIndirectReference thisReference>
	//   43   83:return          
	}

	public static PdfTemplate createTemplate(PdfWriter pdfwriter, float f, float f1)
	{
		return createTemplate(pdfwriter, f, f1, ((PdfName) (null)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #99  <Method PdfTemplate createTemplate(PdfWriter, float, float, PdfName)>
	//    5    7:areturn         
	}

	static PdfTemplate createTemplate(PdfWriter pdfwriter, float f, float f1, PdfName pdfname)
	{
		PdfTemplate pdftemplate = new PdfTemplate(pdfwriter);
	//    0    0:new             #2   <Class PdfTemplate>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #100 <Method void PdfTemplate(PdfWriter)>
	//    4    8:astore          4
		pdftemplate.setWidth(f);
	//    5   10:aload           4
	//    6   12:fload_1         
	//    7   13:invokevirtual   #104 <Method void setWidth(float)>
		pdftemplate.setHeight(f1);
	//    8   16:aload           4
	//    9   18:fload_2         
	//   10   19:invokevirtual   #107 <Method void setHeight(float)>
		pdfwriter.addDirectTemplateSimple(pdftemplate, pdfname);
	//   11   22:aload_0         
	//   12   23:aload           4
	//   13   25:aload_3         
	//   14   26:invokevirtual   #111 <Method PdfName PdfWriter.addDirectTemplateSimple(PdfTemplate, PdfName)>
	//   15   29:pop             
		return pdftemplate;
	//   16   30:aload           4
	//   17   32:areturn         
	}

	public void beginVariableText()
	{
		content.append("/Tx BMC ");
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ByteBuffer content>
	//    2    4:ldc1            #118 <String "/Tx BMC ">
	//    3    6:invokevirtual   #124 <Method ByteBuffer ByteBuffer.append(String)>
	//    4    9:pop             
	//    5   10:return          
	}

	public void endVariableText()
	{
		content.append("EMC ");
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ByteBuffer content>
	//    2    4:ldc1            #127 <String "EMC ">
	//    3    6:invokevirtual   #124 <Method ByteBuffer ByteBuffer.append(String)>
	//    4    9:pop             
	//    5   10:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #137 <Class PdfObject>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return accessibleAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public PdfDictionary getAdditional()
	{
		return additional;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field PdfDictionary additional>
	//    2    4:areturn         
	}

	public Rectangle getBoundingBox()
	{
		return bBox;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rectangle bBox>
	//    2    4:areturn         
	}

	public PdfIndirectReference getCurrentPage()
	{
		if(pageReference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field PdfIndirectReference pageReference>
	//*   2    4:ifnonnull       15
			return writer.getCurrentPage();
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field PdfWriter writer>
	//    5   11:invokevirtual   #149 <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//    6   14:areturn         
		else
			return pageReference;
	//    7   15:aload_0         
	//    8   16:getfield        #147 <Field PdfIndirectReference pageReference>
	//    9   19:areturn         
	}

	public PdfContentByte getDuplicate()
	{
		PdfTemplate pdftemplate = new PdfTemplate();
	//    0    0:new             #2   <Class PdfTemplate>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void PdfTemplate()>
	//    3    7:astore_1        
		pdftemplate.writer = writer;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field PdfWriter writer>
	//    7   13:putfield        #88  <Field PdfWriter writer>
		pdftemplate.pdf = pdf;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #156 <Field PdfDocument pdf>
	//   11   21:putfield        #156 <Field PdfDocument pdf>
		pdftemplate.thisReference = thisReference;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #94  <Field PdfIndirectReference thisReference>
	//   15   29:putfield        #94  <Field PdfIndirectReference thisReference>
		pdftemplate.pageResources = pageResources;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #74  <Field PageResources pageResources>
	//   19   37:putfield        #74  <Field PageResources pageResources>
		pdftemplate.bBox = new Rectangle(bBox);
	//   20   40:aload_1         
	//   21   41:new             #45  <Class Rectangle>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #50  <Field Rectangle bBox>
	//   25   49:invokespecial   #159 <Method void Rectangle(Rectangle)>
	//   26   52:putfield        #50  <Field Rectangle bBox>
		pdftemplate.group = group;
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #161 <Field PdfTransparencyGroup group>
	//   30   60:putfield        #161 <Field PdfTransparencyGroup group>
		pdftemplate.layer = layer;
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #163 <Field PdfOCG layer>
	//   34   68:putfield        #163 <Field PdfOCG layer>
		if(matrix != null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #165 <Field PdfArray matrix>
	//*  37   75:ifnull          93
			pdftemplate.matrix = new PdfArray(matrix);
	//   38   78:aload_1         
	//   39   79:new             #167 <Class PdfArray>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:getfield        #165 <Field PdfArray matrix>
	//   43   87:invokespecial   #170 <Method void PdfArray(PdfArray)>
	//   44   90:putfield        #165 <Field PdfArray matrix>
		pdftemplate.separator = separator;
	//   45   93:aload_1         
	//   46   94:aload_0         
	//   47   95:getfield        #173 <Field int separator>
	//   48   98:putfield        #173 <Field int separator>
		pdftemplate.additional = additional;
	//   49  101:aload_1         
	//   50  102:aload_0         
	//   51  103:getfield        #54  <Field PdfDictionary additional>
	//   52  106:putfield        #54  <Field PdfDictionary additional>
		pdftemplate.contentTagged = contentTagged;
	//   53  109:aload_1         
	//   54  110:aload_0         
	//   55  111:getfield        #52  <Field boolean contentTagged>
	//   56  114:putfield        #52  <Field boolean contentTagged>
		pdftemplate.duplicatedFrom = ((PdfContentByte) (this));
	//   57  117:aload_1         
	//   58  118:aload_0         
	//   59  119:putfield        #177 <Field PdfContentByte duplicatedFrom>
		return ((PdfContentByte) (pdftemplate));
	//   60  122:aload_1         
	//   61  123:areturn         
	}

	public PdfStream getFormXObject(int i)
		throws IOException
	{
		return ((PdfStream) (new PdfFormXObject(this, i)));
	//    0    0:new             #183 <Class PdfFormXObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #186 <Method void PdfFormXObject(PdfTemplate, int)>
	//    5    9:areturn         
	}

	public PdfTransparencyGroup getGroup()
	{
		return group;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field PdfTransparencyGroup group>
	//    2    4:areturn         
	}

	public float getHeight()
	{
		return bBox.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rectangle bBox>
	//    2    4:invokevirtual   #193 <Method float Rectangle.getHeight()>
	//    3    7:freturn         
	}

	public AccessibleElementId getId()
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field AccessibleElementId id>
	//*   2    4:ifnonnull       18
			id = new AccessibleElementId();
	//    3    7:aload_0         
	//    4    8:new             #197 <Class AccessibleElementId>
	//    5   11:dup             
	//    6   12:invokespecial   #198 <Method void AccessibleElementId()>
	//    7   15:putfield        #65  <Field AccessibleElementId id>
		return id;
	//    8   18:aload_0         
	//    9   19:getfield        #65  <Field AccessibleElementId id>
	//   10   22:areturn         
	}

	public PdfIndirectReference getIndirectReference()
	{
		if(thisReference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field PdfIndirectReference thisReference>
	//*   2    4:ifnonnull       18
			thisReference = writer.getPdfIndirectReference();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field PdfWriter writer>
	//    6   12:invokevirtual   #92  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//    7   15:putfield        #94  <Field PdfIndirectReference thisReference>
		return thisReference;
	//    8   18:aload_0         
	//    9   19:getfield        #94  <Field PdfIndirectReference thisReference>
	//   10   22:areturn         
	}

	public PdfOCG getLayer()
	{
		return layer;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field PdfOCG layer>
	//    2    4:areturn         
	}

	PdfArray getMatrix()
	{
		return matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field PdfArray matrix>
	//    2    4:areturn         
	}

	public PdfIndirectReference getPageReference()
	{
		return pageReference;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field PdfIndirectReference pageReference>
	//    2    4:areturn         
	}

	PageResources getPageResources()
	{
		return pageResources;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field PageResources pageResources>
	//    2    4:areturn         
	}

	PdfObject getResources()
	{
		return ((PdfObject) (getPageResources().getResources()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method PageResources getPageResources()>
	//    2    4:invokevirtual   #212 <Method PdfDictionary PageResources.getResources()>
	//    3    7:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field PdfName role>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int type>
	//    2    4:ireturn         
	}

	public float getWidth()
	{
		return bBox.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rectangle bBox>
	//    2    4:invokevirtual   #219 <Method float Rectangle.getWidth()>
	//    3    7:freturn         
	}

	public boolean isContentTagged()
	{
		return contentTagged;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean contentTagged>
	//    2    4:ireturn         
	}

	public boolean isInline()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isTagged()
	{
		return super.isTagged() && contentTagged;
	//    0    0:aload_0         
	//    1    1:invokespecial   #225 <Method boolean PdfContentByte.isTagged()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field boolean contentTagged>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #131 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #228 <Method void HashMap()>
	//    7   15:putfield        #63  <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setAdditional(PdfDictionary pdfdictionary)
	{
		additional = pdfdictionary;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field PdfDictionary additional>
	//    3    5:return          
	}

	public void setBoundingBox(Rectangle rectangle)
	{
		bBox = rectangle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field Rectangle bBox>
	//    3    5:return          
	}

	public void setContentTagged(boolean flag)
	{
		contentTagged = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean contentTagged>
	//    3    5:return          
	}

	public void setGroup(PdfTransparencyGroup pdftransparencygroup)
	{
		group = pdftransparencygroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field PdfTransparencyGroup group>
	//    3    5:return          
	}

	public void setHeight(float f)
	{
		bBox.setBottom(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rectangle bBox>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #241 <Method void Rectangle.setBottom(float)>
		bBox.setTop(f);
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field Rectangle bBox>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #244 <Method void Rectangle.setTop(float)>
	//    8   16:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setLayer(PdfOCG pdfocg)
	{
		layer = pdfocg;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field PdfOCG layer>
	//    3    5:return          
	}

	public void setMatrix(float f, float f1, float f2, float f3, float f4, float f5)
	{
		matrix = new PdfArray();
	//    0    0:aload_0         
	//    1    1:new             #167 <Class PdfArray>
	//    2    4:dup             
	//    3    5:invokespecial   #251 <Method void PdfArray()>
	//    4    8:putfield        #165 <Field PdfArray matrix>
		matrix.add(((PdfObject) (new PdfNumber(f))));
	//    5   11:aload_0         
	//    6   12:getfield        #165 <Field PdfArray matrix>
	//    7   15:new             #253 <Class PdfNumber>
	//    8   18:dup             
	//    9   19:fload_1         
	//   10   20:invokespecial   #255 <Method void PdfNumber(float)>
	//   11   23:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   12   26:pop             
		matrix.add(((PdfObject) (new PdfNumber(f1))));
	//   13   27:aload_0         
	//   14   28:getfield        #165 <Field PdfArray matrix>
	//   15   31:new             #253 <Class PdfNumber>
	//   16   34:dup             
	//   17   35:fload_2         
	//   18   36:invokespecial   #255 <Method void PdfNumber(float)>
	//   19   39:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   20   42:pop             
		matrix.add(((PdfObject) (new PdfNumber(f2))));
	//   21   43:aload_0         
	//   22   44:getfield        #165 <Field PdfArray matrix>
	//   23   47:new             #253 <Class PdfNumber>
	//   24   50:dup             
	//   25   51:fload_3         
	//   26   52:invokespecial   #255 <Method void PdfNumber(float)>
	//   27   55:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   28   58:pop             
		matrix.add(((PdfObject) (new PdfNumber(f3))));
	//   29   59:aload_0         
	//   30   60:getfield        #165 <Field PdfArray matrix>
	//   31   63:new             #253 <Class PdfNumber>
	//   32   66:dup             
	//   33   67:fload           4
	//   34   69:invokespecial   #255 <Method void PdfNumber(float)>
	//   35   72:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   36   75:pop             
		matrix.add(((PdfObject) (new PdfNumber(f4))));
	//   37   76:aload_0         
	//   38   77:getfield        #165 <Field PdfArray matrix>
	//   39   80:new             #253 <Class PdfNumber>
	//   40   83:dup             
	//   41   84:fload           5
	//   42   86:invokespecial   #255 <Method void PdfNumber(float)>
	//   43   89:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   44   92:pop             
		matrix.add(((PdfObject) (new PdfNumber(f5))));
	//   45   93:aload_0         
	//   46   94:getfield        #165 <Field PdfArray matrix>
	//   47   97:new             #253 <Class PdfNumber>
	//   48  100:dup             
	//   49  101:fload           6
	//   50  103:invokespecial   #255 <Method void PdfNumber(float)>
	//   51  106:invokevirtual   #259 <Method boolean PdfArray.add(PdfObject)>
	//   52  109:pop             
	//   53  110:return          
	}

	public void setPageReference(PdfIndirectReference pdfindirectreference)
	{
		pageReference = pdfindirectreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field PdfIndirectReference pageReference>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field PdfName role>
	//    3    5:return          
	}

	public void setWidth(float f)
	{
		bBox.setLeft(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rectangle bBox>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #266 <Method void Rectangle.setLeft(float)>
		bBox.setRight(f);
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field Rectangle bBox>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #269 <Method void Rectangle.setRight(float)>
	//    8   16:return          
	}

	public static final int TYPE_IMPORTED = 2;
	public static final int TYPE_PATTERN = 3;
	public static final int TYPE_TEMPLATE = 1;
	protected HashMap accessibleAttributes;
	private PdfDictionary additional;
	protected Rectangle bBox;
	protected boolean contentTagged;
	protected PdfTransparencyGroup group;
	private AccessibleElementId id;
	protected PdfOCG layer;
	protected PdfArray matrix;
	protected PdfIndirectReference pageReference;
	protected PageResources pageResources;
	protected PdfName role;
	protected PdfIndirectReference thisReference;
	protected int type;
}
