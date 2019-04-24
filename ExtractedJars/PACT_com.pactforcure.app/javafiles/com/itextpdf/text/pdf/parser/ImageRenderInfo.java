// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.*;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfImageObject, InlineImageInfo, GraphicsState, Matrix, 
//			Vector

public class ImageRenderInfo
{

	private ImageRenderInfo(GraphicsState graphicsstate, PdfIndirectReference pdfindirectreference, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		imageObject = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field PdfImageObject imageObject>
		gs = graphicsstate;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field GraphicsState gs>
		ref = pdfindirectreference;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #25  <Field PdfIndirectReference ref>
		inlineImageInfo = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #27  <Field InlineImageInfo inlineImageInfo>
		colorSpaceDictionary = pdfdictionary;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #29  <Field PdfDictionary colorSpaceDictionary>
	//   17   29:return          
	}

	private ImageRenderInfo(GraphicsState graphicsstate, InlineImageInfo inlineimageinfo, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		imageObject = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field PdfImageObject imageObject>
		gs = graphicsstate;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field GraphicsState gs>
		ref = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field PdfIndirectReference ref>
		inlineImageInfo = inlineimageinfo;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #27  <Field InlineImageInfo inlineImageInfo>
		colorSpaceDictionary = pdfdictionary;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #29  <Field PdfDictionary colorSpaceDictionary>
	//   17   29:return          
	}

	protected static ImageRenderInfo createForEmbeddedImage(GraphicsState graphicsstate, InlineImageInfo inlineimageinfo, PdfDictionary pdfdictionary)
	{
		return new ImageRenderInfo(graphicsstate, inlineimageinfo, pdfdictionary);
	//    0    0:new             #2   <Class ImageRenderInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #35  <Method void ImageRenderInfo(GraphicsState, InlineImageInfo, PdfDictionary)>
	//    6   10:areturn         
	}

	public static ImageRenderInfo createForXObject(GraphicsState graphicsstate, PdfIndirectReference pdfindirectreference, PdfDictionary pdfdictionary)
	{
		return new ImageRenderInfo(graphicsstate, pdfindirectreference, pdfdictionary);
	//    0    0:new             #2   <Class ImageRenderInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #39  <Method void ImageRenderInfo(GraphicsState, PdfIndirectReference, PdfDictionary)>
	//    6   10:areturn         
	}

	private void prepareImageObject()
		throws IOException
	{
		if(imageObject == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field PdfImageObject imageObject>
	//*   2    4:ifnull          8
	//*   3    7:return          
		{
			if(ref != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #25  <Field PdfIndirectReference ref>
	//*   6   12:ifnull          41
			{
				imageObject = new PdfImageObject((PRStream)PdfReader.getPdfObject(((com.itextpdf.text.pdf.PdfObject) (ref))), colorSpaceDictionary);
	//    7   15:aload_0         
	//    8   16:new             #44  <Class PdfImageObject>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field PdfIndirectReference ref>
	//   12   24:invokestatic    #50  <Method com.itextpdf.text.pdf.PdfObject PdfReader.getPdfObject(com.itextpdf.text.pdf.PdfObject)>
	//   13   27:checkcast       #52  <Class PRStream>
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field PdfDictionary colorSpaceDictionary>
	//   16   34:invokespecial   #55  <Method void PdfImageObject(PRStream, PdfDictionary)>
	//   17   37:putfield        #21  <Field PdfImageObject imageObject>
				return;
	//   18   40:return          
			}
			if(inlineImageInfo != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #27  <Field InlineImageInfo inlineImageInfo>
	//*  21   45:ifnull          7
			{
				imageObject = new PdfImageObject(inlineImageInfo.getImageDictionary(), inlineImageInfo.getSamples(), colorSpaceDictionary);
	//   22   48:aload_0         
	//   23   49:new             #44  <Class PdfImageObject>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:getfield        #27  <Field InlineImageInfo inlineImageInfo>
	//   27   57:invokevirtual   #61  <Method PdfDictionary InlineImageInfo.getImageDictionary()>
	//   28   60:aload_0         
	//   29   61:getfield        #27  <Field InlineImageInfo inlineImageInfo>
	//   30   64:invokevirtual   #65  <Method byte[] InlineImageInfo.getSamples()>
	//   31   67:aload_0         
	//   32   68:getfield        #29  <Field PdfDictionary colorSpaceDictionary>
	//   33   71:invokespecial   #68  <Method void PdfImageObject(PdfDictionary, byte[], PdfDictionary)>
	//   34   74:putfield        #21  <Field PdfImageObject imageObject>
				return;
	//   35   77:return          
			}
		}
	}

	public float getArea()
	{
		return gs.ctm.getDeterminant();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GraphicsState gs>
	//    2    4:getfield        #77  <Field Matrix GraphicsState.ctm>
	//    3    7:invokevirtual   #82  <Method float Matrix.getDeterminant()>
	//    4   10:freturn         
	}

	public BaseColor getCurrentFillColor()
	{
		return gs.fillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GraphicsState gs>
	//    2    4:getfield        #88  <Field BaseColor GraphicsState.fillColor>
	//    3    7:areturn         
	}

	public PdfImageObject getImage()
		throws IOException
	{
		prepareImageObject();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void prepareImageObject()>
		return imageObject;
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field PdfImageObject imageObject>
	//    4    8:areturn         
	}

	public Matrix getImageCTM()
	{
		return gs.ctm;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GraphicsState gs>
	//    2    4:getfield        #77  <Field Matrix GraphicsState.ctm>
	//    3    7:areturn         
	}

	public PdfIndirectReference getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PdfIndirectReference ref>
	//    2    4:areturn         
	}

	public Vector getStartPoint()
	{
		return (new Vector(0.0F, 0.0F, 1.0F)).cross(gs.ctm);
	//    0    0:new             #100 <Class Vector>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:fconst_1        
	//    5    7:invokespecial   #103 <Method void Vector(float, float, float)>
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field GraphicsState gs>
	//    8   14:getfield        #77  <Field Matrix GraphicsState.ctm>
	//    9   17:invokevirtual   #107 <Method Vector Vector.cross(Matrix)>
	//   10   20:areturn         
	}

	private final PdfDictionary colorSpaceDictionary;
	private final GraphicsState gs;
	private PdfImageObject imageObject;
	private final InlineImageInfo inlineImageInfo;
	private final PdfIndirectReference ref;
}
