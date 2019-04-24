// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.Collection;
import java.util.HashSet;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfOCG, PdfName, PdfArray, 
//			PdfWriter, PdfLayer, PdfIndirectReference, PdfObject, 
//			PdfVisibilityExpression

public class PdfLayerMembership extends PdfDictionary
	implements PdfOCG
{

	public PdfLayerMembership(PdfWriter pdfwriter)
	{
		super(PdfName.OCMD);
	//    0    0:aload_0         
	//    1    1:getstatic       #47  <Field PdfName PdfName.OCMD>
	//    2    4:invokespecial   #50  <Method void PdfDictionary(PdfName)>
		members = new PdfArray();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class PdfArray>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void PdfArray()>
	//    7   15:putfield        #56  <Field PdfArray members>
		layers = new HashSet();
	//    8   18:aload_0         
	//    9   19:new             #58  <Class HashSet>
	//   10   22:dup             
	//   11   23:invokespecial   #59  <Method void HashSet()>
	//   12   26:putfield        #61  <Field HashSet layers>
		put(PdfName.OCGS, ((PdfObject) (members)));
	//   13   29:aload_0         
	//   14   30:getstatic       #64  <Field PdfName PdfName.OCGS>
	//   15   33:aload_0         
	//   16   34:getfield        #56  <Field PdfArray members>
	//   17   37:invokevirtual   #68  <Method void put(PdfName, PdfObject)>
		ref = pdfwriter.getPdfIndirectReference();
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #74  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   21   45:putfield        #76  <Field PdfIndirectReference ref>
	//   22   48:return          
	}

	public void addMember(PdfLayer pdflayer)
	{
		if(!layers.contains(((Object) (pdflayer))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field HashSet layers>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #82  <Method boolean HashSet.contains(Object)>
	//*   4    8:ifne            32
		{
			members.add(((PdfObject) (pdflayer.getRef())));
	//    5   11:aload_0         
	//    6   12:getfield        #56  <Field PdfArray members>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #87  <Method PdfIndirectReference PdfLayer.getRef()>
	//    9   19:invokevirtual   #91  <Method boolean PdfArray.add(PdfObject)>
	//   10   22:pop             
			layers.add(((Object) (pdflayer)));
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field HashSet layers>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #93  <Method boolean HashSet.add(Object)>
	//   15   31:pop             
		}
	//   16   32:return          
	}

	public Collection getLayers()
	{
		return ((Collection) (layers));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field HashSet layers>
	//    2    4:areturn         
	}

	public PdfObject getPdfObject()
	{
		return ((PdfObject) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public PdfIndirectReference getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field PdfIndirectReference ref>
	//    2    4:areturn         
	}

	public void setVisibilityExpression(PdfVisibilityExpression pdfvisibilityexpression)
	{
		put(PdfName.VE, ((PdfObject) (pdfvisibilityexpression)));
	//    0    0:aload_0         
	//    1    1:getstatic       #104 <Field PdfName PdfName.VE>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setVisibilityPolicy(PdfName pdfname)
	{
		put(PdfName.P, ((PdfObject) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getstatic       #108 <Field PdfName PdfName.P>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public static final PdfName ALLOFF = new PdfName("AllOff");
	public static final PdfName ALLON = new PdfName("AllOn");
	public static final PdfName ANYOFF = new PdfName("AnyOff");
	public static final PdfName ANYON = new PdfName("AnyOn");
	HashSet layers;
	PdfArray members;
	PdfIndirectReference ref;

	static 
	{
	//    0    0:new             #22  <Class PdfName>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "AllOn">
	//    3    6:invokespecial   #28  <Method void PdfName(String)>
	//    4    9:putstatic       #30  <Field PdfName ALLON>
	//    5   12:new             #22  <Class PdfName>
	//    6   15:dup             
	//    7   16:ldc1            #32  <String "AnyOn">
	//    8   18:invokespecial   #28  <Method void PdfName(String)>
	//    9   21:putstatic       #34  <Field PdfName ANYON>
	//   10   24:new             #22  <Class PdfName>
	//   11   27:dup             
	//   12   28:ldc1            #36  <String "AnyOff">
	//   13   30:invokespecial   #28  <Method void PdfName(String)>
	//   14   33:putstatic       #38  <Field PdfName ANYOFF>
	//   15   36:new             #22  <Class PdfName>
	//   16   39:dup             
	//   17   40:ldc1            #40  <String "AllOff">
	//   18   42:invokespecial   #28  <Method void PdfName(String)>
	//   19   45:putstatic       #42  <Field PdfName ALLOFF>
	//*  20   48:return          
	}
}
